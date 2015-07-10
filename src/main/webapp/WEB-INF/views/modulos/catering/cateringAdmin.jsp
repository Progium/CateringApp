<section class="main padder">
	<div class="clearfix">
		<h4>
			<i class="fa fa-edit"></i> {{tituloPagina}}
		</h4>
	</div>
	<div class="row">
		<form class="form-horizontal" name="crearCatering"
			data-validate="parsley">

			<div class="col-sm-6">
				<section class="panel">
					<div class="panel-body">
						<!-- Nombre -->
						<div class="form-group">
							<label class="col-lg-3 control-label">Nombre</label>
							<div class="col-lg-8">
								<input ng-model="objCatering.nombre" type="text" name="nombre"
									placeholder="Isild's Catering" class="form-control" required
									ng-pattern="/^(\D)+$/" /> <span class="error-message"
									ng-show="crearCatering.nombre.$error.pattern">Debe
									ingresar solo letras</span>
							</div>
						</div>
						<!--Dirección-->
						<div class="form-group">
							<label class="col-lg-3 control-label">Dirección</label>
							<div class="col-lg-8">
								<textarea ng-model="objCatering.direccion"
									placeholder="200 metros sur del walmart" rows="5"
									class="form-control" data-trigger="keyup"
									data-rangelength="[20,200]" required></textarea>
							</div>
						</div>
						<!-- Teléfono1 -->
						<div class="form-group">
							<label class="col-lg-3 control-label">Teléfono</label>
							<div class="col-lg-8">
								<input ng-model="objCatering.telefono1" type="text"
									name="telefono1" placeholder="88888888" class="form-control"
									ng-pattern="/^(\d)+$/" required /> <span class="error-message"
									ng-show="crearCatering.telefono1.$error.pattern">Debe
									ingresar solo números</span>
							</div>
						</div>
						<!-- Teléfono2 -->
						<div class="form-group">
							<label class="col-lg-3 control-label">Teléfono
								alternativo</label>
							<div class="col-lg-8">
								<input ng-model="objCatering.telefono2" type="text"
									name="telefono2" placeholder="22223333" class="form-control"
									ng-pattern="/^(\d)+$/" /> <span class="error-message"
									ng-show="crearCatering.telefono2.$error.pattern">Debe
									ingresar solo números</span>
							</div>
						</div>
					</div>
					<!-- Horario atencion -->
					<div class="form-group">
						<label class="col-lg-3 control-label">Horario atención</label>
						<div class="col-lg-8">

							<textarea ng-model="objCatering.horarioAtencion"
								placeholder="Lunes a Viernes de 10am a 5pm" rows="5"
								class="form-control" data-trigger="keyup"
								data-rangelength="[20,200]" required></textarea>
						</div>
					</div>
				</section>
			</div>
			<div class="col-sm-6">
				<section class="panel">
					<div class="panel-body">
						<div class="form-group"></div>
						<!-- Provincia -->
						<div class="form-group">
							<label class="col-lg-3 control-label">Provincia</label>
							<div class="col-lg-4">
								<select name="account" class="form-control">
									<option value="1">Editor</option>
									<option value="0">Admin</option>
								</select>
							</div>
						</div>
						<!-- Cantón -->
						<div class="form-group">
							<label class="col-lg-3 control-label">Cantón</label>
							<div class="col-lg-4">
								<select name="account" class="form-control">
									<option value="1">Editor</option>
									<option value="0">Admin</option>
								</select>
							</div>
						</div>
						<!-- Distrito -->
						<div class="form-group">
							<label class="col-lg-3 control-label">Distrito</label>
							<div class="col-lg-4">
								<select name="account" class="form-control">
									<option value="1">Editor</option>
									<option value="0">Admin</option>
								</select>
							</div>
						</div>
						<!-- Foto -->
						<div class="form-group">
							<label class="col-lg-3 control-label">Logo</label>
							<div class="col-lg-9 media">
								<div
									class="bg-light pull-left text-center media-large thumb-large">
									<i
										class="fa fa-user inline fa fa-light fa fa-3x m-t-large m-b-large"></i>
								</div>
								<div class="media-body">
									<input ng-file-select="onFileSelect($files)" type="file"
										name="logo" title="Examinar"
										class="btn btn-sm btn-info m-b-small" required /> <br>
									<button class="btn btn-sm btn-default">Eliminar</button>
								</div>
							</div>
						</div>
						<div class="form-group"></div>
						<div class="form-group"></div>
						<div class="form-group"></div>
						<div class="form-group">
							<div class="col-lg-9 col-lg-offset-3">
								<button type="submit" class="btn btn-white"
									ng-click="cancelar()">Cancelar</button>
								<button type="submit" class="btn btn-info" ng-click="guardar()">Guardar</button>
							</div>
						</div>
						<div class="form-group"></div>
					</div>
				</section>
			</div>

		</form>
	</div>
</section>