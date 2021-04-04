class storage {

    static addOrderToStorage(newOrder) {
        let orders = this.getOrdersFromStorage();

        orders.push(newOrder);

        localStorage.setItem("orders", JSON.stringify(orders));

    }

    static getOrdersFromStorage() {
        let orders;

        if (localStorage.getItem("orders") === null) {
            orders = [];
        } else {
            orders = JSON.parse(localStorage.getItem("orders"));

        }

        return orders;
    }

    static deleteOrderFromStorage(orderId) {
        let orders = this.getOrdersFromStorage();
        orders.forEach(function (order, index) {
            if (Number(order.id) === Number(orderId)) {
                orders.splice(index, 1);
            }

        });

        localStorage.setItem("orders", JSON.stringify(orders));
    }

    static clearAllOrdersFromStorage() {
        localStorage.removeItem("orders");
    }
}