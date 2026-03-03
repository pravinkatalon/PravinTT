import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.SIT.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1541, 929)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("")

"Step 2: Click on input loginCredentials (username)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_home/input_loginCredentials"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_home/input_loginCredentials', ['input_loginCredentials_InternalLabel_1': input_loginCredentials_InternalLabel, 'input_loginCredentials_css_value_1': input_loginCredentials_css_value]))

"Step 3: Enter input value in input loginCredentials (username)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_home/input_loginCredentials"
WebUI.setText(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_home/input_loginCredentials', ['input_loginCredentials_InternalLabel_1': input_loginCredentials_InternalLabel_1, 'input_loginCredentials_css_value_1': input_loginCredentials_css_value_1]), input_loginCredentials)

"Step 4: Click on input loginCredentials (password)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_home/input_loginCredentials"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_home/input_loginCredentials', ['input_loginCredentials_InternalLabel_1': input_loginCredentials_InternalLabel_2, 'input_loginCredentials_css_value_1': input_loginCredentials_css_value_2]))

"Step 5: Enter input value in input loginCredentials (password)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_home/input_loginCredentials"
WebUI.setText(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_home/input_loginCredentials', ['input_loginCredentials_InternalLabel_1': input_loginCredentials_InternalLabel_3, 'input_loginCredentials_css_value_1': input_loginCredentials_css_value_3]), input_loginCredentials_1)

"Step 6: Click on button login -> Navigate to page '/admin/dashboard'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_home/button_login'))

"Step 7: Click on button employees -> Navigate to page '/admin/employees'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_dashboard/button_employees'))

"Step 8: Click on span icon"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/span_icon'))

"Step 9: Click on input loginCredentials (usernameLoginId)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_employees/input_loginCredentials"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_employees/input_loginCredentials', ['input_loginCredentials_InternalLabel_13': input_loginCredentials_InternalLabel_4, 'input_loginCredentials_css_value_5': input_loginCredentials_css_value_4]))

"Step 10: Enter input value in input loginCredentials (usernameLoginId)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_employees/input_loginCredentials"
WebUI.setText(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_employees/input_loginCredentials', ['input_loginCredentials_InternalLabel_13': input_loginCredentials_InternalLabel_5, 'input_loginCredentials_css_value_5': input_loginCredentials_css_value_5]), input_loginCredentials_2)

"Step 11: Click on input loginCredentials (password)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_employees/input_loginCredentials"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_employees/input_loginCredentials', ['input_loginCredentials_InternalLabel_13': input_loginCredentials_InternalLabel_6, 'input_loginCredentials_css_value_5': input_loginCredentials_css_value_6]))

"Step 12: Enter input value in input loginCredentials (password)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_employees/input_loginCredentials"
WebUI.setText(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_employees/input_loginCredentials', ['input_loginCredentials_InternalLabel_13': input_loginCredentials_InternalLabel_7, 'input_loginCredentials_css_value_5': input_loginCredentials_css_value_7]), input_loginCredentials_3)

"Step 13: Click on button saveEmployee"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/button_saveEmployee'))

"Step 14: Click on button logout -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/button_logout'))

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('Login and Edit Advanced_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}