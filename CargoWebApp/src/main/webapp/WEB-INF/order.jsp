<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
            crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>

</head>
<body>

<div class="row flex-column text-center my-5" id="orders-holder">
    <h1 class="b-header my-2">
        Sifariş etmək üçün aşağıdakı xanaları doldurun </h1>

</div>

<button class="btn shopping-card d-flex mr-2 ml-2 my-2 justify-content-center" data-toggle="modal"
        data-target=".bd-example-modal-lg"
        style="border: 1px solid green;margin-left: auto;margin-right: auto;">
    <i class="fas fa-shopping-basket fa-2x"></i>
</button>

<div class="row justify-content-center m-0">

    <div class="flex-column f-20 p-1 py-3 px-2 px-sm-5">

        <form id="order_form">
            <div class="row pt-3 m-0 flex-row fullCenter">
                <div class="col-lg-12 no-padding">
                    <div class="form-group f-2 mt-2">
                        <label for="country">Ölkə</label>
                        <select class="form-select" id="country">
                            <option value="Turkey" selected>Turkey</option>
                        </select>
                    </div>
                </div>
                <div class="col-lg-6 no-padding">
                    <div class="form-group f-3 mt-2">
                        <label for="Orders_link">Məhsulun linki</label>
                        <input class="form-control b-input b-input--small" name="Orders[link]" id="Orders_link"
                               type="text">
                    </div>
                </div>

                <div class="col-lg-2">
                    <div class="form-group f-2 mt-2">
                        <label for="Orders_count" class="required">Say</label> <input
                            class="form-control b-input b-input--small" name="Orders[count]" id="Orders_count"
                            type="text"></div>
                </div>
                <div class="col-lg-4">
                    <div class="form-group f-2 mt-2">
                        <label for="Orders_price">Qiymət</label> <input
                            class="form-control b-input b-input--small" value="" name="Orders[price]"
                            id="Orders_price" type="text">
                    </div>

                    <span class="corrier-price f-1 mt-2">
            					+5%
            				</span>
                </div>

                <div class="col-md-12 no-padding pt-2">
                    <div class="form-group f-2 mt-2">
                        <label for="Orders_total_price">Yekun qiymət</label>
                        <input class="form-control b-input b-input--small"
                               value="" name="Orders[total_price]"
                               id="Orders_total_price" type="text"></div>
                    <div class="form-group f-2 mt-2">
                        <label for="Orders_size" class="required">Ölçü</label>
                        <input class="form-control b-input b-input--small" value="" name="Orders[size_str]"
                               id="Orders_size" type="text">
                    </div>

                    <div class="form-group f-2 mt-2">
                        <label for="Orders_color">Rəng</label> <input
                            class="form-control b-input b-input--small" name="Orders[color]" id="Orders_color"
                            type="text">
                    </div>
                </div>
            </div>

            <div class="row pt-3 m-0 flex-row fullCenter no-padding">
                <div class="col-12 no-padding">
                    <div class="form-group fullWidth mt-2">
                        <label for="Orders_note">Qeyd</label> <textarea class="form-control b-textarea" rows="4"
                                                                        name="Orders[note]" id="Orders_note"></textarea>
                    </div>
                </div>
            </div>

            <div id="message"></div>

            <div class="row pt-3 pm-0 m-0 d-flex flex-row px-5 fullCenter">
                <button id="addBucket" class="btn btn-primary ml-1 mt-1">
                    Səbətə əlavə et
                </button>
            </div>
        </form>

    </div>
</div>

<!-- Modal -->
<div class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
     aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">

            <form action="order" method="post">
                <table class="table">
                    <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Şəkil</th>
                        <th scope="col">Məhsulun linki</th>
                        <th scope="col">Ölkə</th>
                        <th scope="col">Qiymət</th>
                        <th scope="col">Yekun qiymət</th>
                        <th scope="col">Sayı</th>
                        <th scope="col">Rəng</th>
                        <th scope="col">Ölçü</th>
                        <th scope="col">Məhsulu sil</th>
                    </tr>
                    </thead>
                    <tbody id="addOrder">

                    </tbody>
                    <input type="hidden" name="customerNumber" value="${user.customerNumber}">
                </table>

                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Bağla</button>
                    <button type="submit" class="btn btn-warning">Sifariş et</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="js/UI.js"></script>
<script src="js/storage.js"></script>
<script src="js/order.js"></script>

<script src="js/project.js"></script>

<script>
    addListener('${orderAuth}');
</script>

<c:if test="${clearAllOrders==1}">
    <script>
        storage.clearAllOrdersFromStorage();
    </script>
</c:if>

</body>
</html>
