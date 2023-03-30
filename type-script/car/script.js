"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var readline = require("readline");
var Car = /** @class */ (function () {
    function Car(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.currentSpeed = 0;
    }
    Car.prototype.accelerate = function () {
        this.currentSpeed += 10;
    };
    Car.prototype.decelerate = function () {
        this.currentSpeed -= 10;
    };
    Car.prototype.stop = function () {
        this.currentSpeed = 0;
    };
    Car.prototype.getCurrentSpeed = function () {
        return this.currentSpeed;
    };
    return Car;
}());
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
var car = new Car('Aston Martin', 'DBX', 2022);
console.log("You are driving a ".concat(car.year, " ").concat(car.make, " ").concat(car.model, "."));
while (true) {
    console.log("Current speed: ".concat(car.getCurrentSpeed(), " mph"));
    rl.question("Enter a command (a to accelerate, d to decelerate, s to stop): ", function (command) {
        switch (command) {
            case 'a':
                car.accelerate();
                break;
            case 'd':
                car.decelerate();
                break;
            case 's':
                car.stop();
                break;
            default:
                console.log('Invalid command.');
                break;
        }
    });
    rl.close();
}
