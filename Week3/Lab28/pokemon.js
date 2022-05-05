
let appendPokemon = (data) => {
    let div = document.getElementById("pokemon-container");
    let name = data.name;
    let image = data.sprites.front_shiny;
    let nametag = document.createElement("p");
    let imagetag = document.createElement("img");
    nametag.innerText = name;
    imagetag.setAttribute("src", image);
    //div.appendChild(nametag);
    //div.appendChild(imagetag);
    div.prepend(nametag);
    div.prepend(imagetag);

    

}

let newPokeForm = document.getElementById("pokemon-form").addEventListener("submit", callPokemon);

function callPokemon (e) {
    e.preventDefault();
    let name = document.getElementById("name-input").value;

    fetch( `https://pokeapi.co/api/v2/pokemon/${name}`)
        .then((res) => res.json())
        .then((data) => {
            console.log(data);
            appendPokemon(data);

        }).catch((e)=> {
            console.log(e);
        })
}


/*



}*/