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

addListener();

function addListener(){
    form.addEventListener("submit",addOrder);
}

function addOrder(e){
    const country = countryElem.value;
    const link = ordersLink.value;
    const count = ordersCount.value;
    const price = ordersPrice.value;
    const totalPrice = ordersTotalPrice.value;
    const size = ordersSize.value;
    const color = ordersColor.value;
    const note = ordersNote.value;

    if (country === "" || link === "" || count === ""|| price === ""|| totalPrice === ""|| size === ""
        || color === ""|| note === "") {

        UI.displayMessages("fill in all fields...", "danger");
    }else {
        const newOrder = new Order(country,link,count,price,totalPrice,size,color,note);

        UI.addOrderToBucket(newOrder);
        storage.addOrderToStorage(newOrder);
        UI.displayMessages("Successfully added", "success");
    }

    UI.clearInputs(countryElem, ordersLink,ordersCount,ordersColor,ordersNote,ordersSize,ordersTotalPrice,ordersPrice);
    e.preventDefault();
}
