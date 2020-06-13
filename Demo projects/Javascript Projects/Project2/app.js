const square=document.querySelectorAll('.square')
const mole=document.querySelectorAll('.mole')
const score=document.querySelector('#score')
const timeleft=document.querySelector('#time-left')

let result=0
let currTime=timeleft.textContent

function randomole()
{
    square.forEach(className =>{
        className.classList.remove('mole')
    })
    let randpos=square[Math.floor(Math.random()*9)]
    //console.log(square)
    //let randpos=square[2]
    randpos.classList.add('mole')
    hitposition=randpos.id
}
  
square.forEach(id=>{
    id.addEventListener('mouseup', ()=>{
        if(id.id===hitposition)
        result=result+1
        score.textContent=result
    })
})
function movemole(){
    let timerId=null
    timerId=setInterval(randomole, 500)
}

movemole()

function countdoen(){
    currTime--
    timeleft.textContent=currTime
    if(currTime===0)
    {
        alert('Game Over!'+ result)
        clearInterval(x)
        location.reload()
    }
}
let x=setInterval(countdoen, 1000)