@Login
Feature: Common Concession Management Steps
 
  Scenario Outline: Concession loaded successfully 
 
    Given I open a browser and after I max window I navigate to SF homepage
    When I enter my credentials and login to the page
    Then I click on the Gear icon and open the setup page