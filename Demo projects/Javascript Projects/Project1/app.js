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
            img: 'images/milkshake.png'
        },
        {
            name: 'milkshake',
            img: 'images/milkshake.png'
        }
    ]

    //randomize array
    cardArray.sort(rand);

    function rand(){
        return 0.5-Math.random()
    }

    const grid=document.querySelector(".grid")
    totcards=[]
    cardchosen=[]
    cardchosenId=[]
    won=[]
    //board
    function createBoard()
    {
        for(let i=0; i<cardArray.length; i++)
        {
            var card=document.createElement('img')
            card.setAttribute('src', 'images/blank.png')
            card.setAttribute('alt', 'No Image')
            card.setAttribute('width', '100px')
            card.setAttribute('height', '100px')
            card.setAttribute('date-id', i)
            card.addEventListener('click', flipcard)
            grid.appendChild(card)
        }
    }

    //flipcard
    function flipcard()
    {
        var cardId=this.getAttribute('date-id')
        cardchosen.push(cardArray[cardId].name)
        cardchosenId.push(cardId)
        this.setAttribute('src', cardArray[cardId].img)
        
        //when two cards are selected, check for match
        if(cardchosen.length===2)
        {
            setTimeout(checkForMatch, 500)
        }
    }

    function checkForMatch()
    {
        totcards.push(cardchosen[0])
        totcards.push(cardchosen[1])
        if(cardchosen[0]===cardchosen[1])
        {
            won.push(cardchosen[0])
            won.push(cardchosen[1])
            if(won.length===cardArray.length)
            {
                alert("You Have Won!!")
                location.reload()
            }            
            else
            alert("Good One!")            
        }
        else{
            alert("Sorry")
        }

        //white background for the card selected
        var card=document.querySelectorAll('img')

        card[cardchosenId[0]].setAttribute('src', 'images/white.png')
        card[cardchosenId[0]].setAttribute('width', '100px')
        card[cardchosenId[0]].setAttribute('height', '100px')

        card[cardchosenId[1]].setAttribute('src', 'images/white.png')
        card[cardchosenId[1]].setAttribute('width', '100px')
        card[cardchosenId[1]].setAttribute('height', '100px')

        if(totcards.length===cardArray.length)
        location.reload()

        cardchosen=[]
        cardchosenId=[]
    }
    
    createBoard()
})