const form = document.querySelector('form')
const div = document.querySelectorAll('form li div')


const input = document.createElement('input')

input.setAttribute('type', 'checkbox')
input.innerText = 'x'

div[1].appendChild(input)

function hello(e){
    e.defaultPrevented
    const text = e.srcElement.form.childNodes[1].childNodes[1].innerText
    const input1 = document.getElementById('checkboxLabel1')
    input1.setAttribute('value' ,`${text}`)
}
input.addEventListener('click', hello)
    // .appendChild('input')


// th:object="${checkboxInfo}