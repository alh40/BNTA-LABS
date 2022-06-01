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

describe('Dealership', () => {

    test('can access Dealership objects', () => {
        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("BMW", 25000, "Fast")
        ];

        const dealership1 = new Dealership("BMW", 5, carTestArray)

        actualName = dealership1.name;
        actualMaxCarCount = dealership1.maxNumberOfCars;
        actualCarsInStock = dealership1.carsInStock;

        expectedName = "BMW";
        expectedMaxCarCount = 5;
        expectedCarsInStock = carTestArray;

        expect(actualName).toBe(expectedName);
        expect(actualMaxCarCount).toBe(expectedMaxCarCount);
        expect(actualCarsInStock).toBe(expectedCarsInStock);

    });
});

    describe('count cars', () => {

    test('can count number of cars in stock, with 2 cars', () => {

        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("BMW", 25000, "Fast")
        ];

        const dealership1 = new Dealership("BMW", 5, carTestArray)

        actual = countStock(dealership1);
        expected = 2;
        expect(actual).toBe(expected);


    });

    test('can count number of cars in stock, with 4 cars', () => {

        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("Ferrari", 25000, "Fast"),
            car3 = new Car("Ford", 25000, "Medium"),
            car4 = new Car("Mini", 25000, "Slow")
        ];

        const dealership1 = new Dealership("BMW", 5, carTestArray)

        actual = countStock(dealership1);
        expected = 4;
        expect(actual).toBe(expected);


    });
});

    describe('add cars to stock', () => {

    test('can add a car to stock, add 1 car', () => {

        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("BMW", 25000, "Fast")
        ];
        let car3 = new Car("BMW", 60000, "Slow")

        const dealership1 = new Dealership("BMW", 5, carTestArray)

        addCarToStock(car3, dealership1);
        
        actual = carTestArray.includes(car3);
        expected = true;
        expect(actual).toBe(expected);


    });

    test('can add a car to stock, add 2 cars', () => {

        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("BMW", 25000, "Fast")
        ];
        let car3 = new Car("Ford", 60000, "Slow")
        let car4 = new Car("Ferarri", 260000, "Fast")

        const dealership1 = new Dealership("RandomCars", 5, carTestArray)

        addCarToStock(car3, dealership1);
        addCarToStock(car4, dealership1);
        
        canFindCar3 = carTestArray.includes(car3);
        canFindCar4 = carTestArray.includes(car4);

        expectedCar3 = true;
        expectedCar4 = true;

        expect(canFindCar3).toBe(expectedCar3);
        expect(canFindCar4).toBe(expectedCar4);

    });

    test('can add a car to stock, check length when two cars added', () => {

        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("BMW", 25000, "Fast")
        ];
        let car3 = new Car("Ford", 60000, "Slow")
        let car4 = new Car("Ferarri", 260000, "Fast")

        const dealership1 = new Dealership("RandomCars", 5, carTestArray)

        addCarToStock(car3, dealership1);
        addCarToStock(car4, dealership1);

        actualCarLength = carTestArray.length

        expectedCarLength = 4;;

        expect(actualCarLength).toBe(expectedCarLength);


    });
});

    describe('return array of manufacturers', () => {

    test("can return an array containing each car's manufacturer", () => {

        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("BMW", 25000, "Fast"),
            car3 = new Car("Ford", 15000, "Medium")
        ];

        const dealership1 = new Dealership("ManyCars", 5, carTestArray)
        
        myTestArray = returnCarManufacturerArray(dealership1);
        actual = myTestArray[2];
        expected = "Ford" ;
        expect(actual).toBe(expected);

    });
});
    describe('find all cars based on manufacturer', () => {

    test("can find all cars by manufacturer", () => {

        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("BMW", 25000, "Fast"),
            car3 = new Car("Ford", 15000, "Medium")
        ];

        const dealership1 = new Dealership("ManyCars", 5, carTestArray)
        
        myTestArray = findAllCarsByManufacturer("BMW", dealership1);
        actual = myTestArray.length
        expected = 2 ;
        expect(actual).toBe(expected);
    });
});

describe('calculate total car price in stock', () => {

    test("calculate total car price in stock", () => {

        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("BMW", 25000, "Fast"),
            car3 = new Car("Ford", 15000, "Medium")
        ];

        const dealership1 = new Dealership("ManyCars", 5, carTestArray)
        
        actual =findTotalValueOfCarsInStock(dealership1);
        expected = 64000 ;
        expect(actual).toBe(expected);
    });
});