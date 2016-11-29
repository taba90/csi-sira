/*
 * Created on 25 nov 2016 ( Time 10:35:38 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao;

import it.csi.sira.backend.metadata.integration.dto.SipraMtdTTestiHomePage;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;


import java.util.Date;


/**
 * SipraMtdTTestiHomePage DAO interface
 * 
 * @author Telosys Tools
 */
public interface SipraMtdTTestiHomePageDAO {

	//----------------------------------------------------------------------
	/**
	 * Finds a bean by its primary key 
	 * @param idTesto
	 * @return the bean found or null if not found 
	 */
	public SipraMtdTTestiHomePage findByPK(Integer idTesto);

	public List<SipraMtdTTestiHomePage> findAll();
	
	public List<SipraMtdTTestiHomePage> findByCriteria(java.util.Map<String, Object> params);
	public List<SipraMtdTTestiHomePage> findByCriteria(MapSqlParameterSource params);
	
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, Map<String, Object> params);
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, MapSqlParameterSource params);
	public List<SipraMtdTTestiHomePage> findByGenericCriteria(String query, MapSqlParameterSource params);
	
	public void insert(SipraMtdTTestiHomePage bean);

	public void update(SipraMtdTTestiHomePage bean);
	
	public void update(String sql, Map<String, Object> param);

	public int deleteByPK(Integer idTesto);
	
	public int delete(String query, Map<String, Object> params);
	public int delete(String query, MapSqlParameterSource params);

	public boolean exist(Map<String, Object> params);

    public RowMapper<SipraMtdTTestiHomePage> getRowMapper();
}
