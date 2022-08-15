package com.nagarro.viewInterf;

import com.nagarro.model.Image;

public interface ImageViewInteface {

	void addImage(Image img);
	void editImage(Image img, int sno);
	boolean deleteImage(int sno);
	Image getImage(int sno);

}
