package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class dis___wwexportreport_impl extends GXWebReport
{
   public dis___wwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV90Title = httpContext.getMessage( "Lista de Pedidos", "") ;
         /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
         S181 ();
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
         hA1Z0( true, 0) ;
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
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV25TFDisUsrCod_Sel)==0) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFDisUsrCod_Sel, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFDisUsrCod)==0) )
         {
            hA1Z0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFDisUsrCod, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV28TFDisEst_Sels.fromJSonString(AV26TFDisEst_SelsJson, null);
      if ( ! ( AV28TFDisEst_Sels.size() == 0 ) )
      {
         AV79i = 1 ;
         AV104GXV1 = 1 ;
         while ( AV104GXV1 <= AV28TFDisEst_Sels.size() )
         {
            AV29TFDisEst_Sel = ((Number) AV28TFDisEst_Sels.elementAt(-1+AV104GXV1)).byteValue() ;
            if ( AV79i == 1 )
            {
               AV27TFDisEst_SelDscs = "" ;
            }
            else
            {
               AV27TFDisEst_SelDscs += ", " ;
            }
            AV68FilterTFDisEst_SelValueDescription = "" ;
            if ( AV29TFDisEst_Sel == 1 )
            {
               AV68FilterTFDisEst_SelValueDescription = httpContext.getMessage( "En Pedido", "") ;
            }
            else if ( AV29TFDisEst_Sel == 3 )
            {
               AV68FilterTFDisEst_SelValueDescription = httpContext.getMessage( "En Produccion", "") ;
            }
            AV27TFDisEst_SelDscs += AV68FilterTFDisEst_SelValueDescription ;
            AV79i = (long)(AV79i+1) ;
            AV104GXV1 = (int)(AV104GXV1+1) ;
         }
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFDisEst_SelDscs, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFDisCliNum_Sel)==0) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ped. Cli.", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFDisCliNum_Sel, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFDisCliNum)==0) )
         {
            hA1Z0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ped. Cli.", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFDisCliNum, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV33TFDisEncCli_Sel)==0) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ped. Cli.", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFDisEncCli_Sel, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV32TFDisEncCli)==0) )
         {
            hA1Z0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ped. Cli.", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFDisEncCli, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40TFDisFecEnt)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41TFDisFecEnt_To)) ) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Data entr.", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV40TFDisFecEnt, "99/99/99"), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV72TFDisFecEnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Data entr.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFDisFecEnt_To_Description, "")), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV41TFDisFecEnt_To, "99/99/99"), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV42TFCliCod) && (0==AV43TFCliCod_To) ) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42TFCliCod), "ZZZZZ9")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV73TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73TFCliCod_To_Description, "")), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV43TFCliCod_To), "ZZZZZ9")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFCliNom_Sel)==0) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFCliNom_Sel, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV44TFCliNom)==0) )
         {
            hA1Z0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFCliNom, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV47TFDisArtCod_Sel)==0) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFDisArtCod_Sel, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFDisArtCod)==0) )
         {
            hA1Z0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFDisArtCod, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV49TFDisArtDsc_Sel)==0) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFDisArtDsc_Sel, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV48TFDisArtDsc)==0) )
         {
            hA1Z0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48TFDisArtDsc, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV51TFDisColNom_Sel)==0) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFDisColNom_Sel, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV50TFDisColNom)==0) )
         {
            hA1Z0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFDisColNom, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV52TFDisColNum) && (0==AV53TFDisColNum_To) ) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cor. Núm", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52TFDisColNum), "ZZZZZ9")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV74TFDisColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cor. Núm", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TFDisColNum_To_Description, "")), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV53TFDisColNum_To), "ZZZZZ9")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV54TFDisTipCol) && (0==AV55TFDisTipCol_To) ) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "TC", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV54TFDisTipCol), "Z9")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV75TFDisTipCol_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "TC", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TFDisTipCol_To_Description, "")), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV55TFDisTipCol_To), "Z9")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV57TFDisNomCli_Sel)==0) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color Cliente", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFDisNomCli_Sel, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV56TFDisNomCli)==0) )
         {
            hA1Z0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color Cliente", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFDisNomCli, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV58TFDisNumCli) && (0==AV59TFDisNumCli_To) ) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58TFDisNumCli), "ZZZZZ9")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV76TFDisNumCli_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76TFDisNumCli_To_Description, "")), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV59TFDisNumCli_To), "ZZZZZ9")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV61TFMaqCodDis_Sel)==0) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFMaqCodDis_Sel, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV60TFMaqCodDis)==0) )
         {
            hA1Z0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60TFMaqCodDis, "")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFDisNumUni)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFDisNumUni_To)==0) ) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV64TFDisNumUni, "ZZZZZ9.99")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV78TFDisNumUni_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unidades", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFDisNumUni_To_Description, "")), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV65TFDisNumUni_To, "ZZZZZ9.99")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFDisUniMed_Sel)==0) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Und.", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67TFDisUniMed_Sel, "@!")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV66TFDisUniMed)==0) )
         {
            hA1Z0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Und.", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66TFDisUniMed, "@!")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV62TFDisNumPie) && (0==AV63TFDisNumPie_To) ) )
      {
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV62TFDisNumPie), "ZZZ9")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV77TFDisNumPie_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Piezas", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         hA1Z0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TFDisNumPie_To_Description, "")), 25, Gx_line+0, 120, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV63TFDisNumPie_To), "ZZZ9")), 120, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      hA1Z0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      if ( AV14IsAuthorizedDisCliNum )
      {
         AV16DisCliNumTitle = httpContext.getMessage( "Ped. Cli.", "") ;
      }
      if ( AV17IsAuthorizedDisEncCli )
      {
         AV19DisEncCliTitle = httpContext.getMessage( "Ped. Cli.", "") ;
      }
      hA1Z0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 30, Gx_line+10, 62, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 66, Gx_line+10, 98, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16DisCliNumTitle, "")), 102, Gx_line+10, 134, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19DisEncCliTitle, "")), 138, Gx_line+10, 170, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nr.Enc", ""), 174, Gx_line+10, 206, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Data ped.", ""), 210, Gx_line+10, 242, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Data reg.", ""), 246, Gx_line+10, 278, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Data entr.", ""), 282, Gx_line+10, 314, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 318, Gx_line+10, 350, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 354, Gx_line+10, 386, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 390, Gx_line+10, 422, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 426, Gx_line+10, 458, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 462, Gx_line+10, 494, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cor. Núm", ""), 498, Gx_line+10, 530, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "TC", ""), 534, Gx_line+10, 566, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Color Cliente", ""), 570, Gx_line+10, 602, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 606, Gx_line+10, 639, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 643, Gx_line+10, 676, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 680, Gx_line+10, 713, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Und.", ""), 717, Gx_line+10, 750, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 754, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV106Pedidos_dis___wwds_1_filterfulltext = AV12FilterFullText ;
      AV107Pedidos_dis___wwds_2_tfdisusrcod = AV24TFDisUsrCod ;
      AV108Pedidos_dis___wwds_3_tfdisusrcod_sel = AV25TFDisUsrCod_Sel ;
      AV109Pedidos_dis___wwds_4_tfdisest_sels = AV28TFDisEst_Sels ;
      AV110Pedidos_dis___wwds_5_tfdisclinum = AV30TFDisCliNum ;
      AV111Pedidos_dis___wwds_6_tfdisclinum_sel = AV31TFDisCliNum_Sel ;
      AV112Pedidos_dis___wwds_7_tfdisenccli = AV32TFDisEncCli ;
      AV113Pedidos_dis___wwds_8_tfdisenccli_sel = AV33TFDisEncCli_Sel ;
      AV114Pedidos_dis___wwds_9_tfdisfecent = AV40TFDisFecEnt ;
      AV115Pedidos_dis___wwds_10_tfdisfecent_to = AV41TFDisFecEnt_To ;
      AV116Pedidos_dis___wwds_11_tfclicod = AV42TFCliCod ;
      AV117Pedidos_dis___wwds_12_tfclicod_to = AV43TFCliCod_To ;
      AV118Pedidos_dis___wwds_13_tfclinom = AV44TFCliNom ;
      AV119Pedidos_dis___wwds_14_tfclinom_sel = AV45TFCliNom_Sel ;
      AV120Pedidos_dis___wwds_15_tfdisartcod = AV46TFDisArtCod ;
      AV121Pedidos_dis___wwds_16_tfdisartcod_sel = AV47TFDisArtCod_Sel ;
      AV122Pedidos_dis___wwds_17_tfdisartdsc = AV48TFDisArtDsc ;
      AV123Pedidos_dis___wwds_18_tfdisartdsc_sel = AV49TFDisArtDsc_Sel ;
      AV124Pedidos_dis___wwds_19_tfdiscolnom = AV50TFDisColNom ;
      AV125Pedidos_dis___wwds_20_tfdiscolnom_sel = AV51TFDisColNom_Sel ;
      AV126Pedidos_dis___wwds_21_tfdiscolnum = AV52TFDisColNum ;
      AV127Pedidos_dis___wwds_22_tfdiscolnum_to = AV53TFDisColNum_To ;
      AV128Pedidos_dis___wwds_23_tfdistipcol = AV54TFDisTipCol ;
      AV129Pedidos_dis___wwds_24_tfdistipcol_to = AV55TFDisTipCol_To ;
      AV130Pedidos_dis___wwds_25_tfdisnomcli = AV56TFDisNomCli ;
      AV131Pedidos_dis___wwds_26_tfdisnomcli_sel = AV57TFDisNomCli_Sel ;
      AV132Pedidos_dis___wwds_27_tfdisnumcli = AV58TFDisNumCli ;
      AV133Pedidos_dis___wwds_28_tfdisnumcli_to = AV59TFDisNumCli_To ;
      AV134Pedidos_dis___wwds_29_tfmaqcoddis = AV60TFMaqCodDis ;
      AV135Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV61TFMaqCodDis_Sel ;
      AV136Pedidos_dis___wwds_31_tfdisnumuni = AV64TFDisNumUni ;
      AV137Pedidos_dis___wwds_32_tfdisnumuni_to = AV65TFDisNumUni_To ;
      AV138Pedidos_dis___wwds_33_tfdisunimed = AV66TFDisUniMed ;
      AV139Pedidos_dis___wwds_34_tfdisunimed_sel = AV67TFDisUniMed_Sel ;
      AV140Pedidos_dis___wwds_35_tfdisnumpie = AV62TFDisNumPie ;
      AV141Pedidos_dis___wwds_36_tfdisnumpie_to = AV63TFDisNumPie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV109Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV108Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV107Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV109Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV111Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV110Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV113Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV112Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV114Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV115Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV116Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV117Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV119Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV118Pedidos_dis___wwds_13_tfclinom ,
                                           AV121Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV120Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV123Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV122Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV125Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV124Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV126Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV127Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV128Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV129Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV131Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV130Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV132Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV133Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV135Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV134Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV136Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV137Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV139Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV138Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV140Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV141Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV96DisCod) ,
                                           AV94DisFecFrom ,
                                           AV95DisFecto ,
                                           AV97DisFeccliFrom ,
                                           AV98DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV106Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV107Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV107Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV110Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV110Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV112Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV112Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV118Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV118Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV120Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV120Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV122Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV122Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV124Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV124Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV130Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV130Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV134Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV134Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV138Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV138Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A1Z2 */
      pr_default.execute(0, new Object[] {lV107Pedidos_dis___wwds_2_tfdisusrcod, AV108Pedidos_dis___wwds_3_tfdisusrcod_sel, lV110Pedidos_dis___wwds_5_tfdisclinum, AV111Pedidos_dis___wwds_6_tfdisclinum_sel, lV112Pedidos_dis___wwds_7_tfdisenccli, AV113Pedidos_dis___wwds_8_tfdisenccli_sel, AV114Pedidos_dis___wwds_9_tfdisfecent, AV115Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV116Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV117Pedidos_dis___wwds_12_tfclicod_to), lV118Pedidos_dis___wwds_13_tfclinom, AV119Pedidos_dis___wwds_14_tfclinom_sel, lV120Pedidos_dis___wwds_15_tfdisartcod, AV121Pedidos_dis___wwds_16_tfdisartcod_sel, lV122Pedidos_dis___wwds_17_tfdisartdsc, AV123Pedidos_dis___wwds_18_tfdisartdsc_sel, lV124Pedidos_dis___wwds_19_tfdiscolnom, AV125Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV126Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV127Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV128Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV129Pedidos_dis___wwds_24_tfdistipcol_to), lV130Pedidos_dis___wwds_25_tfdisnomcli, AV131Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV132Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV133Pedidos_dis___wwds_28_tfdisnumcli_to), lV134Pedidos_dis___wwds_29_tfmaqcoddis, AV135Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV136Pedidos_dis___wwds_31_tfdisnumuni, AV137Pedidos_dis___wwds_32_tfdisnumuni_to, lV138Pedidos_dis___wwds_33_tfdisunimed, AV139Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV140Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV141Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV96DisCod), AV94DisFecFrom, AV95DisFecto, AV97DisFeccliFrom, AV98DisFecclito});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A370DisFecCli = P0A1Z2_A370DisFecCli[0] ;
         A369DisFec = P0A1Z2_A369DisFec[0] ;
         A361DisCod = P0A1Z2_A361DisCod[0] ;
         A374DisNumPie = P0A1Z2_A374DisNumPie[0] ;
         A392DisUniMed = P0A1Z2_A392DisUniMed[0] ;
         A375DisNumUni = P0A1Z2_A375DisNumUni[0] ;
         A1122MaqCodDis = P0A1Z2_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A1Z2_n1122MaqCodDis[0] ;
         A1196DisNumCli = P0A1Z2_A1196DisNumCli[0] ;
         A1195DisNomCli = P0A1Z2_A1195DisNomCli[0] ;
         A390DisTipCol = P0A1Z2_A390DisTipCol[0] ;
         n390DisTipCol = P0A1Z2_n390DisTipCol[0] ;
         A363DisColNum = P0A1Z2_A363DisColNum[0] ;
         n363DisColNum = P0A1Z2_n363DisColNum[0] ;
         A362DisColNom = P0A1Z2_A362DisColNom[0] ;
         n362DisColNom = P0A1Z2_n362DisColNom[0] ;
         A337DisArtDsc = P0A1Z2_A337DisArtDsc[0] ;
         A335DisArtCod = P0A1Z2_A335DisArtCod[0] ;
         A279CliNom = P0A1Z2_A279CliNom[0] ;
         A252CliCod = P0A1Z2_A252CliCod[0] ;
         A371DisFecEnt = P0A1Z2_A371DisFecEnt[0] ;
         A4813DisEncCli = P0A1Z2_A4813DisEncCli[0] ;
         A360DisCliNum = P0A1Z2_A360DisCliNum[0] ;
         A4348DisUsrCod = P0A1Z2_A4348DisUsrCod[0] ;
         A367DisEst = P0A1Z2_A367DisEst[0] ;
         A396EmprCod = P0A1Z2_A396EmprCod[0] ;
         A279CliNom = P0A1Z2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV106Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV106Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV106Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV106Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV106Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV106Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV106Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV106Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV106Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV106Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV106Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV106Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV106Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV106Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV106Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV106Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV106Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV106Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV106Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV106Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV13DisEstDescription = "" ;
            if ( A367DisEst == 1 )
            {
               AV13DisEstDescription = httpContext.getMessage( "En Pedido", "") ;
            }
            else if ( A367DisEst == 3 )
            {
               AV13DisEstDescription = httpContext.getMessage( "En Produccion", "") ;
            }
            if ( AV14IsAuthorizedDisCliNum )
            {
               AV15DisCliNumData = A360DisCliNum ;
            }
            if ( AV17IsAuthorizedDisEncCli )
            {
               AV18DisEncCliData = A4813DisEncCli ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            hA1Z0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4348DisUsrCod, "")), 30, Gx_line+10, 62, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13DisEstDescription, "")), 66, Gx_line+10, 98, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15DisCliNumData, "")), 102, Gx_line+10, 134, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18DisEncCliData, "")), 138, Gx_line+10, 170, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), 174, Gx_line+10, 206, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A370DisFecCli, "99/99/99"), 210, Gx_line+10, 242, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A369DisFec, "99/99/99"), 246, Gx_line+10, 278, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A371DisFecEnt, "99/99/99"), 282, Gx_line+10, 314, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 318, Gx_line+10, 350, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 354, Gx_line+10, 386, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A335DisArtCod, "")), 390, Gx_line+10, 422, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A337DisArtDsc, "")), 426, Gx_line+10, 458, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A362DisColNom, "")), 462, Gx_line+10, 494, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9")), 498, Gx_line+10, 530, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9")), 534, Gx_line+10, 566, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1195DisNomCli, "")), 570, Gx_line+10, 602, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9")), 606, Gx_line+10, 639, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1122MaqCodDis, "")), 643, Gx_line+10, 676, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A375DisNumUni, "ZZZZZ9.99")), 680, Gx_line+10, 713, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), 717, Gx_line+10, 750, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9")), 754, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+36) ;
            /* Execute user subroutine: 'AFTERPRINTLINE' */
            S161 ();
            if ( returnInSub )
            {
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
      if ( GXutil.strcmp(AV20Session.getValue("Pedidos.Dis___WWGridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.Dis___WWGridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV20Session.getValue("Pedidos.Dis___WWGridState"), null, null);
      }
      AV10OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV142GXV2 = 1 ;
      while ( AV142GXV2 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV142GXV2));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV24TFDisUsrCod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV25TFDisUsrCod_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISEST_SEL") == 0 )
         {
            AV26TFDisEst_SelsJson = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV28TFDisEst_Sels.fromJSonString(AV26TFDisEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV30TFDisCliNum = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV31TFDisCliNum_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI") == 0 )
         {
            AV32TFDisEncCli = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI_SEL") == 0 )
         {
            AV33TFDisEncCli_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECENT") == 0 )
         {
            AV40TFDisFecEnt = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV41TFDisFecEnt_To = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV42TFCliCod = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFCliCod_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV44TFCliNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV45TFCliNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV46TFDisArtCod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV47TFDisArtCod_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV48TFDisArtDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV49TFDisArtDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV50TFDisColNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV51TFDisColNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV52TFDisColNum = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFDisColNum_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV54TFDisTipCol = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFDisTipCol_To = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV56TFDisNomCli = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV57TFDisNomCli_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMCLI") == 0 )
         {
            AV58TFDisNumCli = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFDisNumCli_To = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS") == 0 )
         {
            AV60TFMaqCodDis = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS_SEL") == 0 )
         {
            AV61TFMaqCodDis_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMUNI") == 0 )
         {
            AV64TFDisNumUni = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV65TFDisNumUni_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV66TFDisUniMed = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV67TFDisUniMed_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMPIE") == 0 )
         {
            AV62TFDisNumPie = (short)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFDisNumPie_To = (short)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV142GXV2 = (int)(AV142GXV2+1) ;
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

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      GXt_int2 = (byte)(0) ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int3) ;
      dis___wwexportreport_impl.this.GXt_int2 = GXv_int3[0] ;
      AV14IsAuthorizedDisCliNum = (boolean)(((GXt_int2==0))) ;
      GXt_int2 = (byte)(0) ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int3) ;
      dis___wwexportreport_impl.this.GXt_int2 = GXv_int3[0] ;
      AV17IsAuthorizedDisEncCli = (boolean)(((GXt_int2==1))) ;
   }

   public void hA1Z0( boolean bFoot ,
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
               AV88PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV85DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV90Title = AV101Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV90Title = "" ;
      AV12FilterFullText = "" ;
      AV25TFDisUsrCod_Sel = "" ;
      AV24TFDisUsrCod = "" ;
      AV28TFDisEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV26TFDisEst_SelsJson = "" ;
      AV27TFDisEst_SelDscs = "" ;
      AV68FilterTFDisEst_SelValueDescription = "" ;
      AV31TFDisCliNum_Sel = "" ;
      AV30TFDisCliNum = "" ;
      AV33TFDisEncCli_Sel = "" ;
      AV32TFDisEncCli = "" ;
      AV40TFDisFecEnt = GXutil.nullDate() ;
      AV41TFDisFecEnt_To = GXutil.nullDate() ;
      AV72TFDisFecEnt_To_Description = "" ;
      AV73TFCliCod_To_Description = "" ;
      AV45TFCliNom_Sel = "" ;
      AV44TFCliNom = "" ;
      AV47TFDisArtCod_Sel = "" ;
      AV46TFDisArtCod = "" ;
      AV49TFDisArtDsc_Sel = "" ;
      AV48TFDisArtDsc = "" ;
      AV51TFDisColNom_Sel = "" ;
      AV50TFDisColNom = "" ;
      AV74TFDisColNum_To_Description = "" ;
      AV75TFDisTipCol_To_Description = "" ;
      AV57TFDisNomCli_Sel = "" ;
      AV56TFDisNomCli = "" ;
      AV76TFDisNumCli_To_Description = "" ;
      AV61TFMaqCodDis_Sel = "" ;
      AV60TFMaqCodDis = "" ;
      AV64TFDisNumUni = DecimalUtil.ZERO ;
      AV65TFDisNumUni_To = DecimalUtil.ZERO ;
      AV78TFDisNumUni_To_Description = "" ;
      AV67TFDisUniMed_Sel = "" ;
      AV66TFDisUniMed = "" ;
      AV77TFDisNumPie_To_Description = "" ;
      AV16DisCliNumTitle = "" ;
      AV19DisEncCliTitle = "" ;
      A360DisCliNum = "" ;
      A4813DisEncCli = "" ;
      A4348DisUsrCod = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A369DisFec = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      A279CliNom = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A1122MaqCodDis = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      AV106Pedidos_dis___wwds_1_filterfulltext = "" ;
      AV107Pedidos_dis___wwds_2_tfdisusrcod = "" ;
      AV108Pedidos_dis___wwds_3_tfdisusrcod_sel = "" ;
      AV109Pedidos_dis___wwds_4_tfdisest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV110Pedidos_dis___wwds_5_tfdisclinum = "" ;
      AV111Pedidos_dis___wwds_6_tfdisclinum_sel = "" ;
      AV112Pedidos_dis___wwds_7_tfdisenccli = "" ;
      AV113Pedidos_dis___wwds_8_tfdisenccli_sel = "" ;
      AV114Pedidos_dis___wwds_9_tfdisfecent = GXutil.nullDate() ;
      AV115Pedidos_dis___wwds_10_tfdisfecent_to = GXutil.nullDate() ;
      AV118Pedidos_dis___wwds_13_tfclinom = "" ;
      AV119Pedidos_dis___wwds_14_tfclinom_sel = "" ;
      AV120Pedidos_dis___wwds_15_tfdisartcod = "" ;
      AV121Pedidos_dis___wwds_16_tfdisartcod_sel = "" ;
      AV122Pedidos_dis___wwds_17_tfdisartdsc = "" ;
      AV123Pedidos_dis___wwds_18_tfdisartdsc_sel = "" ;
      AV124Pedidos_dis___wwds_19_tfdiscolnom = "" ;
      AV125Pedidos_dis___wwds_20_tfdiscolnom_sel = "" ;
      AV130Pedidos_dis___wwds_25_tfdisnomcli = "" ;
      AV131Pedidos_dis___wwds_26_tfdisnomcli_sel = "" ;
      AV134Pedidos_dis___wwds_29_tfmaqcoddis = "" ;
      AV135Pedidos_dis___wwds_30_tfmaqcoddis_sel = "" ;
      AV136Pedidos_dis___wwds_31_tfdisnumuni = DecimalUtil.ZERO ;
      AV137Pedidos_dis___wwds_32_tfdisnumuni_to = DecimalUtil.ZERO ;
      AV138Pedidos_dis___wwds_33_tfdisunimed = "" ;
      AV139Pedidos_dis___wwds_34_tfdisunimed_sel = "" ;
      lV106Pedidos_dis___wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV107Pedidos_dis___wwds_2_tfdisusrcod = "" ;
      lV110Pedidos_dis___wwds_5_tfdisclinum = "" ;
      lV112Pedidos_dis___wwds_7_tfdisenccli = "" ;
      lV118Pedidos_dis___wwds_13_tfclinom = "" ;
      lV120Pedidos_dis___wwds_15_tfdisartcod = "" ;
      lV122Pedidos_dis___wwds_17_tfdisartdsc = "" ;
      lV124Pedidos_dis___wwds_19_tfdiscolnom = "" ;
      lV130Pedidos_dis___wwds_25_tfdisnomcli = "" ;
      lV134Pedidos_dis___wwds_29_tfmaqcoddis = "" ;
      lV138Pedidos_dis___wwds_33_tfdisunimed = "" ;
      AV94DisFecFrom = GXutil.nullDate() ;
      AV95DisFecto = GXutil.nullDate() ;
      AV97DisFeccliFrom = GXutil.nullDate() ;
      AV98DisFecclito = GXutil.nullDate() ;
      P0A1Z2_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1Z2_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1Z2_A361DisCod = new int[1] ;
      P0A1Z2_A374DisNumPie = new short[1] ;
      P0A1Z2_A392DisUniMed = new String[] {""} ;
      P0A1Z2_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A1Z2_A1122MaqCodDis = new String[] {""} ;
      P0A1Z2_n1122MaqCodDis = new boolean[] {false} ;
      P0A1Z2_A1196DisNumCli = new int[1] ;
      P0A1Z2_A1195DisNomCli = new String[] {""} ;
      P0A1Z2_A390DisTipCol = new byte[1] ;
      P0A1Z2_n390DisTipCol = new boolean[] {false} ;
      P0A1Z2_A363DisColNum = new int[1] ;
      P0A1Z2_n363DisColNum = new boolean[] {false} ;
      P0A1Z2_A362DisColNom = new String[] {""} ;
      P0A1Z2_n362DisColNom = new boolean[] {false} ;
      P0A1Z2_A337DisArtDsc = new String[] {""} ;
      P0A1Z2_A335DisArtCod = new String[] {""} ;
      P0A1Z2_A279CliNom = new String[] {""} ;
      P0A1Z2_A252CliCod = new int[1] ;
      P0A1Z2_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A1Z2_A4813DisEncCli = new String[] {""} ;
      P0A1Z2_A360DisCliNum = new String[] {""} ;
      P0A1Z2_A4348DisUsrCod = new String[] {""} ;
      P0A1Z2_A367DisEst = new byte[1] ;
      P0A1Z2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV13DisEstDescription = "" ;
      AV15DisCliNumData = "" ;
      AV18DisEncCliData = "" ;
      AV20Session = httpContext.getWebSession();
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_int3 = new byte[1] ;
      AV88PageInfo = "" ;
      AV85DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV101Pgmdesc = "" ;
      AV83AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis___wwexportreport__default(),
         new Object[] {
             new Object[] {
            P0A1Z2_A370DisFecCli, P0A1Z2_A369DisFec, P0A1Z2_A361DisCod, P0A1Z2_A374DisNumPie, P0A1Z2_A392DisUniMed, P0A1Z2_A375DisNumUni, P0A1Z2_A1122MaqCodDis, P0A1Z2_n1122MaqCodDis, P0A1Z2_A1196DisNumCli, P0A1Z2_A1195DisNomCli,
            P0A1Z2_A390DisTipCol, P0A1Z2_n390DisTipCol, P0A1Z2_A363DisColNum, P0A1Z2_n363DisColNum, P0A1Z2_A362DisColNom, P0A1Z2_n362DisColNom, P0A1Z2_A337DisArtDsc, P0A1Z2_A335DisArtCod, P0A1Z2_A279CliNom, P0A1Z2_A252CliCod,
            P0A1Z2_A371DisFecEnt, P0A1Z2_A4813DisEncCli, P0A1Z2_A360DisCliNum, P0A1Z2_A4348DisUsrCod, P0A1Z2_A367DisEst, P0A1Z2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV101Pgmdesc = httpContext.getMessage( "Dis___WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV101Pgmdesc = httpContext.getMessage( "Dis___WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV29TFDisEst_Sel ;
   private byte AV54TFDisTipCol ;
   private byte AV55TFDisTipCol_To ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte AV128Pedidos_dis___wwds_23_tfdistipcol ;
   private byte AV129Pedidos_dis___wwds_24_tfdistipcol_to ;
   private byte GXt_int2 ;
   private byte GXv_int3[] ;
   private short gxcookieaux ;
   private short AV62TFDisNumPie ;
   private short AV63TFDisNumPie_To ;
   private short A374DisNumPie ;
   private short AV140Pedidos_dis___wwds_35_tfdisnumpie ;
   private short AV141Pedidos_dis___wwds_36_tfdisnumpie_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV104GXV1 ;
   private int AV42TFCliCod ;
   private int AV43TFCliCod_To ;
   private int AV52TFDisColNum ;
   private int AV53TFDisColNum_To ;
   private int AV58TFDisNumCli ;
   private int AV59TFDisNumCli_To ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1196DisNumCli ;
   private int AV116Pedidos_dis___wwds_11_tfclicod ;
   private int AV117Pedidos_dis___wwds_12_tfclicod_to ;
   private int AV126Pedidos_dis___wwds_21_tfdiscolnum ;
   private int AV127Pedidos_dis___wwds_22_tfdiscolnum_to ;
   private int AV132Pedidos_dis___wwds_27_tfdisnumcli ;
   private int AV133Pedidos_dis___wwds_28_tfdisnumcli_to ;
   private int AV109Pedidos_dis___wwds_4_tfdisest_sels_size ;
   private int AV96DisCod ;
   private int AV142GXV2 ;
   private long AV79i ;
   private java.math.BigDecimal AV64TFDisNumUni ;
   private java.math.BigDecimal AV65TFDisNumUni_To ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV136Pedidos_dis___wwds_31_tfdisnumuni ;
   private java.math.BigDecimal AV137Pedidos_dis___wwds_32_tfdisnumuni_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV25TFDisUsrCod_Sel ;
   private String AV24TFDisUsrCod ;
   private String AV31TFDisCliNum_Sel ;
   private String AV30TFDisCliNum ;
   private String AV33TFDisEncCli_Sel ;
   private String AV32TFDisEncCli ;
   private String AV45TFCliNom_Sel ;
   private String AV44TFCliNom ;
   private String AV47TFDisArtCod_Sel ;
   private String AV46TFDisArtCod ;
   private String AV49TFDisArtDsc_Sel ;
   private String AV48TFDisArtDsc ;
   private String AV51TFDisColNom_Sel ;
   private String AV50TFDisColNom ;
   private String AV57TFDisNomCli_Sel ;
   private String AV56TFDisNomCli ;
   private String AV61TFMaqCodDis_Sel ;
   private String AV60TFMaqCodDis ;
   private String AV67TFDisUniMed_Sel ;
   private String AV66TFDisUniMed ;
   private String A360DisCliNum ;
   private String A4813DisEncCli ;
   private String A4348DisUsrCod ;
   private String A279CliNom ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A1122MaqCodDis ;
   private String A392DisUniMed ;
   private String AV107Pedidos_dis___wwds_2_tfdisusrcod ;
   private String AV108Pedidos_dis___wwds_3_tfdisusrcod_sel ;
   private String AV110Pedidos_dis___wwds_5_tfdisclinum ;
   private String AV111Pedidos_dis___wwds_6_tfdisclinum_sel ;
   private String AV112Pedidos_dis___wwds_7_tfdisenccli ;
   private String AV113Pedidos_dis___wwds_8_tfdisenccli_sel ;
   private String AV118Pedidos_dis___wwds_13_tfclinom ;
   private String AV119Pedidos_dis___wwds_14_tfclinom_sel ;
   private String AV120Pedidos_dis___wwds_15_tfdisartcod ;
   private String AV121Pedidos_dis___wwds_16_tfdisartcod_sel ;
   private String AV122Pedidos_dis___wwds_17_tfdisartdsc ;
   private String AV123Pedidos_dis___wwds_18_tfdisartdsc_sel ;
   private String AV124Pedidos_dis___wwds_19_tfdiscolnom ;
   private String AV125Pedidos_dis___wwds_20_tfdiscolnom_sel ;
   private String AV130Pedidos_dis___wwds_25_tfdisnomcli ;
   private String AV131Pedidos_dis___wwds_26_tfdisnomcli_sel ;
   private String AV134Pedidos_dis___wwds_29_tfmaqcoddis ;
   private String AV135Pedidos_dis___wwds_30_tfmaqcoddis_sel ;
   private String AV138Pedidos_dis___wwds_33_tfdisunimed ;
   private String AV139Pedidos_dis___wwds_34_tfdisunimed_sel ;
   private String scmdbuf ;
   private String lV107Pedidos_dis___wwds_2_tfdisusrcod ;
   private String lV110Pedidos_dis___wwds_5_tfdisclinum ;
   private String lV112Pedidos_dis___wwds_7_tfdisenccli ;
   private String lV118Pedidos_dis___wwds_13_tfclinom ;
   private String lV120Pedidos_dis___wwds_15_tfdisartcod ;
   private String lV122Pedidos_dis___wwds_17_tfdisartdsc ;
   private String lV124Pedidos_dis___wwds_19_tfdiscolnom ;
   private String lV130Pedidos_dis___wwds_25_tfdisnomcli ;
   private String lV134Pedidos_dis___wwds_29_tfmaqcoddis ;
   private String lV138Pedidos_dis___wwds_33_tfdisunimed ;
   private String A396EmprCod ;
   private String AV15DisCliNumData ;
   private String AV18DisEncCliData ;
   private String AV101Pgmdesc ;
   private java.util.Date AV40TFDisFecEnt ;
   private java.util.Date AV41TFDisFecEnt_To ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date AV114Pedidos_dis___wwds_9_tfdisfecent ;
   private java.util.Date AV115Pedidos_dis___wwds_10_tfdisfecent_to ;
   private java.util.Date AV94DisFecFrom ;
   private java.util.Date AV95DisFecto ;
   private java.util.Date AV97DisFeccliFrom ;
   private java.util.Date AV98DisFecclito ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV14IsAuthorizedDisCliNum ;
   private boolean AV17IsAuthorizedDisEncCli ;
   private boolean AV11OrderedDsc ;
   private boolean n1122MaqCodDis ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private String AV26TFDisEst_SelsJson ;
   private String AV90Title ;
   private String AV12FilterFullText ;
   private String AV27TFDisEst_SelDscs ;
   private String AV68FilterTFDisEst_SelValueDescription ;
   private String AV72TFDisFecEnt_To_Description ;
   private String AV73TFCliCod_To_Description ;
   private String AV74TFDisColNum_To_Description ;
   private String AV75TFDisTipCol_To_Description ;
   private String AV76TFDisNumCli_To_Description ;
   private String AV78TFDisNumUni_To_Description ;
   private String AV77TFDisNumPie_To_Description ;
   private String AV16DisCliNumTitle ;
   private String AV19DisEncCliTitle ;
   private String AV106Pedidos_dis___wwds_1_filterfulltext ;
   private String lV106Pedidos_dis___wwds_1_filterfulltext ;
   private String AV13DisEstDescription ;
   private String AV88PageInfo ;
   private String AV85DateInfo ;
   private String AV83AppName ;
   private GXSimpleCollection<Byte> AV28TFDisEst_Sels ;
   private GXSimpleCollection<Byte> AV109Pedidos_dis___wwds_4_tfdisest_sels ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0A1Z2_A370DisFecCli ;
   private java.util.Date[] P0A1Z2_A369DisFec ;
   private int[] P0A1Z2_A361DisCod ;
   private short[] P0A1Z2_A374DisNumPie ;
   private String[] P0A1Z2_A392DisUniMed ;
   private java.math.BigDecimal[] P0A1Z2_A375DisNumUni ;
   private String[] P0A1Z2_A1122MaqCodDis ;
   private boolean[] P0A1Z2_n1122MaqCodDis ;
   private int[] P0A1Z2_A1196DisNumCli ;
   private String[] P0A1Z2_A1195DisNomCli ;
   private byte[] P0A1Z2_A390DisTipCol ;
   private boolean[] P0A1Z2_n390DisTipCol ;
   private int[] P0A1Z2_A363DisColNum ;
   private boolean[] P0A1Z2_n363DisColNum ;
   private String[] P0A1Z2_A362DisColNom ;
   private boolean[] P0A1Z2_n362DisColNom ;
   private String[] P0A1Z2_A337DisArtDsc ;
   private String[] P0A1Z2_A335DisArtCod ;
   private String[] P0A1Z2_A279CliNom ;
   private int[] P0A1Z2_A252CliCod ;
   private java.util.Date[] P0A1Z2_A371DisFecEnt ;
   private String[] P0A1Z2_A4813DisEncCli ;
   private String[] P0A1Z2_A360DisCliNum ;
   private String[] P0A1Z2_A4348DisUsrCod ;
   private byte[] P0A1Z2_A367DisEst ;
   private String[] P0A1Z2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
}

final  class dis___wwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A1Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV109Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV108Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV107Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV109Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV111Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV110Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV113Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV112Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV114Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV115Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV116Pedidos_dis___wwds_11_tfclicod ,
                                          int AV117Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV119Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV118Pedidos_dis___wwds_13_tfclinom ,
                                          String AV121Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV120Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV123Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV122Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV125Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV124Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV126Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV127Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV128Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV129Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV131Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV130Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV132Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV133Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV135Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV134Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV136Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV137Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV139Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV138Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV140Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV141Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV96DisCod ,
                                          java.util.Date AV94DisFecFrom ,
                                          java.util.Date AV95DisFecto ,
                                          java.util.Date AV97DisFeccliFrom ,
                                          java.util.Date AV98DisFecclito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV106Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[39];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom," ;
      scmdbuf += " T1.DisArtDsc, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst, T1.EmprCod FROM (TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV108Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( AV109Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV109Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV111Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV110Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV112Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV114Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV115Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV118Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV120Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV122Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV124Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV126Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV127Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV128Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV129Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV130Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV132Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV133Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV134Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV138Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV140Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV141Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV96DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV10OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.DisFec DESC, T1.DisCod DESC, T1.DisEst" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEst" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEst DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCliNum" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCliNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEncCli" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEncCli DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecCli" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecCli DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisTipCol" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisTipCol DESC" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumCli" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumCli DESC" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis DESC" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumUni" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumUni DESC" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      else if ( ( AV10OrderedBy == 22 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumPie" ;
      }
      else if ( ( AV10OrderedBy == 22 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumPie DESC" ;
      }
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P0A1Z2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A1Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 26);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((String[]) buf[18])[0] = rslt.getString(15, 30);
               ((int[]) buf[19])[0] = rslt.getInt(16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 20);
               ((String[]) buf[22])[0] = rslt.getString(19, 8);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 3);
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
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
      }
   }

}

