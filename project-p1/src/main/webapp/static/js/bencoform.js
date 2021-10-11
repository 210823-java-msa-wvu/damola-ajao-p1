
  // Collect user input...
      let ben_date = document.getElementById('date').value;
      let description = document.getElementById('descript').value;
      let authorLast = document.getElementById('authorL').value;

      // and save into an object
      let data = {
          title: bookTitle,
          author: {
              firstName: authorFirst,
              lastName: authorLast
          }
      }

      console.log(data);

      // Now we can prepare and send our XMLHttpRequest Object
      let xhttp = new XMLHttpRequest();

      xhttp.onreadystatechange = function () {

          if (this.readyState == 4 && this.status == 200) {

              let r = this.responseText;
              console.log(r);

          }

      }

      xhttp.open('POST', 'http://localhost:8080/LibraryServlet/books', true);

      // because we are sending data in the body, we need to tell our server what to expect
      xhttp.setRequestHeader('Content-Type', 'application/json');

      xhttp.send(JSON.stringify(data));

