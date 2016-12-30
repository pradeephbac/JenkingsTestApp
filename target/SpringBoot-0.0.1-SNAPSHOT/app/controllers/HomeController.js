var injectParams = [ '$rootScope', '$scope', '$http' ];
var HomeController = function($rootScope, $scope, $http) {

};
HomeController.$inject = injectParams;
angular.module('controllersModule').controller('HomeController', HomeController);