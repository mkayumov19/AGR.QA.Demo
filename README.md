
# Introduction
Project name:           "AGR.QA.Automation".
Programming Language:   "Java",             Version - 1.8;
Build tool:             "Maven",            Version - 4.0;
Web App Testing:        "Selenium",         Version - 4.1.2;
WebDriver:              "WebDriverManager", Version - 4.4.3;
BDD implemented:        "Cucumber",         Version - 7.2.3;
Testing tool:           "Junit",            Version - 4.13.2;

This Automation Framework is capable to Automate, Execute and Generate Reports on local as well as on the Server.
General idea of current framework using Cucumber BDD to make steps clear, easy to read and understand for non-technical
people including Management team. We can add DB and API test caeses accordingly within other packages.
Page Object Model is implemented as well within the framework to achieve easy access and maintenance of previously located WebElements.
There are examples of Commands given below how to trigger the Runner class.

# Getting Started
TODO: Guide users through getting your code up and running on their own system. In this section you can talk about:
1.	Installation process
2.	Software dependencies
3.	Latest releases
4.	API references

# Build and Test
## cucumber-project
Cucumber framework used for running automation tests on Azure Pipelines

## Running locally
To run locally and generate HTML reports, use this maven goal *verify*. HTML reports should be generated under
target/cucumber-html-reports
```
mvn verify
```

## Azure Pipeline (Jenkins)
Install [Cucumber HTML report plugin] (https://plugins.jenkins.io/cucumber-reports). Create a job and use this
repository in the repository url field. In the post build actions, select option Cucumber reports and point to the
location of the cucumber json report. Run the project as a maven goal *test*.
```
mvn test
```

## Tags
We can pass a custom tag using terminal. Available tags are **@smoke**, **@regression**...

```
mvn test -Dcucumber.options="--help"             --->  Running this will print all available "command" options
...
mvn test -Dcucumber.options="--tags @smoke"       --->  running smoke
```

## Browsers:
You can pass change using command line argument BROWSER
```
mvn test -DBROWSER=chrome

```

## Clone directly specific branch:
```
git clone -b <branchName> --single-branch <repourl>

```