package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class actualizacionensayoencolorteca_wcgetfilterdata extends GXProcedure
{
   public actualizacionensayoencolorteca_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( actualizacionensayoencolorteca_wcgetfilterdata.class ), "" );
   }

   public actualizacionensayoencolorteca_wcgetfilterdata( int remoteHandle ,
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
      actualizacionensayoencolorteca_wcgetfilterdata.this.aP5 = new String[] {""};
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
      actualizacionensayoencolorteca_wcgetfilterdata.this.AV38DDOName = aP0;
      actualizacionensayoencolorteca_wcgetfilterdata.this.AV36SearchTxt = aP1;
      actualizacionensayoencolorteca_wcgetfilterdata.this.AV37SearchTxtTo = aP2;
      actualizacionensayoencolorteca_wcgetfilterdata.this.aP3 = aP3;
      actualizacionensayoencolorteca_wcgetfilterdata.this.aP4 = aP4;
      actualizacionensayoencolorteca_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_LB_ARTCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_ARTCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_LB_COLNOMC") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_COLNOMCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_LB_OPCION") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_OPCIONOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_LB_CARTAZ") == 0 )
      {
         /* Execute user subroutine: 'LOADLB_CARTAZOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV42OptionsJson = AV41Options.toJSonString(false) ;
      AV45OptionsDescJson = AV44OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV46OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV49Session.getValue("GestionLaboratorio.ActualizacionEnsayoenColorteca_WCGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "GestionLaboratorio.ActualizacionEnsayoenColorteca_WCGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("GestionLaboratorio.ActualizacionEnsayoenColorteca_WCGridState"), null, null);
      }
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMERO") == 0 )
         {
            AV10TFLb_numero = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFLb_numero_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV12TFCliCod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCliCod_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD") == 0 )
         {
            AV14TFLb_ArtCod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ARTCOD_SEL") == 0 )
         {
            AV15TFLb_ArtCod_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC") == 0 )
         {
            AV16TFLb_ColNomC = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNOMC_SEL") == 0 )
         {
            AV17TFLb_ColNomC_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COLNUM") == 0 )
         {
            AV18TFLb_ColNum = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFLb_ColNum_To = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV58TFTipColCod = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFTipColCod_To = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RB") == 0 )
         {
            AV20TFLb_Rb = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFLb_Rb_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION") == 0 )
         {
            AV22TFLb_opcion = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_OPCION_SEL") == 0 )
         {
            AV23TFLb_opcion_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_NUMOP") == 0 )
         {
            AV24TFLb_numop = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFLb_numop_To = (byte)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ") == 0 )
         {
            AV26TFLb_Cartaz = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_CARTAZ_SEL") == 0 )
         {
            AV27TFLb_Cartaz_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAE") == 0 )
         {
            AV28TFLb_FechaE = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAEN") == 0 )
         {
            AV30TFLb_FechaEn = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_FECHAR") == 0 )
         {
            AV32TFLb_FechaR = localUtil.ctod( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_ESTADO_SEL") == 0 )
         {
            AV34TFLb_Estado_SelsJson = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV35TFLb_Estado_Sels.fromJSonString(AV34TFLb_Estado_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_RGB") == 0 )
         {
            AV60TFLb_RGB = GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV61TFLb_RGB_To = GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLB_COSTEE") == 0 )
         {
            AV62TFLb_CosteE = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFLb_CosteE_To = CommonUtil.decimalVal( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55Emprcod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV56Clicod = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LB_NUMERO") == 0 )
         {
            AV57Lb_Numero = (int)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADLB_ARTCODOPTIONS' Routine */
      returnInSub = false ;
      AV14TFLb_ArtCod = AV36SearchTxt ;
      AV15TFLb_ArtCod_Sel = "" ;
      AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = AV54FilterFullText ;
      AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero = AV10TFLb_numero ;
      AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod = AV12TFCliCod ;
      AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to = AV13TFCliCod_To ;
      AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = AV14TFLb_ArtCod ;
      AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = AV15TFLb_ArtCod_Sel ;
      AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = AV16TFLb_ColNomC ;
      AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = AV17TFLb_ColNomC_Sel ;
      AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum = AV18TFLb_ColNum ;
      AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to = AV19TFLb_ColNum_To ;
      AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod = AV58TFTipColCod ;
      AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to = AV59TFTipColCod_To ;
      AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = AV20TFLb_Rb ;
      AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = AV21TFLb_Rb_To ;
      AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = AV22TFLb_opcion ;
      AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = AV23TFLb_opcion_Sel ;
      AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop = AV24TFLb_numop ;
      AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to = AV25TFLb_numop_To ;
      AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = AV26TFLb_Cartaz ;
      AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = AV27TFLb_Cartaz_Sel ;
      AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = AV28TFLb_FechaE ;
      AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = AV30TFLb_FechaEn ;
      AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = AV32TFLb_FechaR ;
      AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = AV35TFLb_Estado_Sels ;
      AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb = AV60TFLb_RGB ;
      AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to = AV61TFLb_RGB_To ;
      AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = AV62TFLb_CosteE ;
      AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = AV63TFLb_CosteE_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ,
                                           AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to) ,
                                           AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ,
                                           AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ,
                                           AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ,
                                           AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to) ,
                                           Byte.valueOf(AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod) ,
                                           Byte.valueOf(AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to) ,
                                           AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ,
                                           AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ,
                                           AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ,
                                           AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ,
                                           Byte.valueOf(AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop) ,
                                           Byte.valueOf(AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to) ,
                                           AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ,
                                           AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ,
                                           AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ,
                                           AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ,
                                           AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ,
                                           Integer.valueOf(AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels.size()) ,
                                           Long.valueOf(AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb) ,
                                           Long.valueOf(AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to) ,
                                           AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ,
                                           AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ,
                                           Integer.valueOf(AV56Clicod) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           Long.valueOf(A5599Lb_RGB) ,
                                           A5565Lb_CosteE ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV57Lb_Numero) ,
                                           Byte.valueOf(A5569Lb_EstEns) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE
                                           }
      });
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod), 16, "%") ;
      lV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc), 13, "%") ;
      lV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = GXutil.padr( GXutil.rtrim( AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion), 1, "%") ;
      lV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz), 20, "%") ;
      /* Using cursor P09NV2 */
      pr_default.execute(0, new Object[] {AV55Emprcod, Integer.valueOf(AV57Lb_Numero), lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, Integer.valueOf(AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero), Integer.valueOf(AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to), Integer.valueOf(AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod), Integer.valueOf(AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to), lV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod, AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel, lV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc, AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum), Integer.valueOf(AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to), Byte.valueOf(AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod), Byte.valueOf(AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to), AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb, AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to, lV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion, AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel, Byte.valueOf(AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop), Byte.valueOf(AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to), lV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz, AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel, AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae, AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen, AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar, Long.valueOf(AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb), Long.valueOf(AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to), AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee, AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to, Integer.valueOf(AV56Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9NV2 = false ;
         A396EmprCod = P09NV2_A396EmprCod[0] ;
         A5532Lb_numero = P09NV2_A5532Lb_numero[0] ;
         A5569Lb_EstEns = P09NV2_A5569Lb_EstEns[0] ;
         A5533Lb_ArtCod = P09NV2_A5533Lb_ArtCod[0] ;
         A5565Lb_CosteE = P09NV2_A5565Lb_CosteE[0] ;
         A5599Lb_RGB = P09NV2_A5599Lb_RGB[0] ;
         A5566Lb_Estado = P09NV2_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09NV2_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09NV2_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09NV2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NV2_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09NV2_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09NV2_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09NV2_A5547Lb_Rb[0] ;
         A831TipColCod = P09NV2_A831TipColCod[0] ;
         n831TipColCod = P09NV2_n831TipColCod[0] ;
         A5537Lb_ColNum = P09NV2_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NV2_A5538Lb_ColNomC[0] ;
         A252CliCod = P09NV2_A252CliCod[0] ;
         A5569Lb_EstEns = P09NV2_A5569Lb_EstEns[0] ;
         A5533Lb_ArtCod = P09NV2_A5533Lb_ArtCod[0] ;
         A5599Lb_RGB = P09NV2_A5599Lb_RGB[0] ;
         A5541Lb_FechaE = P09NV2_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NV2_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09NV2_A5547Lb_Rb[0] ;
         A831TipColCod = P09NV2_A831TipColCod[0] ;
         n831TipColCod = P09NV2_n831TipColCod[0] ;
         A5537Lb_ColNum = P09NV2_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NV2_A5538Lb_ColNomC[0] ;
         A252CliCod = P09NV2_A252CliCod[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09NV2_A5533Lb_ArtCod[0], A5533Lb_ArtCod) == 0 ) )
         {
            brk9NV2 = false ;
            A396EmprCod = P09NV2_A396EmprCod[0] ;
            A5532Lb_numero = P09NV2_A5532Lb_numero[0] ;
            A5555Lb_opcion = P09NV2_A5555Lb_opcion[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9NV2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A5533Lb_ArtCod)==0) )
         {
            AV40Option = A5533Lb_ArtCod ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9NV2 )
         {
            brk9NV2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADLB_COLNOMCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFLb_ColNomC = AV36SearchTxt ;
      AV17TFLb_ColNomC_Sel = "" ;
      AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = AV54FilterFullText ;
      AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero = AV10TFLb_numero ;
      AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod = AV12TFCliCod ;
      AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to = AV13TFCliCod_To ;
      AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = AV14TFLb_ArtCod ;
      AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = AV15TFLb_ArtCod_Sel ;
      AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = AV16TFLb_ColNomC ;
      AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = AV17TFLb_ColNomC_Sel ;
      AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum = AV18TFLb_ColNum ;
      AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to = AV19TFLb_ColNum_To ;
      AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod = AV58TFTipColCod ;
      AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to = AV59TFTipColCod_To ;
      AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = AV20TFLb_Rb ;
      AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = AV21TFLb_Rb_To ;
      AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = AV22TFLb_opcion ;
      AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = AV23TFLb_opcion_Sel ;
      AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop = AV24TFLb_numop ;
      AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to = AV25TFLb_numop_To ;
      AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = AV26TFLb_Cartaz ;
      AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = AV27TFLb_Cartaz_Sel ;
      AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = AV28TFLb_FechaE ;
      AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = AV30TFLb_FechaEn ;
      AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = AV32TFLb_FechaR ;
      AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = AV35TFLb_Estado_Sels ;
      AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb = AV60TFLb_RGB ;
      AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to = AV61TFLb_RGB_To ;
      AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = AV62TFLb_CosteE ;
      AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = AV63TFLb_CosteE_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ,
                                           AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to) ,
                                           AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ,
                                           AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ,
                                           AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ,
                                           AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to) ,
                                           Byte.valueOf(AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod) ,
                                           Byte.valueOf(AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to) ,
                                           AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ,
                                           AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ,
                                           AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ,
                                           AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ,
                                           Byte.valueOf(AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop) ,
                                           Byte.valueOf(AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to) ,
                                           AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ,
                                           AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ,
                                           AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ,
                                           AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ,
                                           AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ,
                                           Integer.valueOf(AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels.size()) ,
                                           Long.valueOf(AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb) ,
                                           Long.valueOf(AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to) ,
                                           AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ,
                                           AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ,
                                           Integer.valueOf(AV56Clicod) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           Long.valueOf(A5599Lb_RGB) ,
                                           A5565Lb_CosteE ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV57Lb_Numero) ,
                                           Byte.valueOf(A5569Lb_EstEns) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE
                                           }
      });
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod), 16, "%") ;
      lV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc), 13, "%") ;
      lV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = GXutil.padr( GXutil.rtrim( AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion), 1, "%") ;
      lV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz), 20, "%") ;
      /* Using cursor P09NV3 */
      pr_default.execute(1, new Object[] {AV55Emprcod, Integer.valueOf(AV57Lb_Numero), lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, Integer.valueOf(AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero), Integer.valueOf(AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to), Integer.valueOf(AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod), Integer.valueOf(AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to), lV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod, AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel, lV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc, AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum), Integer.valueOf(AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to), Byte.valueOf(AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod), Byte.valueOf(AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to), AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb, AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to, lV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion, AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel, Byte.valueOf(AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop), Byte.valueOf(AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to), lV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz, AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel, AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae, AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen, AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar, Long.valueOf(AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb), Long.valueOf(AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to), AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee, AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to, Integer.valueOf(AV56Clicod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9NV4 = false ;
         A396EmprCod = P09NV3_A396EmprCod[0] ;
         A5532Lb_numero = P09NV3_A5532Lb_numero[0] ;
         A5569Lb_EstEns = P09NV3_A5569Lb_EstEns[0] ;
         A5538Lb_ColNomC = P09NV3_A5538Lb_ColNomC[0] ;
         A5565Lb_CosteE = P09NV3_A5565Lb_CosteE[0] ;
         A5599Lb_RGB = P09NV3_A5599Lb_RGB[0] ;
         A5566Lb_Estado = P09NV3_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09NV3_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09NV3_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09NV3_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NV3_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09NV3_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09NV3_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09NV3_A5547Lb_Rb[0] ;
         A831TipColCod = P09NV3_A831TipColCod[0] ;
         n831TipColCod = P09NV3_n831TipColCod[0] ;
         A5537Lb_ColNum = P09NV3_A5537Lb_ColNum[0] ;
         A5533Lb_ArtCod = P09NV3_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NV3_A252CliCod[0] ;
         A5569Lb_EstEns = P09NV3_A5569Lb_EstEns[0] ;
         A5538Lb_ColNomC = P09NV3_A5538Lb_ColNomC[0] ;
         A5599Lb_RGB = P09NV3_A5599Lb_RGB[0] ;
         A5541Lb_FechaE = P09NV3_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NV3_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09NV3_A5547Lb_Rb[0] ;
         A831TipColCod = P09NV3_A831TipColCod[0] ;
         n831TipColCod = P09NV3_n831TipColCod[0] ;
         A5537Lb_ColNum = P09NV3_A5537Lb_ColNum[0] ;
         A5533Lb_ArtCod = P09NV3_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NV3_A252CliCod[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09NV3_A5538Lb_ColNomC[0], A5538Lb_ColNomC) == 0 ) )
         {
            brk9NV4 = false ;
            A396EmprCod = P09NV3_A396EmprCod[0] ;
            A5532Lb_numero = P09NV3_A5532Lb_numero[0] ;
            A5555Lb_opcion = P09NV3_A5555Lb_opcion[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9NV4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A5538Lb_ColNomC)==0) )
         {
            AV40Option = A5538Lb_ColNomC ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9NV4 )
         {
            brk9NV4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADLB_OPCIONOPTIONS' Routine */
      returnInSub = false ;
      AV22TFLb_opcion = AV36SearchTxt ;
      AV23TFLb_opcion_Sel = "" ;
      AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = AV54FilterFullText ;
      AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero = AV10TFLb_numero ;
      AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod = AV12TFCliCod ;
      AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to = AV13TFCliCod_To ;
      AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = AV14TFLb_ArtCod ;
      AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = AV15TFLb_ArtCod_Sel ;
      AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = AV16TFLb_ColNomC ;
      AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = AV17TFLb_ColNomC_Sel ;
      AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum = AV18TFLb_ColNum ;
      AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to = AV19TFLb_ColNum_To ;
      AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod = AV58TFTipColCod ;
      AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to = AV59TFTipColCod_To ;
      AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = AV20TFLb_Rb ;
      AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = AV21TFLb_Rb_To ;
      AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = AV22TFLb_opcion ;
      AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = AV23TFLb_opcion_Sel ;
      AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop = AV24TFLb_numop ;
      AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to = AV25TFLb_numop_To ;
      AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = AV26TFLb_Cartaz ;
      AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = AV27TFLb_Cartaz_Sel ;
      AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = AV28TFLb_FechaE ;
      AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = AV30TFLb_FechaEn ;
      AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = AV32TFLb_FechaR ;
      AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = AV35TFLb_Estado_Sels ;
      AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb = AV60TFLb_RGB ;
      AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to = AV61TFLb_RGB_To ;
      AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = AV62TFLb_CosteE ;
      AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = AV63TFLb_CosteE_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ,
                                           AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to) ,
                                           AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ,
                                           AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ,
                                           AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ,
                                           AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to) ,
                                           Byte.valueOf(AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod) ,
                                           Byte.valueOf(AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to) ,
                                           AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ,
                                           AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ,
                                           AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ,
                                           AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ,
                                           Byte.valueOf(AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop) ,
                                           Byte.valueOf(AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to) ,
                                           AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ,
                                           AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ,
                                           AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ,
                                           AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ,
                                           AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ,
                                           Integer.valueOf(AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels.size()) ,
                                           Long.valueOf(AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb) ,
                                           Long.valueOf(AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to) ,
                                           AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ,
                                           AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ,
                                           Integer.valueOf(AV56Clicod) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           Long.valueOf(A5599Lb_RGB) ,
                                           A5565Lb_CosteE ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           Byte.valueOf(A5569Lb_EstEns) ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV57Lb_Numero) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING
                                           }
      });
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod), 16, "%") ;
      lV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc), 13, "%") ;
      lV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = GXutil.padr( GXutil.rtrim( AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion), 1, "%") ;
      lV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz), 20, "%") ;
      /* Using cursor P09NV4 */
      pr_default.execute(2, new Object[] {AV55Emprcod, Integer.valueOf(AV57Lb_Numero), lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, Integer.valueOf(AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero), Integer.valueOf(AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to), Integer.valueOf(AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod), Integer.valueOf(AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to), lV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod, AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel, lV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc, AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum), Integer.valueOf(AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to), Byte.valueOf(AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod), Byte.valueOf(AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to), AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb, AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to, lV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion, AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel, Byte.valueOf(AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop), Byte.valueOf(AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to), lV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz, AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel, AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae, AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen, AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar, Long.valueOf(AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb), Long.valueOf(AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to), AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee, AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to, Integer.valueOf(AV56Clicod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9NV6 = false ;
         A5532Lb_numero = P09NV4_A5532Lb_numero[0] ;
         A396EmprCod = P09NV4_A396EmprCod[0] ;
         A5555Lb_opcion = P09NV4_A5555Lb_opcion[0] ;
         A5569Lb_EstEns = P09NV4_A5569Lb_EstEns[0] ;
         A5565Lb_CosteE = P09NV4_A5565Lb_CosteE[0] ;
         A5599Lb_RGB = P09NV4_A5599Lb_RGB[0] ;
         A5566Lb_Estado = P09NV4_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09NV4_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09NV4_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09NV4_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NV4_A5540Lb_Cartaz[0] ;
         A5718Lb_numop = P09NV4_A5718Lb_numop[0] ;
         A5547Lb_Rb = P09NV4_A5547Lb_Rb[0] ;
         A831TipColCod = P09NV4_A831TipColCod[0] ;
         n831TipColCod = P09NV4_n831TipColCod[0] ;
         A5537Lb_ColNum = P09NV4_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NV4_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NV4_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NV4_A252CliCod[0] ;
         A5569Lb_EstEns = P09NV4_A5569Lb_EstEns[0] ;
         A5599Lb_RGB = P09NV4_A5599Lb_RGB[0] ;
         A5541Lb_FechaE = P09NV4_A5541Lb_FechaE[0] ;
         A5540Lb_Cartaz = P09NV4_A5540Lb_Cartaz[0] ;
         A5547Lb_Rb = P09NV4_A5547Lb_Rb[0] ;
         A831TipColCod = P09NV4_A831TipColCod[0] ;
         n831TipColCod = P09NV4_n831TipColCod[0] ;
         A5537Lb_ColNum = P09NV4_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NV4_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NV4_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NV4_A252CliCod[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09NV4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09NV4_A5532Lb_numero[0] == A5532Lb_numero ) && ( GXutil.strcmp(P09NV4_A5555Lb_opcion[0], A5555Lb_opcion) == 0 ) )
         {
            brk9NV6 = false ;
            AV48count = (long)(AV48count+1) ;
            brk9NV6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5555Lb_opcion)==0) )
         {
            AV40Option = A5555Lb_opcion ;
            AV43OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A5555Lb_opcion, "@!"))) ;
            AV41Options.add(AV40Option, 0);
            AV44OptionsDesc.add(AV43OptionDesc, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9NV6 )
         {
            brk9NV6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADLB_CARTAZOPTIONS' Routine */
      returnInSub = false ;
      AV26TFLb_Cartaz = AV36SearchTxt ;
      AV27TFLb_Cartaz_Sel = "" ;
      AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = AV54FilterFullText ;
      AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero = AV10TFLb_numero ;
      AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to = AV11TFLb_numero_To ;
      AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod = AV12TFCliCod ;
      AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to = AV13TFCliCod_To ;
      AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = AV14TFLb_ArtCod ;
      AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = AV15TFLb_ArtCod_Sel ;
      AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = AV16TFLb_ColNomC ;
      AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = AV17TFLb_ColNomC_Sel ;
      AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum = AV18TFLb_ColNum ;
      AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to = AV19TFLb_ColNum_To ;
      AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod = AV58TFTipColCod ;
      AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to = AV59TFTipColCod_To ;
      AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = AV20TFLb_Rb ;
      AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = AV21TFLb_Rb_To ;
      AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = AV22TFLb_opcion ;
      AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = AV23TFLb_opcion_Sel ;
      AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop = AV24TFLb_numop ;
      AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to = AV25TFLb_numop_To ;
      AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = AV26TFLb_Cartaz ;
      AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = AV27TFLb_Cartaz_Sel ;
      AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = AV28TFLb_FechaE ;
      AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = AV30TFLb_FechaEn ;
      AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = AV32TFLb_FechaR ;
      AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = AV35TFLb_Estado_Sels ;
      AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb = AV60TFLb_RGB ;
      AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to = AV61TFLb_RGB_To ;
      AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = AV62TFLb_CosteE ;
      AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = AV63TFLb_CosteE_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Byte.valueOf(A5566Lb_Estado) ,
                                           AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ,
                                           AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ,
                                           Integer.valueOf(AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero) ,
                                           Integer.valueOf(AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to) ,
                                           Integer.valueOf(AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod) ,
                                           Integer.valueOf(AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to) ,
                                           AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ,
                                           AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ,
                                           AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ,
                                           AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ,
                                           Integer.valueOf(AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum) ,
                                           Integer.valueOf(AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to) ,
                                           Byte.valueOf(AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod) ,
                                           Byte.valueOf(AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to) ,
                                           AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ,
                                           AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ,
                                           AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ,
                                           AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ,
                                           Byte.valueOf(AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop) ,
                                           Byte.valueOf(AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to) ,
                                           AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ,
                                           AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ,
                                           AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ,
                                           AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ,
                                           AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ,
                                           Integer.valueOf(AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels.size()) ,
                                           Long.valueOf(AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb) ,
                                           Long.valueOf(AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to) ,
                                           AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ,
                                           AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ,
                                           Integer.valueOf(AV56Clicod) ,
                                           Integer.valueOf(A5532Lb_numero) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A5533Lb_ArtCod ,
                                           A5538Lb_ColNomC ,
                                           Integer.valueOf(A5537Lb_ColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A5547Lb_Rb ,
                                           A5555Lb_opcion ,
                                           Byte.valueOf(A5718Lb_numop) ,
                                           A5540Lb_Cartaz ,
                                           Long.valueOf(A5599Lb_RGB) ,
                                           A5565Lb_CosteE ,
                                           A5541Lb_FechaE ,
                                           A5567Lb_FechaEn ,
                                           A5563Lb_FechaR ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV57Lb_Numero) ,
                                           Byte.valueOf(A5569Lb_EstEns) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE
                                           }
      });
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext), "%", "") ;
      lV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = GXutil.padr( GXutil.rtrim( AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod), 16, "%") ;
      lV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = GXutil.padr( GXutil.rtrim( AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc), 13, "%") ;
      lV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = GXutil.padr( GXutil.rtrim( AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion), 1, "%") ;
      lV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = GXutil.padr( GXutil.rtrim( AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz), 20, "%") ;
      /* Using cursor P09NV5 */
      pr_default.execute(3, new Object[] {AV55Emprcod, Integer.valueOf(AV57Lb_Numero), lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext, Integer.valueOf(AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero), Integer.valueOf(AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to), Integer.valueOf(AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod), Integer.valueOf(AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to), lV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod, AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel, lV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc, AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel, Integer.valueOf(AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum), Integer.valueOf(AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to), Byte.valueOf(AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod), Byte.valueOf(AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to), AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb, AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to, lV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion, AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel, Byte.valueOf(AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop), Byte.valueOf(AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to), lV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz, AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel, AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae, AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen, AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar, Long.valueOf(AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb), Long.valueOf(AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to), AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee, AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to, Integer.valueOf(AV56Clicod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9NV8 = false ;
         A396EmprCod = P09NV5_A396EmprCod[0] ;
         A5532Lb_numero = P09NV5_A5532Lb_numero[0] ;
         A5569Lb_EstEns = P09NV5_A5569Lb_EstEns[0] ;
         A5540Lb_Cartaz = P09NV5_A5540Lb_Cartaz[0] ;
         A5565Lb_CosteE = P09NV5_A5565Lb_CosteE[0] ;
         A5599Lb_RGB = P09NV5_A5599Lb_RGB[0] ;
         A5566Lb_Estado = P09NV5_A5566Lb_Estado[0] ;
         A5563Lb_FechaR = P09NV5_A5563Lb_FechaR[0] ;
         A5567Lb_FechaEn = P09NV5_A5567Lb_FechaEn[0] ;
         A5541Lb_FechaE = P09NV5_A5541Lb_FechaE[0] ;
         A5718Lb_numop = P09NV5_A5718Lb_numop[0] ;
         A5555Lb_opcion = P09NV5_A5555Lb_opcion[0] ;
         A5547Lb_Rb = P09NV5_A5547Lb_Rb[0] ;
         A831TipColCod = P09NV5_A831TipColCod[0] ;
         n831TipColCod = P09NV5_n831TipColCod[0] ;
         A5537Lb_ColNum = P09NV5_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NV5_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NV5_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NV5_A252CliCod[0] ;
         A5569Lb_EstEns = P09NV5_A5569Lb_EstEns[0] ;
         A5540Lb_Cartaz = P09NV5_A5540Lb_Cartaz[0] ;
         A5599Lb_RGB = P09NV5_A5599Lb_RGB[0] ;
         A5541Lb_FechaE = P09NV5_A5541Lb_FechaE[0] ;
         A5547Lb_Rb = P09NV5_A5547Lb_Rb[0] ;
         A831TipColCod = P09NV5_A831TipColCod[0] ;
         n831TipColCod = P09NV5_n831TipColCod[0] ;
         A5537Lb_ColNum = P09NV5_A5537Lb_ColNum[0] ;
         A5538Lb_ColNomC = P09NV5_A5538Lb_ColNomC[0] ;
         A5533Lb_ArtCod = P09NV5_A5533Lb_ArtCod[0] ;
         A252CliCod = P09NV5_A252CliCod[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09NV5_A5540Lb_Cartaz[0], A5540Lb_Cartaz) == 0 ) )
         {
            brk9NV8 = false ;
            A396EmprCod = P09NV5_A396EmprCod[0] ;
            A5532Lb_numero = P09NV5_A5532Lb_numero[0] ;
            A5555Lb_opcion = P09NV5_A5555Lb_opcion[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9NV8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A5540Lb_Cartaz)==0) )
         {
            AV40Option = A5540Lb_Cartaz ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9NV8 )
         {
            brk9NV8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = actualizacionensayoencolorteca_wcgetfilterdata.this.AV42OptionsJson;
      this.aP4[0] = actualizacionensayoencolorteca_wcgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = actualizacionensayoencolorteca_wcgetfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV42OptionsJson = "" ;
      AV45OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49Session = httpContext.getWebSession();
      AV51GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV52GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54FilterFullText = "" ;
      AV14TFLb_ArtCod = "" ;
      AV15TFLb_ArtCod_Sel = "" ;
      AV16TFLb_ColNomC = "" ;
      AV17TFLb_ColNomC_Sel = "" ;
      AV20TFLb_Rb = DecimalUtil.ZERO ;
      AV21TFLb_Rb_To = DecimalUtil.ZERO ;
      AV22TFLb_opcion = "" ;
      AV23TFLb_opcion_Sel = "" ;
      AV26TFLb_Cartaz = "" ;
      AV27TFLb_Cartaz_Sel = "" ;
      AV28TFLb_FechaE = GXutil.nullDate() ;
      AV30TFLb_FechaEn = GXutil.nullDate() ;
      AV32TFLb_FechaR = GXutil.nullDate() ;
      AV34TFLb_Estado_SelsJson = "" ;
      AV35TFLb_Estado_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV62TFLb_CosteE = DecimalUtil.ZERO ;
      AV63TFLb_CosteE_To = DecimalUtil.ZERO ;
      AV55Emprcod = "" ;
      A5533Lb_ArtCod = "" ;
      AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = "" ;
      AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = "" ;
      AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel = "" ;
      AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = "" ;
      AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel = "" ;
      AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb = DecimalUtil.ZERO ;
      AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to = DecimalUtil.ZERO ;
      AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = "" ;
      AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel = "" ;
      AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = "" ;
      AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel = "" ;
      AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae = GXutil.nullDate() ;
      AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen = GXutil.nullDate() ;
      AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar = GXutil.nullDate() ;
      AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee = DecimalUtil.ZERO ;
      AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext = "" ;
      lV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod = "" ;
      lV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc = "" ;
      lV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion = "" ;
      lV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz = "" ;
      A5538Lb_ColNomC = "" ;
      A5547Lb_Rb = DecimalUtil.ZERO ;
      A5555Lb_opcion = "" ;
      A5540Lb_Cartaz = "" ;
      A5565Lb_CosteE = DecimalUtil.ZERO ;
      A5541Lb_FechaE = GXutil.nullDate() ;
      A5567Lb_FechaEn = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P09NV2_A396EmprCod = new String[] {""} ;
      P09NV2_A5532Lb_numero = new int[1] ;
      P09NV2_A5569Lb_EstEns = new byte[1] ;
      P09NV2_A5533Lb_ArtCod = new String[] {""} ;
      P09NV2_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NV2_A5599Lb_RGB = new long[1] ;
      P09NV2_A5566Lb_Estado = new byte[1] ;
      P09NV2_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09NV2_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09NV2_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09NV2_A5540Lb_Cartaz = new String[] {""} ;
      P09NV2_A5718Lb_numop = new byte[1] ;
      P09NV2_A5555Lb_opcion = new String[] {""} ;
      P09NV2_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NV2_A831TipColCod = new byte[1] ;
      P09NV2_n831TipColCod = new boolean[] {false} ;
      P09NV2_A5537Lb_ColNum = new int[1] ;
      P09NV2_A5538Lb_ColNomC = new String[] {""} ;
      P09NV2_A252CliCod = new int[1] ;
      AV40Option = "" ;
      P09NV3_A396EmprCod = new String[] {""} ;
      P09NV3_A5532Lb_numero = new int[1] ;
      P09NV3_A5569Lb_EstEns = new byte[1] ;
      P09NV3_A5538Lb_ColNomC = new String[] {""} ;
      P09NV3_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NV3_A5599Lb_RGB = new long[1] ;
      P09NV3_A5566Lb_Estado = new byte[1] ;
      P09NV3_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09NV3_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09NV3_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09NV3_A5540Lb_Cartaz = new String[] {""} ;
      P09NV3_A5718Lb_numop = new byte[1] ;
      P09NV3_A5555Lb_opcion = new String[] {""} ;
      P09NV3_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NV3_A831TipColCod = new byte[1] ;
      P09NV3_n831TipColCod = new boolean[] {false} ;
      P09NV3_A5537Lb_ColNum = new int[1] ;
      P09NV3_A5533Lb_ArtCod = new String[] {""} ;
      P09NV3_A252CliCod = new int[1] ;
      P09NV4_A5532Lb_numero = new int[1] ;
      P09NV4_A396EmprCod = new String[] {""} ;
      P09NV4_A5555Lb_opcion = new String[] {""} ;
      P09NV4_A5569Lb_EstEns = new byte[1] ;
      P09NV4_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NV4_A5599Lb_RGB = new long[1] ;
      P09NV4_A5566Lb_Estado = new byte[1] ;
      P09NV4_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09NV4_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09NV4_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09NV4_A5540Lb_Cartaz = new String[] {""} ;
      P09NV4_A5718Lb_numop = new byte[1] ;
      P09NV4_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NV4_A831TipColCod = new byte[1] ;
      P09NV4_n831TipColCod = new boolean[] {false} ;
      P09NV4_A5537Lb_ColNum = new int[1] ;
      P09NV4_A5538Lb_ColNomC = new String[] {""} ;
      P09NV4_A5533Lb_ArtCod = new String[] {""} ;
      P09NV4_A252CliCod = new int[1] ;
      AV43OptionDesc = "" ;
      P09NV5_A396EmprCod = new String[] {""} ;
      P09NV5_A5532Lb_numero = new int[1] ;
      P09NV5_A5569Lb_EstEns = new byte[1] ;
      P09NV5_A5540Lb_Cartaz = new String[] {""} ;
      P09NV5_A5565Lb_CosteE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NV5_A5599Lb_RGB = new long[1] ;
      P09NV5_A5566Lb_Estado = new byte[1] ;
      P09NV5_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P09NV5_A5567Lb_FechaEn = new java.util.Date[] {GXutil.nullDate()} ;
      P09NV5_A5541Lb_FechaE = new java.util.Date[] {GXutil.nullDate()} ;
      P09NV5_A5718Lb_numop = new byte[1] ;
      P09NV5_A5555Lb_opcion = new String[] {""} ;
      P09NV5_A5547Lb_Rb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09NV5_A831TipColCod = new byte[1] ;
      P09NV5_n831TipColCod = new boolean[] {false} ;
      P09NV5_A5537Lb_ColNum = new int[1] ;
      P09NV5_A5538Lb_ColNomC = new String[] {""} ;
      P09NV5_A5533Lb_ArtCod = new String[] {""} ;
      P09NV5_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.actualizacionensayoencolorteca_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09NV2_A396EmprCod, P09NV2_A5532Lb_numero, P09NV2_A5569Lb_EstEns, P09NV2_A5533Lb_ArtCod, P09NV2_A5565Lb_CosteE, P09NV2_A5599Lb_RGB, P09NV2_A5566Lb_Estado, P09NV2_A5563Lb_FechaR, P09NV2_A5567Lb_FechaEn, P09NV2_A5541Lb_FechaE,
            P09NV2_A5540Lb_Cartaz, P09NV2_A5718Lb_numop, P09NV2_A5555Lb_opcion, P09NV2_A5547Lb_Rb, P09NV2_A831TipColCod, P09NV2_n831TipColCod, P09NV2_A5537Lb_ColNum, P09NV2_A5538Lb_ColNomC, P09NV2_A252CliCod
            }
            , new Object[] {
            P09NV3_A396EmprCod, P09NV3_A5532Lb_numero, P09NV3_A5569Lb_EstEns, P09NV3_A5538Lb_ColNomC, P09NV3_A5565Lb_CosteE, P09NV3_A5599Lb_RGB, P09NV3_A5566Lb_Estado, P09NV3_A5563Lb_FechaR, P09NV3_A5567Lb_FechaEn, P09NV3_A5541Lb_FechaE,
            P09NV3_A5540Lb_Cartaz, P09NV3_A5718Lb_numop, P09NV3_A5555Lb_opcion, P09NV3_A5547Lb_Rb, P09NV3_A831TipColCod, P09NV3_n831TipColCod, P09NV3_A5537Lb_ColNum, P09NV3_A5533Lb_ArtCod, P09NV3_A252CliCod
            }
            , new Object[] {
            P09NV4_A5532Lb_numero, P09NV4_A396EmprCod, P09NV4_A5555Lb_opcion, P09NV4_A5569Lb_EstEns, P09NV4_A5565Lb_CosteE, P09NV4_A5599Lb_RGB, P09NV4_A5566Lb_Estado, P09NV4_A5563Lb_FechaR, P09NV4_A5567Lb_FechaEn, P09NV4_A5541Lb_FechaE,
            P09NV4_A5540Lb_Cartaz, P09NV4_A5718Lb_numop, P09NV4_A5547Lb_Rb, P09NV4_A831TipColCod, P09NV4_n831TipColCod, P09NV4_A5537Lb_ColNum, P09NV4_A5538Lb_ColNomC, P09NV4_A5533Lb_ArtCod, P09NV4_A252CliCod
            }
            , new Object[] {
            P09NV5_A396EmprCod, P09NV5_A5532Lb_numero, P09NV5_A5569Lb_EstEns, P09NV5_A5540Lb_Cartaz, P09NV5_A5565Lb_CosteE, P09NV5_A5599Lb_RGB, P09NV5_A5566Lb_Estado, P09NV5_A5563Lb_FechaR, P09NV5_A5567Lb_FechaEn, P09NV5_A5541Lb_FechaE,
            P09NV5_A5718Lb_numop, P09NV5_A5555Lb_opcion, P09NV5_A5547Lb_Rb, P09NV5_A831TipColCod, P09NV5_n831TipColCod, P09NV5_A5537Lb_ColNum, P09NV5_A5538Lb_ColNomC, P09NV5_A5533Lb_ArtCod, P09NV5_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV58TFTipColCod ;
   private byte AV59TFTipColCod_To ;
   private byte AV24TFLb_numop ;
   private byte AV25TFLb_numop_To ;
   private byte AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod ;
   private byte AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to ;
   private byte AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop ;
   private byte AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to ;
   private byte A5566Lb_Estado ;
   private byte A831TipColCod ;
   private byte A5718Lb_numop ;
   private byte A5569Lb_EstEns ;
   private short Gx_err ;
   private int AV66GXV1 ;
   private int AV10TFLb_numero ;
   private int AV11TFLb_numero_To ;
   private int AV12TFCliCod ;
   private int AV13TFCliCod_To ;
   private int AV18TFLb_ColNum ;
   private int AV19TFLb_ColNum_To ;
   private int AV56Clicod ;
   private int AV57Lb_Numero ;
   private int AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero ;
   private int AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to ;
   private int AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod ;
   private int AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to ;
   private int AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum ;
   private int AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to ;
   private int AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size ;
   private int A5532Lb_numero ;
   private int A252CliCod ;
   private int A5537Lb_ColNum ;
   private long AV60TFLb_RGB ;
   private long AV61TFLb_RGB_To ;
   private long AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb ;
   private long AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to ;
   private long A5599Lb_RGB ;
   private long AV48count ;
   private java.math.BigDecimal AV20TFLb_Rb ;
   private java.math.BigDecimal AV21TFLb_Rb_To ;
   private java.math.BigDecimal AV62TFLb_CosteE ;
   private java.math.BigDecimal AV63TFLb_CosteE_To ;
   private java.math.BigDecimal AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ;
   private java.math.BigDecimal AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ;
   private java.math.BigDecimal AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ;
   private java.math.BigDecimal AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ;
   private java.math.BigDecimal A5547Lb_Rb ;
   private java.math.BigDecimal A5565Lb_CosteE ;
   private String AV14TFLb_ArtCod ;
   private String AV15TFLb_ArtCod_Sel ;
   private String AV16TFLb_ColNomC ;
   private String AV17TFLb_ColNomC_Sel ;
   private String AV22TFLb_opcion ;
   private String AV23TFLb_opcion_Sel ;
   private String AV26TFLb_Cartaz ;
   private String AV27TFLb_Cartaz_Sel ;
   private String AV55Emprcod ;
   private String A5533Lb_ArtCod ;
   private String AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ;
   private String AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ;
   private String AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ;
   private String AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ;
   private String AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ;
   private String AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ;
   private String AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ;
   private String AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ;
   private String scmdbuf ;
   private String lV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ;
   private String lV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ;
   private String lV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ;
   private String lV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ;
   private String A5538Lb_ColNomC ;
   private String A5555Lb_opcion ;
   private String A5540Lb_Cartaz ;
   private String A396EmprCod ;
   private java.util.Date AV28TFLb_FechaE ;
   private java.util.Date AV30TFLb_FechaEn ;
   private java.util.Date AV32TFLb_FechaR ;
   private java.util.Date AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ;
   private java.util.Date AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ;
   private java.util.Date AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ;
   private java.util.Date A5541Lb_FechaE ;
   private java.util.Date A5567Lb_FechaEn ;
   private java.util.Date A5563Lb_FechaR ;
   private boolean returnInSub ;
   private boolean brk9NV2 ;
   private boolean n831TipColCod ;
   private boolean brk9NV4 ;
   private boolean brk9NV6 ;
   private boolean brk9NV8 ;
   private String AV42OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV34TFLb_Estado_SelsJson ;
   private String AV38DDOName ;
   private String AV36SearchTxt ;
   private String AV37SearchTxtTo ;
   private String AV54FilterFullText ;
   private String AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ;
   private String lV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ;
   private String AV40Option ;
   private String AV43OptionDesc ;
   private GXSimpleCollection<Byte> AV35TFLb_Estado_Sels ;
   private GXSimpleCollection<Byte> AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09NV2_A396EmprCod ;
   private int[] P09NV2_A5532Lb_numero ;
   private byte[] P09NV2_A5569Lb_EstEns ;
   private String[] P09NV2_A5533Lb_ArtCod ;
   private java.math.BigDecimal[] P09NV2_A5565Lb_CosteE ;
   private long[] P09NV2_A5599Lb_RGB ;
   private byte[] P09NV2_A5566Lb_Estado ;
   private java.util.Date[] P09NV2_A5563Lb_FechaR ;
   private java.util.Date[] P09NV2_A5567Lb_FechaEn ;
   private java.util.Date[] P09NV2_A5541Lb_FechaE ;
   private String[] P09NV2_A5540Lb_Cartaz ;
   private byte[] P09NV2_A5718Lb_numop ;
   private String[] P09NV2_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09NV2_A5547Lb_Rb ;
   private byte[] P09NV2_A831TipColCod ;
   private boolean[] P09NV2_n831TipColCod ;
   private int[] P09NV2_A5537Lb_ColNum ;
   private String[] P09NV2_A5538Lb_ColNomC ;
   private int[] P09NV2_A252CliCod ;
   private String[] P09NV3_A396EmprCod ;
   private int[] P09NV3_A5532Lb_numero ;
   private byte[] P09NV3_A5569Lb_EstEns ;
   private String[] P09NV3_A5538Lb_ColNomC ;
   private java.math.BigDecimal[] P09NV3_A5565Lb_CosteE ;
   private long[] P09NV3_A5599Lb_RGB ;
   private byte[] P09NV3_A5566Lb_Estado ;
   private java.util.Date[] P09NV3_A5563Lb_FechaR ;
   private java.util.Date[] P09NV3_A5567Lb_FechaEn ;
   private java.util.Date[] P09NV3_A5541Lb_FechaE ;
   private String[] P09NV3_A5540Lb_Cartaz ;
   private byte[] P09NV3_A5718Lb_numop ;
   private String[] P09NV3_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09NV3_A5547Lb_Rb ;
   private byte[] P09NV3_A831TipColCod ;
   private boolean[] P09NV3_n831TipColCod ;
   private int[] P09NV3_A5537Lb_ColNum ;
   private String[] P09NV3_A5533Lb_ArtCod ;
   private int[] P09NV3_A252CliCod ;
   private int[] P09NV4_A5532Lb_numero ;
   private String[] P09NV4_A396EmprCod ;
   private String[] P09NV4_A5555Lb_opcion ;
   private byte[] P09NV4_A5569Lb_EstEns ;
   private java.math.BigDecimal[] P09NV4_A5565Lb_CosteE ;
   private long[] P09NV4_A5599Lb_RGB ;
   private byte[] P09NV4_A5566Lb_Estado ;
   private java.util.Date[] P09NV4_A5563Lb_FechaR ;
   private java.util.Date[] P09NV4_A5567Lb_FechaEn ;
   private java.util.Date[] P09NV4_A5541Lb_FechaE ;
   private String[] P09NV4_A5540Lb_Cartaz ;
   private byte[] P09NV4_A5718Lb_numop ;
   private java.math.BigDecimal[] P09NV4_A5547Lb_Rb ;
   private byte[] P09NV4_A831TipColCod ;
   private boolean[] P09NV4_n831TipColCod ;
   private int[] P09NV4_A5537Lb_ColNum ;
   private String[] P09NV4_A5538Lb_ColNomC ;
   private String[] P09NV4_A5533Lb_ArtCod ;
   private int[] P09NV4_A252CliCod ;
   private String[] P09NV5_A396EmprCod ;
   private int[] P09NV5_A5532Lb_numero ;
   private byte[] P09NV5_A5569Lb_EstEns ;
   private String[] P09NV5_A5540Lb_Cartaz ;
   private java.math.BigDecimal[] P09NV5_A5565Lb_CosteE ;
   private long[] P09NV5_A5599Lb_RGB ;
   private byte[] P09NV5_A5566Lb_Estado ;
   private java.util.Date[] P09NV5_A5563Lb_FechaR ;
   private java.util.Date[] P09NV5_A5567Lb_FechaEn ;
   private java.util.Date[] P09NV5_A5541Lb_FechaE ;
   private byte[] P09NV5_A5718Lb_numop ;
   private String[] P09NV5_A5555Lb_opcion ;
   private java.math.BigDecimal[] P09NV5_A5547Lb_Rb ;
   private byte[] P09NV5_A831TipColCod ;
   private boolean[] P09NV5_n831TipColCod ;
   private int[] P09NV5_A5537Lb_ColNum ;
   private String[] P09NV5_A5538Lb_ColNomC ;
   private String[] P09NV5_A5533Lb_ArtCod ;
   private int[] P09NV5_A252CliCod ;
   private GXSimpleCollection<String> AV41Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV46OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class actualizacionensayoencolorteca_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09NV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ,
                                          String AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ,
                                          int AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero ,
                                          int AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to ,
                                          int AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod ,
                                          int AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to ,
                                          String AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ,
                                          String AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ,
                                          String AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ,
                                          String AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ,
                                          int AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum ,
                                          int AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to ,
                                          byte AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod ,
                                          byte AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to ,
                                          java.math.BigDecimal AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ,
                                          java.math.BigDecimal AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ,
                                          String AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ,
                                          String AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ,
                                          byte AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop ,
                                          byte AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to ,
                                          String AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ,
                                          String AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ,
                                          java.util.Date AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ,
                                          java.util.Date AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ,
                                          java.util.Date AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ,
                                          int AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size ,
                                          long AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb ,
                                          long AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to ,
                                          java.math.BigDecimal AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ,
                                          java.math.BigDecimal AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ,
                                          int AV56Clicod ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          long A5599Lb_RGB ,
                                          java.math.BigDecimal A5565Lb_CosteE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int AV57Lb_Numero ,
                                          byte A5569Lb_EstEns )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[43];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_numero, T2.Lb_EstEns, T2.Lb_ArtCod, T1.Lb_CosteE, T2.Lb_RGB, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop," ;
      scmdbuf += " T1.Lb_opcion, T2.Lb_Rb, T2.TipColCod, T2.Lb_ColNum, T2.Lb_ColNomC, T2.CliCod FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero" ;
      scmdbuf += " = T1.Lb_numero)" ;
      addWhere(sWhereString, "(Not (T1.Lb_FechaR = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_RGB,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_CosteE,'99990.99999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
         GXv_int2[12] = (byte)(1) ;
         GXv_int2[13] = (byte)(1) ;
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod) )
      {
         addWhere(sWhereString, "(T2.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T2.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb) )
      {
         addWhere(sWhereString, "(T2.Lb_RGB >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to) )
      {
         addWhere(sWhereString, "(T2.Lb_RGB <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_CosteE >= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_CosteE <= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (0==AV56Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.Lb_ArtCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09NV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ,
                                          String AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ,
                                          int AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero ,
                                          int AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to ,
                                          int AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod ,
                                          int AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to ,
                                          String AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ,
                                          String AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ,
                                          String AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ,
                                          String AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ,
                                          int AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum ,
                                          int AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to ,
                                          byte AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod ,
                                          byte AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to ,
                                          java.math.BigDecimal AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ,
                                          java.math.BigDecimal AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ,
                                          String AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ,
                                          String AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ,
                                          byte AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop ,
                                          byte AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to ,
                                          String AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ,
                                          String AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ,
                                          java.util.Date AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ,
                                          java.util.Date AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ,
                                          java.util.Date AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ,
                                          int AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size ,
                                          long AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb ,
                                          long AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to ,
                                          java.math.BigDecimal AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ,
                                          java.math.BigDecimal AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ,
                                          int AV56Clicod ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          long A5599Lb_RGB ,
                                          java.math.BigDecimal A5565Lb_CosteE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int AV57Lb_Numero ,
                                          byte A5569Lb_EstEns )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[43];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_numero, T2.Lb_EstEns, T2.Lb_ColNomC, T1.Lb_CosteE, T2.Lb_RGB, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop," ;
      scmdbuf += " T1.Lb_opcion, T2.Lb_Rb, T2.TipColCod, T2.Lb_ColNum, T2.Lb_ArtCod, T2.CliCod FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero" ;
      scmdbuf += " = T1.Lb_numero)" ;
      addWhere(sWhereString, "(Not (T1.Lb_FechaR = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_RGB,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_CosteE,'99990.99999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
         GXv_int5[3] = (byte)(1) ;
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
         GXv_int5[8] = (byte)(1) ;
         GXv_int5[9] = (byte)(1) ;
         GXv_int5[10] = (byte)(1) ;
         GXv_int5[11] = (byte)(1) ;
         GXv_int5[12] = (byte)(1) ;
         GXv_int5[13] = (byte)(1) ;
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (0==AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod) )
      {
         addWhere(sWhereString, "(T2.TipColCod >= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T2.TipColCod <= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (0==AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (0==AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb) )
      {
         addWhere(sWhereString, "(T2.Lb_RGB >= ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( ! (0==AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to) )
      {
         addWhere(sWhereString, "(T2.Lb_RGB <= ?)");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_CosteE >= ?)");
      }
      else
      {
         GXv_int5[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_CosteE <= ?)");
      }
      else
      {
         GXv_int5[41] = (byte)(1) ;
      }
      if ( ! (0==AV56Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int5[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.Lb_ColNomC" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09NV4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ,
                                          String AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ,
                                          int AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero ,
                                          int AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to ,
                                          int AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod ,
                                          int AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to ,
                                          String AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ,
                                          String AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ,
                                          String AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ,
                                          String AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ,
                                          int AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum ,
                                          int AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to ,
                                          byte AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod ,
                                          byte AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to ,
                                          java.math.BigDecimal AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ,
                                          java.math.BigDecimal AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ,
                                          String AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ,
                                          String AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ,
                                          byte AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop ,
                                          byte AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to ,
                                          String AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ,
                                          String AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ,
                                          java.util.Date AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ,
                                          java.util.Date AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ,
                                          java.util.Date AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ,
                                          int AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size ,
                                          long AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb ,
                                          long AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to ,
                                          java.math.BigDecimal AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ,
                                          java.math.BigDecimal AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ,
                                          int AV56Clicod ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          long A5599Lb_RGB ,
                                          java.math.BigDecimal A5565Lb_CosteE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          byte A5569Lb_EstEns ,
                                          String AV55Emprcod ,
                                          int AV57Lb_Numero ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[43];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.Lb_numero, T1.EmprCod, T1.Lb_opcion, T2.Lb_EstEns, T1.Lb_CosteE, T2.Lb_RGB, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T2.Lb_Cartaz, T1.Lb_numop," ;
      scmdbuf += " T2.Lb_Rb, T2.TipColCod, T2.Lb_ColNum, T2.Lb_ColNomC, T2.Lb_ArtCod, T2.CliCod FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero" ;
      scmdbuf += " = T1.Lb_numero)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.Lb_numero = ?)");
      addWhere(sWhereString, "(Not (T1.Lb_FechaR = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T2.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_RGB,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_CosteE,'99990.99999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
         GXv_int8[10] = (byte)(1) ;
         GXv_int8[11] = (byte)(1) ;
         GXv_int8[12] = (byte)(1) ;
         GXv_int8[13] = (byte)(1) ;
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod) )
      {
         addWhere(sWhereString, "(T2.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T2.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb) )
      {
         addWhere(sWhereString, "(T2.Lb_RGB >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to) )
      {
         addWhere(sWhereString, "(T2.Lb_RGB <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_CosteE >= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_CosteE <= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (0==AV56Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.Lb_numero, T1.Lb_opcion" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09NV5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A5566Lb_Estado ,
                                          GXSimpleCollection<Byte> AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels ,
                                          String AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext ,
                                          int AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero ,
                                          int AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to ,
                                          int AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod ,
                                          int AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to ,
                                          String AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel ,
                                          String AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod ,
                                          String AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel ,
                                          String AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc ,
                                          int AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum ,
                                          int AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to ,
                                          byte AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod ,
                                          byte AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to ,
                                          java.math.BigDecimal AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb ,
                                          java.math.BigDecimal AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to ,
                                          String AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel ,
                                          String AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion ,
                                          byte AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop ,
                                          byte AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to ,
                                          String AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel ,
                                          String AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz ,
                                          java.util.Date AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae ,
                                          java.util.Date AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen ,
                                          java.util.Date AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar ,
                                          int AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size ,
                                          long AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb ,
                                          long AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to ,
                                          java.math.BigDecimal AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee ,
                                          java.math.BigDecimal AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to ,
                                          int AV56Clicod ,
                                          int A5532Lb_numero ,
                                          int A252CliCod ,
                                          String A5533Lb_ArtCod ,
                                          String A5538Lb_ColNomC ,
                                          int A5537Lb_ColNum ,
                                          byte A831TipColCod ,
                                          java.math.BigDecimal A5547Lb_Rb ,
                                          String A5555Lb_opcion ,
                                          byte A5718Lb_numop ,
                                          String A5540Lb_Cartaz ,
                                          long A5599Lb_RGB ,
                                          java.math.BigDecimal A5565Lb_CosteE ,
                                          java.util.Date A5541Lb_FechaE ,
                                          java.util.Date A5567Lb_FechaEn ,
                                          java.util.Date A5563Lb_FechaR ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          int AV57Lb_Numero ,
                                          byte A5569Lb_EstEns )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[43];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Lb_numero, T2.Lb_EstEns, T2.Lb_Cartaz, T1.Lb_CosteE, T2.Lb_RGB, T1.Lb_Estado, T1.Lb_FechaR, T1.Lb_FechaEn, T2.Lb_FechaE, T1.Lb_numop, T1.Lb_opcion," ;
      scmdbuf += " T2.Lb_Rb, T2.TipColCod, T2.Lb_ColNum, T2.Lb_ColNomC, T2.Lb_ArtCod, T2.CliCod FROM (TXPENS002 T1 INNER JOIN TXPENS001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Lb_numero" ;
      scmdbuf += " = T1.Lb_numero)" ;
      addWhere(sWhereString, "(Not (T1.Lb_FechaR = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Lb_numero = ?)");
      addWhere(sWhereString, "(T2.Lb_EstEns = 0)");
      if ( ! (GXutil.strcmp("", AV68Gestionlaboratorio_actualizacionensayoencolorteca_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.Lb_numero,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.Lb_ArtCod) like '%' || UPPER(?)) or ( UPPER(T2.Lb_ColNomC) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.Lb_ColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.TipColCod,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_Rb,'9990.99'), 2) like '%' || ?) or ( UPPER(T1.Lb_opcion) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_numop,'90'), 2) like '%' || ?) or ( UPPER(T2.Lb_Cartaz) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.Lb_Estado,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.Lb_RGB,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.Lb_CosteE,'99990.99999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
         GXv_int11[3] = (byte)(1) ;
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
         GXv_int11[10] = (byte)(1) ;
         GXv_int11[11] = (byte)(1) ;
         GXv_int11[12] = (byte)(1) ;
         GXv_int11[13] = (byte)(1) ;
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV69Gestionlaboratorio_actualizacionensayoencolorteca_wcds_2_tflb_numero) )
      {
         addWhere(sWhereString, "(T1.Lb_numero >= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV70Gestionlaboratorio_actualizacionensayoencolorteca_wcds_3_tflb_numero_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numero <= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV71Gestionlaboratorio_actualizacionensayoencolorteca_wcds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV72Gestionlaboratorio_actualizacionensayoencolorteca_wcds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel)==0) && ( ! (GXutil.strcmp("", AV73Gestionlaboratorio_actualizacionensayoencolorteca_wcds_6_tflb_artcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Gestionlaboratorio_actualizacionensayoencolorteca_wcds_7_tflb_artcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ArtCod = ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel)==0) && ( ! (GXutil.strcmp("", AV75Gestionlaboratorio_actualizacionensayoencolorteca_wcds_8_tflb_colnomc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_ColNomC) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Gestionlaboratorio_actualizacionensayoencolorteca_wcds_9_tflb_colnomc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNomC = ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV77Gestionlaboratorio_actualizacionensayoencolorteca_wcds_10_tflb_colnum) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum >= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV78Gestionlaboratorio_actualizacionensayoencolorteca_wcds_11_tflb_colnum_to) )
      {
         addWhere(sWhereString, "(T2.Lb_ColNum <= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (0==AV79Gestionlaboratorio_actualizacionensayoencolorteca_wcds_12_tftipcolcod) )
      {
         addWhere(sWhereString, "(T2.TipColCod >= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (0==AV80Gestionlaboratorio_actualizacionensayoencolorteca_wcds_13_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T2.TipColCod <= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Gestionlaboratorio_actualizacionensayoencolorteca_wcds_14_tflb_rb)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb >= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Gestionlaboratorio_actualizacionensayoencolorteca_wcds_15_tflb_rb_to)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Rb <= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel)==0) && ( ! (GXutil.strcmp("", AV83Gestionlaboratorio_actualizacionensayoencolorteca_wcds_16_tflb_opcion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Lb_opcion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Gestionlaboratorio_actualizacionensayoencolorteca_wcds_17_tflb_opcion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_opcion = ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV85Gestionlaboratorio_actualizacionensayoencolorteca_wcds_18_tflb_numop) )
      {
         addWhere(sWhereString, "(T1.Lb_numop >= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV86Gestionlaboratorio_actualizacionensayoencolorteca_wcds_19_tflb_numop_to) )
      {
         addWhere(sWhereString, "(T1.Lb_numop <= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel)==0) && ( ! (GXutil.strcmp("", AV87Gestionlaboratorio_actualizacionensayoencolorteca_wcds_20_tflb_cartaz)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.Lb_Cartaz) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Gestionlaboratorio_actualizacionensayoencolorteca_wcds_21_tflb_cartaz_sel)==0) )
      {
         addWhere(sWhereString, "(T2.Lb_Cartaz = ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Gestionlaboratorio_actualizacionensayoencolorteca_wcds_22_tflb_fechae)) )
      {
         addWhere(sWhereString, "(T2.Lb_FechaE >= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90Gestionlaboratorio_actualizacionensayoencolorteca_wcds_23_tflb_fechaen)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaEn >= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Gestionlaboratorio_actualizacionensayoencolorteca_wcds_24_tflb_fechar)) )
      {
         addWhere(sWhereString, "(T1.Lb_FechaR >= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Gestionlaboratorio_actualizacionensayoencolorteca_wcds_25_tflb_estado_sels, "T1.Lb_Estado IN (", ")")+")");
      }
      if ( ! (0==AV93Gestionlaboratorio_actualizacionensayoencolorteca_wcds_26_tflb_rgb) )
      {
         addWhere(sWhereString, "(T2.Lb_RGB >= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (0==AV94Gestionlaboratorio_actualizacionensayoencolorteca_wcds_27_tflb_rgb_to) )
      {
         addWhere(sWhereString, "(T2.Lb_RGB <= ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Gestionlaboratorio_actualizacionensayoencolorteca_wcds_28_tflb_costee)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_CosteE >= ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Gestionlaboratorio_actualizacionensayoencolorteca_wcds_29_tflb_costee_to)==0) )
      {
         addWhere(sWhereString, "(T1.Lb_CosteE <= ?)");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( ! (0==AV56Clicod) )
      {
         addWhere(sWhereString, "(T2.CliCod = ?)");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.Lb_Cartaz" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P09NV2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , ((Number) dynConstraints[28]).longValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (java.math.BigDecimal)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).longValue() , (java.math.BigDecimal)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() );
            case 1 :
                  return conditional_P09NV3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , ((Number) dynConstraints[28]).longValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (java.math.BigDecimal)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).longValue() , (java.math.BigDecimal)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() );
            case 2 :
                  return conditional_P09NV4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , ((Number) dynConstraints[28]).longValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (java.math.BigDecimal)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).longValue() , (java.math.BigDecimal)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , (String)dynConstraints[50] );
            case 3 :
                  return conditional_P09NV5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).longValue() , ((Number) dynConstraints[28]).longValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (java.math.BigDecimal)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).longValue() , (java.math.BigDecimal)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09NV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09NV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09NV4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09NV5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 13);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 16);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((String[]) buf[17])[0] = rslt.getString(17, 16);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((String[]) buf[17])[0] = rslt.getString(17, 16);
               ((int[]) buf[18])[0] = rslt.getInt(18);
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
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[81]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[82]).longValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 5);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[81]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[82]).longValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 5);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[81]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[82]).longValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 5);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[80]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[81]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[82]).longValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 5);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               return;
      }
   }

}

