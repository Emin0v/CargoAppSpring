class UI {

    static addOrderToBucket(order) {
        const trElem = document.getElementById("addOrder");

        const elements = `
        <tr>
           <td>${order.id}</td>
           <td><img src="${order.link}" class="img-fluid img-thumbnail"></td>
           <td><a href="${order.link}" target="_blank">${order.link}</a></td> 
           <td>${order.country}</td>
           <td>${order.price}</td>
           <td>${order.totalPrice}</td>
           <td>${order.color}</td>
           <td>${order.size}</td>
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
        div.style.display="block";
        // alert div
        div.className = `alert alert-${type}`;
        div.textContent = message;

        setTimeout(function () {
            div.style.display="none";
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
               <td><img src="${order.link}" class="img-fluid img-thumbnail"></td>
               <td><a href="${order.link}" target="_blank">${order.link}</a></td>
               <td>${order.country}</td>
               <td>${order.price}</td>
               <td>${order.totalPrice}</td>
               <td>${order.color}</td>
               <td>${order.size}</td>
               <td>
                 <button class="btn btn-danger" id = "delete-order" type="submit">
                            <i class="fas fa-trash-alt"></i>
                 </button>
               </td>
            </tr>
         `;

        });
    }

    static deleteOrderFromUI(element){

        element.parentElement.parentElement.remove();
    }



}