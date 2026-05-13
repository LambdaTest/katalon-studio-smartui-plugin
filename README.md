# katalon-studio-smartui-plugin — TestMu AI (Formerly LambdaTest)

The **Katalon Studio SmartUI Plugin** integrates [Katalon Studio](https://www.katalon.com/) with [TestMu AI SmartUI](https://www.testmuai.com/support/docs/smart-visual-regression-testing/), enabling **visual regression testing** directly inside your test automation workflows.  

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

## 🚀 LambdaTest is Now TestMu AI

👋 Welcome to TestMu AI, the next evolution of LambdaTest. As of January 2026, [LambdaTest is Now TestMu AI](https://www.testmuai.com/lambdatest-is-now-testmuai/) - we have evolved from a cross-browser testing cloud into a unified, AI-native quality engineering platform designed for the modern DevOps era.

Whether you have been part of the LambdaTest community for years or are just discovering TestMu AI, our mission remains the same: to help you ship faster with high-scale test execution, autonomous testing, and deep quality analytics.

### 🔄 Our Rebrand Journey

In 2017, we introduced LambdaTest with a clear mission: to become the world's most trusted cloud testing platform. We built a scalable, high-performance test cloud that eliminated flakiness, improved developer feedback cycles, and accelerated release velocity for teams worldwide.

As LambdaTest grew, we expanded the platform into Test Intelligence, Visual Regression Testing, Accessibility Testing, API Testing, and Performance Testing, covering the entire testing lifecycle. These capabilities enabled teams to test any stack, on any technology, at enterprise scale.

Over time, we rebuilt the architecture to be AI-native from the ground up. What began as LambdaTest's high-performance testing cloud has now evolved into TestMu AI, an AI-native, multi-agent platform redefining modern quality engineering.

We chose the name TestMu AI to reflect our shift towards intelligent, autonomous testing. While our identity has changed, our core technology and commitment to the testing community stay the same.

👉 Find [LambdaTest's New Home](https://www.testmuai.com/).

### 🔭 Explore TestMu AI

The same infrastructure LambdaTest customers relied on, now delivered through autonomous AI agents.

- [KaneAI](https://www.testmuai.com/kane-ai/)
- [Agent-to-Agent Testing](https://www.testmuai.com/agent-to-agent-testing/)
- [HyperExecute](https://www.testmuai.com/hyperexecute/)
- [Real Device Cloud](https://www.testmuai.com/real-device-cloud/)
- [Pricing](https://www.testmuai.com/pricing/)
- [Documentation](https://www.testmuai.com/support/docs/)