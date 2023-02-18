define(function(){

	var externals = {};

	externals.show = function(data){
		var htmlStr = ''
		$('.container').empty();
		data.forEach(function(elem){
			htmlStr += '<p>' + elem + '</p>';
		});

		$('.container').append(htmlStr);
	}


	return externals;
})