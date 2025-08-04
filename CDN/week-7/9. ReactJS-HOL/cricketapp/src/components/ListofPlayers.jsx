import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 92 },
    { name: "Rohit", score: 85 },
    { name: "Dhoni", score: 75 },
    { name: "Sachin", score: 99 },
    { name: "Sehwag", score: 68 },
    { name: "Yuvraj", score: 55 },
    { name: "Dravid", score: 73 },
    { name: "Kohli", score: 80 },
    { name: "Jadeja", score: 40 },
    { name: "Ashwin", score: 77 },
    { name: "Bumrah", score: 64 }
  ];

  // Players with scores below 70 using arrow function
  const filteredPlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h3>Players with score below 70</h3>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
