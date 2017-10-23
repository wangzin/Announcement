<div class="container">
	<div class="row">
		<h3>Available Vacancy</h3>
		<br />
		<div class="col-md-12">
			<div class="list-group">
				<c:forEach items="${dao}" var="dao">
					<a href="#" class="list-group-item">${ dao.name}</a>
				</c:forEach>
			</div>
		</div>

	</div>
</div>
