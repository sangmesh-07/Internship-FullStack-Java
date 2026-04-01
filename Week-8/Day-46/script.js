function addStudent() {

    let name = document.getElementById("name").value;
    let age = document.getElementById("age").value;

    if (name === "" || age === "") {
        alert("Please fill all fields");
        return;
    }

    let table = document.getElementById("tableBody");

    let row = `
        <tr>
            <td>${name}</td>
            <td>${age}</td>
            <td>
                <button class="btn btn-danger btn-sm" onclick="deleteRow(this)">Delete</button>
            </td>
        </tr>
    `;

    table.innerHTML += row;

    // Clear input
    document.getElementById("name").value = "";
    document.getElementById("age").value = "";
}

function deleteRow(btn) {
    btn.parentElement.parentElement.remove();
}