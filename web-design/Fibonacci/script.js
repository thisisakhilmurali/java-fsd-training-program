function generateFibonacci() {

    let limitOfFib = document.getElementById("inputTerm").value;
    
    let firstTerm = 0;
    let secondTerm = 1;
    let nextTerm;

    let myFibList = [];

    for (let i = 1; i <= limitOfFib; i++) {
        myFibList.push(firstTerm)
        nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
    }

    document.getElementById("result").innerHTML = myFibList;
}