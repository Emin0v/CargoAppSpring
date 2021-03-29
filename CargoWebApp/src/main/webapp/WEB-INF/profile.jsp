<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <title>Title</title>

    <link href="css/profile.css" rel="stylesheet">
</head>
<body>

<%--<form action="">--%>
                <span>
                    <i class="fas fa-user-alt fa-5x" style="margin-left: 7.9em;"></i>
                </span>
<div class="text-center flex-column m-0 mt-3">

    <button class="btn btn-warning main-button mt-1 mx-1" style="display: inline">
        Sifariş et
        <i class="fas fa-shopping-cart"></i>
    </button>
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
<div>
    <div class="row justify-content-center m-0">

        <div class="row mt-2">

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="customerNumber" class="required">Müştəri nömrəsi<span class="required">*</span></label>
                    <input class="form-control b-input" autofocus="autofocus" name="customerNumber" id="customerNumber"
                           type="text" maxlength="11" value="">
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="name" class="required">Ad <span class="required">*</span></label>
                    <input class="form-control b-input" autofocus="autofocus" name="name" id="name"
                           type="text" maxlength="155" value="">
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="surname" class="required">Soyad<span class="required">*</span></label>
                    <input class="form-control b-input" autofocus="autofocus" name="surname" id="surname"
                           type="text" maxlength="155" value="">
                </div>
            </div>


        </div>

        <div class="row mt-2">

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="address">Ünvan <span class="required">*</span></label>
                    <input class="form-control b-input" autofocus="autofocus" name="address" id="address"
                           type="text" maxlength="155" value="">
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="city" class="required">Şəhər<span class="required">*</span></label>
                    <input class="form-control b-input" autofocus="autofocus" name="city" id="city"
                           type="text" maxlength="155" value="">
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="country" class="required">Ölkə<span class="required">*</span></label>
                    <input class="form-control b-input" autofocus="autofocus" name="country" id="country"
                           type="text" maxlength="155" value="">
                </div>
            </div>
        </div>

        <div class="row mt-2">

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="email" class="required">Email<span class="required">*</span></label>
                    <input class="form-control b-input" autofocus="autofocus" name="email" id="email"
                           type="email" maxlength="155" value="">
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="phone">Telefon <span class="required">*</span></label>
                    <input class="form-control b-input" autofocus="autofocus" name="phone" id="phone"
                           type="text" maxlength="30" value="">
                </div>
            </div>

            <div class="col-md-4">
                <div class="form-group mt-4 mt-sm-2 fullWidth">
                    <label for="postalCode" class="required">Poçt kodu<span class="required">*</span></label>
                    <input class="form-control b-input" autofocus="autofocus" name="postalCode" id="postalCode"
                           type="text" maxlength="10" value="">
                </div>
            </div>

        </div>

        <div class="row pt-3 mb-3 flex-row fullCenter">
            <button class="btn btn-warning main-button" type="submit">
                Təsdiqlə
            </button>
        </div>
    </div>
    <%--</form>--%>
</body>
</html>
