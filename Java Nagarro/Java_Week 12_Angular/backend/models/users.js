const Sequelize = require("sequelize");

module.exports = sequelize.define("Users", {
    id: {
        type: Sequelize.DataTypes.UUID,
        defaultValue : Sequelize.DataTypes.UUIDV4,
        primaryKey :true
    },
    username: {
        type: Sequelize.STRING,
        allowNull: false
    },
    name: {
        type: Sequelize.STRING,
        allowNull: false
    },
    password: {
        type: Sequelize.STRING,
        allowNull: false
    },
    role :{
        type: Sequelize.STRING,
        allowNull: false
    }
});
