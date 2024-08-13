import React from 'react';
import styled from 'styled-components';
import BasketItem from './BasketItem';


const Basket = ({basket, removeFromBasket}) => {

    const nodeElements = basket.map((toy, index) => {
        return <BasketItem key={index} toy={toy} removeFromBasket={removeFromBasket}/>
      })


    return (
        <ul>
            {nodeElements}
        </ul>

    );
};

export default Basket;
