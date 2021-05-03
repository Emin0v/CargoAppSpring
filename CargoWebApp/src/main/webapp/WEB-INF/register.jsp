<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Qeydiyyat</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <%--    <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">--%>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-2.1.3.min.js"></script>

    <link rel="stylesheet" href="css/register.css">

    <script>
        function check() {
            if (document.getElementById('password').value ==
                document.getElementById('confirm_password').value) {
                document.getElementById('errmessage').style.color = 'green';
                document.getElementById('errmessage').innerHTML = 'uyğun';
            } else {
                document.getElementById('errmessage').style.color = 'red';
                document.getElementById('errmessage').innerHTML = 'uyğun deyil';
            }
        };

    </script>

</head>
<body style="background-repeat: no-repeat;background-image: url('./images/cargo.jpg')">

<%@ include file="header.jsp" %>
<div id="message">

</div>
<div class="container" id="container">
    <f:form action="register" method="post" class="form-horizontal" role="form" modelAttribute="registerForm">
        <h2>Qeydiyyat</h2>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="customerName" class="col-sm-5 control-label">Ad</label>
                <f:input path="customerName" id="customerName" placeholder="..." class="form-control" autofocus=""/>
                <f:errors path="customerName" cssClass="error"/>
            </div>
            <div class="form-group col-md-6">
                <label for="customerSurname" class="col-sm-5 control-label">Soyad</label>
                <f:input path="customerSurname" id="customerSurname" placeholder="..." class="form-control"
                         autofocus=""/>
                <f:errors path="customerSurname" cssClass="error"/>
            </div>

            <div class="form-group col-md-6">
                <label for="country" class="col-sm-5 control-label">Ölkə</label>

                <f:input path="country" type="text" id="country" placeholder="..." class="form-control"
                         name="country"/>
                <f:errors path="country" cssClass="error"/>
            </div>

            <div class="form-group col-md-6">
                <label for="city" class="col-sm-5 control-label">Şəhər</label>

                <f:input path="city" type="text" id="city" placeholder="..." class="form-control" name="city"/>
                <f:errors path="city" cssClass="error"/>
            </div>
            <div class="form-group col-md-6">
                <label for="address" class="col-sm-5 control-label">Ünvan</label>

                <f:input path="address" type="text" id="address" placeholder="..." class="form-control"
                         name="address"/>
                <f:errors path="address" cssClass="error"/>
            </div>

            <div class="form-group col-md-6">
                <label for="postalCode" class="col-sm-5 control-label">Poçt kodu</label>

                <f:input path="postalCode" type="text" id="postalCode" placeholder="..." class="form-control"
                         name="postalCode"/>
                <f:errors path="postalCode" cssClass="error"/>
            </div>

            <div class="form-group col-md-6">
                <label for="email" class="col-sm-5 control-label">E-Poçt</label>

                <f:input path="email" type="email" id="email" placeholder="..." class="form-control" name="email"/>
                <f:errors path="email" cssClass="error"/>
            </div>

            <div class="form-group col-md-6">
                <label for="phone" class="col-sm-5 control-label">Telefon</label>

                <f:input path="phone" type="phone" id="phone" placeholder="..." class="form-control"
                         name="phone"/>
                <f:errors path="phone" cssClass="error"/>
            </div>
            <div class="form-group col-md-6">
                <label for="password" class="col-sm-5 control-label">Şifrə</label>

                <f:input path="password" type="password" id="password" placeholder="..." onkeyup='check();' class="form-control"/>
                <f:errors path="password" cssClass="error"/>
            </div>
            <div class="form-group col-md-6">
                <label for="password" class="col-sm-7 control-label">Şifrə(Təkrar)</label>

                <input name="confirmPassword" type="password" id="confirm_password" onkeyup='check();' placeholder="..."
                         class="form-control"/>
                <span id='errmessage'></span>
            </div>
        </div>

        <button type="submit" id="confirm" class="btn btn-primary btn-block">Təsdiq</button>
        <p class="pull-left" style="font-size: 20px;"><a href="login"><small>Geri</small></a></p>
    </f:form>

</div>
</body>
</html>
