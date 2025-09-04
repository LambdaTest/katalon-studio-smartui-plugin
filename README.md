# katalon-studio-smartui-plugin

The **Katalon Studio SmartUI Plugin** integrates [Katalon Studio](https://www.katalon.com/) with [LambdaTest SmartUI](https://www.lambdatest.com/support/docs/smart-visual-regression-testing/), enabling **visual regression testing** directly inside your test automation workflows.  

With this plugin, you can:
- Capture screenshots at any point in your test flow  
- Compare them with visual baselines  
- Detect UI changes early in your CI/CD pipeline  

---

## 🚀 Features
- 📸 **Visual Snapshots** — capture UI snapshots during test execution.  
- 🔄 **Baseline Comparison** — automatically compare snapshots against stored baselines in SmartUI.  
- 🧪 **Visual Regression Detection** — identify unintended UI changes with pixel-level accuracy.  
- 📊 **SmartUI Dashboard** — view diffs, approve/reject changes, and track regressions over time.  

---

## 📥 Installation
1. Open [Katalon Store](https://store.katalon.com/).  
2. Install the plugin either:
   - From the **Katalon Store** (recommended), or  
   - Import the plugin `.jar` manually from this repository.  
3. Add your SmartUI **`PROJECT_TOKEN`** in your project environment.
---

## ⚙️ Configuration & Usage

Here’s a minimal sample test case showing how to integrate SmartUI with Katalon:

```groovy
// Start SmartUI Server
// Replace PROJECT_TOKEN with your actual SmartUI project token
CustomKeywords.'com.katalon.plugin.keyword.smartui.SmartKeywords.startServer'('buildName', 'configFile.json', '')

// Open Browser
WebUI.openBrowser('')
WebUI.navigateToUrl('https://lambdatest.com')

// Capture Snapshot with SmartUI
// The string parameter is the snapshot name (will appear in SmartUI Dashboard)
CustomKeywords.'com.katalon.plugin.keyword.smartui.SmartKeywords.takeSnapshot'('snapshotName')

// Stop SmartUI Server
CustomKeywords.'com.katalon.plugin.keyword.smartui.SmartKeywords.stopServer'()

// Close Browser
WebUI.closeBrowser()
