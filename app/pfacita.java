package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;
import com.genexus.reports.*;

public final  class pfacita extends GXReport
{
   public pfacita( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfacita.class ), "" );
   }

   public pfacita( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pfacita.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pfacita.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfacita.this.A430FacCod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      M_top = 0 ;
      M_bot = 0 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      try
      {
         Gx_out = "PRN" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "FACTURAS", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().GxSetDocName("Factura Italcolore") ;
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GxHdr2 = true ;
         /* Using cursor P02GS2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), A396EmprCod, Integer.valueOf(A430FacCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1153FacTipFac = P02GS2_A1153FacTipFac[0] ;
            A435FacEst = P02GS2_A435FacEst[0] ;
            A436FacFch = P02GS2_A436FacFch[0] ;
            A252CliCod = P02GS2_A252CliCod[0] ;
            A11513FacRecIca = P02GS2_A11513FacRecIca[0] ;
            A8346FacRecI = P02GS2_A8346FacRecI[0] ;
            n8346FacRecI = P02GS2_n8346FacRecI[0] ;
            A7212FacRect = P02GS2_A7212FacRect[0] ;
            A453FacRECPor = P02GS2_A453FacRECPor[0] ;
            A443FacIVAPor = P02GS2_A443FacIVAPor[0] ;
            A14224FacCostFac = P02GS2_A14224FacCostFac[0] ;
            A14223FacCostKgs = P02GS2_A14223FacCostKgs[0] ;
            A14222FacCostMts = P02GS2_A14222FacCostMts[0] ;
            A434FacDtoPP = P02GS2_A434FacDtoPP[0] ;
            A433FacDtoGen = P02GS2_A433FacDtoGen[0] ;
            A14219FacEnergia = P02GS2_A14219FacEnergia[0] ;
            /* Using cursor P02GS3 */
            pr_default.execute(1, new Object[] {A396EmprCod});
            A408EmprPob = P02GS3_A408EmprPob[0] ;
            n408EmprPob = P02GS3_n408EmprPob[0] ;
            A7209Colombia = P02GS3_A7209Colombia[0] ;
            n7209Colombia = P02GS3_n7209Colombia[0] ;
            /* Using cursor P02GS5 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            if ( (pr_default.getStatus(2) != 101) )
            {
               A3918FacImpTot1 = P02GS5_A3918FacImpTot1[0] ;
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
            A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
            A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
            A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
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
            A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
            A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
            A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
            /* Using cursor P02GS6 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
            A781PrvCod = P02GS6_A781PrvCod[0] ;
            A295CliPob = P02GS6_A295CliPob[0] ;
            A256CliCp = P02GS6_A256CliCp[0] ;
            A260CliDom = P02GS6_A260CliDom[0] ;
            A279CliNom = P02GS6_A279CliNom[0] ;
            A278CliNif = P02GS6_A278CliNif[0] ;
            /* Using cursor P02GS7 */
            pr_default.execute(4, new Object[] {Short.valueOf(A781PrvCod)});
            A787PrvDsc = P02GS7_A787PrvDsc[0] ;
            n787PrvDsc = P02GS7_n787PrvDsc[0] ;
            /* Using cursor P02GS8 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
            while ( (pr_default.getStatus(5) != 101) )
            {
               A428FacAlbTip = P02GS8_A428FacAlbTip[0] ;
               A432FacDsc = P02GS8_A432FacDsc[0] ;
               A427FacAlbCod = P02GS8_A427FacAlbCod[0] ;
               A446FacLin = P02GS8_A446FacLin[0] ;
               A12197FacUnds = P02GS8_A12197FacUnds[0] ;
               A3897FacKgsA = P02GS8_A3897FacKgsA[0] ;
               A3898FacPreKgsA = P02GS8_A3898FacPreKgsA[0] ;
               A12198FacPreUnd = P02GS8_A12198FacPreUnd[0] ;
               A449FacPreMts = P02GS8_A449FacPreMts[0] ;
               A5353FacImpMan = P02GS8_A5353FacImpMan[0] ;
               A447FacMts = P02GS8_A447FacMts[0] ;
               A444FacKgs = P02GS8_A444FacKgs[0] ;
               A448FacPreKgs = P02GS8_A448FacPreKgs[0] ;
               A5355FacImpMin = P02GS8_A5355FacImpMin[0] ;
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
               if ( A438FacImp.doubleValue() > 0 )
               {
                  if ( A428FacAlbTip == 1 )
                  {
                     h2GS0( false, 17) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A448FacPreKgs, "ZZZZZZ9.999")), 645, Gx_line+0, 698, Gx_line+16, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A427FacAlbCod), "ZZZZZZZZZ9")), 196, Gx_line+0, 270, Gx_line+17, 2+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A438FacImp, "ZZZZZZZZZZ9.99")), 714, Gx_line+0, 794, Gx_line+16, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A444FacKgs, "ZZZZZ9.99")), 124, Gx_line+0, 177, Gx_line+16, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A447FacMts, "ZZZZZ9.99")), 44, Gx_line+0, 97, Gx_line+16, 2, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "m", ""), 105, Gx_line+1, 115, Gx_line+15, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "k", ""), 185, Gx_line+1, 193, Gx_line+15, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 277, Gx_line+0, 570, Gx_line+17, 0+256, 0, 0, 0) ;
                     getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A449FacPreMts, "ZZZZZZ9.999")), 583, Gx_line+0, 636, Gx_line+16, 2, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+17) ;
                  }
                  else
                  {
                     AV9FacAlbMtr = (int)(DecimalUtil.decToDouble(A447FacMts.add(A444FacKgs))) ;
                     AV17Precio = A449FacPreMts.add(A448FacPreKgs) ;
                     if ( A1153FacTipFac == 0 )
                     {
                        h2GS0( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A438FacImp, "ZZZZZZZZZZ9.99")), 714, Gx_line+0, 794, Gx_line+16, 2, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 277, Gx_line+0, 570, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Precio, "ZZZZZ9.99")), 603, Gx_line+0, 670, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9FacAlbMtr), "ZZZZ9")), 44, Gx_line+0, 97, Gx_line+16, 2, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A427FacAlbCod), "ZZZZZZZZZ9")), 196, Gx_line+0, 270, Gx_line+17, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                     else
                     {
                        h2GS0( false, 17) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A438FacImp, "ZZZZZZZZZZ9.99")), 714, Gx_line+0, 794, Gx_line+16, 2, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 277, Gx_line+0, 570, Gx_line+17, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV17Precio, "ZZZZZ9.99")), 603, Gx_line+0, 670, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9FacAlbMtr), "ZZZZ9")), 44, Gx_line+0, 97, Gx_line+16, 2, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+17) ;
                     }
                  }
               }
               else
               {
                  h2GS0( false, 17) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A432FacDsc, "")), 277, Gx_line+0, 570, Gx_line+17, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
               }
               pr_default.readNext(5);
            }
            pr_default.close(5);
            Gx_line = 800 ;
            GXv_decimal1[0] = A455FacTot ;
            GXv_char2[0] = AV11ImpTxt ;
            GXv_int3[0] = (short)(DecimalUtil.decToDouble(AV12ImpLen)) ;
            new app.pconvar(remoteHandle, context).execute( GXv_decimal1, GXv_char2, GXv_int3) ;
            pfacita.this.A455FacTot = GXv_decimal1[0] ;
            pfacita.this.AV11ImpTxt = GXv_char2[0] ;
            pfacita.this.AV12ImpLen = DecimalUtil.doubleToDec(GXv_int3[0]) ;
            AV13EmprPob = GXutil.trim( A408EmprPob) ;
            h2GS0( false, 217) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV11ImpTxt, "")), 96, Gx_line+0, 794, Gx_line+47, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A429FacBasImp, "ZZZZZZZZZ9.99")), 714, Gx_line+47, 794, Gx_line+63, 2, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A442FacIVAImp, "ZZZZZZZ9.99")), 714, Gx_line+78, 795, Gx_line+95, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A455FacTot, "ZZZZZZZZZ9.99")), 714, Gx_line+109, 794, Gx_line+125, 2, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+217) ;
            if ( A435FacEst == 0 )
            {
               A435FacEst = (byte)(1) ;
            }
            /* Using cursor P02GS9 */
            pr_default.execute(6, new Object[] {Byte.valueOf(A435FacEst), A396EmprCod, Integer.valueOf(A430FacCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         pr_default.close(1);
         pr_default.close(3);
         pr_default.close(4);
         pr_default.close(2);
         GxHdr2 = false ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h2GS0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void h2GS0( boolean bFoot ,
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
            if ( GxHdr2 )
            {
               if ( A1153FacTipFac == 1 )
               {
                  getPrinter().GxDrawRect(477, Gx_line+17, 599, Gx_line+41, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Arial Narrow", 16, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "NOTA DE CREDITO", ""), 477, Gx_line+47, 642, Gx_line+74, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+77) ;
                  /* Noskip command */
                  Gx_line = Gx_OldLine ;
               }
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 343, Gx_line+101, 393, Gx_line+118, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A278CliNif, "@!")), 248, Gx_line+164, 394, Gx_line+180, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 109, Gx_line+101, 265, Gx_line+117, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A260CliDom, "")), 109, Gx_line+117, 323, Gx_line+135, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A256CliCp, "")), 109, Gx_line+164, 165, Gx_line+182, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A295CliPob, "")), 109, Gx_line+132, 390, Gx_line+150, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")), 109, Gx_line+148, 266, Gx_line+165, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 569, Gx_line+148, 622, Gx_line+166, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+320) ;
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
      this.aP0[0] = pfacita.this.A396EmprCod;
      this.aP1[0] = pfacita.this.A430FacCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pfacita");
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
      P02GS2_A396EmprCod = new String[] {""} ;
      P02GS2_A430FacCod = new int[1] ;
      P02GS2_A1153FacTipFac = new byte[1] ;
      P02GS2_A435FacEst = new byte[1] ;
      P02GS2_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P02GS2_A252CliCod = new int[1] ;
      P02GS2_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS2_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS2_n8346FacRecI = new boolean[] {false} ;
      P02GS2_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS2_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS2_A443FacIVAPor = new byte[1] ;
      P02GS2_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS2_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS2_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS2_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS2_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS2_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A436FacFch = GXutil.nullDate() ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      P02GS3_A408EmprPob = new String[] {""} ;
      P02GS3_n408EmprPob = new boolean[] {false} ;
      P02GS3_A7209Colombia = new byte[1] ;
      P02GS3_n7209Colombia = new boolean[] {false} ;
      A408EmprPob = "" ;
      P02GS5_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      P02GS6_A781PrvCod = new short[1] ;
      P02GS6_A295CliPob = new String[] {""} ;
      P02GS6_A256CliCp = new String[] {""} ;
      P02GS6_A260CliDom = new String[] {""} ;
      P02GS6_A279CliNom = new String[] {""} ;
      P02GS6_A278CliNif = new String[] {""} ;
      A295CliPob = "" ;
      A256CliCp = "" ;
      A260CliDom = "" ;
      A279CliNom = "" ;
      A278CliNif = "" ;
      P02GS7_A787PrvDsc = new String[] {""} ;
      P02GS7_n787PrvDsc = new boolean[] {false} ;
      A787PrvDsc = "" ;
      P02GS8_A396EmprCod = new String[] {""} ;
      P02GS8_A430FacCod = new int[1] ;
      P02GS8_A428FacAlbTip = new byte[1] ;
      P02GS8_A432FacDsc = new String[] {""} ;
      P02GS8_A427FacAlbCod = new long[1] ;
      P02GS8_A446FacLin = new int[1] ;
      P02GS8_A12197FacUnds = new int[1] ;
      P02GS8_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS8_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS8_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS8_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS8_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS8_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS8_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS8_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02GS8_A5355FacImpMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A432FacDsc = "" ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A5355FacImpMin = DecimalUtil.ZERO ;
      A2239FacIml = DecimalUtil.ZERO ;
      A3923FacImp1 = DecimalUtil.ZERO ;
      A438FacImp = DecimalUtil.ZERO ;
      AV17Precio = DecimalUtil.ZERO ;
      GXv_decimal1 = new java.math.BigDecimal[1] ;
      AV11ImpTxt = "" ;
      GXv_char2 = new String[1] ;
      AV12ImpLen = DecimalUtil.ZERO ;
      GXv_int3 = new short[1] ;
      AV13EmprPob = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfacita__default(),
         new Object[] {
             new Object[] {
            P02GS2_A396EmprCod, P02GS2_A430FacCod, P02GS2_A1153FacTipFac, P02GS2_A435FacEst, P02GS2_A436FacFch, P02GS2_A252CliCod, P02GS2_A11513FacRecIca, P02GS2_A8346FacRecI, P02GS2_n8346FacRecI, P02GS2_A7212FacRect,
            P02GS2_A453FacRECPor, P02GS2_A443FacIVAPor, P02GS2_A14224FacCostFac, P02GS2_A14223FacCostKgs, P02GS2_A14222FacCostMts, P02GS2_A434FacDtoPP, P02GS2_A433FacDtoGen, P02GS2_A14219FacEnergia
            }
            , new Object[] {
            P02GS3_A408EmprPob, P02GS3_n408EmprPob, P02GS3_A7209Colombia, P02GS3_n7209Colombia
            }
            , new Object[] {
            P02GS5_A3918FacImpTot1
            }
            , new Object[] {
            P02GS6_A781PrvCod, P02GS6_A295CliPob, P02GS6_A256CliCp, P02GS6_A260CliDom, P02GS6_A279CliNom, P02GS6_A278CliNif
            }
            , new Object[] {
            P02GS7_A787PrvDsc, P02GS7_n787PrvDsc
            }
            , new Object[] {
            P02GS8_A396EmprCod, P02GS8_A430FacCod, P02GS8_A428FacAlbTip, P02GS8_A432FacDsc, P02GS8_A427FacAlbCod, P02GS8_A446FacLin, P02GS8_A12197FacUnds, P02GS8_A3897FacKgsA, P02GS8_A3898FacPreKgsA, P02GS8_A12198FacPreUnd,
            P02GS8_A449FacPreMts, P02GS8_A5353FacImpMan, P02GS8_A447FacMts, P02GS8_A444FacKgs, P02GS8_A448FacPreKgs, P02GS8_A5355FacImpMin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private byte A1153FacTipFac ;
   private byte A435FacEst ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private byte A428FacAlbTip ;
   private short A781PrvCod ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int A430FacCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A446FacLin ;
   private int A12197FacUnds ;
   private int Gx_OldLine ;
   private int AV9FacAlbMtr ;
   private long A427FacAlbCod ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A5355FacImpMin ;
   private java.math.BigDecimal A2239FacIml ;
   private java.math.BigDecimal A3923FacImp1 ;
   private java.math.BigDecimal A438FacImp ;
   private java.math.BigDecimal AV17Precio ;
   private java.math.BigDecimal GXv_decimal1[] ;
   private java.math.BigDecimal AV12ImpLen ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A408EmprPob ;
   private String A295CliPob ;
   private String A256CliCp ;
   private String A260CliDom ;
   private String A279CliNom ;
   private String A278CliNif ;
   private String A787PrvDsc ;
   private String A432FacDsc ;
   private String AV11ImpTxt ;
   private String GXv_char2[] ;
   private String AV13EmprPob ;
   private java.util.Date A436FacFch ;
   private boolean GxHdr2 ;
   private boolean n8346FacRecI ;
   private boolean n408EmprPob ;
   private boolean n7209Colombia ;
   private boolean n787PrvDsc ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02GS2_A396EmprCod ;
   private int[] P02GS2_A430FacCod ;
   private byte[] P02GS2_A1153FacTipFac ;
   private byte[] P02GS2_A435FacEst ;
   private java.util.Date[] P02GS2_A436FacFch ;
   private int[] P02GS2_A252CliCod ;
   private java.math.BigDecimal[] P02GS2_A11513FacRecIca ;
   private java.math.BigDecimal[] P02GS2_A8346FacRecI ;
   private boolean[] P02GS2_n8346FacRecI ;
   private java.math.BigDecimal[] P02GS2_A7212FacRect ;
   private java.math.BigDecimal[] P02GS2_A453FacRECPor ;
   private byte[] P02GS2_A443FacIVAPor ;
   private java.math.BigDecimal[] P02GS2_A14224FacCostFac ;
   private java.math.BigDecimal[] P02GS2_A14223FacCostKgs ;
   private java.math.BigDecimal[] P02GS2_A14222FacCostMts ;
   private java.math.BigDecimal[] P02GS2_A434FacDtoPP ;
   private java.math.BigDecimal[] P02GS2_A433FacDtoGen ;
   private java.math.BigDecimal[] P02GS2_A14219FacEnergia ;
   private String[] P02GS3_A408EmprPob ;
   private boolean[] P02GS3_n408EmprPob ;
   private byte[] P02GS3_A7209Colombia ;
   private boolean[] P02GS3_n7209Colombia ;
   private java.math.BigDecimal[] P02GS5_A3918FacImpTot1 ;
   private short[] P02GS6_A781PrvCod ;
   private String[] P02GS6_A295CliPob ;
   private String[] P02GS6_A256CliCp ;
   private String[] P02GS6_A260CliDom ;
   private String[] P02GS6_A279CliNom ;
   private String[] P02GS6_A278CliNif ;
   private String[] P02GS7_A787PrvDsc ;
   private boolean[] P02GS7_n787PrvDsc ;
   private String[] P02GS8_A396EmprCod ;
   private int[] P02GS8_A430FacCod ;
   private byte[] P02GS8_A428FacAlbTip ;
   private String[] P02GS8_A432FacDsc ;
   private long[] P02GS8_A427FacAlbCod ;
   private int[] P02GS8_A446FacLin ;
   private int[] P02GS8_A12197FacUnds ;
   private java.math.BigDecimal[] P02GS8_A3897FacKgsA ;
   private java.math.BigDecimal[] P02GS8_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P02GS8_A12198FacPreUnd ;
   private java.math.BigDecimal[] P02GS8_A449FacPreMts ;
   private java.math.BigDecimal[] P02GS8_A5353FacImpMan ;
   private java.math.BigDecimal[] P02GS8_A447FacMts ;
   private java.math.BigDecimal[] P02GS8_A444FacKgs ;
   private java.math.BigDecimal[] P02GS8_A448FacPreKgs ;
   private java.math.BigDecimal[] P02GS8_A5355FacImpMin ;
}

final  class pfacita__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02GS2", "SELECT EmprCod, FacCod, FacTipFac, FacEst, FacFch, CliCod, FacRecIca, FacRecI, FacRect, FacRECPor, FacIVAPor, FacCostFac, FacCostKgs, FacCostMts, FacDtoPP, FacDtoGen, FacEnergia FROM TXPCFAVEN WHERE (EmprCod = ? AND FacCod = ?) AND (EmprCod = ? and FacCod = ?)  FOR UPDATE OF FacEst NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02GS3", "SELECT EmprPob, Colombia FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02GS5", "SELECT COALESCE( T1.FacImpTot1, 0) AS FacImpTot1 FROM (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T1 WHERE T1.EmprCod = ? AND T1.FacCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02GS6", "SELECT PrvCod, CliPob, CliCp, CliDom, CliNom, CliNif FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02GS7", "SELECT PrvDsc FROM TXPPROVIN WHERE PrvCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02GS8", "SELECT EmprCod, FacCod, FacAlbTip, FacDsc, FacAlbCod, FacLin, FacUnds, FacKgsA, FacPreKgsA, FacPreUnd, FacPreMts, FacImpMan, FacMts, FacKgs, FacPreKgs, FacImpMin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02GS9", "UPDATE TXPCFAVEN SET FacEst=?  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFAVEN")
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,3);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 35);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
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
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

