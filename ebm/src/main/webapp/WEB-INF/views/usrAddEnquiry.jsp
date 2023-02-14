<%@include file="usrHeader.jsp"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<div class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1 class="m-0">
						Welcome
						<%=username%></h1>
				</div>
				<!-- /.col -->
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active">Dashboard v1</li>
					</ol>
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container-fluid -->
	</div>
	<!-- /.content-header -->

	<!-- Main content -->
	<section class="content">
		<div class="container-fluid">
			<!-- Small boxes (Stat box) -->



			<!-- general form elements disabled -->
			<div class="card card-warning">
				<div class="card-header">
					<h3 class="card-title">Add Enquiry</h3>
				</div>
				<!-- /.card-header -->
				<div class="card-body">
					<form action="addEnquiry" method="post">
						<div class="row">
							<div class="col-sm-6">
								<!-- text input --> 
								<div class="form-group">
									<label>Name</label> <input type="text" name="enquiryBy"
										class="form-control" placeholder="Enter ...">
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<label>Phone No</label> <input type="text"
										name="enquiryContact" class="form-control"
										placeholder="Enter ...">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-sm-6">
								<!-- textarea -->
								<div class="form-group">
									<label>Detail</label>
									<textarea class="form-control" name="eventNote" rows="3"
										placeholder="Enter ..."></textarea>
								</div>
							</div>
						</div>

						<!-- input states -->
						<div class="form-group">
							<label class="col-form-label" for="inputSuccess"><i
								class="fas fa-check"></i> Input with success</label> <input type="text"
								class="form-control is-valid" id="inputSuccess"
								placeholder="Enter ...">
						</div>
						<div class="form-group">
							<label class="col-form-label" for="inputWarning"><i
								class="far fa-bell"></i> Input with warning</label> <input type="text"
								class="form-control is-warning" id="inputWarning"
								placeholder="Enter ...">
						</div>
						<div class="form-group">
							<label class="col-form-label" for="inputError"><i
								class="far fa-times-circle"></i> Input with error</label> <input
								type="text" class="form-control is-invalid" id="inputError"
								placeholder="Enter ...">
						</div>

						<div class="row">
							<div class="col-sm-6">
								<!-- checkbox -->
								<div class="form-group">
									<div class="form-check">
										<input class="form-check-input" type="checkbox"> <label
											class="form-check-label">Checkbox</label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="checkbox" checked>
										<label class="form-check-label">Checkbox checked</label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="checkbox" disabled>
										<label class="form-check-label">Checkbox disabled</label>
									</div>
								</div>
							</div>
							<div class="col-sm-6">
								<!-- radio -->
								<div class="form-group">
									<div class="form-check">
										<input class="form-check-input" type="radio" name="radio1">
										<label class="form-check-label">Radio</label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="radio1"
											checked> <label class="form-check-label">Radio
											checked</label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" disabled>
										<label class="form-check-label">Radio disabled</label>
									</div>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-6">
								<!-- select -->
								<div class="form-group">
									<label>Select</label> <select class="form-control">
										<option>option 1</option>
										<option>option 2</option>
										<option>option 3</option>
										<option>option 4</option>
										<option>option 5</option>
									</select>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<label>Select Disabled</label> <select class="form-control"
										disabled>
										<option>option 1</option>
										<option>option 2</option>
										<option>option 3</option>
										<option>option 4</option>
										<option>option 5</option>
									</select>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-6">
								<!-- Select multiple-->
								<div class="form-group">
									<label>Select Multiple</label> <select multiple
										class="form-control">
										<option>option 1</option>
										<option>option 2</option>
										<option>option 3</option>
										<option>option 4</option>
										<option>option 5</option>
									</select>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<label>Select Multiple Disabled</label> <select multiple
										class="form-control" disabled>
										<option>option 1</option>
										<option>option 2</option>
										<option>option 3</option>
										<option>option 4</option>
										<option>option 5</option>
									</select>
								</div>
							</div>
						</div>
						<input type="submit" value="Submit Enquiry" class="btn-btn sucess">
					</form>
				</div>
				<!-- /.card-body -->
			</div>
			<!-- /.card -->
			<!-- general form elements disabled -->









			<!-- Main row -->
			<div class="row">
				<!-- Left col -->
				<section class="col-lg-7 connectedSortable">
					<!-- Custom tabs (Charts with tabs)-->
					<!-- /.card-body -->
			</div>
			<!-- /.card-footer-->
		</div>
		<!--/.direct-chat -->

	</section>
</div>
</div>
<!-- /.container-fluid -->
</section>
</div>

<%@include file="footer.jsp"%>