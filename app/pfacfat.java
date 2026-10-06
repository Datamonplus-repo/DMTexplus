package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pfacfat extends GXReport
{
   public pfacfat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacfat.class ), "" );
   }

   public pfacfat( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pfacfat.this.aP3 = new String[] {""};
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
      pfacfat.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacfat.this.AV16FacCod = aP1[0];
      this.aP1 = aP1;
      pfacfat.this.AV109TextoCopia = aP2[0];
      this.aP2 = aP2;
      pfacfat.this.Gx_out = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 30 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         super.Gx_out = this.Gx_out ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "REPGRAF", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("FACTURA") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*30)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV129Texto_l ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pbusdsc2(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FACFAT", ""), GXv_char2) ;
         pfacfat.this.GXt_char1 = GXv_char2[0] ;
         AV129Texto_l = GXt_char1 ;
         GXt_int3 = AV169Noagrupo ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "AGRLIN", ""), GXv_int4) ;
         pfacfat.this.GXt_int3 = GXv_int4[0] ;
         AV169Noagrupo = GXt_int3 ;
         GXt_int3 = AV176Sicalidad ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CALFAT", ""), GXv_int4) ;
         pfacfat.this.GXt_int3 = GXv_int4[0] ;
         AV176Sicalidad = GXt_int3 ;
         AV177titCalidad = ((AV176Sicalidad==1) ? httpContext.getMessage( "CALIDAD", "") : " ") ;
         AV112Emprnom = httpContext.getMessage( "FATELCA S.A.S", "") ;
         AV97EmprDir = httpContext.getMessage( "CARRERA 69B Nª21-37 SUR", "") ;
         AV98EmprPob = httpContext.getMessage( "BOGOTA -D.C. -COLOMBIA", "") ;
         AV99EmprTel = "2614000" ;
         AV101EmprFax = "2903181" ;
         AV139EmprCif = "900.177.712-0" ;
         AV141EmpItm1 = httpContext.getMessage( "NO SOMOS AUTORRETENEDORES - NO SOMOS GRANDES CONTRIBUYENTES", "") ;
         AV142EmpItm2 = httpContext.getMessage( "Numeracion Autorizada por la DIAN segun resolucion Nº.320001", "") ;
         AV150EmpItm6 = httpContext.getMessage( "a SAS 5000, AUTO. SAS 5001 hasta 10000", "") ;
         AV143EmpItm3 = httpContext.getMessage( "www.fatelca.com e-mail:info@fatelca.com", "") ;
         AV140EmpItm4 = httpContext.getMessage( "Actividad ICA: 1720 -11040 x 1000 y 5232 -11040 x 1000", "") ;
         /* Using cursor P04KD2 */
         pr_default.execute(0, new Object[] {AV15EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P04KD2_A396EmprCod[0] ;
            A407EmprNom = P04KD2_A407EmprNom[0] ;
            n407EmprNom = P04KD2_n407EmprNom[0] ;
            A404EmprDir = P04KD2_A404EmprDir[0] ;
            n404EmprDir = P04KD2_n404EmprDir[0] ;
            A408EmprPob = P04KD2_A408EmprPob[0] ;
            n408EmprPob = P04KD2_n408EmprPob[0] ;
            A409EmprTel = P04KD2_A409EmprTel[0] ;
            n409EmprTel = P04KD2_n409EmprTel[0] ;
            A405EmprFax = P04KD2_A405EmprFax[0] ;
            n405EmprFax = P04KD2_n405EmprFax[0] ;
            A395EmprCif = P04KD2_A395EmprCif[0] ;
            n395EmprCif = P04KD2_n395EmprCif[0] ;
            A8334EmpItm1 = P04KD2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P04KD2_n8334EmpItm1[0] ;
            A8335EmpItm2 = P04KD2_A8335EmpItm2[0] ;
            n8335EmpItm2 = P04KD2_n8335EmpItm2[0] ;
            A8336EmpItm3 = P04KD2_A8336EmpItm3[0] ;
            n8336EmpItm3 = P04KD2_n8336EmpItm3[0] ;
            A8337EmpItm4 = P04KD2_A8337EmpItm4[0] ;
            n8337EmpItm4 = P04KD2_n8337EmpItm4[0] ;
            A8338EmpItm5 = P04KD2_A8338EmpItm5[0] ;
            n8338EmpItm5 = P04KD2_n8338EmpItm5[0] ;
            A11516EmpItm6 = P04KD2_A11516EmpItm6[0] ;
            n11516EmpItm6 = P04KD2_n11516EmpItm6[0] ;
            AV112Emprnom = A407EmprNom ;
            AV97EmprDir = A404EmprDir ;
            AV98EmprPob = A408EmprPob ;
            AV99EmprTel = A409EmprTel ;
            AV101EmprFax = A405EmprFax ;
            AV139EmprCif = A395EmprCif ;
            AV141EmpItm1 = GXutil.substring( A8334EmpItm1, 1, 60) ;
            AV142EmpItm2 = A8335EmpItm2 ;
            AV143EmpItm3 = GXutil.substring( A8336EmpItm3, 1, 45) ;
            AV140EmpItm4 = GXutil.substring( A8337EmpItm4, 1, 60) ;
            AV145EmpItm5 = GXutil.substring( A8338EmpItm5, 1, 45) ;
            AV150EmpItm6 = GXutil.substring( A11516EmpItm6, 1, 45) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV137FacTot_ = 0 ;
         AV131FACTRM = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P04KD3 */
         pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV16FacCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A430FacCod = P04KD3_A430FacCod[0] ;
            A396EmprCod = P04KD3_A396EmprCod[0] ;
            A7211Factrm = P04KD3_A7211Factrm[0] ;
            A449FacPreMts = P04KD3_A449FacPreMts[0] ;
            A447FacMts = P04KD3_A447FacMts[0] ;
            A448FacPreKgs = P04KD3_A448FacPreKgs[0] ;
            A444FacKgs = P04KD3_A444FacKgs[0] ;
            A7212FacRect = P04KD3_A7212FacRect[0] ;
            A11513FacRecIca = P04KD3_A11513FacRecIca[0] ;
            A8346FacRecI = P04KD3_A8346FacRecI[0] ;
            n8346FacRecI = P04KD3_n8346FacRecI[0] ;
            A443FacIVAPor = P04KD3_A443FacIVAPor[0] ;
            A446FacLin = P04KD3_A446FacLin[0] ;
            A7211Factrm = P04KD3_A7211Factrm[0] ;
            A7212FacRect = P04KD3_A7212FacRect[0] ;
            A11513FacRecIca = P04KD3_A11513FacRecIca[0] ;
            A8346FacRecI = P04KD3_A8346FacRecI[0] ;
            n8346FacRecI = P04KD3_n8346FacRecI[0] ;
            A443FacIVAPor = P04KD3_A443FacIVAPor[0] ;
            if ( A7211Factrm.doubleValue() > 0 )
            {
               if ( A449FacPreMts.doubleValue() > 0 )
               {
                  AV136Precio_trm = GXutil.roundDecimal( A449FacPreMts.divide(A7211Factrm, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV45FacImp = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( AV136Precio_trm.multiply(A447FacMts), 0))) ;
                  AV162TotM = AV162TotM.add(A447FacMts) ;
               }
               if ( A448FacPreKgs.doubleValue() > 0 )
               {
                  AV136Precio_trm = GXutil.roundDecimal( A448FacPreKgs.divide(A7211Factrm, 18, java.math.RoundingMode.DOWN), 2) ;
                  AV45FacImp = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( AV136Precio_trm.multiply(A444FacKgs), 0))) ;
                  AV161TotK = AV161TotK.add(A444FacKgs) ;
               }
            }
            AV38FacImpTot = (long)(AV38FacImpTot+AV45FacImp) ;
            AV137FacTot_ = (long)(AV137FacTot_+AV45FacImp) ;
            AV41FacTot = (long)(AV41FacTot+AV45FacImp) ;
            AV39FacBasImp = (long)(AV39FacBasImp+AV45FacImp) ;
            AV131FACTRM = A7211Factrm ;
            AV138FacRect = A7212FacRect ;
            AV163FacRecIca = A11513FacRecIca ;
            AV164FacRecI = A8346FacRecI ;
            AV106FacIvaPor = A443FacIVAPor ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( AV131FACTRM.doubleValue() > 0 )
         {
            AV40FacIvaImp = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec((AV39FacBasImp*AV106FacIvaPor)/ (double) (100)), 0))) ;
            AV135facimpret = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV38FacImpTot).multiply(AV138FacRect)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0))) ;
            AV147FacImpRei = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV40FacIvaImp).multiply(AV164FacRecI)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 0))) ;
            AV149FacImpIca = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV38FacImpTot).multiply(AV163FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 0))) ;
            AV41FacTot = (long)(AV39FacBasImp+AV40FacIvaImp-AV135facimpret-AV147FacImpRei-AV149FacImpIca) ;
            AV137FacTot_ = AV41FacTot ;
         }
         AV111F_pie = (byte)(1) ;
         GxHdr4 = true ;
         /* Using cursor P04KD4 */
         pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV16FacCod), AV15EmprCod, Integer.valueOf(AV16FacCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A7210FacObs = P04KD4_A7210FacObs[0] ;
            A7211Factrm = P04KD4_A7211Factrm[0] ;
            A430FacCod = P04KD4_A430FacCod[0] ;
            A396EmprCod = P04KD4_A396EmprCod[0] ;
            A437FacFpg = P04KD4_A437FacFpg[0] ;
            A450FacPri = P04KD4_A450FacPri[0] ;
            A436FacFch = P04KD4_A436FacFch[0] ;
            A252CliCod = P04KD4_A252CliCod[0] ;
            A435FacEst = P04KD4_A435FacEst[0] ;
            A11513FacRecIca = P04KD4_A11513FacRecIca[0] ;
            A8346FacRecI = P04KD4_A8346FacRecI[0] ;
            n8346FacRecI = P04KD4_n8346FacRecI[0] ;
            A7212FacRect = P04KD4_A7212FacRect[0] ;
            A453FacRECPor = P04KD4_A453FacRECPor[0] ;
            A443FacIVAPor = P04KD4_A443FacIVAPor[0] ;
            A14224FacCostFac = P04KD4_A14224FacCostFac[0] ;
            A14223FacCostKgs = P04KD4_A14223FacCostKgs[0] ;
            A14222FacCostMts = P04KD4_A14222FacCostMts[0] ;
            A14219FacEnergia = P04KD4_A14219FacEnergia[0] ;
            A433FacDtoGen = P04KD4_A433FacDtoGen[0] ;
            A434FacDtoPP = P04KD4_A434FacDtoPP[0] ;
            A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
            A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
            /* Using cursor P04KD5 */
            pr_default.execute(3, new Object[] {A396EmprCod});
            A7209Colombia = P04KD5_A7209Colombia[0] ;
            n7209Colombia = P04KD5_n7209Colombia[0] ;
            /* Using cursor P04KD6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
            A781PrvCod = P04KD6_A781PrvCod[0] ;
            A3644CliNom1 = P04KD6_A3644CliNom1[0] ;
            A279CliNom = P04KD6_A279CliNom[0] ;
            A295CliPob = P04KD6_A295CliPob[0] ;
            A293CliPer = P04KD6_A293CliPer[0] ;
            A303CliTel1 = P04KD6_A303CliTel1[0] ;
            A260CliDom = P04KD6_A260CliDom[0] ;
            A278CliNif = P04KD6_A278CliNif[0] ;
            /* Using cursor P04KD7 */
            pr_default.execute(5, new Object[] {Short.valueOf(A781PrvCod)});
            A787PrvDsc = P04KD7_A787PrvDsc[0] ;
            n787PrvDsc = P04KD7_n787PrvDsc[0] ;
            /* Using cursor P04KD9 */
            pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            if ( (pr_default.getStatus(6) != 101) )
            {
               A3918FacImpTot1 = P04KD9_A3918FacImpTot1[0] ;
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
            AV88CopiaTex = "" ;
            AV36OtraPag = (byte)(0) ;
            AV48ContLin = (byte)(0) ;
            Gx_page = 0 ;
            AV37SumSig = DecimalUtil.doubleToDec(0) ;
            AV26FpgCod = A437FacFpg ;
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
            if ( A7211Factrm.doubleValue() == 0 )
            {
               AV30PDtoPP = A434FacDtoPP ;
               AV35ImpDtoPP = A440FacImpPP ;
               AV124facImpGen = (long)(DecimalUtil.decToDouble(A439FacImpGen)) ;
               AV38FacImpTot = (long)(DecimalUtil.decToDouble(A441FacImpTot)) ;
               AV39FacBasImp = (long)(DecimalUtil.decToDouble(A429FacBasImp)) ;
               AV106FacIvaPor = A443FacIVAPor ;
               AV40FacIvaImp = (long)(DecimalUtil.decToDouble(A442FacIVAImp)) ;
               AV42FacRecImp = (int)(DecimalUtil.decToDouble(A452FacRecImp)) ;
               AV41FacTot = (long)(DecimalUtil.decToDouble(A455FacTot)) ;
               AV137FacTot_ = (long)(DecimalUtil.decToDouble(A455FacTot)) ;
               AV135facimpret = (int)(DecimalUtil.decToDouble(A7213FacImpRet)) ;
               AV147FacImpRei = (int)(DecimalUtil.decToDouble(A8347FacImpReI)) ;
               AV149FacImpIca = (int)(DecimalUtil.decToDouble(A11515FacImpIca)) ;
            }
            AV105FacPri = A450FacPri ;
            AV46TipoFra = "" ;
            AV113CliNom_l = GXutil.trim( A279CliNom) + GXutil.trim( A3644CliNom1) ;
            AV114CliPob_l = GXutil.trim( A295CliPob) ;
            AV115Anyo = (short)(GXutil.year( A436FacFch)) ;
            AV116Mes = (byte)(GXutil.month( A436FacFch)) ;
            AV117Dia = (byte)(GXutil.day( A436FacFch)) ;
            AV118Data_f = GXutil.str( AV115Anyo, 4, 0) + " " + GXutil.str( AV116Mes, 2, 0) + " " + GXutil.str( AV117Dia, 2, 0) ;
            AV119Data_v = GXutil.space( (short)(10)) ;
            AV120FacVtoFch = GXutil.nullDate() ;
            AV21NFpago = (byte)(1) ;
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV32Fpago[GX_I-1] = DecimalUtil.ZERO ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV85FPagoPt[GX_I-1] = 0 ;
               GX_I = (int)(GX_I+1) ;
            }
            GX_I = 1 ;
            while ( GX_I <= 4 )
            {
               AV31Vencim[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV103VtoTxt = "" ;
            AV104ImpTxt = "" ;
            /* Using cursor P04KD10 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A956FacVtoLin = P04KD10_A956FacVtoLin[0] ;
               A957FacVtoFch = P04KD10_A957FacVtoFch[0] ;
               n957FacVtoFch = P04KD10_n957FacVtoFch[0] ;
               AV120FacVtoFch = A957FacVtoFch ;
               pr_default.readNext(7);
            }
            pr_default.close(7);
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120FacVtoFch)) )
            {
               AV115Anyo = (short)(GXutil.year( AV120FacVtoFch)) ;
               AV116Mes = (byte)(GXutil.month( AV120FacVtoFch)) ;
               AV117Dia = (byte)(GXutil.day( AV120FacVtoFch)) ;
               AV119Data_v = GXutil.str( AV115Anyo, 4, 0) + " " + GXutil.str( AV116Mes, 2, 0) + " " + GXutil.str( AV117Dia, 2, 0) ;
            }
            GXv_decimal5[0] = DecimalUtil.doubleToDec(AV137FacTot_) ;
            GXv_char2[0] = AV125Texto1 ;
            GXv_char6[0] = AV126Texto2 ;
            GXv_decimal7[0] = AV131FACTRM ;
            GXv_int4[0] = (byte)(80) ;
            new app.pconvnuc(remoteHandle, context).execute( GXv_decimal5, GXv_char2, GXv_char6, GXv_decimal7, GXv_int4) ;
            pfacfat.this.AV137FacTot_ = (long)(DecimalUtil.decToDouble(GXv_decimal5[0])) ;
            pfacfat.this.AV125Texto1 = GXv_char2[0] ;
            pfacfat.this.AV126Texto2 = GXv_char6[0] ;
            pfacfat.this.AV131FACTRM = GXv_decimal7[0] ;
            AV160Txt0 = AV112Emprnom ;
            AV153Txt1 = httpContext.getMessage( "N.I.T.:", "") + GXutil.trim( AV139EmprCif) + " " + httpContext.getMessage( "REGIMEN COMÚN", "") ;
            AV154Txt2 = GXutil.trim( AV97EmprDir) + " " + GXutil.trim( AV98EmprPob) ;
            AV155Txt3 = httpContext.getMessage( "PBX:", "") + GXutil.trim( AV99EmprTel) + " " + httpContext.getMessage( "FAX:", "") + AV101EmprFax ;
            AV156Txt4 = GXutil.trim( AV141EmpItm1) ;
            AV157Txt5 = GXutil.trim( AV140EmpItm4) ;
            AV158Txt6 = AV142EmpItm2 + " " + GXutil.trim( AV150EmpItm6) ;
            AV159Txt7 = GXutil.trim( AV143EmpItm3) ;
            AV165LastFacDsc = " " ;
            GX_I = 1 ;
            while ( GX_I <= 100 )
            {
               AV170Tab_calidad[GX_I-1] = "" ;
               GX_I = (int)(GX_I+1) ;
            }
            AV133i = (short)(1) ;
            /* Using cursor P04KD11 */
            pr_default.execute(8, new Object[] {AV15EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A396EmprCod = P04KD11_A396EmprCod[0] ;
               A432FacDsc = P04KD11_A432FacDsc[0] ;
               A1294FacBarCod = P04KD11_A1294FacBarCod[0] ;
               A1295FacBarReo = P04KD11_A1295FacBarReo[0] ;
               A1296FacBarPar = P04KD11_A1296FacBarPar[0] ;
               A427FacAlbCod = P04KD11_A427FacAlbCod[0] ;
               A446FacLin = P04KD11_A446FacLin[0] ;
               A12197FacUnds = P04KD11_A12197FacUnds[0] ;
               A3897FacKgsA = P04KD11_A3897FacKgsA[0] ;
               A3898FacPreKgsA = P04KD11_A3898FacPreKgsA[0] ;
               A12198FacPreUnd = P04KD11_A12198FacPreUnd[0] ;
               A449FacPreMts = P04KD11_A449FacPreMts[0] ;
               A5353FacImpMan = P04KD11_A5353FacImpMan[0] ;
               A447FacMts = P04KD11_A447FacMts[0] ;
               A444FacKgs = P04KD11_A444FacKgs[0] ;
               A448FacPreKgs = P04KD11_A448FacPreKgs[0] ;
               A5355FacImpMin = P04KD11_A5355FacImpMin[0] ;
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
               if ( ( GXutil.strcmp(AV165LastFacDsc, A432FacDsc) != 0 ) && ( GXutil.strcmp(AV165LastFacDsc, " ") != 0 ) && ( AV169Noagrupo == 1 ) )
               {
                  AV172t = (short)(1) ;
                  AV175TxtCalidad = "" ;
                  while ( AV133i <= 100 )
                  {
                     if ( GXutil.strcmp(AV170Tab_calidad[AV172t-1], " ") == 0 )
                     {
                        if (true) break;
                     }
                     AV174Calidad = AV170Tab_calidad[AV172t-1] ;
                     AV175TxtCalidad += AV174Calidad ;
                     AV172t = (short)(AV172t+1) ;
                  }
                  AV175TxtCalidad = httpContext.getMessage( "A", "") ;
                  if ( AV48ContLin >= 13 )
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
                     AV48ContLin = (byte)(0) ;
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
                  }
                  h4KD0( false, 16) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54FacAlbCod), "ZZZZZZZZZZ")), 24, Gx_line+0, 98, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95BarColNom, "")), 104, Gx_line+0, 200, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122ArtDsc, "")), 203, Gx_line+0, 394, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV166SumKgs, "ZZZZZ9.99")), 408, Gx_line+0, 475, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV167SumMts, "ZZZZZ9.99")), 549, Gx_line+0, 616, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV151FacPrek), "ZZZ,ZZZ")), 479, Gx_line+0, 531, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV152Facprem), "ZZZ,ZZZ")), 620, Gx_line+0, 672, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV168SumImp), "ZZ,ZZZ,ZZZ,ZZ9")), 676, Gx_line+0, 779, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV175TxtCalidad, "")), 364, Gx_line+0, 394, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+16) ;
                  AV48ContLin = (byte)(AV48ContLin+1) ;
                  AV168SumImp = 0 ;
                  AV166SumKgs = DecimalUtil.doubleToDec(0) ;
                  AV167SumMts = DecimalUtil.doubleToDec(0) ;
                  GX_I = 1 ;
                  while ( GX_I <= 100 )
                  {
                     AV170Tab_calidad[GX_I-1] = "" ;
                     GX_I = (int)(GX_I+1) ;
                  }
                  AV133i = (short)(1) ;
               }
               AV22BarCod = A1294FacBarCod ;
               AV23BarCodReo = A1295FacBarReo ;
               AV24BarCodPar = A1296FacBarPar ;
               AV25AlbProCod = A427FacAlbCod ;
               AV54FacAlbCod = A427FacAlbCod ;
               AV70FacDsc = A432FacDsc ;
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
               AV43FacMts = DecimalUtil.ZERO ;
               AV44FacPreMts = DecimalUtil.ZERO ;
               AV51FacKgs = DecimalUtil.ZERO ;
               AV102FacPreKgs = DecimalUtil.ZERO ;
               AV152Facprem = 0 ;
               AV151FacPrek = 0 ;
               if ( A449FacPreMts.doubleValue() > 0 )
               {
                  AV51FacKgs = A444FacKgs ;
                  AV43FacMts = A447FacMts ;
                  AV44FacPreMts = A449FacPreMts ;
                  AV152Facprem = (int)(DecimalUtil.decToDouble(A449FacPreMts)) ;
                  AV136Precio_trm = A449FacPreMts ;
                  AV162TotM = AV162TotM.add(A447FacMts) ;
               }
               else
               {
                  AV51FacKgs = A444FacKgs ;
                  AV43FacMts = A447FacMts ;
                  AV44FacPreMts = A448FacPreKgs ;
                  AV136Precio_trm = A448FacPreKgs ;
                  AV151FacPrek = (int)(DecimalUtil.decToDouble(A448FacPreKgs)) ;
                  AV161TotK = AV161TotK.add(A444FacKgs) ;
               }
               AV45FacImp = (long)(DecimalUtil.decToDouble(A438FacImp)) ;
               if ( A7211Factrm.doubleValue() > 0 )
               {
                  if ( A449FacPreMts.doubleValue() > 0 )
                  {
                     AV136Precio_trm = GXutil.roundDecimal( A449FacPreMts.divide(A7211Factrm, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV45FacImp = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( AV136Precio_trm.multiply(A447FacMts), 0))) ;
                  }
                  if ( A448FacPreKgs.doubleValue() > 0 )
                  {
                     AV136Precio_trm = GXutil.roundDecimal( A448FacPreKgs.divide(A7211Factrm, 18, java.math.RoundingMode.DOWN), 2) ;
                     AV45FacImp = (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( AV136Precio_trm.multiply(A444FacKgs), 0))) ;
                  }
               }
               AV166SumKgs = AV166SumKgs.add(A444FacKgs) ;
               AV167SumMts = AV167SumMts.add(A447FacMts) ;
               AV168SumImp = (long)(AV168SumImp+AV45FacImp) ;
               /* Execute user subroutine: 'CALIDAD' */
               S161 ();
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
               if ( AV169Noagrupo == 0 )
               {
                  if ( AV48ContLin >= 13 )
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
                     AV48ContLin = (byte)(0) ;
                     /* Eject command */
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(P_lines+1) ;
                  }
                  AV172t = (short)(1) ;
                  AV175TxtCalidad = "" ;
                  while ( AV133i <= 100 )
                  {
                     if ( GXutil.strcmp(AV170Tab_calidad[AV172t-1], " ") == 0 )
                     {
                        if (true) break;
                     }
                     AV174Calidad = AV170Tab_calidad[AV172t-1] ;
                     AV175TxtCalidad += AV174Calidad ;
                     AV172t = (short)(AV172t+1) ;
                  }
                  AV175TxtCalidad = httpContext.getMessage( "A", "") ;
                  h4KD0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54FacAlbCod), "ZZZZZZZZZZ")), 24, Gx_line+0, 98, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43FacMts, "ZZZ,ZZZ.ZZ")), 542, Gx_line+0, 616, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV51FacKgs, "ZZZ,ZZZ.ZZ")), 401, Gx_line+0, 475, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV151FacPrek), "ZZZ,ZZZ")), 479, Gx_line+0, 531, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV152Facprem), "ZZZ,ZZZ")), 620, Gx_line+1, 672, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95BarColNom, "")), 104, Gx_line+0, 200, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122ArtDsc, "")), 203, Gx_line+0, 394, Gx_line+17, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45FacImp), "ZZ,ZZZ,ZZZ,ZZ9")), 676, Gx_line+0, 779, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV175TxtCalidad, "")), 364, Gx_line+1, 394, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV48ContLin = (byte)(AV48ContLin+1) ;
                  GX_I = 1 ;
                  while ( GX_I <= 100 )
                  {
                     AV170Tab_calidad[GX_I-1] = "" ;
                     GX_I = (int)(GX_I+1) ;
                  }
                  AV133i = (short)(1) ;
               }
               AV37SumSig = AV37SumSig.add(DecimalUtil.doubleToDec(AV45FacImp)) ;
               AV165LastFacDsc = A432FacDsc ;
               pr_default.readNext(8);
            }
            pr_default.close(8);
            if ( ( AV168SumImp > 0 ) && ( AV169Noagrupo == 1 ) )
            {
               if ( AV48ContLin >= 13 )
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
                  AV48ContLin = (byte)(0) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV172t = (short)(1) ;
               AV175TxtCalidad = "" ;
               while ( AV133i <= 100 )
               {
                  if ( GXutil.strcmp(AV170Tab_calidad[AV172t-1], " ") == 0 )
                  {
                     if (true) break;
                  }
                  AV174Calidad = AV170Tab_calidad[AV172t-1] ;
                  AV175TxtCalidad += AV174Calidad ;
                  AV172t = (short)(AV172t+1) ;
               }
               AV175TxtCalidad = httpContext.getMessage( "A", "") ;
               h4KD0( false, 16) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54FacAlbCod), "ZZZZZZZZZZ")), 24, Gx_line+0, 98, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95BarColNom, "")), 104, Gx_line+0, 200, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV122ArtDsc, "")), 203, Gx_line+0, 394, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV166SumKgs, "ZZZZZ9.99")), 408, Gx_line+0, 475, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV167SumMts, "ZZZZZ9.99")), 549, Gx_line+0, 616, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV151FacPrek), "ZZZ,ZZZ")), 479, Gx_line+0, 531, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV152Facprem), "ZZZ,ZZZ")), 620, Gx_line+0, 672, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV168SumImp), "ZZ,ZZZ,ZZZ,ZZ9")), 676, Gx_line+0, 779, Gx_line+17, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV175TxtCalidad, "")), 364, Gx_line+0, 394, Gx_line+17, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+16) ;
               AV48ContLin = (byte)(AV48ContLin+1) ;
               GX_I = 1 ;
               while ( GX_I <= 100 )
               {
                  AV170Tab_calidad[GX_I-1] = "" ;
                  GX_I = (int)(GX_I+1) ;
               }
               AV133i = (short)(1) ;
            }
            AV18CliCod = A252CliCod ;
            AV20CliPri = A450FacPri ;
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
            if ( A435FacEst == 0 )
            {
               A435FacEst = (byte)(1) ;
            }
            if ( ( AV161TotK.doubleValue() > 0 ) || ( AV162TotM.doubleValue() > 0 ) )
            {
               if ( AV48ContLin >= 13 )
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
                  AV48ContLin = (byte)(0) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               h4KD0( false, 22) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV161TotK, "Z,ZZZ,ZZ9.99")), 386, Gx_line+6, 475, Gx_line+23, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV162TotM, "Z,ZZZ,ZZ9.99")), 527, Gx_line+6, 616, Gx_line+23, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+22) ;
            }
            if ( AV48ContLin >= 13 )
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
               AV48ContLin = (byte)(0) ;
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            h4KD0( false, 7) ;
            getPrinter().GxDrawLine(18, Gx_line+5, 771, Gx_line+5, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+7) ;
            AV48ContLin = (byte)(AV48ContLin+1) ;
            if ( A7211Factrm.doubleValue() > 0 )
            {
               AV131FACTRM = A7211Factrm ;
               if ( AV48ContLin >= 13 )
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
                  AV48ContLin = (byte)(0) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               h4KD0( false, 17) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "T. R. M. :", ""), 51, Gx_line+1, 99, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV131FACTRM, "ZZ,ZZ9.99")), 107, Gx_line+1, 188, Gx_line+18, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               AV48ContLin = (byte)(AV48ContLin+1) ;
            }
            AV132Nlin = (short)(GXutil.gxmlines( A7210FacObs, (short)(70))) ;
            AV133i = (short)(1) ;
            while ( AV133i <= AV132Nlin )
            {
               if ( AV48ContLin >= 13 )
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
                  AV48ContLin = (byte)(0) ;
                  /* Eject command */
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(P_lines+1) ;
               }
               AV134Linea_fc = GXutil.gxgetmli( A7210FacObs, AV133i, (short)(70)) ;
               h4KD0( false, 19) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV134Linea_fc, "")), 51, Gx_line+0, 635, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+19) ;
               AV48ContLin = (byte)(AV48ContLin+1) ;
               AV133i = (short)(AV133i+1) ;
            }
            /* Using cursor P04KD12 */
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
         h4KD0( true, 0) ;
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
      AV36OtraPag = (byte)(1) ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      AV70FacDsc = " " ;
      AV127procod = " " ;
      /* Using cursor P04KD13 */
      pr_default.execute(10, new Object[] {AV15EmprCod, Integer.valueOf(AV22BarCod), Byte.valueOf(AV23BarCodReo), AV24BarCodPar});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A130BarCodPar = P04KD13_A130BarCodPar[0] ;
         A132BarCodReo = P04KD13_A132BarCodReo[0] ;
         A129BarCod = P04KD13_A129BarCod[0] ;
         A396EmprCod = P04KD13_A396EmprCod[0] ;
         A1652BarSerDsc = P04KD13_A1652BarSerDsc[0] ;
         A136BarColNum = P04KD13_A136BarColNum[0] ;
         A135BarColNom = P04KD13_A135BarColNom[0] ;
         AV122ArtDsc = A1652BarSerDsc ;
         AV96BarColNum = A136BarColNum ;
         AV95BarColNom = A135BarColNom ;
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
      AV128AlbHdrobs = " " ;
      AV148ALbbarpie = (short)(0) ;
      /* Using cursor P04KD15 */
      pr_default.execute(11, new Object[] {AV15EmprCod, Long.valueOf(AV54FacAlbCod), Integer.valueOf(AV22BarCod), Byte.valueOf(AV23BarCodReo), AV24BarCodPar});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A130BarCodPar = P04KD15_A130BarCodPar[0] ;
         A132BarCodReo = P04KD15_A132BarCodReo[0] ;
         A129BarCod = P04KD15_A129BarCod[0] ;
         A30AlbProCod = P04KD15_A30AlbProCod[0] ;
         A396EmprCod = P04KD15_A396EmprCod[0] ;
         A1379AlbBarPie = P04KD15_A1379AlbBarPie[0] ;
         n1379AlbBarPie = P04KD15_n1379AlbBarPie[0] ;
         A1379AlbBarPie = P04KD15_A1379AlbBarPie[0] ;
         n1379AlbBarPie = P04KD15_n1379AlbBarPie[0] ;
         AV148ALbbarpie = A1379AlbBarPie ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'FORPAG' Routine */
      returnInSub = false ;
      AV19FpgDsc = "" ;
      /* Using cursor P04KD16 */
      pr_default.execute(12, new Object[] {AV15EmprCod, AV26FpgCod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A497FpgCod = P04KD16_A497FpgCod[0] ;
         A396EmprCod = P04KD16_A396EmprCod[0] ;
         A498FpgDsc = P04KD16_A498FpgDsc[0] ;
         n498FpgDsc = P04KD16_n498FpgDsc[0] ;
         AV19FpgDsc = GXutil.substring( A498FpgDsc, 1, 10) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(12);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'BUSDOM' Routine */
      returnInSub = false ;
      AV27CliPagNom = "" ;
      AV28CliPagDom = "" ;
      AV29CliPagPob = "" ;
      /* Using cursor P04KD17 */
      pr_default.execute(13, new Object[] {AV15EmprCod, Integer.valueOf(AV18CliCod), AV20CliPri});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A287CliPagLin = P04KD17_A287CliPagLin[0] ;
         A252CliCod = P04KD17_A252CliCod[0] ;
         A396EmprCod = P04KD17_A396EmprCod[0] ;
         A288CliPagNom = P04KD17_A288CliPagNom[0] ;
         A284CliPagCue = P04KD17_A284CliPagCue[0] ;
         A285CliPagDig = P04KD17_A285CliPagDig[0] ;
         A283CliPagCcs = P04KD17_A283CliPagCcs[0] ;
         A282CliPagCcb = P04KD17_A282CliPagCcb[0] ;
         AV27CliPagNom = A288CliPagNom ;
         AV89CliPagCta = A282CliPagCcb + "-" + A283CliPagCcs + "-" + A285CliPagDig + "-" + A284CliPagCue ;
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'CALIDAD' Routine */
      returnInSub = false ;
      /* Using cursor P04KD18 */
      pr_default.execute(14, new Object[] {AV15EmprCod, Integer.valueOf(AV22BarCod), Byte.valueOf(AV23BarCodReo), AV24BarCodPar});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A3858BarTroCod = P04KD18_A3858BarTroCod[0] ;
         A130BarCodPar = P04KD18_A130BarCodPar[0] ;
         A132BarCodReo = P04KD18_A132BarCodReo[0] ;
         A129BarCod = P04KD18_A129BarCod[0] ;
         A396EmprCod = P04KD18_A396EmprCod[0] ;
         A4990BarTroCal = P04KD18_A4990BarTroCal[0] ;
         n4990BarTroCal = P04KD18_n4990BarTroCal[0] ;
         A200BarPieCod = P04KD18_A200BarPieCod[0] ;
         AV171Bartrocal = A4990BarTroCal ;
         /* Execute user subroutine: 'TABLA' */
         S1713 ();
         if ( returnInSub )
         {
            pr_default.close(14);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   public void S1713( ) throws ProcessInterruptedException
   {
      /* 'TABLA' Routine */
      returnInSub = false ;
      AV172t = (short)(1) ;
      AV173AltaTabla = (byte)(0) ;
      while ( AV172t <= 100 )
      {
         if ( GXutil.strcmp(AV170Tab_calidad[AV172t-1], " ") == 0 )
         {
            AV173AltaTabla = (byte)(1) ;
            if (true) break;
         }
         if ( AV171Bartrocal == 1 )
         {
            AV174Calidad = httpContext.getMessage( "A", "") ;
         }
         else if ( AV171Bartrocal == 2 )
         {
            AV174Calidad = httpContext.getMessage( "B", "") ;
         }
         else if ( AV171Bartrocal == 3 )
         {
            AV174Calidad = httpContext.getMessage( "C", "") ;
         }
         else
         {
            AV174Calidad = httpContext.getMessage( "Z", "") ;
         }
         if ( GXutil.strcmp(AV174Calidad, AV170Tab_calidad[AV172t-1]) == 0 )
         {
            if (true) break;
         }
         AV172t = (short)(AV172t+1) ;
      }
      if ( AV173AltaTabla == 1 )
      {
         if ( AV171Bartrocal == 1 )
         {
            AV174Calidad = httpContext.getMessage( "A", "") ;
         }
         else if ( AV171Bartrocal == 2 )
         {
            AV174Calidad = httpContext.getMessage( "B", "") ;
         }
         else if ( AV171Bartrocal == 3 )
         {
            AV174Calidad = httpContext.getMessage( "C", "") ;
         }
         else
         {
            AV174Calidad = httpContext.getMessage( "Z", "") ;
         }
         AV170Tab_calidad[AV133i-1] = AV174Calidad ;
         AV133i = (short)(AV133i+1) ;
      }
   }

   public void h4KD0( boolean bFoot ,
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
               if ( GXutil.strcmp(AV15EmprCod, "001") == 0 )
               {
                  AV130Linea_f = httpContext.getMessage( "Factura impresa por computador (Art. 617 E.T. y Decreto 1165/96 Art. 13) Fatelca SAS NIT 900177712-0", "") ;
                  AV146Linea_f2 = GXutil.trim( AV112Emprnom) + httpContext.getMessage( " NIT. ", "") + GXutil.trim( AV139EmprCif) ;
                  getPrinter().GxDrawRect(18, Gx_line+23, 590, Gx_line+243, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112Emprnom, "")), 124, Gx_line+335, 281, Gx_line+352, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "SUBTOTAL", ""), 593, Gx_line+52, 666, Gx_line+69, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38FacImpTot), "Z,ZZZ,ZZZ,ZZ9")), 675, Gx_line+52, 771, Gx_line+70, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV135facimpret), "ZZ,ZZZ,ZZ9")), 697, Gx_line+108, 771, Gx_line+126, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "I.V.A.", ""), 593, Gx_line+79, 628, Gx_line+96, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40FacIvaImp), "Z,ZZZ,ZZZ,ZZ9")), 675, Gx_line+79, 771, Gx_line+97, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RETENCION", ""), 593, Gx_line+108, 671, Gx_line+125, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VALOR NETO", ""), 595, Gx_line+196, 682, Gx_line+213, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41FacTot), "ZZZ,ZZZ,ZZ9")), 690, Gx_line+196, 771, Gx_line+214, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV125Texto1, "")), 55, Gx_line+248, 639, Gx_line+265, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV126Texto2, "")), 55, Gx_line+265, 639, Gx_line+282, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "SON:", ""), 20, Gx_line+248, 50, Gx_line+264, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pagina No.", ""), 648, Gx_line+338, 707, Gx_line+353, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 715, Gx_line+336, 760, Gx_line+353, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RETE IVA", ""), 593, Gx_line+138, 654, Gx_line+155, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV147FacImpRei), "ZZ,ZZZ,ZZ9")), 697, Gx_line+138, 771, Gx_line+156, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RETE ICA", ""), 593, Gx_line+167, 655, Gx_line+184, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV149FacImpIca), "ZZ,ZZZ,ZZ9")), 697, Gx_line+167, 771, Gx_line+185, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RECIBI A SATISFACCION", ""), 379, Gx_line+335, 521, Gx_line+351, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Reclamos: sólo se aceptan hasta 10 días después de la fecha de entrega con previa autorización ", ""), 26, Gx_line+25, 521, Gx_line+40, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "de la fábrica. En tela cortada y en segundas no se aceptan devoluciones ni reclamos.", ""), 26, Gx_line+40, 457, Gx_line+55, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Factura impresa por computador ( art.617 E.T. y decreto 1165/96 Art.13) FATELCA SAS NIT 900177712-0", ""), 26, Gx_line+53, 552, Gx_line+68, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "SOFTWARE DE FACTURA TEXPLUS CIF B65104358.", ""), 26, Gx_line+68, 288, Gx_line+83, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "FAVOR CANCELAR ESTA FACTURA CON CHEQUE CRUZADO A NOMBRE DE", ""), 26, Gx_line+81, 408, Gx_line+96, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "y/o cesión de un tercero.", ""), 26, Gx_line+109, 153, Gx_line+124, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Autorizó a que en caso de incumplimiento de esta obligación, sea reportado a una base de datos.", ""), 26, Gx_line+124, 516, Gx_line+139, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Se cobraran intereses de mora de acuerdo a la tasa máxima legal autorizada.", ""), 26, Gx_line+138, 416, Gx_line+153, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "La firma impuesta en la presente factura, por cualquier de los funcionarios del cliente,", ""), 26, Gx_line+152, 457, Gx_line+167, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "se entiende como aceptación de la misma.", ""), 26, Gx_line+166, 238, Gx_line+181, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "El cliente se obligará a pagar el valor total a la fecha de vencimiento, luego de esta ", ""), 26, Gx_line+180, 443, Gx_line+195, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "fecha se obliga a pagar además intereses de mora a la tasa máxima permitida por la ley.", ""), 26, Gx_line+194, 468, Gx_line+209, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "La aceptación de la presente factura implica que la mercancía aquí indicada ha sido entregada", ""), 26, Gx_line+208, 500, Gx_line+223, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "real y materialmente al comprador.", ""), 26, Gx_line+222, 198, Gx_line+237, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "FATELCA SAS NIT. 900177712-0, a excepción de las facturas que tengan en sello de endosó ", ""), 26, Gx_line+96, 497, Gx_line+111, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(124, Gx_line+328, 279, Gx_line+328, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(372, Gx_line+328, 527, Gx_line+328, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(589, Gx_line+46, 775, Gx_line+74, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(589, Gx_line+73, 775, Gx_line+102, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(589, Gx_line+101, 775, Gx_line+131, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(589, Gx_line+130, 775, Gx_line+160, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(589, Gx_line+159, 775, Gx_line+189, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(589, Gx_line+189, 775, Gx_line+219, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+359) ;
               }
               else
               {
                  getPrinter().GxDrawRect(18, Gx_line+22, 590, Gx_line+242, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV112Emprnom, "")), 127, Gx_line+334, 284, Gx_line+351, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "SUBTOTAL", ""), 596, Gx_line+51, 669, Gx_line+68, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38FacImpTot), "Z,ZZZ,ZZZ,ZZ9")), 678, Gx_line+51, 774, Gx_line+69, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV135facimpret), "ZZ,ZZZ,ZZ9")), 700, Gx_line+107, 774, Gx_line+125, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "I.V.A.", ""), 596, Gx_line+78, 631, Gx_line+95, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40FacIvaImp), "Z,ZZZ,ZZZ,ZZ9")), 678, Gx_line+78, 774, Gx_line+96, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RETENCION", ""), 596, Gx_line+107, 674, Gx_line+124, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "VALOR NETO", ""), 598, Gx_line+195, 685, Gx_line+212, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41FacTot), "ZZZ,ZZZ,ZZ9")), 693, Gx_line+195, 774, Gx_line+213, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV125Texto1, "")), 58, Gx_line+247, 642, Gx_line+264, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV126Texto2, "")), 58, Gx_line+264, 642, Gx_line+281, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "SON:", ""), 23, Gx_line+247, 53, Gx_line+263, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Pagina No.", ""), 651, Gx_line+336, 710, Gx_line+351, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 718, Gx_line+335, 763, Gx_line+352, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RETE IVA", ""), 596, Gx_line+136, 657, Gx_line+153, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV147FacImpRei), "ZZ,ZZZ,ZZ9")), 700, Gx_line+136, 774, Gx_line+154, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RETE ICA", ""), 596, Gx_line+166, 658, Gx_line+183, 0+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV149FacImpIca), "ZZ,ZZZ,ZZ9")), 700, Gx_line+166, 774, Gx_line+184, 2+256, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "RECIBI A SATISFACCION", ""), 382, Gx_line+334, 524, Gx_line+350, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(127, Gx_line+327, 282, Gx_line+327, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(375, Gx_line+327, 530, Gx_line+327, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(589, Gx_line+45, 775, Gx_line+73, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(589, Gx_line+72, 775, Gx_line+101, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(589, Gx_line+100, 775, Gx_line+130, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(589, Gx_line+129, 775, Gx_line+159, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(589, Gx_line+158, 775, Gx_line+188, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxDrawRect(589, Gx_line+188, 775, Gx_line+218, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Reclamos: Sólo se aceptan hasta 10 días después de la fecha de entrega con previa autorización de la fábrica.", ""), 28, Gx_line+47, 589, Gx_line+61, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Factura impresa por computador (art. 61/E.T. y decreto 1165/96 Art. 13). FOURTEX SAS NIT 900785651-8", ""), 28, Gx_line+61, 589, Gx_line+75, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "SOFTWARE DE FACTURA TEXPLUS CIF B65104358.", ""), 28, Gx_line+75, 589, Gx_line+89, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "FAVOR CANCELAR ESTA FACTURA CON CHEQUE CRUZADO A NOMBRE DE FOURTEX SAS NIT 900785651-8, ", ""), 28, Gx_line+92, 583, Gx_line+106, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "a excepción de las facturas que tengan en sello de endosó y/o cesión de un tercero.", ""), 28, Gx_line+106, 583, Gx_line+120, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Autorizó a que en caso de incumplimiento de esta obligación, sea reportado a una base de datos.", ""), 28, Gx_line+121, 518, Gx_line+135, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "La firma impuesta en la presente factura, por cualquiera de los funcionarios del cliente, y/o en el ", ""), 28, Gx_line+135, 518, Gx_line+149, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "cumplido de la trasportadora, se entiende como aceptación de la misma y que la mercancía aquí indicada ", ""), 28, Gx_line+151, 556, Gx_line+165, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "ha sido entregada real y materialmente al vendedor.", ""), 28, Gx_line+165, 556, Gx_line+179, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "El cliente se obligara a pagar el valor total a la fecha de vencimiento, luego de esta fecha se obliga a ", ""), 28, Gx_line+180, 534, Gx_line+194, 0+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "pagar además intereses de mora a la tasa máxima permitida por la ley.", ""), 28, Gx_line+194, 534, Gx_line+208, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+360) ;
               }
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
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV145EmpItm5, "")), 406, Gx_line+157, 641, Gx_line+173, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 660, Gx_line+156, 728, Gx_line+174, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Señores:", ""), 23, Gx_line+172, 76, Gx_line+187, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV113CliNom_l, "")), 23, Gx_line+193, 441, Gx_line+211, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NIT :", ""), 23, Gx_line+213, 66, Gx_line+231, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 67, Gx_line+213, 235, Gx_line+231, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 23, Gx_line+232, 307, Gx_line+250, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 23, Gx_line+251, 274, Gx_line+269, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Tel.:", ""), 23, Gx_line+282, 66, Gx_line+300, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A303CliTel1, "")), 67, Gx_line+282, 193, Gx_line+300, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(19, Gx_line+185, 446, Gx_line+300, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV118Data_f, "")), 561, Gx_line+250, 645, Gx_line+268, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV119Data_v, "")), 679, Gx_line+250, 763, Gx_line+268, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(552, Gx_line+225, 656, Gx_line+274, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FECHA FACTURA", ""), 557, Gx_line+228, 650, Gx_line+243, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(671, Gx_line+224, 770, Gx_line+273, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "FECHA VENCIM.", ""), 677, Gx_line+228, 764, Gx_line+243, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "NUMERO", ""), 24, Gx_line+306, 72, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "REMISION", ""), 24, Gx_line+323, 78, Gx_line+338, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "KILOS", ""), 441, Gx_line+323, 475, Gx_line+338, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "COLOR", ""), 104, Gx_line+321, 145, Gx_line+336, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "ARTICULO", ""), 203, Gx_line+321, 261, Gx_line+336, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "VALOR", ""), 731, Gx_line+306, 771, Gx_line+321, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "TOTAL", ""), 732, Gx_line+323, 771, Gx_line+338, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(21, Gx_line+339, 774, Gx_line+339, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19FpgDsc, "")), 457, Gx_line+250, 531, Gx_line+267, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(451, Gx_line+225, 536, Gx_line+274, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PLAZO", ""), 474, Gx_line+232, 514, Gx_line+247, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "METROS", ""), 568, Gx_line+323, 616, Gx_line+338, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PRECIO", ""), 490, Gx_line+323, 532, Gx_line+338, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "PRECIO", ""), 630, Gx_line+323, 672, Gx_line+338, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV153Txt1, "")), 138, Gx_line+41, 660, Gx_line+57, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV154Txt2, "")), 138, Gx_line+56, 660, Gx_line+72, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV155Txt3, "")), 138, Gx_line+72, 660, Gx_line+88, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV156Txt4, "")), 138, Gx_line+88, 660, Gx_line+104, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV157Txt5, "")), 138, Gx_line+103, 660, Gx_line+119, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV158Txt6, "")), 30, Gx_line+119, 765, Gx_line+135, 1+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV159Txt7, "")), 138, Gx_line+133, 660, Gx_line+149, 1+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Vend.:", ""), 229, Gx_line+282, 280, Gx_line+300, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A293CliPer, "")), 289, Gx_line+282, 436, Gx_line+299, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 14, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV160Txt0, "")), 182, Gx_line+16, 703, Gx_line+39, 1, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV177titCalidad, "")), 343, Gx_line+321, 427, Gx_line+337, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+344) ;
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
      this.aP0[0] = pfacfat.this.AV15EmprCod;
      this.aP1[0] = pfacfat.this.AV16FacCod;
      this.aP2[0] = pfacfat.this.AV109TextoCopia;
      this.aP3[0] = pfacfat.this.Gx_out;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfacfat");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV129Texto_l = "" ;
      GXt_char1 = "" ;
      AV177titCalidad = "" ;
      AV112Emprnom = "" ;
      AV97EmprDir = "" ;
      AV98EmprPob = "" ;
      AV99EmprTel = "" ;
      AV101EmprFax = "" ;
      AV139EmprCif = "" ;
      AV141EmpItm1 = "" ;
      AV142EmpItm2 = "" ;
      AV150EmpItm6 = "" ;
      AV143EmpItm3 = "" ;
      AV140EmpItm4 = "" ;
      scmdbuf = "" ;
      P04KD2_A396EmprCod = new String[] {""} ;
      P04KD2_A407EmprNom = new String[] {""} ;
      P04KD2_n407EmprNom = new boolean[] {false} ;
      P04KD2_A404EmprDir = new String[] {""} ;
      P04KD2_n404EmprDir = new boolean[] {false} ;
      P04KD2_A408EmprPob = new String[] {""} ;
      P04KD2_n408EmprPob = new boolean[] {false} ;
      P04KD2_A409EmprTel = new String[] {""} ;
      P04KD2_n409EmprTel = new boolean[] {false} ;
      P04KD2_A405EmprFax = new String[] {""} ;
      P04KD2_n405EmprFax = new boolean[] {false} ;
      P04KD2_A395EmprCif = new String[] {""} ;
      P04KD2_n395EmprCif = new boolean[] {false} ;
      P04KD2_A8334EmpItm1 = new String[] {""} ;
      P04KD2_n8334EmpItm1 = new boolean[] {false} ;
      P04KD2_A8335EmpItm2 = new String[] {""} ;
      P04KD2_n8335EmpItm2 = new boolean[] {false} ;
      P04KD2_A8336EmpItm3 = new String[] {""} ;
      P04KD2_n8336EmpItm3 = new boolean[] {false} ;
      P04KD2_A8337EmpItm4 = new String[] {""} ;
      P04KD2_n8337EmpItm4 = new boolean[] {false} ;
      P04KD2_A8338EmpItm5 = new String[] {""} ;
      P04KD2_n8338EmpItm5 = new boolean[] {false} ;
      P04KD2_A11516EmpItm6 = new String[] {""} ;
      P04KD2_n11516EmpItm6 = new boolean[] {false} ;
      A396EmprCod = "" ;
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
      AV145EmpItm5 = "" ;
      AV131FACTRM = DecimalUtil.ZERO ;
      P04KD3_A430FacCod = new int[1] ;
      P04KD3_A396EmprCod = new String[] {""} ;
      P04KD3_A7211Factrm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD3_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD3_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD3_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD3_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD3_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD3_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD3_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD3_n8346FacRecI = new boolean[] {false} ;
      P04KD3_A443FacIVAPor = new byte[1] ;
      P04KD3_A446FacLin = new int[1] ;
      A7211Factrm = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      AV136Precio_trm = DecimalUtil.ZERO ;
      AV162TotM = DecimalUtil.ZERO ;
      AV161TotK = DecimalUtil.ZERO ;
      AV138FacRect = DecimalUtil.ZERO ;
      AV163FacRecIca = DecimalUtil.ZERO ;
      AV164FacRecI = DecimalUtil.ZERO ;
      P04KD4_A7210FacObs = new String[] {""} ;
      P04KD4_A7211Factrm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD4_A430FacCod = new int[1] ;
      P04KD4_A396EmprCod = new String[] {""} ;
      P04KD4_A437FacFpg = new String[] {""} ;
      P04KD4_A450FacPri = new String[] {""} ;
      P04KD4_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P04KD4_A252CliCod = new int[1] ;
      P04KD4_A435FacEst = new byte[1] ;
      P04KD4_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD4_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD4_n8346FacRecI = new boolean[] {false} ;
      P04KD4_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD4_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD4_A443FacIVAPor = new byte[1] ;
      P04KD4_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD4_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD4_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD4_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD4_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD4_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      P04KD5_A7209Colombia = new byte[1] ;
      P04KD5_n7209Colombia = new boolean[] {false} ;
      P04KD6_A781PrvCod = new short[1] ;
      P04KD6_A3644CliNom1 = new String[] {""} ;
      P04KD6_A279CliNom = new String[] {""} ;
      P04KD6_A295CliPob = new String[] {""} ;
      P04KD6_A293CliPer = new String[] {""} ;
      P04KD6_A303CliTel1 = new String[] {""} ;
      P04KD6_A260CliDom = new String[] {""} ;
      P04KD6_A278CliNif = new String[] {""} ;
      A3644CliNom1 = "" ;
      A279CliNom = "" ;
      A295CliPob = "" ;
      A293CliPer = "" ;
      A303CliTel1 = "" ;
      A260CliDom = "" ;
      A278CliNif = "" ;
      P04KD7_A787PrvDsc = new String[] {""} ;
      P04KD7_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      P04KD9_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      AV88CopiaTex = "" ;
      AV37SumSig = DecimalUtil.ZERO ;
      AV26FpgCod = "" ;
      AV30PDtoPP = DecimalUtil.ZERO ;
      AV35ImpDtoPP = DecimalUtil.ZERO ;
      AV105FacPri = "" ;
      AV46TipoFra = "" ;
      AV113CliNom_l = "" ;
      AV114CliPob_l = "" ;
      AV118Data_f = "" ;
      AV119Data_v = "" ;
      AV120FacVtoFch = GXutil.nullDate() ;
      AV32Fpago = new java.math.BigDecimal[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV32Fpago[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV85FPagoPt = new int[4] ;
      AV31Vencim = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV31Vencim[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV103VtoTxt = "" ;
      AV104ImpTxt = "" ;
      P04KD10_A396EmprCod = new String[] {""} ;
      P04KD10_A430FacCod = new int[1] ;
      P04KD10_A956FacVtoLin = new byte[1] ;
      P04KD10_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      P04KD10_n957FacVtoFch = new boolean[] {false} ;
      A957FacVtoFch = GXutil.nullDate() ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV125Texto1 = "" ;
      GXv_char2 = new String[1] ;
      AV126Texto2 = "" ;
      GXv_char6 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_int4 = new byte[1] ;
      AV160Txt0 = "" ;
      AV153Txt1 = "" ;
      AV154Txt2 = "" ;
      AV155Txt3 = "" ;
      AV156Txt4 = "" ;
      AV157Txt5 = "" ;
      AV158Txt6 = "" ;
      AV159Txt7 = "" ;
      AV165LastFacDsc = "" ;
      AV170Tab_calidad = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV170Tab_calidad[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      P04KD11_A430FacCod = new int[1] ;
      P04KD11_A396EmprCod = new String[] {""} ;
      P04KD11_A432FacDsc = new String[] {""} ;
      P04KD11_A1294FacBarCod = new int[1] ;
      P04KD11_A1295FacBarReo = new byte[1] ;
      P04KD11_A1296FacBarPar = new String[] {""} ;
      P04KD11_A427FacAlbCod = new long[1] ;
      P04KD11_A446FacLin = new int[1] ;
      P04KD11_A12197FacUnds = new int[1] ;
      P04KD11_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD11_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD11_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD11_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD11_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD11_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD11_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD11_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04KD11_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A432FacDsc = "" ;
      A1296FacBarPar = "" ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A2239FacIml = DecimalUtil.ZERO ;
      A3923FacImp1 = DecimalUtil.ZERO ;
      A438FacImp = DecimalUtil.ZERO ;
      AV175TxtCalidad = "" ;
      AV174Calidad = "" ;
      AV95BarColNom = "" ;
      AV122ArtDsc = "" ;
      AV166SumKgs = DecimalUtil.ZERO ;
      AV167SumMts = DecimalUtil.ZERO ;
      AV24BarCodPar = "" ;
      AV70FacDsc = "" ;
      AV43FacMts = DecimalUtil.ZERO ;
      AV44FacPreMts = DecimalUtil.ZERO ;
      AV51FacKgs = DecimalUtil.ZERO ;
      AV102FacPreKgs = DecimalUtil.ZERO ;
      AV20CliPri = "" ;
      AV134Linea_fc = "" ;
      AV127procod = "" ;
      P04KD13_A130BarCodPar = new String[] {""} ;
      P04KD13_A132BarCodReo = new byte[1] ;
      P04KD13_A129BarCod = new int[1] ;
      P04KD13_A396EmprCod = new String[] {""} ;
      P04KD13_A1652BarSerDsc = new String[] {""} ;
      P04KD13_A136BarColNum = new int[1] ;
      P04KD13_A135BarColNom = new String[] {""} ;
      A130BarCodPar = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      AV128AlbHdrobs = "" ;
      P04KD15_A130BarCodPar = new String[] {""} ;
      P04KD15_A132BarCodReo = new byte[1] ;
      P04KD15_A129BarCod = new int[1] ;
      P04KD15_A30AlbProCod = new long[1] ;
      P04KD15_A396EmprCod = new String[] {""} ;
      P04KD15_A1379AlbBarPie = new short[1] ;
      P04KD15_n1379AlbBarPie = new boolean[] {false} ;
      AV19FpgDsc = "" ;
      P04KD16_A497FpgCod = new String[] {""} ;
      P04KD16_A396EmprCod = new String[] {""} ;
      P04KD16_A498FpgDsc = new String[] {""} ;
      P04KD16_n498FpgDsc = new boolean[] {false} ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      AV27CliPagNom = "" ;
      AV28CliPagDom = "" ;
      AV29CliPagPob = "" ;
      P04KD17_A287CliPagLin = new byte[1] ;
      P04KD17_A252CliCod = new int[1] ;
      P04KD17_A396EmprCod = new String[] {""} ;
      P04KD17_A288CliPagNom = new String[] {""} ;
      P04KD17_A284CliPagCue = new String[] {""} ;
      P04KD17_A285CliPagDig = new String[] {""} ;
      P04KD17_A283CliPagCcs = new String[] {""} ;
      P04KD17_A282CliPagCcb = new String[] {""} ;
      A288CliPagNom = "" ;
      A284CliPagCue = "" ;
      A285CliPagDig = "" ;
      A283CliPagCcs = "" ;
      A282CliPagCcb = "" ;
      AV89CliPagCta = "" ;
      P04KD18_A3858BarTroCod = new short[1] ;
      P04KD18_A130BarCodPar = new String[] {""} ;
      P04KD18_A132BarCodReo = new byte[1] ;
      P04KD18_A129BarCod = new int[1] ;
      P04KD18_A396EmprCod = new String[] {""} ;
      P04KD18_A4990BarTroCal = new byte[1] ;
      P04KD18_n4990BarTroCal = new boolean[] {false} ;
      P04KD18_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      AV130Linea_f = "" ;
      AV146Linea_f2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfacfat__default(),
         new Object[] {
             new Object[] {
            P04KD2_A396EmprCod, P04KD2_A407EmprNom, P04KD2_n407EmprNom, P04KD2_A404EmprDir, P04KD2_n404EmprDir, P04KD2_A408EmprPob, P04KD2_n408EmprPob, P04KD2_A409EmprTel, P04KD2_n409EmprTel, P04KD2_A405EmprFax,
            P04KD2_n405EmprFax, P04KD2_A395EmprCif, P04KD2_n395EmprCif, P04KD2_A8334EmpItm1, P04KD2_n8334EmpItm1, P04KD2_A8335EmpItm2, P04KD2_n8335EmpItm2, P04KD2_A8336EmpItm3, P04KD2_n8336EmpItm3, P04KD2_A8337EmpItm4,
            P04KD2_n8337EmpItm4, P04KD2_A8338EmpItm5, P04KD2_n8338EmpItm5, P04KD2_A11516EmpItm6, P04KD2_n11516EmpItm6
            }
            , new Object[] {
            P04KD3_A430FacCod, P04KD3_A396EmprCod, P04KD3_A7211Factrm, P04KD3_A449FacPreMts, P04KD3_A447FacMts, P04KD3_A448FacPreKgs, P04KD3_A444FacKgs, P04KD3_A7212FacRect, P04KD3_A11513FacRecIca, P04KD3_A8346FacRecI,
            P04KD3_n8346FacRecI, P04KD3_A443FacIVAPor, P04KD3_A446FacLin
            }
            , new Object[] {
            P04KD4_A7210FacObs, P04KD4_A7211Factrm, P04KD4_A430FacCod, P04KD4_A396EmprCod, P04KD4_A437FacFpg, P04KD4_A450FacPri, P04KD4_A436FacFch, P04KD4_A252CliCod, P04KD4_A435FacEst, P04KD4_A11513FacRecIca,
            P04KD4_A8346FacRecI, P04KD4_n8346FacRecI, P04KD4_A7212FacRect, P04KD4_A453FacRECPor, P04KD4_A443FacIVAPor, P04KD4_A14224FacCostFac, P04KD4_A14223FacCostKgs, P04KD4_A14222FacCostMts, P04KD4_A14219FacEnergia, P04KD4_A433FacDtoGen,
            P04KD4_A434FacDtoPP
            }
            , new Object[] {
            P04KD5_A7209Colombia, P04KD5_n7209Colombia
            }
            , new Object[] {
            P04KD6_A781PrvCod, P04KD6_A3644CliNom1, P04KD6_A279CliNom, P04KD6_A295CliPob, P04KD6_A293CliPer, P04KD6_A303CliTel1, P04KD6_A260CliDom, P04KD6_A278CliNif
            }
            , new Object[] {
            P04KD7_A787PrvDsc, P04KD7_n787PrvDsc
            }
            , new Object[] {
            P04KD9_A3918FacImpTot1
            }
            , new Object[] {
            P04KD10_A396EmprCod, P04KD10_A430FacCod, P04KD10_A956FacVtoLin, P04KD10_A957FacVtoFch, P04KD10_n957FacVtoFch
            }
            , new Object[] {
            P04KD11_A430FacCod, P04KD11_A396EmprCod, P04KD11_A432FacDsc, P04KD11_A1294FacBarCod, P04KD11_A1295FacBarReo, P04KD11_A1296FacBarPar, P04KD11_A427FacAlbCod, P04KD11_A446FacLin, P04KD11_A12197FacUnds, P04KD11_A3897FacKgsA,
            P04KD11_A3898FacPreKgsA, P04KD11_A12198FacPreUnd, P04KD11_A449FacPreMts, P04KD11_A5353FacImpMan, P04KD11_A447FacMts, P04KD11_A444FacKgs, P04KD11_A448FacPreKgs, P04KD11_A5355FacImpMin
            }
            , new Object[] {
            }
            , new Object[] {
            P04KD13_A130BarCodPar, P04KD13_A132BarCodReo, P04KD13_A129BarCod, P04KD13_A396EmprCod, P04KD13_A1652BarSerDsc, P04KD13_A136BarColNum, P04KD13_A135BarColNom
            }
            , new Object[] {
            P04KD15_A130BarCodPar, P04KD15_A132BarCodReo, P04KD15_A129BarCod, P04KD15_A30AlbProCod, P04KD15_A396EmprCod, P04KD15_A1379AlbBarPie, P04KD15_n1379AlbBarPie
            }
            , new Object[] {
            P04KD16_A497FpgCod, P04KD16_A396EmprCod, P04KD16_A498FpgDsc, P04KD16_n498FpgDsc
            }
            , new Object[] {
            P04KD17_A287CliPagLin, P04KD17_A252CliCod, P04KD17_A396EmprCod, P04KD17_A288CliPagNom, P04KD17_A284CliPagCue, P04KD17_A285CliPagDig, P04KD17_A283CliPagCcs, P04KD17_A282CliPagCcb
            }
            , new Object[] {
            P04KD18_A3858BarTroCod, P04KD18_A130BarCodPar, P04KD18_A132BarCodReo, P04KD18_A129BarCod, P04KD18_A396EmprCod, P04KD18_A4990BarTroCal, P04KD18_n4990BarTroCal, P04KD18_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte AV169Noagrupo ;
   private byte AV176Sicalidad ;
   private byte GXt_int3 ;
   private byte A443FacIVAPor ;
   private byte AV106FacIvaPor ;
   private byte AV111F_pie ;
   private byte A435FacEst ;
   private byte A7209Colombia ;
   private byte AV36OtraPag ;
   private byte AV48ContLin ;
   private byte AV116Mes ;
   private byte AV117Dia ;
   private byte AV21NFpago ;
   private byte A956FacVtoLin ;
   private byte GXv_int4[] ;
   private byte A1295FacBarReo ;
   private byte AV23BarCodReo ;
   private byte A132BarCodReo ;
   private byte A287CliPagLin ;
   private byte A4990BarTroCal ;
   private byte AV171Bartrocal ;
   private byte AV173AltaTabla ;
   private short A781PrvCod ;
   private short AV115Anyo ;
   private short AV133i ;
   private short AV172t ;
   private short AV132Nlin ;
   private short AV148ALbbarpie ;
   private short A1379AlbBarPie ;
   private short A3858BarTroCod ;
   private short Gx_err ;
   private int AV16FacCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int AV135facimpret ;
   private int AV147FacImpRei ;
   private int AV149FacImpIca ;
   private int A252CliCod ;
   private int AV42FacRecImp ;
   private int GX_I ;
   private int AV85FPagoPt[] ;
   private int A1294FacBarCod ;
   private int A12197FacUnds ;
   private int Gx_OldLine ;
   private int AV151FacPrek ;
   private int AV152Facprem ;
   private int AV22BarCod ;
   private int AV18CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV96BarColNum ;
   private long AV137FacTot_ ;
   private long AV45FacImp ;
   private long AV38FacImpTot ;
   private long AV41FacTot ;
   private long AV39FacBasImp ;
   private long AV40FacIvaImp ;
   private long AV124facImpGen ;
   private long A427FacAlbCod ;
   private long AV54FacAlbCod ;
   private long AV168SumImp ;
   private long AV25AlbProCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV131FACTRM ;
   private java.math.BigDecimal A7211Factrm ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal AV136Precio_trm ;
   private java.math.BigDecimal AV162TotM ;
   private java.math.BigDecimal AV161TotK ;
   private java.math.BigDecimal AV138FacRect ;
   private java.math.BigDecimal AV163FacRecIca ;
   private java.math.BigDecimal AV164FacRecI ;
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
   private java.math.BigDecimal AV37SumSig ;
   private java.math.BigDecimal AV30PDtoPP ;
   private java.math.BigDecimal AV35ImpDtoPP ;
   private java.math.BigDecimal AV32Fpago[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal A2239FacIml ;
   private java.math.BigDecimal A3923FacImp1 ;
   private java.math.BigDecimal A438FacImp ;
   private java.math.BigDecimal AV166SumKgs ;
   private java.math.BigDecimal AV167SumMts ;
   private java.math.BigDecimal AV43FacMts ;
   private java.math.BigDecimal AV44FacPreMts ;
   private java.math.BigDecimal AV51FacKgs ;
   private java.math.BigDecimal AV102FacPreKgs ;
   private String AV15EmprCod ;
   private String AV109TextoCopia ;
   private String Gx_out ;
   private String AV129Texto_l ;
   private String GXt_char1 ;
   private String AV177titCalidad ;
   private String AV112Emprnom ;
   private String AV97EmprDir ;
   private String AV98EmprPob ;
   private String AV99EmprTel ;
   private String AV101EmprFax ;
   private String AV139EmprCif ;
   private String AV141EmpItm1 ;
   private String AV142EmpItm2 ;
   private String AV150EmpItm6 ;
   private String AV143EmpItm3 ;
   private String AV140EmpItm4 ;
   private String scmdbuf ;
   private String A396EmprCod ;
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
   private String AV145EmpItm5 ;
   private String A437FacFpg ;
   private String A450FacPri ;
   private String A3644CliNom1 ;
   private String A279CliNom ;
   private String A295CliPob ;
   private String A293CliPer ;
   private String A303CliTel1 ;
   private String A260CliDom ;
   private String A278CliNif ;
   private String A787PrvDsc ;
   private String AV88CopiaTex ;
   private String AV26FpgCod ;
   private String AV105FacPri ;
   private String AV46TipoFra ;
   private String AV113CliNom_l ;
   private String AV114CliPob_l ;
   private String AV118Data_f ;
   private String AV119Data_v ;
   private String AV31Vencim[] ;
   private String AV103VtoTxt ;
   private String AV104ImpTxt ;
   private String AV125Texto1 ;
   private String GXv_char2[] ;
   private String AV126Texto2 ;
   private String GXv_char6[] ;
   private String AV160Txt0 ;
   private String AV154Txt2 ;
   private String AV155Txt3 ;
   private String AV156Txt4 ;
   private String AV157Txt5 ;
   private String AV158Txt6 ;
   private String AV159Txt7 ;
   private String AV165LastFacDsc ;
   private String AV170Tab_calidad[] ;
   private String A432FacDsc ;
   private String A1296FacBarPar ;
   private String AV175TxtCalidad ;
   private String AV174Calidad ;
   private String AV95BarColNom ;
   private String AV122ArtDsc ;
   private String AV24BarCodPar ;
   private String AV70FacDsc ;
   private String AV20CliPri ;
   private String AV134Linea_fc ;
   private String AV127procod ;
   private String A130BarCodPar ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String AV128AlbHdrobs ;
   private String AV19FpgDsc ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private String AV27CliPagNom ;
   private String AV28CliPagDom ;
   private String AV29CliPagPob ;
   private String A288CliPagNom ;
   private String A284CliPagCue ;
   private String A285CliPagDig ;
   private String A283CliPagCcs ;
   private String A282CliPagCcb ;
   private String AV89CliPagCta ;
   private String A200BarPieCod ;
   private String AV130Linea_f ;
   private String AV146Linea_f2 ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV120FacVtoFch ;
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
   private boolean n7209Colombia ;
   private boolean n787PrvDsc ;
   private boolean returnInSub ;
   private boolean n957FacVtoFch ;
   private boolean n1379AlbBarPie ;
   private boolean n498FpgDsc ;
   private boolean n4990BarTroCal ;
   private String A7210FacObs ;
   private String AV153Txt1 ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04KD2_A396EmprCod ;
   private String[] P04KD2_A407EmprNom ;
   private boolean[] P04KD2_n407EmprNom ;
   private String[] P04KD2_A404EmprDir ;
   private boolean[] P04KD2_n404EmprDir ;
   private String[] P04KD2_A408EmprPob ;
   private boolean[] P04KD2_n408EmprPob ;
   private String[] P04KD2_A409EmprTel ;
   private boolean[] P04KD2_n409EmprTel ;
   private String[] P04KD2_A405EmprFax ;
   private boolean[] P04KD2_n405EmprFax ;
   private String[] P04KD2_A395EmprCif ;
   private boolean[] P04KD2_n395EmprCif ;
   private String[] P04KD2_A8334EmpItm1 ;
   private boolean[] P04KD2_n8334EmpItm1 ;
   private String[] P04KD2_A8335EmpItm2 ;
   private boolean[] P04KD2_n8335EmpItm2 ;
   private String[] P04KD2_A8336EmpItm3 ;
   private boolean[] P04KD2_n8336EmpItm3 ;
   private String[] P04KD2_A8337EmpItm4 ;
   private boolean[] P04KD2_n8337EmpItm4 ;
   private String[] P04KD2_A8338EmpItm5 ;
   private boolean[] P04KD2_n8338EmpItm5 ;
   private String[] P04KD2_A11516EmpItm6 ;
   private boolean[] P04KD2_n11516EmpItm6 ;
   private int[] P04KD3_A430FacCod ;
   private String[] P04KD3_A396EmprCod ;
   private java.math.BigDecimal[] P04KD3_A7211Factrm ;
   private java.math.BigDecimal[] P04KD3_A449FacPreMts ;
   private java.math.BigDecimal[] P04KD3_A447FacMts ;
   private java.math.BigDecimal[] P04KD3_A448FacPreKgs ;
   private java.math.BigDecimal[] P04KD3_A444FacKgs ;
   private java.math.BigDecimal[] P04KD3_A7212FacRect ;
   private java.math.BigDecimal[] P04KD3_A11513FacRecIca ;
   private java.math.BigDecimal[] P04KD3_A8346FacRecI ;
   private boolean[] P04KD3_n8346FacRecI ;
   private byte[] P04KD3_A443FacIVAPor ;
   private int[] P04KD3_A446FacLin ;
   private String[] P04KD4_A7210FacObs ;
   private java.math.BigDecimal[] P04KD4_A7211Factrm ;
   private int[] P04KD4_A430FacCod ;
   private String[] P04KD4_A396EmprCod ;
   private String[] P04KD4_A437FacFpg ;
   private String[] P04KD4_A450FacPri ;
   private java.util.Date[] P04KD4_A436FacFch ;
   private int[] P04KD4_A252CliCod ;
   private byte[] P04KD4_A435FacEst ;
   private java.math.BigDecimal[] P04KD4_A11513FacRecIca ;
   private java.math.BigDecimal[] P04KD4_A8346FacRecI ;
   private boolean[] P04KD4_n8346FacRecI ;
   private java.math.BigDecimal[] P04KD4_A7212FacRect ;
   private java.math.BigDecimal[] P04KD4_A453FacRECPor ;
   private byte[] P04KD4_A443FacIVAPor ;
   private java.math.BigDecimal[] P04KD4_A14224FacCostFac ;
   private java.math.BigDecimal[] P04KD4_A14223FacCostKgs ;
   private java.math.BigDecimal[] P04KD4_A14222FacCostMts ;
   private java.math.BigDecimal[] P04KD4_A14219FacEnergia ;
   private java.math.BigDecimal[] P04KD4_A433FacDtoGen ;
   private java.math.BigDecimal[] P04KD4_A434FacDtoPP ;
   private byte[] P04KD5_A7209Colombia ;
   private boolean[] P04KD5_n7209Colombia ;
   private short[] P04KD6_A781PrvCod ;
   private String[] P04KD6_A3644CliNom1 ;
   private String[] P04KD6_A279CliNom ;
   private String[] P04KD6_A295CliPob ;
   private String[] P04KD6_A293CliPer ;
   private String[] P04KD6_A303CliTel1 ;
   private String[] P04KD6_A260CliDom ;
   private String[] P04KD6_A278CliNif ;
   private String[] P04KD7_A787PrvDsc ;
   private boolean[] P04KD7_n787PrvDsc ;
   private java.math.BigDecimal[] P04KD9_A3918FacImpTot1 ;
   private String[] P04KD10_A396EmprCod ;
   private int[] P04KD10_A430FacCod ;
   private byte[] P04KD10_A956FacVtoLin ;
   private java.util.Date[] P04KD10_A957FacVtoFch ;
   private boolean[] P04KD10_n957FacVtoFch ;
   private int[] P04KD11_A430FacCod ;
   private String[] P04KD11_A396EmprCod ;
   private String[] P04KD11_A432FacDsc ;
   private int[] P04KD11_A1294FacBarCod ;
   private byte[] P04KD11_A1295FacBarReo ;
   private String[] P04KD11_A1296FacBarPar ;
   private long[] P04KD11_A427FacAlbCod ;
   private int[] P04KD11_A446FacLin ;
   private int[] P04KD11_A12197FacUnds ;
   private java.math.BigDecimal[] P04KD11_A3897FacKgsA ;
   private java.math.BigDecimal[] P04KD11_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P04KD11_A12198FacPreUnd ;
   private java.math.BigDecimal[] P04KD11_A449FacPreMts ;
   private java.math.BigDecimal[] P04KD11_A5353FacImpMan ;
   private java.math.BigDecimal[] P04KD11_A447FacMts ;
   private java.math.BigDecimal[] P04KD11_A444FacKgs ;
   private java.math.BigDecimal[] P04KD11_A448FacPreKgs ;
   private java.math.BigDecimal[] P04KD11_A5355FacImpMin ;
   private String[] P04KD13_A130BarCodPar ;
   private byte[] P04KD13_A132BarCodReo ;
   private int[] P04KD13_A129BarCod ;
   private String[] P04KD13_A396EmprCod ;
   private String[] P04KD13_A1652BarSerDsc ;
   private int[] P04KD13_A136BarColNum ;
   private String[] P04KD13_A135BarColNom ;
   private String[] P04KD15_A130BarCodPar ;
   private byte[] P04KD15_A132BarCodReo ;
   private int[] P04KD15_A129BarCod ;
   private long[] P04KD15_A30AlbProCod ;
   private String[] P04KD15_A396EmprCod ;
   private short[] P04KD15_A1379AlbBarPie ;
   private boolean[] P04KD15_n1379AlbBarPie ;
   private String[] P04KD16_A497FpgCod ;
   private String[] P04KD16_A396EmprCod ;
   private String[] P04KD16_A498FpgDsc ;
   private boolean[] P04KD16_n498FpgDsc ;
   private byte[] P04KD17_A287CliPagLin ;
   private int[] P04KD17_A252CliCod ;
   private String[] P04KD17_A396EmprCod ;
   private String[] P04KD17_A288CliPagNom ;
   private String[] P04KD17_A284CliPagCue ;
   private String[] P04KD17_A285CliPagDig ;
   private String[] P04KD17_A283CliPagCcs ;
   private String[] P04KD17_A282CliPagCcb ;
   private short[] P04KD18_A3858BarTroCod ;
   private String[] P04KD18_A130BarCodPar ;
   private byte[] P04KD18_A132BarCodReo ;
   private int[] P04KD18_A129BarCod ;
   private String[] P04KD18_A396EmprCod ;
   private byte[] P04KD18_A4990BarTroCal ;
   private boolean[] P04KD18_n4990BarTroCal ;
   private String[] P04KD18_A200BarPieCod ;
}

final  class pfacfat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04KD2", "SELECT EmprCod, EmprNom, EmprDir, EmprPob, EmprTel, EmprFax, EmprCif, EmpItm1, EmpItm2, EmpItm3, EmpItm4, EmpItm5, EmpItm6 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04KD3", "SELECT T1.FacCod, T1.EmprCod, T2.Factrm, T1.FacPreMts, T1.FacMts, T1.FacPreKgs, T1.FacKgs, T2.FacRect, T2.FacRecIca, T2.FacRecI, T2.FacIVAPor, T1.FacLin FROM (TXPLFAVEN T1 INNER JOIN TXPCFAVEN T2 ON T2.EmprCod = T1.EmprCod AND T2.FacCod = T1.FacCod) WHERE T1.EmprCod = ? and T1.FacCod = ? ORDER BY T1.EmprCod, T1.FacCod, T1.FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04KD4", "SELECT FacObs, Factrm, FacCod, EmprCod, FacFpg, FacPri, FacFch, CliCod, FacEst, FacRecIca, FacRecI, FacRect, FacRECPor, FacIVAPor, FacCostFac, FacCostKgs, FacCostMts, FacEnergia, FacDtoGen, FacDtoPP FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?)  FOR UPDATE OF FacEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04KD5", "SELECT Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04KD6", "SELECT PrvCod, CliNom1, CliNom, CliPob, CliPer, CliTel1, CliDom, CliNif FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04KD7", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04KD9", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04KD10", "SELECT EmprCod, FacCod, FacVtoLin, FacVtoFch FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04KD11", "SELECT FacCod, EmprCod, FacDsc, FacBarCod, FacBarReo, FacBarPar, FacAlbCod, FacLin, FacUnds, FacKgsA, FacPreKgsA, FacPreUnd, FacPreMts, FacImpMan, FacMts, FacKgs, FacPreKgs, FacImpMin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04KD12", "UPDATE TXPCFAVEN SET FacEst=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
         ,new ForEachCursor("P04KD13", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarSerDsc, BarColNum, BarColNom FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04KD15", "SELECT * FROM (SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.AlbProCod, T1.EmprCod, COALESCE( T2.AlbBarPie, 0) AS AlbBarPie FROM (TXPALBBAR T1 LEFT JOIN (SELECT COUNT(*) AS AlbBarPie, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALPRD GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04KD16", "SELECT FpgCod, EmprCod, FpgDsc FROM TXPFORPAG WHERE EmprCod = ? and FpgCod = ? ORDER BY EmprCod, FpgCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04KD17", "SELECT CliPagLin, CliCod, EmprCod, CliPagNom, CliPagCue, CliPagDig, CliPagCcs, CliPagCcb FROM TXPCLIPAG WHERE (EmprCod = ? and CliCod = ?) AND (CliPagLin = TO_NUMBER(NVL(TRIM(?), '0'))) ORDER BY EmprCod, CliCod, CliPagLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04KD18", "SELECT BarTroCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarTroCal, BarPieCod FROM TXPBARTRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarTroCod = 9999) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               ((int[]) buf[12])[0] = rslt.getInt(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
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
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 15);
               ((String[]) buf[6])[0] = rslt.getString(7, 34);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((long[]) buf[6])[0] = rslt.getLong(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,5);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 2);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

