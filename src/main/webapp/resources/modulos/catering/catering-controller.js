'use strict';

/**
 * CateringController
 * @constructor
 */
App.controller('CateringRegistrarController', function($scope, $http,$location, $upload) {
	var objUsuario = $.jStorage.get("user");
	if(objUsuario){
		_ScopeContainer['MainController'].esAdministrador = true;	
		$scope.files = {};
		$scope.tituloPagina = "Registrar nuevo catering";
		$scope.listaProvincia = [];
		$scope.listaCanton = [];
		var listaCantones = [];
		var cantones =  [];
		var listaDistritos = [];
		var distritos =  [];
		$scope.listaDistrito = [];
		$scope.objCatering = {};
		
	    $scope.init = function() {
	    	//Obtiene la lista de provincias
	    	$http.get('rest/protected/provincia/getAll')
			.success(function(provinciaResponse) {
				$scope.listaProvincia = provinciaResponse.listaProvincia;
				$scope.objCatering.idProvincia = $scope.listaProvincia[0].idProvincia;	
			});
	    	
	    	//Obtiene la lista de cantones
	    	$http.get('rest/protected/canton/getAll')
			.success(function(cantonResponse) {
				listaCantones = cantonResponse.listaCanton;
				for (var i = 0; i < listaCantones.length; i++) {
					if(listaCantones[i].provincia == $scope.objCatering.idProvincia){
						//Agregar cantones de la provincia seleccionada
					    var ObjNuevoCanton = listaCantones[i];
						cantones.push(ObjNuevoCanton);
					}  
				};
				$scope.listaCanton = cantones;
				$scope.objCatering.idCanton = $scope.listaCanton[0].idCanton;	
			});
	    	
	    	//Obtiene la lista de distritos
	    	$http.get('rest/protected/distrito/getAll')
			.success(function(distritoResponse) {
				listaDistritos = distritoResponse.listaDistrito;
				for (var i = 0; i < listaDistritos.length; i++) {
					if(listaDistritos[i].canton == $scope.objCatering.idCanton){
						//Agregar distritos del canton seleccionado
					    var ObjNuevoDistrito = listaDistritos[i];
						distritos.push(ObjNuevoDistrito);
					}  
				};
				$scope.listaDistrito =distritos;
				$scope.objCatering.idDistrito = $scope.listaDistrito[0].idDistrito;
			});
	    	
	    };
	    
	    $scope.init();
		
		//Trae los cantones de la provincia seleccionada
	    $scope.llenarCanton = function() {
	    	$scope.listaCanton.length = 0;
//	    	//Obtiene la lista de cantones
//	    	$http.post('rest/protected/canton/getCantonByProvincia', $scope.objCatering.idProvincia)
//			.success(function(cantonResponse) {
//				$scope.listaCanton = cantonResponse.listaCanton;
//				$scope.objCatering.idCanton = $scope.listaCanton[0].idCanton;	
//			});
	    	
	    	for (var i = 0; i < listaCantones.length; i++) {
				if(listaCantones[i].provincia == $scope.objCatering.idProvincia){
					//Agregar cantones de la provincia seleccionada
				    var ObjNuevoCanton = listaCantones[i];
					cantones.push(ObjNuevoCanton);
				}  
			};
			$scope.listaCanton = cantones;
			$scope.objCatering.idCanton = $scope.listaCanton[0].idCanton;	
			
			$scope.llenarDistrito();
	    };
	    
		//Trae los distritos del canton seleccionado
	    $scope.llenarDistrito = function() {
	    	$scope.listaDistrito.length = 0;
	    	
			for (var i = 0; i < listaDistritos.length; i++) {
				if(listaDistritos[i].canton == $scope.objCatering.idCanton){
					//Agregar distritos del canton seleccionado
				    var ObjNuevoDistrito = listaDistritos[i];
					distritos.push(ObjNuevoDistrito);
				}  
			};
			$scope.listaDistrito =distritos;
			$scope.objCatering.idDistrito = $scope.listaDistrito[0].idDistrito;
	    };
	    
		$scope.cancelar = function(){
			$location.path('/iniciar-sesion');
		}
		
		//Guarda los datos ingresados por el usuario.
		$scope.guardar = function() {
			if(this.crearCatering.$valid){
				var cateringLogo = $scope.files[0];
				var datosCatering = {};
				var urlRegistrar = 'rest/protected/catering/registrar';
				datosCatering = {
					administradorId: objUsuario.idUsuario,
					nombre: $scope.objCatering.nombre,
					cedulaJuridica : $scope.objCatering.cedulaJuridica,
					direccion: $scope.objCatering.direccion,
					telefono1: $scope.objCatering.telefono1,
					telefono2: $scope.objCatering.telefono2,
					horario: $scope.objCatering.horarioAtencion,
					provinciaId: $scope.objCatering.idProvincia,
					cantonId: $scope.objCatering.idCanton,
					distritoId: $scope.objCatering.idDistrito,
					needAccess: "false"
				}
				var req = {
						 method: 'POST',
						 url: urlRegistrar,
						 data: datosCatering
						}
				if(cateringLogo){
					//Guarda la información en variables y se las pasa al controlador de catering de java.
					$scope.upload = $upload.upload({
						url : urlRegistrar,
						data : datosCatering,
						file : cateringLogo
					}).success(function(contractCateringResponse, status, headers, config) {
						//Muestra un mensaje si el usuario es registrado satisfactoriamente en el sistema.
						if(contractCateringResponse.code == 200){
							alert("El catering se registro correctamente.");
							//$location.path('/iniciar-sesion');
						}else{
							alert("No se pudo registrar el catering.");
						 }
					});
				}else{
					$http(req).success(function(contractCateringResponse, status, headers, config) {
							//Muestra un mensaje si el usuario es registrado satisfactoriamente en el sistema.
							if(contractCateringResponse.code == 200){
								alert("El catering se registro correctamente.");
								//$location.path('/iniciar-sesion');
							}else{
								alert("No se pudo registrar el catering.");
							 }							
						});
				}
				
			}
			
		}
		//Guarda los archivos seleccionados en el scope.files.
		$scope.onFileSelect = function($files) {
	    	$scope.files = $files;
	    };

	}else{
		var path = "/catering/#/iniciar-sesion";
		window.location.href = path;
	}
});

App.controller('CateringModificarController', function($scope, $location, $routeParams) {
	var objUsuario = $.jStorage.get("user");
	if(objUsuario){
		_ScopeContainer['MainController'].esAdministrador = true;
		$scope.objUsuario = {
				idCatering: $routeParams.pidCatering
		};
		$scope.files = {};
		$scope.tituloPagina = "Modificar datos del catering";
		$scope.listaProvincia = [];
		$scope.listaCanton = [];
		$scope.listaDistrito = [];
		$scope.objCatering = {};
		
	    $scope.init = function() {
	    	//Obtiene la lista de provincias
	    	$http.get('rest/protected/provincia/getAll')
			.success(function(provinciaResponse) {

				$scope.listaProvincia = provinciaResponse.listaProvincia;
				$scope.objCatering.idProvincia = $scope.listaProvincia[0].idProvincia;	
			});
	    	//Obtiene la lista de cantones
	    	$http.get('rest/protected/canton/getAll')
			.success(function(cantonResponse) {

				$scope.listaCanton = cantonResponse.listaCanton;
				$scope.objCatering.idCanton = $scope.listaCanton[0].idCanton;	
			});
	    	//Obtiene la lista de distritos
	    	$http.get('rest/protected/distrito/getAll')
			.success(function(distritoResponse) {
				$scope.listaDistrito = cantonResponse.listaDistrito;
				$scope.objCatering.idDistrito = $scope.listaDistrito[0].idDistrito;	
			});
	    	
	    };
	    
	    $scope.init();
		$scope.cancelar = function(){
			$location.path('/');
		}
		
		$scope.guardar = function() {
			$location.path('/iniciar-sesion');
		}
	};   

});