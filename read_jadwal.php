<?php 
require_once 'koneksi.php'; 

$query = "SELECT * FROM jadwal INNER JOIN hari ON jadwal.id_hari = hari.id_hari
INNER JOIN mapel ON jadwal.id_mapel = mapel.id_mapel
INNER JOIN kelas ON jadwal.id_kelas = kelas.id_kelas
INNER JOIN guru ON jadwal.id_guru = guru.id_guru"
;

$result = mysqli_query($conn,$query);

$array = array();

while ($row  = mysqli_fetch_assoc($result))
{
	$array[] = $row; 
}


echo ($result) ? 
json_encode(array("kode" => 1, "result"=>$array)) :
json_encode(array("kode" => 0, "pesan"=>"data tidak ditemukan"));
?>