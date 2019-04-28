package online.cangjie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.cangjie.interfaces.dao.CompositionDao;
import online.cangjie.interfaces.service.CompositionService;
import online.cangjie.po.CompositionPo;
@Service("compositionService")
public class CompositionServiceImpl implements CompositionService {
	@Autowired
	private CompositionDao compostitionDao;
	
	@Override
	public boolean save(CompositionPo composition) {
		// TODO Auto-generated method stub
		return compostitionDao.insertComposition(composition);
	}
	
}
