function runExample() {

    // Arrow Function
    const multiply = (a, b) => a * b;
    let result = multiply(5, 3);

    document.getElementById("output").innerText = "Result: " + result;

    // Promise Example
    let promise = new Promise(function(resolve, reject) {

        let success = true;

        if (success) {
            resolve("Operation Successful");
        } else {
            reject("Operation Failed");
        }
    });

    promise
        .then(res => {
            document.getElementById("output").innerText += "\n" + res;
        })
        .catch(err => {
            document.getElementById("output").innerText += "\n" + err;
        });
}