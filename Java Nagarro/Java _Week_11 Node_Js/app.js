const express = require("express");
const bodyParser = require("body-parser");
const http = require("http");
const request = require("request");
const ejs = require("ejs");
const sequelize = require("./src/database/connection");
const Student = require('./models/students');
const app = express();

app.set("view engine", 'ejs');

app.use(bodyParser.urlencoded({ extended: true }));

sequelize
.sync()
.then(result => {
  console.log(result)
})
.catch((err) => {
  console.log(err);
});

var { addRecord, getDetails, login, getAllRecords, editRecord, deleteRecord } = require("./src/api");
const { rmSync } = require("fs");


app.get("/", (req, res) => {
   res.render("home", { loggedIn: false });
});

app.get("/teacherLogin", (req, res) => {
   res.render("login", { who: "Teacher", loggedIn: false });
});

app.get("/studentLogin", (req, res) => {
   res.render("login", { who: "Student", loggedIn: false });
});


app.get("/teacherDashboard", async (req, res) => {
   let students = await getAllRecords();
   res.render("allRecords", { students: students, count: students.length, loggedIn: true });
});

app.get("/addRecord", (req, res) => {
   res.render("addRecord", { loggedIn: true });
});

app.get("/editRecord/:roll", async (req, res) => {
   res.render("editRecord", { roll: req.params.roll, loggedIn: true });
});

app.get("/deleteRecord/:roll", async (req, res) => {
   await deleteRecord(req.params.roll);
   res.redirect("/teacherDashboard");
});

app.get("/findResult/:name", (req, res) => {
   res.render("findResult", { loggedIn: true, name:req.params.name });
});

app.get("/result/:roll/:name/:dob/:score", (req, res) => {
   const result = {
      roll: req.params.roll,
      name: req.params.name,
      dob: req.params.dob,
      score: req.params.score
   }
   res.render("result", { resultSet: result, loggedIn: true });
});

app.get("/error/:msg", (req, res) => {
   let msg = req.params.msg;
   res.render("errorPage", { message: msg });
});



// POST ROUTES

app.post("/login/:who", async (req, res) => {
   if (req.params.who == "Teacher") {
      let { username, password } = req.body;
      if (username == "simran" && password == "111") {
         // let list=JSON.stringify(students);
         res.redirect("/teacherDashboard");
      } else {
         res.redirect("/teacherLogin");
      }
   } else if (req.params.who == "Student") {
      let { roll, dob } = req.body;
      const stud = await login(roll, dob);
      if (stud != null) {
         const result = await getDetails(roll);
         res.redirect(`/result/${result.roll}/${result.name}/${result.dob}/${result.score}`);
      } else {
         res.redirect("/studentLogin");
      }
   }
});

app.post("/addNewRecord", async (req, res) => {
   let { roll, name, dob, score } = req.body;
   await addRecord(roll, name, dob, score);
   res.redirect("/teacherDashboard");
});


app.post("/editRecord", async (req, res) => {
   let { roll, name, dob, score } = req.body;
   await editRecord(roll, name, dob, score);
   res.redirect("/teacherDashboard");
});

app.post("/logout", (req, res) => {
   res.redirect("/");
});


app.listen(3000, () => {
   console.log("Server is running on Port : 3000");
});