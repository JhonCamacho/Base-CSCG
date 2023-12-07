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
 
//Formatos de registro empleo.
def formatoRegistroEmpleo = ['Cargo':'','Años':'','Empresa':'']
def nuevoRegistro = ['Cargo':'Guarda Seguridad','Años':4,'Empresa':'Securitas']

//Funcion para agregar un nuevo empleo en la informacion del empleado con multiples soluciones.
def AgregarNuevoEmpleo (base , empleado ,empleo){
  base[empleado].Empleos.add([empleo])//De este modo se adicionara en ultima posicion del mapa.
  //base[empleado].Empleos.add(0,[empleo]) //De este modo si se desea adicionar en una posicion especifica.
}
AgregarNuevoEmpleo (baseEmpresa , '72345667' ,nuevoRegistro)


