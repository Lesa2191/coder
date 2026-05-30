<?php
$host = 'localhost';
$db = 'banking_system';
$user = 'root';
$pass = '123456789';

$connection = new mysqli($host, $user, $pass, $db);

if ($connection->connect_error) {
    die("Connection failed: " . $connection->connect_error);
}
?>
