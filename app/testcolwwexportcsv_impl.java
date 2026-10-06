package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class testcolwwexportcsv_impl extends GXWebProcedure
{
   public testcolwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TEstColWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TEstColWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TEstColWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Estampación", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Resaltado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "RGB", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV55Testcolwwds_1_filterfulltext = AV30FilterFullText ;
      AV56Testcolwwds_2_tfclicod = AV38TFCliCod ;
      AV57Testcolwwds_3_tfclicod_to = AV39TFCliCod_To ;
      AV58Testcolwwds_4_tfclinom = AV40TFCliNom ;
      AV59Testcolwwds_5_tfclinom_sel = AV41TFCliNom_Sel ;
      AV60Testcolwwds_6_tfestcol = AV42TFEstCol ;
      AV61Testcolwwds_7_tfestcol_sel = AV43TFEstCol_Sel ;
      AV62Testcolwwds_8_tfestcoldsc = AV44TFEstColDsc ;
      AV63Testcolwwds_9_tfestcoldsc_sel = AV45TFEstColDsc_Sel ;
      AV64Testcolwwds_10_tfestcolbck_sels = AV49TFEstColBck_Sels ;
      AV65Testcolwwds_11_tfestcolrgb = AV50TFEstColRGB ;
      AV66Testcolwwds_12_tfestcolrgb_to = AV51TFEstColRGB_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A11685EstColBck ,
                                           AV64Testcolwwds_10_tfestcolbck_sels ,
                                           Integer.valueOf(AV56Testcolwwds_2_tfclicod) ,
                                           Integer.valueOf(AV57Testcolwwds_3_tfclicod_to) ,
                                           AV59Testcolwwds_5_tfclinom_sel ,
                                           AV58Testcolwwds_4_tfclinom ,
                                           AV61Testcolwwds_7_tfestcol_sel ,
                                           AV60Testcolwwds_6_tfestcol ,
                                           AV63Testcolwwds_9_tfestcoldsc_sel ,
                                           AV62Testcolwwds_8_tfestcoldsc ,
                                           Integer.valueOf(AV64Testcolwwds_10_tfestcolbck_sels.size()) ,
                                           Long.valueOf(AV65Testcolwwds_11_tfestcolrgb) ,
                                           Long.valueOf(AV66Testcolwwds_12_tfestcolrgb_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A4415EstCol ,
                                           A6848EstColDsc ,
                                           Long.valueOf(A12712EstColRGB) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV55Testcolwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV58Testcolwwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV58Testcolwwds_4_tfclinom), 30, "%") ;
      lV60Testcolwwds_6_tfestcol = GXutil.padr( GXutil.rtrim( AV60Testcolwwds_6_tfestcol), 20, "%") ;
      lV62Testcolwwds_8_tfestcoldsc = GXutil.padr( GXutil.rtrim( AV62Testcolwwds_8_tfestcoldsc), 30, "%") ;
      /* Using cursor P08WV2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV56Testcolwwds_2_tfclicod), Integer.valueOf(AV57Testcolwwds_3_tfclicod_to), lV58Testcolwwds_4_tfclinom, AV59Testcolwwds_5_tfclinom_sel, lV60Testcolwwds_6_tfestcol, AV61Testcolwwds_7_tfestcol_sel, lV62Testcolwwds_8_tfestcoldsc, AV63Testcolwwds_9_tfestcoldsc_sel, Long.valueOf(AV65Testcolwwds_11_tfestcolrgb), Long.valueOf(AV66Testcolwwds_12_tfestcolrgb_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08WV2_A396EmprCod[0] ;
         A12712EstColRGB = P08WV2_A12712EstColRGB[0] ;
         n12712EstColRGB = P08WV2_n12712EstColRGB[0] ;
         A6848EstColDsc = P08WV2_A6848EstColDsc[0] ;
         n6848EstColDsc = P08WV2_n6848EstColDsc[0] ;
         A4415EstCol = P08WV2_A4415EstCol[0] ;
         A279CliNom = P08WV2_A279CliNom[0] ;
         A252CliCod = P08WV2_A252CliCod[0] ;
         A11685EstColBck = P08WV2_A11685EstColBck[0] ;
         n11685EstColBck = P08WV2_n11685EstColBck[0] ;
         A279CliNom = P08WV2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV55Testcolwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV55Testcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV55Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4415EstCol) , GXutil.padr( "%" + GXutil.upper( AV55Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6848EstColDsc) , GXutil.padr( "%" + GXutil.upper( AV55Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "blanco", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "WHT", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "rojo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "RED", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "verde", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "GRN", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "azul", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "BLU", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "amarillo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "YLW", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "negro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV55Testcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11685EstColBck, httpContext.getMessage( "BLK", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A12712EstColRGB, 10, 0) , GXutil.padr( "%" + AV55Testcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV14TextFileLine = "" ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S162 ();
            if ( returnInSub )
            {
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
               testcolwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4415EstCol, ";", ","), GXv_char3) ;
               testcolwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6848EstColDsc, ";", ","), GXv_char3) ;
               testcolwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A11685EstColBck), "WHT") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Blanco", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A11685EstColBck), "RED") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Rojo", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A11685EstColBck), "GRN") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Verde", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A11685EstColBck), "BLU") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Azul", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A11685EstColBck), "YLW") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Amarillo", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A11685EstColBck), "BLK") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Negro", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A12712EstColRGB, 10, 0) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            if ( GXutil.len( AV14TextFileLine) > 0 )
            {
               AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
            }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TEstColWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstCol", "", "Color", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstColDsc", "", "Color Estampación", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstColBck", "", "Resaltado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstColRGB", "", "RGB", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TEstColWWColumnsSelector", GXv_char3) ;
      testcolwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TEstColWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TEstColWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("TEstColWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOL") == 0 )
         {
            AV42TFEstCol = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOL_SEL") == 0 )
         {
            AV43TFEstCol_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLDSC") == 0 )
         {
            AV44TFEstColDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLDSC_SEL") == 0 )
         {
            AV45TFEstColDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLBCK_SEL") == 0 )
         {
            AV48TFEstColBck_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV49TFEstColBck_Sels.fromJSonString(AV48TFEstColBck_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTCOLRGB") == 0 )
         {
            AV50TFEstColRGB = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV51TFEstColRGB_To = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
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
      A4415EstCol = "" ;
      A6848EstColDsc = "" ;
      A11685EstColBck = "" ;
      AV55Testcolwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV58Testcolwwds_4_tfclinom = "" ;
      AV40TFCliNom = "" ;
      AV59Testcolwwds_5_tfclinom_sel = "" ;
      AV41TFCliNom_Sel = "" ;
      AV60Testcolwwds_6_tfestcol = "" ;
      AV42TFEstCol = "" ;
      AV61Testcolwwds_7_tfestcol_sel = "" ;
      AV43TFEstCol_Sel = "" ;
      AV62Testcolwwds_8_tfestcoldsc = "" ;
      AV44TFEstColDsc = "" ;
      AV63Testcolwwds_9_tfestcoldsc_sel = "" ;
      AV45TFEstColDsc_Sel = "" ;
      AV64Testcolwwds_10_tfestcolbck_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV49TFEstColBck_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      lV55Testcolwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV58Testcolwwds_4_tfclinom = "" ;
      lV60Testcolwwds_6_tfestcol = "" ;
      lV62Testcolwwds_8_tfestcoldsc = "" ;
      P08WV2_A396EmprCod = new String[] {""} ;
      P08WV2_A12712EstColRGB = new long[1] ;
      P08WV2_n12712EstColRGB = new boolean[] {false} ;
      P08WV2_A6848EstColDsc = new String[] {""} ;
      P08WV2_n6848EstColDsc = new boolean[] {false} ;
      P08WV2_A4415EstCol = new String[] {""} ;
      P08WV2_A279CliNom = new String[] {""} ;
      P08WV2_A252CliCod = new int[1] ;
      P08WV2_A11685EstColBck = new String[] {""} ;
      P08WV2_n11685EstColBck = new boolean[] {false} ;
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
      AV48TFEstColBck_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.testcolwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08WV2_A396EmprCod, P08WV2_A12712EstColRGB, P08WV2_n12712EstColRGB, P08WV2_A6848EstColDsc, P08WV2_n6848EstColDsc, P08WV2_A4415EstCol, P08WV2_A279CliNom, P08WV2_A252CliCod, P08WV2_A11685EstColBck, P08WV2_n11685EstColBck
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
   private int AV56Testcolwwds_2_tfclicod ;
   private int AV38TFCliCod ;
   private int AV57Testcolwwds_3_tfclicod_to ;
   private int AV39TFCliCod_To ;
   private int AV64Testcolwwds_10_tfestcolbck_sels_size ;
   private int AV67GXV1 ;
   private long A12712EstColRGB ;
   private long AV65Testcolwwds_11_tfestcolrgb ;
   private long AV50TFEstColRGB ;
   private long AV66Testcolwwds_12_tfestcolrgb_to ;
   private long AV51TFEstColRGB_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A4415EstCol ;
   private String A6848EstColDsc ;
   private String A11685EstColBck ;
   private String AV58Testcolwwds_4_tfclinom ;
   private String AV40TFCliNom ;
   private String AV59Testcolwwds_5_tfclinom_sel ;
   private String AV41TFCliNom_Sel ;
   private String AV60Testcolwwds_6_tfestcol ;
   private String AV42TFEstCol ;
   private String AV61Testcolwwds_7_tfestcol_sel ;
   private String AV43TFEstCol_Sel ;
   private String AV62Testcolwwds_8_tfestcoldsc ;
   private String AV44TFEstColDsc ;
   private String AV63Testcolwwds_9_tfestcoldsc_sel ;
   private String AV45TFEstColDsc_Sel ;
   private String scmdbuf ;
   private String lV58Testcolwwds_4_tfclinom ;
   private String lV60Testcolwwds_6_tfestcol ;
   private String lV62Testcolwwds_8_tfestcoldsc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n12712EstColRGB ;
   private boolean n6848EstColDsc ;
   private boolean n11685EstColBck ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV48TFEstColBck_SelsJson ;
   private String AV11Filename ;
   private String AV55Testcolwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV55Testcolwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08WV2_A396EmprCod ;
   private long[] P08WV2_A12712EstColRGB ;
   private boolean[] P08WV2_n12712EstColRGB ;
   private String[] P08WV2_A6848EstColDsc ;
   private boolean[] P08WV2_n6848EstColDsc ;
   private String[] P08WV2_A4415EstCol ;
   private String[] P08WV2_A279CliNom ;
   private int[] P08WV2_A252CliCod ;
   private String[] P08WV2_A11685EstColBck ;
   private boolean[] P08WV2_n11685EstColBck ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV64Testcolwwds_10_tfestcolbck_sels ;
   private GXSimpleCollection<String> AV49TFEstColBck_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class testcolwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08WV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A11685EstColBck ,
                                          GXSimpleCollection<String> AV64Testcolwwds_10_tfestcolbck_sels ,
                                          int AV56Testcolwwds_2_tfclicod ,
                                          int AV57Testcolwwds_3_tfclicod_to ,
                                          String AV59Testcolwwds_5_tfclinom_sel ,
                                          String AV58Testcolwwds_4_tfclinom ,
                                          String AV61Testcolwwds_7_tfestcol_sel ,
                                          String AV60Testcolwwds_6_tfestcol ,
                                          String AV63Testcolwwds_9_tfestcoldsc_sel ,
                                          String AV62Testcolwwds_8_tfestcoldsc ,
                                          int AV64Testcolwwds_10_tfestcolbck_sels_size ,
                                          long AV65Testcolwwds_11_tfestcolrgb ,
                                          long AV66Testcolwwds_12_tfestcolrgb_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A4415EstCol ,
                                          String A6848EstColDsc ,
                                          long A12712EstColRGB ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV55Testcolwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[10];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.EstColRGB, T1.EstColDsc, T1.EstCol, T2.CliNom, T1.CliCod, T1.EstColBck FROM (TXPCEstCo T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      if ( ! (0==AV56Testcolwwds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV57Testcolwwds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Testcolwwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV58Testcolwwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Testcolwwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Testcolwwds_7_tfestcol_sel)==0) && ( ! (GXutil.strcmp("", AV60Testcolwwds_6_tfestcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Testcolwwds_7_tfestcol_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstCol = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Testcolwwds_9_tfestcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV62Testcolwwds_8_tfestcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EstColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Testcolwwds_9_tfestcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EstColDsc = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( AV64Testcolwwds_10_tfestcolbck_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV64Testcolwwds_10_tfestcolbck_sels, "T1.EstColBck IN (", ")")+")");
      }
      if ( ! (0==AV65Testcolwwds_11_tfestcolrgb) )
      {
         addWhere(sWhereString, "(T1.EstColRGB >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV66Testcolwwds_12_tfestcolrgb_to) )
      {
         addWhere(sWhereString, "(T1.EstColRGB <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstColDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstColDsc DESC" ;
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
         scmdbuf += " ORDER BY T1.EstCol" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstCol DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstColBck" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstColBck DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstColRGB" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstColRGB DESC" ;
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
                  return conditional_P08WV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).longValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).longValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08WV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               return;
      }
   }

}

