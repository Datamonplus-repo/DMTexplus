package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordenwwexportreport_impl extends GXWebReport
{
   public tmordenwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV87Title = httpContext.getMessage( "Lista de Ordenes de Mantenimiento", "") ;
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
         h8Q20( true, 0) ;
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
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV22TFOMCod) && (0==AV23TFOMCod_To) ) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "# Orden", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFOMCod), "ZZZZZZZ9")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV64TFOMCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "# Orden", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64TFOMCod_To_Description, "")), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFOMCod_To), "ZZZZZZZ9")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV34TFPMCod) && (0==AV35TFPMCod_To) ) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Preventivo", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV34TFPMCod), "ZZZZZZZ9")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV66TFPMCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Preventivo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV66TFPMCod_To_Description, "")), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV35TFPMCod_To), "ZZZZZZZ9")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV102TFPMDsc_Sel)==0) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102TFPMDsc_Sel, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV101TFPMDsc)==0) )
         {
            h8Q20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101TFPMDsc, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV25TFOMMaqCod_Sel)==0) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFOMMaqCod_Sel, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV24TFOMMaqCod)==0) )
         {
            h8Q20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24TFOMMaqCod, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV29TFOMMaqDsc_Sel)==0) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFOMMaqDsc_Sel, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV28TFOMMaqDsc)==0) )
         {
            h8Q20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV28TFOMMaqDsc, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV27TFOMMaqCodFor_Sel)==0) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod For", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFOMMaqCodFor_Sel, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFOMMaqCodFor)==0) )
         {
            h8Q20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Cod For", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFOMMaqCodFor, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV31TFOMDscMqPla_Sel)==0) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Mq Planificar", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFOMDscMqPla_Sel, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFOMDscMqPla)==0) )
         {
            h8Q20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Mq Planificar", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFOMDscMqPla, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV32TFSMCod) && (0==AV33TFSMCod_To) ) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Solicitud", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV32TFSMCod), "ZZZZZZZ9")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV65TFSMCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Solicitud", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV65TFSMCod_To_Description, "")), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV33TFSMCod_To), "ZZZZZZZ9")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV60TFOMEst_Sels.fromJSonString(AV58TFOMEst_SelsJson, null);
      if ( ! ( AV60TFOMEst_Sels.size() == 0 ) )
      {
         AV76i = 1 ;
         AV108GXV1 = 1 ;
         while ( AV108GXV1 <= AV60TFOMEst_Sels.size() )
         {
            AV61TFOMEst_Sel = (String)AV60TFOMEst_Sels.elementAt(-1+AV108GXV1) ;
            if ( AV76i == 1 )
            {
               AV59TFOMEst_SelDscs = "" ;
            }
            else
            {
               AV59TFOMEst_SelDscs += ", " ;
            }
            AV75FilterTFOMEst_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV61TFOMEst_Sel), "P") == 0 )
            {
               AV75FilterTFOMEst_SelValueDescription = httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV61TFOMEst_Sel), "R") == 0 )
            {
               AV75FilterTFOMEst_SelValueDescription = httpContext.getMessage( "Realizada", "") ;
            }
            AV59TFOMEst_SelDscs += AV75FilterTFOMEst_SelValueDescription ;
            AV76i = (long)(AV76i+1) ;
            AV108GXV1 = (int)(AV108GXV1+1) ;
         }
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV59TFOMEst_SelDscs, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFOMUsuCre_Sel)==0) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFOMUsuCre_Sel, "@!")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV46TFOMUsuCre)==0) )
         {
            h8Q20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV46TFOMUsuCre, "@!")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV42TFOMFchCre) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Creación", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV42TFOMFchCre, "99/99/99 99:99"), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV37TFOMTxt_Sel)==0) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV37TFOMTxt_Sel, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV36TFOMTxt)==0) )
         {
            h8Q20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripcion", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFOMTxt, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38TFOMFchPre)) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Prevista", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV38TFOMFchPre, "99/99/99"), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV40TFOMFchCer) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cerrada", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV40TFOMFchCer, "99/99/99 99:99"), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFOMDuracion_Sel)==0) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Duracion", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFOMDuracion_Sel, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV44TFOMDuracion)==0) )
         {
            h8Q20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Duracion", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFOMDuracion, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFOMCosRea)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFOMCosRea_To)==0) ) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Costo Real", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV48TFOMCosRea, "ZZ,ZZZ,ZZ9.999")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV70TFOMCosRea_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Costo Real", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFOMCosRea_To_Description, "")), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV49TFOMCosRea_To, "ZZ,ZZZ,ZZ9.999")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFOMRRCosT)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFOMRRCosT_To)==0) ) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Costo Total Reserva Repuesto", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV50TFOMRRCosT, "ZZZZZZZ9.999")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV71TFOMRRCosT_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Costo Total Reserva Repuesto", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV71TFOMRRCosT_To_Description, "")), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV51TFOMRRCosT_To, "ZZZZZZZ9.999")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFOMRCCosT)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFOMRCCosT_To)==0) ) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Costo Total Consumo Repuesto", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV52TFOMRCCosT, "ZZZZZZZ9.999")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV72TFOMRCCosT_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Costo Total Consumo Repuesto", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV72TFOMRCCosT_To_Description, "")), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV53TFOMRCCosT_To, "ZZZZZZZ9.999")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFOMMRCosT)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFOMMRCosT_To)==0) ) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Costo Total Reserva Mano Obra", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54TFOMMRCosT, "ZZZZZZZ9.999")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV73TFOMMRCosT_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Costo Total Reserva Mano Obra", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV73TFOMMRCosT_To_Description, "")), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55TFOMMRCosT_To, "ZZZZZZZ9.999")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFOMMCCosT)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFOMMCCosT_To)==0) ) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Costo Total Consumo Mano Obra", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV56TFOMMCCosT, "ZZZZZZZ9.999")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV74TFOMMCCosT_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Costo Total Consumo Mano Obra", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV74TFOMMCCosT_To_Description, "")), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57TFOMMCCosT_To, "ZZZZZZZ9.999")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV63TFOMNot_Sel)==0) )
      {
         h8Q20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nota", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63TFOMNot_Sel, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV62TFOMNot)==0) )
         {
            h8Q20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nota", ""), 25, Gx_line+0, 234, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62TFOMNot, "")), 234, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8Q20( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8Q20( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "# Orden", ""), 30, Gx_line+10, 90, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Preventivo", ""), 94, Gx_line+10, 154, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 158, Gx_line+10, 278, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Máquina", ""), 282, Gx_line+10, 342, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 346, Gx_line+10, 466, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 470, Gx_line+10, 592, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario", ""), 596, Gx_line+10, 657, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Creación", ""), 661, Gx_line+10, 722, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Prevista", ""), 726, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext = AV12FilterFullText ;
      AV111Mantenimientomaquina_tmordenwwds_2_tfomcod = AV22TFOMCod ;
      AV112Mantenimientomaquina_tmordenwwds_3_tfomcod_to = AV23TFOMCod_To ;
      AV113Mantenimientomaquina_tmordenwwds_4_tfpmcod = AV34TFPMCod ;
      AV114Mantenimientomaquina_tmordenwwds_5_tfpmcod_to = AV35TFPMCod_To ;
      AV115Mantenimientomaquina_tmordenwwds_6_tfpmdsc = AV101TFPMDsc ;
      AV116Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel = AV102TFPMDsc_Sel ;
      AV117Mantenimientomaquina_tmordenwwds_8_tfommaqcod = AV24TFOMMaqCod ;
      AV118Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel = AV25TFOMMaqCod_Sel ;
      AV119Mantenimientomaquina_tmordenwwds_10_tfommaqdsc = AV28TFOMMaqDsc ;
      AV120Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel = AV29TFOMMaqDsc_Sel ;
      AV121Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor = AV26TFOMMaqCodFor ;
      AV122Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel = AV27TFOMMaqCodFor_Sel ;
      AV123Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla = AV30TFOMDscMqPla ;
      AV124Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel = AV31TFOMDscMqPla_Sel ;
      AV125Mantenimientomaquina_tmordenwwds_16_tfsmcod = AV32TFSMCod ;
      AV126Mantenimientomaquina_tmordenwwds_17_tfsmcod_to = AV33TFSMCod_To ;
      AV127Mantenimientomaquina_tmordenwwds_18_tfomest_sels = AV60TFOMEst_Sels ;
      AV128Mantenimientomaquina_tmordenwwds_19_tfomusucre = AV46TFOMUsuCre ;
      AV129Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel = AV47TFOMUsuCre_Sel ;
      AV130Mantenimientomaquina_tmordenwwds_21_tfomfchcre = AV42TFOMFchCre ;
      AV131Mantenimientomaquina_tmordenwwds_22_tfomtxt = AV36TFOMTxt ;
      AV132Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel = AV37TFOMTxt_Sel ;
      AV133Mantenimientomaquina_tmordenwwds_24_tfomfchpre = AV38TFOMFchPre ;
      AV134Mantenimientomaquina_tmordenwwds_25_tfomfchcer = AV40TFOMFchCer ;
      AV135Mantenimientomaquina_tmordenwwds_26_tfomduracion = AV44TFOMDuracion ;
      AV136Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel = AV45TFOMDuracion_Sel ;
      AV137Mantenimientomaquina_tmordenwwds_28_tfomcosrea = AV48TFOMCosRea ;
      AV138Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to = AV49TFOMCosRea_To ;
      AV139Mantenimientomaquina_tmordenwwds_30_tfomrrcost = AV50TFOMRRCosT ;
      AV140Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to = AV51TFOMRRCosT_To ;
      AV141Mantenimientomaquina_tmordenwwds_32_tfomrccost = AV52TFOMRCCosT ;
      AV142Mantenimientomaquina_tmordenwwds_33_tfomrccost_to = AV53TFOMRCCosT_To ;
      AV143Mantenimientomaquina_tmordenwwds_34_tfommrcost = AV54TFOMMRCosT ;
      AV144Mantenimientomaquina_tmordenwwds_35_tfommrcost_to = AV55TFOMMRCosT_To ;
      AV145Mantenimientomaquina_tmordenwwds_36_tfommccost = AV56TFOMMCCosT ;
      AV146Mantenimientomaquina_tmordenwwds_37_tfommccost_to = AV57TFOMMCCosT_To ;
      AV147Mantenimientomaquina_tmordenwwds_38_tfomnot = AV62TFOMNot ;
      AV148Mantenimientomaquina_tmordenwwds_39_tfomnot_sel = AV63TFOMNot_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV127Mantenimientomaquina_tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV111Mantenimientomaquina_tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV112Mantenimientomaquina_tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV113Mantenimientomaquina_tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV114Mantenimientomaquina_tmordenwwds_5_tfpmcod_to) ,
                                           AV116Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel ,
                                           AV115Mantenimientomaquina_tmordenwwds_6_tfpmdsc ,
                                           AV118Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel ,
                                           AV117Mantenimientomaquina_tmordenwwds_8_tfommaqcod ,
                                           AV120Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel ,
                                           AV119Mantenimientomaquina_tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV125Mantenimientomaquina_tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV126Mantenimientomaquina_tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV127Mantenimientomaquina_tmordenwwds_18_tfomest_sels.size()) ,
                                           AV129Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel ,
                                           AV128Mantenimientomaquina_tmordenwwds_19_tfomusucre ,
                                           AV130Mantenimientomaquina_tmordenwwds_21_tfomfchcre ,
                                           AV132Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel ,
                                           AV131Mantenimientomaquina_tmordenwwds_22_tfomtxt ,
                                           AV133Mantenimientomaquina_tmordenwwds_24_tfomfchpre ,
                                           AV134Mantenimientomaquina_tmordenwwds_25_tfomfchcer ,
                                           AV139Mantenimientomaquina_tmordenwwds_30_tfomrrcost ,
                                           AV140Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to ,
                                           AV141Mantenimientomaquina_tmordenwwds_32_tfomrccost ,
                                           AV142Mantenimientomaquina_tmordenwwds_33_tfomrccost_to ,
                                           AV143Mantenimientomaquina_tmordenwwds_34_tfommrcost ,
                                           AV144Mantenimientomaquina_tmordenwwds_35_tfommrcost_to ,
                                           AV145Mantenimientomaquina_tmordenwwds_36_tfommccost ,
                                           AV146Mantenimientomaquina_tmordenwwds_37_tfommccost_to ,
                                           AV148Mantenimientomaquina_tmordenwwds_39_tfomnot_sel ,
                                           AV147Mantenimientomaquina_tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV122Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV121Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor ,
                                           AV124Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV123Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla ,
                                           AV136Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel ,
                                           AV135Mantenimientomaquina_tmordenwwds_26_tfomduracion ,
                                           AV137Mantenimientomaquina_tmordenwwds_28_tfomcosrea ,
                                           AV138Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV121Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV121Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV123Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV123Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV115Mantenimientomaquina_tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV115Mantenimientomaquina_tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV117Mantenimientomaquina_tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV117Mantenimientomaquina_tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV119Mantenimientomaquina_tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV119Mantenimientomaquina_tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV128Mantenimientomaquina_tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV128Mantenimientomaquina_tmordenwwds_19_tfomusucre), 8, "%") ;
      lV131Mantenimientomaquina_tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV131Mantenimientomaquina_tmordenwwds_22_tfomtxt), "%", "") ;
      lV147Mantenimientomaquina_tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV147Mantenimientomaquina_tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor P08Q27 */
      pr_default.execute(0, new Object[] {AV122Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel, AV121Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor, lV121Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor, AV122Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel, AV122Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel, AV124Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel, AV123Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla, lV123Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla, AV124Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel, AV124Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV111Mantenimientomaquina_tmordenwwds_2_tfomcod), Integer.valueOf(AV112Mantenimientomaquina_tmordenwwds_3_tfomcod_to), Integer.valueOf(AV113Mantenimientomaquina_tmordenwwds_4_tfpmcod), Integer.valueOf(AV114Mantenimientomaquina_tmordenwwds_5_tfpmcod_to), lV115Mantenimientomaquina_tmordenwwds_6_tfpmdsc, AV116Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel, lV117Mantenimientomaquina_tmordenwwds_8_tfommaqcod, AV118Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel, lV119Mantenimientomaquina_tmordenwwds_10_tfommaqdsc, AV120Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV125Mantenimientomaquina_tmordenwwds_16_tfsmcod), Integer.valueOf(AV126Mantenimientomaquina_tmordenwwds_17_tfsmcod_to), lV128Mantenimientomaquina_tmordenwwds_19_tfomusucre, AV129Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel, AV130Mantenimientomaquina_tmordenwwds_21_tfomfchcre, lV131Mantenimientomaquina_tmordenwwds_22_tfomtxt, AV132Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel, AV133Mantenimientomaquina_tmordenwwds_24_tfomfchpre, AV134Mantenimientomaquina_tmordenwwds_25_tfomfchcer, AV139Mantenimientomaquina_tmordenwwds_30_tfomrrcost, AV140Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to, AV141Mantenimientomaquina_tmordenwwds_32_tfomrccost, AV142Mantenimientomaquina_tmordenwwds_33_tfomrccost_to, AV143Mantenimientomaquina_tmordenwwds_34_tfommrcost, AV144Mantenimientomaquina_tmordenwwds_35_tfommrcost_to, AV145Mantenimientomaquina_tmordenwwds_36_tfommccost, AV146Mantenimientomaquina_tmordenwwds_37_tfommccost_to, lV147Mantenimientomaquina_tmordenwwds_38_tfomnot, AV148Mantenimientomaquina_tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08Q27_A396EmprCod[0] ;
         A9464OMNot = P08Q27_A9464OMNot[0] ;
         A9439OMFchCer = P08Q27_A9439OMFchCer[0] ;
         A9438OMFchPre = P08Q27_A9438OMFchPre[0] ;
         A9433OMTxt = P08Q27_A9433OMTxt[0] ;
         A9436OMFchCre = P08Q27_A9436OMFchCre[0] ;
         A9437OMUsuCre = P08Q27_A9437OMUsuCre[0] ;
         A9428SMCod = P08Q27_A9428SMCod[0] ;
         n9428SMCod = P08Q27_n9428SMCod[0] ;
         A9427OMMaqDsc = P08Q27_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08Q27_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = P08Q27_A9426OMMaqCod[0] ;
         A9473PMDsc = P08Q27_A9473PMDsc[0] ;
         n9473PMDsc = P08Q27_n9473PMDsc[0] ;
         A9429PMCod = P08Q27_A9429PMCod[0] ;
         n9429PMCod = P08Q27_n9429PMCod[0] ;
         A9425OMCod = P08Q27_A9425OMCod[0] ;
         A13678OMDscMqPla = P08Q27_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08Q27_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08Q27_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08Q27_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = P08Q27_A9441OMMCCosT[0] ;
         A9443OMRCCosT = P08Q27_A9443OMRCCosT[0] ;
         A9445OMEst = P08Q27_A9445OMEst[0] ;
         A9442OMMRCosT = P08Q27_A9442OMMRCosT[0] ;
         A9444OMRRCosT = P08Q27_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = P08Q27_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = P08Q27_n9427OMMaqDsc[0] ;
         A9473PMDsc = P08Q27_A9473PMDsc[0] ;
         n9473PMDsc = P08Q27_n9473PMDsc[0] ;
         A9441OMMCCosT = P08Q27_A9441OMMCCosT[0] ;
         A9442OMMRCosT = P08Q27_A9442OMMRCosT[0] ;
         A9443OMRCCosT = P08Q27_A9443OMRCCosT[0] ;
         A9444OMRRCosT = P08Q27_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = P08Q27_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = P08Q27_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = P08Q27_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = P08Q27_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV136Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV135Mantenimientomaquina_tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV135Mantenimientomaquina_tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV136Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV136Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Mantenimientomaquina_tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV137Mantenimientomaquina_tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV138Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        AV13OMEstDescription = "" ;
                        if ( GXutil.strcmp(GXutil.trim( A9445OMEst), "P") == 0 )
                        {
                           AV13OMEstDescription = httpContext.getMessage( "Pendiente", "") ;
                        }
                        else if ( GXutil.strcmp(GXutil.trim( A9445OMEst), "R") == 0 )
                        {
                           AV13OMEstDescription = httpContext.getMessage( "Realizada", "") ;
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
                           pr_default.close(0);
                           pr_default.close(0);
                           getPrinter().GxEndPage() ;
                           /* Close printer file */
                           getPrinter().GxEndDocument() ;
                           endPrinter();
                           returnInSub = true;
                           if (true) return;
                        }
                        h8Q20( false, 36) ;
                        getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9")), 30, Gx_line+10, 90, Gx_line+25, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9")), 94, Gx_line+10, 154, Gx_line+25, 2, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9473PMDsc, "")), 158, Gx_line+10, 278, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9426OMMaqCod, "")), 282, Gx_line+10, 342, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9427OMMaqDsc, "")), 346, Gx_line+10, 466, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13OMEstDescription, "")), 470, Gx_line+10, 592, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")), 596, Gx_line+10, 657, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( A9436OMFchCre, "99/99/99 99:99"), 661, Gx_line+10, 722, Gx_line+25, 0, 0, 0, 0) ;
                        getPrinter().GxDrawText(localUtil.format( A9438OMFchPre, "99/99/99"), 726, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV14Session.getValue("MantenimientoMaquina.TMOrdenWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMOrdenWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("MantenimientoMaquina.TMOrdenWWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV149GXV2 = 1 ;
      while ( AV149GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV149GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOD") == 0 )
         {
            AV22TFOMCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFOMCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMCOD") == 0 )
         {
            AV34TFPMCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFPMCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC") == 0 )
         {
            AV101TFPMDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC_SEL") == 0 )
         {
            AV102TFPMDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD") == 0 )
         {
            AV24TFOMMaqCod = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD_SEL") == 0 )
         {
            AV25TFOMMaqCod_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC") == 0 )
         {
            AV28TFOMMaqDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC_SEL") == 0 )
         {
            AV29TFOMMaqDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCODFOR") == 0 )
         {
            AV26TFOMMaqCodFor = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCODFOR_SEL") == 0 )
         {
            AV27TFOMMaqCodFor_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDSCMQPLA") == 0 )
         {
            AV30TFOMDscMqPla = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDSCMQPLA_SEL") == 0 )
         {
            AV31TFOMDscMqPla_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCOD") == 0 )
         {
            AV32TFSMCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFSMCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMEST_SEL") == 0 )
         {
            AV58TFOMEst_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV60TFOMEst_Sels.fromJSonString(AV58TFOMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMUSUCRE") == 0 )
         {
            AV46TFOMUsuCre = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMUSUCRE_SEL") == 0 )
         {
            AV47TFOMUsuCre_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHCRE") == 0 )
         {
            AV42TFOMFchCre = localUtil.ctot( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMTXT") == 0 )
         {
            AV36TFOMTxt = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMTXT_SEL") == 0 )
         {
            AV37TFOMTxt_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHPRE") == 0 )
         {
            AV38TFOMFchPre = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHCER") == 0 )
         {
            AV40TFOMFchCer = localUtil.ctot( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDURACION") == 0 )
         {
            AV44TFOMDuracion = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDURACION_SEL") == 0 )
         {
            AV45TFOMDuracion_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOSREA") == 0 )
         {
            AV48TFOMCosRea = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFOMCosRea_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMRRCOST") == 0 )
         {
            AV50TFOMRRCosT = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFOMRRCosT_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMRCCOST") == 0 )
         {
            AV52TFOMRCCosT = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFOMRCCosT_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMRCOST") == 0 )
         {
            AV54TFOMMRCosT = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFOMMRCosT_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCCOST") == 0 )
         {
            AV56TFOMMCCosT = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFOMMCCosT_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMNOT") == 0 )
         {
            AV62TFOMNot = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMNOT_SEL") == 0 )
         {
            AV63TFOMNot_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV149GXV2 = (int)(AV149GXV2+1) ;
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

   public void h8Q20( boolean bFoot ,
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
               AV82DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV85PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV82DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV87Title = AV105Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV80AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV87Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV87Title = "" ;
      AV12FilterFullText = "" ;
      AV64TFOMCod_To_Description = "" ;
      AV66TFPMCod_To_Description = "" ;
      AV102TFPMDsc_Sel = "" ;
      AV101TFPMDsc = "" ;
      AV25TFOMMaqCod_Sel = "" ;
      AV24TFOMMaqCod = "" ;
      AV29TFOMMaqDsc_Sel = "" ;
      AV28TFOMMaqDsc = "" ;
      AV27TFOMMaqCodFor_Sel = "" ;
      AV26TFOMMaqCodFor = "" ;
      AV31TFOMDscMqPla_Sel = "" ;
      AV30TFOMDscMqPla = "" ;
      AV65TFSMCod_To_Description = "" ;
      AV60TFOMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV58TFOMEst_SelsJson = "" ;
      AV61TFOMEst_Sel = "" ;
      AV59TFOMEst_SelDscs = "" ;
      AV75FilterTFOMEst_SelValueDescription = "" ;
      AV47TFOMUsuCre_Sel = "" ;
      AV46TFOMUsuCre = "" ;
      AV42TFOMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV37TFOMTxt_Sel = "" ;
      AV36TFOMTxt = "" ;
      AV38TFOMFchPre = GXutil.nullDate() ;
      AV40TFOMFchCer = GXutil.resetTime( GXutil.nullDate() );
      AV45TFOMDuracion_Sel = "" ;
      AV44TFOMDuracion = "" ;
      AV48TFOMCosRea = DecimalUtil.ZERO ;
      AV49TFOMCosRea_To = DecimalUtil.ZERO ;
      AV70TFOMCosRea_To_Description = "" ;
      AV50TFOMRRCosT = DecimalUtil.ZERO ;
      AV51TFOMRRCosT_To = DecimalUtil.ZERO ;
      AV71TFOMRRCosT_To_Description = "" ;
      AV52TFOMRCCosT = DecimalUtil.ZERO ;
      AV53TFOMRCCosT_To = DecimalUtil.ZERO ;
      AV72TFOMRCCosT_To_Description = "" ;
      AV54TFOMMRCosT = DecimalUtil.ZERO ;
      AV55TFOMMRCosT_To = DecimalUtil.ZERO ;
      AV73TFOMMRCosT_To_Description = "" ;
      AV56TFOMMCCosT = DecimalUtil.ZERO ;
      AV57TFOMMCCosT_To = DecimalUtil.ZERO ;
      AV74TFOMMCCosT_To_Description = "" ;
      AV63TFOMNot_Sel = "" ;
      AV62TFOMNot = "" ;
      A9445OMEst = "" ;
      A9473PMDsc = "" ;
      A9426OMMaqCod = "" ;
      A9427OMMaqDsc = "" ;
      A9437OMUsuCre = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9438OMFchPre = GXutil.nullDate() ;
      AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext = "" ;
      AV115Mantenimientomaquina_tmordenwwds_6_tfpmdsc = "" ;
      AV116Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel = "" ;
      AV117Mantenimientomaquina_tmordenwwds_8_tfommaqcod = "" ;
      AV118Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel = "" ;
      AV119Mantenimientomaquina_tmordenwwds_10_tfommaqdsc = "" ;
      AV120Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel = "" ;
      AV121Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor = "" ;
      AV122Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel = "" ;
      AV123Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla = "" ;
      AV124Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel = "" ;
      AV127Mantenimientomaquina_tmordenwwds_18_tfomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV128Mantenimientomaquina_tmordenwwds_19_tfomusucre = "" ;
      AV129Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel = "" ;
      AV130Mantenimientomaquina_tmordenwwds_21_tfomfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV131Mantenimientomaquina_tmordenwwds_22_tfomtxt = "" ;
      AV132Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel = "" ;
      AV133Mantenimientomaquina_tmordenwwds_24_tfomfchpre = GXutil.nullDate() ;
      AV134Mantenimientomaquina_tmordenwwds_25_tfomfchcer = GXutil.resetTime( GXutil.nullDate() );
      AV135Mantenimientomaquina_tmordenwwds_26_tfomduracion = "" ;
      AV136Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel = "" ;
      AV137Mantenimientomaquina_tmordenwwds_28_tfomcosrea = DecimalUtil.ZERO ;
      AV138Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to = DecimalUtil.ZERO ;
      AV139Mantenimientomaquina_tmordenwwds_30_tfomrrcost = DecimalUtil.ZERO ;
      AV140Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to = DecimalUtil.ZERO ;
      AV141Mantenimientomaquina_tmordenwwds_32_tfomrccost = DecimalUtil.ZERO ;
      AV142Mantenimientomaquina_tmordenwwds_33_tfomrccost_to = DecimalUtil.ZERO ;
      AV143Mantenimientomaquina_tmordenwwds_34_tfommrcost = DecimalUtil.ZERO ;
      AV144Mantenimientomaquina_tmordenwwds_35_tfommrcost_to = DecimalUtil.ZERO ;
      AV145Mantenimientomaquina_tmordenwwds_36_tfommccost = DecimalUtil.ZERO ;
      AV146Mantenimientomaquina_tmordenwwds_37_tfommccost_to = DecimalUtil.ZERO ;
      AV147Mantenimientomaquina_tmordenwwds_38_tfomnot = "" ;
      AV148Mantenimientomaquina_tmordenwwds_39_tfomnot_sel = "" ;
      lV110Mantenimientomaquina_tmordenwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV121Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor = "" ;
      lV123Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla = "" ;
      lV115Mantenimientomaquina_tmordenwwds_6_tfpmdsc = "" ;
      lV117Mantenimientomaquina_tmordenwwds_8_tfommaqcod = "" ;
      lV119Mantenimientomaquina_tmordenwwds_10_tfommaqdsc = "" ;
      lV128Mantenimientomaquina_tmordenwwds_19_tfomusucre = "" ;
      lV131Mantenimientomaquina_tmordenwwds_22_tfomtxt = "" ;
      lV147Mantenimientomaquina_tmordenwwds_38_tfomnot = "" ;
      A9433OMTxt = "" ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      A9444OMRRCosT = DecimalUtil.ZERO ;
      A9443OMRCCosT = DecimalUtil.ZERO ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      A9441OMMCCosT = DecimalUtil.ZERO ;
      A9464OMNot = "" ;
      A13679OMMaqCodFo = "" ;
      A13678OMDscMqPla = "" ;
      A13680OMDuracion = "" ;
      A9440OMCosRea = DecimalUtil.ZERO ;
      P08Q27_A396EmprCod = new String[] {""} ;
      P08Q27_A9464OMNot = new String[] {""} ;
      P08Q27_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q27_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q27_A9433OMTxt = new String[] {""} ;
      P08Q27_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q27_A9437OMUsuCre = new String[] {""} ;
      P08Q27_A9428SMCod = new int[1] ;
      P08Q27_n9428SMCod = new boolean[] {false} ;
      P08Q27_A9427OMMaqDsc = new String[] {""} ;
      P08Q27_n9427OMMaqDsc = new boolean[] {false} ;
      P08Q27_A9426OMMaqCod = new String[] {""} ;
      P08Q27_A9473PMDsc = new String[] {""} ;
      P08Q27_n9473PMDsc = new boolean[] {false} ;
      P08Q27_A9429PMCod = new int[1] ;
      P08Q27_n9429PMCod = new boolean[] {false} ;
      P08Q27_A9425OMCod = new int[1] ;
      P08Q27_A13678OMDscMqPla = new String[] {""} ;
      P08Q27_n13678OMDscMqPla = new boolean[] {false} ;
      P08Q27_A13679OMMaqCodFo = new String[] {""} ;
      P08Q27_n13679OMMaqCodFo = new boolean[] {false} ;
      P08Q27_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q27_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q27_A9445OMEst = new String[] {""} ;
      P08Q27_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q27_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      AV13OMEstDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV85PageInfo = "" ;
      AV82DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV105Pgmdesc = "" ;
      AV80AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmordenwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08Q27_A396EmprCod, P08Q27_A9464OMNot, P08Q27_A9439OMFchCer, P08Q27_A9438OMFchPre, P08Q27_A9433OMTxt, P08Q27_A9436OMFchCre, P08Q27_A9437OMUsuCre, P08Q27_A9428SMCod, P08Q27_n9428SMCod, P08Q27_A9427OMMaqDsc,
            P08Q27_n9427OMMaqDsc, P08Q27_A9426OMMaqCod, P08Q27_A9473PMDsc, P08Q27_n9473PMDsc, P08Q27_A9429PMCod, P08Q27_n9429PMCod, P08Q27_A9425OMCod, P08Q27_A13678OMDscMqPla, P08Q27_n13678OMDscMqPla, P08Q27_A13679OMMaqCodFo,
            P08Q27_n13679OMMaqCodFo, P08Q27_A9441OMMCCosT, P08Q27_A9443OMRCCosT, P08Q27_A9445OMEst, P08Q27_A9442OMMRCosT, P08Q27_A9444OMRRCosT
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV105Pgmdesc = httpContext.getMessage( "Lista Ordenes de Mantenimiento", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV105Pgmdesc = httpContext.getMessage( "Lista Ordenes de Mantenimiento", "") ;
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
   private int AV22TFOMCod ;
   private int AV23TFOMCod_To ;
   private int AV34TFPMCod ;
   private int AV35TFPMCod_To ;
   private int AV32TFSMCod ;
   private int AV33TFSMCod_To ;
   private int AV108GXV1 ;
   private int A9425OMCod ;
   private int A9429PMCod ;
   private int AV111Mantenimientomaquina_tmordenwwds_2_tfomcod ;
   private int AV112Mantenimientomaquina_tmordenwwds_3_tfomcod_to ;
   private int AV113Mantenimientomaquina_tmordenwwds_4_tfpmcod ;
   private int AV114Mantenimientomaquina_tmordenwwds_5_tfpmcod_to ;
   private int AV125Mantenimientomaquina_tmordenwwds_16_tfsmcod ;
   private int AV126Mantenimientomaquina_tmordenwwds_17_tfsmcod_to ;
   private int AV127Mantenimientomaquina_tmordenwwds_18_tfomest_sels_size ;
   private int A9428SMCod ;
   private int AV149GXV2 ;
   private long AV76i ;
   private java.math.BigDecimal AV48TFOMCosRea ;
   private java.math.BigDecimal AV49TFOMCosRea_To ;
   private java.math.BigDecimal AV50TFOMRRCosT ;
   private java.math.BigDecimal AV51TFOMRRCosT_To ;
   private java.math.BigDecimal AV52TFOMRCCosT ;
   private java.math.BigDecimal AV53TFOMRCCosT_To ;
   private java.math.BigDecimal AV54TFOMMRCosT ;
   private java.math.BigDecimal AV55TFOMMRCosT_To ;
   private java.math.BigDecimal AV56TFOMMCCosT ;
   private java.math.BigDecimal AV57TFOMMCCosT_To ;
   private java.math.BigDecimal AV137Mantenimientomaquina_tmordenwwds_28_tfomcosrea ;
   private java.math.BigDecimal AV138Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to ;
   private java.math.BigDecimal AV139Mantenimientomaquina_tmordenwwds_30_tfomrrcost ;
   private java.math.BigDecimal AV140Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to ;
   private java.math.BigDecimal AV141Mantenimientomaquina_tmordenwwds_32_tfomrccost ;
   private java.math.BigDecimal AV142Mantenimientomaquina_tmordenwwds_33_tfomrccost_to ;
   private java.math.BigDecimal AV143Mantenimientomaquina_tmordenwwds_34_tfommrcost ;
   private java.math.BigDecimal AV144Mantenimientomaquina_tmordenwwds_35_tfommrcost_to ;
   private java.math.BigDecimal AV145Mantenimientomaquina_tmordenwwds_36_tfommccost ;
   private java.math.BigDecimal AV146Mantenimientomaquina_tmordenwwds_37_tfommccost_to ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal A9443OMRCCosT ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal A9441OMMCCosT ;
   private java.math.BigDecimal A9440OMCosRea ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV102TFPMDsc_Sel ;
   private String AV101TFPMDsc ;
   private String AV25TFOMMaqCod_Sel ;
   private String AV24TFOMMaqCod ;
   private String AV29TFOMMaqDsc_Sel ;
   private String AV28TFOMMaqDsc ;
   private String AV27TFOMMaqCodFor_Sel ;
   private String AV26TFOMMaqCodFor ;
   private String AV31TFOMDscMqPla_Sel ;
   private String AV30TFOMDscMqPla ;
   private String AV61TFOMEst_Sel ;
   private String AV47TFOMUsuCre_Sel ;
   private String AV46TFOMUsuCre ;
   private String A9445OMEst ;
   private String A9473PMDsc ;
   private String A9426OMMaqCod ;
   private String A9427OMMaqDsc ;
   private String A9437OMUsuCre ;
   private String AV115Mantenimientomaquina_tmordenwwds_6_tfpmdsc ;
   private String AV116Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel ;
   private String AV117Mantenimientomaquina_tmordenwwds_8_tfommaqcod ;
   private String AV118Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel ;
   private String AV119Mantenimientomaquina_tmordenwwds_10_tfommaqdsc ;
   private String AV120Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel ;
   private String AV121Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor ;
   private String AV122Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel ;
   private String AV123Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla ;
   private String AV124Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel ;
   private String AV128Mantenimientomaquina_tmordenwwds_19_tfomusucre ;
   private String AV129Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel ;
   private String scmdbuf ;
   private String lV121Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor ;
   private String lV123Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla ;
   private String lV115Mantenimientomaquina_tmordenwwds_6_tfpmdsc ;
   private String lV117Mantenimientomaquina_tmordenwwds_8_tfommaqcod ;
   private String lV119Mantenimientomaquina_tmordenwwds_10_tfommaqdsc ;
   private String lV128Mantenimientomaquina_tmordenwwds_19_tfomusucre ;
   private String A13679OMMaqCodFo ;
   private String A13678OMDscMqPla ;
   private String A396EmprCod ;
   private String AV105Pgmdesc ;
   private java.util.Date AV42TFOMFchCre ;
   private java.util.Date AV40TFOMFchCer ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date AV130Mantenimientomaquina_tmordenwwds_21_tfomfchcre ;
   private java.util.Date AV134Mantenimientomaquina_tmordenwwds_25_tfomfchcer ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date AV38TFOMFchPre ;
   private java.util.Date A9438OMFchPre ;
   private java.util.Date AV133Mantenimientomaquina_tmordenwwds_24_tfomfchpre ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n9428SMCod ;
   private boolean n9427OMMaqDsc ;
   private boolean n9473PMDsc ;
   private boolean n9429PMCod ;
   private boolean n13678OMDscMqPla ;
   private boolean n13679OMMaqCodFo ;
   private String AV58TFOMEst_SelsJson ;
   private String AV87Title ;
   private String AV12FilterFullText ;
   private String AV64TFOMCod_To_Description ;
   private String AV66TFPMCod_To_Description ;
   private String AV65TFSMCod_To_Description ;
   private String AV59TFOMEst_SelDscs ;
   private String AV75FilterTFOMEst_SelValueDescription ;
   private String AV37TFOMTxt_Sel ;
   private String AV36TFOMTxt ;
   private String AV45TFOMDuracion_Sel ;
   private String AV44TFOMDuracion ;
   private String AV70TFOMCosRea_To_Description ;
   private String AV71TFOMRRCosT_To_Description ;
   private String AV72TFOMRCCosT_To_Description ;
   private String AV73TFOMMRCosT_To_Description ;
   private String AV74TFOMMCCosT_To_Description ;
   private String AV63TFOMNot_Sel ;
   private String AV62TFOMNot ;
   private String AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext ;
   private String AV131Mantenimientomaquina_tmordenwwds_22_tfomtxt ;
   private String AV132Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel ;
   private String AV135Mantenimientomaquina_tmordenwwds_26_tfomduracion ;
   private String AV136Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel ;
   private String AV147Mantenimientomaquina_tmordenwwds_38_tfomnot ;
   private String AV148Mantenimientomaquina_tmordenwwds_39_tfomnot_sel ;
   private String lV110Mantenimientomaquina_tmordenwwds_1_filterfulltext ;
   private String lV131Mantenimientomaquina_tmordenwwds_22_tfomtxt ;
   private String lV147Mantenimientomaquina_tmordenwwds_38_tfomnot ;
   private String A9433OMTxt ;
   private String A9464OMNot ;
   private String A13680OMDuracion ;
   private String AV13OMEstDescription ;
   private String AV85PageInfo ;
   private String AV82DateInfo ;
   private String AV80AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08Q27_A396EmprCod ;
   private String[] P08Q27_A9464OMNot ;
   private java.util.Date[] P08Q27_A9439OMFchCer ;
   private java.util.Date[] P08Q27_A9438OMFchPre ;
   private String[] P08Q27_A9433OMTxt ;
   private java.util.Date[] P08Q27_A9436OMFchCre ;
   private String[] P08Q27_A9437OMUsuCre ;
   private int[] P08Q27_A9428SMCod ;
   private boolean[] P08Q27_n9428SMCod ;
   private String[] P08Q27_A9427OMMaqDsc ;
   private boolean[] P08Q27_n9427OMMaqDsc ;
   private String[] P08Q27_A9426OMMaqCod ;
   private String[] P08Q27_A9473PMDsc ;
   private boolean[] P08Q27_n9473PMDsc ;
   private int[] P08Q27_A9429PMCod ;
   private boolean[] P08Q27_n9429PMCod ;
   private int[] P08Q27_A9425OMCod ;
   private String[] P08Q27_A13678OMDscMqPla ;
   private boolean[] P08Q27_n13678OMDscMqPla ;
   private String[] P08Q27_A13679OMMaqCodFo ;
   private boolean[] P08Q27_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] P08Q27_A9441OMMCCosT ;
   private java.math.BigDecimal[] P08Q27_A9443OMRCCosT ;
   private String[] P08Q27_A9445OMEst ;
   private java.math.BigDecimal[] P08Q27_A9442OMMRCosT ;
   private java.math.BigDecimal[] P08Q27_A9444OMRRCosT ;
   private GXSimpleCollection<String> AV60TFOMEst_Sels ;
   private GXSimpleCollection<String> AV127Mantenimientomaquina_tmordenwwds_18_tfomest_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class tmordenwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08Q27( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9445OMEst ,
                                          GXSimpleCollection<String> AV127Mantenimientomaquina_tmordenwwds_18_tfomest_sels ,
                                          int AV111Mantenimientomaquina_tmordenwwds_2_tfomcod ,
                                          int AV112Mantenimientomaquina_tmordenwwds_3_tfomcod_to ,
                                          int AV113Mantenimientomaquina_tmordenwwds_4_tfpmcod ,
                                          int AV114Mantenimientomaquina_tmordenwwds_5_tfpmcod_to ,
                                          String AV116Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel ,
                                          String AV115Mantenimientomaquina_tmordenwwds_6_tfpmdsc ,
                                          String AV118Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel ,
                                          String AV117Mantenimientomaquina_tmordenwwds_8_tfommaqcod ,
                                          String AV120Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel ,
                                          String AV119Mantenimientomaquina_tmordenwwds_10_tfommaqdsc ,
                                          int AV125Mantenimientomaquina_tmordenwwds_16_tfsmcod ,
                                          int AV126Mantenimientomaquina_tmordenwwds_17_tfsmcod_to ,
                                          int AV127Mantenimientomaquina_tmordenwwds_18_tfomest_sels_size ,
                                          String AV129Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel ,
                                          String AV128Mantenimientomaquina_tmordenwwds_19_tfomusucre ,
                                          java.util.Date AV130Mantenimientomaquina_tmordenwwds_21_tfomfchcre ,
                                          String AV132Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel ,
                                          String AV131Mantenimientomaquina_tmordenwwds_22_tfomtxt ,
                                          java.util.Date AV133Mantenimientomaquina_tmordenwwds_24_tfomfchpre ,
                                          java.util.Date AV134Mantenimientomaquina_tmordenwwds_25_tfomfchcer ,
                                          java.math.BigDecimal AV139Mantenimientomaquina_tmordenwwds_30_tfomrrcost ,
                                          java.math.BigDecimal AV140Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to ,
                                          java.math.BigDecimal AV141Mantenimientomaquina_tmordenwwds_32_tfomrccost ,
                                          java.math.BigDecimal AV142Mantenimientomaquina_tmordenwwds_33_tfomrccost_to ,
                                          java.math.BigDecimal AV143Mantenimientomaquina_tmordenwwds_34_tfommrcost ,
                                          java.math.BigDecimal AV144Mantenimientomaquina_tmordenwwds_35_tfommrcost_to ,
                                          java.math.BigDecimal AV145Mantenimientomaquina_tmordenwwds_36_tfommccost ,
                                          java.math.BigDecimal AV146Mantenimientomaquina_tmordenwwds_37_tfommccost_to ,
                                          String AV148Mantenimientomaquina_tmordenwwds_39_tfomnot_sel ,
                                          String AV147Mantenimientomaquina_tmordenwwds_38_tfomnot ,
                                          int A9425OMCod ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9426OMMaqCod ,
                                          String A9427OMMaqDsc ,
                                          int A9428SMCod ,
                                          String A9437OMUsuCre ,
                                          java.util.Date A9436OMFchCre ,
                                          String A9433OMTxt ,
                                          java.util.Date A9438OMFchPre ,
                                          java.util.Date A9439OMFchCer ,
                                          java.math.BigDecimal A9444OMRRCosT ,
                                          java.math.BigDecimal A9443OMRCCosT ,
                                          java.math.BigDecimal A9442OMMRCosT ,
                                          java.math.BigDecimal A9441OMMCCosT ,
                                          String A9464OMNot ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV110Mantenimientomaquina_tmordenwwds_1_filterfulltext ,
                                          String A13679OMMaqCodFo ,
                                          String A13678OMDscMqPla ,
                                          String A13680OMDuracion ,
                                          java.math.BigDecimal A9440OMCosRea ,
                                          String AV122Mantenimientomaquina_tmordenwwds_13_tfommaqcodfor_sel ,
                                          String AV121Mantenimientomaquina_tmordenwwds_12_tfommaqcodfor ,
                                          String AV124Mantenimientomaquina_tmordenwwds_15_tfomdscmqpla_sel ,
                                          String AV123Mantenimientomaquina_tmordenwwds_14_tfomdscmqpla ,
                                          String AV136Mantenimientomaquina_tmordenwwds_27_tfomduracion_sel ,
                                          String AV135Mantenimientomaquina_tmordenwwds_26_tfomduracion ,
                                          java.math.BigDecimal AV137Mantenimientomaquina_tmordenwwds_28_tfomcosrea ,
                                          java.math.BigDecimal AV138Mantenimientomaquina_tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[39];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T3.PMDsc, T1.PMCod," ;
      scmdbuf += " T1.OMCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV111Mantenimientomaquina_tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV112Mantenimientomaquina_tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV113Mantenimientomaquina_tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV114Mantenimientomaquina_tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Mantenimientomaquina_tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Mantenimientomaquina_tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV117Mantenimientomaquina_tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Mantenimientomaquina_tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV119Mantenimientomaquina_tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Mantenimientomaquina_tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV125Mantenimientomaquina_tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV126Mantenimientomaquina_tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( AV127Mantenimientomaquina_tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV127Mantenimientomaquina_tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV129Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV128Mantenimientomaquina_tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Mantenimientomaquina_tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV130Mantenimientomaquina_tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV131Mantenimientomaquina_tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Mantenimientomaquina_tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Mantenimientomaquina_tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV134Mantenimientomaquina_tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Mantenimientomaquina_tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Mantenimientomaquina_tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV141Mantenimientomaquina_tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Mantenimientomaquina_tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Mantenimientomaquina_tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Mantenimientomaquina_tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Mantenimientomaquina_tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Mantenimientomaquina_tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Mantenimientomaquina_tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV147Mantenimientomaquina_tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Mantenimientomaquina_tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PMDsc" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PMDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCod" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMEst" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMEst DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCre" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCre DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMTxt" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMTxt DESC" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchPre" ;
      }
      else if ( ( AV10OrderedBy == 10 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchPre DESC" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCer" ;
      }
      else if ( ( AV10OrderedBy == 11 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCer DESC" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMNot" ;
      }
      else if ( ( AV10OrderedBy == 12 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMNot DESC" ;
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
                  return conditional_P08Q27(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08Q27", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
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
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
      }
   }

}

