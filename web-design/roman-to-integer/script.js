function getTheRoman() {
    const romanDigit = document.getElementById("roman").value;
    const theNumber = romanToInteger(romanDigit);
    document.getElementById("result").innerHTML = theNumber;
}

function romanToInteger(string) {
    if (string == null) return -1;
    var num = characterToInteger(string.charAt(0));
    var pre, curr;

    for (var i = 1; i < string.length; i++) {
        curr = characterToInteger(string.charAt(i));
        pre = characterToInteger(string.charAt(i - 1));
        if (curr <= pre) {
            num += curr;
        } else {
            num = num - pre * 2 + curr;
        }
    }

    return num;
}

function characterToInteger(character) {
    switch (character) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return -1;
    }
}