class storage {

   static orderAuth;

    static addOrderToStorage(newOrder) {
        let orders = this.getOrdersFromStorage();

        orders.push(newOrder);

        localStorage.setItem(`${this.orderAuth}`, JSON.stringify(orders));

    }

    static getOrdersFromStorage() {
        let orders;

        if (localStorage.getItem(`${this.orderAuth}`) === null) {
            orders = [];
        } else {
            orders = JSON.parse(localStorage.getItem(`${this.orderAuth}`));

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

        localStorage.setItem(`${this.orderAuth}`, JSON.stringify(orders));
    }

    static clearAllOrdersFromStorage() {
        localStorage.removeItem(`${this.orderAuth}`);
    }
}