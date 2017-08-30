<%-- 
    Document   : getlist
    Created on : Jul 7, 2017, 3:22:29 PM
    Author     : Rustam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<h3>This operation (of service) retrieved data form Persons. Here is a result:</h3><br>
<table class="table table-striped"> 
    <thead> 
        <tr> 
            <th>#</th> 
            <th>Item</th> 
        </tr> 
    </thead> 
    <tbody>
        <%
        java.util.List<java.lang.String> list = (java.util.List<java.lang.String>) request.getAttribute("list");
            
        for(int i = 0; i < list.size(); i++){
        %>
            <tr> 
                <th scope="row"><%= i+1 %></th> 
                <td><%= list.get(i) %></td> 
            </tr>
        <%
        }
        %>
    </tbody> 
</table>

<%@include file="footer.jsp" %>