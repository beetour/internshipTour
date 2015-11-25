package com.internshipTour.util.common;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Test {

	public static void main(String[] args) {
		  SimpleEmail email = new SimpleEmail();//如果发送普通的邮件，使用这个类就可以了  
	       // MultiPartEmail email = new MultiPartEmail();//如果要发送带附件的邮件，需使用这个类  
//	      HtmlEmail email = new HtmlEmail();//可以发送html类型的邮件  
	          
	        email.setHostName("smtp.qq.com");//指定要使用的邮件服务器  
	        email.setAuthentication("413440590@qq.com", "Ludexiang123ldd");//使用163的邮件服务器需提供在163已注册的用户名、密码  
	        email.setCharset("UTF-8"); 
	        email.setSmtpPort(25);
	        try {  
	            email.setFrom("413440590@qq.com");//设置发件人  
	            email.addTo("xander@internshiptour.com");//设置收件人  
	            email.setSubject("测试邮件");//设置主题  
	            email.setMsg("测试邮件测试邮件测试邮件");//设置邮件内容  
	              
	              
//	            File file = new File("C:\\testEmail.txt");//要发送的附件  
//	              
//	            EmailAttachment attachment = new EmailAttachment();  
//	            attachment.setPath(file.getPath());  
//	            attachment.setName(file.getName());  
//	            attachment.setDescription("附件描述");  
//	            attachment.setDisposition(EmailAttachment.ATTACHMENT);//附件的类型  
//	            email.attach(attachment);  
	              
	            email.send();  
	            System.out.println("发送成功");  
	        } catch (EmailException e) {  
	            e.printStackTrace();  
	        } 
	}
 
}
