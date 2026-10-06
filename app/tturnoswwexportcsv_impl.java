package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tturnoswwexportcsv_impl extends GXWebProcedure
{
   public tturnoswwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TTURNOSWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TTURNOSWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TTURNOSWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Turno", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hh", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mm", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hh", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mm", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV47Tturnoswwds_1_filterfulltext = AV43FilterFullText ;
      AV48Tturnoswwds_2_tfturncod = AV33TFTurnCod ;
      AV49Tturnoswwds_3_tfturncod_to = AV34TFTurnCod_To ;
      AV50Tturnoswwds_4_tfturnhin = AV35TFTurnHin ;
      AV51Tturnoswwds_5_tfturnhin_to = AV36TFTurnHin_To ;
      AV52Tturnoswwds_6_tfturnmin = AV37TFTurnMin ;
      AV53Tturnoswwds_7_tfturnmin_to = AV38TFTurnMin_To ;
      AV54Tturnoswwds_8_tfturnhfi = AV39TFTurnHfi ;
      AV55Tturnoswwds_9_tfturnhfi_to = AV40TFTurnHfi_To ;
      AV56Tturnoswwds_10_tfturnmfi = AV41TFTurnMfi ;
      AV57Tturnoswwds_11_tfturnmfi_to = AV42TFTurnMfi_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV47Tturnoswwds_1_filterfulltext ,
                                           Byte.valueOf(AV48Tturnoswwds_2_tfturncod) ,
                                           Byte.valueOf(AV49Tturnoswwds_3_tfturncod_to) ,
                                           Byte.valueOf(AV50Tturnoswwds_4_tfturnhin) ,
                                           Byte.valueOf(AV51Tturnoswwds_5_tfturnhin_to) ,
                                           Byte.valueOf(AV52Tturnoswwds_6_tfturnmin) ,
                                           Byte.valueOf(AV53Tturnoswwds_7_tfturnmin_to) ,
                                           Byte.valueOf(AV54Tturnoswwds_8_tfturnhfi) ,
                                           Byte.valueOf(AV55Tturnoswwds_9_tfturnhfi_to) ,
                                           Byte.valueOf(AV56Tturnoswwds_10_tfturnmfi) ,
                                           Byte.valueOf(AV57Tturnoswwds_11_tfturnmfi_to) ,
                                           Byte.valueOf(A1161TurnCod) ,
                                           Byte.valueOf(A1162TurnHin) ,
                                           Byte.valueOf(A1163TurnMin) ,
                                           Byte.valueOf(A1164TurnHfi) ,
                                           Byte.valueOf(A1165TurnMfi) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV47Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Tturnoswwds_1_filterfulltext), "%", "") ;
      lV47Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Tturnoswwds_1_filterfulltext), "%", "") ;
      lV47Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Tturnoswwds_1_filterfulltext), "%", "") ;
      lV47Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Tturnoswwds_1_filterfulltext), "%", "") ;
      lV47Tturnoswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Tturnoswwds_1_filterfulltext), "%", "") ;
      /* Using cursor P08AX2 */
      pr_default.execute(0, new Object[] {lV47Tturnoswwds_1_filterfulltext, lV47Tturnoswwds_1_filterfulltext, lV47Tturnoswwds_1_filterfulltext, lV47Tturnoswwds_1_filterfulltext, lV47Tturnoswwds_1_filterfulltext, Byte.valueOf(AV48Tturnoswwds_2_tfturncod), Byte.valueOf(AV49Tturnoswwds_3_tfturncod_to), Byte.valueOf(AV50Tturnoswwds_4_tfturnhin), Byte.valueOf(AV51Tturnoswwds_5_tfturnhin_to), Byte.valueOf(AV52Tturnoswwds_6_tfturnmin), Byte.valueOf(AV53Tturnoswwds_7_tfturnmin_to), Byte.valueOf(AV54Tturnoswwds_8_tfturnhfi), Byte.valueOf(AV55Tturnoswwds_9_tfturnhfi_to), Byte.valueOf(AV56Tturnoswwds_10_tfturnmfi), Byte.valueOf(AV57Tturnoswwds_11_tfturnmfi_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1165TurnMfi = P08AX2_A1165TurnMfi[0] ;
         n1165TurnMfi = P08AX2_n1165TurnMfi[0] ;
         A1164TurnHfi = P08AX2_A1164TurnHfi[0] ;
         n1164TurnHfi = P08AX2_n1164TurnHfi[0] ;
         A1163TurnMin = P08AX2_A1163TurnMin[0] ;
         n1163TurnMin = P08AX2_n1163TurnMin[0] ;
         A1162TurnHin = P08AX2_A1162TurnHin[0] ;
         n1162TurnHin = P08AX2_n1162TurnHin[0] ;
         A1161TurnCod = P08AX2_A1161TurnCod[0] ;
         A396EmprCod = P08AX2_A396EmprCod[0] ;
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
            AV14TextFileLine += GXutil.str( A1161TurnCod, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1162TurnHin, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1163TurnMin, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1164TurnHfi, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1165TurnMfi, 2, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TTURNOSWWExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "TurnCod", "", "Turno", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "TurnHin", "Inicio", "Hh", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "TurnMin", "Inicio", "Mm", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "TurnHfi", "Fin", "Hh", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXv_SdtWWPColumnsSelector2[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, "TurnMfi", "Fin", "Mm", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector2[0] ;
      GXt_char3 = AV20UserCustomValue ;
      GXv_char4[0] = GXt_char3 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTURNOSWWColumnsSelector", GXv_char4) ;
      tturnoswwexportcsv_impl.this.GXt_char3 = GXv_char4[0] ;
      AV20UserCustomValue = GXt_char3 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector2[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector2, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector2[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("TTURNOSWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTURNOSWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("TTURNOSWWGridState"), null, null);
      }
      AV28OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV58GXV1 = 1 ;
      while ( AV58GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV58GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV43FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNCOD") == 0 )
         {
            AV33TFTurnCod = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFTurnCod_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNHIN") == 0 )
         {
            AV35TFTurnHin = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFTurnHin_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNMIN") == 0 )
         {
            AV37TFTurnMin = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV38TFTurnMin_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNHFI") == 0 )
         {
            AV39TFTurnHfi = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFTurnHfi_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTURNMFI") == 0 )
         {
            AV41TFTurnMfi = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFTurnMfi_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
      AV47Tturnoswwds_1_filterfulltext = "" ;
      AV43FilterFullText = "" ;
      scmdbuf = "" ;
      lV47Tturnoswwds_1_filterfulltext = "" ;
      P08AX2_A1165TurnMfi = new byte[1] ;
      P08AX2_n1165TurnMfi = new boolean[] {false} ;
      P08AX2_A1164TurnHfi = new byte[1] ;
      P08AX2_n1164TurnHfi = new boolean[] {false} ;
      P08AX2_A1163TurnMin = new byte[1] ;
      P08AX2_n1163TurnMin = new boolean[] {false} ;
      P08AX2_A1162TurnHin = new byte[1] ;
      P08AX2_n1162TurnHin = new boolean[] {false} ;
      P08AX2_A1161TurnCod = new byte[1] ;
      P08AX2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector2 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tturnoswwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08AX2_A1165TurnMfi, P08AX2_n1165TurnMfi, P08AX2_A1164TurnHfi, P08AX2_n1164TurnHfi, P08AX2_A1163TurnMin, P08AX2_n1163TurnMin, P08AX2_A1162TurnHin, P08AX2_n1162TurnHin, P08AX2_A1161TurnCod, P08AX2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1161TurnCod ;
   private byte A1162TurnHin ;
   private byte A1163TurnMin ;
   private byte A1164TurnHfi ;
   private byte A1165TurnMfi ;
   private byte AV48Tturnoswwds_2_tfturncod ;
   private byte AV33TFTurnCod ;
   private byte AV49Tturnoswwds_3_tfturncod_to ;
   private byte AV34TFTurnCod_To ;
   private byte AV50Tturnoswwds_4_tfturnhin ;
   private byte AV35TFTurnHin ;
   private byte AV51Tturnoswwds_5_tfturnhin_to ;
   private byte AV36TFTurnHin_To ;
   private byte AV52Tturnoswwds_6_tfturnmin ;
   private byte AV37TFTurnMin ;
   private byte AV53Tturnoswwds_7_tfturnmin_to ;
   private byte AV38TFTurnMin_To ;
   private byte AV54Tturnoswwds_8_tfturnhfi ;
   private byte AV39TFTurnHfi ;
   private byte AV55Tturnoswwds_9_tfturnhfi_to ;
   private byte AV40TFTurnHfi_To ;
   private byte AV56Tturnoswwds_10_tfturnmfi ;
   private byte AV41TFTurnMfi ;
   private byte AV57Tturnoswwds_11_tfturnmfi_to ;
   private byte AV42TFTurnMfi_To ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV58GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n1165TurnMfi ;
   private boolean n1164TurnHfi ;
   private boolean n1163TurnMin ;
   private boolean n1162TurnHin ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV47Tturnoswwds_1_filterfulltext ;
   private String AV43FilterFullText ;
   private String lV47Tturnoswwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P08AX2_A1165TurnMfi ;
   private boolean[] P08AX2_n1165TurnMfi ;
   private byte[] P08AX2_A1164TurnHfi ;
   private boolean[] P08AX2_n1164TurnHfi ;
   private byte[] P08AX2_A1163TurnMin ;
   private boolean[] P08AX2_n1163TurnMin ;
   private byte[] P08AX2_A1162TurnHin ;
   private boolean[] P08AX2_n1162TurnHin ;
   private byte[] P08AX2_A1161TurnCod ;
   private String[] P08AX2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector2[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class tturnoswwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08AX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Tturnoswwds_1_filterfulltext ,
                                          byte AV48Tturnoswwds_2_tfturncod ,
                                          byte AV49Tturnoswwds_3_tfturncod_to ,
                                          byte AV50Tturnoswwds_4_tfturnhin ,
                                          byte AV51Tturnoswwds_5_tfturnhin_to ,
                                          byte AV52Tturnoswwds_6_tfturnmin ,
                                          byte AV53Tturnoswwds_7_tfturnmin_to ,
                                          byte AV54Tturnoswwds_8_tfturnhfi ,
                                          byte AV55Tturnoswwds_9_tfturnhfi_to ,
                                          byte AV56Tturnoswwds_10_tfturnmfi ,
                                          byte AV57Tturnoswwds_11_tfturnmfi_to ,
                                          byte A1161TurnCod ,
                                          byte A1162TurnHin ,
                                          byte A1163TurnMin ,
                                          byte A1164TurnHfi ,
                                          byte A1165TurnMfi ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[15];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT TurnMfi, TurnHfi, TurnMin, TurnHin, TurnCod, EmprCod FROM TXPTURNOS" ;
      if ( ! (GXutil.strcmp("", AV47Tturnoswwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TurnCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TurnHin,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TurnMin,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TurnHfi,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(TurnMfi,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV48Tturnoswwds_2_tfturncod) )
      {
         addWhere(sWhereString, "(TurnCod >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV49Tturnoswwds_3_tfturncod_to) )
      {
         addWhere(sWhereString, "(TurnCod <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV50Tturnoswwds_4_tfturnhin) )
      {
         addWhere(sWhereString, "(TurnHin >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV51Tturnoswwds_5_tfturnhin_to) )
      {
         addWhere(sWhereString, "(TurnHin <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV52Tturnoswwds_6_tfturnmin) )
      {
         addWhere(sWhereString, "(TurnMin >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV53Tturnoswwds_7_tfturnmin_to) )
      {
         addWhere(sWhereString, "(TurnMin <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV54Tturnoswwds_8_tfturnhfi) )
      {
         addWhere(sWhereString, "(TurnHfi >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV55Tturnoswwds_9_tfturnhfi_to) )
      {
         addWhere(sWhereString, "(TurnHfi <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV56Tturnoswwds_10_tfturnmfi) )
      {
         addWhere(sWhereString, "(TurnMfi >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV57Tturnoswwds_11_tfturnmfi_to) )
      {
         addWhere(sWhereString, "(TurnMfi <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnHin" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnHin DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnMin" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnMin DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnHfi" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnHfi DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY TurnMfi" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY TurnMfi DESC" ;
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
                  return conditional_P08AX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , ((Boolean) dynConstraints[17]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08AX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               return;
      }
   }

}

