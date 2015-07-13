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
						<panel title="eflkem">
						<p>jdksfnkdsjnkjsdnfkjndsknk</p>
						Buscar: <input type="text" ng-model="search.nombre"
							style="margin-bottom: 10px">
						<table class="table-bordered table">
							<th>
							<th>Nombre</th>
							<tr ng-repeat="producto in listaProductos | filter:search ">
								<td><input type="checkbox" ng-model="producto.done"></td>
								<td><span class="done-{{producto.done}}">{{producto.nombre}}
								</span></td>
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