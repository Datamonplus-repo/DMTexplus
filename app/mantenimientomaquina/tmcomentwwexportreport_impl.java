package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmcomentwwexportreport_impl extends GXWebReport
{
   public tmcomentwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV63Title = httpContext.getMessage( "Lista de Entradas de Repuestos", "") ;
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
         h8K20( true, 0) ;
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
         h8K20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV23TFMComCod) && (0==AV24TFMComCod_To) ) )
      {
         h8K20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Compra", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFMComCod), "ZZZZZZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV45TFMComCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Compra", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8K20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFMComCod_To_Description, "")), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFMComCod_To), "ZZZZZZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFMComExt_Sel)==0) )
      {
         h8K20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nro Externo", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFMComExt_Sel, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFMComExt)==0) )
         {
            h8K20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nro Externo", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFMComExt, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27TFMComFch)) )
      {
         h8K20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV27TFMComFch, "99/99/99"), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV29TFPrvNum) && (0==AV30TFPrvNum_To) ) )
      {
         h8K20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Proveedor", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TFPrvNum), "ZZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV47TFPrvNum_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Proveedor", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8K20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47TFPrvNum_To_Description, "")), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TFPrvNum_To), "ZZZZZ9")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV32TFPrvNom_Sel)==0) )
      {
         h8K20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nombre Proveedor", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFPrvNom_Sel, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFPrvNom)==0) )
         {
            h8K20( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Nombre Proveedor", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFPrvNom, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33TFMComSolFch)) )
      {
         h8K20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Solicitada", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV33TFMComSolFch, "99/99/99"), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV35TFMComEntFch)) )
      {
         h8K20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrada", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV35TFMComEntFch, "99/99/99"), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV39TFMComEst_Sels.fromJSonString(AV37TFMComEst_SelsJson, null);
      if ( ! ( AV39TFMComEst_Sels.size() == 0 ) )
      {
         AV52i = 1 ;
         AV78GXV1 = 1 ;
         while ( AV78GXV1 <= AV39TFMComEst_Sels.size() )
         {
            AV40TFMComEst_Sel = (String)AV39TFMComEst_Sels.elementAt(-1+AV78GXV1) ;
            if ( AV52i == 1 )
            {
               AV38TFMComEst_SelDscs = "" ;
            }
            else
            {
               AV38TFMComEst_SelDscs += ", " ;
            }
            AV50FilterTFMComEst_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV40TFMComEst_Sel), "P") == 0 )
            {
               AV50FilterTFMComEst_SelValueDescription = httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV40TFMComEst_Sel), "C") == 0 )
            {
               AV50FilterTFMComEst_SelValueDescription = httpContext.getMessage( "Confirmada", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV40TFMComEst_Sel), "E") == 0 )
            {
               AV50FilterTFMComEst_SelValueDescription = httpContext.getMessage( "Enviada", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV40TFMComEst_Sel), "X") == 0 )
            {
               AV50FilterTFMComEst_SelValueDescription = httpContext.getMessage( "Cancelada", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV40TFMComEst_Sel), "R") == 0 )
            {
               AV50FilterTFMComEst_SelValueDescription = httpContext.getMessage( "Recibida", "") ;
            }
            AV38TFMComEst_SelDscs += AV50FilterTFMComEst_SelValueDescription ;
            AV52i = (long)(AV52i+1) ;
            AV78GXV1 = (int)(AV78GXV1+1) ;
         }
         h8K20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV38TFMComEst_SelDscs, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV43TFMComOri_Sels.fromJSonString(AV41TFMComOri_SelsJson, null);
      if ( ! ( AV43TFMComOri_Sels.size() == 0 ) )
      {
         AV52i = 1 ;
         AV79GXV2 = 1 ;
         while ( AV79GXV2 <= AV43TFMComOri_Sels.size() )
         {
            AV44TFMComOri_Sel = (String)AV43TFMComOri_Sels.elementAt(-1+AV79GXV2) ;
            if ( AV52i == 1 )
            {
               AV42TFMComOri_SelDscs = "" ;
            }
            else
            {
               AV42TFMComOri_SelDscs += ", " ;
            }
            AV51FilterTFMComOri_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV44TFMComOri_Sel), "M") == 0 )
            {
               AV51FilterTFMComOri_SelValueDescription = httpContext.getMessage( "Manual", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV44TFMComOri_Sel), "A") == 0 )
            {
               AV51FilterTFMComOri_SelValueDescription = httpContext.getMessage( "Automático", "") ;
            }
            AV42TFMComOri_SelDscs += AV51FilterTFMComOri_SelValueDescription ;
            AV52i = (long)(AV52i+1) ;
            AV79GXV2 = (int)(AV79GXV2+1) ;
         }
         h8K20( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Origen", ""), 25, Gx_line+0, 159, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFMComOri_SelDscs, "")), 159, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8K20( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8K20( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Compra", ""), 30, Gx_line+10, 85, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nro Externo", ""), 89, Gx_line+10, 199, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 203, Gx_line+10, 259, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Proveedor", ""), 263, Gx_line+10, 319, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nombre Proveedor", ""), 323, Gx_line+10, 435, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Solicitada", ""), 439, Gx_line+10, 495, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Entrada", ""), 499, Gx_line+10, 555, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 559, Gx_line+10, 671, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Origen", ""), 675, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext = AV12FilterFullText ;
      AV82Mantenimientomaquina_tmcomentwwds_2_tfmcomcod = AV23TFMComCod ;
      AV83Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to = AV24TFMComCod_To ;
      AV84Mantenimientomaquina_tmcomentwwds_4_tfmcomext = AV25TFMComExt ;
      AV85Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel = AV26TFMComExt_Sel ;
      AV86Mantenimientomaquina_tmcomentwwds_6_tfmcomfch = AV27TFMComFch ;
      AV87Mantenimientomaquina_tmcomentwwds_7_tfprvnum = AV29TFPrvNum ;
      AV88Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to = AV30TFPrvNum_To ;
      AV89Mantenimientomaquina_tmcomentwwds_9_tfprvnom = AV31TFPrvNom ;
      AV90Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel = AV32TFPrvNom_Sel ;
      AV91Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch = AV33TFMComSolFch ;
      AV92Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch = AV35TFMComEntFch ;
      AV93Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels = AV39TFMComEst_Sels ;
      AV94Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels = AV43TFMComOri_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11049MComEst ,
                                           AV93Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels ,
                                           A11050MComOri ,
                                           AV94Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels ,
                                           Long.valueOf(AV82Mantenimientomaquina_tmcomentwwds_2_tfmcomcod) ,
                                           Long.valueOf(AV83Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to) ,
                                           AV85Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel ,
                                           AV84Mantenimientomaquina_tmcomentwwds_4_tfmcomext ,
                                           AV86Mantenimientomaquina_tmcomentwwds_6_tfmcomfch ,
                                           Integer.valueOf(AV87Mantenimientomaquina_tmcomentwwds_7_tfprvnum) ,
                                           Integer.valueOf(AV88Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to) ,
                                           AV90Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel ,
                                           AV89Mantenimientomaquina_tmcomentwwds_9_tfprvnom ,
                                           AV91Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch ,
                                           AV92Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch ,
                                           Integer.valueOf(AV93Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels.size()) ,
                                           Integer.valueOf(AV94Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels.size()) ,
                                           Long.valueOf(A11055MComCod) ,
                                           A11045MComExt ,
                                           A11046MComFch ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A11047MComSolFch ,
                                           A11048MComEntFch ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV84Mantenimientomaquina_tmcomentwwds_4_tfmcomext = GXutil.padr( GXutil.rtrim( AV84Mantenimientomaquina_tmcomentwwds_4_tfmcomext), 20, "%") ;
      lV89Mantenimientomaquina_tmcomentwwds_9_tfprvnom = GXutil.padr( GXutil.rtrim( AV89Mantenimientomaquina_tmcomentwwds_9_tfprvnom), 30, "%") ;
      /* Using cursor P08K22 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV82Mantenimientomaquina_tmcomentwwds_2_tfmcomcod), Long.valueOf(AV83Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to), lV84Mantenimientomaquina_tmcomentwwds_4_tfmcomext, AV85Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel, AV86Mantenimientomaquina_tmcomentwwds_6_tfmcomfch, Integer.valueOf(AV87Mantenimientomaquina_tmcomentwwds_7_tfprvnum), Integer.valueOf(AV88Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to), lV89Mantenimientomaquina_tmcomentwwds_9_tfprvnom, AV90Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel, AV91Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch, AV92Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08K22_A396EmprCod[0] ;
         A11048MComEntFch = P08K22_A11048MComEntFch[0] ;
         A11047MComSolFch = P08K22_A11047MComSolFch[0] ;
         A794PrvNom = P08K22_A794PrvNom[0] ;
         n794PrvNom = P08K22_n794PrvNom[0] ;
         A795PrvNum = P08K22_A795PrvNum[0] ;
         n795PrvNum = P08K22_n795PrvNum[0] ;
         A11046MComFch = P08K22_A11046MComFch[0] ;
         A11045MComExt = P08K22_A11045MComExt[0] ;
         A11055MComCod = P08K22_A11055MComCod[0] ;
         A11050MComOri = P08K22_A11050MComOri[0] ;
         A11049MComEst = P08K22_A11049MComEst[0] ;
         A794PrvNom = P08K22_A794PrvNom[0] ;
         n794PrvNom = P08K22_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A11055MComCod, 10, 0) , GXutil.padr( "%" + AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11045MComExt) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "confirmada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "enviada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, "X") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "recibida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11049MComEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "manual", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "automático", ""), "") , GXutil.padr( "%" + GXutil.lower( AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11050MComOri, httpContext.getMessage( "A", "")) == 0 ) ) ) )
         {
            AV13MComEstDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "P") == 0 )
            {
               AV13MComEstDescription = httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "C") == 0 )
            {
               AV13MComEstDescription = httpContext.getMessage( "Confirmada", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "E") == 0 )
            {
               AV13MComEstDescription = httpContext.getMessage( "Enviada", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "X") == 0 )
            {
               AV13MComEstDescription = httpContext.getMessage( "Cancelada", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11049MComEst), "R") == 0 )
            {
               AV13MComEstDescription = httpContext.getMessage( "Recibida", "") ;
            }
            AV14MComOriDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A11050MComOri), "M") == 0 )
            {
               AV14MComOriDescription = httpContext.getMessage( "Manual", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A11050MComOri), "A") == 0 )
            {
               AV14MComOriDescription = httpContext.getMessage( "Automático", "") ;
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
            h8K20( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11055MComCod), "ZZZZZZZZZ9")), 30, Gx_line+10, 85, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A11045MComExt, "")), 89, Gx_line+10, 199, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A11046MComFch, "99/99/99"), 203, Gx_line+10, 259, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9")), 263, Gx_line+10, 319, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A794PrvNom, "")), 323, Gx_line+10, 435, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A11047MComSolFch, "99/99/99"), 439, Gx_line+10, 495, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A11048MComEntFch, "99/99/99"), 499, Gx_line+10, 555, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13MComEstDescription, "")), 559, Gx_line+10, 671, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14MComOriDescription, "")), 675, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV15Session.getValue("MantenimientoMaquina.TMComEntWWGridState"), "") == 0 )
      {
         AV17GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMComEntWWGridState"), null, null);
      }
      else
      {
         AV17GridState.fromxml(AV15Session.getValue("MantenimientoMaquina.TMComEntWWGridState"), null, null);
      }
      AV10OrderedBy = AV17GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV17GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV95GXV3 = 1 ;
      while ( AV95GXV3 <= AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV18GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV17GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV95GXV3));
         if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMCOD") == 0 )
         {
            AV23TFMComCod = GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV24TFMComCod_To = GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMEXT") == 0 )
         {
            AV25TFMComExt = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMEXT_SEL") == 0 )
         {
            AV26TFMComExt_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMFCH") == 0 )
         {
            AV27TFMComFch = localUtil.ctod( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV29TFPrvNum = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV30TFPrvNum_To = (int)(GXutil.lval( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV31TFPrvNom = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV32TFPrvNom_Sel = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLFCH") == 0 )
         {
            AV33TFMComSolFch = localUtil.ctod( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTFCH") == 0 )
         {
            AV35TFMComEntFch = localUtil.ctod( AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMEST_SEL") == 0 )
         {
            AV37TFMComEst_SelsJson = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV39TFMComEst_Sels.fromJSonString(AV37TFMComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMORI_SEL") == 0 )
         {
            AV41TFMComOri_SelsJson = AV18GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV43TFMComOri_Sels.fromJSonString(AV41TFMComOri_SelsJson, null);
         }
         AV95GXV3 = (int)(AV95GXV3+1) ;
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

   public void h8K20( boolean bFoot ,
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
               AV61PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV58DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV61PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV63Title = AV75Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV63Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV63Title = "" ;
      AV12FilterFullText = "" ;
      AV45TFMComCod_To_Description = "" ;
      AV26TFMComExt_Sel = "" ;
      AV25TFMComExt = "" ;
      AV27TFMComFch = GXutil.nullDate() ;
      AV47TFPrvNum_To_Description = "" ;
      AV32TFPrvNom_Sel = "" ;
      AV31TFPrvNom = "" ;
      AV33TFMComSolFch = GXutil.nullDate() ;
      AV35TFMComEntFch = GXutil.nullDate() ;
      AV39TFMComEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV37TFMComEst_SelsJson = "" ;
      AV40TFMComEst_Sel = "" ;
      AV38TFMComEst_SelDscs = "" ;
      AV50FilterTFMComEst_SelValueDescription = "" ;
      AV43TFMComOri_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV41TFMComOri_SelsJson = "" ;
      AV44TFMComOri_Sel = "" ;
      AV42TFMComOri_SelDscs = "" ;
      AV51FilterTFMComOri_SelValueDescription = "" ;
      A11049MComEst = "" ;
      A11050MComOri = "" ;
      A11045MComExt = "" ;
      A11046MComFch = GXutil.nullDate() ;
      A794PrvNom = "" ;
      A11047MComSolFch = GXutil.nullDate() ;
      A11048MComEntFch = GXutil.nullDate() ;
      AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext = "" ;
      AV84Mantenimientomaquina_tmcomentwwds_4_tfmcomext = "" ;
      AV85Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel = "" ;
      AV86Mantenimientomaquina_tmcomentwwds_6_tfmcomfch = GXutil.nullDate() ;
      AV89Mantenimientomaquina_tmcomentwwds_9_tfprvnom = "" ;
      AV90Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel = "" ;
      AV91Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch = GXutil.nullDate() ;
      AV92Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch = GXutil.nullDate() ;
      AV93Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV94Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV84Mantenimientomaquina_tmcomentwwds_4_tfmcomext = "" ;
      lV89Mantenimientomaquina_tmcomentwwds_9_tfprvnom = "" ;
      P08K22_A396EmprCod = new String[] {""} ;
      P08K22_A11048MComEntFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08K22_A11047MComSolFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08K22_A794PrvNom = new String[] {""} ;
      P08K22_n794PrvNom = new boolean[] {false} ;
      P08K22_A795PrvNum = new int[1] ;
      P08K22_n795PrvNum = new boolean[] {false} ;
      P08K22_A11046MComFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08K22_A11045MComExt = new String[] {""} ;
      P08K22_A11055MComCod = new long[1] ;
      P08K22_A11050MComOri = new String[] {""} ;
      P08K22_A11049MComEst = new String[] {""} ;
      A396EmprCod = "" ;
      AV13MComEstDescription = "" ;
      AV14MComOriDescription = "" ;
      AV15Session = httpContext.getWebSession();
      AV17GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV18GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV61PageInfo = "" ;
      AV58DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV75Pgmdesc = "" ;
      AV56AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmcomentwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08K22_A396EmprCod, P08K22_A11048MComEntFch, P08K22_A11047MComSolFch, P08K22_A794PrvNom, P08K22_n794PrvNom, P08K22_A795PrvNum, P08K22_n795PrvNum, P08K22_A11046MComFch, P08K22_A11045MComExt, P08K22_A11055MComCod,
            P08K22_A11050MComOri, P08K22_A11049MComEst
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV75Pgmdesc = httpContext.getMessage( "TMCom Ent WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV75Pgmdesc = httpContext.getMessage( "TMCom Ent WWExport Report", "") ;
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
   private int AV29TFPrvNum ;
   private int AV30TFPrvNum_To ;
   private int AV78GXV1 ;
   private int AV79GXV2 ;
   private int A795PrvNum ;
   private int AV87Mantenimientomaquina_tmcomentwwds_7_tfprvnum ;
   private int AV88Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to ;
   private int AV93Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels_size ;
   private int AV94Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels_size ;
   private int AV95GXV3 ;
   private long AV23TFMComCod ;
   private long AV24TFMComCod_To ;
   private long AV52i ;
   private long A11055MComCod ;
   private long AV82Mantenimientomaquina_tmcomentwwds_2_tfmcomcod ;
   private long AV83Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV26TFMComExt_Sel ;
   private String AV25TFMComExt ;
   private String AV32TFPrvNom_Sel ;
   private String AV31TFPrvNom ;
   private String AV40TFMComEst_Sel ;
   private String AV44TFMComOri_Sel ;
   private String A11049MComEst ;
   private String A11050MComOri ;
   private String A11045MComExt ;
   private String A794PrvNom ;
   private String AV84Mantenimientomaquina_tmcomentwwds_4_tfmcomext ;
   private String AV85Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel ;
   private String AV89Mantenimientomaquina_tmcomentwwds_9_tfprvnom ;
   private String AV90Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel ;
   private String scmdbuf ;
   private String lV84Mantenimientomaquina_tmcomentwwds_4_tfmcomext ;
   private String lV89Mantenimientomaquina_tmcomentwwds_9_tfprvnom ;
   private String A396EmprCod ;
   private String AV75Pgmdesc ;
   private java.util.Date AV27TFMComFch ;
   private java.util.Date AV33TFMComSolFch ;
   private java.util.Date AV35TFMComEntFch ;
   private java.util.Date A11046MComFch ;
   private java.util.Date A11047MComSolFch ;
   private java.util.Date A11048MComEntFch ;
   private java.util.Date AV86Mantenimientomaquina_tmcomentwwds_6_tfmcomfch ;
   private java.util.Date AV91Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch ;
   private java.util.Date AV92Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n794PrvNom ;
   private boolean n795PrvNum ;
   private String AV37TFMComEst_SelsJson ;
   private String AV41TFMComOri_SelsJson ;
   private String AV63Title ;
   private String AV12FilterFullText ;
   private String AV45TFMComCod_To_Description ;
   private String AV47TFPrvNum_To_Description ;
   private String AV38TFMComEst_SelDscs ;
   private String AV50FilterTFMComEst_SelValueDescription ;
   private String AV42TFMComOri_SelDscs ;
   private String AV51FilterTFMComOri_SelValueDescription ;
   private String AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext ;
   private String AV13MComEstDescription ;
   private String AV14MComOriDescription ;
   private String AV61PageInfo ;
   private String AV58DateInfo ;
   private String AV56AppName ;
   private com.genexus.webpanels.WebSession AV15Session ;
   private IDataStoreProvider pr_default ;
   private String[] P08K22_A396EmprCod ;
   private java.util.Date[] P08K22_A11048MComEntFch ;
   private java.util.Date[] P08K22_A11047MComSolFch ;
   private String[] P08K22_A794PrvNom ;
   private boolean[] P08K22_n794PrvNom ;
   private int[] P08K22_A795PrvNum ;
   private boolean[] P08K22_n795PrvNum ;
   private java.util.Date[] P08K22_A11046MComFch ;
   private String[] P08K22_A11045MComExt ;
   private long[] P08K22_A11055MComCod ;
   private String[] P08K22_A11050MComOri ;
   private String[] P08K22_A11049MComEst ;
   private GXSimpleCollection<String> AV39TFMComEst_Sels ;
   private GXSimpleCollection<String> AV43TFMComOri_Sels ;
   private GXSimpleCollection<String> AV93Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels ;
   private GXSimpleCollection<String> AV94Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV17GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV18GridStateFilterValue ;
}

final  class tmcomentwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08K22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11049MComEst ,
                                          GXSimpleCollection<String> AV93Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels ,
                                          String A11050MComOri ,
                                          GXSimpleCollection<String> AV94Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels ,
                                          long AV82Mantenimientomaquina_tmcomentwwds_2_tfmcomcod ,
                                          long AV83Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to ,
                                          String AV85Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel ,
                                          String AV84Mantenimientomaquina_tmcomentwwds_4_tfmcomext ,
                                          java.util.Date AV86Mantenimientomaquina_tmcomentwwds_6_tfmcomfch ,
                                          int AV87Mantenimientomaquina_tmcomentwwds_7_tfprvnum ,
                                          int AV88Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to ,
                                          String AV90Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel ,
                                          String AV89Mantenimientomaquina_tmcomentwwds_9_tfprvnom ,
                                          java.util.Date AV91Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch ,
                                          java.util.Date AV92Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch ,
                                          int AV93Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels_size ,
                                          int AV94Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels_size ,
                                          long A11055MComCod ,
                                          String A11045MComExt ,
                                          java.util.Date A11046MComFch ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.util.Date A11047MComSolFch ,
                                          java.util.Date A11048MComEntFch ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV81Mantenimientomaquina_tmcomentwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[11];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MComEntFch, T1.MComSolFch, T2.PrvNom, T1.PrvNum, T1.MComFch, T1.MComExt, T1.MComCod, T1.MComOri, T1.MComEst FROM (TXPMRepCo T1 LEFT JOIN TXPPRVGEN" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum)" ;
      if ( ! (0==AV82Mantenimientomaquina_tmcomentwwds_2_tfmcomcod) )
      {
         addWhere(sWhereString, "(T1.MComCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV83Mantenimientomaquina_tmcomentwwds_3_tfmcomcod_to) )
      {
         addWhere(sWhereString, "(T1.MComCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel)==0) && ( ! (GXutil.strcmp("", AV84Mantenimientomaquina_tmcomentwwds_4_tfmcomext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MComExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Mantenimientomaquina_tmcomentwwds_5_tfmcomext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MComExt = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Mantenimientomaquina_tmcomentwwds_6_tfmcomfch)) )
      {
         addWhere(sWhereString, "(T1.MComFch >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV87Mantenimientomaquina_tmcomentwwds_7_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV88Mantenimientomaquina_tmcomentwwds_8_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientomaquina_tmcomentwwds_9_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientomaquina_tmcomentwwds_10_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Mantenimientomaquina_tmcomentwwds_11_tfmcomsolfch)) )
      {
         addWhere(sWhereString, "(T1.MComSolFch >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Mantenimientomaquina_tmcomentwwds_12_tfmcomentfch)) )
      {
         addWhere(sWhereString, "(T1.MComEntFch >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( AV93Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Mantenimientomaquina_tmcomentwwds_13_tfmcomest_sels, "T1.MComEst IN (", ")")+")");
      }
      if ( AV94Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV94Mantenimientomaquina_tmcomentwwds_14_tfmcomori_sels, "T1.MComOri IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComExt" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComExt DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComCod" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComFch" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComFch DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNom" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComSolFch" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComSolFch DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComEntFch" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComEntFch DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComEst" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComEst DESC" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MComOri" ;
      }
      else if ( ( AV10OrderedBy == 9 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MComOri DESC" ;
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
                  return conditional_P08K22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).longValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08K22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 20);
               ((long[]) buf[9])[0] = rslt.getLong(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
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
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[12]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[20]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[21]);
               }
               return;
      }
   }

}

