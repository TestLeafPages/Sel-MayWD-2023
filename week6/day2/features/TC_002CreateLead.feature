Feature: CreateLead functionality of Leaftaps Application



@Sanity
Scenario Outline: CreateLead with multiple data 
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login Button
Then HomePage should be displayed
When Click on CRMSFA link
And Click on Leads link
And Click on CreateLead link
Given Enter Companyname as <companyname>
And Enter Firstname as <firstname>
And Enter Lastname as <lastname>
When Click on Submit Button
Then ViewLeads page should be displayed as <companyname>

Examples:
|companyname|firstname|lastname|
|TestLeaf|Subraja|S|
|Qeagle|Ranjini|R|

