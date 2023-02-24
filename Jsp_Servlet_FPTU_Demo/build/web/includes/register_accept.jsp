<%-- 
    Document   : register_accept
    Created on : 17-02-2023, 09:32:51
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h2>Xác nhận thông tin đăng kí của bạn</h2>

<jsp:useBean id="User" class="Model.User" >
    <jsp:setProperty name="User" property="id" ></jsp:setProperty>
    <jsp:setProperty name="User" property="ten" ></jsp:setProperty>
    <jsp:setProperty name="User" property="gioiTinh" ></jsp:setProperty>
    <jsp:setProperty name="User" property="ngaySinh" ></jsp:setProperty>
    <jsp:setProperty name="User" property="quocTich" ></jsp:setProperty>
    <jsp:setProperty name="User" property="diaChi" ></jsp:setProperty>
    <jsp:setProperty name="User" property="dienThoai" ></jsp:setProperty>
    <jsp:setProperty name="User" property="nganhHoc" ></jsp:setProperty>
        
</jsp:useBean>
    <table>
        <tr> <td>ID</td> <td></td> </tr>
        <tr> <td>Tên</td> <td></td> </tr>
        <tr> <td>Giới tính</td> <td></td> </tr>
        <tr> <td>Ngày sinh</td> <td></td> </tr>
        <tr> <td>Quốc tịch</td> <td></td> </tr>
        <tr> <td>Địa chỉ</td> <td></td> </tr>
        <tr> <td>Điện thoại</td> <td></td> </tr>
        <tr> <td>Ngành học</td> <td></td> </tr>
   
        
    </table>
