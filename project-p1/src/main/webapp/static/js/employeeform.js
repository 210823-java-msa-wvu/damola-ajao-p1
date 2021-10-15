
let url = 'http://localhost:8080/project-p1/employeeform';

function loadEmployee() {
    let zed = JSON.parse(getCookie("Fname"));
    let red = JSON.parse(getCookie("Lname"));
    //console.log(emp);
    let dataSection = document.getElementById('display');

    let name = document.createElement('h3');
    name.innerHTML = "Welcome," + " " + zed + " "+red;
    dataSection.appendChild(name);
    let details = document.createElement('div');

    dataSection.appendChild(details);
}

//let reinbu = {
//      todayDate: document.getElementById('date').value,
//      time: document.getElementById('time').
//      description: document.getElementById('descript').value,
//      event: document.getElementById('type').value,
//      location: document.getElementById('states').value,
//      cost: document.getElementById('cost').value,
//      grading: document.getElementById('grading').value,
//
//  }



//   let res = await fetch(url, {
//        method: "POST",
//        headers: {"Content-Type": "application/json"},
//        body: JSON.stringify(reinbu)
//    });
//
//    document.getcookie

function addReinbu() {

    // Collect user input...
//     let todayDate: document.getElementById('date').value;
//     let time: document.getElementById('time').value;
//      let description: document.getElementById('descript').value;
//       let  event: document.getElementById('type').value;
//        let location: document.getElementById('states').value;
//         let cost: document.getElementById('cost').value;
//         let grading: document.getElementById('grading').value;

    // and save into an object
   let reinbu = {
         todayDate: document.getElementById('date').value,
         time: document.getElementById('time').
         description: document.getElementById('descript').value,
         event: document.getElementById('type').value,
         location: document.getElementById('states').value,
         cost: document.getElementById('cost').value,
         grading: document.getElementById('grading').value,

     }

    console.log(reinbu);

    // Now we can prepare and send our XMLHttpRequest Object
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (this.readyState == 4 && this.status == 200) {

            let r = this.responseText;
            console.log(r);

        }

    }

    xhttp.open('POST', 'http://localhost:8080/project-p1/static/employee.html', true);

    // because we are sending data in the body, we need to tell our server what to expect
    xhttp.setRequestHeader('Content-Type', 'application/json');

    xhttp.send(JSON.stringify(reinbu));


}


function add() {

    // Collect user input...
//     let todayDate: document.getElementById('date').value;
//     let time: document.getElementById('time').value;
//      let description: document.getElementById('descript').value;
//       let  event: document.getElementById('type').value;
//        let location: document.getElementById('states').value;
//         let cost: document.getElementById('cost').value;
//         let grading: document.getElementById('grading').value;

    // and save into an object
   let reinbu = {
         todayDate: document.getElementById('date').value,
         time: document.getElementById('time').
         description: document.getElementById('descript').value,
         event: document.getElementById('type').value,
         location: document.getElementById('states').value,
         cost: document.getElementById('cost').value,
         grading: document.getElementById('grading').value,

     }

    console.log(reinbu);

    // Now we can prepare and send our XMLHttpRequest Object
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (this.readyState == 4 && this.status == 200) {

            let r = this.responseText;
            console.log(r);

        }

    }

    xhttp.open('POST', 'http://localhost:8080/project-p1/static/employee.html', true);

    // because we are sending data in the body, we need to tell our server what to expect
    xhttp.setRequestHeader('Content-Type', 'application/json');

    xhttp.send(JSON.stringify(reinbu));


}
