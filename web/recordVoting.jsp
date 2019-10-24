<%-- 
    Document   : recordVoting
    Created on : Oct 22, 2019, 4:31:37 PM
    Author     : Edison
--%>

<%@page import="dao.DistrictDAO"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="dao.CitizenDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="domain.District"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="domain.Citizen"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            District dt = new District();

            dt.setName(request.getParameter("District"));
            String id=new DistrictDAO().getID(request.getParameter("District")).get(0)+"";
            dt.setId(id);
            List<Citizen> li = new ArrayList<>();
            dt.setCitizen(li);
            Citizen ct = new Citizen();
            ct.setNationalId(request.getParameter("NationalID"));
            ct.setFirstName(request.getParameter("firstName"));
            ct.setLastName(request.getParameter("lastName"));
            ct.setSex(request.getParameter("sex"));
            ct.setDistrict(dt);
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("DateOfBirth"));
            ct.setDateOfBirth(date);
            int enteredYear = date.getYear() + 1900;
            boolean validateID = Pattern.matches("^1" + enteredYear + ".*", request.getParameter("NationalID"));

            if (validateID == false) {
                out.println("your national id is typed incorrect (2nd to 5th has to be your year of birth)");
            } else {
                long ms = (System.currentTimeMillis() - date.getTime());
                long age = (long) (ms / (1000.0 * 60 * 60 * 24 * 365));
                if (age >= 18) {
                    String msg = new CitizenDAO().Create(ct);
                    session.setAttribute("message", msg);
                    response.sendRedirect("index.jsp");
                } else {
                    out.println("you are under age to vote");
                }
            }
        %>

    </body>
</html>
