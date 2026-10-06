package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbuspreu extends GXProcedure
{
   public pbuspreu( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbuspreu.class ), "" );
   }

   public pbuspreu( int remoteHandle ,
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
                                           byte[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           String[] aP8 )
   {
      pbuspreu.this.aP9 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        byte[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        String[] aP8 ,
                        java.math.BigDecimal[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             byte[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             String[] aP8 ,
                             java.math.BigDecimal[] aP9 )
   {
      pbuspreu.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pbuspreu.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      pbuspreu.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      pbuspreu.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      pbuspreu.this.AV19PreKgm = aP4[0];
      this.aP4 = aP4;
      pbuspreu.this.AV20PreMts = aP5[0];
      this.aP5 = aP5;
      pbuspreu.this.AV21Operesp = aP6[0];
      this.aP6 = aP6;
      pbuspreu.this.AV22TotRec = aP7[0];
      this.aP7 = aP7;
      pbuspreu.this.AV96Minimos = aP8[0];
      this.aP8 = aP8;
      pbuspreu.this.AV97BarALbTar = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV65FlagRecCol = (byte)(0) ;
      GXv_int1[0] = AV65FlagRecCol ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "RECCOL", ""), GXv_int1) ;
      pbuspreu.this.AV65FlagRecCol = GXv_int1[0] ;
      AV19PreKgm = DecimalUtil.doubleToDec(0) ;
      AV20PreMts = DecimalUtil.doubleToDec(0) ;
      AV24PreDef = httpContext.getMessage( "S", "") ;
      /* Using cursor P03T74 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P03T74_A130BarCodPar[0] ;
         A132BarCodReo = P03T74_A132BarCodReo[0] ;
         A129BarCod = P03T74_A129BarCod[0] ;
         A396EmprCod = P03T74_A396EmprCod[0] ;
         A252CliCod = P03T74_A252CliCod[0] ;
         n252CliCod = P03T74_n252CliCod[0] ;
         A212BarSer = P03T74_A212BarSer[0] ;
         A135BarColNom = P03T74_A135BarColNom[0] ;
         A136BarColNum = P03T74_A136BarColNum[0] ;
         A218BarTipCol = P03T74_A218BarTipCol[0] ;
         A2010BarTipDis = P03T74_A2010BarTipDis[0] ;
         A361DisCod = P03T74_A361DisCod[0] ;
         A228BarUniMed = P03T74_A228BarUniMed[0] ;
         A118BarAcaQui = P03T74_A118BarAcaQui[0] ;
         A193BarOpeEsp = P03T74_A193BarOpeEsp[0] ;
         A166BarKgm = P03T74_A166BarKgm[0] ;
         A219BarTotAgr = P03T74_A219BarTotAgr[0] ;
         A184BarMtr = P03T74_A184BarMtr[0] ;
         A870BarTotMtr = P03T74_A870BarTotMtr[0] ;
         A219BarTotAgr = P03T74_A219BarTotAgr[0] ;
         A870BarTotMtr = P03T74_A870BarTotMtr[0] ;
         A166BarKgm = P03T74_A166BarKgm[0] ;
         A184BarMtr = P03T74_A184BarMtr[0] ;
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
         }
         if ( A870BarTotMtr.doubleValue() != 0 )
         {
            A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
         }
         else
         {
            A871RecTotMtr = A184BarMtr ;
         }
         AV35CliCod = A252CliCod ;
         AV31BarSer = A212BarSer ;
         AV32BarColNom = A135BarColNom ;
         AV33BarColNum = A136BarColNum ;
         AV34TipColCod = A218BarTipCol ;
         AV87BarTipDis = A2010BarTipDis ;
         AV74DisCod = A361DisCod ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char4[0] = A212BarSer ;
         GXv_char5[0] = A135BarColNom ;
         GXv_int6[0] = A136BarColNum ;
         GXv_int1[0] = A218BarTipCol ;
         GXv_int7[0] = AV99ForNumcol ;
         new app.pnformu(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_char5, GXv_int6, GXv_int1, GXv_int7) ;
         pbuspreu.this.A396EmprCod = GXv_char2[0] ;
         pbuspreu.this.A252CliCod = GXv_int3[0] ;
         pbuspreu.this.A212BarSer = GXv_char4[0] ;
         pbuspreu.this.A135BarColNom = GXv_char5[0] ;
         pbuspreu.this.A136BarColNum = GXv_int6[0] ;
         pbuspreu.this.A218BarTipCol = GXv_int1[0] ;
         pbuspreu.this.AV99ForNumcol = GXv_int7[0] ;
         AV98Aplico_mn = httpContext.getMessage( "N", "") ;
         if ( ( AV99ForNumcol >= 100000 ) && ( AV99ForNumcol <= 899999 ) )
         {
            AV98Aplico_mn = httpContext.getMessage( "S", "") ;
            if ( ( AV99ForNumcol == 180000 ) || ( AV99ForNumcol == 190000 ) || ( AV99ForNumcol == 104999 ) )
            {
               AV98Aplico_mn = httpContext.getMessage( "N", "") ;
            }
         }
         if ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 )
         {
            AV27LimUni = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A871RecTotMtr, 0))) ;
            AV44UniMed = httpContext.getMessage( "M", "") ;
         }
         else
         {
            AV27LimUni = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A812RecTotKgm, 0))) ;
            AV44UniMed = httpContext.getMessage( "K", "") ;
         }
         AV94Proforpm = DecimalUtil.doubleToDec(0) ;
         AV95Proforpk = DecimalUtil.doubleToDec(0) ;
         AV93P_forcod = A118BarAcaQui ;
         /* Using cursor P03T75 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4905BarFasAcab = P03T75_A4905BarFasAcab[0] ;
            A4287BarFasFor = P03T75_A4287BarFasFor[0] ;
            A764ProForCod = P03T75_A764ProForCod[0] ;
            A5371FasQuiLin = P03T75_A5371FasQuiLin[0] ;
            A194BarOrdLin = P03T75_A194BarOrdLin[0] ;
            A758ProCod = P03T75_A758ProCod[0] ;
            A4905BarFasAcab = P03T75_A4905BarFasAcab[0] ;
            A4287BarFasFor = P03T75_A4287BarFasFor[0] ;
            if ( ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A4905BarFasAcab, httpContext.getMessage( "S", "")) == 0 ) )
            {
               AV100BarAcaqui = A764ProForCod ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( GXutil.strcmp(AV100BarAcaqui, " ") != 0 ) && ( GXutil.strcmp(AV100BarAcaqui, AV93P_forcod) != 0 ) )
         {
            A118BarAcaQui = AV100BarAcaqui ;
            AV93P_forcod = AV100BarAcaqui ;
         }
         /* Execute user subroutine: 'PREQL' */
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
         AV97BarALbTar = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'CLARPD' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ( AV19PreKgm.doubleValue() == 0 ) && ( AV20PreMts.doubleValue() == 0 ) )
         {
            AV36Noprecio = httpContext.getMessage( "N", "") ;
         }
         else
         {
            AV36Noprecio = httpContext.getMessage( "S", "") ;
         }
         if ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "N", "")) == 0 )
         {
            AV21Operesp = (byte)(2) ;
         }
         if ( ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "N", "")) == 0 ) && ( A193BarOpeEsp == 4 ) )
         {
            AV21Operesp = (byte)(4) ;
         }
         if ( GXutil.strcmp(AV36Noprecio, httpContext.getMessage( "S", "")) == 0 )
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
         if ( ( AV20PreMts.doubleValue() > 0 ) && ( A184BarMtr.doubleValue() == 0 ) )
         {
            AV21Operesp = (byte)(9) ;
         }
         if ( ( AV19PreKgm.doubleValue() > 0 ) && ( A166BarKgm.doubleValue() == 0 ) && ( AV20PreMts.doubleValue() > 0 ) )
         {
            AV21Operesp = (byte)(8) ;
         }
         AV101PreAcsK = DecimalUtil.doubleToDec(0) ;
         if ( ( AV20PreMts.doubleValue() > 0 ) && ( AV95Proforpk.doubleValue() > 0 ) && ( AV19PreKgm.doubleValue() == 0 ) )
         {
            AV101PreAcsK = AV95Proforpk ;
            AV95Proforpk = DecimalUtil.doubleToDec(0) ;
         }
         AV19PreKgm = AV19PreKgm.add(AV95Proforpk) ;
         AV20PreMts = AV20PreMts.add(AV94Proforpm) ;
         AV102AlbDf1 = " " ;
         if ( ( AV20PreMts.doubleValue() > 0 ) && ( AV101PreAcsK.doubleValue() > 0 ) && ( AV19PreKgm.doubleValue() == 0 ) )
         {
            AV102AlbDf1 = httpContext.getMessage( "Pre Mt>0 y Pre AcK>0", "") ;
            AV19PreKgm = AV101PreAcsK ;
         }
         /* Using cursor P03T76 */
         pr_default.execute(2, new Object[] {A118BarAcaQui, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'PREQL' Routine */
      returnInSub = false ;
      /* Optimized group. */
      /* Using cursor P03T77 */
      pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV93P_forcod});
      c5448ProForPK = P03T77_A5448ProForPK[0] ;
      n5448ProForPK = P03T77_n5448ProForPK[0] ;
      c5447ProForPM = P03T77_A5447ProForPM[0] ;
      n5447ProForPM = P03T77_n5447ProForPM[0] ;
      pr_default.close(3);
      AV95Proforpk = AV95Proforpk.add(c5448ProForPK) ;
      AV94Proforpm = AV94Proforpm.add(c5447ProForPM) ;
      /* End optimized group. */
   }

   public void S121( )
   {
      /* 'CLARPD' Routine */
      returnInSub = false ;
      /* Using cursor P03T78 */
      pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A130BarCodPar = P03T78_A130BarCodPar[0] ;
         A132BarCodReo = P03T78_A132BarCodReo[0] ;
         A129BarCod = P03T78_A129BarCod[0] ;
         A396EmprCod = P03T78_A396EmprCod[0] ;
         A758ProCod = P03T78_A758ProCod[0] ;
         AV92ForProC = A758ProCod ;
         /* Execute user subroutine: 'PRECIOP' */
         S135 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S135( )
   {
      /* 'PRECIOP' Routine */
      returnInSub = false ;
      /* Using cursor P03T79 */
      pr_default.execute(5, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV32BarColNom, Integer.valueOf(AV33BarColNum), Byte.valueOf(AV34TipColCod), AV92ForProC});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A9766ForProC = P03T79_A9766ForProC[0] ;
         A831TipColCod = P03T79_A831TipColCod[0] ;
         A483ForColNum = P03T79_A483ForColNum[0] ;
         A482ForColNom = P03T79_A482ForColNom[0] ;
         A494ForSer = P03T79_A494ForSer[0] ;
         A252CliCod = P03T79_A252CliCod[0] ;
         n252CliCod = P03T79_n252CliCod[0] ;
         A396EmprCod = P03T79_A396EmprCod[0] ;
         A9768ForProPK = P03T79_A9768ForProPK[0] ;
         n9768ForProPK = P03T79_n9768ForProPK[0] ;
         A9769ForProPM = P03T79_A9769ForProPM[0] ;
         n9769ForProPM = P03T79_n9769ForProPM[0] ;
         AV19PreKgm = A9768ForProPK ;
         AV20PreMts = A9769ForProPM ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbuspreu.this.AV15EmprCod;
      this.aP1[0] = pbuspreu.this.AV16BarCod;
      this.aP2[0] = pbuspreu.this.AV17BarReo;
      this.aP3[0] = pbuspreu.this.AV18BarPar;
      this.aP4[0] = pbuspreu.this.AV19PreKgm;
      this.aP5[0] = pbuspreu.this.AV20PreMts;
      this.aP6[0] = pbuspreu.this.AV21Operesp;
      this.aP7[0] = pbuspreu.this.AV22TotRec;
      this.aP8[0] = pbuspreu.this.AV96Minimos;
      this.aP9[0] = pbuspreu.this.AV97BarALbTar;
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
      P03T74_A130BarCodPar = new String[] {""} ;
      P03T74_A132BarCodReo = new byte[1] ;
      P03T74_A129BarCod = new int[1] ;
      P03T74_A396EmprCod = new String[] {""} ;
      P03T74_A252CliCod = new int[1] ;
      P03T74_n252CliCod = new boolean[] {false} ;
      P03T74_A212BarSer = new String[] {""} ;
      P03T74_A135BarColNom = new String[] {""} ;
      P03T74_A136BarColNum = new int[1] ;
      P03T74_A218BarTipCol = new byte[1] ;
      P03T74_A2010BarTipDis = new String[] {""} ;
      P03T74_A361DisCod = new int[1] ;
      P03T74_A228BarUniMed = new String[] {""} ;
      P03T74_A118BarAcaQui = new String[] {""} ;
      P03T74_A193BarOpeEsp = new byte[1] ;
      P03T74_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03T74_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03T74_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03T74_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A228BarUniMed = "" ;
      A118BarAcaQui = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      AV31BarSer = "" ;
      AV32BarColNom = "" ;
      AV87BarTipDis = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_int7 = new int[1] ;
      AV98Aplico_mn = "" ;
      AV44UniMed = "" ;
      AV94Proforpm = DecimalUtil.ZERO ;
      AV95Proforpk = DecimalUtil.ZERO ;
      AV93P_forcod = "" ;
      P03T75_A396EmprCod = new String[] {""} ;
      P03T75_A129BarCod = new int[1] ;
      P03T75_A132BarCodReo = new byte[1] ;
      P03T75_A130BarCodPar = new String[] {""} ;
      P03T75_A4905BarFasAcab = new String[] {""} ;
      P03T75_A4287BarFasFor = new String[] {""} ;
      P03T75_A764ProForCod = new String[] {""} ;
      P03T75_A5371FasQuiLin = new short[1] ;
      P03T75_A194BarOrdLin = new short[1] ;
      P03T75_A758ProCod = new String[] {""} ;
      A4905BarFasAcab = "" ;
      A4287BarFasFor = "" ;
      A764ProForCod = "" ;
      A758ProCod = "" ;
      AV100BarAcaqui = "" ;
      AV36Noprecio = "" ;
      AV101PreAcsK = DecimalUtil.ZERO ;
      AV102AlbDf1 = "" ;
      c5448ProForPK = DecimalUtil.ZERO ;
      c5447ProForPM = DecimalUtil.ZERO ;
      P03T77_A5448ProForPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03T77_n5448ProForPK = new boolean[] {false} ;
      P03T77_A5447ProForPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03T77_n5447ProForPM = new boolean[] {false} ;
      P03T78_A130BarCodPar = new String[] {""} ;
      P03T78_A132BarCodReo = new byte[1] ;
      P03T78_A129BarCod = new int[1] ;
      P03T78_A396EmprCod = new String[] {""} ;
      P03T78_A758ProCod = new String[] {""} ;
      AV92ForProC = "" ;
      P03T79_A9766ForProC = new String[] {""} ;
      P03T79_A831TipColCod = new byte[1] ;
      P03T79_A483ForColNum = new int[1] ;
      P03T79_A482ForColNom = new String[] {""} ;
      P03T79_A494ForSer = new String[] {""} ;
      P03T79_A252CliCod = new int[1] ;
      P03T79_n252CliCod = new boolean[] {false} ;
      P03T79_A396EmprCod = new String[] {""} ;
      P03T79_A9768ForProPK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03T79_n9768ForProPK = new boolean[] {false} ;
      P03T79_A9769ForProPM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03T79_n9769ForProPM = new boolean[] {false} ;
      A9766ForProC = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A9768ForProPK = DecimalUtil.ZERO ;
      A9769ForProPM = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbuspreu__default(),
         new Object[] {
             new Object[] {
            P03T74_A130BarCodPar, P03T74_A132BarCodReo, P03T74_A129BarCod, P03T74_A396EmprCod, P03T74_A252CliCod, P03T74_n252CliCod, P03T74_A212BarSer, P03T74_A135BarColNom, P03T74_A136BarColNum, P03T74_A218BarTipCol,
            P03T74_A2010BarTipDis, P03T74_A361DisCod, P03T74_A228BarUniMed, P03T74_A118BarAcaQui, P03T74_A193BarOpeEsp, P03T74_A166BarKgm, P03T74_A219BarTotAgr, P03T74_A184BarMtr, P03T74_A870BarTotMtr
            }
            , new Object[] {
            P03T75_A396EmprCod, P03T75_A129BarCod, P03T75_A132BarCodReo, P03T75_A130BarCodPar, P03T75_A4905BarFasAcab, P03T75_A4287BarFasFor, P03T75_A764ProForCod, P03T75_A5371FasQuiLin, P03T75_A194BarOrdLin, P03T75_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P03T77_A5448ProForPK, P03T77_n5448ProForPK, P03T77_A5447ProForPM, P03T77_n5447ProForPM
            }
            , new Object[] {
            P03T78_A130BarCodPar, P03T78_A132BarCodReo, P03T78_A129BarCod, P03T78_A396EmprCod, P03T78_A758ProCod
            }
            , new Object[] {
            P03T79_A9766ForProC, P03T79_A831TipColCod, P03T79_A483ForColNum, P03T79_A482ForColNom, P03T79_A494ForSer, P03T79_A252CliCod, P03T79_A396EmprCod, P03T79_A9768ForProPK, P03T79_n9768ForProPK, P03T79_A9769ForProPM,
            P03T79_n9769ForProPM
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarReo ;
   private byte AV21Operesp ;
   private byte AV65FlagRecCol ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte AV34TipColCod ;
   private byte GXv_int1[] ;
   private byte A831TipColCod ;
   private short A5371FasQuiLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A361DisCod ;
   private int AV35CliCod ;
   private int AV33BarColNum ;
   private int AV74DisCod ;
   private int GXv_int3[] ;
   private int GXv_int6[] ;
   private int AV99ForNumcol ;
   private int GXv_int7[] ;
   private int AV27LimUni ;
   private int A483ForColNum ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal AV97BarALbTar ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal AV94Proforpm ;
   private java.math.BigDecimal AV95Proforpk ;
   private java.math.BigDecimal AV101PreAcsK ;
   private java.math.BigDecimal c5448ProForPK ;
   private java.math.BigDecimal c5447ProForPM ;
   private java.math.BigDecimal A9768ForProPK ;
   private java.math.BigDecimal A9769ForProPM ;
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String AV96Minimos ;
   private String AV24PreDef ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A2010BarTipDis ;
   private String A228BarUniMed ;
   private String A118BarAcaQui ;
   private String AV31BarSer ;
   private String AV32BarColNom ;
   private String AV87BarTipDis ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String AV98Aplico_mn ;
   private String AV44UniMed ;
   private String AV93P_forcod ;
   private String A4905BarFasAcab ;
   private String A4287BarFasFor ;
   private String A764ProForCod ;
   private String A758ProCod ;
   private String AV100BarAcaqui ;
   private String AV36Noprecio ;
   private String AV102AlbDf1 ;
   private String AV92ForProC ;
   private String A9766ForProC ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n5448ProForPK ;
   private boolean n5447ProForPM ;
   private boolean n9768ForProPK ;
   private boolean n9769ForProPM ;
   private java.math.BigDecimal[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P03T74_A130BarCodPar ;
   private byte[] P03T74_A132BarCodReo ;
   private int[] P03T74_A129BarCod ;
   private String[] P03T74_A396EmprCod ;
   private int[] P03T74_A252CliCod ;
   private boolean[] P03T74_n252CliCod ;
   private String[] P03T74_A212BarSer ;
   private String[] P03T74_A135BarColNom ;
   private int[] P03T74_A136BarColNum ;
   private byte[] P03T74_A218BarTipCol ;
   private String[] P03T74_A2010BarTipDis ;
   private int[] P03T74_A361DisCod ;
   private String[] P03T74_A228BarUniMed ;
   private String[] P03T74_A118BarAcaQui ;
   private byte[] P03T74_A193BarOpeEsp ;
   private java.math.BigDecimal[] P03T74_A166BarKgm ;
   private java.math.BigDecimal[] P03T74_A219BarTotAgr ;
   private java.math.BigDecimal[] P03T74_A184BarMtr ;
   private java.math.BigDecimal[] P03T74_A870BarTotMtr ;
   private String[] P03T75_A396EmprCod ;
   private int[] P03T75_A129BarCod ;
   private byte[] P03T75_A132BarCodReo ;
   private String[] P03T75_A130BarCodPar ;
   private String[] P03T75_A4905BarFasAcab ;
   private String[] P03T75_A4287BarFasFor ;
   private String[] P03T75_A764ProForCod ;
   private short[] P03T75_A5371FasQuiLin ;
   private short[] P03T75_A194BarOrdLin ;
   private String[] P03T75_A758ProCod ;
   private java.math.BigDecimal[] P03T77_A5448ProForPK ;
   private boolean[] P03T77_n5448ProForPK ;
   private java.math.BigDecimal[] P03T77_A5447ProForPM ;
   private boolean[] P03T77_n5447ProForPM ;
   private String[] P03T78_A130BarCodPar ;
   private byte[] P03T78_A132BarCodReo ;
   private int[] P03T78_A129BarCod ;
   private String[] P03T78_A396EmprCod ;
   private String[] P03T78_A758ProCod ;
   private String[] P03T79_A9766ForProC ;
   private byte[] P03T79_A831TipColCod ;
   private int[] P03T79_A483ForColNum ;
   private String[] P03T79_A482ForColNom ;
   private String[] P03T79_A494ForSer ;
   private int[] P03T79_A252CliCod ;
   private boolean[] P03T79_n252CliCod ;
   private String[] P03T79_A396EmprCod ;
   private java.math.BigDecimal[] P03T79_A9768ForProPK ;
   private boolean[] P03T79_n9768ForProPK ;
   private java.math.BigDecimal[] P03T79_A9769ForProPM ;
   private boolean[] P03T79_n9769ForProPM ;
}

final  class pbuspreu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03T74", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarTipDis, T1.DisCod, T1.BarUniMed, T1.BarAcaQui, T1.BarOpeEsp, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T2.BarTotAgr, 0) AS BarTotAgr, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T2.BarTotMtr, 0) AS BarTotMtr FROM ((TXPBARCAD T1 LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(KgmAgr) AS BarTotAgr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03T75", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarFasAcab, T2.BarFasFor, T1.ProForCod, T1.FasQuiLin, T1.BarOrdLin, T1.ProCod FROM (TXPFASQUI T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod = T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03T76", "UPDATE TXPBARCAD SET BarAcaQui=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P03T77", "SELECT SUM(ProForPK), SUM(ProForPM) FROM TXPPREQL WHERE EmprCod = ? and CliCod = ? and P_ForCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03T78", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03T79", "SELECT ForProC, TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForProPK, ForProPM FROM TXPCLARPD WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? and ForProC = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ForProC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
      }
   }

}

