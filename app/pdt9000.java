package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdt9000 extends GXProcedure
{
   public pdt9000( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdt9000.class ), "" );
   }

   public pdt9000( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 ,
                            byte[] aP5 )
   {
      pdt9000.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             short[] aP6 )
   {
      pdt9000.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdt9000.this.AV49Barcod = aP1[0];
      this.aP1 = aP1;
      pdt9000.this.AV50Barcodreo = aP2[0];
      this.aP2 = aP2;
      pdt9000.this.AV51Barcodpar = aP3[0];
      this.aP3 = aP3;
      pdt9000.this.AV52Procod = aP4[0];
      this.aP4 = aP4;
      pdt9000.this.AV60Alta_r = aP5[0];
      this.aP5 = aP5;
      pdt9000.this.AV64Pq_ok = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35ProFasLin = (short)(100) ;
      AV60Alta_r = (byte)(0) ;
      AV64Pq_ok = (short)(0) ;
      /* Using cursor P04FT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV52Procod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A758ProCod = P04FT2_A758ProCod[0] ;
         A457FasCod = P04FT2_A457FasCod[0] ;
         A7892Dtp_FasDsc = P04FT2_A7892Dtp_FasDsc[0] ;
         n7892Dtp_FasDsc = P04FT2_n7892Dtp_FasDsc[0] ;
         A7893Dtp_Tpp = P04FT2_A7893Dtp_Tpp[0] ;
         n7893Dtp_Tpp = P04FT2_n7893Dtp_Tpp[0] ;
         A7894Dtp_H2OReh = P04FT2_A7894Dtp_H2OReh[0] ;
         n7894Dtp_H2OReh = P04FT2_n7894Dtp_H2OReh[0] ;
         A7895Dtp_TpCost = P04FT2_A7895Dtp_TpCost[0] ;
         n7895Dtp_TpCost = P04FT2_n7895Dtp_TpCost[0] ;
         A7896Dtp_UnpLt = P04FT2_A7896Dtp_UnpLt[0] ;
         n7896Dtp_UnpLt = P04FT2_n7896Dtp_UnpLt[0] ;
         A7911Dtp_UOrd = P04FT2_A7911Dtp_UOrd[0] ;
         n7911Dtp_UOrd = P04FT2_n7911Dtp_UOrd[0] ;
         A774ProNumLin = P04FT2_A774ProNumLin[0] ;
         AV31FasCod = A457FasCod ;
         AV71Pronumlin = A774ProNumLin ;
         AV65Dtp_FasDsc = A7892Dtp_FasDsc ;
         AV66Dtp_Tpp = A7893Dtp_Tpp ;
         AV67Dtp_H2OReh = A7894Dtp_H2OReh ;
         AV68Dtp_TpCost = A7895Dtp_TpCost ;
         AV69Dtp_UnpLt = A7896Dtp_UnpLt ;
         AV70Dtp_UOrd = A7911Dtp_UOrd ;
         /* Execute user subroutine: 'FASPRO' */
         S141 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'BARFAS' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'DT000' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'DT001' */
         S151 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV35ProFasLin = (short)(AV35ProFasLin+100) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV35ProFasLin > 0 )
      {
         /* Execute user subroutine: 'BARPRO' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'BARPRO' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPBARPRO

      */
      A129BarCod = AV49Barcod ;
      A132BarCodReo = AV50Barcodreo ;
      A130BarCodPar = AV51Barcodpar ;
      A758ProCod = AV52Procod ;
      A761ProFasLin = (short)(AV35ProFasLin-100) ;
      n761ProFasLin = false ;
      /* Using cursor P04FT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Boolean.valueOf(n761ProFasLin), Short.valueOf(A761ProFasLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
      if ( (pr_default.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   public void S121( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPBARFAS

      */
      A129BarCod = AV49Barcod ;
      A132BarCodReo = AV50Barcodreo ;
      A130BarCodPar = AV51Barcodpar ;
      A758ProCod = AV52Procod ;
      A194BarOrdLin = AV35ProFasLin ;
      A457FasCod = AV31FasCod ;
      A603MaqCodBis = AV43maqCod ;
      A162BarFecTeo = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.doubleToDec(0) ;
      A150BarFacTin = AV42fasActtin ;
      A152BarFasCon = AV44Fascon ;
      A4287BarFasFor = AV45FasFormul ;
      A4637BarFasCara = AV46fasCara ;
      A4638BarUltNlot = 0 ;
      n4638BarUltNlot = false ;
      A4021BarFasBot = GXutil.space( (short)(1)) ;
      A4905BarFasAcab = AV40fasAcab ;
      A4022BarNumBot = 0 ;
      A5045BarFasAgr = "" ;
      n5045BarFasAgr = false ;
      A5046BarFasPrp = "" ;
      n5046BarFasPrp = false ;
      A5047BarFasFPl = GXutil.nullDate() ;
      n5047BarFasFPl = false ;
      A5048BarFasUsu = GXutil.space( (short)(8)) ;
      n5048BarFasUsu = false ;
      A5369BarFasGral = AV41FasGral ;
      n5369BarFasGral = false ;
      A5372FasQuiUl = (short)(0) ;
      n5372FasQuiUl = false ;
      A179BarLoc = "" ;
      A3836BarFasPri = (byte)(0) ;
      A4301BarFasCoP = AV38FasConPla ;
      A6012BarFasTip = AV39FasTip ;
      n6012BarFasTip = false ;
      A6555BarFasNPl = (byte)(0) ;
      A6173BarFasSec = AV47SecCodF ;
      n6173BarFasSec = false ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      n4443BarFasDTF = false ;
      AV37BarFasDTI = GXutil.serverNow( context, remoteHandle, pr_default) ;
      A4442BarFasDTI = AV37BarFasDTI ;
      n4442BarFasDTI = false ;
      A6391BarfasOP = (short)(0) ;
      n6391BarfasOP = false ;
      A160BarFecRea = GXutil.nullDate() ;
      A153BarFasEst = (byte)(1) ;
      A165BarHorIni = (short)(GXutil.lval( GXutil.concat( GXutil.substring( GXutil.time( ), 1, 2), GXutil.substring( GXutil.time( ), 4, 2), ""))) ;
      A3298BarFecRIni = GXutil.today( ) ;
      /* Using cursor P04FT4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, Byte.valueOf(A153BarFasEst), A603MaqCodBis, A150BarFacTin, A162BarFecTeo, A160BarFecRea, A216BarTieTeo, Short.valueOf(A165BarHorIni), A3298BarFecRIni, A179BarLoc, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, A4301BarFasCoP, A4637BarFasCara, Boolean.valueOf(n4638BarUltNlot), Integer.valueOf(A4638BarUltNlot), A4905BarFasAcab, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A457FasCod, Boolean.valueOf(n5045BarFasAgr), A5045BarFasAgr, Boolean.valueOf(n5046BarFasPrp), A5046BarFasPrp, Boolean.valueOf(n5047BarFasFPl), A5047BarFasFPl, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), Boolean.valueOf(n6012BarFasTip), A6012BarFasTip, Boolean.valueOf(n6173BarFasSec), A6173BarFasSec, Boolean.valueOf(n6391BarfasOP), Short.valueOf(A6391BarfasOP), Byte.valueOf(A6555BarFasNPl), Byte.valueOf(A3836BarFasPri)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
      /* End Insert */
      /* Using cursor P04FT5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV31FasCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A9723Cod_par = P04FT5_A9723Cod_par[0] ;
         A457FasCod = P04FT5_A457FasCod[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPBarPar

         */
         W396EmprCod = A396EmprCod ;
         A129BarCod = AV49Barcod ;
         A132BarCodReo = AV50Barcodreo ;
         A130BarCodPar = AV51Barcodpar ;
         A758ProCod = AV52Procod ;
         A194BarOrdLin = AV35ProFasLin ;
         A1664ParFasCod = A9723Cod_par ;
         A3295BarParVal = " " ;
         A3296BarParObs = " " ;
         A3693BarParTxt = " " ;
         n3693BarParTxt = false ;
         A9737BarValPar = GXutil.space( (short)(8)) ;
         /* Using cursor P04FT6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod), A3295BarParVal, A3296BarParObs, Boolean.valueOf(n3693BarParTxt), A3693BarParTxt, A9737BarValPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
         if ( (pr_default.getStatus(4) == 1) )
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
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S131( )
   {
      /* 'DT000' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPDT000

      */
      A7867Dt_Op = AV49Barcod ;
      A7868Dt_Opr = AV50Barcodreo ;
      A7869Dt_Opp = AV51Barcodpar ;
      A7870Dt_Orden = AV35ProFasLin ;
      A7871Dt_Fascod = AV31FasCod ;
      n7871Dt_Fascod = false ;
      A7872Dt_FasDsc = AV65Dtp_FasDsc ;
      n7872Dt_FasDsc = false ;
      A7873Dt_Tpp = AV66Dtp_Tpp ;
      n7873Dt_Tpp = false ;
      A7874Dt_H2OReh = AV67Dtp_H2OReh ;
      n7874Dt_H2OReh = false ;
      A7875Dt_TpCost = AV68Dtp_TpCost ;
      n7875Dt_TpCost = false ;
      A7876Dt_UnpLt = AV69Dtp_UnpLt ;
      n7876Dt_UnpLt = false ;
      A7890Dt_UOrd = AV70Dtp_UOrd ;
      n7890Dt_UOrd = false ;
      AV60Alta_r = (byte)(1) ;
      /* Using cursor P04FT7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Boolean.valueOf(n7871Dt_Fascod), A7871Dt_Fascod, Boolean.valueOf(n7872Dt_FasDsc), A7872Dt_FasDsc, Boolean.valueOf(n7873Dt_Tpp), A7873Dt_Tpp, Boolean.valueOf(n7874Dt_H2OReh), A7874Dt_H2OReh, Boolean.valueOf(n7875Dt_TpCost), Short.valueOf(A7875Dt_TpCost), Boolean.valueOf(n7876Dt_UnpLt), A7876Dt_UnpLt, Boolean.valueOf(n7890Dt_UOrd), Short.valueOf(A7890Dt_UOrd)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT000");
      if ( (pr_default.getStatus(5) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
   }

   public void S141( )
   {
      /* 'FASPRO' Routine */
      returnInSub = false ;
      /* Using cursor P04FT8 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV31FasCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A457FasCod = P04FT8_A457FasCod[0] ;
         A602MaqCod = P04FT8_A602MaqCod[0] ;
         n602MaqCod = P04FT8_n602MaqCod[0] ;
         A456FasActTin = P04FT8_A456FasActTin[0] ;
         n456FasActTin = P04FT8_n456FasActTin[0] ;
         A6011FasTip = P04FT8_A6011FasTip[0] ;
         n6011FasTip = P04FT8_n6011FasTip[0] ;
         A4903FasAcab = P04FT8_A4903FasAcab[0] ;
         n4903FasAcab = P04FT8_n4903FasAcab[0] ;
         A5368FasGral = P04FT8_A5368FasGral[0] ;
         n5368FasGral = P04FT8_n5368FasGral[0] ;
         A458FasCon = P04FT8_A458FasCon[0] ;
         n458FasCon = P04FT8_n458FasCon[0] ;
         A4286FasForMul = P04FT8_A4286FasForMul[0] ;
         n4286FasForMul = P04FT8_n4286FasForMul[0] ;
         A6162SecCodF = P04FT8_A6162SecCodF[0] ;
         n6162SecCodF = P04FT8_n6162SecCodF[0] ;
         A6879FasTpp = P04FT8_A6879FasTpp[0] ;
         n6879FasTpp = P04FT8_n6879FasTpp[0] ;
         A7600FasH2OReh = P04FT8_A7600FasH2OReh[0] ;
         n7600FasH2OReh = P04FT8_n7600FasH2OReh[0] ;
         A7391FasTpCost = P04FT8_A7391FasTpCost[0] ;
         n7391FasTpCost = P04FT8_n7391FasTpCost[0] ;
         A6881FasUnpLt = P04FT8_A6881FasUnpLt[0] ;
         n6881FasUnpLt = P04FT8_n6881FasUnpLt[0] ;
         A4649FasUltForL = P04FT8_A4649FasUltForL[0] ;
         n4649FasUltForL = P04FT8_n4649FasUltForL[0] ;
         AV43maqCod = A602MaqCod ;
         AV42fasActtin = A456FasActTin ;
         AV39FasTip = A6011FasTip ;
         AV40fasAcab = A4903FasAcab ;
         AV41FasGral = A5368FasGral ;
         AV44Fascon = A458FasCon ;
         AV45FasFormul = A4286FasForMul ;
         AV47SecCodF = A6162SecCodF ;
         AV56FasTpp = A6879FasTpp ;
         AV57FasH2Oreh = A7600FasH2OReh ;
         AV58FasTpCost = A7391FasTpCost ;
         AV59FasUnpLt = A6881FasUnpLt ;
         AV61FasUltForl = A4649FasUltForL ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S151( )
   {
      /* 'DT001' Routine */
      returnInSub = false ;
      /* Using cursor P04FT9 */
      pr_default.execute(7, new Object[] {A396EmprCod, AV52Procod, Short.valueOf(AV71Pronumlin)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A774ProNumLin = P04FT9_A774ProNumLin[0] ;
         A758ProCod = P04FT9_A758ProCod[0] ;
         A7897Dtp_Ordl = P04FT9_A7897Dtp_Ordl[0] ;
         A7898Dtp_CPQ = P04FT9_A7898Dtp_CPQ[0] ;
         n7898Dtp_CPQ = P04FT9_n7898Dtp_CPQ[0] ;
         A7900Dtp_ForFab = P04FT9_A7900Dtp_ForFab[0] ;
         n7900Dtp_ForFab = P04FT9_n7900Dtp_ForFab[0] ;
         A7901Dtp_Fortie = P04FT9_A7901Dtp_Fortie[0] ;
         n7901Dtp_Fortie = P04FT9_n7901Dtp_Fortie[0] ;
         A7902Dtp_ForTmx = P04FT9_A7902Dtp_ForTmx[0] ;
         n7902Dtp_ForTmx = P04FT9_n7902Dtp_ForTmx[0] ;
         A7903Dtp_ForRb = P04FT9_A7903Dtp_ForRb[0] ;
         n7903Dtp_ForRb = P04FT9_n7903Dtp_ForRb[0] ;
         A7904Dtp_ForPhx = P04FT9_A7904Dtp_ForPhx[0] ;
         n7904Dtp_ForPhx = P04FT9_n7904Dtp_ForPhx[0] ;
         A7905Dtp_ForPhn = P04FT9_A7905Dtp_ForPhn[0] ;
         n7905Dtp_ForPhn = P04FT9_n7905Dtp_ForPhn[0] ;
         A7906Dtp_ForUli = P04FT9_A7906Dtp_ForUli[0] ;
         n7906Dtp_ForUli = P04FT9_n7906Dtp_ForUli[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPDT001

         */
         W396EmprCod = A396EmprCod ;
         A7867Dt_Op = AV49Barcod ;
         A7868Dt_Opr = AV50Barcodreo ;
         A7869Dt_Opp = AV51Barcodpar ;
         A7870Dt_Orden = AV35ProFasLin ;
         A7891Dt_Ordl = A7897Dtp_Ordl ;
         A7877Dt_CPQ = A7898Dtp_CPQ ;
         n7877Dt_CPQ = false ;
         A7879Dt_ForFab = A7900Dtp_ForFab ;
         n7879Dt_ForFab = false ;
         A7880Dt_Fortie = A7901Dtp_Fortie ;
         n7880Dt_Fortie = false ;
         A7881Dt_ForTmx = A7902Dtp_ForTmx ;
         n7881Dt_ForTmx = false ;
         A7882Dt_ForRb = A7903Dtp_ForRb ;
         n7882Dt_ForRb = false ;
         A7883Dt_ForPhx = A7904Dtp_ForPhx ;
         n7883Dt_ForPhx = false ;
         A7884Dt_ForPhn = A7905Dtp_ForPhn ;
         n7884Dt_ForPhn = false ;
         A7885Dt_ForUli = A7906Dtp_ForUli ;
         n7885Dt_ForUli = false ;
         /* Using cursor P04FT10 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl), Boolean.valueOf(n7877Dt_CPQ), A7877Dt_CPQ, Boolean.valueOf(n7879Dt_ForFab), A7879Dt_ForFab, Boolean.valueOf(n7880Dt_Fortie), Short.valueOf(A7880Dt_Fortie), Boolean.valueOf(n7881Dt_ForTmx), Short.valueOf(A7881Dt_ForTmx), Boolean.valueOf(n7882Dt_ForRb), A7882Dt_ForRb, Boolean.valueOf(n7883Dt_ForPhx), A7883Dt_ForPhx, Boolean.valueOf(n7884Dt_ForPhn), A7884Dt_ForPhn, Boolean.valueOf(n7885Dt_ForUli), Short.valueOf(A7885Dt_ForUli)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT001");
         if ( (pr_default.getStatus(8) == 1) )
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
         /* End Insert */
         /* Using cursor P04FT11 */
         pr_default.execute(9, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
         while ( (pr_default.getStatus(9) != 101) )
         {
            A7907Dtp_ForLin = P04FT11_A7907Dtp_ForLin[0] ;
            A7908Dtp_Prdnum = P04FT11_A7908Dtp_Prdnum[0] ;
            n7908Dtp_Prdnum = P04FT11_n7908Dtp_Prdnum[0] ;
            A7910Dtp_Forcan = P04FT11_A7910Dtp_Forcan[0] ;
            n7910Dtp_Forcan = P04FT11_n7910Dtp_Forcan[0] ;
            A8475Dtp_clave1 = P04FT11_A8475Dtp_clave1[0] ;
            n8475Dtp_clave1 = P04FT11_n8475Dtp_clave1[0] ;
            A8476Dtp_clave2 = P04FT11_A8476Dtp_clave2[0] ;
            n8476Dtp_clave2 = P04FT11_n8476Dtp_clave2[0] ;
            A490ForPrdUMe = P04FT11_A490ForPrdUMe[0] ;
            n490ForPrdUMe = P04FT11_n490ForPrdUMe[0] ;
            W396EmprCod = A396EmprCod ;
            /*
               INSERT RECORD ON TABLE TXPDT0011

            */
            W396EmprCod = A396EmprCod ;
            W490ForPrdUMe = A490ForPrdUMe ;
            n490ForPrdUMe = false ;
            A7867Dt_Op = AV49Barcod ;
            A7868Dt_Opr = AV50Barcodreo ;
            A7869Dt_Opp = AV51Barcodpar ;
            A7870Dt_Orden = AV35ProFasLin ;
            A7891Dt_Ordl = A7897Dtp_Ordl ;
            A7886Dt_ForLin = A7907Dtp_ForLin ;
            A7887Dt_Prdnum = A7908Dtp_Prdnum ;
            n7887Dt_Prdnum = false ;
            n490ForPrdUMe = false ;
            A7889Dt_Forcan = A7910Dtp_Forcan ;
            n7889Dt_Forcan = false ;
            A8473Dt_clave1 = A8475Dtp_clave1 ;
            n8473Dt_clave1 = false ;
            A8474Dt_clave2 = A8476Dtp_clave2 ;
            n8474Dt_clave2 = false ;
            /* Using cursor P04FT12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl), Short.valueOf(A7886Dt_ForLin), Boolean.valueOf(n7887Dt_Prdnum), A7887Dt_Prdnum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Boolean.valueOf(n7889Dt_Forcan), A7889Dt_Forcan, Boolean.valueOf(n8473Dt_clave1), A8473Dt_clave1, Boolean.valueOf(n8474Dt_clave2), A8474Dt_clave2});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0011");
            if ( (pr_default.getStatus(10) == 1) )
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
            A490ForPrdUMe = W490ForPrdUMe ;
            n490ForPrdUMe = false ;
            /* End Insert */
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(9);
         }
         pr_default.close(9);
         AV64Pq_ok = (short)(AV64Pq_ok+1) ;
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdt9000.this.A396EmprCod;
      this.aP1[0] = pdt9000.this.AV49Barcod;
      this.aP2[0] = pdt9000.this.AV50Barcodreo;
      this.aP3[0] = pdt9000.this.AV51Barcodpar;
      this.aP4[0] = pdt9000.this.AV52Procod;
      this.aP5[0] = pdt9000.this.AV60Alta_r;
      this.aP6[0] = pdt9000.this.AV64Pq_ok;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdt9000");
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
      P04FT2_A396EmprCod = new String[] {""} ;
      P04FT2_A758ProCod = new String[] {""} ;
      P04FT2_A457FasCod = new String[] {""} ;
      P04FT2_A7892Dtp_FasDsc = new String[] {""} ;
      P04FT2_n7892Dtp_FasDsc = new boolean[] {false} ;
      P04FT2_A7893Dtp_Tpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FT2_n7893Dtp_Tpp = new boolean[] {false} ;
      P04FT2_A7894Dtp_H2OReh = new String[] {""} ;
      P04FT2_n7894Dtp_H2OReh = new boolean[] {false} ;
      P04FT2_A7895Dtp_TpCost = new short[1] ;
      P04FT2_n7895Dtp_TpCost = new boolean[] {false} ;
      P04FT2_A7896Dtp_UnpLt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FT2_n7896Dtp_UnpLt = new boolean[] {false} ;
      P04FT2_A7911Dtp_UOrd = new short[1] ;
      P04FT2_n7911Dtp_UOrd = new boolean[] {false} ;
      P04FT2_A774ProNumLin = new short[1] ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A7892Dtp_FasDsc = "" ;
      A7893Dtp_Tpp = DecimalUtil.ZERO ;
      A7894Dtp_H2OReh = "" ;
      A7896Dtp_UnpLt = DecimalUtil.ZERO ;
      AV31FasCod = "" ;
      AV65Dtp_FasDsc = "" ;
      AV66Dtp_Tpp = DecimalUtil.ZERO ;
      AV67Dtp_H2OReh = "" ;
      AV69Dtp_UnpLt = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      Gx_emsg = "" ;
      A603MaqCodBis = "" ;
      AV43maqCod = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A150BarFacTin = "" ;
      AV42fasActtin = "" ;
      A152BarFasCon = "" ;
      AV44Fascon = "" ;
      A4287BarFasFor = "" ;
      AV45FasFormul = "" ;
      A4637BarFasCara = "" ;
      AV46fasCara = "" ;
      A4021BarFasBot = "" ;
      A4905BarFasAcab = "" ;
      AV40fasAcab = "" ;
      A5045BarFasAgr = "" ;
      A5046BarFasPrp = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A5048BarFasUsu = "" ;
      A5369BarFasGral = "" ;
      AV41FasGral = "" ;
      A179BarLoc = "" ;
      A4301BarFasCoP = "" ;
      AV38FasConPla = "" ;
      A6012BarFasTip = "" ;
      AV39FasTip = "" ;
      A6173BarFasSec = "" ;
      AV47SecCodF = "" ;
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      AV37BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      P04FT5_A396EmprCod = new String[] {""} ;
      P04FT5_A9723Cod_par = new short[1] ;
      P04FT5_A457FasCod = new String[] {""} ;
      W396EmprCod = "" ;
      A3295BarParVal = "" ;
      A3296BarParObs = "" ;
      A3693BarParTxt = "" ;
      A9737BarValPar = "" ;
      A7869Dt_Opp = "" ;
      A7871Dt_Fascod = "" ;
      A7872Dt_FasDsc = "" ;
      A7873Dt_Tpp = DecimalUtil.ZERO ;
      A7874Dt_H2OReh = "" ;
      A7876Dt_UnpLt = DecimalUtil.ZERO ;
      P04FT8_A396EmprCod = new String[] {""} ;
      P04FT8_A457FasCod = new String[] {""} ;
      P04FT8_A602MaqCod = new String[] {""} ;
      P04FT8_n602MaqCod = new boolean[] {false} ;
      P04FT8_A456FasActTin = new String[] {""} ;
      P04FT8_n456FasActTin = new boolean[] {false} ;
      P04FT8_A6011FasTip = new String[] {""} ;
      P04FT8_n6011FasTip = new boolean[] {false} ;
      P04FT8_A4903FasAcab = new String[] {""} ;
      P04FT8_n4903FasAcab = new boolean[] {false} ;
      P04FT8_A5368FasGral = new String[] {""} ;
      P04FT8_n5368FasGral = new boolean[] {false} ;
      P04FT8_A458FasCon = new String[] {""} ;
      P04FT8_n458FasCon = new boolean[] {false} ;
      P04FT8_A4286FasForMul = new String[] {""} ;
      P04FT8_n4286FasForMul = new boolean[] {false} ;
      P04FT8_A6162SecCodF = new String[] {""} ;
      P04FT8_n6162SecCodF = new boolean[] {false} ;
      P04FT8_A6879FasTpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FT8_n6879FasTpp = new boolean[] {false} ;
      P04FT8_A7600FasH2OReh = new String[] {""} ;
      P04FT8_n7600FasH2OReh = new boolean[] {false} ;
      P04FT8_A7391FasTpCost = new short[1] ;
      P04FT8_n7391FasTpCost = new boolean[] {false} ;
      P04FT8_A6881FasUnpLt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FT8_n6881FasUnpLt = new boolean[] {false} ;
      P04FT8_A4649FasUltForL = new short[1] ;
      P04FT8_n4649FasUltForL = new boolean[] {false} ;
      A602MaqCod = "" ;
      A456FasActTin = "" ;
      A6011FasTip = "" ;
      A4903FasAcab = "" ;
      A5368FasGral = "" ;
      A458FasCon = "" ;
      A4286FasForMul = "" ;
      A6162SecCodF = "" ;
      A6879FasTpp = DecimalUtil.ZERO ;
      A7600FasH2OReh = "" ;
      A6881FasUnpLt = DecimalUtil.ZERO ;
      AV56FasTpp = DecimalUtil.ZERO ;
      AV57FasH2Oreh = "" ;
      AV59FasUnpLt = DecimalUtil.ZERO ;
      P04FT9_A396EmprCod = new String[] {""} ;
      P04FT9_A774ProNumLin = new short[1] ;
      P04FT9_A758ProCod = new String[] {""} ;
      P04FT9_A7897Dtp_Ordl = new short[1] ;
      P04FT9_A7898Dtp_CPQ = new String[] {""} ;
      P04FT9_n7898Dtp_CPQ = new boolean[] {false} ;
      P04FT9_A7900Dtp_ForFab = new String[] {""} ;
      P04FT9_n7900Dtp_ForFab = new boolean[] {false} ;
      P04FT9_A7901Dtp_Fortie = new short[1] ;
      P04FT9_n7901Dtp_Fortie = new boolean[] {false} ;
      P04FT9_A7902Dtp_ForTmx = new short[1] ;
      P04FT9_n7902Dtp_ForTmx = new boolean[] {false} ;
      P04FT9_A7903Dtp_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FT9_n7903Dtp_ForRb = new boolean[] {false} ;
      P04FT9_A7904Dtp_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FT9_n7904Dtp_ForPhx = new boolean[] {false} ;
      P04FT9_A7905Dtp_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FT9_n7905Dtp_ForPhn = new boolean[] {false} ;
      P04FT9_A7906Dtp_ForUli = new short[1] ;
      P04FT9_n7906Dtp_ForUli = new boolean[] {false} ;
      A7898Dtp_CPQ = "" ;
      A7900Dtp_ForFab = "" ;
      A7903Dtp_ForRb = DecimalUtil.ZERO ;
      A7904Dtp_ForPhx = DecimalUtil.ZERO ;
      A7905Dtp_ForPhn = DecimalUtil.ZERO ;
      A7877Dt_CPQ = "" ;
      A7879Dt_ForFab = "" ;
      A7882Dt_ForRb = DecimalUtil.ZERO ;
      A7883Dt_ForPhx = DecimalUtil.ZERO ;
      A7884Dt_ForPhn = DecimalUtil.ZERO ;
      P04FT11_A396EmprCod = new String[] {""} ;
      P04FT11_A758ProCod = new String[] {""} ;
      P04FT11_A774ProNumLin = new short[1] ;
      P04FT11_A7897Dtp_Ordl = new short[1] ;
      P04FT11_A7907Dtp_ForLin = new short[1] ;
      P04FT11_A7908Dtp_Prdnum = new String[] {""} ;
      P04FT11_n7908Dtp_Prdnum = new boolean[] {false} ;
      P04FT11_A7910Dtp_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04FT11_n7910Dtp_Forcan = new boolean[] {false} ;
      P04FT11_A8475Dtp_clave1 = new String[] {""} ;
      P04FT11_n8475Dtp_clave1 = new boolean[] {false} ;
      P04FT11_A8476Dtp_clave2 = new String[] {""} ;
      P04FT11_n8476Dtp_clave2 = new boolean[] {false} ;
      P04FT11_A490ForPrdUMe = new byte[1] ;
      P04FT11_n490ForPrdUMe = new boolean[] {false} ;
      A7908Dtp_Prdnum = "" ;
      A7910Dtp_Forcan = DecimalUtil.ZERO ;
      A8475Dtp_clave1 = "" ;
      A8476Dtp_clave2 = "" ;
      A7887Dt_Prdnum = "" ;
      A7889Dt_Forcan = DecimalUtil.ZERO ;
      A8473Dt_clave1 = "" ;
      A8474Dt_clave2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdt9000__default(),
         new Object[] {
             new Object[] {
            P04FT2_A396EmprCod, P04FT2_A758ProCod, P04FT2_A457FasCod, P04FT2_A7892Dtp_FasDsc, P04FT2_n7892Dtp_FasDsc, P04FT2_A7893Dtp_Tpp, P04FT2_n7893Dtp_Tpp, P04FT2_A7894Dtp_H2OReh, P04FT2_n7894Dtp_H2OReh, P04FT2_A7895Dtp_TpCost,
            P04FT2_n7895Dtp_TpCost, P04FT2_A7896Dtp_UnpLt, P04FT2_n7896Dtp_UnpLt, P04FT2_A7911Dtp_UOrd, P04FT2_n7911Dtp_UOrd, P04FT2_A774ProNumLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04FT5_A396EmprCod, P04FT5_A9723Cod_par, P04FT5_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P04FT8_A396EmprCod, P04FT8_A457FasCod, P04FT8_A602MaqCod, P04FT8_n602MaqCod, P04FT8_A456FasActTin, P04FT8_n456FasActTin, P04FT8_A6011FasTip, P04FT8_n6011FasTip, P04FT8_A4903FasAcab, P04FT8_n4903FasAcab,
            P04FT8_A5368FasGral, P04FT8_n5368FasGral, P04FT8_A458FasCon, P04FT8_n458FasCon, P04FT8_A4286FasForMul, P04FT8_n4286FasForMul, P04FT8_A6162SecCodF, P04FT8_n6162SecCodF, P04FT8_A6879FasTpp, P04FT8_n6879FasTpp,
            P04FT8_A7600FasH2OReh, P04FT8_n7600FasH2OReh, P04FT8_A7391FasTpCost, P04FT8_n7391FasTpCost, P04FT8_A6881FasUnpLt, P04FT8_n6881FasUnpLt, P04FT8_A4649FasUltForL, P04FT8_n4649FasUltForL
            }
            , new Object[] {
            P04FT9_A396EmprCod, P04FT9_A774ProNumLin, P04FT9_A758ProCod, P04FT9_A7897Dtp_Ordl, P04FT9_A7898Dtp_CPQ, P04FT9_n7898Dtp_CPQ, P04FT9_A7900Dtp_ForFab, P04FT9_n7900Dtp_ForFab, P04FT9_A7901Dtp_Fortie, P04FT9_n7901Dtp_Fortie,
            P04FT9_A7902Dtp_ForTmx, P04FT9_n7902Dtp_ForTmx, P04FT9_A7903Dtp_ForRb, P04FT9_n7903Dtp_ForRb, P04FT9_A7904Dtp_ForPhx, P04FT9_n7904Dtp_ForPhx, P04FT9_A7905Dtp_ForPhn, P04FT9_n7905Dtp_ForPhn, P04FT9_A7906Dtp_ForUli, P04FT9_n7906Dtp_ForUli
            }
            , new Object[] {
            }
            , new Object[] {
            P04FT11_A396EmprCod, P04FT11_A758ProCod, P04FT11_A774ProNumLin, P04FT11_A7897Dtp_Ordl, P04FT11_A7907Dtp_ForLin, P04FT11_A7908Dtp_Prdnum, P04FT11_n7908Dtp_Prdnum, P04FT11_A7910Dtp_Forcan, P04FT11_n7910Dtp_Forcan, P04FT11_A8475Dtp_clave1,
            P04FT11_n8475Dtp_clave1, P04FT11_A8476Dtp_clave2, P04FT11_n8476Dtp_clave2, P04FT11_A490ForPrdUMe, P04FT11_n490ForPrdUMe
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV50Barcodreo ;
   private byte AV60Alta_r ;
   private byte A132BarCodReo ;
   private byte A3836BarFasPri ;
   private byte A6555BarFasNPl ;
   private byte A153BarFasEst ;
   private byte A7868Dt_Opr ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private short AV64Pq_ok ;
   private short AV35ProFasLin ;
   private short A7895Dtp_TpCost ;
   private short A7911Dtp_UOrd ;
   private short A774ProNumLin ;
   private short AV71Pronumlin ;
   private short AV68Dtp_TpCost ;
   private short AV70Dtp_UOrd ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private short A194BarOrdLin ;
   private short A5372FasQuiUl ;
   private short A6391BarfasOP ;
   private short A165BarHorIni ;
   private short A9723Cod_par ;
   private short A1664ParFasCod ;
   private short A7870Dt_Orden ;
   private short A7875Dt_TpCost ;
   private short A7890Dt_UOrd ;
   private short A7391FasTpCost ;
   private short A4649FasUltForL ;
   private short AV58FasTpCost ;
   private short AV61FasUltForl ;
   private short A7897Dtp_Ordl ;
   private short A7901Dtp_Fortie ;
   private short A7902Dtp_ForTmx ;
   private short A7906Dtp_ForUli ;
   private short A7891Dt_Ordl ;
   private short A7880Dt_Fortie ;
   private short A7881Dt_ForTmx ;
   private short A7885Dt_ForUli ;
   private short A7907Dtp_ForLin ;
   private short A7886Dt_ForLin ;
   private int AV49Barcod ;
   private int GX_INS14 ;
   private int A129BarCod ;
   private int GX_INS15 ;
   private int A4638BarUltNlot ;
   private int A4022BarNumBot ;
   private int GX_INS475 ;
   private int GX_INS1099 ;
   private int A7867Dt_Op ;
   private int GX_INS1102 ;
   private int GX_INS1103 ;
   private java.math.BigDecimal A7893Dtp_Tpp ;
   private java.math.BigDecimal A7896Dtp_UnpLt ;
   private java.math.BigDecimal AV66Dtp_Tpp ;
   private java.math.BigDecimal AV69Dtp_UnpLt ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A7873Dt_Tpp ;
   private java.math.BigDecimal A7876Dt_UnpLt ;
   private java.math.BigDecimal A6879FasTpp ;
   private java.math.BigDecimal A6881FasUnpLt ;
   private java.math.BigDecimal AV56FasTpp ;
   private java.math.BigDecimal AV59FasUnpLt ;
   private java.math.BigDecimal A7903Dtp_ForRb ;
   private java.math.BigDecimal A7904Dtp_ForPhx ;
   private java.math.BigDecimal A7905Dtp_ForPhn ;
   private java.math.BigDecimal A7882Dt_ForRb ;
   private java.math.BigDecimal A7883Dt_ForPhx ;
   private java.math.BigDecimal A7884Dt_ForPhn ;
   private java.math.BigDecimal A7910Dtp_Forcan ;
   private java.math.BigDecimal A7889Dt_Forcan ;
   private String A396EmprCod ;
   private String AV51Barcodpar ;
   private String AV52Procod ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A7892Dtp_FasDsc ;
   private String A7894Dtp_H2OReh ;
   private String AV31FasCod ;
   private String AV65Dtp_FasDsc ;
   private String AV67Dtp_H2OReh ;
   private String A130BarCodPar ;
   private String Gx_emsg ;
   private String A603MaqCodBis ;
   private String AV43maqCod ;
   private String A150BarFacTin ;
   private String AV42fasActtin ;
   private String A152BarFasCon ;
   private String AV44Fascon ;
   private String A4287BarFasFor ;
   private String AV45FasFormul ;
   private String A4637BarFasCara ;
   private String AV46fasCara ;
   private String A4021BarFasBot ;
   private String A4905BarFasAcab ;
   private String AV40fasAcab ;
   private String A5045BarFasAgr ;
   private String A5046BarFasPrp ;
   private String A5048BarFasUsu ;
   private String A5369BarFasGral ;
   private String AV41FasGral ;
   private String A179BarLoc ;
   private String A4301BarFasCoP ;
   private String AV38FasConPla ;
   private String A6012BarFasTip ;
   private String AV39FasTip ;
   private String A6173BarFasSec ;
   private String AV47SecCodF ;
   private String W396EmprCod ;
   private String A3295BarParVal ;
   private String A3296BarParObs ;
   private String A9737BarValPar ;
   private String A7869Dt_Opp ;
   private String A7871Dt_Fascod ;
   private String A7872Dt_FasDsc ;
   private String A7874Dt_H2OReh ;
   private String A602MaqCod ;
   private String A456FasActTin ;
   private String A6011FasTip ;
   private String A4903FasAcab ;
   private String A5368FasGral ;
   private String A458FasCon ;
   private String A4286FasForMul ;
   private String A6162SecCodF ;
   private String A7600FasH2OReh ;
   private String AV57FasH2Oreh ;
   private String A7898Dtp_CPQ ;
   private String A7900Dtp_ForFab ;
   private String A7877Dt_CPQ ;
   private String A7879Dt_ForFab ;
   private String A7908Dtp_Prdnum ;
   private String A8475Dtp_clave1 ;
   private String A8476Dtp_clave2 ;
   private String A7887Dt_Prdnum ;
   private String A8473Dt_clave1 ;
   private String A8474Dt_clave2 ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV37BarFasDTI ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A5047BarFasFPl ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean n7892Dtp_FasDsc ;
   private boolean n7893Dtp_Tpp ;
   private boolean n7894Dtp_H2OReh ;
   private boolean n7895Dtp_TpCost ;
   private boolean n7896Dtp_UnpLt ;
   private boolean n7911Dtp_UOrd ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n4638BarUltNlot ;
   private boolean n5045BarFasAgr ;
   private boolean n5046BarFasPrp ;
   private boolean n5047BarFasFPl ;
   private boolean n5048BarFasUsu ;
   private boolean n5369BarFasGral ;
   private boolean n5372FasQuiUl ;
   private boolean n6012BarFasTip ;
   private boolean n6173BarFasSec ;
   private boolean n4443BarFasDTF ;
   private boolean n4442BarFasDTI ;
   private boolean n6391BarfasOP ;
   private boolean n3693BarParTxt ;
   private boolean n7871Dt_Fascod ;
   private boolean n7872Dt_FasDsc ;
   private boolean n7873Dt_Tpp ;
   private boolean n7874Dt_H2OReh ;
   private boolean n7875Dt_TpCost ;
   private boolean n7876Dt_UnpLt ;
   private boolean n7890Dt_UOrd ;
   private boolean n602MaqCod ;
   private boolean n456FasActTin ;
   private boolean n6011FasTip ;
   private boolean n4903FasAcab ;
   private boolean n5368FasGral ;
   private boolean n458FasCon ;
   private boolean n4286FasForMul ;
   private boolean n6162SecCodF ;
   private boolean n6879FasTpp ;
   private boolean n7600FasH2OReh ;
   private boolean n7391FasTpCost ;
   private boolean n6881FasUnpLt ;
   private boolean n4649FasUltForL ;
   private boolean n7898Dtp_CPQ ;
   private boolean n7900Dtp_ForFab ;
   private boolean n7901Dtp_Fortie ;
   private boolean n7902Dtp_ForTmx ;
   private boolean n7903Dtp_ForRb ;
   private boolean n7904Dtp_ForPhx ;
   private boolean n7905Dtp_ForPhn ;
   private boolean n7906Dtp_ForUli ;
   private boolean n7877Dt_CPQ ;
   private boolean n7879Dt_ForFab ;
   private boolean n7880Dt_Fortie ;
   private boolean n7881Dt_ForTmx ;
   private boolean n7882Dt_ForRb ;
   private boolean n7883Dt_ForPhx ;
   private boolean n7884Dt_ForPhn ;
   private boolean n7885Dt_ForUli ;
   private boolean n7908Dtp_Prdnum ;
   private boolean n7910Dtp_Forcan ;
   private boolean n8475Dtp_clave1 ;
   private boolean n8476Dtp_clave2 ;
   private boolean n490ForPrdUMe ;
   private boolean n7887Dt_Prdnum ;
   private boolean n7889Dt_Forcan ;
   private boolean n8473Dt_clave1 ;
   private boolean n8474Dt_clave2 ;
   private String A3693BarParTxt ;
   private short[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P04FT2_A396EmprCod ;
   private String[] P04FT2_A758ProCod ;
   private String[] P04FT2_A457FasCod ;
   private String[] P04FT2_A7892Dtp_FasDsc ;
   private boolean[] P04FT2_n7892Dtp_FasDsc ;
   private java.math.BigDecimal[] P04FT2_A7893Dtp_Tpp ;
   private boolean[] P04FT2_n7893Dtp_Tpp ;
   private String[] P04FT2_A7894Dtp_H2OReh ;
   private boolean[] P04FT2_n7894Dtp_H2OReh ;
   private short[] P04FT2_A7895Dtp_TpCost ;
   private boolean[] P04FT2_n7895Dtp_TpCost ;
   private java.math.BigDecimal[] P04FT2_A7896Dtp_UnpLt ;
   private boolean[] P04FT2_n7896Dtp_UnpLt ;
   private short[] P04FT2_A7911Dtp_UOrd ;
   private boolean[] P04FT2_n7911Dtp_UOrd ;
   private short[] P04FT2_A774ProNumLin ;
   private String[] P04FT5_A396EmprCod ;
   private short[] P04FT5_A9723Cod_par ;
   private String[] P04FT5_A457FasCod ;
   private String[] P04FT8_A396EmprCod ;
   private String[] P04FT8_A457FasCod ;
   private String[] P04FT8_A602MaqCod ;
   private boolean[] P04FT8_n602MaqCod ;
   private String[] P04FT8_A456FasActTin ;
   private boolean[] P04FT8_n456FasActTin ;
   private String[] P04FT8_A6011FasTip ;
   private boolean[] P04FT8_n6011FasTip ;
   private String[] P04FT8_A4903FasAcab ;
   private boolean[] P04FT8_n4903FasAcab ;
   private String[] P04FT8_A5368FasGral ;
   private boolean[] P04FT8_n5368FasGral ;
   private String[] P04FT8_A458FasCon ;
   private boolean[] P04FT8_n458FasCon ;
   private String[] P04FT8_A4286FasForMul ;
   private boolean[] P04FT8_n4286FasForMul ;
   private String[] P04FT8_A6162SecCodF ;
   private boolean[] P04FT8_n6162SecCodF ;
   private java.math.BigDecimal[] P04FT8_A6879FasTpp ;
   private boolean[] P04FT8_n6879FasTpp ;
   private String[] P04FT8_A7600FasH2OReh ;
   private boolean[] P04FT8_n7600FasH2OReh ;
   private short[] P04FT8_A7391FasTpCost ;
   private boolean[] P04FT8_n7391FasTpCost ;
   private java.math.BigDecimal[] P04FT8_A6881FasUnpLt ;
   private boolean[] P04FT8_n6881FasUnpLt ;
   private short[] P04FT8_A4649FasUltForL ;
   private boolean[] P04FT8_n4649FasUltForL ;
   private String[] P04FT9_A396EmprCod ;
   private short[] P04FT9_A774ProNumLin ;
   private String[] P04FT9_A758ProCod ;
   private short[] P04FT9_A7897Dtp_Ordl ;
   private String[] P04FT9_A7898Dtp_CPQ ;
   private boolean[] P04FT9_n7898Dtp_CPQ ;
   private String[] P04FT9_A7900Dtp_ForFab ;
   private boolean[] P04FT9_n7900Dtp_ForFab ;
   private short[] P04FT9_A7901Dtp_Fortie ;
   private boolean[] P04FT9_n7901Dtp_Fortie ;
   private short[] P04FT9_A7902Dtp_ForTmx ;
   private boolean[] P04FT9_n7902Dtp_ForTmx ;
   private java.math.BigDecimal[] P04FT9_A7903Dtp_ForRb ;
   private boolean[] P04FT9_n7903Dtp_ForRb ;
   private java.math.BigDecimal[] P04FT9_A7904Dtp_ForPhx ;
   private boolean[] P04FT9_n7904Dtp_ForPhx ;
   private java.math.BigDecimal[] P04FT9_A7905Dtp_ForPhn ;
   private boolean[] P04FT9_n7905Dtp_ForPhn ;
   private short[] P04FT9_A7906Dtp_ForUli ;
   private boolean[] P04FT9_n7906Dtp_ForUli ;
   private String[] P04FT11_A396EmprCod ;
   private String[] P04FT11_A758ProCod ;
   private short[] P04FT11_A774ProNumLin ;
   private short[] P04FT11_A7897Dtp_Ordl ;
   private short[] P04FT11_A7907Dtp_ForLin ;
   private String[] P04FT11_A7908Dtp_Prdnum ;
   private boolean[] P04FT11_n7908Dtp_Prdnum ;
   private java.math.BigDecimal[] P04FT11_A7910Dtp_Forcan ;
   private boolean[] P04FT11_n7910Dtp_Forcan ;
   private String[] P04FT11_A8475Dtp_clave1 ;
   private boolean[] P04FT11_n8475Dtp_clave1 ;
   private String[] P04FT11_A8476Dtp_clave2 ;
   private boolean[] P04FT11_n8476Dtp_clave2 ;
   private byte[] P04FT11_A490ForPrdUMe ;
   private boolean[] P04FT11_n490ForPrdUMe ;
}

final  class pdt9000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04FT2", "SELECT EmprCod, ProCod, FasCod, Dtp_FasDsc, Dtp_Tpp, Dtp_H2OReh, Dtp_TpCost, Dtp_UnpLt, Dtp_UOrd, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04FT3", "INSERT INTO TXPBARPRO(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
         ,new UpdateCursor("P04FT4", "INSERT INTO TXPBARFAS(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFasEst, MaqCodBis, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarHorIni, BarFecRIni, BarLoc, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarFasCara, BarUltNlot, BarFasAcab, BarFasDTI, BarFasDTF, FasCod, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarFasTip, BarFasSec, BarfasOP, BarFasNPl, BarFasPri, BarUni, BarHorFin, BarTieRea, BarFasKgm, BarFasMtr, BarNPzas, BarFasPzas, BarFasInc, BarFasKPr, BarFasPPr, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasCR, BarfasMn, BarHdMn, BarTieAut, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P04FT5", "SELECT EmprCod, Cod_par, FasCod FROM TXPPARFSS WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, Cod_par ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04FT6", "INSERT INTO TXPBarPar(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod, BarParVal, BarParObs, BarParTxt, BarValPar, Itm_ord5, BarParVl2, BarParVMn, BarParVMx, BarParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
         ,new UpdateCursor("P04FT7", "INSERT INTO TXPDT000(EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Fascod, Dt_FasDsc, Dt_Tpp, Dt_H2OReh, Dt_TpCost, Dt_UnpLt, Dt_UOrd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT000")
         ,new ForEachCursor("P04FT8", "SELECT EmprCod, FasCod, MaqCod, FasActTin, FasTip, FasAcab, FasGral, FasCon, FasForMul, SecCodF, FasTpp, FasH2OReh, FasTpCost, FasUnpLt, FasUltForL FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04FT9", "SELECT EmprCod, ProNumLin, ProCod, Dtp_Ordl, Dtp_CPQ, Dtp_ForFab, Dtp_Fortie, Dtp_ForTmx, Dtp_ForRb, Dtp_ForPhx, Dtp_ForPhn, Dtp_ForUli FROM TXPDT002 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04FT10", "INSERT INTO TXPDT001(EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_CPQ, Dt_ForFab, Dt_Fortie, Dt_ForTmx, Dt_ForRb, Dt_ForPhx, Dt_ForPhn, Dt_ForUli, Dt_Nh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT001")
         ,new ForEachCursor("P04FT11", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin, Dtp_Prdnum, Dtp_Forcan, Dtp_clave1, Dtp_clave2, ForPrdUMe FROM TXPDT0021 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? and Dtp_Ordl = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04FT12", "INSERT INTO TXPDT0011(EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_ForLin, Dt_Prdnum, ForPrdUMe, Dt_Forcan, Dt_clave1, Dt_clave2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0011")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 90);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setDate(15, (java.util.Date)parms[14]);
               stmt.setString(16, (String)parms[15], 10);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setInt(18, ((Number) parms[17]).intValue());
               stmt.setString(19, (String)parms[18], 1);
               stmt.setString(20, (String)parms[19], 1);
               stmt.setString(21, (String)parms[20], 1);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[22]).intValue());
               }
               stmt.setString(23, (String)parms[23], 1);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[27], false);
               }
               stmt.setString(26, (String)parms[28], 8);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DATE );
               }
               else
               {
                  stmt.setDate(29, (java.util.Date)parms[34]);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[36], 8);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[38], 1);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[40]).shortValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[44], 2);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(35, ((Number) parms[46]).shortValue());
               }
               stmt.setByte(36, ((Number) parms[47]).byteValue());
               stmt.setByte(37, ((Number) parms[48]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 60);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[10], 400);
               }
               stmt.setString(11, (String)parms[11], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 90);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[18]).shortValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[21]).shortValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 5);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 16);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[16], 30);
               }
               return;
      }
   }

}

