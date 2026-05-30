<?php

if(isset($_POST["submit"])){

 $name=$_POST["name"];
 $username=$_POST["username"];
 $email=$_POST["email"];
 $password=$_POST["password"];
 $confirmpassword=$_POST["confirmpasword"];
}

else{

    if($password==$confirmpassword)
}
echo "password match";

else {

echo "password dont match";

}

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign-Up</title>
</head>
<body>
    
<div class="container">
<h2>Login</h2>
<form action="form.php" method="post">

<label for="name">Name:</label>
<input type="text"  name="name" required>

<label for="username">Username:</label>
<input type="text"  name="username" required>

<label for="email">Email:</label>
<input type="text"  name="email" required>

<label for="password">Password:</label>
<input type="password"  name="password" required>

<label for="confirmpassword">Username:</label>
<input type="password"  name="confirmpassword" required>

<button type="submit">Submit</button>
</form>
</div>


</body>
</html>