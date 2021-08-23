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

<script type="text/javascript">
    $(document).ready(function() {
        $('#example-getting-started').multiselect();
    });
</script>
<meta charset="UTF-8" />
<title>Tela Principal</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="/css/bootstrap-datepicker.standalone.min.css" />
</head>
<body>

	<nav class="navbar bg-light navbar-light"></nav>

	<form:form class="form-horizontal" method="post"
		action="/integrante" modelAttribute="integrante">
	
<jsp:useBean id="integrante" type="java.util.ArrayList" scope="session" />
   
   	${private Integrante_repository rpIntControl;}
   <div>
   <label>Selecione o Tipo do Item e em seguida Digite o Item para pesquisar</label>	
   <input type="text" id="pesquisa"></input>
   </div>
     
   <select id="integrante" multiple="multiple">
    	<option onclick=${rpIntControl.findByfindByIdIntegrante((Integer)document.getElementById('pesquisa'))} value="idintegrante">ID_Integrante</option>
		<option onclick=${rpInControl.findByFranquia(document.getElementById('pesquisa'))} value="franquia">Franquia</option>
		<option onclick=${rpIntControl.findByNome(document.getElementById('pesquisa'))} value="nome">Nome</option>
		<option onclick=${rpIntControl.findByfuncao(document.getElementByFuncao('pesquisar'))} value="funcao">Função()}</option>
		<option onclick=${rpIntControl.findByExemploPorIntegrante(document.getElementById('pesquisa')} value="exemplo_integrante">Exemplo de Integrante</option>
	</select>

	<table>
		<c:forEach items="${integrante}" var="integrante">
     	<tr>     
			<td>${integrante.idintegrante()}</td>
        	<td>${integrante.franquia()}</td>
        	<td>${integrante.Funcao()}</td>
        	<td>${integrante.exemplo_integrante()}</td>
    	</tr>
		</c:forEach>
	</table>
  
    
   <select id="example-getting-started" multiple="multiple">
        <% for(int i = 0; i < integrante.size(); i+=1) { %>           
    	
	</select>
    <% } %>
	</form:form>

	<script src="/js/bootstrap-multiselect.js"></script>
	<script src="/js/bootstrap-multiselect.min.js"></script>
	<script src="/js/integrante.js"></script>
	
</body>
</html>