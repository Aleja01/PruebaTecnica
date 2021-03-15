#Autor: Julieth Fiscal
@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course

  @scenario1
  Scenario Outline: Search for a automation course
    Given than Brandon wants to learn automation at the academy Choucair
      | strUser   | strPassword |
      | <strUser> | <strPassword>     |

    When he search for the course on the choucair academy platform
      | strCourse                           |
      | <strCourse> |
    Then he finds the course called
      | strCourse                           |
      | <strCourse> |
    Examples:
      | strUser    | strPassword   | strCourse                           |
      | 1010242315 | Choucair2021* | Recursos Automatizacion Bancolombia |