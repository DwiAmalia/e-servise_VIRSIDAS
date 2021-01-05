<?php 
include('koneksi.php');

$sql = "SELECT jadwal.mulai, hari.nama, mapel.nama, jadwal.rincian
FROM jadwal, mapel, hari
where mapel.id = jadwal.mapel and hari.id = jadwal.hari and hari.nama='Rabu'"
;

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