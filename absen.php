<?php 
include('koneksi.php');

$sql = "SELECT * FROM absen INNER JOIN jadwal ON absen.jadwal = jadwal.id
INNER JOIN siswa ON absen.siswa = siswa.id"
;

$query = mysqli_query($conn,$sql);

if(mysqli_num_rows($query) > 0){
    while($row = mysqli_fetch_object($query)){
        $data['status'] = true;
        $data['Data Absen'][] = $row;

        // $data2 = respond(true, $row);
    }
}else{
    $data['status'] = false;
    $data['Data Absen'][] = "Data not Found";
}

print_r(json_encode($data));


?>