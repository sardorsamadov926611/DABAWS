package uz.daba.gateway.di.services;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import uz.daba.gateway.constants.ErrorEnum;
import uz.daba.gateway.di.services.interfaces.DaoService;
import uz.daba.gateway.models.DataList;
import uz.daba.gateway.utils.Utils;


import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

@SuppressWarnings("Duplicates")
public class DaoServiceImpl implements DaoService {

    @Inject
    SqlSessionFactory db;
    @Inject
    ResourceBundle rb;

    @Override
    public <T> T getOne(String sql, Map<String, Object> params) throws PersistenceException {
        if (StringUtils.isBlank(sql)) {
            throw new PersistenceException(ErrorEnum.DB_NOT_AVAILABLE.getMessage(rb));
        }
        try (SqlSession sqlSession = db.openSession()) {
            return sqlSession.selectOne(sql, params);
        }
    }

    @Override
    public <T> DataList<T> getList(String sqlCnt, String sql, Map<String, Object> params) throws PersistenceException {
        if (StringUtils.isBlank(sqlCnt) || StringUtils.isBlank(sql)) {
            throw new PersistenceException(ErrorEnum.DB_NOT_AVAILABLE.getMessage(rb));
        }
        try (SqlSession sqlSession = db.openSession()) {
            DataList<T> dataList = new DataList<>();
            dataList.setTotal((Integer) sqlSession.selectOne(sqlCnt, params));
            if (dataList.getTotal() > 0) {
                dataList.setRows((List<T>) sqlSession.selectList(sql, params, Utils.parseRowBounds(params)));
            } else {
                dataList.setRows((List<T>) new ArrayList<>());
            }
            return dataList;
        }
    }

    @Override
    public <T> DataList<T> getListAll(String sql, Map<String, Object> params) throws PersistenceException {
        if (StringUtils.isBlank(sql)) {
            throw new PersistenceException(ErrorEnum.DB_NOT_AVAILABLE.getMessage(rb));
        }
        try (SqlSession sqlSession = db.openSession()) {
            DataList<T> dataList = new DataList<>();
            dataList.setRows((List<T>) sqlSession.selectList(sql, params));
            dataList.setTotal(dataList.getRows().size());
            return dataList;
        }
    }

    @Override
    public <T> int insert(String sqlInsert, T obj) throws PersistenceException {
        if (StringUtils.isBlank(sqlInsert)) {
            throw new PersistenceException(ErrorEnum.DB_NOT_AVAILABLE.getMessage(rb));
        }
        try (SqlSession sqlSession = db.openSession()) {
            return sqlSession.update(sqlInsert, obj);
        }
    }

    @Override
    public <T> int update(String sqlUpdate, T obj) throws PersistenceException {
        if (StringUtils.isBlank(sqlUpdate)) {
            throw new PersistenceException(ErrorEnum.DB_NOT_AVAILABLE.getMessage(rb));
        }
        try (SqlSession sqlSession = db.openSession()) {
            return sqlSession.update(sqlUpdate, obj);
        }
    }

    @Override
    public <T> int delete(String sqlDelete, T obj) throws PersistenceException {
        if (StringUtils.isBlank(sqlDelete)) {
            throw new PersistenceException(ErrorEnum.DB_NOT_AVAILABLE.getMessage(rb));
        }
        try (SqlSession sqlSession = db.openSession()) {
            return sqlSession.update(sqlDelete, obj);
        }
    }

    @Override
    public Map<String, Object> procedure(String sql, Map<String, Object> map) throws PersistenceException {
        if (StringUtils.isBlank(sql)) {
            throw new PersistenceException(ErrorEnum.DB_NOT_AVAILABLE.getMessage(rb));
        }
        try (SqlSession sqlSession = db.openSession()) {
            sqlSession.update(sql, map);
            return map;
        }
    }
}
