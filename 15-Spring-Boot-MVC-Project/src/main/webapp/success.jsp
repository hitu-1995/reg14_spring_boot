<%@page import="com.cjc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: #ff80b3">
    <div align="center" style= "padding-bottom: 25px;
                                     padding-top 30px;
                                    background-color: #cc0052">
      <h1>Welcome to Student Dashboard</h1>
    </div>
 <%List<Student> stuList = (List<Student>) request.getAttribute("data"); %>
 
     <div align="center" style=" background-color: #cc0066;
                                    border-block-style: solid;
                                    border-block-color: pink lightblue;
                                    background-color: #b30059;
                                    inline-size: 100%;
                                    border-block-width: 10px";>
                                   
     <table border="5px" cellspacing="25px">
      <thead style="color: yellow">
        <tr>
           <th>Rollno</th>
           <th>Name</th>
           <th>Mobile</th>
           <th>Email</th>
           <th>Address</th>
        </tr>
      </thead>
       <tbody style="color: white; font-weight: bold; font-style : italic;">
        <%for(Student student : stuList) {%>
           <tr>
             <td><%=student.getRollno()%></td>
             <td><%=student.getName()%></td>
             <td><%=student.getMobile()%></td>
             <td><%=student.getEmail()%></td>
             <td><%=student.getAddress()%></td>
          </tr>
        <%}%>
       </tbody>
   </table>
     </div>
  
</body>
</html>
