//Variaveis 
let email = document.getElementById('email')
let messagem = document.getElementById('messagem')

//Função invocada pelo button
function send(){
	fetch("/api/email",{
		method:'POST',
		headers: {
    		'Content-Type': 'application/json'
  		},
		body:JSON.stringify({
			email:email.value,
			messagem:messagem.value
		})
	})
}



