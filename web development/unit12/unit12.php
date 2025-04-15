/*
Server-Side Programming
with PHP – II
*/

/*Functions and arrays are two useful programming concepts in any programming as well as scripting
language. In simple terms, an array is a special variable with a unique name, which can hold more than
one value, at a time. On the other hand, a function is a block of code with a unique name, which can be
reused again and again. If required a function can be called by another function. */

/*reat question! Once you've extracted PHP (e.g., into C:\php), here’s exactly what to do after extraction to get it fully working:

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

makefile
Copy code
C:\php
Click OK on all windows to save

3️⃣ Test It Works
Open a new Command Prompt (important! So it refreshes the PATH)

cmd
Copy code
php -v
If it shows something like:

scss
Copy code
PHP 8.x.x (cli) (built: ...)
🎉 Congrats! PHP is now set up. */





 /* php functions */
 /* User-Defined Functions */
 <?php
 header('Content-Type: text/html; charset=utf-8');
 
// User-Defined Function
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

// Using the function
echo "<h2>Your Fortune Cookie Says:</h2>";
echo "<p>" . getFortune() . "</p>";
?>

 
 /* Understanding the Variable Scope */
 /* Passing Arguments by Reference */
 /* Built-in Functions */
 /* Mathematical Functions */
 /* Array Functions */
 /* STRING FUNCTIONS */
 /* FORM PROCESSING */
 /* In the client/server model of data processing, a user needs to enter relevant data at the client end,
which is further submitted to the server for processing. The client/server data processing model is also
applicable in cases of Web sites or Web applications; wherein the data to be processed is submitted
to the Web server through a graphical user interface (GUI) element, called a Web form. A Web form
contains various elements, such as text boxes, radio button, or check boxes, which allow the user to
enter the required information. A Web form generally contains a submit button. When you enter data in
the Web form and click the Submit button, the content of the form is submitted to the server for further
processing.
The processing of a Web form may include the following activities:
 Submitting the form data
 
  */
 /* Submitting the form data */
 /* Using the get() Method */
 /* Using the post() Method */
 /* Retrieving the form data */
 /* The $_GET[] Function */
 /* The $_POST[] Function*/
 /* Using the $_REQUEST[ ] Function */
 /* Using the SERVER [‘REQUEST_METHOD’] Method */
 /* Validating the form data  iska nhi dia h pdf mai */
 /* FILE UPLOADS */
 /* You can upload files on a web server using a PHP script. Initially, files are uploaded into a temporary
given in the upload_tmp_dir parameter and then uploaded on the server. You can set the size limit of
the file to be uploaded by using the upload_max_filesize parameter. These parameters are available in
the PHP configuration file php.ini.
You need a HTML web form containing a text box and an upload button to select and upload a file.
The global variable $_FILES is used to upload a file. It is an associative array containing files uploaded
through HTTP POST method. You also need to set enctype attribute of the form to multipart/form-data.
Before uploading a file, ensure that the directory in which you want to upload the file must have the
write permission otherwise upload operation will fail. */
 /* DATES AND TIME ZONE
 date_default_timezone_get() to get the default time zone. There
is another method named date_default_timezone_set() to set the default time zone. 
 */
 /* WORKING WITH REGULAR EXPRESSIONS */
 /* Searching a String using Regular Expression */
 /* Replacing Strings using Regular Expressions */
 /* THE INCLUDE AND REQUIRE */
 /* EXCEPTION HANDLING */
 /* STATE MANAGEMENT */
 /* Cookies */
 /* Using Cookie Header*/
 /* Creating Cookies */
 /* Reading Cookies */
 /* Removing Cookies
 */ 
 /* Session */
 /* Starting a Session*/
 /* Adding Session Data */
 /* Reading Session Data
 */
 /* Removing Session Data
 */
 /* Ending a Session */
 /* Using Query Strings */
 /* OBJECT ORIENTED PROGRAMMING*/
 /* Adding Data and Functions to Your Class */
 /*  Instantiating a Class */
 /* LAB EXERCISE
 
 
 Write a PHP program to store current date-time in a COOKIE and display the ‘Last visited on’ datetime on the web page upon reopening of the same page.
 
 Write a PHP program to store page views count in SESSION, to increment the count on each refresh,
and to show the count on web page
 */





































