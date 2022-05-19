package s4;
/*
 * 如何自定义异常类？
 * 1. 继承于现的异常结构：RuntimeException 、Exception
 * 2. 提供全局常量：serialVersionUID
 * 3. 提供重载的构造器
 *
 */
public class GenerateException extends RuntimeException {
    static final long serialVersionUID = -7034827190745766939L;
    public GenerateException(){
        super();
    }
    public GenerateException(String message){
        super(message);
    }
}
