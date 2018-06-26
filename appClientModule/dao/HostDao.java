package dao;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.Host;


public class HostDao {


		
		private static Session session;

		private Transaction tx;
		
		private void iniciaOperacion() throws HibernateException {
			session = HibernateUtil.getSessionFactory().openSession();
			tx = session.beginTransaction();
		}

		private void manejaExcepcion(HibernateException he) throws HibernateException {
			tx.rollback();
			throw new HibernateException("ERROR en la capa de acceso a datos", he);
		}
		
		public int agregar(Host objeto){
			int id=0;
			try{
				iniciaOperacion();
				id=Integer.parseInt(session.save(objeto).toString());
				tx.commit();
			}catch (HibernateException he){
				manejaExcepcion(he);
				throw he;
			}finally{
				session.close();
			}
			return id;
		}
		
		
		
		public Host traerHost(int idHost) throws HibernateException {
			Host objeto = null;
			try {
				iniciaOperacion();
				String hql="from Host where idhost =:idHost";
				
				objeto=(Host) session.createQuery(hql).setParameter("idHost", (int)idHost).uniqueResult();
		
			}catch (HibernateException he) {
				manejaExcepcion(he);
				throw he;
			} finally {
					session.close();
					}
			return objeto;
			}
		
		

	}

