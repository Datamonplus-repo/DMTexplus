package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeprocesosquimicos_wcexportcsv_impl extends GXWebProcedure
{
   public listadodeprocesosquimicos_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ListadodeProcesosQuimicos_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ListadodeProcesosQuimicos_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.ListadodeProcesosQuimicos_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proceso", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Materia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tiempo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Temp.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Prog.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Receta", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = AV30FilterFullText ;
      AV58Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = AV34TFProForCod ;
      AV59Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel = AV35TFProForCod_Sel ;
      AV60Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = AV36TFProForDsc ;
      AV61Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel = AV37TFProForDsc_Sel ;
      AV62Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = AV46TFProForMat ;
      AV63Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel = AV47TFProForMat_Sel ;
      AV64Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie = AV44TFProForTie ;
      AV65Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to = AV45TFProForTie_To ;
      AV66Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx = AV52TFProForTmx ;
      AV67Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to = AV53TFProForTmx_To ;
      AV68Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro = AV48TFProNumPro ;
      AV69Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to = AV49TFProNumPro_To ;
      AV70Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec = AV50TFProNumRec ;
      AV71Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to = AV51TFProNumRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ,
                                           AV59Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ,
                                           AV58Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ,
                                           AV61Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ,
                                           AV60Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ,
                                           AV63Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ,
                                           AV62Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ,
                                           Short.valueOf(AV64Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie) ,
                                           Short.valueOf(AV65Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to) ,
                                           Short.valueOf(AV66Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx) ,
                                           Short.valueOf(AV67Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to) ,
                                           Integer.valueOf(AV68Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro) ,
                                           Integer.valueOf(AV69Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to) ,
                                           Integer.valueOf(AV70Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec) ,
                                           Integer.valueOf(AV71Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to) ,
                                           AV39Proforcodfrom ,
                                           AV40Proforcodto ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A769ProForMat ,
                                           Short.valueOf(A771ProForTie) ,
                                           Short.valueOf(A772ProForTmx) ,
                                           Integer.valueOf(A2392ProNumPro) ,
                                           Integer.valueOf(A2393ProNumRec) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           A13133ProForAct ,
                                           AV43Proforact ,
                                           AV38Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod), 6, "%") ;
      lV60Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV60Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc), 30, "%") ;
      lV62Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat), 16, "%") ;
      /* Using cursor P09EC2 */
      pr_default.execute(0, new Object[] {AV38Emprcod, AV43Proforact, lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV58Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod, AV59Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel, lV60Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc, AV61Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel, lV62Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat, AV63Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel, Short.valueOf(AV64Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie), Short.valueOf(AV65Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to), Short.valueOf(AV66Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx), Short.valueOf(AV67Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to), Integer.valueOf(AV68Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro), Integer.valueOf(AV69Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to), Integer.valueOf(AV70Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec), Integer.valueOf(AV71Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to), AV39Proforcodfrom, AV40Proforcodto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13133ProForAct = P09EC2_A13133ProForAct[0] ;
         A396EmprCod = P09EC2_A396EmprCod[0] ;
         A2393ProNumRec = P09EC2_A2393ProNumRec[0] ;
         A2392ProNumPro = P09EC2_A2392ProNumPro[0] ;
         A772ProForTmx = P09EC2_A772ProForTmx[0] ;
         A771ProForTie = P09EC2_A771ProForTie[0] ;
         A769ProForMat = P09EC2_A769ProForMat[0] ;
         A766ProForDsc = P09EC2_A766ProForDsc[0] ;
         A764ProForCod = P09EC2_A764ProForCod[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A764ProForCod, ";", ","), GXv_char3) ;
            listadodeprocesosquimicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A766ProForDsc, ";", ","), GXv_char3) ;
            listadodeprocesosquimicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A769ProForMat, ";", ","), GXv_char3) ;
            listadodeprocesosquimicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A771ProForTie, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A772ProForTmx, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2392ProNumPro, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2393ProNumRec, 5, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ListadodeProcesosQuimicos_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForCod", "", "Proceso", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForMat", "", "Materia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForTie", "", "Tiempo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProForTmx", "", "Temp.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProNumPro", "", "Nº Prog.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProNumRec", "", "Nº Receta", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ListadodeProcesosQuimicos_WCColumnsSelector", GXv_char3) ;
      listadodeprocesosquimicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ListadodeProcesosQuimicos_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ListadodeProcesosQuimicos_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("FormulacionTinte.ListadodeProcesosQuimicos_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV34TFProForCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV35TFProForCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV36TFProForDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV37TFProForDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORMAT") == 0 )
         {
            AV46TFProForMat = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORMAT_SEL") == 0 )
         {
            AV47TFProForMat_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTIE") == 0 )
         {
            AV44TFProForTie = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFProForTie_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTMX") == 0 )
         {
            AV52TFProForTmx = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFProForTmx_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMPRO") == 0 )
         {
            AV48TFProNumPro = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFProNumPro_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMREC") == 0 )
         {
            AV50TFProNumRec = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFProNumRec_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV38Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&IMPCOD") == 0 )
         {
            AV41Impcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCODFROM") == 0 )
         {
            AV39Proforcodfrom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCODTO") == 0 )
         {
            AV40Proforcodto = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORABS") == 0 )
         {
            AV42ProforAbs = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORACT") == 0 )
         {
            AV43Proforact = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
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
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A769ProForMat = "" ;
      AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV58Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = "" ;
      AV34TFProForCod = "" ;
      AV59Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel = "" ;
      AV35TFProForCod_Sel = "" ;
      AV60Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = "" ;
      AV36TFProForDsc = "" ;
      AV61Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel = "" ;
      AV37TFProForDsc_Sel = "" ;
      AV62Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = "" ;
      AV46TFProForMat = "" ;
      AV63Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel = "" ;
      AV47TFProForMat_Sel = "" ;
      scmdbuf = "" ;
      lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = "" ;
      lV58Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = "" ;
      lV60Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = "" ;
      lV62Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = "" ;
      AV39Proforcodfrom = "" ;
      AV40Proforcodto = "" ;
      A13133ProForAct = "" ;
      AV43Proforact = "" ;
      AV38Emprcod = "" ;
      A396EmprCod = "" ;
      P09EC2_A13133ProForAct = new String[] {""} ;
      P09EC2_A396EmprCod = new String[] {""} ;
      P09EC2_A2393ProNumRec = new int[1] ;
      P09EC2_A2392ProNumPro = new int[1] ;
      P09EC2_A772ProForTmx = new short[1] ;
      P09EC2_A771ProForTie = new short[1] ;
      P09EC2_A769ProForMat = new String[] {""} ;
      P09EC2_A766ProForDsc = new String[] {""} ;
      P09EC2_A764ProForCod = new String[] {""} ;
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
      AV41Impcod = "" ;
      AV42ProforAbs = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.listadodeprocesosquimicos_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09EC2_A13133ProForAct, P09EC2_A396EmprCod, P09EC2_A2393ProNumRec, P09EC2_A2392ProNumPro, P09EC2_A772ProForTmx, P09EC2_A771ProForTie, P09EC2_A769ProForMat, P09EC2_A766ProForDsc, P09EC2_A764ProForCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short AV64Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie ;
   private short AV44TFProForTie ;
   private short AV65Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to ;
   private short AV45TFProForTie_To ;
   private short AV66Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx ;
   private short AV52TFProForTmx ;
   private short AV67Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to ;
   private short AV53TFProForTmx_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A2392ProNumPro ;
   private int A2393ProNumRec ;
   private int AV68Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro ;
   private int AV48TFProNumPro ;
   private int AV69Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to ;
   private int AV49TFProNumPro_To ;
   private int AV70Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec ;
   private int AV50TFProNumRec ;
   private int AV71Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to ;
   private int AV51TFProNumRec_To ;
   private int AV72GXV1 ;
   private java.math.BigDecimal AV42ProforAbs ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A769ProForMat ;
   private String AV58Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ;
   private String AV34TFProForCod ;
   private String AV59Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ;
   private String AV35TFProForCod_Sel ;
   private String AV60Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ;
   private String AV36TFProForDsc ;
   private String AV61Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ;
   private String AV37TFProForDsc_Sel ;
   private String AV62Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ;
   private String AV46TFProForMat ;
   private String AV63Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ;
   private String AV47TFProForMat_Sel ;
   private String scmdbuf ;
   private String lV58Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ;
   private String lV60Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ;
   private String lV62Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ;
   private String AV39Proforcodfrom ;
   private String AV40Proforcodto ;
   private String A13133ProForAct ;
   private String AV43Proforact ;
   private String AV38Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV41Impcod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09EC2_A13133ProForAct ;
   private String[] P09EC2_A396EmprCod ;
   private int[] P09EC2_A2393ProNumRec ;
   private int[] P09EC2_A2392ProNumPro ;
   private short[] P09EC2_A772ProForTmx ;
   private short[] P09EC2_A771ProForTie ;
   private String[] P09EC2_A769ProForMat ;
   private String[] P09EC2_A766ProForDsc ;
   private String[] P09EC2_A764ProForCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class listadodeprocesosquimicos_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ,
                                          String AV59Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ,
                                          String AV58Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ,
                                          String AV61Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ,
                                          String AV60Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ,
                                          String AV63Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ,
                                          String AV62Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ,
                                          short AV64Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie ,
                                          short AV65Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to ,
                                          short AV66Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx ,
                                          short AV67Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to ,
                                          int AV68Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro ,
                                          int AV69Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to ,
                                          int AV70Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec ,
                                          int AV71Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to ,
                                          String AV39Proforcodfrom ,
                                          String AV40Proforcodto ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A769ProForMat ,
                                          short A771ProForTie ,
                                          short A772ProForTmx ,
                                          int A2392ProNumPro ,
                                          int A2393ProNumRec ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String A13133ProForAct ,
                                          String AV43Proforact ,
                                          String AV38Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[25];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT ProForAct, EmprCod, ProNumRec, ProNumPro, ProForTmx, ProForTie, ProForMat, ProForDsc, ProForCod FROM TXPCPROFO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(ProForAct = ?)");
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForMat) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ProForTie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProForTmx,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProNumPro,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProNumRec,'99990'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV59Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(ProForCod = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV60Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel)==0) )
      {
         addWhere(sWhereString, "(ProForMat = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie) )
      {
         addWhere(sWhereString, "(ProForTie >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to) )
      {
         addWhere(sWhereString, "(ProForTie <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx) )
      {
         addWhere(sWhereString, "(ProForTmx >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to) )
      {
         addWhere(sWhereString, "(ProForTmx <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV68Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro) )
      {
         addWhere(sWhereString, "(ProNumPro >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to) )
      {
         addWhere(sWhereString, "(ProNumPro <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec) )
      {
         addWhere(sWhereString, "(ProNumRec >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to) )
      {
         addWhere(sWhereString, "(ProNumRec <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39Proforcodfrom)==0) )
      {
         addWhere(sWhereString, "(ProForCod >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40Proforcodto)==0) )
      {
         addWhere(sWhereString, "(ProForCod <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForDsc" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForMat" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForMat DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForTie" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForTie DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProForTmx" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProForTmx DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProNumPro" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProNumPro DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ProNumRec" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ProNumRec DESC" ;
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
                  return conditional_P09EC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               return;
      }
   }

}

