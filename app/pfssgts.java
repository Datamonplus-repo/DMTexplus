package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfssgts extends GXProcedure
{
   public pfssgts( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfssgts.class ), "" );
   }

   public pfssgts( int remoteHandle ,
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
                             String[] aP6 )
   {
      pfssgts.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pfssgts.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfssgts.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfssgts.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfssgts.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfssgts.this.A758ProCod = aP4[0];
      this.aP4 = aP4;
      pfssgts.this.AV12Barordlin = aP5[0];
      this.aP5 = aP5;
      pfssgts.this.AV17usurcod = aP6[0];
      this.aP6 = aP6;
      pfssgts.this.AV18station = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13FasesSig = (byte)(0) ;
      /* Using cursor P059B2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(AV12Barordlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A152BarFasCon = P059B2_A152BarFasCon[0] ;
         A194BarOrdLin = P059B2_A194BarOrdLin[0] ;
         A153BarFasEst = P059B2_A153BarFasEst[0] ;
         A4442BarFasDTI = P059B2_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P059B2_n4442BarFasDTI[0] ;
         A457FasCod = P059B2_A457FasCod[0] ;
         A460FasDsc = P059B2_A460FasDsc[0] ;
         A460FasDsc = P059B2_A460FasDsc[0] ;
         if ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( A153BarFasEst > 0 )
            {
               AV13FasesSig = (byte)(1) ;
               AV14Barfasdti = A4442BarFasDTI ;
               AV19Fascod = A457FasCod ;
               AV20Fasdsc = A460FasDsc ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV13FasesSig == 1 )
      {
         /* Using cursor P059B3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(AV12Barordlin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A194BarOrdLin = P059B3_A194BarOrdLin[0] ;
            A460FasDsc = P059B3_A460FasDsc[0] ;
            A457FasCod = P059B3_A457FasCod[0] ;
            A153BarFasEst = P059B3_A153BarFasEst[0] ;
            A4442BarFasDTI = P059B3_A4442BarFasDTI[0] ;
            n4442BarFasDTI = P059B3_n4442BarFasDTI[0] ;
            A4443BarFasDTF = P059B3_A4443BarFasDTF[0] ;
            n4443BarFasDTF = P059B3_n4443BarFasDTF[0] ;
            A12359BarFasObs = P059B3_A12359BarFasObs[0] ;
            n12359BarFasObs = P059B3_n12359BarFasObs[0] ;
            A164BarHorFin = P059B3_A164BarHorFin[0] ;
            A215BarTieRea = P059B3_A215BarTieRea[0] ;
            A3837BarFasKgm = P059B3_A3837BarFasKgm[0] ;
            n3837BarFasKgm = P059B3_n3837BarFasKgm[0] ;
            A3838BarFasMtr = P059B3_A3838BarFasMtr[0] ;
            n3838BarFasMtr = P059B3_n3838BarFasMtr[0] ;
            A4636BarFasPzas = P059B3_A4636BarFasPzas[0] ;
            n4636BarFasPzas = P059B3_n4636BarFasPzas[0] ;
            A5719BarFasKgT = P059B3_A5719BarFasKgT[0] ;
            n5719BarFasKgT = P059B3_n5719BarFasKgT[0] ;
            A5720BarFasMtT = P059B3_A5720BarFasMtT[0] ;
            n5720BarFasMtT = P059B3_n5720BarFasMtT[0] ;
            A460FasDsc = P059B3_A460FasDsc[0] ;
            AV16Inc_obs = httpContext.getMessage( "Inconsistencia. Fase NO cerrada de forma correcta", "") + GXutil.newLine( ) ;
            AV16Inc_obs += httpContext.getMessage( "Orden + Fase ", "") + GXutil.trim( GXutil.str( A194BarOrdLin, 4, 0)) + " " + GXutil.trim( A457FasCod) + " " + GXutil.trim( A460FasDsc) + GXutil.newLine( ) ;
            AV16Inc_obs += httpContext.getMessage( "Estado       ", "") + GXutil.trim( GXutil.str( A153BarFasEst, 1, 0)) + httpContext.getMessage( " pasa a 2", "") + GXutil.newLine( ) ;
            AV16Inc_obs += httpContext.getMessage( "Fecha Fin    ", "") + GXutil.trim( localUtil.ttoc( A4443BarFasDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) + httpContext.getMessage( " pasa a ", "") + localUtil.ttoc( A4442BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            A12359BarFasObs = GXutil.trim( AV16Inc_obs) ;
            n12359BarFasObs = false ;
            A153BarFasEst = (byte)(2) ;
            AV15BarHorFin = (short)(GXutil.lval( GXutil.concat( GXutil.substring( GXutil.time( ), 1, 2), GXutil.substring( GXutil.time( ), 4, 2), ""))) ;
            A164BarHorFin = AV15BarHorFin ;
            A4443BarFasDTF = A4442BarFasDTI ;
            n4443BarFasDTF = false ;
            GXt_decimal1 = A215BarTieRea ;
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int4[0] = A132BarCodReo ;
            GXv_char5[0] = A130BarCodPar ;
            GXv_int6[0] = A194BarOrdLin ;
            GXv_decimal7[0] = GXt_decimal1 ;
            new app.ptierea2(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_int6, GXv_decimal7) ;
            pfssgts.this.A396EmprCod = GXv_char2[0] ;
            pfssgts.this.A129BarCod = GXv_int3[0] ;
            pfssgts.this.A132BarCodReo = GXv_int4[0] ;
            pfssgts.this.A130BarCodPar = GXv_char5[0] ;
            pfssgts.this.A194BarOrdLin = GXv_int6[0] ;
            pfssgts.this.GXt_decimal1 = GXv_decimal7[0] ;
            A215BarTieRea = GXt_decimal1 ;
            A3837BarFasKgm = DecimalUtil.doubleToDec(0) ;
            n3837BarFasKgm = false ;
            A3838BarFasMtr = DecimalUtil.doubleToDec(0) ;
            n3838BarFasMtr = false ;
            A4636BarFasPzas = 0 ;
            n4636BarFasPzas = false ;
            A5719BarFasKgT = DecimalUtil.doubleToDec(0) ;
            n5719BarFasKgT = false ;
            A5720BarFasMtT = DecimalUtil.doubleToDec(0) ;
            n5720BarFasMtT = false ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV26Pgmname, AV17usurcod, AV18station, AV16Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
            /* Using cursor P059B4 */
            pr_default.execute(2, new Object[] {Byte.valueOf(A153BarFasEst), Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, Boolean.valueOf(n12359BarFasObs), A12359BarFasObs, Short.valueOf(A164BarHorFin), A215BarTieRea, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, Boolean.valueOf(n4636BarFasPzas), Integer.valueOf(A4636BarFasPzas), Boolean.valueOf(n5719BarFasKgT), A5719BarFasKgT, Boolean.valueOf(n5720BarFasMtT), A5720BarFasMtT, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfssgts.this.A396EmprCod;
      this.aP1[0] = pfssgts.this.A129BarCod;
      this.aP2[0] = pfssgts.this.A132BarCodReo;
      this.aP3[0] = pfssgts.this.A130BarCodPar;
      this.aP4[0] = pfssgts.this.A758ProCod;
      this.aP5[0] = pfssgts.this.AV12Barordlin;
      this.aP6[0] = pfssgts.this.AV17usurcod;
      this.aP7[0] = pfssgts.this.AV18station;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfssgts");
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
      P059B2_A396EmprCod = new String[] {""} ;
      P059B2_A129BarCod = new int[1] ;
      P059B2_A132BarCodReo = new byte[1] ;
      P059B2_A130BarCodPar = new String[] {""} ;
      P059B2_A758ProCod = new String[] {""} ;
      P059B2_A152BarFasCon = new String[] {""} ;
      P059B2_A194BarOrdLin = new short[1] ;
      P059B2_A153BarFasEst = new byte[1] ;
      P059B2_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P059B2_n4442BarFasDTI = new boolean[] {false} ;
      P059B2_A457FasCod = new String[] {""} ;
      P059B2_A460FasDsc = new String[] {""} ;
      A152BarFasCon = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A457FasCod = "" ;
      A460FasDsc = "" ;
      AV14Barfasdti = GXutil.resetTime( GXutil.nullDate() );
      AV19Fascod = "" ;
      AV20Fasdsc = "" ;
      P059B3_A396EmprCod = new String[] {""} ;
      P059B3_A129BarCod = new int[1] ;
      P059B3_A132BarCodReo = new byte[1] ;
      P059B3_A130BarCodPar = new String[] {""} ;
      P059B3_A758ProCod = new String[] {""} ;
      P059B3_A194BarOrdLin = new short[1] ;
      P059B3_A460FasDsc = new String[] {""} ;
      P059B3_A457FasCod = new String[] {""} ;
      P059B3_A153BarFasEst = new byte[1] ;
      P059B3_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P059B3_n4442BarFasDTI = new boolean[] {false} ;
      P059B3_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P059B3_n4443BarFasDTF = new boolean[] {false} ;
      P059B3_A12359BarFasObs = new String[] {""} ;
      P059B3_n12359BarFasObs = new boolean[] {false} ;
      P059B3_A164BarHorFin = new short[1] ;
      P059B3_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P059B3_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P059B3_n3837BarFasKgm = new boolean[] {false} ;
      P059B3_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P059B3_n3838BarFasMtr = new boolean[] {false} ;
      P059B3_A4636BarFasPzas = new int[1] ;
      P059B3_n4636BarFasPzas = new boolean[] {false} ;
      P059B3_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P059B3_n5719BarFasKgT = new boolean[] {false} ;
      P059B3_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P059B3_n5720BarFasMtT = new boolean[] {false} ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A12359BarFasObs = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      AV16Inc_obs = "" ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV26Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfssgts__default(),
         new Object[] {
             new Object[] {
            P059B2_A396EmprCod, P059B2_A129BarCod, P059B2_A132BarCodReo, P059B2_A130BarCodPar, P059B2_A758ProCod, P059B2_A152BarFasCon, P059B2_A194BarOrdLin, P059B2_A153BarFasEst, P059B2_A4442BarFasDTI, P059B2_n4442BarFasDTI,
            P059B2_A457FasCod, P059B2_A460FasDsc
            }
            , new Object[] {
            P059B3_A396EmprCod, P059B3_A129BarCod, P059B3_A132BarCodReo, P059B3_A130BarCodPar, P059B3_A758ProCod, P059B3_A194BarOrdLin, P059B3_A460FasDsc, P059B3_A457FasCod, P059B3_A153BarFasEst, P059B3_A4442BarFasDTI,
            P059B3_n4442BarFasDTI, P059B3_A4443BarFasDTF, P059B3_n4443BarFasDTF, P059B3_A12359BarFasObs, P059B3_n12359BarFasObs, P059B3_A164BarHorFin, P059B3_A215BarTieRea, P059B3_A3837BarFasKgm, P059B3_n3837BarFasKgm, P059B3_A3838BarFasMtr,
            P059B3_n3838BarFasMtr, P059B3_A4636BarFasPzas, P059B3_n4636BarFasPzas, P059B3_A5719BarFasKgT, P059B3_n5719BarFasKgT, P059B3_A5720BarFasMtT, P059B3_n5720BarFasMtT
            }
            , new Object[] {
            }
         }
      );
      AV26Pgmname = "PFsSgts" ;
      /* GeneXus formulas. */
      AV26Pgmname = "PFsSgts" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV13FasesSig ;
   private byte A153BarFasEst ;
   private byte GXv_int4[] ;
   private short AV12Barordlin ;
   private short A194BarOrdLin ;
   private short A164BarHorFin ;
   private short AV15BarHorFin ;
   private short GXv_int6[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A4636BarFasPzas ;
   private int GXv_int3[] ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV17usurcod ;
   private String AV18station ;
   private String scmdbuf ;
   private String A152BarFasCon ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String AV19Fascod ;
   private String AV20Fasdsc ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private String AV26Pgmname ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date AV14Barfasdti ;
   private java.util.Date A4443BarFasDTF ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n12359BarFasObs ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n4636BarFasPzas ;
   private boolean n5719BarFasKgT ;
   private boolean n5720BarFasMtT ;
   private String A12359BarFasObs ;
   private String AV16Inc_obs ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P059B2_A396EmprCod ;
   private int[] P059B2_A129BarCod ;
   private byte[] P059B2_A132BarCodReo ;
   private String[] P059B2_A130BarCodPar ;
   private String[] P059B2_A758ProCod ;
   private String[] P059B2_A152BarFasCon ;
   private short[] P059B2_A194BarOrdLin ;
   private byte[] P059B2_A153BarFasEst ;
   private java.util.Date[] P059B2_A4442BarFasDTI ;
   private boolean[] P059B2_n4442BarFasDTI ;
   private String[] P059B2_A457FasCod ;
   private String[] P059B2_A460FasDsc ;
   private String[] P059B3_A396EmprCod ;
   private int[] P059B3_A129BarCod ;
   private byte[] P059B3_A132BarCodReo ;
   private String[] P059B3_A130BarCodPar ;
   private String[] P059B3_A758ProCod ;
   private short[] P059B3_A194BarOrdLin ;
   private String[] P059B3_A460FasDsc ;
   private String[] P059B3_A457FasCod ;
   private byte[] P059B3_A153BarFasEst ;
   private java.util.Date[] P059B3_A4442BarFasDTI ;
   private boolean[] P059B3_n4442BarFasDTI ;
   private java.util.Date[] P059B3_A4443BarFasDTF ;
   private boolean[] P059B3_n4443BarFasDTF ;
   private String[] P059B3_A12359BarFasObs ;
   private boolean[] P059B3_n12359BarFasObs ;
   private short[] P059B3_A164BarHorFin ;
   private java.math.BigDecimal[] P059B3_A215BarTieRea ;
   private java.math.BigDecimal[] P059B3_A3837BarFasKgm ;
   private boolean[] P059B3_n3837BarFasKgm ;
   private java.math.BigDecimal[] P059B3_A3838BarFasMtr ;
   private boolean[] P059B3_n3838BarFasMtr ;
   private int[] P059B3_A4636BarFasPzas ;
   private boolean[] P059B3_n4636BarFasPzas ;
   private java.math.BigDecimal[] P059B3_A5719BarFasKgT ;
   private boolean[] P059B3_n5719BarFasKgT ;
   private java.math.BigDecimal[] P059B3_A5720BarFasMtT ;
   private boolean[] P059B3_n5720BarFasMtT ;
}

final  class pfssgts__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P059B2", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarFasCon, T1.BarOrdLin, T1.BarFasEst, T1.BarFasDTI, T1.FasCod, T2.FasDsc FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin > ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P059B3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T2.FasDsc, T1.FasCod, T1.BarFasEst, T1.BarFasDTI, T1.BarFasDTF, T1.BarFasObs, T1.BarHorFin, T1.BarTieRea, T1.BarFasKgm, T1.BarFasMtr, T1.BarFasPzas, T1.BarFasKgT, T1.BarFasMtT FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P059B4", "UPDATE TXPBARFAS SET BarFasEst=?, BarFasDTF=?, BarFasObs=?, BarHorFin=?, BarTieRea=?, BarFasKgm=?, BarFasMtr=?, BarFasPzas=?, BarFasKgT=?, BarFasMtT=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((String[]) buf[11])[0] = rslt.getString(11, 28);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(13);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 250);
               }
               stmt.setShort(4, ((Number) parms[5]).shortValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 2);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[16], 2);
               }
               stmt.setString(11, (String)parms[17], 3);
               stmt.setInt(12, ((Number) parms[18]).intValue());
               stmt.setByte(13, ((Number) parms[19]).byteValue());
               stmt.setString(14, (String)parms[20], 1);
               stmt.setString(15, (String)parms[21], 8);
               stmt.setShort(16, ((Number) parms[22]).shortValue());
               return;
      }
   }

}

