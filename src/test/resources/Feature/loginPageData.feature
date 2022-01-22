Feature: Login functionality
Scenario: entering valid username and password
Given I load the "https://www.google.com" sample
Then I enter "admin" into the username field
And I enter "admin123" into the password field
Then I click the login button