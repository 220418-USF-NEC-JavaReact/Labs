var form = document.getElementById("name-color-form");
var input = document.getElementById("input-name");
var color = document.getElementById("html5colorpicker");
var itemList = document.getElementById("item-list");

//But now we want to register an event listener for on submit of the form
form.addEventListener('submit', addData);


function addData(e){
    //We can prevent the html form from trying to send an http request by using
    e.preventDefault();
    console.log("The user inputed this data: ", input.value);
    appendElement(input.value);
    input.value = "";
}

function appendElement(task){

    var li = document.createElement("li");    
    
    var p = document.createElement("p");
    p.innerText = task;
    p.style.color = color.value;    
    li.appendChild(p);
    
    itemList.appendChild(li);

}