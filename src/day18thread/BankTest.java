package day18thread;

import jdk.nashorn.internal.ir.BaseNode;

/**
 * @author: chenwei
 * @date: 2021/7/31 18:53
 * @description: 使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest {
  public static void main(String[] args) {
      Bank bank = Bank.getInstance();
  }
}

class Bank {
  private Bank() {}

  private static Bank instance = null;

  public static Bank getInstance() {
      //方式一：效率较低
//      synchronized (Bank.class) {
//          if (instance == null){
//              instance = new Bank();
//          }
//          return instance;
//      }

      //方式二：多了一个判断空，效率比一高
      if (instance == null) {
      synchronized (Bank.class) {
        if (instance == null) {
          instance = new Bank();
        }
      }
    }
    return instance;
  }
}
class Database{
    private Database(){}
    private static Database database = new Database();
    public static Database getInstance = database;
}
