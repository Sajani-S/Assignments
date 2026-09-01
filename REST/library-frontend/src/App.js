import React, { useEffect, useState } from "react";

function App() {

  const [books, setBooks] = useState([]);

  useEffect(() => {

    fetch("http://localhost:8080/get")
      .then((response) => response.json())
      .then((data) => setBooks(data));

  }, []);

  return (
    <div style={{ padding: "20px" }}>

      <h1>Library Management System</h1>

      <table border="1" cellPadding="10">

        <thead>
          <tr>
            <th>Book ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Category</th>
          </tr>
        </thead>

        <tbody>

          {books.map((book) => (
            <tr key={book.bookId}>
              <td>{book.bookId}</td>
              <td>{book.title}</td>
              <td>{book.author}</td>
              <td>{book.category}</td>
            </tr>
          ))}

        </tbody>

      </table>

    </div>
  );
}

export default App;