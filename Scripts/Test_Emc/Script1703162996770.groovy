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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://clientloungepreprod.kennedyslaw.local/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/test_emc/Page_Kcg/input_Username'), 'antony.rayappan@kognitivecomputing.com')

WebUI.setEncryptedText(findTestObject('Object Repository/test_emc/Page_Kcg/input_Password'), 'wyx6EfWvX6juPu0xfkeCug==')

WebUI.click(findTestObject('Object Repository/test_emc/Page_Kcg/button_Login'))

WebUI.click(findTestObject('Object Repository/test_emc/Page_Kennedys Client Lounge Site Admin/span_PreProd Aviation EMC DD'))

WebUI.click(findTestObject('Object Repository/test_emc/Page_Kennedys Client Lounge View Claim List/img_kennedys-icon icon-img user-avatar'))

WebUI.click(findTestObject('Object Repository/test_emc/Page_Kennedys Client Lounge View Claim List/div_Sign Out'))

WebUI.closeBrowser()

