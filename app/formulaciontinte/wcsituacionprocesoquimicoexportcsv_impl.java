package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcsituacionprocesoquimicoexportcsv_impl extends GXWebProcedure
{
   public wcsituacionprocesoquimicoexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCSituacionProcesoQuimicoExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tc", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext = AV54FilterFullText ;
      AV59Formulaciontinte_wcsituacionprocesoquimicods_2_tfclicod = AV33TFCliCod ;
      AV60Formulaciontinte_wcsituacionprocesoquimicods_3_tfclicod_to = AV34TFCliCod_To ;
      AV61Formulaciontinte_wcsituacionprocesoquimicods_4_tfclinom = AV35TFCliNom ;
      AV62Formulaciontinte_wcsituacionprocesoquimicods_5_tfclinom_sel = AV36TFCliNom_Sel ;
      AV63Formulaciontinte_wcsituacionprocesoquimicods_6_tfforser = AV37TFForSer ;
      AV64Formulaciontinte_wcsituacionprocesoquimicods_7_tfforser_sel = AV38TFForSer_Sel ;
      AV65Formulaciontinte_wcsituacionprocesoquimicods_8_tfforserdsc = AV39TFForSerDsc ;
      AV66Formulaciontinte_wcsituacionprocesoquimicods_9_tfforserdsc_sel = AV40TFForSerDsc_Sel ;
      AV67Formulaciontinte_wcsituacionprocesoquimicods_10_tfforcolnom = AV41TFForColNom ;
      AV68Formulaciontinte_wcsituacionprocesoquimicods_11_tfforcolnom_sel = AV42TFForColNom_Sel ;
      AV69Formulaciontinte_wcsituacionprocesoquimicods_12_tfforcolnum = AV43TFForColNum ;
      AV70Formulaciontinte_wcsituacionprocesoquimicods_13_tfforcolnum_to = AV44TFForColNum_To ;
      AV71Formulaciontinte_wcsituacionprocesoquimicods_14_tftipcolcod = AV45TFTipColCod ;
      AV72Formulaciontinte_wcsituacionprocesoquimicods_15_tftipcolcod_to = AV46TFTipColCod_To ;
      AV73Formulaciontinte_wcsituacionprocesoquimicods_16_tftipcoldsc = AV47TFTipColDsc ;
      AV74Formulaciontinte_wcsituacionprocesoquimicods_17_tftipcoldsc_sel = AV48TFTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext ,
                                           Integer.valueOf(AV59Formulaciontinte_wcsituacionprocesoquimicods_2_tfclicod) ,
                                           Integer.valueOf(AV60Formulaciontinte_wcsituacionprocesoquimicods_3_tfclicod_to) ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicods_5_tfclinom_sel ,
                                           AV61Formulaciontinte_wcsituacionprocesoquimicods_4_tfclinom ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicods_7_tfforser_sel ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicods_6_tfforser ,
                                           AV66Formulaciontinte_wcsituacionprocesoquimicods_9_tfforserdsc_sel ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicods_8_tfforserdsc ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicods_11_tfforcolnom_sel ,
                                           AV67Formulaciontinte_wcsituacionprocesoquimicods_10_tfforcolnom ,
                                           Integer.valueOf(AV69Formulaciontinte_wcsituacionprocesoquimicods_12_tfforcolnum) ,
                                           Integer.valueOf(AV70Formulaciontinte_wcsituacionprocesoquimicods_13_tfforcolnum_to) ,
                                           Byte.valueOf(AV71Formulaciontinte_wcsituacionprocesoquimicods_14_tftipcolcod) ,
                                           Byte.valueOf(AV72Formulaciontinte_wcsituacionprocesoquimicods_15_tftipcolcod_to) ,
                                           AV74Formulaciontinte_wcsituacionprocesoquimicods_17_tftipcoldsc_sel ,
                                           AV73Formulaciontinte_wcsituacionprocesoquimicods_16_tftipcoldsc ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV49Emprcod ,
                                           AV50Proforcod ,
                                           A396EmprCod ,
                                           A764ProForCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext), "%", "") ;
      lV61Formulaciontinte_wcsituacionprocesoquimicods_4_tfclinom = GXutil.padr( GXutil.rtrim( AV61Formulaciontinte_wcsituacionprocesoquimicods_4_tfclinom), 30, "%") ;
      lV63Formulaciontinte_wcsituacionprocesoquimicods_6_tfforser = GXutil.padr( GXutil.rtrim( AV63Formulaciontinte_wcsituacionprocesoquimicods_6_tfforser), 16, "%") ;
      lV65Formulaciontinte_wcsituacionprocesoquimicods_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV65Formulaciontinte_wcsituacionprocesoquimicods_8_tfforserdsc), 26, "%") ;
      lV67Formulaciontinte_wcsituacionprocesoquimicods_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV67Formulaciontinte_wcsituacionprocesoquimicods_10_tfforcolnom), 13, "%") ;
      lV73Formulaciontinte_wcsituacionprocesoquimicods_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_wcsituacionprocesoquimicods_16_tftipcoldsc), 30, "%") ;
      /* Using cursor P08IN2 */
      pr_default.execute(0, new Object[] {AV49Emprcod, AV50Proforcod, lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext, lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext, lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext, lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext, lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext, lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext, lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext, lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext, Integer.valueOf(AV59Formulaciontinte_wcsituacionprocesoquimicods_2_tfclicod), Integer.valueOf(AV60Formulaciontinte_wcsituacionprocesoquimicods_3_tfclicod_to), lV61Formulaciontinte_wcsituacionprocesoquimicods_4_tfclinom, AV62Formulaciontinte_wcsituacionprocesoquimicods_5_tfclinom_sel, lV63Formulaciontinte_wcsituacionprocesoquimicods_6_tfforser, AV64Formulaciontinte_wcsituacionprocesoquimicods_7_tfforser_sel, lV65Formulaciontinte_wcsituacionprocesoquimicods_8_tfforserdsc, AV66Formulaciontinte_wcsituacionprocesoquimicods_9_tfforserdsc_sel, lV67Formulaciontinte_wcsituacionprocesoquimicods_10_tfforcolnom, AV68Formulaciontinte_wcsituacionprocesoquimicods_11_tfforcolnom_sel, Integer.valueOf(AV69Formulaciontinte_wcsituacionprocesoquimicods_12_tfforcolnum), Integer.valueOf(AV70Formulaciontinte_wcsituacionprocesoquimicods_13_tfforcolnum_to), Byte.valueOf(AV71Formulaciontinte_wcsituacionprocesoquimicods_14_tftipcolcod), Byte.valueOf(AV72Formulaciontinte_wcsituacionprocesoquimicods_15_tftipcolcod_to), lV73Formulaciontinte_wcsituacionprocesoquimicods_16_tftipcoldsc, AV74Formulaciontinte_wcsituacionprocesoquimicods_17_tftipcoldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A764ProForCod = P08IN2_A764ProForCod[0] ;
         A396EmprCod = P08IN2_A396EmprCod[0] ;
         A832TipColDsc = P08IN2_A832TipColDsc[0] ;
         n832TipColDsc = P08IN2_n832TipColDsc[0] ;
         A831TipColCod = P08IN2_A831TipColCod[0] ;
         A483ForColNum = P08IN2_A483ForColNum[0] ;
         A482ForColNom = P08IN2_A482ForColNom[0] ;
         A5742ForSerDsc = P08IN2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08IN2_n5742ForSerDsc[0] ;
         A494ForSer = P08IN2_A494ForSer[0] ;
         A279CliNom = P08IN2_A279CliNom[0] ;
         A252CliCod = P08IN2_A252CliCod[0] ;
         A1160ProForL = P08IN2_A1160ProForL[0] ;
         A832TipColDsc = P08IN2_A832TipColDsc[0] ;
         n832TipColDsc = P08IN2_n832TipColDsc[0] ;
         A279CliNom = P08IN2_A279CliNom[0] ;
         A5742ForSerDsc = P08IN2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P08IN2_n5742ForSerDsc[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            wcsituacionprocesoquimicoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A494ForSer, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5742ForSerDsc, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A482ForColNom, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A483ForColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A831TipColCod, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A832TipColDsc, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCSituacionProcesoQuimicoExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForSerDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipColCod", "", "Tc", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipColDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCSituacionProcesoQuimicoColumnsSelector", GXv_char3) ;
      wcsituacionprocesoquimicoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCSituacionProcesoQuimicoGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoGridState"), null, null);
      }
      AV28OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV75GXV1 = 1 ;
      while ( AV75GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV33TFCliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFCliCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV35TFCliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV36TFCliNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV37TFForSer = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV38TFForSer_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV39TFForSerDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV40TFForSerDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV41TFForColNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV42TFForColNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV43TFForColNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFForColNum_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV45TFTipColCod = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFTipColCod_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV47TFTipColDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV48TFTipColDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV49Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV50Proforcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV75GXV1 = (int)(AV75GXV1+1) ;
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
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext = "" ;
      AV54FilterFullText = "" ;
      AV61Formulaciontinte_wcsituacionprocesoquimicods_4_tfclinom = "" ;
      AV35TFCliNom = "" ;
      AV62Formulaciontinte_wcsituacionprocesoquimicods_5_tfclinom_sel = "" ;
      AV36TFCliNom_Sel = "" ;
      AV63Formulaciontinte_wcsituacionprocesoquimicods_6_tfforser = "" ;
      AV37TFForSer = "" ;
      AV64Formulaciontinte_wcsituacionprocesoquimicods_7_tfforser_sel = "" ;
      AV38TFForSer_Sel = "" ;
      AV65Formulaciontinte_wcsituacionprocesoquimicods_8_tfforserdsc = "" ;
      AV39TFForSerDsc = "" ;
      AV66Formulaciontinte_wcsituacionprocesoquimicods_9_tfforserdsc_sel = "" ;
      AV40TFForSerDsc_Sel = "" ;
      AV67Formulaciontinte_wcsituacionprocesoquimicods_10_tfforcolnom = "" ;
      AV41TFForColNom = "" ;
      AV68Formulaciontinte_wcsituacionprocesoquimicods_11_tfforcolnom_sel = "" ;
      AV42TFForColNom_Sel = "" ;
      AV73Formulaciontinte_wcsituacionprocesoquimicods_16_tftipcoldsc = "" ;
      AV47TFTipColDsc = "" ;
      AV74Formulaciontinte_wcsituacionprocesoquimicods_17_tftipcoldsc_sel = "" ;
      AV48TFTipColDsc_Sel = "" ;
      scmdbuf = "" ;
      lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext = "" ;
      lV61Formulaciontinte_wcsituacionprocesoquimicods_4_tfclinom = "" ;
      lV63Formulaciontinte_wcsituacionprocesoquimicods_6_tfforser = "" ;
      lV65Formulaciontinte_wcsituacionprocesoquimicods_8_tfforserdsc = "" ;
      lV67Formulaciontinte_wcsituacionprocesoquimicods_10_tfforcolnom = "" ;
      lV73Formulaciontinte_wcsituacionprocesoquimicods_16_tftipcoldsc = "" ;
      AV49Emprcod = "" ;
      AV50Proforcod = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      P08IN2_A764ProForCod = new String[] {""} ;
      P08IN2_A396EmprCod = new String[] {""} ;
      P08IN2_A832TipColDsc = new String[] {""} ;
      P08IN2_n832TipColDsc = new boolean[] {false} ;
      P08IN2_A831TipColCod = new byte[1] ;
      P08IN2_A483ForColNum = new int[1] ;
      P08IN2_A482ForColNom = new String[] {""} ;
      P08IN2_A5742ForSerDsc = new String[] {""} ;
      P08IN2_n5742ForSerDsc = new boolean[] {false} ;
      P08IN2_A494ForSer = new String[] {""} ;
      P08IN2_A279CliNom = new String[] {""} ;
      P08IN2_A252CliCod = new int[1] ;
      P08IN2_A1160ProForL = new short[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsituacionprocesoquimicoexportcsv__default(),
         new Object[] {
             new Object[] {
            P08IN2_A764ProForCod, P08IN2_A396EmprCod, P08IN2_A832TipColDsc, P08IN2_n832TipColDsc, P08IN2_A831TipColCod, P08IN2_A483ForColNum, P08IN2_A482ForColNom, P08IN2_A5742ForSerDsc, P08IN2_n5742ForSerDsc, P08IN2_A494ForSer,
            P08IN2_A279CliNom, P08IN2_A252CliCod, P08IN2_A1160ProForL
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV71Formulaciontinte_wcsituacionprocesoquimicods_14_tftipcolcod ;
   private byte AV45TFTipColCod ;
   private byte AV72Formulaciontinte_wcsituacionprocesoquimicods_15_tftipcolcod_to ;
   private byte AV46TFTipColCod_To ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV59Formulaciontinte_wcsituacionprocesoquimicods_2_tfclicod ;
   private int AV33TFCliCod ;
   private int AV60Formulaciontinte_wcsituacionprocesoquimicods_3_tfclicod_to ;
   private int AV34TFCliCod_To ;
   private int AV69Formulaciontinte_wcsituacionprocesoquimicods_12_tfforcolnum ;
   private int AV43TFForColNum ;
   private int AV70Formulaciontinte_wcsituacionprocesoquimicods_13_tfforcolnum_to ;
   private int AV44TFForColNum_To ;
   private int AV75GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String AV61Formulaciontinte_wcsituacionprocesoquimicods_4_tfclinom ;
   private String AV35TFCliNom ;
   private String AV62Formulaciontinte_wcsituacionprocesoquimicods_5_tfclinom_sel ;
   private String AV36TFCliNom_Sel ;
   private String AV63Formulaciontinte_wcsituacionprocesoquimicods_6_tfforser ;
   private String AV37TFForSer ;
   private String AV64Formulaciontinte_wcsituacionprocesoquimicods_7_tfforser_sel ;
   private String AV38TFForSer_Sel ;
   private String AV65Formulaciontinte_wcsituacionprocesoquimicods_8_tfforserdsc ;
   private String AV39TFForSerDsc ;
   private String AV66Formulaciontinte_wcsituacionprocesoquimicods_9_tfforserdsc_sel ;
   private String AV40TFForSerDsc_Sel ;
   private String AV67Formulaciontinte_wcsituacionprocesoquimicods_10_tfforcolnom ;
   private String AV41TFForColNom ;
   private String AV68Formulaciontinte_wcsituacionprocesoquimicods_11_tfforcolnom_sel ;
   private String AV42TFForColNom_Sel ;
   private String AV73Formulaciontinte_wcsituacionprocesoquimicods_16_tftipcoldsc ;
   private String AV47TFTipColDsc ;
   private String AV74Formulaciontinte_wcsituacionprocesoquimicods_17_tftipcoldsc_sel ;
   private String AV48TFTipColDsc_Sel ;
   private String scmdbuf ;
   private String lV61Formulaciontinte_wcsituacionprocesoquimicods_4_tfclinom ;
   private String lV63Formulaciontinte_wcsituacionprocesoquimicods_6_tfforser ;
   private String lV65Formulaciontinte_wcsituacionprocesoquimicods_8_tfforserdsc ;
   private String lV67Formulaciontinte_wcsituacionprocesoquimicods_10_tfforcolnom ;
   private String lV73Formulaciontinte_wcsituacionprocesoquimicods_16_tftipcoldsc ;
   private String AV49Emprcod ;
   private String AV50Proforcod ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n832TipColDsc ;
   private boolean n5742ForSerDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext ;
   private String AV54FilterFullText ;
   private String lV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08IN2_A764ProForCod ;
   private String[] P08IN2_A396EmprCod ;
   private String[] P08IN2_A832TipColDsc ;
   private boolean[] P08IN2_n832TipColDsc ;
   private byte[] P08IN2_A831TipColCod ;
   private int[] P08IN2_A483ForColNum ;
   private String[] P08IN2_A482ForColNom ;
   private String[] P08IN2_A5742ForSerDsc ;
   private boolean[] P08IN2_n5742ForSerDsc ;
   private String[] P08IN2_A494ForSer ;
   private String[] P08IN2_A279CliNom ;
   private int[] P08IN2_A252CliCod ;
   private short[] P08IN2_A1160ProForL ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wcsituacionprocesoquimicoexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08IN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext ,
                                          int AV59Formulaciontinte_wcsituacionprocesoquimicods_2_tfclicod ,
                                          int AV60Formulaciontinte_wcsituacionprocesoquimicods_3_tfclicod_to ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicods_5_tfclinom_sel ,
                                          String AV61Formulaciontinte_wcsituacionprocesoquimicods_4_tfclinom ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicods_7_tfforser_sel ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicods_6_tfforser ,
                                          String AV66Formulaciontinte_wcsituacionprocesoquimicods_9_tfforserdsc_sel ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicods_8_tfforserdsc ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicods_11_tfforcolnom_sel ,
                                          String AV67Formulaciontinte_wcsituacionprocesoquimicods_10_tfforcolnom ,
                                          int AV69Formulaciontinte_wcsituacionprocesoquimicods_12_tfforcolnum ,
                                          int AV70Formulaciontinte_wcsituacionprocesoquimicods_13_tfforcolnum_to ,
                                          byte AV71Formulaciontinte_wcsituacionprocesoquimicods_14_tftipcolcod ,
                                          byte AV72Formulaciontinte_wcsituacionprocesoquimicods_15_tftipcolcod_to ,
                                          String AV74Formulaciontinte_wcsituacionprocesoquimicods_17_tftipcoldsc_sel ,
                                          String AV73Formulaciontinte_wcsituacionprocesoquimicods_16_tftipcoldsc ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV49Emprcod ,
                                          String AV50Proforcod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[26];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ProForCod, T1.EmprCod, T2.TipColDsc, T1.TipColCod, T1.ForColNum, T1.ForColNom, T4.ForSerDsc, T1.ForSer, T3.CliNom, T1.CliCod, T1.ProForL FROM (((TXPLFORMU" ;
      scmdbuf += " T1 INNER JOIN TXPTIPCOL T2 ON T2.EmprCod = T1.EmprCod AND T2.TipColCod = T1.TipColCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " INNER JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.ForSer AND T4.ForColNom = T1.ForColNom AND T4.ForColNum = T1.ForColNum" ;
      scmdbuf += " AND T4.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      if ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T4.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T2.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_wcsituacionprocesoquimicods_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_wcsituacionprocesoquimicods_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicods_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV61Formulaciontinte_wcsituacionprocesoquimicods_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicods_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicods_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicods_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicods_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Formulaciontinte_wcsituacionprocesoquimicods_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicods_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Formulaciontinte_wcsituacionprocesoquimicods_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicods_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Formulaciontinte_wcsituacionprocesoquimicods_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicods_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_wcsituacionprocesoquimicods_12_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_wcsituacionprocesoquimicods_13_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_wcsituacionprocesoquimicods_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_wcsituacionprocesoquimicods_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_wcsituacionprocesoquimicods_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicods_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcsituacionprocesoquimicods_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ForSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ForSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipColDsc" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipColDsc DESC" ;
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
                  return conditional_P08IN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08IN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((short[]) buf[12])[0] = rslt.getShort(11);
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
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               return;
      }
   }

}

