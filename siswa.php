<?php 
include('koneksi.php');

$sql = "SELECT * FROM siswa INNER JOIN kelas ON siswa.id_kelas = kelas.id_kelas";

$query = mysqli_query($conn,$sql);

if(mysqli_num_rows($query) > 0){
    while($row = mysqli_fetch_object($query)){
        $data['status'] = true;
        $data['Data Siswa'][] = $row;

        // $data2 = respond(true, $row);
    }
}else{
    $data['status'] = false;
    $data['Data Siswa'][] = "Data not Found";
}

print_r(json_encode($data));
?>