  @smoke
  Feature: Homepage Functionality

  Scenario: Verify that the homepage loads successfully
    Given I open the homepage
    Then I should see the homepage title
    And I should see product categories and banners
@skip
  Scenario: Test the "Sign In" button functionality
    Given I am on the homepage
    When I click on the Sign In button
    Then I should be redirected to the login page

@skip
  Scenario: Test the "Sign Up" button functionality
    Given I am on the homepage
    When I click on the "Sign Up" button
    Then I should see the registration form


  Scenario: Verify product categories on homepage
    Given I am on the homepage
    Then I should see all product categories listed

