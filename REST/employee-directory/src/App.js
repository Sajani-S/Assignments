import React, { useEffect, useState } from "react";

function App() {

  const [employees, setEmployees] = useState([]);

  useEffect(() => {

    fetch("http://localhost:8080/get")
      .then((response) => response.json())
      .then((data) => setEmployees(data));

  }, []);

  return (
    <div style={{ padding: "20px" }}>

      <h1>Employee Directory</h1>

      <table border="1" cellPadding="10">

        <thead>
          <tr>
            <th>Employee ID</th>
            <th>Employee Name</th>
            <th>Department</th>
            <th>Salary</th>
          </tr>
        </thead>

        <tbody>

          {employees.map((emp) => (
            <tr key={emp.empId}>
              <td>{emp.empId}</td>
              <td>{emp.empName}</td>
              <td>{emp.department}</td>
              <td>{emp.salary}</td>
            </tr>
          ))}

        </tbody>

      </table>

    </div>
  );
}

export default App;