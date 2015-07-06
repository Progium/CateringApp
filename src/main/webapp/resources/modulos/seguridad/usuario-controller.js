'use strict';

/**
 * UsuarioController
 * 
 * @constructor
 */

App.controller('UsuarioRegistrarController', function($scope, $location, $upload) {
	$scope.files = {};
	$scope.tituloPagina = "Registrar nuevo usuario";
	$scope.objUsuario = {
		tipoUsuarioId : 2
	};
	
	$scope.cancelar = function(){
		$location.path('/iniciar-sesion');
	}
	
	$scope.guardar = function() {
		var usuarioFoto = $scope.files[0];
		
		$scope.upload = $upload.upload({
			url : 'rest/protected/usuario/registrar',
			data : {
				nombre: $scope.objUsuario.nombre,
				apellido1: $scope.objUsuario.apellido1,
				apellido2: $scope.objUsuario.apellido2,
				correo: $scope.objUsuario.correo,
				telefono1: $scope.objUsuario.telefono1,
				telefono2: $scope.objUsuario.telefono2,
				tipoUsuarioId: $scope.objUsuario.tipoUsuarioId,
				contrasenna: $scope.objUsuario.contrasenna,
				needAccess: "false"
			},
			file : usuarioFoto
		}).success(function(contractUsuarioResponse, status, headers, config) {
			// Rent is uploaded successfully
			if(contractUsuarioResponse.code == 200){
				alert("El usuario se registro correctamente.");
				$location.path('/iniciar-sesion');
			}
		});
	}
	
	$scope.onFileSelect = function($files) {
    	$scope.files = $files;
    };
});

App.controller('UsuarioModificarController', function($scope, $location, $routeParams) {
	$scope.files = {};
	$scope.tituloPagina = "Modificar datos del usuario";
	$scope.objUsuario = {};
	
	//$routeParams.pidUsuario
	
	$scope.cancelar = function(){
		$location.path('/');
	}

	$scope.guardar = function() {
		$location.path('/iniciar-sesion');
	}
});