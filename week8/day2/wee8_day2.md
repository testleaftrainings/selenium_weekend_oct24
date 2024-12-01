Steps to Implement driver as ThreadLocal
----------------------------------------
   1. create a ThreadLocal<RemoteWebDriver> as private static final
   2. Create setter and getter for ThreadLocal (Eg: setDriver(RemoteWebDriver driver), getDriver())
   3. Replace the driver = new ChromeDriver with setDriver(new ChromeDriver())
   4. Replace the driver variable with getDriver() to entire project


Automation Challenges
---------------------
1. Dynamic data generation 
   - generate the dynamic data by using java Faker library
         <dependency>
         <groupId>com.github.javafaker</groupId>
         <artifactId>javafaker</artifactId>
         <version>1.0.2</version>
      </dependency>

2. Testcase failure due to invalid locator value
   - Locator startagery
         ->Tab -> primary locator --> //a[@title='name of tab']
               -> Secondary locator -->  //span[text()='name of the tab']/parent::a
         
         -> Text field -> primary locator --> //label[text()='label name of the input field']/following::input

3. TestCase dependencies
   - redis tools