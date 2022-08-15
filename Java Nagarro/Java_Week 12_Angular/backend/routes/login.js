const express = require("express");
const bodyParser = require("body-parser");

const app = express();

const { getUserDetails, getAllUsers} = require("../services");

const router = express.Router();

app.use(bodyParser.json());


router.get('/', async (req, res) => {
    try{
        let students = await getAllUsers();
        res.json(students)
    }catch(e){
        console.log(e)
        res.json({message:"Some Error occurred"});
    }
});


module.exports = router;