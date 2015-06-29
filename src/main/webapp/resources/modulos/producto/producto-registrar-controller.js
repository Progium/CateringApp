'use strict';

/**
 * ProductoRegistrarController
 * @constructor
 */
App.controller('ProductoRegistrarController', function($scope) {
    $scope.tipos = [
        { id: 1, nombre: 'Grande' },
        { id: 2, nombre: 'Mediano' },
        { id: 3, nombre: 'Pequeño' },
        { id: 4, nombre: 'No Aplica' }
    ];
    
    $scope.catalogos = [
        { id: 1, nombre: 'Vajilla' },
        { id: 2, nombre: 'Postres' },
        { id: 3, nombre: 'Almuerzos' },
        { id: 4, nombre: 'Repostería' }
    ];
    
    $scope.productos = [
        { id: 1, nombre: 'Platos' },
        { id: 2, nombre: 'Tres Lehes' },
        { id: 3, nombre: 'Arroz con pollo' },
        { id: 4, nombre: 'Pan' }
    ];
    
    $scope.items = [
        { id: 1, name: 'Foo' },
        { id: 2, name: 'Bar' }
    ];
    
    $scope.caterings = [
        {id: 1, nombre: 'Catering Primavera'},
        {id: 2, nombre: 'Fito Catering'},
        {id: 3, nombre: 'Las brumas'}
    ];
    
    $scope.seleccionarTipos = null;
    $scope.seleccionarCatalogos = null;
    $scope.seleccionarProductos = null;
    $scope.selectedItem = null;
    
    $scope.seleccionar = {
            listacaterings: []
    };
});