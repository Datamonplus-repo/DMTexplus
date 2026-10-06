package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tminvstwwexportreport_impl extends GXWebReport
{
   public tminvstwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV52Title = httpContext.getMessage( "Lista de Inventarios de Stock", "") ;
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
         h8EK0( true, 0) ;
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
         h8EK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! ( (0==AV22TFMISCod) && (0==AV23TFMISCod_To) ) )
      {
         h8EK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Inventario de Stock", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22TFMISCod), "ZZZZZZZ9")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
         AV36TFMISCod_To_Description = GXutil.format( "%1 (%2)", httpContext.getMessage( "Inventario de Stock", ""), httpContext.getMessage( "WWP_TSTo", ""), "", "", "", "", "", "", "") ;
         h8EK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36TFMISCod_To_Description, "")), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23TFMISCod_To), "ZZZZZZZ9")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24TFMISFch)) )
      {
         h8EK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha del Inventario", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV24TFMISFch, "99/99/99"), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV34TFMISFchApl)) )
      {
         h8EK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha Aplicado", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV34TFMISFchApl, "99/99/99"), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      AV32TFMISEst_Sels.fromJSonString(AV30TFMISEst_SelsJson, null);
      if ( ! ( AV32TFMISEst_Sels.size() == 0 ) )
      {
         AV41i = 1 ;
         AV67GXV1 = 1 ;
         while ( AV67GXV1 <= AV32TFMISEst_Sels.size() )
         {
            AV33TFMISEst_Sel = (String)AV32TFMISEst_Sels.elementAt(-1+AV67GXV1) ;
            if ( AV41i == 1 )
            {
               AV31TFMISEst_SelDscs = "" ;
            }
            else
            {
               AV31TFMISEst_SelDscs += ", " ;
            }
            AV39FilterTFMISEst_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV33TFMISEst_Sel), "E") == 0 )
            {
               AV39FilterTFMISEst_SelValueDescription = httpContext.getMessage( "En ingreso", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV33TFMISEst_Sel), "A") == 0 )
            {
               AV39FilterTFMISEst_SelValueDescription = httpContext.getMessage( "Aplicado", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV33TFMISEst_Sel), "C") == 0 )
            {
               AV39FilterTFMISEst_SelValueDescription = httpContext.getMessage( "Cancelado", "") ;
            }
            AV31TFMISEst_SelDscs += AV39FilterTFMISEst_SelValueDescription ;
            AV41i = (long)(AV41i+1) ;
            AV67GXV1 = (int)(AV67GXV1+1) ;
         }
         h8EK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31TFMISEst_SelDscs, "")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV27TFMISUsuCre_Sel)==0) )
      {
         h8EK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Usuario que creo el Inventario", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV27TFMISUsuCre_Sel, "")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV26TFMISUsuCre)==0) )
         {
            h8EK0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Usuario que creo el Inventario", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV26TFMISUsuCre, "")), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV28TFMISFchCre) )
      {
         h8EK0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Fecha de Creación del Invent.", ""), 25, Gx_line+0, 181, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(localUtil.format( AV28TFMISFchCre, "99/99/99 99:99"), 181, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h8EK0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h8EK0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Inventario de Stock", ""), 30, Gx_line+10, 135, Gx_line+27, 2, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha del Inventario", ""), 139, Gx_line+10, 244, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha Aplicado", ""), 248, Gx_line+10, 353, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Estado", ""), 357, Gx_line+10, 567, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Usuario que creo el Inventario", ""), 571, Gx_line+10, 677, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Fecha de Creación del Invent.", ""), 681, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV69Mantenimientomaquina_tminvstwwds_1_filterfulltext = AV12FilterFullText ;
      AV70Mantenimientomaquina_tminvstwwds_2_tfmiscod = AV22TFMISCod ;
      AV71Mantenimientomaquina_tminvstwwds_3_tfmiscod_to = AV23TFMISCod_To ;
      AV72Mantenimientomaquina_tminvstwwds_4_tfmisfch = AV24TFMISFch ;
      AV73Mantenimientomaquina_tminvstwwds_5_tfmisfchapl = AV34TFMISFchApl ;
      AV74Mantenimientomaquina_tminvstwwds_6_tfmisest_sels = AV32TFMISEst_Sels ;
      AV75Mantenimientomaquina_tminvstwwds_7_tfmisusucre = AV26TFMISUsuCre ;
      AV76Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel = AV27TFMISUsuCre_Sel ;
      AV77Mantenimientomaquina_tminvstwwds_9_tfmisfchcre = AV28TFMISFchCre ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9402MISEst ,
                                           AV74Mantenimientomaquina_tminvstwwds_6_tfmisest_sels ,
                                           Integer.valueOf(AV70Mantenimientomaquina_tminvstwwds_2_tfmiscod) ,
                                           Integer.valueOf(AV71Mantenimientomaquina_tminvstwwds_3_tfmiscod_to) ,
                                           AV72Mantenimientomaquina_tminvstwwds_4_tfmisfch ,
                                           AV73Mantenimientomaquina_tminvstwwds_5_tfmisfchapl ,
                                           Integer.valueOf(AV74Mantenimientomaquina_tminvstwwds_6_tfmisest_sels.size()) ,
                                           AV76Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel ,
                                           AV75Mantenimientomaquina_tminvstwwds_7_tfmisusucre ,
                                           AV77Mantenimientomaquina_tminvstwwds_9_tfmisfchcre ,
                                           Integer.valueOf(A9398MISCod) ,
                                           A9399MISFch ,
                                           A11303MISFchApl ,
                                           A9400MISUsuCre ,
                                           A9401MISFchCre ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV69Mantenimientomaquina_tminvstwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV75Mantenimientomaquina_tminvstwwds_7_tfmisusucre = GXutil.padr( GXutil.rtrim( AV75Mantenimientomaquina_tminvstwwds_7_tfmisusucre), 10, "%") ;
      /* Using cursor P08EK2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV70Mantenimientomaquina_tminvstwwds_2_tfmiscod), Integer.valueOf(AV71Mantenimientomaquina_tminvstwwds_3_tfmiscod_to), AV72Mantenimientomaquina_tminvstwwds_4_tfmisfch, AV73Mantenimientomaquina_tminvstwwds_5_tfmisfchapl, lV75Mantenimientomaquina_tminvstwwds_7_tfmisusucre, AV76Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel, AV77Mantenimientomaquina_tminvstwwds_9_tfmisfchcre});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9401MISFchCre = P08EK2_A9401MISFchCre[0] ;
         n9401MISFchCre = P08EK2_n9401MISFchCre[0] ;
         A9400MISUsuCre = P08EK2_A9400MISUsuCre[0] ;
         n9400MISUsuCre = P08EK2_n9400MISUsuCre[0] ;
         A11303MISFchApl = P08EK2_A11303MISFchApl[0] ;
         n11303MISFchApl = P08EK2_n11303MISFchApl[0] ;
         A9399MISFch = P08EK2_A9399MISFch[0] ;
         n9399MISFch = P08EK2_n9399MISFch[0] ;
         A9398MISCod = P08EK2_A9398MISCod[0] ;
         A9402MISEst = P08EK2_A9402MISEst[0] ;
         n9402MISEst = P08EK2_n9402MISEst[0] ;
         A396EmprCod = P08EK2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV69Mantenimientomaquina_tminvstwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9398MISCod, 8, 0) , GXutil.padr( "%" + AV69Mantenimientomaquina_tminvstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en ingreso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV69Mantenimientomaquina_tminvstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aplicado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV69Mantenimientomaquina_tminvstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV69Mantenimientomaquina_tminvstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9402MISEst, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9400MISUsuCre) , GXutil.padr( "%" + GXutil.upper( AV69Mantenimientomaquina_tminvstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV13MISEstDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A9402MISEst), "E") == 0 )
            {
               AV13MISEstDescription = httpContext.getMessage( "En ingreso", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A9402MISEst), "A") == 0 )
            {
               AV13MISEstDescription = httpContext.getMessage( "Aplicado", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A9402MISEst), "C") == 0 )
            {
               AV13MISEstDescription = httpContext.getMessage( "Cancelado", "") ;
            }
            /* Execute user subroutine: 'BEFOREPRINTLINE' */
            S144 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               if (true) return;
            }
            h8EK0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9398MISCod), "ZZZZZZZ9")), 30, Gx_line+10, 135, Gx_line+25, 2, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9399MISFch, "99/99/99"), 139, Gx_line+10, 244, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A11303MISFchApl, "99/99/99"), 248, Gx_line+10, 353, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13MISEstDescription, "")), 357, Gx_line+10, 567, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A9400MISUsuCre, "")), 571, Gx_line+10, 677, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( A9401MISFchCre, "99/99/99 99:99"), 681, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawLine(28, Gx_line+35, 789, Gx_line+35, 1, 220, 220, 220, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+36) ;
            /* Execute user subroutine: 'AFTERPRINTLINE' */
            S161 ();
            if ( returnInSub )
            {
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
      if ( GXutil.strcmp(AV14Session.getValue("MantenimientoMaquina.TMInvStWWGridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.TMInvStWWGridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV14Session.getValue("MantenimientoMaquina.TMInvStWWGridState"), null, null);
      }
      AV10OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV78GXV2 = 1 ;
      while ( AV78GXV2 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV78GXV2));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISCOD") == 0 )
         {
            AV22TFMISCod = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFMISCod_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISFCH") == 0 )
         {
            AV24TFMISFch = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISFCHAPL") == 0 )
         {
            AV34TFMISFchApl = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISEST_SEL") == 0 )
         {
            AV30TFMISEst_SelsJson = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV32TFMISEst_Sels.fromJSonString(AV30TFMISEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISUSUCRE") == 0 )
         {
            AV26TFMISUsuCre = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISUSUCRE_SEL") == 0 )
         {
            AV27TFMISUsuCre_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMISFCHCRE") == 0 )
         {
            AV28TFMISFchCre = localUtil.ctot( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV78GXV2 = (int)(AV78GXV2+1) ;
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

   public void h8EK0( boolean bFoot ,
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
               AV50PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV47DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV50PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV47DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV52Title = AV64Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV52Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV52Title = "" ;
      AV12FilterFullText = "" ;
      AV36TFMISCod_To_Description = "" ;
      AV24TFMISFch = GXutil.nullDate() ;
      AV34TFMISFchApl = GXutil.nullDate() ;
      AV32TFMISEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30TFMISEst_SelsJson = "" ;
      AV33TFMISEst_Sel = "" ;
      AV31TFMISEst_SelDscs = "" ;
      AV39FilterTFMISEst_SelValueDescription = "" ;
      AV27TFMISUsuCre_Sel = "" ;
      AV26TFMISUsuCre = "" ;
      AV28TFMISFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9402MISEst = "" ;
      A9399MISFch = GXutil.nullDate() ;
      A11303MISFchApl = GXutil.nullDate() ;
      A9400MISUsuCre = "" ;
      A9401MISFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV69Mantenimientomaquina_tminvstwwds_1_filterfulltext = "" ;
      AV72Mantenimientomaquina_tminvstwwds_4_tfmisfch = GXutil.nullDate() ;
      AV73Mantenimientomaquina_tminvstwwds_5_tfmisfchapl = GXutil.nullDate() ;
      AV74Mantenimientomaquina_tminvstwwds_6_tfmisest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV75Mantenimientomaquina_tminvstwwds_7_tfmisusucre = "" ;
      AV76Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel = "" ;
      AV77Mantenimientomaquina_tminvstwwds_9_tfmisfchcre = GXutil.resetTime( GXutil.nullDate() );
      lV69Mantenimientomaquina_tminvstwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV75Mantenimientomaquina_tminvstwwds_7_tfmisusucre = "" ;
      P08EK2_A9401MISFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      P08EK2_n9401MISFchCre = new boolean[] {false} ;
      P08EK2_A9400MISUsuCre = new String[] {""} ;
      P08EK2_n9400MISUsuCre = new boolean[] {false} ;
      P08EK2_A11303MISFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      P08EK2_n11303MISFchApl = new boolean[] {false} ;
      P08EK2_A9399MISFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08EK2_n9399MISFch = new boolean[] {false} ;
      P08EK2_A9398MISCod = new int[1] ;
      P08EK2_A9402MISEst = new String[] {""} ;
      P08EK2_n9402MISEst = new boolean[] {false} ;
      P08EK2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV13MISEstDescription = "" ;
      AV14Session = httpContext.getWebSession();
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV50PageInfo = "" ;
      AV47DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV64Pgmdesc = "" ;
      AV45AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tminvstwwexportreport__default(),
         new Object[] {
             new Object[] {
            P08EK2_A9401MISFchCre, P08EK2_n9401MISFchCre, P08EK2_A9400MISUsuCre, P08EK2_n9400MISUsuCre, P08EK2_A11303MISFchApl, P08EK2_n11303MISFchApl, P08EK2_A9399MISFch, P08EK2_n9399MISFch, P08EK2_A9398MISCod, P08EK2_A9402MISEst,
            P08EK2_n9402MISEst, P08EK2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV64Pgmdesc = httpContext.getMessage( "Lista de Inventarios de Stock", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV64Pgmdesc = httpContext.getMessage( "Lista de Inventarios de Stock", "") ;
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
   private int AV22TFMISCod ;
   private int AV23TFMISCod_To ;
   private int AV67GXV1 ;
   private int A9398MISCod ;
   private int AV70Mantenimientomaquina_tminvstwwds_2_tfmiscod ;
   private int AV71Mantenimientomaquina_tminvstwwds_3_tfmiscod_to ;
   private int AV74Mantenimientomaquina_tminvstwwds_6_tfmisest_sels_size ;
   private int AV78GXV2 ;
   private long AV41i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV33TFMISEst_Sel ;
   private String AV27TFMISUsuCre_Sel ;
   private String AV26TFMISUsuCre ;
   private String A9402MISEst ;
   private String A9400MISUsuCre ;
   private String AV75Mantenimientomaquina_tminvstwwds_7_tfmisusucre ;
   private String AV76Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel ;
   private String scmdbuf ;
   private String lV75Mantenimientomaquina_tminvstwwds_7_tfmisusucre ;
   private String A396EmprCod ;
   private String AV64Pgmdesc ;
   private java.util.Date AV28TFMISFchCre ;
   private java.util.Date A9401MISFchCre ;
   private java.util.Date AV77Mantenimientomaquina_tminvstwwds_9_tfmisfchcre ;
   private java.util.Date AV24TFMISFch ;
   private java.util.Date AV34TFMISFchApl ;
   private java.util.Date A9399MISFch ;
   private java.util.Date A11303MISFchApl ;
   private java.util.Date AV72Mantenimientomaquina_tminvstwwds_4_tfmisfch ;
   private java.util.Date AV73Mantenimientomaquina_tminvstwwds_5_tfmisfchapl ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n9401MISFchCre ;
   private boolean n9400MISUsuCre ;
   private boolean n11303MISFchApl ;
   private boolean n9399MISFch ;
   private boolean n9402MISEst ;
   private String AV30TFMISEst_SelsJson ;
   private String AV52Title ;
   private String AV12FilterFullText ;
   private String AV36TFMISCod_To_Description ;
   private String AV31TFMISEst_SelDscs ;
   private String AV39FilterTFMISEst_SelValueDescription ;
   private String AV69Mantenimientomaquina_tminvstwwds_1_filterfulltext ;
   private String lV69Mantenimientomaquina_tminvstwwds_1_filterfulltext ;
   private String AV13MISEstDescription ;
   private String AV50PageInfo ;
   private String AV47DateInfo ;
   private String AV45AppName ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08EK2_A9401MISFchCre ;
   private boolean[] P08EK2_n9401MISFchCre ;
   private String[] P08EK2_A9400MISUsuCre ;
   private boolean[] P08EK2_n9400MISUsuCre ;
   private java.util.Date[] P08EK2_A11303MISFchApl ;
   private boolean[] P08EK2_n11303MISFchApl ;
   private java.util.Date[] P08EK2_A9399MISFch ;
   private boolean[] P08EK2_n9399MISFch ;
   private int[] P08EK2_A9398MISCod ;
   private String[] P08EK2_A9402MISEst ;
   private boolean[] P08EK2_n9402MISEst ;
   private String[] P08EK2_A396EmprCod ;
   private GXSimpleCollection<String> AV32TFMISEst_Sels ;
   private GXSimpleCollection<String> AV74Mantenimientomaquina_tminvstwwds_6_tfmisest_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
}

final  class tminvstwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08EK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9402MISEst ,
                                          GXSimpleCollection<String> AV74Mantenimientomaquina_tminvstwwds_6_tfmisest_sels ,
                                          int AV70Mantenimientomaquina_tminvstwwds_2_tfmiscod ,
                                          int AV71Mantenimientomaquina_tminvstwwds_3_tfmiscod_to ,
                                          java.util.Date AV72Mantenimientomaquina_tminvstwwds_4_tfmisfch ,
                                          java.util.Date AV73Mantenimientomaquina_tminvstwwds_5_tfmisfchapl ,
                                          int AV74Mantenimientomaquina_tminvstwwds_6_tfmisest_sels_size ,
                                          String AV76Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel ,
                                          String AV75Mantenimientomaquina_tminvstwwds_7_tfmisusucre ,
                                          java.util.Date AV77Mantenimientomaquina_tminvstwwds_9_tfmisfchcre ,
                                          int A9398MISCod ,
                                          java.util.Date A9399MISFch ,
                                          java.util.Date A11303MISFchApl ,
                                          String A9400MISUsuCre ,
                                          java.util.Date A9401MISFchCre ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV69Mantenimientomaquina_tminvstwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[7];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MISFchCre, MISUsuCre, MISFchApl, MISFch, MISCod, MISEst, EmprCod FROM TXPMINVST" ;
      if ( ! (0==AV70Mantenimientomaquina_tminvstwwds_2_tfmiscod) )
      {
         addWhere(sWhereString, "(MISCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV71Mantenimientomaquina_tminvstwwds_3_tfmiscod_to) )
      {
         addWhere(sWhereString, "(MISCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Mantenimientomaquina_tminvstwwds_4_tfmisfch)) )
      {
         addWhere(sWhereString, "(MISFch >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73Mantenimientomaquina_tminvstwwds_5_tfmisfchapl)) )
      {
         addWhere(sWhereString, "(MISFchApl >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV74Mantenimientomaquina_tminvstwwds_6_tfmisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Mantenimientomaquina_tminvstwwds_6_tfmisest_sels, "MISEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV76Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel)==0) && ( ! (GXutil.strcmp("", AV75Mantenimientomaquina_tminvstwwds_7_tfmisusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MISUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Mantenimientomaquina_tminvstwwds_8_tfmisusucre_sel)==0) )
      {
         addWhere(sWhereString, "(MISUsuCre = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV77Mantenimientomaquina_tminvstwwds_9_tfmisfchcre) )
      {
         addWhere(sWhereString, "(MISFchCre >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MISCod" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MISCod DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MISFch" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MISFch DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MISFchApl" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MISFchApl DESC" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MISEst" ;
      }
      else if ( ( AV10OrderedBy == 4 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MISEst DESC" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MISUsuCre" ;
      }
      else if ( ( AV10OrderedBy == 5 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MISUsuCre DESC" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY MISFchCre" ;
      }
      else if ( ( AV10OrderedBy == 6 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MISFchCre DESC" ;
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
                  return conditional_P08EK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08EK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[13], false);
               }
               return;
      }
   }

}

