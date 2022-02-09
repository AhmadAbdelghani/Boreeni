Feature: As a Trade Journal user i should be able to use the functionalities of the application
          Finom Group Tab Functionality 
          Slack Channel tab Functionality
         

  Background: 
    Given I am on the home page of the Stock Trade Tracking application

  @FinumGroupFunctionality @SmokeTests
  Scenario: User should be directed to Finom Group URL when clicking on Finom Group functionality
    When User clicks on finum group functionality
    Then User should be directed to "https://www.finomgroup.com/"
    And Page tiltle should be "Home - Finom Group"

  @SlachChannelFunctionalityLogedIn @SmokeTests
  Scenario: User should be directed to Slack Channel  when clickin on Slack Channel functionality
    When User Clicks on the Slack Channel functionality
    Then User should be Directed to the Slack Channel "PrimeTech_SDET_Batch1 slack channel"

  @SlachChannelFunctionalityNotLogedIn @SmokeTests
  Scenario: User should be directed to default slack channel 
    When User Clicks on the Slack Channel functionality
    Then User should be Directed to the default slack page
