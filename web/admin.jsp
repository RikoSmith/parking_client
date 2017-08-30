<%-- 
    Document   : admin
    Created on : Jul 7, 2017, 8:32:19 PM
    Author     : Rustam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="a_header.jsp" %>


    <c:choose>
        <c:when test="${isAuth}">
            
            
            
           
            <div class="container">
                <div class="row"><br>
                    <ul class="nav nav-tabs">
                        <li class="<c:if test="${empty table}">active</c:if>"><a href="#" class="b_tab_main">Main</a></li>
                        <li class="<c:if test="${not empty table}">active</c:if>"><form action="lots" method="POST"><input type="submit" role="presentation" class="btn btn-default b_tab_lots" value="Lots"></form></li>
                        <li><a role="presentation" href="#" class="b_tab_requests ">Requests</a></li>
                        <li><a role="presentation" href="#" class="b_tab_users ">Users</a></li>
                        <li><a role="presentation" href="#" class="b_tab_cars ">Cars</a></li>
                        <li><a role="presentation" href="#" class="b_tab_other ">Other</a></li>
                    </ul>
                    <br>
                    <div class="alert alert-success" role="alert">Logged successfully!</div>
                    <div id="tab_main" class="a_tabs <c:if test="${not empty table}">hidden</c:if>">
                        <h2>Main</h2>
                        
                    </div>
                    <div id="tab_lots" class="a_tabs <c:if test="${empty table}">hidden</c:if>">
                        <h2>Lots</h2>
                        <hr>
                        <c:if test="${not empty table}">


                        <h3>All lots:</h3><br>
                        <table class="table table-striped"> 
                            <tbody>
                                <%
                                
                                java.util.List<java.lang.String> table = (java.util.List<java.lang.String>) request.getAttribute("table");
                                

                                for(int i = 0; i < table.size(); i++){
                                %>
                                    <tr> 
                                        <td><%= table.get(i) %></td> 
                                    </tr>
                                <%
                                }
                                %>
                            </tbody> 
                        </table>
                        <br>
                        <form action="assLot" method="POST">
                            <h4>Add Lot</h4>
                            <input class="form-control" type="text" name="lot_number" value="Lot Number">
                            <input class="form-control" type="text" name="type" value="Type id">
                            <input type="submit"  class="btn btn-default" value="Add">
                        </form>
                        </c:if>
                    </div>
                    <div id="tab_requests" class="a_tabs hidden">
                        <h2>Requests</h2>
                    </div>
                    <div id="tab_users" class="a_tabs hidden">
                        <h2>Users</h2>
                    </div>
                    <div id="tab_cars" class="a_tabs hidden">
                        <h2>Cars</h2>
                    </div>
                    <div id="tab_other" class="a_tabs hidden">
                        <h2>Other</h2>
                    </div>
            
            
        </c:when>
        <c:otherwise>
        <div class="container">
            <div class="row">
            <br>
            <div class="alert alert-danger" role="alert"><b>Access denied!</b> Incorrect username or password. Please try again.</div>
                <div class="col-md-4 col-md-offset-4">
                    <br><br><br>
                    <form class="navbar-form navbar-right" role="form" action="admin" method="POST">
                        <div class="form-group">
                            <input type="text" placeholder="Email" class="form-control" name="username"><br><br>
                        </div>
                        <div class="form-group">
                            <input type="password" placeholder="Password" class="form-control" name="pword">
                        </div>
                        <button type="submit" class="btn btn-success">Sign in</button>
                    </form>
                </div>
            <br>
            <br>
            <br>
        </c:otherwise>
    </c:choose>
    
    
    
    

<%@include file="footer.jsp" %>