    $(document).ready(function(){
   
                $("#actualizar-trabajador").click(function(){
                    $.ajax({
                        url:'actualizar-trabajador',
                        method:'put',
                        data :{
                            id:"1",
                            nombre:"Raton",
                            paterno:"Vaquero",
                            materno:"Malo"
                        },
                        success: function(respuesta){
                            $("#resultado-actualizacion").html(respuesta);
                        }
           
                    });   
                });
   
    $(documento).ready(function(){
                $("#Guardar-trabajador").click(function(){
                    $.ajax({
                        url: 'guardar-trabajador',
                        method: 'post',
                        data:{
                            nombre:$("#Nombre").val(),
                            paterno:$("#Paterno").val(),
                            mateno:$("#Materno").val(),
                        },
                        success:function(resultado){
                            $("#resultado-guardar-trabajador").html(resultado);
                        }
                    });
                });
            });
    
});