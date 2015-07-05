'use strict';

/**
 * UsuarioRegistrarController
 * @constructor
 */

App.controller('UsuarioRegistrarController', function($scope, $location) {
	$scope.onlyNumbers = "^[0-9]*\.?[0-9]+$";
	
	$scope.phoneNumberPattern = (function() {
	    var regexp = /^\d{0,9}(\.\d{1,9})?$/;
	    return {
	        test: function(value) {
	            if( $scope.requireTel === false ) {
	                return true;
	            }
	            return regexp.test(value);
	        }
	    };
	})();
	$scope.cancelar = function () {
		$location.path('/iniciar-sesion');
	}
  
	$scope.continuar = function(){
    
	}
});