<?php 
$hostname = 'localhost';
$username = 'root';
$password = '';
$database = 'virsidas';

$conn = mysqli_connect($hostname,$username,$password,$database);
if(!$conn){
	echo "gagal";
}
?>