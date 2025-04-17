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






























?>












