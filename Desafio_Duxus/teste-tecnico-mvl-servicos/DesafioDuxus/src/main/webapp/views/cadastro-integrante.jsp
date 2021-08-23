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
<title>Cadastro de Integrantes</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/bootstrap-datepicker.standalone.min.css" />
</head>
<body>

	<nav class="navbar bg-light navbar-light"></nav>

	<form:form class="form-horizontal" method="post"
		action="/integrante/salvar" modelAttribute="integrante">

		<c:if test="${!empty mensagem}">
			<div class="alert alert-success">
				<span>${mensagem}</span>
			</div>
		</c:if>

		<div class="card">
			<div class="card-header">
				<div class="clearfix">
					
					<h4 class="card-title duxus-titulo-panel">
						Novo Integrante
							<a class="btn btn-link float-right" href="/logout">Logout</a>
							<a
							class="btn btn-link float-right duxus-link-panel"
							href="/integrante"></a>
					</h4>
				</div>
			</div>
			<div class="card-body">

				<form:hidden path="id" />

				<div class="form-group">
					<label for="franquia" class="col-sm-2 control-label">Franquia</label>
					<div class="col-sm-4">
						<form:input class="form-control" path="franquia" />
						<form:errors path="descricao" cssClass="error" />
					</div>
				</div>
				<div class="form-group">
					<label for="nome" class="col-sm-2 control-label">Nome</label>
					<div class="col-sm-2">
						<form:select class="form-control" path="nome">
							<form:options />
						</form:select>
					</div>
				</div>

				<div class="form-group">
					<label for="data" class="col-sm-2 control-label">Data</label>
					<div class="col-sm-2">
						<form:input class="form-control" path="data" autocomplete="off"
							data-provide="datepicker" data-date-format="dd/mm/yyyy"
							data-date-language="pt-BR" data-date-autoclose="true"
							data-date-todayHighlight="true" data-date-orientation="bottom" />
						<form:errors path="data" cssClass="error" />
					</div>
				</div>

				<div class="form-group">
					<label for="funcao" class="col-sm-2 control-label">Função</label>
					<div class="col-sm-2">
						<form:select class="form-control" path="funcao">
							<form:options />
						</form:select>
					</div>
				</div>

				<div class="form-group">
					<label for="exemplo" class="col-sm-2 control-label">Exemplos</label>
					<div class="col-sm-6">
						<form:input class="form-control" path="exemplos" />
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
	<script src="/js/integrante.js"></script>
	
</body>
</html>