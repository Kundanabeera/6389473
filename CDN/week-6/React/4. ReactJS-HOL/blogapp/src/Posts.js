import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((response) => {
        if (!response.ok) throw new Error("Network response was not ok");
        return response.json();
      })
      .then((data) => {
        this.setState({ posts: data });
      })
      .catch((error) => {
        this.setState({ error: error.message });
        console.error("Error fetching posts:", error);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("An error occurred: " + error);
    console.error("Error caught in componentDidCatch:", error, info);
  }

  render() {
    const { posts, error } = this.state;
    return (
      <div>
        <h2>Blog Posts</h2>
        {error && <p style={{ color: 'red' }}>{error}</p>}
        {posts.map((post) => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
