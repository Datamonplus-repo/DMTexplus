package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc179 extends GXProcedure
{
   public pprc179( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc179.class ), "" );
   }

   public pprc179( int remoteHandle ,
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
      pprc179.this.aP7 = new String[] {""};
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
      pprc179.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc179.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pprc179.this.A2141SerEst = aP2[0];
      this.aP2 = aP2;
      pprc179.this.A1013DibCli = aP3[0];
      this.aP3 = aP3;
      pprc179.this.A1014DibInt = aP4[0];
      this.aP4 = aP4;
      pprc179.this.A2074ColCom = aP5[0];
      this.aP5 = aP5;
      pprc179.this.A2078ColFon = aP6[0];
      this.aP6 = aP6;
      pprc179.this.Gx_msg = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      AV5GXLvl2 = (byte)(0) ;
      /* Using cursor P05PT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV5GXLvl2 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV5GXLvl2 == 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion. NO existe la combinacion-Dibujo", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc179.this.A396EmprCod;
      this.aP1[0] = pprc179.this.A252CliCod;
      this.aP2[0] = pprc179.this.A2141SerEst;
      this.aP3[0] = pprc179.this.A1013DibCli;
      this.aP4[0] = pprc179.this.A1014DibInt;
      this.aP5[0] = pprc179.this.A2074ColCom;
      this.aP6[0] = pprc179.this.A2078ColFon;
      this.aP7[0] = pprc179.this.Gx_msg;
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
      P05PT2_A396EmprCod = new String[] {""} ;
      P05PT2_A252CliCod = new int[1] ;
      P05PT2_A2141SerEst = new String[] {""} ;
      P05PT2_A1013DibCli = new String[] {""} ;
      P05PT2_A1014DibInt = new int[1] ;
      P05PT2_A2074ColCom = new String[] {""} ;
      P05PT2_A2078ColFon = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc179__default(),
         new Object[] {
             new Object[] {
            P05PT2_A396EmprCod, P05PT2_A252CliCod, P05PT2_A2141SerEst, P05PT2_A1013DibCli, P05PT2_A1014DibInt, P05PT2_A2074ColCom, P05PT2_A2078ColFon
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV5GXLvl2 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P05PT2_A396EmprCod ;
   private int[] P05PT2_A252CliCod ;
   private String[] P05PT2_A2141SerEst ;
   private String[] P05PT2_A1013DibCli ;
   private int[] P05PT2_A1014DibInt ;
   private String[] P05PT2_A2074ColCom ;
   private String[] P05PT2_A2078ColFon ;
}

final  class pprc179__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05PT2", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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

