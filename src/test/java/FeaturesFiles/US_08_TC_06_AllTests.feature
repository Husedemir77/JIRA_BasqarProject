Feature: All Tests


  Scenario: All Tests


    Given Navigate to basqar
    When Enter username and password and click Login button
    Then Navigate to Education Left page
      | Inventory                 |
      | setupButtonUnderInventory |
      | ItemCategory              |
    And  Navigate a new Subject create and save
      | addButton |
    When Create a new Subject send Keys
      | nameInput | YusufS_Java |
    And  Navigate a new Subject create and save
      | userTypeDropdown |
    And Create a new UserType Choice Administrator
    And  Navigate a new Subject create and save
      | saveButton |
    Then User should login successfully
    When Create a new Subject send Keys
      | ItemCategoriesNameInputSearch | YusufS_Java |
    And  Navigate a new Subject create and save
      | searchButton |
    And  Navigate a new Subject create and save
      | ItemCategoriesEditButton |
    When Create a new Subject send Keys
      | nameInput | YusufS_Selenium |
    And  Navigate a new Subject create and save
      | ItemCategoriesCancelButton |
    And Create a new UserType Choice Student
    And  Navigate a new Subject create and save
      | saveButton |
    Then User should login successfully
    When Create a new Subject send Keys
      | ItemCategoriesNameInputSearch | YusufS_Selenium |
    And  Navigate a new Subject create and save
      | searchButton |
    And Delete Subject Categories
      | deleteButton |
      | yesButton    |
    Then User should login successfully
