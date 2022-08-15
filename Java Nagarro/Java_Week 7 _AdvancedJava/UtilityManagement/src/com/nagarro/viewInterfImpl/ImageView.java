package com.nagarro.viewInterfImpl;

import org.hibernate.Query;
import org.hibernate.Session;

import com.nagarro.logic.HibernateLogic;
import com.nagarro.model.Image;
import com.nagarro.viewInterf.ImageViewInteface;

public class ImageView implements ImageViewInteface {

	Session session=HibernateLogic.sf.openSession();

	public void addImage(Image img)
	{
		try
		{
			session.getTransaction().begin();
			session.save(img);
			session.getTransaction().commit();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void editImage(Image img, int sno)
	{
		try
		{
			session.getTransaction().begin();
			Image image = session.get(Image.class, sno);
			image.setImage(img.getImage());
			image.setTitle(img.getTitle());
			image.setQuantity(img.getQuantity());
			image.setSize(img.getSize());
			System.out.print(img.getSize());
			session.update(image);
			session.getTransaction().commit();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public boolean deleteImage(int sno)
	{
		boolean res = false;
		try
		{
			session.beginTransaction();
			Image img = session.get(Image.class, sno);
			session.delete(img);
			res=true;
			session.getTransaction().commit();

		}catch(Exception e)
		{
			System.out.println(e);
		}
		return res;
	}

	public Image getImage(int sno)
	{
		Image img=null;
		try
		{
			session.getTransaction().begin();
			String query = "from Image where serialno = :sno";
			Query q = session.createQuery(query);
			q.setParameter("sno", sno);
			Object qResult = q.uniqueResult();
			img=(Image)qResult;			
			session.getTransaction().commit();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return img;
	}

}
