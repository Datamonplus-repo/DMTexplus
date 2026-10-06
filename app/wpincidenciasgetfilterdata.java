package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wpincidenciasgetfilterdata extends GXProcedure
{
   public wpincidenciasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpincidenciasgetfilterdata.class ), "" );
   }

   public wpincidenciasgetfilterdata( int remoteHandle ,
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
      wpincidenciasgetfilterdata.this.aP5 = new String[] {""};
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
      wpincidenciasgetfilterdata.this.AV32DDOName = aP0;
      wpincidenciasgetfilterdata.this.AV30SearchTxt = aP1;
      wpincidenciasgetfilterdata.this.AV31SearchTxtTo = aP2;
      wpincidenciasgetfilterdata.this.aP3 = aP3;
      wpincidenciasgetfilterdata.this.aP4 = aP4;
      wpincidenciasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_INC_PROG") == 0 )
      {
         /* Execute user subroutine: 'LOADINC_PROGOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_INC_TERMINAL") == 0 )
      {
         /* Execute user subroutine: 'LOADINC_TERMINALOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_INC_USUARIO") == 0 )
      {
         /* Execute user subroutine: 'LOADINC_USUARIOOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV32DDOName), "DDO_INC_HDR") == 0 )
      {
         /* Execute user subroutine: 'LOADINC_HDROPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV36OptionsJson = AV35Options.toJSonString(false) ;
      AV39OptionsDescJson = AV38OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV40OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("WPIncidenciasGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WPIncidenciasGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("WPIncidenciasGridState"), null, null);
      }
      AV75GXV1 = 1 ;
      while ( AV75GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV72FilterFullText = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_DIA") == 0 )
         {
            AV10TFInc_Dia = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_LINEA") == 0 )
         {
            AV12TFInc_Linea = GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV13TFInc_Linea_To = GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HORA") == 0 )
         {
            AV14TFInc_Hora = GXutil.resetDate(localUtil.ctot( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG") == 0 )
         {
            AV16TFInc_Prog = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG_SEL") == 0 )
         {
            AV17TFInc_Prog_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL") == 0 )
         {
            AV18TFInc_Terminal = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL_SEL") == 0 )
         {
            AV19TFInc_Terminal_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO") == 0 )
         {
            AV20TFInc_Usuario = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO_SEL") == 0 )
         {
            AV21TFInc_Usuario_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR") == 0 )
         {
            AV67TFInc_Hdr = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR_SEL") == 0 )
         {
            AV68TFInc_Hdr_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV75GXV1 = (int)(AV75GXV1+1) ;
      }
      if ( AV45GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV47GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV45GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV48DynamicFiltersSelector1 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV48DynamicFiltersSelector1, "INC_DIA") == 0 )
         {
            AV50Inc_Dia1 = localUtil.ctod( AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV51Inc_Dia_To1 = localUtil.ctod( AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48DynamicFiltersSelector1, "INC_PROG") == 0 )
         {
            AV49DynamicFiltersOperator1 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV52Inc_Prog1 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
         }
         else if ( GXutil.strcmp(AV48DynamicFiltersSelector1, "INC_HDR") == 0 )
         {
            AV49DynamicFiltersOperator1 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV69Inc_Hdr1 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
         }
         if ( AV45GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV53DynamicFiltersEnabled2 = true ;
            AV47GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV45GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV54DynamicFiltersSelector2 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV54DynamicFiltersSelector2, "INC_DIA") == 0 )
            {
               AV56Inc_Dia2 = localUtil.ctod( AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               AV57Inc_Dia_To2 = localUtil.ctod( AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            }
            else if ( GXutil.strcmp(AV54DynamicFiltersSelector2, "INC_PROG") == 0 )
            {
               AV55DynamicFiltersOperator2 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV58Inc_Prog2 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            }
            else if ( GXutil.strcmp(AV54DynamicFiltersSelector2, "INC_HDR") == 0 )
            {
               AV55DynamicFiltersOperator2 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV70Inc_Hdr2 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            }
            if ( AV45GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV59DynamicFiltersEnabled3 = true ;
               AV47GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV45GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV60DynamicFiltersSelector3 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV60DynamicFiltersSelector3, "INC_DIA") == 0 )
               {
                  AV62Inc_Dia3 = localUtil.ctod( AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                  AV63Inc_Dia_To3 = localUtil.ctod( AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               }
               else if ( GXutil.strcmp(AV60DynamicFiltersSelector3, "INC_PROG") == 0 )
               {
                  AV61DynamicFiltersOperator3 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV64Inc_Prog3 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               }
               else if ( GXutil.strcmp(AV60DynamicFiltersSelector3, "INC_HDR") == 0 )
               {
                  AV61DynamicFiltersOperator3 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV71Inc_Hdr3 = AV47GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               }
            }
         }
      }
   }

   public void S121( )
   {
      /* 'LOADINC_PROGOPTIONS' Routine */
      returnInSub = false ;
      AV16TFInc_Prog = AV30SearchTxt ;
      AV17TFInc_Prog_Sel = "" ;
      AV77Wpincidenciasds_1_filterfulltext = AV72FilterFullText ;
      AV78Wpincidenciasds_2_dynamicfiltersselector1 = AV48DynamicFiltersSelector1 ;
      AV79Wpincidenciasds_3_dynamicfiltersoperator1 = AV49DynamicFiltersOperator1 ;
      AV80Wpincidenciasds_4_inc_dia1 = AV50Inc_Dia1 ;
      AV81Wpincidenciasds_5_inc_dia_to1 = AV51Inc_Dia_To1 ;
      AV82Wpincidenciasds_6_inc_prog1 = AV52Inc_Prog1 ;
      AV83Wpincidenciasds_7_inc_hdr1 = AV69Inc_Hdr1 ;
      AV84Wpincidenciasds_8_dynamicfiltersenabled2 = AV53DynamicFiltersEnabled2 ;
      AV85Wpincidenciasds_9_dynamicfiltersselector2 = AV54DynamicFiltersSelector2 ;
      AV86Wpincidenciasds_10_dynamicfiltersoperator2 = AV55DynamicFiltersOperator2 ;
      AV87Wpincidenciasds_11_inc_dia2 = AV56Inc_Dia2 ;
      AV88Wpincidenciasds_12_inc_dia_to2 = AV57Inc_Dia_To2 ;
      AV89Wpincidenciasds_13_inc_prog2 = AV58Inc_Prog2 ;
      AV90Wpincidenciasds_14_inc_hdr2 = AV70Inc_Hdr2 ;
      AV91Wpincidenciasds_15_dynamicfiltersenabled3 = AV59DynamicFiltersEnabled3 ;
      AV92Wpincidenciasds_16_dynamicfiltersselector3 = AV60DynamicFiltersSelector3 ;
      AV93Wpincidenciasds_17_dynamicfiltersoperator3 = AV61DynamicFiltersOperator3 ;
      AV94Wpincidenciasds_18_inc_dia3 = AV62Inc_Dia3 ;
      AV95Wpincidenciasds_19_inc_dia_to3 = AV63Inc_Dia_To3 ;
      AV96Wpincidenciasds_20_inc_prog3 = AV64Inc_Prog3 ;
      AV97Wpincidenciasds_21_inc_hdr3 = AV71Inc_Hdr3 ;
      AV98Wpincidenciasds_22_tfinc_dia = AV10TFInc_Dia ;
      AV99Wpincidenciasds_23_tfinc_linea = AV12TFInc_Linea ;
      AV100Wpincidenciasds_24_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV101Wpincidenciasds_25_tfinc_hora = AV14TFInc_Hora ;
      AV102Wpincidenciasds_26_tfinc_prog = AV16TFInc_Prog ;
      AV103Wpincidenciasds_27_tfinc_prog_sel = AV17TFInc_Prog_Sel ;
      AV104Wpincidenciasds_28_tfinc_terminal = AV18TFInc_Terminal ;
      AV105Wpincidenciasds_29_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV106Wpincidenciasds_30_tfinc_usuario = AV20TFInc_Usuario ;
      AV107Wpincidenciasds_31_tfinc_usuario_sel = AV21TFInc_Usuario_Sel ;
      AV108Wpincidenciasds_32_tfinc_hdr = AV67TFInc_Hdr ;
      AV109Wpincidenciasds_33_tfinc_hdr_sel = AV68TFInc_Hdr_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV77Wpincidenciasds_1_filterfulltext ,
                                           AV78Wpincidenciasds_2_dynamicfiltersselector1 ,
                                           AV80Wpincidenciasds_4_inc_dia1 ,
                                           AV81Wpincidenciasds_5_inc_dia_to1 ,
                                           Short.valueOf(AV79Wpincidenciasds_3_dynamicfiltersoperator1) ,
                                           AV82Wpincidenciasds_6_inc_prog1 ,
                                           AV83Wpincidenciasds_7_inc_hdr1 ,
                                           Boolean.valueOf(AV84Wpincidenciasds_8_dynamicfiltersenabled2) ,
                                           AV85Wpincidenciasds_9_dynamicfiltersselector2 ,
                                           AV87Wpincidenciasds_11_inc_dia2 ,
                                           AV88Wpincidenciasds_12_inc_dia_to2 ,
                                           Short.valueOf(AV86Wpincidenciasds_10_dynamicfiltersoperator2) ,
                                           AV89Wpincidenciasds_13_inc_prog2 ,
                                           AV90Wpincidenciasds_14_inc_hdr2 ,
                                           Boolean.valueOf(AV91Wpincidenciasds_15_dynamicfiltersenabled3) ,
                                           AV92Wpincidenciasds_16_dynamicfiltersselector3 ,
                                           AV94Wpincidenciasds_18_inc_dia3 ,
                                           AV95Wpincidenciasds_19_inc_dia_to3 ,
                                           Short.valueOf(AV93Wpincidenciasds_17_dynamicfiltersoperator3) ,
                                           AV96Wpincidenciasds_20_inc_prog3 ,
                                           AV97Wpincidenciasds_21_inc_hdr3 ,
                                           AV98Wpincidenciasds_22_tfinc_dia ,
                                           Long.valueOf(AV99Wpincidenciasds_23_tfinc_linea) ,
                                           Long.valueOf(AV100Wpincidenciasds_24_tfinc_linea_to) ,
                                           AV101Wpincidenciasds_25_tfinc_hora ,
                                           AV103Wpincidenciasds_27_tfinc_prog_sel ,
                                           AV102Wpincidenciasds_26_tfinc_prog ,
                                           AV105Wpincidenciasds_29_tfinc_terminal_sel ,
                                           AV104Wpincidenciasds_28_tfinc_terminal ,
                                           AV107Wpincidenciasds_31_tfinc_usuario_sel ,
                                           AV106Wpincidenciasds_30_tfinc_usuario ,
                                           AV109Wpincidenciasds_33_tfinc_hdr_sel ,
                                           AV108Wpincidenciasds_32_tfinc_hdr ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4935Inc_Prog ,
                                           A4934Inc_Termin ,
                                           A4933Inc_Usuari ,
                                           A4929Inc_Dia } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      /* Using cursor P08952 */
      pr_default.execute(0, new Object[] {AV80Wpincidenciasds_4_inc_dia1, AV81Wpincidenciasds_5_inc_dia_to1, AV87Wpincidenciasds_11_inc_dia2, AV88Wpincidenciasds_12_inc_dia_to2, AV94Wpincidenciasds_18_inc_dia3, AV95Wpincidenciasds_19_inc_dia_to3, AV98Wpincidenciasds_22_tfinc_dia});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8952 = false ;
         A4929Inc_Dia = P08952_A4929Inc_Dia[0] ;
         A396EmprCod = P08952_A396EmprCod[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk8952 = false ;
            A4929Inc_Dia = P08952_A4929Inc_Dia[0] ;
            A396EmprCod = P08952_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8952 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4935Inc_Prog)==0) )
         {
            AV34Option = A4935Inc_Prog ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8952 )
         {
            brk8952 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADINC_TERMINALOPTIONS' Routine */
      returnInSub = false ;
      AV18TFInc_Terminal = AV30SearchTxt ;
      AV19TFInc_Terminal_Sel = "" ;
      AV77Wpincidenciasds_1_filterfulltext = AV72FilterFullText ;
      AV78Wpincidenciasds_2_dynamicfiltersselector1 = AV48DynamicFiltersSelector1 ;
      AV79Wpincidenciasds_3_dynamicfiltersoperator1 = AV49DynamicFiltersOperator1 ;
      AV80Wpincidenciasds_4_inc_dia1 = AV50Inc_Dia1 ;
      AV81Wpincidenciasds_5_inc_dia_to1 = AV51Inc_Dia_To1 ;
      AV82Wpincidenciasds_6_inc_prog1 = AV52Inc_Prog1 ;
      AV83Wpincidenciasds_7_inc_hdr1 = AV69Inc_Hdr1 ;
      AV84Wpincidenciasds_8_dynamicfiltersenabled2 = AV53DynamicFiltersEnabled2 ;
      AV85Wpincidenciasds_9_dynamicfiltersselector2 = AV54DynamicFiltersSelector2 ;
      AV86Wpincidenciasds_10_dynamicfiltersoperator2 = AV55DynamicFiltersOperator2 ;
      AV87Wpincidenciasds_11_inc_dia2 = AV56Inc_Dia2 ;
      AV88Wpincidenciasds_12_inc_dia_to2 = AV57Inc_Dia_To2 ;
      AV89Wpincidenciasds_13_inc_prog2 = AV58Inc_Prog2 ;
      AV90Wpincidenciasds_14_inc_hdr2 = AV70Inc_Hdr2 ;
      AV91Wpincidenciasds_15_dynamicfiltersenabled3 = AV59DynamicFiltersEnabled3 ;
      AV92Wpincidenciasds_16_dynamicfiltersselector3 = AV60DynamicFiltersSelector3 ;
      AV93Wpincidenciasds_17_dynamicfiltersoperator3 = AV61DynamicFiltersOperator3 ;
      AV94Wpincidenciasds_18_inc_dia3 = AV62Inc_Dia3 ;
      AV95Wpincidenciasds_19_inc_dia_to3 = AV63Inc_Dia_To3 ;
      AV96Wpincidenciasds_20_inc_prog3 = AV64Inc_Prog3 ;
      AV97Wpincidenciasds_21_inc_hdr3 = AV71Inc_Hdr3 ;
      AV98Wpincidenciasds_22_tfinc_dia = AV10TFInc_Dia ;
      AV99Wpincidenciasds_23_tfinc_linea = AV12TFInc_Linea ;
      AV100Wpincidenciasds_24_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV101Wpincidenciasds_25_tfinc_hora = AV14TFInc_Hora ;
      AV102Wpincidenciasds_26_tfinc_prog = AV16TFInc_Prog ;
      AV103Wpincidenciasds_27_tfinc_prog_sel = AV17TFInc_Prog_Sel ;
      AV104Wpincidenciasds_28_tfinc_terminal = AV18TFInc_Terminal ;
      AV105Wpincidenciasds_29_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV106Wpincidenciasds_30_tfinc_usuario = AV20TFInc_Usuario ;
      AV107Wpincidenciasds_31_tfinc_usuario_sel = AV21TFInc_Usuario_Sel ;
      AV108Wpincidenciasds_32_tfinc_hdr = AV67TFInc_Hdr ;
      AV109Wpincidenciasds_33_tfinc_hdr_sel = AV68TFInc_Hdr_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV77Wpincidenciasds_1_filterfulltext ,
                                           AV78Wpincidenciasds_2_dynamicfiltersselector1 ,
                                           AV80Wpincidenciasds_4_inc_dia1 ,
                                           AV81Wpincidenciasds_5_inc_dia_to1 ,
                                           Short.valueOf(AV79Wpincidenciasds_3_dynamicfiltersoperator1) ,
                                           AV82Wpincidenciasds_6_inc_prog1 ,
                                           AV83Wpincidenciasds_7_inc_hdr1 ,
                                           Boolean.valueOf(AV84Wpincidenciasds_8_dynamicfiltersenabled2) ,
                                           AV85Wpincidenciasds_9_dynamicfiltersselector2 ,
                                           AV87Wpincidenciasds_11_inc_dia2 ,
                                           AV88Wpincidenciasds_12_inc_dia_to2 ,
                                           Short.valueOf(AV86Wpincidenciasds_10_dynamicfiltersoperator2) ,
                                           AV89Wpincidenciasds_13_inc_prog2 ,
                                           AV90Wpincidenciasds_14_inc_hdr2 ,
                                           Boolean.valueOf(AV91Wpincidenciasds_15_dynamicfiltersenabled3) ,
                                           AV92Wpincidenciasds_16_dynamicfiltersselector3 ,
                                           AV94Wpincidenciasds_18_inc_dia3 ,
                                           AV95Wpincidenciasds_19_inc_dia_to3 ,
                                           Short.valueOf(AV93Wpincidenciasds_17_dynamicfiltersoperator3) ,
                                           AV96Wpincidenciasds_20_inc_prog3 ,
                                           AV97Wpincidenciasds_21_inc_hdr3 ,
                                           AV98Wpincidenciasds_22_tfinc_dia ,
                                           Long.valueOf(AV99Wpincidenciasds_23_tfinc_linea) ,
                                           Long.valueOf(AV100Wpincidenciasds_24_tfinc_linea_to) ,
                                           AV101Wpincidenciasds_25_tfinc_hora ,
                                           AV103Wpincidenciasds_27_tfinc_prog_sel ,
                                           AV102Wpincidenciasds_26_tfinc_prog ,
                                           AV105Wpincidenciasds_29_tfinc_terminal_sel ,
                                           AV104Wpincidenciasds_28_tfinc_terminal ,
                                           AV107Wpincidenciasds_31_tfinc_usuario_sel ,
                                           AV106Wpincidenciasds_30_tfinc_usuario ,
                                           AV109Wpincidenciasds_33_tfinc_hdr_sel ,
                                           AV108Wpincidenciasds_32_tfinc_hdr ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4935Inc_Prog ,
                                           A4934Inc_Termin ,
                                           A4933Inc_Usuari ,
                                           A4929Inc_Dia } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      /* Using cursor P08953 */
      pr_default.execute(1, new Object[] {AV80Wpincidenciasds_4_inc_dia1, AV81Wpincidenciasds_5_inc_dia_to1, AV87Wpincidenciasds_11_inc_dia2, AV88Wpincidenciasds_12_inc_dia_to2, AV94Wpincidenciasds_18_inc_dia3, AV95Wpincidenciasds_19_inc_dia_to3, AV98Wpincidenciasds_22_tfinc_dia});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8954 = false ;
         A4929Inc_Dia = P08953_A4929Inc_Dia[0] ;
         A396EmprCod = P08953_A396EmprCod[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk8954 = false ;
            A4929Inc_Dia = P08953_A4929Inc_Dia[0] ;
            A396EmprCod = P08953_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8954 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4934Inc_Termin)==0) )
         {
            AV34Option = A4934Inc_Termin ;
            AV35Options.add(AV34Option, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8954 )
         {
            brk8954 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADINC_USUARIOOPTIONS' Routine */
      returnInSub = false ;
      AV20TFInc_Usuario = AV30SearchTxt ;
      AV21TFInc_Usuario_Sel = "" ;
      AV77Wpincidenciasds_1_filterfulltext = AV72FilterFullText ;
      AV78Wpincidenciasds_2_dynamicfiltersselector1 = AV48DynamicFiltersSelector1 ;
      AV79Wpincidenciasds_3_dynamicfiltersoperator1 = AV49DynamicFiltersOperator1 ;
      AV80Wpincidenciasds_4_inc_dia1 = AV50Inc_Dia1 ;
      AV81Wpincidenciasds_5_inc_dia_to1 = AV51Inc_Dia_To1 ;
      AV82Wpincidenciasds_6_inc_prog1 = AV52Inc_Prog1 ;
      AV83Wpincidenciasds_7_inc_hdr1 = AV69Inc_Hdr1 ;
      AV84Wpincidenciasds_8_dynamicfiltersenabled2 = AV53DynamicFiltersEnabled2 ;
      AV85Wpincidenciasds_9_dynamicfiltersselector2 = AV54DynamicFiltersSelector2 ;
      AV86Wpincidenciasds_10_dynamicfiltersoperator2 = AV55DynamicFiltersOperator2 ;
      AV87Wpincidenciasds_11_inc_dia2 = AV56Inc_Dia2 ;
      AV88Wpincidenciasds_12_inc_dia_to2 = AV57Inc_Dia_To2 ;
      AV89Wpincidenciasds_13_inc_prog2 = AV58Inc_Prog2 ;
      AV90Wpincidenciasds_14_inc_hdr2 = AV70Inc_Hdr2 ;
      AV91Wpincidenciasds_15_dynamicfiltersenabled3 = AV59DynamicFiltersEnabled3 ;
      AV92Wpincidenciasds_16_dynamicfiltersselector3 = AV60DynamicFiltersSelector3 ;
      AV93Wpincidenciasds_17_dynamicfiltersoperator3 = AV61DynamicFiltersOperator3 ;
      AV94Wpincidenciasds_18_inc_dia3 = AV62Inc_Dia3 ;
      AV95Wpincidenciasds_19_inc_dia_to3 = AV63Inc_Dia_To3 ;
      AV96Wpincidenciasds_20_inc_prog3 = AV64Inc_Prog3 ;
      AV97Wpincidenciasds_21_inc_hdr3 = AV71Inc_Hdr3 ;
      AV98Wpincidenciasds_22_tfinc_dia = AV10TFInc_Dia ;
      AV99Wpincidenciasds_23_tfinc_linea = AV12TFInc_Linea ;
      AV100Wpincidenciasds_24_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV101Wpincidenciasds_25_tfinc_hora = AV14TFInc_Hora ;
      AV102Wpincidenciasds_26_tfinc_prog = AV16TFInc_Prog ;
      AV103Wpincidenciasds_27_tfinc_prog_sel = AV17TFInc_Prog_Sel ;
      AV104Wpincidenciasds_28_tfinc_terminal = AV18TFInc_Terminal ;
      AV105Wpincidenciasds_29_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV106Wpincidenciasds_30_tfinc_usuario = AV20TFInc_Usuario ;
      AV107Wpincidenciasds_31_tfinc_usuario_sel = AV21TFInc_Usuario_Sel ;
      AV108Wpincidenciasds_32_tfinc_hdr = AV67TFInc_Hdr ;
      AV109Wpincidenciasds_33_tfinc_hdr_sel = AV68TFInc_Hdr_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV77Wpincidenciasds_1_filterfulltext ,
                                           AV78Wpincidenciasds_2_dynamicfiltersselector1 ,
                                           AV80Wpincidenciasds_4_inc_dia1 ,
                                           AV81Wpincidenciasds_5_inc_dia_to1 ,
                                           Short.valueOf(AV79Wpincidenciasds_3_dynamicfiltersoperator1) ,
                                           AV82Wpincidenciasds_6_inc_prog1 ,
                                           AV83Wpincidenciasds_7_inc_hdr1 ,
                                           Boolean.valueOf(AV84Wpincidenciasds_8_dynamicfiltersenabled2) ,
                                           AV85Wpincidenciasds_9_dynamicfiltersselector2 ,
                                           AV87Wpincidenciasds_11_inc_dia2 ,
                                           AV88Wpincidenciasds_12_inc_dia_to2 ,
                                           Short.valueOf(AV86Wpincidenciasds_10_dynamicfiltersoperator2) ,
                                           AV89Wpincidenciasds_13_inc_prog2 ,
                                           AV90Wpincidenciasds_14_inc_hdr2 ,
                                           Boolean.valueOf(AV91Wpincidenciasds_15_dynamicfiltersenabled3) ,
                                           AV92Wpincidenciasds_16_dynamicfiltersselector3 ,
                                           AV94Wpincidenciasds_18_inc_dia3 ,
                                           AV95Wpincidenciasds_19_inc_dia_to3 ,
                                           Short.valueOf(AV93Wpincidenciasds_17_dynamicfiltersoperator3) ,
                                           AV96Wpincidenciasds_20_inc_prog3 ,
                                           AV97Wpincidenciasds_21_inc_hdr3 ,
                                           AV98Wpincidenciasds_22_tfinc_dia ,
                                           Long.valueOf(AV99Wpincidenciasds_23_tfinc_linea) ,
                                           Long.valueOf(AV100Wpincidenciasds_24_tfinc_linea_to) ,
                                           AV101Wpincidenciasds_25_tfinc_hora ,
                                           AV103Wpincidenciasds_27_tfinc_prog_sel ,
                                           AV102Wpincidenciasds_26_tfinc_prog ,
                                           AV105Wpincidenciasds_29_tfinc_terminal_sel ,
                                           AV104Wpincidenciasds_28_tfinc_terminal ,
                                           AV107Wpincidenciasds_31_tfinc_usuario_sel ,
                                           AV106Wpincidenciasds_30_tfinc_usuario ,
                                           AV109Wpincidenciasds_33_tfinc_hdr_sel ,
                                           AV108Wpincidenciasds_32_tfinc_hdr ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4935Inc_Prog ,
                                           A4934Inc_Termin ,
                                           A4933Inc_Usuari ,
                                           A4929Inc_Dia } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      /* Using cursor P08954 */
      pr_default.execute(2, new Object[] {AV80Wpincidenciasds_4_inc_dia1, AV81Wpincidenciasds_5_inc_dia_to1, AV87Wpincidenciasds_11_inc_dia2, AV88Wpincidenciasds_12_inc_dia_to2, AV94Wpincidenciasds_18_inc_dia3, AV95Wpincidenciasds_19_inc_dia_to3, AV98Wpincidenciasds_22_tfinc_dia});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8956 = false ;
         A4929Inc_Dia = P08954_A4929Inc_Dia[0] ;
         A396EmprCod = P08954_A396EmprCod[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) )
         {
            brk8956 = false ;
            A4929Inc_Dia = P08954_A4929Inc_Dia[0] ;
            A396EmprCod = P08954_A396EmprCod[0] ;
            AV42count = (long)(AV42count+1) ;
            brk8956 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4933Inc_Usuari)==0) )
         {
            AV34Option = A4933Inc_Usuari ;
            AV37OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4933Inc_Usuari, "@!"))) ;
            AV35Options.add(AV34Option, 0);
            AV38OptionsDesc.add(AV37OptionDesc, 0);
            AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8956 )
         {
            brk8956 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADINC_HDROPTIONS' Routine */
      returnInSub = false ;
      AV67TFInc_Hdr = AV30SearchTxt ;
      AV68TFInc_Hdr_Sel = "" ;
      AV77Wpincidenciasds_1_filterfulltext = AV72FilterFullText ;
      AV78Wpincidenciasds_2_dynamicfiltersselector1 = AV48DynamicFiltersSelector1 ;
      AV79Wpincidenciasds_3_dynamicfiltersoperator1 = AV49DynamicFiltersOperator1 ;
      AV80Wpincidenciasds_4_inc_dia1 = AV50Inc_Dia1 ;
      AV81Wpincidenciasds_5_inc_dia_to1 = AV51Inc_Dia_To1 ;
      AV82Wpincidenciasds_6_inc_prog1 = AV52Inc_Prog1 ;
      AV83Wpincidenciasds_7_inc_hdr1 = AV69Inc_Hdr1 ;
      AV84Wpincidenciasds_8_dynamicfiltersenabled2 = AV53DynamicFiltersEnabled2 ;
      AV85Wpincidenciasds_9_dynamicfiltersselector2 = AV54DynamicFiltersSelector2 ;
      AV86Wpincidenciasds_10_dynamicfiltersoperator2 = AV55DynamicFiltersOperator2 ;
      AV87Wpincidenciasds_11_inc_dia2 = AV56Inc_Dia2 ;
      AV88Wpincidenciasds_12_inc_dia_to2 = AV57Inc_Dia_To2 ;
      AV89Wpincidenciasds_13_inc_prog2 = AV58Inc_Prog2 ;
      AV90Wpincidenciasds_14_inc_hdr2 = AV70Inc_Hdr2 ;
      AV91Wpincidenciasds_15_dynamicfiltersenabled3 = AV59DynamicFiltersEnabled3 ;
      AV92Wpincidenciasds_16_dynamicfiltersselector3 = AV60DynamicFiltersSelector3 ;
      AV93Wpincidenciasds_17_dynamicfiltersoperator3 = AV61DynamicFiltersOperator3 ;
      AV94Wpincidenciasds_18_inc_dia3 = AV62Inc_Dia3 ;
      AV95Wpincidenciasds_19_inc_dia_to3 = AV63Inc_Dia_To3 ;
      AV96Wpincidenciasds_20_inc_prog3 = AV64Inc_Prog3 ;
      AV97Wpincidenciasds_21_inc_hdr3 = AV71Inc_Hdr3 ;
      AV98Wpincidenciasds_22_tfinc_dia = AV10TFInc_Dia ;
      AV99Wpincidenciasds_23_tfinc_linea = AV12TFInc_Linea ;
      AV100Wpincidenciasds_24_tfinc_linea_to = AV13TFInc_Linea_To ;
      AV101Wpincidenciasds_25_tfinc_hora = AV14TFInc_Hora ;
      AV102Wpincidenciasds_26_tfinc_prog = AV16TFInc_Prog ;
      AV103Wpincidenciasds_27_tfinc_prog_sel = AV17TFInc_Prog_Sel ;
      AV104Wpincidenciasds_28_tfinc_terminal = AV18TFInc_Terminal ;
      AV105Wpincidenciasds_29_tfinc_terminal_sel = AV19TFInc_Terminal_Sel ;
      AV106Wpincidenciasds_30_tfinc_usuario = AV20TFInc_Usuario ;
      AV107Wpincidenciasds_31_tfinc_usuario_sel = AV21TFInc_Usuario_Sel ;
      AV108Wpincidenciasds_32_tfinc_hdr = AV67TFInc_Hdr ;
      AV109Wpincidenciasds_33_tfinc_hdr_sel = AV68TFInc_Hdr_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV77Wpincidenciasds_1_filterfulltext ,
                                           AV78Wpincidenciasds_2_dynamicfiltersselector1 ,
                                           AV80Wpincidenciasds_4_inc_dia1 ,
                                           AV81Wpincidenciasds_5_inc_dia_to1 ,
                                           Short.valueOf(AV79Wpincidenciasds_3_dynamicfiltersoperator1) ,
                                           AV82Wpincidenciasds_6_inc_prog1 ,
                                           AV83Wpincidenciasds_7_inc_hdr1 ,
                                           Boolean.valueOf(AV84Wpincidenciasds_8_dynamicfiltersenabled2) ,
                                           AV85Wpincidenciasds_9_dynamicfiltersselector2 ,
                                           AV87Wpincidenciasds_11_inc_dia2 ,
                                           AV88Wpincidenciasds_12_inc_dia_to2 ,
                                           Short.valueOf(AV86Wpincidenciasds_10_dynamicfiltersoperator2) ,
                                           AV89Wpincidenciasds_13_inc_prog2 ,
                                           AV90Wpincidenciasds_14_inc_hdr2 ,
                                           Boolean.valueOf(AV91Wpincidenciasds_15_dynamicfiltersenabled3) ,
                                           AV92Wpincidenciasds_16_dynamicfiltersselector3 ,
                                           AV94Wpincidenciasds_18_inc_dia3 ,
                                           AV95Wpincidenciasds_19_inc_dia_to3 ,
                                           Short.valueOf(AV93Wpincidenciasds_17_dynamicfiltersoperator3) ,
                                           AV96Wpincidenciasds_20_inc_prog3 ,
                                           AV97Wpincidenciasds_21_inc_hdr3 ,
                                           AV98Wpincidenciasds_22_tfinc_dia ,
                                           Long.valueOf(AV99Wpincidenciasds_23_tfinc_linea) ,
                                           Long.valueOf(AV100Wpincidenciasds_24_tfinc_linea_to) ,
                                           AV101Wpincidenciasds_25_tfinc_hora ,
                                           AV103Wpincidenciasds_27_tfinc_prog_sel ,
                                           AV102Wpincidenciasds_26_tfinc_prog ,
                                           AV105Wpincidenciasds_29_tfinc_terminal_sel ,
                                           AV104Wpincidenciasds_28_tfinc_terminal ,
                                           AV107Wpincidenciasds_31_tfinc_usuario_sel ,
                                           AV106Wpincidenciasds_30_tfinc_usuario ,
                                           AV109Wpincidenciasds_33_tfinc_hdr_sel ,
                                           AV108Wpincidenciasds_32_tfinc_hdr ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4935Inc_Prog ,
                                           A4934Inc_Termin ,
                                           A4933Inc_Usuari ,
                                           A4929Inc_Dia } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      /* Using cursor P08955 */
      pr_default.execute(3, new Object[] {AV80Wpincidenciasds_4_inc_dia1, AV81Wpincidenciasds_5_inc_dia_to1, AV87Wpincidenciasds_11_inc_dia2, AV88Wpincidenciasds_12_inc_dia_to2, AV94Wpincidenciasds_18_inc_dia3, AV95Wpincidenciasds_19_inc_dia_to3, AV98Wpincidenciasds_22_tfinc_dia});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A4929Inc_Dia = P08955_A4929Inc_Dia[0] ;
         A396EmprCod = P08955_A396EmprCod[0] ;
         if ( ! (GXutil.strcmp("", A13713Inc_Hdr)==0) )
         {
            AV34Option = A13713Inc_Hdr ;
            AV33InsertIndex = 1 ;
            while ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) < 0 ) )
            {
               AV33InsertIndex = (int)(AV33InsertIndex+1) ;
            }
            if ( ( AV33InsertIndex <= AV35Options.size() ) && ( GXutil.strcmp((String)AV35Options.elementAt(-1+AV33InsertIndex), AV34Option) == 0 ) )
            {
               AV42count = GXutil.lval( (String)AV40OptionIndexes.elementAt(-1+AV33InsertIndex)) ;
               AV42count = (long)(AV42count+1) ;
               AV40OptionIndexes.removeItem(AV33InsertIndex);
               AV40OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), AV33InsertIndex);
            }
            else
            {
               AV35Options.add(AV34Option, AV33InsertIndex);
               AV40OptionIndexes.add("1", AV33InsertIndex);
            }
         }
         if ( AV35Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wpincidenciasgetfilterdata.this.AV36OptionsJson;
      this.aP4[0] = wpincidenciasgetfilterdata.this.AV39OptionsDescJson;
      this.aP5[0] = wpincidenciasgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV36OptionsJson = "" ;
      AV39OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV35Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV72FilterFullText = "" ;
      AV10TFInc_Dia = GXutil.nullDate() ;
      AV14TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV16TFInc_Prog = "" ;
      AV17TFInc_Prog_Sel = "" ;
      AV18TFInc_Terminal = "" ;
      AV19TFInc_Terminal_Sel = "" ;
      AV20TFInc_Usuario = "" ;
      AV21TFInc_Usuario_Sel = "" ;
      AV67TFInc_Hdr = "" ;
      AV68TFInc_Hdr_Sel = "" ;
      AV47GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV48DynamicFiltersSelector1 = "" ;
      AV50Inc_Dia1 = GXutil.nullDate() ;
      AV51Inc_Dia_To1 = GXutil.nullDate() ;
      AV52Inc_Prog1 = "" ;
      AV69Inc_Hdr1 = "" ;
      AV54DynamicFiltersSelector2 = "" ;
      AV56Inc_Dia2 = GXutil.nullDate() ;
      AV57Inc_Dia_To2 = GXutil.nullDate() ;
      AV58Inc_Prog2 = "" ;
      AV70Inc_Hdr2 = "" ;
      AV60DynamicFiltersSelector3 = "" ;
      AV62Inc_Dia3 = GXutil.nullDate() ;
      AV63Inc_Dia_To3 = GXutil.nullDate() ;
      AV64Inc_Prog3 = "" ;
      AV71Inc_Hdr3 = "" ;
      A4935Inc_Prog = "" ;
      AV77Wpincidenciasds_1_filterfulltext = "" ;
      AV78Wpincidenciasds_2_dynamicfiltersselector1 = "" ;
      AV80Wpincidenciasds_4_inc_dia1 = GXutil.nullDate() ;
      AV81Wpincidenciasds_5_inc_dia_to1 = GXutil.nullDate() ;
      AV82Wpincidenciasds_6_inc_prog1 = "" ;
      AV83Wpincidenciasds_7_inc_hdr1 = "" ;
      AV85Wpincidenciasds_9_dynamicfiltersselector2 = "" ;
      AV87Wpincidenciasds_11_inc_dia2 = GXutil.nullDate() ;
      AV88Wpincidenciasds_12_inc_dia_to2 = GXutil.nullDate() ;
      AV89Wpincidenciasds_13_inc_prog2 = "" ;
      AV90Wpincidenciasds_14_inc_hdr2 = "" ;
      AV92Wpincidenciasds_16_dynamicfiltersselector3 = "" ;
      AV94Wpincidenciasds_18_inc_dia3 = GXutil.nullDate() ;
      AV95Wpincidenciasds_19_inc_dia_to3 = GXutil.nullDate() ;
      AV96Wpincidenciasds_20_inc_prog3 = "" ;
      AV97Wpincidenciasds_21_inc_hdr3 = "" ;
      AV98Wpincidenciasds_22_tfinc_dia = GXutil.nullDate() ;
      AV101Wpincidenciasds_25_tfinc_hora = GXutil.resetTime( GXutil.nullDate() );
      AV102Wpincidenciasds_26_tfinc_prog = "" ;
      AV103Wpincidenciasds_27_tfinc_prog_sel = "" ;
      AV104Wpincidenciasds_28_tfinc_terminal = "" ;
      AV105Wpincidenciasds_29_tfinc_terminal_sel = "" ;
      AV106Wpincidenciasds_30_tfinc_usuario = "" ;
      AV107Wpincidenciasds_31_tfinc_usuario_sel = "" ;
      AV108Wpincidenciasds_32_tfinc_hdr = "" ;
      AV109Wpincidenciasds_33_tfinc_hdr_sel = "" ;
      scmdbuf = "" ;
      A4934Inc_Termin = "" ;
      A4933Inc_Usuari = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      P08952_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08952_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV34Option = "" ;
      P08953_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08953_A396EmprCod = new String[] {""} ;
      P08954_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08954_A396EmprCod = new String[] {""} ;
      AV37OptionDesc = "" ;
      A13713Inc_Hdr = "" ;
      P08955_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P08955_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpincidenciasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08952_A4929Inc_Dia, P08952_A396EmprCod
            }
            , new Object[] {
            P08953_A4929Inc_Dia, P08953_A396EmprCod
            }
            , new Object[] {
            P08954_A4929Inc_Dia, P08954_A396EmprCod
            }
            , new Object[] {
            P08955_A4929Inc_Dia, P08955_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV49DynamicFiltersOperator1 ;
   private short AV55DynamicFiltersOperator2 ;
   private short AV61DynamicFiltersOperator3 ;
   private short AV79Wpincidenciasds_3_dynamicfiltersoperator1 ;
   private short AV86Wpincidenciasds_10_dynamicfiltersoperator2 ;
   private short AV93Wpincidenciasds_17_dynamicfiltersoperator3 ;
   private short Gx_err ;
   private int AV75GXV1 ;
   private int AV33InsertIndex ;
   private long AV12TFInc_Linea ;
   private long AV13TFInc_Linea_To ;
   private long AV99Wpincidenciasds_23_tfinc_linea ;
   private long AV100Wpincidenciasds_24_tfinc_linea_to ;
   private long A4931Inc_Linea ;
   private long AV42count ;
   private String AV16TFInc_Prog ;
   private String AV17TFInc_Prog_Sel ;
   private String AV18TFInc_Terminal ;
   private String AV19TFInc_Terminal_Sel ;
   private String AV20TFInc_Usuario ;
   private String AV21TFInc_Usuario_Sel ;
   private String AV67TFInc_Hdr ;
   private String AV68TFInc_Hdr_Sel ;
   private String AV52Inc_Prog1 ;
   private String AV69Inc_Hdr1 ;
   private String AV58Inc_Prog2 ;
   private String AV70Inc_Hdr2 ;
   private String AV64Inc_Prog3 ;
   private String AV71Inc_Hdr3 ;
   private String A4935Inc_Prog ;
   private String AV82Wpincidenciasds_6_inc_prog1 ;
   private String AV83Wpincidenciasds_7_inc_hdr1 ;
   private String AV89Wpincidenciasds_13_inc_prog2 ;
   private String AV90Wpincidenciasds_14_inc_hdr2 ;
   private String AV96Wpincidenciasds_20_inc_prog3 ;
   private String AV97Wpincidenciasds_21_inc_hdr3 ;
   private String AV102Wpincidenciasds_26_tfinc_prog ;
   private String AV103Wpincidenciasds_27_tfinc_prog_sel ;
   private String AV104Wpincidenciasds_28_tfinc_terminal ;
   private String AV105Wpincidenciasds_29_tfinc_terminal_sel ;
   private String AV106Wpincidenciasds_30_tfinc_usuario ;
   private String AV107Wpincidenciasds_31_tfinc_usuario_sel ;
   private String AV108Wpincidenciasds_32_tfinc_hdr ;
   private String AV109Wpincidenciasds_33_tfinc_hdr_sel ;
   private String scmdbuf ;
   private String A4934Inc_Termin ;
   private String A4933Inc_Usuari ;
   private String A396EmprCod ;
   private String A13713Inc_Hdr ;
   private java.util.Date AV14TFInc_Hora ;
   private java.util.Date AV101Wpincidenciasds_25_tfinc_hora ;
   private java.util.Date AV10TFInc_Dia ;
   private java.util.Date AV50Inc_Dia1 ;
   private java.util.Date AV51Inc_Dia_To1 ;
   private java.util.Date AV56Inc_Dia2 ;
   private java.util.Date AV57Inc_Dia_To2 ;
   private java.util.Date AV62Inc_Dia3 ;
   private java.util.Date AV63Inc_Dia_To3 ;
   private java.util.Date AV80Wpincidenciasds_4_inc_dia1 ;
   private java.util.Date AV81Wpincidenciasds_5_inc_dia_to1 ;
   private java.util.Date AV87Wpincidenciasds_11_inc_dia2 ;
   private java.util.Date AV88Wpincidenciasds_12_inc_dia_to2 ;
   private java.util.Date AV94Wpincidenciasds_18_inc_dia3 ;
   private java.util.Date AV95Wpincidenciasds_19_inc_dia_to3 ;
   private java.util.Date AV98Wpincidenciasds_22_tfinc_dia ;
   private java.util.Date A4929Inc_Dia ;
   private boolean returnInSub ;
   private boolean AV53DynamicFiltersEnabled2 ;
   private boolean AV59DynamicFiltersEnabled3 ;
   private boolean AV84Wpincidenciasds_8_dynamicfiltersenabled2 ;
   private boolean AV91Wpincidenciasds_15_dynamicfiltersenabled3 ;
   private boolean brk8952 ;
   private boolean brk8954 ;
   private boolean brk8956 ;
   private String AV36OptionsJson ;
   private String AV39OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV32DDOName ;
   private String AV30SearchTxt ;
   private String AV31SearchTxtTo ;
   private String AV72FilterFullText ;
   private String AV48DynamicFiltersSelector1 ;
   private String AV54DynamicFiltersSelector2 ;
   private String AV60DynamicFiltersSelector3 ;
   private String AV77Wpincidenciasds_1_filterfulltext ;
   private String AV78Wpincidenciasds_2_dynamicfiltersselector1 ;
   private String AV85Wpincidenciasds_9_dynamicfiltersselector2 ;
   private String AV92Wpincidenciasds_16_dynamicfiltersselector3 ;
   private String AV34Option ;
   private String AV37OptionDesc ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08952_A4929Inc_Dia ;
   private String[] P08952_A396EmprCod ;
   private java.util.Date[] P08953_A4929Inc_Dia ;
   private String[] P08953_A396EmprCod ;
   private java.util.Date[] P08954_A4929Inc_Dia ;
   private String[] P08954_A396EmprCod ;
   private java.util.Date[] P08955_A4929Inc_Dia ;
   private String[] P08955_A396EmprCod ;
   private GXSimpleCollection<String> AV35Options ;
   private GXSimpleCollection<String> AV38OptionsDesc ;
   private GXSimpleCollection<String> AV40OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV47GridStateDynamicFilter ;
}

final  class wpincidenciasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08952( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Wpincidenciasds_1_filterfulltext ,
                                          String AV78Wpincidenciasds_2_dynamicfiltersselector1 ,
                                          java.util.Date AV80Wpincidenciasds_4_inc_dia1 ,
                                          java.util.Date AV81Wpincidenciasds_5_inc_dia_to1 ,
                                          short AV79Wpincidenciasds_3_dynamicfiltersoperator1 ,
                                          String AV82Wpincidenciasds_6_inc_prog1 ,
                                          String AV83Wpincidenciasds_7_inc_hdr1 ,
                                          boolean AV84Wpincidenciasds_8_dynamicfiltersenabled2 ,
                                          String AV85Wpincidenciasds_9_dynamicfiltersselector2 ,
                                          java.util.Date AV87Wpincidenciasds_11_inc_dia2 ,
                                          java.util.Date AV88Wpincidenciasds_12_inc_dia_to2 ,
                                          short AV86Wpincidenciasds_10_dynamicfiltersoperator2 ,
                                          String AV89Wpincidenciasds_13_inc_prog2 ,
                                          String AV90Wpincidenciasds_14_inc_hdr2 ,
                                          boolean AV91Wpincidenciasds_15_dynamicfiltersenabled3 ,
                                          String AV92Wpincidenciasds_16_dynamicfiltersselector3 ,
                                          java.util.Date AV94Wpincidenciasds_18_inc_dia3 ,
                                          java.util.Date AV95Wpincidenciasds_19_inc_dia_to3 ,
                                          short AV93Wpincidenciasds_17_dynamicfiltersoperator3 ,
                                          String AV96Wpincidenciasds_20_inc_prog3 ,
                                          String AV97Wpincidenciasds_21_inc_hdr3 ,
                                          java.util.Date AV98Wpincidenciasds_22_tfinc_dia ,
                                          long AV99Wpincidenciasds_23_tfinc_linea ,
                                          long AV100Wpincidenciasds_24_tfinc_linea_to ,
                                          java.util.Date AV101Wpincidenciasds_25_tfinc_hora ,
                                          String AV103Wpincidenciasds_27_tfinc_prog_sel ,
                                          String AV102Wpincidenciasds_26_tfinc_prog ,
                                          String AV105Wpincidenciasds_29_tfinc_terminal_sel ,
                                          String AV104Wpincidenciasds_28_tfinc_terminal ,
                                          String AV107Wpincidenciasds_31_tfinc_usuario_sel ,
                                          String AV106Wpincidenciasds_30_tfinc_usuario ,
                                          String AV109Wpincidenciasds_33_tfinc_hdr_sel ,
                                          String AV108Wpincidenciasds_32_tfinc_hdr ,
                                          long A4931Inc_Linea ,
                                          String A4935Inc_Prog ,
                                          String A4934Inc_Termin ,
                                          String A4933Inc_Usuari ,
                                          java.util.Date A4929Inc_Dia )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[7];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT Inc_Dia, EmprCod FROM TXPCRTINC" ;
      if ( ( GXutil.strcmp(AV78Wpincidenciasds_2_dynamicfiltersselector1, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Wpincidenciasds_4_inc_dia1)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV78Wpincidenciasds_2_dynamicfiltersselector1, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Wpincidenciasds_5_inc_dia_to1)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( AV84Wpincidenciasds_8_dynamicfiltersenabled2 && ( GXutil.strcmp(AV85Wpincidenciasds_9_dynamicfiltersselector2, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Wpincidenciasds_11_inc_dia2)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( AV84Wpincidenciasds_8_dynamicfiltersenabled2 && ( GXutil.strcmp(AV85Wpincidenciasds_9_dynamicfiltersselector2, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wpincidenciasds_12_inc_dia_to2)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( AV91Wpincidenciasds_15_dynamicfiltersenabled3 && ( GXutil.strcmp(AV92Wpincidenciasds_16_dynamicfiltersselector3, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Wpincidenciasds_18_inc_dia3)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( AV91Wpincidenciasds_15_dynamicfiltersenabled3 && ( GXutil.strcmp(AV92Wpincidenciasds_16_dynamicfiltersselector3, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Wpincidenciasds_19_inc_dia_to3)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wpincidenciasds_22_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08953( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Wpincidenciasds_1_filterfulltext ,
                                          String AV78Wpincidenciasds_2_dynamicfiltersselector1 ,
                                          java.util.Date AV80Wpincidenciasds_4_inc_dia1 ,
                                          java.util.Date AV81Wpincidenciasds_5_inc_dia_to1 ,
                                          short AV79Wpincidenciasds_3_dynamicfiltersoperator1 ,
                                          String AV82Wpincidenciasds_6_inc_prog1 ,
                                          String AV83Wpincidenciasds_7_inc_hdr1 ,
                                          boolean AV84Wpincidenciasds_8_dynamicfiltersenabled2 ,
                                          String AV85Wpincidenciasds_9_dynamicfiltersselector2 ,
                                          java.util.Date AV87Wpincidenciasds_11_inc_dia2 ,
                                          java.util.Date AV88Wpincidenciasds_12_inc_dia_to2 ,
                                          short AV86Wpincidenciasds_10_dynamicfiltersoperator2 ,
                                          String AV89Wpincidenciasds_13_inc_prog2 ,
                                          String AV90Wpincidenciasds_14_inc_hdr2 ,
                                          boolean AV91Wpincidenciasds_15_dynamicfiltersenabled3 ,
                                          String AV92Wpincidenciasds_16_dynamicfiltersselector3 ,
                                          java.util.Date AV94Wpincidenciasds_18_inc_dia3 ,
                                          java.util.Date AV95Wpincidenciasds_19_inc_dia_to3 ,
                                          short AV93Wpincidenciasds_17_dynamicfiltersoperator3 ,
                                          String AV96Wpincidenciasds_20_inc_prog3 ,
                                          String AV97Wpincidenciasds_21_inc_hdr3 ,
                                          java.util.Date AV98Wpincidenciasds_22_tfinc_dia ,
                                          long AV99Wpincidenciasds_23_tfinc_linea ,
                                          long AV100Wpincidenciasds_24_tfinc_linea_to ,
                                          java.util.Date AV101Wpincidenciasds_25_tfinc_hora ,
                                          String AV103Wpincidenciasds_27_tfinc_prog_sel ,
                                          String AV102Wpincidenciasds_26_tfinc_prog ,
                                          String AV105Wpincidenciasds_29_tfinc_terminal_sel ,
                                          String AV104Wpincidenciasds_28_tfinc_terminal ,
                                          String AV107Wpincidenciasds_31_tfinc_usuario_sel ,
                                          String AV106Wpincidenciasds_30_tfinc_usuario ,
                                          String AV109Wpincidenciasds_33_tfinc_hdr_sel ,
                                          String AV108Wpincidenciasds_32_tfinc_hdr ,
                                          long A4931Inc_Linea ,
                                          String A4935Inc_Prog ,
                                          String A4934Inc_Termin ,
                                          String A4933Inc_Usuari ,
                                          java.util.Date A4929Inc_Dia )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[7];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT Inc_Dia, EmprCod FROM TXPCRTINC" ;
      if ( ( GXutil.strcmp(AV78Wpincidenciasds_2_dynamicfiltersselector1, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Wpincidenciasds_4_inc_dia1)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV78Wpincidenciasds_2_dynamicfiltersselector1, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Wpincidenciasds_5_inc_dia_to1)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( AV84Wpincidenciasds_8_dynamicfiltersenabled2 && ( GXutil.strcmp(AV85Wpincidenciasds_9_dynamicfiltersselector2, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Wpincidenciasds_11_inc_dia2)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( AV84Wpincidenciasds_8_dynamicfiltersenabled2 && ( GXutil.strcmp(AV85Wpincidenciasds_9_dynamicfiltersselector2, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wpincidenciasds_12_inc_dia_to2)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( AV91Wpincidenciasds_15_dynamicfiltersenabled3 && ( GXutil.strcmp(AV92Wpincidenciasds_16_dynamicfiltersselector3, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Wpincidenciasds_18_inc_dia3)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( AV91Wpincidenciasds_15_dynamicfiltersenabled3 && ( GXutil.strcmp(AV92Wpincidenciasds_16_dynamicfiltersselector3, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Wpincidenciasds_19_inc_dia_to3)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wpincidenciasds_22_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08954( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Wpincidenciasds_1_filterfulltext ,
                                          String AV78Wpincidenciasds_2_dynamicfiltersselector1 ,
                                          java.util.Date AV80Wpincidenciasds_4_inc_dia1 ,
                                          java.util.Date AV81Wpincidenciasds_5_inc_dia_to1 ,
                                          short AV79Wpincidenciasds_3_dynamicfiltersoperator1 ,
                                          String AV82Wpincidenciasds_6_inc_prog1 ,
                                          String AV83Wpincidenciasds_7_inc_hdr1 ,
                                          boolean AV84Wpincidenciasds_8_dynamicfiltersenabled2 ,
                                          String AV85Wpincidenciasds_9_dynamicfiltersselector2 ,
                                          java.util.Date AV87Wpincidenciasds_11_inc_dia2 ,
                                          java.util.Date AV88Wpincidenciasds_12_inc_dia_to2 ,
                                          short AV86Wpincidenciasds_10_dynamicfiltersoperator2 ,
                                          String AV89Wpincidenciasds_13_inc_prog2 ,
                                          String AV90Wpincidenciasds_14_inc_hdr2 ,
                                          boolean AV91Wpincidenciasds_15_dynamicfiltersenabled3 ,
                                          String AV92Wpincidenciasds_16_dynamicfiltersselector3 ,
                                          java.util.Date AV94Wpincidenciasds_18_inc_dia3 ,
                                          java.util.Date AV95Wpincidenciasds_19_inc_dia_to3 ,
                                          short AV93Wpincidenciasds_17_dynamicfiltersoperator3 ,
                                          String AV96Wpincidenciasds_20_inc_prog3 ,
                                          String AV97Wpincidenciasds_21_inc_hdr3 ,
                                          java.util.Date AV98Wpincidenciasds_22_tfinc_dia ,
                                          long AV99Wpincidenciasds_23_tfinc_linea ,
                                          long AV100Wpincidenciasds_24_tfinc_linea_to ,
                                          java.util.Date AV101Wpincidenciasds_25_tfinc_hora ,
                                          String AV103Wpincidenciasds_27_tfinc_prog_sel ,
                                          String AV102Wpincidenciasds_26_tfinc_prog ,
                                          String AV105Wpincidenciasds_29_tfinc_terminal_sel ,
                                          String AV104Wpincidenciasds_28_tfinc_terminal ,
                                          String AV107Wpincidenciasds_31_tfinc_usuario_sel ,
                                          String AV106Wpincidenciasds_30_tfinc_usuario ,
                                          String AV109Wpincidenciasds_33_tfinc_hdr_sel ,
                                          String AV108Wpincidenciasds_32_tfinc_hdr ,
                                          long A4931Inc_Linea ,
                                          String A4935Inc_Prog ,
                                          String A4934Inc_Termin ,
                                          String A4933Inc_Usuari ,
                                          java.util.Date A4929Inc_Dia )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[7];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT Inc_Dia, EmprCod FROM TXPCRTINC" ;
      if ( ( GXutil.strcmp(AV78Wpincidenciasds_2_dynamicfiltersselector1, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Wpincidenciasds_4_inc_dia1)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV78Wpincidenciasds_2_dynamicfiltersselector1, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Wpincidenciasds_5_inc_dia_to1)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( AV84Wpincidenciasds_8_dynamicfiltersenabled2 && ( GXutil.strcmp(AV85Wpincidenciasds_9_dynamicfiltersselector2, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Wpincidenciasds_11_inc_dia2)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( AV84Wpincidenciasds_8_dynamicfiltersenabled2 && ( GXutil.strcmp(AV85Wpincidenciasds_9_dynamicfiltersselector2, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wpincidenciasds_12_inc_dia_to2)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( AV91Wpincidenciasds_15_dynamicfiltersenabled3 && ( GXutil.strcmp(AV92Wpincidenciasds_16_dynamicfiltersselector3, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Wpincidenciasds_18_inc_dia3)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( AV91Wpincidenciasds_15_dynamicfiltersenabled3 && ( GXutil.strcmp(AV92Wpincidenciasds_16_dynamicfiltersselector3, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Wpincidenciasds_19_inc_dia_to3)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wpincidenciasds_22_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08955( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV77Wpincidenciasds_1_filterfulltext ,
                                          String AV78Wpincidenciasds_2_dynamicfiltersselector1 ,
                                          java.util.Date AV80Wpincidenciasds_4_inc_dia1 ,
                                          java.util.Date AV81Wpincidenciasds_5_inc_dia_to1 ,
                                          short AV79Wpincidenciasds_3_dynamicfiltersoperator1 ,
                                          String AV82Wpincidenciasds_6_inc_prog1 ,
                                          String AV83Wpincidenciasds_7_inc_hdr1 ,
                                          boolean AV84Wpincidenciasds_8_dynamicfiltersenabled2 ,
                                          String AV85Wpincidenciasds_9_dynamicfiltersselector2 ,
                                          java.util.Date AV87Wpincidenciasds_11_inc_dia2 ,
                                          java.util.Date AV88Wpincidenciasds_12_inc_dia_to2 ,
                                          short AV86Wpincidenciasds_10_dynamicfiltersoperator2 ,
                                          String AV89Wpincidenciasds_13_inc_prog2 ,
                                          String AV90Wpincidenciasds_14_inc_hdr2 ,
                                          boolean AV91Wpincidenciasds_15_dynamicfiltersenabled3 ,
                                          String AV92Wpincidenciasds_16_dynamicfiltersselector3 ,
                                          java.util.Date AV94Wpincidenciasds_18_inc_dia3 ,
                                          java.util.Date AV95Wpincidenciasds_19_inc_dia_to3 ,
                                          short AV93Wpincidenciasds_17_dynamicfiltersoperator3 ,
                                          String AV96Wpincidenciasds_20_inc_prog3 ,
                                          String AV97Wpincidenciasds_21_inc_hdr3 ,
                                          java.util.Date AV98Wpincidenciasds_22_tfinc_dia ,
                                          long AV99Wpincidenciasds_23_tfinc_linea ,
                                          long AV100Wpincidenciasds_24_tfinc_linea_to ,
                                          java.util.Date AV101Wpincidenciasds_25_tfinc_hora ,
                                          String AV103Wpincidenciasds_27_tfinc_prog_sel ,
                                          String AV102Wpincidenciasds_26_tfinc_prog ,
                                          String AV105Wpincidenciasds_29_tfinc_terminal_sel ,
                                          String AV104Wpincidenciasds_28_tfinc_terminal ,
                                          String AV107Wpincidenciasds_31_tfinc_usuario_sel ,
                                          String AV106Wpincidenciasds_30_tfinc_usuario ,
                                          String AV109Wpincidenciasds_33_tfinc_hdr_sel ,
                                          String AV108Wpincidenciasds_32_tfinc_hdr ,
                                          long A4931Inc_Linea ,
                                          String A4935Inc_Prog ,
                                          String A4934Inc_Termin ,
                                          String A4933Inc_Usuari ,
                                          java.util.Date A4929Inc_Dia )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[7];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT Inc_Dia, EmprCod FROM TXPCRTINC" ;
      if ( ( GXutil.strcmp(AV78Wpincidenciasds_2_dynamicfiltersselector1, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Wpincidenciasds_4_inc_dia1)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV78Wpincidenciasds_2_dynamicfiltersselector1, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Wpincidenciasds_5_inc_dia_to1)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( AV84Wpincidenciasds_8_dynamicfiltersenabled2 && ( GXutil.strcmp(AV85Wpincidenciasds_9_dynamicfiltersselector2, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Wpincidenciasds_11_inc_dia2)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( AV84Wpincidenciasds_8_dynamicfiltersenabled2 && ( GXutil.strcmp(AV85Wpincidenciasds_9_dynamicfiltersselector2, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Wpincidenciasds_12_inc_dia_to2)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( AV91Wpincidenciasds_15_dynamicfiltersenabled3 && ( GXutil.strcmp(AV92Wpincidenciasds_16_dynamicfiltersselector3, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Wpincidenciasds_18_inc_dia3)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( AV91Wpincidenciasds_15_dynamicfiltersenabled3 && ( GXutil.strcmp(AV92Wpincidenciasds_16_dynamicfiltersselector3, httpContext.getMessage( "INC_DIA", "")) == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Wpincidenciasds_19_inc_dia_to3)) ) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Wpincidenciasds_22_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, Inc_Dia" ;
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
                  return conditional_P08952(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).longValue() , ((Number) dynConstraints[23]).longValue() , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[40] );
            case 1 :
                  return conditional_P08953(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).longValue() , ((Number) dynConstraints[23]).longValue() , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[40] );
            case 2 :
                  return conditional_P08954(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).longValue() , ((Number) dynConstraints[23]).longValue() , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[40] );
            case 3 :
                  return conditional_P08955(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).longValue() , ((Number) dynConstraints[23]).longValue() , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[40] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08952", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08953", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08954", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08955", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[8]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               return;
      }
   }

}

