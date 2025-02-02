console.log("Script Loaded!");  // ✅ Check if script is loading

function showcourses() {
    console.log("Fetching courses...");  // ✅ Check if function runs

    fetch("http://localhost:8080/course") 
    .then(response => response.json())
    .then(courses => {
        console.log("Received data:", courses);  // ✅ Check if data is received
        const tabledata = document.getElementById("courselist");

        let rows = "";  
        courses.forEach(course => {
            rows += `<tr>
                <td>${course.courseId}</td>
                <td>${course.courseName}</td>
                <td>${course.trainer}</td>
                <td>${course.durationInWeeks}</td>
            </tr>`;
        });

        tabledata.innerHTML = rows;  // ✅ Check if data updates in table
    })
    .catch(error => console.error("Error fetching courses:", error));
}

showcourses();  // ✅ Ensure function runs when page loads



function showstudents() {
    console.log("Fetching student details...");  // ✅ Debugging log

    fetch("http://localhost:8080/course/registry") 
    .then(response => {
        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);
        }
        return response.json();
    })
    .then(students => {
        console.log("Received data:", students);  // ✅ Check if data is received
        const tabledata = document.getElementById("studentlist");

        let rows = "";  
        students.forEach(student => {
            rows += `<tr>
                <td>${student.name}</td>
                <td>${student.emailid}</td>
                <td>${student.courseName}</td>
            </tr>`;
        });

        tabledata.innerHTML = rows;  // ✅ Update table
    })
    .catch(error => console.error("Error fetching students:", error));
}

showstudents();  // ✅ Call function
