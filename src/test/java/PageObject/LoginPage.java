package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	// login page
	@FindBy(xpath = "//input[@name='phone']")

	WebElement phonenumber;
	@FindBy(xpath = "//a[contains(text(),'LOGIN WITH PASSWORD')]")

	WebElement LOGINWITHPASSWORD;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement PASSWORD;

	@FindBy(xpath = "//descendant::button[text()='GET OTP'][2]")
	WebElement GetOTPBtn;

	@FindBy(xpath = "//button[text()='VERIFY OTP']")
	WebElement VerifyOtpBtn;

	@FindBy(xpath = "//button[text()='LOGIN']")
	WebElement Login;

	@FindBy(xpath = "//span[text()='Home']")
	WebElement Home;

	public void phonenumber(String number) {
		phonenumber.sendKeys(number);
	}

	public void loginWithPasswordclick() {
		LOGINWITHPASSWORD.click();
	}

	public void Password(String number) {
		PASSWORD.sendKeys(number);
	}

	public void GetOtpbtn() {
		GetOTPBtn.click();
	}

	public void VerifyOtpbtn() {
		VerifyOtpBtn.click();
	}

	public void Loginclick() {
		Login.click();
	}

	public void HomeBtn() {
		Home.click();
	}

// 	Profile
	@FindBy(xpath = "//button[@data-toggle='dropdown']")
	public WebElement ProfileBtn;
	@FindBy(xpath = "//button[text()='Profile ']")
	public WebElement VerifyProfile;
	@FindBy(xpath = "//a[(text()='CHANGE PASSWORD')]")
	public WebElement ChangePassBtn;
	@FindBy(xpath = "//input[@placeholder='Enter Current Password']")
	public WebElement CurrentPassTxb;
	@FindBy(xpath = "//input[@placeholder='Enter New Password']")
	public WebElement NewPasswordTxb;
	@FindBy(xpath = "//input[@placeholder='Confirm New Password']")
	public WebElement ConfirmPassTxb;
	@FindBy(xpath = "//button[text()='RESET PASSWORD']")
	public WebElement ResetPswd;
	@FindBy(xpath = "//button[text()='CLOSE']")
	public WebElement PassUpdatedPopUp;

	public void ProfileDropDownBtn() throws InterruptedException {
		Thread.sleep(3000);
		ProfileBtn.click();
	}

	public void MyProfile() {
		VerifyProfile.click();
	}

	public void ChangePassword() {
		ChangePassBtn.click();
	}

	public void CurrentPswrd(String number) {
		CurrentPassTxb.sendKeys(number);
	}

	public void NewPswrd(String number) {
		NewPasswordTxb.sendKeys(number);
	}

	public void CnfrmPswrd(String number) {
		ConfirmPassTxb.sendKeys(number);
	}

	public void ResetPswrd() {
		ResetPswd.click();
	}

	public void PswrdUpdate() {
		PassUpdatedPopUp.click();
	}

//	Grades
	@FindBy(xpath = "//h3[contains(text(),'Academic Details')]/a[text()='EDIT']")
	public WebElement AcademicEdit;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'1st')]")
	public WebElement Grade1;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'2nd')]")
	public WebElement Grade2;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'3rd')]")
	public WebElement Grade3;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'4th')]")
	public WebElement Grade4;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'5th')]")
	public WebElement Grade5;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'6th')]")
	public WebElement Grade6;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'7th')]")
	public WebElement Grade7;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'8th')]")
	public WebElement Grade8;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'9th')]")
	public WebElement Grade9;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'10th')]")
	public WebElement Grade10;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'11th')]")
	public WebElement Grade11th;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'12th')]")
	public WebElement Grade12;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'13th')]")
	public WebElement Grade13;

	public void AcademicEdit() {
		AcademicEdit.click();
	}

	public void Grade1() {
		Grade1.click();
	}

	public void Grade2() {
		Grade2.click();
	}

	public void Grade3() {
		Grade3.click();
	}

	public void Grade4() {
		Grade4.click();
	}

	public void Grade5() {
		Grade5.click();
	}

	public void Grade6() {
		Grade6.click();
	}

	public void Grade7() {
		Grade7.click();
	}

	public void Grade8() {
		Grade8.click();
	}

	public void Grade9() {
		Grade9.click();
	}

	public void Grade10() {
		Grade10.click();
	}

	public void Grade11() {
		Grade11th.click();
	}

	public void Grade12() {
		Grade12.click();
	}

	public void Grade13() {
		Grade13.click();
	}

//	Streams
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'PCM')]")
	public WebElement SelectPCM;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'PCB')]")
	public WebElement SelectPCB;
	@FindBy(xpath = "//div[@class='UNFAPP-grd-radiobx' and contains(text(),'PCMB')]")
	public WebElement SelectPCMB;

	public void SelectPCM() {
		SelectPCM.click();
	}

	public void SelectPCB() {
		SelectPCB.click();
	}

	public void SelectPCMB() {
		SelectPCMB.click();
	}

//	Boards
	@FindBy(xpath = "//h3[text()='CBSE']")
	public WebElement BoardCBSE;
	@FindBy(xpath = "//h3[text()='ICSE']")
	public WebElement BoardICSE;
	@FindBy(xpath = "//h3[text()='Karnataka Board']")
	public WebElement BoardKarnataka;
	@FindBy(xpath = "//h3[text()='Andhra Pradesh Board']")
	public WebElement BoardAndhra;
	@FindBy(xpath = "//h3[text()='Rajasthan Board']")
	public WebElement BoardRajasthan;
	@FindBy(xpath = "//h3[text()='Madhya Pradesh Board']")
	public WebElement BoardMadhya;
	@FindBy(xpath = "//h3[text()='West Bengal Board']")
	public WebElement BoardWestBengal;
	@FindBy(xpath = "//h3[text()='Goa Board']")
	public WebElement BoardGoa;
	@FindBy(xpath = "//h3[text()='Jammu and Kashmir Board']")
	public WebElement BoardJammu;
	@FindBy(xpath = "//h3[text()='Bihar Board']")
	public WebElement BoardBihar;
	@FindBy(xpath = "//h3[text()='Chhattisgarh Board']")
	public WebElement BoardChhattisgarh;
	@FindBy(xpath = "//h3[text()='Gujarat Board']")
	public WebElement BoardGujarat;
	@FindBy(xpath = "//h3[text()='Haryana Board']")
	public WebElement BoardHaryana;
	@FindBy(xpath = "//h3[text()='Jharkhand Board']")
	public WebElement BoardJharkhand;
	@FindBy(xpath = "//h3[text()='Kerala Board']")
	public WebElement BoardKerala;
	@FindBy(xpath = "//h3[text()='Orissa Board']")
	public WebElement BoardOrissa;
	@FindBy(xpath = "//h3[text()='Punjab Board']")
	public WebElement BoardPunjab;
	@FindBy(xpath = "//h3[text()='Tamil Nadu Board']")
	public WebElement BoardTamil;
	@FindBy(xpath = "//h3[text()='Telangana Board']")
	public WebElement BoardTelangana;
	@FindBy(xpath = "//h3[text()='Uttarakhand Board']")
	public WebElement BoardUttarakhand;
	@FindBy(xpath = "//h3[text()='Uttar Pradesh Board']")
	public WebElement BoardUttar;
	@FindBy(xpath = "//button[text()='SAVE']")
	public WebElement SaveGrade;

	@FindBy(xpath = "//h2[text()='Edit Target Exams']")
	public WebElement VerifyTargetExam;

	@FindBy(xpath = "//button[text()='CLOSE']")
	public WebElement VerifyTargetUpdated;
	@FindBy(xpath = "//button[text()=' BACK ']")
	public WebElement clkBack;

	public void BoardCBSE() {
		BoardCBSE.click();
	}

	public void BoardICSE() {
		BoardICSE.click();
	}

	public void BoardKarnataka() {
		BoardKarnataka.click();
	}

	public void BoardAndhra() {
		BoardAndhra.click();
	}

	public void BoardRajasthan() {
		BoardRajasthan.click();
	}

	public void BoardMadhya() {
		BoardMadhya.click();
	}

	public void BoardWestBengal() {
		BoardWestBengal.click();
	}

	public void BoardGoa() {
		BoardGoa.click();
	}

	public void BoardJammu() {
		BoardJammu.click();
	}

	public void BoardGujarat() {
		BoardGujarat.click();
	}

	public void BoardChhattisgarh() {
		BoardChhattisgarh.click();
	}

	public void BoardBihar() {
		BoardBihar.click();
	}

	public void BoardHaryana() {
		BoardHaryana.click();
	}

	public void BoardJharkhand() {
		BoardJharkhand.click();
	}

	public void BoardKerala() {
		BoardKerala.click();
	}

	public void BoardOrissa() {
		BoardOrissa.click();
	}

	public void BoardPunjab() {
		BoardPunjab.click();
	}

	public void BoardTamil() {
		BoardTamil.click();
	}

	public void BoardTelangana() {
		BoardTelangana.click();
	}

	public void BoardUttarakhand() {
		BoardUttarakhand.click();
	}

	public void BoardUttar() {
		BoardUttar.click();
	}

	public void SaveGrade() {
		SaveGrade.click();
	}

	public void VerifyTargetExam() {
		VerifyTargetExam.click();
	}

	public void VerifyTargetUpdated() {
		VerifyTargetUpdated.click();
	}

	public void clkBack() {
		clkBack.click();
	}

//	Target Exams
	@FindBy(xpath = "//h3[text()='NEET']")
	public WebElement SelectNeet;
	@FindBy(xpath = "//h3[text()='Aptitude Test']")
	public WebElement SelectApt;
	@FindBy(xpath = "//h3[text()='JEE Main']")
	public WebElement SelectJee;
	@FindBy(xpath = "//h3[text()='Foundation Test']")
	public WebElement SelectFound;
	@FindBy(xpath = "//h3[text()='JEE Advanced']")
	public WebElement SelectJeeAdv;
	@FindBy(xpath = "//h3[text()='CBSE']")
	public WebElement SelectCbse;
	@FindBy(xpath = "//h3[text()='CUET']")
	public WebElement SelectCUET;

	public void SelectNeet() {
		SelectNeet.click();
	}

	public void SelectApt() {
		SelectApt.click();
	}

	public void SelectJee() {
		SelectJee.click();
	}

	public void SelectFound() {
		SelectFound.click();
	}

	public void SelectJeeAdv() {
		SelectJeeAdv.click();
	}

	public void SelectCbse() {
		SelectCbse.click();
	}

	public void SelectCUET() {
		SelectCUET.click();
	}

//	Logout
	@FindBy(xpath = "//button[contains(text(),'Logout')]")
	public WebElement LogoutBtn;

	public void LogOut() {
		LogoutBtn.click();
	}

	// Personal Details

	@FindBy(xpath = "//h3[contains(text(),'Personal Details ')]/a[text()='EDIT']")
	public WebElement persnalEdit;
	@FindBy(xpath = "//h3[text()='Basic Details']")
	public WebElement basicdetilsbtn;
	@FindBy(xpath = "//input[@placeholder='Email ID']")
	public WebElement emailID;
	@FindBy(xpath = "//h3[text()='Address']")
	public WebElement Addressbtn;
	@FindBy(xpath = "//input[@formcontrolname='addressLine1']")
	public WebElement enteraddress;
	// @FindBy(xpath ="//select[@placeholder='Select State']")
	// public WebElement clkstate;
	@FindBy(xpath = "//input[@formcontrolname='city']")
	public WebElement clkcity;
	@FindBy(xpath = "//input[@name='pincode']")
	public WebElement clkpincode;
	@FindBy(xpath = "//input[@formcontrolname='guardiansName']")
	public WebElement clkparentName;
	@FindBy(xpath = "//input[@formcontrolname='guardianPhone']")
	public WebElement clkparentNumber;
	@FindBy(xpath = "//button[text()='SAVE']")
	public WebElement saveebtn;
	@FindBy(xpath = "//button[text()='CLOSE']")
	public WebElement clkclose;

	public void PersonalEdit() {
		persnalEdit.click();
	}

	public void EmailId(String number) {
		emailID.sendKeys(number);
	}

	public void Addressbtn() {
		Addressbtn.click();
	}

	public void EnterAddress(String number) {
		enteraddress.sendKeys(number);
	}

	public void City(String number) {
		clkcity.sendKeys(number);
	}

	public void CityPincode(String number) {
		clkpincode.sendKeys(number);
	}

	public void ParentName(String number) {
		clkparentName.sendKeys(number);
	}

	public void ParentNumber(String number) {
		clkparentNumber.sendKeys(number);
	}

	public void Saveebtn() {
		saveebtn.click();
	}

	public void clkclose() {
		clkclose.click();
		;
	}

	// testmodule

	@FindBy(xpath = "//span[text()='Home']")
	public WebElement HomeBtn;
	@FindBy(xpath = "//span[text()='Tests']")
	public WebElement TestBtn;

	public void HomeButton() {
		HomeBtn.click();
	}

	public void TestButton() {
		TestBtn.click();
	}

	// CYOT
	@FindBy(xpath = "//h2[text()='Create Your Own Tests (CYOT)']")
	public WebElement clkcYOT;
	@FindBy(xpath = "//button[text()='Create a new test']")
	public WebElement clkcreatnewtest;
	@FindBy(xpath = "//div[text()=' Chemistry ']")
	public WebElement Chemistry;
	@FindBy(xpath = "//div[text()=' Physics ']")
	public WebElement Physics;
	@FindBy(xpath = "//div[text()=' Botany ']")
	public WebElement Botany;
	@FindBy(xpath = "//div[text()=' Zoology ']")
	public WebElement Zoology;
	@FindBy(xpath = "//button[@class='btn CYOT-stepbtnpopup']")
	public WebElement clkNext;
	@FindBy(xpath = "(//div[text()=' Select all '])[1]")
	public WebElement sltChemistryall;
	@FindBy(xpath = "(//div[text()=' Select all '])[2]")
	public WebElement sltPhysicsall;
	@FindBy(xpath = "(//div[text()=' Select all '])[3]")
	public WebElement sltBotanyall;
	@FindBy(xpath = "(//div[text()=' Select all '])[4]")
	public WebElement sltZoologyall;
	@FindBy(xpath = "//button[@class='btn CYOT-stepbtnpopup']")
	public WebElement clksecondNext;
	@FindBy(xpath = "//div[text()='30 mins ']")
	public WebElement clk30min;
	@FindBy(xpath = "//div[text()='20 ']")
	public WebElement slt20qstn;
	@FindBy(xpath = "//button[text()='Create Test']")
	public WebElement clkcreteTest;
	@FindBy(xpath = "//button[text()=' ATTEMPT TEST']")
	public WebElement attempttestbtn;
	// @FindBy(xpath ="(//button[@type='button'])[7]")
	@FindBy(xpath = "//img[@class='CYOT-steps-crossimg']")
	public WebElement clkCancelBtn;
	@FindBy(xpath = "//button[text()='Attempt now']")
	// @FindBy(xpath ="(//button[text()='Attempt now'])[1]")
	public WebElement clkAttemptNow;
	@FindBy(xpath = "//h3[text()='Test Taking Instructions']")
	public WebElement CYOTTestInstructions;
	@FindBy(xpath = "//button[text()='BEGIN TEST']")
	public WebElement BeginTest;

	public void CYOTCard() {
		clkcYOT.click();
	}

	public void NewTestButton() {
		clkcreatnewtest.click();
	}

	public void ChemistryC() {
		Chemistry.click();
	}

	public void PhysicsC() {
		Physics.click();
	}

	public void BotanyC() {
		Botany.click();
	}

	public void ZoologyC() {
		Zoology.click();
	}

	public void Step1NextBtn() {
		clkNext.click();
	}

	public void Chemistryall() {
		sltChemistryall.click();
	}

	public void Physicsall() {
		sltPhysicsall.click();
	}

	public void Botanyall() {
		sltBotanyall.click();
	}

	public void Zoologyall() {
		sltZoologyall.click();
	}

	public void Step2NextBtn() {
		clksecondNext.click();
	}

	public void timeDuration() {
		clk30min.click();
	}

	public void NumberofQustns() {
		slt20qstn.click();
	}

	public void CreateTest() {
		clkcreteTest.click();
	}

	public void CrossBtn() {
		clkCancelBtn.click();
	}

	public void AttemptTest() {
		attempttestbtn.click();
	}

	public void Instruction() {
		CYOTTestInstructions.click();
	}

	public void BeginTst() {
		BeginTest.click();
	}

	// Infinity logo

	@FindBy(xpath = "//img[contains(@class,'logo')]")
	public WebElement InfinityLogo;

	public void Infinity() {
		InfinityLogo.click();
	}

	// exam page
	@FindBy(xpath = "//input[@id='click1']//parent::div/child::label/p")
	public WebElement RadioBtn1;
	@FindBy(xpath = "//button[text()='SAVE ']")
	public WebElement SaveNext;
	@FindBy(xpath = "//img[@src='assets/img/next-blue-line-arrow.svg']")
	public WebElement FrwdArwBtn;
	@FindBy(xpath = "//button[contains(text(),'REVIEW')]")
	public WebElement ReviewLaterBtn;
	@FindBy(xpath = "//button[contains(text(),'CLEAR')]")
	public WebElement ClearRespnBtn;
	@FindBy(xpath = "//img[@class='icon ng-star-inserted']")
	public WebElement ErrorFlagBtn;
	@FindBy(xpath = "//div[text()='Incorrect Answers Options']")
	public WebElement IncrtAnsoptn;
	@FindBy(xpath = "//div[text()='Incorrect Question']")
	public WebElement IncrtQstn;
	@FindBy(xpath = "//div[text()='Question not clear']")
	public WebElement QstnNtClr;
	@FindBy(xpath = "//input[@placeholder='Add additional feedback here']")
	public WebElement AdtnlFeedBck;
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement SubmitFeedBck;
	@FindBy(xpath = "//button[text()='SUBMIT']")
	public WebElement SubmitBtn;
	@FindBy(xpath = "//button[text()='Finish test']")
	public WebElement FinishTstBtn;
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement FinalSubmitBtn;
	@FindBy(xpath = "//mat-dialog-container//button[text()='CLOSE']")
	public WebElement CloseBtn;

	public void RadioBtn1() {
		RadioBtn1.click();
	}

	public void SaveNext() {
		SaveNext.click();
	}

	public void FrwdArwBtn() {
		FrwdArwBtn.click();
	}

	public void ReviewLaterBtn() {
		ReviewLaterBtn.click();
	}

	public void ClearRespnBtn() {
		ClearRespnBtn.click();
	}

	public void ErrorFlagBtn() {
		ErrorFlagBtn.click();
	}

	public void IncrtAnsoptn() {
		IncrtAnsoptn.click();
	}

	public void IncrtQstn() {
		IncrtQstn.click();
	}

	public void QstnNtClr() {
		QstnNtClr.click();
	}

	public void AdtnlFeedBck(String number) {
		AdtnlFeedBck.sendKeys(number);
		;
	}

	public void SubmitFeedBck() {
		SubmitFeedBck.click();
	}

	public void SubmitBtn() {
		SubmitBtn.click();
	}

	public void FinishTstBtn() {
		FinishTstBtn.click();
	}

	public void FinalSubmitBtn() {
		FinalSubmitBtn.click();
	}

	public void CloseBtn() {
		CloseBtn.click();
	}

	// ILTS OBjects
	
	@FindBy(xpath = "//h2[text()='NEET Infinity Learn Test Series (ILTS)']")
	public WebElement ILTSBtn;
	@FindBy(xpath = "//button[text()='REGISTER NOW']")
	public WebElement registernow;
	@FindBy(xpath = "//button[text()='Attempt now']")
	public WebElement ILTSAttemptnow;
	@FindBy(xpath = "//label[@id='2']")
	public WebElement firstqstnopt2;
	@FindBy(xpath = "//button[text()='SAVE ']")
	public WebElement clkkSaveandNext;
	@FindBy(xpath = "//span[text()='MARK FOR ']")
	public WebElement markforReviewBtnn;
	@FindBy(xpath = "//button[@class='btn-login']")
	public WebElement clksubmitttbtn;
	@FindBy(xpath = "//button[text()='Finish test']")
	public WebElement FinishTestt;
	@FindBy(xpath = "//button[text()='MEDIUM']")
	public WebElement sltMedium;
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement clkkksubmitt;
	@FindBy(xpath = "//button[text()='CLOSE']")
	public WebElement clkkclose;
	@FindBy(xpath = "//span[@class='score-prize']//b")
	public WebElement yourscore;
	@FindBy(xpath = "//button[text()=' BACK']")
	public WebElement clkkbacckkbtn;

	
	public void ILTSBtn() {
		ILTSBtn.click();
	}
	public void registernow() {
		registernow.click();
	}
	public void ILTSAttemptnow() {
		ILTSAttemptnow.click();
	}
	public void firstqstnopt2() {
		firstqstnopt2.click();
	}
	
	public void clkkSaveandNext() {
		clkkSaveandNext.click();
		
	}
	public void clkkclose() {
		clkkclose.click();
		
	}
	
	// RAPDailyTest
	@FindBy(xpath = "//h2[text()='Rank Assurance Program Daily Tests (RAPDT)']")
	public WebElement RAPDT;
	@FindBy(xpath = "(//button[text()='Attempt now'])[1]")
	public WebElement RAPDTAttemptnow;

	// Score

	@FindBy(xpath = "//h2[text()='SCORE']")
	public WebElement ScoreBtn;
	@FindBy(xpath = "//h3[text()='SCORE']")
	public WebElement VerifyScorePage;
	@FindBy(xpath = "//button[text()='ATTEMPT NOW']")
	public WebElement ScoreAtmptNw;
	@FindBy(xpath = "//button[text()='RE-ATTEMPT NOW']")
	public WebElement ScoreReAtmptNw;
	@FindBy(xpath = "//button[text()='REGISTER NOW']")
	public WebElement RegisterBtn;
	@FindBy(xpath = "//button[text()='View Cart']")
	public WebElement ViewCart;
	@FindBy(xpath = "//button[text()='Proceed to Checkout']")
	public WebElement ProcdtoChckoutBtn;
	@FindBy(xpath = "//button[text()='NEXT']")
	public WebElement Nextbtn1;
	@FindBy(xpath = "//button[text()='Save and proceed']")
	public WebElement SaveandPrcdBtn;
	@FindBy(xpath = "//button[text()=' NEXT ']")
	public WebElement Nextbtn2;

	public void ScoreBtn() {
		ScoreBtn.click();
	}

	public void VerifyScorePage() {
		VerifyScorePage.click();
	}

	public void ScoreAtmptNw() {
		ScoreAtmptNw.click();
	}

	public void ScoreReAtmptNw() {
		ScoreReAtmptNw.click();
	}

	public void RegisterBtn() throws InterruptedException {
		Thread.sleep(2000);
		RegisterBtn.click();
	}

	public void ViewCart() throws InterruptedException {
		Thread.sleep(2000);
		ViewCart.click();
	}

	public void ProcdtoChckoutBtn() {
		ProcdtoChckoutBtn.click();
	}

	public void Nextbtn1() {
		Nextbtn1.click();
	}

	public void SaveandPrcdBtn() {
		SaveandPrcdBtn.click();
	}

	public void Nextbtn2() {
		Nextbtn2.click();
	}

	// card deatils
	@FindBy(xpath = "//h3[text()='Card']")
	public WebElement Card;
	@FindBy(xpath = "//input[@placeholder='Name on Card']")
	public WebElement NameonCard;
	@FindBy(xpath = "//input[@placeholder='Card Number']")
	public WebElement CardNumber;
	@FindBy(xpath = "//input[@placeholder='Expiry Date (MM/YY)']")
	public WebElement MMYY;
	@FindBy(xpath = "//input[@placeholder='CVV']")
	public WebElement CVV;
	@FindBy(xpath = "//button[@class='pymnt-blue-btn full-width']")
	public WebElement Pay125;
	@FindBy(xpath = "//button[text()='Get Started']")
	public WebElement GetStarted;

	public void Card() {
		Card.click();
	}

	public void NameonCard(String number) {
		NameonCard.sendKeys(number);
		;
	}

	public void CardNumber(String number) {
		CardNumber.sendKeys(number);
	}

	public void MMYY(String number) {
		MMYY.sendKeys(number);
	}

	public void CVV(String number) {
		CVV.sendKeys(number);
	}

	public void Pay125() {
		Pay125.click();
	}

	public void GetStarted() {
		GetStarted.click();
	}
	// net banking

	@FindBy(xpath = "//h3[text()='Net Banking']")
	public WebElement netbanking;
	@FindBy(xpath = "//h4[text()='ICICI Bank']")
	public WebElement ICICIBank;
	@FindBy(xpath = "//h4[text()='IDBI']")
	public WebElement IDBiBank;
	@FindBy(xpath = "//h4[text()='BOB']")
	public WebElement BOBbank;
	@FindBy(xpath = "//button[@class='pymnt-blue-btn']")
	public WebElement payusingNetbanking;
	@FindBy(xpath = "//button[text()='Success']")
	public WebElement SuccessBtn;
	@FindBy(xpath = "//button[text()='MEDIUM']")
	public WebElement Medium;

	public void netbanking() {
		netbanking.click();
	}

	public void ICICIBank() {
		ICICIBank.click();
	}

	public void IDBiBank() {
		IDBiBank.click();
	}

	public void BOBbank() {
		BOBbank.click();
	}

	public void payusingNetbanking() {
		payusingNetbanking.click();
	}

	public void SuccessBtn() {
		SuccessBtn.click();
	}

	public void Medium() {
		Medium.click();
	}

	// MCT's
	@FindBy(xpath = "//h2[text()='NEET Mock Tests (MCTs)']")
	public WebElement MctBtn;
	
	@FindBy(xpath = "//button[text()='Attempt now'][1]")
	public WebElement MctAttemptNow;
	
	public void MctBtn() {
		MctBtn.click();
	}
	public void MctAttemptNow() {
		MctAttemptNow.click();
	}
	
	
	
	//ilts revamp
	
	@FindBy(xpath = "//h3[@class='ILTSV3-section-lg-hdng']")
	WebElement TestNameDate;
	public void TestNameDate() {
		if(TestNameDate.isDisplayed()) {
			System.out.println("Test Name in reports page is displayed");
			}else {
				System.out.println("Test Name is not available in reports");
			}
		
	}
	
	@FindBy(xpath = "//h3[text()='Generating Detailed Report!']")
	WebElement GeneratingDetailedReport;
	public void GeneratingDetailedReport() {
		GeneratingDetailedReport.isDisplayed();
	}
	
	@FindBy(xpath = "//h4[@class='ILTSV3-report-time']")
	WebElement ReportTime;
	public void ReportTime() {
		ReportTime.isDisplayed();
	}
	
}
