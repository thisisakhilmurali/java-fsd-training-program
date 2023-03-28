class StringValidation extends Error {
    constructor(message) {
        super(message);
    }
}

function stringReverse() {

    const stringInput = document.getElementById("string").value;

    const regExp = /^[A-Za-z0-9 ]*$/;

    try {

        if (regExp.test(stringInput)) {
            document.getElementById("reversed").innerHTML = stringInput.split("").reverse().join("");
        } else {
            throw new StringValidation("Please Enter a Proper English Word");
        }

    } catch (errorMessage) {
        console.error(errorMessage);
    }

}