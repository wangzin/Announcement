$(function(){
	//active menu problem
	switch(menu)
	{
		case 'About Us' :
			$('#about').addClass('active');
			break;
		case 'Vacancy' :
			$('#vacancy').addClass('active');
			break;
		case 'Contact Us' :
			$('#contact').addClass('active');
			break;
		default:
			$('#home').addClass('active');
		break;	
	}
});