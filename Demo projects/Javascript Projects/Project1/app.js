document.addEventListener('DOMContentLoaded', ()=>{

    //card opirons
    const cardArray=[
        {
            name: 'fries',
            img: 'images/fries.png'
        },
        {
            name: 'fries',
            img: 'images/fries.png'
        },
        {
            name: 'cheeseburger',
            img: 'images/cheeseburger.png'
        },
        {
            name: 'cheeseburger',
            img: 'images/cheeseburger.png'
        },
        {
            name: 'hotdog',
            img: 'images/hotdog.png'
        },
        {
            name: 'hotdog',
            img: 'images/hotdog.png'
        },
        {
            name: 'ice-cream',
            img: 'images/ice-cream.png'
        },
        {
            name: 'ice-cream',
            img: 'images/ice-cream.png'
        },
        {
            name: 'pizza',
            img: 'images/pizza.png'
        },
        {
            name: 'pizza',
            img: 'images/pizza.png'
        },
        {
            name: 'milkshake',
            img: 'images/pizza.png'
        },
        {
            name: 'milkshake',
            img: 'images/pizza.png'
        }
    ]
    const grid=document.querySelector(".grid")

    //board
    function createBoard(){
        for(let i=0; i<cardArray.length.length; i++)
        {
            var card=document.createElement('img')
            card.setAttribute('src', 'images/blank.png')
            card.setAttribute('date-id', i)
            //card.addEventListener('click', flipcard)
            grid.appendChild(card)
        }
    }
})