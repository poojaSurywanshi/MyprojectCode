Feature: Wishlist Functionality

  Scenario Outline: Add products to the wishlist
    Given Application url is luanched
    When the user searches for "<Product>" and clicks on "Add to Wishlist"
   And Navigate to the wishlist cart
    Then product should be present in Wishlist

 Scenario Outline: Remove a product from the wishlist
   Given the user has a product in their wishlist
    When the user clicks on Delete btn
    Then the product should be removed from the wishlist
