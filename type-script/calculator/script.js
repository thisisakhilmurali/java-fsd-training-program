"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var readline = require("readline");
// addition
function addTheNumbers(numberOne, numberTwo) {
    return numberOne + numberTwo;
}
// subtraction
function subtractTheNumbers(numberOne, numberTwo) {
    return numberOne - numberTwo;
}
// multiplication
function multiplyTheNumbers(numberOne, numberTwo) {
    return numberOne * numberTwo;
}
// division
function divideTheNumbers(numberOne, numberTwo) {
    return numberOne / numberTwo;
}
//readline session
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
rl.question("Enter the first digit: ", function (firstNumber) {
    rl.question("Enter the second digit: ", function (secondNumber) {
        rl.question("Enter the operator (+, -, *, /): ", function (arithmeticOperator) {
            var numberOne = parseFloat(firstNumber);
            var numberTwo = parseFloat(secondNumber);
            var result;
            switch (arithmeticOperator) {
                case "+":
                    result = addTheNumbers(numberOne, numberTwo);
                    break;
                case "-":
                    result = subtractTheNumbers(numberOne, numberTwo);
                    break;
                case "*":
                    result = multiplyTheNumbers(numberOne, numberTwo);
                    break;
                case "/":
                    if (numberTwo != 0) {
                        result = divideTheNumbers(numberOne, numberTwo);
                    }
                    else {
                        console.log("ZeroDivisionError");
                    }
                    break;
                default: console.log("Wrong Operator");
            }
            console.log("Result: ".concat(result));
            rl.close();
        });
    });
});
