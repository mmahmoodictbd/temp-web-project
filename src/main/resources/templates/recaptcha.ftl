<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Recaptcha test</title>
    <script src='https://www.google.com/recaptcha/api.js'></script>
</head>
<body>

    <form action="/recaptcha" method="post">

        <input name="username">
        <div class="g-recaptcha" data-sitekey="${siteKey}"></div>
        <input type="submit" value="Submit">
    </form>


    </body>

</html>