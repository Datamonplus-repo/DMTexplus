package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetasdeacabado05_wcgetfilterdata extends GXProcedure
{
   public recetasdeacabado05_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdeacabado05_wcgetfilterdata.class ), "" );
   }

   public recetasdeacabado05_wcgetfilterdata( int remoteHandle ,
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
      recetasdeacabado05_wcgetfilterdata.this.aP5 = new String[] {""};
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
      recetasdeacabado05_wcgetfilterdata.this.AV28DDOName = aP0;
      recetasdeacabado05_wcgetfilterdata.this.AV26SearchTxt = aP1;
      recetasdeacabado05_wcgetfilterdata.this.AV27SearchTxtTo = aP2;
      recetasdeacabado05_wcgetfilterdata.this.aP3 = aP3;
      recetasdeacabado05_wcgetfilterdata.this.aP4 = aP4;
      recetasdeacabado05_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_MAQCOD") == 0 )
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
      AV32OptionsJson = AV31Options.toJSonString(false) ;
      AV35OptionsDescJson = AV34OptionsDesc.toJSonString(false) ;
      AV37OptionIndexesJson = AV36OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV39Session.getValue("RecetasdeAcabado05_WCGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetasdeAcabado05_WCGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("RecetasdeAcabado05_WCGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV12TFRecLinMaq = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFRecLinMaq_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV14TFBarSit = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFBarSit_To = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV16TFBarSer = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV17TFBarSer_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV18TFBarSerDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV19TFBarSerDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV20TFMaqCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV21TFMaqCod_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV22TFRecVolPrd = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFRecVolPrd_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV24TFRecFecAlt = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV45Emprcod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV46Barcod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV47Barcodreo = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV48Barcodpar = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV26SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV54Recetasdeacabado05_wcds_1_filterfulltext = AV44FilterFullText ;
      AV55Recetasdeacabado05_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV57Recetasdeacabado05_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV59Recetasdeacabado05_wcds_6_tfbarsit = AV14TFBarSit ;
      AV60Recetasdeacabado05_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV61Recetasdeacabado05_wcds_8_tfbarser = AV16TFBarSer ;
      AV62Recetasdeacabado05_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV63Recetasdeacabado05_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV65Recetasdeacabado05_wcds_12_tfmaqcod = AV20TFMaqCod ;
      AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel = AV21TFMaqCod_Sel ;
      AV67Recetasdeacabado05_wcds_14_tfrecvolprd = AV22TFRecVolPrd ;
      AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to = AV23TFRecVolPrd_To ;
      AV69Recetasdeacabado05_wcds_16_tfrecfecalt = AV24TFRecFecAlt ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV54Recetasdeacabado05_wcds_1_filterfulltext ,
                                           AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel ,
                                           AV55Recetasdeacabado05_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV57Recetasdeacabado05_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV59Recetasdeacabado05_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV60Recetasdeacabado05_wcds_7_tfbarsit_to) ,
                                           AV62Recetasdeacabado05_wcds_9_tfbarser_sel ,
                                           AV61Recetasdeacabado05_wcds_8_tfbarser ,
                                           AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel ,
                                           AV63Recetasdeacabado05_wcds_10_tfbarserdsc ,
                                           AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel ,
                                           AV65Recetasdeacabado05_wcds_12_tfmaqcod ,
                                           Integer.valueOf(AV67Recetasdeacabado05_wcds_14_tfrecvolprd) ,
                                           Integer.valueOf(AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to) ,
                                           AV69Recetasdeacabado05_wcds_16_tfrecfecalt ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Integer.valueOf(AV46Barcod) ,
                                           Byte.valueOf(AV47Barcodreo) ,
                                           AV48Barcodpar ,
                                           A6039RecAcab ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV55Recetasdeacabado05_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV55Recetasdeacabado05_wcds_2_tfbarnhdr), 11, "%") ;
      lV61Recetasdeacabado05_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV61Recetasdeacabado05_wcds_8_tfbarser), 16, "%") ;
      lV63Recetasdeacabado05_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Recetasdeacabado05_wcds_10_tfbarserdsc), 26, "%") ;
      lV65Recetasdeacabado05_wcds_12_tfmaqcod = GXutil.padr( GXutil.rtrim( AV65Recetasdeacabado05_wcds_12_tfmaqcod), 6, "%") ;
      /* Using cursor P09BO2 */
      pr_default.execute(0, new Object[] {AV45Emprcod, Integer.valueOf(AV46Barcod), Integer.valueOf(AV46Barcod), Byte.valueOf(AV47Barcodreo), Byte.valueOf(AV47Barcodreo), AV48Barcodpar, AV48Barcodpar, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV55Recetasdeacabado05_wcds_2_tfbarnhdr, AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel, Short.valueOf(AV57Recetasdeacabado05_wcds_4_tfreclinmaq), Short.valueOf(AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to), Byte.valueOf(AV59Recetasdeacabado05_wcds_6_tfbarsit), Byte.valueOf(AV60Recetasdeacabado05_wcds_7_tfbarsit_to), lV61Recetasdeacabado05_wcds_8_tfbarser, AV62Recetasdeacabado05_wcds_9_tfbarser_sel, lV63Recetasdeacabado05_wcds_10_tfbarserdsc, AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel, lV65Recetasdeacabado05_wcds_12_tfmaqcod, AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel, Integer.valueOf(AV67Recetasdeacabado05_wcds_14_tfrecvolprd), Integer.valueOf(AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to), AV69Recetasdeacabado05_wcds_16_tfrecfecalt});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P09BO2_A6039RecAcab[0] ;
         n6039RecAcab = P09BO2_n6039RecAcab[0] ;
         A396EmprCod = P09BO2_A396EmprCod[0] ;
         A4866RecFecAlt = P09BO2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BO2_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BO2_A2805RecVolPrd[0] ;
         A602MaqCod = P09BO2_A602MaqCod[0] ;
         A1652BarSerDsc = P09BO2_A1652BarSerDsc[0] ;
         A212BarSer = P09BO2_A212BarSer[0] ;
         A213BarSit = P09BO2_A213BarSit[0] ;
         A2804RecLinMaq = P09BO2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09BO2_A130BarCodPar[0] ;
         A132BarCodReo = P09BO2_A132BarCodReo[0] ;
         A129BarCod = P09BO2_A129BarCod[0] ;
         A1652BarSerDsc = P09BO2_A1652BarSerDsc[0] ;
         A212BarSer = P09BO2_A212BarSer[0] ;
         A213BarSit = P09BO2_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV30Option = A13696BarNHdr ;
            AV29InsertIndex = 1 ;
            while ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) < 0 ) )
            {
               AV29InsertIndex = (int)(AV29InsertIndex+1) ;
            }
            if ( ( AV29InsertIndex <= AV31Options.size() ) && ( GXutil.strcmp((String)AV31Options.elementAt(-1+AV29InsertIndex), AV30Option) == 0 ) )
            {
               AV38count = GXutil.lval( (String)AV36OptionIndexes.elementAt(-1+AV29InsertIndex)) ;
               AV38count = (long)(AV38count+1) ;
               AV36OptionIndexes.removeItem(AV29InsertIndex);
               AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), AV29InsertIndex);
            }
            else
            {
               AV31Options.add(AV30Option, AV29InsertIndex);
               AV36OptionIndexes.add("1", AV29InsertIndex);
            }
         }
         if ( AV31Options.size() == 50 )
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
      AV16TFBarSer = AV26SearchTxt ;
      AV17TFBarSer_Sel = "" ;
      AV54Recetasdeacabado05_wcds_1_filterfulltext = AV44FilterFullText ;
      AV55Recetasdeacabado05_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV57Recetasdeacabado05_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV59Recetasdeacabado05_wcds_6_tfbarsit = AV14TFBarSit ;
      AV60Recetasdeacabado05_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV61Recetasdeacabado05_wcds_8_tfbarser = AV16TFBarSer ;
      AV62Recetasdeacabado05_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV63Recetasdeacabado05_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV65Recetasdeacabado05_wcds_12_tfmaqcod = AV20TFMaqCod ;
      AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel = AV21TFMaqCod_Sel ;
      AV67Recetasdeacabado05_wcds_14_tfrecvolprd = AV22TFRecVolPrd ;
      AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to = AV23TFRecVolPrd_To ;
      AV69Recetasdeacabado05_wcds_16_tfrecfecalt = AV24TFRecFecAlt ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV54Recetasdeacabado05_wcds_1_filterfulltext ,
                                           AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel ,
                                           AV55Recetasdeacabado05_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV57Recetasdeacabado05_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV59Recetasdeacabado05_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV60Recetasdeacabado05_wcds_7_tfbarsit_to) ,
                                           AV62Recetasdeacabado05_wcds_9_tfbarser_sel ,
                                           AV61Recetasdeacabado05_wcds_8_tfbarser ,
                                           AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel ,
                                           AV63Recetasdeacabado05_wcds_10_tfbarserdsc ,
                                           AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel ,
                                           AV65Recetasdeacabado05_wcds_12_tfmaqcod ,
                                           Integer.valueOf(AV67Recetasdeacabado05_wcds_14_tfrecvolprd) ,
                                           Integer.valueOf(AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to) ,
                                           AV69Recetasdeacabado05_wcds_16_tfrecfecalt ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Integer.valueOf(AV46Barcod) ,
                                           Byte.valueOf(AV47Barcodreo) ,
                                           AV48Barcodpar ,
                                           A396EmprCod ,
                                           AV45Emprcod ,
                                           A6039RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV55Recetasdeacabado05_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV55Recetasdeacabado05_wcds_2_tfbarnhdr), 11, "%") ;
      lV61Recetasdeacabado05_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV61Recetasdeacabado05_wcds_8_tfbarser), 16, "%") ;
      lV63Recetasdeacabado05_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Recetasdeacabado05_wcds_10_tfbarserdsc), 26, "%") ;
      lV65Recetasdeacabado05_wcds_12_tfmaqcod = GXutil.padr( GXutil.rtrim( AV65Recetasdeacabado05_wcds_12_tfmaqcod), 6, "%") ;
      /* Using cursor P09BO3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV46Barcod), Integer.valueOf(AV46Barcod), Byte.valueOf(AV47Barcodreo), Byte.valueOf(AV47Barcodreo), AV48Barcodpar, AV48Barcodpar, AV45Emprcod, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV55Recetasdeacabado05_wcds_2_tfbarnhdr, AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel, Short.valueOf(AV57Recetasdeacabado05_wcds_4_tfreclinmaq), Short.valueOf(AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to), Byte.valueOf(AV59Recetasdeacabado05_wcds_6_tfbarsit), Byte.valueOf(AV60Recetasdeacabado05_wcds_7_tfbarsit_to), lV61Recetasdeacabado05_wcds_8_tfbarser, AV62Recetasdeacabado05_wcds_9_tfbarser_sel, lV63Recetasdeacabado05_wcds_10_tfbarserdsc, AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel, lV65Recetasdeacabado05_wcds_12_tfmaqcod, AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel, Integer.valueOf(AV67Recetasdeacabado05_wcds_14_tfrecvolprd), Integer.valueOf(AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to), AV69Recetasdeacabado05_wcds_16_tfrecfecalt});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9BO3 = false ;
         A396EmprCod = P09BO3_A396EmprCod[0] ;
         A6039RecAcab = P09BO3_A6039RecAcab[0] ;
         n6039RecAcab = P09BO3_n6039RecAcab[0] ;
         A212BarSer = P09BO3_A212BarSer[0] ;
         A4866RecFecAlt = P09BO3_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BO3_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BO3_A2805RecVolPrd[0] ;
         A602MaqCod = P09BO3_A602MaqCod[0] ;
         A1652BarSerDsc = P09BO3_A1652BarSerDsc[0] ;
         A213BarSit = P09BO3_A213BarSit[0] ;
         A2804RecLinMaq = P09BO3_A2804RecLinMaq[0] ;
         A130BarCodPar = P09BO3_A130BarCodPar[0] ;
         A132BarCodReo = P09BO3_A132BarCodReo[0] ;
         A129BarCod = P09BO3_A129BarCod[0] ;
         A212BarSer = P09BO3_A212BarSer[0] ;
         A1652BarSerDsc = P09BO3_A1652BarSerDsc[0] ;
         A213BarSit = P09BO3_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09BO3_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk9BO3 = false ;
            A396EmprCod = P09BO3_A396EmprCod[0] ;
            A2804RecLinMaq = P09BO3_A2804RecLinMaq[0] ;
            A130BarCodPar = P09BO3_A130BarCodPar[0] ;
            A132BarCodReo = P09BO3_A132BarCodReo[0] ;
            A129BarCod = P09BO3_A129BarCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9BO3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV30Option = A212BarSer ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BO3 )
         {
            brk9BO3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarSerDsc = AV26SearchTxt ;
      AV19TFBarSerDsc_Sel = "" ;
      AV54Recetasdeacabado05_wcds_1_filterfulltext = AV44FilterFullText ;
      AV55Recetasdeacabado05_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV57Recetasdeacabado05_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV59Recetasdeacabado05_wcds_6_tfbarsit = AV14TFBarSit ;
      AV60Recetasdeacabado05_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV61Recetasdeacabado05_wcds_8_tfbarser = AV16TFBarSer ;
      AV62Recetasdeacabado05_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV63Recetasdeacabado05_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV65Recetasdeacabado05_wcds_12_tfmaqcod = AV20TFMaqCod ;
      AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel = AV21TFMaqCod_Sel ;
      AV67Recetasdeacabado05_wcds_14_tfrecvolprd = AV22TFRecVolPrd ;
      AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to = AV23TFRecVolPrd_To ;
      AV69Recetasdeacabado05_wcds_16_tfrecfecalt = AV24TFRecFecAlt ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV54Recetasdeacabado05_wcds_1_filterfulltext ,
                                           AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel ,
                                           AV55Recetasdeacabado05_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV57Recetasdeacabado05_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV59Recetasdeacabado05_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV60Recetasdeacabado05_wcds_7_tfbarsit_to) ,
                                           AV62Recetasdeacabado05_wcds_9_tfbarser_sel ,
                                           AV61Recetasdeacabado05_wcds_8_tfbarser ,
                                           AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel ,
                                           AV63Recetasdeacabado05_wcds_10_tfbarserdsc ,
                                           AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel ,
                                           AV65Recetasdeacabado05_wcds_12_tfmaqcod ,
                                           Integer.valueOf(AV67Recetasdeacabado05_wcds_14_tfrecvolprd) ,
                                           Integer.valueOf(AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to) ,
                                           AV69Recetasdeacabado05_wcds_16_tfrecfecalt ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Integer.valueOf(AV46Barcod) ,
                                           Byte.valueOf(AV47Barcodreo) ,
                                           AV48Barcodpar ,
                                           A396EmprCod ,
                                           AV45Emprcod ,
                                           A6039RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV55Recetasdeacabado05_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV55Recetasdeacabado05_wcds_2_tfbarnhdr), 11, "%") ;
      lV61Recetasdeacabado05_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV61Recetasdeacabado05_wcds_8_tfbarser), 16, "%") ;
      lV63Recetasdeacabado05_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Recetasdeacabado05_wcds_10_tfbarserdsc), 26, "%") ;
      lV65Recetasdeacabado05_wcds_12_tfmaqcod = GXutil.padr( GXutil.rtrim( AV65Recetasdeacabado05_wcds_12_tfmaqcod), 6, "%") ;
      /* Using cursor P09BO4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV46Barcod), Integer.valueOf(AV46Barcod), Byte.valueOf(AV47Barcodreo), Byte.valueOf(AV47Barcodreo), AV48Barcodpar, AV48Barcodpar, AV45Emprcod, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV55Recetasdeacabado05_wcds_2_tfbarnhdr, AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel, Short.valueOf(AV57Recetasdeacabado05_wcds_4_tfreclinmaq), Short.valueOf(AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to), Byte.valueOf(AV59Recetasdeacabado05_wcds_6_tfbarsit), Byte.valueOf(AV60Recetasdeacabado05_wcds_7_tfbarsit_to), lV61Recetasdeacabado05_wcds_8_tfbarser, AV62Recetasdeacabado05_wcds_9_tfbarser_sel, lV63Recetasdeacabado05_wcds_10_tfbarserdsc, AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel, lV65Recetasdeacabado05_wcds_12_tfmaqcod, AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel, Integer.valueOf(AV67Recetasdeacabado05_wcds_14_tfrecvolprd), Integer.valueOf(AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to), AV69Recetasdeacabado05_wcds_16_tfrecfecalt});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9BO5 = false ;
         A396EmprCod = P09BO4_A396EmprCod[0] ;
         A6039RecAcab = P09BO4_A6039RecAcab[0] ;
         n6039RecAcab = P09BO4_n6039RecAcab[0] ;
         A1652BarSerDsc = P09BO4_A1652BarSerDsc[0] ;
         A4866RecFecAlt = P09BO4_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BO4_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BO4_A2805RecVolPrd[0] ;
         A602MaqCod = P09BO4_A602MaqCod[0] ;
         A212BarSer = P09BO4_A212BarSer[0] ;
         A213BarSit = P09BO4_A213BarSit[0] ;
         A2804RecLinMaq = P09BO4_A2804RecLinMaq[0] ;
         A130BarCodPar = P09BO4_A130BarCodPar[0] ;
         A132BarCodReo = P09BO4_A132BarCodReo[0] ;
         A129BarCod = P09BO4_A129BarCod[0] ;
         A1652BarSerDsc = P09BO4_A1652BarSerDsc[0] ;
         A212BarSer = P09BO4_A212BarSer[0] ;
         A213BarSit = P09BO4_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09BO4_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk9BO5 = false ;
            A396EmprCod = P09BO4_A396EmprCod[0] ;
            A2804RecLinMaq = P09BO4_A2804RecLinMaq[0] ;
            A130BarCodPar = P09BO4_A130BarCodPar[0] ;
            A132BarCodReo = P09BO4_A132BarCodReo[0] ;
            A129BarCod = P09BO4_A129BarCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9BO5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV30Option = A1652BarSerDsc ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BO5 )
         {
            brk9BO5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV20TFMaqCod = AV26SearchTxt ;
      AV21TFMaqCod_Sel = "" ;
      AV54Recetasdeacabado05_wcds_1_filterfulltext = AV44FilterFullText ;
      AV55Recetasdeacabado05_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV57Recetasdeacabado05_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV59Recetasdeacabado05_wcds_6_tfbarsit = AV14TFBarSit ;
      AV60Recetasdeacabado05_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV61Recetasdeacabado05_wcds_8_tfbarser = AV16TFBarSer ;
      AV62Recetasdeacabado05_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV63Recetasdeacabado05_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV65Recetasdeacabado05_wcds_12_tfmaqcod = AV20TFMaqCod ;
      AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel = AV21TFMaqCod_Sel ;
      AV67Recetasdeacabado05_wcds_14_tfrecvolprd = AV22TFRecVolPrd ;
      AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to = AV23TFRecVolPrd_To ;
      AV69Recetasdeacabado05_wcds_16_tfrecfecalt = AV24TFRecFecAlt ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV54Recetasdeacabado05_wcds_1_filterfulltext ,
                                           AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel ,
                                           AV55Recetasdeacabado05_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV57Recetasdeacabado05_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV59Recetasdeacabado05_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV60Recetasdeacabado05_wcds_7_tfbarsit_to) ,
                                           AV62Recetasdeacabado05_wcds_9_tfbarser_sel ,
                                           AV61Recetasdeacabado05_wcds_8_tfbarser ,
                                           AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel ,
                                           AV63Recetasdeacabado05_wcds_10_tfbarserdsc ,
                                           AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel ,
                                           AV65Recetasdeacabado05_wcds_12_tfmaqcod ,
                                           Integer.valueOf(AV67Recetasdeacabado05_wcds_14_tfrecvolprd) ,
                                           Integer.valueOf(AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to) ,
                                           AV69Recetasdeacabado05_wcds_16_tfrecfecalt ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Integer.valueOf(AV46Barcod) ,
                                           Byte.valueOf(AV47Barcodreo) ,
                                           AV48Barcodpar ,
                                           A6039RecAcab ,
                                           AV45Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV54Recetasdeacabado05_wcds_1_filterfulltext), "%", "") ;
      lV55Recetasdeacabado05_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV55Recetasdeacabado05_wcds_2_tfbarnhdr), 11, "%") ;
      lV61Recetasdeacabado05_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV61Recetasdeacabado05_wcds_8_tfbarser), 16, "%") ;
      lV63Recetasdeacabado05_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Recetasdeacabado05_wcds_10_tfbarserdsc), 26, "%") ;
      lV65Recetasdeacabado05_wcds_12_tfmaqcod = GXutil.padr( GXutil.rtrim( AV65Recetasdeacabado05_wcds_12_tfmaqcod), 6, "%") ;
      /* Using cursor P09BO5 */
      pr_default.execute(3, new Object[] {AV45Emprcod, Integer.valueOf(AV46Barcod), Integer.valueOf(AV46Barcod), Byte.valueOf(AV47Barcodreo), Byte.valueOf(AV47Barcodreo), AV48Barcodpar, AV48Barcodpar, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV54Recetasdeacabado05_wcds_1_filterfulltext, lV55Recetasdeacabado05_wcds_2_tfbarnhdr, AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel, Short.valueOf(AV57Recetasdeacabado05_wcds_4_tfreclinmaq), Short.valueOf(AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to), Byte.valueOf(AV59Recetasdeacabado05_wcds_6_tfbarsit), Byte.valueOf(AV60Recetasdeacabado05_wcds_7_tfbarsit_to), lV61Recetasdeacabado05_wcds_8_tfbarser, AV62Recetasdeacabado05_wcds_9_tfbarser_sel, lV63Recetasdeacabado05_wcds_10_tfbarserdsc, AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel, lV65Recetasdeacabado05_wcds_12_tfmaqcod, AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel, Integer.valueOf(AV67Recetasdeacabado05_wcds_14_tfrecvolprd), Integer.valueOf(AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to), AV69Recetasdeacabado05_wcds_16_tfrecfecalt});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9BO7 = false ;
         A396EmprCod = P09BO5_A396EmprCod[0] ;
         A602MaqCod = P09BO5_A602MaqCod[0] ;
         A6039RecAcab = P09BO5_A6039RecAcab[0] ;
         n6039RecAcab = P09BO5_n6039RecAcab[0] ;
         A4866RecFecAlt = P09BO5_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09BO5_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09BO5_A2805RecVolPrd[0] ;
         A1652BarSerDsc = P09BO5_A1652BarSerDsc[0] ;
         A212BarSer = P09BO5_A212BarSer[0] ;
         A213BarSit = P09BO5_A213BarSit[0] ;
         A2804RecLinMaq = P09BO5_A2804RecLinMaq[0] ;
         A130BarCodPar = P09BO5_A130BarCodPar[0] ;
         A132BarCodReo = P09BO5_A132BarCodReo[0] ;
         A129BarCod = P09BO5_A129BarCod[0] ;
         A1652BarSerDsc = P09BO5_A1652BarSerDsc[0] ;
         A212BarSer = P09BO5_A212BarSer[0] ;
         A213BarSit = P09BO5_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09BO5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09BO5_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk9BO7 = false ;
            A2804RecLinMaq = P09BO5_A2804RecLinMaq[0] ;
            A130BarCodPar = P09BO5_A130BarCodPar[0] ;
            A132BarCodReo = P09BO5_A132BarCodReo[0] ;
            A129BarCod = P09BO5_A129BarCod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9BO7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV30Option = A602MaqCod ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BO7 )
         {
            brk9BO7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetasdeacabado05_wcgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = recetasdeacabado05_wcgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = recetasdeacabado05_wcgetfilterdata.this.AV37OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32OptionsJson = "" ;
      AV35OptionsDescJson = "" ;
      AV37OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV39Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44FilterFullText = "" ;
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV16TFBarSer = "" ;
      AV17TFBarSer_Sel = "" ;
      AV18TFBarSerDsc = "" ;
      AV19TFBarSerDsc_Sel = "" ;
      AV20TFMaqCod = "" ;
      AV21TFMaqCod_Sel = "" ;
      AV24TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV45Emprcod = "" ;
      AV48Barcodpar = "" ;
      A13696BarNHdr = "" ;
      AV54Recetasdeacabado05_wcds_1_filterfulltext = "" ;
      AV55Recetasdeacabado05_wcds_2_tfbarnhdr = "" ;
      AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel = "" ;
      AV61Recetasdeacabado05_wcds_8_tfbarser = "" ;
      AV62Recetasdeacabado05_wcds_9_tfbarser_sel = "" ;
      AV63Recetasdeacabado05_wcds_10_tfbarserdsc = "" ;
      AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel = "" ;
      AV65Recetasdeacabado05_wcds_12_tfmaqcod = "" ;
      AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel = "" ;
      AV69Recetasdeacabado05_wcds_16_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV54Recetasdeacabado05_wcds_1_filterfulltext = "" ;
      lV55Recetasdeacabado05_wcds_2_tfbarnhdr = "" ;
      lV61Recetasdeacabado05_wcds_8_tfbarser = "" ;
      lV63Recetasdeacabado05_wcds_10_tfbarserdsc = "" ;
      lV65Recetasdeacabado05_wcds_12_tfmaqcod = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A602MaqCod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A6039RecAcab = "" ;
      A396EmprCod = "" ;
      P09BO2_A6039RecAcab = new String[] {""} ;
      P09BO2_n6039RecAcab = new boolean[] {false} ;
      P09BO2_A396EmprCod = new String[] {""} ;
      P09BO2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BO2_n4866RecFecAlt = new boolean[] {false} ;
      P09BO2_A2805RecVolPrd = new int[1] ;
      P09BO2_A602MaqCod = new String[] {""} ;
      P09BO2_A1652BarSerDsc = new String[] {""} ;
      P09BO2_A212BarSer = new String[] {""} ;
      P09BO2_A213BarSit = new byte[1] ;
      P09BO2_A2804RecLinMaq = new short[1] ;
      P09BO2_A130BarCodPar = new String[] {""} ;
      P09BO2_A132BarCodReo = new byte[1] ;
      P09BO2_A129BarCod = new int[1] ;
      AV30Option = "" ;
      P09BO3_A396EmprCod = new String[] {""} ;
      P09BO3_A6039RecAcab = new String[] {""} ;
      P09BO3_n6039RecAcab = new boolean[] {false} ;
      P09BO3_A212BarSer = new String[] {""} ;
      P09BO3_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BO3_n4866RecFecAlt = new boolean[] {false} ;
      P09BO3_A2805RecVolPrd = new int[1] ;
      P09BO3_A602MaqCod = new String[] {""} ;
      P09BO3_A1652BarSerDsc = new String[] {""} ;
      P09BO3_A213BarSit = new byte[1] ;
      P09BO3_A2804RecLinMaq = new short[1] ;
      P09BO3_A130BarCodPar = new String[] {""} ;
      P09BO3_A132BarCodReo = new byte[1] ;
      P09BO3_A129BarCod = new int[1] ;
      P09BO4_A396EmprCod = new String[] {""} ;
      P09BO4_A6039RecAcab = new String[] {""} ;
      P09BO4_n6039RecAcab = new boolean[] {false} ;
      P09BO4_A1652BarSerDsc = new String[] {""} ;
      P09BO4_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BO4_n4866RecFecAlt = new boolean[] {false} ;
      P09BO4_A2805RecVolPrd = new int[1] ;
      P09BO4_A602MaqCod = new String[] {""} ;
      P09BO4_A212BarSer = new String[] {""} ;
      P09BO4_A213BarSit = new byte[1] ;
      P09BO4_A2804RecLinMaq = new short[1] ;
      P09BO4_A130BarCodPar = new String[] {""} ;
      P09BO4_A132BarCodReo = new byte[1] ;
      P09BO4_A129BarCod = new int[1] ;
      P09BO5_A396EmprCod = new String[] {""} ;
      P09BO5_A602MaqCod = new String[] {""} ;
      P09BO5_A6039RecAcab = new String[] {""} ;
      P09BO5_n6039RecAcab = new boolean[] {false} ;
      P09BO5_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09BO5_n4866RecFecAlt = new boolean[] {false} ;
      P09BO5_A2805RecVolPrd = new int[1] ;
      P09BO5_A1652BarSerDsc = new String[] {""} ;
      P09BO5_A212BarSer = new String[] {""} ;
      P09BO5_A213BarSit = new byte[1] ;
      P09BO5_A2804RecLinMaq = new short[1] ;
      P09BO5_A130BarCodPar = new String[] {""} ;
      P09BO5_A132BarCodReo = new byte[1] ;
      P09BO5_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado05_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09BO2_A6039RecAcab, P09BO2_n6039RecAcab, P09BO2_A396EmprCod, P09BO2_A4866RecFecAlt, P09BO2_n4866RecFecAlt, P09BO2_A2805RecVolPrd, P09BO2_A602MaqCod, P09BO2_A1652BarSerDsc, P09BO2_A212BarSer, P09BO2_A213BarSit,
            P09BO2_A2804RecLinMaq, P09BO2_A130BarCodPar, P09BO2_A132BarCodReo, P09BO2_A129BarCod
            }
            , new Object[] {
            P09BO3_A396EmprCod, P09BO3_A6039RecAcab, P09BO3_n6039RecAcab, P09BO3_A212BarSer, P09BO3_A4866RecFecAlt, P09BO3_n4866RecFecAlt, P09BO3_A2805RecVolPrd, P09BO3_A602MaqCod, P09BO3_A1652BarSerDsc, P09BO3_A213BarSit,
            P09BO3_A2804RecLinMaq, P09BO3_A130BarCodPar, P09BO3_A132BarCodReo, P09BO3_A129BarCod
            }
            , new Object[] {
            P09BO4_A396EmprCod, P09BO4_A6039RecAcab, P09BO4_n6039RecAcab, P09BO4_A1652BarSerDsc, P09BO4_A4866RecFecAlt, P09BO4_n4866RecFecAlt, P09BO4_A2805RecVolPrd, P09BO4_A602MaqCod, P09BO4_A212BarSer, P09BO4_A213BarSit,
            P09BO4_A2804RecLinMaq, P09BO4_A130BarCodPar, P09BO4_A132BarCodReo, P09BO4_A129BarCod
            }
            , new Object[] {
            P09BO5_A396EmprCod, P09BO5_A602MaqCod, P09BO5_A6039RecAcab, P09BO5_n6039RecAcab, P09BO5_A4866RecFecAlt, P09BO5_n4866RecFecAlt, P09BO5_A2805RecVolPrd, P09BO5_A1652BarSerDsc, P09BO5_A212BarSer, P09BO5_A213BarSit,
            P09BO5_A2804RecLinMaq, P09BO5_A130BarCodPar, P09BO5_A132BarCodReo, P09BO5_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFBarSit ;
   private byte AV15TFBarSit_To ;
   private byte AV47Barcodreo ;
   private byte AV59Recetasdeacabado05_wcds_6_tfbarsit ;
   private byte AV60Recetasdeacabado05_wcds_7_tfbarsit_to ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short AV12TFRecLinMaq ;
   private short AV13TFRecLinMaq_To ;
   private short AV57Recetasdeacabado05_wcds_4_tfreclinmaq ;
   private short AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV52GXV1 ;
   private int AV22TFRecVolPrd ;
   private int AV23TFRecVolPrd_To ;
   private int AV46Barcod ;
   private int AV67Recetasdeacabado05_wcds_14_tfrecvolprd ;
   private int AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int AV29InsertIndex ;
   private long AV38count ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV16TFBarSer ;
   private String AV17TFBarSer_Sel ;
   private String AV18TFBarSerDsc ;
   private String AV19TFBarSerDsc_Sel ;
   private String AV20TFMaqCod ;
   private String AV21TFMaqCod_Sel ;
   private String AV45Emprcod ;
   private String AV48Barcodpar ;
   private String A13696BarNHdr ;
   private String AV55Recetasdeacabado05_wcds_2_tfbarnhdr ;
   private String AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel ;
   private String AV61Recetasdeacabado05_wcds_8_tfbarser ;
   private String AV62Recetasdeacabado05_wcds_9_tfbarser_sel ;
   private String AV63Recetasdeacabado05_wcds_10_tfbarserdsc ;
   private String AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel ;
   private String AV65Recetasdeacabado05_wcds_12_tfmaqcod ;
   private String AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel ;
   private String scmdbuf ;
   private String lV55Recetasdeacabado05_wcds_2_tfbarnhdr ;
   private String lV61Recetasdeacabado05_wcds_8_tfbarser ;
   private String lV63Recetasdeacabado05_wcds_10_tfbarserdsc ;
   private String lV65Recetasdeacabado05_wcds_12_tfmaqcod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A602MaqCod ;
   private String A6039RecAcab ;
   private String A396EmprCod ;
   private java.util.Date AV24TFRecFecAlt ;
   private java.util.Date AV69Recetasdeacabado05_wcds_16_tfrecfecalt ;
   private java.util.Date A4866RecFecAlt ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private boolean n4866RecFecAlt ;
   private boolean brk9BO3 ;
   private boolean brk9BO5 ;
   private boolean brk9BO7 ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV54Recetasdeacabado05_wcds_1_filterfulltext ;
   private String lV54Recetasdeacabado05_wcds_1_filterfulltext ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09BO2_A6039RecAcab ;
   private boolean[] P09BO2_n6039RecAcab ;
   private String[] P09BO2_A396EmprCod ;
   private java.util.Date[] P09BO2_A4866RecFecAlt ;
   private boolean[] P09BO2_n4866RecFecAlt ;
   private int[] P09BO2_A2805RecVolPrd ;
   private String[] P09BO2_A602MaqCod ;
   private String[] P09BO2_A1652BarSerDsc ;
   private String[] P09BO2_A212BarSer ;
   private byte[] P09BO2_A213BarSit ;
   private short[] P09BO2_A2804RecLinMaq ;
   private String[] P09BO2_A130BarCodPar ;
   private byte[] P09BO2_A132BarCodReo ;
   private int[] P09BO2_A129BarCod ;
   private String[] P09BO3_A396EmprCod ;
   private String[] P09BO3_A6039RecAcab ;
   private boolean[] P09BO3_n6039RecAcab ;
   private String[] P09BO3_A212BarSer ;
   private java.util.Date[] P09BO3_A4866RecFecAlt ;
   private boolean[] P09BO3_n4866RecFecAlt ;
   private int[] P09BO3_A2805RecVolPrd ;
   private String[] P09BO3_A602MaqCod ;
   private String[] P09BO3_A1652BarSerDsc ;
   private byte[] P09BO3_A213BarSit ;
   private short[] P09BO3_A2804RecLinMaq ;
   private String[] P09BO3_A130BarCodPar ;
   private byte[] P09BO3_A132BarCodReo ;
   private int[] P09BO3_A129BarCod ;
   private String[] P09BO4_A396EmprCod ;
   private String[] P09BO4_A6039RecAcab ;
   private boolean[] P09BO4_n6039RecAcab ;
   private String[] P09BO4_A1652BarSerDsc ;
   private java.util.Date[] P09BO4_A4866RecFecAlt ;
   private boolean[] P09BO4_n4866RecFecAlt ;
   private int[] P09BO4_A2805RecVolPrd ;
   private String[] P09BO4_A602MaqCod ;
   private String[] P09BO4_A212BarSer ;
   private byte[] P09BO4_A213BarSit ;
   private short[] P09BO4_A2804RecLinMaq ;
   private String[] P09BO4_A130BarCodPar ;
   private byte[] P09BO4_A132BarCodReo ;
   private int[] P09BO4_A129BarCod ;
   private String[] P09BO5_A396EmprCod ;
   private String[] P09BO5_A602MaqCod ;
   private String[] P09BO5_A6039RecAcab ;
   private boolean[] P09BO5_n6039RecAcab ;
   private java.util.Date[] P09BO5_A4866RecFecAlt ;
   private boolean[] P09BO5_n4866RecFecAlt ;
   private int[] P09BO5_A2805RecVolPrd ;
   private String[] P09BO5_A1652BarSerDsc ;
   private String[] P09BO5_A212BarSer ;
   private byte[] P09BO5_A213BarSit ;
   private short[] P09BO5_A2804RecLinMaq ;
   private String[] P09BO5_A130BarCodPar ;
   private byte[] P09BO5_A132BarCodReo ;
   private int[] P09BO5_A129BarCod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class recetasdeacabado05_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09BO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Recetasdeacabado05_wcds_1_filterfulltext ,
                                          String AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel ,
                                          String AV55Recetasdeacabado05_wcds_2_tfbarnhdr ,
                                          short AV57Recetasdeacabado05_wcds_4_tfreclinmaq ,
                                          short AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to ,
                                          byte AV59Recetasdeacabado05_wcds_6_tfbarsit ,
                                          byte AV60Recetasdeacabado05_wcds_7_tfbarsit_to ,
                                          String AV62Recetasdeacabado05_wcds_9_tfbarser_sel ,
                                          String AV61Recetasdeacabado05_wcds_8_tfbarser ,
                                          String AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel ,
                                          String AV63Recetasdeacabado05_wcds_10_tfbarserdsc ,
                                          String AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel ,
                                          String AV65Recetasdeacabado05_wcds_12_tfmaqcod ,
                                          int AV67Recetasdeacabado05_wcds_14_tfrecvolprd ,
                                          int AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to ,
                                          java.util.Date AV69Recetasdeacabado05_wcds_16_tfrecfecalt ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.util.Date A4866RecFecAlt ,
                                          int AV46Barcod ,
                                          byte AV47Barcodreo ,
                                          String AV48Barcodpar ,
                                          String A6039RecAcab ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[29];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.RecAcab, T1.EmprCod, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarSerDsc, T2.BarSer, T2.BarSit, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM" ;
      scmdbuf += " (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV54Recetasdeacabado05_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Recetasdeacabado05_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV57Recetasdeacabado05_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV59Recetasdeacabado05_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV60Recetasdeacabado05_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recetasdeacabado05_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Recetasdeacabado05_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recetasdeacabado05_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Recetasdeacabado05_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Recetasdeacabado05_wcds_12_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetasdeacabado05_wcds_14_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Recetasdeacabado05_wcds_16_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09BO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Recetasdeacabado05_wcds_1_filterfulltext ,
                                          String AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel ,
                                          String AV55Recetasdeacabado05_wcds_2_tfbarnhdr ,
                                          short AV57Recetasdeacabado05_wcds_4_tfreclinmaq ,
                                          short AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to ,
                                          byte AV59Recetasdeacabado05_wcds_6_tfbarsit ,
                                          byte AV60Recetasdeacabado05_wcds_7_tfbarsit_to ,
                                          String AV62Recetasdeacabado05_wcds_9_tfbarser_sel ,
                                          String AV61Recetasdeacabado05_wcds_8_tfbarser ,
                                          String AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel ,
                                          String AV63Recetasdeacabado05_wcds_10_tfbarserdsc ,
                                          String AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel ,
                                          String AV65Recetasdeacabado05_wcds_12_tfmaqcod ,
                                          int AV67Recetasdeacabado05_wcds_14_tfrecvolprd ,
                                          int AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to ,
                                          java.util.Date AV69Recetasdeacabado05_wcds_16_tfrecfecalt ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.util.Date A4866RecFecAlt ,
                                          int AV46Barcod ,
                                          byte AV47Barcodreo ,
                                          String AV48Barcodpar ,
                                          String A396EmprCod ,
                                          String AV45Emprcod ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[29];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarSer, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarSerDsc, T2.BarSit, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM" ;
      scmdbuf += " (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV54Recetasdeacabado05_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Recetasdeacabado05_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV57Recetasdeacabado05_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV59Recetasdeacabado05_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV60Recetasdeacabado05_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recetasdeacabado05_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Recetasdeacabado05_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recetasdeacabado05_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Recetasdeacabado05_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Recetasdeacabado05_wcds_12_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetasdeacabado05_wcds_14_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Recetasdeacabado05_wcds_16_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09BO4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Recetasdeacabado05_wcds_1_filterfulltext ,
                                          String AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel ,
                                          String AV55Recetasdeacabado05_wcds_2_tfbarnhdr ,
                                          short AV57Recetasdeacabado05_wcds_4_tfreclinmaq ,
                                          short AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to ,
                                          byte AV59Recetasdeacabado05_wcds_6_tfbarsit ,
                                          byte AV60Recetasdeacabado05_wcds_7_tfbarsit_to ,
                                          String AV62Recetasdeacabado05_wcds_9_tfbarser_sel ,
                                          String AV61Recetasdeacabado05_wcds_8_tfbarser ,
                                          String AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel ,
                                          String AV63Recetasdeacabado05_wcds_10_tfbarserdsc ,
                                          String AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel ,
                                          String AV65Recetasdeacabado05_wcds_12_tfmaqcod ,
                                          int AV67Recetasdeacabado05_wcds_14_tfrecvolprd ,
                                          int AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to ,
                                          java.util.Date AV69Recetasdeacabado05_wcds_16_tfrecfecalt ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.util.Date A4866RecFecAlt ,
                                          int AV46Barcod ,
                                          byte AV47Barcodreo ,
                                          String AV48Barcodpar ,
                                          String A396EmprCod ,
                                          String AV45Emprcod ,
                                          String A6039RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[29];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarSerDsc, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarSer, T2.BarSit, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM" ;
      scmdbuf += " (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV54Recetasdeacabado05_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Recetasdeacabado05_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV57Recetasdeacabado05_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV59Recetasdeacabado05_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV60Recetasdeacabado05_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recetasdeacabado05_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Recetasdeacabado05_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recetasdeacabado05_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Recetasdeacabado05_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Recetasdeacabado05_wcds_12_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetasdeacabado05_wcds_14_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Recetasdeacabado05_wcds_16_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09BO5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV54Recetasdeacabado05_wcds_1_filterfulltext ,
                                          String AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel ,
                                          String AV55Recetasdeacabado05_wcds_2_tfbarnhdr ,
                                          short AV57Recetasdeacabado05_wcds_4_tfreclinmaq ,
                                          short AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to ,
                                          byte AV59Recetasdeacabado05_wcds_6_tfbarsit ,
                                          byte AV60Recetasdeacabado05_wcds_7_tfbarsit_to ,
                                          String AV62Recetasdeacabado05_wcds_9_tfbarser_sel ,
                                          String AV61Recetasdeacabado05_wcds_8_tfbarser ,
                                          String AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel ,
                                          String AV63Recetasdeacabado05_wcds_10_tfbarserdsc ,
                                          String AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel ,
                                          String AV65Recetasdeacabado05_wcds_12_tfmaqcod ,
                                          int AV67Recetasdeacabado05_wcds_14_tfrecvolprd ,
                                          int AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to ,
                                          java.util.Date AV69Recetasdeacabado05_wcds_16_tfrecfecalt ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.util.Date A4866RecFecAlt ,
                                          int AV46Barcod ,
                                          byte AV47Barcodreo ,
                                          String AV48Barcodpar ,
                                          String A6039RecAcab ,
                                          String AV45Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[29];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T1.RecAcab, T1.RecFecAlt, T1.RecVolPrd, T2.BarSerDsc, T2.BarSer, T2.BarSit, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM" ;
      scmdbuf += " (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.RecAcab = 'S')");
      if ( ! (GXutil.strcmp("", AV54Recetasdeacabado05_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Recetasdeacabado05_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Recetasdeacabado05_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV57Recetasdeacabado05_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV58Recetasdeacabado05_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV59Recetasdeacabado05_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV60Recetasdeacabado05_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Recetasdeacabado05_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Recetasdeacabado05_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Recetasdeacabado05_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Recetasdeacabado05_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Recetasdeacabado05_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Recetasdeacabado05_wcds_12_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Recetasdeacabado05_wcds_13_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV67Recetasdeacabado05_wcds_14_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV68Recetasdeacabado05_wcds_15_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV69Recetasdeacabado05_wcds_16_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod" ;
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
                  return conditional_P09BO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 1 :
                  return conditional_P09BO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 2 :
                  return conditional_P09BO4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 3 :
                  return conditional_P09BO5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09BO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BO4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09BO5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((String[]) buf[7])[0] = rslt.getString(6, 26);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 26);
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
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
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], false);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], false);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], false);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[57], false);
               }
               return;
      }
   }

}

