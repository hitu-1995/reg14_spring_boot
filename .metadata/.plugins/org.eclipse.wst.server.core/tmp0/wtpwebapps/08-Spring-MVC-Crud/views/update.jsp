<%@page import="com.cjc.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>Welcome To Updated Page..........</h1>
   <hr>
   
     <%Student stu = (Student)request.getAttribute("stu");%>
      <div align="center">
   
        <form action="reg">
       
      
      <label>Rollno : <%=stu.getRollno()%></label>
      <input type="hidden" name="rollno" value="<%=stu.getRollno()%>"><br>
      <label>Name : </label>
      <input type="text" name="name" value="<%=stu.getName()%>"><br>
      <label>Mobile : </label>
      <input type="text" name="mobile" value="<%=stu.getMobile()%>"><br>
      <label>Marks : </label>
      <input type="text" name="marks" value="<%=stu.getMarks()%>"><br>
      <label>Address : </label>
      <input type="text" name="address" value="<%=stu.getAddress()%>"><br>
      
      <input type="submit" value="UPDATE">
        
        </form>
   </div>
</body>
</html>