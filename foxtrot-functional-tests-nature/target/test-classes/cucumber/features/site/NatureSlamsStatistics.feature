 @cleanbrowser

Feature: Site Account Admin Usage Reports via Nature Slams
 
Scenario: As a nature.com site account admin user I should be able to view usage report through SLAMS 
Given I am a SLAM user on nature.com and I navigate to My Site Account 
When I navigate to Statistics page in Nature SLAMS
And I click on link Palgrave Macmillan Journals Usage reports 
Then I should redirect to new MpsInsight site to see palgrave Usage reports
 
Scenario: As a nature.com site account admin user I should be able to view usage report through SLAMS 
Given I am a SLAM user on nature.com and I navigate to My Site Account 
When I navigate to Statistics page in Nature SLAMS
And I click on link Nature Publishing Group usage Reports 
Then I should redirect to new MpsInsight site to see nature Usage reports

