<?php 
include('koneksi.php');

$sql = "SELECT * FROM rapor
INNER JOIN mapel ON rapor.id_mapel = mapel.id_mapel
INNER JOIN siswa ON rapor.id_siswa = siswa.id_siswa
INNER JOIN guru ON rapor.id_guru = guru.id_guru";

$query = mysqli_query($conn,$sql);

if(mysqli_num_rows($query) > 0){
    while($row = mysqli_fetch_object($query)){
        $data['status'] = true;
        $data['Data Raport'][] = $row;

        // $data2 = respond(true, $row);
    }
}else{
    $data['status'] = false;
    $data['Data Raport'][] = "Data not Found";
}

print_r(json_encode($data));
?>