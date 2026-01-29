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

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("")

"Step 4: Click on button navigationOptions (reports)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_navigationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_navigationOptions', ['button_navigationOptions_ButtonInternalText_1': button_navigationOptions_ButtonInternalText, 'button_navigationOptions_css_value_1': button_navigationOptions_css_value]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button navigationOptions reports.png')

"Step 5: Click on button navigationOptions (settings)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_navigationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_navigationOptions', ['button_navigationOptions_ButtonInternalText_1': button_navigationOptions_ButtonInternalText_1, 'button_navigationOptions_css_value_1': button_navigationOptions_css_value_1]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on button navigationOptions settings.png')

"Step 6: Click on button navigationOptions (about)"

// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_navigationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_navigationOptions', ['button_navigationOptions_ButtonInternalText_1': button_navigationOptions_ButtonInternalText_2, 'button_navigationOptions_css_value_1': button_navigationOptions_css_value_2]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button navigationOptions about.png')

"Step 7: Click on button logout2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout2'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on button logout2 - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Navigate Through Options and Logout from Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}