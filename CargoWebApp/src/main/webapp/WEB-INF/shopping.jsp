<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

</head>
<body>

<div class="row flex-column text-center my-5" id="orders-holder">
    <h1 class="b-header my-2">
        Sifariş etmək üçün aşağıdakı xanaları doldurun </h1>

</div>

<div class="row justify-content-center fullCenter m-0">

    <div class="inputs-wrapper inputs-wrapper--material flex-column f-20 p-1 py-3 px-2 px-sm-5">

        <form action="" method="post">
            <div class="row pt-3 m-0 flex-row fullCenter">
                <div class="col-lg-12 no-padding">
                    <div class="form-group f-2 mt-2">
                        <label for="Orders_c_id" class="required">Ölkə <span class="required">*</span></label>
                        <div class="dropdown bootstrap-select form-control b-input"><select
                                class="form-control b-input" name="Orders[c_id]" id="Orders_c_id">
                            <option value="1" selected="selected" data-percent="5" data-curr-label1="Qiymət TL"
                                    data-curr-label2="Yekun qiymət TL">Türkiyə
                            </option>
                        </select>
                            <button type="button" class="btn dropdown-toggle b-input" data-toggle="dropdown"
                                    role="button" data-id="Orders_c_id" title="Türkiyə" aria-expanded="false">
                                <div class="filter-option">
                                    <div class="filter-option-inner">
                                        <div class="filter-option-inner-inner">Türkiyə</div>
                                    </div>
                                </div>
                            </button>
                        </div>
                        <small class="errorText" data-error="c_id" style="display: none;"></small>
                    </div>
                </div>
                <div class="col-lg-6 no-padding">
                    <div class="form-group f-3 mt-2">
                        <label for="Orders_link" class="required">Məhsulun linki <span class="required">*</span></label>
                        <input class="form-control b-input b-input--small" name="Orders[link]" id="Orders_link"
                               type="text">
                        <small class="errorText" data-error="link" style="display: none;"></small>
                    </div>
                </div>

                <div class="col-lg-2 no-padding">
                    <div class="form-group f-2 mt-2">
                        <label for="Orders_count" class="required">Say <span class="required">*</span></label> <input
                            class="form-control b-input b-input--small" name="Orders[count]" id="Orders_count"
                            type="text"> <small class="errorText" data-error="count" style="display: none;"></small>
                    </div>
                </div>
                <div class="col-lg-4 no-padding">
                    <div class="form-group f-2 mt-2">
                        <label for="Orders_price" class="required">Qiymət <span class="required">*</span></label> <input
                            class="form-control b-input b-input--small" min="0" value="" step="any" name="Orders[price]"
                            id="Orders_price" type="text"> <small class="errorText" data-error="price"
                                                                  style="display: none;"></small>
                    </div>

                    <span class="corrier-price f-1 mt-2">
            					+5%
            				</span>
                </div>

                <div class="col-md-12 no-padding pt-2">
                    <div class="form-group f-2 mt-2">
                        <label class="ws-nowrap required" for="Orders_total_price">Yekun qiymət <span
                                class="required">*</span></label> <input class="form-control b-input b-input--small"
                                                                         value="" name="Orders[total_price]"
                                                                         id="Orders_total_price" type="text">
                        <small class="errorText" data-error="total_price" style="display: none;"></small>
                    </div>
                    <div class="form-group f-2 mt-2">
                        <label for="Orders_size_str" class="required">Ölçü <span class="required">*</span></label>
                        <input class="form-control b-input b-input--small" value="" name="Orders[size_str]"
                               id="Orders_size_str" type="text" maxlength="255"> <small class="errorText"
                                                                                        data-error="size_str"
                                                                                        style="display: none;"></small>
                    </div>

                    <div class="form-group f-2 mt-2">
                        <label for="Orders_color" class="required">Rəng <span class="required">*</span></label> <input
                            class="form-control b-input b-input--small" name="Orders[color]" id="Orders_color"
                            type="text" maxlength="255"> <small class="errorText" data-error="color"
                                                                style="display: none;"></small>
                    </div>
                </div>
            </div>

            <div class="row pt-3 m-0 flex-row fullCenter no-padding">
                <div class="col-12 no-padding">
                    <div class="form-group fullWidth mt-2">
                        <label for="Orders_note">Qeyd</label> <textarea class="form-control b-textarea" rows="4"
                                                                        name="Orders[note]" id="Orders_note"></textarea>
                        <small class="errorText" data-error="note" style="display: none;"></small>
                    </div>
                </div>
            </div>

            <div class="row pt-3 pm-0 m-0 d-flex flex-row px-5 fullCenter">
                <div class="form-check d-flex flex-row px-1 mt-1">
                    <input class="form-check-input" type="checkbox" id="urgent-order-main" name="urgent-order">
                    <label class="form-check-label ml-2 my-1" for="urgent-order-main">
                        <span class="mx-2">Təcili sifariş</span>
                    </label>
                    <span class="form-check__urgent-price px-2">+2 USD</span>
                    <button class="btn btn-link py-0 px-2" type="button" data-toggle="modal"
                            data-target="#exampleModalCenter" aria-label="Open info about fast order"><i
                            class="fa fa-info-circle main-color"></i></button>
                </div>


                <button id="addNewLink" class="btn btn-light ml-1 simple-button mt-1" type="button">
                    Səbətə əlavə et
                </button>
            </div>

            <div class="row pt-3 m-0 flex-row fullCenter">

                <!--
                <button class="btn btn-warning main-button go2Order" type="submit">
                    Sifariş et            			</button>
                -->
            </div>
        </form>

    </div>


</div>
</body>
</html>
