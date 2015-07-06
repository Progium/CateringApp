'use strict';

/**
 * CateringRegistrarController
 * @constructor
 */

App.controller('CateringRegistrarController', function($scope, $location) {
	var objUsuario = $.jStorage.get("user");
	if(objUsuario){
		_ScopeContainer['MainController'].esAdministrador = true;	
		
		
	}else{
		var path = "/catering/#/iniciar-sesion";
		window.location.href = path;
	}
});