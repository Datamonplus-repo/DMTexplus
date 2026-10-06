package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rfa0006_impl extends GXWebReport
{
   public rfa0006_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         A396EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV15PCliCod = (int)(GXutil.lval( httpContext.GetPar( "PCliCod"))) ;
            AV16UCliCod = (int)(GXutil.lval( httpContext.GetPar( "UCliCod"))) ;
            AV17PFecha = localUtil.parseDateParm( httpContext.GetPar( "PFecha")) ;
            AV18UFecha = localUtil.parseDateParm( httpContext.GetPar( "UFecha")) ;
            AV19PRIO = httpContext.GetPar( "PRIO") ;
            AV20ImpCod = httpContext.GetPar( "ImpCod") ;
            AV21SerieF = (byte)(GXutil.lval( httpContext.GetPar( "SerieF"))) ;
            AV65noserie = (byte)(GXutil.lval( httpContext.GetPar( "noserie"))) ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV42Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN800_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit0 = GXt_char1 ;
         GXt_char1 = AV43Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit1 = GXt_char1 ;
         GXt_char1 = AV44Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit2 = GXt_char1 ;
         GXt_char1 = AV45Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit3 = GXt_char1 ;
         GXt_char1 = AV46Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2038_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit4 = GXt_char1 ;
         GXt_char1 = AV47Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2300_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit5 = GXt_char1 ;
         GXt_char1 = AV48Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN602_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV48Lit6 = GXt_char1 ;
         GXt_char1 = AV49Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2119_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV49Lit7 = GXt_char1 ;
         GXt_char1 = AV50Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2120_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV50Lit8 = GXt_char1 ;
         GXt_char1 = AV51Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2036_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV51Lit9 = GXt_char1 ;
         GXt_char1 = AV52Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2194_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV52Lit10 = GXt_char1 ;
         GXt_char1 = AV53Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2540_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV53Lit11 = GXt_char1 ;
         GXt_char1 = AV54Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2160_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV54Lit12 = GXt_char1 ;
         GXt_char1 = AV55Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2482_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV55Lit13 = GXt_char1 ;
         GXt_char1 = AV56Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2490_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV56Lit14 = GXt_char1 ;
         GXt_char1 = AV57Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2158_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV57Lit15 = GXt_char1 ;
         GXt_char1 = AV58Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2172_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV58Lit16 = GXt_char1 ;
         GXt_char1 = AV61Lit17 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rfa0006_impl.this.GXt_char1 = GXv_char2[0] ;
         AV61Lit17 = GXt_char1 ;
         GXt_int3 = AV64NotCre ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOTCRE", ""), GXv_int4) ;
         rfa0006_impl.this.GXt_int3 = GXv_int4[0] ;
         AV64NotCre = GXt_int3 ;
         /* Using cursor P06M12 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06M12_A407EmprNom[0] ;
            n407EmprNom = P06M12_n407EmprNom[0] ;
            A963Ser1 = P06M12_A963Ser1[0] ;
            n963Ser1 = P06M12_n963Ser1[0] ;
            A2387Ser2 = P06M12_A2387Ser2[0] ;
            n2387Ser2 = P06M12_n2387Ser2[0] ;
            A2389Ser3 = P06M12_A2389Ser3[0] ;
            n2389Ser3 = P06M12_n2389Ser3[0] ;
            A4215Ser4 = P06M12_A4215Ser4[0] ;
            n4215Ser4 = P06M12_n4215Ser4[0] ;
            A4217Ser5 = P06M12_A4217Ser5[0] ;
            n4217Ser5 = P06M12_n4217Ser5[0] ;
            A4219Ser6 = P06M12_A4219Ser6[0] ;
            n4219Ser6 = P06M12_n4219Ser6[0] ;
            A4221Ser7 = P06M12_A4221Ser7[0] ;
            n4221Ser7 = P06M12_n4221Ser7[0] ;
            AV59EmprNom = A407EmprNom ;
            if ( AV21SerieF == 1 )
            {
               AV60FacSerNum = A963Ser1 ;
            }
            else
            {
               if ( AV21SerieF == 2 )
               {
                  AV60FacSerNum = A2387Ser2 ;
               }
               else
               {
                  if ( AV21SerieF == 3 )
                  {
                     AV60FacSerNum = A2389Ser3 ;
                  }
                  else
                  {
                     if ( AV21SerieF == 4 )
                     {
                        AV60FacSerNum = A4215Ser4 ;
                     }
                     else
                     {
                        if ( AV21SerieF == 5 )
                        {
                           AV60FacSerNum = A4217Ser5 ;
                        }
                        else
                        {
                           if ( AV21SerieF == 6 )
                           {
                              AV60FacSerNum = A4219Ser6 ;
                           }
                           else
                           {
                              if ( AV21SerieF == 7 )
                              {
                                 AV60FacSerNum = A4221Ser7 ;
                              }
                           }
                        }
                     }
                  }
               }
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV24TotImp = DecimalUtil.doubleToDec(0) ;
         AV25TotDtoGen = DecimalUtil.doubleToDec(0) ;
         AV26TotDtoPP = DecimalUtil.doubleToDec(0) ;
         AV27TotBasImp = DecimalUtil.doubleToDec(0) ;
         AV28TotIVAImp = DecimalUtil.doubleToDec(0) ;
         AV29TotFac = DecimalUtil.doubleToDec(0) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV17PFecha ,
                                              AV18UFecha ,
                                              Integer.valueOf(AV15PCliCod) ,
                                              Integer.valueOf(AV16UCliCod) ,
                                              A436FacFch ,
                                              Integer.valueOf(A252CliCod) ,
                                              A396EmprCod ,
                                              A2739FacSerNum ,
                                              AV60FacSerNum ,
                                              Byte.valueOf(AV65noserie) } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                              }
         });
         /* Using cursor P06M14 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV60FacSerNum, Byte.valueOf(AV65noserie), AV17PFecha, AV18UFecha, Integer.valueOf(AV15PCliCod), Integer.valueOf(AV16UCliCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6M14 = false ;
            A1153FacTipFac = P06M14_A1153FacTipFac[0] ;
            A279CliNom = P06M14_A279CliNom[0] ;
            A430FacCod = P06M14_A430FacCod[0] ;
            A436FacFch = P06M14_A436FacFch[0] ;
            A2739FacSerNum = P06M14_A2739FacSerNum[0] ;
            A252CliCod = P06M14_A252CliCod[0] ;
            A450FacPri = P06M14_A450FacPri[0] ;
            A11513FacRecIca = P06M14_A11513FacRecIca[0] ;
            A8346FacRecI = P06M14_A8346FacRecI[0] ;
            n8346FacRecI = P06M14_n8346FacRecI[0] ;
            A7212FacRect = P06M14_A7212FacRect[0] ;
            A443FacIVAPor = P06M14_A443FacIVAPor[0] ;
            A14224FacCostFac = P06M14_A14224FacCostFac[0] ;
            A14223FacCostKgs = P06M14_A14223FacCostKgs[0] ;
            A14222FacCostMts = P06M14_A14222FacCostMts[0] ;
            A434FacDtoPP = P06M14_A434FacDtoPP[0] ;
            A433FacDtoGen = P06M14_A433FacDtoGen[0] ;
            A14219FacEnergia = P06M14_A14219FacEnergia[0] ;
            A3918FacImpTot1 = P06M14_A3918FacImpTot1[0] ;
            A453FacRECPor = P06M14_A453FacRECPor[0] ;
            A7209Colombia = P06M14_A7209Colombia[0] ;
            n7209Colombia = P06M14_n7209Colombia[0] ;
            A7209Colombia = P06M14_A7209Colombia[0] ;
            n7209Colombia = P06M14_n7209Colombia[0] ;
            A3918FacImpTot1 = P06M14_A3918FacImpTot1[0] ;
            A279CliNom = P06M14_A279CliNom[0] ;
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
            A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
            if ( ( GXutil.strcmp(AV19PRIO, "2") == 0 ) || ( GXutil.strcmp(A450FacPri, AV19PRIO) == 0 ) )
            {
               AV30TotImpF = DecimalUtil.doubleToDec(0) ;
               AV31TotDtoGenF = DecimalUtil.doubleToDec(0) ;
               AV32TotDtoPPF = DecimalUtil.doubleToDec(0) ;
               AV33TotBasImpF = DecimalUtil.doubleToDec(0) ;
               AV34TotIVAImpF = DecimalUtil.doubleToDec(0) ;
               AV35TotFacF = DecimalUtil.doubleToDec(0) ;
               h6M10( false, 33) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(":", 139, Gx_line+9, 144, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Lit12, "")), 22, Gx_line+9, 132, Gx_line+27, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 153, Gx_line+9, 212, Gx_line+26, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
               while ( (pr_default.getStatus(1) != 101) && GXutil.dateCompare(GXutil.resetTime(P06M14_A436FacFch[0]), GXutil.resetTime(A436FacFch)) )
               {
                  brk6M14 = false ;
                  A1153FacTipFac = P06M14_A1153FacTipFac[0] ;
                  A279CliNom = P06M14_A279CliNom[0] ;
                  A430FacCod = P06M14_A430FacCod[0] ;
                  A2739FacSerNum = P06M14_A2739FacSerNum[0] ;
                  A252CliCod = P06M14_A252CliCod[0] ;
                  A450FacPri = P06M14_A450FacPri[0] ;
                  A11513FacRecIca = P06M14_A11513FacRecIca[0] ;
                  A8346FacRecI = P06M14_A8346FacRecI[0] ;
                  n8346FacRecI = P06M14_n8346FacRecI[0] ;
                  A7212FacRect = P06M14_A7212FacRect[0] ;
                  A443FacIVAPor = P06M14_A443FacIVAPor[0] ;
                  A14224FacCostFac = P06M14_A14224FacCostFac[0] ;
                  A14223FacCostKgs = P06M14_A14223FacCostKgs[0] ;
                  A14222FacCostMts = P06M14_A14222FacCostMts[0] ;
                  A434FacDtoPP = P06M14_A434FacDtoPP[0] ;
                  A433FacDtoGen = P06M14_A433FacDtoGen[0] ;
                  A14219FacEnergia = P06M14_A14219FacEnergia[0] ;
                  A3918FacImpTot1 = P06M14_A3918FacImpTot1[0] ;
                  A453FacRECPor = P06M14_A453FacRECPor[0] ;
                  A7209Colombia = P06M14_A7209Colombia[0] ;
                  n7209Colombia = P06M14_n7209Colombia[0] ;
                  A7209Colombia = P06M14_A7209Colombia[0] ;
                  n7209Colombia = P06M14_n7209Colombia[0] ;
                  A3918FacImpTot1 = P06M14_A3918FacImpTot1[0] ;
                  A279CliNom = P06M14_A279CliNom[0] ;
                  if ( GXutil.strcmp(P06M14_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     if ( ( GXutil.strcmp(A2739FacSerNum, AV60FacSerNum) == 0 ) || ( AV65noserie == 1 ) )
                     {
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
                        if ( ( GXutil.strcmp(AV19PRIO, "2") == 0 ) || ( GXutil.strcmp(A450FacPri, AV19PRIO) == 0 ) )
                        {
                           AV40TotIVAImpC = DecimalUtil.doubleToDec(0) ;
                           while ( (pr_default.getStatus(1) != 101) && GXutil.dateCompare(GXutil.resetTime(P06M14_A436FacFch[0]), GXutil.resetTime(A436FacFch)) && ( P06M14_A252CliCod[0] == A252CliCod ) )
                           {
                              brk6M14 = false ;
                              A1153FacTipFac = P06M14_A1153FacTipFac[0] ;
                              A279CliNom = P06M14_A279CliNom[0] ;
                              A430FacCod = P06M14_A430FacCod[0] ;
                              A2739FacSerNum = P06M14_A2739FacSerNum[0] ;
                              A450FacPri = P06M14_A450FacPri[0] ;
                              A11513FacRecIca = P06M14_A11513FacRecIca[0] ;
                              A8346FacRecI = P06M14_A8346FacRecI[0] ;
                              n8346FacRecI = P06M14_n8346FacRecI[0] ;
                              A7212FacRect = P06M14_A7212FacRect[0] ;
                              A443FacIVAPor = P06M14_A443FacIVAPor[0] ;
                              A14224FacCostFac = P06M14_A14224FacCostFac[0] ;
                              A14223FacCostKgs = P06M14_A14223FacCostKgs[0] ;
                              A14222FacCostMts = P06M14_A14222FacCostMts[0] ;
                              A434FacDtoPP = P06M14_A434FacDtoPP[0] ;
                              A433FacDtoGen = P06M14_A433FacDtoGen[0] ;
                              A14219FacEnergia = P06M14_A14219FacEnergia[0] ;
                              A3918FacImpTot1 = P06M14_A3918FacImpTot1[0] ;
                              A453FacRECPor = P06M14_A453FacRECPor[0] ;
                              A7209Colombia = P06M14_A7209Colombia[0] ;
                              n7209Colombia = P06M14_n7209Colombia[0] ;
                              A7209Colombia = P06M14_A7209Colombia[0] ;
                              n7209Colombia = P06M14_n7209Colombia[0] ;
                              A3918FacImpTot1 = P06M14_A3918FacImpTot1[0] ;
                              A279CliNom = P06M14_A279CliNom[0] ;
                              if ( GXutil.strcmp(P06M14_A396EmprCod[0], A396EmprCod) == 0 )
                              {
                                 if ( ( GXutil.strcmp(A2739FacSerNum, AV60FacSerNum) == 0 ) || ( AV65noserie == 1 ) )
                                 {
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
                                    if ( ( GXutil.strcmp(AV19PRIO, "2") == 0 ) || ( GXutil.strcmp(A450FacPri, AV19PRIO) == 0 ) )
                                    {
                                       AV40TotIVAImpC = A442FacIVAImp.add(A452FacRecImp) ;
                                       if ( ( AV64NotCre == 0 ) || ( A1153FacTipFac != 1 ) )
                                       {
                                          h6M10( false, 17) ;
                                          getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 5, Gx_line+0, 50, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 53, Gx_line+0, 273, Gx_line+17, 0+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 282, Gx_line+0, 341, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 350, Gx_line+0, 409, Gx_line+17, 0+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A441FacImpTot, "ZZZZZZZZZ9.99")), 417, Gx_line+0, 513, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A439FacImpGen, "ZZZZZZZ9.99")), 519, Gx_line+0, 600, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A440FacImpPP, "ZZZZZZZ9.99")), 607, Gx_line+0, 688, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A429FacBasImp, "ZZZZZZZZZ9.99")), 694, Gx_line+0, 790, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TotIVAImpC, "ZZZZZZZ9.99")), 795, Gx_line+0, 876, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A455FacTot, "ZZZZZZZZZ9.99")), 881, Gx_line+0, 977, Gx_line+17, 2+256, 0, 0, 0) ;
                                          Gx_OldLine = Gx_line ;
                                          Gx_line = (int)(Gx_line+17) ;
                                          AV30TotImpF = AV30TotImpF.add(A441FacImpTot) ;
                                          AV31TotDtoGenF = AV31TotDtoGenF.add(A439FacImpGen) ;
                                          AV32TotDtoPPF = AV32TotDtoPPF.add(A440FacImpPP) ;
                                          AV33TotBasImpF = AV33TotBasImpF.add(A429FacBasImp) ;
                                          AV34TotIVAImpF = AV34TotIVAImpF.add(AV40TotIVAImpC) ;
                                          AV35TotFacF = AV35TotFacF.add(A455FacTot) ;
                                       }
                                       else
                                       {
                                          h6M10( false, 17) ;
                                          getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 5, Gx_line+0, 50, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 53, Gx_line+0, 273, Gx_line+17, 0+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), 282, Gx_line+0, 341, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 350, Gx_line+0, 409, Gx_line+17, 0+256, 0, 0, 0) ;
                                          getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 255, 0, 0, 0, 255, 255, 255) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A441FacImpTot, "ZZZZZZZZZ9.99")), 417, Gx_line+0, 513, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A439FacImpGen, "ZZZZZZZ9.99")), 519, Gx_line+0, 600, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A440FacImpPP, "ZZZZZZZ9.99")), 607, Gx_line+0, 688, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A429FacBasImp, "ZZZZZZZZZ9.99")), 694, Gx_line+0, 790, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV40TotIVAImpC, "ZZZZZZZ9.99")), 795, Gx_line+0, 876, Gx_line+17, 2+256, 0, 0, 0) ;
                                          getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A455FacTot, "ZZZZZZZZZ9.99")), 881, Gx_line+0, 977, Gx_line+17, 2+256, 0, 0, 0) ;
                                          Gx_OldLine = Gx_line ;
                                          Gx_line = (int)(Gx_line+17) ;
                                          AV30TotImpF = AV30TotImpF.subtract(A441FacImpTot) ;
                                          AV31TotDtoGenF = AV31TotDtoGenF.subtract(A439FacImpGen) ;
                                          AV32TotDtoPPF = AV32TotDtoPPF.subtract(A440FacImpPP) ;
                                          AV33TotBasImpF = AV33TotBasImpF.subtract(A429FacBasImp) ;
                                          AV34TotIVAImpF = AV34TotIVAImpF.subtract(AV40TotIVAImpC) ;
                                          AV35TotFacF = AV35TotFacF.subtract(A455FacTot) ;
                                       }
                                    }
                                 }
                              }
                              brk6M14 = true ;
                              pr_default.readNext(1);
                           }
                        }
                     }
                  }
                  if ( ! brk6M14 )
                  {
                     brk6M14 = true ;
                     pr_default.readNext(1);
                  }
               }
               h6M10( false, 25) ;
               getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Lit13, "")), 52, Gx_line+5, 177, Gx_line+23, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(localUtil.format( A436FacFch, "99/99/99"), 183, Gx_line+5, 242, Gx_line+22, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV30TotImpF, "ZZZZZZZZZ9.99")), 417, Gx_line+5, 513, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV31TotDtoGenF, "ZZZZZZZ9.99")), 519, Gx_line+5, 600, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TotDtoPPF, "ZZZZZZZ9.99")), 607, Gx_line+5, 688, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TotBasImpF, "ZZZZZZZZZ9.99")), 694, Gx_line+5, 790, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TotIVAImpF, "ZZZZZZZ9.99")), 795, Gx_line+5, 876, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TotFacF, "ZZZZZZZZZ9.99")), 881, Gx_line+5, 977, Gx_line+22, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(417, Gx_line+0, 512, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(881, Gx_line+0, 976, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(795, Gx_line+0, 875, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(694, Gx_line+0, 789, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(607, Gx_line+0, 687, Gx_line+0, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(519, Gx_line+0, 599, Gx_line+0, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+25) ;
               AV24TotImp = AV24TotImp.add(AV30TotImpF) ;
               AV25TotDtoGen = AV25TotDtoGen.add(AV31TotDtoGenF) ;
               AV26TotDtoPP = AV26TotDtoPP.add(AV32TotDtoPPF) ;
               AV27TotBasImp = AV27TotBasImp.add(AV33TotBasImpF) ;
               AV28TotIVAImp = AV28TotIVAImp.add(AV34TotIVAImpF) ;
               AV29TotFac = AV29TotFac.add(AV35TotFacF) ;
            }
            if ( ! brk6M14 )
            {
               brk6M14 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         h6M10( false, 23) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText("* * *", 41, Gx_line+4, 66, Gx_line+18, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Lit14, "")), 92, Gx_line+4, 188, Gx_line+22, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV24TotImp, "ZZZZZZZZZ9.99")), 417, Gx_line+4, 513, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV25TotDtoGen, "ZZZZZZZ9.99")), 519, Gx_line+4, 600, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV26TotDtoPP, "ZZZZZZZ9.99")), 607, Gx_line+4, 688, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV27TotBasImp, "ZZZZZZZZZ9.99")), 694, Gx_line+4, 790, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV28TotIVAImp, "ZZZZZZZ9.99")), 795, Gx_line+4, 876, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV29TotFac, "ZZZZZZZZZ9.99")), 881, Gx_line+4, 977, Gx_line+21, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawLine(417, Gx_line+0, 512, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(881, Gx_line+0, 976, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(795, Gx_line+0, 875, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(694, Gx_line+0, 789, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(607, Gx_line+0, 687, Gx_line+0, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(519, Gx_line+0, 599, Gx_line+0, 1, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+23) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6M10( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void h6M10( boolean bFoot ,
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
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 721, Gx_line+5, 726, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 859, Gx_line+5, 864, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59EmprNom, "")), 8, Gx_line+5, 228, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43Lit1, "")), 684, Gx_line+5, 721, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 735, Gx_line+5, 794, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44Lit2, "")), 816, Gx_line+5, 846, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 881, Gx_line+5, 940, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 859, Gx_line+39, 864, Gx_line+53, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42Lit0, "")), 8, Gx_line+39, 162, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61Lit17, "")), 169, Gx_line+39, 214, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60FacSerNum, "")), 220, Gx_line+39, 243, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45Lit3, "")), 808, Gx_line+39, 853, Gx_line+56, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 881, Gx_line+39, 926, Gx_line+56, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46Lit4, "")), 5, Gx_line+72, 115, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57Lit15, "")), 290, Gx_line+72, 342, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Lit16, "")), 360, Gx_line+72, 396, Gx_line+89, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Lit6, "")), 460, Gx_line+72, 512, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49Lit7, "")), 548, Gx_line+72, 600, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50Lit8, "")), 636, Gx_line+72, 688, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51Lit9, "")), 730, Gx_line+72, 789, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Lit10, "")), 831, Gx_line+72, 876, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53Lit11, "")), 910, Gx_line+72, 977, Gx_line+90, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+59, 987, Gx_line+59, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(5, Gx_line+97, 987, Gx_line+97, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72Pgmname, "")), 408, Gx_line+39, 628, Gx_line+56, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+101) ;
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      A396EmprCod = "" ;
      AV17PFecha = GXutil.nullDate() ;
      AV18UFecha = GXutil.nullDate() ;
      AV19PRIO = "" ;
      AV20ImpCod = "" ;
      AV42Lit0 = "" ;
      AV43Lit1 = "" ;
      AV44Lit2 = "" ;
      AV45Lit3 = "" ;
      AV46Lit4 = "" ;
      AV47Lit5 = "" ;
      AV48Lit6 = "" ;
      AV49Lit7 = "" ;
      AV50Lit8 = "" ;
      AV51Lit9 = "" ;
      AV52Lit10 = "" ;
      AV53Lit11 = "" ;
      AV54Lit12 = "" ;
      AV55Lit13 = "" ;
      AV56Lit14 = "" ;
      AV57Lit15 = "" ;
      AV58Lit16 = "" ;
      AV61Lit17 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P06M12_A396EmprCod = new String[] {""} ;
      P06M12_A407EmprNom = new String[] {""} ;
      P06M12_n407EmprNom = new boolean[] {false} ;
      P06M12_A963Ser1 = new String[] {""} ;
      P06M12_n963Ser1 = new boolean[] {false} ;
      P06M12_A2387Ser2 = new String[] {""} ;
      P06M12_n2387Ser2 = new boolean[] {false} ;
      P06M12_A2389Ser3 = new String[] {""} ;
      P06M12_n2389Ser3 = new boolean[] {false} ;
      P06M12_A4215Ser4 = new String[] {""} ;
      P06M12_n4215Ser4 = new boolean[] {false} ;
      P06M12_A4217Ser5 = new String[] {""} ;
      P06M12_n4217Ser5 = new boolean[] {false} ;
      P06M12_A4219Ser6 = new String[] {""} ;
      P06M12_n4219Ser6 = new boolean[] {false} ;
      P06M12_A4221Ser7 = new String[] {""} ;
      P06M12_n4221Ser7 = new boolean[] {false} ;
      A407EmprNom = "" ;
      A963Ser1 = "" ;
      A2387Ser2 = "" ;
      A2389Ser3 = "" ;
      A4215Ser4 = "" ;
      A4217Ser5 = "" ;
      A4219Ser6 = "" ;
      A4221Ser7 = "" ;
      AV59EmprNom = "" ;
      AV60FacSerNum = "" ;
      AV24TotImp = DecimalUtil.ZERO ;
      AV25TotDtoGen = DecimalUtil.ZERO ;
      AV26TotDtoPP = DecimalUtil.ZERO ;
      AV27TotBasImp = DecimalUtil.ZERO ;
      AV28TotIVAImp = DecimalUtil.ZERO ;
      AV29TotFac = DecimalUtil.ZERO ;
      A436FacFch = GXutil.nullDate() ;
      A2739FacSerNum = "" ;
      P06M14_A396EmprCod = new String[] {""} ;
      P06M14_A1153FacTipFac = new byte[1] ;
      P06M14_A279CliNom = new String[] {""} ;
      P06M14_A430FacCod = new int[1] ;
      P06M14_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P06M14_A2739FacSerNum = new String[] {""} ;
      P06M14_A252CliCod = new int[1] ;
      P06M14_A450FacPri = new String[] {""} ;
      P06M14_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M14_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M14_n8346FacRecI = new boolean[] {false} ;
      P06M14_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M14_A443FacIVAPor = new byte[1] ;
      P06M14_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M14_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M14_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M14_A434FacDtoPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M14_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M14_A14219FacEnergia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M14_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M14_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06M14_A7209Colombia = new byte[1] ;
      P06M14_n7209Colombia = new boolean[] {false} ;
      A279CliNom = "" ;
      A450FacPri = "" ;
      A11513FacRecIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A434FacDtoPP = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A14219FacEnergia = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A14218FacImpEng1 = DecimalUtil.ZERO ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
      A3920FacImpPP1 = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      AV30TotImpF = DecimalUtil.ZERO ;
      AV31TotDtoGenF = DecimalUtil.ZERO ;
      AV32TotDtoPPF = DecimalUtil.ZERO ;
      AV33TotBasImpF = DecimalUtil.ZERO ;
      AV34TotIVAImpF = DecimalUtil.ZERO ;
      AV35TotFacF = DecimalUtil.ZERO ;
      AV40TotIVAImpC = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV72Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.rfa0006__default(),
         new Object[] {
             new Object[] {
            P06M12_A396EmprCod, P06M12_A407EmprNom, P06M12_n407EmprNom, P06M12_A963Ser1, P06M12_n963Ser1, P06M12_A2387Ser2, P06M12_n2387Ser2, P06M12_A2389Ser3, P06M12_n2389Ser3, P06M12_A4215Ser4,
            P06M12_n4215Ser4, P06M12_A4217Ser5, P06M12_n4217Ser5, P06M12_A4219Ser6, P06M12_n4219Ser6, P06M12_A4221Ser7, P06M12_n4221Ser7
            }
            , new Object[] {
            P06M14_A396EmprCod, P06M14_A1153FacTipFac, P06M14_A279CliNom, P06M14_A430FacCod, P06M14_A436FacFch, P06M14_A2739FacSerNum, P06M14_A252CliCod, P06M14_A450FacPri, P06M14_A11513FacRecIca, P06M14_A8346FacRecI,
            P06M14_n8346FacRecI, P06M14_A7212FacRect, P06M14_A443FacIVAPor, P06M14_A14224FacCostFac, P06M14_A14223FacCostKgs, P06M14_A14222FacCostMts, P06M14_A434FacDtoPP, P06M14_A433FacDtoGen, P06M14_A14219FacEnergia, P06M14_A3918FacImpTot1,
            P06M14_A453FacRECPor, P06M14_A7209Colombia, P06M14_n7209Colombia
            }
         }
      );
      AV72Pgmname = "Facturacion.RFA0006" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV72Pgmname = "Facturacion.RFA0006" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV21SerieF ;
   private byte AV65noserie ;
   private byte AV64NotCre ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A1153FacTipFac ;
   private byte A443FacIVAPor ;
   private byte A7209Colombia ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV15PCliCod ;
   private int AV16UCliCod ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A252CliCod ;
   private int A430FacCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV24TotImp ;
   private java.math.BigDecimal AV25TotDtoGen ;
   private java.math.BigDecimal AV26TotDtoPP ;
   private java.math.BigDecimal AV27TotBasImp ;
   private java.math.BigDecimal AV28TotIVAImp ;
   private java.math.BigDecimal AV29TotFac ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A434FacDtoPP ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A14219FacEnergia ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A14218FacImpEng1 ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A3920FacImpPP1 ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV30TotImpF ;
   private java.math.BigDecimal AV31TotDtoGenF ;
   private java.math.BigDecimal AV32TotDtoPPF ;
   private java.math.BigDecimal AV33TotBasImpF ;
   private java.math.BigDecimal AV34TotIVAImpF ;
   private java.math.BigDecimal AV35TotFacF ;
   private java.math.BigDecimal AV40TotIVAImpC ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV19PRIO ;
   private String AV20ImpCod ;
   private String AV42Lit0 ;
   private String AV43Lit1 ;
   private String AV44Lit2 ;
   private String AV45Lit3 ;
   private String AV46Lit4 ;
   private String AV47Lit5 ;
   private String AV48Lit6 ;
   private String AV49Lit7 ;
   private String AV50Lit8 ;
   private String AV51Lit9 ;
   private String AV52Lit10 ;
   private String AV53Lit11 ;
   private String AV54Lit12 ;
   private String AV55Lit13 ;
   private String AV56Lit14 ;
   private String AV57Lit15 ;
   private String AV58Lit16 ;
   private String AV61Lit17 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A963Ser1 ;
   private String A2387Ser2 ;
   private String A2389Ser3 ;
   private String A4215Ser4 ;
   private String A4217Ser5 ;
   private String A4219Ser6 ;
   private String A4221Ser7 ;
   private String AV59EmprNom ;
   private String AV60FacSerNum ;
   private String A2739FacSerNum ;
   private String A279CliNom ;
   private String A450FacPri ;
   private String Gx_time ;
   private String AV72Pgmname ;
   private java.util.Date AV17PFecha ;
   private java.util.Date AV18UFecha ;
   private java.util.Date A436FacFch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n963Ser1 ;
   private boolean n2387Ser2 ;
   private boolean n2389Ser3 ;
   private boolean n4215Ser4 ;
   private boolean n4217Ser5 ;
   private boolean n4219Ser6 ;
   private boolean n4221Ser7 ;
   private boolean brk6M14 ;
   private boolean n8346FacRecI ;
   private boolean n7209Colombia ;
   private IDataStoreProvider pr_default ;
   private String[] P06M12_A396EmprCod ;
   private String[] P06M12_A407EmprNom ;
   private boolean[] P06M12_n407EmprNom ;
   private String[] P06M12_A963Ser1 ;
   private boolean[] P06M12_n963Ser1 ;
   private String[] P06M12_A2387Ser2 ;
   private boolean[] P06M12_n2387Ser2 ;
   private String[] P06M12_A2389Ser3 ;
   private boolean[] P06M12_n2389Ser3 ;
   private String[] P06M12_A4215Ser4 ;
   private boolean[] P06M12_n4215Ser4 ;
   private String[] P06M12_A4217Ser5 ;
   private boolean[] P06M12_n4217Ser5 ;
   private String[] P06M12_A4219Ser6 ;
   private boolean[] P06M12_n4219Ser6 ;
   private String[] P06M12_A4221Ser7 ;
   private boolean[] P06M12_n4221Ser7 ;
   private String[] P06M14_A396EmprCod ;
   private byte[] P06M14_A1153FacTipFac ;
   private String[] P06M14_A279CliNom ;
   private int[] P06M14_A430FacCod ;
   private java.util.Date[] P06M14_A436FacFch ;
   private String[] P06M14_A2739FacSerNum ;
   private int[] P06M14_A252CliCod ;
   private String[] P06M14_A450FacPri ;
   private java.math.BigDecimal[] P06M14_A11513FacRecIca ;
   private java.math.BigDecimal[] P06M14_A8346FacRecI ;
   private boolean[] P06M14_n8346FacRecI ;
   private java.math.BigDecimal[] P06M14_A7212FacRect ;
   private byte[] P06M14_A443FacIVAPor ;
   private java.math.BigDecimal[] P06M14_A14224FacCostFac ;
   private java.math.BigDecimal[] P06M14_A14223FacCostKgs ;
   private java.math.BigDecimal[] P06M14_A14222FacCostMts ;
   private java.math.BigDecimal[] P06M14_A434FacDtoPP ;
   private java.math.BigDecimal[] P06M14_A433FacDtoGen ;
   private java.math.BigDecimal[] P06M14_A14219FacEnergia ;
   private java.math.BigDecimal[] P06M14_A3918FacImpTot1 ;
   private java.math.BigDecimal[] P06M14_A453FacRECPor ;
   private byte[] P06M14_A7209Colombia ;
   private boolean[] P06M14_n7209Colombia ;
}

final  class rfa0006__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P06M14( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV17PFecha ,
                                          java.util.Date AV18UFecha ,
                                          int AV15PCliCod ,
                                          int AV16UCliCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          String A396EmprCod ,
                                          String A2739FacSerNum ,
                                          String AV60FacSerNum ,
                                          byte AV65noserie )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[7];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FacTipFac, T4.CliNom, T1.FacCod, T1.FacFch, T1.FacSerNum, T1.CliCod, T1.FacPri, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacIVAPor, T1.FacCostFac," ;
      scmdbuf += " T1.FacCostKgs, T1.FacCostMts, T1.FacDtoPP, T1.FacDtoGen, T1.FacEnergia, COALESCE( T3.FacImpTot1, 0) AS FacImpTot1, T1.FacRECPor, T2.Colombia FROM (((TXPCFAVEN T1" ;
      scmdbuf += " INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) +" ;
      scmdbuf += " ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and" ;
      scmdbuf += " Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts" ;
      scmdbuf += " * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan =" ;
      scmdbuf += " 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs" ;
      scmdbuf += " * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd" ;
      scmdbuf += " AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.FacCod = T1.FacCod) INNER JOIN TXPCLIENT" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FacSerNum = ? or ? = 1)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17PFecha)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18UFecha)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV15PCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV16UCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.FacFch, T1.CliCod, T1.FacCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_P06M14(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06M12", "SELECT EmprCod, EmprNom, Ser1, Ser2, Ser3, Ser4, Ser5, Ser6, Ser7 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06M14", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,3);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               return;
      }
   }

}

