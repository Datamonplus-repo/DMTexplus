package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodeproveedores_wcgetfilterdata extends GXProcedure
{
   public listadodeproveedores_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeproveedores_wcgetfilterdata.class ), "" );
   }

   public listadodeproveedores_wcgetfilterdata( int remoteHandle ,
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
      listadodeproveedores_wcgetfilterdata.this.aP5 = new String[] {""};
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
      listadodeproveedores_wcgetfilterdata.this.AV52DDOName = aP0;
      listadodeproveedores_wcgetfilterdata.this.AV50SearchTxt = aP1;
      listadodeproveedores_wcgetfilterdata.this.AV51SearchTxtTo = aP2;
      listadodeproveedores_wcgetfilterdata.this.aP3 = aP3;
      listadodeproveedores_wcgetfilterdata.this.aP4 = aP4;
      listadodeproveedores_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV55Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV58OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV60OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVDIR") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVDIROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVPOB") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVPOBOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVCPO") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVCPOOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVCP2") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVCP2OPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVNIF") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVNIFOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVTLF") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVTLFOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVTLX") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVTLXOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVFAX") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVFAXOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVMAIL") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVMAILOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_FPGCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADFPGCODOPTIONS' */
         S221 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_FPGDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFPGDSCOPTIONS' */
         S231 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVREP") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVREPOPTIONS' */
         S241 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV52DDOName), "DDO_PRVCTA") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVCTAOPTIONS' */
         S251 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV56OptionsJson = AV55Options.toJSonString(false) ;
      AV59OptionsDescJson = AV58OptionsDesc.toJSonString(false) ;
      AV61OptionIndexesJson = AV60OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV63Session.getValue("StocksQuimicos.ListadodeProveedores_WCGridState"), "") == 0 )
      {
         AV65GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.ListadodeProveedores_WCGridState"), null, null);
      }
      else
      {
         AV65GridState.fromxml(AV63Session.getValue("StocksQuimicos.ListadodeProveedores_WCGridState"), null, null);
      }
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV65GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV66GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV65GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV68FilterFullText = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV10TFPrvNum = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPrvNum_To = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV12TFPrvNom = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV13TFPrvNom_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR") == 0 )
         {
            AV14TFPrvDir = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR_SEL") == 0 )
         {
            AV15TFPrvDir_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB") == 0 )
         {
            AV16TFPrvPob = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB_SEL") == 0 )
         {
            AV17TFPrvPob_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO") == 0 )
         {
            AV18TFPrvCpo = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO_SEL") == 0 )
         {
            AV19TFPrvCpo_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCP2") == 0 )
         {
            AV20TFPrvCp2 = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCP2_SEL") == 0 )
         {
            AV21TFPrvCp2_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV22TFPrvNif = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV23TFPrvNif_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF") == 0 )
         {
            AV24TFPrvTlf = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF_SEL") == 0 )
         {
            AV25TFPrvTlf_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX") == 0 )
         {
            AV26TFPrvTlx = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX_SEL") == 0 )
         {
            AV27TFPrvTlx_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVFAX") == 0 )
         {
            AV28TFPrvFax = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVFAX_SEL") == 0 )
         {
            AV29TFPrvFax_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMAIL") == 0 )
         {
            AV30TFPrvMail = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMAIL_SEL") == 0 )
         {
            AV31TFPrvMail_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD") == 0 )
         {
            AV32TFFpgCod = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD_SEL") == 0 )
         {
            AV33TFFpgCod_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGDSC") == 0 )
         {
            AV34TFFpgDsc = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGDSC_SEL") == 0 )
         {
            AV35TFFpgDsc_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVVTO") == 0 )
         {
            AV36TFPrvVto = (byte)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFPrvVto_To = (byte)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIAPAG") == 0 )
         {
            AV38TFPrvDiaPag = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFPrvDiaPag_To = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPER") == 0 )
         {
            AV40TFPrvPer = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFPrvPer_To = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP") == 0 )
         {
            AV42TFPrvRep = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP_SEL") == 0 )
         {
            AV43TFPrvRep_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPLAENT") == 0 )
         {
            AV44TFPrvPlaEnt = (short)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFPrvPlaEnt_To = (short)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMETTRA_SEL") == 0 )
         {
            AV46TFPrvMetTra_SelsJson = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV47TFPrvMetTra_Sels.fromJSonString(AV46TFPrvMetTra_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA") == 0 )
         {
            AV48TFPrvCta = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA_SEL") == 0 )
         {
            AV49TFPrvCta_Sel = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV69Emprcod = AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUMFROM") == 0 )
         {
            AV70PrvNumFrom = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUMTO") == 0 )
         {
            AV71PrvNumTo = (int)(GXutil.lval( AV66GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrvNom = AV50SearchTxt ;
      AV13TFPrvNom_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV69Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA2 */
      pr_default.execute(0, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9LA2 = false ;
         A396EmprCod = P09LA2_A396EmprCod[0] ;
         A794PrvNom = P09LA2_A794PrvNom[0] ;
         n794PrvNom = P09LA2_n794PrvNom[0] ;
         A783PrvCta = P09LA2_A783PrvCta[0] ;
         n783PrvCta = P09LA2_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA2_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA2_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA2_A801PrvRep[0] ;
         n801PrvRep = P09LA2_n801PrvRep[0] ;
         A797PrvPer = P09LA2_A797PrvPer[0] ;
         n797PrvPer = P09LA2_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA2_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA2_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA2_A805PrvVto[0] ;
         n805PrvVto = P09LA2_n805PrvVto[0] ;
         A498FpgDsc = P09LA2_A498FpgDsc[0] ;
         n498FpgDsc = P09LA2_n498FpgDsc[0] ;
         A497FpgCod = P09LA2_A497FpgCod[0] ;
         n497FpgCod = P09LA2_n497FpgCod[0] ;
         A6077PrvMail = P09LA2_A6077PrvMail[0] ;
         n6077PrvMail = P09LA2_n6077PrvMail[0] ;
         A6076PrvFax = P09LA2_A6076PrvFax[0] ;
         n6076PrvFax = P09LA2_n6076PrvFax[0] ;
         A804PrvTlx = P09LA2_A804PrvTlx[0] ;
         n804PrvTlx = P09LA2_n804PrvTlx[0] ;
         A803PrvTlf = P09LA2_A803PrvTlf[0] ;
         n803PrvTlf = P09LA2_n803PrvTlf[0] ;
         A793PrvNif = P09LA2_A793PrvNif[0] ;
         n793PrvNif = P09LA2_n793PrvNif[0] ;
         A6075PrvCp2 = P09LA2_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA2_n6075PrvCp2[0] ;
         A782PrvCpo = P09LA2_A782PrvCpo[0] ;
         n782PrvCpo = P09LA2_n782PrvCpo[0] ;
         A799PrvPob = P09LA2_A799PrvPob[0] ;
         n799PrvPob = P09LA2_n799PrvPob[0] ;
         A786PrvDir = P09LA2_A786PrvDir[0] ;
         n786PrvDir = P09LA2_n786PrvDir[0] ;
         A795PrvNum = P09LA2_A795PrvNum[0] ;
         A792PrvMetTra = P09LA2_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA2_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA2_A498FpgDsc[0] ;
         n498FpgDsc = P09LA2_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09LA2_A794PrvNom[0], A794PrvNom) == 0 ) )
            {
               brk9LA2 = false ;
               A396EmprCod = P09LA2_A396EmprCod[0] ;
               A795PrvNum = P09LA2_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA2 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A794PrvNom)==0) )
            {
               AV54Option = A794PrvNom ;
               AV55Options.add(AV54Option, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA2 )
         {
            brk9LA2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRVDIROPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrvDir = AV50SearchTxt ;
      AV15TFPrvDir_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV69Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA3 */
      pr_default.execute(1, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9LA4 = false ;
         A396EmprCod = P09LA3_A396EmprCod[0] ;
         A786PrvDir = P09LA3_A786PrvDir[0] ;
         n786PrvDir = P09LA3_n786PrvDir[0] ;
         A783PrvCta = P09LA3_A783PrvCta[0] ;
         n783PrvCta = P09LA3_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA3_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA3_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA3_A801PrvRep[0] ;
         n801PrvRep = P09LA3_n801PrvRep[0] ;
         A797PrvPer = P09LA3_A797PrvPer[0] ;
         n797PrvPer = P09LA3_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA3_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA3_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA3_A805PrvVto[0] ;
         n805PrvVto = P09LA3_n805PrvVto[0] ;
         A498FpgDsc = P09LA3_A498FpgDsc[0] ;
         n498FpgDsc = P09LA3_n498FpgDsc[0] ;
         A497FpgCod = P09LA3_A497FpgCod[0] ;
         n497FpgCod = P09LA3_n497FpgCod[0] ;
         A6077PrvMail = P09LA3_A6077PrvMail[0] ;
         n6077PrvMail = P09LA3_n6077PrvMail[0] ;
         A6076PrvFax = P09LA3_A6076PrvFax[0] ;
         n6076PrvFax = P09LA3_n6076PrvFax[0] ;
         A804PrvTlx = P09LA3_A804PrvTlx[0] ;
         n804PrvTlx = P09LA3_n804PrvTlx[0] ;
         A803PrvTlf = P09LA3_A803PrvTlf[0] ;
         n803PrvTlf = P09LA3_n803PrvTlf[0] ;
         A793PrvNif = P09LA3_A793PrvNif[0] ;
         n793PrvNif = P09LA3_n793PrvNif[0] ;
         A6075PrvCp2 = P09LA3_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA3_n6075PrvCp2[0] ;
         A782PrvCpo = P09LA3_A782PrvCpo[0] ;
         n782PrvCpo = P09LA3_n782PrvCpo[0] ;
         A799PrvPob = P09LA3_A799PrvPob[0] ;
         n799PrvPob = P09LA3_n799PrvPob[0] ;
         A794PrvNom = P09LA3_A794PrvNom[0] ;
         n794PrvNom = P09LA3_n794PrvNom[0] ;
         A795PrvNum = P09LA3_A795PrvNum[0] ;
         A792PrvMetTra = P09LA3_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA3_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA3_A498FpgDsc[0] ;
         n498FpgDsc = P09LA3_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09LA3_A786PrvDir[0], A786PrvDir) == 0 ) )
            {
               brk9LA4 = false ;
               A396EmprCod = P09LA3_A396EmprCod[0] ;
               A795PrvNum = P09LA3_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A786PrvDir)==0) )
            {
               AV54Option = A786PrvDir ;
               AV55Options.add(AV54Option, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA4 )
         {
            brk9LA4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRVPOBOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrvPob = AV50SearchTxt ;
      AV17TFPrvPob_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV69Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA4 */
      pr_default.execute(2, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9LA6 = false ;
         A396EmprCod = P09LA4_A396EmprCod[0] ;
         A799PrvPob = P09LA4_A799PrvPob[0] ;
         n799PrvPob = P09LA4_n799PrvPob[0] ;
         A783PrvCta = P09LA4_A783PrvCta[0] ;
         n783PrvCta = P09LA4_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA4_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA4_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA4_A801PrvRep[0] ;
         n801PrvRep = P09LA4_n801PrvRep[0] ;
         A797PrvPer = P09LA4_A797PrvPer[0] ;
         n797PrvPer = P09LA4_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA4_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA4_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA4_A805PrvVto[0] ;
         n805PrvVto = P09LA4_n805PrvVto[0] ;
         A498FpgDsc = P09LA4_A498FpgDsc[0] ;
         n498FpgDsc = P09LA4_n498FpgDsc[0] ;
         A497FpgCod = P09LA4_A497FpgCod[0] ;
         n497FpgCod = P09LA4_n497FpgCod[0] ;
         A6077PrvMail = P09LA4_A6077PrvMail[0] ;
         n6077PrvMail = P09LA4_n6077PrvMail[0] ;
         A6076PrvFax = P09LA4_A6076PrvFax[0] ;
         n6076PrvFax = P09LA4_n6076PrvFax[0] ;
         A804PrvTlx = P09LA4_A804PrvTlx[0] ;
         n804PrvTlx = P09LA4_n804PrvTlx[0] ;
         A803PrvTlf = P09LA4_A803PrvTlf[0] ;
         n803PrvTlf = P09LA4_n803PrvTlf[0] ;
         A793PrvNif = P09LA4_A793PrvNif[0] ;
         n793PrvNif = P09LA4_n793PrvNif[0] ;
         A6075PrvCp2 = P09LA4_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA4_n6075PrvCp2[0] ;
         A782PrvCpo = P09LA4_A782PrvCpo[0] ;
         n782PrvCpo = P09LA4_n782PrvCpo[0] ;
         A786PrvDir = P09LA4_A786PrvDir[0] ;
         n786PrvDir = P09LA4_n786PrvDir[0] ;
         A794PrvNom = P09LA4_A794PrvNom[0] ;
         n794PrvNom = P09LA4_n794PrvNom[0] ;
         A795PrvNum = P09LA4_A795PrvNum[0] ;
         A792PrvMetTra = P09LA4_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA4_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA4_A498FpgDsc[0] ;
         n498FpgDsc = P09LA4_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09LA4_A799PrvPob[0], A799PrvPob) == 0 ) )
            {
               brk9LA6 = false ;
               A396EmprCod = P09LA4_A396EmprCod[0] ;
               A795PrvNum = P09LA4_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA6 = true ;
               pr_default.readNext(2);
            }
            if ( ! (GXutil.strcmp("", A799PrvPob)==0) )
            {
               AV54Option = A799PrvPob ;
               AV55Options.add(AV54Option, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA6 )
         {
            brk9LA6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADPRVCPOOPTIONS' Routine */
      returnInSub = false ;
      AV18TFPrvCpo = AV50SearchTxt ;
      AV19TFPrvCpo_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV69Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA5 */
      pr_default.execute(3, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9LA8 = false ;
         A396EmprCod = P09LA5_A396EmprCod[0] ;
         A782PrvCpo = P09LA5_A782PrvCpo[0] ;
         n782PrvCpo = P09LA5_n782PrvCpo[0] ;
         A783PrvCta = P09LA5_A783PrvCta[0] ;
         n783PrvCta = P09LA5_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA5_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA5_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA5_A801PrvRep[0] ;
         n801PrvRep = P09LA5_n801PrvRep[0] ;
         A797PrvPer = P09LA5_A797PrvPer[0] ;
         n797PrvPer = P09LA5_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA5_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA5_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA5_A805PrvVto[0] ;
         n805PrvVto = P09LA5_n805PrvVto[0] ;
         A498FpgDsc = P09LA5_A498FpgDsc[0] ;
         n498FpgDsc = P09LA5_n498FpgDsc[0] ;
         A497FpgCod = P09LA5_A497FpgCod[0] ;
         n497FpgCod = P09LA5_n497FpgCod[0] ;
         A6077PrvMail = P09LA5_A6077PrvMail[0] ;
         n6077PrvMail = P09LA5_n6077PrvMail[0] ;
         A6076PrvFax = P09LA5_A6076PrvFax[0] ;
         n6076PrvFax = P09LA5_n6076PrvFax[0] ;
         A804PrvTlx = P09LA5_A804PrvTlx[0] ;
         n804PrvTlx = P09LA5_n804PrvTlx[0] ;
         A803PrvTlf = P09LA5_A803PrvTlf[0] ;
         n803PrvTlf = P09LA5_n803PrvTlf[0] ;
         A793PrvNif = P09LA5_A793PrvNif[0] ;
         n793PrvNif = P09LA5_n793PrvNif[0] ;
         A6075PrvCp2 = P09LA5_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA5_n6075PrvCp2[0] ;
         A799PrvPob = P09LA5_A799PrvPob[0] ;
         n799PrvPob = P09LA5_n799PrvPob[0] ;
         A786PrvDir = P09LA5_A786PrvDir[0] ;
         n786PrvDir = P09LA5_n786PrvDir[0] ;
         A794PrvNom = P09LA5_A794PrvNom[0] ;
         n794PrvNom = P09LA5_n794PrvNom[0] ;
         A795PrvNum = P09LA5_A795PrvNum[0] ;
         A792PrvMetTra = P09LA5_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA5_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA5_A498FpgDsc[0] ;
         n498FpgDsc = P09LA5_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09LA5_A782PrvCpo[0], A782PrvCpo) == 0 ) )
            {
               brk9LA8 = false ;
               A396EmprCod = P09LA5_A396EmprCod[0] ;
               A795PrvNum = P09LA5_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA8 = true ;
               pr_default.readNext(3);
            }
            if ( ! (GXutil.strcmp("", A782PrvCpo)==0) )
            {
               AV54Option = A782PrvCpo ;
               AV55Options.add(AV54Option, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA8 )
         {
            brk9LA8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADPRVCP2OPTIONS' Routine */
      returnInSub = false ;
      AV20TFPrvCp2 = AV50SearchTxt ;
      AV21TFPrvCp2_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV69Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA6 */
      pr_default.execute(4, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9LA10 = false ;
         A396EmprCod = P09LA6_A396EmprCod[0] ;
         A6075PrvCp2 = P09LA6_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA6_n6075PrvCp2[0] ;
         A783PrvCta = P09LA6_A783PrvCta[0] ;
         n783PrvCta = P09LA6_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA6_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA6_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA6_A801PrvRep[0] ;
         n801PrvRep = P09LA6_n801PrvRep[0] ;
         A797PrvPer = P09LA6_A797PrvPer[0] ;
         n797PrvPer = P09LA6_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA6_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA6_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA6_A805PrvVto[0] ;
         n805PrvVto = P09LA6_n805PrvVto[0] ;
         A498FpgDsc = P09LA6_A498FpgDsc[0] ;
         n498FpgDsc = P09LA6_n498FpgDsc[0] ;
         A497FpgCod = P09LA6_A497FpgCod[0] ;
         n497FpgCod = P09LA6_n497FpgCod[0] ;
         A6077PrvMail = P09LA6_A6077PrvMail[0] ;
         n6077PrvMail = P09LA6_n6077PrvMail[0] ;
         A6076PrvFax = P09LA6_A6076PrvFax[0] ;
         n6076PrvFax = P09LA6_n6076PrvFax[0] ;
         A804PrvTlx = P09LA6_A804PrvTlx[0] ;
         n804PrvTlx = P09LA6_n804PrvTlx[0] ;
         A803PrvTlf = P09LA6_A803PrvTlf[0] ;
         n803PrvTlf = P09LA6_n803PrvTlf[0] ;
         A793PrvNif = P09LA6_A793PrvNif[0] ;
         n793PrvNif = P09LA6_n793PrvNif[0] ;
         A782PrvCpo = P09LA6_A782PrvCpo[0] ;
         n782PrvCpo = P09LA6_n782PrvCpo[0] ;
         A799PrvPob = P09LA6_A799PrvPob[0] ;
         n799PrvPob = P09LA6_n799PrvPob[0] ;
         A786PrvDir = P09LA6_A786PrvDir[0] ;
         n786PrvDir = P09LA6_n786PrvDir[0] ;
         A794PrvNom = P09LA6_A794PrvNom[0] ;
         n794PrvNom = P09LA6_n794PrvNom[0] ;
         A795PrvNum = P09LA6_A795PrvNum[0] ;
         A792PrvMetTra = P09LA6_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA6_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA6_A498FpgDsc[0] ;
         n498FpgDsc = P09LA6_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09LA6_A6075PrvCp2[0], A6075PrvCp2) == 0 ) )
            {
               brk9LA10 = false ;
               A396EmprCod = P09LA6_A396EmprCod[0] ;
               A795PrvNum = P09LA6_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA10 = true ;
               pr_default.readNext(4);
            }
            if ( ! (GXutil.strcmp("", A6075PrvCp2)==0) )
            {
               AV54Option = A6075PrvCp2 ;
               AV55Options.add(AV54Option, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA10 )
         {
            brk9LA10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADPRVNIFOPTIONS' Routine */
      returnInSub = false ;
      AV22TFPrvNif = AV50SearchTxt ;
      AV23TFPrvNif_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV69Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA7 */
      pr_default.execute(5, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9LA12 = false ;
         A396EmprCod = P09LA7_A396EmprCod[0] ;
         A793PrvNif = P09LA7_A793PrvNif[0] ;
         n793PrvNif = P09LA7_n793PrvNif[0] ;
         A783PrvCta = P09LA7_A783PrvCta[0] ;
         n783PrvCta = P09LA7_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA7_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA7_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA7_A801PrvRep[0] ;
         n801PrvRep = P09LA7_n801PrvRep[0] ;
         A797PrvPer = P09LA7_A797PrvPer[0] ;
         n797PrvPer = P09LA7_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA7_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA7_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA7_A805PrvVto[0] ;
         n805PrvVto = P09LA7_n805PrvVto[0] ;
         A498FpgDsc = P09LA7_A498FpgDsc[0] ;
         n498FpgDsc = P09LA7_n498FpgDsc[0] ;
         A497FpgCod = P09LA7_A497FpgCod[0] ;
         n497FpgCod = P09LA7_n497FpgCod[0] ;
         A6077PrvMail = P09LA7_A6077PrvMail[0] ;
         n6077PrvMail = P09LA7_n6077PrvMail[0] ;
         A6076PrvFax = P09LA7_A6076PrvFax[0] ;
         n6076PrvFax = P09LA7_n6076PrvFax[0] ;
         A804PrvTlx = P09LA7_A804PrvTlx[0] ;
         n804PrvTlx = P09LA7_n804PrvTlx[0] ;
         A803PrvTlf = P09LA7_A803PrvTlf[0] ;
         n803PrvTlf = P09LA7_n803PrvTlf[0] ;
         A6075PrvCp2 = P09LA7_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA7_n6075PrvCp2[0] ;
         A782PrvCpo = P09LA7_A782PrvCpo[0] ;
         n782PrvCpo = P09LA7_n782PrvCpo[0] ;
         A799PrvPob = P09LA7_A799PrvPob[0] ;
         n799PrvPob = P09LA7_n799PrvPob[0] ;
         A786PrvDir = P09LA7_A786PrvDir[0] ;
         n786PrvDir = P09LA7_n786PrvDir[0] ;
         A794PrvNom = P09LA7_A794PrvNom[0] ;
         n794PrvNom = P09LA7_n794PrvNom[0] ;
         A795PrvNum = P09LA7_A795PrvNum[0] ;
         A792PrvMetTra = P09LA7_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA7_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA7_A498FpgDsc[0] ;
         n498FpgDsc = P09LA7_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09LA7_A793PrvNif[0], A793PrvNif) == 0 ) )
            {
               brk9LA12 = false ;
               A396EmprCod = P09LA7_A396EmprCod[0] ;
               A795PrvNum = P09LA7_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA12 = true ;
               pr_default.readNext(5);
            }
            if ( ! (GXutil.strcmp("", A793PrvNif)==0) )
            {
               AV54Option = A793PrvNif ;
               AV55Options.add(AV54Option, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA12 )
         {
            brk9LA12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADPRVTLFOPTIONS' Routine */
      returnInSub = false ;
      AV24TFPrvTlf = AV50SearchTxt ;
      AV25TFPrvTlf_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV69Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA8 */
      pr_default.execute(6, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9LA14 = false ;
         A396EmprCod = P09LA8_A396EmprCod[0] ;
         A803PrvTlf = P09LA8_A803PrvTlf[0] ;
         n803PrvTlf = P09LA8_n803PrvTlf[0] ;
         A783PrvCta = P09LA8_A783PrvCta[0] ;
         n783PrvCta = P09LA8_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA8_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA8_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA8_A801PrvRep[0] ;
         n801PrvRep = P09LA8_n801PrvRep[0] ;
         A797PrvPer = P09LA8_A797PrvPer[0] ;
         n797PrvPer = P09LA8_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA8_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA8_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA8_A805PrvVto[0] ;
         n805PrvVto = P09LA8_n805PrvVto[0] ;
         A498FpgDsc = P09LA8_A498FpgDsc[0] ;
         n498FpgDsc = P09LA8_n498FpgDsc[0] ;
         A497FpgCod = P09LA8_A497FpgCod[0] ;
         n497FpgCod = P09LA8_n497FpgCod[0] ;
         A6077PrvMail = P09LA8_A6077PrvMail[0] ;
         n6077PrvMail = P09LA8_n6077PrvMail[0] ;
         A6076PrvFax = P09LA8_A6076PrvFax[0] ;
         n6076PrvFax = P09LA8_n6076PrvFax[0] ;
         A804PrvTlx = P09LA8_A804PrvTlx[0] ;
         n804PrvTlx = P09LA8_n804PrvTlx[0] ;
         A793PrvNif = P09LA8_A793PrvNif[0] ;
         n793PrvNif = P09LA8_n793PrvNif[0] ;
         A6075PrvCp2 = P09LA8_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA8_n6075PrvCp2[0] ;
         A782PrvCpo = P09LA8_A782PrvCpo[0] ;
         n782PrvCpo = P09LA8_n782PrvCpo[0] ;
         A799PrvPob = P09LA8_A799PrvPob[0] ;
         n799PrvPob = P09LA8_n799PrvPob[0] ;
         A786PrvDir = P09LA8_A786PrvDir[0] ;
         n786PrvDir = P09LA8_n786PrvDir[0] ;
         A794PrvNom = P09LA8_A794PrvNom[0] ;
         n794PrvNom = P09LA8_n794PrvNom[0] ;
         A795PrvNum = P09LA8_A795PrvNum[0] ;
         A792PrvMetTra = P09LA8_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA8_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA8_A498FpgDsc[0] ;
         n498FpgDsc = P09LA8_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09LA8_A803PrvTlf[0], A803PrvTlf) == 0 ) )
            {
               brk9LA14 = false ;
               A396EmprCod = P09LA8_A396EmprCod[0] ;
               A795PrvNum = P09LA8_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA14 = true ;
               pr_default.readNext(6);
            }
            if ( ! (GXutil.strcmp("", A803PrvTlf)==0) )
            {
               AV54Option = A803PrvTlf ;
               AV55Options.add(AV54Option, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA14 )
         {
            brk9LA14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADPRVTLXOPTIONS' Routine */
      returnInSub = false ;
      AV26TFPrvTlx = AV50SearchTxt ;
      AV27TFPrvTlx_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV69Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA9 */
      pr_default.execute(7, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk9LA16 = false ;
         A396EmprCod = P09LA9_A396EmprCod[0] ;
         A804PrvTlx = P09LA9_A804PrvTlx[0] ;
         n804PrvTlx = P09LA9_n804PrvTlx[0] ;
         A783PrvCta = P09LA9_A783PrvCta[0] ;
         n783PrvCta = P09LA9_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA9_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA9_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA9_A801PrvRep[0] ;
         n801PrvRep = P09LA9_n801PrvRep[0] ;
         A797PrvPer = P09LA9_A797PrvPer[0] ;
         n797PrvPer = P09LA9_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA9_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA9_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA9_A805PrvVto[0] ;
         n805PrvVto = P09LA9_n805PrvVto[0] ;
         A498FpgDsc = P09LA9_A498FpgDsc[0] ;
         n498FpgDsc = P09LA9_n498FpgDsc[0] ;
         A497FpgCod = P09LA9_A497FpgCod[0] ;
         n497FpgCod = P09LA9_n497FpgCod[0] ;
         A6077PrvMail = P09LA9_A6077PrvMail[0] ;
         n6077PrvMail = P09LA9_n6077PrvMail[0] ;
         A6076PrvFax = P09LA9_A6076PrvFax[0] ;
         n6076PrvFax = P09LA9_n6076PrvFax[0] ;
         A803PrvTlf = P09LA9_A803PrvTlf[0] ;
         n803PrvTlf = P09LA9_n803PrvTlf[0] ;
         A793PrvNif = P09LA9_A793PrvNif[0] ;
         n793PrvNif = P09LA9_n793PrvNif[0] ;
         A6075PrvCp2 = P09LA9_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA9_n6075PrvCp2[0] ;
         A782PrvCpo = P09LA9_A782PrvCpo[0] ;
         n782PrvCpo = P09LA9_n782PrvCpo[0] ;
         A799PrvPob = P09LA9_A799PrvPob[0] ;
         n799PrvPob = P09LA9_n799PrvPob[0] ;
         A786PrvDir = P09LA9_A786PrvDir[0] ;
         n786PrvDir = P09LA9_n786PrvDir[0] ;
         A794PrvNom = P09LA9_A794PrvNom[0] ;
         n794PrvNom = P09LA9_n794PrvNom[0] ;
         A795PrvNum = P09LA9_A795PrvNum[0] ;
         A792PrvMetTra = P09LA9_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA9_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA9_A498FpgDsc[0] ;
         n498FpgDsc = P09LA9_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P09LA9_A804PrvTlx[0], A804PrvTlx) == 0 ) )
            {
               brk9LA16 = false ;
               A396EmprCod = P09LA9_A396EmprCod[0] ;
               A795PrvNum = P09LA9_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA16 = true ;
               pr_default.readNext(7);
            }
            if ( ! (GXutil.strcmp("", A804PrvTlx)==0) )
            {
               AV54Option = A804PrvTlx ;
               AV55Options.add(AV54Option, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA16 )
         {
            brk9LA16 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADPRVFAXOPTIONS' Routine */
      returnInSub = false ;
      AV28TFPrvFax = AV50SearchTxt ;
      AV29TFPrvFax_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV69Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA10 */
      pr_default.execute(8, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk9LA18 = false ;
         A396EmprCod = P09LA10_A396EmprCod[0] ;
         A6076PrvFax = P09LA10_A6076PrvFax[0] ;
         n6076PrvFax = P09LA10_n6076PrvFax[0] ;
         A783PrvCta = P09LA10_A783PrvCta[0] ;
         n783PrvCta = P09LA10_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA10_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA10_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA10_A801PrvRep[0] ;
         n801PrvRep = P09LA10_n801PrvRep[0] ;
         A797PrvPer = P09LA10_A797PrvPer[0] ;
         n797PrvPer = P09LA10_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA10_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA10_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA10_A805PrvVto[0] ;
         n805PrvVto = P09LA10_n805PrvVto[0] ;
         A498FpgDsc = P09LA10_A498FpgDsc[0] ;
         n498FpgDsc = P09LA10_n498FpgDsc[0] ;
         A497FpgCod = P09LA10_A497FpgCod[0] ;
         n497FpgCod = P09LA10_n497FpgCod[0] ;
         A6077PrvMail = P09LA10_A6077PrvMail[0] ;
         n6077PrvMail = P09LA10_n6077PrvMail[0] ;
         A804PrvTlx = P09LA10_A804PrvTlx[0] ;
         n804PrvTlx = P09LA10_n804PrvTlx[0] ;
         A803PrvTlf = P09LA10_A803PrvTlf[0] ;
         n803PrvTlf = P09LA10_n803PrvTlf[0] ;
         A793PrvNif = P09LA10_A793PrvNif[0] ;
         n793PrvNif = P09LA10_n793PrvNif[0] ;
         A6075PrvCp2 = P09LA10_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA10_n6075PrvCp2[0] ;
         A782PrvCpo = P09LA10_A782PrvCpo[0] ;
         n782PrvCpo = P09LA10_n782PrvCpo[0] ;
         A799PrvPob = P09LA10_A799PrvPob[0] ;
         n799PrvPob = P09LA10_n799PrvPob[0] ;
         A786PrvDir = P09LA10_A786PrvDir[0] ;
         n786PrvDir = P09LA10_n786PrvDir[0] ;
         A794PrvNom = P09LA10_A794PrvNom[0] ;
         n794PrvNom = P09LA10_n794PrvNom[0] ;
         A795PrvNum = P09LA10_A795PrvNum[0] ;
         A792PrvMetTra = P09LA10_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA10_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA10_A498FpgDsc[0] ;
         n498FpgDsc = P09LA10_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P09LA10_A6076PrvFax[0], A6076PrvFax) == 0 ) )
            {
               brk9LA18 = false ;
               A396EmprCod = P09LA10_A396EmprCod[0] ;
               A795PrvNum = P09LA10_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA18 = true ;
               pr_default.readNext(8);
            }
            if ( ! (GXutil.strcmp("", A6076PrvFax)==0) )
            {
               AV54Option = A6076PrvFax ;
               AV55Options.add(AV54Option, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA18 )
         {
            brk9LA18 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADPRVMAILOPTIONS' Routine */
      returnInSub = false ;
      AV30TFPrvMail = AV50SearchTxt ;
      AV31TFPrvMail_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV69Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA11 */
      pr_default.execute(9, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk9LA20 = false ;
         A396EmprCod = P09LA11_A396EmprCod[0] ;
         A6077PrvMail = P09LA11_A6077PrvMail[0] ;
         n6077PrvMail = P09LA11_n6077PrvMail[0] ;
         A783PrvCta = P09LA11_A783PrvCta[0] ;
         n783PrvCta = P09LA11_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA11_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA11_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA11_A801PrvRep[0] ;
         n801PrvRep = P09LA11_n801PrvRep[0] ;
         A797PrvPer = P09LA11_A797PrvPer[0] ;
         n797PrvPer = P09LA11_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA11_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA11_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA11_A805PrvVto[0] ;
         n805PrvVto = P09LA11_n805PrvVto[0] ;
         A498FpgDsc = P09LA11_A498FpgDsc[0] ;
         n498FpgDsc = P09LA11_n498FpgDsc[0] ;
         A497FpgCod = P09LA11_A497FpgCod[0] ;
         n497FpgCod = P09LA11_n497FpgCod[0] ;
         A6076PrvFax = P09LA11_A6076PrvFax[0] ;
         n6076PrvFax = P09LA11_n6076PrvFax[0] ;
         A804PrvTlx = P09LA11_A804PrvTlx[0] ;
         n804PrvTlx = P09LA11_n804PrvTlx[0] ;
         A803PrvTlf = P09LA11_A803PrvTlf[0] ;
         n803PrvTlf = P09LA11_n803PrvTlf[0] ;
         A793PrvNif = P09LA11_A793PrvNif[0] ;
         n793PrvNif = P09LA11_n793PrvNif[0] ;
         A6075PrvCp2 = P09LA11_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA11_n6075PrvCp2[0] ;
         A782PrvCpo = P09LA11_A782PrvCpo[0] ;
         n782PrvCpo = P09LA11_n782PrvCpo[0] ;
         A799PrvPob = P09LA11_A799PrvPob[0] ;
         n799PrvPob = P09LA11_n799PrvPob[0] ;
         A786PrvDir = P09LA11_A786PrvDir[0] ;
         n786PrvDir = P09LA11_n786PrvDir[0] ;
         A794PrvNom = P09LA11_A794PrvNom[0] ;
         n794PrvNom = P09LA11_n794PrvNom[0] ;
         A795PrvNum = P09LA11_A795PrvNum[0] ;
         A792PrvMetTra = P09LA11_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA11_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA11_A498FpgDsc[0] ;
         n498FpgDsc = P09LA11_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(P09LA11_A6077PrvMail[0], A6077PrvMail) == 0 ) )
            {
               brk9LA20 = false ;
               A396EmprCod = P09LA11_A396EmprCod[0] ;
               A795PrvNum = P09LA11_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA20 = true ;
               pr_default.readNext(9);
            }
            if ( ! (GXutil.strcmp("", A6077PrvMail)==0) )
            {
               AV54Option = A6077PrvMail ;
               AV55Options.add(AV54Option, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA20 )
         {
            brk9LA20 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   public void S221( )
   {
      /* 'LOADFPGCODOPTIONS' Routine */
      returnInSub = false ;
      AV32TFFpgCod = AV50SearchTxt ;
      AV33TFFpgCod_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(10, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           AV69Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA12 */
      pr_default.execute(10, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         brk9LA22 = false ;
         A396EmprCod = P09LA12_A396EmprCod[0] ;
         A497FpgCod = P09LA12_A497FpgCod[0] ;
         n497FpgCod = P09LA12_n497FpgCod[0] ;
         A783PrvCta = P09LA12_A783PrvCta[0] ;
         n783PrvCta = P09LA12_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA12_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA12_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA12_A801PrvRep[0] ;
         n801PrvRep = P09LA12_n801PrvRep[0] ;
         A797PrvPer = P09LA12_A797PrvPer[0] ;
         n797PrvPer = P09LA12_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA12_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA12_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA12_A805PrvVto[0] ;
         n805PrvVto = P09LA12_n805PrvVto[0] ;
         A498FpgDsc = P09LA12_A498FpgDsc[0] ;
         n498FpgDsc = P09LA12_n498FpgDsc[0] ;
         A6077PrvMail = P09LA12_A6077PrvMail[0] ;
         n6077PrvMail = P09LA12_n6077PrvMail[0] ;
         A6076PrvFax = P09LA12_A6076PrvFax[0] ;
         n6076PrvFax = P09LA12_n6076PrvFax[0] ;
         A804PrvTlx = P09LA12_A804PrvTlx[0] ;
         n804PrvTlx = P09LA12_n804PrvTlx[0] ;
         A803PrvTlf = P09LA12_A803PrvTlf[0] ;
         n803PrvTlf = P09LA12_n803PrvTlf[0] ;
         A793PrvNif = P09LA12_A793PrvNif[0] ;
         n793PrvNif = P09LA12_n793PrvNif[0] ;
         A6075PrvCp2 = P09LA12_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA12_n6075PrvCp2[0] ;
         A782PrvCpo = P09LA12_A782PrvCpo[0] ;
         n782PrvCpo = P09LA12_n782PrvCpo[0] ;
         A799PrvPob = P09LA12_A799PrvPob[0] ;
         n799PrvPob = P09LA12_n799PrvPob[0] ;
         A786PrvDir = P09LA12_A786PrvDir[0] ;
         n786PrvDir = P09LA12_n786PrvDir[0] ;
         A794PrvNom = P09LA12_A794PrvNom[0] ;
         n794PrvNom = P09LA12_n794PrvNom[0] ;
         A795PrvNum = P09LA12_A795PrvNum[0] ;
         A792PrvMetTra = P09LA12_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA12_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA12_A498FpgDsc[0] ;
         n498FpgDsc = P09LA12_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(P09LA12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09LA12_A497FpgCod[0], A497FpgCod) == 0 ) )
            {
               brk9LA22 = false ;
               A795PrvNum = P09LA12_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA22 = true ;
               pr_default.readNext(10);
            }
            if ( ! (GXutil.strcmp("", A497FpgCod)==0) )
            {
               AV54Option = A497FpgCod ;
               AV57OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A497FpgCod, "@!"))) ;
               AV55Options.add(AV54Option, 0);
               AV58OptionsDesc.add(AV57OptionDesc, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA22 )
         {
            brk9LA22 = true ;
            pr_default.readNext(10);
         }
      }
      pr_default.close(10);
   }

   public void S231( )
   {
      /* 'LOADFPGDSCOPTIONS' Routine */
      returnInSub = false ;
      AV34TFFpgDsc = AV50SearchTxt ;
      AV35TFFpgDsc_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(11, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           AV69Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA13 */
      pr_default.execute(11, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         brk9LA24 = false ;
         A497FpgCod = P09LA13_A497FpgCod[0] ;
         n497FpgCod = P09LA13_n497FpgCod[0] ;
         A396EmprCod = P09LA13_A396EmprCod[0] ;
         A783PrvCta = P09LA13_A783PrvCta[0] ;
         n783PrvCta = P09LA13_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA13_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA13_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA13_A801PrvRep[0] ;
         n801PrvRep = P09LA13_n801PrvRep[0] ;
         A797PrvPer = P09LA13_A797PrvPer[0] ;
         n797PrvPer = P09LA13_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA13_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA13_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA13_A805PrvVto[0] ;
         n805PrvVto = P09LA13_n805PrvVto[0] ;
         A498FpgDsc = P09LA13_A498FpgDsc[0] ;
         n498FpgDsc = P09LA13_n498FpgDsc[0] ;
         A6077PrvMail = P09LA13_A6077PrvMail[0] ;
         n6077PrvMail = P09LA13_n6077PrvMail[0] ;
         A6076PrvFax = P09LA13_A6076PrvFax[0] ;
         n6076PrvFax = P09LA13_n6076PrvFax[0] ;
         A804PrvTlx = P09LA13_A804PrvTlx[0] ;
         n804PrvTlx = P09LA13_n804PrvTlx[0] ;
         A803PrvTlf = P09LA13_A803PrvTlf[0] ;
         n803PrvTlf = P09LA13_n803PrvTlf[0] ;
         A793PrvNif = P09LA13_A793PrvNif[0] ;
         n793PrvNif = P09LA13_n793PrvNif[0] ;
         A6075PrvCp2 = P09LA13_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA13_n6075PrvCp2[0] ;
         A782PrvCpo = P09LA13_A782PrvCpo[0] ;
         n782PrvCpo = P09LA13_n782PrvCpo[0] ;
         A799PrvPob = P09LA13_A799PrvPob[0] ;
         n799PrvPob = P09LA13_n799PrvPob[0] ;
         A786PrvDir = P09LA13_A786PrvDir[0] ;
         n786PrvDir = P09LA13_n786PrvDir[0] ;
         A794PrvNom = P09LA13_A794PrvNom[0] ;
         n794PrvNom = P09LA13_n794PrvNom[0] ;
         A795PrvNum = P09LA13_A795PrvNum[0] ;
         A792PrvMetTra = P09LA13_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA13_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA13_A498FpgDsc[0] ;
         n498FpgDsc = P09LA13_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(P09LA13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09LA13_A497FpgCod[0], A497FpgCod) == 0 ) )
            {
               brk9LA24 = false ;
               A795PrvNum = P09LA13_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA24 = true ;
               pr_default.readNext(11);
            }
            if ( ! (GXutil.strcmp("", A498FpgDsc)==0) )
            {
               AV54Option = A498FpgDsc ;
               AV53InsertIndex = 1 ;
               while ( ( AV53InsertIndex <= AV55Options.size() ) && ( GXutil.strcmp((String)AV55Options.elementAt(-1+AV53InsertIndex), AV54Option) < 0 ) )
               {
                  AV53InsertIndex = (int)(AV53InsertIndex+1) ;
               }
               AV55Options.add(AV54Option, AV53InsertIndex);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), AV53InsertIndex);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA24 )
         {
            brk9LA24 = true ;
            pr_default.readNext(11);
         }
      }
      pr_default.close(11);
   }

   public void S241( )
   {
      /* 'LOADPRVREPOPTIONS' Routine */
      returnInSub = false ;
      AV42TFPrvRep = AV50SearchTxt ;
      AV43TFPrvRep_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(12, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV69Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA14 */
      pr_default.execute(12, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(12) != 101) )
      {
         brk9LA26 = false ;
         A396EmprCod = P09LA14_A396EmprCod[0] ;
         A801PrvRep = P09LA14_A801PrvRep[0] ;
         n801PrvRep = P09LA14_n801PrvRep[0] ;
         A783PrvCta = P09LA14_A783PrvCta[0] ;
         n783PrvCta = P09LA14_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA14_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA14_n798PrvPlaEnt[0] ;
         A797PrvPer = P09LA14_A797PrvPer[0] ;
         n797PrvPer = P09LA14_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA14_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA14_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA14_A805PrvVto[0] ;
         n805PrvVto = P09LA14_n805PrvVto[0] ;
         A498FpgDsc = P09LA14_A498FpgDsc[0] ;
         n498FpgDsc = P09LA14_n498FpgDsc[0] ;
         A497FpgCod = P09LA14_A497FpgCod[0] ;
         n497FpgCod = P09LA14_n497FpgCod[0] ;
         A6077PrvMail = P09LA14_A6077PrvMail[0] ;
         n6077PrvMail = P09LA14_n6077PrvMail[0] ;
         A6076PrvFax = P09LA14_A6076PrvFax[0] ;
         n6076PrvFax = P09LA14_n6076PrvFax[0] ;
         A804PrvTlx = P09LA14_A804PrvTlx[0] ;
         n804PrvTlx = P09LA14_n804PrvTlx[0] ;
         A803PrvTlf = P09LA14_A803PrvTlf[0] ;
         n803PrvTlf = P09LA14_n803PrvTlf[0] ;
         A793PrvNif = P09LA14_A793PrvNif[0] ;
         n793PrvNif = P09LA14_n793PrvNif[0] ;
         A6075PrvCp2 = P09LA14_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA14_n6075PrvCp2[0] ;
         A782PrvCpo = P09LA14_A782PrvCpo[0] ;
         n782PrvCpo = P09LA14_n782PrvCpo[0] ;
         A799PrvPob = P09LA14_A799PrvPob[0] ;
         n799PrvPob = P09LA14_n799PrvPob[0] ;
         A786PrvDir = P09LA14_A786PrvDir[0] ;
         n786PrvDir = P09LA14_n786PrvDir[0] ;
         A794PrvNom = P09LA14_A794PrvNom[0] ;
         n794PrvNom = P09LA14_n794PrvNom[0] ;
         A795PrvNum = P09LA14_A795PrvNum[0] ;
         A792PrvMetTra = P09LA14_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA14_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA14_A498FpgDsc[0] ;
         n498FpgDsc = P09LA14_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(P09LA14_A801PrvRep[0], A801PrvRep) == 0 ) )
            {
               brk9LA26 = false ;
               A396EmprCod = P09LA14_A396EmprCod[0] ;
               A795PrvNum = P09LA14_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA26 = true ;
               pr_default.readNext(12);
            }
            if ( ! (GXutil.strcmp("", A801PrvRep)==0) )
            {
               AV54Option = A801PrvRep ;
               AV55Options.add(AV54Option, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA26 )
         {
            brk9LA26 = true ;
            pr_default.readNext(12);
         }
      }
      pr_default.close(12);
   }

   public void S251( )
   {
      /* 'LOADPRVCTAOPTIONS' Routine */
      returnInSub = false ;
      AV48TFPrvCta = AV50SearchTxt ;
      AV49TFPrvCta_Sel = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV68FilterFullText ;
      AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV10TFPrvNum ;
      AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV11TFPrvNum_To ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV12TFPrvNom ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV13TFPrvNom_Sel ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV14TFPrvDir ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV15TFPrvDir_Sel ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV16TFPrvPob ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV17TFPrvPob_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV18TFPrvCpo ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV19TFPrvCpo_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV20TFPrvCp2 ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV21TFPrvCp2_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV22TFPrvNif ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV23TFPrvNif_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV24TFPrvTlf ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV25TFPrvTlf_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV26TFPrvTlx ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV27TFPrvTlx_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV28TFPrvFax ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV29TFPrvFax_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV30TFPrvMail ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV31TFPrvMail_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV32TFFpgCod ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV33TFFpgCod_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV34TFFpgDsc ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV35TFFpgDsc_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV36TFPrvVto ;
      AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV37TFPrvVto_To ;
      AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV38TFPrvDiaPag ;
      AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV39TFPrvDiaPag_To ;
      AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV40TFPrvPer ;
      AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV41TFPrvPer_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV42TFPrvRep ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV43TFPrvRep_Sel ;
      AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV44TFPrvPlaEnt ;
      AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV45TFPrvPlaEnt_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV47TFPrvMetTra_Sels ;
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV48TFPrvCta ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV49TFPrvCta_Sel ;
      pr_default.dynParam(13, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Integer.valueOf(AV70PrvNumFrom) ,
                                           Integer.valueOf(AV71PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           A396EmprCod ,
                                           AV69Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09LA15 */
      pr_default.execute(13, new Object[] {AV69Emprcod, Integer.valueOf(AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Integer.valueOf(AV70PrvNumFrom), Integer.valueOf(AV71PrvNumTo)});
      while ( (pr_default.getStatus(13) != 101) )
      {
         brk9LA28 = false ;
         A396EmprCod = P09LA15_A396EmprCod[0] ;
         A783PrvCta = P09LA15_A783PrvCta[0] ;
         n783PrvCta = P09LA15_n783PrvCta[0] ;
         A798PrvPlaEnt = P09LA15_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09LA15_n798PrvPlaEnt[0] ;
         A801PrvRep = P09LA15_A801PrvRep[0] ;
         n801PrvRep = P09LA15_n801PrvRep[0] ;
         A797PrvPer = P09LA15_A797PrvPer[0] ;
         n797PrvPer = P09LA15_n797PrvPer[0] ;
         A785PrvDiaPag = P09LA15_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09LA15_n785PrvDiaPag[0] ;
         A805PrvVto = P09LA15_A805PrvVto[0] ;
         n805PrvVto = P09LA15_n805PrvVto[0] ;
         A498FpgDsc = P09LA15_A498FpgDsc[0] ;
         n498FpgDsc = P09LA15_n498FpgDsc[0] ;
         A497FpgCod = P09LA15_A497FpgCod[0] ;
         n497FpgCod = P09LA15_n497FpgCod[0] ;
         A6077PrvMail = P09LA15_A6077PrvMail[0] ;
         n6077PrvMail = P09LA15_n6077PrvMail[0] ;
         A6076PrvFax = P09LA15_A6076PrvFax[0] ;
         n6076PrvFax = P09LA15_n6076PrvFax[0] ;
         A804PrvTlx = P09LA15_A804PrvTlx[0] ;
         n804PrvTlx = P09LA15_n804PrvTlx[0] ;
         A803PrvTlf = P09LA15_A803PrvTlf[0] ;
         n803PrvTlf = P09LA15_n803PrvTlf[0] ;
         A793PrvNif = P09LA15_A793PrvNif[0] ;
         n793PrvNif = P09LA15_n793PrvNif[0] ;
         A6075PrvCp2 = P09LA15_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09LA15_n6075PrvCp2[0] ;
         A782PrvCpo = P09LA15_A782PrvCpo[0] ;
         n782PrvCpo = P09LA15_n782PrvCpo[0] ;
         A799PrvPob = P09LA15_A799PrvPob[0] ;
         n799PrvPob = P09LA15_n799PrvPob[0] ;
         A786PrvDir = P09LA15_A786PrvDir[0] ;
         n786PrvDir = P09LA15_n786PrvDir[0] ;
         A794PrvNom = P09LA15_A794PrvNom[0] ;
         n794PrvNom = P09LA15_n794PrvNom[0] ;
         A795PrvNum = P09LA15_A795PrvNum[0] ;
         A792PrvMetTra = P09LA15_A792PrvMetTra[0] ;
         n792PrvMetTra = P09LA15_n792PrvMetTra[0] ;
         A498FpgDsc = P09LA15_A498FpgDsc[0] ;
         n498FpgDsc = P09LA15_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV62count = 0 ;
            while ( (pr_default.getStatus(13) != 101) && ( GXutil.strcmp(P09LA15_A783PrvCta[0], A783PrvCta) == 0 ) )
            {
               brk9LA28 = false ;
               A396EmprCod = P09LA15_A396EmprCod[0] ;
               A795PrvNum = P09LA15_A795PrvNum[0] ;
               AV62count = (long)(AV62count+1) ;
               brk9LA28 = true ;
               pr_default.readNext(13);
            }
            if ( ! (GXutil.strcmp("", A783PrvCta)==0) )
            {
               AV54Option = A783PrvCta ;
               AV55Options.add(AV54Option, 0);
               AV60OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV62count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV55Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LA28 )
         {
            brk9LA28 = true ;
            pr_default.readNext(13);
         }
      }
      pr_default.close(13);
   }

   protected void cleanup( )
   {
      this.aP3[0] = listadodeproveedores_wcgetfilterdata.this.AV56OptionsJson;
      this.aP4[0] = listadodeproveedores_wcgetfilterdata.this.AV59OptionsDescJson;
      this.aP5[0] = listadodeproveedores_wcgetfilterdata.this.AV61OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV56OptionsJson = "" ;
      AV59OptionsDescJson = "" ;
      AV61OptionIndexesJson = "" ;
      AV55Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV58OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV63Session = httpContext.getWebSession();
      AV65GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV66GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV68FilterFullText = "" ;
      AV12TFPrvNom = "" ;
      AV13TFPrvNom_Sel = "" ;
      AV14TFPrvDir = "" ;
      AV15TFPrvDir_Sel = "" ;
      AV16TFPrvPob = "" ;
      AV17TFPrvPob_Sel = "" ;
      AV18TFPrvCpo = "" ;
      AV19TFPrvCpo_Sel = "" ;
      AV20TFPrvCp2 = "" ;
      AV21TFPrvCp2_Sel = "" ;
      AV22TFPrvNif = "" ;
      AV23TFPrvNif_Sel = "" ;
      AV24TFPrvTlf = "" ;
      AV25TFPrvTlf_Sel = "" ;
      AV26TFPrvTlx = "" ;
      AV27TFPrvTlx_Sel = "" ;
      AV28TFPrvFax = "" ;
      AV29TFPrvFax_Sel = "" ;
      AV30TFPrvMail = "" ;
      AV31TFPrvMail_Sel = "" ;
      AV32TFFpgCod = "" ;
      AV33TFFpgCod_Sel = "" ;
      AV34TFFpgDsc = "" ;
      AV35TFFpgDsc_Sel = "" ;
      AV42TFPrvRep = "" ;
      AV43TFPrvRep_Sel = "" ;
      AV46TFPrvMetTra_SelsJson = "" ;
      AV47TFPrvMetTra_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48TFPrvCta = "" ;
      AV49TFPrvCta_Sel = "" ;
      AV69Emprcod = "" ;
      A794PrvNom = "" ;
      AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = "" ;
      AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = "" ;
      AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = "" ;
      AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = "" ;
      AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = "" ;
      AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = "" ;
      AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = "" ;
      AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = "" ;
      AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = "" ;
      AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = "" ;
      AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = "" ;
      AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = "" ;
      AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = "" ;
      AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = "" ;
      AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = "" ;
      AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = "" ;
      AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = "" ;
      AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = "" ;
      AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = "" ;
      AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = "" ;
      AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = "" ;
      AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = "" ;
      AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = "" ;
      AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = "" ;
      AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = "" ;
      AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = "" ;
      AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = "" ;
      AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = "" ;
      AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = "" ;
      lV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = "" ;
      lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = "" ;
      lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = "" ;
      lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = "" ;
      lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = "" ;
      lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = "" ;
      lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = "" ;
      lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = "" ;
      lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = "" ;
      lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = "" ;
      lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = "" ;
      lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = "" ;
      lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = "" ;
      lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = "" ;
      A792PrvMetTra = "" ;
      A786PrvDir = "" ;
      A799PrvPob = "" ;
      A782PrvCpo = "" ;
      A6075PrvCp2 = "" ;
      A793PrvNif = "" ;
      A803PrvTlf = "" ;
      A804PrvTlx = "" ;
      A6076PrvFax = "" ;
      A6077PrvMail = "" ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      A801PrvRep = "" ;
      A783PrvCta = "" ;
      A396EmprCod = "" ;
      P09LA2_A396EmprCod = new String[] {""} ;
      P09LA2_A794PrvNom = new String[] {""} ;
      P09LA2_n794PrvNom = new boolean[] {false} ;
      P09LA2_A783PrvCta = new String[] {""} ;
      P09LA2_n783PrvCta = new boolean[] {false} ;
      P09LA2_A798PrvPlaEnt = new short[1] ;
      P09LA2_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA2_A801PrvRep = new String[] {""} ;
      P09LA2_n801PrvRep = new boolean[] {false} ;
      P09LA2_A797PrvPer = new int[1] ;
      P09LA2_n797PrvPer = new boolean[] {false} ;
      P09LA2_A785PrvDiaPag = new int[1] ;
      P09LA2_n785PrvDiaPag = new boolean[] {false} ;
      P09LA2_A805PrvVto = new byte[1] ;
      P09LA2_n805PrvVto = new boolean[] {false} ;
      P09LA2_A498FpgDsc = new String[] {""} ;
      P09LA2_n498FpgDsc = new boolean[] {false} ;
      P09LA2_A497FpgCod = new String[] {""} ;
      P09LA2_n497FpgCod = new boolean[] {false} ;
      P09LA2_A6077PrvMail = new String[] {""} ;
      P09LA2_n6077PrvMail = new boolean[] {false} ;
      P09LA2_A6076PrvFax = new String[] {""} ;
      P09LA2_n6076PrvFax = new boolean[] {false} ;
      P09LA2_A804PrvTlx = new String[] {""} ;
      P09LA2_n804PrvTlx = new boolean[] {false} ;
      P09LA2_A803PrvTlf = new String[] {""} ;
      P09LA2_n803PrvTlf = new boolean[] {false} ;
      P09LA2_A793PrvNif = new String[] {""} ;
      P09LA2_n793PrvNif = new boolean[] {false} ;
      P09LA2_A6075PrvCp2 = new String[] {""} ;
      P09LA2_n6075PrvCp2 = new boolean[] {false} ;
      P09LA2_A782PrvCpo = new String[] {""} ;
      P09LA2_n782PrvCpo = new boolean[] {false} ;
      P09LA2_A799PrvPob = new String[] {""} ;
      P09LA2_n799PrvPob = new boolean[] {false} ;
      P09LA2_A786PrvDir = new String[] {""} ;
      P09LA2_n786PrvDir = new boolean[] {false} ;
      P09LA2_A795PrvNum = new int[1] ;
      P09LA2_A792PrvMetTra = new String[] {""} ;
      P09LA2_n792PrvMetTra = new boolean[] {false} ;
      AV54Option = "" ;
      P09LA3_A396EmprCod = new String[] {""} ;
      P09LA3_A786PrvDir = new String[] {""} ;
      P09LA3_n786PrvDir = new boolean[] {false} ;
      P09LA3_A783PrvCta = new String[] {""} ;
      P09LA3_n783PrvCta = new boolean[] {false} ;
      P09LA3_A798PrvPlaEnt = new short[1] ;
      P09LA3_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA3_A801PrvRep = new String[] {""} ;
      P09LA3_n801PrvRep = new boolean[] {false} ;
      P09LA3_A797PrvPer = new int[1] ;
      P09LA3_n797PrvPer = new boolean[] {false} ;
      P09LA3_A785PrvDiaPag = new int[1] ;
      P09LA3_n785PrvDiaPag = new boolean[] {false} ;
      P09LA3_A805PrvVto = new byte[1] ;
      P09LA3_n805PrvVto = new boolean[] {false} ;
      P09LA3_A498FpgDsc = new String[] {""} ;
      P09LA3_n498FpgDsc = new boolean[] {false} ;
      P09LA3_A497FpgCod = new String[] {""} ;
      P09LA3_n497FpgCod = new boolean[] {false} ;
      P09LA3_A6077PrvMail = new String[] {""} ;
      P09LA3_n6077PrvMail = new boolean[] {false} ;
      P09LA3_A6076PrvFax = new String[] {""} ;
      P09LA3_n6076PrvFax = new boolean[] {false} ;
      P09LA3_A804PrvTlx = new String[] {""} ;
      P09LA3_n804PrvTlx = new boolean[] {false} ;
      P09LA3_A803PrvTlf = new String[] {""} ;
      P09LA3_n803PrvTlf = new boolean[] {false} ;
      P09LA3_A793PrvNif = new String[] {""} ;
      P09LA3_n793PrvNif = new boolean[] {false} ;
      P09LA3_A6075PrvCp2 = new String[] {""} ;
      P09LA3_n6075PrvCp2 = new boolean[] {false} ;
      P09LA3_A782PrvCpo = new String[] {""} ;
      P09LA3_n782PrvCpo = new boolean[] {false} ;
      P09LA3_A799PrvPob = new String[] {""} ;
      P09LA3_n799PrvPob = new boolean[] {false} ;
      P09LA3_A794PrvNom = new String[] {""} ;
      P09LA3_n794PrvNom = new boolean[] {false} ;
      P09LA3_A795PrvNum = new int[1] ;
      P09LA3_A792PrvMetTra = new String[] {""} ;
      P09LA3_n792PrvMetTra = new boolean[] {false} ;
      P09LA4_A396EmprCod = new String[] {""} ;
      P09LA4_A799PrvPob = new String[] {""} ;
      P09LA4_n799PrvPob = new boolean[] {false} ;
      P09LA4_A783PrvCta = new String[] {""} ;
      P09LA4_n783PrvCta = new boolean[] {false} ;
      P09LA4_A798PrvPlaEnt = new short[1] ;
      P09LA4_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA4_A801PrvRep = new String[] {""} ;
      P09LA4_n801PrvRep = new boolean[] {false} ;
      P09LA4_A797PrvPer = new int[1] ;
      P09LA4_n797PrvPer = new boolean[] {false} ;
      P09LA4_A785PrvDiaPag = new int[1] ;
      P09LA4_n785PrvDiaPag = new boolean[] {false} ;
      P09LA4_A805PrvVto = new byte[1] ;
      P09LA4_n805PrvVto = new boolean[] {false} ;
      P09LA4_A498FpgDsc = new String[] {""} ;
      P09LA4_n498FpgDsc = new boolean[] {false} ;
      P09LA4_A497FpgCod = new String[] {""} ;
      P09LA4_n497FpgCod = new boolean[] {false} ;
      P09LA4_A6077PrvMail = new String[] {""} ;
      P09LA4_n6077PrvMail = new boolean[] {false} ;
      P09LA4_A6076PrvFax = new String[] {""} ;
      P09LA4_n6076PrvFax = new boolean[] {false} ;
      P09LA4_A804PrvTlx = new String[] {""} ;
      P09LA4_n804PrvTlx = new boolean[] {false} ;
      P09LA4_A803PrvTlf = new String[] {""} ;
      P09LA4_n803PrvTlf = new boolean[] {false} ;
      P09LA4_A793PrvNif = new String[] {""} ;
      P09LA4_n793PrvNif = new boolean[] {false} ;
      P09LA4_A6075PrvCp2 = new String[] {""} ;
      P09LA4_n6075PrvCp2 = new boolean[] {false} ;
      P09LA4_A782PrvCpo = new String[] {""} ;
      P09LA4_n782PrvCpo = new boolean[] {false} ;
      P09LA4_A786PrvDir = new String[] {""} ;
      P09LA4_n786PrvDir = new boolean[] {false} ;
      P09LA4_A794PrvNom = new String[] {""} ;
      P09LA4_n794PrvNom = new boolean[] {false} ;
      P09LA4_A795PrvNum = new int[1] ;
      P09LA4_A792PrvMetTra = new String[] {""} ;
      P09LA4_n792PrvMetTra = new boolean[] {false} ;
      P09LA5_A396EmprCod = new String[] {""} ;
      P09LA5_A782PrvCpo = new String[] {""} ;
      P09LA5_n782PrvCpo = new boolean[] {false} ;
      P09LA5_A783PrvCta = new String[] {""} ;
      P09LA5_n783PrvCta = new boolean[] {false} ;
      P09LA5_A798PrvPlaEnt = new short[1] ;
      P09LA5_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA5_A801PrvRep = new String[] {""} ;
      P09LA5_n801PrvRep = new boolean[] {false} ;
      P09LA5_A797PrvPer = new int[1] ;
      P09LA5_n797PrvPer = new boolean[] {false} ;
      P09LA5_A785PrvDiaPag = new int[1] ;
      P09LA5_n785PrvDiaPag = new boolean[] {false} ;
      P09LA5_A805PrvVto = new byte[1] ;
      P09LA5_n805PrvVto = new boolean[] {false} ;
      P09LA5_A498FpgDsc = new String[] {""} ;
      P09LA5_n498FpgDsc = new boolean[] {false} ;
      P09LA5_A497FpgCod = new String[] {""} ;
      P09LA5_n497FpgCod = new boolean[] {false} ;
      P09LA5_A6077PrvMail = new String[] {""} ;
      P09LA5_n6077PrvMail = new boolean[] {false} ;
      P09LA5_A6076PrvFax = new String[] {""} ;
      P09LA5_n6076PrvFax = new boolean[] {false} ;
      P09LA5_A804PrvTlx = new String[] {""} ;
      P09LA5_n804PrvTlx = new boolean[] {false} ;
      P09LA5_A803PrvTlf = new String[] {""} ;
      P09LA5_n803PrvTlf = new boolean[] {false} ;
      P09LA5_A793PrvNif = new String[] {""} ;
      P09LA5_n793PrvNif = new boolean[] {false} ;
      P09LA5_A6075PrvCp2 = new String[] {""} ;
      P09LA5_n6075PrvCp2 = new boolean[] {false} ;
      P09LA5_A799PrvPob = new String[] {""} ;
      P09LA5_n799PrvPob = new boolean[] {false} ;
      P09LA5_A786PrvDir = new String[] {""} ;
      P09LA5_n786PrvDir = new boolean[] {false} ;
      P09LA5_A794PrvNom = new String[] {""} ;
      P09LA5_n794PrvNom = new boolean[] {false} ;
      P09LA5_A795PrvNum = new int[1] ;
      P09LA5_A792PrvMetTra = new String[] {""} ;
      P09LA5_n792PrvMetTra = new boolean[] {false} ;
      P09LA6_A396EmprCod = new String[] {""} ;
      P09LA6_A6075PrvCp2 = new String[] {""} ;
      P09LA6_n6075PrvCp2 = new boolean[] {false} ;
      P09LA6_A783PrvCta = new String[] {""} ;
      P09LA6_n783PrvCta = new boolean[] {false} ;
      P09LA6_A798PrvPlaEnt = new short[1] ;
      P09LA6_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA6_A801PrvRep = new String[] {""} ;
      P09LA6_n801PrvRep = new boolean[] {false} ;
      P09LA6_A797PrvPer = new int[1] ;
      P09LA6_n797PrvPer = new boolean[] {false} ;
      P09LA6_A785PrvDiaPag = new int[1] ;
      P09LA6_n785PrvDiaPag = new boolean[] {false} ;
      P09LA6_A805PrvVto = new byte[1] ;
      P09LA6_n805PrvVto = new boolean[] {false} ;
      P09LA6_A498FpgDsc = new String[] {""} ;
      P09LA6_n498FpgDsc = new boolean[] {false} ;
      P09LA6_A497FpgCod = new String[] {""} ;
      P09LA6_n497FpgCod = new boolean[] {false} ;
      P09LA6_A6077PrvMail = new String[] {""} ;
      P09LA6_n6077PrvMail = new boolean[] {false} ;
      P09LA6_A6076PrvFax = new String[] {""} ;
      P09LA6_n6076PrvFax = new boolean[] {false} ;
      P09LA6_A804PrvTlx = new String[] {""} ;
      P09LA6_n804PrvTlx = new boolean[] {false} ;
      P09LA6_A803PrvTlf = new String[] {""} ;
      P09LA6_n803PrvTlf = new boolean[] {false} ;
      P09LA6_A793PrvNif = new String[] {""} ;
      P09LA6_n793PrvNif = new boolean[] {false} ;
      P09LA6_A782PrvCpo = new String[] {""} ;
      P09LA6_n782PrvCpo = new boolean[] {false} ;
      P09LA6_A799PrvPob = new String[] {""} ;
      P09LA6_n799PrvPob = new boolean[] {false} ;
      P09LA6_A786PrvDir = new String[] {""} ;
      P09LA6_n786PrvDir = new boolean[] {false} ;
      P09LA6_A794PrvNom = new String[] {""} ;
      P09LA6_n794PrvNom = new boolean[] {false} ;
      P09LA6_A795PrvNum = new int[1] ;
      P09LA6_A792PrvMetTra = new String[] {""} ;
      P09LA6_n792PrvMetTra = new boolean[] {false} ;
      P09LA7_A396EmprCod = new String[] {""} ;
      P09LA7_A793PrvNif = new String[] {""} ;
      P09LA7_n793PrvNif = new boolean[] {false} ;
      P09LA7_A783PrvCta = new String[] {""} ;
      P09LA7_n783PrvCta = new boolean[] {false} ;
      P09LA7_A798PrvPlaEnt = new short[1] ;
      P09LA7_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA7_A801PrvRep = new String[] {""} ;
      P09LA7_n801PrvRep = new boolean[] {false} ;
      P09LA7_A797PrvPer = new int[1] ;
      P09LA7_n797PrvPer = new boolean[] {false} ;
      P09LA7_A785PrvDiaPag = new int[1] ;
      P09LA7_n785PrvDiaPag = new boolean[] {false} ;
      P09LA7_A805PrvVto = new byte[1] ;
      P09LA7_n805PrvVto = new boolean[] {false} ;
      P09LA7_A498FpgDsc = new String[] {""} ;
      P09LA7_n498FpgDsc = new boolean[] {false} ;
      P09LA7_A497FpgCod = new String[] {""} ;
      P09LA7_n497FpgCod = new boolean[] {false} ;
      P09LA7_A6077PrvMail = new String[] {""} ;
      P09LA7_n6077PrvMail = new boolean[] {false} ;
      P09LA7_A6076PrvFax = new String[] {""} ;
      P09LA7_n6076PrvFax = new boolean[] {false} ;
      P09LA7_A804PrvTlx = new String[] {""} ;
      P09LA7_n804PrvTlx = new boolean[] {false} ;
      P09LA7_A803PrvTlf = new String[] {""} ;
      P09LA7_n803PrvTlf = new boolean[] {false} ;
      P09LA7_A6075PrvCp2 = new String[] {""} ;
      P09LA7_n6075PrvCp2 = new boolean[] {false} ;
      P09LA7_A782PrvCpo = new String[] {""} ;
      P09LA7_n782PrvCpo = new boolean[] {false} ;
      P09LA7_A799PrvPob = new String[] {""} ;
      P09LA7_n799PrvPob = new boolean[] {false} ;
      P09LA7_A786PrvDir = new String[] {""} ;
      P09LA7_n786PrvDir = new boolean[] {false} ;
      P09LA7_A794PrvNom = new String[] {""} ;
      P09LA7_n794PrvNom = new boolean[] {false} ;
      P09LA7_A795PrvNum = new int[1] ;
      P09LA7_A792PrvMetTra = new String[] {""} ;
      P09LA7_n792PrvMetTra = new boolean[] {false} ;
      P09LA8_A396EmprCod = new String[] {""} ;
      P09LA8_A803PrvTlf = new String[] {""} ;
      P09LA8_n803PrvTlf = new boolean[] {false} ;
      P09LA8_A783PrvCta = new String[] {""} ;
      P09LA8_n783PrvCta = new boolean[] {false} ;
      P09LA8_A798PrvPlaEnt = new short[1] ;
      P09LA8_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA8_A801PrvRep = new String[] {""} ;
      P09LA8_n801PrvRep = new boolean[] {false} ;
      P09LA8_A797PrvPer = new int[1] ;
      P09LA8_n797PrvPer = new boolean[] {false} ;
      P09LA8_A785PrvDiaPag = new int[1] ;
      P09LA8_n785PrvDiaPag = new boolean[] {false} ;
      P09LA8_A805PrvVto = new byte[1] ;
      P09LA8_n805PrvVto = new boolean[] {false} ;
      P09LA8_A498FpgDsc = new String[] {""} ;
      P09LA8_n498FpgDsc = new boolean[] {false} ;
      P09LA8_A497FpgCod = new String[] {""} ;
      P09LA8_n497FpgCod = new boolean[] {false} ;
      P09LA8_A6077PrvMail = new String[] {""} ;
      P09LA8_n6077PrvMail = new boolean[] {false} ;
      P09LA8_A6076PrvFax = new String[] {""} ;
      P09LA8_n6076PrvFax = new boolean[] {false} ;
      P09LA8_A804PrvTlx = new String[] {""} ;
      P09LA8_n804PrvTlx = new boolean[] {false} ;
      P09LA8_A793PrvNif = new String[] {""} ;
      P09LA8_n793PrvNif = new boolean[] {false} ;
      P09LA8_A6075PrvCp2 = new String[] {""} ;
      P09LA8_n6075PrvCp2 = new boolean[] {false} ;
      P09LA8_A782PrvCpo = new String[] {""} ;
      P09LA8_n782PrvCpo = new boolean[] {false} ;
      P09LA8_A799PrvPob = new String[] {""} ;
      P09LA8_n799PrvPob = new boolean[] {false} ;
      P09LA8_A786PrvDir = new String[] {""} ;
      P09LA8_n786PrvDir = new boolean[] {false} ;
      P09LA8_A794PrvNom = new String[] {""} ;
      P09LA8_n794PrvNom = new boolean[] {false} ;
      P09LA8_A795PrvNum = new int[1] ;
      P09LA8_A792PrvMetTra = new String[] {""} ;
      P09LA8_n792PrvMetTra = new boolean[] {false} ;
      P09LA9_A396EmprCod = new String[] {""} ;
      P09LA9_A804PrvTlx = new String[] {""} ;
      P09LA9_n804PrvTlx = new boolean[] {false} ;
      P09LA9_A783PrvCta = new String[] {""} ;
      P09LA9_n783PrvCta = new boolean[] {false} ;
      P09LA9_A798PrvPlaEnt = new short[1] ;
      P09LA9_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA9_A801PrvRep = new String[] {""} ;
      P09LA9_n801PrvRep = new boolean[] {false} ;
      P09LA9_A797PrvPer = new int[1] ;
      P09LA9_n797PrvPer = new boolean[] {false} ;
      P09LA9_A785PrvDiaPag = new int[1] ;
      P09LA9_n785PrvDiaPag = new boolean[] {false} ;
      P09LA9_A805PrvVto = new byte[1] ;
      P09LA9_n805PrvVto = new boolean[] {false} ;
      P09LA9_A498FpgDsc = new String[] {""} ;
      P09LA9_n498FpgDsc = new boolean[] {false} ;
      P09LA9_A497FpgCod = new String[] {""} ;
      P09LA9_n497FpgCod = new boolean[] {false} ;
      P09LA9_A6077PrvMail = new String[] {""} ;
      P09LA9_n6077PrvMail = new boolean[] {false} ;
      P09LA9_A6076PrvFax = new String[] {""} ;
      P09LA9_n6076PrvFax = new boolean[] {false} ;
      P09LA9_A803PrvTlf = new String[] {""} ;
      P09LA9_n803PrvTlf = new boolean[] {false} ;
      P09LA9_A793PrvNif = new String[] {""} ;
      P09LA9_n793PrvNif = new boolean[] {false} ;
      P09LA9_A6075PrvCp2 = new String[] {""} ;
      P09LA9_n6075PrvCp2 = new boolean[] {false} ;
      P09LA9_A782PrvCpo = new String[] {""} ;
      P09LA9_n782PrvCpo = new boolean[] {false} ;
      P09LA9_A799PrvPob = new String[] {""} ;
      P09LA9_n799PrvPob = new boolean[] {false} ;
      P09LA9_A786PrvDir = new String[] {""} ;
      P09LA9_n786PrvDir = new boolean[] {false} ;
      P09LA9_A794PrvNom = new String[] {""} ;
      P09LA9_n794PrvNom = new boolean[] {false} ;
      P09LA9_A795PrvNum = new int[1] ;
      P09LA9_A792PrvMetTra = new String[] {""} ;
      P09LA9_n792PrvMetTra = new boolean[] {false} ;
      P09LA10_A396EmprCod = new String[] {""} ;
      P09LA10_A6076PrvFax = new String[] {""} ;
      P09LA10_n6076PrvFax = new boolean[] {false} ;
      P09LA10_A783PrvCta = new String[] {""} ;
      P09LA10_n783PrvCta = new boolean[] {false} ;
      P09LA10_A798PrvPlaEnt = new short[1] ;
      P09LA10_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA10_A801PrvRep = new String[] {""} ;
      P09LA10_n801PrvRep = new boolean[] {false} ;
      P09LA10_A797PrvPer = new int[1] ;
      P09LA10_n797PrvPer = new boolean[] {false} ;
      P09LA10_A785PrvDiaPag = new int[1] ;
      P09LA10_n785PrvDiaPag = new boolean[] {false} ;
      P09LA10_A805PrvVto = new byte[1] ;
      P09LA10_n805PrvVto = new boolean[] {false} ;
      P09LA10_A498FpgDsc = new String[] {""} ;
      P09LA10_n498FpgDsc = new boolean[] {false} ;
      P09LA10_A497FpgCod = new String[] {""} ;
      P09LA10_n497FpgCod = new boolean[] {false} ;
      P09LA10_A6077PrvMail = new String[] {""} ;
      P09LA10_n6077PrvMail = new boolean[] {false} ;
      P09LA10_A804PrvTlx = new String[] {""} ;
      P09LA10_n804PrvTlx = new boolean[] {false} ;
      P09LA10_A803PrvTlf = new String[] {""} ;
      P09LA10_n803PrvTlf = new boolean[] {false} ;
      P09LA10_A793PrvNif = new String[] {""} ;
      P09LA10_n793PrvNif = new boolean[] {false} ;
      P09LA10_A6075PrvCp2 = new String[] {""} ;
      P09LA10_n6075PrvCp2 = new boolean[] {false} ;
      P09LA10_A782PrvCpo = new String[] {""} ;
      P09LA10_n782PrvCpo = new boolean[] {false} ;
      P09LA10_A799PrvPob = new String[] {""} ;
      P09LA10_n799PrvPob = new boolean[] {false} ;
      P09LA10_A786PrvDir = new String[] {""} ;
      P09LA10_n786PrvDir = new boolean[] {false} ;
      P09LA10_A794PrvNom = new String[] {""} ;
      P09LA10_n794PrvNom = new boolean[] {false} ;
      P09LA10_A795PrvNum = new int[1] ;
      P09LA10_A792PrvMetTra = new String[] {""} ;
      P09LA10_n792PrvMetTra = new boolean[] {false} ;
      P09LA11_A396EmprCod = new String[] {""} ;
      P09LA11_A6077PrvMail = new String[] {""} ;
      P09LA11_n6077PrvMail = new boolean[] {false} ;
      P09LA11_A783PrvCta = new String[] {""} ;
      P09LA11_n783PrvCta = new boolean[] {false} ;
      P09LA11_A798PrvPlaEnt = new short[1] ;
      P09LA11_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA11_A801PrvRep = new String[] {""} ;
      P09LA11_n801PrvRep = new boolean[] {false} ;
      P09LA11_A797PrvPer = new int[1] ;
      P09LA11_n797PrvPer = new boolean[] {false} ;
      P09LA11_A785PrvDiaPag = new int[1] ;
      P09LA11_n785PrvDiaPag = new boolean[] {false} ;
      P09LA11_A805PrvVto = new byte[1] ;
      P09LA11_n805PrvVto = new boolean[] {false} ;
      P09LA11_A498FpgDsc = new String[] {""} ;
      P09LA11_n498FpgDsc = new boolean[] {false} ;
      P09LA11_A497FpgCod = new String[] {""} ;
      P09LA11_n497FpgCod = new boolean[] {false} ;
      P09LA11_A6076PrvFax = new String[] {""} ;
      P09LA11_n6076PrvFax = new boolean[] {false} ;
      P09LA11_A804PrvTlx = new String[] {""} ;
      P09LA11_n804PrvTlx = new boolean[] {false} ;
      P09LA11_A803PrvTlf = new String[] {""} ;
      P09LA11_n803PrvTlf = new boolean[] {false} ;
      P09LA11_A793PrvNif = new String[] {""} ;
      P09LA11_n793PrvNif = new boolean[] {false} ;
      P09LA11_A6075PrvCp2 = new String[] {""} ;
      P09LA11_n6075PrvCp2 = new boolean[] {false} ;
      P09LA11_A782PrvCpo = new String[] {""} ;
      P09LA11_n782PrvCpo = new boolean[] {false} ;
      P09LA11_A799PrvPob = new String[] {""} ;
      P09LA11_n799PrvPob = new boolean[] {false} ;
      P09LA11_A786PrvDir = new String[] {""} ;
      P09LA11_n786PrvDir = new boolean[] {false} ;
      P09LA11_A794PrvNom = new String[] {""} ;
      P09LA11_n794PrvNom = new boolean[] {false} ;
      P09LA11_A795PrvNum = new int[1] ;
      P09LA11_A792PrvMetTra = new String[] {""} ;
      P09LA11_n792PrvMetTra = new boolean[] {false} ;
      P09LA12_A396EmprCod = new String[] {""} ;
      P09LA12_A497FpgCod = new String[] {""} ;
      P09LA12_n497FpgCod = new boolean[] {false} ;
      P09LA12_A783PrvCta = new String[] {""} ;
      P09LA12_n783PrvCta = new boolean[] {false} ;
      P09LA12_A798PrvPlaEnt = new short[1] ;
      P09LA12_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA12_A801PrvRep = new String[] {""} ;
      P09LA12_n801PrvRep = new boolean[] {false} ;
      P09LA12_A797PrvPer = new int[1] ;
      P09LA12_n797PrvPer = new boolean[] {false} ;
      P09LA12_A785PrvDiaPag = new int[1] ;
      P09LA12_n785PrvDiaPag = new boolean[] {false} ;
      P09LA12_A805PrvVto = new byte[1] ;
      P09LA12_n805PrvVto = new boolean[] {false} ;
      P09LA12_A498FpgDsc = new String[] {""} ;
      P09LA12_n498FpgDsc = new boolean[] {false} ;
      P09LA12_A6077PrvMail = new String[] {""} ;
      P09LA12_n6077PrvMail = new boolean[] {false} ;
      P09LA12_A6076PrvFax = new String[] {""} ;
      P09LA12_n6076PrvFax = new boolean[] {false} ;
      P09LA12_A804PrvTlx = new String[] {""} ;
      P09LA12_n804PrvTlx = new boolean[] {false} ;
      P09LA12_A803PrvTlf = new String[] {""} ;
      P09LA12_n803PrvTlf = new boolean[] {false} ;
      P09LA12_A793PrvNif = new String[] {""} ;
      P09LA12_n793PrvNif = new boolean[] {false} ;
      P09LA12_A6075PrvCp2 = new String[] {""} ;
      P09LA12_n6075PrvCp2 = new boolean[] {false} ;
      P09LA12_A782PrvCpo = new String[] {""} ;
      P09LA12_n782PrvCpo = new boolean[] {false} ;
      P09LA12_A799PrvPob = new String[] {""} ;
      P09LA12_n799PrvPob = new boolean[] {false} ;
      P09LA12_A786PrvDir = new String[] {""} ;
      P09LA12_n786PrvDir = new boolean[] {false} ;
      P09LA12_A794PrvNom = new String[] {""} ;
      P09LA12_n794PrvNom = new boolean[] {false} ;
      P09LA12_A795PrvNum = new int[1] ;
      P09LA12_A792PrvMetTra = new String[] {""} ;
      P09LA12_n792PrvMetTra = new boolean[] {false} ;
      AV57OptionDesc = "" ;
      P09LA13_A497FpgCod = new String[] {""} ;
      P09LA13_n497FpgCod = new boolean[] {false} ;
      P09LA13_A396EmprCod = new String[] {""} ;
      P09LA13_A783PrvCta = new String[] {""} ;
      P09LA13_n783PrvCta = new boolean[] {false} ;
      P09LA13_A798PrvPlaEnt = new short[1] ;
      P09LA13_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA13_A801PrvRep = new String[] {""} ;
      P09LA13_n801PrvRep = new boolean[] {false} ;
      P09LA13_A797PrvPer = new int[1] ;
      P09LA13_n797PrvPer = new boolean[] {false} ;
      P09LA13_A785PrvDiaPag = new int[1] ;
      P09LA13_n785PrvDiaPag = new boolean[] {false} ;
      P09LA13_A805PrvVto = new byte[1] ;
      P09LA13_n805PrvVto = new boolean[] {false} ;
      P09LA13_A498FpgDsc = new String[] {""} ;
      P09LA13_n498FpgDsc = new boolean[] {false} ;
      P09LA13_A6077PrvMail = new String[] {""} ;
      P09LA13_n6077PrvMail = new boolean[] {false} ;
      P09LA13_A6076PrvFax = new String[] {""} ;
      P09LA13_n6076PrvFax = new boolean[] {false} ;
      P09LA13_A804PrvTlx = new String[] {""} ;
      P09LA13_n804PrvTlx = new boolean[] {false} ;
      P09LA13_A803PrvTlf = new String[] {""} ;
      P09LA13_n803PrvTlf = new boolean[] {false} ;
      P09LA13_A793PrvNif = new String[] {""} ;
      P09LA13_n793PrvNif = new boolean[] {false} ;
      P09LA13_A6075PrvCp2 = new String[] {""} ;
      P09LA13_n6075PrvCp2 = new boolean[] {false} ;
      P09LA13_A782PrvCpo = new String[] {""} ;
      P09LA13_n782PrvCpo = new boolean[] {false} ;
      P09LA13_A799PrvPob = new String[] {""} ;
      P09LA13_n799PrvPob = new boolean[] {false} ;
      P09LA13_A786PrvDir = new String[] {""} ;
      P09LA13_n786PrvDir = new boolean[] {false} ;
      P09LA13_A794PrvNom = new String[] {""} ;
      P09LA13_n794PrvNom = new boolean[] {false} ;
      P09LA13_A795PrvNum = new int[1] ;
      P09LA13_A792PrvMetTra = new String[] {""} ;
      P09LA13_n792PrvMetTra = new boolean[] {false} ;
      P09LA14_A396EmprCod = new String[] {""} ;
      P09LA14_A801PrvRep = new String[] {""} ;
      P09LA14_n801PrvRep = new boolean[] {false} ;
      P09LA14_A783PrvCta = new String[] {""} ;
      P09LA14_n783PrvCta = new boolean[] {false} ;
      P09LA14_A798PrvPlaEnt = new short[1] ;
      P09LA14_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA14_A797PrvPer = new int[1] ;
      P09LA14_n797PrvPer = new boolean[] {false} ;
      P09LA14_A785PrvDiaPag = new int[1] ;
      P09LA14_n785PrvDiaPag = new boolean[] {false} ;
      P09LA14_A805PrvVto = new byte[1] ;
      P09LA14_n805PrvVto = new boolean[] {false} ;
      P09LA14_A498FpgDsc = new String[] {""} ;
      P09LA14_n498FpgDsc = new boolean[] {false} ;
      P09LA14_A497FpgCod = new String[] {""} ;
      P09LA14_n497FpgCod = new boolean[] {false} ;
      P09LA14_A6077PrvMail = new String[] {""} ;
      P09LA14_n6077PrvMail = new boolean[] {false} ;
      P09LA14_A6076PrvFax = new String[] {""} ;
      P09LA14_n6076PrvFax = new boolean[] {false} ;
      P09LA14_A804PrvTlx = new String[] {""} ;
      P09LA14_n804PrvTlx = new boolean[] {false} ;
      P09LA14_A803PrvTlf = new String[] {""} ;
      P09LA14_n803PrvTlf = new boolean[] {false} ;
      P09LA14_A793PrvNif = new String[] {""} ;
      P09LA14_n793PrvNif = new boolean[] {false} ;
      P09LA14_A6075PrvCp2 = new String[] {""} ;
      P09LA14_n6075PrvCp2 = new boolean[] {false} ;
      P09LA14_A782PrvCpo = new String[] {""} ;
      P09LA14_n782PrvCpo = new boolean[] {false} ;
      P09LA14_A799PrvPob = new String[] {""} ;
      P09LA14_n799PrvPob = new boolean[] {false} ;
      P09LA14_A786PrvDir = new String[] {""} ;
      P09LA14_n786PrvDir = new boolean[] {false} ;
      P09LA14_A794PrvNom = new String[] {""} ;
      P09LA14_n794PrvNom = new boolean[] {false} ;
      P09LA14_A795PrvNum = new int[1] ;
      P09LA14_A792PrvMetTra = new String[] {""} ;
      P09LA14_n792PrvMetTra = new boolean[] {false} ;
      P09LA15_A396EmprCod = new String[] {""} ;
      P09LA15_A783PrvCta = new String[] {""} ;
      P09LA15_n783PrvCta = new boolean[] {false} ;
      P09LA15_A798PrvPlaEnt = new short[1] ;
      P09LA15_n798PrvPlaEnt = new boolean[] {false} ;
      P09LA15_A801PrvRep = new String[] {""} ;
      P09LA15_n801PrvRep = new boolean[] {false} ;
      P09LA15_A797PrvPer = new int[1] ;
      P09LA15_n797PrvPer = new boolean[] {false} ;
      P09LA15_A785PrvDiaPag = new int[1] ;
      P09LA15_n785PrvDiaPag = new boolean[] {false} ;
      P09LA15_A805PrvVto = new byte[1] ;
      P09LA15_n805PrvVto = new boolean[] {false} ;
      P09LA15_A498FpgDsc = new String[] {""} ;
      P09LA15_n498FpgDsc = new boolean[] {false} ;
      P09LA15_A497FpgCod = new String[] {""} ;
      P09LA15_n497FpgCod = new boolean[] {false} ;
      P09LA15_A6077PrvMail = new String[] {""} ;
      P09LA15_n6077PrvMail = new boolean[] {false} ;
      P09LA15_A6076PrvFax = new String[] {""} ;
      P09LA15_n6076PrvFax = new boolean[] {false} ;
      P09LA15_A804PrvTlx = new String[] {""} ;
      P09LA15_n804PrvTlx = new boolean[] {false} ;
      P09LA15_A803PrvTlf = new String[] {""} ;
      P09LA15_n803PrvTlf = new boolean[] {false} ;
      P09LA15_A793PrvNif = new String[] {""} ;
      P09LA15_n793PrvNif = new boolean[] {false} ;
      P09LA15_A6075PrvCp2 = new String[] {""} ;
      P09LA15_n6075PrvCp2 = new boolean[] {false} ;
      P09LA15_A782PrvCpo = new String[] {""} ;
      P09LA15_n782PrvCpo = new boolean[] {false} ;
      P09LA15_A799PrvPob = new String[] {""} ;
      P09LA15_n799PrvPob = new boolean[] {false} ;
      P09LA15_A786PrvDir = new String[] {""} ;
      P09LA15_n786PrvDir = new boolean[] {false} ;
      P09LA15_A794PrvNom = new String[] {""} ;
      P09LA15_n794PrvNom = new boolean[] {false} ;
      P09LA15_A795PrvNum = new int[1] ;
      P09LA15_A792PrvMetTra = new String[] {""} ;
      P09LA15_n792PrvMetTra = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodeproveedores_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09LA2_A396EmprCod, P09LA2_A794PrvNom, P09LA2_n794PrvNom, P09LA2_A783PrvCta, P09LA2_n783PrvCta, P09LA2_A798PrvPlaEnt, P09LA2_n798PrvPlaEnt, P09LA2_A801PrvRep, P09LA2_n801PrvRep, P09LA2_A797PrvPer,
            P09LA2_n797PrvPer, P09LA2_A785PrvDiaPag, P09LA2_n785PrvDiaPag, P09LA2_A805PrvVto, P09LA2_n805PrvVto, P09LA2_A498FpgDsc, P09LA2_n498FpgDsc, P09LA2_A497FpgCod, P09LA2_n497FpgCod, P09LA2_A6077PrvMail,
            P09LA2_n6077PrvMail, P09LA2_A6076PrvFax, P09LA2_n6076PrvFax, P09LA2_A804PrvTlx, P09LA2_n804PrvTlx, P09LA2_A803PrvTlf, P09LA2_n803PrvTlf, P09LA2_A793PrvNif, P09LA2_n793PrvNif, P09LA2_A6075PrvCp2,
            P09LA2_n6075PrvCp2, P09LA2_A782PrvCpo, P09LA2_n782PrvCpo, P09LA2_A799PrvPob, P09LA2_n799PrvPob, P09LA2_A786PrvDir, P09LA2_n786PrvDir, P09LA2_A795PrvNum, P09LA2_A792PrvMetTra, P09LA2_n792PrvMetTra
            }
            , new Object[] {
            P09LA3_A396EmprCod, P09LA3_A786PrvDir, P09LA3_n786PrvDir, P09LA3_A783PrvCta, P09LA3_n783PrvCta, P09LA3_A798PrvPlaEnt, P09LA3_n798PrvPlaEnt, P09LA3_A801PrvRep, P09LA3_n801PrvRep, P09LA3_A797PrvPer,
            P09LA3_n797PrvPer, P09LA3_A785PrvDiaPag, P09LA3_n785PrvDiaPag, P09LA3_A805PrvVto, P09LA3_n805PrvVto, P09LA3_A498FpgDsc, P09LA3_n498FpgDsc, P09LA3_A497FpgCod, P09LA3_n497FpgCod, P09LA3_A6077PrvMail,
            P09LA3_n6077PrvMail, P09LA3_A6076PrvFax, P09LA3_n6076PrvFax, P09LA3_A804PrvTlx, P09LA3_n804PrvTlx, P09LA3_A803PrvTlf, P09LA3_n803PrvTlf, P09LA3_A793PrvNif, P09LA3_n793PrvNif, P09LA3_A6075PrvCp2,
            P09LA3_n6075PrvCp2, P09LA3_A782PrvCpo, P09LA3_n782PrvCpo, P09LA3_A799PrvPob, P09LA3_n799PrvPob, P09LA3_A794PrvNom, P09LA3_n794PrvNom, P09LA3_A795PrvNum, P09LA3_A792PrvMetTra, P09LA3_n792PrvMetTra
            }
            , new Object[] {
            P09LA4_A396EmprCod, P09LA4_A799PrvPob, P09LA4_n799PrvPob, P09LA4_A783PrvCta, P09LA4_n783PrvCta, P09LA4_A798PrvPlaEnt, P09LA4_n798PrvPlaEnt, P09LA4_A801PrvRep, P09LA4_n801PrvRep, P09LA4_A797PrvPer,
            P09LA4_n797PrvPer, P09LA4_A785PrvDiaPag, P09LA4_n785PrvDiaPag, P09LA4_A805PrvVto, P09LA4_n805PrvVto, P09LA4_A498FpgDsc, P09LA4_n498FpgDsc, P09LA4_A497FpgCod, P09LA4_n497FpgCod, P09LA4_A6077PrvMail,
            P09LA4_n6077PrvMail, P09LA4_A6076PrvFax, P09LA4_n6076PrvFax, P09LA4_A804PrvTlx, P09LA4_n804PrvTlx, P09LA4_A803PrvTlf, P09LA4_n803PrvTlf, P09LA4_A793PrvNif, P09LA4_n793PrvNif, P09LA4_A6075PrvCp2,
            P09LA4_n6075PrvCp2, P09LA4_A782PrvCpo, P09LA4_n782PrvCpo, P09LA4_A786PrvDir, P09LA4_n786PrvDir, P09LA4_A794PrvNom, P09LA4_n794PrvNom, P09LA4_A795PrvNum, P09LA4_A792PrvMetTra, P09LA4_n792PrvMetTra
            }
            , new Object[] {
            P09LA5_A396EmprCod, P09LA5_A782PrvCpo, P09LA5_n782PrvCpo, P09LA5_A783PrvCta, P09LA5_n783PrvCta, P09LA5_A798PrvPlaEnt, P09LA5_n798PrvPlaEnt, P09LA5_A801PrvRep, P09LA5_n801PrvRep, P09LA5_A797PrvPer,
            P09LA5_n797PrvPer, P09LA5_A785PrvDiaPag, P09LA5_n785PrvDiaPag, P09LA5_A805PrvVto, P09LA5_n805PrvVto, P09LA5_A498FpgDsc, P09LA5_n498FpgDsc, P09LA5_A497FpgCod, P09LA5_n497FpgCod, P09LA5_A6077PrvMail,
            P09LA5_n6077PrvMail, P09LA5_A6076PrvFax, P09LA5_n6076PrvFax, P09LA5_A804PrvTlx, P09LA5_n804PrvTlx, P09LA5_A803PrvTlf, P09LA5_n803PrvTlf, P09LA5_A793PrvNif, P09LA5_n793PrvNif, P09LA5_A6075PrvCp2,
            P09LA5_n6075PrvCp2, P09LA5_A799PrvPob, P09LA5_n799PrvPob, P09LA5_A786PrvDir, P09LA5_n786PrvDir, P09LA5_A794PrvNom, P09LA5_n794PrvNom, P09LA5_A795PrvNum, P09LA5_A792PrvMetTra, P09LA5_n792PrvMetTra
            }
            , new Object[] {
            P09LA6_A396EmprCod, P09LA6_A6075PrvCp2, P09LA6_n6075PrvCp2, P09LA6_A783PrvCta, P09LA6_n783PrvCta, P09LA6_A798PrvPlaEnt, P09LA6_n798PrvPlaEnt, P09LA6_A801PrvRep, P09LA6_n801PrvRep, P09LA6_A797PrvPer,
            P09LA6_n797PrvPer, P09LA6_A785PrvDiaPag, P09LA6_n785PrvDiaPag, P09LA6_A805PrvVto, P09LA6_n805PrvVto, P09LA6_A498FpgDsc, P09LA6_n498FpgDsc, P09LA6_A497FpgCod, P09LA6_n497FpgCod, P09LA6_A6077PrvMail,
            P09LA6_n6077PrvMail, P09LA6_A6076PrvFax, P09LA6_n6076PrvFax, P09LA6_A804PrvTlx, P09LA6_n804PrvTlx, P09LA6_A803PrvTlf, P09LA6_n803PrvTlf, P09LA6_A793PrvNif, P09LA6_n793PrvNif, P09LA6_A782PrvCpo,
            P09LA6_n782PrvCpo, P09LA6_A799PrvPob, P09LA6_n799PrvPob, P09LA6_A786PrvDir, P09LA6_n786PrvDir, P09LA6_A794PrvNom, P09LA6_n794PrvNom, P09LA6_A795PrvNum, P09LA6_A792PrvMetTra, P09LA6_n792PrvMetTra
            }
            , new Object[] {
            P09LA7_A396EmprCod, P09LA7_A793PrvNif, P09LA7_n793PrvNif, P09LA7_A783PrvCta, P09LA7_n783PrvCta, P09LA7_A798PrvPlaEnt, P09LA7_n798PrvPlaEnt, P09LA7_A801PrvRep, P09LA7_n801PrvRep, P09LA7_A797PrvPer,
            P09LA7_n797PrvPer, P09LA7_A785PrvDiaPag, P09LA7_n785PrvDiaPag, P09LA7_A805PrvVto, P09LA7_n805PrvVto, P09LA7_A498FpgDsc, P09LA7_n498FpgDsc, P09LA7_A497FpgCod, P09LA7_n497FpgCod, P09LA7_A6077PrvMail,
            P09LA7_n6077PrvMail, P09LA7_A6076PrvFax, P09LA7_n6076PrvFax, P09LA7_A804PrvTlx, P09LA7_n804PrvTlx, P09LA7_A803PrvTlf, P09LA7_n803PrvTlf, P09LA7_A6075PrvCp2, P09LA7_n6075PrvCp2, P09LA7_A782PrvCpo,
            P09LA7_n782PrvCpo, P09LA7_A799PrvPob, P09LA7_n799PrvPob, P09LA7_A786PrvDir, P09LA7_n786PrvDir, P09LA7_A794PrvNom, P09LA7_n794PrvNom, P09LA7_A795PrvNum, P09LA7_A792PrvMetTra, P09LA7_n792PrvMetTra
            }
            , new Object[] {
            P09LA8_A396EmprCod, P09LA8_A803PrvTlf, P09LA8_n803PrvTlf, P09LA8_A783PrvCta, P09LA8_n783PrvCta, P09LA8_A798PrvPlaEnt, P09LA8_n798PrvPlaEnt, P09LA8_A801PrvRep, P09LA8_n801PrvRep, P09LA8_A797PrvPer,
            P09LA8_n797PrvPer, P09LA8_A785PrvDiaPag, P09LA8_n785PrvDiaPag, P09LA8_A805PrvVto, P09LA8_n805PrvVto, P09LA8_A498FpgDsc, P09LA8_n498FpgDsc, P09LA8_A497FpgCod, P09LA8_n497FpgCod, P09LA8_A6077PrvMail,
            P09LA8_n6077PrvMail, P09LA8_A6076PrvFax, P09LA8_n6076PrvFax, P09LA8_A804PrvTlx, P09LA8_n804PrvTlx, P09LA8_A793PrvNif, P09LA8_n793PrvNif, P09LA8_A6075PrvCp2, P09LA8_n6075PrvCp2, P09LA8_A782PrvCpo,
            P09LA8_n782PrvCpo, P09LA8_A799PrvPob, P09LA8_n799PrvPob, P09LA8_A786PrvDir, P09LA8_n786PrvDir, P09LA8_A794PrvNom, P09LA8_n794PrvNom, P09LA8_A795PrvNum, P09LA8_A792PrvMetTra, P09LA8_n792PrvMetTra
            }
            , new Object[] {
            P09LA9_A396EmprCod, P09LA9_A804PrvTlx, P09LA9_n804PrvTlx, P09LA9_A783PrvCta, P09LA9_n783PrvCta, P09LA9_A798PrvPlaEnt, P09LA9_n798PrvPlaEnt, P09LA9_A801PrvRep, P09LA9_n801PrvRep, P09LA9_A797PrvPer,
            P09LA9_n797PrvPer, P09LA9_A785PrvDiaPag, P09LA9_n785PrvDiaPag, P09LA9_A805PrvVto, P09LA9_n805PrvVto, P09LA9_A498FpgDsc, P09LA9_n498FpgDsc, P09LA9_A497FpgCod, P09LA9_n497FpgCod, P09LA9_A6077PrvMail,
            P09LA9_n6077PrvMail, P09LA9_A6076PrvFax, P09LA9_n6076PrvFax, P09LA9_A803PrvTlf, P09LA9_n803PrvTlf, P09LA9_A793PrvNif, P09LA9_n793PrvNif, P09LA9_A6075PrvCp2, P09LA9_n6075PrvCp2, P09LA9_A782PrvCpo,
            P09LA9_n782PrvCpo, P09LA9_A799PrvPob, P09LA9_n799PrvPob, P09LA9_A786PrvDir, P09LA9_n786PrvDir, P09LA9_A794PrvNom, P09LA9_n794PrvNom, P09LA9_A795PrvNum, P09LA9_A792PrvMetTra, P09LA9_n792PrvMetTra
            }
            , new Object[] {
            P09LA10_A396EmprCod, P09LA10_A6076PrvFax, P09LA10_n6076PrvFax, P09LA10_A783PrvCta, P09LA10_n783PrvCta, P09LA10_A798PrvPlaEnt, P09LA10_n798PrvPlaEnt, P09LA10_A801PrvRep, P09LA10_n801PrvRep, P09LA10_A797PrvPer,
            P09LA10_n797PrvPer, P09LA10_A785PrvDiaPag, P09LA10_n785PrvDiaPag, P09LA10_A805PrvVto, P09LA10_n805PrvVto, P09LA10_A498FpgDsc, P09LA10_n498FpgDsc, P09LA10_A497FpgCod, P09LA10_n497FpgCod, P09LA10_A6077PrvMail,
            P09LA10_n6077PrvMail, P09LA10_A804PrvTlx, P09LA10_n804PrvTlx, P09LA10_A803PrvTlf, P09LA10_n803PrvTlf, P09LA10_A793PrvNif, P09LA10_n793PrvNif, P09LA10_A6075PrvCp2, P09LA10_n6075PrvCp2, P09LA10_A782PrvCpo,
            P09LA10_n782PrvCpo, P09LA10_A799PrvPob, P09LA10_n799PrvPob, P09LA10_A786PrvDir, P09LA10_n786PrvDir, P09LA10_A794PrvNom, P09LA10_n794PrvNom, P09LA10_A795PrvNum, P09LA10_A792PrvMetTra, P09LA10_n792PrvMetTra
            }
            , new Object[] {
            P09LA11_A396EmprCod, P09LA11_A6077PrvMail, P09LA11_n6077PrvMail, P09LA11_A783PrvCta, P09LA11_n783PrvCta, P09LA11_A798PrvPlaEnt, P09LA11_n798PrvPlaEnt, P09LA11_A801PrvRep, P09LA11_n801PrvRep, P09LA11_A797PrvPer,
            P09LA11_n797PrvPer, P09LA11_A785PrvDiaPag, P09LA11_n785PrvDiaPag, P09LA11_A805PrvVto, P09LA11_n805PrvVto, P09LA11_A498FpgDsc, P09LA11_n498FpgDsc, P09LA11_A497FpgCod, P09LA11_n497FpgCod, P09LA11_A6076PrvFax,
            P09LA11_n6076PrvFax, P09LA11_A804PrvTlx, P09LA11_n804PrvTlx, P09LA11_A803PrvTlf, P09LA11_n803PrvTlf, P09LA11_A793PrvNif, P09LA11_n793PrvNif, P09LA11_A6075PrvCp2, P09LA11_n6075PrvCp2, P09LA11_A782PrvCpo,
            P09LA11_n782PrvCpo, P09LA11_A799PrvPob, P09LA11_n799PrvPob, P09LA11_A786PrvDir, P09LA11_n786PrvDir, P09LA11_A794PrvNom, P09LA11_n794PrvNom, P09LA11_A795PrvNum, P09LA11_A792PrvMetTra, P09LA11_n792PrvMetTra
            }
            , new Object[] {
            P09LA12_A396EmprCod, P09LA12_A497FpgCod, P09LA12_n497FpgCod, P09LA12_A783PrvCta, P09LA12_n783PrvCta, P09LA12_A798PrvPlaEnt, P09LA12_n798PrvPlaEnt, P09LA12_A801PrvRep, P09LA12_n801PrvRep, P09LA12_A797PrvPer,
            P09LA12_n797PrvPer, P09LA12_A785PrvDiaPag, P09LA12_n785PrvDiaPag, P09LA12_A805PrvVto, P09LA12_n805PrvVto, P09LA12_A498FpgDsc, P09LA12_n498FpgDsc, P09LA12_A6077PrvMail, P09LA12_n6077PrvMail, P09LA12_A6076PrvFax,
            P09LA12_n6076PrvFax, P09LA12_A804PrvTlx, P09LA12_n804PrvTlx, P09LA12_A803PrvTlf, P09LA12_n803PrvTlf, P09LA12_A793PrvNif, P09LA12_n793PrvNif, P09LA12_A6075PrvCp2, P09LA12_n6075PrvCp2, P09LA12_A782PrvCpo,
            P09LA12_n782PrvCpo, P09LA12_A799PrvPob, P09LA12_n799PrvPob, P09LA12_A786PrvDir, P09LA12_n786PrvDir, P09LA12_A794PrvNom, P09LA12_n794PrvNom, P09LA12_A795PrvNum, P09LA12_A792PrvMetTra, P09LA12_n792PrvMetTra
            }
            , new Object[] {
            P09LA13_A497FpgCod, P09LA13_n497FpgCod, P09LA13_A396EmprCod, P09LA13_A783PrvCta, P09LA13_n783PrvCta, P09LA13_A798PrvPlaEnt, P09LA13_n798PrvPlaEnt, P09LA13_A801PrvRep, P09LA13_n801PrvRep, P09LA13_A797PrvPer,
            P09LA13_n797PrvPer, P09LA13_A785PrvDiaPag, P09LA13_n785PrvDiaPag, P09LA13_A805PrvVto, P09LA13_n805PrvVto, P09LA13_A498FpgDsc, P09LA13_n498FpgDsc, P09LA13_A6077PrvMail, P09LA13_n6077PrvMail, P09LA13_A6076PrvFax,
            P09LA13_n6076PrvFax, P09LA13_A804PrvTlx, P09LA13_n804PrvTlx, P09LA13_A803PrvTlf, P09LA13_n803PrvTlf, P09LA13_A793PrvNif, P09LA13_n793PrvNif, P09LA13_A6075PrvCp2, P09LA13_n6075PrvCp2, P09LA13_A782PrvCpo,
            P09LA13_n782PrvCpo, P09LA13_A799PrvPob, P09LA13_n799PrvPob, P09LA13_A786PrvDir, P09LA13_n786PrvDir, P09LA13_A794PrvNom, P09LA13_n794PrvNom, P09LA13_A795PrvNum, P09LA13_A792PrvMetTra, P09LA13_n792PrvMetTra
            }
            , new Object[] {
            P09LA14_A396EmprCod, P09LA14_A801PrvRep, P09LA14_n801PrvRep, P09LA14_A783PrvCta, P09LA14_n783PrvCta, P09LA14_A798PrvPlaEnt, P09LA14_n798PrvPlaEnt, P09LA14_A797PrvPer, P09LA14_n797PrvPer, P09LA14_A785PrvDiaPag,
            P09LA14_n785PrvDiaPag, P09LA14_A805PrvVto, P09LA14_n805PrvVto, P09LA14_A498FpgDsc, P09LA14_n498FpgDsc, P09LA14_A497FpgCod, P09LA14_n497FpgCod, P09LA14_A6077PrvMail, P09LA14_n6077PrvMail, P09LA14_A6076PrvFax,
            P09LA14_n6076PrvFax, P09LA14_A804PrvTlx, P09LA14_n804PrvTlx, P09LA14_A803PrvTlf, P09LA14_n803PrvTlf, P09LA14_A793PrvNif, P09LA14_n793PrvNif, P09LA14_A6075PrvCp2, P09LA14_n6075PrvCp2, P09LA14_A782PrvCpo,
            P09LA14_n782PrvCpo, P09LA14_A799PrvPob, P09LA14_n799PrvPob, P09LA14_A786PrvDir, P09LA14_n786PrvDir, P09LA14_A794PrvNom, P09LA14_n794PrvNom, P09LA14_A795PrvNum, P09LA14_A792PrvMetTra, P09LA14_n792PrvMetTra
            }
            , new Object[] {
            P09LA15_A396EmprCod, P09LA15_A783PrvCta, P09LA15_n783PrvCta, P09LA15_A798PrvPlaEnt, P09LA15_n798PrvPlaEnt, P09LA15_A801PrvRep, P09LA15_n801PrvRep, P09LA15_A797PrvPer, P09LA15_n797PrvPer, P09LA15_A785PrvDiaPag,
            P09LA15_n785PrvDiaPag, P09LA15_A805PrvVto, P09LA15_n805PrvVto, P09LA15_A498FpgDsc, P09LA15_n498FpgDsc, P09LA15_A497FpgCod, P09LA15_n497FpgCod, P09LA15_A6077PrvMail, P09LA15_n6077PrvMail, P09LA15_A6076PrvFax,
            P09LA15_n6076PrvFax, P09LA15_A804PrvTlx, P09LA15_n804PrvTlx, P09LA15_A803PrvTlf, P09LA15_n803PrvTlf, P09LA15_A793PrvNif, P09LA15_n793PrvNif, P09LA15_A6075PrvCp2, P09LA15_n6075PrvCp2, P09LA15_A782PrvCpo,
            P09LA15_n782PrvCpo, P09LA15_A799PrvPob, P09LA15_n799PrvPob, P09LA15_A786PrvDir, P09LA15_n786PrvDir, P09LA15_A794PrvNom, P09LA15_n794PrvNom, P09LA15_A795PrvNum, P09LA15_A792PrvMetTra, P09LA15_n792PrvMetTra
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV36TFPrvVto ;
   private byte AV37TFPrvVto_To ;
   private byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ;
   private byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ;
   private byte A805PrvVto ;
   private short AV44TFPrvPlaEnt ;
   private short AV45TFPrvPlaEnt_To ;
   private short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ;
   private short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ;
   private short A798PrvPlaEnt ;
   private short Gx_err ;
   private int AV74GXV1 ;
   private int AV10TFPrvNum ;
   private int AV11TFPrvNum_To ;
   private int AV38TFPrvDiaPag ;
   private int AV39TFPrvDiaPag_To ;
   private int AV40TFPrvPer ;
   private int AV41TFPrvPer_To ;
   private int AV70PrvNumFrom ;
   private int AV71PrvNumTo ;
   private int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ;
   private int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ;
   private int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ;
   private int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ;
   private int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ;
   private int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ;
   private int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ;
   private int A795PrvNum ;
   private int A785PrvDiaPag ;
   private int A797PrvPer ;
   private int AV53InsertIndex ;
   private long AV62count ;
   private String AV12TFPrvNom ;
   private String AV13TFPrvNom_Sel ;
   private String AV14TFPrvDir ;
   private String AV15TFPrvDir_Sel ;
   private String AV16TFPrvPob ;
   private String AV17TFPrvPob_Sel ;
   private String AV18TFPrvCpo ;
   private String AV19TFPrvCpo_Sel ;
   private String AV20TFPrvCp2 ;
   private String AV21TFPrvCp2_Sel ;
   private String AV22TFPrvNif ;
   private String AV23TFPrvNif_Sel ;
   private String AV24TFPrvTlf ;
   private String AV25TFPrvTlf_Sel ;
   private String AV26TFPrvTlx ;
   private String AV27TFPrvTlx_Sel ;
   private String AV28TFPrvFax ;
   private String AV29TFPrvFax_Sel ;
   private String AV30TFPrvMail ;
   private String AV31TFPrvMail_Sel ;
   private String AV32TFFpgCod ;
   private String AV33TFFpgCod_Sel ;
   private String AV34TFFpgDsc ;
   private String AV35TFFpgDsc_Sel ;
   private String AV42TFPrvRep ;
   private String AV43TFPrvRep_Sel ;
   private String AV48TFPrvCta ;
   private String AV49TFPrvCta_Sel ;
   private String AV69Emprcod ;
   private String A794PrvNom ;
   private String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ;
   private String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ;
   private String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ;
   private String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ;
   private String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ;
   private String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ;
   private String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ;
   private String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ;
   private String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ;
   private String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ;
   private String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ;
   private String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ;
   private String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ;
   private String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ;
   private String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ;
   private String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ;
   private String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ;
   private String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ;
   private String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ;
   private String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ;
   private String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ;
   private String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ;
   private String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ;
   private String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ;
   private String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ;
   private String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ;
   private String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ;
   private String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ;
   private String scmdbuf ;
   private String lV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ;
   private String lV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ;
   private String lV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ;
   private String lV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ;
   private String lV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ;
   private String lV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ;
   private String lV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ;
   private String lV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ;
   private String lV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ;
   private String lV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ;
   private String lV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ;
   private String lV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ;
   private String lV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ;
   private String lV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ;
   private String A792PrvMetTra ;
   private String A786PrvDir ;
   private String A799PrvPob ;
   private String A782PrvCpo ;
   private String A6075PrvCp2 ;
   private String A793PrvNif ;
   private String A803PrvTlf ;
   private String A804PrvTlx ;
   private String A6076PrvFax ;
   private String A6077PrvMail ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private String A801PrvRep ;
   private String A783PrvCta ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9LA2 ;
   private boolean n794PrvNom ;
   private boolean n783PrvCta ;
   private boolean n798PrvPlaEnt ;
   private boolean n801PrvRep ;
   private boolean n797PrvPer ;
   private boolean n785PrvDiaPag ;
   private boolean n805PrvVto ;
   private boolean n498FpgDsc ;
   private boolean n497FpgCod ;
   private boolean n6077PrvMail ;
   private boolean n6076PrvFax ;
   private boolean n804PrvTlx ;
   private boolean n803PrvTlf ;
   private boolean n793PrvNif ;
   private boolean n6075PrvCp2 ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n786PrvDir ;
   private boolean n792PrvMetTra ;
   private boolean brk9LA4 ;
   private boolean brk9LA6 ;
   private boolean brk9LA8 ;
   private boolean brk9LA10 ;
   private boolean brk9LA12 ;
   private boolean brk9LA14 ;
   private boolean brk9LA16 ;
   private boolean brk9LA18 ;
   private boolean brk9LA20 ;
   private boolean brk9LA22 ;
   private boolean brk9LA24 ;
   private boolean brk9LA26 ;
   private boolean brk9LA28 ;
   private String AV56OptionsJson ;
   private String AV59OptionsDescJson ;
   private String AV61OptionIndexesJson ;
   private String AV46TFPrvMetTra_SelsJson ;
   private String AV52DDOName ;
   private String AV50SearchTxt ;
   private String AV51SearchTxtTo ;
   private String AV68FilterFullText ;
   private String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ;
   private String lV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ;
   private String AV54Option ;
   private String AV57OptionDesc ;
   private com.genexus.webpanels.WebSession AV63Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09LA2_A396EmprCod ;
   private String[] P09LA2_A794PrvNom ;
   private boolean[] P09LA2_n794PrvNom ;
   private String[] P09LA2_A783PrvCta ;
   private boolean[] P09LA2_n783PrvCta ;
   private short[] P09LA2_A798PrvPlaEnt ;
   private boolean[] P09LA2_n798PrvPlaEnt ;
   private String[] P09LA2_A801PrvRep ;
   private boolean[] P09LA2_n801PrvRep ;
   private int[] P09LA2_A797PrvPer ;
   private boolean[] P09LA2_n797PrvPer ;
   private int[] P09LA2_A785PrvDiaPag ;
   private boolean[] P09LA2_n785PrvDiaPag ;
   private byte[] P09LA2_A805PrvVto ;
   private boolean[] P09LA2_n805PrvVto ;
   private String[] P09LA2_A498FpgDsc ;
   private boolean[] P09LA2_n498FpgDsc ;
   private String[] P09LA2_A497FpgCod ;
   private boolean[] P09LA2_n497FpgCod ;
   private String[] P09LA2_A6077PrvMail ;
   private boolean[] P09LA2_n6077PrvMail ;
   private String[] P09LA2_A6076PrvFax ;
   private boolean[] P09LA2_n6076PrvFax ;
   private String[] P09LA2_A804PrvTlx ;
   private boolean[] P09LA2_n804PrvTlx ;
   private String[] P09LA2_A803PrvTlf ;
   private boolean[] P09LA2_n803PrvTlf ;
   private String[] P09LA2_A793PrvNif ;
   private boolean[] P09LA2_n793PrvNif ;
   private String[] P09LA2_A6075PrvCp2 ;
   private boolean[] P09LA2_n6075PrvCp2 ;
   private String[] P09LA2_A782PrvCpo ;
   private boolean[] P09LA2_n782PrvCpo ;
   private String[] P09LA2_A799PrvPob ;
   private boolean[] P09LA2_n799PrvPob ;
   private String[] P09LA2_A786PrvDir ;
   private boolean[] P09LA2_n786PrvDir ;
   private int[] P09LA2_A795PrvNum ;
   private String[] P09LA2_A792PrvMetTra ;
   private boolean[] P09LA2_n792PrvMetTra ;
   private String[] P09LA3_A396EmprCod ;
   private String[] P09LA3_A786PrvDir ;
   private boolean[] P09LA3_n786PrvDir ;
   private String[] P09LA3_A783PrvCta ;
   private boolean[] P09LA3_n783PrvCta ;
   private short[] P09LA3_A798PrvPlaEnt ;
   private boolean[] P09LA3_n798PrvPlaEnt ;
   private String[] P09LA3_A801PrvRep ;
   private boolean[] P09LA3_n801PrvRep ;
   private int[] P09LA3_A797PrvPer ;
   private boolean[] P09LA3_n797PrvPer ;
   private int[] P09LA3_A785PrvDiaPag ;
   private boolean[] P09LA3_n785PrvDiaPag ;
   private byte[] P09LA3_A805PrvVto ;
   private boolean[] P09LA3_n805PrvVto ;
   private String[] P09LA3_A498FpgDsc ;
   private boolean[] P09LA3_n498FpgDsc ;
   private String[] P09LA3_A497FpgCod ;
   private boolean[] P09LA3_n497FpgCod ;
   private String[] P09LA3_A6077PrvMail ;
   private boolean[] P09LA3_n6077PrvMail ;
   private String[] P09LA3_A6076PrvFax ;
   private boolean[] P09LA3_n6076PrvFax ;
   private String[] P09LA3_A804PrvTlx ;
   private boolean[] P09LA3_n804PrvTlx ;
   private String[] P09LA3_A803PrvTlf ;
   private boolean[] P09LA3_n803PrvTlf ;
   private String[] P09LA3_A793PrvNif ;
   private boolean[] P09LA3_n793PrvNif ;
   private String[] P09LA3_A6075PrvCp2 ;
   private boolean[] P09LA3_n6075PrvCp2 ;
   private String[] P09LA3_A782PrvCpo ;
   private boolean[] P09LA3_n782PrvCpo ;
   private String[] P09LA3_A799PrvPob ;
   private boolean[] P09LA3_n799PrvPob ;
   private String[] P09LA3_A794PrvNom ;
   private boolean[] P09LA3_n794PrvNom ;
   private int[] P09LA3_A795PrvNum ;
   private String[] P09LA3_A792PrvMetTra ;
   private boolean[] P09LA3_n792PrvMetTra ;
   private String[] P09LA4_A396EmprCod ;
   private String[] P09LA4_A799PrvPob ;
   private boolean[] P09LA4_n799PrvPob ;
   private String[] P09LA4_A783PrvCta ;
   private boolean[] P09LA4_n783PrvCta ;
   private short[] P09LA4_A798PrvPlaEnt ;
   private boolean[] P09LA4_n798PrvPlaEnt ;
   private String[] P09LA4_A801PrvRep ;
   private boolean[] P09LA4_n801PrvRep ;
   private int[] P09LA4_A797PrvPer ;
   private boolean[] P09LA4_n797PrvPer ;
   private int[] P09LA4_A785PrvDiaPag ;
   private boolean[] P09LA4_n785PrvDiaPag ;
   private byte[] P09LA4_A805PrvVto ;
   private boolean[] P09LA4_n805PrvVto ;
   private String[] P09LA4_A498FpgDsc ;
   private boolean[] P09LA4_n498FpgDsc ;
   private String[] P09LA4_A497FpgCod ;
   private boolean[] P09LA4_n497FpgCod ;
   private String[] P09LA4_A6077PrvMail ;
   private boolean[] P09LA4_n6077PrvMail ;
   private String[] P09LA4_A6076PrvFax ;
   private boolean[] P09LA4_n6076PrvFax ;
   private String[] P09LA4_A804PrvTlx ;
   private boolean[] P09LA4_n804PrvTlx ;
   private String[] P09LA4_A803PrvTlf ;
   private boolean[] P09LA4_n803PrvTlf ;
   private String[] P09LA4_A793PrvNif ;
   private boolean[] P09LA4_n793PrvNif ;
   private String[] P09LA4_A6075PrvCp2 ;
   private boolean[] P09LA4_n6075PrvCp2 ;
   private String[] P09LA4_A782PrvCpo ;
   private boolean[] P09LA4_n782PrvCpo ;
   private String[] P09LA4_A786PrvDir ;
   private boolean[] P09LA4_n786PrvDir ;
   private String[] P09LA4_A794PrvNom ;
   private boolean[] P09LA4_n794PrvNom ;
   private int[] P09LA4_A795PrvNum ;
   private String[] P09LA4_A792PrvMetTra ;
   private boolean[] P09LA4_n792PrvMetTra ;
   private String[] P09LA5_A396EmprCod ;
   private String[] P09LA5_A782PrvCpo ;
   private boolean[] P09LA5_n782PrvCpo ;
   private String[] P09LA5_A783PrvCta ;
   private boolean[] P09LA5_n783PrvCta ;
   private short[] P09LA5_A798PrvPlaEnt ;
   private boolean[] P09LA5_n798PrvPlaEnt ;
   private String[] P09LA5_A801PrvRep ;
   private boolean[] P09LA5_n801PrvRep ;
   private int[] P09LA5_A797PrvPer ;
   private boolean[] P09LA5_n797PrvPer ;
   private int[] P09LA5_A785PrvDiaPag ;
   private boolean[] P09LA5_n785PrvDiaPag ;
   private byte[] P09LA5_A805PrvVto ;
   private boolean[] P09LA5_n805PrvVto ;
   private String[] P09LA5_A498FpgDsc ;
   private boolean[] P09LA5_n498FpgDsc ;
   private String[] P09LA5_A497FpgCod ;
   private boolean[] P09LA5_n497FpgCod ;
   private String[] P09LA5_A6077PrvMail ;
   private boolean[] P09LA5_n6077PrvMail ;
   private String[] P09LA5_A6076PrvFax ;
   private boolean[] P09LA5_n6076PrvFax ;
   private String[] P09LA5_A804PrvTlx ;
   private boolean[] P09LA5_n804PrvTlx ;
   private String[] P09LA5_A803PrvTlf ;
   private boolean[] P09LA5_n803PrvTlf ;
   private String[] P09LA5_A793PrvNif ;
   private boolean[] P09LA5_n793PrvNif ;
   private String[] P09LA5_A6075PrvCp2 ;
   private boolean[] P09LA5_n6075PrvCp2 ;
   private String[] P09LA5_A799PrvPob ;
   private boolean[] P09LA5_n799PrvPob ;
   private String[] P09LA5_A786PrvDir ;
   private boolean[] P09LA5_n786PrvDir ;
   private String[] P09LA5_A794PrvNom ;
   private boolean[] P09LA5_n794PrvNom ;
   private int[] P09LA5_A795PrvNum ;
   private String[] P09LA5_A792PrvMetTra ;
   private boolean[] P09LA5_n792PrvMetTra ;
   private String[] P09LA6_A396EmprCod ;
   private String[] P09LA6_A6075PrvCp2 ;
   private boolean[] P09LA6_n6075PrvCp2 ;
   private String[] P09LA6_A783PrvCta ;
   private boolean[] P09LA6_n783PrvCta ;
   private short[] P09LA6_A798PrvPlaEnt ;
   private boolean[] P09LA6_n798PrvPlaEnt ;
   private String[] P09LA6_A801PrvRep ;
   private boolean[] P09LA6_n801PrvRep ;
   private int[] P09LA6_A797PrvPer ;
   private boolean[] P09LA6_n797PrvPer ;
   private int[] P09LA6_A785PrvDiaPag ;
   private boolean[] P09LA6_n785PrvDiaPag ;
   private byte[] P09LA6_A805PrvVto ;
   private boolean[] P09LA6_n805PrvVto ;
   private String[] P09LA6_A498FpgDsc ;
   private boolean[] P09LA6_n498FpgDsc ;
   private String[] P09LA6_A497FpgCod ;
   private boolean[] P09LA6_n497FpgCod ;
   private String[] P09LA6_A6077PrvMail ;
   private boolean[] P09LA6_n6077PrvMail ;
   private String[] P09LA6_A6076PrvFax ;
   private boolean[] P09LA6_n6076PrvFax ;
   private String[] P09LA6_A804PrvTlx ;
   private boolean[] P09LA6_n804PrvTlx ;
   private String[] P09LA6_A803PrvTlf ;
   private boolean[] P09LA6_n803PrvTlf ;
   private String[] P09LA6_A793PrvNif ;
   private boolean[] P09LA6_n793PrvNif ;
   private String[] P09LA6_A782PrvCpo ;
   private boolean[] P09LA6_n782PrvCpo ;
   private String[] P09LA6_A799PrvPob ;
   private boolean[] P09LA6_n799PrvPob ;
   private String[] P09LA6_A786PrvDir ;
   private boolean[] P09LA6_n786PrvDir ;
   private String[] P09LA6_A794PrvNom ;
   private boolean[] P09LA6_n794PrvNom ;
   private int[] P09LA6_A795PrvNum ;
   private String[] P09LA6_A792PrvMetTra ;
   private boolean[] P09LA6_n792PrvMetTra ;
   private String[] P09LA7_A396EmprCod ;
   private String[] P09LA7_A793PrvNif ;
   private boolean[] P09LA7_n793PrvNif ;
   private String[] P09LA7_A783PrvCta ;
   private boolean[] P09LA7_n783PrvCta ;
   private short[] P09LA7_A798PrvPlaEnt ;
   private boolean[] P09LA7_n798PrvPlaEnt ;
   private String[] P09LA7_A801PrvRep ;
   private boolean[] P09LA7_n801PrvRep ;
   private int[] P09LA7_A797PrvPer ;
   private boolean[] P09LA7_n797PrvPer ;
   private int[] P09LA7_A785PrvDiaPag ;
   private boolean[] P09LA7_n785PrvDiaPag ;
   private byte[] P09LA7_A805PrvVto ;
   private boolean[] P09LA7_n805PrvVto ;
   private String[] P09LA7_A498FpgDsc ;
   private boolean[] P09LA7_n498FpgDsc ;
   private String[] P09LA7_A497FpgCod ;
   private boolean[] P09LA7_n497FpgCod ;
   private String[] P09LA7_A6077PrvMail ;
   private boolean[] P09LA7_n6077PrvMail ;
   private String[] P09LA7_A6076PrvFax ;
   private boolean[] P09LA7_n6076PrvFax ;
   private String[] P09LA7_A804PrvTlx ;
   private boolean[] P09LA7_n804PrvTlx ;
   private String[] P09LA7_A803PrvTlf ;
   private boolean[] P09LA7_n803PrvTlf ;
   private String[] P09LA7_A6075PrvCp2 ;
   private boolean[] P09LA7_n6075PrvCp2 ;
   private String[] P09LA7_A782PrvCpo ;
   private boolean[] P09LA7_n782PrvCpo ;
   private String[] P09LA7_A799PrvPob ;
   private boolean[] P09LA7_n799PrvPob ;
   private String[] P09LA7_A786PrvDir ;
   private boolean[] P09LA7_n786PrvDir ;
   private String[] P09LA7_A794PrvNom ;
   private boolean[] P09LA7_n794PrvNom ;
   private int[] P09LA7_A795PrvNum ;
   private String[] P09LA7_A792PrvMetTra ;
   private boolean[] P09LA7_n792PrvMetTra ;
   private String[] P09LA8_A396EmprCod ;
   private String[] P09LA8_A803PrvTlf ;
   private boolean[] P09LA8_n803PrvTlf ;
   private String[] P09LA8_A783PrvCta ;
   private boolean[] P09LA8_n783PrvCta ;
   private short[] P09LA8_A798PrvPlaEnt ;
   private boolean[] P09LA8_n798PrvPlaEnt ;
   private String[] P09LA8_A801PrvRep ;
   private boolean[] P09LA8_n801PrvRep ;
   private int[] P09LA8_A797PrvPer ;
   private boolean[] P09LA8_n797PrvPer ;
   private int[] P09LA8_A785PrvDiaPag ;
   private boolean[] P09LA8_n785PrvDiaPag ;
   private byte[] P09LA8_A805PrvVto ;
   private boolean[] P09LA8_n805PrvVto ;
   private String[] P09LA8_A498FpgDsc ;
   private boolean[] P09LA8_n498FpgDsc ;
   private String[] P09LA8_A497FpgCod ;
   private boolean[] P09LA8_n497FpgCod ;
   private String[] P09LA8_A6077PrvMail ;
   private boolean[] P09LA8_n6077PrvMail ;
   private String[] P09LA8_A6076PrvFax ;
   private boolean[] P09LA8_n6076PrvFax ;
   private String[] P09LA8_A804PrvTlx ;
   private boolean[] P09LA8_n804PrvTlx ;
   private String[] P09LA8_A793PrvNif ;
   private boolean[] P09LA8_n793PrvNif ;
   private String[] P09LA8_A6075PrvCp2 ;
   private boolean[] P09LA8_n6075PrvCp2 ;
   private String[] P09LA8_A782PrvCpo ;
   private boolean[] P09LA8_n782PrvCpo ;
   private String[] P09LA8_A799PrvPob ;
   private boolean[] P09LA8_n799PrvPob ;
   private String[] P09LA8_A786PrvDir ;
   private boolean[] P09LA8_n786PrvDir ;
   private String[] P09LA8_A794PrvNom ;
   private boolean[] P09LA8_n794PrvNom ;
   private int[] P09LA8_A795PrvNum ;
   private String[] P09LA8_A792PrvMetTra ;
   private boolean[] P09LA8_n792PrvMetTra ;
   private String[] P09LA9_A396EmprCod ;
   private String[] P09LA9_A804PrvTlx ;
   private boolean[] P09LA9_n804PrvTlx ;
   private String[] P09LA9_A783PrvCta ;
   private boolean[] P09LA9_n783PrvCta ;
   private short[] P09LA9_A798PrvPlaEnt ;
   private boolean[] P09LA9_n798PrvPlaEnt ;
   private String[] P09LA9_A801PrvRep ;
   private boolean[] P09LA9_n801PrvRep ;
   private int[] P09LA9_A797PrvPer ;
   private boolean[] P09LA9_n797PrvPer ;
   private int[] P09LA9_A785PrvDiaPag ;
   private boolean[] P09LA9_n785PrvDiaPag ;
   private byte[] P09LA9_A805PrvVto ;
   private boolean[] P09LA9_n805PrvVto ;
   private String[] P09LA9_A498FpgDsc ;
   private boolean[] P09LA9_n498FpgDsc ;
   private String[] P09LA9_A497FpgCod ;
   private boolean[] P09LA9_n497FpgCod ;
   private String[] P09LA9_A6077PrvMail ;
   private boolean[] P09LA9_n6077PrvMail ;
   private String[] P09LA9_A6076PrvFax ;
   private boolean[] P09LA9_n6076PrvFax ;
   private String[] P09LA9_A803PrvTlf ;
   private boolean[] P09LA9_n803PrvTlf ;
   private String[] P09LA9_A793PrvNif ;
   private boolean[] P09LA9_n793PrvNif ;
   private String[] P09LA9_A6075PrvCp2 ;
   private boolean[] P09LA9_n6075PrvCp2 ;
   private String[] P09LA9_A782PrvCpo ;
   private boolean[] P09LA9_n782PrvCpo ;
   private String[] P09LA9_A799PrvPob ;
   private boolean[] P09LA9_n799PrvPob ;
   private String[] P09LA9_A786PrvDir ;
   private boolean[] P09LA9_n786PrvDir ;
   private String[] P09LA9_A794PrvNom ;
   private boolean[] P09LA9_n794PrvNom ;
   private int[] P09LA9_A795PrvNum ;
   private String[] P09LA9_A792PrvMetTra ;
   private boolean[] P09LA9_n792PrvMetTra ;
   private String[] P09LA10_A396EmprCod ;
   private String[] P09LA10_A6076PrvFax ;
   private boolean[] P09LA10_n6076PrvFax ;
   private String[] P09LA10_A783PrvCta ;
   private boolean[] P09LA10_n783PrvCta ;
   private short[] P09LA10_A798PrvPlaEnt ;
   private boolean[] P09LA10_n798PrvPlaEnt ;
   private String[] P09LA10_A801PrvRep ;
   private boolean[] P09LA10_n801PrvRep ;
   private int[] P09LA10_A797PrvPer ;
   private boolean[] P09LA10_n797PrvPer ;
   private int[] P09LA10_A785PrvDiaPag ;
   private boolean[] P09LA10_n785PrvDiaPag ;
   private byte[] P09LA10_A805PrvVto ;
   private boolean[] P09LA10_n805PrvVto ;
   private String[] P09LA10_A498FpgDsc ;
   private boolean[] P09LA10_n498FpgDsc ;
   private String[] P09LA10_A497FpgCod ;
   private boolean[] P09LA10_n497FpgCod ;
   private String[] P09LA10_A6077PrvMail ;
   private boolean[] P09LA10_n6077PrvMail ;
   private String[] P09LA10_A804PrvTlx ;
   private boolean[] P09LA10_n804PrvTlx ;
   private String[] P09LA10_A803PrvTlf ;
   private boolean[] P09LA10_n803PrvTlf ;
   private String[] P09LA10_A793PrvNif ;
   private boolean[] P09LA10_n793PrvNif ;
   private String[] P09LA10_A6075PrvCp2 ;
   private boolean[] P09LA10_n6075PrvCp2 ;
   private String[] P09LA10_A782PrvCpo ;
   private boolean[] P09LA10_n782PrvCpo ;
   private String[] P09LA10_A799PrvPob ;
   private boolean[] P09LA10_n799PrvPob ;
   private String[] P09LA10_A786PrvDir ;
   private boolean[] P09LA10_n786PrvDir ;
   private String[] P09LA10_A794PrvNom ;
   private boolean[] P09LA10_n794PrvNom ;
   private int[] P09LA10_A795PrvNum ;
   private String[] P09LA10_A792PrvMetTra ;
   private boolean[] P09LA10_n792PrvMetTra ;
   private String[] P09LA11_A396EmprCod ;
   private String[] P09LA11_A6077PrvMail ;
   private boolean[] P09LA11_n6077PrvMail ;
   private String[] P09LA11_A783PrvCta ;
   private boolean[] P09LA11_n783PrvCta ;
   private short[] P09LA11_A798PrvPlaEnt ;
   private boolean[] P09LA11_n798PrvPlaEnt ;
   private String[] P09LA11_A801PrvRep ;
   private boolean[] P09LA11_n801PrvRep ;
   private int[] P09LA11_A797PrvPer ;
   private boolean[] P09LA11_n797PrvPer ;
   private int[] P09LA11_A785PrvDiaPag ;
   private boolean[] P09LA11_n785PrvDiaPag ;
   private byte[] P09LA11_A805PrvVto ;
   private boolean[] P09LA11_n805PrvVto ;
   private String[] P09LA11_A498FpgDsc ;
   private boolean[] P09LA11_n498FpgDsc ;
   private String[] P09LA11_A497FpgCod ;
   private boolean[] P09LA11_n497FpgCod ;
   private String[] P09LA11_A6076PrvFax ;
   private boolean[] P09LA11_n6076PrvFax ;
   private String[] P09LA11_A804PrvTlx ;
   private boolean[] P09LA11_n804PrvTlx ;
   private String[] P09LA11_A803PrvTlf ;
   private boolean[] P09LA11_n803PrvTlf ;
   private String[] P09LA11_A793PrvNif ;
   private boolean[] P09LA11_n793PrvNif ;
   private String[] P09LA11_A6075PrvCp2 ;
   private boolean[] P09LA11_n6075PrvCp2 ;
   private String[] P09LA11_A782PrvCpo ;
   private boolean[] P09LA11_n782PrvCpo ;
   private String[] P09LA11_A799PrvPob ;
   private boolean[] P09LA11_n799PrvPob ;
   private String[] P09LA11_A786PrvDir ;
   private boolean[] P09LA11_n786PrvDir ;
   private String[] P09LA11_A794PrvNom ;
   private boolean[] P09LA11_n794PrvNom ;
   private int[] P09LA11_A795PrvNum ;
   private String[] P09LA11_A792PrvMetTra ;
   private boolean[] P09LA11_n792PrvMetTra ;
   private String[] P09LA12_A396EmprCod ;
   private String[] P09LA12_A497FpgCod ;
   private boolean[] P09LA12_n497FpgCod ;
   private String[] P09LA12_A783PrvCta ;
   private boolean[] P09LA12_n783PrvCta ;
   private short[] P09LA12_A798PrvPlaEnt ;
   private boolean[] P09LA12_n798PrvPlaEnt ;
   private String[] P09LA12_A801PrvRep ;
   private boolean[] P09LA12_n801PrvRep ;
   private int[] P09LA12_A797PrvPer ;
   private boolean[] P09LA12_n797PrvPer ;
   private int[] P09LA12_A785PrvDiaPag ;
   private boolean[] P09LA12_n785PrvDiaPag ;
   private byte[] P09LA12_A805PrvVto ;
   private boolean[] P09LA12_n805PrvVto ;
   private String[] P09LA12_A498FpgDsc ;
   private boolean[] P09LA12_n498FpgDsc ;
   private String[] P09LA12_A6077PrvMail ;
   private boolean[] P09LA12_n6077PrvMail ;
   private String[] P09LA12_A6076PrvFax ;
   private boolean[] P09LA12_n6076PrvFax ;
   private String[] P09LA12_A804PrvTlx ;
   private boolean[] P09LA12_n804PrvTlx ;
   private String[] P09LA12_A803PrvTlf ;
   private boolean[] P09LA12_n803PrvTlf ;
   private String[] P09LA12_A793PrvNif ;
   private boolean[] P09LA12_n793PrvNif ;
   private String[] P09LA12_A6075PrvCp2 ;
   private boolean[] P09LA12_n6075PrvCp2 ;
   private String[] P09LA12_A782PrvCpo ;
   private boolean[] P09LA12_n782PrvCpo ;
   private String[] P09LA12_A799PrvPob ;
   private boolean[] P09LA12_n799PrvPob ;
   private String[] P09LA12_A786PrvDir ;
   private boolean[] P09LA12_n786PrvDir ;
   private String[] P09LA12_A794PrvNom ;
   private boolean[] P09LA12_n794PrvNom ;
   private int[] P09LA12_A795PrvNum ;
   private String[] P09LA12_A792PrvMetTra ;
   private boolean[] P09LA12_n792PrvMetTra ;
   private String[] P09LA13_A497FpgCod ;
   private boolean[] P09LA13_n497FpgCod ;
   private String[] P09LA13_A396EmprCod ;
   private String[] P09LA13_A783PrvCta ;
   private boolean[] P09LA13_n783PrvCta ;
   private short[] P09LA13_A798PrvPlaEnt ;
   private boolean[] P09LA13_n798PrvPlaEnt ;
   private String[] P09LA13_A801PrvRep ;
   private boolean[] P09LA13_n801PrvRep ;
   private int[] P09LA13_A797PrvPer ;
   private boolean[] P09LA13_n797PrvPer ;
   private int[] P09LA13_A785PrvDiaPag ;
   private boolean[] P09LA13_n785PrvDiaPag ;
   private byte[] P09LA13_A805PrvVto ;
   private boolean[] P09LA13_n805PrvVto ;
   private String[] P09LA13_A498FpgDsc ;
   private boolean[] P09LA13_n498FpgDsc ;
   private String[] P09LA13_A6077PrvMail ;
   private boolean[] P09LA13_n6077PrvMail ;
   private String[] P09LA13_A6076PrvFax ;
   private boolean[] P09LA13_n6076PrvFax ;
   private String[] P09LA13_A804PrvTlx ;
   private boolean[] P09LA13_n804PrvTlx ;
   private String[] P09LA13_A803PrvTlf ;
   private boolean[] P09LA13_n803PrvTlf ;
   private String[] P09LA13_A793PrvNif ;
   private boolean[] P09LA13_n793PrvNif ;
   private String[] P09LA13_A6075PrvCp2 ;
   private boolean[] P09LA13_n6075PrvCp2 ;
   private String[] P09LA13_A782PrvCpo ;
   private boolean[] P09LA13_n782PrvCpo ;
   private String[] P09LA13_A799PrvPob ;
   private boolean[] P09LA13_n799PrvPob ;
   private String[] P09LA13_A786PrvDir ;
   private boolean[] P09LA13_n786PrvDir ;
   private String[] P09LA13_A794PrvNom ;
   private boolean[] P09LA13_n794PrvNom ;
   private int[] P09LA13_A795PrvNum ;
   private String[] P09LA13_A792PrvMetTra ;
   private boolean[] P09LA13_n792PrvMetTra ;
   private String[] P09LA14_A396EmprCod ;
   private String[] P09LA14_A801PrvRep ;
   private boolean[] P09LA14_n801PrvRep ;
   private String[] P09LA14_A783PrvCta ;
   private boolean[] P09LA14_n783PrvCta ;
   private short[] P09LA14_A798PrvPlaEnt ;
   private boolean[] P09LA14_n798PrvPlaEnt ;
   private int[] P09LA14_A797PrvPer ;
   private boolean[] P09LA14_n797PrvPer ;
   private int[] P09LA14_A785PrvDiaPag ;
   private boolean[] P09LA14_n785PrvDiaPag ;
   private byte[] P09LA14_A805PrvVto ;
   private boolean[] P09LA14_n805PrvVto ;
   private String[] P09LA14_A498FpgDsc ;
   private boolean[] P09LA14_n498FpgDsc ;
   private String[] P09LA14_A497FpgCod ;
   private boolean[] P09LA14_n497FpgCod ;
   private String[] P09LA14_A6077PrvMail ;
   private boolean[] P09LA14_n6077PrvMail ;
   private String[] P09LA14_A6076PrvFax ;
   private boolean[] P09LA14_n6076PrvFax ;
   private String[] P09LA14_A804PrvTlx ;
   private boolean[] P09LA14_n804PrvTlx ;
   private String[] P09LA14_A803PrvTlf ;
   private boolean[] P09LA14_n803PrvTlf ;
   private String[] P09LA14_A793PrvNif ;
   private boolean[] P09LA14_n793PrvNif ;
   private String[] P09LA14_A6075PrvCp2 ;
   private boolean[] P09LA14_n6075PrvCp2 ;
   private String[] P09LA14_A782PrvCpo ;
   private boolean[] P09LA14_n782PrvCpo ;
   private String[] P09LA14_A799PrvPob ;
   private boolean[] P09LA14_n799PrvPob ;
   private String[] P09LA14_A786PrvDir ;
   private boolean[] P09LA14_n786PrvDir ;
   private String[] P09LA14_A794PrvNom ;
   private boolean[] P09LA14_n794PrvNom ;
   private int[] P09LA14_A795PrvNum ;
   private String[] P09LA14_A792PrvMetTra ;
   private boolean[] P09LA14_n792PrvMetTra ;
   private String[] P09LA15_A396EmprCod ;
   private String[] P09LA15_A783PrvCta ;
   private boolean[] P09LA15_n783PrvCta ;
   private short[] P09LA15_A798PrvPlaEnt ;
   private boolean[] P09LA15_n798PrvPlaEnt ;
   private String[] P09LA15_A801PrvRep ;
   private boolean[] P09LA15_n801PrvRep ;
   private int[] P09LA15_A797PrvPer ;
   private boolean[] P09LA15_n797PrvPer ;
   private int[] P09LA15_A785PrvDiaPag ;
   private boolean[] P09LA15_n785PrvDiaPag ;
   private byte[] P09LA15_A805PrvVto ;
   private boolean[] P09LA15_n805PrvVto ;
   private String[] P09LA15_A498FpgDsc ;
   private boolean[] P09LA15_n498FpgDsc ;
   private String[] P09LA15_A497FpgCod ;
   private boolean[] P09LA15_n497FpgCod ;
   private String[] P09LA15_A6077PrvMail ;
   private boolean[] P09LA15_n6077PrvMail ;
   private String[] P09LA15_A6076PrvFax ;
   private boolean[] P09LA15_n6076PrvFax ;
   private String[] P09LA15_A804PrvTlx ;
   private boolean[] P09LA15_n804PrvTlx ;
   private String[] P09LA15_A803PrvTlf ;
   private boolean[] P09LA15_n803PrvTlf ;
   private String[] P09LA15_A793PrvNif ;
   private boolean[] P09LA15_n793PrvNif ;
   private String[] P09LA15_A6075PrvCp2 ;
   private boolean[] P09LA15_n6075PrvCp2 ;
   private String[] P09LA15_A782PrvCpo ;
   private boolean[] P09LA15_n782PrvCpo ;
   private String[] P09LA15_A799PrvPob ;
   private boolean[] P09LA15_n799PrvPob ;
   private String[] P09LA15_A786PrvDir ;
   private boolean[] P09LA15_n786PrvDir ;
   private String[] P09LA15_A794PrvNom ;
   private boolean[] P09LA15_n794PrvNom ;
   private int[] P09LA15_A795PrvNum ;
   private String[] P09LA15_A792PrvMetTra ;
   private boolean[] P09LA15_n792PrvMetTra ;
   private GXSimpleCollection<String> AV47TFPrvMetTra_Sels ;
   private GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ;
   private GXSimpleCollection<String> AV55Options ;
   private GXSimpleCollection<String> AV58OptionsDesc ;
   private GXSimpleCollection<String> AV60OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV65GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV66GridStateFilterValue ;
}

final  class listadodeproveedores_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LA2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          int AV70PrvNumFrom ,
                                          int AV71PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV69Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[41];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvNom, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf," ;
      scmdbuf += " T1.PrvNif, T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09LA3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          int AV70PrvNumFrom ,
                                          int AV71PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV69Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[41];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvDir, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf," ;
      scmdbuf += " T1.PrvNif, T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int5[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvDir" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09LA4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          int AV70PrvNumFrom ,
                                          int AV71PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV69Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[41];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvPob, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf," ;
      scmdbuf += " T1.PrvNif, T1.PrvCp2, T1.PrvCpo, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvPob" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09LA5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          int AV70PrvNumFrom ,
                                          int AV71PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV69Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[41];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvCpo, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf," ;
      scmdbuf += " T1.PrvNif, T1.PrvCp2, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvCpo" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09LA6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          int AV70PrvNumFrom ,
                                          int AV71PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV69Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[41];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvCp2, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf," ;
      scmdbuf += " T1.PrvNif, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvCp2" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09LA7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          int AV70PrvNumFrom ,
                                          int AV71PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV69Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[41];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvNif, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf," ;
      scmdbuf += " T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int17[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvNif" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P09LA8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          int AV70PrvNumFrom ,
                                          int AV71PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV69Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[41];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvTlf, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvNif," ;
      scmdbuf += " T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvTlf" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P09LA9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          int AV70PrvNumFrom ,
                                          int AV71PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String A396EmprCod ,
                                          String AV69Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[41];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvTlx, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlf, T1.PrvNif," ;
      scmdbuf += " T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvTlx" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P09LA10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A792PrvMetTra ,
                                           GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                           int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                           String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                           byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                           int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                           int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                           int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                           int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                           String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                           short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                           int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                           String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           int AV70PrvNumFrom ,
                                           int AV71PrvNumTo ,
                                           int A795PrvNum ,
                                           String A794PrvNom ,
                                           String A786PrvDir ,
                                           String A799PrvPob ,
                                           String A782PrvCpo ,
                                           String A6075PrvCp2 ,
                                           String A793PrvNif ,
                                           String A803PrvTlf ,
                                           String A804PrvTlx ,
                                           String A6076PrvFax ,
                                           String A6077PrvMail ,
                                           String A497FpgCod ,
                                           String A498FpgDsc ,
                                           byte A805PrvVto ,
                                           int A785PrvDiaPag ,
                                           int A797PrvPer ,
                                           String A801PrvRep ,
                                           short A798PrvPlaEnt ,
                                           String A783PrvCta ,
                                           String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           String A396EmprCod ,
                                           String AV69Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[41];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvFax, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvTlx, T1.PrvTlf, T1.PrvNif," ;
      scmdbuf += " T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int26[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvFax" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P09LA11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A792PrvMetTra ,
                                           GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                           int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                           String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                           byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                           int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                           int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                           int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                           int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                           String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                           short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                           int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                           String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           int AV70PrvNumFrom ,
                                           int AV71PrvNumTo ,
                                           int A795PrvNum ,
                                           String A794PrvNom ,
                                           String A786PrvDir ,
                                           String A799PrvPob ,
                                           String A782PrvCpo ,
                                           String A6075PrvCp2 ,
                                           String A793PrvNif ,
                                           String A803PrvTlf ,
                                           String A804PrvTlx ,
                                           String A6076PrvFax ,
                                           String A6077PrvMail ,
                                           String A497FpgCod ,
                                           String A498FpgDsc ,
                                           byte A805PrvVto ,
                                           int A785PrvDiaPag ,
                                           int A797PrvPer ,
                                           String A801PrvRep ,
                                           short A798PrvPlaEnt ,
                                           String A783PrvCta ,
                                           String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           String A396EmprCod ,
                                           String AV69Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[41];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvMail, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvFax, T1.PrvTlx, T1.PrvTlf, T1.PrvNif," ;
      scmdbuf += " T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int29[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvMail" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_P09LA12( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A792PrvMetTra ,
                                           GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                           int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                           String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                           byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                           int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                           int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                           int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                           int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                           String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                           short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                           int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                           String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           int AV70PrvNumFrom ,
                                           int AV71PrvNumTo ,
                                           int A795PrvNum ,
                                           String A794PrvNom ,
                                           String A786PrvDir ,
                                           String A799PrvPob ,
                                           String A782PrvCpo ,
                                           String A6075PrvCp2 ,
                                           String A793PrvNif ,
                                           String A803PrvTlf ,
                                           String A804PrvTlx ,
                                           String A6076PrvFax ,
                                           String A6077PrvMail ,
                                           String A497FpgCod ,
                                           String A498FpgDsc ,
                                           byte A805PrvVto ,
                                           int A785PrvDiaPag ,
                                           int A797PrvPer ,
                                           String A801PrvRep ,
                                           short A798PrvPlaEnt ,
                                           String A783PrvCta ,
                                           String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           String AV69Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[41];
      Object[] GXv_Object33 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.FpgCod, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf, T1.PrvNif," ;
      scmdbuf += " T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int32[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int32[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int32[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int32[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int32[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int32[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int32[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int32[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int32[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int32[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int32[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int32[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int32[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int32[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int32[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int32[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int32[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int32[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int32[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int32[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int32[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int32[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int32[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int32[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int32[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int32[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FpgCod" ;
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
   }

   protected Object[] conditional_P09LA13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A792PrvMetTra ,
                                           GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                           int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                           String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                           byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                           int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                           int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                           int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                           int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                           String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                           short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                           int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                           String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           int AV70PrvNumFrom ,
                                           int AV71PrvNumTo ,
                                           int A795PrvNum ,
                                           String A794PrvNom ,
                                           String A786PrvDir ,
                                           String A799PrvPob ,
                                           String A782PrvCpo ,
                                           String A6075PrvCp2 ,
                                           String A793PrvNif ,
                                           String A803PrvTlf ,
                                           String A804PrvTlx ,
                                           String A6076PrvFax ,
                                           String A6077PrvMail ,
                                           String A497FpgCod ,
                                           String A498FpgDsc ,
                                           byte A805PrvVto ,
                                           int A785PrvDiaPag ,
                                           int A797PrvPer ,
                                           String A801PrvRep ,
                                           short A798PrvPlaEnt ,
                                           String A783PrvCta ,
                                           String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           String AV69Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int35 = new byte[41];
      Object[] GXv_Object36 = new Object[2];
      scmdbuf = "SELECT T1.FpgCod, T1.EmprCod, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf, T1.PrvNif," ;
      scmdbuf += " T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int35[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int35[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int35[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int35[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int35[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int35[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int35[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int35[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int35[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int35[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int35[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int35[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int35[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int35[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int35[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int35[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int35[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int35[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int35[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int35[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int35[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int35[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int35[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int35[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int35[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int35[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FpgCod" ;
      GXv_Object36[0] = scmdbuf ;
      GXv_Object36[1] = GXv_int35 ;
      return GXv_Object36 ;
   }

   protected Object[] conditional_P09LA14( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A792PrvMetTra ,
                                           GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                           int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                           String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                           byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                           int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                           int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                           int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                           int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                           String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                           short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                           int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                           String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           int AV70PrvNumFrom ,
                                           int AV71PrvNumTo ,
                                           int A795PrvNum ,
                                           String A794PrvNom ,
                                           String A786PrvDir ,
                                           String A799PrvPob ,
                                           String A782PrvCpo ,
                                           String A6075PrvCp2 ,
                                           String A793PrvNif ,
                                           String A803PrvTlf ,
                                           String A804PrvTlx ,
                                           String A6076PrvFax ,
                                           String A6077PrvMail ,
                                           String A497FpgCod ,
                                           String A498FpgDsc ,
                                           byte A805PrvVto ,
                                           int A785PrvDiaPag ,
                                           int A797PrvPer ,
                                           String A801PrvRep ,
                                           short A798PrvPlaEnt ,
                                           String A783PrvCta ,
                                           String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           String A396EmprCod ,
                                           String AV69Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int38 = new byte[41];
      Object[] GXv_Object39 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvRep, T1.PrvCta, T1.PrvPlaEnt, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf, T1.PrvNif," ;
      scmdbuf += " T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int38[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int38[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int38[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int38[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int38[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int38[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int38[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int38[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int38[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int38[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int38[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int38[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int38[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int38[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int38[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int38[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int38[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int38[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int38[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int38[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int38[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int38[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int38[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int38[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int38[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int38[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvRep" ;
      GXv_Object39[0] = scmdbuf ;
      GXv_Object39[1] = GXv_int38 ;
      return GXv_Object39 ;
   }

   protected Object[] conditional_P09LA15( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A792PrvMetTra ,
                                           GXSimpleCollection<String> AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           int AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                           int AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                           String AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           String AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           String AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           String AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           String AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           String AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           String AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           String AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           String AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           String AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           String AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           String AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           String AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           String AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           String AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           String AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           String AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           String AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           String AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           String AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           String AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           String AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           String AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           String AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           byte AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                           byte AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                           int AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                           int AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                           int AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                           int AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                           String AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           String AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           short AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                           short AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                           int AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                           String AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           String AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           int AV70PrvNumFrom ,
                                           int AV71PrvNumTo ,
                                           int A795PrvNum ,
                                           String A794PrvNom ,
                                           String A786PrvDir ,
                                           String A799PrvPob ,
                                           String A782PrvCpo ,
                                           String A6075PrvCp2 ,
                                           String A793PrvNif ,
                                           String A803PrvTlf ,
                                           String A804PrvTlx ,
                                           String A6076PrvFax ,
                                           String A6077PrvMail ,
                                           String A497FpgCod ,
                                           String A498FpgDsc ,
                                           byte A805PrvVto ,
                                           int A785PrvDiaPag ,
                                           int A797PrvPer ,
                                           String A801PrvRep ,
                                           short A798PrvPlaEnt ,
                                           String A783PrvCta ,
                                           String AV76Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           String A396EmprCod ,
                                           String AV69Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int41 = new byte[41];
      Object[] GXv_Object42 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf, T1.PrvNif," ;
      scmdbuf += " T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV77Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int41[1] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int41[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int41[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV81Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int41[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int41[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int41[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int41[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int41[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int41[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int41[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int41[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int41[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int41[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int41[26] = (byte)(1) ;
      }
      if ( ! (0==AV103Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int41[27] = (byte)(1) ;
      }
      if ( ! (0==AV104Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int41[28] = (byte)(1) ;
      }
      if ( ! (0==AV105Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int41[29] = (byte)(1) ;
      }
      if ( ! (0==AV106Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int41[30] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int41[31] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int41[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV109Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int41[34] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int41[35] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int41[36] = (byte)(1) ;
      }
      if ( AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int41[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int41[38] = (byte)(1) ;
      }
      if ( ! (0==AV70PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int41[39] = (byte)(1) ;
      }
      if ( ! (0==AV71PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int41[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrvCta" ;
      GXv_Object42[0] = scmdbuf ;
      GXv_Object42[1] = GXv_int41 ;
      return GXv_Object42 ;
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
                  return conditional_P09LA2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 1 :
                  return conditional_P09LA3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 2 :
                  return conditional_P09LA4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 3 :
                  return conditional_P09LA5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 4 :
                  return conditional_P09LA6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 5 :
                  return conditional_P09LA7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 6 :
                  return conditional_P09LA8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 7 :
                  return conditional_P09LA9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 8 :
                  return conditional_P09LA10(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 9 :
                  return conditional_P09LA11(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 10 :
                  return conditional_P09LA12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 11 :
                  return conditional_P09LA13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 12 :
                  return conditional_P09LA14(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
            case 13 :
                  return conditional_P09LA15(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LA2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA14", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LA15", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 18);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 14);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 40);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 9 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 10 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 11 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 12 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
            case 13 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               return;
      }
   }

}

