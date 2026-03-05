import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.SIT.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("")

"Step 2: Click on input credentials (username)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials', ['input_credentials_InternalLabel_1': input_credentials_InternalLabel, 'input_credentials_css_value_1': input_credentials_css_value]))

"Step 3: Enter input value in input credentials (username)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials"
WebUI.setText(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials', ['input_credentials_InternalLabel_1': input_credentials_InternalLabel_1, 'input_credentials_css_value_1': input_credentials_css_value_1]), input_credentials)

"Step 4: Click on input credentials (password)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials', ['input_credentials_InternalLabel_7': input_credentials_InternalLabel_2, 'input_credentials_css_value_3': input_credentials_css_value_2]))

"Step 5: Enter input value in input credentials (password)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials"
WebUI.setText(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials', ['input_credentials_InternalLabel_7': input_credentials_InternalLabel_3, 'input_credentials_css_value_3': input_credentials_css_value_3]), input_credentials_1)

"Step 6: Click on button login -> Navigate to page '/admin/dashboard'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_home/button_login'))

"Step 7: Click on button employees -> Navigate to page '/admin/employees'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_dashboard/button_employees'))

"Step 8: Click on button holidays -> Navigate to page '/admin/holidays'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/button_holidays'))

"Step 9: Click on button employees -> Navigate to page '/admin/employees'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_holidays/button_employees'))

"Step 10: Click on span icon"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/span_object'))

"Step 11: Click on button saveEmployee"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/button_saveEmployee'))

"Step 12: Click on button logout -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/button_logout'))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('Login and Edit_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}