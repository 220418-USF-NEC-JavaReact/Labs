var interval;
var index1 = 0;
var index2 = 0;
var index3 = 0;
var index4 = 0;

let intervalButton = document.getElementById("startStopWatch").addEventListener('click', ()=> {
  
        interval = window.setInterval(()=> {
            index1++;


            if (index1> 9){
                console.log(index1);
                document.getElementById("index2").innerText = index2;
                
                index2++;
              
                document.getElementById("index1").innerText = index1;
                
                index1 = 0;
                
                
                
            }

            if (index2 > 9){
        
                index2 = 0;
                index3++;
                document.getElementById("index2").innerText = index2;
                console.log(index2);           
            }

            if (index3 > 9) {
                index3 = 0;
                index4++;
            }

            if (index4 == 10){
                window.clearInterval(intervalButton);
            }

            }) 
  }
    
    
, 100);

let stopIntervalButton = document.getElementById("stopStopWatch").addEventListener('click', ()=>{
    interval = window.clearInterval(interval);
});