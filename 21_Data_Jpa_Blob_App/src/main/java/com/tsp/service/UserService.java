package com.tsp.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.;
import org.springframework.stereotype.Service;

import com.tsp.entity.User;
import com.tsp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void saveUser() throws Exception
	{
		String imagePath = "C:\\Users\\hp\\Downloads\\springboot_workspace\\21_Data_Jpa_Blob_App\\image.png";
		
		User user = new User();
		user.setUserName("priya");
		user.setUserEmail("thellapu@gmail.com");
		userRepository.save(user);
		
		long size = Files.size(Paths.get(imagePath));
		byte[] arr = new byte[(int) size];
		FileInputStream fis = new FileInputStream(new File(imagePath));
		fis.read(arr);
		fis.close();
		user.setUserImage(arr);
		userRepository.save(user);
	}
	
	public void retrieveImageAndWriteToFile() throws IOException {
        // Assume you have the user ID for which you want to retrieve the image
//        Long userId = 1L;
//
//        // Retrieve the user from the database
//        User user = userRepository.findById(userId).orElse(null);
//
//        if (user != null && user.getUserImage() != null) {
//            // Specify the path where you want to save the image file
//            String outputPath = "C:\\Users\\hp\\Downloads\\springboot_workspace\\output\\Image.png";
//
//            // Write the image data to the file using FileOutputStream
//            try (FileOutputStream fos = new FileOutputStream(outputPath)) {
//                fos.write(user.getUserImage());
//            }
//
//            System.out.println("Image retrieved and saved to: " + outputPath);
//        } else {
//            System.out.println("User or image not found.");
//        }
		
		Long userId = 1L;
		User user = userRepository.findById(userId).orElse(null);
		if(user != null && user.getUserImage()!= null)
		{
			String outputPath = "C:\\Users\\hp\\Downloads\\springboot_workspace\\output\\Image.png";
			try(FileOutputStream fos = new FileOutputStream(outputPath))
			{
				fos.write(user.getUserImage());
				
			}
			System.out.println("Image retrieved and saved to :"+outputPath);
			
		}
		else
		{
			System.out.println("User or image not found");
		}
		
    }
	

	

}
