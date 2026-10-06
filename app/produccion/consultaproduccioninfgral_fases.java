package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultaproduccioninfgral_fases extends GXProcedure
{
   public consultaproduccioninfgral_fases( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultaproduccioninfgral_fases.class ), "" );
   }

   public consultaproduccioninfgral_fases( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String aP0 ,
                                     int aP1 ,
                                     byte aP2 ,
                                     String aP3 ,
                                     int[] aP4 ,
                                     String[] aP5 ,
                                     String[] aP6 ,
                                     String[] aP7 ,
                                     java.util.Date[] aP8 ,
                                     String[] aP9 ,
                                     int[] aP10 ,
                                     java.math.BigDecimal[] aP11 ,
                                     java.math.BigDecimal[] aP12 ,
                                     int[] aP13 ,
                                     String[] aP14 ,
                                     String[] aP15 ,
                                     byte[] aP16 ,
                                     String[] aP17 ,
                                     int[] aP18 ,
                                     String[] aP19 ,
                                     String[] aP20 ,
                                     int[] aP21 ,
                                     String[] aP22 ,
                                     String[] aP23 ,
                                     String[] aP24 ,
                                     short[] aP25 ,
                                     short[] aP26 ,
                                     short[] aP27 ,
                                     String[] aP28 ,
                                     String[] aP29 ,
                                     String[] aP30 ,
                                     short[] aP31 ,
                                     short[] aP32 ,
                                     short[] aP33 ,
                                     short[] aP34 ,
                                     short[] aP35 ,
                                     java.util.Date[] aP36 )
   {
      consultaproduccioninfgral_fases.this.aP37 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37);
      return aP37[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        byte aP2 ,
                        String aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        java.util.Date[] aP8 ,
                        String[] aP9 ,
                        int[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        int[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        byte[] aP16 ,
                        String[] aP17 ,
                        int[] aP18 ,
                        String[] aP19 ,
                        String[] aP20 ,
                        int[] aP21 ,
                        String[] aP22 ,
                        String[] aP23 ,
                        String[] aP24 ,
                        short[] aP25 ,
                        short[] aP26 ,
                        short[] aP27 ,
                        String[] aP28 ,
                        String[] aP29 ,
                        String[] aP30 ,
                        short[] aP31 ,
                        short[] aP32 ,
                        short[] aP33 ,
                        short[] aP34 ,
                        short[] aP35 ,
                        java.util.Date[] aP36 ,
                        java.util.Date[] aP37 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36, aP37);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             byte aP2 ,
                             String aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             java.util.Date[] aP8 ,
                             String[] aP9 ,
                             int[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             int[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             byte[] aP16 ,
                             String[] aP17 ,
                             int[] aP18 ,
                             String[] aP19 ,
                             String[] aP20 ,
                             int[] aP21 ,
                             String[] aP22 ,
                             String[] aP23 ,
                             String[] aP24 ,
                             short[] aP25 ,
                             short[] aP26 ,
                             short[] aP27 ,
                             String[] aP28 ,
                             String[] aP29 ,
                             String[] aP30 ,
                             short[] aP31 ,
                             short[] aP32 ,
                             short[] aP33 ,
                             short[] aP34 ,
                             short[] aP35 ,
                             java.util.Date[] aP36 ,
                             java.util.Date[] aP37 )
   {
      consultaproduccioninfgral_fases.this.AV8EmprCod = aP0;
      consultaproduccioninfgral_fases.this.AV9BarCod = aP1;
      consultaproduccioninfgral_fases.this.AV10BarCodReo = aP2;
      consultaproduccioninfgral_fases.this.AV11BarCodPar = aP3;
      consultaproduccioninfgral_fases.this.aP4 = aP4;
      consultaproduccioninfgral_fases.this.aP5 = aP5;
      consultaproduccioninfgral_fases.this.aP6 = aP6;
      consultaproduccioninfgral_fases.this.aP7 = aP7;
      consultaproduccioninfgral_fases.this.aP8 = aP8;
      consultaproduccioninfgral_fases.this.aP9 = aP9;
      consultaproduccioninfgral_fases.this.aP10 = aP10;
      consultaproduccioninfgral_fases.this.aP11 = aP11;
      consultaproduccioninfgral_fases.this.aP12 = aP12;
      consultaproduccioninfgral_fases.this.aP13 = aP13;
      consultaproduccioninfgral_fases.this.aP14 = aP14;
      consultaproduccioninfgral_fases.this.aP15 = aP15;
      consultaproduccioninfgral_fases.this.aP16 = aP16;
      consultaproduccioninfgral_fases.this.aP17 = aP17;
      consultaproduccioninfgral_fases.this.aP18 = aP18;
      consultaproduccioninfgral_fases.this.aP19 = aP19;
      consultaproduccioninfgral_fases.this.aP20 = aP20;
      consultaproduccioninfgral_fases.this.aP21 = aP21;
      consultaproduccioninfgral_fases.this.aP22 = aP22;
      consultaproduccioninfgral_fases.this.aP23 = aP23;
      consultaproduccioninfgral_fases.this.aP24 = aP24;
      consultaproduccioninfgral_fases.this.aP25 = aP25;
      consultaproduccioninfgral_fases.this.aP26 = aP26;
      consultaproduccioninfgral_fases.this.aP27 = aP27;
      consultaproduccioninfgral_fases.this.aP28 = aP28;
      consultaproduccioninfgral_fases.this.aP29 = aP29;
      consultaproduccioninfgral_fases.this.aP30 = aP30;
      consultaproduccioninfgral_fases.this.aP31 = aP31;
      consultaproduccioninfgral_fases.this.aP32 = aP32;
      consultaproduccioninfgral_fases.this.aP33 = aP33;
      consultaproduccioninfgral_fases.this.aP34 = aP34;
      consultaproduccioninfgral_fases.this.aP35 = aP35;
      consultaproduccioninfgral_fases.this.aP36 = aP36;
      consultaproduccioninfgral_fases.this.aP37 = aP37;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV34Enc20c ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int2) ;
      consultaproduccioninfgral_fases.this.GXt_int1 = GXv_int2[0] ;
      AV34Enc20c = GXt_int1 ;
      /* Using cursor P0A423 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV9BarCod), Byte.valueOf(AV10BarCodReo), AV11BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P0A423_A130BarCodPar[0] ;
         A132BarCodReo = P0A423_A132BarCodReo[0] ;
         A129BarCod = P0A423_A129BarCod[0] ;
         A396EmprCod = P0A423_A396EmprCod[0] ;
         A252CliCod = P0A423_A252CliCod[0] ;
         n252CliCod = P0A423_n252CliCod[0] ;
         A279CliNom = P0A423_A279CliNom[0] ;
         A212BarSer = P0A423_A212BarSer[0] ;
         A1652BarSerDsc = P0A423_A1652BarSerDsc[0] ;
         A217BarTipArt = P0A423_A217BarTipArt[0] ;
         n217BarTipArt = P0A423_n217BarTipArt[0] ;
         A143BarDisNum = P0A423_A143BarDisNum[0] ;
         A155BarFecCli = P0A423_A155BarFecCli[0] ;
         A135BarColNom = P0A423_A135BarColNom[0] ;
         A136BarColNum = P0A423_A136BarColNum[0] ;
         A218BarTipCol = P0A423_A218BarTipCol[0] ;
         A4812BarEncCli = P0A423_A4812BarEncCli[0] ;
         A361DisCod = P0A423_A361DisCod[0] ;
         A1234BarNomCli = P0A423_A1234BarNomCli[0] ;
         A1235BarNumCli = P0A423_A1235BarNumCli[0] ;
         A2010BarTipDis = P0A423_A2010BarTipDis[0] ;
         A221BarTra1 = P0A423_A221BarTra1[0] ;
         A222BarTra2 = P0A423_A222BarTra2[0] ;
         A223BarTra3 = P0A423_A223BarTra3[0] ;
         A224BarTraP1 = P0A423_A224BarTraP1[0] ;
         A225BarTraP2 = P0A423_A225BarTraP2[0] ;
         A226BarTraP3 = P0A423_A226BarTraP3[0] ;
         A229BarUrd1 = P0A423_A229BarUrd1[0] ;
         A230BarUrd2 = P0A423_A230BarUrd2[0] ;
         A231BarUrd3 = P0A423_A231BarUrd3[0] ;
         A232BarUrdP1 = P0A423_A232BarUrdP1[0] ;
         A233BarUrdP2 = P0A423_A233BarUrdP2[0] ;
         A234BarUrdP3 = P0A423_A234BarUrdP3[0] ;
         A125BarAncAca1 = P0A423_A125BarAncAca1[0] ;
         A1909BarGraAca = P0A423_A1909BarGraAca[0] ;
         A159BarFecGen = P0A423_A159BarFecGen[0] ;
         A158BarFecFpr = P0A423_A158BarFecFpr[0] ;
         A166BarKgm = P0A423_A166BarKgm[0] ;
         A184BarMtr = P0A423_A184BarMtr[0] ;
         A199BarPie1 = P0A423_A199BarPie1[0] ;
         A365DisDes = P0A423_A365DisDes[0] ;
         A898BarPieNDes = P0A423_A898BarPieNDes[0] ;
         A166BarKgm = P0A423_A166BarKgm[0] ;
         A184BarMtr = P0A423_A184BarMtr[0] ;
         A199BarPie1 = P0A423_A199BarPie1[0] ;
         A898BarPieNDes = P0A423_A898BarPieNDes[0] ;
         A279CliNom = P0A423_A279CliNom[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV12CliCod = A252CliCod ;
         AV13CliNom = A279CliNom ;
         AV14BarSer = A212BarSer ;
         AV15BarSerDsc = A1652BarSerDsc ;
         AV22BarTipArt = A217BarTipArt ;
         /* Execute user subroutine: 'TIPART' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV23BarDisNum = A143BarDisNum ;
         AV26BarFecCli = A155BarFecCli ;
         AV25BarColNom = A135BarColNom ;
         AV24BarColNum = A136BarColNum ;
         AV27BarKgm = A166BarKgm ;
         AV28BarMtr = A184BarMtr ;
         AV29BarPie = A198BarPie ;
         AV21BarTipCol = A218BarTipCol ;
         AV35EncCli = ((AV34Enc20c==0) ? A143BarDisNum : A4812BarEncCli) ;
         AV33DisCod = A361DisCod ;
         AV30BarNomCli = A1234BarNomCli ;
         AV31BarNumCli = A1235BarNumCli ;
         AV32BarTipDis = A2010BarTipDis ;
         AV36BarTra1 = A221BarTra1 ;
         AV41BarTra2 = A222BarTra2 ;
         AV42BarTra3 = A223BarTra3 ;
         AV43BarTrap1 = A224BarTraP1 ;
         AV44BarTrap2 = A225BarTraP2 ;
         AV45BarTrap3 = A226BarTraP3 ;
         AV46BarUrd1 = A229BarUrd1 ;
         AV48BarUrd2 = A230BarUrd2 ;
         AV50BarUrd3 = A231BarUrd3 ;
         AV47BarUrdp1 = A232BarUrdP1 ;
         AV49BarUrdp2 = A233BarUrdP2 ;
         AV51BarUrdp3 = A234BarUrdP3 ;
         AV37BarAncAca1 = A125BarAncAca1 ;
         AV40BarGraAca = A1909BarGraAca ;
         AV38BarFecGen = A159BarFecGen ;
         AV39BarFecFpr = A158BarFecFpr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'TIPART' Routine */
      returnInSub = false ;
      AV16TipArtDsc = " " ;
      /* Using cursor P0A424 */
      pr_default.execute(1, new Object[] {AV8EmprCod, Short.valueOf(AV22BarTipArt)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A829TipArtCod = P0A424_A829TipArtCod[0] ;
         A396EmprCod = P0A424_A396EmprCod[0] ;
         A830TipArtDsc = P0A424_A830TipArtDsc[0] ;
         n830TipArtDsc = P0A424_n830TipArtDsc[0] ;
         AV16TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP4[0] = consultaproduccioninfgral_fases.this.AV12CliCod;
      this.aP5[0] = consultaproduccioninfgral_fases.this.AV13CliNom;
      this.aP6[0] = consultaproduccioninfgral_fases.this.AV23BarDisNum;
      this.aP7[0] = consultaproduccioninfgral_fases.this.AV14BarSer;
      this.aP8[0] = consultaproduccioninfgral_fases.this.AV26BarFecCli;
      this.aP9[0] = consultaproduccioninfgral_fases.this.AV25BarColNom;
      this.aP10[0] = consultaproduccioninfgral_fases.this.AV24BarColNum;
      this.aP11[0] = consultaproduccioninfgral_fases.this.AV27BarKgm;
      this.aP12[0] = consultaproduccioninfgral_fases.this.AV28BarMtr;
      this.aP13[0] = consultaproduccioninfgral_fases.this.AV29BarPie;
      this.aP14[0] = consultaproduccioninfgral_fases.this.AV15BarSerDsc;
      this.aP15[0] = consultaproduccioninfgral_fases.this.AV16TipArtDsc;
      this.aP16[0] = consultaproduccioninfgral_fases.this.AV21BarTipCol;
      this.aP17[0] = consultaproduccioninfgral_fases.this.AV30BarNomCli;
      this.aP18[0] = consultaproduccioninfgral_fases.this.AV31BarNumCli;
      this.aP19[0] = consultaproduccioninfgral_fases.this.AV32BarTipDis;
      this.aP20[0] = consultaproduccioninfgral_fases.this.AV35EncCli;
      this.aP21[0] = consultaproduccioninfgral_fases.this.AV33DisCod;
      this.aP22[0] = consultaproduccioninfgral_fases.this.AV36BarTra1;
      this.aP23[0] = consultaproduccioninfgral_fases.this.AV41BarTra2;
      this.aP24[0] = consultaproduccioninfgral_fases.this.AV42BarTra3;
      this.aP25[0] = consultaproduccioninfgral_fases.this.AV43BarTrap1;
      this.aP26[0] = consultaproduccioninfgral_fases.this.AV44BarTrap2;
      this.aP27[0] = consultaproduccioninfgral_fases.this.AV45BarTrap3;
      this.aP28[0] = consultaproduccioninfgral_fases.this.AV46BarUrd1;
      this.aP29[0] = consultaproduccioninfgral_fases.this.AV48BarUrd2;
      this.aP30[0] = consultaproduccioninfgral_fases.this.AV50BarUrd3;
      this.aP31[0] = consultaproduccioninfgral_fases.this.AV47BarUrdp1;
      this.aP32[0] = consultaproduccioninfgral_fases.this.AV49BarUrdp2;
      this.aP33[0] = consultaproduccioninfgral_fases.this.AV51BarUrdp3;
      this.aP34[0] = consultaproduccioninfgral_fases.this.AV37BarAncAca1;
      this.aP35[0] = consultaproduccioninfgral_fases.this.AV40BarGraAca;
      this.aP36[0] = consultaproduccioninfgral_fases.this.AV38BarFecGen;
      this.aP37[0] = consultaproduccioninfgral_fases.this.AV39BarFecFpr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13CliNom = "" ;
      AV23BarDisNum = "" ;
      AV14BarSer = "" ;
      AV26BarFecCli = GXutil.nullDate() ;
      AV25BarColNom = "" ;
      AV27BarKgm = DecimalUtil.ZERO ;
      AV28BarMtr = DecimalUtil.ZERO ;
      AV15BarSerDsc = "" ;
      AV16TipArtDsc = "" ;
      AV30BarNomCli = "" ;
      AV32BarTipDis = "" ;
      AV35EncCli = "" ;
      AV36BarTra1 = "" ;
      AV41BarTra2 = "" ;
      AV42BarTra3 = "" ;
      AV46BarUrd1 = "" ;
      AV48BarUrd2 = "" ;
      AV50BarUrd3 = "" ;
      AV38BarFecGen = GXutil.nullDate() ;
      AV39BarFecFpr = GXutil.nullDate() ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P0A423_A130BarCodPar = new String[] {""} ;
      P0A423_A132BarCodReo = new byte[1] ;
      P0A423_A129BarCod = new int[1] ;
      P0A423_A396EmprCod = new String[] {""} ;
      P0A423_A252CliCod = new int[1] ;
      P0A423_n252CliCod = new boolean[] {false} ;
      P0A423_A279CliNom = new String[] {""} ;
      P0A423_A212BarSer = new String[] {""} ;
      P0A423_A1652BarSerDsc = new String[] {""} ;
      P0A423_A217BarTipArt = new short[1] ;
      P0A423_n217BarTipArt = new boolean[] {false} ;
      P0A423_A143BarDisNum = new String[] {""} ;
      P0A423_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A423_A135BarColNom = new String[] {""} ;
      P0A423_A136BarColNum = new int[1] ;
      P0A423_A218BarTipCol = new byte[1] ;
      P0A423_A4812BarEncCli = new String[] {""} ;
      P0A423_A361DisCod = new int[1] ;
      P0A423_A1234BarNomCli = new String[] {""} ;
      P0A423_A1235BarNumCli = new int[1] ;
      P0A423_A2010BarTipDis = new String[] {""} ;
      P0A423_A221BarTra1 = new String[] {""} ;
      P0A423_A222BarTra2 = new String[] {""} ;
      P0A423_A223BarTra3 = new String[] {""} ;
      P0A423_A224BarTraP1 = new short[1] ;
      P0A423_A225BarTraP2 = new short[1] ;
      P0A423_A226BarTraP3 = new short[1] ;
      P0A423_A229BarUrd1 = new String[] {""} ;
      P0A423_A230BarUrd2 = new String[] {""} ;
      P0A423_A231BarUrd3 = new String[] {""} ;
      P0A423_A232BarUrdP1 = new short[1] ;
      P0A423_A233BarUrdP2 = new short[1] ;
      P0A423_A234BarUrdP3 = new short[1] ;
      P0A423_A125BarAncAca1 = new short[1] ;
      P0A423_A1909BarGraAca = new short[1] ;
      P0A423_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0A423_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P0A423_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A423_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A423_A199BarPie1 = new short[1] ;
      P0A423_A365DisDes = new String[] {""} ;
      P0A423_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A143BarDisNum = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A135BarColNom = "" ;
      A4812BarEncCli = "" ;
      A1234BarNomCli = "" ;
      A2010BarTipDis = "" ;
      A221BarTra1 = "" ;
      A222BarTra2 = "" ;
      A223BarTra3 = "" ;
      A229BarUrd1 = "" ;
      A230BarUrd2 = "" ;
      A231BarUrd3 = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      P0A424_A829TipArtCod = new short[1] ;
      P0A424_A396EmprCod = new String[] {""} ;
      P0A424_A830TipArtDsc = new String[] {""} ;
      P0A424_n830TipArtDsc = new boolean[] {false} ;
      A830TipArtDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultaproduccioninfgral_fases__default(),
         new Object[] {
             new Object[] {
            P0A423_A130BarCodPar, P0A423_A132BarCodReo, P0A423_A129BarCod, P0A423_A396EmprCod, P0A423_A252CliCod, P0A423_n252CliCod, P0A423_A279CliNom, P0A423_A212BarSer, P0A423_A1652BarSerDsc, P0A423_A217BarTipArt,
            P0A423_n217BarTipArt, P0A423_A143BarDisNum, P0A423_A155BarFecCli, P0A423_A135BarColNom, P0A423_A136BarColNum, P0A423_A218BarTipCol, P0A423_A4812BarEncCli, P0A423_A361DisCod, P0A423_A1234BarNomCli, P0A423_A1235BarNumCli,
            P0A423_A2010BarTipDis, P0A423_A221BarTra1, P0A423_A222BarTra2, P0A423_A223BarTra3, P0A423_A224BarTraP1, P0A423_A225BarTraP2, P0A423_A226BarTraP3, P0A423_A229BarUrd1, P0A423_A230BarUrd2, P0A423_A231BarUrd3,
            P0A423_A232BarUrdP1, P0A423_A233BarUrdP2, P0A423_A234BarUrdP3, P0A423_A125BarAncAca1, P0A423_A1909BarGraAca, P0A423_A159BarFecGen, P0A423_A158BarFecFpr, P0A423_A166BarKgm, P0A423_A184BarMtr, P0A423_A199BarPie1,
            P0A423_A365DisDes, P0A423_A898BarPieNDes
            }
            , new Object[] {
            P0A424_A829TipArtCod, P0A424_A396EmprCod, P0A424_A830TipArtDsc, P0A424_n830TipArtDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte AV21BarTipCol ;
   private byte AV34Enc20c ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private short AV43BarTrap1 ;
   private short AV44BarTrap2 ;
   private short AV45BarTrap3 ;
   private short AV47BarUrdp1 ;
   private short AV49BarUrdp2 ;
   private short AV51BarUrdp3 ;
   private short AV37BarAncAca1 ;
   private short AV40BarGraAca ;
   private short A217BarTipArt ;
   private short A224BarTraP1 ;
   private short A225BarTraP2 ;
   private short A226BarTraP3 ;
   private short A232BarUrdP1 ;
   private short A233BarUrdP2 ;
   private short A234BarUrdP3 ;
   private short A125BarAncAca1 ;
   private short A1909BarGraAca ;
   private short A199BarPie1 ;
   private short AV22BarTipArt ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int AV9BarCod ;
   private int AV12CliCod ;
   private int AV24BarColNum ;
   private int AV29BarPie ;
   private int AV31BarNumCli ;
   private int AV33DisCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A361DisCod ;
   private int A1235BarNumCli ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private java.math.BigDecimal AV27BarKgm ;
   private java.math.BigDecimal AV28BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV8EmprCod ;
   private String AV11BarCodPar ;
   private String AV13CliNom ;
   private String AV23BarDisNum ;
   private String AV14BarSer ;
   private String AV25BarColNom ;
   private String AV15BarSerDsc ;
   private String AV16TipArtDsc ;
   private String AV30BarNomCli ;
   private String AV32BarTipDis ;
   private String AV35EncCli ;
   private String AV36BarTra1 ;
   private String AV41BarTra2 ;
   private String AV42BarTra3 ;
   private String AV46BarUrd1 ;
   private String AV48BarUrd2 ;
   private String AV50BarUrd3 ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A143BarDisNum ;
   private String A135BarColNom ;
   private String A4812BarEncCli ;
   private String A1234BarNomCli ;
   private String A2010BarTipDis ;
   private String A221BarTra1 ;
   private String A222BarTra2 ;
   private String A223BarTra3 ;
   private String A229BarUrd1 ;
   private String A230BarUrd2 ;
   private String A231BarUrd3 ;
   private String A365DisDes ;
   private String A830TipArtDsc ;
   private java.util.Date AV26BarFecCli ;
   private java.util.Date AV38BarFecGen ;
   private java.util.Date AV39BarFecFpr ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A158BarFecFpr ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private boolean n830TipArtDsc ;
   private java.util.Date[] aP37 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private java.util.Date[] aP8 ;
   private String[] aP9 ;
   private int[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private int[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private byte[] aP16 ;
   private String[] aP17 ;
   private int[] aP18 ;
   private String[] aP19 ;
   private String[] aP20 ;
   private int[] aP21 ;
   private String[] aP22 ;
   private String[] aP23 ;
   private String[] aP24 ;
   private short[] aP25 ;
   private short[] aP26 ;
   private short[] aP27 ;
   private String[] aP28 ;
   private String[] aP29 ;
   private String[] aP30 ;
   private short[] aP31 ;
   private short[] aP32 ;
   private short[] aP33 ;
   private short[] aP34 ;
   private short[] aP35 ;
   private java.util.Date[] aP36 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A423_A130BarCodPar ;
   private byte[] P0A423_A132BarCodReo ;
   private int[] P0A423_A129BarCod ;
   private String[] P0A423_A396EmprCod ;
   private int[] P0A423_A252CliCod ;
   private boolean[] P0A423_n252CliCod ;
   private String[] P0A423_A279CliNom ;
   private String[] P0A423_A212BarSer ;
   private String[] P0A423_A1652BarSerDsc ;
   private short[] P0A423_A217BarTipArt ;
   private boolean[] P0A423_n217BarTipArt ;
   private String[] P0A423_A143BarDisNum ;
   private java.util.Date[] P0A423_A155BarFecCli ;
   private String[] P0A423_A135BarColNom ;
   private int[] P0A423_A136BarColNum ;
   private byte[] P0A423_A218BarTipCol ;
   private String[] P0A423_A4812BarEncCli ;
   private int[] P0A423_A361DisCod ;
   private String[] P0A423_A1234BarNomCli ;
   private int[] P0A423_A1235BarNumCli ;
   private String[] P0A423_A2010BarTipDis ;
   private String[] P0A423_A221BarTra1 ;
   private String[] P0A423_A222BarTra2 ;
   private String[] P0A423_A223BarTra3 ;
   private short[] P0A423_A224BarTraP1 ;
   private short[] P0A423_A225BarTraP2 ;
   private short[] P0A423_A226BarTraP3 ;
   private String[] P0A423_A229BarUrd1 ;
   private String[] P0A423_A230BarUrd2 ;
   private String[] P0A423_A231BarUrd3 ;
   private short[] P0A423_A232BarUrdP1 ;
   private short[] P0A423_A233BarUrdP2 ;
   private short[] P0A423_A234BarUrdP3 ;
   private short[] P0A423_A125BarAncAca1 ;
   private short[] P0A423_A1909BarGraAca ;
   private java.util.Date[] P0A423_A159BarFecGen ;
   private java.util.Date[] P0A423_A158BarFecFpr ;
   private java.math.BigDecimal[] P0A423_A166BarKgm ;
   private java.math.BigDecimal[] P0A423_A184BarMtr ;
   private short[] P0A423_A199BarPie1 ;
   private String[] P0A423_A365DisDes ;
   private int[] P0A423_A898BarPieNDes ;
   private short[] P0A424_A829TipArtCod ;
   private String[] P0A424_A396EmprCod ;
   private String[] P0A424_A830TipArtDsc ;
   private boolean[] P0A424_n830TipArtDsc ;
}

final  class consultaproduccioninfgral_fases__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A423", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T3.CliNom, T1.BarSer, T1.BarSerDsc, T1.BarTipArt, T1.BarDisNum, T1.BarFecCli, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarEncCli, T1.DisCod, T1.BarNomCli, T1.BarNumCli, T1.BarTipDis, T1.BarTra1, T1.BarTra2, T1.BarTra3, T1.BarTraP1, T1.BarTraP2, T1.BarTraP3, T1.BarUrd1, T1.BarUrd2, T1.BarUrd3, T1.BarUrdP1, T1.BarUrdP2, T1.BarUrdP3, T1.BarAncAca1, T1.BarGraAca, T1.BarFecGen, T1.BarFecFpr, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0A424", "SELECT TipArtCod, EmprCod, TipArtDsc FROM TXPTIPART WHERE EmprCod = ? and TipArtCod = ? ORDER BY EmprCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 13);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 20);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 13);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((String[]) buf[21])[0] = rslt.getString(20, 4);
               ((String[]) buf[22])[0] = rslt.getString(21, 4);
               ((String[]) buf[23])[0] = rslt.getString(22, 4);
               ((short[]) buf[24])[0] = rslt.getShort(23);
               ((short[]) buf[25])[0] = rslt.getShort(24);
               ((short[]) buf[26])[0] = rslt.getShort(25);
               ((String[]) buf[27])[0] = rslt.getString(26, 4);
               ((String[]) buf[28])[0] = rslt.getString(27, 4);
               ((String[]) buf[29])[0] = rslt.getString(28, 4);
               ((short[]) buf[30])[0] = rslt.getShort(29);
               ((short[]) buf[31])[0] = rslt.getShort(30);
               ((short[]) buf[32])[0] = rslt.getShort(31);
               ((short[]) buf[33])[0] = rslt.getShort(32);
               ((short[]) buf[34])[0] = rslt.getShort(33);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(34);
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDate(35);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(37,2);
               ((short[]) buf[39])[0] = rslt.getShort(38);
               ((String[]) buf[40])[0] = rslt.getString(39, 1);
               ((int[]) buf[41])[0] = rslt.getInt(40);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

