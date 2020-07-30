<!DOCTYPE html>
<%@page import="javax.persistence.RollbackException"%>
<%@page import="Titans.FonteDados"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="Titans.Poder"%>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="../css/site.css">
<link rel="stylesheet" href="../css/site-conteudo2.css">
<title>Alterar Poder</title>
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
	Poder a = em.find(Poder.class, request.getParameter("nome"));
	if(a!=null){
		a.setDescricao(request.getParameter("Descricao"));
		a.setOrigem(request.getParameter("Origem"));
		em.getTransaction().begin();
		em.merge(a);
		em.getTransaction().commit();
		out.println("Descricao alterado");		
	}else{
		out.println("nome da Poder não existe");
	}
	%>
</div>
</div>
<div id="rodape">
<div id="rodape-tudo"></div>
</div>
</body>
</html>