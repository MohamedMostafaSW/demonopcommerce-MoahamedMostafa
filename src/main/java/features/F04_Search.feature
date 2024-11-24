@smoke
  Feature: FO4_Search | user could search for anyThing he want
    Scenario Outline: user could search using product name
      When user click on search "<product>"
      Then user could see relative "<product>"
      Examples:
      | product|
      |book    |
      |laptop  |
      |nike    |
    Scenario Outline: user could search product using sku
      When user click on search "<product>"
      Then user could see relative "<product>"
      Examples:
      | product|
      | SCI_FAITH  |
      | APPLE_CAM |
      | SF_PRO_11 |

