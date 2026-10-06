package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pleousu extends GXProcedure
{
   public pleousu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pleousu.class ), "" );
   }

   public pleousu( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 )
   {
      pleousu.this.aP1 = new String[] {""};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 )
   {
      pleousu.this.A942TermCod = aP0[0];
      this.aP0 = aP0;
      pleousu.this.AV15Usuario = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P027F2 */
      pr_default.execute(0, new Object[] {A942TermCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1189TermUsu = P027F2_A1189TermUsu[0] ;
         n1189TermUsu = P027F2_n1189TermUsu[0] ;
         AV15Usuario = A1189TermUsu ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pleousu.this.A942TermCod;
      this.aP1[0] = pleousu.this.AV15Usuario;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P027F2_A942TermCod = new String[] {""} ;
      P027F2_A1189TermUsu = new String[] {""} ;
      P027F2_n1189TermUsu = new boolean[] {false} ;
      A1189TermUsu = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pleousu__default(),
         new Object[] {
             new Object[] {
            P027F2_A942TermCod, P027F2_A1189TermUsu, P027F2_n1189TermUsu
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A942TermCod ;
   private String AV15Usuario ;
   private String scmdbuf ;
   private String A1189TermUsu ;
   private boolean n1189TermUsu ;
   private String[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P027F2_A942TermCod ;
   private String[] P027F2_A1189TermUsu ;
   private boolean[] P027F2_n1189TermUsu ;
}

final  class pleousu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P027F2", "SELECT TermCod, TermUsu FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 10);
               return;
      }
   }

}

