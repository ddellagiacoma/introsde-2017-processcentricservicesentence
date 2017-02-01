# Process Centric Service Sentence (SOAP)

* **registration:** pass required data to the storage services in order to register a new user, return the id of the person saved.

*	**login:** pass required data to the storage service in order to log in,return the id of the person if succeed.

*	**DailyMotivationalWeatherCalls:** get required data from storage services and calls Business Logic Service Sentences which will generate the sentence, return the sentence generated.

*	**DailyMotivationalCaloriesCalls:** get required data from storage services and calls Business Logic Service Sentences which will generate the sentence, return the sentence generated.

* **All the others service methods** present in the Process centric follow the same logic and their lifecycle and functionalities are basically the same: get required data from storage services and calls Business Logic Service Sentences which will generate the sentence, return the sentence generated.
