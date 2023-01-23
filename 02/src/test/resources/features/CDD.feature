#language:es
@BuscarWiki
Característica: COMO usuario
  QUIERO crear un prestamo desde el Web de google
  PARA posteriomente buscar automatización en Wikipedia y
  Comprobar en qué año se hizo el primer proceso automático

  Esquema del escenario: Buscamos automatizacion
  Dado Abrimos la web google
  Cuando ingresamos criterio a buscar "<StrCriterio>"
  Y seleccionar Wikipedia
 Entonces verificar año de primer proceso auotmático

    Ejemplos:
      | StrCriterio  |
      | automatizacion |


