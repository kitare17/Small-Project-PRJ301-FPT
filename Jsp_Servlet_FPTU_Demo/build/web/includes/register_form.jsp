<%-- 
    Document   : register.jsp
    Created on : 16-02-2023, 22:30:32
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section>
    <h2>
        Chào mừng tân sinh viên đến với Đại học FPT
    </h2>
    <h2 style="color: red;text-align: center ">${thongbao}</h2>
    <form action="register" method="post"   enctype="multipart/form-data">
        <table border="1">
        <thead>
                <tr>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Tên</td>
                    <td> <input type="text" name="ten" required=""> </td>
                    
                </tr>
                <tr>
                    <td>Giới tính</td>
                    <td>
                        <select name="gioiTinh" >
                            <option value="true">Nam</option>
                            <option value="false">Nữ</option>
                        </select>
                            
                        
                    </td>
                </tr>
                <tr>
                    <td>Ngày sinh</td>
                    <td><input type="date" name="ngaySinh" required=""></td>
                </tr>
                <tr>
                    <td>Quốc tịch</td>
                    <td><input type="text" name="quocTich" required=""></td>
                </tr>
                <tr>
                    <td>Địa chỉ</td>
                    <td><input type="text" name="diaChi" required=""></td>
                </tr>
                <tr>
                    <td>Điện thoại</td>
                    <td><input type="text" name="dienThoai" required=""></td>
                </tr>
                <tr>
                    <td>Ngành học</td>
                    <td>
                        <select name="nganhHoc" >
                            <option value="CNTT">CNTT</option>
                            <option value="Quản trị kinh doanh">Quản trị kinh doanh</option>
                            <option value="Ngôn ngữ Hàn">Ngôn ngữ Hàn</option>
                            <option value="Ngôn ngữ Anh">Ngôn ngữ Anh</option>
                            <option value="Đa cấp">Đa cấp</option>
                        </select>
                        
                    </td>
                </tr>
                <tr>
                    <td>Ảnh đính kèm</td>
                    <td> <input type="file" name="file" required=""> </td>
                </tr>
            </tbody>
            
        </table>
        <input type="submit" value="Đăng kí">
           
        

    </form>
        
    
    
</section>
