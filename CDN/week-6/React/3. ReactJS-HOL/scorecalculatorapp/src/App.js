import { CalculateScore } from './Components/CalculateScore'; 

function App() {
  return (
    <div>
      <CalculateScore 
        name="Steeve" 
        school="DNV Public School" 
        total={284} 
        goal={3} 
      />
    </div>
  );
}

export default App;
