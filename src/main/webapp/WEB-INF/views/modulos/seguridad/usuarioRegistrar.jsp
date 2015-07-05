<section class="main padder" ng-controller="UsuarioRegistrarController">
	<div class="clearfix">
		<h4>
			<i class="fa fa-edit"></i>Formulario de Registro
		</h4>
	</div>
	<div class="row">
		<form class="form-horizontal" name="crearUsuario"
			data-validate="parsley">

			<div class="col-sm-6">
				<section class="panel">
					<div class="panel-body">
						<div class="form-group">
							<h4 class="posicion">Datos Personales</h4>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Foto</label>
							<div class="col-lg-9 media">
								<div
									class="bg-light pull-left text-center media-large thumb-large">
									<i
										class="fa fa-user inline fa fa-light fa fa-3x m-t-large m-b-large"></i>
								</div>
								<div class="media-body">
									<input type="file" name="file" title="Examinar"
										class="btn btn-sm btn-info m-b-small"> <br>
									<button class="btn btn-sm btn-default">Eliminar</button>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Nombre</label>
							<div class="col-lg-8">
								<input type="text" name="nombre" placeholder="Marcela"
									class="form-control" ng-pattern="/a-zA-Z/" ng-model="nombre"
									required />
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Primer Apellido</label>
							<div class="col-lg-8">
								<input type="text" name="username" placeholder="Leandro"
									class="form-control" ng-model="apellido" required />
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Segundo Apellido</label>
							<div class="col-lg-8">
								<input type="text" name="username" placeholder="Picado"
									class="form-control" ng-model="apellido2" />
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Email</label>
							<div class="col-lg-8">
								<input type="email" id="email" placeholder="marce@gmail.com"
									class="bg-focus form-control" ng-model="email" required />
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Teléfono1</label>
							<div class="col-lg-8">
								<input type="text" name="telefono1" placeholder="88888888"
									class="form-control" ng-pattern="/^\d{0,9}(\.\d{1,9})?$/"
									ng-model="telefono1" required />
								<!-- 								<span class="error" ng-show="crearUsuario.telefono1.$error.number">Not valid number!</span> -->
							</div>

							<span class="error-message"
								ng-show="crearUsuario.telefono1.pattern">The phone number
								field should be</span>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Teléfono2</label>
							<div class="col-lg-8">
								<input type="text" name="telefono2" placeholder="22223333"
									ng-model="telefono2" class="form-control" />
							</div>
						</div>
					</div>
				</section>
			</div>
			<div class="col-sm-6">
				<section class="panel">
					<div class="panel-body">
						<div class="form-group">
							<h4 class="posicion">Datos de la Cuenta</h4>
						</div>
						<div class="panel-body">
							<form class="form-horizontal" method="get"
								data-validate="parsley">
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
											class="bg-focus form-control" required />
										<div class="line line-dashed m-t-large"></div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2-4 control-label">Repetir
										Contraseña</label>
									<div class="col-lg-5">
										<input type="password" name="password" placeholder="Password"
											class="bg-focus form-control" required />
										<div class="line line-dashed m-t-large"></div>
									</div>
								</div>
								<div class="form-group">
									<div class="col-lg-9 col-lg-offset-3">
										<button type="submit" class="btn btn-white"
											ng-click="continuar()">Cancelar</button>
										<button class="btn btn-info" ng-click="continuar()">Guardar</button>
									</div>
								</div>
				</section>
			</div>

		</form>
	</div>
</section>