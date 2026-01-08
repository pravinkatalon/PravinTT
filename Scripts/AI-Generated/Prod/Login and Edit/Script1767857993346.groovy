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
	WebUI.setViewPortSize(1920, 1080)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on button editDelete (edit)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_editDelete"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_editDelete', ['button_editDelete_buttonInternalText_1': button_editDelete_buttonInternalText, 'button_editDelete_css_value_1': button_editDelete_css_value, 'button_editDelete_sNth_1': button_editDelete_sNth]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on button editDelete edit.png')

"Step 4: Click on input jobTitle"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/input_jobTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on input jobTitle.png')

"Step 5: Enter input value in input jobTitle"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_home/input_jobTitle'), input_jobTitle)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Enter input value in input jobTitle.png')

"Step 6: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_save'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button save.png')

"Step 7: Click on button editDelete (delete)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_editDelete"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_editDelete', ['button_editDelete_buttonInternalText_1': button_editDelete_buttonInternalText_1, 'button_editDelete_css_value_1': button_editDelete_css_value_1, 'button_editDelete_sNth_1': button_editDelete_sNth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button editDelete delete.png')

"Step 8: Click on button logout -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button logout - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('Login and Edit_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}