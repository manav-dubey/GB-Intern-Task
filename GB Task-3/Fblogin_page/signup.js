document.getElementById('btn2').addEventListener('click',ageFunc);

function ageFunc(){
    
    let year = document.getElementById('year').value ;
    if (year === '') {
        alert("Please select a valid year.");
        return;
    }
    
    let age = 2024 - parseInt(year) ;
    if(age <18){
        alert("You are underage");
      
    }

}

