<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cartórios</title>
<link href="/resources/css/bootstrap.min.css" rel="stylesheet"/>
<script src="/resources/js/jquery-1.11.1.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
</head>
<body>
	<input type="button" value="Novo"
    onclick="window.location.href='showForm'; return false;"
    class="btn btn-primary" />
    <br/><br/>
   
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Lista de Cartorios</div>
    </div>
    <div class="panel-body">
     <table class="table table-striped table-bordered">
      <tr>
      <th>ID</th>
       <th>Nome</th>
      </tr>

      <!-- lista todos os cartorios -->
      <c:forEach var="cartorio" items="${cartorios}">

       <!-- constroi um link do atualizar cartorio com id -->
		<c:url var="updateLink" value="/cartorio/update">
        	<c:param name="idCartorio" value="${cartorio.idCartorio}" />
       </c:url>

	  
       <!-- constroi a url do deletar cartorio com id -->
	   <c:url var="deleteLink" value="/cartorio/delete">
        	<c:param name="idCartorio" value="${cartorio.idCartorio}" />
       </c:url>

       	<tr>
       		<td>${cartorio.idCartorio}</td>
        	<td>${cartorio.nome}</td>
        <td>
         <!-- display the update link --> <a href="${updateLink}">Atualizar</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Você realmente quer deletar o cartório?'))) return false">Deletar</a>
        </td>
       </tr>

      </c:forEach>
     </table>
   

    </div>
   </div>
</body>
</html>