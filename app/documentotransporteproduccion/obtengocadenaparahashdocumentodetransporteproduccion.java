package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class obtengocadenaparahashdocumentodetransporteproduccion extends GXProcedure
{
   public obtengocadenaparahashdocumentodetransporteproduccion( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( obtengocadenaparahashdocumentodetransporteproduccion.class ), "" );
   }

   public obtengocadenaparahashdocumentodetransporteproduccion( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             String[] aP4 )
   {
      obtengocadenaparahashdocumentodetransporteproduccion.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      obtengocadenaparahashdocumentodetransporteproduccion.this.AV43EmprCod = aP0;
      obtengocadenaparahashdocumentodetransporteproduccion.this.AV18Faccod = aP1;
      obtengocadenaparahashdocumentodetransporteproduccion.this.AV17Facfch = aP2;
      obtengocadenaparahashdocumentodetransporteproduccion.this.AV33AlbProSys = aP3;
      obtengocadenaparahashdocumentodetransporteproduccion.this.aP4 = aP4;
      obtengocadenaparahashdocumentodetransporteproduccion.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV14Firmad ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV43EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      obtengocadenaparahashdocumentodetransporteproduccion.this.GXt_int1 = GXv_int2[0] ;
      AV14Firmad = GXt_int1 ;
      GXt_char3 = AV15ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV43EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      obtengocadenaparahashdocumentodetransporteproduccion.this.GXt_char3 = GXv_char4[0] ;
      AV15ddmmaaaa = GXt_char3 ;
      if ( ( AV14Firmad == 0 ) && ( AV16Nocont == 1 ) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV15ddmmaaaa, " ") == 0 )
      {
         AV15ddmmaaaa = "02/04/12" ;
      }
      AV17Facfch = localUtil.ctod( AV15ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV30Firma = "" ;
      /* Using cursor P0A722 */
      pr_default.execute(0, new Object[] {AV43EmprCod, Integer.valueOf(AV18Faccod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1253EmprGuiRem = P0A722_A1253EmprGuiRem[0] ;
         A1243GuiRemCli = P0A722_A1243GuiRemCli[0] ;
         A30AlbProCod = P0A722_A30AlbProCod[0] ;
         A396EmprCod = P0A722_A396EmprCod[0] ;
         A39AlbProPri = P0A722_A39AlbProPri[0] ;
         A1902CliValA = P0A722_A1902CliValA[0] ;
         n1902CliValA = P0A722_n1902CliValA[0] ;
         A34AlbProfch = P0A722_A34AlbProfch[0] ;
         A10019AlbHhfm = P0A722_A10019AlbHhfm[0] ;
         A14073AlbPdSerAT = P0A722_A14073AlbPdSerAT[0] ;
         A14074AlbPdTipAT = P0A722_A14074AlbPdTipAT[0] ;
         A1902CliValA = P0A722_A1902CliValA[0] ;
         n1902CliValA = P0A722_n1902CliValA[0] ;
         AV41AlbProPri = A39AlbProPri ;
         AV42CliValA = A1902CliValA ;
         AV20Grosstotal = DecimalUtil.doubleToDec(0) ;
         if ( GXutil.strcmp(AV42CliValA, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Using cursor P0A723 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A130BarCodPar = P0A723_A130BarCodPar[0] ;
               A132BarCodReo = P0A723_A132BarCodReo[0] ;
               A129BarCod = P0A723_A129BarCod[0] ;
               A1264BarPreMtr = P0A723_A1264BarPreMtr[0] ;
               A1263BarAlbMtrE = P0A723_A1263BarAlbMtrE[0] ;
               A1262BarPreKgm = P0A723_A1262BarPreKgm[0] ;
               A1261BarAlbKgmE = P0A723_A1261BarAlbKgmE[0] ;
               AV20Grosstotal = AV20Grosstotal.add((GXutil.roundDecimal( (A1261BarAlbKgmE.multiply(A1262BarPreKgm)).add((A1263BarAlbMtrE.multiply(A1264BarPreMtr))), 2))) ;
               /* Using cursor P0A724 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A1276FasMtr = P0A724_A1276FasMtr[0] ;
                  A1242GuiFasPMt = P0A724_A1242GuiFasPMt[0] ;
                  A1275FasKgm = P0A724_A1275FasKgm[0] ;
                  A1241GuiFasPKg = P0A724_A1241GuiFasPKg[0] ;
                  A1240GuiFasLin = P0A724_A1240GuiFasLin[0] ;
                  AV20Grosstotal = AV20Grosstotal.add((GXutil.roundDecimal( (A1241GuiFasPKg.multiply(A1275FasKgm)).add((A1242GuiFasPMt.multiply(A1276FasMtr))), 2))) ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         AV19Factot = AV20Grosstotal ;
         AV24Dateaux = GXutil.trim( GXutil.str( GXutil.year( A34AlbProfch), 10, 0)) ;
         if ( GXutil.month( A34AlbProfch) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.month( A34AlbProfch), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.month( A34AlbProfch), 10, 0)) ;
         }
         if ( GXutil.day( A34AlbProfch) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.day( A34AlbProfch), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.day( A34AlbProfch), 10, 0)) ;
         }
         AV25Texto = AV24Dateaux ;
         AV21VarAUx = localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         AV22Hhsys = GXutil.substring( AV21VarAUx, 12, 8) ;
         AV23Fecsys = localUtil.ctod( GXutil.substring( AV21VarAUx, 1, 10), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         AV24Dateaux = GXutil.trim( GXutil.str( GXutil.year( AV23Fecsys), 10, 0)) ;
         if ( GXutil.month( AV23Fecsys) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.month( AV23Fecsys), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.month( AV23Fecsys), 10, 0)) ;
         }
         if ( GXutil.day( AV23Fecsys) < 10 )
         {
            AV24Dateaux += "-0" + GXutil.trim( GXutil.str( GXutil.day( AV23Fecsys), 10, 0)) ;
         }
         else
         {
            AV24Dateaux += "-" + GXutil.trim( GXutil.str( GXutil.day( AV23Fecsys), 10, 0)) ;
         }
         AV25Texto += ";" + AV24Dateaux + httpContext.getMessage( "T", "") + AV22Hhsys ;
         AV25Texto += ";" + GXutil.trim( A14074AlbPdTipAT) + " " + GXutil.trim( A14073AlbPdSerAT) + "/" + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) ;
         AV25Texto += ";" + GXutil.trim( GXutil.str( AV19Factot, 13, 2)) + ";" ;
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
         AV25Texto = GXutil.trim( AV25Texto) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV30Firma = GXutil.trim( AV30Firma) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'FIRMAANTERIOR' Routine */
      returnInSub = false ;
      AV27Facfirma = "" ;
      AV28Firmalast = "" ;
      /* Using cursor P0A725 */
      pr_default.execute(3, new Object[] {AV43EmprCod, AV17Facfch, AV41AlbProPri});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = P0A725_A396EmprCod[0] ;
         A39AlbProPri = P0A725_A39AlbProPri[0] ;
         A34AlbProfch = P0A725_A34AlbProfch[0] ;
         A10017AlbFmd = P0A725_A10017AlbFmd[0] ;
         n10017AlbFmd = P0A725_n10017AlbFmd[0] ;
         A30AlbProCod = P0A725_A30AlbProCod[0] ;
         if ( A30AlbProCod != AV18Faccod )
         {
            AV27Facfirma = A10017AlbFmd ;
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV27Facfirma)==0) )
            {
               AV25Texto += GXutil.trim( AV27Facfirma) ;
               AV28Firmalast = AV27Facfirma ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP4[0] = obtengocadenaparahashdocumentodetransporteproduccion.this.AV25Texto;
      this.aP5[0] = obtengocadenaparahashdocumentodetransporteproduccion.this.AV30Firma;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV25Texto = "" ;
      AV30Firma = "" ;
      GXv_int2 = new byte[1] ;
      AV15ddmmaaaa = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      scmdbuf = "" ;
      P0A722_A1253EmprGuiRem = new String[] {""} ;
      P0A722_A1243GuiRemCli = new int[1] ;
      P0A722_A30AlbProCod = new long[1] ;
      P0A722_A396EmprCod = new String[] {""} ;
      P0A722_A39AlbProPri = new String[] {""} ;
      P0A722_A1902CliValA = new String[] {""} ;
      P0A722_n1902CliValA = new boolean[] {false} ;
      P0A722_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A722_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      P0A722_A14073AlbPdSerAT = new String[] {""} ;
      P0A722_A14074AlbPdTipAT = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A396EmprCod = "" ;
      A39AlbProPri = "" ;
      A1902CliValA = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A14073AlbPdSerAT = "" ;
      A14074AlbPdTipAT = "" ;
      AV41AlbProPri = "" ;
      AV42CliValA = "" ;
      AV20Grosstotal = DecimalUtil.ZERO ;
      P0A723_A396EmprCod = new String[] {""} ;
      P0A723_A30AlbProCod = new long[1] ;
      P0A723_A130BarCodPar = new String[] {""} ;
      P0A723_A132BarCodReo = new byte[1] ;
      P0A723_A129BarCod = new int[1] ;
      P0A723_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A723_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A723_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A723_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P0A724_A396EmprCod = new String[] {""} ;
      P0A724_A30AlbProCod = new long[1] ;
      P0A724_A129BarCod = new int[1] ;
      P0A724_A132BarCodReo = new byte[1] ;
      P0A724_A130BarCodPar = new String[] {""} ;
      P0A724_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A724_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A724_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A724_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A724_A1240GuiFasLin = new short[1] ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      AV19Factot = DecimalUtil.ZERO ;
      AV24Dateaux = "" ;
      AV21VarAUx = "" ;
      AV22Hhsys = "" ;
      AV23Fecsys = GXutil.nullDate() ;
      AV27Facfirma = "" ;
      AV28Firmalast = "" ;
      P0A725_A396EmprCod = new String[] {""} ;
      P0A725_A39AlbProPri = new String[] {""} ;
      P0A725_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A725_A10017AlbFmd = new String[] {""} ;
      P0A725_n10017AlbFmd = new boolean[] {false} ;
      P0A725_A30AlbProCod = new long[1] ;
      A10017AlbFmd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.obtengocadenaparahashdocumentodetransporteproduccion__default(),
         new Object[] {
             new Object[] {
            P0A722_A1253EmprGuiRem, P0A722_A1243GuiRemCli, P0A722_A30AlbProCod, P0A722_A396EmprCod, P0A722_A39AlbProPri, P0A722_A1902CliValA, P0A722_n1902CliValA, P0A722_A34AlbProfch, P0A722_A10019AlbHhfm, P0A722_A14073AlbPdSerAT,
            P0A722_A14074AlbPdTipAT
            }
            , new Object[] {
            P0A723_A396EmprCod, P0A723_A30AlbProCod, P0A723_A130BarCodPar, P0A723_A132BarCodReo, P0A723_A129BarCod, P0A723_A1264BarPreMtr, P0A723_A1263BarAlbMtrE, P0A723_A1262BarPreKgm, P0A723_A1261BarAlbKgmE
            }
            , new Object[] {
            P0A724_A396EmprCod, P0A724_A30AlbProCod, P0A724_A129BarCod, P0A724_A132BarCodReo, P0A724_A130BarCodPar, P0A724_A1276FasMtr, P0A724_A1242GuiFasPMt, P0A724_A1275FasKgm, P0A724_A1241GuiFasPKg, P0A724_A1240GuiFasLin
            }
            , new Object[] {
            P0A725_A396EmprCod, P0A725_A39AlbProPri, P0A725_A34AlbProfch, P0A725_A10017AlbFmd, P0A725_n10017AlbFmd, P0A725_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Firmad ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV16Nocont ;
   private byte A132BarCodReo ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV18Faccod ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV20Grosstotal ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal AV19Factot ;
   private String AV43EmprCod ;
   private String AV25Texto ;
   private String AV30Firma ;
   private String AV15ddmmaaaa ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A1253EmprGuiRem ;
   private String A396EmprCod ;
   private String A39AlbProPri ;
   private String A1902CliValA ;
   private String A14073AlbPdSerAT ;
   private String A14074AlbPdTipAT ;
   private String AV41AlbProPri ;
   private String AV42CliValA ;
   private String A130BarCodPar ;
   private String AV24Dateaux ;
   private String AV21VarAUx ;
   private String AV22Hhsys ;
   private String AV27Facfirma ;
   private String AV28Firmalast ;
   private java.util.Date AV33AlbProSys ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date AV17Facfch ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV23Fecsys ;
   private boolean returnInSub ;
   private boolean n1902CliValA ;
   private boolean n10017AlbFmd ;
   private String A10017AlbFmd ;
   private String[] aP5 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A722_A1253EmprGuiRem ;
   private int[] P0A722_A1243GuiRemCli ;
   private long[] P0A722_A30AlbProCod ;
   private String[] P0A722_A396EmprCod ;
   private String[] P0A722_A39AlbProPri ;
   private String[] P0A722_A1902CliValA ;
   private boolean[] P0A722_n1902CliValA ;
   private java.util.Date[] P0A722_A34AlbProfch ;
   private java.util.Date[] P0A722_A10019AlbHhfm ;
   private String[] P0A722_A14073AlbPdSerAT ;
   private String[] P0A722_A14074AlbPdTipAT ;
   private String[] P0A723_A396EmprCod ;
   private long[] P0A723_A30AlbProCod ;
   private String[] P0A723_A130BarCodPar ;
   private byte[] P0A723_A132BarCodReo ;
   private int[] P0A723_A129BarCod ;
   private java.math.BigDecimal[] P0A723_A1264BarPreMtr ;
   private java.math.BigDecimal[] P0A723_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P0A723_A1262BarPreKgm ;
   private java.math.BigDecimal[] P0A723_A1261BarAlbKgmE ;
   private String[] P0A724_A396EmprCod ;
   private long[] P0A724_A30AlbProCod ;
   private int[] P0A724_A129BarCod ;
   private byte[] P0A724_A132BarCodReo ;
   private String[] P0A724_A130BarCodPar ;
   private java.math.BigDecimal[] P0A724_A1276FasMtr ;
   private java.math.BigDecimal[] P0A724_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P0A724_A1275FasKgm ;
   private java.math.BigDecimal[] P0A724_A1241GuiFasPKg ;
   private short[] P0A724_A1240GuiFasLin ;
   private String[] P0A725_A396EmprCod ;
   private String[] P0A725_A39AlbProPri ;
   private java.util.Date[] P0A725_A34AlbProfch ;
   private String[] P0A725_A10017AlbFmd ;
   private boolean[] P0A725_n10017AlbFmd ;
   private long[] P0A725_A30AlbProCod ;
}

final  class obtengocadenaparahashdocumentodetransporteproduccion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A722", "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.EmprCod, T1.AlbProPri, T2.CliValA, T1.AlbProfch, T1.AlbHhfm, T1.AlbPdSerAT, T1.AlbPdTipAT FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A723", "SELECT EmprCod, AlbProCod, BarCodPar, BarCodReo, BarCod, BarPreMtr, BarAlbMtrE, BarPreKgm, BarAlbKgmE FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A724", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasMtr, GuiFasPMt, FasKgm, GuiFasPKg, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A725", "SELECT EmprCod, AlbProPri, AlbProfch, AlbFmd, AlbProCod FROM TXPCALPRD WHERE (EmprCod = ?) AND (AlbProfch >= ?) AND (AlbProPri = ?) ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((String[]) buf[10])[0] = rslt.getString(10, 4);
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
            case 3 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

