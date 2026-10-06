package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tinditexwwexportreport_impl extends GXWebReport
{
   public tinditexwwexportreport_impl( com.genexus.internet.HttpContext context )
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
         AV60Title = httpContext.getMessage( "Lista de Certificaciones", "") ;
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
         h7XH0( true, 0) ;
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
      if ( ! (GXutil.strcmp("", AV67FilterFullText)==0) )
      {
         h7XH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Filter", ""), 25, Gx_line+0, 97, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV67FilterFullText, "")), 97, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      if ( ! (GXutil.strcmp("", AV41TFCod_Idtx_Sel)==0) )
      {
         h7XH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Id Certificado", ""), 25, Gx_line+0, 97, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV41TFCod_Idtx_Sel, "")), 97, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV40TFCod_Idtx)==0) )
         {
            h7XH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Id Certificado", ""), 25, Gx_line+0, 97, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV40TFCod_Idtx, "")), 97, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV43TFDsc_Idtx_Sel)==0) )
      {
         h7XH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Certificado", ""), 25, Gx_line+0, 97, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV43TFDsc_Idtx_Sel, "")), 97, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV42TFDsc_Idtx)==0) )
         {
            h7XH0( false, 20) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(httpContext.getMessage( "Certificado", ""), 25, Gx_line+0, 97, Gx_line+15, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV42TFDsc_Idtx, "")), 97, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+20) ;
         }
      }
      AV46TFImp_Idtx_Sels.fromJSonString(AV44TFImp_Idtx_SelsJson, null);
      if ( ! ( AV46TFImp_Idtx_Sels.size() == 0 ) )
      {
         AV49i = 1 ;
         AV77GXV1 = 1 ;
         while ( AV77GXV1 <= AV46TFImp_Idtx_Sels.size() )
         {
            AV47TFImp_Idtx_Sel = (String)AV46TFImp_Idtx_Sels.elementAt(-1+AV77GXV1) ;
            if ( AV49i == 1 )
            {
               AV45TFImp_Idtx_SelDscs = "" ;
            }
            else
            {
               AV45TFImp_Idtx_SelDscs += ", " ;
            }
            AV48FilterTFImp_Idtx_SelValueDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( AV47TFImp_Idtx_Sel), "N") == 0 )
            {
               AV48FilterTFImp_Idtx_SelValueDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( AV47TFImp_Idtx_Sel), "S") == 0 )
            {
               AV48FilterTFImp_Idtx_SelValueDescription = httpContext.getMessage( "S", "") ;
            }
            AV45TFImp_Idtx_SelDscs += AV48FilterTFImp_Idtx_SelValueDescription ;
            AV49i = (long)(AV49i+1) ;
            AV77GXV1 = (int)(AV77GXV1+1) ;
         }
         h7XH0( false, 20) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 169, 169, 169, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(httpContext.getMessage( "Imprimir", ""), 25, Gx_line+0, 97, Gx_line+15, 0, 0, 0, 0) ;
         getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV45TFImp_Idtx_SelDscs, "")), 97, Gx_line+0, 789, Gx_line+15, 0, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+20) ;
      }
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTCOLUMNTITLES' Routine */
      returnInSub = false ;
      h7XH0( false, 22) ;
      getPrinter().GxDrawLine(25, Gx_line+21, 789, Gx_line+21, 2, 149, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+22) ;
      h7XH0( false, 37) ;
      getPrinter().GxAttris("Microsoft Sans Serif", 9, false, false, false, false, 0, 149, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Id Certificado", ""), 30, Gx_line+10, 179, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Certificado", ""), 183, Gx_line+10, 483, Gx_line+27, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(httpContext.getMessage( "Imprimir", ""), 487, Gx_line+10, 787, Gx_line+27, 0, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+37) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      returnInSub = false ;
      AV79Ficherosbasicos_tinditexwwds_1_filterfulltext = AV67FilterFullText ;
      AV80Ficherosbasicos_tinditexwwds_2_tfcod_idtx = AV40TFCod_Idtx ;
      AV81Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel = AV41TFCod_Idtx_Sel ;
      AV82Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = AV42TFDsc_Idtx ;
      AV83Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel = AV43TFDsc_Idtx_Sel ;
      AV84Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels = AV46TFImp_Idtx_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A12703Imp_Idtx ,
                                           AV84Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels ,
                                           AV81Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel ,
                                           AV80Ficherosbasicos_tinditexwwds_2_tfcod_idtx ,
                                           AV83Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel ,
                                           AV82Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ,
                                           Integer.valueOf(AV84Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels.size()) ,
                                           A10887Cod_Idtx ,
                                           A10888Dsc_Idtx ,
                                           Short.valueOf(AV10OrderedBy) ,
                                           Boolean.valueOf(AV11OrderedDsc) ,
                                           AV79Ficherosbasicos_tinditexwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV80Ficherosbasicos_tinditexwwds_2_tfcod_idtx = GXutil.padr( GXutil.rtrim( AV80Ficherosbasicos_tinditexwwds_2_tfcod_idtx), 4, "%") ;
      lV82Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = GXutil.padr( GXutil.rtrim( AV82Ficherosbasicos_tinditexwwds_4_tfdsc_idtx), 60, "%") ;
      /* Using cursor P07XH2 */
      pr_default.execute(0, new Object[] {lV80Ficherosbasicos_tinditexwwds_2_tfcod_idtx, AV81Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel, lV82Ficherosbasicos_tinditexwwds_4_tfdsc_idtx, AV83Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10888Dsc_Idtx = P07XH2_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = P07XH2_n10888Dsc_Idtx[0] ;
         A10887Cod_Idtx = P07XH2_A10887Cod_Idtx[0] ;
         A12703Imp_Idtx = P07XH2_A12703Imp_Idtx[0] ;
         n12703Imp_Idtx = P07XH2_n12703Imp_Idtx[0] ;
         A396EmprCod = P07XH2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV79Ficherosbasicos_tinditexwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A10887Cod_Idtx) , GXutil.padr( "%" + GXutil.upper( AV79Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A10888Dsc_Idtx) , GXutil.padr( "%" + GXutil.upper( AV79Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV79Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV79Ficherosbasicos_tinditexwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A12703Imp_Idtx, httpContext.getMessage( "S", "")) == 0 ) ) ) )
         {
            AV12Imp_IdtxDescription = "" ;
            if ( GXutil.strcmp(GXutil.trim( A12703Imp_Idtx), "N") == 0 )
            {
               AV12Imp_IdtxDescription = httpContext.getMessage( "N", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A12703Imp_Idtx), "S") == 0 )
            {
               AV12Imp_IdtxDescription = httpContext.getMessage( "S", "") ;
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
            h7XH0( false, 36) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10887Cod_Idtx, "")), 30, Gx_line+10, 179, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( A10888Dsc_Idtx, "")), 183, Gx_line+10, 483, Gx_line+25, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12Imp_IdtxDescription, "")), 487, Gx_line+10, 787, Gx_line+25, 0, 0, 0, 0) ;
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
      if ( GXutil.strcmp(AV32Session.getValue("FicherosBasicos.TINDITEXWWGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TINDITEXWWGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV32Session.getValue("FicherosBasicos.TINDITEXWWGridState"), null, null);
      }
      AV10OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV11OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV85GXV2 = 1 ;
      while ( AV85GXV2 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV85GXV2));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV67FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOD_IDTX") == 0 )
         {
            AV40TFCod_Idtx = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOD_IDTX_SEL") == 0 )
         {
            AV41TFCod_Idtx_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSC_IDTX") == 0 )
         {
            AV42TFDsc_Idtx = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSC_IDTX_SEL") == 0 )
         {
            AV43TFDsc_Idtx_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIMP_IDTX_SEL") == 0 )
         {
            AV44TFImp_Idtx_SelsJson = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV46TFImp_Idtx_Sels.fromJSonString(AV44TFImp_Idtx_SelsJson, null);
         }
         AV85GXV2 = (int)(AV85GXV2+1) ;
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

   public void h7XH0( boolean bFoot ,
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
               AV58PageInfo = httpContext.getMessage( "Page: ", "") + GXutil.trim( GXutil.str( Gx_page, 6, 0)) ;
               AV55DateInfo = httpContext.getMessage( "Date: ", "") + localUtil.format( Gx_date, "99/99/99") ;
               getPrinter().GxDrawRect(0, Gx_line+5, 819, Gx_line+40, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV58PageInfo, "")), 30, Gx_line+15, 409, Gx_line+30, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV55DateInfo, "")), 409, Gx_line+15, 789, Gx_line+30, 2, 0, 0, 0) ;
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
            AV60Title = AV74Pgmdesc ;
            getPrinter().GxDrawRect(0, Gx_line+0, 819, Gx_line+108, 1, 0, 0, 0, 1, 149, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 8, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV53AppName, "")), 30, Gx_line+30, 789, Gx_line+45, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Microsoft Sans Serif", 20, false, false, false, false, 0, 255, 255, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV60Title, "")), 30, Gx_line+45, 789, Gx_line+78, 0, 0, 0, 0) ;
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
      AV60Title = "" ;
      AV67FilterFullText = "" ;
      AV41TFCod_Idtx_Sel = "" ;
      AV40TFCod_Idtx = "" ;
      AV43TFDsc_Idtx_Sel = "" ;
      AV42TFDsc_Idtx = "" ;
      AV46TFImp_Idtx_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44TFImp_Idtx_SelsJson = "" ;
      AV47TFImp_Idtx_Sel = "" ;
      AV45TFImp_Idtx_SelDscs = "" ;
      AV48FilterTFImp_Idtx_SelValueDescription = "" ;
      A12703Imp_Idtx = "" ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      AV79Ficherosbasicos_tinditexwwds_1_filterfulltext = "" ;
      AV80Ficherosbasicos_tinditexwwds_2_tfcod_idtx = "" ;
      AV81Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel = "" ;
      AV82Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = "" ;
      AV83Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel = "" ;
      AV84Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV80Ficherosbasicos_tinditexwwds_2_tfcod_idtx = "" ;
      lV82Ficherosbasicos_tinditexwwds_4_tfdsc_idtx = "" ;
      P07XH2_A10888Dsc_Idtx = new String[] {""} ;
      P07XH2_n10888Dsc_Idtx = new boolean[] {false} ;
      P07XH2_A10887Cod_Idtx = new String[] {""} ;
      P07XH2_A12703Imp_Idtx = new String[] {""} ;
      P07XH2_n12703Imp_Idtx = new boolean[] {false} ;
      P07XH2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV12Imp_IdtxDescription = "" ;
      AV32Session = httpContext.getWebSession();
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV58PageInfo = "" ;
      AV55DateInfo = "" ;
      Gx_date = GXutil.nullDate() ;
      AV74Pgmdesc = "" ;
      AV53AppName = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tinditexwwexportreport__default(),
         new Object[] {
             new Object[] {
            P07XH2_A10888Dsc_Idtx, P07XH2_n10888Dsc_Idtx, P07XH2_A10887Cod_Idtx, P07XH2_A12703Imp_Idtx, P07XH2_n12703Imp_Idtx, P07XH2_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV74Pgmdesc = httpContext.getMessage( "Listado Clear to Wear", "") ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_date = GXutil.today( ) ;
      AV74Pgmdesc = httpContext.getMessage( "Listado Clear to Wear", "") ;
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
   private int AV77GXV1 ;
   private int AV84Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels_size ;
   private int AV85GXV2 ;
   private long AV49i ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV41TFCod_Idtx_Sel ;
   private String AV40TFCod_Idtx ;
   private String AV43TFDsc_Idtx_Sel ;
   private String AV42TFDsc_Idtx ;
   private String AV47TFImp_Idtx_Sel ;
   private String A12703Imp_Idtx ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String AV80Ficherosbasicos_tinditexwwds_2_tfcod_idtx ;
   private String AV81Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel ;
   private String AV82Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ;
   private String AV83Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel ;
   private String scmdbuf ;
   private String lV80Ficherosbasicos_tinditexwwds_2_tfcod_idtx ;
   private String lV82Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ;
   private String A396EmprCod ;
   private String AV74Pgmdesc ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV11OrderedDsc ;
   private boolean n10888Dsc_Idtx ;
   private boolean n12703Imp_Idtx ;
   private String AV44TFImp_Idtx_SelsJson ;
   private String AV60Title ;
   private String AV67FilterFullText ;
   private String AV45TFImp_Idtx_SelDscs ;
   private String AV48FilterTFImp_Idtx_SelValueDescription ;
   private String AV79Ficherosbasicos_tinditexwwds_1_filterfulltext ;
   private String AV12Imp_IdtxDescription ;
   private String AV58PageInfo ;
   private String AV55DateInfo ;
   private String AV53AppName ;
   private com.genexus.webpanels.WebSession AV32Session ;
   private IDataStoreProvider pr_default ;
   private String[] P07XH2_A10888Dsc_Idtx ;
   private boolean[] P07XH2_n10888Dsc_Idtx ;
   private String[] P07XH2_A10887Cod_Idtx ;
   private String[] P07XH2_A12703Imp_Idtx ;
   private boolean[] P07XH2_n12703Imp_Idtx ;
   private String[] P07XH2_A396EmprCod ;
   private GXSimpleCollection<String> AV46TFImp_Idtx_Sels ;
   private GXSimpleCollection<String> AV84Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class tinditexwwexportreport__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07XH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A12703Imp_Idtx ,
                                          GXSimpleCollection<String> AV84Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels ,
                                          String AV81Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel ,
                                          String AV80Ficherosbasicos_tinditexwwds_2_tfcod_idtx ,
                                          String AV83Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel ,
                                          String AV82Ficherosbasicos_tinditexwwds_4_tfdsc_idtx ,
                                          int AV84Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels_size ,
                                          String A10887Cod_Idtx ,
                                          String A10888Dsc_Idtx ,
                                          short AV10OrderedBy ,
                                          boolean AV11OrderedDsc ,
                                          String AV79Ficherosbasicos_tinditexwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[4];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Dsc_Idtx, Cod_Idtx, Imp_Idtx, EmprCod FROM TXPINDITE" ;
      if ( (GXutil.strcmp("", AV81Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel)==0) && ( ! (GXutil.strcmp("", AV80Ficherosbasicos_tinditexwwds_2_tfcod_idtx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Cod_Idtx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Ficherosbasicos_tinditexwwds_3_tfcod_idtx_sel)==0) )
      {
         addWhere(sWhereString, "(Cod_Idtx = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel)==0) && ( ! (GXutil.strcmp("", AV82Ficherosbasicos_tinditexwwds_4_tfdsc_idtx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Dsc_Idtx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Ficherosbasicos_tinditexwwds_5_tfdsc_idtx_sel)==0) )
      {
         addWhere(sWhereString, "(Dsc_Idtx = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV84Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Ficherosbasicos_tinditexwwds_6_tfimp_idtx_sels, "Imp_Idtx IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV10OrderedBy == 1 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Dsc_Idtx" ;
      }
      else if ( ( AV10OrderedBy == 1 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Dsc_Idtx DESC" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Cod_Idtx" ;
      }
      else if ( ( AV10OrderedBy == 2 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Cod_Idtx DESC" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ! AV11OrderedDsc )
      {
         scmdbuf += " ORDER BY Imp_Idtx" ;
      }
      else if ( ( AV10OrderedBy == 3 ) && ( AV11OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Imp_Idtx DESC" ;
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
                  return conditional_P07XH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07XH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 4);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
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
                  stmt.setString(sIdx, (String)parms[4], 4);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 4);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 60);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 60);
               }
               return;
      }
   }

}

