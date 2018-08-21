<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
    
    <style>
    * {box-sizing: border-box}

/* Full-width input fields */
  input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 20%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
    width: 100%;
  }
}
    
    </style>
<form action="addEmployee"  style="border:1px solid #ccc" >
  <div class="container">
    <h1>Sign In</h1>
   
    <hr>

    <label for="email" hidden=""><b>EmpId</b></label>
    <input type="hidden"  Username" name="empid" ><br>
    
    <label for="psw"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="empname" required><br>
    
 <label for="email"><b>Email Id</b></label>
    <input type="text" placeholder="Enter Email" Username" name="email" required><br>
    
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required><br>

  <label for="psw"><b>Date Of Birth</b></label>
    <input type="date"  name="dob" required><br>

<label for="psw"><b>Address</b></label>
    <input type="text" placeholder="Enter Address" name="address" required><br>

    
    <div class="clearfix">
   
      <button type="submit" class="signupbtn">Register</button>
    </div>
   
  </div>
  <h2>Result:${result}</h2>
</form>
