'use strict';

/**
 * CateringListarController
 * @constructor
 */
 
App.controller('CateringListarController', function($scope, $http,$location, $upload) {
	var objUsuario = $.jStorage.get("user");
	if(objUsuario){
		_ScopeContainer['MainController'].esAdministrador = true;	
		$scope.files = {};
		$scope.tituloPagina = "Listar catering";
		$scope.cateringLista = [];

	$scope.init = function(){
		console.log("entre");
		//Obtiene la lista de caterings
		$http.post('rest/protected/catering/getCaterigLista', objUsuario.idUsuario)
		.success(function(cateringResponse) {
			$scope.cateringLista = cateringResponse.cateringLista;
			console.log($scope.cateringLista);
			//$scope.objCatering.idCatering = $scope.cateringLista[0].idCatering;	
		
		});
		
	};
	
  };	
	
});
		
		
    