var form = document.getElementById("pokemon-index-form");
var getName = document.getElementById("pokemon_name_input");
var displayName = document.getElementById("display_name");
var displayImage = document.getElementById("display_image");

form.addEventListener('submit', display_pokemon);

function display_pokemon(e){
    e.preventDefault();

    console.log(getName.value);
}

function appendElement(getName){

}

let displaySomething = (getName) => {

}

(() => {
    /* */
  
    fetch("https://pokeapi.co/api/v2/pokemon/")
    .then((res) => res.json())
    .then((data) => {
      console.log(data);
      displayName.setState = data;
     
    })
    .catch((e) => {
      console.log(e);
    });
  
  })();
  