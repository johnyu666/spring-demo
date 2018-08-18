package dao;

import org.springframework.jdbc.core.JdbcTemplate;

import pojo.Customer;

public class CustomerDaoImpl implements CustomerDao{
	private JdbcTemplate template;
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int addCustomer(Customer c) {
		String sql="insert into customer (id,cname) values (?,?)";
		int rs=template.update(sql,new Object[] {c.getId(),c.getCname()});
		return rs;
	}

}
