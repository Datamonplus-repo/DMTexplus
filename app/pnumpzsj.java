package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnumpzsj extends GXProcedure
{
   public pnumpzsj( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnumpzsj.class ), "" );
   }

   public pnumpzsj( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pnumpzsj.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pnumpzsj.this.AV17EmprCod = aP0[0];
      this.aP0 = aP0;
      pnumpzsj.this.A2809MetTerCod = aP1[0];
      this.aP1 = aP1;
      pnumpzsj.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pnumpzsj.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pnumpzsj.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pnumpzsj.this.AV28MetPieObs = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Barordlin = (short)(GXutil.lval( GXutil.substring( AV28MetPieObs, 18, 8))) ;
      /* Using cursor P04P22 */
      pr_default.execute(0, new Object[] {A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P04P22_A396EmprCod[0] ;
         A13006MetPieTurn = P04P22_A13006MetPieTurn[0] ;
         A13005MetPieOpe = P04P22_A13005MetPieOpe[0] ;
         A12994MetPieDfUl = P04P22_A12994MetPieDfUl[0] ;
         A4917MetPieObs = P04P22_A4917MetPieObs[0] ;
         A4916MetPieMue = P04P22_A4916MetPieMue[0] ;
         A4915MetPieDCP = P04P22_A4915MetPieDCP[0] ;
         A4914MetPieRap = P04P22_A4914MetPieRap[0] ;
         A4913MetPieLoc = P04P22_A4913MetPieLoc[0] ;
         A4912MetPiePDo = P04P22_A4912MetPiePDo[0] ;
         A4911MetPieCol = P04P22_A4911MetPieCol[0] ;
         A10784MetPieId = P04P22_A10784MetPieId[0] ;
         A10780MetPiectr = P04P22_A10780MetPiectr[0] ;
         A10779MetPieOb = P04P22_A10779MetPieOb[0] ;
         A6635MetPieAnc = P04P22_A6635MetPieAnc[0] ;
         A5136MetPieFch = P04P22_A5136MetPieFch[0] ;
         A4910MetPieMtD = P04P22_A4910MetPieMtD[0] ;
         A4909MetPieDef = P04P22_A4909MetPieDef[0] ;
         A2846MetPieDsc = P04P22_A2846MetPieDsc[0] ;
         A2816MetPieEst = P04P22_A2816MetPieEst[0] ;
         A2815MetPieMet = P04P22_A2815MetPieMet[0] ;
         A2814MetPieKil = P04P22_A2814MetPieKil[0] ;
         A2813MetPieCod = P04P22_A2813MetPieCod[0] ;
         AV29ValNum = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
         if ( AV29ValNum == AV27Barordlin )
         {
            /*
               INSERT RECORD ON TABLE TXPLMETPI

            */
            W396EmprCod = A396EmprCod ;
            W2809MetTerCod = A2809MetTerCod ;
            W129BarCod = A129BarCod ;
            W132BarCodReo = A132BarCodReo ;
            W130BarCodPar = A130BarCodPar ;
            W2813MetPieCod = A2813MetPieCod ;
            A396EmprCod = AV17EmprCod ;
            /* Using cursor P04P23 */
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
            A396EmprCod = W396EmprCod ;
            A2809MetTerCod = W2809MetTerCod ;
            A129BarCod = W129BarCod ;
            A132BarCodReo = W132BarCodReo ;
            A130BarCodPar = W130BarCodPar ;
            A2813MetPieCod = W2813MetPieCod ;
            /* End Insert */
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P04P24 */
      pr_default.execute(2, new Object[] {A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = P04P24_A396EmprCod[0] ;
         A4917MetPieObs = P04P24_A4917MetPieObs[0] ;
         A2813MetPieCod = P04P24_A2813MetPieCod[0] ;
         AV29ValNum = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
         if ( AV29ValNum == AV27Barordlin )
         {
            /* Using cursor P04P25 */
            pr_default.execute(3, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A2813MetPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMETPI");
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnumpzsj.this.AV17EmprCod;
      this.aP1[0] = pnumpzsj.this.A2809MetTerCod;
      this.aP2[0] = pnumpzsj.this.A129BarCod;
      this.aP3[0] = pnumpzsj.this.A132BarCodReo;
      this.aP4[0] = pnumpzsj.this.A130BarCodPar;
      this.aP5[0] = pnumpzsj.this.AV28MetPieObs;
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
      P04P22_A2809MetTerCod = new String[] {""} ;
      P04P22_A129BarCod = new int[1] ;
      P04P22_A132BarCodReo = new byte[1] ;
      P04P22_A130BarCodPar = new String[] {""} ;
      P04P22_A396EmprCod = new String[] {""} ;
      P04P22_A13006MetPieTurn = new byte[1] ;
      P04P22_A13005MetPieOpe = new int[1] ;
      P04P22_A12994MetPieDfUl = new short[1] ;
      P04P22_A4917MetPieObs = new String[] {""} ;
      P04P22_A4916MetPieMue = new String[] {""} ;
      P04P22_A4915MetPieDCP = new String[] {""} ;
      P04P22_A4914MetPieRap = new String[] {""} ;
      P04P22_A4913MetPieLoc = new String[] {""} ;
      P04P22_A4912MetPiePDo = new long[1] ;
      P04P22_A4911MetPieCol = new String[] {""} ;
      P04P22_A10784MetPieId = new String[] {""} ;
      P04P22_A10780MetPiectr = new String[] {""} ;
      P04P22_A10779MetPieOb = new String[] {""} ;
      P04P22_A6635MetPieAnc = new short[1] ;
      P04P22_A5136MetPieFch = new java.util.Date[] {GXutil.nullDate()} ;
      P04P22_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04P22_A4909MetPieDef = new short[1] ;
      P04P22_A2846MetPieDsc = new String[] {""} ;
      P04P22_A2816MetPieEst = new byte[1] ;
      P04P22_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04P22_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04P22_A2813MetPieCod = new String[] {""} ;
      A396EmprCod = "" ;
      A4917MetPieObs = "" ;
      A4916MetPieMue = "" ;
      A4915MetPieDCP = "" ;
      A4914MetPieRap = "" ;
      A4913MetPieLoc = "" ;
      A4911MetPieCol = "" ;
      A10784MetPieId = "" ;
      A10780MetPiectr = "" ;
      A10779MetPieOb = "" ;
      A5136MetPieFch = GXutil.nullDate() ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A2846MetPieDsc = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A2813MetPieCod = "" ;
      W396EmprCod = "" ;
      W2809MetTerCod = "" ;
      W130BarCodPar = "" ;
      W2813MetPieCod = "" ;
      Gx_emsg = "" ;
      P04P24_A2809MetTerCod = new String[] {""} ;
      P04P24_A129BarCod = new int[1] ;
      P04P24_A132BarCodReo = new byte[1] ;
      P04P24_A130BarCodPar = new String[] {""} ;
      P04P24_A396EmprCod = new String[] {""} ;
      P04P24_A4917MetPieObs = new String[] {""} ;
      P04P24_A2813MetPieCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnumpzsj__default(),
         new Object[] {
             new Object[] {
            P04P22_A2809MetTerCod, P04P22_A129BarCod, P04P22_A132BarCodReo, P04P22_A130BarCodPar, P04P22_A396EmprCod, P04P22_A13006MetPieTurn, P04P22_A13005MetPieOpe, P04P22_A12994MetPieDfUl, P04P22_A4917MetPieObs, P04P22_A4916MetPieMue,
            P04P22_A4915MetPieDCP, P04P22_A4914MetPieRap, P04P22_A4913MetPieLoc, P04P22_A4912MetPiePDo, P04P22_A4911MetPieCol, P04P22_A10784MetPieId, P04P22_A10780MetPiectr, P04P22_A10779MetPieOb, P04P22_A6635MetPieAnc, P04P22_A5136MetPieFch,
            P04P22_A4910MetPieMtD, P04P22_A4909MetPieDef, P04P22_A2846MetPieDsc, P04P22_A2816MetPieEst, P04P22_A2815MetPieMet, P04P22_A2814MetPieKil, P04P22_A2813MetPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04P24_A2809MetTerCod, P04P24_A129BarCod, P04P24_A132BarCodReo, P04P24_A130BarCodPar, P04P24_A396EmprCod, P04P24_A4917MetPieObs, P04P24_A2813MetPieCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A13006MetPieTurn ;
   private byte A2816MetPieEst ;
   private byte W132BarCodReo ;
   private short AV27Barordlin ;
   private short A12994MetPieDfUl ;
   private short A6635MetPieAnc ;
   private short A4909MetPieDef ;
   private short AV29ValNum ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A13005MetPieOpe ;
   private int GX_INS413 ;
   private int W129BarCod ;
   private long A4912MetPiePDo ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private String AV17EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4916MetPieMue ;
   private String A4915MetPieDCP ;
   private String A4914MetPieRap ;
   private String A4913MetPieLoc ;
   private String A4911MetPieCol ;
   private String A10784MetPieId ;
   private String A10780MetPiectr ;
   private String A10779MetPieOb ;
   private String A2846MetPieDsc ;
   private String A2813MetPieCod ;
   private String W396EmprCod ;
   private String W2809MetTerCod ;
   private String W130BarCodPar ;
   private String W2813MetPieCod ;
   private String Gx_emsg ;
   private java.util.Date A5136MetPieFch ;
   private String AV28MetPieObs ;
   private String A4917MetPieObs ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04P22_A2809MetTerCod ;
   private int[] P04P22_A129BarCod ;
   private byte[] P04P22_A132BarCodReo ;
   private String[] P04P22_A130BarCodPar ;
   private String[] P04P22_A396EmprCod ;
   private byte[] P04P22_A13006MetPieTurn ;
   private int[] P04P22_A13005MetPieOpe ;
   private short[] P04P22_A12994MetPieDfUl ;
   private String[] P04P22_A4917MetPieObs ;
   private String[] P04P22_A4916MetPieMue ;
   private String[] P04P22_A4915MetPieDCP ;
   private String[] P04P22_A4914MetPieRap ;
   private String[] P04P22_A4913MetPieLoc ;
   private long[] P04P22_A4912MetPiePDo ;
   private String[] P04P22_A4911MetPieCol ;
   private String[] P04P22_A10784MetPieId ;
   private String[] P04P22_A10780MetPiectr ;
   private String[] P04P22_A10779MetPieOb ;
   private short[] P04P22_A6635MetPieAnc ;
   private java.util.Date[] P04P22_A5136MetPieFch ;
   private java.math.BigDecimal[] P04P22_A4910MetPieMtD ;
   private short[] P04P22_A4909MetPieDef ;
   private String[] P04P22_A2846MetPieDsc ;
   private byte[] P04P22_A2816MetPieEst ;
   private java.math.BigDecimal[] P04P22_A2815MetPieMet ;
   private java.math.BigDecimal[] P04P22_A2814MetPieKil ;
   private String[] P04P22_A2813MetPieCod ;
   private String[] P04P24_A2809MetTerCod ;
   private int[] P04P24_A129BarCod ;
   private byte[] P04P24_A132BarCodReo ;
   private String[] P04P24_A130BarCodPar ;
   private String[] P04P24_A396EmprCod ;
   private String[] P04P24_A4917MetPieObs ;
   private String[] P04P24_A2813MetPieCod ;
}

final  class pnumpzsj__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04P22", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, EmprCod, MetPieTurn, MetPieOpe, MetPieDfUl, MetPieObs, MetPieMue, MetPieDCP, MetPieRap, MetPieLoc, MetPiePDo, MetPieCol, MetPieId, MetPiectr, MetPieOb, MetPieAnc, MetPieFch, MetPieMtD, MetPieDef, MetPieDsc, MetPieEst, MetPieMet, MetPieKil, MetPieCod FROM TXPLMETPI WHERE EmprCod = '999' and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04P23", "INSERT INTO TXPLMETPI(EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetPieKil, MetPieMet, MetPieEst, MetPieDsc, MetPieDef, MetPieMtD, MetPieFch, MetPieAnc, MetPieOb, MetPiectr, MetPieId, MetPieCol, MetPiePDo, MetPieLoc, MetPieRap, MetPieDCP, MetPieMue, MetPieObs, MetPieDfUl, MetPieOpe, MetPieTurn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
         ,new ForEachCursor("P04P24", "SELECT MetTerCod, BarCod, BarCodReo, BarCodPar, EmprCod, MetPieObs, MetPieCod FROM TXPLMETPI WHERE EmprCod = '999' and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04P25", "DELETE FROM TXPLMETPI  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MetPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMETPI")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((long[]) buf[13])[0] = rslt.getLong(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((String[]) buf[15])[0] = rslt.getString(16, 9);
               ((String[]) buf[16])[0] = rslt.getString(17, 40);
               ((String[]) buf[17])[0] = rslt.getString(18, 60);
               ((short[]) buf[18])[0] = rslt.getShort(19);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(20);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((short[]) buf[21])[0] = rslt.getShort(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 20);
               ((byte[]) buf[23])[0] = rslt.getByte(24);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(25,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(26,2);
               ((String[]) buf[26])[0] = rslt.getString(27, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setString(1, (String)parms[0], 10);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
      }
   }

}

