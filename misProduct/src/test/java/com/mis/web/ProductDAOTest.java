package com.mis.web;



import javax.inject.Inject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mis.domain.Criteria;
import com.mis.domain.ProductVO;
import com.mis.domain.SearchCriteria;
import com.mis.persistence.ProductDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class ProductDAOTest {
   
   
   @Inject
   private ProductDAO dao;
   
   private static Logger logger = LoggerFactory.getLogger(ProductDAOTest.class);
   
   
   
//   @Test
//   public void testCreate() throws Exception {
//      ProductVO vo = new ProductVO();
//      vo.setProdname("����ö");
//      vo.setPrice(1000000);
//      vo.setQuantity(1);
//      dao.create(vo);
//      logger.info("��� Ȯ��" + vo);
//   }
   

//   @Test
//   public void testlistAll() throws Exception {
//      dao.listAll();
//      logger.info("��ü ��ȸ Ȯ��");
//   }
//   
   
   @Test
   public void testUpdate() throws Exception {
      ProductVO vo = new ProductVO();
      vo.setProdcod(2);
      vo.setProdname("����ö3");
      vo.setPrice(1000000);
      vo.setQuantity(6);
      dao.update(vo);
      logger.info("���� Ȯ��" + vo);

   }

//   @Test
//   public void testRead() throws Exception {
//      dao.read(1);
//      logger.info("��ȸ ����");
//   }
//   
//   @Test
//   public void testDelete() throws Exception {
//      dao.delete(1);
//      logger.info("���� Ȯ��");
//   }
//   
//   @Test
//   public void testCriteria() throws Exception {
//      Criteria cri = new Criteria();
//      cri.setPage(1);
//      
//      List<ProductVO> list = dao.listCriteria(cri);
//      
//      for(ProductVO product : list) {
//         logger.info(product.getProdcod() + ":" + product.getProdname());
//      }
//   }

}