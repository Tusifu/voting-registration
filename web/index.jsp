<%-- 
    Document   : index
    Created on : Oct 22, 2019, 10:40:51 AM
    Author     : Edison
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>e-voting20762</title>
    </head>
    <body>
    <center>
        <h1>VOTING</h1>
        <form action="recordVoting.jsp" method="POST">
            <table>
			<tr>
				<td>NationalID:</td>
                                <td><input type="text" name="NationalID" required="true" minlength="16" maxlength="16"></td>
			</tr>
			<tr>
				<td>firstName:</td>
                                <td><input type="text" name="firstName" required="true" minlength="3"></td>
			</tr>
			
			<tr>
				<td>lastName:</td>
                                <td><input type="text" name="lastName" required="true" minlength="3"></td>
			</tr>
			<tr>
				<td>sex:</td>
                                <td><select name="sex" required="true">
                                        <option></option>
					<option>male</option>
					<option>female</option></td>
			</tr>
			<tr>
				<td>DateOfBirth:</td>
                                <td><input type="Date" name="DateOfBirth" placeholder="yyyy-mm-dd" required="true"></td>
			</tr>
			<tr>
				<td>District:</td>
                                <td><select name="District" required="true">
                                        <option></option>
					<option>Nyarugenge</option>
					<option>Gasabo</option>
					<option>Kicukiro</option>
					<option>Rubavu</option>
					<option>Musanze</option>
				</select></td>
			</tr>
                        
		</table>
            <br>
		<input type="submit" name="submit" value="submit">
                <div>    
                </div>
        </form>
        <a href="viewPage.jsp"><button>view citizens</button></a>
             <%
            Object o=session.getAttribute("message");
            if(o != null){
            String message=session.getAttribute("message").toString();
            %>
            <h4 style="color:red"><%= message %></h4>
        <%
            session.removeAttribute("message");
            }
        %>
    </center>
    </body>
</html>
