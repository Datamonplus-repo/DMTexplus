package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class crearinventario_recuento_wcexportcsv_impl extends GXWebProcedure
{
   public crearinventario_recuento_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "CrearInventario_recuento_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("CrearInventario_recuento_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("CrearInventario_recuento_WCColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Existencia Teorica Almacen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Existencia Real Almacen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio Mov Recuento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ubicacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote Producto", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV56Crearinventario_recuento_wcds_1_filterfulltext = AV30FilterFullText ;
      AV57Crearinventario_recuento_wcds_2_tfprdnum = AV36TFPrdNum ;
      AV58Crearinventario_recuento_wcds_3_tfprdnum_sel = AV37TFPrdNum_Sel ;
      AV59Crearinventario_recuento_wcds_4_tfprdnom = AV38TFPrdNom ;
      AV60Crearinventario_recuento_wcds_5_tfprdnom_sel = AV39TFPrdNom_Sel ;
      AV61Crearinventario_recuento_wcds_6_tfrecexiteo = AV43TFRecExiTeo ;
      AV62Crearinventario_recuento_wcds_7_tfrecexiteo_to = AV44TFRecExiTeo_To ;
      AV63Crearinventario_recuento_wcds_8_tfrecexirea = AV45TFRecExiRea ;
      AV64Crearinventario_recuento_wcds_9_tfrecexirea_to = AV46TFRecExiRea_To ;
      AV65Crearinventario_recuento_wcds_10_tfrecprerec = AV47TFRecPreRec ;
      AV66Crearinventario_recuento_wcds_11_tfrecprerec_to = AV48TFRecPreRec_To ;
      AV67Crearinventario_recuento_wcds_12_tfrecubic = AV49TFRecUbic ;
      AV68Crearinventario_recuento_wcds_13_tfrecubic_sel = AV50TFRecUbic_Sel ;
      AV69Crearinventario_recuento_wcds_14_tfreclot = AV51TFRecLot ;
      AV70Crearinventario_recuento_wcds_15_tfreclot_sel = AV52TFRecLot_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV56Crearinventario_recuento_wcds_1_filterfulltext ,
                                           AV58Crearinventario_recuento_wcds_3_tfprdnum_sel ,
                                           AV57Crearinventario_recuento_wcds_2_tfprdnum ,
                                           AV60Crearinventario_recuento_wcds_5_tfprdnom_sel ,
                                           AV59Crearinventario_recuento_wcds_4_tfprdnom ,
                                           AV61Crearinventario_recuento_wcds_6_tfrecexiteo ,
                                           AV62Crearinventario_recuento_wcds_7_tfrecexiteo_to ,
                                           AV63Crearinventario_recuento_wcds_8_tfrecexirea ,
                                           AV64Crearinventario_recuento_wcds_9_tfrecexirea_to ,
                                           AV65Crearinventario_recuento_wcds_10_tfrecprerec ,
                                           AV66Crearinventario_recuento_wcds_11_tfrecprerec_to ,
                                           AV68Crearinventario_recuento_wcds_13_tfrecubic_sel ,
                                           AV67Crearinventario_recuento_wcds_12_tfrecubic ,
                                           AV70Crearinventario_recuento_wcds_15_tfreclot_sel ,
                                           AV69Crearinventario_recuento_wcds_14_tfreclot ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A6573RecPreRec ,
                                           A11195RecUbic ,
                                           A12285RecLot ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV40Emprcod ,
                                           AV41RecFec ,
                                           A396EmprCod ,
                                           A810RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV56Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV56Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV56Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV56Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV56Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV56Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV56Crearinventario_recuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Crearinventario_recuento_wcds_1_filterfulltext), "%", "") ;
      lV57Crearinventario_recuento_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV57Crearinventario_recuento_wcds_2_tfprdnum), 6, "%") ;
      lV59Crearinventario_recuento_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Crearinventario_recuento_wcds_4_tfprdnom), 26, "%") ;
      lV67Crearinventario_recuento_wcds_12_tfrecubic = GXutil.padr( GXutil.rtrim( AV67Crearinventario_recuento_wcds_12_tfrecubic), 20, "%") ;
      lV69Crearinventario_recuento_wcds_14_tfreclot = GXutil.padr( GXutil.rtrim( AV69Crearinventario_recuento_wcds_14_tfreclot), 26, "%") ;
      /* Using cursor P093S2 */
      pr_default.execute(0, new Object[] {AV40Emprcod, AV41RecFec, lV56Crearinventario_recuento_wcds_1_filterfulltext, lV56Crearinventario_recuento_wcds_1_filterfulltext, lV56Crearinventario_recuento_wcds_1_filterfulltext, lV56Crearinventario_recuento_wcds_1_filterfulltext, lV56Crearinventario_recuento_wcds_1_filterfulltext, lV56Crearinventario_recuento_wcds_1_filterfulltext, lV56Crearinventario_recuento_wcds_1_filterfulltext, lV57Crearinventario_recuento_wcds_2_tfprdnum, AV58Crearinventario_recuento_wcds_3_tfprdnum_sel, lV59Crearinventario_recuento_wcds_4_tfprdnom, AV60Crearinventario_recuento_wcds_5_tfprdnom_sel, AV61Crearinventario_recuento_wcds_6_tfrecexiteo, AV62Crearinventario_recuento_wcds_7_tfrecexiteo_to, AV63Crearinventario_recuento_wcds_8_tfrecexirea, AV64Crearinventario_recuento_wcds_9_tfrecexirea_to, AV65Crearinventario_recuento_wcds_10_tfrecprerec, AV66Crearinventario_recuento_wcds_11_tfrecprerec_to, lV67Crearinventario_recuento_wcds_12_tfrecubic, AV68Crearinventario_recuento_wcds_13_tfrecubic_sel, lV69Crearinventario_recuento_wcds_14_tfreclot, AV70Crearinventario_recuento_wcds_15_tfreclot_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A810RecFec = P093S2_A810RecFec[0] ;
         A396EmprCod = P093S2_A396EmprCod[0] ;
         A12285RecLot = P093S2_A12285RecLot[0] ;
         A11195RecUbic = P093S2_A11195RecUbic[0] ;
         A6573RecPreRec = P093S2_A6573RecPreRec[0] ;
         A807RecExiRea = P093S2_A807RecExiRea[0] ;
         A809RecExiTeo = P093S2_A809RecExiTeo[0] ;
         A718PrdNom = P093S2_A718PrdNom[0] ;
         A719PrdNum = P093S2_A719PrdNum[0] ;
         A718PrdNom = P093S2_A718PrdNom[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
            crearinventario_recuento_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
            crearinventario_recuento_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A809RecExiTeo, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A807RecExiRea, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A6573RecPreRec, 14, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11195RecUbic, ";", ","), GXv_char3) ;
            crearinventario_recuento_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A12285RecLot, ";", ","), GXv_char3) ;
            crearinventario_recuento_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=CrearInventario_recuento_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecExiTeo", "", "Existencia Teorica Almacen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecExiRea", "", "Existencia Real Almacen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecPreRec", "", "Precio Mov Recuento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecUbic", "", "Ubicacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecLot", "", "Lote Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CrearInventario_recuento_WCColumnsSelector", GXv_char3) ;
      crearinventario_recuento_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("CrearInventario_recuento_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CrearInventario_recuento_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("CrearInventario_recuento_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV36TFPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV37TFPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV38TFPrdNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV39TFPrdNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV43TFRecExiTeo = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFRecExiTeo_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV45TFRecExiRea = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFRecExiRea_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPREREC") == 0 )
         {
            AV47TFRecPreRec = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFRecPreRec_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUBIC") == 0 )
         {
            AV49TFRecUbic = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUBIC_SEL") == 0 )
         {
            AV50TFRecUbic_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOT") == 0 )
         {
            AV51TFRecLot = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOT_SEL") == 0 )
         {
            AV52TFRecLot_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV40Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV41RecFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECHORA") == 0 )
         {
            AV42RecHora = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
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
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A11195RecUbic = "" ;
      A12285RecLot = "" ;
      AV56Crearinventario_recuento_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV57Crearinventario_recuento_wcds_2_tfprdnum = "" ;
      AV36TFPrdNum = "" ;
      AV58Crearinventario_recuento_wcds_3_tfprdnum_sel = "" ;
      AV37TFPrdNum_Sel = "" ;
      AV59Crearinventario_recuento_wcds_4_tfprdnom = "" ;
      AV38TFPrdNom = "" ;
      AV60Crearinventario_recuento_wcds_5_tfprdnom_sel = "" ;
      AV39TFPrdNom_Sel = "" ;
      AV61Crearinventario_recuento_wcds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV43TFRecExiTeo = DecimalUtil.ZERO ;
      AV62Crearinventario_recuento_wcds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV44TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV63Crearinventario_recuento_wcds_8_tfrecexirea = DecimalUtil.ZERO ;
      AV45TFRecExiRea = DecimalUtil.ZERO ;
      AV64Crearinventario_recuento_wcds_9_tfrecexirea_to = DecimalUtil.ZERO ;
      AV46TFRecExiRea_To = DecimalUtil.ZERO ;
      AV65Crearinventario_recuento_wcds_10_tfrecprerec = DecimalUtil.ZERO ;
      AV47TFRecPreRec = DecimalUtil.ZERO ;
      AV66Crearinventario_recuento_wcds_11_tfrecprerec_to = DecimalUtil.ZERO ;
      AV48TFRecPreRec_To = DecimalUtil.ZERO ;
      AV67Crearinventario_recuento_wcds_12_tfrecubic = "" ;
      AV49TFRecUbic = "" ;
      AV68Crearinventario_recuento_wcds_13_tfrecubic_sel = "" ;
      AV50TFRecUbic_Sel = "" ;
      AV69Crearinventario_recuento_wcds_14_tfreclot = "" ;
      AV51TFRecLot = "" ;
      AV70Crearinventario_recuento_wcds_15_tfreclot_sel = "" ;
      AV52TFRecLot_Sel = "" ;
      scmdbuf = "" ;
      lV56Crearinventario_recuento_wcds_1_filterfulltext = "" ;
      lV57Crearinventario_recuento_wcds_2_tfprdnum = "" ;
      lV59Crearinventario_recuento_wcds_4_tfprdnom = "" ;
      lV67Crearinventario_recuento_wcds_12_tfrecubic = "" ;
      lV69Crearinventario_recuento_wcds_14_tfreclot = "" ;
      AV40Emprcod = "" ;
      AV41RecFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A810RecFec = GXutil.nullDate() ;
      P093S2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P093S2_A396EmprCod = new String[] {""} ;
      P093S2_A12285RecLot = new String[] {""} ;
      P093S2_A11195RecUbic = new String[] {""} ;
      P093S2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093S2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093S2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093S2_A718PrdNom = new String[] {""} ;
      P093S2_A719PrdNum = new String[] {""} ;
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
      AV42RecHora = GXutil.resetTime( GXutil.nullDate() );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.crearinventario_recuento_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P093S2_A810RecFec, P093S2_A396EmprCod, P093S2_A12285RecLot, P093S2_A11195RecUbic, P093S2_A6573RecPreRec, P093S2_A807RecExiRea, P093S2_A809RecExiTeo, P093S2_A718PrdNom, P093S2_A719PrdNum
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
   private int AV71GXV1 ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal AV61Crearinventario_recuento_wcds_6_tfrecexiteo ;
   private java.math.BigDecimal AV43TFRecExiTeo ;
   private java.math.BigDecimal AV62Crearinventario_recuento_wcds_7_tfrecexiteo_to ;
   private java.math.BigDecimal AV44TFRecExiTeo_To ;
   private java.math.BigDecimal AV63Crearinventario_recuento_wcds_8_tfrecexirea ;
   private java.math.BigDecimal AV45TFRecExiRea ;
   private java.math.BigDecimal AV64Crearinventario_recuento_wcds_9_tfrecexirea_to ;
   private java.math.BigDecimal AV46TFRecExiRea_To ;
   private java.math.BigDecimal AV65Crearinventario_recuento_wcds_10_tfrecprerec ;
   private java.math.BigDecimal AV47TFRecPreRec ;
   private java.math.BigDecimal AV66Crearinventario_recuento_wcds_11_tfrecprerec_to ;
   private java.math.BigDecimal AV48TFRecPreRec_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A11195RecUbic ;
   private String A12285RecLot ;
   private String AV57Crearinventario_recuento_wcds_2_tfprdnum ;
   private String AV36TFPrdNum ;
   private String AV58Crearinventario_recuento_wcds_3_tfprdnum_sel ;
   private String AV37TFPrdNum_Sel ;
   private String AV59Crearinventario_recuento_wcds_4_tfprdnom ;
   private String AV38TFPrdNom ;
   private String AV60Crearinventario_recuento_wcds_5_tfprdnom_sel ;
   private String AV39TFPrdNom_Sel ;
   private String AV67Crearinventario_recuento_wcds_12_tfrecubic ;
   private String AV49TFRecUbic ;
   private String AV68Crearinventario_recuento_wcds_13_tfrecubic_sel ;
   private String AV50TFRecUbic_Sel ;
   private String AV69Crearinventario_recuento_wcds_14_tfreclot ;
   private String AV51TFRecLot ;
   private String AV70Crearinventario_recuento_wcds_15_tfreclot_sel ;
   private String AV52TFRecLot_Sel ;
   private String scmdbuf ;
   private String lV57Crearinventario_recuento_wcds_2_tfprdnum ;
   private String lV59Crearinventario_recuento_wcds_4_tfprdnom ;
   private String lV67Crearinventario_recuento_wcds_12_tfrecubic ;
   private String lV69Crearinventario_recuento_wcds_14_tfreclot ;
   private String AV40Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV42RecHora ;
   private java.util.Date AV41RecFec ;
   private java.util.Date A810RecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV56Crearinventario_recuento_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV56Crearinventario_recuento_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P093S2_A810RecFec ;
   private String[] P093S2_A396EmprCod ;
   private String[] P093S2_A12285RecLot ;
   private String[] P093S2_A11195RecUbic ;
   private java.math.BigDecimal[] P093S2_A6573RecPreRec ;
   private java.math.BigDecimal[] P093S2_A807RecExiRea ;
   private java.math.BigDecimal[] P093S2_A809RecExiTeo ;
   private String[] P093S2_A718PrdNom ;
   private String[] P093S2_A719PrdNum ;
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

final  class crearinventario_recuento_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P093S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56Crearinventario_recuento_wcds_1_filterfulltext ,
                                          String AV58Crearinventario_recuento_wcds_3_tfprdnum_sel ,
                                          String AV57Crearinventario_recuento_wcds_2_tfprdnum ,
                                          String AV60Crearinventario_recuento_wcds_5_tfprdnom_sel ,
                                          String AV59Crearinventario_recuento_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV61Crearinventario_recuento_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV62Crearinventario_recuento_wcds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV63Crearinventario_recuento_wcds_8_tfrecexirea ,
                                          java.math.BigDecimal AV64Crearinventario_recuento_wcds_9_tfrecexirea_to ,
                                          java.math.BigDecimal AV65Crearinventario_recuento_wcds_10_tfrecprerec ,
                                          java.math.BigDecimal AV66Crearinventario_recuento_wcds_11_tfrecprerec_to ,
                                          String AV68Crearinventario_recuento_wcds_13_tfrecubic_sel ,
                                          String AV67Crearinventario_recuento_wcds_12_tfrecubic ,
                                          String AV70Crearinventario_recuento_wcds_15_tfreclot_sel ,
                                          String AV69Crearinventario_recuento_wcds_14_tfreclot ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          String A11195RecUbic ,
                                          String A12285RecLot ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV40Emprcod ,
                                          java.util.Date AV41RecFec ,
                                          String A396EmprCod ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[23];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.RecFec, T1.EmprCod, T1.RecLot, T1.RecUbic, T1.RecPreRec, T1.RecExiRea, T1.RecExiTeo, T2.PrdNom, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      if ( ! (GXutil.strcmp("", AV56Crearinventario_recuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiRea,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecPreRec,'99999990.99999'), 2) like '%' || ?) or ( UPPER(T1.RecUbic) like '%' || UPPER(?)) or ( UPPER(T1.RecLot) like '%' || UPPER(?)))");
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
      }
      if ( (GXutil.strcmp("", AV58Crearinventario_recuento_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV57Crearinventario_recuento_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Crearinventario_recuento_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Crearinventario_recuento_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Crearinventario_recuento_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Crearinventario_recuento_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Crearinventario_recuento_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Crearinventario_recuento_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Crearinventario_recuento_wcds_8_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Crearinventario_recuento_wcds_9_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Crearinventario_recuento_wcds_10_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Crearinventario_recuento_wcds_11_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Crearinventario_recuento_wcds_13_tfrecubic_sel)==0) && ( ! (GXutil.strcmp("", AV67Crearinventario_recuento_wcds_12_tfrecubic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUbic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Crearinventario_recuento_wcds_13_tfrecubic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUbic = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Crearinventario_recuento_wcds_15_tfreclot_sel)==0) && ( ! (GXutil.strcmp("", AV69Crearinventario_recuento_wcds_14_tfreclot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Crearinventario_recuento_wcds_15_tfreclot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLot = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiRea" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiRea DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPreRec" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPreRec DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecUbic" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecUbic DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLot" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLot DESC" ;
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
                  return conditional_P093S2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093S2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[24]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               return;
      }
   }

}

