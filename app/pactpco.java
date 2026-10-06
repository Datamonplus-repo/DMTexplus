package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactpco extends GXProcedure
{
   public pactpco( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactpco.class ), "" );
   }

   public pactpco( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           long[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 ,
                                           byte[] aP5 ,
                                           String[] aP6 ,
                                           String[] aP7 )
   {
      pactpco.this.aP8 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      pactpco.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactpco.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pactpco.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pactpco.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pactpco.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pactpco.this.A2524DisComLin = aP5[0];
      this.aP5 = aP5;
      pactpco.this.A1056DisComCod = aP6[0];
      this.aP6 = aP6;
      pactpco.this.A1032FonCod = aP7[0];
      this.aP7 = aP7;
      pactpco.this.AV15PreDib = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00XP2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1536AlbEComPre = P00XP2_A1536AlbEComPre[0] ;
         n1536AlbEComPre = P00XP2_n1536AlbEComPre[0] ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1536AlbEComPre)==0) )
         {
            A1536AlbEComPre = AV15PreDib ;
            n1536AlbEComPre = false ;
         }
         /* Using cursor P00XP3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n1536AlbEComPre), A1536AlbEComPre, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P00XP4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2517BarPrcMtr = P00XP4_A2517BarPrcMtr[0] ;
         n2517BarPrcMtr = P00XP4_n2517BarPrcMtr[0] ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2517BarPrcMtr)==0) )
         {
            A2517BarPrcMtr = AV15PreDib ;
            n2517BarPrcMtr = false ;
         }
         /* Using cursor P00XP5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n2517BarPrcMtr), A2517BarPrcMtr, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactpco.this.A396EmprCod;
      this.aP1[0] = pactpco.this.A30AlbProCod;
      this.aP2[0] = pactpco.this.A129BarCod;
      this.aP3[0] = pactpco.this.A132BarCodReo;
      this.aP4[0] = pactpco.this.A130BarCodPar;
      this.aP5[0] = pactpco.this.A2524DisComLin;
      this.aP6[0] = pactpco.this.A1056DisComCod;
      this.aP7[0] = pactpco.this.A1032FonCod;
      this.aP8[0] = pactpco.this.AV15PreDib;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactpco");
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
      P00XP2_A396EmprCod = new String[] {""} ;
      P00XP2_A30AlbProCod = new long[1] ;
      P00XP2_A129BarCod = new int[1] ;
      P00XP2_A132BarCodReo = new byte[1] ;
      P00XP2_A130BarCodPar = new String[] {""} ;
      P00XP2_A2524DisComLin = new byte[1] ;
      P00XP2_A1056DisComCod = new String[] {""} ;
      P00XP2_A1032FonCod = new String[] {""} ;
      P00XP2_A1536AlbEComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00XP2_n1536AlbEComPre = new boolean[] {false} ;
      A1536AlbEComPre = DecimalUtil.ZERO ;
      P00XP4_A396EmprCod = new String[] {""} ;
      P00XP4_A129BarCod = new int[1] ;
      P00XP4_A132BarCodReo = new byte[1] ;
      P00XP4_A130BarCodPar = new String[] {""} ;
      P00XP4_A2524DisComLin = new byte[1] ;
      P00XP4_A1056DisComCod = new String[] {""} ;
      P00XP4_A1032FonCod = new String[] {""} ;
      P00XP4_A2517BarPrcMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00XP4_n2517BarPrcMtr = new boolean[] {false} ;
      A2517BarPrcMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactpco__default(),
         new Object[] {
             new Object[] {
            P00XP2_A396EmprCod, P00XP2_A30AlbProCod, P00XP2_A129BarCod, P00XP2_A132BarCodReo, P00XP2_A130BarCodPar, P00XP2_A2524DisComLin, P00XP2_A1056DisComCod, P00XP2_A1032FonCod, P00XP2_A1536AlbEComPre, P00XP2_n1536AlbEComPre
            }
            , new Object[] {
            }
            , new Object[] {
            P00XP4_A396EmprCod, P00XP4_A129BarCod, P00XP4_A132BarCodReo, P00XP4_A130BarCodPar, P00XP4_A2524DisComLin, P00XP4_A1056DisComCod, P00XP4_A1032FonCod, P00XP4_A2517BarPrcMtr, P00XP4_n2517BarPrcMtr
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV15PreDib ;
   private java.math.BigDecimal A1536AlbEComPre ;
   private java.math.BigDecimal A2517BarPrcMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String scmdbuf ;
   private boolean n1536AlbEComPre ;
   private boolean n2517BarPrcMtr ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P00XP2_A396EmprCod ;
   private long[] P00XP2_A30AlbProCod ;
   private int[] P00XP2_A129BarCod ;
   private byte[] P00XP2_A132BarCodReo ;
   private String[] P00XP2_A130BarCodPar ;
   private byte[] P00XP2_A2524DisComLin ;
   private String[] P00XP2_A1056DisComCod ;
   private String[] P00XP2_A1032FonCod ;
   private java.math.BigDecimal[] P00XP2_A1536AlbEComPre ;
   private boolean[] P00XP2_n1536AlbEComPre ;
   private String[] P00XP4_A396EmprCod ;
   private int[] P00XP4_A129BarCod ;
   private byte[] P00XP4_A132BarCodReo ;
   private String[] P00XP4_A130BarCodPar ;
   private byte[] P00XP4_A2524DisComLin ;
   private String[] P00XP4_A1056DisComCod ;
   private String[] P00XP4_A1032FonCod ;
   private java.math.BigDecimal[] P00XP4_A2517BarPrcMtr ;
   private boolean[] P00XP4_n2517BarPrcMtr ;
}

final  class pactpco__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00XP2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, AlbEComPre FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00XP3", "UPDATE TXPALBEST SET AlbEComPre=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEST")
         ,new ForEachCursor("P00XP4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarPrcMtr FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00XP5", "UPDATE TXPBARCOM SET BarPrcMtr=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 12);
               stmt.setString(9, (String)parms[9], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 12);
               return;
      }
   }

}

