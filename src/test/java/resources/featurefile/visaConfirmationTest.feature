Feature: An Autralian coming to uk for tourism
  for visa confirmation test
@sanity @regression
  Scenario: verify result you will not need visa to come to uk
    Given I am on homepage
    When Click on start button
    And I Select a Nationality 'Australia'
    And I Click on Continue button
    And I Select reason Tourism
    And I Click on Continue button
    Then verify result 'You will not need a visa to come to the UK'


#  .aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths().
  @smoke @regression
  Scenario: verify result 'You need a visa to work in health and care'
    Given I am on home page
    When I Click on start button
    And I Select a Nationality 'Chile'
    And I Click on Continue button
    And I Select reason 'Work, academic visit or business'
    And I Click on Continue button
    And I Select intendent to stay for 'longer than 6 months'
    And I Click on Continue button
    And I Select have planning to work for 'Health and care professional'
    And I Click on Continue button
    Then verify result of 'You need a visa to work in health and care'

# aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card()
  @regression
  Scenario:  verify result 'You may need a visa'
    Given I am on homepage
    And I Click on start button
    And I Select a Nationality 'Colombia'
    And I Click on Continue button
    And I Select reason Join partner or family for a long stay
    And I Click on Continue button
#    And I Select state My partner of family member have uk immigration status 'yes'
    Then verify resultcolombia 'You may need a visa'
