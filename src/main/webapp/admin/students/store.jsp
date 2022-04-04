<!DOCTYPE html>
<html>
    <title>W3.CSS</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>
    <form class="w3-container w3-card-4" action="/students/store" method="post">
        <h2 class="w3-text-blue">Create Student</h2>
        <p>
            <label class="w3-text-blue"><b>Id</b></label>
            <input class="w3-input w3-border" name="id" type="number">
        </p>
        <p>
            <label class="w3-text-blue"><b>Name</b></label>
            <input class="w3-input w3-border" name="name" type="text">
        </p>
        <p>
            <label class="w3-text-blue"><b>Email</b></label>
            <input class="w3-input w3-border" name="email" type="email">
        </p>
        <p>
            <label class="w3-text-blue"><b>Address</b></label>
            <input class="w3-input w3-border" name="address" type="text">
        </p>
        <p>
            <button class="w3-btn w3-blue">Submit</button>
            <input type="reset" class="w3-btn w3-teal" value="Reset"/>
        </p>
    </form>
</body>
</html>
