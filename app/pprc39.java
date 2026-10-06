package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc39 extends GXProcedure
{
   public pprc39( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc39.class ), "" );
   }

   public pprc39( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            short[] aP4 ,
                            String[] aP5 ,
                            byte[] aP6 ,
                            String[] aP7 ,
                            short[] aP8 ,
                            String[] aP9 ,
                            byte[] aP10 ,
                            String[] aP11 )
   {
      pprc39.this.aP12 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
      return aP12[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 ,
                        short[] aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             short[] aP12 )
   {
      pprc39.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc39.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pprc39.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprc39.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprc39.this.AV9BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pprc39.this.AV8FasDscA = aP5[0];
      this.aP5 = aP5;
      pprc39.this.AV11EstA = aP6[0];
      this.aP6 = aP6;
      pprc39.this.AV13BarlocA = aP7[0];
      this.aP7 = aP7;
      pprc39.this.AV15BarordlinA = aP8[0];
      this.aP8 = aP8;
      pprc39.this.AV10FasDscS = aP9[0];
      this.aP9 = aP9;
      pprc39.this.AV12EstS = aP10[0];
      this.aP10 = aP10;
      pprc39.this.AV14BarlocS = aP11[0];
      this.aP11 = aP11;
      pprc39.this.AV16BarordlinS = aP12[0];
      this.aP12 = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV17acabats2013 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AC2013", ""), GXv_int2) ;
      pprc39.this.GXt_int1 = GXv_int2[0] ;
      AV17acabats2013 = GXt_int1 ;
      AV8FasDscA = GXutil.space( (short)(15)) ;
      AV10FasDscS = GXutil.space( (short)(15)) ;
      AV13BarlocA = "" ;
      AV14BarlocS = "" ;
      AV11EstA = (byte)(9) ;
      AV12EstS = (byte)(9) ;
      AV15BarordlinA = (short)(0) ;
      AV16BarordlinS = (short)(0) ;
      /* Using cursor P05D92 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV9BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A152BarFasCon = P05D92_A152BarFasCon[0] ;
         A194BarOrdLin = P05D92_A194BarOrdLin[0] ;
         A457FasCod = P05D92_A457FasCod[0] ;
         A153BarFasEst = P05D92_A153BarFasEst[0] ;
         A460FasDsc = P05D92_A460FasDsc[0] ;
         A10032BarObsB = P05D92_A10032BarObsB[0] ;
         n10032BarObsB = P05D92_n10032BarObsB[0] ;
         A758ProCod = P05D92_A758ProCod[0] ;
         A460FasDsc = P05D92_A460FasDsc[0] ;
         if ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( ( AV17acabats2013 == 1 ) && ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "PRRA", "")) == 0 ) )
            {
            }
            else
            {
               AV11EstA = A153BarFasEst ;
               AV8FasDscA = GXutil.substring( A460FasDsc, 1, 15) ;
               AV13BarlocA = GXutil.substring( A10032BarObsB, 1, 25) ;
               AV15BarordlinA = A194BarOrdLin ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P05D93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV9BarOrdLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A457FasCod = P05D93_A457FasCod[0] ;
         A152BarFasCon = P05D93_A152BarFasCon[0] ;
         A194BarOrdLin = P05D93_A194BarOrdLin[0] ;
         A153BarFasEst = P05D93_A153BarFasEst[0] ;
         A460FasDsc = P05D93_A460FasDsc[0] ;
         A10032BarObsB = P05D93_A10032BarObsB[0] ;
         n10032BarObsB = P05D93_n10032BarObsB[0] ;
         A758ProCod = P05D93_A758ProCod[0] ;
         A460FasDsc = P05D93_A460FasDsc[0] ;
         if ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 )
         {
            AV12EstS = A153BarFasEst ;
            AV10FasDscS = GXutil.substring( A460FasDsc, 1, 15) ;
            AV14BarlocS = GXutil.substring( A10032BarObsB, 1, 25) ;
            AV16BarordlinS = A194BarOrdLin ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc39.this.A396EmprCod;
      this.aP1[0] = pprc39.this.A129BarCod;
      this.aP2[0] = pprc39.this.A132BarCodReo;
      this.aP3[0] = pprc39.this.A130BarCodPar;
      this.aP4[0] = pprc39.this.AV9BarOrdLin;
      this.aP5[0] = pprc39.this.AV8FasDscA;
      this.aP6[0] = pprc39.this.AV11EstA;
      this.aP7[0] = pprc39.this.AV13BarlocA;
      this.aP8[0] = pprc39.this.AV15BarordlinA;
      this.aP9[0] = pprc39.this.AV10FasDscS;
      this.aP10[0] = pprc39.this.AV12EstS;
      this.aP11[0] = pprc39.this.AV14BarlocS;
      this.aP12[0] = pprc39.this.AV16BarordlinS;
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
      P05D92_A396EmprCod = new String[] {""} ;
      P05D92_A129BarCod = new int[1] ;
      P05D92_A132BarCodReo = new byte[1] ;
      P05D92_A130BarCodPar = new String[] {""} ;
      P05D92_A152BarFasCon = new String[] {""} ;
      P05D92_A194BarOrdLin = new short[1] ;
      P05D92_A457FasCod = new String[] {""} ;
      P05D92_A153BarFasEst = new byte[1] ;
      P05D92_A460FasDsc = new String[] {""} ;
      P05D92_A10032BarObsB = new String[] {""} ;
      P05D92_n10032BarObsB = new boolean[] {false} ;
      P05D92_A758ProCod = new String[] {""} ;
      A152BarFasCon = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A10032BarObsB = "" ;
      A758ProCod = "" ;
      P05D93_A457FasCod = new String[] {""} ;
      P05D93_A396EmprCod = new String[] {""} ;
      P05D93_A129BarCod = new int[1] ;
      P05D93_A132BarCodReo = new byte[1] ;
      P05D93_A130BarCodPar = new String[] {""} ;
      P05D93_A152BarFasCon = new String[] {""} ;
      P05D93_A194BarOrdLin = new short[1] ;
      P05D93_A153BarFasEst = new byte[1] ;
      P05D93_A460FasDsc = new String[] {""} ;
      P05D93_A10032BarObsB = new String[] {""} ;
      P05D93_n10032BarObsB = new boolean[] {false} ;
      P05D93_A758ProCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc39__default(),
         new Object[] {
             new Object[] {
            P05D92_A396EmprCod, P05D92_A129BarCod, P05D92_A132BarCodReo, P05D92_A130BarCodPar, P05D92_A152BarFasCon, P05D92_A194BarOrdLin, P05D92_A457FasCod, P05D92_A153BarFasEst, P05D92_A460FasDsc, P05D92_A10032BarObsB,
            P05D92_n10032BarObsB, P05D92_A758ProCod
            }
            , new Object[] {
            P05D93_A457FasCod, P05D93_A396EmprCod, P05D93_A129BarCod, P05D93_A132BarCodReo, P05D93_A130BarCodPar, P05D93_A152BarFasCon, P05D93_A194BarOrdLin, P05D93_A153BarFasEst, P05D93_A460FasDsc, P05D93_A10032BarObsB,
            P05D93_n10032BarObsB, P05D93_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11EstA ;
   private byte AV12EstS ;
   private byte AV17acabats2013 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A153BarFasEst ;
   private short AV9BarOrdLin ;
   private short AV15BarordlinA ;
   private short AV16BarordlinS ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8FasDscA ;
   private String AV13BarlocA ;
   private String AV10FasDscS ;
   private String AV14BarlocS ;
   private String scmdbuf ;
   private String A152BarFasCon ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A758ProCod ;
   private boolean n10032BarObsB ;
   private String A10032BarObsB ;
   private short[] aP12 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private byte[] aP10 ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P05D92_A396EmprCod ;
   private int[] P05D92_A129BarCod ;
   private byte[] P05D92_A132BarCodReo ;
   private String[] P05D92_A130BarCodPar ;
   private String[] P05D92_A152BarFasCon ;
   private short[] P05D92_A194BarOrdLin ;
   private String[] P05D92_A457FasCod ;
   private byte[] P05D92_A153BarFasEst ;
   private String[] P05D92_A460FasDsc ;
   private String[] P05D92_A10032BarObsB ;
   private boolean[] P05D92_n10032BarObsB ;
   private String[] P05D92_A758ProCod ;
   private String[] P05D93_A457FasCod ;
   private String[] P05D93_A396EmprCod ;
   private int[] P05D93_A129BarCod ;
   private byte[] P05D93_A132BarCodReo ;
   private String[] P05D93_A130BarCodPar ;
   private String[] P05D93_A152BarFasCon ;
   private short[] P05D93_A194BarOrdLin ;
   private byte[] P05D93_A153BarFasEst ;
   private String[] P05D93_A460FasDsc ;
   private String[] P05D93_A10032BarObsB ;
   private boolean[] P05D93_n10032BarObsB ;
   private String[] P05D93_A758ProCod ;
}

final  class pprc39__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05D92", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasCon, T1.BarOrdLin, T1.FasCod, T1.BarFasEst, T2.FasDsc, T1.BarObsB, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.BarOrdLin < ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05D93", "SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasCon, T1.BarOrdLin, T1.BarFasEst, T2.FasDsc, T1.BarObsB, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarOrdLin > ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 28);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

