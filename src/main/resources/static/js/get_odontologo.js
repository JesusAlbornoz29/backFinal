window.addEventListener('load', function(){

        (function(){
            // Con fetch invocamos a la API de odontologos con el metodo GET
            // nos devolvera un JSON con una coleccion de odontologos
            const url = '/odontologos/listar';
            const settings = {
            method: 'GET'
            }
            fetch(url, settings)
            .then(response => response.json())
            .then(data => {
                // Recorremos la coleccion de odontologos del JSON
                for(odontologo of data){
                    // Por cada odontologo armaremos una fila de la tabla
                    // cada fila tendra un id que luego nos permitira borra la fila si eliminamos el odontologo

                    var table = document.getElementById("odontologoTable");
                    var odongologoRow = table.insertRow();
                    let tr_id = 'tr_' + odontologo.id;
                    odongologoRow.id = tr_id;


                    // Por cada odontologo creamos un boton delete que agregamos en cada fila para poder eliminar la misma
                    // dicho boton invocara a la funcion de java script deleteByKey que se encargara
                    // de llamar a la API para eliminar al estudiante
                    let deleteButton = '<button>' +
                    ' id=' + '\"' + 'btn_delete_' + odontologo.id + '\"' +
                    ' type="button" onclick="deleteBy('+odontologo.id+')" class="btn btn-danger btn_delete">' +
                    '&times' + '</button>';

                    // Por cada odontologo  creamos un boton que muestra el id y que al hacer clic invocara
                    // a la funcion de java script findBy que se encargara de buscar al odontologo que queremos
                    // modificar y mostrar los datos del mismo en un formulario
                    let updateButton = '<button>' +
                                      ' id=' + '\"' + 'btn_id_' + odontologo.id + '\"' +
                                      ' type="button" onclick="findBy('+odontologo.id+')" class="btn btn-info btn_id">' +
                                      odontologo.id +
                                      '</button>';


                    // haremos cada columna de la fila
                    // Como primer columna pondremos el boton modificar
                    // luego los datos del odontologo
                    // como ultima columna el boton eliminar
                    odongologoRow.innerHTML = '<td>' + updateButton + '</td>' +
                    '<td class=\"td_nombre\"' + odontologo.nombre.toUpperCase() + '</td>' +
                    '<td class=\"td_apellido\">' + odontologo.apellido.toUpperCase() + '</td>' +
                    '<td class=\"td_matricula\">' + odontologo.matricula.toUpperCase() + '</td>' +
                    '<td>' + deleteButton + '</td>';

                };
            })
        })

        (function(){
            let pathname = window.location.pathname;
            if (pathname == "/odontologoList.html") {
                document.querySelector(".nav .nav-item a:last").addClass("active");
            }
        })

})