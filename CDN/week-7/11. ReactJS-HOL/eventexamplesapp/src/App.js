import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);
  const [message, setMessage] = useState('');

  const increment = () => {
    setCount(prev => prev + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    console.log("Hello! Have a nice day.");
    setMessage("Hello! Have a nice day.");
  };

  const sayWelcome = (msg) => {
    setMessage(msg);
  };

  const handleClick = (e) => {
    console.log("I was clicked");
    setMessage("I was clicked");
  };

  return (
    <div className="App" style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h1>React Event Examples</h1>

      <h2>Counter: {count}</h2>
      <button onClick={increment}>Increment</button>{' '}
      <button onClick={decrement}>Decrement</button>

      <h2>Message Area:</h2>
      <p>{message}</p>

      <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>{' '}
      <button onClick={handleClick}>Synthetic Event - OnPress</button>

      <hr />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
