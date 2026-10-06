package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpentregasresumencliente extends GXProcedure
{
   public dpentregasresumencliente( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpentregasresumencliente.class ), "" );
   }

   public dpentregasresumencliente( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTEntregasResumenCliente> executeUdp( String aP0 ,
                                                                         String aP1 ,
                                                                         java.util.Date aP2 ,
                                                                         java.util.Date aP3 ,
                                                                         String aP4 ,
                                                                         String aP5 ,
                                                                         int aP6 ,
                                                                         int aP7 ,
                                                                         String aP8 ,
                                                                         String aP9 ,
                                                                         int aP10 ,
                                                                         int aP11 ,
                                                                         byte aP12 ,
                                                                         byte aP13 ,
                                                                         byte aP14 ,
                                                                         String aP15 )
   {
      dpentregasresumencliente.this.aP16 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTEntregasResumenCliente>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        String aP4 ,
                        String aP5 ,
                        int aP6 ,
                        int aP7 ,
                        String aP8 ,
                        String aP9 ,
                        int aP10 ,
                        int aP11 ,
                        byte aP12 ,
                        byte aP13 ,
                        byte aP14 ,
                        String aP15 ,
                        GXBaseCollection<app.SdtSDTEntregasResumenCliente>[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             String aP4 ,
                             String aP5 ,
                             int aP6 ,
                             int aP7 ,
                             String aP8 ,
                             String aP9 ,
                             int aP10 ,
                             int aP11 ,
                             byte aP12 ,
                             byte aP13 ,
                             byte aP14 ,
                             String aP15 ,
                             GXBaseCollection<app.SdtSDTEntregasResumenCliente>[] aP16 )
   {
      dpentregasresumencliente.this.AV15Emprcod = aP0;
      dpentregasresumencliente.this.AV19Prio = aP1;
      dpentregasresumencliente.this.AV5AlbProFch = aP2;
      dpentregasresumencliente.this.AV6AlbProFch_To = aP3;
      dpentregasresumencliente.this.AV7BarColNom = aP4;
      dpentregasresumencliente.this.AV8BarColNom_To = aP5;
      dpentregasresumencliente.this.AV9BarColNum = aP6;
      dpentregasresumencliente.this.AV10BarColNum_To = aP7;
      dpentregasresumencliente.this.AV11BarSer = aP8;
      dpentregasresumencliente.this.AV12BarSer_To = aP9;
      dpentregasresumencliente.this.AV20Clicod = aP10;
      dpentregasresumencliente.this.AV21Clicod_to = aP11;
      dpentregasresumencliente.this.AV24Barestreo = aP12;
      dpentregasresumencliente.this.AV25Barestreoi = aP13;
      dpentregasresumencliente.this.AV26barestreof = aP14;
      dpentregasresumencliente.this.AV27TipDisCod = aP15;
      dpentregasresumencliente.this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P001G2 */
      pr_default.execute(0, new Object[] {AV15Emprcod, Integer.valueOf(AV20Clicod), Integer.valueOf(AV21Clicod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P001G2_A396EmprCod[0] ;
         A252CliCod = P001G2_A252CliCod[0] ;
         A279CliNom = P001G2_A279CliNom[0] ;
         Gxm1sdtentregasresumencliente = (app.SdtSDTEntregasResumenCliente)new app.SdtSDTEntregasResumenCliente(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtentregasresumencliente, 0);
         Gxm1sdtentregasresumencliente.setgxTv_SdtSDTEntregasResumenCliente_Clicod( A252CliCod );
         Gxm1sdtentregasresumencliente.setgxTv_SdtSDTEntregasResumenCliente_Clinom( A279CliNom );
         Gxm3sdtentregasresumencliente_level1 = (app.SdtSDTEntregasResumenCliente_Level1Item)new app.SdtSDTEntregasResumenCliente_Level1Item(remoteHandle, context);
         Gxm1sdtentregasresumencliente.getgxTv_SdtSDTEntregasResumenCliente_Level1().add(Gxm3sdtentregasresumencliente_level1, 0);
         AV16Totkgs = DecimalUtil.doubleToDec(0) ;
         AV17TotMts = DecimalUtil.doubleToDec(0) ;
         AV18TotPzs = 0 ;
         /* Using cursor P001G3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), AV5AlbProFch, AV6AlbProFch_To, AV19Prio, AV19Prio});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1253EmprGuiRem = P001G3_A1253EmprGuiRem[0] ;
            A1243GuiRemCli = P001G3_A1243GuiRemCli[0] ;
            A30AlbProCod = P001G3_A30AlbProCod[0] ;
            A39AlbProPri = P001G3_A39AlbProPri[0] ;
            A34AlbProfch = P001G3_A34AlbProfch[0] ;
            /* Optimized group. */
            /* Using cursor P001G4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), AV11BarSer, AV12BarSer_To, AV7BarColNom, AV8BarColNom_To, Integer.valueOf(AV9BarColNum), Integer.valueOf(AV10BarColNum_To), Byte.valueOf(AV25Barestreoi), Byte.valueOf(AV26barestreof), AV27TipDisCod, AV27TipDisCod});
            c1261BarAlbKgmE = P001G4_A1261BarAlbKgmE[0] ;
            c1263BarAlbMtrE = P001G4_A1263BarAlbMtrE[0] ;
            c1265BarAlbPie = P001G4_A1265BarAlbPie[0] ;
            pr_default.close(2);
            AV16Totkgs = AV16Totkgs.add(c1261BarAlbKgmE) ;
            AV17TotMts = AV17TotMts.add(c1263BarAlbMtrE) ;
            AV18TotPzs = (int)(AV18TotPzs+c1265BarAlbPie) ;
            /* End optimized group. */
            pr_default.readNext(1);
         }
         pr_default.close(1);
         Gxm3sdtentregasresumencliente_level1.setgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totkgs( AV16Totkgs );
         Gxm3sdtentregasresumencliente_level1.setgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totmts( AV17TotMts );
         Gxm3sdtentregasresumencliente_level1.setgxTv_SdtSDTEntregasResumenCliente_Level1Item_Totpzs( AV18TotPzs );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP16[0] = dpentregasresumencliente.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.SdtSDTEntregasResumenCliente>(app.SdtSDTEntregasResumenCliente.class, "SDTEntregasResumenCliente", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      P001G2_A396EmprCod = new String[] {""} ;
      P001G2_A252CliCod = new int[1] ;
      P001G2_A279CliNom = new String[] {""} ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      Gxm1sdtentregasresumencliente = new app.SdtSDTEntregasResumenCliente(remoteHandle, context);
      Gxm3sdtentregasresumencliente_level1 = new app.SdtSDTEntregasResumenCliente_Level1Item(remoteHandle, context);
      AV16Totkgs = DecimalUtil.ZERO ;
      AV17TotMts = DecimalUtil.ZERO ;
      P001G3_A1253EmprGuiRem = new String[] {""} ;
      P001G3_A1243GuiRemCli = new int[1] ;
      P001G3_A30AlbProCod = new long[1] ;
      P001G3_A39AlbProPri = new String[] {""} ;
      P001G3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P001G3_A396EmprCod = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      c1261BarAlbKgmE = DecimalUtil.ZERO ;
      c1263BarAlbMtrE = DecimalUtil.ZERO ;
      P001G4_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001G4_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001G4_A1265BarAlbPie = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.dpentregasresumencliente__default(),
         new Object[] {
             new Object[] {
            P001G2_A396EmprCod, P001G2_A252CliCod, P001G2_A279CliNom
            }
            , new Object[] {
            P001G3_A1253EmprGuiRem, P001G3_A1243GuiRemCli, P001G3_A30AlbProCod, P001G3_A39AlbProPri, P001G3_A34AlbProfch, P001G3_A396EmprCod
            }
            , new Object[] {
            P001G4_A1261BarAlbKgmE, P001G4_A1263BarAlbMtrE, P001G4_A1265BarAlbPie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24Barestreo ;
   private byte AV25Barestreoi ;
   private byte AV26barestreof ;
   private short Gx_err ;
   private int AV9BarColNum ;
   private int AV10BarColNum_To ;
   private int AV20Clicod ;
   private int AV21Clicod_to ;
   private int A252CliCod ;
   private int AV18TotPzs ;
   private int A1243GuiRemCli ;
   private int c1265BarAlbPie ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV16Totkgs ;
   private java.math.BigDecimal AV17TotMts ;
   private java.math.BigDecimal c1261BarAlbKgmE ;
   private java.math.BigDecimal c1263BarAlbMtrE ;
   private String AV15Emprcod ;
   private String AV19Prio ;
   private String AV7BarColNom ;
   private String AV8BarColNom_To ;
   private String AV11BarSer ;
   private String AV12BarSer_To ;
   private String AV27TipDisCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A1253EmprGuiRem ;
   private String A39AlbProPri ;
   private java.util.Date AV5AlbProFch ;
   private java.util.Date AV6AlbProFch_To ;
   private java.util.Date A34AlbProfch ;
   private GXBaseCollection<app.SdtSDTEntregasResumenCliente>[] aP16 ;
   private IDataStoreProvider pr_default ;
   private String[] P001G2_A396EmprCod ;
   private int[] P001G2_A252CliCod ;
   private String[] P001G2_A279CliNom ;
   private String[] P001G3_A1253EmprGuiRem ;
   private int[] P001G3_A1243GuiRemCli ;
   private long[] P001G3_A30AlbProCod ;
   private String[] P001G3_A39AlbProPri ;
   private java.util.Date[] P001G3_A34AlbProfch ;
   private String[] P001G3_A396EmprCod ;
   private java.math.BigDecimal[] P001G4_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P001G4_A1263BarAlbMtrE ;
   private int[] P001G4_A1265BarAlbPie ;
   private GXBaseCollection<app.SdtSDTEntregasResumenCliente> Gxm2rootcol ;
   private app.SdtSDTEntregasResumenCliente Gxm1sdtentregasresumencliente ;
   private app.SdtSDTEntregasResumenCliente_Level1Item Gxm3sdtentregasresumencliente_level1 ;
}

final  class dpentregasresumencliente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001G2", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ? and CliCod >= ?) AND (CliCod <= ?) ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001G3", "SELECT EmprGuiRem, GuiRemCli, AlbProCod, AlbProPri, AlbProfch, EmprCod FROM TXPCALPRD WHERE (EmprGuiRem = ? and GuiRemCli = ?) AND (AlbProfch >= ?) AND (AlbProfch <= ?) AND (AlbProPri = ? or ? = '2') ORDER BY EmprGuiRem, GuiRemCli ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001G4", "SELECT SUM(T1.BarAlbKgmE), SUM(T1.BarAlbMtrE), SUM(T1.BarAlbPie) FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.AlbProCod = ?) AND (T2.BarSer >= ?) AND (T2.BarSer <= ?) AND (T2.BarColNom >= ?) AND (T2.BarColNom <= ?) AND (T2.BarColNum >= ?) AND (T2.BarColNum <= ?) AND (T2.BarEstReo >= ?) AND (T2.BarEstReo <= ?) AND (T2.BarTipDis = ? or ? = '*') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 1);
               return;
      }
   }

}

