<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Place Order</title>
</head>
<body>
<form action="${pagecontext.request.contextpath}/Validate"  method="get">
  <table>
    <tr>
      <td align="right">Number to purchase:</td>
      <td><input type="text" name="quantity" ></td>
    </tr><tr>
      <td align="right">Your name:</td>
      <td> <input type="text" name="customerName"></td>
    </tr><tr>
      <td align="right">Your email:</td>
      <td> <input type="text" name="customerEmail"></td>
    </tr><tr>
      <td></td>
      <td><input type="submit" value="Place Order"></td>
    </tr>
  </table>
  </form>
 <form action = "reciept.jsp" method= "get">
  <table >
  	<tr>
  		<th> Processor</th>
  		<th> Accessories</th>
  	</tr>
  	<tr> 
  		<td> <input type ="radio" name= "processor" value="Celeron D"> Celeron D<BR>
  			 <input type ="radio" name= "processor" value="Pentium IV"> Pentium IV<BR>
  			 <input type ="radio" name= "processor" value="Celeron D"> Pentium D<BR>
  		</td>
  		<td> <input type= "checkbox" name ="monitor">Monitor <br>
  		     <select name= "peripherals" size ="3" 
  		     										MULTIPLE>
  		     	<option value= "Camera">Camera
  		     	<option value= "Printer">Printer
  		     	<option value="Scanner" > Scanner
  		     </select>
  		</td>
  	</tr>
  	<tr> 
  	<td> <input type="submit" value="Purchase"> </td>
  	</tr>
  </table>
</form>
  
  


</body>
</html>