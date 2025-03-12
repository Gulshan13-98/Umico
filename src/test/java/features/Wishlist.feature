@Wishlist
  Feature: Wishlist function

    Scenario: User adds a product to favorites
      When the user is on the product details page
      And the user clicks on the add to favorites button
      And the product should be added to the favorites list
      And The user removes the product from favorites
      Then There are no products in the selection