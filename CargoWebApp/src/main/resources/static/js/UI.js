class UI {

    static addOrderToBucket(order) {
        const trElem = document.getElementById("addOrder");

        const elements = `
        <tr>
           <td>${order.id}</td>
           <td><input type="hidden" name="image" value="${order.link}"><img src="${order.link}" class="img-fluid img-thumbnail"></td>
           <td><input type="hidden" name="link" value="${order.link}"><a href="${order.link}" target="_blank">${order.link}</a></td> 
           <td><input type="hidden" name="country" value="${order.country}">${order.country}</td>
           <td><input type="hidden" name="price" value="${order.price}">${order.price}</td>
           <td><input type="hidden" name="totalPrice" value="${order.totalPrice}">${order.totalPrice}</td>
           <td><input type="hidden" name="count" value="${order.orderCount}">${order.orderCount}</td>
           <td><input type="hidden" name="color" value="${order.color}">${order.color}</td>
           <td><input type="hidden" name="size" value="${order.size}">${order.size}</td>
           <input type="hidden" name="comments" value="${order.note}">
           <td>
                 <button class="btn btn-danger" id = "delete-order" type="submit">
                            <i class="fas fa-trash-alt"></i>
                 </button>
           </td>
        </tr>   
        `;

        trElem.innerHTML += elements;

    }

    static displayMessages(message, type) {
        const div = document.getElementById("message");
        div.style.display = "block";
        // alert div
        div.className = `alert alert-${type}`;
        div.textContent = message;

        setTimeout(function () {
            div.style.display = "none";
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

    static loadAllOrders(orders) {
        const orderList = document.getElementById("addOrder");

        orders.forEach(function (order) {
            orderList.innerHTML += `
        <tr>
           <td>${order.id}</td>
           <td><input type="hidden" name="image" value="${order.link}"><img src="${order.link}" class="img-fluid img-thumbnail"></td>
           <td><input type="hidden" name="link" value="${order.link}"><a href="${order.link}" target="_blank">${order.link}</a></td> 
           <td><input type="hidden" name="country" value="${order.country}">${order.country}</td>
           <td><input type="hidden" name="price" value="${order.price}">${order.price}</td>
           <td><input type="hidden" name="totalPrice" value="${order.totalPrice}">${order.totalPrice}</td>
           <td><input type="hidden" name="count" value="${order.orderCount}">${order.orderCount}</td>
           <td><input type="hidden" name="color" value="${order.color}">${order.color}</td>
           <td><input type="hidden" name="size" value="${order.size}">${order.size}</td>
           <input type="hidden" name="comments" value="${order.note}">
           <td>
                 <button class="btn btn-danger" id = "delete-order" type="submit">
                            <i class="fas fa-trash-alt"></i>
                 </button>
           </td>
        </tr>     
         `;

        });
    }

    static deleteOrderFromUI(element) {

        element.parentElement.parentElement.remove();
    }


}