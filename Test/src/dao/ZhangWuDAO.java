package dao;

import domain.ZhangWu;
import org.apache.commons.dbutils.QueryRunner;
import tools.JDBCUtils;

import java.sql.SQLException;

public class ZhangWuDAO {

    private QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());

    public int insert(ZhangWu z) {
        String sql = "insert into gjp_zhangwu " +
                "(flname, money, zhangHu, createtime, description) values (?, ?, ?, ?, ?)";
        Object[] params = {z.getFlname(), z.getMoney(), z.getZhangHu(), z.getCreatetime(), z.getDecription()};
        int rows = 0;
        try {
            rows = queryRunner.update(sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("插入失败");
        }
        return rows;
    }

}
