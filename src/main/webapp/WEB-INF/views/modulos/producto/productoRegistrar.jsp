<section class="main padder" ng-controller="ProductoRegistrarController">

	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<div class="clearfix">
				<h4>
					<i class="fa fa-edit"></i>Mi Catálogo
				</h4>
			</div>
			<div class="col-xs-6">
				<section class="panel">
					<header class="panel-heading bg-white">
						<div class="text-center h5">Productos seleccionados</div>
						<div class="panel-body pull-in text-center">
							Buscar: <input type="search" ng-model="a" placeholder="búsqueda de productos"
							style="margin-bottom: 10px">
						<table class="table-bordered table">
							<th>
							<th>Nombre</th>
							<tr ng-repeat="productoSelec in productosSelecc | filter:a as results" ng-click="removido(productoSelec, 'removido')">
								<td>
									<input type="checkbox" ng-model="producto.done">
								</td>
								<td>
									<span>{{productoSelec.nombre}}</span>
								</td>
							</tr>
						</table>
						</div>
					</header>
				</section>
			</div>
			
			<div class="col-xs-6">
				<section class="panel">
					<header class="panel-heading bg-white">
						<div class="text-center h5">Lista de productos</div>
						<div class="panel-body pull-in text-center">
							Buscar: <input type="search" ng-model="q" placeholder="búsqueda de productos"
							style="margin-bottom: 10px">
						<table class="table-bordered table">
							<th>
							<th>Nombre</th>
							<tr ng-repeat="producto in productos | filter:q as results"  ng-click="seleccionado(producto, 'agregar')">
								<td>
									<input type="checkbox" ng-model="producto.done">
								</td>
								<td>
									<span>{{producto.nombre}}</span>
								</td>
							</tr>
						</table>		
						</div>
					</header>
				</section>
			</div>
	</div>					
	</div>
</section>