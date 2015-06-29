<section class="main padder" ng-controller="UsuarioRegistrarController">
	<div class="clearfix">
		<h4>
			<i class="fa fa-edit"></i>Datos personales
		</h4>
	</div>
	<div class="row">
		<div class="col-sm-6">
			<section class="panel">
				<div class="panel-body">
					<form class="form-horizontal" method="get" data-validate="parsley">
						<div class="form-group"></div>
						<form class="panel-body" method="post">
							<div class="form-group">
								<label class="col-lg-3 control-label">Nombre</label>
								<div class="col-lg-8">
									<input type="text" name="username" placeholder="Marcela"
										class="form-control" ng-model="nombre" required></input>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-3 control-label">Primer Apellido</label>
								<div class="col-lg-8">
									<input type="text" name="username" placeholder="Leandro"
										class="form-control" ng-model="apellido" required></input>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-3 control-label">Segundo Apellido</label>
								<div class="col-lg-8">
									<input type="text" name="username" placeholder="Picado"
										class="form-control" ng-model="apellido2"></input>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-3 control-label">Email</label>
								<div class="col-lg-8">
									<input type="email" id="email" placeholder="marce@gmail.com"
										class="bg-focus form-control" ng-model="email"></input>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-3 control-label">Celular</label>
								<div class="col-lg-8">
									<input type="text" name="celular" placeholder="88888888"
										class="form-control" ng-model="phone"></input>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-3 control-label">Telefono</label>
								<div class="col-lg-8">
									<input type="text" name="telefono" placeholder="22223333"
										class="form-control"></input>
								</div>
							</div>
							<div class="form-group">
								<div class="col-lg-9 col-lg-offset-3">
									<button type="submit" class="btn btn-white">Cancelar</button>
									<button type="button" class="btn btn-primary"
										ng-click="siguiente()">Siguiente</button>
								</div>
							</div>
						</form>
					</form>
				</div>
			</section>
		</div>
	</div>
</section>