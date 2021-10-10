async function login() {

    let url = "http://localhost:8080/static/project-p1/login.html";

    let user = {
        username: document.getElementById('username').value,
        password: document.getElementById('password').value
        job_title: document.getElementById('job_title').value
    }

    console.log(user);

    let res = await fetch(url, {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(user)
    });

    let resJson = await res.json()
    .then(res => {
        console.log(res);
    })
    .catch(error => {
        console.log(error);
    })
    function getCookie(cname) {
        let name = cname + "=";
        let decodedCookie = decodeURIComponent(document.cookie);
        let ca = decodedCookie.split(';');
        for(let i = 0; i <ca.length; i++) {
            let c = ca[i];
            while (c.charAt(0) == ' ') {
                c = c.substring(1);
            }
            if (c.indexOf(name) == 0) {
                return c.substring(name.length, c.length);
            }
        }
        return "";
    }
}
}