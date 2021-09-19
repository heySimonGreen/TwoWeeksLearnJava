package tools;

import java.io.IOException;

/**
 * @author: chenwei
 * @date: 2021/9/10 1:35
 * @description: 描述
 */
public class CmdTest {
  public static void main(String[] args) {
    //
      String [] cmd={"cmd","/C","start copy exe1 exe2"};
      try {
          Process proc =Runtime.getRuntime().exec(cmd);
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}
