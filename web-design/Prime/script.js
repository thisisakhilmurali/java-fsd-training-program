function getPrime() {

    const myList = [1, 2, 3, , 4, 5, 6, 7, 8, 9, 10, 11, 13];

    let isPrime = true;

    let myPrimeList = [];

    myList.forEach(function (element) {
        if (checkPrime(element)) {
            myPrimeList.push(element)
        }
        document.getElementById("q").innerHTML = myPrimeList;
    });    
}


function checkPrime(number) {
    if (number <= 1) {
        return false;
    }
    else {
        for (let i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
