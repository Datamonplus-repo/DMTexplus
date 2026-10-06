package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewfase extends GXProcedure
{
   public pnewfase( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewfase.class ), "" );
   }

   public pnewfase( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pnewfase.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pnewfase.this.AV16EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewfase.this.AV17BarCod = aP1[0];
      this.aP1 = aP1;
      pnewfase.this.AV18BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnewfase.this.AV19BarCodPar = aP3[0];
      this.aP3 = aP3;
      pnewfase.this.AV15ProCod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20UltLin = (short)(0) ;
      /* Using cursor P02653 */
      pr_default.execute(0, new Object[] {AV16EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02653_A130BarCodPar[0] ;
         A132BarCodReo = P02653_A132BarCodReo[0] ;
         A129BarCod = P02653_A129BarCod[0] ;
         A396EmprCod = P02653_A396EmprCod[0] ;
         A252CliCod = P02653_A252CliCod[0] ;
         n252CliCod = P02653_n252CliCod[0] ;
         A2010BarTipDis = P02653_A2010BarTipDis[0] ;
         A628MaxOrdFas = P02653_A628MaxOrdFas[0] ;
         n628MaxOrdFas = P02653_n628MaxOrdFas[0] ;
         A628MaxOrdFas = P02653_A628MaxOrdFas[0] ;
         n628MaxOrdFas = P02653_n628MaxOrdFas[0] ;
         AV20UltLin = A628MaxOrdFas ;
         AV30CliCod = A252CliCod ;
         AV31BarTipDis = A2010BarTipDis ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Pnewfase.Creamos registro en BARFAS...F(PROLIN)", "") );
      /* Using cursor P02654 */
      pr_default.execute(1, new Object[] {AV16EmprCod, AV15ProCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A774ProNumLin = P02654_A774ProNumLin[0] ;
         A602MaqCod = P02654_A602MaqCod[0] ;
         n602MaqCod = P02654_n602MaqCod[0] ;
         A456FasActTin = P02654_A456FasActTin[0] ;
         n456FasActTin = P02654_n456FasActTin[0] ;
         A458FasCon = P02654_A458FasCon[0] ;
         n458FasCon = P02654_n458FasCon[0] ;
         A4286FasForMul = P02654_A4286FasForMul[0] ;
         n4286FasForMul = P02654_n4286FasForMul[0] ;
         A4639FasCara = P02654_A4639FasCara[0] ;
         n4639FasCara = P02654_n4639FasCara[0] ;
         A4299FasConPla = P02654_A4299FasConPla[0] ;
         n4299FasConPla = P02654_n4299FasConPla[0] ;
         A4903FasAcab = P02654_A4903FasAcab[0] ;
         n4903FasAcab = P02654_n4903FasAcab[0] ;
         A5368FasGral = P02654_A5368FasGral[0] ;
         n5368FasGral = P02654_n5368FasGral[0] ;
         A6011FasTip = P02654_A6011FasTip[0] ;
         n6011FasTip = P02654_n6011FasTip[0] ;
         A6162SecCodF = P02654_A6162SecCodF[0] ;
         n6162SecCodF = P02654_n6162SecCodF[0] ;
         A758ProCod = P02654_A758ProCod[0] ;
         A396EmprCod = P02654_A396EmprCod[0] ;
         A457FasCod = P02654_A457FasCod[0] ;
         n457FasCod = P02654_n457FasCod[0] ;
         A602MaqCod = P02654_A602MaqCod[0] ;
         n602MaqCod = P02654_n602MaqCod[0] ;
         A456FasActTin = P02654_A456FasActTin[0] ;
         n456FasActTin = P02654_n456FasActTin[0] ;
         A458FasCon = P02654_A458FasCon[0] ;
         n458FasCon = P02654_n458FasCon[0] ;
         A4286FasForMul = P02654_A4286FasForMul[0] ;
         n4286FasForMul = P02654_n4286FasForMul[0] ;
         A4639FasCara = P02654_A4639FasCara[0] ;
         n4639FasCara = P02654_n4639FasCara[0] ;
         A4299FasConPla = P02654_A4299FasConPla[0] ;
         n4299FasConPla = P02654_n4299FasConPla[0] ;
         A4903FasAcab = P02654_A4903FasAcab[0] ;
         n4903FasAcab = P02654_n4903FasAcab[0] ;
         A5368FasGral = P02654_A5368FasGral[0] ;
         n5368FasGral = P02654_n5368FasGral[0] ;
         A6011FasTip = P02654_A6011FasTip[0] ;
         n6011FasTip = P02654_n6011FasTip[0] ;
         A6162SecCodF = P02654_A6162SecCodF[0] ;
         n6162SecCodF = P02654_n6162SecCodF[0] ;
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         AV20UltLin = (short)(AV20UltLin+100) ;
         AV21FasCod = A457FasCod ;
         AV22ProNumLin = A774ProNumLin ;
         /*
            INSERT RECORD ON TABLE TXPBARFAS

         */
         W396EmprCod = A396EmprCod ;
         W758ProCod = A758ProCod ;
         W457FasCod = A457FasCod ;
         n457FasCod = false ;
         A396EmprCod = AV16EmprCod ;
         A129BarCod = AV17BarCod ;
         A132BarCodReo = AV18BarCodReo ;
         A130BarCodPar = AV19BarCodPar ;
         A758ProCod = AV15ProCod ;
         A194BarOrdLin = AV20UltLin ;
         A457FasCod = AV21FasCod ;
         n457FasCod = false ;
         A603MaqCodBis = A602MaqCod ;
         A150BarFacTin = A456FasActTin ;
         A152BarFasCon = A458FasCon ;
         A4287BarFasFor = A4286FasForMul ;
         A4637BarFasCara = A4639FasCara ;
         A4301BarFasCoP = A4299FasConPla ;
         A4905BarFasAcab = A4903FasAcab ;
         A4638BarUltNlot = 0 ;
         n4638BarUltNlot = false ;
         A4021BarFasBot = GXutil.space( (short)(1)) ;
         A4022BarNumBot = 0 ;
         A5369BarFasGral = A5368FasGral ;
         n5369BarFasGral = false ;
         A5047BarFasFPl = GXutil.nullDate() ;
         n5047BarFasFPl = false ;
         A5048BarFasUsu = GXutil.space( (short)(8)) ;
         n5048BarFasUsu = false ;
         A179BarLoc = "" ;
         A3836BarFasPri = (byte)(0) ;
         A5896BarMaqPlan = A602MaqCod ;
         n5896BarMaqPlan = false ;
         A4905BarFasAcab = A4903FasAcab ;
         A6012BarFasTip = A6011FasTip ;
         n6012BarFasTip = false ;
         A6173BarFasSec = A6162SecCodF ;
         n6173BarFasSec = false ;
         /* Using cursor P02655 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, A603MaqCodBis, A150BarFacTin, A179BarLoc, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, A4301BarFasCoP, A4637BarFasCara, Boolean.valueOf(n4638BarUltNlot), Integer.valueOf(A4638BarUltNlot), A4905BarFasAcab, Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n5047BarFasFPl), A5047BarFasFPl, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5896BarMaqPlan), A5896BarMaqPlan, Boolean.valueOf(n6012BarFasTip), A6012BarFasTip, Boolean.valueOf(n6173BarFasSec), A6173BarFasSec, Byte.valueOf(A3836BarFasPri)});
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
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         A457FasCod = W457FasCod ;
         n457FasCod = false ;
         /* End Insert */
         /* Using cursor P02656 */
         pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A7897Dtp_Ordl = P02656_A7897Dtp_Ordl[0] ;
            A7898Dtp_CPQ = P02656_A7898Dtp_CPQ[0] ;
            n7898Dtp_CPQ = P02656_n7898Dtp_CPQ[0] ;
            A7900Dtp_ForFab = P02656_A7900Dtp_ForFab[0] ;
            n7900Dtp_ForFab = P02656_n7900Dtp_ForFab[0] ;
            A7901Dtp_Fortie = P02656_A7901Dtp_Fortie[0] ;
            n7901Dtp_Fortie = P02656_n7901Dtp_Fortie[0] ;
            A7902Dtp_ForTmx = P02656_A7902Dtp_ForTmx[0] ;
            n7902Dtp_ForTmx = P02656_n7902Dtp_ForTmx[0] ;
            A7903Dtp_ForRb = P02656_A7903Dtp_ForRb[0] ;
            n7903Dtp_ForRb = P02656_n7903Dtp_ForRb[0] ;
            A7904Dtp_ForPhx = P02656_A7904Dtp_ForPhx[0] ;
            n7904Dtp_ForPhx = P02656_n7904Dtp_ForPhx[0] ;
            A7905Dtp_ForPhn = P02656_A7905Dtp_ForPhn[0] ;
            n7905Dtp_ForPhn = P02656_n7905Dtp_ForPhn[0] ;
            A7906Dtp_ForUli = P02656_A7906Dtp_ForUli[0] ;
            n7906Dtp_ForUli = P02656_n7906Dtp_ForUli[0] ;
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            /*
               INSERT RECORD ON TABLE TXPDT005

            */
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            A396EmprCod = AV16EmprCod ;
            A129BarCod = AV17BarCod ;
            A132BarCodReo = AV18BarCodReo ;
            A130BarCodPar = AV19BarCodPar ;
            A758ProCod = AV15ProCod ;
            A194BarOrdLin = AV20UltLin ;
            A7934Dtb_Ordl = A7897Dtp_Ordl ;
            A7935Dtb_CPQ = A7898Dtp_CPQ ;
            n7935Dtb_CPQ = false ;
            A7937Dtb_ForFab = A7900Dtp_ForFab ;
            n7937Dtb_ForFab = false ;
            A7938Dtb_Fortie = A7901Dtp_Fortie ;
            n7938Dtb_Fortie = false ;
            A7939Dtb_ForTmx = A7902Dtp_ForTmx ;
            n7939Dtb_ForTmx = false ;
            A7940Dtb_ForRb = A7903Dtp_ForRb ;
            n7940Dtb_ForRb = false ;
            A7941Dtb_ForPhx = A7904Dtp_ForPhx ;
            n7941Dtb_ForPhx = false ;
            A7942Dtb_ForPhn = A7905Dtp_ForPhn ;
            n7942Dtb_ForPhn = false ;
            A7943Dtb_ForUli = A7906Dtp_ForUli ;
            n7943Dtb_ForUli = false ;
            /* Using cursor P02657 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Boolean.valueOf(n7935Dtb_CPQ), A7935Dtb_CPQ, Boolean.valueOf(n7937Dtb_ForFab), A7937Dtb_ForFab, Boolean.valueOf(n7938Dtb_Fortie), Short.valueOf(A7938Dtb_Fortie), Boolean.valueOf(n7939Dtb_ForTmx), Short.valueOf(A7939Dtb_ForTmx), Boolean.valueOf(n7940Dtb_ForRb), A7940Dtb_ForRb, Boolean.valueOf(n7941Dtb_ForPhx), A7941Dtb_ForPhx, Boolean.valueOf(n7942Dtb_ForPhn), A7942Dtb_ForPhn, Boolean.valueOf(n7943Dtb_ForUli), Short.valueOf(A7943Dtb_ForUli)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT005");
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
            A758ProCod = W758ProCod ;
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPFASQUI

            */
            W396EmprCod = A396EmprCod ;
            W758ProCod = A758ProCod ;
            A396EmprCod = AV16EmprCod ;
            A129BarCod = AV17BarCod ;
            A132BarCodReo = AV18BarCodReo ;
            A130BarCodPar = AV19BarCodPar ;
            A758ProCod = AV15ProCod ;
            A194BarOrdLin = AV20UltLin ;
            A5371FasQuiLin = A7897Dtp_Ordl ;
            A764ProForCod = A7898Dtp_CPQ ;
            A5373FasQuiNp = (short)(0) ;
            A5374FasQuiTp = (short)(0) ;
            A5375FasQuiRb = (short)(DecimalUtil.decToDouble(A7903Dtp_ForRb)) ;
            /* Using cursor P02658 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin), A764ProForCod, Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
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
            /* End Insert */
            /* Using cursor P02659 */
            pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A7897Dtp_Ordl)});
            while ( (pr_default.getStatus(6) != 101) )
            {
               A7907Dtp_ForLin = P02659_A7907Dtp_ForLin[0] ;
               A7908Dtp_Prdnum = P02659_A7908Dtp_Prdnum[0] ;
               n7908Dtp_Prdnum = P02659_n7908Dtp_Prdnum[0] ;
               A7910Dtp_Forcan = P02659_A7910Dtp_Forcan[0] ;
               n7910Dtp_Forcan = P02659_n7910Dtp_Forcan[0] ;
               A8476Dtp_clave2 = P02659_A8476Dtp_clave2[0] ;
               n8476Dtp_clave2 = P02659_n8476Dtp_clave2[0] ;
               A8475Dtp_clave1 = P02659_A8475Dtp_clave1[0] ;
               n8475Dtp_clave1 = P02659_n8475Dtp_clave1[0] ;
               A490ForPrdUMe = P02659_A490ForPrdUMe[0] ;
               n490ForPrdUMe = P02659_n490ForPrdUMe[0] ;
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               /*
                  INSERT RECORD ON TABLE TXPDT0051

               */
               W396EmprCod = A396EmprCod ;
               W758ProCod = A758ProCod ;
               W490ForPrdUMe = A490ForPrdUMe ;
               n490ForPrdUMe = false ;
               A396EmprCod = AV16EmprCod ;
               A129BarCod = AV17BarCod ;
               A132BarCodReo = AV18BarCodReo ;
               A130BarCodPar = AV19BarCodPar ;
               A758ProCod = AV15ProCod ;
               A194BarOrdLin = AV20UltLin ;
               A7934Dtb_Ordl = A7897Dtp_Ordl ;
               A7944Dtb_ForLin = A7907Dtp_ForLin ;
               A7945Dtb_Prdnum = A7908Dtp_Prdnum ;
               n7945Dtb_Prdnum = false ;
               n490ForPrdUMe = false ;
               A7947Dtb_Forcan = A7910Dtp_Forcan ;
               n7947Dtb_Forcan = false ;
               A8478Dtb_clave2 = A8476Dtp_clave2 ;
               n8478Dtb_clave2 = false ;
               A8477Dtb_clave1 = A8475Dtp_clave1 ;
               n8477Dtb_clave1 = false ;
               /* Using cursor P026510 */
               pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A7934Dtb_Ordl), Short.valueOf(A7944Dtb_ForLin), Boolean.valueOf(n7945Dtb_Prdnum), A7945Dtb_Prdnum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Boolean.valueOf(n7947Dtb_Forcan), A7947Dtb_Forcan, Boolean.valueOf(n8477Dtb_clave1), A8477Dtb_clave1, Boolean.valueOf(n8478Dtb_clave2), A8478Dtb_clave2});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDT0051");
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
               A490ForPrdUMe = W490ForPrdUMe ;
               n490ForPrdUMe = false ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A758ProCod = W758ProCod ;
               pr_default.readNext(6);
            }
            pr_default.close(6);
            A396EmprCod = W396EmprCod ;
            A758ProCod = W758ProCod ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         A396EmprCod = W396EmprCod ;
         A758ProCod = W758ProCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      System.out.println( httpContext.getMessage( "Pnewfase.Fin registro en BARFAS...F(PROLIN)", "") );
      System.out.println( httpContext.getMessage( "Pnewfase.Lectura FASCLIE", "") );
      /* Using cursor P026511 */
      pr_default.execute(8, new Object[] {AV16EmprCod, Integer.valueOf(AV30CliCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A602MaqCod = P026511_A602MaqCod[0] ;
         n602MaqCod = P026511_n602MaqCod[0] ;
         A456FasActTin = P026511_A456FasActTin[0] ;
         n456FasActTin = P026511_n456FasActTin[0] ;
         A458FasCon = P026511_A458FasCon[0] ;
         n458FasCon = P026511_n458FasCon[0] ;
         A4286FasForMul = P026511_A4286FasForMul[0] ;
         n4286FasForMul = P026511_n4286FasForMul[0] ;
         A4639FasCara = P026511_A4639FasCara[0] ;
         n4639FasCara = P026511_n4639FasCara[0] ;
         A4299FasConPla = P026511_A4299FasConPla[0] ;
         n4299FasConPla = P026511_n4299FasConPla[0] ;
         A4903FasAcab = P026511_A4903FasAcab[0] ;
         n4903FasAcab = P026511_n4903FasAcab[0] ;
         A5368FasGral = P026511_A5368FasGral[0] ;
         n5368FasGral = P026511_n5368FasGral[0] ;
         A6011FasTip = P026511_A6011FasTip[0] ;
         n6011FasTip = P026511_n6011FasTip[0] ;
         A252CliCod = P026511_A252CliCod[0] ;
         n252CliCod = P026511_n252CliCod[0] ;
         A457FasCod = P026511_A457FasCod[0] ;
         n457FasCod = P026511_n457FasCod[0] ;
         A6016FasExpLin = P026511_A6016FasExpLin[0] ;
         A396EmprCod = P026511_A396EmprCod[0] ;
         A602MaqCod = P026511_A602MaqCod[0] ;
         n602MaqCod = P026511_n602MaqCod[0] ;
         A456FasActTin = P026511_A456FasActTin[0] ;
         n456FasActTin = P026511_n456FasActTin[0] ;
         A458FasCon = P026511_A458FasCon[0] ;
         n458FasCon = P026511_n458FasCon[0] ;
         A4286FasForMul = P026511_A4286FasForMul[0] ;
         n4286FasForMul = P026511_n4286FasForMul[0] ;
         A4639FasCara = P026511_A4639FasCara[0] ;
         n4639FasCara = P026511_n4639FasCara[0] ;
         A4299FasConPla = P026511_A4299FasConPla[0] ;
         n4299FasConPla = P026511_n4299FasConPla[0] ;
         A4903FasAcab = P026511_A4903FasAcab[0] ;
         n4903FasAcab = P026511_n4903FasAcab[0] ;
         A5368FasGral = P026511_A5368FasGral[0] ;
         n5368FasGral = P026511_n5368FasGral[0] ;
         A6011FasTip = P026511_A6011FasTip[0] ;
         n6011FasTip = P026511_n6011FasTip[0] ;
         W396EmprCod = A396EmprCod ;
         AV21FasCod = A457FasCod ;
         if ( GXutil.strcmp(AV31BarTipDis, A6011FasTip) == 0 )
         {
            AV20UltLin = (short)(AV20UltLin+100) ;
            /*
               INSERT RECORD ON TABLE TXPBARFAS

            */
            W396EmprCod = A396EmprCod ;
            W457FasCod = A457FasCod ;
            n457FasCod = false ;
            A396EmprCod = AV16EmprCod ;
            A129BarCod = AV17BarCod ;
            A132BarCodReo = AV18BarCodReo ;
            A130BarCodPar = AV19BarCodPar ;
            A758ProCod = AV15ProCod ;
            A194BarOrdLin = AV20UltLin ;
            A457FasCod = AV21FasCod ;
            n457FasCod = false ;
            A603MaqCodBis = A602MaqCod ;
            A150BarFacTin = A456FasActTin ;
            A152BarFasCon = A458FasCon ;
            A4287BarFasFor = A4286FasForMul ;
            A4637BarFasCara = A4639FasCara ;
            A4301BarFasCoP = A4299FasConPla ;
            A4905BarFasAcab = A4903FasAcab ;
            A4638BarUltNlot = 0 ;
            n4638BarUltNlot = false ;
            A4021BarFasBot = GXutil.space( (short)(1)) ;
            A4022BarNumBot = 0 ;
            A5369BarFasGral = A5368FasGral ;
            n5369BarFasGral = false ;
            A5047BarFasFPl = GXutil.nullDate() ;
            n5047BarFasFPl = false ;
            A5048BarFasUsu = GXutil.space( (short)(8)) ;
            n5048BarFasUsu = false ;
            A179BarLoc = "" ;
            A3836BarFasPri = (byte)(0) ;
            A5896BarMaqPlan = A602MaqCod ;
            n5896BarMaqPlan = false ;
            A4905BarFasAcab = A4903FasAcab ;
            A6012BarFasTip = A6011FasTip ;
            n6012BarFasTip = false ;
            /* Using cursor P026512 */
            pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, A603MaqCodBis, A150BarFacTin, A179BarLoc, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, A4301BarFasCoP, A4637BarFasCara, Boolean.valueOf(n4638BarUltNlot), Integer.valueOf(A4638BarUltNlot), A4905BarFasAcab, Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n5047BarFasFPl), A5047BarFasFPl, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5896BarMaqPlan), A5896BarMaqPlan, Boolean.valueOf(n6012BarFasTip), A6012BarFasTip, Byte.valueOf(A3836BarFasPri)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
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
            A457FasCod = W457FasCod ;
            n457FasCod = false ;
            /* End Insert */
         }
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
      System.out.println( httpContext.getMessage( "Pnewfase.Fin Lectura FASCLIE", "") );
      System.out.println( httpContext.getMessage( "Pnewfase.ACTUALIZO BARPRO", "") );
      n761ProFasLin = false ;
      /* Optimized UPDATE. */
      /* Using cursor P026513 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n761ProFasLin), Short.valueOf(AV20UltLin), AV16EmprCod, Integer.valueOf(AV17BarCod), Byte.valueOf(AV18BarCodReo), AV19BarCodPar, AV15ProCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
      /* End optimized UPDATE. */
      System.out.println( httpContext.getMessage( "Pnewfase.fINACTUALIZO BARPRO", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewfase.this.AV16EmprCod;
      this.aP1[0] = pnewfase.this.AV17BarCod;
      this.aP2[0] = pnewfase.this.AV18BarCodReo;
      this.aP3[0] = pnewfase.this.AV19BarCodPar;
      this.aP4[0] = pnewfase.this.AV15ProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewfase");
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
      P02653_A130BarCodPar = new String[] {""} ;
      P02653_A132BarCodReo = new byte[1] ;
      P02653_A129BarCod = new int[1] ;
      P02653_A396EmprCod = new String[] {""} ;
      P02653_A252CliCod = new int[1] ;
      P02653_n252CliCod = new boolean[] {false} ;
      P02653_A2010BarTipDis = new String[] {""} ;
      P02653_A628MaxOrdFas = new short[1] ;
      P02653_n628MaxOrdFas = new boolean[] {false} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A2010BarTipDis = "" ;
      AV31BarTipDis = "" ;
      P02654_A774ProNumLin = new short[1] ;
      P02654_A602MaqCod = new String[] {""} ;
      P02654_n602MaqCod = new boolean[] {false} ;
      P02654_A456FasActTin = new String[] {""} ;
      P02654_n456FasActTin = new boolean[] {false} ;
      P02654_A458FasCon = new String[] {""} ;
      P02654_n458FasCon = new boolean[] {false} ;
      P02654_A4286FasForMul = new String[] {""} ;
      P02654_n4286FasForMul = new boolean[] {false} ;
      P02654_A4639FasCara = new String[] {""} ;
      P02654_n4639FasCara = new boolean[] {false} ;
      P02654_A4299FasConPla = new String[] {""} ;
      P02654_n4299FasConPla = new boolean[] {false} ;
      P02654_A4903FasAcab = new String[] {""} ;
      P02654_n4903FasAcab = new boolean[] {false} ;
      P02654_A5368FasGral = new String[] {""} ;
      P02654_n5368FasGral = new boolean[] {false} ;
      P02654_A6011FasTip = new String[] {""} ;
      P02654_n6011FasTip = new boolean[] {false} ;
      P02654_A6162SecCodF = new String[] {""} ;
      P02654_n6162SecCodF = new boolean[] {false} ;
      P02654_A758ProCod = new String[] {""} ;
      P02654_A396EmprCod = new String[] {""} ;
      P02654_A457FasCod = new String[] {""} ;
      P02654_n457FasCod = new boolean[] {false} ;
      A602MaqCod = "" ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4286FasForMul = "" ;
      A4639FasCara = "" ;
      A4299FasConPla = "" ;
      A4903FasAcab = "" ;
      A5368FasGral = "" ;
      A6011FasTip = "" ;
      A6162SecCodF = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      W396EmprCod = "" ;
      W758ProCod = "" ;
      AV21FasCod = "" ;
      W457FasCod = "" ;
      A603MaqCodBis = "" ;
      A150BarFacTin = "" ;
      A152BarFasCon = "" ;
      A4287BarFasFor = "" ;
      A4637BarFasCara = "" ;
      A4301BarFasCoP = "" ;
      A4905BarFasAcab = "" ;
      A4021BarFasBot = "" ;
      A5369BarFasGral = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A5048BarFasUsu = "" ;
      A179BarLoc = "" ;
      A5896BarMaqPlan = "" ;
      A6012BarFasTip = "" ;
      A6173BarFasSec = "" ;
      Gx_emsg = "" ;
      P02656_A396EmprCod = new String[] {""} ;
      P02656_A758ProCod = new String[] {""} ;
      P02656_A774ProNumLin = new short[1] ;
      P02656_A7897Dtp_Ordl = new short[1] ;
      P02656_A7898Dtp_CPQ = new String[] {""} ;
      P02656_n7898Dtp_CPQ = new boolean[] {false} ;
      P02656_A7900Dtp_ForFab = new String[] {""} ;
      P02656_n7900Dtp_ForFab = new boolean[] {false} ;
      P02656_A7901Dtp_Fortie = new short[1] ;
      P02656_n7901Dtp_Fortie = new boolean[] {false} ;
      P02656_A7902Dtp_ForTmx = new short[1] ;
      P02656_n7902Dtp_ForTmx = new boolean[] {false} ;
      P02656_A7903Dtp_ForRb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02656_n7903Dtp_ForRb = new boolean[] {false} ;
      P02656_A7904Dtp_ForPhx = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02656_n7904Dtp_ForPhx = new boolean[] {false} ;
      P02656_A7905Dtp_ForPhn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02656_n7905Dtp_ForPhn = new boolean[] {false} ;
      P02656_A7906Dtp_ForUli = new short[1] ;
      P02656_n7906Dtp_ForUli = new boolean[] {false} ;
      A7898Dtp_CPQ = "" ;
      A7900Dtp_ForFab = "" ;
      A7903Dtp_ForRb = DecimalUtil.ZERO ;
      A7904Dtp_ForPhx = DecimalUtil.ZERO ;
      A7905Dtp_ForPhn = DecimalUtil.ZERO ;
      A7935Dtb_CPQ = "" ;
      A7937Dtb_ForFab = "" ;
      A7940Dtb_ForRb = DecimalUtil.ZERO ;
      A7941Dtb_ForPhx = DecimalUtil.ZERO ;
      A7942Dtb_ForPhn = DecimalUtil.ZERO ;
      A764ProForCod = "" ;
      P02659_A396EmprCod = new String[] {""} ;
      P02659_A758ProCod = new String[] {""} ;
      P02659_A774ProNumLin = new short[1] ;
      P02659_A7897Dtp_Ordl = new short[1] ;
      P02659_A7907Dtp_ForLin = new short[1] ;
      P02659_A7908Dtp_Prdnum = new String[] {""} ;
      P02659_n7908Dtp_Prdnum = new boolean[] {false} ;
      P02659_A7910Dtp_Forcan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02659_n7910Dtp_Forcan = new boolean[] {false} ;
      P02659_A8476Dtp_clave2 = new String[] {""} ;
      P02659_n8476Dtp_clave2 = new boolean[] {false} ;
      P02659_A8475Dtp_clave1 = new String[] {""} ;
      P02659_n8475Dtp_clave1 = new boolean[] {false} ;
      P02659_A490ForPrdUMe = new byte[1] ;
      P02659_n490ForPrdUMe = new boolean[] {false} ;
      A7908Dtp_Prdnum = "" ;
      A7910Dtp_Forcan = DecimalUtil.ZERO ;
      A8476Dtp_clave2 = "" ;
      A8475Dtp_clave1 = "" ;
      A7945Dtb_Prdnum = "" ;
      A7947Dtb_Forcan = DecimalUtil.ZERO ;
      A8478Dtb_clave2 = "" ;
      A8477Dtb_clave1 = "" ;
      P026511_A602MaqCod = new String[] {""} ;
      P026511_n602MaqCod = new boolean[] {false} ;
      P026511_A456FasActTin = new String[] {""} ;
      P026511_n456FasActTin = new boolean[] {false} ;
      P026511_A458FasCon = new String[] {""} ;
      P026511_n458FasCon = new boolean[] {false} ;
      P026511_A4286FasForMul = new String[] {""} ;
      P026511_n4286FasForMul = new boolean[] {false} ;
      P026511_A4639FasCara = new String[] {""} ;
      P026511_n4639FasCara = new boolean[] {false} ;
      P026511_A4299FasConPla = new String[] {""} ;
      P026511_n4299FasConPla = new boolean[] {false} ;
      P026511_A4903FasAcab = new String[] {""} ;
      P026511_n4903FasAcab = new boolean[] {false} ;
      P026511_A5368FasGral = new String[] {""} ;
      P026511_n5368FasGral = new boolean[] {false} ;
      P026511_A6011FasTip = new String[] {""} ;
      P026511_n6011FasTip = new boolean[] {false} ;
      P026511_A252CliCod = new int[1] ;
      P026511_n252CliCod = new boolean[] {false} ;
      P026511_A457FasCod = new String[] {""} ;
      P026511_n457FasCod = new boolean[] {false} ;
      P026511_A6016FasExpLin = new short[1] ;
      P026511_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewfase__default(),
         new Object[] {
             new Object[] {
            P02653_A130BarCodPar, P02653_A132BarCodReo, P02653_A129BarCod, P02653_A396EmprCod, P02653_A252CliCod, P02653_n252CliCod, P02653_A2010BarTipDis, P02653_A628MaxOrdFas, P02653_n628MaxOrdFas
            }
            , new Object[] {
            P02654_A774ProNumLin, P02654_A602MaqCod, P02654_n602MaqCod, P02654_A456FasActTin, P02654_n456FasActTin, P02654_A458FasCon, P02654_n458FasCon, P02654_A4286FasForMul, P02654_n4286FasForMul, P02654_A4639FasCara,
            P02654_n4639FasCara, P02654_A4299FasConPla, P02654_n4299FasConPla, P02654_A4903FasAcab, P02654_n4903FasAcab, P02654_A5368FasGral, P02654_n5368FasGral, P02654_A6011FasTip, P02654_n6011FasTip, P02654_A6162SecCodF,
            P02654_n6162SecCodF, P02654_A758ProCod, P02654_A396EmprCod, P02654_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02656_A396EmprCod, P02656_A758ProCod, P02656_A774ProNumLin, P02656_A7897Dtp_Ordl, P02656_A7898Dtp_CPQ, P02656_n7898Dtp_CPQ, P02656_A7900Dtp_ForFab, P02656_n7900Dtp_ForFab, P02656_A7901Dtp_Fortie, P02656_n7901Dtp_Fortie,
            P02656_A7902Dtp_ForTmx, P02656_n7902Dtp_ForTmx, P02656_A7903Dtp_ForRb, P02656_n7903Dtp_ForRb, P02656_A7904Dtp_ForPhx, P02656_n7904Dtp_ForPhx, P02656_A7905Dtp_ForPhn, P02656_n7905Dtp_ForPhn, P02656_A7906Dtp_ForUli, P02656_n7906Dtp_ForUli
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P02659_A396EmprCod, P02659_A758ProCod, P02659_A774ProNumLin, P02659_A7897Dtp_Ordl, P02659_A7907Dtp_ForLin, P02659_A7908Dtp_Prdnum, P02659_n7908Dtp_Prdnum, P02659_A7910Dtp_Forcan, P02659_n7910Dtp_Forcan, P02659_A8476Dtp_clave2,
            P02659_n8476Dtp_clave2, P02659_A8475Dtp_clave1, P02659_n8475Dtp_clave1, P02659_A490ForPrdUMe, P02659_n490ForPrdUMe
            }
            , new Object[] {
            }
            , new Object[] {
            P026511_A602MaqCod, P026511_n602MaqCod, P026511_A456FasActTin, P026511_n456FasActTin, P026511_A458FasCon, P026511_n458FasCon, P026511_A4286FasForMul, P026511_n4286FasForMul, P026511_A4639FasCara, P026511_n4639FasCara,
            P026511_A4299FasConPla, P026511_n4299FasConPla, P026511_A4903FasAcab, P026511_n4903FasAcab, P026511_A5368FasGral, P026511_n5368FasGral, P026511_A6011FasTip, P026511_n6011FasTip, P026511_A252CliCod, P026511_A457FasCod,
            P026511_n457FasCod, P026511_A6016FasExpLin, P026511_A396EmprCod
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

   private byte AV18BarCodReo ;
   private byte A132BarCodReo ;
   private byte A3836BarFasPri ;
   private byte A490ForPrdUMe ;
   private byte W490ForPrdUMe ;
   private short AV20UltLin ;
   private short A628MaxOrdFas ;
   private short A774ProNumLin ;
   private short AV22ProNumLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private short A7897Dtp_Ordl ;
   private short A7901Dtp_Fortie ;
   private short A7902Dtp_ForTmx ;
   private short A7906Dtp_ForUli ;
   private short A7934Dtb_Ordl ;
   private short A7938Dtb_Fortie ;
   private short A7939Dtb_ForTmx ;
   private short A7943Dtb_ForUli ;
   private short A5371FasQuiLin ;
   private short A5373FasQuiNp ;
   private short A5374FasQuiTp ;
   private short A5375FasQuiRb ;
   private short A7907Dtp_ForLin ;
   private short A7944Dtb_ForLin ;
   private short A6016FasExpLin ;
   private short A761ProFasLin ;
   private int AV17BarCod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV30CliCod ;
   private int GX_INS15 ;
   private int A4638BarUltNlot ;
   private int A4022BarNumBot ;
   private int GX_INS1108 ;
   private int GX_INS779 ;
   private int GX_INS1109 ;
   private java.math.BigDecimal A7903Dtp_ForRb ;
   private java.math.BigDecimal A7904Dtp_ForPhx ;
   private java.math.BigDecimal A7905Dtp_ForPhn ;
   private java.math.BigDecimal A7940Dtb_ForRb ;
   private java.math.BigDecimal A7941Dtb_ForPhx ;
   private java.math.BigDecimal A7942Dtb_ForPhn ;
   private java.math.BigDecimal A7910Dtp_Forcan ;
   private java.math.BigDecimal A7947Dtb_Forcan ;
   private String AV16EmprCod ;
   private String AV19BarCodPar ;
   private String AV15ProCod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A2010BarTipDis ;
   private String AV31BarTipDis ;
   private String A602MaqCod ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4286FasForMul ;
   private String A4639FasCara ;
   private String A4299FasConPla ;
   private String A4903FasAcab ;
   private String A5368FasGral ;
   private String A6011FasTip ;
   private String A6162SecCodF ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String W396EmprCod ;
   private String W758ProCod ;
   private String AV21FasCod ;
   private String W457FasCod ;
   private String A603MaqCodBis ;
   private String A150BarFacTin ;
   private String A152BarFasCon ;
   private String A4287BarFasFor ;
   private String A4637BarFasCara ;
   private String A4301BarFasCoP ;
   private String A4905BarFasAcab ;
   private String A4021BarFasBot ;
   private String A5369BarFasGral ;
   private String A5048BarFasUsu ;
   private String A179BarLoc ;
   private String A5896BarMaqPlan ;
   private String A6012BarFasTip ;
   private String A6173BarFasSec ;
   private String Gx_emsg ;
   private String A7898Dtp_CPQ ;
   private String A7900Dtp_ForFab ;
   private String A7935Dtb_CPQ ;
   private String A7937Dtb_ForFab ;
   private String A764ProForCod ;
   private String A7908Dtp_Prdnum ;
   private String A8476Dtp_clave2 ;
   private String A8475Dtp_clave1 ;
   private String A7945Dtb_Prdnum ;
   private String A8478Dtb_clave2 ;
   private String A8477Dtb_clave1 ;
   private java.util.Date A5047BarFasFPl ;
   private boolean n252CliCod ;
   private boolean n628MaxOrdFas ;
   private boolean n602MaqCod ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n4286FasForMul ;
   private boolean n4639FasCara ;
   private boolean n4299FasConPla ;
   private boolean n4903FasAcab ;
   private boolean n5368FasGral ;
   private boolean n6011FasTip ;
   private boolean n6162SecCodF ;
   private boolean n457FasCod ;
   private boolean n4638BarUltNlot ;
   private boolean n5369BarFasGral ;
   private boolean n5047BarFasFPl ;
   private boolean n5048BarFasUsu ;
   private boolean n5896BarMaqPlan ;
   private boolean n6012BarFasTip ;
   private boolean n6173BarFasSec ;
   private boolean n7898Dtp_CPQ ;
   private boolean n7900Dtp_ForFab ;
   private boolean n7901Dtp_Fortie ;
   private boolean n7902Dtp_ForTmx ;
   private boolean n7903Dtp_ForRb ;
   private boolean n7904Dtp_ForPhx ;
   private boolean n7905Dtp_ForPhn ;
   private boolean n7906Dtp_ForUli ;
   private boolean n7935Dtb_CPQ ;
   private boolean n7937Dtb_ForFab ;
   private boolean n7938Dtb_Fortie ;
   private boolean n7939Dtb_ForTmx ;
   private boolean n7940Dtb_ForRb ;
   private boolean n7941Dtb_ForPhx ;
   private boolean n7942Dtb_ForPhn ;
   private boolean n7943Dtb_ForUli ;
   private boolean n7908Dtp_Prdnum ;
   private boolean n7910Dtp_Forcan ;
   private boolean n8476Dtp_clave2 ;
   private boolean n8475Dtp_clave1 ;
   private boolean n490ForPrdUMe ;
   private boolean n7945Dtb_Prdnum ;
   private boolean n7947Dtb_Forcan ;
   private boolean n8478Dtb_clave2 ;
   private boolean n8477Dtb_clave1 ;
   private boolean n761ProFasLin ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02653_A130BarCodPar ;
   private byte[] P02653_A132BarCodReo ;
   private int[] P02653_A129BarCod ;
   private String[] P02653_A396EmprCod ;
   private int[] P02653_A252CliCod ;
   private boolean[] P02653_n252CliCod ;
   private String[] P02653_A2010BarTipDis ;
   private short[] P02653_A628MaxOrdFas ;
   private boolean[] P02653_n628MaxOrdFas ;
   private short[] P02654_A774ProNumLin ;
   private String[] P02654_A602MaqCod ;
   private boolean[] P02654_n602MaqCod ;
   private String[] P02654_A456FasActTin ;
   private boolean[] P02654_n456FasActTin ;
   private String[] P02654_A458FasCon ;
   private boolean[] P02654_n458FasCon ;
   private String[] P02654_A4286FasForMul ;
   private boolean[] P02654_n4286FasForMul ;
   private String[] P02654_A4639FasCara ;
   private boolean[] P02654_n4639FasCara ;
   private String[] P02654_A4299FasConPla ;
   private boolean[] P02654_n4299FasConPla ;
   private String[] P02654_A4903FasAcab ;
   private boolean[] P02654_n4903FasAcab ;
   private String[] P02654_A5368FasGral ;
   private boolean[] P02654_n5368FasGral ;
   private String[] P02654_A6011FasTip ;
   private boolean[] P02654_n6011FasTip ;
   private String[] P02654_A6162SecCodF ;
   private boolean[] P02654_n6162SecCodF ;
   private String[] P02654_A758ProCod ;
   private String[] P02654_A396EmprCod ;
   private String[] P02654_A457FasCod ;
   private boolean[] P02654_n457FasCod ;
   private String[] P02656_A396EmprCod ;
   private String[] P02656_A758ProCod ;
   private short[] P02656_A774ProNumLin ;
   private short[] P02656_A7897Dtp_Ordl ;
   private String[] P02656_A7898Dtp_CPQ ;
   private boolean[] P02656_n7898Dtp_CPQ ;
   private String[] P02656_A7900Dtp_ForFab ;
   private boolean[] P02656_n7900Dtp_ForFab ;
   private short[] P02656_A7901Dtp_Fortie ;
   private boolean[] P02656_n7901Dtp_Fortie ;
   private short[] P02656_A7902Dtp_ForTmx ;
   private boolean[] P02656_n7902Dtp_ForTmx ;
   private java.math.BigDecimal[] P02656_A7903Dtp_ForRb ;
   private boolean[] P02656_n7903Dtp_ForRb ;
   private java.math.BigDecimal[] P02656_A7904Dtp_ForPhx ;
   private boolean[] P02656_n7904Dtp_ForPhx ;
   private java.math.BigDecimal[] P02656_A7905Dtp_ForPhn ;
   private boolean[] P02656_n7905Dtp_ForPhn ;
   private short[] P02656_A7906Dtp_ForUli ;
   private boolean[] P02656_n7906Dtp_ForUli ;
   private String[] P02659_A396EmprCod ;
   private String[] P02659_A758ProCod ;
   private short[] P02659_A774ProNumLin ;
   private short[] P02659_A7897Dtp_Ordl ;
   private short[] P02659_A7907Dtp_ForLin ;
   private String[] P02659_A7908Dtp_Prdnum ;
   private boolean[] P02659_n7908Dtp_Prdnum ;
   private java.math.BigDecimal[] P02659_A7910Dtp_Forcan ;
   private boolean[] P02659_n7910Dtp_Forcan ;
   private String[] P02659_A8476Dtp_clave2 ;
   private boolean[] P02659_n8476Dtp_clave2 ;
   private String[] P02659_A8475Dtp_clave1 ;
   private boolean[] P02659_n8475Dtp_clave1 ;
   private byte[] P02659_A490ForPrdUMe ;
   private boolean[] P02659_n490ForPrdUMe ;
   private String[] P026511_A602MaqCod ;
   private boolean[] P026511_n602MaqCod ;
   private String[] P026511_A456FasActTin ;
   private boolean[] P026511_n456FasActTin ;
   private String[] P026511_A458FasCon ;
   private boolean[] P026511_n458FasCon ;
   private String[] P026511_A4286FasForMul ;
   private boolean[] P026511_n4286FasForMul ;
   private String[] P026511_A4639FasCara ;
   private boolean[] P026511_n4639FasCara ;
   private String[] P026511_A4299FasConPla ;
   private boolean[] P026511_n4299FasConPla ;
   private String[] P026511_A4903FasAcab ;
   private boolean[] P026511_n4903FasAcab ;
   private String[] P026511_A5368FasGral ;
   private boolean[] P026511_n5368FasGral ;
   private String[] P026511_A6011FasTip ;
   private boolean[] P026511_n6011FasTip ;
   private int[] P026511_A252CliCod ;
   private boolean[] P026511_n252CliCod ;
   private String[] P026511_A457FasCod ;
   private boolean[] P026511_n457FasCod ;
   private short[] P026511_A6016FasExpLin ;
   private String[] P026511_A396EmprCod ;
}

final  class pnewfase__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02653", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T1.BarTipDis, COALESCE( T2.MaxOrdFas, 0) AS MaxOrdFas FROM (TXPBARCAD T1 LEFT JOIN (SELECT MAX(BarOrdLin) AS MaxOrdFas, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarOrdLin > 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02654", "SELECT T1.ProNumLin, T2.MaqCod, T2.FasActTin, T2.FasCon, T2.FasForMul, T2.FasCara, T2.FasConPla, T2.FasAcab, T2.FasGral, T2.FasTip, T2.SecCodF, T1.ProCod, T1.EmprCod, T1.FasCod FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02655", "INSERT INTO TXPBARFAS(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, MaqCodBis, BarFacTin, BarLoc, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarFasCara, BarUltNlot, BarFasAcab, FasCod, BarFasFPl, BarFasUsu, BarFasGral, BarMaqPlan, BarFasTip, BarFasSec, BarFasPri, BarFasEst, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarFasKgm, BarFasMtr, BarNPzas, BarFasPzas, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, FasQuiUl, BarFasKgT, BarFasMtT, BarFasCR, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P02656", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_CPQ, Dtp_ForFab, Dtp_Fortie, Dtp_ForTmx, Dtp_ForRb, Dtp_ForPhx, Dtp_ForPhn, Dtp_ForUli FROM TXPDT002 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02657", "INSERT INTO TXPDT005(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_CPQ, Dtb_ForFab, Dtb_Fortie, Dtb_ForTmx, Dtb_ForRb, Dtb_ForPhx, Dtb_ForPhn, Dtb_ForUli, Dtb_Nh2o) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT005")
         ,new UpdateCursor("P02658", "INSERT INTO TXPFASQUI(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin, ProForCod, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiObs, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new ForEachCursor("P02659", "SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin, Dtp_Prdnum, Dtp_Forcan, Dtp_clave2, Dtp_clave1, ForPrdUMe FROM TXPDT0021 WHERE EmprCod = ? and ProCod = ? and ProNumLin = ? and Dtp_Ordl = ? ORDER BY EmprCod, ProCod, ProNumLin, Dtp_Ordl, Dtp_ForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P026510", "INSERT INTO TXPDT0051(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl, Dtb_ForLin, Dtb_Prdnum, ForPrdUMe, Dtb_Forcan, Dtb_clave1, Dtb_clave2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDT0051")
         ,new ForEachCursor("P026511", "SELECT T2.MaqCod, T2.FasActTin, T2.FasCon, T2.FasForMul, T2.FasCara, T2.FasConPla, T2.FasAcab, T2.FasGral, T2.FasTip, T1.CliCod, T1.FasCod, T1.FasExpLin, T1.EmprCod FROM (TXPFASCLI T1 LEFT JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.FasExpLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P026512", "INSERT INTO TXPBARFAS(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, MaqCodBis, BarFacTin, BarLoc, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarFasCara, BarUltNlot, BarFasAcab, FasCod, BarFasFPl, BarFasUsu, BarFasGral, BarMaqPlan, BarFasTip, BarFasPri, BarFasEst, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarFasKgm, BarFasMtr, BarNPzas, BarFasPzas, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, FasQuiUl, BarFasKgT, BarFasMtT, BarFasCR, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new UpdateCursor("P026513", "UPDATE TXPBARPRO SET ProFasLin=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
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
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 8);
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               ((String[]) buf[23])[0] = rslt.getString(14, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(10);
               ((String[]) buf[19])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 10);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 1);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[16]).intValue());
               }
               stmt.setString(17, (String)parms[17], 1);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[19], 8);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DATE );
               }
               else
               {
                  stmt.setDate(19, (java.util.Date)parms[21]);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[23], 8);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[27], 6);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[31], 2);
               }
               stmt.setByte(25, ((Number) parms[32]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
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
               return;
            case 5 :
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
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 10);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 1);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[16]).intValue());
               }
               stmt.setString(17, (String)parms[17], 1);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[19], 8);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DATE );
               }
               else
               {
                  stmt.setDate(19, (java.util.Date)parms[21]);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[23], 8);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[27], 6);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[29], 1);
               }
               stmt.setByte(24, ((Number) parms[30]).byteValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               return;
      }
   }

}

