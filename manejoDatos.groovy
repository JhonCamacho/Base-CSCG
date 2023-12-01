//base de datos
def baseEmpresa = [:]
//Ingreso de empleados a base
baseEmpresa['1014230323']=['Nombre':'Luis','Apellido':'Calderon','Segnom':'Carlos','Nickname':'Lucacal',
'Empleos':[["Cargo":"Gerente de proyecto","Años":2,"Empresa":"Formarte"],["Cargo":"Supervisor","Años":3,"Empresa":"ArteBro"],["Cargo":"Operario","Años":5,"Empresa":"ArteCroods"]]
 ,"Direccion":"Calle 80 Diagonal 30 - 12"]
 
baseEmpresa['72345667']=['Nombre':'Rodolfo','Apellido':'Perez','Segnom':'Arturo','Nickname':'Ropea',
'Empleos':[["Cargo":"Agente de obra","Años":2,"Empresa":"ConstruNow"],["Cargo":"Maestro","Años":5,"Empresa":"RalphDem"],["Cargo":"Ayudante","Años":5,"Empresa":"IntConstru"]]
 ,"Direccion":"Calle LAJ 26 # 30 -15"]

baseEmpresa['1012345211']=['Nombre':'Fabio','Apellido':'Cruz','Segnom':'Alberto','Nickname':'Falcru',
'Empleos':[["Cargo":"Supervisor SST","Años":1,"Empresa":"Segurity"],["Cargo":"Analista","Años":5,"Empresa":"AnalisetaInc"],["Cargo":"Aprendiz","Años":2,"Empresa":"Aprend+"]]
 ,"Direccion":"Carrera 35 # 23-80 Edf.Balcones t2 apt311"]
 
baseEmpresa['101567786']=['Nombre':'Paola','Apellido':'Ruiz','Segnom':'Andrea','Nickname':'Panru',
'Empleos':[["Cargo":"Secretaria","Años":2,"Empresa":"IndustriaInc"],["Cargo":"Auxiliar","Años":3,"Empresa":"Axtente"],["Cargo":"Recepcionista","Años":5,"Empresa":"Holiday"]]
 ,"Direccion":"Transversal 50 Diagonal 12 -12"]
 
baseEmpresa['1022864345']=['Nombre':'Lorena','Apellido':'Rincon','Segnom':'Marcela','Nickname':'Lomari',
'Empleos':[["Cargo":"Gerente talento humano","Años":2,"Empresa":"Humanoide"],["Cargo":"Supervisor","Años":3,"Empresa":"RecursoH"],["Cargo":"Analista","Años":5,"Empresa":"TalentX"]]
 ,"Direccion":"Avenida 68 calle 77 - 15"]
 
//Validaciones forma de obtener informacion.
println(baseEmpresa)
println(baseEmpresa.'1014230323'.Empleos)
println(baseEmpresa['1014230323']['Empleos'][2])
println(baseEmpresa.'1014230323'.Empleos[2])
println(baseEmpresa.'1014230323'['Empleos'][2])
println(baseEmpresa.'1014230323'['Direccion'])

 baseEmpresa.each{empleados ->
  println(empleados)
 }
 //Se encuentra una manera en que la funcion puede adicionar un empleado a la base.(pruebas de alcace clave)
 def contratarEmpleado (base, mapaEmpleado){
  mapaEmpleado.each{aspirante  ->
    //println("$aspirante = $informacion")
    //println("$aspirante.key = $aspirante.value")
    registro = aspirante.key
    info = aspirante.value
  }
 base[registro]= info
}
contratarEmpleado(baseEmpresa,nombreMapa)

baseEmpresa.each{empleados ->
  println(empleados)
 }
//Validacion manual del contenido del primer campo de informacion del empleado.
def formatoContratacion = ['Cedula**':['Nombre**':'','Apellido**':'','Segnom':'','Nickname**':'','Empleos':[],'Direccion**':'']]
def nombreMapa=['70569396':['Nombre':'Kevin','Apellido':'Marin','Segnom':'','Nickname':'Paz','Empleos':[],'Direccion':'Av carrera 33 casa esquina verde']]
println(nombreMapa)

//Validacion manual de todos los campos declarados como obligatorios e inicio de la formacion de funcion para validacion generica.
/*
Nombre -> si obligatorio
Apellido -> si obligatorio
segnom -> no obligatorio
nickname -> si obligatorio
Empleos-> no obligatorio
Direccion-> si obligatorio */
if(nombreMapa.'70569396'.Nombre !='' && nombreMapa.'70569396'.Apellido !='' && nombreMapa.'70569396'.Nickname !='' && nombreMapa.'70569396'.Direccion !=''){
  println('Exitoso')
}else{
  println('Valide datos')
}
//Funcion para validar campos obligatorios de la informacion del empleado a contratar.
def validacionCampos(mapaAspirante){
  def resultado =''
  mapaAspirante.each{ aspirante , informacion ->
    if(informacion.Nombre !=''&& informacion.Apellido != '' && informacion.Nickname != '' && informacion.Direccion != ''){
      resultado = 'Aprobado'
    }else{
      resultado = 'Novedad'
    }
  }
 return resultado
}
def validacion=validacionCampos(nombreMapa)
println (validacion)

//Integracion de funciones de validacion y contratacion.
def contratarEmpleado (base, mapaEmpleado){
  if (validacionCampos(mapaEmpleado) == 'Aprobado'){
    mapaEmpleado.each{aspirante  ->
      registro = aspirante.key
      info = aspirante.value
      base[registro]= info
      println('Creacion exitosa')
    }
  }
  else{
    println('Imposible crear, revise datos')
  }
}
contratarEmpleado(baseEmpresa,nombreMapa)

baseEmpresa.each{empleados ->
  println(empleados)
 }
