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
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"> 


	
<style>
 
@import url('https://fonts.googleapis.com/css?family=Josefin+Sans:100,300,400,600,700');

 body, html {
background: -webkit-linear-gradient(-135deg, #c850c0, #4158d0);
  background: -o-linear-gradient(-135deg, #c850c0, #4158d0);
  background: -moz-linear-gradient(-135deg, #c850c0, #4158d0);
  background: linear-gradient(-135deg, #131211, #333130);
	height: 100%;
	width:100%;
	font-family: Poppins-Regular, sans-serif;
}
header {
    background: #16D7E4;
    height: 80px;
    padding:10px;
}

.login{
margin-top: 80px;
}

h1{
    font-weight:600;
    font-family: 'Josefin Sans', sans-serif;
    text-transform:capitalize;
    text-align:center;
    color:#FFF;
}

.inner-form{
    background:#EAE3E1;
    padding:80px;
    box-shadow: 0 2px 4px 0 rgba(0,0,0,0.4);
    margin-top:30px;
}

label{
    font-weight:400;
    font-size:15px;
}

.form-control {
    background-color: #f5f5f5;
    box-shadow: none;
    color: #565656;
    font-size:14px;
    padding:30px 10px;
    margin-bottom:30px;
    border: 1px solid #f1f1f1;
}

.btn{ 
    background: #24acb3;
    color: #FFF;
    border-radius: 6px;
    margin: 0 auto;
    height: 48px;
    line-height: 38px;
    display: table;
    font-size: 15px;
    width: 100%;
}

.btn:hover{
    background:#FFF;
    border:2px solid #24acb3;
}

.forgot{
    text-align:center;
    margin-top:30px;
    font-size:16px;
}

.nav-tabs{
    border: none;
    margin: 0 auto;
    display: table;
}

.fa{
    color:#FFF;
    background: #24acb3;
    padding: 40px;
    border-radius: 50%;
}

.fa:hover{
    color:#24acb3;
    background: #FFF;
    border:2px solid #24acb3;
    margin-top:-4px;
}

.inner-form:hover{
    -webkit-transform: scale(1.05);
    -moz-transform: scale(1.05);
    -ms-transform: scale(1.05);
    -o-transform: scale(1.05);
    transform: scale(1.05);
    box-shadow: 0px 10px 25px rgba(0, 0, 6, 0.2);
    -webkit-transition: all 1s ease-in-out;
    -moz-transition: all 1s ease-in-out;
    -o-transition: all 1s ease-in-out;
    transition: all 1s ease-in-out; 
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

	<div class="login">
   <div class="container">
  
       <div class="col-lg-6 col-lg-offset-3">
           
            <h1 class="horizontal">Login Admin</h1>
            
            <div class="inner-form">
                <form:form role="form" method="post" action="login">
            		 <div class="row">
            		       
            		        <div class="icon text-center">
            		           <i class="fa fa-paper-plane fa-2x" aria-hidden="true"></i>
        			        </div> 
        			        
        			         <br/> <br/> 
        			         
        			    	<div class="col-lg-12">
        			    	    <label>Username</label>
        			    	    <div class="form-group">
        			    			<form:input type="text" name="email" path="admin_name" class="form-control" placeholder=""/>
        			    		</div>
        			    	</div>
        			    	
        			    	<div class="col-lg-12">
        			    	    <label>Password</label>
        			    	    <div class="form-group">
        							<form:input type="password" name="password" path="admin_password" id="password" class="form-control" placeholder=""/>
        			    		</div>
        			    	</div>
        			    	
        					<div class="col-lg-12">
        					    <button type="submit" value="Login" class="btn btn-default">
        							<span>LOGIN</span>
        						</button>
        					</div>
        					
        						
            		    </div>
            	    </form:form>
            	    				<font color="red">${message}</font>
            	    
    	        </div> <!-- inner-form -->
			
		</div>   
	</div>   
</div>  
</body>
</html>
