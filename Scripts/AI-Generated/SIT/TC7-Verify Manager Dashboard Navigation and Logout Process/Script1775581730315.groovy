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

"Step 2: Click on input username"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_home/input_username'))

"Step 3: Enter input value in input username"

WebUI.setText(findTestObject('AI-Generated/SIT/Page_home/input_username'), input_username)

"Step 4: Click on input password"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_home/input_password'))

"Step 5: Enter input value in input password"

WebUI.setText(findTestObject('AI-Generated/SIT/Page_home/input_password'), input_password)

"Step 6: Click on button login -> Navigate to page '/manager/dashboard'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_home/button_login'))

"Step 7: Click on button teams -> Navigate to page '/manager/teams'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_manager_dashboard/button_teams'))

"Step 8: Click on button projects -> Navigate to page '/manager/projects'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_manager_teams/button_projects'))

// @TT_ASSERTION
// Project Page Verification
tt.TrueTestScripts.projectPageVerification()
// END TT_ASSERTION

"Step 9: Click on button timesheets -> Navigate to page '/manager/approvals'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_manager_projects/button_timesheets'))

"Step 10: Click on button delegations -> Navigate to page '/manager/delegations'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_manager_approvals/button_delegations'))

"Step 11: Click on button logout -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_manager_delegations/button_logout'))

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Verify Manager Dashboard Navigation and Logout Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}