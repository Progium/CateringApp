'use strict';

/**
 * CateringController
 * @constructor
 */
App.controller('CateringRegistrarController', function($scope, $http,$location, $upload) {
	var objUsuario = $.jStorage.get("user");
	if(objUsuario){
		_ScopeContainer['MainController'].esAdministrador = true;	
		$scope.files = {};
		$scope.tituloPagina = "Registrar nuevo catering";
		$scope.listaProvincia = [];
		$scope.objCatering = {};
		
	    $scope.init = function() {
	    	
	    	$http.get('rest/protected/provincia/getAll')
			.success(function(provinciaResponse) {

				$scope.listaProvincia = provinciaResponse.listaProvincia;
				$scope.objCatering.idProvincia = $scope.listaProvincia[0].idProvincia;	
			});
	    	
	    };
	    
	    $scope.init();
		
		$scope.cancelar = function(){
			$location.path('/iniciar-sesion');
		}
		//Guarda los datos ingresados por el usuario.
		$scope.guardar = function() {
			
			
		}
		//Guarda los archivos seleccionados en el scope.files.
		$scope.onFileSelect = function($files) {
	    	$scope.files = $files;
	    };
		
	}else{
		var path = "/catering/#/iniciar-sesion";
		window.location.href = path;
	}
});

App.controller('CateringModificarController', function($scope, $location, $routeParams) {
	$scope.files = {};
	$scope.tituloPagina = "Modificar datos del catering";
	$scope.objUsuario = {};
	
	//$routeParams.pidCatering
	
	$scope.cancelar = function(){
		$location.path('/');
	}

	$scope.guardar = function() {
		$location.path('/iniciar-sesion');
	}
});