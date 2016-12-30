var injectParams = [ '$rootScope', '$scope', '$http' ];
var demoController = function($rootScope, $scope, $http) {

	// scope variable assignment using $scope
	$scope.welcome = "Welcome All to Angular World!";
	$scope.country = "Sri Lanka";
	$scope.city = "colombo";
	$scope.name = "Enter Here";

	// angularJS click function
	$scope.getMyName = function(name) {

		var url = "http://localhost:8080/SpringBoot/myname/" + name;

		//AJAX call from angulaJS $http protocol
		$http.get(url).then(function(response) {
			var usersName=response.data.name;
			$scope.server_respond = usersName;

		});
	}
};
demoController.$inject = injectParams;
angular.module('controllersModule')
		.controller('demoController', demoController);