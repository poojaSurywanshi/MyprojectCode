Feature: Product Details Page

  Scenario: Check product details page on click
    Given I am on the product listing page
    When I click on a product
    Then I should be redirected to the product details page
    And I should see the product title, price, and description

  Scenario: Verify "Add to Cart" functionality
    Given I am on a product details page
    When I click the "Add to Cart" button
    Then the product should be added to the shopping cart
    And the cart count should be incremented