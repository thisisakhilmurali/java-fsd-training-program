var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Animal = /** @class */ (function () {
    function Animal(nameOfAnimal, ageOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
        this.ageOfAnimal = ageOfAnimal;
    }
    Animal.prototype.soundOfAnimal = function () {
        console.log("I am ".concat(this.nameOfAnimal));
        console.log("Sound of Animal\n");
    };
    return Animal;
}());
var Mammals = /** @class */ (function (_super) {
    __extends(Mammals, _super);
    function Mammals(nameOfAnimal, ageOfAnimal) {
        return _super.call(this, nameOfAnimal, ageOfAnimal) || this;
    }
    Mammals.prototype.soundOfAnimal = function () {
        console.log("I am ".concat(this.nameOfAnimal));
        console.log("My Age is ".concat(this.ageOfAnimal));
        console.log("Bow\n");
    };
    return Mammals;
}(Animal));
var Birds = /** @class */ (function (_super) {
    __extends(Birds, _super);
    function Birds(nameOfAnimal, ageOfAnimal) {
        return _super.call(this, nameOfAnimal, ageOfAnimal) || this;
    }
    Birds.prototype.soundOfAnimal = function () {
        console.log("I am ".concat(this.nameOfAnimal));
        console.log("My Age is ".concat(this.ageOfAnimal));
        console.log("Quack\n");
    };
    return Birds;
}(Animal));
var Fish = /** @class */ (function (_super) {
    __extends(Fish, _super);
    function Fish(nameOfAnimal, ageOfAnimal) {
        return _super.call(this, nameOfAnimal, ageOfAnimal) || this;
    }
    Fish.prototype.soundOfAnimal = function () {
        console.log("I am ".concat(this.nameOfAnimal));
        console.log("My Age is ".concat(this.ageOfAnimal));
        console.log("Grunts\n");
    };
    return Fish;
}(Animal));
var dog = new Mammals("Dog", 8);
dog.soundOfAnimal();
var duck = new Birds("Duck", 6);
duck.soundOfAnimal();
var goldFish = new Fish("Gold Fish", 13);
goldFish.soundOfAnimal();
