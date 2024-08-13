import React from 'react';

const Item = ({toy, addToBasket}) => {

  const handleClick = () => {
    addToBasket(toy)
  }

  return (
    <li>
      <p>Name:{toy.name}</p>
      <p>Description:{toy.desc}</p>
      <img src={require(`../images/${toy.pic}`)}/>
      <button onClick={handleClick}>Add To Basket</button>

    </li>
  

  );
};

export default Item;
