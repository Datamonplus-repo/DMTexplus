package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tlectorwwgetfilterdata extends GXProcedure
{
   public tlectorwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlectorwwgetfilterdata.class ), "" );
   }

   public tlectorwwgetfilterdata( int remoteHandle ,
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
      tlectorwwgetfilterdata.this.aP5 = new String[] {""};
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
      tlectorwwgetfilterdata.this.AV42DDOName = aP0;
      tlectorwwgetfilterdata.this.AV40SearchTxt = aP1;
      tlectorwwgetfilterdata.this.AV41SearchTxtTo = aP2;
      tlectorwwgetfilterdata.this.aP3 = aP3;
      tlectorwwgetfilterdata.this.aP4 = aP4;
      tlectorwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LECMAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADLECMAQCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LECHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADLECHDROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LECOPENOM") == 0 )
      {
         /* Execute user subroutine: 'LOADLECOPENOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LECFASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADLECFASCODOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LECFASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADLECFASDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LECPARNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADLECPARNOMOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LECHOR") == 0 )
      {
         /* Execute user subroutine: 'LOADLECHOROPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_LECTIPENT") == 0 )
      {
         /* Execute user subroutine: 'LOADLECTIPENTOPTIONS' */
         S191 ();
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
      if ( GXutil.strcmp(AV53Session.getValue("TLECTORWWGridState"), "") == 0 )
      {
         AV55GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TLECTORWWGridState"), null, null);
      }
      else
      {
         AV55GridState.fromxml(AV53Session.getValue("TLECTORWWGridState"), null, null);
      }
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV56GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV1));
         if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV73FilterFullText = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD") == 0 )
         {
            AV10TFLecMaqCod = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECMAQCOD_SEL") == 0 )
         {
            AV11TFLecMaqCod_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR") == 0 )
         {
            AV71TFLecHdr = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHDR_SEL") == 0 )
         {
            AV72TFLecHdr_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPECOD") == 0 )
         {
            AV20TFLecOpeCod = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFLecOpeCod_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM") == 0 )
         {
            AV74TFlecOpeNom = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECOPENOM_SEL") == 0 )
         {
            AV75TFlecOpeNom_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD") == 0 )
         {
            AV24TFLecFasCod = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASCOD_SEL") == 0 )
         {
            AV25TFLecFasCod_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC") == 0 )
         {
            AV76TFLecFasDsc = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASDSC_SEL") == 0 )
         {
            AV77TFLecFasDsc_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFASORD") == 0 )
         {
            AV28TFLecFasOrd = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFLecFasOrd_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARCOD") == 0 )
         {
            AV30TFLecParCod = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFLecParCod_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM") == 0 )
         {
            AV78TFLecParNom = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECPARNOM_SEL") == 0 )
         {
            AV79TFLecParNom_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR") == 0 )
         {
            AV34TFLecHor = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECHOR_SEL") == 0 )
         {
            AV35TFLecHor_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECFEC") == 0 )
         {
            AV36TFLecFec = localUtil.ctod( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT") == 0 )
         {
            AV38TFLecTipEnt = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECTIPENT_SEL") == 0 )
         {
            AV39TFLecTipEnt_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLECESTADO_SEL") == 0 )
         {
            AV69TFLecEstado_SelsJson = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV70TFLecEstado_Sels.fromJSonString(AV69TFLecEstado_SelsJson, null);
         }
         AV82GXV1 = (int)(AV82GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLECMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFLecMaqCod = AV40SearchTxt ;
      AV11TFLecMaqCod_Sel = "" ;
      AV84Tlectorwwds_1_filterfulltext = AV73FilterFullText ;
      AV85Tlectorwwds_2_tflecmaqcod = AV10TFLecMaqCod ;
      AV86Tlectorwwds_3_tflecmaqcod_sel = AV11TFLecMaqCod_Sel ;
      AV87Tlectorwwds_4_tflechdr = AV71TFLecHdr ;
      AV88Tlectorwwds_5_tflechdr_sel = AV72TFLecHdr_Sel ;
      AV89Tlectorwwds_6_tflecopecod = AV20TFLecOpeCod ;
      AV90Tlectorwwds_7_tflecopecod_to = AV21TFLecOpeCod_To ;
      AV91Tlectorwwds_8_tflecopenom = AV74TFlecOpeNom ;
      AV92Tlectorwwds_9_tflecopenom_sel = AV75TFlecOpeNom_Sel ;
      AV93Tlectorwwds_10_tflecfascod = AV24TFLecFasCod ;
      AV94Tlectorwwds_11_tflecfascod_sel = AV25TFLecFasCod_Sel ;
      AV95Tlectorwwds_12_tflecfasdsc = AV76TFLecFasDsc ;
      AV96Tlectorwwds_13_tflecfasdsc_sel = AV77TFLecFasDsc_Sel ;
      AV97Tlectorwwds_14_tflecfasord = AV28TFLecFasOrd ;
      AV98Tlectorwwds_15_tflecfasord_to = AV29TFLecFasOrd_To ;
      AV99Tlectorwwds_16_tflecparcod = AV30TFLecParCod ;
      AV100Tlectorwwds_17_tflecparcod_to = AV31TFLecParCod_To ;
      AV101Tlectorwwds_18_tflecparnom = AV78TFLecParNom ;
      AV102Tlectorwwds_19_tflecparnom_sel = AV79TFLecParNom_Sel ;
      AV103Tlectorwwds_20_tflechor = AV34TFLecHor ;
      AV104Tlectorwwds_21_tflechor_sel = AV35TFLecHor_Sel ;
      AV105Tlectorwwds_22_tflecfec = AV36TFLecFec ;
      AV106Tlectorwwds_23_tflectipent = AV38TFLecTipEnt ;
      AV107Tlectorwwds_24_tflectipent_sel = AV39TFLecTipEnt_Sel ;
      AV108Tlectorwwds_25_tflecestado_sels = AV70TFLecEstado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A13722LecEstado ,
                                           AV108Tlectorwwds_25_tflecestado_sels ,
                                           AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                           AV85Tlectorwwds_2_tflecmaqcod ,
                                           AV88Tlectorwwds_5_tflechdr_sel ,
                                           AV87Tlectorwwds_4_tflechdr ,
                                           Integer.valueOf(AV89Tlectorwwds_6_tflecopecod) ,
                                           Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to) ,
                                           AV94Tlectorwwds_11_tflecfascod_sel ,
                                           AV93Tlectorwwds_10_tflecfascod ,
                                           Short.valueOf(AV97Tlectorwwds_14_tflecfasord) ,
                                           Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to) ,
                                           Short.valueOf(AV99Tlectorwwds_16_tflecparcod) ,
                                           Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to) ,
                                           AV104Tlectorwwds_21_tflechor_sel ,
                                           AV103Tlectorwwds_20_tflechor ,
                                           AV105Tlectorwwds_22_tflecfec ,
                                           AV107Tlectorwwds_24_tflectipent_sel ,
                                           AV106Tlectorwwds_23_tflectipent ,
                                           A1166LecMaqCod ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           AV84Tlectorwwds_1_filterfulltext ,
                                           A13721LecHdr ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           AV92Tlectorwwds_9_tflecopenom_sel ,
                                           AV91Tlectorwwds_8_tflecopenom ,
                                           AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                           AV95Tlectorwwds_12_tflecfasdsc ,
                                           AV102Tlectorwwds_19_tflecparnom_sel ,
                                           AV101Tlectorwwds_18_tflecparnom ,
                                           Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV85Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV85Tlectorwwds_2_tflecmaqcod), 6, "%") ;
      lV87Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV87Tlectorwwds_4_tflechdr), 11, "%") ;
      lV93Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV93Tlectorwwds_10_tflecfascod), 8, "%") ;
      lV103Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV103Tlectorwwds_20_tflechor), 8, "%") ;
      lV106Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV106Tlectorwwds_23_tflectipent), 1, "%") ;
      /* Using cursor P08B62 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()), lV85Tlectorwwds_2_tflecmaqcod, AV86Tlectorwwds_3_tflecmaqcod_sel, lV87Tlectorwwds_4_tflechdr, AV88Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV89Tlectorwwds_6_tflecopecod), Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to), lV93Tlectorwwds_10_tflecfascod, AV94Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV97Tlectorwwds_14_tflecfasord), Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV99Tlectorwwds_16_tflecparcod), Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to), lV103Tlectorwwds_20_tflechor, AV104Tlectorwwds_21_tflechor_sel, AV105Tlectorwwds_22_tflecfec, lV106Tlectorwwds_23_tflectipent, AV107Tlectorwwds_24_tflectipent_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8B62 = false ;
         A1166LecMaqCod = P08B62_A1166LecMaqCod[0] ;
         A1796LecTipEnt = P08B62_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P08B62_n1796LecTipEnt[0] ;
         A1174LecFec = P08B62_A1174LecFec[0] ;
         n1174LecFec = P08B62_n1174LecFec[0] ;
         A1173LecHor = P08B62_A1173LecHor[0] ;
         n1173LecHor = P08B62_n1173LecHor[0] ;
         A13721LecHdr = P08B62_A13721LecHdr[0] ;
         A1188LecFasOrd = P08B62_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08B62_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08B62_A1169LecBarPar[0] ;
         n1169LecBarPar = P08B62_n1169LecBarPar[0] ;
         A1168LecBarReo = P08B62_A1168LecBarReo[0] ;
         n1168LecBarReo = P08B62_n1168LecBarReo[0] ;
         A1167LecBarCod = P08B62_A1167LecBarCod[0] ;
         n1167LecBarCod = P08B62_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08B62_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08B62_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08B62_A1171LecFasCod[0] ;
         n1171LecFasCod = P08B62_n1171LecFasCod[0] ;
         A1172LecParCod = P08B62_A1172LecParCod[0] ;
         n1172LecParCod = P08B62_n1172LecParCod[0] ;
         A396EmprCod = P08B62_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( ( AV108Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV108Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
         {
            GXt_char2 = A14259lecOpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
            tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A14259lecOpeNom = GXt_char2 ;
            if ( ! ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV91Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV91Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV92Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
               {
                  GXt_char2 = A14260LecFasDsc ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                  tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                  A14260LecFasDsc = GXt_char2 ;
                  if ( ! ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV95Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV95Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV96Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                     {
                        GXt_char2 = A14261LecParNom ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                        tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                        A14261LecParNom = GXt_char2 ;
                        if ( (GXutil.strcmp("", AV84Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV101Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV101Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV102Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                              {
                                 AV52count = 0 ;
                                 while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08B62_A1166LecMaqCod[0], A1166LecMaqCod) == 0 ) )
                                 {
                                    brk8B62 = false ;
                                    A396EmprCod = P08B62_A396EmprCod[0] ;
                                    AV52count = (long)(AV52count+1) ;
                                    brk8B62 = true ;
                                    pr_default.readNext(0);
                                 }
                                 if ( ! (GXutil.strcmp("", A1166LecMaqCod)==0) )
                                 {
                                    AV44Option = A1166LecMaqCod ;
                                    AV45Options.add(AV44Option, 0);
                                    AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV45Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8B62 )
         {
            brk8B62 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLECHDROPTIONS' Routine */
      returnInSub = false ;
      AV71TFLecHdr = AV40SearchTxt ;
      AV72TFLecHdr_Sel = "" ;
      AV84Tlectorwwds_1_filterfulltext = AV73FilterFullText ;
      AV85Tlectorwwds_2_tflecmaqcod = AV10TFLecMaqCod ;
      AV86Tlectorwwds_3_tflecmaqcod_sel = AV11TFLecMaqCod_Sel ;
      AV87Tlectorwwds_4_tflechdr = AV71TFLecHdr ;
      AV88Tlectorwwds_5_tflechdr_sel = AV72TFLecHdr_Sel ;
      AV89Tlectorwwds_6_tflecopecod = AV20TFLecOpeCod ;
      AV90Tlectorwwds_7_tflecopecod_to = AV21TFLecOpeCod_To ;
      AV91Tlectorwwds_8_tflecopenom = AV74TFlecOpeNom ;
      AV92Tlectorwwds_9_tflecopenom_sel = AV75TFlecOpeNom_Sel ;
      AV93Tlectorwwds_10_tflecfascod = AV24TFLecFasCod ;
      AV94Tlectorwwds_11_tflecfascod_sel = AV25TFLecFasCod_Sel ;
      AV95Tlectorwwds_12_tflecfasdsc = AV76TFLecFasDsc ;
      AV96Tlectorwwds_13_tflecfasdsc_sel = AV77TFLecFasDsc_Sel ;
      AV97Tlectorwwds_14_tflecfasord = AV28TFLecFasOrd ;
      AV98Tlectorwwds_15_tflecfasord_to = AV29TFLecFasOrd_To ;
      AV99Tlectorwwds_16_tflecparcod = AV30TFLecParCod ;
      AV100Tlectorwwds_17_tflecparcod_to = AV31TFLecParCod_To ;
      AV101Tlectorwwds_18_tflecparnom = AV78TFLecParNom ;
      AV102Tlectorwwds_19_tflecparnom_sel = AV79TFLecParNom_Sel ;
      AV103Tlectorwwds_20_tflechor = AV34TFLecHor ;
      AV104Tlectorwwds_21_tflechor_sel = AV35TFLecHor_Sel ;
      AV105Tlectorwwds_22_tflecfec = AV36TFLecFec ;
      AV106Tlectorwwds_23_tflectipent = AV38TFLecTipEnt ;
      AV107Tlectorwwds_24_tflectipent_sel = AV39TFLecTipEnt_Sel ;
      AV108Tlectorwwds_25_tflecestado_sels = AV70TFLecEstado_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A13722LecEstado ,
                                           AV108Tlectorwwds_25_tflecestado_sels ,
                                           AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                           AV85Tlectorwwds_2_tflecmaqcod ,
                                           AV88Tlectorwwds_5_tflechdr_sel ,
                                           AV87Tlectorwwds_4_tflechdr ,
                                           Integer.valueOf(AV89Tlectorwwds_6_tflecopecod) ,
                                           Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to) ,
                                           AV94Tlectorwwds_11_tflecfascod_sel ,
                                           AV93Tlectorwwds_10_tflecfascod ,
                                           Short.valueOf(AV97Tlectorwwds_14_tflecfasord) ,
                                           Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to) ,
                                           Short.valueOf(AV99Tlectorwwds_16_tflecparcod) ,
                                           Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to) ,
                                           AV104Tlectorwwds_21_tflechor_sel ,
                                           AV103Tlectorwwds_20_tflechor ,
                                           AV105Tlectorwwds_22_tflecfec ,
                                           AV107Tlectorwwds_24_tflectipent_sel ,
                                           AV106Tlectorwwds_23_tflectipent ,
                                           A1166LecMaqCod ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           AV84Tlectorwwds_1_filterfulltext ,
                                           A13721LecHdr ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           AV92Tlectorwwds_9_tflecopenom_sel ,
                                           AV91Tlectorwwds_8_tflecopenom ,
                                           AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                           AV95Tlectorwwds_12_tflecfasdsc ,
                                           AV102Tlectorwwds_19_tflecparnom_sel ,
                                           AV101Tlectorwwds_18_tflecparnom ,
                                           Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV85Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV85Tlectorwwds_2_tflecmaqcod), 6, "%") ;
      lV87Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV87Tlectorwwds_4_tflechdr), 11, "%") ;
      lV93Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV93Tlectorwwds_10_tflecfascod), 8, "%") ;
      lV103Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV103Tlectorwwds_20_tflechor), 8, "%") ;
      lV106Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV106Tlectorwwds_23_tflectipent), 1, "%") ;
      /* Using cursor P08B63 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()), lV85Tlectorwwds_2_tflecmaqcod, AV86Tlectorwwds_3_tflecmaqcod_sel, lV87Tlectorwwds_4_tflechdr, AV88Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV89Tlectorwwds_6_tflecopecod), Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to), lV93Tlectorwwds_10_tflecfascod, AV94Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV97Tlectorwwds_14_tflecfasord), Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV99Tlectorwwds_16_tflecparcod), Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to), lV103Tlectorwwds_20_tflechor, AV104Tlectorwwds_21_tflechor_sel, AV105Tlectorwwds_22_tflecfec, lV106Tlectorwwds_23_tflectipent, AV107Tlectorwwds_24_tflectipent_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1796LecTipEnt = P08B63_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P08B63_n1796LecTipEnt[0] ;
         A1174LecFec = P08B63_A1174LecFec[0] ;
         n1174LecFec = P08B63_n1174LecFec[0] ;
         A1173LecHor = P08B63_A1173LecHor[0] ;
         n1173LecHor = P08B63_n1173LecHor[0] ;
         A13721LecHdr = P08B63_A13721LecHdr[0] ;
         A1166LecMaqCod = P08B63_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P08B63_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08B63_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08B63_A1169LecBarPar[0] ;
         n1169LecBarPar = P08B63_n1169LecBarPar[0] ;
         A1168LecBarReo = P08B63_A1168LecBarReo[0] ;
         n1168LecBarReo = P08B63_n1168LecBarReo[0] ;
         A1167LecBarCod = P08B63_A1167LecBarCod[0] ;
         n1167LecBarCod = P08B63_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08B63_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08B63_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08B63_A1171LecFasCod[0] ;
         n1171LecFasCod = P08B63_n1171LecFasCod[0] ;
         A1172LecParCod = P08B63_A1172LecParCod[0] ;
         n1172LecParCod = P08B63_n1172LecParCod[0] ;
         A396EmprCod = P08B63_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( ( AV108Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV108Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
         {
            GXt_char2 = A14259lecOpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
            tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A14259lecOpeNom = GXt_char2 ;
            if ( ! ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV91Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV91Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV92Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
               {
                  GXt_char2 = A14260LecFasDsc ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                  tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                  A14260LecFasDsc = GXt_char2 ;
                  if ( ! ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV95Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV95Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV96Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                     {
                        GXt_char2 = A14261LecParNom ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                        tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                        A14261LecParNom = GXt_char2 ;
                        if ( (GXutil.strcmp("", AV84Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV101Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV101Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV102Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                              {
                                 if ( ! (GXutil.strcmp("", A13721LecHdr)==0) )
                                 {
                                    AV44Option = A13721LecHdr ;
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
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLECOPENOMOPTIONS' Routine */
      returnInSub = false ;
      AV74TFlecOpeNom = AV40SearchTxt ;
      AV75TFlecOpeNom_Sel = "" ;
      AV84Tlectorwwds_1_filterfulltext = AV73FilterFullText ;
      AV85Tlectorwwds_2_tflecmaqcod = AV10TFLecMaqCod ;
      AV86Tlectorwwds_3_tflecmaqcod_sel = AV11TFLecMaqCod_Sel ;
      AV87Tlectorwwds_4_tflechdr = AV71TFLecHdr ;
      AV88Tlectorwwds_5_tflechdr_sel = AV72TFLecHdr_Sel ;
      AV89Tlectorwwds_6_tflecopecod = AV20TFLecOpeCod ;
      AV90Tlectorwwds_7_tflecopecod_to = AV21TFLecOpeCod_To ;
      AV91Tlectorwwds_8_tflecopenom = AV74TFlecOpeNom ;
      AV92Tlectorwwds_9_tflecopenom_sel = AV75TFlecOpeNom_Sel ;
      AV93Tlectorwwds_10_tflecfascod = AV24TFLecFasCod ;
      AV94Tlectorwwds_11_tflecfascod_sel = AV25TFLecFasCod_Sel ;
      AV95Tlectorwwds_12_tflecfasdsc = AV76TFLecFasDsc ;
      AV96Tlectorwwds_13_tflecfasdsc_sel = AV77TFLecFasDsc_Sel ;
      AV97Tlectorwwds_14_tflecfasord = AV28TFLecFasOrd ;
      AV98Tlectorwwds_15_tflecfasord_to = AV29TFLecFasOrd_To ;
      AV99Tlectorwwds_16_tflecparcod = AV30TFLecParCod ;
      AV100Tlectorwwds_17_tflecparcod_to = AV31TFLecParCod_To ;
      AV101Tlectorwwds_18_tflecparnom = AV78TFLecParNom ;
      AV102Tlectorwwds_19_tflecparnom_sel = AV79TFLecParNom_Sel ;
      AV103Tlectorwwds_20_tflechor = AV34TFLecHor ;
      AV104Tlectorwwds_21_tflechor_sel = AV35TFLecHor_Sel ;
      AV105Tlectorwwds_22_tflecfec = AV36TFLecFec ;
      AV106Tlectorwwds_23_tflectipent = AV38TFLecTipEnt ;
      AV107Tlectorwwds_24_tflectipent_sel = AV39TFLecTipEnt_Sel ;
      AV108Tlectorwwds_25_tflecestado_sels = AV70TFLecEstado_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A13722LecEstado ,
                                           AV108Tlectorwwds_25_tflecestado_sels ,
                                           AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                           AV85Tlectorwwds_2_tflecmaqcod ,
                                           AV88Tlectorwwds_5_tflechdr_sel ,
                                           AV87Tlectorwwds_4_tflechdr ,
                                           Integer.valueOf(AV89Tlectorwwds_6_tflecopecod) ,
                                           Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to) ,
                                           AV94Tlectorwwds_11_tflecfascod_sel ,
                                           AV93Tlectorwwds_10_tflecfascod ,
                                           Short.valueOf(AV97Tlectorwwds_14_tflecfasord) ,
                                           Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to) ,
                                           Short.valueOf(AV99Tlectorwwds_16_tflecparcod) ,
                                           Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to) ,
                                           AV104Tlectorwwds_21_tflechor_sel ,
                                           AV103Tlectorwwds_20_tflechor ,
                                           AV105Tlectorwwds_22_tflecfec ,
                                           AV107Tlectorwwds_24_tflectipent_sel ,
                                           AV106Tlectorwwds_23_tflectipent ,
                                           A1166LecMaqCod ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           AV84Tlectorwwds_1_filterfulltext ,
                                           A13721LecHdr ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           AV92Tlectorwwds_9_tflecopenom_sel ,
                                           AV91Tlectorwwds_8_tflecopenom ,
                                           AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                           AV95Tlectorwwds_12_tflecfasdsc ,
                                           AV102Tlectorwwds_19_tflecparnom_sel ,
                                           AV101Tlectorwwds_18_tflecparnom ,
                                           Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV85Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV85Tlectorwwds_2_tflecmaqcod), 6, "%") ;
      lV87Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV87Tlectorwwds_4_tflechdr), 11, "%") ;
      lV93Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV93Tlectorwwds_10_tflecfascod), 8, "%") ;
      lV103Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV103Tlectorwwds_20_tflechor), 8, "%") ;
      lV106Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV106Tlectorwwds_23_tflectipent), 1, "%") ;
      /* Using cursor P08B64 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()), lV85Tlectorwwds_2_tflecmaqcod, AV86Tlectorwwds_3_tflecmaqcod_sel, lV87Tlectorwwds_4_tflechdr, AV88Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV89Tlectorwwds_6_tflecopecod), Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to), lV93Tlectorwwds_10_tflecfascod, AV94Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV97Tlectorwwds_14_tflecfasord), Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV99Tlectorwwds_16_tflecparcod), Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to), lV103Tlectorwwds_20_tflechor, AV104Tlectorwwds_21_tflechor_sel, AV105Tlectorwwds_22_tflecfec, lV106Tlectorwwds_23_tflectipent, AV107Tlectorwwds_24_tflectipent_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1796LecTipEnt = P08B64_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P08B64_n1796LecTipEnt[0] ;
         A1174LecFec = P08B64_A1174LecFec[0] ;
         n1174LecFec = P08B64_n1174LecFec[0] ;
         A1173LecHor = P08B64_A1173LecHor[0] ;
         n1173LecHor = P08B64_n1173LecHor[0] ;
         A13721LecHdr = P08B64_A13721LecHdr[0] ;
         A1166LecMaqCod = P08B64_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P08B64_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08B64_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08B64_A1169LecBarPar[0] ;
         n1169LecBarPar = P08B64_n1169LecBarPar[0] ;
         A1168LecBarReo = P08B64_A1168LecBarReo[0] ;
         n1168LecBarReo = P08B64_n1168LecBarReo[0] ;
         A1167LecBarCod = P08B64_A1167LecBarCod[0] ;
         n1167LecBarCod = P08B64_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08B64_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08B64_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08B64_A1171LecFasCod[0] ;
         n1171LecFasCod = P08B64_n1171LecFasCod[0] ;
         A1172LecParCod = P08B64_A1172LecParCod[0] ;
         n1172LecParCod = P08B64_n1172LecParCod[0] ;
         A396EmprCod = P08B64_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( ( AV108Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV108Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
         {
            GXt_char2 = A14259lecOpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
            tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A14259lecOpeNom = GXt_char2 ;
            if ( ! ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV91Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV91Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV92Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
               {
                  GXt_char2 = A14260LecFasDsc ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                  tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                  A14260LecFasDsc = GXt_char2 ;
                  if ( ! ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV95Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV95Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV96Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                     {
                        GXt_char2 = A14261LecParNom ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                        tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                        A14261LecParNom = GXt_char2 ;
                        if ( (GXutil.strcmp("", AV84Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV101Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV101Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV102Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                              {
                                 if ( ! (GXutil.strcmp("", A14259lecOpeNom)==0) )
                                 {
                                    AV44Option = A14259lecOpeNom ;
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
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLECFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV24TFLecFasCod = AV40SearchTxt ;
      AV25TFLecFasCod_Sel = "" ;
      AV84Tlectorwwds_1_filterfulltext = AV73FilterFullText ;
      AV85Tlectorwwds_2_tflecmaqcod = AV10TFLecMaqCod ;
      AV86Tlectorwwds_3_tflecmaqcod_sel = AV11TFLecMaqCod_Sel ;
      AV87Tlectorwwds_4_tflechdr = AV71TFLecHdr ;
      AV88Tlectorwwds_5_tflechdr_sel = AV72TFLecHdr_Sel ;
      AV89Tlectorwwds_6_tflecopecod = AV20TFLecOpeCod ;
      AV90Tlectorwwds_7_tflecopecod_to = AV21TFLecOpeCod_To ;
      AV91Tlectorwwds_8_tflecopenom = AV74TFlecOpeNom ;
      AV92Tlectorwwds_9_tflecopenom_sel = AV75TFlecOpeNom_Sel ;
      AV93Tlectorwwds_10_tflecfascod = AV24TFLecFasCod ;
      AV94Tlectorwwds_11_tflecfascod_sel = AV25TFLecFasCod_Sel ;
      AV95Tlectorwwds_12_tflecfasdsc = AV76TFLecFasDsc ;
      AV96Tlectorwwds_13_tflecfasdsc_sel = AV77TFLecFasDsc_Sel ;
      AV97Tlectorwwds_14_tflecfasord = AV28TFLecFasOrd ;
      AV98Tlectorwwds_15_tflecfasord_to = AV29TFLecFasOrd_To ;
      AV99Tlectorwwds_16_tflecparcod = AV30TFLecParCod ;
      AV100Tlectorwwds_17_tflecparcod_to = AV31TFLecParCod_To ;
      AV101Tlectorwwds_18_tflecparnom = AV78TFLecParNom ;
      AV102Tlectorwwds_19_tflecparnom_sel = AV79TFLecParNom_Sel ;
      AV103Tlectorwwds_20_tflechor = AV34TFLecHor ;
      AV104Tlectorwwds_21_tflechor_sel = AV35TFLecHor_Sel ;
      AV105Tlectorwwds_22_tflecfec = AV36TFLecFec ;
      AV106Tlectorwwds_23_tflectipent = AV38TFLecTipEnt ;
      AV107Tlectorwwds_24_tflectipent_sel = AV39TFLecTipEnt_Sel ;
      AV108Tlectorwwds_25_tflecestado_sels = AV70TFLecEstado_Sels ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A13722LecEstado ,
                                           AV108Tlectorwwds_25_tflecestado_sels ,
                                           AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                           AV85Tlectorwwds_2_tflecmaqcod ,
                                           AV88Tlectorwwds_5_tflechdr_sel ,
                                           AV87Tlectorwwds_4_tflechdr ,
                                           Integer.valueOf(AV89Tlectorwwds_6_tflecopecod) ,
                                           Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to) ,
                                           AV94Tlectorwwds_11_tflecfascod_sel ,
                                           AV93Tlectorwwds_10_tflecfascod ,
                                           Short.valueOf(AV97Tlectorwwds_14_tflecfasord) ,
                                           Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to) ,
                                           Short.valueOf(AV99Tlectorwwds_16_tflecparcod) ,
                                           Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to) ,
                                           AV104Tlectorwwds_21_tflechor_sel ,
                                           AV103Tlectorwwds_20_tflechor ,
                                           AV105Tlectorwwds_22_tflecfec ,
                                           AV107Tlectorwwds_24_tflectipent_sel ,
                                           AV106Tlectorwwds_23_tflectipent ,
                                           A1166LecMaqCod ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           AV84Tlectorwwds_1_filterfulltext ,
                                           A13721LecHdr ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           AV92Tlectorwwds_9_tflecopenom_sel ,
                                           AV91Tlectorwwds_8_tflecopenom ,
                                           AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                           AV95Tlectorwwds_12_tflecfasdsc ,
                                           AV102Tlectorwwds_19_tflecparnom_sel ,
                                           AV101Tlectorwwds_18_tflecparnom ,
                                           Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV85Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV85Tlectorwwds_2_tflecmaqcod), 6, "%") ;
      lV87Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV87Tlectorwwds_4_tflechdr), 11, "%") ;
      lV93Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV93Tlectorwwds_10_tflecfascod), 8, "%") ;
      lV103Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV103Tlectorwwds_20_tflechor), 8, "%") ;
      lV106Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV106Tlectorwwds_23_tflectipent), 1, "%") ;
      /* Using cursor P08B65 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()), lV85Tlectorwwds_2_tflecmaqcod, AV86Tlectorwwds_3_tflecmaqcod_sel, lV87Tlectorwwds_4_tflechdr, AV88Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV89Tlectorwwds_6_tflecopecod), Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to), lV93Tlectorwwds_10_tflecfascod, AV94Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV97Tlectorwwds_14_tflecfasord), Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV99Tlectorwwds_16_tflecparcod), Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to), lV103Tlectorwwds_20_tflechor, AV104Tlectorwwds_21_tflechor_sel, AV105Tlectorwwds_22_tflecfec, lV106Tlectorwwds_23_tflectipent, AV107Tlectorwwds_24_tflectipent_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8B66 = false ;
         A1796LecTipEnt = P08B65_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P08B65_n1796LecTipEnt[0] ;
         A1174LecFec = P08B65_A1174LecFec[0] ;
         n1174LecFec = P08B65_n1174LecFec[0] ;
         A1173LecHor = P08B65_A1173LecHor[0] ;
         n1173LecHor = P08B65_n1173LecHor[0] ;
         A13721LecHdr = P08B65_A13721LecHdr[0] ;
         A1166LecMaqCod = P08B65_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P08B65_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08B65_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08B65_A1169LecBarPar[0] ;
         n1169LecBarPar = P08B65_n1169LecBarPar[0] ;
         A1168LecBarReo = P08B65_A1168LecBarReo[0] ;
         n1168LecBarReo = P08B65_n1168LecBarReo[0] ;
         A1167LecBarCod = P08B65_A1167LecBarCod[0] ;
         n1167LecBarCod = P08B65_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08B65_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08B65_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08B65_A1171LecFasCod[0] ;
         n1171LecFasCod = P08B65_n1171LecFasCod[0] ;
         A1172LecParCod = P08B65_A1172LecParCod[0] ;
         n1172LecParCod = P08B65_n1172LecParCod[0] ;
         A396EmprCod = P08B65_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( ( AV108Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV108Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
         {
            GXt_char2 = A14259lecOpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
            tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A14259lecOpeNom = GXt_char2 ;
            if ( ! ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV91Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV91Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV92Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
               {
                  GXt_char2 = A14260LecFasDsc ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                  tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                  A14260LecFasDsc = GXt_char2 ;
                  if ( ! ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV95Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV95Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV96Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                     {
                        GXt_char2 = A14261LecParNom ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                        tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                        A14261LecParNom = GXt_char2 ;
                        if ( (GXutil.strcmp("", AV84Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV101Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV101Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV102Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                              {
                                 AV52count = 0 ;
                                 while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08B65_A1171LecFasCod[0], A1171LecFasCod) == 0 ) )
                                 {
                                    brk8B66 = false ;
                                    A1166LecMaqCod = P08B65_A1166LecMaqCod[0] ;
                                    A396EmprCod = P08B65_A396EmprCod[0] ;
                                    AV52count = (long)(AV52count+1) ;
                                    brk8B66 = true ;
                                    pr_default.readNext(3);
                                 }
                                 if ( ! (GXutil.strcmp("", A1171LecFasCod)==0) )
                                 {
                                    AV44Option = A1171LecFasCod ;
                                    AV45Options.add(AV44Option, 0);
                                    AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV45Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8B66 )
         {
            brk8B66 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLECFASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV76TFLecFasDsc = AV40SearchTxt ;
      AV77TFLecFasDsc_Sel = "" ;
      AV84Tlectorwwds_1_filterfulltext = AV73FilterFullText ;
      AV85Tlectorwwds_2_tflecmaqcod = AV10TFLecMaqCod ;
      AV86Tlectorwwds_3_tflecmaqcod_sel = AV11TFLecMaqCod_Sel ;
      AV87Tlectorwwds_4_tflechdr = AV71TFLecHdr ;
      AV88Tlectorwwds_5_tflechdr_sel = AV72TFLecHdr_Sel ;
      AV89Tlectorwwds_6_tflecopecod = AV20TFLecOpeCod ;
      AV90Tlectorwwds_7_tflecopecod_to = AV21TFLecOpeCod_To ;
      AV91Tlectorwwds_8_tflecopenom = AV74TFlecOpeNom ;
      AV92Tlectorwwds_9_tflecopenom_sel = AV75TFlecOpeNom_Sel ;
      AV93Tlectorwwds_10_tflecfascod = AV24TFLecFasCod ;
      AV94Tlectorwwds_11_tflecfascod_sel = AV25TFLecFasCod_Sel ;
      AV95Tlectorwwds_12_tflecfasdsc = AV76TFLecFasDsc ;
      AV96Tlectorwwds_13_tflecfasdsc_sel = AV77TFLecFasDsc_Sel ;
      AV97Tlectorwwds_14_tflecfasord = AV28TFLecFasOrd ;
      AV98Tlectorwwds_15_tflecfasord_to = AV29TFLecFasOrd_To ;
      AV99Tlectorwwds_16_tflecparcod = AV30TFLecParCod ;
      AV100Tlectorwwds_17_tflecparcod_to = AV31TFLecParCod_To ;
      AV101Tlectorwwds_18_tflecparnom = AV78TFLecParNom ;
      AV102Tlectorwwds_19_tflecparnom_sel = AV79TFLecParNom_Sel ;
      AV103Tlectorwwds_20_tflechor = AV34TFLecHor ;
      AV104Tlectorwwds_21_tflechor_sel = AV35TFLecHor_Sel ;
      AV105Tlectorwwds_22_tflecfec = AV36TFLecFec ;
      AV106Tlectorwwds_23_tflectipent = AV38TFLecTipEnt ;
      AV107Tlectorwwds_24_tflectipent_sel = AV39TFLecTipEnt_Sel ;
      AV108Tlectorwwds_25_tflecestado_sels = AV70TFLecEstado_Sels ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A13722LecEstado ,
                                           AV108Tlectorwwds_25_tflecestado_sels ,
                                           AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                           AV85Tlectorwwds_2_tflecmaqcod ,
                                           AV88Tlectorwwds_5_tflechdr_sel ,
                                           AV87Tlectorwwds_4_tflechdr ,
                                           Integer.valueOf(AV89Tlectorwwds_6_tflecopecod) ,
                                           Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to) ,
                                           AV94Tlectorwwds_11_tflecfascod_sel ,
                                           AV93Tlectorwwds_10_tflecfascod ,
                                           Short.valueOf(AV97Tlectorwwds_14_tflecfasord) ,
                                           Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to) ,
                                           Short.valueOf(AV99Tlectorwwds_16_tflecparcod) ,
                                           Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to) ,
                                           AV104Tlectorwwds_21_tflechor_sel ,
                                           AV103Tlectorwwds_20_tflechor ,
                                           AV105Tlectorwwds_22_tflecfec ,
                                           AV107Tlectorwwds_24_tflectipent_sel ,
                                           AV106Tlectorwwds_23_tflectipent ,
                                           A1166LecMaqCod ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           AV84Tlectorwwds_1_filterfulltext ,
                                           A13721LecHdr ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           AV92Tlectorwwds_9_tflecopenom_sel ,
                                           AV91Tlectorwwds_8_tflecopenom ,
                                           AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                           AV95Tlectorwwds_12_tflecfasdsc ,
                                           AV102Tlectorwwds_19_tflecparnom_sel ,
                                           AV101Tlectorwwds_18_tflecparnom ,
                                           Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV85Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV85Tlectorwwds_2_tflecmaqcod), 6, "%") ;
      lV87Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV87Tlectorwwds_4_tflechdr), 11, "%") ;
      lV93Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV93Tlectorwwds_10_tflecfascod), 8, "%") ;
      lV103Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV103Tlectorwwds_20_tflechor), 8, "%") ;
      lV106Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV106Tlectorwwds_23_tflectipent), 1, "%") ;
      /* Using cursor P08B66 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()), lV85Tlectorwwds_2_tflecmaqcod, AV86Tlectorwwds_3_tflecmaqcod_sel, lV87Tlectorwwds_4_tflechdr, AV88Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV89Tlectorwwds_6_tflecopecod), Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to), lV93Tlectorwwds_10_tflecfascod, AV94Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV97Tlectorwwds_14_tflecfasord), Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV99Tlectorwwds_16_tflecparcod), Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to), lV103Tlectorwwds_20_tflechor, AV104Tlectorwwds_21_tflechor_sel, AV105Tlectorwwds_22_tflecfec, lV106Tlectorwwds_23_tflectipent, AV107Tlectorwwds_24_tflectipent_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1796LecTipEnt = P08B66_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P08B66_n1796LecTipEnt[0] ;
         A1174LecFec = P08B66_A1174LecFec[0] ;
         n1174LecFec = P08B66_n1174LecFec[0] ;
         A1173LecHor = P08B66_A1173LecHor[0] ;
         n1173LecHor = P08B66_n1173LecHor[0] ;
         A13721LecHdr = P08B66_A13721LecHdr[0] ;
         A1166LecMaqCod = P08B66_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P08B66_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08B66_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08B66_A1169LecBarPar[0] ;
         n1169LecBarPar = P08B66_n1169LecBarPar[0] ;
         A1168LecBarReo = P08B66_A1168LecBarReo[0] ;
         n1168LecBarReo = P08B66_n1168LecBarReo[0] ;
         A1167LecBarCod = P08B66_A1167LecBarCod[0] ;
         n1167LecBarCod = P08B66_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08B66_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08B66_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08B66_A1171LecFasCod[0] ;
         n1171LecFasCod = P08B66_n1171LecFasCod[0] ;
         A1172LecParCod = P08B66_A1172LecParCod[0] ;
         n1172LecParCod = P08B66_n1172LecParCod[0] ;
         A396EmprCod = P08B66_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( ( AV108Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV108Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
         {
            GXt_char2 = A14259lecOpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
            tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A14259lecOpeNom = GXt_char2 ;
            if ( ! ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV91Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV91Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV92Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
               {
                  GXt_char2 = A14260LecFasDsc ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                  tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                  A14260LecFasDsc = GXt_char2 ;
                  if ( ! ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV95Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV95Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV96Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                     {
                        GXt_char2 = A14261LecParNom ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                        tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                        A14261LecParNom = GXt_char2 ;
                        if ( (GXutil.strcmp("", AV84Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV101Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV101Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV102Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                              {
                                 if ( ! (GXutil.strcmp("", A14260LecFasDsc)==0) )
                                 {
                                    AV44Option = A14260LecFasDsc ;
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
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADLECPARNOMOPTIONS' Routine */
      returnInSub = false ;
      AV78TFLecParNom = AV40SearchTxt ;
      AV79TFLecParNom_Sel = "" ;
      AV84Tlectorwwds_1_filterfulltext = AV73FilterFullText ;
      AV85Tlectorwwds_2_tflecmaqcod = AV10TFLecMaqCod ;
      AV86Tlectorwwds_3_tflecmaqcod_sel = AV11TFLecMaqCod_Sel ;
      AV87Tlectorwwds_4_tflechdr = AV71TFLecHdr ;
      AV88Tlectorwwds_5_tflechdr_sel = AV72TFLecHdr_Sel ;
      AV89Tlectorwwds_6_tflecopecod = AV20TFLecOpeCod ;
      AV90Tlectorwwds_7_tflecopecod_to = AV21TFLecOpeCod_To ;
      AV91Tlectorwwds_8_tflecopenom = AV74TFlecOpeNom ;
      AV92Tlectorwwds_9_tflecopenom_sel = AV75TFlecOpeNom_Sel ;
      AV93Tlectorwwds_10_tflecfascod = AV24TFLecFasCod ;
      AV94Tlectorwwds_11_tflecfascod_sel = AV25TFLecFasCod_Sel ;
      AV95Tlectorwwds_12_tflecfasdsc = AV76TFLecFasDsc ;
      AV96Tlectorwwds_13_tflecfasdsc_sel = AV77TFLecFasDsc_Sel ;
      AV97Tlectorwwds_14_tflecfasord = AV28TFLecFasOrd ;
      AV98Tlectorwwds_15_tflecfasord_to = AV29TFLecFasOrd_To ;
      AV99Tlectorwwds_16_tflecparcod = AV30TFLecParCod ;
      AV100Tlectorwwds_17_tflecparcod_to = AV31TFLecParCod_To ;
      AV101Tlectorwwds_18_tflecparnom = AV78TFLecParNom ;
      AV102Tlectorwwds_19_tflecparnom_sel = AV79TFLecParNom_Sel ;
      AV103Tlectorwwds_20_tflechor = AV34TFLecHor ;
      AV104Tlectorwwds_21_tflechor_sel = AV35TFLecHor_Sel ;
      AV105Tlectorwwds_22_tflecfec = AV36TFLecFec ;
      AV106Tlectorwwds_23_tflectipent = AV38TFLecTipEnt ;
      AV107Tlectorwwds_24_tflectipent_sel = AV39TFLecTipEnt_Sel ;
      AV108Tlectorwwds_25_tflecestado_sels = AV70TFLecEstado_Sels ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A13722LecEstado ,
                                           AV108Tlectorwwds_25_tflecestado_sels ,
                                           AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                           AV85Tlectorwwds_2_tflecmaqcod ,
                                           AV88Tlectorwwds_5_tflechdr_sel ,
                                           AV87Tlectorwwds_4_tflechdr ,
                                           Integer.valueOf(AV89Tlectorwwds_6_tflecopecod) ,
                                           Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to) ,
                                           AV94Tlectorwwds_11_tflecfascod_sel ,
                                           AV93Tlectorwwds_10_tflecfascod ,
                                           Short.valueOf(AV97Tlectorwwds_14_tflecfasord) ,
                                           Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to) ,
                                           Short.valueOf(AV99Tlectorwwds_16_tflecparcod) ,
                                           Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to) ,
                                           AV104Tlectorwwds_21_tflechor_sel ,
                                           AV103Tlectorwwds_20_tflechor ,
                                           AV105Tlectorwwds_22_tflecfec ,
                                           AV107Tlectorwwds_24_tflectipent_sel ,
                                           AV106Tlectorwwds_23_tflectipent ,
                                           A1166LecMaqCod ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           AV84Tlectorwwds_1_filterfulltext ,
                                           A13721LecHdr ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           AV92Tlectorwwds_9_tflecopenom_sel ,
                                           AV91Tlectorwwds_8_tflecopenom ,
                                           AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                           AV95Tlectorwwds_12_tflecfasdsc ,
                                           AV102Tlectorwwds_19_tflecparnom_sel ,
                                           AV101Tlectorwwds_18_tflecparnom ,
                                           Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV85Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV85Tlectorwwds_2_tflecmaqcod), 6, "%") ;
      lV87Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV87Tlectorwwds_4_tflechdr), 11, "%") ;
      lV93Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV93Tlectorwwds_10_tflecfascod), 8, "%") ;
      lV103Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV103Tlectorwwds_20_tflechor), 8, "%") ;
      lV106Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV106Tlectorwwds_23_tflectipent), 1, "%") ;
      /* Using cursor P08B67 */
      pr_default.execute(5, new Object[] {Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()), lV85Tlectorwwds_2_tflecmaqcod, AV86Tlectorwwds_3_tflecmaqcod_sel, lV87Tlectorwwds_4_tflechdr, AV88Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV89Tlectorwwds_6_tflecopecod), Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to), lV93Tlectorwwds_10_tflecfascod, AV94Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV97Tlectorwwds_14_tflecfasord), Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV99Tlectorwwds_16_tflecparcod), Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to), lV103Tlectorwwds_20_tflechor, AV104Tlectorwwds_21_tflechor_sel, AV105Tlectorwwds_22_tflecfec, lV106Tlectorwwds_23_tflectipent, AV107Tlectorwwds_24_tflectipent_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A1796LecTipEnt = P08B67_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P08B67_n1796LecTipEnt[0] ;
         A1174LecFec = P08B67_A1174LecFec[0] ;
         n1174LecFec = P08B67_n1174LecFec[0] ;
         A1173LecHor = P08B67_A1173LecHor[0] ;
         n1173LecHor = P08B67_n1173LecHor[0] ;
         A13721LecHdr = P08B67_A13721LecHdr[0] ;
         A1166LecMaqCod = P08B67_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P08B67_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08B67_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08B67_A1169LecBarPar[0] ;
         n1169LecBarPar = P08B67_n1169LecBarPar[0] ;
         A1168LecBarReo = P08B67_A1168LecBarReo[0] ;
         n1168LecBarReo = P08B67_n1168LecBarReo[0] ;
         A1167LecBarCod = P08B67_A1167LecBarCod[0] ;
         n1167LecBarCod = P08B67_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08B67_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08B67_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08B67_A1171LecFasCod[0] ;
         n1171LecFasCod = P08B67_n1171LecFasCod[0] ;
         A1172LecParCod = P08B67_A1172LecParCod[0] ;
         n1172LecParCod = P08B67_n1172LecParCod[0] ;
         A396EmprCod = P08B67_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( ( AV108Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV108Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
         {
            GXt_char2 = A14259lecOpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
            tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A14259lecOpeNom = GXt_char2 ;
            if ( ! ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV91Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV91Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV92Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
               {
                  GXt_char2 = A14260LecFasDsc ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                  tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                  A14260LecFasDsc = GXt_char2 ;
                  if ( ! ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV95Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV95Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV96Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                     {
                        GXt_char2 = A14261LecParNom ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                        tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                        A14261LecParNom = GXt_char2 ;
                        if ( (GXutil.strcmp("", AV84Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV101Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV101Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV102Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                              {
                                 if ( ! (GXutil.strcmp("", A14261LecParNom)==0) )
                                 {
                                    AV44Option = A14261LecParNom ;
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
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADLECHOROPTIONS' Routine */
      returnInSub = false ;
      AV34TFLecHor = AV40SearchTxt ;
      AV35TFLecHor_Sel = "" ;
      AV84Tlectorwwds_1_filterfulltext = AV73FilterFullText ;
      AV85Tlectorwwds_2_tflecmaqcod = AV10TFLecMaqCod ;
      AV86Tlectorwwds_3_tflecmaqcod_sel = AV11TFLecMaqCod_Sel ;
      AV87Tlectorwwds_4_tflechdr = AV71TFLecHdr ;
      AV88Tlectorwwds_5_tflechdr_sel = AV72TFLecHdr_Sel ;
      AV89Tlectorwwds_6_tflecopecod = AV20TFLecOpeCod ;
      AV90Tlectorwwds_7_tflecopecod_to = AV21TFLecOpeCod_To ;
      AV91Tlectorwwds_8_tflecopenom = AV74TFlecOpeNom ;
      AV92Tlectorwwds_9_tflecopenom_sel = AV75TFlecOpeNom_Sel ;
      AV93Tlectorwwds_10_tflecfascod = AV24TFLecFasCod ;
      AV94Tlectorwwds_11_tflecfascod_sel = AV25TFLecFasCod_Sel ;
      AV95Tlectorwwds_12_tflecfasdsc = AV76TFLecFasDsc ;
      AV96Tlectorwwds_13_tflecfasdsc_sel = AV77TFLecFasDsc_Sel ;
      AV97Tlectorwwds_14_tflecfasord = AV28TFLecFasOrd ;
      AV98Tlectorwwds_15_tflecfasord_to = AV29TFLecFasOrd_To ;
      AV99Tlectorwwds_16_tflecparcod = AV30TFLecParCod ;
      AV100Tlectorwwds_17_tflecparcod_to = AV31TFLecParCod_To ;
      AV101Tlectorwwds_18_tflecparnom = AV78TFLecParNom ;
      AV102Tlectorwwds_19_tflecparnom_sel = AV79TFLecParNom_Sel ;
      AV103Tlectorwwds_20_tflechor = AV34TFLecHor ;
      AV104Tlectorwwds_21_tflechor_sel = AV35TFLecHor_Sel ;
      AV105Tlectorwwds_22_tflecfec = AV36TFLecFec ;
      AV106Tlectorwwds_23_tflectipent = AV38TFLecTipEnt ;
      AV107Tlectorwwds_24_tflectipent_sel = AV39TFLecTipEnt_Sel ;
      AV108Tlectorwwds_25_tflecestado_sels = AV70TFLecEstado_Sels ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A13722LecEstado ,
                                           AV108Tlectorwwds_25_tflecestado_sels ,
                                           AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                           AV85Tlectorwwds_2_tflecmaqcod ,
                                           AV88Tlectorwwds_5_tflechdr_sel ,
                                           AV87Tlectorwwds_4_tflechdr ,
                                           Integer.valueOf(AV89Tlectorwwds_6_tflecopecod) ,
                                           Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to) ,
                                           AV94Tlectorwwds_11_tflecfascod_sel ,
                                           AV93Tlectorwwds_10_tflecfascod ,
                                           Short.valueOf(AV97Tlectorwwds_14_tflecfasord) ,
                                           Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to) ,
                                           Short.valueOf(AV99Tlectorwwds_16_tflecparcod) ,
                                           Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to) ,
                                           AV104Tlectorwwds_21_tflechor_sel ,
                                           AV103Tlectorwwds_20_tflechor ,
                                           AV105Tlectorwwds_22_tflecfec ,
                                           AV107Tlectorwwds_24_tflectipent_sel ,
                                           AV106Tlectorwwds_23_tflectipent ,
                                           A1166LecMaqCod ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           AV84Tlectorwwds_1_filterfulltext ,
                                           A13721LecHdr ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           AV92Tlectorwwds_9_tflecopenom_sel ,
                                           AV91Tlectorwwds_8_tflecopenom ,
                                           AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                           AV95Tlectorwwds_12_tflecfasdsc ,
                                           AV102Tlectorwwds_19_tflecparnom_sel ,
                                           AV101Tlectorwwds_18_tflecparnom ,
                                           Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV85Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV85Tlectorwwds_2_tflecmaqcod), 6, "%") ;
      lV87Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV87Tlectorwwds_4_tflechdr), 11, "%") ;
      lV93Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV93Tlectorwwds_10_tflecfascod), 8, "%") ;
      lV103Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV103Tlectorwwds_20_tflechor), 8, "%") ;
      lV106Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV106Tlectorwwds_23_tflectipent), 1, "%") ;
      /* Using cursor P08B68 */
      pr_default.execute(6, new Object[] {Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()), lV85Tlectorwwds_2_tflecmaqcod, AV86Tlectorwwds_3_tflecmaqcod_sel, lV87Tlectorwwds_4_tflechdr, AV88Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV89Tlectorwwds_6_tflecopecod), Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to), lV93Tlectorwwds_10_tflecfascod, AV94Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV97Tlectorwwds_14_tflecfasord), Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV99Tlectorwwds_16_tflecparcod), Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to), lV103Tlectorwwds_20_tflechor, AV104Tlectorwwds_21_tflechor_sel, AV105Tlectorwwds_22_tflecfec, lV106Tlectorwwds_23_tflectipent, AV107Tlectorwwds_24_tflectipent_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8B610 = false ;
         A1173LecHor = P08B68_A1173LecHor[0] ;
         n1173LecHor = P08B68_n1173LecHor[0] ;
         A1796LecTipEnt = P08B68_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P08B68_n1796LecTipEnt[0] ;
         A1174LecFec = P08B68_A1174LecFec[0] ;
         n1174LecFec = P08B68_n1174LecFec[0] ;
         A13721LecHdr = P08B68_A13721LecHdr[0] ;
         A1166LecMaqCod = P08B68_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P08B68_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08B68_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08B68_A1169LecBarPar[0] ;
         n1169LecBarPar = P08B68_n1169LecBarPar[0] ;
         A1168LecBarReo = P08B68_A1168LecBarReo[0] ;
         n1168LecBarReo = P08B68_n1168LecBarReo[0] ;
         A1167LecBarCod = P08B68_A1167LecBarCod[0] ;
         n1167LecBarCod = P08B68_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08B68_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08B68_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08B68_A1171LecFasCod[0] ;
         n1171LecFasCod = P08B68_n1171LecFasCod[0] ;
         A1172LecParCod = P08B68_A1172LecParCod[0] ;
         n1172LecParCod = P08B68_n1172LecParCod[0] ;
         A396EmprCod = P08B68_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( ( AV108Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV108Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
         {
            GXt_char2 = A14259lecOpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
            tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A14259lecOpeNom = GXt_char2 ;
            if ( ! ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV91Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV91Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV92Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
               {
                  GXt_char2 = A14260LecFasDsc ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                  tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                  A14260LecFasDsc = GXt_char2 ;
                  if ( ! ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV95Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV95Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV96Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                     {
                        GXt_char2 = A14261LecParNom ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                        tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                        A14261LecParNom = GXt_char2 ;
                        if ( (GXutil.strcmp("", AV84Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV101Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV101Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV102Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                              {
                                 AV52count = 0 ;
                                 while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08B68_A1173LecHor[0], A1173LecHor) == 0 ) )
                                 {
                                    brk8B610 = false ;
                                    A1166LecMaqCod = P08B68_A1166LecMaqCod[0] ;
                                    A396EmprCod = P08B68_A396EmprCod[0] ;
                                    AV52count = (long)(AV52count+1) ;
                                    brk8B610 = true ;
                                    pr_default.readNext(6);
                                 }
                                 if ( ! (GXutil.strcmp("", A1173LecHor)==0) )
                                 {
                                    AV44Option = A1173LecHor ;
                                    AV45Options.add(AV44Option, 0);
                                    AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV45Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8B610 )
         {
            brk8B610 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADLECTIPENTOPTIONS' Routine */
      returnInSub = false ;
      AV38TFLecTipEnt = AV40SearchTxt ;
      AV39TFLecTipEnt_Sel = "" ;
      AV84Tlectorwwds_1_filterfulltext = AV73FilterFullText ;
      AV85Tlectorwwds_2_tflecmaqcod = AV10TFLecMaqCod ;
      AV86Tlectorwwds_3_tflecmaqcod_sel = AV11TFLecMaqCod_Sel ;
      AV87Tlectorwwds_4_tflechdr = AV71TFLecHdr ;
      AV88Tlectorwwds_5_tflechdr_sel = AV72TFLecHdr_Sel ;
      AV89Tlectorwwds_6_tflecopecod = AV20TFLecOpeCod ;
      AV90Tlectorwwds_7_tflecopecod_to = AV21TFLecOpeCod_To ;
      AV91Tlectorwwds_8_tflecopenom = AV74TFlecOpeNom ;
      AV92Tlectorwwds_9_tflecopenom_sel = AV75TFlecOpeNom_Sel ;
      AV93Tlectorwwds_10_tflecfascod = AV24TFLecFasCod ;
      AV94Tlectorwwds_11_tflecfascod_sel = AV25TFLecFasCod_Sel ;
      AV95Tlectorwwds_12_tflecfasdsc = AV76TFLecFasDsc ;
      AV96Tlectorwwds_13_tflecfasdsc_sel = AV77TFLecFasDsc_Sel ;
      AV97Tlectorwwds_14_tflecfasord = AV28TFLecFasOrd ;
      AV98Tlectorwwds_15_tflecfasord_to = AV29TFLecFasOrd_To ;
      AV99Tlectorwwds_16_tflecparcod = AV30TFLecParCod ;
      AV100Tlectorwwds_17_tflecparcod_to = AV31TFLecParCod_To ;
      AV101Tlectorwwds_18_tflecparnom = AV78TFLecParNom ;
      AV102Tlectorwwds_19_tflecparnom_sel = AV79TFLecParNom_Sel ;
      AV103Tlectorwwds_20_tflechor = AV34TFLecHor ;
      AV104Tlectorwwds_21_tflechor_sel = AV35TFLecHor_Sel ;
      AV105Tlectorwwds_22_tflecfec = AV36TFLecFec ;
      AV106Tlectorwwds_23_tflectipent = AV38TFLecTipEnt ;
      AV107Tlectorwwds_24_tflectipent_sel = AV39TFLecTipEnt_Sel ;
      AV108Tlectorwwds_25_tflecestado_sels = AV70TFLecEstado_Sels ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A13722LecEstado ,
                                           AV108Tlectorwwds_25_tflecestado_sels ,
                                           AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                           AV85Tlectorwwds_2_tflecmaqcod ,
                                           AV88Tlectorwwds_5_tflechdr_sel ,
                                           AV87Tlectorwwds_4_tflechdr ,
                                           Integer.valueOf(AV89Tlectorwwds_6_tflecopecod) ,
                                           Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to) ,
                                           AV94Tlectorwwds_11_tflecfascod_sel ,
                                           AV93Tlectorwwds_10_tflecfascod ,
                                           Short.valueOf(AV97Tlectorwwds_14_tflecfasord) ,
                                           Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to) ,
                                           Short.valueOf(AV99Tlectorwwds_16_tflecparcod) ,
                                           Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to) ,
                                           AV104Tlectorwwds_21_tflechor_sel ,
                                           AV103Tlectorwwds_20_tflechor ,
                                           AV105Tlectorwwds_22_tflecfec ,
                                           AV107Tlectorwwds_24_tflectipent_sel ,
                                           AV106Tlectorwwds_23_tflectipent ,
                                           A1166LecMaqCod ,
                                           Integer.valueOf(A1167LecBarCod) ,
                                           Byte.valueOf(A1168LecBarReo) ,
                                           A1169LecBarPar ,
                                           Integer.valueOf(A1170LecOpeCod) ,
                                           A1171LecFasCod ,
                                           Short.valueOf(A1188LecFasOrd) ,
                                           Short.valueOf(A1172LecParCod) ,
                                           A1173LecHor ,
                                           A1174LecFec ,
                                           A1796LecTipEnt ,
                                           AV84Tlectorwwds_1_filterfulltext ,
                                           A13721LecHdr ,
                                           A14259lecOpeNom ,
                                           A14260LecFasDsc ,
                                           A14261LecParNom ,
                                           AV92Tlectorwwds_9_tflecopenom_sel ,
                                           AV91Tlectorwwds_8_tflecopenom ,
                                           AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                           AV95Tlectorwwds_12_tflecfasdsc ,
                                           AV102Tlectorwwds_19_tflecparnom_sel ,
                                           AV101Tlectorwwds_18_tflecparnom ,
                                           Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV85Tlectorwwds_2_tflecmaqcod = GXutil.padr( GXutil.rtrim( AV85Tlectorwwds_2_tflecmaqcod), 6, "%") ;
      lV87Tlectorwwds_4_tflechdr = GXutil.padr( GXutil.rtrim( AV87Tlectorwwds_4_tflechdr), 11, "%") ;
      lV93Tlectorwwds_10_tflecfascod = GXutil.padr( GXutil.rtrim( AV93Tlectorwwds_10_tflecfascod), 8, "%") ;
      lV103Tlectorwwds_20_tflechor = GXutil.padr( GXutil.rtrim( AV103Tlectorwwds_20_tflechor), 8, "%") ;
      lV106Tlectorwwds_23_tflectipent = GXutil.padr( GXutil.rtrim( AV106Tlectorwwds_23_tflectipent), 1, "%") ;
      /* Using cursor P08B69 */
      pr_default.execute(7, new Object[] {Integer.valueOf(AV108Tlectorwwds_25_tflecestado_sels.size()), lV85Tlectorwwds_2_tflecmaqcod, AV86Tlectorwwds_3_tflecmaqcod_sel, lV87Tlectorwwds_4_tflechdr, AV88Tlectorwwds_5_tflechdr_sel, Integer.valueOf(AV89Tlectorwwds_6_tflecopecod), Integer.valueOf(AV90Tlectorwwds_7_tflecopecod_to), lV93Tlectorwwds_10_tflecfascod, AV94Tlectorwwds_11_tflecfascod_sel, Short.valueOf(AV97Tlectorwwds_14_tflecfasord), Short.valueOf(AV98Tlectorwwds_15_tflecfasord_to), Short.valueOf(AV99Tlectorwwds_16_tflecparcod), Short.valueOf(AV100Tlectorwwds_17_tflecparcod_to), lV103Tlectorwwds_20_tflechor, AV104Tlectorwwds_21_tflechor_sel, AV105Tlectorwwds_22_tflecfec, lV106Tlectorwwds_23_tflectipent, AV107Tlectorwwds_24_tflectipent_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk8B612 = false ;
         A1796LecTipEnt = P08B69_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P08B69_n1796LecTipEnt[0] ;
         A1174LecFec = P08B69_A1174LecFec[0] ;
         n1174LecFec = P08B69_n1174LecFec[0] ;
         A1173LecHor = P08B69_A1173LecHor[0] ;
         n1173LecHor = P08B69_n1173LecHor[0] ;
         A13721LecHdr = P08B69_A13721LecHdr[0] ;
         A1166LecMaqCod = P08B69_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P08B69_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P08B69_n1188LecFasOrd[0] ;
         A1169LecBarPar = P08B69_A1169LecBarPar[0] ;
         n1169LecBarPar = P08B69_n1169LecBarPar[0] ;
         A1168LecBarReo = P08B69_A1168LecBarReo[0] ;
         n1168LecBarReo = P08B69_n1168LecBarReo[0] ;
         A1167LecBarCod = P08B69_A1167LecBarCod[0] ;
         n1167LecBarCod = P08B69_n1167LecBarCod[0] ;
         A1170LecOpeCod = P08B69_A1170LecOpeCod[0] ;
         n1170LecOpeCod = P08B69_n1170LecOpeCod[0] ;
         A1171LecFasCod = P08B69_A1171LecFasCod[0] ;
         n1171LecFasCod = P08B69_n1171LecFasCod[0] ;
         A1172LecParCod = P08B69_A1172LecParCod[0] ;
         n1172LecParCod = P08B69_n1172LecParCod[0] ;
         A396EmprCod = P08B69_A396EmprCod[0] ;
         GXt_char2 = A13722LecEstado ;
         GXv_char3[0] = GXt_char2 ;
         new app.procedure4(remoteHandle, context).execute( A396EmprCod, A1167LecBarCod, A1168LecBarReo, A1169LecBarPar, A1188LecFasOrd, GXv_char3) ;
         tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13722LecEstado = GXt_char2 ;
         if ( ( AV108Tlectorwwds_25_tflecestado_sels.size() <= 0 ) || ( (AV108Tlectorwwds_25_tflecestado_sels.indexof(GXutil.rtrim( A13722LecEstado))>0) ) )
         {
            GXt_char2 = A14259lecOpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A1170LecOpeCod, GXv_char3) ;
            tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
            A14259lecOpeNom = GXt_char2 ;
            if ( ! ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) && ( ! (GXutil.strcmp("", AV91Tlectorwwds_8_tflecopenom)==0) ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV91Tlectorwwds_8_tflecopenom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV92Tlectorwwds_9_tflecopenom_sel)==0) || ( ( GXutil.strcmp(A14259lecOpeNom, AV92Tlectorwwds_9_tflecopenom_sel) == 0 ) ) )
               {
                  GXt_char2 = A14260LecFasDsc ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1171LecFasCod, GXv_char3) ;
                  tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                  A14260LecFasDsc = GXt_char2 ;
                  if ( ! ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV95Tlectorwwds_12_tflecfasdsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV95Tlectorwwds_12_tflecfasdsc) , 255 , "%"),  ' ' ) ) )
                  {
                     if ( (GXutil.strcmp("", AV96Tlectorwwds_13_tflecfasdsc_sel)==0) || ( ( GXutil.strcmp(A14260LecFasDsc, AV96Tlectorwwds_13_tflecfasdsc_sel) == 0 ) ) )
                     {
                        GXt_char2 = A14261LecParNom ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.pparcodnom(remoteHandle, context).execute( A396EmprCod, A1172LecParCod, GXv_char3) ;
                        tlectorwwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
                        A14261LecParNom = GXt_char2 ;
                        if ( (GXutil.strcmp("", AV84Tlectorwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A1166LecMaqCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13721LecHdr) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1170LecOpeCod, 6, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14259lecOpeNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1171LecFasCod) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14260LecFasDsc) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1188LecFasOrd, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1172LecParCod, 4, 0) , GXutil.padr( "%" + AV84Tlectorwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1173LecHor) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1796LecTipEnt) , GXutil.padr( "%" + GXutil.upper( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proceso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "finalizadas", ""), "") , GXutil.padr( "%" + GXutil.lower( AV84Tlectorwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13722LecEstado, httpContext.getMessage( "F", "")) == 0 ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) && ( ! (GXutil.strcmp("", AV101Tlectorwwds_18_tflecparnom)==0) ) ) || ( GXutil.like( GXutil.upper( A14261LecParNom) , GXutil.padr( "%" + GXutil.upper( AV101Tlectorwwds_18_tflecparnom) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV102Tlectorwwds_19_tflecparnom_sel)==0) || ( ( GXutil.strcmp(A14261LecParNom, AV102Tlectorwwds_19_tflecparnom_sel) == 0 ) ) )
                              {
                                 AV52count = 0 ;
                                 while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08B69_A1796LecTipEnt[0], A1796LecTipEnt) == 0 ) )
                                 {
                                    brk8B612 = false ;
                                    A1166LecMaqCod = P08B69_A1166LecMaqCod[0] ;
                                    A396EmprCod = P08B69_A396EmprCod[0] ;
                                    AV52count = (long)(AV52count+1) ;
                                    brk8B612 = true ;
                                    pr_default.readNext(7);
                                 }
                                 if ( ! (GXutil.strcmp("", A1796LecTipEnt)==0) )
                                 {
                                    AV44Option = A1796LecTipEnt ;
                                    AV45Options.add(AV44Option, 0);
                                    AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                                 }
                                 if ( AV45Options.size() == 50 )
                                 {
                                    /* Exit For each command. Update data (if necessary), close cursors & exit. */
                                    if (true) break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
         if ( ! brk8B612 )
         {
            brk8B612 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tlectorwwgetfilterdata.this.AV46OptionsJson;
      this.aP4[0] = tlectorwwgetfilterdata.this.AV49OptionsDescJson;
      this.aP5[0] = tlectorwwgetfilterdata.this.AV51OptionIndexesJson;
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
      AV73FilterFullText = "" ;
      AV10TFLecMaqCod = "" ;
      AV11TFLecMaqCod_Sel = "" ;
      AV71TFLecHdr = "" ;
      AV72TFLecHdr_Sel = "" ;
      AV74TFlecOpeNom = "" ;
      AV75TFlecOpeNom_Sel = "" ;
      AV24TFLecFasCod = "" ;
      AV25TFLecFasCod_Sel = "" ;
      AV76TFLecFasDsc = "" ;
      AV77TFLecFasDsc_Sel = "" ;
      AV78TFLecParNom = "" ;
      AV79TFLecParNom_Sel = "" ;
      AV34TFLecHor = "" ;
      AV35TFLecHor_Sel = "" ;
      AV36TFLecFec = GXutil.nullDate() ;
      AV38TFLecTipEnt = "" ;
      AV39TFLecTipEnt_Sel = "" ;
      AV69TFLecEstado_SelsJson = "" ;
      AV70TFLecEstado_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A1166LecMaqCod = "" ;
      AV84Tlectorwwds_1_filterfulltext = "" ;
      AV85Tlectorwwds_2_tflecmaqcod = "" ;
      AV86Tlectorwwds_3_tflecmaqcod_sel = "" ;
      AV87Tlectorwwds_4_tflechdr = "" ;
      AV88Tlectorwwds_5_tflechdr_sel = "" ;
      AV91Tlectorwwds_8_tflecopenom = "" ;
      AV92Tlectorwwds_9_tflecopenom_sel = "" ;
      AV93Tlectorwwds_10_tflecfascod = "" ;
      AV94Tlectorwwds_11_tflecfascod_sel = "" ;
      AV95Tlectorwwds_12_tflecfasdsc = "" ;
      AV96Tlectorwwds_13_tflecfasdsc_sel = "" ;
      AV101Tlectorwwds_18_tflecparnom = "" ;
      AV102Tlectorwwds_19_tflecparnom_sel = "" ;
      AV103Tlectorwwds_20_tflechor = "" ;
      AV104Tlectorwwds_21_tflechor_sel = "" ;
      AV105Tlectorwwds_22_tflecfec = GXutil.nullDate() ;
      AV106Tlectorwwds_23_tflectipent = "" ;
      AV107Tlectorwwds_24_tflectipent_sel = "" ;
      AV108Tlectorwwds_25_tflecestado_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV85Tlectorwwds_2_tflecmaqcod = "" ;
      lV87Tlectorwwds_4_tflechdr = "" ;
      lV93Tlectorwwds_10_tflecfascod = "" ;
      lV103Tlectorwwds_20_tflechor = "" ;
      lV106Tlectorwwds_23_tflectipent = "" ;
      A13722LecEstado = "" ;
      A1169LecBarPar = "" ;
      A1171LecFasCod = "" ;
      A1173LecHor = "" ;
      A1174LecFec = GXutil.nullDate() ;
      A1796LecTipEnt = "" ;
      A13721LecHdr = "" ;
      A14259lecOpeNom = "" ;
      A14260LecFasDsc = "" ;
      A14261LecParNom = "" ;
      P08B62_A1166LecMaqCod = new String[] {""} ;
      P08B62_A1796LecTipEnt = new String[] {""} ;
      P08B62_n1796LecTipEnt = new boolean[] {false} ;
      P08B62_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08B62_n1174LecFec = new boolean[] {false} ;
      P08B62_A1173LecHor = new String[] {""} ;
      P08B62_n1173LecHor = new boolean[] {false} ;
      P08B62_A13721LecHdr = new String[] {""} ;
      P08B62_A1188LecFasOrd = new short[1] ;
      P08B62_n1188LecFasOrd = new boolean[] {false} ;
      P08B62_A1169LecBarPar = new String[] {""} ;
      P08B62_n1169LecBarPar = new boolean[] {false} ;
      P08B62_A1168LecBarReo = new byte[1] ;
      P08B62_n1168LecBarReo = new boolean[] {false} ;
      P08B62_A1167LecBarCod = new int[1] ;
      P08B62_n1167LecBarCod = new boolean[] {false} ;
      P08B62_A1170LecOpeCod = new int[1] ;
      P08B62_n1170LecOpeCod = new boolean[] {false} ;
      P08B62_A1171LecFasCod = new String[] {""} ;
      P08B62_n1171LecFasCod = new boolean[] {false} ;
      P08B62_A1172LecParCod = new short[1] ;
      P08B62_n1172LecParCod = new boolean[] {false} ;
      P08B62_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV44Option = "" ;
      P08B63_A1796LecTipEnt = new String[] {""} ;
      P08B63_n1796LecTipEnt = new boolean[] {false} ;
      P08B63_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08B63_n1174LecFec = new boolean[] {false} ;
      P08B63_A1173LecHor = new String[] {""} ;
      P08B63_n1173LecHor = new boolean[] {false} ;
      P08B63_A13721LecHdr = new String[] {""} ;
      P08B63_A1166LecMaqCod = new String[] {""} ;
      P08B63_A1188LecFasOrd = new short[1] ;
      P08B63_n1188LecFasOrd = new boolean[] {false} ;
      P08B63_A1169LecBarPar = new String[] {""} ;
      P08B63_n1169LecBarPar = new boolean[] {false} ;
      P08B63_A1168LecBarReo = new byte[1] ;
      P08B63_n1168LecBarReo = new boolean[] {false} ;
      P08B63_A1167LecBarCod = new int[1] ;
      P08B63_n1167LecBarCod = new boolean[] {false} ;
      P08B63_A1170LecOpeCod = new int[1] ;
      P08B63_n1170LecOpeCod = new boolean[] {false} ;
      P08B63_A1171LecFasCod = new String[] {""} ;
      P08B63_n1171LecFasCod = new boolean[] {false} ;
      P08B63_A1172LecParCod = new short[1] ;
      P08B63_n1172LecParCod = new boolean[] {false} ;
      P08B63_A396EmprCod = new String[] {""} ;
      P08B64_A1796LecTipEnt = new String[] {""} ;
      P08B64_n1796LecTipEnt = new boolean[] {false} ;
      P08B64_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08B64_n1174LecFec = new boolean[] {false} ;
      P08B64_A1173LecHor = new String[] {""} ;
      P08B64_n1173LecHor = new boolean[] {false} ;
      P08B64_A13721LecHdr = new String[] {""} ;
      P08B64_A1166LecMaqCod = new String[] {""} ;
      P08B64_A1188LecFasOrd = new short[1] ;
      P08B64_n1188LecFasOrd = new boolean[] {false} ;
      P08B64_A1169LecBarPar = new String[] {""} ;
      P08B64_n1169LecBarPar = new boolean[] {false} ;
      P08B64_A1168LecBarReo = new byte[1] ;
      P08B64_n1168LecBarReo = new boolean[] {false} ;
      P08B64_A1167LecBarCod = new int[1] ;
      P08B64_n1167LecBarCod = new boolean[] {false} ;
      P08B64_A1170LecOpeCod = new int[1] ;
      P08B64_n1170LecOpeCod = new boolean[] {false} ;
      P08B64_A1171LecFasCod = new String[] {""} ;
      P08B64_n1171LecFasCod = new boolean[] {false} ;
      P08B64_A1172LecParCod = new short[1] ;
      P08B64_n1172LecParCod = new boolean[] {false} ;
      P08B64_A396EmprCod = new String[] {""} ;
      P08B65_A1796LecTipEnt = new String[] {""} ;
      P08B65_n1796LecTipEnt = new boolean[] {false} ;
      P08B65_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08B65_n1174LecFec = new boolean[] {false} ;
      P08B65_A1173LecHor = new String[] {""} ;
      P08B65_n1173LecHor = new boolean[] {false} ;
      P08B65_A13721LecHdr = new String[] {""} ;
      P08B65_A1166LecMaqCod = new String[] {""} ;
      P08B65_A1188LecFasOrd = new short[1] ;
      P08B65_n1188LecFasOrd = new boolean[] {false} ;
      P08B65_A1169LecBarPar = new String[] {""} ;
      P08B65_n1169LecBarPar = new boolean[] {false} ;
      P08B65_A1168LecBarReo = new byte[1] ;
      P08B65_n1168LecBarReo = new boolean[] {false} ;
      P08B65_A1167LecBarCod = new int[1] ;
      P08B65_n1167LecBarCod = new boolean[] {false} ;
      P08B65_A1170LecOpeCod = new int[1] ;
      P08B65_n1170LecOpeCod = new boolean[] {false} ;
      P08B65_A1171LecFasCod = new String[] {""} ;
      P08B65_n1171LecFasCod = new boolean[] {false} ;
      P08B65_A1172LecParCod = new short[1] ;
      P08B65_n1172LecParCod = new boolean[] {false} ;
      P08B65_A396EmprCod = new String[] {""} ;
      P08B66_A1796LecTipEnt = new String[] {""} ;
      P08B66_n1796LecTipEnt = new boolean[] {false} ;
      P08B66_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08B66_n1174LecFec = new boolean[] {false} ;
      P08B66_A1173LecHor = new String[] {""} ;
      P08B66_n1173LecHor = new boolean[] {false} ;
      P08B66_A13721LecHdr = new String[] {""} ;
      P08B66_A1166LecMaqCod = new String[] {""} ;
      P08B66_A1188LecFasOrd = new short[1] ;
      P08B66_n1188LecFasOrd = new boolean[] {false} ;
      P08B66_A1169LecBarPar = new String[] {""} ;
      P08B66_n1169LecBarPar = new boolean[] {false} ;
      P08B66_A1168LecBarReo = new byte[1] ;
      P08B66_n1168LecBarReo = new boolean[] {false} ;
      P08B66_A1167LecBarCod = new int[1] ;
      P08B66_n1167LecBarCod = new boolean[] {false} ;
      P08B66_A1170LecOpeCod = new int[1] ;
      P08B66_n1170LecOpeCod = new boolean[] {false} ;
      P08B66_A1171LecFasCod = new String[] {""} ;
      P08B66_n1171LecFasCod = new boolean[] {false} ;
      P08B66_A1172LecParCod = new short[1] ;
      P08B66_n1172LecParCod = new boolean[] {false} ;
      P08B66_A396EmprCod = new String[] {""} ;
      P08B67_A1796LecTipEnt = new String[] {""} ;
      P08B67_n1796LecTipEnt = new boolean[] {false} ;
      P08B67_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08B67_n1174LecFec = new boolean[] {false} ;
      P08B67_A1173LecHor = new String[] {""} ;
      P08B67_n1173LecHor = new boolean[] {false} ;
      P08B67_A13721LecHdr = new String[] {""} ;
      P08B67_A1166LecMaqCod = new String[] {""} ;
      P08B67_A1188LecFasOrd = new short[1] ;
      P08B67_n1188LecFasOrd = new boolean[] {false} ;
      P08B67_A1169LecBarPar = new String[] {""} ;
      P08B67_n1169LecBarPar = new boolean[] {false} ;
      P08B67_A1168LecBarReo = new byte[1] ;
      P08B67_n1168LecBarReo = new boolean[] {false} ;
      P08B67_A1167LecBarCod = new int[1] ;
      P08B67_n1167LecBarCod = new boolean[] {false} ;
      P08B67_A1170LecOpeCod = new int[1] ;
      P08B67_n1170LecOpeCod = new boolean[] {false} ;
      P08B67_A1171LecFasCod = new String[] {""} ;
      P08B67_n1171LecFasCod = new boolean[] {false} ;
      P08B67_A1172LecParCod = new short[1] ;
      P08B67_n1172LecParCod = new boolean[] {false} ;
      P08B67_A396EmprCod = new String[] {""} ;
      P08B68_A1173LecHor = new String[] {""} ;
      P08B68_n1173LecHor = new boolean[] {false} ;
      P08B68_A1796LecTipEnt = new String[] {""} ;
      P08B68_n1796LecTipEnt = new boolean[] {false} ;
      P08B68_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08B68_n1174LecFec = new boolean[] {false} ;
      P08B68_A13721LecHdr = new String[] {""} ;
      P08B68_A1166LecMaqCod = new String[] {""} ;
      P08B68_A1188LecFasOrd = new short[1] ;
      P08B68_n1188LecFasOrd = new boolean[] {false} ;
      P08B68_A1169LecBarPar = new String[] {""} ;
      P08B68_n1169LecBarPar = new boolean[] {false} ;
      P08B68_A1168LecBarReo = new byte[1] ;
      P08B68_n1168LecBarReo = new boolean[] {false} ;
      P08B68_A1167LecBarCod = new int[1] ;
      P08B68_n1167LecBarCod = new boolean[] {false} ;
      P08B68_A1170LecOpeCod = new int[1] ;
      P08B68_n1170LecOpeCod = new boolean[] {false} ;
      P08B68_A1171LecFasCod = new String[] {""} ;
      P08B68_n1171LecFasCod = new boolean[] {false} ;
      P08B68_A1172LecParCod = new short[1] ;
      P08B68_n1172LecParCod = new boolean[] {false} ;
      P08B68_A396EmprCod = new String[] {""} ;
      P08B69_A1796LecTipEnt = new String[] {""} ;
      P08B69_n1796LecTipEnt = new boolean[] {false} ;
      P08B69_A1174LecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08B69_n1174LecFec = new boolean[] {false} ;
      P08B69_A1173LecHor = new String[] {""} ;
      P08B69_n1173LecHor = new boolean[] {false} ;
      P08B69_A13721LecHdr = new String[] {""} ;
      P08B69_A1166LecMaqCod = new String[] {""} ;
      P08B69_A1188LecFasOrd = new short[1] ;
      P08B69_n1188LecFasOrd = new boolean[] {false} ;
      P08B69_A1169LecBarPar = new String[] {""} ;
      P08B69_n1169LecBarPar = new boolean[] {false} ;
      P08B69_A1168LecBarReo = new byte[1] ;
      P08B69_n1168LecBarReo = new boolean[] {false} ;
      P08B69_A1167LecBarCod = new int[1] ;
      P08B69_n1167LecBarCod = new boolean[] {false} ;
      P08B69_A1170LecOpeCod = new int[1] ;
      P08B69_n1170LecOpeCod = new boolean[] {false} ;
      P08B69_A1171LecFasCod = new String[] {""} ;
      P08B69_n1171LecFasCod = new boolean[] {false} ;
      P08B69_A1172LecParCod = new short[1] ;
      P08B69_n1172LecParCod = new boolean[] {false} ;
      P08B69_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tlectorwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08B62_A1166LecMaqCod, P08B62_A1796LecTipEnt, P08B62_n1796LecTipEnt, P08B62_A1174LecFec, P08B62_n1174LecFec, P08B62_A1173LecHor, P08B62_n1173LecHor, P08B62_A13721LecHdr, P08B62_A1188LecFasOrd, P08B62_n1188LecFasOrd,
            P08B62_A1169LecBarPar, P08B62_n1169LecBarPar, P08B62_A1168LecBarReo, P08B62_n1168LecBarReo, P08B62_A1167LecBarCod, P08B62_n1167LecBarCod, P08B62_A1170LecOpeCod, P08B62_n1170LecOpeCod, P08B62_A1171LecFasCod, P08B62_n1171LecFasCod,
            P08B62_A1172LecParCod, P08B62_n1172LecParCod, P08B62_A396EmprCod
            }
            , new Object[] {
            P08B63_A1796LecTipEnt, P08B63_n1796LecTipEnt, P08B63_A1174LecFec, P08B63_n1174LecFec, P08B63_A1173LecHor, P08B63_n1173LecHor, P08B63_A13721LecHdr, P08B63_A1166LecMaqCod, P08B63_A1188LecFasOrd, P08B63_n1188LecFasOrd,
            P08B63_A1169LecBarPar, P08B63_n1169LecBarPar, P08B63_A1168LecBarReo, P08B63_n1168LecBarReo, P08B63_A1167LecBarCod, P08B63_n1167LecBarCod, P08B63_A1170LecOpeCod, P08B63_n1170LecOpeCod, P08B63_A1171LecFasCod, P08B63_n1171LecFasCod,
            P08B63_A1172LecParCod, P08B63_n1172LecParCod, P08B63_A396EmprCod
            }
            , new Object[] {
            P08B64_A1796LecTipEnt, P08B64_n1796LecTipEnt, P08B64_A1174LecFec, P08B64_n1174LecFec, P08B64_A1173LecHor, P08B64_n1173LecHor, P08B64_A13721LecHdr, P08B64_A1166LecMaqCod, P08B64_A1188LecFasOrd, P08B64_n1188LecFasOrd,
            P08B64_A1169LecBarPar, P08B64_n1169LecBarPar, P08B64_A1168LecBarReo, P08B64_n1168LecBarReo, P08B64_A1167LecBarCod, P08B64_n1167LecBarCod, P08B64_A1170LecOpeCod, P08B64_n1170LecOpeCod, P08B64_A1171LecFasCod, P08B64_n1171LecFasCod,
            P08B64_A1172LecParCod, P08B64_n1172LecParCod, P08B64_A396EmprCod
            }
            , new Object[] {
            P08B65_A1796LecTipEnt, P08B65_n1796LecTipEnt, P08B65_A1174LecFec, P08B65_n1174LecFec, P08B65_A1173LecHor, P08B65_n1173LecHor, P08B65_A13721LecHdr, P08B65_A1166LecMaqCod, P08B65_A1188LecFasOrd, P08B65_n1188LecFasOrd,
            P08B65_A1169LecBarPar, P08B65_n1169LecBarPar, P08B65_A1168LecBarReo, P08B65_n1168LecBarReo, P08B65_A1167LecBarCod, P08B65_n1167LecBarCod, P08B65_A1170LecOpeCod, P08B65_n1170LecOpeCod, P08B65_A1171LecFasCod, P08B65_n1171LecFasCod,
            P08B65_A1172LecParCod, P08B65_n1172LecParCod, P08B65_A396EmprCod
            }
            , new Object[] {
            P08B66_A1796LecTipEnt, P08B66_n1796LecTipEnt, P08B66_A1174LecFec, P08B66_n1174LecFec, P08B66_A1173LecHor, P08B66_n1173LecHor, P08B66_A13721LecHdr, P08B66_A1166LecMaqCod, P08B66_A1188LecFasOrd, P08B66_n1188LecFasOrd,
            P08B66_A1169LecBarPar, P08B66_n1169LecBarPar, P08B66_A1168LecBarReo, P08B66_n1168LecBarReo, P08B66_A1167LecBarCod, P08B66_n1167LecBarCod, P08B66_A1170LecOpeCod, P08B66_n1170LecOpeCod, P08B66_A1171LecFasCod, P08B66_n1171LecFasCod,
            P08B66_A1172LecParCod, P08B66_n1172LecParCod, P08B66_A396EmprCod
            }
            , new Object[] {
            P08B67_A1796LecTipEnt, P08B67_n1796LecTipEnt, P08B67_A1174LecFec, P08B67_n1174LecFec, P08B67_A1173LecHor, P08B67_n1173LecHor, P08B67_A13721LecHdr, P08B67_A1166LecMaqCod, P08B67_A1188LecFasOrd, P08B67_n1188LecFasOrd,
            P08B67_A1169LecBarPar, P08B67_n1169LecBarPar, P08B67_A1168LecBarReo, P08B67_n1168LecBarReo, P08B67_A1167LecBarCod, P08B67_n1167LecBarCod, P08B67_A1170LecOpeCod, P08B67_n1170LecOpeCod, P08B67_A1171LecFasCod, P08B67_n1171LecFasCod,
            P08B67_A1172LecParCod, P08B67_n1172LecParCod, P08B67_A396EmprCod
            }
            , new Object[] {
            P08B68_A1173LecHor, P08B68_n1173LecHor, P08B68_A1796LecTipEnt, P08B68_n1796LecTipEnt, P08B68_A1174LecFec, P08B68_n1174LecFec, P08B68_A13721LecHdr, P08B68_A1166LecMaqCod, P08B68_A1188LecFasOrd, P08B68_n1188LecFasOrd,
            P08B68_A1169LecBarPar, P08B68_n1169LecBarPar, P08B68_A1168LecBarReo, P08B68_n1168LecBarReo, P08B68_A1167LecBarCod, P08B68_n1167LecBarCod, P08B68_A1170LecOpeCod, P08B68_n1170LecOpeCod, P08B68_A1171LecFasCod, P08B68_n1171LecFasCod,
            P08B68_A1172LecParCod, P08B68_n1172LecParCod, P08B68_A396EmprCod
            }
            , new Object[] {
            P08B69_A1796LecTipEnt, P08B69_n1796LecTipEnt, P08B69_A1174LecFec, P08B69_n1174LecFec, P08B69_A1173LecHor, P08B69_n1173LecHor, P08B69_A13721LecHdr, P08B69_A1166LecMaqCod, P08B69_A1188LecFasOrd, P08B69_n1188LecFasOrd,
            P08B69_A1169LecBarPar, P08B69_n1169LecBarPar, P08B69_A1168LecBarReo, P08B69_n1168LecBarReo, P08B69_A1167LecBarCod, P08B69_n1167LecBarCod, P08B69_A1170LecOpeCod, P08B69_n1170LecOpeCod, P08B69_A1171LecFasCod, P08B69_n1171LecFasCod,
            P08B69_A1172LecParCod, P08B69_n1172LecParCod, P08B69_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1168LecBarReo ;
   private short AV28TFLecFasOrd ;
   private short AV29TFLecFasOrd_To ;
   private short AV30TFLecParCod ;
   private short AV31TFLecParCod_To ;
   private short AV97Tlectorwwds_14_tflecfasord ;
   private short AV98Tlectorwwds_15_tflecfasord_to ;
   private short AV99Tlectorwwds_16_tflecparcod ;
   private short AV100Tlectorwwds_17_tflecparcod_to ;
   private short A1188LecFasOrd ;
   private short A1172LecParCod ;
   private short Gx_err ;
   private int AV82GXV1 ;
   private int AV20TFLecOpeCod ;
   private int AV21TFLecOpeCod_To ;
   private int AV89Tlectorwwds_6_tflecopecod ;
   private int AV90Tlectorwwds_7_tflecopecod_to ;
   private int AV108Tlectorwwds_25_tflecestado_sels_size ;
   private int A1167LecBarCod ;
   private int A1170LecOpeCod ;
   private int AV43InsertIndex ;
   private long AV52count ;
   private String AV10TFLecMaqCod ;
   private String AV11TFLecMaqCod_Sel ;
   private String AV71TFLecHdr ;
   private String AV72TFLecHdr_Sel ;
   private String AV74TFlecOpeNom ;
   private String AV75TFlecOpeNom_Sel ;
   private String AV24TFLecFasCod ;
   private String AV25TFLecFasCod_Sel ;
   private String AV76TFLecFasDsc ;
   private String AV77TFLecFasDsc_Sel ;
   private String AV78TFLecParNom ;
   private String AV79TFLecParNom_Sel ;
   private String AV34TFLecHor ;
   private String AV35TFLecHor_Sel ;
   private String AV38TFLecTipEnt ;
   private String AV39TFLecTipEnt_Sel ;
   private String A1166LecMaqCod ;
   private String AV85Tlectorwwds_2_tflecmaqcod ;
   private String AV86Tlectorwwds_3_tflecmaqcod_sel ;
   private String AV87Tlectorwwds_4_tflechdr ;
   private String AV88Tlectorwwds_5_tflechdr_sel ;
   private String AV91Tlectorwwds_8_tflecopenom ;
   private String AV92Tlectorwwds_9_tflecopenom_sel ;
   private String AV93Tlectorwwds_10_tflecfascod ;
   private String AV94Tlectorwwds_11_tflecfascod_sel ;
   private String AV95Tlectorwwds_12_tflecfasdsc ;
   private String AV96Tlectorwwds_13_tflecfasdsc_sel ;
   private String AV101Tlectorwwds_18_tflecparnom ;
   private String AV102Tlectorwwds_19_tflecparnom_sel ;
   private String AV103Tlectorwwds_20_tflechor ;
   private String AV104Tlectorwwds_21_tflechor_sel ;
   private String AV106Tlectorwwds_23_tflectipent ;
   private String AV107Tlectorwwds_24_tflectipent_sel ;
   private String scmdbuf ;
   private String lV85Tlectorwwds_2_tflecmaqcod ;
   private String lV87Tlectorwwds_4_tflechdr ;
   private String lV93Tlectorwwds_10_tflecfascod ;
   private String lV103Tlectorwwds_20_tflechor ;
   private String lV106Tlectorwwds_23_tflectipent ;
   private String A13722LecEstado ;
   private String A1169LecBarPar ;
   private String A1171LecFasCod ;
   private String A1173LecHor ;
   private String A1796LecTipEnt ;
   private String A13721LecHdr ;
   private String A14259lecOpeNom ;
   private String A14260LecFasDsc ;
   private String A14261LecParNom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV36TFLecFec ;
   private java.util.Date AV105Tlectorwwds_22_tflecfec ;
   private java.util.Date A1174LecFec ;
   private boolean returnInSub ;
   private boolean brk8B62 ;
   private boolean n1796LecTipEnt ;
   private boolean n1174LecFec ;
   private boolean n1173LecHor ;
   private boolean n1188LecFasOrd ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private boolean n1170LecOpeCod ;
   private boolean n1171LecFasCod ;
   private boolean n1172LecParCod ;
   private boolean brk8B66 ;
   private boolean brk8B610 ;
   private boolean brk8B612 ;
   private String AV46OptionsJson ;
   private String AV49OptionsDescJson ;
   private String AV51OptionIndexesJson ;
   private String AV69TFLecEstado_SelsJson ;
   private String AV42DDOName ;
   private String AV40SearchTxt ;
   private String AV41SearchTxtTo ;
   private String AV73FilterFullText ;
   private String AV84Tlectorwwds_1_filterfulltext ;
   private String AV44Option ;
   private com.genexus.webpanels.WebSession AV53Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08B62_A1166LecMaqCod ;
   private String[] P08B62_A1796LecTipEnt ;
   private boolean[] P08B62_n1796LecTipEnt ;
   private java.util.Date[] P08B62_A1174LecFec ;
   private boolean[] P08B62_n1174LecFec ;
   private String[] P08B62_A1173LecHor ;
   private boolean[] P08B62_n1173LecHor ;
   private String[] P08B62_A13721LecHdr ;
   private short[] P08B62_A1188LecFasOrd ;
   private boolean[] P08B62_n1188LecFasOrd ;
   private String[] P08B62_A1169LecBarPar ;
   private boolean[] P08B62_n1169LecBarPar ;
   private byte[] P08B62_A1168LecBarReo ;
   private boolean[] P08B62_n1168LecBarReo ;
   private int[] P08B62_A1167LecBarCod ;
   private boolean[] P08B62_n1167LecBarCod ;
   private int[] P08B62_A1170LecOpeCod ;
   private boolean[] P08B62_n1170LecOpeCod ;
   private String[] P08B62_A1171LecFasCod ;
   private boolean[] P08B62_n1171LecFasCod ;
   private short[] P08B62_A1172LecParCod ;
   private boolean[] P08B62_n1172LecParCod ;
   private String[] P08B62_A396EmprCod ;
   private String[] P08B63_A1796LecTipEnt ;
   private boolean[] P08B63_n1796LecTipEnt ;
   private java.util.Date[] P08B63_A1174LecFec ;
   private boolean[] P08B63_n1174LecFec ;
   private String[] P08B63_A1173LecHor ;
   private boolean[] P08B63_n1173LecHor ;
   private String[] P08B63_A13721LecHdr ;
   private String[] P08B63_A1166LecMaqCod ;
   private short[] P08B63_A1188LecFasOrd ;
   private boolean[] P08B63_n1188LecFasOrd ;
   private String[] P08B63_A1169LecBarPar ;
   private boolean[] P08B63_n1169LecBarPar ;
   private byte[] P08B63_A1168LecBarReo ;
   private boolean[] P08B63_n1168LecBarReo ;
   private int[] P08B63_A1167LecBarCod ;
   private boolean[] P08B63_n1167LecBarCod ;
   private int[] P08B63_A1170LecOpeCod ;
   private boolean[] P08B63_n1170LecOpeCod ;
   private String[] P08B63_A1171LecFasCod ;
   private boolean[] P08B63_n1171LecFasCod ;
   private short[] P08B63_A1172LecParCod ;
   private boolean[] P08B63_n1172LecParCod ;
   private String[] P08B63_A396EmprCod ;
   private String[] P08B64_A1796LecTipEnt ;
   private boolean[] P08B64_n1796LecTipEnt ;
   private java.util.Date[] P08B64_A1174LecFec ;
   private boolean[] P08B64_n1174LecFec ;
   private String[] P08B64_A1173LecHor ;
   private boolean[] P08B64_n1173LecHor ;
   private String[] P08B64_A13721LecHdr ;
   private String[] P08B64_A1166LecMaqCod ;
   private short[] P08B64_A1188LecFasOrd ;
   private boolean[] P08B64_n1188LecFasOrd ;
   private String[] P08B64_A1169LecBarPar ;
   private boolean[] P08B64_n1169LecBarPar ;
   private byte[] P08B64_A1168LecBarReo ;
   private boolean[] P08B64_n1168LecBarReo ;
   private int[] P08B64_A1167LecBarCod ;
   private boolean[] P08B64_n1167LecBarCod ;
   private int[] P08B64_A1170LecOpeCod ;
   private boolean[] P08B64_n1170LecOpeCod ;
   private String[] P08B64_A1171LecFasCod ;
   private boolean[] P08B64_n1171LecFasCod ;
   private short[] P08B64_A1172LecParCod ;
   private boolean[] P08B64_n1172LecParCod ;
   private String[] P08B64_A396EmprCod ;
   private String[] P08B65_A1796LecTipEnt ;
   private boolean[] P08B65_n1796LecTipEnt ;
   private java.util.Date[] P08B65_A1174LecFec ;
   private boolean[] P08B65_n1174LecFec ;
   private String[] P08B65_A1173LecHor ;
   private boolean[] P08B65_n1173LecHor ;
   private String[] P08B65_A13721LecHdr ;
   private String[] P08B65_A1166LecMaqCod ;
   private short[] P08B65_A1188LecFasOrd ;
   private boolean[] P08B65_n1188LecFasOrd ;
   private String[] P08B65_A1169LecBarPar ;
   private boolean[] P08B65_n1169LecBarPar ;
   private byte[] P08B65_A1168LecBarReo ;
   private boolean[] P08B65_n1168LecBarReo ;
   private int[] P08B65_A1167LecBarCod ;
   private boolean[] P08B65_n1167LecBarCod ;
   private int[] P08B65_A1170LecOpeCod ;
   private boolean[] P08B65_n1170LecOpeCod ;
   private String[] P08B65_A1171LecFasCod ;
   private boolean[] P08B65_n1171LecFasCod ;
   private short[] P08B65_A1172LecParCod ;
   private boolean[] P08B65_n1172LecParCod ;
   private String[] P08B65_A396EmprCod ;
   private String[] P08B66_A1796LecTipEnt ;
   private boolean[] P08B66_n1796LecTipEnt ;
   private java.util.Date[] P08B66_A1174LecFec ;
   private boolean[] P08B66_n1174LecFec ;
   private String[] P08B66_A1173LecHor ;
   private boolean[] P08B66_n1173LecHor ;
   private String[] P08B66_A13721LecHdr ;
   private String[] P08B66_A1166LecMaqCod ;
   private short[] P08B66_A1188LecFasOrd ;
   private boolean[] P08B66_n1188LecFasOrd ;
   private String[] P08B66_A1169LecBarPar ;
   private boolean[] P08B66_n1169LecBarPar ;
   private byte[] P08B66_A1168LecBarReo ;
   private boolean[] P08B66_n1168LecBarReo ;
   private int[] P08B66_A1167LecBarCod ;
   private boolean[] P08B66_n1167LecBarCod ;
   private int[] P08B66_A1170LecOpeCod ;
   private boolean[] P08B66_n1170LecOpeCod ;
   private String[] P08B66_A1171LecFasCod ;
   private boolean[] P08B66_n1171LecFasCod ;
   private short[] P08B66_A1172LecParCod ;
   private boolean[] P08B66_n1172LecParCod ;
   private String[] P08B66_A396EmprCod ;
   private String[] P08B67_A1796LecTipEnt ;
   private boolean[] P08B67_n1796LecTipEnt ;
   private java.util.Date[] P08B67_A1174LecFec ;
   private boolean[] P08B67_n1174LecFec ;
   private String[] P08B67_A1173LecHor ;
   private boolean[] P08B67_n1173LecHor ;
   private String[] P08B67_A13721LecHdr ;
   private String[] P08B67_A1166LecMaqCod ;
   private short[] P08B67_A1188LecFasOrd ;
   private boolean[] P08B67_n1188LecFasOrd ;
   private String[] P08B67_A1169LecBarPar ;
   private boolean[] P08B67_n1169LecBarPar ;
   private byte[] P08B67_A1168LecBarReo ;
   private boolean[] P08B67_n1168LecBarReo ;
   private int[] P08B67_A1167LecBarCod ;
   private boolean[] P08B67_n1167LecBarCod ;
   private int[] P08B67_A1170LecOpeCod ;
   private boolean[] P08B67_n1170LecOpeCod ;
   private String[] P08B67_A1171LecFasCod ;
   private boolean[] P08B67_n1171LecFasCod ;
   private short[] P08B67_A1172LecParCod ;
   private boolean[] P08B67_n1172LecParCod ;
   private String[] P08B67_A396EmprCod ;
   private String[] P08B68_A1173LecHor ;
   private boolean[] P08B68_n1173LecHor ;
   private String[] P08B68_A1796LecTipEnt ;
   private boolean[] P08B68_n1796LecTipEnt ;
   private java.util.Date[] P08B68_A1174LecFec ;
   private boolean[] P08B68_n1174LecFec ;
   private String[] P08B68_A13721LecHdr ;
   private String[] P08B68_A1166LecMaqCod ;
   private short[] P08B68_A1188LecFasOrd ;
   private boolean[] P08B68_n1188LecFasOrd ;
   private String[] P08B68_A1169LecBarPar ;
   private boolean[] P08B68_n1169LecBarPar ;
   private byte[] P08B68_A1168LecBarReo ;
   private boolean[] P08B68_n1168LecBarReo ;
   private int[] P08B68_A1167LecBarCod ;
   private boolean[] P08B68_n1167LecBarCod ;
   private int[] P08B68_A1170LecOpeCod ;
   private boolean[] P08B68_n1170LecOpeCod ;
   private String[] P08B68_A1171LecFasCod ;
   private boolean[] P08B68_n1171LecFasCod ;
   private short[] P08B68_A1172LecParCod ;
   private boolean[] P08B68_n1172LecParCod ;
   private String[] P08B68_A396EmprCod ;
   private String[] P08B69_A1796LecTipEnt ;
   private boolean[] P08B69_n1796LecTipEnt ;
   private java.util.Date[] P08B69_A1174LecFec ;
   private boolean[] P08B69_n1174LecFec ;
   private String[] P08B69_A1173LecHor ;
   private boolean[] P08B69_n1173LecHor ;
   private String[] P08B69_A13721LecHdr ;
   private String[] P08B69_A1166LecMaqCod ;
   private short[] P08B69_A1188LecFasOrd ;
   private boolean[] P08B69_n1188LecFasOrd ;
   private String[] P08B69_A1169LecBarPar ;
   private boolean[] P08B69_n1169LecBarPar ;
   private byte[] P08B69_A1168LecBarReo ;
   private boolean[] P08B69_n1168LecBarReo ;
   private int[] P08B69_A1167LecBarCod ;
   private boolean[] P08B69_n1167LecBarCod ;
   private int[] P08B69_A1170LecOpeCod ;
   private boolean[] P08B69_n1170LecOpeCod ;
   private String[] P08B69_A1171LecFasCod ;
   private boolean[] P08B69_n1171LecFasCod ;
   private short[] P08B69_A1172LecParCod ;
   private boolean[] P08B69_n1172LecParCod ;
   private String[] P08B69_A396EmprCod ;
   private GXSimpleCollection<String> AV70TFLecEstado_Sels ;
   private GXSimpleCollection<String> AV108Tlectorwwds_25_tflecestado_sels ;
   private GXSimpleCollection<String> AV45Options ;
   private GXSimpleCollection<String> AV48OptionsDesc ;
   private GXSimpleCollection<String> AV50OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV55GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV56GridStateFilterValue ;
}

final  class tlectorwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08B62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV108Tlectorwwds_25_tflecestado_sels ,
                                          String AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV85Tlectorwwds_2_tflecmaqcod ,
                                          String AV88Tlectorwwds_5_tflechdr_sel ,
                                          String AV87Tlectorwwds_4_tflechdr ,
                                          int AV89Tlectorwwds_6_tflecopecod ,
                                          int AV90Tlectorwwds_7_tflecopecod_to ,
                                          String AV94Tlectorwwds_11_tflecfascod_sel ,
                                          String AV93Tlectorwwds_10_tflecfascod ,
                                          short AV97Tlectorwwds_14_tflecfasord ,
                                          short AV98Tlectorwwds_15_tflecfasord_to ,
                                          short AV99Tlectorwwds_16_tflecparcod ,
                                          short AV100Tlectorwwds_17_tflecparcod_to ,
                                          String AV104Tlectorwwds_21_tflechor_sel ,
                                          String AV103Tlectorwwds_20_tflechor ,
                                          java.util.Date AV105Tlectorwwds_22_tflecfec ,
                                          String AV107Tlectorwwds_24_tflectipent_sel ,
                                          String AV106Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          String AV84Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV92Tlectorwwds_9_tflecopenom_sel ,
                                          String AV91Tlectorwwds_8_tflecopenom ,
                                          String AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV95Tlectorwwds_12_tflecfasdsc ,
                                          String AV102Tlectorwwds_19_tflecparnom_sel ,
                                          String AV101Tlectorwwds_18_tflecparnom ,
                                          int AV108Tlectorwwds_25_tflecestado_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[18];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT LecMaqCod, LecTipEnt, LecFec, LecHor, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) ||" ;
      scmdbuf += " COALESCE( LecBarPar, '') AS LecHdr, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV87Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV89Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV90Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV93Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV97Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV98Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV99Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV100Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV103Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV106Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LecMaqCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08B63( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV108Tlectorwwds_25_tflecestado_sels ,
                                          String AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV85Tlectorwwds_2_tflecmaqcod ,
                                          String AV88Tlectorwwds_5_tflechdr_sel ,
                                          String AV87Tlectorwwds_4_tflechdr ,
                                          int AV89Tlectorwwds_6_tflecopecod ,
                                          int AV90Tlectorwwds_7_tflecopecod_to ,
                                          String AV94Tlectorwwds_11_tflecfascod_sel ,
                                          String AV93Tlectorwwds_10_tflecfascod ,
                                          short AV97Tlectorwwds_14_tflecfasord ,
                                          short AV98Tlectorwwds_15_tflecfasord_to ,
                                          short AV99Tlectorwwds_16_tflecparcod ,
                                          short AV100Tlectorwwds_17_tflecparcod_to ,
                                          String AV104Tlectorwwds_21_tflechor_sel ,
                                          String AV103Tlectorwwds_20_tflechor ,
                                          java.util.Date AV105Tlectorwwds_22_tflecfec ,
                                          String AV107Tlectorwwds_24_tflectipent_sel ,
                                          String AV106Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          String AV84Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV92Tlectorwwds_9_tflecopenom_sel ,
                                          String AV91Tlectorwwds_8_tflecopenom ,
                                          String AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV95Tlectorwwds_12_tflecfasdsc ,
                                          String AV102Tlectorwwds_19_tflecparnom_sel ,
                                          String AV101Tlectorwwds_18_tflecparnom ,
                                          int AV108Tlectorwwds_25_tflecestado_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[18];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE(" ;
      scmdbuf += " LecBarPar, '') AS LecHdr, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV87Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV89Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV90Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV93Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV97Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV98Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV99Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV100Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV103Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV106Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, LecMaqCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08B64( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV108Tlectorwwds_25_tflecestado_sels ,
                                          String AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV85Tlectorwwds_2_tflecmaqcod ,
                                          String AV88Tlectorwwds_5_tflechdr_sel ,
                                          String AV87Tlectorwwds_4_tflechdr ,
                                          int AV89Tlectorwwds_6_tflecopecod ,
                                          int AV90Tlectorwwds_7_tflecopecod_to ,
                                          String AV94Tlectorwwds_11_tflecfascod_sel ,
                                          String AV93Tlectorwwds_10_tflecfascod ,
                                          short AV97Tlectorwwds_14_tflecfasord ,
                                          short AV98Tlectorwwds_15_tflecfasord_to ,
                                          short AV99Tlectorwwds_16_tflecparcod ,
                                          short AV100Tlectorwwds_17_tflecparcod_to ,
                                          String AV104Tlectorwwds_21_tflechor_sel ,
                                          String AV103Tlectorwwds_20_tflechor ,
                                          java.util.Date AV105Tlectorwwds_22_tflecfec ,
                                          String AV107Tlectorwwds_24_tflectipent_sel ,
                                          String AV106Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          String AV84Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV92Tlectorwwds_9_tflecopenom_sel ,
                                          String AV91Tlectorwwds_8_tflecopenom ,
                                          String AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV95Tlectorwwds_12_tflecfasdsc ,
                                          String AV102Tlectorwwds_19_tflecparnom_sel ,
                                          String AV101Tlectorwwds_18_tflecparnom ,
                                          int AV108Tlectorwwds_25_tflecestado_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[18];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE(" ;
      scmdbuf += " LecBarPar, '') AS LecHdr, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV87Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV89Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV90Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV93Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV97Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV98Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV99Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV100Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV103Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV106Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, LecMaqCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08B65( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV108Tlectorwwds_25_tflecestado_sels ,
                                          String AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV85Tlectorwwds_2_tflecmaqcod ,
                                          String AV88Tlectorwwds_5_tflechdr_sel ,
                                          String AV87Tlectorwwds_4_tflechdr ,
                                          int AV89Tlectorwwds_6_tflecopecod ,
                                          int AV90Tlectorwwds_7_tflecopecod_to ,
                                          String AV94Tlectorwwds_11_tflecfascod_sel ,
                                          String AV93Tlectorwwds_10_tflecfascod ,
                                          short AV97Tlectorwwds_14_tflecfasord ,
                                          short AV98Tlectorwwds_15_tflecfasord_to ,
                                          short AV99Tlectorwwds_16_tflecparcod ,
                                          short AV100Tlectorwwds_17_tflecparcod_to ,
                                          String AV104Tlectorwwds_21_tflechor_sel ,
                                          String AV103Tlectorwwds_20_tflechor ,
                                          java.util.Date AV105Tlectorwwds_22_tflecfec ,
                                          String AV107Tlectorwwds_24_tflectipent_sel ,
                                          String AV106Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          String AV84Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV92Tlectorwwds_9_tflecopenom_sel ,
                                          String AV91Tlectorwwds_8_tflecopenom ,
                                          String AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV95Tlectorwwds_12_tflecfasdsc ,
                                          String AV102Tlectorwwds_19_tflecparnom_sel ,
                                          String AV101Tlectorwwds_18_tflecparnom ,
                                          int AV108Tlectorwwds_25_tflecestado_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[18];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE(" ;
      scmdbuf += " LecBarPar, '') AS LecHdr, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV87Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV89Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (0==AV90Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV93Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (0==AV97Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV98Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV99Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV100Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV103Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV106Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LecFasCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08B66( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV108Tlectorwwds_25_tflecestado_sels ,
                                          String AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV85Tlectorwwds_2_tflecmaqcod ,
                                          String AV88Tlectorwwds_5_tflechdr_sel ,
                                          String AV87Tlectorwwds_4_tflechdr ,
                                          int AV89Tlectorwwds_6_tflecopecod ,
                                          int AV90Tlectorwwds_7_tflecopecod_to ,
                                          String AV94Tlectorwwds_11_tflecfascod_sel ,
                                          String AV93Tlectorwwds_10_tflecfascod ,
                                          short AV97Tlectorwwds_14_tflecfasord ,
                                          short AV98Tlectorwwds_15_tflecfasord_to ,
                                          short AV99Tlectorwwds_16_tflecparcod ,
                                          short AV100Tlectorwwds_17_tflecparcod_to ,
                                          String AV104Tlectorwwds_21_tflechor_sel ,
                                          String AV103Tlectorwwds_20_tflechor ,
                                          java.util.Date AV105Tlectorwwds_22_tflecfec ,
                                          String AV107Tlectorwwds_24_tflectipent_sel ,
                                          String AV106Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          String AV84Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV92Tlectorwwds_9_tflecopenom_sel ,
                                          String AV91Tlectorwwds_8_tflecopenom ,
                                          String AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV95Tlectorwwds_12_tflecfasdsc ,
                                          String AV102Tlectorwwds_19_tflecparnom_sel ,
                                          String AV101Tlectorwwds_18_tflecparnom ,
                                          int AV108Tlectorwwds_25_tflecestado_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[18];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE(" ;
      scmdbuf += " LecBarPar, '') AS LecHdr, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV87Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV89Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV90Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV93Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (0==AV97Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV98Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (0==AV99Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV100Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV103Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV106Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, LecMaqCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08B67( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV108Tlectorwwds_25_tflecestado_sels ,
                                          String AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV85Tlectorwwds_2_tflecmaqcod ,
                                          String AV88Tlectorwwds_5_tflechdr_sel ,
                                          String AV87Tlectorwwds_4_tflechdr ,
                                          int AV89Tlectorwwds_6_tflecopecod ,
                                          int AV90Tlectorwwds_7_tflecopecod_to ,
                                          String AV94Tlectorwwds_11_tflecfascod_sel ,
                                          String AV93Tlectorwwds_10_tflecfascod ,
                                          short AV97Tlectorwwds_14_tflecfasord ,
                                          short AV98Tlectorwwds_15_tflecfasord_to ,
                                          short AV99Tlectorwwds_16_tflecparcod ,
                                          short AV100Tlectorwwds_17_tflecparcod_to ,
                                          String AV104Tlectorwwds_21_tflechor_sel ,
                                          String AV103Tlectorwwds_20_tflechor ,
                                          java.util.Date AV105Tlectorwwds_22_tflecfec ,
                                          String AV107Tlectorwwds_24_tflectipent_sel ,
                                          String AV106Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          String AV84Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV92Tlectorwwds_9_tflecopenom_sel ,
                                          String AV91Tlectorwwds_8_tflecopenom ,
                                          String AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV95Tlectorwwds_12_tflecfasdsc ,
                                          String AV102Tlectorwwds_19_tflecparnom_sel ,
                                          String AV101Tlectorwwds_18_tflecparnom ,
                                          int AV108Tlectorwwds_25_tflecestado_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[18];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE(" ;
      scmdbuf += " LecBarPar, '') AS LecHdr, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV87Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV89Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV90Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV93Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (0==AV97Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV98Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (0==AV99Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (0==AV100Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV103Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV106Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, LecMaqCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08B68( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV108Tlectorwwds_25_tflecestado_sels ,
                                          String AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV85Tlectorwwds_2_tflecmaqcod ,
                                          String AV88Tlectorwwds_5_tflechdr_sel ,
                                          String AV87Tlectorwwds_4_tflechdr ,
                                          int AV89Tlectorwwds_6_tflecopecod ,
                                          int AV90Tlectorwwds_7_tflecopecod_to ,
                                          String AV94Tlectorwwds_11_tflecfascod_sel ,
                                          String AV93Tlectorwwds_10_tflecfascod ,
                                          short AV97Tlectorwwds_14_tflecfasord ,
                                          short AV98Tlectorwwds_15_tflecfasord_to ,
                                          short AV99Tlectorwwds_16_tflecparcod ,
                                          short AV100Tlectorwwds_17_tflecparcod_to ,
                                          String AV104Tlectorwwds_21_tflechor_sel ,
                                          String AV103Tlectorwwds_20_tflechor ,
                                          java.util.Date AV105Tlectorwwds_22_tflecfec ,
                                          String AV107Tlectorwwds_24_tflectipent_sel ,
                                          String AV106Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          String AV84Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV92Tlectorwwds_9_tflecopenom_sel ,
                                          String AV91Tlectorwwds_8_tflecopenom ,
                                          String AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV95Tlectorwwds_12_tflecfasdsc ,
                                          String AV102Tlectorwwds_19_tflecparnom_sel ,
                                          String AV101Tlectorwwds_18_tflecparnom ,
                                          int AV108Tlectorwwds_25_tflecestado_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[18];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT LecHor, LecTipEnt, LecFec, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE(" ;
      scmdbuf += " LecBarPar, '') AS LecHdr, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int16[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV87Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! (0==AV89Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (0==AV90Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV93Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (0==AV97Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (0==AV98Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (0==AV99Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (0==AV100Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV103Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV106Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LecHor" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P08B69( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13722LecEstado ,
                                          GXSimpleCollection<String> AV108Tlectorwwds_25_tflecestado_sels ,
                                          String AV86Tlectorwwds_3_tflecmaqcod_sel ,
                                          String AV85Tlectorwwds_2_tflecmaqcod ,
                                          String AV88Tlectorwwds_5_tflechdr_sel ,
                                          String AV87Tlectorwwds_4_tflechdr ,
                                          int AV89Tlectorwwds_6_tflecopecod ,
                                          int AV90Tlectorwwds_7_tflecopecod_to ,
                                          String AV94Tlectorwwds_11_tflecfascod_sel ,
                                          String AV93Tlectorwwds_10_tflecfascod ,
                                          short AV97Tlectorwwds_14_tflecfasord ,
                                          short AV98Tlectorwwds_15_tflecfasord_to ,
                                          short AV99Tlectorwwds_16_tflecparcod ,
                                          short AV100Tlectorwwds_17_tflecparcod_to ,
                                          String AV104Tlectorwwds_21_tflechor_sel ,
                                          String AV103Tlectorwwds_20_tflechor ,
                                          java.util.Date AV105Tlectorwwds_22_tflecfec ,
                                          String AV107Tlectorwwds_24_tflectipent_sel ,
                                          String AV106Tlectorwwds_23_tflectipent ,
                                          String A1166LecMaqCod ,
                                          int A1167LecBarCod ,
                                          byte A1168LecBarReo ,
                                          String A1169LecBarPar ,
                                          int A1170LecOpeCod ,
                                          String A1171LecFasCod ,
                                          short A1188LecFasOrd ,
                                          short A1172LecParCod ,
                                          String A1173LecHor ,
                                          java.util.Date A1174LecFec ,
                                          String A1796LecTipEnt ,
                                          String AV84Tlectorwwds_1_filterfulltext ,
                                          String A13721LecHdr ,
                                          String A14259lecOpeNom ,
                                          String A14260LecFasDsc ,
                                          String A14261LecParNom ,
                                          String AV92Tlectorwwds_9_tflecopenom_sel ,
                                          String AV91Tlectorwwds_8_tflecopenom ,
                                          String AV96Tlectorwwds_13_tflecfasdsc_sel ,
                                          String AV95Tlectorwwds_12_tflecfasdsc ,
                                          String AV102Tlectorwwds_19_tflecparnom_sel ,
                                          String AV101Tlectorwwds_18_tflecparnom ,
                                          int AV108Tlectorwwds_25_tflecestado_sels_size )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[18];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT LecTipEnt, LecFec, LecHor, SUBSTR(TO_CHAR(COALESCE( LecBarCod, 0),'99999990'), 2) || '-' || SUBSTR(TO_CHAR(COALESCE( LecBarReo, 0),'90'), 2) || COALESCE(" ;
      scmdbuf += " LecBarPar, '') AS LecHdr, LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, LecOpeCod, LecFasCod, LecParCod, EmprCod FROM TXPLECTOR" ;
      if ( (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV85Tlectorwwds_2_tflecmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tlectorwwds_3_tflecmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(LecMaqCod = ?)");
      }
      else
      {
         GXv_int18[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) && ( ! (GXutil.strcmp("", AV87Tlectorwwds_4_tflechdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tlectorwwds_5_tflechdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(LecBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(LecBarReo,'90'), 2) || LecBarPar = ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( ! (0==AV89Tlectorwwds_6_tflecopecod) )
      {
         addWhere(sWhereString, "(LecOpeCod >= ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (0==AV90Tlectorwwds_7_tflecopecod_to) )
      {
         addWhere(sWhereString, "(LecOpeCod <= ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) && ( ! (GXutil.strcmp("", AV93Tlectorwwds_10_tflecfascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecFasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tlectorwwds_11_tflecfascod_sel)==0) )
      {
         addWhere(sWhereString, "(LecFasCod = ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (0==AV97Tlectorwwds_14_tflecfasord) )
      {
         addWhere(sWhereString, "(LecFasOrd >= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (0==AV98Tlectorwwds_15_tflecfasord_to) )
      {
         addWhere(sWhereString, "(LecFasOrd <= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (0==AV99Tlectorwwds_16_tflecparcod) )
      {
         addWhere(sWhereString, "(LecParCod >= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (0==AV100Tlectorwwds_17_tflecparcod_to) )
      {
         addWhere(sWhereString, "(LecParCod <= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) && ( ! (GXutil.strcmp("", AV103Tlectorwwds_20_tflechor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tlectorwwds_21_tflechor_sel)==0) )
      {
         addWhere(sWhereString, "(LecHor = ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Tlectorwwds_22_tflecfec)) )
      {
         addWhere(sWhereString, "(LecFec >= ?)");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) && ( ! (GXutil.strcmp("", AV106Tlectorwwds_23_tflectipent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LecTipEnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tlectorwwds_24_tflectipent_sel)==0) )
      {
         addWhere(sWhereString, "(LecTipEnt = ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY LecTipEnt" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
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
                  return conditional_P08B62(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() );
            case 1 :
                  return conditional_P08B63(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() );
            case 2 :
                  return conditional_P08B64(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() );
            case 3 :
                  return conditional_P08B65(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() );
            case 4 :
                  return conditional_P08B66(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() );
            case 5 :
                  return conditional_P08B67(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() );
            case 6 :
                  return conditional_P08B68(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() );
            case 7 :
                  return conditional_P08B69(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08B62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08B63", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08B64", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08B65", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08B66", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08B67", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08B68", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08B69", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 11);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 11);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 11);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 11);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 11);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 11);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 11);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 11);
               ((String[]) buf[7])[0] = rslt.getString(5, 6);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               return;
      }
   }

}

