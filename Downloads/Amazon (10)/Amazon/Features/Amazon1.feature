Feature:Login

  Scenario: Successful login with valid Credentials
    Given User Launch chrome browser
    When some other precondition
    And User opens URL"https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And User Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    And close browser

 