package com.nagarro.interfImpl;

import com.nagarro.interf.ProductServiceInterface;
import com.nagarro.model.Image;
import com.nagarro.viewInterf.ImageViewInteface;
import com.nagarro.viewInterfImpl.ImageView;

public class ProductService implements ProductServiceInterface {

	public void addImage(Image img) {
		ImageViewInteface ivi = new ImageView();
		ivi.addImage(img);
	}

	public void editImage(Image img, int sno) {
		ImageViewInteface ivi = new ImageView();
		ivi.editImage(img, sno);
	}

	public boolean deleteImage(int sno) {
		ImageViewInteface ivi = new ImageView();
		boolean res=ivi.deleteImage(sno);
		if(res) {
			return true;
		}
		else {
			return false;
		}
	}

	public Image getImage(int sno) {
		ImageViewInteface ivi = new ImageView();
		Image image=ivi.getImage(sno);
		return image;
	}

}
