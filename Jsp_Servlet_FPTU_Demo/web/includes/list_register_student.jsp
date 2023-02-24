<%-- 
    Document   : list_register_student
    Created on : 21-02-2023, 10:45:38
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th class="name">Tên</th>
                    <th>Giới tính</th>
                    <th>Ngày sinh</th>
                    <th>Quốc tịch</th>
                    <th>Địa chỉ</th>
                    <th>Điện thoại</th>
                    <th>Ngành học</th>
                    <th>Ảnh</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${list}" var="i">
                    <tr>
                        <td>${i.getId()}</td>
                        <td class="name">${i.getTen()}</td>
                        <td>${i.isGioiTinh()?"Nam":"Nữ"}</td>
                        <td>${i.getNgaySinh()}</td>
                        <td>${i.getQuocTich()}</td>
                        <td>${i.getDiaChi()}</td>
                        <td>${i.getDienThoai()}</td>
                        <td>${i.getNganhHoc()}</td>
                        <td><img style="width: 50px" src="images/student/${i.getId()}.jpg" alt="sai anh"></td>

                    </tr>

                </c:forEach>


            </tbody>
        </table>
        <style>
            tr{
                display: flex;
                align-items: center;
                justify-content: space-around;
                text-align: left;
            }
            td,th{
                width: 100px;
            }
            .name{
                width: 150px;
                text-align: left;
            }
        </style>
    </body>
</html>
