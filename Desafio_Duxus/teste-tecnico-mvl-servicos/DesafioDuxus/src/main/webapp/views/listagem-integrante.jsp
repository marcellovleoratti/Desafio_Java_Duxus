<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<head>
<meta charset="UTF-8" />
<title>Listagem de Despesas</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>
	<nav class="navbar bg-light navbar-light"></nav>

	<div class="card">
		<div class="card-header">
			<div class="clearfix">
				<h4 class="card-title impacta-titulo-panel">
					Listagem de Integrantes
						<a class="btn btn-link float-right" href="/logout">Logout</a>
						<sec:authorize access="hasRole('MASTER')">
							<a class="btn btn-link float-right impacta-link-panel"
								href="/integrante/form">Nova Integrante
							</a>
						</sec:authorize>
				</h4>
			</div>
		</div>
		<form method="GET" class="form-horizontal" action="/despesa">
			<div class="form-group">
				<div class="col-sm-4">
					<div class="input-group">
						<input class="form-control" placeholder="Busca por descri��o..."
							autocomplete="off" autofocus="autofocus" name="descricao" /> </span>
					</div>
				</div>
			</div>
		</form>
		<div class="card-body">
			<table class="table table-bordered table-striped">
				<thead>
					<tr>
						<th class="text-center">#</th>
						<th class="text-center">Descri��o</th>
						<th class="text-center">Categoria</th>
						<th class="text-center">Data</th>
						<th class="text-center">Valor</th>
						<th class="text-center">Observa��es</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${despesas}" var="despesa">
						<tr>
							<td class="text-center">${despesa.codigo}</td>
							<td class="text-left">${despesa.descricao}</td>
							<td class="text-center">${despesa.categoria.nome}</td>
							<td class="text-center">${despesa.data}</td>
							<td class="text-right"><fmt:formatNumber
									value="${despesa.valor}" type="currency" /></td>
							<td class="text-left">${despesa.observacoes}</td>
							<td class="text-center"><a
								href="/despesa/form/${despesa.codigo}"
								class="btn btn-link btn-xs"> <span>E</span>
							</a></td>
							<td class="text-center"><a class="btn btn-link btn-xs"
								data-toggle="modal" data-target="#confirmaRemocaoModal"
								data-whatever="${despesa.codigo}"> <span>X</span>
							</a></td>
						</tr>
					</c:forEach>
					<c:if test="${despesas.isEmpty()}">
						<tr>
							<td class="text-center" colspan="7"><i>NENHUMA DESPESA
									FOI ENCONTRADA.</i></td>
						</tr>
					</c:if>
				</tbody>
			</table>
		</div>
		<div class="modal fade" id="confirmaRemocaoModal" tabindex="-1"
			data-keyboard="false" data-backdrop="static">
			<div class="modal-dialog">
				<form action="/despesa" method="POST">
					<input type="hidden" name="_method" value="DELETE" />

					<div class="modal-content">
						<div class="modal-header">
							<h4 class="modal-title">Confirma��o</h4>
						</div>

						<div class="modal-body">
							<span>Deseja realmente remover a despesa ?</span>
						</div>

						<div class="modal-footer">
							<button type="button" class="btn btn-link" data-dismiss="modal">Cancelar</button>
							<button type="submit" class="btn btn-primary">Confirmar</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		<script src="/js/jquery-3.1.1.min.js"></script>
		<script src="/js/bootstrap.min.js"></script>
		<script src="/js/despesas.js"></script>
</body>
</html>