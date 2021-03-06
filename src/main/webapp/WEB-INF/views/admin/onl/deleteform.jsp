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
</head>
<body>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-6">
				<h4 class="text-center">Eliminar Carrera PFR</h4>
				<hr>
				<form:form method="post" servletRelativeAction="/admin/emp/delete" modelAttribute="carrera" >
					<form:hidden path="pfr_id" />
					<div class="form-group">
						<label for="name">Nombre: </label>
						<form:input path="name" class="form-control" readonly="true" />
					</div>
					<div class="form-group">
						<label for="descripcion">Descripcion: </label>
						<form:textarea path="descripcion" class="form-control" readonly="true" />
					</div>
					<div class="form-group">
						<label for="duracion">Duracion: </label>
						<form:input path="duracion" class="form-control" readonly="true" />
					</div>
					<div class="form-group">
						<label for="sede">Sede: </label>
						<form:input path="sede" class="form-control"  readonly="true"/>
					</div>
					<div class="form-group">
						<label for="objetivo">Objetivo: </label>
						<form:textarea path="objetivo" class="form-control" readonly="true"/>
					</div>
					<%-- 
					<div class="form-group">
						<label for="department.departmentId">Department: </label>
						<form:select path="department.departmentId" items="${departmentList}"  disabled="true" />
					</div>
					--%>		
					<div class="form-group">
						<input type="submit" value="Eliminar" class="btn btn-warning" />
						<a href="<%=request.getContextPath()%>/admin/emp/list" class="btn btn-danger">Cancelar</a>
					</div>
				</form:form>
				<font color="red">${message}</font>
			</div>
		</div>
	</div>


</body>
</html>