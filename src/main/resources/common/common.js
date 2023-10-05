window.addEventListener("DOMContentLoaded", function(){
	const topNavEl = document.getElementsByClassName('search_nav_li');
	
	
	for(var i= 0; i<topNavEl.length; i++){
		if(i%2 == 0 ){
			topNavEl[i].style.backgroundColor="lightgray";
		}else{
			topNavEl[i].style.backgroundColor="darkgray";
		}
	}
		
});





