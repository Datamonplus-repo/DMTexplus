package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradaproducto_wcgetfilterdata extends GXProcedure
{
   public entradaproducto_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaproducto_wcgetfilterdata.class ), "" );
   }

   public entradaproducto_wcgetfilterdata( int remoteHandle ,
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
      entradaproducto_wcgetfilterdata.this.aP5 = new String[] {""};
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
      entradaproducto_wcgetfilterdata.this.AV42DDOName = aP0;
      entradaproducto_wcgetfilterdata.this.AV40SearchTxt = aP1;
      entradaproducto_wcgetfilterdata.this.AV41SearchTxtTo = aP2;
      entradaproducto_wcgetfilterdata.this.aP3 = aP3;
      entradaproducto_wcgetfilterdata.this.aP4 = aP4;
      entradaproducto_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_ALBARAN") == 0 )
      {
         /* Execute user subroutine: 'LOADALBARANOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_ENTNALBAR") == 0 )
      {
         /* Execute user subroutine: 'LOADENTNALBAROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_ENTLOTN") == 0 )
      {
         /* Execute user subroutine: 'LOADENTLOTNOPTIONS' */
         S141 ();
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
      if ( GXutil.strcmp(AV53Session.getValue("StocksQuimicos.EntradaProducto_WCGridState"), "") == 0 )
      {
         AV55GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.EntradaProducto_WCGridState"), null, null);
      }
      else
      {
         AV55GridState.fromxml(AV53Session.getValue("StocksQuimicos.EntradaProducto_WCGridState"), null, null);
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV56GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLINENT") == 0 )
         {
            AV10TFLinEnt = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFLinEnt_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFECENT") == 0 )
         {
            AV12TFEntFecEnt = localUtil.ctod( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBARAN") == 0 )
         {
            AV14TFAlbaran = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBARAN_SEL") == 0 )
         {
            AV15TFAlbaran_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTNALBAR") == 0 )
         {
            AV16TFEntNAlbar = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTNALBAR_SEL") == 0 )
         {
            AV17TFEntNAlbar_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV18TFPedCod = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFPedCod_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRVNUM") == 0 )
         {
            AV20TFEntPrvNum = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFEntPrvNum_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIENT") == 0 )
         {
            AV22TFEntUniEnt = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFEntUniEnt_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRE") == 0 )
         {
            AV32TFEntPre = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFEntPre_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIREM") == 0 )
         {
            AV34TFEntUniRem = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFEntUniRem_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN") == 0 )
         {
            AV36TFEntLotN = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN_SEL") == 0 )
         {
            AV37TFEntLotN_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFVAL") == 0 )
         {
            AV38TFEntFVal = localUtil.ctod( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV59Emprcod = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV60PrdNum = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNOM") == 0 )
         {
            AV61Prdnom = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBARANOPTIONS' Routine */
      returnInSub = false ;
      AV14TFAlbaran = AV40SearchTxt ;
      AV15TFAlbaran_Sel = "" ;
      AV70Stocksquimicos_entradaproducto_wcds_1_tflinent = AV10TFLinEnt ;
      AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to = AV11TFLinEnt_To ;
      AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent = AV12TFEntFecEnt ;
      AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran = AV14TFAlbaran ;
      AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel = AV15TFAlbaran_Sel ;
      AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = AV16TFEntNAlbar ;
      AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel = AV17TFEntNAlbar_Sel ;
      AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod = AV18TFPedCod ;
      AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to = AV19TFPedCod_To ;
      AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum = AV20TFEntPrvNum ;
      AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to = AV21TFEntPrvNum_To ;
      AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient = AV22TFEntUniEnt ;
      AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to = AV23TFEntUniEnt_To ;
      AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre = AV32TFEntPre ;
      AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to = AV33TFEntPre_To ;
      AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem = AV34TFEntUniRem ;
      AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to = AV35TFEntUniRem_To ;
      AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn = AV36TFEntLotN ;
      AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel = AV37TFEntLotN_Sel ;
      AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval = AV38TFEntFVal ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV70Stocksquimicos_entradaproducto_wcds_1_tflinent) ,
                                           Short.valueOf(AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to) ,
                                           AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent ,
                                           AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel ,
                                           AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran ,
                                           AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel ,
                                           AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ,
                                           Integer.valueOf(AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod) ,
                                           Integer.valueOf(AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to) ,
                                           Integer.valueOf(AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum) ,
                                           Integer.valueOf(AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to) ,
                                           AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient ,
                                           AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to ,
                                           AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre ,
                                           AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to ,
                                           AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem ,
                                           AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to ,
                                           AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel ,
                                           AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn ,
                                           AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval ,
                                           Short.valueOf(A597LinEnt) ,
                                           A415EntFecEnt ,
                                           A11Albaran ,
                                           A12857EntNAlbar ,
                                           Integer.valueOf(A658PedCod) ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A419EntUniRem ,
                                           A5686EntLotN ,
                                           A5685EntFVal ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           A719PrdNum ,
                                           AV60PrdNum ,
                                           Byte.valueOf(A411EntCon) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran = GXutil.padr( GXutil.rtrim( AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran), 10, "%") ;
      lV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = GXutil.padr( GXutil.rtrim( AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar), 20, "%") ;
      lV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn), 26, "%") ;
      /* Using cursor P09N22 */
      pr_default.execute(0, new Object[] {AV59Emprcod, AV60PrdNum, Short.valueOf(AV70Stocksquimicos_entradaproducto_wcds_1_tflinent), Short.valueOf(AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to), AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent, lV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran, AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel, lV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar, AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel, Integer.valueOf(AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod), Integer.valueOf(AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to), Integer.valueOf(AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum), Integer.valueOf(AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to), AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient, AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to, AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre, AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to, AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem, AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to, lV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn, AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel, AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9N22 = false ;
         A396EmprCod = P09N22_A396EmprCod[0] ;
         A719PrdNum = P09N22_A719PrdNum[0] ;
         A411EntCon = P09N22_A411EntCon[0] ;
         A11Albaran = P09N22_A11Albaran[0] ;
         A5685EntFVal = P09N22_A5685EntFVal[0] ;
         A5686EntLotN = P09N22_A5686EntLotN[0] ;
         A419EntUniRem = P09N22_A419EntUniRem[0] ;
         A417EntPre = P09N22_A417EntPre[0] ;
         A418EntUniEnt = P09N22_A418EntUniEnt[0] ;
         A6156EntPrvNum = P09N22_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P09N22_n6156EntPrvNum[0] ;
         A658PedCod = P09N22_A658PedCod[0] ;
         n658PedCod = P09N22_n658PedCod[0] ;
         A12857EntNAlbar = P09N22_A12857EntNAlbar[0] ;
         A415EntFecEnt = P09N22_A415EntFecEnt[0] ;
         A597LinEnt = P09N22_A597LinEnt[0] ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09N22_A11Albaran[0], A11Albaran) == 0 ) )
         {
            brk9N22 = false ;
            A396EmprCod = P09N22_A396EmprCod[0] ;
            A719PrdNum = P09N22_A719PrdNum[0] ;
            A597LinEnt = P09N22_A597LinEnt[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9N22 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11Albaran)==0) )
         {
            AV44Option = A11Albaran ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9N22 )
         {
            brk9N22 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADENTNALBAROPTIONS' Routine */
      returnInSub = false ;
      AV16TFEntNAlbar = AV40SearchTxt ;
      AV17TFEntNAlbar_Sel = "" ;
      AV70Stocksquimicos_entradaproducto_wcds_1_tflinent = AV10TFLinEnt ;
      AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to = AV11TFLinEnt_To ;
      AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent = AV12TFEntFecEnt ;
      AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran = AV14TFAlbaran ;
      AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel = AV15TFAlbaran_Sel ;
      AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = AV16TFEntNAlbar ;
      AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel = AV17TFEntNAlbar_Sel ;
      AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod = AV18TFPedCod ;
      AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to = AV19TFPedCod_To ;
      AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum = AV20TFEntPrvNum ;
      AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to = AV21TFEntPrvNum_To ;
      AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient = AV22TFEntUniEnt ;
      AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to = AV23TFEntUniEnt_To ;
      AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre = AV32TFEntPre ;
      AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to = AV33TFEntPre_To ;
      AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem = AV34TFEntUniRem ;
      AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to = AV35TFEntUniRem_To ;
      AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn = AV36TFEntLotN ;
      AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel = AV37TFEntLotN_Sel ;
      AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval = AV38TFEntFVal ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV70Stocksquimicos_entradaproducto_wcds_1_tflinent) ,
                                           Short.valueOf(AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to) ,
                                           AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent ,
                                           AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel ,
                                           AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran ,
                                           AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel ,
                                           AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ,
                                           Integer.valueOf(AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod) ,
                                           Integer.valueOf(AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to) ,
                                           Integer.valueOf(AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum) ,
                                           Integer.valueOf(AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to) ,
                                           AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient ,
                                           AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to ,
                                           AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre ,
                                           AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to ,
                                           AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem ,
                                           AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to ,
                                           AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel ,
                                           AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn ,
                                           AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval ,
                                           Short.valueOf(A597LinEnt) ,
                                           A415EntFecEnt ,
                                           A11Albaran ,
                                           A12857EntNAlbar ,
                                           Integer.valueOf(A658PedCod) ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A419EntUniRem ,
                                           A5686EntLotN ,
                                           A5685EntFVal ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           A719PrdNum ,
                                           AV60PrdNum ,
                                           Byte.valueOf(A411EntCon) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran = GXutil.padr( GXutil.rtrim( AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran), 10, "%") ;
      lV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = GXutil.padr( GXutil.rtrim( AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar), 20, "%") ;
      lV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn), 26, "%") ;
      /* Using cursor P09N23 */
      pr_default.execute(1, new Object[] {AV59Emprcod, AV60PrdNum, Short.valueOf(AV70Stocksquimicos_entradaproducto_wcds_1_tflinent), Short.valueOf(AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to), AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent, lV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran, AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel, lV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar, AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel, Integer.valueOf(AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod), Integer.valueOf(AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to), Integer.valueOf(AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum), Integer.valueOf(AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to), AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient, AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to, AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre, AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to, AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem, AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to, lV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn, AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel, AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9N24 = false ;
         A396EmprCod = P09N23_A396EmprCod[0] ;
         A719PrdNum = P09N23_A719PrdNum[0] ;
         A411EntCon = P09N23_A411EntCon[0] ;
         A12857EntNAlbar = P09N23_A12857EntNAlbar[0] ;
         A5685EntFVal = P09N23_A5685EntFVal[0] ;
         A5686EntLotN = P09N23_A5686EntLotN[0] ;
         A419EntUniRem = P09N23_A419EntUniRem[0] ;
         A417EntPre = P09N23_A417EntPre[0] ;
         A418EntUniEnt = P09N23_A418EntUniEnt[0] ;
         A6156EntPrvNum = P09N23_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P09N23_n6156EntPrvNum[0] ;
         A658PedCod = P09N23_A658PedCod[0] ;
         n658PedCod = P09N23_n658PedCod[0] ;
         A11Albaran = P09N23_A11Albaran[0] ;
         A415EntFecEnt = P09N23_A415EntFecEnt[0] ;
         A597LinEnt = P09N23_A597LinEnt[0] ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09N23_A12857EntNAlbar[0], A12857EntNAlbar) == 0 ) )
         {
            brk9N24 = false ;
            A396EmprCod = P09N23_A396EmprCod[0] ;
            A719PrdNum = P09N23_A719PrdNum[0] ;
            A597LinEnt = P09N23_A597LinEnt[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9N24 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A12857EntNAlbar)==0) )
         {
            AV44Option = A12857EntNAlbar ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9N24 )
         {
            brk9N24 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADENTLOTNOPTIONS' Routine */
      returnInSub = false ;
      AV36TFEntLotN = AV40SearchTxt ;
      AV37TFEntLotN_Sel = "" ;
      AV70Stocksquimicos_entradaproducto_wcds_1_tflinent = AV10TFLinEnt ;
      AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to = AV11TFLinEnt_To ;
      AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent = AV12TFEntFecEnt ;
      AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran = AV14TFAlbaran ;
      AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel = AV15TFAlbaran_Sel ;
      AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = AV16TFEntNAlbar ;
      AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel = AV17TFEntNAlbar_Sel ;
      AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod = AV18TFPedCod ;
      AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to = AV19TFPedCod_To ;
      AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum = AV20TFEntPrvNum ;
      AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to = AV21TFEntPrvNum_To ;
      AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient = AV22TFEntUniEnt ;
      AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to = AV23TFEntUniEnt_To ;
      AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre = AV32TFEntPre ;
      AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to = AV33TFEntPre_To ;
      AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem = AV34TFEntUniRem ;
      AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to = AV35TFEntUniRem_To ;
      AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn = AV36TFEntLotN ;
      AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel = AV37TFEntLotN_Sel ;
      AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval = AV38TFEntFVal ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV70Stocksquimicos_entradaproducto_wcds_1_tflinent) ,
                                           Short.valueOf(AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to) ,
                                           AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent ,
                                           AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel ,
                                           AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran ,
                                           AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel ,
                                           AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ,
                                           Integer.valueOf(AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod) ,
                                           Integer.valueOf(AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to) ,
                                           Integer.valueOf(AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum) ,
                                           Integer.valueOf(AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to) ,
                                           AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient ,
                                           AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to ,
                                           AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre ,
                                           AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to ,
                                           AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem ,
                                           AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to ,
                                           AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel ,
                                           AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn ,
                                           AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval ,
                                           Short.valueOf(A597LinEnt) ,
                                           A415EntFecEnt ,
                                           A11Albaran ,
                                           A12857EntNAlbar ,
                                           Integer.valueOf(A658PedCod) ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A419EntUniRem ,
                                           A5686EntLotN ,
                                           A5685EntFVal ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           A719PrdNum ,
                                           AV60PrdNum ,
                                           Byte.valueOf(A411EntCon) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran = GXutil.padr( GXutil.rtrim( AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran), 10, "%") ;
      lV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = GXutil.padr( GXutil.rtrim( AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar), 20, "%") ;
      lV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn), 26, "%") ;
      /* Using cursor P09N24 */
      pr_default.execute(2, new Object[] {AV59Emprcod, AV60PrdNum, Short.valueOf(AV70Stocksquimicos_entradaproducto_wcds_1_tflinent), Short.valueOf(AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to), AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent, lV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran, AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel, lV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar, AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel, Integer.valueOf(AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod), Integer.valueOf(AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to), Integer.valueOf(AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum), Integer.valueOf(AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to), AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient, AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to, AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre, AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to, AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem, AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to, lV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn, AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel, AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9N26 = false ;
         A396EmprCod = P09N24_A396EmprCod[0] ;
         A719PrdNum = P09N24_A719PrdNum[0] ;
         A411EntCon = P09N24_A411EntCon[0] ;
         A5686EntLotN = P09N24_A5686EntLotN[0] ;
         A5685EntFVal = P09N24_A5685EntFVal[0] ;
         A419EntUniRem = P09N24_A419EntUniRem[0] ;
         A417EntPre = P09N24_A417EntPre[0] ;
         A418EntUniEnt = P09N24_A418EntUniEnt[0] ;
         A6156EntPrvNum = P09N24_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P09N24_n6156EntPrvNum[0] ;
         A658PedCod = P09N24_A658PedCod[0] ;
         n658PedCod = P09N24_n658PedCod[0] ;
         A12857EntNAlbar = P09N24_A12857EntNAlbar[0] ;
         A11Albaran = P09N24_A11Albaran[0] ;
         A415EntFecEnt = P09N24_A415EntFecEnt[0] ;
         A597LinEnt = P09N24_A597LinEnt[0] ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09N24_A5686EntLotN[0], A5686EntLotN) == 0 ) )
         {
            brk9N26 = false ;
            A396EmprCod = P09N24_A396EmprCod[0] ;
            A719PrdNum = P09N24_A719PrdNum[0] ;
            A597LinEnt = P09N24_A597LinEnt[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9N26 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5686EntLotN)==0) )
         {
            AV44Option = A5686EntLotN ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9N26 )
         {
            brk9N26 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = entradaproducto_wcgetfilterdata.this.AV46OptionsJson;
      this.aP4[0] = entradaproducto_wcgetfilterdata.this.AV49OptionsDescJson;
      this.aP5[0] = entradaproducto_wcgetfilterdata.this.AV51OptionIndexesJson;
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
      AV12TFEntFecEnt = GXutil.nullDate() ;
      AV14TFAlbaran = "" ;
      AV15TFAlbaran_Sel = "" ;
      AV16TFEntNAlbar = "" ;
      AV17TFEntNAlbar_Sel = "" ;
      AV22TFEntUniEnt = DecimalUtil.ZERO ;
      AV23TFEntUniEnt_To = DecimalUtil.ZERO ;
      AV32TFEntPre = DecimalUtil.ZERO ;
      AV33TFEntPre_To = DecimalUtil.ZERO ;
      AV34TFEntUniRem = DecimalUtil.ZERO ;
      AV35TFEntUniRem_To = DecimalUtil.ZERO ;
      AV36TFEntLotN = "" ;
      AV37TFEntLotN_Sel = "" ;
      AV38TFEntFVal = GXutil.nullDate() ;
      AV59Emprcod = "" ;
      AV60PrdNum = "" ;
      AV61Prdnom = "" ;
      A11Albaran = "" ;
      AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent = GXutil.nullDate() ;
      AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran = "" ;
      AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel = "" ;
      AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = "" ;
      AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel = "" ;
      AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient = DecimalUtil.ZERO ;
      AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to = DecimalUtil.ZERO ;
      AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre = DecimalUtil.ZERO ;
      AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to = DecimalUtil.ZERO ;
      AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem = DecimalUtil.ZERO ;
      AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to = DecimalUtil.ZERO ;
      AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn = "" ;
      AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel = "" ;
      AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran = "" ;
      lV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar = "" ;
      lV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A12857EntNAlbar = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A5685EntFVal = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P09N22_A396EmprCod = new String[] {""} ;
      P09N22_A719PrdNum = new String[] {""} ;
      P09N22_A411EntCon = new byte[1] ;
      P09N22_A11Albaran = new String[] {""} ;
      P09N22_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      P09N22_A5686EntLotN = new String[] {""} ;
      P09N22_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09N22_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09N22_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09N22_A6156EntPrvNum = new int[1] ;
      P09N22_n6156EntPrvNum = new boolean[] {false} ;
      P09N22_A658PedCod = new int[1] ;
      P09N22_n658PedCod = new boolean[] {false} ;
      P09N22_A12857EntNAlbar = new String[] {""} ;
      P09N22_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09N22_A597LinEnt = new short[1] ;
      AV44Option = "" ;
      P09N23_A396EmprCod = new String[] {""} ;
      P09N23_A719PrdNum = new String[] {""} ;
      P09N23_A411EntCon = new byte[1] ;
      P09N23_A12857EntNAlbar = new String[] {""} ;
      P09N23_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      P09N23_A5686EntLotN = new String[] {""} ;
      P09N23_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09N23_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09N23_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09N23_A6156EntPrvNum = new int[1] ;
      P09N23_n6156EntPrvNum = new boolean[] {false} ;
      P09N23_A658PedCod = new int[1] ;
      P09N23_n658PedCod = new boolean[] {false} ;
      P09N23_A11Albaran = new String[] {""} ;
      P09N23_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09N23_A597LinEnt = new short[1] ;
      P09N24_A396EmprCod = new String[] {""} ;
      P09N24_A719PrdNum = new String[] {""} ;
      P09N24_A411EntCon = new byte[1] ;
      P09N24_A5686EntLotN = new String[] {""} ;
      P09N24_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      P09N24_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09N24_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09N24_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09N24_A6156EntPrvNum = new int[1] ;
      P09N24_n6156EntPrvNum = new boolean[] {false} ;
      P09N24_A658PedCod = new int[1] ;
      P09N24_n658PedCod = new boolean[] {false} ;
      P09N24_A12857EntNAlbar = new String[] {""} ;
      P09N24_A11Albaran = new String[] {""} ;
      P09N24_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09N24_A597LinEnt = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.entradaproducto_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09N22_A396EmprCod, P09N22_A719PrdNum, P09N22_A411EntCon, P09N22_A11Albaran, P09N22_A5685EntFVal, P09N22_A5686EntLotN, P09N22_A419EntUniRem, P09N22_A417EntPre, P09N22_A418EntUniEnt, P09N22_A6156EntPrvNum,
            P09N22_n6156EntPrvNum, P09N22_A658PedCod, P09N22_n658PedCod, P09N22_A12857EntNAlbar, P09N22_A415EntFecEnt, P09N22_A597LinEnt
            }
            , new Object[] {
            P09N23_A396EmprCod, P09N23_A719PrdNum, P09N23_A411EntCon, P09N23_A12857EntNAlbar, P09N23_A5685EntFVal, P09N23_A5686EntLotN, P09N23_A419EntUniRem, P09N23_A417EntPre, P09N23_A418EntUniEnt, P09N23_A6156EntPrvNum,
            P09N23_n6156EntPrvNum, P09N23_A658PedCod, P09N23_n658PedCod, P09N23_A11Albaran, P09N23_A415EntFecEnt, P09N23_A597LinEnt
            }
            , new Object[] {
            P09N24_A396EmprCod, P09N24_A719PrdNum, P09N24_A411EntCon, P09N24_A5686EntLotN, P09N24_A5685EntFVal, P09N24_A419EntUniRem, P09N24_A417EntPre, P09N24_A418EntUniEnt, P09N24_A6156EntPrvNum, P09N24_n6156EntPrvNum,
            P09N24_A658PedCod, P09N24_n658PedCod, P09N24_A12857EntNAlbar, P09N24_A11Albaran, P09N24_A415EntFecEnt, P09N24_A597LinEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A411EntCon ;
   private short AV10TFLinEnt ;
   private short AV11TFLinEnt_To ;
   private short AV70Stocksquimicos_entradaproducto_wcds_1_tflinent ;
   private short AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int AV68GXV1 ;
   private int AV18TFPedCod ;
   private int AV19TFPedCod_To ;
   private int AV20TFEntPrvNum ;
   private int AV21TFEntPrvNum_To ;
   private int AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod ;
   private int AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to ;
   private int AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum ;
   private int AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to ;
   private int A658PedCod ;
   private int A6156EntPrvNum ;
   private long AV52count ;
   private java.math.BigDecimal AV22TFEntUniEnt ;
   private java.math.BigDecimal AV23TFEntUniEnt_To ;
   private java.math.BigDecimal AV32TFEntPre ;
   private java.math.BigDecimal AV33TFEntPre_To ;
   private java.math.BigDecimal AV34TFEntUniRem ;
   private java.math.BigDecimal AV35TFEntUniRem_To ;
   private java.math.BigDecimal AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient ;
   private java.math.BigDecimal AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to ;
   private java.math.BigDecimal AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre ;
   private java.math.BigDecimal AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to ;
   private java.math.BigDecimal AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem ;
   private java.math.BigDecimal AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A419EntUniRem ;
   private String AV14TFAlbaran ;
   private String AV15TFAlbaran_Sel ;
   private String AV16TFEntNAlbar ;
   private String AV17TFEntNAlbar_Sel ;
   private String AV36TFEntLotN ;
   private String AV37TFEntLotN_Sel ;
   private String AV59Emprcod ;
   private String AV60PrdNum ;
   private String AV61Prdnom ;
   private String A11Albaran ;
   private String AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran ;
   private String AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel ;
   private String AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ;
   private String AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel ;
   private String AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn ;
   private String AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel ;
   private String scmdbuf ;
   private String lV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran ;
   private String lV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ;
   private String lV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn ;
   private String A12857EntNAlbar ;
   private String A5686EntLotN ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private java.util.Date AV12TFEntFecEnt ;
   private java.util.Date AV38TFEntFVal ;
   private java.util.Date AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent ;
   private java.util.Date AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date A5685EntFVal ;
   private boolean returnInSub ;
   private boolean brk9N22 ;
   private boolean n6156EntPrvNum ;
   private boolean n658PedCod ;
   private boolean brk9N24 ;
   private boolean brk9N26 ;
   private String AV46OptionsJson ;
   private String AV49OptionsDescJson ;
   private String AV51OptionIndexesJson ;
   private String AV42DDOName ;
   private String AV40SearchTxt ;
   private String AV41SearchTxtTo ;
   private String AV44Option ;
   private com.genexus.webpanels.WebSession AV53Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09N22_A396EmprCod ;
   private String[] P09N22_A719PrdNum ;
   private byte[] P09N22_A411EntCon ;
   private String[] P09N22_A11Albaran ;
   private java.util.Date[] P09N22_A5685EntFVal ;
   private String[] P09N22_A5686EntLotN ;
   private java.math.BigDecimal[] P09N22_A419EntUniRem ;
   private java.math.BigDecimal[] P09N22_A417EntPre ;
   private java.math.BigDecimal[] P09N22_A418EntUniEnt ;
   private int[] P09N22_A6156EntPrvNum ;
   private boolean[] P09N22_n6156EntPrvNum ;
   private int[] P09N22_A658PedCod ;
   private boolean[] P09N22_n658PedCod ;
   private String[] P09N22_A12857EntNAlbar ;
   private java.util.Date[] P09N22_A415EntFecEnt ;
   private short[] P09N22_A597LinEnt ;
   private String[] P09N23_A396EmprCod ;
   private String[] P09N23_A719PrdNum ;
   private byte[] P09N23_A411EntCon ;
   private String[] P09N23_A12857EntNAlbar ;
   private java.util.Date[] P09N23_A5685EntFVal ;
   private String[] P09N23_A5686EntLotN ;
   private java.math.BigDecimal[] P09N23_A419EntUniRem ;
   private java.math.BigDecimal[] P09N23_A417EntPre ;
   private java.math.BigDecimal[] P09N23_A418EntUniEnt ;
   private int[] P09N23_A6156EntPrvNum ;
   private boolean[] P09N23_n6156EntPrvNum ;
   private int[] P09N23_A658PedCod ;
   private boolean[] P09N23_n658PedCod ;
   private String[] P09N23_A11Albaran ;
   private java.util.Date[] P09N23_A415EntFecEnt ;
   private short[] P09N23_A597LinEnt ;
   private String[] P09N24_A396EmprCod ;
   private String[] P09N24_A719PrdNum ;
   private byte[] P09N24_A411EntCon ;
   private String[] P09N24_A5686EntLotN ;
   private java.util.Date[] P09N24_A5685EntFVal ;
   private java.math.BigDecimal[] P09N24_A419EntUniRem ;
   private java.math.BigDecimal[] P09N24_A417EntPre ;
   private java.math.BigDecimal[] P09N24_A418EntUniEnt ;
   private int[] P09N24_A6156EntPrvNum ;
   private boolean[] P09N24_n6156EntPrvNum ;
   private int[] P09N24_A658PedCod ;
   private boolean[] P09N24_n658PedCod ;
   private String[] P09N24_A12857EntNAlbar ;
   private String[] P09N24_A11Albaran ;
   private java.util.Date[] P09N24_A415EntFecEnt ;
   private short[] P09N24_A597LinEnt ;
   private GXSimpleCollection<String> AV45Options ;
   private GXSimpleCollection<String> AV48OptionsDesc ;
   private GXSimpleCollection<String> AV50OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV55GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV56GridStateFilterValue ;
}

final  class entradaproducto_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09N22( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV70Stocksquimicos_entradaproducto_wcds_1_tflinent ,
                                          short AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to ,
                                          java.util.Date AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent ,
                                          String AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel ,
                                          String AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran ,
                                          String AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel ,
                                          String AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ,
                                          int AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod ,
                                          int AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to ,
                                          int AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum ,
                                          int AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to ,
                                          java.math.BigDecimal AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient ,
                                          java.math.BigDecimal AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to ,
                                          java.math.BigDecimal AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre ,
                                          java.math.BigDecimal AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to ,
                                          java.math.BigDecimal AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem ,
                                          java.math.BigDecimal AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to ,
                                          String AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel ,
                                          String AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn ,
                                          java.util.Date AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval ,
                                          short A597LinEnt ,
                                          java.util.Date A415EntFecEnt ,
                                          String A11Albaran ,
                                          String A12857EntNAlbar ,
                                          int A658PedCod ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          String A5686EntLotN ,
                                          java.util.Date A5685EntFVal ,
                                          String A396EmprCod ,
                                          String AV59Emprcod ,
                                          String A719PrdNum ,
                                          String AV60PrdNum ,
                                          byte A411EntCon )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[22];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, EntCon, Albaran, EntFVal, EntLotN, EntUniRem, EntPre, EntUniEnt, EntPrvNum, PedCod, EntNAlbar, EntFecEnt, LinEnt FROM TXPENTALM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(EntCon = 0)");
      if ( ! (0==AV70Stocksquimicos_entradaproducto_wcds_1_tflinent) )
      {
         addWhere(sWhereString, "(LinEnt >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to) )
      {
         addWhere(sWhereString, "(LinEnt <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent)) )
      {
         addWhere(sWhereString, "(EntFecEnt >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel)==0) && ( ! (GXutil.strcmp("", AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Albaran) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel)==0) )
      {
         addWhere(sWhereString, "(Albaran = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel)==0) && ( ! (GXutil.strcmp("", AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntNAlbar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel)==0) )
      {
         addWhere(sWhereString, "(EntNAlbar = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod) )
      {
         addWhere(sWhereString, "(PedCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to) )
      {
         addWhere(sWhereString, "(PedCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum) )
      {
         addWhere(sWhereString, "(EntPrvNum >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(EntPrvNum <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre)==0) )
      {
         addWhere(sWhereString, "(EntPre >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(EntPre <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(EntUniRem >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(EntUniRem <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(EntLotN = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval)) )
      {
         addWhere(sWhereString, "(EntFVal >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Albaran" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09N23( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV70Stocksquimicos_entradaproducto_wcds_1_tflinent ,
                                          short AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to ,
                                          java.util.Date AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent ,
                                          String AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel ,
                                          String AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran ,
                                          String AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel ,
                                          String AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ,
                                          int AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod ,
                                          int AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to ,
                                          int AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum ,
                                          int AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to ,
                                          java.math.BigDecimal AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient ,
                                          java.math.BigDecimal AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to ,
                                          java.math.BigDecimal AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre ,
                                          java.math.BigDecimal AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to ,
                                          java.math.BigDecimal AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem ,
                                          java.math.BigDecimal AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to ,
                                          String AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel ,
                                          String AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn ,
                                          java.util.Date AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval ,
                                          short A597LinEnt ,
                                          java.util.Date A415EntFecEnt ,
                                          String A11Albaran ,
                                          String A12857EntNAlbar ,
                                          int A658PedCod ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          String A5686EntLotN ,
                                          java.util.Date A5685EntFVal ,
                                          String A396EmprCod ,
                                          String AV59Emprcod ,
                                          String A719PrdNum ,
                                          String AV60PrdNum ,
                                          byte A411EntCon )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[22];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, EntCon, EntNAlbar, EntFVal, EntLotN, EntUniRem, EntPre, EntUniEnt, EntPrvNum, PedCod, Albaran, EntFecEnt, LinEnt FROM TXPENTALM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(EntCon = 0)");
      if ( ! (0==AV70Stocksquimicos_entradaproducto_wcds_1_tflinent) )
      {
         addWhere(sWhereString, "(LinEnt >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to) )
      {
         addWhere(sWhereString, "(LinEnt <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent)) )
      {
         addWhere(sWhereString, "(EntFecEnt >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel)==0) && ( ! (GXutil.strcmp("", AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Albaran) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel)==0) )
      {
         addWhere(sWhereString, "(Albaran = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel)==0) && ( ! (GXutil.strcmp("", AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntNAlbar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel)==0) )
      {
         addWhere(sWhereString, "(EntNAlbar = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod) )
      {
         addWhere(sWhereString, "(PedCod >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to) )
      {
         addWhere(sWhereString, "(PedCod <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum) )
      {
         addWhere(sWhereString, "(EntPrvNum >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(EntPrvNum <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre)==0) )
      {
         addWhere(sWhereString, "(EntPre >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(EntPre <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(EntUniRem >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(EntUniRem <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(EntLotN = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval)) )
      {
         addWhere(sWhereString, "(EntFVal >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EntNAlbar" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09N24( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV70Stocksquimicos_entradaproducto_wcds_1_tflinent ,
                                          short AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to ,
                                          java.util.Date AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent ,
                                          String AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel ,
                                          String AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran ,
                                          String AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel ,
                                          String AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar ,
                                          int AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod ,
                                          int AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to ,
                                          int AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum ,
                                          int AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to ,
                                          java.math.BigDecimal AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient ,
                                          java.math.BigDecimal AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to ,
                                          java.math.BigDecimal AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre ,
                                          java.math.BigDecimal AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to ,
                                          java.math.BigDecimal AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem ,
                                          java.math.BigDecimal AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to ,
                                          String AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel ,
                                          String AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn ,
                                          java.util.Date AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval ,
                                          short A597LinEnt ,
                                          java.util.Date A415EntFecEnt ,
                                          String A11Albaran ,
                                          String A12857EntNAlbar ,
                                          int A658PedCod ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          String A5686EntLotN ,
                                          java.util.Date A5685EntFVal ,
                                          String A396EmprCod ,
                                          String AV59Emprcod ,
                                          String A719PrdNum ,
                                          String AV60PrdNum ,
                                          byte A411EntCon )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[22];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, EntCon, EntLotN, EntFVal, EntUniRem, EntPre, EntUniEnt, EntPrvNum, PedCod, EntNAlbar, Albaran, EntFecEnt, LinEnt FROM TXPENTALM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(EntCon = 0)");
      if ( ! (0==AV70Stocksquimicos_entradaproducto_wcds_1_tflinent) )
      {
         addWhere(sWhereString, "(LinEnt >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV71Stocksquimicos_entradaproducto_wcds_2_tflinent_to) )
      {
         addWhere(sWhereString, "(LinEnt <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72Stocksquimicos_entradaproducto_wcds_3_tfentfecent)) )
      {
         addWhere(sWhereString, "(EntFecEnt >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel)==0) && ( ! (GXutil.strcmp("", AV73Stocksquimicos_entradaproducto_wcds_4_tfalbaran)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Albaran) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Stocksquimicos_entradaproducto_wcds_5_tfalbaran_sel)==0) )
      {
         addWhere(sWhereString, "(Albaran = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel)==0) && ( ! (GXutil.strcmp("", AV75Stocksquimicos_entradaproducto_wcds_6_tfentnalbar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntNAlbar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Stocksquimicos_entradaproducto_wcds_7_tfentnalbar_sel)==0) )
      {
         addWhere(sWhereString, "(EntNAlbar = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV77Stocksquimicos_entradaproducto_wcds_8_tfpedcod) )
      {
         addWhere(sWhereString, "(PedCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_entradaproducto_wcds_9_tfpedcod_to) )
      {
         addWhere(sWhereString, "(PedCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV79Stocksquimicos_entradaproducto_wcds_10_tfentprvnum) )
      {
         addWhere(sWhereString, "(EntPrvNum >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Stocksquimicos_entradaproducto_wcds_11_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(EntPrvNum <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Stocksquimicos_entradaproducto_wcds_12_tfentunient)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Stocksquimicos_entradaproducto_wcds_13_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Stocksquimicos_entradaproducto_wcds_14_tfentpre)==0) )
      {
         addWhere(sWhereString, "(EntPre >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Stocksquimicos_entradaproducto_wcds_15_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(EntPre <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Stocksquimicos_entradaproducto_wcds_16_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(EntUniRem >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Stocksquimicos_entradaproducto_wcds_17_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(EntUniRem <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_entradaproducto_wcds_18_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_entradaproducto_wcds_19_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(EntLotN = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Stocksquimicos_entradaproducto_wcds_20_tfentfval)) )
      {
         addWhere(sWhereString, "(EntFVal >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EntLotN" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P09N22(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() );
            case 1 :
                  return conditional_P09N23(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() );
            case 2 :
                  return conditional_P09N24(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09N22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09N23", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09N24", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 20);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 10);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 20);
               ((String[]) buf[13])[0] = rslt.getString(12, 10);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
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
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 10);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 10);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 10);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               return;
      }
   }

}

