package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmmovstwwexportreport_impl extends GXWebReport
{
   public tmmovstwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV88Title = httpContext.getMessage( "Lista de Movimientos de Stock", "") ;
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
         h8DS0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV94FilterFullText)==0) )
      {
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94FilterFullText, "")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV44TFMMSCod) && (0==AV45TFMMSCod_To) ) )
      {
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod. Mov Stock", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV44TFMMSCod), "ZZZZZZZ9")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV70TFMMSCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cod. Mov Stock", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFMMSCod_To_Description, "")), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45TFMMSCod_To), "ZZZZZZZ9")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV48TFMMSTpo_Sels.fromJSonString(AV46TFMMSTpo_SelsJson, null);
      if ( ! ( AV48TFMMSTpo_Sels.size() == 0 ) )
      {
         AV78i = 1 ;
         AV113GXV1 = 1 ;
         while ( AV113GXV1 <= AV48TFMMSTpo_Sels.size() )
         {
            AV49TFMMSTpo_Sel = (String)AV48TFMMSTpo_Sels.elementAt(-1+AV113GXV1) ;
            if ( AV78i == 1 )
            {
               AV47TFMMSTpo_SelDscs = "" ;
            }
            else
            {
               AV47TFMMSTpo_SelDscs += ", " ;
            }
            AV71FilterTFMMSTpo_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV49TFMMSTpo_Sel), "E") == 0 )
            {
               AV71FilterTFMMSTpo_SelValueDescription = httpContext.getMessage( "Entrada", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV49TFMMSTpo_Sel), "S") == 0 )
            {
               AV71FilterTFMMSTpo_SelValueDescription = httpContext.getMessage( "Salida", "") ;
            }
            AV47TFMMSTpo_SelDscs += AV71FilterTFMMSTpo_SelValueDescription ;
            AV78i = (long)(AV78i+1) ;
            AV113GXV1 = (int)(AV113GXV1+1) ;
         }
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFMMSTpo_SelDscs, "")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54TFMMSFch)) )
      {
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV54TFMMSFch, "99/99/99"), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV53TFMMSPrvNom_Sel)==0) )
      {
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFMMSPrvNom_Sel, "")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV52TFMMSPrvNom)==0) )
         {
            h8DS0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52TFMMSPrvNom, "")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV50TFMMSPrvNum) && (0==AV51TFMMSPrvNum_To) ) )
      {
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod Proveedor", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV50TFMMSPrvNum), "ZZZZZ9")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV72TFMMSPrvNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cod Proveedor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFMMSPrvNum_To_Description, "")), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV51TFMMSPrvNum_To), "ZZZZZ9")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFMMSDto)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFMMSDto_To)==0) ) )
      {
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "% Descuento", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV68TFMMSDto, "ZZ9.99%")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV77TFMMSDto_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "% Descuento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77TFMMSDto_To_Description, "")), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV69TFMMSDto_To, "ZZ9.99%")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV63TFMMSNroExt_Sel)==0) )
      {
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nro Externo", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFMMSNroExt_Sel, "")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV62TFMMSNroExt)==0) )
         {
            h8DS0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nro Externo", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFMMSNroExt, "")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV57TFMMSUsuCre_Sel)==0) )
      {
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario que crea", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFMMSUsuCre_Sel, "")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV56TFMMSUsuCre)==0) )
         {
            h8DS0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario que crea", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFMMSUsuCre, "")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV58TFMMSFchCre) )
      {
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha de Creación", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV58TFMMSFchCre, "99/99/99 99:99"), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV60TFMMSFchApl) )
      {
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha de Aplicación", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV60TFMMSFchApl, "99/99/99 99:99"), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV66TFMMSEst_Sels.fromJSonString(AV64TFMMSEst_SelsJson, null);
      if ( ! ( AV66TFMMSEst_Sels.size() == 0 ) )
      {
         AV78i = 1 ;
         AV114GXV2 = 1 ;
         while ( AV114GXV2 <= AV66TFMMSEst_Sels.size() )
         {
            AV67TFMMSEst_Sel = (String)AV66TFMMSEst_Sels.elementAt(-1+AV114GXV2) ;
            if ( AV78i == 1 )
            {
               AV65TFMMSEst_SelDscs = "" ;
            }
            else
            {
               AV65TFMMSEst_SelDscs += ", " ;
            }
            AV76FilterTFMMSEst_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV67TFMMSEst_Sel), "E") == 0 )
            {
               AV76FilterTFMMSEst_SelValueDescription = httpContext.getMessage( "En ingreso", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV67TFMMSEst_Sel), "A") == 0 )
            {
               AV76FilterTFMMSEst_SelValueDescription = httpContext.getMessage( "Aplicado", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV67TFMMSEst_Sel), "C") == 0 )
            {
               AV76FilterTFMMSEst_SelValueDescription = httpContext.getMessage( "Cancelado", "") ;
            }
            AV65TFMMSEst_SelDscs += AV76FilterTFMMSEst_SelValueDescription ;
            AV78i = (long)(AV78i+1) ;
            AV114GXV2 = (int)(AV114GXV2+1) ;
         }
         h8DS0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 151, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65TFMMSEst_SelDscs, "")), 151, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8DS0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8DS0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod. Mov Stock", ""), 30, Gx_line+10, 95, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 99, Gx_line+10, 164, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 168, Gx_line+10, 233, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Proveedor", ""), 237, Gx_line+10, 302, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod Proveedor", ""), 306, Gx_line+10, 371, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "% Descuento", ""), 375, Gx_line+10, 440, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nro Externo", ""), 444, Gx_line+10, 509, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario que crea", ""), 513, Gx_line+10, 578, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha de Creación", ""), 582, Gx_line+10, 647, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha de Aplicación", ""), 651, Gx_line+10, 716, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 720, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext = AV94FilterFullText ;
      AV117Mantenimientomaquina_tmmovstwwds_2_tfmmscod = AV44TFMMSCod ;
      AV118Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to = AV45TFMMSCod_To ;
      AV119Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels = AV48TFMMSTpo_Sels ;
      AV120Mantenimientomaquina_tmmovstwwds_5_tfmmsfch = AV54TFMMSFch ;
      AV121Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = AV52TFMMSPrvNom ;
      AV122Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel = AV53TFMMSPrvNom_Sel ;
      AV123Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum = AV50TFMMSPrvNum ;
      AV124Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to = AV51TFMMSPrvNum_To ;
      AV125Mantenimientomaquina_tmmovstwwds_10_tfmmsdto = AV68TFMMSDto ;
      AV126Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to = AV69TFMMSDto_To ;
      AV127Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = AV62TFMMSNroExt ;
      AV128Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel = AV63TFMMSNroExt_Sel ;
      AV129Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = AV56TFMMSUsuCre ;
      AV130Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel = AV57TFMMSUsuCre_Sel ;
      AV131Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre = AV58TFMMSFchCre ;
      AV132Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl = AV60TFMMSFchApl ;
      AV133Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels = AV66TFMMSEst_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9413MMSTpo ,
                                           AV119Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ,
                                           A9420MMSEst ,
                                           AV133Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ,
                                           Integer.valueOf(AV117Mantenimientomaquina_tmmovstwwds_2_tfmmscod) ,
                                           Integer.valueOf(AV118Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to) ,
                                           Integer.valueOf(AV119Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels.size()) ,
                                           AV120Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ,
                                           AV122Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ,
                                           AV121Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ,
                                           Integer.valueOf(AV123Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum) ,
                                           Integer.valueOf(AV124Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to) ,
                                           AV125Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ,
                                           AV126Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ,
                                           AV128Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ,
                                           AV127Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ,
                                           AV130Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ,
                                           AV129Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ,
                                           AV131Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ,
                                           AV132Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ,
                                           Integer.valueOf(AV133Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels.size()) ,
                                           Integer.valueOf(A9412MMSCod) ,
                                           A9416MMSFch ,
                                           A9415MMSPrvNom ,
                                           Integer.valueOf(A9414MMSPrvNum) ,
                                           A11509MMSDto ,
                                           A9419MMSNroExt ,
                                           A9417MMSUsuCre ,
                                           A9418MMSFchCre ,
                                           A11304MMSFchApl ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING
                                           }
      });
      lV121Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = GXutil.padr( GXutil.rtrim( AV121Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom), 30, "%") ;
      lV127Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = GXutil.padr( GXutil.rtrim( AV127Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext), 20, "%") ;
      lV129Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = GXutil.padr( GXutil.rtrim( AV129Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre), 10, "%") ;
      /* Using cursor P08DS2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV117Mantenimientomaquina_tmmovstwwds_2_tfmmscod), Integer.valueOf(AV118Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to), AV120Mantenimientomaquina_tmmovstwwds_5_tfmmsfch, lV121Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom, AV122Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel, Integer.valueOf(AV123Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum), Integer.valueOf(AV124Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to), AV125Mantenimientomaquina_tmmovstwwds_10_tfmmsdto, AV126Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to, lV127Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext, AV128Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel, lV129Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre, AV130Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel, AV131Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre, AV132Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08DS2_A396EmprCod[0] ;
         A11304MMSFchApl = P08DS2_A11304MMSFchApl[0] ;
         n11304MMSFchApl = P08DS2_n11304MMSFchApl[0] ;
         A9418MMSFchCre = P08DS2_A9418MMSFchCre[0] ;
         n9418MMSFchCre = P08DS2_n9418MMSFchCre[0] ;
         A9417MMSUsuCre = P08DS2_A9417MMSUsuCre[0] ;
         n9417MMSUsuCre = P08DS2_n9417MMSUsuCre[0] ;
         A9419MMSNroExt = P08DS2_A9419MMSNroExt[0] ;
         n9419MMSNroExt = P08DS2_n9419MMSNroExt[0] ;
         A11509MMSDto = P08DS2_A11509MMSDto[0] ;
         n11509MMSDto = P08DS2_n11509MMSDto[0] ;
         A9414MMSPrvNum = P08DS2_A9414MMSPrvNum[0] ;
         n9414MMSPrvNum = P08DS2_n9414MMSPrvNum[0] ;
         A9415MMSPrvNom = P08DS2_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = P08DS2_n9415MMSPrvNom[0] ;
         A9416MMSFch = P08DS2_A9416MMSFch[0] ;
         n9416MMSFch = P08DS2_n9416MMSFch[0] ;
         A9412MMSCod = P08DS2_A9412MMSCod[0] ;
         A9420MMSEst = P08DS2_A9420MMSEst[0] ;
         n9420MMSEst = P08DS2_n9420MMSEst[0] ;
         A9413MMSTpo = P08DS2_A9413MMSTpo[0] ;
         n9413MMSTpo = P08DS2_n9413MMSTpo[0] ;
         A9415MMSPrvNom = P08DS2_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = P08DS2_n9415MMSPrvNom[0] ;
         if ( (GXutil.strcmp("", AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9412MMSCod, 8, 0) , GXutil.padr( "%" + AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "entrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "salida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9415MMSPrvNom) , GXutil.padr( "%" + GXutil.upper( AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9414MMSPrvNum, 6, 0) , GXutil.padr( "%" + AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11509MMSDto, 6, 2) , GXutil.padr( "%" + AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9419MMSNroExt) , GXutil.padr( "%" + GXutil.upper( AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9417MMSUsuCre) , GXutil.padr( "%" + GXutil.upper( AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en ingreso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aplicado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "C", "")) == 0 ) ) ) )
         {
            AV12MMSTpoDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A9413MMSTpo), "E") == 0 )
            {
               AV12MMSTpoDescription = httpContext.getMessage( "Entrada", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A9413MMSTpo), "S") == 0 )
            {
               AV12MMSTpoDescription = httpContext.getMessage( "Salida", "") ;
            }
            AV13MMSEstDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A9420MMSEst), "E") == 0 )
            {
               AV13MMSEstDescription = httpContext.getMessage( "En ingreso", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A9420MMSEst), "A") == 0 )
            {
               AV13MMSEstDescription = httpContext.getMessage( "Aplicado", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A9420MMSEst), "C") == 0 )
            {
               AV13MMSEstDescription = httpContext.getMessage( "Cancelado", "") ;
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
            h8DS0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9412MMSCod), "ZZZZZZZ9")), 30, Gx_line+10, 95, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12MMSTpoDescription, "")), 99, Gx_line+10, 164, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9416MMSFch, "99/99/99"), 168, Gx_line+10, 233, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9415MMSPrvNom, "")), 237, Gx_line+10, 302, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9414MMSPrvNum), "ZZZZZ9")), 306, Gx_line+10, 371, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A11509MMSDto, "ZZ9.99%")), 375, Gx_line+10, 440, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9419MMSNroExt, "")), 444, Gx_line+10, 509, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9417MMSUsuCre, "")), 513, Gx_line+10, 578, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9418MMSFchCre, "99/99/99 99:99"), 582, Gx_line+10, 647, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A11304MMSFchApl, "99/99/99 99:99"), 651, Gx_line+10, 716, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13MMSEstDescription, "")), 720, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV36Session.getValue("MantenimientoMaquina.TMMovStWWGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMMovStWWGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("MantenimientoMaquina.TMMovStWWGridState"), null, null);
      }
      AV10OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV134GXV3 = 1 ;
      while ( AV134GXV3 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV134GXV3));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV94FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSCOD") == 0 )
         {
            AV44TFMMSCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFMMSCod_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSTPO_SEL") == 0 )
         {
            AV46TFMMSTpo_SelsJson = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV48TFMMSTpo_Sels.fromJSonString(AV46TFMMSTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCH") == 0 )
         {
            AV54TFMMSFch = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNOM") == 0 )
         {
            AV52TFMMSPrvNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNOM_SEL") == 0 )
         {
            AV53TFMMSPrvNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNUM") == 0 )
         {
            AV50TFMMSPrvNum = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFMMSPrvNum_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSDTO") == 0 )
         {
            AV68TFMMSDto = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV69TFMMSDto_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSNROEXT") == 0 )
         {
            AV62TFMMSNroExt = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSNROEXT_SEL") == 0 )
         {
            AV63TFMMSNroExt_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSUSUCRE") == 0 )
         {
            AV56TFMMSUsuCre = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSUSUCRE_SEL") == 0 )
         {
            AV57TFMMSUsuCre_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCHCRE") == 0 )
         {
            AV58TFMMSFchCre = localUtil.ctot( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCHAPL") == 0 )
         {
            AV60TFMMSFchApl = localUtil.ctot( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSEST_SEL") == 0 )
         {
            AV64TFMMSEst_SelsJson = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV66TFMMSEst_Sels.fromJSonString(AV64TFMMSEst_SelsJson, null);
         }
         AV134GXV3 = (int)(AV134GXV3+1) ;
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

   public void h8DS0( boolean bFoot ,
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
               AV85PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV81DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV81DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV88Title = AV110Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV88Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV88Title = "" ;
      AV94FilterFullText = "" ;
      AV70TFMMSCod_To_Description = "" ;
      AV48TFMMSTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46TFMMSTpo_SelsJson = "" ;
      AV49TFMMSTpo_Sel = "" ;
      AV47TFMMSTpo_SelDscs = "" ;
      AV71FilterTFMMSTpo_SelValueDescription = "" ;
      AV54TFMMSFch = GXutil.nullDate() ;
      AV53TFMMSPrvNom_Sel = "" ;
      AV52TFMMSPrvNom = "" ;
      AV72TFMMSPrvNum_To_Description = "" ;
      AV68TFMMSDto = DecimalUtil.ZERO ;
      AV69TFMMSDto_To = DecimalUtil.ZERO ;
      AV77TFMMSDto_To_Description = "" ;
      AV63TFMMSNroExt_Sel = "" ;
      AV62TFMMSNroExt = "" ;
      AV57TFMMSUsuCre_Sel = "" ;
      AV56TFMMSUsuCre = "" ;
      AV58TFMMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV60TFMMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      AV66TFMMSEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64TFMMSEst_SelsJson = "" ;
      AV67TFMMSEst_Sel = "" ;
      AV65TFMMSEst_SelDscs = "" ;
      AV76FilterTFMMSEst_SelValueDescription = "" ;
      A9413MMSTpo = "" ;
      A9420MMSEst = "" ;
      A9416MMSFch = GXutil.nullDate() ;
      A9415MMSPrvNom = "" ;
      A11509MMSDto = DecimalUtil.ZERO ;
      A9419MMSNroExt = "" ;
      A9417MMSUsuCre = "" ;
      A9418MMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      A11304MMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext = "" ;
      AV119Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV120Mantenimientomaquina_tmmovstwwds_5_tfmmsfch = GXutil.nullDate() ;
      AV121Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = "" ;
      AV122Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel = "" ;
      AV125Mantenimientomaquina_tmmovstwwds_10_tfmmsdto = DecimalUtil.ZERO ;
      AV126Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to = DecimalUtil.ZERO ;
      AV127Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = "" ;
      AV128Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel = "" ;
      AV129Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = "" ;
      AV130Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel = "" ;
      AV131Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV132Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl = GXutil.resetTime( GXutil.nullDate() );
      AV133Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV121Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom = "" ;
      lV127Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext = "" ;
      lV129Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre = "" ;
      P08DS2_A396EmprCod = new String[] {""} ;
      P08DS2_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P08DS2_n11304MMSFchApl = new boolean[] {false} ;
      P08DS2_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08DS2_n9418MMSFchCre = new boolean[] {false} ;
      P08DS2_A9417MMSUsuCre = new String[] {""} ;
      P08DS2_n9417MMSUsuCre = new boolean[] {false} ;
      P08DS2_A9419MMSNroExt = new String[] {""} ;
      P08DS2_n9419MMSNroExt = new boolean[] {false} ;
      P08DS2_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08DS2_n11509MMSDto = new boolean[] {false} ;
      P08DS2_A9414MMSPrvNum = new int[1] ;
      P08DS2_n9414MMSPrvNum = new boolean[] {false} ;
      P08DS2_A9415MMSPrvNom = new String[] {""} ;
      P08DS2_n9415MMSPrvNom = new boolean[] {false} ;
      P08DS2_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08DS2_n9416MMSFch = new boolean[] {false} ;
      P08DS2_A9412MMSCod = new int[1] ;
      P08DS2_A9420MMSEst = new String[] {""} ;
      P08DS2_n9420MMSEst = new boolean[] {false} ;
      P08DS2_A9413MMSTpo = new String[] {""} ;
      P08DS2_n9413MMSTpo = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV12MMSTpoDescription = "" ;
      AV13MMSEstDescription = "" ;
      AV36Session = httpContext.getWebSession();
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV85PageInfo = "" ;
      AV81DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV110Pgmdesc = "" ;
      AV96AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmmovstwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08DS2_A396EmprCod, P08DS2_A11304MMSFchApl, P08DS2_n11304MMSFchApl, P08DS2_A9418MMSFchCre, P08DS2_n9418MMSFchCre, P08DS2_A9417MMSUsuCre, P08DS2_n9417MMSUsuCre, P08DS2_A9419MMSNroExt, P08DS2_n9419MMSNroExt, P08DS2_A11509MMSDto,
            P08DS2_n11509MMSDto, P08DS2_A9414MMSPrvNum, P08DS2_n9414MMSPrvNum, P08DS2_A9415MMSPrvNom, P08DS2_n9415MMSPrvNom, P08DS2_A9416MMSFch, P08DS2_n9416MMSFch, P08DS2_A9412MMSCod, P08DS2_A9420MMSEst, P08DS2_n9420MMSEst,
            P08DS2_A9413MMSTpo, P08DS2_n9413MMSTpo
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV110Pgmdesc = httpContext.getMessage( "Lista de Movimientos de Stock", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV110Pgmdesc = httpContext.getMessage( "Lista de Movimientos de Stock", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV44TFMMSCod ;
   private int AV45TFMMSCod_To ;
   private int AV113GXV1 ;
   private int AV50TFMMSPrvNum ;
   private int AV51TFMMSPrvNum_To ;
   private int AV114GXV2 ;
   private int A9412MMSCod ;
   private int A9414MMSPrvNum ;
   private int AV117Mantenimientomaquina_tmmovstwwds_2_tfmmscod ;
   private int AV118Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to ;
   private int AV123Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum ;
   private int AV124Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to ;
   private int AV119Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size ;
   private int AV133Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size ;
   private int AV134GXV3 ;
   private long AV78i ;
   private java.math.BigDecimal AV68TFMMSDto ;
   private java.math.BigDecimal AV69TFMMSDto_To ;
   private java.math.BigDecimal A11509MMSDto ;
   private java.math.BigDecimal AV125Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ;
   private java.math.BigDecimal AV126Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV49TFMMSTpo_Sel ;
   private String AV53TFMMSPrvNom_Sel ;
   private String AV52TFMMSPrvNom ;
   private String AV63TFMMSNroExt_Sel ;
   private String AV62TFMMSNroExt ;
   private String AV57TFMMSUsuCre_Sel ;
   private String AV56TFMMSUsuCre ;
   private String AV67TFMMSEst_Sel ;
   private String A9413MMSTpo ;
   private String A9420MMSEst ;
   private String A9415MMSPrvNom ;
   private String A9419MMSNroExt ;
   private String A9417MMSUsuCre ;
   private String AV121Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ;
   private String AV122Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ;
   private String AV127Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ;
   private String AV128Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ;
   private String AV129Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ;
   private String AV130Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ;
   private String scmdbuf ;
   private String lV121Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ;
   private String lV127Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ;
   private String lV129Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ;
   private String A396EmprCod ;
   private String AV110Pgmdesc ;
   private java.util.Date AV58TFMMSFchCre ;
   private java.util.Date AV60TFMMSFchApl ;
   private java.util.Date A9418MMSFchCre ;
   private java.util.Date A11304MMSFchApl ;
   private java.util.Date AV131Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ;
   private java.util.Date AV132Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ;
   private java.util.Date AV54TFMMSFch ;
   private java.util.Date A9416MMSFch ;
   private java.util.Date AV120Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n11304MMSFchApl ;
   private boolean n9418MMSFchCre ;
   private boolean n9417MMSUsuCre ;
   private boolean n9419MMSNroExt ;
   private boolean n11509MMSDto ;
   private boolean n9414MMSPrvNum ;
   private boolean n9415MMSPrvNom ;
   private boolean n9416MMSFch ;
   private boolean n9420MMSEst ;
   private boolean n9413MMSTpo ;
   private String AV46TFMMSTpo_SelsJson ;
   private String AV64TFMMSEst_SelsJson ;
   private String AV88Title ;
   private String AV94FilterFullText ;
   private String AV70TFMMSCod_To_Description ;
   private String AV47TFMMSTpo_SelDscs ;
   private String AV71FilterTFMMSTpo_SelValueDescription ;
   private String AV72TFMMSPrvNum_To_Description ;
   private String AV77TFMMSDto_To_Description ;
   private String AV65TFMMSEst_SelDscs ;
   private String AV76FilterTFMMSEst_SelValueDescription ;
   private String AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext ;
   private String AV12MMSTpoDescription ;
   private String AV13MMSEstDescription ;
   private String AV85PageInfo ;
   private String AV81DateInfo ;
   private String AV96AppName ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08DS2_A396EmprCod ;
   private java.util.Date[] P08DS2_A11304MMSFchApl ;
   private boolean[] P08DS2_n11304MMSFchApl ;
   private java.util.Date[] P08DS2_A9418MMSFchCre ;
   private boolean[] P08DS2_n9418MMSFchCre ;
   private String[] P08DS2_A9417MMSUsuCre ;
   private boolean[] P08DS2_n9417MMSUsuCre ;
   private String[] P08DS2_A9419MMSNroExt ;
   private boolean[] P08DS2_n9419MMSNroExt ;
   private java.math.BigDecimal[] P08DS2_A11509MMSDto ;
   private boolean[] P08DS2_n11509MMSDto ;
   private int[] P08DS2_A9414MMSPrvNum ;
   private boolean[] P08DS2_n9414MMSPrvNum ;
   private String[] P08DS2_A9415MMSPrvNom ;
   private boolean[] P08DS2_n9415MMSPrvNom ;
   private java.util.Date[] P08DS2_A9416MMSFch ;
   private boolean[] P08DS2_n9416MMSFch ;
   private int[] P08DS2_A9412MMSCod ;
   private String[] P08DS2_A9420MMSEst ;
   private boolean[] P08DS2_n9420MMSEst ;
   private String[] P08DS2_A9413MMSTpo ;
   private boolean[] P08DS2_n9413MMSTpo ;
   private GXSimpleCollection<String> AV48TFMMSTpo_Sels ;
   private GXSimpleCollection<String> AV66TFMMSEst_Sels ;
   private GXSimpleCollection<String> AV119Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ;
   private GXSimpleCollection<String> AV133Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

final  class tmmovstwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08DS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9413MMSTpo ,
                                          GXSimpleCollection<String> AV119Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels ,
                                          String A9420MMSEst ,
                                          GXSimpleCollection<String> AV133Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels ,
                                          int AV117Mantenimientomaquina_tmmovstwwds_2_tfmmscod ,
                                          int AV118Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to ,
                                          int AV119Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size ,
                                          java.util.Date AV120Mantenimientomaquina_tmmovstwwds_5_tfmmsfch ,
                                          String AV122Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel ,
                                          String AV121Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom ,
                                          int AV123Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum ,
                                          int AV124Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to ,
                                          java.math.BigDecimal AV125Mantenimientomaquina_tmmovstwwds_10_tfmmsdto ,
                                          java.math.BigDecimal AV126Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to ,
                                          String AV128Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel ,
                                          String AV127Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext ,
                                          String AV130Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel ,
                                          String AV129Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre ,
                                          java.util.Date AV131Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre ,
                                          java.util.Date AV132Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl ,
                                          int AV133Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size ,
                                          int A9412MMSCod ,
                                          java.util.Date A9416MMSFch ,
                                          String A9415MMSPrvNom ,
                                          int A9414MMSPrvNum ,
                                          java.math.BigDecimal A11509MMSDto ,
                                          String A9419MMSNroExt ,
                                          String A9417MMSUsuCre ,
                                          java.util.Date A9418MMSFchCre ,
                                          java.util.Date A11304MMSFchApl ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV116Mantenimientomaquina_tmmovstwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MMSFchApl, T1.MMSFchCre, T1.MMSUsuCre, T1.MMSNroExt, T1.MMSDto, T1.MMSPrvNum AS MMSPrvNum, T2.PrvNom AS MMSPrvNom, T1.MMSFch, T1.MMSCod, T1.MMSEst," ;
      scmdbuf += " T1.MMSTpo FROM (TXPMMoStk T1 LEFT JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.MMSPrvNum)" ;
      if ( ! (0==AV117Mantenimientomaquina_tmmovstwwds_2_tfmmscod) )
      {
         addWhere(sWhereString, "(T1.MMSCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV118Mantenimientomaquina_tmmovstwwds_3_tfmmscod_to) )
      {
         addWhere(sWhereString, "(T1.MMSCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( AV119Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Mantenimientomaquina_tmmovstwwds_4_tfmmstpo_sels, "T1.MMSTpo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Mantenimientomaquina_tmmovstwwds_5_tfmmsfch)) )
      {
         addWhere(sWhereString, "(T1.MMSFch >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV121Mantenimientomaquina_tmmovstwwds_6_tfmmsprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Mantenimientomaquina_tmmovstwwds_7_tfmmsprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV123Mantenimientomaquina_tmmovstwwds_8_tfmmsprvnum) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV124Mantenimientomaquina_tmmovstwwds_9_tfmmsprvnum_to) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Mantenimientomaquina_tmmovstwwds_10_tfmmsdto)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Mantenimientomaquina_tmmovstwwds_11_tfmmsdto_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel)==0) && ( ! (GXutil.strcmp("", AV127Mantenimientomaquina_tmmovstwwds_12_tfmmsnroext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSNroExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Mantenimientomaquina_tmmovstwwds_13_tfmmsnroext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSNroExt = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel)==0) && ( ! (GXutil.strcmp("", AV129Mantenimientomaquina_tmmovstwwds_14_tfmmsusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Mantenimientomaquina_tmmovstwwds_15_tfmmsusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSUsuCre = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV131Mantenimientomaquina_tmmovstwwds_16_tfmmsfchcre) )
      {
         addWhere(sWhereString, "(T1.MMSFchCre >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV132Mantenimientomaquina_tmmovstwwds_17_tfmmsfchapl) )
      {
         addWhere(sWhereString, "(T1.MMSFchApl >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( AV133Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV133Mantenimientomaquina_tmmovstwwds_18_tfmmsest_sels, "T1.MMSEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSTpo" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSTpo DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFch" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFch DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNom" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSPrvNum" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSPrvNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSDto" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSDto DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSNroExt" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSNroExt DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSUsuCre" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSUsuCre DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFchCre" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFchCre DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFchApl" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFchApl DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSEst" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSEst DESC" ;
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
                  return conditional_P08DS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08DS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((String[]) buf[18])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               return;
      }
   }

}

