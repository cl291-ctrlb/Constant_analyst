var dom;
var destination_a = 450, destination_b=450;


function Text(){
    dom=document.getElementById('Text').style;
    var a = parseInt(dom.left, 10) || 50;
    var b = parseInt(dom.top, 10) || 50;
 
    mText(a, b);
}

function mText(a,b)
{
    if(a != destination_a){
    if(a > destination_a) a--;
    else if(a < destination_a) a++;}

    
    if(b != destination_b){
    if(b > destination_b) b--;
    else if(b < destination_b) b++;}

    dom.left = a + "px"
    dom.top = b + "px"

    if(a != destination_a || b != destination_b)
    {
        setTimeout(() => mText(a, b), 10);
    }
    
}

