window.addEventListener('load', function () {

       // Al cargar la pagina buscamos y obtenemos el formulario donde estaran
       // los datos que el usuario cargara del nuevo odontologo
       const formulario = document.querySelector('#add_new_odontologo');

       // Ante un submit del formulario se ejecutara la siguiente funcion
       formulario.addEventListener('submit', function (event) {
           event.preventDefault(); // Evitar que el formulario se envíe automáticamente

        // Creamos un JSON que tendra los datos del nuevo odontologo
        const formData = {
            nombre: document.querySelector('#nombre').value,
            apellido: document.querySelector('#apellido').value,
            matricula: document.querySelector('#matricula').value,

        };

        // Invocamos utilizando la funcion FETCH la Api odontologos con el metodo POST
        // que guardara al odontologo que envaremos en formato JSON
        const url = '/odontologos';
        const settings = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }

       fetch(url, settings)
        .then(response => response.json())
        .then(data => {
            //Si no hay ningun error se muestra un mensaje diciendo que el estudiante se agrego bien
            let successAlert = '<div class="alert alert-success alert-dismissible">' +
            '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
            '<strong> Odontologo Agregado <strong></div>'

            document.querySelector('#response').innerHTML = successAlert;
            document.querySelector('#response').style.display = 'block';
            // Se dejan todos los campos vacios por si se quiere ingresar otro Odontologo
            restUploadForm();
        })
        .catch(error => {
            // Si hay algun error se muestra un mensaje diciendo que el odontologo
            // no se pudo guardar y se intente nuevamente
            let errorAlert = '<div class="alert alert-danger alert-dismissible">' +
            '<button type="button" class="close" data-dismiss="alert">&times;</button>' +
            '<strong> Error intente nuevamente </strong> </div>'

            document.querySelector('#response').innerHTML = errorAlert;
            document.querySelector('#response').style.display = 'block';
            // se dejan todos los campos vacios
            restUploadForm();
        })
       })

    function restUploadForm(){
        document.querySelector('#nombre').value = "";
        document.querySelector('#apellido').value = "";
        document.querySelector('#matricula').value = "";
    }

    (function(){
        let pathname = window.location.pathname;
        if(pathname === "/"){
            document.querySelector(".nav .nav-item a:first").addClass("active");
        } else if (pathname == "/odontologoList.html") {
            document.querySelector(".nav .nav-item a:last").addClass("active");
        }
    }) ();

}) ;