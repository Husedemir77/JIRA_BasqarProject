Feature: Grade Levels page functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully
    Given Navigate to Grade Levels Page
      | setupOne    |
      | parameters  |
      | gradeLevels |

  Scenario: A Grade Levels create

#    Given Navigate to Grade Levels Page
#      | setupOne    |
#      | parameters  |
#      | gradeLevels |


    When  Create a Grade Levels
      | inputName      | ainsanlik2 |
      | inputshortname | io2        |
      | inputOrder     | 2          |
   #   | inputNextGrade | 2nd grade |

    And Check control whether succesfully message displayed


  Scenario: A Grade Levels update
#
#    Given Navigate to Grade Levels Page
#      | setupOne    |
#      | parameters  |
#      | gradeLevels |

    When Update the same Grade Levels
      | ainsanlik2 |

    And Change Data
      | inputName          | ainsanlik3 |
      | inputshortname     | io3      |
      | inputOrder         | 3        |

    And Check control whether succesfully message displayed


  Scenario: A Grade Levels delete
#
#    Given Navigate to Grade Levels Page
#      | setupOne    |
#      | parameters  |
#      | gradeLevels |

    When Delete the edited Grade Levels
      | ainsanlik3    |

    And Check control whether succesfully message displayed