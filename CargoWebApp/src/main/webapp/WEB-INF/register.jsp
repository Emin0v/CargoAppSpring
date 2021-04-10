<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <%--    <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">--%>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-2.1.3.min.js"></script>

    <script src="js/register.js"></script>
    <link rel="stylesheet" href="css/register.css">

</head>
<body style="background-image: url('./images/cargo.jpg')">
<div id ="message">

</div>
<div class="container">
    <f:form action="register" method="post" class="form-horizontal" role="form" modelAttribute="register">
        <h2 class="continer" style="text-align: -webkit-center;text-align: center">Qeydiyyat</h2>
        <div class="form-group">
            <label for="customerName" class="col-sm-3 control-label">Ad</label>
            <div class="col-sm-6">
                <f:input path="customerName" id="customerName" placeholder="ad" class="form-control" autofocus=""/>
                <f:errors path="customerName" cssClass="error"/>
            </div>
        </div>
        <div class="form-group">
            <label for="customerSurname" class="col-sm-3 control-label">Soyad</label>
            <div class="col-sm-6">
                <f:input path="customerSurname" id="customerSurname" placeholder="soyad" class="form-control" autofocus=""/>
                <f:errors path="customerSurname" cssClass="error"/>
            </div>
        </div>
        <div class="form-group">
            <label for="country" class="col-sm-3 control-label">Ölkə</label>
            <div class="col-sm-6">
                <f:input path="country" type="text" id="country" placeholder="Ölkə" class="form-control" name="country"/>
                <f:errors path="country" cssClass="error"/>
            </div>
        </div>
        <div class="form-group">
            <label for="city" class="col-sm-3 control-label">Şəhər</label>
            <div class="col-sm-6">
                <f:input path="city" type="text" id="city" placeholder="Şəhər" class="form-control" name="city"/>
                <f:errors path="city" cssClass="error"/>
            </div>
        </div>
        <div class="form-group">
            <label for="address" class="col-sm-3 control-label">Ünvan</label>
            <div class="col-sm-6">
                <f:input path="address" type="text" id="address" placeholder="Ünvan" class="form-control" name="address"/>
                <f:errors path="address" cssClass="error"/>
            </div>
        </div>
        <div class="form-group">
            <label for="postalCode" class="col-sm-3 control-label">Poçt kodu</label>
            <div class="col-sm-6">
                <f:input path="postalCode" type="text" id="postalCode" placeholder="Poçt kodu" class="form-control" name="postalCode"/>
                <f:errors path="postalCode" cssClass="error"/>
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="col-sm-3 control-label">Email</label>
            <div class="col-sm-6">
                <f:input path="email" type="email" id="email" placeholder="Email" class="form-control" name="email"/>
                <f:errors path="email" cssClass="error"/>
            </div>
        </div>
        <div class="form-group">
            <label for="phone" class="col-sm-3 control-label">Telefon</label>
            <div class="col-sm-6">
                <f:input path="phone" type="phone" id="phone" placeholder="+994505550055" class="form-control" name="phone"/>
                <f:errors path="phone" cssClass="error"/>
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-3 control-label">Password</label>
            <div class="col-sm-6">
                <f:input path="password" type="password" id="password" placeholder="Password" class="form-control"/>
                <f:errors path="password" cssClass="error"/>
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-4 control-label">Confirm Password</label>
            <div class="col-sm-6">
                <f:input path="confirmPassword" type="password" id="password" placeholder="Password"
                         class="form-control"/>
                <f:errors path="confirmPassword" cssClass="error"/>
            </div>
        </div>

<%--        <div class="form-group">--%>
<%--            <div class="col-sm-9 col-sm-offset-3">--%>
<%--                <span style="color: red"><%=request.getAttribute("message")==null?"":request.getAttribute("message")%></span>--%>
<%--            </div>--%>
<%--        </div>--%>
        <button type="submit" id ="confirm" class="btn btn-primary btn-block">Təsdiq</button>
        <p class="pull-left" style="font-size: 20px;"><a href="login"><small>Geri</small></a></p>
    </f:form> <!-- /form -->
</div> <!-- ./container -->
</body>
</html>
