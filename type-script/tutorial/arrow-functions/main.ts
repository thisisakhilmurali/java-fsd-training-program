let logTheMessage = (message: boolean) => {
    console.log(message);
}

let logTheMessageAgain = () => console.log("Hello Again!");


logTheMessageAgain();

let message;

message = "The Order";

let endsWithR = (<string>message).endsWith('r');
logTheMessage(endsWithR);

// tsc --target ES6 main.ts