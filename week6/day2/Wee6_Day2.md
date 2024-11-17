## Steps to achieve Static Parameterization in Cucumber
-------------------------------------------------------

1. In the feature file pass the input through test step and the input should be written with in single qoute (')
2. While mapping the test step and test script replace the input value with {string} Note: string is lowercase because the natural language was ruby.
3. Add method input argument and pass the variable


## Steps to achieve Dynamic Parameterization in Cucumber
--------------------------------------------------------

1. Change from Scenario to Scenario Outline and Add Examples keyword after the test steps
2. Replace the parameterizaton value/data with <tag name> , Eg :<company name>
3. In the Example provide dynamic values for the parameterized tag name , 
    Eg: |company name|first name|last name|
        |TestLeaf|Gokul|Sekar|


## Cucumber Execution flow
--------------------------
 @Before --> Background --> test steps in scenario -> @After

## Steps to implement Hooks
---------------------------
1. Create a package as hooks
2. Create a class as HooksImplementation and inherit the ProjectSpecificMethod
3. In HooksImplementation class Create a two method preCondition() and postCondition() use @Before for preCondition() and @After for postCondition()
4. In the Runner file include hooks package also for glue attribute

## Steps to implement TestNG Annotation in cucumber
---------------------------------------------------
1. In projectSpecificMethod declare a preCondition() and postCondition() and use TestNG Annotation @BeforeMethod and @AfterMethod 
2. In the Runner class inherit the ProjectSpecificMethod and remove hooks in glue
3. In ProjectSpecificMethod inherit the AbstractTestNGCucumberTests


