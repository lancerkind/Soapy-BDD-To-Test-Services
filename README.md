# Soapy-BDD-To-Test-Services
A demonstration of using a Behavior Driven Development framework such as Cucumber to do BDD with SoapUI tool for a microservice written with Spring Boot
There are two useful branches here. One branch is the service under test (service_branch) and the other is the BDD tests (BDD_tests_branch).

They can be cloned using the following commands or by fiddeling with the GitHub web UI (note the branches in the drop-down selector):<p>
```
git clone -b BDD_tests_branch https://github.com/lancerkind/Soapy-BDD-To-Test-Services.git demo_service_tests
git clone -b service_branch https://github.com/lancerkind/Soapy-BDD-To-Test-Services.git demo_service
```
As is, I'm disappointed the eclipse .project file isn't in the demo_service_tests so you'll need to add your dependencies by hand for Cucumber and SoapUI.  These steps are describe in the following article which walks you through how to use BDD and SoapUI to test services: http://agilenoir.biz/getting-service-apis-to-behave-using-bdd-soapui/
