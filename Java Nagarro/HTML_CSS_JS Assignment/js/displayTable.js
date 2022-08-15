function displaytable(){
    
    var tabl = document.getElementById("tabdata");
    
    tabl.innerHTML=""

    let template=`<tr style="background-color: rgb(177, 212, 17)">
          <th style ="color:white" width = "370px" scope="col">Description</th>
          <th style ="color:white" width = "120px" scope="col">Image</th>
    </tr>`;
    
    tabl.innerHTML += template;    

    for(var i =0; i< students.length; i++){
        let name = students[i].name;
        let gender = students[i].gender;
        let email = students[i].email;
        let website = students[i].website;
        let skills = students[i].skills;
        let img_src = students[i].image;
        if(i%2!=0)
        {
          template = `
          <tr style="background-color:rgb(238, 245, 207)">
              <td style ="font-size:12px"><b>${name}</b><br>
                  ${gender}<br>
                  ${email}<br>
                  <a href ="https://${website}/" target="_blank" >${website}</a><br>
                  ${skills}
              </td>
              <td><img src = "${img_src}" width = "100px" height = "90px"></td>
          </tr>`;
        }
        else{
          template = `
          <tr >
              <td style ="font-size:12px"><b>${name}</b><br>
                  ${gender}<br>
                  ${email}<br>
                  <a href ="https://${website}/" target="_blank" >${website}</a><br>
                  ${skills}
              </td>
              <td><img src = "${img_src}" width = "100px" height = "90px"></td>
          </tr>`;
        }

        

        tabl.innerHTML += template;
    }

  }