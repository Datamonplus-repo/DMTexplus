package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajosexternosenviowwexportreport_impl extends GXWebReport
{
   public trabajosexternosenviowwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV58Title = httpContext.getMessage( "Lista de Trabajos Externos (Envio)", "") ;
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
         h9160( true, 0) ;
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
         h9160( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV17TFSalExtAlb) && (0==AV18TFSalExtAlb_To) ) )
      {
         h9160( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Nº Documento", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17TFSalExtAlb), "ZZZZZZZ9")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFSalExtAlb_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Nº Documento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9160( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFSalExtAlb_To_Description, "")), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV18TFSalExtAlb_To), "ZZZZZZZ9")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV20TFManNom_Sel)==0) )
      {
         h9160( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Manufacturador", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20TFManNom_Sel, "")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV19TFManNom)==0) )
         {
            h9160( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Manufacturador", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19TFManNom, "")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (0==AV21TFManCod) && (0==AV22TFManCod_To) ) )
      {
         h9160( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Codigo Manufacturador", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21TFManCod), "ZZZ9")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV42TFManCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Codigo Manufacturador", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9160( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFManCod_To_Description, "")), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFManCod_To), "ZZZ9")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV23TFTrnCod) && (0==AV24TFTrnCod_To) ) )
      {
         h9160( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cod Transp", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFTrnCod), "ZZZ9")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFTrnCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cod Transp", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h9160( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFTrnCod_To_Description, "")), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFTrnCod_To), "ZZZ9")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV26TFTrnNom_Sel)==0) )
      {
         h9160( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFTrnNom_Sel, "")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV25TFTrnNom)==0) )
         {
            h9160( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV25TFTrnNom, "")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV27TFSalExtFec)) )
      {
         h9160( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV27TFSalExtFec, "99/99/99"), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV30TFSalExtHor_Sel)==0) )
      {
         h9160( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFSalExtHor_Sel, "")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV29TFSalExtHor)==0) )
         {
            h9160( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV29TFSalExtHor, "")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV64TFSalSts_Sel)==0) )
      {
         h9160( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV64TFSalSts_Sel, "")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV70TFSalSts)==0) )
         {
            h9160( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 186, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV70TFSalSts, "")), 186, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h9160( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h9160( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Nº Documento", ""), 30, Gx_line+10, 102, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Manufacturador", ""), 106, Gx_line+10, 252, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Codigo Manufacturador", ""), 256, Gx_line+10, 329, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cod Transp", ""), 333, Gx_line+10, 406, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Transportista", ""), 410, Gx_line+10, 556, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 560, Gx_line+10, 633, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Hora", ""), 637, Gx_line+10, 710, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 714, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV77Trabajosexternosenviowwds_1_filterfulltext = AV12FilterFullText ;
      AV78Trabajosexternosenviowwds_2_tfsalextalb = AV17TFSalExtAlb ;
      AV79Trabajosexternosenviowwds_3_tfsalextalb_to = AV18TFSalExtAlb_To ;
      AV80Trabajosexternosenviowwds_4_tfmannom = AV19TFManNom ;
      AV81Trabajosexternosenviowwds_5_tfmannom_sel = AV20TFManNom_Sel ;
      AV82Trabajosexternosenviowwds_6_tfmancod = AV21TFManCod ;
      AV83Trabajosexternosenviowwds_7_tfmancod_to = AV22TFManCod_To ;
      AV84Trabajosexternosenviowwds_8_tftrncod = AV23TFTrnCod ;
      AV85Trabajosexternosenviowwds_9_tftrncod_to = AV24TFTrnCod_To ;
      AV86Trabajosexternosenviowwds_10_tftrnnom = AV25TFTrnNom ;
      AV87Trabajosexternosenviowwds_11_tftrnnom_sel = AV26TFTrnNom_Sel ;
      AV88Trabajosexternosenviowwds_12_tfsalextfec = AV27TFSalExtFec ;
      AV89Trabajosexternosenviowwds_13_tfsalexthor = AV29TFSalExtHor ;
      AV90Trabajosexternosenviowwds_14_tfsalexthor_sel = AV30TFSalExtHor_Sel ;
      AV91Trabajosexternosenviowwds_15_tfsalsts = AV70TFSalSts ;
      AV92Trabajosexternosenviowwds_16_tfsalsts_sel = AV64TFSalSts_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV77Trabajosexternosenviowwds_1_filterfulltext ,
                                           Integer.valueOf(AV78Trabajosexternosenviowwds_2_tfsalextalb) ,
                                           Integer.valueOf(AV79Trabajosexternosenviowwds_3_tfsalextalb_to) ,
                                           AV81Trabajosexternosenviowwds_5_tfmannom_sel ,
                                           AV80Trabajosexternosenviowwds_4_tfmannom ,
                                           Short.valueOf(AV82Trabajosexternosenviowwds_6_tfmancod) ,
                                           Short.valueOf(AV83Trabajosexternosenviowwds_7_tfmancod_to) ,
                                           Short.valueOf(AV84Trabajosexternosenviowwds_8_tftrncod) ,
                                           Short.valueOf(AV85Trabajosexternosenviowwds_9_tftrncod_to) ,
                                           AV87Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                           AV86Trabajosexternosenviowwds_10_tftrnnom ,
                                           AV88Trabajosexternosenviowwds_12_tfsalextfec ,
                                           AV90Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                           AV89Trabajosexternosenviowwds_13_tfsalexthor ,
                                           AV92Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                           AV91Trabajosexternosenviowwds_15_tfsalsts ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           A2249ManNom ,
                                           Short.valueOf(A2248ManCod) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A6396SalExtHor ,
                                           A10080SalSts ,
                                           A2256SalExtFec ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV77Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV77Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV77Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV77Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV77Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV77Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV77Trabajosexternosenviowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV77Trabajosexternosenviowwds_1_filterfulltext), "%", "") ;
      lV80Trabajosexternosenviowwds_4_tfmannom = GXutil.padr( GXutil.rtrim( AV80Trabajosexternosenviowwds_4_tfmannom), 30, "%") ;
      lV86Trabajosexternosenviowwds_10_tftrnnom = GXutil.padr( GXutil.rtrim( AV86Trabajosexternosenviowwds_10_tftrnnom), 30, "%") ;
      lV89Trabajosexternosenviowwds_13_tfsalexthor = GXutil.padr( GXutil.rtrim( AV89Trabajosexternosenviowwds_13_tfsalexthor), 8, "%") ;
      lV91Trabajosexternosenviowwds_15_tfsalsts = GXutil.padr( GXutil.rtrim( AV91Trabajosexternosenviowwds_15_tfsalsts), 1, "%") ;
      /* Using cursor P09162 */
      pr_default.execute(0, new Object[] {lV77Trabajosexternosenviowwds_1_filterfulltext, lV77Trabajosexternosenviowwds_1_filterfulltext, lV77Trabajosexternosenviowwds_1_filterfulltext, lV77Trabajosexternosenviowwds_1_filterfulltext, lV77Trabajosexternosenviowwds_1_filterfulltext, lV77Trabajosexternosenviowwds_1_filterfulltext, lV77Trabajosexternosenviowwds_1_filterfulltext, Integer.valueOf(AV78Trabajosexternosenviowwds_2_tfsalextalb), Integer.valueOf(AV79Trabajosexternosenviowwds_3_tfsalextalb_to), lV80Trabajosexternosenviowwds_4_tfmannom, AV81Trabajosexternosenviowwds_5_tfmannom_sel, Short.valueOf(AV82Trabajosexternosenviowwds_6_tfmancod), Short.valueOf(AV83Trabajosexternosenviowwds_7_tfmancod_to), Short.valueOf(AV84Trabajosexternosenviowwds_8_tftrncod), Short.valueOf(AV85Trabajosexternosenviowwds_9_tftrncod_to), lV86Trabajosexternosenviowwds_10_tftrnnom, AV87Trabajosexternosenviowwds_11_tftrnnom_sel, AV88Trabajosexternosenviowwds_12_tfsalextfec, lV89Trabajosexternosenviowwds_13_tfsalexthor, AV90Trabajosexternosenviowwds_14_tfsalexthor_sel, lV91Trabajosexternosenviowwds_15_tfsalsts, AV92Trabajosexternosenviowwds_16_tfsalsts_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09162_A396EmprCod[0] ;
         A10080SalSts = P09162_A10080SalSts[0] ;
         A6396SalExtHor = P09162_A6396SalExtHor[0] ;
         A2256SalExtFec = P09162_A2256SalExtFec[0] ;
         A841TrnNom = P09162_A841TrnNom[0] ;
         n841TrnNom = P09162_n841TrnNom[0] ;
         A840TrnCod = P09162_A840TrnCod[0] ;
         n840TrnCod = P09162_n840TrnCod[0] ;
         A2248ManCod = P09162_A2248ManCod[0] ;
         A2249ManNom = P09162_A2249ManNom[0] ;
         n2249ManNom = P09162_n2249ManNom[0] ;
         A2253SalExtAlb = P09162_A2253SalExtAlb[0] ;
         A841TrnNom = P09162_A841TrnNom[0] ;
         n841TrnNom = P09162_n841TrnNom[0] ;
         A2249ManNom = P09162_A2249ManNom[0] ;
         n2249ManNom = P09162_n2249ManNom[0] ;
         /* Execute user subroutine: 'BEFOREPRINTLINE' */
         S144 ();
         if ( returnInSub )
         {
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
         h9160( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")), 30, Gx_line+10, 102, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A2249ManNom, "")), 106, Gx_line+10, 252, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")), 256, Gx_line+10, 329, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), 333, Gx_line+10, 406, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A841TrnNom, "")), 410, Gx_line+10, 556, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A2256SalExtFec, "99/99/99"), 560, Gx_line+10, 633, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A6396SalExtHor, "")), 637, Gx_line+10, 710, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10080SalSts, "")), 714, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue("TrabajosExternosEnvioWWGridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TrabajosExternosEnvioWWGridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV13Session.getValue("TrabajosExternosEnvioWWGridState"), null, null);
      }
      AV10OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV93GXV1 = 1 ;
      while ( AV93GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV93GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTALB") == 0 )
         {
            AV17TFSalExtAlb = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV18TFSalExtAlb_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM") == 0 )
         {
            AV19TFManNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANNOM_SEL") == 0 )
         {
            AV20TFManNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMANCOD") == 0 )
         {
            AV21TFManCod = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV22TFManCod_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV23TFTrnCod = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV24TFTrnCod_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV25TFTrnNom = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV26TFTrnNom_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTFEC") == 0 )
         {
            AV27TFSalExtFec = localUtil.ctod( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTHOR") == 0 )
         {
            AV29TFSalExtHor = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTHOR_SEL") == 0 )
         {
            AV30TFSalExtHor_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALSTS") == 0 )
         {
            AV70TFSalSts = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALSTS_SEL") == 0 )
         {
            AV64TFSalSts_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV93GXV1 = (int)(AV93GXV1+1) ;
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

   public void h9160( boolean bFoot ,
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
               AV56PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV53DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV58Title = AV73Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV51AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV58Title = "" ;
      AV12FilterFullText = "" ;
      AV41TFSalExtAlb_To_Description = "" ;
      AV20TFManNom_Sel = "" ;
      AV19TFManNom = "" ;
      AV42TFManCod_To_Description = "" ;
      AV43TFTrnCod_To_Description = "" ;
      AV26TFTrnNom_Sel = "" ;
      AV25TFTrnNom = "" ;
      AV27TFSalExtFec = GXutil.nullDate() ;
      AV30TFSalExtHor_Sel = "" ;
      AV29TFSalExtHor = "" ;
      AV64TFSalSts_Sel = "" ;
      AV70TFSalSts = "" ;
      A2249ManNom = "" ;
      A841TrnNom = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A6396SalExtHor = "" ;
      A10080SalSts = "" ;
      AV77Trabajosexternosenviowwds_1_filterfulltext = "" ;
      AV80Trabajosexternosenviowwds_4_tfmannom = "" ;
      AV81Trabajosexternosenviowwds_5_tfmannom_sel = "" ;
      AV86Trabajosexternosenviowwds_10_tftrnnom = "" ;
      AV87Trabajosexternosenviowwds_11_tftrnnom_sel = "" ;
      AV88Trabajosexternosenviowwds_12_tfsalextfec = GXutil.nullDate() ;
      AV89Trabajosexternosenviowwds_13_tfsalexthor = "" ;
      AV90Trabajosexternosenviowwds_14_tfsalexthor_sel = "" ;
      AV91Trabajosexternosenviowwds_15_tfsalsts = "" ;
      AV92Trabajosexternosenviowwds_16_tfsalsts_sel = "" ;
      scmdbuf = "" ;
      lV77Trabajosexternosenviowwds_1_filterfulltext = "" ;
      lV80Trabajosexternosenviowwds_4_tfmannom = "" ;
      lV86Trabajosexternosenviowwds_10_tftrnnom = "" ;
      lV89Trabajosexternosenviowwds_13_tfsalexthor = "" ;
      lV91Trabajosexternosenviowwds_15_tfsalsts = "" ;
      P09162_A396EmprCod = new String[] {""} ;
      P09162_A10080SalSts = new String[] {""} ;
      P09162_A6396SalExtHor = new String[] {""} ;
      P09162_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09162_A841TrnNom = new String[] {""} ;
      P09162_n841TrnNom = new boolean[] {false} ;
      P09162_A840TrnCod = new short[1] ;
      P09162_n840TrnCod = new boolean[] {false} ;
      P09162_A2248ManCod = new short[1] ;
      P09162_A2249ManNom = new String[] {""} ;
      P09162_n2249ManNom = new boolean[] {false} ;
      P09162_A2253SalExtAlb = new int[1] ;
      A396EmprCod = "" ;
      AV13Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV56PageInfo = "" ;
      AV53DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV73Pgmdesc = "" ;
      AV51AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternosenviowwexportreport__default(),
         new Object[] {
             new Object[] {
            P09162_A396EmprCod, P09162_A10080SalSts, P09162_A6396SalExtHor, P09162_A2256SalExtFec, P09162_A841TrnNom, P09162_n841TrnNom, P09162_A840TrnCod, P09162_n840TrnCod, P09162_A2248ManCod, P09162_A2249ManNom,
            P09162_n2249ManNom, P09162_A2253SalExtAlb
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV73Pgmdesc = httpContext.getMessage( "Trabajos Externos Envio WWExport Report", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV73Pgmdesc = httpContext.getMessage( "Trabajos Externos Envio WWExport Report", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV21TFManCod ;
   private short AV22TFManCod_To ;
   private short AV23TFTrnCod ;
   private short AV24TFTrnCod_To ;
   private short A2248ManCod ;
   private short A840TrnCod ;
   private short AV82Trabajosexternosenviowwds_6_tfmancod ;
   private short AV83Trabajosexternosenviowwds_7_tfmancod_to ;
   private short AV84Trabajosexternosenviowwds_8_tftrncod ;
   private short AV85Trabajosexternosenviowwds_9_tftrncod_to ;
   private short AV10OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV17TFSalExtAlb ;
   private int AV18TFSalExtAlb_To ;
   private int A2253SalExtAlb ;
   private int AV78Trabajosexternosenviowwds_2_tfsalextalb ;
   private int AV79Trabajosexternosenviowwds_3_tfsalextalb_to ;
   private int AV93GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV20TFManNom_Sel ;
   private String AV19TFManNom ;
   private String AV26TFTrnNom_Sel ;
   private String AV25TFTrnNom ;
   private String AV30TFSalExtHor_Sel ;
   private String AV29TFSalExtHor ;
   private String AV64TFSalSts_Sel ;
   private String AV70TFSalSts ;
   private String A2249ManNom ;
   private String A841TrnNom ;
   private String A6396SalExtHor ;
   private String A10080SalSts ;
   private String AV80Trabajosexternosenviowwds_4_tfmannom ;
   private String AV81Trabajosexternosenviowwds_5_tfmannom_sel ;
   private String AV86Trabajosexternosenviowwds_10_tftrnnom ;
   private String AV87Trabajosexternosenviowwds_11_tftrnnom_sel ;
   private String AV89Trabajosexternosenviowwds_13_tfsalexthor ;
   private String AV90Trabajosexternosenviowwds_14_tfsalexthor_sel ;
   private String AV91Trabajosexternosenviowwds_15_tfsalsts ;
   private String AV92Trabajosexternosenviowwds_16_tfsalsts_sel ;
   private String scmdbuf ;
   private String lV80Trabajosexternosenviowwds_4_tfmannom ;
   private String lV86Trabajosexternosenviowwds_10_tftrnnom ;
   private String lV89Trabajosexternosenviowwds_13_tfsalexthor ;
   private String lV91Trabajosexternosenviowwds_15_tfsalsts ;
   private String A396EmprCod ;
   private String AV73Pgmdesc ;
   private java.util.Date AV27TFSalExtFec ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date AV88Trabajosexternosenviowwds_12_tfsalextfec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n2249ManNom ;
   private String AV58Title ;
   private String AV12FilterFullText ;
   private String AV41TFSalExtAlb_To_Description ;
   private String AV42TFManCod_To_Description ;
   private String AV43TFTrnCod_To_Description ;
   private String AV77Trabajosexternosenviowwds_1_filterfulltext ;
   private String lV77Trabajosexternosenviowwds_1_filterfulltext ;
   private String AV56PageInfo ;
   private String AV53DateInfo ;
   private String AV51AppName ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private IDataStoreProvider pr_default ;
   private String[] P09162_A396EmprCod ;
   private String[] P09162_A10080SalSts ;
   private String[] P09162_A6396SalExtHor ;
   private java.util.Date[] P09162_A2256SalExtFec ;
   private String[] P09162_A841TrnNom ;
   private boolean[] P09162_n841TrnNom ;
   private short[] P09162_A840TrnCod ;
   private boolean[] P09162_n840TrnCod ;
   private short[] P09162_A2248ManCod ;
   private String[] P09162_A2249ManNom ;
   private boolean[] P09162_n2249ManNom ;
   private int[] P09162_A2253SalExtAlb ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
}

final  class trabajosexternosenviowwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09162( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Trabajosexternosenviowwds_1_filterfulltext ,
                                          int AV78Trabajosexternosenviowwds_2_tfsalextalb ,
                                          int AV79Trabajosexternosenviowwds_3_tfsalextalb_to ,
                                          String AV81Trabajosexternosenviowwds_5_tfmannom_sel ,
                                          String AV80Trabajosexternosenviowwds_4_tfmannom ,
                                          short AV82Trabajosexternosenviowwds_6_tfmancod ,
                                          short AV83Trabajosexternosenviowwds_7_tfmancod_to ,
                                          short AV84Trabajosexternosenviowwds_8_tftrncod ,
                                          short AV85Trabajosexternosenviowwds_9_tftrncod_to ,
                                          String AV87Trabajosexternosenviowwds_11_tftrnnom_sel ,
                                          String AV86Trabajosexternosenviowwds_10_tftrnnom ,
                                          java.util.Date AV88Trabajosexternosenviowwds_12_tfsalextfec ,
                                          String AV90Trabajosexternosenviowwds_14_tfsalexthor_sel ,
                                          String AV89Trabajosexternosenviowwds_13_tfsalexthor ,
                                          String AV92Trabajosexternosenviowwds_16_tfsalsts_sel ,
                                          String AV91Trabajosexternosenviowwds_15_tfsalsts ,
                                          int A2253SalExtAlb ,
                                          String A2249ManNom ,
                                          short A2248ManCod ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A6396SalExtHor ,
                                          String A10080SalSts ,
                                          java.util.Date A2256SalExtFec ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.SalSts, T1.SalExtHor, T1.SalExtFec, T2.TrnNom, T1.TrnCod, T1.ManCod, T3.ManNom, T1.SalExtAlb FROM ((TXPCEXTSA T1 LEFT JOIN TXPTRANSP T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPMANUFA T3 ON T3.EmprCod = T1.EmprCod AND T3.ManCod = T1.ManCod)" ;
      if ( ! (GXutil.strcmp("", AV77Trabajosexternosenviowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.SalExtAlb,'99999990'), 2) like '%' || ?) or ( UPPER(T3.ManNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ManCod,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(T2.TrnNom) like '%' || UPPER(?)) or ( UPPER(T1.SalExtHor) like '%' || UPPER(?)) or ( UPPER(T1.SalSts) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV78Trabajosexternosenviowwds_2_tfsalextalb) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV79Trabajosexternosenviowwds_3_tfsalextalb_to) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Trabajosexternosenviowwds_5_tfmannom_sel)==0) && ( ! (GXutil.strcmp("", AV80Trabajosexternosenviowwds_4_tfmannom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ManNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Trabajosexternosenviowwds_5_tfmannom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ManNom = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV82Trabajosexternosenviowwds_6_tfmancod) )
      {
         addWhere(sWhereString, "(T1.ManCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV83Trabajosexternosenviowwds_7_tfmancod_to) )
      {
         addWhere(sWhereString, "(T1.ManCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV84Trabajosexternosenviowwds_8_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV85Trabajosexternosenviowwds_9_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Trabajosexternosenviowwds_11_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Trabajosexternosenviowwds_10_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Trabajosexternosenviowwds_11_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Trabajosexternosenviowwds_12_tfsalextfec)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) && ( ! (GXutil.strcmp("", AV89Trabajosexternosenviowwds_13_tfsalexthor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExtHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Trabajosexternosenviowwds_14_tfsalexthor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExtHor = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Trabajosexternosenviowwds_16_tfsalsts_sel)==0) && ( ! (GXutil.strcmp("", AV91Trabajosexternosenviowwds_15_tfsalsts)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalSts) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Trabajosexternosenviowwds_16_tfsalsts_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalSts = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SalExtAlb" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SalExtAlb DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ManNom" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ManNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ManCod" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ManCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SalExtFec" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SalExtFec DESC" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SalExtHor" ;
      }
      else if ( ( AV10OrderedBy == 7 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SalExtHor DESC" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SalSts" ;
      }
      else if ( ( AV10OrderedBy == 8 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SalSts DESC" ;
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
                  return conditional_P09162(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09162", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(9);
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
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
      }
   }

}

