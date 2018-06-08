<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring MVC CRUD</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
header {
    background: #16D7E4;
    height: 80px;
    padding:10px;
}
.navbar-brand2{
  font-size: 40px;
  margin:40px;
  align-self:center;
  color: white;

}
.navbar-brand{
  align-self:center;
  color: white;
  padding: 2px; 

}
body {
        background: -webkit-linear-gradient(-135deg, #c850c0, #4158d0);
  background: -o-linear-gradient(-135deg, #c850c0, #4158d0);
  background: -moz-linear-gradient(-135deg, #c850c0, #4158d0);
  background: linear-gradient(-135deg, #131211, #333130);
	height: 100%;
	width:100%;
	font-family: Poppins-Regular, sans-serif;
	}
	.table-wrapper {
        background: #fff;
        padding: 20px 25px;
        margin: 30px 0;
		border-radius: 3px;
        box-shadow: 0 1px 1px rgba(0,0,0,.05);
    }
	.table-title {        
		padding-bottom: 15px;
		background: #435d7d;
		color: #fff;
		padding: 16px 30px;
		margin: -20px -25px 10px;
		border-radius: 3px 3px 0 0;
    }
    .table-title h2 {
		margin: 5px 0 0;
		font-size: 24px;
	}
	.table-title .btn-group {
		float: right;
	}
	.table-title .btn {
		color: #fff;
		float: right;
		font-size: 13px;
		border: none;
		min-width: 50px;
		border-radius: 2px;
		border: none;
		outline: none !important;
		margin-left: 10px;
	}
	.table-title .btn i {
		float: left;
		font-size: 21px;
		margin-right: 5px;
	}
	.table-title .btn span {
		float: left;
		margin-top: 2px;
	}
    table.table tr th, table.table tr td {
        border-color: #e9e9e9;
		padding: 12px 15px;
		vertical-align: middle;
    }
	table.table tr th:first-child {
		width: 60px;
	}
	table.table tr th:last-child {
		width: 100px;
	}
    table.table-striped tbody tr:nth-of-type(odd) {
    	background-color: #fcfcfc;
	}
	table.table-striped.table-hover tbody tr:hover {
		background: #f5f5f5;
	}
    table.table th i {
        font-size: 13px;
        margin: 0 5px;
        cursor: pointer;
    }	
    table.table td:last-child i {
		opacity: 0.9;
		font-size: 22px;
        margin: 0 5px;
    }
	table.table td a {
		font-weight: bold;
		color: #566787;
		display: inline-block;
		text-decoration: none;
		outline: none !important;
	}
	table.table td a:hover {
		color: #2196F3;
	}
	table.table td a.edit {
        color: #FFC107;
    }
    table.table td a.delete {
        color: #F44336;
    }
    table.table td i {
        font-size: 19px;
    }
	table.table .avatar {
		border-radius: 50%;
		vertical-align: middle;
		margin-right: 10px;
	}

</style>
</head>
<body>

<header>

<nav class="navbar navbar-expand-lg navbar-light bg-light">

<a class="navbar-brand" href="/gestion/">
<img src="https://beta.fanbot.ai/wp-content/uploads/2017/05/fanbot_footer_logo.png" width="70" height="60" alt="Logo">
</a>
<a class="navbar-brand2" href="/gestion/">Tecsup</a>
 

</nav>
      
</header>
	
	 <div class="container">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6">
						<h2>Mantenimiento de <b>Carreras CPE</b></h2>
					</div>
					<div class="col-sm-6">
						<a href="<%=request.getContextPath()%>/admin/cpe/createform" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Agregar Carrera</span></a>
				        <a href="<%=request.getContextPath()%>/admin/menu" class="btn btn-primary" data-toggle="modal"> <span>Menú</span></a>
					</div>
                </div>
            </div>
            <table class="table table-striped table-hover">
                <thead>
                    <tr>
                        
							<th>Nombre</th>
							<!-- <th>Fecha de Incio</th> -->
							<th>Sede</th>
							<th>Descripcion</th>
							<th>Objetivos</th>
							<!--<th>Temario</th>-->
							<th>Duracion</th>
							<th>Area</th>
							<th>Tipo</th>
							<th>Precio</th>
                       		<th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
						<c:forEach var="carcpe" items="${car_cpe}">
							<tr>
								
								
								<td>${carcpe.nombre}</td>
								<!--<td>${carcpe.fecha_ini}</td>-->
								<td>${carcpe.sede}</td>
								<td>${carcpe.descripcion}</td>
								<td>${carcpe.objetivo}</td>
								<!-- <td>${carcpe.temario}</td>-->
								<td>${carcpe.duracion}</td>
								<td>${carcpe.area}</td>
								<td>${carcpe.tipo}</td>
								<td>${carcpe.precio}</td>
                        <td>
                            <a href="<%=request.getContextPath()%>/admin/cpe/editform/${carcpe.cpd_id}" class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                            <a href="<%=request.getContextPath()%>/admin/cpe/deleteform/${carcpe.cpd_id}" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                        </td>
                    </tr>
                  
											</c:forEach>
					
                </tbody>
            </table>
			
        </div>
        			<font color="red">${message}</font>
        
    </div>
	

</body>
</html>