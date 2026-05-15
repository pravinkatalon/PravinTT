import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.SIT.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1494, 929)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://pohr.vercel.app"

TrueTestScripts.navigate("/")

"Step 2: Click on input credentials (username)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials_1"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials_1', ['input_credentials_InternalLabel_1': input_credentials_InternalLabel, 'input_credentials_css_value_1': input_credentials_css_value]))

"Step 3: Enter input value in input credentials (username)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials_1"
WebUI.setText(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials_1', ['input_credentials_InternalLabel_1': input_credentials_InternalLabel_1, 'input_credentials_css_value_1': input_credentials_css_value_1]), input_credentials)

"Step 4: Click on input credentials (password)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials_1"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials_1', ['input_credentials_InternalLabel_1': input_credentials_InternalLabel_2, 'input_credentials_css_value_1': input_credentials_css_value_2]))

"Step 5: Enter input value in input credentials (password)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials_1"
WebUI.setText(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_home/input_credentials_1', ['input_credentials_InternalLabel_1': input_credentials_InternalLabel_3, 'input_credentials_css_value_1': input_credentials_css_value_3]), input_credentials_1)

"Step 6: Click on button login -> Navigate to page '/admin/dashboard'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_home/button_login_1'))

"Step 7: Click on button employees -> Navigate to page '/admin/employees'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_dashboard/button_employees_1'))

"Step 8: Click on span icon"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/span_object'))

"Step 9: Click on input search"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/input_search'))

"Step 10: Enter input value in input search"

WebUI.setText(findTestObject('AI-Generated/SIT/Page_admin_employees/input_search'), input_search)

"Step 11: Click on span icon2"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/span_icon2'))

"Step 12: Click on button noManager"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/button_noManager'))

"Step 13: Click on span managerName"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/span_managerName'))

"Step 14: Click on button employeeActions (updateEmployee)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_employees/button_employeeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_employees/button_employeeActions', ['button_employeeActions_InternalRoleButtonName_1': button_employeeActions_InternalRoleButtonName, 'button_employeeActions_css_value_1': button_employeeActions_css_value]))

"Step 15: Acknowledge alert dialog"

TrueTestScripts.acceptAlert()

"Step 16: Click on button employeeActions (updateEmployee)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_employees/button_employeeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_employees/button_employeeActions', ['button_employeeActions_InternalRoleButtonName_1': button_employeeActions_InternalRoleButtonName_1, 'button_employeeActions_css_value_1': button_employeeActions_css_value_1]))

"Step 17: Acknowledge alert dialog"

TrueTestScripts.acceptAlert()

"Step 18: Click on button employeeActions (cancel)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_employees/button_employeeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_employees/button_employeeActions', ['button_employeeActions_InternalRoleButtonName_1': button_employeeActions_InternalRoleButtonName_2, 'button_employeeActions_css_value_1': button_employeeActions_css_value_2]))

"Step 19: Click on button dashboard -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/button_dashboard'))

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('Searching Employee_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}