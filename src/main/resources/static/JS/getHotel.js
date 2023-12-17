const search = document.getElementById('search') 
const button = document.getElementById('button')


button.addEventListener("click",()=>{
	
	document.querySelectorAll('.trip .div-title a').forEach( element =>{
		if(element.innerHTML.toLowerCase().includes(search.value.toLowerCase() )){
			element.closest('.trip').style.display = 'flex'
		} else {
			element.closest('.trip').style.display = 'none'

		}
		
	})
	
})

