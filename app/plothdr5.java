package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plothdr5 extends GXProcedure
{
   public plothdr5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plothdr5.class ), "" );
   }

   public plothdr5( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          String[] aP4 ,
                          short[] aP5 ,
                          short[] aP6 ,
                          java.math.BigDecimal[] aP7 ,
                          short[] aP8 ,
                          String[] aP9 )
   {
      plothdr5.this.aP10 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        short[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             short[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 )
   {
      plothdr5.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plothdr5.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      plothdr5.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      plothdr5.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      plothdr5.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      plothdr5.this.A194BarOrdLin = aP5[0];
      this.aP5 = aP5;
      plothdr5.this.AV8vNpartidas = aP6[0];
      this.aP6 = aP6;
      plothdr5.this.AV9vKilos = aP7[0];
      this.aP7 = aP7;
      plothdr5.this.AV10vPiezas = aP8[0];
      this.aP8 = aP8;
      plothdr5.this.AV13MaqCod = aP9[0];
      this.aP9 = aP9;
      plothdr5.this.AV14NPart = aP10[0];
      this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12Contar = AV8vNpartidas ;
      /* Using cursor P01BE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4638BarUltNlot = P01BE2_A4638BarUltNlot[0] ;
         n4638BarUltNlot = P01BE2_n4638BarUltNlot[0] ;
         while ( AV12Contar > 0 )
         {
            /*
               INSERT RECORD ON TABLE TXPFASMAQ

            */
            A4643BarFasLot = AV14NPart ;
            A4645BarFasKgs = AV9vKilos ;
            n4645BarFasKgs = false ;
            A4644BarFasNPrd = AV10vPiezas ;
            n4644BarFasNPrd = false ;
            A4646BarFasMts = DecimalUtil.doubleToDec(0) ;
            n4646BarFasMts = false ;
            A4302BarMaqFas1 = AV13MaqCod ;
            n4302BarMaqFas1 = false ;
            A4303BarFasEst1 = (byte)(0) ;
            n4303BarFasEst1 = false ;
            A4304BarFecRIn1 = GXutil.nullDate() ;
            n4304BarFecRIn1 = false ;
            A4305BarFecRea1 = GXutil.nullDate() ;
            n4305BarFecRea1 = false ;
            A4306BarTieTeo1 = DecimalUtil.doubleToDec(0) ;
            n4306BarTieTeo1 = false ;
            A4307BarUni1 = DecimalUtil.doubleToDec(0) ;
            n4307BarUni1 = false ;
            A4308BarHorIni1 = (short)(0) ;
            n4308BarHorIni1 = false ;
            A4309BarHorFin1 = (short)(0) ;
            n4309BarHorFin1 = false ;
            A4310BarTieRea1 = DecimalUtil.doubleToDec(0) ;
            n4310BarTieRea1 = false ;
            A4311BarFasMtr1 = DecimalUtil.doubleToDec(0) ;
            n4311BarFasMtr1 = false ;
            A4312BarFasKgm1 = DecimalUtil.doubleToDec(0) ;
            n4312BarFasKgm1 = false ;
            A4313BarFasPri1 = (byte)(0) ;
            n4313BarFasPri1 = false ;
            A4314BarFasBot1 = GXutil.space( (short)(1)) ;
            n4314BarFasBot1 = false ;
            A4315BarNumBot1 = 0 ;
            n4315BarNumBot1 = false ;
            A4647BarFasNPr1 = (short)(0) ;
            n4647BarFasNPr1 = false ;
            /* Using cursor P01BE3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot), Boolean.valueOf(n4644BarFasNPrd), Short.valueOf(A4644BarFasNPrd), Boolean.valueOf(n4645BarFasKgs), A4645BarFasKgs, Boolean.valueOf(n4646BarFasMts), A4646BarFasMts, Boolean.valueOf(n4302BarMaqFas1), A4302BarMaqFas1, Boolean.valueOf(n4303BarFasEst1), Byte.valueOf(A4303BarFasEst1), Boolean.valueOf(n4304BarFecRIn1), A4304BarFecRIn1, Boolean.valueOf(n4305BarFecRea1), A4305BarFecRea1, Boolean.valueOf(n4306BarTieTeo1), A4306BarTieTeo1, Boolean.valueOf(n4307BarUni1), A4307BarUni1, Boolean.valueOf(n4308BarHorIni1), Short.valueOf(A4308BarHorIni1), Boolean.valueOf(n4309BarHorFin1), Short.valueOf(A4309BarHorFin1), Boolean.valueOf(n4310BarTieRea1), A4310BarTieRea1, Boolean.valueOf(n4311BarFasMtr1), A4311BarFasMtr1, Boolean.valueOf(n4312BarFasKgm1), A4312BarFasKgm1, Boolean.valueOf(n4647BarFasNPr1), Short.valueOf(A4647BarFasNPr1), Boolean.valueOf(n4313BarFasPri1), Byte.valueOf(A4313BarFasPri1), Boolean.valueOf(n4314BarFasBot1), A4314BarFasBot1, Boolean.valueOf(n4315BarNumBot1), Integer.valueOf(A4315BarNumBot1)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
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
            AV12Contar = (short)(AV12Contar-1) ;
         }
         A4638BarUltNlot = AV14NPart ;
         n4638BarUltNlot = false ;
         /* Using cursor P01BE4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n4638BarUltNlot), Integer.valueOf(A4638BarUltNlot), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plothdr5.this.A396EmprCod;
      this.aP1[0] = plothdr5.this.A129BarCod;
      this.aP2[0] = plothdr5.this.A132BarCodReo;
      this.aP3[0] = plothdr5.this.A130BarCodPar;
      this.aP4[0] = plothdr5.this.A758ProCod;
      this.aP5[0] = plothdr5.this.A194BarOrdLin;
      this.aP6[0] = plothdr5.this.AV8vNpartidas;
      this.aP7[0] = plothdr5.this.AV9vKilos;
      this.aP8[0] = plothdr5.this.AV10vPiezas;
      this.aP9[0] = plothdr5.this.AV13MaqCod;
      this.aP10[0] = plothdr5.this.AV14NPart;
      Application.commitDataStores(context, remoteHandle, pr_default, "plothdr5");
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
      P01BE2_A396EmprCod = new String[] {""} ;
      P01BE2_A129BarCod = new int[1] ;
      P01BE2_A132BarCodReo = new byte[1] ;
      P01BE2_A130BarCodPar = new String[] {""} ;
      P01BE2_A758ProCod = new String[] {""} ;
      P01BE2_A194BarOrdLin = new short[1] ;
      P01BE2_A4638BarUltNlot = new int[1] ;
      P01BE2_n4638BarUltNlot = new boolean[] {false} ;
      A4645BarFasKgs = DecimalUtil.ZERO ;
      A4646BarFasMts = DecimalUtil.ZERO ;
      A4302BarMaqFas1 = "" ;
      A4304BarFecRIn1 = GXutil.nullDate() ;
      A4305BarFecRea1 = GXutil.nullDate() ;
      A4306BarTieTeo1 = DecimalUtil.ZERO ;
      A4307BarUni1 = DecimalUtil.ZERO ;
      A4310BarTieRea1 = DecimalUtil.ZERO ;
      A4311BarFasMtr1 = DecimalUtil.ZERO ;
      A4312BarFasKgm1 = DecimalUtil.ZERO ;
      A4314BarFasBot1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plothdr5__default(),
         new Object[] {
             new Object[] {
            P01BE2_A396EmprCod, P01BE2_A129BarCod, P01BE2_A132BarCodReo, P01BE2_A130BarCodPar, P01BE2_A758ProCod, P01BE2_A194BarOrdLin, P01BE2_A4638BarUltNlot, P01BE2_n4638BarUltNlot
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

   private byte A132BarCodReo ;
   private byte A4303BarFasEst1 ;
   private byte A4313BarFasPri1 ;
   private short A194BarOrdLin ;
   private short AV8vNpartidas ;
   private short AV10vPiezas ;
   private short AV12Contar ;
   private short A4644BarFasNPrd ;
   private short A4308BarHorIni1 ;
   private short A4309BarHorFin1 ;
   private short A4647BarFasNPr1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV14NPart ;
   private int A4638BarUltNlot ;
   private int GX_INS688 ;
   private int A4643BarFasLot ;
   private int A4315BarNumBot1 ;
   private java.math.BigDecimal AV9vKilos ;
   private java.math.BigDecimal A4645BarFasKgs ;
   private java.math.BigDecimal A4646BarFasMts ;
   private java.math.BigDecimal A4306BarTieTeo1 ;
   private java.math.BigDecimal A4307BarUni1 ;
   private java.math.BigDecimal A4310BarTieRea1 ;
   private java.math.BigDecimal A4311BarFasMtr1 ;
   private java.math.BigDecimal A4312BarFasKgm1 ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV13MaqCod ;
   private String scmdbuf ;
   private String A4302BarMaqFas1 ;
   private String A4314BarFasBot1 ;
   private String Gx_emsg ;
   private java.util.Date A4304BarFecRIn1 ;
   private java.util.Date A4305BarFecRea1 ;
   private boolean n4638BarUltNlot ;
   private boolean n4645BarFasKgs ;
   private boolean n4644BarFasNPrd ;
   private boolean n4646BarFasMts ;
   private boolean n4302BarMaqFas1 ;
   private boolean n4303BarFasEst1 ;
   private boolean n4304BarFecRIn1 ;
   private boolean n4305BarFecRea1 ;
   private boolean n4306BarTieTeo1 ;
   private boolean n4307BarUni1 ;
   private boolean n4308BarHorIni1 ;
   private boolean n4309BarHorFin1 ;
   private boolean n4310BarTieRea1 ;
   private boolean n4311BarFasMtr1 ;
   private boolean n4312BarFasKgm1 ;
   private boolean n4313BarFasPri1 ;
   private boolean n4314BarFasBot1 ;
   private boolean n4315BarNumBot1 ;
   private boolean n4647BarFasNPr1 ;
   private int[] aP10 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private short[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private IDataStoreProvider pr_default ;
   private String[] P01BE2_A396EmprCod ;
   private int[] P01BE2_A129BarCod ;
   private byte[] P01BE2_A132BarCodReo ;
   private String[] P01BE2_A130BarCodPar ;
   private String[] P01BE2_A758ProCod ;
   private short[] P01BE2_A194BarOrdLin ;
   private int[] P01BE2_A4638BarUltNlot ;
   private boolean[] P01BE2_n4638BarUltNlot ;
}

final  class plothdr5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01BE2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarUltNlot FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01BE3", "INSERT INTO TXPFASMAQ(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot, BarFasNPrd, BarFasKgs, BarFasMts, BarMaqFas1, BarFasEst1, BarFecRIn1, BarFecRea1, BarTieTeo1, BarUni1, BarHorIni1, BarHorFin1, BarTieRea1, BarFasMtr1, BarFasKgm1, BarFasNPr1, BarFasPri1, BarFasBot1, BarNumBot1, BarFasRecu, BarFasDti1, BarFasDtf1, BarFasInc1, BarEstPec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new UpdateCursor("P01BE4", "UPDATE TXPBARFAS SET BarUltNlot=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 6);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DATE );
               }
               else
               {
                  stmt.setDate(13, (java.util.Date)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DATE );
               }
               else
               {
                  stmt.setDate(14, (java.util.Date)parms[20]);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[38]).byteValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[40], 1);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[42]).intValue());
               }
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
      }
   }

}

