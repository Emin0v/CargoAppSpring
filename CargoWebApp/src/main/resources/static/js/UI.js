class UI {

    static addOrderToBucket(order) {
        const trElem = document.getElementById("addOrder");

        trElem.innerHTML = ''; // temporary code

        const elements = `
           <td>1</td>
           <td><img src="${order.link}" class="img-fluid img-thumbnail"></td>
           <td>${order.link}</td>
           <td>${order.country}</td>
           <td>${order.price}</td>
           <td>${order.totalPrice}</td>
           <td>${order.color}</td>
           <td>${order.size}</td>
        `;

        trElem.innerHTML = elements;

    }

    static displayMessages(message, type) {
        const div = document.getElementById("message");
        // alert div
        div.className = `alert alert-${type}`;
        div.textContent = message;

        setTimeout(function () {
            div.remove();
        }, 3000);

    }

    static clearInputs(element1, element2, element3, element4, element5, element6, element7, element8) {
        element1.value = "";
        element2.value = "";
        element3.value = "";
        element4.value = "";
        element5.value = "";
        element6.value = "";
        element7.value = "";
        element8.value = "";
    }

}