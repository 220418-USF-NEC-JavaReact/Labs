var form_submit_show = document.getElementById("show_all");

var form_submit_create = document.getElementById("get_items_create");
var name_create = document.getElementById("getNameCreate");
var price_create = document.getElementById("getPriceCreate");

var form_submit_update = document.getElementById("update_item");
var name_update = document.getElementById("getNameUpdate");
var price_update = document.getElementById("getPriceUpdate");

var form_submit_delete = document.getElementById("delete_all");
var name_delete = document.getElementById("getNameDelete");
var price_delete = document.getElementById("getPriceDelete");

var goList = document.getElementById("display_area");

form_submit_show.addEventListener('submit', displayList);
form_submit_create.addEventListener('submit', createItems);
function handleList(e){
    e.preventDefault();

    fetch("http://localhost:8080/grocery/show").then(response=>response.json()).then(data=>{
        console.log(data);
    })
}
displayList();

function displayList(){

    fetch("http://localhost:8080/grocery/show").then(response=>response.json()).then(data=>{
        for (let i = 0; i < data.length; i++){
            let li = document.createElement("li");
            li.innerText =  data[i].name + ",  $" + data[i].price;
            goList.appendChild(li);
        }

    })
}

function createItems(e){
    e.preventDefault();
    const item = {
        name: name_create.value,
        price: price_create.value
    };
    fetch('http://localhost:8080/grocery/create', {
    method: 'POST',
            body: JSON.stringify(item),
            headers: {
                'Content-type': 'application/json'
            }
        })
        .then(response => response.text())
        .then(json => {
            console.log(json);
        });

    }

function updateItems(e){
    e.preventDefault();
    const item = {
        name: name_update.value,
        price: price_update.value
    };
    fetch('http://localhost:8080/grocery/update', {
    method: 'POST',
            body: JSON.stringify(item),
            headers: {
                'Content-type': 'application/json'
            }
        })
        .then(response => response.json())
        .then(json => {
            console.log(json);
        });

    }
function deleteItems(e){
    e.preventDefault();
    const item = {
        name: name_delete.value,
        price: price_delete.value
    };
    fetch('http://localhost:8080/grocery/delete', {
    method: 'DELETE',
            body: JSON.stringify(item),
            headers: {
                'Content-type': 'application/json'
            }
        })
        .then(response => response.json())
        .then(json => {
            console.log(json);
        });

    }

