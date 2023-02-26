package StepDefinitions;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {

	public WebDriver driver;
	public LoginPage lp;

	// declartion/initiation of logger

	final static Logger logger = Logger.getLogger(Login.class);

	@Given("User in Student login page")
	public void user_launch_chrome_browser() {

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		logger.info("chrome is successfully");
		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300)); // implicity wait
		lp = new LoginPage(driver);
		driver.get("https://dashboard.devinfinitylearn.in/");
	}

	@And("User enters Phnenmbr and Clk on login with Pswrd{string}")
	public void user_Phonenumber_and_click_on_login_with_password(String Phonenumber) {
		lp.phonenumber(Phonenumber);
		lp.loginWithPasswordclick();
	}

	@And("User enters Pswrd and Clk on loginbtn{string}")
	public void User_enters_Password_and_click_on_loginbtn(String Password) {
		lp.Password(Password);
		lp.Loginclick();
	}

	@And("User enters Phnenmbr and Clk on GetOTP{string}")
	public void User_enters_Phonenumber_and_click_on_GetOTP(String Phonenumber) {
		lp.phonenumber(Phonenumber);
		lp.GetOtpbtn();
	}

	@And("User enters Otp and Clk on Verify OTP btn")
	public void User_enters_Otp_and_click_on_Verify_OTP_btn() {
		lp.VerifyOtpbtn();
	}

	@And("Clk on Prfle Btn and Clk on Logout")
	public void Click_on_Profile_Btn_and_Click_on_Logout() throws InterruptedException {
		lp.ProfileDropDownBtn();
		lp.LogOut();
	}

	@And("Clk on Prfle Btn and Clk on My Prfle")
	public void And_Click_on_Profile_Btn_and_Click_on_My_Profile() throws InterruptedException {
		lp.ProfileDropDownBtn();
		lp.MyProfile();
	}

	@Then("Clk on Change Pswrd enter CurrentPswrd{string}")
	public void Click_on_Change_password_enter_CurrentPassword(String CurrentPassword) throws InterruptedException {
		lp.ChangePassword();
		Thread.sleep(1000);
		lp.CurrentPswrd(CurrentPassword);
	}

	@Then("Enter NewPswrd and confirm NewPswrd{string}")
	public void Enter_NewPassword_and_confirm_NewPassword_as(String NewPassword) throws InterruptedException {
		Thread.sleep(1000);
		lp.NewPswrd(NewPassword);
		lp.CnfrmPswrd(NewPassword);
	}

	@Then("Clk on ResetPswrd then Clk on Pswrd Update Pop")
	public void Then_Click_on_ResetPassword_the_click_on_Pswr_Update_Pop() {
		lp.ResetPswrd();
		lp.PswrdUpdate();

	}

	@And("Clk on Edt Slt Grade1 Board Cbse and Save")
	public void Clk_on_Edt_Slt_Grade1_Board_Cbse_and_Save() throws InterruptedException {
		Thread.sleep(1000);
		lp.AcademicEdit();
		lp.Grade1();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@And("Slt TrgtExm Apt and Save and Vrfy Trgt Updtd pop")
	public void Slt_TrgtExm_Apt_and_Save_and_Vrfy_Trgt_Updtd_pop() throws InterruptedException {
		lp.SelectApt();
		lp.Saveebtn();
		Thread.sleep(2000);
		lp.VerifyTargetUpdated();
	}

	@And("Slt TrgtExm Cbse and Found and Sve Vrfy Trgt Updtd")
	public void Slt_TrgtExm_Cbse_and_Found_and_Sve_Vrfy_Trgt_Updtd() throws InterruptedException {
		lp.SelectCbse();
		lp.SelectFound();
		lp.Saveebtn();
		Thread.sleep(2000);
		lp.VerifyTargetUpdated();

	}

	@And("Slt TrgtExm Cbse Neet Jee and Sve Vrfy Trgt Updtd")
	public void Slt_TrgtExm_Cbse_Neet_Jee_and_Sve_Vrfy_Trgt_Updtd() throws InterruptedException {
		lp.SelectCbse();
		lp.SelectNeet();
		lp.SelectJee();
		lp.Saveebtn();
		Thread.sleep(2000);

		lp.VerifyTargetUpdated();
	}

	@And("Slt TrgtExm Cbse Neet Jee JeeAdv and Sve Vrfy Trgt Updtd")
	public void Slt_TrgtExm_Cbse_Neet_Jee_JeeAdv_and_Sve_Vrfy_Trgt_Updtd() throws InterruptedException {
		lp.SelectCbse();
		lp.SelectNeet();
		lp.SelectJee();
		lp.SelectJeeAdv();
		lp.Saveebtn();
		Thread.sleep(2000);

		lp.VerifyTargetUpdated();
	}

	@And("Slt TrgtExm Cbse Neet Jee JeeAdv CUET and Save Vrfy Trgt Updtd")
	public void Slt_TrgtExm_Cbse_Neet_Jee_JeeAdv_CUET_and_Sve_Vrfy_Trgt_Updtd() throws InterruptedException {
		lp.SelectCbse();
		lp.SelectNeet();
		lp.SelectJee();
		lp.SelectJeeAdv();
		lp.SelectCUET();
		lp.Saveebtn();
		Thread.sleep(2000);

		lp.VerifyTargetUpdated();
	}

	@And("Slt TrgtExm Neet Jee JeeAdv and Save and Vrfy Trgt Updtd")
	public void Slt_TrgtExm_Neet_Jee_JeeAdv_and_Save_and_Vrfy_Trgt_Updtd() throws InterruptedException {
		lp.SelectNeet();
		lp.SelectJee();
		lp.SelectJeeAdv();
		lp.Saveebtn();
		Thread.sleep(2000);

		lp.VerifyTargetUpdated();
	}

	@And("Clk on Edt Slt Grade2 Board Cbse and Save")
	public void Clk_on_Edt_Slt_Grade2_Board_Cbse_and_Save() throws InterruptedException {
		Thread.sleep(1000);
		lp.AcademicEdit();
		lp.Grade2();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@And("Clk on Edt Slt Grade3 Board Cbse and Save")
	public void Clk_on_Edt_Slt_Grade3_Board_Cbse_and_Save() throws InterruptedException {
		Thread.sleep(1000);

		lp.AcademicEdit();
		lp.Grade3();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@And("Clk on Edt Slt Grade4 Board Cbse and Save")
	public void Clk_on_Edt_Slt_Grade4_Board_Cbse_and_Save() throws InterruptedException {
		Thread.sleep(1000);

		lp.AcademicEdit();
		lp.Grade4();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@And("Clk on Edt Slt Grade5 Board Cbse and Save")
	public void Clk_on_Edt_Slt_Grade5_Board_Cbse_and_Save() throws InterruptedException {
		Thread.sleep(1000);
		lp.AcademicEdit();
		lp.Grade5();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@And("Clk on Edt Slt Grade6 Board Cbse and Save")
	public void Clk_on_Edt_Slt_Grade6_Board_Cbse_and_Save() throws InterruptedException {
		Thread.sleep(1000);
		lp.AcademicEdit();
		lp.Grade6();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@And("Clk on Edt Slt Grade7 Board Cbse and Save")
	public void Clk_on_Edt_Slt_Grade7_Board_Cbse_and_Save() throws InterruptedException {
		Thread.sleep(1000);

		lp.AcademicEdit();
		lp.Grade7();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@And("Clk on Edt Slt Grade8 Board Cbse and Save")
	public void Clk_on_Edt_Slt_Grade8_Board_Cbse_and_Save() throws InterruptedException {
		Thread.sleep(1000);

		lp.AcademicEdit();
		lp.Grade8();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@And("Clk on Edt Slt Grade9 Board Cbse and Save")
	public void Clk_on_Edt_Slt_Grade9_Board_Cbse_and_Save() throws InterruptedException {
		Thread.sleep(1000);

		lp.AcademicEdit();
		lp.Grade9();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@And("Clk on Edt Slt Grade10 Board Cbse and Save")
	public void Clk_on_Edt_Slt_Grade10_Board_Cbse_and_Save() throws InterruptedException {
		Thread.sleep(1000);

		lp.AcademicEdit();
		lp.Grade10();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@And("Clk on Edt Slt Grade11 SltPCM Board Tlngna and Save")
	public void Clk_on_Edt_Slt_Grade11_SltPCM_Board_Tlngna_and_Save() throws InterruptedException {
		Thread.sleep(1000);

		lp.AcademicEdit();
		lp.Grade11();
		lp.SelectPCM();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@And("Clk on Edt Slt Grade12 SltPCB Board Tlngna and Save")
	public void Clk_on_Edt_Slt_Grade11_SltPCB_Board_Tlngna_and_Save() throws InterruptedException {
		Thread.sleep(1000);

		lp.AcademicEdit();
		lp.Grade12();
		lp.SelectPCB();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@And("Clk on Edt Slt Grade13 SltPCMB Board Tlngna and Save")
	public void Clk_on_Edt_Slt_Grade11_SltPCMB_Board_Tlngna_and_Save() throws InterruptedException {
		Thread.sleep(1000);

		lp.AcademicEdit();
		lp.Grade13();
		lp.SelectPCMB();
		lp.BoardCBSE();
		lp.Saveebtn();
	}

	@Then("Clk on Personal Deatils Edtbtn and enter Emailid{string}")
	public void Click_on_Personal_Deatils_Editbtn_and_enter_emailid_EmailId(String EmailId) {
		lp.PersonalEdit();
		lp.EmailId(EmailId);
	}

	@Then("Clk on AddressBtn and Enter Address{string}")
	public void Click_on_AddressBtn_and_Enter_Address(String Address) {
		lp.Addressbtn();
		lp.EnterAddress(Address);
	}

	@Then("Enter City {string}")
	public void Enter_City(String City) {
		lp.City(City);
	}

	@Then("Enter PinCode {string}")
	public void Enter_PinCode(String PinCode) {
		lp.CityPincode(PinCode);
	}

	@Then("Enter ParentName {string}")
	public void Enter_Parent_Name(String ParentName) {
		lp.ParentName(ParentName);
	}

	@Then("Enter ParentNumber {string}")
	public void Enter_ParentNumber(String ParentNumber) {
		lp.ParentNumber(ParentNumber);
	}

	@And("Clk on SaveBtn then Clk on close")
	public void Click_on_Close() {
		lp.Saveebtn();
		lp.clkclose();
	}

	@Then("Clk on Infinity Logo")
	public void Clk_on_Infinity_Logo() {
		lp.Infinity();
	}

	@Then("Click on Home")
	public void Click_on_Home() throws InterruptedException {
		Thread.sleep(1000);
		lp.HomeButton();
	}

	@Then("User Navigate to dashboard and Clk on TestsBtn")
	public void Click_on_Tests() {
		lp.TestButton();
	}

	@Then("Clk on Cyot Card and Clk on Create a new test button")
	public void Clk_on_Cyot_Card_and_Click_on_Create_a_new_test_button() throws InterruptedException {
		lp.CYOTCard();
		Thread.sleep(1000);
		lp.NewTestButton();
	}

	@Then("In Step one Slt subject Chemistry physics botany zoology Clk next")
	public void In_Step_one_Select_subject_Chemistry() {
		lp.ChemistryC();
		lp.PhysicsC();
		lp.BotanyC();
		lp.ZoologyC();
		lp.Step1NextBtn();
	}

	@And("Slt TrgtExm Neet and Sve Vrfy Trgt Updtd")
	public void Slt_TrgtExm_Neet_and_Sve_Vrfy_Trgt_Updtd() throws InterruptedException {
		lp.SelectNeet();
		lp.Saveebtn();
		Thread.sleep(1000);
		lp.VerifyTargetUpdated();
	}

	@Then("In Step two Slt all chapters in subject Chemistry physics botany zoology Clk next")
	public void In_Step_two_Select_all_chapters_in_subject_Chemistry() {
		lp.Chemistryall();
		lp.Physicsall();
		lp.Botanyall();
		lp.Zoologyall();
		lp.Step2NextBtn();
	}

	@Then("In Step three Slt timeduration and Number of questions")
	public void In_Step_three_slt_timeduration_of_test_Number_of_questions() {
		lp.timeDuration();
		lp.NumberofQustns();

	}

	@And("Clk on create test btn and AttemptTest")
	public void Click_on_create_test_btn() throws InterruptedException {
		lp.CreateTest();
		Thread.sleep(2000);
		lp.AttemptTest();
	}

	@And("User navigate to Test Taking Instructions and Clk on BeginTest")
	public void Click_on_Test_Taking_Instructions() {
		lp.BeginTst();

	}

	@Then("Click on RadioBtn")
	public void Click_on_RadioBtn() {
		lp.RadioBtn1();
	}

	@Then("Clk on SaveAndNextBtn")
	public void Click_on_SaveAndNextBtn() {
		lp.SaveNext();
	}

	@Then("Click on FrwdBtn")
	public void Click_on_FrwdBtn() {
		lp.FrwdArwBtn();
	}

	@Then("Click on ReviewLtr")
	public void Click_on_ReviewLtr() {
		lp.ReviewLaterBtn();
	}

	@Then("Click on ClearRspnBtn")
	public void Click_on_ClearRspnBtn() {
		lp.ClearRespnBtn();
	}

	@Then("Click on ErrorFlagBtn")
	public void Click_on_ErrorFlagBtn() throws InterruptedException {
		Thread.sleep(2000);
		lp.ErrorFlagBtn();
	}

	@Then("Click on IncrtAnsoptn")
	public void Click_on_IncrtAnsoptn() {
		lp.IncrtAnsoptn();
	}

	@Then("Click on IncrtQstn")
	public void Click_on_IncrtQstn() {
		lp.IncrtQstn();
	}

	@Then("Click on QstnNtClr")
	public void Click_on_QstnNtClr() {
		lp.QstnNtClr();
	}

	@Then("Click on AdtnlFeedBck {string}")
	public void Click_on_AdtnlFeedBck(String AdtnlFeedBck) {
		lp.AdtnlFeedBck(AdtnlFeedBck);
	}

	@Then("Click on SubmitFeedBck")
	public void Click_on_SubmitFeedBck() {
		lp.SubmitFeedBck();
	}

	@Then("Clk on SubmitBtn,FinishTstBtn,MediumBtn,FinalSubmitBtn,CloseBtn")
	public void Click_on_SubmitBtn() {
		lp.SubmitBtn();
		lp.FinishTstBtn();
		lp.Medium();
		lp.FinalSubmitBtn();
		lp.CloseBtn();
	}

	// score

	@Then("Clk on Score Card and Clk on AttempNow")
	public void Click_on_Score_Card() throws InterruptedException {
		Thread.sleep(2000);
		lp.ScoreBtn();
		lp.ScoreAtmptNw();
	}

	@Then("Clk on Score Card and Clk on ScoreReAttemptNow")
	public void Click_on_ScoreReAttemptNow() {
		lp.ScoreBtn();
		lp.ScoreReAtmptNw();
	}

	@Then("Clk on RegisterNow and Clk on ViewCart")
	public void Click_on_RegisterNow() throws InterruptedException {
		lp.RegisterBtn();
		lp.ViewCart();
	}

	@Then("Clk on RegisterNow and Clk on ProcdtoChckoutBtn")
	public void Click_on_ProcdtoChckoutBtn() throws InterruptedException {
		lp.RegisterBtn();
		lp.ProcdtoChckoutBtn();
	}

	@Then("Clk on Nextbtn In My Cart and Billing Infrmt")
	public void Click_on_Nextbtn_In_My_Cart() throws InterruptedException {
		Thread.sleep(1000);
		lp.Nextbtn1();
		lp.Nextbtn2();
	}

	@Then("Clk on Card and Enter NameonCard{string}")
	public void Enter_NameonCard(String NameonCard) throws InterruptedException {
		lp.Card();
		Thread.sleep(1000);
		lp.NameonCard(NameonCard);
	}

	@Then("Enter CardNumber{string}")
	public void Enter_CardNumber(String CardNumber) throws InterruptedException {
		Thread.sleep(1000);
		lp.CardNumber(CardNumber);
	}

	@Then("Enter MMYY{string}")
	public void Enter_MMYY(String MMYY) throws InterruptedException {
		Thread.sleep(1000);
		lp.MMYY(MMYY);
	}

	@Then("Enter CVV and Clk on Pay125{string}")
	public void Enter_CVV(String CVV) throws InterruptedException {
		Thread.sleep(1000);
		lp.CVV(CVV);
		lp.Pay125();
	}

	@Then("Clk on GetStartedBtn navigate to score page")
	public void Click_on_GetStarted_Button() {
		lp.GetStarted();
	}

	@Then("Clk on NetBanking and ICIC and PayUsingNetBanking")
	public void Click_on_NetBanking() throws InterruptedException {
		Thread.sleep(1000);
		lp.netbanking();
		lp.ICICIBank();
		lp.payusingNetbanking();
	}

	@Then("Clk on SuccesBtn")
	public void Click_on_SuccesBtn() throws InterruptedException {
		Thread.sleep(3000);
		lp.SuccessBtn();
	}

	@Then("Clk on ScoreAttemptNow")
	public void Clk_on_AttemptNow() {
		lp.ScoreAtmptNw();
	}

	
	
	@Then("Clk on Mcts Card and Clk on AttemptNow")
	public void Clk_on_Mcts_Card_and_Clk_on_AttemptNow() throws InterruptedException {
		Thread.sleep(1000);
		lp.MctBtn();
		lp.MctAttemptNow();
	}
	
	
	  @Then("Clk on ILTS Card and Clk on RegisterNow and clk on clse")
	  public void Clk_on_ILTS_Card_and_Clk_on_RegisterNow() throws InterruptedException {
		Thread.sleep(1000);
		  lp.ILTSBtn();
		  lp.registernow();
		  lp.clkkclose();
	  }

	  
	  @Then("Clk on AttemptNow Btn")
	  public void Clk_on_AttemptNow_Btn() {
		  lp.ILTSAttemptnow();
	  }
	  
	  @Then("Click on 2ndoptn in 1st Qnd and save")
	  public void Click_on_2ndoptn_in_1st_Qnd_and_save() {
		  lp.firstqstnopt2();
		  lp.clkkSaveandNext();
	  }
	  
	  @Then("Clk on AttemptNow Btn User navigate to Test Taking Instructions")
	  public void Clk_on_AttemptNow_Btn_User_navigate_to_Test_Taking_Instructions() {
		  lp.ILTSAttemptnow();
	  }
	  
	  
	  
	  @Then("User navigate to test paper anser the question and save")
	  public void User_navigate_to_test_paper_anser_the_question_and_save() {
		  lp.firstqstnopt2();
	  }
	  
	  
	  @Then("User navigate to Genarting Detailed Report then Verify Test Name and Date")
	  public void User_navigate_to_Genarting_Detailed_Report() {
		  lp.TestNameDate();
		  
	  }

	  
	  
	  @Then("Verify Your report will be generated in time")
	  public void Verify_Your_report_will_be_generated_in_time() {
		  lp.ReportTime();
	  }
}
