function checkLogInDetails{

	var name=document.getElementById('usrn').value;
	var pass=document.getElementById('pssw').value;

	if(name==NULL || name==" "){
		alert('name cannot be left null!!!');
	}else if(pass==NULL || pass==" "){
		alert('password cannot be left empty!!!');
	}else{
		return false;
	}
}


document.getElementByTag('form').addEventListener("submit", checkLogInDetails());