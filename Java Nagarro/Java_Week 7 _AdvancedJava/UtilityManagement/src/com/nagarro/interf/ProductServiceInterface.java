package com.nagarro.interf;

import com.nagarro.model.Image;

public interface ProductServiceInterface {

	void addImage(Image img);
	void editImage(Image img, int sno);
	boolean deleteImage(int sno);
	Image getImage(int sno);

}
