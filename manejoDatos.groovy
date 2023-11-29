//base de datos
def baseEmpresa = [:]
//Ingreso de empleados a base
baseEmpresa['1014230323']=['Nombre':'Luis','apellido':'Calderon','segnom':'Carlos','nickname':'Lucacal',
'Empleos':[["Cargo":"Gerente de proyecto","Años":2,"Empresa":"Formarte"],["Cargo":"Supervisor","años":3,"Empresa":"ArteBro"],["Cargo":"Operario","años":5,"Empresa":"ArteCroods"]]
 ,"Direccion":"Calle 80 Diagonal 30 - 12"]
 
baseEmpresa['72345667']=['Nombre':'Rodolfo','Apellido':'Perez','Segnom':'Arturo','Nickname':'Ropea',
'Empleos':[["Cargo":"Agente de obra","Años":2,"Empresa":"ConstruNow"],["Cargo":"Maestro","años":5,"Empresa":"RalphDem"],["Cargo":"Ayudante","años":5,"Empresa":"IntConstru"]]
 ,"Direccion":"Calle LAJ 26 # 30 -15"]

baseEmpresa['1012345211']=['Nombre':'Fabio','apellido':'Cruz','segnom':'Alberto','nickname':'Falcru',
'Empleos':[["Cargo":"Supervisor SST","Años":1,"Empresa":"Segurity"],["Cargo":"Analista","años":5,"Empresa":"AnalisetaInc"],["Cargo":"Aprendiz","años":2,"Empresa":"Aprend+"]]
 ,"Direccion":"Carrera 35 # 23-80 Edf.Balcones t2 apt311"]
 
baseEmpresa['101567786']=['Nombre':'Paola','apellido':'Ruiz','segnom':'Andrea','nickname':'Panru',
'Empleos':[["Cargo":"Secretaria","Años":2,"Empresa":"IndustriaInc"],["Cargo":"Auxiliar","años":3,"Empresa":"Axtente"],["Cargo":"Recepcionista","años":5,"Empresa":"Holiday"]]
 ,"Direccion":"Transversal 50 Diagonal 12 -12"]
 
baseEmpresa['1022864345']=['Nombre':'Lorena','apellido':'Rincon','segnom':'Marcela','nickname':'Lomari',
'Empleos':[["Cargo":"Gerente talento humano","Años":2,"Empresa":"Humanoide"],["Cargo":"Supervisor","años":3,"Empresa":"RecursoH"],["Cargo":"Analista","años":5,"Empresa":"TalentX"]]
 ,"Direccion":"Avenida 68 calle 77 - 15"]
 
def fullName (base){
   def listaNombres= []
   def fullNombre = ''
   base.each{ empleado ->
        fullNombre = empleado.value.Nombre +' '+ empleado.value.Segnom +' '+ empleado.value.Apellido +' '+empleado.value.Nickname
        listaNombres.add(fullNombre)
   }
   return listaNombres
 }