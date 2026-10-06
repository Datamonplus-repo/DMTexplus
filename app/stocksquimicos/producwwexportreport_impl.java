package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class producwwexportreport_impl extends GXWebReport
{
   public producwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV31Title = httpContext.getMessage( "Lista de Mantenimiento Productos Quimicos", "") ;
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
         h8VH0( true, 0) ;
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
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV18TFPrdNom_Sel)==0) )
      {
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18TFPrdNom_Sel, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV17TFPrdNom)==0) )
         {
            h8VH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17TFPrdNom, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV20TFPrdNum_Sel)==0) )
      {
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFPrdNum_Sel, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFPrdNum)==0) )
         {
            h8VH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFPrdNum, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFPrdAox)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPrdAox_To)==0) ) )
      {
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "AOX (adsorbable organic halogens)", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TFPrdAox, "ZZ9.99")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV62TFPrdAox_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "AOX (adsorbable organic halogens)", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFPrdAox_To_Description, "")), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37TFPrdAox_To, "ZZ9.99")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV39TFPrdGots_Sel)==0) )
      {
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "GOTS", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFPrdGots_Sel, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV38TFPrdGots)==0) )
         {
            h8VH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "GOTS", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFPrdGots, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV41TFPrdReach_Sel)==0) )
      {
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "REACH", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFPrdReach_Sel, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV40TFPrdReach)==0) )
         {
            h8VH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "REACH", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFPrdReach, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV44TFPrdOkotex_Sels.fromJSonString(AV42TFPrdOkotex_SelsJson, null);
      if ( ! ( AV44TFPrdOkotex_Sels.size() == 0 ) )
      {
         AV67i = 1 ;
         AV75GXV1 = 1 ;
         while ( AV75GXV1 <= AV44TFPrdOkotex_Sels.size() )
         {
            AV45TFPrdOkotex_Sel = (String)AV44TFPrdOkotex_Sels.elementAt(-1+AV75GXV1) ;
            if ( AV67i == 1 )
            {
               AV43TFPrdOkotex_SelDscs = "" ;
            }
            else
            {
               AV43TFPrdOkotex_SelDscs += ", " ;
            }
            AV63FilterTFPrdOkotex_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV45TFPrdOkotex_Sel), "N") == 0 )
            {
               AV63FilterTFPrdOkotex_SelValueDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV45TFPrdOkotex_Sel), "S") == 0 )
            {
               AV63FilterTFPrdOkotex_SelValueDescription = httpContext.getMessage( "S", "") ;
            }
            AV43TFPrdOkotex_SelDscs += AV63FilterTFPrdOkotex_SelValueDescription ;
            AV67i = (long)(AV67i+1) ;
            AV75GXV1 = (int)(AV75GXV1+1) ;
         }
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Oeko Tex", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFPrdOkotex_SelDscs, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFPrdHm_Sel)==0) )
      {
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "HM", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFPrdHm_Sel, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFPrdHm)==0) )
         {
            h8VH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "HM", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFPrdHm, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV50TFPrdZDHC_Sels.fromJSonString(AV48TFPrdZDHC_SelsJson, null);
      if ( ! ( AV50TFPrdZDHC_Sels.size() == 0 ) )
      {
         AV67i = 1 ;
         AV76GXV2 = 1 ;
         while ( AV76GXV2 <= AV50TFPrdZDHC_Sels.size() )
         {
            AV51TFPrdZDHC_Sel = (String)AV50TFPrdZDHC_Sels.elementAt(-1+AV76GXV2) ;
            if ( AV67i == 1 )
            {
               AV49TFPrdZDHC_SelDscs = "" ;
            }
            else
            {
               AV49TFPrdZDHC_SelDscs += ", " ;
            }
            AV64FilterTFPrdZDHC_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV51TFPrdZDHC_Sel), "N") == 0 )
            {
               AV64FilterTFPrdZDHC_SelValueDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV51TFPrdZDHC_Sel), "1") == 0 )
            {
               AV64FilterTFPrdZDHC_SelValueDescription = httpContext.getMessage( "Nivel 1", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV51TFPrdZDHC_Sel), "2") == 0 )
            {
               AV64FilterTFPrdZDHC_SelValueDescription = httpContext.getMessage( "Nivel 2", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV51TFPrdZDHC_Sel), "3") == 0 )
            {
               AV64FilterTFPrdZDHC_SelValueDescription = httpContext.getMessage( "Nivel 3", "") ;
            }
            AV49TFPrdZDHC_SelDscs += AV64FilterTFPrdZDHC_SelValueDescription ;
            AV67i = (long)(AV67i+1) ;
            AV76GXV2 = (int)(AV76GXV2+1) ;
         }
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "ZDHC", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFPrdZDHC_SelDscs, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV54TFPrdList_Sels.fromJSonString(AV52TFPrdList_SelsJson, null);
      if ( ! ( AV54TFPrdList_Sels.size() == 0 ) )
      {
         AV67i = 1 ;
         AV77GXV3 = 1 ;
         while ( AV77GXV3 <= AV54TFPrdList_Sels.size() )
         {
            AV55TFPrdList_Sel = (String)AV54TFPrdList_Sels.elementAt(-1+AV77GXV3) ;
            if ( AV67i == 1 )
            {
               AV53TFPrdList_SelDscs = "" ;
            }
            else
            {
               AV53TFPrdList_SelDscs += ", " ;
            }
            AV65FilterTFPrdList_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV55TFPrdList_Sel), "S") == 0 )
            {
               AV65FilterTFPrdList_SelValueDescription = httpContext.getMessage( "S", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV55TFPrdList_Sel), "N") == 0 )
            {
               AV65FilterTFPrdList_SelValueDescription = httpContext.getMessage( "N", "") ;
            }
            AV53TFPrdList_SelDscs += AV65FilterTFPrdList_SelValueDescription ;
            AV67i = (long)(AV67i+1) ;
            AV77GXV3 = (int)(AV77GXV3+1) ;
         }
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "List by Inditex ", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFPrdList_SelDscs, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV57TFPrdTHELIST_Sel)==0) )
      {
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "THELIST", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFPrdTHELIST_Sel, "@!")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV56TFPrdTHELIST)==0) )
         {
            h8VH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "THELIST", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFPrdTHELIST, "@!")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV59TFPrdHS_Sel)==0) )
      {
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hoja Seguridad?", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFPrdHS_Sel, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV58TFPrdHS)==0) )
         {
            h8VH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hoja Seguridad?", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFPrdHS, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60TFPrdFHS)) )
      {
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Hoja Seguridad", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV60TFPrdFHS, "99/99/99"), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (0==AV68TFPrdEsCompuesto_Sel) )
      {
         if ( AV68TFPrdEsCompuesto_Sel == 1 )
         {
            AV69FilterTFPrdEsCompuesto_SelValueDescription = httpContext.getMessage( "WWP_TSChecked", "") ;
         }
         else if ( AV68TFPrdEsCompuesto_Sel == 2 )
         {
            AV69FilterTFPrdEsCompuesto_SelValueDescription = httpContext.getMessage( "WWP_TSUnChecked", "") ;
         }
         h8VH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Es Compuesto", ""), 25, Gx_line+0, 245, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69FilterTFPrdEsCompuesto_SelValueDescription, "")), 245, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8VH0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8VH0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 30, Gx_line+10, 84, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Producto", ""), 88, Gx_line+10, 142, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "AOX (adsorbable organic halogens)", ""), 146, Gx_line+10, 200, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "GOTS", ""), 204, Gx_line+10, 258, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "REACH", ""), 262, Gx_line+10, 316, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Oeko Tex", ""), 320, Gx_line+10, 374, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "HM", ""), 378, Gx_line+10, 432, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "ZDHC", ""), 436, Gx_line+10, 491, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "List by Inditex ", ""), 495, Gx_line+10, 551, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "THELIST", ""), 555, Gx_line+10, 610, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hoja Seguridad?", ""), 614, Gx_line+10, 669, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Hoja Seguridad", ""), 673, Gx_line+10, 728, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Es Compuesto", ""), 732, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV79Stocksquimicos_producwwds_1_filterfulltext = AV12FilterFullText ;
      AV80Stocksquimicos_producwwds_2_tfprdnom = AV17TFPrdNom ;
      AV81Stocksquimicos_producwwds_3_tfprdnom_sel = AV18TFPrdNom_Sel ;
      AV82Stocksquimicos_producwwds_4_tfprdnum = AV19TFPrdNum ;
      AV83Stocksquimicos_producwwds_5_tfprdnum_sel = AV20TFPrdNum_Sel ;
      AV84Stocksquimicos_producwwds_6_tfprdaox = AV36TFPrdAox ;
      AV85Stocksquimicos_producwwds_7_tfprdaox_to = AV37TFPrdAox_To ;
      AV86Stocksquimicos_producwwds_8_tfprdgots = AV38TFPrdGots ;
      AV87Stocksquimicos_producwwds_9_tfprdgots_sel = AV39TFPrdGots_Sel ;
      AV88Stocksquimicos_producwwds_10_tfprdreach = AV40TFPrdReach ;
      AV89Stocksquimicos_producwwds_11_tfprdreach_sel = AV41TFPrdReach_Sel ;
      AV90Stocksquimicos_producwwds_12_tfprdokotex_sels = AV44TFPrdOkotex_Sels ;
      AV91Stocksquimicos_producwwds_13_tfprdhm = AV46TFPrdHm ;
      AV92Stocksquimicos_producwwds_14_tfprdhm_sel = AV47TFPrdHm_Sel ;
      AV93Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV50TFPrdZDHC_Sels ;
      AV94Stocksquimicos_producwwds_16_tfprdlist_sels = AV54TFPrdList_Sels ;
      AV95Stocksquimicos_producwwds_17_tfprdthelist = AV56TFPrdTHELIST ;
      AV96Stocksquimicos_producwwds_18_tfprdthelist_sel = AV57TFPrdTHELIST_Sel ;
      AV97Stocksquimicos_producwwds_19_tfprdhs = AV58TFPrdHS ;
      AV98Stocksquimicos_producwwds_20_tfprdhs_sel = AV59TFPrdHS_Sel ;
      AV99Stocksquimicos_producwwds_21_tfprdfhs = AV60TFPrdFHS ;
      AV100Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV68TFPrdEsCompuesto_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV90Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV93Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV94Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                           AV81Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                           AV80Stocksquimicos_producwwds_2_tfprdnom ,
                                           AV83Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                           AV82Stocksquimicos_producwwds_4_tfprdnum ,
                                           AV84Stocksquimicos_producwwds_6_tfprdaox ,
                                           AV85Stocksquimicos_producwwds_7_tfprdaox_to ,
                                           AV87Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                           AV86Stocksquimicos_producwwds_8_tfprdgots ,
                                           AV89Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                           AV88Stocksquimicos_producwwds_10_tfprdreach ,
                                           Integer.valueOf(AV90Stocksquimicos_producwwds_12_tfprdokotex_sels.size()) ,
                                           AV92Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                           AV91Stocksquimicos_producwwds_13_tfprdhm ,
                                           Integer.valueOf(AV93Stocksquimicos_producwwds_15_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV94Stocksquimicos_producwwds_16_tfprdlist_sels.size()) ,
                                           AV96Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                           AV95Stocksquimicos_producwwds_17_tfprdthelist ,
                                           AV98Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                           AV97Stocksquimicos_producwwds_19_tfprdhs ,
                                           AV99Stocksquimicos_producwwds_21_tfprdfhs ,
                                           Byte.valueOf(AV100Stocksquimicos_producwwds_22_tfprdescompuesto_sel) ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV79Stocksquimicos_producwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV80Stocksquimicos_producwwds_2_tfprdnom = GXutil.padr( GXutil.rtrim( AV80Stocksquimicos_producwwds_2_tfprdnom), 26, "%") ;
      lV82Stocksquimicos_producwwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV82Stocksquimicos_producwwds_4_tfprdnum), 6, "%") ;
      lV86Stocksquimicos_producwwds_8_tfprdgots = GXutil.padr( GXutil.rtrim( AV86Stocksquimicos_producwwds_8_tfprdgots), 1, "%") ;
      lV88Stocksquimicos_producwwds_10_tfprdreach = GXutil.padr( GXutil.rtrim( AV88Stocksquimicos_producwwds_10_tfprdreach), 1, "%") ;
      lV91Stocksquimicos_producwwds_13_tfprdhm = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_producwwds_13_tfprdhm), 1, "%") ;
      lV95Stocksquimicos_producwwds_17_tfprdthelist = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_producwwds_17_tfprdthelist), 4, "%") ;
      lV97Stocksquimicos_producwwds_19_tfprdhs = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_producwwds_19_tfprdhs), 1, "%") ;
      /* Using cursor P08VH2 */
      pr_default.execute(0, new Object[] {lV80Stocksquimicos_producwwds_2_tfprdnom, AV81Stocksquimicos_producwwds_3_tfprdnom_sel, lV82Stocksquimicos_producwwds_4_tfprdnum, AV83Stocksquimicos_producwwds_5_tfprdnum_sel, AV84Stocksquimicos_producwwds_6_tfprdaox, AV85Stocksquimicos_producwwds_7_tfprdaox_to, lV86Stocksquimicos_producwwds_8_tfprdgots, AV87Stocksquimicos_producwwds_9_tfprdgots_sel, lV88Stocksquimicos_producwwds_10_tfprdreach, AV89Stocksquimicos_producwwds_11_tfprdreach_sel, lV91Stocksquimicos_producwwds_13_tfprdhm, AV92Stocksquimicos_producwwds_14_tfprdhm_sel, lV95Stocksquimicos_producwwds_17_tfprdthelist, AV96Stocksquimicos_producwwds_18_tfprdthelist_sel, lV97Stocksquimicos_producwwds_19_tfprdhs, AV98Stocksquimicos_producwwds_20_tfprdhs_sel, AV99Stocksquimicos_producwwds_21_tfprdfhs});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9742PrdFHS = P08VH2_A9742PrdFHS[0] ;
         A9741PrdHS = P08VH2_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08VH2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08VH2_n13302PrdTHELIST[0] ;
         A11364PrdHm = P08VH2_A11364PrdHm[0] ;
         A5887PrdReach = P08VH2_A5887PrdReach[0] ;
         A11363PrdGots = P08VH2_A11363PrdGots[0] ;
         A9733PrdAox = P08VH2_A9733PrdAox[0] ;
         A718PrdNom = P08VH2_A718PrdNom[0] ;
         A11687PrdList = P08VH2_A11687PrdList[0] ;
         A13301PrdZDHC = P08VH2_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P08VH2_A5888PrdOkotex[0] ;
         A719PrdNum = P08VH2_A719PrdNum[0] ;
         A396EmprCod = P08VH2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV79Stocksquimicos_producwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV79Stocksquimicos_producwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV79Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A13881PrdEsCompu = true ;
            }
            else
            {
               A13881PrdEsCompu = false ;
            }
            AV33PrdOkotexDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), "N") == 0 )
            {
               AV33PrdOkotexDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), "S") == 0 )
            {
               AV33PrdOkotexDescription = httpContext.getMessage( "S", "") ;
            }
            AV34PrdZDHCDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "N") == 0 )
            {
               AV34PrdZDHCDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "1") == 0 )
            {
               AV34PrdZDHCDescription = httpContext.getMessage( "Nivel 1", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "2") == 0 )
            {
               AV34PrdZDHCDescription = httpContext.getMessage( "Nivel 2", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "3") == 0 )
            {
               AV34PrdZDHCDescription = httpContext.getMessage( "Nivel 3", "") ;
            }
            AV35PrdListDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A11687PrdList), "S") == 0 )
            {
               AV35PrdListDescription = httpContext.getMessage( "S", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11687PrdList), "N") == 0 )
            {
               AV35PrdListDescription = httpContext.getMessage( "N", "") ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            h8VH0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A718PrdNom, "")), 30, Gx_line+10, 84, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A719PrdNum, "")), 88, Gx_line+10, 142, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9733PrdAox, "ZZ9.99")), 146, Gx_line+10, 200, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11363PrdGots, "")), 204, Gx_line+10, 258, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5887PrdReach, "")), 262, Gx_line+10, 316, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33PrdOkotexDescription, "")), 320, Gx_line+10, 374, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11364PrdHm, "")), 378, Gx_line+10, 432, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34PrdZDHCDescription, "")), 436, Gx_line+10, 491, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35PrdListDescription, "")), 495, Gx_line+10, 551, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A13302PrdTHELIST, "@!")), 555, Gx_line+10, 610, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9741PrdHS, "")), 614, Gx_line+10, 669, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9742PrdFHS, "99/99/99"), 673, Gx_line+10, 728, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.booltostr( A13881PrdEsCompu), 732, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+36) ;
            /* Execute user subroutine: 'AFTERPRINTLINE' */
            S161 ();
            if ( returnInSub )
            {
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
      if ( GXutil.strcmp(AV13Session.getValue("StocksQuimicos.PRODUCWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.PRODUCWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("StocksQuimicos.PRODUCWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV101GXV4 = 1 ;
      while ( AV101GXV4 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV101GXV4));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV17TFPrdNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV18TFPrdNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV19TFPrdNum = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV20TFPrdNum_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV36TFPrdAox = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFPrdAox_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV38TFPrdGots = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV39TFPrdGots_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV40TFPrdReach = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV41TFPrdReach_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV42TFPrdOkotex_SelsJson = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV44TFPrdOkotex_Sels.fromJSonString(AV42TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV46TFPrdHm = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV47TFPrdHm_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV48TFPrdZDHC_SelsJson = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV50TFPrdZDHC_Sels.fromJSonString(AV48TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV52TFPrdList_SelsJson = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV54TFPrdList_Sels.fromJSonString(AV52TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV56TFPrdTHELIST = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV57TFPrdTHELIST_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV58TFPrdHS = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV59TFPrdHS_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV60TFPrdFHS = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDESCOMPUESTO_SEL") == 0 )
         {
            AV68TFPrdEsCompuesto_Sel = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV101GXV4 = (int)(AV101GXV4+1) ;
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

   public void h8VH0( boolean bFoot ,
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
               AV29PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV26DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV31Title = AV72Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV31Title = "" ;
      AV12FilterFullText = "" ;
      AV18TFPrdNom_Sel = "" ;
      AV17TFPrdNom = "" ;
      AV20TFPrdNum_Sel = "" ;
      AV19TFPrdNum = "" ;
      AV36TFPrdAox = DecimalUtil.ZERO ;
      AV37TFPrdAox_To = DecimalUtil.ZERO ;
      AV62TFPrdAox_To_Description = "" ;
      AV39TFPrdGots_Sel = "" ;
      AV38TFPrdGots = "" ;
      AV41TFPrdReach_Sel = "" ;
      AV40TFPrdReach = "" ;
      AV44TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42TFPrdOkotex_SelsJson = "" ;
      AV45TFPrdOkotex_Sel = "" ;
      AV43TFPrdOkotex_SelDscs = "" ;
      AV63FilterTFPrdOkotex_SelValueDescription = "" ;
      AV47TFPrdHm_Sel = "" ;
      AV46TFPrdHm = "" ;
      AV50TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48TFPrdZDHC_SelsJson = "" ;
      AV51TFPrdZDHC_Sel = "" ;
      AV49TFPrdZDHC_SelDscs = "" ;
      AV64FilterTFPrdZDHC_SelValueDescription = "" ;
      AV54TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52TFPrdList_SelsJson = "" ;
      AV55TFPrdList_Sel = "" ;
      AV53TFPrdList_SelDscs = "" ;
      AV65FilterTFPrdList_SelValueDescription = "" ;
      AV57TFPrdTHELIST_Sel = "" ;
      AV56TFPrdTHELIST = "" ;
      AV59TFPrdHS_Sel = "" ;
      AV58TFPrdHS = "" ;
      AV60TFPrdFHS = GXutil.nullDate() ;
      AV69FilterTFPrdEsCompuesto_SelValueDescription = "" ;
      A5888PrdOkotex = "" ;
      A13301PrdZDHC = "" ;
      A11687PrdList = "" ;
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A5887PrdReach = "" ;
      A11364PrdHm = "" ;
      A13302PrdTHELIST = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      AV79Stocksquimicos_producwwds_1_filterfulltext = "" ;
      AV80Stocksquimicos_producwwds_2_tfprdnom = "" ;
      AV81Stocksquimicos_producwwds_3_tfprdnom_sel = "" ;
      AV82Stocksquimicos_producwwds_4_tfprdnum = "" ;
      AV83Stocksquimicos_producwwds_5_tfprdnum_sel = "" ;
      AV84Stocksquimicos_producwwds_6_tfprdaox = DecimalUtil.ZERO ;
      AV85Stocksquimicos_producwwds_7_tfprdaox_to = DecimalUtil.ZERO ;
      AV86Stocksquimicos_producwwds_8_tfprdgots = "" ;
      AV87Stocksquimicos_producwwds_9_tfprdgots_sel = "" ;
      AV88Stocksquimicos_producwwds_10_tfprdreach = "" ;
      AV89Stocksquimicos_producwwds_11_tfprdreach_sel = "" ;
      AV90Stocksquimicos_producwwds_12_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV91Stocksquimicos_producwwds_13_tfprdhm = "" ;
      AV92Stocksquimicos_producwwds_14_tfprdhm_sel = "" ;
      AV93Stocksquimicos_producwwds_15_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV94Stocksquimicos_producwwds_16_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV95Stocksquimicos_producwwds_17_tfprdthelist = "" ;
      AV96Stocksquimicos_producwwds_18_tfprdthelist_sel = "" ;
      AV97Stocksquimicos_producwwds_19_tfprdhs = "" ;
      AV98Stocksquimicos_producwwds_20_tfprdhs_sel = "" ;
      AV99Stocksquimicos_producwwds_21_tfprdfhs = GXutil.nullDate() ;
      lV79Stocksquimicos_producwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV80Stocksquimicos_producwwds_2_tfprdnom = "" ;
      lV82Stocksquimicos_producwwds_4_tfprdnum = "" ;
      lV86Stocksquimicos_producwwds_8_tfprdgots = "" ;
      lV88Stocksquimicos_producwwds_10_tfprdreach = "" ;
      lV91Stocksquimicos_producwwds_13_tfprdhm = "" ;
      lV95Stocksquimicos_producwwds_17_tfprdthelist = "" ;
      lV97Stocksquimicos_producwwds_19_tfprdhs = "" ;
      P08VH2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08VH2_A9741PrdHS = new String[] {""} ;
      P08VH2_A13302PrdTHELIST = new String[] {""} ;
      P08VH2_n13302PrdTHELIST = new boolean[] {false} ;
      P08VH2_A11364PrdHm = new String[] {""} ;
      P08VH2_A5887PrdReach = new String[] {""} ;
      P08VH2_A11363PrdGots = new String[] {""} ;
      P08VH2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VH2_A718PrdNom = new String[] {""} ;
      P08VH2_A11687PrdList = new String[] {""} ;
      P08VH2_A13301PrdZDHC = new String[] {""} ;
      P08VH2_A5888PrdOkotex = new String[] {""} ;
      P08VH2_A719PrdNum = new String[] {""} ;
      P08VH2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV33PrdOkotexDescription = "" ;
      AV34PrdZDHCDescription = "" ;
      AV35PrdListDescription = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV29PageInfo = "" ;
      AV26DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV72Pgmdesc = "" ;
      AV24AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.producwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08VH2_A9742PrdFHS, P08VH2_A9741PrdHS, P08VH2_A13302PrdTHELIST, P08VH2_n13302PrdTHELIST, P08VH2_A11364PrdHm, P08VH2_A5887PrdReach, P08VH2_A11363PrdGots, P08VH2_A9733PrdAox, P08VH2_A718PrdNom, P08VH2_A11687PrdList,
            P08VH2_A13301PrdZDHC, P08VH2_A5888PrdOkotex, P08VH2_A719PrdNum, P08VH2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV72Pgmdesc = httpContext.getMessage( "PRODUCWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV72Pgmdesc = httpContext.getMessage( "PRODUCWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV68TFPrdEsCompuesto_Sel ;
   private byte AV100Stocksquimicos_producwwds_22_tfprdescompuesto_sel ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV75GXV1 ;
   private int AV76GXV2 ;
   private int AV77GXV3 ;
   private int AV90Stocksquimicos_producwwds_12_tfprdokotex_sels_size ;
   private int AV93Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ;
   private int AV94Stocksquimicos_producwwds_16_tfprdlist_sels_size ;
   private int AV101GXV4 ;
   private long AV67i ;
   private java.math.BigDecimal AV36TFPrdAox ;
   private java.math.BigDecimal AV37TFPrdAox_To ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal AV84Stocksquimicos_producwwds_6_tfprdaox ;
   private java.math.BigDecimal AV85Stocksquimicos_producwwds_7_tfprdaox_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18TFPrdNom_Sel ;
   private String AV17TFPrdNom ;
   private String AV20TFPrdNum_Sel ;
   private String AV19TFPrdNum ;
   private String AV39TFPrdGots_Sel ;
   private String AV38TFPrdGots ;
   private String AV41TFPrdReach_Sel ;
   private String AV40TFPrdReach ;
   private String AV45TFPrdOkotex_Sel ;
   private String AV47TFPrdHm_Sel ;
   private String AV46TFPrdHm ;
   private String AV51TFPrdZDHC_Sel ;
   private String AV55TFPrdList_Sel ;
   private String AV57TFPrdTHELIST_Sel ;
   private String AV56TFPrdTHELIST ;
   private String AV59TFPrdHS_Sel ;
   private String AV58TFPrdHS ;
   private String A5888PrdOkotex ;
   private String A13301PrdZDHC ;
   private String A11687PrdList ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A11363PrdGots ;
   private String A5887PrdReach ;
   private String A11364PrdHm ;
   private String A13302PrdTHELIST ;
   private String A9741PrdHS ;
   private String AV80Stocksquimicos_producwwds_2_tfprdnom ;
   private String AV81Stocksquimicos_producwwds_3_tfprdnom_sel ;
   private String AV82Stocksquimicos_producwwds_4_tfprdnum ;
   private String AV83Stocksquimicos_producwwds_5_tfprdnum_sel ;
   private String AV86Stocksquimicos_producwwds_8_tfprdgots ;
   private String AV87Stocksquimicos_producwwds_9_tfprdgots_sel ;
   private String AV88Stocksquimicos_producwwds_10_tfprdreach ;
   private String AV89Stocksquimicos_producwwds_11_tfprdreach_sel ;
   private String AV91Stocksquimicos_producwwds_13_tfprdhm ;
   private String AV92Stocksquimicos_producwwds_14_tfprdhm_sel ;
   private String AV95Stocksquimicos_producwwds_17_tfprdthelist ;
   private String AV96Stocksquimicos_producwwds_18_tfprdthelist_sel ;
   private String AV97Stocksquimicos_producwwds_19_tfprdhs ;
   private String AV98Stocksquimicos_producwwds_20_tfprdhs_sel ;
   private String scmdbuf ;
   private String lV80Stocksquimicos_producwwds_2_tfprdnom ;
   private String lV82Stocksquimicos_producwwds_4_tfprdnum ;
   private String lV86Stocksquimicos_producwwds_8_tfprdgots ;
   private String lV88Stocksquimicos_producwwds_10_tfprdreach ;
   private String lV91Stocksquimicos_producwwds_13_tfprdhm ;
   private String lV95Stocksquimicos_producwwds_17_tfprdthelist ;
   private String lV97Stocksquimicos_producwwds_19_tfprdhs ;
   private String A396EmprCod ;
   private String AV72Pgmdesc ;
   private java.util.Date AV60TFPrdFHS ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date AV99Stocksquimicos_producwwds_21_tfprdfhs ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean A13881PrdEsCompu ;
   private boolean AV11OrderedDsc ;
   private boolean n13302PrdTHELIST ;
   private String AV42TFPrdOkotex_SelsJson ;
   private String AV48TFPrdZDHC_SelsJson ;
   private String AV52TFPrdList_SelsJson ;
   private String AV31Title ;
   private String AV12FilterFullText ;
   private String AV62TFPrdAox_To_Description ;
   private String AV43TFPrdOkotex_SelDscs ;
   private String AV63FilterTFPrdOkotex_SelValueDescription ;
   private String AV49TFPrdZDHC_SelDscs ;
   private String AV64FilterTFPrdZDHC_SelValueDescription ;
   private String AV53TFPrdList_SelDscs ;
   private String AV65FilterTFPrdList_SelValueDescription ;
   private String AV69FilterTFPrdEsCompuesto_SelValueDescription ;
   private String AV79Stocksquimicos_producwwds_1_filterfulltext ;
   private String lV79Stocksquimicos_producwwds_1_filterfulltext ;
   private String AV33PrdOkotexDescription ;
   private String AV34PrdZDHCDescription ;
   private String AV35PrdListDescription ;
   private String AV29PageInfo ;
   private String AV26DateInfo ;
   private String AV24AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08VH2_A9742PrdFHS ;
   private String[] P08VH2_A9741PrdHS ;
   private String[] P08VH2_A13302PrdTHELIST ;
   private boolean[] P08VH2_n13302PrdTHELIST ;
   private String[] P08VH2_A11364PrdHm ;
   private String[] P08VH2_A5887PrdReach ;
   private String[] P08VH2_A11363PrdGots ;
   private java.math.BigDecimal[] P08VH2_A9733PrdAox ;
   private String[] P08VH2_A718PrdNom ;
   private String[] P08VH2_A11687PrdList ;
   private String[] P08VH2_A13301PrdZDHC ;
   private String[] P08VH2_A5888PrdOkotex ;
   private String[] P08VH2_A719PrdNum ;
   private String[] P08VH2_A396EmprCod ;
   private GXSimpleCollection<String> AV44TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV50TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV54TFPrdList_Sels ;
   private GXSimpleCollection<String> AV90Stocksquimicos_producwwds_12_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV93Stocksquimicos_producwwds_15_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV94Stocksquimicos_producwwds_16_tfprdlist_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class producwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV90Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV93Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV94Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                          String AV81Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                          String AV80Stocksquimicos_producwwds_2_tfprdnom ,
                                          String AV83Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                          String AV82Stocksquimicos_producwwds_4_tfprdnum ,
                                          java.math.BigDecimal AV84Stocksquimicos_producwwds_6_tfprdaox ,
                                          java.math.BigDecimal AV85Stocksquimicos_producwwds_7_tfprdaox_to ,
                                          String AV87Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                          String AV86Stocksquimicos_producwwds_8_tfprdgots ,
                                          String AV89Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                          String AV88Stocksquimicos_producwwds_10_tfprdreach ,
                                          int AV90Stocksquimicos_producwwds_12_tfprdokotex_sels_size ,
                                          String AV92Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                          String AV91Stocksquimicos_producwwds_13_tfprdhm ,
                                          int AV93Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ,
                                          int AV94Stocksquimicos_producwwds_16_tfprdlist_sels_size ,
                                          String AV96Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                          String AV95Stocksquimicos_producwwds_17_tfprdthelist ,
                                          String AV98Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                          String AV97Stocksquimicos_producwwds_19_tfprdhs ,
                                          java.util.Date AV99Stocksquimicos_producwwds_21_tfprdfhs ,
                                          byte AV100Stocksquimicos_producwwds_22_tfprdescompuesto_sel ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV79Stocksquimicos_producwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrdFHS, PrdHS, PrdTHELIST, PrdHm, PrdReach, PrdGots, PrdAox, PrdNom, PrdList, PrdZDHC, PrdOkotex, PrdNum, EmprCod FROM TXPPRODUC" ;
      if ( (GXutil.strcmp("", AV81Stocksquimicos_producwwds_3_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV80Stocksquimicos_producwwds_2_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Stocksquimicos_producwwds_3_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Stocksquimicos_producwwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV82Stocksquimicos_producwwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Stocksquimicos_producwwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Stocksquimicos_producwwds_6_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(PrdAox >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Stocksquimicos_producwwds_7_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(PrdAox <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Stocksquimicos_producwwds_9_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV86Stocksquimicos_producwwds_8_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Stocksquimicos_producwwds_9_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(PrdGots = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Stocksquimicos_producwwds_11_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV88Stocksquimicos_producwwds_10_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Stocksquimicos_producwwds_11_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(PrdReach = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( AV90Stocksquimicos_producwwds_12_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV90Stocksquimicos_producwwds_12_tfprdokotex_sels, "PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_producwwds_14_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_producwwds_13_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_producwwds_14_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHm = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( AV93Stocksquimicos_producwwds_15_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Stocksquimicos_producwwds_15_tfprdzdhc_sels, "PrdZDHC IN (", ")")+")");
      }
      if ( AV94Stocksquimicos_producwwds_16_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV94Stocksquimicos_producwwds_16_tfprdlist_sels, "PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_producwwds_17_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(PrdTHELIST = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_producwwds_20_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_producwwds_19_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_producwwds_20_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHS = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99Stocksquimicos_producwwds_21_tfprdfhs)) )
      {
         addWhere(sWhereString, "(PrdFHS >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( AV100Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 1 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (1= 1))");
      }
      if ( AV100Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 2 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (0= 1))");
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNom" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdGots" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdGots DESC" ;
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
                  return conditional_P08VH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
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
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               return;
      }
   }

}

