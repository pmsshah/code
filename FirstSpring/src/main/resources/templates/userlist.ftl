<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        table, td, th {
          border: 2px solid red;
          text-align: center;
        }
        table {
          width: 100%;
          color:blue;
          background-color:yellow;
          font-size: 25px;
        }
        th {
          height: 70px;
        }
        tr:hover {background-color: coral;}
    </style>
    <h1>Hello objects from MongoDb</h1>
</head>
<body>
<table>
  <tr>
    <th>From</th>
    <th>To</th>
    <th>Text</th>
  </tr>
    <#list users as user>
      <tr>
        <td>${user.from}</td>
        <td>${user.to}</td>
        <td>${user.text}</td>
      </tr>
    </#list>
</table>
</body>
</html>