function checkNumber() {

    let num = document.getElementById("num").value;

    if (num > 0) {
        document.getElementById("result").innerText = "Positive Number";
    } else if (num < 0) {
        document.getElementById("result").innerText = "Negative Number";
    } else {
        document.getElementById("result").innerText = "Zero";
    }
}