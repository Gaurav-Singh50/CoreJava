const express = require("express");
const bodyParser = require("body-parser");


//Database Connection
const sequelize = require("./connection");

// const User = require("./models/users");
// Importing servces
// const { addRecord, getDetails, getAllRecords, editRecord, deleteRecord } = require("./services");

//Importing Routes
const results = require("./routes/results")
const login = require("./routes/login")
const teacher = require("./routes/teachers")

const app = express();
let cors = require("cors");
app.use(cors());

app.use(bodyParser.json());


//creating table
sequelize.sync()




app.use("/results", results);
app.use("/users", login);
app.use("/teachers", teacher)



// GET ROUTES

// app.get("/", (req, res) => {
//    res.render("home", { loggedIn: false });
// });

// app.get("/teacherLogin", (req, res) => {
//    res.render("login", { who: "Teacher", loggedIn: false });
// });

// app.get("/studentLogin", (req, res) => {
//    res.render("login", { who: "Student", loggedIn: false });
// });


// app.get("/teacherDashboard", async (req, res) => {
//    let students = await getAllRecords();
//    res.render("allRecords", { students: students, count: students.length, loggedIn: true });
// });

// app.get("/addRecord", (req, res) => {
//    res.render("addRecord", { loggedIn: true });
// });

// app.get("/editRecord/:roll", async (req, res) => {
//    const roll = req.params.roll
//    const student = await getDetails(roll)
//    // console.log(student)
//    if(student != null){
//       res.render("editRecord", { student: student, loggedIn: true });
//    }
//    else{
//       res.redirect("/teacherDashboard");
//    }   
// });

// app.get("/deleteRecord/:roll", async (req, res) => {
//    // try{
//    await deleteRecord(req.params.roll);
//    // }
//    // catch(e){
//    //    console.log("Roll No. not present")
//    // }
//    res.redirect("/teacherDashboard");
// });


// app.get("/result/:roll",async (req, res) => {
//    const result = await getDetails(req.params.roll)
//    res.render("result", { resultSet: result, loggedIn: true });
// });




// // POST ROUTES

// app.post("/login/:who", async (req, res) => {
//    if (req.params.who == "Teacher") {
//       let { username, password } = req.body;
//       if (username == "abhishek" && password == "123") {
//          res.redirect("/teacherDashboard");
//       } else {
//          res.redirect("/teacherLogin");
//       }
//    } else if (req.params.who == "Student") {
//       let { roll, dob } = req.body;
//       const stud = await login(roll, dob);
//       if (stud != null) {
//          const result = await getDetails(roll);
//          res.redirect(`/result/${result.roll}`);
         
//       } else {
//          res.redirect("/studentLogin");
//       }
//    }
// });

// app.post("/addNewRecord", async (req, res) => {
//    let { roll, name, dob, score } = req.body;
//    await addRecord(roll, name, dob, score);
//    res.redirect("/teacherDashboard");
   
// });


// // app.post("/editRecord", async (req, res) => {
// //    let { roll, name, dob, score } = req.body;
// //    await editRecord(roll, name, dob, score);
// //    res.redirect("/teacherDashboard");
// // });


// // function editDetails(roll, name, dob, score ){
// //    // let result = false
// //    return new Promise((resolve,reject) => {
// //       const result = editRecord(roll, name, dob, score);
// //       if (result == true){
// //          console.log("------------------vvvvvvrrrrrrrrrr----------------------------")
// //          resolve();
// //       }
// //       else{
// //          reject();
// //       }
// //       });
// // }

// // app.post("/editRecord", (req, res) => {
// //    let { roll, name, dob, score } = req.body;
// //    editDetails(roll, name, dob, score
// //    ).then(
// //       res.redirect("/teacherDashboard")
// //    ).catch(console.log("Some error occurred"))
// //    // res.redirect("/teacherDashboard");
// // });


// function editDetails(roll, name, dob, score ){
//    // let result = false
//    return new Promise((resolve,reject) => {
//       let result = false
//       const timeout = setTimeout(reject(), 100000000)
      
//       result = editRecord(roll, name, dob, score)
//          if (result == true){
//             console.log("------------------vvvvvvrrrrrrrrrr----------------------------")
//             clearTimeout(timeout)
//             resolve();
//          }
//          // else{
            
//          // }
//    });
// }

// app.post("/editRecord", (req, res) => {
//    let { roll, name, dob, score } = req.body;
//    editDetails(roll, name, dob, score
//    ).then(
//       res.redirect("/teacherDashboard")
//    ).catch(console.log("Some error occurred"))
//    // res.redirect("/teacherDashboard");
// });

// app.post("/logout", (req, res) => {
//    res.redirect("/");
// });



// Listening on port
app.listen(3000, () => {
   console.log("Server is running on Port : 3000");
});