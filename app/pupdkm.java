package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pupdkm extends GXProcedure
{
   public pupdkm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pupdkm.class ), "" );
   }

   public pupdkm( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           short[] aP7 ,
                                           String[] aP8 ,
                                           String[] aP9 ,
                                           String[] aP10 )
   {
      pupdkm.this.aP11 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        java.math.BigDecimal[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             java.math.BigDecimal[] aP11 )
   {
      pupdkm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pupdkm.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      pupdkm.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      pupdkm.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      pupdkm.this.AV11BarPieCod = aP4[0];
      this.aP4 = aP4;
      pupdkm.this.AV12BarPieMet = aP5[0];
      this.aP5 = aP5;
      pupdkm.this.AV17barpiekil = aP6[0];
      this.aP6 = aP6;
      pupdkm.this.AV15MetPieAnc = aP7[0];
      this.aP7 = aP7;
      pupdkm.this.AV16METTERCOD = aP8[0];
      this.aP8 = aP8;
      pupdkm.this.AV19MetPieId = aP9[0];
      this.aP9 = aP9;
      pupdkm.this.AV21Kms = aP10[0];
      this.aP10 = aP10;
      pupdkm.this.AV22gmr2 = aP11[0];
      this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV20Er ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EROTAT", ""), GXv_int2) ;
      pupdkm.this.GXt_int1 = GXv_int2[0] ;
      AV20Er = GXt_int1 ;
      /* Using cursor P04FC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV16METTERCOD, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar, AV11BarPieCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2813MetPieCod = P04FC2_A2813MetPieCod[0] ;
         A130BarCodPar = P04FC2_A130BarCodPar[0] ;
         A132BarCodReo = P04FC2_A132BarCodReo[0] ;
         A129BarCod = P04FC2_A129BarCod[0] ;
         A2809MetTerCod = P04FC2_A2809MetTerCod[0] ;
         A2815MetPieMet = P04FC2_A2815MetPieMet[0] ;
         A2814MetPieKil = P04FC2_A2814MetPieKil[0] ;
         A6635MetPieAnc = P04FC2_A6635MetPieAnc[0] ;
         A10784MetPieId = P04FC2_A10784MetPieId[0] ;
         A4910MetPieMtD = P04FC2_A4910MetPieMtD[0] ;
         AV14OldMts = A2815MetPieMet ;
         AV18OldKgs = A2814MetPieKil ;
         A2815MetPieMet = AV12BarPieMet ;
         A2814MetPieKil = AV17barpiekil ;
         A6635MetPieAnc = AV15MetPieAnc ;
         A10784MetPieId = AV19MetPieId ;
         A4910MetPieMtD = AV22gmr2 ;
         /* Using cursor P04FC3 */
         pr_default.execute(1, new Object[] {A2815MetPieMet, A2814MetPieKil, Short.valueOf(A6635MetPieAnc), A10784MetPieId, A4910MetPieMtD, A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV20Er == 0 )
      {
         n3275BarKgsAut = false ;
         n3276BarMtsAut = false ;
         /* Optimized UPDATE. */
         /* Using cursor P04FC4 */
         pr_default.execute(2, new Object[] {AV17barpiekil, AV18OldKgs, AV12BarPieMet, AV14OldMts, A396EmprCod, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pupdkm.this.A396EmprCod;
      this.aP1[0] = pupdkm.this.AV8Barcod;
      this.aP2[0] = pupdkm.this.AV9Barcodreo;
      this.aP3[0] = pupdkm.this.AV10Barcodpar;
      this.aP4[0] = pupdkm.this.AV11BarPieCod;
      this.aP5[0] = pupdkm.this.AV12BarPieMet;
      this.aP6[0] = pupdkm.this.AV17barpiekil;
      this.aP7[0] = pupdkm.this.AV15MetPieAnc;
      this.aP8[0] = pupdkm.this.AV16METTERCOD;
      this.aP9[0] = pupdkm.this.AV19MetPieId;
      this.aP10[0] = pupdkm.this.AV21Kms;
      this.aP11[0] = pupdkm.this.AV22gmr2;
      Application.commitDataStores(context, remoteHandle, pr_default, "pupdkm");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P04FC2_A396EmprCod = new String[] {""} ;
      P04FC2_A2813MetPieCod = new String[] {""} ;
      P04FC2_A130BarCodPar = new String[] {""} ;
      P04FC2_A132BarCodReo = new byte[1] ;
      P04FC2_A129BarCod = new int[1] ;
      P04FC2_A2809MetTerCod = new String[] {""} ;
      P04FC2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FC2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FC2_A6635MetPieAnc = new short[1] ;
      P04FC2_A10784MetPieId = new String[] {""} ;
      P04FC2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2813MetPieCod = "" ;
      A130BarCodPar = "" ;
      A2809MetTerCod = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A10784MetPieId = "" ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      AV14OldMts = DecimalUtil.ZERO ;
      AV18OldKgs = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pupdkm__default(),
         new Object[] {
             new Object[] {
            P04FC2_A396EmprCod, P04FC2_A2813MetPieCod, P04FC2_A130BarCodPar, P04FC2_A132BarCodReo, P04FC2_A129BarCod, P04FC2_A2809MetTerCod, P04FC2_A2815MetPieMet, P04FC2_A2814MetPieKil, P04FC2_A6635MetPieAnc, P04FC2_A10784MetPieId,
            P04FC2_A4910MetPieMtD
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Barcodreo ;
   private byte AV20Er ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private short AV15MetPieAnc ;
   private short A6635MetPieAnc ;
   private short Gx_err ;
   private int AV8Barcod ;
   private int A129BarCod ;
   private java.math.BigDecimal AV12BarPieMet ;
   private java.math.BigDecimal AV17barpiekil ;
   private java.math.BigDecimal AV22gmr2 ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal AV14OldMts ;
   private java.math.BigDecimal AV18OldKgs ;
   private String A396EmprCod ;
   private String AV10Barcodpar ;
   private String AV11BarPieCod ;
   private String AV16METTERCOD ;
   private String AV19MetPieId ;
   private String AV21Kms ;
   private String scmdbuf ;
   private String A2813MetPieCod ;
   private String A130BarCodPar ;
   private String A2809MetTerCod ;
   private String A10784MetPieId ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private java.math.BigDecimal[] aP11 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P04FC2_A396EmprCod ;
   private String[] P04FC2_A2813MetPieCod ;
   private String[] P04FC2_A130BarCodPar ;
   private byte[] P04FC2_A132BarCodReo ;
   private int[] P04FC2_A129BarCod ;
   private String[] P04FC2_A2809MetTerCod ;
   private java.math.BigDecimal[] P04FC2_A2815MetPieMet ;
   private java.math.BigDecimal[] P04FC2_A2814MetPieKil ;
   private short[] P04FC2_A6635MetPieAnc ;
   private String[] P04FC2_A10784MetPieId ;
   private java.math.BigDecimal[] P04FC2_A4910MetPieMtD ;
}

final  class pupdkm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04FC2", "SELECT EmprCod, MetPieCod, BarCodPar, BarCodReo, BarCod, MetTerCod, MetPieMet, MetPieKil, MetPieAnc, MetPieId, MetPieMtD FROM TXPLMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MetPieCod = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04FC3", "UPDATE TXPLMETPI SET MetPieMet=?, MetPieKil=?, MetPieAnc=?, MetPieId=?, MetPieMtD=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
         ,new UpdateCursor("P04FC4", "UPDATE TXPBARPIE SET BarKgsAut=BarKgsAut + ( ( ? - ?)), BarMtsAut=BarMtsAut + ( ( ? - ?))  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 1 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 9);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 9);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
      }
   }

}

