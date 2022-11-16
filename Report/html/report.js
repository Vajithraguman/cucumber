$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Flip.feature");
formatter.feature({
  "name": "",
  "description": "  To validate flipkart username and password",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Flipkart"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To pass valid flipkart url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.to_pass_valid_flipkart_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate username and passeword field using invalid password and username",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flipkart"
    }
  ]
});
formatter.step({
  "name": "To pass username and password",
  "rows": [
    {
      "cells": [
        "Username",
        "vajith"
      ]
    },
    {
      "cells": [
        "password",
        "8870"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.to_pass_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.click_login_field()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "To pass valid flipkart url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.to_pass_valid_flipkart_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate username and passeword field using invalid password and valid username",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Flipkart"
    }
  ]
});
formatter.step({
  "name": "To pass valid username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "vajith",
        "8870"
      ]
    },
    {
      "cells": [
        "raguman",
        "78685"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.to_pass_valid_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login secondfield",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.click_login_secondfield()"
});
formatter.result({
  "status": "passed"
});
});