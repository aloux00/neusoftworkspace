package orz.doublexi.mvcbyxml.dao;

import orz.doublexi.mvcbyxml.projo.Account;

public interface  AccountDao {
	Account queryAccount(String username,String password);
}
