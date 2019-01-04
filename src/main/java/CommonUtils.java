import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

public class CommonUtils {
    /**
     * 返回一个uuid
     * @return
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
    int mjy;
    /**
     * 创建一个bean，把数据封装到bean中返回
     * @param datas
     * @param clazz
     * @return
     */
    public static <T> T toBean(Map datas, Class<T> clazz) {
        /*
         * 依赖commons-beanutils
         */
        try {
            /*
             * 1. 通过clazz创建bean实例
             */
            T bean = clazz.newInstance();
            /*
             * 注册类型转换器，用来把字符串转换成Date类型
             */
            ConvertUtils.register(new DateConverter(), java.util.Date.class);
            /*
             * 2. 把datas封装到bean中
             */
            BeanUtils.populate(bean, datas);
            /*
             * 3. 返回bean
             */
            return bean;
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        HashMap<String,Integer> a = new HashMap<>();
        a.put("mjy",22);
        CommonUtils x = toBean(a,CommonUtils.class);
        System.out.println(x.mjy);
    }
}
