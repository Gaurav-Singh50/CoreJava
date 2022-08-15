const Result = require("./models/results");
const User = require("./models/users");

let addRecord = async (roll, name, dob, score) => {
    
    const addResult = await Result.create({
        roll: roll,
        name: name,
        dob: dob,
        score: score
    })
    const addStudent = await User.create({
        username: roll,
        name:name,
        password: dob,
        role: "Student"
    })
    return addResult
}

let addTeacher = async (username, name, password) => {
   
  const taecher = await User.create({
      username: username,
      name:name,
      password: password,
      role: "Teacher"
  })
  return taecher
}


let getDetails = async (roll) => {
    const getResult = await Result.findOne({
      where:{
        roll:roll,
      }
    })
    return getResult;
}

let getUserDetails = async (username, password) => {
  const user = await User.findOne({
    where: {
        username : username,
        password: password,
    }
  })
  return user;
}


let getAllRecords = async () => {
    const Results = await Result.findAll();
    return Results;
}

let getAllUsers = async () => {
  const Users = await User.findAll();
  return Users;
}

let editRecord = async(roll, name, dob, score) => {
    const res = await Result.update({ name: name, dob:dob, score: score }, {
        where: {
          roll: roll
        }
      })
    // console.log(res)
    await User.update({ name: name, password:dob}, {
        where: {
          username: roll
        }
      }) 
    const getResult = await Result.findByPk(roll)
    return getResult;  
}

let deleteRecord = async (roll) => {
    await Result.destroy({
        where: {
          roll: roll
        }
      });
    await User.destroy({
        where: {
          username: roll
        }
      });  
}

module.exports = {
    addRecord,
    getDetails,
    editRecord,
    deleteRecord,
    getUserDetails,
    addTeacher,
    getAllUsers,
    getAllRecords
}