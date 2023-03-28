function checkForAnagram() {
    
    const stringOne = document.getElementById("wordOne").value;
    const stringTwo = document.getElementById("wordTwo").value;


    if(isAnagram(stringOne, stringTwo)) {
        document.getElementById("result").innerHTML = "Its Anagram";
    } else {
        document.getElementById("result").innerHTML = "Its Not Anagram";
    }

}

function isAnagram(stringOne, stringTwo) {

    if(stringOne.length != stringTwo.length) {
        return false;
    }

    let stringOneTemp = stringOne.split('').sort().join('');
    let stringTwoTemp = stringTwo.split('').sort().join('');

    if(stringOneTemp === stringTwoTemp) {
        return true;
    } else {
        return false;
    }

}