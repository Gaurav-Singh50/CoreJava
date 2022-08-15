const express = require("express");
const bodyParser = require("body-parser");

//Database Connection
// const sequelize = require("../connection");

const app = express();

const { addRecord, getDetails, login, getAllRecords, editRecord, deleteRecord } = require("../services");
// const Student = require("../models/results");
const router = express.Router();

app.use(bodyParser.json());

router.get('/', async (req, res) => {
    try{
        let students = await getAllRecords();
        res.json(students)
    }catch{
        res.json({message:"Some Error occurred"});
    }
});

router.get('/:roll',async (req, res) => {
    try{
        const result = await getDetails(req.params.roll)
        if(result){
            res.send(result);
        }else{
            res.json({message:"Result Not Available"});
        }    
    }catch{
        res.json({message:"Some Error occurred"});
    }
 });

router.post('/', async (req, res) => {
    try{
        let { roll, name, dob, score } = req.body;
        let record = await addRecord(roll, name, dob, score);
        res.json(record)
    }catch(err){
        console.log(err)
        res.json({message:"Some Error occurred"});
    }
});

router.delete('/:roll', async (req, res) => {
    try{
        await deleteRecord(req.params.roll);
        res.json({message:"Record Deleted Successfully"})
    }
    catch{
        res.json({message:"Some Error occurred"});
    }
 });


router.put('/:roll', async (req, res) => {
    try{
        let {name, dob, score } = req.body;
        const result = await editRecord(req.params.roll, name, dob, score);
        res.send(result)
    }catch(e){
        console.log(e)
       res.json({message:"Some Error Occurred"})
   }
});

module.exports = router;