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
      <h1>Welcome to Registration Section</h1>
    </div>
    <div align="center" style="padding-top: 30px">
       <form action="reg" method="post">
          <label>Rollno : </label>
           <input type="text" name="rollno"><br><br>
          <label>Name : </label>
           <input type="text" name="name"><br><br>
           <label>Mobile : </label>
           <input type="text" name="mobile"><br><br>
           <label>Email : </label>
           <input type="text" name="email"><br><br>
           <label>Address : </label>
           <input type="text" name="address"><br><br>
            <input type="submit" value="REGISTER">
       </form>
    </div>
</body>
</html>