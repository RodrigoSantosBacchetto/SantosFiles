

getPortfolioSharedPeople(portfolioId)

return  "sharedpeople" =     [
                              {
                              "userId":1
                              "lastName":"pepito"
                              "firstName":"pepe"
                              },
                              {
                              "userId":2
                              "lastName":"pepito2"
                              "firstName":"pepe2"
                              },
                              {},
                              ....
                            ]
        
setPortfolioSharedPeople(portfolioId,List<Integer>(una lista de todos los userId),"appuser"(un String))

evaluatorsForStudentEnrolled()
return [
          {
          "userId":1
          "lastName":"pepito"
          "firstName":"pepe"
          },
          {
          "userId":2
          "lastName":"pepito2"
          "firstName":"pepe2"
          },
          {},
          ....
        ]

evaluatorsThatMatchString("String"(alguna cadena con la que se busca concordancia de nombre o apellido))
return [
          {
          "userId":1
          "lastName":"pepito"
          "firstName":"pepe"
          },
          {
          "userId":2
          "lastName":"pepito2"
          "firstName":"pepe2"
          },
          {},
          ....
        ]
