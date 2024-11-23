Hooks Implementation
====================
   Cucumber annotations 
            - @Before  -> Before annotation execute before executing each scenario
            - @After -> After annotation execute after each scenario

            - @BeforeStep - It will execute before each test step 
            - @AfterStep - It will execute after each test step


   Execution flow with hooks annotations
   -------------------------------------
      -> @Before
         -> Background keyword
          -> Scenario /Scenario Outline -> @BeforeStep -> @AfterStep
            -> @After


   Steps to implement hooks annotations
   ------------------------------------
      1. create a class as HooksImplementation under hooks package
      2. Declare two methods preCondition and postCondition with Hooks/cucumber annotations @Before and @After
      3. HooksImplementation should inherit ProjectSpecificMethod
      4. In the runner hooks package also include in glue attribute.



TestNG Implementation in Cucumber
---------------------------------
   1. Remove the Hooks annotations @Before and @After
   2. In ProjectSpecificMethod Declare two methods precondition and postCondition with TestNG annotations @BeforeMethod and @AfterMethod
   3. Runner class should inherit ProjectSpecificMethod
   4. ProjectSpecificMethod should inherit AbstractTestNGCucumberTests


static keyword
==============
   1. single memory reference - share the memory as single all the object reference across the project
   2. inside the non static methods it allows all the members of the class (static variable , non-static variable, static method, non-static method) directly without the help of object reference.
   3. inside the static method it allow to call only the static members(static variable and static method) without object reference  


execution flow of static 
------------------------
   -> static block
      -> main method (static method)
         -> non-static block while create object for class with new keyword
            -> constructor.



Page Object Model (Design pattern)
----------------------------------
   1. Create packages as base, pages, testcases.
   2. Create a class BaseClass/ProjectSpecificMethod and declare two methods preCondition and postCondition with TestNG annotations @BeforeMethod and @AfterMethod
   3. In Pages design the webpages 
   4. Create class for each webpages (eg: LoginPage, WelcomePage, HomePage, LeadsPage, .....)
   5. In each webpage design the each action as method
   6. Create a method for each action. (eg: enterUsername(), enterPassword(), clickLoginButton(),...)
   7. Design the navigation (Helps to call the chaining of methods)
   8. Design the navigation flow of each action with return type.
   9. Inheirt the ProjectSpecificMethod in all the pages class
   10. Write the implementation(selenium script with java lang.. binding)
   11. Design the testcase execution flow.
   12. Create a Class for testcase (eg: TC_001_Login)
   13. Inherit the ProjectSpecificMethod in testcase class
   14. In ProjectSpecificMethod driver should be declared as static to share memory across the project
   15. Create an object for LoginPage and design the execution flow.




