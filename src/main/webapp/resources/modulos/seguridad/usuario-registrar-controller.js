'use strict';

/**
 * UsuarioRegistrarController
 * @constructor
 */

App.controller('UsuarioRegistrarController', function($scope, $location) {
  $scope.siguiente = function () {
    $location.path('/usuario-registrar-siguiente');
  }
  
  $scope.continuar = function(){
    $location.path('/iniciar-sesion');
  }
});