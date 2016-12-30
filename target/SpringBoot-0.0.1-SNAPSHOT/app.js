(function() {
var controllersModule = angular.module("controllersModule", []);
var app = angular.module("myApp", [ "ngRoute","controllersModule" ]);

app.config([ '$routeProvider',
    function($routeProvider) {
	$routeProvider

	$routeProvider.when("/", {
		templateUrl : "./appResources/pages/main.html",
		controller: 'demoController'
	}).when("/home", {
		templateUrl : "./appResources/pages/home.html",
		controller: 'HomeController'
	}).when("/about", {
		templateUrl : "./appResources/pages/about.html",
		controller: 'AboutController'
	}).otherwise({
		redirectTo : '/'
	});

    } ]);

}());




