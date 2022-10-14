@sc1
Feature: Login page
  Scenario:Login with valid credentials
    Given Open the application in url
    When enter valid username and password
    Then Login should be successfully