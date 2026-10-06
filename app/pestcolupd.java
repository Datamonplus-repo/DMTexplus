package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestcolupd extends GXProcedure
{
   public pestcolupd( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestcolupd.class ), "" );
   }

   public pestcolupd( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pestcolupd.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pestcolupd.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestcolupd.this.AV8CliCod = aP1[0];
      this.aP1 = aP1;
      pestcolupd.this.A4415EstCol = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(DecimalUtil.decToDouble(AV9Artextil)) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int2) ;
      pestcolupd.this.GXt_int1 = GXv_int2[0] ;
      AV9Artextil = DecimalUtil.doubleToDec(GXt_int1) ;
      if ( AV9Artextil.doubleValue() == 1 )
      {
         /* Using cursor P02Q32 */
         pr_default.execute(0, new Object[] {A396EmprCod, A4415EstCol});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A4420MolCol = P02Q32_A4420MolCol[0] ;
            n4420MolCol = P02Q32_n4420MolCol[0] ;
            A2098MolCod = P02Q32_A2098MolCod[0] ;
            A2078ColFon = P02Q32_A2078ColFon[0] ;
            A2074ColCom = P02Q32_A2074ColCom[0] ;
            A1014DibInt = P02Q32_A1014DibInt[0] ;
            A1013DibCli = P02Q32_A1013DibCli[0] ;
            A2141SerEst = P02Q32_A2141SerEst[0] ;
            A252CliCod = P02Q32_A252CliCod[0] ;
            Gx_msg = httpContext.getMessage( "Actualizando : Cli ", "") + GXutil.trim( GXutil.str( A252CliCod, 10, 0)) + httpContext.getMessage( ", Art ", "") + GXutil.trim( A2141SerEst) + httpContext.getMessage( ", Dib ", "") + GXutil.trim( A1013DibCli) + "/" + GXutil.trim( GXutil.str( A1014DibInt, 10, 0)) + httpContext.getMessage( ", Com ", "") + GXutil.trim( A2074ColCom) + httpContext.getMessage( ", Fon ", "") + GXutil.trim( A2078ColFon) + httpContext.getMessage( ", Mol ", "") + GXutil.trim( GXutil.str( A2098MolCod, 10, 0)) + httpContext.getMessage( ", Col ", "") + GXutil.trim( A4420MolCol) ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A2141SerEst ;
            GXv_char6[0] = A1013DibCli ;
            GXv_int7[0] = A1014DibInt ;
            GXv_char8[0] = A2074ColCom ;
            GXv_char9[0] = A2078ColFon ;
            GXv_int2[0] = A2098MolCod ;
            GXv_char10[0] = A4420MolCol ;
            GXv_int11[0] = (short)(0) ;
            new app.pestcol(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6, GXv_int7, GXv_char8, GXv_char9, GXv_int2, GXv_char10, GXv_int11) ;
            pestcolupd.this.A396EmprCod = GXv_char3[0] ;
            pestcolupd.this.A252CliCod = GXv_int4[0] ;
            pestcolupd.this.A2141SerEst = GXv_char5[0] ;
            pestcolupd.this.A1013DibCli = GXv_char6[0] ;
            pestcolupd.this.A1014DibInt = GXv_int7[0] ;
            pestcolupd.this.A2074ColCom = GXv_char8[0] ;
            pestcolupd.this.A2078ColFon = GXv_char9[0] ;
            pestcolupd.this.A2098MolCod = GXv_int2[0] ;
            pestcolupd.this.A4420MolCol = GXv_char10[0] ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else
      {
         /* Using cursor P02Q33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), A4415EstCol});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4420MolCol = P02Q33_A4420MolCol[0] ;
            n4420MolCol = P02Q33_n4420MolCol[0] ;
            A252CliCod = P02Q33_A252CliCod[0] ;
            A2141SerEst = P02Q33_A2141SerEst[0] ;
            A1013DibCli = P02Q33_A1013DibCli[0] ;
            A1014DibInt = P02Q33_A1014DibInt[0] ;
            A2074ColCom = P02Q33_A2074ColCom[0] ;
            A2078ColFon = P02Q33_A2078ColFon[0] ;
            A2098MolCod = P02Q33_A2098MolCod[0] ;
            GXv_char10[0] = A396EmprCod ;
            GXv_int7[0] = A252CliCod ;
            GXv_char9[0] = A2141SerEst ;
            GXv_char8[0] = A1013DibCli ;
            GXv_int4[0] = A1014DibInt ;
            GXv_char6[0] = A2074ColCom ;
            GXv_char5[0] = A2078ColFon ;
            GXv_int2[0] = A2098MolCod ;
            GXv_char3[0] = A4420MolCol ;
            GXv_int11[0] = (short)(0) ;
            new app.pestcol(remoteHandle, context).execute( GXv_char10, GXv_int7, GXv_char9, GXv_char8, GXv_int4, GXv_char6, GXv_char5, GXv_int2, GXv_char3, GXv_int11) ;
            pestcolupd.this.A396EmprCod = GXv_char10[0] ;
            pestcolupd.this.A252CliCod = GXv_int7[0] ;
            pestcolupd.this.A2141SerEst = GXv_char9[0] ;
            pestcolupd.this.A1013DibCli = GXv_char8[0] ;
            pestcolupd.this.A1014DibInt = GXv_int4[0] ;
            pestcolupd.this.A2074ColCom = GXv_char6[0] ;
            pestcolupd.this.A2078ColFon = GXv_char5[0] ;
            pestcolupd.this.A2098MolCod = GXv_int2[0] ;
            pestcolupd.this.A4420MolCol = GXv_char3[0] ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestcolupd.this.A396EmprCod;
      this.aP1[0] = pestcolupd.this.AV8CliCod;
      this.aP2[0] = pestcolupd.this.A4415EstCol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Artextil = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02Q32_A396EmprCod = new String[] {""} ;
      P02Q32_A4420MolCol = new String[] {""} ;
      P02Q32_n4420MolCol = new boolean[] {false} ;
      P02Q32_A2098MolCod = new byte[1] ;
      P02Q32_A2078ColFon = new String[] {""} ;
      P02Q32_A2074ColCom = new String[] {""} ;
      P02Q32_A1014DibInt = new int[1] ;
      P02Q32_A1013DibCli = new String[] {""} ;
      P02Q32_A2141SerEst = new String[] {""} ;
      P02Q32_A252CliCod = new int[1] ;
      A4420MolCol = "" ;
      A2078ColFon = "" ;
      A2074ColCom = "" ;
      A1013DibCli = "" ;
      A2141SerEst = "" ;
      Gx_msg = "" ;
      P02Q33_A396EmprCod = new String[] {""} ;
      P02Q33_A4420MolCol = new String[] {""} ;
      P02Q33_n4420MolCol = new boolean[] {false} ;
      P02Q33_A252CliCod = new int[1] ;
      P02Q33_A2141SerEst = new String[] {""} ;
      P02Q33_A1013DibCli = new String[] {""} ;
      P02Q33_A1014DibInt = new int[1] ;
      P02Q33_A2074ColCom = new String[] {""} ;
      P02Q33_A2078ColFon = new String[] {""} ;
      P02Q33_A2098MolCod = new byte[1] ;
      GXv_char10 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char9 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int11 = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pestcolupd__default(),
         new Object[] {
             new Object[] {
            P02Q32_A396EmprCod, P02Q32_A4420MolCol, P02Q32_n4420MolCol, P02Q32_A2098MolCod, P02Q32_A2078ColFon, P02Q32_A2074ColCom, P02Q32_A1014DibInt, P02Q32_A1013DibCli, P02Q32_A2141SerEst, P02Q32_A252CliCod
            }
            , new Object[] {
            P02Q33_A396EmprCod, P02Q33_A4420MolCol, P02Q33_n4420MolCol, P02Q33_A252CliCod, P02Q33_A2141SerEst, P02Q33_A1013DibCli, P02Q33_A1014DibInt, P02Q33_A2074ColCom, P02Q33_A2078ColFon, P02Q33_A2098MolCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte A2098MolCod ;
   private byte GXv_int2[] ;
   private short GXv_int11[] ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private int GXv_int7[] ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV9Artextil ;
   private String A396EmprCod ;
   private String A4415EstCol ;
   private String scmdbuf ;
   private String A4420MolCol ;
   private String A2078ColFon ;
   private String A2074ColCom ;
   private String A1013DibCli ;
   private String A2141SerEst ;
   private String Gx_msg ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private boolean n4420MolCol ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P02Q32_A396EmprCod ;
   private String[] P02Q32_A4420MolCol ;
   private boolean[] P02Q32_n4420MolCol ;
   private byte[] P02Q32_A2098MolCod ;
   private String[] P02Q32_A2078ColFon ;
   private String[] P02Q32_A2074ColCom ;
   private int[] P02Q32_A1014DibInt ;
   private String[] P02Q32_A1013DibCli ;
   private String[] P02Q32_A2141SerEst ;
   private int[] P02Q32_A252CliCod ;
   private String[] P02Q33_A396EmprCod ;
   private String[] P02Q33_A4420MolCol ;
   private boolean[] P02Q33_n4420MolCol ;
   private int[] P02Q33_A252CliCod ;
   private String[] P02Q33_A2141SerEst ;
   private String[] P02Q33_A1013DibCli ;
   private int[] P02Q33_A1014DibInt ;
   private String[] P02Q33_A2074ColCom ;
   private String[] P02Q33_A2078ColFon ;
   private byte[] P02Q33_A2098MolCod ;
}

final  class pestcolupd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02Q32", "SELECT EmprCod, MolCol, MolCod, ColFon, ColCom, DibInt, DibCli, SerEst, CliCod FROM TXPMFORES WHERE (EmprCod = ?) AND (MolCol = ?) ORDER BY EmprCod, CliCod, MolCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02Q33", "SELECT EmprCod, MolCol, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and MolCol = ? ORDER BY EmprCod, CliCod, MolCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 12);
               ((String[]) buf[5])[0] = rslt.getString(5, 12);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
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
               stmt.setString(2, (String)parms[1], 20);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 20);
               return;
      }
   }

}

