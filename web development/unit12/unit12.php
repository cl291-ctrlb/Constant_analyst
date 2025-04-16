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

//User-Defined Function
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































?>












