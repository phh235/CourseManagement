document.getElementById('fileInput').addEventListener('change', function (event) {    let file = event.target.files[0];    if (file) {        let reader = new FileReader();        reader.onload = function (e) {            let imagePreview = document.getElementById('imagePreview');            imagePreview.src = e.target.result;        };        reader.readAsDataURL(file);    }});