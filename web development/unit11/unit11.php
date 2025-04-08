/*
/* 
unit11 server side programming with php 1

Hypertext Preprocessor (PHP) is a server-side scripting language...
(detailed explanation)


$current_value = 5;
$value = $current_value;
$next_value = $value + 1;
echo "$next_value comes after $current_value";*/

// assigning a value to a variable by assign by reference method//
/*$name='Dreamtech_press';
$alt_name=&$name;
echo $alt_name; 
echo $name;*/

//constant (case sensitive,)//
//chatgpt example
//define("Site_name","constant_learning"); // define a constant
//echo "welcome to" . Site_name; // use constant

//strings
/*$firstname="nitin";
$secondname="kp";

$fullname= $firstname . " ". $secondname;
echo "my full name is $fullname.";*/

/*built in string functions
trim, substr, strpos(position), ucfirst(first letter  capital), substr_replace, strtoupper (string into uppercase)*/


/*data types
Z, float point numbers(Represents real numbers that include decimal place. PHP includes two
types of floating point numbers. The first is a simple numeric literal with a decimal point. The second
is a floating point number written in scientific notation. Scientific notation is in the form of [number]
E[exponent]. For example, 1.23, 0.003, -2.13, 0.214E2, -3.14E-3.
)
, boolean, string,array, 
object-To declare objects,
first you must declare a class of object. Then you need to instantiate the object. Objects also allow
you to create your own data types. You can define the data type in the object class, and then use the
data type in instances of that class.
resource -Represents a special data type, which stores references to functions and resources
external to PHP. The most common example of the resource data type is a database call.

NULL:-Represents a special data type that can have only one value, null. Null is not only a data type,
but also a keyword literal. A variable of the null data type is a variable that has no value assigned to it.
When no value is assigned to a variable, it is automatically assigned a value, null.
*/

/*$we_are='demo';
echo gettype($we_are);

$x=99.2;
echo gettype($x);

unset($we_are);// destroy variable
echo gettype($we_are);*/

# other functions
/*
is_bool() Tests if a variable holds a Boolean value
is_numeric() Tests if a variable holds a anumeric value
is_int() Tests if a variable holds an integer
is_float() Tests if a variable holds a floating-point value
is_string() Tests if a variable holds a string value
is_null() Tests if a variable holds a NULL value
is_array() Tests if a variable is an array
is_object() Tests if a variable is an object
*/


// decison making statements(conditional statements)
// 4 types (The if Statement ,The if-else Statement,if else if else ,switch case staetment)

//if 
/*$x = 1; // the <br> will not work in print with single quotes.

if ($x == 1) {
    print '$x is equal to 1 <br>';
    $x++;
    print 'now $x is equal to 2 <br>';
}*/

/* $x = 1;

if ($x == 1) {
    print "$x is equal to 1\n"; // \n use kr to break the line 
    $x++;
    print "now $x is equal to $x\n";
}*/


// The if-else Statement
/*$Mausam="barsaat";
if($Mausam=="garmi"){
    echo "ac ka asli test";
}
else if ($Mausam=="barsaat")
{
    echo "take a bath my friend";
}
else {
    echo "have a lallantop day !";
}*/



// nested if else 
/*$mark=85;
if($marks >= 60){
    echo "you passed";


    if($marks >= 0){
        echo "excellent score";} 
    elseif($marks >= 75){
        echo "great job";}
else{
    echo "good effort";}
}
else{
    echo "you failed next time mehnat kro";
}*/


//switch statement
/*$day = "Monday";
switch ($day){
    case "Monday":
        echo "sunday mr gya batao";

        break;
    case "Friday":
        echo "halfta khtm chutti";
        
        break;

    case "Sunday":
        echo "aaj to mauz hi mauz h";
    
        break;
    defalt:
    echo "mauz masti wala din gye";
     
     
}*/

//looping statement
//while
/*$x = 1;
while($x <= 5){
    echo "number: $x \n";
    $x++;
}*/


//do while
/*$x = 1;
do {
    echo "count: $x \n";
    $x++;
}

while($x <= 3);*/


//for
/*for ($i =2; $i <=10; $i +=2){
    echo "event: $i \n";
}*/


//for each loop(Used for Arrays)
/*$items = array("roti","kapda","makaan");
for each($items as $item){
    echo "i need to buy: $item /n";
}*/


//defining nested loop statement
/*for ($row = 1;$row <=3 ;$row++ ){
    for ($col = 1; $col <= 3; $col++){
        echo "$col";}

echo "\n";}*/


// break,continue, exit statements
//break
/*for ($i = 1; $i <= 10; $i++){
    if($i == 5){
        break;
    }
    echo "$i \n";
}*/

//continue
/*for ($i = 1; $i<=5; $i++){
    if($i ==3){
        continue;
    }
    echo "$i \n";
}*/

//exit (die)
/*echo "befor exit \n";
exit("script stopped here");
echo "will not printed"*/


//comments (jiss cheez ko sbse pehle dena chahiye wo inlogone sbse akhri mai dia h)

//echo and print statements
/*echo "hello","nitin","\n";
print "hello kp \n";
$value = print " this return 1";
echo "value : $value";*/






//operators
//assign
//string
// comparison
// logical
// increment and decrement
//arithmatic
// operator precedence
// all in 1
/*$a = 10;
$b = 130;
$c = $a +$b;
$d = $a > 45 ?  " big": "small"; // ternary operator
$e = "value is ";
$e .= ($d>0 && $a > $b);
$g = [1,2];
$h = [3,4];
$merge = $g +$h;
echo $e . "\n";
echo "mege array: ";
print_r($merge);*/



//php and html
/*The PHP code needs to be embedded in either the HTML or Extensible Hypertext Markup Language
(XHTML) language, as only these are supported by the Web browser. Apart from PHP, the JavaScript
language can also be embedded in the HTML or XHTML languages to help perform certain tasks at the
client side; thereby, reducing the burden on the Web server. A simple HTML document is used to create
static Web pages; however, dynamic pages can also be created by embedding scripts, such as PHP and
JavaScript in the HTML document.*/




//arrays
//create an array + // aCCESsing array element
/*$colors = array("chomu","chomu2","chomu3");
echo $colors[0];
echo "\n";
echo $colors[1];
echo "\n";
echo $colors[2];*/




//types of arrays
//indexex array 
//same as above

//associated array
/*$student = array(
    "name" => "nitin","age" => 19, "course" => "BCa"
);
echo "name:" .$student["name"] . "\n";
echo "age:" .$student["age"] . "\n";
echo "course:" .$student["course"] ;*/

//multi d arrays
/*$student = array("nitn" => array("math" => 85 ,"science" => 90),"kp" => array("math" => 95 ,"science" => 10))
;
echo " rahul marks in science " . $student["nitn"]["science"] . "\n";
echo " kp marks in math " . $student["kp"]["math"] . "\n";*/

// traversing arrays using loop and array iterators
/*$fruits = array("saib","tarbooz","aam","naaspaati");
echo "using for each loop \n";
foreach ($fruits as $fruit){
    echo $fruit . "\n";
}
echo "\n using iterator \n";
$iterator = new ArrayIterator($fruits);
foreach ($iterator as $item){
    echo $item . "\n";
}*/



//lab
//Write a PHP program to display a digital clock which displays the current time of the server.

?>*/


<!doctype html>
<html>
<head>
    <title>Digital Clock</title>
    <meta http-equiv="refresh" content="1">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #000;
            color: #0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            font-size: 50px;
        }
    </style>
</head>
<body>
    <?php
        date_default_timezone_set("Asia/Kolkata");
        echo date("h:i:s A");
    ?>
</body>
</html>
