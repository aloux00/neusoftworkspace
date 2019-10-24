package orz.doublexi.mvcbyxml.dao;

import java.util.List;

import orz.doublexi.mvcbyxml.projo.Account;
import orz.doublexi.mvcbyxml.projo.ShuQian;

public interface ShuqianDao {
void insertShuQian(ShuQian shuqian);
List<ShuQian> queryAll(int fenlei, int page, int limit);
int selectCount(int fenlei);

}
