'use strict';

/**
 * UsuarioRegistrarController
 * @constructor
 */

App.controller('UsuarioRegistrarController', function($scope, $location) {

	$scope.cancelar = function () {
		$location.path('/iniciar-sesion');
	}
  
	$scope.continuar = function(){
    
	}
});