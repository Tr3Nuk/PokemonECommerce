<%-- 
    Document   : genericpage
    Created on : Jan 11, 2016, 8:29:54 PM
    Author     : Jeff
--%>

<%@tag description="Overall page template" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="header" fragment="true"%>
<%@attribute name="footer" fragment="true"%>

<%-- any content can be specified here e.g.: --%>
<html>
   
    <jsp:invoke fragment="header"></jsp:invoke>
    <body class="page-container-bg-solid page-header-fixed page-sidebar-closed-hide-logo page-md">
    <jsp:doBody></jsp:doBody>
    <jsp:invoke fragment="footer"></jsp:invoke>
    </body>
</html>