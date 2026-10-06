package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class dis__wwexportreport_impl extends GXWebReport
{
   public dis__wwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV64Title = httpContext.getMessage( "Lista de Pedidos", "") ;
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
         h9VF0( true, 0) ;
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
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFDisUsrCod_Sel)==0) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67TFDisUsrCod_Sel, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV66TFDisUsrCod)==0) )
         {
            h9VF0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66TFDisUsrCod, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV43TFDisEst_Sels.fromJSonString(AV41TFDisEst_SelsJson, null);
      if ( ! ( AV43TFDisEst_Sels.size() == 0 ) )
      {
         AV53i = 1 ;
         AV98GXV1 = 1 ;
         while ( AV98GXV1 <= AV43TFDisEst_Sels.size() )
         {
            AV44TFDisEst_Sel = ((Number) AV43TFDisEst_Sels.elementAt(-1+AV98GXV1)).byteValue() ;
            if ( AV53i == 1 )
            {
               AV42TFDisEst_SelDscs = "" ;
            }
            else
            {
               AV42TFDisEst_SelDscs += ", " ;
            }
            AV52FilterTFDisEst_SelValueDescription = "" ;
            if ( AV44TFDisEst_Sel == 1 )
            {
               AV52FilterTFDisEst_SelValueDescription = httpContext.getMessage( "En Pedido", "") ;
            }
            else if ( AV44TFDisEst_Sel == 3 )
            {
               AV52FilterTFDisEst_SelValueDescription = httpContext.getMessage( "En Produccion", "") ;
            }
            AV42TFDisEst_SelDscs += AV52FilterTFDisEst_SelValueDescription ;
            AV53i = (long)(AV53i+1) ;
            AV98GXV1 = (int)(AV98GXV1+1) ;
         }
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFDisEst_SelDscs, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV75TFDisCliNum_Sel)==0) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ped. Cli.", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV75TFDisCliNum_Sel, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV74TFDisCliNum)==0) )
         {
            h9VF0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ped. Cli.", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TFDisCliNum, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV77TFDisEncCli_Sel)==0) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Ped. Cli.", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TFDisEncCli_Sel, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV76TFDisEncCli)==0) )
         {
            h9VF0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Ped. Cli.", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV76TFDisEncCli, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV18TFDisCod) && (0==AV19TFDisCod_To) ) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nr.Enc", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFDisCod), "ZZZZZZZ9")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV45TFDisCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nr.Enc", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFDisCod_To_Description, "")), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFDisCod_To), "ZZZZZZZ9")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20TFDisFecCli)) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Data ped.", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV20TFDisFecCli, "99/99/99"), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22TFDisFec)) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Data reg.", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV22TFDisFec, "99/99/99"), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25TFDisFecEnt)) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Data entr.", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV25TFDisFecEnt, "99/99/99"), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV27TFCliCod) && (0==AV28TFCliCod_To) ) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFCliCod), "ZZZZZ9")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV49TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49TFCliCod_To_Description, "")), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFCliCod_To), "ZZZZZ9")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV30TFCliNom_Sel)==0) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFCliNom_Sel, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFCliNom)==0) )
         {
            h9VF0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFCliNom, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV32TFDisArtCod_Sel)==0) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFDisArtCod_Sel, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFDisArtCod)==0) )
         {
            h9VF0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFDisArtCod, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV34TFDisArtDsc_Sel)==0) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFDisArtDsc_Sel, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV33TFDisArtDsc)==0) )
         {
            h9VF0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFDisArtDsc, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV36TFDisColNom_Sel)==0) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFDisColNom_Sel, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV35TFDisColNom)==0) )
         {
            h9VF0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFDisColNom, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV37TFDisColNum) && (0==AV38TFDisColNum_To) ) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cor. Núm", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV37TFDisColNum), "ZZZZZ9")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV50TFDisColNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cor. Núm", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50TFDisColNum_To_Description, "")), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV38TFDisColNum_To), "ZZZZZ9")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV39TFDisTipCol) && (0==AV40TFDisTipCol_To) ) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "TC", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39TFDisTipCol), "Z9")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV51TFDisTipCol_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "TC", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51TFDisTipCol_To_Description, "")), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40TFDisTipCol_To), "Z9")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV79TFDisNomCli_Sel)==0) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Color Cliente", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFDisNomCli_Sel, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV78TFDisNomCli)==0) )
         {
            h9VF0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Color Cliente", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV78TFDisNomCli, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV80TFDisNumCli) && (0==AV81TFDisNumCli_To) ) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV80TFDisNumCli), "ZZZZZ9")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV90TFDisNumCli_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Numero", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV90TFDisNumCli_To_Description, "")), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV81TFDisNumCli_To), "ZZZZZ9")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV83TFMaqCodDis_Sel)==0) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV83TFMaqCodDis_Sel, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV82TFMaqCodDis)==0) )
         {
            h9VF0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Maquina", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82TFMaqCodDis, "")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV84TFDisNumPie) && (0==AV85TFDisNumPie_To) ) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV84TFDisNumPie), "ZZZ9")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV91TFDisNumPie_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Piezas", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV91TFDisNumPie_To_Description, "")), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV85TFDisNumPie_To), "ZZZ9")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFDisNumUni)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFDisNumUni_To)==0) ) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV86TFDisNumUni, "ZZZZZ9.99")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV92TFDisNumUni_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unidades", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92TFDisNumUni_To_Description, "")), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87TFDisNumUni_To, "ZZZZZ9.99")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV89TFDisUniMed_Sel)==0) )
      {
         h9VF0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Und.", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89TFDisUniMed_Sel, "@!")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV88TFDisUniMed)==0) )
         {
            h9VF0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Und.", ""), 25, Gx_line+0, 117, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88TFDisUniMed, "@!")), 117, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9VF0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      if ( AV68IsAuthorizedDisCliNum )
      {
         AV70DisCliNumTitle = httpContext.getMessage( "Ped. Cli.", "") ;
      }
      if ( AV71IsAuthorizedDisEncCli )
      {
         AV73DisEncCliTitle = httpContext.getMessage( "Ped. Cli.", "") ;
      }
      h9VF0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 30, Gx_line+10, 62, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 66, Gx_line+10, 98, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70DisCliNumTitle, "")), 102, Gx_line+10, 134, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73DisEncCliTitle, "")), 138, Gx_line+10, 170, Gx_line+27, 0, 0, 0, 0) ;
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
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas", ""), 680, Gx_line+10, 713, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidades", ""), 717, Gx_line+10, 750, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Und.", ""), 754, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV100Pedidos_dis__wwds_1_filterfulltext = AV12FilterFullText ;
      AV101Pedidos_dis__wwds_2_tfdisusrcod = AV66TFDisUsrCod ;
      AV102Pedidos_dis__wwds_3_tfdisusrcod_sel = AV67TFDisUsrCod_Sel ;
      AV103Pedidos_dis__wwds_4_tfdisest_sels = AV43TFDisEst_Sels ;
      AV104Pedidos_dis__wwds_5_tfdisclinum = AV74TFDisCliNum ;
      AV105Pedidos_dis__wwds_6_tfdisclinum_sel = AV75TFDisCliNum_Sel ;
      AV106Pedidos_dis__wwds_7_tfdisenccli = AV76TFDisEncCli ;
      AV107Pedidos_dis__wwds_8_tfdisenccli_sel = AV77TFDisEncCli_Sel ;
      AV108Pedidos_dis__wwds_9_tfdiscod = AV18TFDisCod ;
      AV109Pedidos_dis__wwds_10_tfdiscod_to = AV19TFDisCod_To ;
      AV110Pedidos_dis__wwds_11_tfdisfeccli = AV20TFDisFecCli ;
      AV111Pedidos_dis__wwds_12_tfdisfec = AV22TFDisFec ;
      AV112Pedidos_dis__wwds_13_tfdisfecent = AV25TFDisFecEnt ;
      AV113Pedidos_dis__wwds_14_tfclicod = AV27TFCliCod ;
      AV114Pedidos_dis__wwds_15_tfclicod_to = AV28TFCliCod_To ;
      AV115Pedidos_dis__wwds_16_tfclinom = AV29TFCliNom ;
      AV116Pedidos_dis__wwds_17_tfclinom_sel = AV30TFCliNom_Sel ;
      AV117Pedidos_dis__wwds_18_tfdisartcod = AV31TFDisArtCod ;
      AV118Pedidos_dis__wwds_19_tfdisartcod_sel = AV32TFDisArtCod_Sel ;
      AV119Pedidos_dis__wwds_20_tfdisartdsc = AV33TFDisArtDsc ;
      AV120Pedidos_dis__wwds_21_tfdisartdsc_sel = AV34TFDisArtDsc_Sel ;
      AV121Pedidos_dis__wwds_22_tfdiscolnom = AV35TFDisColNom ;
      AV122Pedidos_dis__wwds_23_tfdiscolnom_sel = AV36TFDisColNom_Sel ;
      AV123Pedidos_dis__wwds_24_tfdiscolnum = AV37TFDisColNum ;
      AV124Pedidos_dis__wwds_25_tfdiscolnum_to = AV38TFDisColNum_To ;
      AV125Pedidos_dis__wwds_26_tfdistipcol = AV39TFDisTipCol ;
      AV126Pedidos_dis__wwds_27_tfdistipcol_to = AV40TFDisTipCol_To ;
      AV127Pedidos_dis__wwds_28_tfdisnomcli = AV78TFDisNomCli ;
      AV128Pedidos_dis__wwds_29_tfdisnomcli_sel = AV79TFDisNomCli_Sel ;
      AV129Pedidos_dis__wwds_30_tfdisnumcli = AV80TFDisNumCli ;
      AV130Pedidos_dis__wwds_31_tfdisnumcli_to = AV81TFDisNumCli_To ;
      AV131Pedidos_dis__wwds_32_tfmaqcoddis = AV82TFMaqCodDis ;
      AV132Pedidos_dis__wwds_33_tfmaqcoddis_sel = AV83TFMaqCodDis_Sel ;
      AV133Pedidos_dis__wwds_34_tfdisnumpie = AV84TFDisNumPie ;
      AV134Pedidos_dis__wwds_35_tfdisnumpie_to = AV85TFDisNumPie_To ;
      AV135Pedidos_dis__wwds_36_tfdisnumuni = AV86TFDisNumUni ;
      AV136Pedidos_dis__wwds_37_tfdisnumuni_to = AV87TFDisNumUni_To ;
      AV137Pedidos_dis__wwds_38_tfdisunimed = AV88TFDisUniMed ;
      AV138Pedidos_dis__wwds_39_tfdisunimed_sel = AV89TFDisUniMed_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV103Pedidos_dis__wwds_4_tfdisest_sels ,
                                           AV102Pedidos_dis__wwds_3_tfdisusrcod_sel ,
                                           AV101Pedidos_dis__wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV103Pedidos_dis__wwds_4_tfdisest_sels.size()) ,
                                           AV105Pedidos_dis__wwds_6_tfdisclinum_sel ,
                                           AV104Pedidos_dis__wwds_5_tfdisclinum ,
                                           AV107Pedidos_dis__wwds_8_tfdisenccli_sel ,
                                           AV106Pedidos_dis__wwds_7_tfdisenccli ,
                                           Integer.valueOf(AV108Pedidos_dis__wwds_9_tfdiscod) ,
                                           Integer.valueOf(AV109Pedidos_dis__wwds_10_tfdiscod_to) ,
                                           AV110Pedidos_dis__wwds_11_tfdisfeccli ,
                                           AV111Pedidos_dis__wwds_12_tfdisfec ,
                                           AV112Pedidos_dis__wwds_13_tfdisfecent ,
                                           Integer.valueOf(AV113Pedidos_dis__wwds_14_tfclicod) ,
                                           Integer.valueOf(AV114Pedidos_dis__wwds_15_tfclicod_to) ,
                                           AV116Pedidos_dis__wwds_17_tfclinom_sel ,
                                           AV115Pedidos_dis__wwds_16_tfclinom ,
                                           AV118Pedidos_dis__wwds_19_tfdisartcod_sel ,
                                           AV117Pedidos_dis__wwds_18_tfdisartcod ,
                                           AV120Pedidos_dis__wwds_21_tfdisartdsc_sel ,
                                           AV119Pedidos_dis__wwds_20_tfdisartdsc ,
                                           AV122Pedidos_dis__wwds_23_tfdiscolnom_sel ,
                                           AV121Pedidos_dis__wwds_22_tfdiscolnom ,
                                           Integer.valueOf(AV123Pedidos_dis__wwds_24_tfdiscolnum) ,
                                           Integer.valueOf(AV124Pedidos_dis__wwds_25_tfdiscolnum_to) ,
                                           Byte.valueOf(AV125Pedidos_dis__wwds_26_tfdistipcol) ,
                                           Byte.valueOf(AV126Pedidos_dis__wwds_27_tfdistipcol_to) ,
                                           AV128Pedidos_dis__wwds_29_tfdisnomcli_sel ,
                                           AV127Pedidos_dis__wwds_28_tfdisnomcli ,
                                           Integer.valueOf(AV129Pedidos_dis__wwds_30_tfdisnumcli) ,
                                           Integer.valueOf(AV130Pedidos_dis__wwds_31_tfdisnumcli_to) ,
                                           AV132Pedidos_dis__wwds_33_tfmaqcoddis_sel ,
                                           AV131Pedidos_dis__wwds_32_tfmaqcoddis ,
                                           Short.valueOf(AV133Pedidos_dis__wwds_34_tfdisnumpie) ,
                                           Short.valueOf(AV134Pedidos_dis__wwds_35_tfdisnumpie_to) ,
                                           AV135Pedidos_dis__wwds_36_tfdisnumuni ,
                                           AV136Pedidos_dis__wwds_37_tfdisnumuni_to ,
                                           AV138Pedidos_dis__wwds_39_tfdisunimed_sel ,
                                           AV137Pedidos_dis__wwds_38_tfdisunimed ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           Integer.valueOf(A361DisCod) ,
                                           A370DisFecCli ,
                                           A369DisFec ,
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
                                           Short.valueOf(A374DisNumPie) ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV100Pedidos_dis__wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV101Pedidos_dis__wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV101Pedidos_dis__wwds_2_tfdisusrcod), 8, "%") ;
      lV104Pedidos_dis__wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV104Pedidos_dis__wwds_5_tfdisclinum), 8, "%") ;
      lV106Pedidos_dis__wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis__wwds_7_tfdisenccli), 20, "%") ;
      lV115Pedidos_dis__wwds_16_tfclinom = GXutil.padr( GXutil.rtrim( AV115Pedidos_dis__wwds_16_tfclinom), 30, "%") ;
      lV117Pedidos_dis__wwds_18_tfdisartcod = GXutil.padr( GXutil.rtrim( AV117Pedidos_dis__wwds_18_tfdisartcod), 16, "%") ;
      lV119Pedidos_dis__wwds_20_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV119Pedidos_dis__wwds_20_tfdisartdsc), 26, "%") ;
      lV121Pedidos_dis__wwds_22_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV121Pedidos_dis__wwds_22_tfdiscolnom), 13, "%") ;
      lV127Pedidos_dis__wwds_28_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV127Pedidos_dis__wwds_28_tfdisnomcli), 13, "%") ;
      lV131Pedidos_dis__wwds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV131Pedidos_dis__wwds_32_tfmaqcoddis), 6, "%") ;
      lV137Pedidos_dis__wwds_38_tfdisunimed = GXutil.padr( GXutil.rtrim( AV137Pedidos_dis__wwds_38_tfdisunimed), 1, "%") ;
      /* Using cursor P09VF2 */
      pr_default.execute(0, new Object[] {lV101Pedidos_dis__wwds_2_tfdisusrcod, AV102Pedidos_dis__wwds_3_tfdisusrcod_sel, lV104Pedidos_dis__wwds_5_tfdisclinum, AV105Pedidos_dis__wwds_6_tfdisclinum_sel, lV106Pedidos_dis__wwds_7_tfdisenccli, AV107Pedidos_dis__wwds_8_tfdisenccli_sel, Integer.valueOf(AV108Pedidos_dis__wwds_9_tfdiscod), Integer.valueOf(AV109Pedidos_dis__wwds_10_tfdiscod_to), AV110Pedidos_dis__wwds_11_tfdisfeccli, AV111Pedidos_dis__wwds_12_tfdisfec, AV112Pedidos_dis__wwds_13_tfdisfecent, Integer.valueOf(AV113Pedidos_dis__wwds_14_tfclicod), Integer.valueOf(AV114Pedidos_dis__wwds_15_tfclicod_to), lV115Pedidos_dis__wwds_16_tfclinom, AV116Pedidos_dis__wwds_17_tfclinom_sel, lV117Pedidos_dis__wwds_18_tfdisartcod, AV118Pedidos_dis__wwds_19_tfdisartcod_sel, lV119Pedidos_dis__wwds_20_tfdisartdsc, AV120Pedidos_dis__wwds_21_tfdisartdsc_sel, lV121Pedidos_dis__wwds_22_tfdiscolnom, AV122Pedidos_dis__wwds_23_tfdiscolnom_sel, Integer.valueOf(AV123Pedidos_dis__wwds_24_tfdiscolnum), Integer.valueOf(AV124Pedidos_dis__wwds_25_tfdiscolnum_to), Byte.valueOf(AV125Pedidos_dis__wwds_26_tfdistipcol), Byte.valueOf(AV126Pedidos_dis__wwds_27_tfdistipcol_to), lV127Pedidos_dis__wwds_28_tfdisnomcli, AV128Pedidos_dis__wwds_29_tfdisnomcli_sel, Integer.valueOf(AV129Pedidos_dis__wwds_30_tfdisnumcli), Integer.valueOf(AV130Pedidos_dis__wwds_31_tfdisnumcli_to), lV131Pedidos_dis__wwds_32_tfmaqcoddis, AV132Pedidos_dis__wwds_33_tfmaqcoddis_sel, Short.valueOf(AV133Pedidos_dis__wwds_34_tfdisnumpie), Short.valueOf(AV134Pedidos_dis__wwds_35_tfdisnumpie_to), AV135Pedidos_dis__wwds_36_tfdisnumuni, AV136Pedidos_dis__wwds_37_tfdisnumuni_to, lV137Pedidos_dis__wwds_38_tfdisunimed, AV138Pedidos_dis__wwds_39_tfdisunimed_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A392DisUniMed = P09VF2_A392DisUniMed[0] ;
         A375DisNumUni = P09VF2_A375DisNumUni[0] ;
         A374DisNumPie = P09VF2_A374DisNumPie[0] ;
         A1122MaqCodDis = P09VF2_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P09VF2_n1122MaqCodDis[0] ;
         A1196DisNumCli = P09VF2_A1196DisNumCli[0] ;
         A1195DisNomCli = P09VF2_A1195DisNomCli[0] ;
         A390DisTipCol = P09VF2_A390DisTipCol[0] ;
         n390DisTipCol = P09VF2_n390DisTipCol[0] ;
         A363DisColNum = P09VF2_A363DisColNum[0] ;
         n363DisColNum = P09VF2_n363DisColNum[0] ;
         A362DisColNom = P09VF2_A362DisColNom[0] ;
         n362DisColNom = P09VF2_n362DisColNom[0] ;
         A337DisArtDsc = P09VF2_A337DisArtDsc[0] ;
         A335DisArtCod = P09VF2_A335DisArtCod[0] ;
         A279CliNom = P09VF2_A279CliNom[0] ;
         A252CliCod = P09VF2_A252CliCod[0] ;
         A371DisFecEnt = P09VF2_A371DisFecEnt[0] ;
         A369DisFec = P09VF2_A369DisFec[0] ;
         A370DisFecCli = P09VF2_A370DisFecCli[0] ;
         A361DisCod = P09VF2_A361DisCod[0] ;
         A4813DisEncCli = P09VF2_A4813DisEncCli[0] ;
         A360DisCliNum = P09VF2_A360DisCliNum[0] ;
         A4348DisUsrCod = P09VF2_A4348DisUsrCod[0] ;
         A367DisEst = P09VF2_A367DisEst[0] ;
         A396EmprCod = P09VF2_A396EmprCod[0] ;
         A279CliNom = P09VF2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV100Pedidos_dis__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV100Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV100Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV100Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV100Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV100Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV100Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV100Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV100Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV100Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV100Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV100Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV100Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV100Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV100Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV100Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV100Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV100Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV100Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV100Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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
            if ( AV68IsAuthorizedDisCliNum )
            {
               AV69DisCliNumData = A360DisCliNum ;
            }
            if ( AV71IsAuthorizedDisEncCli )
            {
               AV72DisEncCliData = A4813DisEncCli ;
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
            h9VF0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A4348DisUsrCod, "")), 30, Gx_line+10, 62, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13DisEstDescription, "")), 66, Gx_line+10, 98, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69DisCliNumData, "")), 102, Gx_line+10, 134, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72DisEncCliData, "")), 138, Gx_line+10, 170, Gx_line+25, 0, 0, 0, 0) ;
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
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9")), 680, Gx_line+10, 713, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A375DisNumUni, "ZZZZZ9.99")), 717, Gx_line+10, 750, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), 754, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV14Session.getValue("Pedidos.Dis__WWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.Dis__WWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("Pedidos.Dis__WWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV139GXV2 = 1 ;
      while ( AV139GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV139GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV66TFDisUsrCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV67TFDisUsrCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISEST_SEL") == 0 )
         {
            AV41TFDisEst_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV43TFDisEst_Sels.fromJSonString(AV41TFDisEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV74TFDisCliNum = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV75TFDisCliNum_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI") == 0 )
         {
            AV76TFDisEncCli = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI_SEL") == 0 )
         {
            AV77TFDisEncCli_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV18TFDisCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFDisCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECCLI") == 0 )
         {
            AV20TFDisFecCli = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV22TFDisFec = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECENT") == 0 )
         {
            AV25TFDisFecEnt = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV27TFCliCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV28TFCliCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV29TFCliNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV30TFCliNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV31TFDisArtCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV32TFDisArtCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV33TFDisArtDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV34TFDisArtDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV35TFDisColNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV36TFDisColNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV37TFDisColNum = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFDisColNum_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV39TFDisTipCol = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFDisTipCol_To = (byte)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV78TFDisNomCli = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV79TFDisNomCli_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMCLI") == 0 )
         {
            AV80TFDisNumCli = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV81TFDisNumCli_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS") == 0 )
         {
            AV82TFMaqCodDis = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS_SEL") == 0 )
         {
            AV83TFMaqCodDis_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMPIE") == 0 )
         {
            AV84TFDisNumPie = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV85TFDisNumPie_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMUNI") == 0 )
         {
            AV86TFDisNumUni = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV87TFDisNumUni_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV88TFDisUniMed = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV89TFDisUniMed_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV139GXV2 = (int)(AV139GXV2+1) ;
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
      dis__wwexportreport_impl.this.GXt_int2 = GXv_int3[0] ;
      AV68IsAuthorizedDisCliNum = (boolean)(((GXt_int2==0))) ;
      GXt_int2 = (byte)(0) ;
      GXv_int3[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int3) ;
      dis__wwexportreport_impl.this.GXt_int2 = GXv_int3[0] ;
      AV71IsAuthorizedDisEncCli = (boolean)(((GXt_int2==1))) ;
   }

   public void h9VF0( boolean bFoot ,
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
               AV62PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV59DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV64Title = AV95Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV64Title = "" ;
      AV12FilterFullText = "" ;
      AV67TFDisUsrCod_Sel = "" ;
      AV66TFDisUsrCod = "" ;
      AV43TFDisEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV41TFDisEst_SelsJson = "" ;
      AV42TFDisEst_SelDscs = "" ;
      AV52FilterTFDisEst_SelValueDescription = "" ;
      AV75TFDisCliNum_Sel = "" ;
      AV74TFDisCliNum = "" ;
      AV77TFDisEncCli_Sel = "" ;
      AV76TFDisEncCli = "" ;
      AV45TFDisCod_To_Description = "" ;
      AV20TFDisFecCli = GXutil.nullDate() ;
      AV22TFDisFec = GXutil.nullDate() ;
      AV25TFDisFecEnt = GXutil.nullDate() ;
      AV49TFCliCod_To_Description = "" ;
      AV30TFCliNom_Sel = "" ;
      AV29TFCliNom = "" ;
      AV32TFDisArtCod_Sel = "" ;
      AV31TFDisArtCod = "" ;
      AV34TFDisArtDsc_Sel = "" ;
      AV33TFDisArtDsc = "" ;
      AV36TFDisColNom_Sel = "" ;
      AV35TFDisColNom = "" ;
      AV50TFDisColNum_To_Description = "" ;
      AV51TFDisTipCol_To_Description = "" ;
      AV79TFDisNomCli_Sel = "" ;
      AV78TFDisNomCli = "" ;
      AV90TFDisNumCli_To_Description = "" ;
      AV83TFMaqCodDis_Sel = "" ;
      AV82TFMaqCodDis = "" ;
      AV91TFDisNumPie_To_Description = "" ;
      AV86TFDisNumUni = DecimalUtil.ZERO ;
      AV87TFDisNumUni_To = DecimalUtil.ZERO ;
      AV92TFDisNumUni_To_Description = "" ;
      AV89TFDisUniMed_Sel = "" ;
      AV88TFDisUniMed = "" ;
      AV70DisCliNumTitle = "" ;
      AV73DisEncCliTitle = "" ;
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
      AV100Pedidos_dis__wwds_1_filterfulltext = "" ;
      AV101Pedidos_dis__wwds_2_tfdisusrcod = "" ;
      AV102Pedidos_dis__wwds_3_tfdisusrcod_sel = "" ;
      AV103Pedidos_dis__wwds_4_tfdisest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV104Pedidos_dis__wwds_5_tfdisclinum = "" ;
      AV105Pedidos_dis__wwds_6_tfdisclinum_sel = "" ;
      AV106Pedidos_dis__wwds_7_tfdisenccli = "" ;
      AV107Pedidos_dis__wwds_8_tfdisenccli_sel = "" ;
      AV110Pedidos_dis__wwds_11_tfdisfeccli = GXutil.nullDate() ;
      AV111Pedidos_dis__wwds_12_tfdisfec = GXutil.nullDate() ;
      AV112Pedidos_dis__wwds_13_tfdisfecent = GXutil.nullDate() ;
      AV115Pedidos_dis__wwds_16_tfclinom = "" ;
      AV116Pedidos_dis__wwds_17_tfclinom_sel = "" ;
      AV117Pedidos_dis__wwds_18_tfdisartcod = "" ;
      AV118Pedidos_dis__wwds_19_tfdisartcod_sel = "" ;
      AV119Pedidos_dis__wwds_20_tfdisartdsc = "" ;
      AV120Pedidos_dis__wwds_21_tfdisartdsc_sel = "" ;
      AV121Pedidos_dis__wwds_22_tfdiscolnom = "" ;
      AV122Pedidos_dis__wwds_23_tfdiscolnom_sel = "" ;
      AV127Pedidos_dis__wwds_28_tfdisnomcli = "" ;
      AV128Pedidos_dis__wwds_29_tfdisnomcli_sel = "" ;
      AV131Pedidos_dis__wwds_32_tfmaqcoddis = "" ;
      AV132Pedidos_dis__wwds_33_tfmaqcoddis_sel = "" ;
      AV135Pedidos_dis__wwds_36_tfdisnumuni = DecimalUtil.ZERO ;
      AV136Pedidos_dis__wwds_37_tfdisnumuni_to = DecimalUtil.ZERO ;
      AV137Pedidos_dis__wwds_38_tfdisunimed = "" ;
      AV138Pedidos_dis__wwds_39_tfdisunimed_sel = "" ;
      lV100Pedidos_dis__wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV101Pedidos_dis__wwds_2_tfdisusrcod = "" ;
      lV104Pedidos_dis__wwds_5_tfdisclinum = "" ;
      lV106Pedidos_dis__wwds_7_tfdisenccli = "" ;
      lV115Pedidos_dis__wwds_16_tfclinom = "" ;
      lV117Pedidos_dis__wwds_18_tfdisartcod = "" ;
      lV119Pedidos_dis__wwds_20_tfdisartdsc = "" ;
      lV121Pedidos_dis__wwds_22_tfdiscolnom = "" ;
      lV127Pedidos_dis__wwds_28_tfdisnomcli = "" ;
      lV131Pedidos_dis__wwds_32_tfmaqcoddis = "" ;
      lV137Pedidos_dis__wwds_38_tfdisunimed = "" ;
      P09VF2_A392DisUniMed = new String[] {""} ;
      P09VF2_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09VF2_A374DisNumPie = new short[1] ;
      P09VF2_A1122MaqCodDis = new String[] {""} ;
      P09VF2_n1122MaqCodDis = new boolean[] {false} ;
      P09VF2_A1196DisNumCli = new int[1] ;
      P09VF2_A1195DisNomCli = new String[] {""} ;
      P09VF2_A390DisTipCol = new byte[1] ;
      P09VF2_n390DisTipCol = new boolean[] {false} ;
      P09VF2_A363DisColNum = new int[1] ;
      P09VF2_n363DisColNum = new boolean[] {false} ;
      P09VF2_A362DisColNom = new String[] {""} ;
      P09VF2_n362DisColNom = new boolean[] {false} ;
      P09VF2_A337DisArtDsc = new String[] {""} ;
      P09VF2_A335DisArtCod = new String[] {""} ;
      P09VF2_A279CliNom = new String[] {""} ;
      P09VF2_A252CliCod = new int[1] ;
      P09VF2_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09VF2_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09VF2_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09VF2_A361DisCod = new int[1] ;
      P09VF2_A4813DisEncCli = new String[] {""} ;
      P09VF2_A360DisCliNum = new String[] {""} ;
      P09VF2_A4348DisUsrCod = new String[] {""} ;
      P09VF2_A367DisEst = new byte[1] ;
      P09VF2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV13DisEstDescription = "" ;
      AV69DisCliNumData = "" ;
      AV72DisEncCliData = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_int3 = new byte[1] ;
      AV62PageInfo = "" ;
      AV59DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV95Pgmdesc = "" ;
      AV57AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis__wwexportreport__default(),
         new Object[] {
             new Object[] {
            P09VF2_A392DisUniMed, P09VF2_A375DisNumUni, P09VF2_A374DisNumPie, P09VF2_A1122MaqCodDis, P09VF2_n1122MaqCodDis, P09VF2_A1196DisNumCli, P09VF2_A1195DisNomCli, P09VF2_A390DisTipCol, P09VF2_n390DisTipCol, P09VF2_A363DisColNum,
            P09VF2_n363DisColNum, P09VF2_A362DisColNom, P09VF2_n362DisColNom, P09VF2_A337DisArtDsc, P09VF2_A335DisArtCod, P09VF2_A279CliNom, P09VF2_A252CliCod, P09VF2_A371DisFecEnt, P09VF2_A369DisFec, P09VF2_A370DisFecCli,
            P09VF2_A361DisCod, P09VF2_A4813DisEncCli, P09VF2_A360DisCliNum, P09VF2_A4348DisUsrCod, P09VF2_A367DisEst, P09VF2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV95Pgmdesc = httpContext.getMessage( "Dis__WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV95Pgmdesc = httpContext.getMessage( "Dis__WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV44TFDisEst_Sel ;
   private byte AV39TFDisTipCol ;
   private byte AV40TFDisTipCol_To ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte AV125Pedidos_dis__wwds_26_tfdistipcol ;
   private byte AV126Pedidos_dis__wwds_27_tfdistipcol_to ;
   private byte GXt_int2 ;
   private byte GXv_int3[] ;
   private short gxcookieaux ;
   private short AV84TFDisNumPie ;
   private short AV85TFDisNumPie_To ;
   private short A374DisNumPie ;
   private short AV133Pedidos_dis__wwds_34_tfdisnumpie ;
   private short AV134Pedidos_dis__wwds_35_tfdisnumpie_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV98GXV1 ;
   private int AV18TFDisCod ;
   private int AV19TFDisCod_To ;
   private int AV27TFCliCod ;
   private int AV28TFCliCod_To ;
   private int AV37TFDisColNum ;
   private int AV38TFDisColNum_To ;
   private int AV80TFDisNumCli ;
   private int AV81TFDisNumCli_To ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1196DisNumCli ;
   private int AV108Pedidos_dis__wwds_9_tfdiscod ;
   private int AV109Pedidos_dis__wwds_10_tfdiscod_to ;
   private int AV113Pedidos_dis__wwds_14_tfclicod ;
   private int AV114Pedidos_dis__wwds_15_tfclicod_to ;
   private int AV123Pedidos_dis__wwds_24_tfdiscolnum ;
   private int AV124Pedidos_dis__wwds_25_tfdiscolnum_to ;
   private int AV129Pedidos_dis__wwds_30_tfdisnumcli ;
   private int AV130Pedidos_dis__wwds_31_tfdisnumcli_to ;
   private int AV103Pedidos_dis__wwds_4_tfdisest_sels_size ;
   private int AV139GXV2 ;
   private long AV53i ;
   private java.math.BigDecimal AV86TFDisNumUni ;
   private java.math.BigDecimal AV87TFDisNumUni_To ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV135Pedidos_dis__wwds_36_tfdisnumuni ;
   private java.math.BigDecimal AV136Pedidos_dis__wwds_37_tfdisnumuni_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV67TFDisUsrCod_Sel ;
   private String AV66TFDisUsrCod ;
   private String AV75TFDisCliNum_Sel ;
   private String AV74TFDisCliNum ;
   private String AV77TFDisEncCli_Sel ;
   private String AV76TFDisEncCli ;
   private String AV30TFCliNom_Sel ;
   private String AV29TFCliNom ;
   private String AV32TFDisArtCod_Sel ;
   private String AV31TFDisArtCod ;
   private String AV34TFDisArtDsc_Sel ;
   private String AV33TFDisArtDsc ;
   private String AV36TFDisColNom_Sel ;
   private String AV35TFDisColNom ;
   private String AV79TFDisNomCli_Sel ;
   private String AV78TFDisNomCli ;
   private String AV83TFMaqCodDis_Sel ;
   private String AV82TFMaqCodDis ;
   private String AV89TFDisUniMed_Sel ;
   private String AV88TFDisUniMed ;
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
   private String AV101Pedidos_dis__wwds_2_tfdisusrcod ;
   private String AV102Pedidos_dis__wwds_3_tfdisusrcod_sel ;
   private String AV104Pedidos_dis__wwds_5_tfdisclinum ;
   private String AV105Pedidos_dis__wwds_6_tfdisclinum_sel ;
   private String AV106Pedidos_dis__wwds_7_tfdisenccli ;
   private String AV107Pedidos_dis__wwds_8_tfdisenccli_sel ;
   private String AV115Pedidos_dis__wwds_16_tfclinom ;
   private String AV116Pedidos_dis__wwds_17_tfclinom_sel ;
   private String AV117Pedidos_dis__wwds_18_tfdisartcod ;
   private String AV118Pedidos_dis__wwds_19_tfdisartcod_sel ;
   private String AV119Pedidos_dis__wwds_20_tfdisartdsc ;
   private String AV120Pedidos_dis__wwds_21_tfdisartdsc_sel ;
   private String AV121Pedidos_dis__wwds_22_tfdiscolnom ;
   private String AV122Pedidos_dis__wwds_23_tfdiscolnom_sel ;
   private String AV127Pedidos_dis__wwds_28_tfdisnomcli ;
   private String AV128Pedidos_dis__wwds_29_tfdisnomcli_sel ;
   private String AV131Pedidos_dis__wwds_32_tfmaqcoddis ;
   private String AV132Pedidos_dis__wwds_33_tfmaqcoddis_sel ;
   private String AV137Pedidos_dis__wwds_38_tfdisunimed ;
   private String AV138Pedidos_dis__wwds_39_tfdisunimed_sel ;
   private String scmdbuf ;
   private String lV101Pedidos_dis__wwds_2_tfdisusrcod ;
   private String lV104Pedidos_dis__wwds_5_tfdisclinum ;
   private String lV106Pedidos_dis__wwds_7_tfdisenccli ;
   private String lV115Pedidos_dis__wwds_16_tfclinom ;
   private String lV117Pedidos_dis__wwds_18_tfdisartcod ;
   private String lV119Pedidos_dis__wwds_20_tfdisartdsc ;
   private String lV121Pedidos_dis__wwds_22_tfdiscolnom ;
   private String lV127Pedidos_dis__wwds_28_tfdisnomcli ;
   private String lV131Pedidos_dis__wwds_32_tfmaqcoddis ;
   private String lV137Pedidos_dis__wwds_38_tfdisunimed ;
   private String A396EmprCod ;
   private String AV69DisCliNumData ;
   private String AV72DisEncCliData ;
   private String AV95Pgmdesc ;
   private java.util.Date AV20TFDisFecCli ;
   private java.util.Date AV22TFDisFec ;
   private java.util.Date AV25TFDisFecEnt ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date AV110Pedidos_dis__wwds_11_tfdisfeccli ;
   private java.util.Date AV111Pedidos_dis__wwds_12_tfdisfec ;
   private java.util.Date AV112Pedidos_dis__wwds_13_tfdisfecent ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV68IsAuthorizedDisCliNum ;
   private boolean AV71IsAuthorizedDisEncCli ;
   private boolean AV11OrderedDsc ;
   private boolean n1122MaqCodDis ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private String AV41TFDisEst_SelsJson ;
   private String AV64Title ;
   private String AV12FilterFullText ;
   private String AV42TFDisEst_SelDscs ;
   private String AV52FilterTFDisEst_SelValueDescription ;
   private String AV45TFDisCod_To_Description ;
   private String AV49TFCliCod_To_Description ;
   private String AV50TFDisColNum_To_Description ;
   private String AV51TFDisTipCol_To_Description ;
   private String AV90TFDisNumCli_To_Description ;
   private String AV91TFDisNumPie_To_Description ;
   private String AV92TFDisNumUni_To_Description ;
   private String AV70DisCliNumTitle ;
   private String AV73DisEncCliTitle ;
   private String AV100Pedidos_dis__wwds_1_filterfulltext ;
   private String lV100Pedidos_dis__wwds_1_filterfulltext ;
   private String AV13DisEstDescription ;
   private String AV62PageInfo ;
   private String AV59DateInfo ;
   private String AV57AppName ;
   private GXSimpleCollection<Byte> AV43TFDisEst_Sels ;
   private GXSimpleCollection<Byte> AV103Pedidos_dis__wwds_4_tfdisest_sels ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09VF2_A392DisUniMed ;
   private java.math.BigDecimal[] P09VF2_A375DisNumUni ;
   private short[] P09VF2_A374DisNumPie ;
   private String[] P09VF2_A1122MaqCodDis ;
   private boolean[] P09VF2_n1122MaqCodDis ;
   private int[] P09VF2_A1196DisNumCli ;
   private String[] P09VF2_A1195DisNomCli ;
   private byte[] P09VF2_A390DisTipCol ;
   private boolean[] P09VF2_n390DisTipCol ;
   private int[] P09VF2_A363DisColNum ;
   private boolean[] P09VF2_n363DisColNum ;
   private String[] P09VF2_A362DisColNom ;
   private boolean[] P09VF2_n362DisColNom ;
   private String[] P09VF2_A337DisArtDsc ;
   private String[] P09VF2_A335DisArtCod ;
   private String[] P09VF2_A279CliNom ;
   private int[] P09VF2_A252CliCod ;
   private java.util.Date[] P09VF2_A371DisFecEnt ;
   private java.util.Date[] P09VF2_A369DisFec ;
   private java.util.Date[] P09VF2_A370DisFecCli ;
   private int[] P09VF2_A361DisCod ;
   private String[] P09VF2_A4813DisEncCli ;
   private String[] P09VF2_A360DisCliNum ;
   private String[] P09VF2_A4348DisUsrCod ;
   private byte[] P09VF2_A367DisEst ;
   private String[] P09VF2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class dis__wwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09VF2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV103Pedidos_dis__wwds_4_tfdisest_sels ,
                                          String AV102Pedidos_dis__wwds_3_tfdisusrcod_sel ,
                                          String AV101Pedidos_dis__wwds_2_tfdisusrcod ,
                                          int AV103Pedidos_dis__wwds_4_tfdisest_sels_size ,
                                          String AV105Pedidos_dis__wwds_6_tfdisclinum_sel ,
                                          String AV104Pedidos_dis__wwds_5_tfdisclinum ,
                                          String AV107Pedidos_dis__wwds_8_tfdisenccli_sel ,
                                          String AV106Pedidos_dis__wwds_7_tfdisenccli ,
                                          int AV108Pedidos_dis__wwds_9_tfdiscod ,
                                          int AV109Pedidos_dis__wwds_10_tfdiscod_to ,
                                          java.util.Date AV110Pedidos_dis__wwds_11_tfdisfeccli ,
                                          java.util.Date AV111Pedidos_dis__wwds_12_tfdisfec ,
                                          java.util.Date AV112Pedidos_dis__wwds_13_tfdisfecent ,
                                          int AV113Pedidos_dis__wwds_14_tfclicod ,
                                          int AV114Pedidos_dis__wwds_15_tfclicod_to ,
                                          String AV116Pedidos_dis__wwds_17_tfclinom_sel ,
                                          String AV115Pedidos_dis__wwds_16_tfclinom ,
                                          String AV118Pedidos_dis__wwds_19_tfdisartcod_sel ,
                                          String AV117Pedidos_dis__wwds_18_tfdisartcod ,
                                          String AV120Pedidos_dis__wwds_21_tfdisartdsc_sel ,
                                          String AV119Pedidos_dis__wwds_20_tfdisartdsc ,
                                          String AV122Pedidos_dis__wwds_23_tfdiscolnom_sel ,
                                          String AV121Pedidos_dis__wwds_22_tfdiscolnom ,
                                          int AV123Pedidos_dis__wwds_24_tfdiscolnum ,
                                          int AV124Pedidos_dis__wwds_25_tfdiscolnum_to ,
                                          byte AV125Pedidos_dis__wwds_26_tfdistipcol ,
                                          byte AV126Pedidos_dis__wwds_27_tfdistipcol_to ,
                                          String AV128Pedidos_dis__wwds_29_tfdisnomcli_sel ,
                                          String AV127Pedidos_dis__wwds_28_tfdisnomcli ,
                                          int AV129Pedidos_dis__wwds_30_tfdisnumcli ,
                                          int AV130Pedidos_dis__wwds_31_tfdisnumcli_to ,
                                          String AV132Pedidos_dis__wwds_33_tfmaqcoddis_sel ,
                                          String AV131Pedidos_dis__wwds_32_tfmaqcoddis ,
                                          short AV133Pedidos_dis__wwds_34_tfdisnumpie ,
                                          short AV134Pedidos_dis__wwds_35_tfdisnumpie_to ,
                                          java.math.BigDecimal AV135Pedidos_dis__wwds_36_tfdisnumuni ,
                                          java.math.BigDecimal AV136Pedidos_dis__wwds_37_tfdisnumuni_to ,
                                          String AV138Pedidos_dis__wwds_39_tfdisunimed_sel ,
                                          String AV137Pedidos_dis__wwds_38_tfdisunimed ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          int A361DisCod ,
                                          java.util.Date A370DisFecCli ,
                                          java.util.Date A369DisFec ,
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
                                          short A374DisNumPie ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV100Pedidos_dis__wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[37];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.DisUniMed, T1.DisNumUni, T1.DisNumPie, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisFec, T1.DisFecCli, T1.DisCod, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst, T1.EmprCod FROM (TXPDISPOS T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV102Pedidos_dis__wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV101Pedidos_dis__wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Pedidos_dis__wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( AV103Pedidos_dis__wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103Pedidos_dis__wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV105Pedidos_dis__wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidos_dis__wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidos_dis__wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis__wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis__wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis__wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis__wwds_9_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_dis__wwds_10_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV110Pedidos_dis__wwds_11_tfdisfeccli)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Pedidos_dis__wwds_12_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV112Pedidos_dis__wwds_13_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV113Pedidos_dis__wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV114Pedidos_dis__wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Pedidos_dis__wwds_17_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV115Pedidos_dis__wwds_16_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Pedidos_dis__wwds_17_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Pedidos_dis__wwds_19_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV117Pedidos_dis__wwds_18_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Pedidos_dis__wwds_19_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Pedidos_dis__wwds_21_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV119Pedidos_dis__wwds_20_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Pedidos_dis__wwds_21_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Pedidos_dis__wwds_23_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Pedidos_dis__wwds_22_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Pedidos_dis__wwds_23_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV123Pedidos_dis__wwds_24_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV124Pedidos_dis__wwds_25_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV125Pedidos_dis__wwds_26_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV126Pedidos_dis__wwds_27_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Pedidos_dis__wwds_29_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV127Pedidos_dis__wwds_28_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Pedidos_dis__wwds_29_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV129Pedidos_dis__wwds_30_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV130Pedidos_dis__wwds_31_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Pedidos_dis__wwds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV131Pedidos_dis__wwds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Pedidos_dis__wwds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV133Pedidos_dis__wwds_34_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV134Pedidos_dis__wwds_35_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Pedidos_dis__wwds_36_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Pedidos_dis__wwds_37_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Pedidos_dis__wwds_39_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV137Pedidos_dis__wwds_38_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Pedidos_dis__wwds_39_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.DisNumPie" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumPie DESC" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumUni" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumUni DESC" ;
      }
      else if ( ( AV10OrderedBy == 22 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV10OrderedBy == 22 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
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
                  return conditional_P09VF2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.math.BigDecimal)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Boolean) dynConstraints[61]).booleanValue() , (String)dynConstraints[62] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VF2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((String[]) buf[14])[0] = rslt.getString(11, 16);
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(16);
               ((int[]) buf[20])[0] = rslt.getInt(17);
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
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               return;
      }
   }

}

