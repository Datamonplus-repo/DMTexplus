package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwcwuti118_recetasexportcsv_impl extends GXWebProcedure
{
   public wcwcwuti118_recetasexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCWCWUti118_RecetasExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWCWUti118_RecetasColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCWCWUti118_RecetasColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Und", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV54Wcwcwuti118_recetasds_1_filterfulltext = AV30FilterFullText ;
      AV55Wcwcwuti118_recetasds_2_tfhreprdcant = AV45TFHrePrdCant ;
      AV56Wcwcwuti118_recetasds_3_tfhreprdcant_to = AV46TFHrePrdCant_To ;
      AV57Wcwcwuti118_recetasds_4_tfhreprduds = AV47TFHrePrdUDs ;
      AV58Wcwcwuti118_recetasds_5_tfhreprduds_sel = AV48TFHrePrdUDs_Sel ;
      AV59Wcwcwuti118_recetasds_6_tfhrelote = AV49TFHreLote ;
      AV60Wcwcwuti118_recetasds_7_tfhrelote_sel = AV50TFHreLote_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Wcwcwuti118_recetasds_1_filterfulltext ,
                                           AV55Wcwcwuti118_recetasds_2_tfhreprdcant ,
                                           AV56Wcwcwuti118_recetasds_3_tfhreprdcant_to ,
                                           AV58Wcwcwuti118_recetasds_5_tfhreprduds_sel ,
                                           AV57Wcwcwuti118_recetasds_4_tfhreprduds ,
                                           AV60Wcwcwuti118_recetasds_7_tfhrelote_sel ,
                                           AV59Wcwcwuti118_recetasds_6_tfhrelote ,
                                           A4563HrePrdCant ,
                                           A4561HrePrdUDs ,
                                           A5726HreLote ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV39HreLote ,
                                           A12453HreFecAct ,
                                           AV40Fec1 ,
                                           AV41Fec2 ,
                                           AV37Emprcod ,
                                           AV38Prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV54Wcwcwuti118_recetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcwcwuti118_recetasds_1_filterfulltext), "%", "") ;
      lV54Wcwcwuti118_recetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcwcwuti118_recetasds_1_filterfulltext), "%", "") ;
      lV54Wcwcwuti118_recetasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Wcwcwuti118_recetasds_1_filterfulltext), "%", "") ;
      lV57Wcwcwuti118_recetasds_4_tfhreprduds = GXutil.padr( GXutil.rtrim( AV57Wcwcwuti118_recetasds_4_tfhreprduds), 5, "%") ;
      lV59Wcwcwuti118_recetasds_6_tfhrelote = GXutil.padr( GXutil.rtrim( AV59Wcwcwuti118_recetasds_6_tfhrelote), 26, "%") ;
      /* Using cursor P08X72 */
      pr_default.execute(0, new Object[] {AV37Emprcod, AV38Prdnum, AV40Fec1, AV41Fec2, lV54Wcwcwuti118_recetasds_1_filterfulltext, lV54Wcwcwuti118_recetasds_1_filterfulltext, lV54Wcwcwuti118_recetasds_1_filterfulltext, AV55Wcwcwuti118_recetasds_2_tfhreprdcant, AV56Wcwcwuti118_recetasds_3_tfhreprdcant_to, lV57Wcwcwuti118_recetasds_4_tfhreprduds, AV58Wcwcwuti118_recetasds_5_tfhreprduds_sel, lV59Wcwcwuti118_recetasds_6_tfhrelote, AV60Wcwcwuti118_recetasds_7_tfhrelote_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A12453HreFecAct = P08X72_A12453HreFecAct[0] ;
         n12453HreFecAct = P08X72_n12453HreFecAct[0] ;
         A719PrdNum = P08X72_A719PrdNum[0] ;
         n719PrdNum = P08X72_n719PrdNum[0] ;
         A396EmprCod = P08X72_A396EmprCod[0] ;
         A5726HreLote = P08X72_A5726HreLote[0] ;
         n5726HreLote = P08X72_n5726HreLote[0] ;
         A4561HrePrdUDs = P08X72_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P08X72_n4561HrePrdUDs[0] ;
         A4563HrePrdCant = P08X72_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08X72_n4563HrePrdCant[0] ;
         A4494HreBarPar = P08X72_A4494HreBarPar[0] ;
         A4493HreBarReo = P08X72_A4493HreBarReo[0] ;
         A4492HreBarCod = P08X72_A4492HreBarCod[0] ;
         A11707HreProv = P08X72_A11707HreProv[0] ;
         n11707HreProv = P08X72_n11707HreProv[0] ;
         A4558HrePrdNum = P08X72_A4558HrePrdNum[0] ;
         n4558HrePrdNum = P08X72_n4558HrePrdNum[0] ;
         A4495HreNumCie = P08X72_A4495HreNumCie[0] ;
         A4545HreLinMaq = P08X72_A4545HreLinMaq[0] ;
         A4550HreLinPro = P08X72_A4550HreLinPro[0] ;
         A4557HreRecLin = P08X72_A4557HreRecLin[0] ;
         if ( ( ( GXutil.strcmp(A5726HreLote, AV39HreLote) == 0 ) && ( GXutil.strcmp(AV39HreLote, httpContext.getMessage( "S/N", "")) != 0 ) ) || ( (GXutil.strcmp("", A5726HreLote)==0) && ( GXutil.strcmp(AV39HreLote, httpContext.getMessage( "S/N", "")) == 0 ) ) )
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
               AV31BarNHdr = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV31BarNHdr, ";", ","), GXv_char3) ;
               wcwcwuti118_recetasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A4563HrePrdCant, 11, 3) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4561HrePrdUDs, ";", ","), GXv_char3) ;
               wcwcwuti118_recetasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXv_char3[0] = A396EmprCod ;
               GXv_int4[0] = A11707HreProv ;
               GXv_char5[0] = AV44PrvNom ;
               new app.pprvnom(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
               wcwcwuti118_recetasexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
               wcwcwuti118_recetasexportcsv_impl.this.A11707HreProv = GXv_int4[0] ;
               wcwcwuti118_recetasexportcsv_impl.this.AV44PrvNom = GXv_char5[0] ;
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char5[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV44PrvNom, ";", ","), GXv_char5) ;
               wcwcwuti118_recetasexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char5[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5726HreLote, ";", ","), GXv_char5) ;
               wcwcwuti118_recetasexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCWCWUti118_RecetasExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&BarNHdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HrePrdCant", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HrePrdUDs", "", "Und", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&PrvNom", "", "Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HreLote", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCWCWUti118_RecetasColumnsSelector", GXv_char5) ;
      wcwcwuti118_recetasexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCWCWUti118_RecetasGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCWCWUti118_RecetasGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("WCWCWUti118_RecetasGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDCANT") == 0 )
         {
            AV45TFHrePrdCant = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFHrePrdCant_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV47TFHrePrdUDs = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV48TFHrePrdUDs_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELOTE") == 0 )
         {
            AV49TFHreLote = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELOTE_SEL") == 0 )
         {
            AV50TFHreLote_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV37Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV38Prdnum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRELOTE") == 0 )
         {
            AV39HreLote = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV40Fec1 = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC2") == 0 )
         {
            AV41Fec2 = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
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
      A4494HreBarPar = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4561HrePrdUDs = "" ;
      A396EmprCod = "" ;
      A5726HreLote = "" ;
      AV54Wcwcwuti118_recetasds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV55Wcwcwuti118_recetasds_2_tfhreprdcant = DecimalUtil.ZERO ;
      AV45TFHrePrdCant = DecimalUtil.ZERO ;
      AV56Wcwcwuti118_recetasds_3_tfhreprdcant_to = DecimalUtil.ZERO ;
      AV46TFHrePrdCant_To = DecimalUtil.ZERO ;
      AV57Wcwcwuti118_recetasds_4_tfhreprduds = "" ;
      AV47TFHrePrdUDs = "" ;
      AV58Wcwcwuti118_recetasds_5_tfhreprduds_sel = "" ;
      AV48TFHrePrdUDs_Sel = "" ;
      AV59Wcwcwuti118_recetasds_6_tfhrelote = "" ;
      AV49TFHreLote = "" ;
      AV60Wcwcwuti118_recetasds_7_tfhrelote_sel = "" ;
      AV50TFHreLote_Sel = "" ;
      scmdbuf = "" ;
      lV54Wcwcwuti118_recetasds_1_filterfulltext = "" ;
      lV57Wcwcwuti118_recetasds_4_tfhreprduds = "" ;
      lV59Wcwcwuti118_recetasds_6_tfhrelote = "" ;
      AV39HreLote = "" ;
      A12453HreFecAct = GXutil.nullDate() ;
      AV40Fec1 = GXutil.nullDate() ;
      AV41Fec2 = GXutil.nullDate() ;
      AV37Emprcod = "" ;
      AV38Prdnum = "" ;
      A719PrdNum = "" ;
      P08X72_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      P08X72_n12453HreFecAct = new boolean[] {false} ;
      P08X72_A719PrdNum = new String[] {""} ;
      P08X72_n719PrdNum = new boolean[] {false} ;
      P08X72_A396EmprCod = new String[] {""} ;
      P08X72_A5726HreLote = new String[] {""} ;
      P08X72_n5726HreLote = new boolean[] {false} ;
      P08X72_A4561HrePrdUDs = new String[] {""} ;
      P08X72_n4561HrePrdUDs = new boolean[] {false} ;
      P08X72_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08X72_n4563HrePrdCant = new boolean[] {false} ;
      P08X72_A4494HreBarPar = new String[] {""} ;
      P08X72_A4493HreBarReo = new byte[1] ;
      P08X72_A4492HreBarCod = new int[1] ;
      P08X72_A11707HreProv = new int[1] ;
      P08X72_n11707HreProv = new boolean[] {false} ;
      P08X72_A4558HrePrdNum = new String[] {""} ;
      P08X72_n4558HrePrdNum = new boolean[] {false} ;
      P08X72_A4495HreNumCie = new byte[1] ;
      P08X72_A4545HreLinMaq = new short[1] ;
      P08X72_A4550HreLinPro = new byte[1] ;
      P08X72_A4557HreRecLin = new short[1] ;
      A4558HrePrdNum = "" ;
      AV31BarNHdr = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      AV44PrvNom = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwcwuti118_recetasexportcsv__default(),
         new Object[] {
             new Object[] {
            P08X72_A12453HreFecAct, P08X72_n12453HreFecAct, P08X72_A719PrdNum, P08X72_n719PrdNum, P08X72_A396EmprCod, P08X72_A5726HreLote, P08X72_n5726HreLote, P08X72_A4561HrePrdUDs, P08X72_n4561HrePrdUDs, P08X72_A4563HrePrdCant,
            P08X72_n4563HrePrdCant, P08X72_A4494HreBarPar, P08X72_A4493HreBarReo, P08X72_A4492HreBarCod, P08X72_A11707HreProv, P08X72_n11707HreProv, P08X72_A4558HrePrdNum, P08X72_n4558HrePrdNum, P08X72_A4495HreNumCie, P08X72_A4545HreLinMaq,
            P08X72_A4550HreLinPro, P08X72_A4557HreRecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int AV13Random ;
   private int A4492HreBarCod ;
   private int A11707HreProv ;
   private int GXv_int4[] ;
   private int AV61GXV1 ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal AV55Wcwcwuti118_recetasds_2_tfhreprdcant ;
   private java.math.BigDecimal AV45TFHrePrdCant ;
   private java.math.BigDecimal AV56Wcwcwuti118_recetasds_3_tfhreprdcant_to ;
   private java.math.BigDecimal AV46TFHrePrdCant_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A4494HreBarPar ;
   private String A4561HrePrdUDs ;
   private String A396EmprCod ;
   private String A5726HreLote ;
   private String AV57Wcwcwuti118_recetasds_4_tfhreprduds ;
   private String AV47TFHrePrdUDs ;
   private String AV58Wcwcwuti118_recetasds_5_tfhreprduds_sel ;
   private String AV48TFHrePrdUDs_Sel ;
   private String AV59Wcwcwuti118_recetasds_6_tfhrelote ;
   private String AV49TFHreLote ;
   private String AV60Wcwcwuti118_recetasds_7_tfhrelote_sel ;
   private String AV50TFHreLote_Sel ;
   private String scmdbuf ;
   private String lV57Wcwcwuti118_recetasds_4_tfhreprduds ;
   private String lV59Wcwcwuti118_recetasds_6_tfhrelote ;
   private String AV39HreLote ;
   private String AV37Emprcod ;
   private String AV38Prdnum ;
   private String A719PrdNum ;
   private String A4558HrePrdNum ;
   private String AV31BarNHdr ;
   private String GXv_char3[] ;
   private String AV44PrvNom ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private java.util.Date A12453HreFecAct ;
   private java.util.Date AV40Fec1 ;
   private java.util.Date AV41Fec2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n12453HreFecAct ;
   private boolean n719PrdNum ;
   private boolean n5726HreLote ;
   private boolean n4561HrePrdUDs ;
   private boolean n4563HrePrdCant ;
   private boolean n11707HreProv ;
   private boolean n4558HrePrdNum ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV54Wcwcwuti118_recetasds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV54Wcwcwuti118_recetasds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08X72_A12453HreFecAct ;
   private boolean[] P08X72_n12453HreFecAct ;
   private String[] P08X72_A719PrdNum ;
   private boolean[] P08X72_n719PrdNum ;
   private String[] P08X72_A396EmprCod ;
   private String[] P08X72_A5726HreLote ;
   private boolean[] P08X72_n5726HreLote ;
   private String[] P08X72_A4561HrePrdUDs ;
   private boolean[] P08X72_n4561HrePrdUDs ;
   private java.math.BigDecimal[] P08X72_A4563HrePrdCant ;
   private boolean[] P08X72_n4563HrePrdCant ;
   private String[] P08X72_A4494HreBarPar ;
   private byte[] P08X72_A4493HreBarReo ;
   private int[] P08X72_A4492HreBarCod ;
   private int[] P08X72_A11707HreProv ;
   private boolean[] P08X72_n11707HreProv ;
   private String[] P08X72_A4558HrePrdNum ;
   private boolean[] P08X72_n4558HrePrdNum ;
   private byte[] P08X72_A4495HreNumCie ;
   private short[] P08X72_A4545HreLinMaq ;
   private byte[] P08X72_A4550HreLinPro ;
   private short[] P08X72_A4557HreRecLin ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class wcwcwuti118_recetasexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08X72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Wcwcwuti118_recetasds_1_filterfulltext ,
                                          java.math.BigDecimal AV55Wcwcwuti118_recetasds_2_tfhreprdcant ,
                                          java.math.BigDecimal AV56Wcwcwuti118_recetasds_3_tfhreprdcant_to ,
                                          String AV58Wcwcwuti118_recetasds_5_tfhreprduds_sel ,
                                          String AV57Wcwcwuti118_recetasds_4_tfhreprduds ,
                                          String AV60Wcwcwuti118_recetasds_7_tfhrelote_sel ,
                                          String AV59Wcwcwuti118_recetasds_6_tfhrelote ,
                                          java.math.BigDecimal A4563HrePrdCant ,
                                          String A4561HrePrdUDs ,
                                          String A5726HreLote ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV39HreLote ,
                                          java.util.Date A12453HreFecAct ,
                                          java.util.Date AV40Fec1 ,
                                          java.util.Date AV41Fec2 ,
                                          String AV37Emprcod ,
                                          String AV38Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[13];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT HreFecAct, PrdNum, EmprCod, HreLote, HrePrdUDs, HrePrdCant, HreBarPar, HreBarReo, HreBarCod, HreProv, HrePrdNum, HreNumCie, HreLinMaq, HreLinPro, HreRecLin" ;
      scmdbuf += " FROM TXPHISLRE" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      addWhere(sWhereString, "(HreFecAct >= ?)");
      addWhere(sWhereString, "(HreFecAct <= ?)");
      if ( ! (GXutil.strcmp("", AV54Wcwcwuti118_recetasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(HrePrdCant,'9999990.999'), 2) like '%' || ?) or ( UPPER(HrePrdUDs) like '%' || UPPER(?)) or ( UPPER(HreLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Wcwcwuti118_recetasds_2_tfhreprdcant)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant >= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Wcwcwuti118_recetasds_3_tfhreprdcant_to)==0) )
      {
         addWhere(sWhereString, "(HrePrdCant <= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Wcwcwuti118_recetasds_5_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV57Wcwcwuti118_recetasds_4_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Wcwcwuti118_recetasds_5_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Wcwcwuti118_recetasds_7_tfhrelote_sel)==0) && ( ! (GXutil.strcmp("", AV59Wcwcwuti118_recetasds_6_tfhrelote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Wcwcwuti118_recetasds_7_tfhrelote_sel)==0) )
      {
         addWhere(sWhereString, "(HreLote = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY HrePrdNum" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdCant" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdCant DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HrePrdUDs" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HrePrdUDs DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY HreLote" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY HreLote DESC" ;
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
                  return conditional_P08X72(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.math.BigDecimal)dynConstraints[1] , (java.math.BigDecimal)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08X72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((String[]) buf[5])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((int[]) buf[13])[0] = rslt.getInt(9);
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(12);
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((byte[]) buf[20])[0] = rslt.getByte(14);
               ((short[]) buf[21])[0] = rslt.getShort(15);
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
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 3);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               return;
      }
   }

}

