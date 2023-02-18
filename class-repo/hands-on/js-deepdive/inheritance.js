function Animal(familyName, className){
	this.familyName = familyName;
	this.class = className;
}

Animal.prototype.sleep = function(){
	console.log('zzzzzZZZZzzzz');
}

// constructor function
function Bear(diet, colour){
	Animal.call(this, 'bear', 'mammal');

	this.diet = diet;
	this.colour = colour;
}
Bear.prototype = Object.create(Animal.prototype);

Bear.prototype.hibernate = function(){
	console.log('ganda soneca que eu dormi')
}

// __proto__: Bear.prototype
var grizzly = new Bear('omnivore', 'brown');
var polar = new Bear('hypercarnivore', 'white');
var panda = new Bear('folivore', 'black and white');
