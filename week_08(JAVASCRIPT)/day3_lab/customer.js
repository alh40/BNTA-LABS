const {
    Car
} = require("./car");

const {
    Dealership,
    countStock,
    addCarToStock,
    returnCarManufacturerArray,
    findAllCarsByManufacturer,
    findTotalValueOfCarsInStock 
} = require("./dealership");


const Customer = function(name, wallet, car){
    this.name = name;
    this.wallet = wallet;
    this.car = car;
}

const buyCar = function(customer1, dealership1, car1){
    
    const carIndex = dealership1.carsInStock.indexOf(car1);

    if(carIndex !== -1){
        for(cars in dealership1.carsInStock){
            if(customer1.wallet >= dealership1.carsInStock[cars].price){
                    dealership1.carsInStock.splice(carIndex, 1);
                    customer1.car = car1;
                }else{
                    return `Sorry, ${customer1.name} you do not have enough!`
                }
            }
    }else{
        return `Car: ${car1} not in stock!`
    }

    }

    module.exports = {
        Customer,
        buyCar
    };
