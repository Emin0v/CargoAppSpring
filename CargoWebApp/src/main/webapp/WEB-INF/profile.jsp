<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>Profile</title>

    <script src="js/message.js"></script>
    <link href="css/profile.css" rel="stylesheet">
</head>
<body>
<div id="message"></div>

<span style="display: flex;justify-content: center;"><i class="fas fa-user-alt fa-5x center"></i></span>
<button class="btn btn-warning mt-1 mx-3" style="display: inline">
    <i class="fas fa-backspace"></i>
    Geri
</button>
<div class="text-center flex-column m-0 mt-3">

    <form action="order">
        <button class="btn btn-warning main-button mt-1 mx-1" style="display: inline">
            Sifariş et
            <i class="fas fa-shopping-cart"></i>
        </button>
    </form>
</div>
<div class="text-center flex-column m-0 mt-3">
                <span class="">
                    Cari balans:
                    <span class="bold">
                        0 AZN , 0 TRY
                    </span>
                </span>
    <button class="btn btn-warning main-button mt-1 mx-1" style="display: inline">
        Balansı artır
    </button>
</div>
<f:form action="profile" method="post" role="form" modelAttribute="profileform">
    <div class="row justify-content-center m-0">

        <div class="row mt-2">

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="customerNumber" class="required">Müştəri nömrəsi<span class="required">*</span></label>
                    <input class="form-control b-input" autofocus="autofocus" name="customerNumber"
                           id="customerNumber" value="${profileform.customerNumber}" readonly/>
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="customerName" class="required">Ad <span class="required">*</span></label>
                    <f:input class="form-control b-input" autofocus="autofocus" path="customerName" id="customerName"/>

                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="customerSurname" class="required">Soyad<span class="required">*</span></label>
                    <f:input class="form-control b-input" autofocus="autofocus" path="customerSurname"
                             id="customerSurname"/>
                </div>
            </div>

        </div>

        <div class="row mt-2">

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="address">Ünvan <span class="required">*</span></label>
                    <f:input class="form-control b-input" autofocus="autofocus" path="address" id="address"/>
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="city" class="required">Şəhər<span class="required">*</span></label>
                    <f:input class="form-control b-input" autofocus="autofocus" path="city" id="city"/>
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="country" class="required">Ölkə<span class="required">*</span></label>
                    <f:input class="form-control b-input" autofocus="autofocus" path="country" id="country"/>
                </div>
            </div>
        </div>

        <div class="row mt-2">

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="email" class="required">Email<span class="required">*</span></label>
                    <f:input class="form-control b-input" autofocus="autofocus" path="email" id="email"/>
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="phone">Telefon <span class="required">*</span></label>
                    <f:input class="form-control b-input" autofocus="autofocus" path="phone" id="phone"/>
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="postalCode" class="required">Poçt kodu<span class="required">*</span></label>
                    <f:input class="form-control b-input" autofocus="autofocus" path="postalCode" id="postalCode"/>
                </div>
            </div>

        </div>

        <div class="row pt-3 mb-3 flex-row fullCenter">
            <button class="btn btn-warning main-button" type="submit">
                Təsdiqlə
            </button>
        </div>
    </div>
</f:form>

<%
    if (request.getAttribute("message") != null) {
%>
<script>
    displayMessage("success", "Successful process!");
</script>

<%
    }
%>

</body>
</html>
