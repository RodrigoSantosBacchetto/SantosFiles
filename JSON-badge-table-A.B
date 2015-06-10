`BADGE_SCORECARD_SETTINGS`

metodos de elumen:
- que configuracion se está usando?
- guardar configuración.

metodos del student module:
- que configuración se está usando / que es lo que tengo que mostrar?



getBadgeScorecardSettings ()
Entrada:   JSON OBJECT :
{
  "scorecardType" : 'Progress' | 'Completion',
  "types": ["ISLO","PSLO","COURSEGROUP","COURSE"]}
}

getBadgeScorecardData (student)
Salida: JSON OBJECT :
{
  "types": ["ISLO","PSLO","COURSEGROUP","COURSE"],
  "ISLO" : [
    badgeAndAwards,
    badgeAndAwards,
    badgeAndAwards
  ],
  "PSLO":[],
  .....
}



badgeAndAward: {
  ....
  awards : [{
    ...
  }, {
    ...
  }]
}

ASSESSMENT LEVEL

BadgeScorecard table

Id      Config
