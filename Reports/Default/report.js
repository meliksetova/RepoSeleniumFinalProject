$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Darksky/TodayTimeline.feature");
formatter.feature({
  "line": 2,
  "name": "Verify Darksky Timeline",
  "description": "",
  "id": "verify-darksky-timeline",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Verify timeline is displayed in correct format",
  "description": "",
  "id": "verify-darksky-timeline;verify-timeline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Darksky home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I verify timeline is displayed with \u00272\u0027 hours increment \u002712\u0027 times",
  "keyword": "Then "
});
formatter.match({
  "location": "TodayTimelineSD.launchDarksky()"
});
formatter.result({
  "duration": 2556558720,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 37
    },
    {
      "val": "12",
      "offset": 57
    }
  ],
  "location": "TodayTimelineSD.verify(int,int)"
});
formatter.result({
  "duration": 462397868,
  "status": "passed"
});
formatter.after({
  "duration": 88459971,
  "status": "passed"
});
});