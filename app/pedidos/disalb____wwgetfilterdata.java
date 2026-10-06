package app.pedidos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class disalb____wwgetfilterdata extends GXProcedure
{
   public disalb____wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disalb____wwgetfilterdata.class ), "" );
   }

   public disalb____wwgetfilterdata( int remoteHandle ,
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
      disalb____wwgetfilterdata.this.aP5 = new String[] {""};
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
      disalb____wwgetfilterdata.this.AV56DDOName = aP0;
      disalb____wwgetfilterdata.this.AV57SearchTxt = aP1;
      disalb____wwgetfilterdata.this.AV58SearchTxtTo = aP2;
      disalb____wwgetfilterdata.this.aP3 = aP3;
      disalb____wwgetfilterdata.this.aP4 = aP4;
      disalb____wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV46Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV48OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV49OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_ALBREF") == 0 )
      {
         /* Execute user subroutine: 'LOADALBREFOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_ALBRLOTE") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRLOTEOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_ALBRTELAR") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRTELAROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_ALBRMDLCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBRMDLCODOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_ALBMAQTEJ") == 0 )
      {
         /* Execute user subroutine: 'LOADALBMAQTEJOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV59OptionsJson = AV46Options.toJSonString(false) ;
      AV60OptionsDescJson = AV48OptionsDesc.toJSonString(false) ;
      AV61OptionIndexesJson = AV49OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV51Session.getValue("Pedidos.DisAlb____WWGridState"), "") == 0 )
      {
         AV53GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.DisAlb____WWGridState"), null, null);
      }
      else
      {
         AV53GridState.fromxml(AV51Session.getValue("Pedidos.DisAlb____WWGridState"), null, null);
      }
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV54GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV65GXV1));
         if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV10TFAlbRecCod = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFAlbRecCod_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV12TFAlbRReo_SelsJson = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV13TFAlbRReo_Sels.fromJSonString(AV12TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV14TFAlbRUniEnt = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFAlbRUniEnt_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV16TFAlbRUniUti = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFAlbRUniUti_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV18TFAlbRUni_SelsJson = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV19TFAlbRUni_Sels.fromJSonString(AV18TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV20TFAlbRPieEnt = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFAlbRPieEnt_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV22TFAlbRPieUti = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFAlbRPieUti_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV24TFAlbRef = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV25TFAlbRef_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFKILOS") == 0 )
         {
            AV26TFKilos = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFKilos_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETROS") == 0 )
         {
            AV28TFMetros = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFMetros_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPIEZAS") == 0 )
         {
            AV30TFPiezas = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFPiezas_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE") == 0 )
         {
            AV32TFAlbRLote = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE_SEL") == 0 )
         {
            AV33TFAlbRLote_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTELAR") == 0 )
         {
            AV34TFAlbRTelar = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTELAR_SEL") == 0 )
         {
            AV35TFAlbRTelar_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLU") == 0 )
         {
            AV36TFAlbRLu = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFAlbRLu_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRMDLCOD") == 0 )
         {
            AV38TFAlbRMdlCod = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRMDLCOD_SEL") == 0 )
         {
            AV39TFAlbRMdlCod_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARA") == 0 )
         {
            AV40TFAlbRTara = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFAlbRTara_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMAQTEJ") == 0 )
         {
            AV42TFAlbMaqTej = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMAQTEJ_SEL") == 0 )
         {
            AV43TFAlbMaqTej_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBREFOPTIONS' Routine */
      returnInSub = false ;
      AV24TFAlbRef = AV57SearchTxt ;
      AV25TFAlbRef_Sel = "" ;
      AV67Pedidos_disalb____wwds_1_tfalbreccod = AV10TFAlbRecCod ;
      AV68Pedidos_disalb____wwds_2_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV69Pedidos_disalb____wwds_3_tfalbrreo_sels = AV13TFAlbRReo_Sels ;
      AV70Pedidos_disalb____wwds_4_tfalbrunient = AV14TFAlbRUniEnt ;
      AV71Pedidos_disalb____wwds_5_tfalbrunient_to = AV15TFAlbRUniEnt_To ;
      AV72Pedidos_disalb____wwds_6_tfalbruniuti = AV16TFAlbRUniUti ;
      AV73Pedidos_disalb____wwds_7_tfalbruniuti_to = AV17TFAlbRUniUti_To ;
      AV74Pedidos_disalb____wwds_8_tfalbruni_sels = AV19TFAlbRUni_Sels ;
      AV75Pedidos_disalb____wwds_9_tfalbrpieent = AV20TFAlbRPieEnt ;
      AV76Pedidos_disalb____wwds_10_tfalbrpieent_to = AV21TFAlbRPieEnt_To ;
      AV77Pedidos_disalb____wwds_11_tfalbrpieuti = AV22TFAlbRPieUti ;
      AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV23TFAlbRPieUti_To ;
      AV79Pedidos_disalb____wwds_13_tfalbref = AV24TFAlbRef ;
      AV80Pedidos_disalb____wwds_14_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV81Pedidos_disalb____wwds_15_tfkilos = AV26TFKilos ;
      AV82Pedidos_disalb____wwds_16_tfkilos_to = AV27TFKilos_To ;
      AV83Pedidos_disalb____wwds_17_tfmetros = AV28TFMetros ;
      AV84Pedidos_disalb____wwds_18_tfmetros_to = AV29TFMetros_To ;
      AV85Pedidos_disalb____wwds_19_tfpiezas = AV30TFPiezas ;
      AV86Pedidos_disalb____wwds_20_tfpiezas_to = AV31TFPiezas_To ;
      AV87Pedidos_disalb____wwds_21_tfalbrlote = AV32TFAlbRLote ;
      AV88Pedidos_disalb____wwds_22_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
      AV89Pedidos_disalb____wwds_23_tfalbrtelar = AV34TFAlbRTelar ;
      AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV35TFAlbRTelar_Sel ;
      AV91Pedidos_disalb____wwds_25_tfalbrlu = AV36TFAlbRLu ;
      AV92Pedidos_disalb____wwds_26_tfalbrlu_to = AV37TFAlbRLu_To ;
      AV93Pedidos_disalb____wwds_27_tfalbrmdlcod = AV38TFAlbRMdlCod ;
      AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV39TFAlbRMdlCod_Sel ;
      AV95Pedidos_disalb____wwds_29_tfalbrtara = AV40TFAlbRTara ;
      AV96Pedidos_disalb____wwds_30_tfalbrtara_to = AV41TFAlbRTara_To ;
      AV97Pedidos_disalb____wwds_31_tfalbmaqtej = AV42TFAlbMaqTej ;
      AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV43TFAlbMaqTej_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV69Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV74Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                           Integer.valueOf(AV67Pedidos_disalb____wwds_1_tfalbreccod) ,
                                           Integer.valueOf(AV68Pedidos_disalb____wwds_2_tfalbreccod_to) ,
                                           Integer.valueOf(AV69Pedidos_disalb____wwds_3_tfalbrreo_sels.size()) ,
                                           AV70Pedidos_disalb____wwds_4_tfalbrunient ,
                                           AV71Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                           AV72Pedidos_disalb____wwds_6_tfalbruniuti ,
                                           AV73Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                           Integer.valueOf(AV74Pedidos_disalb____wwds_8_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV75Pedidos_disalb____wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV76Pedidos_disalb____wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV77Pedidos_disalb____wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to) ,
                                           AV80Pedidos_disalb____wwds_14_tfalbref_sel ,
                                           AV79Pedidos_disalb____wwds_13_tfalbref ,
                                           AV81Pedidos_disalb____wwds_15_tfkilos ,
                                           AV82Pedidos_disalb____wwds_16_tfkilos_to ,
                                           AV83Pedidos_disalb____wwds_17_tfmetros ,
                                           AV84Pedidos_disalb____wwds_18_tfmetros_to ,
                                           Integer.valueOf(AV85Pedidos_disalb____wwds_19_tfpiezas) ,
                                           Integer.valueOf(AV86Pedidos_disalb____wwds_20_tfpiezas_to) ,
                                           AV88Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                           AV87Pedidos_disalb____wwds_21_tfalbrlote ,
                                           AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                           AV89Pedidos_disalb____wwds_23_tfalbrtelar ,
                                           AV91Pedidos_disalb____wwds_25_tfalbrlu ,
                                           AV92Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                           AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                           AV93Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                           AV95Pedidos_disalb____wwds_29_tfalbrtara ,
                                           AV96Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                           AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                           AV97Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A45AlbRef ,
                                           A595Kilos ,
                                           A631Metros ,
                                           Integer.valueOf(A673Piezas) ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A6465AlbRLu ,
                                           A4602AlbRMdlCod ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV79Pedidos_disalb____wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV79Pedidos_disalb____wwds_13_tfalbref), 16, "%") ;
      lV87Pedidos_disalb____wwds_21_tfalbrlote = GXutil.padr( GXutil.rtrim( AV87Pedidos_disalb____wwds_21_tfalbrlote), 20, "%") ;
      lV89Pedidos_disalb____wwds_23_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV89Pedidos_disalb____wwds_23_tfalbrtelar), 20, "%") ;
      lV93Pedidos_disalb____wwds_27_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV93Pedidos_disalb____wwds_27_tfalbrmdlcod), 13, "%") ;
      lV97Pedidos_disalb____wwds_31_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV97Pedidos_disalb____wwds_31_tfalbmaqtej), 12, "%") ;
      /* Using cursor P0AG42 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV67Pedidos_disalb____wwds_1_tfalbreccod), Integer.valueOf(AV68Pedidos_disalb____wwds_2_tfalbreccod_to), AV70Pedidos_disalb____wwds_4_tfalbrunient, AV71Pedidos_disalb____wwds_5_tfalbrunient_to, AV72Pedidos_disalb____wwds_6_tfalbruniuti, AV73Pedidos_disalb____wwds_7_tfalbruniuti_to, Integer.valueOf(AV75Pedidos_disalb____wwds_9_tfalbrpieent), Integer.valueOf(AV76Pedidos_disalb____wwds_10_tfalbrpieent_to), Integer.valueOf(AV77Pedidos_disalb____wwds_11_tfalbrpieuti), Integer.valueOf(AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to), lV79Pedidos_disalb____wwds_13_tfalbref, AV80Pedidos_disalb____wwds_14_tfalbref_sel, AV81Pedidos_disalb____wwds_15_tfkilos, AV82Pedidos_disalb____wwds_16_tfkilos_to, AV83Pedidos_disalb____wwds_17_tfmetros, AV84Pedidos_disalb____wwds_18_tfmetros_to, Integer.valueOf(AV85Pedidos_disalb____wwds_19_tfpiezas), Integer.valueOf(AV86Pedidos_disalb____wwds_20_tfpiezas_to), lV87Pedidos_disalb____wwds_21_tfalbrlote, AV88Pedidos_disalb____wwds_22_tfalbrlote_sel, lV89Pedidos_disalb____wwds_23_tfalbrtelar, AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel, AV91Pedidos_disalb____wwds_25_tfalbrlu, AV92Pedidos_disalb____wwds_26_tfalbrlu_to, lV93Pedidos_disalb____wwds_27_tfalbrmdlcod, AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel, AV95Pedidos_disalb____wwds_29_tfalbrtara, AV96Pedidos_disalb____wwds_30_tfalbrtara_to, lV97Pedidos_disalb____wwds_31_tfalbmaqtej, AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAG42 = false ;
         A44AlbRecCod = P0AG42_A44AlbRecCod[0] ;
         A396EmprCod = P0AG42_A396EmprCod[0] ;
         A8035AlbMaqTej = P0AG42_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AG42_A6470AlbRTara[0] ;
         A4602AlbRMdlCod = P0AG42_A4602AlbRMdlCod[0] ;
         A6465AlbRLu = P0AG42_A6465AlbRLu[0] ;
         A6464AlbRTelar = P0AG42_A6464AlbRTelar[0] ;
         A6463AlbRLote = P0AG42_A6463AlbRLote[0] ;
         A673Piezas = P0AG42_A673Piezas[0] ;
         A631Metros = P0AG42_A631Metros[0] ;
         A595Kilos = P0AG42_A595Kilos[0] ;
         A45AlbRef = P0AG42_A45AlbRef[0] ;
         A54AlbRPieUti = P0AG42_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AG42_A52AlbRPieEnt[0] ;
         A56AlbRUni = P0AG42_A56AlbRUni[0] ;
         A60AlbRUniUti = P0AG42_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AG42_A58AlbRUniEnt[0] ;
         A55AlbRReo = P0AG42_A55AlbRReo[0] ;
         A361DisCod = P0AG42_A361DisCod[0] ;
         A8035AlbMaqTej = P0AG42_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AG42_A6470AlbRTara[0] ;
         A4602AlbRMdlCod = P0AG42_A4602AlbRMdlCod[0] ;
         A6465AlbRLu = P0AG42_A6465AlbRLu[0] ;
         A6464AlbRTelar = P0AG42_A6464AlbRTelar[0] ;
         A6463AlbRLote = P0AG42_A6463AlbRLote[0] ;
         A45AlbRef = P0AG42_A45AlbRef[0] ;
         A54AlbRPieUti = P0AG42_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AG42_A52AlbRPieEnt[0] ;
         A56AlbRUni = P0AG42_A56AlbRUni[0] ;
         A60AlbRUniUti = P0AG42_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AG42_A58AlbRUniEnt[0] ;
         A55AlbRReo = P0AG42_A55AlbRReo[0] ;
         AV50count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AG42_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AG42_A44AlbRecCod[0] == A44AlbRecCod ) )
         {
            brkAG42 = false ;
            A361DisCod = P0AG42_A361DisCod[0] ;
            AV50count = (long)(AV50count+1) ;
            brkAG42 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A45AlbRef)==0) )
         {
            AV45Option = A45AlbRef ;
            AV44InsertIndex = 1 ;
            while ( ( AV44InsertIndex <= AV46Options.size() ) && ( GXutil.strcmp((String)AV46Options.elementAt(-1+AV44InsertIndex), AV45Option) < 0 ) )
            {
               AV44InsertIndex = (int)(AV44InsertIndex+1) ;
            }
            AV46Options.add(AV45Option, AV44InsertIndex);
            AV49OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), AV44InsertIndex);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAG42 )
         {
            brkAG42 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBRLOTEOPTIONS' Routine */
      returnInSub = false ;
      AV32TFAlbRLote = AV57SearchTxt ;
      AV33TFAlbRLote_Sel = "" ;
      AV67Pedidos_disalb____wwds_1_tfalbreccod = AV10TFAlbRecCod ;
      AV68Pedidos_disalb____wwds_2_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV69Pedidos_disalb____wwds_3_tfalbrreo_sels = AV13TFAlbRReo_Sels ;
      AV70Pedidos_disalb____wwds_4_tfalbrunient = AV14TFAlbRUniEnt ;
      AV71Pedidos_disalb____wwds_5_tfalbrunient_to = AV15TFAlbRUniEnt_To ;
      AV72Pedidos_disalb____wwds_6_tfalbruniuti = AV16TFAlbRUniUti ;
      AV73Pedidos_disalb____wwds_7_tfalbruniuti_to = AV17TFAlbRUniUti_To ;
      AV74Pedidos_disalb____wwds_8_tfalbruni_sels = AV19TFAlbRUni_Sels ;
      AV75Pedidos_disalb____wwds_9_tfalbrpieent = AV20TFAlbRPieEnt ;
      AV76Pedidos_disalb____wwds_10_tfalbrpieent_to = AV21TFAlbRPieEnt_To ;
      AV77Pedidos_disalb____wwds_11_tfalbrpieuti = AV22TFAlbRPieUti ;
      AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV23TFAlbRPieUti_To ;
      AV79Pedidos_disalb____wwds_13_tfalbref = AV24TFAlbRef ;
      AV80Pedidos_disalb____wwds_14_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV81Pedidos_disalb____wwds_15_tfkilos = AV26TFKilos ;
      AV82Pedidos_disalb____wwds_16_tfkilos_to = AV27TFKilos_To ;
      AV83Pedidos_disalb____wwds_17_tfmetros = AV28TFMetros ;
      AV84Pedidos_disalb____wwds_18_tfmetros_to = AV29TFMetros_To ;
      AV85Pedidos_disalb____wwds_19_tfpiezas = AV30TFPiezas ;
      AV86Pedidos_disalb____wwds_20_tfpiezas_to = AV31TFPiezas_To ;
      AV87Pedidos_disalb____wwds_21_tfalbrlote = AV32TFAlbRLote ;
      AV88Pedidos_disalb____wwds_22_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
      AV89Pedidos_disalb____wwds_23_tfalbrtelar = AV34TFAlbRTelar ;
      AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV35TFAlbRTelar_Sel ;
      AV91Pedidos_disalb____wwds_25_tfalbrlu = AV36TFAlbRLu ;
      AV92Pedidos_disalb____wwds_26_tfalbrlu_to = AV37TFAlbRLu_To ;
      AV93Pedidos_disalb____wwds_27_tfalbrmdlcod = AV38TFAlbRMdlCod ;
      AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV39TFAlbRMdlCod_Sel ;
      AV95Pedidos_disalb____wwds_29_tfalbrtara = AV40TFAlbRTara ;
      AV96Pedidos_disalb____wwds_30_tfalbrtara_to = AV41TFAlbRTara_To ;
      AV97Pedidos_disalb____wwds_31_tfalbmaqtej = AV42TFAlbMaqTej ;
      AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV43TFAlbMaqTej_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV69Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV74Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                           Integer.valueOf(AV67Pedidos_disalb____wwds_1_tfalbreccod) ,
                                           Integer.valueOf(AV68Pedidos_disalb____wwds_2_tfalbreccod_to) ,
                                           Integer.valueOf(AV69Pedidos_disalb____wwds_3_tfalbrreo_sels.size()) ,
                                           AV70Pedidos_disalb____wwds_4_tfalbrunient ,
                                           AV71Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                           AV72Pedidos_disalb____wwds_6_tfalbruniuti ,
                                           AV73Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                           Integer.valueOf(AV74Pedidos_disalb____wwds_8_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV75Pedidos_disalb____wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV76Pedidos_disalb____wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV77Pedidos_disalb____wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to) ,
                                           AV80Pedidos_disalb____wwds_14_tfalbref_sel ,
                                           AV79Pedidos_disalb____wwds_13_tfalbref ,
                                           AV81Pedidos_disalb____wwds_15_tfkilos ,
                                           AV82Pedidos_disalb____wwds_16_tfkilos_to ,
                                           AV83Pedidos_disalb____wwds_17_tfmetros ,
                                           AV84Pedidos_disalb____wwds_18_tfmetros_to ,
                                           Integer.valueOf(AV85Pedidos_disalb____wwds_19_tfpiezas) ,
                                           Integer.valueOf(AV86Pedidos_disalb____wwds_20_tfpiezas_to) ,
                                           AV88Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                           AV87Pedidos_disalb____wwds_21_tfalbrlote ,
                                           AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                           AV89Pedidos_disalb____wwds_23_tfalbrtelar ,
                                           AV91Pedidos_disalb____wwds_25_tfalbrlu ,
                                           AV92Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                           AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                           AV93Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                           AV95Pedidos_disalb____wwds_29_tfalbrtara ,
                                           AV96Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                           AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                           AV97Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A45AlbRef ,
                                           A595Kilos ,
                                           A631Metros ,
                                           Integer.valueOf(A673Piezas) ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A6465AlbRLu ,
                                           A4602AlbRMdlCod ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV79Pedidos_disalb____wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV79Pedidos_disalb____wwds_13_tfalbref), 16, "%") ;
      lV87Pedidos_disalb____wwds_21_tfalbrlote = GXutil.padr( GXutil.rtrim( AV87Pedidos_disalb____wwds_21_tfalbrlote), 20, "%") ;
      lV89Pedidos_disalb____wwds_23_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV89Pedidos_disalb____wwds_23_tfalbrtelar), 20, "%") ;
      lV93Pedidos_disalb____wwds_27_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV93Pedidos_disalb____wwds_27_tfalbrmdlcod), 13, "%") ;
      lV97Pedidos_disalb____wwds_31_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV97Pedidos_disalb____wwds_31_tfalbmaqtej), 12, "%") ;
      /* Using cursor P0AG43 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV67Pedidos_disalb____wwds_1_tfalbreccod), Integer.valueOf(AV68Pedidos_disalb____wwds_2_tfalbreccod_to), AV70Pedidos_disalb____wwds_4_tfalbrunient, AV71Pedidos_disalb____wwds_5_tfalbrunient_to, AV72Pedidos_disalb____wwds_6_tfalbruniuti, AV73Pedidos_disalb____wwds_7_tfalbruniuti_to, Integer.valueOf(AV75Pedidos_disalb____wwds_9_tfalbrpieent), Integer.valueOf(AV76Pedidos_disalb____wwds_10_tfalbrpieent_to), Integer.valueOf(AV77Pedidos_disalb____wwds_11_tfalbrpieuti), Integer.valueOf(AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to), lV79Pedidos_disalb____wwds_13_tfalbref, AV80Pedidos_disalb____wwds_14_tfalbref_sel, AV81Pedidos_disalb____wwds_15_tfkilos, AV82Pedidos_disalb____wwds_16_tfkilos_to, AV83Pedidos_disalb____wwds_17_tfmetros, AV84Pedidos_disalb____wwds_18_tfmetros_to, Integer.valueOf(AV85Pedidos_disalb____wwds_19_tfpiezas), Integer.valueOf(AV86Pedidos_disalb____wwds_20_tfpiezas_to), lV87Pedidos_disalb____wwds_21_tfalbrlote, AV88Pedidos_disalb____wwds_22_tfalbrlote_sel, lV89Pedidos_disalb____wwds_23_tfalbrtelar, AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel, AV91Pedidos_disalb____wwds_25_tfalbrlu, AV92Pedidos_disalb____wwds_26_tfalbrlu_to, lV93Pedidos_disalb____wwds_27_tfalbrmdlcod, AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel, AV95Pedidos_disalb____wwds_29_tfalbrtara, AV96Pedidos_disalb____wwds_30_tfalbrtara_to, lV97Pedidos_disalb____wwds_31_tfalbmaqtej, AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAG44 = false ;
         A396EmprCod = P0AG43_A396EmprCod[0] ;
         A6463AlbRLote = P0AG43_A6463AlbRLote[0] ;
         A8035AlbMaqTej = P0AG43_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AG43_A6470AlbRTara[0] ;
         A4602AlbRMdlCod = P0AG43_A4602AlbRMdlCod[0] ;
         A6465AlbRLu = P0AG43_A6465AlbRLu[0] ;
         A6464AlbRTelar = P0AG43_A6464AlbRTelar[0] ;
         A673Piezas = P0AG43_A673Piezas[0] ;
         A631Metros = P0AG43_A631Metros[0] ;
         A595Kilos = P0AG43_A595Kilos[0] ;
         A45AlbRef = P0AG43_A45AlbRef[0] ;
         A54AlbRPieUti = P0AG43_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AG43_A52AlbRPieEnt[0] ;
         A56AlbRUni = P0AG43_A56AlbRUni[0] ;
         A60AlbRUniUti = P0AG43_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AG43_A58AlbRUniEnt[0] ;
         A55AlbRReo = P0AG43_A55AlbRReo[0] ;
         A44AlbRecCod = P0AG43_A44AlbRecCod[0] ;
         A361DisCod = P0AG43_A361DisCod[0] ;
         A6463AlbRLote = P0AG43_A6463AlbRLote[0] ;
         A8035AlbMaqTej = P0AG43_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AG43_A6470AlbRTara[0] ;
         A4602AlbRMdlCod = P0AG43_A4602AlbRMdlCod[0] ;
         A6465AlbRLu = P0AG43_A6465AlbRLu[0] ;
         A6464AlbRTelar = P0AG43_A6464AlbRTelar[0] ;
         A45AlbRef = P0AG43_A45AlbRef[0] ;
         A54AlbRPieUti = P0AG43_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AG43_A52AlbRPieEnt[0] ;
         A56AlbRUni = P0AG43_A56AlbRUni[0] ;
         A60AlbRUniUti = P0AG43_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AG43_A58AlbRUniEnt[0] ;
         A55AlbRReo = P0AG43_A55AlbRReo[0] ;
         AV50count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AG43_A6463AlbRLote[0], A6463AlbRLote) == 0 ) )
         {
            brkAG44 = false ;
            A396EmprCod = P0AG43_A396EmprCod[0] ;
            A44AlbRecCod = P0AG43_A44AlbRecCod[0] ;
            A361DisCod = P0AG43_A361DisCod[0] ;
            AV50count = (long)(AV50count+1) ;
            brkAG44 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A6463AlbRLote)==0) )
         {
            AV45Option = A6463AlbRLote ;
            AV46Options.add(AV45Option, 0);
            AV49OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAG44 )
         {
            brkAG44 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBRTELAROPTIONS' Routine */
      returnInSub = false ;
      AV34TFAlbRTelar = AV57SearchTxt ;
      AV35TFAlbRTelar_Sel = "" ;
      AV67Pedidos_disalb____wwds_1_tfalbreccod = AV10TFAlbRecCod ;
      AV68Pedidos_disalb____wwds_2_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV69Pedidos_disalb____wwds_3_tfalbrreo_sels = AV13TFAlbRReo_Sels ;
      AV70Pedidos_disalb____wwds_4_tfalbrunient = AV14TFAlbRUniEnt ;
      AV71Pedidos_disalb____wwds_5_tfalbrunient_to = AV15TFAlbRUniEnt_To ;
      AV72Pedidos_disalb____wwds_6_tfalbruniuti = AV16TFAlbRUniUti ;
      AV73Pedidos_disalb____wwds_7_tfalbruniuti_to = AV17TFAlbRUniUti_To ;
      AV74Pedidos_disalb____wwds_8_tfalbruni_sels = AV19TFAlbRUni_Sels ;
      AV75Pedidos_disalb____wwds_9_tfalbrpieent = AV20TFAlbRPieEnt ;
      AV76Pedidos_disalb____wwds_10_tfalbrpieent_to = AV21TFAlbRPieEnt_To ;
      AV77Pedidos_disalb____wwds_11_tfalbrpieuti = AV22TFAlbRPieUti ;
      AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV23TFAlbRPieUti_To ;
      AV79Pedidos_disalb____wwds_13_tfalbref = AV24TFAlbRef ;
      AV80Pedidos_disalb____wwds_14_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV81Pedidos_disalb____wwds_15_tfkilos = AV26TFKilos ;
      AV82Pedidos_disalb____wwds_16_tfkilos_to = AV27TFKilos_To ;
      AV83Pedidos_disalb____wwds_17_tfmetros = AV28TFMetros ;
      AV84Pedidos_disalb____wwds_18_tfmetros_to = AV29TFMetros_To ;
      AV85Pedidos_disalb____wwds_19_tfpiezas = AV30TFPiezas ;
      AV86Pedidos_disalb____wwds_20_tfpiezas_to = AV31TFPiezas_To ;
      AV87Pedidos_disalb____wwds_21_tfalbrlote = AV32TFAlbRLote ;
      AV88Pedidos_disalb____wwds_22_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
      AV89Pedidos_disalb____wwds_23_tfalbrtelar = AV34TFAlbRTelar ;
      AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV35TFAlbRTelar_Sel ;
      AV91Pedidos_disalb____wwds_25_tfalbrlu = AV36TFAlbRLu ;
      AV92Pedidos_disalb____wwds_26_tfalbrlu_to = AV37TFAlbRLu_To ;
      AV93Pedidos_disalb____wwds_27_tfalbrmdlcod = AV38TFAlbRMdlCod ;
      AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV39TFAlbRMdlCod_Sel ;
      AV95Pedidos_disalb____wwds_29_tfalbrtara = AV40TFAlbRTara ;
      AV96Pedidos_disalb____wwds_30_tfalbrtara_to = AV41TFAlbRTara_To ;
      AV97Pedidos_disalb____wwds_31_tfalbmaqtej = AV42TFAlbMaqTej ;
      AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV43TFAlbMaqTej_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV69Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV74Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                           Integer.valueOf(AV67Pedidos_disalb____wwds_1_tfalbreccod) ,
                                           Integer.valueOf(AV68Pedidos_disalb____wwds_2_tfalbreccod_to) ,
                                           Integer.valueOf(AV69Pedidos_disalb____wwds_3_tfalbrreo_sels.size()) ,
                                           AV70Pedidos_disalb____wwds_4_tfalbrunient ,
                                           AV71Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                           AV72Pedidos_disalb____wwds_6_tfalbruniuti ,
                                           AV73Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                           Integer.valueOf(AV74Pedidos_disalb____wwds_8_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV75Pedidos_disalb____wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV76Pedidos_disalb____wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV77Pedidos_disalb____wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to) ,
                                           AV80Pedidos_disalb____wwds_14_tfalbref_sel ,
                                           AV79Pedidos_disalb____wwds_13_tfalbref ,
                                           AV81Pedidos_disalb____wwds_15_tfkilos ,
                                           AV82Pedidos_disalb____wwds_16_tfkilos_to ,
                                           AV83Pedidos_disalb____wwds_17_tfmetros ,
                                           AV84Pedidos_disalb____wwds_18_tfmetros_to ,
                                           Integer.valueOf(AV85Pedidos_disalb____wwds_19_tfpiezas) ,
                                           Integer.valueOf(AV86Pedidos_disalb____wwds_20_tfpiezas_to) ,
                                           AV88Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                           AV87Pedidos_disalb____wwds_21_tfalbrlote ,
                                           AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                           AV89Pedidos_disalb____wwds_23_tfalbrtelar ,
                                           AV91Pedidos_disalb____wwds_25_tfalbrlu ,
                                           AV92Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                           AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                           AV93Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                           AV95Pedidos_disalb____wwds_29_tfalbrtara ,
                                           AV96Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                           AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                           AV97Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A45AlbRef ,
                                           A595Kilos ,
                                           A631Metros ,
                                           Integer.valueOf(A673Piezas) ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A6465AlbRLu ,
                                           A4602AlbRMdlCod ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV79Pedidos_disalb____wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV79Pedidos_disalb____wwds_13_tfalbref), 16, "%") ;
      lV87Pedidos_disalb____wwds_21_tfalbrlote = GXutil.padr( GXutil.rtrim( AV87Pedidos_disalb____wwds_21_tfalbrlote), 20, "%") ;
      lV89Pedidos_disalb____wwds_23_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV89Pedidos_disalb____wwds_23_tfalbrtelar), 20, "%") ;
      lV93Pedidos_disalb____wwds_27_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV93Pedidos_disalb____wwds_27_tfalbrmdlcod), 13, "%") ;
      lV97Pedidos_disalb____wwds_31_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV97Pedidos_disalb____wwds_31_tfalbmaqtej), 12, "%") ;
      /* Using cursor P0AG44 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV67Pedidos_disalb____wwds_1_tfalbreccod), Integer.valueOf(AV68Pedidos_disalb____wwds_2_tfalbreccod_to), AV70Pedidos_disalb____wwds_4_tfalbrunient, AV71Pedidos_disalb____wwds_5_tfalbrunient_to, AV72Pedidos_disalb____wwds_6_tfalbruniuti, AV73Pedidos_disalb____wwds_7_tfalbruniuti_to, Integer.valueOf(AV75Pedidos_disalb____wwds_9_tfalbrpieent), Integer.valueOf(AV76Pedidos_disalb____wwds_10_tfalbrpieent_to), Integer.valueOf(AV77Pedidos_disalb____wwds_11_tfalbrpieuti), Integer.valueOf(AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to), lV79Pedidos_disalb____wwds_13_tfalbref, AV80Pedidos_disalb____wwds_14_tfalbref_sel, AV81Pedidos_disalb____wwds_15_tfkilos, AV82Pedidos_disalb____wwds_16_tfkilos_to, AV83Pedidos_disalb____wwds_17_tfmetros, AV84Pedidos_disalb____wwds_18_tfmetros_to, Integer.valueOf(AV85Pedidos_disalb____wwds_19_tfpiezas), Integer.valueOf(AV86Pedidos_disalb____wwds_20_tfpiezas_to), lV87Pedidos_disalb____wwds_21_tfalbrlote, AV88Pedidos_disalb____wwds_22_tfalbrlote_sel, lV89Pedidos_disalb____wwds_23_tfalbrtelar, AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel, AV91Pedidos_disalb____wwds_25_tfalbrlu, AV92Pedidos_disalb____wwds_26_tfalbrlu_to, lV93Pedidos_disalb____wwds_27_tfalbrmdlcod, AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel, AV95Pedidos_disalb____wwds_29_tfalbrtara, AV96Pedidos_disalb____wwds_30_tfalbrtara_to, lV97Pedidos_disalb____wwds_31_tfalbmaqtej, AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAG46 = false ;
         A396EmprCod = P0AG44_A396EmprCod[0] ;
         A6464AlbRTelar = P0AG44_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P0AG44_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AG44_A6470AlbRTara[0] ;
         A4602AlbRMdlCod = P0AG44_A4602AlbRMdlCod[0] ;
         A6465AlbRLu = P0AG44_A6465AlbRLu[0] ;
         A6463AlbRLote = P0AG44_A6463AlbRLote[0] ;
         A673Piezas = P0AG44_A673Piezas[0] ;
         A631Metros = P0AG44_A631Metros[0] ;
         A595Kilos = P0AG44_A595Kilos[0] ;
         A45AlbRef = P0AG44_A45AlbRef[0] ;
         A54AlbRPieUti = P0AG44_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AG44_A52AlbRPieEnt[0] ;
         A56AlbRUni = P0AG44_A56AlbRUni[0] ;
         A60AlbRUniUti = P0AG44_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AG44_A58AlbRUniEnt[0] ;
         A55AlbRReo = P0AG44_A55AlbRReo[0] ;
         A44AlbRecCod = P0AG44_A44AlbRecCod[0] ;
         A361DisCod = P0AG44_A361DisCod[0] ;
         A6464AlbRTelar = P0AG44_A6464AlbRTelar[0] ;
         A8035AlbMaqTej = P0AG44_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AG44_A6470AlbRTara[0] ;
         A4602AlbRMdlCod = P0AG44_A4602AlbRMdlCod[0] ;
         A6465AlbRLu = P0AG44_A6465AlbRLu[0] ;
         A6463AlbRLote = P0AG44_A6463AlbRLote[0] ;
         A45AlbRef = P0AG44_A45AlbRef[0] ;
         A54AlbRPieUti = P0AG44_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AG44_A52AlbRPieEnt[0] ;
         A56AlbRUni = P0AG44_A56AlbRUni[0] ;
         A60AlbRUniUti = P0AG44_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AG44_A58AlbRUniEnt[0] ;
         A55AlbRReo = P0AG44_A55AlbRReo[0] ;
         AV50count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AG44_A6464AlbRTelar[0], A6464AlbRTelar) == 0 ) )
         {
            brkAG46 = false ;
            A396EmprCod = P0AG44_A396EmprCod[0] ;
            A44AlbRecCod = P0AG44_A44AlbRecCod[0] ;
            A361DisCod = P0AG44_A361DisCod[0] ;
            AV50count = (long)(AV50count+1) ;
            brkAG46 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A6464AlbRTelar)==0) )
         {
            AV45Option = A6464AlbRTelar ;
            AV46Options.add(AV45Option, 0);
            AV49OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAG46 )
         {
            brkAG46 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBRMDLCODOPTIONS' Routine */
      returnInSub = false ;
      AV38TFAlbRMdlCod = AV57SearchTxt ;
      AV39TFAlbRMdlCod_Sel = "" ;
      AV67Pedidos_disalb____wwds_1_tfalbreccod = AV10TFAlbRecCod ;
      AV68Pedidos_disalb____wwds_2_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV69Pedidos_disalb____wwds_3_tfalbrreo_sels = AV13TFAlbRReo_Sels ;
      AV70Pedidos_disalb____wwds_4_tfalbrunient = AV14TFAlbRUniEnt ;
      AV71Pedidos_disalb____wwds_5_tfalbrunient_to = AV15TFAlbRUniEnt_To ;
      AV72Pedidos_disalb____wwds_6_tfalbruniuti = AV16TFAlbRUniUti ;
      AV73Pedidos_disalb____wwds_7_tfalbruniuti_to = AV17TFAlbRUniUti_To ;
      AV74Pedidos_disalb____wwds_8_tfalbruni_sels = AV19TFAlbRUni_Sels ;
      AV75Pedidos_disalb____wwds_9_tfalbrpieent = AV20TFAlbRPieEnt ;
      AV76Pedidos_disalb____wwds_10_tfalbrpieent_to = AV21TFAlbRPieEnt_To ;
      AV77Pedidos_disalb____wwds_11_tfalbrpieuti = AV22TFAlbRPieUti ;
      AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV23TFAlbRPieUti_To ;
      AV79Pedidos_disalb____wwds_13_tfalbref = AV24TFAlbRef ;
      AV80Pedidos_disalb____wwds_14_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV81Pedidos_disalb____wwds_15_tfkilos = AV26TFKilos ;
      AV82Pedidos_disalb____wwds_16_tfkilos_to = AV27TFKilos_To ;
      AV83Pedidos_disalb____wwds_17_tfmetros = AV28TFMetros ;
      AV84Pedidos_disalb____wwds_18_tfmetros_to = AV29TFMetros_To ;
      AV85Pedidos_disalb____wwds_19_tfpiezas = AV30TFPiezas ;
      AV86Pedidos_disalb____wwds_20_tfpiezas_to = AV31TFPiezas_To ;
      AV87Pedidos_disalb____wwds_21_tfalbrlote = AV32TFAlbRLote ;
      AV88Pedidos_disalb____wwds_22_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
      AV89Pedidos_disalb____wwds_23_tfalbrtelar = AV34TFAlbRTelar ;
      AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV35TFAlbRTelar_Sel ;
      AV91Pedidos_disalb____wwds_25_tfalbrlu = AV36TFAlbRLu ;
      AV92Pedidos_disalb____wwds_26_tfalbrlu_to = AV37TFAlbRLu_To ;
      AV93Pedidos_disalb____wwds_27_tfalbrmdlcod = AV38TFAlbRMdlCod ;
      AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV39TFAlbRMdlCod_Sel ;
      AV95Pedidos_disalb____wwds_29_tfalbrtara = AV40TFAlbRTara ;
      AV96Pedidos_disalb____wwds_30_tfalbrtara_to = AV41TFAlbRTara_To ;
      AV97Pedidos_disalb____wwds_31_tfalbmaqtej = AV42TFAlbMaqTej ;
      AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV43TFAlbMaqTej_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV69Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV74Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                           Integer.valueOf(AV67Pedidos_disalb____wwds_1_tfalbreccod) ,
                                           Integer.valueOf(AV68Pedidos_disalb____wwds_2_tfalbreccod_to) ,
                                           Integer.valueOf(AV69Pedidos_disalb____wwds_3_tfalbrreo_sels.size()) ,
                                           AV70Pedidos_disalb____wwds_4_tfalbrunient ,
                                           AV71Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                           AV72Pedidos_disalb____wwds_6_tfalbruniuti ,
                                           AV73Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                           Integer.valueOf(AV74Pedidos_disalb____wwds_8_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV75Pedidos_disalb____wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV76Pedidos_disalb____wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV77Pedidos_disalb____wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to) ,
                                           AV80Pedidos_disalb____wwds_14_tfalbref_sel ,
                                           AV79Pedidos_disalb____wwds_13_tfalbref ,
                                           AV81Pedidos_disalb____wwds_15_tfkilos ,
                                           AV82Pedidos_disalb____wwds_16_tfkilos_to ,
                                           AV83Pedidos_disalb____wwds_17_tfmetros ,
                                           AV84Pedidos_disalb____wwds_18_tfmetros_to ,
                                           Integer.valueOf(AV85Pedidos_disalb____wwds_19_tfpiezas) ,
                                           Integer.valueOf(AV86Pedidos_disalb____wwds_20_tfpiezas_to) ,
                                           AV88Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                           AV87Pedidos_disalb____wwds_21_tfalbrlote ,
                                           AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                           AV89Pedidos_disalb____wwds_23_tfalbrtelar ,
                                           AV91Pedidos_disalb____wwds_25_tfalbrlu ,
                                           AV92Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                           AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                           AV93Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                           AV95Pedidos_disalb____wwds_29_tfalbrtara ,
                                           AV96Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                           AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                           AV97Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A45AlbRef ,
                                           A595Kilos ,
                                           A631Metros ,
                                           Integer.valueOf(A673Piezas) ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A6465AlbRLu ,
                                           A4602AlbRMdlCod ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV79Pedidos_disalb____wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV79Pedidos_disalb____wwds_13_tfalbref), 16, "%") ;
      lV87Pedidos_disalb____wwds_21_tfalbrlote = GXutil.padr( GXutil.rtrim( AV87Pedidos_disalb____wwds_21_tfalbrlote), 20, "%") ;
      lV89Pedidos_disalb____wwds_23_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV89Pedidos_disalb____wwds_23_tfalbrtelar), 20, "%") ;
      lV93Pedidos_disalb____wwds_27_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV93Pedidos_disalb____wwds_27_tfalbrmdlcod), 13, "%") ;
      lV97Pedidos_disalb____wwds_31_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV97Pedidos_disalb____wwds_31_tfalbmaqtej), 12, "%") ;
      /* Using cursor P0AG45 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV67Pedidos_disalb____wwds_1_tfalbreccod), Integer.valueOf(AV68Pedidos_disalb____wwds_2_tfalbreccod_to), AV70Pedidos_disalb____wwds_4_tfalbrunient, AV71Pedidos_disalb____wwds_5_tfalbrunient_to, AV72Pedidos_disalb____wwds_6_tfalbruniuti, AV73Pedidos_disalb____wwds_7_tfalbruniuti_to, Integer.valueOf(AV75Pedidos_disalb____wwds_9_tfalbrpieent), Integer.valueOf(AV76Pedidos_disalb____wwds_10_tfalbrpieent_to), Integer.valueOf(AV77Pedidos_disalb____wwds_11_tfalbrpieuti), Integer.valueOf(AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to), lV79Pedidos_disalb____wwds_13_tfalbref, AV80Pedidos_disalb____wwds_14_tfalbref_sel, AV81Pedidos_disalb____wwds_15_tfkilos, AV82Pedidos_disalb____wwds_16_tfkilos_to, AV83Pedidos_disalb____wwds_17_tfmetros, AV84Pedidos_disalb____wwds_18_tfmetros_to, Integer.valueOf(AV85Pedidos_disalb____wwds_19_tfpiezas), Integer.valueOf(AV86Pedidos_disalb____wwds_20_tfpiezas_to), lV87Pedidos_disalb____wwds_21_tfalbrlote, AV88Pedidos_disalb____wwds_22_tfalbrlote_sel, lV89Pedidos_disalb____wwds_23_tfalbrtelar, AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel, AV91Pedidos_disalb____wwds_25_tfalbrlu, AV92Pedidos_disalb____wwds_26_tfalbrlu_to, lV93Pedidos_disalb____wwds_27_tfalbrmdlcod, AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel, AV95Pedidos_disalb____wwds_29_tfalbrtara, AV96Pedidos_disalb____wwds_30_tfalbrtara_to, lV97Pedidos_disalb____wwds_31_tfalbmaqtej, AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAG48 = false ;
         A396EmprCod = P0AG45_A396EmprCod[0] ;
         A4602AlbRMdlCod = P0AG45_A4602AlbRMdlCod[0] ;
         A8035AlbMaqTej = P0AG45_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AG45_A6470AlbRTara[0] ;
         A6465AlbRLu = P0AG45_A6465AlbRLu[0] ;
         A6464AlbRTelar = P0AG45_A6464AlbRTelar[0] ;
         A6463AlbRLote = P0AG45_A6463AlbRLote[0] ;
         A673Piezas = P0AG45_A673Piezas[0] ;
         A631Metros = P0AG45_A631Metros[0] ;
         A595Kilos = P0AG45_A595Kilos[0] ;
         A45AlbRef = P0AG45_A45AlbRef[0] ;
         A54AlbRPieUti = P0AG45_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AG45_A52AlbRPieEnt[0] ;
         A56AlbRUni = P0AG45_A56AlbRUni[0] ;
         A60AlbRUniUti = P0AG45_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AG45_A58AlbRUniEnt[0] ;
         A55AlbRReo = P0AG45_A55AlbRReo[0] ;
         A44AlbRecCod = P0AG45_A44AlbRecCod[0] ;
         A361DisCod = P0AG45_A361DisCod[0] ;
         A4602AlbRMdlCod = P0AG45_A4602AlbRMdlCod[0] ;
         A8035AlbMaqTej = P0AG45_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AG45_A6470AlbRTara[0] ;
         A6465AlbRLu = P0AG45_A6465AlbRLu[0] ;
         A6464AlbRTelar = P0AG45_A6464AlbRTelar[0] ;
         A6463AlbRLote = P0AG45_A6463AlbRLote[0] ;
         A45AlbRef = P0AG45_A45AlbRef[0] ;
         A54AlbRPieUti = P0AG45_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AG45_A52AlbRPieEnt[0] ;
         A56AlbRUni = P0AG45_A56AlbRUni[0] ;
         A60AlbRUniUti = P0AG45_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AG45_A58AlbRUniEnt[0] ;
         A55AlbRReo = P0AG45_A55AlbRReo[0] ;
         AV50count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AG45_A4602AlbRMdlCod[0], A4602AlbRMdlCod) == 0 ) )
         {
            brkAG48 = false ;
            A396EmprCod = P0AG45_A396EmprCod[0] ;
            A44AlbRecCod = P0AG45_A44AlbRecCod[0] ;
            A361DisCod = P0AG45_A361DisCod[0] ;
            AV50count = (long)(AV50count+1) ;
            brkAG48 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A4602AlbRMdlCod)==0) )
         {
            AV45Option = A4602AlbRMdlCod ;
            AV46Options.add(AV45Option, 0);
            AV49OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAG48 )
         {
            brkAG48 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADALBMAQTEJOPTIONS' Routine */
      returnInSub = false ;
      AV42TFAlbMaqTej = AV57SearchTxt ;
      AV43TFAlbMaqTej_Sel = "" ;
      AV67Pedidos_disalb____wwds_1_tfalbreccod = AV10TFAlbRecCod ;
      AV68Pedidos_disalb____wwds_2_tfalbreccod_to = AV11TFAlbRecCod_To ;
      AV69Pedidos_disalb____wwds_3_tfalbrreo_sels = AV13TFAlbRReo_Sels ;
      AV70Pedidos_disalb____wwds_4_tfalbrunient = AV14TFAlbRUniEnt ;
      AV71Pedidos_disalb____wwds_5_tfalbrunient_to = AV15TFAlbRUniEnt_To ;
      AV72Pedidos_disalb____wwds_6_tfalbruniuti = AV16TFAlbRUniUti ;
      AV73Pedidos_disalb____wwds_7_tfalbruniuti_to = AV17TFAlbRUniUti_To ;
      AV74Pedidos_disalb____wwds_8_tfalbruni_sels = AV19TFAlbRUni_Sels ;
      AV75Pedidos_disalb____wwds_9_tfalbrpieent = AV20TFAlbRPieEnt ;
      AV76Pedidos_disalb____wwds_10_tfalbrpieent_to = AV21TFAlbRPieEnt_To ;
      AV77Pedidos_disalb____wwds_11_tfalbrpieuti = AV22TFAlbRPieUti ;
      AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV23TFAlbRPieUti_To ;
      AV79Pedidos_disalb____wwds_13_tfalbref = AV24TFAlbRef ;
      AV80Pedidos_disalb____wwds_14_tfalbref_sel = AV25TFAlbRef_Sel ;
      AV81Pedidos_disalb____wwds_15_tfkilos = AV26TFKilos ;
      AV82Pedidos_disalb____wwds_16_tfkilos_to = AV27TFKilos_To ;
      AV83Pedidos_disalb____wwds_17_tfmetros = AV28TFMetros ;
      AV84Pedidos_disalb____wwds_18_tfmetros_to = AV29TFMetros_To ;
      AV85Pedidos_disalb____wwds_19_tfpiezas = AV30TFPiezas ;
      AV86Pedidos_disalb____wwds_20_tfpiezas_to = AV31TFPiezas_To ;
      AV87Pedidos_disalb____wwds_21_tfalbrlote = AV32TFAlbRLote ;
      AV88Pedidos_disalb____wwds_22_tfalbrlote_sel = AV33TFAlbRLote_Sel ;
      AV89Pedidos_disalb____wwds_23_tfalbrtelar = AV34TFAlbRTelar ;
      AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV35TFAlbRTelar_Sel ;
      AV91Pedidos_disalb____wwds_25_tfalbrlu = AV36TFAlbRLu ;
      AV92Pedidos_disalb____wwds_26_tfalbrlu_to = AV37TFAlbRLu_To ;
      AV93Pedidos_disalb____wwds_27_tfalbrmdlcod = AV38TFAlbRMdlCod ;
      AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV39TFAlbRMdlCod_Sel ;
      AV95Pedidos_disalb____wwds_29_tfalbrtara = AV40TFAlbRTara ;
      AV96Pedidos_disalb____wwds_30_tfalbrtara_to = AV41TFAlbRTara_To ;
      AV97Pedidos_disalb____wwds_31_tfalbmaqtej = AV42TFAlbMaqTej ;
      AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV43TFAlbMaqTej_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV69Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV74Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                           Integer.valueOf(AV67Pedidos_disalb____wwds_1_tfalbreccod) ,
                                           Integer.valueOf(AV68Pedidos_disalb____wwds_2_tfalbreccod_to) ,
                                           Integer.valueOf(AV69Pedidos_disalb____wwds_3_tfalbrreo_sels.size()) ,
                                           AV70Pedidos_disalb____wwds_4_tfalbrunient ,
                                           AV71Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                           AV72Pedidos_disalb____wwds_6_tfalbruniuti ,
                                           AV73Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                           Integer.valueOf(AV74Pedidos_disalb____wwds_8_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV75Pedidos_disalb____wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV76Pedidos_disalb____wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV77Pedidos_disalb____wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to) ,
                                           AV80Pedidos_disalb____wwds_14_tfalbref_sel ,
                                           AV79Pedidos_disalb____wwds_13_tfalbref ,
                                           AV81Pedidos_disalb____wwds_15_tfkilos ,
                                           AV82Pedidos_disalb____wwds_16_tfkilos_to ,
                                           AV83Pedidos_disalb____wwds_17_tfmetros ,
                                           AV84Pedidos_disalb____wwds_18_tfmetros_to ,
                                           Integer.valueOf(AV85Pedidos_disalb____wwds_19_tfpiezas) ,
                                           Integer.valueOf(AV86Pedidos_disalb____wwds_20_tfpiezas_to) ,
                                           AV88Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                           AV87Pedidos_disalb____wwds_21_tfalbrlote ,
                                           AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                           AV89Pedidos_disalb____wwds_23_tfalbrtelar ,
                                           AV91Pedidos_disalb____wwds_25_tfalbrlu ,
                                           AV92Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                           AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                           AV93Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                           AV95Pedidos_disalb____wwds_29_tfalbrtara ,
                                           AV96Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                           AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                           AV97Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A45AlbRef ,
                                           A595Kilos ,
                                           A631Metros ,
                                           Integer.valueOf(A673Piezas) ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A6465AlbRLu ,
                                           A4602AlbRMdlCod ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV79Pedidos_disalb____wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV79Pedidos_disalb____wwds_13_tfalbref), 16, "%") ;
      lV87Pedidos_disalb____wwds_21_tfalbrlote = GXutil.padr( GXutil.rtrim( AV87Pedidos_disalb____wwds_21_tfalbrlote), 20, "%") ;
      lV89Pedidos_disalb____wwds_23_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV89Pedidos_disalb____wwds_23_tfalbrtelar), 20, "%") ;
      lV93Pedidos_disalb____wwds_27_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV93Pedidos_disalb____wwds_27_tfalbrmdlcod), 13, "%") ;
      lV97Pedidos_disalb____wwds_31_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV97Pedidos_disalb____wwds_31_tfalbmaqtej), 12, "%") ;
      /* Using cursor P0AG46 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV67Pedidos_disalb____wwds_1_tfalbreccod), Integer.valueOf(AV68Pedidos_disalb____wwds_2_tfalbreccod_to), AV70Pedidos_disalb____wwds_4_tfalbrunient, AV71Pedidos_disalb____wwds_5_tfalbrunient_to, AV72Pedidos_disalb____wwds_6_tfalbruniuti, AV73Pedidos_disalb____wwds_7_tfalbruniuti_to, Integer.valueOf(AV75Pedidos_disalb____wwds_9_tfalbrpieent), Integer.valueOf(AV76Pedidos_disalb____wwds_10_tfalbrpieent_to), Integer.valueOf(AV77Pedidos_disalb____wwds_11_tfalbrpieuti), Integer.valueOf(AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to), lV79Pedidos_disalb____wwds_13_tfalbref, AV80Pedidos_disalb____wwds_14_tfalbref_sel, AV81Pedidos_disalb____wwds_15_tfkilos, AV82Pedidos_disalb____wwds_16_tfkilos_to, AV83Pedidos_disalb____wwds_17_tfmetros, AV84Pedidos_disalb____wwds_18_tfmetros_to, Integer.valueOf(AV85Pedidos_disalb____wwds_19_tfpiezas), Integer.valueOf(AV86Pedidos_disalb____wwds_20_tfpiezas_to), lV87Pedidos_disalb____wwds_21_tfalbrlote, AV88Pedidos_disalb____wwds_22_tfalbrlote_sel, lV89Pedidos_disalb____wwds_23_tfalbrtelar, AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel, AV91Pedidos_disalb____wwds_25_tfalbrlu, AV92Pedidos_disalb____wwds_26_tfalbrlu_to, lV93Pedidos_disalb____wwds_27_tfalbrmdlcod, AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel, AV95Pedidos_disalb____wwds_29_tfalbrtara, AV96Pedidos_disalb____wwds_30_tfalbrtara_to, lV97Pedidos_disalb____wwds_31_tfalbmaqtej, AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAG410 = false ;
         A396EmprCod = P0AG46_A396EmprCod[0] ;
         A8035AlbMaqTej = P0AG46_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AG46_A6470AlbRTara[0] ;
         A4602AlbRMdlCod = P0AG46_A4602AlbRMdlCod[0] ;
         A6465AlbRLu = P0AG46_A6465AlbRLu[0] ;
         A6464AlbRTelar = P0AG46_A6464AlbRTelar[0] ;
         A6463AlbRLote = P0AG46_A6463AlbRLote[0] ;
         A673Piezas = P0AG46_A673Piezas[0] ;
         A631Metros = P0AG46_A631Metros[0] ;
         A595Kilos = P0AG46_A595Kilos[0] ;
         A45AlbRef = P0AG46_A45AlbRef[0] ;
         A54AlbRPieUti = P0AG46_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AG46_A52AlbRPieEnt[0] ;
         A56AlbRUni = P0AG46_A56AlbRUni[0] ;
         A60AlbRUniUti = P0AG46_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AG46_A58AlbRUniEnt[0] ;
         A55AlbRReo = P0AG46_A55AlbRReo[0] ;
         A44AlbRecCod = P0AG46_A44AlbRecCod[0] ;
         A361DisCod = P0AG46_A361DisCod[0] ;
         A8035AlbMaqTej = P0AG46_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P0AG46_A6470AlbRTara[0] ;
         A4602AlbRMdlCod = P0AG46_A4602AlbRMdlCod[0] ;
         A6465AlbRLu = P0AG46_A6465AlbRLu[0] ;
         A6464AlbRTelar = P0AG46_A6464AlbRTelar[0] ;
         A6463AlbRLote = P0AG46_A6463AlbRLote[0] ;
         A45AlbRef = P0AG46_A45AlbRef[0] ;
         A54AlbRPieUti = P0AG46_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = P0AG46_A52AlbRPieEnt[0] ;
         A56AlbRUni = P0AG46_A56AlbRUni[0] ;
         A60AlbRUniUti = P0AG46_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = P0AG46_A58AlbRUniEnt[0] ;
         A55AlbRReo = P0AG46_A55AlbRReo[0] ;
         AV50count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AG46_A8035AlbMaqTej[0], A8035AlbMaqTej) == 0 ) )
         {
            brkAG410 = false ;
            A396EmprCod = P0AG46_A396EmprCod[0] ;
            A44AlbRecCod = P0AG46_A44AlbRecCod[0] ;
            A361DisCod = P0AG46_A361DisCod[0] ;
            AV50count = (long)(AV50count+1) ;
            brkAG410 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A8035AlbMaqTej)==0) )
         {
            AV45Option = A8035AlbMaqTej ;
            AV46Options.add(AV45Option, 0);
            AV49OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAG410 )
         {
            brkAG410 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   protected void cleanup( )
   {
      this.aP3[0] = disalb____wwgetfilterdata.this.AV59OptionsJson;
      this.aP4[0] = disalb____wwgetfilterdata.this.AV60OptionsDescJson;
      this.aP5[0] = disalb____wwgetfilterdata.this.AV61OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV59OptionsJson = "" ;
      AV60OptionsDescJson = "" ;
      AV61OptionIndexesJson = "" ;
      AV46Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV49OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV51Session = httpContext.getWebSession();
      AV53GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV54GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFAlbRReo_SelsJson = "" ;
      AV13TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV14TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV15TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV16TFAlbRUniUti = DecimalUtil.ZERO ;
      AV17TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV18TFAlbRUni_SelsJson = "" ;
      AV19TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24TFAlbRef = "" ;
      AV25TFAlbRef_Sel = "" ;
      AV26TFKilos = DecimalUtil.ZERO ;
      AV27TFKilos_To = DecimalUtil.ZERO ;
      AV28TFMetros = DecimalUtil.ZERO ;
      AV29TFMetros_To = DecimalUtil.ZERO ;
      AV32TFAlbRLote = "" ;
      AV33TFAlbRLote_Sel = "" ;
      AV34TFAlbRTelar = "" ;
      AV35TFAlbRTelar_Sel = "" ;
      AV36TFAlbRLu = DecimalUtil.ZERO ;
      AV37TFAlbRLu_To = DecimalUtil.ZERO ;
      AV38TFAlbRMdlCod = "" ;
      AV39TFAlbRMdlCod_Sel = "" ;
      AV40TFAlbRTara = DecimalUtil.ZERO ;
      AV41TFAlbRTara_To = DecimalUtil.ZERO ;
      AV42TFAlbMaqTej = "" ;
      AV43TFAlbMaqTej_Sel = "" ;
      A45AlbRef = "" ;
      AV69Pedidos_disalb____wwds_3_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV70Pedidos_disalb____wwds_4_tfalbrunient = DecimalUtil.ZERO ;
      AV71Pedidos_disalb____wwds_5_tfalbrunient_to = DecimalUtil.ZERO ;
      AV72Pedidos_disalb____wwds_6_tfalbruniuti = DecimalUtil.ZERO ;
      AV73Pedidos_disalb____wwds_7_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV74Pedidos_disalb____wwds_8_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV79Pedidos_disalb____wwds_13_tfalbref = "" ;
      AV80Pedidos_disalb____wwds_14_tfalbref_sel = "" ;
      AV81Pedidos_disalb____wwds_15_tfkilos = DecimalUtil.ZERO ;
      AV82Pedidos_disalb____wwds_16_tfkilos_to = DecimalUtil.ZERO ;
      AV83Pedidos_disalb____wwds_17_tfmetros = DecimalUtil.ZERO ;
      AV84Pedidos_disalb____wwds_18_tfmetros_to = DecimalUtil.ZERO ;
      AV87Pedidos_disalb____wwds_21_tfalbrlote = "" ;
      AV88Pedidos_disalb____wwds_22_tfalbrlote_sel = "" ;
      AV89Pedidos_disalb____wwds_23_tfalbrtelar = "" ;
      AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel = "" ;
      AV91Pedidos_disalb____wwds_25_tfalbrlu = DecimalUtil.ZERO ;
      AV92Pedidos_disalb____wwds_26_tfalbrlu_to = DecimalUtil.ZERO ;
      AV93Pedidos_disalb____wwds_27_tfalbrmdlcod = "" ;
      AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = "" ;
      AV95Pedidos_disalb____wwds_29_tfalbrtara = DecimalUtil.ZERO ;
      AV96Pedidos_disalb____wwds_30_tfalbrtara_to = DecimalUtil.ZERO ;
      AV97Pedidos_disalb____wwds_31_tfalbmaqtej = "" ;
      AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel = "" ;
      scmdbuf = "" ;
      lV79Pedidos_disalb____wwds_13_tfalbref = "" ;
      lV87Pedidos_disalb____wwds_21_tfalbrlote = "" ;
      lV89Pedidos_disalb____wwds_23_tfalbrtelar = "" ;
      lV93Pedidos_disalb____wwds_27_tfalbrmdlcod = "" ;
      lV97Pedidos_disalb____wwds_31_tfalbmaqtej = "" ;
      A55AlbRReo = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A6463AlbRLote = "" ;
      A6464AlbRTelar = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A8035AlbMaqTej = "" ;
      P0AG42_A44AlbRecCod = new int[1] ;
      P0AG42_A396EmprCod = new String[] {""} ;
      P0AG42_A8035AlbMaqTej = new String[] {""} ;
      P0AG42_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG42_A4602AlbRMdlCod = new String[] {""} ;
      P0AG42_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG42_A6464AlbRTelar = new String[] {""} ;
      P0AG42_A6463AlbRLote = new String[] {""} ;
      P0AG42_A673Piezas = new int[1] ;
      P0AG42_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG42_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG42_A45AlbRef = new String[] {""} ;
      P0AG42_A54AlbRPieUti = new int[1] ;
      P0AG42_A52AlbRPieEnt = new int[1] ;
      P0AG42_A56AlbRUni = new String[] {""} ;
      P0AG42_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG42_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG42_A55AlbRReo = new String[] {""} ;
      P0AG42_A361DisCod = new int[1] ;
      A396EmprCod = "" ;
      AV45Option = "" ;
      P0AG43_A396EmprCod = new String[] {""} ;
      P0AG43_A6463AlbRLote = new String[] {""} ;
      P0AG43_A8035AlbMaqTej = new String[] {""} ;
      P0AG43_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG43_A4602AlbRMdlCod = new String[] {""} ;
      P0AG43_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG43_A6464AlbRTelar = new String[] {""} ;
      P0AG43_A673Piezas = new int[1] ;
      P0AG43_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG43_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG43_A45AlbRef = new String[] {""} ;
      P0AG43_A54AlbRPieUti = new int[1] ;
      P0AG43_A52AlbRPieEnt = new int[1] ;
      P0AG43_A56AlbRUni = new String[] {""} ;
      P0AG43_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG43_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG43_A55AlbRReo = new String[] {""} ;
      P0AG43_A44AlbRecCod = new int[1] ;
      P0AG43_A361DisCod = new int[1] ;
      P0AG44_A396EmprCod = new String[] {""} ;
      P0AG44_A6464AlbRTelar = new String[] {""} ;
      P0AG44_A8035AlbMaqTej = new String[] {""} ;
      P0AG44_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG44_A4602AlbRMdlCod = new String[] {""} ;
      P0AG44_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG44_A6463AlbRLote = new String[] {""} ;
      P0AG44_A673Piezas = new int[1] ;
      P0AG44_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG44_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG44_A45AlbRef = new String[] {""} ;
      P0AG44_A54AlbRPieUti = new int[1] ;
      P0AG44_A52AlbRPieEnt = new int[1] ;
      P0AG44_A56AlbRUni = new String[] {""} ;
      P0AG44_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG44_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG44_A55AlbRReo = new String[] {""} ;
      P0AG44_A44AlbRecCod = new int[1] ;
      P0AG44_A361DisCod = new int[1] ;
      P0AG45_A396EmprCod = new String[] {""} ;
      P0AG45_A4602AlbRMdlCod = new String[] {""} ;
      P0AG45_A8035AlbMaqTej = new String[] {""} ;
      P0AG45_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG45_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG45_A6464AlbRTelar = new String[] {""} ;
      P0AG45_A6463AlbRLote = new String[] {""} ;
      P0AG45_A673Piezas = new int[1] ;
      P0AG45_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG45_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG45_A45AlbRef = new String[] {""} ;
      P0AG45_A54AlbRPieUti = new int[1] ;
      P0AG45_A52AlbRPieEnt = new int[1] ;
      P0AG45_A56AlbRUni = new String[] {""} ;
      P0AG45_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG45_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG45_A55AlbRReo = new String[] {""} ;
      P0AG45_A44AlbRecCod = new int[1] ;
      P0AG45_A361DisCod = new int[1] ;
      P0AG46_A396EmprCod = new String[] {""} ;
      P0AG46_A8035AlbMaqTej = new String[] {""} ;
      P0AG46_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG46_A4602AlbRMdlCod = new String[] {""} ;
      P0AG46_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG46_A6464AlbRTelar = new String[] {""} ;
      P0AG46_A6463AlbRLote = new String[] {""} ;
      P0AG46_A673Piezas = new int[1] ;
      P0AG46_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG46_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG46_A45AlbRef = new String[] {""} ;
      P0AG46_A54AlbRPieUti = new int[1] ;
      P0AG46_A52AlbRPieEnt = new int[1] ;
      P0AG46_A56AlbRUni = new String[] {""} ;
      P0AG46_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG46_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AG46_A55AlbRReo = new String[] {""} ;
      P0AG46_A44AlbRecCod = new int[1] ;
      P0AG46_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb____wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AG42_A44AlbRecCod, P0AG42_A396EmprCod, P0AG42_A8035AlbMaqTej, P0AG42_A6470AlbRTara, P0AG42_A4602AlbRMdlCod, P0AG42_A6465AlbRLu, P0AG42_A6464AlbRTelar, P0AG42_A6463AlbRLote, P0AG42_A673Piezas, P0AG42_A631Metros,
            P0AG42_A595Kilos, P0AG42_A45AlbRef, P0AG42_A54AlbRPieUti, P0AG42_A52AlbRPieEnt, P0AG42_A56AlbRUni, P0AG42_A60AlbRUniUti, P0AG42_A58AlbRUniEnt, P0AG42_A55AlbRReo, P0AG42_A361DisCod
            }
            , new Object[] {
            P0AG43_A396EmprCod, P0AG43_A6463AlbRLote, P0AG43_A8035AlbMaqTej, P0AG43_A6470AlbRTara, P0AG43_A4602AlbRMdlCod, P0AG43_A6465AlbRLu, P0AG43_A6464AlbRTelar, P0AG43_A673Piezas, P0AG43_A631Metros, P0AG43_A595Kilos,
            P0AG43_A45AlbRef, P0AG43_A54AlbRPieUti, P0AG43_A52AlbRPieEnt, P0AG43_A56AlbRUni, P0AG43_A60AlbRUniUti, P0AG43_A58AlbRUniEnt, P0AG43_A55AlbRReo, P0AG43_A44AlbRecCod, P0AG43_A361DisCod
            }
            , new Object[] {
            P0AG44_A396EmprCod, P0AG44_A6464AlbRTelar, P0AG44_A8035AlbMaqTej, P0AG44_A6470AlbRTara, P0AG44_A4602AlbRMdlCod, P0AG44_A6465AlbRLu, P0AG44_A6463AlbRLote, P0AG44_A673Piezas, P0AG44_A631Metros, P0AG44_A595Kilos,
            P0AG44_A45AlbRef, P0AG44_A54AlbRPieUti, P0AG44_A52AlbRPieEnt, P0AG44_A56AlbRUni, P0AG44_A60AlbRUniUti, P0AG44_A58AlbRUniEnt, P0AG44_A55AlbRReo, P0AG44_A44AlbRecCod, P0AG44_A361DisCod
            }
            , new Object[] {
            P0AG45_A396EmprCod, P0AG45_A4602AlbRMdlCod, P0AG45_A8035AlbMaqTej, P0AG45_A6470AlbRTara, P0AG45_A6465AlbRLu, P0AG45_A6464AlbRTelar, P0AG45_A6463AlbRLote, P0AG45_A673Piezas, P0AG45_A631Metros, P0AG45_A595Kilos,
            P0AG45_A45AlbRef, P0AG45_A54AlbRPieUti, P0AG45_A52AlbRPieEnt, P0AG45_A56AlbRUni, P0AG45_A60AlbRUniUti, P0AG45_A58AlbRUniEnt, P0AG45_A55AlbRReo, P0AG45_A44AlbRecCod, P0AG45_A361DisCod
            }
            , new Object[] {
            P0AG46_A396EmprCod, P0AG46_A8035AlbMaqTej, P0AG46_A6470AlbRTara, P0AG46_A4602AlbRMdlCod, P0AG46_A6465AlbRLu, P0AG46_A6464AlbRTelar, P0AG46_A6463AlbRLote, P0AG46_A673Piezas, P0AG46_A631Metros, P0AG46_A595Kilos,
            P0AG46_A45AlbRef, P0AG46_A54AlbRPieUti, P0AG46_A52AlbRPieEnt, P0AG46_A56AlbRUni, P0AG46_A60AlbRUniUti, P0AG46_A58AlbRUniEnt, P0AG46_A55AlbRReo, P0AG46_A44AlbRecCod, P0AG46_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV65GXV1 ;
   private int AV10TFAlbRecCod ;
   private int AV11TFAlbRecCod_To ;
   private int AV20TFAlbRPieEnt ;
   private int AV21TFAlbRPieEnt_To ;
   private int AV22TFAlbRPieUti ;
   private int AV23TFAlbRPieUti_To ;
   private int AV30TFPiezas ;
   private int AV31TFPiezas_To ;
   private int AV67Pedidos_disalb____wwds_1_tfalbreccod ;
   private int AV68Pedidos_disalb____wwds_2_tfalbreccod_to ;
   private int AV75Pedidos_disalb____wwds_9_tfalbrpieent ;
   private int AV76Pedidos_disalb____wwds_10_tfalbrpieent_to ;
   private int AV77Pedidos_disalb____wwds_11_tfalbrpieuti ;
   private int AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to ;
   private int AV85Pedidos_disalb____wwds_19_tfpiezas ;
   private int AV86Pedidos_disalb____wwds_20_tfpiezas_to ;
   private int AV69Pedidos_disalb____wwds_3_tfalbrreo_sels_size ;
   private int AV74Pedidos_disalb____wwds_8_tfalbruni_sels_size ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A673Piezas ;
   private int A361DisCod ;
   private int AV44InsertIndex ;
   private long AV50count ;
   private java.math.BigDecimal AV14TFAlbRUniEnt ;
   private java.math.BigDecimal AV15TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV16TFAlbRUniUti ;
   private java.math.BigDecimal AV17TFAlbRUniUti_To ;
   private java.math.BigDecimal AV26TFKilos ;
   private java.math.BigDecimal AV27TFKilos_To ;
   private java.math.BigDecimal AV28TFMetros ;
   private java.math.BigDecimal AV29TFMetros_To ;
   private java.math.BigDecimal AV36TFAlbRLu ;
   private java.math.BigDecimal AV37TFAlbRLu_To ;
   private java.math.BigDecimal AV40TFAlbRTara ;
   private java.math.BigDecimal AV41TFAlbRTara_To ;
   private java.math.BigDecimal AV70Pedidos_disalb____wwds_4_tfalbrunient ;
   private java.math.BigDecimal AV71Pedidos_disalb____wwds_5_tfalbrunient_to ;
   private java.math.BigDecimal AV72Pedidos_disalb____wwds_6_tfalbruniuti ;
   private java.math.BigDecimal AV73Pedidos_disalb____wwds_7_tfalbruniuti_to ;
   private java.math.BigDecimal AV81Pedidos_disalb____wwds_15_tfkilos ;
   private java.math.BigDecimal AV82Pedidos_disalb____wwds_16_tfkilos_to ;
   private java.math.BigDecimal AV83Pedidos_disalb____wwds_17_tfmetros ;
   private java.math.BigDecimal AV84Pedidos_disalb____wwds_18_tfmetros_to ;
   private java.math.BigDecimal AV91Pedidos_disalb____wwds_25_tfalbrlu ;
   private java.math.BigDecimal AV92Pedidos_disalb____wwds_26_tfalbrlu_to ;
   private java.math.BigDecimal AV95Pedidos_disalb____wwds_29_tfalbrtara ;
   private java.math.BigDecimal AV96Pedidos_disalb____wwds_30_tfalbrtara_to ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private String AV24TFAlbRef ;
   private String AV25TFAlbRef_Sel ;
   private String AV32TFAlbRLote ;
   private String AV33TFAlbRLote_Sel ;
   private String AV34TFAlbRTelar ;
   private String AV35TFAlbRTelar_Sel ;
   private String AV38TFAlbRMdlCod ;
   private String AV39TFAlbRMdlCod_Sel ;
   private String AV42TFAlbMaqTej ;
   private String AV43TFAlbMaqTej_Sel ;
   private String A45AlbRef ;
   private String AV79Pedidos_disalb____wwds_13_tfalbref ;
   private String AV80Pedidos_disalb____wwds_14_tfalbref_sel ;
   private String AV87Pedidos_disalb____wwds_21_tfalbrlote ;
   private String AV88Pedidos_disalb____wwds_22_tfalbrlote_sel ;
   private String AV89Pedidos_disalb____wwds_23_tfalbrtelar ;
   private String AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel ;
   private String AV93Pedidos_disalb____wwds_27_tfalbrmdlcod ;
   private String AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ;
   private String AV97Pedidos_disalb____wwds_31_tfalbmaqtej ;
   private String AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel ;
   private String scmdbuf ;
   private String lV79Pedidos_disalb____wwds_13_tfalbref ;
   private String lV87Pedidos_disalb____wwds_21_tfalbrlote ;
   private String lV89Pedidos_disalb____wwds_23_tfalbrtelar ;
   private String lV93Pedidos_disalb____wwds_27_tfalbrmdlcod ;
   private String lV97Pedidos_disalb____wwds_31_tfalbmaqtej ;
   private String A55AlbRReo ;
   private String A56AlbRUni ;
   private String A6463AlbRLote ;
   private String A6464AlbRTelar ;
   private String A4602AlbRMdlCod ;
   private String A8035AlbMaqTej ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAG42 ;
   private boolean brkAG44 ;
   private boolean brkAG46 ;
   private boolean brkAG48 ;
   private boolean brkAG410 ;
   private String AV59OptionsJson ;
   private String AV60OptionsDescJson ;
   private String AV61OptionIndexesJson ;
   private String AV12TFAlbRReo_SelsJson ;
   private String AV18TFAlbRUni_SelsJson ;
   private String AV56DDOName ;
   private String AV57SearchTxt ;
   private String AV58SearchTxtTo ;
   private String AV45Option ;
   private com.genexus.webpanels.WebSession AV51Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P0AG42_A44AlbRecCod ;
   private String[] P0AG42_A396EmprCod ;
   private String[] P0AG42_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P0AG42_A6470AlbRTara ;
   private String[] P0AG42_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] P0AG42_A6465AlbRLu ;
   private String[] P0AG42_A6464AlbRTelar ;
   private String[] P0AG42_A6463AlbRLote ;
   private int[] P0AG42_A673Piezas ;
   private java.math.BigDecimal[] P0AG42_A631Metros ;
   private java.math.BigDecimal[] P0AG42_A595Kilos ;
   private String[] P0AG42_A45AlbRef ;
   private int[] P0AG42_A54AlbRPieUti ;
   private int[] P0AG42_A52AlbRPieEnt ;
   private String[] P0AG42_A56AlbRUni ;
   private java.math.BigDecimal[] P0AG42_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0AG42_A58AlbRUniEnt ;
   private String[] P0AG42_A55AlbRReo ;
   private int[] P0AG42_A361DisCod ;
   private String[] P0AG43_A396EmprCod ;
   private String[] P0AG43_A6463AlbRLote ;
   private String[] P0AG43_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P0AG43_A6470AlbRTara ;
   private String[] P0AG43_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] P0AG43_A6465AlbRLu ;
   private String[] P0AG43_A6464AlbRTelar ;
   private int[] P0AG43_A673Piezas ;
   private java.math.BigDecimal[] P0AG43_A631Metros ;
   private java.math.BigDecimal[] P0AG43_A595Kilos ;
   private String[] P0AG43_A45AlbRef ;
   private int[] P0AG43_A54AlbRPieUti ;
   private int[] P0AG43_A52AlbRPieEnt ;
   private String[] P0AG43_A56AlbRUni ;
   private java.math.BigDecimal[] P0AG43_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0AG43_A58AlbRUniEnt ;
   private String[] P0AG43_A55AlbRReo ;
   private int[] P0AG43_A44AlbRecCod ;
   private int[] P0AG43_A361DisCod ;
   private String[] P0AG44_A396EmprCod ;
   private String[] P0AG44_A6464AlbRTelar ;
   private String[] P0AG44_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P0AG44_A6470AlbRTara ;
   private String[] P0AG44_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] P0AG44_A6465AlbRLu ;
   private String[] P0AG44_A6463AlbRLote ;
   private int[] P0AG44_A673Piezas ;
   private java.math.BigDecimal[] P0AG44_A631Metros ;
   private java.math.BigDecimal[] P0AG44_A595Kilos ;
   private String[] P0AG44_A45AlbRef ;
   private int[] P0AG44_A54AlbRPieUti ;
   private int[] P0AG44_A52AlbRPieEnt ;
   private String[] P0AG44_A56AlbRUni ;
   private java.math.BigDecimal[] P0AG44_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0AG44_A58AlbRUniEnt ;
   private String[] P0AG44_A55AlbRReo ;
   private int[] P0AG44_A44AlbRecCod ;
   private int[] P0AG44_A361DisCod ;
   private String[] P0AG45_A396EmprCod ;
   private String[] P0AG45_A4602AlbRMdlCod ;
   private String[] P0AG45_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P0AG45_A6470AlbRTara ;
   private java.math.BigDecimal[] P0AG45_A6465AlbRLu ;
   private String[] P0AG45_A6464AlbRTelar ;
   private String[] P0AG45_A6463AlbRLote ;
   private int[] P0AG45_A673Piezas ;
   private java.math.BigDecimal[] P0AG45_A631Metros ;
   private java.math.BigDecimal[] P0AG45_A595Kilos ;
   private String[] P0AG45_A45AlbRef ;
   private int[] P0AG45_A54AlbRPieUti ;
   private int[] P0AG45_A52AlbRPieEnt ;
   private String[] P0AG45_A56AlbRUni ;
   private java.math.BigDecimal[] P0AG45_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0AG45_A58AlbRUniEnt ;
   private String[] P0AG45_A55AlbRReo ;
   private int[] P0AG45_A44AlbRecCod ;
   private int[] P0AG45_A361DisCod ;
   private String[] P0AG46_A396EmprCod ;
   private String[] P0AG46_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P0AG46_A6470AlbRTara ;
   private String[] P0AG46_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] P0AG46_A6465AlbRLu ;
   private String[] P0AG46_A6464AlbRTelar ;
   private String[] P0AG46_A6463AlbRLote ;
   private int[] P0AG46_A673Piezas ;
   private java.math.BigDecimal[] P0AG46_A631Metros ;
   private java.math.BigDecimal[] P0AG46_A595Kilos ;
   private String[] P0AG46_A45AlbRef ;
   private int[] P0AG46_A54AlbRPieUti ;
   private int[] P0AG46_A52AlbRPieEnt ;
   private String[] P0AG46_A56AlbRUni ;
   private java.math.BigDecimal[] P0AG46_A60AlbRUniUti ;
   private java.math.BigDecimal[] P0AG46_A58AlbRUniEnt ;
   private String[] P0AG46_A55AlbRReo ;
   private int[] P0AG46_A44AlbRecCod ;
   private int[] P0AG46_A361DisCod ;
   private GXSimpleCollection<String> AV13TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV19TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV69Pedidos_disalb____wwds_3_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV74Pedidos_disalb____wwds_8_tfalbruni_sels ;
   private GXSimpleCollection<String> AV46Options ;
   private GXSimpleCollection<String> AV48OptionsDesc ;
   private GXSimpleCollection<String> AV49OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV53GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV54GridStateFilterValue ;
}

final  class disalb____wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AG42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV69Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV74Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                          int AV67Pedidos_disalb____wwds_1_tfalbreccod ,
                                          int AV68Pedidos_disalb____wwds_2_tfalbreccod_to ,
                                          int AV69Pedidos_disalb____wwds_3_tfalbrreo_sels_size ,
                                          java.math.BigDecimal AV70Pedidos_disalb____wwds_4_tfalbrunient ,
                                          java.math.BigDecimal AV71Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                          java.math.BigDecimal AV72Pedidos_disalb____wwds_6_tfalbruniuti ,
                                          java.math.BigDecimal AV73Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                          int AV74Pedidos_disalb____wwds_8_tfalbruni_sels_size ,
                                          int AV75Pedidos_disalb____wwds_9_tfalbrpieent ,
                                          int AV76Pedidos_disalb____wwds_10_tfalbrpieent_to ,
                                          int AV77Pedidos_disalb____wwds_11_tfalbrpieuti ,
                                          int AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to ,
                                          String AV80Pedidos_disalb____wwds_14_tfalbref_sel ,
                                          String AV79Pedidos_disalb____wwds_13_tfalbref ,
                                          java.math.BigDecimal AV81Pedidos_disalb____wwds_15_tfkilos ,
                                          java.math.BigDecimal AV82Pedidos_disalb____wwds_16_tfkilos_to ,
                                          java.math.BigDecimal AV83Pedidos_disalb____wwds_17_tfmetros ,
                                          java.math.BigDecimal AV84Pedidos_disalb____wwds_18_tfmetros_to ,
                                          int AV85Pedidos_disalb____wwds_19_tfpiezas ,
                                          int AV86Pedidos_disalb____wwds_20_tfpiezas_to ,
                                          String AV88Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                          String AV87Pedidos_disalb____wwds_21_tfalbrlote ,
                                          String AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                          String AV89Pedidos_disalb____wwds_23_tfalbrtelar ,
                                          java.math.BigDecimal AV91Pedidos_disalb____wwds_25_tfalbrlu ,
                                          java.math.BigDecimal AV92Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                          String AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                          String AV93Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                          java.math.BigDecimal AV95Pedidos_disalb____wwds_29_tfalbrtara ,
                                          java.math.BigDecimal AV96Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                          String AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                          String AV97Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A45AlbRef ,
                                          java.math.BigDecimal A595Kilos ,
                                          java.math.BigDecimal A631Metros ,
                                          int A673Piezas ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[30];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.AlbRecCod, T1.EmprCod, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRMdlCod, T2.AlbRLu, T2.AlbRTelar, T2.AlbRLote, T1.Piezas, T1.Metros, T1.Kilos, T2.AlbRef, T2.AlbRPieUti," ;
      scmdbuf += " T2.AlbRPieEnt, T2.AlbRUni, T2.AlbRUniUti, T2.AlbRUniEnt, T2.AlbRReo, T1.DisCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod" ;
      scmdbuf += " = T1.AlbRecCod)" ;
      if ( ! (0==AV67Pedidos_disalb____wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidos_disalb____wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( AV69Pedidos_disalb____wwds_3_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Pedidos_disalb____wwds_3_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Pedidos_disalb____wwds_4_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Pedidos_disalb____wwds_5_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidos_disalb____wwds_6_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidos_disalb____wwds_7_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( AV74Pedidos_disalb____wwds_8_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Pedidos_disalb____wwds_8_tfalbruni_sels, "T2.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV75Pedidos_disalb____wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidos_disalb____wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidos_disalb____wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Pedidos_disalb____wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidos_disalb____wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidos_disalb____wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Pedidos_disalb____wwds_15_tfkilos)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Pedidos_disalb____wwds_16_tfkilos_to)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidos_disalb____wwds_17_tfmetros)==0) )
      {
         addWhere(sWhereString, "(T1.Metros >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidos_disalb____wwds_18_tfmetros_to)==0) )
      {
         addWhere(sWhereString, "(T1.Metros <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_disalb____wwds_19_tfpiezas) )
      {
         addWhere(sWhereString, "(T1.Piezas >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_disalb____wwds_20_tfpiezas_to) )
      {
         addWhere(sWhereString, "(T1.Piezas <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_disalb____wwds_21_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_disalb____wwds_23_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Pedidos_disalb____wwds_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Pedidos_disalb____wwds_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidos_disalb____wwds_27_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Pedidos_disalb____wwds_29_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Pedidos_disalb____wwds_30_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_disalb____wwds_31_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AG43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV69Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV74Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                          int AV67Pedidos_disalb____wwds_1_tfalbreccod ,
                                          int AV68Pedidos_disalb____wwds_2_tfalbreccod_to ,
                                          int AV69Pedidos_disalb____wwds_3_tfalbrreo_sels_size ,
                                          java.math.BigDecimal AV70Pedidos_disalb____wwds_4_tfalbrunient ,
                                          java.math.BigDecimal AV71Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                          java.math.BigDecimal AV72Pedidos_disalb____wwds_6_tfalbruniuti ,
                                          java.math.BigDecimal AV73Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                          int AV74Pedidos_disalb____wwds_8_tfalbruni_sels_size ,
                                          int AV75Pedidos_disalb____wwds_9_tfalbrpieent ,
                                          int AV76Pedidos_disalb____wwds_10_tfalbrpieent_to ,
                                          int AV77Pedidos_disalb____wwds_11_tfalbrpieuti ,
                                          int AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to ,
                                          String AV80Pedidos_disalb____wwds_14_tfalbref_sel ,
                                          String AV79Pedidos_disalb____wwds_13_tfalbref ,
                                          java.math.BigDecimal AV81Pedidos_disalb____wwds_15_tfkilos ,
                                          java.math.BigDecimal AV82Pedidos_disalb____wwds_16_tfkilos_to ,
                                          java.math.BigDecimal AV83Pedidos_disalb____wwds_17_tfmetros ,
                                          java.math.BigDecimal AV84Pedidos_disalb____wwds_18_tfmetros_to ,
                                          int AV85Pedidos_disalb____wwds_19_tfpiezas ,
                                          int AV86Pedidos_disalb____wwds_20_tfpiezas_to ,
                                          String AV88Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                          String AV87Pedidos_disalb____wwds_21_tfalbrlote ,
                                          String AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                          String AV89Pedidos_disalb____wwds_23_tfalbrtelar ,
                                          java.math.BigDecimal AV91Pedidos_disalb____wwds_25_tfalbrlu ,
                                          java.math.BigDecimal AV92Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                          String AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                          String AV93Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                          java.math.BigDecimal AV95Pedidos_disalb____wwds_29_tfalbrtara ,
                                          java.math.BigDecimal AV96Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                          String AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                          String AV97Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A45AlbRef ,
                                          java.math.BigDecimal A595Kilos ,
                                          java.math.BigDecimal A631Metros ,
                                          int A673Piezas ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[30];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.AlbRLote, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRMdlCod, T2.AlbRLu, T2.AlbRTelar, T1.Piezas, T1.Metros, T1.Kilos, T2.AlbRef, T2.AlbRPieUti, T2.AlbRPieEnt," ;
      scmdbuf += " T2.AlbRUni, T2.AlbRUniUti, T2.AlbRUniEnt, T2.AlbRReo, T1.AlbRecCod, T1.DisCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod" ;
      scmdbuf += " = T1.AlbRecCod)" ;
      if ( ! (0==AV67Pedidos_disalb____wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidos_disalb____wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( AV69Pedidos_disalb____wwds_3_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Pedidos_disalb____wwds_3_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Pedidos_disalb____wwds_4_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Pedidos_disalb____wwds_5_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidos_disalb____wwds_6_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidos_disalb____wwds_7_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( AV74Pedidos_disalb____wwds_8_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Pedidos_disalb____wwds_8_tfalbruni_sels, "T2.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV75Pedidos_disalb____wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidos_disalb____wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidos_disalb____wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Pedidos_disalb____wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidos_disalb____wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidos_disalb____wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Pedidos_disalb____wwds_15_tfkilos)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Pedidos_disalb____wwds_16_tfkilos_to)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidos_disalb____wwds_17_tfmetros)==0) )
      {
         addWhere(sWhereString, "(T1.Metros >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidos_disalb____wwds_18_tfmetros_to)==0) )
      {
         addWhere(sWhereString, "(T1.Metros <= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_disalb____wwds_19_tfpiezas) )
      {
         addWhere(sWhereString, "(T1.Piezas >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_disalb____wwds_20_tfpiezas_to) )
      {
         addWhere(sWhereString, "(T1.Piezas <= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_disalb____wwds_21_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_disalb____wwds_23_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Pedidos_disalb____wwds_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Pedidos_disalb____wwds_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidos_disalb____wwds_27_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Pedidos_disalb____wwds_29_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Pedidos_disalb____wwds_30_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_disalb____wwds_31_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbRLote" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0AG44( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV69Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV74Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                          int AV67Pedidos_disalb____wwds_1_tfalbreccod ,
                                          int AV68Pedidos_disalb____wwds_2_tfalbreccod_to ,
                                          int AV69Pedidos_disalb____wwds_3_tfalbrreo_sels_size ,
                                          java.math.BigDecimal AV70Pedidos_disalb____wwds_4_tfalbrunient ,
                                          java.math.BigDecimal AV71Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                          java.math.BigDecimal AV72Pedidos_disalb____wwds_6_tfalbruniuti ,
                                          java.math.BigDecimal AV73Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                          int AV74Pedidos_disalb____wwds_8_tfalbruni_sels_size ,
                                          int AV75Pedidos_disalb____wwds_9_tfalbrpieent ,
                                          int AV76Pedidos_disalb____wwds_10_tfalbrpieent_to ,
                                          int AV77Pedidos_disalb____wwds_11_tfalbrpieuti ,
                                          int AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to ,
                                          String AV80Pedidos_disalb____wwds_14_tfalbref_sel ,
                                          String AV79Pedidos_disalb____wwds_13_tfalbref ,
                                          java.math.BigDecimal AV81Pedidos_disalb____wwds_15_tfkilos ,
                                          java.math.BigDecimal AV82Pedidos_disalb____wwds_16_tfkilos_to ,
                                          java.math.BigDecimal AV83Pedidos_disalb____wwds_17_tfmetros ,
                                          java.math.BigDecimal AV84Pedidos_disalb____wwds_18_tfmetros_to ,
                                          int AV85Pedidos_disalb____wwds_19_tfpiezas ,
                                          int AV86Pedidos_disalb____wwds_20_tfpiezas_to ,
                                          String AV88Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                          String AV87Pedidos_disalb____wwds_21_tfalbrlote ,
                                          String AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                          String AV89Pedidos_disalb____wwds_23_tfalbrtelar ,
                                          java.math.BigDecimal AV91Pedidos_disalb____wwds_25_tfalbrlu ,
                                          java.math.BigDecimal AV92Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                          String AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                          String AV93Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                          java.math.BigDecimal AV95Pedidos_disalb____wwds_29_tfalbrtara ,
                                          java.math.BigDecimal AV96Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                          String AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                          String AV97Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A45AlbRef ,
                                          java.math.BigDecimal A595Kilos ,
                                          java.math.BigDecimal A631Metros ,
                                          int A673Piezas ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[30];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.AlbRTelar, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRMdlCod, T2.AlbRLu, T2.AlbRLote, T1.Piezas, T1.Metros, T1.Kilos, T2.AlbRef, T2.AlbRPieUti, T2.AlbRPieEnt," ;
      scmdbuf += " T2.AlbRUni, T2.AlbRUniUti, T2.AlbRUniEnt, T2.AlbRReo, T1.AlbRecCod, T1.DisCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod" ;
      scmdbuf += " = T1.AlbRecCod)" ;
      if ( ! (0==AV67Pedidos_disalb____wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidos_disalb____wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( AV69Pedidos_disalb____wwds_3_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Pedidos_disalb____wwds_3_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Pedidos_disalb____wwds_4_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Pedidos_disalb____wwds_5_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidos_disalb____wwds_6_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidos_disalb____wwds_7_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( AV74Pedidos_disalb____wwds_8_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Pedidos_disalb____wwds_8_tfalbruni_sels, "T2.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV75Pedidos_disalb____wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidos_disalb____wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidos_disalb____wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Pedidos_disalb____wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidos_disalb____wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidos_disalb____wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Pedidos_disalb____wwds_15_tfkilos)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Pedidos_disalb____wwds_16_tfkilos_to)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidos_disalb____wwds_17_tfmetros)==0) )
      {
         addWhere(sWhereString, "(T1.Metros >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidos_disalb____wwds_18_tfmetros_to)==0) )
      {
         addWhere(sWhereString, "(T1.Metros <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_disalb____wwds_19_tfpiezas) )
      {
         addWhere(sWhereString, "(T1.Piezas >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_disalb____wwds_20_tfpiezas_to) )
      {
         addWhere(sWhereString, "(T1.Piezas <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_disalb____wwds_21_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_disalb____wwds_23_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Pedidos_disalb____wwds_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Pedidos_disalb____wwds_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidos_disalb____wwds_27_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Pedidos_disalb____wwds_29_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Pedidos_disalb____wwds_30_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_disalb____wwds_31_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbRTelar" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0AG45( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV69Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV74Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                          int AV67Pedidos_disalb____wwds_1_tfalbreccod ,
                                          int AV68Pedidos_disalb____wwds_2_tfalbreccod_to ,
                                          int AV69Pedidos_disalb____wwds_3_tfalbrreo_sels_size ,
                                          java.math.BigDecimal AV70Pedidos_disalb____wwds_4_tfalbrunient ,
                                          java.math.BigDecimal AV71Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                          java.math.BigDecimal AV72Pedidos_disalb____wwds_6_tfalbruniuti ,
                                          java.math.BigDecimal AV73Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                          int AV74Pedidos_disalb____wwds_8_tfalbruni_sels_size ,
                                          int AV75Pedidos_disalb____wwds_9_tfalbrpieent ,
                                          int AV76Pedidos_disalb____wwds_10_tfalbrpieent_to ,
                                          int AV77Pedidos_disalb____wwds_11_tfalbrpieuti ,
                                          int AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to ,
                                          String AV80Pedidos_disalb____wwds_14_tfalbref_sel ,
                                          String AV79Pedidos_disalb____wwds_13_tfalbref ,
                                          java.math.BigDecimal AV81Pedidos_disalb____wwds_15_tfkilos ,
                                          java.math.BigDecimal AV82Pedidos_disalb____wwds_16_tfkilos_to ,
                                          java.math.BigDecimal AV83Pedidos_disalb____wwds_17_tfmetros ,
                                          java.math.BigDecimal AV84Pedidos_disalb____wwds_18_tfmetros_to ,
                                          int AV85Pedidos_disalb____wwds_19_tfpiezas ,
                                          int AV86Pedidos_disalb____wwds_20_tfpiezas_to ,
                                          String AV88Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                          String AV87Pedidos_disalb____wwds_21_tfalbrlote ,
                                          String AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                          String AV89Pedidos_disalb____wwds_23_tfalbrtelar ,
                                          java.math.BigDecimal AV91Pedidos_disalb____wwds_25_tfalbrlu ,
                                          java.math.BigDecimal AV92Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                          String AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                          String AV93Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                          java.math.BigDecimal AV95Pedidos_disalb____wwds_29_tfalbrtara ,
                                          java.math.BigDecimal AV96Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                          String AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                          String AV97Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A45AlbRef ,
                                          java.math.BigDecimal A595Kilos ,
                                          java.math.BigDecimal A631Metros ,
                                          int A673Piezas ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[30];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.AlbRMdlCod, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRLu, T2.AlbRTelar, T2.AlbRLote, T1.Piezas, T1.Metros, T1.Kilos, T2.AlbRef, T2.AlbRPieUti, T2.AlbRPieEnt," ;
      scmdbuf += " T2.AlbRUni, T2.AlbRUniUti, T2.AlbRUniEnt, T2.AlbRReo, T1.AlbRecCod, T1.DisCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod" ;
      scmdbuf += " = T1.AlbRecCod)" ;
      if ( ! (0==AV67Pedidos_disalb____wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidos_disalb____wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( AV69Pedidos_disalb____wwds_3_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Pedidos_disalb____wwds_3_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Pedidos_disalb____wwds_4_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Pedidos_disalb____wwds_5_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidos_disalb____wwds_6_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidos_disalb____wwds_7_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( AV74Pedidos_disalb____wwds_8_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Pedidos_disalb____wwds_8_tfalbruni_sels, "T2.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV75Pedidos_disalb____wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidos_disalb____wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidos_disalb____wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Pedidos_disalb____wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidos_disalb____wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidos_disalb____wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Pedidos_disalb____wwds_15_tfkilos)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Pedidos_disalb____wwds_16_tfkilos_to)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidos_disalb____wwds_17_tfmetros)==0) )
      {
         addWhere(sWhereString, "(T1.Metros >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidos_disalb____wwds_18_tfmetros_to)==0) )
      {
         addWhere(sWhereString, "(T1.Metros <= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_disalb____wwds_19_tfpiezas) )
      {
         addWhere(sWhereString, "(T1.Piezas >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_disalb____wwds_20_tfpiezas_to) )
      {
         addWhere(sWhereString, "(T1.Piezas <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_disalb____wwds_21_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_disalb____wwds_23_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Pedidos_disalb____wwds_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Pedidos_disalb____wwds_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidos_disalb____wwds_27_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Pedidos_disalb____wwds_29_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Pedidos_disalb____wwds_30_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_disalb____wwds_31_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbRMdlCod" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P0AG46( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV69Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV74Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                          int AV67Pedidos_disalb____wwds_1_tfalbreccod ,
                                          int AV68Pedidos_disalb____wwds_2_tfalbreccod_to ,
                                          int AV69Pedidos_disalb____wwds_3_tfalbrreo_sels_size ,
                                          java.math.BigDecimal AV70Pedidos_disalb____wwds_4_tfalbrunient ,
                                          java.math.BigDecimal AV71Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                          java.math.BigDecimal AV72Pedidos_disalb____wwds_6_tfalbruniuti ,
                                          java.math.BigDecimal AV73Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                          int AV74Pedidos_disalb____wwds_8_tfalbruni_sels_size ,
                                          int AV75Pedidos_disalb____wwds_9_tfalbrpieent ,
                                          int AV76Pedidos_disalb____wwds_10_tfalbrpieent_to ,
                                          int AV77Pedidos_disalb____wwds_11_tfalbrpieuti ,
                                          int AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to ,
                                          String AV80Pedidos_disalb____wwds_14_tfalbref_sel ,
                                          String AV79Pedidos_disalb____wwds_13_tfalbref ,
                                          java.math.BigDecimal AV81Pedidos_disalb____wwds_15_tfkilos ,
                                          java.math.BigDecimal AV82Pedidos_disalb____wwds_16_tfkilos_to ,
                                          java.math.BigDecimal AV83Pedidos_disalb____wwds_17_tfmetros ,
                                          java.math.BigDecimal AV84Pedidos_disalb____wwds_18_tfmetros_to ,
                                          int AV85Pedidos_disalb____wwds_19_tfpiezas ,
                                          int AV86Pedidos_disalb____wwds_20_tfpiezas_to ,
                                          String AV88Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                          String AV87Pedidos_disalb____wwds_21_tfalbrlote ,
                                          String AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                          String AV89Pedidos_disalb____wwds_23_tfalbrtelar ,
                                          java.math.BigDecimal AV91Pedidos_disalb____wwds_25_tfalbrlu ,
                                          java.math.BigDecimal AV92Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                          String AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                          String AV93Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                          java.math.BigDecimal AV95Pedidos_disalb____wwds_29_tfalbrtara ,
                                          java.math.BigDecimal AV96Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                          String AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                          String AV97Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A45AlbRef ,
                                          java.math.BigDecimal A595Kilos ,
                                          java.math.BigDecimal A631Metros ,
                                          int A673Piezas ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[30];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRMdlCod, T2.AlbRLu, T2.AlbRTelar, T2.AlbRLote, T1.Piezas, T1.Metros, T1.Kilos, T2.AlbRef, T2.AlbRPieUti, T2.AlbRPieEnt," ;
      scmdbuf += " T2.AlbRUni, T2.AlbRUniUti, T2.AlbRUniEnt, T2.AlbRReo, T1.AlbRecCod, T1.DisCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod" ;
      scmdbuf += " = T1.AlbRecCod)" ;
      if ( ! (0==AV67Pedidos_disalb____wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidos_disalb____wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( AV69Pedidos_disalb____wwds_3_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV69Pedidos_disalb____wwds_3_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Pedidos_disalb____wwds_4_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Pedidos_disalb____wwds_5_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidos_disalb____wwds_6_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidos_disalb____wwds_7_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( AV74Pedidos_disalb____wwds_8_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Pedidos_disalb____wwds_8_tfalbruni_sels, "T2.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV75Pedidos_disalb____wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidos_disalb____wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidos_disalb____wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV78Pedidos_disalb____wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Pedidos_disalb____wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidos_disalb____wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidos_disalb____wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Pedidos_disalb____wwds_15_tfkilos)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Pedidos_disalb____wwds_16_tfkilos_to)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Pedidos_disalb____wwds_17_tfmetros)==0) )
      {
         addWhere(sWhereString, "(T1.Metros >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Pedidos_disalb____wwds_18_tfmetros_to)==0) )
      {
         addWhere(sWhereString, "(T1.Metros <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV85Pedidos_disalb____wwds_19_tfpiezas) )
      {
         addWhere(sWhereString, "(T1.Piezas >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (0==AV86Pedidos_disalb____wwds_20_tfpiezas_to) )
      {
         addWhere(sWhereString, "(T1.Piezas <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV87Pedidos_disalb____wwds_21_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_disalb____wwds_23_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Pedidos_disalb____wwds_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Pedidos_disalb____wwds_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV93Pedidos_disalb____wwds_27_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Pedidos_disalb____wwds_29_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Pedidos_disalb____wwds_30_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_disalb____wwds_31_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.AlbMaqTej" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P0AG42(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] );
            case 1 :
                  return conditional_P0AG43(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] );
            case 2 :
                  return conditional_P0AG44(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] );
            case 3 :
                  return conditional_P0AG45(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] );
            case 4 :
                  return conditional_P0AG46(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AG42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AG43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AG44", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AG45", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AG46", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[17])[0] = rslt.getString(18, 2);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 2);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 2);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 2);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[16])[0] = rslt.getString(17, 2);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((int[]) buf[18])[0] = rslt.getInt(19);
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
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 12);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 12);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 12);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 12);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 12);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 12);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 12);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 12);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 12);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 12);
               }
               return;
      }
   }

}

