let clear = document.querySelector('#clear');


clear.addEventListener("click",()=>{
  
  getElements();


  Name.value ='';
  Email.value='';
  Website.value='';
  ImageLink.value=''; 
  rd1.checked = false;
  rd2.checked = false;
  checkjava.checked = false;
  checkhtml.checked = false;
  checkcss.checked = false;
});