Feature: annotation 
#This is how background can be used to eliminate duplicate steps 

   Background: 
User navigates to Mountain Project 
      Given I am on the MountainProject homepage 

# #Scenario with AND 
 Scenario: 
      When I search for "The Nose El Capitan" 
      And I click on the Nose link in the search results
      Then I am taken to the Nose page
       

