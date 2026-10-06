package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcosi00 extends GXProcedure
{
   public pcosi00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcosi00.class ), "" );
   }

   public pcosi00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           java.math.BigDecimal[] aP6 ,
                           short[] aP7 ,
                           String[] aP8 ,
                           String[] aP9 ,
                           int[] aP10 ,
                           String[] aP11 ,
                           String[] aP12 ,
                           byte[] aP13 ,
                           String[] aP14 ,
                           String[] aP15 ,
                           java.math.BigDecimal[] aP16 ,
                           String[] aP17 ,
                           String[] aP18 ,
                           java.util.Date[] aP19 ,
                           int[] aP20 ,
                           byte[] aP21 ,
                           short[] aP22 ,
                           String[] aP23 )
   {
      pcosi00.this.aP24 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24);
      return aP24[0];
   }

   public void execute( String aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        short[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        String[] aP11 ,
                        String[] aP12 ,
                        byte[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        java.math.BigDecimal[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 ,
                        java.util.Date[] aP19 ,
                        int[] aP20 ,
                        byte[] aP21 ,
                        short[] aP22 ,
                        String[] aP23 ,
                        byte[] aP24 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24);
   }

   private void execute_int( String aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             short[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             String[] aP11 ,
                             String[] aP12 ,
                             byte[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             java.util.Date[] aP19 ,
                             int[] aP20 ,
                             byte[] aP21 ,
                             short[] aP22 ,
                             String[] aP23 ,
                             byte[] aP24 )
   {
      pcosi00.this.AV34EmprCod = aP0;
      pcosi00.this.AV8Barcod = aP1[0];
      this.aP1 = aP1;
      pcosi00.this.AV9Barcodreo = aP2[0];
      this.aP2 = aP2;
      pcosi00.this.AV10Barcodpar = aP3[0];
      this.aP3 = aP3;
      pcosi00.this.AV11BarPieCod = aP4[0];
      this.aP4 = aP4;
      pcosi00.this.AV12BarPieMet = aP5[0];
      this.aP5 = aP5;
      pcosi00.this.AV15BarPiekil = aP6[0];
      this.aP6 = aP6;
      pcosi00.this.AV14MetPieAnc = aP7[0];
      this.aP7 = aP7;
      pcosi00.this.AV13Station = aP8[0];
      this.aP8 = aP8;
      pcosi00.this.AV16MetPieobs = aP9[0];
      this.aP9 = aP9;
      pcosi00.this.AV17Albreccod = aP10[0];
      this.aP10 = aP10;
      pcosi00.this.AV18MetPieOb = aP11[0];
      this.aP11 = aP11;
      pcosi00.this.AV19MetPieId = aP12[0];
      this.aP12 = aP12;
      pcosi00.this.AV21Nocamp = aP13[0];
      this.aP13 = aP13;
      pcosi00.this.AV22Msg_err = aP14[0];
      this.aP14 = aP14;
      pcosi00.this.AV23KMs = aP15[0];
      this.aP15 = aP15;
      pcosi00.this.AV24MetPieMtD = aP16[0];
      this.aP16 = aP16;
      pcosi00.this.AV25Fascod = aP17[0];
      this.aP17 = aP17;
      pcosi00.this.AV26FasDsc = aP18[0];
      this.aP18 = aP18;
      pcosi00.this.AV27MetPieFch = aP19[0];
      this.aP19 = aP19;
      pcosi00.this.AV28Opecod = aP20[0];
      this.aP20 = aP20;
      pcosi00.this.AV29Hisprotur = aP21[0];
      this.aP21 = aP21;
      pcosi00.this.AV31LargUtil = aP22[0];
      this.aP22 = aP22;
      pcosi00.this.AV32Teia = aP23[0];
      this.aP23 = aP23;
      pcosi00.this.AV33Calidad = aP24[0];
      this.aP24 = aP24;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV20Er ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV34EmprCod, httpContext.getMessage( "EROTAT", ""), GXv_int2) ;
      pcosi00.this.GXt_int1 = GXv_int2[0] ;
      AV20Er = GXt_int1 ;
      /*
         INSERT RECORD ON TABLE TXPCMETPI

      */
      A396EmprCod = AV34EmprCod ;
      A2809MetTerCod = AV13Station ;
      A129BarCod = AV8Barcod ;
      A132BarCodReo = AV9Barcodreo ;
      A130BarCodPar = AV10Barcodpar ;
      A13007MetPieNum = 0 ;
      n13007MetPieNum = false ;
      A13008MetPieFcUl = AV27MetPieFch ;
      n13008MetPieFcUl = false ;
      A13009MetPieFase = AV25Fascod ;
      n13009MetPieFase = false ;
      A13011MetPieDfCo = " " ;
      n13011MetPieDfCo = false ;
      /* Using cursor P043X2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n13007MetPieNum), Integer.valueOf(A13007MetPieNum), Boolean.valueOf(n13008MetPieFcUl), A13008MetPieFcUl, Boolean.valueOf(n13009MetPieFase), A13009MetPieFase, Boolean.valueOf(n13011MetPieDfCo), A13011MetPieDfCo});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      /*
         INSERT RECORD ON TABLE TXPLMETPI

      */
      A396EmprCod = AV34EmprCod ;
      A2809MetTerCod = AV13Station ;
      A129BarCod = AV8Barcod ;
      A132BarCodReo = AV9Barcodreo ;
      A130BarCodPar = AV10Barcodpar ;
      A2813MetPieCod = AV11BarPieCod ;
      A2814MetPieKil = AV15BarPiekil ;
      A2815MetPieMet = AV12BarPieMet ;
      A2816MetPieEst = (byte)(0) ;
      A2846MetPieDsc = "" ;
      A4909MetPieDef = AV31LargUtil ;
      A4910MetPieMtD = AV24MetPieMtD ;
      A4911MetPieCol = GXutil.trim( GXutil.str( AV17Albreccod, 8, 0)) ;
      A4912MetPiePDo = 0 ;
      A4913MetPieLoc = AV32Teia ;
      A4914MetPieRap = " " ;
      A4915MetPieDCP = ((AV33Calidad==1) ? httpContext.getMessage( "S", "") : httpContext.getMessage( "N", "")) ;
      A4916MetPieMue = " " ;
      A5136MetPieFch = AV27MetPieFch ;
      A6635MetPieAnc = AV14MetPieAnc ;
      A10779MetPieOb = AV18MetPieOb ;
      A10784MetPieId = AV19MetPieId ;
      if ( AV21Nocamp == 0 )
      {
         A10780MetPiectr = AV25Fascod + "-" + AV26FasDsc ;
      }
      else
      {
         A10780MetPiectr = "*" ;
      }
      A4917MetPieObs = GXutil.substring( AV16MetPieobs, 1, 40) ;
      if ( AV21Nocamp == 1 )
      {
         A4917MetPieObs = GXutil.trim( GXutil.substring( AV16MetPieobs, 1, 40)) + " " + GXutil.trim( AV22Msg_err) ;
      }
      A12994MetPieDfUl = (short)(0) ;
      A13005MetPieOpe = AV28Opecod ;
      A13006MetPieTurn = AV29Hisprotur ;
      /* Using cursor P043X3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod, A2814MetPieKil, A2815MetPieMet, Byte.valueOf(A2816MetPieEst), A2846MetPieDsc, Short.valueOf(A4909MetPieDef), A4910MetPieMtD, A5136MetPieFch, Short.valueOf(A6635MetPieAnc), A10779MetPieOb, A10780MetPiectr, A10784MetPieId, A4911MetPieCol, Long.valueOf(A4912MetPiePDo), A4913MetPieLoc, A4914MetPieRap, A4915MetPieDCP, A4916MetPieMue, A4917MetPieObs, Short.valueOf(A12994MetPieDfUl), Integer.valueOf(A13005MetPieOpe), Byte.valueOf(A13006MetPieTurn)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
      if ( (pr_default.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      if ( AV20Er == 0 )
      {
         n3277BarPieAut = false ;
         n3275BarKgsAut = false ;
         n3276BarMtsAut = false ;
         /* Optimized UPDATE. */
         /* Using cursor P043X4 */
         pr_default.execute(2, new Object[] {AV15BarPiekil, AV12BarPieMet, Integer.valueOf(AV8Barcod), Byte.valueOf(AV9Barcodreo), AV10Barcodpar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = pcosi00.this.AV8Barcod;
      this.aP2[0] = pcosi00.this.AV9Barcodreo;
      this.aP3[0] = pcosi00.this.AV10Barcodpar;
      this.aP4[0] = pcosi00.this.AV11BarPieCod;
      this.aP5[0] = pcosi00.this.AV12BarPieMet;
      this.aP6[0] = pcosi00.this.AV15BarPiekil;
      this.aP7[0] = pcosi00.this.AV14MetPieAnc;
      this.aP8[0] = pcosi00.this.AV13Station;
      this.aP9[0] = pcosi00.this.AV16MetPieobs;
      this.aP10[0] = pcosi00.this.AV17Albreccod;
      this.aP11[0] = pcosi00.this.AV18MetPieOb;
      this.aP12[0] = pcosi00.this.AV19MetPieId;
      this.aP13[0] = pcosi00.this.AV21Nocamp;
      this.aP14[0] = pcosi00.this.AV22Msg_err;
      this.aP15[0] = pcosi00.this.AV23KMs;
      this.aP16[0] = pcosi00.this.AV24MetPieMtD;
      this.aP17[0] = pcosi00.this.AV25Fascod;
      this.aP18[0] = pcosi00.this.AV26FasDsc;
      this.aP19[0] = pcosi00.this.AV27MetPieFch;
      this.aP20[0] = pcosi00.this.AV28Opecod;
      this.aP21[0] = pcosi00.this.AV29Hisprotur;
      this.aP22[0] = pcosi00.this.AV31LargUtil;
      this.aP23[0] = pcosi00.this.AV32Teia;
      this.aP24[0] = pcosi00.this.AV33Calidad;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcosi00");
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
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A13008MetPieFcUl = GXutil.nullDate() ;
      A13009MetPieFase = "" ;
      A13011MetPieDfCo = "" ;
      Gx_emsg = "" ;
      A2813MetPieCod = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2846MetPieDsc = "" ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A4911MetPieCol = "" ;
      A4913MetPieLoc = "" ;
      A4914MetPieRap = "" ;
      A4915MetPieDCP = "" ;
      A4916MetPieMue = "" ;
      A5136MetPieFch = GXutil.nullDate() ;
      A10779MetPieOb = "" ;
      A10784MetPieId = "" ;
      A10780MetPiectr = "" ;
      A4917MetPieObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcosi00__default(),
         new Object[] {
             new Object[] {
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
   private byte AV21Nocamp ;
   private byte AV29Hisprotur ;
   private byte AV33Calidad ;
   private byte AV20Er ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A2816MetPieEst ;
   private byte A13006MetPieTurn ;
   private short AV14MetPieAnc ;
   private short AV31LargUtil ;
   private short Gx_err ;
   private short A4909MetPieDef ;
   private short A6635MetPieAnc ;
   private short A12994MetPieDfUl ;
   private int AV8Barcod ;
   private int AV17Albreccod ;
   private int AV28Opecod ;
   private int GX_INS412 ;
   private int A129BarCod ;
   private int A13007MetPieNum ;
   private int GX_INS413 ;
   private int A13005MetPieOpe ;
   private long A4912MetPiePDo ;
   private java.math.BigDecimal AV12BarPieMet ;
   private java.math.BigDecimal AV15BarPiekil ;
   private java.math.BigDecimal AV24MetPieMtD ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private String AV34EmprCod ;
   private String AV10Barcodpar ;
   private String AV11BarPieCod ;
   private String AV13Station ;
   private String AV18MetPieOb ;
   private String AV19MetPieId ;
   private String AV22Msg_err ;
   private String AV23KMs ;
   private String AV25Fascod ;
   private String AV26FasDsc ;
   private String AV32Teia ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String A13009MetPieFase ;
   private String Gx_emsg ;
   private String A2813MetPieCod ;
   private String A2846MetPieDsc ;
   private String A4911MetPieCol ;
   private String A4913MetPieLoc ;
   private String A4914MetPieRap ;
   private String A4915MetPieDCP ;
   private String A4916MetPieMue ;
   private String A10779MetPieOb ;
   private String A10784MetPieId ;
   private String A10780MetPiectr ;
   private java.util.Date AV27MetPieFch ;
   private java.util.Date A13008MetPieFcUl ;
   private java.util.Date A5136MetPieFch ;
   private boolean n13007MetPieNum ;
   private boolean n13008MetPieFcUl ;
   private boolean n13009MetPieFase ;
   private boolean n13011MetPieDfCo ;
   private boolean n3277BarPieAut ;
   private boolean n3275BarKgsAut ;
   private boolean n3276BarMtsAut ;
   private String AV16MetPieobs ;
   private String A13011MetPieDfCo ;
   private String A4917MetPieObs ;
   private byte[] aP24 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private short[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private String[] aP11 ;
   private String[] aP12 ;
   private byte[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private java.math.BigDecimal[] aP16 ;
   private String[] aP17 ;
   private String[] aP18 ;
   private java.util.Date[] aP19 ;
   private int[] aP20 ;
   private byte[] aP21 ;
   private short[] aP22 ;
   private String[] aP23 ;
   private IDataStoreProvider pr_default ;
}

final  class pcosi00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P043X2", "INSERT INTO TXPCMETPI(EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieNum, MetPieFcUl, MetPieFase, MetPieDfCo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMETPI")
         ,new UpdateCursor("P043X3", "INSERT INTO TXPLMETPI(EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieMtD, MetPieFch, MetPieAnc, MetPieOb, MetPiectr, MetPieId, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
         ,new UpdateCursor("P043X4", "UPDATE TXPBARPIE SET BarPieAut=BarPieAut + 1, BarKgsAut=BarKgsAut + ?, BarMtsAut=BarMtsAut + ?  WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DATE );
               }
               else
               {
                  stmt.setDate(7, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 8);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[12], 600);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 20);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setString(15, (String)parms[14], 60);
               stmt.setString(16, (String)parms[15], 40);
               stmt.setString(17, (String)parms[16], 9);
               stmt.setString(18, (String)parms[17], 13);
               stmt.setLong(19, ((Number) parms[18]).longValue());
               stmt.setString(20, (String)parms[19], 10);
               stmt.setString(21, (String)parms[20], 1);
               stmt.setString(22, (String)parms[21], 1);
               stmt.setString(23, (String)parms[22], 1);
               stmt.setVarchar(24, (String)parms[23], 1024, false);
               stmt.setShort(25, ((Number) parms[24]).shortValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setByte(27, ((Number) parms[26]).byteValue());
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

