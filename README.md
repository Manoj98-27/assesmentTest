QMetry Automation Framework

Overview
	QAF (Quality Automation Framework) is an open-source test automation framework designed to simplify and accelerate test automation. 
	QAF is developed using Java and provides features such as data-driven testing, parallel execution, and reporting. 
	It also supports various testing types, such as functional, performance, security, and API testing.
	
	One of the key strengths of QAF is its seamless integration with Appium, which is an open-source test automation framework for mobile applications.
	Appium is designed to automate mobile application testing across different platforms, such as Android and iOS, using a single API.
	It supports various programming languages, including Java, Python, and Ruby, and provides features such as cross-platform testing, 
	element locating strategies, and image recognition.
	
	With the integration of Appium, QAF can easily automate mobile application testing, leveraging its rich features to improve the testing process.
	The QAF framework provides a set of predefined libraries and utilities to make it easy for developers and testers to create and run tests on mobile
	applications using Appium.

Scenarios 
	In background we are opening the application, the step will be common for each and every scenario so that we place that step in background
	
	Scenario 1: 
		In the first scenario we are opening the appplication and verifying that user is on Home page of the application to ensure that app is stable
	
	Scenario 2:
		In the second scenario we are verify particular user is present in the list of users or not after opening the app.
		
	Scenario 3:
		In the third scenario we are verify that the particular user is present at the expected number in the list after launching the app.
		
pre-requisities
	1) Java JDK should be install and environment variable must be set.
	2) Android studio should be install and android SDK must be set as environment variable.
	3) Appium server should be installed.
	
Execution
	1) Start the appium server.
	2) Start the android studio and launch the emulator /  connect real time device to the system and install app into it.
	3) now open cmd and hit the command "adb devices", copy the deivce id and paste it under "driver.capabilities.udid" parameter as value
	   into the testrun_config.xml file.
	4) copy the tag name of the particular scenario and paste it under include parameter in testrun_config.xml
	 test suite enabled should be true 
	5) mention the app package and app activity under 
		<parameter name="driver.capabilities.appPackage" value="com.energyaustralia.codingtestsample" />
		<parameter name="driver.capabilities.appActivity" value=".MainActivity" />
	5) open cmd in project directory so it will look like
		"C:\Users\user\Downloads\Mobile_Automation_QAF-master\Mobile_Automation_QAF-master>"
		Now hit the command "mvn clean test" so it will start execution
		
For Reporting refer the following url
	https://github.com/infostretch/qaf-report 
	
	Note: prefer firefox browser for reporting purpose.
		