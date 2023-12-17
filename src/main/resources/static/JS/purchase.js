
const button = document.getElementById('button')

button.addEventListener('click',()=>{
	
	console.log('Okay')
	
	fetch('/api/purchase',{
		method:'POST',
		body:{
			
		}
	})
	
})