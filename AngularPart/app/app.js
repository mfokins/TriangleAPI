'use strict';

// Declare app level module which depends on views, and core components
angular.module('myApp', [
  'ngRoute',
  // 'myApp.view1', //just in case if will be needed
  'myApp.version'
]).
config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider) {
  $locationProvider.hashPrefix('!');

  $routeProvider.otherwise({redirectTo: '/index'});
}]);
