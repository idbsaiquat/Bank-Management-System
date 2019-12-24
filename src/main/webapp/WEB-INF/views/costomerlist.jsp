<jsp:include page="navber.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<center>
	<h1 style="margin-top: 30px">Customer List</h1>
	<hr></hr>
	<div style="margin-top: 100px"></div>
	<table class="table table-bordered" style="width: 45%">
		<tr class="thead-dark">
			<th>#Sl</th>
			<th>Account No</th>
			<th>Name</th>
			<th>DOB</th>
			<th>Acc_type</th>
			<th>Gender</th>
			<th>Mobile</th>
		</tr>
		<c:forEach var="cos" items="${customer}">
			<tr>
				<td>${cos.id}</td>
				<td>${cos.balance.accountNo}</td>
				<td>${cos.balance.name}</td>
				<td>${cos.dob}</td>
				<td>${cos.accountType}</td>
				<td>${cos.gender}</td>
				<td>${cos.phon}</td>
			</tr>
		</c:forEach>
	</table>
</center>