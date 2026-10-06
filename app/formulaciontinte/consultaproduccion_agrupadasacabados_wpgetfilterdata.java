package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultaproduccion_agrupadasacabados_wpgetfilterdata extends GXProcedure
{
   public consultaproduccion_agrupadasacabados_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultaproduccion_agrupadasacabados_wpgetfilterdata.class ), "" );
   }

   public consultaproduccion_agrupadasacabados_wpgetfilterdata( int remoteHandle ,
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
      consultaproduccion_agrupadasacabados_wpgetfilterdata.this.aP5 = new String[] {""};
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
      consultaproduccion_agrupadasacabados_wpgetfilterdata.this.AV28DDOName = aP0;
      consultaproduccion_agrupadasacabados_wpgetfilterdata.this.AV26SearchTxt = aP1;
      consultaproduccion_agrupadasacabados_wpgetfilterdata.this.AV27SearchTxtTo = aP2;
      consultaproduccion_agrupadasacabados_wpgetfilterdata.this.aP3 = aP3;
      consultaproduccion_agrupadasacabados_wpgetfilterdata.this.aP4 = aP4;
      consultaproduccion_agrupadasacabados_wpgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV28DDOName), "DDO_AC_BARPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADAC_BARPAROPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV39Session.getValue("FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WPGridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WPGridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV39Session.getValue("FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WPGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_BARCOD") == 0 )
         {
            AV10TFAc_Barcod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAc_Barcod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_BARREO") == 0 )
         {
            AV12TFAc_BarReo = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFAc_BarReo_To = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_BARPAR") == 0 )
         {
            AV14TFAc_BarPar = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_BARPAR_SEL") == 0 )
         {
            AV15TFAc_BarPar_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_METROS") == 0 )
         {
            AV16TFAc_Metros = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFAc_Metros_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_KILOS") == 0 )
         {
            AV18TFAc_Kilos = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFAc_Kilos_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_PZS") == 0 )
         {
            AV20TFAc_Pzs = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFAc_Pzs_To = (short)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADAC_BARPAROPTIONS' Routine */
      returnInSub = false ;
      AV14TFAc_BarPar = AV26SearchTxt ;
      AV15TFAc_BarPar_Sel = "" ;
      AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = AV44FilterFullText ;
      AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod = AV10TFAc_Barcod ;
      AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to = AV11TFAc_Barcod_To ;
      AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo = AV12TFAc_BarReo ;
      AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to = AV13TFAc_BarReo_To ;
      AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = AV14TFAc_BarPar ;
      AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel = AV15TFAc_BarPar_Sel ;
      AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros = AV16TFAc_Metros ;
      AV61Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to = AV17TFAc_Metros_To ;
      AV62Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos = AV18TFAc_Kilos ;
      AV63Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to = AV19TFAc_Kilos_To ;
      AV64Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs = AV20TFAc_Pzs ;
      AV65Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to = AV21TFAc_Pzs_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext ,
                                           Integer.valueOf(AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod) ,
                                           Integer.valueOf(AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to) ,
                                           Byte.valueOf(AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo) ,
                                           Byte.valueOf(AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to) ,
                                           AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel ,
                                           AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar ,
                                           AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros ,
                                           AV61Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to ,
                                           AV62Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos ,
                                           AV63Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to ,
                                           Short.valueOf(AV64Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs) ,
                                           Short.valueOf(AV65Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to) ,
                                           Integer.valueOf(A6031Ac_Barcod) ,
                                           Byte.valueOf(A6032Ac_BarReo) ,
                                           A6033Ac_BarPar ,
                                           A6034Ac_Metros ,
                                           A6035Ac_Kilos ,
                                           Short.valueOf(A6036Ac_Pzs) ,
                                           A396EmprCod ,
                                           AV45Emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV46Barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV47Barcodreo) ,
                                           A130BarCodPar ,
                                           AV48Barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar), 1, "%") ;
      /* Using cursor P09GV2 */
      pr_default.execute(0, new Object[] {AV45Emprcod, Integer.valueOf(AV46Barcod), Byte.valueOf(AV47Barcodreo), AV48Barcodpar, lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, Integer.valueOf(AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod), Integer.valueOf(AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to), Byte.valueOf(AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo), Byte.valueOf(AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to), lV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar, AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel, AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros, AV61Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to, AV62Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos, AV63Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to, Short.valueOf(AV64Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs), Short.valueOf(AV65Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9GV2 = false ;
         A396EmprCod = P09GV2_A396EmprCod[0] ;
         A129BarCod = P09GV2_A129BarCod[0] ;
         A132BarCodReo = P09GV2_A132BarCodReo[0] ;
         A130BarCodPar = P09GV2_A130BarCodPar[0] ;
         A6033Ac_BarPar = P09GV2_A6033Ac_BarPar[0] ;
         A6036Ac_Pzs = P09GV2_A6036Ac_Pzs[0] ;
         n6036Ac_Pzs = P09GV2_n6036Ac_Pzs[0] ;
         A6035Ac_Kilos = P09GV2_A6035Ac_Kilos[0] ;
         n6035Ac_Kilos = P09GV2_n6035Ac_Kilos[0] ;
         A6034Ac_Metros = P09GV2_A6034Ac_Metros[0] ;
         n6034Ac_Metros = P09GV2_n6034Ac_Metros[0] ;
         A6032Ac_BarReo = P09GV2_A6032Ac_BarReo[0] ;
         A6031Ac_Barcod = P09GV2_A6031Ac_Barcod[0] ;
         AV38count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09GV2_A6033Ac_BarPar[0], A6033Ac_BarPar) == 0 ) )
         {
            brk9GV2 = false ;
            A396EmprCod = P09GV2_A396EmprCod[0] ;
            A129BarCod = P09GV2_A129BarCod[0] ;
            A132BarCodReo = P09GV2_A132BarCodReo[0] ;
            A130BarCodPar = P09GV2_A130BarCodPar[0] ;
            A6032Ac_BarReo = P09GV2_A6032Ac_BarReo[0] ;
            A6031Ac_Barcod = P09GV2_A6031Ac_Barcod[0] ;
            AV38count = (long)(AV38count+1) ;
            brk9GV2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A6033Ac_BarPar)==0) )
         {
            AV30Option = A6033Ac_BarPar ;
            AV31Options.add(AV30Option, 0);
            AV36OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV38count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9GV2 )
         {
            brk9GV2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultaproduccion_agrupadasacabados_wpgetfilterdata.this.AV32OptionsJson;
      this.aP4[0] = consultaproduccion_agrupadasacabados_wpgetfilterdata.this.AV35OptionsDescJson;
      this.aP5[0] = consultaproduccion_agrupadasacabados_wpgetfilterdata.this.AV37OptionIndexesJson;
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
      AV14TFAc_BarPar = "" ;
      AV15TFAc_BarPar_Sel = "" ;
      AV16TFAc_Metros = DecimalUtil.ZERO ;
      AV17TFAc_Metros_To = DecimalUtil.ZERO ;
      AV18TFAc_Kilos = DecimalUtil.ZERO ;
      AV19TFAc_Kilos_To = DecimalUtil.ZERO ;
      AV45Emprcod = "" ;
      AV48Barcodpar = "" ;
      A6033Ac_BarPar = "" ;
      AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = "" ;
      AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = "" ;
      AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel = "" ;
      AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros = DecimalUtil.ZERO ;
      AV61Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to = DecimalUtil.ZERO ;
      AV62Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos = DecimalUtil.ZERO ;
      AV63Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = "" ;
      lV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = "" ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09GV2_A396EmprCod = new String[] {""} ;
      P09GV2_A129BarCod = new int[1] ;
      P09GV2_A132BarCodReo = new byte[1] ;
      P09GV2_A130BarCodPar = new String[] {""} ;
      P09GV2_A6033Ac_BarPar = new String[] {""} ;
      P09GV2_A6036Ac_Pzs = new short[1] ;
      P09GV2_n6036Ac_Pzs = new boolean[] {false} ;
      P09GV2_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GV2_n6035Ac_Kilos = new boolean[] {false} ;
      P09GV2_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GV2_n6034Ac_Metros = new boolean[] {false} ;
      P09GV2_A6032Ac_BarReo = new byte[1] ;
      P09GV2_A6031Ac_Barcod = new int[1] ;
      AV30Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consultaproduccion_agrupadasacabados_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09GV2_A396EmprCod, P09GV2_A129BarCod, P09GV2_A132BarCodReo, P09GV2_A130BarCodPar, P09GV2_A6033Ac_BarPar, P09GV2_A6036Ac_Pzs, P09GV2_n6036Ac_Pzs, P09GV2_A6035Ac_Kilos, P09GV2_n6035Ac_Kilos, P09GV2_A6034Ac_Metros,
            P09GV2_n6034Ac_Metros, P09GV2_A6032Ac_BarReo, P09GV2_A6031Ac_Barcod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TFAc_BarReo ;
   private byte AV13TFAc_BarReo_To ;
   private byte AV47Barcodreo ;
   private byte AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo ;
   private byte AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to ;
   private byte A6032Ac_BarReo ;
   private byte A132BarCodReo ;
   private short AV20TFAc_Pzs ;
   private short AV21TFAc_Pzs_To ;
   private short AV64Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs ;
   private short AV65Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to ;
   private short A6036Ac_Pzs ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private int AV10TFAc_Barcod ;
   private int AV11TFAc_Barcod_To ;
   private int AV46Barcod ;
   private int AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod ;
   private int AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to ;
   private int A6031Ac_Barcod ;
   private int A129BarCod ;
   private long AV38count ;
   private java.math.BigDecimal AV16TFAc_Metros ;
   private java.math.BigDecimal AV17TFAc_Metros_To ;
   private java.math.BigDecimal AV18TFAc_Kilos ;
   private java.math.BigDecimal AV19TFAc_Kilos_To ;
   private java.math.BigDecimal AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros ;
   private java.math.BigDecimal AV61Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to ;
   private java.math.BigDecimal AV62Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos ;
   private java.math.BigDecimal AV63Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private String AV14TFAc_BarPar ;
   private String AV15TFAc_BarPar_Sel ;
   private String AV45Emprcod ;
   private String AV48Barcodpar ;
   private String A6033Ac_BarPar ;
   private String AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar ;
   private String AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel ;
   private String scmdbuf ;
   private String lV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean returnInSub ;
   private boolean brk9GV2 ;
   private boolean n6036Ac_Pzs ;
   private boolean n6035Ac_Kilos ;
   private boolean n6034Ac_Metros ;
   private String AV32OptionsJson ;
   private String AV35OptionsDescJson ;
   private String AV37OptionIndexesJson ;
   private String AV28DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext ;
   private String lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV39Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09GV2_A396EmprCod ;
   private int[] P09GV2_A129BarCod ;
   private byte[] P09GV2_A132BarCodReo ;
   private String[] P09GV2_A130BarCodPar ;
   private String[] P09GV2_A6033Ac_BarPar ;
   private short[] P09GV2_A6036Ac_Pzs ;
   private boolean[] P09GV2_n6036Ac_Pzs ;
   private java.math.BigDecimal[] P09GV2_A6035Ac_Kilos ;
   private boolean[] P09GV2_n6035Ac_Kilos ;
   private java.math.BigDecimal[] P09GV2_A6034Ac_Metros ;
   private boolean[] P09GV2_n6034Ac_Metros ;
   private byte[] P09GV2_A6032Ac_BarReo ;
   private int[] P09GV2_A6031Ac_Barcod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV34OptionsDesc ;
   private GXSimpleCollection<String> AV36OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
}

final  class consultaproduccion_agrupadasacabados_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09GV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext ,
                                          int AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod ,
                                          int AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to ,
                                          byte AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo ,
                                          byte AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to ,
                                          String AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel ,
                                          String AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar ,
                                          java.math.BigDecimal AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros ,
                                          java.math.BigDecimal AV61Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to ,
                                          java.math.BigDecimal AV62Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos ,
                                          java.math.BigDecimal AV63Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to ,
                                          short AV64Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs ,
                                          short AV65Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to ,
                                          int A6031Ac_Barcod ,
                                          byte A6032Ac_BarReo ,
                                          String A6033Ac_BarPar ,
                                          java.math.BigDecimal A6034Ac_Metros ,
                                          java.math.BigDecimal A6035Ac_Kilos ,
                                          short A6036Ac_Pzs ,
                                          String A396EmprCod ,
                                          String AV45Emprcod ,
                                          int A129BarCod ,
                                          int AV46Barcod ,
                                          byte A132BarCodReo ,
                                          byte AV47Barcodreo ,
                                          String A130BarCodPar ,
                                          String AV48Barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_BarPar, Ac_Pzs, Ac_Kilos, Ac_Metros, Ac_BarReo, Ac_Barcod FROM TXPHDRACA" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(BarCod = ?)");
      addWhere(sWhereString, "(BarCodReo = ?)");
      addWhere(sWhereString, "(BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Ac_Barcod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Ac_BarReo,'90'), 2) like '%' || ?) or ( UPPER(Ac_BarPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Ac_Metros,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Ac_Kilos,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Ac_Pzs,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod) )
      {
         addWhere(sWhereString, "(Ac_Barcod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to) )
      {
         addWhere(sWhereString, "(Ac_Barcod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo) )
      {
         addWhere(sWhereString, "(Ac_BarReo >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to) )
      {
         addWhere(sWhereString, "(Ac_BarReo <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Ac_BarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel)==0) )
      {
         addWhere(sWhereString, "(Ac_BarPar = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros)==0) )
      {
         addWhere(sWhereString, "(Ac_Metros >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to)==0) )
      {
         addWhere(sWhereString, "(Ac_Metros <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos)==0) )
      {
         addWhere(sWhereString, "(Ac_Kilos >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to)==0) )
      {
         addWhere(sWhereString, "(Ac_Kilos <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs) )
      {
         addWhere(sWhereString, "(Ac_Pzs >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to) )
      {
         addWhere(sWhereString, "(Ac_Pzs <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Ac_BarPar" ;
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
                  return conditional_P09GV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((int[]) buf[12])[0] = rslt.getInt(10);
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               return;
      }
   }

}

