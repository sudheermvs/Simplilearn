<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
        <body bgcolor="yellow">
    
	<form action="LoginServlet" method="post">
        <center> 
        	<h1> SHOPPING CART FOR BOOK STORE </h1> 
			<h2> Welcome to LandMark Book Shop </h2> 
		 	<h2> PUNE </h2> 
			<h3> This site allows you to purchase book online. All you have to do is simply register yourself, buy a book that will be delivered to your home   </h3> 
		 	<h2> GET READY TO SHOP!!! </h2> 
		 </center>
            <center>
                <table border="1" width="30%" cellpadding="5" bgcolor="yellow" style="color:black">
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Yet Not Registered!! <a href="Registration.jsp">Register Here</a></td>
                    </tr>
                    <tr>
                        <td colspan="2"><a href="reg.jsp">Forgot Password?</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>