package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tintenswwexportcsv_impl extends GXWebProcedure
{
   public tintenswwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TINTENSWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.TINTENSWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.TINTENSWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Intensidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Activa?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tiempo de Lavado(hh,mm)", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV48Formulaciontinte_tintenswwds_1_filterfulltext = AV37FilterFullText ;
      AV49Formulaciontinte_tintenswwds_2_tfintcod = AV33TFIntCod ;
      AV50Formulaciontinte_tintenswwds_3_tfintcod_to = AV34TFIntCod_To ;
      AV51Formulaciontinte_tintenswwds_4_tfintdsc = AV35TFIntDsc ;
      AV52Formulaciontinte_tintenswwds_5_tfintdsc_sel = AV36TFIntDsc_Sel ;
      AV53Formulaciontinte_tintenswwds_6_tfintact_sel = AV44TFIntAct_Sel ;
      AV54Formulaciontinte_tintenswwds_7_tfintorder = AV40TFIntOrder ;
      AV55Formulaciontinte_tintenswwds_8_tfintorder_to = AV41TFIntOrder_To ;
      AV56Formulaciontinte_tintenswwds_9_tfintlava = AV42TFIntLava ;
      AV57Formulaciontinte_tintenswwds_10_tfintlava_to = AV43TFIntLava_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Formulaciontinte_tintenswwds_1_filterfulltext ,
                                           Byte.valueOf(AV49Formulaciontinte_tintenswwds_2_tfintcod) ,
                                           Byte.valueOf(AV50Formulaciontinte_tintenswwds_3_tfintcod_to) ,
                                           AV52Formulaciontinte_tintenswwds_5_tfintdsc_sel ,
                                           AV51Formulaciontinte_tintenswwds_4_tfintdsc ,
                                           AV53Formulaciontinte_tintenswwds_6_tfintact_sel ,
                                           Short.valueOf(AV54Formulaciontinte_tintenswwds_7_tfintorder) ,
                                           Short.valueOf(AV55Formulaciontinte_tintenswwds_8_tfintorder_to) ,
                                           AV56Formulaciontinte_tintenswwds_9_tfintlava ,
                                           AV57Formulaciontinte_tintenswwds_10_tfintlava_to ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Short.valueOf(A13296IntOrder) ,
                                           A5991IntLava ,
                                           A14255IntAct ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV48Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV48Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV48Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV48Formulaciontinte_tintenswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_tintenswwds_1_filterfulltext), "%", "") ;
      lV51Formulaciontinte_tintenswwds_4_tfintdsc = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_tintenswwds_4_tfintdsc), 30, "%") ;
      /* Using cursor P08H42 */
      pr_default.execute(0, new Object[] {lV48Formulaciontinte_tintenswwds_1_filterfulltext, lV48Formulaciontinte_tintenswwds_1_filterfulltext, lV48Formulaciontinte_tintenswwds_1_filterfulltext, lV48Formulaciontinte_tintenswwds_1_filterfulltext, Byte.valueOf(AV49Formulaciontinte_tintenswwds_2_tfintcod), Byte.valueOf(AV50Formulaciontinte_tintenswwds_3_tfintcod_to), lV51Formulaciontinte_tintenswwds_4_tfintdsc, AV52Formulaciontinte_tintenswwds_5_tfintdsc_sel, AV53Formulaciontinte_tintenswwds_6_tfintact_sel, Short.valueOf(AV54Formulaciontinte_tintenswwds_7_tfintorder), Short.valueOf(AV55Formulaciontinte_tintenswwds_8_tfintorder_to), AV56Formulaciontinte_tintenswwds_9_tfintlava, AV57Formulaciontinte_tintenswwds_10_tfintlava_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5991IntLava = P08H42_A5991IntLava[0] ;
         n5991IntLava = P08H42_n5991IntLava[0] ;
         A13296IntOrder = P08H42_A13296IntOrder[0] ;
         n13296IntOrder = P08H42_n13296IntOrder[0] ;
         A14255IntAct = P08H42_A14255IntAct[0] ;
         A584IntDsc = P08H42_A584IntDsc[0] ;
         n584IntDsc = P08H42_n584IntDsc[0] ;
         A583IntCod = P08H42_A583IntCod[0] ;
         A396EmprCod = P08H42_A396EmprCod[0] ;
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
            AV14TextFileLine += GXutil.str( A583IntCod, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A584IntDsc, ";", ","), GXv_char3) ;
            tintenswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14255IntAct, ";", ","), GXv_char3) ;
            tintenswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13296IntOrder, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A5991IntLava, 7, 2) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TINTENSWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "IntCod", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "IntDsc", "", "Intensidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "IntAct", "", "Activa?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "IntOrder", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "IntLava", "", "Tiempo de Lavado(hh,mm)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.TINTENSWWColumnsSelector", GXv_char3) ;
      tintenswwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.TINTENSWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.TINTENSWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("FormulacionTinte.TINTENSWWGridState"), null, null);
      }
      AV28OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV37FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCOD") == 0 )
         {
            AV33TFIntCod = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFIntCod_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV35TFIntDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV36TFIntDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTACT_SEL") == 0 )
         {
            AV44TFIntAct_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTORDER") == 0 )
         {
            AV40TFIntOrder = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFIntOrder_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTLAVA") == 0 )
         {
            AV42TFIntLava = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFIntLava_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
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
      A584IntDsc = "" ;
      A14255IntAct = "" ;
      A5991IntLava = DecimalUtil.ZERO ;
      AV48Formulaciontinte_tintenswwds_1_filterfulltext = "" ;
      AV37FilterFullText = "" ;
      AV51Formulaciontinte_tintenswwds_4_tfintdsc = "" ;
      AV35TFIntDsc = "" ;
      AV52Formulaciontinte_tintenswwds_5_tfintdsc_sel = "" ;
      AV36TFIntDsc_Sel = "" ;
      AV53Formulaciontinte_tintenswwds_6_tfintact_sel = "" ;
      AV44TFIntAct_Sel = "" ;
      AV56Formulaciontinte_tintenswwds_9_tfintlava = DecimalUtil.ZERO ;
      AV42TFIntLava = DecimalUtil.ZERO ;
      AV57Formulaciontinte_tintenswwds_10_tfintlava_to = DecimalUtil.ZERO ;
      AV43TFIntLava_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV48Formulaciontinte_tintenswwds_1_filterfulltext = "" ;
      lV51Formulaciontinte_tintenswwds_4_tfintdsc = "" ;
      P08H42_A5991IntLava = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08H42_n5991IntLava = new boolean[] {false} ;
      P08H42_A13296IntOrder = new short[1] ;
      P08H42_n13296IntOrder = new boolean[] {false} ;
      P08H42_A14255IntAct = new String[] {""} ;
      P08H42_A584IntDsc = new String[] {""} ;
      P08H42_n584IntDsc = new boolean[] {false} ;
      P08H42_A583IntCod = new byte[1] ;
      P08H42_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.tintenswwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08H42_A5991IntLava, P08H42_n5991IntLava, P08H42_A13296IntOrder, P08H42_n13296IntOrder, P08H42_A14255IntAct, P08H42_A584IntDsc, P08H42_n584IntDsc, P08H42_A583IntCod, P08H42_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A583IntCod ;
   private byte AV49Formulaciontinte_tintenswwds_2_tfintcod ;
   private byte AV33TFIntCod ;
   private byte AV50Formulaciontinte_tintenswwds_3_tfintcod_to ;
   private byte AV34TFIntCod_To ;
   private short gxcookieaux ;
   private short A13296IntOrder ;
   private short AV54Formulaciontinte_tintenswwds_7_tfintorder ;
   private short AV40TFIntOrder ;
   private short AV55Formulaciontinte_tintenswwds_8_tfintorder_to ;
   private short AV41TFIntOrder_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV58GXV1 ;
   private java.math.BigDecimal A5991IntLava ;
   private java.math.BigDecimal AV56Formulaciontinte_tintenswwds_9_tfintlava ;
   private java.math.BigDecimal AV42TFIntLava ;
   private java.math.BigDecimal AV57Formulaciontinte_tintenswwds_10_tfintlava_to ;
   private java.math.BigDecimal AV43TFIntLava_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A584IntDsc ;
   private String A14255IntAct ;
   private String AV51Formulaciontinte_tintenswwds_4_tfintdsc ;
   private String AV35TFIntDsc ;
   private String AV52Formulaciontinte_tintenswwds_5_tfintdsc_sel ;
   private String AV36TFIntDsc_Sel ;
   private String AV53Formulaciontinte_tintenswwds_6_tfintact_sel ;
   private String AV44TFIntAct_Sel ;
   private String scmdbuf ;
   private String lV51Formulaciontinte_tintenswwds_4_tfintdsc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n5991IntLava ;
   private boolean n13296IntOrder ;
   private boolean n584IntDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV48Formulaciontinte_tintenswwds_1_filterfulltext ;
   private String AV37FilterFullText ;
   private String lV48Formulaciontinte_tintenswwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P08H42_A5991IntLava ;
   private boolean[] P08H42_n5991IntLava ;
   private short[] P08H42_A13296IntOrder ;
   private boolean[] P08H42_n13296IntOrder ;
   private String[] P08H42_A14255IntAct ;
   private String[] P08H42_A584IntDsc ;
   private boolean[] P08H42_n584IntDsc ;
   private byte[] P08H42_A583IntCod ;
   private String[] P08H42_A396EmprCod ;
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

final  class tintenswwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08H42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Formulaciontinte_tintenswwds_1_filterfulltext ,
                                          byte AV49Formulaciontinte_tintenswwds_2_tfintcod ,
                                          byte AV50Formulaciontinte_tintenswwds_3_tfintcod_to ,
                                          String AV52Formulaciontinte_tintenswwds_5_tfintdsc_sel ,
                                          String AV51Formulaciontinte_tintenswwds_4_tfintdsc ,
                                          String AV53Formulaciontinte_tintenswwds_6_tfintact_sel ,
                                          short AV54Formulaciontinte_tintenswwds_7_tfintorder ,
                                          short AV55Formulaciontinte_tintenswwds_8_tfintorder_to ,
                                          java.math.BigDecimal AV56Formulaciontinte_tintenswwds_9_tfintlava ,
                                          java.math.BigDecimal AV57Formulaciontinte_tintenswwds_10_tfintlava_to ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          short A13296IntOrder ,
                                          java.math.BigDecimal A5991IntLava ,
                                          String A14255IntAct ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[13];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT IntLava, IntOrder, IntAct, IntDsc, IntCod, EmprCod FROM TXPINTENS" ;
      if ( ! (GXutil.strcmp("", AV48Formulaciontinte_tintenswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(IntCod,'90'), 2) like '%' || ?) or ( UPPER(IntDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(IntOrder,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(IntLava,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV49Formulaciontinte_tintenswwds_2_tfintcod) )
      {
         addWhere(sWhereString, "(IntCod >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_tintenswwds_3_tfintcod_to) )
      {
         addWhere(sWhereString, "(IntCod <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Formulaciontinte_tintenswwds_5_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_tintenswwds_4_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_tintenswwds_5_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(IntDsc = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_tintenswwds_6_tfintact_sel)==0) )
      {
         addWhere(sWhereString, "(IntAct = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_tintenswwds_7_tfintorder) )
      {
         addWhere(sWhereString, "(IntOrder >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV55Formulaciontinte_tintenswwds_8_tfintorder_to) )
      {
         addWhere(sWhereString, "(IntOrder <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Formulaciontinte_tintenswwds_9_tfintlava)==0) )
      {
         addWhere(sWhereString, "(IntLava >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Formulaciontinte_tintenswwds_10_tfintlava_to)==0) )
      {
         addWhere(sWhereString, "(IntLava <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY IntCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY IntDsc" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY IntAct" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntAct DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY IntOrder" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntOrder DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY IntLava" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY IntLava DESC" ;
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
                  return conditional_P08H42(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08H42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               return;
      }
   }

}

