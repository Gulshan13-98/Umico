@ShoppingCart

  Feature:  Manage Shopping Cart As a user I want to manage products in my shopping cart
    So that I can control what I purchase

    Scenario: Add and modify products in the shopping cart
      When user Navigates To The Shopping Cart
      When the user enters the product catalog
      And the user clicks on smart device items from the product catalog
      And the user clicks on mobile phones and smartphones
      And user selects apple iphone pro max desert titanium
      Then product successfully added to shopping cart

    Scenario: Add and modify smartphone in the shopping cart
     Given the user increases the quantity of the smartphone
      When the user decreases the smartphone quantity
      And the smartphone is being removed from the cart
      Then the product was successfully removed from the cart