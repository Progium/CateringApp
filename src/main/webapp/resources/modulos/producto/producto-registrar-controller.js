'use strict';

/**
 * ProductoRegistrarController
 * @constructor
 */
App.controller('ProductoRegistrarController', function($scope,$http) {
   
   
	$scope.productos  = [];
	$scope.productosSelecc  = [];
	$scope.init = function(){
		var usuario = $.jStorage.get("user");
		$http.get('rest/protected/producto/getAll')
		  .success(function(response){
			  $scope.productos = response.productos; 
			  
		  });
	   
   };
   
   
   $scope.init();
   
   $scope.seleccionado = function(item, type){

       if (type == 'agregar'){
    	   
    	   $scope.productosSelecc.push(item);
    	   $scope.productos.splice($scope.productos.indexOf(item), 1);
    	
       }
       
   };
   
   $scope.removido = function(item, type){

       if (type == 'removido'){
    	   
    	   $scope.productos.push(item);
    	   $scope.productosSelecc.splice($scope.productosSelecc.indexOf(item), 1);
    	
       }
       
   };
  
   
});