function EstimateReducingInterestLoan() {

    // Taking the user input
    const principalAmount = parseFloat(document.getElementById("principalAmount").value);
    const interestRatePerAnnum = parseFloat(document.getElementById("interestRate").value);
    const tenure = parseFloat(document.getElementById("tenure").value);
    

    // Fixed Interest Calculator
    const totalInterestFixed = principalAmount * (interestRatePerAnnum / 100) * (tenure / 12);
    const totalPayableFixed = principalAmount + totalInterestFixed;
    const emiFixed = totalPayableFixed / tenure;

    document.getElementById("tInterestFixed").value = totalInterestFixed.toFixed(2).toString();
    document.getElementById("tPaymentFixed").value = totalPayableFixed.toFixed(2).toString();
    document.getElementById("emiFixed").value = emiFixed.toFixed(2).toString();


    // Reducing Interest Calculator
    const interestRatePerMonth = interestRatePerAnnum / (12 * 100);

    const emiReducing = (principalAmount * interestRatePerMonth * Math.pow((1 + interestRatePerMonth), tenure)) / (Math.pow((1 + interestRatePerMonth), tenure) - 1);
    const totalPayableReducing = emiReducing * tenure;
    const totalInterestReducing = totalPayableReducing - principalAmount;

    document.getElementById("tInterest").value = totalInterestReducing.toFixed(2).toString();
    document.getElementById("tPayment").value = totalPayableReducing.toFixed(2).toString();
    document.getElementById("emi").value = emiReducing.toFixed(2).toString();

}