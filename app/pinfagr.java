package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinfagr extends GXProcedure
{
   public pinfagr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinfagr.class ), "" );
   }

   public pinfagr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             java.util.Date[] aP12 ,
                             byte[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             int[] aP16 ,
                             java.util.Date[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             int[] aP20 ,
                             java.util.Date[] aP21 )
   {
      pinfagr.this.aP22 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
      return aP22[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 ,
                        byte[] aP10 ,
                        String[] aP11 ,
                        java.util.Date[] aP12 ,
                        byte[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 ,
                        int[] aP16 ,
                        java.util.Date[] aP17 ,
                        String[] aP18 ,
                        String[] aP19 ,
                        int[] aP20 ,
                        java.util.Date[] aP21 ,
                        String[] aP22 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 ,
                             byte[] aP10 ,
                             String[] aP11 ,
                             java.util.Date[] aP12 ,
                             byte[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 ,
                             int[] aP16 ,
                             java.util.Date[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             int[] aP20 ,
                             java.util.Date[] aP21 ,
                             String[] aP22 )
   {
      pinfagr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinfagr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pinfagr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pinfagr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pinfagr.this.aP4 = aP4;
      pinfagr.this.aP5 = aP5;
      pinfagr.this.aP6 = aP6;
      pinfagr.this.aP7 = aP7;
      pinfagr.this.aP8 = aP8;
      pinfagr.this.aP9 = aP9;
      pinfagr.this.aP10 = aP10;
      pinfagr.this.aP11 = aP11;
      pinfagr.this.aP12 = aP12;
      pinfagr.this.aP13 = aP13;
      pinfagr.this.aP14 = aP14;
      pinfagr.this.aP15 = aP15;
      pinfagr.this.aP16 = aP16;
      pinfagr.this.aP17 = aP17;
      pinfagr.this.aP18 = aP18;
      pinfagr.this.aP19 = aP19;
      pinfagr.this.aP20 = aP20;
      pinfagr.this.aP21 = aP21;
      pinfagr.this.aP22 = aP22;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV27Etm ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int2) ;
      pinfagr.this.GXt_int1 = GXv_int2[0] ;
      AV27Etm = GXt_int1 ;
      /* Using cursor P048E5 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P048E5_A252CliCod[0] ;
         n252CliCod = P048E5_n252CliCod[0] ;
         A212BarSer = P048E5_A212BarSer[0] ;
         A135BarColNom = P048E5_A135BarColNom[0] ;
         A136BarColNum = P048E5_A136BarColNum[0] ;
         A218BarTipCol = P048E5_A218BarTipCol[0] ;
         A279CliNom = P048E5_A279CliNom[0] ;
         A158BarFecFpr = P048E5_A158BarFecFpr[0] ;
         A3594BarPriTin = P048E5_A3594BarPriTin[0] ;
         A143BarDisNum = P048E5_A143BarDisNum[0] ;
         A4812BarEncCli = P048E5_A4812BarEncCli[0] ;
         A3595BarMacCod = P048E5_A3595BarMacCod[0] ;
         A159BarFecGen = P048E5_A159BarFecGen[0] ;
         A1652BarSerDsc = P048E5_A1652BarSerDsc[0] ;
         A1234BarNomCli = P048E5_A1234BarNomCli[0] ;
         A166BarKgm = P048E5_A166BarKgm[0] ;
         A184BarMtr = P048E5_A184BarMtr[0] ;
         A151BarFasCod = P048E5_A151BarFasCod[0] ;
         n151BarFasCod = P048E5_n151BarFasCod[0] ;
         A199BarPie1 = P048E5_A199BarPie1[0] ;
         A365DisDes = P048E5_A365DisDes[0] ;
         A898BarPieNDes = P048E5_A898BarPieNDes[0] ;
         A279CliNom = P048E5_A279CliNom[0] ;
         A166BarKgm = P048E5_A166BarKgm[0] ;
         A184BarMtr = P048E5_A184BarMtr[0] ;
         A199BarPie1 = P048E5_A199BarPie1[0] ;
         A898BarPieNDes = P048E5_A898BarPieNDes[0] ;
         A151BarFasCod = P048E5_A151BarFasCod[0] ;
         n151BarFasCod = P048E5_n151BarFasCod[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV8Barkgm = A166BarKgm ;
         AV9BarMtr = A184BarMtr ;
         AV10Barpie = A198BarPie ;
         AV11Barser = A212BarSer ;
         AV12Barcolnom = A135BarColNom ;
         AV13Barcolnum = A136BarColNum ;
         AV14Bartipcol = A218BarTipCol ;
         AV15CliNom = A279CliNom ;
         AV16Barfecfpr = A158BarFecFpr ;
         AV17BarPritin = A3594BarPriTin ;
         AV18Barenccli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
         AV20barmaccod = A3595BarMacCod ;
         AV21Barfecgen = A159BarFecGen ;
         AV22BarfasCod = A151BarFasCod ;
         AV25Barserdsc = A1652BarSerDsc ;
         AV26BarNomcli = A1234BarNomCli ;
         /* Using cursor P048E6 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A50AlbRLoc = P048E6_A50AlbRLoc[0] ;
            A44AlbRecCod = P048E6_A44AlbRecCod[0] ;
            A49AlbRFen = P048E6_A49AlbRFen[0] ;
            A200BarPieCod = P048E6_A200BarPieCod[0] ;
            A50AlbRLoc = P048E6_A50AlbRLoc[0] ;
            A49AlbRFen = P048E6_A49AlbRFen[0] ;
            AV19AlbRLoc = A50AlbRLoc ;
            AV23Albreccod = A44AlbRecCod ;
            AV24ALbrfen = A49AlbRFen ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV28Lb_fectin = GXutil.nullDate() ;
         /* Using cursor P048E7 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A9611Lb_Hdr = P048E7_A9611Lb_Hdr[0] ;
            A9612Lb_Hdrr = P048E7_A9612Lb_Hdrr[0] ;
            A9613Lb_Hdrp = P048E7_A9613Lb_Hdrp[0] ;
            A9623Lb_FecTin = P048E7_A9623Lb_FecTin[0] ;
            n9623Lb_FecTin = P048E7_n9623Lb_FecTin[0] ;
            AV28Lb_fectin = A9623Lb_FecTin ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         AV21Barfecgen = ((AV27Etm==1) ? AV28Lb_fectin : AV21Barfecgen) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinfagr.this.A396EmprCod;
      this.aP1[0] = pinfagr.this.A129BarCod;
      this.aP2[0] = pinfagr.this.A132BarCodReo;
      this.aP3[0] = pinfagr.this.A130BarCodPar;
      this.aP4[0] = pinfagr.this.AV8Barkgm;
      this.aP5[0] = pinfagr.this.AV9BarMtr;
      this.aP6[0] = pinfagr.this.AV10Barpie;
      this.aP7[0] = pinfagr.this.AV11Barser;
      this.aP8[0] = pinfagr.this.AV12Barcolnom;
      this.aP9[0] = pinfagr.this.AV13Barcolnum;
      this.aP10[0] = pinfagr.this.AV14Bartipcol;
      this.aP11[0] = pinfagr.this.AV15CliNom;
      this.aP12[0] = pinfagr.this.AV16Barfecfpr;
      this.aP13[0] = pinfagr.this.AV17BarPritin;
      this.aP14[0] = pinfagr.this.AV18Barenccli;
      this.aP15[0] = pinfagr.this.AV19AlbRLoc;
      this.aP16[0] = pinfagr.this.AV20barmaccod;
      this.aP17[0] = pinfagr.this.AV21Barfecgen;
      this.aP18[0] = pinfagr.this.AV22BarfasCod;
      this.aP19[0] = pinfagr.this.AV25Barserdsc;
      this.aP20[0] = pinfagr.this.AV23Albreccod;
      this.aP21[0] = pinfagr.this.AV24ALbrfen;
      this.aP22[0] = pinfagr.this.AV26BarNomcli;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Barkgm = DecimalUtil.ZERO ;
      AV9BarMtr = DecimalUtil.ZERO ;
      AV11Barser = "" ;
      AV12Barcolnom = "" ;
      AV15CliNom = "" ;
      AV16Barfecfpr = GXutil.nullDate() ;
      AV18Barenccli = "" ;
      AV19AlbRLoc = "" ;
      AV21Barfecgen = GXutil.nullDate() ;
      AV22BarfasCod = "" ;
      AV25Barserdsc = "" ;
      AV24ALbrfen = GXutil.nullDate() ;
      AV26BarNomcli = "" ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P048E5_A252CliCod = new int[1] ;
      P048E5_n252CliCod = new boolean[] {false} ;
      P048E5_A396EmprCod = new String[] {""} ;
      P048E5_A129BarCod = new int[1] ;
      P048E5_A132BarCodReo = new byte[1] ;
      P048E5_A130BarCodPar = new String[] {""} ;
      P048E5_A212BarSer = new String[] {""} ;
      P048E5_A135BarColNom = new String[] {""} ;
      P048E5_A136BarColNum = new int[1] ;
      P048E5_A218BarTipCol = new byte[1] ;
      P048E5_A279CliNom = new String[] {""} ;
      P048E5_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P048E5_A3594BarPriTin = new byte[1] ;
      P048E5_A143BarDisNum = new String[] {""} ;
      P048E5_A4812BarEncCli = new String[] {""} ;
      P048E5_A3595BarMacCod = new int[1] ;
      P048E5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P048E5_A1652BarSerDsc = new String[] {""} ;
      P048E5_A1234BarNomCli = new String[] {""} ;
      P048E5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048E5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P048E5_A151BarFasCod = new String[] {""} ;
      P048E5_n151BarFasCod = new boolean[] {false} ;
      P048E5_A199BarPie1 = new short[1] ;
      P048E5_A365DisDes = new String[] {""} ;
      P048E5_A898BarPieNDes = new int[1] ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A279CliNom = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A1652BarSerDsc = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      A365DisDes = "" ;
      P048E6_A396EmprCod = new String[] {""} ;
      P048E6_A129BarCod = new int[1] ;
      P048E6_A132BarCodReo = new byte[1] ;
      P048E6_A130BarCodPar = new String[] {""} ;
      P048E6_A50AlbRLoc = new String[] {""} ;
      P048E6_A44AlbRecCod = new int[1] ;
      P048E6_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P048E6_A200BarPieCod = new String[] {""} ;
      A50AlbRLoc = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A200BarPieCod = "" ;
      AV28Lb_fectin = GXutil.nullDate() ;
      P048E7_A396EmprCod = new String[] {""} ;
      P048E7_A9611Lb_Hdr = new int[1] ;
      P048E7_A9612Lb_Hdrr = new byte[1] ;
      P048E7_A9613Lb_Hdrp = new String[] {""} ;
      P048E7_A9623Lb_FecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P048E7_n9623Lb_FecTin = new boolean[] {false} ;
      A9613Lb_Hdrp = "" ;
      A9623Lb_FecTin = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinfagr__default(),
         new Object[] {
             new Object[] {
            P048E5_A252CliCod, P048E5_n252CliCod, P048E5_A396EmprCod, P048E5_A129BarCod, P048E5_A132BarCodReo, P048E5_A130BarCodPar, P048E5_A212BarSer, P048E5_A135BarColNom, P048E5_A136BarColNum, P048E5_A218BarTipCol,
            P048E5_A279CliNom, P048E5_A158BarFecFpr, P048E5_A3594BarPriTin, P048E5_A143BarDisNum, P048E5_A4812BarEncCli, P048E5_A3595BarMacCod, P048E5_A159BarFecGen, P048E5_A1652BarSerDsc, P048E5_A1234BarNomCli, P048E5_A166BarKgm,
            P048E5_A184BarMtr, P048E5_A151BarFasCod, P048E5_n151BarFasCod, P048E5_A199BarPie1, P048E5_A365DisDes, P048E5_A898BarPieNDes
            }
            , new Object[] {
            P048E6_A396EmprCod, P048E6_A129BarCod, P048E6_A132BarCodReo, P048E6_A130BarCodPar, P048E6_A50AlbRLoc, P048E6_A44AlbRecCod, P048E6_A49AlbRFen, P048E6_A200BarPieCod
            }
            , new Object[] {
            P048E7_A396EmprCod, P048E7_A9611Lb_Hdr, P048E7_A9612Lb_Hdrr, P048E7_A9613Lb_Hdrp, P048E7_A9623Lb_FecTin, P048E7_n9623Lb_FecTin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV14Bartipcol ;
   private byte AV17BarPritin ;
   private byte AV27Etm ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A218BarTipCol ;
   private byte A3594BarPriTin ;
   private byte A9612Lb_Hdrr ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV10Barpie ;
   private int AV13Barcolnum ;
   private int AV20barmaccod ;
   private int AV23Albreccod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A3595BarMacCod ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int A44AlbRecCod ;
   private int A9611Lb_Hdr ;
   private java.math.BigDecimal AV8Barkgm ;
   private java.math.BigDecimal AV9BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV11Barser ;
   private String AV12Barcolnom ;
   private String AV15CliNom ;
   private String AV18Barenccli ;
   private String AV19AlbRLoc ;
   private String AV22BarfasCod ;
   private String AV25Barserdsc ;
   private String AV26BarNomcli ;
   private String scmdbuf ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A279CliNom ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A1652BarSerDsc ;
   private String A1234BarNomCli ;
   private String A151BarFasCod ;
   private String A365DisDes ;
   private String A50AlbRLoc ;
   private String A200BarPieCod ;
   private String A9613Lb_Hdrp ;
   private java.util.Date AV16Barfecfpr ;
   private java.util.Date AV21Barfecgen ;
   private java.util.Date AV24ALbrfen ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV28Lb_fectin ;
   private java.util.Date A9623Lb_FecTin ;
   private boolean n252CliCod ;
   private boolean n151BarFasCod ;
   private boolean n9623Lb_FecTin ;
   private String[] aP22 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private int[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private int[] aP9 ;
   private byte[] aP10 ;
   private String[] aP11 ;
   private java.util.Date[] aP12 ;
   private byte[] aP13 ;
   private String[] aP14 ;
   private String[] aP15 ;
   private int[] aP16 ;
   private java.util.Date[] aP17 ;
   private String[] aP18 ;
   private String[] aP19 ;
   private int[] aP20 ;
   private java.util.Date[] aP21 ;
   private IDataStoreProvider pr_default ;
   private int[] P048E5_A252CliCod ;
   private boolean[] P048E5_n252CliCod ;
   private String[] P048E5_A396EmprCod ;
   private int[] P048E5_A129BarCod ;
   private byte[] P048E5_A132BarCodReo ;
   private String[] P048E5_A130BarCodPar ;
   private String[] P048E5_A212BarSer ;
   private String[] P048E5_A135BarColNom ;
   private int[] P048E5_A136BarColNum ;
   private byte[] P048E5_A218BarTipCol ;
   private String[] P048E5_A279CliNom ;
   private java.util.Date[] P048E5_A158BarFecFpr ;
   private byte[] P048E5_A3594BarPriTin ;
   private String[] P048E5_A143BarDisNum ;
   private String[] P048E5_A4812BarEncCli ;
   private int[] P048E5_A3595BarMacCod ;
   private java.util.Date[] P048E5_A159BarFecGen ;
   private String[] P048E5_A1652BarSerDsc ;
   private String[] P048E5_A1234BarNomCli ;
   private java.math.BigDecimal[] P048E5_A166BarKgm ;
   private java.math.BigDecimal[] P048E5_A184BarMtr ;
   private String[] P048E5_A151BarFasCod ;
   private boolean[] P048E5_n151BarFasCod ;
   private short[] P048E5_A199BarPie1 ;
   private String[] P048E5_A365DisDes ;
   private int[] P048E5_A898BarPieNDes ;
   private String[] P048E6_A396EmprCod ;
   private int[] P048E6_A129BarCod ;
   private byte[] P048E6_A132BarCodReo ;
   private String[] P048E6_A130BarCodPar ;
   private String[] P048E6_A50AlbRLoc ;
   private int[] P048E6_A44AlbRecCod ;
   private java.util.Date[] P048E6_A49AlbRFen ;
   private String[] P048E6_A200BarPieCod ;
   private String[] P048E7_A396EmprCod ;
   private int[] P048E7_A9611Lb_Hdr ;
   private byte[] P048E7_A9612Lb_Hdrr ;
   private String[] P048E7_A9613Lb_Hdrp ;
   private java.util.Date[] P048E7_A9623Lb_FecTin ;
   private boolean[] P048E7_n9623Lb_FecTin ;
}

final  class pinfagr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P048E5", "SELECT T1.CliCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T2.CliNom, T1.BarFecFpr, T1.BarPriTin, T1.BarDisNum, T1.BarEncCli, T1.BarMacCod, T1.BarFecGen, T1.BarSerDsc, T1.BarNomCli, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T4.BarFasCod, ' ') AS BarFasCod, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM (((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.FasCod) AS BarFasCod, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM (TXPBARFAS T5 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar) WHERE (T5.BarOrdLin = T6.GXC2) AND (T5.BarFasEst <> 0) GROUP BY T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P048E6", "SELECT * FROM (SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbRLoc, T1.AlbRecCod, T2.AlbRFen, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P048E7", "SELECT EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp, Lb_FecTin FROM TXPHDRINO WHERE EmprCod = ? and Lb_Hdr = ? and Lb_Hdrr = ? and Lb_Hdrp = ? ORDER BY EmprCod, Lb_Hdr, Lb_Hdrr, Lb_Hdrp ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 8);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 26);
               ((String[]) buf[18])[0] = rslt.getString(18, 13);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[21])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(22);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((int[]) buf[25])[0] = rslt.getInt(24);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

