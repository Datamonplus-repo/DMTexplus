package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetasdeacabado03_wpgetfilterdata extends GXProcedure
{
   public recetasdeacabado03_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdeacabado03_wpgetfilterdata.class ), "" );
   }

   public recetasdeacabado03_wpgetfilterdata( int remoteHandle ,
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
      recetasdeacabado03_wpgetfilterdata.this.aP5 = new String[] {""};
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
      recetasdeacabado03_wpgetfilterdata.this.AV42DDOName = aP0;
      recetasdeacabado03_wpgetfilterdata.this.AV40SearchTxt = aP1;
      recetasdeacabado03_wpgetfilterdata.this.AV41SearchTxtTo = aP2;
      recetasdeacabado03_wpgetfilterdata.this.aP3 = aP3;
      recetasdeacabado03_wpgetfilterdata.this.aP4 = aP4;
      recetasdeacabado03_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV45Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV48OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV50OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_RECUSRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADRECUSRCODOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_RECUSRMOD") == 0 )
      {
         /* Execute user subroutine: 'LOADRECUSRMODOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV46OptionsJson = AV45Options.toJSonString(false) ;
      AV49OptionsDescJson = AV48OptionsDesc.toJSonString(false) ;
      AV51OptionIndexesJson = AV50OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV53Session.getValue("RecetasdeAcabado03_WPGridState"), "") == 0 )
      {
         AV55GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetasdeAcabado03_WPGridState"), null, null);
      }
      else
      {
         AV55GridState.fromxml(AV53Session.getValue("RecetasdeAcabado03_WPGridState"), null, null);
      }
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV56GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV58FilterFullText = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV12TFBarSer = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV13TFBarSer_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV14TFBarSerDsc = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV15TFBarSerDsc_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV26TFRecLinMaq = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFRecLinMaq_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV28TFMaqCod = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV29TFMaqCod_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGS") == 0 )
         {
            AV59TFRecTotKgs = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFRecTotKgs_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFA") == 0 )
         {
            AV61TFRecFA = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFRecFA_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV30TFRecVolPrd = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFRecVolPrd_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV32TFRecFecAlt = localUtil.ctot( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRCOD") == 0 )
         {
            AV34TFRecUsrCod = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRCOD_SEL") == 0 )
         {
            AV35TFRecUsrCod_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECMOD") == 0 )
         {
            AV36TFRecFecMod = localUtil.ctot( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRMOD") == 0 )
         {
            AV38TFRecUsrMod = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRMOD_SEL") == 0 )
         {
            AV39TFRecUsrMod_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV40SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV67Recetasdeacabado03_wpds_1_filterfulltext = AV58FilterFullText ;
      AV68Recetasdeacabado03_wpds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV70Recetasdeacabado03_wpds_4_tfbarser = AV12TFBarSer ;
      AV71Recetasdeacabado03_wpds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV72Recetasdeacabado03_wpds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV74Recetasdeacabado03_wpds_8_tfreclinmaq = AV26TFRecLinMaq ;
      AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV27TFRecLinMaq_To ;
      AV76Recetasdeacabado03_wpds_10_tfmaqcod = AV28TFMaqCod ;
      AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV29TFMaqCod_Sel ;
      AV78Recetasdeacabado03_wpds_12_tfrectotkgs = AV59TFRecTotKgs ;
      AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV60TFRecTotKgs_To ;
      AV80Recetasdeacabado03_wpds_14_tfrecfa = AV61TFRecFA ;
      AV81Recetasdeacabado03_wpds_15_tfrecfa_to = AV62TFRecFA_To ;
      AV82Recetasdeacabado03_wpds_16_tfrecvolprd = AV30TFRecVolPrd ;
      AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV31TFRecVolPrd_To ;
      AV84Recetasdeacabado03_wpds_18_tfrecfecalt = AV32TFRecFecAlt ;
      AV85Recetasdeacabado03_wpds_19_tfrecusrcod = AV34TFRecUsrCod ;
      AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV35TFRecUsrCod_Sel ;
      AV87Recetasdeacabado03_wpds_21_tfrecfecmod = AV36TFRecFecMod ;
      AV88Recetasdeacabado03_wpds_22_tfrecusrmod = AV38TFRecUsrMod ;
      AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV39TFRecUsrMod_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV67Recetasdeacabado03_wpds_1_filterfulltext ,
                                           AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                           AV68Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                           AV71Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                           AV70Recetasdeacabado03_wpds_4_tfbarser ,
                                           AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                           AV72Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                           Short.valueOf(AV74Recetasdeacabado03_wpds_8_tfreclinmaq) ,
                                           Short.valueOf(AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to) ,
                                           AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                           AV76Recetasdeacabado03_wpds_10_tfmaqcod ,
                                           AV78Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                           AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                           AV80Recetasdeacabado03_wpds_14_tfrecfa ,
                                           AV81Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                           Integer.valueOf(AV82Recetasdeacabado03_wpds_16_tfrecvolprd) ,
                                           Integer.valueOf(AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to) ,
                                           AV84Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                           AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                           AV85Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                           AV87Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                           AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                           AV88Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A4259RecTotKgs ,
                                           A2806RecFA ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           A4866RecFecAlt ,
                                           A4867RecFecMod ,
                                           A6039RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV68Recetasdeacabado03_wpds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV68Recetasdeacabado03_wpds_2_tfbarnhdr), 11, "%") ;
      lV70Recetasdeacabado03_wpds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV70Recetasdeacabado03_wpds_4_tfbarser), 16, "%") ;
      lV72Recetasdeacabado03_wpds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV72Recetasdeacabado03_wpds_6_tfbarserdsc), 26, "%") ;
      lV76Recetasdeacabado03_wpds_10_tfmaqcod = GXutil.padr( GXutil.rtrim( AV76Recetasdeacabado03_wpds_10_tfmaqcod), 6, "%") ;
      lV85Recetasdeacabado03_wpds_19_tfrecusrcod = GXutil.padr( GXutil.rtrim( AV85Recetasdeacabado03_wpds_19_tfrecusrcod), 8, "%") ;
      lV88Recetasdeacabado03_wpds_22_tfrecusrmod = GXutil.padr( GXutil.rtrim( AV88Recetasdeacabado03_wpds_22_tfrecusrmod), 8, "%") ;
      /* Using cursor P09BH2 */
      pr_default.execute(0, new Object[] {lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV68Recetasdeacabado03_wpds_2_tfbarnhdr, AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel, lV70Recetasdeacabado03_wpds_4_tfbarser, AV71Recetasdeacabado03_wpds_5_tfbarser_sel, lV72Recetasdeacabado03_wpds_6_tfbarserdsc, AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel, Short.valueOf(AV74Recetasdeacabado03_wpds_8_tfreclinmaq), Short.valueOf(AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to), lV76Recetasdeacabado03_wpds_10_tfmaqcod, AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel, AV78Recetasdeacabado03_wpds_12_tfrectotkgs, AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to, AV80Recetasdeacabado03_wpds_14_tfrecfa, AV81Recetasdeacabado03_wpds_15_tfrecfa_to, Integer.valueOf(AV82Recetasdeacabado03_wpds_16_tfrecvolprd), Integer.valueOf(AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to), AV84Recetasdeacabado03_wpds_18_tfrecfecalt, lV85Recetasdeacabado03_wpds_19_tfrecusrcod, AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel, AV87Recetasdeacabado03_wpds_21_tfrecfecmod, lV88Recetasdeacabado03_wpds_22_tfrecusrmod, AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09BH2_A396EmprCod[0] ;
         A6039RecAcab = P09BH2_A6039RecAcab[0] ;
         n6039RecAcab = P09BH2_n6039RecAcab[0] ;
         A4868RecUsrMod = P09BH2_A4868RecUsrMod[0] ;
         n4868RecUsrMod = P09BH2_n4868RecUsrMod[0] ;
         A4867RecFecMod = P09BH2_A4867RecFecMod[0] ;
         n4867RecFecMod = P09BH2_n4867RecFecMod[0] ;
         A4402RecUsrCod = P09BH2_A4402RecUsrCod[0] ;
         A4866RecFecAlt = P09BH2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BH2_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BH2_A2805RecVolPrd[0] ;
         A2806RecFA = P09BH2_A2806RecFA[0] ;
         A4259RecTotKgs = P09BH2_A4259RecTotKgs[0] ;
         A602MaqCod = P09BH2_A602MaqCod[0] ;
         A2804RecLinMaq = P09BH2_A2804RecLinMaq[0] ;
         A1652BarSerDsc = P09BH2_A1652BarSerDsc[0] ;
         A212BarSer = P09BH2_A212BarSer[0] ;
         A130BarCodPar = P09BH2_A130BarCodPar[0] ;
         A132BarCodReo = P09BH2_A132BarCodReo[0] ;
         A129BarCod = P09BH2_A129BarCod[0] ;
         A1652BarSerDsc = P09BH2_A1652BarSerDsc[0] ;
         A212BarSer = P09BH2_A212BarSer[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV44Option = A13696BarNHdr ;
            AV43InsertIndex = 1 ;
            while ( ( AV43InsertIndex <= AV45Options.size() ) && ( GXutil.strcmp((String)AV45Options.elementAt(-1+AV43InsertIndex), AV44Option) < 0 ) )
            {
               AV43InsertIndex = (int)(AV43InsertIndex+1) ;
            }
            if ( ( AV43InsertIndex <= AV45Options.size() ) && ( GXutil.strcmp((String)AV45Options.elementAt(-1+AV43InsertIndex), AV44Option) == 0 ) )
            {
               AV52count = GXutil.lval( (String)AV50OptionIndexes.elementAt(-1+AV43InsertIndex)) ;
               AV52count = (long)(AV52count+1) ;
               AV50OptionIndexes.removeItem(AV43InsertIndex);
               AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), AV43InsertIndex);
            }
            else
            {
               AV45Options.add(AV44Option, AV43InsertIndex);
               AV50OptionIndexes.add("1", AV43InsertIndex);
            }
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV12TFBarSer = AV40SearchTxt ;
      AV13TFBarSer_Sel = "" ;
      AV67Recetasdeacabado03_wpds_1_filterfulltext = AV58FilterFullText ;
      AV68Recetasdeacabado03_wpds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV70Recetasdeacabado03_wpds_4_tfbarser = AV12TFBarSer ;
      AV71Recetasdeacabado03_wpds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV72Recetasdeacabado03_wpds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV74Recetasdeacabado03_wpds_8_tfreclinmaq = AV26TFRecLinMaq ;
      AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV27TFRecLinMaq_To ;
      AV76Recetasdeacabado03_wpds_10_tfmaqcod = AV28TFMaqCod ;
      AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV29TFMaqCod_Sel ;
      AV78Recetasdeacabado03_wpds_12_tfrectotkgs = AV59TFRecTotKgs ;
      AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV60TFRecTotKgs_To ;
      AV80Recetasdeacabado03_wpds_14_tfrecfa = AV61TFRecFA ;
      AV81Recetasdeacabado03_wpds_15_tfrecfa_to = AV62TFRecFA_To ;
      AV82Recetasdeacabado03_wpds_16_tfrecvolprd = AV30TFRecVolPrd ;
      AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV31TFRecVolPrd_To ;
      AV84Recetasdeacabado03_wpds_18_tfrecfecalt = AV32TFRecFecAlt ;
      AV85Recetasdeacabado03_wpds_19_tfrecusrcod = AV34TFRecUsrCod ;
      AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV35TFRecUsrCod_Sel ;
      AV87Recetasdeacabado03_wpds_21_tfrecfecmod = AV36TFRecFecMod ;
      AV88Recetasdeacabado03_wpds_22_tfrecusrmod = AV38TFRecUsrMod ;
      AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV39TFRecUsrMod_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV67Recetasdeacabado03_wpds_1_filterfulltext ,
                                           AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                           AV68Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                           AV71Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                           AV70Recetasdeacabado03_wpds_4_tfbarser ,
                                           AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                           AV72Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                           Short.valueOf(AV74Recetasdeacabado03_wpds_8_tfreclinmaq) ,
                                           Short.valueOf(AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to) ,
                                           AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                           AV76Recetasdeacabado03_wpds_10_tfmaqcod ,
                                           AV78Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                           AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                           AV80Recetasdeacabado03_wpds_14_tfrecfa ,
                                           AV81Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                           Integer.valueOf(AV82Recetasdeacabado03_wpds_16_tfrecvolprd) ,
                                           Integer.valueOf(AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to) ,
                                           AV84Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                           AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                           AV85Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                           AV87Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                           AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                           AV88Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A4259RecTotKgs ,
                                           A2806RecFA ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           A4866RecFecAlt ,
                                           A4867RecFecMod ,
                                           A6039RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV68Recetasdeacabado03_wpds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV68Recetasdeacabado03_wpds_2_tfbarnhdr), 11, "%") ;
      lV70Recetasdeacabado03_wpds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV70Recetasdeacabado03_wpds_4_tfbarser), 16, "%") ;
      lV72Recetasdeacabado03_wpds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV72Recetasdeacabado03_wpds_6_tfbarserdsc), 26, "%") ;
      lV76Recetasdeacabado03_wpds_10_tfmaqcod = GXutil.padr( GXutil.rtrim( AV76Recetasdeacabado03_wpds_10_tfmaqcod), 6, "%") ;
      lV85Recetasdeacabado03_wpds_19_tfrecusrcod = GXutil.padr( GXutil.rtrim( AV85Recetasdeacabado03_wpds_19_tfrecusrcod), 8, "%") ;
      lV88Recetasdeacabado03_wpds_22_tfrecusrmod = GXutil.padr( GXutil.rtrim( AV88Recetasdeacabado03_wpds_22_tfrecusrmod), 8, "%") ;
      /* Using cursor P09BH3 */
      pr_default.execute(1, new Object[] {lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV68Recetasdeacabado03_wpds_2_tfbarnhdr, AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel, lV70Recetasdeacabado03_wpds_4_tfbarser, AV71Recetasdeacabado03_wpds_5_tfbarser_sel, lV72Recetasdeacabado03_wpds_6_tfbarserdsc, AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel, Short.valueOf(AV74Recetasdeacabado03_wpds_8_tfreclinmaq), Short.valueOf(AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to), lV76Recetasdeacabado03_wpds_10_tfmaqcod, AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel, AV78Recetasdeacabado03_wpds_12_tfrectotkgs, AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to, AV80Recetasdeacabado03_wpds_14_tfrecfa, AV81Recetasdeacabado03_wpds_15_tfrecfa_to, Integer.valueOf(AV82Recetasdeacabado03_wpds_16_tfrecvolprd), Integer.valueOf(AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to), AV84Recetasdeacabado03_wpds_18_tfrecfecalt, lV85Recetasdeacabado03_wpds_19_tfrecusrcod, AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel, AV87Recetasdeacabado03_wpds_21_tfrecfecmod, lV88Recetasdeacabado03_wpds_22_tfrecusrmod, AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9BH3 = false ;
         A396EmprCod = P09BH3_A396EmprCod[0] ;
         A6039RecAcab = P09BH3_A6039RecAcab[0] ;
         n6039RecAcab = P09BH3_n6039RecAcab[0] ;
         A212BarSer = P09BH3_A212BarSer[0] ;
         A4868RecUsrMod = P09BH3_A4868RecUsrMod[0] ;
         n4868RecUsrMod = P09BH3_n4868RecUsrMod[0] ;
         A4867RecFecMod = P09BH3_A4867RecFecMod[0] ;
         n4867RecFecMod = P09BH3_n4867RecFecMod[0] ;
         A4402RecUsrCod = P09BH3_A4402RecUsrCod[0] ;
         A4866RecFecAlt = P09BH3_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BH3_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BH3_A2805RecVolPrd[0] ;
         A2806RecFA = P09BH3_A2806RecFA[0] ;
         A4259RecTotKgs = P09BH3_A4259RecTotKgs[0] ;
         A602MaqCod = P09BH3_A602MaqCod[0] ;
         A2804RecLinMaq = P09BH3_A2804RecLinMaq[0] ;
         A1652BarSerDsc = P09BH3_A1652BarSerDsc[0] ;
         A130BarCodPar = P09BH3_A130BarCodPar[0] ;
         A132BarCodReo = P09BH3_A132BarCodReo[0] ;
         A129BarCod = P09BH3_A129BarCod[0] ;
         A212BarSer = P09BH3_A212BarSer[0] ;
         A1652BarSerDsc = P09BH3_A1652BarSerDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09BH3_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk9BH3 = false ;
            A396EmprCod = P09BH3_A396EmprCod[0] ;
            A2804RecLinMaq = P09BH3_A2804RecLinMaq[0] ;
            A130BarCodPar = P09BH3_A130BarCodPar[0] ;
            A132BarCodReo = P09BH3_A132BarCodReo[0] ;
            A129BarCod = P09BH3_A129BarCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9BH3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV44Option = A212BarSer ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BH3 )
         {
            brk9BH3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFBarSerDsc = AV40SearchTxt ;
      AV15TFBarSerDsc_Sel = "" ;
      AV67Recetasdeacabado03_wpds_1_filterfulltext = AV58FilterFullText ;
      AV68Recetasdeacabado03_wpds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV70Recetasdeacabado03_wpds_4_tfbarser = AV12TFBarSer ;
      AV71Recetasdeacabado03_wpds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV72Recetasdeacabado03_wpds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV74Recetasdeacabado03_wpds_8_tfreclinmaq = AV26TFRecLinMaq ;
      AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV27TFRecLinMaq_To ;
      AV76Recetasdeacabado03_wpds_10_tfmaqcod = AV28TFMaqCod ;
      AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV29TFMaqCod_Sel ;
      AV78Recetasdeacabado03_wpds_12_tfrectotkgs = AV59TFRecTotKgs ;
      AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV60TFRecTotKgs_To ;
      AV80Recetasdeacabado03_wpds_14_tfrecfa = AV61TFRecFA ;
      AV81Recetasdeacabado03_wpds_15_tfrecfa_to = AV62TFRecFA_To ;
      AV82Recetasdeacabado03_wpds_16_tfrecvolprd = AV30TFRecVolPrd ;
      AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV31TFRecVolPrd_To ;
      AV84Recetasdeacabado03_wpds_18_tfrecfecalt = AV32TFRecFecAlt ;
      AV85Recetasdeacabado03_wpds_19_tfrecusrcod = AV34TFRecUsrCod ;
      AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV35TFRecUsrCod_Sel ;
      AV87Recetasdeacabado03_wpds_21_tfrecfecmod = AV36TFRecFecMod ;
      AV88Recetasdeacabado03_wpds_22_tfrecusrmod = AV38TFRecUsrMod ;
      AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV39TFRecUsrMod_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV67Recetasdeacabado03_wpds_1_filterfulltext ,
                                           AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                           AV68Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                           AV71Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                           AV70Recetasdeacabado03_wpds_4_tfbarser ,
                                           AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                           AV72Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                           Short.valueOf(AV74Recetasdeacabado03_wpds_8_tfreclinmaq) ,
                                           Short.valueOf(AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to) ,
                                           AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                           AV76Recetasdeacabado03_wpds_10_tfmaqcod ,
                                           AV78Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                           AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                           AV80Recetasdeacabado03_wpds_14_tfrecfa ,
                                           AV81Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                           Integer.valueOf(AV82Recetasdeacabado03_wpds_16_tfrecvolprd) ,
                                           Integer.valueOf(AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to) ,
                                           AV84Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                           AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                           AV85Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                           AV87Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                           AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                           AV88Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A4259RecTotKgs ,
                                           A2806RecFA ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           A4866RecFecAlt ,
                                           A4867RecFecMod ,
                                           A6039RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV68Recetasdeacabado03_wpds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV68Recetasdeacabado03_wpds_2_tfbarnhdr), 11, "%") ;
      lV70Recetasdeacabado03_wpds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV70Recetasdeacabado03_wpds_4_tfbarser), 16, "%") ;
      lV72Recetasdeacabado03_wpds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV72Recetasdeacabado03_wpds_6_tfbarserdsc), 26, "%") ;
      lV76Recetasdeacabado03_wpds_10_tfmaqcod = GXutil.padr( GXutil.rtrim( AV76Recetasdeacabado03_wpds_10_tfmaqcod), 6, "%") ;
      lV85Recetasdeacabado03_wpds_19_tfrecusrcod = GXutil.padr( GXutil.rtrim( AV85Recetasdeacabado03_wpds_19_tfrecusrcod), 8, "%") ;
      lV88Recetasdeacabado03_wpds_22_tfrecusrmod = GXutil.padr( GXutil.rtrim( AV88Recetasdeacabado03_wpds_22_tfrecusrmod), 8, "%") ;
      /* Using cursor P09BH4 */
      pr_default.execute(2, new Object[] {lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV68Recetasdeacabado03_wpds_2_tfbarnhdr, AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel, lV70Recetasdeacabado03_wpds_4_tfbarser, AV71Recetasdeacabado03_wpds_5_tfbarser_sel, lV72Recetasdeacabado03_wpds_6_tfbarserdsc, AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel, Short.valueOf(AV74Recetasdeacabado03_wpds_8_tfreclinmaq), Short.valueOf(AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to), lV76Recetasdeacabado03_wpds_10_tfmaqcod, AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel, AV78Recetasdeacabado03_wpds_12_tfrectotkgs, AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to, AV80Recetasdeacabado03_wpds_14_tfrecfa, AV81Recetasdeacabado03_wpds_15_tfrecfa_to, Integer.valueOf(AV82Recetasdeacabado03_wpds_16_tfrecvolprd), Integer.valueOf(AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to), AV84Recetasdeacabado03_wpds_18_tfrecfecalt, lV85Recetasdeacabado03_wpds_19_tfrecusrcod, AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel, AV87Recetasdeacabado03_wpds_21_tfrecfecmod, lV88Recetasdeacabado03_wpds_22_tfrecusrmod, AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9BH5 = false ;
         A396EmprCod = P09BH4_A396EmprCod[0] ;
         A6039RecAcab = P09BH4_A6039RecAcab[0] ;
         n6039RecAcab = P09BH4_n6039RecAcab[0] ;
         A1652BarSerDsc = P09BH4_A1652BarSerDsc[0] ;
         A4868RecUsrMod = P09BH4_A4868RecUsrMod[0] ;
         n4868RecUsrMod = P09BH4_n4868RecUsrMod[0] ;
         A4867RecFecMod = P09BH4_A4867RecFecMod[0] ;
         n4867RecFecMod = P09BH4_n4867RecFecMod[0] ;
         A4402RecUsrCod = P09BH4_A4402RecUsrCod[0] ;
         A4866RecFecAlt = P09BH4_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BH4_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BH4_A2805RecVolPrd[0] ;
         A2806RecFA = P09BH4_A2806RecFA[0] ;
         A4259RecTotKgs = P09BH4_A4259RecTotKgs[0] ;
         A602MaqCod = P09BH4_A602MaqCod[0] ;
         A2804RecLinMaq = P09BH4_A2804RecLinMaq[0] ;
         A212BarSer = P09BH4_A212BarSer[0] ;
         A130BarCodPar = P09BH4_A130BarCodPar[0] ;
         A132BarCodReo = P09BH4_A132BarCodReo[0] ;
         A129BarCod = P09BH4_A129BarCod[0] ;
         A1652BarSerDsc = P09BH4_A1652BarSerDsc[0] ;
         A212BarSer = P09BH4_A212BarSer[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09BH4_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk9BH5 = false ;
            A396EmprCod = P09BH4_A396EmprCod[0] ;
            A2804RecLinMaq = P09BH4_A2804RecLinMaq[0] ;
            A130BarCodPar = P09BH4_A130BarCodPar[0] ;
            A132BarCodReo = P09BH4_A132BarCodReo[0] ;
            A129BarCod = P09BH4_A129BarCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9BH5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV44Option = A1652BarSerDsc ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BH5 )
         {
            brk9BH5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV28TFMaqCod = AV40SearchTxt ;
      AV29TFMaqCod_Sel = "" ;
      AV67Recetasdeacabado03_wpds_1_filterfulltext = AV58FilterFullText ;
      AV68Recetasdeacabado03_wpds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV70Recetasdeacabado03_wpds_4_tfbarser = AV12TFBarSer ;
      AV71Recetasdeacabado03_wpds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV72Recetasdeacabado03_wpds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV74Recetasdeacabado03_wpds_8_tfreclinmaq = AV26TFRecLinMaq ;
      AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV27TFRecLinMaq_To ;
      AV76Recetasdeacabado03_wpds_10_tfmaqcod = AV28TFMaqCod ;
      AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV29TFMaqCod_Sel ;
      AV78Recetasdeacabado03_wpds_12_tfrectotkgs = AV59TFRecTotKgs ;
      AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV60TFRecTotKgs_To ;
      AV80Recetasdeacabado03_wpds_14_tfrecfa = AV61TFRecFA ;
      AV81Recetasdeacabado03_wpds_15_tfrecfa_to = AV62TFRecFA_To ;
      AV82Recetasdeacabado03_wpds_16_tfrecvolprd = AV30TFRecVolPrd ;
      AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV31TFRecVolPrd_To ;
      AV84Recetasdeacabado03_wpds_18_tfrecfecalt = AV32TFRecFecAlt ;
      AV85Recetasdeacabado03_wpds_19_tfrecusrcod = AV34TFRecUsrCod ;
      AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV35TFRecUsrCod_Sel ;
      AV87Recetasdeacabado03_wpds_21_tfrecfecmod = AV36TFRecFecMod ;
      AV88Recetasdeacabado03_wpds_22_tfrecusrmod = AV38TFRecUsrMod ;
      AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV39TFRecUsrMod_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV67Recetasdeacabado03_wpds_1_filterfulltext ,
                                           AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                           AV68Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                           AV71Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                           AV70Recetasdeacabado03_wpds_4_tfbarser ,
                                           AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                           AV72Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                           Short.valueOf(AV74Recetasdeacabado03_wpds_8_tfreclinmaq) ,
                                           Short.valueOf(AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to) ,
                                           AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                           AV76Recetasdeacabado03_wpds_10_tfmaqcod ,
                                           AV78Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                           AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                           AV80Recetasdeacabado03_wpds_14_tfrecfa ,
                                           AV81Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                           Integer.valueOf(AV82Recetasdeacabado03_wpds_16_tfrecvolprd) ,
                                           Integer.valueOf(AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to) ,
                                           AV84Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                           AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                           AV85Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                           AV87Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                           AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                           AV88Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A4259RecTotKgs ,
                                           A2806RecFA ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           A4866RecFecAlt ,
                                           A4867RecFecMod ,
                                           A6039RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV68Recetasdeacabado03_wpds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV68Recetasdeacabado03_wpds_2_tfbarnhdr), 11, "%") ;
      lV70Recetasdeacabado03_wpds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV70Recetasdeacabado03_wpds_4_tfbarser), 16, "%") ;
      lV72Recetasdeacabado03_wpds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV72Recetasdeacabado03_wpds_6_tfbarserdsc), 26, "%") ;
      lV76Recetasdeacabado03_wpds_10_tfmaqcod = GXutil.padr( GXutil.rtrim( AV76Recetasdeacabado03_wpds_10_tfmaqcod), 6, "%") ;
      lV85Recetasdeacabado03_wpds_19_tfrecusrcod = GXutil.padr( GXutil.rtrim( AV85Recetasdeacabado03_wpds_19_tfrecusrcod), 8, "%") ;
      lV88Recetasdeacabado03_wpds_22_tfrecusrmod = GXutil.padr( GXutil.rtrim( AV88Recetasdeacabado03_wpds_22_tfrecusrmod), 8, "%") ;
      /* Using cursor P09BH5 */
      pr_default.execute(3, new Object[] {lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV68Recetasdeacabado03_wpds_2_tfbarnhdr, AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel, lV70Recetasdeacabado03_wpds_4_tfbarser, AV71Recetasdeacabado03_wpds_5_tfbarser_sel, lV72Recetasdeacabado03_wpds_6_tfbarserdsc, AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel, Short.valueOf(AV74Recetasdeacabado03_wpds_8_tfreclinmaq), Short.valueOf(AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to), lV76Recetasdeacabado03_wpds_10_tfmaqcod, AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel, AV78Recetasdeacabado03_wpds_12_tfrectotkgs, AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to, AV80Recetasdeacabado03_wpds_14_tfrecfa, AV81Recetasdeacabado03_wpds_15_tfrecfa_to, Integer.valueOf(AV82Recetasdeacabado03_wpds_16_tfrecvolprd), Integer.valueOf(AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to), AV84Recetasdeacabado03_wpds_18_tfrecfecalt, lV85Recetasdeacabado03_wpds_19_tfrecusrcod, AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel, AV87Recetasdeacabado03_wpds_21_tfrecfecmod, lV88Recetasdeacabado03_wpds_22_tfrecusrmod, AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9BH7 = false ;
         A396EmprCod = P09BH5_A396EmprCod[0] ;
         A6039RecAcab = P09BH5_A6039RecAcab[0] ;
         n6039RecAcab = P09BH5_n6039RecAcab[0] ;
         A602MaqCod = P09BH5_A602MaqCod[0] ;
         A4868RecUsrMod = P09BH5_A4868RecUsrMod[0] ;
         n4868RecUsrMod = P09BH5_n4868RecUsrMod[0] ;
         A4867RecFecMod = P09BH5_A4867RecFecMod[0] ;
         n4867RecFecMod = P09BH5_n4867RecFecMod[0] ;
         A4402RecUsrCod = P09BH5_A4402RecUsrCod[0] ;
         A4866RecFecAlt = P09BH5_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BH5_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BH5_A2805RecVolPrd[0] ;
         A2806RecFA = P09BH5_A2806RecFA[0] ;
         A4259RecTotKgs = P09BH5_A4259RecTotKgs[0] ;
         A2804RecLinMaq = P09BH5_A2804RecLinMaq[0] ;
         A1652BarSerDsc = P09BH5_A1652BarSerDsc[0] ;
         A212BarSer = P09BH5_A212BarSer[0] ;
         A130BarCodPar = P09BH5_A130BarCodPar[0] ;
         A132BarCodReo = P09BH5_A132BarCodReo[0] ;
         A129BarCod = P09BH5_A129BarCod[0] ;
         A1652BarSerDsc = P09BH5_A1652BarSerDsc[0] ;
         A212BarSer = P09BH5_A212BarSer[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09BH5_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk9BH7 = false ;
            A396EmprCod = P09BH5_A396EmprCod[0] ;
            A2804RecLinMaq = P09BH5_A2804RecLinMaq[0] ;
            A130BarCodPar = P09BH5_A130BarCodPar[0] ;
            A132BarCodReo = P09BH5_A132BarCodReo[0] ;
            A129BarCod = P09BH5_A129BarCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9BH7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV44Option = A602MaqCod ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BH7 )
         {
            brk9BH7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADRECUSRCODOPTIONS' Routine */
      returnInSub = false ;
      AV34TFRecUsrCod = AV40SearchTxt ;
      AV35TFRecUsrCod_Sel = "" ;
      AV67Recetasdeacabado03_wpds_1_filterfulltext = AV58FilterFullText ;
      AV68Recetasdeacabado03_wpds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV70Recetasdeacabado03_wpds_4_tfbarser = AV12TFBarSer ;
      AV71Recetasdeacabado03_wpds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV72Recetasdeacabado03_wpds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV74Recetasdeacabado03_wpds_8_tfreclinmaq = AV26TFRecLinMaq ;
      AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV27TFRecLinMaq_To ;
      AV76Recetasdeacabado03_wpds_10_tfmaqcod = AV28TFMaqCod ;
      AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV29TFMaqCod_Sel ;
      AV78Recetasdeacabado03_wpds_12_tfrectotkgs = AV59TFRecTotKgs ;
      AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV60TFRecTotKgs_To ;
      AV80Recetasdeacabado03_wpds_14_tfrecfa = AV61TFRecFA ;
      AV81Recetasdeacabado03_wpds_15_tfrecfa_to = AV62TFRecFA_To ;
      AV82Recetasdeacabado03_wpds_16_tfrecvolprd = AV30TFRecVolPrd ;
      AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV31TFRecVolPrd_To ;
      AV84Recetasdeacabado03_wpds_18_tfrecfecalt = AV32TFRecFecAlt ;
      AV85Recetasdeacabado03_wpds_19_tfrecusrcod = AV34TFRecUsrCod ;
      AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV35TFRecUsrCod_Sel ;
      AV87Recetasdeacabado03_wpds_21_tfrecfecmod = AV36TFRecFecMod ;
      AV88Recetasdeacabado03_wpds_22_tfrecusrmod = AV38TFRecUsrMod ;
      AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV39TFRecUsrMod_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV67Recetasdeacabado03_wpds_1_filterfulltext ,
                                           AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                           AV68Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                           AV71Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                           AV70Recetasdeacabado03_wpds_4_tfbarser ,
                                           AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                           AV72Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                           Short.valueOf(AV74Recetasdeacabado03_wpds_8_tfreclinmaq) ,
                                           Short.valueOf(AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to) ,
                                           AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                           AV76Recetasdeacabado03_wpds_10_tfmaqcod ,
                                           AV78Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                           AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                           AV80Recetasdeacabado03_wpds_14_tfrecfa ,
                                           AV81Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                           Integer.valueOf(AV82Recetasdeacabado03_wpds_16_tfrecvolprd) ,
                                           Integer.valueOf(AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to) ,
                                           AV84Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                           AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                           AV85Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                           AV87Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                           AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                           AV88Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A4259RecTotKgs ,
                                           A2806RecFA ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           A4866RecFecAlt ,
                                           A4867RecFecMod ,
                                           A6039RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV68Recetasdeacabado03_wpds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV68Recetasdeacabado03_wpds_2_tfbarnhdr), 11, "%") ;
      lV70Recetasdeacabado03_wpds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV70Recetasdeacabado03_wpds_4_tfbarser), 16, "%") ;
      lV72Recetasdeacabado03_wpds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV72Recetasdeacabado03_wpds_6_tfbarserdsc), 26, "%") ;
      lV76Recetasdeacabado03_wpds_10_tfmaqcod = GXutil.padr( GXutil.rtrim( AV76Recetasdeacabado03_wpds_10_tfmaqcod), 6, "%") ;
      lV85Recetasdeacabado03_wpds_19_tfrecusrcod = GXutil.padr( GXutil.rtrim( AV85Recetasdeacabado03_wpds_19_tfrecusrcod), 8, "%") ;
      lV88Recetasdeacabado03_wpds_22_tfrecusrmod = GXutil.padr( GXutil.rtrim( AV88Recetasdeacabado03_wpds_22_tfrecusrmod), 8, "%") ;
      /* Using cursor P09BH6 */
      pr_default.execute(4, new Object[] {lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV68Recetasdeacabado03_wpds_2_tfbarnhdr, AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel, lV70Recetasdeacabado03_wpds_4_tfbarser, AV71Recetasdeacabado03_wpds_5_tfbarser_sel, lV72Recetasdeacabado03_wpds_6_tfbarserdsc, AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel, Short.valueOf(AV74Recetasdeacabado03_wpds_8_tfreclinmaq), Short.valueOf(AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to), lV76Recetasdeacabado03_wpds_10_tfmaqcod, AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel, AV78Recetasdeacabado03_wpds_12_tfrectotkgs, AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to, AV80Recetasdeacabado03_wpds_14_tfrecfa, AV81Recetasdeacabado03_wpds_15_tfrecfa_to, Integer.valueOf(AV82Recetasdeacabado03_wpds_16_tfrecvolprd), Integer.valueOf(AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to), AV84Recetasdeacabado03_wpds_18_tfrecfecalt, lV85Recetasdeacabado03_wpds_19_tfrecusrcod, AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel, AV87Recetasdeacabado03_wpds_21_tfrecfecmod, lV88Recetasdeacabado03_wpds_22_tfrecusrmod, AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9BH9 = false ;
         A396EmprCod = P09BH6_A396EmprCod[0] ;
         A6039RecAcab = P09BH6_A6039RecAcab[0] ;
         n6039RecAcab = P09BH6_n6039RecAcab[0] ;
         A4402RecUsrCod = P09BH6_A4402RecUsrCod[0] ;
         A4868RecUsrMod = P09BH6_A4868RecUsrMod[0] ;
         n4868RecUsrMod = P09BH6_n4868RecUsrMod[0] ;
         A4867RecFecMod = P09BH6_A4867RecFecMod[0] ;
         n4867RecFecMod = P09BH6_n4867RecFecMod[0] ;
         A4866RecFecAlt = P09BH6_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BH6_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BH6_A2805RecVolPrd[0] ;
         A2806RecFA = P09BH6_A2806RecFA[0] ;
         A4259RecTotKgs = P09BH6_A4259RecTotKgs[0] ;
         A602MaqCod = P09BH6_A602MaqCod[0] ;
         A2804RecLinMaq = P09BH6_A2804RecLinMaq[0] ;
         A1652BarSerDsc = P09BH6_A1652BarSerDsc[0] ;
         A212BarSer = P09BH6_A212BarSer[0] ;
         A130BarCodPar = P09BH6_A130BarCodPar[0] ;
         A132BarCodReo = P09BH6_A132BarCodReo[0] ;
         A129BarCod = P09BH6_A129BarCod[0] ;
         A1652BarSerDsc = P09BH6_A1652BarSerDsc[0] ;
         A212BarSer = P09BH6_A212BarSer[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09BH6_A4402RecUsrCod[0], A4402RecUsrCod) == 0 ) )
         {
            brk9BH9 = false ;
            A396EmprCod = P09BH6_A396EmprCod[0] ;
            A2804RecLinMaq = P09BH6_A2804RecLinMaq[0] ;
            A130BarCodPar = P09BH6_A130BarCodPar[0] ;
            A132BarCodReo = P09BH6_A132BarCodReo[0] ;
            A129BarCod = P09BH6_A129BarCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9BH9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A4402RecUsrCod)==0) )
         {
            AV44Option = A4402RecUsrCod ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BH9 )
         {
            brk9BH9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADRECUSRMODOPTIONS' Routine */
      returnInSub = false ;
      AV38TFRecUsrMod = AV40SearchTxt ;
      AV39TFRecUsrMod_Sel = "" ;
      AV67Recetasdeacabado03_wpds_1_filterfulltext = AV58FilterFullText ;
      AV68Recetasdeacabado03_wpds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV70Recetasdeacabado03_wpds_4_tfbarser = AV12TFBarSer ;
      AV71Recetasdeacabado03_wpds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV72Recetasdeacabado03_wpds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV74Recetasdeacabado03_wpds_8_tfreclinmaq = AV26TFRecLinMaq ;
      AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to = AV27TFRecLinMaq_To ;
      AV76Recetasdeacabado03_wpds_10_tfmaqcod = AV28TFMaqCod ;
      AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel = AV29TFMaqCod_Sel ;
      AV78Recetasdeacabado03_wpds_12_tfrectotkgs = AV59TFRecTotKgs ;
      AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to = AV60TFRecTotKgs_To ;
      AV80Recetasdeacabado03_wpds_14_tfrecfa = AV61TFRecFA ;
      AV81Recetasdeacabado03_wpds_15_tfrecfa_to = AV62TFRecFA_To ;
      AV82Recetasdeacabado03_wpds_16_tfrecvolprd = AV30TFRecVolPrd ;
      AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to = AV31TFRecVolPrd_To ;
      AV84Recetasdeacabado03_wpds_18_tfrecfecalt = AV32TFRecFecAlt ;
      AV85Recetasdeacabado03_wpds_19_tfrecusrcod = AV34TFRecUsrCod ;
      AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel = AV35TFRecUsrCod_Sel ;
      AV87Recetasdeacabado03_wpds_21_tfrecfecmod = AV36TFRecFecMod ;
      AV88Recetasdeacabado03_wpds_22_tfrecusrmod = AV38TFRecUsrMod ;
      AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel = AV39TFRecUsrMod_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV67Recetasdeacabado03_wpds_1_filterfulltext ,
                                           AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                           AV68Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                           AV71Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                           AV70Recetasdeacabado03_wpds_4_tfbarser ,
                                           AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                           AV72Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                           Short.valueOf(AV74Recetasdeacabado03_wpds_8_tfreclinmaq) ,
                                           Short.valueOf(AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to) ,
                                           AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                           AV76Recetasdeacabado03_wpds_10_tfmaqcod ,
                                           AV78Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                           AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                           AV80Recetasdeacabado03_wpds_14_tfrecfa ,
                                           AV81Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                           Integer.valueOf(AV82Recetasdeacabado03_wpds_16_tfrecvolprd) ,
                                           Integer.valueOf(AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to) ,
                                           AV84Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                           AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                           AV85Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                           AV87Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                           AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                           AV88Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A4259RecTotKgs ,
                                           A2806RecFA ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           A4866RecFecAlt ,
                                           A4867RecFecMod ,
                                           A6039RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV67Recetasdeacabado03_wpds_1_filterfulltext), "%", "") ;
      lV68Recetasdeacabado03_wpds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV68Recetasdeacabado03_wpds_2_tfbarnhdr), 11, "%") ;
      lV70Recetasdeacabado03_wpds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV70Recetasdeacabado03_wpds_4_tfbarser), 16, "%") ;
      lV72Recetasdeacabado03_wpds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV72Recetasdeacabado03_wpds_6_tfbarserdsc), 26, "%") ;
      lV76Recetasdeacabado03_wpds_10_tfmaqcod = GXutil.padr( GXutil.rtrim( AV76Recetasdeacabado03_wpds_10_tfmaqcod), 6, "%") ;
      lV85Recetasdeacabado03_wpds_19_tfrecusrcod = GXutil.padr( GXutil.rtrim( AV85Recetasdeacabado03_wpds_19_tfrecusrcod), 8, "%") ;
      lV88Recetasdeacabado03_wpds_22_tfrecusrmod = GXutil.padr( GXutil.rtrim( AV88Recetasdeacabado03_wpds_22_tfrecusrmod), 8, "%") ;
      /* Using cursor P09BH7 */
      pr_default.execute(5, new Object[] {lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV67Recetasdeacabado03_wpds_1_filterfulltext, lV68Recetasdeacabado03_wpds_2_tfbarnhdr, AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel, lV70Recetasdeacabado03_wpds_4_tfbarser, AV71Recetasdeacabado03_wpds_5_tfbarser_sel, lV72Recetasdeacabado03_wpds_6_tfbarserdsc, AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel, Short.valueOf(AV74Recetasdeacabado03_wpds_8_tfreclinmaq), Short.valueOf(AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to), lV76Recetasdeacabado03_wpds_10_tfmaqcod, AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel, AV78Recetasdeacabado03_wpds_12_tfrectotkgs, AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to, AV80Recetasdeacabado03_wpds_14_tfrecfa, AV81Recetasdeacabado03_wpds_15_tfrecfa_to, Integer.valueOf(AV82Recetasdeacabado03_wpds_16_tfrecvolprd), Integer.valueOf(AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to), AV84Recetasdeacabado03_wpds_18_tfrecfecalt, lV85Recetasdeacabado03_wpds_19_tfrecusrcod, AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel, AV87Recetasdeacabado03_wpds_21_tfrecfecmod, lV88Recetasdeacabado03_wpds_22_tfrecusrmod, AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9BH11 = false ;
         A396EmprCod = P09BH7_A396EmprCod[0] ;
         A6039RecAcab = P09BH7_A6039RecAcab[0] ;
         n6039RecAcab = P09BH7_n6039RecAcab[0] ;
         A4868RecUsrMod = P09BH7_A4868RecUsrMod[0] ;
         n4868RecUsrMod = P09BH7_n4868RecUsrMod[0] ;
         A4867RecFecMod = P09BH7_A4867RecFecMod[0] ;
         n4867RecFecMod = P09BH7_n4867RecFecMod[0] ;
         A4402RecUsrCod = P09BH7_A4402RecUsrCod[0] ;
         A4866RecFecAlt = P09BH7_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BH7_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BH7_A2805RecVolPrd[0] ;
         A2806RecFA = P09BH7_A2806RecFA[0] ;
         A4259RecTotKgs = P09BH7_A4259RecTotKgs[0] ;
         A602MaqCod = P09BH7_A602MaqCod[0] ;
         A2804RecLinMaq = P09BH7_A2804RecLinMaq[0] ;
         A1652BarSerDsc = P09BH7_A1652BarSerDsc[0] ;
         A212BarSer = P09BH7_A212BarSer[0] ;
         A130BarCodPar = P09BH7_A130BarCodPar[0] ;
         A132BarCodReo = P09BH7_A132BarCodReo[0] ;
         A129BarCod = P09BH7_A129BarCod[0] ;
         A1652BarSerDsc = P09BH7_A1652BarSerDsc[0] ;
         A212BarSer = P09BH7_A212BarSer[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09BH7_A4868RecUsrMod[0], A4868RecUsrMod) == 0 ) )
         {
            brk9BH11 = false ;
            A396EmprCod = P09BH7_A396EmprCod[0] ;
            A2804RecLinMaq = P09BH7_A2804RecLinMaq[0] ;
            A130BarCodPar = P09BH7_A130BarCodPar[0] ;
            A132BarCodReo = P09BH7_A132BarCodReo[0] ;
            A129BarCod = P09BH7_A129BarCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9BH11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A4868RecUsrMod)==0) )
         {
            AV44Option = A4868RecUsrMod ;
            AV47OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4868RecUsrMod, "@!"))) ;
            AV45Options.add(AV44Option, 0);
            AV48OptionsDesc.add(AV47OptionDesc, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BH11 )
         {
            brk9BH11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetasdeacabado03_wpgetfilterdata.this.AV46OptionsJson;
      this.aP4[0] = recetasdeacabado03_wpgetfilterdata.this.AV49OptionsDescJson;
      this.aP5[0] = recetasdeacabado03_wpgetfilterdata.this.AV51OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV46OptionsJson = "" ;
      AV49OptionsDescJson = "" ;
      AV51OptionIndexesJson = "" ;
      AV45Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV53Session = httpContext.getWebSession();
      AV55GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV56GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV58FilterFullText = "" ;
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV12TFBarSer = "" ;
      AV13TFBarSer_Sel = "" ;
      AV14TFBarSerDsc = "" ;
      AV15TFBarSerDsc_Sel = "" ;
      AV28TFMaqCod = "" ;
      AV29TFMaqCod_Sel = "" ;
      AV59TFRecTotKgs = DecimalUtil.ZERO ;
      AV60TFRecTotKgs_To = DecimalUtil.ZERO ;
      AV61TFRecFA = DecimalUtil.ZERO ;
      AV62TFRecFA_To = DecimalUtil.ZERO ;
      AV32TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV34TFRecUsrCod = "" ;
      AV35TFRecUsrCod_Sel = "" ;
      AV36TFRecFecMod = GXutil.resetTime( GXutil.nullDate() );
      AV38TFRecUsrMod = "" ;
      AV39TFRecUsrMod_Sel = "" ;
      A13696BarNHdr = "" ;
      AV67Recetasdeacabado03_wpds_1_filterfulltext = "" ;
      AV68Recetasdeacabado03_wpds_2_tfbarnhdr = "" ;
      AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel = "" ;
      AV70Recetasdeacabado03_wpds_4_tfbarser = "" ;
      AV71Recetasdeacabado03_wpds_5_tfbarser_sel = "" ;
      AV72Recetasdeacabado03_wpds_6_tfbarserdsc = "" ;
      AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel = "" ;
      AV76Recetasdeacabado03_wpds_10_tfmaqcod = "" ;
      AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel = "" ;
      AV78Recetasdeacabado03_wpds_12_tfrectotkgs = DecimalUtil.ZERO ;
      AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to = DecimalUtil.ZERO ;
      AV80Recetasdeacabado03_wpds_14_tfrecfa = DecimalUtil.ZERO ;
      AV81Recetasdeacabado03_wpds_15_tfrecfa_to = DecimalUtil.ZERO ;
      AV84Recetasdeacabado03_wpds_18_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      AV85Recetasdeacabado03_wpds_19_tfrecusrcod = "" ;
      AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel = "" ;
      AV87Recetasdeacabado03_wpds_21_tfrecfecmod = GXutil.resetTime( GXutil.nullDate() );
      AV88Recetasdeacabado03_wpds_22_tfrecusrmod = "" ;
      AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel = "" ;
      scmdbuf = "" ;
      lV67Recetasdeacabado03_wpds_1_filterfulltext = "" ;
      lV68Recetasdeacabado03_wpds_2_tfbarnhdr = "" ;
      lV70Recetasdeacabado03_wpds_4_tfbarser = "" ;
      lV72Recetasdeacabado03_wpds_6_tfbarserdsc = "" ;
      lV76Recetasdeacabado03_wpds_10_tfmaqcod = "" ;
      lV85Recetasdeacabado03_wpds_19_tfrecusrcod = "" ;
      lV88Recetasdeacabado03_wpds_22_tfrecusrmod = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A602MaqCod = "" ;
      A4259RecTotKgs = DecimalUtil.ZERO ;
      A2806RecFA = DecimalUtil.ZERO ;
      A4402RecUsrCod = "" ;
      A4868RecUsrMod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4867RecFecMod = GXutil.resetTime( GXutil.nullDate() );
      A6039RecAcab = "" ;
      P09BH2_A396EmprCod = new String[] {""} ;
      P09BH2_A6039RecAcab = new String[] {""} ;
      P09BH2_n6039RecAcab = new boolean[] {false} ;
      P09BH2_A4868RecUsrMod = new String[] {""} ;
      P09BH2_n4868RecUsrMod = new boolean[] {false} ;
      P09BH2_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09BH2_n4867RecFecMod = new boolean[] {false} ;
      P09BH2_A4402RecUsrCod = new String[] {""} ;
      P09BH2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BH2_n4866RecFecAlt = new boolean[] {false} ;
      P09BH2_A2805RecVolPrd = new int[1] ;
      P09BH2_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BH2_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BH2_A602MaqCod = new String[] {""} ;
      P09BH2_A2804RecLinMaq = new short[1] ;
      P09BH2_A1652BarSerDsc = new String[] {""} ;
      P09BH2_A212BarSer = new String[] {""} ;
      P09BH2_A130BarCodPar = new String[] {""} ;
      P09BH2_A132BarCodReo = new byte[1] ;
      P09BH2_A129BarCod = new int[1] ;
      A396EmprCod = "" ;
      AV44Option = "" ;
      P09BH3_A396EmprCod = new String[] {""} ;
      P09BH3_A6039RecAcab = new String[] {""} ;
      P09BH3_n6039RecAcab = new boolean[] {false} ;
      P09BH3_A212BarSer = new String[] {""} ;
      P09BH3_A4868RecUsrMod = new String[] {""} ;
      P09BH3_n4868RecUsrMod = new boolean[] {false} ;
      P09BH3_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09BH3_n4867RecFecMod = new boolean[] {false} ;
      P09BH3_A4402RecUsrCod = new String[] {""} ;
      P09BH3_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BH3_n4866RecFecAlt = new boolean[] {false} ;
      P09BH3_A2805RecVolPrd = new int[1] ;
      P09BH3_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BH3_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BH3_A602MaqCod = new String[] {""} ;
      P09BH3_A2804RecLinMaq = new short[1] ;
      P09BH3_A1652BarSerDsc = new String[] {""} ;
      P09BH3_A130BarCodPar = new String[] {""} ;
      P09BH3_A132BarCodReo = new byte[1] ;
      P09BH3_A129BarCod = new int[1] ;
      P09BH4_A396EmprCod = new String[] {""} ;
      P09BH4_A6039RecAcab = new String[] {""} ;
      P09BH4_n6039RecAcab = new boolean[] {false} ;
      P09BH4_A1652BarSerDsc = new String[] {""} ;
      P09BH4_A4868RecUsrMod = new String[] {""} ;
      P09BH4_n4868RecUsrMod = new boolean[] {false} ;
      P09BH4_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09BH4_n4867RecFecMod = new boolean[] {false} ;
      P09BH4_A4402RecUsrCod = new String[] {""} ;
      P09BH4_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BH4_n4866RecFecAlt = new boolean[] {false} ;
      P09BH4_A2805RecVolPrd = new int[1] ;
      P09BH4_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BH4_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BH4_A602MaqCod = new String[] {""} ;
      P09BH4_A2804RecLinMaq = new short[1] ;
      P09BH4_A212BarSer = new String[] {""} ;
      P09BH4_A130BarCodPar = new String[] {""} ;
      P09BH4_A132BarCodReo = new byte[1] ;
      P09BH4_A129BarCod = new int[1] ;
      P09BH5_A396EmprCod = new String[] {""} ;
      P09BH5_A6039RecAcab = new String[] {""} ;
      P09BH5_n6039RecAcab = new boolean[] {false} ;
      P09BH5_A602MaqCod = new String[] {""} ;
      P09BH5_A4868RecUsrMod = new String[] {""} ;
      P09BH5_n4868RecUsrMod = new boolean[] {false} ;
      P09BH5_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09BH5_n4867RecFecMod = new boolean[] {false} ;
      P09BH5_A4402RecUsrCod = new String[] {""} ;
      P09BH5_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BH5_n4866RecFecAlt = new boolean[] {false} ;
      P09BH5_A2805RecVolPrd = new int[1] ;
      P09BH5_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BH5_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BH5_A2804RecLinMaq = new short[1] ;
      P09BH5_A1652BarSerDsc = new String[] {""} ;
      P09BH5_A212BarSer = new String[] {""} ;
      P09BH5_A130BarCodPar = new String[] {""} ;
      P09BH5_A132BarCodReo = new byte[1] ;
      P09BH5_A129BarCod = new int[1] ;
      P09BH6_A396EmprCod = new String[] {""} ;
      P09BH6_A6039RecAcab = new String[] {""} ;
      P09BH6_n6039RecAcab = new boolean[] {false} ;
      P09BH6_A4402RecUsrCod = new String[] {""} ;
      P09BH6_A4868RecUsrMod = new String[] {""} ;
      P09BH6_n4868RecUsrMod = new boolean[] {false} ;
      P09BH6_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09BH6_n4867RecFecMod = new boolean[] {false} ;
      P09BH6_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BH6_n4866RecFecAlt = new boolean[] {false} ;
      P09BH6_A2805RecVolPrd = new int[1] ;
      P09BH6_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BH6_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BH6_A602MaqCod = new String[] {""} ;
      P09BH6_A2804RecLinMaq = new short[1] ;
      P09BH6_A1652BarSerDsc = new String[] {""} ;
      P09BH6_A212BarSer = new String[] {""} ;
      P09BH6_A130BarCodPar = new String[] {""} ;
      P09BH6_A132BarCodReo = new byte[1] ;
      P09BH6_A129BarCod = new int[1] ;
      P09BH7_A396EmprCod = new String[] {""} ;
      P09BH7_A6039RecAcab = new String[] {""} ;
      P09BH7_n6039RecAcab = new boolean[] {false} ;
      P09BH7_A4868RecUsrMod = new String[] {""} ;
      P09BH7_n4868RecUsrMod = new boolean[] {false} ;
      P09BH7_A4867RecFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09BH7_n4867RecFecMod = new boolean[] {false} ;
      P09BH7_A4402RecUsrCod = new String[] {""} ;
      P09BH7_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BH7_n4866RecFecAlt = new boolean[] {false} ;
      P09BH7_A2805RecVolPrd = new int[1] ;
      P09BH7_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BH7_A4259RecTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09BH7_A602MaqCod = new String[] {""} ;
      P09BH7_A2804RecLinMaq = new short[1] ;
      P09BH7_A1652BarSerDsc = new String[] {""} ;
      P09BH7_A212BarSer = new String[] {""} ;
      P09BH7_A130BarCodPar = new String[] {""} ;
      P09BH7_A132BarCodReo = new byte[1] ;
      P09BH7_A129BarCod = new int[1] ;
      AV47OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado03_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09BH2_A396EmprCod, P09BH2_A6039RecAcab, P09BH2_n6039RecAcab, P09BH2_A4868RecUsrMod, P09BH2_n4868RecUsrMod, P09BH2_A4867RecFecMod, P09BH2_n4867RecFecMod, P09BH2_A4402RecUsrCod, P09BH2_A4866RecFecAlt, P09BH2_n4866RecFecAlt,
            P09BH2_A2805RecVolPrd, P09BH2_A2806RecFA, P09BH2_A4259RecTotKgs, P09BH2_A602MaqCod, P09BH2_A2804RecLinMaq, P09BH2_A1652BarSerDsc, P09BH2_A212BarSer, P09BH2_A130BarCodPar, P09BH2_A132BarCodReo, P09BH2_A129BarCod
            }
            , new Object[] {
            P09BH3_A396EmprCod, P09BH3_A6039RecAcab, P09BH3_n6039RecAcab, P09BH3_A212BarSer, P09BH3_A4868RecUsrMod, P09BH3_n4868RecUsrMod, P09BH3_A4867RecFecMod, P09BH3_n4867RecFecMod, P09BH3_A4402RecUsrCod, P09BH3_A4866RecFecAlt,
            P09BH3_n4866RecFecAlt, P09BH3_A2805RecVolPrd, P09BH3_A2806RecFA, P09BH3_A4259RecTotKgs, P09BH3_A602MaqCod, P09BH3_A2804RecLinMaq, P09BH3_A1652BarSerDsc, P09BH3_A130BarCodPar, P09BH3_A132BarCodReo, P09BH3_A129BarCod
            }
            , new Object[] {
            P09BH4_A396EmprCod, P09BH4_A6039RecAcab, P09BH4_n6039RecAcab, P09BH4_A1652BarSerDsc, P09BH4_A4868RecUsrMod, P09BH4_n4868RecUsrMod, P09BH4_A4867RecFecMod, P09BH4_n4867RecFecMod, P09BH4_A4402RecUsrCod, P09BH4_A4866RecFecAlt,
            P09BH4_n4866RecFecAlt, P09BH4_A2805RecVolPrd, P09BH4_A2806RecFA, P09BH4_A4259RecTotKgs, P09BH4_A602MaqCod, P09BH4_A2804RecLinMaq, P09BH4_A212BarSer, P09BH4_A130BarCodPar, P09BH4_A132BarCodReo, P09BH4_A129BarCod
            }
            , new Object[] {
            P09BH5_A396EmprCod, P09BH5_A6039RecAcab, P09BH5_n6039RecAcab, P09BH5_A602MaqCod, P09BH5_A4868RecUsrMod, P09BH5_n4868RecUsrMod, P09BH5_A4867RecFecMod, P09BH5_n4867RecFecMod, P09BH5_A4402RecUsrCod, P09BH5_A4866RecFecAlt,
            P09BH5_n4866RecFecAlt, P09BH5_A2805RecVolPrd, P09BH5_A2806RecFA, P09BH5_A4259RecTotKgs, P09BH5_A2804RecLinMaq, P09BH5_A1652BarSerDsc, P09BH5_A212BarSer, P09BH5_A130BarCodPar, P09BH5_A132BarCodReo, P09BH5_A129BarCod
            }
            , new Object[] {
            P09BH6_A396EmprCod, P09BH6_A6039RecAcab, P09BH6_n6039RecAcab, P09BH6_A4402RecUsrCod, P09BH6_A4868RecUsrMod, P09BH6_n4868RecUsrMod, P09BH6_A4867RecFecMod, P09BH6_n4867RecFecMod, P09BH6_A4866RecFecAlt, P09BH6_n4866RecFecAlt,
            P09BH6_A2805RecVolPrd, P09BH6_A2806RecFA, P09BH6_A4259RecTotKgs, P09BH6_A602MaqCod, P09BH6_A2804RecLinMaq, P09BH6_A1652BarSerDsc, P09BH6_A212BarSer, P09BH6_A130BarCodPar, P09BH6_A132BarCodReo, P09BH6_A129BarCod
            }
            , new Object[] {
            P09BH7_A396EmprCod, P09BH7_A6039RecAcab, P09BH7_n6039RecAcab, P09BH7_A4868RecUsrMod, P09BH7_n4868RecUsrMod, P09BH7_A4867RecFecMod, P09BH7_n4867RecFecMod, P09BH7_A4402RecUsrCod, P09BH7_A4866RecFecAlt, P09BH7_n4866RecFecAlt,
            P09BH7_A2805RecVolPrd, P09BH7_A2806RecFA, P09BH7_A4259RecTotKgs, P09BH7_A602MaqCod, P09BH7_A2804RecLinMaq, P09BH7_A1652BarSerDsc, P09BH7_A212BarSer, P09BH7_A130BarCodPar, P09BH7_A132BarCodReo, P09BH7_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV26TFRecLinMaq ;
   private short AV27TFRecLinMaq_To ;
   private short AV74Recetasdeacabado03_wpds_8_tfreclinmaq ;
   private short AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV65GXV1 ;
   private int AV30TFRecVolPrd ;
   private int AV31TFRecVolPrd_To ;
   private int AV82Recetasdeacabado03_wpds_16_tfrecvolprd ;
   private int AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int AV43InsertIndex ;
   private long AV52count ;
   private java.math.BigDecimal AV59TFRecTotKgs ;
   private java.math.BigDecimal AV60TFRecTotKgs_To ;
   private java.math.BigDecimal AV61TFRecFA ;
   private java.math.BigDecimal AV62TFRecFA_To ;
   private java.math.BigDecimal AV78Recetasdeacabado03_wpds_12_tfrectotkgs ;
   private java.math.BigDecimal AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ;
   private java.math.BigDecimal AV80Recetasdeacabado03_wpds_14_tfrecfa ;
   private java.math.BigDecimal AV81Recetasdeacabado03_wpds_15_tfrecfa_to ;
   private java.math.BigDecimal A4259RecTotKgs ;
   private java.math.BigDecimal A2806RecFA ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV12TFBarSer ;
   private String AV13TFBarSer_Sel ;
   private String AV14TFBarSerDsc ;
   private String AV15TFBarSerDsc_Sel ;
   private String AV28TFMaqCod ;
   private String AV29TFMaqCod_Sel ;
   private String AV34TFRecUsrCod ;
   private String AV35TFRecUsrCod_Sel ;
   private String AV38TFRecUsrMod ;
   private String AV39TFRecUsrMod_Sel ;
   private String A13696BarNHdr ;
   private String AV68Recetasdeacabado03_wpds_2_tfbarnhdr ;
   private String AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ;
   private String AV70Recetasdeacabado03_wpds_4_tfbarser ;
   private String AV71Recetasdeacabado03_wpds_5_tfbarser_sel ;
   private String AV72Recetasdeacabado03_wpds_6_tfbarserdsc ;
   private String AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ;
   private String AV76Recetasdeacabado03_wpds_10_tfmaqcod ;
   private String AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ;
   private String AV85Recetasdeacabado03_wpds_19_tfrecusrcod ;
   private String AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ;
   private String AV88Recetasdeacabado03_wpds_22_tfrecusrmod ;
   private String AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ;
   private String scmdbuf ;
   private String lV68Recetasdeacabado03_wpds_2_tfbarnhdr ;
   private String lV70Recetasdeacabado03_wpds_4_tfbarser ;
   private String lV72Recetasdeacabado03_wpds_6_tfbarserdsc ;
   private String lV76Recetasdeacabado03_wpds_10_tfmaqcod ;
   private String lV85Recetasdeacabado03_wpds_19_tfrecusrcod ;
   private String lV88Recetasdeacabado03_wpds_22_tfrecusrmod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A602MaqCod ;
   private String A4402RecUsrCod ;
   private String A4868RecUsrMod ;
   private String A6039RecAcab ;
   private String A396EmprCod ;
   private java.util.Date AV32TFRecFecAlt ;
   private java.util.Date AV36TFRecFecMod ;
   private java.util.Date AV84Recetasdeacabado03_wpds_18_tfrecfecalt ;
   private java.util.Date AV87Recetasdeacabado03_wpds_21_tfrecfecmod ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date A4867RecFecMod ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private boolean n4868RecUsrMod ;
   private boolean n4867RecFecMod ;
   private boolean n4866RecFecAlt ;
   private boolean brk9BH3 ;
   private boolean brk9BH5 ;
   private boolean brk9BH7 ;
   private boolean brk9BH9 ;
   private boolean brk9BH11 ;
   private String AV46OptionsJson ;
   private String AV49OptionsDescJson ;
   private String AV51OptionIndexesJson ;
   private String AV42DDOName ;
   private String AV40SearchTxt ;
   private String AV41SearchTxtTo ;
   private String AV58FilterFullText ;
   private String AV67Recetasdeacabado03_wpds_1_filterfulltext ;
   private String lV67Recetasdeacabado03_wpds_1_filterfulltext ;
   private String AV44Option ;
   private String AV47OptionDesc ;
   private com.genexus.webpanels.WebSession AV53Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09BH2_A396EmprCod ;
   private String[] P09BH2_A6039RecAcab ;
   private boolean[] P09BH2_n6039RecAcab ;
   private String[] P09BH2_A4868RecUsrMod ;
   private boolean[] P09BH2_n4868RecUsrMod ;
   private java.util.Date[] P09BH2_A4867RecFecMod ;
   private boolean[] P09BH2_n4867RecFecMod ;
   private String[] P09BH2_A4402RecUsrCod ;
   private java.util.Date[] P09BH2_A4866RecFecAlt ;
   private boolean[] P09BH2_n4866RecFecAlt ;
   private int[] P09BH2_A2805RecVolPrd ;
   private java.math.BigDecimal[] P09BH2_A2806RecFA ;
   private java.math.BigDecimal[] P09BH2_A4259RecTotKgs ;
   private String[] P09BH2_A602MaqCod ;
   private short[] P09BH2_A2804RecLinMaq ;
   private String[] P09BH2_A1652BarSerDsc ;
   private String[] P09BH2_A212BarSer ;
   private String[] P09BH2_A130BarCodPar ;
   private byte[] P09BH2_A132BarCodReo ;
   private int[] P09BH2_A129BarCod ;
   private String[] P09BH3_A396EmprCod ;
   private String[] P09BH3_A6039RecAcab ;
   private boolean[] P09BH3_n6039RecAcab ;
   private String[] P09BH3_A212BarSer ;
   private String[] P09BH3_A4868RecUsrMod ;
   private boolean[] P09BH3_n4868RecUsrMod ;
   private java.util.Date[] P09BH3_A4867RecFecMod ;
   private boolean[] P09BH3_n4867RecFecMod ;
   private String[] P09BH3_A4402RecUsrCod ;
   private java.util.Date[] P09BH3_A4866RecFecAlt ;
   private boolean[] P09BH3_n4866RecFecAlt ;
   private int[] P09BH3_A2805RecVolPrd ;
   private java.math.BigDecimal[] P09BH3_A2806RecFA ;
   private java.math.BigDecimal[] P09BH3_A4259RecTotKgs ;
   private String[] P09BH3_A602MaqCod ;
   private short[] P09BH3_A2804RecLinMaq ;
   private String[] P09BH3_A1652BarSerDsc ;
   private String[] P09BH3_A130BarCodPar ;
   private byte[] P09BH3_A132BarCodReo ;
   private int[] P09BH3_A129BarCod ;
   private String[] P09BH4_A396EmprCod ;
   private String[] P09BH4_A6039RecAcab ;
   private boolean[] P09BH4_n6039RecAcab ;
   private String[] P09BH4_A1652BarSerDsc ;
   private String[] P09BH4_A4868RecUsrMod ;
   private boolean[] P09BH4_n4868RecUsrMod ;
   private java.util.Date[] P09BH4_A4867RecFecMod ;
   private boolean[] P09BH4_n4867RecFecMod ;
   private String[] P09BH4_A4402RecUsrCod ;
   private java.util.Date[] P09BH4_A4866RecFecAlt ;
   private boolean[] P09BH4_n4866RecFecAlt ;
   private int[] P09BH4_A2805RecVolPrd ;
   private java.math.BigDecimal[] P09BH4_A2806RecFA ;
   private java.math.BigDecimal[] P09BH4_A4259RecTotKgs ;
   private String[] P09BH4_A602MaqCod ;
   private short[] P09BH4_A2804RecLinMaq ;
   private String[] P09BH4_A212BarSer ;
   private String[] P09BH4_A130BarCodPar ;
   private byte[] P09BH4_A132BarCodReo ;
   private int[] P09BH4_A129BarCod ;
   private String[] P09BH5_A396EmprCod ;
   private String[] P09BH5_A6039RecAcab ;
   private boolean[] P09BH5_n6039RecAcab ;
   private String[] P09BH5_A602MaqCod ;
   private String[] P09BH5_A4868RecUsrMod ;
   private boolean[] P09BH5_n4868RecUsrMod ;
   private java.util.Date[] P09BH5_A4867RecFecMod ;
   private boolean[] P09BH5_n4867RecFecMod ;
   private String[] P09BH5_A4402RecUsrCod ;
   private java.util.Date[] P09BH5_A4866RecFecAlt ;
   private boolean[] P09BH5_n4866RecFecAlt ;
   private int[] P09BH5_A2805RecVolPrd ;
   private java.math.BigDecimal[] P09BH5_A2806RecFA ;
   private java.math.BigDecimal[] P09BH5_A4259RecTotKgs ;
   private short[] P09BH5_A2804RecLinMaq ;
   private String[] P09BH5_A1652BarSerDsc ;
   private String[] P09BH5_A212BarSer ;
   private String[] P09BH5_A130BarCodPar ;
   private byte[] P09BH5_A132BarCodReo ;
   private int[] P09BH5_A129BarCod ;
   private String[] P09BH6_A396EmprCod ;
   private String[] P09BH6_A6039RecAcab ;
   private boolean[] P09BH6_n6039RecAcab ;
   private String[] P09BH6_A4402RecUsrCod ;
   private String[] P09BH6_A4868RecUsrMod ;
   private boolean[] P09BH6_n4868RecUsrMod ;
   private java.util.Date[] P09BH6_A4867RecFecMod ;
   private boolean[] P09BH6_n4867RecFecMod ;
   private java.util.Date[] P09BH6_A4866RecFecAlt ;
   private boolean[] P09BH6_n4866RecFecAlt ;
   private int[] P09BH6_A2805RecVolPrd ;
   private java.math.BigDecimal[] P09BH6_A2806RecFA ;
   private java.math.BigDecimal[] P09BH6_A4259RecTotKgs ;
   private String[] P09BH6_A602MaqCod ;
   private short[] P09BH6_A2804RecLinMaq ;
   private String[] P09BH6_A1652BarSerDsc ;
   private String[] P09BH6_A212BarSer ;
   private String[] P09BH6_A130BarCodPar ;
   private byte[] P09BH6_A132BarCodReo ;
   private int[] P09BH6_A129BarCod ;
   private String[] P09BH7_A396EmprCod ;
   private String[] P09BH7_A6039RecAcab ;
   private boolean[] P09BH7_n6039RecAcab ;
   private String[] P09BH7_A4868RecUsrMod ;
   private boolean[] P09BH7_n4868RecUsrMod ;
   private java.util.Date[] P09BH7_A4867RecFecMod ;
   private boolean[] P09BH7_n4867RecFecMod ;
   private String[] P09BH7_A4402RecUsrCod ;
   private java.util.Date[] P09BH7_A4866RecFecAlt ;
   private boolean[] P09BH7_n4866RecFecAlt ;
   private int[] P09BH7_A2805RecVolPrd ;
   private java.math.BigDecimal[] P09BH7_A2806RecFA ;
   private java.math.BigDecimal[] P09BH7_A4259RecTotKgs ;
   private String[] P09BH7_A602MaqCod ;
   private short[] P09BH7_A2804RecLinMaq ;
   private String[] P09BH7_A1652BarSerDsc ;
   private String[] P09BH7_A212BarSer ;
   private String[] P09BH7_A130BarCodPar ;
   private byte[] P09BH7_A132BarCodReo ;
   private int[] P09BH7_A129BarCod ;
   private GXSimpleCollection<String> AV45Options ;
   private GXSimpleCollection<String> AV48OptionsDesc ;
   private GXSimpleCollection<String> AV50OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV55GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV56GridStateFilterValue ;
}

final  class recetasdeacabado03_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09BH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Recetasdeacabado03_wpds_1_filterfulltext ,
                                          String AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                          String AV68Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                          String AV71Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                          String AV70Recetasdeacabado03_wpds_4_tfbarser ,
                                          String AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                          String AV72Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                          short AV74Recetasdeacabado03_wpds_8_tfreclinmaq ,
                                          short AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to ,
                                          String AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                          String AV76Recetasdeacabado03_wpds_10_tfmaqcod ,
                                          java.math.BigDecimal AV78Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                          java.math.BigDecimal AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                          java.math.BigDecimal AV80Recetasdeacabado03_wpds_14_tfrecfa ,
                                          java.math.BigDecimal AV81Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                          int AV82Recetasdeacabado03_wpds_16_tfrecvolprd ,
                                          int AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to ,
                                          java.util.Date AV84Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                          String AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                          String AV85Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                          java.util.Date AV87Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                          String AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                          String AV88Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A4259RecTotKgs ,
                                          java.math.BigDecimal A2806RecFA ,
                                          int A2805RecVolPrd ,
                                          String A4402RecUsrCod ,
                                          String A4868RecUsrMod ,
                                          java.util.Date A4866RecFecAlt ,
                                          java.util.Date A4867RecFecMod ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[32];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T1.RecUsrMod, T1.RecFecMod, T1.RecUsrCod, T1.RecFecAlt, T1.RecVolPrd, T1.RecFA, T1.RecTotKgs, T1.MaqCod, T1.RecLinMaq, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV67Recetasdeacabado03_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecTotKgs,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecFA,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( UPPER(T1.RecUsrCod) like '%' || UPPER(?)) or ( UPPER(T1.RecUsrMod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetasdeacabado03_wpds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetasdeacabado03_wpds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetasdeacabado03_wpds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV74Recetasdeacabado03_wpds_8_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetasdeacabado03_wpds_10_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetasdeacabado03_wpds_12_tfrectotkgs)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetasdeacabado03_wpds_14_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetasdeacabado03_wpds_15_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Recetasdeacabado03_wpds_16_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Recetasdeacabado03_wpds_18_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Recetasdeacabado03_wpds_19_tfrecusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrCod = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Recetasdeacabado03_wpds_21_tfrecfecmod) )
      {
         addWhere(sWhereString, "(T1.RecFecMod >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetasdeacabado03_wpds_22_tfrecusrmod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrMod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrMod = ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09BH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Recetasdeacabado03_wpds_1_filterfulltext ,
                                          String AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                          String AV68Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                          String AV71Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                          String AV70Recetasdeacabado03_wpds_4_tfbarser ,
                                          String AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                          String AV72Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                          short AV74Recetasdeacabado03_wpds_8_tfreclinmaq ,
                                          short AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to ,
                                          String AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                          String AV76Recetasdeacabado03_wpds_10_tfmaqcod ,
                                          java.math.BigDecimal AV78Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                          java.math.BigDecimal AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                          java.math.BigDecimal AV80Recetasdeacabado03_wpds_14_tfrecfa ,
                                          java.math.BigDecimal AV81Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                          int AV82Recetasdeacabado03_wpds_16_tfrecvolprd ,
                                          int AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to ,
                                          java.util.Date AV84Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                          String AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                          String AV85Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                          java.util.Date AV87Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                          String AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                          String AV88Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A4259RecTotKgs ,
                                          java.math.BigDecimal A2806RecFA ,
                                          int A2805RecVolPrd ,
                                          String A4402RecUsrCod ,
                                          String A4868RecUsrMod ,
                                          java.util.Date A4866RecFecAlt ,
                                          java.util.Date A4867RecFecMod ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[32];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarSer, T1.RecUsrMod, T1.RecFecMod, T1.RecUsrCod, T1.RecFecAlt, T1.RecVolPrd, T1.RecFA, T1.RecTotKgs, T1.MaqCod, T1.RecLinMaq," ;
      scmdbuf += " T2.BarSerDsc, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV67Recetasdeacabado03_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecTotKgs,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecFA,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( UPPER(T1.RecUsrCod) like '%' || UPPER(?)) or ( UPPER(T1.RecUsrMod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetasdeacabado03_wpds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetasdeacabado03_wpds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetasdeacabado03_wpds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV74Recetasdeacabado03_wpds_8_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetasdeacabado03_wpds_10_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetasdeacabado03_wpds_12_tfrectotkgs)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetasdeacabado03_wpds_14_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetasdeacabado03_wpds_15_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Recetasdeacabado03_wpds_16_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Recetasdeacabado03_wpds_18_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Recetasdeacabado03_wpds_19_tfrecusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrCod = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Recetasdeacabado03_wpds_21_tfrecfecmod) )
      {
         addWhere(sWhereString, "(T1.RecFecMod >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetasdeacabado03_wpds_22_tfrecusrmod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrMod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrMod = ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09BH4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Recetasdeacabado03_wpds_1_filterfulltext ,
                                          String AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                          String AV68Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                          String AV71Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                          String AV70Recetasdeacabado03_wpds_4_tfbarser ,
                                          String AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                          String AV72Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                          short AV74Recetasdeacabado03_wpds_8_tfreclinmaq ,
                                          short AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to ,
                                          String AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                          String AV76Recetasdeacabado03_wpds_10_tfmaqcod ,
                                          java.math.BigDecimal AV78Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                          java.math.BigDecimal AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                          java.math.BigDecimal AV80Recetasdeacabado03_wpds_14_tfrecfa ,
                                          java.math.BigDecimal AV81Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                          int AV82Recetasdeacabado03_wpds_16_tfrecvolprd ,
                                          int AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to ,
                                          java.util.Date AV84Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                          String AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                          String AV85Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                          java.util.Date AV87Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                          String AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                          String AV88Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A4259RecTotKgs ,
                                          java.math.BigDecimal A2806RecFA ,
                                          int A2805RecVolPrd ,
                                          String A4402RecUsrCod ,
                                          String A4868RecUsrMod ,
                                          java.util.Date A4866RecFecAlt ,
                                          java.util.Date A4867RecFecMod ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[32];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarSerDsc, T1.RecUsrMod, T1.RecFecMod, T1.RecUsrCod, T1.RecFecAlt, T1.RecVolPrd, T1.RecFA, T1.RecTotKgs, T1.MaqCod, T1.RecLinMaq," ;
      scmdbuf += " T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV67Recetasdeacabado03_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecTotKgs,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecFA,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( UPPER(T1.RecUsrCod) like '%' || UPPER(?)) or ( UPPER(T1.RecUsrMod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetasdeacabado03_wpds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetasdeacabado03_wpds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetasdeacabado03_wpds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV74Recetasdeacabado03_wpds_8_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetasdeacabado03_wpds_10_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetasdeacabado03_wpds_12_tfrectotkgs)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetasdeacabado03_wpds_14_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetasdeacabado03_wpds_15_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Recetasdeacabado03_wpds_16_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Recetasdeacabado03_wpds_18_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Recetasdeacabado03_wpds_19_tfrecusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrCod = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Recetasdeacabado03_wpds_21_tfrecfecmod) )
      {
         addWhere(sWhereString, "(T1.RecFecMod >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetasdeacabado03_wpds_22_tfrecusrmod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrMod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrMod = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09BH5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Recetasdeacabado03_wpds_1_filterfulltext ,
                                          String AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                          String AV68Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                          String AV71Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                          String AV70Recetasdeacabado03_wpds_4_tfbarser ,
                                          String AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                          String AV72Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                          short AV74Recetasdeacabado03_wpds_8_tfreclinmaq ,
                                          short AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to ,
                                          String AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                          String AV76Recetasdeacabado03_wpds_10_tfmaqcod ,
                                          java.math.BigDecimal AV78Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                          java.math.BigDecimal AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                          java.math.BigDecimal AV80Recetasdeacabado03_wpds_14_tfrecfa ,
                                          java.math.BigDecimal AV81Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                          int AV82Recetasdeacabado03_wpds_16_tfrecvolprd ,
                                          int AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to ,
                                          java.util.Date AV84Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                          String AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                          String AV85Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                          java.util.Date AV87Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                          String AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                          String AV88Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A4259RecTotKgs ,
                                          java.math.BigDecimal A2806RecFA ,
                                          int A2805RecVolPrd ,
                                          String A4402RecUsrCod ,
                                          String A4868RecUsrMod ,
                                          java.util.Date A4866RecFecAlt ,
                                          java.util.Date A4867RecFecMod ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[32];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T1.MaqCod, T1.RecUsrMod, T1.RecFecMod, T1.RecUsrCod, T1.RecFecAlt, T1.RecVolPrd, T1.RecFA, T1.RecTotKgs, T1.RecLinMaq, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV67Recetasdeacabado03_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecTotKgs,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecFA,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( UPPER(T1.RecUsrCod) like '%' || UPPER(?)) or ( UPPER(T1.RecUsrMod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetasdeacabado03_wpds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetasdeacabado03_wpds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetasdeacabado03_wpds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV74Recetasdeacabado03_wpds_8_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetasdeacabado03_wpds_10_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetasdeacabado03_wpds_12_tfrectotkgs)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetasdeacabado03_wpds_14_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetasdeacabado03_wpds_15_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Recetasdeacabado03_wpds_16_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Recetasdeacabado03_wpds_18_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Recetasdeacabado03_wpds_19_tfrecusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrCod = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Recetasdeacabado03_wpds_21_tfrecfecmod) )
      {
         addWhere(sWhereString, "(T1.RecFecMod >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetasdeacabado03_wpds_22_tfrecusrmod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrMod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrMod = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.MaqCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09BH6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Recetasdeacabado03_wpds_1_filterfulltext ,
                                          String AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                          String AV68Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                          String AV71Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                          String AV70Recetasdeacabado03_wpds_4_tfbarser ,
                                          String AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                          String AV72Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                          short AV74Recetasdeacabado03_wpds_8_tfreclinmaq ,
                                          short AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to ,
                                          String AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                          String AV76Recetasdeacabado03_wpds_10_tfmaqcod ,
                                          java.math.BigDecimal AV78Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                          java.math.BigDecimal AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                          java.math.BigDecimal AV80Recetasdeacabado03_wpds_14_tfrecfa ,
                                          java.math.BigDecimal AV81Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                          int AV82Recetasdeacabado03_wpds_16_tfrecvolprd ,
                                          int AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to ,
                                          java.util.Date AV84Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                          String AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                          String AV85Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                          java.util.Date AV87Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                          String AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                          String AV88Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A4259RecTotKgs ,
                                          java.math.BigDecimal A2806RecFA ,
                                          int A2805RecVolPrd ,
                                          String A4402RecUsrCod ,
                                          String A4868RecUsrMod ,
                                          java.util.Date A4866RecFecAlt ,
                                          java.util.Date A4867RecFecMod ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[32];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T1.RecUsrCod, T1.RecUsrMod, T1.RecFecMod, T1.RecFecAlt, T1.RecVolPrd, T1.RecFA, T1.RecTotKgs, T1.MaqCod, T1.RecLinMaq, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV67Recetasdeacabado03_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecTotKgs,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecFA,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( UPPER(T1.RecUsrCod) like '%' || UPPER(?)) or ( UPPER(T1.RecUsrMod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetasdeacabado03_wpds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetasdeacabado03_wpds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetasdeacabado03_wpds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (0==AV74Recetasdeacabado03_wpds_8_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (0==AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetasdeacabado03_wpds_10_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetasdeacabado03_wpds_12_tfrectotkgs)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetasdeacabado03_wpds_14_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetasdeacabado03_wpds_15_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Recetasdeacabado03_wpds_16_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Recetasdeacabado03_wpds_18_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Recetasdeacabado03_wpds_19_tfrecusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrCod = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Recetasdeacabado03_wpds_21_tfrecfecmod) )
      {
         addWhere(sWhereString, "(T1.RecFecMod >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetasdeacabado03_wpds_22_tfrecusrmod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrMod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrMod = ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecUsrCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09BH7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV67Recetasdeacabado03_wpds_1_filterfulltext ,
                                          String AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel ,
                                          String AV68Recetasdeacabado03_wpds_2_tfbarnhdr ,
                                          String AV71Recetasdeacabado03_wpds_5_tfbarser_sel ,
                                          String AV70Recetasdeacabado03_wpds_4_tfbarser ,
                                          String AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel ,
                                          String AV72Recetasdeacabado03_wpds_6_tfbarserdsc ,
                                          short AV74Recetasdeacabado03_wpds_8_tfreclinmaq ,
                                          short AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to ,
                                          String AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel ,
                                          String AV76Recetasdeacabado03_wpds_10_tfmaqcod ,
                                          java.math.BigDecimal AV78Recetasdeacabado03_wpds_12_tfrectotkgs ,
                                          java.math.BigDecimal AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to ,
                                          java.math.BigDecimal AV80Recetasdeacabado03_wpds_14_tfrecfa ,
                                          java.math.BigDecimal AV81Recetasdeacabado03_wpds_15_tfrecfa_to ,
                                          int AV82Recetasdeacabado03_wpds_16_tfrecvolprd ,
                                          int AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to ,
                                          java.util.Date AV84Recetasdeacabado03_wpds_18_tfrecfecalt ,
                                          String AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel ,
                                          String AV85Recetasdeacabado03_wpds_19_tfrecusrcod ,
                                          java.util.Date AV87Recetasdeacabado03_wpds_21_tfrecfecmod ,
                                          String AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel ,
                                          String AV88Recetasdeacabado03_wpds_22_tfrecusrmod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A4259RecTotKgs ,
                                          java.math.BigDecimal A2806RecFA ,
                                          int A2805RecVolPrd ,
                                          String A4402RecUsrCod ,
                                          String A4868RecUsrMod ,
                                          java.util.Date A4866RecFecAlt ,
                                          java.util.Date A4867RecFecMod ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[32];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T1.RecUsrMod, T1.RecFecMod, T1.RecUsrCod, T1.RecFecAlt, T1.RecVolPrd, T1.RecFA, T1.RecTotKgs, T1.MaqCod, T1.RecLinMaq, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV67Recetasdeacabado03_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecTotKgs,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecFA,'990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( UPPER(T1.RecUsrCod) like '%' || UPPER(?)) or ( UPPER(T1.RecUsrMod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
         GXv_int12[1] = (byte)(1) ;
         GXv_int12[2] = (byte)(1) ;
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Recetasdeacabado03_wpds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Recetasdeacabado03_wpds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV70Recetasdeacabado03_wpds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Recetasdeacabado03_wpds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Recetasdeacabado03_wpds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Recetasdeacabado03_wpds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (0==AV74Recetasdeacabado03_wpds_8_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (0==AV75Recetasdeacabado03_wpds_9_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV76Recetasdeacabado03_wpds_10_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Recetasdeacabado03_wpds_11_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Recetasdeacabado03_wpds_12_tfrectotkgs)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs >= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Recetasdeacabado03_wpds_13_tfrectotkgs_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecTotKgs <= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Recetasdeacabado03_wpds_14_tfrecfa)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA >= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Recetasdeacabado03_wpds_15_tfrecfa_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecFA <= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV82Recetasdeacabado03_wpds_16_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV83Recetasdeacabado03_wpds_17_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV84Recetasdeacabado03_wpds_18_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Recetasdeacabado03_wpds_19_tfrecusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Recetasdeacabado03_wpds_20_tfrecusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrCod = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV87Recetasdeacabado03_wpds_21_tfrecfecmod) )
      {
         addWhere(sWhereString, "(T1.RecFecMod >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) && ( ! (GXutil.strcmp("", AV88Recetasdeacabado03_wpds_22_tfrecusrmod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecUsrMod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Recetasdeacabado03_wpds_23_tfrecusrmod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecUsrMod = ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.RecUsrMod" ;
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
                  return conditional_P09BH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] );
            case 1 :
                  return conditional_P09BH3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] );
            case 2 :
                  return conditional_P09BH4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] );
            case 3 :
                  return conditional_P09BH5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] );
            case 4 :
                  return conditional_P09BH6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] );
            case 5 :
                  return conditional_P09BH7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09BH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BH4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BH5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BH6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BH7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((String[]) buf[16])[0] = rslt.getString(13, 16);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((int[]) buf[19])[0] = rslt.getInt(16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[14])[0] = rslt.getString(11, 6);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 26);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((int[]) buf[19])[0] = rslt.getInt(16);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[14])[0] = rslt.getString(11, 6);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 16);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((int[]) buf[19])[0] = rslt.getInt(16);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((String[]) buf[16])[0] = rslt.getString(13, 16);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((int[]) buf[19])[0] = rslt.getInt(16);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((String[]) buf[4])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((String[]) buf[16])[0] = rslt.getString(13, 16);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((int[]) buf[19])[0] = rslt.getInt(16);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[13])[0] = rslt.getString(10, 6);
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 26);
               ((String[]) buf[16])[0] = rslt.getString(13, 16);
               ((String[]) buf[17])[0] = rslt.getString(14, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(15);
               ((int[]) buf[19])[0] = rslt.getInt(16);
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
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[58], false);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[58], false);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[58], false);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[58], false);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[58], false);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[58], false);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[61], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               return;
      }
   }

}

