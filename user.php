<?php 
include('koneksi.php');

$sql = "SELECT * FROM user INNER JOIN siswa ON user.siswa = siswa.id
INNER JOIN guru ON user.guru = guru.id"
;

$query = mysqli_query($conn,$sql);

if(mysqli_num_rows($query) > 0){
    while($row = mysqli_fetch_object($query)){
        $data['status'] = true;
        $data['Data user'][] = $row;

        // $data2 = respond(true, $row);
    }
}else{
    $data['status'] = false;
    $data['Data user'][] = "Data not Found";
}

print_r(json_encode($data));
?>