<!DOCTYPE html>

<html>

    <head>

        <title>Registration</title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="viewport" content="width=device-width">

    </head>

    <body bgcolor="yellow">

		<form action="RegisterServlet" method="post">

            <center>

                <h1>CUSTOMER CART FOR BOOK STORE</h1>
                <br>
                <h2>CUSTOMER REGISTRATION FORM</h2>

                <table border="1" width="30%" cellpadding="5" bgcolor="yellow" style="color:black">
 					<tr>
                        <th colspan="2">Enter Information Here</th>
                    </tr>
                    <tr>

                        <td>

                            <b>Full Name:</b>

                        </td>

                        <td>

                            <input type="text"  name="fname" required>
							<span>* </span>
                        </td>

                    </tr>
                    <tr>

                        <td>

                            <b>Address:</b>

                        </td>

                        <td>

                            <input type="text" name="address" required>
								<span>* </span>
                        </td>

                    </tr>

                    <tr>

                        <td>

                            <b>Email:</b>

                        </td>

                        <td>

                            <input type="email" name="uemail" required>
							<span>* </span>
                        </td>

                    </tr>
                    <tr>

                        <td>

                            <b>User Name:</b>

                        </td>

                        <td>

                            <input type="text" name="name" required>
								<span>* </span>
                        </td>

                    </tr>

                    <tr>

                        <td>

                            <b>Password:</b>

                        </td>

                        <td>

                            <input type="password" name="upass" required>
								<span>* </span>
                        </td>

                    </tr>

                    <tr>

                        <td>

                            <input type="submit" value="SignUp">
                        </td>

                        <td>

                            <input type="reset" value="Reset">

                        </td>

                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="Login.jsp">Login Here</a></td>
                    </tr>
                    <tr>
                     <tr>
                    	<td colspan="2">Fields Mark with * are Mandatory!!</td>
                    	
                    	
                    </tr>

                </table>

        </form>

    </body>

</html>