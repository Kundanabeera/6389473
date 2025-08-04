import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState(null);

  const handleSubmit = () => {
    const value = parseFloat(rupees);
    if (!isNaN(value)) {
      const euroValue = value / 90; // Approx conversion rate
      setEuro(euroValue.toFixed(2));
    }
  };

  return (
    <div>
      <h2>Currency Convertor (INR to Euro)</h2>
      <input
        type="number"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
        placeholder="Enter amount in INR"
      />
      <button onClick={handleSubmit}>Convert</button>

      {euro !== null && (
        <p>{rupees} INR = {euro} EUR</p>
      )}
    </div>
  );
}

export default CurrencyConvertor;
