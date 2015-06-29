'use strict';

/**
 * IniciarSesionController
 * @constructor
 */

App.controller('IniciarSesionController', function($scope, $location) {
  $scope.mostrarMensaje = false;
  $scope.usuario = {};
  
  $scope.init = function() {
    $scope.usuario.nombreAdmi = "administrador@gmail.com",
    $scope.usuario.contrasennaAdmi = "1234"
    $scope.usuario.nombreCliente = "usuariocliente@gmail.com",
    $scope.usuario.contrasennaCliente = "1234"
  };

  $scope.init();

  $scope.iniciarSesion = function() {
    //Si es administrador
    if ($scope.nombre === $scope.usuario.nombreAdmi && $scope.contrasenna == $scope.usuario.contrasennaAdmi){
     
      $scope.mostrarMensaje = false;
      var path = "/catering/app#/catering-registrar";
      window.location.href = path;
      
    }else {
      $scope.mostrarMensaje = true;
    }
    
    //Si es usuario
    if ($scope.nombre === $scope.usuario.nombreCliente && $scope.contrasenna == $scope.usuario.contrasennaCliente){
      
      $scope.mostrarMensaje = false;
      $scope.mostrarMensaje = false;
      var path = "/catering/app#/catering-buscar";
      window.location.href = path;
      
    }else {
      $scope.mostrarMensaje = true;
    }
  };
});