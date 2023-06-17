@tag
Feature: T-shirt functionality
 
  Scenario: Select t-shirt fro woman
    Given Launch the browser
    When User enter url and is on home page
    And User Enter the text t-shirt for woman
    And User Enter the text box
    Then User see the list of shirts
    Then User click on particular T-shirt
    Then Click on add to cart button
     
      #@tag2
      #Scenario Outline: Title of your scenario outline
      #Given I want to write a step with <name>
      #When I check for the <value> in step
      #Then I verify the <status> in step
      #
      #Examples:
      #| url          |
      #| amazon.com   |
      #| flipcart.com |
