Feature: Login 

@current
Scenario: Login Functionality
Given user navigates to the website "google.com"
When there user logs in through Login Window by using Username as "USER" and Password as "PASSWORD"
Then login must be successful.