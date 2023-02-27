Feature: Regression Testing
 
  @Sanity
  Scenario: Login with valid credentials
  Given User in Student login page
  And User enters Phnenmbr and Clk on login with Pswrd"8333826402"
  And User enters Pswrd and Clk on loginbtn"Pass123"
  
  @Sanity
  Scenario: Login with Otp
  Given User in Student login page
  And User enters Phnenmbr and Clk on GetOTP"8333826402"
  And User enters Otp and Clk on Verify OTP btn
  
  @Sanity
  Scenario: Login and Logout
  Given User in Student login page
  And User enters Phnenmbr and Clk on login with Pswrd"8333826402"
  And User enters Pswrd and Clk on loginbtn"Pass123"
  And Clk on Prfle Btn and Clk on Logout
  
  @Sanity
  Scenario: Change Pswrd
  Given User in Student login page
  And User enters Phnenmbr and Clk on login with Pswrd"8333826402"
  And User enters Pswrd and Clk on loginbtn"Pass123"
  And Clk on Prfle Btn and Clk on My Prfle
  And Clk on Change Pswrd enter CurrentPswrd"Pass123"
  Then Enter NewPswrd and confirm NewPswrd"Pass123"
  Then Clk on ResetPswrd then Clk on Pswrd Update Pop
  
  @Sanity
  Scenario: Update Prfle
  Given User in Student login page
  And User enters Phnenmbr and Clk on login with Pswrd"8333826402"
  And User enters Pswrd and Clk on loginbtn"Pass123"
  And Clk on Prfle Btn and Clk on My Prfle
  And Clk on Edt Slt Grade1 Board Cbse and Save
  And Slt TrgtExm Apt and Save and Vrfy Trgt Updtd pop
  And Clk on Edt Slt Grade2 Board Cbse and Save
  And Slt TrgtExm Apt and Save and Vrfy Trgt Updtd pop
  And Clk on Edt Slt Grade3 Board Cbse and Save
  And Slt TrgtExm Apt and Save and Vrfy Trgt Updtd pop
  And Clk on Edt Slt Grade4 Board Cbse and Save
  And Slt TrgtExm Apt and Save and Vrfy Trgt Updtd pop
  And Clk on Edt Slt Grade5 Board Cbse and Save
  And Slt TrgtExm Apt and Save and Vrfy Trgt Updtd pop
  And Clk on Edt Slt Grade6 Board Cbse and Save
  And Slt TrgtExm Cbse and Found and Sve Vrfy Trgt Updtd 
  And Clk on Edt Slt Grade7 Board Cbse and Save
  And Slt TrgtExm Cbse and Found and Sve Vrfy Trgt Updtd 
  And Clk on Edt Slt Grade8 Board Cbse and Save
  And Slt TrgtExm Cbse and Found and Sve Vrfy Trgt Updtd 
  And Clk on Edt Slt Grade9 Board Cbse and Save
  And Slt TrgtExm Cbse Neet Jee and Sve Vrfy Trgt Updtd
  And Clk on Edt Slt Grade10 Board Cbse and Save
  And Slt TrgtExm Cbse Neet Jee and Sve Vrfy Trgt Updtd
  And Clk on Edt Slt Grade11 SltPCM Board Tlngna and Save
  And Slt TrgtExm Cbse Neet Jee JeeAdv and Sve Vrfy Trgt Updtd
  And Clk on Edt Slt Grade12 SltPCB Board Tlngna and Save
  And Slt TrgtExm Cbse Neet Jee JeeAdv CUET and Save Vrfy Trgt Updtd
  And Clk on Edt Slt Grade13 SltPCMB Board Tlngna and Save
  And Slt TrgtExm Neet Jee JeeAdv and Save and Vrfy Trgt Updtd
 
  
  Scenario: Update Personal details
  Given User in Student login page
  And User enters Phnenmbr and Clk on login with Pswrd"8333826402"
  And User enters Pswrd and Clk on loginbtn"Pass123"
  And Clk on Prfle Btn and Clk on My Prfle
  Then Clk on Personal Deatils Edtbtn and enter Emailid"test@gmail.com"
  Then Clk on AddressBtn and Enter Address"suchithra"
  Then Enter City "hyderabad"
  Then Enter PinCode "500011"
  Then Enter ParentName "Dinesh"
  Then Enter ParentNumber "8888855555"
  Then Clk on SaveBtn then Clk on close
  
  
  @Sanity
  Scenario: Update Grade 11
  Given User in Student login page
  And User enters Phnenmbr and Clk on login with Pswrd"8333826402"
  And User enters Pswrd and Clk on loginbtn"Pass123"
  And Clk on Prfle Btn and Clk on My Prfle
  And Clk on Edt Slt Grade11 SltPCM Board Tlngna and Save
  And Slt TrgtExm Cbse Neet Jee JeeAdv and Sve Vrfy Trgt Updtd
  
  Scenario: CYOT
  Given User in Student login page
  And User enters Phnenmbr and Clk on login with Pswrd"8801929127"
  And User enters Pswrd and Clk on loginbtn"Pass123"
  And Clk on Prfle Btn and Clk on My Prfle
  And Clk on Edt Slt Grade11 SltPCM Board Tlngna and Save
  And Slt TrgtExm Neet and Sve Vrfy Trgt Updtd
  Then Clk on Infinity Logo
  Then User Navigate to dashboard and Clk on TestsBtn
  Then Clk on Cyot Card and Clk on Create a new test button
  Then In Step one Slt subject Chemistry physics botany zoology Clk next
  Then In Step two Slt all chapters in subject Chemistry physics botany zoology Clk next
  Then In Step three Slt timeduration and Number of questions
  And Clk on create test btn and AttemptTest
  And User navigate to Test Taking Instructions and Clk on BeginTest
  Then Clk on SaveAndNextBtn
  Then Clk on SubmitBtn,FinishTstBtn,MediumBtn,FinalSubmitBtn,CloseBtn
  
  Scenario: Score
  Given User in Student login page
  And User enters Phnenmbr and Clk on login with Pswrd"9059759748"
  And User enters Pswrd and Clk on loginbtn"Pass123"
  Then User Navigate to dashboard and Clk on TestsBtn
  Then Clk on Score Card and Clk on AttempNow
  Then User navigate to Test Taking Instructions and Clk on BeginTest
  Then Clk on SubmitBtn,FinishTstBtn,MediumBtn,FinalSubmitBtn,CloseBtn
  
  Scenario:ILTS
  Given User in Student login page
  And User enters Phnenmbr and Clk on login with Pswrd"8801929127"
  And User enters Pswrd and Clk on loginbtn"Pass123"
  Then User Navigate to dashboard and Clk on TestsBtn
  Then Clk on ILTS Card and Clk on RegisterNow and clk on clse
  Then Clk on AttemptNow Btn User navigate to Test Taking Instructions
  Then User navigate to test paper anser the question and save
  Then Clk on SubmitBtn,FinishTstBtn,MediumBtn,FinalSubmitBtn,CloseBtn
  
 
  
  @Sanity
  Scenario:Mocktest
  Given User in Student login page
  And User enters Phnenmbr and Clk on login with Pswrd"9059759748"
  And User enters Pswrd and Clk on loginbtn"Pass123"
  Then User Navigate to dashboard and Clk on TestsBtn
  Then Clk on Mcts Card and Clk on AttemptNow
  Then User navigate to Test Taking Instructions and Clk on BeginTest
  Then Clk on SubmitBtn,FinishTstBtn,MediumBtn,FinalSubmitBtn,CloseBtn
  
  