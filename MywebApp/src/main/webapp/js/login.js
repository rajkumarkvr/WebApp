function login(){
	
	let username = "Rajkumar";
	let password = "raj@123";
	let url = "http://localhost:8080/MywebApp/Login?username="+username+"&password="+password;
	let xhr =new XMLHttpRequest();
	
	
	xhr.onreadystatechange=function(){
		if(xhr.readyState==4&&xhr.status==200){
			console.log(xhr.responseText);
		}
	}
	xhr.open("POST",url);
	
	xhr.send();
		
}

function loginJSON(){
	let user = {
		username:"Rajkumar",
		password:"3047125"
	}
	
	let url = "http://localhost:8080/MyWebApp/LoginJ";
	
	let xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4&&xhr.status==200){
			console.log(xhr.responseText);
		}
	}
	
	xhr.open("POST",url);

	xhr.setRequestHeader('Content-type','application/json');
	xhr.send(JSON.stringify(user));
	
}


function addStudent(){
	
	let username = "Rajkumar";
	
	let url = "http://localhost:8080/MywebApp/Login?username="+username
	let xhr =new XMLHttpRequest();
	
	
	xhr.onreadystatechange=function(){
		if(xhr.readyState==4&&xhr.status==200){
			console.log(xhr.responseText);
		}
	}
	xhr.open("POST",url);
	
	xhr.send();
		
}