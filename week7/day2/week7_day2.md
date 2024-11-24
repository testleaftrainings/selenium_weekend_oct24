   Steps to import existing maven project
   --------------------------------------
      1. Click on file from menu
      2. Click on import
      3. Expand maven folder
      4. Click on existing maven project
      5. Choose the maven project directory
      6. Click on finish button.

   Steps to achieve parallel execution in POM
   ------------------------------------------
      1. remove static keyword from the ProjectSpecificMethod
      2. pass the driver variable into the LoginPage constructor and create constructor
      3. Inside the constructor assign the local driver value to the global driver variable (this.driver = driver)
      4. Repeat the step no 2 and 3 for all the constructor.


   Steps to read value from property file
   --------------------------------------
      1. Create properties file and write data with key and value
      2. Set the file path into FileInputStream constructor
      3. Create object reference for properties class
      4. load the FileInputStream into the properties by load()
      5. Read the value by using key , use method getProperty(String key)

