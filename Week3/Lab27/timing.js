var timer = document.getElementById("timer");
let [milliseconds,seconds,minutes,hours] = [0,0,0,0];
let interval = null;

let startIntButton = document.getElementById("start-interval").addEventListener('click', () => {    
    
    if(interval!==null){
        clearInterval(interval);
    }
    interval = window.setInterval(displayTimer,10);
});

let stopIntButton = document.getElementById("stop-interval").addEventListener('click', () => {
    seconds = 0;
    window.clearInterval(interval);
});

let clearIntButton = document.getElementById("clear-interval").addEventListener('click', () => {
    clearInterval(interval);
    [milliseconds,seconds,minutes,hours] = [0,0,0,0];
    timer.innerText = hours+" : "+minutes+" : "+seconds+" : "+milliseconds;
});

function appendElement(task){    
    timer.innerText = task;
}

function displayTimer(){
    milliseconds+=10;

    if(milliseconds == 1000){
        milliseconds = 0;
        seconds++;

        if(seconds == 60){
            seconds = 0;
            minutes++;

            if(minutes == 60){
                minutes = 0;
                hours++;
            }
        }
    }
    timer.innerText = hours+" : "+minutes+" : "+seconds+" : "+milliseconds;
}