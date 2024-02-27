<%@page import="com.cjc.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

function deleteStudent() {
	alert("Delete Student")
	document.myForm.action = "delete";
	document.myForm.submit();
}
function addStudent() {
	alert("Add Student")
	document.myForm.action = "regPage";
	
}
function editStudent() {
	alert("Edit Student")
	document.myForm.action = "edit";
	document.myForm.submit();
	
}
</script>

<style type="text/css">
th, td {
	padding: 15px;
}
</style>
</head>
<body>
	<h1>Welcome To Success</h1>


	<%List<Student> stuList = (List<Student>)request.getAttribute("data");%>

	<div align="center">
		<form name="myForm">

			<table border="2px" cellspacing="20px" cellspadding="5px 5px 5px 5px">
				<thead>
					<tr>
						<th>Select</th>
						<th>Rollno</th>
						<th>Name</th>
						<th>Marks</th>
						<th>Mobile</th>
						<th>Address</th>
						<th>Change Status<th>
					</tr>
				</thead>
				<tbody>
					<%for (Student stu:stuList) {%>
					<tr>
						<td><input type="radio" name="rollno" value="<%=stu.getRollno()%>"></td>
						<td><%=stu.getRollno()%></td>
						<td><%=stu.getName()%></td>
						<td><%=stu.getMarks()%></td>
						<td><%=stu.getMobile()%></td>
						<td><%=stu.getAddress()%></td>
						<td><a href="changeStatus?rollno=<%=stu.getRollno()%>">Change Status</a></td>
					</tr>
					<%}%>
				</tbody>
			</table>

           <input type="submit" onclick="addStudent()" value="ADD">
           <input type="submit" onclick="editStudent()" value="EDIT">
           <input type="submit" onclick="deleteStudent()" value="DELETE">
           

		</form>

	</div>
</body>
</html>