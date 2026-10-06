package app.facturacion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tpromd_lineas_get extends GXProcedure
{
   public tpromd_lineas_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_lineas_get.class ), "" );
   }

   public tpromd_lineas_get( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            short aP2 ,
                            int aP3 ,
                            java.math.BigDecimal[] aP4 ,
                            java.math.BigDecimal[] aP5 ,
                            java.math.BigDecimal[] aP6 ,
                            java.math.BigDecimal[] aP7 ,
                            java.util.Date[] aP8 ,
                            String[] aP9 ,
                            int[] aP10 ,
                            java.math.BigDecimal[] aP11 ,
                            String[] aP12 )
   {
      tpromd_lineas_get.this.aP13 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        int aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.util.Date[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        String[] aP12 ,
                        short[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             int aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.util.Date[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             String[] aP12 ,
                             short[] aP13 )
   {
      tpromd_lineas_get.this.A396EmprCod = aP0;
      tpromd_lineas_get.this.A252CliCod = aP1;
      tpromd_lineas_get.this.A8391PMDCod = aP2;
      tpromd_lineas_get.this.AV8PMDColNum = aP3;
      tpromd_lineas_get.this.aP4 = aP4;
      tpromd_lineas_get.this.aP5 = aP5;
      tpromd_lineas_get.this.aP6 = aP6;
      tpromd_lineas_get.this.aP7 = aP7;
      tpromd_lineas_get.this.aP8 = aP8;
      tpromd_lineas_get.this.aP9 = aP9;
      tpromd_lineas_get.this.aP10 = aP10;
      tpromd_lineas_get.this.aP11 = aP11;
      tpromd_lineas_get.this.aP12 = aP12;
      tpromd_lineas_get.this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14PMDColCli = "" ;
      AV17PMDColNom = "" ;
      AV15PMDConCod = 0 ;
      AV12PMDDtoAca = DecimalUtil.ZERO ;
      AV11PMDDtoTin = DecimalUtil.ZERO ;
      AV10PMDEntKgm = DecimalUtil.ZERO ;
      AV9PMDPreKgm = DecimalUtil.ZERO ;
      AV16PMDPreUni = DecimalUtil.ZERO ;
      AV13PMDValFch = GXutil.nullDate() ;
      AV18ProMD1 = (short)(0) ;
      /* Using cursor P0AMV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A8391PMDCod), Integer.valueOf(AV8PMDColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8393PMDColNum = P0AMV2_A8393PMDColNum[0] ;
         A8530PMDColCli = P0AMV2_A8530PMDColCli[0] ;
         A8397PMDDtoTin = P0AMV2_A8397PMDDtoTin[0] ;
         A8396PMDEntKgm = P0AMV2_A8396PMDEntKgm[0] ;
         A8395PMDPreKgm = P0AMV2_A8395PMDPreKgm[0] ;
         A8532PMDPreUni = P0AMV2_A8532PMDPreUni[0] ;
         A8399PMDValFch = P0AMV2_A8399PMDValFch[0] ;
         A8398PMDDtoAca = P0AMV2_A8398PMDDtoAca[0] ;
         A8531PMDConCod = P0AMV2_A8531PMDConCod[0] ;
         GXt_char1 = A8394PMDColNom ;
         GXv_char2[0] = GXt_char1 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char2) ;
         tpromd_lineas_get.this.GXt_char1 = GXv_char2[0] ;
         A8394PMDColNom = GXt_char1 ;
         AV14PMDColCli = A8530PMDColCli ;
         AV15PMDConCod = A8531PMDConCod ;
         AV11PMDDtoTin = A8397PMDDtoTin ;
         AV10PMDEntKgm = A8396PMDEntKgm ;
         AV9PMDPreKgm = A8395PMDPreKgm ;
         AV16PMDPreUni = A8532PMDPreUni ;
         AV13PMDValFch = A8399PMDValFch ;
         AV17PMDColNom = A8394PMDColNom ;
         AV12PMDDtoAca = A8398PMDDtoAca ;
         AV18ProMD1 = (short)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = tpromd_lineas_get.this.AV9PMDPreKgm;
      this.aP5[0] = tpromd_lineas_get.this.AV10PMDEntKgm;
      this.aP6[0] = tpromd_lineas_get.this.AV11PMDDtoTin;
      this.aP7[0] = tpromd_lineas_get.this.AV12PMDDtoAca;
      this.aP8[0] = tpromd_lineas_get.this.AV13PMDValFch;
      this.aP9[0] = tpromd_lineas_get.this.AV14PMDColCli;
      this.aP10[0] = tpromd_lineas_get.this.AV15PMDConCod;
      this.aP11[0] = tpromd_lineas_get.this.AV16PMDPreUni;
      this.aP12[0] = tpromd_lineas_get.this.AV17PMDColNom;
      this.aP13[0] = tpromd_lineas_get.this.AV18ProMD1;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9PMDPreKgm = DecimalUtil.ZERO ;
      AV10PMDEntKgm = DecimalUtil.ZERO ;
      AV11PMDDtoTin = DecimalUtil.ZERO ;
      AV12PMDDtoAca = DecimalUtil.ZERO ;
      AV13PMDValFch = GXutil.nullDate() ;
      AV14PMDColCli = "" ;
      AV16PMDPreUni = DecimalUtil.ZERO ;
      AV17PMDColNom = "" ;
      scmdbuf = "" ;
      P0AMV2_A8391PMDCod = new short[1] ;
      P0AMV2_A8393PMDColNum = new int[1] ;
      P0AMV2_A8530PMDColCli = new String[] {""} ;
      P0AMV2_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMV2_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMV2_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMV2_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMV2_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AMV2_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AMV2_A396EmprCod = new String[] {""} ;
      P0AMV2_A252CliCod = new int[1] ;
      P0AMV2_A8531PMDConCod = new int[1] ;
      A8530PMDColCli = "" ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
      A8399PMDValFch = GXutil.nullDate() ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      A8394PMDColNom = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_lineas_get__default(),
         new Object[] {
             new Object[] {
            P0AMV2_A8391PMDCod, P0AMV2_A8393PMDColNum, P0AMV2_A8530PMDColCli, P0AMV2_A8397PMDDtoTin, P0AMV2_A8396PMDEntKgm, P0AMV2_A8395PMDPreKgm, P0AMV2_A8532PMDPreUni, P0AMV2_A8399PMDValFch, P0AMV2_A8398PMDDtoAca, P0AMV2_A396EmprCod,
            P0AMV2_A252CliCod, P0AMV2_A8531PMDConCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A8391PMDCod ;
   private short AV18ProMD1 ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV8PMDColNum ;
   private int AV15PMDConCod ;
   private int A8393PMDColNum ;
   private int A8531PMDConCod ;
   private java.math.BigDecimal AV9PMDPreKgm ;
   private java.math.BigDecimal AV10PMDEntKgm ;
   private java.math.BigDecimal AV11PMDDtoTin ;
   private java.math.BigDecimal AV12PMDDtoAca ;
   private java.math.BigDecimal AV16PMDPreUni ;
   private java.math.BigDecimal A8397PMDDtoTin ;
   private java.math.BigDecimal A8396PMDEntKgm ;
   private java.math.BigDecimal A8395PMDPreKgm ;
   private java.math.BigDecimal A8532PMDPreUni ;
   private java.math.BigDecimal A8398PMDDtoAca ;
   private String A396EmprCod ;
   private String AV14PMDColCli ;
   private String AV17PMDColNom ;
   private String scmdbuf ;
   private String A8530PMDColCli ;
   private String A8394PMDColNom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV13PMDValFch ;
   private java.util.Date A8399PMDValFch ;
   private short[] aP13 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.util.Date[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private short[] P0AMV2_A8391PMDCod ;
   private int[] P0AMV2_A8393PMDColNum ;
   private String[] P0AMV2_A8530PMDColCli ;
   private java.math.BigDecimal[] P0AMV2_A8397PMDDtoTin ;
   private java.math.BigDecimal[] P0AMV2_A8396PMDEntKgm ;
   private java.math.BigDecimal[] P0AMV2_A8395PMDPreKgm ;
   private java.math.BigDecimal[] P0AMV2_A8532PMDPreUni ;
   private java.util.Date[] P0AMV2_A8399PMDValFch ;
   private java.math.BigDecimal[] P0AMV2_A8398PMDDtoAca ;
   private String[] P0AMV2_A396EmprCod ;
   private int[] P0AMV2_A252CliCod ;
   private int[] P0AMV2_A8531PMDConCod ;
}

final  class tpromd_lineas_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AMV2", "SELECT PMDCod, PMDColNum, PMDColCli, PMDDtoTin, PMDEntKgm, PMDPreKgm, PMDPreUni, PMDValFch, PMDDtoAca, EmprCod, CliCod, PMDConCod FROM TXPProMD1 WHERE EmprCod = ? and CliCod = ? and PMDCod = ? and PMDColNum = ? ORDER BY EmprCod, CliCod, PMDCod, PMDColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

