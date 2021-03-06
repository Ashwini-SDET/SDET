@activity2_3_HRM

Feature: Testing the OrangeHRM application

Background: User opens the URL
	Given User opens the FF Browser
	When Open the OrangeHRM page and login with credentials provided "orange" and "orangepassword123"
	
@TestCaseThree
Scenario:  Add multiple employees
Scenario Outline: To Add multiple employees using an the Examples table
	Given Find the PIM option in the menu and click it
	When Click the Add button to add a new Employee
	Then Create Login Details checkbox is checked
	And Fill in the required fields using the data from the Examples table and click Save "<fName>" and "<lName>" and "<uName>" and "<password>"
	And Verify that the employees have been created with "<fName>" and "<lName>"
	And Close the Browser
	
Examples:
|fName|lName|uName|password|
|Raniii|Vanduuu|Raniii_Vanduuu|Gmailll@123|
|Chiruuu|Krishivvv|Chiruuu_Krishivvv|Gmailll@123|
|Mishtyyy|Shinniii|Mishtyyy_Shinniii|Hmailll@123|