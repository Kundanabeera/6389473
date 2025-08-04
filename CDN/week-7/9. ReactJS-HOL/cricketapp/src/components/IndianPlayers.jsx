import React from "react";

const IndianPlayers = () => {
  const teamPlayers = ["Kohli", "Rohit", "Dhoni", "Jadeja", "Yuvraj", "Sehwag"];

  // Destructure odd and even players
  const oddPlayers = teamPlayers.filter((_, index) => index % 2 === 0);
  const evenPlayers = teamPlayers.filter((_, index) => index % 2 !== 0);

  // Merge T20 and Ranji players using spread operator
  const T20players = ["Raina", "Pant", "Hardik"];
  const RanjiPlayers = ["Pujara", "Rahane"];
  const allPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {oddPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {evenPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>All Players (T20 + Ranji)</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
