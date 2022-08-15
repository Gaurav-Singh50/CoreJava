
let enroll = document.querySelector('#enroll');
enroll.addEventListener("click", registration);


function registration(){
    getValues();
    
    if(validate()){

        
        let Gender ;
        if(rd1.checked==true)
        {
          Gender= rd1.value;
        } 
        else{
            Gender = rd2.value;
        }

        let Skill="";
        if(checkjava.checked==true)
        {
          Skill += checkjava.value+" ";
        } 
        if(checkhtml.checked==true)
        {
          Skill += checkhtml.value+" ";
        }
        if(checkcss.checked==true)
        {
          Skill += checkcss.value+" ";
        }


        let addeduser={

            name:Name,
            email:Email,
            gender:Gender,
            website:Website,
            skills:Skill,
            image:ImageLink,
    
        }
        students.unshift(addeduser)
    
        displaytable();
    }  
  }