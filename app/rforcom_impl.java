package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rforcom_impl extends GXWebReport
{
   public rforcom_impl( com.genexus.internet.HttpContext context )
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
            AV15ImpCod = httpContext.GetPar( "ImpCod") ;
            AV18Pprod = httpContext.GetPar( "Pprod") ;
            AV19Uprod = httpContext.GetPar( "Uprod") ;
            AV20Pprov = (int)(GXutil.lval( httpContext.GetPar( "Pprov"))) ;
            AV21Uprov = (int)(GXutil.lval( httpContext.GetPar( "Uprov"))) ;
            AV22Pfecha = localUtil.parseDateParm( httpContext.GetPar( "Pfecha")) ;
            AV23Ufecha = localUtil.parseDateParm( httpContext.GetPar( "Ufecha")) ;
            AV41PGuia = httpContext.GetPar( "PGuia") ;
            AV42UGuia = httpContext.GetPar( "UGuia") ;
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
      M_bot = 6 ;
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
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 9, 16834, 11909, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV40ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FORCOM", ""), GXv_char1) ;
         rforcom_impl.this.AV40ContDsc = GXv_char1[0] ;
         GXt_char2 = AV25Lit0 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN811_", ""), (byte)(99), GXv_char1) ;
         rforcom_impl.this.GXt_char2 = GXv_char1[0] ;
         AV25Lit0 = GXt_char2 ;
         GXt_char2 = AV26Lit1 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char1) ;
         rforcom_impl.this.GXt_char2 = GXv_char1[0] ;
         AV26Lit1 = GXt_char2 ;
         GXt_char2 = AV27Lit2 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char1) ;
         rforcom_impl.this.GXt_char2 = GXv_char1[0] ;
         AV27Lit2 = GXt_char2 ;
         GXt_char2 = AV28Lit3 ;
         GXv_char1[0] = GXt_char2 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char1) ;
         rforcom_impl.this.GXt_char2 = GXv_char1[0] ;
         AV28Lit3 = GXt_char2 ;
         /* Using cursor P06CF2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06CF2_A407EmprNom[0] ;
            n407EmprNom = P06CF2_n407EmprNom[0] ;
            AV24NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV38TotValG = DecimalUtil.doubleToDec(0) ;
         AV39TotCantG = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P06CF3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV20Pprov), AV18Pprod, AV19Uprod, Integer.valueOf(AV21Uprov)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk6CF4 = false ;
            A3915EmpNumDec = P06CF3_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06CF3_n3915EmpNumDec[0] ;
            A794PrvNom = P06CF3_A794PrvNom[0] ;
            n794PrvNom = P06CF3_n794PrvNom[0] ;
            A718PrdNom = P06CF3_A718PrdNom[0] ;
            A719PrdNum = P06CF3_A719PrdNum[0] ;
            A795PrvNum = P06CF3_A795PrvNum[0] ;
            A727PrdRec = P06CF3_A727PrdRec[0] ;
            A3915EmpNumDec = P06CF3_A3915EmpNumDec[0] ;
            n3915EmpNumDec = P06CF3_n3915EmpNumDec[0] ;
            A794PrvNom = P06CF3_A794PrvNom[0] ;
            n794PrvNom = P06CF3_n794PrvNom[0] ;
            AV37FlagPv = (byte)(0) ;
            AV33TotValP = DecimalUtil.doubleToDec(0) ;
            AV32TotCantP = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P06CF3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P06CF3_A795PrvNum[0] == A795PrvNum ) )
            {
               brk6CF4 = false ;
               A3915EmpNumDec = P06CF3_A3915EmpNumDec[0] ;
               n3915EmpNumDec = P06CF3_n3915EmpNumDec[0] ;
               A794PrvNom = P06CF3_A794PrvNom[0] ;
               n794PrvNom = P06CF3_n794PrvNom[0] ;
               A718PrdNom = P06CF3_A718PrdNom[0] ;
               A719PrdNum = P06CF3_A719PrdNum[0] ;
               A727PrdRec = P06CF3_A727PrdRec[0] ;
               A3915EmpNumDec = P06CF3_A3915EmpNumDec[0] ;
               n3915EmpNumDec = P06CF3_n3915EmpNumDec[0] ;
               A794PrvNom = P06CF3_A794PrvNom[0] ;
               n794PrvNom = P06CF3_n794PrvNom[0] ;
               while ( (pr_default.getStatus(1) != 101) && ( P06CF3_A795PrvNum[0] == A795PrvNum ) && ( GXutil.strcmp(P06CF3_A719PrdNum[0], A719PrdNum) == 0 ) )
               {
                  brk6CF4 = false ;
                  A3915EmpNumDec = P06CF3_A3915EmpNumDec[0] ;
                  n3915EmpNumDec = P06CF3_n3915EmpNumDec[0] ;
                  A794PrvNom = P06CF3_A794PrvNom[0] ;
                  n794PrvNom = P06CF3_n794PrvNom[0] ;
                  A718PrdNom = P06CF3_A718PrdNom[0] ;
                  A727PrdRec = P06CF3_A727PrdRec[0] ;
                  A3915EmpNumDec = P06CF3_A3915EmpNumDec[0] ;
                  n3915EmpNumDec = P06CF3_n3915EmpNumDec[0] ;
                  A794PrvNom = P06CF3_A794PrvNom[0] ;
                  n794PrvNom = P06CF3_n794PrvNom[0] ;
                  if ( GXutil.strcmp(P06CF3_A396EmprCod[0], A396EmprCod) == 0 )
                  {
                     AV35TotProd = DecimalUtil.doubleToDec(0) ;
                     AV36TotValL = DecimalUtil.doubleToDec(0) ;
                     /* Using cursor P06CF4 */
                     pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, AV22Pfecha, AV23Ufecha, AV41PGuia, AV42UGuia});
                     while ( (pr_default.getStatus(2) != 101) )
                     {
                        A11Albaran = P06CF4_A11Albaran[0] ;
                        A415EntFecEnt = P06CF4_A415EntFecEnt[0] ;
                        A597LinEnt = P06CF4_A597LinEnt[0] ;
                        A417EntPre = P06CF4_A417EntPre[0] ;
                        A418EntUniEnt = P06CF4_A418EntUniEnt[0] ;
                        A5686EntLotN = P06CF4_A5686EntLotN[0] ;
                        A658PedCod = P06CF4_A658PedCod[0] ;
                        n658PedCod = P06CF4_n658PedCod[0] ;
                        if ( GXutil.strcmp(GXutil.substring( A11Albaran, 1, 3), httpContext.getMessage( "INV", "")) != 0 )
                        {
                           if ( GXutil.strcmp(GXutil.substring( A11Albaran, 1, 3), httpContext.getMessage( "REC", "")) != 0 )
                           {
                              if ( A3915EmpNumDec == 0 )
                              {
                                 AV34Valor1 = GXutil.roundDecimal( A418EntUniEnt.multiply(A417EntPre), 0) ;
                              }
                              else
                              {
                                 if ( A3915EmpNumDec == 2 )
                                 {
                                    AV34Valor1 = GXutil.roundDecimal( A418EntUniEnt.multiply(A417EntPre), 2) ;
                                 }
                              }
                              if ( AV37FlagPv == 0 )
                              {
                                 h6CF0( false, 33) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(httpContext.getMessage( "Fornecedor", ""), 22, Gx_line+17, 96, Gx_line+33, 0+256, 0, 0, 0) ;
                                 getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                                 getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 102, Gx_line+17, 147, Gx_line+34, 2+256, 0, 0, 0) ;
                                 getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 153, Gx_line+17, 373, Gx_line+34, 0+256, 0, 0, 0) ;
                                 Gx_OldLine = Gx_line ;
                                 Gx_line = (int)(Gx_line+33) ;
                                 AV37FlagPv = (byte)(1) ;
                              }
                              AV43EntPre = A417EntPre ;
                              AV44EntLotn = GXutil.trim( A5686EntLotN) ;
                              h6CF0( false, 17) ;
                              getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(localUtil.format( A415EntFecEnt, "99/99/99"), 7, Gx_line+0, 66, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 70, Gx_line+0, 115, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 117, Gx_line+0, 308, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A418EntUniEnt, "ZZZZZ9.99")), 448, Gx_line+0, 515, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV43EntPre, "ZZ9.999")), 646, Gx_line+0, 698, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34Valor1, "ZZ,ZZZ,ZZ9.99")), 700, Gx_line+0, 796, Gx_line+17, 2+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), 310, Gx_line+0, 369, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11Albaran, "")), 372, Gx_line+0, 446, Gx_line+17, 0+256, 0, 0, 0) ;
                              getPrinter().GxAttris("Calibri", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                              getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44EntLotn, "")), 518, Gx_line+1, 644, Gx_line+16, 0+256, 0, 0, 0) ;
                              Gx_OldLine = Gx_line ;
                              Gx_line = (int)(Gx_line+17) ;
                              AV35TotProd = AV35TotProd.add(A418EntUniEnt) ;
                              AV36TotValL = AV36TotValL.add(AV34Valor1) ;
                              AV32TotCantP = AV32TotCantP.add(A418EntUniEnt) ;
                              AV33TotValP = AV33TotValP.add(AV34Valor1) ;
                           }
                        }
                        pr_default.readNext(2);
                     }
                     pr_default.close(2);
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TotProd)==0) )
                     {
                        h6CF0( false, 33) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "Sub Totais          , Quantidade", ""), 168, Gx_line+0, 402, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(httpContext.getMessage( "| Valor", ""), 554, Gx_line+0, 606, Gx_line+16, 0+256, 0, 0, 0) ;
                        getPrinter().GxDrawText("============================================================================================================", 7, Gx_line+17, 796, Gx_line+33, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TotProd, "ZZZZZ9.99")), 448, Gx_line+0, 515, Gx_line+17, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TotValL, "ZZZ,ZZZ,ZZ9.99")), 693, Gx_line+0, 796, Gx_line+17, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+33) ;
                     }
                     AV38TotValG = AV38TotValG.add(AV36TotValL) ;
                     AV39TotCantG = AV39TotCantG.add(AV35TotProd) ;
                  }
                  brk6CF4 = true ;
                  pr_default.readNext(1);
               }
               if ( ! brk6CF4 )
               {
                  brk6CF4 = true ;
                  pr_default.readNext(1);
               }
            }
            if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TotCantP)==0) )
            {
               h6CF0( false, 33) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Total do Fornecedor, Quantidade", ""), 175, Gx_line+17, 402, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "| Valor", ""), 554, Gx_line+17, 606, Gx_line+33, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV32TotCantP, "ZZZZZZ9.99")), 441, Gx_line+17, 515, Gx_line+34, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV33TotValP, "ZZZ,ZZZ,ZZ9.99")), 693, Gx_line+17, 796, Gx_line+34, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+33) ;
               /* Eject command */
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(P_lines+1) ;
            }
            if ( ! brk6CF4 )
            {
               brk6CF4 = true ;
               pr_default.readNext(1);
            }
         }
         pr_default.close(1);
         h6CF0( false, 33) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Total Geral, Quantidade", ""), 233, Gx_line+17, 402, Gx_line+33, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV39TotCantG, "ZZZZZZ9.99")), 441, Gx_line+17, 515, Gx_line+34, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "| Valor", ""), 554, Gx_line+17, 606, Gx_line+33, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38TotValG, "ZZZZZZZZZ9.99")), 700, Gx_line+17, 796, Gx_line+34, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+33) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6CF0( true, 0) ;
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

   public void h6CF0( boolean bFoot ,
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
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("=====================================================================================================", 7, Gx_line+16, 744, Gx_line+32, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Dia", ""), 525, Gx_line+32, 548, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 620, Gx_line+32, 650, Gx_line+48, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Listagem de Compras de Produtos                               ", ""), 7, Gx_line+66, 460, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24NomEmp, "")), 7, Gx_line+32, 227, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 554, Gx_line+32, 613, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 656, Gx_line+32, 715, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("============================================================================================================", 7, Gx_line+82, 796, Gx_line+98, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 671, Gx_line+66, 716, Gx_line+83, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Periodo", ""), 7, Gx_line+99, 59, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("-", 131, Gx_line+99, 139, Gx_line+115, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV22Pfecha, "99/99/99"), 66, Gx_line+99, 125, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV23Ufecha, "99/99/99"), 146, Gx_line+99, 205, Gx_line+116, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 7, Gx_line+117, 37, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Produto", ""), 70, Gx_line+117, 122, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "N Compra", ""), 310, Gx_line+117, 369, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Talao/G.R.", ""), 372, Gx_line+117, 446, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Quant.", ""), 470, Gx_line+117, 515, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Preço", ""), 660, Gx_line+117, 697, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Valor", ""), 758, Gx_line+117, 795, Gx_line+133, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Pagina", ""), 605, Gx_line+66, 650, Gx_line+82, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("-------------------------------------------------------------------------------------------------------------", 0, Gx_line+133, 796, Gx_line+149, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40ContDsc, "")), 640, Gx_line+5, 745, Gx_line+19, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Lote", ""), 518, Gx_line+117, 548, Gx_line+133, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+150) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Calibri", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV15ImpCod = "" ;
      AV18Pprod = "" ;
      AV19Uprod = "" ;
      AV22Pfecha = GXutil.nullDate() ;
      AV23Ufecha = GXutil.nullDate() ;
      AV41PGuia = "" ;
      AV42UGuia = "" ;
      AV40ContDsc = "" ;
      AV25Lit0 = "" ;
      AV26Lit1 = "" ;
      AV27Lit2 = "" ;
      AV28Lit3 = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P06CF2_A396EmprCod = new String[] {""} ;
      P06CF2_A407EmprNom = new String[] {""} ;
      P06CF2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV24NomEmp = "" ;
      AV38TotValG = DecimalUtil.ZERO ;
      AV39TotCantG = DecimalUtil.ZERO ;
      P06CF3_A396EmprCod = new String[] {""} ;
      P06CF3_A3915EmpNumDec = new byte[1] ;
      P06CF3_n3915EmpNumDec = new boolean[] {false} ;
      P06CF3_A794PrvNom = new String[] {""} ;
      P06CF3_n794PrvNom = new boolean[] {false} ;
      P06CF3_A718PrdNom = new String[] {""} ;
      P06CF3_A719PrdNum = new String[] {""} ;
      P06CF3_A795PrvNum = new int[1] ;
      P06CF3_A727PrdRec = new String[] {""} ;
      A794PrvNom = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A727PrdRec = "" ;
      AV33TotValP = DecimalUtil.ZERO ;
      AV32TotCantP = DecimalUtil.ZERO ;
      AV35TotProd = DecimalUtil.ZERO ;
      AV36TotValL = DecimalUtil.ZERO ;
      P06CF4_A396EmprCod = new String[] {""} ;
      P06CF4_A719PrdNum = new String[] {""} ;
      P06CF4_A11Albaran = new String[] {""} ;
      P06CF4_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P06CF4_A597LinEnt = new short[1] ;
      P06CF4_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06CF4_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P06CF4_A5686EntLotN = new String[] {""} ;
      P06CF4_A658PedCod = new int[1] ;
      P06CF4_n658PedCod = new boolean[] {false} ;
      A11Albaran = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A417EntPre = DecimalUtil.ZERO ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      AV34Valor1 = DecimalUtil.ZERO ;
      AV43EntPre = DecimalUtil.ZERO ;
      AV44EntLotn = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rforcom__default(),
         new Object[] {
             new Object[] {
            P06CF2_A396EmprCod, P06CF2_A407EmprNom, P06CF2_n407EmprNom
            }
            , new Object[] {
            P06CF3_A396EmprCod, P06CF3_A3915EmpNumDec, P06CF3_n3915EmpNumDec, P06CF3_A794PrvNom, P06CF3_n794PrvNom, P06CF3_A718PrdNom, P06CF3_A719PrdNum, P06CF3_A795PrvNum, P06CF3_A727PrdRec
            }
            , new Object[] {
            P06CF4_A396EmprCod, P06CF4_A719PrdNum, P06CF4_A11Albaran, P06CF4_A415EntFecEnt, P06CF4_A597LinEnt, P06CF4_A417EntPre, P06CF4_A418EntUniEnt, P06CF4_A5686EntLotN, P06CF4_A658PedCod, P06CF4_n658PedCod
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A3915EmpNumDec ;
   private byte AV37FlagPv ;
   private short gxcookieaux ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int AV20Pprov ;
   private int AV21Uprov ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int A658PedCod ;
   private int Gx_OldLine ;
   private java.math.BigDecimal AV38TotValG ;
   private java.math.BigDecimal AV39TotCantG ;
   private java.math.BigDecimal AV33TotValP ;
   private java.math.BigDecimal AV32TotCantP ;
   private java.math.BigDecimal AV35TotProd ;
   private java.math.BigDecimal AV36TotValL ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal AV34Valor1 ;
   private java.math.BigDecimal AV43EntPre ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV18Pprod ;
   private String AV19Uprod ;
   private String AV41PGuia ;
   private String AV42UGuia ;
   private String AV40ContDsc ;
   private String AV25Lit0 ;
   private String AV26Lit1 ;
   private String AV27Lit2 ;
   private String AV28Lit3 ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV24NomEmp ;
   private String A794PrvNom ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A727PrdRec ;
   private String A11Albaran ;
   private String A5686EntLotN ;
   private String AV44EntLotn ;
   private String Gx_time ;
   private java.util.Date AV22Pfecha ;
   private java.util.Date AV23Ufecha ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean brk6CF4 ;
   private boolean n3915EmpNumDec ;
   private boolean n794PrvNom ;
   private boolean n658PedCod ;
   private IDataStoreProvider pr_default ;
   private String[] P06CF2_A396EmprCod ;
   private String[] P06CF2_A407EmprNom ;
   private boolean[] P06CF2_n407EmprNom ;
   private String[] P06CF3_A396EmprCod ;
   private byte[] P06CF3_A3915EmpNumDec ;
   private boolean[] P06CF3_n3915EmpNumDec ;
   private String[] P06CF3_A794PrvNom ;
   private boolean[] P06CF3_n794PrvNom ;
   private String[] P06CF3_A718PrdNom ;
   private String[] P06CF3_A719PrdNum ;
   private int[] P06CF3_A795PrvNum ;
   private String[] P06CF3_A727PrdRec ;
   private String[] P06CF4_A396EmprCod ;
   private String[] P06CF4_A719PrdNum ;
   private String[] P06CF4_A11Albaran ;
   private java.util.Date[] P06CF4_A415EntFecEnt ;
   private short[] P06CF4_A597LinEnt ;
   private java.math.BigDecimal[] P06CF4_A417EntPre ;
   private java.math.BigDecimal[] P06CF4_A418EntUniEnt ;
   private String[] P06CF4_A5686EntLotN ;
   private int[] P06CF4_A658PedCod ;
   private boolean[] P06CF4_n658PedCod ;
}

final  class rforcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06CF2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06CF3", "SELECT T1.EmprCod, T2.EmpNumDec, T3.PrvNom, T1.PrdNom, T1.PrdNum, T1.PrvNum, T1.PrdRec FROM ((TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum = T1.PrvNum) WHERE (T1.EmprCod = ? and T1.PrvNum >= ?) AND (T1.PrdNum >= ? and T1.PrdNum <= ?) AND (T1.PrvNum <= ?) ORDER BY T1.PrvNum, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06CF4", "SELECT EmprCod, PrdNum, Albaran, EntFecEnt, LinEnt, EntPre, EntUniEnt, EntLotN, PedCod FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND (EntFecEnt >= ? and EntFecEnt <= ?) AND (Albaran >= ? and Albaran <= ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setString(6, (String)parms[5], 10);
               return;
      }
   }

}

