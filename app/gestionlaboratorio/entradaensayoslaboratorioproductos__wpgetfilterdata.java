package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradaensayoslaboratorioproductos__wpgetfilterdata extends GXProcedure
{
   public entradaensayoslaboratorioproductos__wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayoslaboratorioproductos__wpgetfilterdata.class ), "" );
   }

   public entradaensayoslaboratorioproductos__wpgetfilterdata( int remoteHandle ,
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
      entradaensayoslaboratorioproductos__wpgetfilterdata.this.aP5 = new String[] {""};
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
      entradaensayoslaboratorioproductos__wpgetfilterdata.this.AV40DDOName = aP0;
      entradaensayoslaboratorioproductos__wpgetfilterdata.this.AV41SearchTxt = aP1;
      entradaensayoslaboratorioproductos__wpgetfilterdata.this.AV42SearchTxtTo = aP2;
      entradaensayoslaboratorioproductos__wpgetfilterdata.this.aP3 = aP3;
      entradaensayoslaboratorioproductos__wpgetfilterdata.this.aP4 = aP4;
      entradaensayoslaboratorioproductos__wpgetfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV40DDOName), "DDO_PRDCTWST") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDCTWSTOPTIONS' */
         S151 ();
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
      if ( GXutil.strcmp(AV35Session.getValue("GestionLaboratorio.EntradaEnsayosLaboratorioProductos__WPGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.EntradaEnsayosLaboratorioProductos__WPGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("GestionLaboratorio.EntradaEnsayosLaboratorioProductos__WPGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_LINEAPR") == 0 )
         {
            AV10TFLb_LineaPr = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFLb_LineaPr_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
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
            AV14TFPrdNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV15TFPrdNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CANTP") == 0 )
         {
            AV20TFLB_CantP = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFLB_CantP_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV16TFForPrdUMe = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFForPrdUMe_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV18TFForPrdDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV19TFForPrdDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ORDEN") == 0 )
         {
            AV22TFLb_orden = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFLb_orden_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_PTINP") == 0 )
         {
            AV24TFLb_PTinP = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFLb_PTinP_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCTWST") == 0 )
         {
            AV26TFPrdCtwSt = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCTWST_SEL") == 0 )
         {
            AV27TFPrdCtwSt_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV41SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr = AV10TFLb_LineaPr ;
      AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to = AV11TFLb_LineaPr_To ;
      AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = AV12TFPrdNum ;
      AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = AV14TFPrdNom ;
      AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = AV20TFLB_CantP ;
      AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = AV21TFLB_CantP_To ;
      AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume = AV16TFForPrdUMe ;
      AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to = AV17TFForPrdUMe_To ;
      AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = AV18TFForPrdDsc ;
      AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden = AV22TFLb_orden ;
      AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to = AV23TFLb_orden_To ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp = AV24TFLb_PTinP ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to = AV25TFLb_PTinP_To ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = AV26TFPrdCtwSt ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = AV27TFPrdCtwSt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) ,
                                           Short.valueOf(AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) ,
                                           AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                           AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                           AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                           AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                           AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                           AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                           Byte.valueOf(AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) ,
                                           AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                           AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                           Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) ,
                                           Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) ,
                                           Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) ,
                                           Byte.valueOf(AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) ,
                                           Short.valueOf(A5560Lb_LineaPr) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5561LB_CantP ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A5562Lb_orden) ,
                                           Byte.valueOf(A6545Lb_PTinP) ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(AV47Lb_numero) ,
                                           A5555Lb_opcion ,
                                           AV48Lb_opcion ,
                                           AV46EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum), 6, "%") ;
      lV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom), 26, "%") ;
      lV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc), 5, "%") ;
      /* Using cursor P0AN22 */
      pr_default.execute(0, new Object[] {AV46EmprCod, Integer.valueOf(AV47Lb_numero), AV48Lb_opcion, Short.valueOf(AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr), Short.valueOf(AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to), lV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum, AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel, lV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom, AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel, AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp, AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to, Byte.valueOf(AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume), Byte.valueOf(AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to), lV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc, AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel, Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden), Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to), Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp), Byte.valueOf(AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAN22 = false ;
         A5555Lb_opcion = P0AN22_A5555Lb_opcion[0] ;
         A5532Lb_numero = P0AN22_A5532Lb_numero[0] ;
         A6545Lb_PTinP = P0AN22_A6545Lb_PTinP[0] ;
         A5562Lb_orden = P0AN22_A5562Lb_orden[0] ;
         A488ForPrdDsc = P0AN22_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AN22_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AN22_A490ForPrdUMe[0] ;
         A5561LB_CantP = P0AN22_A5561LB_CantP[0] ;
         A718PrdNom = P0AN22_A718PrdNom[0] ;
         A5560Lb_LineaPr = P0AN22_A5560Lb_LineaPr[0] ;
         A719PrdNum = P0AN22_A719PrdNum[0] ;
         A396EmprCod = P0AN22_A396EmprCod[0] ;
         A718PrdNom = P0AN22_A718PrdNom[0] ;
         A488ForPrdDsc = P0AN22_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AN22_n488ForPrdDsc[0] ;
         GXt_char2 = A14097PrdCtwSt ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char5[0] = GXt_char2 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5) ;
         entradaensayoslaboratorioproductos__wpgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         entradaensayoslaboratorioproductos__wpgetfilterdata.this.A719PrdNum = GXv_char4[0] ;
         entradaensayoslaboratorioproductos__wpgetfilterdata.this.GXt_char2 = GXv_char5[0] ;
         A14097PrdCtwSt = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel) == 0 ) ) )
            {
               AV34count = 0 ;
               while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AN22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AN22_A719PrdNum[0], A719PrdNum) == 0 ) )
               {
                  brkAN22 = false ;
                  A5555Lb_opcion = P0AN22_A5555Lb_opcion[0] ;
                  A5532Lb_numero = P0AN22_A5532Lb_numero[0] ;
                  A5560Lb_LineaPr = P0AN22_A5560Lb_LineaPr[0] ;
                  AV34count = (long)(AV34count+1) ;
                  brkAN22 = true ;
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
         if ( ! brkAN22 )
         {
            brkAN22 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNom = AV41SearchTxt ;
      AV15TFPrdNom_Sel = "" ;
      AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr = AV10TFLb_LineaPr ;
      AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to = AV11TFLb_LineaPr_To ;
      AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = AV12TFPrdNum ;
      AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = AV14TFPrdNom ;
      AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = AV20TFLB_CantP ;
      AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = AV21TFLB_CantP_To ;
      AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume = AV16TFForPrdUMe ;
      AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to = AV17TFForPrdUMe_To ;
      AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = AV18TFForPrdDsc ;
      AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden = AV22TFLb_orden ;
      AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to = AV23TFLb_orden_To ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp = AV24TFLb_PTinP ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to = AV25TFLb_PTinP_To ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = AV26TFPrdCtwSt ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = AV27TFPrdCtwSt_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) ,
                                           Short.valueOf(AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) ,
                                           AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                           AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                           AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                           AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                           AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                           AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                           Byte.valueOf(AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) ,
                                           AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                           AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                           Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) ,
                                           Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) ,
                                           Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) ,
                                           Byte.valueOf(AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) ,
                                           Short.valueOf(A5560Lb_LineaPr) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5561LB_CantP ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A5562Lb_orden) ,
                                           Byte.valueOf(A6545Lb_PTinP) ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(AV47Lb_numero) ,
                                           A5555Lb_opcion ,
                                           AV48Lb_opcion ,
                                           AV46EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum), 6, "%") ;
      lV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom), 26, "%") ;
      lV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc), 5, "%") ;
      /* Using cursor P0AN23 */
      pr_default.execute(1, new Object[] {AV46EmprCod, Integer.valueOf(AV47Lb_numero), AV48Lb_opcion, Short.valueOf(AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr), Short.valueOf(AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to), lV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum, AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel, lV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom, AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel, AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp, AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to, Byte.valueOf(AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume), Byte.valueOf(AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to), lV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc, AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel, Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden), Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to), Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp), Byte.valueOf(AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAN24 = false ;
         A5555Lb_opcion = P0AN23_A5555Lb_opcion[0] ;
         A5532Lb_numero = P0AN23_A5532Lb_numero[0] ;
         A6545Lb_PTinP = P0AN23_A6545Lb_PTinP[0] ;
         A5562Lb_orden = P0AN23_A5562Lb_orden[0] ;
         A488ForPrdDsc = P0AN23_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AN23_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AN23_A490ForPrdUMe[0] ;
         A5561LB_CantP = P0AN23_A5561LB_CantP[0] ;
         A718PrdNom = P0AN23_A718PrdNom[0] ;
         A5560Lb_LineaPr = P0AN23_A5560Lb_LineaPr[0] ;
         A719PrdNum = P0AN23_A719PrdNum[0] ;
         A396EmprCod = P0AN23_A396EmprCod[0] ;
         A718PrdNom = P0AN23_A718PrdNom[0] ;
         A488ForPrdDsc = P0AN23_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AN23_n488ForPrdDsc[0] ;
         GXt_char2 = A14097PrdCtwSt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         entradaensayoslaboratorioproductos__wpgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         entradaensayoslaboratorioproductos__wpgetfilterdata.this.A719PrdNum = GXv_char4[0] ;
         entradaensayoslaboratorioproductos__wpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14097PrdCtwSt = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel) == 0 ) ) )
            {
               AV34count = 0 ;
               while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AN23_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AN23_A719PrdNum[0], A719PrdNum) == 0 ) )
               {
                  brkAN24 = false ;
                  A5555Lb_opcion = P0AN23_A5555Lb_opcion[0] ;
                  A5532Lb_numero = P0AN23_A5532Lb_numero[0] ;
                  A5560Lb_LineaPr = P0AN23_A5560Lb_LineaPr[0] ;
                  AV34count = (long)(AV34count+1) ;
                  brkAN24 = true ;
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
         if ( ! brkAN24 )
         {
            brkAN24 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFForPrdDsc = AV41SearchTxt ;
      AV19TFForPrdDsc_Sel = "" ;
      AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr = AV10TFLb_LineaPr ;
      AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to = AV11TFLb_LineaPr_To ;
      AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = AV12TFPrdNum ;
      AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = AV14TFPrdNom ;
      AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = AV20TFLB_CantP ;
      AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = AV21TFLB_CantP_To ;
      AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume = AV16TFForPrdUMe ;
      AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to = AV17TFForPrdUMe_To ;
      AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = AV18TFForPrdDsc ;
      AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden = AV22TFLb_orden ;
      AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to = AV23TFLb_orden_To ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp = AV24TFLb_PTinP ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to = AV25TFLb_PTinP_To ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = AV26TFPrdCtwSt ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = AV27TFPrdCtwSt_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) ,
                                           Short.valueOf(AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) ,
                                           AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                           AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                           AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                           AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                           AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                           AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                           Byte.valueOf(AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) ,
                                           AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                           AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                           Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) ,
                                           Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) ,
                                           Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) ,
                                           Byte.valueOf(AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) ,
                                           Short.valueOf(A5560Lb_LineaPr) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5561LB_CantP ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A5562Lb_orden) ,
                                           Byte.valueOf(A6545Lb_PTinP) ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(AV47Lb_numero) ,
                                           A5555Lb_opcion ,
                                           AV48Lb_opcion ,
                                           AV46EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum), 6, "%") ;
      lV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom), 26, "%") ;
      lV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc), 5, "%") ;
      /* Using cursor P0AN24 */
      pr_default.execute(2, new Object[] {AV46EmprCod, Integer.valueOf(AV47Lb_numero), AV48Lb_opcion, Short.valueOf(AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr), Short.valueOf(AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to), lV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum, AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel, lV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom, AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel, AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp, AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to, Byte.valueOf(AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume), Byte.valueOf(AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to), lV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc, AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel, Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden), Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to), Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp), Byte.valueOf(AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAN26 = false ;
         A490ForPrdUMe = P0AN24_A490ForPrdUMe[0] ;
         A5555Lb_opcion = P0AN24_A5555Lb_opcion[0] ;
         A5532Lb_numero = P0AN24_A5532Lb_numero[0] ;
         A6545Lb_PTinP = P0AN24_A6545Lb_PTinP[0] ;
         A5562Lb_orden = P0AN24_A5562Lb_orden[0] ;
         A488ForPrdDsc = P0AN24_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AN24_n488ForPrdDsc[0] ;
         A5561LB_CantP = P0AN24_A5561LB_CantP[0] ;
         A718PrdNom = P0AN24_A718PrdNom[0] ;
         A5560Lb_LineaPr = P0AN24_A5560Lb_LineaPr[0] ;
         A719PrdNum = P0AN24_A719PrdNum[0] ;
         A396EmprCod = P0AN24_A396EmprCod[0] ;
         A718PrdNom = P0AN24_A718PrdNom[0] ;
         A488ForPrdDsc = P0AN24_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AN24_n488ForPrdDsc[0] ;
         GXt_char2 = A14097PrdCtwSt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         entradaensayoslaboratorioproductos__wpgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         entradaensayoslaboratorioproductos__wpgetfilterdata.this.A719PrdNum = GXv_char4[0] ;
         entradaensayoslaboratorioproductos__wpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14097PrdCtwSt = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel) == 0 ) ) )
            {
               AV34count = 0 ;
               while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AN24_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AN24_A490ForPrdUMe[0] == A490ForPrdUMe ) )
               {
                  brkAN26 = false ;
                  A5555Lb_opcion = P0AN24_A5555Lb_opcion[0] ;
                  A5532Lb_numero = P0AN24_A5532Lb_numero[0] ;
                  A5560Lb_LineaPr = P0AN24_A5560Lb_LineaPr[0] ;
                  AV34count = (long)(AV34count+1) ;
                  brkAN26 = true ;
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
         if ( ! brkAN26 )
         {
            brkAN26 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRDCTWSTOPTIONS' Routine */
      returnInSub = false ;
      AV26TFPrdCtwSt = AV41SearchTxt ;
      AV27TFPrdCtwSt_Sel = "" ;
      AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr = AV10TFLb_LineaPr ;
      AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to = AV11TFLb_LineaPr_To ;
      AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = AV12TFPrdNum ;
      AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = AV14TFPrdNom ;
      AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = AV20TFLB_CantP ;
      AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = AV21TFLB_CantP_To ;
      AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume = AV16TFForPrdUMe ;
      AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to = AV17TFForPrdUMe_To ;
      AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = AV18TFForPrdDsc ;
      AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden = AV22TFLb_orden ;
      AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to = AV23TFLb_orden_To ;
      AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp = AV24TFLb_PTinP ;
      AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to = AV25TFLb_PTinP_To ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = AV26TFPrdCtwSt ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = AV27TFPrdCtwSt_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Short.valueOf(AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) ,
                                           Short.valueOf(AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) ,
                                           AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                           AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                           AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                           AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                           AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                           AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                           Byte.valueOf(AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) ,
                                           AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                           AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                           Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) ,
                                           Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) ,
                                           Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) ,
                                           Byte.valueOf(AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) ,
                                           Short.valueOf(A5560Lb_LineaPr) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A5561LB_CantP ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A5562Lb_orden) ,
                                           Byte.valueOf(A6545Lb_PTinP) ,
                                           AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                           AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                           A14097PrdCtwSt ,
                                           AV46EmprCod ,
                                           Integer.valueOf(AV47Lb_numero) ,
                                           AV48Lb_opcion ,
                                           A396EmprCod ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           A5555Lb_opcion } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum), 6, "%") ;
      lV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom), 26, "%") ;
      lV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc), 5, "%") ;
      /* Using cursor P0AN25 */
      pr_default.execute(3, new Object[] {AV46EmprCod, Integer.valueOf(AV47Lb_numero), AV48Lb_opcion, Short.valueOf(AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr), Short.valueOf(AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to), lV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum, AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel, lV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom, AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel, AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp, AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to, Byte.valueOf(AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume), Byte.valueOf(AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to), lV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc, AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel, Short.valueOf(AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden), Short.valueOf(AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to), Byte.valueOf(AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp), Byte.valueOf(AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A5555Lb_opcion = P0AN25_A5555Lb_opcion[0] ;
         A5532Lb_numero = P0AN25_A5532Lb_numero[0] ;
         A6545Lb_PTinP = P0AN25_A6545Lb_PTinP[0] ;
         A5562Lb_orden = P0AN25_A5562Lb_orden[0] ;
         A488ForPrdDsc = P0AN25_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AN25_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AN25_A490ForPrdUMe[0] ;
         A5561LB_CantP = P0AN25_A5561LB_CantP[0] ;
         A718PrdNom = P0AN25_A718PrdNom[0] ;
         A5560Lb_LineaPr = P0AN25_A5560Lb_LineaPr[0] ;
         A719PrdNum = P0AN25_A719PrdNum[0] ;
         A396EmprCod = P0AN25_A396EmprCod[0] ;
         A718PrdNom = P0AN25_A718PrdNom[0] ;
         A488ForPrdDsc = P0AN25_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AN25_n488ForPrdDsc[0] ;
         GXt_char2 = A14097PrdCtwSt ;
         GXv_char5[0] = A396EmprCod ;
         GXv_char4[0] = A719PrdNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.stocksquimicos.ctwst(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3) ;
         entradaensayoslaboratorioproductos__wpgetfilterdata.this.A396EmprCod = GXv_char5[0] ;
         entradaensayoslaboratorioproductos__wpgetfilterdata.this.A719PrdNum = GXv_char4[0] ;
         entradaensayoslaboratorioproductos__wpgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14097PrdCtwSt = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) && ( ! (GXutil.strcmp("", AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst)==0) ) ) || ( GXutil.like( GXutil.upper( A14097PrdCtwSt) , GXutil.padr( "%" + GXutil.upper( AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel)==0) || ( ( GXutil.strcmp(A14097PrdCtwSt, AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel) == 0 ) ) )
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
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = entradaensayoslaboratorioproductos__wpgetfilterdata.this.AV43OptionsJson;
      this.aP4[0] = entradaensayoslaboratorioproductos__wpgetfilterdata.this.AV44OptionsDescJson;
      this.aP5[0] = entradaensayoslaboratorioproductos__wpgetfilterdata.this.AV45OptionIndexesJson;
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
      AV14TFPrdNom = "" ;
      AV15TFPrdNom_Sel = "" ;
      AV20TFLB_CantP = DecimalUtil.ZERO ;
      AV21TFLB_CantP_To = DecimalUtil.ZERO ;
      AV18TFForPrdDsc = "" ;
      AV19TFForPrdDsc_Sel = "" ;
      AV26TFPrdCtwSt = "" ;
      AV27TFPrdCtwSt_Sel = "" ;
      A719PrdNum = "" ;
      AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = "" ;
      AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel = "" ;
      AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = "" ;
      AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel = "" ;
      AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp = DecimalUtil.ZERO ;
      AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to = DecimalUtil.ZERO ;
      AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = "" ;
      AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel = "" ;
      AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst = "" ;
      AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel = "" ;
      scmdbuf = "" ;
      lV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum = "" ;
      lV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom = "" ;
      lV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc = "" ;
      A718PrdNom = "" ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A14097PrdCtwSt = "" ;
      A5555Lb_opcion = "" ;
      AV48Lb_opcion = "" ;
      AV46EmprCod = "" ;
      A396EmprCod = "" ;
      P0AN22_A5555Lb_opcion = new String[] {""} ;
      P0AN22_A5532Lb_numero = new int[1] ;
      P0AN22_A6545Lb_PTinP = new byte[1] ;
      P0AN22_A5562Lb_orden = new short[1] ;
      P0AN22_A488ForPrdDsc = new String[] {""} ;
      P0AN22_n488ForPrdDsc = new boolean[] {false} ;
      P0AN22_A490ForPrdUMe = new byte[1] ;
      P0AN22_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AN22_A718PrdNom = new String[] {""} ;
      P0AN22_A5560Lb_LineaPr = new short[1] ;
      P0AN22_A719PrdNum = new String[] {""} ;
      P0AN22_A396EmprCod = new String[] {""} ;
      AV29Option = "" ;
      P0AN23_A5555Lb_opcion = new String[] {""} ;
      P0AN23_A5532Lb_numero = new int[1] ;
      P0AN23_A6545Lb_PTinP = new byte[1] ;
      P0AN23_A5562Lb_orden = new short[1] ;
      P0AN23_A488ForPrdDsc = new String[] {""} ;
      P0AN23_n488ForPrdDsc = new boolean[] {false} ;
      P0AN23_A490ForPrdUMe = new byte[1] ;
      P0AN23_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AN23_A718PrdNom = new String[] {""} ;
      P0AN23_A5560Lb_LineaPr = new short[1] ;
      P0AN23_A719PrdNum = new String[] {""} ;
      P0AN23_A396EmprCod = new String[] {""} ;
      P0AN24_A490ForPrdUMe = new byte[1] ;
      P0AN24_A5555Lb_opcion = new String[] {""} ;
      P0AN24_A5532Lb_numero = new int[1] ;
      P0AN24_A6545Lb_PTinP = new byte[1] ;
      P0AN24_A5562Lb_orden = new short[1] ;
      P0AN24_A488ForPrdDsc = new String[] {""} ;
      P0AN24_n488ForPrdDsc = new boolean[] {false} ;
      P0AN24_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AN24_A718PrdNom = new String[] {""} ;
      P0AN24_A5560Lb_LineaPr = new short[1] ;
      P0AN24_A719PrdNum = new String[] {""} ;
      P0AN24_A396EmprCod = new String[] {""} ;
      P0AN25_A5555Lb_opcion = new String[] {""} ;
      P0AN25_A5532Lb_numero = new int[1] ;
      P0AN25_A6545Lb_PTinP = new byte[1] ;
      P0AN25_A5562Lb_orden = new short[1] ;
      P0AN25_A488ForPrdDsc = new String[] {""} ;
      P0AN25_n488ForPrdDsc = new boolean[] {false} ;
      P0AN25_A490ForPrdUMe = new byte[1] ;
      P0AN25_A5561LB_CantP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AN25_A718PrdNom = new String[] {""} ;
      P0AN25_A5560Lb_LineaPr = new short[1] ;
      P0AN25_A719PrdNum = new String[] {""} ;
      P0AN25_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.entradaensayoslaboratorioproductos__wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AN22_A5555Lb_opcion, P0AN22_A5532Lb_numero, P0AN22_A6545Lb_PTinP, P0AN22_A5562Lb_orden, P0AN22_A488ForPrdDsc, P0AN22_n488ForPrdDsc, P0AN22_A490ForPrdUMe, P0AN22_A5561LB_CantP, P0AN22_A718PrdNom, P0AN22_A5560Lb_LineaPr,
            P0AN22_A719PrdNum, P0AN22_A396EmprCod
            }
            , new Object[] {
            P0AN23_A5555Lb_opcion, P0AN23_A5532Lb_numero, P0AN23_A6545Lb_PTinP, P0AN23_A5562Lb_orden, P0AN23_A488ForPrdDsc, P0AN23_n488ForPrdDsc, P0AN23_A490ForPrdUMe, P0AN23_A5561LB_CantP, P0AN23_A718PrdNom, P0AN23_A5560Lb_LineaPr,
            P0AN23_A719PrdNum, P0AN23_A396EmprCod
            }
            , new Object[] {
            P0AN24_A490ForPrdUMe, P0AN24_A5555Lb_opcion, P0AN24_A5532Lb_numero, P0AN24_A6545Lb_PTinP, P0AN24_A5562Lb_orden, P0AN24_A488ForPrdDsc, P0AN24_n488ForPrdDsc, P0AN24_A5561LB_CantP, P0AN24_A718PrdNom, P0AN24_A5560Lb_LineaPr,
            P0AN24_A719PrdNum, P0AN24_A396EmprCod
            }
            , new Object[] {
            P0AN25_A5555Lb_opcion, P0AN25_A5532Lb_numero, P0AN25_A6545Lb_PTinP, P0AN25_A5562Lb_orden, P0AN25_A488ForPrdDsc, P0AN25_n488ForPrdDsc, P0AN25_A490ForPrdUMe, P0AN25_A5561LB_CantP, P0AN25_A718PrdNom, P0AN25_A5560Lb_LineaPr,
            P0AN25_A719PrdNum, P0AN25_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TFForPrdUMe ;
   private byte AV17TFForPrdUMe_To ;
   private byte AV24TFLb_PTinP ;
   private byte AV25TFLb_PTinP_To ;
   private byte AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume ;
   private byte AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to ;
   private byte AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp ;
   private byte AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to ;
   private byte A490ForPrdUMe ;
   private byte A6545Lb_PTinP ;
   private short AV10TFLb_LineaPr ;
   private short AV11TFLb_LineaPr_To ;
   private short AV22TFLb_orden ;
   private short AV23TFLb_orden_To ;
   private short AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr ;
   private short AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to ;
   private short AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden ;
   private short AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to ;
   private short A5560Lb_LineaPr ;
   private short A5562Lb_orden ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private int A5532Lb_numero ;
   private int AV47Lb_numero ;
   private int AV28InsertIndex ;
   private long AV34count ;
   private java.math.BigDecimal AV20TFLB_CantP ;
   private java.math.BigDecimal AV21TFLB_CantP_To ;
   private java.math.BigDecimal AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ;
   private java.math.BigDecimal AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ;
   private java.math.BigDecimal A5561LB_CantP ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFPrdNom ;
   private String AV15TFPrdNom_Sel ;
   private String AV18TFForPrdDsc ;
   private String AV19TFForPrdDsc_Sel ;
   private String A719PrdNum ;
   private String AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ;
   private String AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ;
   private String AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ;
   private String AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ;
   private String AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ;
   private String AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ;
   private String scmdbuf ;
   private String lV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ;
   private String lV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ;
   private String lV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String A5555Lb_opcion ;
   private String AV48Lb_opcion ;
   private String AV46EmprCod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private boolean brkAN22 ;
   private boolean n488ForPrdDsc ;
   private boolean brkAN24 ;
   private boolean brkAN26 ;
   private String AV43OptionsJson ;
   private String AV44OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV40DDOName ;
   private String AV41SearchTxt ;
   private String AV42SearchTxtTo ;
   private String AV26TFPrdCtwSt ;
   private String AV27TFPrdCtwSt_Sel ;
   private String AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ;
   private String AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ;
   private String A14097PrdCtwSt ;
   private String AV29Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AN22_A5555Lb_opcion ;
   private int[] P0AN22_A5532Lb_numero ;
   private byte[] P0AN22_A6545Lb_PTinP ;
   private short[] P0AN22_A5562Lb_orden ;
   private String[] P0AN22_A488ForPrdDsc ;
   private boolean[] P0AN22_n488ForPrdDsc ;
   private byte[] P0AN22_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0AN22_A5561LB_CantP ;
   private String[] P0AN22_A718PrdNom ;
   private short[] P0AN22_A5560Lb_LineaPr ;
   private String[] P0AN22_A719PrdNum ;
   private String[] P0AN22_A396EmprCod ;
   private String[] P0AN23_A5555Lb_opcion ;
   private int[] P0AN23_A5532Lb_numero ;
   private byte[] P0AN23_A6545Lb_PTinP ;
   private short[] P0AN23_A5562Lb_orden ;
   private String[] P0AN23_A488ForPrdDsc ;
   private boolean[] P0AN23_n488ForPrdDsc ;
   private byte[] P0AN23_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0AN23_A5561LB_CantP ;
   private String[] P0AN23_A718PrdNom ;
   private short[] P0AN23_A5560Lb_LineaPr ;
   private String[] P0AN23_A719PrdNum ;
   private String[] P0AN23_A396EmprCod ;
   private byte[] P0AN24_A490ForPrdUMe ;
   private String[] P0AN24_A5555Lb_opcion ;
   private int[] P0AN24_A5532Lb_numero ;
   private byte[] P0AN24_A6545Lb_PTinP ;
   private short[] P0AN24_A5562Lb_orden ;
   private String[] P0AN24_A488ForPrdDsc ;
   private boolean[] P0AN24_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AN24_A5561LB_CantP ;
   private String[] P0AN24_A718PrdNom ;
   private short[] P0AN24_A5560Lb_LineaPr ;
   private String[] P0AN24_A719PrdNum ;
   private String[] P0AN24_A396EmprCod ;
   private String[] P0AN25_A5555Lb_opcion ;
   private int[] P0AN25_A5532Lb_numero ;
   private byte[] P0AN25_A6545Lb_PTinP ;
   private short[] P0AN25_A5562Lb_orden ;
   private String[] P0AN25_A488ForPrdDsc ;
   private boolean[] P0AN25_n488ForPrdDsc ;
   private byte[] P0AN25_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0AN25_A5561LB_CantP ;
   private String[] P0AN25_A718PrdNom ;
   private short[] P0AN25_A5560Lb_LineaPr ;
   private String[] P0AN25_A719PrdNum ;
   private String[] P0AN25_A396EmprCod ;
   private GXSimpleCollection<String> AV30Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV33OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class entradaensayoslaboratorioproductos__wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AN22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr ,
                                          short AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to ,
                                          String AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                          String AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                          String AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                          String AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                          java.math.BigDecimal AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                          byte AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume ,
                                          byte AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to ,
                                          String AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                          String AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                          short AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden ,
                                          short AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to ,
                                          byte AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp ,
                                          byte AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to ,
                                          short A5560Lb_LineaPr ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5561LB_CantP ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short A5562Lb_orden ,
                                          byte A6545Lb_PTinP ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          int A5532Lb_numero ,
                                          int AV47Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String AV48Lb_opcion ,
                                          String AV46EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[19];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.Lb_opcion, T1.Lb_numero, T1.Lb_PTinP, T1.Lb_orden, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantP, T2.PrdNom, T1.Lb_LineaPr, T1.PrdNum, T1.EmprCod FROM ((TXPENS004" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      if ( ! (0==AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) )
      {
         addWhere(sWhereString, "(T1.Lb_orden >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) )
      {
         addWhere(sWhereString, "(T1.Lb_orden <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0AN23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr ,
                                          short AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to ,
                                          String AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                          String AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                          String AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                          String AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                          java.math.BigDecimal AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                          byte AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume ,
                                          byte AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to ,
                                          String AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                          String AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                          short AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden ,
                                          short AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to ,
                                          byte AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp ,
                                          byte AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to ,
                                          short A5560Lb_LineaPr ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5561LB_CantP ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short A5562Lb_orden ,
                                          byte A6545Lb_PTinP ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          int A5532Lb_numero ,
                                          int AV47Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String AV48Lb_opcion ,
                                          String AV46EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[19];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.Lb_opcion, T1.Lb_numero, T1.Lb_PTinP, T1.Lb_orden, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantP, T2.PrdNom, T1.Lb_LineaPr, T1.PrdNum, T1.EmprCod FROM ((TXPENS004" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      if ( ! (0==AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) )
      {
         addWhere(sWhereString, "(T1.Lb_orden >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) )
      {
         addWhere(sWhereString, "(T1.Lb_orden <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AN24( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr ,
                                          short AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to ,
                                          String AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                          String AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                          String AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                          String AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                          java.math.BigDecimal AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                          byte AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume ,
                                          byte AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to ,
                                          String AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                          String AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                          short AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden ,
                                          short AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to ,
                                          byte AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp ,
                                          byte AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to ,
                                          short A5560Lb_LineaPr ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5561LB_CantP ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short A5562Lb_orden ,
                                          byte A6545Lb_PTinP ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          int A5532Lb_numero ,
                                          int AV47Lb_numero ,
                                          String A5555Lb_opcion ,
                                          String AV48Lb_opcion ,
                                          String AV46EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[19];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.Lb_opcion, T1.Lb_numero, T1.Lb_PTinP, T1.Lb_orden, T3.ForPrdDsc, T1.LB_CantP, T2.PrdNom, T1.Lb_LineaPr, T1.PrdNum, T1.EmprCod FROM ((TXPENS004" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      if ( ! (0==AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr >= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr <= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP >= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP <= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) )
      {
         addWhere(sWhereString, "(T1.Lb_orden >= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) )
      {
         addWhere(sWhereString, "(T1.Lb_orden <= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP >= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP <= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0AN25( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr ,
                                          short AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to ,
                                          String AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel ,
                                          String AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum ,
                                          String AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel ,
                                          String AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp ,
                                          java.math.BigDecimal AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to ,
                                          byte AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume ,
                                          byte AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to ,
                                          String AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel ,
                                          String AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc ,
                                          short AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden ,
                                          short AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to ,
                                          byte AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp ,
                                          byte AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to ,
                                          short A5560Lb_LineaPr ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A5561LB_CantP ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short A5562Lb_orden ,
                                          byte A6545Lb_PTinP ,
                                          String AV70Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_18_tfprdctwst_sel ,
                                          String AV69Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_17_tfprdctwst ,
                                          String A14097PrdCtwSt ,
                                          String AV46EmprCod ,
                                          int AV47Lb_numero ,
                                          String AV48Lb_opcion ,
                                          String A396EmprCod ,
                                          int A5532Lb_numero ,
                                          String A5555Lb_opcion )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[19];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.Lb_opcion, T1.Lb_numero, T1.Lb_PTinP, T1.Lb_orden, T3.ForPrdDsc, T1.ForPrdUMe, T1.LB_CantP, T2.PrdNom, T1.Lb_LineaPr, T1.PrdNum, T1.EmprCod FROM ((TXPENS004" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ? and T1.Lb_opcion = ?)");
      if ( ! (0==AV53Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_1_tflb_lineapr) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr >= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV54Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_2_tflb_lineapr_to) )
      {
         addWhere(sWhereString, "(T1.Lb_LineaPr <= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV55Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_7_tflb_cantp)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP >= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_8_tflb_cantp_to)==0) )
      {
         addWhere(sWhereString, "(T1.LB_CantP <= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV61Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV62Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (0==AV65Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_13_tflb_orden) )
      {
         addWhere(sWhereString, "(T1.Lb_orden >= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (0==AV66Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_14_tflb_orden_to) )
      {
         addWhere(sWhereString, "(T1.Lb_orden <= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (0==AV67Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_15_tflb_ptinp) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (0==AV68Gestionlaboratorio_entradaensayoslaboratorioproductos__wpds_16_tflb_ptinp_to) )
      {
         addWhere(sWhereString, "(T1.Lb_PTinP <= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion" ;
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
                  return conditional_P0AN22(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 1 :
                  return conditional_P0AN23(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 2 :
                  return conditional_P0AN24(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 3 :
                  return conditional_P0AN25(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AN22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AN23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AN24", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AN25", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               return;
      }
   }

}

