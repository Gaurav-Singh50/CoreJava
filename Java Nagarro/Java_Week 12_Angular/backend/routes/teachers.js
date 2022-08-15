const express = require("express");
const bodyParser = require("body-parser");

const app = express();

const { addTeacher} = require("../services");

const router = express.Router();

app.use(bodyParser.json());

 router.post('/', async (req, res) => {
    try{
        let { username, name, password } = req.body;
        let record = await addTeacher(username, name, password);
        res.json(record)
    }catch(err){
        console.log(err)
        res.json({message:"Some Error occurred"});
    }
});

module.exports = router;