document.getElementById("btn").addEventListener("click", function() {

    let number = document.getElementById("num").value;

    if (number % 2 == 0) {
        document.getElementById("result").innerText = "Even Number";
    } else {
        document.getElementById("result").innerText = "Odd Number";
    }

});