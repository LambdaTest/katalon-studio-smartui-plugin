package com.katalon.plugin.keyword.smartui

import io.github.lambdatest.SmartUI
import com.kms.katalon.core.annotation.Keyword
import org.openqa.selenium.WebDriver

class SmartKeywords {
	static SmartUI SMARTUI_CLIENT = null

	@Keyword
	static void startServer(String buildName, String configFile, String port) throws Exception {
        Integer portNumber = null
        if (port != null && !port.trim().isEmpty()){
            portNumber = Integer.valueOf(port)
        }
		SmartUI smartUI = Utils.smartUIInit(buildName, configFile, portNumber)
		smartUI.startServer()
		boolean healthy = smartUI.isServerHealthy()
		if (!healthy) {
			throw new Exception("SmartUI server is not healthy")
		}
		SmartKeywords.SMARTUI_CLIENT = smartUI
		System.out.println("SmartUI server started")
	}

	@Keyword
	static void takeSnapshot(String snapshotName) throws IOException {
		SmartUI smartUI = SmartKeywords.SMARTUI_CLIENT
		if (smartUI == null) {
			throw new IllegalStateException("SmartUI server is not started")
		}
		WebDriver driver = Utils.getDriver()
		smartUI.takeSnapshot(driver, snapshotName)
	}

	static void takeSnapshot(String snapshotName, Map<String, Object> options) throws IOException {
		SmartUI smartUI = SmartKeywords.SMARTUI_CLIENT
		if (smartUI == null) {
			throw new IllegalStateException("SmartUI server is not started")
		}
		WebDriver driver = Utils.getDriver()
		smartUI.takeSnapshot(driver, snapshotName, options)
	}

	@Keyword
	static void stopServer() {
		if (SmartKeywords.SMARTUI_CLIENT == null) {
			throw new IllegalStateException("SmartUI server is not started")
		}
		SmartKeywords.SMARTUI_CLIENT.stopServer()
	}
}