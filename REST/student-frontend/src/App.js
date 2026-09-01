import { useEffect, useState } from "react";

function App() {
  const [students, setStudents] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/students")
      .then((response) => response.json())
      .then((data) => {
        setStudents(data);
      })
      .catch((error) => {
        console.error("Error fetching students:", error);
      });
  }, []);

  return (
    <div>
      <h1>Student Management System</h1>

      <table border="1" cellPadding="10">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Course</th>
            <th>Marks</th>
          </tr>
        </thead>

        <tbody>
          {students.map((student) => (
            <tr key={student.id}>
              <td>{student.id}</td>
              <td>{student.name}</td>
              <td>{student.course}</td>
              <td>{student.marks}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;