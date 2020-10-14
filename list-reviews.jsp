<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
	
	<div class="container">
		<table class="table table-striped">
			<caption>Your Reviews are</caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Date Visited</th>
					<th>Will you visit again?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${reviews}" var="review">
					<tr>
						<td>${review.desc}</td>
						<td><fmt:formatDate value="${review.datevisited}" pattern="MM/dd/yyyy"/></td>
						<td>${review.done}</td>
						<td><a type="button" class="btn btn-success"
							href="/update-review?id=${review.user}">Update</a></td>
						<td><a type="button" class="btn btn-warning"
							href="/delete-review?id=${review.user}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="button" href="/add-review">Add a Review</a>
		</div>
	</div>
<%@ include file="common/footer.jspf" %>