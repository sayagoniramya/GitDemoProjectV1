@Sanity
Feature: ILTS REVAMP PART03

Scenario:ILTS
  Given User in Student login page
  And User enters Phnenmbr and Clk on login with Pswrd"8801929127"
  And User enters Pswrd and Clk on loginbtn"Pass123"
  Then User Navigate to dashboard and Clk on TestsBtn
  Then Clk on ILTS Card and Clk on RegisterNow and clk on clse
  Then Clk on AttemptNow Btn User navigate to Test Taking Instructions
  Then User navigate to test paper anser the question and save
  Then Clk on SubmitBtn,FinishTstBtn,MediumBtn,FinalSubmitBtn,CloseBtn
  Then User navigate to Genarting Detailed Report then Verify Test Name and Date
  Then Verify Your report will be generated in time