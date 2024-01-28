<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <style>
            body{
            background-image: url('https://th.bing.com/th/id/R.9abf46cae8ed2729b3f0e18f0962d250?rik=KbQWqr4p4a7rEw&riu=http%3a%2f%2fwww.pixelstalk.net%2fwp-content%2fuploads%2f2016%2f03%2fLights-on-the-wall-digital-art-HD-wallpaper.jpg&ehk=jqQYO6HgmBAXSWMStugUNoO0qjsm%2b3yME4bH4DjLGFI%3d&risl=&pid=ImgRaw&r=0');
            background-repeat: no-repeat;
            background-size: cover;
        }
        div{
            background: linear-gradient(rgb(205, 213, 216));
            text-align: center;
            margin-top: 15%;
            margin-left: 35%;
            text-decoration:solid;
            
        }
        table{
            width: 40%;
            height: 20%;
            text-align: center;
            margin-top: 20%;
        }
        h3{
            margin-top: 10%;
        }
        .c1{
            color: rgb(239, 226, 44);
            margin-left: 45%;
        }
        </style>
    </head>
    <body>
        <div>
        <table border="1" style="color: aliceblue;">
            <tr>
                <td><h3>Account No :</h3></td>
                <td><h3>${bank.acc_no}</h3></td>
            </tr>
            <tr>
                <td><h3>Account Name :</h3></td>
                <td><h3>${bank.name}</h3></td>
            </tr>
            <tr>
                <td><h3>Balance :</h3></td>
                <td><h3>${bank.amt}</h3></td>
            </tr>
        </table>
    </div><br><br>
    <a href="/" class="c1">Home</a>
    </body>
</html>