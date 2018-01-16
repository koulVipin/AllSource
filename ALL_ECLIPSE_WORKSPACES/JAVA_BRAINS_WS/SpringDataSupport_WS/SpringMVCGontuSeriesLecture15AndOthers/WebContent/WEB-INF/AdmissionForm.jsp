<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h1> ${commonTextKey} </h1>
	<h2> STUDENT ADMISSION FORM FOR ENGINEERING COURSES</h2>

	<form:errors path="studentDetailsKey.*"/>  <!-- How does this form know about "studentDetailsKey" ??? -->
	
	<form action="/SpringMVCGontuSeriesLecture15AndOthers/submitAdmissionForm.html" method="post">
		<table>
		<tr><td>Student's Name :   		</td>  <td>       <input type="text" name="studentName"/>   </td> </tr>
		<tr><td>Student's Hobby :  		</td>  <td>       <input type="text" name="studentHobby"/>  </td> </tr>
		<tr><td>Student's Mobile : 		</td>  <td>       <input type="text" name="studentMobileNumber"/> </td> </tr>
		<tr><td>Student's DOB :    		</td>  <td>       <input type="text" name="studentDOB"/>    </td> </tr>
	</table>
	<table>
			<tr><td>Student's Address : </td></tr> 
		<tr>
			<td>city: <input type="text" name="studentAddress.city"/></td>
			<td>Building Name: <input type="text" name="studentAddress.buildingName" /></td> 
			<td>Pin code:<input type="text" name="studentAddress.pinCode" /></td>
		</tr>
		<tr><td><input type="submit" value="Submit this form by clicking here" /></td></tr>
	</table>
		
	</form>
 
</body>
</html>