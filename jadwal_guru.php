<?php 
include('koneksi.php');

$sql = "SELECT jadwal.kelas, mapel.nama, jadwal.rincian, jadwal.mulai
FROM siswa, jadwal, mapel, guru
where siswa.kelas = jadwal.kelas and mapel.id = jadwal.mapel";

$query = mysqli_query($conn,$sql);

if(mysqli_num_rows($query) > 0){
    while($row = mysqli_fetch_object($query)){
        $data['status'] = true;
        $data['Data Jadwal'][] = $row;

        // $data2 = respond(true, $row);
    }
}else{
    $data['status'] = false;
    $data['Data Jadwal'][] = "Data not Found";
}

print_r(json_encode($data));


?>