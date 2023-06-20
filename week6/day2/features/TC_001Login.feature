Feature: Login functionality of Leaftaps Application

#Background:
#Given Launch the browser
#And Load the url 

@Smoke @Functional
Scenario: Login with Positive credentials
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login Button
Then HomePage should be displayed

@Regression
Scenario: Login with invalid credentials 
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsf'
When Click on Login Button
But ErrorMessage should be displayed





