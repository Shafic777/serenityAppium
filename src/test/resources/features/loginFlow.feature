# new feature
# Tags: optional
    
Feature: A description
    
Scenario Outline: A scenario
    Given User is on login page
    When I login using "<emailId>" and "<password>" credentials
    Then I should be able to login to system
Examples:
    | emailId    | password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |

