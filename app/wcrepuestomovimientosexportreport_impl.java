package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcrepuestomovimientosexportreport_impl extends GXWebReport
{
   public wcrepuestomovimientosexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV55Title = httpContext.getMessage( "Lista de Movimientos Repuestos", "") ;
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
         h8VZ0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV15FilterFullText)==0) )
      {
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV23TFMRMov) && (0==AV24TFMRMov_To) ) )
      {
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Movimiento", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFMRMov), "ZZZZZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV39TFMRMov_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Movimiento", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFMRMov_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFMRMov_To), "ZZZZZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV25TFMRMovOrd) && (0==AV26TFMRMovOrd_To) ) )
      {
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFMRMovOrd), "ZZZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV40TFMRMovOrd_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Orden", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFMRMovOrd_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFMRMovOrd_To), "ZZZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV27TFMRMovFch) )
      {
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV27TFMRMovFch, "99/99/99 99:99"), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV29TFMRMovTpo) && (0==AV30TFMRMovTpo_To) ) )
      {
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TFMRMovTpo), "ZZZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV42TFMRMovTpo_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tipo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFMRMovTpo_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV30TFMRMovTpo_To), "ZZZZZZZ9")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV32TFMRMovTpoD_Sel)==0) )
      {
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Desc Tipo Movimiento", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFMRMovTpoD_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV31TFMRMovTpoD)==0) )
         {
            h8VZ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Desc Tipo Movimiento", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFMRMovTpoD, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV34TFMRMovDsc_Sel)==0) )
      {
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34TFMRMovDsc_Sel, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV33TFMRMovDsc)==0) )
         {
            h8VZ0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFMRMovDsc, "")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFMRMovCnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFMRMovCnt_To)==0) ) )
      {
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TFMRMovCnt, "ZZZ,ZZ9.999")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV43TFMRMovCnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFMRMovCnt_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV36TFMRMovCnt_To, "ZZZ,ZZ9.999")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFMRMovPre)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFMRMovPre_To)==0) ) )
      {
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Precio del Mov.", ""), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV37TFMRMovPre, "ZZ,ZZZ,ZZ9.999")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV44TFMRMovPre_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Precio del Mov.", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VZ0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV44TFMRMovPre_To_Description, "")), 25, Gx_line+0, 148, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV38TFMRMovPre_To, "ZZ,ZZZ,ZZ9.999")), 148, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8VZ0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8VZ0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Movimiento", ""), 30, Gx_line+10, 102, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 106, Gx_line+10, 179, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 183, Gx_line+10, 256, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 260, Gx_line+10, 333, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Desc Tipo Movimiento", ""), 337, Gx_line+10, 483, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 487, Gx_line+10, 633, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 637, Gx_line+10, 710, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Precio del Mov.", ""), 714, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV63Wcrepuestomovimientosds_1_emprcod = AV10EmprCod ;
      AV64Wcrepuestomovimientosds_2_mrcod = AV11MRCod ;
      AV65Wcrepuestomovimientosds_3_mrnom = AV12MRNom ;
      AV66Wcrepuestomovimientosds_4_filterfulltext = AV15FilterFullText ;
      AV67Wcrepuestomovimientosds_5_tfmrmov = AV23TFMRMov ;
      AV68Wcrepuestomovimientosds_6_tfmrmov_to = AV24TFMRMov_To ;
      AV69Wcrepuestomovimientosds_7_tfmrmovord = AV25TFMRMovOrd ;
      AV70Wcrepuestomovimientosds_8_tfmrmovord_to = AV26TFMRMovOrd_To ;
      AV71Wcrepuestomovimientosds_9_tfmrmovfch = AV27TFMRMovFch ;
      AV72Wcrepuestomovimientosds_10_tfmrmovtpo = AV29TFMRMovTpo ;
      AV73Wcrepuestomovimientosds_11_tfmrmovtpo_to = AV30TFMRMovTpo_To ;
      AV74Wcrepuestomovimientosds_12_tfmrmovtpod = AV31TFMRMovTpoD ;
      AV75Wcrepuestomovimientosds_13_tfmrmovtpod_sel = AV32TFMRMovTpoD_Sel ;
      AV76Wcrepuestomovimientosds_14_tfmrmovdsc = AV33TFMRMovDsc ;
      AV77Wcrepuestomovimientosds_15_tfmrmovdsc_sel = AV34TFMRMovDsc_Sel ;
      AV78Wcrepuestomovimientosds_16_tfmrmovcnt = AV35TFMRMovCnt ;
      AV79Wcrepuestomovimientosds_17_tfmrmovcnt_to = AV36TFMRMovCnt_To ;
      AV80Wcrepuestomovimientosds_18_tfmrmovpre = AV37TFMRMovPre ;
      AV81Wcrepuestomovimientosds_19_tfmrmovpre_to = AV38TFMRMovPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV66Wcrepuestomovimientosds_4_filterfulltext ,
                                           Long.valueOf(AV67Wcrepuestomovimientosds_5_tfmrmov) ,
                                           Long.valueOf(AV68Wcrepuestomovimientosds_6_tfmrmov_to) ,
                                           Integer.valueOf(AV69Wcrepuestomovimientosds_7_tfmrmovord) ,
                                           Integer.valueOf(AV70Wcrepuestomovimientosds_8_tfmrmovord_to) ,
                                           AV71Wcrepuestomovimientosds_9_tfmrmovfch ,
                                           Integer.valueOf(AV72Wcrepuestomovimientosds_10_tfmrmovtpo) ,
                                           Integer.valueOf(AV73Wcrepuestomovimientosds_11_tfmrmovtpo_to) ,
                                           AV75Wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                           AV74Wcrepuestomovimientosds_12_tfmrmovtpod ,
                                           AV77Wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                           AV76Wcrepuestomovimientosds_14_tfmrmovdsc ,
                                           AV78Wcrepuestomovimientosds_16_tfmrmovcnt ,
                                           AV79Wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                           AV80Wcrepuestomovimientosds_18_tfmrmovpre ,
                                           AV81Wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                           Long.valueOf(A9502MRMov) ,
                                           Integer.valueOf(A9503MRMovOrd) ,
                                           Integer.valueOf(A9505MRMovTpo) ,
                                           A9506MRMovTpoD ,
                                           A9507MRMovDsc ,
                                           A9508MRMovCnt ,
                                           A9509MRMovPre ,
                                           A9504MRMovFch ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           A9493MRNom ,
                                           AV65Wcrepuestomovimientosds_3_mrnom ,
                                           A396EmprCod ,
                                           AV10EmprCod ,
                                           Integer.valueOf(A9492MRCod) ,
                                           Integer.valueOf(AV11MRCod) ,
                                           AV63Wcrepuestomovimientosds_1_emprcod ,
                                           Integer.valueOf(AV64Wcrepuestomovimientosds_2_mrcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV66Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV74Wcrepuestomovimientosds_12_tfmrmovtpod = GXutil.padr( GXutil.rtrim( AV74Wcrepuestomovimientosds_12_tfmrmovtpod), 30, "%") ;
      lV76Wcrepuestomovimientosds_14_tfmrmovdsc = GXutil.padr( GXutil.rtrim( AV76Wcrepuestomovimientosds_14_tfmrmovdsc), 30, "%") ;
      /* Using cursor P08VZ2 */
      pr_default.execute(0, new Object[] {AV63Wcrepuestomovimientosds_1_emprcod, Integer.valueOf(AV64Wcrepuestomovimientosds_2_mrcod), AV65Wcrepuestomovimientosds_3_mrnom, AV10EmprCod, Integer.valueOf(AV11MRCod), lV66Wcrepuestomovimientosds_4_filterfulltext, lV66Wcrepuestomovimientosds_4_filterfulltext, lV66Wcrepuestomovimientosds_4_filterfulltext, lV66Wcrepuestomovimientosds_4_filterfulltext, lV66Wcrepuestomovimientosds_4_filterfulltext, lV66Wcrepuestomovimientosds_4_filterfulltext, lV66Wcrepuestomovimientosds_4_filterfulltext, Long.valueOf(AV67Wcrepuestomovimientosds_5_tfmrmov), Long.valueOf(AV68Wcrepuestomovimientosds_6_tfmrmov_to), Integer.valueOf(AV69Wcrepuestomovimientosds_7_tfmrmovord), Integer.valueOf(AV70Wcrepuestomovimientosds_8_tfmrmovord_to), AV71Wcrepuestomovimientosds_9_tfmrmovfch, Integer.valueOf(AV72Wcrepuestomovimientosds_10_tfmrmovtpo), Integer.valueOf(AV73Wcrepuestomovimientosds_11_tfmrmovtpo_to), lV74Wcrepuestomovimientosds_12_tfmrmovtpod, AV75Wcrepuestomovimientosds_13_tfmrmovtpod_sel, lV76Wcrepuestomovimientosds_14_tfmrmovdsc, AV77Wcrepuestomovimientosds_15_tfmrmovdsc_sel, AV78Wcrepuestomovimientosds_16_tfmrmovcnt, AV79Wcrepuestomovimientosds_17_tfmrmovcnt_to, AV80Wcrepuestomovimientosds_18_tfmrmovpre, AV81Wcrepuestomovimientosds_19_tfmrmovpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9509MRMovPre = P08VZ2_A9509MRMovPre[0] ;
         A9508MRMovCnt = P08VZ2_A9508MRMovCnt[0] ;
         A9507MRMovDsc = P08VZ2_A9507MRMovDsc[0] ;
         A9506MRMovTpoD = P08VZ2_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = P08VZ2_n9506MRMovTpoD[0] ;
         A9505MRMovTpo = P08VZ2_A9505MRMovTpo[0] ;
         A9504MRMovFch = P08VZ2_A9504MRMovFch[0] ;
         A9503MRMovOrd = P08VZ2_A9503MRMovOrd[0] ;
         A9502MRMov = P08VZ2_A9502MRMov[0] ;
         A9493MRNom = P08VZ2_A9493MRNom[0] ;
         n9493MRNom = P08VZ2_n9493MRNom[0] ;
         A9492MRCod = P08VZ2_A9492MRCod[0] ;
         A396EmprCod = P08VZ2_A396EmprCod[0] ;
         A9493MRNom = P08VZ2_A9493MRNom[0] ;
         n9493MRNom = P08VZ2_n9493MRNom[0] ;
         A9506MRMovTpoD = P08VZ2_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = P08VZ2_n9506MRMovTpoD[0] ;
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
         h8VZ0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9502MRMov), "ZZZZZZZZZ9")), 30, Gx_line+10, 102, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9503MRMovOrd), "ZZZZZZZ9")), 106, Gx_line+10, 179, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A9504MRMovFch, "99/99/99 99:99"), 183, Gx_line+10, 256, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9505MRMovTpo), "ZZZZZZZ9")), 260, Gx_line+10, 333, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9506MRMovTpoD, "")), 337, Gx_line+10, 483, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9507MRMovDsc, "")), 487, Gx_line+10, 633, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9508MRMovCnt, "ZZZ,ZZ9.999")), 637, Gx_line+10, 710, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9509MRMovPre, "ZZ,ZZZ,ZZ9.999")), 714, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCRepuestoMovimientosGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCRepuestoMovimientosGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("WCRepuestoMovimientosGridState"), null, null);
      }
      AV13OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV14OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOV") == 0 )
         {
            AV23TFMRMov = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV24TFMRMov_To = GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVORD") == 0 )
         {
            AV25TFMRMovOrd = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV26TFMRMovOrd_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVFCH") == 0 )
         {
            AV27TFMRMovFch = localUtil.ctot( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPO") == 0 )
         {
            AV29TFMRMovTpo = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV30TFMRMovTpo_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPOD") == 0 )
         {
            AV31TFMRMovTpoD = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPOD_SEL") == 0 )
         {
            AV32TFMRMovTpoD_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVDSC") == 0 )
         {
            AV33TFMRMovDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVDSC_SEL") == 0 )
         {
            AV34TFMRMovDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVCNT") == 0 )
         {
            AV35TFMRMovCnt = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV36TFMRMovCnt_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVPRE") == 0 )
         {
            AV37TFMRMovPre = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV38TFMRMovPre_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10EmprCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRCOD") == 0 )
         {
            AV11MRCod = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRNOM") == 0 )
         {
            AV12MRNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV82GXV1 = (int)(AV82GXV1+1) ;
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

   public void h8VZ0( boolean bFoot ,
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
               AV53PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV50DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV55Title = AV59Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV48AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV55Title = "" ;
      AV15FilterFullText = "" ;
      AV39TFMRMov_To_Description = "" ;
      AV40TFMRMovOrd_To_Description = "" ;
      AV27TFMRMovFch = GXutil.resetTime( GXutil.nullDate() );
      AV42TFMRMovTpo_To_Description = "" ;
      AV32TFMRMovTpoD_Sel = "" ;
      AV31TFMRMovTpoD = "" ;
      AV34TFMRMovDsc_Sel = "" ;
      AV33TFMRMovDsc = "" ;
      AV35TFMRMovCnt = DecimalUtil.ZERO ;
      AV36TFMRMovCnt_To = DecimalUtil.ZERO ;
      AV43TFMRMovCnt_To_Description = "" ;
      AV37TFMRMovPre = DecimalUtil.ZERO ;
      AV38TFMRMovPre_To = DecimalUtil.ZERO ;
      AV44TFMRMovPre_To_Description = "" ;
      A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      A9506MRMovTpoD = "" ;
      A9507MRMovDsc = "" ;
      A9508MRMovCnt = DecimalUtil.ZERO ;
      A9509MRMovPre = DecimalUtil.ZERO ;
      AV63Wcrepuestomovimientosds_1_emprcod = "" ;
      AV10EmprCod = "" ;
      AV65Wcrepuestomovimientosds_3_mrnom = "" ;
      AV12MRNom = "" ;
      AV66Wcrepuestomovimientosds_4_filterfulltext = "" ;
      AV71Wcrepuestomovimientosds_9_tfmrmovfch = GXutil.resetTime( GXutil.nullDate() );
      AV74Wcrepuestomovimientosds_12_tfmrmovtpod = "" ;
      AV75Wcrepuestomovimientosds_13_tfmrmovtpod_sel = "" ;
      AV76Wcrepuestomovimientosds_14_tfmrmovdsc = "" ;
      AV77Wcrepuestomovimientosds_15_tfmrmovdsc_sel = "" ;
      AV78Wcrepuestomovimientosds_16_tfmrmovcnt = DecimalUtil.ZERO ;
      AV79Wcrepuestomovimientosds_17_tfmrmovcnt_to = DecimalUtil.ZERO ;
      AV80Wcrepuestomovimientosds_18_tfmrmovpre = DecimalUtil.ZERO ;
      AV81Wcrepuestomovimientosds_19_tfmrmovpre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV66Wcrepuestomovimientosds_4_filterfulltext = "" ;
      lV74Wcrepuestomovimientosds_12_tfmrmovtpod = "" ;
      lV76Wcrepuestomovimientosds_14_tfmrmovdsc = "" ;
      A9493MRNom = "" ;
      A396EmprCod = "" ;
      P08VZ2_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VZ2_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VZ2_A9507MRMovDsc = new String[] {""} ;
      P08VZ2_A9506MRMovTpoD = new String[] {""} ;
      P08VZ2_n9506MRMovTpoD = new boolean[] {false} ;
      P08VZ2_A9505MRMovTpo = new int[1] ;
      P08VZ2_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08VZ2_A9503MRMovOrd = new int[1] ;
      P08VZ2_A9502MRMov = new long[1] ;
      P08VZ2_A9493MRNom = new String[] {""} ;
      P08VZ2_n9493MRNom = new boolean[] {false} ;
      P08VZ2_A9492MRCod = new int[1] ;
      P08VZ2_A396EmprCod = new String[] {""} ;
      AV19Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV53PageInfo = "" ;
      AV50DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV59Pgmdesc = "" ;
      AV48AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcrepuestomovimientosexportreport__default(),
         new Object[] {
             new Object[] {
            P08VZ2_A9509MRMovPre, P08VZ2_A9508MRMovCnt, P08VZ2_A9507MRMovDsc, P08VZ2_A9506MRMovTpoD, P08VZ2_n9506MRMovTpoD, P08VZ2_A9505MRMovTpo, P08VZ2_A9504MRMovFch, P08VZ2_A9503MRMovOrd, P08VZ2_A9502MRMov, P08VZ2_A9493MRNom,
            P08VZ2_n9493MRNom, P08VZ2_A9492MRCod, P08VZ2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV59Pgmdesc = httpContext.getMessage( "Lista Movimientos Repuestos", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV59Pgmdesc = httpContext.getMessage( "Lista Movimientos Repuestos", "") ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV13OrderedBy ;
   private short Gx_err ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV25TFMRMovOrd ;
   private int AV26TFMRMovOrd_To ;
   private int AV29TFMRMovTpo ;
   private int AV30TFMRMovTpo_To ;
   private int A9503MRMovOrd ;
   private int A9505MRMovTpo ;
   private int AV64Wcrepuestomovimientosds_2_mrcod ;
   private int AV11MRCod ;
   private int AV69Wcrepuestomovimientosds_7_tfmrmovord ;
   private int AV70Wcrepuestomovimientosds_8_tfmrmovord_to ;
   private int AV72Wcrepuestomovimientosds_10_tfmrmovtpo ;
   private int AV73Wcrepuestomovimientosds_11_tfmrmovtpo_to ;
   private int A9492MRCod ;
   private int AV82GXV1 ;
   private long AV23TFMRMov ;
   private long AV24TFMRMov_To ;
   private long A9502MRMov ;
   private long AV67Wcrepuestomovimientosds_5_tfmrmov ;
   private long AV68Wcrepuestomovimientosds_6_tfmrmov_to ;
   private java.math.BigDecimal AV35TFMRMovCnt ;
   private java.math.BigDecimal AV36TFMRMovCnt_To ;
   private java.math.BigDecimal AV37TFMRMovPre ;
   private java.math.BigDecimal AV38TFMRMovPre_To ;
   private java.math.BigDecimal A9508MRMovCnt ;
   private java.math.BigDecimal A9509MRMovPre ;
   private java.math.BigDecimal AV78Wcrepuestomovimientosds_16_tfmrmovcnt ;
   private java.math.BigDecimal AV79Wcrepuestomovimientosds_17_tfmrmovcnt_to ;
   private java.math.BigDecimal AV80Wcrepuestomovimientosds_18_tfmrmovpre ;
   private java.math.BigDecimal AV81Wcrepuestomovimientosds_19_tfmrmovpre_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV32TFMRMovTpoD_Sel ;
   private String AV31TFMRMovTpoD ;
   private String AV34TFMRMovDsc_Sel ;
   private String AV33TFMRMovDsc ;
   private String A9506MRMovTpoD ;
   private String A9507MRMovDsc ;
   private String AV63Wcrepuestomovimientosds_1_emprcod ;
   private String AV10EmprCod ;
   private String AV65Wcrepuestomovimientosds_3_mrnom ;
   private String AV12MRNom ;
   private String AV74Wcrepuestomovimientosds_12_tfmrmovtpod ;
   private String AV75Wcrepuestomovimientosds_13_tfmrmovtpod_sel ;
   private String AV76Wcrepuestomovimientosds_14_tfmrmovdsc ;
   private String AV77Wcrepuestomovimientosds_15_tfmrmovdsc_sel ;
   private String scmdbuf ;
   private String lV74Wcrepuestomovimientosds_12_tfmrmovtpod ;
   private String lV76Wcrepuestomovimientosds_14_tfmrmovdsc ;
   private String A9493MRNom ;
   private String A396EmprCod ;
   private String AV59Pgmdesc ;
   private java.util.Date AV27TFMRMovFch ;
   private java.util.Date A9504MRMovFch ;
   private java.util.Date AV71Wcrepuestomovimientosds_9_tfmrmovfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV14OrderedDsc ;
   private boolean n9506MRMovTpoD ;
   private boolean n9493MRNom ;
   private String AV55Title ;
   private String AV15FilterFullText ;
   private String AV39TFMRMov_To_Description ;
   private String AV40TFMRMovOrd_To_Description ;
   private String AV42TFMRMovTpo_To_Description ;
   private String AV43TFMRMovCnt_To_Description ;
   private String AV44TFMRMovPre_To_Description ;
   private String AV66Wcrepuestomovimientosds_4_filterfulltext ;
   private String lV66Wcrepuestomovimientosds_4_filterfulltext ;
   private String AV53PageInfo ;
   private String AV50DateInfo ;
   private String AV48AppName ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08VZ2_A9509MRMovPre ;
   private java.math.BigDecimal[] P08VZ2_A9508MRMovCnt ;
   private String[] P08VZ2_A9507MRMovDsc ;
   private String[] P08VZ2_A9506MRMovTpoD ;
   private boolean[] P08VZ2_n9506MRMovTpoD ;
   private int[] P08VZ2_A9505MRMovTpo ;
   private java.util.Date[] P08VZ2_A9504MRMovFch ;
   private int[] P08VZ2_A9503MRMovOrd ;
   private long[] P08VZ2_A9502MRMov ;
   private String[] P08VZ2_A9493MRNom ;
   private boolean[] P08VZ2_n9493MRNom ;
   private int[] P08VZ2_A9492MRCod ;
   private String[] P08VZ2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
}

final  class wcrepuestomovimientosexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Wcrepuestomovimientosds_4_filterfulltext ,
                                          long AV67Wcrepuestomovimientosds_5_tfmrmov ,
                                          long AV68Wcrepuestomovimientosds_6_tfmrmov_to ,
                                          int AV69Wcrepuestomovimientosds_7_tfmrmovord ,
                                          int AV70Wcrepuestomovimientosds_8_tfmrmovord_to ,
                                          java.util.Date AV71Wcrepuestomovimientosds_9_tfmrmovfch ,
                                          int AV72Wcrepuestomovimientosds_10_tfmrmovtpo ,
                                          int AV73Wcrepuestomovimientosds_11_tfmrmovtpo_to ,
                                          String AV75Wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                          String AV74Wcrepuestomovimientosds_12_tfmrmovtpod ,
                                          String AV77Wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                          String AV76Wcrepuestomovimientosds_14_tfmrmovdsc ,
                                          java.math.BigDecimal AV78Wcrepuestomovimientosds_16_tfmrmovcnt ,
                                          java.math.BigDecimal AV79Wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                          java.math.BigDecimal AV80Wcrepuestomovimientosds_18_tfmrmovpre ,
                                          java.math.BigDecimal AV81Wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                          long A9502MRMov ,
                                          int A9503MRMovOrd ,
                                          int A9505MRMovTpo ,
                                          String A9506MRMovTpoD ,
                                          String A9507MRMovDsc ,
                                          java.math.BigDecimal A9508MRMovCnt ,
                                          java.math.BigDecimal A9509MRMovPre ,
                                          java.util.Date A9504MRMovFch ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A9493MRNom ,
                                          String AV65Wcrepuestomovimientosds_3_mrnom ,
                                          String A396EmprCod ,
                                          String AV10EmprCod ,
                                          int A9492MRCod ,
                                          int AV11MRCod ,
                                          String AV63Wcrepuestomovimientosds_1_emprcod ,
                                          int AV64Wcrepuestomovimientosds_2_mrcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[27];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MRMovPre, T1.MRMovCnt, T1.MRMovDsc, T3.MTMovNom AS MRMovTpoD, T1.MRMovTpo AS MRMovTpo, T1.MRMovFch, T1.MRMovOrd, T1.MRMov, T2.MRNom, T1.MRCod, T1.EmprCod" ;
      scmdbuf += " FROM ((TXPMReMov T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMTPOMO T3 ON T3.EmprCod = T1.EmprCod AND T3.MTMovCod" ;
      scmdbuf += " = T1.MRMovTpo)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRCod = ?)");
      addWhere(sWhereString, "(T2.MRNom = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MRCod = ?)");
      if ( ! (GXutil.strcmp("", AV66Wcrepuestomovimientosds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MRMov,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovOrd,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovTpo,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MTMovNom) like '%' || UPPER(?)) or ( UPPER(T1.MRMovDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRMovCnt,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovPre,'99999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcrepuestomovimientosds_5_tfmrmov) )
      {
         addWhere(sWhereString, "(T1.MRMov >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcrepuestomovimientosds_6_tfmrmov_to) )
      {
         addWhere(sWhereString, "(T1.MRMov <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcrepuestomovimientosds_7_tfmrmovord) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcrepuestomovimientosds_8_tfmrmovord_to) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV71Wcrepuestomovimientosds_9_tfmrmovfch) )
      {
         addWhere(sWhereString, "(T1.MRMovFch >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV72Wcrepuestomovimientosds_10_tfmrmovtpo) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV73Wcrepuestomovimientosds_11_tfmrmovtpo_to) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) && ( ! (GXutil.strcmp("", AV74Wcrepuestomovimientosds_12_tfmrmovtpod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MTMovNom = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcrepuestomovimientosds_14_tfmrmovdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRMovDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Wcrepuestomovimientosds_16_tfmrmovcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Wcrepuestomovimientosds_17_tfmrmovcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Wcrepuestomovimientosds_18_tfmrmovpre)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Wcrepuestomovimientosds_19_tfmrmovpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMov" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMov DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovOrd" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovOrd DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovFch" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovFch DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovTpo" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovTpo DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T3.MTMovNom" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T3.MTMovNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovDsc" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovCnt" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovCnt DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovPre" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRMovPre DESC" ;
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
                  return conditional_P08VZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((long[]) buf[8])[0] = rslt.getLong(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 100);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[39]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[40]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               return;
      }
   }

}

