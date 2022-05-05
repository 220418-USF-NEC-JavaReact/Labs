
let submitForm = document.getElementById("pokemon-input");
let pokemonName = document.getElementById("pokemon-name");
let pokemonImage = document.getElementById("pokemon-image");

//Lets do our event listener
submitForm.addEventListener('submit', handleAPI);

function handleAPI(e){

    e.preventDefault();
    let pokemonValue = document.getElementById("text-pokemon").value;
    console.log(`Pokemon: ${pokemonValue}`);

    let request = 'https://pokeapi.co/api/v2/pokemon/' + pokemonValue;
    let response;
    fetch(request)
    .then(response => response.json())
    .then(data => {
        console.log(data);
        pokemonName.innerText = data.name;
        pokemonImage.setAttribute("src", data.sprites.front_shiny);
    });
}