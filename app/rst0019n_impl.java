package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rst0019n_impl extends GXWebReport
{
   public rst0019n_impl( com.genexus.internet.HttpContext context )
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
            AV15PProduc = httpContext.GetPar( "PProduc") ;
            AV16UProd2 = httpContext.GetPar( "UProd2") ;
            AV17PProv = (int)(GXutil.lval( httpContext.GetPar( "PProv"))) ;
            AV18UProv2 = (int)(GXutil.lval( httpContext.GetPar( "UProv2"))) ;
            AV19ValAct = httpContext.GetPar( "ValAct") ;
            AV20Flag = (byte)(GXutil.lval( httpContext.GetPar( "Flag"))) ;
            AV41recfec = localUtil.parseDateParm( httpContext.GetPar( "recfec")) ;
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
      M_bot = 3 ;
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
         P_lines = (int)(gxYPage-(lineHeight*3)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV24Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2390_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit0 = GXt_char1 ;
         GXt_char1 = AV25Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit1 = GXt_char1 ;
         GXt_char1 = AV26Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit2 = GXt_char1 ;
         GXt_char1 = AV27Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit3 = GXt_char1 ;
         GXt_char1 = AV28Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2390_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit4 = GXt_char1 ;
         GXt_char1 = AV29Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2341_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV29Lit5 = GXt_char1 ;
         GXt_char1 = AV30Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2141_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV30Lit6 = GXt_char1 ;
         GXt_char1 = AV31Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2142_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit7 = GXt_char1 ;
         GXt_char1 = AV32Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT419_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit8 = GXt_char1 ;
         GXt_char1 = AV33Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2341_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit9 = GXt_char1 ;
         GXt_char1 = AV34Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2141_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit10 = GXt_char1 ;
         GXt_char1 = AV35Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit11 = GXt_char1 ;
         GXt_char1 = AV36Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2040_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit12 = GXt_char1 ;
         GXt_char1 = AV37Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN386_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit13 = GXt_char1 ;
         GXt_char1 = AV38Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char2) ;
         rst0019n_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit14 = GXt_char1 ;
         /* Using cursor P07412 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07412_A407EmprNom[0] ;
            n407EmprNom = P07412_n407EmprNom[0] ;
            AV23NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXt_int3 = AV40Nalmcc ;
         GXv_int4[0] = GXt_int3 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int4) ;
         rst0019n_impl.this.GXt_int3 = GXv_int4[0] ;
         AV40Nalmcc = GXt_int3 ;
         /* Using cursor P07413 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV15PProduc, AV16UProd2, Integer.valueOf(AV17PProv), Integer.valueOf(AV18UProv2), AV41recfec});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A810RecFec = P07413_A810RecFec[0] ;
            A719PrdNum = P07413_A719PrdNum[0] ;
            A795PrvNum = P07413_A795PrvNum[0] ;
            A809RecExiTeo = P07413_A809RecExiTeo[0] ;
            A11195RecUbic = P07413_A11195RecUbic[0] ;
            A705PrdExiCC = P07413_A705PrdExiCC[0] ;
            A704PrdExiAlm = P07413_A704PrdExiAlm[0] ;
            A10881PrdLote = P07413_A10881PrdLote[0] ;
            A698PrdDetPar = P07413_A698PrdDetPar[0] ;
            A718PrdNom = P07413_A718PrdNom[0] ;
            A795PrvNum = P07413_A795PrvNum[0] ;
            A705PrdExiCC = P07413_A705PrdExiCC[0] ;
            A704PrdExiAlm = P07413_A704PrdExiAlm[0] ;
            A10881PrdLote = P07413_A10881PrdLote[0] ;
            A698PrdDetPar = P07413_A698PrdDetPar[0] ;
            A718PrdNom = P07413_A718PrdNom[0] ;
            h7410( false, 20) ;
            getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 7, Gx_line+0, 89, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 96, Gx_line+0, 314, Gx_line+18, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(333, Gx_line+0, 333, Gx_line+20, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(472, Gx_line+0, 472, Gx_line+20, 1, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(575, Gx_line+0, 575, Gx_line+20, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11195RecUbic, "")), 676, Gx_line+2, 781, Gx_line+19, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(664, Gx_line+0, 664, Gx_line+20, 1, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
            /* Noskip command */
            Gx_line = Gx_OldLine ;
            if ( GXutil.strcmp(AV19ValAct, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( AV20Flag == 1 )
               {
                  AV22TotExi = A704PrdExiAlm.add(A705PrdExiCC) ;
                  h7410( false, 17) ;
                  getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")), 384, Gx_line+0, 460, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999")), 486, Gx_line+0, 562, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV22TotExi, "ZZZZZZ9.9999")), 584, Gx_line+0, 660, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(472, Gx_line+0, 472, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(575, Gx_line+0, 575, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(664, Gx_line+0, 664, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10881PrdLote, "")), 676, Gx_line+0, 781, Gx_line+16, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  if ( AV40Nalmcc == 1 )
                  {
                     /* Using cursor P07414 */
                     pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
                     while ( (pr_default.getStatus(2) != 101) )
                     {
                        A8919CC_ExiTeoC = P07414_A8919CC_ExiTeoC[0] ;
                        n8919CC_ExiTeoC = P07414_n8919CC_ExiTeoC[0] ;
                        A8909CC_AlmDsc = P07414_A8909CC_AlmDsc[0] ;
                        n8909CC_AlmDsc = P07414_n8909CC_AlmDsc[0] ;
                        A8908CC_AlmCod = P07414_A8908CC_AlmCod[0] ;
                        A8909CC_AlmDsc = P07414_A8909CC_AlmDsc[0] ;
                        n8909CC_AlmDsc = P07414_n8909CC_AlmDsc[0] ;
                        h7410( false, 21) ;
                        getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8908CC_AlmCod), "Z9")), 72, Gx_line+0, 90, Gx_line+18, 2+256, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8909CC_AlmDsc, "")), 96, Gx_line+0, 430, Gx_line+18, 0+256, 0, 0, 0) ;
                        getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A8919CC_ExiTeoC, "ZZZZZZ9.9999")), 486, Gx_line+0, 562, Gx_line+17, 2+256, 0, 0, 0) ;
                        Gx_OldLine = Gx_line ;
                        Gx_line = (int)(Gx_line+21) ;
                        pr_default.readNext(2);
                     }
                     pr_default.close(2);
                  }
               }
               else
               {
                  h7410( false, 23) ;
                  getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")), 384, Gx_line+0, 460, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(472, Gx_line+0, 472, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(575, Gx_line+0, 575, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(7, Gx_line+20, 787, Gx_line+20, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(333, Gx_line+0, 333, Gx_line+21, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10881PrdLote, "")), 676, Gx_line+0, 781, Gx_line+16, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+23) ;
               }
            }
            else
            {
               h7410( false, 17) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
               /* Using cursor P07415 */
               pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A8909CC_AlmDsc = P07415_A8909CC_AlmDsc[0] ;
                  n8909CC_AlmDsc = P07415_n8909CC_AlmDsc[0] ;
                  A8908CC_AlmCod = P07415_A8908CC_AlmCod[0] ;
                  A8909CC_AlmDsc = P07415_A8909CC_AlmDsc[0] ;
                  n8909CC_AlmDsc = P07415_n8909CC_AlmDsc[0] ;
                  h7410( false, 19) ;
                  getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8908CC_AlmCod), "Z9")), 72, Gx_line+0, 90, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A8909CC_AlmDsc, "")), 96, Gx_line+0, 430, Gx_line+18, 0+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+19) ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            if ( ( GXutil.strcmp(AV19ValAct, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A698PrdDetPar, httpContext.getMessage( "S", "")) == 0 ) )
            {
               AV39NCont = (byte)(0) ;
               /* Using cursor P07416 */
               pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum});
               while ( (pr_default.getStatus(4) != 101) )
               {
                  A322DetUni = P07416_A322DetUni[0] ;
                  n322DetUni = P07416_n322DetUni[0] ;
                  A647NumCon = P07416_A647NumCon[0] ;
                  if ( AV39NCont == 0 )
                  {
                     h7410( false, 22) ;
                     getPrinter().GxAttris("Times New Roman", 10, true, false, true, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit12, "")), 180, Gx_line+3, 325, Gx_line+20, 0+256, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37Lit13, "")), 338, Gx_line+3, 388, Gx_line+19, 2, 0, 0, 0) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38Lit14, "")), 393, Gx_line+3, 460, Gx_line+19, 2, 0, 0, 0) ;
                     getPrinter().GxDrawLine(333, Gx_line+0, 333, Gx_line+22, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(472, Gx_line+0, 472, Gx_line+22, 1, 0, 0, 0, 0) ;
                     getPrinter().GxDrawLine(575, Gx_line+0, 575, Gx_line+22, 1, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+22) ;
                  }
                  h7410( false, 17) ;
                  getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A647NumCon), "ZZZZZZZ9")), 338, Gx_line+1, 389, Gx_line+18, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A322DetUni, "ZZZZZ9.99")), 403, Gx_line+0, 460, Gx_line+17, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawLine(333, Gx_line+0, 333, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(472, Gx_line+0, 472, Gx_line+17, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(575, Gx_line+0, 575, Gx_line+17, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+17) ;
                  AV39NCont = (byte)(1) ;
                  pr_default.readNext(4);
               }
               pr_default.close(4);
               if ( AV39NCont == 1 )
               {
                  h7410( false, 8) ;
                  getPrinter().GxDrawLine(333, Gx_line+0, 333, Gx_line+8, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(575, Gx_line+0, 575, Gx_line+8, 1, 0, 0, 0, 0) ;
                  getPrinter().GxDrawLine(472, Gx_line+0, 472, Gx_line+8, 1, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+8) ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7410( true, 0) ;
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

   public void h7410( boolean bFoot ,
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
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23NomEmp, "")), 5, Gx_line+10, 194, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit1, "")), 466, Gx_line+10, 535, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 540, Gx_line+10, 587, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit2, "")), 608, Gx_line+10, 663, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 667, Gx_line+10, 776, Gx_line+27, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit0, "")), 7, Gx_line+38, 133, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit3, "")), 608, Gx_line+38, 675, Gx_line+54, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 676, Gx_line+38, 715, Gx_line+55, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48Pgmname, "")), 466, Gx_line+38, 623, Gx_line+55, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+58, 780, Gx_line+58, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+3, 780, Gx_line+3, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Times New Roman", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV41recfec, "99/99/99"), 243, Gx_line+38, 290, Gx_line+55, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+70) ;
            if ( AV20Flag == 1 )
            {
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29Lit5, "")), 7, Gx_line+0, 102, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30Lit6, "")), 393, Gx_line+0, 460, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit7, "")), 499, Gx_line+0, 549, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit8, "")), 618, Gx_line+0, 660, Gx_line+17, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(0, Gx_line+19, 780, Gx_line+19, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ubicacion", ""), 700, Gx_line+0, 756, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+23) ;
            }
            else
            {
               getPrinter().GxAttris("Times New Roman", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit9, "")), 7, Gx_line+0, 102, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit10, "")), 379, Gx_line+0, 488, Gx_line+17, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(6, Gx_line+18, 786, Gx_line+18, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(333, Gx_line+18, 333, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(472, Gx_line+19, 472, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(575, Gx_line+19, 575, Gx_line+24, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(664, Gx_line+19, 664, Gx_line+24, 1, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+24) ;
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

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Times New Roman", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Times New Roman", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV15PProduc = "" ;
      AV16UProd2 = "" ;
      AV19ValAct = "" ;
      AV41recfec = GXutil.nullDate() ;
      AV24Lit0 = "" ;
      AV25Lit1 = "" ;
      AV26Lit2 = "" ;
      AV27Lit3 = "" ;
      AV28Lit4 = "" ;
      AV29Lit5 = "" ;
      AV30Lit6 = "" ;
      AV31Lit7 = "" ;
      AV32Lit8 = "" ;
      AV33Lit9 = "" ;
      AV34Lit10 = "" ;
      AV35Lit11 = "" ;
      AV36Lit12 = "" ;
      AV37Lit13 = "" ;
      AV38Lit14 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P07412_A396EmprCod = new String[] {""} ;
      P07412_A407EmprNom = new String[] {""} ;
      P07412_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV23NomEmp = "" ;
      GXv_int4 = new byte[1] ;
      P07413_A396EmprCod = new String[] {""} ;
      P07413_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07413_A719PrdNum = new String[] {""} ;
      P07413_A795PrvNum = new int[1] ;
      P07413_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07413_A11195RecUbic = new String[] {""} ;
      P07413_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07413_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07413_A10881PrdLote = new String[] {""} ;
      P07413_A698PrdDetPar = new String[] {""} ;
      P07413_A718PrdNom = new String[] {""} ;
      A810RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A11195RecUbic = "" ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A10881PrdLote = "" ;
      A698PrdDetPar = "" ;
      A718PrdNom = "" ;
      AV22TotExi = DecimalUtil.ZERO ;
      P07414_A396EmprCod = new String[] {""} ;
      P07414_A719PrdNum = new String[] {""} ;
      P07414_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07414_A8919CC_ExiTeoC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07414_n8919CC_ExiTeoC = new boolean[] {false} ;
      P07414_A8909CC_AlmDsc = new String[] {""} ;
      P07414_n8909CC_AlmDsc = new boolean[] {false} ;
      P07414_A8908CC_AlmCod = new byte[1] ;
      A8919CC_ExiTeoC = DecimalUtil.ZERO ;
      A8909CC_AlmDsc = "" ;
      P07415_A396EmprCod = new String[] {""} ;
      P07415_A719PrdNum = new String[] {""} ;
      P07415_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07415_A8909CC_AlmDsc = new String[] {""} ;
      P07415_n8909CC_AlmDsc = new boolean[] {false} ;
      P07415_A8908CC_AlmCod = new byte[1] ;
      P07416_A396EmprCod = new String[] {""} ;
      P07416_A719PrdNum = new String[] {""} ;
      P07416_A322DetUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07416_n322DetUni = new boolean[] {false} ;
      P07416_A647NumCon = new int[1] ;
      A322DetUni = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV48Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rst0019n__default(),
         new Object[] {
             new Object[] {
            P07412_A396EmprCod, P07412_A407EmprNom, P07412_n407EmprNom
            }
            , new Object[] {
            P07413_A396EmprCod, P07413_A810RecFec, P07413_A719PrdNum, P07413_A795PrvNum, P07413_A809RecExiTeo, P07413_A11195RecUbic, P07413_A705PrdExiCC, P07413_A704PrdExiAlm, P07413_A10881PrdLote, P07413_A698PrdDetPar,
            P07413_A718PrdNom
            }
            , new Object[] {
            P07414_A396EmprCod, P07414_A719PrdNum, P07414_A810RecFec, P07414_A8919CC_ExiTeoC, P07414_n8919CC_ExiTeoC, P07414_A8909CC_AlmDsc, P07414_n8909CC_AlmDsc, P07414_A8908CC_AlmCod
            }
            , new Object[] {
            P07415_A396EmprCod, P07415_A719PrdNum, P07415_A810RecFec, P07415_A8909CC_AlmDsc, P07415_n8909CC_AlmDsc, P07415_A8908CC_AlmCod
            }
            , new Object[] {
            P07416_A396EmprCod, P07416_A719PrdNum, P07416_A322DetUni, P07416_n322DetUni, P07416_A647NumCon
            }
         }
      );
      AV48Pgmname = "RST0019N" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV48Pgmname = "RST0019N" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV20Flag ;
   private byte AV40Nalmcc ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A8908CC_AlmCod ;
   private byte AV39NCont ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int AV17PProv ;
   private int AV18UProv2 ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int Gx_OldLine ;
   private int A647NumCon ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal AV22TotExi ;
   private java.math.BigDecimal A8919CC_ExiTeoC ;
   private java.math.BigDecimal A322DetUni ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15PProduc ;
   private String AV16UProd2 ;
   private String AV19ValAct ;
   private String AV24Lit0 ;
   private String AV25Lit1 ;
   private String AV26Lit2 ;
   private String AV27Lit3 ;
   private String AV28Lit4 ;
   private String AV29Lit5 ;
   private String AV30Lit6 ;
   private String AV31Lit7 ;
   private String AV32Lit8 ;
   private String AV33Lit9 ;
   private String AV34Lit10 ;
   private String AV35Lit11 ;
   private String AV36Lit12 ;
   private String AV37Lit13 ;
   private String AV38Lit14 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV23NomEmp ;
   private String A719PrdNum ;
   private String A11195RecUbic ;
   private String A10881PrdLote ;
   private String A698PrdDetPar ;
   private String A718PrdNom ;
   private String A8909CC_AlmDsc ;
   private String Gx_time ;
   private String AV48Pgmname ;
   private java.util.Date AV41recfec ;
   private java.util.Date A810RecFec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n8919CC_ExiTeoC ;
   private boolean n8909CC_AlmDsc ;
   private boolean n322DetUni ;
   private IDataStoreProvider pr_default ;
   private String[] P07412_A396EmprCod ;
   private String[] P07412_A407EmprNom ;
   private boolean[] P07412_n407EmprNom ;
   private String[] P07413_A396EmprCod ;
   private java.util.Date[] P07413_A810RecFec ;
   private String[] P07413_A719PrdNum ;
   private int[] P07413_A795PrvNum ;
   private java.math.BigDecimal[] P07413_A809RecExiTeo ;
   private String[] P07413_A11195RecUbic ;
   private java.math.BigDecimal[] P07413_A705PrdExiCC ;
   private java.math.BigDecimal[] P07413_A704PrdExiAlm ;
   private String[] P07413_A10881PrdLote ;
   private String[] P07413_A698PrdDetPar ;
   private String[] P07413_A718PrdNom ;
   private String[] P07414_A396EmprCod ;
   private String[] P07414_A719PrdNum ;
   private java.util.Date[] P07414_A810RecFec ;
   private java.math.BigDecimal[] P07414_A8919CC_ExiTeoC ;
   private boolean[] P07414_n8919CC_ExiTeoC ;
   private String[] P07414_A8909CC_AlmDsc ;
   private boolean[] P07414_n8909CC_AlmDsc ;
   private byte[] P07414_A8908CC_AlmCod ;
   private String[] P07415_A396EmprCod ;
   private String[] P07415_A719PrdNum ;
   private java.util.Date[] P07415_A810RecFec ;
   private String[] P07415_A8909CC_AlmDsc ;
   private boolean[] P07415_n8909CC_AlmDsc ;
   private byte[] P07415_A8908CC_AlmCod ;
   private String[] P07416_A396EmprCod ;
   private String[] P07416_A719PrdNum ;
   private java.math.BigDecimal[] P07416_A322DetUni ;
   private boolean[] P07416_n322DetUni ;
   private int[] P07416_A647NumCon ;
}

final  class rst0019n__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07412", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07413", "SELECT T1.EmprCod, T1.RecFec, T1.PrdNum, T2.PrvNum, T1.RecExiTeo, T1.RecUbic, T2.PrdExiCC, T2.PrdExiAlm, T2.PrdLote, T2.PrdDetPar, T2.PrdNom FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.PrdNum >= ? and T1.PrdNum <= ?) AND (T2.PrvNum >= ? and T2.PrvNum <= ?) AND (T1.RecFec = ?) ORDER BY T1.EmprCod, T2.PrdNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07414", "SELECT T1.EmprCod, T1.PrdNum, T1.RecFec, T1.CC_ExiTeoC, T2.CC_AlmDsc, T1.CC_AlmCod FROM (TXPRECALM T1 INNER JOIN TXPALMCCS T2 ON T2.EmprCod = T1.EmprCod AND T2.CC_AlmCod = T1.CC_AlmCod) WHERE (T1.EmprCod = ? and T1.PrdNum = ?) AND (T1.RecFec = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.CC_AlmCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07415", "SELECT T1.EmprCod, T1.PrdNum, T1.RecFec, T2.CC_AlmDsc, T1.CC_AlmCod FROM (TXPRECALM T1 INNER JOIN TXPALMCCS T2 ON T2.EmprCod = T1.EmprCod AND T2.CC_AlmCod = T1.CC_AlmCod) WHERE (T1.EmprCod = ? and T1.PrdNum = ?) AND (T1.RecFec = ?) ORDER BY T1.EmprCod, T1.PrdNum, T1.CC_AlmCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07416", "SELECT EmprCod, PrdNum, DetUni, NumCon FROM TXPDETCON WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

