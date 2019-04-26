package online.cangjie.interfaces.service;

import cn.itcast.common.page.Pagination;

public interface LogService {
	public Pagination toPagination(String name, Integer isDisplay, Integer pageNo);
}
