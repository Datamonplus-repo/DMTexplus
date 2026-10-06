package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmsolicwwexportreport_impl extends GXWebReport
{
   public tmsolicwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV59Title = httpContext.getMessage( "Lista de Solicitudes de Mantenimiento", "") ;
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
         h8EH0( true, 0) ;
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
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV19TFSMCod) && (0==AV20TFSMCod_To) ) )
      {
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nro.", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV19TFSMCod), "ZZZZZZZ9")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFSMCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nro.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFSMCod_To_Description, "")), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV20TFSMCod_To), "ZZZZZZZ9")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV33TFSMEst_Sels.fromJSonString(AV31TFSMEst_SelsJson, null);
      if ( ! ( AV33TFSMEst_Sels.size() == 0 ) )
      {
         AV48i = 1 ;
         AV80GXV1 = 1 ;
         while ( AV80GXV1 <= AV33TFSMEst_Sels.size() )
         {
            AV34TFSMEst_Sel = (String)AV33TFSMEst_Sels.elementAt(-1+AV80GXV1) ;
            if ( AV48i == 1 )
            {
               AV32TFSMEst_SelDscs = "" ;
            }
            else
            {
               AV32TFSMEst_SelDscs += ", " ;
            }
            AV45FilterTFSMEst_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV34TFSMEst_Sel), "P") == 0 )
            {
               AV45FilterTFSMEst_SelValueDescription = httpContext.getMessage( "Pendiente Generación", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV34TFSMEst_Sel), "G") == 0 )
            {
               AV45FilterTFSMEst_SelValueDescription = httpContext.getMessage( "Generada", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV34TFSMEst_Sel), "A") == 0 )
            {
               AV45FilterTFSMEst_SelValueDescription = httpContext.getMessage( "Anulada", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV34TFSMEst_Sel), "C") == 0 )
            {
               AV45FilterTFSMEst_SelValueDescription = httpContext.getMessage( "Pendiente Calificacion", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV34TFSMEst_Sel), "T") == 0 )
            {
               AV45FilterTFSMEst_SelValueDescription = httpContext.getMessage( "Terminada", "") ;
            }
            AV32TFSMEst_SelDscs += AV45FilterTFSMEst_SelValueDescription ;
            AV48i = (long)(AV48i+1) ;
            AV80GXV1 = (int)(AV80GXV1+1) ;
         }
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFSMEst_SelDscs, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV23TFSMFchCre) )
      {
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Creación", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV23TFSMFchCre, "99/99/99 99:99"), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFSMUsuCre_Sel)==0) )
      {
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario Creación", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFSMUsuCre_Sel, "@!")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFSMUsuCre)==0) )
         {
            h8EH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario Creación", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFSMUsuCre, "@!")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV28TFSMMaqCod_Sel)==0) )
      {
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cód. Máquina", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFSMMaqCod_Sel, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV27TFSMMaqCod)==0) )
         {
            h8EH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cód. Máquina", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFSMMaqCod, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV41TFSMPri) && (0==AV42TFSMPri_To) ) )
      {
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Prioridad", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV41TFSMPri), "9")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV47TFSMPri_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Prioridad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFSMPri_To_Description, "")), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV42TFSMPri_To), "9")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV22TFSMDsc_Sel)==0) )
      {
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22TFSMDsc_Sel, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV21TFSMDsc)==0) )
         {
            h8EH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV21TFSMDsc, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV30TFSMMaqDsc_Sel)==0) )
      {
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción Máquina", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFSMMaqDsc_Sel, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFSMMaqDsc)==0) )
         {
            h8EH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción Máquina", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFSMMaqDsc, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV39TFSMCal_Sels.fromJSonString(AV37TFSMCal_SelsJson, null);
      if ( ! ( AV39TFSMCal_Sels.size() == 0 ) )
      {
         AV48i = 1 ;
         AV81GXV2 = 1 ;
         while ( AV81GXV2 <= AV39TFSMCal_Sels.size() )
         {
            AV40TFSMCal_Sel = ((Number) AV39TFSMCal_Sels.elementAt(-1+AV81GXV2)).byteValue() ;
            if ( AV48i == 1 )
            {
               AV38TFSMCal_SelDscs = "" ;
            }
            else
            {
               AV38TFSMCal_SelDscs += ", " ;
            }
            AV46FilterTFSMCal_SelValueDescription = "" ;
            if ( AV40TFSMCal_Sel == 1 )
            {
               AV46FilterTFSMCal_SelValueDescription = httpContext.getMessage( "Pesima", "") ;
            }
            else if ( AV40TFSMCal_Sel == 2 )
            {
               AV46FilterTFSMCal_SelValueDescription = httpContext.getMessage( "Mala", "") ;
            }
            else if ( AV40TFSMCal_Sel == 3 )
            {
               AV46FilterTFSMCal_SelValueDescription = httpContext.getMessage( "Aceptable", "") ;
            }
            else if ( AV40TFSMCal_Sel == 4 )
            {
               AV46FilterTFSMCal_SelValueDescription = httpContext.getMessage( "Satisfactorio", "") ;
            }
            else if ( AV40TFSMCal_Sel == 5 )
            {
               AV46FilterTFSMCal_SelValueDescription = httpContext.getMessage( "Excelente", "") ;
            }
            AV38TFSMCal_SelDscs += AV46FilterTFSMCal_SelValueDescription ;
            AV48i = (long)(AV48i+1) ;
            AV81GXV2 = (int)(AV81GXV2+1) ;
         }
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Calificación", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFSMCal_SelDscs, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFSMTxt_Sel)==0) )
      {
         h8EH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Texto", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFSMTxt_Sel, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV35TFSMTxt)==0) )
         {
            h8EH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Texto", ""), 25, Gx_line+0, 136, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV35TFSMTxt, "")), 136, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8EH0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8EH0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nro.", ""), 30, Gx_line+10, 90, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 94, Gx_line+10, 214, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Creación", ""), 218, Gx_line+10, 278, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario Creación", ""), 282, Gx_line+10, 342, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cód. Máquina", ""), 346, Gx_line+10, 406, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Prioridad", ""), 410, Gx_line+10, 470, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 474, Gx_line+10, 596, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 600, Gx_line+10, 661, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 665, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext = AV12FilterFullText ;
      AV84Mantenimientomaquina_tmsolicwwds_2_tfsmcod = AV19TFSMCod ;
      AV85Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to = AV20TFSMCod_To ;
      AV86Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = AV33TFSMEst_Sels ;
      AV87Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = AV23TFSMFchCre ;
      AV88Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = AV25TFSMUsuCre ;
      AV89Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = AV26TFSMUsuCre_Sel ;
      AV90Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = AV27TFSMMaqCod ;
      AV91Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = AV28TFSMMaqCod_Sel ;
      AV92Mantenimientomaquina_tmsolicwwds_10_tfsmpri = AV41TFSMPri ;
      AV93Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to = AV42TFSMPri_To ;
      AV94Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = AV21TFSMDsc ;
      AV95Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = AV22TFSMDsc_Sel ;
      AV96Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = AV29TFSMMaqDsc ;
      AV97Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = AV30TFSMMaqDsc_Sel ;
      AV98Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = AV39TFSMCal_Sels ;
      AV99Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = AV35TFSMTxt ;
      AV100Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = AV36TFSMTxt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9522SMEst ,
                                           AV86Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                           Byte.valueOf(A9524SMCal) ,
                                           AV98Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                           Integer.valueOf(AV84Mantenimientomaquina_tmsolicwwds_2_tfsmcod) ,
                                           Integer.valueOf(AV85Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) ,
                                           Integer.valueOf(AV86Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels.size()) ,
                                           AV87Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                           AV89Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                           AV88Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                           AV91Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                           AV90Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                           Byte.valueOf(AV92Mantenimientomaquina_tmsolicwwds_10_tfsmpri) ,
                                           Byte.valueOf(AV93Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) ,
                                           AV95Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                           AV94Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                           AV97Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                           AV96Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                           Integer.valueOf(AV98Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels.size()) ,
                                           AV100Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                           AV99Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9518SMFchCre ,
                                           A9519SMUsuCre ,
                                           A9520SMMaqCod ,
                                           Byte.valueOf(A11534SMPri) ,
                                           A9517SMDsc ,
                                           A9521SMMaqDsc ,
                                           A9523SMTxt ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV88Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = GXutil.padr( GXutil.rtrim( AV88Mantenimientomaquina_tmsolicwwds_6_tfsmusucre), 8, "%") ;
      lV90Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = GXutil.padr( GXutil.rtrim( AV90Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod), 6, "%") ;
      lV94Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = GXutil.padr( GXutil.rtrim( AV94Mantenimientomaquina_tmsolicwwds_12_tfsmdsc), 30, "%") ;
      lV96Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = GXutil.padr( GXutil.rtrim( AV96Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc), 16, "%") ;
      lV99Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = GXutil.concat( GXutil.rtrim( AV99Mantenimientomaquina_tmsolicwwds_17_tfsmtxt), "%", "") ;
      /* Using cursor P08EH2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV84Mantenimientomaquina_tmsolicwwds_2_tfsmcod), Integer.valueOf(AV85Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to), AV87Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre, lV88Mantenimientomaquina_tmsolicwwds_6_tfsmusucre, AV89Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel, lV90Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod, AV91Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel, Byte.valueOf(AV92Mantenimientomaquina_tmsolicwwds_10_tfsmpri), Byte.valueOf(AV93Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to), lV94Mantenimientomaquina_tmsolicwwds_12_tfsmdsc, AV95Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel, lV96Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc, AV97Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel, lV99Mantenimientomaquina_tmsolicwwds_17_tfsmtxt, AV100Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9428SMCod = P08EH2_A9428SMCod[0] ;
         n9428SMCod = P08EH2_n9428SMCod[0] ;
         A396EmprCod = P08EH2_A396EmprCod[0] ;
         A9523SMTxt = P08EH2_A9523SMTxt[0] ;
         n9523SMTxt = P08EH2_n9523SMTxt[0] ;
         A9521SMMaqDsc = P08EH2_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EH2_n9521SMMaqDsc[0] ;
         A9517SMDsc = P08EH2_A9517SMDsc[0] ;
         n9517SMDsc = P08EH2_n9517SMDsc[0] ;
         A11534SMPri = P08EH2_A11534SMPri[0] ;
         A9520SMMaqCod = P08EH2_A9520SMMaqCod[0] ;
         n9520SMMaqCod = P08EH2_n9520SMMaqCod[0] ;
         A9519SMUsuCre = P08EH2_A9519SMUsuCre[0] ;
         n9519SMUsuCre = P08EH2_n9519SMUsuCre[0] ;
         A9518SMFchCre = P08EH2_A9518SMFchCre[0] ;
         n9518SMFchCre = P08EH2_n9518SMFchCre[0] ;
         A9524SMCal = P08EH2_A9524SMCal[0] ;
         n9524SMCal = P08EH2_n9524SMCal[0] ;
         A9522SMEst = P08EH2_A9522SMEst[0] ;
         n9522SMEst = P08EH2_n9522SMEst[0] ;
         A9521SMMaqDsc = P08EH2_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = P08EH2_n9521SMMaqDsc[0] ;
         if ( (GXutil.strcmp("", AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente generación", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "generada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "G", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "anulada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente calificacion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "terminada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9519SMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9520SMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11534SMPri, 1, 0) , GXutil.padr( "%" + AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9517SMDsc) , GXutil.padr( "%" + GXutil.upper( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9521SMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pesima", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mala", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aceptable", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 3 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "satisfactorio", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 4 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "excelente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A9524SMCal == 5 ) ) || ( GXutil.like( GXutil.upper( A9523SMTxt) , GXutil.padr( "%" + GXutil.upper( AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(A9522SMEst, httpContext.getMessage( "T", "")) != 0 )
            {
               AV13SMEstDescription = "" ;
               if ( GXutil.strcmp(GXutil.trim( A9522SMEst), "P") == 0 )
               {
                  AV13SMEstDescription = httpContext.getMessage( "Pendiente Generación", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A9522SMEst), "G") == 0 )
               {
                  AV13SMEstDescription = httpContext.getMessage( "Generada", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A9522SMEst), "A") == 0 )
               {
                  AV13SMEstDescription = httpContext.getMessage( "Anulada", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A9522SMEst), "C") == 0 )
               {
                  AV13SMEstDescription = httpContext.getMessage( "Pendiente Calificacion", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A9522SMEst), "T") == 0 )
               {
                  AV13SMEstDescription = httpContext.getMessage( "Terminada", "") ;
               }
               /* Using cursor P08EH3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A9425OMCod = P08EH3_A9425OMCod[0] ;
                  AV71OMCod = A9425OMCod ;
                  pr_default.readNext(1);
               }
               pr_default.close(1);
               /* Using cursor P08EH4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
               while ( (pr_default.getStatus(2) != 101) )
               {
                  A9445OMEst = P08EH4_A9445OMEst[0] ;
                  A9425OMCod = P08EH4_A9425OMCod[0] ;
                  AV72OMEst = A9445OMEst ;
                  pr_default.readNext(2);
               }
               pr_default.close(2);
               AV73OMEstDescription = "" ;
               if ( GXutil.strcmp(GXutil.trim( AV72OMEst), "P") == 0 )
               {
                  AV73OMEstDescription = httpContext.getMessage( "Pendiente", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( AV72OMEst), "R") == 0 )
               {
                  AV73OMEstDescription = httpContext.getMessage( "Realizada", "") ;
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
               h8EH0( false, 36) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9")), 30, Gx_line+10, 90, Gx_line+25, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13SMEstDescription, "")), 94, Gx_line+10, 214, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( A9518SMFchCre, "99/99/99 99:99"), 218, Gx_line+10, 278, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9519SMUsuCre, "@!")), 282, Gx_line+10, 342, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9520SMMaqCod, "")), 346, Gx_line+10, 406, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11534SMPri), "9")), 410, Gx_line+10, 470, Gx_line+25, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9517SMDsc, "")), 474, Gx_line+10, 596, Gx_line+25, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV71OMCod), "ZZZZZZZ9")), 600, Gx_line+10, 661, Gx_line+25, 2, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73OMEstDescription, "")), 665, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV15Session.getValue("MantenimientoMaquina.TMSolicWWGridState"), "") == 0 )
      {
         AV17GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMSolicWWGridState"), null, null);
      }
      else
      {
         AV17GridState.fromxml(AV15Session.getValue("MantenimientoMaquina.TMSolicWWGridState"), null, null);
      }
      AV10OrderedBy = AV17GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV17GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV103GXV3 = 1 ;
      while ( AV103GXV3 <= AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV103GXV3));
         if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCOD") == 0 )
         {
            AV19TFSMCod = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV20TFSMCod_To = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMEST_SEL") == 0 )
         {
            AV31TFSMEst_SelsJson = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV33TFSMEst_Sels.fromJSonString(AV31TFSMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMFCHCRE") == 0 )
         {
            AV23TFSMFchCre = localUtil.ctot( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMUSUCRE") == 0 )
         {
            AV25TFSMUsuCre = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMUSUCRE_SEL") == 0 )
         {
            AV26TFSMUsuCre_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQCOD") == 0 )
         {
            AV27TFSMMaqCod = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQCOD_SEL") == 0 )
         {
            AV28TFSMMaqCod_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMPRI") == 0 )
         {
            AV41TFSMPri = (byte)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFSMPri_To = (byte)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMDSC") == 0 )
         {
            AV21TFSMDsc = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMDSC_SEL") == 0 )
         {
            AV22TFSMDsc_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQDSC") == 0 )
         {
            AV29TFSMMaqDsc = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMMAQDSC_SEL") == 0 )
         {
            AV30TFSMMaqDsc_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCAL_SEL") == 0 )
         {
            AV37TFSMCal_SelsJson = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV39TFSMCal_Sels.fromJSonString(AV37TFSMCal_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMTXT") == 0 )
         {
            AV35TFSMTxt = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMTXT_SEL") == 0 )
         {
            AV36TFSMTxt_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MODO") == 0 )
         {
            AV61Modo = (short)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV103GXV3 = (int)(AV103GXV3+1) ;
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

   public void h8EH0( boolean bFoot ,
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
               AV57PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV54DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV57PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV59Title = AV77Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV59Title = "" ;
      AV12FilterFullText = "" ;
      AV43TFSMCod_To_Description = "" ;
      AV33TFSMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV31TFSMEst_SelsJson = "" ;
      AV34TFSMEst_Sel = "" ;
      AV32TFSMEst_SelDscs = "" ;
      AV45FilterTFSMEst_SelValueDescription = "" ;
      AV23TFSMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV26TFSMUsuCre_Sel = "" ;
      AV25TFSMUsuCre = "" ;
      AV28TFSMMaqCod_Sel = "" ;
      AV27TFSMMaqCod = "" ;
      AV47TFSMPri_To_Description = "" ;
      AV22TFSMDsc_Sel = "" ;
      AV21TFSMDsc = "" ;
      AV30TFSMMaqDsc_Sel = "" ;
      AV29TFSMMaqDsc = "" ;
      AV39TFSMCal_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV37TFSMCal_SelsJson = "" ;
      AV38TFSMCal_SelDscs = "" ;
      AV46FilterTFSMCal_SelValueDescription = "" ;
      AV36TFSMTxt_Sel = "" ;
      AV35TFSMTxt = "" ;
      A9522SMEst = "" ;
      A9518SMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9519SMUsuCre = "" ;
      A9520SMMaqCod = "" ;
      A9517SMDsc = "" ;
      AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext = "" ;
      AV86Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV87Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV88Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = "" ;
      AV89Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel = "" ;
      AV90Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = "" ;
      AV91Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel = "" ;
      AV94Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = "" ;
      AV95Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel = "" ;
      AV96Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = "" ;
      AV97Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel = "" ;
      AV98Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV99Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = "" ;
      AV100Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel = "" ;
      scmdbuf = "" ;
      lV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext = "" ;
      lV88Mantenimientomaquina_tmsolicwwds_6_tfsmusucre = "" ;
      lV90Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod = "" ;
      lV94Mantenimientomaquina_tmsolicwwds_12_tfsmdsc = "" ;
      lV96Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc = "" ;
      lV99Mantenimientomaquina_tmsolicwwds_17_tfsmtxt = "" ;
      A9521SMMaqDsc = "" ;
      A9523SMTxt = "" ;
      P08EH2_A9428SMCod = new int[1] ;
      P08EH2_n9428SMCod = new boolean[] {false} ;
      P08EH2_A396EmprCod = new String[] {""} ;
      P08EH2_A9523SMTxt = new String[] {""} ;
      P08EH2_n9523SMTxt = new boolean[] {false} ;
      P08EH2_A9521SMMaqDsc = new String[] {""} ;
      P08EH2_n9521SMMaqDsc = new boolean[] {false} ;
      P08EH2_A9517SMDsc = new String[] {""} ;
      P08EH2_n9517SMDsc = new boolean[] {false} ;
      P08EH2_A11534SMPri = new byte[1] ;
      P08EH2_A9520SMMaqCod = new String[] {""} ;
      P08EH2_n9520SMMaqCod = new boolean[] {false} ;
      P08EH2_A9519SMUsuCre = new String[] {""} ;
      P08EH2_n9519SMUsuCre = new boolean[] {false} ;
      P08EH2_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EH2_n9518SMFchCre = new boolean[] {false} ;
      P08EH2_A9524SMCal = new byte[1] ;
      P08EH2_n9524SMCal = new boolean[] {false} ;
      P08EH2_A9522SMEst = new String[] {""} ;
      P08EH2_n9522SMEst = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV13SMEstDescription = "" ;
      P08EH3_A396EmprCod = new String[] {""} ;
      P08EH3_A9428SMCod = new int[1] ;
      P08EH3_n9428SMCod = new boolean[] {false} ;
      P08EH3_A9425OMCod = new int[1] ;
      P08EH4_A396EmprCod = new String[] {""} ;
      P08EH4_A9428SMCod = new int[1] ;
      P08EH4_n9428SMCod = new boolean[] {false} ;
      P08EH4_A9445OMEst = new String[] {""} ;
      P08EH4_A9425OMCod = new int[1] ;
      A9445OMEst = "" ;
      AV72OMEst = "" ;
      AV73OMEstDescription = "" ;
      AV15Session = httpContext.getWebSession();
      AV17GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV18GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV57PageInfo = "" ;
      AV54DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV77Pgmdesc = "" ;
      AV52AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmsolicwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08EH2_A9428SMCod, P08EH2_A396EmprCod, P08EH2_A9523SMTxt, P08EH2_n9523SMTxt, P08EH2_A9521SMMaqDsc, P08EH2_n9521SMMaqDsc, P08EH2_A9517SMDsc, P08EH2_n9517SMDsc, P08EH2_A11534SMPri, P08EH2_A9520SMMaqCod,
            P08EH2_n9520SMMaqCod, P08EH2_A9519SMUsuCre, P08EH2_n9519SMUsuCre, P08EH2_A9518SMFchCre, P08EH2_n9518SMFchCre, P08EH2_A9524SMCal, P08EH2_n9524SMCal, P08EH2_A9522SMEst, P08EH2_n9522SMEst
            }
            , new Object[] {
            P08EH3_A396EmprCod, P08EH3_A9428SMCod, P08EH3_n9428SMCod, P08EH3_A9425OMCod
            }
            , new Object[] {
            P08EH4_A396EmprCod, P08EH4_A9428SMCod, P08EH4_n9428SMCod, P08EH4_A9445OMEst, P08EH4_A9425OMCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV77Pgmdesc = httpContext.getMessage( "Lista Solicitudes de Mantenimiento", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV77Pgmdesc = httpContext.getMessage( "Lista Solicitudes de Mantenimiento", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV41TFSMPri ;
   private byte AV42TFSMPri_To ;
   private byte AV40TFSMCal_Sel ;
   private byte A11534SMPri ;
   private byte AV92Mantenimientomaquina_tmsolicwwds_10_tfsmpri ;
   private byte AV93Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to ;
   private byte A9524SMCal ;
   private short gxcookieaux ;
   private short AV10OrderedBy ;
   private short AV61Modo ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV19TFSMCod ;
   private int AV20TFSMCod_To ;
   private int AV80GXV1 ;
   private int AV81GXV2 ;
   private int A9428SMCod ;
   private int AV84Mantenimientomaquina_tmsolicwwds_2_tfsmcod ;
   private int AV85Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to ;
   private int AV86Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size ;
   private int AV98Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size ;
   private int A9425OMCod ;
   private int AV71OMCod ;
   private int AV103GXV3 ;
   private long AV48i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV34TFSMEst_Sel ;
   private String AV26TFSMUsuCre_Sel ;
   private String AV25TFSMUsuCre ;
   private String AV28TFSMMaqCod_Sel ;
   private String AV27TFSMMaqCod ;
   private String AV22TFSMDsc_Sel ;
   private String AV21TFSMDsc ;
   private String AV30TFSMMaqDsc_Sel ;
   private String AV29TFSMMaqDsc ;
   private String A9522SMEst ;
   private String A9519SMUsuCre ;
   private String A9520SMMaqCod ;
   private String A9517SMDsc ;
   private String AV88Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ;
   private String AV89Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ;
   private String AV90Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ;
   private String AV91Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ;
   private String AV94Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ;
   private String AV95Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ;
   private String AV96Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ;
   private String AV97Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ;
   private String scmdbuf ;
   private String lV88Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ;
   private String lV90Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ;
   private String lV94Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ;
   private String lV96Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ;
   private String A9521SMMaqDsc ;
   private String A396EmprCod ;
   private String A9445OMEst ;
   private String AV72OMEst ;
   private String AV77Pgmdesc ;
   private java.util.Date AV23TFSMFchCre ;
   private java.util.Date A9518SMFchCre ;
   private java.util.Date AV87Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n9428SMCod ;
   private boolean n9523SMTxt ;
   private boolean n9521SMMaqDsc ;
   private boolean n9517SMDsc ;
   private boolean n9520SMMaqCod ;
   private boolean n9519SMUsuCre ;
   private boolean n9518SMFchCre ;
   private boolean n9524SMCal ;
   private boolean n9522SMEst ;
   private String AV31TFSMEst_SelsJson ;
   private String AV37TFSMCal_SelsJson ;
   private String AV59Title ;
   private String AV12FilterFullText ;
   private String AV43TFSMCod_To_Description ;
   private String AV32TFSMEst_SelDscs ;
   private String AV45FilterTFSMEst_SelValueDescription ;
   private String AV47TFSMPri_To_Description ;
   private String AV38TFSMCal_SelDscs ;
   private String AV46FilterTFSMCal_SelValueDescription ;
   private String AV36TFSMTxt_Sel ;
   private String AV35TFSMTxt ;
   private String AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext ;
   private String AV99Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ;
   private String AV100Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ;
   private String lV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext ;
   private String lV99Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ;
   private String A9523SMTxt ;
   private String AV13SMEstDescription ;
   private String AV73OMEstDescription ;
   private String AV57PageInfo ;
   private String AV54DateInfo ;
   private String AV52AppName ;
   private GXSimpleCollection<Byte> AV39TFSMCal_Sels ;
   private GXSimpleCollection<Byte> AV98Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ;
   private com.genexus.webpanels.WebSession AV15Session ;
   private IDataStoreProvider pr_default ;
   private int[] P08EH2_A9428SMCod ;
   private boolean[] P08EH2_n9428SMCod ;
   private String[] P08EH2_A396EmprCod ;
   private String[] P08EH2_A9523SMTxt ;
   private boolean[] P08EH2_n9523SMTxt ;
   private String[] P08EH2_A9521SMMaqDsc ;
   private boolean[] P08EH2_n9521SMMaqDsc ;
   private String[] P08EH2_A9517SMDsc ;
   private boolean[] P08EH2_n9517SMDsc ;
   private byte[] P08EH2_A11534SMPri ;
   private String[] P08EH2_A9520SMMaqCod ;
   private boolean[] P08EH2_n9520SMMaqCod ;
   private String[] P08EH2_A9519SMUsuCre ;
   private boolean[] P08EH2_n9519SMUsuCre ;
   private java.util.Date[] P08EH2_A9518SMFchCre ;
   private boolean[] P08EH2_n9518SMFchCre ;
   private byte[] P08EH2_A9524SMCal ;
   private boolean[] P08EH2_n9524SMCal ;
   private String[] P08EH2_A9522SMEst ;
   private boolean[] P08EH2_n9522SMEst ;
   private String[] P08EH3_A396EmprCod ;
   private int[] P08EH3_A9428SMCod ;
   private boolean[] P08EH3_n9428SMCod ;
   private int[] P08EH3_A9425OMCod ;
   private String[] P08EH4_A396EmprCod ;
   private int[] P08EH4_A9428SMCod ;
   private boolean[] P08EH4_n9428SMCod ;
   private String[] P08EH4_A9445OMEst ;
   private int[] P08EH4_A9425OMCod ;
   private GXSimpleCollection<String> AV33TFSMEst_Sels ;
   private GXSimpleCollection<String> AV86Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV17GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV18GridStateFilterValue ;
}

final  class tmsolicwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9522SMEst ,
                                          GXSimpleCollection<String> AV86Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels ,
                                          byte A9524SMCal ,
                                          GXSimpleCollection<Byte> AV98Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels ,
                                          int AV84Mantenimientomaquina_tmsolicwwds_2_tfsmcod ,
                                          int AV85Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to ,
                                          int AV86Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size ,
                                          java.util.Date AV87Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre ,
                                          String AV89Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel ,
                                          String AV88Mantenimientomaquina_tmsolicwwds_6_tfsmusucre ,
                                          String AV91Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel ,
                                          String AV90Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod ,
                                          byte AV92Mantenimientomaquina_tmsolicwwds_10_tfsmpri ,
                                          byte AV93Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to ,
                                          String AV95Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel ,
                                          String AV94Mantenimientomaquina_tmsolicwwds_12_tfsmdsc ,
                                          String AV97Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel ,
                                          String AV96Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc ,
                                          int AV98Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size ,
                                          String AV100Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel ,
                                          String AV99Mantenimientomaquina_tmsolicwwds_17_tfsmtxt ,
                                          int A9428SMCod ,
                                          java.util.Date A9518SMFchCre ,
                                          String A9519SMUsuCre ,
                                          String A9520SMMaqCod ,
                                          byte A11534SMPri ,
                                          String A9517SMDsc ,
                                          String A9521SMMaqDsc ,
                                          String A9523SMTxt ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV83Mantenimientomaquina_tmsolicwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.SMCod, T1.EmprCod, T1.SMTxt, T2.MaqDsc AS SMMaqDsc, T1.SMDsc, T1.SMPri, T1.SMMaqCod AS SMMaqCod, T1.SMUsuCre, T1.SMFchCre, T1.SMCal, T1.SMEst FROM (TXPMSOLIC" ;
      scmdbuf += " T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.SMMaqCod)" ;
      if ( ! (0==AV84Mantenimientomaquina_tmsolicwwds_2_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV85Mantenimientomaquina_tmsolicwwds_3_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( AV86Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV86Mantenimientomaquina_tmsolicwwds_4_tfsmest_sels, "T1.SMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Mantenimientomaquina_tmsolicwwds_5_tfsmfchcre) )
      {
         addWhere(sWhereString, "(T1.SMFchCre >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV88Mantenimientomaquina_tmsolicwwds_6_tfsmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Mantenimientomaquina_tmsolicwwds_7_tfsmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMUsuCre = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV90Mantenimientomaquina_tmsolicwwds_8_tfsmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Mantenimientomaquina_tmsolicwwds_9_tfsmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMMaqCod = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV92Mantenimientomaquina_tmsolicwwds_10_tfsmpri) )
      {
         addWhere(sWhereString, "(T1.SMPri >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV93Mantenimientomaquina_tmsolicwwds_11_tfsmpri_to) )
      {
         addWhere(sWhereString, "(T1.SMPri <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV94Mantenimientomaquina_tmsolicwwds_12_tfsmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Mantenimientomaquina_tmsolicwwds_13_tfsmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMDsc = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Mantenimientomaquina_tmsolicwwds_14_tfsmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Mantenimientomaquina_tmsolicwwds_15_tfsmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( AV98Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Mantenimientomaquina_tmsolicwwds_16_tfsmcal_sels, "T1.SMCal IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV100Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV99Mantenimientomaquina_tmsolicwwds_17_tfsmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Mantenimientomaquina_tmsolicwwds_18_tfsmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SMTxt = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMDsc" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMEst" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMEst DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMFchCre" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMFchCre DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMUsuCre" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMUsuCre DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMMaqCod" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMMaqCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMPri" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMPri DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCal" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCal DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMTxt" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMTxt DESC" ;
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
                  return conditional_P08EH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EH3", "SELECT EmprCod, SMCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? and SMCod = ? ORDER BY EmprCod, SMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08EH4", "SELECT EmprCod, SMCod, OMEst, OMCod FROM TXPMORDEN WHERE EmprCod = ? and SMCod = ? ORDER BY EmprCod, SMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((int[]) buf[4])[0] = rslt.getInt(4);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[17], false);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 2000);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 2000);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

