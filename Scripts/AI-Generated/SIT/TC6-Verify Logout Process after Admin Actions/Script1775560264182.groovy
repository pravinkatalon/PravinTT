import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.SIT.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 928)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on div loginForm"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_home/div_loginForm'))

"Step 3: Click on input username"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_home/input_username'))

"Step 4: Enter input value in input username"

WebUI.setText(findTestObject('AI-Generated/SIT/Page_home/input_username'), input_username)

"Step 5: Click on input password"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_home/input_password'))

"Step 6: Enter input value in input password"

WebUI.setText(findTestObject('AI-Generated/SIT/Page_home/input_password'), input_password)

"Step 7: Click on button login -> Navigate to page '/admin/dashboard'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_home/button_login'))

"Step 8: Click on button employees -> Navigate to page '/admin/employees'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_dashboard/button_employees'))

"Step 9: Click on button holidays -> Navigate to page '/admin/holidays'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/button_holidays'))

// @TT_ASSERTION
// Holiday Page Heading Assertion
tt.TTScripts.validateHolidayPageHeading()
// END TT_ASSERTION

"Step 10: Click on button logout -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_holidays/button_logout'))

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Verify Logout Process after Admin Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}