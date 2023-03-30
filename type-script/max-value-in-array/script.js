var myNumberList = [];
myNumberList.push(2);
myNumberList.push(21);
myNumberList.push(12);
myNumberList.push(23);
myNumberList.push(25);
myNumberList.push(102);
myNumberList.push(20);
myNumberList.push(13);
myNumberList.push(14);
myNumberList.push(27);
var maxNumber = myNumberList[0];
// using loops
for (var index = 1; index < myNumberList.length; index++) {
    if (myNumberList[index] > maxNumber) {
        maxNumber = myNumberList[index];
    }
}
console.log("Max Number: " + maxNumber);
