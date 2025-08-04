import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [view, setView] = useState("book");

  let component;

  // Method 1: Using if-else
  if (view === "book") {
    component = <BookDetails />;
  } else if (view === "blog") {
    component = <BlogDetails />;
  } else {
    component = <CourseDetails />;
  }

  return (
    <div className="App" style={{ fontFamily: 'Arial', padding: '20px' }}>
      <h1>Blogger App</h1>

      {/* Method 2: Using buttons and element variables */}
      <button onClick={() => setView("book")}>Show Book</button>
      <button onClick={() => setView("blog")}>Show Blog</button>
      <button onClick={() => setView("course")}>Show Course</button>

      <hr />

      {/* Method 3: Using Ternary Operator */}
      {view === "book" ? <p>Currently Viewing: Book</p> : null}

      {/* Method 4: Using Logical && */}
      {view === "blog" && <p>Currently Viewing: Blog</p>}

      {/* Render selected component */}
      {component}
    </div>
  );
}

export default App;
