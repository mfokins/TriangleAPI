'use strict';
var app = angular.module('myApp', []);
var url = 'http://localhost:8080/triangle';

    app.controller('TriangleController', ['$scope', '$http', function ($scope, $http) {
        $scope.search = function () {
            $http({
                url: url,
                method: 'GET',
                params: {x: $scope.x, y: $scope.y, z: $scope.z},
            }).success(function (response) {
                $scope.triangleResult = {
                    content: response.content,
                    img : function () {
                        if (response.content.includes('Equilateral Triangle')) {return  'img/Equilateral.png';}
                        if (response.content.includes('Isosceles Triangle')) {return  'img/Isosceles.png';}
                        if (response.content.includes('Scalene Triangle')) {return  'img/Scalene.png';}
                        if (response.content.includes('Not a triangle')) {return  'img/NotATriangle.png';}
                    }};
                });
            };
        }]);


