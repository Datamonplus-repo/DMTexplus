package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pestpas extends GXProcedure
{
   public pestpas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pestpas.class ), "" );
   }

   public pestpas( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           String[] aP5 ,
                           String[] aP6 )
   {
      pestpas.this.aP7 = new byte[] {0};
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
                        byte[] aP7 )
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
                             byte[] aP7 )
   {
      pestpas.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pestpas.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pestpas.this.A2141SerEst = aP2[0];
      this.aP2 = aP2;
      pestpas.this.A1013DibCli = aP3[0];
      this.aP3 = aP3;
      pestpas.this.A1014DibInt = aP4[0];
      this.aP4 = aP4;
      pestpas.this.A2074ColCom = aP5[0];
      this.aP5 = aP5;
      pestpas.this.A2078ColFon = aP6[0];
      this.aP6 = aP6;
      pestpas.this.A2098MolCod = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P01DL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPASFOR");
      /* End optimized DELETE. */
      /* Optimized group. */
      /* Using cursor P01DL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      c2116PrdForCan = P01DL3_A2116PrdForCan[0] ;
      n2116PrdForCan = P01DL3_n2116PrdForCan[0] ;
      pr_default.close(1);
      AV9TotCol = AV9TotCol.add(c2116PrdForCan) ;
      /* End optimized group. */
      if ( ! ( AV9TotCol.doubleValue() == 0 ) )
      {
         /* Using cursor P01DL4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV9TotCol});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A4418EstPasMax = P01DL4_A4418EstPasMax[0] ;
            /* Using cursor P01DL5 */
            pr_default.execute(3, new Object[] {A396EmprCod, A4418EstPasMax});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A4419EstPasCnt = P01DL5_A4419EstPasCnt[0] ;
               n4419EstPasCnt = P01DL5_n4419EstPasCnt[0] ;
               A2144UniEstCod = P01DL5_A2144UniEstCod[0] ;
               n2144UniEstCod = P01DL5_n2144UniEstCod[0] ;
               A2107PasCod = P01DL5_A2107PasCod[0] ;
               n2107PasCod = P01DL5_n2107PasCod[0] ;
               AV10PasForLin = (short)(AV10PasForLin+1) ;
               /*
                  INSERT RECORD ON TABLE TXPPASFOR

               */
               A2654PasForLin = AV10PasForLin ;
               A2109PasForCan = A4419EstPasCnt ;
               n2109PasForCan = false ;
               /* Using cursor P01DL6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2654PasForLin), Boolean.valueOf(n2107PasCod), A2107PasCod, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod, Boolean.valueOf(n2109PasForCan), A2109PasForCan});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPASFOR");
               if ( (pr_default.getStatus(4) == 1) )
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
               pr_default.readNext(3);
            }
            pr_default.close(3);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pestpas.this.A396EmprCod;
      this.aP1[0] = pestpas.this.A252CliCod;
      this.aP2[0] = pestpas.this.A2141SerEst;
      this.aP3[0] = pestpas.this.A1013DibCli;
      this.aP4[0] = pestpas.this.A1014DibInt;
      this.aP5[0] = pestpas.this.A2074ColCom;
      this.aP6[0] = pestpas.this.A2078ColFon;
      this.aP7[0] = pestpas.this.A2098MolCod;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      c2116PrdForCan = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P01DL3_A2116PrdForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01DL3_n2116PrdForCan = new boolean[] {false} ;
      AV9TotCol = DecimalUtil.ZERO ;
      P01DL4_A396EmprCod = new String[] {""} ;
      P01DL4_A4418EstPasMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A4418EstPasMax = DecimalUtil.ZERO ;
      P01DL5_A396EmprCod = new String[] {""} ;
      P01DL5_A4418EstPasMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01DL5_A4419EstPasCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01DL5_n4419EstPasCnt = new boolean[] {false} ;
      P01DL5_A2144UniEstCod = new String[] {""} ;
      P01DL5_n2144UniEstCod = new boolean[] {false} ;
      P01DL5_A2107PasCod = new String[] {""} ;
      P01DL5_n2107PasCod = new boolean[] {false} ;
      A4419EstPasCnt = DecimalUtil.ZERO ;
      A2144UniEstCod = "" ;
      A2107PasCod = "" ;
      A2109PasForCan = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pestpas__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P01DL3_A2116PrdForCan, P01DL3_n2116PrdForCan
            }
            , new Object[] {
            P01DL4_A396EmprCod, P01DL4_A4418EstPasMax
            }
            , new Object[] {
            P01DL5_A396EmprCod, P01DL5_A4418EstPasMax, P01DL5_A4419EstPasCnt, P01DL5_n4419EstPasCnt, P01DL5_A2144UniEstCod, P01DL5_n2144UniEstCod, P01DL5_A2107PasCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2098MolCod ;
   private short AV10PasForLin ;
   private short A2654PasForLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int GX_INS581 ;
   private java.math.BigDecimal c2116PrdForCan ;
   private java.math.BigDecimal AV9TotCol ;
   private java.math.BigDecimal A4418EstPasMax ;
   private java.math.BigDecimal A4419EstPasCnt ;
   private java.math.BigDecimal A2109PasForCan ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String scmdbuf ;
   private String A2144UniEstCod ;
   private String A2107PasCod ;
   private String Gx_emsg ;
   private boolean n2116PrdForCan ;
   private boolean n4419EstPasCnt ;
   private boolean n2144UniEstCod ;
   private boolean n2107PasCod ;
   private boolean n2109PasForCan ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P01DL3_A2116PrdForCan ;
   private boolean[] P01DL3_n2116PrdForCan ;
   private String[] P01DL4_A396EmprCod ;
   private java.math.BigDecimal[] P01DL4_A4418EstPasMax ;
   private String[] P01DL5_A396EmprCod ;
   private java.math.BigDecimal[] P01DL5_A4418EstPasMax ;
   private java.math.BigDecimal[] P01DL5_A4419EstPasCnt ;
   private boolean[] P01DL5_n4419EstPasCnt ;
   private String[] P01DL5_A2144UniEstCod ;
   private boolean[] P01DL5_n2144UniEstCod ;
   private String[] P01DL5_A2107PasCod ;
   private boolean[] P01DL5_n2107PasCod ;
}

final  class pestpas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P01DL2", "DELETE FROM TXPPASFOR  WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPASFOR")
         ,new ForEachCursor("P01DL3", "SELECT SUM(PrdForCan) FROM TXPRECPR2 WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01DL4", "SELECT EmprCod, EstPasMax FROM TXPEstPas WHERE EmprCod = ? and EstPasMax >= ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01DL5", "SELECT EmprCod, EstPasMax, EstPasCnt, UniEstCod, PasCod FROM TXPEstPa1 WHERE EmprCod = ? and EstPasMax = ? ORDER BY EmprCod, EstPasMax ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01DL6", "INSERT INTO TXPPASFOR(EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin, PasCod, UniEstCod, PasForCan, PasForPre, PasForSob, PasForCon, PasForPar, PasForCanP) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPASFOR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
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
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[14], 3);
               }
               return;
      }
   }

}

