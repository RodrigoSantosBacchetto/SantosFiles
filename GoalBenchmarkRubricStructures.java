
//METHOD USED TO SAVE THE GOAL BENCHMARK RUBRIC

respondMessage saveNewBenchmarkRubric(JSONObject)

//JSONObject

newBenchmarkRubric = {
                        name : 'Submit completed document on time',
                        ds : 'ds',
                        goalBenchmarkRubricDescriptors : {
                                                            1 : 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
                                                            2 : 'Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.',
                                                            3 : 'Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.',
                                                            4 : 'Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.',
                                                          }
                      }     
                      
//METHOD USED TO EDIT THE GOAL BENCHMARK RUBRIC

respondMessage editBenchmarkRubric(JSONObject)

//JSONObject

benchmarkRubric = {
                    id : 1,
                    name : 'Submit completed document on time',
                    ds : 'ds',
                    goalBenchmarkRubricDescriptors : {
                                                        1 : 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
                                                        2 : 'Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.',
                                                        3 : 'Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.',
                                                        4 : 'Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.',
                                                      }
                  }   

//METHOD USED TO REMOVE AN EXISTENT GOAL BENCHMARK RUBRIC

respondMessage removeBenchmarkRubric(JSONObject)

//JSONObject

benchmarkRubric = {
                    id : 1
                  }
