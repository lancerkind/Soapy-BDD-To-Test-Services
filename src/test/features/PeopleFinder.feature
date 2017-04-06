Feature: Scan people
Get a list of people.

Scenario: List of all people
Given I am searching for someone
When supplying a location
Then see "Mary Poppins" is there