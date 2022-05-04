var form = document.getElementById("new-item-form");
var firstName = document.getElementById("name");
var color = document.getElementById("color");
var itemList = document.getElementById("item-list");


//But now we want to register an event listener for on submit of the form
form.addEventListener('submit', addTodo);

function printChange(e){
    //console.log("on change being called");
    console.log(e.target.value);
}

function addTodo(e){
    //We can prevent the html form from trying to send an http request by using
    e.preventDefault();
    appendElement(firstName.value, color.value);

    firstName.value = "";
    color.value = "";
}

function appendElement(firstName, color){

    var li = document.createElement("li");

    li.innerText = firstName + " " + color;
    
    itemList.appendChild(li);

    li.addEventListener('click', function onClick() {
        li.style.color = color;
    });
}

