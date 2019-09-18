<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário</title>
<link href="/resources/css/bootstrap.min.css" rel="stylesheet"/>
<script src="/resources/js/jquery-1.11.1.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>

</head>
<body>
 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center">Cartório</h2>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Add Cartório</div>
    </div>
    <div class="panel-body">
     <form:form cssClass="form-horizontal" action="save" method="post" modelAttribute="cartorio">

      <!-- Esconde o campo idCartorio -->
      <form:hidden path="idCartorio" />

      <div class="form-group">
       <label for="nome" class="col-md-3 control-label">Cartório</label>
       <div class="col-md-9">
        <form:input path="nome" cssClass="form-control" />
       </div>
      </div>
      
      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <form:button cssClass="btn btn-primary">Salvar</form:button>
       </div>
      </div>

     </form:form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>