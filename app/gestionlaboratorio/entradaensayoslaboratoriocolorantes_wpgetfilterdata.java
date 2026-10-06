package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradaensayoslaboratoriocolorantes_wpgetfilterdata extends GXProcedure
{
   public entradaensayoslaboratoriocolorantes_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayoslaboratoriocolorantes_wpgetfilterdata.class ), "" );
   }

   public entradaensayoslaboratoriocolorantes_wpgetfilterdata( int remoteHandle ,
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
      entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.aP5 = new String[] {""};
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
      entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.AV40DDOName = aP0;
      entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.AV41SearchTxt = aP1;
      entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.AV42SearchTxtTo = aP2;
      entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.aP3 = aP3;
      entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.aP4 = aP4;
      entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV30Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV33OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PRDNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNUMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PRDNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDNOMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_FORPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORPRDDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PRDFIBRA") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDFIBRAOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_LB_FIBRA") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_FIBRAOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PRDGOTS") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDGOTSOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PRDCTWST") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDCTWSTOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV43OptionsJson = AV30Options.toJSonString(false) ;
      AV44OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV33OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("GestionLaboratorio.EntradaEnsayosLaboratorioColorantes_WPGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EntradaEnsayosLaboratorioColorantes_WPGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("GestionLaboratorio.EntradaEnsayosLaboratorioColorantes_WPGridState"), null, null);
      }
      AV56GXV1 = 1 ;
      while ( AV56GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV56GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LINEAC") == 0 )
         {
            AV10TFLb_LineaC = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFLb_LineaC_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV50TFPrdNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV51TFPrdNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CANTC") == 0 )
         {
            AV18TFLB_CantC = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFLB_CantC_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV14TFForPrdUMe = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFForPrdUMe_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV16TFForPrdDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV17TFForPrdDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFIBRA") == 0 )
         {
            AV52TFPrdFibra = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFIBRA_SEL") == 0 )
         {
            AV53TFPrdFibra_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FIBRA") == 0 )
         {
            AV22TFLb_fibra = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FIBRA_SEL") == 0 )
         {
            AV23TFLb_fibra_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV24TFPrdGots = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV25TFPrdGots_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCTWST") == 0 )
         {
            AV26TFPrdCtwSt = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCTWST_SEL") == 0 )
         {
            AV27TFPrdCtwSt_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV56GXV1 = (int)(AV56GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV41SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV10TFLb_LineaC ;
      AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV11TFLb_LineaC_To ;
      AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV12TFPrdNum ;
      AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV50TFPrdNom ;
      AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV18TFLB_CantC ;
      AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV19TFLB_CantC_To ;
      AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV14TFForPrdUMe ;
      AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV15TFForPrdUMe_To ;
      AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV16TFForPrdDsc ;
      AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV17TFForPrdDsc_Sel ;
      AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV52TFPrdFibra ;
      AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV53TFPrdFibra_Sel ;
      AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV22TFLb_fibra ;
      AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV23TFLb_fibra_Sel ;
      AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV24TFPrdGots ;
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV25TFPrdGots_Sel ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV26TFPrdCtwSt ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV27TFPrdCtwSt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) ,
                                           Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) ,
                                           AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                           AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                           AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                           AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                           AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                           AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                           Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                           AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                           AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                           AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                           AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                           AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                           AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                           Short.valueOf(A5557Lb_LineaC) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5558LB_CantC ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A14094PrdFibra ,
                                           A14096Lb_fibra ,
                                           A11363PrdGots ,
                                           AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                           AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(AV48Lb_numero) ,
                                           A5555Lb_opcion ,
                                           AV49Lb_opcion ,
                                           AV47EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum), 6, "%") ;
      lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom), 26, "%") ;
      lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc), 5, "%") ;
      lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra), 4, "%") ;
      lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra), 4, "%") ;
      lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots), 1, "%") ;
      /* Using cursor P0AED2 */
      pr_default.execute(0, new Object[] {AV47EmprCod, Integer.valueOf(AV48Lb_numero), AV49Lb_opcion, Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac), Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to), lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum, AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel, lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom, AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to, Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume), Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to), lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc, AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel, lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra, AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel, lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra, AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel, lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots, AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAED2 = false ;
         A5555Lb_opcion = P0AED2_A5555Lb_opcion[0] ;
         A5532Lb_numero = P0AED2_A5532Lb_numero[0] ;
         A11363PrdGots = P0AED2_A11363PrdGots[0] ;
         A14096Lb_fibra = P0AED2_A14096Lb_fibra[0] ;
         A14094PrdFibra = P0AED2_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED2_n14094PrdFibra[0] ;
         A488ForPrdDsc = P0AED2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AED2_A490ForPrdUMe[0] ;
         A5558LB_CantC = P0AED2_A5558LB_CantC[0] ;
         A718PrdNom = P0AED2_A718PrdNom[0] ;
         A5557Lb_LineaC = P0AED2_A5557Lb_LineaC[0] ;
         A719PrdNum = P0AED2_A719PrdNum[0] ;
         A396EmprCod = P0AED2_A396EmprCod[0] ;
         A11363PrdGots = P0AED2_A11363PrdGots[0] ;
         A14094PrdFibra = P0AED2_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED2_n14094PrdFibra[0] ;
         A718PrdNom = P0AED2_A718PrdNom[0] ;
         A488ForPrdDsc = P0AED2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED2_n488ForPrdDsc[0] ;
         GXt_char2 = A14097PrdCtwSt ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char5[0] = GXt_char2 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A719PrdNum = GXv_char4[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.GXt_char2 = GXv_char5[0] ;
         A14097PrdCtwSt = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel) == 0 ) ) )
            {
               AV34count = 0 ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AED2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AED2_A719PrdNum[0], A719PrdNum) == 0 ) )
               {
                  brkAED2 = false ;
                  A5555Lb_opcion = P0AED2_A5555Lb_opcion[0] ;
                  A5532Lb_numero = P0AED2_A5532Lb_numero[0] ;
                  A5557Lb_LineaC = P0AED2_A5557Lb_LineaC[0] ;
                  AV34count = (long)(AV34count+1) ;
                  brkAED2 = true ;
                  pr_default.readNext(0);
               }
               if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
               {
                  AV29Option = A719PrdNum ;
                  AV30Options.add(AV29Option, 0);
                  AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV30Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkAED2 )
         {
            brkAED2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV50TFPrdNom = AV41SearchTxt ;
      AV51TFPrdNom_Sel = "" ;
      AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV10TFLb_LineaC ;
      AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV11TFLb_LineaC_To ;
      AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV12TFPrdNum ;
      AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV50TFPrdNom ;
      AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV18TFLB_CantC ;
      AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV19TFLB_CantC_To ;
      AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV14TFForPrdUMe ;
      AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV15TFForPrdUMe_To ;
      AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV16TFForPrdDsc ;
      AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV17TFForPrdDsc_Sel ;
      AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV52TFPrdFibra ;
      AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV53TFPrdFibra_Sel ;
      AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV22TFLb_fibra ;
      AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV23TFLb_fibra_Sel ;
      AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV24TFPrdGots ;
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV25TFPrdGots_Sel ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV26TFPrdCtwSt ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV27TFPrdCtwSt_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) ,
                                           Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) ,
                                           AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                           AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                           AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                           AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                           AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                           AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                           Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                           AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                           AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                           AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                           AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                           AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                           AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                           Short.valueOf(A5557Lb_LineaC) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5558LB_CantC ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A14094PrdFibra ,
                                           A14096Lb_fibra ,
                                           A11363PrdGots ,
                                           AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                           AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(AV48Lb_numero) ,
                                           A5555Lb_opcion ,
                                           AV49Lb_opcion ,
                                           AV47EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum), 6, "%") ;
      lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom), 26, "%") ;
      lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc), 5, "%") ;
      lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra), 4, "%") ;
      lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra), 4, "%") ;
      lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots), 1, "%") ;
      /* Using cursor P0AED3 */
      pr_default.execute(1, new Object[] {AV47EmprCod, Integer.valueOf(AV48Lb_numero), AV49Lb_opcion, Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac), Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to), lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum, AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel, lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom, AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to, Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume), Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to), lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc, AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel, lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra, AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel, lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra, AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel, lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots, AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAED4 = false ;
         A5555Lb_opcion = P0AED3_A5555Lb_opcion[0] ;
         A5532Lb_numero = P0AED3_A5532Lb_numero[0] ;
         A11363PrdGots = P0AED3_A11363PrdGots[0] ;
         A14096Lb_fibra = P0AED3_A14096Lb_fibra[0] ;
         A14094PrdFibra = P0AED3_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED3_n14094PrdFibra[0] ;
         A488ForPrdDsc = P0AED3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED3_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AED3_A490ForPrdUMe[0] ;
         A5558LB_CantC = P0AED3_A5558LB_CantC[0] ;
         A718PrdNom = P0AED3_A718PrdNom[0] ;
         A5557Lb_LineaC = P0AED3_A5557Lb_LineaC[0] ;
         A719PrdNum = P0AED3_A719PrdNum[0] ;
         A396EmprCod = P0AED3_A396EmprCod[0] ;
         A11363PrdGots = P0AED3_A11363PrdGots[0] ;
         A14094PrdFibra = P0AED3_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED3_n14094PrdFibra[0] ;
         A718PrdNom = P0AED3_A718PrdNom[0] ;
         A488ForPrdDsc = P0AED3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED3_n488ForPrdDsc[0] ;
         GXt_char2 = A14097PrdCtwSt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A719PrdNum = GXv_char4[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14097PrdCtwSt = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel) == 0 ) ) )
            {
               AV34count = 0 ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AED3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AED3_A719PrdNum[0], A719PrdNum) == 0 ) )
               {
                  brkAED4 = false ;
                  A5555Lb_opcion = P0AED3_A5555Lb_opcion[0] ;
                  A5532Lb_numero = P0AED3_A5532Lb_numero[0] ;
                  A5557Lb_LineaC = P0AED3_A5557Lb_LineaC[0] ;
                  AV34count = (long)(AV34count+1) ;
                  brkAED4 = true ;
                  pr_default.readNext(1);
               }
               if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
               {
                  AV29Option = A718PrdNom ;
                  AV28InsertIndex = 1 ;
                  while ( ( AV28InsertIndex <= AV30Options.size() ) && ( GXutil.strcmp((String)AV30Options.elementAt(-1+AV28InsertIndex), AV29Option) < 0 ) )
                  {
                     AV28InsertIndex = (int)(AV28InsertIndex+1) ;
                  }
                  AV30Options.add(AV29Option, AV28InsertIndex);
                  AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV28InsertIndex);
               }
               if ( AV30Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkAED4 )
         {
            brkAED4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFForPrdDsc = AV41SearchTxt ;
      AV17TFForPrdDsc_Sel = "" ;
      AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV10TFLb_LineaC ;
      AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV11TFLb_LineaC_To ;
      AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV12TFPrdNum ;
      AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV50TFPrdNom ;
      AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV18TFLB_CantC ;
      AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV19TFLB_CantC_To ;
      AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV14TFForPrdUMe ;
      AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV15TFForPrdUMe_To ;
      AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV16TFForPrdDsc ;
      AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV17TFForPrdDsc_Sel ;
      AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV52TFPrdFibra ;
      AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV53TFPrdFibra_Sel ;
      AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV22TFLb_fibra ;
      AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV23TFLb_fibra_Sel ;
      AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV24TFPrdGots ;
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV25TFPrdGots_Sel ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV26TFPrdCtwSt ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV27TFPrdCtwSt_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) ,
                                           Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) ,
                                           AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                           AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                           AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                           AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                           AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                           AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                           Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                           AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                           AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                           AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                           AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                           AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                           AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                           Short.valueOf(A5557Lb_LineaC) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5558LB_CantC ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A14094PrdFibra ,
                                           A14096Lb_fibra ,
                                           A11363PrdGots ,
                                           AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                           AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(AV48Lb_numero) ,
                                           A5555Lb_opcion ,
                                           AV49Lb_opcion ,
                                           AV47EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum), 6, "%") ;
      lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom), 26, "%") ;
      lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc), 5, "%") ;
      lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra), 4, "%") ;
      lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra), 4, "%") ;
      lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots), 1, "%") ;
      /* Using cursor P0AED4 */
      pr_default.execute(2, new Object[] {AV47EmprCod, Integer.valueOf(AV48Lb_numero), AV49Lb_opcion, Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac), Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to), lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum, AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel, lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom, AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to, Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume), Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to), lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc, AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel, lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra, AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel, lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra, AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel, lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots, AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAED6 = false ;
         A490ForPrdUMe = P0AED4_A490ForPrdUMe[0] ;
         A5555Lb_opcion = P0AED4_A5555Lb_opcion[0] ;
         A5532Lb_numero = P0AED4_A5532Lb_numero[0] ;
         A11363PrdGots = P0AED4_A11363PrdGots[0] ;
         A14096Lb_fibra = P0AED4_A14096Lb_fibra[0] ;
         A14094PrdFibra = P0AED4_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED4_n14094PrdFibra[0] ;
         A488ForPrdDsc = P0AED4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED4_n488ForPrdDsc[0] ;
         A5558LB_CantC = P0AED4_A5558LB_CantC[0] ;
         A718PrdNom = P0AED4_A718PrdNom[0] ;
         A5557Lb_LineaC = P0AED4_A5557Lb_LineaC[0] ;
         A719PrdNum = P0AED4_A719PrdNum[0] ;
         A396EmprCod = P0AED4_A396EmprCod[0] ;
         A11363PrdGots = P0AED4_A11363PrdGots[0] ;
         A14094PrdFibra = P0AED4_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED4_n14094PrdFibra[0] ;
         A718PrdNom = P0AED4_A718PrdNom[0] ;
         A488ForPrdDsc = P0AED4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED4_n488ForPrdDsc[0] ;
         GXt_char2 = A14097PrdCtwSt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A719PrdNum = GXv_char4[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14097PrdCtwSt = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel) == 0 ) ) )
            {
               AV34count = 0 ;
               while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AED4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AED4_A490ForPrdUMe[0] == A490ForPrdUMe ) )
               {
                  brkAED6 = false ;
                  A5555Lb_opcion = P0AED4_A5555Lb_opcion[0] ;
                  A5532Lb_numero = P0AED4_A5532Lb_numero[0] ;
                  A5557Lb_LineaC = P0AED4_A5557Lb_LineaC[0] ;
                  AV34count = (long)(AV34count+1) ;
                  brkAED6 = true ;
                  pr_default.readNext(2);
               }
               if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
               {
                  AV29Option = A488ForPrdDsc ;
                  AV28InsertIndex = 1 ;
                  while ( ( AV28InsertIndex <= AV30Options.size() ) && ( GXutil.strcmp((String)AV30Options.elementAt(-1+AV28InsertIndex), AV29Option) < 0 ) )
                  {
                     AV28InsertIndex = (int)(AV28InsertIndex+1) ;
                  }
                  AV30Options.add(AV29Option, AV28InsertIndex);
                  AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV28InsertIndex);
               }
               if ( AV30Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkAED6 )
         {
            brkAED6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDFIBRAOPTIONS' Routine */
      returnInSub = false ;
      AV52TFPrdFibra = AV41SearchTxt ;
      AV53TFPrdFibra_Sel = "" ;
      AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV10TFLb_LineaC ;
      AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV11TFLb_LineaC_To ;
      AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV12TFPrdNum ;
      AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV50TFPrdNom ;
      AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV18TFLB_CantC ;
      AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV19TFLB_CantC_To ;
      AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV14TFForPrdUMe ;
      AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV15TFForPrdUMe_To ;
      AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV16TFForPrdDsc ;
      AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV17TFForPrdDsc_Sel ;
      AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV52TFPrdFibra ;
      AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV53TFPrdFibra_Sel ;
      AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV22TFLb_fibra ;
      AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV23TFLb_fibra_Sel ;
      AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV24TFPrdGots ;
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV25TFPrdGots_Sel ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV26TFPrdCtwSt ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV27TFPrdCtwSt_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) ,
                                           Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) ,
                                           AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                           AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                           AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                           AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                           AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                           AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                           Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                           AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                           AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                           AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                           AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                           AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                           AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                           Short.valueOf(A5557Lb_LineaC) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5558LB_CantC ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A14094PrdFibra ,
                                           A14096Lb_fibra ,
                                           A11363PrdGots ,
                                           AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                           AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           A396EmprCod ,
                                           AV47EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(AV48Lb_numero) ,
                                           A5555Lb_opcion ,
                                           AV49Lb_opcion } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum), 6, "%") ;
      lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom), 26, "%") ;
      lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc), 5, "%") ;
      lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra), 4, "%") ;
      lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra), 4, "%") ;
      lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots), 1, "%") ;
      /* Using cursor P0AED5 */
      pr_default.execute(3, new Object[] {AV47EmprCod, Integer.valueOf(AV48Lb_numero), AV49Lb_opcion, Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac), Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to), lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum, AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel, lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom, AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to, Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume), Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to), lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc, AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel, lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra, AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel, lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra, AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel, lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots, AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAED8 = false ;
         A5532Lb_numero = P0AED5_A5532Lb_numero[0] ;
         A5555Lb_opcion = P0AED5_A5555Lb_opcion[0] ;
         A14094PrdFibra = P0AED5_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED5_n14094PrdFibra[0] ;
         A11363PrdGots = P0AED5_A11363PrdGots[0] ;
         A14096Lb_fibra = P0AED5_A14096Lb_fibra[0] ;
         A488ForPrdDsc = P0AED5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED5_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AED5_A490ForPrdUMe[0] ;
         A5558LB_CantC = P0AED5_A5558LB_CantC[0] ;
         A718PrdNom = P0AED5_A718PrdNom[0] ;
         A5557Lb_LineaC = P0AED5_A5557Lb_LineaC[0] ;
         A719PrdNum = P0AED5_A719PrdNum[0] ;
         A396EmprCod = P0AED5_A396EmprCod[0] ;
         A14094PrdFibra = P0AED5_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED5_n14094PrdFibra[0] ;
         A11363PrdGots = P0AED5_A11363PrdGots[0] ;
         A718PrdNom = P0AED5_A718PrdNom[0] ;
         A488ForPrdDsc = P0AED5_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED5_n488ForPrdDsc[0] ;
         GXt_char2 = A14097PrdCtwSt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A719PrdNum = GXv_char4[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14097PrdCtwSt = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel) == 0 ) ) )
            {
               AV34count = 0 ;
               while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AED5_A14094PrdFibra[0], A14094PrdFibra) == 0 ) )
               {
                  brkAED8 = false ;
                  A5532Lb_numero = P0AED5_A5532Lb_numero[0] ;
                  A5555Lb_opcion = P0AED5_A5555Lb_opcion[0] ;
                  A5557Lb_LineaC = P0AED5_A5557Lb_LineaC[0] ;
                  A719PrdNum = P0AED5_A719PrdNum[0] ;
                  A396EmprCod = P0AED5_A396EmprCod[0] ;
                  AV34count = (long)(AV34count+1) ;
                  brkAED8 = true ;
                  pr_default.readNext(3);
               }
               if ( ! (GXutil.strcmp("", A14094PrdFibra)==0) )
               {
                  AV29Option = A14094PrdFibra ;
                  AV30Options.add(AV29Option, 0);
                  AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV30Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkAED8 )
         {
            brkAED8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADLB_FIBRAOPTIONS' Routine */
      returnInSub = false ;
      AV22TFLb_fibra = AV41SearchTxt ;
      AV23TFLb_fibra_Sel = "" ;
      AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV10TFLb_LineaC ;
      AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV11TFLb_LineaC_To ;
      AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV12TFPrdNum ;
      AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV50TFPrdNom ;
      AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV18TFLB_CantC ;
      AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV19TFLB_CantC_To ;
      AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV14TFForPrdUMe ;
      AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV15TFForPrdUMe_To ;
      AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV16TFForPrdDsc ;
      AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV17TFForPrdDsc_Sel ;
      AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV52TFPrdFibra ;
      AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV53TFPrdFibra_Sel ;
      AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV22TFLb_fibra ;
      AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV23TFLb_fibra_Sel ;
      AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV24TFPrdGots ;
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV25TFPrdGots_Sel ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV26TFPrdCtwSt ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV27TFPrdCtwSt_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) ,
                                           Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) ,
                                           AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                           AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                           AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                           AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                           AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                           AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                           Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                           AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                           AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                           AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                           AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                           AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                           AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                           Short.valueOf(A5557Lb_LineaC) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5558LB_CantC ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A14094PrdFibra ,
                                           A14096Lb_fibra ,
                                           A11363PrdGots ,
                                           AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                           AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           A396EmprCod ,
                                           AV47EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(AV48Lb_numero) ,
                                           A5555Lb_opcion ,
                                           AV49Lb_opcion } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum), 6, "%") ;
      lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom), 26, "%") ;
      lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc), 5, "%") ;
      lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra), 4, "%") ;
      lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra), 4, "%") ;
      lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots), 1, "%") ;
      /* Using cursor P0AED6 */
      pr_default.execute(4, new Object[] {AV47EmprCod, Integer.valueOf(AV48Lb_numero), AV49Lb_opcion, Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac), Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to), lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum, AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel, lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom, AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to, Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume), Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to), lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc, AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel, lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra, AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel, lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra, AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel, lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots, AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAED10 = false ;
         A5532Lb_numero = P0AED6_A5532Lb_numero[0] ;
         A5555Lb_opcion = P0AED6_A5555Lb_opcion[0] ;
         A14096Lb_fibra = P0AED6_A14096Lb_fibra[0] ;
         A11363PrdGots = P0AED6_A11363PrdGots[0] ;
         A14094PrdFibra = P0AED6_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED6_n14094PrdFibra[0] ;
         A488ForPrdDsc = P0AED6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED6_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AED6_A490ForPrdUMe[0] ;
         A5558LB_CantC = P0AED6_A5558LB_CantC[0] ;
         A718PrdNom = P0AED6_A718PrdNom[0] ;
         A5557Lb_LineaC = P0AED6_A5557Lb_LineaC[0] ;
         A719PrdNum = P0AED6_A719PrdNum[0] ;
         A396EmprCod = P0AED6_A396EmprCod[0] ;
         A11363PrdGots = P0AED6_A11363PrdGots[0] ;
         A14094PrdFibra = P0AED6_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED6_n14094PrdFibra[0] ;
         A718PrdNom = P0AED6_A718PrdNom[0] ;
         A488ForPrdDsc = P0AED6_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED6_n488ForPrdDsc[0] ;
         GXt_char2 = A14097PrdCtwSt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A719PrdNum = GXv_char4[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14097PrdCtwSt = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel) == 0 ) ) )
            {
               AV34count = 0 ;
               while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AED6_A14096Lb_fibra[0], A14096Lb_fibra) == 0 ) )
               {
                  brkAED10 = false ;
                  A5532Lb_numero = P0AED6_A5532Lb_numero[0] ;
                  A5555Lb_opcion = P0AED6_A5555Lb_opcion[0] ;
                  A5557Lb_LineaC = P0AED6_A5557Lb_LineaC[0] ;
                  A396EmprCod = P0AED6_A396EmprCod[0] ;
                  AV34count = (long)(AV34count+1) ;
                  brkAED10 = true ;
                  pr_default.readNext(4);
               }
               if ( ! (GXutil.strcmp("", A14096Lb_fibra)==0) )
               {
                  AV29Option = A14096Lb_fibra ;
                  AV30Options.add(AV29Option, 0);
                  AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV30Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkAED10 )
         {
            brkAED10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPRDGOTSOPTIONS' Routine */
      returnInSub = false ;
      AV24TFPrdGots = AV41SearchTxt ;
      AV25TFPrdGots_Sel = "" ;
      AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV10TFLb_LineaC ;
      AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV11TFLb_LineaC_To ;
      AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV12TFPrdNum ;
      AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV50TFPrdNom ;
      AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV18TFLB_CantC ;
      AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV19TFLB_CantC_To ;
      AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV14TFForPrdUMe ;
      AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV15TFForPrdUMe_To ;
      AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV16TFForPrdDsc ;
      AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV17TFForPrdDsc_Sel ;
      AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV52TFPrdFibra ;
      AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV53TFPrdFibra_Sel ;
      AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV22TFLb_fibra ;
      AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV23TFLb_fibra_Sel ;
      AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV24TFPrdGots ;
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV25TFPrdGots_Sel ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV26TFPrdCtwSt ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV27TFPrdCtwSt_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) ,
                                           Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) ,
                                           AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                           AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                           AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                           AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                           AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                           AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                           Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                           AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                           AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                           AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                           AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                           AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                           AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                           Short.valueOf(A5557Lb_LineaC) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5558LB_CantC ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A14094PrdFibra ,
                                           A14096Lb_fibra ,
                                           A11363PrdGots ,
                                           AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                           AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           A396EmprCod ,
                                           AV47EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(AV48Lb_numero) ,
                                           A5555Lb_opcion ,
                                           AV49Lb_opcion } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum), 6, "%") ;
      lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom), 26, "%") ;
      lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc), 5, "%") ;
      lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra), 4, "%") ;
      lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra), 4, "%") ;
      lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots), 1, "%") ;
      /* Using cursor P0AED7 */
      pr_default.execute(5, new Object[] {AV47EmprCod, Integer.valueOf(AV48Lb_numero), AV49Lb_opcion, Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac), Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to), lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum, AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel, lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom, AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to, Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume), Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to), lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc, AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel, lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra, AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel, lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra, AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel, lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots, AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAED12 = false ;
         A5532Lb_numero = P0AED7_A5532Lb_numero[0] ;
         A5555Lb_opcion = P0AED7_A5555Lb_opcion[0] ;
         A11363PrdGots = P0AED7_A11363PrdGots[0] ;
         A14096Lb_fibra = P0AED7_A14096Lb_fibra[0] ;
         A14094PrdFibra = P0AED7_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED7_n14094PrdFibra[0] ;
         A488ForPrdDsc = P0AED7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED7_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AED7_A490ForPrdUMe[0] ;
         A5558LB_CantC = P0AED7_A5558LB_CantC[0] ;
         A718PrdNom = P0AED7_A718PrdNom[0] ;
         A5557Lb_LineaC = P0AED7_A5557Lb_LineaC[0] ;
         A719PrdNum = P0AED7_A719PrdNum[0] ;
         A396EmprCod = P0AED7_A396EmprCod[0] ;
         A11363PrdGots = P0AED7_A11363PrdGots[0] ;
         A14094PrdFibra = P0AED7_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED7_n14094PrdFibra[0] ;
         A718PrdNom = P0AED7_A718PrdNom[0] ;
         A488ForPrdDsc = P0AED7_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED7_n488ForPrdDsc[0] ;
         GXt_char2 = A14097PrdCtwSt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A719PrdNum = GXv_char4[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14097PrdCtwSt = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel) == 0 ) ) )
            {
               AV34count = 0 ;
               while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AED7_A11363PrdGots[0], A11363PrdGots) == 0 ) )
               {
                  brkAED12 = false ;
                  A5532Lb_numero = P0AED7_A5532Lb_numero[0] ;
                  A5555Lb_opcion = P0AED7_A5555Lb_opcion[0] ;
                  A5557Lb_LineaC = P0AED7_A5557Lb_LineaC[0] ;
                  A719PrdNum = P0AED7_A719PrdNum[0] ;
                  A396EmprCod = P0AED7_A396EmprCod[0] ;
                  AV34count = (long)(AV34count+1) ;
                  brkAED12 = true ;
                  pr_default.readNext(5);
               }
               if ( ! (GXutil.strcmp("", A11363PrdGots)==0) )
               {
                  AV29Option = A11363PrdGots ;
                  AV30Options.add(AV29Option, 0);
                  AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV30Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkAED12 )
         {
            brkAED12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADPRDCTWSTOPTIONS' Routine */
      returnInSub = false ;
      AV26TFPrdCtwSt = AV41SearchTxt ;
      AV27TFPrdCtwSt_Sel = "" ;
      AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac = AV10TFLb_LineaC ;
      AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to = AV11TFLb_LineaC_To ;
      AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = AV12TFPrdNum ;
      AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = AV50TFPrdNom ;
      AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = AV51TFPrdNom_Sel ;
      AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = AV18TFLB_CantC ;
      AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = AV19TFLB_CantC_To ;
      AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume = AV14TFForPrdUMe ;
      AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to = AV15TFForPrdUMe_To ;
      AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = AV16TFForPrdDsc ;
      AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = AV17TFForPrdDsc_Sel ;
      AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = AV52TFPrdFibra ;
      AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = AV53TFPrdFibra_Sel ;
      AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = AV22TFLb_fibra ;
      AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = AV23TFLb_fibra_Sel ;
      AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = AV24TFPrdGots ;
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = AV25TFPrdGots_Sel ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = AV26TFPrdCtwSt ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = AV27TFPrdCtwSt_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) ,
                                           Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) ,
                                           AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                           AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                           AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                           AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                           AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                           AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                           Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                           AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                           AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                           AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                           AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                           AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                           AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                           Short.valueOf(A5557Lb_LineaC) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5558LB_CantC ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A14094PrdFibra ,
                                           A14096Lb_fibra ,
                                           A11363PrdGots ,
                                           AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                           AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           AV47EmprCod ,
                                           Integer.valueOf(AV48Lb_numero) ,
                                           AV49Lb_opcion ,
                                           A396EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum), 6, "%") ;
      lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom), 26, "%") ;
      lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc), 5, "%") ;
      lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = GXutil.padr( GXutil.rtrim( AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra), 4, "%") ;
      lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = GXutil.padr( GXutil.rtrim( AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra), 4, "%") ;
      lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = GXutil.padr( GXutil.rtrim( AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots), 1, "%") ;
      /* Using cursor P0AED8 */
      pr_default.execute(6, new Object[] {AV47EmprCod, Integer.valueOf(AV48Lb_numero), AV49Lb_opcion, Short.valueOf(AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac), Short.valueOf(AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to), lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum, AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel, lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom, AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to, Byte.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume), Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to), lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc, AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel, lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra, AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel, lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra, AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel, lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots, AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A5555Lb_opcion = P0AED8_A5555Lb_opcion[0] ;
         A5532Lb_numero = P0AED8_A5532Lb_numero[0] ;
         A11363PrdGots = P0AED8_A11363PrdGots[0] ;
         A14096Lb_fibra = P0AED8_A14096Lb_fibra[0] ;
         A14094PrdFibra = P0AED8_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED8_n14094PrdFibra[0] ;
         A488ForPrdDsc = P0AED8_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED8_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AED8_A490ForPrdUMe[0] ;
         A5558LB_CantC = P0AED8_A5558LB_CantC[0] ;
         A718PrdNom = P0AED8_A718PrdNom[0] ;
         A5557Lb_LineaC = P0AED8_A5557Lb_LineaC[0] ;
         A719PrdNum = P0AED8_A719PrdNum[0] ;
         A396EmprCod = P0AED8_A396EmprCod[0] ;
         A11363PrdGots = P0AED8_A11363PrdGots[0] ;
         A14094PrdFibra = P0AED8_A14094PrdFibra[0] ;
         n14094PrdFibra = P0AED8_n14094PrdFibra[0] ;
         A718PrdNom = P0AED8_A718PrdNom[0] ;
         A488ForPrdDsc = P0AED8_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AED8_n488ForPrdDsc[0] ;
         GXt_char2 = A14097PrdCtwSt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.A719PrdNum = GXv_char4[0] ;
         entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14097PrdCtwSt = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel) == 0 ) ) )
            {
               if ( ! (GXutil.strcmp("", A14097PrdCtwSt)==0) )
               {
                  AV29Option = A14097PrdCtwSt ;
                  AV28InsertIndex = 1 ;
                  while ( ( AV28InsertIndex <= AV30Options.size() ) && ( GXutil.strcmp((String)AV30Options.elementAt(-1+AV28InsertIndex), AV29Option) < 0 ) )
                  {
                     AV28InsertIndex = (int)(AV28InsertIndex+1) ;
                  }
                  if ( ( AV28InsertIndex <= AV30Options.size() ) && ( GXutil.strcmp((String)AV30Options.elementAt(-1+AV28InsertIndex), AV29Option) == 0 ) )
                  {
                     AV34count = GXutil.lval( (String)AV33OptionIndexes.elementAt(-1+AV28InsertIndex)) ;
                     AV34count = (long)(AV34count+1) ;
                     AV33OptionIndexes.removeItem(AV28InsertIndex);
                     AV33OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV28InsertIndex);
                  }
                  else
                  {
                     AV30Options.add(AV29Option, AV28InsertIndex);
                     AV33OptionIndexes.add("1", AV28InsertIndex);
                  }
               }
               if ( AV30Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.AV43OptionsJson;
      this.aP4[0] = entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.AV44OptionsDescJson;
      this.aP5[0] = entradaensayoslaboratoriocolorantes_wpgetfilterdata.this.AV45OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV43OptionsJson = "" ;
      AV44OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV30Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV33OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV50TFPrdNom = "" ;
      AV51TFPrdNom_Sel = "" ;
      AV18TFLB_CantC = DecimalUtil.ZERO ;
      AV19TFLB_CantC_To = DecimalUtil.ZERO ;
      AV16TFForPrdDsc = "" ;
      AV17TFForPrdDsc_Sel = "" ;
      AV52TFPrdFibra = "" ;
      AV53TFPrdFibra_Sel = "" ;
      AV22TFLb_fibra = "" ;
      AV23TFLb_fibra_Sel = "" ;
      AV24TFPrdGots = "" ;
      AV25TFPrdGots_Sel = "" ;
      AV26TFPrdCtwSt = "" ;
      AV27TFPrdCtwSt_Sel = "" ;
      A719PrdNum = "" ;
      AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = "" ;
      AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel = "" ;
      AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = "" ;
      AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel = "" ;
      AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc = DecimalUtil.ZERO ;
      AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to = DecimalUtil.ZERO ;
      AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = "" ;
      AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel = "" ;
      AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = "" ;
      AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel = "" ;
      AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = "" ;
      AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel = "" ;
      AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = "" ;
      AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel = "" ;
      AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst = "" ;
      AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel = "" ;
      scmdbuf = "" ;
      lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum = "" ;
      lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom = "" ;
      lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc = "" ;
      lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra = "" ;
      lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra = "" ;
      lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots = "" ;
      A718PrdNom = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A14094PrdFibra = "" ;
      A14096Lb_fibra = "" ;
      A11363PrdGots = "" ;
      A14097PrdCtwSt = "" ;
      A5555Lb_opcion = "" ;
      AV49Lb_opcion = "" ;
      AV47EmprCod = "" ;
      A396EmprCod = "" ;
      P0AED2_A5555Lb_opcion = new String[] {""} ;
      P0AED2_A5532Lb_numero = new int[1] ;
      P0AED2_A11363PrdGots = new String[] {""} ;
      P0AED2_A14096Lb_fibra = new String[] {""} ;
      P0AED2_A14094PrdFibra = new String[] {""} ;
      P0AED2_n14094PrdFibra = new boolean[] {false} ;
      P0AED2_A488ForPrdDsc = new String[] {""} ;
      P0AED2_n488ForPrdDsc = new boolean[] {false} ;
      P0AED2_A490ForPrdUMe = new byte[1] ;
      P0AED2_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AED2_A718PrdNom = new String[] {""} ;
      P0AED2_A5557Lb_LineaC = new short[1] ;
      P0AED2_A719PrdNum = new String[] {""} ;
      P0AED2_A396EmprCod = new String[] {""} ;
      AV29Option = "" ;
      P0AED3_A5555Lb_opcion = new String[] {""} ;
      P0AED3_A5532Lb_numero = new int[1] ;
      P0AED3_A11363PrdGots = new String[] {""} ;
      P0AED3_A14096Lb_fibra = new String[] {""} ;
      P0AED3_A14094PrdFibra = new String[] {""} ;
      P0AED3_n14094PrdFibra = new boolean[] {false} ;
      P0AED3_A488ForPrdDsc = new String[] {""} ;
      P0AED3_n488ForPrdDsc = new boolean[] {false} ;
      P0AED3_A490ForPrdUMe = new byte[1] ;
      P0AED3_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AED3_A718PrdNom = new String[] {""} ;
      P0AED3_A5557Lb_LineaC = new short[1] ;
      P0AED3_A719PrdNum = new String[] {""} ;
      P0AED3_A396EmprCod = new String[] {""} ;
      P0AED4_A490ForPrdUMe = new byte[1] ;
      P0AED4_A5555Lb_opcion = new String[] {""} ;
      P0AED4_A5532Lb_numero = new int[1] ;
      P0AED4_A11363PrdGots = new String[] {""} ;
      P0AED4_A14096Lb_fibra = new String[] {""} ;
      P0AED4_A14094PrdFibra = new String[] {""} ;
      P0AED4_n14094PrdFibra = new boolean[] {false} ;
      P0AED4_A488ForPrdDsc = new String[] {""} ;
      P0AED4_n488ForPrdDsc = new boolean[] {false} ;
      P0AED4_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AED4_A718PrdNom = new String[] {""} ;
      P0AED4_A5557Lb_LineaC = new short[1] ;
      P0AED4_A719PrdNum = new String[] {""} ;
      P0AED4_A396EmprCod = new String[] {""} ;
      P0AED5_A5532Lb_numero = new int[1] ;
      P0AED5_A5555Lb_opcion = new String[] {""} ;
      P0AED5_A14094PrdFibra = new String[] {""} ;
      P0AED5_n14094PrdFibra = new boolean[] {false} ;
      P0AED5_A11363PrdGots = new String[] {""} ;
      P0AED5_A14096Lb_fibra = new String[] {""} ;
      P0AED5_A488ForPrdDsc = new String[] {""} ;
      P0AED5_n488ForPrdDsc = new boolean[] {false} ;
      P0AED5_A490ForPrdUMe = new byte[1] ;
      P0AED5_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AED5_A718PrdNom = new String[] {""} ;
      P0AED5_A5557Lb_LineaC = new short[1] ;
      P0AED5_A719PrdNum = new String[] {""} ;
      P0AED5_A396EmprCod = new String[] {""} ;
      P0AED6_A5532Lb_numero = new int[1] ;
      P0AED6_A5555Lb_opcion = new String[] {""} ;
      P0AED6_A14096Lb_fibra = new String[] {""} ;
      P0AED6_A11363PrdGots = new String[] {""} ;
      P0AED6_A14094PrdFibra = new String[] {""} ;
      P0AED6_n14094PrdFibra = new boolean[] {false} ;
      P0AED6_A488ForPrdDsc = new String[] {""} ;
      P0AED6_n488ForPrdDsc = new boolean[] {false} ;
      P0AED6_A490ForPrdUMe = new byte[1] ;
      P0AED6_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AED6_A718PrdNom = new String[] {""} ;
      P0AED6_A5557Lb_LineaC = new short[1] ;
      P0AED6_A719PrdNum = new String[] {""} ;
      P0AED6_A396EmprCod = new String[] {""} ;
      P0AED7_A5532Lb_numero = new int[1] ;
      P0AED7_A5555Lb_opcion = new String[] {""} ;
      P0AED7_A11363PrdGots = new String[] {""} ;
      P0AED7_A14096Lb_fibra = new String[] {""} ;
      P0AED7_A14094PrdFibra = new String[] {""} ;
      P0AED7_n14094PrdFibra = new boolean[] {false} ;
      P0AED7_A488ForPrdDsc = new String[] {""} ;
      P0AED7_n488ForPrdDsc = new boolean[] {false} ;
      P0AED7_A490ForPrdUMe = new byte[1] ;
      P0AED7_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AED7_A718PrdNom = new String[] {""} ;
      P0AED7_A5557Lb_LineaC = new short[1] ;
      P0AED7_A719PrdNum = new String[] {""} ;
      P0AED7_A396EmprCod = new String[] {""} ;
      P0AED8_A5555Lb_opcion = new String[] {""} ;
      P0AED8_A5532Lb_numero = new int[1] ;
      P0AED8_A11363PrdGots = new String[] {""} ;
      P0AED8_A14096Lb_fibra = new String[] {""} ;
      P0AED8_A14094PrdFibra = new String[] {""} ;
      P0AED8_n14094PrdFibra = new boolean[] {false} ;
      P0AED8_A488ForPrdDsc = new String[] {""} ;
      P0AED8_n488ForPrdDsc = new boolean[] {false} ;
      P0AED8_A490ForPrdUMe = new byte[1] ;
      P0AED8_A5558LB_CantC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AED8_A718PrdNom = new String[] {""} ;
      P0AED8_A5557Lb_LineaC = new short[1] ;
      P0AED8_A719PrdNum = new String[] {""} ;
      P0AED8_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayoslaboratoriocolorantes_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AED2_A5555Lb_opcion, P0AED2_A5532Lb_numero, P0AED2_A11363PrdGots, P0AED2_A14096Lb_fibra, P0AED2_A14094PrdFibra, P0AED2_n14094PrdFibra, P0AED2_A488ForPrdDsc, P0AED2_n488ForPrdDsc, P0AED2_A490ForPrdUMe, P0AED2_A5558LB_CantC,
            P0AED2_A718PrdNom, P0AED2_A5557Lb_LineaC, P0AED2_A719PrdNum, P0AED2_A396EmprCod
            }
            , new Object[] {
            P0AED3_A5555Lb_opcion, P0AED3_A5532Lb_numero, P0AED3_A11363PrdGots, P0AED3_A14096Lb_fibra, P0AED3_A14094PrdFibra, P0AED3_n14094PrdFibra, P0AED3_A488ForPrdDsc, P0AED3_n488ForPrdDsc, P0AED3_A490ForPrdUMe, P0AED3_A5558LB_CantC,
            P0AED3_A718PrdNom, P0AED3_A5557Lb_LineaC, P0AED3_A719PrdNum, P0AED3_A396EmprCod
            }
            , new Object[] {
            P0AED4_A490ForPrdUMe, P0AED4_A5555Lb_opcion, P0AED4_A5532Lb_numero, P0AED4_A11363PrdGots, P0AED4_A14096Lb_fibra, P0AED4_A14094PrdFibra, P0AED4_n14094PrdFibra, P0AED4_A488ForPrdDsc, P0AED4_n488ForPrdDsc, P0AED4_A5558LB_CantC,
            P0AED4_A718PrdNom, P0AED4_A5557Lb_LineaC, P0AED4_A719PrdNum, P0AED4_A396EmprCod
            }
            , new Object[] {
            P0AED5_A5532Lb_numero, P0AED5_A5555Lb_opcion, P0AED5_A14094PrdFibra, P0AED5_n14094PrdFibra, P0AED5_A11363PrdGots, P0AED5_A14096Lb_fibra, P0AED5_A488ForPrdDsc, P0AED5_n488ForPrdDsc, P0AED5_A490ForPrdUMe, P0AED5_A5558LB_CantC,
            P0AED5_A718PrdNom, P0AED5_A5557Lb_LineaC, P0AED5_A719PrdNum, P0AED5_A396EmprCod
            }
            , new Object[] {
            P0AED6_A5532Lb_numero, P0AED6_A5555Lb_opcion, P0AED6_A14096Lb_fibra, P0AED6_A11363PrdGots, P0AED6_A14094PrdFibra, P0AED6_n14094PrdFibra, P0AED6_A488ForPrdDsc, P0AED6_n488ForPrdDsc, P0AED6_A490ForPrdUMe, P0AED6_A5558LB_CantC,
            P0AED6_A718PrdNom, P0AED6_A5557Lb_LineaC, P0AED6_A719PrdNum, P0AED6_A396EmprCod
            }
            , new Object[] {
            P0AED7_A5532Lb_numero, P0AED7_A5555Lb_opcion, P0AED7_A11363PrdGots, P0AED7_A14096Lb_fibra, P0AED7_A14094PrdFibra, P0AED7_n14094PrdFibra, P0AED7_A488ForPrdDsc, P0AED7_n488ForPrdDsc, P0AED7_A490ForPrdUMe, P0AED7_A5558LB_CantC,
            P0AED7_A718PrdNom, P0AED7_A5557Lb_LineaC, P0AED7_A719PrdNum, P0AED7_A396EmprCod
            }
            , new Object[] {
            P0AED8_A5555Lb_opcion, P0AED8_A5532Lb_numero, P0AED8_A11363PrdGots, P0AED8_A14096Lb_fibra, P0AED8_A14094PrdFibra, P0AED8_n14094PrdFibra, P0AED8_A488ForPrdDsc, P0AED8_n488ForPrdDsc, P0AED8_A490ForPrdUMe, P0AED8_A5558LB_CantC,
            P0AED8_A718PrdNom, P0AED8_A5557Lb_LineaC, P0AED8_A719PrdNum, P0AED8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFForPrdUMe ;
   private byte AV15TFForPrdUMe_To ;
   private byte AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume ;
   private byte AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to ;
   private byte A490ForPrdUMe ;
   private short AV10TFLb_LineaC ;
   private short AV11TFLb_LineaC_To ;
   private short AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac ;
   private short AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to ;
   private short A5557Lb_LineaC ;
   private short Gx_err ;
   private int AV56GXV1 ;
   private int A5532Lb_numero ;
   private int AV48Lb_numero ;
   private int AV28InsertIndex ;
   private long AV34count ;
   private java.math.BigDecimal AV18TFLB_CantC ;
   private java.math.BigDecimal AV19TFLB_CantC_To ;
   private java.math.BigDecimal AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ;
   private java.math.BigDecimal AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ;
   private java.math.BigDecimal A5558LB_CantC ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV50TFPrdNom ;
   private String AV51TFPrdNom_Sel ;
   private String AV16TFForPrdDsc ;
   private String AV17TFForPrdDsc_Sel ;
   private String AV52TFPrdFibra ;
   private String AV53TFPrdFibra_Sel ;
   private String AV22TFLb_fibra ;
   private String AV23TFLb_fibra_Sel ;
   private String AV24TFPrdGots ;
   private String AV25TFPrdGots_Sel ;
   private String A719PrdNum ;
   private String AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ;
   private String AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ;
   private String AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ;
   private String AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ;
   private String AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ;
   private String AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ;
   private String AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ;
   private String AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ;
   private String AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ;
   private String AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ;
   private String AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ;
   private String AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ;
   private String scmdbuf ;
   private String lV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ;
   private String lV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ;
   private String lV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ;
   private String lV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ;
   private String lV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ;
   private String lV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String A14094PrdFibra ;
   private String A14096Lb_fibra ;
   private String A11363PrdGots ;
   private String A5555Lb_opcion ;
   private String AV49Lb_opcion ;
   private String AV47EmprCod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private boolean brkAED2 ;
   private boolean n14094PrdFibra ;
   private boolean n488ForPrdDsc ;
   private boolean brkAED4 ;
   private boolean brkAED6 ;
   private boolean brkAED8 ;
   private boolean brkAED10 ;
   private boolean brkAED12 ;
   private String AV43OptionsJson ;
   private String AV44OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV40DDOName ;
   private String AV41SearchTxt ;
   private String AV42SearchTxtTo ;
   private String AV26TFPrdCtwSt ;
   private String AV27TFPrdCtwSt_Sel ;
   private String AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ;
   private String AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ;
   private String A14097PrdCtwSt ;
   private String AV29Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AED2_A5555Lb_opcion ;
   private int[] P0AED2_A5532Lb_numero ;
   private String[] P0AED2_A11363PrdGots ;
   private String[] P0AED2_A14096Lb_fibra ;
   private String[] P0AED2_A14094PrdFibra ;
   private boolean[] P0AED2_n14094PrdFibra ;
   private String[] P0AED2_A488ForPrdDsc ;
   private boolean[] P0AED2_n488ForPrdDsc ;
   private byte[] P0AED2_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0AED2_A5558LB_CantC ;
   private String[] P0AED2_A718PrdNom ;
   private short[] P0AED2_A5557Lb_LineaC ;
   private String[] P0AED2_A719PrdNum ;
   private String[] P0AED2_A396EmprCod ;
   private String[] P0AED3_A5555Lb_opcion ;
   private int[] P0AED3_A5532Lb_numero ;
   private String[] P0AED3_A11363PrdGots ;
   private String[] P0AED3_A14096Lb_fibra ;
   private String[] P0AED3_A14094PrdFibra ;
   private boolean[] P0AED3_n14094PrdFibra ;
   private String[] P0AED3_A488ForPrdDsc ;
   private boolean[] P0AED3_n488ForPrdDsc ;
   private byte[] P0AED3_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0AED3_A5558LB_CantC ;
   private String[] P0AED3_A718PrdNom ;
   private short[] P0AED3_A5557Lb_LineaC ;
   private String[] P0AED3_A719PrdNum ;
   private String[] P0AED3_A396EmprCod ;
   private byte[] P0AED4_A490ForPrdUMe ;
   private String[] P0AED4_A5555Lb_opcion ;
   private int[] P0AED4_A5532Lb_numero ;
   private String[] P0AED4_A11363PrdGots ;
   private String[] P0AED4_A14096Lb_fibra ;
   private String[] P0AED4_A14094PrdFibra ;
   private boolean[] P0AED4_n14094PrdFibra ;
   private String[] P0AED4_A488ForPrdDsc ;
   private boolean[] P0AED4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AED4_A5558LB_CantC ;
   private String[] P0AED4_A718PrdNom ;
   private short[] P0AED4_A5557Lb_LineaC ;
   private String[] P0AED4_A719PrdNum ;
   private String[] P0AED4_A396EmprCod ;
   private int[] P0AED5_A5532Lb_numero ;
   private String[] P0AED5_A5555Lb_opcion ;
   private String[] P0AED5_A14094PrdFibra ;
   private boolean[] P0AED5_n14094PrdFibra ;
   private String[] P0AED5_A11363PrdGots ;
   private String[] P0AED5_A14096Lb_fibra ;
   private String[] P0AED5_A488ForPrdDsc ;
   private boolean[] P0AED5_n488ForPrdDsc ;
   private byte[] P0AED5_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0AED5_A5558LB_CantC ;
   private String[] P0AED5_A718PrdNom ;
   private short[] P0AED5_A5557Lb_LineaC ;
   private String[] P0AED5_A719PrdNum ;
   private String[] P0AED5_A396EmprCod ;
   private int[] P0AED6_A5532Lb_numero ;
   private String[] P0AED6_A5555Lb_opcion ;
   private String[] P0AED6_A14096Lb_fibra ;
   private String[] P0AED6_A11363PrdGots ;
   private String[] P0AED6_A14094PrdFibra ;
   private boolean[] P0AED6_n14094PrdFibra ;
   private String[] P0AED6_A488ForPrdDsc ;
   private boolean[] P0AED6_n488ForPrdDsc ;
   private byte[] P0AED6_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0AED6_A5558LB_CantC ;
   private String[] P0AED6_A718PrdNom ;
   private short[] P0AED6_A5557Lb_LineaC ;
   private String[] P0AED6_A719PrdNum ;
   private String[] P0AED6_A396EmprCod ;
   private int[] P0AED7_A5532Lb_numero ;
   private String[] P0AED7_A5555Lb_opcion ;
   private String[] P0AED7_A11363PrdGots ;
   private String[] P0AED7_A14096Lb_fibra ;
   private String[] P0AED7_A14094PrdFibra ;
   private boolean[] P0AED7_n14094PrdFibra ;
   private String[] P0AED7_A488ForPrdDsc ;
   private boolean[] P0AED7_n488ForPrdDsc ;
   private byte[] P0AED7_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0AED7_A5558LB_CantC ;
   private String[] P0AED7_A718PrdNom ;
   private short[] P0AED7_A5557Lb_LineaC ;
   private String[] P0AED7_A719PrdNum ;
   private String[] P0AED7_A396EmprCod ;
   private String[] P0AED8_A5555Lb_opcion ;
   private int[] P0AED8_A5532Lb_numero ;
   private String[] P0AED8_A11363PrdGots ;
   private String[] P0AED8_A14096Lb_fibra ;
   private String[] P0AED8_A14094PrdFibra ;
   private boolean[] P0AED8_n14094PrdFibra ;
   private String[] P0AED8_A488ForPrdDsc ;
   private boolean[] P0AED8_n488ForPrdDsc ;
   private byte[] P0AED8_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0AED8_A5558LB_CantC ;
   private String[] P0AED8_A718PrdNom ;
   private short[] P0AED8_A5557Lb_LineaC ;
   private String[] P0AED8_A719PrdNum ;
   private String[] P0AED8_A396EmprCod ;
   private GXSimpleCollection<String> AV30Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV33OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class entradaensayoslaboratoriocolorantes_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AED2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac ,
                                          short AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to ,
                                          String AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                          String AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                          String AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                          String AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                          java.math.BigDecimal AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                          byte AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume ,
                                          byte AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                          String AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                          String AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                          String AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                          String AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                          String AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                          String AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                          short A5557Lb_LineaC ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5558LB_CantC ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A14094PrdFibra ,
                                          String A14096Lb_fibra ,
                                          String A11363PrdGots ,
                                          String AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                          String AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          int A5532Lb_numero ,
                                          int AV48Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String AV49Lb_opcion ,
                                          String AV47EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[21];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.Lb_opcion, T1.Lb_numero, T2.PrdGots, T1.Lb_fibra, T2.PrdFibra, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantC, T2.PrdNom, T1.Lb_LineaC, T1.PrdNum, T1.EmprCod" ;
      scmdbuf += " FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      if ( ! (0==AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdFibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFibra = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_fibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_fibra = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdGots = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AED3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac ,
                                          short AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to ,
                                          String AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                          String AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                          String AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                          String AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                          java.math.BigDecimal AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                          byte AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume ,
                                          byte AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                          String AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                          String AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                          String AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                          String AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                          String AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                          String AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                          short A5557Lb_LineaC ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5558LB_CantC ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A14094PrdFibra ,
                                          String A14096Lb_fibra ,
                                          String A11363PrdGots ,
                                          String AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                          String AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          int A5532Lb_numero ,
                                          int AV48Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String AV49Lb_opcion ,
                                          String AV47EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[21];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.Lb_opcion, T1.Lb_numero, T2.PrdGots, T1.Lb_fibra, T2.PrdFibra, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantC, T2.PrdNom, T1.Lb_LineaC, T1.PrdNum, T1.EmprCod" ;
      scmdbuf += " FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      if ( ! (0==AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdFibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFibra = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_fibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_fibra = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdGots = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AED4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac ,
                                          short AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to ,
                                          String AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                          String AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                          String AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                          String AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                          java.math.BigDecimal AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                          byte AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume ,
                                          byte AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                          String AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                          String AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                          String AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                          String AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                          String AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                          String AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                          short A5557Lb_LineaC ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5558LB_CantC ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A14094PrdFibra ,
                                          String A14096Lb_fibra ,
                                          String A11363PrdGots ,
                                          String AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                          String AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          int A5532Lb_numero ,
                                          int AV48Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String AV49Lb_opcion ,
                                          String AV47EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[21];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.Lb_opcion, T1.Lb_numero, T2.PrdGots, T1.Lb_fibra, T2.PrdFibra, T3.ForPrdDsc, T1.LB_CantC, T2.PrdNom, T1.Lb_LineaC, T1.PrdNum, T1.EmprCod" ;
      scmdbuf += " FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      if ( ! (0==AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC >= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC <= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC <= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdFibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFibra = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_fibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_fibra = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdGots = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0AED5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac ,
                                          short AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to ,
                                          String AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                          String AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                          String AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                          String AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                          java.math.BigDecimal AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                          byte AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume ,
                                          byte AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                          String AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                          String AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                          String AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                          String AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                          String AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                          String AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                          short A5557Lb_LineaC ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5558LB_CantC ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A14094PrdFibra ,
                                          String A14096Lb_fibra ,
                                          String A11363PrdGots ,
                                          String AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                          String AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          String A396EmprCod ,
                                          String AV47EmprCod ,
                                          int A5532Lb_numero ,
                                          int AV48Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String AV49Lb_opcion )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[21];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.Lb_opcion, T2.PrdFibra, T2.PrdGots, T1.Lb_fibra, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantC, T2.PrdNom, T1.Lb_LineaC, T1.PrdNum, T1.EmprCod" ;
      scmdbuf += " FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      if ( ! (0==AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC >= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC <= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC >= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC <= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdFibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFibra = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_fibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_fibra = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdGots = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrdFibra" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P0AED6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac ,
                                          short AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to ,
                                          String AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                          String AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                          String AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                          String AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                          java.math.BigDecimal AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                          byte AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume ,
                                          byte AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                          String AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                          String AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                          String AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                          String AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                          String AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                          String AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                          short A5557Lb_LineaC ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5558LB_CantC ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A14094PrdFibra ,
                                          String A14096Lb_fibra ,
                                          String A11363PrdGots ,
                                          String AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                          String AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          String A396EmprCod ,
                                          String AV47EmprCod ,
                                          int A5532Lb_numero ,
                                          int AV48Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String AV49Lb_opcion )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[21];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.Lb_opcion, T1.Lb_fibra, T2.PrdGots, T2.PrdFibra, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantC, T2.PrdNom, T1.Lb_LineaC, T1.PrdNum, T1.EmprCod" ;
      scmdbuf += " FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      if ( ! (0==AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC >= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC <= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC <= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdFibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFibra = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_fibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_fibra = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdGots = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.Lb_fibra" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P0AED7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac ,
                                          short AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to ,
                                          String AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                          String AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                          String AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                          String AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                          java.math.BigDecimal AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                          byte AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume ,
                                          byte AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                          String AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                          String AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                          String AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                          String AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                          String AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                          String AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                          short A5557Lb_LineaC ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5558LB_CantC ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A14094PrdFibra ,
                                          String A14096Lb_fibra ,
                                          String A11363PrdGots ,
                                          String AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                          String AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          String A396EmprCod ,
                                          String AV47EmprCod ,
                                          int A5532Lb_numero ,
                                          int AV48Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String AV49Lb_opcion )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[21];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.Lb_opcion, T2.PrdGots, T1.Lb_fibra, T2.PrdFibra, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantC, T2.PrdNom, T1.Lb_LineaC, T1.PrdNum, T1.EmprCod" ;
      scmdbuf += " FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      if ( ! (0==AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC >= ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! (0==AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC <= ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC >= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC <= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdFibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFibra = ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_fibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_fibra = ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdGots = ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrdGots" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P0AED8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac ,
                                          short AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to ,
                                          String AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel ,
                                          String AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum ,
                                          String AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel ,
                                          String AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc ,
                                          java.math.BigDecimal AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to ,
                                          byte AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume ,
                                          byte AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel ,
                                          String AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc ,
                                          String AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra ,
                                          String AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel ,
                                          String AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra ,
                                          String AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel ,
                                          String AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots ,
                                          short A5557Lb_LineaC ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5558LB_CantC ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String A14094PrdFibra ,
                                          String A14096Lb_fibra ,
                                          String A11363PrdGots ,
                                          String AV77Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_20_tfprdctwst_sel ,
                                          String AV76Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_19_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          String AV47EmprCod ,
                                          int AV48Lb_numero ,
                                          String AV49Lb_opcion ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[21];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.Lb_opcion, T1.Lb_numero, T2.PrdGots, T1.Lb_fibra, T2.PrdFibra, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantC, T2.PrdNom, T1.Lb_LineaC, T1.PrdNum, T1.EmprCod" ;
      scmdbuf += " FROM ((TXPENS003 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      scmdbuf += " = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ?)");
      if ( ! (0==AV58Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_1_tflb_lineac) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC >= ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( ! (0==AV59Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_2_tflb_lineac_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaC <= ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV60Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV62Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_7_tflb_cantc)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC >= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_8_tflb_cantc_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantC <= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) && ( ! (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_13_tfprdfibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdFibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_14_tfprdfibra_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFibra = ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) && ( ! (GXutil.strcmp("", AV72Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_15_tflb_fibra)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_fibra) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_16_tflb_fibra_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_fibra = ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_17_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_entradaensayoslaboratoriocolorantes_wpds_18_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdGots = ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion" ;
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
                  return conditional_P0AED2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 1 :
                  return conditional_P0AED3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 2 :
                  return conditional_P0AED4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 3 :
                  return conditional_P0AED5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 4 :
                  return conditional_P0AED6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 5 :
                  return conditional_P0AED7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] );
            case 6 :
                  return conditional_P0AED8(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AED2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AED3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AED4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AED5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AED6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AED7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AED8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 4);
               ((String[]) buf[6])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[10])[0] = rslt.getString(9, 26);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 6);
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               return;
      }
   }

}

