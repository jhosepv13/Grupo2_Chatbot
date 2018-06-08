<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring MVC CRUD</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
<style>
	.error {color: #ff0000; }
</style>
	
</head>
<body>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-6">
				<h4 class="text-center">Crear Nueva Carrera Técnica</h4>
				<hr>
				<form:form method="post" action="create" modelAttribute="carreraCT">
				
					<div class="form-group">
						<label for="nombre">Nombre: </label>
						<form:input path="nombre" class="form-control" />
						<form:errors path="nombre" cssClass="error" />
					</div>
					<div class="form-group">
						<label for="descripcion">Descripcion: </label>
						<form:textarea path="descripcion" class="form-control" />
						<form:errors path="descripcion" cssClass="error" />	
					</div>
					<div class="form-group">
						<label for="aspectos">Aspectos: </label>
						<form:textarea path="aspectos" class="form-control" />
						<form:errors path="aspectos" cssClass="error" />						
					</div>
					<div class="form-group">
						<label for="tipo">Tipo: </label>
						<form:input path="tipo" class="form-control" />
						<form:errors path="tipo" cssClass="error" />
					</div>
					<div class="form-group">
						<label for="sede">Sede: </label>
						<form:input path="sede"  class="form-control"/>
						<form:errors path="sede" cssClass="error" />
					</div>
					<%-- 
					<div class="form-group">
						<label for="department.departmentId">Department: </label>
						<form:select path="department.departmentId" items="${departmentList}" />
					</div>
					--%>
					<div class="form-group">
						<input type="submit" value="Crear" class="btn btn-success" />
						<a href="<%=request.getContextPath()%>/admin/ct/listct" class="btn btn-danger">Cancelar</a>
					</div>
				</form:form>
				<font color="red">${message}</font>
			</div>
		</div>
	</div>


</body>
</html>
