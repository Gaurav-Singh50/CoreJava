function validate() {
    var Name, Email, Website, ImageLink, rd1, rd2, checkjava, checkhtml, checkcss;

    Name = document.getElementById("inputName").value;
    Email = document.getElementById("inputEmail").value;
    Website=document.getElementById("inputWebsite").value;
    ImageLink=document.getElementById("inputImage").value;
    rd1=document.getElementById("rd1")
    rd2=document.getElementById("rd2")
    checkjava=document.getElementById("Java");
    checkhtml=document.getElementById("HTML");
    checkcss=document.getElementById("CSS");
    
    var letters = /^[a-zA-Z]+( *[a-zA-Z]*)*$/;
    var emailfilter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,25})+$/;
    var webfilter=(/(http(s)?:\/\/.)?(www\.)?[-a-zA-Z0-9@:%.\+#=]{2,256}\.[a-z]{2,6}\b([-a-zA-Z0-9@:%\+.#?&//=]*)/g);
    var imgfilter= /(https?:\/\/.*\.(?:png|jpg|jpeg|gif|png|svg))/i;

    if (Name == '') {
        alert('Please enter your name');
        return false;
    } else if (!letters.test(Name)) {
        alert('Name field required only alphabet characters');
        return false;
    } else if (Email == '') {
        alert('Please enter your user email id');
    } else if (!emailfilter.test(Email)) {
        alert('Invalid email');
    }
    else if (Website== '') {
      alert('Please enter Website');
      return false;
    } 

    else if (!webfilter.test(Website)) {
      alert('Web field required appropriate characters');
      return false;
    } 
    else if (ImageLink == '') {
      alert('Please enter image link');
      return false;
    } else if (!imgfilter.test(ImageLink)) {
      alert('Image field required appropriate characters');
      return false;
    } 
    else if(rd1.checked==false && rd2.checked==false)
    {
      alert("Please select a gender");
      return false;
    } 
    else if(checkjava.checked==false && checkhtml.checked==false && checkcss.checked==false)
    {
      alert("Please select a Skill");
      return false;
    } 
    else {
        return true
    }
  }
