package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttipcolwwexportcsv_impl extends GXWebProcedure
{
   public ttipcolwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TTIPCOLWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.TTIPCOLWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.TTIPCOLWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tiempo Teo.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Clase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV47Formulaciontinte_ttipcolwwds_1_filterfulltext = AV39FilterFullText ;
      AV48Formulaciontinte_ttipcolwwds_2_tftipcolcod = AV33TFTipColCod ;
      AV49Formulaciontinte_ttipcolwwds_3_tftipcolcod_to = AV34TFTipColCod_To ;
      AV50Formulaciontinte_ttipcolwwds_4_tftipcoldsc = AV35TFTipColDsc ;
      AV51Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel = AV36TFTipColDsc_Sel ;
      AV52Formulaciontinte_ttipcolwwds_6_tftipcoltie = AV37TFTipColTie ;
      AV53Formulaciontinte_ttipcolwwds_7_tftipcoltie_to = AV38TFTipColTie_To ;
      AV54Formulaciontinte_ttipcolwwds_8_tftipartfam = AV40TFTipArtFam ;
      AV55Formulaciontinte_ttipcolwwds_9_tftipartfam_to = AV41TFTipArtFam_To ;
      AV56Formulaciontinte_ttipcolwwds_10_tftipdscfam = AV42TFTipDscFam ;
      AV57Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel = AV43TFTipDscFam_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV48Formulaciontinte_ttipcolwwds_2_tftipcolcod) ,
                                           Byte.valueOf(AV49Formulaciontinte_ttipcolwwds_3_tftipcolcod_to) ,
                                           AV51Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ,
                                           AV50Formulaciontinte_ttipcolwwds_4_tftipcoldsc ,
                                           Integer.valueOf(AV52Formulaciontinte_ttipcolwwds_6_tftipcoltie) ,
                                           Integer.valueOf(AV53Formulaciontinte_ttipcolwwds_7_tftipcoltie_to) ,
                                           Short.valueOf(AV54Formulaciontinte_ttipcolwwds_8_tftipartfam) ,
                                           Short.valueOf(AV55Formulaciontinte_ttipcolwwds_9_tftipartfam_to) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A4999TipColTie) ,
                                           Short.valueOf(A5723TipArtFam) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV47Formulaciontinte_ttipcolwwds_1_filterfulltext ,
                                           A5724TipDscFam ,
                                           AV57Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ,
                                           AV56Formulaciontinte_ttipcolwwds_10_tftipdscfam } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV50Formulaciontinte_ttipcolwwds_4_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV50Formulaciontinte_ttipcolwwds_4_tftipcoldsc), 30, "%") ;
      /* Using cursor P08H02 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV48Formulaciontinte_ttipcolwwds_2_tftipcolcod), Byte.valueOf(AV49Formulaciontinte_ttipcolwwds_3_tftipcolcod_to), lV50Formulaciontinte_ttipcolwwds_4_tftipcoldsc, AV51Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel, Integer.valueOf(AV52Formulaciontinte_ttipcolwwds_6_tftipcoltie), Integer.valueOf(AV53Formulaciontinte_ttipcolwwds_7_tftipcoltie_to), Short.valueOf(AV54Formulaciontinte_ttipcolwwds_8_tftipartfam), Short.valueOf(AV55Formulaciontinte_ttipcolwwds_9_tftipartfam_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4999TipColTie = P08H02_A4999TipColTie[0] ;
         n4999TipColTie = P08H02_n4999TipColTie[0] ;
         A832TipColDsc = P08H02_A832TipColDsc[0] ;
         n832TipColDsc = P08H02_n832TipColDsc[0] ;
         A831TipColCod = P08H02_A831TipColCod[0] ;
         A5723TipArtFam = P08H02_A5723TipArtFam[0] ;
         n5723TipArtFam = P08H02_n5723TipArtFam[0] ;
         A396EmprCod = P08H02_A396EmprCod[0] ;
         GXt_char2 = A5724TipDscFam ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A5723TipArtFam ;
         GXv_char5[0] = GXt_char2 ;
         new app.pfamdsc(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
         ttipcolwwexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
         ttipcolwwexportcsv_impl.this.A5723TipArtFam = GXv_int4[0] ;
         ttipcolwwexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
         A5724TipDscFam = GXt_char2 ;
         if ( (GXutil.strcmp("", AV47Formulaciontinte_ttipcolwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV47Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV47Formulaciontinte_ttipcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4999TipColTie, 6, 0) , GXutil.padr( "%" + AV47Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5723TipArtFam, 4, 0) , GXutil.padr( "%" + AV47Formulaciontinte_ttipcolwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5724TipDscFam) , GXutil.padr( "%" + GXutil.upper( AV47Formulaciontinte_ttipcolwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV57Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_ttipcolwwds_10_tftipdscfam)==0) ) ) || ( GXutil.like( GXutil.upper( A5724TipDscFam) , GXutil.padr( "%" + GXutil.upper( AV56Formulaciontinte_ttipcolwwds_10_tftipdscfam) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV57Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel)==0) || ( ( GXutil.strcmp(A5724TipDscFam, AV57Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel) == 0 ) ) )
               {
                  AV14TextFileLine = "" ;
                  /* Execute user subroutine: 'BEFOREWRITELINE' */
                  S162 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     returnInSub = true;
                     if (true) return;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A831TipColCod, 2, 0) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char2 = AV14TextFileLine ;
                     GXv_char5[0] = GXt_char2 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A832TipColDsc, ";", ","), GXv_char5) ;
                     ttipcolwwexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
                     AV14TextFileLine += GXt_char2 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A4999TipColTie, 6, 0) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A5723TipArtFam, 4, 0) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char2 = AV14TextFileLine ;
                     GXv_char5[0] = GXt_char2 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5724TipDscFam, ";", ","), GXv_char5) ;
                     ttipcolwwexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
                     AV14TextFileLine += GXt_char2 ;
                  }
                  /* Execute user subroutine: 'AFTERWRITELINE' */
                  S172 ();
                  if ( returnInSub )
                  {
                     pr_default.close(0);
                     returnInSub = true;
                     if (true) return;
                  }
                  if ( GXutil.len( AV14TextFileLine) > 0 )
                  {
                     AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
                  }
               }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TTIPCOLWWExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipColCod", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipColDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipColTie", "", "Tiempo Teo.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipArtFam", "", "Clase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "TipDscFam", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.TTIPCOLWWColumnsSelector", GXv_char5) ;
      ttipcolwwexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.TTIPCOLWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TTIPCOLWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("FormulacionTinte.TTIPCOLWWGridState"), null, null);
      }
      AV28OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV39FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV33TFTipColCod = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFTipColCod_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV35TFTipColDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV36TFTipColDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLTIE") == 0 )
         {
            AV37TFTipColTie = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFTipColTie_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPARTFAM") == 0 )
         {
            AV40TFTipArtFam = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFTipArtFam_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDSCFAM") == 0 )
         {
            AV42TFTipDscFam = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDSCFAM_SEL") == 0 )
         {
            AV43TFTipDscFam_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV58GXV1 = (int)(AV58GXV1+1) ;
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
      A832TipColDsc = "" ;
      A5724TipDscFam = "" ;
      AV47Formulaciontinte_ttipcolwwds_1_filterfulltext = "" ;
      AV39FilterFullText = "" ;
      AV50Formulaciontinte_ttipcolwwds_4_tftipcoldsc = "" ;
      AV35TFTipColDsc = "" ;
      AV51Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel = "" ;
      AV36TFTipColDsc_Sel = "" ;
      AV56Formulaciontinte_ttipcolwwds_10_tftipdscfam = "" ;
      AV42TFTipDscFam = "" ;
      AV57Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel = "" ;
      AV43TFTipDscFam_Sel = "" ;
      scmdbuf = "" ;
      lV50Formulaciontinte_ttipcolwwds_4_tftipcoldsc = "" ;
      P08H02_A4999TipColTie = new int[1] ;
      P08H02_n4999TipColTie = new boolean[] {false} ;
      P08H02_A832TipColDsc = new String[] {""} ;
      P08H02_n832TipColDsc = new boolean[] {false} ;
      P08H02_A831TipColCod = new byte[1] ;
      P08H02_A5723TipArtFam = new short[1] ;
      P08H02_n5723TipArtFam = new boolean[] {false} ;
      P08H02_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new short[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.ttipcolwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08H02_A4999TipColTie, P08H02_n4999TipColTie, P08H02_A832TipColDsc, P08H02_n832TipColDsc, P08H02_A831TipColCod, P08H02_A5723TipArtFam, P08H02_n5723TipArtFam, P08H02_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV48Formulaciontinte_ttipcolwwds_2_tftipcolcod ;
   private byte AV33TFTipColCod ;
   private byte AV49Formulaciontinte_ttipcolwwds_3_tftipcolcod_to ;
   private byte AV34TFTipColCod_To ;
   private short gxcookieaux ;
   private short A5723TipArtFam ;
   private short AV54Formulaciontinte_ttipcolwwds_8_tftipartfam ;
   private short AV40TFTipArtFam ;
   private short AV55Formulaciontinte_ttipcolwwds_9_tftipartfam_to ;
   private short AV41TFTipArtFam_To ;
   private short AV28OrderedBy ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int AV13Random ;
   private int A4999TipColTie ;
   private int AV52Formulaciontinte_ttipcolwwds_6_tftipcoltie ;
   private int AV37TFTipColTie ;
   private int AV53Formulaciontinte_ttipcolwwds_7_tftipcoltie_to ;
   private int AV38TFTipColTie_To ;
   private int AV58GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A832TipColDsc ;
   private String A5724TipDscFam ;
   private String AV50Formulaciontinte_ttipcolwwds_4_tftipcoldsc ;
   private String AV35TFTipColDsc ;
   private String AV51Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ;
   private String AV36TFTipColDsc_Sel ;
   private String AV56Formulaciontinte_ttipcolwwds_10_tftipdscfam ;
   private String AV42TFTipDscFam ;
   private String AV57Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ;
   private String AV43TFTipDscFam_Sel ;
   private String scmdbuf ;
   private String lV50Formulaciontinte_ttipcolwwds_4_tftipcoldsc ;
   private String A396EmprCod ;
   private String GXv_char3[] ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n4999TipColTie ;
   private boolean n832TipColDsc ;
   private boolean n5723TipArtFam ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV47Formulaciontinte_ttipcolwwds_1_filterfulltext ;
   private String AV39FilterFullText ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P08H02_A4999TipColTie ;
   private boolean[] P08H02_n4999TipColTie ;
   private String[] P08H02_A832TipColDsc ;
   private boolean[] P08H02_n832TipColDsc ;
   private byte[] P08H02_A831TipColCod ;
   private short[] P08H02_A5723TipArtFam ;
   private boolean[] P08H02_n5723TipArtFam ;
   private String[] P08H02_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class ttipcolwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08H02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV48Formulaciontinte_ttipcolwwds_2_tftipcolcod ,
                                          byte AV49Formulaciontinte_ttipcolwwds_3_tftipcolcod_to ,
                                          String AV51Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel ,
                                          String AV50Formulaciontinte_ttipcolwwds_4_tftipcoldsc ,
                                          int AV52Formulaciontinte_ttipcolwwds_6_tftipcoltie ,
                                          int AV53Formulaciontinte_ttipcolwwds_7_tftipcoltie_to ,
                                          short AV54Formulaciontinte_ttipcolwwds_8_tftipartfam ,
                                          short AV55Formulaciontinte_ttipcolwwds_9_tftipartfam_to ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A4999TipColTie ,
                                          short A5723TipArtFam ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV47Formulaciontinte_ttipcolwwds_1_filterfulltext ,
                                          String A5724TipDscFam ,
                                          String AV57Formulaciontinte_ttipcolwwds_11_tftipdscfam_sel ,
                                          String AV56Formulaciontinte_ttipcolwwds_10_tftipdscfam )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[8];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT TipColTie, TipColDsc, TipColCod, TipArtFam, EmprCod FROM TXPTIPCOL" ;
      if ( ! (0==AV48Formulaciontinte_ttipcolwwds_2_tftipcolcod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV49Formulaciontinte_ttipcolwwds_3_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV50Formulaciontinte_ttipcolwwds_4_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Formulaciontinte_ttipcolwwds_5_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(TipColDsc = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_ttipcolwwds_6_tftipcoltie) )
      {
         addWhere(sWhereString, "(TipColTie >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_ttipcolwwds_7_tftipcoltie_to) )
      {
         addWhere(sWhereString, "(TipColTie <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_ttipcolwwds_8_tftipartfam) )
      {
         addWhere(sWhereString, "(TipArtFam >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV55Formulaciontinte_ttipcolwwds_9_tftipartfam_to) )
      {
         addWhere(sWhereString, "(TipArtFam <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TipColCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipColCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TipColDsc" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipColDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TipColTie" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipColTie DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TipArtFam" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TipArtFam DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P08H02(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08H02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
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
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               return;
      }
   }

}

