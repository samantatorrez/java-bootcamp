package app;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class Template {
	protected DataSource dataSource;
	protected JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
}
