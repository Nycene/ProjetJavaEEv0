<%-- 
    Document   : Acceuil
    Created on : 24 mars 2018, 20:30:56
    Author     : Naycene Boussoffara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css">
            .modal-login {		
		color: #636363;
		width: 350px;
	}
	.modal-login .modal-content {
		padding: 20px;
		border-radius: 5px;
		border: none;
	}
	.modal-login .modal-header {
		border-bottom: none;   
        position: relative;
        justify-content: center;
	}
	.modal-login h4 {
		text-align: center;
		font-size: 26px;
		margin: 30px 0 -15px;
	}
	.modal-login .form-control:focus {
		border-color: #70c5c0;
	}
	.modal-login .form-control, .modal-login .btn {
		min-height: 40px;
		border-radius: 3px; 
	}
	.modal-login .close {
        position: absolute;
		top: -5px;
		right: -5px;
	}	
	.modal-login .modal-footer {
		background: #ecf0f1;
		border-color: #dee4e7;
		text-align: center;
        justify-content: center;
		margin: 0 -20px -20px;
		border-radius: 5px;
		font-size: 13px;
	}
	.modal-login .modal-footer a {
		color: #999;
	}		
	.modal-login .avatar {
		position: absolute;
		margin: 0 auto;
		left: 0;
		right: 0;
		top: -70px;
		width: 95px;
		height: 95px;
		border-radius: 50%;
		z-index: 9;
		background: #60c7c1;
		padding: 15px;
		box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.1);
	}
	.modal-login .avatar img {
		width: 100%;
	}
	.modal-login.modal-dialog {
		margin-top: 80px;
	}
    .modal-login .btn {
        color: #fff;
        border-radius: 4px;
		background: #60c7c1;
		text-decoration: none;
		transition: all 0.4s;
        line-height: normal;
        border: none;
    }
	.modal-login .btn:hover, .modal-login .btn:focus {
		background: #45aba6;
		outline: none;
	}
	.trigger-btn {
		display: inline-block;
		margin: 100px auto;
	}
        .carousel{
        margin-top: 30px;
        opacity: 0.7;
        }
        .ktiba{
            float:right;
            width:200px;
            height:400px;
            width:50%;
            margin-top: 230px;
            margin-right: 50px;
            opacity:0.8;
        }
        .ktiba p{
            color:#000000;
            font-family: Helvetica;
        }
        .span{
            margin: 80px;
           font-size: 50px;
           font-family: "Goudy Old Style";
        }
        .petit{
            margin-top: 0.1px;
           font-size: 20px;
           font-family: "Goudy Old Style";
        }
        
        </style>
        </head>
        <body style= "background:#ffffff ">
        <%@include file="header.jsp" %>
        <!--
        <iframe width="1360" height="560" src="https://www.youtube.com/embed/SKVcQnyEIT8?autoplay=1">
           </iframe> -->  
        <div class="span" ><center> Find Your Favourite Book   
            <p class="petit"> Get it in ONE click!</p></center></div>
        
        
        <div> 
            <div class="ktiba">
                <p> <i>“Never trust anyone who has not brought a book with them.” <br>
                    <img src="http://newsroom.unl.edu/announce/files/file10184.png" style="width:50px; height:80px;"> ― Lemony Snicket, Horseradish</i> </p>
            </div>
        <div id="carouselExampleControls" class="carousel slide" data-ride="carousel" style="width: 400px; height:400px; margin-left: 150px;">
     <ol class="carousel-indicators">
    <li data-target="#carouselExampleControls" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleControls" data-slide-to="1"></li>
    <li data-target="#carouselExampleControls" data-slide-to="2"></li>
    </ol>
     <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="https://images.gr-assets.com/books/1395612906l/18635016.jpg" alt="First slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="https://upload.wikimedia.org/wikipedia/en/1/10/The_grand_design_book_cover.jpg" alt="Second slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="https://upload.wikimedia.org/wikipedia/en/0/07/LostSymbol.jpg" alt="Third slide">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
      </div> </div>
       <!--   <form method="get" action="Admin">
    <button type="submit" class="btn btn-success">Admin Space</button>
    </form>-->
       <div class="text-center" style="position:relative; left:40%;">
	<!-- Button HTML (to Trigger Modal) -->
	<a href="#myModal" class="trigger-btn" data-toggle="modal">Admin Space</a>
</div>

<!-- Modal HTML -->
<div id="myModal" class="modal fade">
	<div class="modal-dialog modal-login">
		<div class="modal-content">
			<div class="modal-header">
				<div class="avatar">
					<img src="http://imobiliariabomretiro.com.br/wp-content/uploads/2017/04/avatar-corretor.png" alt="Avatar">
				</div>				
				<h4 class="modal-title">Admin Login</h4>	
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
			</div>
			<div class="modal-body">
				<form action="Admin" method="get">
					<div class="form-group">
						<input type="text" class="form-control" name="username" placeholder="Username" required="required">		
					</div>
					<div class="form-group">
						<input type="password" class="form-control" name="password" placeholder="Password" required="required">	
					</div>        
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-lg btn-block login-btn">Login</button>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<a href="#">Forgot Password?</a>
			</div>
		</div>
	</div>
</div>     
    </body>
</html>
