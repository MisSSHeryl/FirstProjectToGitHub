package tools;

import org.apache.commons.dbcp2.BasicDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JDBCUtils {

    private static BasicDataSource dataSource = new BasicDataSource();

    private static String driver = null;

    private static String url = null;

    private static String username = null;

    private static String password = null;

    private static void getProperties() {
        InputStream in = null;
        Properties properties = new Properties();
        try {
            in = JDBCUtils.class.getClassLoader().getResourceAsStream("database.properties");
            properties.load(in);
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("数据库连接失败");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static {
        getProperties();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
    }

    public static BasicDataSource getDataSource() {
        return dataSource;
    }

}
