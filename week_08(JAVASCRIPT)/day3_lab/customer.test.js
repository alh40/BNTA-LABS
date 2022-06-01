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

const{
    Customer,
    buyCar
} = require("./customer");


describe('remove car from dealership and update customer car property', () => {

    test('remove car from dealership', () => {

        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("BMW", 25000, "Fast"),
            car3 = new Car("BMW", 30000, "Slow"),
            car4 = new Car("BMW", 40000, "Slow"),
            car5 = new Car("BMW", 50000, "Slow")
        ];

        const dealership1 = new Dealership("ManyCars", 5, carTestArray);
        const customer1 = new Customer("Alexander", 50000, null);

        
        buyCar(customer1, dealership1, car5);

        actual = carTestArray.includes(car5);
        expected = false;

        expect(actual).toBe(expected);


    });

    test('add car property to customer on purchase', () => {

        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("BMW", 25000, "Fast"),
            car3 = new Car("BMW", 30000, "Slow"),
            car4 = new Car("BMW", 40000, "Slow"),
            car5 = new Car("BMW", 50000, "Slow")
        ];

        const dealership1 = new Dealership("ManyCars", 5, carTestArray);
        const customer1 = new Customer("Alexander", 50000, null);

        
        buyCar(customer1, dealership1, car5);


        actual = customer1.car
        expected = car5;
        expect(actual).toBe(expected);


    });

    test('does not add car property to customer on purchase when wallet insufficient', () => {

        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("BMW", 25000, "Fast"),
            car3 = new Car("BMW", 30000, "Slow"),
            car4 = new Car("BMW", 40000, "Slow"),
            car5 = new Car("BMW", 50000, "Slow")
        ];

        const dealership1 = new Dealership("ManyCars", 5, carTestArray);
        const customer1 = new Customer("Alexander", 500, null);

        
        buyCar(customer1, dealership1, car5);

        actual = customer1.car
        expected = null;
        expect(actual).toBe(expected);

    });

    test('does not buy, if car is not in stock', () => {

        let carTestArray = [
            car1 = new Car("BMW", 24000, "Fast"),
            car2 = new Car("BMW", 25000, "Fast"),
            car3 = new Car("BMW", 30000, "Slow"),
            car4 = new Car("BMW", 40000, "Slow"),
            car5 = new Car("BMW", 50000, "Slow")
        ];

        const dealership1 = new Dealership("ManyCars", 5, carTestArray);
        const customer1 = new Customer("Alexander", 500, null);

        
        buyCar(customer1, dealership1, car5);

        actual = customer1.car
        expected = null;
        expect(actual).toBe(expected);

    });
});