'use strict';
var myapp = angular.module('myApp', []);
myapp.controller('GetTriangle', function ($scope, $http) {
    $http.get('http://localhost:8080/triangle').success(function (response) {
        $scope.result = {
            content: response.content
        };
    });
});
