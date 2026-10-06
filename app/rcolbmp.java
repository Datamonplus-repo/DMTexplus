package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rcolbmp extends GXProcedure
{
   public rcolbmp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rcolbmp.class ), "" );
   }

   public rcolbmp( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      rcolbmp.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      rcolbmp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rcolbmp.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      rcolbmp.this.A2141SerEst = aP2[0];
      this.aP2 = aP2;
      rcolbmp.this.A1013DibCli = aP3[0];
      this.aP3 = aP3;
      rcolbmp.this.A1014DibInt = aP4[0];
      this.aP4 = aP4;
      rcolbmp.this.A2074ColCom = aP5[0];
      this.aP5 = aP5;
      rcolbmp.this.A2078ColFon = aP6[0];
      this.aP6 = aP6;
      rcolbmp.this.AV8ColBmp = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11GXLvl1 = (byte)(0) ;
      /* Using cursor P078L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7028ColBmp = P078L2_A7028ColBmp[0] ;
         n7028ColBmp = P078L2_n7028ColBmp[0] ;
         AV11GXLvl1 = (byte)(1) ;
         AV8ColBmp = GXutil.trim( A7028ColBmp) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV11GXLvl1 == 0 )
      {
         AV8ColBmp = "" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = rcolbmp.this.A396EmprCod;
      this.aP1[0] = rcolbmp.this.A252CliCod;
      this.aP2[0] = rcolbmp.this.A2141SerEst;
      this.aP3[0] = rcolbmp.this.A1013DibCli;
      this.aP4[0] = rcolbmp.this.A1014DibInt;
      this.aP5[0] = rcolbmp.this.A2074ColCom;
      this.aP6[0] = rcolbmp.this.A2078ColFon;
      this.aP7[0] = rcolbmp.this.AV8ColBmp;
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
      P078L2_A396EmprCod = new String[] {""} ;
      P078L2_A252CliCod = new int[1] ;
      P078L2_A2141SerEst = new String[] {""} ;
      P078L2_A1013DibCli = new String[] {""} ;
      P078L2_A1014DibInt = new int[1] ;
      P078L2_A2074ColCom = new String[] {""} ;
      P078L2_A2078ColFon = new String[] {""} ;
      P078L2_A7028ColBmp = new String[] {""} ;
      P078L2_n7028ColBmp = new boolean[] {false} ;
      A7028ColBmp = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rcolbmp__default(),
         new Object[] {
             new Object[] {
            P078L2_A396EmprCod, P078L2_A252CliCod, P078L2_A2141SerEst, P078L2_A1013DibCli, P078L2_A1014DibInt, P078L2_A2074ColCom, P078L2_A2078ColFon, P078L2_A7028ColBmp, P078L2_n7028ColBmp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11GXLvl1 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String AV8ColBmp ;
   private String scmdbuf ;
   private String A7028ColBmp ;
   private boolean n7028ColBmp ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P078L2_A396EmprCod ;
   private int[] P078L2_A252CliCod ;
   private String[] P078L2_A2141SerEst ;
   private String[] P078L2_A1013DibCli ;
   private int[] P078L2_A1014DibInt ;
   private String[] P078L2_A2074ColCom ;
   private String[] P078L2_A2078ColFon ;
   private String[] P078L2_A7028ColBmp ;
   private boolean[] P078L2_n7028ColBmp ;
}

final  class rcolbmp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P078L2", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ColBmp FROM TXPCFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 128);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
      }
   }

}

