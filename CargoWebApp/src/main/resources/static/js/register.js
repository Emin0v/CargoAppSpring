// const btn = document.getElementById("confirm");
// const div = document.getElementById("message");
//
// eventlistener();
//
// function eventlistener() {
//
//     btn.addEventListener("click", sendMessage);
// }
//
// function sendMessage(e) {
//
//     div.innerHTML = '<div class="alert alert-success" role="alert">\n' +
//         '    Successful Registration!\n' +
//         '</div>'
//
//     setTimeout(()=>{
//         div.innerHTML = '';
//     },10000);
//
//     e.preventDefault();
// }

$(function () {
    $.validator.setDefaults({
        highlight: function (element) {
            $(element)
                .closest('.form-group')
                .addClass('has-error')
        },
        unhighlight: function (element) {
            $(element)
                .closest('.form-group')
                .removeClass('has-error')
        }
    });

    $.validate({
        rules:
            {
                password: "required",
                birthDate: "required",
                weight: {
                    required: true,
                    number: true
                },
                height: {
                    required: true,
                    number: true
                },
                email: {
                    required: true,
                    email: true
                }
            },
        messages: {
            email: {
                required: true,
                email: true
            }
        },
        password: {
            required: " Please enter password"
        },
        birthDate: {
            required: " Please enter birthdate"
        },
        email: {
            required: ' Please enter email',
            email: ' Please enter valid email'
        },
        weight: {
            required: " Please enter your weight",
            number: " Only numbers allowed"
        },
        height: {
            required: " Please enter your height",
            number: " Only numbers allowed"
        },
    });

    // };
});