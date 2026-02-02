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

TrueTestScripts.navigate("")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /"

TrueTestScripts.navigate("")

"Step 4: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_delete'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button delete.png')

"Step 5: Click on button delete2"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_delete'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button delete2.png')

"Step 6: Click on button delete3"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_delete3'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button delete3.png')

"Step 7: Click on button reports"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_reports'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button reports.png')

"Step 8: Click on button logout -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button logout - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('Login and Delete All Employees_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}