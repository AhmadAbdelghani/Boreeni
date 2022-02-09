Feature: As a Trade Journal user i should be able to use tools tab functionality
         As a user i should be able to click on it and use the available options
         
    @ToolsTapFunctionalityTest     
    Scenario: User should be able to click tools tab and all the available option 
    Given User is on Trade Journal application home page
    When User click on tools tab
    Then user should see three options "Options Calculator", "Today's Market Info", "Vol ETF/ETN Price Converter"
    
    