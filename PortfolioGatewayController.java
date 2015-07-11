

getPortfolioSharedPeople(portfolioId)

return  [
          {
          "userId":1
          "name":"pepito"
          "apellido":"pepe"
          },
          {
          "userId":2
          "name":"pepito2"
          "apellido":"pepe2"
          },
          {},
          ....
        ]
        
setPortfolioSharedPeople(portfolioId,List<Integer>(una lista de todos los userId),"appuser"(un String))

evaluatorsForStudentEnrrolled()
return [
          {
          "userId":1
          "name":"pepito"
          "apellido":"pepe"
          },
          {
          "userId":2
          "name":"pepito2"
          "apellido":"pepe2"
          },
          {},
          ....
        ]

evaluatorsThatMatchString("String"(alguna cadena con la que se busca concordancia de nombre o apellido))
return [
          {
          "userId":1
          "name":"pepito"
          "apellido":"pepe"
          },
          {
          "userId":2
          "name":"pepito2"
          "apellido":"pepe2"
          },
          {},
          ....
        ]
