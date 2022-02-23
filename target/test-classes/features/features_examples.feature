Feature: Search Wikipedia from Google
@tag1
  Scenario: Search Wikipedia
    Given We are on Google page
    When We search Wikipedia and select the first result
    Then The title of the article is "Telephone"
