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