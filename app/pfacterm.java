package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pfacterm extends GXReport
{
   public pfacterm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacterm.class ), "" );
   }

   public pfacterm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pfacterm.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pfacterm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacterm.this.AV190FacCod = aP1[0];
      this.aP1 = aP1;
      pfacterm.this.AV191TextoCopia = aP2[0];
      this.aP2 = aP2;
      pfacterm.this.Gx_out = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 21 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 2, 1, 12240, 15840, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("FACTURA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*21)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV310Val1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIE000", ""), GXv_char2) ;
         pfacterm.this.GXt_char1 = GXv_char2[0] ;
         AV310Val1 = GXt_char1 ;
         GXt_char1 = AV311Val2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIE001", ""), GXv_char2) ;
         pfacterm.this.GXt_char1 = GXv_char2[0] ;
         AV311Val2 = GXt_char1 ;
         GXt_char1 = AV312Val3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIE002", ""), GXv_char2) ;
         pfacterm.this.GXt_char1 = GXv_char2[0] ;
         AV312Val3 = GXt_char1 ;
         GXt_char1 = AV313Val4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIE003", ""), GXv_char2) ;
         pfacterm.this.GXt_char1 = GXv_char2[0] ;
         AV313Val4 = GXt_char1 ;
         GXt_char1 = AV314Val5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PIE004", ""), GXv_char2) ;
         pfacterm.this.GXt_char1 = GXv_char2[0] ;
         AV314Val5 = GXt_char1 ;
         /* Using cursor P057S2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P057S2_A407EmprNom[0] ;
            n407EmprNom = P057S2_n407EmprNom[0] ;
            A404EmprDir = P057S2_A404EmprDir[0] ;
            n404EmprDir = P057S2_n404EmprDir[0] ;
            A408EmprPob = P057S2_A408EmprPob[0] ;
            n408EmprPob = P057S2_n408EmprPob[0] ;
            A409EmprTel = P057S2_A409EmprTel[0] ;
            n409EmprTel = P057S2_n409EmprTel[0] ;
            A405EmprFax = P057S2_A405EmprFax[0] ;
            n405EmprFax = P057S2_n405EmprFax[0] ;
            A395EmprCif = P057S2_A395EmprCif[0] ;
            n395EmprCif = P057S2_n395EmprCif[0] ;
            A8334EmpItm1 = P057S2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P057S2_n8334EmpItm1[0] ;
            A8335EmpItm2 = P057S2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P057S2_n8335EmpItm2[0] ;
            A8336EmpItm3 = P057S2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P057S2_n8336EmpItm3[0] ;
            A8337EmpItm4 = P057S2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P057S2_n8337EmpItm4[0] ;
            A8338EmpItm5 = P057S2_A8338EmpItm5[0] ;
            n8338EmpItm5 = P057S2_n8338EmpItm5[0] ;
            A11516EmpItm6 = P057S2_A11516EmpItm6[0] ;
            n11516EmpItm6 = P057S2_n11516EmpItm6[0] ;
            AV146Emprnom = A407EmprNom ;
            AV147EmprDir = A404EmprDir ;
            AV148EmprPob = A408EmprPob ;
            AV149EmprTel = A409EmprTel ;
            AV150EmprFax = A405EmprFax ;
            AV156EmprCif = A395EmprCif ;
            AV145EmpItm1 = GXutil.substring( A8334EmpItm1, 1, 60) ;
            AV151EmpItm2 = A8335EmpItm2 ;
            AV152EmpItm3 = GXutil.substring( A8336EmpItm3, 1, 45) ;
            AV153EmpItm4 = GXutil.substring( A8337EmpItm4, 1, 60) ;
            AV154EmpItm5 = GXutil.substring( A8338EmpItm5, 1, 45) ;
            AV155EmpItm6 = GXutil.substring( A11516EmpItm6, 1, 45) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV182FacTot_ = 0 ;
         AV184FACTRM = DecimalUtil.doubleToDec(0) ;
         AV308FacMan = "" ;
         /* Using cursor P057S3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV190FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A430FacCod = P057S3_A430FacCod[0] ;
            A7211Factrm = P057S3_A7211Factrm[0] ;
            A449FacPreMts = P057S3_A449FacPreMts[0] ;
            A447FacMts = P057S3_A447FacMts[0] ;
            A448FacPreKgs = P057S3_A448FacPreKgs[0] ;
            A444FacKgs = P057S3_A444FacKgs[0] ;
            A7212FacRect = P057S3_A7212FacRect[0] ;
            A11513FacRecIca = P057S3_A11513FacRecIca[0] ;
            A8346FacRecI = P057S3_A8346FacRecI[0] ;
            n8346FacRecI = P057S3_n8346FacRecI[0] ;
            A443FacIVAPor = P057S3_A443FacIVAPor[0] ;
            A11626FacMan = P057S3_A11626FacMan[0] ;
            A446FacLin = P057S3_A446FacLin[0] ;
            A7211Factrm = P057S3_A7211Factrm[0] ;
            A7212FacRect = P057S3_A7212FacRect[0] ;
            A11513FacRecIca = P057S3_A11513FacRecIca[0] ;
            A8346FacRecI = P057S3_A8346FacRecI[0] ;
            n8346FacRecI = P057S3_n8346FacRecI[0] ;
            A443FacIVAPor = P057S3_A443FacIVAPor[0] ;
            A11626FacMan = P057S3_A11626FacMan[0] ;
            if ( A7211Factrm.doubleValue() > 0 )
            {
               if ( A449FacPreMts.doubleValue() > 0 )
               {
                  AV163Precio_trm = GXutil.roundDecimal( A449FacPreMts.divide(A7211Factrm, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV162FacImp = GXutil.roundDecimal( AV163Precio_trm.multiply(A447FacMts), 0) ;
                  AV165TotM = AV165TotM.add(A447FacMts) ;
               }
               if ( A448FacPreKgs.doubleValue() > 0 )
               {
                  AV163Precio_trm = GXutil.roundDecimal( A448FacPreKgs.divide(A7211Factrm, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV162FacImp = GXutil.roundDecimal( AV163Precio_trm.multiply(A444FacKgs), 0) ;
                  AV164TotK = AV164TotK.add(A444FacKgs) ;
               }
            }
            AV166FacImpTot = AV166FacImpTot.add(AV162FacImp) ;
            AV184FACTRM = A7211Factrm ;
            AV180FacRect = A7212FacRect ;
            AV177FacRecIca = A11513FacRecIca ;
            AV176FacRecI = A8346FacRecI ;
            AV189FacIvaPor = A443FacIVAPor ;
            AV301Unidad = ((A448FacPreKgs.doubleValue()>0) ? httpContext.getMessage( "KILOS", "") : ((A449FacPreMts.doubleValue()>0) ? httpContext.getMessage( "METROS", "") : "X")) ;
            AV308FacMan = A11626FacMan ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV302TxtValor = httpContext.getMessage( "VR. ", "") + GXutil.trim( AV301Unidad) ;
         AV237F_pie = (byte)(1) ;
         AV286TotPzs = 0 ;
         AV164TotK = DecimalUtil.doubleToDec(0) ;
         AV165TotM = DecimalUtil.doubleToDec(0) ;
         GxHdr4 = true ;
         /* Using cursor P057S4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV190FacCod), A396EmprCod, Integer.valueOf(AV190FacCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A7210FacObs = P057S4_A7210FacObs[0] ;
            A7211Factrm = P057S4_A7211Factrm[0] ;
            A430FacCod = P057S4_A430FacCod[0] ;
            A435FacEst = P057S4_A435FacEst[0] ;
            A437FacFpg = P057S4_A437FacFpg[0] ;
            A252CliCod = P057S4_A252CliCod[0] ;
            n252CliCod = P057S4_n252CliCod[0] ;
            A450FacPri = P057S4_A450FacPri[0] ;
            A436FacFch = P057S4_A436FacFch[0] ;
            A11513FacRecIca = P057S4_A11513FacRecIca[0] ;
            A8346FacRecI = P057S4_A8346FacRecI[0] ;
            n8346FacRecI = P057S4_n8346FacRecI[0] ;
            A7212FacRect = P057S4_A7212FacRect[0] ;
            A453FacRECPor = P057S4_A453FacRECPor[0] ;
            A443FacIVAPor = P057S4_A443FacIVAPor[0] ;
            A14224FacCostFac = P057S4_A14224FacCostFac[0] ;
            A14223FacCostKgs = P057S4_A14223FacCostKgs[0] ;
            A14222FacCostMts = P057S4_A14222FacCostMts[0] ;
            A14219FacEnergia = P057S4_A14219FacEnergia[0] ;
            A433FacDtoGen = P057S4_A433FacDtoGen[0] ;
            A434FacDtoPP = P057S4_A434FacDtoPP[0] ;
            /* Using cursor P057S5 */
            pr_default.execute(3, new Object[] {A396EmprCod});
            A7209Colombia = P057S5_A7209Colombia[0] ;
            n7209Colombia = P057S5_n7209Colombia[0] ;
            A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
            A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
            /* Using cursor P057S6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
            A781PrvCod = P057S6_A781PrvCod[0] ;
            A3644CliNom1 = P057S6_A3644CliNom1[0] ;
            A279CliNom = P057S6_A279CliNom[0] ;
            A295CliPob = P057S6_A295CliPob[0] ;
            A303CliTel1 = P057S6_A303CliTel1[0] ;
            A260CliDom = P057S6_A260CliDom[0] ;
            A278CliNif = P057S6_A278CliNif[0] ;
            /* Using cursor P057S7 */
            pr_default.execute(5, new Object[] {Short.valueOf(A781PrvCod)});
            A787PrvDsc = P057S7_A787PrvDsc[0] ;
            n787PrvDsc = P057S7_n787PrvDsc[0] ;
            /* Using cursor P057S9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            if ( (pr_default.getStatus(6) != 101) )
            {
               A3918FacImpTot1 = P057S9_A3918FacImpTot1[0] ;
            }
            else
            {
               A3918FacImpTot1 = DecimalUtil.doubleToDec(0) ;
            }
            A14218FacImpEng1 = (A3918FacImpTot1.multiply(A14219FacEnergia)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            A441FacImpTot = GXutil.roundDecimal( A3918FacImpTot1, 2).add(GXutil.roundDecimal( A14218FacImpEng1, 2)) ;
            A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
               }
               else
               {
                  A439FacImpGen = DecimalUtil.doubleToDec(0) ;
               }
            }
            A3920FacImpPP1 = A3918FacImpTot1.multiply(A434FacDtoPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A440FacImpPP = GXutil.roundDecimal( A3920FacImpPP1, 0) ;
               }
               else
               {
                  A440FacImpPP = DecimalUtil.doubleToDec(0) ;
               }
            }
            A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
            A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
            A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
               }
               else
               {
                  A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
               }
            }
            A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
               }
               else
               {
                  A452FacRecImp = DecimalUtil.doubleToDec(0) ;
               }
            }
            A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
               }
               else
               {
                  A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
               }
            }
            A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            if ( A7209Colombia == 0 )
            {
               A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
               }
               else
               {
                  A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
               }
            }
            A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
            AV315Texto_pie = httpContext.getMessage( "FACTURACION ELECTRONICA AUTORIZADA RESOLUCION NRO: ", "") + GXutil.trim( AV310Val1) + httpContext.getMessage( " DEL ", "") + GXutil.trim( AV311Val2) + httpContext.getMessage( " CONSECUTIVO FACT ", "") + GXutil.trim( AV313Val4) + httpContext.getMessage( " AL FACT ", "") + GXutil.trim( AV314Val5) + "." ;
            AV309Txtresolucion = GXutil.trim( AV315Texto_pie) ;
            AV307Txt1 = ((A435FacEst==2)&&(GXutil.strcmp(GXutil.substring( A7210FacObs, 1, 15), httpContext.getMessage( "FACTURA ANULADA", ""))==0) ? httpContext.getMessage( "FACTURA ANULADA", "") : "") ;
            AV230CopiaTex = "" ;
            AV274OtraPag = (byte)(0) ;
            AV227ContLin = (byte)(0) ;
            Gx_page = 0 ;
            AV294SumSig = DecimalUtil.doubleToDec(0) ;
            AV256FpgCod = A437FacFpg ;
            /* Execute user subroutine: 'FORPAG' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(5);
               pr_default.close(4);
               pr_default.close(3);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV216CliCod = A252CliCod ;
            AV223CliPri = A450FacPri ;
            /* Execute user subroutine: 'BUSDOM' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(5);
               pr_default.close(4);
               pr_default.close(3);
               pr_default.close(2);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( A7211Factrm.doubleValue() == 0 )
            {
               AV275PDtoPP = A434FacDtoPP ;
               AV260ImpDtoPP = A440FacImpPP ;
               AV246facImpGen = (long)(DecimalUtil.decToDouble(A439FacImpGen)) ;
               AV166FacImpTot = A441FacImpTot ;
               AV241FacBasImp = A429FacBasImp ;
               AV189FacIvaPor = A443FacIVAPor ;
               AV187FacIvaImp = A442FacIVAImp ;
               AV178FacRecImp = (int)(DecimalUtil.decToDouble(A452FacRecImp)) ;
               AV181FacTot = A455FacTot ;
               AV182FacTot_ = (long)(DecimalUtil.decToDouble(A455FacTot)) ;
               AV250facimpret = A7213FacImpRet ;
               AV249FacImpRei = A8347FacImpReI ;
               AV247FacImpIca = (int)(DecimalUtil.decToDouble(A11515FacImpIca)) ;
            }
            AV174FacPri = A450FacPri ;
            AV295TipoFra = "" ;
            AV158CliNom_l = GXutil.trim( A279CliNom) + GXutil.trim( A3644CliNom1) ;
            AV222CliPob_l = GXutil.trim( A295CliPob) ;
            AV199Anyo = (short)(GXutil.year( A436FacFch)) ;
            AV269Mes = (byte)(GXutil.month( A436FacFch)) ;
            AV231Dia = (byte)(GXutil.day( A436FacFch)) ;
            AV160Data_f = GXutil.str( AV199Anyo, 4, 0) + " " + GXutil.str( AV269Mes, 2, 0) + " " + GXutil.str( AV231Dia, 2, 0) ;
            AV161Data_v = GXutil.space( (short)(10)) ;
            AV185FacVtoFch = GXutil.nullDate() ;
            AV271NFpago = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV254Fpago[GX_I-1] = DecimalUtil.ZERO ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV255FPagoPt[GX_I-1] = 0 ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV287Vencim[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV288VtoTxt = "" ;
            AV262ImpTxt = "" ;
            /* Using cursor P057S10 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A956FacVtoLin = P057S10_A956FacVtoLin[0] ;
               A957FacVtoFch = P057S10_A957FacVtoFch[0] ;
               n957FacVtoFch = P057S10_n957FacVtoFch[0] ;
               AV185FacVtoFch = A957FacVtoFch ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV185FacVtoFch)) )
            {
               AV199Anyo = (short)(GXutil.year( AV185FacVtoFch)) ;
               AV269Mes = (byte)(GXutil.month( AV185FacVtoFch)) ;
               AV231Dia = (byte)(GXutil.day( AV185FacVtoFch)) ;
               AV161Data_v = GXutil.str( AV199Anyo, 4, 0) + " " + GXutil.str( AV269Mes, 2, 0) + " " + GXutil.str( AV231Dia, 2, 0) ;
            }
            GXv_decimal3[0] = DecimalUtil.doubleToDec(AV182FacTot_) ;
            GXv_char2[0] = AV291Texto1 ;
            GXv_char4[0] = AV292Texto2 ;
            GXv_decimal5[0] = AV184FACTRM ;
            GXv_int6[0] = (byte)(60) ;
            new app.pconvnuc(remoteHandle, context).execute( GXv_decimal3, GXv_char2, GXv_char4, GXv_decimal5, GXv_int6) ;
            pfacterm.this.AV182FacTot_ = (long)(DecimalUtil.decToDouble(GXv_decimal3[0])) ;
            pfacterm.this.AV291Texto1 = GXv_char2[0] ;
            pfacterm.this.AV292Texto2 = GXv_char4[0] ;
            pfacterm.this.AV184FACTRM = GXv_decimal5[0] ;
            AV264LastFacDsc = " " ;
            /* Using cursor P057S11 */
            pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A1294FacBarCod = P057S11_A1294FacBarCod[0] ;
               A1295FacBarReo = P057S11_A1295FacBarReo[0] ;
               A1296FacBarPar = P057S11_A1296FacBarPar[0] ;
               A427FacAlbCod = P057S11_A427FacAlbCod[0] ;
               A432FacDsc = P057S11_A432FacDsc[0] ;
               A3878FacColNom = P057S11_A3878FacColNom[0] ;
               A446FacLin = P057S11_A446FacLin[0] ;
               A12197FacUnds = P057S11_A12197FacUnds[0] ;
               A3897FacKgsA = P057S11_A3897FacKgsA[0] ;
               A3898FacPreKgsA = P057S11_A3898FacPreKgsA[0] ;
               A12198FacPreUnd = P057S11_A12198FacPreUnd[0] ;
               A449FacPreMts = P057S11_A449FacPreMts[0] ;
               A5353FacImpMan = P057S11_A5353FacImpMan[0] ;
               A447FacMts = P057S11_A447FacMts[0] ;
               A444FacKgs = P057S11_A444FacKgs[0] ;
               A448FacPreKgs = P057S11_A448FacPreKgs[0] ;
               A5355FacImpMin = P057S11_A5355FacImpMin[0] ;
               A2239FacIml = (A448FacPreKgs.multiply(A444FacKgs)).add((A449FacPreMts.multiply(A447FacMts))).add((A3898FacPreKgsA.multiply(A3897FacKgsA))).add((DecimalUtil.doubleToDec(A12197FacUnds).multiply(A12198FacPreUnd))) ;
               if ( ( DecimalUtil.compareTo(A2239FacIml, A5355FacImpMin) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5355FacImpMin)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) )
               {
                  A3923FacImp1 = A5355FacImpMin ;
               }
               else
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A2239FacIml)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) )
                  {
                     A3923FacImp1 = A5353FacImpMan ;
                  }
                  else
                  {
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A444FacKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A448FacPreKgs)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A447FacMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A449FacPreMts)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A5353FacImpMan)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, A12198FacPreUnd)==0) )
                     {
                        A3923FacImp1 = DecimalUtil.doubleToDec(0) ;
                     }
                     else
                     {
                        A3923FacImp1 = A2239FacIml ;
                     }
                  }
               }
               A438FacImp = GXutil.roundDecimal( A3923FacImp1, 2) ;
               AV203BarCod = A1294FacBarCod ;
               AV205BarCodReo = A1295FacBarReo ;
               AV204BarCodPar = A1296FacBarPar ;
               AV197AlbProCod = A427FacAlbCod ;
               AV238FacAlbCod = A427FacAlbCod ;
               AV243FacDsc = A432FacDsc ;
               /* Execute user subroutine: 'BARCAD' */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(8);
                  pr_default.close(6);
                  pr_default.close(5);
                  pr_default.close(4);
                  pr_default.close(3);
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV297Enccli = GXutil.substring( AV298BarEnccli, 1, 10) ;
               AV168FacMts = DecimalUtil.ZERO ;
               AV173FacPreMts = DecimalUtil.ZERO ;
               AV167FacKgs = DecimalUtil.ZERO ;
               AV170FacPreKgs = DecimalUtil.ZERO ;
               AV171Facprem = 0 ;
               AV169FacPrek = 0 ;
               if ( A449FacPreMts.doubleValue() > 0 )
               {
                  AV167FacKgs = A444FacKgs ;
                  AV168FacMts = A447FacMts ;
                  AV173FacPreMts = A449FacPreMts ;
                  AV171Facprem = (int)(DecimalUtil.decToDouble(A449FacPreMts)) ;
                  AV163Precio_trm = A449FacPreMts ;
                  AV165TotM = AV165TotM.add(A447FacMts) ;
               }
               else
               {
                  AV167FacKgs = A444FacKgs ;
                  AV168FacMts = A447FacMts ;
                  AV173FacPreMts = A448FacPreKgs ;
                  AV163Precio_trm = A448FacPreKgs ;
                  AV169FacPrek = (int)(DecimalUtil.decToDouble(A448FacPreKgs)) ;
                  AV164TotK = AV164TotK.add(A444FacKgs) ;
               }
               AV286TotPzs = (int)(AV286TotPzs+AV193ALbbarpie) ;
               AV162FacImp = A438FacImp ;
               if ( A7211Factrm.doubleValue() > 0 )
               {
                  if ( A449FacPreMts.doubleValue() > 0 )
                  {
                     AV163Precio_trm = GXutil.roundDecimal( A449FacPreMts.divide(A7211Factrm, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV162FacImp = GXutil.roundDecimal( AV163Precio_trm.multiply(A447FacMts), 0) ;
                  }
                  if ( A448FacPreKgs.doubleValue() > 0 )
                  {
                     AV163Precio_trm = GXutil.roundDecimal( A448FacPreKgs.divide(A7211Factrm, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV162FacImp = GXutil.roundDecimal( AV163Precio_trm.multiply(A444FacKgs), 0) ;
                  }
               }
               AV285SumKgs = AV285SumKgs.add(A444FacKgs) ;
               AV293SumMts = AV293SumMts.add(A447FacMts) ;
               AV284SumImp = (long)(DecimalUtil.decToDouble(DecimalUtil.doubleToDec(AV284SumImp).add(AV162FacImp))) ;
               if ( AV227ContLin > 18 )
               {
                  /* Execute user subroutine: 'SUMASIGUE' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(8);
                     pr_default.close(6);
                     pr_default.close(5);
                     pr_default.close(4);
                     pr_default.close(3);
                     pr_default.close(2);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV227ContLin = (byte)(0) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               if ( GXutil.strcmp(AV308FacMan, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV212BarSerDsc = GXutil.trim( A432FacDsc) ;
                  AV305IntDsc = A3878FacColNom ;
                  if ( A448FacPreKgs.doubleValue() > 0 )
                  {
                     AV215Cant = A444FacKgs ;
                     AV304CantDp = AV303BarAlbKgme ;
                     AV296Und = httpContext.getMessage( "K", "") ;
                     AV279Precio = A448FacPreKgs ;
                     h57S0( false, 18) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV203BarCod), "ZZZZZZZZ")), 39, Gx_line+0, 98, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV238FacAlbCod), "ZZZZZZZZZZ")), 104, Gx_line+0, 178, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV297Enccli, "")), 183, Gx_line+0, 257, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV212BarSerDsc, "")), 271, Gx_line+1, 462, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV279Precio, "ZZZ,ZZ9.99")), 856, Gx_line+0, 930, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV162FacImp, "ZZ,ZZZ,ZZ9.99")), 932, Gx_line+0, 1028, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV193ALbbarpie), "ZZZ9")), 797, Gx_line+0, 827, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV215Cant, "ZZZZZ9.99")), 645, Gx_line+0, 712, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV304CantDp, "ZZZZZ9.99")), 725, Gx_line+0, 792, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV305IntDsc, "")), 478, Gx_line+0, 625, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  if ( A449FacPreMts.doubleValue() > 0 )
                  {
                     AV215Cant = A447FacMts ;
                     AV304CantDp = AV201BarAlbMtrE ;
                     AV296Und = httpContext.getMessage( "M", "") ;
                     AV279Precio = A449FacPreMts ;
                     h57S0( false, 18) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV203BarCod), "ZZZZZZZZ")), 39, Gx_line+0, 98, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV238FacAlbCod), "ZZZZZZZZZZ")), 104, Gx_line+0, 178, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV297Enccli, "")), 183, Gx_line+0, 257, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV212BarSerDsc, "")), 271, Gx_line+1, 462, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV279Precio, "ZZZ,ZZ9.99")), 856, Gx_line+0, 930, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV162FacImp, "ZZ,ZZZ,ZZ9.99")), 932, Gx_line+0, 1028, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV193ALbbarpie), "ZZZ9")), 797, Gx_line+0, 827, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV215Cant, "ZZZZZ9.99")), 645, Gx_line+0, 712, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV304CantDp, "ZZZZZ9.99")), 725, Gx_line+0, 792, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV305IntDsc, "")), 478, Gx_line+0, 625, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
               }
               else
               {
                  if ( A448FacPreKgs.doubleValue() > 0 )
                  {
                     AV215Cant = A444FacKgs ;
                     AV304CantDp = AV303BarAlbKgme ;
                     AV296Und = httpContext.getMessage( "K", "") ;
                     AV279Precio = A448FacPreKgs ;
                     h57S0( false, 18) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV203BarCod), "ZZZZZZZZ")), 39, Gx_line+0, 98, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV238FacAlbCod), "ZZZZZZZZZZ")), 104, Gx_line+0, 178, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV297Enccli, "")), 183, Gx_line+0, 257, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV212BarSerDsc, "")), 271, Gx_line+1, 462, Gx_line+18, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV279Precio, "ZZZ,ZZ9.99")), 856, Gx_line+0, 930, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV162FacImp, "ZZ,ZZZ,ZZ9.99")), 932, Gx_line+0, 1028, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV193ALbbarpie), "ZZZ9")), 797, Gx_line+0, 827, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV215Cant, "ZZZZZ9.99")), 645, Gx_line+0, 712, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV304CantDp, "ZZZZZ9.99")), 725, Gx_line+0, 792, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV305IntDsc, "")), 478, Gx_line+0, 625, Gx_line+17, 0+256, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+18) ;
                  }
                  else
                  {
                     if ( A449FacPreMts.doubleValue() > 0 )
                     {
                        AV215Cant = A447FacMts ;
                        AV304CantDp = AV201BarAlbMtrE ;
                        AV296Und = httpContext.getMessage( "M", "") ;
                        AV279Precio = A449FacPreMts ;
                        h57S0( false, 18) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV203BarCod), "ZZZZZZZZ")), 39, Gx_line+0, 98, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV238FacAlbCod), "ZZZZZZZZZZ")), 104, Gx_line+0, 178, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV297Enccli, "")), 183, Gx_line+0, 257, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV212BarSerDsc, "")), 271, Gx_line+1, 462, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV279Precio, "ZZZ,ZZ9.99")), 856, Gx_line+0, 930, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV162FacImp, "ZZ,ZZZ,ZZ9.99")), 932, Gx_line+0, 1028, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV193ALbbarpie), "ZZZ9")), 797, Gx_line+0, 827, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV215Cant, "ZZZZZ9.99")), 645, Gx_line+0, 712, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV304CantDp, "ZZZZZ9.99")), 725, Gx_line+0, 792, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV305IntDsc, "")), 478, Gx_line+0, 625, Gx_line+17, 0+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+18) ;
                     }
                  }
               }
               AV227ContLin = (byte)(AV227ContLin+1) ;
               AV294SumSig = AV294SumSig.add(AV162FacImp) ;
               AV264LastFacDsc = A432FacDsc ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
            A435FacEst = (byte)(((A435FacEst==0) ? 1 : A435FacEst)) ;
            if ( AV227ContLin > 22 )
            {
               /* Execute user subroutine: 'SUMASIGUE' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  pr_default.close(5);
                  pr_default.close(4);
                  pr_default.close(3);
                  pr_default.close(2);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV227ContLin = (byte)(0) ;
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            AV227ContLin = (byte)(AV227ContLin+1) ;
            if ( A7211Factrm.doubleValue() > 0 )
            {
               AV184FACTRM = A7211Factrm ;
               if ( AV227ContLin > 22 )
               {
                  /* Execute user subroutine: 'SUMASIGUE' */
                  S111 ();
                  if ( returnInSub )
                  {
                     pr_default.close(6);
                     pr_default.close(5);
                     pr_default.close(4);
                     pr_default.close(3);
                     pr_default.close(2);
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  AV227ContLin = (byte)(0) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV227ContLin = (byte)(AV227ContLin+1) ;
            }
            AV272Nlin = (short)(GXutil.gxmlines( A7210FacObs, (short)(50))) ;
            AV268Linea_fc = "" ;
            while ( AV257i <= AV272Nlin )
            {
               if ( GXutil.strcmp(AV268Linea_fc, "") == 0 )
               {
                  AV268Linea_fc = GXutil.gxgetmli( A7210FacObs, AV257i, (short)(50)) ;
               }
               else
               {
                  AV268Linea_fc += " " + GXutil.gxgetmli( A7210FacObs, AV257i, (short)(50)) ;
               }
               AV227ContLin = (byte)(AV227ContLin+1) ;
               AV257i = (short)(AV257i+1) ;
            }
            /* Using cursor P057S12 */
            pr_default.execute(9, new Object[] {Byte.valueOf(A435FacEst), A396EmprCod, Integer.valueOf(A430FacCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         pr_default.close(3);
         pr_default.close(4);
         pr_default.close(5);
         pr_default.close(6);
         GxHdr4 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h57S0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'SUMASIGUE' Routine */
      returnInSub = false ;
      AV274OtraPag = (byte)(1) ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV243FacDsc = " " ;
      AV280procod = " " ;
      AV281Prodsc = " " ;
      AV305IntDsc = "" ;
      /* Using cursor P057S13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV203BarCod), Byte.valueOf(AV205BarCodReo), AV204BarCodPar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A130BarCodPar = P057S13_A130BarCodPar[0] ;
         A132BarCodReo = P057S13_A132BarCodReo[0] ;
         A129BarCod = P057S13_A129BarCod[0] ;
         A1652BarSerDsc = P057S13_A1652BarSerDsc[0] ;
         A212BarSer = P057S13_A212BarSer[0] ;
         A136BarColNum = P057S13_A136BarColNum[0] ;
         A135BarColNom = P057S13_A135BarColNom[0] ;
         A1234BarNomCli = P057S13_A1234BarNomCli[0] ;
         A4812BarEncCli = P057S13_A4812BarEncCli[0] ;
         A252CliCod = P057S13_A252CliCod[0] ;
         n252CliCod = P057S13_n252CliCod[0] ;
         A218BarTipCol = P057S13_A218BarTipCol[0] ;
         AV212BarSerDsc = GXutil.substring( A212BarSer, 1, 8) + " " + GXutil.trim( A1652BarSerDsc) ;
         AV200ArtDsc = GXutil.substring( A1652BarSerDsc, 1, 20) ;
         AV207BarColNum = A136BarColNum ;
         AV206BarColNom = A135BarColNom ;
         AV300BarNomcli = A1234BarNomCli ;
         AV298BarEnccli = A4812BarEncCli ;
         GXv_char4[0] = AV305IntDsc ;
         GXv_char2[0] = "" ;
         GXv_int7[0] = (short)(0) ;
         GXv_int6[0] = (byte)(0) ;
         GXv_char8[0] = "" ;
         GXv_char9[0] = "" ;
         GXv_int10[0] = 0 ;
         GXv_char11[0] = "" ;
         GXv_char12[0] = "" ;
         GXv_int13[0] = (short)(0) ;
         GXv_char14[0] = "" ;
         GXv_char15[0] = "" ;
         new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char4, GXv_char2, GXv_int7, GXv_int6, GXv_char8, GXv_char9, GXv_int10, GXv_char11, GXv_char12, GXv_int13, GXv_char14, GXv_char15) ;
         pfacterm.this.AV305IntDsc = GXv_char4[0] ;
         /* Using cursor P057S14 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A44AlbRecCod = P057S14_A44AlbRecCod[0] ;
            A5806AlbREnt2 = P057S14_A5806AlbREnt2[0] ;
            A200BarPieCod = P057S14_A200BarPieCod[0] ;
            A5806AlbREnt2 = P057S14_A5806AlbREnt2[0] ;
            AV198Albrent2 = GXutil.substring( A5806AlbREnt2, 1, 10) ;
            pr_default.readNext(11);
         }
         pr_default.close(11);
         /* Using cursor P057S15 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A758ProCod = P057S15_A758ProCod[0] ;
            A761ProFasLin = P057S15_A761ProFasLin[0] ;
            n761ProFasLin = P057S15_n761ProFasLin[0] ;
            A759ProDsc = P057S15_A759ProDsc[0] ;
            A759ProDsc = P057S15_A759ProDsc[0] ;
            AV281Prodsc = GXutil.substring( A759ProDsc, 1, 25) ;
            pr_default.readNext(12);
         }
         pr_default.close(12);
         /* Execute user subroutine: 'ALBBAR' */
         S139 ();
         if ( returnInSub )
         {
            pr_default.close(10);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S139( ) throws ProcessInterruptedException
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV196AlbHdrobs = " " ;
      AV193ALbbarpie = (short)(0) ;
      /* Using cursor P057S17 */
      pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(AV238FacAlbCod), Integer.valueOf(AV203BarCod), Byte.valueOf(AV205BarCodReo), AV204BarCodPar});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A130BarCodPar = P057S17_A130BarCodPar[0] ;
         A132BarCodReo = P057S17_A132BarCodReo[0] ;
         A129BarCod = P057S17_A129BarCod[0] ;
         A30AlbProCod = P057S17_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P057S17_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P057S17_A1263BarAlbMtrE[0] ;
         A1379AlbBarPie = P057S17_A1379AlbBarPie[0] ;
         n1379AlbBarPie = P057S17_n1379AlbBarPie[0] ;
         A1379AlbBarPie = P057S17_A1379AlbBarPie[0] ;
         n1379AlbBarPie = P057S17_n1379AlbBarPie[0] ;
         AV303BarAlbKgme = A1261BarAlbKgmE ;
         AV201BarAlbMtrE = A1263BarAlbMtrE ;
         AV193ALbbarpie = A1379AlbBarPie ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(13);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'FORPAG' Routine */
      returnInSub = false ;
      AV159FpgDsc = "" ;
      /* Using cursor P057S18 */
      pr_default.execute(14, new Object[] {A396EmprCod, AV256FpgCod});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A497FpgCod = P057S18_A497FpgCod[0] ;
         A498FpgDsc = P057S18_A498FpgDsc[0] ;
         n498FpgDsc = P057S18_n498FpgDsc[0] ;
         AV159FpgDsc = GXutil.substring( A498FpgDsc, 1, 10) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'BUSDOM' Routine */
      returnInSub = false ;
      AV220CliPagNom = "" ;
      AV219CliPagDom = "" ;
      AV221CliPagPob = "" ;
      /* Using cursor P057S19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV216CliCod), AV223CliPri});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A287CliPagLin = P057S19_A287CliPagLin[0] ;
         A252CliCod = P057S19_A252CliCod[0] ;
         n252CliCod = P057S19_n252CliCod[0] ;
         A288CliPagNom = P057S19_A288CliPagNom[0] ;
         A284CliPagCue = P057S19_A284CliPagCue[0] ;
         A285CliPagDig = P057S19_A285CliPagDig[0] ;
         A283CliPagCcs = P057S19_A283CliPagCcs[0] ;
         A282CliPagCcb = P057S19_A282CliPagCcb[0] ;
         AV220CliPagNom = A288CliPagNom ;
         AV218CliPagCta = A282CliPagCcb + "-" + A283CliPagCcs + "-" + A285CliPagDig + "-" + A284CliPagCue ;
         pr_default.readNext(15);
      }
      pr_default.close(15);
   }

   public void h57S0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 44, Gx_line+1, 131, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV268Linea_fc, "")), 139, Gx_line+0, 650, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+18) ;
               AV306Totcant = ((AV164TotK.doubleValue()>0) ? AV164TotK : ((AV165TotM.doubleValue()>0) ? AV165TotM : DecimalUtil.doubleToDec(0))) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV291Texto1, "")), 69, Gx_line+11, 508, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV292Texto2, "")), 514, Gx_line+11, 953, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "SON", ""), 44, Gx_line+11, 68, Gx_line+26, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "SUBTOTAL", ""), 798, Gx_line+86, 871, Gx_line+103, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV166FacImpTot, "ZZ,ZZZ,ZZ9.99")), 932, Gx_line+47, 1028, Gx_line+65, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV250facimpret, "ZZ,ZZZ,ZZ9.99")), 932, Gx_line+127, 1028, Gx_line+145, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "I.V.A.", ""), 798, Gx_line+106, 833, Gx_line+123, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV187FacIvaImp, "ZZ,ZZZ,ZZ9.99")), 932, Gx_line+106, 1028, Gx_line+124, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RETFUENTE", ""), 798, Gx_line+127, 877, Gx_line+144, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TOTAL", ""), 798, Gx_line+171, 843, Gx_line+188, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV181FacTot, "ZZ,ZZZ,ZZ9.99")), 932, Gx_line+171, 1028, Gx_line+189, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "RETE IVA", ""), 798, Gx_line+147, 859, Gx_line+164, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV249FacImpRei, "ZZ,ZZZ,ZZ9.99")), 932, Gx_line+147, 1028, Gx_line+165, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TOTAL BRUTO", ""), 798, Gx_line+47, 894, Gx_line+64, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DESCUENTO", ""), 798, Gx_line+67, 881, Gx_line+84, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV260ImpDtoPP, "ZZ,ZZZ,ZZ9.99")), 932, Gx_line+67, 1028, Gx_line+84, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV241FacBasImp, "ZZ,ZZZ,ZZ9.99")), 932, Gx_line+86, 1028, Gx_line+103, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(40, Gx_line+5, 1040, Gx_line+270, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(40, Gx_line+29, 1040, Gx_line+29, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(41, Gx_line+207, 1040, Gx_line+207, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(305, Gx_line+29, 305, Gx_line+140, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(568, Gx_line+29, 568, Gx_line+209, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(793, Gx_line+29, 793, Gx_line+208, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(41, Gx_line+142, 794, Gx_line+142, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(568, Gx_line+108, 794, Gx_line+108, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FECHA", ""), 578, Gx_line+117, 615, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cantidad Total", ""), 573, Gx_line+150, 654, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Aprobó", ""), 47, Gx_line+33, 91, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Transporte", ""), 311, Gx_line+33, 376, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Recibe", ""), 579, Gx_line+39, 619, Gx_line+54, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total Rollos", ""), 702, Gx_line+150, 769, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV286TotPzs), "ZZZZZ9")), 714, Gx_line+166, 759, Gx_line+183, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ESTA FACTURA DE VENTA SE ASIMILA PARA TODOS SUS EFECTOS LEGALES A LA LETRA DE CAMBIO SEGUN EL ART. DEL C.C.", ""), 198, Gx_line+238, 883, Gx_line+253, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NO SE ACEPTAN DEVOLUCIONES PASADOS 30 DIAS DE ENTREGADA LA TELA, NO SE ACEPTAN RECLAMACIONES SOBRE TELA CORTADA.", ""), 170, Gx_line+254, 912, Gx_line+269, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 877, Gx_line+272, 911, Gx_line+287, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 914, Gx_line+272, 959, Gx_line+288, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "{{Pages}}", ""), 974, Gx_line+272, 1041, Gx_line+287, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "de", ""), 959, Gx_line+272, 973, Gx_line+287, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Impreso por:", ""), 244, Gx_line+272, 308, Gx_line+287, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV146Emprnom, "")), 310, Gx_line+272, 467, Gx_line+288, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NIT.", ""), 474, Gx_line+272, 495, Gx_line+287, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV156EmprCif, "")), 494, Gx_line+272, 573, Gx_line+288, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV306Totcant, "ZZZZZZ9.99")), 573, Gx_line+166, 647, Gx_line+183, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV315Texto_pie, "")), 170, Gx_line+220, 796, Gx_line+236, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+293) ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if ( GxHdr4 )
            {
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CLIENTE", ""), 384, Gx_line+15, 431, Gx_line+30, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158CliNom_l, "")), 443, Gx_line+34, 704, Gx_line+50, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NIT.", ""), 386, Gx_line+89, 407, Gx_line+104, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 454, Gx_line+89, 601, Gx_line+105, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 454, Gx_line+103, 703, Gx_line+119, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DIRECCION", ""), 386, Gx_line+103, 446, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "CIUDAD", ""), 386, Gx_line+119, 429, Gx_line+134, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 454, Gx_line+119, 674, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TELEFONO", ""), 386, Gx_line+134, 444, Gx_line+149, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A303CliTel1, "")), 454, Gx_line+134, 564, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FACTURA DE VENTA", ""), 861, Gx_line+14, 970, Gx_line+29, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FACT -", ""), 870, Gx_line+31, 907, Gx_line+46, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 911, Gx_line+30, 970, Gx_line+48, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha Expedicion", ""), 810, Gx_line+54, 909, Gx_line+69, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Plazo", ""), 878, Gx_line+78, 909, Gx_line+93, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159FpgDsc, "")), 932, Gx_line+78, 1006, Gx_line+94, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fecha Vencimiento", ""), 811, Gx_line+102, 920, Gx_line+117, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV160Data_f, "")), 932, Gx_line+54, 1006, Gx_line+70, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV161Data_v, "")), 933, Gx_line+102, 1007, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(40, Gx_line+2, 362, Gx_line+191, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(375, Gx_line+2, 770, Gx_line+191, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawRect(791, Gx_line+2, 1040, Gx_line+191, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NIT. 811023799-7", ""), 142, Gx_line+104, 250, Gx_line+118, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "COPACABANA Calle 103  46 446", ""), 98, Gx_line+131, 293, Gx_line+145, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("4533079", 170, Gx_line+146, 222, Gx_line+160, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "83ae07a9-e7d2-4613-b17d-5253a582b88e", "", context.getHttpContext().getTheme( )), 60, Gx_line+5, 330, Gx_line+98) ;
               getPrinter().GxDrawText(httpContext.getMessage( "IVA REGIMEN COMUN", ""), 127, Gx_line+172, 263, Gx_line+186, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(375, Gx_line+30, 770, Gx_line+30, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(791, Gx_line+47, 1040, Gx_line+47, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV307Txt1, "")), 843, Gx_line+147, 1011, Gx_line+167, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV146Emprnom, "")), 142, Gx_line+118, 331, Gx_line+133, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+208) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "LOTE", ""), 53, Gx_line+17, 83, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DOC. RESP.", ""), 104, Gx_line+17, 178, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REM", ""), 208, Gx_line+17, 231, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REFERENCIA", ""), 291, Gx_line+17, 365, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "COLOR", ""), 515, Gx_line+17, 552, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TOTAL", ""), 986, Gx_line+17, 1023, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ROLLOS", ""), 797, Gx_line+17, 842, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV301Unidad, "")), 693, Gx_line+0, 738, Gx_line+16, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(39, Gx_line+0, 1042, Gx_line+32, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(845, Gx_line+0, 845, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(932, Gx_line+0, 932, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(634, Gx_line+0, 634, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(468, Gx_line+0, 468, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(794, Gx_line+0, 794, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(260, Gx_line+0, 260, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(179, Gx_line+0, 179, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(101, Gx_line+0, 101, Gx_line+32, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV302TxtValor, "")), 856, Gx_line+16, 930, Gx_line+32, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FACTURADO", ""), 645, Gx_line+16, 712, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "DESPACHADO", ""), 718, Gx_line+16, 792, Gx_line+31, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(634, Gx_line+16, 794, Gx_line+16, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(714, Gx_line+17, 714, Gx_line+33, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+36) ;
            }
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfacterm.this.A396EmprCod;
      this.aP1[0] = pfacterm.this.AV190FacCod;
      this.aP2[0] = pfacterm.this.AV191TextoCopia;
      this.aP3[0] = pfacterm.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfacterm");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV310Val1 = "" ;
      AV311Val2 = "" ;
      AV312Val3 = "" ;
      AV313Val4 = "" ;
      AV314Val5 = "" ;
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P057S2_A396EmprCod = new String[] {""} ;
      P057S2_A407EmprNom = new String[] {""} ;
      P057S2_n407EmprNom = new boolean[] {false} ;
      P057S2_A404EmprDir = new String[] {""} ;
      P057S2_n404EmprDir = new boolean[] {false} ;
      P057S2_A408EmprPob = new String[] {""} ;
      P057S2_n408EmprPob = new boolean[] {false} ;
      P057S2_A409EmprTel = new String[] {""} ;
      P057S2_n409EmprTel = new boolean[] {false} ;
      P057S2_A405EmprFax = new String[] {""} ;
      P057S2_n405EmprFax = new boolean[] {false} ;
      P057S2_A395EmprCif = new String[] {""} ;
      P057S2_n395EmprCif = new boolean[] {false} ;
      P057S2_A8334EmpItm1 = new String[] {""} ;
      P057S2_n8334EmpItm1 = new boolean[] {false} ;
      P057S2_A8335EmpItm2 = new String[] {""} ;
      P057S2_n8335EmpItm2 = new boolean[] {false} ;
      P057S2_A8336EmpItm3 = new String[] {""} ;
      P057S2_n8336EmpItm3 = new boolean[] {false} ;
      P057S2_A8337EmpItm4 = new String[] {""} ;
      P057S2_n8337EmpItm4 = new boolean[] {false} ;
      P057S2_A8338EmpItm5 = new String[] {""} ;
      P057S2_n8338EmpItm5 = new boolean[] {false} ;
      P057S2_A11516EmpItm6 = new String[] {""} ;
      P057S2_n11516EmpItm6 = new boolean[] {false} ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A408EmprPob = "" ;
      A409EmprTel = "" ;
      A405EmprFax = "" ;
      A395EmprCif = "" ;
      A8334EmpItm1 = "" ;
      A8335EmpItm2 = "" ;
      A8336EmpItm3 = "" ;
      A8337EmpItm4 = "" ;
      A8338EmpItm5 = "" ;
      A11516EmpItm6 = "" ;
      AV146Emprnom = "" ;
      AV147EmprDir = "" ;
      AV148EmprPob = "" ;
      AV157Emprcpo = "" ;
      AV149EmprTel = "" ;
      AV150EmprFax = "" ;
      AV156EmprCif = "" ;
      AV145EmpItm1 = "" ;
      AV151EmpItm2 = "" ;
      AV152EmpItm3 = "" ;
      AV153EmpItm4 = "" ;
      AV154EmpItm5 = "" ;
      AV155EmpItm6 = "" ;
      AV184FACTRM = DecimalUtil.ZERO ;
      AV308FacMan = "" ;
      P057S3_A396EmprCod = new String[] {""} ;
      P057S3_A430FacCod = new int[1] ;
      P057S3_A7211Factrm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S3_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S3_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S3_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S3_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S3_n8346FacRecI = new boolean[] {false} ;
      P057S3_A443FacIVAPor = new byte[1] ;
      P057S3_A11626FacMan = new String[] {""} ;
      P057S3_A446FacLin = new int[1] ;
      A7211Factrm = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A11626FacMan = "" ;
      AV163Precio_trm = DecimalUtil.ZERO ;
      AV162FacImp = DecimalUtil.ZERO ;
      AV165TotM = DecimalUtil.ZERO ;
      AV164TotK = DecimalUtil.ZERO ;
      AV166FacImpTot = DecimalUtil.ZERO ;
      AV180FacRect = DecimalUtil.ZERO ;
      AV177FacRecIca = DecimalUtil.ZERO ;
      AV176FacRecI = DecimalUtil.ZERO ;
      AV301Unidad = "" ;
      AV302TxtValor = "" ;
      P057S4_A7210FacObs = new String[] {""} ;
      P057S4_A396EmprCod = new String[] {""} ;
      P057S4_A7211Factrm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S4_A430FacCod = new int[1] ;
      P057S4_A435FacEst = new byte[1] ;
      P057S4_A437FacFpg = new String[] {""} ;
      P057S4_A252CliCod = new int[1] ;
      P057S4_n252CliCod = new boolean[] {false} ;
      P057S4_A450FacPri = new String[] {""} ;
      P057S4_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P057S4_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S4_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S4_n8346FacRecI = new boolean[] {false} ;
      P057S4_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S4_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S4_A443FacIVAPor = new byte[1] ;
      P057S4_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S4_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S4_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S4_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S4_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S4_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A7210FacObs = "" ;
      A437FacFpg = "" ;
      A450FacPri = "" ;
      A436FacFch = GXutil.nullDate() ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      P057S5_A7209Colombia = new byte[1] ;
      P057S5_n7209Colombia = new boolean[] {false} ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      P057S6_A781PrvCod = new short[1] ;
      P057S6_A3644CliNom1 = new String[] {""} ;
      P057S6_A279CliNom = new String[] {""} ;
      P057S6_A295CliPob = new String[] {""} ;
      P057S6_A303CliTel1 = new String[] {""} ;
      P057S6_A260CliDom = new String[] {""} ;
      P057S6_A278CliNif = new String[] {""} ;
      A3644CliNom1 = "" ;
      A279CliNom = "" ;
      A295CliPob = "" ;
      A303CliTel1 = "" ;
      A260CliDom = "" ;
      A278CliNif = "" ;
      P057S7_A787PrvDsc = new String[] {""} ;
      P057S7_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      P057S9_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      AV315Texto_pie = "" ;
      AV309Txtresolucion = "" ;
      AV307Txt1 = "" ;
      AV230CopiaTex = "" ;
      AV294SumSig = DecimalUtil.ZERO ;
      AV256FpgCod = "" ;
      AV223CliPri = "" ;
      AV275PDtoPP = DecimalUtil.ZERO ;
      AV260ImpDtoPP = DecimalUtil.ZERO ;
      AV241FacBasImp = DecimalUtil.ZERO ;
      AV187FacIvaImp = DecimalUtil.ZERO ;
      AV181FacTot = DecimalUtil.ZERO ;
      AV250facimpret = DecimalUtil.ZERO ;
      AV249FacImpRei = DecimalUtil.ZERO ;
      AV174FacPri = "" ;
      AV295TipoFra = "" ;
      AV158CliNom_l = "" ;
      AV222CliPob_l = "" ;
      AV160Data_f = "" ;
      AV161Data_v = "" ;
      AV185FacVtoFch = GXutil.nullDate() ;
      AV254Fpago = new java.math.BigDecimal[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV254Fpago[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV255FPagoPt = new int[4] ;
      AV287Vencim = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV287Vencim[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV288VtoTxt = "" ;
      AV262ImpTxt = "" ;
      P057S10_A396EmprCod = new String[] {""} ;
      P057S10_A430FacCod = new int[1] ;
      P057S10_A956FacVtoLin = new byte[1] ;
      P057S10_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P057S10_n957FacVtoFch = new boolean[] {false} ;
      A957FacVtoFch = GXutil.nullDate() ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      AV291Texto1 = "" ;
      AV292Texto2 = "" ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV264LastFacDsc = "" ;
      P057S11_A396EmprCod = new String[] {""} ;
      P057S11_A430FacCod = new int[1] ;
      P057S11_A1294FacBarCod = new int[1] ;
      P057S11_A1295FacBarReo = new byte[1] ;
      P057S11_A1296FacBarPar = new String[] {""} ;
      P057S11_A427FacAlbCod = new long[1] ;
      P057S11_A432FacDsc = new String[] {""} ;
      P057S11_A3878FacColNom = new String[] {""} ;
      P057S11_A446FacLin = new int[1] ;
      P057S11_A12197FacUnds = new int[1] ;
      P057S11_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S11_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S11_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S11_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S11_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S11_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S11_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S11_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S11_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1296FacBarPar = "" ;
      A432FacDsc = "" ;
      A3878FacColNom = "" ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A2239FacIml = DecimalUtil.ZERO ;
      A3923FacImp1 = DecimalUtil.ZERO ;
      A438FacImp = DecimalUtil.ZERO ;
      AV204BarCodPar = "" ;
      AV243FacDsc = "" ;
      AV297Enccli = "" ;
      AV298BarEnccli = "" ;
      AV168FacMts = DecimalUtil.ZERO ;
      AV173FacPreMts = DecimalUtil.ZERO ;
      AV167FacKgs = DecimalUtil.ZERO ;
      AV170FacPreKgs = DecimalUtil.ZERO ;
      AV285SumKgs = DecimalUtil.ZERO ;
      AV293SumMts = DecimalUtil.ZERO ;
      AV212BarSerDsc = "" ;
      AV305IntDsc = "" ;
      AV215Cant = DecimalUtil.ZERO ;
      AV304CantDp = DecimalUtil.ZERO ;
      AV303BarAlbKgme = DecimalUtil.ZERO ;
      AV296Und = "" ;
      AV279Precio = DecimalUtil.ZERO ;
      AV201BarAlbMtrE = DecimalUtil.ZERO ;
      AV268Linea_fc = "" ;
      AV280procod = "" ;
      AV281Prodsc = "" ;
      P057S13_A396EmprCod = new String[] {""} ;
      P057S13_A130BarCodPar = new String[] {""} ;
      P057S13_A132BarCodReo = new byte[1] ;
      P057S13_A129BarCod = new int[1] ;
      P057S13_A1652BarSerDsc = new String[] {""} ;
      P057S13_A212BarSer = new String[] {""} ;
      P057S13_A136BarColNum = new int[1] ;
      P057S13_A135BarColNom = new String[] {""} ;
      P057S13_A1234BarNomCli = new String[] {""} ;
      P057S13_A4812BarEncCli = new String[] {""} ;
      P057S13_A252CliCod = new int[1] ;
      P057S13_n252CliCod = new boolean[] {false} ;
      P057S13_A218BarTipCol = new byte[1] ;
      A130BarCodPar = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A4812BarEncCli = "" ;
      AV200ArtDsc = "" ;
      AV206BarColNom = "" ;
      AV300BarNomcli = "" ;
      GXv_char4 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new short[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXv_char14 = new String[1] ;
      GXv_char15 = new String[1] ;
      P057S14_A44AlbRecCod = new int[1] ;
      P057S14_A396EmprCod = new String[] {""} ;
      P057S14_A129BarCod = new int[1] ;
      P057S14_A132BarCodReo = new byte[1] ;
      P057S14_A130BarCodPar = new String[] {""} ;
      P057S14_A5806AlbREnt2 = new String[] {""} ;
      P057S14_A200BarPieCod = new String[] {""} ;
      A5806AlbREnt2 = "" ;
      A200BarPieCod = "" ;
      AV198Albrent2 = "" ;
      P057S15_A758ProCod = new String[] {""} ;
      P057S15_A396EmprCod = new String[] {""} ;
      P057S15_A129BarCod = new int[1] ;
      P057S15_A132BarCodReo = new byte[1] ;
      P057S15_A130BarCodPar = new String[] {""} ;
      P057S15_A761ProFasLin = new short[1] ;
      P057S15_n761ProFasLin = new boolean[] {false} ;
      P057S15_A759ProDsc = new String[] {""} ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      AV196AlbHdrobs = "" ;
      P057S17_A396EmprCod = new String[] {""} ;
      P057S17_A130BarCodPar = new String[] {""} ;
      P057S17_A132BarCodReo = new byte[1] ;
      P057S17_A129BarCod = new int[1] ;
      P057S17_A30AlbProCod = new long[1] ;
      P057S17_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S17_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P057S17_A1379AlbBarPie = new short[1] ;
      P057S17_n1379AlbBarPie = new boolean[] {false} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV159FpgDsc = "" ;
      P057S18_A396EmprCod = new String[] {""} ;
      P057S18_A497FpgCod = new String[] {""} ;
      P057S18_A498FpgDsc = new String[] {""} ;
      P057S18_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      AV220CliPagNom = "" ;
      AV219CliPagDom = "" ;
      AV221CliPagPob = "" ;
      P057S19_A396EmprCod = new String[] {""} ;
      P057S19_A287CliPagLin = new byte[1] ;
      P057S19_A252CliCod = new int[1] ;
      P057S19_n252CliCod = new boolean[] {false} ;
      P057S19_A288CliPagNom = new String[] {""} ;
      P057S19_A284CliPagCue = new String[] {""} ;
      P057S19_A285CliPagDig = new String[] {""} ;
      P057S19_A283CliPagCcs = new String[] {""} ;
      P057S19_A282CliPagCcb = new String[] {""} ;
      A288CliPagNom = "" ;
      A284CliPagCue = "" ;
      A285CliPagDig = "" ;
      A283CliPagCcs = "" ;
      A282CliPagCcb = "" ;
      AV218CliPagCta = "" ;
      AV306Totcant = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfacterm__default(),
         new Object[] {
             new Object[] {
            P057S2_A396EmprCod, P057S2_A407EmprNom, P057S2_n407EmprNom, P057S2_A404EmprDir, P057S2_n404EmprDir, P057S2_A408EmprPob, P057S2_n408EmprPob, P057S2_A409EmprTel, P057S2_n409EmprTel, P057S2_A405EmprFax,
            P057S2_n405EmprFax, P057S2_A395EmprCif, P057S2_n395EmprCif, P057S2_A8334EmpItm1, P057S2_n8334EmpItm1, P057S2_A8335EmpItm2, P057S2_n8335EmpItm2, P057S2_A8336EmpItm3, P057S2_n8336EmpItm3, P057S2_A8337EmpItm4,
            P057S2_n8337EmpItm4, P057S2_A8338EmpItm5, P057S2_n8338EmpItm5, P057S2_A11516EmpItm6, P057S2_n11516EmpItm6
            }
            , new Object[] {
            P057S3_A396EmprCod, P057S3_A430FacCod, P057S3_A7211Factrm, P057S3_A449FacPreMts, P057S3_A447FacMts, P057S3_A448FacPreKgs, P057S3_A444FacKgs, P057S3_A7212FacRect, P057S3_A11513FacRecIca, P057S3_A8346FacRecI,
            P057S3_n8346FacRecI, P057S3_A443FacIVAPor, P057S3_A11626FacMan, P057S3_A446FacLin
            }
            , new Object[] {
            P057S4_A7210FacObs, P057S4_A396EmprCod, P057S4_A7211Factrm, P057S4_A430FacCod, P057S4_A435FacEst, P057S4_A437FacFpg, P057S4_A252CliCod, P057S4_A450FacPri, P057S4_A436FacFch, P057S4_A11513FacRecIca,
            P057S4_A8346FacRecI, P057S4_n8346FacRecI, P057S4_A7212FacRect, P057S4_A453FacRECPor, P057S4_A443FacIVAPor, P057S4_A14224FacCostFac, P057S4_A14223FacCostKgs, P057S4_A14222FacCostMts, P057S4_A14219FacEnergia, P057S4_A433FacDtoGen,
            P057S4_A434FacDtoPP
            }
            , new Object[] {
            P057S5_A7209Colombia, P057S5_n7209Colombia
            }
            , new Object[] {
            P057S6_A781PrvCod, P057S6_A3644CliNom1, P057S6_A279CliNom, P057S6_A295CliPob, P057S6_A303CliTel1, P057S6_A260CliDom, P057S6_A278CliNif
            }
            , new Object[] {
            P057S7_A787PrvDsc, P057S7_n787PrvDsc
            }
            , new Object[] {
            P057S9_A3918FacImpTot1
            }
            , new Object[] {
            P057S10_A396EmprCod, P057S10_A430FacCod, P057S10_A956FacVtoLin, P057S10_A957FacVtoFch, P057S10_n957FacVtoFch
            }
            , new Object[] {
            P057S11_A396EmprCod, P057S11_A430FacCod, P057S11_A1294FacBarCod, P057S11_A1295FacBarReo, P057S11_A1296FacBarPar, P057S11_A427FacAlbCod, P057S11_A432FacDsc, P057S11_A3878FacColNom, P057S11_A446FacLin, P057S11_A12197FacUnds,
            P057S11_A3897FacKgsA, P057S11_A3898FacPreKgsA, P057S11_A12198FacPreUnd, P057S11_A449FacPreMts, P057S11_A5353FacImpMan, P057S11_A447FacMts, P057S11_A444FacKgs, P057S11_A448FacPreKgs, P057S11_A5355FacImpMin
            }
            , new Object[] {
            }
            , new Object[] {
            P057S13_A396EmprCod, P057S13_A130BarCodPar, P057S13_A132BarCodReo, P057S13_A129BarCod, P057S13_A1652BarSerDsc, P057S13_A212BarSer, P057S13_A136BarColNum, P057S13_A135BarColNom, P057S13_A1234BarNomCli, P057S13_A4812BarEncCli,
            P057S13_A252CliCod, P057S13_n252CliCod, P057S13_A218BarTipCol
            }
            , new Object[] {
            P057S14_A44AlbRecCod, P057S14_A396EmprCod, P057S14_A129BarCod, P057S14_A132BarCodReo, P057S14_A130BarCodPar, P057S14_A5806AlbREnt2, P057S14_A200BarPieCod
            }
            , new Object[] {
            P057S15_A758ProCod, P057S15_A396EmprCod, P057S15_A129BarCod, P057S15_A132BarCodReo, P057S15_A130BarCodPar, P057S15_A761ProFasLin, P057S15_n761ProFasLin, P057S15_A759ProDsc
            }
            , new Object[] {
            P057S17_A396EmprCod, P057S17_A130BarCodPar, P057S17_A132BarCodReo, P057S17_A129BarCod, P057S17_A30AlbProCod, P057S17_A1261BarAlbKgmE, P057S17_A1263BarAlbMtrE, P057S17_A1379AlbBarPie, P057S17_n1379AlbBarPie
            }
            , new Object[] {
            P057S18_A396EmprCod, P057S18_A497FpgCod, P057S18_A498FpgDsc, P057S18_n498FpgDsc
            }
            , new Object[] {
            P057S19_A396EmprCod, P057S19_A287CliPagLin, P057S19_A252CliCod, P057S19_A288CliPagNom, P057S19_A284CliPagCue, P057S19_A285CliPagDig, P057S19_A283CliPagCcs, P057S19_A282CliPagCcb
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A443FacIVAPor ;
   private byte AV189FacIvaPor ;
   private byte AV237F_pie ;
   private byte A435FacEst ;
   private byte A7209Colombia ;
   private byte AV274OtraPag ;
   private byte AV227ContLin ;
   private byte AV269Mes ;
   private byte AV231Dia ;
   private byte AV271NFpago ;
   private byte A956FacVtoLin ;
   private byte A1295FacBarReo ;
   private byte AV205BarCodReo ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte GXv_int6[] ;
   private byte A287CliPagLin ;
   private short A781PrvCod ;
   private short AV199Anyo ;
   private short AV193ALbbarpie ;
   private short AV272Nlin ;
   private short AV257i ;
   private short GXv_int7[] ;
   private short GXv_int13[] ;
   private short A761ProFasLin ;
   private short A1379AlbBarPie ;
   private short Gx_err ;
   private int AV190FacCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int AV286TotPzs ;
   private int A252CliCod ;
   private int AV216CliCod ;
   private int AV178FacRecImp ;
   private int AV247FacImpIca ;
   private int GX_I ;
   private int AV255FPagoPt[] ;
   private int A1294FacBarCod ;
   private int A12197FacUnds ;
   private int AV203BarCod ;
   private int AV171Facprem ;
   private int AV169FacPrek ;
   private int Gx_OldLine ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV207BarColNum ;
   private int GXv_int10[] ;
   private int A44AlbRecCod ;
   private long AV182FacTot_ ;
   private long AV246facImpGen ;
   private long A427FacAlbCod ;
   private long AV197AlbProCod ;
   private long AV238FacAlbCod ;
   private long AV284SumImp ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV184FACTRM ;
   private java.math.BigDecimal A7211Factrm ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal AV163Precio_trm ;
   private java.math.BigDecimal AV162FacImp ;
   private java.math.BigDecimal AV165TotM ;
   private java.math.BigDecimal AV164TotK ;
   private java.math.BigDecimal AV166FacImpTot ;
   private java.math.BigDecimal AV180FacRect ;
   private java.math.BigDecimal AV177FacRecIca ;
   private java.math.BigDecimal AV176FacRecI ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV294SumSig ;
   private java.math.BigDecimal AV275PDtoPP ;
   private java.math.BigDecimal AV260ImpDtoPP ;
   private java.math.BigDecimal AV241FacBasImp ;
   private java.math.BigDecimal AV187FacIvaImp ;
   private java.math.BigDecimal AV181FacTot ;
   private java.math.BigDecimal AV250facimpret ;
   private java.math.BigDecimal AV249FacImpRei ;
   private java.math.BigDecimal AV254Fpago[] ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal A2239FacIml ;
   private java.math.BigDecimal A3923FacImp1 ;
   private java.math.BigDecimal A438FacImp ;
   private java.math.BigDecimal AV168FacMts ;
   private java.math.BigDecimal AV173FacPreMts ;
   private java.math.BigDecimal AV167FacKgs ;
   private java.math.BigDecimal AV170FacPreKgs ;
   private java.math.BigDecimal AV285SumKgs ;
   private java.math.BigDecimal AV293SumMts ;
   private java.math.BigDecimal AV215Cant ;
   private java.math.BigDecimal AV304CantDp ;
   private java.math.BigDecimal AV303BarAlbKgme ;
   private java.math.BigDecimal AV279Precio ;
   private java.math.BigDecimal AV201BarAlbMtrE ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV306Totcant ;
   private String A396EmprCod ;
   private String AV191TextoCopia ;
   private String Gx_out ;
   private String AV310Val1 ;
   private String AV311Val2 ;
   private String AV312Val3 ;
   private String AV313Val4 ;
   private String AV314Val5 ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A408EmprPob ;
   private String A409EmprTel ;
   private String A405EmprFax ;
   private String A395EmprCif ;
   private String A8334EmpItm1 ;
   private String A8335EmpItm2 ;
   private String A8336EmpItm3 ;
   private String A8337EmpItm4 ;
   private String A8338EmpItm5 ;
   private String A11516EmpItm6 ;
   private String AV146Emprnom ;
   private String AV147EmprDir ;
   private String AV148EmprPob ;
   private String AV157Emprcpo ;
   private String AV149EmprTel ;
   private String AV150EmprFax ;
   private String AV156EmprCif ;
   private String AV145EmpItm1 ;
   private String AV151EmpItm2 ;
   private String AV152EmpItm3 ;
   private String AV153EmpItm4 ;
   private String AV154EmpItm5 ;
   private String AV155EmpItm6 ;
   private String AV308FacMan ;
   private String A11626FacMan ;
   private String AV301Unidad ;
   private String AV302TxtValor ;
   private String A437FacFpg ;
   private String A450FacPri ;
   private String A3644CliNom1 ;
   private String A279CliNom ;
   private String A295CliPob ;
   private String A303CliTel1 ;
   private String A260CliDom ;
   private String A278CliNif ;
   private String A787PrvDsc ;
   private String AV315Texto_pie ;
   private String AV309Txtresolucion ;
   private String AV307Txt1 ;
   private String AV230CopiaTex ;
   private String AV256FpgCod ;
   private String AV223CliPri ;
   private String AV174FacPri ;
   private String AV295TipoFra ;
   private String AV158CliNom_l ;
   private String AV222CliPob_l ;
   private String AV160Data_f ;
   private String AV161Data_v ;
   private String AV287Vencim[] ;
   private String AV288VtoTxt ;
   private String AV262ImpTxt ;
   private String AV291Texto1 ;
   private String AV292Texto2 ;
   private String AV264LastFacDsc ;
   private String A1296FacBarPar ;
   private String A432FacDsc ;
   private String A3878FacColNom ;
   private String AV204BarCodPar ;
   private String AV243FacDsc ;
   private String AV297Enccli ;
   private String AV298BarEnccli ;
   private String AV212BarSerDsc ;
   private String AV305IntDsc ;
   private String AV296Und ;
   private String AV268Linea_fc ;
   private String AV280procod ;
   private String AV281Prodsc ;
   private String A130BarCodPar ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A4812BarEncCli ;
   private String AV200ArtDsc ;
   private String AV206BarColNom ;
   private String AV300BarNomcli ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char14[] ;
   private String GXv_char15[] ;
   private String A5806AlbREnt2 ;
   private String A200BarPieCod ;
   private String AV198Albrent2 ;
   private String A758ProCod ;
   private String A759ProDsc ;
   private String AV196AlbHdrobs ;
   private String AV159FpgDsc ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private String AV220CliPagNom ;
   private String AV219CliPagDom ;
   private String AV221CliPagPob ;
   private String A288CliPagNom ;
   private String A284CliPagCue ;
   private String A285CliPagDig ;
   private String A283CliPagCcs ;
   private String A282CliPagCcb ;
   private String AV218CliPagCta ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV185FacVtoFch ;
   private java.util.Date A957FacVtoFch ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n409EmprTel ;
   private boolean n405EmprFax ;
   private boolean n395EmprCif ;
   private boolean n8334EmpItm1 ;
   private boolean n8335EmpItm2 ;
   private boolean n8336EmpItm3 ;
   private boolean n8337EmpItm4 ;
   private boolean n8338EmpItm5 ;
   private boolean n11516EmpItm6 ;
   private boolean n8346FacRecI ;
   private boolean GxHdr4 ;
   private boolean n252CliCod ;
   private boolean n7209Colombia ;
   private boolean n787PrvDsc ;
   private boolean returnInSub ;
   private boolean n957FacVtoFch ;
   private boolean n761ProFasLin ;
   private boolean n1379AlbBarPie ;
   private boolean n498FpgDsc ;
   private String A7210FacObs ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P057S2_A396EmprCod ;
   private String[] P057S2_A407EmprNom ;
   private boolean[] P057S2_n407EmprNom ;
   private String[] P057S2_A404EmprDir ;
   private boolean[] P057S2_n404EmprDir ;
   private String[] P057S2_A408EmprPob ;
   private boolean[] P057S2_n408EmprPob ;
   private String[] P057S2_A409EmprTel ;
   private boolean[] P057S2_n409EmprTel ;
   private String[] P057S2_A405EmprFax ;
   private boolean[] P057S2_n405EmprFax ;
   private String[] P057S2_A395EmprCif ;
   private boolean[] P057S2_n395EmprCif ;
   private String[] P057S2_A8334EmpItm1 ;
   private boolean[] P057S2_n8334EmpItm1 ;
   private String[] P057S2_A8335EmpItm2 ;
   private boolean[] P057S2_n8335EmpItm2 ;
   private String[] P057S2_A8336EmpItm3 ;
   private boolean[] P057S2_n8336EmpItm3 ;
   private String[] P057S2_A8337EmpItm4 ;
   private boolean[] P057S2_n8337EmpItm4 ;
   private String[] P057S2_A8338EmpItm5 ;
   private boolean[] P057S2_n8338EmpItm5 ;
   private String[] P057S2_A11516EmpItm6 ;
   private boolean[] P057S2_n11516EmpItm6 ;
   private String[] P057S3_A396EmprCod ;
   private int[] P057S3_A430FacCod ;
   private java.math.BigDecimal[] P057S3_A7211Factrm ;
   private java.math.BigDecimal[] P057S3_A449FacPreMts ;
   private java.math.BigDecimal[] P057S3_A447FacMts ;
   private java.math.BigDecimal[] P057S3_A448FacPreKgs ;
   private java.math.BigDecimal[] P057S3_A444FacKgs ;
   private java.math.BigDecimal[] P057S3_A7212FacRect ;
   private java.math.BigDecimal[] P057S3_A11513FacRecIca ;
   private java.math.BigDecimal[] P057S3_A8346FacRecI ;
   private boolean[] P057S3_n8346FacRecI ;
   private byte[] P057S3_A443FacIVAPor ;
   private String[] P057S3_A11626FacMan ;
   private int[] P057S3_A446FacLin ;
   private String[] P057S4_A7210FacObs ;
   private String[] P057S4_A396EmprCod ;
   private java.math.BigDecimal[] P057S4_A7211Factrm ;
   private int[] P057S4_A430FacCod ;
   private byte[] P057S4_A435FacEst ;
   private String[] P057S4_A437FacFpg ;
   private int[] P057S4_A252CliCod ;
   private boolean[] P057S4_n252CliCod ;
   private String[] P057S4_A450FacPri ;
   private java.util.Date[] P057S4_A436FacFch ;
   private java.math.BigDecimal[] P057S4_A11513FacRecIca ;
   private java.math.BigDecimal[] P057S4_A8346FacRecI ;
   private boolean[] P057S4_n8346FacRecI ;
   private java.math.BigDecimal[] P057S4_A7212FacRect ;
   private java.math.BigDecimal[] P057S4_A453FacRECPor ;
   private byte[] P057S4_A443FacIVAPor ;
   private java.math.BigDecimal[] P057S4_A14224FacCostFac ;
   private java.math.BigDecimal[] P057S4_A14223FacCostKgs ;
   private java.math.BigDecimal[] P057S4_A14222FacCostMts ;
   private java.math.BigDecimal[] P057S4_A14219FacEnergia ;
   private java.math.BigDecimal[] P057S4_A433FacDtoGen ;
   private java.math.BigDecimal[] P057S4_A434FacDtoPP ;
   private byte[] P057S5_A7209Colombia ;
   private boolean[] P057S5_n7209Colombia ;
   private short[] P057S6_A781PrvCod ;
   private String[] P057S6_A3644CliNom1 ;
   private String[] P057S6_A279CliNom ;
   private String[] P057S6_A295CliPob ;
   private String[] P057S6_A303CliTel1 ;
   private String[] P057S6_A260CliDom ;
   private String[] P057S6_A278CliNif ;
   private String[] P057S7_A787PrvDsc ;
   private boolean[] P057S7_n787PrvDsc ;
   private java.math.BigDecimal[] P057S9_A3918FacImpTot1 ;
   private String[] P057S10_A396EmprCod ;
   private int[] P057S10_A430FacCod ;
   private byte[] P057S10_A956FacVtoLin ;
   private java.util.Date[] P057S10_A957FacVtoFch ;
   private boolean[] P057S10_n957FacVtoFch ;
   private String[] P057S11_A396EmprCod ;
   private int[] P057S11_A430FacCod ;
   private int[] P057S11_A1294FacBarCod ;
   private byte[] P057S11_A1295FacBarReo ;
   private String[] P057S11_A1296FacBarPar ;
   private long[] P057S11_A427FacAlbCod ;
   private String[] P057S11_A432FacDsc ;
   private String[] P057S11_A3878FacColNom ;
   private int[] P057S11_A446FacLin ;
   private int[] P057S11_A12197FacUnds ;
   private java.math.BigDecimal[] P057S11_A3897FacKgsA ;
   private java.math.BigDecimal[] P057S11_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P057S11_A12198FacPreUnd ;
   private java.math.BigDecimal[] P057S11_A449FacPreMts ;
   private java.math.BigDecimal[] P057S11_A5353FacImpMan ;
   private java.math.BigDecimal[] P057S11_A447FacMts ;
   private java.math.BigDecimal[] P057S11_A444FacKgs ;
   private java.math.BigDecimal[] P057S11_A448FacPreKgs ;
   private java.math.BigDecimal[] P057S11_A5355FacImpMin ;
   private String[] P057S13_A396EmprCod ;
   private String[] P057S13_A130BarCodPar ;
   private byte[] P057S13_A132BarCodReo ;
   private int[] P057S13_A129BarCod ;
   private String[] P057S13_A1652BarSerDsc ;
   private String[] P057S13_A212BarSer ;
   private int[] P057S13_A136BarColNum ;
   private String[] P057S13_A135BarColNom ;
   private String[] P057S13_A1234BarNomCli ;
   private String[] P057S13_A4812BarEncCli ;
   private int[] P057S13_A252CliCod ;
   private boolean[] P057S13_n252CliCod ;
   private byte[] P057S13_A218BarTipCol ;
   private int[] P057S14_A44AlbRecCod ;
   private String[] P057S14_A396EmprCod ;
   private int[] P057S14_A129BarCod ;
   private byte[] P057S14_A132BarCodReo ;
   private String[] P057S14_A130BarCodPar ;
   private String[] P057S14_A5806AlbREnt2 ;
   private String[] P057S14_A200BarPieCod ;
   private String[] P057S15_A758ProCod ;
   private String[] P057S15_A396EmprCod ;
   private int[] P057S15_A129BarCod ;
   private byte[] P057S15_A132BarCodReo ;
   private String[] P057S15_A130BarCodPar ;
   private short[] P057S15_A761ProFasLin ;
   private boolean[] P057S15_n761ProFasLin ;
   private String[] P057S15_A759ProDsc ;
   private String[] P057S17_A396EmprCod ;
   private String[] P057S17_A130BarCodPar ;
   private byte[] P057S17_A132BarCodReo ;
   private int[] P057S17_A129BarCod ;
   private long[] P057S17_A30AlbProCod ;
   private java.math.BigDecimal[] P057S17_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P057S17_A1263BarAlbMtrE ;
   private short[] P057S17_A1379AlbBarPie ;
   private boolean[] P057S17_n1379AlbBarPie ;
   private String[] P057S18_A396EmprCod ;
   private String[] P057S18_A497FpgCod ;
   private String[] P057S18_A498FpgDsc ;
   private boolean[] P057S18_n498FpgDsc ;
   private String[] P057S19_A396EmprCod ;
   private byte[] P057S19_A287CliPagLin ;
   private int[] P057S19_A252CliCod ;
   private boolean[] P057S19_n252CliCod ;
   private String[] P057S19_A288CliPagNom ;
   private String[] P057S19_A284CliPagCue ;
   private String[] P057S19_A285CliPagDig ;
   private String[] P057S19_A283CliPagCcs ;
   private String[] P057S19_A282CliPagCcb ;
}

final  class pfacterm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P057S2", "SELECT EmprCod, EmprNom, EmprDir, EmprPob, EmprTel, EmprFax, EmprCif, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057S3", "SELECT T1.EmprCod, T1.FacCod, T2.Factrm, T1.FacPreMts, T1.FacMts, T1.FacPreKgs, T1.FacKgs, T2.FacRect, T2.FacRecIca, T2.FacRecI, T2.FacIVAPor, T2.FacMan, T1.FacLin FROM (TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) WHERE T1.EmprCod = ? and T1.FacCod = ? ORDER BY T1.EmprCod, T1.FacCod, T1.FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057S4", "SELECT FacObs, EmprCod, Factrm, FacCod, FacEst, FacFpg, CliCod, FacPri, FacFch, FacRecIca, FacRecI, FacRect, FacRECPor, FacIVAPor, FacCostFac, FacCostKgs, FacCostMts, FacEnergia, FacDtoGen, FacDtoPP FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?)  FOR UPDATE OF FacEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057S5", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057S6", "SELECT PrvCod, CliNom1, CliNom, CliPob, CliTel1, CliDom, CliNif FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057S7", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057S9", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057S10", "SELECT EmprCod, FacCod, FacVtoLin, FacVtoFch FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057S11", "SELECT EmprCod, FacCod, FacBarCod, FacBarReo, FacBarPar, FacAlbCod, FacDsc, FacColNom, FacLin, FacUnds, FacKgsA, FacPreKgsA, FacPreUnd, FacPreMts, FacImpMan, FacMts, FacKgs, FacPreKgs, FacImpMin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P057S12", "UPDATE TXPCFAVEN SET FacEst=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new ForEachCursor("P057S13", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSerDsc, BarSer, BarColNum, BarColNom, BarNomCli, BarEncCli, CliCod, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057S14", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbREnt2, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057S15", "SELECT T1.ProCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProFasLin, T2.ProDsc FROM (TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P057S17", "SELECT * FROM (SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.BarAlbKgmE, T1.BarAlbMtrE, COALESCE( T2.AlbBarPie, 0) AS AlbBarPie FROM (TXPALBBAR T1 LEFT JOIN (SELECT COUNT(*) AS AlbBarPie, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALPRD GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057S18", "SELECT EmprCod, FpgCod, FpgDsc FROM TXPFORPAG WHERE EmprCod = ? and FpgCod = ? ORDER BY EmprCod, FpgCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P057S19", "SELECT EmprCod, CliPagLin, CliCod, CliPagNom, CliPagCue, CliPagDig, CliPagCcs, CliPagCcb FROM TXPCLIPAG WHERE (EmprCod = ? and CliCod = ?) AND (CliPagLin = TO_NUMBER(NVL(TRIM(?), '0'))) ORDER BY EmprCod, CliCod, CliPagLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 35);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 35);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 15);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 100);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 100);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 100);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 100);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 100);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,3);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 15);
               ((String[]) buf[5])[0] = rslt.getString(6, 34);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 40);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(19,2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 40);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 2);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

