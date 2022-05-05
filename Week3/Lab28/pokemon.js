let pokemon_name = document.getElementById("input-pokemon");
let image = document.getElementById("pokemon-pic");
let pokemonName = document.getElementById("pokemon-name");
let pokeList = document.getElementById("list-pokemon");

let form = document.getElementById("submit").addEventListener('click', (e) => {
    e.preventDefault();    
    let pokemon = pokemon_name.value.toLowerCase();
    getImage(pokemon);
    
       
});

async function getImage(pokemon) {
    const response = await fetch('https://pokeapi.co/api/v2/pokemon/'+pokemon);
    const names = await response.json();    

    let div = document.createElement("div");
    let h3 = document.createElement("h3");
    let img = document.createElement("img");
    h3.textContent = names.name.toUpperCase();
    img.src = names.sprites.front_default;
    div.appendChild(h3);
    div.appendChild(img);
    pokeList.appendChild(div);
}
//prepend