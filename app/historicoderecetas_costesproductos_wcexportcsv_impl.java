package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class historicoderecetas_costesproductos_wcexportcsv_impl extends GXWebProcedure
{
   public historicoderecetas_costesproductos_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "HistoricodeRecetas_CostesProductos_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("HistoricodeRecetas_CostesProductos_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("HistoricodeRecetas_CostesProductos_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cant Ad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Und", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Factor", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Historicoderecetas_costesproductos_wcds_1_filterfulltext = AV30FilterFullText ;
      AV58Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = AV36TFHrePrdNum ;
      AV59Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel = AV37TFHrePrdNum_Sel ;
      AV60Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = AV38TFHrePrdDsc ;
      AV61Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel = AV39TFHrePrdDsc_Sel ;
      AV62Historicoderecetas_costesproductos_wcds_6_tfhreprdcant = AV40TFHrePrdCant ;
      AV63Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to = AV41TFHrePrdCant_To ;
      AV64Historicoderecetas_costesproductos_wcds_8_tfhreprduds = AV42TFHrePrdUDs ;
      AV65Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel = AV43TFHrePrdUDs_Sel ;
      AV66Historicoderecetas_costesproductos_wcds_10_tfhrepreprd = AV44TFHrePrePrd ;
      AV67Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to = AV45TFHrePrePrd_To ;
      AV68Historicoderecetas_costesproductos_wcds_12_tfprdfaccon = AV46TFPrdFacCon ;
      AV69Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to = AV47TFPrdFacCon_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Historicoderecetas_costesproductos_wcds_1_filterfulltext ,
                                           AV59Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ,
                                           AV58Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ,
                                           AV61Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ,
                                           AV60Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ,
                                           AV62Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ,
                                           AV63Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ,
                                           AV65Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ,
                                           AV64Historicoderecetas_costesproductos_wcds_8_tfhreprduds ,
                                           AV66Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ,
                                           AV67Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ,
                                           AV68Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ,
                                           AV69Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ,
                                           A4558HrePrdNum ,
                                           A4559HrePrdDsc ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A4967HrePrePrd ,
                                           A707PrdFacCon ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           A719PrdNum ,
                                           AV48Emprcod ,
                                           Integer.valueOf(AV49HreBarCod) ,
                                           Byte.valueOf(AV50HreBarReo) ,
                                           AV51HreBarpar ,
                                           Byte.valueOf(AV52HreNumCie) ,
                                           Short.valueOf(AV53HreLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT
                                           }
      });
      lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Historicoderecetas_costesproductos_wcds_1_filterfulltext), "%", "") ;
      lV58Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = GXutil.padr( GXutil.rtrim( AV58Historicoderecetas_costesproductos_wcds_2_tfhreprdnum), 6, "%") ;
      lV60Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = GXutil.padr( GXutil.rtrim( AV60Historicoderecetas_costesproductos_wcds_4_tfhreprddsc), 26, "%") ;
      lV64Historicoderecetas_costesproductos_wcds_8_tfhreprduds = GXutil.padr( GXutil.rtrim( AV64Historicoderecetas_costesproductos_wcds_8_tfhreprduds), 5, "%") ;
      /* Using cursor P09A52 */
      pr_default.execute(0, new Object[] {AV48Emprcod, Integer.valueOf(AV49HreBarCod), Byte.valueOf(AV50HreBarReo), AV51HreBarpar, Byte.valueOf(AV52HreNumCie), Short.valueOf(AV53HreLinMaq), lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext, lV58Historicoderecetas_costesproductos_wcds_2_tfhreprdnum, AV59Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel, lV60Historicoderecetas_costesproductos_wcds_4_tfhreprddsc, AV61Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel, AV62Historicoderecetas_costesproductos_wcds_6_tfhreprdcant, AV63Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to, lV64Historicoderecetas_costesproductos_wcds_8_tfhreprduds, AV65Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel, AV66Historicoderecetas_costesproductos_wcds_10_tfhrepreprd, AV67Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to, AV68Historicoderecetas_costesproductos_wcds_12_tfprdfaccon, AV69Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P09A52_A719PrdNum[0] ;
         n719PrdNum = P09A52_n719PrdNum[0] ;
         A4545HreLinMaq = P09A52_A4545HreLinMaq[0] ;
         A4495HreNumCie = P09A52_A4495HreNumCie[0] ;
         A4494HreBarPar = P09A52_A4494HreBarPar[0] ;
         A4493HreBarReo = P09A52_A4493HreBarReo[0] ;
         A4492HreBarCod = P09A52_A4492HreBarCod[0] ;
         A396EmprCod = P09A52_A396EmprCod[0] ;
         A707PrdFacCon = P09A52_A707PrdFacCon[0] ;
         A4967HrePrePrd = P09A52_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P09A52_n4967HrePrePrd[0] ;
         A4561HrePrdUDs = P09A52_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P09A52_n4561HrePrdUDs[0] ;
         A4563HrePrdCant = P09A52_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P09A52_n4563HrePrdCant[0] ;
         A4559HrePrdDsc = P09A52_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = P09A52_n4559HrePrdDsc[0] ;
         A4558HrePrdNum = P09A52_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P09A52_n4558HrePrdNum[0] ;
         A4565HreCanAny = P09A52_A4565HreCanAny[0] ;
         n4565HreCanAny = P09A52_n4565HreCanAny[0] ;
         A4550HreLinPro = P09A52_A4550HreLinPro[0] ;
         A4557HreRecLin = P09A52_A4557HreRecLin[0] ;
         A707PrdFacCon = P09A52_A707PrdFacCon[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4558HrePrdNum, ";", ","), GXv_char3) ;
            historicoderecetas_costesproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4559HrePrdDsc, ";", ","), GXv_char3) ;
            historicoderecetas_costesproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4563HrePrdCant, 11, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV70Cantad = ((A4565HreCanAny.doubleValue()>0) ? A4565HreCanAny : DecimalUtil.doubleToDec(0)) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV31HrePrdCant, 11, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4561HrePrdUDs, ";", ","), GXv_char3) ;
            historicoderecetas_costesproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV32Costelinea = GXutil.roundDecimal( (A4563HrePrdCant.add(AV70Cantad)).multiply(A707PrdFacCon).multiply(A4967HrePrePrd).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV32Costelinea, 11, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4967HrePrePrd, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A707PrdFacCon, 7, 4) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=HistoricodeRecetas_CostesProductos_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HrePrdNum", "", "Producto", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HrePrdDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HrePrdCant", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HrePrdCant", "", "Cant Ad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HrePrdUDs", "", "Und", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Costelinea", "", "Coste", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HrePrePrd", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdFacCon", "", "Factor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "HistoricodeRecetas_CostesProductos_WCColumnsSelector", GXv_char3) ;
      historicoderecetas_costesproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("HistoricodeRecetas_CostesProductos_WCGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "HistoricodeRecetas_CostesProductos_WCGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV19Session.getValue("HistoricodeRecetas_CostesProductos_WCGridState"), null, null);
      }
      AV28OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM") == 0 )
         {
            AV36TFHrePrdNum = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDNUM_SEL") == 0 )
         {
            AV37TFHrePrdNum_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC") == 0 )
         {
            AV38TFHrePrdDsc = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDDSC_SEL") == 0 )
         {
            AV39TFHrePrdDsc_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV40TFHrePrdCant = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFHrePrdCant_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV42TFHrePrdUDs = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV43TFHrePrdUDs_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPREPRD") == 0 )
         {
            AV44TFHrePrePrd = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFHrePrePrd_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFACCON") == 0 )
         {
            AV46TFPrdFacCon = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFPrdFacCon_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV48Emprcod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV49HreBarCod = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV50HreBarReo = (byte)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV51HreBarpar = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRENUMCIE") == 0 )
         {
            AV52HreNumCie = (byte)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELINMAQ") == 0 )
         {
            AV53HreLinMaq = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
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
      A4558HrePrdNum = "" ;
      A4559HrePrdDsc = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      AV57Historicoderecetas_costesproductos_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV58Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = "" ;
      AV36TFHrePrdNum = "" ;
      AV59Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel = "" ;
      AV37TFHrePrdNum_Sel = "" ;
      AV60Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = "" ;
      AV38TFHrePrdDsc = "" ;
      AV61Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel = "" ;
      AV39TFHrePrdDsc_Sel = "" ;
      AV62Historicoderecetas_costesproductos_wcds_6_tfhreprdcant = DecimalUtil.ZERO ;
      AV40TFHrePrdCant = DecimalUtil.ZERO ;
      AV63Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV41TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV64Historicoderecetas_costesproductos_wcds_8_tfhreprduds = "" ;
      AV42TFHrePrdUDs = "" ;
      AV65Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel = "" ;
      AV43TFHrePrdUDs_Sel = "" ;
      AV66Historicoderecetas_costesproductos_wcds_10_tfhrepreprd = DecimalUtil.ZERO ;
      AV44TFHrePrePrd = DecimalUtil.ZERO ;
      AV67Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to = DecimalUtil.ZERO ;
      AV45TFHrePrePrd_To = DecimalUtil.ZERO ;
      AV68Historicoderecetas_costesproductos_wcds_12_tfprdfaccon = DecimalUtil.ZERO ;
      AV46TFPrdFacCon = DecimalUtil.ZERO ;
      AV69Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to = DecimalUtil.ZERO ;
      AV47TFPrdFacCon_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext = "" ;
      lV58Historicoderecetas_costesproductos_wcds_2_tfhreprdnum = "" ;
      lV60Historicoderecetas_costesproductos_wcds_4_tfhreprddsc = "" ;
      lV64Historicoderecetas_costesproductos_wcds_8_tfhreprduds = "" ;
      A719PrdNum = "" ;
      AV48Emprcod = "" ;
      AV51HreBarpar = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      P09A52_A719PrdNum = new String[] {""} ;
      P09A52_n719PrdNum = new boolean[] {false} ;
      P09A52_A4545HreLinMaq = new short[1] ;
      P09A52_A4495HreNumCie = new byte[1] ;
      P09A52_A4494HreBarPar = new String[] {""} ;
      P09A52_A4493HreBarReo = new byte[1] ;
      P09A52_A4492HreBarCod = new int[1] ;
      P09A52_A396EmprCod = new String[] {""} ;
      P09A52_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A52_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A52_n4967HrePrePrd = new boolean[] {false} ;
      P09A52_A4561HrePrdUDs = new String[] {""} ;
      P09A52_n4561HrePrdUDs = new boolean[] {false} ;
      P09A52_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A52_n4563HrePrdCant = new boolean[] {false} ;
      P09A52_A4559HrePrdDsc = new String[] {""} ;
      P09A52_n4559HrePrdDsc = new boolean[] {false} ;
      P09A52_A4558HrePrdNum = new String[] {""} ;
      P09A52_n4558HrePrdNum = new boolean[] {false} ;
      P09A52_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09A52_n4565HreCanAny = new boolean[] {false} ;
      P09A52_A4550HreLinPro = new byte[1] ;
      P09A52_A4557HreRecLin = new short[1] ;
      AV70Cantad = DecimalUtil.ZERO ;
      AV31HrePrdCant = DecimalUtil.ZERO ;
      AV32Costelinea = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoderecetas_costesproductos_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09A52_A719PrdNum, P09A52_n719PrdNum, P09A52_A4545HreLinMaq, P09A52_A4495HreNumCie, P09A52_A4494HreBarPar, P09A52_A4493HreBarReo, P09A52_A4492HreBarCod, P09A52_A396EmprCod, P09A52_A707PrdFacCon, P09A52_A4967HrePrePrd,
            P09A52_n4967HrePrePrd, P09A52_A4561HrePrdUDs, P09A52_n4561HrePrdUDs, P09A52_A4563HrePrdCant, P09A52_n4563HrePrdCant, P09A52_A4559HrePrdDsc, P09A52_n4559HrePrdDsc, P09A52_A4558HrePrdNum, P09A52_n4558HrePrdNum, P09A52_A4565HreCanAny,
            P09A52_n4565HreCanAny, P09A52_A4550HreLinPro, P09A52_A4557HreRecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV50HreBarReo ;
   private byte AV52HreNumCie ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short AV53HreLinMaq ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV49HreBarCod ;
   private int A4492HreBarCod ;
   private int AV71GXV1 ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal AV62Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ;
   private java.math.BigDecimal AV40TFHrePrdCant ;
   private java.math.BigDecimal AV63Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ;
   private java.math.BigDecimal AV41TFHrePrdCant_To ;
   private java.math.BigDecimal AV66Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ;
   private java.math.BigDecimal AV44TFHrePrePrd ;
   private java.math.BigDecimal AV67Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ;
   private java.math.BigDecimal AV45TFHrePrePrd_To ;
   private java.math.BigDecimal AV68Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ;
   private java.math.BigDecimal AV46TFPrdFacCon ;
   private java.math.BigDecimal AV69Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ;
   private java.math.BigDecimal AV47TFPrdFacCon_To ;
   private java.math.BigDecimal AV70Cantad ;
   private java.math.BigDecimal AV31HrePrdCant ;
   private java.math.BigDecimal AV32Costelinea ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A4558HrePrdNum ;
   private String A4559HrePrdDsc ;
   private String A4561HrePrdUDs ;
   private String AV58Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ;
   private String AV36TFHrePrdNum ;
   private String AV59Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ;
   private String AV37TFHrePrdNum_Sel ;
   private String AV60Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ;
   private String AV38TFHrePrdDsc ;
   private String AV61Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ;
   private String AV39TFHrePrdDsc_Sel ;
   private String AV64Historicoderecetas_costesproductos_wcds_8_tfhreprduds ;
   private String AV42TFHrePrdUDs ;
   private String AV65Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ;
   private String AV43TFHrePrdUDs_Sel ;
   private String scmdbuf ;
   private String lV58Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ;
   private String lV60Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ;
   private String lV64Historicoderecetas_costesproductos_wcds_8_tfhreprduds ;
   private String A719PrdNum ;
   private String AV48Emprcod ;
   private String AV51HreBarpar ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n719PrdNum ;
   private boolean n4967HrePrePrd ;
   private boolean n4561HrePrdUDs ;
   private boolean n4563HrePrdCant ;
   private boolean n4559HrePrdDsc ;
   private boolean n4558HrePrdNum ;
   private boolean n4565HreCanAny ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV57Historicoderecetas_costesproductos_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV57Historicoderecetas_costesproductos_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09A52_A719PrdNum ;
   private boolean[] P09A52_n719PrdNum ;
   private short[] P09A52_A4545HreLinMaq ;
   private byte[] P09A52_A4495HreNumCie ;
   private String[] P09A52_A4494HreBarPar ;
   private byte[] P09A52_A4493HreBarReo ;
   private int[] P09A52_A4492HreBarCod ;
   private String[] P09A52_A396EmprCod ;
   private java.math.BigDecimal[] P09A52_A707PrdFacCon ;
   private java.math.BigDecimal[] P09A52_A4967HrePrePrd ;
   private boolean[] P09A52_n4967HrePrePrd ;
   private String[] P09A52_A4561HrePrdUDs ;
   private boolean[] P09A52_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P09A52_A4563HrePrdCant ;
   private boolean[] P09A52_n4563HrePrdCant ;
   private String[] P09A52_A4559HrePrdDsc ;
   private boolean[] P09A52_n4559HrePrdDsc ;
   private String[] P09A52_A4558HrePrdNum ;
   private boolean[] P09A52_n4558HrePrdNum ;
   private java.math.BigDecimal[] P09A52_A4565HreCanAny ;
   private boolean[] P09A52_n4565HreCanAny ;
   private byte[] P09A52_A4550HreLinPro ;
   private short[] P09A52_A4557HreRecLin ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class historicoderecetas_costesproductos_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09A52( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Historicoderecetas_costesproductos_wcds_1_filterfulltext ,
                                          String AV59Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel ,
                                          String AV58Historicoderecetas_costesproductos_wcds_2_tfhreprdnum ,
                                          String AV61Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel ,
                                          String AV60Historicoderecetas_costesproductos_wcds_4_tfhreprddsc ,
                                          java.math.BigDecimal AV62Historicoderecetas_costesproductos_wcds_6_tfhreprdcant ,
                                          java.math.BigDecimal AV63Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to ,
                                          String AV65Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel ,
                                          String AV64Historicoderecetas_costesproductos_wcds_8_tfhreprduds ,
                                          java.math.BigDecimal AV66Historicoderecetas_costesproductos_wcds_10_tfhrepreprd ,
                                          java.math.BigDecimal AV67Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to ,
                                          java.math.BigDecimal AV68Historicoderecetas_costesproductos_wcds_12_tfprdfaccon ,
                                          java.math.BigDecimal AV69Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to ,
                                          String A4558HrePrdNum ,
                                          String A4559HrePrdDsc ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          java.math.BigDecimal A4967HrePrePrd ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String A719PrdNum ,
                                          String AV48Emprcod ,
                                          int AV49HreBarCod ,
                                          byte AV50HreBarReo ,
                                          String AV51HreBarpar ,
                                          byte AV52HreNumCie ,
                                          short AV53HreLinMaq ,
                                          String A396EmprCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.HreLinMaq, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.EmprCod, T2.PrdFacCon, T1.HrePrePrd, T1.HrePrdUDs, T1.HrePrdCant, T1.HrePrdDsc," ;
      scmdbuf += " T1.HrePrdNum, T1.HreCanAny, T1.HreLinPro, T1.HreRecLin FROM (TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMaq = ?)");
      addWhere(sWhereString, "(T1.PrdNum >= '100000')");
      addWhere(sWhereString, "(T1.PrdNum <= '999999')");
      if ( ! (GXutil.strcmp("", AV57Historicoderecetas_costesproductos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.HrePrdNum) like '%' || UPPER(?)) or ( UPPER(T1.HrePrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HrePrdCant,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.HrePrdUDs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HrePrePrd,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdFacCon,'90.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV58Historicoderecetas_costesproductos_wcds_2_tfhreprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Historicoderecetas_costesproductos_wcds_3_tfhreprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdNum = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV60Historicoderecetas_costesproductos_wcds_4_tfhreprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Historicoderecetas_costesproductos_wcds_5_tfhreprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Historicoderecetas_costesproductos_wcds_6_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Historicoderecetas_costesproductos_wcds_7_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdCant <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV64Historicoderecetas_costesproductos_wcds_8_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Historicoderecetas_costesproductos_wcds_9_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrdUDs = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Historicoderecetas_costesproductos_wcds_10_tfhrepreprd)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Historicoderecetas_costesproductos_wcds_11_tfhrepreprd_to)==0) )
      {
         addWhere(sWhereString, "(T1.HrePrePrd <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Historicoderecetas_costesproductos_wcds_12_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Historicoderecetas_costesproductos_wcds_13_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdNum" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdDsc" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdCant" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdCant DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrdUDs" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrdUDs DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HrePrePrd" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HrePrePrd DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdFacCon" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdFacCon DESC" ;
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
                  return conditional_P09A52(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09A52", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(15);
               ((short[]) buf[22])[0] = rslt.getShort(16);
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
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
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
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 5);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 4);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 4);
               }
               return;
      }
   }

}

