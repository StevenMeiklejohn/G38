import React from 'react';

const BasketItem = ({toy, removeFromBasket}) => {

  const handleClick = () => {
    removeFromBasket(toy)
  }



  return (
    <li>
      <p>Name:{toy.name}</p>
      <p>Description:{toy.desc}</p>
      <img src={require(`../images/${toy.pic}`)}/>
      <button onClick={handleClick}>removeFromBasket</button>

    </li>
  

  );
};

export default BasketItem;
