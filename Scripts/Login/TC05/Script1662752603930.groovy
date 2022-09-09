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

WebUI.navigateToUrl('https://www.bukalapak.com/#')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Bukalapak.com/Login_Menu'))

WebUI.setText(findTestObject('Bukalapak.com/PageAccount/Nomor_handphone_atau_email_Input'), 'indratesting666@gmail.com')

WebUI.click(findTestObject('Bukalapak.com/PageAccount/Lanjut_Button'))

WebUI.setEncryptedText(findTestObject('Bukalapak.com/PageAccount/Password_Input'), '')

WebUI.click(findTestObject('Bukalapak.com/PageAccount/Login_Button'))

WebUI.verifyElementText(findTestObject('NotificationLogin/Password_wajib_diisi_ya'), 'Password wajib diisi, ya.')

