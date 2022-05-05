let interval;
let min = document.getElementById("minutes");
let sec = document.getElementById("seconds");
let mil = document.getElementById("milli");
let smallAmountOfTime = 0;
//let milliseconds = 0;
let seconds = 0;
let minutes = 0;
let startIntButton = document.getElementById("start").addEventListener('click', () => {
    interval = window.setInterval(()=>{
        smallAmountOfTime++;
        if(smallAmountOfTime >= 100) {
            seconds++;
            smallAmountOfTime = 0;
        }
        //seconds = ((smallAmountOfTime *.01) % 60).toFixed(2);
        if(seconds % 60 == 0 && smallAmountOfTime == 0) {
            minutes++;
            seconds = 0;
        }

        mil.innerText = smallAmountOfTime;
        sec.innerText = seconds;
        min.innerText = minutes;
        
    }, 10);
});

let stopIntButton = document.getElementById("stop").addEventListener('click', () => {
    smallAmountOfTime = 0;
    min.innerText = 0;
    sec.innerText = 0;
    window.clearInterval(interval);
});