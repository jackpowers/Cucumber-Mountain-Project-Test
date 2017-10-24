$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('Annotation/annotation.feature');
formatter.feature({
  "line": 1,
  "name": "annotation",
  "description": "",
  "id": "annotation",
  "keyword": "Feature"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#This is how background can be used to eliminate duplicate steps"
    }
  ],
  "line": 4,
  "name": "",
  "description": "User navigates to Mountain Project",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on the MountainProject homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Annotation1.goToMountainProject()"
});
formatter.result({
  "duration": 9586140202,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 8,
      "value": "# #Scenario with AND"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "id": "annotation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I search for \"The Nose El Capitan\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on the Nose link in the search results",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I am taken to the Nose page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "The Nose El Capitan",
      "offset": 14
    }
  ],
  "location": "Annotation1.search(String)"
});
formatter.result({
  "duration": 490428634,
  "status": "passed"
});
formatter.match({
  "location": "Annotation1.clickLink()"
});
formatter.result({
  "duration": 1276929153,
  "status": "passed"
});
formatter.match({
  "location": "Annotation1.checkLocation()"
});
formatter.result({
  "duration": 2667423556,
  "status": "passed"
});
});