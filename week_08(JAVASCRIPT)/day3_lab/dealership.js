const {
    Car
} = require("./car");


const Dealership = function(name, maxNumberOfCars, carsInStock){
    this.name = name;
    this.maxNumberOfCars = maxNumberOfCars;
    this.carsInStock = carsInStock;
}

const countStock = function(dealership1){
    let count = 0;
    for(car in dealership1.carsInStock){
        count++;
    }
    return count;
}

const addCarToStock = function(car1, dealership1){
    if(dealership1.carsInStock.length !== dealership1.maxNumberOfCars){
        dealership1.carsInStock.push(car1);
    }else{
        return `Unable to add ${car1}. Insufficient space!`
    }
    
}

const returnCarManufacturerArray = function(dealership1){
    carManufacturerArray = [];
    for(cars in dealership1.carsInStock){
        // carName = dealership1.carsInStock[cars].Car;
        // carBrand = dealership1.carsInStock[cars].manufacturer;
        // carManufacturerArray.push(`Car Name: ${carName} Car Brand: ${carBrand}`);
        carManufacturerArray.push(dealership1.carsInStock[cars].manufacturer);
    }
    return carManufacturerArray;
}

const findAllCarsByManufacturer = function(brand, dealership1){
    arrayContainingAllCarsByManufacturers = [];
    for(cars in dealership1.carsInStock){
        if(dealership1.carsInStock[cars].manufacturer === brand){
            arrayContainingAllCarsByManufacturers.push(dealership1.carsInStock.Car);
        }
    }
    
    return arrayContainingAllCarsByManufacturers;
}

const findTotalValueOfCarsInStock = function(dealership1){
    sumOfCars = 0;
    for(cars in dealership1.carsInStock){
        sumOfCars = sumOfCars + dealership1.carsInStock[cars].price;
    }
    return sumOfCars;
}

module.exports ={
    Dealership,
    countStock,
    addCarToStock,
    returnCarManufacturerArray,
    findAllCarsByManufacturer,
    findTotalValueOfCarsInStock 
};