var form = document.getElementById("grocery-form");
var inputItem = document.getElementById("grocery-item");
var itemList = document.getElementById("grocery-list");

fetch("http://localhost:8000/grocery")
.then(response => response.json())
.then(json => {
        json.forEach(element => {
            createList(element.item);
        });
        itemList.addEventListener('click',(e)=>{
            let li = e.target.parentNode;
            itemList.removeChild(li);
        });
});

form.addEventListener('submit', (e)=> {
    e.preventDefault();
    fetch("http://localhost:8000/grocery/add", {
        method: "POST",
        body: JSON.stringify({
            item: inputItem.value
        }),
        headers: {
            "Content-type": "application/json"
        }
    })
    .then(response => response.json())
    .then(json => {
        console.log(json)
        let lastIndex = json.length - 1;
        createList(json[lastIndex].item);
    });
});

function createList(item){
    let li = document.createElement("li");
    li.innerHTML = item;
    let btn = document.createElement("button");
    btn.innerHTML = "Delete";
    li.appendChild(btn);
    itemList.appendChild(li);
}