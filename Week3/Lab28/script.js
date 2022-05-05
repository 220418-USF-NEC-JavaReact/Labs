let form = document.getElementById("pokemon-form");
let btn = document.getElementById("btn");
let pokemonName = document.getElementById("pokemon-name");
let itemList = document.getElementById("display");

form.addEventListener('submit', showPokemonInfo);

function showPokemonInfo(e){
    e.preventDefault();

    console.log(pokemonName.value);
    fetch("https://pokeapi.co/api/v2/pokemon/" + pokemonName.value)
    .then(res => res.json())
    .then(data => {
        console.log(data.name);
        console.log(data.sprites.back_default)
        let pImage = data.sprites.back_default; 
        let pName = data.name;
        printInfo(pName, pImage);

    })

    
}

function printInfo(name, pic) {
    let li = document.createElement("li");
    let img = document.createElement("img");

    li.setAttribute('class', 'item');
    img.setAttribute('class', 'item');
    let p = document.createElement("p");
    li.append(p);

    p.innerText = name;
    img.src = pic;


    itemList.appendChild(li);
    itemList.appendChild(img);
}



