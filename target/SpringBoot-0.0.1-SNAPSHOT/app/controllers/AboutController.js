var injectParams = [ '$rootScope', '$scope', '$http' ];
var AboutController = function($rootScope, $scope, $http) {

};
AboutController.$inject = injectParams;
angular.module('controllersModule').controller('AboutController', AboutController);