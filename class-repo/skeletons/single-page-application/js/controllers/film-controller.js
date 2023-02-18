define(['../services/film-service', '../views/film-view'], function(filmservice, filmView){

	var externals = {};

	externals.init = function(){
		filmView.show(filmservice.getList());
	}

	return externals;
})