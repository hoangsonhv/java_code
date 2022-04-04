<%@ page import="java.util.List" %>
<%@ page import="com.example.demo_web.entity.Student" %>
<%
    List<Student> list = (List<Student>)request.getAttribute("studentList");
%>
<!DOCTYPE html>
<html>
    <title>List Student</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

<div class="w3-container">
    <h2 style="text-align: center">List Student</h2>

    <table class="w3-table-all">
        <thead>
        <tr class="w3-light-grey">
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
        </tr>
        </thead>
        <tbody>
            <%
                for (int i = 0; i < list.size(); i++) {
                    Student st = list.get(i);
            %>
            <tr>
                <td><%=st.getId()%></td>
                <td><%=st.getName()%></td>
                <td><%=st.getEmail()%></td>
                <td><%=st.getAddress()%></td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
</div>

</body>
</html>
