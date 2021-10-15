
function getReins() {

    let url = 'http://localhost:8080/project-p1/status';

    let section = document.getElementById("bankai");
    section.innerHTML='<div class="spinner-border text-primary"></div>';

    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = receiveData;



    xhttp.open('GET', url, true);

    xhttp.send();

}
 function receiveData() {
        console.log(this.readyState);

        if (this.readyState == 4) {
            let r = this.responseText;

            r = JSON.parse(r);

            console.log(r);
        }
    }

