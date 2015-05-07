
import com.worden.db.*;

public class DBTest {
	public static void main( String[] arg) {
		
		
		MysqlUtils db = new MysqlUtils("root" , "123456" , "websearchdbs") ;
		
		System.out.println( " Mysql ==> "+db.QueryOneValue("configtable", "cvalue", "ckey='version'")) ;
		
		String[] rst = db.QueryOneField("configtable", "cvalue", "1=1");
		for(int i = 0 ; i<rst.length ; i++ )
		System.out.println( " Mysql 2 ==> "+rst[i]) ;
		
		
		/*
		OracleUtils dbo = new OracleUtils("192.168.181.13", "ora11g" , "secnet" , "secnet") ;
		System.out.println( " oracle ==> "+dbo.QueryCount("configtable", "1=1")) ;
		System.out.println( " oracle ==> "+dbo.QueryOneValue("configtable", "CValue", "CKey='Version'") );
		*/
		
		System.out.println( "Exec Over !") ;
		
	}
}
