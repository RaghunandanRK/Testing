Feature: Login functionality

Background:
Given a user is on the landing page of Amazon
When he hovers the pointer over Hello Sign-in menu
And he clicks on Sign-in button in the sub-menu

@TC_102 @login_functionality
Scenario: A user with invalid credentials must get an error message while logging in
And he enters invalid email address in the Email text-box
And he clicks on Continue button
Then he must see the error message - "We cannot find an account with that email address"

Scenario Outline: A user with multiple inalid credentials must get an error message while logging in 
And he enters an invalid email address "<emailId>" in the Email text-box
And he clicks on Continue button
Then he must see the error message - "We cannot find an account with that email address"

Examples:
|emailId|
#|batman554466@gmail.com|
|superman554466@gmail.com|
#|spiderman554466@gmail.com|
#|ironman554466@gmail.com|
#|captainplanet554466@gmail.com|
