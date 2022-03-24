Feature: Test the Conference Registration website

  Scenario: Verify the feature of the page
    Given User is on home page
    Then Verify the title should be "Conference Registartion"

  Scenario: Validate First Name
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Please fill the First Name"
    And Enter the First Name "Soumili"

  Scenario: Validate Last Name
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Please fill the Last Name"
    And Enter the Last Name "Roy"

  Scenario: Validate Email Address
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Please fill the Email"
    And User enter wrong format email
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Please enter valid Email Id."
    And User enter valid email address

  Scenario: Validate Contact No
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Please fill the Contact No."
    And User enter wrong data that does not start with either 7 or 8 or 9 and does not have 10 digits
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Enter 10-digit Contact no."
    And User enter valid contact number

  Scenario: Validate No of people attending
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Please fill the Number of people attending"
    And User select the no of people attending

  Scenario: Validate Building & Room No
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Please fill the Building & Room No"
    And User enter Building & Room No

  Scenario: Validate Area Name
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Please fill the Area name"
    And User enter area name

  Scenario: Validate City
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Please select city"
    And User select the city

  Scenario: Validate State
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Please select state"
    Then User select the state

  Scenario: Validate Conference full-Access(member) or Conference full-Access(non-member)
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Please Select MemeberShip status"
    And User select the Conference full-Access(member) or Select Conference full-Access(non-member)

  Scenario: Validate Payment Details
    And User click on the link Next without entering any data in the text box
    Then Verify the alert box displays the message "Personal details are validated."
    Then Verify that user navigated to next page "PaymentDetails.html" by URL
    Then Verify the title  "Payment Details" of the page
