
<section class="main padder" ng-controller="CateringRegistrarController">
	
	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<div class="clearfix">
				<h4>
					<i class="fa fa-edit"></i>Registrar Catering Service
				</h4>
			</div>
			<section class="panel">	
				<div class="panel-body">
					<form class="form-horizontal" method="get" data-validate="parsley">
						<div class="form-group">
							<label class="col-lg-3 control-label">Nombre</label>
							<div class="col-lg-8">
								<input type="text" ng-model="nombre" placeholder="Nombre"
									data-required="true" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Dirección</label>
							<div class="col-lg-8">
								<textarea placeholder="Profile" rows="5" class="form-control"
									data-trigger="keyup" data-rangelength="[20,200]"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Teléfono</label>
							<div class="col-lg-8">
								<input type="text" ng-model="telefono" placeholder="Telefono"
									data-required="true" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Teléfono
								Alternativo</label>
							<div class="col-lg-8">
								<input type="text" ng-model="telefonoAlternativo"
									placeholder="TelefonoAlternativo" data-required="true"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Horario de atención</label>
							<div class="col-lg-8">
								<input type="text" ng-model="horarioAtencion"
									placeholder="HorarioAtencion" data-required="true"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Cantidad de eventos
								por día</label>
							<div class="col-lg-8">
								<input type="text" ng-model="cantidadEvento"
									placeholder="CantidadEvento" data-required="true"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Provincia</label>
							<div class="col-lg-8">
								<input type="text" ng-model="provincia" placeholder="Provincia"
									data-required="true" class="form-control">
							</div>
						</div>

						<div class="form-group">
							<label class="col-lg-3 control-label">Cantón</label>
							<div class="col-lg-8">
								<input type="text" ng-model="canton" placeholder="canton"
									data-required="true" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Distrito</label>
							<div class="col-lg-8">
								<input type="text" ng-model="distrito" placeholder="distrito"
									data-required="true" class="form-control">
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Logo</label>
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
							<div class="col-lg-9 col-lg-offset-3">
								<button type="submit" class="btn btn-white">Cancelar</button>
								<button type="submit" class="btn btn-primary">Guardar</button>
							</div>
						</div>
					</form>
				</div>
			</section>
		</div>
		<div class="col-sm-2"></div>
	</div>
</section>