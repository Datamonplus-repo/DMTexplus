package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pultpieza extends GXProcedure
{
   public pultpieza( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pultpieza.class ), "" );
   }

   public pultpieza( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pultpieza.this.aP1 = new long[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 )
   {
      pultpieza.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pultpieza.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01072 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1072 = false ;
         A3118AlbPTroAnc = P01072_A3118AlbPTroAnc[0] ;
         A42AlbPTroCod = P01072_A42AlbPTroCod[0] ;
         A200BarPieCod = P01072_A200BarPieCod[0] ;
         A130BarCodPar = P01072_A130BarCodPar[0] ;
         A132BarCodReo = P01072_A132BarCodReo[0] ;
         A129BarCod = P01072_A129BarCod[0] ;
         AV11P1ro = httpContext.getMessage( "S", "") ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P01072_A396EmprCod[0], A396EmprCod) == 0 ) && ( P01072_A30AlbProCod[0] == A30AlbProCod ) && ( P01072_A129BarCod[0] == A129BarCod ) && ( P01072_A132BarCodReo[0] == A132BarCodReo ) )
         {
            if ( ! ( ( GXutil.strcmp(P01072_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(P01072_A200BarPieCod[0], A200BarPieCod) == 0 ) ) )
            {
               if (true) break;
            }
            brk1072 = false ;
            A3118AlbPTroAnc = P01072_A3118AlbPTroAnc[0] ;
            A42AlbPTroCod = P01072_A42AlbPTroCod[0] ;
            if ( GXutil.strcmp(AV11P1ro, httpContext.getMessage( "S", "")) == 0 )
            {
               A3118AlbPTroAnc = (short)(99) ;
               AV11P1ro = httpContext.getMessage( "N", "") ;
            }
            /* Using cursor P01073 */
            pr_default.execute(1, new Object[] {Short.valueOf(A3118AlbPTroAnc), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
            brk1072 = true ;
            pr_default.readNext(0);
         }
         if ( ! brk1072 )
         {
            brk1072 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      /* Using cursor P01074 */
      pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A3118AlbPTroAnc = P01074_A3118AlbPTroAnc[0] ;
         A200BarPieCod = P01074_A200BarPieCod[0] ;
         A129BarCod = P01074_A129BarCod[0] ;
         A132BarCodReo = P01074_A132BarCodReo[0] ;
         A130BarCodPar = P01074_A130BarCodPar[0] ;
         A42AlbPTroCod = P01074_A42AlbPTroCod[0] ;
         if ( A3118AlbPTroAnc == 99 )
         {
            AV8BarPieCod = A200BarPieCod ;
            AV15BarCod = A129BarCod ;
            AV14BarCodReo = A132BarCodReo ;
            AV13BarCodPar = A130BarCodPar ;
            /* Execute user subroutine: 'ULTPIEZA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(AV9OK, httpContext.getMessage( "S", "")) == 0 )
            {
               A3118AlbPTroAnc = (short)(90) ;
            }
         }
         /* Using cursor P01075 */
         pr_default.execute(3, new Object[] {Short.valueOf(A3118AlbPTroAnc), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'ULTPIEZA' Routine */
      returnInSub = false ;
      AV9OK = httpContext.getMessage( "S", "") ;
      /* Using cursor P01076 */
      pr_default.execute(4, new Object[] {A396EmprCod, AV8BarPieCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A200BarPieCod = P01076_A200BarPieCod[0] ;
         A201BarPieEst = P01076_A201BarPieEst[0] ;
         A129BarCod = P01076_A129BarCod[0] ;
         A132BarCodReo = P01076_A132BarCodReo[0] ;
         A130BarCodPar = P01076_A130BarCodPar[0] ;
         if ( A201BarPieEst == 0 )
         {
            AV9OK = httpContext.getMessage( "N", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( GXutil.strcmp(AV9OK, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Using cursor P01077 */
         pr_default.execute(5, new Object[] {A396EmprCod, AV8BarPieCod});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A2159AlbRecPie = P01077_A2159AlbRecPie[0] ;
            A2157AlbRecMtr = P01077_A2157AlbRecMtr[0] ;
            A2158AlbRecMtrU = P01077_A2158AlbRecMtrU[0] ;
            A44AlbRecCod = P01077_A44AlbRecCod[0] ;
            if ( DecimalUtil.compareTo(A2158AlbRecMtrU, A2157AlbRecMtr) != 0 )
            {
               AV9OK = httpContext.getMessage( "N", "") ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pultpieza.this.A396EmprCod;
      this.aP1[0] = pultpieza.this.A30AlbProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pultpieza");
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
      P01072_A396EmprCod = new String[] {""} ;
      P01072_A30AlbProCod = new long[1] ;
      P01072_A3118AlbPTroAnc = new short[1] ;
      P01072_A42AlbPTroCod = new short[1] ;
      P01072_A200BarPieCod = new String[] {""} ;
      P01072_A130BarCodPar = new String[] {""} ;
      P01072_A132BarCodReo = new byte[1] ;
      P01072_A129BarCod = new int[1] ;
      A200BarPieCod = "" ;
      A130BarCodPar = "" ;
      AV11P1ro = "" ;
      P01074_A396EmprCod = new String[] {""} ;
      P01074_A30AlbProCod = new long[1] ;
      P01074_A3118AlbPTroAnc = new short[1] ;
      P01074_A200BarPieCod = new String[] {""} ;
      P01074_A129BarCod = new int[1] ;
      P01074_A132BarCodReo = new byte[1] ;
      P01074_A130BarCodPar = new String[] {""} ;
      P01074_A42AlbPTroCod = new short[1] ;
      AV8BarPieCod = "" ;
      AV13BarCodPar = "" ;
      AV9OK = "" ;
      P01076_A396EmprCod = new String[] {""} ;
      P01076_A200BarPieCod = new String[] {""} ;
      P01076_A201BarPieEst = new byte[1] ;
      P01076_A129BarCod = new int[1] ;
      P01076_A132BarCodReo = new byte[1] ;
      P01076_A130BarCodPar = new String[] {""} ;
      P01077_A396EmprCod = new String[] {""} ;
      P01077_A2159AlbRecPie = new String[] {""} ;
      P01077_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01077_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01077_A44AlbRecCod = new int[1] ;
      A2159AlbRecPie = "" ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pultpieza__default(),
         new Object[] {
             new Object[] {
            P01072_A396EmprCod, P01072_A30AlbProCod, P01072_A3118AlbPTroAnc, P01072_A42AlbPTroCod, P01072_A200BarPieCod, P01072_A130BarCodPar, P01072_A132BarCodReo, P01072_A129BarCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01074_A396EmprCod, P01074_A30AlbProCod, P01074_A3118AlbPTroAnc, P01074_A200BarPieCod, P01074_A129BarCod, P01074_A132BarCodReo, P01074_A130BarCodPar, P01074_A42AlbPTroCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01076_A396EmprCod, P01076_A200BarPieCod, P01076_A201BarPieEst, P01076_A129BarCod, P01076_A132BarCodReo, P01076_A130BarCodPar
            }
            , new Object[] {
            P01077_A396EmprCod, P01077_A2159AlbRecPie, P01077_A2157AlbRecMtr, P01077_A2158AlbRecMtrU, P01077_A44AlbRecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV14BarCodReo ;
   private byte A201BarPieEst ;
   private short A3118AlbPTroAnc ;
   private short A42AlbPTroCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV15BarCod ;
   private int A44AlbRecCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A130BarCodPar ;
   private String AV11P1ro ;
   private String AV8BarPieCod ;
   private String AV13BarCodPar ;
   private String AV9OK ;
   private String A2159AlbRecPie ;
   private boolean brk1072 ;
   private boolean returnInSub ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P01072_A396EmprCod ;
   private long[] P01072_A30AlbProCod ;
   private short[] P01072_A3118AlbPTroAnc ;
   private short[] P01072_A42AlbPTroCod ;
   private String[] P01072_A200BarPieCod ;
   private String[] P01072_A130BarCodPar ;
   private byte[] P01072_A132BarCodReo ;
   private int[] P01072_A129BarCod ;
   private String[] P01074_A396EmprCod ;
   private long[] P01074_A30AlbProCod ;
   private short[] P01074_A3118AlbPTroAnc ;
   private String[] P01074_A200BarPieCod ;
   private int[] P01074_A129BarCod ;
   private byte[] P01074_A132BarCodReo ;
   private String[] P01074_A130BarCodPar ;
   private short[] P01074_A42AlbPTroCod ;
   private String[] P01076_A396EmprCod ;
   private String[] P01076_A200BarPieCod ;
   private byte[] P01076_A201BarPieEst ;
   private int[] P01076_A129BarCod ;
   private byte[] P01076_A132BarCodReo ;
   private String[] P01076_A130BarCodPar ;
   private String[] P01077_A396EmprCod ;
   private String[] P01077_A2159AlbRecPie ;
   private java.math.BigDecimal[] P01077_A2157AlbRecMtr ;
   private java.math.BigDecimal[] P01077_A2158AlbRecMtrU ;
   private int[] P01077_A44AlbRecCod ;
}

final  class pultpieza__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01072", "SELECT EmprCod, AlbProCod, AlbPTroAnc, AlbPTroCod, BarPieCod, BarCodPar, BarCodReo, BarCod FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod DESC ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01073", "UPDATE TXPLALTRZ SET AlbPTroAnc=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALTRZ")
         ,new ForEachCursor("P01074", "SELECT EmprCod, AlbProCod, AlbPTroAnc, BarPieCod, BarCod, BarCodReo, BarCodPar, AlbPTroCod FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01075", "UPDATE TXPLALTRZ SET AlbPTroAnc=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLALTRZ")
         ,new ForEachCursor("P01076", "SELECT EmprCod, BarPieCod, BarPieEst, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE EmprCod = ? and BarPieCod = ? ORDER BY EmprCod, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01077", "SELECT EmprCod, AlbRecPie, AlbRecMtr, AlbRecMtrU, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecPie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               return;
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 9);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 9);
               return;
      }
   }

}

