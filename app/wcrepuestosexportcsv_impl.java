package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcrepuestosexportcsv_impl extends GXWebProcedure
{
   public wcrepuestosexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "PrivateTempStorage" + "WCRepuestosExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCRepuestosColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCRepuestosColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod de Mov de Stock de Mantto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Repuesto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio Total", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "% Dto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV52Wcrepuestosds_1_emprcod = AV28EmprCod ;
      AV53Wcrepuestosds_2_mmscod = AV29MMSCod ;
      AV54Wcrepuestosds_3_tfmmscod = AV43TFMMSCod ;
      AV55Wcrepuestosds_4_tfmmscod_to = AV44TFMMSCod_To ;
      AV56Wcrepuestosds_5_tfmmsrnom = AV37TFMMSRNom ;
      AV57Wcrepuestosds_6_tfmmsrnom_sel = AV38TFMMSRNom_Sel ;
      AV58Wcrepuestosds_7_tfmmsrcod = AV35TFMMSRCod ;
      AV59Wcrepuestosds_8_tfmmsrcod_to = AV36TFMMSRCod_To ;
      AV60Wcrepuestosds_9_tfmmsrcnt = AV39TFMMSRCnt ;
      AV61Wcrepuestosds_10_tfmmsrcnt_to = AV40TFMMSRCnt_To ;
      AV62Wcrepuestosds_11_tfmmsrtot = AV45TFMMSRTot ;
      AV63Wcrepuestosds_12_tfmmsrtot_to = AV46TFMMSRTot_To ;
      AV64Wcrepuestosds_13_tfmmsrdto = AV47TFMMSRDto ;
      AV65Wcrepuestosds_14_tfmmsrdto_to = AV48TFMMSRDto_To ;
      AV66Wcrepuestosds_15_tfmmsrpre = AV41TFMMSRPre ;
      AV67Wcrepuestosds_16_tfmmsrpre_to = AV42TFMMSRPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV54Wcrepuestosds_3_tfmmscod) ,
                                           Integer.valueOf(AV55Wcrepuestosds_4_tfmmscod_to) ,
                                           AV57Wcrepuestosds_6_tfmmsrnom_sel ,
                                           AV56Wcrepuestosds_5_tfmmsrnom ,
                                           Integer.valueOf(AV58Wcrepuestosds_7_tfmmsrcod) ,
                                           Integer.valueOf(AV59Wcrepuestosds_8_tfmmsrcod_to) ,
                                           AV60Wcrepuestosds_9_tfmmsrcnt ,
                                           AV61Wcrepuestosds_10_tfmmsrcnt_to ,
                                           AV62Wcrepuestosds_11_tfmmsrtot ,
                                           AV63Wcrepuestosds_12_tfmmsrtot_to ,
                                           AV64Wcrepuestosds_13_tfmmsrdto ,
                                           AV65Wcrepuestosds_14_tfmmsrdto_to ,
                                           AV66Wcrepuestosds_15_tfmmsrpre ,
                                           AV67Wcrepuestosds_16_tfmmsrpre_to ,
                                           Integer.valueOf(A9412MMSCod) ,
                                           A9422MMSRNom ,
                                           Integer.valueOf(A9421MMSRCod) ,
                                           A9409MMSRCnt ,
                                           A11511MMSRTot ,
                                           A11512MMSRDto ,
                                           A9424MMSRPre ,
                                           Short.valueOf(AV30OrderedBy) ,
                                           Boolean.valueOf(AV31OrderedDsc) ,
                                           AV52Wcrepuestosds_1_emprcod ,
                                           Integer.valueOf(AV53Wcrepuestosds_2_mmscod) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV56Wcrepuestosds_5_tfmmsrnom = GXutil.padr( GXutil.rtrim( AV56Wcrepuestosds_5_tfmmsrnom), 100, "%") ;
      /* Using cursor P08VQ2 */
      pr_default.execute(0, new Object[] {AV52Wcrepuestosds_1_emprcod, Integer.valueOf(AV53Wcrepuestosds_2_mmscod), Integer.valueOf(AV54Wcrepuestosds_3_tfmmscod), Integer.valueOf(AV55Wcrepuestosds_4_tfmmscod_to), lV56Wcrepuestosds_5_tfmmsrnom, AV57Wcrepuestosds_6_tfmmsrnom_sel, Integer.valueOf(AV58Wcrepuestosds_7_tfmmsrcod), Integer.valueOf(AV59Wcrepuestosds_8_tfmmsrcod_to), AV60Wcrepuestosds_9_tfmmsrcnt, AV61Wcrepuestosds_10_tfmmsrcnt_to, AV62Wcrepuestosds_11_tfmmsrtot, AV63Wcrepuestosds_12_tfmmsrtot_to, AV64Wcrepuestosds_13_tfmmsrdto, AV65Wcrepuestosds_14_tfmmsrdto_to, AV66Wcrepuestosds_15_tfmmsrpre, AV67Wcrepuestosds_16_tfmmsrpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9424MMSRPre = P08VQ2_A9424MMSRPre[0] ;
         A11512MMSRDto = P08VQ2_A11512MMSRDto[0] ;
         A11511MMSRTot = P08VQ2_A11511MMSRTot[0] ;
         A9409MMSRCnt = P08VQ2_A9409MMSRCnt[0] ;
         A9421MMSRCod = P08VQ2_A9421MMSRCod[0] ;
         A9422MMSRNom = P08VQ2_A9422MMSRNom[0] ;
         n9422MMSRNom = P08VQ2_n9422MMSRNom[0] ;
         A9412MMSCod = P08VQ2_A9412MMSCod[0] ;
         A396EmprCod = P08VQ2_A396EmprCod[0] ;
         A9422MMSRNom = P08VQ2_A9422MMSRNom[0] ;
         n9422MMSRNom = P08VQ2_n9422MMSRNom[0] ;
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
            AV14TextFileLine += GXutil.str( A9412MMSCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9422MMSRNom, ";", ","), GXv_char3) ;
            wcrepuestosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9421MMSRCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9409MMSRCnt, 10, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A11511MMSRTot, 12, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A11512MMSRDto, 6, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A9424MMSRPre, 12, 3) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCRepuestosExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSCod", "", "Cod de Mov de Stock de Mantto", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSRNom", "", "Repuesto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSRCod", "", "Cod.", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSRCnt", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSRTot", "", "Precio Total", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSRDto", "", "% Dto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MMSRPre", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCRepuestosColumnsSelector", GXv_char3) ;
      wcrepuestosexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCRepuestosGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCRepuestosGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("WCRepuestosGridState"), null, null);
      }
      AV30OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV31OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSCOD") == 0 )
         {
            AV43TFMMSCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFMMSCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRNOM") == 0 )
         {
            AV37TFMMSRNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRNOM_SEL") == 0 )
         {
            AV38TFMMSRNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRCOD") == 0 )
         {
            AV35TFMMSRCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFMMSRCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRCNT") == 0 )
         {
            AV39TFMMSRCnt = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFMMSRCnt_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRTOT") == 0 )
         {
            AV45TFMMSRTot = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFMMSRTot_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRDTO") == 0 )
         {
            AV47TFMMSRDto = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFMMSRDto_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSRPRE") == 0 )
         {
            AV41TFMMSRPre = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFMMSRPre_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28EmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MMSCOD") == 0 )
         {
            AV29MMSCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
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
      A9422MMSRNom = "" ;
      A9409MMSRCnt = DecimalUtil.ZERO ;
      A11511MMSRTot = DecimalUtil.ZERO ;
      A11512MMSRDto = DecimalUtil.ZERO ;
      A9424MMSRPre = DecimalUtil.ZERO ;
      AV52Wcrepuestosds_1_emprcod = "" ;
      AV28EmprCod = "" ;
      AV56Wcrepuestosds_5_tfmmsrnom = "" ;
      AV37TFMMSRNom = "" ;
      AV57Wcrepuestosds_6_tfmmsrnom_sel = "" ;
      AV38TFMMSRNom_Sel = "" ;
      AV60Wcrepuestosds_9_tfmmsrcnt = DecimalUtil.ZERO ;
      AV39TFMMSRCnt = DecimalUtil.ZERO ;
      AV61Wcrepuestosds_10_tfmmsrcnt_to = DecimalUtil.ZERO ;
      AV40TFMMSRCnt_To = DecimalUtil.ZERO ;
      AV62Wcrepuestosds_11_tfmmsrtot = DecimalUtil.ZERO ;
      AV45TFMMSRTot = DecimalUtil.ZERO ;
      AV63Wcrepuestosds_12_tfmmsrtot_to = DecimalUtil.ZERO ;
      AV46TFMMSRTot_To = DecimalUtil.ZERO ;
      AV64Wcrepuestosds_13_tfmmsrdto = DecimalUtil.ZERO ;
      AV47TFMMSRDto = DecimalUtil.ZERO ;
      AV65Wcrepuestosds_14_tfmmsrdto_to = DecimalUtil.ZERO ;
      AV48TFMMSRDto_To = DecimalUtil.ZERO ;
      AV66Wcrepuestosds_15_tfmmsrpre = DecimalUtil.ZERO ;
      AV41TFMMSRPre = DecimalUtil.ZERO ;
      AV67Wcrepuestosds_16_tfmmsrpre_to = DecimalUtil.ZERO ;
      AV42TFMMSRPre_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV56Wcrepuestosds_5_tfmmsrnom = "" ;
      A396EmprCod = "" ;
      P08VQ2_A9424MMSRPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VQ2_A11512MMSRDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VQ2_A11511MMSRTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VQ2_A9409MMSRCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VQ2_A9421MMSRCod = new int[1] ;
      P08VQ2_A9422MMSRNom = new String[] {""} ;
      P08VQ2_n9422MMSRNom = new boolean[] {false} ;
      P08VQ2_A9412MMSCod = new int[1] ;
      P08VQ2_A396EmprCod = new String[] {""} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcrepuestosexportcsv__default(),
         new Object[] {
             new Object[] {
            P08VQ2_A9424MMSRPre, P08VQ2_A11512MMSRDto, P08VQ2_A11511MMSRTot, P08VQ2_A9409MMSRCnt, P08VQ2_A9421MMSRCod, P08VQ2_A9422MMSRNom, P08VQ2_n9422MMSRNom, P08VQ2_A9412MMSCod, P08VQ2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV30OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A9412MMSCod ;
   private int A9421MMSRCod ;
   private int AV53Wcrepuestosds_2_mmscod ;
   private int AV29MMSCod ;
   private int AV54Wcrepuestosds_3_tfmmscod ;
   private int AV43TFMMSCod ;
   private int AV55Wcrepuestosds_4_tfmmscod_to ;
   private int AV44TFMMSCod_To ;
   private int AV58Wcrepuestosds_7_tfmmsrcod ;
   private int AV35TFMMSRCod ;
   private int AV59Wcrepuestosds_8_tfmmsrcod_to ;
   private int AV36TFMMSRCod_To ;
   private int AV68GXV1 ;
   private java.math.BigDecimal A9409MMSRCnt ;
   private java.math.BigDecimal A11511MMSRTot ;
   private java.math.BigDecimal A11512MMSRDto ;
   private java.math.BigDecimal A9424MMSRPre ;
   private java.math.BigDecimal AV60Wcrepuestosds_9_tfmmsrcnt ;
   private java.math.BigDecimal AV39TFMMSRCnt ;
   private java.math.BigDecimal AV61Wcrepuestosds_10_tfmmsrcnt_to ;
   private java.math.BigDecimal AV40TFMMSRCnt_To ;
   private java.math.BigDecimal AV62Wcrepuestosds_11_tfmmsrtot ;
   private java.math.BigDecimal AV45TFMMSRTot ;
   private java.math.BigDecimal AV63Wcrepuestosds_12_tfmmsrtot_to ;
   private java.math.BigDecimal AV46TFMMSRTot_To ;
   private java.math.BigDecimal AV64Wcrepuestosds_13_tfmmsrdto ;
   private java.math.BigDecimal AV47TFMMSRDto ;
   private java.math.BigDecimal AV65Wcrepuestosds_14_tfmmsrdto_to ;
   private java.math.BigDecimal AV48TFMMSRDto_To ;
   private java.math.BigDecimal AV66Wcrepuestosds_15_tfmmsrpre ;
   private java.math.BigDecimal AV41TFMMSRPre ;
   private java.math.BigDecimal AV67Wcrepuestosds_16_tfmmsrpre_to ;
   private java.math.BigDecimal AV42TFMMSRPre_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A9422MMSRNom ;
   private String AV52Wcrepuestosds_1_emprcod ;
   private String AV28EmprCod ;
   private String AV56Wcrepuestosds_5_tfmmsrnom ;
   private String AV37TFMMSRNom ;
   private String AV57Wcrepuestosds_6_tfmmsrnom_sel ;
   private String AV38TFMMSRNom_Sel ;
   private String scmdbuf ;
   private String lV56Wcrepuestosds_5_tfmmsrnom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV31OrderedDsc ;
   private boolean n9422MMSRNom ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08VQ2_A9424MMSRPre ;
   private java.math.BigDecimal[] P08VQ2_A11512MMSRDto ;
   private java.math.BigDecimal[] P08VQ2_A11511MMSRTot ;
   private java.math.BigDecimal[] P08VQ2_A9409MMSRCnt ;
   private int[] P08VQ2_A9421MMSRCod ;
   private String[] P08VQ2_A9422MMSRNom ;
   private boolean[] P08VQ2_n9422MMSRNom ;
   private int[] P08VQ2_A9412MMSCod ;
   private String[] P08VQ2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wcrepuestosexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV54Wcrepuestosds_3_tfmmscod ,
                                          int AV55Wcrepuestosds_4_tfmmscod_to ,
                                          String AV57Wcrepuestosds_6_tfmmsrnom_sel ,
                                          String AV56Wcrepuestosds_5_tfmmsrnom ,
                                          int AV58Wcrepuestosds_7_tfmmsrcod ,
                                          int AV59Wcrepuestosds_8_tfmmsrcod_to ,
                                          java.math.BigDecimal AV60Wcrepuestosds_9_tfmmsrcnt ,
                                          java.math.BigDecimal AV61Wcrepuestosds_10_tfmmsrcnt_to ,
                                          java.math.BigDecimal AV62Wcrepuestosds_11_tfmmsrtot ,
                                          java.math.BigDecimal AV63Wcrepuestosds_12_tfmmsrtot_to ,
                                          java.math.BigDecimal AV64Wcrepuestosds_13_tfmmsrdto ,
                                          java.math.BigDecimal AV65Wcrepuestosds_14_tfmmsrdto_to ,
                                          java.math.BigDecimal AV66Wcrepuestosds_15_tfmmsrpre ,
                                          java.math.BigDecimal AV67Wcrepuestosds_16_tfmmsrpre_to ,
                                          int A9412MMSCod ,
                                          String A9422MMSRNom ,
                                          int A9421MMSRCod ,
                                          java.math.BigDecimal A9409MMSRCnt ,
                                          java.math.BigDecimal A11511MMSRTot ,
                                          java.math.BigDecimal A11512MMSRDto ,
                                          java.math.BigDecimal A9424MMSRPre ,
                                          short AV30OrderedBy ,
                                          boolean AV31OrderedDsc ,
                                          String AV52Wcrepuestosds_1_emprcod ,
                                          int AV53Wcrepuestosds_2_mmscod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[16];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.MMSRPre, T1.MMSRDto, T1.MMSRTot, T1.MMSRCnt, T1.MMSRCod AS MMSRCod, T2.MRNom AS MMSRNom, T1.MMSCod, T1.EmprCod FROM (TXPMMoStR T1 INNER JOIN TXPMREPUE" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MMSRCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MMSCod = ?)");
      if ( ! (0==AV54Wcrepuestosds_3_tfmmscod) )
      {
         addWhere(sWhereString, "(T1.MMSCod >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV55Wcrepuestosds_4_tfmmscod_to) )
      {
         addWhere(sWhereString, "(T1.MMSCod <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wcrepuestosds_6_tfmmsrnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Wcrepuestosds_5_tfmmsrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wcrepuestosds_6_tfmmsrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MRNom = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV58Wcrepuestosds_7_tfmmsrcod) )
      {
         addWhere(sWhereString, "(T1.MMSRCod >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV59Wcrepuestosds_8_tfmmsrcod_to) )
      {
         addWhere(sWhereString, "(T1.MMSRCod <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wcrepuestosds_9_tfmmsrcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRCnt >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wcrepuestosds_10_tfmmsrcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRCnt <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wcrepuestosds_11_tfmmsrtot)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRTot >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wcrepuestosds_12_tfmmsrtot_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRTot <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wcrepuestosds_13_tfmmsrdto)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRDto >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wcrepuestosds_14_tfmmsrdto_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRDto <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wcrepuestosds_15_tfmmsrpre)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRPre >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Wcrepuestosds_16_tfmmsrpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSRPre <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV30OrderedBy == 1 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod" ;
      }
      else if ( ( AV30OrderedBy == 1 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T2.MRNom" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC, T2.MRNom DESC" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T1.MMSRCod" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC, T1.MMSRCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T1.MMSRCnt" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC, T1.MMSRCnt DESC" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T1.MMSRTot" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC, T1.MMSRTot DESC" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T1.MMSRDto" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC, T1.MMSRDto DESC" ;
      }
      else if ( ( AV30OrderedBy == 7 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod, T1.MMSRPre" ;
      }
      else if ( ( AV30OrderedBy == 7 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MMSCod DESC, T1.MMSRPre DESC" ;
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
                  return conditional_P08VQ2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,3);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 3);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 3);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 3);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 3);
               }
               return;
      }
   }

}

