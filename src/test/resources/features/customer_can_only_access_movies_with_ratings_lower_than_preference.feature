Feature: Customer can only access movies with ratings lower than or equal to their preference

  Background:
    Given parental control levels U, PG, 12, 15, 18
    And the following movies are offered by the service:
      | id | name                | rating |
      | 1  | A Black Friday      | 18     |
      | 2  | Dogs of a Nightmare | 12     |

  Scenario: The customer requests to watch a movie with a rating equal to her parental control level preference and is allowed to watch it.
    Given the customer's parental control level preference is 12
    When the customer requests to watch "Dogs of a Nightmare"
    Then she is allowed to watch it

  Scenario: The customer requests to watch a movie with a rating less than her parental control level preference and is allowed to watch it.
    Given the customer's parental control level preference is 18
    When the customer requests to watch "Dogs of a Nightmare"
    Then she is allowed to watch it

  Scenario: The customer requests to watch a movie with a rating higher than her parental control level preference and is not allowed to watch it.
    Given the customer's parental control level preference is PG
    When the customer requests to watch "Dogs of a Nightmare"
    Then she is not allowed to watch it
