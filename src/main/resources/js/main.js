window.onload = function(){
	showDivs(slideIndex);
	var sliderImageEl = document.getElementsByClassName("slider-img");
	var btnsEl = document.getElementById("btns");
	let bannerIH = sliderImageEl[slideIndex-1].height+'px';
	let bannerIW = sliderImageEl[slideIndex-1].width+'px';
	let selH = document.getElementById("sel_btns");
	
	btnsEl.style.height = bannerIH;
	btnsEl.style.width = bannerIW;
	selH.style.paddingTop = (sliderImageEl[slideIndex-1].height)*90/100+"px";
	
	window.addEventListener("resize", function(e){
		bannerIH = sliderImageEl[slideIndex-1].height+'px';
		btnsEl.style.height = bannerIH;
		bannerIW = sliderImageEl[slideIndex-1].width+'px';
		btnsEl.style.width = bannerIW;
		selH.style.paddingTop = (sliderImageEl[slideIndex-1].height)*90/100+"px";
	});
};
/*
window.addEventListener("DOMContentLoaded", function(e){
	
	
	
	
});
*/


var slideIndex = 1;

var sliderImageEl = document.getElementsByClassName("slider-img");

function plusDivs(n){
	showDivs(slideIndex += n);
}

function showDivs(n){
	var btnsEl = document.getElementById("btns");
	
	
	if( n > sliderImageEl.length ) {
		slideIndex = 1;
	}
	if( n<1 ){
		slideIndex = sliderImageEl.length;
	}
	
	for(var i=0; i<sliderImageEl.length; i++){
		sliderImageEl[i].style.display = "none";
	}
	sliderImageEl[slideIndex-1].style.display="block";
	var bannerIH = sliderImageEl[slideIndex-1].height+'px';
	var bannerIW = sliderImageEl[slideIndex-1].width+'px';
	var selH = document.getElementById("sel_btns");
	
	btnsEl.style.height = bannerIH;
	btnsEl.style.width = bannerIW;
	selH.style.paddingTop = (sliderImageEl[slideIndex-1].height)*90/100+"px";
	
}