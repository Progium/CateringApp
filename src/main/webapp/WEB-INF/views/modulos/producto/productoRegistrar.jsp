<!-- .sidebar -->
<section class="main padder" ng-controller="ProductoRegistrarController">
	<div class="row">
		<div class="col-lg-5  col-lg-offset-3">
			<section class="panel">
				<header class="panel-heading text-center"> Crear Catálogo
				</header>
				<div class="panel-body" ng-controlller="RegistrarCatalogoController">
					<form class="form-horizontal" method="get" data-validate="parsley">
						<div class="form-group">

							<label class="col-lg-3 control-label">Tipo</label>
							<div class="col-lg-5">
								<select ng-model="seleccionarTipos"
									ng-options="tipo as tipo.nombre for tipo in tipos">
								</select>
							</div>
						</div>

						<!--<div ng-controller="RegistrarCatalogoController">
                    <select ng-model="selectedItem" 
                    ng-options="item as item.name for item in items"></select>
                    {{selectedItem | json}}
                  </div> -->

						<div class="form-group">
							<label class="col-lg-3 control-label">Catálogo</label>
							<div class="col-lg-5">
								<select ng-model="seleccionarCatalogos"
									ng-options="catalogo as catalogo.nombre for catalogo in catalogos"
									required>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label class="col-lg-3 control-label">Producto</label>
							<div class="col-lg-5">
								<select ng-model="seleccionarProductos"
									ng-options="producto as producto.nombre for producto in productos">
								</select>
							</div>
						</div>

						<div class="form-group">
							<label class="col-lg-3 control-label">Precio</label>
							<div class="col-lg-5">
								<input type="text" name="precio" required>
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Descripción</label>
							<div class="col-lg-5">
								<textarea name="descrip" class="form-control"
									style="max-width: 207px; max-height: 130px; resize: none;"></textarea>
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Mis Catering</label>
							<div class="col-lg-5">
								<label ng-repeat="catering in caterings"> <input
									type="checkbox" ng-model="seleccionar"
									checklist-value="catering"> {{catering.nombre}}
								</label>
							</div>
						</div>
						<div class="form-group">
							<label class="col-lg-3 control-label">Fotografía</label>
							<div class="col-lg-5">
								<img src="resources/first/src/images/arroz.jpg" alt="Arroz" />
							</div>
						</div>
					</form>
					<br>
					<div class="form-group">
						<div class="col-lg-9 col-lg-offset-5">
							<button type="submit" class="btn btn-primary">Guardar</button>
						</div>
					</div>
			</section>
		</div>
	</div>
	
</section>