<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remito</title>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
  <!-- <center><h2>Generar un nuevo remito</h2></center> -->
	<table class="table">
    <thead>
		<th><center><div  id="cd-logo"><img src="http://hetalia.kitawiki.net/images/thumb/f/f2/PDmaybe-icon.svg/64px-PDmaybe-icon.svg.png" alt="Logo"></div></center></th>
      
      <style>
      	#cd-logo img {
						filter: url('#grayscale'); /* Versión SVG para IE10, Chrome 17, FF3.5, Safari 5.2 and Opera 11.6 */
						-webkit-filter: grayscale(100%);
						-moz-filter: grayscale(100%);
						-ms-filter: grayscale(100%);
						-o-filter: grayscale(100%);
						filter: grayscale(100%); /* Para cuando es estándar funcione en todos */
						filter: Gray(); /* IE4-8 and 9 */
						
						-webkit-transition: all 0.5s ease;
						-moz-transition: all 0.5s ease;
						-ms-transition: all 0.5s ease;
						-o-transition: all 0.5s ease;
						transition: all 0.5s ease;
						}
						.grises img:hover { 
						-webkit-filter: grayscale(0%);
						-moz-filter: grayscale(0%);
						-ms-filter: grayscale(0%);
						-o-filter: grayscale(0%);
						filter: none;
						
						-webkit-transition: all 0.5s ease;
						-moz-transition: all 0.5s ease;
						-ms-transition: all 0.5s ease;
						-o-transition: all 0.5s ease;
						transition: all 0.5s ease;
					}
      </style>
      <th>Florencio Varela 2535 - Buenos Aires, Argentina
      <p>Tel: +1 555 123456 - Email: CuentaCorriente@gmail.com</p></th>
      <tr>
        <th>Nº: ${Documento.getNro()}</th>
        
        <%@ page import="java.util.*" %>
		<%@ page import="java.text.SimpleDateFormat"%>
  
		<%
		   Date dNow = new Date();
		   SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");
		   String currentDate = ft.format(dNow);
		%>
 		
 		<th>Fecha: <%=currentDate%></th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><center>Apellido y Nombre: <select class="form-control" name="Persona">
          <c:forEach items="${Listado}" var="Persona" >
            <c:if test="${Persona.estado}">
            <option value="persona">${Persona.apellido}, ${Persona.nombre}</option>
          </c:if>
          </c:forEach>
        </select>
        </center>
        </td>
        <td>Domicilio: </td>
        <td>CUIT: </td>
      </tr>
    </tbody>
  </table>
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Producto</th>
        <th>Cantidad</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>
			<select class="form-control" name="Producto">
          <c:forEach items="${Listado}" var="Producto" >
            <c:if test="${Producto.estado}">
            <option value="producto">${Producto.descrip}</option>
          </c:if>
          </c:forEach>
        </select>
		</td>
        <td><input class="form-control" type="number" min="1" placeholder="Cantidad" /></td>
      </tr>
    </tbody>
  </table>
  </br>
  </br>

  <center><a href="#"><button type="button" class="btn btn-success">Guardar</button></a>
<a href="#"><button type="button" class="btn btn-primary">Descargar .pdf</button></a></center>
</div>
</body>
</html>