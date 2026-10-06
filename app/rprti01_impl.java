package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rprti01_impl extends GXWebReport
{
   public rprti01_impl( com.genexus.internet.HttpContext context )
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
            AV16PProc = httpContext.GetPar( "PProc") ;
            AV17UProc = httpContext.GetPar( "UProc") ;
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
      M_bot = 0 ;
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
         P_lines = (int)(gxYPage-(lineHeight*0)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV19Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN090_", ""), (byte)(99), GXv_char2) ;
         rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
         AV19Lit0 = GXt_char1 ;
         GXt_char1 = AV20Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
         AV20Lit1 = GXt_char1 ;
         GXt_char1 = AV21Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
         AV21Lit2 = GXt_char1 ;
         GXt_char1 = AV22Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
         AV22Lit3 = GXt_char1 ;
         GXt_char1 = AV23Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
         AV23Lit4 = GXt_char1 ;
         GXt_char1 = AV24Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
         AV24Lit5 = GXt_char1 ;
         GXt_char1 = AV25Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
         rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
         AV25Lit6 = GXt_char1 ;
         GXt_char1 = AV26Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN076_", ""), (byte)(99), GXv_char2) ;
         rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
         AV26Lit7 = GXt_char1 ;
         GXt_char1 = AV27Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
         rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
         AV27Lit8 = GXt_char1 ;
         GXt_char1 = AV28Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
         rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
         AV28Lit9 = GXt_char1 ;
         GXt_char1 = AV32Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1227_", ""), (byte)(99), GXv_char2) ;
         rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit10 = GXt_char1 ;
         /* Using cursor P06CE2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A407EmprNom = P06CE2_A407EmprNom[0] ;
            n407EmprNom = P06CE2_n407EmprNom[0] ;
            AV18NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         /* Using cursor P06CE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV16PProc, AV17UProc});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A764ProForCod = P06CE3_A764ProForCod[0] ;
            A772ProForTmx = P06CE3_A772ProForTmx[0] ;
            A766ProForDsc = P06CE3_A766ProForDsc[0] ;
            h6CE0( false, 29) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28Lit9, "")), 14, Gx_line+5, 82, Gx_line+21, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A764ProForCod, "")), 93, Gx_line+6, 157, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A766ProForDsc, "")), 161, Gx_line+6, 318, Gx_line+22, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 85, Gx_line+5, 89, Gx_line+21, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+29) ;
            AV30CodPro = A764ProForCod ;
            /* Execute user subroutine: 'COLORES' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'RECETAS' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Execute user subroutine: 'ARTFOR' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h6CE0( true, 0) ;
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
      /* 'COLORES' Routine */
      returnInSub = false ;
      AV34Colores = (byte)(0) ;
      GXt_char1 = AV32Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1227_", ""), (byte)(99), GXv_char2) ;
      rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit10 = GXt_char1 ;
      /* Using cursor P06CE4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV30CodPro});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A764ProForCod = P06CE4_A764ProForCod[0] ;
         A1160ProForL = P06CE4_A1160ProForL[0] ;
         A831TipColCod = P06CE4_A831TipColCod[0] ;
         A483ForColNum = P06CE4_A483ForColNum[0] ;
         A482ForColNom = P06CE4_A482ForColNom[0] ;
         A494ForSer = P06CE4_A494ForSer[0] ;
         A252CliCod = P06CE4_A252CliCod[0] ;
         n252CliCod = P06CE4_n252CliCod[0] ;
         h6CE0( false, 17) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 7, Gx_line+0, 46, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A494ForSer, "")), 80, Gx_line+0, 164, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A482ForColNom, "")), 204, Gx_line+0, 273, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), 306, Gx_line+0, 345, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), 421, Gx_line+0, 435, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit10, "")), 499, Gx_line+0, 552, Gx_line+17, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV32Lit10 = "" ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      h6CE0( false, 6) ;
      getPrinter().GxDrawLine(0, Gx_line+2, 751, Gx_line+2, 1, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+6) ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'RECETAS' Routine */
      returnInSub = false ;
      AV33Recetas = (byte)(0) ;
      GXt_char1 = AV32Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT108_", ""), (byte)(99), GXv_char2) ;
      rprti01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit10 = GXt_char1 ;
      /* Using cursor P06CE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV30CodPro});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A764ProForCod = P06CE5_A764ProForCod[0] ;
         A1273RecLinPro = P06CE5_A1273RecLinPro[0] ;
         A218BarTipCol = P06CE5_A218BarTipCol[0] ;
         A136BarColNum = P06CE5_A136BarColNum[0] ;
         A135BarColNom = P06CE5_A135BarColNom[0] ;
         A212BarSer = P06CE5_A212BarSer[0] ;
         A252CliCod = P06CE5_A252CliCod[0] ;
         n252CliCod = P06CE5_n252CliCod[0] ;
         A130BarCodPar = P06CE5_A130BarCodPar[0] ;
         A132BarCodReo = P06CE5_A132BarCodReo[0] ;
         A129BarCod = P06CE5_A129BarCod[0] ;
         A2804RecLinMaq = P06CE5_A2804RecLinMaq[0] ;
         A218BarTipCol = P06CE5_A218BarTipCol[0] ;
         A136BarColNum = P06CE5_A136BarColNum[0] ;
         A135BarColNom = P06CE5_A135BarColNom[0] ;
         A212BarSer = P06CE5_A212BarSer[0] ;
         A252CliCod = P06CE5_A252CliCod[0] ;
         n252CliCod = P06CE5_n252CliCod[0] ;
         AV31HDR = GXutil.str( A129BarCod, 8, 0) + " " + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
         h6CE0( false, 17) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 7, Gx_line+0, 46, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A212BarSer, "")), 80, Gx_line+0, 164, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A135BarColNom, "")), 204, Gx_line+0, 273, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9")), 306, Gx_line+0, 345, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9")), 421, Gx_line+0, 435, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31HDR, "")), 618, Gx_line+0, 676, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxAttris("Arial", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32Lit10, "")), 499, Gx_line+0, 552, Gx_line+17, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         AV33Recetas = (byte)(1) ;
         AV32Lit10 = "" ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV33Recetas == 1 )
      {
         h6CE0( false, 7) ;
         getPrinter().GxDrawLine(0, Gx_line+3, 751, Gx_line+3, 2, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+7) ;
      }
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'ARTFOR' Routine */
      returnInSub = false ;
      /* Using cursor P06CE6 */
      pr_default.execute(4, new Object[] {AV30CodPro, A396EmprCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A4898ArtProCod = P06CE6_A4898ArtProCod[0] ;
         A457FasCod = P06CE6_A457FasCod[0] ;
         A759ProDsc = P06CE6_A759ProDsc[0] ;
         A758ProCod = P06CE6_A758ProCod[0] ;
         A65ArtCod = P06CE6_A65ArtCod[0] ;
         A252CliCod = P06CE6_A252CliCod[0] ;
         n252CliCod = P06CE6_n252CliCod[0] ;
         A4897ArtProLin = P06CE6_A4897ArtProLin[0] ;
         A759ProDsc = P06CE6_A759ProDsc[0] ;
         h6CE0( false, 17) ;
         getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 7, Gx_line+0, 46, Gx_line+16, 2+256, 0, 0, 0) ;
         getPrinter().GxAttris("Courier New", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A65ArtCod, "")), 80, Gx_line+0, 198, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A758ProCod, "")), 204, Gx_line+0, 263, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A759ProDsc, "")), 268, Gx_line+0, 561, Gx_line+16, 0+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A457FasCod, "@!")), 573, Gx_line+0, 632, Gx_line+16, 0+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+17) ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void h6CE0( boolean bFoot ,
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
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "SITUACION PROCESOS TINTE", ""), 6, Gx_line+34, 179, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18NomEmp, "")), 7, Gx_line+8, 164, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20Lit1, "")), 428, Gx_line+8, 481, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 496, Gx_line+8, 541, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21Lit2, "")), 560, Gx_line+8, 603, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 634, Gx_line+8, 718, Gx_line+24, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22Lit3, "")), 560, Gx_line+35, 624, Gx_line+51, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 656, Gx_line+35, 695, Gx_line+51, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Tc", ""), 417, Gx_line+74, 433, Gx_line+91, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23Lit4, "")), 7, Gx_line+74, 65, Gx_line+91, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 10, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24Lit5, "")), 80, Gx_line+74, 162, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25Lit6, "")), 204, Gx_line+74, 286, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26Lit7, "")), 306, Gx_line+74, 388, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27Lit8, "")), 591, Gx_line+74, 655, Gx_line+92, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+56, 751, Gx_line+56, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+95, 751, Gx_line+95, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(":", 483, Gx_line+7, 487, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 626, Gx_line+7, 630, Gx_line+23, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(":", 626, Gx_line+34, 630, Gx_line+50, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("Arial", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41Pgmname, "")), 283, Gx_line+33, 440, Gx_line+49, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawLine(0, Gx_line+2, 751, Gx_line+2, 2, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+98) ;
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
      getPrinter().setMetrics("Arial", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Arial", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV15ImpCod = "" ;
      AV16PProc = "" ;
      AV17UProc = "" ;
      AV19Lit0 = "" ;
      AV20Lit1 = "" ;
      AV21Lit2 = "" ;
      AV22Lit3 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV27Lit8 = "" ;
      AV28Lit9 = "" ;
      AV32Lit10 = "" ;
      scmdbuf = "" ;
      P06CE2_A396EmprCod = new String[] {""} ;
      P06CE2_A407EmprNom = new String[] {""} ;
      P06CE2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV18NomEmp = "" ;
      P06CE3_A396EmprCod = new String[] {""} ;
      P06CE3_A764ProForCod = new String[] {""} ;
      P06CE3_A772ProForTmx = new short[1] ;
      P06CE3_A766ProForDsc = new String[] {""} ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      AV30CodPro = "" ;
      P06CE4_A396EmprCod = new String[] {""} ;
      P06CE4_A764ProForCod = new String[] {""} ;
      P06CE4_A1160ProForL = new short[1] ;
      P06CE4_A831TipColCod = new byte[1] ;
      P06CE4_A483ForColNum = new int[1] ;
      P06CE4_A482ForColNom = new String[] {""} ;
      P06CE4_A494ForSer = new String[] {""} ;
      P06CE4_A252CliCod = new int[1] ;
      P06CE4_n252CliCod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      P06CE5_A396EmprCod = new String[] {""} ;
      P06CE5_A764ProForCod = new String[] {""} ;
      P06CE5_A1273RecLinPro = new byte[1] ;
      P06CE5_A218BarTipCol = new byte[1] ;
      P06CE5_A136BarColNum = new int[1] ;
      P06CE5_A135BarColNom = new String[] {""} ;
      P06CE5_A212BarSer = new String[] {""} ;
      P06CE5_A252CliCod = new int[1] ;
      P06CE5_n252CliCod = new boolean[] {false} ;
      P06CE5_A130BarCodPar = new String[] {""} ;
      P06CE5_A132BarCodReo = new byte[1] ;
      P06CE5_A129BarCod = new int[1] ;
      P06CE5_A2804RecLinMaq = new short[1] ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A130BarCodPar = "" ;
      AV31HDR = "" ;
      P06CE6_A396EmprCod = new String[] {""} ;
      P06CE6_A4898ArtProCod = new String[] {""} ;
      P06CE6_A457FasCod = new String[] {""} ;
      P06CE6_A759ProDsc = new String[] {""} ;
      P06CE6_A758ProCod = new String[] {""} ;
      P06CE6_A65ArtCod = new String[] {""} ;
      P06CE6_A252CliCod = new int[1] ;
      P06CE6_n252CliCod = new boolean[] {false} ;
      P06CE6_A4897ArtProLin = new short[1] ;
      A4898ArtProCod = "" ;
      A457FasCod = "" ;
      A759ProDsc = "" ;
      A758ProCod = "" ;
      A65ArtCod = "" ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      AV41Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rprti01__default(),
         new Object[] {
             new Object[] {
            P06CE2_A396EmprCod, P06CE2_A407EmprNom, P06CE2_n407EmprNom
            }
            , new Object[] {
            P06CE3_A396EmprCod, P06CE3_A764ProForCod, P06CE3_A772ProForTmx, P06CE3_A766ProForDsc
            }
            , new Object[] {
            P06CE4_A396EmprCod, P06CE4_A764ProForCod, P06CE4_A1160ProForL, P06CE4_A831TipColCod, P06CE4_A483ForColNum, P06CE4_A482ForColNom, P06CE4_A494ForSer, P06CE4_A252CliCod
            }
            , new Object[] {
            P06CE5_A396EmprCod, P06CE5_A764ProForCod, P06CE5_A1273RecLinPro, P06CE5_A218BarTipCol, P06CE5_A136BarColNum, P06CE5_A135BarColNom, P06CE5_A212BarSer, P06CE5_A252CliCod, P06CE5_n252CliCod, P06CE5_A130BarCodPar,
            P06CE5_A132BarCodReo, P06CE5_A129BarCod, P06CE5_A2804RecLinMaq
            }
            , new Object[] {
            P06CE6_A396EmprCod, P06CE6_A4898ArtProCod, P06CE6_A457FasCod, P06CE6_A759ProDsc, P06CE6_A758ProCod, P06CE6_A65ArtCod, P06CE6_A252CliCod, P06CE6_A4897ArtProLin
            }
         }
      );
      AV41Pgmname = "RPRTI01" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV41Pgmname = "RPRTI01" ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV34Colores ;
   private byte A831TipColCod ;
   private byte AV33Recetas ;
   private byte A1273RecLinPro ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A772ProForTmx ;
   private short A1160ProForL ;
   private short A2804RecLinMaq ;
   private short A4897ArtProLin ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String AV15ImpCod ;
   private String AV16PProc ;
   private String AV17UProc ;
   private String AV19Lit0 ;
   private String AV20Lit1 ;
   private String AV21Lit2 ;
   private String AV22Lit3 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV27Lit8 ;
   private String AV28Lit9 ;
   private String AV32Lit10 ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV18NomEmp ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String AV30CodPro ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String AV31HDR ;
   private String A4898ArtProCod ;
   private String A457FasCod ;
   private String A759ProDsc ;
   private String A758ProCod ;
   private String A65ArtCod ;
   private String Gx_time ;
   private String AV41Pgmname ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private IDataStoreProvider pr_default ;
   private String[] P06CE2_A396EmprCod ;
   private String[] P06CE2_A407EmprNom ;
   private boolean[] P06CE2_n407EmprNom ;
   private String[] P06CE3_A396EmprCod ;
   private String[] P06CE3_A764ProForCod ;
   private short[] P06CE3_A772ProForTmx ;
   private String[] P06CE3_A766ProForDsc ;
   private String[] P06CE4_A396EmprCod ;
   private String[] P06CE4_A764ProForCod ;
   private short[] P06CE4_A1160ProForL ;
   private byte[] P06CE4_A831TipColCod ;
   private int[] P06CE4_A483ForColNum ;
   private String[] P06CE4_A482ForColNom ;
   private String[] P06CE4_A494ForSer ;
   private int[] P06CE4_A252CliCod ;
   private boolean[] P06CE4_n252CliCod ;
   private String[] P06CE5_A396EmprCod ;
   private String[] P06CE5_A764ProForCod ;
   private byte[] P06CE5_A1273RecLinPro ;
   private byte[] P06CE5_A218BarTipCol ;
   private int[] P06CE5_A136BarColNum ;
   private String[] P06CE5_A135BarColNom ;
   private String[] P06CE5_A212BarSer ;
   private int[] P06CE5_A252CliCod ;
   private boolean[] P06CE5_n252CliCod ;
   private String[] P06CE5_A130BarCodPar ;
   private byte[] P06CE5_A132BarCodReo ;
   private int[] P06CE5_A129BarCod ;
   private short[] P06CE5_A2804RecLinMaq ;
   private String[] P06CE6_A396EmprCod ;
   private String[] P06CE6_A4898ArtProCod ;
   private String[] P06CE6_A457FasCod ;
   private String[] P06CE6_A759ProDsc ;
   private String[] P06CE6_A758ProCod ;
   private String[] P06CE6_A65ArtCod ;
   private int[] P06CE6_A252CliCod ;
   private boolean[] P06CE6_n252CliCod ;
   private short[] P06CE6_A4897ArtProLin ;
}

final  class rprti01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06CE2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06CE3", "SELECT EmprCod, ProForCod, ProForTmx, ProForDsc FROM TXPCPROFO WHERE (EmprCod = ? and ProForCod >= ?) AND (ProForCod <= ?) ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06CE4", "SELECT EmprCod, ProForCod, ProForL, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPLFORMU WHERE (EmprCod = ?) AND (ProForCod = ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06CE5", "SELECT T1.EmprCod, T1.ProForCod, T1.RecLinPro, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSer, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.RecLinMaq FROM (TXPCRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (T1.ProForCod = ?) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06CE6", "SELECT T1.EmprCod, T1.ArtProCod, T1.FasCod, T2.ProDsc, T1.ProCod, T1.ArtCod, T1.CliCod, T1.ArtProLin FROM (TXPArtFor T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) WHERE (T1.ArtProCod = ?) AND (T1.EmprCod = ?) ORDER BY T1.ArtProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               return;
      }
   }

}

