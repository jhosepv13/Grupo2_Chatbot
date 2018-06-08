<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>
<%@page contentType="text/html"%> 
<%@page pageEncoding="UTF-8"%> 

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>ChatBot - Tecsup</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
	<link href="webjars/bootstrap/3.2.0/css/bootstrap.css" rel="stylesheet">


	<meta name="description" content="">
	<meta name="author" content="">
	<link rel="stylesheet" href="<c:url value="/resources/webjars/bootstrap/3.2.0/css/bootstrap.min.css"/>" >

<!-- jQuery library -->
<script src="<c:url value="/resources/webjars/jquery/1.11.1/jquery.min.js"/>"></script>

<!-- Latest compiled JavaScript -->
	<script src="<c:url value="/resources/webjars/bootstrap/js/bootstrap.min.js"/>"></script>


	<link href="<c:url value="/resources/css/bootstrap-responsive.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/color/default.css"/>" rel="stylesheet">
	<link rel="shortcut icon" href="<c:url value="/resources/img/favicon.ico"/>">
	
	<!-- =======================================================
    Theme Name: Maxim
    Theme URL: https://bootstrapmade.com/maxim-free-onepage-bootstrap-theme/
    Author: BootstrapMade.com
    Author URL: https://bootstrapmade.com
	======================================================= -->


</head>

<body>


	<!-- navbar -->
	<div class="navbar-wrapper">
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container">
					<!-- Responsive navbar -->
					<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
				</a>
					<h1 class="brand"><a href="/gestion/">Tecsup</a></h1>
					<!-- navigation -->
					<nav class="pull-right nav-collapse collapse">
						<ul id="menu-main" class="nav">
							<li><a title="team" href="#cursopro">Cursos y Programas de extensión</a></li>
							<li><a title="services" href="#cursoonl">Cursos Online</a></li>
							<li><a title="works" href="#admision">Admisión - Carreras</a></li>
							<li><a title="blog" href="#carreras">Carreras Técnicas</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<!-- Header area -->
	
	<!-- spacer section -->
	<section class="spacer green">
		<div class="container">
			<div class="row">
				<div class="span6 alignright flyLeft">
					<blockquote class="large">
						Ser una institución de educación superior LÍDER en Latinoamérica, que crece anticipándose a las necesidades de los clientes, reconocida por su excelencia académica y compromiso con sus colaboradores, clientes y estudiantes  <cite>Nuestra visión</cite>
					</blockquote>
				</div>
				<div class="span6 aligncenter flyRight">
		<img src="<c:url value="/resources/img/icons/cc.png" />"  width="256"/>
				
			</div>
		</div>
	</section>
	<!-- end spacer section -->
	<!-- section: team -->
	<section id="cursopro" class="section">
		<div class="container">
			<h4>Cursos y Programas de extensión</h4>
			<div class="row">
				<div class="span4 offset1">
					<div>
						<h2>Programas Ofrecidos</h2>
						<p>
							Tecsup ofrece una gran variedad de cursos y programas que ayudarán a las personas 
							a que se puedan desenvolver mejor en su área de trabajo. Estos programas tienen una duración de 3 meses, con un costo elevado, debido a los diferentes proyectos que se desarrollan en el tiempo que dura el programa. 
						</p>
					</div>
				</div>
				<div class="span6">
					<div class="aligncenter">
						
					<img  src="<c:url value="/resources/img/icons/creativity.png"/>"/>
						
					</div>
				</div>
			</div>
			<div class="row">
				<div class="span2 offset1 flyIn">
					<div class="people">
		<img class="team-thumb img-circle" src="<c:url value="/resources/img/team/img-1.jpg"/>"/>
						<h3>Maestrías Internacionales - CEPADE</h3>
					</div>
				</div>
				<div class="span2 flyIn">
					<div class="people">
		<img class="team-thumb img-circle" src="<c:url value="/resources/img/team/img-2.jpg"/>"/>
						
						<h3>Diplomados</h3>
					</div>
				</div>
				<div class="span2 flyIn">
					<div class="people">
			<img class="team-thumb img-circle" src="<c:url value="/resources/img/team/img-3.jpg"/>"/>
						
						<h3>Cursos y Programas en empresa</h3>
					</div>
				</div>
				<div class="span2 flyIn">
					<div class="people">
						<img class="team-thumb img-circle" src="<c:url value="/resources/img/team/img-4.jpg"/>"/>
						
						<h3>Operación de equipo pesado</h3>
					</div>
				</div>
				<div class="span2 flyIn">
					<div class="people">
												<img class="team-thumb img-circle" src="<c:url value="/resources/img/team/img-5.jpg"/>"/>
						
						<h3>Operación para Mina Volquete Volvo</h3>
					</div>
				</div>
			</div>
		</div>
		<!-- /.container -->
	</section>
	<!-- end section: team -->
	<!-- section: services -->
	<section id="cursoonl" class="section orange">
		<div class="container">
			<h4>Cursos Online</h4>
			<!-- Four columns -->
			<div class="row">
				<div class="span4 animated-fast flyIn">
					<div class="service-box">
						<img src="<c:url value="/resources/img/icons/basket.png"/>"/>
						
						<h2>Concentración de Minerales</h2>
						<p>
							El presente curso comprende el estudio de las tecnologías más relevantes de la preparación mecánica y las técnicas de la concentración de los minerales.
						</p>
					</div>
				</div>
				<div class="span4 animated flyIn">
					<div class="service-box">
				<img src="<c:url value="/resources/img/icons/lab.png"/>"/>
						
						<h2>Gestión de la Confiabilidad en Equipos Productivos</h2>
						<p>
							El programa busca desarrollar las herramientas de la Ingeniería de Confiabilidad en el Mantenimiento basándose en el modelo de los Elementos Uptime.
						</p>
					</div>
				</div>
				<div class="span4 animated-fast flyIn">
					<div class="service-box">
		<img src="<c:url value="/resources/img/icons/camera.png"/>"/>
					
						<h2>Gestión de la Innovación Tecnológica</h2>
						<p>
							Vemos como se presentan nuevos productos y servicios que terminan captando la atención de las personas y remeciendo a sectores tradicionales.
						</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- end section: services -->
	<!-- section: works -->
	<section id="admision" class="section">
		<div class="container clearfix">
			<h4>Admisión - Carreras</h4>
			<!-- portfolio filter -->
			
			<div class="row">
				<div class="span12">
					<div id="portfolio-wrap">
						<!-- portfolio item -->
						<div class="portfolio-item grid informatica">
							<div class="portfolio">
								<a href="img/works/redes.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
												<img src="<c:url value="/resources/img/works/1.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Administración de Redes y Comunicaciones</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid print design web">
							<div class="portfolio">
								<a href="img/works/avionica.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
												<img src="<c:url value="/resources/img/works/2.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Aviónica y Mecánica Aeronáutica</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid informatica">
							<div class="portfolio">
								<a href="img/works/videojuegos.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
												<img src="<c:url value="/resources/img/works/3.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Diseño y Desarrollo de Simuladores y Videojuegos</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid informatica">
							<div class="portfolio">
								<a href="img/works/software.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
												<img src="<c:url value="/resources/img/works/4.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Diseño y Desarrollo de Software</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid photography web">
							<div class="portfolio">
								<a href="img/works/industrial.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
						<img src="<c:url value="/resources/img/works/5.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Diseño Industrial</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid photography web">
							<div class="portfolio">
								<a href="img/works/electronica.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
												<img src="<c:url value="/resources/img/works/6.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Electrónica y Automatización Industrial</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid photography web">
							<div class="portfolio">
								<a href="img/works/electricidad.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
												<img src="<c:url value="/resources/img/works/7.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Electricidad Industrial</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid photography">
							<div class="portfolio">
								<a href="img/works/gestion.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
												<img src="<c:url value="/resources/img/works/8.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Gestión y Mantenimiento de Maquinaria Industrial</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid photography web">
							<div class="portfolio">
								<a href="img/works/pesada.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
												<img src="<c:url value="/resources/img/works/9.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Mantenimiento de Maquinaria Pesada</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid design web">
							<div class="portfolio">
								<a href="img/works/mecatronica.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
												<img src="<c:url value="/resources/img/works/10.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Mecatrónica Industrial</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid design web">
							<div class="portfolio">
								<a href="img/works/mineras.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
							<img src="<c:url value="/resources/img/works/11.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Operaciones Mineras</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid design web">
							<div class="portfolio">
								<a href="img/works/produccion.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
												<img src="<c:url value="/resources/img/works/12.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Producción y Gestión Industrial</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid design web">
							<div class="portfolio">
								<a href="img/works/procesos.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
							<img src="<c:url value="/resources/img/works/13.png"/>"/>
						
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Procesos Químicos y Metalúrgicos</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid design web">
							<div class="portfolio">
								<a href="img/works/mecanica.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
						
						<img src="<c:url value="/resources/img/works/14.png"/>"/>
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Tecnología Mecánica Eléctrica</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
						<!-- portfolio item -->
						<div class="portfolio-item grid design web">
							<div class="portfolio">
								<a href="img/works/tecnologia.jpg" data-pretty="prettyPhoto[gallery1]" class="portfolio-image">
						<img src="<c:url value="/resources/img/works/15.png" />" />
						<div class="portfolio-overlay">
							<div class="thumb-info">
								<h5>Tecnología de la Producción</h5>
								<i class="icon-plus icon-2x"></i>
							</div>
						</div>
						</a>
							</div>
						</div>
						<!-- end portfolio item -->
					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- section: blog -->
	<section id="carreras" class="section">
		<div class="container">
			<h4>Carreras Técnicas</h4>
			<!-- Three columns -->
			<div class="row">
				<div class="span4">
					<div class="home-post">
						<div class="post-image">
							<img class="max-img" src="<c:url value="/resources/img/blog/ctex.jpg"/>"/>
						</div>
						<div class="entry-content">
							<h5><strong><a href="#">CTEX – Carreras Técnicas para personas con experiencia laboral</a></strong></h5>
							<p>
								Tecsup presenta sus nuevas carreras técnicas de 2 años, para personas con experiencia laboral, la cual ofrece una formación práctica con un sistema semipresencial (blended).
							</p>
						</div>
					</div>
				</div>
				<div class="span4">
					<div class="home-post">
						<div class="post-image">
							<img class="max-img" src="<c:url value="/resources/img/blog/egresadosco.jpg"/>"/>
						</div>
						<div class="entry-content">
							<h5><strong><a href="#">Carrera para egresados de colegio</a></strong></h5>
							<p>
								Uno de los dilemas de los jóvenes al terminar la secundaria es qué camino seguir: estudiar una carrera técnica o una universitaria. La decisión final dependerá de varios factores, entre ellos el económico y las tendencias del mercado.
							</p>
						</div>
					</div>
				</div>
				<div class="span4">
					<div class="home-post">
						<div class="post-image">
							<img class="max-img" src="<c:url value="/resources/img/blog/manpesado.jpg"/>"/>
						</div>
						<div class="entry-content">
							<h5><strong><a href="#">Servicio de Mantenimiento de Equipo Pesado</a></strong></h5>
							<p>
								Esta carrera está dirigida especialmente a jóvenes de 17 a 24 años egresados de colegio con vocación para trabajar con motores y equipo pesado.
							</p>	
						</div>
					</div>
				</div>
			</div>
			<div class="blankdivider30"></div>
		</div>
	</section>

	<!-- end spacer section -->
	<a href="#" class="scrollup"><i class="icon-angle-up icon-square icon-bgdark icon-2x"></i></a>
	
	
	<script src="<c:url value="/resources/js/jquery.scrollTo.js"/>"></script>
		<script src="<c:url value="/resources/js/jquery.nav.js"/>"></script>
		<script src="<c:url value="/resources/js/jquery.localScroll.js"/>"></script>
		<script src="<c:url value="/resources/js/jquery.prettyPhoto.js"/>"></script>
			<script src="<c:url value="/resources/js/isotope.js"/>"></script>
			<script src="<c:url value="/resources/js/jquery.flexslider.js"/>"></script>
			<script src="<c:url value="/resources/js/inview.js"/>"></script>
			<script src="<c:url value="/resources/js/animate.js"/>"></script>
				<script src="<c:url value="/resources/js/contactform.js"/>"></script>
				<script src="<c:url value="/resources/js/custom.js"/>"></script>
	
	
	
</body>

</html>
