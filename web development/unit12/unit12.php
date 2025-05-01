<?php
// Server-Side Programming with PHP – II

/*
Functions and arrays are two useful programming concepts in any programming as well as scripting
language. In simple terms, an array is a special variable with a unique name, which can hold more than
one value, at a time. On the other hand, a function is a block of code with a unique name, which can be
reused again and again. If required a function can be called by another function. 
*/

/*
reat question! Once you've extracted PHP (e.g., into C:\php), here’s exactly what to do after extraction to get it fully working:

✅ After Extracting PHP Folder
1️⃣ Rename and Organize (optional but clean)
Extracted folder might look like: php-8.x.x-Win32-vs16-x64

Rename it simply to: php

Move it to: C:\php
So your full path is: C:\php

2️⃣ Set Up PHP in System PATH
This lets you run php from anywhere in the command line.

Press Win + S → search: Environment Variables

Click: "Edit the system environment variables"

In the System Properties window, click Environment Variables

Under System variables, find Path and click Edit

Click New, then add this:



3️⃣ Test It Works
Open a new Command Prompt (important! So it refreshes the PATH)

cmd
Copy code
php -v
If it shows something like:

scss
Copy code
PHP 8.x.x (cli) (built: ...)
🎉 Congrats! PHP is now set up. 
*/

/*
php functions php functions
 User-Defined Functions 
 ikso k ander hi sare codes honge does not topics
 header('Content-Type: text/html; charset=utf-8');
 
User-Defined Function
*/

function getFortune() {
    $fortunes = [
        "You will have a great day! 🌞",
        "Something exciting is coming your way! 🎉",
        "Be kind, and you'll attract kindness. 💖",
        "Luck is on your side today! 🍀",
        "A new opportunity will knock soon. 🚪",
        "Adventure awaits you this weekend! 🏞️"
    ];

    // Pick a random fortune
    $index = array_rand($fortunes);
    return $fortunes[$index];
}

echo "<h2>Your Fortune Cookie Says:</h2>";
echo "<p>" . getFortune() . "</p>";

//Passing Arguments by Reference
function incrementValue(&$num){
    $num++;
    echo "value inside function:" .$num . "<br>";
}

$number = 5;
echo "original value before fucntion cell:" .$number ."<br>";

incrementValue($number);
echo "original value after function call:" .$number ."<br>";

/*function square($number){
    return $number * $number;
}

$num = 56;
echo "Square of $num is " . square($num);*/


// other common mathematical function 
/*
echo sqrt(15626). "\n";
echo pow(2,15626) . "\n"; //INF means Infinity in PHP due to number limit)
echo abs(-15626) . "\n";
echo round(4516.15626) . "\n";
echo ceil(45.315626) . "\n";
echo floor(426.15626) . "\n";
echo rand(1,15626) . "\n";
*/

/*
Array functions allow us to manipulate arrays. PHP supports both simple and multi-dimensional arrays.
There are some specific functions for populating arrays from results retrieved from the database
queries
*/

/*
$arr =[5,8,7];
echo "count" . count($arr);

array_push($arr, 4, 5);

echo "after push:";
print_r($arr);

array_pop($arr);
print_r($arr);

array_shift($arr);
print_r($arr);

array_unshift($arr, 0);
print_r($arr);

echo"\n searching and checking \n";
echo " is 3 in array?" . (in_array(3, $arr) ? "found" : "not found" . "\n");
echo "index of 3" . array_search(3, $arr) . "\n";

echo "soriting functions \n ";
$sortArr = [2,3,4,5];
sort($sortArr);
echo "sorted (ascending): ";
print_r($sortArr);

rsort($sortArr);
echo "sorted (descending)";
print_r($sortArr);

$assocArr =["a" =>5, "b"=>4, "c" => 3];
asort($assocArr);

print_r($assocArr); //associated sorted by key:

//combining and spiliting 
$a = [4,5,6,6,64,];
$b = [445,556,6784,6,64,];
$c = array_merge($a, $b);
print_r($c); // merged array
$str = "aam,saib,amrud,aanar";
$arrStr = explode(",", $str);
print_r($arrStr); // exploded array

$imploded = implode("-", $arrStr);
echo "imploded string : $imploded\n";


//advanced functions
$num = [8, 97, 856, 45];

// Squaring using array_map
$squares = array_map(fn($n) => $n * $n, $num);
print_r($squares); // Squaring numbers

// Filtering even numbers using array_filter
$even = array_filter($num, fn($n) => $n % 2 == 0);
print_r($even); // Even numbers

// Summing numbers using array_reduce
$sum = array_reduce($num, fn($carry, $item) => $carry + $item, 0); // Starting from 0
echo "Sum: $sum\n"; // Sum of the numbers
*/

//built in functions
//mathematical functions
/*echo abs(-10);
echo "<br> abs(-10)</br>" . abs(-10) . "<br>";
echo "<br> sqrt(16)</br>" . sqrt(16) . "<br>";
echo "<br> pow(2,3)</br>" . pow(2,3) . "<br>";
echo "<br> round(3.6)</br>" . round(3.6) . "<br>";
echo "<br> floor(4.6)</br>" . floor(4.6) . "<br>";
echo "<br> ceil(4.1)</br>" . ceil(4.1) . "<br>";
echo "<br> rand()</br>" . rand() . "<br>";
echo "<br> rand(-1,10)</br>" . rand(-1,10) . "<br>";
echo "<br> pi()</br>" . pi() . "<br>";
echo "<br> sin(pi()/2)" . sin(pi()/2) . "<br>";*/
//array functions (done in code)

//string
//String Manipulation Functions
/*echo "<h2> php string manipulation functions</h2>";
$text = "chomu ram";
echo "<b> original string </b> $text'<br><br>";
echo "<br>trim():</br>" . trim($text) . "<br>";
echo "<br>strlen():</br>" . strlen($text) . "<br>";
echo "<br>strtolower():</br>" . strtolower($text) . "<br>";
echo "<br>strtoupper():</br>" . strtoupper($text) . "<br>";
echo "<br>ucfirst():</br>" . ucfirst($text) . "<br>";
echo "<br>strrev():</br>" . strrev($text) . "<br>";
echo "<br>strpos():</br>" . strpos($text, "nitinkp") . "<br>";
echo "<br>str_replace():</br>" . str_replace("nitinkp","291@",$text) . "<br>";
echo "<br>substr():</br>" . substr($text,0,5) . "<br>";
$array = explode(" ", trim($text));
echo "<br>explode():</br> array after splitting the string by space";
echo "<pre>";
print_r($array);
echo "</pre>";
echo"<br>";
echo "<br>implode():</br>" . implode(" ", $array) . "<br>";
echo "<br>str_pad():</br>" . str_pad("chomulaal ",15, "*"). "<br>";
echo "<br>str_repeat():</br>" . str_repeat("hello", 3) . "<br>";
echo "<br>ord():</b>" . ord("A") . "<br>";*/


//form processing
//Submitting the Form Data
//Using the get() Method
//Using the post() Method
//html file b h git hub mai

// GET method processing
echo "<h2>Data Received via GET</h2>";
if (isset($_GET['name']) && isset($_GET['age'])) {
    $name = $_GET['name'];
    $age = $_GET['age'];
    echo "Name: " . $name . "<br>";
    echo "Age: " . $age . "<br>";
} else {
    echo "Name: <br>";
    echo "Age: <br>";
}

// POST method processing
echo "<h2>Data Received via POST</h2>";
if (isset($_POST['name']) && isset($_POST['age'])) {
    $name = $_POST['name'];
    $age = $_POST['age'];
    echo "Name: " . $name . "<br>";
    echo "Age: " . $age . "<br>";
} else {
    echo "Name: <br>";
    echo "Age: <br>";
}




//Retrieving the Form Data
echo "<h2>Data Received via GET</h2>";

if (isset($_GET['name']) && isset($_GET['age']) && $_GET['name'] !== '' && $_GET['age'] !== '') {
    $name = htmlspecialchars($_GET['name']);
    $age = htmlspecialchars($_GET['age']);

    echo "Name: " . $name . "<br>";
    echo "Age: " . $age . "<br>";
} else {
    echo "Please submit the form.<br>";
}
//isme ek folder banao usme sare files rkho html aur php dono and move this folder to xampp>htdocs then run html file first and enter the inputs and u will see ansers show which u entered when u run html file 
//The $_GET[] Function (uper wala isse se kia h )



//The $_POST[] Function
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Retrieve form values using $_POST[]
    $name = $_POST['name'];
    $email = $_POST['email'];
    $message = $_POST['message'];

    // Display the submitted data
    echo "<h2>Form Submitted Successfully!</h2>";
    echo "<p><strong>Name:</strong> " . htmlspecialchars($name) . "</p>";
    echo "<p><strong>Email:</strong> " . htmlspecialchars($email) . "</p>";
    echo "<p><strong>Message:</strong> " . nl2br(htmlspecialchars($message)) . "</p>";

    echo "<br><a href='post.php'>Go back to the form</a>";
} else {
    // Show the form if it's not submitted yet
    ?>
    <!DOCTYPE html>
    <html>
    <head>
        <title>Contact Us</title>
    </head>
    <body>
        <h2>Contact Us</h2>
        <form method="POST" action="post.php">
            Name: <input type="text" name="name" required><br><br>
            Email: <input type="email" name="email" required><br><br>
            Message:<br>
            <textarea name="message" rows="5" cols="40" required></textarea><br><br>
            <input type="submit" value="Send Message">
        </form>
    </body>
    </html>
    <?php
}


//Using the $_REQUEST[ ] Function
if($_SERVER["REQUEST_METHOD"] == "POST"){
    $name = $_REQUEST['name'];
    $email = $_REQUEST['email'];
    
    $message = $_REQUEST['message'];
    
    echo "<h2> form submitted successfully using request</h2>";
    echo "<p> <strong>Name:</strong>" . htmlspecialchars($name) . "</p>";
    echo "<p> <strong>Email:</strong>" . htmlspecialchars($email) . "</p>";
    echo "<p> <strong>Message:</strong>" . htmlspecialchars($message) . "</p>";
    echo "<br><a href='request.php'> go back form </a>";


}else {
    ?>

    <!DOCTYPE html>
    <html>
    <head>
    <title>contact us</title>
    </head>
    <body>
    <h2>contact us (using request)</h2>
    <form method="POST" action="request.php">
    Name:<input type="text" name="name" required><br>
    Email:<input type="email" name="email" required><br>
    message:
    <br>
    <textarea name="message" rows="5" cols="40" required> </textarea><br>
    
    <input type="submit" values="send Message" required><br>
    </form>
    </body>
    </html>

    <?php
}








//Using the SERVER [‘REQUEST_METHOD’] Method
if($_SERVER["REQUEST_METHOD"] == "POST"){
    $name = $_REQUEST['name'];
    $email = $_REQUEST['email'];
    
    $message = $_REQUEST['message'];
    
    echo "<h2> Data Retrieved using SERVER['REQUEST_METHOD']!</h2>";
    echo "<p> <strong>Name:</strong>" . htmlspecialchars($name) . "</p>";
    echo "<p> <strong>Email:</strong>" . htmlspecialchars($email) . "</p>";
    echo "<p> <strong>Message:</strong>" . htmlspecialchars($message) . "</p>";
    echo "<br><a href='server_request_method.php'> go back form </a>";


}else {
    ?>

    <!DOCTYPE html>
    <html>
    <head>
    <title>contact us</title>
    </head>
    <body>
    <h2>contact us  using SERVER['REQUEST_METHOD']!</h2>
    <form method="POST" action="server_request_method.php">
    Name:<input type="text" name="name" required><br>
    Email:<input type="email" name="email" required><br>
    message:
    <br>
    <textarea name="message" rows="5" cols="40" required> </textarea><br>
    
    <input type="submit" values="send Message" required><br>
    </form>
    </body>
    </html>

    <?php
}




//FILE UPLOADS
/*
You can upload files on a web server using a PHP script. Initially, files are uploaded into a temporary
given in the upload_tmp_dir parameter and then uploaded on the server. You can set the size limit of
the file to be uploaded by using the upload_max_filesize parameter. These parameters are available in
the PHP configuration file php.ini.
*/
// Enable error reporting for debugging
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Define the target directory for file uploads
    $target_dir = "uploads/";

    // Check if the uploads directory exists, if not, create it
    if (!is_dir($target_dir)) {
        mkdir($target_dir, 0777, true);  // 0777 sets full write permissions
    }

    // Get file information
    $file_name = basename($_FILES["myfile"]["name"]);
    $target_file = $target_dir . time() . "_" . $file_name;
    $file_size = $_FILES["myfile"]["size"];
    $file_tmp_name = $_FILES["myfile"]["tmp_name"];
    $file_error = $_FILES["myfile"]["error"];

    // Allowed file types (modify as per your needs)
    $allowed_types = ["image/jpeg", "image/png", "application/pdf"];  // Add more if needed
    $file_type = mime_content_type($file_tmp_name);

    // Check if the file type is allowed
    if (!in_array($file_type, $allowed_types)) {
        echo "Sorry, only JPG, PNG, and PDF files are allowed.";
        exit;
    }

    // Check file size (example: 5MB)
    if ($file_size > 5 * 1024 * 1024) {
        echo "Sorry, your file is too large. Maximum file size is 5MB.";
        exit;
    }

    // Check for any errors during file upload
    if ($file_error !== 0) {
        echo "Upload failed with error code: " . $file_error;
    } elseif (move_uploaded_file($file_tmp_name, $target_file)) {
        echo "File <strong>" . htmlspecialchars($file_name) . "</strong> uploaded successfully.";
    } else {
        echo "Sorry, there was an error uploading your file.";
    }

    echo "<br><a href='file_upload_php.php'>Upload another file</a>";
}
// kaafi try kia but one file submit krne k baad another file submit nhi ,firse add krne k lia html to dubara run krna pd rha h

// DATES AND TIME ZONE
 echo "Default Time Zone: " . date_default_timezone_get() . "<br>";

// Set a new default time zone
date_default_timezone_set("Asia/Kolkata");

// Get the updated default time zone
echo "Updated Time Zone: " . date_default_timezone_get() . "<br>";

// Display current date and time in the new time zone
echo "Current Date and Time: " . date("Y-m-d H:i:s");

// WORKING WITH REGULAR EXPRESSIONS
// Searching a String using Regular Expression
$text = "Welcome to E-Library!";
$pattern = "/E-Library/";

if (preg_match($pattern, $text)) {
    echo "Match found!";
} else {
    echo "Match not found.";
}
//Replacing Strings using Regular Expressions
$text = "The book number is 12345.";
$pattern = "/\d+/";
$replacement = "[number removed]";

$result = preg_replace($pattern, $replacement, $text);
echo $result;

// THE INCLUDE AND REQUIRE
/*The include and require statements allow to add code of a specified file into the file containing the
include or require statements. These statements are very useful when you want to use the same code
several times in a script or web page. The difference between these two statements is that the include
statement produces only a warning and the script will continue executing, on the other hands, the
require statement produces a fatal error and stops the script execution. 

include	Includes and evaluates a file. If the file is missing, it gives a warning and continues execution.
require	Includes and evaluates a file. If the file is missing, it gives a fatal error and stops execution.*/
include "header.php";
echo "welcome to main page "; 
// main.php
echo "<h2> this is the header  </h2>"; // header.php

//EXCEPTION HANDLING
function divide($a, $b){
    if($b == 0){
        throw new Exception("division by zero is not allowed");
    }
    return $a/$b;
}
try{
    echo divide(10,2);
    echo divide(10,0);
    
} catch (Exception $e){
    echo "error" . $e->getMessage();
}

//STATE MANAGEMENT (session ,cookies, query string)
/*
PHP allows us to store states of a website either on the server itself, or in the user’s browser. PHP provides
three different techniques to manage states:*/
//session
 session_start();
$_SESSION["username"] = "E-Library";
echo "welcome," .$_SESSION["username"];

//Cookies
setcookie("user", "E-library", time()+(86400*7), "/");
if(isset($_COOKIE["user"])){
    echo "welcome back, " .$_COOKIE["user"];
}else{
    echo "hello, new visitor";
}
//Query String
<a href="header.php?name=E-Library">Click Here</a> // isko php k bahar likha in file.php 
$name = $_GET['name'];
echo "welcome , $name"; //header.php

/*
OBJECT ORIENTED PROGRAMMING
*/
// Creating a Class
class Student {
    public $name;
    public $course;

    // Constructor to initialize properties
    public function __construct($name, $course) {
        $this->name = $name;
        $this->course = $course;
    }

    // Method to display student info
    public function introduce() {
        echo "Hello, I am " . $this->name . " and I am studying " . $this->course . ".<br>";
    }
}

// Instantiating Class
$student1 = new Student("Nitin", "BCA");
$student2 = new Student("KP", "Math Honours");

// Calling method to show output
$student1->introduce();
$student2->introduce(); 






//LAB EXERCISE
//Write a PHP program to store current date-time in a COOKIE and display the ‘Last visited on’ datetime on the web page upon reopening of the same page.
//Set a cookie with the current date and time.
//On page reload, show the last visit time (from the cookie).
$visit_time = date("Y-m-d H:i:s");
if(isset($_COOKIE['last_visit'])){
    echo "last visited on " . $_COOKIE['last_visit'] . "<br>";
}else{
    echo "this is your first visit <br>";
}
setcookie("last_visit", $visit_time, time()+ (30*24*60));
//Write a PHP program to store page views count in SESSION, to increment the count on each refresh, and to show the count on web page
session_start();
if(!isset($_SESSION['views'])){
    $_SESSION['views'] = 1;
    echo "welcome this is your first visit";
}else{
    $_SESSION['views'] +=1;
    echo "you have refreshed this page " . $_SESSION['views'] . "tiems";
}




























?>












