// adds listener to button submit
let groceryForm = document.getElementById("grocery-form").addEventListener("submit", addItems);

// adds item to page
function addItems(e){
    e.preventDefault(); // stops from submitting

    let item = document.getElementById("item-name").value;

    fetch('http://localhost:8000/create', {method: 'PUT', headers: {'Content-Type' : 'application/json'}, body :
    id : 0, "content" = `"${item}"`});



    let div = document.getElementById("div-list");

    let itemtag = document.createElement("p");
    let btndel = document.createElement("button");
    
    btndel.innerText = "delete";
    itemtag.innerText = item;
    div.appendChild(itemtag);
    div.appendChild(btndel);


   


}