package app.almacensindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodeprocedenciastejido_wcgetfilterdata extends GXProcedure
{
   public listadodeprocedenciastejido_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeprocedenciastejido_wcgetfilterdata.class ), "" );
   }

   public listadodeprocedenciastejido_wcgetfilterdata( int remoteHandle ,
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
      listadodeprocedenciastejido_wcgetfilterdata.this.aP5 = new String[] {""};
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
      listadodeprocedenciastejido_wcgetfilterdata.this.AV38DDOName = aP0;
      listadodeprocedenciastejido_wcgetfilterdata.this.AV36SearchTxt = aP1;
      listadodeprocedenciastejido_wcgetfilterdata.this.AV37SearchTxtTo = aP2;
      listadodeprocedenciastejido_wcgetfilterdata.this.aP3 = aP3;
      listadodeprocedenciastejido_wcgetfilterdata.this.aP4 = aP4;
      listadodeprocedenciastejido_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCENOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCENOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCENIF") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCENIFOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCEDOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCEDOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCEPOB") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCEPOBOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PRVDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVDSCOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_POCECP") == 0 )
      {
         /* Execute user subroutine: 'LOADPOCECPOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_POCECP2") == 0 )
      {
         /* Execute user subroutine: 'LOADPOCECP2OPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCETEL1") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCETEL1OPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCETEL2") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCETEL2OPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROCETELEX") == 0 )
      {
         /* Execute user subroutine: 'LOADPROCETELEXOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROPERS") == 0 )
      {
         /* Execute user subroutine: 'LOADPROPERSOPTIONS' */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_PROEMAIL") == 0 )
      {
         /* Execute user subroutine: 'LOADPROEMAILOPTIONS' */
         S231 ();
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
      if ( GXutil.strcmp(AV49Session.getValue("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AlmacenSinDetalle.ListadodeProcedenciasTejido_WCGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("AlmacenSinDetalle.ListadodeProcedenciasTejido_WCGridState"), null, null);
      }
      AV62GXV1 = 1 ;
      while ( AV62GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV62GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV54FilterFullText = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV10TFProceCod = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFProceCod_To = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV12TFProceNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV13TFProceNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF") == 0 )
         {
            AV14TFProceNif = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF_SEL") == 0 )
         {
            AV15TFProceNif_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM") == 0 )
         {
            AV16TFProceDom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM_SEL") == 0 )
         {
            AV17TFProceDom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB") == 0 )
         {
            AV18TFProcePob = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB_SEL") == 0 )
         {
            AV19TFProcePob_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV20TFPrvCod = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFPrvCod_To = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV22TFPrvDsc = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV23TFPrvDsc_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP") == 0 )
         {
            AV24TFPoceCp = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP_SEL") == 0 )
         {
            AV25TFPoceCp_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2") == 0 )
         {
            AV58TFPoceCp2 = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2_SEL") == 0 )
         {
            AV59TFPoceCp2_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1") == 0 )
         {
            AV26TFProceTel1 = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1_SEL") == 0 )
         {
            AV27TFProceTel1_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2") == 0 )
         {
            AV28TFProceTel2 = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2_SEL") == 0 )
         {
            AV29TFProceTel2_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX") == 0 )
         {
            AV30TFProceTelex = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX_SEL") == 0 )
         {
            AV31TFProceTelex_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS") == 0 )
         {
            AV32TFProPers = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS_SEL") == 0 )
         {
            AV33TFProPers_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL") == 0 )
         {
            AV34TFProEmail = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL_SEL") == 0 )
         {
            AV35TFProEmail_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55Emprcod = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCECODFROM") == 0 )
         {
            AV56Procecodfrom = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCECODTO") == 0 )
         {
            AV57Procecodto = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV62GXV1 = (int)(AV62GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROCENOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProceNom = AV36SearchTxt ;
      AV13TFProceNom_Sel = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV55Emprcod ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV54FilterFullText ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV10TFProceCod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV11TFProceCod_To ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV12TFProceNom ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV13TFProceNom_Sel ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV14TFProceNif ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV16TFProceDom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV18TFProcePob ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV20TFPrvCod ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV21TFPrvCod_To ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV22TFPrvDsc ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV24TFPoceCp ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV58TFPoceCp2 ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV59TFPoceCp2_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV26TFProceTel1 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV28TFProceTel2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV30TFProceTelex ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV32TFProPers ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV33TFProPers_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV34TFProEmail ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV35TFProEmail_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV56Procecodfrom) ,
                                           Short.valueOf(AV57Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HG2 */
      pr_default.execute(0, new Object[] {AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV56Procecodfrom), Short.valueOf(AV57Procecodto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9HG2 = false ;
         A396EmprCod = P09HG2_A396EmprCod[0] ;
         A971ProceNom = P09HG2_A971ProceNom[0] ;
         n971ProceNom = P09HG2_n971ProceNom[0] ;
         A10391ProEmail = P09HG2_A10391ProEmail[0] ;
         n10391ProEmail = P09HG2_n10391ProEmail[0] ;
         A10390ProPers = P09HG2_A10390ProPers[0] ;
         n10390ProPers = P09HG2_n10390ProPers[0] ;
         A992ProceTelex = P09HG2_A992ProceTelex[0] ;
         n992ProceTelex = P09HG2_n992ProceTelex[0] ;
         A991ProceTel2 = P09HG2_A991ProceTel2[0] ;
         n991ProceTel2 = P09HG2_n991ProceTel2[0] ;
         A990ProceTel1 = P09HG2_A990ProceTel1[0] ;
         n990ProceTel1 = P09HG2_n990ProceTel1[0] ;
         A14029PoceCp2 = P09HG2_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HG2_n14029PoceCp2[0] ;
         A989PoceCp = P09HG2_A989PoceCp[0] ;
         n989PoceCp = P09HG2_n989PoceCp[0] ;
         A787PrvDsc = P09HG2_A787PrvDsc[0] ;
         n787PrvDsc = P09HG2_n787PrvDsc[0] ;
         A781PrvCod = P09HG2_A781PrvCod[0] ;
         n781PrvCod = P09HG2_n781PrvCod[0] ;
         A988ProcePob = P09HG2_A988ProcePob[0] ;
         n988ProcePob = P09HG2_n988ProcePob[0] ;
         A994ProceDom = P09HG2_A994ProceDom[0] ;
         n994ProceDom = P09HG2_n994ProceDom[0] ;
         A993ProceNif = P09HG2_A993ProceNif[0] ;
         n993ProceNif = P09HG2_n993ProceNif[0] ;
         A970ProceCod = P09HG2_A970ProceCod[0] ;
         A787PrvDsc = P09HG2_A787PrvDsc[0] ;
         n787PrvDsc = P09HG2_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09HG2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09HG2_A971ProceNom[0], A971ProceNom) == 0 ) )
         {
            brk9HG2 = false ;
            A970ProceCod = P09HG2_A970ProceCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9HG2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A971ProceNom)==0) )
         {
            AV40Option = A971ProceNom ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HG2 )
         {
            brk9HG2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROCENIFOPTIONS' Routine */
      returnInSub = false ;
      AV14TFProceNif = AV36SearchTxt ;
      AV15TFProceNif_Sel = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV55Emprcod ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV54FilterFullText ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV10TFProceCod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV11TFProceCod_To ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV12TFProceNom ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV13TFProceNom_Sel ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV14TFProceNif ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV16TFProceDom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV18TFProcePob ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV20TFPrvCod ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV21TFPrvCod_To ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV22TFPrvDsc ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV24TFPoceCp ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV58TFPoceCp2 ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV59TFPoceCp2_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV26TFProceTel1 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV28TFProceTel2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV30TFProceTelex ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV32TFProPers ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV33TFProPers_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV34TFProEmail ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV35TFProEmail_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV56Procecodfrom) ,
                                           Short.valueOf(AV57Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HG3 */
      pr_default.execute(1, new Object[] {AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV56Procecodfrom), Short.valueOf(AV57Procecodto)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9HG4 = false ;
         A396EmprCod = P09HG3_A396EmprCod[0] ;
         A993ProceNif = P09HG3_A993ProceNif[0] ;
         n993ProceNif = P09HG3_n993ProceNif[0] ;
         A10391ProEmail = P09HG3_A10391ProEmail[0] ;
         n10391ProEmail = P09HG3_n10391ProEmail[0] ;
         A10390ProPers = P09HG3_A10390ProPers[0] ;
         n10390ProPers = P09HG3_n10390ProPers[0] ;
         A992ProceTelex = P09HG3_A992ProceTelex[0] ;
         n992ProceTelex = P09HG3_n992ProceTelex[0] ;
         A991ProceTel2 = P09HG3_A991ProceTel2[0] ;
         n991ProceTel2 = P09HG3_n991ProceTel2[0] ;
         A990ProceTel1 = P09HG3_A990ProceTel1[0] ;
         n990ProceTel1 = P09HG3_n990ProceTel1[0] ;
         A14029PoceCp2 = P09HG3_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HG3_n14029PoceCp2[0] ;
         A989PoceCp = P09HG3_A989PoceCp[0] ;
         n989PoceCp = P09HG3_n989PoceCp[0] ;
         A787PrvDsc = P09HG3_A787PrvDsc[0] ;
         n787PrvDsc = P09HG3_n787PrvDsc[0] ;
         A781PrvCod = P09HG3_A781PrvCod[0] ;
         n781PrvCod = P09HG3_n781PrvCod[0] ;
         A988ProcePob = P09HG3_A988ProcePob[0] ;
         n988ProcePob = P09HG3_n988ProcePob[0] ;
         A994ProceDom = P09HG3_A994ProceDom[0] ;
         n994ProceDom = P09HG3_n994ProceDom[0] ;
         A971ProceNom = P09HG3_A971ProceNom[0] ;
         n971ProceNom = P09HG3_n971ProceNom[0] ;
         A970ProceCod = P09HG3_A970ProceCod[0] ;
         A787PrvDsc = P09HG3_A787PrvDsc[0] ;
         n787PrvDsc = P09HG3_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09HG3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09HG3_A993ProceNif[0], A993ProceNif) == 0 ) )
         {
            brk9HG4 = false ;
            A970ProceCod = P09HG3_A970ProceCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9HG4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A993ProceNif)==0) )
         {
            AV40Option = A993ProceNif ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HG4 )
         {
            brk9HG4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPROCEDOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFProceDom = AV36SearchTxt ;
      AV17TFProceDom_Sel = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV55Emprcod ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV54FilterFullText ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV10TFProceCod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV11TFProceCod_To ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV12TFProceNom ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV13TFProceNom_Sel ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV14TFProceNif ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV16TFProceDom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV18TFProcePob ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV20TFPrvCod ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV21TFPrvCod_To ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV22TFPrvDsc ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV24TFPoceCp ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV58TFPoceCp2 ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV59TFPoceCp2_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV26TFProceTel1 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV28TFProceTel2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV30TFProceTelex ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV32TFProPers ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV33TFProPers_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV34TFProEmail ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV35TFProEmail_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV56Procecodfrom) ,
                                           Short.valueOf(AV57Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HG4 */
      pr_default.execute(2, new Object[] {AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV56Procecodfrom), Short.valueOf(AV57Procecodto)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9HG6 = false ;
         A396EmprCod = P09HG4_A396EmprCod[0] ;
         A994ProceDom = P09HG4_A994ProceDom[0] ;
         n994ProceDom = P09HG4_n994ProceDom[0] ;
         A10391ProEmail = P09HG4_A10391ProEmail[0] ;
         n10391ProEmail = P09HG4_n10391ProEmail[0] ;
         A10390ProPers = P09HG4_A10390ProPers[0] ;
         n10390ProPers = P09HG4_n10390ProPers[0] ;
         A992ProceTelex = P09HG4_A992ProceTelex[0] ;
         n992ProceTelex = P09HG4_n992ProceTelex[0] ;
         A991ProceTel2 = P09HG4_A991ProceTel2[0] ;
         n991ProceTel2 = P09HG4_n991ProceTel2[0] ;
         A990ProceTel1 = P09HG4_A990ProceTel1[0] ;
         n990ProceTel1 = P09HG4_n990ProceTel1[0] ;
         A14029PoceCp2 = P09HG4_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HG4_n14029PoceCp2[0] ;
         A989PoceCp = P09HG4_A989PoceCp[0] ;
         n989PoceCp = P09HG4_n989PoceCp[0] ;
         A787PrvDsc = P09HG4_A787PrvDsc[0] ;
         n787PrvDsc = P09HG4_n787PrvDsc[0] ;
         A781PrvCod = P09HG4_A781PrvCod[0] ;
         n781PrvCod = P09HG4_n781PrvCod[0] ;
         A988ProcePob = P09HG4_A988ProcePob[0] ;
         n988ProcePob = P09HG4_n988ProcePob[0] ;
         A993ProceNif = P09HG4_A993ProceNif[0] ;
         n993ProceNif = P09HG4_n993ProceNif[0] ;
         A971ProceNom = P09HG4_A971ProceNom[0] ;
         n971ProceNom = P09HG4_n971ProceNom[0] ;
         A970ProceCod = P09HG4_A970ProceCod[0] ;
         A787PrvDsc = P09HG4_A787PrvDsc[0] ;
         n787PrvDsc = P09HG4_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09HG4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09HG4_A994ProceDom[0], A994ProceDom) == 0 ) )
         {
            brk9HG6 = false ;
            A970ProceCod = P09HG4_A970ProceCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9HG6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A994ProceDom)==0) )
         {
            AV40Option = A994ProceDom ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HG6 )
         {
            brk9HG6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPROCEPOBOPTIONS' Routine */
      returnInSub = false ;
      AV18TFProcePob = AV36SearchTxt ;
      AV19TFProcePob_Sel = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV55Emprcod ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV54FilterFullText ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV10TFProceCod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV11TFProceCod_To ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV12TFProceNom ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV13TFProceNom_Sel ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV14TFProceNif ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV16TFProceDom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV18TFProcePob ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV20TFPrvCod ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV21TFPrvCod_To ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV22TFPrvDsc ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV24TFPoceCp ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV58TFPoceCp2 ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV59TFPoceCp2_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV26TFProceTel1 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV28TFProceTel2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV30TFProceTelex ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV32TFProPers ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV33TFProPers_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV34TFProEmail ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV35TFProEmail_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV56Procecodfrom) ,
                                           Short.valueOf(AV57Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HG5 */
      pr_default.execute(3, new Object[] {AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV56Procecodfrom), Short.valueOf(AV57Procecodto)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9HG8 = false ;
         A396EmprCod = P09HG5_A396EmprCod[0] ;
         A988ProcePob = P09HG5_A988ProcePob[0] ;
         n988ProcePob = P09HG5_n988ProcePob[0] ;
         A10391ProEmail = P09HG5_A10391ProEmail[0] ;
         n10391ProEmail = P09HG5_n10391ProEmail[0] ;
         A10390ProPers = P09HG5_A10390ProPers[0] ;
         n10390ProPers = P09HG5_n10390ProPers[0] ;
         A992ProceTelex = P09HG5_A992ProceTelex[0] ;
         n992ProceTelex = P09HG5_n992ProceTelex[0] ;
         A991ProceTel2 = P09HG5_A991ProceTel2[0] ;
         n991ProceTel2 = P09HG5_n991ProceTel2[0] ;
         A990ProceTel1 = P09HG5_A990ProceTel1[0] ;
         n990ProceTel1 = P09HG5_n990ProceTel1[0] ;
         A14029PoceCp2 = P09HG5_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HG5_n14029PoceCp2[0] ;
         A989PoceCp = P09HG5_A989PoceCp[0] ;
         n989PoceCp = P09HG5_n989PoceCp[0] ;
         A787PrvDsc = P09HG5_A787PrvDsc[0] ;
         n787PrvDsc = P09HG5_n787PrvDsc[0] ;
         A781PrvCod = P09HG5_A781PrvCod[0] ;
         n781PrvCod = P09HG5_n781PrvCod[0] ;
         A994ProceDom = P09HG5_A994ProceDom[0] ;
         n994ProceDom = P09HG5_n994ProceDom[0] ;
         A993ProceNif = P09HG5_A993ProceNif[0] ;
         n993ProceNif = P09HG5_n993ProceNif[0] ;
         A971ProceNom = P09HG5_A971ProceNom[0] ;
         n971ProceNom = P09HG5_n971ProceNom[0] ;
         A970ProceCod = P09HG5_A970ProceCod[0] ;
         A787PrvDsc = P09HG5_A787PrvDsc[0] ;
         n787PrvDsc = P09HG5_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09HG5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09HG5_A988ProcePob[0], A988ProcePob) == 0 ) )
         {
            brk9HG8 = false ;
            A970ProceCod = P09HG5_A970ProceCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9HG8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A988ProcePob)==0) )
         {
            AV40Option = A988ProcePob ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HG8 )
         {
            brk9HG8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPRVDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFPrvDsc = AV36SearchTxt ;
      AV23TFPrvDsc_Sel = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV55Emprcod ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV54FilterFullText ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV10TFProceCod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV11TFProceCod_To ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV12TFProceNom ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV13TFProceNom_Sel ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV14TFProceNif ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV16TFProceDom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV18TFProcePob ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV20TFPrvCod ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV21TFPrvCod_To ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV22TFPrvDsc ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV24TFPoceCp ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV58TFPoceCp2 ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV59TFPoceCp2_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV26TFProceTel1 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV28TFProceTel2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV30TFProceTelex ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV32TFProPers ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV33TFProPers_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV34TFProEmail ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV35TFProEmail_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV56Procecodfrom) ,
                                           Short.valueOf(AV57Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HG6 */
      pr_default.execute(4, new Object[] {AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV56Procecodfrom), Short.valueOf(AV57Procecodto)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9HG10 = false ;
         A396EmprCod = P09HG6_A396EmprCod[0] ;
         A781PrvCod = P09HG6_A781PrvCod[0] ;
         n781PrvCod = P09HG6_n781PrvCod[0] ;
         A10391ProEmail = P09HG6_A10391ProEmail[0] ;
         n10391ProEmail = P09HG6_n10391ProEmail[0] ;
         A10390ProPers = P09HG6_A10390ProPers[0] ;
         n10390ProPers = P09HG6_n10390ProPers[0] ;
         A992ProceTelex = P09HG6_A992ProceTelex[0] ;
         n992ProceTelex = P09HG6_n992ProceTelex[0] ;
         A991ProceTel2 = P09HG6_A991ProceTel2[0] ;
         n991ProceTel2 = P09HG6_n991ProceTel2[0] ;
         A990ProceTel1 = P09HG6_A990ProceTel1[0] ;
         n990ProceTel1 = P09HG6_n990ProceTel1[0] ;
         A14029PoceCp2 = P09HG6_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HG6_n14029PoceCp2[0] ;
         A989PoceCp = P09HG6_A989PoceCp[0] ;
         n989PoceCp = P09HG6_n989PoceCp[0] ;
         A787PrvDsc = P09HG6_A787PrvDsc[0] ;
         n787PrvDsc = P09HG6_n787PrvDsc[0] ;
         A988ProcePob = P09HG6_A988ProcePob[0] ;
         n988ProcePob = P09HG6_n988ProcePob[0] ;
         A994ProceDom = P09HG6_A994ProceDom[0] ;
         n994ProceDom = P09HG6_n994ProceDom[0] ;
         A993ProceNif = P09HG6_A993ProceNif[0] ;
         n993ProceNif = P09HG6_n993ProceNif[0] ;
         A971ProceNom = P09HG6_A971ProceNom[0] ;
         n971ProceNom = P09HG6_n971ProceNom[0] ;
         A970ProceCod = P09HG6_A970ProceCod[0] ;
         A787PrvDsc = P09HG6_A787PrvDsc[0] ;
         n787PrvDsc = P09HG6_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09HG6_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09HG6_A781PrvCod[0] == A781PrvCod ) )
         {
            brk9HG10 = false ;
            A970ProceCod = P09HG6_A970ProceCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9HG10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A787PrvDsc)==0) )
         {
            AV40Option = A787PrvDsc ;
            AV43OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A787PrvDsc, "@!"))) ;
            AV39InsertIndex = 1 ;
            while ( ( AV39InsertIndex <= AV41Options.size() ) && ( GXutil.strcmp((String)AV44OptionsDesc.elementAt(-1+AV39InsertIndex), AV43OptionDesc) < 0 ) )
            {
               AV39InsertIndex = (int)(AV39InsertIndex+1) ;
            }
            AV41Options.add(AV40Option, AV39InsertIndex);
            AV44OptionsDesc.add(AV43OptionDesc, AV39InsertIndex);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), AV39InsertIndex);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HG10 )
         {
            brk9HG10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPOCECPOPTIONS' Routine */
      returnInSub = false ;
      AV24TFPoceCp = AV36SearchTxt ;
      AV25TFPoceCp_Sel = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV55Emprcod ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV54FilterFullText ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV10TFProceCod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV11TFProceCod_To ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV12TFProceNom ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV13TFProceNom_Sel ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV14TFProceNif ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV16TFProceDom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV18TFProcePob ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV20TFPrvCod ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV21TFPrvCod_To ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV22TFPrvDsc ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV24TFPoceCp ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV58TFPoceCp2 ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV59TFPoceCp2_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV26TFProceTel1 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV28TFProceTel2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV30TFProceTelex ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV32TFProPers ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV33TFProPers_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV34TFProEmail ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV35TFProEmail_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV56Procecodfrom) ,
                                           Short.valueOf(AV57Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HG7 */
      pr_default.execute(5, new Object[] {AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV56Procecodfrom), Short.valueOf(AV57Procecodto)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9HG12 = false ;
         A396EmprCod = P09HG7_A396EmprCod[0] ;
         A989PoceCp = P09HG7_A989PoceCp[0] ;
         n989PoceCp = P09HG7_n989PoceCp[0] ;
         A10391ProEmail = P09HG7_A10391ProEmail[0] ;
         n10391ProEmail = P09HG7_n10391ProEmail[0] ;
         A10390ProPers = P09HG7_A10390ProPers[0] ;
         n10390ProPers = P09HG7_n10390ProPers[0] ;
         A992ProceTelex = P09HG7_A992ProceTelex[0] ;
         n992ProceTelex = P09HG7_n992ProceTelex[0] ;
         A991ProceTel2 = P09HG7_A991ProceTel2[0] ;
         n991ProceTel2 = P09HG7_n991ProceTel2[0] ;
         A990ProceTel1 = P09HG7_A990ProceTel1[0] ;
         n990ProceTel1 = P09HG7_n990ProceTel1[0] ;
         A14029PoceCp2 = P09HG7_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HG7_n14029PoceCp2[0] ;
         A787PrvDsc = P09HG7_A787PrvDsc[0] ;
         n787PrvDsc = P09HG7_n787PrvDsc[0] ;
         A781PrvCod = P09HG7_A781PrvCod[0] ;
         n781PrvCod = P09HG7_n781PrvCod[0] ;
         A988ProcePob = P09HG7_A988ProcePob[0] ;
         n988ProcePob = P09HG7_n988ProcePob[0] ;
         A994ProceDom = P09HG7_A994ProceDom[0] ;
         n994ProceDom = P09HG7_n994ProceDom[0] ;
         A993ProceNif = P09HG7_A993ProceNif[0] ;
         n993ProceNif = P09HG7_n993ProceNif[0] ;
         A971ProceNom = P09HG7_A971ProceNom[0] ;
         n971ProceNom = P09HG7_n971ProceNom[0] ;
         A970ProceCod = P09HG7_A970ProceCod[0] ;
         A787PrvDsc = P09HG7_A787PrvDsc[0] ;
         n787PrvDsc = P09HG7_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09HG7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09HG7_A989PoceCp[0], A989PoceCp) == 0 ) )
         {
            brk9HG12 = false ;
            A970ProceCod = P09HG7_A970ProceCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9HG12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A989PoceCp)==0) )
         {
            AV40Option = A989PoceCp ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HG12 )
         {
            brk9HG12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADPOCECP2OPTIONS' Routine */
      returnInSub = false ;
      AV58TFPoceCp2 = AV36SearchTxt ;
      AV59TFPoceCp2_Sel = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV55Emprcod ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV54FilterFullText ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV10TFProceCod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV11TFProceCod_To ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV12TFProceNom ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV13TFProceNom_Sel ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV14TFProceNif ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV16TFProceDom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV18TFProcePob ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV20TFPrvCod ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV21TFPrvCod_To ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV22TFPrvDsc ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV24TFPoceCp ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV58TFPoceCp2 ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV59TFPoceCp2_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV26TFProceTel1 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV28TFProceTel2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV30TFProceTelex ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV32TFProPers ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV33TFProPers_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV34TFProEmail ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV35TFProEmail_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV56Procecodfrom) ,
                                           Short.valueOf(AV57Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HG8 */
      pr_default.execute(6, new Object[] {AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV56Procecodfrom), Short.valueOf(AV57Procecodto)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9HG14 = false ;
         A396EmprCod = P09HG8_A396EmprCod[0] ;
         A14029PoceCp2 = P09HG8_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HG8_n14029PoceCp2[0] ;
         A10391ProEmail = P09HG8_A10391ProEmail[0] ;
         n10391ProEmail = P09HG8_n10391ProEmail[0] ;
         A10390ProPers = P09HG8_A10390ProPers[0] ;
         n10390ProPers = P09HG8_n10390ProPers[0] ;
         A992ProceTelex = P09HG8_A992ProceTelex[0] ;
         n992ProceTelex = P09HG8_n992ProceTelex[0] ;
         A991ProceTel2 = P09HG8_A991ProceTel2[0] ;
         n991ProceTel2 = P09HG8_n991ProceTel2[0] ;
         A990ProceTel1 = P09HG8_A990ProceTel1[0] ;
         n990ProceTel1 = P09HG8_n990ProceTel1[0] ;
         A989PoceCp = P09HG8_A989PoceCp[0] ;
         n989PoceCp = P09HG8_n989PoceCp[0] ;
         A787PrvDsc = P09HG8_A787PrvDsc[0] ;
         n787PrvDsc = P09HG8_n787PrvDsc[0] ;
         A781PrvCod = P09HG8_A781PrvCod[0] ;
         n781PrvCod = P09HG8_n781PrvCod[0] ;
         A988ProcePob = P09HG8_A988ProcePob[0] ;
         n988ProcePob = P09HG8_n988ProcePob[0] ;
         A994ProceDom = P09HG8_A994ProceDom[0] ;
         n994ProceDom = P09HG8_n994ProceDom[0] ;
         A993ProceNif = P09HG8_A993ProceNif[0] ;
         n993ProceNif = P09HG8_n993ProceNif[0] ;
         A971ProceNom = P09HG8_A971ProceNom[0] ;
         n971ProceNom = P09HG8_n971ProceNom[0] ;
         A970ProceCod = P09HG8_A970ProceCod[0] ;
         A787PrvDsc = P09HG8_A787PrvDsc[0] ;
         n787PrvDsc = P09HG8_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09HG8_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09HG8_A14029PoceCp2[0], A14029PoceCp2) == 0 ) )
         {
            brk9HG14 = false ;
            A970ProceCod = P09HG8_A970ProceCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9HG14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A14029PoceCp2)==0) )
         {
            AV40Option = A14029PoceCp2 ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HG14 )
         {
            brk9HG14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADPROCETEL1OPTIONS' Routine */
      returnInSub = false ;
      AV26TFProceTel1 = AV36SearchTxt ;
      AV27TFProceTel1_Sel = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV55Emprcod ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV54FilterFullText ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV10TFProceCod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV11TFProceCod_To ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV12TFProceNom ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV13TFProceNom_Sel ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV14TFProceNif ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV16TFProceDom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV18TFProcePob ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV20TFPrvCod ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV21TFPrvCod_To ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV22TFPrvDsc ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV24TFPoceCp ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV58TFPoceCp2 ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV59TFPoceCp2_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV26TFProceTel1 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV28TFProceTel2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV30TFProceTelex ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV32TFProPers ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV33TFProPers_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV34TFProEmail ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV35TFProEmail_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV56Procecodfrom) ,
                                           Short.valueOf(AV57Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HG9 */
      pr_default.execute(7, new Object[] {AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV56Procecodfrom), Short.valueOf(AV57Procecodto)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk9HG16 = false ;
         A396EmprCod = P09HG9_A396EmprCod[0] ;
         A990ProceTel1 = P09HG9_A990ProceTel1[0] ;
         n990ProceTel1 = P09HG9_n990ProceTel1[0] ;
         A10391ProEmail = P09HG9_A10391ProEmail[0] ;
         n10391ProEmail = P09HG9_n10391ProEmail[0] ;
         A10390ProPers = P09HG9_A10390ProPers[0] ;
         n10390ProPers = P09HG9_n10390ProPers[0] ;
         A992ProceTelex = P09HG9_A992ProceTelex[0] ;
         n992ProceTelex = P09HG9_n992ProceTelex[0] ;
         A991ProceTel2 = P09HG9_A991ProceTel2[0] ;
         n991ProceTel2 = P09HG9_n991ProceTel2[0] ;
         A14029PoceCp2 = P09HG9_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HG9_n14029PoceCp2[0] ;
         A989PoceCp = P09HG9_A989PoceCp[0] ;
         n989PoceCp = P09HG9_n989PoceCp[0] ;
         A787PrvDsc = P09HG9_A787PrvDsc[0] ;
         n787PrvDsc = P09HG9_n787PrvDsc[0] ;
         A781PrvCod = P09HG9_A781PrvCod[0] ;
         n781PrvCod = P09HG9_n781PrvCod[0] ;
         A988ProcePob = P09HG9_A988ProcePob[0] ;
         n988ProcePob = P09HG9_n988ProcePob[0] ;
         A994ProceDom = P09HG9_A994ProceDom[0] ;
         n994ProceDom = P09HG9_n994ProceDom[0] ;
         A993ProceNif = P09HG9_A993ProceNif[0] ;
         n993ProceNif = P09HG9_n993ProceNif[0] ;
         A971ProceNom = P09HG9_A971ProceNom[0] ;
         n971ProceNom = P09HG9_n971ProceNom[0] ;
         A970ProceCod = P09HG9_A970ProceCod[0] ;
         A787PrvDsc = P09HG9_A787PrvDsc[0] ;
         n787PrvDsc = P09HG9_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P09HG9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09HG9_A990ProceTel1[0], A990ProceTel1) == 0 ) )
         {
            brk9HG16 = false ;
            A970ProceCod = P09HG9_A970ProceCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9HG16 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A990ProceTel1)==0) )
         {
            AV40Option = A990ProceTel1 ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HG16 )
         {
            brk9HG16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADPROCETEL2OPTIONS' Routine */
      returnInSub = false ;
      AV28TFProceTel2 = AV36SearchTxt ;
      AV29TFProceTel2_Sel = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV55Emprcod ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV54FilterFullText ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV10TFProceCod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV11TFProceCod_To ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV12TFProceNom ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV13TFProceNom_Sel ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV14TFProceNif ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV16TFProceDom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV18TFProcePob ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV20TFPrvCod ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV21TFPrvCod_To ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV22TFPrvDsc ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV24TFPoceCp ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV58TFPoceCp2 ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV59TFPoceCp2_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV26TFProceTel1 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV28TFProceTel2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV30TFProceTelex ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV32TFProPers ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV33TFProPers_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV34TFProEmail ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV35TFProEmail_Sel ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV56Procecodfrom) ,
                                           Short.valueOf(AV57Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HG10 */
      pr_default.execute(8, new Object[] {AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV56Procecodfrom), Short.valueOf(AV57Procecodto)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk9HG18 = false ;
         A396EmprCod = P09HG10_A396EmprCod[0] ;
         A991ProceTel2 = P09HG10_A991ProceTel2[0] ;
         n991ProceTel2 = P09HG10_n991ProceTel2[0] ;
         A10391ProEmail = P09HG10_A10391ProEmail[0] ;
         n10391ProEmail = P09HG10_n10391ProEmail[0] ;
         A10390ProPers = P09HG10_A10390ProPers[0] ;
         n10390ProPers = P09HG10_n10390ProPers[0] ;
         A992ProceTelex = P09HG10_A992ProceTelex[0] ;
         n992ProceTelex = P09HG10_n992ProceTelex[0] ;
         A990ProceTel1 = P09HG10_A990ProceTel1[0] ;
         n990ProceTel1 = P09HG10_n990ProceTel1[0] ;
         A14029PoceCp2 = P09HG10_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HG10_n14029PoceCp2[0] ;
         A989PoceCp = P09HG10_A989PoceCp[0] ;
         n989PoceCp = P09HG10_n989PoceCp[0] ;
         A787PrvDsc = P09HG10_A787PrvDsc[0] ;
         n787PrvDsc = P09HG10_n787PrvDsc[0] ;
         A781PrvCod = P09HG10_A781PrvCod[0] ;
         n781PrvCod = P09HG10_n781PrvCod[0] ;
         A988ProcePob = P09HG10_A988ProcePob[0] ;
         n988ProcePob = P09HG10_n988ProcePob[0] ;
         A994ProceDom = P09HG10_A994ProceDom[0] ;
         n994ProceDom = P09HG10_n994ProceDom[0] ;
         A993ProceNif = P09HG10_A993ProceNif[0] ;
         n993ProceNif = P09HG10_n993ProceNif[0] ;
         A971ProceNom = P09HG10_A971ProceNom[0] ;
         n971ProceNom = P09HG10_n971ProceNom[0] ;
         A970ProceCod = P09HG10_A970ProceCod[0] ;
         A787PrvDsc = P09HG10_A787PrvDsc[0] ;
         n787PrvDsc = P09HG10_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P09HG10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09HG10_A991ProceTel2[0], A991ProceTel2) == 0 ) )
         {
            brk9HG18 = false ;
            A970ProceCod = P09HG10_A970ProceCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9HG18 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A991ProceTel2)==0) )
         {
            AV40Option = A991ProceTel2 ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HG18 )
         {
            brk9HG18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADPROCETELEXOPTIONS' Routine */
      returnInSub = false ;
      AV30TFProceTelex = AV36SearchTxt ;
      AV31TFProceTelex_Sel = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV55Emprcod ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV54FilterFullText ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV10TFProceCod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV11TFProceCod_To ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV12TFProceNom ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV13TFProceNom_Sel ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV14TFProceNif ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV16TFProceDom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV18TFProcePob ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV20TFPrvCod ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV21TFPrvCod_To ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV22TFPrvDsc ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV24TFPoceCp ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV58TFPoceCp2 ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV59TFPoceCp2_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV26TFProceTel1 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV28TFProceTel2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV30TFProceTelex ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV32TFProPers ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV33TFProPers_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV34TFProEmail ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV35TFProEmail_Sel ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV56Procecodfrom) ,
                                           Short.valueOf(AV57Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HG11 */
      pr_default.execute(9, new Object[] {AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV56Procecodfrom), Short.valueOf(AV57Procecodto)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk9HG20 = false ;
         A396EmprCod = P09HG11_A396EmprCod[0] ;
         A992ProceTelex = P09HG11_A992ProceTelex[0] ;
         n992ProceTelex = P09HG11_n992ProceTelex[0] ;
         A10391ProEmail = P09HG11_A10391ProEmail[0] ;
         n10391ProEmail = P09HG11_n10391ProEmail[0] ;
         A10390ProPers = P09HG11_A10390ProPers[0] ;
         n10390ProPers = P09HG11_n10390ProPers[0] ;
         A991ProceTel2 = P09HG11_A991ProceTel2[0] ;
         n991ProceTel2 = P09HG11_n991ProceTel2[0] ;
         A990ProceTel1 = P09HG11_A990ProceTel1[0] ;
         n990ProceTel1 = P09HG11_n990ProceTel1[0] ;
         A14029PoceCp2 = P09HG11_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HG11_n14029PoceCp2[0] ;
         A989PoceCp = P09HG11_A989PoceCp[0] ;
         n989PoceCp = P09HG11_n989PoceCp[0] ;
         A787PrvDsc = P09HG11_A787PrvDsc[0] ;
         n787PrvDsc = P09HG11_n787PrvDsc[0] ;
         A781PrvCod = P09HG11_A781PrvCod[0] ;
         n781PrvCod = P09HG11_n781PrvCod[0] ;
         A988ProcePob = P09HG11_A988ProcePob[0] ;
         n988ProcePob = P09HG11_n988ProcePob[0] ;
         A994ProceDom = P09HG11_A994ProceDom[0] ;
         n994ProceDom = P09HG11_n994ProceDom[0] ;
         A993ProceNif = P09HG11_A993ProceNif[0] ;
         n993ProceNif = P09HG11_n993ProceNif[0] ;
         A971ProceNom = P09HG11_A971ProceNom[0] ;
         n971ProceNom = P09HG11_n971ProceNom[0] ;
         A970ProceCod = P09HG11_A970ProceCod[0] ;
         A787PrvDsc = P09HG11_A787PrvDsc[0] ;
         n787PrvDsc = P09HG11_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P09HG11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09HG11_A992ProceTelex[0], A992ProceTelex) == 0 ) )
         {
            brk9HG20 = false ;
            A970ProceCod = P09HG11_A970ProceCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9HG20 = true ;
            pr_default.readNext(9);
         }
         if ( ! (GXutil.strcmp("", A992ProceTelex)==0) )
         {
            AV40Option = A992ProceTelex ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HG20 )
         {
            brk9HG20 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   public void S221( )
   {
      /* 'LOADPROPERSOPTIONS' Routine */
      returnInSub = false ;
      AV32TFProPers = AV36SearchTxt ;
      AV33TFProPers_Sel = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV55Emprcod ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV54FilterFullText ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV10TFProceCod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV11TFProceCod_To ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV12TFProceNom ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV13TFProceNom_Sel ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV14TFProceNif ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV16TFProceDom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV18TFProcePob ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV20TFPrvCod ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV21TFPrvCod_To ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV22TFPrvDsc ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV24TFPoceCp ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV58TFPoceCp2 ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV59TFPoceCp2_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV26TFProceTel1 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV28TFProceTel2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV30TFProceTelex ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV32TFProPers ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV33TFProPers_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV34TFProEmail ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV35TFProEmail_Sel ;
      pr_default.dynParam(10, new Object[]{ new Object[]{
                                           AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV56Procecodfrom) ,
                                           Short.valueOf(AV57Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HG12 */
      pr_default.execute(10, new Object[] {AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV56Procecodfrom), Short.valueOf(AV57Procecodto)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         brk9HG22 = false ;
         A396EmprCod = P09HG12_A396EmprCod[0] ;
         A10390ProPers = P09HG12_A10390ProPers[0] ;
         n10390ProPers = P09HG12_n10390ProPers[0] ;
         A10391ProEmail = P09HG12_A10391ProEmail[0] ;
         n10391ProEmail = P09HG12_n10391ProEmail[0] ;
         A992ProceTelex = P09HG12_A992ProceTelex[0] ;
         n992ProceTelex = P09HG12_n992ProceTelex[0] ;
         A991ProceTel2 = P09HG12_A991ProceTel2[0] ;
         n991ProceTel2 = P09HG12_n991ProceTel2[0] ;
         A990ProceTel1 = P09HG12_A990ProceTel1[0] ;
         n990ProceTel1 = P09HG12_n990ProceTel1[0] ;
         A14029PoceCp2 = P09HG12_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HG12_n14029PoceCp2[0] ;
         A989PoceCp = P09HG12_A989PoceCp[0] ;
         n989PoceCp = P09HG12_n989PoceCp[0] ;
         A787PrvDsc = P09HG12_A787PrvDsc[0] ;
         n787PrvDsc = P09HG12_n787PrvDsc[0] ;
         A781PrvCod = P09HG12_A781PrvCod[0] ;
         n781PrvCod = P09HG12_n781PrvCod[0] ;
         A988ProcePob = P09HG12_A988ProcePob[0] ;
         n988ProcePob = P09HG12_n988ProcePob[0] ;
         A994ProceDom = P09HG12_A994ProceDom[0] ;
         n994ProceDom = P09HG12_n994ProceDom[0] ;
         A993ProceNif = P09HG12_A993ProceNif[0] ;
         n993ProceNif = P09HG12_n993ProceNif[0] ;
         A971ProceNom = P09HG12_A971ProceNom[0] ;
         n971ProceNom = P09HG12_n971ProceNom[0] ;
         A970ProceCod = P09HG12_A970ProceCod[0] ;
         A787PrvDsc = P09HG12_A787PrvDsc[0] ;
         n787PrvDsc = P09HG12_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(P09HG12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09HG12_A10390ProPers[0], A10390ProPers) == 0 ) )
         {
            brk9HG22 = false ;
            A970ProceCod = P09HG12_A970ProceCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9HG22 = true ;
            pr_default.readNext(10);
         }
         if ( ! (GXutil.strcmp("", A10390ProPers)==0) )
         {
            AV40Option = A10390ProPers ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HG22 )
         {
            brk9HG22 = true ;
            pr_default.readNext(10);
         }
      }
      pr_default.close(10);
   }

   public void S231( )
   {
      /* 'LOADPROEMAILOPTIONS' Routine */
      returnInSub = false ;
      AV34TFProEmail = AV36SearchTxt ;
      AV35TFProEmail_Sel = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = AV55Emprcod ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = AV54FilterFullText ;
      AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod = AV10TFProceCod ;
      AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to = AV11TFProceCod_To ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = AV12TFProceNom ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = AV13TFProceNom_Sel ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = AV14TFProceNif ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = AV15TFProceNif_Sel ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = AV16TFProceDom ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = AV17TFProceDom_Sel ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = AV18TFProcePob ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = AV19TFProcePob_Sel ;
      AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod = AV20TFPrvCod ;
      AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to = AV21TFPrvCod_To ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = AV22TFPrvDsc ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = AV23TFPrvDsc_Sel ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = AV24TFPoceCp ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = AV25TFPoceCp_Sel ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = AV58TFPoceCp2 ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = AV59TFPoceCp2_Sel ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = AV26TFProceTel1 ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = AV27TFProceTel1_Sel ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = AV28TFProceTel2 ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = AV29TFProceTel2_Sel ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = AV30TFProceTelex ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = AV31TFProceTelex_Sel ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = AV32TFProPers ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = AV33TFProPers_Sel ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = AV34TFProEmail ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = AV35TFProEmail_Sel ;
      pr_default.dynParam(11, new Object[]{ new Object[]{
                                           AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) ,
                                           Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) ,
                                           AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) ,
                                           Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) ,
                                           AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           Short.valueOf(AV56Procecodfrom) ,
                                           Short.valueOf(AV57Procecodto) ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           A993ProceNif ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A14029PoceCp2 ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext), "%", "") ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = GXutil.padr( GXutil.rtrim( AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom), 30, "%") ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = GXutil.padr( GXutil.rtrim( AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif), 20, "%") ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = GXutil.padr( GXutil.rtrim( AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom), 34, "%") ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob), 30, "%") ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = GXutil.padr( GXutil.rtrim( AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc), 30, "%") ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = GXutil.padr( GXutil.rtrim( AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp), 6, "%") ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2), 6, "%") ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1), 9, "%") ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2), 9, "%") ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = GXutil.padr( GXutil.rtrim( AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex), 14, "%") ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = GXutil.padr( GXutil.rtrim( AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers), 40, "%") ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = GXutil.padr( GXutil.rtrim( AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail), 40, "%") ;
      /* Using cursor P09HG13 */
      pr_default.execute(11, new Object[] {AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext, Short.valueOf(AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod), Short.valueOf(AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to), lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom, AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel, lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif, AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel, lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom, AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel, lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob, AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel, Short.valueOf(AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod), Short.valueOf(AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to), lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc, AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel, lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp, AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel, lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2, AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel, lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1, AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel, lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2, AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel, lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex, AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel, lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers, AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel, lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail, AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel, Short.valueOf(AV56Procecodfrom), Short.valueOf(AV57Procecodto)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         brk9HG24 = false ;
         A396EmprCod = P09HG13_A396EmprCod[0] ;
         A10391ProEmail = P09HG13_A10391ProEmail[0] ;
         n10391ProEmail = P09HG13_n10391ProEmail[0] ;
         A10390ProPers = P09HG13_A10390ProPers[0] ;
         n10390ProPers = P09HG13_n10390ProPers[0] ;
         A992ProceTelex = P09HG13_A992ProceTelex[0] ;
         n992ProceTelex = P09HG13_n992ProceTelex[0] ;
         A991ProceTel2 = P09HG13_A991ProceTel2[0] ;
         n991ProceTel2 = P09HG13_n991ProceTel2[0] ;
         A990ProceTel1 = P09HG13_A990ProceTel1[0] ;
         n990ProceTel1 = P09HG13_n990ProceTel1[0] ;
         A14029PoceCp2 = P09HG13_A14029PoceCp2[0] ;
         n14029PoceCp2 = P09HG13_n14029PoceCp2[0] ;
         A989PoceCp = P09HG13_A989PoceCp[0] ;
         n989PoceCp = P09HG13_n989PoceCp[0] ;
         A787PrvDsc = P09HG13_A787PrvDsc[0] ;
         n787PrvDsc = P09HG13_n787PrvDsc[0] ;
         A781PrvCod = P09HG13_A781PrvCod[0] ;
         n781PrvCod = P09HG13_n781PrvCod[0] ;
         A988ProcePob = P09HG13_A988ProcePob[0] ;
         n988ProcePob = P09HG13_n988ProcePob[0] ;
         A994ProceDom = P09HG13_A994ProceDom[0] ;
         n994ProceDom = P09HG13_n994ProceDom[0] ;
         A993ProceNif = P09HG13_A993ProceNif[0] ;
         n993ProceNif = P09HG13_n993ProceNif[0] ;
         A971ProceNom = P09HG13_A971ProceNom[0] ;
         n971ProceNom = P09HG13_n971ProceNom[0] ;
         A970ProceCod = P09HG13_A970ProceCod[0] ;
         A787PrvDsc = P09HG13_A787PrvDsc[0] ;
         n787PrvDsc = P09HG13_n787PrvDsc[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(P09HG13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09HG13_A10391ProEmail[0], A10391ProEmail) == 0 ) )
         {
            brk9HG24 = false ;
            A970ProceCod = P09HG13_A970ProceCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk9HG24 = true ;
            pr_default.readNext(11);
         }
         if ( ! (GXutil.strcmp("", A10391ProEmail)==0) )
         {
            AV40Option = A10391ProEmail ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HG24 )
         {
            brk9HG24 = true ;
            pr_default.readNext(11);
         }
      }
      pr_default.close(11);
   }

   protected void cleanup( )
   {
      this.aP3[0] = listadodeprocedenciastejido_wcgetfilterdata.this.AV42OptionsJson;
      this.aP4[0] = listadodeprocedenciastejido_wcgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = listadodeprocedenciastejido_wcgetfilterdata.this.AV47OptionIndexesJson;
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
      AV12TFProceNom = "" ;
      AV13TFProceNom_Sel = "" ;
      AV14TFProceNif = "" ;
      AV15TFProceNif_Sel = "" ;
      AV16TFProceDom = "" ;
      AV17TFProceDom_Sel = "" ;
      AV18TFProcePob = "" ;
      AV19TFProcePob_Sel = "" ;
      AV22TFPrvDsc = "" ;
      AV23TFPrvDsc_Sel = "" ;
      AV24TFPoceCp = "" ;
      AV25TFPoceCp_Sel = "" ;
      AV58TFPoceCp2 = "" ;
      AV59TFPoceCp2_Sel = "" ;
      AV26TFProceTel1 = "" ;
      AV27TFProceTel1_Sel = "" ;
      AV28TFProceTel2 = "" ;
      AV29TFProceTel2_Sel = "" ;
      AV30TFProceTelex = "" ;
      AV31TFProceTelex_Sel = "" ;
      AV32TFProPers = "" ;
      AV33TFProPers_Sel = "" ;
      AV34TFProEmail = "" ;
      AV35TFProEmail_Sel = "" ;
      AV55Emprcod = "" ;
      A971ProceNom = "" ;
      AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod = "" ;
      AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = "" ;
      AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = "" ;
      AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel = "" ;
      AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = "" ;
      AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel = "" ;
      AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = "" ;
      AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel = "" ;
      AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = "" ;
      AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel = "" ;
      AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = "" ;
      AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel = "" ;
      AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = "" ;
      AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel = "" ;
      AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = "" ;
      AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel = "" ;
      AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = "" ;
      AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel = "" ;
      AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = "" ;
      AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel = "" ;
      AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = "" ;
      AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel = "" ;
      AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = "" ;
      AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel = "" ;
      AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = "" ;
      AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel = "" ;
      scmdbuf = "" ;
      lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext = "" ;
      lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom = "" ;
      lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif = "" ;
      lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom = "" ;
      lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob = "" ;
      lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc = "" ;
      lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp = "" ;
      lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 = "" ;
      lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 = "" ;
      lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 = "" ;
      lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex = "" ;
      lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers = "" ;
      lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail = "" ;
      A993ProceNif = "" ;
      A994ProceDom = "" ;
      A988ProcePob = "" ;
      A787PrvDsc = "" ;
      A989PoceCp = "" ;
      A14029PoceCp2 = "" ;
      A990ProceTel1 = "" ;
      A991ProceTel2 = "" ;
      A992ProceTelex = "" ;
      A10390ProPers = "" ;
      A10391ProEmail = "" ;
      A396EmprCod = "" ;
      P09HG2_A396EmprCod = new String[] {""} ;
      P09HG2_A971ProceNom = new String[] {""} ;
      P09HG2_n971ProceNom = new boolean[] {false} ;
      P09HG2_A10391ProEmail = new String[] {""} ;
      P09HG2_n10391ProEmail = new boolean[] {false} ;
      P09HG2_A10390ProPers = new String[] {""} ;
      P09HG2_n10390ProPers = new boolean[] {false} ;
      P09HG2_A992ProceTelex = new String[] {""} ;
      P09HG2_n992ProceTelex = new boolean[] {false} ;
      P09HG2_A991ProceTel2 = new String[] {""} ;
      P09HG2_n991ProceTel2 = new boolean[] {false} ;
      P09HG2_A990ProceTel1 = new String[] {""} ;
      P09HG2_n990ProceTel1 = new boolean[] {false} ;
      P09HG2_A14029PoceCp2 = new String[] {""} ;
      P09HG2_n14029PoceCp2 = new boolean[] {false} ;
      P09HG2_A989PoceCp = new String[] {""} ;
      P09HG2_n989PoceCp = new boolean[] {false} ;
      P09HG2_A787PrvDsc = new String[] {""} ;
      P09HG2_n787PrvDsc = new boolean[] {false} ;
      P09HG2_A781PrvCod = new short[1] ;
      P09HG2_n781PrvCod = new boolean[] {false} ;
      P09HG2_A988ProcePob = new String[] {""} ;
      P09HG2_n988ProcePob = new boolean[] {false} ;
      P09HG2_A994ProceDom = new String[] {""} ;
      P09HG2_n994ProceDom = new boolean[] {false} ;
      P09HG2_A993ProceNif = new String[] {""} ;
      P09HG2_n993ProceNif = new boolean[] {false} ;
      P09HG2_A970ProceCod = new short[1] ;
      AV40Option = "" ;
      P09HG3_A396EmprCod = new String[] {""} ;
      P09HG3_A993ProceNif = new String[] {""} ;
      P09HG3_n993ProceNif = new boolean[] {false} ;
      P09HG3_A10391ProEmail = new String[] {""} ;
      P09HG3_n10391ProEmail = new boolean[] {false} ;
      P09HG3_A10390ProPers = new String[] {""} ;
      P09HG3_n10390ProPers = new boolean[] {false} ;
      P09HG3_A992ProceTelex = new String[] {""} ;
      P09HG3_n992ProceTelex = new boolean[] {false} ;
      P09HG3_A991ProceTel2 = new String[] {""} ;
      P09HG3_n991ProceTel2 = new boolean[] {false} ;
      P09HG3_A990ProceTel1 = new String[] {""} ;
      P09HG3_n990ProceTel1 = new boolean[] {false} ;
      P09HG3_A14029PoceCp2 = new String[] {""} ;
      P09HG3_n14029PoceCp2 = new boolean[] {false} ;
      P09HG3_A989PoceCp = new String[] {""} ;
      P09HG3_n989PoceCp = new boolean[] {false} ;
      P09HG3_A787PrvDsc = new String[] {""} ;
      P09HG3_n787PrvDsc = new boolean[] {false} ;
      P09HG3_A781PrvCod = new short[1] ;
      P09HG3_n781PrvCod = new boolean[] {false} ;
      P09HG3_A988ProcePob = new String[] {""} ;
      P09HG3_n988ProcePob = new boolean[] {false} ;
      P09HG3_A994ProceDom = new String[] {""} ;
      P09HG3_n994ProceDom = new boolean[] {false} ;
      P09HG3_A971ProceNom = new String[] {""} ;
      P09HG3_n971ProceNom = new boolean[] {false} ;
      P09HG3_A970ProceCod = new short[1] ;
      P09HG4_A396EmprCod = new String[] {""} ;
      P09HG4_A994ProceDom = new String[] {""} ;
      P09HG4_n994ProceDom = new boolean[] {false} ;
      P09HG4_A10391ProEmail = new String[] {""} ;
      P09HG4_n10391ProEmail = new boolean[] {false} ;
      P09HG4_A10390ProPers = new String[] {""} ;
      P09HG4_n10390ProPers = new boolean[] {false} ;
      P09HG4_A992ProceTelex = new String[] {""} ;
      P09HG4_n992ProceTelex = new boolean[] {false} ;
      P09HG4_A991ProceTel2 = new String[] {""} ;
      P09HG4_n991ProceTel2 = new boolean[] {false} ;
      P09HG4_A990ProceTel1 = new String[] {""} ;
      P09HG4_n990ProceTel1 = new boolean[] {false} ;
      P09HG4_A14029PoceCp2 = new String[] {""} ;
      P09HG4_n14029PoceCp2 = new boolean[] {false} ;
      P09HG4_A989PoceCp = new String[] {""} ;
      P09HG4_n989PoceCp = new boolean[] {false} ;
      P09HG4_A787PrvDsc = new String[] {""} ;
      P09HG4_n787PrvDsc = new boolean[] {false} ;
      P09HG4_A781PrvCod = new short[1] ;
      P09HG4_n781PrvCod = new boolean[] {false} ;
      P09HG4_A988ProcePob = new String[] {""} ;
      P09HG4_n988ProcePob = new boolean[] {false} ;
      P09HG4_A993ProceNif = new String[] {""} ;
      P09HG4_n993ProceNif = new boolean[] {false} ;
      P09HG4_A971ProceNom = new String[] {""} ;
      P09HG4_n971ProceNom = new boolean[] {false} ;
      P09HG4_A970ProceCod = new short[1] ;
      P09HG5_A396EmprCod = new String[] {""} ;
      P09HG5_A988ProcePob = new String[] {""} ;
      P09HG5_n988ProcePob = new boolean[] {false} ;
      P09HG5_A10391ProEmail = new String[] {""} ;
      P09HG5_n10391ProEmail = new boolean[] {false} ;
      P09HG5_A10390ProPers = new String[] {""} ;
      P09HG5_n10390ProPers = new boolean[] {false} ;
      P09HG5_A992ProceTelex = new String[] {""} ;
      P09HG5_n992ProceTelex = new boolean[] {false} ;
      P09HG5_A991ProceTel2 = new String[] {""} ;
      P09HG5_n991ProceTel2 = new boolean[] {false} ;
      P09HG5_A990ProceTel1 = new String[] {""} ;
      P09HG5_n990ProceTel1 = new boolean[] {false} ;
      P09HG5_A14029PoceCp2 = new String[] {""} ;
      P09HG5_n14029PoceCp2 = new boolean[] {false} ;
      P09HG5_A989PoceCp = new String[] {""} ;
      P09HG5_n989PoceCp = new boolean[] {false} ;
      P09HG5_A787PrvDsc = new String[] {""} ;
      P09HG5_n787PrvDsc = new boolean[] {false} ;
      P09HG5_A781PrvCod = new short[1] ;
      P09HG5_n781PrvCod = new boolean[] {false} ;
      P09HG5_A994ProceDom = new String[] {""} ;
      P09HG5_n994ProceDom = new boolean[] {false} ;
      P09HG5_A993ProceNif = new String[] {""} ;
      P09HG5_n993ProceNif = new boolean[] {false} ;
      P09HG5_A971ProceNom = new String[] {""} ;
      P09HG5_n971ProceNom = new boolean[] {false} ;
      P09HG5_A970ProceCod = new short[1] ;
      P09HG6_A396EmprCod = new String[] {""} ;
      P09HG6_A781PrvCod = new short[1] ;
      P09HG6_n781PrvCod = new boolean[] {false} ;
      P09HG6_A10391ProEmail = new String[] {""} ;
      P09HG6_n10391ProEmail = new boolean[] {false} ;
      P09HG6_A10390ProPers = new String[] {""} ;
      P09HG6_n10390ProPers = new boolean[] {false} ;
      P09HG6_A992ProceTelex = new String[] {""} ;
      P09HG6_n992ProceTelex = new boolean[] {false} ;
      P09HG6_A991ProceTel2 = new String[] {""} ;
      P09HG6_n991ProceTel2 = new boolean[] {false} ;
      P09HG6_A990ProceTel1 = new String[] {""} ;
      P09HG6_n990ProceTel1 = new boolean[] {false} ;
      P09HG6_A14029PoceCp2 = new String[] {""} ;
      P09HG6_n14029PoceCp2 = new boolean[] {false} ;
      P09HG6_A989PoceCp = new String[] {""} ;
      P09HG6_n989PoceCp = new boolean[] {false} ;
      P09HG6_A787PrvDsc = new String[] {""} ;
      P09HG6_n787PrvDsc = new boolean[] {false} ;
      P09HG6_A988ProcePob = new String[] {""} ;
      P09HG6_n988ProcePob = new boolean[] {false} ;
      P09HG6_A994ProceDom = new String[] {""} ;
      P09HG6_n994ProceDom = new boolean[] {false} ;
      P09HG6_A993ProceNif = new String[] {""} ;
      P09HG6_n993ProceNif = new boolean[] {false} ;
      P09HG6_A971ProceNom = new String[] {""} ;
      P09HG6_n971ProceNom = new boolean[] {false} ;
      P09HG6_A970ProceCod = new short[1] ;
      AV43OptionDesc = "" ;
      P09HG7_A396EmprCod = new String[] {""} ;
      P09HG7_A989PoceCp = new String[] {""} ;
      P09HG7_n989PoceCp = new boolean[] {false} ;
      P09HG7_A10391ProEmail = new String[] {""} ;
      P09HG7_n10391ProEmail = new boolean[] {false} ;
      P09HG7_A10390ProPers = new String[] {""} ;
      P09HG7_n10390ProPers = new boolean[] {false} ;
      P09HG7_A992ProceTelex = new String[] {""} ;
      P09HG7_n992ProceTelex = new boolean[] {false} ;
      P09HG7_A991ProceTel2 = new String[] {""} ;
      P09HG7_n991ProceTel2 = new boolean[] {false} ;
      P09HG7_A990ProceTel1 = new String[] {""} ;
      P09HG7_n990ProceTel1 = new boolean[] {false} ;
      P09HG7_A14029PoceCp2 = new String[] {""} ;
      P09HG7_n14029PoceCp2 = new boolean[] {false} ;
      P09HG7_A787PrvDsc = new String[] {""} ;
      P09HG7_n787PrvDsc = new boolean[] {false} ;
      P09HG7_A781PrvCod = new short[1] ;
      P09HG7_n781PrvCod = new boolean[] {false} ;
      P09HG7_A988ProcePob = new String[] {""} ;
      P09HG7_n988ProcePob = new boolean[] {false} ;
      P09HG7_A994ProceDom = new String[] {""} ;
      P09HG7_n994ProceDom = new boolean[] {false} ;
      P09HG7_A993ProceNif = new String[] {""} ;
      P09HG7_n993ProceNif = new boolean[] {false} ;
      P09HG7_A971ProceNom = new String[] {""} ;
      P09HG7_n971ProceNom = new boolean[] {false} ;
      P09HG7_A970ProceCod = new short[1] ;
      P09HG8_A396EmprCod = new String[] {""} ;
      P09HG8_A14029PoceCp2 = new String[] {""} ;
      P09HG8_n14029PoceCp2 = new boolean[] {false} ;
      P09HG8_A10391ProEmail = new String[] {""} ;
      P09HG8_n10391ProEmail = new boolean[] {false} ;
      P09HG8_A10390ProPers = new String[] {""} ;
      P09HG8_n10390ProPers = new boolean[] {false} ;
      P09HG8_A992ProceTelex = new String[] {""} ;
      P09HG8_n992ProceTelex = new boolean[] {false} ;
      P09HG8_A991ProceTel2 = new String[] {""} ;
      P09HG8_n991ProceTel2 = new boolean[] {false} ;
      P09HG8_A990ProceTel1 = new String[] {""} ;
      P09HG8_n990ProceTel1 = new boolean[] {false} ;
      P09HG8_A989PoceCp = new String[] {""} ;
      P09HG8_n989PoceCp = new boolean[] {false} ;
      P09HG8_A787PrvDsc = new String[] {""} ;
      P09HG8_n787PrvDsc = new boolean[] {false} ;
      P09HG8_A781PrvCod = new short[1] ;
      P09HG8_n781PrvCod = new boolean[] {false} ;
      P09HG8_A988ProcePob = new String[] {""} ;
      P09HG8_n988ProcePob = new boolean[] {false} ;
      P09HG8_A994ProceDom = new String[] {""} ;
      P09HG8_n994ProceDom = new boolean[] {false} ;
      P09HG8_A993ProceNif = new String[] {""} ;
      P09HG8_n993ProceNif = new boolean[] {false} ;
      P09HG8_A971ProceNom = new String[] {""} ;
      P09HG8_n971ProceNom = new boolean[] {false} ;
      P09HG8_A970ProceCod = new short[1] ;
      P09HG9_A396EmprCod = new String[] {""} ;
      P09HG9_A990ProceTel1 = new String[] {""} ;
      P09HG9_n990ProceTel1 = new boolean[] {false} ;
      P09HG9_A10391ProEmail = new String[] {""} ;
      P09HG9_n10391ProEmail = new boolean[] {false} ;
      P09HG9_A10390ProPers = new String[] {""} ;
      P09HG9_n10390ProPers = new boolean[] {false} ;
      P09HG9_A992ProceTelex = new String[] {""} ;
      P09HG9_n992ProceTelex = new boolean[] {false} ;
      P09HG9_A991ProceTel2 = new String[] {""} ;
      P09HG9_n991ProceTel2 = new boolean[] {false} ;
      P09HG9_A14029PoceCp2 = new String[] {""} ;
      P09HG9_n14029PoceCp2 = new boolean[] {false} ;
      P09HG9_A989PoceCp = new String[] {""} ;
      P09HG9_n989PoceCp = new boolean[] {false} ;
      P09HG9_A787PrvDsc = new String[] {""} ;
      P09HG9_n787PrvDsc = new boolean[] {false} ;
      P09HG9_A781PrvCod = new short[1] ;
      P09HG9_n781PrvCod = new boolean[] {false} ;
      P09HG9_A988ProcePob = new String[] {""} ;
      P09HG9_n988ProcePob = new boolean[] {false} ;
      P09HG9_A994ProceDom = new String[] {""} ;
      P09HG9_n994ProceDom = new boolean[] {false} ;
      P09HG9_A993ProceNif = new String[] {""} ;
      P09HG9_n993ProceNif = new boolean[] {false} ;
      P09HG9_A971ProceNom = new String[] {""} ;
      P09HG9_n971ProceNom = new boolean[] {false} ;
      P09HG9_A970ProceCod = new short[1] ;
      P09HG10_A396EmprCod = new String[] {""} ;
      P09HG10_A991ProceTel2 = new String[] {""} ;
      P09HG10_n991ProceTel2 = new boolean[] {false} ;
      P09HG10_A10391ProEmail = new String[] {""} ;
      P09HG10_n10391ProEmail = new boolean[] {false} ;
      P09HG10_A10390ProPers = new String[] {""} ;
      P09HG10_n10390ProPers = new boolean[] {false} ;
      P09HG10_A992ProceTelex = new String[] {""} ;
      P09HG10_n992ProceTelex = new boolean[] {false} ;
      P09HG10_A990ProceTel1 = new String[] {""} ;
      P09HG10_n990ProceTel1 = new boolean[] {false} ;
      P09HG10_A14029PoceCp2 = new String[] {""} ;
      P09HG10_n14029PoceCp2 = new boolean[] {false} ;
      P09HG10_A989PoceCp = new String[] {""} ;
      P09HG10_n989PoceCp = new boolean[] {false} ;
      P09HG10_A787PrvDsc = new String[] {""} ;
      P09HG10_n787PrvDsc = new boolean[] {false} ;
      P09HG10_A781PrvCod = new short[1] ;
      P09HG10_n781PrvCod = new boolean[] {false} ;
      P09HG10_A988ProcePob = new String[] {""} ;
      P09HG10_n988ProcePob = new boolean[] {false} ;
      P09HG10_A994ProceDom = new String[] {""} ;
      P09HG10_n994ProceDom = new boolean[] {false} ;
      P09HG10_A993ProceNif = new String[] {""} ;
      P09HG10_n993ProceNif = new boolean[] {false} ;
      P09HG10_A971ProceNom = new String[] {""} ;
      P09HG10_n971ProceNom = new boolean[] {false} ;
      P09HG10_A970ProceCod = new short[1] ;
      P09HG11_A396EmprCod = new String[] {""} ;
      P09HG11_A992ProceTelex = new String[] {""} ;
      P09HG11_n992ProceTelex = new boolean[] {false} ;
      P09HG11_A10391ProEmail = new String[] {""} ;
      P09HG11_n10391ProEmail = new boolean[] {false} ;
      P09HG11_A10390ProPers = new String[] {""} ;
      P09HG11_n10390ProPers = new boolean[] {false} ;
      P09HG11_A991ProceTel2 = new String[] {""} ;
      P09HG11_n991ProceTel2 = new boolean[] {false} ;
      P09HG11_A990ProceTel1 = new String[] {""} ;
      P09HG11_n990ProceTel1 = new boolean[] {false} ;
      P09HG11_A14029PoceCp2 = new String[] {""} ;
      P09HG11_n14029PoceCp2 = new boolean[] {false} ;
      P09HG11_A989PoceCp = new String[] {""} ;
      P09HG11_n989PoceCp = new boolean[] {false} ;
      P09HG11_A787PrvDsc = new String[] {""} ;
      P09HG11_n787PrvDsc = new boolean[] {false} ;
      P09HG11_A781PrvCod = new short[1] ;
      P09HG11_n781PrvCod = new boolean[] {false} ;
      P09HG11_A988ProcePob = new String[] {""} ;
      P09HG11_n988ProcePob = new boolean[] {false} ;
      P09HG11_A994ProceDom = new String[] {""} ;
      P09HG11_n994ProceDom = new boolean[] {false} ;
      P09HG11_A993ProceNif = new String[] {""} ;
      P09HG11_n993ProceNif = new boolean[] {false} ;
      P09HG11_A971ProceNom = new String[] {""} ;
      P09HG11_n971ProceNom = new boolean[] {false} ;
      P09HG11_A970ProceCod = new short[1] ;
      P09HG12_A396EmprCod = new String[] {""} ;
      P09HG12_A10390ProPers = new String[] {""} ;
      P09HG12_n10390ProPers = new boolean[] {false} ;
      P09HG12_A10391ProEmail = new String[] {""} ;
      P09HG12_n10391ProEmail = new boolean[] {false} ;
      P09HG12_A992ProceTelex = new String[] {""} ;
      P09HG12_n992ProceTelex = new boolean[] {false} ;
      P09HG12_A991ProceTel2 = new String[] {""} ;
      P09HG12_n991ProceTel2 = new boolean[] {false} ;
      P09HG12_A990ProceTel1 = new String[] {""} ;
      P09HG12_n990ProceTel1 = new boolean[] {false} ;
      P09HG12_A14029PoceCp2 = new String[] {""} ;
      P09HG12_n14029PoceCp2 = new boolean[] {false} ;
      P09HG12_A989PoceCp = new String[] {""} ;
      P09HG12_n989PoceCp = new boolean[] {false} ;
      P09HG12_A787PrvDsc = new String[] {""} ;
      P09HG12_n787PrvDsc = new boolean[] {false} ;
      P09HG12_A781PrvCod = new short[1] ;
      P09HG12_n781PrvCod = new boolean[] {false} ;
      P09HG12_A988ProcePob = new String[] {""} ;
      P09HG12_n988ProcePob = new boolean[] {false} ;
      P09HG12_A994ProceDom = new String[] {""} ;
      P09HG12_n994ProceDom = new boolean[] {false} ;
      P09HG12_A993ProceNif = new String[] {""} ;
      P09HG12_n993ProceNif = new boolean[] {false} ;
      P09HG12_A971ProceNom = new String[] {""} ;
      P09HG12_n971ProceNom = new boolean[] {false} ;
      P09HG12_A970ProceCod = new short[1] ;
      P09HG13_A396EmprCod = new String[] {""} ;
      P09HG13_A10391ProEmail = new String[] {""} ;
      P09HG13_n10391ProEmail = new boolean[] {false} ;
      P09HG13_A10390ProPers = new String[] {""} ;
      P09HG13_n10390ProPers = new boolean[] {false} ;
      P09HG13_A992ProceTelex = new String[] {""} ;
      P09HG13_n992ProceTelex = new boolean[] {false} ;
      P09HG13_A991ProceTel2 = new String[] {""} ;
      P09HG13_n991ProceTel2 = new boolean[] {false} ;
      P09HG13_A990ProceTel1 = new String[] {""} ;
      P09HG13_n990ProceTel1 = new boolean[] {false} ;
      P09HG13_A14029PoceCp2 = new String[] {""} ;
      P09HG13_n14029PoceCp2 = new boolean[] {false} ;
      P09HG13_A989PoceCp = new String[] {""} ;
      P09HG13_n989PoceCp = new boolean[] {false} ;
      P09HG13_A787PrvDsc = new String[] {""} ;
      P09HG13_n787PrvDsc = new boolean[] {false} ;
      P09HG13_A781PrvCod = new short[1] ;
      P09HG13_n781PrvCod = new boolean[] {false} ;
      P09HG13_A988ProcePob = new String[] {""} ;
      P09HG13_n988ProcePob = new boolean[] {false} ;
      P09HG13_A994ProceDom = new String[] {""} ;
      P09HG13_n994ProceDom = new boolean[] {false} ;
      P09HG13_A993ProceNif = new String[] {""} ;
      P09HG13_n993ProceNif = new boolean[] {false} ;
      P09HG13_A971ProceNom = new String[] {""} ;
      P09HG13_n971ProceNom = new boolean[] {false} ;
      P09HG13_A970ProceCod = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.listadodeprocedenciastejido_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09HG2_A396EmprCod, P09HG2_A971ProceNom, P09HG2_n971ProceNom, P09HG2_A10391ProEmail, P09HG2_n10391ProEmail, P09HG2_A10390ProPers, P09HG2_n10390ProPers, P09HG2_A992ProceTelex, P09HG2_n992ProceTelex, P09HG2_A991ProceTel2,
            P09HG2_n991ProceTel2, P09HG2_A990ProceTel1, P09HG2_n990ProceTel1, P09HG2_A14029PoceCp2, P09HG2_n14029PoceCp2, P09HG2_A989PoceCp, P09HG2_n989PoceCp, P09HG2_A787PrvDsc, P09HG2_n787PrvDsc, P09HG2_A781PrvCod,
            P09HG2_n781PrvCod, P09HG2_A988ProcePob, P09HG2_n988ProcePob, P09HG2_A994ProceDom, P09HG2_n994ProceDom, P09HG2_A993ProceNif, P09HG2_n993ProceNif, P09HG2_A970ProceCod
            }
            , new Object[] {
            P09HG3_A396EmprCod, P09HG3_A993ProceNif, P09HG3_n993ProceNif, P09HG3_A10391ProEmail, P09HG3_n10391ProEmail, P09HG3_A10390ProPers, P09HG3_n10390ProPers, P09HG3_A992ProceTelex, P09HG3_n992ProceTelex, P09HG3_A991ProceTel2,
            P09HG3_n991ProceTel2, P09HG3_A990ProceTel1, P09HG3_n990ProceTel1, P09HG3_A14029PoceCp2, P09HG3_n14029PoceCp2, P09HG3_A989PoceCp, P09HG3_n989PoceCp, P09HG3_A787PrvDsc, P09HG3_n787PrvDsc, P09HG3_A781PrvCod,
            P09HG3_n781PrvCod, P09HG3_A988ProcePob, P09HG3_n988ProcePob, P09HG3_A994ProceDom, P09HG3_n994ProceDom, P09HG3_A971ProceNom, P09HG3_n971ProceNom, P09HG3_A970ProceCod
            }
            , new Object[] {
            P09HG4_A396EmprCod, P09HG4_A994ProceDom, P09HG4_n994ProceDom, P09HG4_A10391ProEmail, P09HG4_n10391ProEmail, P09HG4_A10390ProPers, P09HG4_n10390ProPers, P09HG4_A992ProceTelex, P09HG4_n992ProceTelex, P09HG4_A991ProceTel2,
            P09HG4_n991ProceTel2, P09HG4_A990ProceTel1, P09HG4_n990ProceTel1, P09HG4_A14029PoceCp2, P09HG4_n14029PoceCp2, P09HG4_A989PoceCp, P09HG4_n989PoceCp, P09HG4_A787PrvDsc, P09HG4_n787PrvDsc, P09HG4_A781PrvCod,
            P09HG4_n781PrvCod, P09HG4_A988ProcePob, P09HG4_n988ProcePob, P09HG4_A993ProceNif, P09HG4_n993ProceNif, P09HG4_A971ProceNom, P09HG4_n971ProceNom, P09HG4_A970ProceCod
            }
            , new Object[] {
            P09HG5_A396EmprCod, P09HG5_A988ProcePob, P09HG5_n988ProcePob, P09HG5_A10391ProEmail, P09HG5_n10391ProEmail, P09HG5_A10390ProPers, P09HG5_n10390ProPers, P09HG5_A992ProceTelex, P09HG5_n992ProceTelex, P09HG5_A991ProceTel2,
            P09HG5_n991ProceTel2, P09HG5_A990ProceTel1, P09HG5_n990ProceTel1, P09HG5_A14029PoceCp2, P09HG5_n14029PoceCp2, P09HG5_A989PoceCp, P09HG5_n989PoceCp, P09HG5_A787PrvDsc, P09HG5_n787PrvDsc, P09HG5_A781PrvCod,
            P09HG5_n781PrvCod, P09HG5_A994ProceDom, P09HG5_n994ProceDom, P09HG5_A993ProceNif, P09HG5_n993ProceNif, P09HG5_A971ProceNom, P09HG5_n971ProceNom, P09HG5_A970ProceCod
            }
            , new Object[] {
            P09HG6_A396EmprCod, P09HG6_A781PrvCod, P09HG6_n781PrvCod, P09HG6_A10391ProEmail, P09HG6_n10391ProEmail, P09HG6_A10390ProPers, P09HG6_n10390ProPers, P09HG6_A992ProceTelex, P09HG6_n992ProceTelex, P09HG6_A991ProceTel2,
            P09HG6_n991ProceTel2, P09HG6_A990ProceTel1, P09HG6_n990ProceTel1, P09HG6_A14029PoceCp2, P09HG6_n14029PoceCp2, P09HG6_A989PoceCp, P09HG6_n989PoceCp, P09HG6_A787PrvDsc, P09HG6_n787PrvDsc, P09HG6_A988ProcePob,
            P09HG6_n988ProcePob, P09HG6_A994ProceDom, P09HG6_n994ProceDom, P09HG6_A993ProceNif, P09HG6_n993ProceNif, P09HG6_A971ProceNom, P09HG6_n971ProceNom, P09HG6_A970ProceCod
            }
            , new Object[] {
            P09HG7_A396EmprCod, P09HG7_A989PoceCp, P09HG7_n989PoceCp, P09HG7_A10391ProEmail, P09HG7_n10391ProEmail, P09HG7_A10390ProPers, P09HG7_n10390ProPers, P09HG7_A992ProceTelex, P09HG7_n992ProceTelex, P09HG7_A991ProceTel2,
            P09HG7_n991ProceTel2, P09HG7_A990ProceTel1, P09HG7_n990ProceTel1, P09HG7_A14029PoceCp2, P09HG7_n14029PoceCp2, P09HG7_A787PrvDsc, P09HG7_n787PrvDsc, P09HG7_A781PrvCod, P09HG7_n781PrvCod, P09HG7_A988ProcePob,
            P09HG7_n988ProcePob, P09HG7_A994ProceDom, P09HG7_n994ProceDom, P09HG7_A993ProceNif, P09HG7_n993ProceNif, P09HG7_A971ProceNom, P09HG7_n971ProceNom, P09HG7_A970ProceCod
            }
            , new Object[] {
            P09HG8_A396EmprCod, P09HG8_A14029PoceCp2, P09HG8_n14029PoceCp2, P09HG8_A10391ProEmail, P09HG8_n10391ProEmail, P09HG8_A10390ProPers, P09HG8_n10390ProPers, P09HG8_A992ProceTelex, P09HG8_n992ProceTelex, P09HG8_A991ProceTel2,
            P09HG8_n991ProceTel2, P09HG8_A990ProceTel1, P09HG8_n990ProceTel1, P09HG8_A989PoceCp, P09HG8_n989PoceCp, P09HG8_A787PrvDsc, P09HG8_n787PrvDsc, P09HG8_A781PrvCod, P09HG8_n781PrvCod, P09HG8_A988ProcePob,
            P09HG8_n988ProcePob, P09HG8_A994ProceDom, P09HG8_n994ProceDom, P09HG8_A993ProceNif, P09HG8_n993ProceNif, P09HG8_A971ProceNom, P09HG8_n971ProceNom, P09HG8_A970ProceCod
            }
            , new Object[] {
            P09HG9_A396EmprCod, P09HG9_A990ProceTel1, P09HG9_n990ProceTel1, P09HG9_A10391ProEmail, P09HG9_n10391ProEmail, P09HG9_A10390ProPers, P09HG9_n10390ProPers, P09HG9_A992ProceTelex, P09HG9_n992ProceTelex, P09HG9_A991ProceTel2,
            P09HG9_n991ProceTel2, P09HG9_A14029PoceCp2, P09HG9_n14029PoceCp2, P09HG9_A989PoceCp, P09HG9_n989PoceCp, P09HG9_A787PrvDsc, P09HG9_n787PrvDsc, P09HG9_A781PrvCod, P09HG9_n781PrvCod, P09HG9_A988ProcePob,
            P09HG9_n988ProcePob, P09HG9_A994ProceDom, P09HG9_n994ProceDom, P09HG9_A993ProceNif, P09HG9_n993ProceNif, P09HG9_A971ProceNom, P09HG9_n971ProceNom, P09HG9_A970ProceCod
            }
            , new Object[] {
            P09HG10_A396EmprCod, P09HG10_A991ProceTel2, P09HG10_n991ProceTel2, P09HG10_A10391ProEmail, P09HG10_n10391ProEmail, P09HG10_A10390ProPers, P09HG10_n10390ProPers, P09HG10_A992ProceTelex, P09HG10_n992ProceTelex, P09HG10_A990ProceTel1,
            P09HG10_n990ProceTel1, P09HG10_A14029PoceCp2, P09HG10_n14029PoceCp2, P09HG10_A989PoceCp, P09HG10_n989PoceCp, P09HG10_A787PrvDsc, P09HG10_n787PrvDsc, P09HG10_A781PrvCod, P09HG10_n781PrvCod, P09HG10_A988ProcePob,
            P09HG10_n988ProcePob, P09HG10_A994ProceDom, P09HG10_n994ProceDom, P09HG10_A993ProceNif, P09HG10_n993ProceNif, P09HG10_A971ProceNom, P09HG10_n971ProceNom, P09HG10_A970ProceCod
            }
            , new Object[] {
            P09HG11_A396EmprCod, P09HG11_A992ProceTelex, P09HG11_n992ProceTelex, P09HG11_A10391ProEmail, P09HG11_n10391ProEmail, P09HG11_A10390ProPers, P09HG11_n10390ProPers, P09HG11_A991ProceTel2, P09HG11_n991ProceTel2, P09HG11_A990ProceTel1,
            P09HG11_n990ProceTel1, P09HG11_A14029PoceCp2, P09HG11_n14029PoceCp2, P09HG11_A989PoceCp, P09HG11_n989PoceCp, P09HG11_A787PrvDsc, P09HG11_n787PrvDsc, P09HG11_A781PrvCod, P09HG11_n781PrvCod, P09HG11_A988ProcePob,
            P09HG11_n988ProcePob, P09HG11_A994ProceDom, P09HG11_n994ProceDom, P09HG11_A993ProceNif, P09HG11_n993ProceNif, P09HG11_A971ProceNom, P09HG11_n971ProceNom, P09HG11_A970ProceCod
            }
            , new Object[] {
            P09HG12_A396EmprCod, P09HG12_A10390ProPers, P09HG12_n10390ProPers, P09HG12_A10391ProEmail, P09HG12_n10391ProEmail, P09HG12_A992ProceTelex, P09HG12_n992ProceTelex, P09HG12_A991ProceTel2, P09HG12_n991ProceTel2, P09HG12_A990ProceTel1,
            P09HG12_n990ProceTel1, P09HG12_A14029PoceCp2, P09HG12_n14029PoceCp2, P09HG12_A989PoceCp, P09HG12_n989PoceCp, P09HG12_A787PrvDsc, P09HG12_n787PrvDsc, P09HG12_A781PrvCod, P09HG12_n781PrvCod, P09HG12_A988ProcePob,
            P09HG12_n988ProcePob, P09HG12_A994ProceDom, P09HG12_n994ProceDom, P09HG12_A993ProceNif, P09HG12_n993ProceNif, P09HG12_A971ProceNom, P09HG12_n971ProceNom, P09HG12_A970ProceCod
            }
            , new Object[] {
            P09HG13_A396EmprCod, P09HG13_A10391ProEmail, P09HG13_n10391ProEmail, P09HG13_A10390ProPers, P09HG13_n10390ProPers, P09HG13_A992ProceTelex, P09HG13_n992ProceTelex, P09HG13_A991ProceTel2, P09HG13_n991ProceTel2, P09HG13_A990ProceTel1,
            P09HG13_n990ProceTel1, P09HG13_A14029PoceCp2, P09HG13_n14029PoceCp2, P09HG13_A989PoceCp, P09HG13_n989PoceCp, P09HG13_A787PrvDsc, P09HG13_n787PrvDsc, P09HG13_A781PrvCod, P09HG13_n781PrvCod, P09HG13_A988ProcePob,
            P09HG13_n988ProcePob, P09HG13_A994ProceDom, P09HG13_n994ProceDom, P09HG13_A993ProceNif, P09HG13_n993ProceNif, P09HG13_A971ProceNom, P09HG13_n971ProceNom, P09HG13_A970ProceCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFProceCod ;
   private short AV11TFProceCod_To ;
   private short AV20TFPrvCod ;
   private short AV21TFPrvCod_To ;
   private short AV56Procecodfrom ;
   private short AV57Procecodto ;
   private short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ;
   private short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ;
   private short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ;
   private short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ;
   private short A970ProceCod ;
   private short A781PrvCod ;
   private short Gx_err ;
   private int AV62GXV1 ;
   private int AV39InsertIndex ;
   private long AV48count ;
   private String AV12TFProceNom ;
   private String AV13TFProceNom_Sel ;
   private String AV14TFProceNif ;
   private String AV15TFProceNif_Sel ;
   private String AV16TFProceDom ;
   private String AV17TFProceDom_Sel ;
   private String AV18TFProcePob ;
   private String AV19TFProcePob_Sel ;
   private String AV22TFPrvDsc ;
   private String AV23TFPrvDsc_Sel ;
   private String AV24TFPoceCp ;
   private String AV25TFPoceCp_Sel ;
   private String AV58TFPoceCp2 ;
   private String AV59TFPoceCp2_Sel ;
   private String AV26TFProceTel1 ;
   private String AV27TFProceTel1_Sel ;
   private String AV28TFProceTel2 ;
   private String AV29TFProceTel2_Sel ;
   private String AV30TFProceTelex ;
   private String AV31TFProceTelex_Sel ;
   private String AV32TFProPers ;
   private String AV33TFProPers_Sel ;
   private String AV34TFProEmail ;
   private String AV35TFProEmail_Sel ;
   private String AV55Emprcod ;
   private String A971ProceNom ;
   private String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ;
   private String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ;
   private String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ;
   private String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ;
   private String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ;
   private String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ;
   private String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ;
   private String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ;
   private String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ;
   private String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ;
   private String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ;
   private String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ;
   private String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ;
   private String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ;
   private String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ;
   private String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ;
   private String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ;
   private String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ;
   private String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ;
   private String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ;
   private String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ;
   private String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ;
   private String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ;
   private String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ;
   private String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ;
   private String scmdbuf ;
   private String lV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ;
   private String lV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ;
   private String lV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ;
   private String lV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ;
   private String lV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ;
   private String lV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ;
   private String lV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ;
   private String lV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ;
   private String lV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ;
   private String lV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ;
   private String lV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ;
   private String lV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ;
   private String A993ProceNif ;
   private String A994ProceDom ;
   private String A988ProcePob ;
   private String A787PrvDsc ;
   private String A989PoceCp ;
   private String A14029PoceCp2 ;
   private String A990ProceTel1 ;
   private String A991ProceTel2 ;
   private String A992ProceTelex ;
   private String A10390ProPers ;
   private String A10391ProEmail ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9HG2 ;
   private boolean n971ProceNom ;
   private boolean n10391ProEmail ;
   private boolean n10390ProPers ;
   private boolean n992ProceTelex ;
   private boolean n991ProceTel2 ;
   private boolean n990ProceTel1 ;
   private boolean n14029PoceCp2 ;
   private boolean n989PoceCp ;
   private boolean n787PrvDsc ;
   private boolean n781PrvCod ;
   private boolean n988ProcePob ;
   private boolean n994ProceDom ;
   private boolean n993ProceNif ;
   private boolean brk9HG4 ;
   private boolean brk9HG6 ;
   private boolean brk9HG8 ;
   private boolean brk9HG10 ;
   private boolean brk9HG12 ;
   private boolean brk9HG14 ;
   private boolean brk9HG16 ;
   private boolean brk9HG18 ;
   private boolean brk9HG20 ;
   private boolean brk9HG22 ;
   private boolean brk9HG24 ;
   private String AV42OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV38DDOName ;
   private String AV36SearchTxt ;
   private String AV37SearchTxtTo ;
   private String AV54FilterFullText ;
   private String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ;
   private String lV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ;
   private String AV40Option ;
   private String AV43OptionDesc ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09HG2_A396EmprCod ;
   private String[] P09HG2_A971ProceNom ;
   private boolean[] P09HG2_n971ProceNom ;
   private String[] P09HG2_A10391ProEmail ;
   private boolean[] P09HG2_n10391ProEmail ;
   private String[] P09HG2_A10390ProPers ;
   private boolean[] P09HG2_n10390ProPers ;
   private String[] P09HG2_A992ProceTelex ;
   private boolean[] P09HG2_n992ProceTelex ;
   private String[] P09HG2_A991ProceTel2 ;
   private boolean[] P09HG2_n991ProceTel2 ;
   private String[] P09HG2_A990ProceTel1 ;
   private boolean[] P09HG2_n990ProceTel1 ;
   private String[] P09HG2_A14029PoceCp2 ;
   private boolean[] P09HG2_n14029PoceCp2 ;
   private String[] P09HG2_A989PoceCp ;
   private boolean[] P09HG2_n989PoceCp ;
   private String[] P09HG2_A787PrvDsc ;
   private boolean[] P09HG2_n787PrvDsc ;
   private short[] P09HG2_A781PrvCod ;
   private boolean[] P09HG2_n781PrvCod ;
   private String[] P09HG2_A988ProcePob ;
   private boolean[] P09HG2_n988ProcePob ;
   private String[] P09HG2_A994ProceDom ;
   private boolean[] P09HG2_n994ProceDom ;
   private String[] P09HG2_A993ProceNif ;
   private boolean[] P09HG2_n993ProceNif ;
   private short[] P09HG2_A970ProceCod ;
   private String[] P09HG3_A396EmprCod ;
   private String[] P09HG3_A993ProceNif ;
   private boolean[] P09HG3_n993ProceNif ;
   private String[] P09HG3_A10391ProEmail ;
   private boolean[] P09HG3_n10391ProEmail ;
   private String[] P09HG3_A10390ProPers ;
   private boolean[] P09HG3_n10390ProPers ;
   private String[] P09HG3_A992ProceTelex ;
   private boolean[] P09HG3_n992ProceTelex ;
   private String[] P09HG3_A991ProceTel2 ;
   private boolean[] P09HG3_n991ProceTel2 ;
   private String[] P09HG3_A990ProceTel1 ;
   private boolean[] P09HG3_n990ProceTel1 ;
   private String[] P09HG3_A14029PoceCp2 ;
   private boolean[] P09HG3_n14029PoceCp2 ;
   private String[] P09HG3_A989PoceCp ;
   private boolean[] P09HG3_n989PoceCp ;
   private String[] P09HG3_A787PrvDsc ;
   private boolean[] P09HG3_n787PrvDsc ;
   private short[] P09HG3_A781PrvCod ;
   private boolean[] P09HG3_n781PrvCod ;
   private String[] P09HG3_A988ProcePob ;
   private boolean[] P09HG3_n988ProcePob ;
   private String[] P09HG3_A994ProceDom ;
   private boolean[] P09HG3_n994ProceDom ;
   private String[] P09HG3_A971ProceNom ;
   private boolean[] P09HG3_n971ProceNom ;
   private short[] P09HG3_A970ProceCod ;
   private String[] P09HG4_A396EmprCod ;
   private String[] P09HG4_A994ProceDom ;
   private boolean[] P09HG4_n994ProceDom ;
   private String[] P09HG4_A10391ProEmail ;
   private boolean[] P09HG4_n10391ProEmail ;
   private String[] P09HG4_A10390ProPers ;
   private boolean[] P09HG4_n10390ProPers ;
   private String[] P09HG4_A992ProceTelex ;
   private boolean[] P09HG4_n992ProceTelex ;
   private String[] P09HG4_A991ProceTel2 ;
   private boolean[] P09HG4_n991ProceTel2 ;
   private String[] P09HG4_A990ProceTel1 ;
   private boolean[] P09HG4_n990ProceTel1 ;
   private String[] P09HG4_A14029PoceCp2 ;
   private boolean[] P09HG4_n14029PoceCp2 ;
   private String[] P09HG4_A989PoceCp ;
   private boolean[] P09HG4_n989PoceCp ;
   private String[] P09HG4_A787PrvDsc ;
   private boolean[] P09HG4_n787PrvDsc ;
   private short[] P09HG4_A781PrvCod ;
   private boolean[] P09HG4_n781PrvCod ;
   private String[] P09HG4_A988ProcePob ;
   private boolean[] P09HG4_n988ProcePob ;
   private String[] P09HG4_A993ProceNif ;
   private boolean[] P09HG4_n993ProceNif ;
   private String[] P09HG4_A971ProceNom ;
   private boolean[] P09HG4_n971ProceNom ;
   private short[] P09HG4_A970ProceCod ;
   private String[] P09HG5_A396EmprCod ;
   private String[] P09HG5_A988ProcePob ;
   private boolean[] P09HG5_n988ProcePob ;
   private String[] P09HG5_A10391ProEmail ;
   private boolean[] P09HG5_n10391ProEmail ;
   private String[] P09HG5_A10390ProPers ;
   private boolean[] P09HG5_n10390ProPers ;
   private String[] P09HG5_A992ProceTelex ;
   private boolean[] P09HG5_n992ProceTelex ;
   private String[] P09HG5_A991ProceTel2 ;
   private boolean[] P09HG5_n991ProceTel2 ;
   private String[] P09HG5_A990ProceTel1 ;
   private boolean[] P09HG5_n990ProceTel1 ;
   private String[] P09HG5_A14029PoceCp2 ;
   private boolean[] P09HG5_n14029PoceCp2 ;
   private String[] P09HG5_A989PoceCp ;
   private boolean[] P09HG5_n989PoceCp ;
   private String[] P09HG5_A787PrvDsc ;
   private boolean[] P09HG5_n787PrvDsc ;
   private short[] P09HG5_A781PrvCod ;
   private boolean[] P09HG5_n781PrvCod ;
   private String[] P09HG5_A994ProceDom ;
   private boolean[] P09HG5_n994ProceDom ;
   private String[] P09HG5_A993ProceNif ;
   private boolean[] P09HG5_n993ProceNif ;
   private String[] P09HG5_A971ProceNom ;
   private boolean[] P09HG5_n971ProceNom ;
   private short[] P09HG5_A970ProceCod ;
   private String[] P09HG6_A396EmprCod ;
   private short[] P09HG6_A781PrvCod ;
   private boolean[] P09HG6_n781PrvCod ;
   private String[] P09HG6_A10391ProEmail ;
   private boolean[] P09HG6_n10391ProEmail ;
   private String[] P09HG6_A10390ProPers ;
   private boolean[] P09HG6_n10390ProPers ;
   private String[] P09HG6_A992ProceTelex ;
   private boolean[] P09HG6_n992ProceTelex ;
   private String[] P09HG6_A991ProceTel2 ;
   private boolean[] P09HG6_n991ProceTel2 ;
   private String[] P09HG6_A990ProceTel1 ;
   private boolean[] P09HG6_n990ProceTel1 ;
   private String[] P09HG6_A14029PoceCp2 ;
   private boolean[] P09HG6_n14029PoceCp2 ;
   private String[] P09HG6_A989PoceCp ;
   private boolean[] P09HG6_n989PoceCp ;
   private String[] P09HG6_A787PrvDsc ;
   private boolean[] P09HG6_n787PrvDsc ;
   private String[] P09HG6_A988ProcePob ;
   private boolean[] P09HG6_n988ProcePob ;
   private String[] P09HG6_A994ProceDom ;
   private boolean[] P09HG6_n994ProceDom ;
   private String[] P09HG6_A993ProceNif ;
   private boolean[] P09HG6_n993ProceNif ;
   private String[] P09HG6_A971ProceNom ;
   private boolean[] P09HG6_n971ProceNom ;
   private short[] P09HG6_A970ProceCod ;
   private String[] P09HG7_A396EmprCod ;
   private String[] P09HG7_A989PoceCp ;
   private boolean[] P09HG7_n989PoceCp ;
   private String[] P09HG7_A10391ProEmail ;
   private boolean[] P09HG7_n10391ProEmail ;
   private String[] P09HG7_A10390ProPers ;
   private boolean[] P09HG7_n10390ProPers ;
   private String[] P09HG7_A992ProceTelex ;
   private boolean[] P09HG7_n992ProceTelex ;
   private String[] P09HG7_A991ProceTel2 ;
   private boolean[] P09HG7_n991ProceTel2 ;
   private String[] P09HG7_A990ProceTel1 ;
   private boolean[] P09HG7_n990ProceTel1 ;
   private String[] P09HG7_A14029PoceCp2 ;
   private boolean[] P09HG7_n14029PoceCp2 ;
   private String[] P09HG7_A787PrvDsc ;
   private boolean[] P09HG7_n787PrvDsc ;
   private short[] P09HG7_A781PrvCod ;
   private boolean[] P09HG7_n781PrvCod ;
   private String[] P09HG7_A988ProcePob ;
   private boolean[] P09HG7_n988ProcePob ;
   private String[] P09HG7_A994ProceDom ;
   private boolean[] P09HG7_n994ProceDom ;
   private String[] P09HG7_A993ProceNif ;
   private boolean[] P09HG7_n993ProceNif ;
   private String[] P09HG7_A971ProceNom ;
   private boolean[] P09HG7_n971ProceNom ;
   private short[] P09HG7_A970ProceCod ;
   private String[] P09HG8_A396EmprCod ;
   private String[] P09HG8_A14029PoceCp2 ;
   private boolean[] P09HG8_n14029PoceCp2 ;
   private String[] P09HG8_A10391ProEmail ;
   private boolean[] P09HG8_n10391ProEmail ;
   private String[] P09HG8_A10390ProPers ;
   private boolean[] P09HG8_n10390ProPers ;
   private String[] P09HG8_A992ProceTelex ;
   private boolean[] P09HG8_n992ProceTelex ;
   private String[] P09HG8_A991ProceTel2 ;
   private boolean[] P09HG8_n991ProceTel2 ;
   private String[] P09HG8_A990ProceTel1 ;
   private boolean[] P09HG8_n990ProceTel1 ;
   private String[] P09HG8_A989PoceCp ;
   private boolean[] P09HG8_n989PoceCp ;
   private String[] P09HG8_A787PrvDsc ;
   private boolean[] P09HG8_n787PrvDsc ;
   private short[] P09HG8_A781PrvCod ;
   private boolean[] P09HG8_n781PrvCod ;
   private String[] P09HG8_A988ProcePob ;
   private boolean[] P09HG8_n988ProcePob ;
   private String[] P09HG8_A994ProceDom ;
   private boolean[] P09HG8_n994ProceDom ;
   private String[] P09HG8_A993ProceNif ;
   private boolean[] P09HG8_n993ProceNif ;
   private String[] P09HG8_A971ProceNom ;
   private boolean[] P09HG8_n971ProceNom ;
   private short[] P09HG8_A970ProceCod ;
   private String[] P09HG9_A396EmprCod ;
   private String[] P09HG9_A990ProceTel1 ;
   private boolean[] P09HG9_n990ProceTel1 ;
   private String[] P09HG9_A10391ProEmail ;
   private boolean[] P09HG9_n10391ProEmail ;
   private String[] P09HG9_A10390ProPers ;
   private boolean[] P09HG9_n10390ProPers ;
   private String[] P09HG9_A992ProceTelex ;
   private boolean[] P09HG9_n992ProceTelex ;
   private String[] P09HG9_A991ProceTel2 ;
   private boolean[] P09HG9_n991ProceTel2 ;
   private String[] P09HG9_A14029PoceCp2 ;
   private boolean[] P09HG9_n14029PoceCp2 ;
   private String[] P09HG9_A989PoceCp ;
   private boolean[] P09HG9_n989PoceCp ;
   private String[] P09HG9_A787PrvDsc ;
   private boolean[] P09HG9_n787PrvDsc ;
   private short[] P09HG9_A781PrvCod ;
   private boolean[] P09HG9_n781PrvCod ;
   private String[] P09HG9_A988ProcePob ;
   private boolean[] P09HG9_n988ProcePob ;
   private String[] P09HG9_A994ProceDom ;
   private boolean[] P09HG9_n994ProceDom ;
   private String[] P09HG9_A993ProceNif ;
   private boolean[] P09HG9_n993ProceNif ;
   private String[] P09HG9_A971ProceNom ;
   private boolean[] P09HG9_n971ProceNom ;
   private short[] P09HG9_A970ProceCod ;
   private String[] P09HG10_A396EmprCod ;
   private String[] P09HG10_A991ProceTel2 ;
   private boolean[] P09HG10_n991ProceTel2 ;
   private String[] P09HG10_A10391ProEmail ;
   private boolean[] P09HG10_n10391ProEmail ;
   private String[] P09HG10_A10390ProPers ;
   private boolean[] P09HG10_n10390ProPers ;
   private String[] P09HG10_A992ProceTelex ;
   private boolean[] P09HG10_n992ProceTelex ;
   private String[] P09HG10_A990ProceTel1 ;
   private boolean[] P09HG10_n990ProceTel1 ;
   private String[] P09HG10_A14029PoceCp2 ;
   private boolean[] P09HG10_n14029PoceCp2 ;
   private String[] P09HG10_A989PoceCp ;
   private boolean[] P09HG10_n989PoceCp ;
   private String[] P09HG10_A787PrvDsc ;
   private boolean[] P09HG10_n787PrvDsc ;
   private short[] P09HG10_A781PrvCod ;
   private boolean[] P09HG10_n781PrvCod ;
   private String[] P09HG10_A988ProcePob ;
   private boolean[] P09HG10_n988ProcePob ;
   private String[] P09HG10_A994ProceDom ;
   private boolean[] P09HG10_n994ProceDom ;
   private String[] P09HG10_A993ProceNif ;
   private boolean[] P09HG10_n993ProceNif ;
   private String[] P09HG10_A971ProceNom ;
   private boolean[] P09HG10_n971ProceNom ;
   private short[] P09HG10_A970ProceCod ;
   private String[] P09HG11_A396EmprCod ;
   private String[] P09HG11_A992ProceTelex ;
   private boolean[] P09HG11_n992ProceTelex ;
   private String[] P09HG11_A10391ProEmail ;
   private boolean[] P09HG11_n10391ProEmail ;
   private String[] P09HG11_A10390ProPers ;
   private boolean[] P09HG11_n10390ProPers ;
   private String[] P09HG11_A991ProceTel2 ;
   private boolean[] P09HG11_n991ProceTel2 ;
   private String[] P09HG11_A990ProceTel1 ;
   private boolean[] P09HG11_n990ProceTel1 ;
   private String[] P09HG11_A14029PoceCp2 ;
   private boolean[] P09HG11_n14029PoceCp2 ;
   private String[] P09HG11_A989PoceCp ;
   private boolean[] P09HG11_n989PoceCp ;
   private String[] P09HG11_A787PrvDsc ;
   private boolean[] P09HG11_n787PrvDsc ;
   private short[] P09HG11_A781PrvCod ;
   private boolean[] P09HG11_n781PrvCod ;
   private String[] P09HG11_A988ProcePob ;
   private boolean[] P09HG11_n988ProcePob ;
   private String[] P09HG11_A994ProceDom ;
   private boolean[] P09HG11_n994ProceDom ;
   private String[] P09HG11_A993ProceNif ;
   private boolean[] P09HG11_n993ProceNif ;
   private String[] P09HG11_A971ProceNom ;
   private boolean[] P09HG11_n971ProceNom ;
   private short[] P09HG11_A970ProceCod ;
   private String[] P09HG12_A396EmprCod ;
   private String[] P09HG12_A10390ProPers ;
   private boolean[] P09HG12_n10390ProPers ;
   private String[] P09HG12_A10391ProEmail ;
   private boolean[] P09HG12_n10391ProEmail ;
   private String[] P09HG12_A992ProceTelex ;
   private boolean[] P09HG12_n992ProceTelex ;
   private String[] P09HG12_A991ProceTel2 ;
   private boolean[] P09HG12_n991ProceTel2 ;
   private String[] P09HG12_A990ProceTel1 ;
   private boolean[] P09HG12_n990ProceTel1 ;
   private String[] P09HG12_A14029PoceCp2 ;
   private boolean[] P09HG12_n14029PoceCp2 ;
   private String[] P09HG12_A989PoceCp ;
   private boolean[] P09HG12_n989PoceCp ;
   private String[] P09HG12_A787PrvDsc ;
   private boolean[] P09HG12_n787PrvDsc ;
   private short[] P09HG12_A781PrvCod ;
   private boolean[] P09HG12_n781PrvCod ;
   private String[] P09HG12_A988ProcePob ;
   private boolean[] P09HG12_n988ProcePob ;
   private String[] P09HG12_A994ProceDom ;
   private boolean[] P09HG12_n994ProceDom ;
   private String[] P09HG12_A993ProceNif ;
   private boolean[] P09HG12_n993ProceNif ;
   private String[] P09HG12_A971ProceNom ;
   private boolean[] P09HG12_n971ProceNom ;
   private short[] P09HG12_A970ProceCod ;
   private String[] P09HG13_A396EmprCod ;
   private String[] P09HG13_A10391ProEmail ;
   private boolean[] P09HG13_n10391ProEmail ;
   private String[] P09HG13_A10390ProPers ;
   private boolean[] P09HG13_n10390ProPers ;
   private String[] P09HG13_A992ProceTelex ;
   private boolean[] P09HG13_n992ProceTelex ;
   private String[] P09HG13_A991ProceTel2 ;
   private boolean[] P09HG13_n991ProceTel2 ;
   private String[] P09HG13_A990ProceTel1 ;
   private boolean[] P09HG13_n990ProceTel1 ;
   private String[] P09HG13_A14029PoceCp2 ;
   private boolean[] P09HG13_n14029PoceCp2 ;
   private String[] P09HG13_A989PoceCp ;
   private boolean[] P09HG13_n989PoceCp ;
   private String[] P09HG13_A787PrvDsc ;
   private boolean[] P09HG13_n787PrvDsc ;
   private short[] P09HG13_A781PrvCod ;
   private boolean[] P09HG13_n781PrvCod ;
   private String[] P09HG13_A988ProcePob ;
   private boolean[] P09HG13_n988ProcePob ;
   private String[] P09HG13_A994ProceDom ;
   private boolean[] P09HG13_n994ProceDom ;
   private String[] P09HG13_A993ProceNif ;
   private boolean[] P09HG13_n993ProceNif ;
   private String[] P09HG13_A971ProceNom ;
   private boolean[] P09HG13_n971ProceNom ;
   private short[] P09HG13_A970ProceCod ;
   private GXSimpleCollection<String> AV41Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV46OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class listadodeprocedenciastejido_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09HG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                          short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                          short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                          String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                          String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                          String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                          String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                          String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                          String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                          String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                          String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                          short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                          short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                          String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                          String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                          String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                          String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                          String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                          String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                          String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                          String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                          String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                          String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                          String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                          String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                          String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                          String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                          String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                          String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                          short AV56Procecodfrom ,
                                          short AV57Procecodto ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          String A993ProceNif ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A14029PoceCp2 ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[45];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProceNom, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp2, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom," ;
      scmdbuf += " T1.ProceNif, T1.ProceCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
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
      if ( ! (0==AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (0==AV56Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProceNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09HG3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                          short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                          short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                          String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                          String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                          String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                          String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                          String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                          String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                          String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                          String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                          short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                          short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                          String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                          String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                          String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                          String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                          String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                          String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                          String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                          String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                          String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                          String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                          String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                          String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                          String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                          String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                          String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                          String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                          short AV56Procecodfrom ,
                                          short AV57Procecodto ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          String A993ProceNif ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A14029PoceCp2 ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[45];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp2, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom," ;
      scmdbuf += " T1.ProceNom, T1.ProceCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
         GXv_int4[12] = (byte)(1) ;
         GXv_int4[13] = (byte)(1) ;
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (0==AV56Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProceNif" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09HG4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                          short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                          short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                          String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                          String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                          String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                          String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                          String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                          String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                          String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                          String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                          short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                          short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                          String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                          String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                          String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                          String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                          String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                          String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                          String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                          String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                          String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                          String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                          String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                          String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                          String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                          String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                          String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                          String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                          short AV56Procecodfrom ,
                                          short AV57Procecodto ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          String A993ProceNif ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A14029PoceCp2 ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[45];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProceDom, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp2, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceNif," ;
      scmdbuf += " T1.ProceNom, T1.ProceCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (0==AV56Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProceDom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09HG5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                          short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                          short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                          String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                          String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                          String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                          String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                          String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                          String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                          String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                          String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                          short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                          short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                          String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                          String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                          String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                          String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                          String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                          String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                          String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                          String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                          String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                          String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                          String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                          String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                          String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                          String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                          String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                          String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                          short AV56Procecodfrom ,
                                          short AV57Procecodto ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          String A993ProceNif ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A14029PoceCp2 ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[45];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProcePob, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp2, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProceDom, T1.ProceNif," ;
      scmdbuf += " T1.ProceNom, T1.ProceCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
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
      if ( ! (0==AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (0==AV56Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProcePob" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09HG6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                          short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                          short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                          String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                          String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                          String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                          String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                          String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                          String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                          String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                          String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                          short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                          short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                          String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                          String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                          String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                          String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                          String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                          String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                          String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                          String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                          String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                          String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                          String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                          String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                          String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                          String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                          String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                          String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                          short AV56Procecodfrom ,
                                          short AV57Procecodto ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          String A993ProceNif ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A14029PoceCp2 ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[45];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvCod, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp2, T1.PoceCp, T2.PrvDsc, T1.ProcePob, T1.ProceDom, T1.ProceNif," ;
      scmdbuf += " T1.ProceNom, T1.ProceCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
         GXv_int10[2] = (byte)(1) ;
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
         GXv_int10[10] = (byte)(1) ;
         GXv_int10[11] = (byte)(1) ;
         GXv_int10[12] = (byte)(1) ;
         GXv_int10[13] = (byte)(1) ;
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (0==AV56Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrvCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09HG7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                          short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                          short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                          String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                          String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                          String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                          String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                          String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                          String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                          String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                          String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                          short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                          short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                          String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                          String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                          String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                          String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                          String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                          String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                          String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                          String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                          String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                          String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                          String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                          String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                          String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                          String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                          String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                          String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                          short AV56Procecodfrom ,
                                          short AV57Procecodto ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          String A993ProceNif ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A14029PoceCp2 ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[45];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PoceCp, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp2, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceNif," ;
      scmdbuf += " T1.ProceNom, T1.ProceCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
         GXv_int12[2] = (byte)(1) ;
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
         GXv_int12[9] = (byte)(1) ;
         GXv_int12[10] = (byte)(1) ;
         GXv_int12[11] = (byte)(1) ;
         GXv_int12[12] = (byte)(1) ;
         GXv_int12[13] = (byte)(1) ;
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (0==AV56Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PoceCp" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09HG8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                          short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                          short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                          String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                          String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                          String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                          String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                          String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                          String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                          String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                          String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                          short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                          short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                          String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                          String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                          String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                          String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                          String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                          String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                          String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                          String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                          String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                          String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                          String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                          String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                          String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                          String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                          String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                          String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                          short AV56Procecodfrom ,
                                          short AV57Procecodto ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          String A993ProceNif ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A14029PoceCp2 ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[45];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PoceCp2, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceNif," ;
      scmdbuf += " T1.ProceNom, T1.ProceCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
         GXv_int14[2] = (byte)(1) ;
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
         GXv_int14[10] = (byte)(1) ;
         GXv_int14[11] = (byte)(1) ;
         GXv_int14[12] = (byte)(1) ;
         GXv_int14[13] = (byte)(1) ;
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (0==AV56Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PoceCp2" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09HG9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                          short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                          short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                          String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                          String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                          String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                          String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                          String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                          String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                          String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                          String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                          short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                          short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                          String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                          String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                          String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                          String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                          String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                          String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                          String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                          String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                          String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                          String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                          String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                          String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                          String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                          String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                          String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                          String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                          short AV56Procecodfrom ,
                                          short AV57Procecodto ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          String A993ProceNif ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A14029PoceCp2 ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[45];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProceTel1, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.PoceCp2, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceNif," ;
      scmdbuf += " T1.ProceNom, T1.ProceCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int16[1] = (byte)(1) ;
         GXv_int16[2] = (byte)(1) ;
         GXv_int16[3] = (byte)(1) ;
         GXv_int16[4] = (byte)(1) ;
         GXv_int16[5] = (byte)(1) ;
         GXv_int16[6] = (byte)(1) ;
         GXv_int16[7] = (byte)(1) ;
         GXv_int16[8] = (byte)(1) ;
         GXv_int16[9] = (byte)(1) ;
         GXv_int16[10] = (byte)(1) ;
         GXv_int16[11] = (byte)(1) ;
         GXv_int16[12] = (byte)(1) ;
         GXv_int16[13] = (byte)(1) ;
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      if ( ! (0==AV56Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int16[43] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int16[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProceTel1" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P09HG10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                           short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                           String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                           short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                           String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           short AV56Procecodfrom ,
                                           short AV57Procecodto ,
                                           short A970ProceCod ,
                                           String A971ProceNom ,
                                           String A993ProceNif ,
                                           String A994ProceDom ,
                                           String A988ProcePob ,
                                           short A781PrvCod ,
                                           String A787PrvDsc ,
                                           String A989PoceCp ,
                                           String A14029PoceCp2 ,
                                           String A990ProceTel1 ,
                                           String A991ProceTel2 ,
                                           String A992ProceTelex ,
                                           String A10390ProPers ,
                                           String A10391ProEmail ,
                                           String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[45];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProceTel2, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel1, T1.PoceCp2, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceNif," ;
      scmdbuf += " T1.ProceNom, T1.ProceCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int18[1] = (byte)(1) ;
         GXv_int18[2] = (byte)(1) ;
         GXv_int18[3] = (byte)(1) ;
         GXv_int18[4] = (byte)(1) ;
         GXv_int18[5] = (byte)(1) ;
         GXv_int18[6] = (byte)(1) ;
         GXv_int18[7] = (byte)(1) ;
         GXv_int18[8] = (byte)(1) ;
         GXv_int18[9] = (byte)(1) ;
         GXv_int18[10] = (byte)(1) ;
         GXv_int18[11] = (byte)(1) ;
         GXv_int18[12] = (byte)(1) ;
         GXv_int18[13] = (byte)(1) ;
         GXv_int18[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int18[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int18[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int18[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int18[42] = (byte)(1) ;
      }
      if ( ! (0==AV56Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int18[43] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int18[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProceTel2" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P09HG11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                           short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                           String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                           short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                           String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           short AV56Procecodfrom ,
                                           short AV57Procecodto ,
                                           short A970ProceCod ,
                                           String A971ProceNom ,
                                           String A993ProceNif ,
                                           String A994ProceDom ,
                                           String A988ProcePob ,
                                           short A781PrvCod ,
                                           String A787PrvDsc ,
                                           String A989PoceCp ,
                                           String A14029PoceCp2 ,
                                           String A990ProceTel1 ,
                                           String A991ProceTel2 ,
                                           String A992ProceTelex ,
                                           String A10390ProPers ,
                                           String A10391ProEmail ,
                                           String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[45];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProceTelex, T1.ProEmail, T1.ProPers, T1.ProceTel2, T1.ProceTel1, T1.PoceCp2, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceNif," ;
      scmdbuf += " T1.ProceNom, T1.ProceCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
         GXv_int20[2] = (byte)(1) ;
         GXv_int20[3] = (byte)(1) ;
         GXv_int20[4] = (byte)(1) ;
         GXv_int20[5] = (byte)(1) ;
         GXv_int20[6] = (byte)(1) ;
         GXv_int20[7] = (byte)(1) ;
         GXv_int20[8] = (byte)(1) ;
         GXv_int20[9] = (byte)(1) ;
         GXv_int20[10] = (byte)(1) ;
         GXv_int20[11] = (byte)(1) ;
         GXv_int20[12] = (byte)(1) ;
         GXv_int20[13] = (byte)(1) ;
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( ! (0==AV56Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProceTelex" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P09HG12( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                           short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                           String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                           short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                           String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           short AV56Procecodfrom ,
                                           short AV57Procecodto ,
                                           short A970ProceCod ,
                                           String A971ProceNom ,
                                           String A993ProceNif ,
                                           String A994ProceDom ,
                                           String A988ProcePob ,
                                           short A781PrvCod ,
                                           String A787PrvDsc ,
                                           String A989PoceCp ,
                                           String A14029PoceCp2 ,
                                           String A990ProceTel1 ,
                                           String A991ProceTel2 ,
                                           String A992ProceTelex ,
                                           String A10390ProPers ,
                                           String A10391ProEmail ,
                                           String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[45];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProPers, T1.ProEmail, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp2, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceNif," ;
      scmdbuf += " T1.ProceNom, T1.ProceCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int22[1] = (byte)(1) ;
         GXv_int22[2] = (byte)(1) ;
         GXv_int22[3] = (byte)(1) ;
         GXv_int22[4] = (byte)(1) ;
         GXv_int22[5] = (byte)(1) ;
         GXv_int22[6] = (byte)(1) ;
         GXv_int22[7] = (byte)(1) ;
         GXv_int22[8] = (byte)(1) ;
         GXv_int22[9] = (byte)(1) ;
         GXv_int22[10] = (byte)(1) ;
         GXv_int22[11] = (byte)(1) ;
         GXv_int22[12] = (byte)(1) ;
         GXv_int22[13] = (byte)(1) ;
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int22[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int22[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int22[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int22[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int22[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int22[42] = (byte)(1) ;
      }
      if ( ! (0==AV56Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int22[43] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int22[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProPers" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_P09HG13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext ,
                                           short AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod ,
                                           short AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to ,
                                           String AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel ,
                                           String AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom ,
                                           String AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel ,
                                           String AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif ,
                                           String AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel ,
                                           String AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom ,
                                           String AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel ,
                                           String AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob ,
                                           short AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod ,
                                           short AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to ,
                                           String AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel ,
                                           String AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc ,
                                           String AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel ,
                                           String AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp ,
                                           String AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel ,
                                           String AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2 ,
                                           String AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel ,
                                           String AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1 ,
                                           String AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel ,
                                           String AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2 ,
                                           String AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel ,
                                           String AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex ,
                                           String AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel ,
                                           String AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers ,
                                           String AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel ,
                                           String AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail ,
                                           short AV56Procecodfrom ,
                                           short AV57Procecodto ,
                                           short A970ProceCod ,
                                           String A971ProceNom ,
                                           String A993ProceNif ,
                                           String A994ProceDom ,
                                           String A988ProcePob ,
                                           short A781PrvCod ,
                                           String A787PrvDsc ,
                                           String A989PoceCp ,
                                           String A14029PoceCp2 ,
                                           String A990ProceTel1 ,
                                           String A991ProceTel2 ,
                                           String A992ProceTelex ,
                                           String A10390ProPers ,
                                           String A10391ProEmail ,
                                           String AV64Almacensindetalle_listadodeprocedenciastejido_wcds_1_emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[45];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp2, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom, T1.ProceNif," ;
      scmdbuf += " T1.ProceNom, T1.ProceCod FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Almacensindetalle_listadodeprocedenciastejido_wcds_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int24[1] = (byte)(1) ;
         GXv_int24[2] = (byte)(1) ;
         GXv_int24[3] = (byte)(1) ;
         GXv_int24[4] = (byte)(1) ;
         GXv_int24[5] = (byte)(1) ;
         GXv_int24[6] = (byte)(1) ;
         GXv_int24[7] = (byte)(1) ;
         GXv_int24[8] = (byte)(1) ;
         GXv_int24[9] = (byte)(1) ;
         GXv_int24[10] = (byte)(1) ;
         GXv_int24[11] = (byte)(1) ;
         GXv_int24[12] = (byte)(1) ;
         GXv_int24[13] = (byte)(1) ;
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (0==AV66Almacensindetalle_listadodeprocedenciastejido_wcds_3_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( ! (0==AV67Almacensindetalle_listadodeprocedenciastejido_wcds_4_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV68Almacensindetalle_listadodeprocedenciastejido_wcds_5_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Almacensindetalle_listadodeprocedenciastejido_wcds_6_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV70Almacensindetalle_listadodeprocedenciastejido_wcds_7_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Almacensindetalle_listadodeprocedenciastejido_wcds_8_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV72Almacensindetalle_listadodeprocedenciastejido_wcds_9_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Almacensindetalle_listadodeprocedenciastejido_wcds_10_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_listadodeprocedenciastejido_wcds_11_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_listadodeprocedenciastejido_wcds_12_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( ! (0==AV76Almacensindetalle_listadodeprocedenciastejido_wcds_13_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( ! (0==AV77Almacensindetalle_listadodeprocedenciastejido_wcds_14_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Almacensindetalle_listadodeprocedenciastejido_wcds_15_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Almacensindetalle_listadodeprocedenciastejido_wcds_16_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int24[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV80Almacensindetalle_listadodeprocedenciastejido_wcds_17_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Almacensindetalle_listadodeprocedenciastejido_wcds_18_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int24[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV82Almacensindetalle_listadodeprocedenciastejido_wcds_19_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Almacensindetalle_listadodeprocedenciastejido_wcds_20_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int24[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV84Almacensindetalle_listadodeprocedenciastejido_wcds_21_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Almacensindetalle_listadodeprocedenciastejido_wcds_22_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int24[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV86Almacensindetalle_listadodeprocedenciastejido_wcds_23_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Almacensindetalle_listadodeprocedenciastejido_wcds_24_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int24[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV88Almacensindetalle_listadodeprocedenciastejido_wcds_25_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Almacensindetalle_listadodeprocedenciastejido_wcds_26_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int24[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV90Almacensindetalle_listadodeprocedenciastejido_wcds_27_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Almacensindetalle_listadodeprocedenciastejido_wcds_28_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int24[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV92Almacensindetalle_listadodeprocedenciastejido_wcds_29_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Almacensindetalle_listadodeprocedenciastejido_wcds_30_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int24[42] = (byte)(1) ;
      }
      if ( ! (0==AV56Procecodfrom) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int24[43] = (byte)(1) ;
      }
      if ( ! (0==AV57Procecodto) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int24[44] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProEmail" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
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
                  return conditional_P09HG2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 1 :
                  return conditional_P09HG3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 2 :
                  return conditional_P09HG4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 3 :
                  return conditional_P09HG5(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 4 :
                  return conditional_P09HG6(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 5 :
                  return conditional_P09HG7(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 6 :
                  return conditional_P09HG8(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 7 :
                  return conditional_P09HG9(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 8 :
                  return conditional_P09HG10(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 9 :
                  return conditional_P09HG11(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 10 :
                  return conditional_P09HG12(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
            case 11 :
                  return conditional_P09HG13(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09HG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HG3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HG4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HG5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HG6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HG7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HG8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HG9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HG10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HG11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HG12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HG13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 34);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 34);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 34);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 14);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 14);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 14);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 14);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 9);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 34);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
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
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
            case 10 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
            case 11 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 34);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 6);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 9);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 9);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 9);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 14);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 14);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 40);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 40);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               return;
      }
   }

}

