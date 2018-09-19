# new feature
# Tags: optional
    
Feature: Login to indigo app

#Scenario: Signup with default details
#    Given Regisstration form and User default Data
#    When I signup with given data
#    Then Signup should be sucessfull

Scenario Outline: Login with the given user details
    Given User is on login page
    When I login using "<emailId>" and "<password>" credentials
    Then I should be able to login to system
Examples:
    | emailId    | password |
    | testuser_1 | Test@153 |

