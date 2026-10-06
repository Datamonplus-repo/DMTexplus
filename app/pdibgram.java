package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdibgram extends GXProcedure
{
   public pdibgram( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdibgram.class ), "" );
   }

   public pdibgram( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      pdibgram.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pdibgram.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdibgram.this.AV13DibCli = aP1[0];
      this.aP1 = aP1;
      pdibgram.this.AV14DibInt = aP2[0];
      this.aP2 = aP2;
      pdibgram.this.AV12Grabada = aP3[0];
      this.aP3 = aP3;
      pdibgram.this.Gx_msg = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Go PDIBGRAM", "") );
      if ( AV12Grabada == 1 )
      {
         Gx_msg = httpContext.getMessage( "El dibujo está grabado para : ", "") + GXutil.newLine( ) ;
         /* Using cursor P03062 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV13DibCli, Integer.valueOf(AV14DibInt)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A7041ShaDibCli = P03062_A7041ShaDibCli[0] ;
            A7042ShaDibInt = P03062_A7042ShaDibInt[0] ;
            A7032ShaMal = P03062_A7032ShaMal[0] ;
            n7032ShaMal = P03062_n7032ShaMal[0] ;
            A7033ShaAnc = P03062_A7033ShaAnc[0] ;
            n7033ShaAnc = P03062_n7033ShaAnc[0] ;
            A7043ShaOrd = P03062_A7043ShaOrd[0] ;
            n7043ShaOrd = P03062_n7043ShaOrd[0] ;
            A7031ShaCod = P03062_A7031ShaCod[0] ;
            Gx_msg += httpContext.getMessage( "Color : ", "") + GXutil.trim( GXutil.str( A7043ShaOrd, 10, 0)) + httpContext.getMessage( ",Ancho : ", "") + GXutil.trim( A7033ShaAnc) + httpContext.getMessage( ",Malla : ", "") + GXutil.trim( A7032ShaMal) + GXutil.newLine( ) ;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else
      {
         Gx_msg = httpContext.getMessage( "El dibujo tiene una orden de grabación en curso grabado para : ", "") + GXutil.newLine( ) ;
         /* Using cursor P03063 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV13DibCli, Integer.valueOf(AV14DibInt)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A130BarCodPar = P03063_A130BarCodPar[0] ;
            n130BarCodPar = P03063_n130BarCodPar[0] ;
            A132BarCodReo = P03063_A132BarCodReo[0] ;
            n132BarCodReo = P03063_n132BarCodReo[0] ;
            A129BarCod = P03063_A129BarCod[0] ;
            n129BarCod = P03063_n129BarCod[0] ;
            A212BarSer = P03063_A212BarSer[0] ;
            A1799BarDibInt = P03063_A1799BarDibInt[0] ;
            A1798BarDibCli = P03063_A1798BarDibCli[0] ;
            A7050OGSEst = P03063_A7050OGSEst[0] ;
            n7050OGSEst = P03063_n7050OGSEst[0] ;
            A7141OGSAnc = P03063_A7141OGSAnc[0] ;
            n7141OGSAnc = P03063_n7141OGSAnc[0] ;
            A7049OGSCod = P03063_A7049OGSCod[0] ;
            A212BarSer = P03063_A212BarSer[0] ;
            A1799BarDibInt = P03063_A1799BarDibInt[0] ;
            A1798BarDibCli = P03063_A1798BarDibCli[0] ;
            if ( GXutil.strcmp(A7050OGSEst, httpContext.getMessage( "N", "")) == 0 )
            {
               Gx_msg += httpContext.getMessage( "Ancho : ", "") + GXutil.trim( GXutil.str( A7141OGSAnc, 10, 0)) + GXutil.newLine( ) ;
               /* Using cursor P03064 */
               pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A30AlbProCod = P03064_A30AlbProCod[0] ;
                  A361DisCod = P03064_A361DisCod[0] ;
                  A1014DibInt = P03064_A1014DibInt[0] ;
                  n1014DibInt = P03064_n1014DibInt[0] ;
                  A1013DibCli = P03064_A1013DibCli[0] ;
                  n1013DibCli = P03064_n1013DibCli[0] ;
                  A252CliCod = P03064_A252CliCod[0] ;
                  n252CliCod = P03064_n252CliCod[0] ;
                  A1032FonCod = P03064_A1032FonCod[0] ;
                  A1056DisComCod = P03064_A1056DisComCod[0] ;
                  A2524DisComLin = P03064_A2524DisComLin[0] ;
                  A361DisCod = P03064_A361DisCod[0] ;
                  A252CliCod = P03064_A252CliCod[0] ;
                  n252CliCod = P03064_n252CliCod[0] ;
                  A1014DibInt = P03064_A1014DibInt[0] ;
                  n1014DibInt = P03064_n1014DibInt[0] ;
                  A1013DibCli = P03064_A1013DibCli[0] ;
                  n1013DibCli = P03064_n1013DibCli[0] ;
                  /* Using cursor P03065 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A212BarSer, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt), A1056DisComCod, A1032FonCod});
                  while ( (pr_default.getStatus(3) != 101) )
                  {
                     A2141SerEst = P03065_A2141SerEst[0] ;
                     A2074ColCom = P03065_A2074ColCom[0] ;
                     A2078ColFon = P03065_A2078ColFon[0] ;
                     A2107PasCod = P03065_A2107PasCod[0] ;
                     n2107PasCod = P03065_n2107PasCod[0] ;
                     A2108PasDsc = P03065_A2108PasDsc[0] ;
                     n2108PasDsc = P03065_n2108PasDsc[0] ;
                     A2098MolCod = P03065_A2098MolCod[0] ;
                     A2654PasForLin = P03065_A2654PasForLin[0] ;
                     A2108PasDsc = P03065_A2108PasDsc[0] ;
                     n2108PasDsc = P03065_n2108PasDsc[0] ;
                     Gx_msg += httpContext.getMessage( "Color : ", "") + GXutil.trim( GXutil.str( A2098MolCod, 10, 0)) + httpContext.getMessage( ",Pasta : ", "") + GXutil.trim( A2108PasDsc) + GXutil.newLine( ) ;
                     pr_default.readNext(3);
                  }
                  pr_default.close(3);
                  pr_default.readNext(2);
               }
               pr_default.close(2);
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      System.out.println( httpContext.getMessage( "End PDIBGRAM", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdibgram.this.A396EmprCod;
      this.aP1[0] = pdibgram.this.AV13DibCli;
      this.aP2[0] = pdibgram.this.AV14DibInt;
      this.aP3[0] = pdibgram.this.AV12Grabada;
      this.aP4[0] = pdibgram.this.Gx_msg;
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
      P03062_A396EmprCod = new String[] {""} ;
      P03062_A7041ShaDibCli = new String[] {""} ;
      P03062_A7042ShaDibInt = new int[1] ;
      P03062_A7032ShaMal = new String[] {""} ;
      P03062_n7032ShaMal = new boolean[] {false} ;
      P03062_A7033ShaAnc = new String[] {""} ;
      P03062_n7033ShaAnc = new boolean[] {false} ;
      P03062_A7043ShaOrd = new byte[1] ;
      P03062_n7043ShaOrd = new boolean[] {false} ;
      P03062_A7031ShaCod = new String[] {""} ;
      A7041ShaDibCli = "" ;
      A7032ShaMal = "" ;
      A7033ShaAnc = "" ;
      A7031ShaCod = "" ;
      P03063_A396EmprCod = new String[] {""} ;
      P03063_A130BarCodPar = new String[] {""} ;
      P03063_n130BarCodPar = new boolean[] {false} ;
      P03063_A132BarCodReo = new byte[1] ;
      P03063_n132BarCodReo = new boolean[] {false} ;
      P03063_A129BarCod = new int[1] ;
      P03063_n129BarCod = new boolean[] {false} ;
      P03063_A212BarSer = new String[] {""} ;
      P03063_A1799BarDibInt = new int[1] ;
      P03063_A1798BarDibCli = new String[] {""} ;
      P03063_A7050OGSEst = new String[] {""} ;
      P03063_n7050OGSEst = new boolean[] {false} ;
      P03063_A7141OGSAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03063_n7141OGSAnc = new boolean[] {false} ;
      P03063_A7049OGSCod = new int[1] ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1798BarDibCli = "" ;
      A7050OGSEst = "" ;
      A7141OGSAnc = DecimalUtil.ZERO ;
      P03064_A30AlbProCod = new long[1] ;
      P03064_A361DisCod = new int[1] ;
      P03064_A396EmprCod = new String[] {""} ;
      P03064_A129BarCod = new int[1] ;
      P03064_n129BarCod = new boolean[] {false} ;
      P03064_A132BarCodReo = new byte[1] ;
      P03064_n132BarCodReo = new boolean[] {false} ;
      P03064_A130BarCodPar = new String[] {""} ;
      P03064_n130BarCodPar = new boolean[] {false} ;
      P03064_A1014DibInt = new int[1] ;
      P03064_n1014DibInt = new boolean[] {false} ;
      P03064_A1013DibCli = new String[] {""} ;
      P03064_n1013DibCli = new boolean[] {false} ;
      P03064_A252CliCod = new int[1] ;
      P03064_n252CliCod = new boolean[] {false} ;
      P03064_A1032FonCod = new String[] {""} ;
      P03064_A1056DisComCod = new String[] {""} ;
      P03064_A2524DisComLin = new byte[1] ;
      A1013DibCli = "" ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      P03065_A396EmprCod = new String[] {""} ;
      P03065_A252CliCod = new int[1] ;
      P03065_n252CliCod = new boolean[] {false} ;
      P03065_A1013DibCli = new String[] {""} ;
      P03065_n1013DibCli = new boolean[] {false} ;
      P03065_A1014DibInt = new int[1] ;
      P03065_n1014DibInt = new boolean[] {false} ;
      P03065_A2141SerEst = new String[] {""} ;
      P03065_A2074ColCom = new String[] {""} ;
      P03065_A2078ColFon = new String[] {""} ;
      P03065_A2107PasCod = new String[] {""} ;
      P03065_n2107PasCod = new boolean[] {false} ;
      P03065_A2108PasDsc = new String[] {""} ;
      P03065_n2108PasDsc = new boolean[] {false} ;
      P03065_A2098MolCod = new byte[1] ;
      P03065_A2654PasForLin = new short[1] ;
      A2141SerEst = "" ;
      A2074ColCom = "" ;
      A2078ColFon = "" ;
      A2107PasCod = "" ;
      A2108PasDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdibgram__default(),
         new Object[] {
             new Object[] {
            P03062_A396EmprCod, P03062_A7041ShaDibCli, P03062_A7042ShaDibInt, P03062_A7032ShaMal, P03062_n7032ShaMal, P03062_A7033ShaAnc, P03062_n7033ShaAnc, P03062_A7043ShaOrd, P03062_n7043ShaOrd, P03062_A7031ShaCod
            }
            , new Object[] {
            P03063_A396EmprCod, P03063_A130BarCodPar, P03063_n130BarCodPar, P03063_A132BarCodReo, P03063_n132BarCodReo, P03063_A129BarCod, P03063_n129BarCod, P03063_A212BarSer, P03063_A1799BarDibInt, P03063_A1798BarDibCli,
            P03063_A7050OGSEst, P03063_n7050OGSEst, P03063_A7141OGSAnc, P03063_n7141OGSAnc, P03063_A7049OGSCod
            }
            , new Object[] {
            P03064_A30AlbProCod, P03064_A361DisCod, P03064_A396EmprCod, P03064_A129BarCod, P03064_A132BarCodReo, P03064_A130BarCodPar, P03064_A1014DibInt, P03064_n1014DibInt, P03064_A1013DibCli, P03064_n1013DibCli,
            P03064_A252CliCod, P03064_n252CliCod, P03064_A1032FonCod, P03064_A1056DisComCod, P03064_A2524DisComLin
            }
            , new Object[] {
            P03065_A396EmprCod, P03065_A252CliCod, P03065_A1013DibCli, P03065_A1014DibInt, P03065_A2141SerEst, P03065_A2074ColCom, P03065_A2078ColFon, P03065_A2107PasCod, P03065_n2107PasCod, P03065_A2108PasDsc,
            P03065_n2108PasDsc, P03065_A2098MolCod, P03065_A2654PasForLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Grabada ;
   private byte A7043ShaOrd ;
   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private byte A2098MolCod ;
   private short A2654PasForLin ;
   private short Gx_err ;
   private int AV14DibInt ;
   private int A7042ShaDibInt ;
   private int A129BarCod ;
   private int A1799BarDibInt ;
   private int A7049OGSCod ;
   private int A361DisCod ;
   private int A1014DibInt ;
   private int A252CliCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A7141OGSAnc ;
   private String A396EmprCod ;
   private String AV13DibCli ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A7041ShaDibCli ;
   private String A7032ShaMal ;
   private String A7033ShaAnc ;
   private String A7031ShaCod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1798BarDibCli ;
   private String A7050OGSEst ;
   private String A1013DibCli ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String A2141SerEst ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String A2107PasCod ;
   private String A2108PasDsc ;
   private boolean n7032ShaMal ;
   private boolean n7033ShaAnc ;
   private boolean n7043ShaOrd ;
   private boolean n130BarCodPar ;
   private boolean n132BarCodReo ;
   private boolean n129BarCod ;
   private boolean n7050OGSEst ;
   private boolean n7141OGSAnc ;
   private boolean n1014DibInt ;
   private boolean n1013DibCli ;
   private boolean n252CliCod ;
   private boolean n2107PasCod ;
   private boolean n2108PasDsc ;
   private String[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P03062_A396EmprCod ;
   private String[] P03062_A7041ShaDibCli ;
   private int[] P03062_A7042ShaDibInt ;
   private String[] P03062_A7032ShaMal ;
   private boolean[] P03062_n7032ShaMal ;
   private String[] P03062_A7033ShaAnc ;
   private boolean[] P03062_n7033ShaAnc ;
   private byte[] P03062_A7043ShaOrd ;
   private boolean[] P03062_n7043ShaOrd ;
   private String[] P03062_A7031ShaCod ;
   private String[] P03063_A396EmprCod ;
   private String[] P03063_A130BarCodPar ;
   private boolean[] P03063_n130BarCodPar ;
   private byte[] P03063_A132BarCodReo ;
   private boolean[] P03063_n132BarCodReo ;
   private int[] P03063_A129BarCod ;
   private boolean[] P03063_n129BarCod ;
   private String[] P03063_A212BarSer ;
   private int[] P03063_A1799BarDibInt ;
   private String[] P03063_A1798BarDibCli ;
   private String[] P03063_A7050OGSEst ;
   private boolean[] P03063_n7050OGSEst ;
   private java.math.BigDecimal[] P03063_A7141OGSAnc ;
   private boolean[] P03063_n7141OGSAnc ;
   private int[] P03063_A7049OGSCod ;
   private long[] P03064_A30AlbProCod ;
   private int[] P03064_A361DisCod ;
   private String[] P03064_A396EmprCod ;
   private int[] P03064_A129BarCod ;
   private boolean[] P03064_n129BarCod ;
   private byte[] P03064_A132BarCodReo ;
   private boolean[] P03064_n132BarCodReo ;
   private String[] P03064_A130BarCodPar ;
   private boolean[] P03064_n130BarCodPar ;
   private int[] P03064_A1014DibInt ;
   private boolean[] P03064_n1014DibInt ;
   private String[] P03064_A1013DibCli ;
   private boolean[] P03064_n1013DibCli ;
   private int[] P03064_A252CliCod ;
   private boolean[] P03064_n252CliCod ;
   private String[] P03064_A1032FonCod ;
   private String[] P03064_A1056DisComCod ;
   private byte[] P03064_A2524DisComLin ;
   private String[] P03065_A396EmprCod ;
   private int[] P03065_A252CliCod ;
   private boolean[] P03065_n252CliCod ;
   private String[] P03065_A1013DibCli ;
   private boolean[] P03065_n1013DibCli ;
   private int[] P03065_A1014DibInt ;
   private boolean[] P03065_n1014DibInt ;
   private String[] P03065_A2141SerEst ;
   private String[] P03065_A2074ColCom ;
   private String[] P03065_A2078ColFon ;
   private String[] P03065_A2107PasCod ;
   private boolean[] P03065_n2107PasCod ;
   private String[] P03065_A2108PasDsc ;
   private boolean[] P03065_n2108PasDsc ;
   private byte[] P03065_A2098MolCod ;
   private short[] P03065_A2654PasForLin ;
}

final  class pdibgram__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03062", "SELECT EmprCod, ShaDibCli, ShaDibInt, ShaMal, ShaAnc, ShaOrd, ShaCod FROM TXPShablo WHERE EmprCod = ? and ShaDibCli = ? and ShaDibInt = ? ORDER BY EmprCod, ShaDibCli, ShaDibInt, ShaOrd ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03063", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarSer, T2.BarDibInt, T2.BarDibCli, T1.OGSEst, T1.OGSAnc, T1.OGSCod FROM (TXPShaGra T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T2.BarDibCli = ?) AND (T2.BarDibInt = ?) ORDER BY T1.EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03064", "SELECT T1.AlbProCod, T3.DisCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T4.DibInt, T4.DibCli, T3.CliCod, T1.FonCod, T1.DisComCod, T1.DisComLin FROM (((TXPALBEST T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPDISPOS T4 ON T4.EmprCod = T1.EmprCod AND T4.DisCod = T3.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03065", "SELECT T1.EmprCod, T1.CliCod, T1.DibCli, T1.DibInt, T1.SerEst, T1.ColCom, T1.ColFon, T1.PasCod, T2.PasDsc, T1.MolCod, T1.PasForLin FROM (TXPPASFOR T1 LEFT JOIN TXPCPASTA T2 ON T2.EmprCod = T1.EmprCod AND T2.PasCod = T1.PasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 16);
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 12);
               ((String[]) buf[13])[0] = rslt.getString(11, 12);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 16);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               stmt.setString(6, (String)parms[8], 12);
               stmt.setString(7, (String)parms[9], 12);
               return;
      }
   }

}

