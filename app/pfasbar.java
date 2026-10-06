package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfasbar extends GXProcedure
{
   public pfasbar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfasbar.class ), "" );
   }

   public pfasbar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pfasbar.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pfasbar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfasbar.this.AV15DisCod = aP1[0];
      this.aP1 = aP1;
      pfasbar.this.AV16CodBar = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV56Nocommit ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCOMM", ""), GXv_int2) ;
      pfasbar.this.GXt_int1 = GXv_int2[0] ;
      AV56Nocommit = GXt_int1 ;
      AV29FlagMab = (byte)(0) ;
      GXv_int2[0] = AV29FlagMab ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEONUL", ""), GXv_int2) ;
      pfasbar.this.AV29FlagMab = GXv_int2[0] ;
      AV31Ecapi = (byte)(0) ;
      GXv_int2[0] = AV31Ecapi ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ECAPI", ""), GXv_int2) ;
      pfasbar.this.AV31Ecapi = GXv_int2[0] ;
      GXv_int2[0] = AV36JBP ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "JBURGO", ""), GXv_int2) ;
      pfasbar.this.AV36JBP = GXv_int2[0] ;
      AV38Hss = (byte)(0) ;
      GXv_int2[0] = AV38Hss ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HSS", ""), GXv_int2) ;
      pfasbar.this.AV38Hss = GXv_int2[0] ;
      GXv_int2[0] = AV39Flag_not ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FASNOT", ""), GXv_int2) ;
      pfasbar.this.AV39Flag_not = GXv_int2[0] ;
      GXv_int2[0] = AV44FlagConFa ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MCONFA", ""), GXv_int2) ;
      pfasbar.this.AV44FlagConFa = GXv_int2[0] ;
      GXv_int2[0] = AV52Pizarro ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIZARR", ""), GXv_int2) ;
      pfasbar.this.AV52Pizarro = GXv_int2[0] ;
      AV43FechasFase = (byte)(0) ;
      GXv_int2[0] = AV43FechasFase ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DATFAS", ""), GXv_int2) ;
      pfasbar.this.AV43FechasFase = GXv_int2[0] ;
      GXt_char3 = AV66Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      pfasbar.this.GXt_char3 = GXv_char4[0] ;
      AV66Station = GXt_char3 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = AV67EmprNom ;
      GXv_char6[0] = AV68UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV66Station, GXv_char4, GXv_char5, GXv_char6) ;
      pfasbar.this.A396EmprCod = GXv_char4[0] ;
      pfasbar.this.AV67EmprNom = GXv_char5[0] ;
      pfasbar.this.AV68UsurCod = GXv_char6[0] ;
      GXt_int1 = AV70Etm ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int2) ;
      pfasbar.this.GXt_int1 = GXv_int2[0] ;
      AV70Etm = GXt_int1 ;
      GXt_int1 = AV73Acabats2013 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINTTO", ""), GXv_int2) ;
      pfasbar.this.GXt_int1 = GXv_int2[0] ;
      AV73Acabats2013 = GXt_int1 ;
      GXt_int1 = AV77ActDisfaslin ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERATEX", ""), GXv_int2) ;
      pfasbar.this.GXt_int1 = GXv_int2[0] ;
      AV77ActDisfaslin = GXt_int1 ;
      GXt_int1 = AV78Planing ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLANNC", ""), GXv_int2) ;
      pfasbar.this.GXt_int1 = GXv_int2[0] ;
      AV78Planing = GXt_int1 ;
      GXt_int1 = (byte)(AV84Fabricato) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FABRIC", ""), GXv_int2) ;
      pfasbar.this.GXt_int1 = GXv_int2[0] ;
      AV84Fabricato = GXt_int1 ;
      GXt_int1 = (byte)(AV85Eratex) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ERATEX", ""), GXv_int2) ;
      pfasbar.this.GXt_int1 = GXv_int2[0] ;
      AV85Eratex = GXt_int1 ;
      AV69Inc_obs = "" ;
      AV18LinFas = (short)(0) ;
      AV23DecTot = DecimalUtil.doubleToDec(0) ;
      AV24Resto = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P001N2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV15DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P001N2_A361DisCod[0] ;
         A371DisFecEnt = P001N2_A371DisFecEnt[0] ;
         A252CliCod = P001N2_A252CliCod[0] ;
         A335DisArtCod = P001N2_A335DisArtCod[0] ;
         A2926DisPla = P001N2_A2926DisPla[0] ;
         W396EmprCod = A396EmprCod ;
         AV30DisFecEnt = A371DisFecEnt ;
         AV46CliCod = A252CliCod ;
         AV47Disartcod = A335DisArtCod ;
         AV65Displa = A2926DisPla ;
         /* Using cursor P001N3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A846UltFasLin = P001N3_A846UltFasLin[0] ;
            A758ProCod = P001N3_A758ProCod[0] ;
            W396EmprCod = A396EmprCod ;
            AV74Procodin = A758ProCod ;
            /*
               INSERT RECORD ON TABLE TXPBARPRO

            */
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            A129BarCod = AV16CodBar ;
            A132BarCodReo = (byte)(0) ;
            A130BarCodPar = " " ;
            A761ProFasLin = A846UltFasLin ;
            n761ProFasLin = false ;
            /* Using cursor P001N4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Boolean.valueOf(n761ProFasLin), Short.valueOf(A761ProFasLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
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
            A758ProCod = W758ProCod ;
            /* End Insert */
            System.out.println( httpContext.getMessage( "NewEndNew BARPRO", "") );
            AV57Baracaqui = " " ;
            /* Using cursor P001N5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A368DisFasLin = P001N5_A368DisFasLin[0] ;
               A6162SecCodF = P001N5_A6162SecCodF[0] ;
               n6162SecCodF = P001N5_n6162SecCodF[0] ;
               A457FasCod = P001N5_A457FasCod[0] ;
               A460FasDsc = P001N5_A460FasDsc[0] ;
               A456FasActTin = P001N5_A456FasActTin[0] ;
               n456FasActTin = P001N5_n456FasActTin[0] ;
               A458FasCon = P001N5_A458FasCon[0] ;
               n458FasCon = P001N5_n458FasCon[0] ;
               A4299FasConPla = P001N5_A4299FasConPla[0] ;
               n4299FasConPla = P001N5_n4299FasConPla[0] ;
               A4639FasCara = P001N5_A4639FasCara[0] ;
               n4639FasCara = P001N5_n4639FasCara[0] ;
               A4286FasForMul = P001N5_A4286FasForMul[0] ;
               n4286FasForMul = P001N5_n4286FasForMul[0] ;
               A7600FasH2OReh = P001N5_A7600FasH2OReh[0] ;
               n7600FasH2OReh = P001N5_n7600FasH2OReh[0] ;
               A7391FasTpCost = P001N5_A7391FasTpCost[0] ;
               n7391FasTpCost = P001N5_n7391FasTpCost[0] ;
               A6881FasUnpLt = P001N5_A6881FasUnpLt[0] ;
               n6881FasUnpLt = P001N5_n6881FasUnpLt[0] ;
               A4649FasUltForL = P001N5_A4649FasUltForL[0] ;
               n4649FasUltForL = P001N5_n4649FasUltForL[0] ;
               A4903FasAcab = P001N5_A4903FasAcab[0] ;
               n4903FasAcab = P001N5_n4903FasAcab[0] ;
               A3793DisMaqPru = P001N5_A3793DisMaqPru[0] ;
               n3793DisMaqPru = P001N5_n3793DisMaqPru[0] ;
               A602MaqCod = P001N5_A602MaqCod[0] ;
               n602MaqCod = P001N5_n602MaqCod[0] ;
               A5368FasGral = P001N5_A5368FasGral[0] ;
               n5368FasGral = P001N5_n5368FasGral[0] ;
               A5376DisQuiUl = P001N5_A5376DisQuiUl[0] ;
               A6011FasTip = P001N5_A6011FasTip[0] ;
               n6011FasTip = P001N5_n6011FasTip[0] ;
               A7915Disfastpp = P001N5_A7915Disfastpp[0] ;
               n7915Disfastpp = P001N5_n7915Disfastpp[0] ;
               A7917DisfasRb = P001N5_A7917DisfasRb[0] ;
               n7917DisfasRb = P001N5_n7917DisfasRb[0] ;
               A7916DisFasUpL = P001N5_A7916DisFasUpL[0] ;
               n7916DisFasUpL = P001N5_n7916DisFasUpL[0] ;
               A9841DisFasObs = P001N5_A9841DisFasObs[0] ;
               A7918Dta_UOrd = P001N5_A7918Dta_UOrd[0] ;
               n7918Dta_UOrd = P001N5_n7918Dta_UOrd[0] ;
               A6162SecCodF = P001N5_A6162SecCodF[0] ;
               n6162SecCodF = P001N5_n6162SecCodF[0] ;
               A460FasDsc = P001N5_A460FasDsc[0] ;
               A456FasActTin = P001N5_A456FasActTin[0] ;
               n456FasActTin = P001N5_n456FasActTin[0] ;
               A458FasCon = P001N5_A458FasCon[0] ;
               n458FasCon = P001N5_n458FasCon[0] ;
               A4299FasConPla = P001N5_A4299FasConPla[0] ;
               n4299FasConPla = P001N5_n4299FasConPla[0] ;
               A4639FasCara = P001N5_A4639FasCara[0] ;
               n4639FasCara = P001N5_n4639FasCara[0] ;
               A4286FasForMul = P001N5_A4286FasForMul[0] ;
               n4286FasForMul = P001N5_n4286FasForMul[0] ;
               A7600FasH2OReh = P001N5_A7600FasH2OReh[0] ;
               n7600FasH2OReh = P001N5_n7600FasH2OReh[0] ;
               A7391FasTpCost = P001N5_A7391FasTpCost[0] ;
               n7391FasTpCost = P001N5_n7391FasTpCost[0] ;
               A6881FasUnpLt = P001N5_A6881FasUnpLt[0] ;
               n6881FasUnpLt = P001N5_n6881FasUnpLt[0] ;
               A4649FasUltForL = P001N5_A4649FasUltForL[0] ;
               n4649FasUltForL = P001N5_n4649FasUltForL[0] ;
               A4903FasAcab = P001N5_A4903FasAcab[0] ;
               n4903FasAcab = P001N5_n4903FasAcab[0] ;
               A602MaqCod = P001N5_A602MaqCod[0] ;
               n602MaqCod = P001N5_n602MaqCod[0] ;
               A5368FasGral = P001N5_A5368FasGral[0] ;
               n5368FasGral = P001N5_n5368FasGral[0] ;
               A6011FasTip = P001N5_A6011FasTip[0] ;
               n6011FasTip = P001N5_n6011FasTip[0] ;
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               AV17FasCod = A457FasCod ;
               AV64fasdsc = A460FasDsc ;
               AV18LinFas = (short)(AV18LinFas+100) ;
               AV18LinFas = ((AV84Fabricato==1) ? A368DisFasLin : AV18LinFas) ;
               AV27FasActTin = A456FasActTin ;
               AV28FasCon = A458FasCon ;
               AV33FasConPla = A4299FasConPla ;
               AV34FasCara = A4639FasCara ;
               AV35FasForMul = A4286FasForMul ;
               AV71FasH2Oreh = A7600FasH2OReh ;
               AV61FasTpCost = A7391FasTpCost ;
               AV62FasUnpLt = A6881FasUnpLt ;
               AV63FasUltForl = A4649FasUltForL ;
               AV37FasAcab = A4903FasAcab ;
               AV51SecCodF = A6162SecCodF ;
               AV45MaqCod = ((AV84Fabricato==0)&&(AV85Eratex==0) ? A602MaqCod : ((GXutil.strcmp("", A3793DisMaqPru)==0) ? A602MaqCod : A3793DisMaqPru)) ;
               if ( AV78Planing == 1 )
               {
                  GXv_char6[0] = A396EmprCod ;
                  GXv_int7[0] = AV16CodBar ;
                  GXv_int2[0] = (byte)(0) ;
                  GXv_char5[0] = " " ;
                  GXv_char4[0] = AV17FasCod ;
                  GXv_date8[0] = AV19FecTeo ;
                  GXv_decimal9[0] = AV20TieTeo ;
                  GXv_decimal10[0] = AV21Decalaje ;
                  GXv_decimal11[0] = AV24Resto ;
                  GXv_char12[0] = AV79T_c ;
                  GXv_char13[0] = AV48Procod ;
                  GXv_char14[0] = AV45MaqCod ;
                  GXv_int15[0] = AV46CliCod ;
                  GXv_char16[0] = AV47Disartcod ;
                  GXv_int17[0] = 0 ;
                  GXv_int18[0] = (byte)(0) ;
                  new app.ppla001(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_int2, GXv_char5, GXv_char4, GXv_date8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_char12, GXv_char13, GXv_char14, GXv_int15, GXv_char16, GXv_int17, GXv_int18) ;
                  pfasbar.this.A396EmprCod = GXv_char6[0] ;
                  pfasbar.this.AV16CodBar = GXv_int7[0] ;
                  pfasbar.this.AV17FasCod = GXv_char4[0] ;
                  pfasbar.this.AV19FecTeo = GXv_date8[0] ;
                  pfasbar.this.AV20TieTeo = GXv_decimal9[0] ;
                  pfasbar.this.AV21Decalaje = GXv_decimal10[0] ;
                  pfasbar.this.AV24Resto = GXv_decimal11[0] ;
                  pfasbar.this.AV79T_c = GXv_char12[0] ;
                  pfasbar.this.AV48Procod = GXv_char13[0] ;
                  pfasbar.this.AV45MaqCod = GXv_char14[0] ;
                  pfasbar.this.AV46CliCod = GXv_int15[0] ;
                  pfasbar.this.AV47Disartcod = GXv_char16[0] ;
               }
               else
               {
                  GXv_char16[0] = A396EmprCod ;
                  GXv_int15[0] = AV16CodBar ;
                  GXv_int18[0] = (byte)(0) ;
                  GXv_char14[0] = " " ;
                  GXv_char13[0] = AV17FasCod ;
                  GXv_date8[0] = AV19FecTeo ;
                  GXv_decimal11[0] = AV20TieTeo ;
                  GXv_decimal10[0] = AV21Decalaje ;
                  GXv_decimal9[0] = AV24Resto ;
                  new app.pcalcul(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_int18, GXv_char14, GXv_char13, GXv_date8, GXv_decimal11, GXv_decimal10, GXv_decimal9) ;
                  pfasbar.this.A396EmprCod = GXv_char16[0] ;
                  pfasbar.this.AV16CodBar = GXv_int15[0] ;
                  pfasbar.this.AV17FasCod = GXv_char13[0] ;
                  pfasbar.this.AV19FecTeo = GXv_date8[0] ;
                  pfasbar.this.AV20TieTeo = GXv_decimal11[0] ;
                  pfasbar.this.AV21Decalaje = GXv_decimal10[0] ;
                  pfasbar.this.AV24Resto = GXv_decimal9[0] ;
               }
               AV23DecTot = AV23DecTot.add(AV21Decalaje) ;
               AV22FecFinPre = AV19FecTeo ;
               AV40FasGral = A5368FasGral ;
               AV41DISQUIUL = A5376DisQuiUl ;
               AV42FasTip = A6011FasTip ;
               AV49Artprolin = A368DisFasLin ;
               AV76Disfaslin = A368DisFasLin ;
               /* Execute user subroutine: 'ARTFOR' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(3);
                  pr_default.close(3);
                  pr_default.close(1);
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV44FlagConFa == 1 )
               {
                  GXv_char16[0] = A396EmprCod ;
                  GXv_char14[0] = AV17FasCod ;
                  GXv_char13[0] = AV45MaqCod ;
                  new app.pmconfa(remoteHandle, context).execute( GXv_char16, GXv_char14, GXv_char13) ;
                  pfasbar.this.A396EmprCod = GXv_char16[0] ;
                  pfasbar.this.AV17FasCod = GXv_char14[0] ;
                  pfasbar.this.AV45MaqCod = GXv_char13[0] ;
               }
               if ( AV73Acabats2013 == 1 )
               {
                  GXv_char16[0] = A396EmprCod ;
                  GXv_int15[0] = AV46CliCod ;
                  GXv_char14[0] = AV47Disartcod ;
                  GXv_char13[0] = AV74Procodin ;
                  GXv_char12[0] = AV17FasCod ;
                  GXv_char6[0] = AV75MaqCodC ;
                  new app.pcapfm1(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char14, GXv_char13, GXv_char12, GXv_char6) ;
                  pfasbar.this.A396EmprCod = GXv_char16[0] ;
                  pfasbar.this.AV46CliCod = GXv_int15[0] ;
                  pfasbar.this.AV47Disartcod = GXv_char14[0] ;
                  pfasbar.this.AV74Procodin = GXv_char13[0] ;
                  pfasbar.this.AV17FasCod = GXv_char12[0] ;
                  pfasbar.this.AV75MaqCodC = GXv_char6[0] ;
                  AV45MaqCod = ((GXutil.strcmp("", AV75MaqCodC)==0) ? AV45MaqCod : AV75MaqCodC) ;
               }
               AV55Disfastpp = A7915Disfastpp ;
               AV53DisfasRb = A7917DisfasRb ;
               AV54DisFasUpL = A7916DisFasUpL ;
               AV58DisFasobs = A9841DisFasObs ;
               AV72Dta_UOrd = A7918Dta_UOrd ;
               if ( GXutil.strcmp(AV65Displa, httpContext.getMessage( "S", "")) == 0 )
               {
                  /*
                     INSERT RECORD ON TABLE TXPDT000

                  */
                  W396EmprCod = A396EmprCod ;
                  A7867Dt_Op = AV16CodBar ;
                  A7868Dt_Opr = (byte)(0) ;
                  A7869Dt_Opp = " " ;
                  A7870Dt_Orden = ((AV77ActDisfaslin==0) ? AV18LinFas : AV76Disfaslin) ;
                  A7871Dt_Fascod = AV17FasCod ;
                  n7871Dt_Fascod = false ;
                  A7872Dt_FasDsc = AV64fasdsc ;
                  n7872Dt_FasDsc = false ;
                  A7873Dt_Tpp = AV55Disfastpp ;
                  n7873Dt_Tpp = false ;
                  A7874Dt_H2OReh = AV71FasH2Oreh ;
                  n7874Dt_H2OReh = false ;
                  A7875Dt_TpCost = AV61FasTpCost ;
                  n7875Dt_TpCost = false ;
                  A7876Dt_UnpLt = AV54DisFasUpL ;
                  n7876Dt_UnpLt = false ;
                  A7890Dt_UOrd = AV72Dta_UOrd ;
                  n7890Dt_UOrd = false ;
                  /* Using cursor P001N6 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Boolean.valueOf(n7871Dt_Fascod), A7871Dt_Fascod, Boolean.valueOf(n7872Dt_FasDsc), A7872Dt_FasDsc, Boolean.valueOf(n7873Dt_Tpp), A7873Dt_Tpp, Boolean.valueOf(n7874Dt_H2OReh), A7874Dt_H2OReh, Boolean.valueOf(n7875Dt_TpCost), Short.valueOf(A7875Dt_TpCost), Boolean.valueOf(n7876Dt_UnpLt), A7876Dt_UnpLt, Boolean.valueOf(n7890Dt_UOrd), Short.valueOf(A7890Dt_UOrd)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT000");
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
               }
               System.out.println( httpContext.getMessage( "Inicio NewEndNew BARFAS", "") );
               /*
                  INSERT RECORD ON TABLE TXPBARFAS

               */
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               W457FasCod = A457FasCod ;
               A129BarCod = AV16CodBar ;
               A132BarCodReo = (byte)(0) ;
               A130BarCodPar = " " ;
               A194BarOrdLin = ((AV77ActDisfaslin==0) ? AV18LinFas : AV76Disfaslin) ;
               A457FasCod = AV17FasCod ;
               A603MaqCodBis = AV45MaqCod ;
               A162BarFecTeo = AV19FecTeo ;
               A216BarTieTeo = AV20TieTeo ;
               A150BarFacTin = AV27FasActTin ;
               A152BarFasCon = AV28FasCon ;
               A153BarFasEst = (byte)(0) ;
               A4287BarFasFor = AV35FasForMul ;
               A4637BarFasCara = AV34FasCara ;
               A4638BarUltNlot = 0 ;
               n4638BarUltNlot = false ;
               A4021BarFasBot = GXutil.space( (short)(1)) ;
               A4905BarFasAcab = AV37FasAcab ;
               A4022BarNumBot = 0 ;
               A5045BarFasAgr = "" ;
               n5045BarFasAgr = false ;
               A5046BarFasPrp = "" ;
               n5046BarFasPrp = false ;
               A5047BarFasFPl = GXutil.nullDate() ;
               n5047BarFasFPl = false ;
               A5048BarFasUsu = GXutil.space( (short)(8)) ;
               n5048BarFasUsu = false ;
               A5369BarFasGral = AV40FasGral ;
               n5369BarFasGral = false ;
               A5372FasQuiUl = AV41DISQUIUL ;
               n5372FasQuiUl = false ;
               A179BarLoc = "" ;
               A3836BarFasPri = (byte)(0) ;
               A4301BarFasCoP = AV33FasConPla ;
               A6012BarFasTip = AV42FasTip ;
               n6012BarFasTip = false ;
               A6555BarFasNPl = (byte)(0) ;
               if ( AV43FechasFase == 1 )
               {
                  A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
                  n4442BarFasDTI = false ;
                  A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
                  n4443BarFasDTF = false ;
               }
               A7914BarfasRb = AV53DisfasRb ;
               n7914BarfasRb = false ;
               A7913BarfasUnpL = AV54DisFasUpL ;
               n7913BarfasUnpL = false ;
               A7912Barfastpp = AV55Disfastpp ;
               n7912Barfastpp = false ;
               A7933Dtb_UOrd = AV72Dta_UOrd ;
               n7933Dtb_UOrd = false ;
               A9842BarObsF = AV58DisFasobs ;
               n9842BarObsF = false ;
               A8938BarfasPri2 = (short)(80) ;
               n8938BarfasPri2 = false ;
               A3836BarFasPri = (byte)(80) ;
               if ( AV70Etm == 1 )
               {
                  A6012BarFasTip = httpContext.getMessage( "P", "") ;
                  n6012BarFasTip = false ;
                  A8938BarfasPri2 = (short)(80) ;
                  n8938BarfasPri2 = false ;
               }
               A2327BarFasSer = GXutil.substring( AV58DisFasobs, 1, 4) ;
               n2327BarFasSer = false ;
               A5896BarMaqPlan = GXutil.substring( AV58DisFasobs, 5, 6) ;
               n5896BarMaqPlan = false ;
               A6173BarFasSec = A6162SecCodF ;
               n6173BarFasSec = false ;
               if ( AV84Fabricato == 1 )
               {
                  A216BarTieTeo = AV55Disfastpp ;
                  AV86Barfasdtialfa = GXutil.substring( AV58DisFasobs, 24, 20) ;
                  AV82Barfasdtfalfa = GXutil.substring( AV58DisFasobs, 44, 20) ;
                  AV80Barfasest = (byte)(GXutil.lval( GXutil.substring( AV58DisFasobs, 64, 1))) ;
                  A153BarFasEst = AV80Barfasest ;
                  AV83diaalfa = GXutil.substring( AV82Barfasdtfalfa, 1, 10) ;
                  AV87diaalfa2 = GXutil.substring( AV83diaalfa, 9, 2) + "/" + GXutil.substring( AV83diaalfa, 6, 2) + "/" + GXutil.substring( AV83diaalfa, 1, 4) ;
                  AV88DiaIn = localUtil.ctod( AV87diaalfa2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                  AV89HoraIN = GXutil.substring( AV82Barfasdtfalfa, 12, 8) ;
                  AV82Barfasdtfalfa = localUtil.dtoc( AV88DiaIn, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + AV89HoraIN ;
                  AV81Barfasdtf = GXutil.resetTime( GXutil.nullDate() );
                  A4443BarFasDTF = ((GXutil.strcmp("", AV82Barfasdtfalfa)==0) ? AV81Barfasdtf : localUtil.ctot( AV82Barfasdtfalfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
                  n4443BarFasDTF = false ;
                  A4442BarFasDTI = (GXutil.dateCompare(GXutil.nullDate(), A4442BarFasDTI)&&!(GXutil.strcmp("", AV82Barfasdtfalfa)==0) ? localUtil.ctot( AV82Barfasdtfalfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) : AV81Barfasdtf) ;
                  n4442BarFasDTI = false ;
               }
               /* Using cursor P001N7 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, Byte.valueOf(A153BarFasEst), A603MaqCodBis, A150BarFacTin, A162BarFecTeo, A216BarTieTeo, A179BarLoc, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, A4301BarFasCoP, A4637BarFasCara, Boolean.valueOf(n4638BarUltNlot), Integer.valueOf(A4638BarUltNlot), A4905BarFasAcab, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A457FasCod, Boolean.valueOf(n5045BarFasAgr), A5045BarFasAgr, Boolean.valueOf(n5046BarFasPrp), A5046BarFasPrp, Boolean.valueOf(n5047BarFasFPl), A5047BarFasFPl, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), Boolean.valueOf(n5896BarMaqPlan), A5896BarMaqPlan, Boolean.valueOf(n6012BarFasTip), A6012BarFasTip, Boolean.valueOf(n6173BarFasSec), A6173BarFasSec, Byte.valueOf(A6555BarFasNPl), Boolean.valueOf(n7912Barfastpp), A7912Barfastpp, Boolean.valueOf(n7913BarfasUnpL), A7913BarfasUnpL, Boolean.valueOf(n7914BarfasRb), A7914BarfasRb, Boolean.valueOf(n7933Dtb_UOrd), Short.valueOf(A7933Dtb_UOrd), Boolean.valueOf(n8938BarfasPri2), Short.valueOf(A8938BarfasPri2), Boolean.valueOf(n9842BarObsF), A9842BarObsF, Byte.valueOf(A3836BarFasPri), Boolean.valueOf(n2327BarFasSer), A2327BarFasSer});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
               A396EmprCod = W396EmprCod ;
               A758ProCod = W758ProCod ;
               A457FasCod = W457FasCod ;
               /* End Insert */
               if ( ( AV36JBP == 0 ) && ( AV39Flag_not == 0 ) )
               {
                  GXv_char16[0] = A396EmprCod ;
                  GXv_int15[0] = AV16CodBar ;
                  GXv_int18[0] = (byte)(0) ;
                  GXv_char14[0] = " " ;
                  GXv_char13[0] = A758ProCod ;
                  GXv_int19[0] = AV18LinFas ;
                  new app.pgbarpar(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_int18, GXv_char14, GXv_char13, GXv_int19) ;
                  pfasbar.this.A396EmprCod = GXv_char16[0] ;
                  pfasbar.this.AV16CodBar = GXv_int15[0] ;
                  pfasbar.this.A758ProCod = GXv_char13[0] ;
                  pfasbar.this.AV18LinFas = GXv_int19[0] ;
               }
               if ( AV39Flag_not == 1 )
               {
                  /* Using cursor P001N8 */
                  pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                  while ( (pr_default.getStatus(6) != 101) )
                  {
                     A3687DisParTxt = P001N8_A3687DisParTxt[0] ;
                     A3685DisParVal = P001N8_A3685DisParVal[0] ;
                     A3686DisParObs = P001N8_A3686DisParObs[0] ;
                     A12672DisParVl2 = P001N8_A12672DisParVl2[0] ;
                     A13989DisParVMn = P001N8_A13989DisParVMn[0] ;
                     A13990DisParVMx = P001N8_A13990DisParVMx[0] ;
                     A6557DisParOrd = P001N8_A6557DisParOrd[0] ;
                     A14078DisParPLC = P001N8_A14078DisParPLC[0] ;
                     A1664ParFasCod = P001N8_A1664ParFasCod[0] ;
                     W396EmprCod = A396EmprCod ;
                     W758ProCod = A758ProCod ;
                     /*
                        INSERT RECORD ON TABLE TXPBarPar

                     */
                     W396EmprCod = A396EmprCod ;
                     W758ProCod = A758ProCod ;
                     A129BarCod = AV16CodBar ;
                     A132BarCodReo = (byte)(0) ;
                     A130BarCodPar = " " ;
                     A194BarOrdLin = ((AV77ActDisfaslin==0) ? AV18LinFas : AV76Disfaslin) ;
                     A3295BarParVal = A3685DisParVal ;
                     A3296BarParObs = A3686DisParObs ;
                     A3693BarParTxt = A3687DisParTxt ;
                     n3693BarParTxt = false ;
                     A9737BarValPar = GXutil.space( (short)(8)) ;
                     A12671BarParVl2 = A12672DisParVl2 ;
                     A13991BarParVMn = A13989DisParVMn ;
                     A13992BarParVMx = A13990DisParVMx ;
                     A10257Itm_ord5 = A6557DisParOrd ;
                     A14079BarParPLC = A14078DisParPLC ;
                     /* Using cursor P001N9 */
                     pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A1664ParFasCod), A3295BarParVal, A3296BarParObs, Boolean.valueOf(n3693BarParTxt), A3693BarParTxt, A9737BarValPar, Short.valueOf(A10257Itm_ord5), A12671BarParVl2, A13991BarParVMn, A13992BarParVMx, A14079BarParPLC});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBarPar");
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
                     A758ProCod = W758ProCod ;
                     /* End Insert */
                     A396EmprCod = W396EmprCod ;
                     A758ProCod = W758ProCod ;
                     pr_default.readNext(6);
                  }
                  pr_default.close(6);
               }
               AV90fasqui = (short)(0) ;
               AV69Inc_obs = httpContext.getMessage( "Creacion FASQUI.", "") + GXutil.newLine( ) ;
               /* Using cursor P001N10 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A5377DisQuiLin = P001N10_A5377DisQuiLin[0] ;
                  A5378DisQuiNp = P001N10_A5378DisQuiNp[0] ;
                  A5379DisQuiTp = P001N10_A5379DisQuiTp[0] ;
                  A5380DisQuiRb = P001N10_A5380DisQuiRb[0] ;
                  A764ProForCod = P001N10_A764ProForCod[0] ;
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  /*
                     INSERT RECORD ON TABLE TXPFASQUI

                  */
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  W764ProForCod = A764ProForCod ;
                  A129BarCod = AV16CodBar ;
                  A132BarCodReo = (byte)(0) ;
                  A130BarCodPar = " " ;
                  A194BarOrdLin = ((AV77ActDisfaslin==0) ? AV18LinFas : AV76Disfaslin) ;
                  A5371FasQuiLin = A5377DisQuiLin ;
                  A5373FasQuiNp = A5378DisQuiNp ;
                  A5374FasQuiTp = A5379DisQuiTp ;
                  A5375FasQuiRb = A5380DisQuiRb ;
                  A6599FasMaqPl = " " ;
                  A6600FasFecPl = GXutil.nullDate() ;
                  A6601FasOrdPl = (byte)(80) ;
                  A6602FasStPl = (byte)(0) ;
                  AV69Inc_obs += httpContext.getMessage( "Proceso  =", "") + A758ProCod + GXutil.newLine( ) ;
                  AV69Inc_obs += httpContext.getMessage( "Barordlin=", "") + GXutil.str( AV18LinFas, 4, 0) + GXutil.newLine( ) ;
                  AV69Inc_obs += httpContext.getMessage( "FasQuilin=", "") + GXutil.str( A5377DisQuiLin, 4, 0) + GXutil.newLine( ) ;
                  AV69Inc_obs += httpContext.getMessage( "ProcesoQ =", "") + A764ProForCod ;
                  /* Using cursor P001N11 */
                  pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin), A764ProForCod, Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb), A6599FasMaqPl, A6600FasFecPl, Byte.valueOf(A6601FasOrdPl), Byte.valueOf(A6602FasStPl)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
                  if ( (pr_default.getStatus(9) == 1) )
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
                  A758ProCod = W758ProCod ;
                  A764ProForCod = W764ProForCod ;
                  /* End Insert */
                  AV90fasqui = (short)(1) ;
                  A396EmprCod = W396EmprCod ;
                  A758ProCod = W758ProCod ;
                  pr_default.readNext(8);
               }
               pr_default.close(8);
               /* Using cursor P001N12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               while ( (pr_default.getStatus(10) != 101) )
               {
                  A7919Dta_Ordl = P001N12_A7919Dta_Ordl[0] ;
                  A7920Dta_CPQ = P001N12_A7920Dta_CPQ[0] ;
                  n7920Dta_CPQ = P001N12_n7920Dta_CPQ[0] ;
                  A7922Dta_ForFab = P001N12_A7922Dta_ForFab[0] ;
                  n7922Dta_ForFab = P001N12_n7922Dta_ForFab[0] ;
                  A7923Dta_Fortie = P001N12_A7923Dta_Fortie[0] ;
                  n7923Dta_Fortie = P001N12_n7923Dta_Fortie[0] ;
                  A7924Dta_ForTmx = P001N12_A7924Dta_ForTmx[0] ;
                  n7924Dta_ForTmx = P001N12_n7924Dta_ForTmx[0] ;
                  A7925Dta_ForRb = P001N12_A7925Dta_ForRb[0] ;
                  n7925Dta_ForRb = P001N12_n7925Dta_ForRb[0] ;
                  A7926Dta_ForPhx = P001N12_A7926Dta_ForPhx[0] ;
                  n7926Dta_ForPhx = P001N12_n7926Dta_ForPhx[0] ;
                  A7927Dta_ForPhn = P001N12_A7927Dta_ForPhn[0] ;
                  n7927Dta_ForPhn = P001N12_n7927Dta_ForPhn[0] ;
                  A7928Dta_ForUli = P001N12_A7928Dta_ForUli[0] ;
                  n7928Dta_ForUli = P001N12_n7928Dta_ForUli[0] ;
                  A12112Dta_Nh2o = P001N12_A12112Dta_Nh2o[0] ;
                  n12112Dta_Nh2o = P001N12_n12112Dta_Nh2o[0] ;
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  /*
                     INSERT RECORD ON TABLE TXPDT005

                  */
                  W396EmprCod = A396EmprCod ;
                  W758ProCod = A758ProCod ;
                  A129BarCod = AV16CodBar ;
                  A132BarCodReo = (byte)(0) ;
                  A130BarCodPar = " " ;
                  A194BarOrdLin = ((AV77ActDisfaslin==0) ? AV18LinFas : AV76Disfaslin) ;
                  A7934Dtb_Ordl = A7919Dta_Ordl ;
                  A7935Dtb_CPQ = A7920Dta_CPQ ;
                  n7935Dtb_CPQ = false ;
                  A7937Dtb_ForFab = A7922Dta_ForFab ;
                  n7937Dtb_ForFab = false ;
                  A7938Dtb_Fortie = A7923Dta_Fortie ;
                  n7938Dtb_Fortie = false ;
                  A7939Dtb_ForTmx = A7924Dta_ForTmx ;
                  n7939Dtb_ForTmx = false ;
                  A7940Dtb_ForRb = A7925Dta_ForRb ;
                  n7940Dtb_ForRb = false ;
                  A7941Dtb_ForPhx = A7926Dta_ForPhx ;
                  n7941Dtb_ForPhx = false ;
                  A7942Dtb_ForPhn = A7927Dta_ForPhn ;
                  n7942Dtb_ForPhn = false ;
                  A7943Dtb_ForUli = A7928Dta_ForUli ;
                  n7943Dtb_ForUli = false ;
                  A12111Dtb_Nh2o = A12112Dta_Nh2o ;
                  n12111Dtb_Nh2o = false ;
                  /* Using cursor P001N13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Boolean.valueOf(n7935Dtb_CPQ), A7935Dtb_CPQ, Boolean.valueOf(n7937Dtb_ForFab), A7937Dtb_ForFab, Boolean.valueOf(n7938Dtb_Fortie), Short.valueOf(A7938Dtb_Fortie), Boolean.valueOf(n7939Dtb_ForTmx), Short.valueOf(A7939Dtb_ForTmx), Boolean.valueOf(n7940Dtb_ForRb), A7940Dtb_ForRb, Boolean.valueOf(n7941Dtb_ForPhx), A7941Dtb_ForPhx, Boolean.valueOf(n7942Dtb_ForPhn), A7942Dtb_ForPhn, Boolean.valueOf(n7943Dtb_ForUli), Short.valueOf(A7943Dtb_ForUli), Boolean.valueOf(n12111Dtb_Nh2o), Short.valueOf(A12111Dtb_Nh2o)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
                  if ( (pr_default.getStatus(11) == 1) )
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
                  A758ProCod = W758ProCod ;
                  /* End Insert */
                  if ( GXutil.strcmp(AV65Displa, httpContext.getMessage( "S", "")) == 0 )
                  {
                     /*
                        INSERT RECORD ON TABLE TXPDT001

                     */
                     W396EmprCod = A396EmprCod ;
                     A7867Dt_Op = AV16CodBar ;
                     A7868Dt_Opr = (byte)(0) ;
                     A7869Dt_Opp = " " ;
                     A7870Dt_Orden = ((AV77ActDisfaslin==0) ? AV18LinFas : AV76Disfaslin) ;
                     A7891Dt_Ordl = A7919Dta_Ordl ;
                     A7877Dt_CPQ = A7920Dta_CPQ ;
                     n7877Dt_CPQ = false ;
                     A7879Dt_ForFab = A7922Dta_ForFab ;
                     n7879Dt_ForFab = false ;
                     A7880Dt_Fortie = A7923Dta_Fortie ;
                     n7880Dt_Fortie = false ;
                     A7881Dt_ForTmx = A7924Dta_ForTmx ;
                     n7881Dt_ForTmx = false ;
                     A7882Dt_ForRb = A7925Dta_ForRb ;
                     n7882Dt_ForRb = false ;
                     A7883Dt_ForPhx = A7926Dta_ForPhx ;
                     n7883Dt_ForPhx = false ;
                     A7884Dt_ForPhn = A7927Dta_ForPhn ;
                     n7884Dt_ForPhn = false ;
                     A7885Dt_ForUli = A7928Dta_ForUli ;
                     n7885Dt_ForUli = false ;
                     A12110Dt_Nh2o = A12112Dta_Nh2o ;
                     n12110Dt_Nh2o = false ;
                     /* Using cursor P001N14 */
                     pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl), Boolean.valueOf(n7877Dt_CPQ), A7877Dt_CPQ, Boolean.valueOf(n7879Dt_ForFab), A7879Dt_ForFab, Boolean.valueOf(n7880Dt_Fortie), Short.valueOf(A7880Dt_Fortie), Boolean.valueOf(n7881Dt_ForTmx), Short.valueOf(A7881Dt_ForTmx), Boolean.valueOf(n7882Dt_ForRb), A7882Dt_ForRb, Boolean.valueOf(n7883Dt_ForPhx), A7883Dt_ForPhx, Boolean.valueOf(n7884Dt_ForPhn), A7884Dt_ForPhn, Boolean.valueOf(n7885Dt_ForUli), Short.valueOf(A7885Dt_ForUli), Boolean.valueOf(n12110Dt_Nh2o), Short.valueOf(A12110Dt_Nh2o)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT001");
                     if ( (pr_default.getStatus(12) == 1) )
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
                  }
                  /* Using cursor P001N15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), Short.valueOf(A7919Dta_Ordl)});
                  while ( (pr_default.getStatus(13) != 101) )
                  {
                     A7929Dta_ForLin = P001N15_A7929Dta_ForLin[0] ;
                     A7930Dta_Prdnum = P001N15_A7930Dta_Prdnum[0] ;
                     n7930Dta_Prdnum = P001N15_n7930Dta_Prdnum[0] ;
                     A7932Dta_Forcan = P001N15_A7932Dta_Forcan[0] ;
                     n7932Dta_Forcan = P001N15_n7932Dta_Forcan[0] ;
                     A8479Dta_clave1 = P001N15_A8479Dta_clave1[0] ;
                     n8479Dta_clave1 = P001N15_n8479Dta_clave1[0] ;
                     A8480Dta_clave2 = P001N15_A8480Dta_clave2[0] ;
                     n8480Dta_clave2 = P001N15_n8480Dta_clave2[0] ;
                     A490ForPrdUMe = P001N15_A490ForPrdUMe[0] ;
                     n490ForPrdUMe = P001N15_n490ForPrdUMe[0] ;
                     W396EmprCod = A396EmprCod ;
                     W758ProCod = A758ProCod ;
                     /*
                        INSERT RECORD ON TABLE TXPDT0051

                     */
                     W396EmprCod = A396EmprCod ;
                     W758ProCod = A758ProCod ;
                     W490ForPrdUMe = A490ForPrdUMe ;
                     n490ForPrdUMe = false ;
                     A129BarCod = AV16CodBar ;
                     A132BarCodReo = (byte)(0) ;
                     A130BarCodPar = " " ;
                     A194BarOrdLin = ((AV77ActDisfaslin==0) ? AV18LinFas : AV76Disfaslin) ;
                     A7934Dtb_Ordl = A7919Dta_Ordl ;
                     A7944Dtb_ForLin = A7929Dta_ForLin ;
                     A7945Dtb_Prdnum = A7930Dta_Prdnum ;
                     n7945Dtb_Prdnum = false ;
                     n490ForPrdUMe = false ;
                     A7947Dtb_Forcan = A7932Dta_Forcan ;
                     n7947Dtb_Forcan = false ;
                     A8477Dtb_clave1 = A8479Dta_clave1 ;
                     n8477Dtb_clave1 = false ;
                     A8478Dtb_clave2 = A8480Dta_clave2 ;
                     n8478Dtb_clave2 = false ;
                     /* Using cursor P001N16 */
                     pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Short.valueOf(A7944Dtb_ForLin), Boolean.valueOf(n7945Dtb_Prdnum), A7945Dtb_Prdnum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Boolean.valueOf(n7947Dtb_Forcan), A7947Dtb_Forcan, Boolean.valueOf(n8477Dtb_clave1), A8477Dtb_clave1, Boolean.valueOf(n8478Dtb_clave2), A8478Dtb_clave2});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0051");
                     if ( (pr_default.getStatus(14) == 1) )
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
                     A758ProCod = W758ProCod ;
                     A490ForPrdUMe = W490ForPrdUMe ;
                     n490ForPrdUMe = false ;
                     /* End Insert */
                     if ( GXutil.strcmp(AV65Displa, httpContext.getMessage( "S", "")) == 0 )
                     {
                        /*
                           INSERT RECORD ON TABLE TXPDT0011

                        */
                        W396EmprCod = A396EmprCod ;
                        W490ForPrdUMe = A490ForPrdUMe ;
                        n490ForPrdUMe = false ;
                        A7867Dt_Op = AV16CodBar ;
                        A7868Dt_Opr = (byte)(0) ;
                        A7869Dt_Opp = " " ;
                        A7870Dt_Orden = ((AV77ActDisfaslin==0) ? AV18LinFas : AV76Disfaslin) ;
                        A7891Dt_Ordl = A7919Dta_Ordl ;
                        A7886Dt_ForLin = A7929Dta_ForLin ;
                        A7887Dt_Prdnum = A7930Dta_Prdnum ;
                        n7887Dt_Prdnum = false ;
                        n490ForPrdUMe = false ;
                        A7889Dt_Forcan = A7932Dta_Forcan ;
                        n7889Dt_Forcan = false ;
                        A8473Dt_clave1 = A8479Dta_clave1 ;
                        n8473Dt_clave1 = false ;
                        A8474Dt_clave2 = A8480Dta_clave2 ;
                        n8474Dt_clave2 = false ;
                        /* Using cursor P001N17 */
                        pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A7867Dt_Op), Byte.valueOf(A7868Dt_Opr), A7869Dt_Opp, Short.valueOf(A7870Dt_Orden), Short.valueOf(A7891Dt_Ordl), Short.valueOf(A7886Dt_ForLin), Boolean.valueOf(n7887Dt_Prdnum), A7887Dt_Prdnum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Boolean.valueOf(n7889Dt_Forcan), A7889Dt_Forcan, Boolean.valueOf(n8473Dt_clave1), A8473Dt_clave1, Boolean.valueOf(n8474Dt_clave2), A8474Dt_clave2});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0011");
                        if ( (pr_default.getStatus(15) == 1) )
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
                     }
                     A396EmprCod = W396EmprCod ;
                     A758ProCod = W758ProCod ;
                     pr_default.readNext(13);
                  }
                  pr_default.close(13);
                  A396EmprCod = W396EmprCod ;
                  A758ProCod = W758ProCod ;
                  pr_default.readNext(10);
               }
               pr_default.close(10);
               A396EmprCod = W396EmprCod ;
               A758ProCod = W758ProCod ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV90fasqui == 1 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV100Pgmname, AV68UsurCod, AV66Station, AV69Inc_obs, AV16CodBar, (byte)(0), " ") ;
      }
      if ( AV56Nocommit == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pfasbar");
      }
      AV59Auxr = (byte)(0) ;
      AV60Auxp = " " ;
      /* Using cursor P001N18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(AV16CodBar), Byte.valueOf(AV59Auxr), AV60Auxp});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A130BarCodPar = P001N18_A130BarCodPar[0] ;
         A132BarCodReo = P001N18_A132BarCodReo[0] ;
         A129BarCod = P001N18_A129BarCod[0] ;
         A142BarDiaP = P001N18_A142BarDiaP[0] ;
         A157BarFecEnt = P001N18_A157BarFecEnt[0] ;
         A118BarAcaQui = P001N18_A118BarAcaQui[0] ;
         A142BarDiaP = AV23DecTot ;
         A157BarFecEnt = AV22FecFinPre ;
         if ( AV38Hss == 1 )
         {
            A157BarFecEnt = GXutil.nullDate() ;
         }
         if ( ! (GXutil.strcmp("", AV50ARTPROCOD)==0) )
         {
            A118BarAcaQui = AV50ARTPROCOD ;
         }
         /* Using cursor P001N19 */
         pr_default.execute(17, new Object[] {A142BarDiaP, A157BarFecEnt, A118BarAcaQui, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTFOR' Routine */
      returnInSub = false ;
      AV50ARTPROCOD = " " ;
      /* Using cursor P001N20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(AV46CliCod), AV47Disartcod, AV48Procod, AV17FasCod});
      while ( (pr_default.getStatus(18) != 101) )
      {
         A457FasCod = P001N20_A457FasCod[0] ;
         A758ProCod = P001N20_A758ProCod[0] ;
         A65ArtCod = P001N20_A65ArtCod[0] ;
         A252CliCod = P001N20_A252CliCod[0] ;
         A4898ArtProCod = P001N20_A4898ArtProCod[0] ;
         A4897ArtProLin = P001N20_A4897ArtProLin[0] ;
         AV50ARTPROCOD = A4898ArtProCod ;
         pr_default.readNext(18);
      }
      pr_default.close(18);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfasbar.this.A396EmprCod;
      this.aP1[0] = pfasbar.this.AV15DisCod;
      this.aP2[0] = pfasbar.this.AV16CodBar;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV66Station = "" ;
      GXt_char3 = "" ;
      AV67EmprNom = "" ;
      AV68UsurCod = "" ;
      AV69Inc_obs = "" ;
      AV23DecTot = DecimalUtil.ZERO ;
      AV24Resto = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P001N2_A396EmprCod = new String[] {""} ;
      P001N2_A361DisCod = new int[1] ;
      P001N2_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P001N2_A252CliCod = new int[1] ;
      P001N2_A335DisArtCod = new String[] {""} ;
      P001N2_A2926DisPla = new String[] {""} ;
      A371DisFecEnt = GXutil.nullDate() ;
      A335DisArtCod = "" ;
      A2926DisPla = "" ;
      W396EmprCod = "" ;
      AV30DisFecEnt = GXutil.nullDate() ;
      AV47Disartcod = "" ;
      AV65Displa = "" ;
      P001N3_A396EmprCod = new String[] {""} ;
      P001N3_A361DisCod = new int[1] ;
      P001N3_A846UltFasLin = new short[1] ;
      P001N3_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV74Procodin = "" ;
      W758ProCod = "" ;
      A130BarCodPar = "" ;
      Gx_emsg = "" ;
      AV57Baracaqui = "" ;
      P001N5_A396EmprCod = new String[] {""} ;
      P001N5_A361DisCod = new int[1] ;
      P001N5_A758ProCod = new String[] {""} ;
      P001N5_A368DisFasLin = new short[1] ;
      P001N5_A6162SecCodF = new String[] {""} ;
      P001N5_n6162SecCodF = new boolean[] {false} ;
      P001N5_A457FasCod = new String[] {""} ;
      P001N5_A460FasDsc = new String[] {""} ;
      P001N5_A456FasActTin = new String[] {""} ;
      P001N5_n456FasActTin = new boolean[] {false} ;
      P001N5_A458FasCon = new String[] {""} ;
      P001N5_n458FasCon = new boolean[] {false} ;
      P001N5_A4299FasConPla = new String[] {""} ;
      P001N5_n4299FasConPla = new boolean[] {false} ;
      P001N5_A4639FasCara = new String[] {""} ;
      P001N5_n4639FasCara = new boolean[] {false} ;
      P001N5_A4286FasForMul = new String[] {""} ;
      P001N5_n4286FasForMul = new boolean[] {false} ;
      P001N5_A7600FasH2OReh = new String[] {""} ;
      P001N5_n7600FasH2OReh = new boolean[] {false} ;
      P001N5_A7391FasTpCost = new short[1] ;
      P001N5_n7391FasTpCost = new boolean[] {false} ;
      P001N5_A6881FasUnpLt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N5_n6881FasUnpLt = new boolean[] {false} ;
      P001N5_A4649FasUltForL = new short[1] ;
      P001N5_n4649FasUltForL = new boolean[] {false} ;
      P001N5_A4903FasAcab = new String[] {""} ;
      P001N5_n4903FasAcab = new boolean[] {false} ;
      P001N5_A3793DisMaqPru = new String[] {""} ;
      P001N5_n3793DisMaqPru = new boolean[] {false} ;
      P001N5_A602MaqCod = new String[] {""} ;
      P001N5_n602MaqCod = new boolean[] {false} ;
      P001N5_A5368FasGral = new String[] {""} ;
      P001N5_n5368FasGral = new boolean[] {false} ;
      P001N5_A5376DisQuiUl = new short[1] ;
      P001N5_A6011FasTip = new String[] {""} ;
      P001N5_n6011FasTip = new boolean[] {false} ;
      P001N5_A7915Disfastpp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N5_n7915Disfastpp = new boolean[] {false} ;
      P001N5_A7917DisfasRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N5_n7917DisfasRb = new boolean[] {false} ;
      P001N5_A7916DisFasUpL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N5_n7916DisFasUpL = new boolean[] {false} ;
      P001N5_A9841DisFasObs = new String[] {""} ;
      P001N5_A7918Dta_UOrd = new short[1] ;
      P001N5_n7918Dta_UOrd = new boolean[] {false} ;
      A6162SecCodF = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4299FasConPla = "" ;
      A4639FasCara = "" ;
      A4286FasForMul = "" ;
      A7600FasH2OReh = "" ;
      A6881FasUnpLt = DecimalUtil.ZERO ;
      A4903FasAcab = "" ;
      A3793DisMaqPru = "" ;
      A602MaqCod = "" ;
      A5368FasGral = "" ;
      A6011FasTip = "" ;
      A7915Disfastpp = DecimalUtil.ZERO ;
      A7917DisfasRb = DecimalUtil.ZERO ;
      A7916DisFasUpL = DecimalUtil.ZERO ;
      A9841DisFasObs = "" ;
      AV17FasCod = "" ;
      AV64fasdsc = "" ;
      AV27FasActTin = "" ;
      AV28FasCon = "" ;
      AV33FasConPla = "" ;
      AV34FasCara = "" ;
      AV35FasForMul = "" ;
      AV71FasH2Oreh = "" ;
      AV62FasUnpLt = DecimalUtil.ZERO ;
      AV37FasAcab = "" ;
      AV51SecCodF = "" ;
      AV45MaqCod = "" ;
      GXv_int7 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV19FecTeo = GXutil.nullDate() ;
      AV20TieTeo = DecimalUtil.ZERO ;
      AV21Decalaje = DecimalUtil.ZERO ;
      AV79T_c = "" ;
      AV48Procod = "" ;
      GXv_int17 = new long[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV22FecFinPre = GXutil.nullDate() ;
      AV40FasGral = "" ;
      AV42FasTip = "" ;
      GXv_char12 = new String[1] ;
      AV75MaqCodC = "" ;
      GXv_char6 = new String[1] ;
      AV55Disfastpp = DecimalUtil.ZERO ;
      AV53DisfasRb = DecimalUtil.ZERO ;
      AV54DisFasUpL = DecimalUtil.ZERO ;
      AV58DisFasobs = "" ;
      A7869Dt_Opp = "" ;
      A7871Dt_Fascod = "" ;
      A7872Dt_FasDsc = "" ;
      A7873Dt_Tpp = DecimalUtil.ZERO ;
      A7874Dt_H2OReh = "" ;
      A7876Dt_UnpLt = DecimalUtil.ZERO ;
      W457FasCod = "" ;
      A603MaqCodBis = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A150BarFacTin = "" ;
      A152BarFasCon = "" ;
      A4287BarFasFor = "" ;
      A4637BarFasCara = "" ;
      A4021BarFasBot = "" ;
      A4905BarFasAcab = "" ;
      A5045BarFasAgr = "" ;
      A5046BarFasPrp = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A5048BarFasUsu = "" ;
      A5369BarFasGral = "" ;
      A179BarLoc = "" ;
      A4301BarFasCoP = "" ;
      A6012BarFasTip = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A7914BarfasRb = DecimalUtil.ZERO ;
      A7913BarfasUnpL = DecimalUtil.ZERO ;
      A7912Barfastpp = DecimalUtil.ZERO ;
      A9842BarObsF = "" ;
      A2327BarFasSer = "" ;
      A5896BarMaqPlan = "" ;
      A6173BarFasSec = "" ;
      AV86Barfasdtialfa = "" ;
      AV82Barfasdtfalfa = "" ;
      AV83diaalfa = "" ;
      AV87diaalfa2 = "" ;
      AV88DiaIn = GXutil.nullDate() ;
      AV89HoraIN = "" ;
      AV81Barfasdtf = GXutil.resetTime( GXutil.nullDate() );
      GXv_char16 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int18 = new byte[1] ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int19 = new short[1] ;
      P001N8_A3687DisParTxt = new String[] {""} ;
      P001N8_A396EmprCod = new String[] {""} ;
      P001N8_A361DisCod = new int[1] ;
      P001N8_A758ProCod = new String[] {""} ;
      P001N8_A368DisFasLin = new short[1] ;
      P001N8_A3685DisParVal = new String[] {""} ;
      P001N8_A3686DisParObs = new String[] {""} ;
      P001N8_A12672DisParVl2 = new String[] {""} ;
      P001N8_A13989DisParVMn = new String[] {""} ;
      P001N8_A13990DisParVMx = new String[] {""} ;
      P001N8_A6557DisParOrd = new short[1] ;
      P001N8_A14078DisParPLC = new String[] {""} ;
      P001N8_A1664ParFasCod = new short[1] ;
      A3687DisParTxt = "" ;
      A3685DisParVal = "" ;
      A3686DisParObs = "" ;
      A12672DisParVl2 = "" ;
      A13989DisParVMn = "" ;
      A13990DisParVMx = "" ;
      A14078DisParPLC = "" ;
      A3295BarParVal = "" ;
      A3296BarParObs = "" ;
      A3693BarParTxt = "" ;
      A9737BarValPar = "" ;
      A12671BarParVl2 = "" ;
      A13991BarParVMn = "" ;
      A13992BarParVMx = "" ;
      A14079BarParPLC = "" ;
      P001N10_A396EmprCod = new String[] {""} ;
      P001N10_A361DisCod = new int[1] ;
      P001N10_A758ProCod = new String[] {""} ;
      P001N10_A368DisFasLin = new short[1] ;
      P001N10_A5377DisQuiLin = new short[1] ;
      P001N10_A5378DisQuiNp = new short[1] ;
      P001N10_A5379DisQuiTp = new short[1] ;
      P001N10_A5380DisQuiRb = new short[1] ;
      P001N10_A764ProForCod = new String[] {""} ;
      A764ProForCod = "" ;
      W764ProForCod = "" ;
      A6599FasMaqPl = "" ;
      A6600FasFecPl = GXutil.nullDate() ;
      P001N12_A396EmprCod = new String[] {""} ;
      P001N12_A361DisCod = new int[1] ;
      P001N12_A758ProCod = new String[] {""} ;
      P001N12_A368DisFasLin = new short[1] ;
      P001N12_A7919Dta_Ordl = new short[1] ;
      P001N12_A7920Dta_CPQ = new String[] {""} ;
      P001N12_n7920Dta_CPQ = new boolean[] {false} ;
      P001N12_A7922Dta_ForFab = new String[] {""} ;
      P001N12_n7922Dta_ForFab = new boolean[] {false} ;
      P001N12_A7923Dta_Fortie = new short[1] ;
      P001N12_n7923Dta_Fortie = new boolean[] {false} ;
      P001N12_A7924Dta_ForTmx = new short[1] ;
      P001N12_n7924Dta_ForTmx = new boolean[] {false} ;
      P001N12_A7925Dta_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N12_n7925Dta_ForRb = new boolean[] {false} ;
      P001N12_A7926Dta_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N12_n7926Dta_ForPhx = new boolean[] {false} ;
      P001N12_A7927Dta_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N12_n7927Dta_ForPhn = new boolean[] {false} ;
      P001N12_A7928Dta_ForUli = new short[1] ;
      P001N12_n7928Dta_ForUli = new boolean[] {false} ;
      P001N12_A12112Dta_Nh2o = new short[1] ;
      P001N12_n12112Dta_Nh2o = new boolean[] {false} ;
      A7920Dta_CPQ = "" ;
      A7922Dta_ForFab = "" ;
      A7925Dta_ForRb = DecimalUtil.ZERO ;
      A7926Dta_ForPhx = DecimalUtil.ZERO ;
      A7927Dta_ForPhn = DecimalUtil.ZERO ;
      A7935Dtb_CPQ = "" ;
      A7937Dtb_ForFab = "" ;
      A7940Dtb_ForRb = DecimalUtil.ZERO ;
      A7941Dtb_ForPhx = DecimalUtil.ZERO ;
      A7942Dtb_ForPhn = DecimalUtil.ZERO ;
      A7877Dt_CPQ = "" ;
      A7879Dt_ForFab = "" ;
      A7882Dt_ForRb = DecimalUtil.ZERO ;
      A7883Dt_ForPhx = DecimalUtil.ZERO ;
      A7884Dt_ForPhn = DecimalUtil.ZERO ;
      P001N15_A396EmprCod = new String[] {""} ;
      P001N15_A361DisCod = new int[1] ;
      P001N15_A758ProCod = new String[] {""} ;
      P001N15_A368DisFasLin = new short[1] ;
      P001N15_A7919Dta_Ordl = new short[1] ;
      P001N15_A7929Dta_ForLin = new short[1] ;
      P001N15_A7930Dta_Prdnum = new String[] {""} ;
      P001N15_n7930Dta_Prdnum = new boolean[] {false} ;
      P001N15_A7932Dta_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N15_n7932Dta_Forcan = new boolean[] {false} ;
      P001N15_A8479Dta_clave1 = new String[] {""} ;
      P001N15_n8479Dta_clave1 = new boolean[] {false} ;
      P001N15_A8480Dta_clave2 = new String[] {""} ;
      P001N15_n8480Dta_clave2 = new boolean[] {false} ;
      P001N15_A490ForPrdUMe = new byte[1] ;
      P001N15_n490ForPrdUMe = new boolean[] {false} ;
      A7930Dta_Prdnum = "" ;
      A7932Dta_Forcan = DecimalUtil.ZERO ;
      A8479Dta_clave1 = "" ;
      A8480Dta_clave2 = "" ;
      A7945Dtb_Prdnum = "" ;
      A7947Dtb_Forcan = DecimalUtil.ZERO ;
      A8477Dtb_clave1 = "" ;
      A8478Dtb_clave2 = "" ;
      A7887Dt_Prdnum = "" ;
      A7889Dt_Forcan = DecimalUtil.ZERO ;
      A8473Dt_clave1 = "" ;
      A8474Dt_clave2 = "" ;
      AV100Pgmname = "" ;
      AV60Auxp = "" ;
      P001N18_A396EmprCod = new String[] {""} ;
      P001N18_A130BarCodPar = new String[] {""} ;
      P001N18_A132BarCodReo = new byte[1] ;
      P001N18_A129BarCod = new int[1] ;
      P001N18_A142BarDiaP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001N18_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P001N18_A118BarAcaQui = new String[] {""} ;
      A142BarDiaP = DecimalUtil.ZERO ;
      A157BarFecEnt = GXutil.nullDate() ;
      A118BarAcaQui = "" ;
      AV50ARTPROCOD = "" ;
      P001N20_A396EmprCod = new String[] {""} ;
      P001N20_A457FasCod = new String[] {""} ;
      P001N20_A758ProCod = new String[] {""} ;
      P001N20_A65ArtCod = new String[] {""} ;
      P001N20_A252CliCod = new int[1] ;
      P001N20_A4898ArtProCod = new String[] {""} ;
      P001N20_A4897ArtProLin = new short[1] ;
      A65ArtCod = "" ;
      A4898ArtProCod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pfasbar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pfasbar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pfasbar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfasbar__default(),
         new Object[] {
             new Object[] {
            P001N2_A396EmprCod, P001N2_A361DisCod, P001N2_A371DisFecEnt, P001N2_A252CliCod, P001N2_A335DisArtCod, P001N2_A2926DisPla
            }
            , new Object[] {
            P001N3_A396EmprCod, P001N3_A361DisCod, P001N3_A846UltFasLin, P001N3_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P001N5_A396EmprCod, P001N5_A361DisCod, P001N5_A758ProCod, P001N5_A368DisFasLin, P001N5_A6162SecCodF, P001N5_n6162SecCodF, P001N5_A457FasCod, P001N5_A460FasDsc, P001N5_A456FasActTin, P001N5_n456FasActTin,
            P001N5_A458FasCon, P001N5_n458FasCon, P001N5_A4299FasConPla, P001N5_n4299FasConPla, P001N5_A4639FasCara, P001N5_n4639FasCara, P001N5_A4286FasForMul, P001N5_n4286FasForMul, P001N5_A7600FasH2OReh, P001N5_n7600FasH2OReh,
            P001N5_A7391FasTpCost, P001N5_n7391FasTpCost, P001N5_A6881FasUnpLt, P001N5_n6881FasUnpLt, P001N5_A4649FasUltForL, P001N5_n4649FasUltForL, P001N5_A4903FasAcab, P001N5_n4903FasAcab, P001N5_A3793DisMaqPru, P001N5_n3793DisMaqPru,
            P001N5_A602MaqCod, P001N5_n602MaqCod, P001N5_A5368FasGral, P001N5_n5368FasGral, P001N5_A5376DisQuiUl, P001N5_A6011FasTip, P001N5_n6011FasTip, P001N5_A7915Disfastpp, P001N5_n7915Disfastpp, P001N5_A7917DisfasRb,
            P001N5_n7917DisfasRb, P001N5_A7916DisFasUpL, P001N5_n7916DisFasUpL, P001N5_A9841DisFasObs, P001N5_A7918Dta_UOrd, P001N5_n7918Dta_UOrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P001N8_A3687DisParTxt, P001N8_A396EmprCod, P001N8_A361DisCod, P001N8_A758ProCod, P001N8_A368DisFasLin, P001N8_A3685DisParVal, P001N8_A3686DisParObs, P001N8_A12672DisParVl2, P001N8_A13989DisParVMn, P001N8_A13990DisParVMx,
            P001N8_A6557DisParOrd, P001N8_A14078DisParPLC, P001N8_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P001N10_A396EmprCod, P001N10_A361DisCod, P001N10_A758ProCod, P001N10_A368DisFasLin, P001N10_A5377DisQuiLin, P001N10_A5378DisQuiNp, P001N10_A5379DisQuiTp, P001N10_A5380DisQuiRb, P001N10_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            P001N12_A396EmprCod, P001N12_A361DisCod, P001N12_A758ProCod, P001N12_A368DisFasLin, P001N12_A7919Dta_Ordl, P001N12_A7920Dta_CPQ, P001N12_n7920Dta_CPQ, P001N12_A7922Dta_ForFab, P001N12_n7922Dta_ForFab, P001N12_A7923Dta_Fortie,
            P001N12_n7923Dta_Fortie, P001N12_A7924Dta_ForTmx, P001N12_n7924Dta_ForTmx, P001N12_A7925Dta_ForRb, P001N12_n7925Dta_ForRb, P001N12_A7926Dta_ForPhx, P001N12_n7926Dta_ForPhx, P001N12_A7927Dta_ForPhn, P001N12_n7927Dta_ForPhn, P001N12_A7928Dta_ForUli,
            P001N12_n7928Dta_ForUli, P001N12_A12112Dta_Nh2o, P001N12_n12112Dta_Nh2o
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P001N15_A396EmprCod, P001N15_A361DisCod, P001N15_A758ProCod, P001N15_A368DisFasLin, P001N15_A7919Dta_Ordl, P001N15_A7929Dta_ForLin, P001N15_A7930Dta_Prdnum, P001N15_n7930Dta_Prdnum, P001N15_A7932Dta_Forcan, P001N15_n7932Dta_Forcan,
            P001N15_A8479Dta_clave1, P001N15_n8479Dta_clave1, P001N15_A8480Dta_clave2, P001N15_n8480Dta_clave2, P001N15_A490ForPrdUMe, P001N15_n490ForPrdUMe
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P001N18_A396EmprCod, P001N18_A130BarCodPar, P001N18_A132BarCodReo, P001N18_A129BarCod, P001N18_A142BarDiaP, P001N18_A157BarFecEnt, P001N18_A118BarAcaQui
            }
            , new Object[] {
            }
            , new Object[] {
            P001N20_A396EmprCod, P001N20_A457FasCod, P001N20_A758ProCod, P001N20_A65ArtCod, P001N20_A252CliCod, P001N20_A4898ArtProCod, P001N20_A4897ArtProLin
            }
         }
      );
      AV100Pgmname = "PFASBAR" ;
      /* GeneXus formulas. */
      AV100Pgmname = "PFASBAR" ;
      Gx_err = (short)(0) ;
   }

   private byte AV56Nocommit ;
   private byte AV29FlagMab ;
   private byte AV31Ecapi ;
   private byte AV36JBP ;
   private byte AV38Hss ;
   private byte AV39Flag_not ;
   private byte AV44FlagConFa ;
   private byte AV52Pizarro ;
   private byte AV43FechasFase ;
   private byte AV70Etm ;
   private byte AV73Acabats2013 ;
   private byte AV77ActDisfaslin ;
   private byte AV78Planing ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte GXv_int2[] ;
   private byte A7868Dt_Opr ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte A6555BarFasNPl ;
   private byte AV80Barfasest ;
   private byte GXv_int18[] ;
   private byte A6601FasOrdPl ;
   private byte A6602FasStPl ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private byte AV59Auxr ;
   private short AV84Fabricato ;
   private short AV85Eratex ;
   private short AV18LinFas ;
   private short A846UltFasLin ;
   private short A761ProFasLin ;
   private short Gx_err ;
   private short A368DisFasLin ;
   private short A7391FasTpCost ;
   private short A4649FasUltForL ;
   private short A5376DisQuiUl ;
   private short A7918Dta_UOrd ;
   private short AV61FasTpCost ;
   private short AV63FasUltForl ;
   private short AV41DISQUIUL ;
   private short AV49Artprolin ;
   private short AV76Disfaslin ;
   private short AV72Dta_UOrd ;
   private short A7870Dt_Orden ;
   private short A7875Dt_TpCost ;
   private short A7890Dt_UOrd ;
   private short A194BarOrdLin ;
   private short A5372FasQuiUl ;
   private short A7933Dtb_UOrd ;
   private short A8938BarfasPri2 ;
   private short GXv_int19[] ;
   private short A6557DisParOrd ;
   private short A1664ParFasCod ;
   private short A10257Itm_ord5 ;
   private short AV90fasqui ;
   private short A5377DisQuiLin ;
   private short A5378DisQuiNp ;
   private short A5379DisQuiTp ;
   private short A5380DisQuiRb ;
   private short A5371FasQuiLin ;
   private short A5373FasQuiNp ;
   private short A5374FasQuiTp ;
   private short A5375FasQuiRb ;
   private short A7919Dta_Ordl ;
   private short A7923Dta_Fortie ;
   private short A7924Dta_ForTmx ;
   private short A7928Dta_ForUli ;
   private short A12112Dta_Nh2o ;
   private short A7934Dtb_Ordl ;
   private short A7938Dtb_Fortie ;
   private short A7939Dtb_ForTmx ;
   private short A7943Dtb_ForUli ;
   private short A12111Dtb_Nh2o ;
   private short A7891Dt_Ordl ;
   private short A7880Dt_Fortie ;
   private short A7881Dt_ForTmx ;
   private short A7885Dt_ForUli ;
   private short A12110Dt_Nh2o ;
   private short A7929Dta_ForLin ;
   private short A7944Dtb_ForLin ;
   private short A7886Dt_ForLin ;
   private short A4897ArtProLin ;
   private int AV15DisCod ;
   private int AV16CodBar ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV46CliCod ;
   private int GX_INS14 ;
   private int A129BarCod ;
   private int GXv_int7[] ;
   private int GX_INS1099 ;
   private int A7867Dt_Op ;
   private int GX_INS15 ;
   private int A4638BarUltNlot ;
   private int A4022BarNumBot ;
   private int GXv_int15[] ;
   private int GX_INS475 ;
   private int GX_INS779 ;
   private int GX_INS1108 ;
   private int GX_INS1102 ;
   private int GX_INS1109 ;
   private int GX_INS1103 ;
   private long GXv_int17[] ;
   private java.math.BigDecimal AV23DecTot ;
   private java.math.BigDecimal AV24Resto ;
   private java.math.BigDecimal A6881FasUnpLt ;
   private java.math.BigDecimal A7915Disfastpp ;
   private java.math.BigDecimal A7917DisfasRb ;
   private java.math.BigDecimal A7916DisFasUpL ;
   private java.math.BigDecimal AV62FasUnpLt ;
   private java.math.BigDecimal AV20TieTeo ;
   private java.math.BigDecimal AV21Decalaje ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV55Disfastpp ;
   private java.math.BigDecimal AV53DisfasRb ;
   private java.math.BigDecimal AV54DisFasUpL ;
   private java.math.BigDecimal A7873Dt_Tpp ;
   private java.math.BigDecimal A7876Dt_UnpLt ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A7914BarfasRb ;
   private java.math.BigDecimal A7913BarfasUnpL ;
   private java.math.BigDecimal A7912Barfastpp ;
   private java.math.BigDecimal A7925Dta_ForRb ;
   private java.math.BigDecimal A7926Dta_ForPhx ;
   private java.math.BigDecimal A7927Dta_ForPhn ;
   private java.math.BigDecimal A7940Dtb_ForRb ;
   private java.math.BigDecimal A7941Dtb_ForPhx ;
   private java.math.BigDecimal A7942Dtb_ForPhn ;
   private java.math.BigDecimal A7882Dt_ForRb ;
   private java.math.BigDecimal A7883Dt_ForPhx ;
   private java.math.BigDecimal A7884Dt_ForPhn ;
   private java.math.BigDecimal A7932Dta_Forcan ;
   private java.math.BigDecimal A7947Dtb_Forcan ;
   private java.math.BigDecimal A7889Dt_Forcan ;
   private java.math.BigDecimal A142BarDiaP ;
   private String A396EmprCod ;
   private String AV66Station ;
   private String GXt_char3 ;
   private String AV67EmprNom ;
   private String AV68UsurCod ;
   private String scmdbuf ;
   private String A335DisArtCod ;
   private String A2926DisPla ;
   private String W396EmprCod ;
   private String AV47Disartcod ;
   private String AV65Displa ;
   private String A758ProCod ;
   private String AV74Procodin ;
   private String W758ProCod ;
   private String A130BarCodPar ;
   private String Gx_emsg ;
   private String AV57Baracaqui ;
   private String A6162SecCodF ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4299FasConPla ;
   private String A4639FasCara ;
   private String A4286FasForMul ;
   private String A7600FasH2OReh ;
   private String A4903FasAcab ;
   private String A3793DisMaqPru ;
   private String A602MaqCod ;
   private String A5368FasGral ;
   private String A6011FasTip ;
   private String AV17FasCod ;
   private String AV64fasdsc ;
   private String AV27FasActTin ;
   private String AV28FasCon ;
   private String AV33FasConPla ;
   private String AV34FasCara ;
   private String AV35FasForMul ;
   private String AV71FasH2Oreh ;
   private String AV37FasAcab ;
   private String AV51SecCodF ;
   private String AV45MaqCod ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String AV79T_c ;
   private String AV48Procod ;
   private String AV40FasGral ;
   private String AV42FasTip ;
   private String GXv_char12[] ;
   private String AV75MaqCodC ;
   private String GXv_char6[] ;
   private String A7869Dt_Opp ;
   private String A7871Dt_Fascod ;
   private String A7872Dt_FasDsc ;
   private String A7874Dt_H2OReh ;
   private String W457FasCod ;
   private String A603MaqCodBis ;
   private String A150BarFacTin ;
   private String A152BarFasCon ;
   private String A4287BarFasFor ;
   private String A4637BarFasCara ;
   private String A4021BarFasBot ;
   private String A4905BarFasAcab ;
   private String A5045BarFasAgr ;
   private String A5046BarFasPrp ;
   private String A5048BarFasUsu ;
   private String A5369BarFasGral ;
   private String A179BarLoc ;
   private String A4301BarFasCoP ;
   private String A6012BarFasTip ;
   private String A2327BarFasSer ;
   private String A5896BarMaqPlan ;
   private String A6173BarFasSec ;
   private String AV86Barfasdtialfa ;
   private String AV82Barfasdtfalfa ;
   private String AV83diaalfa ;
   private String AV87diaalfa2 ;
   private String AV89HoraIN ;
   private String GXv_char16[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String A3685DisParVal ;
   private String A3686DisParObs ;
   private String A12672DisParVl2 ;
   private String A13989DisParVMn ;
   private String A13990DisParVMx ;
   private String A3295BarParVal ;
   private String A3296BarParObs ;
   private String A9737BarValPar ;
   private String A12671BarParVl2 ;
   private String A13991BarParVMn ;
   private String A13992BarParVMx ;
   private String A14079BarParPLC ;
   private String A764ProForCod ;
   private String W764ProForCod ;
   private String A6599FasMaqPl ;
   private String A7920Dta_CPQ ;
   private String A7922Dta_ForFab ;
   private String A7935Dtb_CPQ ;
   private String A7937Dtb_ForFab ;
   private String A7877Dt_CPQ ;
   private String A7879Dt_ForFab ;
   private String A7930Dta_Prdnum ;
   private String A8479Dta_clave1 ;
   private String A8480Dta_clave2 ;
   private String A7945Dtb_Prdnum ;
   private String A8477Dtb_clave1 ;
   private String A8478Dtb_clave2 ;
   private String A7887Dt_Prdnum ;
   private String A8473Dt_clave1 ;
   private String A8474Dt_clave2 ;
   private String AV100Pgmname ;
   private String AV60Auxp ;
   private String A118BarAcaQui ;
   private String AV50ARTPROCOD ;
   private String A65ArtCod ;
   private String A4898ArtProCod ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV81Barfasdtf ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date AV30DisFecEnt ;
   private java.util.Date AV19FecTeo ;
   private java.util.Date GXv_date8[] ;
   private java.util.Date AV22FecFinPre ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A5047BarFasFPl ;
   private java.util.Date AV88DiaIn ;
   private java.util.Date A6600FasFecPl ;
   private java.util.Date A157BarFecEnt ;
   private boolean n761ProFasLin ;
   private boolean n6162SecCodF ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n4299FasConPla ;
   private boolean n4639FasCara ;
   private boolean n4286FasForMul ;
   private boolean n7600FasH2OReh ;
   private boolean n7391FasTpCost ;
   private boolean n6881FasUnpLt ;
   private boolean n4649FasUltForL ;
   private boolean n4903FasAcab ;
   private boolean n3793DisMaqPru ;
   private boolean n602MaqCod ;
   private boolean n5368FasGral ;
   private boolean n6011FasTip ;
   private boolean n7915Disfastpp ;
   private boolean n7917DisfasRb ;
   private boolean n7916DisFasUpL ;
   private boolean n7918Dta_UOrd ;
   private boolean returnInSub ;
   private boolean n7871Dt_Fascod ;
   private boolean n7872Dt_FasDsc ;
   private boolean n7873Dt_Tpp ;
   private boolean n7874Dt_H2OReh ;
   private boolean n7875Dt_TpCost ;
   private boolean n7876Dt_UnpLt ;
   private boolean n7890Dt_UOrd ;
   private boolean n4638BarUltNlot ;
   private boolean n5045BarFasAgr ;
   private boolean n5046BarFasPrp ;
   private boolean n5047BarFasFPl ;
   private boolean n5048BarFasUsu ;
   private boolean n5369BarFasGral ;
   private boolean n5372FasQuiUl ;
   private boolean n6012BarFasTip ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n7914BarfasRb ;
   private boolean n7913BarfasUnpL ;
   private boolean n7912Barfastpp ;
   private boolean n7933Dtb_UOrd ;
   private boolean n9842BarObsF ;
   private boolean n8938BarfasPri2 ;
   private boolean n2327BarFasSer ;
   private boolean n5896BarMaqPlan ;
   private boolean n6173BarFasSec ;
   private boolean n3693BarParTxt ;
   private boolean n7920Dta_CPQ ;
   private boolean n7922Dta_ForFab ;
   private boolean n7923Dta_Fortie ;
   private boolean n7924Dta_ForTmx ;
   private boolean n7925Dta_ForRb ;
   private boolean n7926Dta_ForPhx ;
   private boolean n7927Dta_ForPhn ;
   private boolean n7928Dta_ForUli ;
   private boolean n12112Dta_Nh2o ;
   private boolean n7935Dtb_CPQ ;
   private boolean n7937Dtb_ForFab ;
   private boolean n7938Dtb_Fortie ;
   private boolean n7939Dtb_ForTmx ;
   private boolean n7940Dtb_ForRb ;
   private boolean n7941Dtb_ForPhx ;
   private boolean n7942Dtb_ForPhn ;
   private boolean n7943Dtb_ForUli ;
   private boolean n12111Dtb_Nh2o ;
   private boolean n7877Dt_CPQ ;
   private boolean n7879Dt_ForFab ;
   private boolean n7880Dt_Fortie ;
   private boolean n7881Dt_ForTmx ;
   private boolean n7882Dt_ForRb ;
   private boolean n7883Dt_ForPhx ;
   private boolean n7884Dt_ForPhn ;
   private boolean n7885Dt_ForUli ;
   private boolean n12110Dt_Nh2o ;
   private boolean n7930Dta_Prdnum ;
   private boolean n7932Dta_Forcan ;
   private boolean n8479Dta_clave1 ;
   private boolean n8480Dta_clave2 ;
   private boolean n490ForPrdUMe ;
   private boolean n7945Dtb_Prdnum ;
   private boolean n7947Dtb_Forcan ;
   private boolean n8477Dtb_clave1 ;
   private boolean n8478Dtb_clave2 ;
   private boolean n7887Dt_Prdnum ;
   private boolean n7889Dt_Forcan ;
   private boolean n8473Dt_clave1 ;
   private boolean n8474Dt_clave2 ;
   private String A3687DisParTxt ;
   private String AV69Inc_obs ;
   private String A9841DisFasObs ;
   private String AV58DisFasobs ;
   private String A9842BarObsF ;
   private String A14078DisParPLC ;
   private String A3693BarParTxt ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P001N2_A396EmprCod ;
   private int[] P001N2_A361DisCod ;
   private java.util.Date[] P001N2_A371DisFecEnt ;
   private int[] P001N2_A252CliCod ;
   private String[] P001N2_A335DisArtCod ;
   private String[] P001N2_A2926DisPla ;
   private String[] P001N3_A396EmprCod ;
   private int[] P001N3_A361DisCod ;
   private short[] P001N3_A846UltFasLin ;
   private String[] P001N3_A758ProCod ;
   private String[] P001N5_A396EmprCod ;
   private int[] P001N5_A361DisCod ;
   private String[] P001N5_A758ProCod ;
   private short[] P001N5_A368DisFasLin ;
   private String[] P001N5_A6162SecCodF ;
   private boolean[] P001N5_n6162SecCodF ;
   private String[] P001N5_A457FasCod ;
   private String[] P001N5_A460FasDsc ;
   private String[] P001N5_A456FasActTin ;
   private boolean[] P001N5_n456FasActTin ;
   private String[] P001N5_A458FasCon ;
   private boolean[] P001N5_n458FasCon ;
   private String[] P001N5_A4299FasConPla ;
   private boolean[] P001N5_n4299FasConPla ;
   private String[] P001N5_A4639FasCara ;
   private boolean[] P001N5_n4639FasCara ;
   private String[] P001N5_A4286FasForMul ;
   private boolean[] P001N5_n4286FasForMul ;
   private String[] P001N5_A7600FasH2OReh ;
   private boolean[] P001N5_n7600FasH2OReh ;
   private short[] P001N5_A7391FasTpCost ;
   private boolean[] P001N5_n7391FasTpCost ;
   private java.math.BigDecimal[] P001N5_A6881FasUnpLt ;
   private boolean[] P001N5_n6881FasUnpLt ;
   private short[] P001N5_A4649FasUltForL ;
   private boolean[] P001N5_n4649FasUltForL ;
   private String[] P001N5_A4903FasAcab ;
   private boolean[] P001N5_n4903FasAcab ;
   private String[] P001N5_A3793DisMaqPru ;
   private boolean[] P001N5_n3793DisMaqPru ;
   private String[] P001N5_A602MaqCod ;
   private boolean[] P001N5_n602MaqCod ;
   private String[] P001N5_A5368FasGral ;
   private boolean[] P001N5_n5368FasGral ;
   private short[] P001N5_A5376DisQuiUl ;
   private String[] P001N5_A6011FasTip ;
   private boolean[] P001N5_n6011FasTip ;
   private java.math.BigDecimal[] P001N5_A7915Disfastpp ;
   private boolean[] P001N5_n7915Disfastpp ;
   private java.math.BigDecimal[] P001N5_A7917DisfasRb ;
   private boolean[] P001N5_n7917DisfasRb ;
   private java.math.BigDecimal[] P001N5_A7916DisFasUpL ;
   private boolean[] P001N5_n7916DisFasUpL ;
   private String[] P001N5_A9841DisFasObs ;
   private short[] P001N5_A7918Dta_UOrd ;
   private boolean[] P001N5_n7918Dta_UOrd ;
   private String[] P001N8_A3687DisParTxt ;
   private String[] P001N8_A396EmprCod ;
   private int[] P001N8_A361DisCod ;
   private String[] P001N8_A758ProCod ;
   private short[] P001N8_A368DisFasLin ;
   private String[] P001N8_A3685DisParVal ;
   private String[] P001N8_A3686DisParObs ;
   private String[] P001N8_A12672DisParVl2 ;
   private String[] P001N8_A13989DisParVMn ;
   private String[] P001N8_A13990DisParVMx ;
   private short[] P001N8_A6557DisParOrd ;
   private String[] P001N8_A14078DisParPLC ;
   private short[] P001N8_A1664ParFasCod ;
   private String[] P001N10_A396EmprCod ;
   private int[] P001N10_A361DisCod ;
   private String[] P001N10_A758ProCod ;
   private short[] P001N10_A368DisFasLin ;
   private short[] P001N10_A5377DisQuiLin ;
   private short[] P001N10_A5378DisQuiNp ;
   private short[] P001N10_A5379DisQuiTp ;
   private short[] P001N10_A5380DisQuiRb ;
   private String[] P001N10_A764ProForCod ;
   private String[] P001N12_A396EmprCod ;
   private int[] P001N12_A361DisCod ;
   private String[] P001N12_A758ProCod ;
   private short[] P001N12_A368DisFasLin ;
   private short[] P001N12_A7919Dta_Ordl ;
   private String[] P001N12_A7920Dta_CPQ ;
   private boolean[] P001N12_n7920Dta_CPQ ;
   private String[] P001N12_A7922Dta_ForFab ;
   private boolean[] P001N12_n7922Dta_ForFab ;
   private short[] P001N12_A7923Dta_Fortie ;
   private boolean[] P001N12_n7923Dta_Fortie ;
   private short[] P001N12_A7924Dta_ForTmx ;
   private boolean[] P001N12_n7924Dta_ForTmx ;
   private java.math.BigDecimal[] P001N12_A7925Dta_ForRb ;
   private boolean[] P001N12_n7925Dta_ForRb ;
   private java.math.BigDecimal[] P001N12_A7926Dta_ForPhx ;
   private boolean[] P001N12_n7926Dta_ForPhx ;
   private java.math.BigDecimal[] P001N12_A7927Dta_ForPhn ;
   private boolean[] P001N12_n7927Dta_ForPhn ;
   private short[] P001N12_A7928Dta_ForUli ;
   private boolean[] P001N12_n7928Dta_ForUli ;
   private short[] P001N12_A12112Dta_Nh2o ;
   private boolean[] P001N12_n12112Dta_Nh2o ;
   private String[] P001N15_A396EmprCod ;
   private int[] P001N15_A361DisCod ;
   private String[] P001N15_A758ProCod ;
   private short[] P001N15_A368DisFasLin ;
   private short[] P001N15_A7919Dta_Ordl ;
   private short[] P001N15_A7929Dta_ForLin ;
   private String[] P001N15_A7930Dta_Prdnum ;
   private boolean[] P001N15_n7930Dta_Prdnum ;
   private java.math.BigDecimal[] P001N15_A7932Dta_Forcan ;
   private boolean[] P001N15_n7932Dta_Forcan ;
   private String[] P001N15_A8479Dta_clave1 ;
   private boolean[] P001N15_n8479Dta_clave1 ;
   private String[] P001N15_A8480Dta_clave2 ;
   private boolean[] P001N15_n8480Dta_clave2 ;
   private byte[] P001N15_A490ForPrdUMe ;
   private boolean[] P001N15_n490ForPrdUMe ;
   private String[] P001N18_A396EmprCod ;
   private String[] P001N18_A130BarCodPar ;
   private byte[] P001N18_A132BarCodReo ;
   private int[] P001N18_A129BarCod ;
   private java.math.BigDecimal[] P001N18_A142BarDiaP ;
   private java.util.Date[] P001N18_A157BarFecEnt ;
   private String[] P001N18_A118BarAcaQui ;
   private String[] P001N20_A396EmprCod ;
   private String[] P001N20_A457FasCod ;
   private String[] P001N20_A758ProCod ;
   private String[] P001N20_A65ArtCod ;
   private int[] P001N20_A252CliCod ;
   private String[] P001N20_A4898ArtProCod ;
   private short[] P001N20_A4897ArtProLin ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pfasbar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pfasbar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pfasbar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pfasbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001N2", "SELECT EmprCod, DisCod, DisFecEnt, CliCod, DisArtCod, DisPla FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P001N3", "SELECT EmprCod, DisCod, UltFasLin, ProCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001N4", "INSERT INTO TXPBARPRO(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, ProFasLin) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
         ,new ForEachCursor("P001N5", "SELECT T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin, T2.SecCodF, T1.FasCod, T2.FasDsc, T2.FasActTin, T2.FasCon, T2.FasConPla, T2.FasCara, T2.FasForMul, T2.FasH2OReh, T2.FasTpCost, T2.FasUnpLt, T2.FasUltForL, T2.FasAcab, T1.DisMaqPru, T2.MaqCod, T2.FasGral, T1.DisQuiUl, T2.FasTip, T1.Disfastpp, T1.DisfasRb, T1.DisFasUpL, T1.DisFasObs, T1.Dta_UOrd FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001N6", "INSERT INTO TXPDT000(EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Fascod, Dt_FasDsc, Dt_Tpp, Dt_H2OReh, Dt_TpCost, Dt_UnpLt, Dt_UOrd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT000")
         ,new UpdateCursor("P001N7", "INSERT INTO TXPBARFAS(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFasEst, MaqCodBis, BarFacTin, BarFecTeo, BarTieTeo, BarLoc, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarFasCara, BarUltNlot, BarFasAcab, BarFasDTI, BarFasDTF, FasCod, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarMaqPlan, BarFasTip, BarFasSec, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarfasPri2, BarObsF, BarFasPri, BarFasSer, BarFecRea, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarFasKgm, BarFasMtr, BarNPzas, BarFasPzas, BarFasInc, BarFasKPr, BarFasPPr, BarFasKgT, BarFasMtT, BarFasCR, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarHdrO, BarObsB, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P001N8", "SELECT DisParTxt, EmprCod, DisCod, ProCod, DisFasLin, DisParVal, DisParObs, DisParVl2, DisParVMn, DisParVMx, DisParOrd, DisParPLC, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001N9", "INSERT INTO TXPBarPar(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod, BarParVal, BarParObs, BarParTxt, BarValPar, Itm_ord5, BarParVl2, BarParVMn, BarParVMx, BarParPLC) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBarPar")
         ,new ForEachCursor("P001N10", "SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin, DisQuiNp, DisQuiTp, DisQuiRb, ProForCod FROM TXPDISQUI WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001N11", "INSERT INTO TXPFASQUI(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin, ProForCod, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiObs, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, ' ', ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new ForEachCursor("P001N12", "SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_CPQ, Dta_ForFab, Dta_Fortie, Dta_ForTmx, Dta_ForRb, Dta_ForPhx, Dta_ForPhn, Dta_ForUli, Dta_Nh2o FROM TXPDT004 WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001N13", "INSERT INTO TXPDT005(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_CPQ, Dtb_ForFab, Dtb_Fortie, Dtb_ForTmx, Dtb_ForRb, Dtb_ForPhx, Dtb_ForPhn, Dtb_ForUli, Dtb_Nh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT005")
         ,new UpdateCursor("P001N14", "INSERT INTO TXPDT001(EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_CPQ, Dt_ForFab, Dt_Fortie, Dt_ForTmx, Dt_ForRb, Dt_ForPhx, Dt_ForPhn, Dt_ForUli, Dt_Nh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT001")
         ,new ForEachCursor("P001N15", "SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_ForLin, Dta_Prdnum, Dta_Forcan, Dta_clave1, Dta_clave2, ForPrdUMe FROM TXPDT0041 WHERE EmprCod = ? and DisCod = ? and ProCod = ? and DisFasLin = ? and Dta_Ordl = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl, Dta_ForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P001N16", "INSERT INTO TXPDT0051(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_ForLin, Dtb_Prdnum, ForPrdUMe, Dtb_Forcan, Dtb_clave1, Dtb_clave2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0051")
         ,new UpdateCursor("P001N17", "INSERT INTO TXPDT0011(EmprCod, Dt_Op, Dt_Opr, Dt_Opp, Dt_Orden, Dt_Ordl, Dt_ForLin, Dt_Prdnum, ForPrdUMe, Dt_Forcan, Dt_clave1, Dt_clave2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0011")
         ,new ForEachCursor("P001N18", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarDiaP, BarFecEnt, BarAcaQui FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P001N19", "UPDATE TXPBARCAD SET BarDiaP=?, BarFecEnt=?, BarAcaQui=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P001N20", "SELECT EmprCod, FasCod, ProCod, ArtCod, CliCod, ArtProCod, ArtProLin FROM TXPArtFor WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 28);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(21);
               ((String[]) buf[35])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(26);
               ((short[]) buf[44])[0] = rslt.getShort(27);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 12);
               ((String[]) buf[9])[0] = rslt.getString(10, 12);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getVarchar(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,1);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
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
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 4 :
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
            case 5 :
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
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(13, (String)parms[12], 10);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setString(17, (String)parms[16], 1);
               stmt.setString(18, (String)parms[17], 1);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[19]).intValue());
               }
               stmt.setString(20, (String)parms[20], 1);
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[22], false);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[24], false);
               }
               stmt.setString(23, (String)parms[25], 8);
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DATE );
               }
               else
               {
                  stmt.setDate(26, (java.util.Date)parms[31]);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[33], 8);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[39], 6);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[43], 2);
               }
               stmt.setByte(33, ((Number) parms[44]).byteValue());
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[52]).shortValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(38, ((Number) parms[54]).shortValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[56], 3000);
               }
               stmt.setByte(40, ((Number) parms[57]).byteValue());
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[59], 16);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
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
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setString(13, (String)parms[13], 12);
               stmt.setString(14, (String)parms[14], 12);
               stmt.setString(15, (String)parms[15], 12);
               stmt.setString(16, (String)parms[16], 100);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setString(12, (String)parms[11], 6);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[24]).shortValue());
               }
               return;
            case 12 :
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
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[23]).shortValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 5);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[15], 16);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[17], 30);
               }
               return;
            case 15 :
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
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 17 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 1);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

