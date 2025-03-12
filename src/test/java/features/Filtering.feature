@Filtering

  Feature: Filtering and Sorting Products

    Scenario: Filtering products
      When the user searches for Smart TV
      When the search results should display Smart TVs
      And the user is on the product listing page
      And the user applies the cheapest first filter
      And  the user applies the  expensive filter
      And the user applies the popular filter
      And the user applies the biggest discount filter
      Then user applies the Newcomers filter