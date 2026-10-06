package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rdevaler_impl extends GXWebReport
{
   public rdevaler_impl( com.genexus.internet.HttpContext context )
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
            AV10NumALb = httpContext.GetPar( "NumALb") ;
            AV24TextoCopia = httpContext.GetPar( "TextoCopia") ;
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
      M_bot = 12 ;
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
         P_lines = (int)(gxYPage-(lineHeight*12)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXv_char1[0] = AV12ContDsc ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVALM", ""), GXv_char1) ;
         rdevaler_impl.this.AV12ContDsc = GXv_char1[0] ;
         GXv_char1[0] = AV28Formato ;
         new app.pexidsc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVALF", ""), GXv_char1) ;
         rdevaler_impl.this.AV28Formato = GXv_char1[0] ;
         /* Using cursor P07CM2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P07CM2_A407EmprNom[0] ;
            n407EmprNom = P07CM2_n407EmprNom[0] ;
            A404EmprDir = P07CM2_A404EmprDir[0] ;
            n404EmprDir = P07CM2_n404EmprDir[0] ;
            A408EmprPob = P07CM2_A408EmprPob[0] ;
            n408EmprPob = P07CM2_n408EmprPob[0] ;
            A409EmprTel = P07CM2_A409EmprTel[0] ;
            n409EmprTel = P07CM2_n409EmprTel[0] ;
            A8334EmpItm1 = P07CM2_A8334EmpItm1[0] ;
            n8334EmpItm1 = P07CM2_n8334EmpItm1[0] ;
            AV33Nomemp = A407EmprNom ;
            AV19EmprDir = A404EmprDir ;
            AV21EmprPob = A408EmprPob ;
            AV22EmprTel = A409EmprTel ;
            AV29EmpItm1 = A8334EmpItm1 ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P07CM3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV10NumALb});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3345TipMovCc = P07CM3_A3345TipMovCc[0] ;
            A3354CCStkAlb = P07CM3_A3354CCStkAlb[0] ;
            A3348CCStkFec = P07CM3_A3348CCStkFec[0] ;
            A795PrvNum = P07CM3_A795PrvNum[0] ;
            A718PrdNom = P07CM3_A718PrdNom[0] ;
            A3344CCStkCanS = P07CM3_A3344CCStkCanS[0] ;
            A719PrdNum = P07CM3_A719PrdNum[0] ;
            A3342CCStkLin = P07CM3_A3342CCStkLin[0] ;
            A795PrvNum = P07CM3_A795PrvNum[0] ;
            A718PrdNom = P07CM3_A718PrdNom[0] ;
            if ( ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SD", "")) == 0 ) || ( GXutil.strcmp(A3345TipMovCc, httpContext.getMessage( "SP", "")) == 0 ) )
            {
               AV27Ccstkfec = A3348CCStkFec ;
               AV11FechaAlb = GXutil.str( GXutil.day( A3348CCStkFec), 2, 0) + httpContext.getMessage( " de ", "") + localUtil.cmonth( A3348CCStkFec, httpContext.getMessage( "por", "")) + httpContext.getMessage( " de ", "") + GXutil.str( GXutil.year( A3348CCStkFec), 4, 0) ;
               AV13PrvNum = A795PrvNum ;
               /* Execute user subroutine: 'PRVGEN' */
               S111 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  pr_default.close(1);
                  getPrinter().GxEndPage() ;
                  /* Close printer file */
                  getPrinter().GxEndDocument() ;
                  endPrinter();
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               h7CM0( false, 17) ;
               getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A3344CCStkCanS, "ZZZZZZ9.9999")), 552, Gx_line+0, 653, Gx_line+18, 2+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 240, Gx_line+0, 458, Gx_line+18, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 41, Gx_line+0, 92, Gx_line+18, 0+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+17) ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7CM0( true, 0) ;
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

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'PRVGEN' Routine */
      returnInSub = false ;
      /* Using cursor P07CM4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV13PrvNum)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A795PrvNum = P07CM4_A795PrvNum[0] ;
         A794PrvNom = P07CM4_A794PrvNom[0] ;
         n794PrvNom = P07CM4_n794PrvNom[0] ;
         A786PrvDir = P07CM4_A786PrvDir[0] ;
         n786PrvDir = P07CM4_n786PrvDir[0] ;
         A782PrvCpo = P07CM4_A782PrvCpo[0] ;
         n782PrvCpo = P07CM4_n782PrvCpo[0] ;
         A799PrvPob = P07CM4_A799PrvPob[0] ;
         n799PrvPob = P07CM4_n799PrvPob[0] ;
         A793PrvNif = P07CM4_A793PrvNif[0] ;
         n793PrvNif = P07CM4_n793PrvNif[0] ;
         AV14PrvNom = A794PrvNom ;
         AV15PrvDir = A786PrvDir ;
         AV16PrvCpo = A782PrvCpo ;
         AV17PrvPob = A799PrvPob ;
         AV26Prvnif = A793PrvNif ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void h7CM0( boolean bFoot ,
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
               getPrinter().GxAttris("Arial", 7, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Processado por computador", ""), 406, Gx_line+135, 542, Gx_line+148, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Local", ""), 80, Gx_line+22, 117, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "carga", ""), 34, Gx_line+49, 68, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "desc.", ""), 33, Gx_line+80, 67, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(210, Gx_line+15, 210, Gx_line+122, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "N/ Instalações", ""), 83, Gx_line+49, 170, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "V/ Instalações", ""), 83, Gx_line+80, 170, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Viatura", ""), 240, Gx_line+22, 289, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText("_______________", 223, Gx_line+80, 333, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(341, Gx_line+15, 341, Gx_line+122, 2, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 417, Gx_line+22, 449, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "partida", ""), 348, Gx_line+49, 390, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "p. chegada", ""), 348, Gx_line+80, 416, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawRect(27, Gx_line+14, 544, Gx_line+122, 2, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
               getPrinter().GxDrawText("_______________", 419, Gx_line+49, 529, Gx_line+66, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("_______________", 419, Gx_line+80, 529, Gx_line+97, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Arial", 7, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12ContDsc, "")), 27, Gx_line+135, 111, Gx_line+149, 2+256, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+149) ;
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
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº", ""), 573, Gx_line+149, 593, Gx_line+169, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10NumALb, "")), 656, Gx_line+149, 740, Gx_line+170, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(26, Gx_line+241, 747, Gx_line+241, 2, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13PrvNum), "ZZZZZ9")), 149, Gx_line+321, 194, Gx_line+338, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14PrvNom, "")), 431, Gx_line+246, 682, Gx_line+264, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15PrvDir, "")), 431, Gx_line+267, 682, Gx_line+285, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16PrvCpo, "")), 431, Gx_line+288, 482, Gx_line+306, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17PrvPob, "")), 485, Gx_line+288, 736, Gx_line+306, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 11, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "PRODUTO", ""), 41, Gx_line+393, 108, Gx_line+411, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "DESCRIÇÃO", ""), 239, Gx_line+393, 324, Gx_line+411, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "QUANTIDADE", ""), 557, Gx_line+393, 652, Gx_line+411, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(27, Gx_line+414, 748, Gx_line+414, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawRect(27, Gx_line+311, 741, Gx_line+366, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Fornecedor:", ""), 51, Gx_line+321, 137, Gx_line+337, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Data:", ""), 51, Gx_line+339, 82, Gx_line+355, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "V/ Nº Contibuinte:", ""), 468, Gx_line+321, 568, Gx_line+337, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV27Ccstkfec, "99/99/99"), 143, Gx_line+339, 194, Gx_line+356, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Prvnif, "")), 582, Gx_line+321, 687, Gx_line+338, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TextoCopia, "")), 27, Gx_line+222, 115, Gx_line+238, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Formato, "")), 573, Gx_line+122, 741, Gx_line+143, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "c89c26b7-4557-41b9-bd04-12d8bf342776", "", context.getHttpContext().getTheme( )), 27, Gx_line+14, 401, Gx_line+100) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21EmprPob, "")), 29, Gx_line+116, 212, Gx_line+132, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19EmprDir, "")), 29, Gx_line+102, 212, Gx_line+118, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tel.: ", ""), 29, Gx_line+135, 53, Gx_line+150, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "E-mail:", ""), 29, Gx_line+149, 62, Gx_line+164, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22EmprTel, "")), 63, Gx_line+135, 142, Gx_line+151, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29EmpItm1, "")), 63, Gx_line+149, 168, Gx_line+165, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Capital Social: 1.000.000 Euros", ""), 29, Gx_line+195, 185, Gx_line+210, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Sociedade anonima", ""), 29, Gx_line+181, 128, Gx_line+196, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Contribuinte nº: 500 597 880", ""), 29, Gx_line+168, 173, Gx_line+183, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+420) ;
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
      add_metrics3( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics3( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
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
      AV10NumALb = "" ;
      AV24TextoCopia = "" ;
      AV12ContDsc = "" ;
      AV28Formato = "" ;
      GXv_char1 = new String[1] ;
      scmdbuf = "" ;
      P07CM2_A396EmprCod = new String[] {""} ;
      P07CM2_A407EmprNom = new String[] {""} ;
      P07CM2_n407EmprNom = new boolean[] {false} ;
      P07CM2_A404EmprDir = new String[] {""} ;
      P07CM2_n404EmprDir = new boolean[] {false} ;
      P07CM2_A408EmprPob = new String[] {""} ;
      P07CM2_n408EmprPob = new boolean[] {false} ;
      P07CM2_A409EmprTel = new String[] {""} ;
      P07CM2_n409EmprTel = new boolean[] {false} ;
      P07CM2_A8334EmpItm1 = new String[] {""} ;
      P07CM2_n8334EmpItm1 = new boolean[] {false} ;
      A407EmprNom = "" ;
      A404EmprDir = "" ;
      A408EmprPob = "" ;
      A409EmprTel = "" ;
      A8334EmpItm1 = "" ;
      AV33Nomemp = "" ;
      AV19EmprDir = "" ;
      AV21EmprPob = "" ;
      AV22EmprTel = "" ;
      AV29EmpItm1 = "" ;
      P07CM3_A396EmprCod = new String[] {""} ;
      P07CM3_A3345TipMovCc = new String[] {""} ;
      P07CM3_A3354CCStkAlb = new String[] {""} ;
      P07CM3_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      P07CM3_A795PrvNum = new int[1] ;
      P07CM3_A718PrdNom = new String[] {""} ;
      P07CM3_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P07CM3_A719PrdNum = new String[] {""} ;
      P07CM3_A3342CCStkLin = new long[1] ;
      A3345TipMovCc = "" ;
      A3354CCStkAlb = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A718PrdNom = "" ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV27Ccstkfec = GXutil.nullDate() ;
      AV11FechaAlb = "" ;
      P07CM4_A396EmprCod = new String[] {""} ;
      P07CM4_A795PrvNum = new int[1] ;
      P07CM4_A794PrvNom = new String[] {""} ;
      P07CM4_n794PrvNom = new boolean[] {false} ;
      P07CM4_A786PrvDir = new String[] {""} ;
      P07CM4_n786PrvDir = new boolean[] {false} ;
      P07CM4_A782PrvCpo = new String[] {""} ;
      P07CM4_n782PrvCpo = new boolean[] {false} ;
      P07CM4_A799PrvPob = new String[] {""} ;
      P07CM4_n799PrvPob = new boolean[] {false} ;
      P07CM4_A793PrvNif = new String[] {""} ;
      P07CM4_n793PrvNif = new boolean[] {false} ;
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      A793PrvNif = "" ;
      AV14PrvNom = "" ;
      AV15PrvDir = "" ;
      AV16PrvCpo = "" ;
      AV17PrvPob = "" ;
      AV26Prvnif = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rdevaler__default(),
         new Object[] {
             new Object[] {
            P07CM2_A396EmprCod, P07CM2_A407EmprNom, P07CM2_n407EmprNom, P07CM2_A404EmprDir, P07CM2_n404EmprDir, P07CM2_A408EmprPob, P07CM2_n408EmprPob, P07CM2_A409EmprTel, P07CM2_n409EmprTel, P07CM2_A8334EmpItm1,
            P07CM2_n8334EmpItm1
            }
            , new Object[] {
            P07CM3_A396EmprCod, P07CM3_A3345TipMovCc, P07CM3_A3354CCStkAlb, P07CM3_A3348CCStkFec, P07CM3_A795PrvNum, P07CM3_A718PrdNom, P07CM3_A3344CCStkCanS, P07CM3_A719PrdNum, P07CM3_A3342CCStkLin
            }
            , new Object[] {
            P07CM4_A396EmprCod, P07CM4_A795PrvNum, P07CM4_A794PrvNom, P07CM4_n794PrvNom, P07CM4_A786PrvDir, P07CM4_n786PrvDir, P07CM4_A782PrvCpo, P07CM4_n782PrvCpo, P07CM4_A799PrvPob, P07CM4_n799PrvPob,
            P07CM4_A793PrvNif, P07CM4_n793PrvNif
            }
         }
      );
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int A795PrvNum ;
   private int AV13PrvNum ;
   private int Gx_OldLine ;
   private long A3342CCStkLin ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV10NumALb ;
   private String AV24TextoCopia ;
   private String AV12ContDsc ;
   private String AV28Formato ;
   private String GXv_char1[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String A404EmprDir ;
   private String A408EmprPob ;
   private String A409EmprTel ;
   private String A8334EmpItm1 ;
   private String AV33Nomemp ;
   private String AV19EmprDir ;
   private String AV21EmprPob ;
   private String AV22EmprTel ;
   private String AV29EmpItm1 ;
   private String A3345TipMovCc ;
   private String A3354CCStkAlb ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String AV11FechaAlb ;
   private String A794PrvNom ;
   private String A786PrvDir ;
   private String A782PrvCpo ;
   private String A799PrvPob ;
   private String A793PrvNif ;
   private String AV14PrvNom ;
   private String AV15PrvDir ;
   private String AV16PrvCpo ;
   private String AV17PrvPob ;
   private String AV26Prvnif ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV27Ccstkfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean n404EmprDir ;
   private boolean n408EmprPob ;
   private boolean n409EmprTel ;
   private boolean n8334EmpItm1 ;
   private boolean returnInSub ;
   private boolean n794PrvNom ;
   private boolean n786PrvDir ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n793PrvNif ;
   private IDataStoreProvider pr_default ;
   private String[] P07CM2_A396EmprCod ;
   private String[] P07CM2_A407EmprNom ;
   private boolean[] P07CM2_n407EmprNom ;
   private String[] P07CM2_A404EmprDir ;
   private boolean[] P07CM2_n404EmprDir ;
   private String[] P07CM2_A408EmprPob ;
   private boolean[] P07CM2_n408EmprPob ;
   private String[] P07CM2_A409EmprTel ;
   private boolean[] P07CM2_n409EmprTel ;
   private String[] P07CM2_A8334EmpItm1 ;
   private boolean[] P07CM2_n8334EmpItm1 ;
   private String[] P07CM3_A396EmprCod ;
   private String[] P07CM3_A3345TipMovCc ;
   private String[] P07CM3_A3354CCStkAlb ;
   private java.util.Date[] P07CM3_A3348CCStkFec ;
   private int[] P07CM3_A795PrvNum ;
   private String[] P07CM3_A718PrdNom ;
   private java.math.BigDecimal[] P07CM3_A3344CCStkCanS ;
   private String[] P07CM3_A719PrdNum ;
   private long[] P07CM3_A3342CCStkLin ;
   private String[] P07CM4_A396EmprCod ;
   private int[] P07CM4_A795PrvNum ;
   private String[] P07CM4_A794PrvNom ;
   private boolean[] P07CM4_n794PrvNom ;
   private String[] P07CM4_A786PrvDir ;
   private boolean[] P07CM4_n786PrvDir ;
   private String[] P07CM4_A782PrvCpo ;
   private boolean[] P07CM4_n782PrvCpo ;
   private String[] P07CM4_A799PrvPob ;
   private boolean[] P07CM4_n799PrvPob ;
   private String[] P07CM4_A793PrvNif ;
   private boolean[] P07CM4_n793PrvNif ;
}

final  class rdevaler__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07CM2", "SELECT EmprCod, EmprNom, EmprDir, EmprPob, EmprTel, EmpItm1 FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P07CM3", "SELECT T1.EmprCod, T1.TipMovCc, T1.CCStkAlb, T1.CCStkFec, T2.PrvNum, T2.PrdNom, T1.CCStkCanS, T1.PrdNum, T1.CCStkLin FROM (TXPCCSTKS T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE (T1.EmprCod = ?) AND (T1.CCStkAlb = ?) ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P07CM4", "SELECT EmprCod, PrvNum, PrvNom, PrvDir, PrvCpo, PrvPob, PrvNif FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[9])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 20);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

