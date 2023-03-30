import * as readline from "readline";


// addition
function addTheNumbers(numberOne: number, numberTwo: number): number {
    return numberOne + numberTwo;
}

// subtraction
function subtractTheNumbers(numberOne: number, numberTwo: number): number {
    return numberOne - numberTwo;
}

// multiplication
function multiplyTheNumbers(numberOne: number, numberTwo: number): number {
    return numberOne * numberTwo;
}

// division
function divideTheNumbers(numberOne: number, numberTwo: number): number {
    return numberOne / numberTwo;
}


//readline session
let rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter the first digit: ", (firstNumber: string) => {
    rl.question("Enter the second digit: ", (secondNumber: string) => {
        rl.question("Enter the operator (+, -, *, /): ", (arithmeticOperator: string) => {

            const numberOne = parseFloat(firstNumber);
            const numberTwo = parseFloat(secondNumber);

            let result: number;

            switch (arithmeticOperator) {
                case "+": result = addTheNumbers(numberOne, numberTwo);
                    break;
                case "-": result = subtractTheNumbers(numberOne, numberTwo);
                    break;
                case "*": result = multiplyTheNumbers(numberOne, numberTwo);
                    break;
                case "/": if (numberTwo != 0) {
                    result = divideTheNumbers(numberOne, numberTwo);
                } else {
                    console.log("ZeroDivisionError");
                }
                    break;

                default: console.log("Wrong Operator");
            }

            console.log(`Result: ${result}`);
            rl.close();
          
        });
       
    });
   
});
