function getElements() {
    
    var principleAmount = parseFloat(document.getElementById("amount").value)
    var yearsSelected = parseFloat(document.getElementById("date").value)
    var rateOfInterest = parseFloat(document.getElementById("interest").value)

    var totalAmount = principleAmount + (principleAmount * yearsSelected * rateOfInterest) / 100
   
    document.getElementById("result").value = totalAmount

}