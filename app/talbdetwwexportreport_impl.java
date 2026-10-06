package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbdetwwexportreport_impl extends GXWebReport
{
   public talbdetwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV111Title = httpContext.getMessage( "Lista de Almacen de Entrada, con detalle de rollos", "") ;
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
         h85A0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV141FilterFullText)==0) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV141FilterFullText, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( AV39GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV36GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV39GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV13DynamicFiltersSelector1 = AV36GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV13DynamicFiltersSelector1, "ALBREST") == 0 )
         {
            AV117AlbREst1 = (byte)(GXutil.lval( AV36GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())) ;
            if ( ! (0==AV117AlbREst1) )
            {
               AV122FilterAlbREst1ValueDescription = "" ;
               if ( AV117AlbREst1 == 0 )
               {
                  AV122FilterAlbREst1ValueDescription = httpContext.getMessage( "Abierta", "") ;
               }
               else if ( AV117AlbREst1 == 1 )
               {
                  AV122FilterAlbREst1ValueDescription = httpContext.getMessage( "Cerrada", "") ;
               }
               AV121FilterAlbREstValueDescription = AV122FilterAlbREst1ValueDescription ;
               h85A0( false, 20) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121FilterAlbREstValueDescription, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+20) ;
            }
         }
         if ( AV39GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV24DynamicFiltersEnabled2 = true ;
            AV36GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV39GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV25DynamicFiltersSelector2 = AV36GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV25DynamicFiltersSelector2, "ALBREST") == 0 )
            {
               AV123AlbREst2 = (byte)(GXutil.lval( AV36GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())) ;
               if ( ! (0==AV123AlbREst2) )
               {
                  AV125FilterAlbREst2ValueDescription = "" ;
                  if ( AV123AlbREst2 == 0 )
                  {
                     AV125FilterAlbREst2ValueDescription = httpContext.getMessage( "Abierta", "") ;
                  }
                  else if ( AV123AlbREst2 == 1 )
                  {
                     AV125FilterAlbREst2ValueDescription = httpContext.getMessage( "Cerrada", "") ;
                  }
                  AV121FilterAlbREstValueDescription = AV125FilterAlbREst2ValueDescription ;
                  h85A0( false, 20) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121FilterAlbREstValueDescription, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+20) ;
               }
            }
            if ( AV39GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV30DynamicFiltersEnabled3 = true ;
               AV36GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV39GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV31DynamicFiltersSelector3 = AV36GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV31DynamicFiltersSelector3, "ALBREST") == 0 )
               {
                  AV126AlbREst3 = (byte)(GXutil.lval( AV36GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())) ;
                  if ( ! (0==AV126AlbREst3) )
                  {
                     AV128FilterAlbREst3ValueDescription = "" ;
                     if ( AV126AlbREst3 == 0 )
                     {
                        AV128FilterAlbREst3ValueDescription = httpContext.getMessage( "Abierta", "") ;
                     }
                     else if ( AV126AlbREst3 == 1 )
                     {
                        AV128FilterAlbREst3ValueDescription = httpContext.getMessage( "Cerrada", "") ;
                     }
                     AV121FilterAlbREstValueDescription = AV128FilterAlbREst3ValueDescription ;
                     h85A0( false, 20) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
                     getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                     getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV121FilterAlbREstValueDescription, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
                     Gx_OldLine = Gx_line ;
                     Gx_line = (int)(Gx_line+20) ;
                  }
               }
            }
         }
      }
      if ( ! ( (0==AV41TFAlbRecCod) && (0==AV42TFAlbRecCod_To) ) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "N Recepcion", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TFAlbRecCod), "ZZZZZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV89TFAlbRecCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "N Recepcion", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV89TFAlbRecCod_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42TFAlbRecCod_To), "ZZZZZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV44TFAlbREnt_Sel)==0) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Albaran Entrega", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFAlbREnt_Sel, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV43TFAlbREnt)==0) )
         {
            h85A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Albaran Entrega", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFAlbREnt, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV46TFAlbREnt2_Sel)==0) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Albaran Entrega", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFAlbREnt2_Sel, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV45TFAlbREnt2)==0) )
         {
            h85A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nº Albaran Entrega", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFAlbREnt2, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47TFAlbRFen)) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrada", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV47TFAlbRFen, "99/99/99"), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV49TFAlbRHEn) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora de entrada", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV49TFAlbRHEn, "99/99/99 99:99"), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV51TFCliCod) && (0==AV52TFCliCod_To) ) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV51TFCliCod), "ZZZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV92TFCliCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cliente", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV92TFCliCod_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52TFCliCod_To), "ZZZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFCliNom_Sel)==0) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54TFCliNom_Sel, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV53TFCliNom)==0) )
         {
            h85A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53TFCliNom, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV56TFAlbRef_Sel)==0) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Referencia", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56TFAlbRef_Sel, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV55TFAlbRef)==0) )
         {
            h85A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Codigo Referencia", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55TFAlbRef, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV58TFAlbRefDsc_Sel)==0) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Referencia", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58TFAlbRefDsc_Sel, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV57TFAlbRefDsc)==0) )
         {
            h85A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Referencia", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57TFAlbRefDsc, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV59TFProceCod) && (0==AV60TFProceCod_To) ) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Procedencia", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV59TFProceCod), "ZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV93TFProceCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Procedencia", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV93TFProceCod_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV60TFProceCod_To), "ZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFProceNom_Sel)==0) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFProceNom_Sel, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV61TFProceNom)==0) )
         {
            h85A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61TFProceNom, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV63TFTrnCod) && (0==AV64TFTrnCod_To) ) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod Transp", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV63TFTrnCod), "ZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV94TFTrnCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cod Transp", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV94TFTrnCod_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64TFTrnCod_To), "ZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV66TFTrnNom_Sel)==0) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66TFTrnNom_Sel, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV65TFTrnNom)==0) )
         {
            h85A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65TFTrnNom, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV67TFTipEntCod) && (0==AV68TFTipEntCod_To) ) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo Entrada", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV67TFTipEntCod), "ZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV95TFTipEntCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tipo Entrada", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV95TFTipEntCod_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV68TFTipEntCod_To), "ZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV70TFTipEntNom_Sel)==0) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFTipEntNom_Sel, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV69TFTipEntNom)==0) )
         {
            h85A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69TFTipEntNom, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV72TFAlbRDes_Sel)==0) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Destino", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFAlbRDes_Sel, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV71TFAlbRDes)==0) )
         {
            h85A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Destino", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFAlbRDes, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFAlbRUniEnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFAlbRUniEnt_To)==0) ) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidades Entrada", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV73TFAlbRUniEnt, "ZZZZZ9.99")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV96TFAlbRUniEnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unidades Entrada", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV96TFAlbRUniEnt_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV74TFAlbRUniEnt_To, "ZZZZZ9.99")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV137TFAlbRUni_Sels.fromJSonString(AV135TFAlbRUni_SelsJson, null);
      if ( ! ( AV137TFAlbRUni_Sels.size() == 0 ) )
      {
         AV101i = 1 ;
         AV152GXV1 = 1 ;
         while ( AV152GXV1 <= AV137TFAlbRUni_Sels.size() )
         {
            AV76TFAlbRUni_Sel = (String)AV137TFAlbRUni_Sels.elementAt(-1+AV152GXV1) ;
            if ( AV101i == 1 )
            {
               AV136TFAlbRUni_SelDscs = "" ;
            }
            else
            {
               AV136TFAlbRUni_SelDscs += ", " ;
            }
            AV138FilterTFAlbRUni_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV76TFAlbRUni_Sel), "K") == 0 )
            {
               AV138FilterTFAlbRUni_SelValueDescription = httpContext.getMessage( "K", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV76TFAlbRUni_Sel), "M") == 0 )
            {
               AV138FilterTFAlbRUni_SelValueDescription = httpContext.getMessage( "M", "") ;
            }
            AV136TFAlbRUni_SelDscs += AV138FilterTFAlbRUni_SelValueDescription ;
            AV101i = (long)(AV101i+1) ;
            AV152GXV1 = (int)(AV152GXV1+1) ;
         }
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV136TFAlbRUni_SelDscs, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV77TFAlbRPieEnt) && (0==AV78TFAlbRPieEnt_To) ) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Piezas Entregadas", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV77TFAlbRPieEnt), "ZZZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV97TFAlbRPieEnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Piezas Entregadas", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV97TFAlbRPieEnt_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV78TFAlbRPieEnt_To), "ZZZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV80TFAlbRLoc_Sel)==0) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80TFAlbRLoc_Sel, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV79TFAlbRLoc)==0) )
         {
            h85A0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV79TFAlbRLoc, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV83TFAlbRReo_Sels.fromJSonString(AV81TFAlbRReo_SelsJson, null);
      if ( ! ( AV83TFAlbRReo_Sels.size() == 0 ) )
      {
         AV101i = 1 ;
         AV153GXV2 = 1 ;
         while ( AV153GXV2 <= AV83TFAlbRReo_Sels.size() )
         {
            AV84TFAlbRReo_Sel = (String)AV83TFAlbRReo_Sels.elementAt(-1+AV153GXV2) ;
            if ( AV101i == 1 )
            {
               AV82TFAlbRReo_SelDscs = "" ;
            }
            else
            {
               AV82TFAlbRReo_SelDscs += ", " ;
            }
            AV98FilterTFAlbRReo_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV84TFAlbRReo_Sel), "NO") == 0 )
            {
               AV98FilterTFAlbRReo_SelValueDescription = httpContext.getMessage( "NO", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV84TFAlbRReo_Sel), "SI") == 0 )
            {
               AV98FilterTFAlbRReo_SelValueDescription = httpContext.getMessage( "SI", "") ;
            }
            AV82TFAlbRReo_SelDscs += AV98FilterTFAlbRReo_SelValueDescription ;
            AV101i = (long)(AV101i+1) ;
            AV153GXV2 = (int)(AV153GXV2+1) ;
         }
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Reclamacion?", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82TFAlbRReo_SelDscs, "")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV85TFAlbRPieUti) && (0==AV86TFAlbRPieUti_To) ) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Piezas Utilizadas", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV85TFAlbRPieUti), "ZZZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV99TFAlbRPieUti_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Piezas Utilizadas", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV99TFAlbRPieUti_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV86TFAlbRPieUti_To), "ZZZZZ9")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87TFAlbRUniUti)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFAlbRUniUti_To)==0) ) )
      {
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Unidades Utilizadas", ""), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV87TFAlbRUniUti, "ZZZZZ9.99")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV100TFAlbRUniUti_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Unidades Utilizadas", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h85A0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV100TFAlbRUniUti_To_Description, "")), 25, Gx_line+0, 171, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV88TFAlbRUniUti_To, "ZZZZZ9.99")), 171, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h85A0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h85A0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "N Recepcion", ""), 30, Gx_line+10, 59, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Albaran Entrega", ""), 63, Gx_line+10, 92, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Albaran Entrega", ""), 96, Gx_line+10, 125, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrada", ""), 129, Gx_line+10, 158, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hora de entrada", ""), 162, Gx_line+10, 191, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 195, Gx_line+10, 224, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Cliente", ""), 228, Gx_line+10, 257, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Referencia", ""), 261, Gx_line+10, 290, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion Referencia", ""), 294, Gx_line+10, 323, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Procedencia", ""), 327, Gx_line+10, 356, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre", ""), 360, Gx_line+10, 389, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod Transp", ""), 393, Gx_line+10, 422, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 426, Gx_line+10, 455, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo Entrada", ""), 459, Gx_line+10, 488, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 492, Gx_line+10, 521, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Destino", ""), 525, Gx_line+10, 554, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidades Entrada", ""), 558, Gx_line+10, 587, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidad", ""), 591, Gx_line+10, 620, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas Entregadas", ""), 624, Gx_line+10, 653, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Localizacion", ""), 657, Gx_line+10, 686, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Reclamacion?", ""), 690, Gx_line+10, 719, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Piezas Utilizadas", ""), 723, Gx_line+10, 753, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Unidades Utilizadas", ""), 757, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV155Talbdetwwds_1_filterfulltext = AV141FilterFullText ;
      AV156Talbdetwwds_2_dynamicfiltersselector1 = AV13DynamicFiltersSelector1 ;
      AV157Talbdetwwds_3_albrest1 = AV117AlbREst1 ;
      AV158Talbdetwwds_4_dynamicfiltersenabled2 = AV24DynamicFiltersEnabled2 ;
      AV159Talbdetwwds_5_dynamicfiltersselector2 = AV25DynamicFiltersSelector2 ;
      AV160Talbdetwwds_6_albrest2 = AV123AlbREst2 ;
      AV161Talbdetwwds_7_dynamicfiltersenabled3 = AV30DynamicFiltersEnabled3 ;
      AV162Talbdetwwds_8_dynamicfiltersselector3 = AV31DynamicFiltersSelector3 ;
      AV163Talbdetwwds_9_albrest3 = AV126AlbREst3 ;
      AV164Talbdetwwds_10_tfalbreccod = AV41TFAlbRecCod ;
      AV165Talbdetwwds_11_tfalbreccod_to = AV42TFAlbRecCod_To ;
      AV166Talbdetwwds_12_tfalbrent = AV43TFAlbREnt ;
      AV167Talbdetwwds_13_tfalbrent_sel = AV44TFAlbREnt_Sel ;
      AV168Talbdetwwds_14_tfalbrent2 = AV45TFAlbREnt2 ;
      AV169Talbdetwwds_15_tfalbrent2_sel = AV46TFAlbREnt2_Sel ;
      AV170Talbdetwwds_16_tfalbrfen = AV47TFAlbRFen ;
      AV171Talbdetwwds_17_tfalbrhen = AV49TFAlbRHEn ;
      AV172Talbdetwwds_18_tfclicod = AV51TFCliCod ;
      AV173Talbdetwwds_19_tfclicod_to = AV52TFCliCod_To ;
      AV174Talbdetwwds_20_tfclinom = AV53TFCliNom ;
      AV175Talbdetwwds_21_tfclinom_sel = AV54TFCliNom_Sel ;
      AV176Talbdetwwds_22_tfalbref = AV55TFAlbRef ;
      AV177Talbdetwwds_23_tfalbref_sel = AV56TFAlbRef_Sel ;
      AV178Talbdetwwds_24_tfalbrefdsc = AV57TFAlbRefDsc ;
      AV179Talbdetwwds_25_tfalbrefdsc_sel = AV58TFAlbRefDsc_Sel ;
      AV180Talbdetwwds_26_tfprocecod = AV59TFProceCod ;
      AV181Talbdetwwds_27_tfprocecod_to = AV60TFProceCod_To ;
      AV182Talbdetwwds_28_tfprocenom = AV61TFProceNom ;
      AV183Talbdetwwds_29_tfprocenom_sel = AV62TFProceNom_Sel ;
      AV184Talbdetwwds_30_tftrncod = AV63TFTrnCod ;
      AV185Talbdetwwds_31_tftrncod_to = AV64TFTrnCod_To ;
      AV186Talbdetwwds_32_tftrnnom = AV65TFTrnNom ;
      AV187Talbdetwwds_33_tftrnnom_sel = AV66TFTrnNom_Sel ;
      AV188Talbdetwwds_34_tftipentcod = AV67TFTipEntCod ;
      AV189Talbdetwwds_35_tftipentcod_to = AV68TFTipEntCod_To ;
      AV190Talbdetwwds_36_tftipentnom = AV69TFTipEntNom ;
      AV191Talbdetwwds_37_tftipentnom_sel = AV70TFTipEntNom_Sel ;
      AV192Talbdetwwds_38_tfalbrdes = AV71TFAlbRDes ;
      AV193Talbdetwwds_39_tfalbrdes_sel = AV72TFAlbRDes_Sel ;
      AV194Talbdetwwds_40_tfalbrunient = AV73TFAlbRUniEnt ;
      AV195Talbdetwwds_41_tfalbrunient_to = AV74TFAlbRUniEnt_To ;
      AV196Talbdetwwds_42_tfalbruni_sels = AV137TFAlbRUni_Sels ;
      AV197Talbdetwwds_43_tfalbrpieent = AV77TFAlbRPieEnt ;
      AV198Talbdetwwds_44_tfalbrpieent_to = AV78TFAlbRPieEnt_To ;
      AV199Talbdetwwds_45_tfalbrloc = AV79TFAlbRLoc ;
      AV200Talbdetwwds_46_tfalbrloc_sel = AV80TFAlbRLoc_Sel ;
      AV201Talbdetwwds_47_tfalbrreo_sels = AV83TFAlbRReo_Sels ;
      AV202Talbdetwwds_48_tfalbrpieuti = AV85TFAlbRPieUti ;
      AV203Talbdetwwds_49_tfalbrpieuti_to = AV86TFAlbRPieUti_To ;
      AV204Talbdetwwds_50_tfalbruniuti = AV87TFAlbRUniUti ;
      AV205Talbdetwwds_51_tfalbruniuti_to = AV88TFAlbRUniUti_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV196Talbdetwwds_42_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV201Talbdetwwds_47_tfalbrreo_sels ,
                                           AV156Talbdetwwds_2_dynamicfiltersselector1 ,
                                           Boolean.valueOf(AV158Talbdetwwds_4_dynamicfiltersenabled2) ,
                                           AV159Talbdetwwds_5_dynamicfiltersselector2 ,
                                           Boolean.valueOf(AV161Talbdetwwds_7_dynamicfiltersenabled3) ,
                                           AV162Talbdetwwds_8_dynamicfiltersselector3 ,
                                           Integer.valueOf(AV164Talbdetwwds_10_tfalbreccod) ,
                                           Integer.valueOf(AV165Talbdetwwds_11_tfalbreccod_to) ,
                                           AV167Talbdetwwds_13_tfalbrent_sel ,
                                           AV166Talbdetwwds_12_tfalbrent ,
                                           AV169Talbdetwwds_15_tfalbrent2_sel ,
                                           AV168Talbdetwwds_14_tfalbrent2 ,
                                           AV170Talbdetwwds_16_tfalbrfen ,
                                           AV171Talbdetwwds_17_tfalbrhen ,
                                           Integer.valueOf(AV172Talbdetwwds_18_tfclicod) ,
                                           Integer.valueOf(AV173Talbdetwwds_19_tfclicod_to) ,
                                           AV175Talbdetwwds_21_tfclinom_sel ,
                                           AV174Talbdetwwds_20_tfclinom ,
                                           AV177Talbdetwwds_23_tfalbref_sel ,
                                           AV176Talbdetwwds_22_tfalbref ,
                                           AV179Talbdetwwds_25_tfalbrefdsc_sel ,
                                           AV178Talbdetwwds_24_tfalbrefdsc ,
                                           Short.valueOf(AV180Talbdetwwds_26_tfprocecod) ,
                                           Short.valueOf(AV181Talbdetwwds_27_tfprocecod_to) ,
                                           AV183Talbdetwwds_29_tfprocenom_sel ,
                                           AV182Talbdetwwds_28_tfprocenom ,
                                           Short.valueOf(AV184Talbdetwwds_30_tftrncod) ,
                                           Short.valueOf(AV185Talbdetwwds_31_tftrncod_to) ,
                                           AV187Talbdetwwds_33_tftrnnom_sel ,
                                           AV186Talbdetwwds_32_tftrnnom ,
                                           Short.valueOf(AV188Talbdetwwds_34_tftipentcod) ,
                                           Short.valueOf(AV189Talbdetwwds_35_tftipentcod_to) ,
                                           AV191Talbdetwwds_37_tftipentnom_sel ,
                                           AV190Talbdetwwds_36_tftipentnom ,
                                           AV193Talbdetwwds_39_tfalbrdes_sel ,
                                           AV192Talbdetwwds_38_tfalbrdes ,
                                           AV194Talbdetwwds_40_tfalbrunient ,
                                           AV195Talbdetwwds_41_tfalbrunient_to ,
                                           Integer.valueOf(AV196Talbdetwwds_42_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV197Talbdetwwds_43_tfalbrpieent) ,
                                           Integer.valueOf(AV198Talbdetwwds_44_tfalbrpieent_to) ,
                                           AV200Talbdetwwds_46_tfalbrloc_sel ,
                                           AV199Talbdetwwds_45_tfalbrloc ,
                                           Integer.valueOf(AV201Talbdetwwds_47_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV202Talbdetwwds_48_tfalbrpieuti) ,
                                           Integer.valueOf(AV203Talbdetwwds_49_tfalbrpieuti_to) ,
                                           AV204Talbdetwwds_50_tfalbruniuti ,
                                           AV205Talbdetwwds_51_tfalbruniuti_to ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV157Talbdetwwds_3_albrest1) ,
                                           Byte.valueOf(AV160Talbdetwwds_6_albrest2) ,
                                           Byte.valueOf(AV163Talbdetwwds_9_albrest3) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV155Talbdetwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV166Talbdetwwds_12_tfalbrent = GXutil.padr( GXutil.rtrim( AV166Talbdetwwds_12_tfalbrent), 8, "%") ;
      lV168Talbdetwwds_14_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV168Talbdetwwds_14_tfalbrent2), 20, "%") ;
      lV174Talbdetwwds_20_tfclinom = GXutil.padr( GXutil.rtrim( AV174Talbdetwwds_20_tfclinom), 30, "%") ;
      lV176Talbdetwwds_22_tfalbref = GXutil.padr( GXutil.rtrim( AV176Talbdetwwds_22_tfalbref), 16, "%") ;
      lV178Talbdetwwds_24_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV178Talbdetwwds_24_tfalbrefdsc), 26, "%") ;
      lV182Talbdetwwds_28_tfprocenom = GXutil.padr( GXutil.rtrim( AV182Talbdetwwds_28_tfprocenom), 30, "%") ;
      lV186Talbdetwwds_32_tftrnnom = GXutil.padr( GXutil.rtrim( AV186Talbdetwwds_32_tftrnnom), 30, "%") ;
      lV190Talbdetwwds_36_tftipentnom = GXutil.padr( GXutil.rtrim( AV190Talbdetwwds_36_tftipentnom), 25, "%") ;
      lV192Talbdetwwds_38_tfalbrdes = GXutil.padr( GXutil.rtrim( AV192Talbdetwwds_38_tfalbrdes), 20, "%") ;
      lV199Talbdetwwds_45_tfalbrloc = GXutil.padr( GXutil.rtrim( AV199Talbdetwwds_45_tfalbrloc), 10, "%") ;
      /* Using cursor P085A2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV157Talbdetwwds_3_albrest1), Byte.valueOf(AV157Talbdetwwds_3_albrest1), Byte.valueOf(AV160Talbdetwwds_6_albrest2), Byte.valueOf(AV160Talbdetwwds_6_albrest2), Byte.valueOf(AV163Talbdetwwds_9_albrest3), Byte.valueOf(AV163Talbdetwwds_9_albrest3), Integer.valueOf(AV164Talbdetwwds_10_tfalbreccod), Integer.valueOf(AV165Talbdetwwds_11_tfalbreccod_to), lV166Talbdetwwds_12_tfalbrent, AV167Talbdetwwds_13_tfalbrent_sel, lV168Talbdetwwds_14_tfalbrent2, AV169Talbdetwwds_15_tfalbrent2_sel, AV170Talbdetwwds_16_tfalbrfen, AV171Talbdetwwds_17_tfalbrhen, Integer.valueOf(AV172Talbdetwwds_18_tfclicod), Integer.valueOf(AV173Talbdetwwds_19_tfclicod_to), lV174Talbdetwwds_20_tfclinom, AV175Talbdetwwds_21_tfclinom_sel, lV176Talbdetwwds_22_tfalbref, AV177Talbdetwwds_23_tfalbref_sel, lV178Talbdetwwds_24_tfalbrefdsc, AV179Talbdetwwds_25_tfalbrefdsc_sel, Short.valueOf(AV180Talbdetwwds_26_tfprocecod), Short.valueOf(AV181Talbdetwwds_27_tfprocecod_to), lV182Talbdetwwds_28_tfprocenom, AV183Talbdetwwds_29_tfprocenom_sel, Short.valueOf(AV184Talbdetwwds_30_tftrncod), Short.valueOf(AV185Talbdetwwds_31_tftrncod_to), lV186Talbdetwwds_32_tftrnnom, AV187Talbdetwwds_33_tftrnnom_sel, Short.valueOf(AV188Talbdetwwds_34_tftipentcod), Short.valueOf(AV189Talbdetwwds_35_tftipentcod_to), lV190Talbdetwwds_36_tftipentnom, AV191Talbdetwwds_37_tftipentnom_sel, lV192Talbdetwwds_38_tfalbrdes, AV193Talbdetwwds_39_tfalbrdes_sel, AV194Talbdetwwds_40_tfalbrunient, AV195Talbdetwwds_41_tfalbrunient_to, Integer.valueOf(AV197Talbdetwwds_43_tfalbrpieent), Integer.valueOf(AV198Talbdetwwds_44_tfalbrpieent_to), lV199Talbdetwwds_45_tfalbrloc, AV200Talbdetwwds_46_tfalbrloc_sel, Integer.valueOf(AV202Talbdetwwds_48_tfalbrpieuti), Integer.valueOf(AV203Talbdetwwds_49_tfalbrpieuti_to), AV204Talbdetwwds_50_tfalbruniuti, AV205Talbdetwwds_51_tfalbruniuti_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P085A2_A396EmprCod[0] ;
         A60AlbRUniUti = P085A2_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P085A2_A54AlbRPieUti[0] ;
         A50AlbRLoc = P085A2_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P085A2_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P085A2_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P085A2_A1291AlbRDes[0] ;
         A1212TipEntNom = P085A2_A1212TipEntNom[0] ;
         n1212TipEntNom = P085A2_n1212TipEntNom[0] ;
         A1211TipEntCod = P085A2_A1211TipEntCod[0] ;
         n1211TipEntCod = P085A2_n1211TipEntCod[0] ;
         A841TrnNom = P085A2_A841TrnNom[0] ;
         n841TrnNom = P085A2_n841TrnNom[0] ;
         A840TrnCod = P085A2_A840TrnCod[0] ;
         n840TrnCod = P085A2_n840TrnCod[0] ;
         A971ProceNom = P085A2_A971ProceNom[0] ;
         n971ProceNom = P085A2_n971ProceNom[0] ;
         A970ProceCod = P085A2_A970ProceCod[0] ;
         n970ProceCod = P085A2_n970ProceCod[0] ;
         A3613AlbRefDsc = P085A2_A3613AlbRefDsc[0] ;
         A45AlbRef = P085A2_A45AlbRef[0] ;
         A279CliNom = P085A2_A279CliNom[0] ;
         A252CliCod = P085A2_A252CliCod[0] ;
         A4606AlbRHEn = P085A2_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P085A2_n4606AlbRHEn[0] ;
         A49AlbRFen = P085A2_A49AlbRFen[0] ;
         A5806AlbREnt2 = P085A2_A5806AlbREnt2[0] ;
         A46AlbREnt = P085A2_A46AlbREnt[0] ;
         A44AlbRecCod = P085A2_A44AlbRecCod[0] ;
         A47AlbREst = P085A2_A47AlbREst[0] ;
         A55AlbRReo = P085A2_A55AlbRReo[0] ;
         A56AlbRUni = P085A2_A56AlbRUni[0] ;
         A1212TipEntNom = P085A2_A1212TipEntNom[0] ;
         n1212TipEntNom = P085A2_n1212TipEntNom[0] ;
         A841TrnNom = P085A2_A841TrnNom[0] ;
         n841TrnNom = P085A2_n841TrnNom[0] ;
         A971ProceNom = P085A2_A971ProceNom[0] ;
         n971ProceNom = P085A2_n971ProceNom[0] ;
         A279CliNom = P085A2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV155Talbdetwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV155Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV155Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV155Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV155Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV155Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV155Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV155Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV155Talbdetwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV155Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV155Talbdetwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV129AlbRUniDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "K") == 0 )
            {
               AV129AlbRUniDescription = httpContext.getMessage( "K", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "M") == 0 )
            {
               AV129AlbRUniDescription = httpContext.getMessage( "M", "") ;
            }
            AV12AlbRReoDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "NO") == 0 )
            {
               AV12AlbRReoDescription = httpContext.getMessage( "NO", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "SI") == 0 )
            {
               AV12AlbRReoDescription = httpContext.getMessage( "SI", "") ;
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
            h85A0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), 30, Gx_line+10, 59, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A46AlbREnt, "")), 63, Gx_line+10, 92, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A5806AlbREnt2, "")), 96, Gx_line+10, 125, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A49AlbRFen, "99/99/99"), 129, Gx_line+10, 158, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A4606AlbRHEn, "99/99/99 99:99"), 162, Gx_line+10, 191, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), 195, Gx_line+10, 224, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A279CliNom, "")), 228, Gx_line+10, 257, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A45AlbRef, "")), 261, Gx_line+10, 290, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A3613AlbRefDsc, "")), 294, Gx_line+10, 323, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")), 327, Gx_line+10, 356, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A971ProceNom, "")), 360, Gx_line+10, 389, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 393, Gx_line+10, 422, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 426, Gx_line+10, 455, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9")), 459, Gx_line+10, 488, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1212TipEntNom, "")), 492, Gx_line+10, 521, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), 525, Gx_line+10, 554, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")), 558, Gx_line+10, 587, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV129AlbRUniDescription, "")), 591, Gx_line+10, 620, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")), 624, Gx_line+10, 653, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), 657, Gx_line+10, 686, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12AlbRReoDescription, "")), 690, Gx_line+10, 719, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")), 723, Gx_line+10, 753, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")), 757, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+36) ;
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
      if ( GXutil.strcmp(AV37Session.getValue("TALBDETWWGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TALBDETWWGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("TALBDETWWGridState"), null, null);
      }
      AV10OrderedBy = AV39GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV39GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV206GXV3 = 1 ;
      while ( AV206GXV3 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV206GXV3));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV141FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV41TFAlbRecCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFAlbRecCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV43TFAlbREnt = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV44TFAlbREnt_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT2") == 0 )
         {
            AV45TFAlbREnt2 = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT2_SEL") == 0 )
         {
            AV46TFAlbREnt2_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV47TFAlbRFen = localUtil.ctod( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHEN") == 0 )
         {
            AV49TFAlbRHEn = localUtil.ctot( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV51TFCliCod = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFCliCod_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV53TFCliNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV54TFCliNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV55TFAlbRef = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV56TFAlbRef_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV57TFAlbRefDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV58TFAlbRefDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV59TFProceCod = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFProceCod_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV61TFProceNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV62TFProceNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV63TFTrnCod = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFTrnCod_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV65TFTrnNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV66TFTrnNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTCOD") == 0 )
         {
            AV67TFTipEntCod = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFTipEntCod_To = (short)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV69TFTipEntNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV70TFTipEntNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES") == 0 )
         {
            AV71TFAlbRDes = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES_SEL") == 0 )
         {
            AV72TFAlbRDes_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV73TFAlbRUniEnt = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV74TFAlbRUniEnt_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV135TFAlbRUni_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV137TFAlbRUni_Sels.fromJSonString(AV135TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV77TFAlbRPieEnt = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV78TFAlbRPieEnt_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC") == 0 )
         {
            AV79TFAlbRLoc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC_SEL") == 0 )
         {
            AV80TFAlbRLoc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV81TFAlbRReo_SelsJson = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV83TFAlbRReo_Sels.fromJSonString(AV81TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV85TFAlbRPieUti = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV86TFAlbRPieUti_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV87TFAlbRUniUti = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV88TFAlbRUniUti_To = CommonUtil.decimalVal( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV206GXV3 = (int)(AV206GXV3+1) ;
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

   public void h85A0( boolean bFoot ,
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
               AV108PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV104DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV108PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV111Title = AV149Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV143AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV111Title = "" ;
      AV141FilterFullText = "" ;
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV13DynamicFiltersSelector1 = "" ;
      AV122FilterAlbREst1ValueDescription = "" ;
      AV121FilterAlbREstValueDescription = "" ;
      AV25DynamicFiltersSelector2 = "" ;
      AV125FilterAlbREst2ValueDescription = "" ;
      AV31DynamicFiltersSelector3 = "" ;
      AV128FilterAlbREst3ValueDescription = "" ;
      AV89TFAlbRecCod_To_Description = "" ;
      AV44TFAlbREnt_Sel = "" ;
      AV43TFAlbREnt = "" ;
      AV46TFAlbREnt2_Sel = "" ;
      AV45TFAlbREnt2 = "" ;
      AV47TFAlbRFen = GXutil.nullDate() ;
      AV49TFAlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      AV92TFCliCod_To_Description = "" ;
      AV54TFCliNom_Sel = "" ;
      AV53TFCliNom = "" ;
      AV56TFAlbRef_Sel = "" ;
      AV55TFAlbRef = "" ;
      AV58TFAlbRefDsc_Sel = "" ;
      AV57TFAlbRefDsc = "" ;
      AV93TFProceCod_To_Description = "" ;
      AV62TFProceNom_Sel = "" ;
      AV61TFProceNom = "" ;
      AV94TFTrnCod_To_Description = "" ;
      AV66TFTrnNom_Sel = "" ;
      AV65TFTrnNom = "" ;
      AV95TFTipEntCod_To_Description = "" ;
      AV70TFTipEntNom_Sel = "" ;
      AV69TFTipEntNom = "" ;
      AV72TFAlbRDes_Sel = "" ;
      AV71TFAlbRDes = "" ;
      AV73TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV74TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV96TFAlbRUniEnt_To_Description = "" ;
      AV137TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV135TFAlbRUni_SelsJson = "" ;
      AV76TFAlbRUni_Sel = "" ;
      AV136TFAlbRUni_SelDscs = "" ;
      AV138FilterTFAlbRUni_SelValueDescription = "" ;
      AV97TFAlbRPieEnt_To_Description = "" ;
      AV80TFAlbRLoc_Sel = "" ;
      AV79TFAlbRLoc = "" ;
      AV83TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV81TFAlbRReo_SelsJson = "" ;
      AV84TFAlbRReo_Sel = "" ;
      AV82TFAlbRReo_SelDscs = "" ;
      AV98FilterTFAlbRReo_SelValueDescription = "" ;
      AV99TFAlbRPieUti_To_Description = "" ;
      AV87TFAlbRUniUti = DecimalUtil.ZERO ;
      AV88TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV100TFAlbRUniUti_To_Description = "" ;
      A56AlbRUni = "" ;
      A55AlbRReo = "" ;
      A46AlbREnt = "" ;
      A5806AlbREnt2 = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A50AlbRLoc = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      AV155Talbdetwwds_1_filterfulltext = "" ;
      AV156Talbdetwwds_2_dynamicfiltersselector1 = "" ;
      AV159Talbdetwwds_5_dynamicfiltersselector2 = "" ;
      AV162Talbdetwwds_8_dynamicfiltersselector3 = "" ;
      AV166Talbdetwwds_12_tfalbrent = "" ;
      AV167Talbdetwwds_13_tfalbrent_sel = "" ;
      AV168Talbdetwwds_14_tfalbrent2 = "" ;
      AV169Talbdetwwds_15_tfalbrent2_sel = "" ;
      AV170Talbdetwwds_16_tfalbrfen = GXutil.nullDate() ;
      AV171Talbdetwwds_17_tfalbrhen = GXutil.resetTime( GXutil.nullDate() );
      AV174Talbdetwwds_20_tfclinom = "" ;
      AV175Talbdetwwds_21_tfclinom_sel = "" ;
      AV176Talbdetwwds_22_tfalbref = "" ;
      AV177Talbdetwwds_23_tfalbref_sel = "" ;
      AV178Talbdetwwds_24_tfalbrefdsc = "" ;
      AV179Talbdetwwds_25_tfalbrefdsc_sel = "" ;
      AV182Talbdetwwds_28_tfprocenom = "" ;
      AV183Talbdetwwds_29_tfprocenom_sel = "" ;
      AV186Talbdetwwds_32_tftrnnom = "" ;
      AV187Talbdetwwds_33_tftrnnom_sel = "" ;
      AV190Talbdetwwds_36_tftipentnom = "" ;
      AV191Talbdetwwds_37_tftipentnom_sel = "" ;
      AV192Talbdetwwds_38_tfalbrdes = "" ;
      AV193Talbdetwwds_39_tfalbrdes_sel = "" ;
      AV194Talbdetwwds_40_tfalbrunient = DecimalUtil.ZERO ;
      AV195Talbdetwwds_41_tfalbrunient_to = DecimalUtil.ZERO ;
      AV196Talbdetwwds_42_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV199Talbdetwwds_45_tfalbrloc = "" ;
      AV200Talbdetwwds_46_tfalbrloc_sel = "" ;
      AV201Talbdetwwds_47_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV204Talbdetwwds_50_tfalbruniuti = DecimalUtil.ZERO ;
      AV205Talbdetwwds_51_tfalbruniuti_to = DecimalUtil.ZERO ;
      lV155Talbdetwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV166Talbdetwwds_12_tfalbrent = "" ;
      lV168Talbdetwwds_14_tfalbrent2 = "" ;
      lV174Talbdetwwds_20_tfclinom = "" ;
      lV176Talbdetwwds_22_tfalbref = "" ;
      lV178Talbdetwwds_24_tfalbrefdsc = "" ;
      lV182Talbdetwwds_28_tfprocenom = "" ;
      lV186Talbdetwwds_32_tftrnnom = "" ;
      lV190Talbdetwwds_36_tftipentnom = "" ;
      lV192Talbdetwwds_38_tfalbrdes = "" ;
      lV199Talbdetwwds_45_tfalbrloc = "" ;
      P085A2_A396EmprCod = new String[] {""} ;
      P085A2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P085A2_A54AlbRPieUti = new int[1] ;
      P085A2_A50AlbRLoc = new String[] {""} ;
      P085A2_A52AlbRPieEnt = new int[1] ;
      P085A2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P085A2_A1291AlbRDes = new String[] {""} ;
      P085A2_A1212TipEntNom = new String[] {""} ;
      P085A2_n1212TipEntNom = new boolean[] {false} ;
      P085A2_A1211TipEntCod = new short[1] ;
      P085A2_n1211TipEntCod = new boolean[] {false} ;
      P085A2_A841TrnNom = new String[] {""} ;
      P085A2_n841TrnNom = new boolean[] {false} ;
      P085A2_A840TrnCod = new short[1] ;
      P085A2_n840TrnCod = new boolean[] {false} ;
      P085A2_A971ProceNom = new String[] {""} ;
      P085A2_n971ProceNom = new boolean[] {false} ;
      P085A2_A970ProceCod = new short[1] ;
      P085A2_n970ProceCod = new boolean[] {false} ;
      P085A2_A3613AlbRefDsc = new String[] {""} ;
      P085A2_A45AlbRef = new String[] {""} ;
      P085A2_A279CliNom = new String[] {""} ;
      P085A2_A252CliCod = new int[1] ;
      P085A2_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P085A2_n4606AlbRHEn = new boolean[] {false} ;
      P085A2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P085A2_A5806AlbREnt2 = new String[] {""} ;
      P085A2_A46AlbREnt = new String[] {""} ;
      P085A2_A44AlbRecCod = new int[1] ;
      P085A2_A47AlbREst = new byte[1] ;
      P085A2_A55AlbRReo = new String[] {""} ;
      P085A2_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      AV129AlbRUniDescription = "" ;
      AV12AlbRReoDescription = "" ;
      AV37Session = httpContext.getWebSession();
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV108PageInfo = "" ;
      AV104DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV149Pgmdesc = "" ;
      AV143AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdetwwexportreport__default(),
         new Object[] {
             new Object[] {
            P085A2_A396EmprCod, P085A2_A60AlbRUniUti, P085A2_A54AlbRPieUti, P085A2_A50AlbRLoc, P085A2_A52AlbRPieEnt, P085A2_A58AlbRUniEnt, P085A2_A1291AlbRDes, P085A2_A1212TipEntNom, P085A2_n1212TipEntNom, P085A2_A1211TipEntCod,
            P085A2_n1211TipEntCod, P085A2_A841TrnNom, P085A2_n841TrnNom, P085A2_A840TrnCod, P085A2_n840TrnCod, P085A2_A971ProceNom, P085A2_n971ProceNom, P085A2_A970ProceCod, P085A2_n970ProceCod, P085A2_A3613AlbRefDsc,
            P085A2_A45AlbRef, P085A2_A279CliNom, P085A2_A252CliCod, P085A2_A4606AlbRHEn, P085A2_n4606AlbRHEn, P085A2_A49AlbRFen, P085A2_A5806AlbREnt2, P085A2_A46AlbREnt, P085A2_A44AlbRecCod, P085A2_A47AlbREst,
            P085A2_A55AlbRReo, P085A2_A56AlbRUni
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV149Pgmdesc = httpContext.getMessage( "TALBDETWWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV149Pgmdesc = httpContext.getMessage( "TALBDETWWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV117AlbREst1 ;
   private byte AV123AlbREst2 ;
   private byte AV126AlbREst3 ;
   private byte AV157Talbdetwwds_3_albrest1 ;
   private byte AV160Talbdetwwds_6_albrest2 ;
   private byte AV163Talbdetwwds_9_albrest3 ;
   private byte A47AlbREst ;
   private short gxcookieaux ;
   private short AV59TFProceCod ;
   private short AV60TFProceCod_To ;
   private short AV63TFTrnCod ;
   private short AV64TFTrnCod_To ;
   private short AV67TFTipEntCod ;
   private short AV68TFTipEntCod_To ;
   private short A970ProceCod ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short AV180Talbdetwwds_26_tfprocecod ;
   private short AV181Talbdetwwds_27_tfprocecod_to ;
   private short AV184Talbdetwwds_30_tftrncod ;
   private short AV185Talbdetwwds_31_tftrncod_to ;
   private short AV188Talbdetwwds_34_tftipentcod ;
   private short AV189Talbdetwwds_35_tftipentcod_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV41TFAlbRecCod ;
   private int AV42TFAlbRecCod_To ;
   private int AV51TFCliCod ;
   private int AV52TFCliCod_To ;
   private int AV152GXV1 ;
   private int AV77TFAlbRPieEnt ;
   private int AV78TFAlbRPieEnt_To ;
   private int AV153GXV2 ;
   private int AV85TFAlbRPieUti ;
   private int AV86TFAlbRPieUti_To ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int AV164Talbdetwwds_10_tfalbreccod ;
   private int AV165Talbdetwwds_11_tfalbreccod_to ;
   private int AV172Talbdetwwds_18_tfclicod ;
   private int AV173Talbdetwwds_19_tfclicod_to ;
   private int AV197Talbdetwwds_43_tfalbrpieent ;
   private int AV198Talbdetwwds_44_tfalbrpieent_to ;
   private int AV202Talbdetwwds_48_tfalbrpieuti ;
   private int AV203Talbdetwwds_49_tfalbrpieuti_to ;
   private int AV196Talbdetwwds_42_tfalbruni_sels_size ;
   private int AV201Talbdetwwds_47_tfalbrreo_sels_size ;
   private int AV206GXV3 ;
   private long AV101i ;
   private java.math.BigDecimal AV73TFAlbRUniEnt ;
   private java.math.BigDecimal AV74TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV87TFAlbRUniUti ;
   private java.math.BigDecimal AV88TFAlbRUniUti_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV194Talbdetwwds_40_tfalbrunient ;
   private java.math.BigDecimal AV195Talbdetwwds_41_tfalbrunient_to ;
   private java.math.BigDecimal AV204Talbdetwwds_50_tfalbruniuti ;
   private java.math.BigDecimal AV205Talbdetwwds_51_tfalbruniuti_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV44TFAlbREnt_Sel ;
   private String AV43TFAlbREnt ;
   private String AV46TFAlbREnt2_Sel ;
   private String AV45TFAlbREnt2 ;
   private String AV54TFCliNom_Sel ;
   private String AV53TFCliNom ;
   private String AV56TFAlbRef_Sel ;
   private String AV55TFAlbRef ;
   private String AV58TFAlbRefDsc_Sel ;
   private String AV57TFAlbRefDsc ;
   private String AV62TFProceNom_Sel ;
   private String AV61TFProceNom ;
   private String AV66TFTrnNom_Sel ;
   private String AV65TFTrnNom ;
   private String AV70TFTipEntNom_Sel ;
   private String AV69TFTipEntNom ;
   private String AV72TFAlbRDes_Sel ;
   private String AV71TFAlbRDes ;
   private String AV76TFAlbRUni_Sel ;
   private String AV80TFAlbRLoc_Sel ;
   private String AV79TFAlbRLoc ;
   private String AV84TFAlbRReo_Sel ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private String A46AlbREnt ;
   private String A5806AlbREnt2 ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String A1212TipEntNom ;
   private String A1291AlbRDes ;
   private String A50AlbRLoc ;
   private String AV166Talbdetwwds_12_tfalbrent ;
   private String AV167Talbdetwwds_13_tfalbrent_sel ;
   private String AV168Talbdetwwds_14_tfalbrent2 ;
   private String AV169Talbdetwwds_15_tfalbrent2_sel ;
   private String AV174Talbdetwwds_20_tfclinom ;
   private String AV175Talbdetwwds_21_tfclinom_sel ;
   private String AV176Talbdetwwds_22_tfalbref ;
   private String AV177Talbdetwwds_23_tfalbref_sel ;
   private String AV178Talbdetwwds_24_tfalbrefdsc ;
   private String AV179Talbdetwwds_25_tfalbrefdsc_sel ;
   private String AV182Talbdetwwds_28_tfprocenom ;
   private String AV183Talbdetwwds_29_tfprocenom_sel ;
   private String AV186Talbdetwwds_32_tftrnnom ;
   private String AV187Talbdetwwds_33_tftrnnom_sel ;
   private String AV190Talbdetwwds_36_tftipentnom ;
   private String AV191Talbdetwwds_37_tftipentnom_sel ;
   private String AV192Talbdetwwds_38_tfalbrdes ;
   private String AV193Talbdetwwds_39_tfalbrdes_sel ;
   private String AV199Talbdetwwds_45_tfalbrloc ;
   private String AV200Talbdetwwds_46_tfalbrloc_sel ;
   private String scmdbuf ;
   private String lV166Talbdetwwds_12_tfalbrent ;
   private String lV168Talbdetwwds_14_tfalbrent2 ;
   private String lV174Talbdetwwds_20_tfclinom ;
   private String lV176Talbdetwwds_22_tfalbref ;
   private String lV178Talbdetwwds_24_tfalbrefdsc ;
   private String lV182Talbdetwwds_28_tfprocenom ;
   private String lV186Talbdetwwds_32_tftrnnom ;
   private String lV190Talbdetwwds_36_tftipentnom ;
   private String lV192Talbdetwwds_38_tfalbrdes ;
   private String lV199Talbdetwwds_45_tfalbrloc ;
   private String A396EmprCod ;
   private String AV149Pgmdesc ;
   private java.util.Date AV49TFAlbRHEn ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date AV171Talbdetwwds_17_tfalbrhen ;
   private java.util.Date AV47TFAlbRFen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV170Talbdetwwds_16_tfalbrfen ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV24DynamicFiltersEnabled2 ;
   private boolean AV30DynamicFiltersEnabled3 ;
   private boolean AV158Talbdetwwds_4_dynamicfiltersenabled2 ;
   private boolean AV161Talbdetwwds_7_dynamicfiltersenabled3 ;
   private boolean AV11OrderedDsc ;
   private boolean n1212TipEntNom ;
   private boolean n1211TipEntCod ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n971ProceNom ;
   private boolean n970ProceCod ;
   private boolean n4606AlbRHEn ;
   private String AV135TFAlbRUni_SelsJson ;
   private String AV81TFAlbRReo_SelsJson ;
   private String AV111Title ;
   private String AV141FilterFullText ;
   private String AV13DynamicFiltersSelector1 ;
   private String AV122FilterAlbREst1ValueDescription ;
   private String AV121FilterAlbREstValueDescription ;
   private String AV25DynamicFiltersSelector2 ;
   private String AV125FilterAlbREst2ValueDescription ;
   private String AV31DynamicFiltersSelector3 ;
   private String AV128FilterAlbREst3ValueDescription ;
   private String AV89TFAlbRecCod_To_Description ;
   private String AV92TFCliCod_To_Description ;
   private String AV93TFProceCod_To_Description ;
   private String AV94TFTrnCod_To_Description ;
   private String AV95TFTipEntCod_To_Description ;
   private String AV96TFAlbRUniEnt_To_Description ;
   private String AV136TFAlbRUni_SelDscs ;
   private String AV138FilterTFAlbRUni_SelValueDescription ;
   private String AV97TFAlbRPieEnt_To_Description ;
   private String AV82TFAlbRReo_SelDscs ;
   private String AV98FilterTFAlbRReo_SelValueDescription ;
   private String AV99TFAlbRPieUti_To_Description ;
   private String AV100TFAlbRUniUti_To_Description ;
   private String AV155Talbdetwwds_1_filterfulltext ;
   private String AV156Talbdetwwds_2_dynamicfiltersselector1 ;
   private String AV159Talbdetwwds_5_dynamicfiltersselector2 ;
   private String AV162Talbdetwwds_8_dynamicfiltersselector3 ;
   private String lV155Talbdetwwds_1_filterfulltext ;
   private String AV129AlbRUniDescription ;
   private String AV12AlbRReoDescription ;
   private String AV108PageInfo ;
   private String AV104DateInfo ;
   private String AV143AppName ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private IDataStoreProvider pr_default ;
   private String[] P085A2_A396EmprCod ;
   private java.math.BigDecimal[] P085A2_A60AlbRUniUti ;
   private int[] P085A2_A54AlbRPieUti ;
   private String[] P085A2_A50AlbRLoc ;
   private int[] P085A2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P085A2_A58AlbRUniEnt ;
   private String[] P085A2_A1291AlbRDes ;
   private String[] P085A2_A1212TipEntNom ;
   private boolean[] P085A2_n1212TipEntNom ;
   private short[] P085A2_A1211TipEntCod ;
   private boolean[] P085A2_n1211TipEntCod ;
   private String[] P085A2_A841TrnNom ;
   private boolean[] P085A2_n841TrnNom ;
   private short[] P085A2_A840TrnCod ;
   private boolean[] P085A2_n840TrnCod ;
   private String[] P085A2_A971ProceNom ;
   private boolean[] P085A2_n971ProceNom ;
   private short[] P085A2_A970ProceCod ;
   private boolean[] P085A2_n970ProceCod ;
   private String[] P085A2_A3613AlbRefDsc ;
   private String[] P085A2_A45AlbRef ;
   private String[] P085A2_A279CliNom ;
   private int[] P085A2_A252CliCod ;
   private java.util.Date[] P085A2_A4606AlbRHEn ;
   private boolean[] P085A2_n4606AlbRHEn ;
   private java.util.Date[] P085A2_A49AlbRFen ;
   private String[] P085A2_A5806AlbREnt2 ;
   private String[] P085A2_A46AlbREnt ;
   private int[] P085A2_A44AlbRecCod ;
   private byte[] P085A2_A47AlbREst ;
   private String[] P085A2_A55AlbRReo ;
   private String[] P085A2_A56AlbRUni ;
   private GXSimpleCollection<String> AV137TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV83TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV196Talbdetwwds_42_tfalbruni_sels ;
   private GXSimpleCollection<String> AV201Talbdetwwds_47_tfalbrreo_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV36GridStateDynamicFilter ;
}

final  class talbdetwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P085A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV196Talbdetwwds_42_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV201Talbdetwwds_47_tfalbrreo_sels ,
                                          String AV156Talbdetwwds_2_dynamicfiltersselector1 ,
                                          boolean AV158Talbdetwwds_4_dynamicfiltersenabled2 ,
                                          String AV159Talbdetwwds_5_dynamicfiltersselector2 ,
                                          boolean AV161Talbdetwwds_7_dynamicfiltersenabled3 ,
                                          String AV162Talbdetwwds_8_dynamicfiltersselector3 ,
                                          int AV164Talbdetwwds_10_tfalbreccod ,
                                          int AV165Talbdetwwds_11_tfalbreccod_to ,
                                          String AV167Talbdetwwds_13_tfalbrent_sel ,
                                          String AV166Talbdetwwds_12_tfalbrent ,
                                          String AV169Talbdetwwds_15_tfalbrent2_sel ,
                                          String AV168Talbdetwwds_14_tfalbrent2 ,
                                          java.util.Date AV170Talbdetwwds_16_tfalbrfen ,
                                          java.util.Date AV171Talbdetwwds_17_tfalbrhen ,
                                          int AV172Talbdetwwds_18_tfclicod ,
                                          int AV173Talbdetwwds_19_tfclicod_to ,
                                          String AV175Talbdetwwds_21_tfclinom_sel ,
                                          String AV174Talbdetwwds_20_tfclinom ,
                                          String AV177Talbdetwwds_23_tfalbref_sel ,
                                          String AV176Talbdetwwds_22_tfalbref ,
                                          String AV179Talbdetwwds_25_tfalbrefdsc_sel ,
                                          String AV178Talbdetwwds_24_tfalbrefdsc ,
                                          short AV180Talbdetwwds_26_tfprocecod ,
                                          short AV181Talbdetwwds_27_tfprocecod_to ,
                                          String AV183Talbdetwwds_29_tfprocenom_sel ,
                                          String AV182Talbdetwwds_28_tfprocenom ,
                                          short AV184Talbdetwwds_30_tftrncod ,
                                          short AV185Talbdetwwds_31_tftrncod_to ,
                                          String AV187Talbdetwwds_33_tftrnnom_sel ,
                                          String AV186Talbdetwwds_32_tftrnnom ,
                                          short AV188Talbdetwwds_34_tftipentcod ,
                                          short AV189Talbdetwwds_35_tftipentcod_to ,
                                          String AV191Talbdetwwds_37_tftipentnom_sel ,
                                          String AV190Talbdetwwds_36_tftipentnom ,
                                          String AV193Talbdetwwds_39_tfalbrdes_sel ,
                                          String AV192Talbdetwwds_38_tfalbrdes ,
                                          java.math.BigDecimal AV194Talbdetwwds_40_tfalbrunient ,
                                          java.math.BigDecimal AV195Talbdetwwds_41_tfalbrunient_to ,
                                          int AV196Talbdetwwds_42_tfalbruni_sels_size ,
                                          int AV197Talbdetwwds_43_tfalbrpieent ,
                                          int AV198Talbdetwwds_44_tfalbrpieent_to ,
                                          String AV200Talbdetwwds_46_tfalbrloc_sel ,
                                          String AV199Talbdetwwds_45_tfalbrloc ,
                                          int AV201Talbdetwwds_47_tfalbrreo_sels_size ,
                                          int AV202Talbdetwwds_48_tfalbrpieuti ,
                                          int AV203Talbdetwwds_49_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV204Talbdetwwds_50_tfalbruniuti ,
                                          java.math.BigDecimal AV205Talbdetwwds_51_tfalbruniuti_to ,
                                          byte A47AlbREst ,
                                          byte AV157Talbdetwwds_3_albrest1 ,
                                          byte AV160Talbdetwwds_6_albrest2 ,
                                          byte AV163Talbdetwwds_9_albrest3 ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV155Talbdetwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[46];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod, T4.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbREst, T1.AlbRReo, T1.AlbRUni FROM" ;
      scmdbuf += " ((((TXPALBREC T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod" ;
      scmdbuf += " = T1.TrnCod) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod =" ;
      scmdbuf += " T1.CliCod)" ;
      if ( GXutil.strcmp(AV156Talbdetwwds_2_dynamicfiltersselector1, httpContext.getMessage( "ALBREST", "")) == 0 )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( AV158Talbdetwwds_4_dynamicfiltersenabled2 && ( GXutil.strcmp(AV159Talbdetwwds_5_dynamicfiltersselector2, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV161Talbdetwwds_7_dynamicfiltersenabled3 && ( GXutil.strcmp(AV162Talbdetwwds_8_dynamicfiltersselector3, httpContext.getMessage( "ALBREST", "")) == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV164Talbdetwwds_10_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV165Talbdetwwds_11_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV167Talbdetwwds_13_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV166Talbdetwwds_12_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Talbdetwwds_13_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV169Talbdetwwds_15_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV168Talbdetwwds_14_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169Talbdetwwds_15_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV170Talbdetwwds_16_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV171Talbdetwwds_17_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV172Talbdetwwds_18_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV173Talbdetwwds_19_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV175Talbdetwwds_21_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV174Talbdetwwds_20_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV175Talbdetwwds_21_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV177Talbdetwwds_23_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV176Talbdetwwds_22_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV177Talbdetwwds_23_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV179Talbdetwwds_25_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV178Talbdetwwds_24_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV179Talbdetwwds_25_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV180Talbdetwwds_26_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV181Talbdetwwds_27_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV183Talbdetwwds_29_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV182Talbdetwwds_28_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV183Talbdetwwds_29_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV184Talbdetwwds_30_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV185Talbdetwwds_31_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV187Talbdetwwds_33_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV186Talbdetwwds_32_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Talbdetwwds_33_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV188Talbdetwwds_34_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV189Talbdetwwds_35_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV191Talbdetwwds_37_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV190Talbdetwwds_36_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV191Talbdetwwds_37_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV193Talbdetwwds_39_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV192Talbdetwwds_38_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV193Talbdetwwds_39_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV194Talbdetwwds_40_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV195Talbdetwwds_41_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( AV196Talbdetwwds_42_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV196Talbdetwwds_42_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV197Talbdetwwds_43_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV198Talbdetwwds_44_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV200Talbdetwwds_46_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV199Talbdetwwds_45_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV200Talbdetwwds_46_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( AV201Talbdetwwds_47_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV201Talbdetwwds_47_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV202Talbdetwwds_48_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (0==AV203Talbdetwwds_49_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV204Talbdetwwds_50_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV205Talbdetwwds_51_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREnt" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREnt2" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREnt2 DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceCod" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProceNom" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProceNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TrnNom" ;
      }
      else if ( ( AV10OrderedBy == 13 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TrnNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipEntCod" ;
      }
      else if ( ( AV10OrderedBy == 14 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipEntCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipEntNom" ;
      }
      else if ( ( AV10OrderedBy == 15 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipEntNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV10OrderedBy == 16 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV10OrderedBy == 17 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV10OrderedBy == 18 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV10OrderedBy == 19 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV10OrderedBy == 20 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV10OrderedBy == 21 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV10OrderedBy == 22 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV10OrderedBy == 22 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV10OrderedBy == 23 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV10OrderedBy == 23 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
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
                  return conditional_P085A2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (java.util.Date)dynConstraints[58] , (java.util.Date)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , (String)dynConstraints[67] , ((Number) dynConstraints[68]).shortValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , ((Number) dynConstraints[74]).intValue() , (java.math.BigDecimal)dynConstraints[75] , ((Number) dynConstraints[76]).shortValue() , ((Boolean) dynConstraints[77]).booleanValue() , (String)dynConstraints[78] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P085A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 25);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((byte[]) buf[29])[0] = rslt.getByte(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 2);
               ((String[]) buf[31])[0] = rslt.getString(25, 1);
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
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[50]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 25);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 25);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 10);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 10);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               return;
      }
   }

}

