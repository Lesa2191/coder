<?php

$servername = "localhost";
$username = "username";
$password = "password";

// Create connection
$conn = new mysqli($servername, $username, $password);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

// Create database
$sql = "CREATE DATABASE myDB";
if ($conn->query($sql) === TRUE) {
  echo "Database created successfully";
} else {
  echo "Error creating database: " . $conn->error;
}

$conn->close();


// login


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
 <html lang="en" dir="ltr">
 <head>
   <meta charset="UTF-8">
   <link rel="stylesheet" href="style.css">
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
