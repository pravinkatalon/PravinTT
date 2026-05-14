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

"Step 8: Click on button holidays -> Navigate to page '/admin/holidays'"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_employees/button_holidays_1'))

"Step 9: Click on span icon"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_holidays/span_icon'))

"Step 10: Click on input holidayName"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_holidays/input_holidayName'))

"Step 11: Enter input value in input holidayName"

WebUI.setText(findTestObject('AI-Generated/SIT/Page_admin_holidays/input_holidayName'), input_holidayName)

"Step 12: Click on input date"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_holidays/input_date'))

"Step 13: Click on button adminActions (play)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions', ['button_adminActions_InternalRoleButtonName_1': button_adminActions_InternalRoleButtonName, 'button_adminActions_css_value_1': button_adminActions_css_value]))

"Step 14: Click on button adminActions (play)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions', ['button_adminActions_InternalRoleButtonName_1': button_adminActions_InternalRoleButtonName_1, 'button_adminActions_css_value_1': button_adminActions_css_value_1]))

"Step 15: Double-click on button adminActions (play)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions"
WebUI.doubleClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions', ['button_adminActions_InternalRoleButtonName_1': button_adminActions_InternalRoleButtonName_2, 'button_adminActions_css_value_1': button_adminActions_css_value_2]))

"Step 16: Double-click on button adminActions (play)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions"
WebUI.doubleClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions', ['button_adminActions_InternalRoleButtonName_1': button_adminActions_InternalRoleButtonName_3, 'button_adminActions_css_value_1': button_adminActions_css_value_3]))

"Step 17: Click on button adminActions (play)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions', ['button_adminActions_InternalRoleButtonName_1': button_adminActions_InternalRoleButtonName_4, 'button_adminActions_css_value_1': button_adminActions_css_value_4]))

"Step 18: Click on button adminActions (play)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions', ['button_adminActions_InternalRoleButtonName_1': button_adminActions_InternalRoleButtonName_5, 'button_adminActions_css_value_1': button_adminActions_css_value_5]))

"Step 19: Click on button adminActions (number)"

// Bind values to the variables in the locators of "AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions"
WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Dynamic Objects/Page_admin_holidays/button_adminActions', ['button_adminActions_InternalRoleButtonName_1': button_adminActions_InternalRoleButtonName_6, 'button_adminActions_css_value_1': button_adminActions_css_value_6]))

"Step 20: Click on button addHoliday"

WebUI.enhancedClick(findTestObject('AI-Generated/SIT/Page_admin_holidays/button_addHoliday'))

"Step 21: Acknowledge alert dialog"

TrueTestScripts.acceptAlert()

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('Login and Delete All_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}