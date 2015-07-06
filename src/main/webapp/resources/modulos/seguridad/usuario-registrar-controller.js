'use strict';

/**
 * UsuarioRegistrarController
 * 
 * @constructor
 */

App.controller('UsuarioRegistrarController', function($scope, $location) {

	$scope.cancelar = function () {
		$location.path('/iniciar-sesion');
	}
	$scope.continuar = function(){
	    
	}

	var compareTo = function() {
	    return {
	        require: "ngModel",
	        scope: {
	            otherModelValue: "=compareTo"
	        },
	        link: function(scope, element, attributes, ngModel) {
	             
	            ngModel.$validators.compareTo = function(modelValue) {
	                return modelValue == scope.otherModelValue;
	            };
	 
	            scope.$watch("otherModelValue", function() {
	                ngModel.$validate();
	            });
	        }
	    };
	};
	 
	module.directive("compareTo", compareTo);
	
});