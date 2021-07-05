package file;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author liyi
 * @create 2021 -06 -29 -11:20
 */
public class CreateDirs {  // 多层级建立文件、文件夹  & 删除
    public static void main(String[] args) throws IOException {
        File file = new File("E:/a/b/c/d/a.txt");
        if(file.exists()){
            // 存在就删除【工具类：commons.io.FileUtils】
            FileUtils.deleteDirectory(new File("E:/a"));
        }else{
            // 不存在就创建
            file.mkdirs();
        }


    }


}
