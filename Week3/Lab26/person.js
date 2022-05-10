
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
    li.style.color = 'blue';
}

function appendElement(firstName, color){

    console.log(firstName + color);
    var li = document.createElement("li");
    /*
    li.innerHTML = "<p>" + task + "</p>"
    */
    var div = document.createElement("div");
    div.setAttribute("class", "item");
    var p = document.createElement("p");
    p.innerText = firstName + " " + color;
    div.appendChild(p);
    li.appendChild(div);
    
    itemList.appendChild(li);

    li.addEventListener('click', function onClick() {
        li.style.color = color;
      });
}

