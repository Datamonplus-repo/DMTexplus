package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidad_ccseriwwexportcsv_impl extends GXWebProcedure
{
   public controlcalidad_ccseriwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S191 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "./PrivateTempStorage/" + "ControlCalidad_CCSeriWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV11Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      if ( GXutil.strcmp(AV19Session.getValue("ControlCalidadHTD.ControlCalidad_CCSeriWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ControlCalidadHTD.ControlCalidad_CCSeriWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = AV30FilterFullText ;
      AV50Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod = AV34TFCliCod ;
      AV51Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to = AV35TFCliCod_To ;
      AV52Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = AV36TFCliNom ;
      AV53Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel = AV37TFCliNom_Sel ;
      AV54Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = AV38TFArtCod ;
      AV55Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel = AV39TFArtCod_Sel ;
      AV56Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = AV40TFArtDsc ;
      AV57Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel = AV41TFArtDsc_Sel ;
      AV58Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = AV42TFCCFColNom ;
      AV59Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel = AV43TFCCFColNom_Sel ;
      AV60Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum = AV44TFCCFColNum ;
      AV61Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to = AV45TFCCFColNum_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ,
                                           Integer.valueOf(AV50Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod) ,
                                           Integer.valueOf(AV51Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to) ,
                                           AV53Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel ,
                                           AV52Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ,
                                           AV55Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel ,
                                           AV54Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ,
                                           AV57Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel ,
                                           AV56Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ,
                                           AV59Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel ,
                                           AV58Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ,
                                           Integer.valueOf(AV60Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum) ,
                                           Integer.valueOf(AV61Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A65ArtCod ,
                                           A69ArtDsc ,
                                           A4058CCFColNom ,
                                           Integer.valueOf(A4059CCFColNum) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext), "%", "") ;
      lV52Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV52Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom), 30, "%") ;
      lV54Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = GXutil.padr( GXutil.rtrim( AV54Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod), 16, "%") ;
      lV56Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = GXutil.padr( GXutil.rtrim( AV56Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc), 26, "%") ;
      lV58Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = GXutil.padr( GXutil.rtrim( AV58Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom), 13, "%") ;
      /* Using cursor P0AOK2 */
      pr_default.execute(0, new Object[] {lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext, Integer.valueOf(AV50Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod), Integer.valueOf(AV51Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to), lV52Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom, AV53Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel, lV54Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod, AV55Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel, lV56Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc, AV57Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel, lV58Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom, AV59Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel, Integer.valueOf(AV60Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum), Integer.valueOf(AV61Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AOK2_A396EmprCod[0] ;
         A4059CCFColNum = P0AOK2_A4059CCFColNum[0] ;
         A4058CCFColNom = P0AOK2_A4058CCFColNom[0] ;
         A69ArtDsc = P0AOK2_A69ArtDsc[0] ;
         n69ArtDsc = P0AOK2_n69ArtDsc[0] ;
         A65ArtCod = P0AOK2_A65ArtCod[0] ;
         A279CliNom = P0AOK2_A279CliNom[0] ;
         A252CliCod = P0AOK2_A252CliCod[0] ;
         A279CliNom = P0AOK2_A279CliNom[0] ;
         A69ArtDsc = P0AOK2_A69ArtDsc[0] ;
         n69ArtDsc = P0AOK2_n69ArtDsc[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            controlcalidad_ccseriwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A65ArtCod, ";", ","), GXv_char3) ;
            controlcalidad_ccseriwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A69ArtDsc, ";", ","), GXv_char3) ;
            controlcalidad_ccseriwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4058CCFColNom, ";", ","), GXv_char3) ;
            controlcalidad_ccseriwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4059CCFColNum, 6, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ControlCalidad_CCSeriWWExportCSV.csv");
         }
         AV27HttpResponse.addFile(AV10TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV27HttpResponse.addString(AV12ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtCod", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ArtDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCFColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CCFColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ControlCalidadHTD.ControlCalidad_CCSeriWWColumnsSelector", GXv_char3) ;
      controlcalidad_ccseriwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ControlCalidadHTD.ControlCalidad_CCSeriWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlCalidadHTD.ControlCalidad_CCSeriWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("ControlCalidadHTD.ControlCalidad_CCSeriWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV62GXV1 = 1 ;
      while ( AV62GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV62GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV34TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV36TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV37TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD") == 0 )
         {
            AV38TFArtCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTCOD_SEL") == 0 )
         {
            AV39TFArtCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC") == 0 )
         {
            AV40TFArtDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFARTDSC_SEL") == 0 )
         {
            AV41TFArtDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCFCOLNOM") == 0 )
         {
            AV42TFCCFColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCFCOLNOM_SEL") == 0 )
         {
            AV43TFCCFColNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCFCOLNUM") == 0 )
         {
            AV44TFCCFColNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFCCFColNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV62GXV1 = (int)(AV62GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
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
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A279CliNom = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      A4058CCFColNom = "" ;
      AV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV52Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = "" ;
      AV36TFCliNom = "" ;
      AV53Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel = "" ;
      AV37TFCliNom_Sel = "" ;
      AV54Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = "" ;
      AV38TFArtCod = "" ;
      AV55Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel = "" ;
      AV39TFArtCod_Sel = "" ;
      AV56Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = "" ;
      AV40TFArtDsc = "" ;
      AV57Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel = "" ;
      AV41TFArtDsc_Sel = "" ;
      AV58Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = "" ;
      AV42TFCCFColNom = "" ;
      AV59Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel = "" ;
      AV43TFCCFColNom_Sel = "" ;
      scmdbuf = "" ;
      lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext = "" ;
      lV52Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom = "" ;
      lV54Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod = "" ;
      lV56Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc = "" ;
      lV58Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom = "" ;
      P0AOK2_A396EmprCod = new String[] {""} ;
      P0AOK2_A4059CCFColNum = new int[1] ;
      P0AOK2_A4058CCFColNom = new String[] {""} ;
      P0AOK2_A69ArtDsc = new String[] {""} ;
      P0AOK2_n69ArtDsc = new boolean[] {false} ;
      P0AOK2_A65ArtCod = new String[] {""} ;
      P0AOK2_A279CliNom = new String[] {""} ;
      P0AOK2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccseriwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P0AOK2_A396EmprCod, P0AOK2_A4059CCFColNum, P0AOK2_A4058CCFColNom, P0AOK2_A69ArtDsc, P0AOK2_n69ArtDsc, P0AOK2_A65ArtCod, P0AOK2_A279CliNom, P0AOK2_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int AV50Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod ;
   private int AV34TFCliCod ;
   private int AV51Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to ;
   private int AV35TFCliCod_To ;
   private int AV60Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum ;
   private int AV44TFCCFColNum ;
   private int AV61Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to ;
   private int AV45TFCCFColNum_To ;
   private int AV62GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String A4058CCFColNom ;
   private String AV52Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ;
   private String AV36TFCliNom ;
   private String AV53Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel ;
   private String AV37TFCliNom_Sel ;
   private String AV54Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ;
   private String AV38TFArtCod ;
   private String AV55Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel ;
   private String AV39TFArtCod_Sel ;
   private String AV56Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ;
   private String AV40TFArtDsc ;
   private String AV57Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel ;
   private String AV41TFArtDsc_Sel ;
   private String AV58Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ;
   private String AV42TFCCFColNom ;
   private String AV59Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel ;
   private String AV43TFCCFColNom_Sel ;
   private String scmdbuf ;
   private String lV52Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ;
   private String lV54Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ;
   private String lV56Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ;
   private String lV58Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n69ArtDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P0AOK2_A396EmprCod ;
   private int[] P0AOK2_A4059CCFColNum ;
   private String[] P0AOK2_A4058CCFColNom ;
   private String[] P0AOK2_A69ArtDsc ;
   private boolean[] P0AOK2_n69ArtDsc ;
   private String[] P0AOK2_A65ArtCod ;
   private String[] P0AOK2_A279CliNom ;
   private int[] P0AOK2_A252CliCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class controlcalidad_ccseriwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AOK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext ,
                                          int AV50Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod ,
                                          int AV51Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to ,
                                          String AV53Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel ,
                                          String AV52Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom ,
                                          String AV55Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel ,
                                          String AV54Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod ,
                                          String AV57Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel ,
                                          String AV56Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc ,
                                          String AV59Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel ,
                                          String AV58Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom ,
                                          int AV60Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum ,
                                          int AV61Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A65ArtCod ,
                                          String A69ArtDsc ,
                                          String A4058CCFColNom ,
                                          int A4059CCFColNum ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CCFColNum, T1.CCFColNom, T3.ArtDsc, T1.ArtCod, T2.CliNom, T1.CliCod FROM ((TXPCCSeri T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod) INNER JOIN TXPARTICU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ArtCod = T1.ArtCod)" ;
      if ( ! (GXutil.strcmp("", AV49Controlcalidadhtd_controlcalidad_ccseriwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ArtCod) like '%' || UPPER(?)) or ( UPPER(T3.ArtDsc) like '%' || UPPER(?)) or ( UPPER(T1.CCFColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCFColNum,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV50Controlcalidadhtd_controlcalidad_ccseriwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV51Controlcalidadhtd_controlcalidad_ccseriwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV52Controlcalidadhtd_controlcalidad_ccseriwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Controlcalidadhtd_controlcalidad_ccseriwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Controlcalidadhtd_controlcalidad_ccseriwwds_6_tfartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Controlcalidadhtd_controlcalidad_ccseriwwds_7_tfartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ArtCod = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Controlcalidadhtd_controlcalidad_ccseriwwds_8_tfartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Controlcalidadhtd_controlcalidad_ccseriwwds_9_tfartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ArtDsc = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV58Controlcalidadhtd_controlcalidad_ccseriwwds_10_tfccfcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCFColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Controlcalidadhtd_controlcalidad_ccseriwwds_11_tfccfcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCFColNom = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV60Controlcalidadhtd_controlcalidad_ccseriwwds_12_tfccfcolnum) )
      {
         addWhere(sWhereString, "(T1.CCFColNum >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV61Controlcalidadhtd_controlcalidad_ccseriwwds_13_tfccfcolnum_to) )
      {
         addWhere(sWhereString, "(T1.CCFColNum <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCFColNum" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCFColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ArtCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ArtCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CCFColNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CCFColNom DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P0AOK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AOK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((int[]) buf[7])[0] = rslt.getInt(7);
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
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               return;
      }
   }

}

