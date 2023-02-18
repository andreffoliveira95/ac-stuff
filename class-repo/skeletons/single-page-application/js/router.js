define(function () {

	var externals = {}
	// this object gets a new property for every new controller we make
	var routes = {
		list: {
			hash: '#list',
			controller: 'film-controller'
		},
		home: {
			hash: '#home',
			controller: 'home-controller'
		}
	}


	// load up the controller file and call the init method
	function initController(route) {
		require(['controllers/' + route.controller], function (controller) {
			controller.init()
		})
	}

	// dynamically find the object associated with the hash in the url
	function getRoute() {
		return Object.values(routes).find(function (route) {
			return route.hash === window.location.hash
		})
	}

	externals.start = function () {

		window.onhashchange = function () {
			try {
				initController(getRoute())
			} catch (err) {
				// default route if no valid route is found!
				window.location.hash = 'list'
			}
		}
	}

	return externals;
})