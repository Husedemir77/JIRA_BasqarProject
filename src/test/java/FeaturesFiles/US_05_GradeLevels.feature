

Feature: Grade Levels page functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario: A Grade Levels create, update and delete

    Given Navigate to Grade Levels Page
      |setupOne|
      |parameters|
      |citizenships|


    When  Create a Grade Levels
      | inputName      | insanlik |
      | inputshortname | ins      |

    And Check control whether succesfully message displayed



    When Update the same Grade Levels

      | inputSearchName    | insanlik    |
      | inputSearchShrtNam | ins         |
      | inputName          | Muslumanlik |
      | inputshortname     | Muslim      |

    And Check control whether succesfully message displayed




    When Delete the edited Grade Levels
      |inputSearchName|Muslumanlik|
      |inputSearchShrtNam|Muslim|


    And Check control whether succesfully message displayed