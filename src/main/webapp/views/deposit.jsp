<html>
    <head>
     <style>
        div{
           text-align: center;
           background: color-mix(in srgb, skyblue 40%, white 60%);
           width: 50%;
           height: 4%;
           margin-left: 25%;
           border-radius: 20%;
        }
        body{
            background-image: url('https://wallpapercave.com/wp/FcF2xMV.jpg');
            background-repeat: no-repeat;
            background-size: cover;
        }
    </style>
    </head>
    <body>
        <form action="/viewDeposit">
        <table align="center">
            <tr>
                <td></td>
            </tr>
            <tr>
                <td><img width="150px" src="https://th.bing.com/th/id/OIP.pUPPDffnhlI2U8AeUF7NoAHaE6?pid=ImgDet&rs=1"></td>
                <td><h2 style="text-align: center; color: aliceblue;">SDFC BANK</h2>
                <h4 style="color: aliceblue;">EXTRAORDINARY SERVICES</h4>
                </td>              
            </tr>
        
        </table><br><br>
        <div>
            <a href="/">Home</a>&nbsp;&nbsp;
            <a href="/newAccount">New Account</a>&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/balance1">Balance</a>&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/deposit1">Deposit</a>&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/withdraw1">Withdraw</a>&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/transfer1">Transfer</a>&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="closeAccount1">Close A/C</a>&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="/about">About</a>
        </div>
        <br><br>
        <center>
            <h2>DEPOSIT FORM</h2>
        <fieldset style="width: 35%;  background:linear-gradient(60deg,rgb(225, 224, 222),rgb(48, 142, 173),white);">
            <table class="c1" align="center">
                <tr>
                    <td>Account Number :</td>
                    <td><input type="number" name="acc_no" required></td>
                </tr>
                <tr>
                    <td>Name :</td>
                    <td><input type="text" name="name" required></td>
                </tr>
                <tr>
                    <td>Password :</td>
                    <td><input type="password" name="psw" required></td>
                </tr>
                <tr>
                    <td>Amount :</td>
                    <td><input type="number" name="amt" required></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"></td>
                    <td align="center"><input type="submit" value="Clear"></td>
                </tr>
            </table>
        </fieldset>
    </center>
</form>
    </body>
</html>