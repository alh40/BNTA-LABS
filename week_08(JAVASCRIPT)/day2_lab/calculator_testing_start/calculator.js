const sum = function(a, b){
    return a + b;
};

const subtract = function(a, b){
    return a - b;
}

const multiply = function(a, b){
    return a * b;
}

const divide = function(a, b){
    return a / b;
}

const modulus = function(a, b){
    return a % b;
}

const even = function(a){
    if(a % 2 == 0){
        return true;
    }else{
        return false;
    }
}
// could use 'even' function instead. and change test results on odd, - reverse toBeTruthy, as toBeFalsy and vice versa.
const odd = function(a){
    if(a % 2 !== 0){
        return true;
    }else{
        return false;
    }
}

module.exports = { 
    sum, 
    subtract, 
    multiply, 
    divide, 
    modulus, 
    even, 
    odd 
};
