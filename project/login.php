<?php

session_start();



$user1="daniel";
$user2="kay";
$user3="phenyo";



$password = "password";
if($_POST["Password"] == $password)
{
  echo "password match";
}
else {

echo "password dont match";

}

 ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
</head>
<body>
    

<div class="container">
<h2>Login</h2>
<form action="form.php" method="post">

<label for="username">Username:</label>
<input type="text"  name="Username" required>

<label for="password">Password:</label>
<input type="password"  name="Password" required>

<button type="submit">Submit</button>
</form>
</div>


</body>
</html>