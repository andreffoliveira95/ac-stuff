
define(function(){

	console.log('FILM SERVICE IS LOADED')
	var externals = {}
	var films = ['Princess Mononoke', 'Eternal Sunshine of the Spotless Mind', 'Twelve Angry Men', 'Akira'];
	
	externals.getList = function(){
		return films;
	}
	
	return externals;
	
})