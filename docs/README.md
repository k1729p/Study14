<!DOCTYPE html>
<HTML lang="en">
<META charset="UTF-8">
<BODY>
<a href="https://github.com/k1729p/Study14/tree/main/docs"><img alt="" src="images/ColorScheme.png" height="25" width="800"/></a>
<H2 id="contents">Study14 README Contents</H2>

<h3 id="top">Research JAX-WS and JAX-RS</h3>

<P><img alt="" src="images/MermaidFlowchart.png" height="160" width="340"/><br>
<img alt="" src="images/blackArrowUp.png">
<I>The flowchart with the WildFly application.</I></P>

<table style="border:solid"><tbody>
<tr><td style="border:solid">
<a href="https://javaee.github.io/metro-jax-ws/">Java API for XML-Based Web Services (JAX-WS)</a>
</td></tr><tr><td style="border:solid">
<a href="https://github.com/jakartaee/rest">Jakarta RESTful Web Services (JAX-RS)</a>
</td></tr>
</tbody></table>

<p>
The sections of this project:
</p>
<OL>
<LI><A href="#wildfly">WildFly Application Deploy</A></LI>
<LI><A href="#w_s">XML-Based Web Services</A></LI>
<LI><A href="#r_s">RESTful Web Services</A></LI>
</OL>

<P>Java source code. Packages in modules 'common', 'ejb', 'web':<br>
<img alt="" src="images/aquaHR-500.png"><br>
<img alt="" src="images/aquaSquare.png"> module 'common' application sources: 
<a href="https://github.com/k1729p/Study14/tree/master/common/src/main/java/kp/">kp</a><br>
<img alt="" src="images/aquaSquare.png"> module 'ejb' application sources: 
	<a href="https://github.com/k1729p/Study14/tree/master/ejb/src/main/java/kp">kp</a><br>
<img alt="" src="images/aquaSquare.png"> module 'web' application sources: 
	<a href="https://github.com/k1729p/Study14/tree/master/web/src/main/java/kp/">kp</a><br>
<img alt="" src="images/aquaHR-500.png"></P>

<p>
<img alt="" src="images/yellowHR-500.png"><br>
<img alt="" src="images/yellowSquare.png">
    <a href="http://htmlpreview.github.io/?https://github.com/k1729p/Study14/blob/main/docs/apidocs/index.html">
	Java API Documentation</a><br>
<img alt="" src="images/yellowHR-500.png">
</p>

<a href="#top">Back to the top of the page</a>
<hr>
<H2 id="wildfly">❶ WildFly Application Deploy</H2>

<P>Action:<br>
<img alt="" src="images/orangeHR-500.png"><br>
<img alt="" src="images/orangeSquare.png"> 1. With the batch file 
<a href="https://github.com/k1729p/Study14/blob/main/0_batch/01%20WildFly%20DeleteLog%20Startup.bat"> 
<I>"01 WildFly DeleteLog Startup.bat"</I></a> start the WildFly server.<br>
<img alt="" src="images/orangeSquare.png"> 2. With the batch file 
<a href="https://github.com/k1729p/Study14/blob/main/0_batch/02%20MVN%20clean%20install%20deploy%20WildFly.bat"> 
<I>"02 MVN clean install deploy WildFly.bat"</I></a> build and deploy the application<br>
<img alt="" src="images/orangeSquare.png"><img alt="" src="images/spacer-32.png">on the WildFly server.<br>
<img alt="" src="images/orangeSquare.png"> 3. With the URL <a href="http://localhost:8080/Study14/">http://localhost:8080/Study14/</a> 
open in the web browser the '<i>home page</i>'.<br>
<img alt="" src="images/orangeHR-500.png"></P>

<P><img alt="" src="images/greenCircle.png"> 
1.1. The '<i>home page</i>' file <b>index.html</b>: 
<a href="https://github.com/k1729p/Study14/blob/main/web/src/main/webapp/index.html">HTML code</a>, 
<a href="http://htmlpreview.github.io/?https://github.com/k1729p/Study14/blob/main/web/src/main/webapp/index.html">
HTML preview</a>
</P>
<P>
<img alt="" src="images/ScreenshotHomePage.png" height="85" width="250"/><br>
<img alt="" src="images/blackArrowUp.png">
<I>The screenshot of the home page.</I>
</P>

<P><img alt="" src="images/greenCircle.png"> 
1.2. The link to the WildFly Application Server <a href="http://localhost:8080/console">Administration Console</a>.
</P>

<a href="#top">Back to the top of the page</a>
<hr>
<H2 id="w_s">❷ XML-Based Web Services</H2>

<P>Action:<br>
<img alt="" src="images/orangeHR-500.png"><br>
<img alt="" src="images/orangeSquare.png"> 1. Go to page <a href="http://localhost:8080/Study14/">http://localhost:8080/Study14/</a><br>
<img alt="" src="images/orangeSquare.png"> 2. Select the link <a href="http://localhost:8080/Study14/w_s.xhtml">'Web Services'</a>.<br>
<img alt="" src="images/orangeSquare.png"> 3. On this 'Web Services' page push the button "Web Service".<br>
<img alt="" src="images/orangeHR-500.png"></P>

<P><img alt="" src="images/WebServicesControls.png" width="1200" /><br>
<img alt="" src="images/blackArrowUp.png">
<I>Screenshot from 'Web Services' page controls.</I></P>

<p>
The JSF page on the screenshot 
<a href="https://github.com/k1729p/Study14/blob/main/web/src/main/webapp/w_s.xhtml">'w_s.xhtml'</a> uses the bean 
<a href="https://github.com/k1729p/Study14/blob/main/web/src/main/java/kp/w_s/controller/WsManagedBean.java">'WsManagedBean'</a>.
</p>

<P><img alt="" src="images/greenCircle.png"> 
2.1. On the 'Web Services' page there are three links to the WSDL files:
</p>
<ul>
<li>link <a href="http://localhost:8080/Study14_ejb/WebSeImplA?wsdl">'WebSeImplA WSDL'</a> 
(the <a href="images/ScreenshotWsdlWebSeImplA.png">screenshot</a> of the received WSDL file)</li>
<li>link <a href="http://localhost:8080/Study14_ejb/WebSeImplB?wsdl">'WebSeImplB WSDL'</a> 
(the <a href="images/ScreenshotWsdlWebSeImplB.png">screenshot</a> of the received WSDL file)</li>
<li>link <a href="http://localhost:8080/Study14_ejb/WebSeImplC?wsdl">'WebSeImplC WSDL'</a> 
(the <a href="images/ScreenshotWsdlWebSeImplC.png">screenshot</a> of the received WSDL file)</li>
</ul>

<P><img alt="" src="images/greenCircle.png"> 
2.2. The button "Web Service" executes the method 
<a href="https://github.com/k1729p/Study14/blob/main/web/src/main/java/kp/w_s/controller/WsManagedBean.java#L48">
'WsManagedBean::researchWebService'</a>.
</p>
<p>The web service endpoint <a href="https://github.com/k1729p/Study14/blob/main/common/src/main/java/kp/w_s/WebSe.java">'WebSe'</a>
is implemented as a <b>stateless</b> session bean:
</p>
<ul>
<li><a href="https://github.com/k1729p/Study14/blob/main/ejb/src/main/java/kp/w_s/WebSeImplA.java">'WebSeImplA'</a></li>
<li><a href="https://github.com/k1729p/Study14/blob/main/ejb/src/main/java/kp/w_s/WebSeImplB.java">'WebSeImplB'</a></li>
<li><a href="https://github.com/k1729p/Study14/blob/main/ejb/src/main/java/kp/w_s/WebSeImplC.java">'WebSeImplC'</a></li>
</ul>
<p>
The web service implementation is created from the WSDL document in the method
<a href="https://github.com/k1729p/Study14/blob/main/common/src/main/java/kp/util/Tools.java#L70">Tools::createWebSeImpl</a>.
</p>

<P><img alt="" src="images/WebService.png" height="103" width="565"/><br>
<img alt="" src="images/blackArrowUp.png">
<I>Screenshot from 'Web Service' action.</I></P>

<a href="#top">Back to the top of the page</a>
<hr>
<H2 id="r_s">❸ RESTful Web Services</H2>

<P>Action:<br>
<img alt="" src="images/orangeHR-500.png"><br>
<img alt="" src="images/orangeSquare.png"> 1. Go to page <a href="http://localhost:8080/Study14/">http://localhost:8080/Study14/</a><br>
<img alt="" src="images/orangeSquare.png"> 2. Select the link <a href="http://localhost:8080/Study14/r_s.xhtml">'RESTful Web Services'</a>.<br>
<img alt="" src="images/orangeSquare.png"> 3. On this 'RESTful Web Services' page push the button "RESTful Web Service".<br>
<img alt="" src="images/orangeSquare.png"> 4. On this 'RESTful Web Services' page click the link 
<a href="http://localhost:8080/Study14/rs/text/">'RESTful Web Service'</a>.<br>
<img alt="" src="images/orangeHR-500.png"></P>

<P><img alt="" src="images/RESTfulWebServicesControls.png" width="1200" /><br>
<img alt="" src="images/blackArrowUp.png">
<I>Screenshot from "RESTful Web Services" page controls.</I></P>

<p>
The JSF page on the screenshot 
<a href="https://github.com/k1729p/Study14/blob/main/web/src/main/webapp/r_s.xhtml">'r_s.xhtml'</a> uses the bean 
<a href="https://github.com/k1729p/Study14/blob/main/web/src/main/java/kp/r_s/controller/RsManagedBean.java">'RsManagedBean'</a>.
</p>

<p><img alt="" src="images/greenCircle.png"> 
3.1. The button "RESTful Web Service" executes the method 
<a href="https://github.com/k1729p/Study14/blob/main/web/src/main/java/kp/r_s/controller/RsManagedBean.java#L46">
'RsManagedBean::researchRestfulWebService'</a>.<br>
The stateless session bean  <a href="https://github.com/k1729p/Study14/blob/main/web/src/main/java/kp/r_s/ReSe.java">'ReSe'</a>.<br>
The GET method <a href="https://github.com/k1729p/Study14/blob/main/web/src/main/java/kp/r_s/ReSe.java#L44">'ReSe::getText'</a>
for the service endpoint <a href="http://localhost:8080/Study14/rs/text/">'http://localhost:8080/Study14/rs/text/'</a>.
</p>

<P><img alt="" src="images/RESTfulWebServiceButton.png" height="58" width="552"/><br>
<img alt="" src="images/blackArrowUp.png">
<I>Screenshot from 'RESTful Web Service' button action.</I></P>

<P><img alt="" src="images/RESTfulWebServiceLink.png" height="38" width="397"/><br>
<img alt="" src="images/blackArrowUp.png">
<I>Screenshot from 'RESTful Web Service' link action.</I></P>

<a href="#top">Back to the top of the page</a>
<hr>
</BODY>
</HTML>