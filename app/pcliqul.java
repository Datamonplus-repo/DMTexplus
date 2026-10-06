package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcliqul extends GXProcedure
{
   public pcliqul( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcliqul.class ), "" );
   }

   public pcliqul( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      pcliqul.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 )
   {
      pcliqul.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcliqul.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pcliqul.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcliqul.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcliqul.this.AV15ProForCod = aP4[0];
      this.aP4 = aP4;
      pcliqul.this.AV14ClasCod = aP5[0];
      this.aP5 = aP5;
      pcliqul.this.AV8FasPreKgm = aP6[0];
      this.aP6 = aP6;
      pcliqul.this.AV13faspreMtr = aP7[0];
      this.aP7 = aP7;
      pcliqul.this.AV9FasCodFac = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8FasPreKgm = DecimalUtil.doubleToDec(0) ;
      AV13faspreMtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P01RF2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A212BarSer = P01RF2_A212BarSer[0] ;
         A252CliCod = P01RF2_A252CliCod[0] ;
         n252CliCod = P01RF2_n252CliCod[0] ;
         AV12CliCod = A252CliCod ;
         /* Using cursor P01RF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV12CliCod), AV15ProForCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5452P_ForCod = P01RF3_A5452P_ForCod[0] ;
            A252CliCod = P01RF3_A252CliCod[0] ;
            n252CliCod = P01RF3_n252CliCod[0] ;
            A5448ProForPK = P01RF3_A5448ProForPK[0] ;
            n5448ProForPK = P01RF3_n5448ProForPK[0] ;
            A5449ProForPP = P01RF3_A5449ProForPP[0] ;
            n5449ProForPP = P01RF3_n5449ProForPP[0] ;
            AV8FasPreKgm = A5448ProForPK ;
            AV13faspreMtr = A5449ProForPP ;
            if ( AV14ClasCod > 0 )
            {
               /* Using cursor P01RF4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV12CliCod), AV15ProForCod, Short.valueOf(AV14ClasCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A4295ClasCod = P01RF4_A4295ClasCod[0] ;
                  A5452P_ForCod = P01RF4_A5452P_ForCod[0] ;
                  A252CliCod = P01RF4_A252CliCod[0] ;
                  n252CliCod = P01RF4_n252CliCod[0] ;
                  A5450ProForPPK = P01RF4_A5450ProForPPK[0] ;
                  n5450ProForPPK = P01RF4_n5450ProForPPK[0] ;
                  A5451ProForPPP = P01RF4_A5451ProForPPP[0] ;
                  n5451ProForPPP = P01RF4_n5451ProForPPP[0] ;
                  AV8FasPreKgm = A5450ProForPPK ;
                  AV13faspreMtr = A5451ProForPPP ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(2);
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcliqul.this.A396EmprCod;
      this.aP1[0] = pcliqul.this.A129BarCod;
      this.aP2[0] = pcliqul.this.A132BarCodReo;
      this.aP3[0] = pcliqul.this.A130BarCodPar;
      this.aP4[0] = pcliqul.this.AV15ProForCod;
      this.aP5[0] = pcliqul.this.AV14ClasCod;
      this.aP6[0] = pcliqul.this.AV8FasPreKgm;
      this.aP7[0] = pcliqul.this.AV13faspreMtr;
      this.aP8[0] = pcliqul.this.AV9FasCodFac;
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
      P01RF2_A396EmprCod = new String[] {""} ;
      P01RF2_A129BarCod = new int[1] ;
      P01RF2_A132BarCodReo = new byte[1] ;
      P01RF2_A130BarCodPar = new String[] {""} ;
      P01RF2_A212BarSer = new String[] {""} ;
      P01RF2_A252CliCod = new int[1] ;
      P01RF2_n252CliCod = new boolean[] {false} ;
      A212BarSer = "" ;
      P01RF3_A396EmprCod = new String[] {""} ;
      P01RF3_A5452P_ForCod = new String[] {""} ;
      P01RF3_A252CliCod = new int[1] ;
      P01RF3_n252CliCod = new boolean[] {false} ;
      P01RF3_A5448ProForPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01RF3_n5448ProForPK = new boolean[] {false} ;
      P01RF3_A5449ProForPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01RF3_n5449ProForPP = new boolean[] {false} ;
      A5452P_ForCod = "" ;
      A5448ProForPK = DecimalUtil.ZERO ;
      A5449ProForPP = DecimalUtil.ZERO ;
      P01RF4_A396EmprCod = new String[] {""} ;
      P01RF4_A4295ClasCod = new short[1] ;
      P01RF4_A5452P_ForCod = new String[] {""} ;
      P01RF4_A252CliCod = new int[1] ;
      P01RF4_n252CliCod = new boolean[] {false} ;
      P01RF4_A5450ProForPPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01RF4_n5450ProForPPK = new boolean[] {false} ;
      P01RF4_A5451ProForPPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01RF4_n5451ProForPPP = new boolean[] {false} ;
      A5450ProForPPK = DecimalUtil.ZERO ;
      A5451ProForPPP = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcliqul__default(),
         new Object[] {
             new Object[] {
            P01RF2_A396EmprCod, P01RF2_A129BarCod, P01RF2_A132BarCodReo, P01RF2_A130BarCodPar, P01RF2_A212BarSer, P01RF2_A252CliCod, P01RF2_n252CliCod
            }
            , new Object[] {
            P01RF3_A396EmprCod, P01RF3_A5452P_ForCod, P01RF3_A252CliCod, P01RF3_A5448ProForPK, P01RF3_n5448ProForPK, P01RF3_A5449ProForPP, P01RF3_n5449ProForPP
            }
            , new Object[] {
            P01RF4_A396EmprCod, P01RF4_A4295ClasCod, P01RF4_A5452P_ForCod, P01RF4_A252CliCod, P01RF4_A5450ProForPPK, P01RF4_n5450ProForPPK, P01RF4_A5451ProForPPP, P01RF4_n5451ProForPPP
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV14ClasCod ;
   private short A4295ClasCod ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV12CliCod ;
   private java.math.BigDecimal AV8FasPreKgm ;
   private java.math.BigDecimal AV13faspreMtr ;
   private java.math.BigDecimal A5448ProForPK ;
   private java.math.BigDecimal A5449ProForPP ;
   private java.math.BigDecimal A5450ProForPPK ;
   private java.math.BigDecimal A5451ProForPPP ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV15ProForCod ;
   private String AV9FasCodFac ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A5452P_ForCod ;
   private boolean n252CliCod ;
   private boolean n5448ProForPK ;
   private boolean n5449ProForPP ;
   private boolean n5450ProForPPK ;
   private boolean n5451ProForPPP ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P01RF2_A396EmprCod ;
   private int[] P01RF2_A129BarCod ;
   private byte[] P01RF2_A132BarCodReo ;
   private String[] P01RF2_A130BarCodPar ;
   private String[] P01RF2_A212BarSer ;
   private int[] P01RF2_A252CliCod ;
   private boolean[] P01RF2_n252CliCod ;
   private String[] P01RF3_A396EmprCod ;
   private String[] P01RF3_A5452P_ForCod ;
   private int[] P01RF3_A252CliCod ;
   private boolean[] P01RF3_n252CliCod ;
   private java.math.BigDecimal[] P01RF3_A5448ProForPK ;
   private boolean[] P01RF3_n5448ProForPK ;
   private java.math.BigDecimal[] P01RF3_A5449ProForPP ;
   private boolean[] P01RF3_n5449ProForPP ;
   private String[] P01RF4_A396EmprCod ;
   private short[] P01RF4_A4295ClasCod ;
   private String[] P01RF4_A5452P_ForCod ;
   private int[] P01RF4_A252CliCod ;
   private boolean[] P01RF4_n252CliCod ;
   private java.math.BigDecimal[] P01RF4_A5450ProForPPK ;
   private boolean[] P01RF4_n5450ProForPPK ;
   private java.math.BigDecimal[] P01RF4_A5451ProForPPP ;
   private boolean[] P01RF4_n5451ProForPPP ;
}

final  class pcliqul__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01RF2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSer, CliCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01RF3", "SELECT EmprCod, P_ForCod, CliCod, ProForPK, ProForPP FROM TXPPREQL WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ORDER BY EmprCod, CliCod, P_ForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01RF4", "SELECT EmprCod, ClasCod, P_ForCod, CliCod, ProForPPK, ProForPPP FROM TXPPREQP WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? and ClasCod = ? ORDER BY EmprCod, CliCod, P_ForCod, ClasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

