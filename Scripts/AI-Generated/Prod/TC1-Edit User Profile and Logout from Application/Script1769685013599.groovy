import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1440, 749)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("")

"Step 2: Click on html object"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on html object.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Navigate to /"

TrueTestScripts.navigate("")

"Step 5: Click on button editDelete (edit)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_editDelete"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_editDelete', ['button_editDelete_ButtonInternalText_1': button_editDelete_ButtonInternalText, 'button_editDelete_css_value_1': button_editDelete_css_value]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button editDelete edit.png')

"Step 6: Click on input name (name)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/input_name"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/input_name', ['input_name_css_value_1': input_name_css_value]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on input name name.png')

"Step 7: Enter input value in input name (name)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/input_name"
WebUI.setText(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/input_name', ['input_name_css_value_1': input_name_css_value_1]), input_name)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Enter input value in input name name.png')

"Step 8: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_save'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button save.png')

"Step 9: Click on button editDelete (delete)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_editDelete"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_editDelete', ['button_editDelete_ButtonInternalText_1': button_editDelete_ButtonInternalText_1, 'button_editDelete_css_value_1': button_editDelete_css_value_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button editDelete delete.png')

"Step 10: Click on button logout -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button logout - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Edit User Profile and Logout from Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}