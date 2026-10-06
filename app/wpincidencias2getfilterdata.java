package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wpincidencias2getfilterdata extends GXProcedure
{
   public wpincidencias2getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpincidencias2getfilterdata.class ), "" );
   }

   public wpincidencias2getfilterdata( int remoteHandle ,
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
      wpincidencias2getfilterdata.this.aP5 = new String[] {""};
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
      wpincidencias2getfilterdata.this.AV24DDOName = aP0;
      wpincidencias2getfilterdata.this.AV22SearchTxt = aP1;
      wpincidencias2getfilterdata.this.AV23SearchTxtTo = aP2;
      wpincidencias2getfilterdata.this.aP3 = aP3;
      wpincidencias2getfilterdata.this.aP4 = aP4;
      wpincidencias2getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_INC_PROG") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_INC_TERMINAL") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_INC_USUARIO") == 0 )
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
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("WPIncidencias2GridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WPIncidencias2GridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("WPIncidencias2GridState"), null, null);
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV56FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_DIA") == 0 )
         {
            AV10TFInc_Dia = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_LINEA") == 0 )
         {
            AV12TFInc_Linea = GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV13TFInc_Linea_To = GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HORA") == 0 )
         {
            AV14TFInc_Hora = GXutil.resetDate(localUtil.ctot( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG") == 0 )
         {
            AV16TFInc_Prog = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG_SEL") == 0 )
         {
            AV17TFInc_Prog_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL") == 0 )
         {
            AV18TFInc_Terminal = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL_SEL") == 0 )
         {
            AV19TFInc_Terminal_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO") == 0 )
         {
            AV20TFInc_Usuario = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO_SEL") == 0 )
         {
            AV21TFInc_Usuario_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
      if ( AV37GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV39GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV37GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV40DynamicFiltersSelector1 = AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         if ( GXutil.strcmp(AV40DynamicFiltersSelector1, "INC_NUM_ULT") == 0 )
         {
            AV41DynamicFiltersOperator1 = AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV42Inc_Num_ult1 = GXutil.lval( AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value()) ;
         }
         else if ( GXutil.strcmp(AV40DynamicFiltersSelector1, "EMPRNOM") == 0 )
         {
            AV41DynamicFiltersOperator1 = AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            AV43EmprNom1 = AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
         }
         if ( AV37GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            AV44DynamicFiltersEnabled2 = true ;
            AV39GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV37GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV45DynamicFiltersSelector2 = AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            if ( GXutil.strcmp(AV45DynamicFiltersSelector2, "INC_NUM_ULT") == 0 )
            {
               AV46DynamicFiltersOperator2 = AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV47Inc_Num_ult2 = GXutil.lval( AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value()) ;
            }
            else if ( GXutil.strcmp(AV45DynamicFiltersSelector2, "EMPRNOM") == 0 )
            {
               AV46DynamicFiltersOperator2 = AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               AV48EmprNom2 = AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            }
            if ( AV37GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               AV49DynamicFiltersEnabled3 = true ;
               AV39GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV37GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV50DynamicFiltersSelector3 = AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               if ( GXutil.strcmp(AV50DynamicFiltersSelector3, "INC_NUM_ULT") == 0 )
               {
                  AV51DynamicFiltersOperator3 = AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV52Inc_Num_ult3 = GXutil.lval( AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value()) ;
               }
               else if ( GXutil.strcmp(AV50DynamicFiltersSelector3, "EMPRNOM") == 0 )
               {
                  AV51DynamicFiltersOperator3 = AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  AV53EmprNom3 = AV39GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               }
            }
         }
      }
   }

   public void S121( )
   {
      /* 'LOADINC_PROGOPTIONS' Routine */
      returnInSub = false ;
      AV16TFInc_Prog = AV22SearchTxt ;
      AV17TFInc_Prog_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV56FilterFullText ,
                                           AV40DynamicFiltersSelector1 ,
                                           Short.valueOf(AV41DynamicFiltersOperator1) ,
                                           Long.valueOf(AV42Inc_Num_ult1) ,
                                           AV43EmprNom1 ,
                                           Boolean.valueOf(AV44DynamicFiltersEnabled2) ,
                                           AV45DynamicFiltersSelector2 ,
                                           Short.valueOf(AV46DynamicFiltersOperator2) ,
                                           Long.valueOf(AV47Inc_Num_ult2) ,
                                           AV48EmprNom2 ,
                                           Boolean.valueOf(AV49DynamicFiltersEnabled3) ,
                                           AV50DynamicFiltersSelector3 ,
                                           Short.valueOf(AV51DynamicFiltersOperator3) ,
                                           Long.valueOf(AV52Inc_Num_ult3) ,
                                           AV53EmprNom3 ,
                                           AV10TFInc_Dia ,
                                           Long.valueOf(AV12TFInc_Linea) ,
                                           Long.valueOf(AV13TFInc_Linea_To) ,
                                           AV14TFInc_Hora ,
                                           AV17TFInc_Prog_Sel ,
                                           AV16TFInc_Prog ,
                                           AV19TFInc_Terminal_Sel ,
                                           AV18TFInc_Terminal ,
                                           AV21TFInc_Usuario_Sel ,
                                           AV20TFInc_Usuario ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4935Inc_Prog ,
                                           A4934Inc_Termin ,
                                           A4933Inc_Usuari ,
                                           A4936Inc_Obs ,
                                           Long.valueOf(A4930Inc_Num_ul) ,
                                           A407EmprNom ,
                                           A4929Inc_Dia } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE
                                           }
      });
      lV43EmprNom1 = GXutil.padr( GXutil.rtrim( AV43EmprNom1), 30, "%") ;
      lV43EmprNom1 = GXutil.padr( GXutil.rtrim( AV43EmprNom1), 30, "%") ;
      lV48EmprNom2 = GXutil.padr( GXutil.rtrim( AV48EmprNom2), 30, "%") ;
      lV48EmprNom2 = GXutil.padr( GXutil.rtrim( AV48EmprNom2), 30, "%") ;
      lV53EmprNom3 = GXutil.padr( GXutil.rtrim( AV53EmprNom3), 30, "%") ;
      lV53EmprNom3 = GXutil.padr( GXutil.rtrim( AV53EmprNom3), 30, "%") ;
      /* Using cursor P089H2 */
      pr_default.execute(0, new Object[] {Long.valueOf(AV42Inc_Num_ult1), Long.valueOf(AV42Inc_Num_ult1), Long.valueOf(AV42Inc_Num_ult1), lV43EmprNom1, lV43EmprNom1, Long.valueOf(AV47Inc_Num_ult2), Long.valueOf(AV47Inc_Num_ult2), Long.valueOf(AV47Inc_Num_ult2), lV48EmprNom2, lV48EmprNom2, Long.valueOf(AV52Inc_Num_ult3), Long.valueOf(AV52Inc_Num_ult3), Long.valueOf(AV52Inc_Num_ult3), lV53EmprNom3, lV53EmprNom3, AV10TFInc_Dia});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk89H2 = false ;
         A396EmprCod = P089H2_A396EmprCod[0] ;
         A4929Inc_Dia = P089H2_A4929Inc_Dia[0] ;
         A407EmprNom = P089H2_A407EmprNom[0] ;
         n407EmprNom = P089H2_n407EmprNom[0] ;
         A4930Inc_Num_ul = P089H2_A4930Inc_Num_ul[0] ;
         n4930Inc_Num_ul = P089H2_n4930Inc_Num_ul[0] ;
         A407EmprNom = P089H2_A407EmprNom[0] ;
         n407EmprNom = P089H2_n407EmprNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk89H2 = false ;
            A396EmprCod = P089H2_A396EmprCod[0] ;
            A4929Inc_Dia = P089H2_A4929Inc_Dia[0] ;
            AV34count = (long)(AV34count+1) ;
            brk89H2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4935Inc_Prog)==0) )
         {
            AV26Option = A4935Inc_Prog ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk89H2 )
         {
            brk89H2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADINC_TERMINALOPTIONS' Routine */
      returnInSub = false ;
      AV18TFInc_Terminal = AV22SearchTxt ;
      AV19TFInc_Terminal_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV56FilterFullText ,
                                           AV40DynamicFiltersSelector1 ,
                                           Short.valueOf(AV41DynamicFiltersOperator1) ,
                                           Long.valueOf(AV42Inc_Num_ult1) ,
                                           AV43EmprNom1 ,
                                           Boolean.valueOf(AV44DynamicFiltersEnabled2) ,
                                           AV45DynamicFiltersSelector2 ,
                                           Short.valueOf(AV46DynamicFiltersOperator2) ,
                                           Long.valueOf(AV47Inc_Num_ult2) ,
                                           AV48EmprNom2 ,
                                           Boolean.valueOf(AV49DynamicFiltersEnabled3) ,
                                           AV50DynamicFiltersSelector3 ,
                                           Short.valueOf(AV51DynamicFiltersOperator3) ,
                                           Long.valueOf(AV52Inc_Num_ult3) ,
                                           AV53EmprNom3 ,
                                           AV10TFInc_Dia ,
                                           Long.valueOf(AV12TFInc_Linea) ,
                                           Long.valueOf(AV13TFInc_Linea_To) ,
                                           AV14TFInc_Hora ,
                                           AV17TFInc_Prog_Sel ,
                                           AV16TFInc_Prog ,
                                           AV19TFInc_Terminal_Sel ,
                                           AV18TFInc_Terminal ,
                                           AV21TFInc_Usuario_Sel ,
                                           AV20TFInc_Usuario ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4935Inc_Prog ,
                                           A4934Inc_Termin ,
                                           A4933Inc_Usuari ,
                                           A4936Inc_Obs ,
                                           Long.valueOf(A4930Inc_Num_ul) ,
                                           A407EmprNom ,
                                           A4929Inc_Dia } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE
                                           }
      });
      lV43EmprNom1 = GXutil.padr( GXutil.rtrim( AV43EmprNom1), 30, "%") ;
      lV43EmprNom1 = GXutil.padr( GXutil.rtrim( AV43EmprNom1), 30, "%") ;
      lV48EmprNom2 = GXutil.padr( GXutil.rtrim( AV48EmprNom2), 30, "%") ;
      lV48EmprNom2 = GXutil.padr( GXutil.rtrim( AV48EmprNom2), 30, "%") ;
      lV53EmprNom3 = GXutil.padr( GXutil.rtrim( AV53EmprNom3), 30, "%") ;
      lV53EmprNom3 = GXutil.padr( GXutil.rtrim( AV53EmprNom3), 30, "%") ;
      /* Using cursor P089H3 */
      pr_default.execute(1, new Object[] {Long.valueOf(AV42Inc_Num_ult1), Long.valueOf(AV42Inc_Num_ult1), Long.valueOf(AV42Inc_Num_ult1), lV43EmprNom1, lV43EmprNom1, Long.valueOf(AV47Inc_Num_ult2), Long.valueOf(AV47Inc_Num_ult2), Long.valueOf(AV47Inc_Num_ult2), lV48EmprNom2, lV48EmprNom2, Long.valueOf(AV52Inc_Num_ult3), Long.valueOf(AV52Inc_Num_ult3), Long.valueOf(AV52Inc_Num_ult3), lV53EmprNom3, lV53EmprNom3, AV10TFInc_Dia});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk89H4 = false ;
         A396EmprCod = P089H3_A396EmprCod[0] ;
         A4929Inc_Dia = P089H3_A4929Inc_Dia[0] ;
         A407EmprNom = P089H3_A407EmprNom[0] ;
         n407EmprNom = P089H3_n407EmprNom[0] ;
         A4930Inc_Num_ul = P089H3_A4930Inc_Num_ul[0] ;
         n4930Inc_Num_ul = P089H3_n4930Inc_Num_ul[0] ;
         A407EmprNom = P089H3_A407EmprNom[0] ;
         n407EmprNom = P089H3_n407EmprNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk89H4 = false ;
            A396EmprCod = P089H3_A396EmprCod[0] ;
            A4929Inc_Dia = P089H3_A4929Inc_Dia[0] ;
            AV34count = (long)(AV34count+1) ;
            brk89H4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4934Inc_Termin)==0) )
         {
            AV26Option = A4934Inc_Termin ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk89H4 )
         {
            brk89H4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADINC_USUARIOOPTIONS' Routine */
      returnInSub = false ;
      AV20TFInc_Usuario = AV22SearchTxt ;
      AV21TFInc_Usuario_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV56FilterFullText ,
                                           AV40DynamicFiltersSelector1 ,
                                           Short.valueOf(AV41DynamicFiltersOperator1) ,
                                           Long.valueOf(AV42Inc_Num_ult1) ,
                                           AV43EmprNom1 ,
                                           Boolean.valueOf(AV44DynamicFiltersEnabled2) ,
                                           AV45DynamicFiltersSelector2 ,
                                           Short.valueOf(AV46DynamicFiltersOperator2) ,
                                           Long.valueOf(AV47Inc_Num_ult2) ,
                                           AV48EmprNom2 ,
                                           Boolean.valueOf(AV49DynamicFiltersEnabled3) ,
                                           AV50DynamicFiltersSelector3 ,
                                           Short.valueOf(AV51DynamicFiltersOperator3) ,
                                           Long.valueOf(AV52Inc_Num_ult3) ,
                                           AV53EmprNom3 ,
                                           AV10TFInc_Dia ,
                                           Long.valueOf(AV12TFInc_Linea) ,
                                           Long.valueOf(AV13TFInc_Linea_To) ,
                                           AV14TFInc_Hora ,
                                           AV17TFInc_Prog_Sel ,
                                           AV16TFInc_Prog ,
                                           AV19TFInc_Terminal_Sel ,
                                           AV18TFInc_Terminal ,
                                           AV21TFInc_Usuario_Sel ,
                                           AV20TFInc_Usuario ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4935Inc_Prog ,
                                           A4934Inc_Termin ,
                                           A4933Inc_Usuari ,
                                           A4936Inc_Obs ,
                                           Long.valueOf(A4930Inc_Num_ul) ,
                                           A407EmprNom ,
                                           A4929Inc_Dia } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE
                                           }
      });
      lV43EmprNom1 = GXutil.padr( GXutil.rtrim( AV43EmprNom1), 30, "%") ;
      lV43EmprNom1 = GXutil.padr( GXutil.rtrim( AV43EmprNom1), 30, "%") ;
      lV48EmprNom2 = GXutil.padr( GXutil.rtrim( AV48EmprNom2), 30, "%") ;
      lV48EmprNom2 = GXutil.padr( GXutil.rtrim( AV48EmprNom2), 30, "%") ;
      lV53EmprNom3 = GXutil.padr( GXutil.rtrim( AV53EmprNom3), 30, "%") ;
      lV53EmprNom3 = GXutil.padr( GXutil.rtrim( AV53EmprNom3), 30, "%") ;
      /* Using cursor P089H4 */
      pr_default.execute(2, new Object[] {Long.valueOf(AV42Inc_Num_ult1), Long.valueOf(AV42Inc_Num_ult1), Long.valueOf(AV42Inc_Num_ult1), lV43EmprNom1, lV43EmprNom1, Long.valueOf(AV47Inc_Num_ult2), Long.valueOf(AV47Inc_Num_ult2), Long.valueOf(AV47Inc_Num_ult2), lV48EmprNom2, lV48EmprNom2, Long.valueOf(AV52Inc_Num_ult3), Long.valueOf(AV52Inc_Num_ult3), Long.valueOf(AV52Inc_Num_ult3), lV53EmprNom3, lV53EmprNom3, AV10TFInc_Dia});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk89H6 = false ;
         A396EmprCod = P089H4_A396EmprCod[0] ;
         A4929Inc_Dia = P089H4_A4929Inc_Dia[0] ;
         A407EmprNom = P089H4_A407EmprNom[0] ;
         n407EmprNom = P089H4_n407EmprNom[0] ;
         A4930Inc_Num_ul = P089H4_A4930Inc_Num_ul[0] ;
         n4930Inc_Num_ul = P089H4_n4930Inc_Num_ul[0] ;
         A407EmprNom = P089H4_A407EmprNom[0] ;
         n407EmprNom = P089H4_n407EmprNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(2) != 101) )
         {
            brk89H6 = false ;
            A396EmprCod = P089H4_A396EmprCod[0] ;
            A4929Inc_Dia = P089H4_A4929Inc_Dia[0] ;
            AV34count = (long)(AV34count+1) ;
            brk89H6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4933Inc_Usuari)==0) )
         {
            AV26Option = A4933Inc_Usuari ;
            AV29OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4933Inc_Usuari, "@!"))) ;
            AV27Options.add(AV26Option, 0);
            AV30OptionsDesc.add(AV29OptionDesc, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk89H6 )
         {
            brk89H6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wpincidencias2getfilterdata.this.AV28OptionsJson;
      this.aP4[0] = wpincidencias2getfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = wpincidencias2getfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV56FilterFullText = "" ;
      AV10TFInc_Dia = GXutil.nullDate() ;
      AV14TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV16TFInc_Prog = "" ;
      AV17TFInc_Prog_Sel = "" ;
      AV18TFInc_Terminal = "" ;
      AV19TFInc_Terminal_Sel = "" ;
      AV20TFInc_Usuario = "" ;
      AV21TFInc_Usuario_Sel = "" ;
      AV39GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      AV40DynamicFiltersSelector1 = "" ;
      AV43EmprNom1 = "" ;
      AV45DynamicFiltersSelector2 = "" ;
      AV48EmprNom2 = "" ;
      AV50DynamicFiltersSelector3 = "" ;
      AV53EmprNom3 = "" ;
      A4935Inc_Prog = "" ;
      A4934Inc_Termin = "" ;
      A4933Inc_Usuari = "" ;
      A4936Inc_Obs = "" ;
      scmdbuf = "" ;
      lV43EmprNom1 = "" ;
      lV48EmprNom2 = "" ;
      lV53EmprNom3 = "" ;
      A407EmprNom = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      P089H2_A396EmprCod = new String[] {""} ;
      P089H2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P089H2_A407EmprNom = new String[] {""} ;
      P089H2_n407EmprNom = new boolean[] {false} ;
      P089H2_A4930Inc_Num_ul = new long[1] ;
      P089H2_n4930Inc_Num_ul = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV26Option = "" ;
      P089H3_A396EmprCod = new String[] {""} ;
      P089H3_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P089H3_A407EmprNom = new String[] {""} ;
      P089H3_n407EmprNom = new boolean[] {false} ;
      P089H3_A4930Inc_Num_ul = new long[1] ;
      P089H3_n4930Inc_Num_ul = new boolean[] {false} ;
      P089H4_A396EmprCod = new String[] {""} ;
      P089H4_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      P089H4_A407EmprNom = new String[] {""} ;
      P089H4_n407EmprNom = new boolean[] {false} ;
      P089H4_A4930Inc_Num_ul = new long[1] ;
      P089H4_n4930Inc_Num_ul = new boolean[] {false} ;
      AV29OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpincidencias2getfilterdata__default(),
         new Object[] {
             new Object[] {
            P089H2_A396EmprCod, P089H2_A4929Inc_Dia, P089H2_A407EmprNom, P089H2_n407EmprNom, P089H2_A4930Inc_Num_ul, P089H2_n4930Inc_Num_ul
            }
            , new Object[] {
            P089H3_A396EmprCod, P089H3_A4929Inc_Dia, P089H3_A407EmprNom, P089H3_n407EmprNom, P089H3_A4930Inc_Num_ul, P089H3_n4930Inc_Num_ul
            }
            , new Object[] {
            P089H4_A396EmprCod, P089H4_A4929Inc_Dia, P089H4_A407EmprNom, P089H4_n407EmprNom, P089H4_A4930Inc_Num_ul, P089H4_n4930Inc_Num_ul
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV41DynamicFiltersOperator1 ;
   private short AV46DynamicFiltersOperator2 ;
   private short AV51DynamicFiltersOperator3 ;
   private short Gx_err ;
   private int AV59GXV1 ;
   private long AV12TFInc_Linea ;
   private long AV13TFInc_Linea_To ;
   private long AV42Inc_Num_ult1 ;
   private long AV47Inc_Num_ult2 ;
   private long AV52Inc_Num_ult3 ;
   private long A4931Inc_Linea ;
   private long A4930Inc_Num_ul ;
   private long AV34count ;
   private String AV16TFInc_Prog ;
   private String AV17TFInc_Prog_Sel ;
   private String AV18TFInc_Terminal ;
   private String AV19TFInc_Terminal_Sel ;
   private String AV20TFInc_Usuario ;
   private String AV21TFInc_Usuario_Sel ;
   private String AV43EmprNom1 ;
   private String AV48EmprNom2 ;
   private String AV53EmprNom3 ;
   private String A4935Inc_Prog ;
   private String A4934Inc_Termin ;
   private String A4933Inc_Usuari ;
   private String scmdbuf ;
   private String lV43EmprNom1 ;
   private String lV48EmprNom2 ;
   private String lV53EmprNom3 ;
   private String A407EmprNom ;
   private String A396EmprCod ;
   private java.util.Date AV14TFInc_Hora ;
   private java.util.Date AV10TFInc_Dia ;
   private java.util.Date A4929Inc_Dia ;
   private boolean returnInSub ;
   private boolean AV44DynamicFiltersEnabled2 ;
   private boolean AV49DynamicFiltersEnabled3 ;
   private boolean brk89H2 ;
   private boolean n407EmprNom ;
   private boolean n4930Inc_Num_ul ;
   private boolean brk89H4 ;
   private boolean brk89H6 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV56FilterFullText ;
   private String AV40DynamicFiltersSelector1 ;
   private String AV45DynamicFiltersSelector2 ;
   private String AV50DynamicFiltersSelector3 ;
   private String A4936Inc_Obs ;
   private String AV26Option ;
   private String AV29OptionDesc ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P089H2_A396EmprCod ;
   private java.util.Date[] P089H2_A4929Inc_Dia ;
   private String[] P089H2_A407EmprNom ;
   private boolean[] P089H2_n407EmprNom ;
   private long[] P089H2_A4930Inc_Num_ul ;
   private boolean[] P089H2_n4930Inc_Num_ul ;
   private String[] P089H3_A396EmprCod ;
   private java.util.Date[] P089H3_A4929Inc_Dia ;
   private String[] P089H3_A407EmprNom ;
   private boolean[] P089H3_n407EmprNom ;
   private long[] P089H3_A4930Inc_Num_ul ;
   private boolean[] P089H3_n4930Inc_Num_ul ;
   private String[] P089H4_A396EmprCod ;
   private java.util.Date[] P089H4_A4929Inc_Dia ;
   private String[] P089H4_A407EmprNom ;
   private boolean[] P089H4_n407EmprNom ;
   private long[] P089H4_A4930Inc_Num_ul ;
   private boolean[] P089H4_n4930Inc_Num_ul ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV39GridStateDynamicFilter ;
}

final  class wpincidencias2getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P089H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56FilterFullText ,
                                          String AV40DynamicFiltersSelector1 ,
                                          short AV41DynamicFiltersOperator1 ,
                                          long AV42Inc_Num_ult1 ,
                                          String AV43EmprNom1 ,
                                          boolean AV44DynamicFiltersEnabled2 ,
                                          String AV45DynamicFiltersSelector2 ,
                                          short AV46DynamicFiltersOperator2 ,
                                          long AV47Inc_Num_ult2 ,
                                          String AV48EmprNom2 ,
                                          boolean AV49DynamicFiltersEnabled3 ,
                                          String AV50DynamicFiltersSelector3 ,
                                          short AV51DynamicFiltersOperator3 ,
                                          long AV52Inc_Num_ult3 ,
                                          String AV53EmprNom3 ,
                                          java.util.Date AV10TFInc_Dia ,
                                          long AV12TFInc_Linea ,
                                          long AV13TFInc_Linea_To ,
                                          java.util.Date AV14TFInc_Hora ,
                                          String AV17TFInc_Prog_Sel ,
                                          String AV16TFInc_Prog ,
                                          String AV19TFInc_Terminal_Sel ,
                                          String AV18TFInc_Terminal ,
                                          String AV21TFInc_Usuario_Sel ,
                                          String AV20TFInc_Usuario ,
                                          long A4931Inc_Linea ,
                                          String A4935Inc_Prog ,
                                          String A4934Inc_Termin ,
                                          String A4933Inc_Usuari ,
                                          String A4936Inc_Obs ,
                                          long A4930Inc_Num_ul ,
                                          String A407EmprNom ,
                                          java.util.Date A4929Inc_Dia )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Inc_Dia, T2.EmprNom, T1.Inc_Num_ul FROM (TXPCRTINC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV41DynamicFiltersOperator1 == 0 ) && ( ! (0==AV42Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV41DynamicFiltersOperator1 == 1 ) && ( ! (0==AV42Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV41DynamicFiltersOperator1 == 2 ) && ( ! (0==AV42Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV41DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV43EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV41DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV43EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV46DynamicFiltersOperator2 == 0 ) && ( ! (0==AV47Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV46DynamicFiltersOperator2 == 1 ) && ( ! (0==AV47Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV46DynamicFiltersOperator2 == 2 ) && ( ! (0==AV47Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV46DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV48EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV46DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV48EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV51DynamicFiltersOperator3 == 0 ) && ( ! (0==AV52Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV51DynamicFiltersOperator3 == 1 ) && ( ! (0==AV52Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV51DynamicFiltersOperator3 == 2 ) && ( ! (0==AV52Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV51DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV53EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV51DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV53EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFInc_Dia)) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P089H3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56FilterFullText ,
                                          String AV40DynamicFiltersSelector1 ,
                                          short AV41DynamicFiltersOperator1 ,
                                          long AV42Inc_Num_ult1 ,
                                          String AV43EmprNom1 ,
                                          boolean AV44DynamicFiltersEnabled2 ,
                                          String AV45DynamicFiltersSelector2 ,
                                          short AV46DynamicFiltersOperator2 ,
                                          long AV47Inc_Num_ult2 ,
                                          String AV48EmprNom2 ,
                                          boolean AV49DynamicFiltersEnabled3 ,
                                          String AV50DynamicFiltersSelector3 ,
                                          short AV51DynamicFiltersOperator3 ,
                                          long AV52Inc_Num_ult3 ,
                                          String AV53EmprNom3 ,
                                          java.util.Date AV10TFInc_Dia ,
                                          long AV12TFInc_Linea ,
                                          long AV13TFInc_Linea_To ,
                                          java.util.Date AV14TFInc_Hora ,
                                          String AV17TFInc_Prog_Sel ,
                                          String AV16TFInc_Prog ,
                                          String AV19TFInc_Terminal_Sel ,
                                          String AV18TFInc_Terminal ,
                                          String AV21TFInc_Usuario_Sel ,
                                          String AV20TFInc_Usuario ,
                                          long A4931Inc_Linea ,
                                          String A4935Inc_Prog ,
                                          String A4934Inc_Termin ,
                                          String A4933Inc_Usuari ,
                                          String A4936Inc_Obs ,
                                          long A4930Inc_Num_ul ,
                                          String A407EmprNom ,
                                          java.util.Date A4929Inc_Dia )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[16];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Inc_Dia, T2.EmprNom, T1.Inc_Num_ul FROM (TXPCRTINC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV41DynamicFiltersOperator1 == 0 ) && ( ! (0==AV42Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV41DynamicFiltersOperator1 == 1 ) && ( ! (0==AV42Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV41DynamicFiltersOperator1 == 2 ) && ( ! (0==AV42Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV41DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV43EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV41DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV43EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV46DynamicFiltersOperator2 == 0 ) && ( ! (0==AV47Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV46DynamicFiltersOperator2 == 1 ) && ( ! (0==AV47Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV46DynamicFiltersOperator2 == 2 ) && ( ! (0==AV47Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV46DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV48EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV46DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV48EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV51DynamicFiltersOperator3 == 0 ) && ( ! (0==AV52Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV51DynamicFiltersOperator3 == 1 ) && ( ! (0==AV52Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV51DynamicFiltersOperator3 == 2 ) && ( ! (0==AV52Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV51DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV53EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV51DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV53EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFInc_Dia)) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P089H4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV56FilterFullText ,
                                          String AV40DynamicFiltersSelector1 ,
                                          short AV41DynamicFiltersOperator1 ,
                                          long AV42Inc_Num_ult1 ,
                                          String AV43EmprNom1 ,
                                          boolean AV44DynamicFiltersEnabled2 ,
                                          String AV45DynamicFiltersSelector2 ,
                                          short AV46DynamicFiltersOperator2 ,
                                          long AV47Inc_Num_ult2 ,
                                          String AV48EmprNom2 ,
                                          boolean AV49DynamicFiltersEnabled3 ,
                                          String AV50DynamicFiltersSelector3 ,
                                          short AV51DynamicFiltersOperator3 ,
                                          long AV52Inc_Num_ult3 ,
                                          String AV53EmprNom3 ,
                                          java.util.Date AV10TFInc_Dia ,
                                          long AV12TFInc_Linea ,
                                          long AV13TFInc_Linea_To ,
                                          java.util.Date AV14TFInc_Hora ,
                                          String AV17TFInc_Prog_Sel ,
                                          String AV16TFInc_Prog ,
                                          String AV19TFInc_Terminal_Sel ,
                                          String AV18TFInc_Terminal ,
                                          String AV21TFInc_Usuario_Sel ,
                                          String AV20TFInc_Usuario ,
                                          long A4931Inc_Linea ,
                                          String A4935Inc_Prog ,
                                          String A4934Inc_Termin ,
                                          String A4933Inc_Usuari ,
                                          String A4936Inc_Obs ,
                                          long A4930Inc_Num_ul ,
                                          String A407EmprNom ,
                                          java.util.Date A4929Inc_Dia )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[16];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Inc_Dia, T2.EmprNom, T1.Inc_Num_ul FROM (TXPCRTINC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV41DynamicFiltersOperator1 == 0 ) && ( ! (0==AV42Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV41DynamicFiltersOperator1 == 1 ) && ( ! (0==AV42Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV41DynamicFiltersOperator1 == 2 ) && ( ! (0==AV42Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV41DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV43EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV40DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV41DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV43EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV46DynamicFiltersOperator2 == 0 ) && ( ! (0==AV47Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV46DynamicFiltersOperator2 == 1 ) && ( ! (0==AV47Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV46DynamicFiltersOperator2 == 2 ) && ( ! (0==AV47Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV46DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV48EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( AV44DynamicFiltersEnabled2 && ( GXutil.strcmp(AV45DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV46DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV48EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV51DynamicFiltersOperator3 == 0 ) && ( ! (0==AV52Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV51DynamicFiltersOperator3 == 1 ) && ( ! (0==AV52Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV51DynamicFiltersOperator3 == 2 ) && ( ! (0==AV52Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV51DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV53EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( AV49DynamicFiltersEnabled3 && ( GXutil.strcmp(AV50DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV51DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV53EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV10TFInc_Dia)) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
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
                  return conditional_P089H2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).longValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).longValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).longValue() , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] );
            case 1 :
                  return conditional_P089H3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).longValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).longValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).longValue() , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] );
            case 2 :
                  return conditional_P089H4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).longValue() , (String)dynConstraints[9] , ((Boolean) dynConstraints[10]).booleanValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).longValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).longValue() , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).longValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).longValue() , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P089H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P089H3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P089H4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
                  stmt.setLong(sIdx, ((Number) parms[16]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[17]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[26]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[27]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[16]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[17]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[26]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[27]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[16]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[17]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[26]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[27]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
      }
   }

}

