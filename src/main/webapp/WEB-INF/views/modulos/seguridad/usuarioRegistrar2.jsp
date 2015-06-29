<section class="main padder" ng-controller="UsuarioRegistrarController">
	<div class="clearfix">
		<h4>
			<i class="fa fa-edit"></i>Datos de la cuenta
		</h4>
	</div>
	<div class="row">
		<div class="col-sm-6">
			<section class="panel">
				<div class="panel-body">
					<form class="form-horizontal" method="get" data-validate="parsley">
						<div class="form-group">
							<label class="col-lg-2-4 control-label">Tipo</label>
							<div class="col-lg-5">
								<!-- radio -->
								<div class="radio">
									<label> <input type="radio" name="radio">
										Cliente
									</label>
								</div>
								<div class="radio">
									<label> <input type="radio" name="radio">
										Administrador del Catering
									</label>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-2-4 control-label">Contraseña</label>
							<div class="col-lg-5">
								<input type="password" name="password" placeholder="Password"
									class="bg-focus form-control"></input>
								<div class="line line-dashed m-t-large"></div>
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-2-4 control-label">Repetir
								Contraseña</label>
							<div class="col-lg-5">
								<input type="password" name="password" placeholder="Password"
									class="bg-focus form-control"></input>
								<div class="line line-dashed m-t-large"></div>
							</div>
						</div>
						<div class="form-group">
							<div class="col-lg-9 col-lg-offset-3">
								<button type="submit" class="btn btn-white">Guardar</button>
								<button type="button" class="btn btn-primary"
									ng-click="continuar()">Continuar</button>
							</div>
						</div>
					</form>
				</div>
			</section>
		</div>
	</div>
</section>