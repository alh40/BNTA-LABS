const {
    Car
} = require("./car");

describe('Car', () => {

    test('can access Car objects', () => {
        const car1 = new Car("BMW", 24000, "Fast")
        actualManufacturer = car1.manufacturer;
        actualPrice = car1.price;
        actualEngineType = car1.engineType;

        expectedManufacturer = "BMW";
        expectedPrice = 24000;
        expectedEngineType = "Fast";

        expect(actualManufacturer).toBe(expectedManufacturer);
        expect(actualPrice).toBe(expectedPrice);
        expect(actualEngineType).toBe(expectedEngineType);
    });




});