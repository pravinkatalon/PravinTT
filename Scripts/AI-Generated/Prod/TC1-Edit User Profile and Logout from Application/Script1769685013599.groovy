import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


import org.openqa.selenium.Keys

import truetest.Prod.custom.TrueTestScripts as TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

//WebUI.maximizeWindow()
'Step 1: Navigate to /'
TrueTestScripts.navigate('')

'Step 2: Click on html object'

//WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/html_object'))
// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on html object.png')
'Step 3: Login into Application'
TrueTestScripts.login()

'Step 4: Navigate to /'

//TrueTestScripts.navigate("")
// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_editDelete"
'Step 5: Click on button editDelete (edit)'
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_editDelete', [('button_editDelete_ButtonInternalText_1') : button_editDelete_ButtonInternalText
            , ('button_editDelete_css_value_1') : button_editDelete_css_value]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button editDelete edit.png')
// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/input_name"
'Step 6: Click on input name (name)'
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/input_name', [('input_name_css_value_1') : input_name_css_value]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on input name name.png')
// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/input_name"
'Step 7: Enter input value in input name (name)'
WebUI.setText(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/input_name', [('input_name_css_value_1') : input_name_css_value_1]), 
    input_name)

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Enter input value in input name name.png')
'Step 8: Click on button save'
WebUI.enhancedClick(findTestObject('Custom/Page_home/button_save'))


KeywordUtil.logInfo("So far good")
// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button save.png')
// Bind values to the variables in the locators of "AI-Generated/Prod/Dynamic Objects/Page_home/button_editDelete"
'Step 9: Click on button editDelete (delete)'
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Dynamic Objects/Page_home/button_editDelete', [('button_editDelete_ButtonInternalText_1') : button_editDelete_ButtonInternalText_1
            , ('button_editDelete_css_value_1') : button_editDelete_css_value_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button editDelete delete.png')
'Step 10: Click on button logout -> Navigate to page \'\''
WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/button_logout'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button logout - Navigate to page .png')
'Step 11: Take full page screenshot as checkpoint'
WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Edit User Profile and Logout from Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.SetUp
def setup() {
    WebUI.openBrowser('')

    WebUI.setViewPortSize(1440, 749)
}

@com.kms.katalon.core.annotation.TearDown
def teardown() {
    WebUI.closeBrowser()
}

