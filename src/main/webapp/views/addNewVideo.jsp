<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="en">
<!--<![endif]-->

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>School Management System</title>
<meta name="description" content="Sufee Admin - HTML5 Admin Template">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="apple-touch-icon" href="apple-icon.png">
<link rel="shortcut icon" href="favicon.ico">

<link rel="stylesheet"
	href="vendors/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="vendors/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="vendors/themify-icons/css/themify-icons.css">
<link rel="stylesheet"
	href="vendors/flag-icon-css/css/flag-icon.min.css">
<link rel="stylesheet" href="vendors/selectFX/css/cs-skin-elastic.css">
<link rel="stylesheet" href="vendors/jqvmap/dist/jqvmap.min.css">


<link rel="stylesheet" href="assets/css/style.css">

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800'
	rel='stylesheet' type='text/css'>

</head>

<body>


	<!-- Left Panel -->

	<aside id="left-panel" class="left-panel">
		<nav class="navbar navbar-expand-sm navbar-default">

			<div class="navbar-header">
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#main-menu" aria-controls="main-menu"
					aria-expanded="false" aria-label="Toggle navigation">
					<i class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand" href="./"><h4>School</h4></a>
			</div>

			<div id="main-menu" class="main-menu collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="/"> <i
							class="menu-icon fa fa-dashboard"></i>Dashboard
					</a></li>
					<h3 class="menu-title">Menu</h3>
					<!-- /.menu-title -->
					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-laptop"></i>Master
					</a>
						<ul class="sub-menu children dropdown-menu">
							<li><i class="fa fa-puzzle-piece"></i><a href="boardMaster">Board
									Master</a></li>
							<li><i class="fa fa-id-badge"></i><a href="batchMaster">Batch
									Master</a></li>
							<li><i class="fa fa-bars"></i><a href="classMaster">Class
									Master</a></li>
							<li><i class="fa fa-share-square-o"></i><a
								href="subjectMaster">Subject Master </a></li>
						</ul></li>
					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-table"></i>Information
					</a>
						<ul class="sub-menu children dropdown-menu">
							<li><i class="fa fa-table"></i><a href="totalTeachers">Teacher
							</a></li>
							<li><i class="fa fa-table"></i><a href="totalStudents">Student
							</a></li>
						</ul></li>
					<li class="menu-item-has-children dropdown"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown"
						aria-haspopup="true" aria-expanded="false"> <i
							class="menu-icon fa fa-th"></i>Uploads
					</a>
						<ul class="sub-menu children dropdown-menu">
							<li><i class="menu-icon fa fa-th"></i><a href="totalVideos">video</a></li>
							<li><i class="menu-icon fa fa-th"></i><a
								href="totalHomework">Homework</a></li>
						</ul></li>








				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>
	</aside>
	<!-- /#left-panel -->

	<!-- Left Panel -->

	<!-- Right Panel -->

	<div id="right-panel" class="right-panel">

		<!-- Header-->
		<header id="header" class="header">

			<div class="header-menu">

				<div class="col-sm-7">
					<a id="menuToggle" class="menutoggle pull-left"><i
						class="fa fa fa-tasks"></i></a>
					<div class="header-left">
						<button class="search-trigger">
							<i class="fa fa-search"></i>
						</button>
						<div class="form-inline">
							<form class="search-form">
								<input class="form-control mr-sm-2" type="text"
									placeholder="Search ..." aria-label="Search">
								<button class="search-close" type="submit">
									<i class="fa fa-close"></i>
								</button>
							</form>
						</div>



					</div>
				</div>

				<div class="col-sm-5">
					<div class="user-area dropdown float-right">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"
							aria-haspopup="true" aria-expanded="false"> <img
							class="user-avatar rounded-circle" src="images/admin.png"
							alt="User Avatar">
						</a>

						<div class="user-menu dropdown-menu">
							<a class="nav-link" href="#"><i class="fa fa-user"></i> My
								Profile</a> <a class="nav-link" href="#"><i
								class="fa fa-power-off"></i> Logout</a>
						</div>
					</div>



				</div>
			</div>

		</header>
		<!-- /header -->
		<!-- Header-->

		<div class="breadcrumbs">
			<div class="col-sm-4">
				<div class="page-header float-left">
					<div class="page-title">
						<h1>Video</h1>
					</div>
				</div>
			</div>
			<div class="col-sm-8">
				<div class="page-header float-right">
					<div class="page-title">
						<ol class="breadcrumb text-right">

							<li><a href="#">Uploads</a></li>
							<li class="active">Video</li>
						</ol>
					</div>
				</div>
			</div>
		</div>
		
		<div class="col-lg-9">
                        <div class="card">
                            <div class="card-header"><strong>New Video</strong></div>
                            <div class="card-body card-block">
                            <form action="video" method="post">
                                <div class="form-group"><label for="company" class=" form-control-label">Board</label><input type="text" id="company" placeholder="Board name" name="board" class="form-control"></div>
                                    <div class="form-group"><label for="vat" class=" form-control-label">Class</label><input type="text" id="vat" placeholder="Class Name" name="teacher_class" class="form-control"></div>
                                        <div class="form-group"><label for="street" class=" form-control-label">Batch</label><input type="text" id="street" placeholder="Batch Name" name="" class="form-control"></div>
                                            <div class="row form-group">
                                                <div class="col-8">
                                                    <div class="form-group"><label for="city" class=" form-control-label">Subject</label><input type="text" id="city" name="teacher_subject" placeholder="Subject Name" class="form-control"></div>
                                                    </div>
                                                    <div class="col-8">
                                                        <div class="form-group"><label for="postal-code" class=" form-control-label">Teacher</label><input type="text" id="postal-code" name="teacher_name" placeholder="Teacher name" class="form-control"></div>
                                                        </div>
                                                    </div>
                                                    <div class="form-group"><label for="country"  class=" form-control-label">Youtube Link</label><input type="url" id="country" name="video_link" placeholder="Link" class="form-control"></div>
                                                    <div>
                                                    <button class="btn btn-danger">Add</button>
                                                    <button class="btn btn-dark">Reset</button>
                                                    <button class="btn btn-success">View Records</button>
                                                    </div>
                                                    </form>
                                                    </div>
                                                </div>
                                            </div>
		
		
		
		
		
		
		
		
		
		
		<script src="vendors/jquery/dist/jquery.min.js"></script>
    <script src="vendors/popper.js/dist/umd/popper.min.js"></script>
    <script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="assets/js/main.js"></script>


    <script src="vendors/datatables.net/js/jquery.dataTables.min.js"></script>
    <script src="vendors/datatables.net-bs4/js/dataTables.bootstrap4.min.js"></script>
    <script src="vendors/datatables.net-buttons/js/dataTables.buttons.min.js"></script>
    <script src="vendors/datatables.net-buttons-bs4/js/buttons.bootstrap4.min.js"></script>
    <script src="vendors/jszip/dist/jszip.min.js"></script>
    <script src="vendors/pdfmake/build/pdfmake.min.js"></script>
    <script src="vendors/pdfmake/build/vfs_fonts.js"></script>
    <script src="vendors/datatables.net-buttons/js/buttons.html5.min.js"></script>
    <script src="vendors/datatables.net-buttons/js/buttons.print.min.js"></script>
    <script src="vendors/datatables.net-buttons/js/buttons.colVis.min.js"></script>
    <script src="assets/js/init-scripts/data-table/datatables-init.js"></script>



</body>

</html>