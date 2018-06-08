<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
	
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
<style type="text/css">

	
.project {
	width: 100%;
	height: 500px;
	background-image: url(https://orientauc.webnode.es/_files/200000012-419ad4294d/profesionales.jpg);
	background-position: center;
	padding: 0 !important;
	float:left;
}

.project-2 {
	background-image: url(https://image.freepik.com/free-vector/abstract-geometric-background-design_1045-764.jpg);
}

.project-3 {
	background-image: url(https://image.freepik.com/free-vector/abstract-geometric-background-design_1045-764.jpg);
}

.project-4 {
	background-image: url(https://image.freepik.com/free-vector/abstract-geometric-background-design_1045-764.jpg);
}

.project-hover {
	width: 100%;
	height: 100%;
	color: #fff;
	opacity: 0;
	-webkit-transition: all 0.5s ease;
	-moz-transition: all 0.5s ease;
	-o-transition: all 0.5s ease;
	transition: all 0.5s ease;
	background-color: rgba(96, 94, 203, 0.7);
	padding: 40% 30px !important;
}

.project-hover hr {
	height: 30px;
	width: 0;
	-webkit-transition: all 0.5s ease;
	-moz-transition: all 0.5s ease;
	-o-transition: all 0.5s ease;
	transition: all 0.5s ease;
	background-color: rgba(255, 255, 255, 1);
	border: 0;
}

.project-hover a {
	color: rgba(255, 255, 2555, 1);
	padding: 2px 22px;
	line-height: 40px;
	border: 2px solid rgba(255, 255, 255, 1);
	-webkit-transition: all 0.5s ease-in-out;
	-moz-transition: all 0.5s ease-in-out;
	-o-transition: all 0.5s ease-in-out;
	transition: all 0.5s ease-in-out;
	font-size: 25px;
}

.project-hover a:hover {
	border-color: rgba(51, 51, 51, 1);
	color: rgba(51, 51, 51, 1);
	background-color: #FFF;
}

.project:hover .project-hover {
	opacity: 1;
}

.project:hover .project-hover hr {
	width: 100%;
	height: 5px;
}

header {
    background: #16D7E4;
    height: 80px;
    padding:10px;
    
    	
}

nav{
	background: #16D7E4;
    height: 80px;
}
.navbar-brand2{
  font-size: 40px;
  margin:40px;
  align-self:center;
  color: white;
   background: #16D7E4;

}
.navbar-brand{
  align-self:center;
  color: white;
  padding: 2px; 
   background: #16D7E4;

}

</style>	
	
</head>
<body>
	
	
	


<div class="container-fluid">

		<header style="position: relative; right: 5px; bottom: 5px; ">
	
			<nav style="position: relative; right: 5px; bottom: 5px; " class="navbar navbar-expand-lg navbar-light bg-left">
			
			<a class="navbar-brand" href="/gestion/">
			<img src="https://beta.fanbot.ai/wp-content/uploads/2017/05/fanbot_footer_logo.png" width="70" height="60" alt="Logo">
			</a>
			<a class="navbar-brand2" href="/gestion/">Tecsup</a>
			 
			
			</nav>
	      
		</header>
	
	
	<div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 project wow animated animated4 fadeInLeft">
        <div class="project-hover">
        	<h1>PFR</h1>
            
            <hr />
            <h1>Lista de Carreras PFR</h1>
            <a href="<%=request.getContextPath()%>/admin/emp/list">Ver</a>
        </div>
    </div>
    
    <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 project wow animated animated3 fadeInLeft">
        <div class="project-hover">
        	<h1>Carreras Técnicas </h1>
            
            <hr />
            <h1>Lista de Carreras Técnicas</h1>
            <a href="<%=request.getContextPath()%>/admin/ct/listct">Ver</a>
        </div>
    </div>
    
    <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 project wow animated animated2 fadeInLeft">
        <div class="project-hover">
        	<h1>Cursos y Programas de Extensión </h1>
            
            <hr />
            <h1>Lista CPE</h1>
            <a href="<%=request.getContextPath()%>/admin/cpe/list">Ver</a>
        </div>
    </div>
    
    <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 project wow animated  fadeInLeft">
        <div class="project-hover">
        	<h1>Página de Inicio </h1>
            
            <hr />
            <h1>Página de Tecsup</h1>
            <a href="<%=request.getContextPath()%>/admin/web/pagina">Ver</a>
        </div>
    </div>
    <div class="clearfix"></div>
</div> 
<div class="clearfix"></div>  

	<header style="position: relative; ">
	
			<nav style="position: relative; " class="navbar navbar-expand-lg navbar-light bg-left">
			
			</nav>
	      
	</header>
 
<!--	<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-6">
				<h4 class="text-center">Menu</h4>
				<hr>
				<table class="table table-bordered table-striped">
					<tbody>
						<tr>
							<td>
								<a href="<%=request.getContextPath()%>/admin/emp/list"
								class="btn btn-primary"> Lista de Carreras PFR</a>
							</td>
							
							<td>
								<a href="<%=request.getContextPath()%>/admin/ct/listct"
								class="btn btn-primary"> Lista de Carreras Tecnicas</a>
							</td>
							
							<td>
								<a href="<%=request.getContextPath()%>/admin/cpe/list"
								class="btn btn-primary"> Lista de Carreras CPE</a>
							</td>
							
							<td>
							<a href="<%=request.getContextPath()%>/admin/web/pagina"
								class="btn btn-primary"> Ir a la página web</a>
							</td>
							<td>
								<form class="form-inline" action="<%=request.getContextPath()%>/j_spring_security_logout" method="post">
							      <input type="submit" value="Log out"  class="btn btn-primary"/>
							      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
							    </form>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>-->
</body>

</html>
