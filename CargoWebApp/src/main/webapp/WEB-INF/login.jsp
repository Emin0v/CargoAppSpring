<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cargo</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/jquery-2.1.0.min.js"></script>

    <script src="js/login.js"></script>
    <script src="js/message.js"></script>

    <link rel="stylesheet" href="css/login.css">

</head>
<body style="background-image: url('images/cargopic.jpg') !important;">

<div id="message"></div>
<form action="login" method="post">
    <div id="formWrapper">

        <div id="form">
            <div class="logo">
                <h3 class="text-center head">Cargo</h3>
            </div>
            <div class="form-item">
                <p class="formLabel">Email</p>
                <input type="email" name="username" id="email" class="form-style" autocomplete="off"/>
            </div>
            <div class="form-item">
                <p class="formLabel">Password</p>
                <input type="password" name="password" id="password" class="form-style"/>
                <!-- <div class="pw-view"><i class="fa fa-eye"></i></div> -->
                <%--            <p><a href="#"><small>Forgot Password ?</small></a></p>--%>
            </div>
            <div class="form-item">
                <p class="pull-left"><a href="register"><small>Qeydiyyatdan keç</small></a></p>
                <input type="submit" class="login pull-right" name="login" value="Daxil ol">
                <div class="clear-fix"></div>
            </div>
        </div>
    </div>
</form>
<%
    if (request.getAttribute("message")!=null) {
%>
<script>
    displayMessage("success" , "Qeydiyyatdan keçdiniz!.Zəhmət olmasa giriş edin.");
</script>

<%
    }
%>
</body>
</html>
