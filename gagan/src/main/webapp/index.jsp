<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
	
		<nav class="navbar navbar-expand-lg navbar-light bg-dark">
			<div class="container-fluid">
				<nav class="navbar navbar-light bg-light">
					<div class="container">
						<a class="navbar-brand" href="#"> <img
							src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
							alt="" width="88" height="48">
						</a>
					</div>
					
				</nav>

		</nav>
		
<form action="email" method="get"><br>
<h3>Display email : ${email}</h3>
<input type="submit" value=" show email">
</form>

<form action="mobile" method="get"><br>
<h3>Display mobile : ${num}</h3>
<input type="submit" value=" show number">
</form><br>
<form action="aadhar" method="get"><br>
<h3>Display aadhar : ${aadhar}</h3>
<input type="submit" value=" show aadhar">
</form><br>
<form action="age" method="get"><br>
<h3>Display age : ${age}</h3>
<input type="submit" value=" show age">
</form>

<br>
<form action="dob" method="get"><br>
<h3>Display dob : ${dob}</h3>
<input type="submit" value=" show dob">
</form>

<br>
<form action="sal" method="get"><br>
<h3>Display sal : ${sal}</h3>
<input type="submit" value=" show sal">
</form>

<br>
<form action="best" method="get"><br>
<h3>Display Bfriends : </h3>
<input type="submit" value=" show friends">
<ul>
<c:forEach items="${bestf}" var="fri">
<li>${fri}</li>
</c:forEach>
</ul>

</form>
<br>
<form action="place" method="get"><br>
<h3>Display places : </h3>
<input type="submit" value=" show places">
<ul>
<c:forEach items="${pl}" var="pl">
<li>${pl}</li>
</c:forEach>
</ul>

</form>

<br>
<form action="skill" method="get"><br>
<h3>Display skills : </h3>
<input type="submit" value=" show skills">
<ul>
<c:forEach items="${skills}" var="sk">
<li>${sk}</li>
</c:forEach>
</ul>

</form>
<br>
<form action="edu" method="get"><br>
<h3>Display education details : </h3>
<input type="submit" value=" show education">
<h3>
name : ${edu.getName()}<br>
age : ${edu.age}<br>
college : ${edu.college}<br>
degree : ${edu.degree}<br>
loc : ${edu.loc}<br>
dob : ${edu.dob}<br>
fee : ${edu.fee}<br>
Fname : ${edu.getFName()}<br>

</h3>
</form>

<br>
<form action="fam" method="get"><br>
<h3>Display family details : </h3>
<input type="submit" value=" show family">
<h3>
fam name : ${fam.getFamname()}<br>
father : ${fam.father}<br>
mother : ${fam.mother}<br>
loc : ${fam.loc}<br>
income : ${fam.income}<br>
head : ${fam.head}<br>
job : ${fam.job}<br>
grandpa :${fam.grandpa}

</h3>
</form>

<br>
<form action="mob" method="get"><br>
<h3>Display mobile details : </h3>
<input type="submit" value=" show mob details">
<h3>
name : ${mobi.getMname()}<br>
brand : ${mobi.mbrand}<br>
country : ${mobi.country}<br>
storage : ${mobi.storage}<br>
ram : ${mobi.ram}<br>


</h3>
</form>

<br>
<form action="bev" method="get"><br>
<h3>Display beverage details : </h3>
<input type="submit" value=" show beverage">
<h3>
beverage name : ${bev.name}<br>
price : ${bev.price}<br>
manufactured : ${bev.mfg}<br>
advertise : ${bev.add}<br>
add Hero : ${bev.addHero}<br>
made in : ${bev.madeIn}<br>
color : ${bev.color}<br>
flavour :${bev.flavour}

</h3>
</form>

<br>
<form action="chat" method="get"><br>
<h3>Display chats details : </h3>
<input type="submit" value=" show chat">
<h3>
chat name : ${chat.name}<br>
chat price : ${chat.price}<br>
color : ${chat.color}<br>
flavour : ${chat.flavour}<br>
location : ${chat.location}<br>
made by : ${chat.madeBy}<br>
started in : ${chat.startedIn}<br>
crowd :${chat.crowd}<br>
type :${chat.types}<br>
time :${chat.time}<br>
spicy :${chat.spicy}<br>


</h3>
</form>
</body>
</html>