package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppvpttx extends GXProcedure
{
   public ppvpttx( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppvpttx.class ), "" );
   }

   public ppvpttx( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           byte[] aP6 )
   {
      ppvpttx.this.aP7 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 )
   {
      ppvpttx.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ppvpttx.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      ppvpttx.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      ppvpttx.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      ppvpttx.this.AV19PreKgm = aP4[0];
      this.aP4 = aP4;
      ppvpttx.this.AV20PreMts = aP5[0];
      this.aP5 = aP5;
      ppvpttx.this.AV21Operesp = aP6[0];
      this.aP6 = aP6;
      ppvpttx.this.AV22TotRec = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV45Flag ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, "100006", GXv_int1) ;
      ppvpttx.this.AV45Flag = GXv_int1[0] ;
      AV65FlagRecCol = (byte)(0) ;
      GXv_int1[0] = AV65FlagRecCol ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      ppvpttx.this.AV65FlagRecCol = GXv_int1[0] ;
      AV70FlagPorCol = (byte)(0) ;
      GXv_int1[0] = AV70FlagPorCol ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PORCOL", ""), GXv_int1) ;
      ppvpttx.this.AV70FlagPorCol = GXv_int1[0] ;
      AV19PreKgm = DecimalUtil.ZERO ;
      AV20PreMts = DecimalUtil.ZERO ;
      AV24PreDef = httpContext.getMessage( "S", "") ;
      /* Using cursor P046Z3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P046Z3_A130BarCodPar[0] ;
         A132BarCodReo = P046Z3_A132BarCodReo[0] ;
         A129BarCod = P046Z3_A129BarCod[0] ;
         A396EmprCod = P046Z3_A396EmprCod[0] ;
         A161BarFecSal = P046Z3_A161BarFecSal[0] ;
         A252CliCod = P046Z3_A252CliCod[0] ;
         n252CliCod = P046Z3_n252CliCod[0] ;
         A212BarSer = P046Z3_A212BarSer[0] ;
         A135BarColNom = P046Z3_A135BarColNom[0] ;
         A136BarColNum = P046Z3_A136BarColNum[0] ;
         A218BarTipCol = P046Z3_A218BarTipCol[0] ;
         A2010BarTipDis = P046Z3_A2010BarTipDis[0] ;
         A361DisCod = P046Z3_A361DisCod[0] ;
         A228BarUniMed = P046Z3_A228BarUniMed[0] ;
         A120BarAgrEst = P046Z3_A120BarAgrEst[0] ;
         A193BarOpeEsp = P046Z3_A193BarOpeEsp[0] ;
         A5253BarAcc = P046Z3_A5253BarAcc[0] ;
         A184BarMtr = P046Z3_A184BarMtr[0] ;
         A166BarKgm = P046Z3_A166BarKgm[0] ;
         A184BarMtr = P046Z3_A184BarMtr[0] ;
         A166BarKgm = P046Z3_A166BarKgm[0] ;
         A161BarFecSal = Gx_date ;
         AV35CliCod = A252CliCod ;
         AV31BarSer = A212BarSer ;
         AV32BarColNom = A135BarColNom ;
         AV33BarColNum = A136BarColNum ;
         AV34TipColCod = A218BarTipCol ;
         AV87BarTipDis = A2010BarTipDis ;
         AV74DisCod = A361DisCod ;
         /* Execute user subroutine: 'DISPOS' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 )
         {
            AV27LimUni = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A184BarMtr, 0))) ;
            AV44UniMed = httpContext.getMessage( "M", "") ;
         }
         else
         {
            AV27LimUni = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A166BarKgm, 0))) ;
            AV44UniMed = httpContext.getMessage( "K", "") ;
         }
         if ( ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 ) && ( AV71FlagPreAgr == 1 ) )
         {
            GXv_char2[0] = A396EmprCod ;
            GXv_int3[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(AV27LimUni) ;
            new app.ppreagr(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int1, GXv_char4, GXv_decimal5) ;
            ppvpttx.this.A396EmprCod = GXv_char2[0] ;
            ppvpttx.this.A129BarCod = GXv_int3[0] ;
            ppvpttx.this.A132BarCodReo = GXv_int1[0] ;
            ppvpttx.this.A130BarCodPar = GXv_char4[0] ;
            ppvpttx.this.AV27LimUni = (int)(DecimalUtil.decToDouble(GXv_decimal5[0])) ;
         }
         AV48ProCod = "" ;
         /* Using cursor P046Z4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A761ProFasLin = P046Z4_A761ProFasLin[0] ;
            n761ProFasLin = P046Z4_n761ProFasLin[0] ;
            A758ProCod = P046Z4_A758ProCod[0] ;
            AV48ProCod = A758ProCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Execute user subroutine: 'CFORMU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV95Pgcol1 == 1 )
         {
            AV21Operesp = (byte)(A193BarOpeEsp+10) ;
            AV19PreKgm = AV93Pg_pk ;
            AV20PreMts = AV94Pg_pm ;
            A161BarFecSal = GXutil.today( ) ;
         }
         else
         {
            if ( AV98Lprepr == 1 )
            {
               AV21Operesp = (byte)(A193BarOpeEsp+10) ;
               AV19PreKgm = AV97Proprekgm ;
               AV20PreMts = AV96ProPremtr ;
               A161BarFecSal = GXutil.today( ) ;
            }
            else
            {
               /* Execute user subroutine: 'LOCFOR' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV19PreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20PreMts)==0) )
               {
                  AV36Noprecio = httpContext.getMessage( "N", "") ;
               }
               else
               {
                  AV36Noprecio = httpContext.getMessage( "S", "") ;
               }
               if ( ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "N", "")) == 0 ) || ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "N", "")) == 0 ) )
               {
                  AV21Operesp = (byte)(2) ;
               }
               if ( ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "N", "")) == 0 ) && ( A193BarOpeEsp == 4 ) )
               {
                  AV21Operesp = (byte)(4) ;
               }
               if ( ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "S", "")) == 0 ) )
               {
                  if ( ( A193BarOpeEsp == 1 ) || ( A193BarOpeEsp == 5 ) || ( A193BarOpeEsp == 7 ) )
                  {
                     AV21Operesp = A193BarOpeEsp ;
                  }
                  else
                  {
                     AV21Operesp = (byte)(A193BarOpeEsp+10) ;
                  }
               }
               A161BarFecSal = GXutil.today( ) ;
               if ( GXutil.strcmp(A5253BarAcc, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV21Operesp = (byte)(10) ;
                  AV19PreKgm = AV83DisPreKgm ;
                  AV20PreMts = AV84DisPreMtr ;
               }
            }
         }
         /* Using cursor P046Z5 */
         pr_default.execute(2, new Object[] {A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV93Pg_pk = DecimalUtil.doubleToDec(0) ;
      AV94Pg_pm = DecimalUtil.doubleToDec(0) ;
      AV95Pgcol1 = (byte)(0) ;
      /* Using cursor P046Z6 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV32BarColNom, AV48ProCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A758ProCod = P046Z6_A758ProCod[0] ;
         A10839Txt_Cor = P046Z6_A10839Txt_Cor[0] ;
         A252CliCod = P046Z6_A252CliCod[0] ;
         n252CliCod = P046Z6_n252CliCod[0] ;
         A396EmprCod = P046Z6_A396EmprCod[0] ;
         A10842Txt_ProPk = P046Z6_A10842Txt_ProPk[0] ;
         n10842Txt_ProPk = P046Z6_n10842Txt_ProPk[0] ;
         A10843Txt_ProPm = P046Z6_A10843Txt_ProPm[0] ;
         n10843Txt_ProPm = P046Z6_n10843Txt_ProPm[0] ;
         AV93Pg_pk = A10842Txt_ProPk ;
         AV94Pg_pm = A10843Txt_ProPm ;
         AV95Pgcol1 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   public void S121( )
   {
      /* 'LOCFOR' Routine */
      returnInSub = false ;
      /* Using cursor P046Z7 */
      pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV32BarColNom});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A10839Txt_Cor = P046Z7_A10839Txt_Cor[0] ;
         A252CliCod = P046Z7_A252CliCod[0] ;
         n252CliCod = P046Z7_n252CliCod[0] ;
         A396EmprCod = P046Z7_A396EmprCod[0] ;
         A10841Txt_CorPm = P046Z7_A10841Txt_CorPm[0] ;
         n10841Txt_CorPm = P046Z7_n10841Txt_CorPm[0] ;
         A10840Txt_CorPk = P046Z7_A10840Txt_CorPk[0] ;
         n10840Txt_CorPk = P046Z7_n10840Txt_CorPk[0] ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A10840Txt_CorPk)==0) || ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A10841Txt_CorPm)==0) )
         {
            AV19PreKgm = A10840Txt_CorPk ;
            AV20PreMts = A10841Txt_CorPm ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S131( )
   {
      /* 'DISPOS' Routine */
      returnInSub = false ;
      AV83DisPreKgm = DecimalUtil.doubleToDec(0) ;
      AV84DisPreMtr = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P046Z8 */
      pr_default.execute(5, new Object[] {Integer.valueOf(AV74DisCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A361DisCod = P046Z8_A361DisCod[0] ;
         A388DisPreKgm = P046Z8_A388DisPreKgm[0] ;
         A389DisPreMtr = P046Z8_A389DisPreMtr[0] ;
         A396EmprCod = P046Z8_A396EmprCod[0] ;
         AV83DisPreKgm = A388DisPreKgm ;
         AV84DisPreMtr = A389DisPreMtr ;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppvpttx.this.AV15EmprCod;
      this.aP1[0] = ppvpttx.this.AV16BarCod;
      this.aP2[0] = ppvpttx.this.AV17BarReo;
      this.aP3[0] = ppvpttx.this.AV18BarPar;
      this.aP4[0] = ppvpttx.this.AV19PreKgm;
      this.aP5[0] = ppvpttx.this.AV20PreMts;
      this.aP6[0] = ppvpttx.this.AV21Operesp;
      this.aP7[0] = ppvpttx.this.AV22TotRec;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppvpttx");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24PreDef = "" ;
      scmdbuf = "" ;
      P046Z3_A130BarCodPar = new String[] {""} ;
      P046Z3_A132BarCodReo = new byte[1] ;
      P046Z3_A129BarCod = new int[1] ;
      P046Z3_A396EmprCod = new String[] {""} ;
      P046Z3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P046Z3_A252CliCod = new int[1] ;
      P046Z3_n252CliCod = new boolean[] {false} ;
      P046Z3_A212BarSer = new String[] {""} ;
      P046Z3_A135BarColNom = new String[] {""} ;
      P046Z3_A136BarColNum = new int[1] ;
      P046Z3_A218BarTipCol = new byte[1] ;
      P046Z3_A2010BarTipDis = new String[] {""} ;
      P046Z3_A361DisCod = new int[1] ;
      P046Z3_A228BarUniMed = new String[] {""} ;
      P046Z3_A120BarAgrEst = new String[] {""} ;
      P046Z3_A193BarOpeEsp = new byte[1] ;
      P046Z3_A5253BarAcc = new String[] {""} ;
      P046Z3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046Z3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A228BarUniMed = "" ;
      A120BarAgrEst = "" ;
      A5253BarAcc = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      AV31BarSer = "" ;
      AV32BarColNom = "" ;
      AV87BarTipDis = "" ;
      AV44UniMed = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV48ProCod = "" ;
      P046Z4_A396EmprCod = new String[] {""} ;
      P046Z4_A129BarCod = new int[1] ;
      P046Z4_A132BarCodReo = new byte[1] ;
      P046Z4_A130BarCodPar = new String[] {""} ;
      P046Z4_A761ProFasLin = new short[1] ;
      P046Z4_n761ProFasLin = new boolean[] {false} ;
      P046Z4_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV93Pg_pk = DecimalUtil.ZERO ;
      AV94Pg_pm = DecimalUtil.ZERO ;
      AV97Proprekgm = DecimalUtil.ZERO ;
      AV96ProPremtr = DecimalUtil.ZERO ;
      AV36Noprecio = "" ;
      AV83DisPreKgm = DecimalUtil.ZERO ;
      AV84DisPreMtr = DecimalUtil.ZERO ;
      P046Z6_A758ProCod = new String[] {""} ;
      P046Z6_A10839Txt_Cor = new String[] {""} ;
      P046Z6_A252CliCod = new int[1] ;
      P046Z6_n252CliCod = new boolean[] {false} ;
      P046Z6_A396EmprCod = new String[] {""} ;
      P046Z6_A10842Txt_ProPk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046Z6_n10842Txt_ProPk = new boolean[] {false} ;
      P046Z6_A10843Txt_ProPm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046Z6_n10843Txt_ProPm = new boolean[] {false} ;
      A10839Txt_Cor = "" ;
      A10842Txt_ProPk = DecimalUtil.ZERO ;
      A10843Txt_ProPm = DecimalUtil.ZERO ;
      P046Z7_A10839Txt_Cor = new String[] {""} ;
      P046Z7_A252CliCod = new int[1] ;
      P046Z7_n252CliCod = new boolean[] {false} ;
      P046Z7_A396EmprCod = new String[] {""} ;
      P046Z7_A10841Txt_CorPm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046Z7_n10841Txt_CorPm = new boolean[] {false} ;
      P046Z7_A10840Txt_CorPk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046Z7_n10840Txt_CorPk = new boolean[] {false} ;
      A10841Txt_CorPm = DecimalUtil.ZERO ;
      A10840Txt_CorPk = DecimalUtil.ZERO ;
      P046Z8_A361DisCod = new int[1] ;
      P046Z8_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046Z8_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P046Z8_A396EmprCod = new String[] {""} ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppvpttx__default(),
         new Object[] {
             new Object[] {
            P046Z3_A130BarCodPar, P046Z3_A132BarCodReo, P046Z3_A129BarCod, P046Z3_A396EmprCod, P046Z3_A161BarFecSal, P046Z3_A252CliCod, P046Z3_n252CliCod, P046Z3_A212BarSer, P046Z3_A135BarColNom, P046Z3_A136BarColNum,
            P046Z3_A218BarTipCol, P046Z3_A2010BarTipDis, P046Z3_A361DisCod, P046Z3_A228BarUniMed, P046Z3_A120BarAgrEst, P046Z3_A193BarOpeEsp, P046Z3_A5253BarAcc, P046Z3_A184BarMtr, P046Z3_A166BarKgm
            }
            , new Object[] {
            P046Z4_A396EmprCod, P046Z4_A129BarCod, P046Z4_A132BarCodReo, P046Z4_A130BarCodPar, P046Z4_A761ProFasLin, P046Z4_n761ProFasLin, P046Z4_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P046Z6_A758ProCod, P046Z6_A10839Txt_Cor, P046Z6_A252CliCod, P046Z6_A396EmprCod, P046Z6_A10842Txt_ProPk, P046Z6_n10842Txt_ProPk, P046Z6_A10843Txt_ProPm, P046Z6_n10843Txt_ProPm
            }
            , new Object[] {
            P046Z7_A10839Txt_Cor, P046Z7_A252CliCod, P046Z7_A396EmprCod, P046Z7_A10841Txt_CorPm, P046Z7_n10841Txt_CorPm, P046Z7_A10840Txt_CorPk, P046Z7_n10840Txt_CorPk
            }
            , new Object[] {
            P046Z8_A361DisCod, P046Z8_A388DisPreKgm, P046Z8_A389DisPreMtr, P046Z8_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV17BarReo ;
   private byte AV21Operesp ;
   private byte AV45Flag ;
   private byte AV65FlagRecCol ;
   private byte AV70FlagPorCol ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte AV34TipColCod ;
   private byte AV71FlagPreAgr ;
   private byte GXv_int1[] ;
   private byte AV95Pgcol1 ;
   private byte AV98Lprepr ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A361DisCod ;
   private int AV35CliCod ;
   private int AV33BarColNum ;
   private int AV74DisCod ;
   private int AV27LimUni ;
   private int GXv_int3[] ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV93Pg_pk ;
   private java.math.BigDecimal AV94Pg_pm ;
   private java.math.BigDecimal AV97Proprekgm ;
   private java.math.BigDecimal AV96ProPremtr ;
   private java.math.BigDecimal AV83DisPreKgm ;
   private java.math.BigDecimal AV84DisPreMtr ;
   private java.math.BigDecimal A10842Txt_ProPk ;
   private java.math.BigDecimal A10843Txt_ProPm ;
   private java.math.BigDecimal A10841Txt_CorPm ;
   private java.math.BigDecimal A10840Txt_CorPk ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A389DisPreMtr ;
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String AV24PreDef ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A2010BarTipDis ;
   private String A228BarUniMed ;
   private String A120BarAgrEst ;
   private String A5253BarAcc ;
   private String AV31BarSer ;
   private String AV32BarColNom ;
   private String AV87BarTipDis ;
   private String AV44UniMed ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String AV48ProCod ;
   private String A758ProCod ;
   private String AV36Noprecio ;
   private String A10839Txt_Cor ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n10842Txt_ProPk ;
   private boolean n10843Txt_ProPm ;
   private boolean n10841Txt_CorPm ;
   private boolean n10840Txt_CorPk ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P046Z3_A130BarCodPar ;
   private byte[] P046Z3_A132BarCodReo ;
   private int[] P046Z3_A129BarCod ;
   private String[] P046Z3_A396EmprCod ;
   private java.util.Date[] P046Z3_A161BarFecSal ;
   private int[] P046Z3_A252CliCod ;
   private boolean[] P046Z3_n252CliCod ;
   private String[] P046Z3_A212BarSer ;
   private String[] P046Z3_A135BarColNom ;
   private int[] P046Z3_A136BarColNum ;
   private byte[] P046Z3_A218BarTipCol ;
   private String[] P046Z3_A2010BarTipDis ;
   private int[] P046Z3_A361DisCod ;
   private String[] P046Z3_A228BarUniMed ;
   private String[] P046Z3_A120BarAgrEst ;
   private byte[] P046Z3_A193BarOpeEsp ;
   private String[] P046Z3_A5253BarAcc ;
   private java.math.BigDecimal[] P046Z3_A184BarMtr ;
   private java.math.BigDecimal[] P046Z3_A166BarKgm ;
   private String[] P046Z4_A396EmprCod ;
   private int[] P046Z4_A129BarCod ;
   private byte[] P046Z4_A132BarCodReo ;
   private String[] P046Z4_A130BarCodPar ;
   private short[] P046Z4_A761ProFasLin ;
   private boolean[] P046Z4_n761ProFasLin ;
   private String[] P046Z4_A758ProCod ;
   private String[] P046Z6_A758ProCod ;
   private String[] P046Z6_A10839Txt_Cor ;
   private int[] P046Z6_A252CliCod ;
   private boolean[] P046Z6_n252CliCod ;
   private String[] P046Z6_A396EmprCod ;
   private java.math.BigDecimal[] P046Z6_A10842Txt_ProPk ;
   private boolean[] P046Z6_n10842Txt_ProPk ;
   private java.math.BigDecimal[] P046Z6_A10843Txt_ProPm ;
   private boolean[] P046Z6_n10843Txt_ProPm ;
   private String[] P046Z7_A10839Txt_Cor ;
   private int[] P046Z7_A252CliCod ;
   private boolean[] P046Z7_n252CliCod ;
   private String[] P046Z7_A396EmprCod ;
   private java.math.BigDecimal[] P046Z7_A10841Txt_CorPm ;
   private boolean[] P046Z7_n10841Txt_CorPm ;
   private java.math.BigDecimal[] P046Z7_A10840Txt_CorPk ;
   private boolean[] P046Z7_n10840Txt_CorPk ;
   private int[] P046Z8_A361DisCod ;
   private java.math.BigDecimal[] P046Z8_A388DisPreKgm ;
   private java.math.BigDecimal[] P046Z8_A389DisPreMtr ;
   private String[] P046Z8_A396EmprCod ;
}

final  class ppvpttx__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P046Z3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarFecSal, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarTipDis, T1.DisCod, T1.BarUniMed, T1.BarAgrEst, T1.BarOpeEsp, T1.BarAcc, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarKgm, 0) AS BarKgm FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P046Z4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P046Z5", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P046Z6", "SELECT ProCod, Txt_Cor, CliCod, EmprCod, Txt_ProPk, Txt_ProPm FROM TXPPRE001 WHERE EmprCod = ? and CliCod = ? and Txt_Cor = ? and ProCod = ? ORDER BY EmprCod, CliCod, Txt_Cor, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P046Z7", "SELECT Txt_Cor, CliCod, EmprCod, Txt_CorPm, Txt_CorPk FROM TXPPRE002 WHERE EmprCod = ? and CliCod = ? and Txt_Cor = ? ORDER BY EmprCod, CliCod, Txt_Cor ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P046Z8", "SELECT DisCod, DisPreKgm, DisPreMtr, EmprCod FROM TXPDISPOS WHERE DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 13);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 13);
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               return;
      }
   }

}

