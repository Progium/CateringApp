'use strict';

/**
 * CateringListarController
 * @constructor
 */
 
 
App.controller('CateringListarController', function($scope) {
    
    $scope.listaCatering = [{
        nombre: "Catering Service VIP",
        ubicacion: "Escazú",
    }, {
        nombre: "Catering Service Marce",
        ubicacion: "San Pedro",
    },{
        nombre: "Pierre Catering Service",
        ubicacion: "Cartago",
    }];
});