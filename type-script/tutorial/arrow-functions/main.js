let logTheMessage = (message) => {
    console.log(message);
};
let logTheMessageAgain = () => console.log("Hello Again!");
logTheMessageAgain();
let message;
message = "The Order";
let endsWithR = message.endsWith('r');
logTheMessage(endsWithR);
