class Animal {

    nameOfAnimal:string;
    ageOfAnimal:number;

    constructor(nameOfAnimal:string, ageOfAnimal:number) {
        this.nameOfAnimal = nameOfAnimal;
        this.ageOfAnimal = ageOfAnimal;
    }

    soundOfAnimal(): void {
        console.log(`I am ${this.nameOfAnimal}`);
        console.log("Sound of Animal\n");
    }
}

class Mammals extends Animal {

    constructor(nameOfAnimal:string, ageOfAnimal:number) {
        super(nameOfAnimal, ageOfAnimal);
    }

    soundOfAnimal(): void {
        console.log(`I am ${this.nameOfAnimal}`);
        console.log(`My Age is ${this.ageOfAnimal}`);
        console.log("Bow\n");
    }

}

class Birds extends Animal {

    constructor(nameOfAnimal:string, ageOfAnimal:number) {
        super(nameOfAnimal, ageOfAnimal);
    }

    soundOfAnimal(): void {
        console.log(`I am ${this.nameOfAnimal}`);
        console.log(`My Age is ${this.ageOfAnimal}`);
        console.log("Quack\n");
    }

}

class Fish extends Animal {

    constructor(nameOfAnimal:string, ageOfAnimal:number) {
        super(nameOfAnimal, ageOfAnimal);
    }

    soundOfAnimal(): void {
        console.log(`I am ${this.nameOfAnimal}`);
        console.log(`My Age is ${this.ageOfAnimal}`);
        console.log("Grunts\n");
    }

}



let dog = new Mammals("Dog", 8);
dog.soundOfAnimal();

let duck = new Birds("Duck", 6);
duck.soundOfAnimal();

let goldFish = new Fish("Gold Fish", 13);
goldFish.soundOfAnimal();