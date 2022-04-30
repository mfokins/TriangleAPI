'use strict';
var url = 'http://localhost:8080/triangle';

angular.module('myApp', [])
    .controller('MyCtrl', ['$scope', '$http', function ($scope, $http) {

        $scope.search = function () {
            $http({
                url: url,
                method: 'GET',
                params: {x: $scope.x, y: $scope.y, z: $scope.z},
            }).success(function (response) {
                $scope.triangleResult = {
                    content: response.content
                };
            });
        };
    }]);

