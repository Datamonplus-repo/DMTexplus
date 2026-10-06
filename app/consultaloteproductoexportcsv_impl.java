package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultaloteproductoexportcsv_impl extends GXWebProcedure
{
   public consultaloteproductoexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultaLoteProductoExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsultaLoteProductoColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ConsultaLoteProductoColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote ID", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pedido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Certificado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Consumido", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cerficado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Certificado Proveedor", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV54Consultaloteproductods_1_filterfulltext = AV30FilterFullText ;
      AV55Consultaloteproductods_2_tflotefec = AV34TFLoteFec ;
      AV56Consultaloteproductods_3_tfloteid = AV36TFLoteID ;
      AV57Consultaloteproductods_4_tfloteid_sel = AV37TFLoteID_Sel ;
      AV58Consultaloteproductods_5_tfloteped = AV38TFLotePed ;
      AV59Consultaloteproductods_6_tfloteped_to = AV39TFLotePed_To ;
      AV60Consultaloteproductods_7_tflotectf = AV40TFLoteCtf ;
      AV61Consultaloteproductods_8_tflotectf_sel = AV41TFLoteCtf_Sel ;
      AV62Consultaloteproductods_9_tflotecon = AV42TFLoteCon ;
      AV63Consultaloteproductods_10_tflotecon_sel = AV43TFLoteCon_Sel ;
      AV64Consultaloteproductods_11_tflotectfnm = AV44TFLoteCtfNm ;
      AV65Consultaloteproductods_12_tflotectfnm_sel = AV45TFLoteCtfNm_Sel ;
      AV66Consultaloteproductods_13_tflotectfnf = AV46TFLoteCtfNF ;
      AV67Consultaloteproductods_14_tflotectfnf_sel = AV47TFLoteCtfNF_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Consultaloteproductods_1_filterfulltext ,
                                           AV55Consultaloteproductods_2_tflotefec ,
                                           AV57Consultaloteproductods_4_tfloteid_sel ,
                                           AV56Consultaloteproductods_3_tfloteid ,
                                           Integer.valueOf(AV58Consultaloteproductods_5_tfloteped) ,
                                           Integer.valueOf(AV59Consultaloteproductods_6_tfloteped_to) ,
                                           AV61Consultaloteproductods_8_tflotectf_sel ,
                                           AV60Consultaloteproductods_7_tflotectf ,
                                           AV63Consultaloteproductods_10_tflotecon_sel ,
                                           AV62Consultaloteproductods_9_tflotecon ,
                                           AV65Consultaloteproductods_12_tflotectfnm_sel ,
                                           AV64Consultaloteproductods_11_tflotectfnm ,
                                           AV67Consultaloteproductods_14_tflotectfnf_sel ,
                                           AV66Consultaloteproductods_13_tflotectfnf ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A11711LoteCtfNm ,
                                           A12352LoteCtfNF ,
                                           A11665LoteFec ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV48Emprcod ,
                                           AV49Prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV54Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV54Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV54Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV54Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV54Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV56Consultaloteproductods_3_tfloteid = GXutil.padr( GXutil.rtrim( AV56Consultaloteproductods_3_tfloteid), 26, "%") ;
      lV60Consultaloteproductods_7_tflotectf = GXutil.padr( GXutil.rtrim( AV60Consultaloteproductods_7_tflotectf), 1, "%") ;
      lV62Consultaloteproductods_9_tflotecon = GXutil.padr( GXutil.rtrim( AV62Consultaloteproductods_9_tflotecon), 1, "%") ;
      lV64Consultaloteproductods_11_tflotectfnm = GXutil.padr( GXutil.rtrim( AV64Consultaloteproductods_11_tflotectfnm), 50, "%") ;
      lV66Consultaloteproductods_13_tflotectfnf = GXutil.padr( GXutil.rtrim( AV66Consultaloteproductods_13_tflotectfnf), 50, "%") ;
      /* Using cursor P09QV2 */
      pr_default.execute(0, new Object[] {AV48Emprcod, AV49Prdnum, lV54Consultaloteproductods_1_filterfulltext, lV54Consultaloteproductods_1_filterfulltext, lV54Consultaloteproductods_1_filterfulltext, lV54Consultaloteproductods_1_filterfulltext, lV54Consultaloteproductods_1_filterfulltext, lV54Consultaloteproductods_1_filterfulltext, AV55Consultaloteproductods_2_tflotefec, lV56Consultaloteproductods_3_tfloteid, AV57Consultaloteproductods_4_tfloteid_sel, Integer.valueOf(AV58Consultaloteproductods_5_tfloteped), Integer.valueOf(AV59Consultaloteproductods_6_tfloteped_to), lV60Consultaloteproductods_7_tflotectf, AV61Consultaloteproductods_8_tflotectf_sel, lV62Consultaloteproductods_9_tflotecon, AV63Consultaloteproductods_10_tflotecon_sel, lV64Consultaloteproductods_11_tflotectfnm, AV65Consultaloteproductods_12_tflotectfnm_sel, lV66Consultaloteproductods_13_tflotectfnf, AV67Consultaloteproductods_14_tflotectfnf_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P09QV2_A719PrdNum[0] ;
         A396EmprCod = P09QV2_A396EmprCod[0] ;
         A12352LoteCtfNF = P09QV2_A12352LoteCtfNF[0] ;
         A11711LoteCtfNm = P09QV2_A11711LoteCtfNm[0] ;
         A11668LoteCon = P09QV2_A11668LoteCon[0] ;
         A11667LoteCtf = P09QV2_A11667LoteCtf[0] ;
         A11666LotePed = P09QV2_A11666LotePed[0] ;
         A11664LoteID = P09QV2_A11664LoteID[0] ;
         A11665LoteFec = P09QV2_A11665LoteFec[0] ;
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
            AV14TextFileLine += localUtil.dtoc( A11665LoteFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11664LoteID, ";", ","), GXv_char3) ;
            consultaloteproductoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A11666LotePed, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11667LoteCtf, ";", ","), GXv_char3) ;
            consultaloteproductoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11668LoteCon, ";", ","), GXv_char3) ;
            consultaloteproductoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11711LoteCtfNm, ";", ","), GXv_char3) ;
            consultaloteproductoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A12352LoteCtfNF, ";", ","), GXv_char3) ;
            consultaloteproductoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsultaLoteProductoExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LoteFec", "", "Fecha Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LoteID", "", "Lote ID", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LotePed", "", "Pedido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LoteCtf", "", "Certificado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LoteCon", "", "Consumido", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LoteCtfNm", "", "Cerficado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "LoteCtfNF", "", "Certificado Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultaLoteProductoColumnsSelector", GXv_char3) ;
      consultaloteproductoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ConsultaLoteProductoGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ConsultaLoteProductoGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("ConsultaLoteProductoGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEFEC") == 0 )
         {
            AV34TFLoteFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEID") == 0 )
         {
            AV36TFLoteID = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEID_SEL") == 0 )
         {
            AV37TFLoteID_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEPED") == 0 )
         {
            AV38TFLotePed = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFLotePed_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTF") == 0 )
         {
            AV40TFLoteCtf = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTF_SEL") == 0 )
         {
            AV41TFLoteCtf_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECON") == 0 )
         {
            AV42TFLoteCon = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECON_SEL") == 0 )
         {
            AV43TFLoteCon_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNM") == 0 )
         {
            AV44TFLoteCtfNm = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNM_SEL") == 0 )
         {
            AV45TFLoteCtfNm_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNF") == 0 )
         {
            AV46TFLoteCtfNF = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNF_SEL") == 0 )
         {
            AV47TFLoteCtfNF_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV48Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV49Prdnum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNOM") == 0 )
         {
            AV50PrdNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
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
      A11665LoteFec = GXutil.nullDate() ;
      A11664LoteID = "" ;
      A11667LoteCtf = "" ;
      A11668LoteCon = "" ;
      A11711LoteCtfNm = "" ;
      A12352LoteCtfNF = "" ;
      AV54Consultaloteproductods_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV55Consultaloteproductods_2_tflotefec = GXutil.nullDate() ;
      AV34TFLoteFec = GXutil.nullDate() ;
      AV56Consultaloteproductods_3_tfloteid = "" ;
      AV36TFLoteID = "" ;
      AV57Consultaloteproductods_4_tfloteid_sel = "" ;
      AV37TFLoteID_Sel = "" ;
      AV60Consultaloteproductods_7_tflotectf = "" ;
      AV40TFLoteCtf = "" ;
      AV61Consultaloteproductods_8_tflotectf_sel = "" ;
      AV41TFLoteCtf_Sel = "" ;
      AV62Consultaloteproductods_9_tflotecon = "" ;
      AV42TFLoteCon = "" ;
      AV63Consultaloteproductods_10_tflotecon_sel = "" ;
      AV43TFLoteCon_Sel = "" ;
      AV64Consultaloteproductods_11_tflotectfnm = "" ;
      AV44TFLoteCtfNm = "" ;
      AV65Consultaloteproductods_12_tflotectfnm_sel = "" ;
      AV45TFLoteCtfNm_Sel = "" ;
      AV66Consultaloteproductods_13_tflotectfnf = "" ;
      AV46TFLoteCtfNF = "" ;
      AV67Consultaloteproductods_14_tflotectfnf_sel = "" ;
      AV47TFLoteCtfNF_Sel = "" ;
      scmdbuf = "" ;
      lV54Consultaloteproductods_1_filterfulltext = "" ;
      lV56Consultaloteproductods_3_tfloteid = "" ;
      lV60Consultaloteproductods_7_tflotectf = "" ;
      lV62Consultaloteproductods_9_tflotecon = "" ;
      lV64Consultaloteproductods_11_tflotectfnm = "" ;
      lV66Consultaloteproductods_13_tflotectfnf = "" ;
      AV48Emprcod = "" ;
      AV49Prdnum = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P09QV2_A719PrdNum = new String[] {""} ;
      P09QV2_A396EmprCod = new String[] {""} ;
      P09QV2_A12352LoteCtfNF = new String[] {""} ;
      P09QV2_A11711LoteCtfNm = new String[] {""} ;
      P09QV2_A11668LoteCon = new String[] {""} ;
      P09QV2_A11667LoteCtf = new String[] {""} ;
      P09QV2_A11666LotePed = new int[1] ;
      P09QV2_A11664LoteID = new String[] {""} ;
      P09QV2_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
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
      AV50PrdNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultaloteproductoexportcsv__default(),
         new Object[] {
             new Object[] {
            P09QV2_A719PrdNum, P09QV2_A396EmprCod, P09QV2_A12352LoteCtfNF, P09QV2_A11711LoteCtfNm, P09QV2_A11668LoteCon, P09QV2_A11667LoteCtf, P09QV2_A11666LotePed, P09QV2_A11664LoteID, P09QV2_A11665LoteFec
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
   private int A11666LotePed ;
   private int AV58Consultaloteproductods_5_tfloteped ;
   private int AV38TFLotePed ;
   private int AV59Consultaloteproductods_6_tfloteped_to ;
   private int AV39TFLotePed_To ;
   private int AV68GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A11664LoteID ;
   private String A11667LoteCtf ;
   private String A11668LoteCon ;
   private String A11711LoteCtfNm ;
   private String A12352LoteCtfNF ;
   private String AV56Consultaloteproductods_3_tfloteid ;
   private String AV36TFLoteID ;
   private String AV57Consultaloteproductods_4_tfloteid_sel ;
   private String AV37TFLoteID_Sel ;
   private String AV60Consultaloteproductods_7_tflotectf ;
   private String AV40TFLoteCtf ;
   private String AV61Consultaloteproductods_8_tflotectf_sel ;
   private String AV41TFLoteCtf_Sel ;
   private String AV62Consultaloteproductods_9_tflotecon ;
   private String AV42TFLoteCon ;
   private String AV63Consultaloteproductods_10_tflotecon_sel ;
   private String AV43TFLoteCon_Sel ;
   private String AV64Consultaloteproductods_11_tflotectfnm ;
   private String AV44TFLoteCtfNm ;
   private String AV65Consultaloteproductods_12_tflotectfnm_sel ;
   private String AV45TFLoteCtfNm_Sel ;
   private String AV66Consultaloteproductods_13_tflotectfnf ;
   private String AV46TFLoteCtfNF ;
   private String AV67Consultaloteproductods_14_tflotectfnf_sel ;
   private String AV47TFLoteCtfNF_Sel ;
   private String scmdbuf ;
   private String lV56Consultaloteproductods_3_tfloteid ;
   private String lV60Consultaloteproductods_7_tflotectf ;
   private String lV62Consultaloteproductods_9_tflotecon ;
   private String lV64Consultaloteproductods_11_tflotectfnm ;
   private String lV66Consultaloteproductods_13_tflotectfnf ;
   private String AV48Emprcod ;
   private String AV49Prdnum ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV50PrdNom ;
   private java.util.Date A11665LoteFec ;
   private java.util.Date AV55Consultaloteproductods_2_tflotefec ;
   private java.util.Date AV34TFLoteFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV54Consultaloteproductods_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV54Consultaloteproductods_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09QV2_A719PrdNum ;
   private String[] P09QV2_A396EmprCod ;
   private String[] P09QV2_A12352LoteCtfNF ;
   private String[] P09QV2_A11711LoteCtfNm ;
   private String[] P09QV2_A11668LoteCon ;
   private String[] P09QV2_A11667LoteCtf ;
   private int[] P09QV2_A11666LotePed ;
   private String[] P09QV2_A11664LoteID ;
   private java.util.Date[] P09QV2_A11665LoteFec ;
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

final  class consultaloteproductoexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09QV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Consultaloteproductods_1_filterfulltext ,
                                          java.util.Date AV55Consultaloteproductods_2_tflotefec ,
                                          String AV57Consultaloteproductods_4_tfloteid_sel ,
                                          String AV56Consultaloteproductods_3_tfloteid ,
                                          int AV58Consultaloteproductods_5_tfloteped ,
                                          int AV59Consultaloteproductods_6_tfloteped_to ,
                                          String AV61Consultaloteproductods_8_tflotectf_sel ,
                                          String AV60Consultaloteproductods_7_tflotectf ,
                                          String AV63Consultaloteproductods_10_tflotecon_sel ,
                                          String AV62Consultaloteproductods_9_tflotecon ,
                                          String AV65Consultaloteproductods_12_tflotectfnm_sel ,
                                          String AV64Consultaloteproductods_11_tflotectfnm ,
                                          String AV67Consultaloteproductods_14_tflotectfnf_sel ,
                                          String AV66Consultaloteproductods_13_tflotectfnf ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV48Emprcod ,
                                          String AV49Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[21];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT PrdNum, EmprCod, LoteCtfNF, LoteCtfNm, LoteCon, LoteCtf, LotePed, LoteID, LoteFec FROM TXPLOTPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV54Consultaloteproductods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55Consultaloteproductods_2_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Consultaloteproductods_4_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV56Consultaloteproductods_3_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Consultaloteproductods_4_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV58Consultaloteproductods_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV59Consultaloteproductods_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Consultaloteproductods_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV60Consultaloteproductods_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Consultaloteproductods_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Consultaloteproductods_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV62Consultaloteproductods_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Consultaloteproductods_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Consultaloteproductods_12_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV64Consultaloteproductods_11_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Consultaloteproductods_12_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Consultaloteproductods_14_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV66Consultaloteproductods_13_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Consultaloteproductods_14_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LoteFec" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LoteFec DESC" ;
      }
      else if ( AV28OrderedBy == 2 )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LoteID" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LoteID DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LotePed" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LotePed DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LoteCtf" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LoteCtf DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LoteCon" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LoteCon DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LoteCtfNm" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LoteCtfNm DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY LoteCtfNF" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY LoteCtfNF DESC" ;
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
                  return conditional_P09QV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 50);
               }
               return;
      }
   }

}

