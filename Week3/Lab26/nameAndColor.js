
var form = document.getElementById("input-form");
var div = document.getElementById("nameColor");
var n = document.querySelector("body > form > input[name=name]");
var c = document.querySelector("body > form > input[name=color]");

form.addEventListener('submit', submitPressed);

function submitPressed(e){
    console.log("In submitPressed");
    //We can prevent the html form from trying to send an http request by using
    e.preventDefault();
    console.log("Name: ", n.value, " Color: ", c.value);

    var h1 = document.createElement("h1");
    h1.innerText = n.value + " ";
    var span = document.createElement("span");
    span.innerText = c.value;
    span.style.color = c.value;
    h1.appendChild(span);

    //h1.style.color = c.value;
    div.appendChild(h1);

    n.value = "";
    c.value = "";
}
