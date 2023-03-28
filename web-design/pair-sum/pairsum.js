function getPairSum(targetNumber, myList) {
    
    for (let index = 0; index < myList.length; index++) {
       for (let indexInner = 1; indexInner < myList.length; indexInner++) {
           if(myList[index] + myList[indexInner] == targetNumber)
            return [myList[index], myList[indexInner]];
       }
    }

    return null;
}

const myList = [1, 2, 3, 4, 5, 6];
const targetNumber = 11;

const result = getPairSum(targetNumber, myList);

if (getPairSum == null) {
    console.log("No Pair Found")
} else {
    console.log(result);
}

