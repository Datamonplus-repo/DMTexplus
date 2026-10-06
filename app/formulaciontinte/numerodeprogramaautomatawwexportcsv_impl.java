package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class numerodeprogramaautomatawwexportcsv_impl extends GXWebProcedure
{
   public numerodeprogramaautomatawwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "NumerodeProgramaAutomataWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.NumerodeProgramaAutomataWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.NumerodeProgramaAutomataWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº de Programa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion (mayor)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Programa Cent.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº de Formulas", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV52Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = AV34TFMacProCod ;
      AV53Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel = AV35TFMacProCod_Sel ;
      AV54Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = AV36TFMacProDsc ;
      AV55Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel = AV37TFMacProDsc_Sel ;
      AV56Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = AV38TFMacProDsc2 ;
      AV57Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel = AV39TFMacProDsc2_Sel ;
      AV58Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg = AV40TFMacNumPrg ;
      AV59Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to = AV41TFMacNumPrg_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ,
                                           AV52Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ,
                                           AV55Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ,
                                           AV54Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ,
                                           AV57Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ,
                                           AV56Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ,
                                           Integer.valueOf(AV58Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg) ,
                                           Integer.valueOf(AV59Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to) ,
                                           A1514MacProCod ,
                                           A1515MacProDsc ,
                                           A6231MacProDsc2 ,
                                           Integer.valueOf(A6096MacNumPrg) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV52Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = GXutil.padr( GXutil.rtrim( AV52Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod), 6, "%") ;
      lV54Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc), 20, "%") ;
      lV56Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2), 60, "%") ;
      /* Using cursor P09CH2 */
      pr_default.execute(0, new Object[] {lV52Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod, AV53Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel, lV54Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc, AV55Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel, lV56Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2, AV57Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel, Integer.valueOf(AV58Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg), Integer.valueOf(AV59Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6096MacNumPrg = P09CH2_A6096MacNumPrg[0] ;
         A6231MacProDsc2 = P09CH2_A6231MacProDsc2[0] ;
         A1515MacProDsc = P09CH2_A1515MacProDsc[0] ;
         A1514MacProCod = P09CH2_A1514MacProCod[0] ;
         A396EmprCod = P09CH2_A396EmprCod[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1514MacProCod, ";", ","), GXv_char3) ;
            numerodeprogramaautomatawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1515MacProDsc, ";", ","), GXv_char3) ;
            numerodeprogramaautomatawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6231MacProDsc2, ";", ","), GXv_char3) ;
            numerodeprogramaautomatawwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A6096MacNumPrg, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_int4 = AV48NumerodeFormulas ;
            GXv_char3[0] = A396EmprCod ;
            GXv_char5[0] = A1514MacProCod ;
            GXv_int6[0] = (byte)(2) ;
            GXv_int7[0] = GXt_int4 ;
            new app.pmacpro(remoteHandle, context).execute( GXv_char3, GXv_char5, GXv_int6, GXv_int7) ;
            numerodeprogramaautomatawwexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
            numerodeprogramaautomatawwexportcsv_impl.this.A1514MacProCod = GXv_char5[0] ;
            numerodeprogramaautomatawwexportcsv_impl.this.GXt_int4 = GXv_int7[0] ;
            AV48NumerodeFormulas = (short)(GXt_int4) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV48NumerodeFormulas, 4, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=NumerodeProgramaAutomataWWExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector8[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MacProCod", "", "Nº de Programa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MacProDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MacProDsc2", "", "Descripcion (mayor)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MacNumPrg", "", "Nº Programa Cent.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&NumerodeFormulas", "", "Nº de Formulas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.NumerodeProgramaAutomataWWColumnsSelector", GXv_char5) ;
      numerodeprogramaautomatawwexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.NumerodeProgramaAutomataWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.NumerodeProgramaAutomataWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("FormulacionTinte.NumerodeProgramaAutomataWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPROCOD") == 0 )
         {
            AV34TFMacProCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPROCOD_SEL") == 0 )
         {
            AV35TFMacProCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC") == 0 )
         {
            AV36TFMacProDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC_SEL") == 0 )
         {
            AV37TFMacProDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC2") == 0 )
         {
            AV38TFMacProDsc2 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC2_SEL") == 0 )
         {
            AV39TFMacProDsc2_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACNUMPRG") == 0 )
         {
            AV40TFMacNumPrg = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFMacNumPrg_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
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
      A1514MacProCod = "" ;
      A1515MacProDsc = "" ;
      A6231MacProDsc2 = "" ;
      A396EmprCod = "" ;
      AV52Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = "" ;
      AV34TFMacProCod = "" ;
      AV53Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel = "" ;
      AV35TFMacProCod_Sel = "" ;
      AV54Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = "" ;
      AV36TFMacProDsc = "" ;
      AV55Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel = "" ;
      AV37TFMacProDsc_Sel = "" ;
      AV56Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = "" ;
      AV38TFMacProDsc2 = "" ;
      AV57Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel = "" ;
      AV39TFMacProDsc2_Sel = "" ;
      scmdbuf = "" ;
      lV52Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = "" ;
      lV54Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = "" ;
      lV56Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = "" ;
      P09CH2_A6096MacNumPrg = new int[1] ;
      P09CH2_A6231MacProDsc2 = new String[] {""} ;
      P09CH2_A1515MacProDsc = new String[] {""} ;
      P09CH2_A1514MacProCod = new String[] {""} ;
      P09CH2_A396EmprCod = new String[] {""} ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int7 = new int[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.numerodeprogramaautomatawwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09CH2_A6096MacNumPrg, P09CH2_A6231MacProDsc2, P09CH2_A1515MacProDsc, P09CH2_A1514MacProCod, P09CH2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXv_int6[] ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short AV48NumerodeFormulas ;
   private short Gx_err ;
   private int AV13Random ;
   private int A6096MacNumPrg ;
   private int AV58Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg ;
   private int AV40TFMacNumPrg ;
   private int AV59Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to ;
   private int AV41TFMacNumPrg_To ;
   private int GXt_int4 ;
   private int GXv_int7[] ;
   private int AV60GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A1514MacProCod ;
   private String A1515MacProDsc ;
   private String A6231MacProDsc2 ;
   private String A396EmprCod ;
   private String AV52Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ;
   private String AV34TFMacProCod ;
   private String AV53Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ;
   private String AV35TFMacProCod_Sel ;
   private String AV54Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ;
   private String AV36TFMacProDsc ;
   private String AV55Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ;
   private String AV37TFMacProDsc_Sel ;
   private String AV56Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ;
   private String AV38TFMacProDsc2 ;
   private String AV57Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ;
   private String AV39TFMacProDsc2_Sel ;
   private String scmdbuf ;
   private String lV52Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ;
   private String lV54Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ;
   private String lV56Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ;
   private String GXv_char3[] ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P09CH2_A6096MacNumPrg ;
   private String[] P09CH2_A6231MacProDsc2 ;
   private String[] P09CH2_A1515MacProDsc ;
   private String[] P09CH2_A1514MacProCod ;
   private String[] P09CH2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class numerodeprogramaautomatawwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09CH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ,
                                          String AV52Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ,
                                          String AV55Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ,
                                          String AV54Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ,
                                          String AV57Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ,
                                          String AV56Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ,
                                          int AV58Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg ,
                                          int AV59Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to ,
                                          String A1514MacProCod ,
                                          String A1515MacProDsc ,
                                          String A6231MacProDsc2 ,
                                          int A6096MacNumPrg ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[8];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT MacNumPrg, MacProDsc2, MacProDsc, MacProCod, EmprCod FROM TXPCMACPR" ;
      if ( (GXutil.strcmp("", AV53Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel)==0) && ( ! (GXutil.strcmp("", AV52Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel)==0) )
      {
         addWhere(sWhereString, "(MacProCod = ?)");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(MacProDsc = ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(MacProDsc2 = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (0==AV58Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg) )
      {
         addWhere(sWhereString, "(MacNumPrg >= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to) )
      {
         addWhere(sWhereString, "(MacNumPrg <= ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MacProCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MacProCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MacProDsc" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MacProDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MacProDsc2" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MacProDsc2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MacNumPrg" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MacNumPrg DESC" ;
      }
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_P09CH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09CH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 60);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 60);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
      }
   }

}

