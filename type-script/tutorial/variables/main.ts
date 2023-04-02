function doSomething() {

    for(var i = 0; i < 5; i++) {
        console.log(i);
    }

    console.log("Final Value of i: " + i);
}

doSomething();

let a: number;
let b: any;
let c: boolean;
let d: string;
let e: number[] = [1, 2, 3, 4];
let f: any[] = [1, true, "R", 4];

enum Colors {
    Red = 0,
    Blue = 1,
    Purple = 2
};

let bgColor = Colors.Blue;