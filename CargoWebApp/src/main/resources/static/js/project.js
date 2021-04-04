const form = document.getElementById("order_form");
const countryElem = document.getElementById("country");
const ordersLink = document.getElementById("Orders_link");
const ordersCount = document.getElementById("Orders_count");
const ordersPrice = document.getElementById("Orders_price");
const ordersTotalPrice = document.getElementById("Orders_total_price");
const ordersSize = document.getElementById("Orders_size");
const ordersColor = document.getElementById("Orders_color");
const ordersNote = document.getElementById("Orders_note");
const addBucket = document.getElementById("addBucket");
const orderList = document.getElementById("addOrder");

let id;

addListener();

function addListener() {
    // form.addEventListener("submit", addOrder);

    document.addEventListener("DOMContentLoaded", function () {
        let orders = storage.getOrdersFromStorage();
        UI.loadAllOrders(orders);
    });

    orderList.addEventListener("click", deleteOrder);
}

jQuery(document).on('click', '#addBucket', function (e) {
    e.preventDefault();
    addOrder();
});

function addOrder() {
    const country = countryElem.value;
    const link = ordersLink.value;
    const count = ordersCount.value;
    const price = ordersPrice.value;
    const totalPrice = ordersTotalPrice.value;
    const size = ordersSize.value;
    const color = ordersColor.value;
    const note = ordersNote.value;

    if (country === "" || link === "" || count === "" || price === "" || totalPrice === "" || size === ""
        || color === "") {

        UI.displayMessages("Zəhmət olmasa bütün xanaları doldurun", "danger");
    } else {
        const orders = storage.getOrdersFromStorage();
        id = 1;
        orders.forEach(function (order) {
            id = order.id + 1;
        });

        const newOrder = new Order(id, country, link, count, price, totalPrice, size, color, note);
        UI.addOrderToBucket(newOrder);
        storage.addOrderToStorage(newOrder);
        UI.displayMessages("Səbətə əlavə olundu", "success");
        UI.clearInputs(countryElem, ordersLink, ordersCount, ordersColor, ordersNote, ordersSize, ordersTotalPrice, ordersPrice);

    }

    // e.preventDefault();
}

function deleteOrder(e) {
    if (e.target.id === "delete-order") {
        UI.deleteOrderFromUI(e.target);
        storage.deleteOrderFromStorage(e.target.parentElement.parentElement.firstElementChild.innerHTML);
    }
}
