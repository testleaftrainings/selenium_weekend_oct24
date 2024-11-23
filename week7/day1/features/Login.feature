Feature: Login Feature in Leaftaps application
# Background keyword help to optimize the feature file by reducing the pre common test steps for all the scenario/scenario outline under same feature file.
#Background: 
#Given Set the Environment


@login @positive
Scenario: Login scenario with valid credentials
#Given Set the Environment
And Enter the username as 'demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the login button
Then Verify the login is successful

@login @negative
Scenario: Login scenario with invalid credentials
#Given Set the Environment
And Enter the username as 'demo123'
And Enter the password as 'crmsfa'
When Click on the login button
But Verify the login is successful