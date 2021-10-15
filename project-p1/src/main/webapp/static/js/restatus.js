function load() {
    document.getCoo




}

function populateData(res) {
     let dataSection = document.getElementById('data');

     let name = document.createElement('h1');
     name.innerHTML = "Hello" + " " + res.firstname + " " + res.lastname;
     dataSection.appendChild(name);
     }
function getRein() {

    let url = 'http://localhost:8080/project-p1/static/status';

    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = receiveData;

    function receiveData() {
        console.log(this.readyState);

        if (this.readyState == 4) {
            let r = this.responseText;

            r = JSON.parse(r);

            console.log(r);
        }
    }

    xhttp.open('GET', url, true);

    xhttp.send();

}
function populateData(res) {
     let dataSection = document.getElementById('data');

     let name = document.createElement('h1');
     name.innerHTML = "Hello" + " " + res.firstname + " " + res.lastname;
     dataSection.appendChild(name);

}

