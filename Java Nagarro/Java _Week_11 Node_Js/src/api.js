const Student = require("../models/students");

const errHandler = (err) => {
    console.log("Error : ",err.message);
}

var addRecord = async (roll, name, dob, score) => {

    const addStudent = await Student.create({
        roll: roll,
        name: name,
        dob: dob,
        score: score
    }).catch(errHandler);
}

var getDetails = async (roll) => {

    const getStudent = await Student.findOne({
        where: {
            roll: roll
        }
    }).catch(errHandler);
    return getStudent;
}

var login = async (roll, dob) => {

    const getStudent = await Student.findOne({
        where: {
            roll: roll,
            dob: dob
        }
    }).catch(errHandler);
    return getStudent;
}

var getAllRecords = async () => {
    const Students = await Student.findAll().catch(errHandler);
    return Students;
}

var editRecord = async (roll, name, dob, score) => {
    const updatedStudent = await Student.update({ name: name, dob:dob, score: score }, {
        where: {
          roll: roll
        }
      }).catch(errHandler);
}

var deleteRecord = async (roll) => {
    await Student.destroy({
        where: {
          roll: roll
        }
      });
}

module.exports = {
    addRecord,
    getDetails,
    login,
    editRecord,
    deleteRecord,
    getAllRecords
}