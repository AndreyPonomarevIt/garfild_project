# garfild_project
![](https://itea.ua/wp-content/uploads/2019/04/Qa-Automation_1080x344.jpg)
Framework built on Maven contains UI and API test of the https://garfield.by site.

**UI block inclides:**

two PageObject:

 - LoginPage<br/>
 - CartPage

two Step classes:

  - LoginStep<br/>
  - CartStep

and two tests classes:

  - LoginTest<br/>
  - CartTest

**API block inclides:**

 one test class:

  - GarfieldTestApi

Used xPath for requests to elements of an XML document
 
Forced to use two types ExpectedConditions:

  - presenceOfElementLocated());<br/>
  - stalenessOf());
           
