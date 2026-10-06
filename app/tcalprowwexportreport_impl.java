package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcalprowwexportreport_impl extends GXWebReport
{
   public tcalprowwexportreport_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
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
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 1, 15840, 12240, 0, 1, 1, 0, 1, 1) )
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
         GXv_SdtWWPContext1[0] = AV9WWPContext;
         new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
         AV9WWPContext = GXv_SdtWWPContext1[0] ;
         /* Execute user subroutine: 'LOADGRIDSTATE' */
         S151 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV76Title = httpContext.getMessage( "Lista de Documento Transporte Proveedor", "") ;
         /* Execute user subroutine: 'PRINTFILTERS' */
         S111 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTCOLUMNTITLES' */
         S121 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTDATA' */
         S131 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: 'PRINTFOOTER' */
         S171 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h91S0( true, 0) ;
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
      /* 'PRINTFILTERS' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV12FilterFullText)==0) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV19TFAlbProID) && (0==AV20TFAlbProID_To) ) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Documento", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFAlbProID), "ZZZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV55TFAlbProID_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Documento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFAlbProID_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TFAlbProID_To), "ZZZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV23TFAlbProInEx_Sels.fromJSonString(AV21TFAlbProInEx_SelsJson, null);
      if ( ! ( AV23TFAlbProInEx_Sels.size() == 0 ) )
      {
         AV65i = 1 ;
         AV101GXV1 = 1 ;
         while ( AV101GXV1 <= AV23TFAlbProInEx_Sels.size() )
         {
            AV24TFAlbProInEx_Sel = ((Number) AV23TFAlbProInEx_Sels.elementAt(-1+AV101GXV1)).byteValue() ;
            if ( AV65i == 1 )
            {
               AV22TFAlbProInEx_SelDscs = "" ;
            }
            else
            {
               AV22TFAlbProInEx_SelDscs += ", " ;
            }
            AV56FilterTFAlbProInEx_SelValueDescription = "" ;
            if ( AV24TFAlbProInEx_Sel == 1 )
            {
               AV56FilterTFAlbProInEx_SelValueDescription = httpContext.getMessage( "Mercado Interno", "") ;
            }
            else if ( AV24TFAlbProInEx_Sel == 2 )
            {
               AV56FilterTFAlbProInEx_SelValueDescription = httpContext.getMessage( "Mercado Externo", "") ;
            }
            AV22TFAlbProInEx_SelDscs += AV56FilterTFAlbProInEx_SelValueDescription ;
            AV65i = (long)(AV65i+1) ;
            AV101GXV1 = (int)(AV101GXV1+1) ;
         }
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Mercado Interno / Externo", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFAlbProInEx_SelDscs, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV27TFAlbProTipo_Sels.fromJSonString(AV25TFAlbProTipo_SelsJson, null);
      if ( ! ( AV27TFAlbProTipo_Sels.size() == 0 ) )
      {
         AV65i = 1 ;
         AV102GXV2 = 1 ;
         while ( AV102GXV2 <= AV27TFAlbProTipo_Sels.size() )
         {
            AV28TFAlbProTipo_Sel = (String)AV27TFAlbProTipo_Sels.elementAt(-1+AV102GXV2) ;
            if ( AV65i == 1 )
            {
               AV26TFAlbProTipo_SelDscs = "" ;
            }
            else
            {
               AV26TFAlbProTipo_SelDscs += ", " ;
            }
            AV57FilterTFAlbProTipo_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV28TFAlbProTipo_Sel), "P") == 0 )
            {
               AV57FilterTFAlbProTipo_SelValueDescription = httpContext.getMessage( "Proveedor", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV28TFAlbProTipo_Sel), "C") == 0 )
            {
               AV57FilterTFAlbProTipo_SelValueDescription = httpContext.getMessage( "Cliente", "") ;
            }
            AV26TFAlbProTipo_SelDscs += AV57FilterTFAlbProTipo_SelValueDescription ;
            AV65i = (long)(AV65i+1) ;
            AV102GXV2 = (int)(AV102GXV2+1) ;
         }
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proveedor o Cliente", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFAlbProTipo_SelDscs, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29TFAlbProDate)) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV29TFAlbProDate, "99/99/99"), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV31TFAlbProSal) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha-Hora Salida", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV31TFAlbProSal, "99/99/99 99:99"), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV33TFCatDocID) && (0==AV34TFCatDocID_To) ) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Categoria", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33TFCatDocID), "ZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV60TFCatDocID_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Categoria", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFCatDocID_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34TFCatDocID_To), "ZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFCatDocNom_Sel)==0) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Categoria", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFCatDocNom_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV35TFCatDocNom)==0) )
         {
            h91S0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Categoria", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFCatDocNom, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV37TFAlbProPrvID) && (0==AV38TFAlbProPrvID_To) ) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Proveedor", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TFAlbProPrvID), "ZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV61TFAlbProPrvID_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Proveedor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFAlbProPrvID_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38TFAlbProPrvID_To), "ZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV40TFAlbProPrvNom_Sel)==0) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Proveedor", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFAlbProPrvNom_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV39TFAlbProPrvNom)==0) )
         {
            h91S0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Proveedor", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFAlbProPrvNom, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV41TFAlbProCliCod) && (0==AV42TFAlbProCliCod_To) ) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Cliente", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TFAlbProCliCod), "ZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV62TFAlbProCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFAlbProCliCod_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42TFAlbProCliCod_To), "ZZZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFAlbProCliNom_Sel)==0) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFAlbProCliNom_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV43TFAlbProCliNom)==0) )
         {
            h91S0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFAlbProCliNom, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV45TFAlbProDomEnv) && (0==AV46TFAlbProDomEnv_To) ) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Domicilio Envio", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45TFAlbProDomEnv), "9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV63TFAlbProDomEnv_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Domicilio Envio", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFAlbProDomEnv_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV46TFAlbProDomEnv_To), "9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV47TFTrnCod) && (0==AV48TFTrnCod_To) ) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod Transp", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV47TFTrnCod), "ZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV64TFTrnCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cod Transp", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64TFTrnCod_To_Description, "")), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48TFTrnCod_To), "ZZZ9")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFTrnNom_Sel)==0) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFTrnNom_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV49TFTrnNom)==0) )
         {
            h91S0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFTrnNom, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV52TFAlbProMatricula_Sel)==0) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFAlbProMatricula_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV51TFAlbProMatricula)==0) )
         {
            h91S0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFAlbProMatricula, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV54TFAlbProObs_Sel)==0) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFAlbProObs_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV53TFAlbProObs)==0) )
         {
            h91S0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFAlbProObs, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV86TFAlbProIDAT_Sel)==0) )
      {
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "AT ID", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV86TFAlbProIDAT_Sel, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV85TFAlbProIDAT)==0) )
         {
            h91S0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "AT ID", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85TFAlbProIDAT, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV93TFAlbProStAT_Sels.fromJSonString(AV91TFAlbProStAT_SelsJson, null);
      if ( ! ( AV93TFAlbProStAT_Sels.size() == 0 ) )
      {
         AV65i = 1 ;
         AV103GXV3 = 1 ;
         while ( AV103GXV3 <= AV93TFAlbProStAT_Sels.size() )
         {
            AV94TFAlbProStAT_Sel = ((Number) AV93TFAlbProStAT_Sels.elementAt(-1+AV103GXV3)).byteValue() ;
            if ( AV65i == 1 )
            {
               AV92TFAlbProStAT_SelDscs = "" ;
            }
            else
            {
               AV92TFAlbProStAT_SelDscs += ", " ;
            }
            AV95FilterTFAlbProStAT_SelValueDescription = "" ;
            if ( AV94TFAlbProStAT_Sel == 0 )
            {
               AV95FilterTFAlbProStAT_SelValueDescription = httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( AV94TFAlbProStAT_Sel == 3 )
            {
               AV95FilterTFAlbProStAT_SelValueDescription = httpContext.getMessage( "Enviada", "") ;
            }
            AV92TFAlbProStAT_SelDscs += AV95FilterTFAlbProStAT_SelValueDescription ;
            AV65i = (long)(AV65i+1) ;
            AV103GXV3 = (int)(AV103GXV3+1) ;
         }
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado AT ", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92TFAlbProStAT_SelDscs, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV83TFAlbProAnulado_Sels.fromJSonString(AV81TFAlbProAnulado_SelsJson, null);
      if ( ! ( AV83TFAlbProAnulado_Sels.size() == 0 ) )
      {
         AV65i = 1 ;
         AV104GXV4 = 1 ;
         while ( AV104GXV4 <= AV83TFAlbProAnulado_Sels.size() )
         {
            AV79TFAlbProAnulado_Sel = (String)AV83TFAlbProAnulado_Sels.elementAt(-1+AV104GXV4) ;
            if ( AV65i == 1 )
            {
               AV82TFAlbProAnulado_SelDscs = "" ;
            }
            else
            {
               AV82TFAlbProAnulado_SelDscs += ", " ;
            }
            AV84FilterTFAlbProAnulado_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV79TFAlbProAnulado_Sel), "") == 0 )
            {
               AV84FilterTFAlbProAnulado_SelValueDescription = httpContext.getMessage( "Activo", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV79TFAlbProAnulado_Sel), "A") == 0 )
            {
               AV84FilterTFAlbProAnulado_SelValueDescription = httpContext.getMessage( "Anulado", "") ;
            }
            AV82TFAlbProAnulado_SelDscs += AV84FilterTFAlbProAnulado_SelValueDescription ;
            AV65i = (long)(AV65i+1) ;
            AV104GXV4 = (int)(AV104GXV4+1) ;
         }
         h91S0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 162, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82TFAlbProAnulado_SelDscs, "")), 162, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h91S0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h91S0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Documento", ""), 30, Gx_line+10, 66, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Mercado Interno / Externo", ""), 70, Gx_line+10, 106, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proveedor o Cliente", ""), 110, Gx_line+10, 146, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 150, Gx_line+10, 186, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha-Hora Salida", ""), 190, Gx_line+10, 226, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Categoria", ""), 230, Gx_line+10, 266, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Categoria", ""), 270, Gx_line+10, 306, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Proveedor", ""), 310, Gx_line+10, 346, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Proveedor", ""), 350, Gx_line+10, 386, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Cliente", ""), 390, Gx_line+10, 426, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 430, Gx_line+10, 466, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Domicilio Envio", ""), 470, Gx_line+10, 506, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod Transp", ""), 510, Gx_line+10, 546, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 550, Gx_line+10, 586, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Matricula", ""), 590, Gx_line+10, 626, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Observaciones", ""), 630, Gx_line+10, 666, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "AT ID", ""), 670, Gx_line+10, 706, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado AT ", ""), 710, Gx_line+10, 746, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 750, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV106Tcalprowwds_1_filterfulltext = AV12FilterFullText ;
      AV107Tcalprowwds_2_tfalbproid = AV19TFAlbProID ;
      AV108Tcalprowwds_3_tfalbproid_to = AV20TFAlbProID_To ;
      AV109Tcalprowwds_4_tfalbproinex_sels = AV23TFAlbProInEx_Sels ;
      AV110Tcalprowwds_5_tfalbprotipo_sels = AV27TFAlbProTipo_Sels ;
      AV111Tcalprowwds_6_tfalbprodate = AV29TFAlbProDate ;
      AV112Tcalprowwds_7_tfalbprosal = AV31TFAlbProSal ;
      AV113Tcalprowwds_8_tfcatdocid = AV33TFCatDocID ;
      AV114Tcalprowwds_9_tfcatdocid_to = AV34TFCatDocID_To ;
      AV115Tcalprowwds_10_tfcatdocnom = AV35TFCatDocNom ;
      AV116Tcalprowwds_11_tfcatdocnom_sel = AV36TFCatDocNom_Sel ;
      AV117Tcalprowwds_12_tfalbproprvid = AV37TFAlbProPrvID ;
      AV118Tcalprowwds_13_tfalbproprvid_to = AV38TFAlbProPrvID_To ;
      AV119Tcalprowwds_14_tfalbproprvnom = AV39TFAlbProPrvNom ;
      AV120Tcalprowwds_15_tfalbproprvnom_sel = AV40TFAlbProPrvNom_Sel ;
      AV121Tcalprowwds_16_tfalbproclicod = AV41TFAlbProCliCod ;
      AV122Tcalprowwds_17_tfalbproclicod_to = AV42TFAlbProCliCod_To ;
      AV123Tcalprowwds_18_tfalbproclinom = AV43TFAlbProCliNom ;
      AV124Tcalprowwds_19_tfalbproclinom_sel = AV44TFAlbProCliNom_Sel ;
      AV125Tcalprowwds_20_tfalbprodomenv = AV45TFAlbProDomEnv ;
      AV126Tcalprowwds_21_tfalbprodomenv_to = AV46TFAlbProDomEnv_To ;
      AV127Tcalprowwds_22_tftrncod = AV47TFTrnCod ;
      AV128Tcalprowwds_23_tftrncod_to = AV48TFTrnCod_To ;
      AV129Tcalprowwds_24_tftrnnom = AV49TFTrnNom ;
      AV130Tcalprowwds_25_tftrnnom_sel = AV50TFTrnNom_Sel ;
      AV131Tcalprowwds_26_tfalbpromatricula = AV51TFAlbProMatricula ;
      AV132Tcalprowwds_27_tfalbpromatricula_sel = AV52TFAlbProMatricula_Sel ;
      AV133Tcalprowwds_28_tfalbproobs = AV53TFAlbProObs ;
      AV134Tcalprowwds_29_tfalbproobs_sel = AV54TFAlbProObs_Sel ;
      AV135Tcalprowwds_30_tfalbproidat = AV85TFAlbProIDAT ;
      AV136Tcalprowwds_31_tfalbproidat_sel = AV86TFAlbProIDAT_Sel ;
      AV137Tcalprowwds_32_tfalbprostat_sels = AV93TFAlbProStAT_Sels ;
      AV138Tcalprowwds_33_tfalbproanulado_sels = AV83TFAlbProAnulado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A13452AlbProInEx) ,
                                           AV109Tcalprowwds_4_tfalbproinex_sels ,
                                           A13417AlbProTipo ,
                                           AV110Tcalprowwds_5_tfalbprotipo_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV137Tcalprowwds_32_tfalbprostat_sels ,
                                           A13440AlbProAnul ,
                                           AV138Tcalprowwds_33_tfalbproanulado_sels ,
                                           Integer.valueOf(AV107Tcalprowwds_2_tfalbproid) ,
                                           Integer.valueOf(AV108Tcalprowwds_3_tfalbproid_to) ,
                                           Integer.valueOf(AV109Tcalprowwds_4_tfalbproinex_sels.size()) ,
                                           Integer.valueOf(AV110Tcalprowwds_5_tfalbprotipo_sels.size()) ,
                                           AV111Tcalprowwds_6_tfalbprodate ,
                                           AV112Tcalprowwds_7_tfalbprosal ,
                                           Short.valueOf(AV113Tcalprowwds_8_tfcatdocid) ,
                                           Short.valueOf(AV114Tcalprowwds_9_tfcatdocid_to) ,
                                           AV116Tcalprowwds_11_tfcatdocnom_sel ,
                                           AV115Tcalprowwds_10_tfcatdocnom ,
                                           Integer.valueOf(AV117Tcalprowwds_12_tfalbproprvid) ,
                                           Integer.valueOf(AV118Tcalprowwds_13_tfalbproprvid_to) ,
                                           AV120Tcalprowwds_15_tfalbproprvnom_sel ,
                                           AV119Tcalprowwds_14_tfalbproprvnom ,
                                           Integer.valueOf(AV121Tcalprowwds_16_tfalbproclicod) ,
                                           Integer.valueOf(AV122Tcalprowwds_17_tfalbproclicod_to) ,
                                           AV124Tcalprowwds_19_tfalbproclinom_sel ,
                                           AV123Tcalprowwds_18_tfalbproclinom ,
                                           Byte.valueOf(AV125Tcalprowwds_20_tfalbprodomenv) ,
                                           Byte.valueOf(AV126Tcalprowwds_21_tfalbprodomenv_to) ,
                                           Short.valueOf(AV127Tcalprowwds_22_tftrncod) ,
                                           Short.valueOf(AV128Tcalprowwds_23_tftrncod_to) ,
                                           AV130Tcalprowwds_25_tftrnnom_sel ,
                                           AV129Tcalprowwds_24_tftrnnom ,
                                           AV132Tcalprowwds_27_tfalbpromatricula_sel ,
                                           AV131Tcalprowwds_26_tfalbpromatricula ,
                                           AV134Tcalprowwds_29_tfalbproobs_sel ,
                                           AV133Tcalprowwds_28_tfalbproobs ,
                                           AV136Tcalprowwds_31_tfalbproidat_sel ,
                                           AV135Tcalprowwds_30_tfalbproidat ,
                                           Integer.valueOf(AV137Tcalprowwds_32_tfalbprostat_sels.size()) ,
                                           Integer.valueOf(AV138Tcalprowwds_33_tfalbproanulado_sels.size()) ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           A13430AlbProDate ,
                                           A13429AlbProSal ,
                                           Short.valueOf(A13453CatDocID) ,
                                           A13454CatDocNom ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13420AlbProPrvN ,
                                           Integer.valueOf(A13425AlbProCliC) ,
                                           A13426AlbProCliN ,
                                           Byte.valueOf(A13427AlbProDomE) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A13424AlbProMatr ,
                                           A13439AlbProObs ,
                                           A13436AlbProIDAT ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV106Tcalprowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV115Tcalprowwds_10_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV115Tcalprowwds_10_tfcatdocnom), 30, "%") ;
      lV119Tcalprowwds_14_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV119Tcalprowwds_14_tfalbproprvnom), 30, "%") ;
      lV123Tcalprowwds_18_tfalbproclinom = GXutil.padr( GXutil.rtrim( AV123Tcalprowwds_18_tfalbproclinom), 30, "%") ;
      lV129Tcalprowwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV129Tcalprowwds_24_tftrnnom), 30, "%") ;
      lV131Tcalprowwds_26_tfalbpromatricula = GXutil.padr( GXutil.rtrim( AV131Tcalprowwds_26_tfalbpromatricula), 30, "%") ;
      lV133Tcalprowwds_28_tfalbproobs = GXutil.concat( GXutil.rtrim( AV133Tcalprowwds_28_tfalbproobs), "%", "") ;
      lV135Tcalprowwds_30_tfalbproidat = GXutil.padr( GXutil.rtrim( AV135Tcalprowwds_30_tfalbproidat), 20, "%") ;
      /* Using cursor P091S2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV107Tcalprowwds_2_tfalbproid), Integer.valueOf(AV108Tcalprowwds_3_tfalbproid_to), AV111Tcalprowwds_6_tfalbprodate, AV112Tcalprowwds_7_tfalbprosal, Short.valueOf(AV113Tcalprowwds_8_tfcatdocid), Short.valueOf(AV114Tcalprowwds_9_tfcatdocid_to), lV115Tcalprowwds_10_tfcatdocnom, AV116Tcalprowwds_11_tfcatdocnom_sel, Integer.valueOf(AV117Tcalprowwds_12_tfalbproprvid), Integer.valueOf(AV118Tcalprowwds_13_tfalbproprvid_to), lV119Tcalprowwds_14_tfalbproprvnom, AV120Tcalprowwds_15_tfalbproprvnom_sel, Integer.valueOf(AV121Tcalprowwds_16_tfalbproclicod), Integer.valueOf(AV122Tcalprowwds_17_tfalbproclicod_to), lV123Tcalprowwds_18_tfalbproclinom, AV124Tcalprowwds_19_tfalbproclinom_sel, Byte.valueOf(AV125Tcalprowwds_20_tfalbprodomenv), Byte.valueOf(AV126Tcalprowwds_21_tfalbprodomenv_to), Short.valueOf(AV127Tcalprowwds_22_tftrncod), Short.valueOf(AV128Tcalprowwds_23_tftrncod_to), lV129Tcalprowwds_24_tftrnnom, AV130Tcalprowwds_25_tftrnnom_sel, lV131Tcalprowwds_26_tfalbpromatricula, AV132Tcalprowwds_27_tfalbpromatricula_sel, lV133Tcalprowwds_28_tfalbproobs, AV134Tcalprowwds_29_tfalbproobs_sel, lV135Tcalprowwds_30_tfalbproidat, AV136Tcalprowwds_31_tfalbproidat_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P091S2_A396EmprCod[0] ;
         A13440AlbProAnul = P091S2_A13440AlbProAnul[0] ;
         A13438AlbProStAT = P091S2_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P091S2_A13436AlbProIDAT[0] ;
         A13439AlbProObs = P091S2_A13439AlbProObs[0] ;
         A13424AlbProMatr = P091S2_A13424AlbProMatr[0] ;
         A841TrnNom = P091S2_A841TrnNom[0] ;
         n841TrnNom = P091S2_n841TrnNom[0] ;
         A840TrnCod = P091S2_A840TrnCod[0] ;
         n840TrnCod = P091S2_n840TrnCod[0] ;
         A13427AlbProDomE = P091S2_A13427AlbProDomE[0] ;
         A13426AlbProCliN = P091S2_A13426AlbProCliN[0] ;
         A13425AlbProCliC = P091S2_A13425AlbProCliC[0] ;
         A13420AlbProPrvN = P091S2_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091S2_n13420AlbProPrvN[0] ;
         A13419AlbProPrvI = P091S2_A13419AlbProPrvI[0] ;
         A13454CatDocNom = P091S2_A13454CatDocNom[0] ;
         n13454CatDocNom = P091S2_n13454CatDocNom[0] ;
         A13453CatDocID = P091S2_A13453CatDocID[0] ;
         n13453CatDocID = P091S2_n13453CatDocID[0] ;
         A13429AlbProSal = P091S2_A13429AlbProSal[0] ;
         A13430AlbProDate = P091S2_A13430AlbProDate[0] ;
         A13418AlbProID = P091S2_A13418AlbProID[0] ;
         A13417AlbProTipo = P091S2_A13417AlbProTipo[0] ;
         A13452AlbProInEx = P091S2_A13452AlbProInEx[0] ;
         A841TrnNom = P091S2_A841TrnNom[0] ;
         n841TrnNom = P091S2_n841TrnNom[0] ;
         A13426AlbProCliN = P091S2_A13426AlbProCliN[0] ;
         A13420AlbProPrvN = P091S2_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091S2_n13420AlbProPrvN[0] ;
         A13454CatDocNom = P091S2_A13454CatDocNom[0] ;
         n13454CatDocNom = P091S2_n13454CatDocNom[0] ;
         if ( (GXutil.strcmp("", AV106Tcalprowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A13418AlbProID, 8, 0) , GXutil.padr( "%" + AV106Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV106Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado externo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV106Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proveedor", ""), "") , GXutil.padr( "%" + GXutil.lower( AV106Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cliente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV106Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A13453CatDocID, 4, 0) , GXutil.padr( "%" + AV106Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13454CatDocNom) , GXutil.padr( "%" + GXutil.upper( AV106Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13419AlbProPrvI, 6, 0) , GXutil.padr( "%" + AV106Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13420AlbProPrvN) , GXutil.padr( "%" + GXutil.upper( AV106Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13425AlbProCliC, 6, 0) , GXutil.padr( "%" + AV106Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13426AlbProCliN) , GXutil.padr( "%" + GXutil.upper( AV106Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13427AlbProDomE, 1, 0) , GXutil.padr( "%" + AV106Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV106Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV106Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13424AlbProMatr) , GXutil.padr( "%" + GXutil.upper( AV106Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13439AlbProObs) , GXutil.padr( "%" + GXutil.upper( AV106Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13436AlbProIDAT) , GXutil.padr( "%" + GXutil.upper( AV106Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13438AlbProStAT, 1, 0) , GXutil.padr( "%" + AV106Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13440AlbProAnul) , GXutil.padr( "%" + GXutil.upper( AV106Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13AlbProInExDescription = "" ;
            if ( A13452AlbProInEx == 1 )
            {
               AV13AlbProInExDescription = httpContext.getMessage( "Mercado Interno", "") ;
            }
            else if ( A13452AlbProInEx == 2 )
            {
               AV13AlbProInExDescription = httpContext.getMessage( "Mercado Externo", "") ;
            }
            AV14AlbProTipoDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A13417AlbProTipo), "P") == 0 )
            {
               AV14AlbProTipoDescription = httpContext.getMessage( "Proveedor", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A13417AlbProTipo), "C") == 0 )
            {
               AV14AlbProTipoDescription = httpContext.getMessage( "Cliente", "") ;
            }
            AV90AlbProStATDescription = "" ;
            if ( A13438AlbProStAT == 0 )
            {
               AV90AlbProStATDescription = httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( A13438AlbProStAT == 3 )
            {
               AV90AlbProStATDescription = httpContext.getMessage( "Enviada", "") ;
            }
            AV80AlbProAnuladoDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A13440AlbProAnul), "") == 0 )
            {
               AV80AlbProAnuladoDescription = httpContext.getMessage( "Activo", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A13440AlbProAnul), "A") == 0 )
            {
               AV80AlbProAnuladoDescription = httpContext.getMessage( "Anulado", "") ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            h91S0( false, 66) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9")), 30, Gx_line+10, 66, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13AlbProInExDescription, "")), 70, Gx_line+10, 106, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14AlbProTipoDescription, "")), 110, Gx_line+10, 146, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A13430AlbProDate, "99/99/99"), 150, Gx_line+10, 186, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A13429AlbProSal, "99/99/99 99:99"), 190, Gx_line+10, 226, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13453CatDocID), "ZZZ9")), 230, Gx_line+10, 266, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13454CatDocNom, "")), 270, Gx_line+10, 306, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13419AlbProPrvI), "ZZZZZ9")), 310, Gx_line+10, 346, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13420AlbProPrvN, "")), 350, Gx_line+10, 386, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13425AlbProCliC), "ZZZZZ9")), 390, Gx_line+10, 426, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13426AlbProCliN, "")), 430, Gx_line+10, 466, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13427AlbProDomE), "9")), 470, Gx_line+10, 506, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 510, Gx_line+10, 546, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 550, Gx_line+10, 586, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13424AlbProMatr, "")), 590, Gx_line+10, 626, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13439AlbProObs, "")), 630, Gx_line+10, 666, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13436AlbProIDAT, "")), 670, Gx_line+10, 706, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90AlbProStATDescription, "")), 710, Gx_line+10, 746, Gx_line+55, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80AlbProAnuladoDescription, "")), 750, Gx_line+10, 787, Gx_line+55, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(28, Gx_line+65, 789, Gx_line+65, 1, 220, 220, 220, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+66) ;
            /* Execute user subroutine: 'AFTERPRINTLINE' */
            S161 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV15Session.getValue("TCALPROWWGridState"), "") == 0 )
      {
         AV17GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TCALPROWWGridState"), null, null);
      }
      else
      {
         AV17GridState.fromxml(AV15Session.getValue("TCALPROWWGridState"), null, null);
      }
      AV10OrderedBy = AV17GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV17GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV139GXV5 = 1 ;
      while ( AV139GXV5 <= AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV139GXV5));
         if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROID") == 0 )
         {
            AV19TFAlbProID = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV20TFAlbProID_To = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROINEX_SEL") == 0 )
         {
            AV21TFAlbProInEx_SelsJson = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV23TFAlbProInEx_Sels.fromJSonString(AV21TFAlbProInEx_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROTIPO_SEL") == 0 )
         {
            AV25TFAlbProTipo_SelsJson = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV27TFAlbProTipo_Sels.fromJSonString(AV25TFAlbProTipo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODATE") == 0 )
         {
            AV29TFAlbProDate = localUtil.ctod( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSAL") == 0 )
         {
            AV31TFAlbProSal = localUtil.ctot( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCID") == 0 )
         {
            AV33TFCatDocID = (short)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFCatDocID_To = (short)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCNOM") == 0 )
         {
            AV35TFCatDocNom = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCNOM_SEL") == 0 )
         {
            AV36TFCatDocNom_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVID") == 0 )
         {
            AV37TFAlbProPrvID = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFAlbProPrvID_To = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM") == 0 )
         {
            AV39TFAlbProPrvNom = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM_SEL") == 0 )
         {
            AV40TFAlbProPrvNom_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLICOD") == 0 )
         {
            AV41TFAlbProCliCod = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFAlbProCliCod_To = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLINOM") == 0 )
         {
            AV43TFAlbProCliNom = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLINOM_SEL") == 0 )
         {
            AV44TFAlbProCliNom_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODOMENV") == 0 )
         {
            AV45TFAlbProDomEnv = (byte)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFAlbProDomEnv_To = (byte)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV47TFTrnCod = (short)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFTrnCod_To = (short)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV49TFTrnNom = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV50TFTrnNom_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROMATRICULA") == 0 )
         {
            AV51TFAlbProMatricula = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROMATRICULA_SEL") == 0 )
         {
            AV52TFAlbProMatricula_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROOBS") == 0 )
         {
            AV53TFAlbProObs = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROOBS_SEL") == 0 )
         {
            AV54TFAlbProObs_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT") == 0 )
         {
            AV85TFAlbProIDAT = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT_SEL") == 0 )
         {
            AV86TFAlbProIDAT_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSTAT_SEL") == 0 )
         {
            AV91TFAlbProStAT_SelsJson = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV93TFAlbProStAT_Sels.fromJSonString(AV91TFAlbProStAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROANULADO_SEL") == 0 )
         {
            AV81TFAlbProAnulado_SelsJson = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV83TFAlbProAnulado_Sels.fromJSonString(AV81TFAlbProAnulado_SelsJson, null);
         }
         AV139GXV5 = (int)(AV139GXV5+1) ;
      }
   }

   public void S144( ) throws ProcessInterruptedException
   {
      /* 'BEFOREPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'AFTERPRINTLINE' Routine */
      returnInSub = false ;
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'PRINTFOOTER' Routine */
      returnInSub = false ;
   }

   public void h91S0( boolean bFoot ,
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
               AV74PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV71DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+40) ;
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
            AV76Title = AV98Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+128) ;
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
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
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
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV76Title = "" ;
      AV12FilterFullText = "" ;
      AV55TFAlbProID_To_Description = "" ;
      AV23TFAlbProInEx_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV21TFAlbProInEx_SelsJson = "" ;
      AV22TFAlbProInEx_SelDscs = "" ;
      AV56FilterTFAlbProInEx_SelValueDescription = "" ;
      AV27TFAlbProTipo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV25TFAlbProTipo_SelsJson = "" ;
      AV28TFAlbProTipo_Sel = "" ;
      AV26TFAlbProTipo_SelDscs = "" ;
      AV57FilterTFAlbProTipo_SelValueDescription = "" ;
      AV29TFAlbProDate = GXutil.nullDate() ;
      AV31TFAlbProSal = GXutil.resetTime( GXutil.nullDate() );
      AV60TFCatDocID_To_Description = "" ;
      AV36TFCatDocNom_Sel = "" ;
      AV35TFCatDocNom = "" ;
      AV61TFAlbProPrvID_To_Description = "" ;
      AV40TFAlbProPrvNom_Sel = "" ;
      AV39TFAlbProPrvNom = "" ;
      AV62TFAlbProCliCod_To_Description = "" ;
      AV44TFAlbProCliNom_Sel = "" ;
      AV43TFAlbProCliNom = "" ;
      AV63TFAlbProDomEnv_To_Description = "" ;
      AV64TFTrnCod_To_Description = "" ;
      AV50TFTrnNom_Sel = "" ;
      AV49TFTrnNom = "" ;
      AV52TFAlbProMatricula_Sel = "" ;
      AV51TFAlbProMatricula = "" ;
      AV54TFAlbProObs_Sel = "" ;
      AV53TFAlbProObs = "" ;
      AV86TFAlbProIDAT_Sel = "" ;
      AV85TFAlbProIDAT = "" ;
      AV93TFAlbProStAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV91TFAlbProStAT_SelsJson = "" ;
      AV92TFAlbProStAT_SelDscs = "" ;
      AV95FilterTFAlbProStAT_SelValueDescription = "" ;
      AV83TFAlbProAnulado_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV81TFAlbProAnulado_SelsJson = "" ;
      AV79TFAlbProAnulado_Sel = "" ;
      AV82TFAlbProAnulado_SelDscs = "" ;
      AV84FilterTFAlbProAnulado_SelValueDescription = "" ;
      A13417AlbProTipo = "" ;
      A13440AlbProAnul = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      A13454CatDocNom = "" ;
      A13420AlbProPrvN = "" ;
      A13426AlbProCliN = "" ;
      A841TrnNom = "" ;
      A13424AlbProMatr = "" ;
      A13439AlbProObs = "" ;
      A13436AlbProIDAT = "" ;
      AV106Tcalprowwds_1_filterfulltext = "" ;
      AV109Tcalprowwds_4_tfalbproinex_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV110Tcalprowwds_5_tfalbprotipo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV111Tcalprowwds_6_tfalbprodate = GXutil.nullDate() ;
      AV112Tcalprowwds_7_tfalbprosal = GXutil.resetTime( GXutil.nullDate() );
      AV115Tcalprowwds_10_tfcatdocnom = "" ;
      AV116Tcalprowwds_11_tfcatdocnom_sel = "" ;
      AV119Tcalprowwds_14_tfalbproprvnom = "" ;
      AV120Tcalprowwds_15_tfalbproprvnom_sel = "" ;
      AV123Tcalprowwds_18_tfalbproclinom = "" ;
      AV124Tcalprowwds_19_tfalbproclinom_sel = "" ;
      AV129Tcalprowwds_24_tftrnnom = "" ;
      AV130Tcalprowwds_25_tftrnnom_sel = "" ;
      AV131Tcalprowwds_26_tfalbpromatricula = "" ;
      AV132Tcalprowwds_27_tfalbpromatricula_sel = "" ;
      AV133Tcalprowwds_28_tfalbproobs = "" ;
      AV134Tcalprowwds_29_tfalbproobs_sel = "" ;
      AV135Tcalprowwds_30_tfalbproidat = "" ;
      AV136Tcalprowwds_31_tfalbproidat_sel = "" ;
      AV137Tcalprowwds_32_tfalbprostat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV138Tcalprowwds_33_tfalbproanulado_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      lV106Tcalprowwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV115Tcalprowwds_10_tfcatdocnom = "" ;
      lV119Tcalprowwds_14_tfalbproprvnom = "" ;
      lV123Tcalprowwds_18_tfalbproclinom = "" ;
      lV129Tcalprowwds_24_tftrnnom = "" ;
      lV131Tcalprowwds_26_tfalbpromatricula = "" ;
      lV133Tcalprowwds_28_tfalbproobs = "" ;
      lV135Tcalprowwds_30_tfalbproidat = "" ;
      P091S2_A396EmprCod = new String[] {""} ;
      P091S2_A13440AlbProAnul = new String[] {""} ;
      P091S2_A13438AlbProStAT = new byte[1] ;
      P091S2_A13436AlbProIDAT = new String[] {""} ;
      P091S2_A13439AlbProObs = new String[] {""} ;
      P091S2_A13424AlbProMatr = new String[] {""} ;
      P091S2_A841TrnNom = new String[] {""} ;
      P091S2_n841TrnNom = new boolean[] {false} ;
      P091S2_A840TrnCod = new short[1] ;
      P091S2_n840TrnCod = new boolean[] {false} ;
      P091S2_A13427AlbProDomE = new byte[1] ;
      P091S2_A13426AlbProCliN = new String[] {""} ;
      P091S2_A13425AlbProCliC = new int[1] ;
      P091S2_A13420AlbProPrvN = new String[] {""} ;
      P091S2_n13420AlbProPrvN = new boolean[] {false} ;
      P091S2_A13419AlbProPrvI = new int[1] ;
      P091S2_A13454CatDocNom = new String[] {""} ;
      P091S2_n13454CatDocNom = new boolean[] {false} ;
      P091S2_A13453CatDocID = new short[1] ;
      P091S2_n13453CatDocID = new boolean[] {false} ;
      P091S2_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P091S2_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P091S2_A13418AlbProID = new int[1] ;
      P091S2_A13417AlbProTipo = new String[] {""} ;
      P091S2_A13452AlbProInEx = new byte[1] ;
      A396EmprCod = "" ;
      AV13AlbProInExDescription = "" ;
      AV14AlbProTipoDescription = "" ;
      AV90AlbProStATDescription = "" ;
      AV80AlbProAnuladoDescription = "" ;
      AV15Session = httpContext.getWebSession();
      AV17GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV18GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV74PageInfo = "" ;
      AV71DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV98Pgmdesc = "" ;
      AV69AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcalprowwexportreport__default(),
         new Object[] {
             new Object[] {
            P091S2_A396EmprCod, P091S2_A13440AlbProAnul, P091S2_A13438AlbProStAT, P091S2_A13436AlbProIDAT, P091S2_A13439AlbProObs, P091S2_A13424AlbProMatr, P091S2_A841TrnNom, P091S2_n841TrnNom, P091S2_A840TrnCod, P091S2_n840TrnCod,
            P091S2_A13427AlbProDomE, P091S2_A13426AlbProCliN, P091S2_A13425AlbProCliC, P091S2_A13420AlbProPrvN, P091S2_n13420AlbProPrvN, P091S2_A13419AlbProPrvI, P091S2_A13454CatDocNom, P091S2_n13454CatDocNom, P091S2_A13453CatDocID, P091S2_n13453CatDocID,
            P091S2_A13429AlbProSal, P091S2_A13430AlbProDate, P091S2_A13418AlbProID, P091S2_A13417AlbProTipo, P091S2_A13452AlbProInEx
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV98Pgmdesc = httpContext.getMessage( "TCALPROWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV98Pgmdesc = httpContext.getMessage( "TCALPROWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV24TFAlbProInEx_Sel ;
   private byte AV45TFAlbProDomEnv ;
   private byte AV46TFAlbProDomEnv_To ;
   private byte AV94TFAlbProStAT_Sel ;
   private byte A13452AlbProInEx ;
   private byte A13438AlbProStAT ;
   private byte A13427AlbProDomE ;
   private byte AV125Tcalprowwds_20_tfalbprodomenv ;
   private byte AV126Tcalprowwds_21_tfalbprodomenv_to ;
   private short gxcookieaux ;
   private short AV33TFCatDocID ;
   private short AV34TFCatDocID_To ;
   private short AV47TFTrnCod ;
   private short AV48TFTrnCod_To ;
   private short A13453CatDocID ;
   private short A840TrnCod ;
   private short AV113Tcalprowwds_8_tfcatdocid ;
   private short AV114Tcalprowwds_9_tfcatdocid_to ;
   private short AV127Tcalprowwds_22_tftrncod ;
   private short AV128Tcalprowwds_23_tftrncod_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV19TFAlbProID ;
   private int AV20TFAlbProID_To ;
   private int AV101GXV1 ;
   private int AV102GXV2 ;
   private int AV37TFAlbProPrvID ;
   private int AV38TFAlbProPrvID_To ;
   private int AV41TFAlbProCliCod ;
   private int AV42TFAlbProCliCod_To ;
   private int AV103GXV3 ;
   private int AV104GXV4 ;
   private int A13418AlbProID ;
   private int A13419AlbProPrvI ;
   private int A13425AlbProCliC ;
   private int AV107Tcalprowwds_2_tfalbproid ;
   private int AV108Tcalprowwds_3_tfalbproid_to ;
   private int AV117Tcalprowwds_12_tfalbproprvid ;
   private int AV118Tcalprowwds_13_tfalbproprvid_to ;
   private int AV121Tcalprowwds_16_tfalbproclicod ;
   private int AV122Tcalprowwds_17_tfalbproclicod_to ;
   private int AV109Tcalprowwds_4_tfalbproinex_sels_size ;
   private int AV110Tcalprowwds_5_tfalbprotipo_sels_size ;
   private int AV137Tcalprowwds_32_tfalbprostat_sels_size ;
   private int AV138Tcalprowwds_33_tfalbproanulado_sels_size ;
   private int AV139GXV5 ;
   private long AV65i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV28TFAlbProTipo_Sel ;
   private String AV36TFCatDocNom_Sel ;
   private String AV35TFCatDocNom ;
   private String AV40TFAlbProPrvNom_Sel ;
   private String AV39TFAlbProPrvNom ;
   private String AV44TFAlbProCliNom_Sel ;
   private String AV43TFAlbProCliNom ;
   private String AV50TFTrnNom_Sel ;
   private String AV49TFTrnNom ;
   private String AV52TFAlbProMatricula_Sel ;
   private String AV51TFAlbProMatricula ;
   private String AV86TFAlbProIDAT_Sel ;
   private String AV85TFAlbProIDAT ;
   private String AV79TFAlbProAnulado_Sel ;
   private String A13417AlbProTipo ;
   private String A13440AlbProAnul ;
   private String A13454CatDocNom ;
   private String A13420AlbProPrvN ;
   private String A13426AlbProCliN ;
   private String A841TrnNom ;
   private String A13424AlbProMatr ;
   private String A13436AlbProIDAT ;
   private String AV115Tcalprowwds_10_tfcatdocnom ;
   private String AV116Tcalprowwds_11_tfcatdocnom_sel ;
   private String AV119Tcalprowwds_14_tfalbproprvnom ;
   private String AV120Tcalprowwds_15_tfalbproprvnom_sel ;
   private String AV123Tcalprowwds_18_tfalbproclinom ;
   private String AV124Tcalprowwds_19_tfalbproclinom_sel ;
   private String AV129Tcalprowwds_24_tftrnnom ;
   private String AV130Tcalprowwds_25_tftrnnom_sel ;
   private String AV131Tcalprowwds_26_tfalbpromatricula ;
   private String AV132Tcalprowwds_27_tfalbpromatricula_sel ;
   private String AV135Tcalprowwds_30_tfalbproidat ;
   private String AV136Tcalprowwds_31_tfalbproidat_sel ;
   private String scmdbuf ;
   private String lV115Tcalprowwds_10_tfcatdocnom ;
   private String lV119Tcalprowwds_14_tfalbproprvnom ;
   private String lV123Tcalprowwds_18_tfalbproclinom ;
   private String lV129Tcalprowwds_24_tftrnnom ;
   private String lV131Tcalprowwds_26_tfalbpromatricula ;
   private String lV135Tcalprowwds_30_tfalbproidat ;
   private String A396EmprCod ;
   private String AV98Pgmdesc ;
   private java.util.Date AV31TFAlbProSal ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date AV112Tcalprowwds_7_tfalbprosal ;
   private java.util.Date AV29TFAlbProDate ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date AV111Tcalprowwds_6_tfalbprodate ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n13420AlbProPrvN ;
   private boolean n13454CatDocNom ;
   private boolean n13453CatDocID ;
   private String AV21TFAlbProInEx_SelsJson ;
   private String AV25TFAlbProTipo_SelsJson ;
   private String AV91TFAlbProStAT_SelsJson ;
   private String AV81TFAlbProAnulado_SelsJson ;
   private String AV76Title ;
   private String AV12FilterFullText ;
   private String AV55TFAlbProID_To_Description ;
   private String AV22TFAlbProInEx_SelDscs ;
   private String AV56FilterTFAlbProInEx_SelValueDescription ;
   private String AV26TFAlbProTipo_SelDscs ;
   private String AV57FilterTFAlbProTipo_SelValueDescription ;
   private String AV60TFCatDocID_To_Description ;
   private String AV61TFAlbProPrvID_To_Description ;
   private String AV62TFAlbProCliCod_To_Description ;
   private String AV63TFAlbProDomEnv_To_Description ;
   private String AV64TFTrnCod_To_Description ;
   private String AV54TFAlbProObs_Sel ;
   private String AV53TFAlbProObs ;
   private String AV92TFAlbProStAT_SelDscs ;
   private String AV95FilterTFAlbProStAT_SelValueDescription ;
   private String AV82TFAlbProAnulado_SelDscs ;
   private String AV84FilterTFAlbProAnulado_SelValueDescription ;
   private String A13439AlbProObs ;
   private String AV106Tcalprowwds_1_filterfulltext ;
   private String AV133Tcalprowwds_28_tfalbproobs ;
   private String AV134Tcalprowwds_29_tfalbproobs_sel ;
   private String lV106Tcalprowwds_1_filterfulltext ;
   private String lV133Tcalprowwds_28_tfalbproobs ;
   private String AV13AlbProInExDescription ;
   private String AV14AlbProTipoDescription ;
   private String AV90AlbProStATDescription ;
   private String AV80AlbProAnuladoDescription ;
   private String AV74PageInfo ;
   private String AV71DateInfo ;
   private String AV69AppName ;
   private GXSimpleCollection<Byte> AV23TFAlbProInEx_Sels ;
   private GXSimpleCollection<Byte> AV93TFAlbProStAT_Sels ;
   private GXSimpleCollection<Byte> AV109Tcalprowwds_4_tfalbproinex_sels ;
   private GXSimpleCollection<Byte> AV137Tcalprowwds_32_tfalbprostat_sels ;
   private com.genexus.webpanels.WebSession AV15Session ;
   private IDataStoreProvider pr_default ;
   private String[] P091S2_A396EmprCod ;
   private String[] P091S2_A13440AlbProAnul ;
   private byte[] P091S2_A13438AlbProStAT ;
   private String[] P091S2_A13436AlbProIDAT ;
   private String[] P091S2_A13439AlbProObs ;
   private String[] P091S2_A13424AlbProMatr ;
   private String[] P091S2_A841TrnNom ;
   private boolean[] P091S2_n841TrnNom ;
   private short[] P091S2_A840TrnCod ;
   private boolean[] P091S2_n840TrnCod ;
   private byte[] P091S2_A13427AlbProDomE ;
   private String[] P091S2_A13426AlbProCliN ;
   private int[] P091S2_A13425AlbProCliC ;
   private String[] P091S2_A13420AlbProPrvN ;
   private boolean[] P091S2_n13420AlbProPrvN ;
   private int[] P091S2_A13419AlbProPrvI ;
   private String[] P091S2_A13454CatDocNom ;
   private boolean[] P091S2_n13454CatDocNom ;
   private short[] P091S2_A13453CatDocID ;
   private boolean[] P091S2_n13453CatDocID ;
   private java.util.Date[] P091S2_A13429AlbProSal ;
   private java.util.Date[] P091S2_A13430AlbProDate ;
   private int[] P091S2_A13418AlbProID ;
   private String[] P091S2_A13417AlbProTipo ;
   private byte[] P091S2_A13452AlbProInEx ;
   private GXSimpleCollection<String> AV27TFAlbProTipo_Sels ;
   private GXSimpleCollection<String> AV83TFAlbProAnulado_Sels ;
   private GXSimpleCollection<String> AV110Tcalprowwds_5_tfalbprotipo_sels ;
   private GXSimpleCollection<String> AV138Tcalprowwds_33_tfalbproanulado_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV17GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV18GridStateFilterValue ;
}

final  class tcalprowwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P091S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13452AlbProInEx ,
                                          GXSimpleCollection<Byte> AV109Tcalprowwds_4_tfalbproinex_sels ,
                                          String A13417AlbProTipo ,
                                          GXSimpleCollection<String> AV110Tcalprowwds_5_tfalbprotipo_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV137Tcalprowwds_32_tfalbprostat_sels ,
                                          String A13440AlbProAnul ,
                                          GXSimpleCollection<String> AV138Tcalprowwds_33_tfalbproanulado_sels ,
                                          int AV107Tcalprowwds_2_tfalbproid ,
                                          int AV108Tcalprowwds_3_tfalbproid_to ,
                                          int AV109Tcalprowwds_4_tfalbproinex_sels_size ,
                                          int AV110Tcalprowwds_5_tfalbprotipo_sels_size ,
                                          java.util.Date AV111Tcalprowwds_6_tfalbprodate ,
                                          java.util.Date AV112Tcalprowwds_7_tfalbprosal ,
                                          short AV113Tcalprowwds_8_tfcatdocid ,
                                          short AV114Tcalprowwds_9_tfcatdocid_to ,
                                          String AV116Tcalprowwds_11_tfcatdocnom_sel ,
                                          String AV115Tcalprowwds_10_tfcatdocnom ,
                                          int AV117Tcalprowwds_12_tfalbproprvid ,
                                          int AV118Tcalprowwds_13_tfalbproprvid_to ,
                                          String AV120Tcalprowwds_15_tfalbproprvnom_sel ,
                                          String AV119Tcalprowwds_14_tfalbproprvnom ,
                                          int AV121Tcalprowwds_16_tfalbproclicod ,
                                          int AV122Tcalprowwds_17_tfalbproclicod_to ,
                                          String AV124Tcalprowwds_19_tfalbproclinom_sel ,
                                          String AV123Tcalprowwds_18_tfalbproclinom ,
                                          byte AV125Tcalprowwds_20_tfalbprodomenv ,
                                          byte AV126Tcalprowwds_21_tfalbprodomenv_to ,
                                          short AV127Tcalprowwds_22_tftrncod ,
                                          short AV128Tcalprowwds_23_tftrncod_to ,
                                          String AV130Tcalprowwds_25_tftrnnom_sel ,
                                          String AV129Tcalprowwds_24_tftrnnom ,
                                          String AV132Tcalprowwds_27_tfalbpromatricula_sel ,
                                          String AV131Tcalprowwds_26_tfalbpromatricula ,
                                          String AV134Tcalprowwds_29_tfalbproobs_sel ,
                                          String AV133Tcalprowwds_28_tfalbproobs ,
                                          String AV136Tcalprowwds_31_tfalbproidat_sel ,
                                          String AV135Tcalprowwds_30_tfalbproidat ,
                                          int AV137Tcalprowwds_32_tfalbprostat_sels_size ,
                                          int AV138Tcalprowwds_33_tfalbproanulado_sels_size ,
                                          int A13418AlbProID ,
                                          java.util.Date A13430AlbProDate ,
                                          java.util.Date A13429AlbProSal ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom ,
                                          int A13419AlbProPrvI ,
                                          String A13420AlbProPrvN ,
                                          int A13425AlbProCliC ,
                                          String A13426AlbProCliN ,
                                          byte A13427AlbProDomE ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A13424AlbProMatr ,
                                          String A13439AlbProObs ,
                                          String A13436AlbProIDAT ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV106Tcalprowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[28];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProAnul, T1.AlbProStAT, T1.AlbProIDAT, T1.AlbProObs, T1.AlbProMatr, T2.TrnNom, T1.TrnCod, T1.AlbProDomE, T3.CliNom AS AlbProCliN, T1.AlbProCliC" ;
      scmdbuf += " AS AlbProCliC, T4.PrvNom AS AlbProPrvN, T1.AlbProPrvI AS AlbProPrvI, T5.CatDocNom, T1.CatDocID, T1.AlbProSal, T1.AlbProDate, T1.AlbProID, T1.AlbProTipo, T1.AlbProInEx" ;
      scmdbuf += " FROM ((((TXPCALPRO T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.AlbProCliC) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.AlbProPrvI) LEFT JOIN TXPCATDOC T5 ON T5.EmprCod = T1.EmprCod AND T5.CatDocID" ;
      scmdbuf += " = T1.CatDocID)" ;
      if ( ! (0==AV107Tcalprowwds_2_tfalbproid) )
      {
         addWhere(sWhereString, "(T1.AlbProID >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV108Tcalprowwds_3_tfalbproid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProID <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( AV109Tcalprowwds_4_tfalbproinex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Tcalprowwds_4_tfalbproinex_sels, "T1.AlbProInEx IN (", ")")+")");
      }
      if ( AV110Tcalprowwds_5_tfalbprotipo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Tcalprowwds_5_tfalbprotipo_sels, "T1.AlbProTipo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Tcalprowwds_6_tfalbprodate)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV112Tcalprowwds_7_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV113Tcalprowwds_8_tfcatdocid) )
      {
         addWhere(sWhereString, "(T1.CatDocID >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV114Tcalprowwds_9_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(T1.CatDocID <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Tcalprowwds_11_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV115Tcalprowwds_10_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Tcalprowwds_11_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CatDocNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV117Tcalprowwds_12_tfalbproprvid) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV118Tcalprowwds_13_tfalbproprvid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Tcalprowwds_15_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV119Tcalprowwds_14_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Tcalprowwds_15_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV121Tcalprowwds_16_tfalbproclicod) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV122Tcalprowwds_17_tfalbproclicod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Tcalprowwds_19_tfalbproclinom_sel)==0) && ( ! (GXutil.strcmp("", AV123Tcalprowwds_18_tfalbproclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Tcalprowwds_19_tfalbproclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV125Tcalprowwds_20_tfalbprodomenv) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV126Tcalprowwds_21_tfalbprodomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV127Tcalprowwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV128Tcalprowwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Tcalprowwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV129Tcalprowwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tcalprowwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Tcalprowwds_27_tfalbpromatricula_sel)==0) && ( ! (GXutil.strcmp("", AV131Tcalprowwds_26_tfalbpromatricula)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProMatr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Tcalprowwds_27_tfalbpromatricula_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProMatr = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Tcalprowwds_29_tfalbproobs_sel)==0) && ( ! (GXutil.strcmp("", AV133Tcalprowwds_28_tfalbproobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Tcalprowwds_29_tfalbproobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProObs = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Tcalprowwds_31_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV135Tcalprowwds_30_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tcalprowwds_31_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( AV137Tcalprowwds_32_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV137Tcalprowwds_32_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( AV138Tcalprowwds_33_tfalbproanulado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV138Tcalprowwds_33_tfalbproanulado_sels, "T1.AlbProAnul IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProID" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProID DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProInEx" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProInEx DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProTipo" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProTipo DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProDate" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProDate DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProSal" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProSal DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CatDocID" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CatDocID DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CatDocNom" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CatDocNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProPrvI" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProPrvI DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PrvNom" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PrvNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCliC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCliC DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProDomE" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProDomE DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProMatr" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProMatr DESC" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProObs" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProObs DESC" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProIDAT" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProIDAT DESC" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProStAT" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProStAT DESC" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProAnul" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProAnul DESC" ;
      }
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P091S2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Boolean) dynConstraints[56]).booleanValue() , (String)dynConstraints[57] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091S2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               return;
      }
   }

}

