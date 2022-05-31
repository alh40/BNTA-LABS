const {
  sum,
  subtract,
  multiply,
  divide,
  modulus,
  even,
  odd,
} = require("./calculator");

describe('sum', () => { 
  
  test('can add two small positive numbers', () => {
    actual = sum(2, 3);
    expected = 5;
    expect(actual).toBe(expected);
  });

  test('can add two large positive numbers', () => { 
    actual = sum(500, 600);
    expected = 1100;
    expect(actual).toBe(expected);
  });

  test('can add two negative numbers', () => {
    actual = sum(-3, -5);
    expected = -8;
    expect(actual).toBe(expected);
  });

  test('can add zero', () => {
    actual = sum(0, 1);
    expected = 1;
    expect(actual).toBe(expected);
  });

});

describe('subtract', () => {

  test('can subtract two small positive numbers', () => {
    actual = subtract(2 ,3);
    expected = -1;
    expect(actual).toBe(expected);
  })

  test('can subtract two large positive numbers', () => {
    actual = subtract(600, 500);
    expected = 100;
    expect(actual).toBe(expected);
  });

  test('can subtract two negative numbers', () => {
    actual = subtract(-2, -7);
    expected = 5;
    expect(actual).toBe(expected);
  });

  test('can subtract zero', () => {
    actual = subtract(0, 2);
    expected = -2;
    expect(actual).toBe(expected);
  });

  test('', () => {

  });

describe('multiply', () => {

  test('can multiply two numbers', () => {
    actual = multiply(5, 7);
    expected = 35;
    expect(actual).toBe(expected);
  });

  test('can multiply by zero', () => {
    actual = multiply(7, 0);
    expect(actual).toBeFalsy;
  });
 
});

describe('divide', () => {
  test('can divide two large negative numbers', () => {
    actual = divide(-500, -250);
    expected = 2;
    expect(actual).toBe(expected);
  });

  test('can divide by zero', () => {
    actual = divide(7, 0);
    expect(actual).toBeFalsy;
  });
});

describe('modulus', () => {
  test('can find the modulus of two positive numbers', () => {
    actual = modulus(50, 4);
    expected = 2;
    expect(actual).toBe(expected);
  });
  

  test('can find the modulus of two negative numbers', () => {
    actual = modulus(-71, 3);
    expected = -2;
    expect(actual).toBe(expected);
  });

  test('can find the modulus of zero', () => {
    actual = modulus(8, 0);
    expect(actual).toBeFalsy;
  });
});

describe('even', () => {
  test('can find if a single positive integer is even', () => {
    actual = even(2);
    expect(actual).toBeTruthy;
  });

  test('can find if a single negative integer is even', () => {
    actual = even(-8);
    expect(actual).toBeTruthy;
  });

  test('can find if a single positive integer is even 2', () => {
    actual = even(17);
    expect(actual).toBeFalsy;
  });
});

describe('odd', () => {
  test('can tell if a single positive integer is odd', () => {
    actual = odd(9);
    expect(actual).toBeTruthy;
  });

  test('can tell is a single negative integer is odd', () => {
    actual = odd(-17);
    expect(actual).toBeTruthy;
  });

  test('can tell is a single negative integer is odd 2', () => {
    actual = odd(-18);
    expect(actual).toBeFalsy;
  });
});
});
