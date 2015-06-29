'use strict';

var PrototipoProgium = {};
var _ScopeContainer = {};
var App = angular.module('PrototipoProgium', ['PrototipoProgium.services', 'ngRoute']);

App.controller('MainController', function($scope, $route, $routeParams, $location) {
     $scope.$route = $route;
     $scope.$location = $location;
     $scope.$routeParams = $routeParams;
     $scope.esAdministrador = true;
     $scope.esconderMenu = false;
     $scope.esconderHeader = false;
     
     //Almacenar MainController Scoper para cambiar las variables desde otros scopes
     _ScopeContainer['MainController'] = $scope;
})

App.config(function($routeProvider, $locationProvider) {
  	$routeProvider
	  	.when('/iniciar-sesion', {
			templateUrl: 'modulos/seguridad-iniciar-sesion',
			controller: 'IniciarSesionController'
		})
		.when('/usuario-registrar', {
			templateUrl: 'modulos/seguridad-usuario-registrar',
			controller: 'UsuarioRegistrarController'
		})
		.when('/usuario-registrar-siguiente', {
			templateUrl: 'modulos/seguridad-usuario-registrar2',
			controller: 'UsuarioRegistrarController'
		})
		.when('/catering-registrar', {
			templateUrl: 'modulos/catering-registrar',
			controller: 'CateringRegistrarController'
		})
		.when('/catering-buscar', {
			templateUrl: 'modulos/catering-buscar',
			controller: 'CateringBuscarController'
		})
		.when('/producto-registrar', {
			templateUrl: 'modulos/producto-registrar',
			controller: 'ProductoRegistrarController'
		})
		.when('/cotizacion-registrar', {
			templateUrl: 'modulos/cotizacion-registrar',
			controller: 'CotizacionRegistrarController'
		})
		.otherwise({
        	redirectTo: '/iniciar-sesion'
		});
});