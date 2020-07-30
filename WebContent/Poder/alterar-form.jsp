<!DOCTYPE html>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="Titans.FonteDados"%>
<%@page import="Titans.Poder"%>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../css/site.css">
<link rel="stylesheet" href="../css/site-conteudo2.css">
<title>Alterar Poders</title>
</head>
<body>
<div id="tudo">
<div id="navegacao">
<ul class="menulist ">
	<li class="menuitem">
	<a href="#home">Home</a></li>
	<li class="menuitem dropdown">
		<a href="#" class="dropbutton">Cadastro</a>
		<div class="dropdown-content">
			<a href="Poder/menu.html">Poder</a>
	</div></li>
	<li class="menuitem">
	<a href="#contact">Galeria</a></li>
	<li class="menuitem">
	<a href="#about">Contato</a></li>
</ul>
</div>
<div id="conteudo1">
	<p><a href="inserir-form.html">inserir</a></p>
	<p><a href="alterar-busca.html">alterar</a></p>
	<p><a href="excluir-busca.html">excluir</a></p>
	<p><a href="consultar-busca.html">consultar</a></p>
</div>
<div id="conteudo2">
	<% 
		EntityManager em = FonteDados.createManager();
	Poder a = (Poder)em.find(Poder.class, request.getParameter("nome"));
		if(a!=null){
			out.println("<form action=\"alterar.jsp\">");
			out.println("<p>nome: <input type=\"text\" name=\"nome\" readonly=\"true\" size=\"50\" value=\""+a.getNome()+"\"/></p>");		
			out.println("<p>descricao: <input type=\"text\" name=\"descricao\" size=\"50\" value=\""+a.getDescricao()+"\"/></p>");
			out.println("<p>origem: <input type=\"text\" name=\"origem\" size=\"50\" value=\""+a.getOrigem()+"\"/></p>");
			out.println("<p><input type=\"submit\" value=\"alterar\"/></p>");
			out.println("</form>");
		}else{
			out.println("nome do Poder não existe");			
		}
	%>
</div>
</div>
<div id="rodape">
<div id="rodape-tudo"></div>
</div>
</body>
</html>