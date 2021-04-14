<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="https://fonts.googleapis.com/css?family=Rubik:300,400,700|Oswald:400,700" rel="stylesheet">

    <link rel="stylesheet" href="fonts/icomoon/style.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
          integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
          crossorigin="anonymous"/>
    <link rel="stylesheet" href="css/jquery.fancybox.min.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">
    <link rel="stylesheet" href="css/aos.css">

    <!-- MAIN CSS -->
    <link rel="stylesheet" href="css/style.css">

</head>
<body>

<div class="top-bar">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <a href="#" class=""><span class="mr-2  icon-envelope-open-o"></span> <span
                        class="d-none d-md-inline-block">cargo@gmail.com</span></a>
                <span class="mx-md-2 d-inline-block"></span>
                <a href="#" class=""><span class="mr-2  icon-phone"></span> <span class="d-none d-md-inline-block">+994 (50) 555 55 55</span></a>


                <div class="float-right">

                    <a href="#" class=""><span class="mr-2  icon-twitter"></span> <span
                            class="d-none d-md-inline-block">Twitter</span></a>
                    <span class="mx-md-2 d-inline-block"></span>
                    <a href="#" class=""><span class="mr-2  icon-facebook"></span> <span
                            class="d-none d-md-inline-block">Facebook</span></a>

                </div>

            </div>

        </div>

    </div>
</div>

<header class="site-navbar js-sticky-header site-navbar-target" role="banner">

    <div class="container">
        <div class="row align-items-center position-relative">


            <div class="site-logo">
                <a href="index.html" class="text-black"><span class="text-primary">Cargo</span></a>
            </div>

            <div class="col-12">
                <nav class="site-navigation text-right ml-auto " role="navigation">

                    <ul class="site-menu main-menu js-clone-nav ml-auto d-none d-lg-block">
                        <li><a href="#home-section" class="nav-link">Əsas Səhifə</a></li>
                        <li><a href="#services-section" class="nav-link">Xidmətlər</a></li>


                        <li class="has-children">
                            <a href="#about-section" class="nav-link">Haqqımızda</a>
                            <ul class="dropdown arrow-top">
                                <li><a href="#team-section" class="nav-link">Team</a></li>
                                <li><a href="#pricing-section" class="nav-link">Pricing</a></li>
                                <li><a href="#faq-section" class="nav-link">FAQ</a></li>
                                <li class="has-children">
                                    <a href="#">More Links</a>
                                    <ul class="dropdown">
                                        <li><a href="#">Menu One</a></li>
                                        <li><a href="#">Menu Two</a></li>
                                        <li><a href="#">Menu Three</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>

                        <li><a href="#why-us-section" class="nav-link">Nə üçün Biz</a></li>

                        <li><a href="#testimonials-section" class="nav-link">Blog</a></li>
                        <li><a href="#contact-section" class="nav-link">Bizimlə Əlaqə</a></li>

                        <%
                            if (request.getAttribute("customer") == null) {
                        %>
                        <form action="register" method="get" style="display:inline">
                            <button class="btn btn-warning">Qeydiyyat</button>
                        </form>
                        <form action="login" method="get" style="display:inline">
                            <button class="btn btn-success">Giriş</button>
                        </form>
                        <%
                            }
                            if (request.getAttribute("customer") != null) {
                        %>
                        <li class="has-children">
                            <button id="profile" type="button" class="btn btn-light bg-transparent dropdown-toggle">
                                <i class="fa fa-user main-color"></i>
                                ${customer.customerName}
                            </button>
                            <ul class="dropdown arrow-top">
                                <li><a href="profile" class="nav-link">Profile</a></li>
                                <li><a href="logout" class="nav-link">Çıxış</a></li>
                            </ul>
                        </li>
                        <%}%>
                    </ul>
                </nav>

            </div>

            <div class="toggle-button d-inline-block d-lg-none"><a href="#"
                                                                   class="site-menu-toggle py-5 js-menu-toggle text-black"><span
                    class="icon-menu h3"></span></a></div>

        </div>
    </div>

</header>

</body>
</html>
