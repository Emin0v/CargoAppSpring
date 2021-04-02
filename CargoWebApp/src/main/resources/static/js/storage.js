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

    // static deleteOrderToStorage(filmTitle) {
    //
    //     let films = this.getFilmsFromStorage();
    //
    //     films.forEach(function (film, index) {
    //         if (film.title === filmTitle) {
    //             films.splice(index, 1);
    //         }
    //
    //     });
    //
    //     localStorage.setItem("films", JSON.stringify(films));
    // }

    // static clearAllFilmsFromStorage() {
    //     localStorage.removeItem("films");
    // }
}