package app.expedicionesautomatizadas ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwhdrpzigetfilterdata extends GXProcedure
{
   public webwhdrpzigetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwhdrpzigetfilterdata.class ), "" );
   }

   public webwhdrpzigetfilterdata( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      webwhdrpzigetfilterdata.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      webwhdrpzigetfilterdata.this.AV32DDOName = aP0;
      webwhdrpzigetfilterdata.this.AV33SearchTxt = aP1;
      webwhdrpzigetfilterdata.this.AV34SearchTxtTo = aP2;
      webwhdrpzigetfilterdata.this.aP3 = aP3;
      webwhdrpzigetfilterdata.this.aP4 = aP4;
      webwhdrpzigetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_BARPIECOD") == 0 )
      {
         /* Execute user subroutine: 'LOADBARPIECODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV35OptionsJson = AV22Options.toJSonString(false) ;
      AV36OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV25OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebWHDRPZIGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIGridState"), null, null);
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV55GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD") == 0 )
         {
            AV10TFBarPieCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD_SEL") == 0 )
         {
            AV11TFBarPieCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV12TFBarPieKil = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV13TFBarPieKil_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV14TFBarPieMet = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFBarPieMet_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEANC") == 0 )
         {
            AV16TFBarPieAnc = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFBarPieAnc_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEEST") == 0 )
         {
            AV18TFBarPieEst = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFBarPieEst_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV39EmprCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPECOD") == 0 )
         {
            AV40OpeCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPENOM") == 0 )
         {
            AV41OpeNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV42MaqCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQNOM") == 0 )
         {
            AV43MaqNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASCOD") == 0 )
         {
            AV44FasCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASDSC") == 0 )
         {
            AV45FasDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV46BarCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV47BarCodReo = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV48BarCodPar = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARORDLIN") == 0 )
         {
            AV49BarOrdlin = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARANCACA1") == 0 )
         {
            AV50BarAncAca1 = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MSG_I") == 0 )
         {
            AV51Msg_i = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LECFEC") == 0 )
         {
            AV52Lecfec = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARPIECODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarPieCod = AV33SearchTxt ;
      AV11TFBarPieCod_Sel = "" ;
      AV57Expedicionesautomatizadas_webwhdrpzids_1_emprcod = AV39EmprCod ;
      AV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = AV38FilterFullText ;
      AV59Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = AV10TFBarPieCod ;
      AV60Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = AV11TFBarPieCod_Sel ;
      AV61Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = AV12TFBarPieKil ;
      AV62Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = AV13TFBarPieKil_To ;
      AV63Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = AV14TFBarPieMet ;
      AV64Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = AV15TFBarPieMet_To ;
      AV65Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc = AV16TFBarPieAnc ;
      AV66Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to = AV17TFBarPieAnc_To ;
      AV67Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest = AV18TFBarPieEst ;
      AV68Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to = AV19TFBarPieEst_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ,
                                           AV60Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ,
                                           AV59Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ,
                                           AV61Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ,
                                           AV62Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ,
                                           AV63Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ,
                                           AV64Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ,
                                           Short.valueOf(AV65Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc) ,
                                           Short.valueOf(AV66Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to) ,
                                           Byte.valueOf(AV67Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest) ,
                                           Byte.valueOf(AV68Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to) ,
                                           A200BarPieCod ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Short.valueOf(A1691BarPieAnc) ,
                                           A6116BarPieImp ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           A396EmprCod ,
                                           AV39EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV46BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV47BarCodReo) ,
                                           A130BarCodPar ,
                                           AV48BarCodPar ,
                                           AV57Expedicionesautomatizadas_webwhdrpzids_1_emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV59Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV59Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod), 9, "%") ;
      /* Using cursor P09C42 */
      pr_default.execute(0, new Object[] {AV57Expedicionesautomatizadas_webwhdrpzids_1_emprcod, AV39EmprCod, Integer.valueOf(AV46BarCod), Byte.valueOf(AV47BarCodReo), AV48BarCodPar, lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV59Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod, AV60Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel, AV61Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil, AV62Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to, AV63Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet, AV64Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to, Short.valueOf(AV65Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc), Short.valueOf(AV66Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to), Byte.valueOf(AV67Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest), Byte.valueOf(AV68Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9C42 = false ;
         A200BarPieCod = P09C42_A200BarPieCod[0] ;
         A396EmprCod = P09C42_A396EmprCod[0] ;
         A130BarCodPar = P09C42_A130BarCodPar[0] ;
         A132BarCodReo = P09C42_A132BarCodReo[0] ;
         A129BarCod = P09C42_A129BarCod[0] ;
         A6116BarPieImp = P09C42_A6116BarPieImp[0] ;
         n6116BarPieImp = P09C42_n6116BarPieImp[0] ;
         A201BarPieEst = P09C42_A201BarPieEst[0] ;
         A1691BarPieAnc = P09C42_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P09C42_n1691BarPieAnc[0] ;
         A205BarPieMet = P09C42_A205BarPieMet[0] ;
         A203BarPieKil = P09C42_A203BarPieKil[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09C42_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09C42_A200BarPieCod[0], A200BarPieCod) == 0 ) )
         {
            brk9C42 = false ;
            A130BarCodPar = P09C42_A130BarCodPar[0] ;
            A132BarCodReo = P09C42_A132BarCodReo[0] ;
            A129BarCod = P09C42_A129BarCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9C42 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A200BarPieCod)==0) )
         {
            AV21Option = A200BarPieCod ;
            AV22Options.add(AV21Option, 0);
            AV25OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV22Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9C42 )
         {
            brk9C42 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwhdrpzigetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = webwhdrpzigetfilterdata.this.AV36OptionsDescJson;
      this.aP5[0] = webwhdrpzigetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV35OptionsJson = "" ;
      AV36OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV22Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV25OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV38FilterFullText = "" ;
      AV10TFBarPieCod = "" ;
      AV11TFBarPieCod_Sel = "" ;
      AV12TFBarPieKil = DecimalUtil.ZERO ;
      AV13TFBarPieKil_To = DecimalUtil.ZERO ;
      AV14TFBarPieMet = DecimalUtil.ZERO ;
      AV15TFBarPieMet_To = DecimalUtil.ZERO ;
      AV39EmprCod = "" ;
      AV41OpeNom = "" ;
      AV42MaqCod = "" ;
      AV43MaqNom = "" ;
      AV44FasCod = "" ;
      AV45FasDsc = "" ;
      AV48BarCodPar = "" ;
      AV51Msg_i = "" ;
      AV52Lecfec = GXutil.nullDate() ;
      A200BarPieCod = "" ;
      AV57Expedicionesautomatizadas_webwhdrpzids_1_emprcod = "" ;
      AV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = "" ;
      AV59Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = "" ;
      AV60Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = "" ;
      AV61Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = DecimalUtil.ZERO ;
      AV62Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV63Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = DecimalUtil.ZERO ;
      AV64Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = "" ;
      lV59Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A6116BarPieImp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09C42_A200BarPieCod = new String[] {""} ;
      P09C42_A396EmprCod = new String[] {""} ;
      P09C42_A130BarCodPar = new String[] {""} ;
      P09C42_A132BarCodReo = new byte[1] ;
      P09C42_A129BarCod = new int[1] ;
      P09C42_A6116BarPieImp = new String[] {""} ;
      P09C42_n6116BarPieImp = new boolean[] {false} ;
      P09C42_A201BarPieEst = new byte[1] ;
      P09C42_A1691BarPieAnc = new short[1] ;
      P09C42_n1691BarPieAnc = new boolean[] {false} ;
      P09C42_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C42_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV21Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webwhdrpzigetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09C42_A200BarPieCod, P09C42_A396EmprCod, P09C42_A130BarCodPar, P09C42_A132BarCodReo, P09C42_A129BarCod, P09C42_A6116BarPieImp, P09C42_n6116BarPieImp, P09C42_A201BarPieEst, P09C42_A1691BarPieAnc, P09C42_n1691BarPieAnc,
            P09C42_A205BarPieMet, P09C42_A203BarPieKil
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TFBarPieEst ;
   private byte AV19TFBarPieEst_To ;
   private byte AV47BarCodReo ;
   private byte AV67Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest ;
   private byte AV68Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to ;
   private byte A201BarPieEst ;
   private byte A132BarCodReo ;
   private short AV16TFBarPieAnc ;
   private short AV17TFBarPieAnc_To ;
   private short AV49BarOrdlin ;
   private short AV50BarAncAca1 ;
   private short AV65Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc ;
   private short AV66Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to ;
   private short A1691BarPieAnc ;
   private short Gx_err ;
   private int AV55GXV1 ;
   private int AV40OpeCod ;
   private int AV46BarCod ;
   private int A129BarCod ;
   private long AV26count ;
   private java.math.BigDecimal AV12TFBarPieKil ;
   private java.math.BigDecimal AV13TFBarPieKil_To ;
   private java.math.BigDecimal AV14TFBarPieMet ;
   private java.math.BigDecimal AV15TFBarPieMet_To ;
   private java.math.BigDecimal AV61Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ;
   private java.math.BigDecimal AV62Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ;
   private java.math.BigDecimal AV63Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ;
   private java.math.BigDecimal AV64Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private String AV10TFBarPieCod ;
   private String AV11TFBarPieCod_Sel ;
   private String AV39EmprCod ;
   private String AV41OpeNom ;
   private String AV42MaqCod ;
   private String AV43MaqNom ;
   private String AV44FasCod ;
   private String AV45FasDsc ;
   private String AV48BarCodPar ;
   private String AV51Msg_i ;
   private String A200BarPieCod ;
   private String AV57Expedicionesautomatizadas_webwhdrpzids_1_emprcod ;
   private String AV59Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ;
   private String AV60Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ;
   private String scmdbuf ;
   private String lV59Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ;
   private String A6116BarPieImp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private java.util.Date AV52Lecfec ;
   private boolean returnInSub ;
   private boolean brk9C42 ;
   private boolean n6116BarPieImp ;
   private boolean n1691BarPieAnc ;
   private String AV35OptionsJson ;
   private String AV36OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV33SearchTxt ;
   private String AV34SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ;
   private String lV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ;
   private String AV21Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09C42_A200BarPieCod ;
   private String[] P09C42_A396EmprCod ;
   private String[] P09C42_A130BarCodPar ;
   private byte[] P09C42_A132BarCodReo ;
   private int[] P09C42_A129BarCod ;
   private String[] P09C42_A6116BarPieImp ;
   private boolean[] P09C42_n6116BarPieImp ;
   private byte[] P09C42_A201BarPieEst ;
   private short[] P09C42_A1691BarPieAnc ;
   private boolean[] P09C42_n1691BarPieAnc ;
   private java.math.BigDecimal[] P09C42_A205BarPieMet ;
   private java.math.BigDecimal[] P09C42_A203BarPieKil ;
   private GXSimpleCollection<String> AV22Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV25OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class webwhdrpzigetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09C42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ,
                                          String AV60Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ,
                                          String AV59Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ,
                                          java.math.BigDecimal AV61Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ,
                                          java.math.BigDecimal AV62Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ,
                                          java.math.BigDecimal AV63Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ,
                                          java.math.BigDecimal AV64Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ,
                                          short AV65Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc ,
                                          short AV66Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to ,
                                          byte AV67Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest ,
                                          byte AV68Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to ,
                                          String A200BarPieCod ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          short A1691BarPieAnc ,
                                          String A6116BarPieImp ,
                                          byte A201BarPieEst ,
                                          String A396EmprCod ,
                                          String AV39EmprCod ,
                                          int A129BarCod ,
                                          int AV46BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV47BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV48BarCodPar ,
                                          String AV57Expedicionesautomatizadas_webwhdrpzids_1_emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[21];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT BarPieCod, EmprCod, BarCodPar, BarCodReo, BarCod, BarPieImp, BarPieEst, BarPieAnc, BarPieMet, BarPieKil FROM TXPBARPIE" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarPieKil > 0)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV58Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarPieAnc,'9990'), 2) like '%' || ?) or ( UPPER(BarPieImp) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarPieEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV59Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(BarPieCod = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(BarPieKil >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(BarPieKil <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(BarPieMet >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(BarPieMet <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV65Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc) )
      {
         addWhere(sWhereString, "(BarPieAnc >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV66Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to) )
      {
         addWhere(sWhereString, "(BarPieAnc <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV67Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest) )
      {
         addWhere(sWhereString, "(BarPieEst >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV68Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(BarPieEst <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarPieCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P09C42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09C42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
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
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 9);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
      }
   }

}

