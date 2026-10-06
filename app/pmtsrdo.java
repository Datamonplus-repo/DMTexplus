package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmtsrdo extends GXProcedure
{
   public pmtsrdo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmtsrdo.class ), "" );
   }

   public pmtsrdo( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pmtsrdo.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pmtsrdo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmtsrdo.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pmtsrdo.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pmtsrdo.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FlagMfR = (byte)(0) ;
      GXv_int1[0] = AV8FlagMfR ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MTSRDO", ""), GXv_int1) ;
      pmtsrdo.this.AV8FlagMfR = GXv_int1[0] ;
      GXv_int1[0] = AV9FlagGm2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MTSGM2", ""), GXv_int1) ;
      pmtsrdo.this.AV9FlagGm2 = GXv_int1[0] ;
      /* Using cursor P00WE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A864BarPes = P00WE2_A864BarPes[0] ;
         A125BarAncAca1 = P00WE2_A125BarAncAca1[0] ;
         AV14BarPes = A864BarPes ;
         AV10Ancho = DecimalUtil.doubleToDec(A125BarAncAca1/ (double) (100)) ;
         AV16Grm = A125BarAncAca1 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV8FlagMfR == 1 )
      {
         /* Using cursor P00WE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A200BarPieCod = P00WE3_A200BarPieCod[0] ;
            A44AlbRecCod = P00WE3_A44AlbRecCod[0] ;
            A361DisCod = P00WE3_A361DisCod[0] ;
            A211BarRdt = P00WE3_A211BarRdt[0] ;
            A228BarUniMed = P00WE3_A228BarUniMed[0] ;
            A203BarPieKil = P00WE3_A203BarPieKil[0] ;
            A205BarPieMet = P00WE3_A205BarPieMet[0] ;
            A361DisCod = P00WE3_A361DisCod[0] ;
            A211BarRdt = P00WE3_A211BarRdt[0] ;
            A228BarUniMed = P00WE3_A228BarUniMed[0] ;
            if ( ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A211BarRdt)==0) )
            {
               A205BarPieMet = A203BarPieKil.multiply(A211BarRdt) ;
               AV12DisPieMet = A203BarPieKil.multiply(A211BarRdt) ;
               /* Optimized UPDATE. */
               /* Using cursor P00WE4 */
               pr_default.execute(2, new Object[] {AV12DisPieMet, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
               /* End optimized UPDATE. */
            }
            /* Using cursor P00WE5 */
            pr_default.execute(3, new Object[] {A205BarPieMet, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      if ( AV9FlagGm2 == 1 )
      {
         /* Using cursor P00WE6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A200BarPieCod = P00WE6_A200BarPieCod[0] ;
            A44AlbRecCod = P00WE6_A44AlbRecCod[0] ;
            A361DisCod = P00WE6_A361DisCod[0] ;
            A228BarUniMed = P00WE6_A228BarUniMed[0] ;
            A125BarAncAca1 = P00WE6_A125BarAncAca1[0] ;
            A1909BarGraAca = P00WE6_A1909BarGraAca[0] ;
            A203BarPieKil = P00WE6_A203BarPieKil[0] ;
            A205BarPieMet = P00WE6_A205BarPieMet[0] ;
            A361DisCod = P00WE6_A361DisCod[0] ;
            A228BarUniMed = P00WE6_A228BarUniMed[0] ;
            A125BarAncAca1 = P00WE6_A125BarAncAca1[0] ;
            A1909BarGraAca = P00WE6_A1909BarGraAca[0] ;
            if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               AV10Ancho = DecimalUtil.doubleToDec(A125BarAncAca1/ (double) (100)) ;
               if ( (DecimalUtil.doubleToDec(A1909BarGraAca).multiply(AV10Ancho)).doubleValue() > 0 )
               {
                  AV11MetrosT = (A203BarPieKil.divide((DecimalUtil.doubleToDec(A1909BarGraAca).multiply(AV10Ancho)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) ;
               }
               else
               {
                  AV11MetrosT = DecimalUtil.doubleToDec(0) ;
               }
               A205BarPieMet = AV11MetrosT ;
               AV12DisPieMet = AV11MetrosT ;
               /* Optimized UPDATE. */
               /* Using cursor P00WE7 */
               pr_default.execute(5, new Object[] {AV11MetrosT, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
               /* End optimized UPDATE. */
            }
            else
            {
               if ( AV14BarPes > 0 )
               {
                  AV13Kgs = (A205BarPieMet.multiply(DecimalUtil.doubleToDec(AV14BarPes))).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               }
               else
               {
                  AV10Ancho = DecimalUtil.doubleToDec(AV16Grm/ (double) (100)) ;
                  AV13Kgs = DecimalUtil.doubleToDec(0) ;
                  if ( (DecimalUtil.doubleToDec(AV16Grm).multiply(AV10Ancho)).doubleValue() > 0 )
                  {
                     AV15Var1 = (DecimalUtil.doubleToDec(AV16Grm).multiply(AV10Ancho)) ;
                     AV13Kgs = A205BarPieMet.multiply(AV15Var1) ;
                  }
               }
               A203BarPieKil = AV13Kgs ;
               /* Optimized UPDATE. */
               /* Using cursor P00WE8 */
               pr_default.execute(6, new Object[] {AV13Kgs, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
               /* End optimized UPDATE. */
            }
            /* Using cursor P00WE9 */
            pr_default.execute(7, new Object[] {A203BarPieKil, A205BarPieMet, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
            pr_default.readNext(4);
         }
         pr_default.close(4);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmtsrdo.this.A396EmprCod;
      this.aP1[0] = pmtsrdo.this.A129BarCod;
      this.aP2[0] = pmtsrdo.this.A132BarCodReo;
      this.aP3[0] = pmtsrdo.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmtsrdo");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P00WE2_A396EmprCod = new String[] {""} ;
      P00WE2_A129BarCod = new int[1] ;
      P00WE2_A132BarCodReo = new byte[1] ;
      P00WE2_A130BarCodPar = new String[] {""} ;
      P00WE2_A864BarPes = new short[1] ;
      P00WE2_A125BarAncAca1 = new short[1] ;
      AV10Ancho = DecimalUtil.ZERO ;
      P00WE3_A396EmprCod = new String[] {""} ;
      P00WE3_A129BarCod = new int[1] ;
      P00WE3_A132BarCodReo = new byte[1] ;
      P00WE3_A130BarCodPar = new String[] {""} ;
      P00WE3_A200BarPieCod = new String[] {""} ;
      P00WE3_A44AlbRecCod = new int[1] ;
      P00WE3_A361DisCod = new int[1] ;
      P00WE3_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WE3_A228BarUniMed = new String[] {""} ;
      P00WE3_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WE3_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A200BarPieCod = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A228BarUniMed = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      AV12DisPieMet = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      P00WE6_A396EmprCod = new String[] {""} ;
      P00WE6_A129BarCod = new int[1] ;
      P00WE6_A132BarCodReo = new byte[1] ;
      P00WE6_A130BarCodPar = new String[] {""} ;
      P00WE6_A200BarPieCod = new String[] {""} ;
      P00WE6_A44AlbRecCod = new int[1] ;
      P00WE6_A361DisCod = new int[1] ;
      P00WE6_A228BarUniMed = new String[] {""} ;
      P00WE6_A125BarAncAca1 = new short[1] ;
      P00WE6_A1909BarGraAca = new short[1] ;
      P00WE6_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00WE6_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV11MetrosT = DecimalUtil.ZERO ;
      AV13Kgs = DecimalUtil.ZERO ;
      AV15Var1 = DecimalUtil.ZERO ;
      A382DisPieKil = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmtsrdo__default(),
         new Object[] {
             new Object[] {
            P00WE2_A396EmprCod, P00WE2_A129BarCod, P00WE2_A132BarCodReo, P00WE2_A130BarCodPar, P00WE2_A864BarPes, P00WE2_A125BarAncAca1
            }
            , new Object[] {
            P00WE3_A396EmprCod, P00WE3_A129BarCod, P00WE3_A132BarCodReo, P00WE3_A130BarCodPar, P00WE3_A200BarPieCod, P00WE3_A44AlbRecCod, P00WE3_A361DisCod, P00WE3_A211BarRdt, P00WE3_A228BarUniMed, P00WE3_A203BarPieKil,
            P00WE3_A205BarPieMet
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00WE6_A396EmprCod, P00WE6_A129BarCod, P00WE6_A132BarCodReo, P00WE6_A130BarCodPar, P00WE6_A200BarPieCod, P00WE6_A44AlbRecCod, P00WE6_A361DisCod, P00WE6_A228BarUniMed, P00WE6_A125BarAncAca1, P00WE6_A1909BarGraAca,
            P00WE6_A203BarPieKil, P00WE6_A205BarPieMet
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
   private byte AV8FlagMfR ;
   private byte AV9FlagGm2 ;
   private byte GXv_int1[] ;
   private short A864BarPes ;
   private short A125BarAncAca1 ;
   private short AV14BarPes ;
   private short AV16Grm ;
   private short A1909BarGraAca ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int A361DisCod ;
   private java.math.BigDecimal AV10Ancho ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV12DisPieMet ;
   private java.math.BigDecimal A384DisPieMet ;
   private java.math.BigDecimal AV11MetrosT ;
   private java.math.BigDecimal AV13Kgs ;
   private java.math.BigDecimal AV15Var1 ;
   private java.math.BigDecimal A382DisPieKil ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A200BarPieCod ;
   private String A228BarUniMed ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00WE2_A396EmprCod ;
   private int[] P00WE2_A129BarCod ;
   private byte[] P00WE2_A132BarCodReo ;
   private String[] P00WE2_A130BarCodPar ;
   private short[] P00WE2_A864BarPes ;
   private short[] P00WE2_A125BarAncAca1 ;
   private String[] P00WE3_A396EmprCod ;
   private int[] P00WE3_A129BarCod ;
   private byte[] P00WE3_A132BarCodReo ;
   private String[] P00WE3_A130BarCodPar ;
   private String[] P00WE3_A200BarPieCod ;
   private int[] P00WE3_A44AlbRecCod ;
   private int[] P00WE3_A361DisCod ;
   private java.math.BigDecimal[] P00WE3_A211BarRdt ;
   private String[] P00WE3_A228BarUniMed ;
   private java.math.BigDecimal[] P00WE3_A203BarPieKil ;
   private java.math.BigDecimal[] P00WE3_A205BarPieMet ;
   private String[] P00WE6_A396EmprCod ;
   private int[] P00WE6_A129BarCod ;
   private byte[] P00WE6_A132BarCodReo ;
   private String[] P00WE6_A130BarCodPar ;
   private String[] P00WE6_A200BarPieCod ;
   private int[] P00WE6_A44AlbRecCod ;
   private int[] P00WE6_A361DisCod ;
   private String[] P00WE6_A228BarUniMed ;
   private short[] P00WE6_A125BarAncAca1 ;
   private short[] P00WE6_A1909BarGraAca ;
   private java.math.BigDecimal[] P00WE6_A203BarPieKil ;
   private java.math.BigDecimal[] P00WE6_A205BarPieMet ;
}

final  class pmtsrdo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00WE2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPes, BarAncAca1 FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00WE3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.AlbRecCod, T2.DisCod, T2.BarRdt, T2.BarUniMed, T1.BarPieKil, T1.BarPieMet FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00WE4", "UPDATE TXPDISALD SET DisPieMet=?  WHERE (EmprCod = ? and DisCod = ? and AlbRecCod = ?) AND (DisPieCod = SUBSTR(?, 1, 8))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P00WE5", "UPDATE TXPBARPIE SET BarPieMet=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P00WE6", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod, T1.AlbRecCod, T2.DisCod, T2.BarUniMed, T2.BarAncAca1, T2.BarGraAca, T1.BarPieKil, T1.BarPieMet FROM (TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00WE7", "UPDATE TXPDISALD SET DisPieMet=?  WHERE (EmprCod = ? and DisCod = ? and AlbRecCod = ?) AND (DisPieCod = SUBSTR(?, 1, 8))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P00WE8", "UPDATE TXPDISALD SET DisPieKil=?  WHERE (EmprCod = ? and DisCod = ? and AlbRecCod = ?) AND (DisPieCod = SUBSTR(?, 1, 8))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISALD")
         ,new UpdateCursor("P00WE9", "UPDATE TXPBARPIE SET BarPieKil=?, BarPieMet=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
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
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 7 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 9);
               return;
      }
   }

}

