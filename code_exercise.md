## API consumer can get tag metadata 

We would like to provide industrial analytics to our users using a third party product called TrendMiner. 
To enable this feature we need to implement an API to provide data to the third party. One of the required services must return tag metadata. 

### Request
 
#### Endpoint
```text
GET /api/v2/tags
```
#### Parameters

Name | Type | Required| Description | Schema
------------ | ------------- | ------------- | ------------- | ------------- |  
historianName |Query | Yes | The name of the historian to list tags of. | string

### Response

HTTP Code | Description | Required | Schema 
------------ | ------------- | ------------- | ------------- |  
200 | OK | Yes | Array of TagDetails | 
500 | Server Error | Yes | SystemException |

#### TagDetails

Name | Required | Description | Schema 
------------ | ------------- | ------------- |  ------------- | 
Description | Yes | The description of the tag | string |
Name | Yes | The name of the tag | string |
Type | Yes | The tag type | enum (ANALOG, DIGITAL, DISCRETE, STRING) |
Units | Yes | The unit the tag belongs to | string |

### Example Response

```json
[
  {
    "Name":"React5_temp001",
    "Description":"Reactor 5 - Cooling water temperature",
    "Units":"C",
    "Type":"ANALOG"
  },
  {
    "Name":"React5_press",
    "Description":"Reactor 5 - Top pressure",
    "Units":"",
    "Type":"ANALOG"
  },
  {
    "Name":"React5_phas",
    "Description":"Reactor 5 - Production Phases",
    "Units":"",
    "Type":"STRING"
  }
]
```
## Your challange
Build a REST API service that returns a list of tag metadata based on the documentation above.


### Notes about the implementation
- The responses specified above is the minimum required responses needed in the implementation. If you decide to implement additional responses (e.g. 4xx client errors and/or 5xx server errors) you are welcome to do so.
- Tests and updating the `README` to describe the functionality are expected.  

### How to submit your solution
- Do not fork the time-series-service repository on GitHub or submit a pull request directly, as that would make your solution public for others to see. Instead, clone the repo and work locally on it.
- When done, squash your work into a single commit and use `git format-patch` to generate a patch file.

## Built with

- Java 11
- [Quarkus](https://quarkus.io/)
- [Gradle](https://gradle.org/) (See [Quarkus with Gradle guide](https://quarkus.io/guides/gradle-tooling))
- JUnit 5
- RestEasy

## Getting started

Build the application with:
```text
./gradlew clean build
```

Run the application in development mode with:
```text
./gradlew quarkusDev
```
Changes you do to the application are automatically reflected in the running application.

Hit CTRL+C to stop the application


## Good luck!