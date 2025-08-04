import React from 'react';
import './App.css';

function App() {
  const heading = <h1 style={{ textAlign: 'center' }}>Office Space Rental</h1>;

  const officeImageUrl = "https://via.placeholder.com/600x300?text=Office+Space";

  const office = {
    name: "Innovative Workspaces",
    rent: 55000,
    address: "101 Tech Park, Bengaluru"
  };

  const officeList = [
    { name: "WorkNest", rent: 45000, address: "12A, MG Road, Bengaluru" },
    { name: "SpaceHub", rent: 65000, address: "77 Residency Road, Bengaluru" },
    { name: "HiveWork", rent: 60000, address: "HSR Layout, Bengaluru" }
  ];

  return (
    <div className="App">
      {heading}

      <img src={officeImageUrl} alt="Office" style={{ width: '100%', height: 'auto' }} />

      <h2>Main Office</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p>
        <strong>Rent:</strong>{" "}
        <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>{office.rent}</span>
      </p>
      <p><strong>Address:</strong> {office.address}</p>

      <h2>Other Offices</h2>
      {officeList.map((item, index) => (
        <div key={index} style={{ borderBottom: '1px solid #ccc', marginBottom: '10px' }}>
          <p><strong>Name:</strong> {item.name}</p>
          <p>
            <strong>Rent:</strong>{" "}
            <span style={{ color: item.rent < 60000 ? 'red' : 'green' }}>{item.rent}</span>
          </p>
          <p><strong>Address:</strong> {item.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
