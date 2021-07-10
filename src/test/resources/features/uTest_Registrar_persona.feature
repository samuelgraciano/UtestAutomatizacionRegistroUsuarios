# language: es
Característica: pagina utest.com
  Como persona probador de software
  Quiero ingresar a utest
  Para poder registrarme

  Esquema del escenario: Registrarse en la pagina
    Dado que la persona quiere registrarse en uTest
    Cuando la persona busca la opcion para registrarse
    Entonces debe llenar los datos personales
    |nombre|apellido|correoElectronico|fechaNaciMes|fechaNaciDia|fechaNaciAño|idioma|
    |<nombre>|<apellido>|<correoElectronico>|<fechaNaciMes>|<fechaNaciDia>|<fechaNaciAño>|<idioma>|
    Y debe llenar los datos de su direccion
    |ciudad|codigoPostal|pais|
    |<ciudad>|<codigoPostal>|<pais>|
    Y debe llenar los datos de sus dispositivos
    |computadora|version|idiomaComputador|dispositivoMovil|modelo|sitemaOperativoMovil|
    |<computadora>|<version>|<idiomaComputador>|<dispositivoMovil>|<modelo>|<sitemaOperativoMovil>|
    Y debes crear una contraseña
    |contraseña|
    |<contraseña>|
    Ejemplos:
      |nombre|apellido|correoElectronico|fechaNaciMes|fechaNaciDia|fechaNaciAño|idioma|ciudad|codigoPostal|pais|computadora|version|idiomaComputador|dispositivoMovil|modelo|sitemaOperativoMovil|contraseña|
      |Fredy|Graciano Cardona|gracianito2005@gmail.com|August|22|1986|Spanish|MEDELLIN|054448|Colombia|Linux|Lubuntu|Spanish|Alcatel|Pop C7|Android 4.2.2|Fredy_123#|

