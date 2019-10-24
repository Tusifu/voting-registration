<%-- 
    Document   : viewPage
    Created on : Oct 24, 2019, 10:47:31 AM
    Author     : Edison
--%>

<%@page import="dao.CitizenDAO"%>
<%@page import="java.util.List"%>
<%@page import="domain.Citizen"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>registered citizens</title>
    </head>
    <body>
        <h1>REGISTERED CITIZEN</h1>
        <table border="1"   cellpadding="3">
            <thead>
                <tr>
                    <th>NATIONAL ID</th>
                    <th>FIRST NAME</th>
                    <th>LAST NAME</th>
                    <th>DATE OF BIRTH</th>
                    <th>DISTRICT</th>
                </tr>
            </thead>
            <tbody>
                <%
                List<Citizen> citizens= new CitizenDAO().findAll();
                for(Citizen ct : citizens){
                %>
                <tr>
                    <td><%= ct.getNationalId() %></td>
                    <td><%= ct.getFirstName() %></td>
                    <td><%= ct.getLastName() %></td>
                    <td><%= ct.getDateOfBirth() %></td>
                    <td><%= ct.getDistrict().getName()%></td>
                </tr>
                <%}
                %>
            </tbody>
        </table>

    </body>
</html>
