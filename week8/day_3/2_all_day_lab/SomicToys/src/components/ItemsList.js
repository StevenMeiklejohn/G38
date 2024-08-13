import React from 'react';
import Item from './Item';


const ItemsList = ({stockList, addToBasket}) => {

  const nodeElements = stockList.map((toy, index) => {
    return <Item key={index} toy={toy} addToBasket={addToBasket}/>
  })

  return(
    <div className="list-items">

      {nodeElements}

    </div>
  )


};

export default ItemsList;
