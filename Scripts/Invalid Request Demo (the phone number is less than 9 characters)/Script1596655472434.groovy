import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.mile.app/request-demo')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Full name_name'), 'lili')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Email_email'), 'liliatyopmaildotcom')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Phone number_phone'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_Mileapp  Request Demo/input_Company name_organization_name'), 'PT lili sukses')

WebUI.delay(3)

'Can\'t redirect to Landing page because phone number is invalid'
WebUI.click(findTestObject('Object Repository/Page_Mileapp  Request Demo/button_Request Demo'))

WebUI.delay(15)

WebUI.closeBrowser()

