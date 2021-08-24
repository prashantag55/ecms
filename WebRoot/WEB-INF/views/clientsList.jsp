<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Clients</title>
</head>
<body>
	<h1>List Clients</h1>
	<h3>
		<a href="add.html">Add More Clients</a>
	</h3>

	<c:if test="${!empty clients}">
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
				<th>view</th>
			</tr>
			<c:forEach items="${clients}" var="client">
				<tr>
					<td><c:out value="${client.clientId}" /></td>
					<td><c:out value="${client.clientName}" /></td>
					<td><c:out value="${client.gstNumber}" /></td>
					<td><c:out value="${client.address}" /></td>

					<td><c:out value="${client.primaryEmailId}" /></td>
					<td><c:out value="${client.otherEmailId}" /></td>
					<td><c:out value="${client.websiteLink}" /></td>
					<td><c:forEach items="${client.contactDetailsDataList}"
							var="contactperson">
							<c:out value="${contactperson.contactName}" /> | <c:out
								value="${contactperson.contactNumber}" />
							<br>
						</c:forEach></td>

					<td><c:out value="${client.remarks}" /></td>
					<td><a href="clients/${client.clientId}">View Client</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>