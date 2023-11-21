# Salesforce-MFA-Login

**Salesforce-MFA-Login** is a sample project built for logging into the Salesforce Web app with an Email Verification Code.

By replacing your Gmail credentials in the **Read Gmail** test case, the SFDC URL, and credentials in the **Login** test case, you can use this usage sample for handling multi-factor authentication on the Salesforce Web app.

## Prerequisite

- You already installed the **Read and Write Gmail Messages Keywords** plugin from [Katalon store](https://store.katalon.com/product/39/Read-and-Write-Gmail-Messages-Keywords). Learn how to reload plugin for usage [here](https://docs.katalon.com/katalon-store/docs/user/access-store-in-KS.html#reload-plugins).

## Executing Salesforce-MFA-Login sample project

Do as follows:

1. Clone or download **Salesforce-MFA-Login** [here](https://github.com/katalon-studio-samples/Saleforce-MFA-Login).

2. Open the downloaded project on Katalon Studio for executing the test.

3. Log into your Gmail on any browser.

    > Only Gmail provider is supported.

4. Open **Login** test case. In **Script view**, replace the `Salesforce URL` and `credentials` with your SFDC URL and credentials.

5. Open  **Read Gmail** test case. In **Script view**, replace your Gmail credentials with `email` and `password`.

6. Click **Run** to execute the test.
