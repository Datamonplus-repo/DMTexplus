package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palbest extends GXProcedure
{
   public palbest( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palbest.class ), "" );
   }

   public palbest( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      palbest.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      palbest.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palbest.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      palbest.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      palbest.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      palbest.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      palbest.this.AV8DisComLin = aP5[0];
      this.aP5 = aP5;
      palbest.this.AV9DisComCod = aP6[0];
      this.aP6 = aP6;
      palbest.this.AV10FonCod = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01F93 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P01F93_A361DisCod[0] ;
         A3134BarAncSal1 = P01F93_A3134BarAncSal1[0] ;
         A125BarAncAca1 = P01F93_A125BarAncAca1[0] ;
         A191BarNumPie = P01F93_A191BarNumPie[0] ;
         A362DisColNom = P01F93_A362DisColNom[0] ;
         n362DisColNom = P01F93_n362DisColNom[0] ;
         A184BarMtr = P01F93_A184BarMtr[0] ;
         n184BarMtr = P01F93_n184BarMtr[0] ;
         A362DisColNom = P01F93_A362DisColNom[0] ;
         n362DisColNom = P01F93_n362DisColNom[0] ;
         A184BarMtr = P01F93_A184BarMtr[0] ;
         n184BarMtr = P01F93_n184BarMtr[0] ;
         AV11BarAncSal1 = ((A125BarAncAca1!=0) ? A125BarAncAca1 : A3134BarAncSal1) ;
         AV12BarMtr = A184BarMtr ;
         AV13BarNumPie = A191BarNumPie ;
         AV8DisComLin = (byte)(1) ;
         AV9DisComCod = A362DisColNom ;
         AV10FonCod = A362DisColNom ;
         /*
            INSERT RECORD ON TABLE TXPDISCOM

         */
         A2524DisComLin = AV8DisComLin ;
         A1056DisComCod = AV9DisComCod ;
         A1032FonCod = AV10FonCod ;
         A1057DisComAnh = AV11BarAncSal1 ;
         n1057DisComAnh = false ;
         A1058DisComMtr = AV12BarMtr ;
         n1058DisComMtr = false ;
         A1059DisComPie = AV13BarNumPie ;
         n1059DisComPie = false ;
         /* Using cursor P01F94 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1057DisComAnh), Short.valueOf(A1057DisComAnh), Boolean.valueOf(n1058DisComMtr), A1058DisComMtr, Boolean.valueOf(n1059DisComPie), Short.valueOf(A1059DisComPie)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISCOM");
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
         /*
            INSERT RECORD ON TABLE TXPBARCOM

         */
         A2524DisComLin = AV8DisComLin ;
         A1056DisComCod = AV9DisComCod ;
         A1032FonCod = AV10FonCod ;
         A1539BarComAnh = AV11BarAncSal1 ;
         n1539BarComAnh = false ;
         A1541BarComMtr = AV12BarMtr ;
         n1541BarComMtr = false ;
         A1543BarComPie = AV13BarNumPie ;
         n1543BarComPie = false ;
         /* Using cursor P01F95 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1539BarComAnh), Short.valueOf(A1539BarComAnh), Boolean.valueOf(n1541BarComMtr), A1541BarComMtr, Boolean.valueOf(n1543BarComPie), Short.valueOf(A1543BarComPie)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
         if ( (pr_default.getStatus(2) == 1) )
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
            INSERT RECORD ON TABLE TXPALBEST

         */
         A2524DisComLin = AV8DisComLin ;
         A1056DisComCod = AV9DisComCod ;
         A1032FonCod = AV10FonCod ;
         A2506AlbEstObs = "" ;
         n2506AlbEstObs = false ;
         A1533AlbEComM = DecimalUtil.doubleToDec(0) ;
         n1533AlbEComM = false ;
         A1534AlbEComP = (short)(0) ;
         n1534AlbEComP = false ;
         /* Using cursor P01F96 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1533AlbEComM), A1533AlbEComM, Boolean.valueOf(n1534AlbEComP), Short.valueOf(A1534AlbEComP), Boolean.valueOf(n2506AlbEstObs), A2506AlbEstObs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
         if ( (pr_default.getStatus(3) == 1) )
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
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palbest.this.A396EmprCod;
      this.aP1[0] = palbest.this.A30AlbProCod;
      this.aP2[0] = palbest.this.A129BarCod;
      this.aP3[0] = palbest.this.A132BarCodReo;
      this.aP4[0] = palbest.this.A130BarCodPar;
      this.aP5[0] = palbest.this.AV8DisComLin;
      this.aP6[0] = palbest.this.AV9DisComCod;
      this.aP7[0] = palbest.this.AV10FonCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "palbest");
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
      P01F93_A396EmprCod = new String[] {""} ;
      P01F93_A129BarCod = new int[1] ;
      P01F93_A132BarCodReo = new byte[1] ;
      P01F93_A130BarCodPar = new String[] {""} ;
      P01F93_A361DisCod = new int[1] ;
      P01F93_A3134BarAncSal1 = new short[1] ;
      P01F93_A125BarAncAca1 = new short[1] ;
      P01F93_A191BarNumPie = new short[1] ;
      P01F93_A362DisColNom = new String[] {""} ;
      P01F93_n362DisColNom = new boolean[] {false} ;
      P01F93_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01F93_n184BarMtr = new boolean[] {false} ;
      A362DisColNom = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV12BarMtr = DecimalUtil.ZERO ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A1058DisComMtr = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      A2506AlbEstObs = "" ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palbest__default(),
         new Object[] {
             new Object[] {
            P01F93_A396EmprCod, P01F93_A129BarCod, P01F93_A132BarCodReo, P01F93_A130BarCodPar, P01F93_A361DisCod, P01F93_A3134BarAncSal1, P01F93_A125BarAncAca1, P01F93_A191BarNumPie, P01F93_A362DisColNom, P01F93_n362DisColNom,
            P01F93_A184BarMtr, P01F93_n184BarMtr
            }
            , new Object[] {
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
   private byte AV8DisComLin ;
   private byte A2524DisComLin ;
   private short A3134BarAncSal1 ;
   private short A125BarAncAca1 ;
   private short A191BarNumPie ;
   private short AV11BarAncSal1 ;
   private short AV13BarNumPie ;
   private short A1057DisComAnh ;
   private short A1059DisComPie ;
   private short Gx_err ;
   private short A1539BarComAnh ;
   private short A1543BarComPie ;
   private short A1534AlbEComP ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int GX_INS551 ;
   private int GX_INS542 ;
   private int GX_INS533 ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV12BarMtr ;
   private java.math.BigDecimal A1058DisComMtr ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal A1533AlbEComM ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV9DisComCod ;
   private String AV10FonCod ;
   private String scmdbuf ;
   private String A362DisColNom ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String Gx_emsg ;
   private String A2506AlbEstObs ;
   private boolean n362DisColNom ;
   private boolean n184BarMtr ;
   private boolean n1057DisComAnh ;
   private boolean n1058DisComMtr ;
   private boolean n1059DisComPie ;
   private boolean n1539BarComAnh ;
   private boolean n1541BarComMtr ;
   private boolean n1543BarComPie ;
   private boolean n2506AlbEstObs ;
   private boolean n1533AlbEComM ;
   private boolean n1534AlbEComP ;
   private String[] aP7 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P01F93_A396EmprCod ;
   private int[] P01F93_A129BarCod ;
   private byte[] P01F93_A132BarCodReo ;
   private String[] P01F93_A130BarCodPar ;
   private int[] P01F93_A361DisCod ;
   private short[] P01F93_A3134BarAncSal1 ;
   private short[] P01F93_A125BarAncAca1 ;
   private short[] P01F93_A191BarNumPie ;
   private String[] P01F93_A362DisColNom ;
   private boolean[] P01F93_n362DisColNom ;
   private java.math.BigDecimal[] P01F93_A184BarMtr ;
   private boolean[] P01F93_n184BarMtr ;
}

final  class palbest__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01F93", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, T1.BarAncSal1, T1.BarAncAca1, T1.BarNumPie, T2.DisColNom, COALESCE( T3.BarMtr, 0) AS BarMtr FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01F94", "INSERT INTO TXPDISCOM(EmprCod, DisCod, DisComLin, DisComCod, FonCod, DisComAnh, DisComMtr, DisComPie, DisComObs, DisComDibC, DisComDibI) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISCOM")
         ,new UpdateCursor("P01F95", "INSERT INTO TXPBARCOM(EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarComAnh, BarComMtr, BarComPie, BarComMLan, BarComPLan, BarComPEst, BarComEst, BarMtrRep, BarMtrEst, BarGasOpe, BarGasEst, BarGasEmp, BarGasAca, BarPrcMtr, BarFecEst, RecEstAnh, BarNumMol, RecEstTMaq, BarCodLan, BarComPri, BarComRep, RecObsULin, BarComFC, BarComObs, BarMaqPor, CodMaqEst, OpeREst, OeStatus, OeFecHis, OeKill, BarFecFima, BarEstFima, BarComDibC, BarComDibI) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
         ,new UpdateCursor("P01F96", "INSERT INTO TXPALBEST(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, AlbEComM, AlbEComP, AlbEstObs, AlbEComPre, AlbEComUPz, DisComUtr) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEST")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setString(5, (String)parms[4], 12);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[12]).shortValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[13], 30);
               }
               return;
      }
   }

}

