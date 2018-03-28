$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hm.feature");
formatter.feature({
  "line": 1,
  "name": "dvla",
  "description": "",
  "id": "dvla",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "search vehicle number in governament stite",
  "description": "",
  "id": "dvla;search-vehicle-number-in-governament-stite",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@hmp"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "As end user i want to open browser and enter home url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click on start  button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "read registration number from inputfolder and enter",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.as_end_user_i_want_to_open_browser_and_enter_home_url()"
});
formatter.result({
  "duration": 4017336081,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.click_on_start_button()"
});
formatter.result({
  "duration": 3613152548,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.read_registration_number_from_inputfolder_and_enter()"
});
formatter.result({
  "duration": 1002555132,
  "status": "passed"
});
});