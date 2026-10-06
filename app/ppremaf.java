package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppremaf extends GXProcedure
{
   public ppremaf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppremaf.class ), "" );
   }

   public ppremaf( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public long executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           java.math.BigDecimal[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           byte[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           java.math.BigDecimal[] aP8 )
   {
      ppremaf.this.aP9 = new long[] {0};
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
                        java.math.BigDecimal[] aP8 ,
                        long[] aP9 )
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
                             java.math.BigDecimal[] aP8 ,
                             long[] aP9 )
   {
      ppremaf.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      ppremaf.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      ppremaf.this.AV17BarReo = aP2[0];
      this.aP2 = aP2;
      ppremaf.this.AV18BarPar = aP3[0];
      this.aP3 = aP3;
      ppremaf.this.AV19PreKgm = aP4[0];
      this.aP4 = aP4;
      ppremaf.this.AV20PreMts = aP5[0];
      this.aP5 = aP5;
      ppremaf.this.AV21Operesp = aP6[0];
      this.aP6 = aP6;
      ppremaf.this.AV22TotRec = aP7[0];
      this.aP7 = aP7;
      ppremaf.this.AV54PorRec = aP8[0];
      this.aP8 = aP8;
      ppremaf.this.AV97AlbProCod = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV92MtsBase ;
      new app.pbuscon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MTBASE", ""), GXv_int1) ;
      ppremaf.this.AV92MtsBase = GXv_int1[0] ;
      AV20PreMts = DecimalUtil.ZERO ;
      AV24PreDef = httpContext.getMessage( "S", "") ;
      /* Using cursor P02OR3 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02OR3_A130BarCodPar[0] ;
         A132BarCodReo = P02OR3_A132BarCodReo[0] ;
         A129BarCod = P02OR3_A129BarCod[0] ;
         A396EmprCod = P02OR3_A396EmprCod[0] ;
         A161BarFecSal = P02OR3_A161BarFecSal[0] ;
         A252CliCod = P02OR3_A252CliCod[0] ;
         n252CliCod = P02OR3_n252CliCod[0] ;
         A212BarSer = P02OR3_A212BarSer[0] ;
         A135BarColNom = P02OR3_A135BarColNom[0] ;
         A136BarColNum = P02OR3_A136BarColNum[0] ;
         A218BarTipCol = P02OR3_A218BarTipCol[0] ;
         A2010BarTipDis = P02OR3_A2010BarTipDis[0] ;
         A120BarAgrEst = P02OR3_A120BarAgrEst[0] ;
         A193BarOpeEsp = P02OR3_A193BarOpeEsp[0] ;
         A184BarMtr = P02OR3_A184BarMtr[0] ;
         n184BarMtr = P02OR3_n184BarMtr[0] ;
         A184BarMtr = P02OR3_A184BarMtr[0] ;
         n184BarMtr = P02OR3_n184BarMtr[0] ;
         A161BarFecSal = Gx_date ;
         AV35CliCod = A252CliCod ;
         AV31BarSer = A212BarSer ;
         AV32BarColNom = A135BarColNom ;
         AV33BarColNum = A136BarColNum ;
         AV34TipColCod = A218BarTipCol ;
         AV87BarTipDis = A2010BarTipDis ;
         AV27LimUni = (int)(DecimalUtil.decToDouble(A184BarMtr)) ;
         /* Execute user subroutine: 'SERIE_BASE' */
         S151 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV93Novedad = (byte)(0) ;
         if ( AV33BarColNum == 0 )
         {
            AV93Novedad = (byte)(1) ;
         }
         AV95Fases = (short)(0) ;
         /* Optimized group. */
         /* Using cursor P02OR4 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         cV95Fases = P02OR4_AV95Fases[0] ;
         pr_default.close(1);
         AV95Fases = (short)(AV95Fases+cV95Fases*1) ;
         /* End optimized group. */
         AV94TipNovedad = (byte)(1) ;
         if ( AV95Fases > 3 )
         {
            AV94TipNovedad = (byte)(2) ;
         }
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char2[0] = A396EmprCod ;
            GXv_int1[0] = A129BarCod ;
            GXv_int3[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_decimal5[0] = DecimalUtil.doubleToDec(AV27LimUni) ;
            new app.ppreagr(remoteHandle, context).execute( GXv_char2, GXv_int1, GXv_int3, GXv_char4, GXv_decimal5) ;
            ppremaf.this.A396EmprCod = GXv_char2[0] ;
            ppremaf.this.A129BarCod = GXv_int1[0] ;
            ppremaf.this.A132BarCodReo = GXv_int3[0] ;
            ppremaf.this.A130BarCodPar = GXv_char4[0] ;
            ppremaf.this.AV27LimUni = (int)(DecimalUtil.decToDouble(GXv_decimal5[0])) ;
         }
         GXv_char4[0] = AV15EmprCod ;
         GXv_int1[0] = AV16BarCod ;
         GXv_decimal5[0] = AV69TotUni ;
         new app.ptothdr(remoteHandle, context).execute( GXv_char4, GXv_int1, GXv_decimal5) ;
         ppremaf.this.AV15EmprCod = GXv_char4[0] ;
         ppremaf.this.AV16BarCod = GXv_int1[0] ;
         ppremaf.this.AV69TotUni = GXv_decimal5[0] ;
         if ( AV69TotUni.doubleValue() > AV27LimUni )
         {
            AV27LimUni = (int)(DecimalUtil.decToDouble(AV69TotUni)) ;
         }
         if ( AV35CliCod == 9 )
         {
            /* Execute user subroutine: 'TARIFA_9' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            /* Execute user subroutine: 'TARIFA_STD' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Execute user subroutine: 'TOTAL' */
         S161 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV36Noprecio = httpContext.getMessage( "S", "") ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20PreMts)==0) )
         {
            AV36Noprecio = httpContext.getMessage( "N", "") ;
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
         /* Using cursor P02OR5 */
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
      /* 'TARIFA_9' Routine */
      returnInSub = false ;
      if ( AV93Novedad == 1 )
      {
         /* Execute user subroutine: 'LOCART' */
         S121 ();
         if (returnInSub) return;
      }
      else
      {
         /* Execute user subroutine: 'LOCFOR' */
         S131 ();
         if (returnInSub) return;
      }
   }

   public void S141( )
   {
      /* 'TARIFA_STD' Routine */
      returnInSub = false ;
      if ( AV93Novedad == 1 )
      {
         /* Using cursor P02OR6 */
         pr_default.execute(3, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), Byte.valueOf(AV94TipNovedad)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A2935Limite3 = P02OR6_A2935Limite3[0] ;
            A2933RecTipCon = P02OR6_A2933RecTipCon[0] ;
            A252CliCod = P02OR6_A252CliCod[0] ;
            n252CliCod = P02OR6_n252CliCod[0] ;
            A396EmprCod = P02OR6_A396EmprCod[0] ;
            A2936Precio3 = P02OR6_A2936Precio3[0] ;
            n2936Precio3 = P02OR6_n2936Precio3[0] ;
            AV20PreMts = A2936Precio3 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      else
      {
         if ( AV27LimUni <= AV92MtsBase )
         {
            /* Using cursor P02OR7 */
            pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), Integer.valueOf(AV27LimUni)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A2935Limite3 = P02OR7_A2935Limite3[0] ;
               A2933RecTipCon = P02OR7_A2933RecTipCon[0] ;
               A252CliCod = P02OR7_A252CliCod[0] ;
               n252CliCod = P02OR7_n252CliCod[0] ;
               A396EmprCod = P02OR7_A396EmprCod[0] ;
               A2936Precio3 = P02OR7_A2936Precio3[0] ;
               n2936Precio3 = P02OR7_n2936Precio3[0] ;
               AV20PreMts = A2936Precio3 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(4);
            }
            pr_default.close(4);
         }
         else
         {
            /* Execute user subroutine: 'LOCFOR' */
            S131 ();
            if (returnInSub) return;
         }
      }
   }

   public void S131( )
   {
      /* 'LOCFOR' Routine */
      returnInSub = false ;
      /* Using cursor P02OR8 */
      pr_default.execute(5, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, AV32BarColNom});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A482ForColNom = P02OR8_A482ForColNom[0] ;
         A494ForSer = P02OR8_A494ForSer[0] ;
         A252CliCod = P02OR8_A252CliCod[0] ;
         n252CliCod = P02OR8_n252CliCod[0] ;
         A396EmprCod = P02OR8_A396EmprCod[0] ;
         A583IntCod = P02OR8_A583IntCod[0] ;
         A493ForPreMtr = P02OR8_A493ForPreMtr[0] ;
         n493ForPreMtr = P02OR8_n493ForPreMtr[0] ;
         A491ForPreDef = P02OR8_A491ForPreDef[0] ;
         n491ForPreDef = P02OR8_n491ForPreDef[0] ;
         A483ForColNum = P02OR8_A483ForColNum[0] ;
         A831TipColCod = P02OR8_A831TipColCod[0] ;
         AV25IntCod = A583IntCod ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A493ForPreMtr)==0) )
         {
            AV20PreMts = A493ForPreMtr ;
            if ( GXutil.strcmp(A491ForPreDef, httpContext.getMessage( "N", "")) == 0 )
            {
               AV24PreDef = httpContext.getMessage( "N", "") ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Using cursor P02OR9 */
      pr_default.execute(6, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer, Integer.valueOf(AV27LimUni)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A596LimUni = P02OR9_A596LimUni[0] ;
         n596LimUni = P02OR9_n596LimUni[0] ;
         A65ArtCod = P02OR9_A65ArtCod[0] ;
         A252CliCod = P02OR9_A252CliCod[0] ;
         n252CliCod = P02OR9_n252CliCod[0] ;
         A396EmprCod = P02OR9_A396EmprCod[0] ;
         A675PorRec = P02OR9_A675PorRec[0] ;
         n675PorRec = P02OR9_n675PorRec[0] ;
         A598LinRec = P02OR9_A598LinRec[0] ;
         AV54PorRec = A675PorRec ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(6);
      }
      pr_default.close(6);
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54PorRec)==0) )
      {
         AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
         AV20PreMts = AV20PreMts.add(AV22TotRec) ;
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20PreMts)==0) && ( AV35CliCod != 9 ) )
      {
         /* Execute user subroutine: 'LOCART' */
         S121 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'LOCART' Routine */
      returnInSub = false ;
      /* Using cursor P02OR10 */
      pr_default.execute(7, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A65ArtCod = P02OR10_A65ArtCod[0] ;
         A252CliCod = P02OR10_A252CliCod[0] ;
         n252CliCod = P02OR10_n252CliCod[0] ;
         A396EmprCod = P02OR10_A396EmprCod[0] ;
         A93ArtPreMtr = P02OR10_A93ArtPreMtr[0] ;
         n93ArtPreMtr = P02OR10_n93ArtPreMtr[0] ;
         A91ArtPreDef = P02OR10_A91ArtPreDef[0] ;
         n91ArtPreDef = P02OR10_n91ArtPreDef[0] ;
         AV20PreMts = A93ArtPreMtr ;
         if ( ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A91ArtPreDef, httpContext.getMessage( "N", "")) == 0 ) )
         {
            AV24PreDef = httpContext.getMessage( "N", "") ;
         }
         /* Using cursor P02OR11 */
         pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(AV34TipColCod), Byte.valueOf(AV25IntCod)});
         while ( (pr_default.getStatus(8) != 101) )
         {
            A583IntCod = P02OR11_A583IntCod[0] ;
            A831TipColCod = P02OR11_A831TipColCod[0] ;
            A587IntPreMtr = P02OR11_A587IntPreMtr[0] ;
            n587IntPreMtr = P02OR11_n587IntPreMtr[0] ;
            A585IntPreDef = P02OR11_A585IntPreDef[0] ;
            n585IntPreDef = P02OR11_n585IntPreDef[0] ;
            AV20PreMts = AV20PreMts.add(A587IntPreMtr) ;
            if ( ( GXutil.strcmp(AV24PreDef, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A585IntPreDef, httpContext.getMessage( "N", "")) == 0 ) )
            {
               AV24PreDef = httpContext.getMessage( "N", "") ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(8);
         if ( AV35CliCod != 9 )
         {
            /* Using cursor P02OR12 */
            pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A65ArtCod, Integer.valueOf(AV27LimUni)});
            while ( (pr_default.getStatus(9) != 101) )
            {
               A596LimUni = P02OR12_A596LimUni[0] ;
               n596LimUni = P02OR12_n596LimUni[0] ;
               A675PorRec = P02OR12_A675PorRec[0] ;
               n675PorRec = P02OR12_n675PorRec[0] ;
               A598LinRec = P02OR12_A598LinRec[0] ;
               AV54PorRec = A675PorRec ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(9);
            }
            pr_default.close(9);
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54PorRec)==0) )
            {
               AV22TotRec = GXutil.roundDecimal( AV20PreMts.multiply(AV54PorRec).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
               AV20PreMts = AV20PreMts.add(AV22TotRec) ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S151( )
   {
      /* 'SERIE_BASE' Routine */
      returnInSub = false ;
      /* Using cursor P02OR13 */
      pr_default.execute(10, new Object[] {AV15EmprCod, Integer.valueOf(AV35CliCod), AV31BarSer});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A65ArtCod = P02OR13_A65ArtCod[0] ;
         A252CliCod = P02OR13_A252CliCod[0] ;
         n252CliCod = P02OR13_n252CliCod[0] ;
         A396EmprCod = P02OR13_A396EmprCod[0] ;
         A5741ArtComer = P02OR13_A5741ArtComer[0] ;
         n5741ArtComer = P02OR13_n5741ArtComer[0] ;
         if ( ! (GXutil.strcmp("", A5741ArtComer)==0) && ( GXutil.strcmp(A65ArtCod, A5741ArtComer) != 0 ) )
         {
            AV31BarSer = A5741ArtComer ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S161( )
   {
      /* 'TOTAL' Routine */
      returnInSub = false ;
      AV96BarPreTMt = DecimalUtil.ZERO ;
      /* Using cursor P02OR14 */
      pr_default.execute(11, new Object[] {AV15EmprCod, Long.valueOf(AV97AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarReo), AV18BarPar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A130BarCodPar = P02OR14_A130BarCodPar[0] ;
         A132BarCodReo = P02OR14_A132BarCodReo[0] ;
         A129BarCod = P02OR14_A129BarCod[0] ;
         A30AlbProCod = P02OR14_A30AlbProCod[0] ;
         A396EmprCod = P02OR14_A396EmprCod[0] ;
         A6816BarPreFMt = P02OR14_A6816BarPreFMt[0] ;
         n6816BarPreFMt = P02OR14_n6816BarPreFMt[0] ;
         A6825BarPreTMt = P02OR14_A6825BarPreTMt[0] ;
         n6825BarPreTMt = P02OR14_n6825BarPreTMt[0] ;
         AV96BarPreTMt = AV20PreMts.add(A6816BarPreFMt) ;
         A6825BarPreTMt = AV96BarPreTMt ;
         n6825BarPreTMt = false ;
         /* Using cursor P02OR15 */
         pr_default.execute(12, new Object[] {Boolean.valueOf(n6825BarPreTMt), A6825BarPreTMt, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppremaf.this.AV15EmprCod;
      this.aP1[0] = ppremaf.this.AV16BarCod;
      this.aP2[0] = ppremaf.this.AV17BarReo;
      this.aP3[0] = ppremaf.this.AV18BarPar;
      this.aP4[0] = ppremaf.this.AV19PreKgm;
      this.aP5[0] = ppremaf.this.AV20PreMts;
      this.aP6[0] = ppremaf.this.AV21Operesp;
      this.aP7[0] = ppremaf.this.AV22TotRec;
      this.aP8[0] = ppremaf.this.AV54PorRec;
      this.aP9[0] = ppremaf.this.AV97AlbProCod;
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
      P02OR3_A130BarCodPar = new String[] {""} ;
      P02OR3_A132BarCodReo = new byte[1] ;
      P02OR3_A129BarCod = new int[1] ;
      P02OR3_A396EmprCod = new String[] {""} ;
      P02OR3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P02OR3_A252CliCod = new int[1] ;
      P02OR3_n252CliCod = new boolean[] {false} ;
      P02OR3_A212BarSer = new String[] {""} ;
      P02OR3_A135BarColNom = new String[] {""} ;
      P02OR3_A136BarColNum = new int[1] ;
      P02OR3_A218BarTipCol = new byte[1] ;
      P02OR3_A2010BarTipDis = new String[] {""} ;
      P02OR3_A120BarAgrEst = new String[] {""} ;
      P02OR3_A193BarOpeEsp = new byte[1] ;
      P02OR3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OR3_n184BarMtr = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A120BarAgrEst = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      AV31BarSer = "" ;
      AV32BarColNom = "" ;
      AV87BarTipDis = "" ;
      P02OR4_AV95Fases = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int1 = new int[1] ;
      AV69TotUni = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV36Noprecio = "" ;
      P02OR6_A2935Limite3 = new short[1] ;
      P02OR6_A2933RecTipCon = new short[1] ;
      P02OR6_A252CliCod = new int[1] ;
      P02OR6_n252CliCod = new boolean[] {false} ;
      P02OR6_A396EmprCod = new String[] {""} ;
      P02OR6_A2936Precio3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OR6_n2936Precio3 = new boolean[] {false} ;
      A2936Precio3 = DecimalUtil.ZERO ;
      P02OR7_A2935Limite3 = new short[1] ;
      P02OR7_A2933RecTipCon = new short[1] ;
      P02OR7_A252CliCod = new int[1] ;
      P02OR7_n252CliCod = new boolean[] {false} ;
      P02OR7_A396EmprCod = new String[] {""} ;
      P02OR7_A2936Precio3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OR7_n2936Precio3 = new boolean[] {false} ;
      P02OR8_A482ForColNom = new String[] {""} ;
      P02OR8_A494ForSer = new String[] {""} ;
      P02OR8_A252CliCod = new int[1] ;
      P02OR8_n252CliCod = new boolean[] {false} ;
      P02OR8_A396EmprCod = new String[] {""} ;
      P02OR8_A583IntCod = new byte[1] ;
      P02OR8_A493ForPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OR8_n493ForPreMtr = new boolean[] {false} ;
      P02OR8_A491ForPreDef = new String[] {""} ;
      P02OR8_n491ForPreDef = new boolean[] {false} ;
      P02OR8_A483ForColNum = new int[1] ;
      P02OR8_A831TipColCod = new byte[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A493ForPreMtr = DecimalUtil.ZERO ;
      A491ForPreDef = "" ;
      P02OR9_A596LimUni = new int[1] ;
      P02OR9_n596LimUni = new boolean[] {false} ;
      P02OR9_A65ArtCod = new String[] {""} ;
      P02OR9_A252CliCod = new int[1] ;
      P02OR9_n252CliCod = new boolean[] {false} ;
      P02OR9_A396EmprCod = new String[] {""} ;
      P02OR9_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OR9_n675PorRec = new boolean[] {false} ;
      P02OR9_A598LinRec = new byte[1] ;
      A65ArtCod = "" ;
      A675PorRec = DecimalUtil.ZERO ;
      P02OR10_A65ArtCod = new String[] {""} ;
      P02OR10_A252CliCod = new int[1] ;
      P02OR10_n252CliCod = new boolean[] {false} ;
      P02OR10_A396EmprCod = new String[] {""} ;
      P02OR10_A93ArtPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OR10_n93ArtPreMtr = new boolean[] {false} ;
      P02OR10_A91ArtPreDef = new String[] {""} ;
      P02OR10_n91ArtPreDef = new boolean[] {false} ;
      A93ArtPreMtr = DecimalUtil.ZERO ;
      A91ArtPreDef = "" ;
      P02OR11_A396EmprCod = new String[] {""} ;
      P02OR11_A252CliCod = new int[1] ;
      P02OR11_n252CliCod = new boolean[] {false} ;
      P02OR11_A65ArtCod = new String[] {""} ;
      P02OR11_A583IntCod = new byte[1] ;
      P02OR11_A831TipColCod = new byte[1] ;
      P02OR11_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OR11_n587IntPreMtr = new boolean[] {false} ;
      P02OR11_A585IntPreDef = new String[] {""} ;
      P02OR11_n585IntPreDef = new boolean[] {false} ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A585IntPreDef = "" ;
      P02OR12_A396EmprCod = new String[] {""} ;
      P02OR12_A252CliCod = new int[1] ;
      P02OR12_n252CliCod = new boolean[] {false} ;
      P02OR12_A65ArtCod = new String[] {""} ;
      P02OR12_A596LimUni = new int[1] ;
      P02OR12_n596LimUni = new boolean[] {false} ;
      P02OR12_A675PorRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OR12_n675PorRec = new boolean[] {false} ;
      P02OR12_A598LinRec = new byte[1] ;
      P02OR13_A65ArtCod = new String[] {""} ;
      P02OR13_A252CliCod = new int[1] ;
      P02OR13_n252CliCod = new boolean[] {false} ;
      P02OR13_A396EmprCod = new String[] {""} ;
      P02OR13_A5741ArtComer = new String[] {""} ;
      P02OR13_n5741ArtComer = new boolean[] {false} ;
      A5741ArtComer = "" ;
      AV96BarPreTMt = DecimalUtil.ZERO ;
      P02OR14_A130BarCodPar = new String[] {""} ;
      P02OR14_A132BarCodReo = new byte[1] ;
      P02OR14_A129BarCod = new int[1] ;
      P02OR14_A30AlbProCod = new long[1] ;
      P02OR14_A396EmprCod = new String[] {""} ;
      P02OR14_A6816BarPreFMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OR14_n6816BarPreFMt = new boolean[] {false} ;
      P02OR14_A6825BarPreTMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OR14_n6825BarPreTMt = new boolean[] {false} ;
      A6816BarPreFMt = DecimalUtil.ZERO ;
      A6825BarPreTMt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppremaf__default(),
         new Object[] {
             new Object[] {
            P02OR3_A130BarCodPar, P02OR3_A132BarCodReo, P02OR3_A129BarCod, P02OR3_A396EmprCod, P02OR3_A161BarFecSal, P02OR3_A252CliCod, P02OR3_n252CliCod, P02OR3_A212BarSer, P02OR3_A135BarColNom, P02OR3_A136BarColNum,
            P02OR3_A218BarTipCol, P02OR3_A2010BarTipDis, P02OR3_A120BarAgrEst, P02OR3_A193BarOpeEsp, P02OR3_A184BarMtr, P02OR3_n184BarMtr
            }
            , new Object[] {
            P02OR4_AV95Fases
            }
            , new Object[] {
            }
            , new Object[] {
            P02OR6_A2935Limite3, P02OR6_A2933RecTipCon, P02OR6_A252CliCod, P02OR6_A396EmprCod, P02OR6_A2936Precio3, P02OR6_n2936Precio3
            }
            , new Object[] {
            P02OR7_A2935Limite3, P02OR7_A2933RecTipCon, P02OR7_A252CliCod, P02OR7_A396EmprCod, P02OR7_A2936Precio3, P02OR7_n2936Precio3
            }
            , new Object[] {
            P02OR8_A482ForColNom, P02OR8_A494ForSer, P02OR8_A252CliCod, P02OR8_A396EmprCod, P02OR8_A583IntCod, P02OR8_A493ForPreMtr, P02OR8_n493ForPreMtr, P02OR8_A491ForPreDef, P02OR8_n491ForPreDef, P02OR8_A483ForColNum,
            P02OR8_A831TipColCod
            }
            , new Object[] {
            P02OR9_A596LimUni, P02OR9_n596LimUni, P02OR9_A65ArtCod, P02OR9_A252CliCod, P02OR9_A396EmprCod, P02OR9_A675PorRec, P02OR9_n675PorRec, P02OR9_A598LinRec
            }
            , new Object[] {
            P02OR10_A65ArtCod, P02OR10_A252CliCod, P02OR10_A396EmprCod, P02OR10_A93ArtPreMtr, P02OR10_n93ArtPreMtr, P02OR10_A91ArtPreDef, P02OR10_n91ArtPreDef
            }
            , new Object[] {
            P02OR11_A396EmprCod, P02OR11_A252CliCod, P02OR11_A65ArtCod, P02OR11_A583IntCod, P02OR11_A831TipColCod, P02OR11_A587IntPreMtr, P02OR11_n587IntPreMtr, P02OR11_A585IntPreDef, P02OR11_n585IntPreDef
            }
            , new Object[] {
            P02OR12_A396EmprCod, P02OR12_A252CliCod, P02OR12_A65ArtCod, P02OR12_A596LimUni, P02OR12_n596LimUni, P02OR12_A675PorRec, P02OR12_n675PorRec, P02OR12_A598LinRec
            }
            , new Object[] {
            P02OR13_A65ArtCod, P02OR13_A252CliCod, P02OR13_A396EmprCod, P02OR13_A5741ArtComer, P02OR13_n5741ArtComer
            }
            , new Object[] {
            P02OR14_A130BarCodPar, P02OR14_A132BarCodReo, P02OR14_A129BarCod, P02OR14_A30AlbProCod, P02OR14_A396EmprCod, P02OR14_A6816BarPreFMt, P02OR14_n6816BarPreFMt, P02OR14_A6825BarPreTMt, P02OR14_n6825BarPreTMt
            }
            , new Object[] {
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
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte A193BarOpeEsp ;
   private byte AV34TipColCod ;
   private byte AV93Novedad ;
   private byte AV94TipNovedad ;
   private byte GXv_int3[] ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte AV25IntCod ;
   private byte A598LinRec ;
   private short AV95Fases ;
   private short cV95Fases ;
   private short A2935Limite3 ;
   private short A2933RecTipCon ;
   private short Gx_err ;
   private int AV16BarCod ;
   private int AV92MtsBase ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV35CliCod ;
   private int AV33BarColNum ;
   private int AV27LimUni ;
   private int GXv_int1[] ;
   private int A483ForColNum ;
   private int A596LimUni ;
   private long AV97AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV19PreKgm ;
   private java.math.BigDecimal AV20PreMts ;
   private java.math.BigDecimal AV22TotRec ;
   private java.math.BigDecimal AV54PorRec ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV69TotUni ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal A2936Precio3 ;
   private java.math.BigDecimal A493ForPreMtr ;
   private java.math.BigDecimal A675PorRec ;
   private java.math.BigDecimal A93ArtPreMtr ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal AV96BarPreTMt ;
   private java.math.BigDecimal A6816BarPreFMt ;
   private java.math.BigDecimal A6825BarPreTMt ;
   private String AV15EmprCod ;
   private String AV18BarPar ;
   private String AV24PreDef ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A2010BarTipDis ;
   private String A120BarAgrEst ;
   private String AV31BarSer ;
   private String AV32BarColNom ;
   private String AV87BarTipDis ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String AV36Noprecio ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A491ForPreDef ;
   private String A65ArtCod ;
   private String A91ArtPreDef ;
   private String A585IntPreDef ;
   private String A5741ArtComer ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Gx_date ;
   private boolean n252CliCod ;
   private boolean n184BarMtr ;
   private boolean returnInSub ;
   private boolean n2936Precio3 ;
   private boolean n493ForPreMtr ;
   private boolean n491ForPreDef ;
   private boolean n596LimUni ;
   private boolean n675PorRec ;
   private boolean n93ArtPreMtr ;
   private boolean n91ArtPreDef ;
   private boolean n587IntPreMtr ;
   private boolean n585IntPreDef ;
   private boolean n5741ArtComer ;
   private boolean n6816BarPreFMt ;
   private boolean n6825BarPreTMt ;
   private long[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private byte[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P02OR3_A130BarCodPar ;
   private byte[] P02OR3_A132BarCodReo ;
   private int[] P02OR3_A129BarCod ;
   private String[] P02OR3_A396EmprCod ;
   private java.util.Date[] P02OR3_A161BarFecSal ;
   private int[] P02OR3_A252CliCod ;
   private boolean[] P02OR3_n252CliCod ;
   private String[] P02OR3_A212BarSer ;
   private String[] P02OR3_A135BarColNom ;
   private int[] P02OR3_A136BarColNum ;
   private byte[] P02OR3_A218BarTipCol ;
   private String[] P02OR3_A2010BarTipDis ;
   private String[] P02OR3_A120BarAgrEst ;
   private byte[] P02OR3_A193BarOpeEsp ;
   private java.math.BigDecimal[] P02OR3_A184BarMtr ;
   private boolean[] P02OR3_n184BarMtr ;
   private short[] P02OR4_AV95Fases ;
   private short[] P02OR6_A2935Limite3 ;
   private short[] P02OR6_A2933RecTipCon ;
   private int[] P02OR6_A252CliCod ;
   private boolean[] P02OR6_n252CliCod ;
   private String[] P02OR6_A396EmprCod ;
   private java.math.BigDecimal[] P02OR6_A2936Precio3 ;
   private boolean[] P02OR6_n2936Precio3 ;
   private short[] P02OR7_A2935Limite3 ;
   private short[] P02OR7_A2933RecTipCon ;
   private int[] P02OR7_A252CliCod ;
   private boolean[] P02OR7_n252CliCod ;
   private String[] P02OR7_A396EmprCod ;
   private java.math.BigDecimal[] P02OR7_A2936Precio3 ;
   private boolean[] P02OR7_n2936Precio3 ;
   private String[] P02OR8_A482ForColNom ;
   private String[] P02OR8_A494ForSer ;
   private int[] P02OR8_A252CliCod ;
   private boolean[] P02OR8_n252CliCod ;
   private String[] P02OR8_A396EmprCod ;
   private byte[] P02OR8_A583IntCod ;
   private java.math.BigDecimal[] P02OR8_A493ForPreMtr ;
   private boolean[] P02OR8_n493ForPreMtr ;
   private String[] P02OR8_A491ForPreDef ;
   private boolean[] P02OR8_n491ForPreDef ;
   private int[] P02OR8_A483ForColNum ;
   private byte[] P02OR8_A831TipColCod ;
   private int[] P02OR9_A596LimUni ;
   private boolean[] P02OR9_n596LimUni ;
   private String[] P02OR9_A65ArtCod ;
   private int[] P02OR9_A252CliCod ;
   private boolean[] P02OR9_n252CliCod ;
   private String[] P02OR9_A396EmprCod ;
   private java.math.BigDecimal[] P02OR9_A675PorRec ;
   private boolean[] P02OR9_n675PorRec ;
   private byte[] P02OR9_A598LinRec ;
   private String[] P02OR10_A65ArtCod ;
   private int[] P02OR10_A252CliCod ;
   private boolean[] P02OR10_n252CliCod ;
   private String[] P02OR10_A396EmprCod ;
   private java.math.BigDecimal[] P02OR10_A93ArtPreMtr ;
   private boolean[] P02OR10_n93ArtPreMtr ;
   private String[] P02OR10_A91ArtPreDef ;
   private boolean[] P02OR10_n91ArtPreDef ;
   private String[] P02OR11_A396EmprCod ;
   private int[] P02OR11_A252CliCod ;
   private boolean[] P02OR11_n252CliCod ;
   private String[] P02OR11_A65ArtCod ;
   private byte[] P02OR11_A583IntCod ;
   private byte[] P02OR11_A831TipColCod ;
   private java.math.BigDecimal[] P02OR11_A587IntPreMtr ;
   private boolean[] P02OR11_n587IntPreMtr ;
   private String[] P02OR11_A585IntPreDef ;
   private boolean[] P02OR11_n585IntPreDef ;
   private String[] P02OR12_A396EmprCod ;
   private int[] P02OR12_A252CliCod ;
   private boolean[] P02OR12_n252CliCod ;
   private String[] P02OR12_A65ArtCod ;
   private int[] P02OR12_A596LimUni ;
   private boolean[] P02OR12_n596LimUni ;
   private java.math.BigDecimal[] P02OR12_A675PorRec ;
   private boolean[] P02OR12_n675PorRec ;
   private byte[] P02OR12_A598LinRec ;
   private String[] P02OR13_A65ArtCod ;
   private int[] P02OR13_A252CliCod ;
   private boolean[] P02OR13_n252CliCod ;
   private String[] P02OR13_A396EmprCod ;
   private String[] P02OR13_A5741ArtComer ;
   private boolean[] P02OR13_n5741ArtComer ;
   private String[] P02OR14_A130BarCodPar ;
   private byte[] P02OR14_A132BarCodReo ;
   private int[] P02OR14_A129BarCod ;
   private long[] P02OR14_A30AlbProCod ;
   private String[] P02OR14_A396EmprCod ;
   private java.math.BigDecimal[] P02OR14_A6816BarPreFMt ;
   private boolean[] P02OR14_n6816BarPreFMt ;
   private java.math.BigDecimal[] P02OR14_A6825BarPreTMt ;
   private boolean[] P02OR14_n6825BarPreTMt ;
}

final  class ppremaf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02OR3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarFecSal, T1.CliCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarTipDis, T1.BarAgrEst, T1.BarOpeEsp, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02OR4", "SELECT COUNT(*) FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02OR5", "UPDATE TXPBARCAD SET BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P02OR6", "SELECT * FROM (SELECT Limite3, RecTipCon, CliCod, EmprCod, Precio3 FROM TXPLRECON WHERE EmprCod = ? and CliCod = ? and RecTipCon = ? and Limite3 = 9999 ORDER BY EmprCod, CliCod, RecTipCon, Limite3) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02OR7", "SELECT * FROM (SELECT Limite3, RecTipCon, CliCod, EmprCod, Precio3 FROM TXPLRECON WHERE EmprCod = ? and CliCod = ? and RecTipCon = 0 and Limite3 >= ? ORDER BY EmprCod, CliCod, RecTipCon, Limite3) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02OR8", "SELECT ForColNom, ForSer, CliCod, EmprCod, IntCod, ForPreMtr, ForPreDef, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02OR9", "SELECT * FROM (SELECT LimUni, ArtCod, CliCod, EmprCod, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02OR10", "SELECT ArtCod, CliCod, EmprCod, ArtPreMtr, ArtPreDef FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02OR11", "SELECT EmprCod, CliCod, ArtCod, IntCod, TipColCod, IntPreMtr, IntPreDef FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02OR12", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, LimUni, PorRec, LinRec FROM TXPRECARG WHERE (EmprCod = ? and CliCod = ? and ArtCod = ?) AND (? < LimUni) ORDER BY EmprCod, CliCod, ArtCod, LinRec) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02OR13", "SELECT ArtCod, CliCod, EmprCod, ArtComer FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02OR14", "SELECT BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod, BarPreFMt, BarPreTMt FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02OR15", "UPDATE TXPALBBAR SET BarPreTMt=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 8 :
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
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 9 :
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
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setLong(3, ((Number) parms[3]).longValue());
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
      }
   }

}

