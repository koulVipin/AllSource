<html>
<body>
	<h1> ${commonTextKey} </h1>
	
	<h1>Congratulations!! the Engineering college has processed your Application form successfully</h1>
	
	<h2>Details submitted by you:</h2>
	<table>
		<tr>
			<td>Student Name: </td>
			<td>${studentDetailsKey.studentName}</td>
		</tr>
		<tr>
			<td>Student Hobby: </td>
			<td>${studentDetailsKey.studentHobby}</td>
		</tr>
		<tr>
			<td>Student Mobile Number: </td>
			<td>${studentDetailsKey.studentMobileNumber}</td>
		</tr>
		<tr>
			<td>Student DOB: </td>
			<td>${studentDetailsKey.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Address :</td>
			<td> city: ${studentDetailsKey.studentAddress.city}
			     Building Name: ${studentDetailsKey.studentAddress.buildingName}
			     pin code: ${studentDetailsKey.studentAddress.pinCode}</td>
		</tr>
	</table>
</body>
</html>