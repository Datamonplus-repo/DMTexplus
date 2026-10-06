package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewtxt extends GXProcedure
{
   public pnewtxt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewtxt.class ), "" );
   }

   public pnewtxt( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pnewtxt.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pnewtxt.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewtxt.this.AV16AlbProCod = aP1[0];
      this.aP1 = aP1;
      pnewtxt.this.AV17BarCod = aP2[0];
      this.aP2 = aP2;
      pnewtxt.this.AV18BarReo = aP3[0];
      this.aP3 = aP3;
      pnewtxt.this.AV19BarPar = aP4[0];
      this.aP4 = aP4;
      pnewtxt.this.AV39Opcion = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41FlagValoHR = (byte)(0) ;
      GXv_int1[0] = AV41FlagValoHR ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "VALOHR", ""), GXv_int1) ;
      pnewtxt.this.AV41FlagValoHR = GXv_int1[0] ;
      if ( ( GXutil.strcmp(AV39Opcion, httpContext.getMessage( "A", "")) == 0 ) && ( AV41FlagValoHR == 1 ) )
      {
         AV42EmprValo = "990" ;
         AV37AlbHdrUlin = (short)(0) ;
         AV43HayPreAlb = httpContext.getMessage( "N", "") ;
         AV44AlbValo = (long)(AV17BarCod*10) ;
         /* Using cursor P00G22 */
         pr_default.execute(0, new Object[] {AV42EmprValo, Long.valueOf(AV44AlbValo), Integer.valueOf(AV17BarCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P00G22_A130BarCodPar[0] ;
            A132BarCodReo = P00G22_A132BarCodReo[0] ;
            A129BarCod = P00G22_A129BarCod[0] ;
            A30AlbProCod = P00G22_A30AlbProCod[0] ;
            A396EmprCod = P00G22_A396EmprCod[0] ;
            A1261BarAlbKgmE = P00G22_A1261BarAlbKgmE[0] ;
            A2763AlbHdrUlin = P00G22_A2763AlbHdrUlin[0] ;
            W396EmprCod = A396EmprCod ;
            W30AlbProCod = A30AlbProCod ;
            AV43HayPreAlb = httpContext.getMessage( "S", "") ;
            /* Using cursor P00G23 */
            pr_default.execute(1, new Object[] {AV42EmprValo, Long.valueOf(AV44AlbValo), Integer.valueOf(AV17BarCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A30AlbProCod = P00G23_A30AlbProCod[0] ;
               A396EmprCod = P00G23_A396EmprCod[0] ;
               A5343AlbHdrPzs = P00G23_A5343AlbHdrPzs[0] ;
               n5343AlbHdrPzs = P00G23_n5343AlbHdrPzs[0] ;
               A3614AlbTxtCod = P00G23_A3614AlbTxtCod[0] ;
               A2772AlbHdrTip = P00G23_A2772AlbHdrTip[0] ;
               A2771ALbHdrImp = P00G23_A2771ALbHdrImp[0] ;
               A2770ALbHdrMts = P00G23_A2770ALbHdrMts[0] ;
               A2769AlbHdrPMt = P00G23_A2769AlbHdrPMt[0] ;
               A2768AlbHdrKgs = P00G23_A2768AlbHdrKgs[0] ;
               A2767AlbHdrPKg = P00G23_A2767AlbHdrPKg[0] ;
               A2766AlbHdrRD = P00G23_A2766AlbHdrRD[0] ;
               A2765AlbHdrTxt = P00G23_A2765AlbHdrTxt[0] ;
               A2764AlbHdrLin = P00G23_A2764AlbHdrLin[0] ;
               A130BarCodPar = P00G23_A130BarCodPar[0] ;
               A132BarCodReo = P00G23_A132BarCodReo[0] ;
               A129BarCod = P00G23_A129BarCod[0] ;
               W396EmprCod = A396EmprCod ;
               W30AlbProCod = A30AlbProCod ;
               /*
                  INSERT RECORD ON TABLE TXPALBTXT

               */
               W396EmprCod = A396EmprCod ;
               W30AlbProCod = A30AlbProCod ;
               W2764AlbHdrLin = A2764AlbHdrLin ;
               A396EmprCod = AV15EmprCod ;
               A30AlbProCod = AV16AlbProCod ;
               AV37AlbHdrUlin = A2764AlbHdrLin ;
               /* Using cursor P00G24 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin), A2765AlbHdrTxt, A2766AlbHdrRD, A2767AlbHdrPKg, A2768AlbHdrKgs, A2769AlbHdrPMt, A2770ALbHdrMts, A2771ALbHdrImp, A2772AlbHdrTip, A3614AlbTxtCod, Boolean.valueOf(n5343AlbHdrPzs), Short.valueOf(A5343AlbHdrPzs)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
               if ( (pr_default.getStatus(2) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A396EmprCod = W396EmprCod ;
               A30AlbProCod = W30AlbProCod ;
               A2764AlbHdrLin = W2764AlbHdrLin ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A30AlbProCod = W30AlbProCod ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            A2763AlbHdrUlin = AV37AlbHdrUlin ;
            /* Using cursor P00G25 */
            pr_default.execute(3, new Object[] {Short.valueOf(A2763AlbHdrUlin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            A396EmprCod = W396EmprCod ;
            A30AlbProCod = W30AlbProCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( GXutil.strcmp(AV43HayPreAlb, httpContext.getMessage( "S", "")) == 0 )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( GXutil.strcmp(AV39Opcion, httpContext.getMessage( "P", "")) == 0 )
      {
         AV38EmprNew = "990" ;
      }
      else
      {
         AV38EmprNew = AV15EmprCod ;
      }
      /* Using cursor P00G27 */
      pr_default.execute(4, new Object[] {AV15EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarReo), AV19BarPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A361DisCod = P00G27_A361DisCod[0] ;
         A132BarCodReo = P00G27_A132BarCodReo[0] ;
         A130BarCodPar = P00G27_A130BarCodPar[0] ;
         A129BarCod = P00G27_A129BarCod[0] ;
         A396EmprCod = P00G27_A396EmprCod[0] ;
         A212BarSer = P00G27_A212BarSer[0] ;
         A135BarColNom = P00G27_A135BarColNom[0] ;
         A136BarColNum = P00G27_A136BarColNum[0] ;
         A218BarTipCol = P00G27_A218BarTipCol[0] ;
         A2010BarTipDis = P00G27_A2010BarTipDis[0] ;
         A217BarTipArt = P00G27_A217BarTipArt[0] ;
         n217BarTipArt = P00G27_n217BarTipArt[0] ;
         A252CliCod = P00G27_A252CliCod[0] ;
         n252CliCod = P00G27_n252CliCod[0] ;
         A966PartCod = P00G27_A966PartCod[0] ;
         n966PartCod = P00G27_n966PartCod[0] ;
         A2746BarCodTex = P00G27_A2746BarCodTex[0] ;
         n2746BarCodTex = P00G27_n2746BarCodTex[0] ;
         A1157TipConCod = P00G27_A1157TipConCod[0] ;
         n1157TipConCod = P00G27_n1157TipConCod[0] ;
         A898BarPieNDes = P00G27_A898BarPieNDes[0] ;
         A166BarKgm = P00G27_A166BarKgm[0] ;
         A966PartCod = P00G27_A966PartCod[0] ;
         n966PartCod = P00G27_n966PartCod[0] ;
         A1157TipConCod = P00G27_A1157TipConCod[0] ;
         n1157TipConCod = P00G27_n1157TipConCod[0] ;
         A898BarPieNDes = P00G27_A898BarPieNDes[0] ;
         A166BarKgm = P00G27_A166BarKgm[0] ;
         AV22BarSer = A212BarSer ;
         AV23BarColNom = A135BarColNom ;
         AV24BarColNum = A136BarColNum ;
         AV25TipColCod = A218BarTipCol ;
         AV27Sec = A2010BarTipDis ;
         AV28TipArtCod = A217BarTipArt ;
         AV26CliCod = A252CliCod ;
         AV40PartCod = A966PartCod ;
         AV29BarCodTex = A2746BarCodTex ;
         AV30ForCon = A1157TipConCod ;
         AV31NumCon = A898BarPieNDes ;
         AV36KgsFac = A166BarKgm ;
         AV32LimCon = DecimalUtil.ZERO ;
         if ( ! (0==AV31NumCon) )
         {
            AV32LimCon = (AV36KgsFac.divide(DecimalUtil.doubleToDec(AV31NumCon), 18, java.math.RoundingMode.DOWN)) ;
         }
         /* Execute user subroutine: 'TARIFAS' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            pr_default.close(4);
            pr_default.close(4);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV20Recar)==0) )
         {
            /* Execute user subroutine: 'NEWTXT' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(4);
               pr_default.close(4);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      cleanup();
   }

   public void S111( )
   {
      /* 'TARIFAS' Routine */
      returnInSub = false ;
      /* Using cursor P00G28 */
      pr_default.execute(5, new Object[] {AV15EmprCod, Short.valueOf(AV30ForCon), Integer.valueOf(AV26CliCod)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A2730RecTipCo = P00G28_A2730RecTipCo[0] ;
         A252CliCod = P00G28_A252CliCod[0] ;
         n252CliCod = P00G28_n252CliCod[0] ;
         A396EmprCod = P00G28_A396EmprCod[0] ;
         A2733RecLim = P00G28_A2733RecLim[0] ;
         n2733RecLim = P00G28_n2733RecLim[0] ;
         A2734RecPor = P00G28_A2734RecPor[0] ;
         n2734RecPor = P00G28_n2734RecPor[0] ;
         A2732RecLin1 = P00G28_A2732RecLin1[0] ;
         if ( DecimalUtil.compareTo(A2733RecLim, AV32LimCon) > 0 )
         {
            AV20Recar = A2734RecPor ;
            AV34RecLim = A2733RecLim ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S121( )
   {
      /* 'NEWTXT' Routine */
      returnInSub = false ;
      /* Using cursor P00G29 */
      pr_default.execute(6, new Object[] {AV38EmprNew, Long.valueOf(AV16AlbProCod), Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarReo), AV19BarPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A2763AlbHdrUlin = P00G29_A2763AlbHdrUlin[0] ;
         A130BarCodPar = P00G29_A130BarCodPar[0] ;
         A132BarCodReo = P00G29_A132BarCodReo[0] ;
         A129BarCod = P00G29_A129BarCod[0] ;
         A30AlbProCod = P00G29_A30AlbProCod[0] ;
         A396EmprCod = P00G29_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W30AlbProCod = A30AlbProCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         AV35Var1 = httpContext.getMessage( "Rec x Lim PCono, ", "") + GXutil.str( AV34RecLim, 6, 2) + ">" + GXutil.str( AV32LimCon, 6, 2) ;
         /*
            INSERT RECORD ON TABLE TXPALBTXT

         */
         W396EmprCod = A396EmprCod ;
         W30AlbProCod = A30AlbProCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         A396EmprCod = AV38EmprNew ;
         A30AlbProCod = AV16AlbProCod ;
         A129BarCod = AV17BarCod ;
         A132BarCodReo = AV18BarReo ;
         A130BarCodPar = AV19BarPar ;
         A2764AlbHdrLin = (short)(A2763AlbHdrUlin+1) ;
         A2765AlbHdrTxt = AV35Var1 ;
         A2766AlbHdrRD = AV20Recar ;
         A2772AlbHdrTip = httpContext.getMessage( "R", "") ;
         /* Using cursor P00G210 */
         pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2764AlbHdrLin), A2765AlbHdrTxt, A2766AlbHdrRD, A2772AlbHdrTip});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
         if ( (pr_default.getStatus(7) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A30AlbProCod = W30AlbProCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* End Insert */
         A2763AlbHdrUlin = (short)(A2763AlbHdrUlin+1) ;
         /* Using cursor P00G211 */
         pr_default.execute(8, new Object[] {Short.valueOf(A2763AlbHdrUlin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         A396EmprCod = W396EmprCod ;
         A30AlbProCod = W30AlbProCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewtxt.this.AV15EmprCod;
      this.aP1[0] = pnewtxt.this.AV16AlbProCod;
      this.aP2[0] = pnewtxt.this.AV17BarCod;
      this.aP3[0] = pnewtxt.this.AV18BarReo;
      this.aP4[0] = pnewtxt.this.AV19BarPar;
      this.aP5[0] = pnewtxt.this.AV39Opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewtxt");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV42EmprValo = "" ;
      AV43HayPreAlb = "" ;
      scmdbuf = "" ;
      P00G22_A130BarCodPar = new String[] {""} ;
      P00G22_A132BarCodReo = new byte[1] ;
      P00G22_A129BarCod = new int[1] ;
      P00G22_A30AlbProCod = new long[1] ;
      P00G22_A396EmprCod = new String[] {""} ;
      P00G22_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G22_A2763AlbHdrUlin = new short[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      P00G23_A30AlbProCod = new long[1] ;
      P00G23_A396EmprCod = new String[] {""} ;
      P00G23_A5343AlbHdrPzs = new short[1] ;
      P00G23_n5343AlbHdrPzs = new boolean[] {false} ;
      P00G23_A3614AlbTxtCod = new String[] {""} ;
      P00G23_A2772AlbHdrTip = new String[] {""} ;
      P00G23_A2771ALbHdrImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G23_A2770ALbHdrMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G23_A2769AlbHdrPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G23_A2768AlbHdrKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G23_A2767AlbHdrPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G23_A2766AlbHdrRD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G23_A2765AlbHdrTxt = new String[] {""} ;
      P00G23_A2764AlbHdrLin = new short[1] ;
      P00G23_A130BarCodPar = new String[] {""} ;
      P00G23_A132BarCodReo = new byte[1] ;
      P00G23_A129BarCod = new int[1] ;
      A3614AlbTxtCod = "" ;
      A2772AlbHdrTip = "" ;
      A2771ALbHdrImp = DecimalUtil.ZERO ;
      A2770ALbHdrMts = DecimalUtil.ZERO ;
      A2769AlbHdrPMt = DecimalUtil.ZERO ;
      A2768AlbHdrKgs = DecimalUtil.ZERO ;
      A2767AlbHdrPKg = DecimalUtil.ZERO ;
      A2766AlbHdrRD = DecimalUtil.ZERO ;
      A2765AlbHdrTxt = "" ;
      Gx_emsg = "" ;
      AV38EmprNew = "" ;
      P00G27_A361DisCod = new int[1] ;
      P00G27_A132BarCodReo = new byte[1] ;
      P00G27_A130BarCodPar = new String[] {""} ;
      P00G27_A129BarCod = new int[1] ;
      P00G27_A396EmprCod = new String[] {""} ;
      P00G27_A212BarSer = new String[] {""} ;
      P00G27_A135BarColNom = new String[] {""} ;
      P00G27_A136BarColNum = new int[1] ;
      P00G27_A218BarTipCol = new byte[1] ;
      P00G27_A2010BarTipDis = new String[] {""} ;
      P00G27_A217BarTipArt = new short[1] ;
      P00G27_n217BarTipArt = new boolean[] {false} ;
      P00G27_A252CliCod = new int[1] ;
      P00G27_n252CliCod = new boolean[] {false} ;
      P00G27_A966PartCod = new String[] {""} ;
      P00G27_n966PartCod = new boolean[] {false} ;
      P00G27_A2746BarCodTex = new String[] {""} ;
      P00G27_n2746BarCodTex = new boolean[] {false} ;
      P00G27_A1157TipConCod = new short[1] ;
      P00G27_n1157TipConCod = new boolean[] {false} ;
      P00G27_A898BarPieNDes = new int[1] ;
      P00G27_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A2010BarTipDis = "" ;
      A966PartCod = "" ;
      A2746BarCodTex = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      AV22BarSer = "" ;
      AV23BarColNom = "" ;
      AV27Sec = "" ;
      AV40PartCod = "" ;
      AV29BarCodTex = "" ;
      AV36KgsFac = DecimalUtil.ZERO ;
      AV32LimCon = DecimalUtil.ZERO ;
      AV20Recar = DecimalUtil.ZERO ;
      P00G28_A2730RecTipCo = new short[1] ;
      P00G28_A252CliCod = new int[1] ;
      P00G28_n252CliCod = new boolean[] {false} ;
      P00G28_A396EmprCod = new String[] {""} ;
      P00G28_A2733RecLim = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G28_n2733RecLim = new boolean[] {false} ;
      P00G28_A2734RecPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00G28_n2734RecPor = new boolean[] {false} ;
      P00G28_A2732RecLin1 = new short[1] ;
      A2733RecLim = DecimalUtil.ZERO ;
      A2734RecPor = DecimalUtil.ZERO ;
      AV34RecLim = DecimalUtil.ZERO ;
      P00G29_A2763AlbHdrUlin = new short[1] ;
      P00G29_A130BarCodPar = new String[] {""} ;
      P00G29_A132BarCodReo = new byte[1] ;
      P00G29_A129BarCod = new int[1] ;
      P00G29_A30AlbProCod = new long[1] ;
      P00G29_A396EmprCod = new String[] {""} ;
      W130BarCodPar = "" ;
      AV35Var1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewtxt__default(),
         new Object[] {
             new Object[] {
            P00G22_A130BarCodPar, P00G22_A132BarCodReo, P00G22_A129BarCod, P00G22_A30AlbProCod, P00G22_A396EmprCod, P00G22_A1261BarAlbKgmE, P00G22_A2763AlbHdrUlin
            }
            , new Object[] {
            P00G23_A30AlbProCod, P00G23_A396EmprCod, P00G23_A5343AlbHdrPzs, P00G23_n5343AlbHdrPzs, P00G23_A3614AlbTxtCod, P00G23_A2772AlbHdrTip, P00G23_A2771ALbHdrImp, P00G23_A2770ALbHdrMts, P00G23_A2769AlbHdrPMt, P00G23_A2768AlbHdrKgs,
            P00G23_A2767AlbHdrPKg, P00G23_A2766AlbHdrRD, P00G23_A2765AlbHdrTxt, P00G23_A2764AlbHdrLin, P00G23_A130BarCodPar, P00G23_A132BarCodReo, P00G23_A129BarCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00G27_A361DisCod, P00G27_A132BarCodReo, P00G27_A130BarCodPar, P00G27_A129BarCod, P00G27_A396EmprCod, P00G27_A212BarSer, P00G27_A135BarColNom, P00G27_A136BarColNum, P00G27_A218BarTipCol, P00G27_A2010BarTipDis,
            P00G27_A217BarTipArt, P00G27_n217BarTipArt, P00G27_A252CliCod, P00G27_n252CliCod, P00G27_A966PartCod, P00G27_n966PartCod, P00G27_A2746BarCodTex, P00G27_n2746BarCodTex, P00G27_A1157TipConCod, P00G27_n1157TipConCod,
            P00G27_A898BarPieNDes, P00G27_A166BarKgm
            }
            , new Object[] {
            P00G28_A2730RecTipCo, P00G28_A252CliCod, P00G28_A396EmprCod, P00G28_A2733RecLim, P00G28_n2733RecLim, P00G28_A2734RecPor, P00G28_n2734RecPor, P00G28_A2732RecLin1
            }
            , new Object[] {
            P00G29_A2763AlbHdrUlin, P00G29_A130BarCodPar, P00G29_A132BarCodReo, P00G29_A129BarCod, P00G29_A30AlbProCod, P00G29_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18BarReo ;
   private byte AV41FlagValoHR ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV25TipColCod ;
   private byte W132BarCodReo ;
   private short AV37AlbHdrUlin ;
   private short A2763AlbHdrUlin ;
   private short A5343AlbHdrPzs ;
   private short A2764AlbHdrLin ;
   private short W2764AlbHdrLin ;
   private short Gx_err ;
   private short A217BarTipArt ;
   private short A1157TipConCod ;
   private short AV28TipArtCod ;
   private short AV30ForCon ;
   private short A2730RecTipCo ;
   private short A2732RecLin1 ;
   private int AV17BarCod ;
   private int A129BarCod ;
   private int GX_INS402 ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A898BarPieNDes ;
   private int AV24BarColNum ;
   private int AV26CliCod ;
   private int AV31NumCon ;
   private int W129BarCod ;
   private long AV16AlbProCod ;
   private long AV44AlbValo ;
   private long A30AlbProCod ;
   private long W30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A2771ALbHdrImp ;
   private java.math.BigDecimal A2770ALbHdrMts ;
   private java.math.BigDecimal A2769AlbHdrPMt ;
   private java.math.BigDecimal A2768AlbHdrKgs ;
   private java.math.BigDecimal A2767AlbHdrPKg ;
   private java.math.BigDecimal A2766AlbHdrRD ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV36KgsFac ;
   private java.math.BigDecimal AV32LimCon ;
   private java.math.BigDecimal AV20Recar ;
   private java.math.BigDecimal A2733RecLim ;
   private java.math.BigDecimal A2734RecPor ;
   private java.math.BigDecimal AV34RecLim ;
   private String AV15EmprCod ;
   private String AV19BarPar ;
   private String AV39Opcion ;
   private String AV42EmprValo ;
   private String AV43HayPreAlb ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String A3614AlbTxtCod ;
   private String A2772AlbHdrTip ;
   private String A2765AlbHdrTxt ;
   private String Gx_emsg ;
   private String AV38EmprNew ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A2010BarTipDis ;
   private String A966PartCod ;
   private String A2746BarCodTex ;
   private String AV22BarSer ;
   private String AV23BarColNom ;
   private String AV27Sec ;
   private String AV40PartCod ;
   private String AV29BarCodTex ;
   private String W130BarCodPar ;
   private String AV35Var1 ;
   private boolean n5343AlbHdrPzs ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n966PartCod ;
   private boolean n2746BarCodTex ;
   private boolean n1157TipConCod ;
   private boolean n2733RecLim ;
   private boolean n2734RecPor ;
   private String[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00G22_A130BarCodPar ;
   private byte[] P00G22_A132BarCodReo ;
   private int[] P00G22_A129BarCod ;
   private long[] P00G22_A30AlbProCod ;
   private String[] P00G22_A396EmprCod ;
   private java.math.BigDecimal[] P00G22_A1261BarAlbKgmE ;
   private short[] P00G22_A2763AlbHdrUlin ;
   private long[] P00G23_A30AlbProCod ;
   private String[] P00G23_A396EmprCod ;
   private short[] P00G23_A5343AlbHdrPzs ;
   private boolean[] P00G23_n5343AlbHdrPzs ;
   private String[] P00G23_A3614AlbTxtCod ;
   private String[] P00G23_A2772AlbHdrTip ;
   private java.math.BigDecimal[] P00G23_A2771ALbHdrImp ;
   private java.math.BigDecimal[] P00G23_A2770ALbHdrMts ;
   private java.math.BigDecimal[] P00G23_A2769AlbHdrPMt ;
   private java.math.BigDecimal[] P00G23_A2768AlbHdrKgs ;
   private java.math.BigDecimal[] P00G23_A2767AlbHdrPKg ;
   private java.math.BigDecimal[] P00G23_A2766AlbHdrRD ;
   private String[] P00G23_A2765AlbHdrTxt ;
   private short[] P00G23_A2764AlbHdrLin ;
   private String[] P00G23_A130BarCodPar ;
   private byte[] P00G23_A132BarCodReo ;
   private int[] P00G23_A129BarCod ;
   private int[] P00G27_A361DisCod ;
   private byte[] P00G27_A132BarCodReo ;
   private String[] P00G27_A130BarCodPar ;
   private int[] P00G27_A129BarCod ;
   private String[] P00G27_A396EmprCod ;
   private String[] P00G27_A212BarSer ;
   private String[] P00G27_A135BarColNom ;
   private int[] P00G27_A136BarColNum ;
   private byte[] P00G27_A218BarTipCol ;
   private String[] P00G27_A2010BarTipDis ;
   private short[] P00G27_A217BarTipArt ;
   private boolean[] P00G27_n217BarTipArt ;
   private int[] P00G27_A252CliCod ;
   private boolean[] P00G27_n252CliCod ;
   private String[] P00G27_A966PartCod ;
   private boolean[] P00G27_n966PartCod ;
   private String[] P00G27_A2746BarCodTex ;
   private boolean[] P00G27_n2746BarCodTex ;
   private short[] P00G27_A1157TipConCod ;
   private boolean[] P00G27_n1157TipConCod ;
   private int[] P00G27_A898BarPieNDes ;
   private java.math.BigDecimal[] P00G27_A166BarKgm ;
   private short[] P00G28_A2730RecTipCo ;
   private int[] P00G28_A252CliCod ;
   private boolean[] P00G28_n252CliCod ;
   private String[] P00G28_A396EmprCod ;
   private java.math.BigDecimal[] P00G28_A2733RecLim ;
   private boolean[] P00G28_n2733RecLim ;
   private java.math.BigDecimal[] P00G28_A2734RecPor ;
   private boolean[] P00G28_n2734RecPor ;
   private short[] P00G28_A2732RecLin1 ;
   private short[] P00G29_A2763AlbHdrUlin ;
   private String[] P00G29_A130BarCodPar ;
   private byte[] P00G29_A132BarCodReo ;
   private int[] P00G29_A129BarCod ;
   private long[] P00G29_A30AlbProCod ;
   private String[] P00G29_A396EmprCod ;
}

final  class pnewtxt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00G22", "SELECT BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod, BarAlbKgmE, AlbHdrUlin FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = 0 and BarCodPar = ' ' ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00G23", "SELECT AlbProCod, EmprCod, AlbHdrPzs, AlbTxtCod, AlbHdrTip, ALbHdrImp, ALbHdrMts, AlbHdrPMt, AlbHdrKgs, AlbHdrPKg, AlbHdrRD, AlbHdrTxt, AlbHdrLin, BarCodPar, BarCodReo, BarCod FROM TXPALBTXT WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = 0 and BarCodPar = ' ' ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00G24", "INSERT INTO TXPALBTXT(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin, AlbHdrTxt, AlbHdrRD, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, ALbHdrImp, AlbHdrTip, AlbTxtCod, AlbHdrPzs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTXT")
         ,new UpdateCursor("P00G25", "UPDATE TXPALBBAR SET AlbHdrUlin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P00G27", "SELECT T1.DisCod, T1.BarCodReo, T1.BarCodPar, T1.BarCod, T1.EmprCod, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarTipCol, T1.BarTipDis, T1.BarTipArt, T1.CliCod, T2.PartCod, T1.BarCodTex, T2.TipConCod, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes, COALESCE( T3.BarKgm, 0) AS BarKgm FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00G28", "SELECT RecTipCo, CliCod, EmprCod, RecLim, RecPor, RecLin1 FROM TXPLRECLT WHERE EmprCod = ? and RecTipCo = ? and CliCod = ? ORDER BY EmprCod, RecTipCo, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00G29", "SELECT AlbHdrUlin, BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00G210", "INSERT INTO TXPALBTXT(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin, AlbHdrTxt, AlbHdrRD, AlbHdrTip, AlbHdrPKg, AlbHdrKgs, AlbHdrPMt, ALbHdrMts, ALbHdrImp, AlbTxtCod, AlbHdrPzs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTXT")
         ,new UpdateCursor("P00G211", "UPDATE TXPALBBAR SET AlbHdrUlin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(17,2);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 30);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 6);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[16]).shortValue());
               }
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 30);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 1);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

