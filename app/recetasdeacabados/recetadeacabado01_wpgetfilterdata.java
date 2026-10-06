package app.recetasdeacabados ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadeacabado01_wpgetfilterdata extends GXProcedure
{
   public recetadeacabado01_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadeacabado01_wpgetfilterdata.class ), "" );
   }

   public recetadeacabado01_wpgetfilterdata( int remoteHandle ,
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
      recetadeacabado01_wpgetfilterdata.this.aP5 = new String[] {""};
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
      recetadeacabado01_wpgetfilterdata.this.AV94DDOName = aP0;
      recetadeacabado01_wpgetfilterdata.this.AV95SearchTxt = aP1;
      recetadeacabado01_wpgetfilterdata.this.AV96SearchTxtTo = aP2;
      recetadeacabado01_wpgetfilterdata.this.aP3 = aP3;
      recetadeacabado01_wpgetfilterdata.this.aP4 = aP4;
      recetadeacabado01_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV84Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV86OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV87OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV94DDOName), "DDO_FASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFASCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV94DDOName), "DDO_FASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFASDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV94DDOName), "DDO_PROFORCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORCODOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV94DDOName), "DDO_PROFORDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV97OptionsJson = AV84Options.toJSonString(false) ;
      AV98OptionsDescJson = AV86OptionsDesc.toJSonString(false) ;
      AV99OptionIndexesJson = AV87OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV89Session.getValue("RecetasDeAcabados.RecetadeAcabado01_WPGridState"), "") == 0 )
      {
         AV91GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetasDeAcabados.RecetadeAcabado01_WPGridState"), null, null);
      }
      else
      {
         AV91GridState.fromxml(AV89Session.getValue("RecetasDeAcabados.RecetadeAcabado01_WPGridState"), null, null);
      }
      AV111GXV1 = 1 ;
      while ( AV111GXV1 <= AV91GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV92GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV91GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV111GXV1));
         if ( GXutil.strcmp(AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV22TFFasCod = AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV23TFFasCod_Sel = AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV101TFFasDsc = AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV102TFFasDsc_Sel = AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASQUILIN") == 0 )
         {
            AV103TFFasQuiLin = (short)(GXutil.lval( AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV104TFFasQuiLin_To = (short)(GXutil.lval( AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV105TFProForCod = AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV106TFProForCod_Sel = AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV107TFProForDsc = AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV108TFProForDsc_Sel = AV92GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV111GXV1 = (int)(AV111GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV22TFFasCod = AV95SearchTxt ;
      AV23TFFasCod_Sel = "" ;
      AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = AV22TFFasCod ;
      AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = AV23TFFasCod_Sel ;
      AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = AV101TFFasDsc ;
      AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = AV102TFFasDsc_Sel ;
      AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin = AV103TFFasQuiLin ;
      AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to = AV104TFFasQuiLin_To ;
      AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = AV105TFProForCod ;
      AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = AV106TFProForCod_Sel ;
      AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = AV107TFProForDsc ;
      AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = AV108TFProForDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ,
                                           AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ,
                                           AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ,
                                           AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ,
                                           Short.valueOf(AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin) ,
                                           Short.valueOf(AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to) ,
                                           AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ,
                                           AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ,
                                           AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ,
                                           AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           Short.valueOf(A5371FasQuiLin) ,
                                           A764ProForCod ,
                                           A766ProForDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = GXutil.padr( GXutil.rtrim( AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod), 8, "%") ;
      lV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = GXutil.padr( GXutil.rtrim( AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc), 28, "%") ;
      lV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = GXutil.padr( GXutil.rtrim( AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod), 6, "%") ;
      lV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = GXutil.padr( GXutil.rtrim( AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc), 30, "%") ;
      /* Using cursor P0A6A2 */
      pr_default.execute(0, new Object[] {lV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod, AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel, lV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc, AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel, Short.valueOf(AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin), Short.valueOf(AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to), lV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod, AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel, lV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc, AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA6A2 = false ;
         A396EmprCod = P0A6A2_A396EmprCod[0] ;
         A129BarCod = P0A6A2_A129BarCod[0] ;
         A132BarCodReo = P0A6A2_A132BarCodReo[0] ;
         A130BarCodPar = P0A6A2_A130BarCodPar[0] ;
         A758ProCod = P0A6A2_A758ProCod[0] ;
         A194BarOrdLin = P0A6A2_A194BarOrdLin[0] ;
         A457FasCod = P0A6A2_A457FasCod[0] ;
         A766ProForDsc = P0A6A2_A766ProForDsc[0] ;
         A764ProForCod = P0A6A2_A764ProForCod[0] ;
         A5371FasQuiLin = P0A6A2_A5371FasQuiLin[0] ;
         A460FasDsc = P0A6A2_A460FasDsc[0] ;
         A457FasCod = P0A6A2_A457FasCod[0] ;
         A460FasDsc = P0A6A2_A460FasDsc[0] ;
         A766ProForDsc = P0A6A2_A766ProForDsc[0] ;
         AV88count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A6A2_A457FasCod[0], A457FasCod) == 0 ) )
         {
            brkA6A2 = false ;
            A396EmprCod = P0A6A2_A396EmprCod[0] ;
            A129BarCod = P0A6A2_A129BarCod[0] ;
            A132BarCodReo = P0A6A2_A132BarCodReo[0] ;
            A130BarCodPar = P0A6A2_A130BarCodPar[0] ;
            A758ProCod = P0A6A2_A758ProCod[0] ;
            A194BarOrdLin = P0A6A2_A194BarOrdLin[0] ;
            A5371FasQuiLin = P0A6A2_A5371FasQuiLin[0] ;
            AV88count = (long)(AV88count+1) ;
            brkA6A2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A457FasCod)==0) )
         {
            AV83Option = A457FasCod ;
            AV85OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A457FasCod, "@!"))) ;
            AV84Options.add(AV83Option, 0);
            AV86OptionsDesc.add(AV85OptionDesc, 0);
            AV87OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV88count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV84Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA6A2 )
         {
            brkA6A2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV101TFFasDsc = AV95SearchTxt ;
      AV102TFFasDsc_Sel = "" ;
      AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = AV22TFFasCod ;
      AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = AV23TFFasCod_Sel ;
      AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = AV101TFFasDsc ;
      AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = AV102TFFasDsc_Sel ;
      AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin = AV103TFFasQuiLin ;
      AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to = AV104TFFasQuiLin_To ;
      AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = AV105TFProForCod ;
      AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = AV106TFProForCod_Sel ;
      AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = AV107TFProForDsc ;
      AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = AV108TFProForDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ,
                                           AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ,
                                           AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ,
                                           AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ,
                                           Short.valueOf(AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin) ,
                                           Short.valueOf(AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to) ,
                                           AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ,
                                           AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ,
                                           AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ,
                                           AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           Short.valueOf(A5371FasQuiLin) ,
                                           A764ProForCod ,
                                           A766ProForDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = GXutil.padr( GXutil.rtrim( AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod), 8, "%") ;
      lV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = GXutil.padr( GXutil.rtrim( AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc), 28, "%") ;
      lV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = GXutil.padr( GXutil.rtrim( AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod), 6, "%") ;
      lV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = GXutil.padr( GXutil.rtrim( AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc), 30, "%") ;
      /* Using cursor P0A6A3 */
      pr_default.execute(1, new Object[] {lV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod, AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel, lV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc, AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel, Short.valueOf(AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin), Short.valueOf(AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to), lV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod, AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel, lV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc, AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA6A4 = false ;
         A396EmprCod = P0A6A3_A396EmprCod[0] ;
         A129BarCod = P0A6A3_A129BarCod[0] ;
         A132BarCodReo = P0A6A3_A132BarCodReo[0] ;
         A130BarCodPar = P0A6A3_A130BarCodPar[0] ;
         A758ProCod = P0A6A3_A758ProCod[0] ;
         A194BarOrdLin = P0A6A3_A194BarOrdLin[0] ;
         A460FasDsc = P0A6A3_A460FasDsc[0] ;
         A766ProForDsc = P0A6A3_A766ProForDsc[0] ;
         A764ProForCod = P0A6A3_A764ProForCod[0] ;
         A5371FasQuiLin = P0A6A3_A5371FasQuiLin[0] ;
         A457FasCod = P0A6A3_A457FasCod[0] ;
         A457FasCod = P0A6A3_A457FasCod[0] ;
         A460FasDsc = P0A6A3_A460FasDsc[0] ;
         A766ProForDsc = P0A6A3_A766ProForDsc[0] ;
         AV88count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A6A3_A460FasDsc[0], A460FasDsc) == 0 ) )
         {
            brkA6A4 = false ;
            A396EmprCod = P0A6A3_A396EmprCod[0] ;
            A129BarCod = P0A6A3_A129BarCod[0] ;
            A132BarCodReo = P0A6A3_A132BarCodReo[0] ;
            A130BarCodPar = P0A6A3_A130BarCodPar[0] ;
            A758ProCod = P0A6A3_A758ProCod[0] ;
            A194BarOrdLin = P0A6A3_A194BarOrdLin[0] ;
            A5371FasQuiLin = P0A6A3_A5371FasQuiLin[0] ;
            A457FasCod = P0A6A3_A457FasCod[0] ;
            A457FasCod = P0A6A3_A457FasCod[0] ;
            AV88count = (long)(AV88count+1) ;
            brkA6A4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A460FasDsc)==0) )
         {
            AV83Option = A460FasDsc ;
            AV84Options.add(AV83Option, 0);
            AV87OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV88count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV84Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA6A4 )
         {
            brkA6A4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPROFORCODOPTIONS' Routine */
      returnInSub = false ;
      AV105TFProForCod = AV95SearchTxt ;
      AV106TFProForCod_Sel = "" ;
      AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = AV22TFFasCod ;
      AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = AV23TFFasCod_Sel ;
      AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = AV101TFFasDsc ;
      AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = AV102TFFasDsc_Sel ;
      AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin = AV103TFFasQuiLin ;
      AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to = AV104TFFasQuiLin_To ;
      AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = AV105TFProForCod ;
      AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = AV106TFProForCod_Sel ;
      AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = AV107TFProForDsc ;
      AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = AV108TFProForDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ,
                                           AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ,
                                           AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ,
                                           AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ,
                                           Short.valueOf(AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin) ,
                                           Short.valueOf(AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to) ,
                                           AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ,
                                           AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ,
                                           AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ,
                                           AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           Short.valueOf(A5371FasQuiLin) ,
                                           A764ProForCod ,
                                           A766ProForDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = GXutil.padr( GXutil.rtrim( AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod), 8, "%") ;
      lV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = GXutil.padr( GXutil.rtrim( AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc), 28, "%") ;
      lV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = GXutil.padr( GXutil.rtrim( AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod), 6, "%") ;
      lV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = GXutil.padr( GXutil.rtrim( AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc), 30, "%") ;
      /* Using cursor P0A6A4 */
      pr_default.execute(2, new Object[] {lV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod, AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel, lV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc, AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel, Short.valueOf(AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin), Short.valueOf(AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to), lV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod, AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel, lV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc, AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA6A6 = false ;
         A396EmprCod = P0A6A4_A396EmprCod[0] ;
         A129BarCod = P0A6A4_A129BarCod[0] ;
         A132BarCodReo = P0A6A4_A132BarCodReo[0] ;
         A130BarCodPar = P0A6A4_A130BarCodPar[0] ;
         A758ProCod = P0A6A4_A758ProCod[0] ;
         A194BarOrdLin = P0A6A4_A194BarOrdLin[0] ;
         A764ProForCod = P0A6A4_A764ProForCod[0] ;
         A766ProForDsc = P0A6A4_A766ProForDsc[0] ;
         A5371FasQuiLin = P0A6A4_A5371FasQuiLin[0] ;
         A460FasDsc = P0A6A4_A460FasDsc[0] ;
         A457FasCod = P0A6A4_A457FasCod[0] ;
         A457FasCod = P0A6A4_A457FasCod[0] ;
         A460FasDsc = P0A6A4_A460FasDsc[0] ;
         A766ProForDsc = P0A6A4_A766ProForDsc[0] ;
         AV88count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A6A4_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brkA6A6 = false ;
            A396EmprCod = P0A6A4_A396EmprCod[0] ;
            A129BarCod = P0A6A4_A129BarCod[0] ;
            A132BarCodReo = P0A6A4_A132BarCodReo[0] ;
            A130BarCodPar = P0A6A4_A130BarCodPar[0] ;
            A758ProCod = P0A6A4_A758ProCod[0] ;
            A194BarOrdLin = P0A6A4_A194BarOrdLin[0] ;
            A5371FasQuiLin = P0A6A4_A5371FasQuiLin[0] ;
            AV88count = (long)(AV88count+1) ;
            brkA6A6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A764ProForCod)==0) )
         {
            AV83Option = A764ProForCod ;
            AV84Options.add(AV83Option, 0);
            AV87OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV88count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV84Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA6A6 )
         {
            brkA6A6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV107TFProForDsc = AV95SearchTxt ;
      AV108TFProForDsc_Sel = "" ;
      AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = AV22TFFasCod ;
      AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = AV23TFFasCod_Sel ;
      AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = AV101TFFasDsc ;
      AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = AV102TFFasDsc_Sel ;
      AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin = AV103TFFasQuiLin ;
      AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to = AV104TFFasQuiLin_To ;
      AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = AV105TFProForCod ;
      AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = AV106TFProForCod_Sel ;
      AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = AV107TFProForDsc ;
      AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = AV108TFProForDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ,
                                           AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ,
                                           AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ,
                                           AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ,
                                           Short.valueOf(AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin) ,
                                           Short.valueOf(AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to) ,
                                           AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ,
                                           AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ,
                                           AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ,
                                           AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           Short.valueOf(A5371FasQuiLin) ,
                                           A764ProForCod ,
                                           A766ProForDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = GXutil.padr( GXutil.rtrim( AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod), 8, "%") ;
      lV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = GXutil.padr( GXutil.rtrim( AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc), 28, "%") ;
      lV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = GXutil.padr( GXutil.rtrim( AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod), 6, "%") ;
      lV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = GXutil.padr( GXutil.rtrim( AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc), 30, "%") ;
      /* Using cursor P0A6A5 */
      pr_default.execute(3, new Object[] {lV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod, AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel, lV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc, AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel, Short.valueOf(AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin), Short.valueOf(AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to), lV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod, AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel, lV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc, AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA6A8 = false ;
         A129BarCod = P0A6A5_A129BarCod[0] ;
         A132BarCodReo = P0A6A5_A132BarCodReo[0] ;
         A130BarCodPar = P0A6A5_A130BarCodPar[0] ;
         A758ProCod = P0A6A5_A758ProCod[0] ;
         A194BarOrdLin = P0A6A5_A194BarOrdLin[0] ;
         A764ProForCod = P0A6A5_A764ProForCod[0] ;
         A396EmprCod = P0A6A5_A396EmprCod[0] ;
         A766ProForDsc = P0A6A5_A766ProForDsc[0] ;
         A5371FasQuiLin = P0A6A5_A5371FasQuiLin[0] ;
         A460FasDsc = P0A6A5_A460FasDsc[0] ;
         A457FasCod = P0A6A5_A457FasCod[0] ;
         A457FasCod = P0A6A5_A457FasCod[0] ;
         A460FasDsc = P0A6A5_A460FasDsc[0] ;
         A766ProForDsc = P0A6A5_A766ProForDsc[0] ;
         AV88count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0A6A5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0A6A5_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brkA6A8 = false ;
            A129BarCod = P0A6A5_A129BarCod[0] ;
            A132BarCodReo = P0A6A5_A132BarCodReo[0] ;
            A130BarCodPar = P0A6A5_A130BarCodPar[0] ;
            A758ProCod = P0A6A5_A758ProCod[0] ;
            A194BarOrdLin = P0A6A5_A194BarOrdLin[0] ;
            A5371FasQuiLin = P0A6A5_A5371FasQuiLin[0] ;
            AV88count = (long)(AV88count+1) ;
            brkA6A8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV83Option = A766ProForDsc ;
            AV82InsertIndex = 1 ;
            while ( ( AV82InsertIndex <= AV84Options.size() ) && ( GXutil.strcmp((String)AV84Options.elementAt(-1+AV82InsertIndex), AV83Option) < 0 ) )
            {
               AV82InsertIndex = (int)(AV82InsertIndex+1) ;
            }
            AV84Options.add(AV83Option, AV82InsertIndex);
            AV87OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV88count), "Z,ZZZ,ZZZ,ZZ9")), AV82InsertIndex);
         }
         if ( AV84Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA6A8 )
         {
            brkA6A8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetadeacabado01_wpgetfilterdata.this.AV97OptionsJson;
      this.aP4[0] = recetadeacabado01_wpgetfilterdata.this.AV98OptionsDescJson;
      this.aP5[0] = recetadeacabado01_wpgetfilterdata.this.AV99OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV97OptionsJson = "" ;
      AV98OptionsDescJson = "" ;
      AV99OptionIndexesJson = "" ;
      AV84Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV86OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV87OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV89Session = httpContext.getWebSession();
      AV91GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV92GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV22TFFasCod = "" ;
      AV23TFFasCod_Sel = "" ;
      AV101TFFasDsc = "" ;
      AV102TFFasDsc_Sel = "" ;
      AV105TFProForCod = "" ;
      AV106TFProForCod_Sel = "" ;
      AV107TFProForDsc = "" ;
      AV108TFProForDsc_Sel = "" ;
      A457FasCod = "" ;
      AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = "" ;
      AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel = "" ;
      AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = "" ;
      AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel = "" ;
      AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = "" ;
      AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel = "" ;
      AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = "" ;
      AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel = "" ;
      scmdbuf = "" ;
      lV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod = "" ;
      lV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc = "" ;
      lV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod = "" ;
      lV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc = "" ;
      A460FasDsc = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      P0A6A2_A396EmprCod = new String[] {""} ;
      P0A6A2_A129BarCod = new int[1] ;
      P0A6A2_A132BarCodReo = new byte[1] ;
      P0A6A2_A130BarCodPar = new String[] {""} ;
      P0A6A2_A758ProCod = new String[] {""} ;
      P0A6A2_A194BarOrdLin = new short[1] ;
      P0A6A2_A457FasCod = new String[] {""} ;
      P0A6A2_A766ProForDsc = new String[] {""} ;
      P0A6A2_A764ProForCod = new String[] {""} ;
      P0A6A2_A5371FasQuiLin = new short[1] ;
      P0A6A2_A460FasDsc = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      AV83Option = "" ;
      AV85OptionDesc = "" ;
      P0A6A3_A396EmprCod = new String[] {""} ;
      P0A6A3_A129BarCod = new int[1] ;
      P0A6A3_A132BarCodReo = new byte[1] ;
      P0A6A3_A130BarCodPar = new String[] {""} ;
      P0A6A3_A758ProCod = new String[] {""} ;
      P0A6A3_A194BarOrdLin = new short[1] ;
      P0A6A3_A460FasDsc = new String[] {""} ;
      P0A6A3_A766ProForDsc = new String[] {""} ;
      P0A6A3_A764ProForCod = new String[] {""} ;
      P0A6A3_A5371FasQuiLin = new short[1] ;
      P0A6A3_A457FasCod = new String[] {""} ;
      P0A6A4_A396EmprCod = new String[] {""} ;
      P0A6A4_A129BarCod = new int[1] ;
      P0A6A4_A132BarCodReo = new byte[1] ;
      P0A6A4_A130BarCodPar = new String[] {""} ;
      P0A6A4_A758ProCod = new String[] {""} ;
      P0A6A4_A194BarOrdLin = new short[1] ;
      P0A6A4_A764ProForCod = new String[] {""} ;
      P0A6A4_A766ProForDsc = new String[] {""} ;
      P0A6A4_A5371FasQuiLin = new short[1] ;
      P0A6A4_A460FasDsc = new String[] {""} ;
      P0A6A4_A457FasCod = new String[] {""} ;
      P0A6A5_A129BarCod = new int[1] ;
      P0A6A5_A132BarCodReo = new byte[1] ;
      P0A6A5_A130BarCodPar = new String[] {""} ;
      P0A6A5_A758ProCod = new String[] {""} ;
      P0A6A5_A194BarOrdLin = new short[1] ;
      P0A6A5_A764ProForCod = new String[] {""} ;
      P0A6A5_A396EmprCod = new String[] {""} ;
      P0A6A5_A766ProForDsc = new String[] {""} ;
      P0A6A5_A5371FasQuiLin = new short[1] ;
      P0A6A5_A460FasDsc = new String[] {""} ;
      P0A6A5_A457FasCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.recetadeacabado01_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A6A2_A396EmprCod, P0A6A2_A129BarCod, P0A6A2_A132BarCodReo, P0A6A2_A130BarCodPar, P0A6A2_A758ProCod, P0A6A2_A194BarOrdLin, P0A6A2_A457FasCod, P0A6A2_A766ProForDsc, P0A6A2_A764ProForCod, P0A6A2_A5371FasQuiLin,
            P0A6A2_A460FasDsc
            }
            , new Object[] {
            P0A6A3_A396EmprCod, P0A6A3_A129BarCod, P0A6A3_A132BarCodReo, P0A6A3_A130BarCodPar, P0A6A3_A758ProCod, P0A6A3_A194BarOrdLin, P0A6A3_A460FasDsc, P0A6A3_A766ProForDsc, P0A6A3_A764ProForCod, P0A6A3_A5371FasQuiLin,
            P0A6A3_A457FasCod
            }
            , new Object[] {
            P0A6A4_A396EmprCod, P0A6A4_A129BarCod, P0A6A4_A132BarCodReo, P0A6A4_A130BarCodPar, P0A6A4_A758ProCod, P0A6A4_A194BarOrdLin, P0A6A4_A764ProForCod, P0A6A4_A766ProForDsc, P0A6A4_A5371FasQuiLin, P0A6A4_A460FasDsc,
            P0A6A4_A457FasCod
            }
            , new Object[] {
            P0A6A5_A129BarCod, P0A6A5_A132BarCodReo, P0A6A5_A130BarCodPar, P0A6A5_A758ProCod, P0A6A5_A194BarOrdLin, P0A6A5_A764ProForCod, P0A6A5_A396EmprCod, P0A6A5_A766ProForDsc, P0A6A5_A5371FasQuiLin, P0A6A5_A460FasDsc,
            P0A6A5_A457FasCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV103TFFasQuiLin ;
   private short AV104TFFasQuiLin_To ;
   private short AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin ;
   private short AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to ;
   private short A5371FasQuiLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV111GXV1 ;
   private int A129BarCod ;
   private int AV82InsertIndex ;
   private long AV88count ;
   private String AV22TFFasCod ;
   private String AV23TFFasCod_Sel ;
   private String AV101TFFasDsc ;
   private String AV102TFFasDsc_Sel ;
   private String AV105TFProForCod ;
   private String AV106TFProForCod_Sel ;
   private String AV107TFProForDsc ;
   private String AV108TFProForDsc_Sel ;
   private String A457FasCod ;
   private String AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ;
   private String AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ;
   private String AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ;
   private String AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ;
   private String AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ;
   private String AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ;
   private String AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ;
   private String AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ;
   private String scmdbuf ;
   private String lV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ;
   private String lV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ;
   private String lV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ;
   private String lV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ;
   private String A460FasDsc ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private boolean returnInSub ;
   private boolean brkA6A2 ;
   private boolean brkA6A4 ;
   private boolean brkA6A6 ;
   private boolean brkA6A8 ;
   private String AV97OptionsJson ;
   private String AV98OptionsDescJson ;
   private String AV99OptionIndexesJson ;
   private String AV94DDOName ;
   private String AV95SearchTxt ;
   private String AV96SearchTxtTo ;
   private String AV83Option ;
   private String AV85OptionDesc ;
   private com.genexus.webpanels.WebSession AV89Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A6A2_A396EmprCod ;
   private int[] P0A6A2_A129BarCod ;
   private byte[] P0A6A2_A132BarCodReo ;
   private String[] P0A6A2_A130BarCodPar ;
   private String[] P0A6A2_A758ProCod ;
   private short[] P0A6A2_A194BarOrdLin ;
   private String[] P0A6A2_A457FasCod ;
   private String[] P0A6A2_A766ProForDsc ;
   private String[] P0A6A2_A764ProForCod ;
   private short[] P0A6A2_A5371FasQuiLin ;
   private String[] P0A6A2_A460FasDsc ;
   private String[] P0A6A3_A396EmprCod ;
   private int[] P0A6A3_A129BarCod ;
   private byte[] P0A6A3_A132BarCodReo ;
   private String[] P0A6A3_A130BarCodPar ;
   private String[] P0A6A3_A758ProCod ;
   private short[] P0A6A3_A194BarOrdLin ;
   private String[] P0A6A3_A460FasDsc ;
   private String[] P0A6A3_A766ProForDsc ;
   private String[] P0A6A3_A764ProForCod ;
   private short[] P0A6A3_A5371FasQuiLin ;
   private String[] P0A6A3_A457FasCod ;
   private String[] P0A6A4_A396EmprCod ;
   private int[] P0A6A4_A129BarCod ;
   private byte[] P0A6A4_A132BarCodReo ;
   private String[] P0A6A4_A130BarCodPar ;
   private String[] P0A6A4_A758ProCod ;
   private short[] P0A6A4_A194BarOrdLin ;
   private String[] P0A6A4_A764ProForCod ;
   private String[] P0A6A4_A766ProForDsc ;
   private short[] P0A6A4_A5371FasQuiLin ;
   private String[] P0A6A4_A460FasDsc ;
   private String[] P0A6A4_A457FasCod ;
   private int[] P0A6A5_A129BarCod ;
   private byte[] P0A6A5_A132BarCodReo ;
   private String[] P0A6A5_A130BarCodPar ;
   private String[] P0A6A5_A758ProCod ;
   private short[] P0A6A5_A194BarOrdLin ;
   private String[] P0A6A5_A764ProForCod ;
   private String[] P0A6A5_A396EmprCod ;
   private String[] P0A6A5_A766ProForDsc ;
   private short[] P0A6A5_A5371FasQuiLin ;
   private String[] P0A6A5_A460FasDsc ;
   private String[] P0A6A5_A457FasCod ;
   private GXSimpleCollection<String> AV84Options ;
   private GXSimpleCollection<String> AV86OptionsDesc ;
   private GXSimpleCollection<String> AV87OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV91GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV92GridStateFilterValue ;
}

final  class recetadeacabado01_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A6A2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ,
                                          String AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ,
                                          String AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ,
                                          String AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ,
                                          short AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin ,
                                          short AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to ,
                                          String AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ,
                                          String AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ,
                                          String AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ,
                                          String AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          short A5371FasQuiLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T2.FasCod, T4.ProForDsc, T1.ProForCod, T1.FasQuiLin, T3.FasDsc FROM (((TXPFASQUI" ;
      scmdbuf += " T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod =" ;
      scmdbuf += " T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T2.FasCod) INNER JOIN TXPCPROFO T4 ON T4.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T4.ProForCod = T1.ProForCod)" ;
      if ( (GXutil.strcmp("", AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin) )
      {
         addWhere(sWhereString, "(T1.FasQuiLin >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to) )
      {
         addWhere(sWhereString, "(T1.FasQuiLin <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.FasCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A6A3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ,
                                          String AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ,
                                          String AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ,
                                          String AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ,
                                          short AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin ,
                                          short AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to ,
                                          String AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ,
                                          String AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ,
                                          String AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ,
                                          String AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          short A5371FasQuiLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[10];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T3.FasDsc, T4.ProForDsc, T1.ProForCod, T1.FasQuiLin, T2.FasCod FROM (((TXPFASQUI" ;
      scmdbuf += " T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod =" ;
      scmdbuf += " T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T2.FasCod) INNER JOIN TXPCPROFO T4 ON T4.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T4.ProForCod = T1.ProForCod)" ;
      if ( (GXutil.strcmp("", AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCod = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin) )
      {
         addWhere(sWhereString, "(T1.FasQuiLin >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to) )
      {
         addWhere(sWhereString, "(T1.FasQuiLin <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T3.FasDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0A6A4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ,
                                          String AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ,
                                          String AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ,
                                          String AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ,
                                          short AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin ,
                                          short AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to ,
                                          String AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ,
                                          String AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ,
                                          String AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ,
                                          String AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          short A5371FasQuiLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[10];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.ProForCod, T4.ProForDsc, T1.FasQuiLin, T3.FasDsc, T2.FasCod FROM (((TXPFASQUI" ;
      scmdbuf += " T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod =" ;
      scmdbuf += " T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T2.FasCod) INNER JOIN TXPCPROFO T4 ON T4.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T4.ProForCod = T1.ProForCod)" ;
      if ( (GXutil.strcmp("", AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCod = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin) )
      {
         addWhere(sWhereString, "(T1.FasQuiLin >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to) )
      {
         addWhere(sWhereString, "(T1.FasQuiLin <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ProForCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0A6A5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel ,
                                          String AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod ,
                                          String AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel ,
                                          String AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc ,
                                          short AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin ,
                                          short AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to ,
                                          String AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel ,
                                          String AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod ,
                                          String AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel ,
                                          String AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          short A5371FasQuiLin ,
                                          String A764ProForCod ,
                                          String A766ProForDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[10];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.ProForCod, T1.EmprCod, T4.ProForDsc, T1.FasQuiLin, T3.FasDsc, T2.FasCod FROM (((TXPFASQUI" ;
      scmdbuf += " T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod =" ;
      scmdbuf += " T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T2.FasCod) INNER JOIN TXPCPROFO T4 ON T4.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T4.ProForCod = T1.ProForCod)" ;
      if ( (GXutil.strcmp("", AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV113Recetasdeacabados_recetadeacabado01_wpds_1_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Recetasdeacabados_recetadeacabado01_wpds_2_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Recetasdeacabados_recetadeacabado01_wpds_3_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Recetasdeacabados_recetadeacabado01_wpds_4_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.FasDsc = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV117Recetasdeacabados_recetadeacabado01_wpds_5_tffasquilin) )
      {
         addWhere(sWhereString, "(T1.FasQuiLin >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV118Recetasdeacabados_recetadeacabado01_wpds_6_tffasquilin_to) )
      {
         addWhere(sWhereString, "(T1.FasQuiLin <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV119Recetasdeacabados_recetadeacabado01_wpds_7_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Recetasdeacabados_recetadeacabado01_wpds_8_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Recetasdeacabados_recetadeacabado01_wpds_9_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Recetasdeacabados_recetadeacabado01_wpds_10_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForDsc = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProForCod" ;
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
                  return conditional_P0A6A2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] );
            case 1 :
                  return conditional_P0A6A3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] );
            case 2 :
                  return conditional_P0A6A4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] );
            case 3 :
                  return conditional_P0A6A5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A6A2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6A3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6A4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6A5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 28);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 28);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 28);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 28);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
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
                  stmt.setString(sIdx, (String)parms[10], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 28);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 28);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 28);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 28);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 28);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 28);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 28);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 28);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               return;
      }
   }

}

