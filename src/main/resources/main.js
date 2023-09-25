window.addEventListener("DOMContentLoaded", function(e){
	showDivs(slideIndex);
});
var slideIndex = 1;

function plusDivs(n){
	showDivs(slideIndex += n);
}

function showDivs(n){
	var x = document.getElementsByClassName("slider-img");
	if( n > x.length ) {
		slideIndex = 1;
	}
	if( n<1 ){
		slideIndex = x.length;
	}
	
	for(var i=0; i<x.length; i++){
		x[i].style.display = "none";
	}
	x[slideIndex-1].style.display="block";
	
}