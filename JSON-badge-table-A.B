`BADGE_SCORECARD_SETTINGS`

metodos de elumen:
- que configuracion se está usando?
- guardar configuración.

metodos del student module:
- que configuración se está usando / que es lo que tengo que mostrar?



setBadgeScorecardSettings ()
Entrada:   JSON OBJECT :
{
  "scorecardType" : 'Progress' | 'Completion',
  "types": ["ISLO","PSLO","COURSE_GROUP","COURSE"]}
}

getBadgeScorecardData (student)
Salida: JSON OBJECT :
{
  "types": ["ISLO","PSLO","COURSE_GROUP","COURSE"],
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
