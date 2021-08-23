<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<style>
span.error {
	color: red;
}
</style>
<meta charset="UTF-8" />
<title>Cadastro de Times</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/bootstrap-datepicker.standalone.min.css" />
</head>
<body>

	<nav class="navbar bg-light navbar-light"></nav>

	<form:form class="form-horizontal" method="post"
		action="/times/salvar" modelAttribute="times">

		<c:if test="${!empty mensagem}">
			<div class="alert alert-success">
				<span>${mensagem}</span>
			</div>
		</c:if>

		<div class="card">
			<div class="card-header">
				<div class="clearfix">
					
					<h4 class="card-title duxus-titulo-panel">
						Novo Times
							<a class="btn btn-link float-right" href="/logout">Logout</a>
							<a
							class="btn btn-link float-right impacta-link-panel"
							href="/times"></a>
					</h4>
				</div>
			</div>
			<div class="card-body">

				<form:hidden path="id" />

				<div class="form-group">
					<label for="id_time" class="col-sm-2 control-label">Id Times</label>
					<div class="col-sm-4">
						<form:input class="form-control" path="id_time" />
						<form:errors path="id_time" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label for="idintegrante" class="col-sm-2 control-label">Id Integrante</label>
					<div class="col-sm-2">
						<form:select class="form-control" path="idintegrante">
							<form:options />
						</form:select>
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-primary">Salvar</button>
					</div>
				</div>
			</div>
		</div>
	</form:form>

	<script src="/js/bootstrap-multiselect.js"></script>
	<script src="/js/bootstrap-multiselect.min.js"></script>
	<script src="/js/bootstrap-datepicker.min.js"></script>
	<script src="/js/bootstrap-datepicker.pt-BR.min.js"></script>
	<script src="/js/times.js"></script>
	
</body>
</html>