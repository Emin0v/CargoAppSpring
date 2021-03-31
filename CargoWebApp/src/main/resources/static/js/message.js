
function displayMessage(messageType , message) {
    const elem = document.getElementById("message");
    elem.className = `alert alert-${messageType}`;
    elem.role = "alert";
    elem.innerHTML = message;

    setTimeout(() => {
        elem.remove();
    }, 4000);
}


