'use strict';

/**
 * ProductoRegistrarController
 * @constructor
 */
App.controller('ProductoRegistrarController', function($scope,$http) {
   
   
	$scope.listaproductos  = [];
  
	$scope.init = function(){
		var usuario = $.jStorage.get("user");
		$http.get('rest/protected/producto/getAll')
		  .success(function(response){
			  $scope.listaproductos = response.productos; 
		  });
	   
   };
   
   
   $scope.init();
   
});