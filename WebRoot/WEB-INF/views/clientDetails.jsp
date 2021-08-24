<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client</title>
</head>
<body>

		<table align="left" border="1">
			<tr>
				<th>Client ID</th>
				<th>Client Name</th>
				<th>GST Number</th>
				<th>Address</th>
				<th>primary Email Id</th>
				<th>Other Email Id</th>
				<th>website Link</th>
				<th>contact person</th>
				<th>remarks</th>
			</tr>
				<tr>
					<td><c:out value="${clients.clientId}" /></td>
					<td><c:out value="${clients.clientName}" /></td>
					<td><c:out value="${clients.gstNumber}" /></td>
					<td><c:out value="${clients.address}" /></td>

					<td><c:out value="${clients.primaryEmailId}" /></td>
					<td><c:out value="${clients.otherEmailId}" /></td>
					<td><c:out value="${clients.websiteLink}" /></td>
					<td><c:forEach items="${clients.contactDetailsDataList}"
							var="contactperson">
							<c:out value="${contactperson.contactName}" /> | <c:out
								value="${contactperson.contactNumber}" />
							<br>
						</c:forEach></td>

					<td><c:out value="${clients.remarks}" /></td>
				</tr>
			
		</table>
		
	
	
		<table align="left" border="1">
			<tr>
				<th>projectId</th>
				<th>workOrderStatus</th>
				<th>projectDate</th>
				<th>projectName</th>
				<th>scope</th>
				<th>agreedFees</th>
				<th>projectLocation</th>
				<th>constructionType</th>
				<th>projectStatus</th>
				<th>projectSize</th>
				<th>tenderValue</th>
				
			</tr>
			<c:forEach items="${clients.projectDataList}"
							var="projects">
				<tr>
					<td><c:out value="${projects.projectId}" /></td>
					<td><c:out value="${projects.workOrderStatus}" /></td>
					<td><c:out value="${projects.projectDate}" /></td>
					<td><c:out value="${projects.projectName}" /></td>

					<td><c:out value="${projects.scope}" /></td>
					<td><c:out value="${projects.agreedFees}" /></td>
					<td><c:out value="${projects.projectLocation}" /></td>
				

					<td><c:out value="${projects.constructionType}" /></td>
					<td><c:out value="${projects.projectStatus}" /></td>
					<td><c:out value="${projects.projectSize}" /></td>
					<td><c:out value="${projects.tenderValue}" /></td>
				</tr>
				</c:forEach>
			
		</table>
	
</body>
</html>