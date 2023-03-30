import * as readline from "readline";

class Car {
    make: string;
    model: string;
    year: number;
    currentSpeed: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.currentSpeed = 0;
    }

    accelerate() {
        this.currentSpeed += 10;
    }

    decelerate() {
        this.currentSpeed -= 10;
    }

    stop() {
        this.currentSpeed = 0;
    }

    getCurrentSpeed() {
        return this.currentSpeed;
    }
}

let rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const car = new Car('Aston Martin', 'DBX', 2022);

console.log(`You are driving a ${car.year} ${car.make} ${car.model}.`);

while (true) {

    console.log(`Current speed: ${car.getCurrentSpeed()} mph`);


    rl.question("Enter a command (a to accelerate, d to decelerate, s to stop): ", (command: string) => {

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

        rl.close();        

    });

}