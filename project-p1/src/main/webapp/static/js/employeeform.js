
let url = 'http://localhost:8080/project-p1/employeeform';

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

function goabol(){
 console.log("Begin again")
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
//console.log(JSON.stringify(reinbu));
//
//    function handleSubmit(event) {
//      event.preventDefault();
//
//      const data = new FormData(event.target);
//
//      const value = data.get('email');
//
//      console.log({ value });
//    }
//    /*--Event Listeners--*/
//    const sampleForm = document.querySelector("#sampleForm");
//    if(sampleForm) {
//        sampleForm.addEventListener("submit", function(e) {
//            submitForm(e, this);
//        });
//    }
//
//async function submitForm(e, form) {
//    // 1. Prevent reloading page
//    e.preventDefault();
//    // 2. Submit the form
//    // 2.1 User Interaction
//    const btnSubmit = document.getElementById('btnSubmit');
//    btnSubmit.disabled = true;
//    setTimeout(() => btnSubmit.disabled = false, 2000);
//    // 2.2 Build JSON body
//    const jsonFormData = buildJsonFormData(form);
//    // 2.3 Build Headers
//    const headers = buildHeaders();
//    // 2.4 Request & Response
//    const response = await fetchService.performPostHttpRequest(`https://jsonplaceholder.typicode.com/posts`, headers, jsonFormData); // Uses JSON Placeholder
//    console.log(response);
//    // 2.5 Inform user of result
//    if(response)
//        window.location = `/static/submissioncomplete.html`;
//    else
//        alert(`An error occured.`);
//}
//    const form = document.querySelector('form');
//    form.addEventListener('submit', handleSubmit);