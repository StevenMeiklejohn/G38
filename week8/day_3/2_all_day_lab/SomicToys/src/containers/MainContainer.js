import React, { useState } from 'react';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Header from '../components/Header';
import ItemsList from '../components/ItemsList';
import stock from '../data/ShopItems';
import Basket from '../components/Basket'

const MainContainer = () => {

  const [stockList, setStockList] = useState(stock)
  const [basket, setBasket] = useState([])

  const addToBasket = (itemToAdd) => {
    const updatedBasket = [...basket, itemToAdd]
    setBasket(updatedBasket)
  }

  const removeFromBasket = (itemToremove) => {
    const editedArray = []
    for(let toy of basket){
      if(toy.name != itemToremove.name){
        editedArray.push(toy)
      }
    }
    setBasket(editedArray)
  }

  return (
    <Router>
      <Header/>
      <Routes>
        <Route path="/" element={<h1>Welcome to Somic Toys. Absolutely No Refunds.</h1>}/>
        <Route path="/toys" element={<ItemsList stockList={stockList} addToBasket={addToBasket}/>}/>
        <Route path="/basket" element={<Basket basket={basket} removeFromBasket={removeFromBasket}/>}/>
        <Route path="*" element={<h1>You messed up, not me</h1>}/>
      </Routes>

    </Router>

    );
    
};

export default MainContainer;