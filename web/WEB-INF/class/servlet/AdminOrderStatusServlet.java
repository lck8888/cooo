package servlet;

import service.GoodsService;
import service.OrderService;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Properties;
import javax.activation.DataHandler;
@WebServlet(name = "admin_order_status",urlPatterns = "/admin/order_status")
public class AdminOrderStatusServlet extends HttpServlet {
    private OrderService oService = new OrderService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int status = Integer.parseInt(request.getParameter("status"));
        oService.updateStatus(id, status);
        if(status == 3)
        {
        sendEmail1(oService.getmail(id),"您的商品已发货","订单已发货");
        }
        else if (status == 4)
        {
            sendEmail1(oService.getmail(id),"您的商品已完成","订单已完成");
        }
        response.sendRedirect("/admin/order_list?status="+status);
    }
    private void sendEmail1(String to, String subject, String messageText) {
        // SMTP 配置
        String host = "smtp.qq.com"; // SMTP 服务器地址
        final String username = "760409419@qq.com"; // 发送者邮箱
        final String password = "ntoxjdjozxsabfcj"; // 发送者邮箱密码

        // 配置邮件会话属性
        Properties properties = new Properties();

        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");


        // 创建邮件会话
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // 创建邮件对象
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username)); // 发送者邮箱
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to)); // 收件人邮箱
            message.setSubject(subject); // 邮件主题
            message.setText(messageText); // 邮件内容

            // 发送邮件
            Transport.send(message);
            System.out.println("邮件发送成功");

        } catch (MessagingException e) {
            e.printStackTrace(); // 打印错误信息
        }
    }

}




