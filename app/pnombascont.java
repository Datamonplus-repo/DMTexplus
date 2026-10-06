package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnombascont extends GXProcedure
{
   public pnombascont( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnombascont.class ), "" );
   }

   public pnombascont( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pnombascont.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pnombascont.this.AV10Station = aP0[0];
      this.aP0 = aP0;
      pnombascont.this.AV8Met = aP1[0];
      this.aP1 = aP1;
      pnombascont.this.AV9MetP = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Met = " " ;
      AV9MetP = " " ;
      /* Using cursor P04O42 */
      pr_default.execute(0, new Object[] {AV10Station});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A942TermCod = P04O42_A942TermCod[0] ;
         A1445ImpCod5 = P04O42_A1445ImpCod5[0] ;
         n1445ImpCod5 = P04O42_n1445ImpCod5[0] ;
         A1444ImpCod4 = P04O42_A1444ImpCod4[0] ;
         n1444ImpCod4 = P04O42_n1444ImpCod4[0] ;
         AV8Met = GXutil.trim( A1445ImpCod5) ;
         AV9MetP = GXutil.trim( A1444ImpCod4) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnombascont.this.AV10Station;
      this.aP1[0] = pnombascont.this.AV8Met;
      this.aP2[0] = pnombascont.this.AV9MetP;
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
      P04O42_A942TermCod = new String[] {""} ;
      P04O42_A1445ImpCod5 = new String[] {""} ;
      P04O42_n1445ImpCod5 = new boolean[] {false} ;
      P04O42_A1444ImpCod4 = new String[] {""} ;
      P04O42_n1444ImpCod4 = new boolean[] {false} ;
      A942TermCod = "" ;
      A1445ImpCod5 = "" ;
      A1444ImpCod4 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnombascont__default(),
         new Object[] {
             new Object[] {
            P04O42_A942TermCod, P04O42_A1445ImpCod5, P04O42_n1445ImpCod5, P04O42_A1444ImpCod4, P04O42_n1444ImpCod4
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV10Station ;
   private String AV8Met ;
   private String AV9MetP ;
   private String scmdbuf ;
   private String A942TermCod ;
   private String A1445ImpCod5 ;
   private String A1444ImpCod4 ;
   private boolean n1445ImpCod5 ;
   private boolean n1444ImpCod4 ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P04O42_A942TermCod ;
   private String[] P04O42_A1445ImpCod5 ;
   private boolean[] P04O42_n1445ImpCod5 ;
   private String[] P04O42_A1444ImpCod4 ;
   private boolean[] P04O42_n1444ImpCod4 ;
}

final  class pnombascont__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04O42", "SELECT TermCod, ImpCod5, ImpCod4 FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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

