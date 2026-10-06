package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuimpu extends GXProcedure
{
   public pbuimpu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuimpu.class ), "" );
   }

   public pbuimpu( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pbuimpu.this.aP2 = new String[] {""};
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
      pbuimpu.this.A942TermCod = aP0[0];
      this.aP0 = aP0;
      pbuimpu.this.AV17ImpUsu = aP1[0];
      this.aP1 = aP1;
      pbuimpu.this.AV18LptUsu = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00PC2 */
      pr_default.execute(0, new Object[] {A942TermCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1441ImpCod1 = P00PC2_A1441ImpCod1[0] ;
         n1441ImpCod1 = P00PC2_n1441ImpCod1[0] ;
         A1446ImpLpt1 = P00PC2_A1446ImpLpt1[0] ;
         n1446ImpLpt1 = P00PC2_n1446ImpLpt1[0] ;
         AV17ImpUsu = A1441ImpCod1 ;
         AV18LptUsu = A1446ImpLpt1 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuimpu.this.A942TermCod;
      this.aP1[0] = pbuimpu.this.AV17ImpUsu;
      this.aP2[0] = pbuimpu.this.AV18LptUsu;
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
      P00PC2_A942TermCod = new String[] {""} ;
      P00PC2_A1441ImpCod1 = new String[] {""} ;
      P00PC2_n1441ImpCod1 = new boolean[] {false} ;
      P00PC2_A1446ImpLpt1 = new String[] {""} ;
      P00PC2_n1446ImpLpt1 = new boolean[] {false} ;
      A1441ImpCod1 = "" ;
      A1446ImpLpt1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuimpu__default(),
         new Object[] {
             new Object[] {
            P00PC2_A942TermCod, P00PC2_A1441ImpCod1, P00PC2_n1441ImpCod1, P00PC2_A1446ImpLpt1, P00PC2_n1446ImpLpt1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String A942TermCod ;
   private String AV17ImpUsu ;
   private String AV18LptUsu ;
   private String scmdbuf ;
   private String A1441ImpCod1 ;
   private String A1446ImpLpt1 ;
   private boolean n1441ImpCod1 ;
   private boolean n1446ImpLpt1 ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00PC2_A942TermCod ;
   private String[] P00PC2_A1441ImpCod1 ;
   private boolean[] P00PC2_n1441ImpCod1 ;
   private String[] P00PC2_A1446ImpLpt1 ;
   private boolean[] P00PC2_n1446ImpLpt1 ;
}

final  class pbuimpu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00PC2", "SELECT TermCod, ImpCod1, ImpLpt1 FROM TXPTERMIN WHERE TermCod = ? ORDER BY TermCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

