package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusprs extends GXProcedure
{
   public pbusprs( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusprs.class ), "" );
   }

   public pbusprs( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 )
   {
      pbusprs.this.aP1 = new long[] {0};
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
      pbusprs.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusprs.this.AV17AlbProcod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV22FirmaD ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      pbusprs.this.GXt_int1 = GXv_int2[0] ;
      AV22FirmaD = GXt_int1 ;
      GXt_char3 = AV23Ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      pbusprs.this.GXt_char3 = GXv_char4[0] ;
      AV23Ddmmaaaa = GXt_char3 ;
      if ( AV22FirmaD == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV23Ddmmaaaa, " ") == 0 )
      {
         AV23Ddmmaaaa = "02/04/12" ;
      }
      AV24FacFch = localUtil.ctod( AV23Ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      Gx_msg = httpContext.getMessage( "&ddmmaaaa =", "") + AV23Ddmmaaaa + httpContext.getMessage( "&FacFch =", "") + localUtil.dtoc( AV24FacFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
      /* Using cursor P005P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV17AlbProcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1253EmprGuiRem = P005P2_A1253EmprGuiRem[0] ;
         A1243GuiRemCli = P005P2_A1243GuiRemCli[0] ;
         A30AlbProCod = P005P2_A30AlbProCod[0] ;
         A39AlbProPri = P005P2_A39AlbProPri[0] ;
         A1902CliValA = P005P2_A1902CliValA[0] ;
         n1902CliValA = P005P2_n1902CliValA[0] ;
         A10019AlbHhfm = P005P2_A10019AlbHhfm[0] ;
         A10020AlbGrossT = P005P2_A10020AlbGrossT[0] ;
         A10018ALbFmdc = P005P2_A10018ALbFmdc[0] ;
         A3865AlbHorSal = P005P2_A3865AlbHorSal[0] ;
         A4023AlbFecSal = P005P2_A4023AlbFecSal[0] ;
         A1902CliValA = P005P2_A1902CliValA[0] ;
         n1902CliValA = P005P2_n1902CliValA[0] ;
         AV19ALbProPri = A39AlbProPri ;
         AV20CliValA = A1902CliValA ;
         AV18GrossTotal = DecimalUtil.doubleToDec(0) ;
         if ( GXutil.strcmp(AV20CliValA, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P005P3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A130BarCodPar = P005P3_A130BarCodPar[0] ;
               A132BarCodReo = P005P3_A132BarCodReo[0] ;
               A129BarCod = P005P3_A129BarCod[0] ;
               A1264BarPreMtr = P005P3_A1264BarPreMtr[0] ;
               A1263BarAlbMtrE = P005P3_A1263BarAlbMtrE[0] ;
               A1262BarPreKgm = P005P3_A1262BarPreKgm[0] ;
               A1261BarAlbKgmE = P005P3_A1261BarAlbKgmE[0] ;
               AV18GrossTotal = AV18GrossTotal.add((GXutil.roundDecimal( (A1261BarAlbKgmE.multiply(A1262BarPreKgm)).add((A1263BarAlbMtrE.multiply(A1264BarPreMtr))), 2))) ;
               /* Using cursor P005P4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A1276FasMtr = P005P4_A1276FasMtr[0] ;
                  A1242GuiFasPMt = P005P4_A1242GuiFasPMt[0] ;
                  A1275FasKgm = P005P4_A1275FasKgm[0] ;
                  A1241GuiFasPKg = P005P4_A1241GuiFasPKg[0] ;
                  A1240GuiFasLin = P005P4_A1240GuiFasLin[0] ;
                  AV18GrossTotal = AV18GrossTotal.add((GXutil.roundDecimal( (A1241GuiFasPKg.multiply(A1275FasKgm)).add((A1242GuiFasPMt.multiply(A1276FasMtr))), 2))) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         AV21FacTot = AV18GrossTotal ;
         AV25VarAux = localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         AV26HhSys = GXutil.substring( AV25VarAux, 12, 8) ;
         AV27FecSys = localUtil.ctod( GXutil.substring( AV25VarAux, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV28DateAux = GXutil.trim( GXutil.str( GXutil.year( AV27FecSys), 10, 0)) ;
         if ( GXutil.month( AV27FecSys) < 10 )
         {
            AV28DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV27FecSys), 10, 0)) ;
         }
         else
         {
            AV28DateAux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV27FecSys), 10, 0)) ;
         }
         if ( GXutil.day( AV27FecSys) < 10 )
         {
            AV28DateAux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV27FecSys), 10, 0)) ;
         }
         else
         {
            AV28DateAux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV27FecSys), 10, 0)) ;
         }
         AV29Texto = AV28DateAux ;
         AV29Texto += ";" + AV28DateAux + httpContext.getMessage( "T", "") + AV26HhSys ;
         if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
         {
            AV30FacTipFac = (byte)(1) ;
            AV29Texto += httpContext.getMessage( ";GR ", "") + GXutil.str( AV30FacTipFac, 1, 0) + "/" + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) ;
         }
         else
         {
            AV30FacTipFac = (byte)(2) ;
            AV29Texto += httpContext.getMessage( ";GT ", "") + GXutil.str( AV30FacTipFac, 1, 0) + "/" + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) ;
         }
         AV29Texto += ";" + GXutil.trim( GXutil.str( AV21FacTot, 13, 2)) + ";" ;
         /* Execute user subroutine: 'FIRMAANTERIOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A10020AlbGrossT = AV21FacTot ;
         A10018ALbFmdc = AV29Texto ;
         A10018ALbFmdc += httpContext.getMessage( "FirmaLast=", "") + GXutil.trim( AV32FirmaLast) ;
         AV25VarAux = localUtil.dtoc( A4023AlbFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3865AlbHorSal ;
         System.out.println( AV29Texto );
         /* Using cursor P005P5 */
         pr_default.execute(3, new Object[] {A10020AlbGrossT, A10018ALbFmdc, A396EmprCod, Long.valueOf(A30AlbProCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV31Firma = GXutil.trim( AV31Firma) ;
      n10017AlbFmd = false ;
      /* Optimized UPDATE. */
      /* Using cursor P005P6 */
      String AV31Firma10017Aux;
      AV31Firma10017Aux = AV31Firma ;
      pr_default.execute(4, new Object[] {Boolean.valueOf(n10017AlbFmd), AV31Firma10017Aux, A396EmprCod, Long.valueOf(AV17AlbProcod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
      /* End optimized UPDATE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'FIRMAANTERIOR' Routine */
      returnInSub = false ;
      AV33FacFirma = "" ;
      AV32FirmaLast = "" ;
      /* Using cursor P005P7 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV24FacFch, AV19ALbProPri});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A39AlbProPri = P005P7_A39AlbProPri[0] ;
         A34AlbProfch = P005P7_A34AlbProfch[0] ;
         A10017AlbFmd = P005P7_A10017AlbFmd[0] ;
         n10017AlbFmd = P005P7_n10017AlbFmd[0] ;
         A30AlbProCod = P005P7_A30AlbProCod[0] ;
         if ( A30AlbProCod != AV17AlbProcod )
         {
            AV33FacFirma = A10017AlbFmd ;
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV33FacFirma)==0) )
            {
               AV29Texto += GXutil.trim( AV33FacFirma) ;
               AV32FirmaLast = AV33FacFirma ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusprs.this.A396EmprCod;
      this.aP1[0] = pbusprs.this.AV17AlbProcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pbusprs");
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
      AV23Ddmmaaaa = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV24FacFch = GXutil.nullDate() ;
      Gx_msg = "" ;
      scmdbuf = "" ;
      P005P2_A1253EmprGuiRem = new String[] {""} ;
      P005P2_A1243GuiRemCli = new int[1] ;
      P005P2_A396EmprCod = new String[] {""} ;
      P005P2_A30AlbProCod = new long[1] ;
      P005P2_A39AlbProPri = new String[] {""} ;
      P005P2_A1902CliValA = new String[] {""} ;
      P005P2_n1902CliValA = new boolean[] {false} ;
      P005P2_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      P005P2_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005P2_A10018ALbFmdc = new String[] {""} ;
      P005P2_A3865AlbHorSal = new String[] {""} ;
      P005P2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A1253EmprGuiRem = "" ;
      A39AlbProPri = "" ;
      A1902CliValA = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A10020AlbGrossT = DecimalUtil.ZERO ;
      A10018ALbFmdc = "" ;
      A3865AlbHorSal = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      AV19ALbProPri = "" ;
      AV20CliValA = "" ;
      AV18GrossTotal = DecimalUtil.ZERO ;
      P005P3_A396EmprCod = new String[] {""} ;
      P005P3_A30AlbProCod = new long[1] ;
      P005P3_A130BarCodPar = new String[] {""} ;
      P005P3_A132BarCodReo = new byte[1] ;
      P005P3_A129BarCod = new int[1] ;
      P005P3_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005P3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005P3_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005P3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P005P4_A396EmprCod = new String[] {""} ;
      P005P4_A30AlbProCod = new long[1] ;
      P005P4_A129BarCod = new int[1] ;
      P005P4_A132BarCodReo = new byte[1] ;
      P005P4_A130BarCodPar = new String[] {""} ;
      P005P4_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005P4_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005P4_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005P4_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P005P4_A1240GuiFasLin = new short[1] ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      AV21FacTot = DecimalUtil.ZERO ;
      AV25VarAux = "" ;
      AV26HhSys = "" ;
      AV27FecSys = GXutil.nullDate() ;
      AV28DateAux = "" ;
      AV29Texto = "" ;
      AV32FirmaLast = "" ;
      AV31Firma = "" ;
      A10017AlbFmd = "" ;
      AV33FacFirma = "" ;
      P005P7_A396EmprCod = new String[] {""} ;
      P005P7_A39AlbProPri = new String[] {""} ;
      P005P7_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P005P7_A10017AlbFmd = new String[] {""} ;
      P005P7_n10017AlbFmd = new boolean[] {false} ;
      P005P7_A30AlbProCod = new long[1] ;
      A34AlbProfch = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusprs__default(),
         new Object[] {
             new Object[] {
            P005P2_A1253EmprGuiRem, P005P2_A1243GuiRemCli, P005P2_A396EmprCod, P005P2_A30AlbProCod, P005P2_A39AlbProPri, P005P2_A1902CliValA, P005P2_n1902CliValA, P005P2_A10019AlbHhfm, P005P2_A10020AlbGrossT, P005P2_A10018ALbFmdc,
            P005P2_A3865AlbHorSal, P005P2_A4023AlbFecSal
            }
            , new Object[] {
            P005P3_A396EmprCod, P005P3_A30AlbProCod, P005P3_A130BarCodPar, P005P3_A132BarCodReo, P005P3_A129BarCod, P005P3_A1264BarPreMtr, P005P3_A1263BarAlbMtrE, P005P3_A1262BarPreKgm, P005P3_A1261BarAlbKgmE
            }
            , new Object[] {
            P005P4_A396EmprCod, P005P4_A30AlbProCod, P005P4_A129BarCod, P005P4_A132BarCodReo, P005P4_A130BarCodPar, P005P4_A1276FasMtr, P005P4_A1242GuiFasPMt, P005P4_A1275FasKgm, P005P4_A1241GuiFasPKg, P005P4_A1240GuiFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P005P7_A396EmprCod, P005P7_A39AlbProPri, P005P7_A34AlbProfch, P005P7_A10017AlbFmd, P005P7_n10017AlbFmd, P005P7_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22FirmaD ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte AV30FacTipFac ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private long AV17AlbProcod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A10020AlbGrossT ;
   private java.math.BigDecimal AV18GrossTotal ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal AV21FacTot ;
   private String A396EmprCod ;
   private String AV23Ddmmaaaa ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String A39AlbProPri ;
   private String A1902CliValA ;
   private String A10018ALbFmdc ;
   private String A3865AlbHorSal ;
   private String AV19ALbProPri ;
   private String AV20CliValA ;
   private String A130BarCodPar ;
   private String AV25VarAux ;
   private String AV26HhSys ;
   private String AV28DateAux ;
   private String AV29Texto ;
   private String AV32FirmaLast ;
   private String AV31Firma ;
   private String AV33FacFirma ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date AV24FacFch ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV27FecSys ;
   private java.util.Date A34AlbProfch ;
   private boolean returnInSub ;
   private boolean n1902CliValA ;
   private boolean n10017AlbFmd ;
   private String A10017AlbFmd ;
   private long[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P005P2_A1253EmprGuiRem ;
   private int[] P005P2_A1243GuiRemCli ;
   private String[] P005P2_A396EmprCod ;
   private long[] P005P2_A30AlbProCod ;
   private String[] P005P2_A39AlbProPri ;
   private String[] P005P2_A1902CliValA ;
   private boolean[] P005P2_n1902CliValA ;
   private java.util.Date[] P005P2_A10019AlbHhfm ;
   private java.math.BigDecimal[] P005P2_A10020AlbGrossT ;
   private String[] P005P2_A10018ALbFmdc ;
   private String[] P005P2_A3865AlbHorSal ;
   private java.util.Date[] P005P2_A4023AlbFecSal ;
   private String[] P005P3_A396EmprCod ;
   private long[] P005P3_A30AlbProCod ;
   private String[] P005P3_A130BarCodPar ;
   private byte[] P005P3_A132BarCodReo ;
   private int[] P005P3_A129BarCod ;
   private java.math.BigDecimal[] P005P3_A1264BarPreMtr ;
   private java.math.BigDecimal[] P005P3_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P005P3_A1262BarPreKgm ;
   private java.math.BigDecimal[] P005P3_A1261BarAlbKgmE ;
   private String[] P005P4_A396EmprCod ;
   private long[] P005P4_A30AlbProCod ;
   private int[] P005P4_A129BarCod ;
   private byte[] P005P4_A132BarCodReo ;
   private String[] P005P4_A130BarCodPar ;
   private java.math.BigDecimal[] P005P4_A1276FasMtr ;
   private java.math.BigDecimal[] P005P4_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P005P4_A1275FasKgm ;
   private java.math.BigDecimal[] P005P4_A1241GuiFasPKg ;
   private short[] P005P4_A1240GuiFasLin ;
   private String[] P005P7_A396EmprCod ;
   private String[] P005P7_A39AlbProPri ;
   private java.util.Date[] P005P7_A34AlbProfch ;
   private String[] P005P7_A10017AlbFmd ;
   private boolean[] P005P7_n10017AlbFmd ;
   private long[] P005P7_A30AlbProCod ;
}

final  class pbusprs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005P2", "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.GuiRemCli AS GuiRemCli, T1.EmprCod, T1.AlbProCod, T1.AlbProPri, T2.CliValA, T1.AlbHhfm, T1.AlbGrossT, T1.ALbFmdc, T1.AlbHorSal, T1.AlbFecSal FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P005P3", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarPreMtr, BarAlbMtrE, BarPreKgm, BarAlbKgmE FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P005P4", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasMtr, GuiFasPMt, FasKgm, GuiFasPKg, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P005P5", "UPDATE TXPCALPRD SET AlbGrossT=?, ALbFmdc=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new UpdateCursor("P005P6", "UPDATE TXPCALPRD SET AlbFmd=?  WHERE EmprCod = ? and AlbProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCALPRD")
         ,new ForEachCursor("P005P7", "SELECT EmprCod, AlbProPri, AlbProfch, AlbFmd, AlbProCod FROM TXPCALPRD WHERE (EmprCod = ?) AND (AlbProfch >= ?) AND (AlbProPri = ?) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[9])[0] = rslt.getString(9, 255);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((long[]) buf[5])[0] = rslt.getLong(5);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 255);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 255);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

