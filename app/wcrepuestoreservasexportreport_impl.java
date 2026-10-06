package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcrepuestoreservasexportreport_impl extends GXWebReport
{
   public wcrepuestoreservasexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV54Title = httpContext.getMessage( "Lista de Tabla MRERES (Reserva de Repuestos)", "") ;
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
         h8VW0( true, 0) ;
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
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         h8VW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV24TFMRRes) && (0==AV25TFMRRes_To) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         h8VW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Reserva", ""), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24TFMRRes), "ZZZZZZZZZ9")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV39TFMRRes_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Reserva", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39TFMRRes_To_Description, "")), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25TFMRRes_To), "ZZZZZZZZZ9")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV26TFMRResOrd) && (0==AV27TFMRResOrd_To) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         h8VW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26TFMRResOrd), "ZZZZZZZ9")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV40TFMRResOrd_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Orden", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFMRResOrd_To_Description, "")), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27TFMRResOrd_To), "ZZZZZZZ9")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV36TFMRResFch) )
      {
         h8VW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV36TFMRResFch, "99/99/99 99:99"), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV28TFMRResTpo) && (0==AV29TFMRResTpo_To) ) )
      {
         h8VW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28TFMRResTpo), "ZZZZZZZ9")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV41TFMRResTpo_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Tipo", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFMRResTpo_To_Description, "")), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29TFMRResTpo_To), "ZZZZZZZ9")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV31TFMRResTpoD_Sel)==0) )
      {
         h8VW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Desc Tipo Movimiento", ""), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFMRResTpoD_Sel, "")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV30TFMRResTpoD)==0) )
         {
            h8VW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Desc Tipo Movimiento", ""), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30TFMRResTpoD, "")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV33TFMRResDsc_Sel)==0) )
      {
         h8VW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33TFMRResDsc_Sel, "")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV32TFMRResDsc)==0) )
         {
            h8VW0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV32TFMRResDsc, "")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFMRResCnt)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFMRResCnt_To)==0) ) )
      {
         h8VW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV34TFMRResCnt, "ZZZ,ZZ9.999")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV42TFMRResCnt_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Cantidad", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8VW0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFMRResCnt_To_Description, "")), 25, Gx_line+0, 142, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV35TFMRResCnt_To, "ZZZ,ZZ9.999")), 142, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8VW0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8VW0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Reserva", ""), 30, Gx_line+10, 111, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Orden", ""), 115, Gx_line+10, 196, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha", ""), 200, Gx_line+10, 281, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Tipo", ""), 285, Gx_line+10, 366, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Desc Tipo Movimiento", ""), 370, Gx_line+10, 533, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Descripción", ""), 537, Gx_line+10, 701, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Cantidad", ""), 705, Gx_line+10, 787, Gx_line+27, 2, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV62Wcrepuestoreservasds_1_emprcod = AV10EmprCod ;
      AV63Wcrepuestoreservasds_2_mrcod = AV11MrCod ;
      AV64Wcrepuestoreservasds_3_mrnom = AV12MRNom ;
      AV65Wcrepuestoreservasds_4_filterfulltext = AV15FilterFullText ;
      AV66Wcrepuestoreservasds_5_tfmrres = AV24TFMRRes ;
      AV67Wcrepuestoreservasds_6_tfmrres_to = AV25TFMRRes_To ;
      AV68Wcrepuestoreservasds_7_tfmrresord = AV26TFMRResOrd ;
      AV69Wcrepuestoreservasds_8_tfmrresord_to = AV27TFMRResOrd_To ;
      AV70Wcrepuestoreservasds_9_tfmrresfch = AV36TFMRResFch ;
      AV71Wcrepuestoreservasds_10_tfmrrestpo = AV28TFMRResTpo ;
      AV72Wcrepuestoreservasds_11_tfmrrestpo_to = AV29TFMRResTpo_To ;
      AV73Wcrepuestoreservasds_12_tfmrrestpod = AV30TFMRResTpoD ;
      AV74Wcrepuestoreservasds_13_tfmrrestpod_sel = AV31TFMRResTpoD_Sel ;
      AV75Wcrepuestoreservasds_14_tfmrresdsc = AV32TFMRResDsc ;
      AV76Wcrepuestoreservasds_15_tfmrresdsc_sel = AV33TFMRResDsc_Sel ;
      AV77Wcrepuestoreservasds_16_tfmrrescnt = AV34TFMRResCnt ;
      AV78Wcrepuestoreservasds_17_tfmrrescnt_to = AV35TFMRResCnt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Wcrepuestoreservasds_4_filterfulltext ,
                                           Long.valueOf(AV66Wcrepuestoreservasds_5_tfmrres) ,
                                           Long.valueOf(AV67Wcrepuestoreservasds_6_tfmrres_to) ,
                                           Integer.valueOf(AV68Wcrepuestoreservasds_7_tfmrresord) ,
                                           Integer.valueOf(AV69Wcrepuestoreservasds_8_tfmrresord_to) ,
                                           AV70Wcrepuestoreservasds_9_tfmrresfch ,
                                           Integer.valueOf(AV71Wcrepuestoreservasds_10_tfmrrestpo) ,
                                           Integer.valueOf(AV72Wcrepuestoreservasds_11_tfmrrestpo_to) ,
                                           AV74Wcrepuestoreservasds_13_tfmrrestpod_sel ,
                                           AV73Wcrepuestoreservasds_12_tfmrrestpod ,
                                           AV76Wcrepuestoreservasds_15_tfmrresdsc_sel ,
                                           AV75Wcrepuestoreservasds_14_tfmrresdsc ,
                                           AV77Wcrepuestoreservasds_16_tfmrrescnt ,
                                           AV78Wcrepuestoreservasds_17_tfmrrescnt_to ,
                                           Long.valueOf(A9510MRRes) ,
                                           Integer.valueOf(A9511MRResOrd) ,
                                           Integer.valueOf(A9513MRResTpo) ,
                                           A9514MRResTpoD ,
                                           A9515MRResDsc ,
                                           A9516MRResCnt ,
                                           A9512MRResFch ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           A9493MRNom ,
                                           AV64Wcrepuestoreservasds_3_mrnom ,
                                           A396EmprCod ,
                                           AV10EmprCod ,
                                           Integer.valueOf(A9492MRCod) ,
                                           Integer.valueOf(AV11MrCod) ,
                                           AV62Wcrepuestoreservasds_1_emprcod ,
                                           Integer.valueOf(AV63Wcrepuestoreservasds_2_mrcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV65Wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV65Wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV65Wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV65Wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV65Wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV65Wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV73Wcrepuestoreservasds_12_tfmrrestpod = GXutil.padr( GXutil.rtrim( AV73Wcrepuestoreservasds_12_tfmrrestpod), 30, "%") ;
      lV75Wcrepuestoreservasds_14_tfmrresdsc = GXutil.padr( GXutil.rtrim( AV75Wcrepuestoreservasds_14_tfmrresdsc), 50, "%") ;
      /* Using cursor P08VW2 */
      pr_default.execute(0, new Object[] {AV62Wcrepuestoreservasds_1_emprcod, Integer.valueOf(AV63Wcrepuestoreservasds_2_mrcod), AV64Wcrepuestoreservasds_3_mrnom, AV10EmprCod, Integer.valueOf(AV11MrCod), lV65Wcrepuestoreservasds_4_filterfulltext, lV65Wcrepuestoreservasds_4_filterfulltext, lV65Wcrepuestoreservasds_4_filterfulltext, lV65Wcrepuestoreservasds_4_filterfulltext, lV65Wcrepuestoreservasds_4_filterfulltext, lV65Wcrepuestoreservasds_4_filterfulltext, Long.valueOf(AV66Wcrepuestoreservasds_5_tfmrres), Long.valueOf(AV67Wcrepuestoreservasds_6_tfmrres_to), Integer.valueOf(AV68Wcrepuestoreservasds_7_tfmrresord), Integer.valueOf(AV69Wcrepuestoreservasds_8_tfmrresord_to), AV70Wcrepuestoreservasds_9_tfmrresfch, Integer.valueOf(AV71Wcrepuestoreservasds_10_tfmrrestpo), Integer.valueOf(AV72Wcrepuestoreservasds_11_tfmrrestpo_to), lV73Wcrepuestoreservasds_12_tfmrrestpod, AV74Wcrepuestoreservasds_13_tfmrrestpod_sel, lV75Wcrepuestoreservasds_14_tfmrresdsc, AV76Wcrepuestoreservasds_15_tfmrresdsc_sel, AV77Wcrepuestoreservasds_16_tfmrrescnt, AV78Wcrepuestoreservasds_17_tfmrrescnt_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9516MRResCnt = P08VW2_A9516MRResCnt[0] ;
         A9515MRResDsc = P08VW2_A9515MRResDsc[0] ;
         A9514MRResTpoD = P08VW2_A9514MRResTpoD[0] ;
         n9514MRResTpoD = P08VW2_n9514MRResTpoD[0] ;
         A9513MRResTpo = P08VW2_A9513MRResTpo[0] ;
         A9512MRResFch = P08VW2_A9512MRResFch[0] ;
         A9511MRResOrd = P08VW2_A9511MRResOrd[0] ;
         A9510MRRes = P08VW2_A9510MRRes[0] ;
         A9493MRNom = P08VW2_A9493MRNom[0] ;
         n9493MRNom = P08VW2_n9493MRNom[0] ;
         A9492MRCod = P08VW2_A9492MRCod[0] ;
         A396EmprCod = P08VW2_A396EmprCod[0] ;
         A9493MRNom = P08VW2_A9493MRNom[0] ;
         n9493MRNom = P08VW2_n9493MRNom[0] ;
         A9514MRResTpoD = P08VW2_A9514MRResTpoD[0] ;
         n9514MRResTpoD = P08VW2_n9514MRResTpoD[0] ;
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
         h8VW0( false, 36) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9510MRRes), "ZZZZZZZZZ9")), 30, Gx_line+10, 111, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9511MRResOrd), "ZZZZZZZ9")), 115, Gx_line+10, 196, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(localUtil.format( A9512MRResFch, "99/99/99 99:99"), 200, Gx_line+10, 281, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9513MRResTpo), "ZZZZZZZ9")), 285, Gx_line+10, 366, Gx_line+25, 2, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9514MRResTpoD, "")), 370, Gx_line+10, 533, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9515MRResDsc, "")), 537, Gx_line+10, 701, Gx_line+25, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( A9516MRResCnt, "ZZZ,ZZ9.999")), 705, Gx_line+10, 787, Gx_line+25, 2, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV16Session.getValue("WCRepuestoReservasGridState"), "") == 0 )
      {
         AV18GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCRepuestoReservasGridState"), null, null);
      }
      else
      {
         AV18GridState.fromxml(AV16Session.getValue("WCRepuestoReservasGridState"), null, null);
      }
      AV13OrderedBy = AV18GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV14OrderedDsc = AV18GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV1));
         if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRES") == 0 )
         {
            AV24TFMRRes = GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV25TFMRRes_To = GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESORD") == 0 )
         {
            AV26TFMRResOrd = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFMRResOrd_To = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESFCH") == 0 )
         {
            AV36TFMRResFch = localUtil.ctot( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESTPO") == 0 )
         {
            AV28TFMRResTpo = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFMRResTpo_To = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESTPOD") == 0 )
         {
            AV30TFMRResTpoD = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESTPOD_SEL") == 0 )
         {
            AV31TFMRResTpoD_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESDSC") == 0 )
         {
            AV32TFMRResDsc = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESDSC_SEL") == 0 )
         {
            AV33TFMRResDsc_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESCNT") == 0 )
         {
            AV34TFMRResCnt = CommonUtil.decimalVal( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFMRResCnt_To = CommonUtil.decimalVal( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV10EmprCod = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRCOD") == 0 )
         {
            AV11MrCod = (int)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRNOM") == 0 )
         {
            AV12MRNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
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

   public void h8VW0( boolean bFoot ,
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
               AV52PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV49DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV49DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV54Title = AV58Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV54Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV54Title = "" ;
      AV15FilterFullText = "" ;
      AV39TFMRRes_To_Description = "" ;
      AV40TFMRResOrd_To_Description = "" ;
      AV36TFMRResFch = GXutil.resetTime( GXutil.nullDate() );
      AV41TFMRResTpo_To_Description = "" ;
      AV31TFMRResTpoD_Sel = "" ;
      AV30TFMRResTpoD = "" ;
      AV33TFMRResDsc_Sel = "" ;
      AV32TFMRResDsc = "" ;
      AV34TFMRResCnt = DecimalUtil.ZERO ;
      AV35TFMRResCnt_To = DecimalUtil.ZERO ;
      AV42TFMRResCnt_To_Description = "" ;
      A9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      A9514MRResTpoD = "" ;
      A9515MRResDsc = "" ;
      A9516MRResCnt = DecimalUtil.ZERO ;
      AV62Wcrepuestoreservasds_1_emprcod = "" ;
      AV10EmprCod = "" ;
      AV64Wcrepuestoreservasds_3_mrnom = "" ;
      AV12MRNom = "" ;
      AV65Wcrepuestoreservasds_4_filterfulltext = "" ;
      AV70Wcrepuestoreservasds_9_tfmrresfch = GXutil.resetTime( GXutil.nullDate() );
      AV73Wcrepuestoreservasds_12_tfmrrestpod = "" ;
      AV74Wcrepuestoreservasds_13_tfmrrestpod_sel = "" ;
      AV75Wcrepuestoreservasds_14_tfmrresdsc = "" ;
      AV76Wcrepuestoreservasds_15_tfmrresdsc_sel = "" ;
      AV77Wcrepuestoreservasds_16_tfmrrescnt = DecimalUtil.ZERO ;
      AV78Wcrepuestoreservasds_17_tfmrrescnt_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV65Wcrepuestoreservasds_4_filterfulltext = "" ;
      lV73Wcrepuestoreservasds_12_tfmrrestpod = "" ;
      lV75Wcrepuestoreservasds_14_tfmrresdsc = "" ;
      A9493MRNom = "" ;
      A396EmprCod = "" ;
      P08VW2_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VW2_A9515MRResDsc = new String[] {""} ;
      P08VW2_A9514MRResTpoD = new String[] {""} ;
      P08VW2_n9514MRResTpoD = new boolean[] {false} ;
      P08VW2_A9513MRResTpo = new int[1] ;
      P08VW2_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08VW2_A9511MRResOrd = new int[1] ;
      P08VW2_A9510MRRes = new long[1] ;
      P08VW2_A9493MRNom = new String[] {""} ;
      P08VW2_n9493MRNom = new boolean[] {false} ;
      P08VW2_A9492MRCod = new int[1] ;
      P08VW2_A396EmprCod = new String[] {""} ;
      AV16Session = httpContext.getWebSession();
      AV18GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV19GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52PageInfo = "" ;
      AV49DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV58Pgmdesc = "" ;
      AV47AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcrepuestoreservasexportreport__default(),
         new Object[] {
             new Object[] {
            P08VW2_A9516MRResCnt, P08VW2_A9515MRResDsc, P08VW2_A9514MRResTpoD, P08VW2_n9514MRResTpoD, P08VW2_A9513MRResTpo, P08VW2_A9512MRResFch, P08VW2_A9511MRResOrd, P08VW2_A9510MRRes, P08VW2_A9493MRNom, P08VW2_n9493MRNom,
            P08VW2_A9492MRCod, P08VW2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV58Pgmdesc = httpContext.getMessage( "Lista Reserva de Repuestos", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV58Pgmdesc = httpContext.getMessage( "Lista Reserva de Repuestos", "") ;
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
   private int AV26TFMRResOrd ;
   private int AV27TFMRResOrd_To ;
   private int AV28TFMRResTpo ;
   private int AV29TFMRResTpo_To ;
   private int A9511MRResOrd ;
   private int A9513MRResTpo ;
   private int AV63Wcrepuestoreservasds_2_mrcod ;
   private int AV11MrCod ;
   private int AV68Wcrepuestoreservasds_7_tfmrresord ;
   private int AV69Wcrepuestoreservasds_8_tfmrresord_to ;
   private int AV71Wcrepuestoreservasds_10_tfmrrestpo ;
   private int AV72Wcrepuestoreservasds_11_tfmrrestpo_to ;
   private int A9492MRCod ;
   private int AV79GXV1 ;
   private long AV24TFMRRes ;
   private long AV25TFMRRes_To ;
   private long A9510MRRes ;
   private long AV66Wcrepuestoreservasds_5_tfmrres ;
   private long AV67Wcrepuestoreservasds_6_tfmrres_to ;
   private java.math.BigDecimal AV34TFMRResCnt ;
   private java.math.BigDecimal AV35TFMRResCnt_To ;
   private java.math.BigDecimal A9516MRResCnt ;
   private java.math.BigDecimal AV77Wcrepuestoreservasds_16_tfmrrescnt ;
   private java.math.BigDecimal AV78Wcrepuestoreservasds_17_tfmrrescnt_to ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV31TFMRResTpoD_Sel ;
   private String AV30TFMRResTpoD ;
   private String AV33TFMRResDsc_Sel ;
   private String AV32TFMRResDsc ;
   private String A9514MRResTpoD ;
   private String A9515MRResDsc ;
   private String AV62Wcrepuestoreservasds_1_emprcod ;
   private String AV10EmprCod ;
   private String AV64Wcrepuestoreservasds_3_mrnom ;
   private String AV12MRNom ;
   private String AV73Wcrepuestoreservasds_12_tfmrrestpod ;
   private String AV74Wcrepuestoreservasds_13_tfmrrestpod_sel ;
   private String AV75Wcrepuestoreservasds_14_tfmrresdsc ;
   private String AV76Wcrepuestoreservasds_15_tfmrresdsc_sel ;
   private String scmdbuf ;
   private String lV73Wcrepuestoreservasds_12_tfmrrestpod ;
   private String lV75Wcrepuestoreservasds_14_tfmrresdsc ;
   private String A9493MRNom ;
   private String A396EmprCod ;
   private String AV58Pgmdesc ;
   private java.util.Date AV36TFMRResFch ;
   private java.util.Date A9512MRResFch ;
   private java.util.Date AV70Wcrepuestoreservasds_9_tfmrresfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private boolean AV14OrderedDsc ;
   private boolean n9514MRResTpoD ;
   private boolean n9493MRNom ;
   private String AV54Title ;
   private String AV15FilterFullText ;
   private String AV39TFMRRes_To_Description ;
   private String AV40TFMRResOrd_To_Description ;
   private String AV41TFMRResTpo_To_Description ;
   private String AV42TFMRResCnt_To_Description ;
   private String AV65Wcrepuestoreservasds_4_filterfulltext ;
   private String lV65Wcrepuestoreservasds_4_filterfulltext ;
   private String AV52PageInfo ;
   private String AV49DateInfo ;
   private String AV47AppName ;
   private com.genexus.webpanels.WebSession AV16Session ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08VW2_A9516MRResCnt ;
   private String[] P08VW2_A9515MRResDsc ;
   private String[] P08VW2_A9514MRResTpoD ;
   private boolean[] P08VW2_n9514MRResTpoD ;
   private int[] P08VW2_A9513MRResTpo ;
   private java.util.Date[] P08VW2_A9512MRResFch ;
   private int[] P08VW2_A9511MRResOrd ;
   private long[] P08VW2_A9510MRRes ;
   private String[] P08VW2_A9493MRNom ;
   private boolean[] P08VW2_n9493MRNom ;
   private int[] P08VW2_A9492MRCod ;
   private String[] P08VW2_A396EmprCod ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV18GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV19GridStateFilterValue ;
}

final  class wcrepuestoreservasexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Wcrepuestoreservasds_4_filterfulltext ,
                                          long AV66Wcrepuestoreservasds_5_tfmrres ,
                                          long AV67Wcrepuestoreservasds_6_tfmrres_to ,
                                          int AV68Wcrepuestoreservasds_7_tfmrresord ,
                                          int AV69Wcrepuestoreservasds_8_tfmrresord_to ,
                                          java.util.Date AV70Wcrepuestoreservasds_9_tfmrresfch ,
                                          int AV71Wcrepuestoreservasds_10_tfmrrestpo ,
                                          int AV72Wcrepuestoreservasds_11_tfmrrestpo_to ,
                                          String AV74Wcrepuestoreservasds_13_tfmrrestpod_sel ,
                                          String AV73Wcrepuestoreservasds_12_tfmrrestpod ,
                                          String AV76Wcrepuestoreservasds_15_tfmrresdsc_sel ,
                                          String AV75Wcrepuestoreservasds_14_tfmrresdsc ,
                                          java.math.BigDecimal AV77Wcrepuestoreservasds_16_tfmrrescnt ,
                                          java.math.BigDecimal AV78Wcrepuestoreservasds_17_tfmrrescnt_to ,
                                          long A9510MRRes ,
                                          int A9511MRResOrd ,
                                          int A9513MRResTpo ,
                                          String A9514MRResTpoD ,
                                          String A9515MRResDsc ,
                                          java.math.BigDecimal A9516MRResCnt ,
                                          java.util.Date A9512MRResFch ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A9493MRNom ,
                                          String AV64Wcrepuestoreservasds_3_mrnom ,
                                          String A396EmprCod ,
                                          String AV10EmprCod ,
                                          int A9492MRCod ,
                                          int AV11MrCod ,
                                          String AV62Wcrepuestoreservasds_1_emprcod ,
                                          int AV63Wcrepuestoreservasds_2_mrcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MRResCnt, T1.MRResDsc, T3.MTMovNom AS MRResTpoD, T1.MRResTpo AS MRResTpo, T1.MRResFch, T1.MRResOrd, T1.MRRes, T2.MRNom, T1.MRCod, T1.EmprCod FROM ((TXPMReRes" ;
      scmdbuf += " T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMTPOMO T3 ON T3.EmprCod = T1.EmprCod AND T3.MTMovCod = T1.MRResTpo)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRCod = ?)");
      addWhere(sWhereString, "(T2.MRNom = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MRCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Wcrepuestoreservasds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MRRes,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRResOrd,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRResTpo,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MTMovNom) like '%' || UPPER(?)) or ( UPPER(T1.MRResDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRResCnt,'999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Wcrepuestoreservasds_5_tfmrres) )
      {
         addWhere(sWhereString, "(T1.MRRes >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Wcrepuestoreservasds_6_tfmrres_to) )
      {
         addWhere(sWhereString, "(T1.MRRes <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV68Wcrepuestoreservasds_7_tfmrresord) )
      {
         addWhere(sWhereString, "(T1.MRResOrd >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV69Wcrepuestoreservasds_8_tfmrresord_to) )
      {
         addWhere(sWhereString, "(T1.MRResOrd <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV70Wcrepuestoreservasds_9_tfmrresfch) )
      {
         addWhere(sWhereString, "(T1.MRResFch >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcrepuestoreservasds_10_tfmrrestpo) )
      {
         addWhere(sWhereString, "(T1.MRResTpo >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV72Wcrepuestoreservasds_11_tfmrrestpo_to) )
      {
         addWhere(sWhereString, "(T1.MRResTpo <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Wcrepuestoreservasds_13_tfmrrestpod_sel)==0) && ( ! (GXutil.strcmp("", AV73Wcrepuestoreservasds_12_tfmrrestpod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Wcrepuestoreservasds_13_tfmrrestpod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MTMovNom = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Wcrepuestoreservasds_15_tfmrresdsc_sel)==0) && ( ! (GXutil.strcmp("", AV75Wcrepuestoreservasds_14_tfmrresdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRResDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Wcrepuestoreservasds_15_tfmrresdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRResDsc = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcrepuestoreservasds_16_tfmrrescnt)==0) )
      {
         addWhere(sWhereString, "(T1.MRResCnt >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Wcrepuestoreservasds_17_tfmrrescnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRResCnt <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRRes" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRRes DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResOrd" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResOrd DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResFch" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResFch DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResTpo" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResTpo DESC" ;
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
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResDsc" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResCnt" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MRCod DESC, T2.MRNom DESC, T1.MRResCnt DESC" ;
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
                  return conditional_P08VW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 50);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((long[]) buf[7])[0] = rslt.getLong(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 50);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 50);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               return;
      }
   }

}

