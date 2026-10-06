package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class analisiscostesbasicos_wcgetfilterdata extends GXProcedure
{
   public analisiscostesbasicos_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisiscostesbasicos_wcgetfilterdata.class ), "" );
   }

   public analisiscostesbasicos_wcgetfilterdata( int remoteHandle ,
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
      analisiscostesbasicos_wcgetfilterdata.this.aP5 = new String[] {""};
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
      analisiscostesbasicos_wcgetfilterdata.this.AV18DDOName = aP0;
      analisiscostesbasicos_wcgetfilterdata.this.AV16SearchTxt = aP1;
      analisiscostesbasicos_wcgetfilterdata.this.AV17SearchTxtTo = aP2;
      analisiscostesbasicos_wcgetfilterdata.this.aP3 = aP3;
      analisiscostesbasicos_wcgetfilterdata.this.aP4 = aP4;
      analisiscostesbasicos_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_BARNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNOMCLIOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("AnalisisCostesBasicos_WCGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AnalisisCostesBasicos_WCGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("AnalisisCostesBasicos_WCGridState"), null, null);
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV14TFBarNHdr = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV15TFBarNHdr_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV46TFBarSer = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV47TFBarSer_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV48TFBarSerDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV49TFBarSerDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV50TFBarColNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV51TFBarColNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV52TFBarColNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFBarColNum_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV56TFBarNomCli = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV57TFBarNomCli_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV58TFBarKgm = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFBarKgm_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV60TFBarMtr = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV61TFBarMtr_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV62TFBarFecGen = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV64TFBarFecSal = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV35Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV36Clicod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV45Clicod_to = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV37Barfecgen = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN_TO") == 0 )
         {
            AV38Barfecgen_to = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSAL") == 0 )
         {
            AV39BarFecsal = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSAL_TO") == 0 )
         {
            AV40Barfecsal_to = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV41Barser = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INBARCOD") == 0 )
         {
            AV42InBarcod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INBARCODREO") == 0 )
         {
            AV43InBarcodreo = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INBARCODPAR") == 0 )
         {
            AV44InBarcodpar = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV16SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV70Analisiscostesbasicos_wcds_1_filterfulltext = AV34FilterFullText ;
      AV71Analisiscostesbasicos_wcds_2_tfclicod = AV10TFCliCod ;
      AV72Analisiscostesbasicos_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV73Analisiscostesbasicos_wcds_4_tfclinom = AV12TFCliNom ;
      AV74Analisiscostesbasicos_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV75Analisiscostesbasicos_wcds_6_tfbarnhdr = AV14TFBarNHdr ;
      AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV77Analisiscostesbasicos_wcds_8_tfbarser = AV46TFBarSer ;
      AV78Analisiscostesbasicos_wcds_9_tfbarser_sel = AV47TFBarSer_Sel ;
      AV79Analisiscostesbasicos_wcds_10_tfbarserdsc = AV48TFBarSerDsc ;
      AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV49TFBarSerDsc_Sel ;
      AV81Analisiscostesbasicos_wcds_12_tfbarcolnom = AV50TFBarColNom ;
      AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV51TFBarColNom_Sel ;
      AV83Analisiscostesbasicos_wcds_14_tfbarcolnum = AV52TFBarColNum ;
      AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV53TFBarColNum_To ;
      AV85Analisiscostesbasicos_wcds_16_tfbarnomcli = AV56TFBarNomCli ;
      AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV57TFBarNomCli_Sel ;
      AV87Analisiscostesbasicos_wcds_18_tfbarkgm = AV58TFBarKgm ;
      AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV59TFBarKgm_To ;
      AV89Analisiscostesbasicos_wcds_20_tfbarmtr = AV60TFBarMtr ;
      AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV61TFBarMtr_To ;
      AV91Analisiscostesbasicos_wcds_22_tfbarfecgen = AV62TFBarFecGen ;
      AV92Analisiscostesbasicos_wcds_23_tfbarfecsal = AV64TFBarFecSal ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV71Analisiscostesbasicos_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV72Analisiscostesbasicos_wcds_3_tfclicod_to) ,
                                           AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                           AV73Analisiscostesbasicos_wcds_4_tfclinom ,
                                           AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                           AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                           AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                           AV77Analisiscostesbasicos_wcds_8_tfbarser ,
                                           AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                           AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                           AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                           AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV83Analisiscostesbasicos_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to) ,
                                           AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                           AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                           AV87Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                           AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                           AV89Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                           AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                           AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                           AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A161BarFecSal ,
                                           AV70Analisiscostesbasicos_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(AV36Clicod) ,
                                           Integer.valueOf(AV45Clicod_to) ,
                                           AV37Barfecgen ,
                                           AV38Barfecgen_to ,
                                           AV41Barser ,
                                           AV39BarFecsal ,
                                           AV40Barfecsal_to ,
                                           Integer.valueOf(AV42InBarcod) ,
                                           Byte.valueOf(AV43InBarcodreo) ,
                                           AV44InBarcodpar ,
                                           A396EmprCod ,
                                           AV35Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV41Barser = GXutil.padr( GXutil.rtrim( AV41Barser), 16, "%") ;
      lV73Analisiscostesbasicos_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV73Analisiscostesbasicos_wcds_4_tfclinom), 30, "%") ;
      lV75Analisiscostesbasicos_wcds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV75Analisiscostesbasicos_wcds_6_tfbarnhdr), 11, "%") ;
      lV77Analisiscostesbasicos_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV77Analisiscostesbasicos_wcds_8_tfbarser), 16, "%") ;
      lV79Analisiscostesbasicos_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_10_tfbarserdsc), 26, "%") ;
      lV81Analisiscostesbasicos_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV81Analisiscostesbasicos_wcds_12_tfbarcolnom), 13, "%") ;
      lV85Analisiscostesbasicos_wcds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV85Analisiscostesbasicos_wcds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P093D3 */
      pr_default.execute(0, new Object[] {AV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, Integer.valueOf(AV36Clicod), Integer.valueOf(AV45Clicod_to), AV37Barfecgen, AV38Barfecgen_to, lV41Barser, AV41Barser, AV39BarFecsal, AV39BarFecsal, AV40Barfecsal_to, AV40Barfecsal_to, Integer.valueOf(AV42InBarcod), Integer.valueOf(AV42InBarcod), Byte.valueOf(AV43InBarcodreo), Byte.valueOf(AV43InBarcodreo), AV44InBarcodpar, AV44InBarcodpar, AV35Emprcod, Integer.valueOf(AV71Analisiscostesbasicos_wcds_2_tfclicod), Integer.valueOf(AV72Analisiscostesbasicos_wcds_3_tfclicod_to), lV73Analisiscostesbasicos_wcds_4_tfclinom, AV74Analisiscostesbasicos_wcds_5_tfclinom_sel, lV75Analisiscostesbasicos_wcds_6_tfbarnhdr, AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel, lV77Analisiscostesbasicos_wcds_8_tfbarser, AV78Analisiscostesbasicos_wcds_9_tfbarser_sel, lV79Analisiscostesbasicos_wcds_10_tfbarserdsc, AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel, lV81Analisiscostesbasicos_wcds_12_tfbarcolnom, AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV83Analisiscostesbasicos_wcds_14_tfbarcolnum), Integer.valueOf(AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to), lV85Analisiscostesbasicos_wcds_16_tfbarnomcli, AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel, AV87Analisiscostesbasicos_wcds_18_tfbarkgm, AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to, AV89Analisiscostesbasicos_wcds_20_tfbarmtr, AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to, AV91Analisiscostesbasicos_wcds_22_tfbarfecgen, AV92Analisiscostesbasicos_wcds_23_tfbarfecsal});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk93D2 = false ;
         A396EmprCod = P093D3_A396EmprCod[0] ;
         A279CliNom = P093D3_A279CliNom[0] ;
         A161BarFecSal = P093D3_A161BarFecSal[0] ;
         A159BarFecGen = P093D3_A159BarFecGen[0] ;
         A1234BarNomCli = P093D3_A1234BarNomCli[0] ;
         A136BarColNum = P093D3_A136BarColNum[0] ;
         A135BarColNom = P093D3_A135BarColNom[0] ;
         A1652BarSerDsc = P093D3_A1652BarSerDsc[0] ;
         A212BarSer = P093D3_A212BarSer[0] ;
         A13696BarNHdr = P093D3_A13696BarNHdr[0] ;
         A252CliCod = P093D3_A252CliCod[0] ;
         n252CliCod = P093D3_n252CliCod[0] ;
         A184BarMtr = P093D3_A184BarMtr[0] ;
         A166BarKgm = P093D3_A166BarKgm[0] ;
         A129BarCod = P093D3_A129BarCod[0] ;
         A132BarCodReo = P093D3_A132BarCodReo[0] ;
         A130BarCodPar = P093D3_A130BarCodPar[0] ;
         A279CliNom = P093D3_A279CliNom[0] ;
         A184BarMtr = P093D3_A184BarMtr[0] ;
         A166BarKgm = P093D3_A166BarKgm[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P093D3_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk93D2 = false ;
            A396EmprCod = P093D3_A396EmprCod[0] ;
            A252CliCod = P093D3_A252CliCod[0] ;
            n252CliCod = P093D3_n252CliCod[0] ;
            A129BarCod = P093D3_A129BarCod[0] ;
            A132BarCodReo = P093D3_A132BarCodReo[0] ;
            A130BarCodPar = P093D3_A130BarCodPar[0] ;
            AV28count = (long)(AV28count+1) ;
            brk93D2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV20Option = A279CliNom ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93D2 )
         {
            brk93D2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV14TFBarNHdr = AV16SearchTxt ;
      AV15TFBarNHdr_Sel = "" ;
      AV70Analisiscostesbasicos_wcds_1_filterfulltext = AV34FilterFullText ;
      AV71Analisiscostesbasicos_wcds_2_tfclicod = AV10TFCliCod ;
      AV72Analisiscostesbasicos_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV73Analisiscostesbasicos_wcds_4_tfclinom = AV12TFCliNom ;
      AV74Analisiscostesbasicos_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV75Analisiscostesbasicos_wcds_6_tfbarnhdr = AV14TFBarNHdr ;
      AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV77Analisiscostesbasicos_wcds_8_tfbarser = AV46TFBarSer ;
      AV78Analisiscostesbasicos_wcds_9_tfbarser_sel = AV47TFBarSer_Sel ;
      AV79Analisiscostesbasicos_wcds_10_tfbarserdsc = AV48TFBarSerDsc ;
      AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV49TFBarSerDsc_Sel ;
      AV81Analisiscostesbasicos_wcds_12_tfbarcolnom = AV50TFBarColNom ;
      AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV51TFBarColNom_Sel ;
      AV83Analisiscostesbasicos_wcds_14_tfbarcolnum = AV52TFBarColNum ;
      AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV53TFBarColNum_To ;
      AV85Analisiscostesbasicos_wcds_16_tfbarnomcli = AV56TFBarNomCli ;
      AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV57TFBarNomCli_Sel ;
      AV87Analisiscostesbasicos_wcds_18_tfbarkgm = AV58TFBarKgm ;
      AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV59TFBarKgm_To ;
      AV89Analisiscostesbasicos_wcds_20_tfbarmtr = AV60TFBarMtr ;
      AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV61TFBarMtr_To ;
      AV91Analisiscostesbasicos_wcds_22_tfbarfecgen = AV62TFBarFecGen ;
      AV92Analisiscostesbasicos_wcds_23_tfbarfecsal = AV64TFBarFecSal ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV71Analisiscostesbasicos_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV72Analisiscostesbasicos_wcds_3_tfclicod_to) ,
                                           AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                           AV73Analisiscostesbasicos_wcds_4_tfclinom ,
                                           AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                           AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                           AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                           AV77Analisiscostesbasicos_wcds_8_tfbarser ,
                                           AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                           AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                           AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                           AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV83Analisiscostesbasicos_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to) ,
                                           AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                           AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                           AV87Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                           AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                           AV89Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                           AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                           AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                           AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A161BarFecSal ,
                                           AV70Analisiscostesbasicos_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(AV36Clicod) ,
                                           Integer.valueOf(AV45Clicod_to) ,
                                           AV37Barfecgen ,
                                           AV38Barfecgen_to ,
                                           AV41Barser ,
                                           AV39BarFecsal ,
                                           AV40Barfecsal_to ,
                                           Integer.valueOf(AV42InBarcod) ,
                                           Byte.valueOf(AV43InBarcodreo) ,
                                           AV44InBarcodpar ,
                                           AV35Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV41Barser = GXutil.padr( GXutil.rtrim( AV41Barser), 16, "%") ;
      lV73Analisiscostesbasicos_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV73Analisiscostesbasicos_wcds_4_tfclinom), 30, "%") ;
      lV75Analisiscostesbasicos_wcds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV75Analisiscostesbasicos_wcds_6_tfbarnhdr), 11, "%") ;
      lV77Analisiscostesbasicos_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV77Analisiscostesbasicos_wcds_8_tfbarser), 16, "%") ;
      lV79Analisiscostesbasicos_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_10_tfbarserdsc), 26, "%") ;
      lV81Analisiscostesbasicos_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV81Analisiscostesbasicos_wcds_12_tfbarcolnom), 13, "%") ;
      lV85Analisiscostesbasicos_wcds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV85Analisiscostesbasicos_wcds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P093D5 */
      pr_default.execute(1, new Object[] {AV35Emprcod, AV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, Integer.valueOf(AV36Clicod), Integer.valueOf(AV45Clicod_to), AV37Barfecgen, AV38Barfecgen_to, lV41Barser, AV41Barser, AV39BarFecsal, AV39BarFecsal, AV40Barfecsal_to, AV40Barfecsal_to, Integer.valueOf(AV42InBarcod), Integer.valueOf(AV42InBarcod), Byte.valueOf(AV43InBarcodreo), Byte.valueOf(AV43InBarcodreo), AV44InBarcodpar, AV44InBarcodpar, Integer.valueOf(AV71Analisiscostesbasicos_wcds_2_tfclicod), Integer.valueOf(AV72Analisiscostesbasicos_wcds_3_tfclicod_to), lV73Analisiscostesbasicos_wcds_4_tfclinom, AV74Analisiscostesbasicos_wcds_5_tfclinom_sel, lV75Analisiscostesbasicos_wcds_6_tfbarnhdr, AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel, lV77Analisiscostesbasicos_wcds_8_tfbarser, AV78Analisiscostesbasicos_wcds_9_tfbarser_sel, lV79Analisiscostesbasicos_wcds_10_tfbarserdsc, AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel, lV81Analisiscostesbasicos_wcds_12_tfbarcolnom, AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV83Analisiscostesbasicos_wcds_14_tfbarcolnum), Integer.valueOf(AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to), lV85Analisiscostesbasicos_wcds_16_tfbarnomcli, AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel, AV87Analisiscostesbasicos_wcds_18_tfbarkgm, AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to, AV89Analisiscostesbasicos_wcds_20_tfbarmtr, AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to, AV91Analisiscostesbasicos_wcds_22_tfbarfecgen, AV92Analisiscostesbasicos_wcds_23_tfbarfecsal});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = P093D5_A396EmprCod[0] ;
         A161BarFecSal = P093D5_A161BarFecSal[0] ;
         A159BarFecGen = P093D5_A159BarFecGen[0] ;
         A1234BarNomCli = P093D5_A1234BarNomCli[0] ;
         A136BarColNum = P093D5_A136BarColNum[0] ;
         A135BarColNom = P093D5_A135BarColNom[0] ;
         A1652BarSerDsc = P093D5_A1652BarSerDsc[0] ;
         A212BarSer = P093D5_A212BarSer[0] ;
         A13696BarNHdr = P093D5_A13696BarNHdr[0] ;
         A279CliNom = P093D5_A279CliNom[0] ;
         A252CliCod = P093D5_A252CliCod[0] ;
         n252CliCod = P093D5_n252CliCod[0] ;
         A184BarMtr = P093D5_A184BarMtr[0] ;
         A166BarKgm = P093D5_A166BarKgm[0] ;
         A129BarCod = P093D5_A129BarCod[0] ;
         A132BarCodReo = P093D5_A132BarCodReo[0] ;
         A130BarCodPar = P093D5_A130BarCodPar[0] ;
         A279CliNom = P093D5_A279CliNom[0] ;
         A184BarMtr = P093D5_A184BarMtr[0] ;
         A166BarKgm = P093D5_A166BarKgm[0] ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV20Option = A13696BarNHdr ;
            AV19InsertIndex = 1 ;
            while ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) < 0 ) )
            {
               AV19InsertIndex = (int)(AV19InsertIndex+1) ;
            }
            if ( ( AV19InsertIndex <= AV21Options.size() ) && ( GXutil.strcmp((String)AV21Options.elementAt(-1+AV19InsertIndex), AV20Option) == 0 ) )
            {
               AV28count = GXutil.lval( (String)AV26OptionIndexes.elementAt(-1+AV19InsertIndex)) ;
               AV28count = (long)(AV28count+1) ;
               AV26OptionIndexes.removeItem(AV19InsertIndex);
               AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV19InsertIndex);
            }
            else
            {
               AV21Options.add(AV20Option, AV19InsertIndex);
               AV26OptionIndexes.add("1", AV19InsertIndex);
            }
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV46TFBarSer = AV16SearchTxt ;
      AV47TFBarSer_Sel = "" ;
      AV70Analisiscostesbasicos_wcds_1_filterfulltext = AV34FilterFullText ;
      AV71Analisiscostesbasicos_wcds_2_tfclicod = AV10TFCliCod ;
      AV72Analisiscostesbasicos_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV73Analisiscostesbasicos_wcds_4_tfclinom = AV12TFCliNom ;
      AV74Analisiscostesbasicos_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV75Analisiscostesbasicos_wcds_6_tfbarnhdr = AV14TFBarNHdr ;
      AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV77Analisiscostesbasicos_wcds_8_tfbarser = AV46TFBarSer ;
      AV78Analisiscostesbasicos_wcds_9_tfbarser_sel = AV47TFBarSer_Sel ;
      AV79Analisiscostesbasicos_wcds_10_tfbarserdsc = AV48TFBarSerDsc ;
      AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV49TFBarSerDsc_Sel ;
      AV81Analisiscostesbasicos_wcds_12_tfbarcolnom = AV50TFBarColNom ;
      AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV51TFBarColNom_Sel ;
      AV83Analisiscostesbasicos_wcds_14_tfbarcolnum = AV52TFBarColNum ;
      AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV53TFBarColNum_To ;
      AV85Analisiscostesbasicos_wcds_16_tfbarnomcli = AV56TFBarNomCli ;
      AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV57TFBarNomCli_Sel ;
      AV87Analisiscostesbasicos_wcds_18_tfbarkgm = AV58TFBarKgm ;
      AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV59TFBarKgm_To ;
      AV89Analisiscostesbasicos_wcds_20_tfbarmtr = AV60TFBarMtr ;
      AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV61TFBarMtr_To ;
      AV91Analisiscostesbasicos_wcds_22_tfbarfecgen = AV62TFBarFecGen ;
      AV92Analisiscostesbasicos_wcds_23_tfbarfecsal = AV64TFBarFecSal ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV71Analisiscostesbasicos_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV72Analisiscostesbasicos_wcds_3_tfclicod_to) ,
                                           AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                           AV73Analisiscostesbasicos_wcds_4_tfclinom ,
                                           AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                           AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                           AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                           AV77Analisiscostesbasicos_wcds_8_tfbarser ,
                                           AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                           AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                           AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                           AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV83Analisiscostesbasicos_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to) ,
                                           AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                           AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                           AV87Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                           AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                           AV89Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                           AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                           AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                           AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A161BarFecSal ,
                                           AV70Analisiscostesbasicos_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(AV36Clicod) ,
                                           Integer.valueOf(AV45Clicod_to) ,
                                           AV37Barfecgen ,
                                           AV38Barfecgen_to ,
                                           AV41Barser ,
                                           AV39BarFecsal ,
                                           AV40Barfecsal_to ,
                                           Integer.valueOf(AV42InBarcod) ,
                                           Byte.valueOf(AV43InBarcodreo) ,
                                           AV44InBarcodpar ,
                                           AV35Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV41Barser = GXutil.padr( GXutil.rtrim( AV41Barser), 16, "%") ;
      lV73Analisiscostesbasicos_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV73Analisiscostesbasicos_wcds_4_tfclinom), 30, "%") ;
      lV75Analisiscostesbasicos_wcds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV75Analisiscostesbasicos_wcds_6_tfbarnhdr), 11, "%") ;
      lV77Analisiscostesbasicos_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV77Analisiscostesbasicos_wcds_8_tfbarser), 16, "%") ;
      lV79Analisiscostesbasicos_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_10_tfbarserdsc), 26, "%") ;
      lV81Analisiscostesbasicos_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV81Analisiscostesbasicos_wcds_12_tfbarcolnom), 13, "%") ;
      lV85Analisiscostesbasicos_wcds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV85Analisiscostesbasicos_wcds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P093D7 */
      pr_default.execute(2, new Object[] {AV35Emprcod, AV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, Integer.valueOf(AV36Clicod), Integer.valueOf(AV45Clicod_to), AV37Barfecgen, AV38Barfecgen_to, lV41Barser, AV41Barser, AV39BarFecsal, AV39BarFecsal, AV40Barfecsal_to, AV40Barfecsal_to, Integer.valueOf(AV42InBarcod), Integer.valueOf(AV42InBarcod), Byte.valueOf(AV43InBarcodreo), Byte.valueOf(AV43InBarcodreo), AV44InBarcodpar, AV44InBarcodpar, Integer.valueOf(AV71Analisiscostesbasicos_wcds_2_tfclicod), Integer.valueOf(AV72Analisiscostesbasicos_wcds_3_tfclicod_to), lV73Analisiscostesbasicos_wcds_4_tfclinom, AV74Analisiscostesbasicos_wcds_5_tfclinom_sel, lV75Analisiscostesbasicos_wcds_6_tfbarnhdr, AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel, lV77Analisiscostesbasicos_wcds_8_tfbarser, AV78Analisiscostesbasicos_wcds_9_tfbarser_sel, lV79Analisiscostesbasicos_wcds_10_tfbarserdsc, AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel, lV81Analisiscostesbasicos_wcds_12_tfbarcolnom, AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV83Analisiscostesbasicos_wcds_14_tfbarcolnum), Integer.valueOf(AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to), lV85Analisiscostesbasicos_wcds_16_tfbarnomcli, AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel, AV87Analisiscostesbasicos_wcds_18_tfbarkgm, AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to, AV89Analisiscostesbasicos_wcds_20_tfbarmtr, AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to, AV91Analisiscostesbasicos_wcds_22_tfbarfecgen, AV92Analisiscostesbasicos_wcds_23_tfbarfecsal});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk93D5 = false ;
         A396EmprCod = P093D7_A396EmprCod[0] ;
         A212BarSer = P093D7_A212BarSer[0] ;
         A161BarFecSal = P093D7_A161BarFecSal[0] ;
         A159BarFecGen = P093D7_A159BarFecGen[0] ;
         A1234BarNomCli = P093D7_A1234BarNomCli[0] ;
         A136BarColNum = P093D7_A136BarColNum[0] ;
         A135BarColNom = P093D7_A135BarColNom[0] ;
         A1652BarSerDsc = P093D7_A1652BarSerDsc[0] ;
         A13696BarNHdr = P093D7_A13696BarNHdr[0] ;
         A279CliNom = P093D7_A279CliNom[0] ;
         A252CliCod = P093D7_A252CliCod[0] ;
         n252CliCod = P093D7_n252CliCod[0] ;
         A184BarMtr = P093D7_A184BarMtr[0] ;
         A166BarKgm = P093D7_A166BarKgm[0] ;
         A129BarCod = P093D7_A129BarCod[0] ;
         A132BarCodReo = P093D7_A132BarCodReo[0] ;
         A130BarCodPar = P093D7_A130BarCodPar[0] ;
         A279CliNom = P093D7_A279CliNom[0] ;
         A184BarMtr = P093D7_A184BarMtr[0] ;
         A166BarKgm = P093D7_A166BarKgm[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P093D7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P093D7_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk93D5 = false ;
            A129BarCod = P093D7_A129BarCod[0] ;
            A132BarCodReo = P093D7_A132BarCodReo[0] ;
            A130BarCodPar = P093D7_A130BarCodPar[0] ;
            AV28count = (long)(AV28count+1) ;
            brk93D5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV20Option = A212BarSer ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93D5 )
         {
            brk93D5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV48TFBarSerDsc = AV16SearchTxt ;
      AV49TFBarSerDsc_Sel = "" ;
      AV70Analisiscostesbasicos_wcds_1_filterfulltext = AV34FilterFullText ;
      AV71Analisiscostesbasicos_wcds_2_tfclicod = AV10TFCliCod ;
      AV72Analisiscostesbasicos_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV73Analisiscostesbasicos_wcds_4_tfclinom = AV12TFCliNom ;
      AV74Analisiscostesbasicos_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV75Analisiscostesbasicos_wcds_6_tfbarnhdr = AV14TFBarNHdr ;
      AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV77Analisiscostesbasicos_wcds_8_tfbarser = AV46TFBarSer ;
      AV78Analisiscostesbasicos_wcds_9_tfbarser_sel = AV47TFBarSer_Sel ;
      AV79Analisiscostesbasicos_wcds_10_tfbarserdsc = AV48TFBarSerDsc ;
      AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV49TFBarSerDsc_Sel ;
      AV81Analisiscostesbasicos_wcds_12_tfbarcolnom = AV50TFBarColNom ;
      AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV51TFBarColNom_Sel ;
      AV83Analisiscostesbasicos_wcds_14_tfbarcolnum = AV52TFBarColNum ;
      AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV53TFBarColNum_To ;
      AV85Analisiscostesbasicos_wcds_16_tfbarnomcli = AV56TFBarNomCli ;
      AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV57TFBarNomCli_Sel ;
      AV87Analisiscostesbasicos_wcds_18_tfbarkgm = AV58TFBarKgm ;
      AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV59TFBarKgm_To ;
      AV89Analisiscostesbasicos_wcds_20_tfbarmtr = AV60TFBarMtr ;
      AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV61TFBarMtr_To ;
      AV91Analisiscostesbasicos_wcds_22_tfbarfecgen = AV62TFBarFecGen ;
      AV92Analisiscostesbasicos_wcds_23_tfbarfecsal = AV64TFBarFecSal ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV71Analisiscostesbasicos_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV72Analisiscostesbasicos_wcds_3_tfclicod_to) ,
                                           AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                           AV73Analisiscostesbasicos_wcds_4_tfclinom ,
                                           AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                           AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                           AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                           AV77Analisiscostesbasicos_wcds_8_tfbarser ,
                                           AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                           AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                           AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                           AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV83Analisiscostesbasicos_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to) ,
                                           AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                           AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                           AV87Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                           AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                           AV89Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                           AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                           AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                           AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A161BarFecSal ,
                                           AV70Analisiscostesbasicos_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(AV36Clicod) ,
                                           Integer.valueOf(AV45Clicod_to) ,
                                           AV37Barfecgen ,
                                           AV38Barfecgen_to ,
                                           AV41Barser ,
                                           AV39BarFecsal ,
                                           AV40Barfecsal_to ,
                                           Integer.valueOf(AV42InBarcod) ,
                                           Byte.valueOf(AV43InBarcodreo) ,
                                           AV44InBarcodpar ,
                                           A396EmprCod ,
                                           AV35Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV41Barser = GXutil.padr( GXutil.rtrim( AV41Barser), 16, "%") ;
      lV73Analisiscostesbasicos_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV73Analisiscostesbasicos_wcds_4_tfclinom), 30, "%") ;
      lV75Analisiscostesbasicos_wcds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV75Analisiscostesbasicos_wcds_6_tfbarnhdr), 11, "%") ;
      lV77Analisiscostesbasicos_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV77Analisiscostesbasicos_wcds_8_tfbarser), 16, "%") ;
      lV79Analisiscostesbasicos_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_10_tfbarserdsc), 26, "%") ;
      lV81Analisiscostesbasicos_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV81Analisiscostesbasicos_wcds_12_tfbarcolnom), 13, "%") ;
      lV85Analisiscostesbasicos_wcds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV85Analisiscostesbasicos_wcds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P093D9 */
      pr_default.execute(3, new Object[] {AV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, Integer.valueOf(AV36Clicod), Integer.valueOf(AV45Clicod_to), AV37Barfecgen, AV38Barfecgen_to, lV41Barser, AV41Barser, AV39BarFecsal, AV39BarFecsal, AV40Barfecsal_to, AV40Barfecsal_to, Integer.valueOf(AV42InBarcod), Integer.valueOf(AV42InBarcod), Byte.valueOf(AV43InBarcodreo), Byte.valueOf(AV43InBarcodreo), AV44InBarcodpar, AV44InBarcodpar, AV35Emprcod, Integer.valueOf(AV71Analisiscostesbasicos_wcds_2_tfclicod), Integer.valueOf(AV72Analisiscostesbasicos_wcds_3_tfclicod_to), lV73Analisiscostesbasicos_wcds_4_tfclinom, AV74Analisiscostesbasicos_wcds_5_tfclinom_sel, lV75Analisiscostesbasicos_wcds_6_tfbarnhdr, AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel, lV77Analisiscostesbasicos_wcds_8_tfbarser, AV78Analisiscostesbasicos_wcds_9_tfbarser_sel, lV79Analisiscostesbasicos_wcds_10_tfbarserdsc, AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel, lV81Analisiscostesbasicos_wcds_12_tfbarcolnom, AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV83Analisiscostesbasicos_wcds_14_tfbarcolnum), Integer.valueOf(AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to), lV85Analisiscostesbasicos_wcds_16_tfbarnomcli, AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel, AV87Analisiscostesbasicos_wcds_18_tfbarkgm, AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to, AV89Analisiscostesbasicos_wcds_20_tfbarmtr, AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to, AV91Analisiscostesbasicos_wcds_22_tfbarfecgen, AV92Analisiscostesbasicos_wcds_23_tfbarfecsal});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk93D7 = false ;
         A396EmprCod = P093D9_A396EmprCod[0] ;
         A1652BarSerDsc = P093D9_A1652BarSerDsc[0] ;
         A161BarFecSal = P093D9_A161BarFecSal[0] ;
         A159BarFecGen = P093D9_A159BarFecGen[0] ;
         A1234BarNomCli = P093D9_A1234BarNomCli[0] ;
         A136BarColNum = P093D9_A136BarColNum[0] ;
         A135BarColNom = P093D9_A135BarColNom[0] ;
         A212BarSer = P093D9_A212BarSer[0] ;
         A13696BarNHdr = P093D9_A13696BarNHdr[0] ;
         A279CliNom = P093D9_A279CliNom[0] ;
         A252CliCod = P093D9_A252CliCod[0] ;
         n252CliCod = P093D9_n252CliCod[0] ;
         A184BarMtr = P093D9_A184BarMtr[0] ;
         A166BarKgm = P093D9_A166BarKgm[0] ;
         A129BarCod = P093D9_A129BarCod[0] ;
         A132BarCodReo = P093D9_A132BarCodReo[0] ;
         A130BarCodPar = P093D9_A130BarCodPar[0] ;
         A279CliNom = P093D9_A279CliNom[0] ;
         A184BarMtr = P093D9_A184BarMtr[0] ;
         A166BarKgm = P093D9_A166BarKgm[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P093D9_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk93D7 = false ;
            A396EmprCod = P093D9_A396EmprCod[0] ;
            A129BarCod = P093D9_A129BarCod[0] ;
            A132BarCodReo = P093D9_A132BarCodReo[0] ;
            A130BarCodPar = P093D9_A130BarCodPar[0] ;
            AV28count = (long)(AV28count+1) ;
            brk93D7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV20Option = A1652BarSerDsc ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93D7 )
         {
            brk93D7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV50TFBarColNom = AV16SearchTxt ;
      AV51TFBarColNom_Sel = "" ;
      AV70Analisiscostesbasicos_wcds_1_filterfulltext = AV34FilterFullText ;
      AV71Analisiscostesbasicos_wcds_2_tfclicod = AV10TFCliCod ;
      AV72Analisiscostesbasicos_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV73Analisiscostesbasicos_wcds_4_tfclinom = AV12TFCliNom ;
      AV74Analisiscostesbasicos_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV75Analisiscostesbasicos_wcds_6_tfbarnhdr = AV14TFBarNHdr ;
      AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV77Analisiscostesbasicos_wcds_8_tfbarser = AV46TFBarSer ;
      AV78Analisiscostesbasicos_wcds_9_tfbarser_sel = AV47TFBarSer_Sel ;
      AV79Analisiscostesbasicos_wcds_10_tfbarserdsc = AV48TFBarSerDsc ;
      AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV49TFBarSerDsc_Sel ;
      AV81Analisiscostesbasicos_wcds_12_tfbarcolnom = AV50TFBarColNom ;
      AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV51TFBarColNom_Sel ;
      AV83Analisiscostesbasicos_wcds_14_tfbarcolnum = AV52TFBarColNum ;
      AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV53TFBarColNum_To ;
      AV85Analisiscostesbasicos_wcds_16_tfbarnomcli = AV56TFBarNomCli ;
      AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV57TFBarNomCli_Sel ;
      AV87Analisiscostesbasicos_wcds_18_tfbarkgm = AV58TFBarKgm ;
      AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV59TFBarKgm_To ;
      AV89Analisiscostesbasicos_wcds_20_tfbarmtr = AV60TFBarMtr ;
      AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV61TFBarMtr_To ;
      AV91Analisiscostesbasicos_wcds_22_tfbarfecgen = AV62TFBarFecGen ;
      AV92Analisiscostesbasicos_wcds_23_tfbarfecsal = AV64TFBarFecSal ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV71Analisiscostesbasicos_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV72Analisiscostesbasicos_wcds_3_tfclicod_to) ,
                                           AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                           AV73Analisiscostesbasicos_wcds_4_tfclinom ,
                                           AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                           AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                           AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                           AV77Analisiscostesbasicos_wcds_8_tfbarser ,
                                           AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                           AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                           AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                           AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV83Analisiscostesbasicos_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to) ,
                                           AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                           AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                           AV87Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                           AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                           AV89Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                           AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                           AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                           AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A161BarFecSal ,
                                           AV70Analisiscostesbasicos_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(AV36Clicod) ,
                                           Integer.valueOf(AV45Clicod_to) ,
                                           AV37Barfecgen ,
                                           AV38Barfecgen_to ,
                                           AV41Barser ,
                                           AV39BarFecsal ,
                                           AV40Barfecsal_to ,
                                           Integer.valueOf(AV42InBarcod) ,
                                           Byte.valueOf(AV43InBarcodreo) ,
                                           AV44InBarcodpar ,
                                           A396EmprCod ,
                                           AV35Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV41Barser = GXutil.padr( GXutil.rtrim( AV41Barser), 16, "%") ;
      lV73Analisiscostesbasicos_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV73Analisiscostesbasicos_wcds_4_tfclinom), 30, "%") ;
      lV75Analisiscostesbasicos_wcds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV75Analisiscostesbasicos_wcds_6_tfbarnhdr), 11, "%") ;
      lV77Analisiscostesbasicos_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV77Analisiscostesbasicos_wcds_8_tfbarser), 16, "%") ;
      lV79Analisiscostesbasicos_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_10_tfbarserdsc), 26, "%") ;
      lV81Analisiscostesbasicos_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV81Analisiscostesbasicos_wcds_12_tfbarcolnom), 13, "%") ;
      lV85Analisiscostesbasicos_wcds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV85Analisiscostesbasicos_wcds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P093D11 */
      pr_default.execute(4, new Object[] {AV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, Integer.valueOf(AV36Clicod), Integer.valueOf(AV45Clicod_to), AV37Barfecgen, AV38Barfecgen_to, lV41Barser, AV41Barser, AV39BarFecsal, AV39BarFecsal, AV40Barfecsal_to, AV40Barfecsal_to, Integer.valueOf(AV42InBarcod), Integer.valueOf(AV42InBarcod), Byte.valueOf(AV43InBarcodreo), Byte.valueOf(AV43InBarcodreo), AV44InBarcodpar, AV44InBarcodpar, AV35Emprcod, Integer.valueOf(AV71Analisiscostesbasicos_wcds_2_tfclicod), Integer.valueOf(AV72Analisiscostesbasicos_wcds_3_tfclicod_to), lV73Analisiscostesbasicos_wcds_4_tfclinom, AV74Analisiscostesbasicos_wcds_5_tfclinom_sel, lV75Analisiscostesbasicos_wcds_6_tfbarnhdr, AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel, lV77Analisiscostesbasicos_wcds_8_tfbarser, AV78Analisiscostesbasicos_wcds_9_tfbarser_sel, lV79Analisiscostesbasicos_wcds_10_tfbarserdsc, AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel, lV81Analisiscostesbasicos_wcds_12_tfbarcolnom, AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV83Analisiscostesbasicos_wcds_14_tfbarcolnum), Integer.valueOf(AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to), lV85Analisiscostesbasicos_wcds_16_tfbarnomcli, AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel, AV87Analisiscostesbasicos_wcds_18_tfbarkgm, AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to, AV89Analisiscostesbasicos_wcds_20_tfbarmtr, AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to, AV91Analisiscostesbasicos_wcds_22_tfbarfecgen, AV92Analisiscostesbasicos_wcds_23_tfbarfecsal});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk93D9 = false ;
         A396EmprCod = P093D11_A396EmprCod[0] ;
         A135BarColNom = P093D11_A135BarColNom[0] ;
         A161BarFecSal = P093D11_A161BarFecSal[0] ;
         A159BarFecGen = P093D11_A159BarFecGen[0] ;
         A1234BarNomCli = P093D11_A1234BarNomCli[0] ;
         A136BarColNum = P093D11_A136BarColNum[0] ;
         A1652BarSerDsc = P093D11_A1652BarSerDsc[0] ;
         A212BarSer = P093D11_A212BarSer[0] ;
         A13696BarNHdr = P093D11_A13696BarNHdr[0] ;
         A279CliNom = P093D11_A279CliNom[0] ;
         A252CliCod = P093D11_A252CliCod[0] ;
         n252CliCod = P093D11_n252CliCod[0] ;
         A184BarMtr = P093D11_A184BarMtr[0] ;
         A166BarKgm = P093D11_A166BarKgm[0] ;
         A129BarCod = P093D11_A129BarCod[0] ;
         A132BarCodReo = P093D11_A132BarCodReo[0] ;
         A130BarCodPar = P093D11_A130BarCodPar[0] ;
         A279CliNom = P093D11_A279CliNom[0] ;
         A184BarMtr = P093D11_A184BarMtr[0] ;
         A166BarKgm = P093D11_A166BarKgm[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P093D11_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brk93D9 = false ;
            A396EmprCod = P093D11_A396EmprCod[0] ;
            A129BarCod = P093D11_A129BarCod[0] ;
            A132BarCodReo = P093D11_A132BarCodReo[0] ;
            A130BarCodPar = P093D11_A130BarCodPar[0] ;
            AV28count = (long)(AV28count+1) ;
            brk93D9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV20Option = A135BarColNom ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93D9 )
         {
            brk93D9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV56TFBarNomCli = AV16SearchTxt ;
      AV57TFBarNomCli_Sel = "" ;
      AV70Analisiscostesbasicos_wcds_1_filterfulltext = AV34FilterFullText ;
      AV71Analisiscostesbasicos_wcds_2_tfclicod = AV10TFCliCod ;
      AV72Analisiscostesbasicos_wcds_3_tfclicod_to = AV11TFCliCod_To ;
      AV73Analisiscostesbasicos_wcds_4_tfclinom = AV12TFCliNom ;
      AV74Analisiscostesbasicos_wcds_5_tfclinom_sel = AV13TFCliNom_Sel ;
      AV75Analisiscostesbasicos_wcds_6_tfbarnhdr = AV14TFBarNHdr ;
      AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV77Analisiscostesbasicos_wcds_8_tfbarser = AV46TFBarSer ;
      AV78Analisiscostesbasicos_wcds_9_tfbarser_sel = AV47TFBarSer_Sel ;
      AV79Analisiscostesbasicos_wcds_10_tfbarserdsc = AV48TFBarSerDsc ;
      AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV49TFBarSerDsc_Sel ;
      AV81Analisiscostesbasicos_wcds_12_tfbarcolnom = AV50TFBarColNom ;
      AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV51TFBarColNom_Sel ;
      AV83Analisiscostesbasicos_wcds_14_tfbarcolnum = AV52TFBarColNum ;
      AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV53TFBarColNum_To ;
      AV85Analisiscostesbasicos_wcds_16_tfbarnomcli = AV56TFBarNomCli ;
      AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV57TFBarNomCli_Sel ;
      AV87Analisiscostesbasicos_wcds_18_tfbarkgm = AV58TFBarKgm ;
      AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV59TFBarKgm_To ;
      AV89Analisiscostesbasicos_wcds_20_tfbarmtr = AV60TFBarMtr ;
      AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV61TFBarMtr_To ;
      AV91Analisiscostesbasicos_wcds_22_tfbarfecgen = AV62TFBarFecGen ;
      AV92Analisiscostesbasicos_wcds_23_tfbarfecsal = AV64TFBarFecSal ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Integer.valueOf(AV71Analisiscostesbasicos_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV72Analisiscostesbasicos_wcds_3_tfclicod_to) ,
                                           AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                           AV73Analisiscostesbasicos_wcds_4_tfclinom ,
                                           AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                           AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                           AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                           AV77Analisiscostesbasicos_wcds_8_tfbarser ,
                                           AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                           AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                           AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                           AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV83Analisiscostesbasicos_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to) ,
                                           AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                           AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                           AV87Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                           AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                           AV89Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                           AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                           AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                           AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A161BarFecSal ,
                                           AV70Analisiscostesbasicos_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(AV36Clicod) ,
                                           Integer.valueOf(AV45Clicod_to) ,
                                           AV37Barfecgen ,
                                           AV38Barfecgen_to ,
                                           AV41Barser ,
                                           AV39BarFecsal ,
                                           AV40Barfecsal_to ,
                                           Integer.valueOf(AV42InBarcod) ,
                                           Byte.valueOf(AV43InBarcodreo) ,
                                           AV44InBarcodpar ,
                                           A396EmprCod ,
                                           AV35Emprcod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV70Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV41Barser = GXutil.padr( GXutil.rtrim( AV41Barser), 16, "%") ;
      lV73Analisiscostesbasicos_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV73Analisiscostesbasicos_wcds_4_tfclinom), 30, "%") ;
      lV75Analisiscostesbasicos_wcds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV75Analisiscostesbasicos_wcds_6_tfbarnhdr), 11, "%") ;
      lV77Analisiscostesbasicos_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV77Analisiscostesbasicos_wcds_8_tfbarser), 16, "%") ;
      lV79Analisiscostesbasicos_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_10_tfbarserdsc), 26, "%") ;
      lV81Analisiscostesbasicos_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV81Analisiscostesbasicos_wcds_12_tfbarcolnom), 13, "%") ;
      lV85Analisiscostesbasicos_wcds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV85Analisiscostesbasicos_wcds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P093D13 */
      pr_default.execute(5, new Object[] {AV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, lV70Analisiscostesbasicos_wcds_1_filterfulltext, Integer.valueOf(AV36Clicod), Integer.valueOf(AV45Clicod_to), AV37Barfecgen, AV38Barfecgen_to, lV41Barser, AV41Barser, AV39BarFecsal, AV39BarFecsal, AV40Barfecsal_to, AV40Barfecsal_to, Integer.valueOf(AV42InBarcod), Integer.valueOf(AV42InBarcod), Byte.valueOf(AV43InBarcodreo), Byte.valueOf(AV43InBarcodreo), AV44InBarcodpar, AV44InBarcodpar, AV35Emprcod, Integer.valueOf(AV71Analisiscostesbasicos_wcds_2_tfclicod), Integer.valueOf(AV72Analisiscostesbasicos_wcds_3_tfclicod_to), lV73Analisiscostesbasicos_wcds_4_tfclinom, AV74Analisiscostesbasicos_wcds_5_tfclinom_sel, lV75Analisiscostesbasicos_wcds_6_tfbarnhdr, AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel, lV77Analisiscostesbasicos_wcds_8_tfbarser, AV78Analisiscostesbasicos_wcds_9_tfbarser_sel, lV79Analisiscostesbasicos_wcds_10_tfbarserdsc, AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel, lV81Analisiscostesbasicos_wcds_12_tfbarcolnom, AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV83Analisiscostesbasicos_wcds_14_tfbarcolnum), Integer.valueOf(AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to), lV85Analisiscostesbasicos_wcds_16_tfbarnomcli, AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel, AV87Analisiscostesbasicos_wcds_18_tfbarkgm, AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to, AV89Analisiscostesbasicos_wcds_20_tfbarmtr, AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to, AV91Analisiscostesbasicos_wcds_22_tfbarfecgen, AV92Analisiscostesbasicos_wcds_23_tfbarfecsal});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk93D11 = false ;
         A396EmprCod = P093D13_A396EmprCod[0] ;
         A1234BarNomCli = P093D13_A1234BarNomCli[0] ;
         A161BarFecSal = P093D13_A161BarFecSal[0] ;
         A159BarFecGen = P093D13_A159BarFecGen[0] ;
         A136BarColNum = P093D13_A136BarColNum[0] ;
         A135BarColNom = P093D13_A135BarColNom[0] ;
         A1652BarSerDsc = P093D13_A1652BarSerDsc[0] ;
         A212BarSer = P093D13_A212BarSer[0] ;
         A13696BarNHdr = P093D13_A13696BarNHdr[0] ;
         A279CliNom = P093D13_A279CliNom[0] ;
         A252CliCod = P093D13_A252CliCod[0] ;
         n252CliCod = P093D13_n252CliCod[0] ;
         A184BarMtr = P093D13_A184BarMtr[0] ;
         A166BarKgm = P093D13_A166BarKgm[0] ;
         A129BarCod = P093D13_A129BarCod[0] ;
         A132BarCodReo = P093D13_A132BarCodReo[0] ;
         A130BarCodPar = P093D13_A130BarCodPar[0] ;
         A279CliNom = P093D13_A279CliNom[0] ;
         A184BarMtr = P093D13_A184BarMtr[0] ;
         A166BarKgm = P093D13_A166BarKgm[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P093D13_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brk93D11 = false ;
            A396EmprCod = P093D13_A396EmprCod[0] ;
            A129BarCod = P093D13_A129BarCod[0] ;
            A132BarCodReo = P093D13_A132BarCodReo[0] ;
            A130BarCodPar = P093D13_A130BarCodPar[0] ;
            AV28count = (long)(AV28count+1) ;
            brk93D11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV20Option = A1234BarNomCli ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93D11 )
         {
            brk93D11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = analisiscostesbasicos_wcgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = analisiscostesbasicos_wcgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = analisiscostesbasicos_wcgetfilterdata.this.AV27OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22OptionsJson = "" ;
      AV25OptionsDescJson = "" ;
      AV27OptionIndexesJson = "" ;
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV34FilterFullText = "" ;
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFBarNHdr = "" ;
      AV15TFBarNHdr_Sel = "" ;
      AV46TFBarSer = "" ;
      AV47TFBarSer_Sel = "" ;
      AV48TFBarSerDsc = "" ;
      AV49TFBarSerDsc_Sel = "" ;
      AV50TFBarColNom = "" ;
      AV51TFBarColNom_Sel = "" ;
      AV56TFBarNomCli = "" ;
      AV57TFBarNomCli_Sel = "" ;
      AV58TFBarKgm = DecimalUtil.ZERO ;
      AV59TFBarKgm_To = DecimalUtil.ZERO ;
      AV60TFBarMtr = DecimalUtil.ZERO ;
      AV61TFBarMtr_To = DecimalUtil.ZERO ;
      AV62TFBarFecGen = GXutil.nullDate() ;
      AV64TFBarFecSal = GXutil.nullDate() ;
      AV35Emprcod = "" ;
      AV37Barfecgen = GXutil.nullDate() ;
      AV38Barfecgen_to = GXutil.nullDate() ;
      AV39BarFecsal = GXutil.nullDate() ;
      AV40Barfecsal_to = GXutil.nullDate() ;
      AV41Barser = "" ;
      AV44InBarcodpar = "" ;
      A279CliNom = "" ;
      AV70Analisiscostesbasicos_wcds_1_filterfulltext = "" ;
      AV73Analisiscostesbasicos_wcds_4_tfclinom = "" ;
      AV74Analisiscostesbasicos_wcds_5_tfclinom_sel = "" ;
      AV75Analisiscostesbasicos_wcds_6_tfbarnhdr = "" ;
      AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = "" ;
      AV77Analisiscostesbasicos_wcds_8_tfbarser = "" ;
      AV78Analisiscostesbasicos_wcds_9_tfbarser_sel = "" ;
      AV79Analisiscostesbasicos_wcds_10_tfbarserdsc = "" ;
      AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = "" ;
      AV81Analisiscostesbasicos_wcds_12_tfbarcolnom = "" ;
      AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = "" ;
      AV85Analisiscostesbasicos_wcds_16_tfbarnomcli = "" ;
      AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = "" ;
      AV87Analisiscostesbasicos_wcds_18_tfbarkgm = DecimalUtil.ZERO ;
      AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to = DecimalUtil.ZERO ;
      AV89Analisiscostesbasicos_wcds_20_tfbarmtr = DecimalUtil.ZERO ;
      AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to = DecimalUtil.ZERO ;
      AV91Analisiscostesbasicos_wcds_22_tfbarfecgen = GXutil.nullDate() ;
      AV92Analisiscostesbasicos_wcds_23_tfbarfecsal = GXutil.nullDate() ;
      lV70Analisiscostesbasicos_wcds_1_filterfulltext = "" ;
      lV41Barser = "" ;
      scmdbuf = "" ;
      lV73Analisiscostesbasicos_wcds_4_tfclinom = "" ;
      lV75Analisiscostesbasicos_wcds_6_tfbarnhdr = "" ;
      lV77Analisiscostesbasicos_wcds_8_tfbarser = "" ;
      lV79Analisiscostesbasicos_wcds_10_tfbarserdsc = "" ;
      lV81Analisiscostesbasicos_wcds_12_tfbarcolnom = "" ;
      lV85Analisiscostesbasicos_wcds_16_tfbarnomcli = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A159BarFecGen = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A396EmprCod = "" ;
      P093D3_A396EmprCod = new String[] {""} ;
      P093D3_A279CliNom = new String[] {""} ;
      P093D3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P093D3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093D3_A1234BarNomCli = new String[] {""} ;
      P093D3_A136BarColNum = new int[1] ;
      P093D3_A135BarColNom = new String[] {""} ;
      P093D3_A1652BarSerDsc = new String[] {""} ;
      P093D3_A212BarSer = new String[] {""} ;
      P093D3_A13696BarNHdr = new String[] {""} ;
      P093D3_A252CliCod = new int[1] ;
      P093D3_n252CliCod = new boolean[] {false} ;
      P093D3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093D3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093D3_A129BarCod = new int[1] ;
      P093D3_A132BarCodReo = new byte[1] ;
      P093D3_A130BarCodPar = new String[] {""} ;
      AV20Option = "" ;
      P093D5_A396EmprCod = new String[] {""} ;
      P093D5_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P093D5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093D5_A1234BarNomCli = new String[] {""} ;
      P093D5_A136BarColNum = new int[1] ;
      P093D5_A135BarColNom = new String[] {""} ;
      P093D5_A1652BarSerDsc = new String[] {""} ;
      P093D5_A212BarSer = new String[] {""} ;
      P093D5_A13696BarNHdr = new String[] {""} ;
      P093D5_A279CliNom = new String[] {""} ;
      P093D5_A252CliCod = new int[1] ;
      P093D5_n252CliCod = new boolean[] {false} ;
      P093D5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093D5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093D5_A129BarCod = new int[1] ;
      P093D5_A132BarCodReo = new byte[1] ;
      P093D5_A130BarCodPar = new String[] {""} ;
      P093D7_A396EmprCod = new String[] {""} ;
      P093D7_A212BarSer = new String[] {""} ;
      P093D7_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P093D7_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093D7_A1234BarNomCli = new String[] {""} ;
      P093D7_A136BarColNum = new int[1] ;
      P093D7_A135BarColNom = new String[] {""} ;
      P093D7_A1652BarSerDsc = new String[] {""} ;
      P093D7_A13696BarNHdr = new String[] {""} ;
      P093D7_A279CliNom = new String[] {""} ;
      P093D7_A252CliCod = new int[1] ;
      P093D7_n252CliCod = new boolean[] {false} ;
      P093D7_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093D7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093D7_A129BarCod = new int[1] ;
      P093D7_A132BarCodReo = new byte[1] ;
      P093D7_A130BarCodPar = new String[] {""} ;
      P093D9_A396EmprCod = new String[] {""} ;
      P093D9_A1652BarSerDsc = new String[] {""} ;
      P093D9_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P093D9_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093D9_A1234BarNomCli = new String[] {""} ;
      P093D9_A136BarColNum = new int[1] ;
      P093D9_A135BarColNom = new String[] {""} ;
      P093D9_A212BarSer = new String[] {""} ;
      P093D9_A13696BarNHdr = new String[] {""} ;
      P093D9_A279CliNom = new String[] {""} ;
      P093D9_A252CliCod = new int[1] ;
      P093D9_n252CliCod = new boolean[] {false} ;
      P093D9_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093D9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093D9_A129BarCod = new int[1] ;
      P093D9_A132BarCodReo = new byte[1] ;
      P093D9_A130BarCodPar = new String[] {""} ;
      P093D11_A396EmprCod = new String[] {""} ;
      P093D11_A135BarColNom = new String[] {""} ;
      P093D11_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P093D11_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093D11_A1234BarNomCli = new String[] {""} ;
      P093D11_A136BarColNum = new int[1] ;
      P093D11_A1652BarSerDsc = new String[] {""} ;
      P093D11_A212BarSer = new String[] {""} ;
      P093D11_A13696BarNHdr = new String[] {""} ;
      P093D11_A279CliNom = new String[] {""} ;
      P093D11_A252CliCod = new int[1] ;
      P093D11_n252CliCod = new boolean[] {false} ;
      P093D11_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093D11_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093D11_A129BarCod = new int[1] ;
      P093D11_A132BarCodReo = new byte[1] ;
      P093D11_A130BarCodPar = new String[] {""} ;
      P093D13_A396EmprCod = new String[] {""} ;
      P093D13_A1234BarNomCli = new String[] {""} ;
      P093D13_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P093D13_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093D13_A136BarColNum = new int[1] ;
      P093D13_A135BarColNom = new String[] {""} ;
      P093D13_A1652BarSerDsc = new String[] {""} ;
      P093D13_A212BarSer = new String[] {""} ;
      P093D13_A13696BarNHdr = new String[] {""} ;
      P093D13_A279CliNom = new String[] {""} ;
      P093D13_A252CliCod = new int[1] ;
      P093D13_n252CliCod = new boolean[] {false} ;
      P093D13_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093D13_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093D13_A129BarCod = new int[1] ;
      P093D13_A132BarCodReo = new byte[1] ;
      P093D13_A130BarCodPar = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.analisiscostesbasicos_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P093D3_A396EmprCod, P093D3_A279CliNom, P093D3_A161BarFecSal, P093D3_A159BarFecGen, P093D3_A1234BarNomCli, P093D3_A136BarColNum, P093D3_A135BarColNom, P093D3_A1652BarSerDsc, P093D3_A212BarSer, P093D3_A13696BarNHdr,
            P093D3_A252CliCod, P093D3_n252CliCod, P093D3_A184BarMtr, P093D3_A166BarKgm, P093D3_A129BarCod, P093D3_A132BarCodReo, P093D3_A130BarCodPar
            }
            , new Object[] {
            P093D5_A396EmprCod, P093D5_A161BarFecSal, P093D5_A159BarFecGen, P093D5_A1234BarNomCli, P093D5_A136BarColNum, P093D5_A135BarColNom, P093D5_A1652BarSerDsc, P093D5_A212BarSer, P093D5_A13696BarNHdr, P093D5_A279CliNom,
            P093D5_A252CliCod, P093D5_n252CliCod, P093D5_A184BarMtr, P093D5_A166BarKgm, P093D5_A129BarCod, P093D5_A132BarCodReo, P093D5_A130BarCodPar
            }
            , new Object[] {
            P093D7_A396EmprCod, P093D7_A212BarSer, P093D7_A161BarFecSal, P093D7_A159BarFecGen, P093D7_A1234BarNomCli, P093D7_A136BarColNum, P093D7_A135BarColNom, P093D7_A1652BarSerDsc, P093D7_A13696BarNHdr, P093D7_A279CliNom,
            P093D7_A252CliCod, P093D7_n252CliCod, P093D7_A184BarMtr, P093D7_A166BarKgm, P093D7_A129BarCod, P093D7_A132BarCodReo, P093D7_A130BarCodPar
            }
            , new Object[] {
            P093D9_A396EmprCod, P093D9_A1652BarSerDsc, P093D9_A161BarFecSal, P093D9_A159BarFecGen, P093D9_A1234BarNomCli, P093D9_A136BarColNum, P093D9_A135BarColNom, P093D9_A212BarSer, P093D9_A13696BarNHdr, P093D9_A279CliNom,
            P093D9_A252CliCod, P093D9_n252CliCod, P093D9_A184BarMtr, P093D9_A166BarKgm, P093D9_A129BarCod, P093D9_A132BarCodReo, P093D9_A130BarCodPar
            }
            , new Object[] {
            P093D11_A396EmprCod, P093D11_A135BarColNom, P093D11_A161BarFecSal, P093D11_A159BarFecGen, P093D11_A1234BarNomCli, P093D11_A136BarColNum, P093D11_A1652BarSerDsc, P093D11_A212BarSer, P093D11_A13696BarNHdr, P093D11_A279CliNom,
            P093D11_A252CliCod, P093D11_n252CliCod, P093D11_A184BarMtr, P093D11_A166BarKgm, P093D11_A129BarCod, P093D11_A132BarCodReo, P093D11_A130BarCodPar
            }
            , new Object[] {
            P093D13_A396EmprCod, P093D13_A1234BarNomCli, P093D13_A161BarFecSal, P093D13_A159BarFecGen, P093D13_A136BarColNum, P093D13_A135BarColNom, P093D13_A1652BarSerDsc, P093D13_A212BarSer, P093D13_A13696BarNHdr, P093D13_A279CliNom,
            P093D13_A252CliCod, P093D13_n252CliCod, P093D13_A184BarMtr, P093D13_A166BarKgm, P093D13_A129BarCod, P093D13_A132BarCodReo, P093D13_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV43InBarcodreo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV68GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV52TFBarColNum ;
   private int AV53TFBarColNum_To ;
   private int AV36Clicod ;
   private int AV45Clicod_to ;
   private int AV42InBarcod ;
   private int AV71Analisiscostesbasicos_wcds_2_tfclicod ;
   private int AV72Analisiscostesbasicos_wcds_3_tfclicod_to ;
   private int AV83Analisiscostesbasicos_wcds_14_tfbarcolnum ;
   private int AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV19InsertIndex ;
   private long AV28count ;
   private java.math.BigDecimal AV58TFBarKgm ;
   private java.math.BigDecimal AV59TFBarKgm_To ;
   private java.math.BigDecimal AV60TFBarMtr ;
   private java.math.BigDecimal AV61TFBarMtr_To ;
   private java.math.BigDecimal AV87Analisiscostesbasicos_wcds_18_tfbarkgm ;
   private java.math.BigDecimal AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ;
   private java.math.BigDecimal AV89Analisiscostesbasicos_wcds_20_tfbarmtr ;
   private java.math.BigDecimal AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFBarNHdr ;
   private String AV15TFBarNHdr_Sel ;
   private String AV46TFBarSer ;
   private String AV47TFBarSer_Sel ;
   private String AV48TFBarSerDsc ;
   private String AV49TFBarSerDsc_Sel ;
   private String AV50TFBarColNom ;
   private String AV51TFBarColNom_Sel ;
   private String AV56TFBarNomCli ;
   private String AV57TFBarNomCli_Sel ;
   private String AV35Emprcod ;
   private String AV41Barser ;
   private String AV44InBarcodpar ;
   private String A279CliNom ;
   private String AV73Analisiscostesbasicos_wcds_4_tfclinom ;
   private String AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ;
   private String AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ;
   private String AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ;
   private String AV77Analisiscostesbasicos_wcds_8_tfbarser ;
   private String AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ;
   private String AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ;
   private String AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ;
   private String AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ;
   private String AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ;
   private String AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ;
   private String AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ;
   private String lV41Barser ;
   private String scmdbuf ;
   private String lV73Analisiscostesbasicos_wcds_4_tfclinom ;
   private String lV75Analisiscostesbasicos_wcds_6_tfbarnhdr ;
   private String lV77Analisiscostesbasicos_wcds_8_tfbarser ;
   private String lV79Analisiscostesbasicos_wcds_10_tfbarserdsc ;
   private String lV81Analisiscostesbasicos_wcds_12_tfbarcolnom ;
   private String lV85Analisiscostesbasicos_wcds_16_tfbarnomcli ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A13696BarNHdr ;
   private String A396EmprCod ;
   private java.util.Date AV62TFBarFecGen ;
   private java.util.Date AV64TFBarFecSal ;
   private java.util.Date AV37Barfecgen ;
   private java.util.Date AV38Barfecgen_to ;
   private java.util.Date AV39BarFecsal ;
   private java.util.Date AV40Barfecsal_to ;
   private java.util.Date AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ;
   private java.util.Date AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A161BarFecSal ;
   private boolean returnInSub ;
   private boolean brk93D2 ;
   private boolean n252CliCod ;
   private boolean brk93D5 ;
   private boolean brk93D7 ;
   private boolean brk93D9 ;
   private boolean brk93D11 ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV70Analisiscostesbasicos_wcds_1_filterfulltext ;
   private String lV70Analisiscostesbasicos_wcds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P093D3_A396EmprCod ;
   private String[] P093D3_A279CliNom ;
   private java.util.Date[] P093D3_A161BarFecSal ;
   private java.util.Date[] P093D3_A159BarFecGen ;
   private String[] P093D3_A1234BarNomCli ;
   private int[] P093D3_A136BarColNum ;
   private String[] P093D3_A135BarColNom ;
   private String[] P093D3_A1652BarSerDsc ;
   private String[] P093D3_A212BarSer ;
   private String[] P093D3_A13696BarNHdr ;
   private int[] P093D3_A252CliCod ;
   private boolean[] P093D3_n252CliCod ;
   private java.math.BigDecimal[] P093D3_A184BarMtr ;
   private java.math.BigDecimal[] P093D3_A166BarKgm ;
   private int[] P093D3_A129BarCod ;
   private byte[] P093D3_A132BarCodReo ;
   private String[] P093D3_A130BarCodPar ;
   private String[] P093D5_A396EmprCod ;
   private java.util.Date[] P093D5_A161BarFecSal ;
   private java.util.Date[] P093D5_A159BarFecGen ;
   private String[] P093D5_A1234BarNomCli ;
   private int[] P093D5_A136BarColNum ;
   private String[] P093D5_A135BarColNom ;
   private String[] P093D5_A1652BarSerDsc ;
   private String[] P093D5_A212BarSer ;
   private String[] P093D5_A13696BarNHdr ;
   private String[] P093D5_A279CliNom ;
   private int[] P093D5_A252CliCod ;
   private boolean[] P093D5_n252CliCod ;
   private java.math.BigDecimal[] P093D5_A184BarMtr ;
   private java.math.BigDecimal[] P093D5_A166BarKgm ;
   private int[] P093D5_A129BarCod ;
   private byte[] P093D5_A132BarCodReo ;
   private String[] P093D5_A130BarCodPar ;
   private String[] P093D7_A396EmprCod ;
   private String[] P093D7_A212BarSer ;
   private java.util.Date[] P093D7_A161BarFecSal ;
   private java.util.Date[] P093D7_A159BarFecGen ;
   private String[] P093D7_A1234BarNomCli ;
   private int[] P093D7_A136BarColNum ;
   private String[] P093D7_A135BarColNom ;
   private String[] P093D7_A1652BarSerDsc ;
   private String[] P093D7_A13696BarNHdr ;
   private String[] P093D7_A279CliNom ;
   private int[] P093D7_A252CliCod ;
   private boolean[] P093D7_n252CliCod ;
   private java.math.BigDecimal[] P093D7_A184BarMtr ;
   private java.math.BigDecimal[] P093D7_A166BarKgm ;
   private int[] P093D7_A129BarCod ;
   private byte[] P093D7_A132BarCodReo ;
   private String[] P093D7_A130BarCodPar ;
   private String[] P093D9_A396EmprCod ;
   private String[] P093D9_A1652BarSerDsc ;
   private java.util.Date[] P093D9_A161BarFecSal ;
   private java.util.Date[] P093D9_A159BarFecGen ;
   private String[] P093D9_A1234BarNomCli ;
   private int[] P093D9_A136BarColNum ;
   private String[] P093D9_A135BarColNom ;
   private String[] P093D9_A212BarSer ;
   private String[] P093D9_A13696BarNHdr ;
   private String[] P093D9_A279CliNom ;
   private int[] P093D9_A252CliCod ;
   private boolean[] P093D9_n252CliCod ;
   private java.math.BigDecimal[] P093D9_A184BarMtr ;
   private java.math.BigDecimal[] P093D9_A166BarKgm ;
   private int[] P093D9_A129BarCod ;
   private byte[] P093D9_A132BarCodReo ;
   private String[] P093D9_A130BarCodPar ;
   private String[] P093D11_A396EmprCod ;
   private String[] P093D11_A135BarColNom ;
   private java.util.Date[] P093D11_A161BarFecSal ;
   private java.util.Date[] P093D11_A159BarFecGen ;
   private String[] P093D11_A1234BarNomCli ;
   private int[] P093D11_A136BarColNum ;
   private String[] P093D11_A1652BarSerDsc ;
   private String[] P093D11_A212BarSer ;
   private String[] P093D11_A13696BarNHdr ;
   private String[] P093D11_A279CliNom ;
   private int[] P093D11_A252CliCod ;
   private boolean[] P093D11_n252CliCod ;
   private java.math.BigDecimal[] P093D11_A184BarMtr ;
   private java.math.BigDecimal[] P093D11_A166BarKgm ;
   private int[] P093D11_A129BarCod ;
   private byte[] P093D11_A132BarCodReo ;
   private String[] P093D11_A130BarCodPar ;
   private String[] P093D13_A396EmprCod ;
   private String[] P093D13_A1234BarNomCli ;
   private java.util.Date[] P093D13_A161BarFecSal ;
   private java.util.Date[] P093D13_A159BarFecGen ;
   private int[] P093D13_A136BarColNum ;
   private String[] P093D13_A135BarColNom ;
   private String[] P093D13_A1652BarSerDsc ;
   private String[] P093D13_A212BarSer ;
   private String[] P093D13_A13696BarNHdr ;
   private String[] P093D13_A279CliNom ;
   private int[] P093D13_A252CliCod ;
   private boolean[] P093D13_n252CliCod ;
   private java.math.BigDecimal[] P093D13_A184BarMtr ;
   private java.math.BigDecimal[] P093D13_A166BarKgm ;
   private int[] P093D13_A129BarCod ;
   private byte[] P093D13_A132BarCodReo ;
   private String[] P093D13_A130BarCodPar ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class analisiscostesbasicos_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P093D3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV71Analisiscostesbasicos_wcds_2_tfclicod ,
                                          int AV72Analisiscostesbasicos_wcds_3_tfclicod_to ,
                                          String AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                          String AV73Analisiscostesbasicos_wcds_4_tfclinom ,
                                          String AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                          String AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                          String AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                          String AV77Analisiscostesbasicos_wcds_8_tfbarser ,
                                          String AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                          String AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                          String AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                          String AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                          int AV83Analisiscostesbasicos_wcds_14_tfbarcolnum ,
                                          int AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to ,
                                          String AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                          String AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                          java.math.BigDecimal AV87Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                          java.math.BigDecimal AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                          java.math.BigDecimal AV89Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                          java.math.BigDecimal AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                          java.util.Date AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                          java.util.Date AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A161BarFecSal ,
                                          String AV70Analisiscostesbasicos_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          int AV36Clicod ,
                                          int AV45Clicod_to ,
                                          java.util.Date AV37Barfecgen ,
                                          java.util.Date AV38Barfecgen_to ,
                                          String AV41Barser ,
                                          java.util.Date AV39BarFecsal ,
                                          java.util.Date AV40Barfecsal_to ,
                                          int AV42InBarcod ,
                                          byte AV43InBarcodreo ,
                                          String AV44InBarcodpar ,
                                          String A396EmprCod ,
                                          String AV35Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[50];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.BarFecSal, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T1.CliCod, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm," ;
      scmdbuf += " 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT" ;
      scmdbuf += " SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarMtr, 0),'999990.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarFecSal >= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarFecSal <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV71Analisiscostesbasicos_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV72Analisiscostesbasicos_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Analisiscostesbasicos_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV75Analisiscostesbasicos_wcds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV77Analisiscostesbasicos_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Analisiscostesbasicos_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Analisiscostesbasicos_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (0==AV83Analisiscostesbasicos_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (0==AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV85Analisiscostesbasicos_wcds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Analisiscostesbasicos_wcds_18_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Analisiscostesbasicos_wcds_20_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Analisiscostesbasicos_wcds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Analisiscostesbasicos_wcds_23_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P093D5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV71Analisiscostesbasicos_wcds_2_tfclicod ,
                                          int AV72Analisiscostesbasicos_wcds_3_tfclicod_to ,
                                          String AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                          String AV73Analisiscostesbasicos_wcds_4_tfclinom ,
                                          String AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                          String AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                          String AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                          String AV77Analisiscostesbasicos_wcds_8_tfbarser ,
                                          String AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                          String AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                          String AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                          String AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                          int AV83Analisiscostesbasicos_wcds_14_tfbarcolnum ,
                                          int AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to ,
                                          String AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                          String AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                          java.math.BigDecimal AV87Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                          java.math.BigDecimal AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                          java.math.BigDecimal AV89Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                          java.math.BigDecimal AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                          java.util.Date AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                          java.util.Date AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A161BarFecSal ,
                                          String AV70Analisiscostesbasicos_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          int AV36Clicod ,
                                          int AV45Clicod_to ,
                                          java.util.Date AV37Barfecgen ,
                                          java.util.Date AV38Barfecgen_to ,
                                          String AV41Barser ,
                                          java.util.Date AV39BarFecsal ,
                                          java.util.Date AV40Barfecsal_to ,
                                          int AV42InBarcod ,
                                          byte AV43InBarcodreo ,
                                          String AV44InBarcodpar ,
                                          String AV35Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[50];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarFecSal, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE(" ;
      scmdbuf += " T3.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarMtr, 0),'999990.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarFecSal >= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarFecSal <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( ! (0==AV71Analisiscostesbasicos_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV72Analisiscostesbasicos_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Analisiscostesbasicos_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV75Analisiscostesbasicos_wcds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV77Analisiscostesbasicos_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Analisiscostesbasicos_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Analisiscostesbasicos_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (0==AV83Analisiscostesbasicos_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (0==AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV85Analisiscostesbasicos_wcds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Analisiscostesbasicos_wcds_18_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Analisiscostesbasicos_wcds_20_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int4[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int4[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Analisiscostesbasicos_wcds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int4[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Analisiscostesbasicos_wcds_23_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int4[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P093D7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV71Analisiscostesbasicos_wcds_2_tfclicod ,
                                          int AV72Analisiscostesbasicos_wcds_3_tfclicod_to ,
                                          String AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                          String AV73Analisiscostesbasicos_wcds_4_tfclinom ,
                                          String AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                          String AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                          String AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                          String AV77Analisiscostesbasicos_wcds_8_tfbarser ,
                                          String AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                          String AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                          String AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                          String AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                          int AV83Analisiscostesbasicos_wcds_14_tfbarcolnum ,
                                          int AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to ,
                                          String AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                          String AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                          java.math.BigDecimal AV87Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                          java.math.BigDecimal AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                          java.math.BigDecimal AV89Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                          java.math.BigDecimal AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                          java.util.Date AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                          java.util.Date AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A161BarFecSal ,
                                          String AV70Analisiscostesbasicos_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          int AV36Clicod ,
                                          int AV45Clicod_to ,
                                          java.util.Date AV37Barfecgen ,
                                          java.util.Date AV38Barfecgen_to ,
                                          String AV41Barser ,
                                          java.util.Date AV39BarFecsal ,
                                          java.util.Date AV40Barfecsal_to ,
                                          int AV42InBarcod ,
                                          byte AV43InBarcodreo ,
                                          String AV44InBarcodpar ,
                                          String AV35Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[50];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarSer, T1.BarFecSal, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE(" ;
      scmdbuf += " T3.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarMtr, 0),'999990.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarFecSal >= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarFecSal <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( ! (0==AV71Analisiscostesbasicos_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV72Analisiscostesbasicos_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Analisiscostesbasicos_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV75Analisiscostesbasicos_wcds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV77Analisiscostesbasicos_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Analisiscostesbasicos_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Analisiscostesbasicos_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (0==AV83Analisiscostesbasicos_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (0==AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV85Analisiscostesbasicos_wcds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Analisiscostesbasicos_wcds_18_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Analisiscostesbasicos_wcds_20_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Analisiscostesbasicos_wcds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Analisiscostesbasicos_wcds_23_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarSer" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P093D9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV71Analisiscostesbasicos_wcds_2_tfclicod ,
                                          int AV72Analisiscostesbasicos_wcds_3_tfclicod_to ,
                                          String AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                          String AV73Analisiscostesbasicos_wcds_4_tfclinom ,
                                          String AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                          String AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                          String AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                          String AV77Analisiscostesbasicos_wcds_8_tfbarser ,
                                          String AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                          String AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                          String AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                          String AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                          int AV83Analisiscostesbasicos_wcds_14_tfbarcolnum ,
                                          int AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to ,
                                          String AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                          String AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                          java.math.BigDecimal AV87Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                          java.math.BigDecimal AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                          java.math.BigDecimal AV89Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                          java.math.BigDecimal AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                          java.util.Date AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                          java.util.Date AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A161BarFecSal ,
                                          String AV70Analisiscostesbasicos_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          int AV36Clicod ,
                                          int AV45Clicod_to ,
                                          java.util.Date AV37Barfecgen ,
                                          java.util.Date AV38Barfecgen_to ,
                                          String AV41Barser ,
                                          java.util.Date AV39BarFecsal ,
                                          java.util.Date AV40Barfecsal_to ,
                                          int AV42InBarcod ,
                                          byte AV43InBarcodreo ,
                                          String AV44InBarcodpar ,
                                          String A396EmprCod ,
                                          String AV35Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[50];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarSerDsc, T1.BarFecSal, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE(" ;
      scmdbuf += " T3.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarMtr, 0),'999990.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarFecSal >= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarFecSal <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV71Analisiscostesbasicos_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV72Analisiscostesbasicos_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Analisiscostesbasicos_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV75Analisiscostesbasicos_wcds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV77Analisiscostesbasicos_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Analisiscostesbasicos_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Analisiscostesbasicos_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV83Analisiscostesbasicos_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (0==AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV85Analisiscostesbasicos_wcds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Analisiscostesbasicos_wcds_18_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Analisiscostesbasicos_wcds_20_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Analisiscostesbasicos_wcds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Analisiscostesbasicos_wcds_23_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P093D11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV71Analisiscostesbasicos_wcds_2_tfclicod ,
                                           int AV72Analisiscostesbasicos_wcds_3_tfclicod_to ,
                                           String AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                           String AV73Analisiscostesbasicos_wcds_4_tfclinom ,
                                           String AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                           String AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                           String AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                           String AV77Analisiscostesbasicos_wcds_8_tfbarser ,
                                           String AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                           String AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                           String AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                           String AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                           int AV83Analisiscostesbasicos_wcds_14_tfbarcolnum ,
                                           int AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to ,
                                           String AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                           String AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                           java.math.BigDecimal AV87Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                           java.math.BigDecimal AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                           java.math.BigDecimal AV89Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                           java.math.BigDecimal AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                           java.util.Date AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                           java.util.Date AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A161BarFecSal ,
                                           String AV70Analisiscostesbasicos_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           int AV36Clicod ,
                                           int AV45Clicod_to ,
                                           java.util.Date AV37Barfecgen ,
                                           java.util.Date AV38Barfecgen_to ,
                                           String AV41Barser ,
                                           java.util.Date AV39BarFecsal ,
                                           java.util.Date AV40Barfecsal_to ,
                                           int AV42InBarcod ,
                                           byte AV43InBarcodreo ,
                                           String AV44InBarcodpar ,
                                           String A396EmprCod ,
                                           String AV35Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[50];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarColNom, T1.BarFecSal, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE(" ;
      scmdbuf += " T3.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarMtr, 0),'999990.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarFecSal >= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarFecSal <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV71Analisiscostesbasicos_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV72Analisiscostesbasicos_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Analisiscostesbasicos_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV75Analisiscostesbasicos_wcds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV77Analisiscostesbasicos_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Analisiscostesbasicos_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Analisiscostesbasicos_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (0==AV83Analisiscostesbasicos_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (0==AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV85Analisiscostesbasicos_wcds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Analisiscostesbasicos_wcds_18_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Analisiscostesbasicos_wcds_20_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Analisiscostesbasicos_wcds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Analisiscostesbasicos_wcds_23_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P093D13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV71Analisiscostesbasicos_wcds_2_tfclicod ,
                                           int AV72Analisiscostesbasicos_wcds_3_tfclicod_to ,
                                           String AV74Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                           String AV73Analisiscostesbasicos_wcds_4_tfclinom ,
                                           String AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                           String AV75Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                           String AV78Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                           String AV77Analisiscostesbasicos_wcds_8_tfbarser ,
                                           String AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                           String AV79Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                           String AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                           String AV81Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                           int AV83Analisiscostesbasicos_wcds_14_tfbarcolnum ,
                                           int AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to ,
                                           String AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                           String AV85Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                           java.math.BigDecimal AV87Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                           java.math.BigDecimal AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                           java.math.BigDecimal AV89Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                           java.math.BigDecimal AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                           java.util.Date AV91Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                           java.util.Date AV92Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A161BarFecSal ,
                                           String AV70Analisiscostesbasicos_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           int AV36Clicod ,
                                           int AV45Clicod_to ,
                                           java.util.Date AV37Barfecgen ,
                                           java.util.Date AV38Barfecgen_to ,
                                           String AV41Barser ,
                                           java.util.Date AV39BarFecsal ,
                                           java.util.Date AV40Barfecsal_to ,
                                           int AV42InBarcod ,
                                           byte AV43InBarcodreo ,
                                           String AV44InBarcodpar ,
                                           String A396EmprCod ,
                                           String AV35Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[50];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarFecSal, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE(" ;
      scmdbuf += " T3.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarMtr, 0),'999990.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarFecSal >= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarFecSal <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV71Analisiscostesbasicos_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV72Analisiscostesbasicos_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Analisiscostesbasicos_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV75Analisiscostesbasicos_wcds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV77Analisiscostesbasicos_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV79Analisiscostesbasicos_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Analisiscostesbasicos_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (0==AV83Analisiscostesbasicos_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (0==AV84Analisiscostesbasicos_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV85Analisiscostesbasicos_wcds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Analisiscostesbasicos_wcds_18_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Analisiscostesbasicos_wcds_19_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Analisiscostesbasicos_wcds_20_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int12[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Analisiscostesbasicos_wcds_21_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Analisiscostesbasicos_wcds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int12[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Analisiscostesbasicos_wcds_23_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int12[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarNomCli" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P093D3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] );
            case 1 :
                  return conditional_P093D5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] );
            case 2 :
                  return conditional_P093D7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] );
            case 3 :
                  return conditional_P093D9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] );
            case 4 :
                  return conditional_P093D11(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] );
            case 5 :
                  return conditional_P093D13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093D3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093D5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093D7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093D9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093D11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093D13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 11);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
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
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               return;
      }
   }

}

