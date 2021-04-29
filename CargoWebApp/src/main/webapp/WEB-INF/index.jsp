<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="en">

<head>
    <title>Cargo &mdash; Website </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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

<body data-spy="scroll" data-target=".site-navbar-target" data-offset="300">

<div id="overlayer"></div>
<div class="loader">
    <div class="spinner-border text-primary" role="status">
        <span class="sr-only">Loading...</span>
    </div>
</div>

<div class="site-wrap" id="home-section">

    <div class="site-mobile-menu site-navbar-target">
        <div class="site-mobile-menu-header">
            <div class="site-mobile-menu-close mt-3">
                <span class="icon-close2 js-menu-toggle"></span>
            </div>
        </div>
        <div class="site-mobile-menu-body"></div>
    </div>


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
                            <%--                        <security:authorize access="isAuthenticated()">--%>
                            <%--                            authenticated as <security:authentication property="principal.username" />--%>
                            <%--                        </security:authorize>--%>
                        </ul>
                    </nav>

                </div>

                <div class="toggle-button d-inline-block d-lg-none"><a href="#"
                                                                       class="site-menu-toggle py-5 js-menu-toggle text-black"><span
                        class="icon-menu h3"></span></a></div>

            </div>
        </div>

    </header>

    <div class="ftco-blocks-cover-1">
        <div class="ftco-cover-1 overlay"
             style="background-image: url('https://source.unsplash.com/pSyfecRCBQA/1920x780')">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-lg-6">
                        <h1>Yükünüzün keyfiyyətli çatdırılmasını seçin</h1>
                        <p class="mb-5">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Est magni perferendis
                            fugit modi similique, suscipit, deserunt a iure.</p>
                        <form action="#">
                            <div class="form-group d-flex">
                                <input type="text" class="form-control" placeholder="izləmə nömrəsi">
                                <input type="submit" class="btn btn-primary text-white px-4" value="İndi izləyin">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!-- END .ftco-cover-1 -->
        <div class="ftco-service-image-1 pb-5">
            <div class="container">
                <div class="owl-carousel owl-all">
                    <div class="service text-center">
                        <a href="#"><img src="images/cargo_sea_small.jpg" alt="Image" class="img-fluid"></a>
                        <div class="px-md-3">
                            <h3><a href="#">Dəniz nəqliyyatı</a></h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci, ipsa.</p>
                        </div>
                    </div>
                    <div class="service text-center">
                        <a href="#"><img src="images/cargo_air_small.jpg" alt="Image" class="img-fluid"></a>
                        <div class="px-md-3">
                            <h3><a href="#">Hava nəqliyyatı</a></h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dignissimos,
                                necessitatibus.</p>
                        </div>
                    </div>
                    <div class="service text-center">
                        <a href="#"><img src="images/cargo_delivery_small.jpg" alt="Image" class="img-fluid"></a>
                        <div class="px-md-3">
                            <h3><a href="#">Paket Yönləndirmə</a></h3>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolore, vel.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>


    <div class="site-section bg-light" id="services-section">
        <div class="container">
            <div class="row mb-5 justify-content-center">
                <div class="col-md-7 text-center">
                    <div class="block-heading-1">
                        <h2>NƏ TƏKLİF EDİRİK</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aperiam consectetur corporis dolore
                            enim ex excepturi exercitationem iusto omnis quas tenetur?</p>
                    </div>
                </div>
            </div>
            <div class="owl-carousel owl-all">
                <div class="block__35630">
                    <div class="icon mb-0">
                        <span class="flaticon-ferry"></span>
                    </div>
                    <h3 class="mb-3">Dəniz Nəqliyyatı</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Deserunt, nam!. </p>
                </div>

                <div class="block__35630">
                    <div class="icon mb-0">
                        <span class="flaticon-airplane"></span>
                    </div>
                    <h3 class="mb-3">Hava Nəqliyyatı</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corporis, voluptatum? </p>
                </div>

                <div class="block__35630">
                    <div class="icon mb-0">
                        <span class="flaticon-box"></span>
                    </div>
                    <h3 class="mb-3">Paket Yönləndirmə</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aspernatur, illum. </p>
                </div>

                <div class="block__35630">
                    <div class="icon mb-0">
                        <span class="flaticon-lorry"></span>
                    </div>
                    <h3 class="mb-3">Yük maşını</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Facilis, nemo. </p>
                </div>

                <div class="block__35630">
                    <div class="icon mb-0">
                        <span class="flaticon-warehouse"></span>
                    </div>
                    <h3 class="mb-3">Anbar</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Facere, nesciunt. </p>
                </div>

                <div class="block__35630">
                    <div class="icon mb-0">
                        <span class="flaticon-add"></span>
                    </div>
                    <h3 class="mb-3">Çatdırılma</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Deserunt, molestiae!. </p>
                </div>

            </div>
        </div>
    </div>


    <div class="site-section" id="about-section">

        <div class="container">
            <div class="row mb-5 justify-content-center">
                <div class="col-md-7 text-center">
                    <div class="block-heading-1" data-aos="fade-up" data-aos-delay="">
                        <h2>Haqqımızda</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad dolore doloribus eos iusto quis!
                            Necessitatibus quia, ratione. Fugit illo, nam.</p>
                    </div>
                </div>
            </div>
        </div>

    </div>


    <div class="site-section bg-light" id="about-section1">
        <div class="container">
            <div class="row justify-content-center mb-4 block-img-video-1-wrap">
                <div class="col-md-12 mb-5">
                    <figure class="block-img-video-1" data-aos="fade">
                        <a href="https://vimeo.com/45830194" data-fancybox data-ratio="2">
                            <span class="icon"><span class="icon-play"></span></span>
                            <img src="images/cargo_delivery_big.jpg" alt="Image" class="img-fluid">
                        </a>
                    </figure>
                </div>
            </div>
            <div class="row">
                <div class="col-12">
                    <div class="row">
                        <div class="col-6 col-md-6 mb-4 col-lg-0 col-lg-3" data-aos="fade-up" data-aos-delay="">
                            <div class="block-counter-1">
                                <span class="number"><span data-number="50">0</span>+</span>
                                <span class="caption">İllərin təcrübəsi</span>
                            </div>
                        </div>
                        <div class="col-6 col-md-6 mb-4 col-lg-0 col-lg-3" data-aos="fade-up" data-aos-delay="100">
                            <div class="block-counter-1">
                                <span class="number"><span data-number="300">0</span>+</span>
                                <span class="caption">Şirkətlər</span>
                            </div>
                        </div>
                        <div class="col-6 col-md-6 mb-4 col-lg-0 col-lg-3" data-aos="fade-up" data-aos-delay="200">
                            <div class="block-counter-1">
                                <span class="number"><span data-number="108">0</span>+</span>
                                <span class="caption">Ölkələr</span>
                            </div>
                        </div>
                        <div class="col-6 col-md-6 mb-4 col-lg-0 col-lg-3" data-aos="fade-up" data-aos-delay="300">
                            <div class="block-counter-1">
                                <span class="number"><span data-number="1500">0</span>+</span>
                                <span class="caption">Kuryerlər</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div class="site-section" id="faq-section">
        <div class="container">
            <div class="row mb-5">
                <div class="block-heading-1 col-12 text-center">
                    <h2>Tez-tez soruşulan suallar</h2>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-6">

                    <div class="mb-5" data-aos="fade-up" data-aos-delay="100">
                        <h3 class="text-black h4 mb-4"><span class="icon-question_answer text-primary mr-2"></span>Sifarişi
                            geri qaytarmaq olar?</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Commodi eligendi esse eveniet
                            facilis illo non odit porro, quod veniam voluptatibus? </p>
                    </div>

                    <div class="mb-5" data-aos="fade-up" data-aos-delay="100">
                        <h3 class="text-black h4 mb-4"><span class="icon-question_answer text-primary mr-2"></span>Geri
                            ödəmə müddəti nədir?</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab amet consequatur deleniti et
                            inventore numquam obcaecati provident quasi sapiente voluptatum? </p>
                    </div>

                    <div class="mb-5" data-aos="fade-up" data-aos-delay="100">
                        <h3 class="text-black h4 mb-4"><span class="icon-question_answer text-primary mr-2"></span>300
                            ABŞ dolları limiti nədir?</h3>
                        <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia,
                            there live the blind texts. </p>
                    </div>

                    <div class="mb-5" data-aos="fade-up" data-aos-delay="100">
                        <h3 class="text-black h4 mb-4"><span class="icon-question_answer text-primary mr-2"></span>Sifariş
                            hansı müddətə çatdırılır?</h3>
                        <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia,
                            there live the blind texts. </p>
                    </div>
                </div>
                <div class="col-lg-6">

                    <div class="mb-5" data-aos="fade-up" data-aos-delay="100">
                        <h3 class="text-black h4 mb-4"><span class="icon-question_answer text-primary mr-2"></span>Çatdırılma
                            ödənişi necə hesablanır?</h3>
                        <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia,
                            there live the blind texts. </p>
                    </div>

                    <div class="mb-5" data-aos="fade-up" data-aos-delay="100">
                        <h3 class="text-black h4 mb-4"><span class="icon-question_answer text-primary mr-2"></span>Sifarişi
                            necə izləmək olar?</h3>
                        <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia,
                            there live the blind texts. </p>
                    </div>

                    <div class="mb-5" data-aos="fade-up" data-aos-delay="100">
                        <h3 class="text-black h4 mb-4"><span class="icon-question_answer text-primary mr-2"></span>Nə
                            sifariş edə bilərəm?</h3>
                        <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia,
                            there live the blind texts. </p>
                    </div>

                    <div class="mb-5" data-aos="fade-up" data-aos-delay="100">
                        <h3 class="text-black h4 mb-4"><span class="icon-question_answer text-primary mr-2"></span>Nə
                            sifariş etmək olmaz?</h3>
                        <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia,
                            there live the blind texts. </p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="block__73694 site-section border-top" id="why-us-section">
        <div class="container">
            <div class="row d-flex no-gutters align-items-stretch">

                <div class="col-12 col-lg-6 block__73422 order-lg-2"
                     style="background-image: url('images/cargo_sea_small.jpg');" data-aos="fade-left"
                     data-aos-delay="">
                </div>


                <div class="col-lg-5 mr-auto p-lg-5 mt-4 mt-lg-0 order-lg-1" data-aos="fade-right" data-aos-delay="">
                    <h2 class="mb-4 text-black">Nə üçün biz</h2>
                    <h4 class="text-primary">Tez və səmərəli işləyirik!</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Blanditiis expedita laboriosam
                        voluptate voluptatum. Accusamus aliquam aliquid consequatur, facilis odio ratione?</p>

                    <ul class="ul-check primary list-unstyled mt-5">
                        <li>Vaxtında çatdırılma</li>
                        <li>Təhlükəsiz xidmət</li>
                        <li>Təhlükəsiz anbar</li>
                        <li>Maliyyəyə qənaət</li>
                    </ul>

                </div>

            </div>
        </div>
    </div>


    <div class="site-section bg-light block-13" id="testimonials-section" data-aos="fade">
        <div class="container">

            <div class="text-center mb-5">
                <div class="block-heading-1">
                    <h2>Müştəri Rəyləri</h2>
                </div>
            </div>

            <div class="owl-carousel nonloop-block-13">
                <div>
                    <div class="block-testimony-1 text-center">

                        <blockquote class="mb-4">
                            <p>&ldquo;Lorem ipsum dolor sit amet, consectetur adipisicing elit. A ab atque distinctio
                                dolor dolores eaque fuga, labore modi molestiae officiis pariatur quasi quod quos
                                repellendus sequi tenetur totam voluptates voluptatum.&rdquo;</p>
                        </blockquote>

                        <figure>
                            <img src="images/person_4.jpg" alt="Image" class="img-fluid rounded-circle mx-auto">
                        </figure>
                        <h3 class="font-size-20 text-black">Ricky Fisher</h3>
                    </div>
                </div>

                <div>
                    <div class="block-testimony-1 text-center">
                        <blockquote class="mb-4">
                            <p>&ldquo;Lorem ipsum dolor sit amet, consectetur adipisicing elit. Accusamus aliquid
                                commodi consequuntur cupiditate, deserunt, dolorum ex expedita fuga incidunt ipsam quae
                                quam, vel vitae. Aperiam dicta maiores neque pariatur totam.&rdquo;</p>
                        </blockquote>
                        <figure>
                            <img src="images/person_2.jpg" alt="Image" class="img-fluid rounded-circle mx-auto">
                        </figure>
                        <h3 class="font-size-20 mb-4 text-black">Ken Davis</h3>

                    </div>
                </div>

                <div>
                    <div class="block-testimony-1 text-center">


                        <blockquote class="mb-4">
                            <p>&ldquo;Lorem ipsum dolor sit amet, consectetur adipisicing elit. Harum, inventore,
                                repudiandae. Ab earum eligendi fugit hic necessitatibus, quisquam reprehenderit!
                                Cupiditate dolorem minus veritatis? Accusantium doloribus et nisi quae qui repudiandae.&rdquo;</p>
                        </blockquote>

                        <figure>
                            <img src="images/person_1.jpg" alt="Image" class="img-fluid rounded-circle mx-auto">
                        </figure>
                        <h3 class="font-size-20 text-black">Mellisa Griffin</h3>


                    </div>
                </div>

                <div>
                    <div class="block-testimony-1 text-center">
                        <blockquote class="mb-4">
                            <p>&ldquo;Far far away, behind the word mountains, far from the countries Vokalia and
                                Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at
                                the coast of the Semantics, a large language ocean.&rdquo;</p>
                        </blockquote>

                        <figure>
                            <img src="images/person_3.jpg" alt="Image" class="img-fluid rounded-circle mx-auto">
                        </figure>
                        <h3 class="font-size-20 mb-4 text-black">Robert Steward</h3>

                    </div>
                </div>


            </div>

        </div>
    </div>

    <div class="site-section bg-light" id="contact-section">
        <div class="container">
            <div class="row">
                <div class="col-12 text-center mb-5" data-aos="fade-up" data-aos-delay="">
                    <div class="block-heading-1">
                        <h2>Bizimlə Əlaqə</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-6 mb-5" data-aos="fade-up" data-aos-delay="100">
                    <form action="#" method="post">
                        <div class="form-group row">
                            <div class="col-md-6 mb-4 mb-lg-0">
                                <input type="text" class="form-control" placeholder="ad">
                            </div>
                            <div class="col-md-6">
                                <input type="text" class="form-control" placeholder="soyad">
                            </div>
                        </div>

                        <div class="form-group row">
                            <div class="col-md-12">
                                <input type="text" class="form-control" placeholder="Email address">
                            </div>
                        </div>

                        <div class="form-group row">
                            <div class="col-md-12">
                            <textarea name="" id="" class="form-control" placeholder="mesaj yazın." cols="30"
                                      rows="10"></textarea>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-md-6 mr-auto">
                                <input type="submit" class="btn btn-block btn-primary text-white py-3 px-5"
                                       value="Göndər">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-lg-4 ml-auto" data-aos="fade-up" data-aos-delay="200">
                    <div class="bg-white p-3 p-md-5">
                        <h3 class="text-black mb-4">Əlaqə məlumatları</h3>
                        <ul class="list-unstyled footer-link">
                            <li class="d-block mb-3">
                                <span class="d-block text-black">Ünvan:</span>
                                <span>34 Street Name, City Name Here, United States</span></li>
                            <li class="d-block mb-3"><span
                                    class="d-block text-black">Phone:</span><span>+994 50-555-55-55</span></li>
                            <li class="d-block mb-3"><span
                                    class="d-block text-black">Email:</span><span>cargo@gmail.com</span></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>

<footer class="site-footer">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <div class="row">
                    <div class="col-md-7">
                        <h2 class="footer-heading mb-4">Haqqımızda</h2>
                        <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia,
                            there live the blind texts. </p>
                    </div>
                    <div class="col-md-4 ml-auto">
                        <h2 class="footer-heading mb-4">xüsusiyyətlər</h2>
                        <ul class="list-unstyled">
                            <li><a href="#">Haqqımızda</a></li>
                            <li><a href="#">Xidmət Şərtləri</a></li>
                            <li><a href="#">Məxfilik</a></li>
                            <li><a href="#">Bizimlə Əlaqə</a></li>
                        </ul>
                    </div>

                </div>
            </div>


            <h2 class="footer-heading mb-4">Bizi İzləyin</h2>
            <a href="#about-section" class="smoothscroll pl-3 pr-3"><span class="icon-facebook"></span></a>
            <a href="#" class="pl-3 pr-3"><span class="icon-twitter"></span></a>
            <a href="#" class="pl-3 pr-3"><span class="icon-instagram"></span></a>
            <a href="#" class="pl-3 pr-3"><span class="icon-linkedin"></span></a>
            </form>
        </div>
    </div>
    <div class="row pt-5 mt-5 text-center">
        <div class="col-md-12">
            <div class="border-top pt-5">
                <p class="copyright">
                <h3>Mahammad Eminov</h3>
                </p>
            </div>
        </div>

    </div>
    </div>
</footer>

</body>

<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/jquery.sticky.js"></script>
<script src="js/jquery.waypoints.min.js"></script>
<script src="js/jquery.animateNumber.min.js"></script>
<script src="js/jquery.fancybox.min.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/aos.js"></script>

<script src="js/main.js"></script>

</html>
