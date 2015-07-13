<section class="main padder" ng-controller="ProductoRegistrarController">

	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<div class="clearfix">
				<h4>
					<i class="fa fa-edit"></i>Mi Catálogo
				</h4>
			</div>
			<section class="panel">
			
				<div class="panel-body">
					<div class="col-md-5">
						<h5>Lista general de productos</h5>
						<panel title="Lista general de productos">
						Buscar: <input type="search" ng-model="q" placeholder="búsqueda de productos"
							style="margin-bottom: 10px">
						<table class="table-bordered table">
							<th>
							<th>Nombre</th>
							<tr ng-repeat="producto in productos | filter:q as results ">
								<td>
									<input type="checkbox">
								</td>
								<td>
									<span>{{producto.nombre}}</span>
								</td>
							</tr>
						</table>
						</panel>
					</div>


				</div>
			</section>
		</div>
		<div class="col-sm-2"></div>
	</div>
</section>