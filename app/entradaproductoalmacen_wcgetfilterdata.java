package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradaproductoalmacen_wcgetfilterdata extends GXProcedure
{
   public entradaproductoalmacen_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaproductoalmacen_wcgetfilterdata.class ), "" );
   }

   public entradaproductoalmacen_wcgetfilterdata( int remoteHandle ,
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
      entradaproductoalmacen_wcgetfilterdata.this.aP5 = new String[] {""};
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
      entradaproductoalmacen_wcgetfilterdata.this.AV48DDOName = aP0;
      entradaproductoalmacen_wcgetfilterdata.this.AV49SearchTxt = aP1;
      entradaproductoalmacen_wcgetfilterdata.this.AV50SearchTxtTo = aP2;
      entradaproductoalmacen_wcgetfilterdata.this.aP3 = aP3;
      entradaproductoalmacen_wcgetfilterdata.this.aP4 = aP4;
      entradaproductoalmacen_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV38Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV41OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_ALBARAN") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_ENTNALBAR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV48DDOName), "DDO_ENTLOTN") == 0 )
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
      AV51OptionsJson = AV38Options.toJSonString(false) ;
      AV52OptionsDescJson = AV40OptionsDesc.toJSonString(false) ;
      AV53OptionIndexesJson = AV41OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV43Session.getValue("EntradaProductoAlmacen_WCGridState"), "") == 0 )
      {
         AV45GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "EntradaProductoAlmacen_WCGridState"), null, null);
      }
      else
      {
         AV45GridState.fromxml(AV43Session.getValue("EntradaProductoAlmacen_WCGridState"), null, null);
      }
      AV60GXV1 = 1 ;
      while ( AV60GXV1 <= AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV46GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV45GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV60GXV1));
         if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLINENT") == 0 )
         {
            AV10TFLinEnt = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFLinEnt_To = (short)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFECENT") == 0 )
         {
            AV12TFEntFecEnt = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBARAN") == 0 )
         {
            AV14TFAlbaran = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBARAN_SEL") == 0 )
         {
            AV15TFAlbaran_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTNALBAR") == 0 )
         {
            AV16TFEntNAlbar = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTNALBAR_SEL") == 0 )
         {
            AV17TFEntNAlbar_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV18TFPedCod = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFPedCod_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTNEMB") == 0 )
         {
            AV20TFEntNEmb = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFEntNEmb_To = (byte)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRVNUM") == 0 )
         {
            AV22TFEntPrvNum = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFEntPrvNum_To = (int)(GXutil.lval( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIENT") == 0 )
         {
            AV24TFEntUniEnt = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFEntUniEnt_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTPRE") == 0 )
         {
            AV28TFEntPre = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFEntPre_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTUNIREM") == 0 )
         {
            AV30TFEntUniRem = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFEntUniRem_To = CommonUtil.decimalVal( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN") == 0 )
         {
            AV32TFEntLotN = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTLOTN_SEL") == 0 )
         {
            AV33TFEntLotN_Sel = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFENTFVAL") == 0 )
         {
            AV34TFEntFVal = localUtil.ctod( AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV55Emprcod = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUM") == 0 )
         {
            AV56Prdnum = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNOM") == 0 )
         {
            AV57PrdNom = AV46GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV60GXV1 = (int)(AV60GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALBARANOPTIONS' Routine */
      returnInSub = false ;
      AV14TFAlbaran = AV49SearchTxt ;
      AV15TFAlbaran_Sel = "" ;
      AV62Entradaproductoalmacen_wcds_1_tflinent = AV10TFLinEnt ;
      AV63Entradaproductoalmacen_wcds_2_tflinent_to = AV11TFLinEnt_To ;
      AV64Entradaproductoalmacen_wcds_3_tfentfecent = AV12TFEntFecEnt ;
      AV65Entradaproductoalmacen_wcds_4_tfalbaran = AV14TFAlbaran ;
      AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel = AV15TFAlbaran_Sel ;
      AV67Entradaproductoalmacen_wcds_6_tfentnalbar = AV16TFEntNAlbar ;
      AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel = AV17TFEntNAlbar_Sel ;
      AV69Entradaproductoalmacen_wcds_8_tfpedcod = AV18TFPedCod ;
      AV70Entradaproductoalmacen_wcds_9_tfpedcod_to = AV19TFPedCod_To ;
      AV71Entradaproductoalmacen_wcds_10_tfentnemb = AV20TFEntNEmb ;
      AV72Entradaproductoalmacen_wcds_11_tfentnemb_to = AV21TFEntNEmb_To ;
      AV73Entradaproductoalmacen_wcds_12_tfentprvnum = AV22TFEntPrvNum ;
      AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to = AV23TFEntPrvNum_To ;
      AV75Entradaproductoalmacen_wcds_14_tfentunient = AV24TFEntUniEnt ;
      AV76Entradaproductoalmacen_wcds_15_tfentunient_to = AV25TFEntUniEnt_To ;
      AV77Entradaproductoalmacen_wcds_16_tfentpre = AV28TFEntPre ;
      AV78Entradaproductoalmacen_wcds_17_tfentpre_to = AV29TFEntPre_To ;
      AV79Entradaproductoalmacen_wcds_18_tfentunirem = AV30TFEntUniRem ;
      AV80Entradaproductoalmacen_wcds_19_tfentunirem_to = AV31TFEntUniRem_To ;
      AV81Entradaproductoalmacen_wcds_20_tfentlotn = AV32TFEntLotN ;
      AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel = AV33TFEntLotN_Sel ;
      AV83Entradaproductoalmacen_wcds_22_tfentfval = AV34TFEntFVal ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Entradaproductoalmacen_wcds_1_tflinent) ,
                                           Short.valueOf(AV63Entradaproductoalmacen_wcds_2_tflinent_to) ,
                                           AV64Entradaproductoalmacen_wcds_3_tfentfecent ,
                                           AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel ,
                                           AV65Entradaproductoalmacen_wcds_4_tfalbaran ,
                                           AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel ,
                                           AV67Entradaproductoalmacen_wcds_6_tfentnalbar ,
                                           Integer.valueOf(AV69Entradaproductoalmacen_wcds_8_tfpedcod) ,
                                           Integer.valueOf(AV70Entradaproductoalmacen_wcds_9_tfpedcod_to) ,
                                           Byte.valueOf(AV71Entradaproductoalmacen_wcds_10_tfentnemb) ,
                                           Byte.valueOf(AV72Entradaproductoalmacen_wcds_11_tfentnemb_to) ,
                                           Integer.valueOf(AV73Entradaproductoalmacen_wcds_12_tfentprvnum) ,
                                           Integer.valueOf(AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to) ,
                                           AV75Entradaproductoalmacen_wcds_14_tfentunient ,
                                           AV76Entradaproductoalmacen_wcds_15_tfentunient_to ,
                                           AV77Entradaproductoalmacen_wcds_16_tfentpre ,
                                           AV78Entradaproductoalmacen_wcds_17_tfentpre_to ,
                                           AV79Entradaproductoalmacen_wcds_18_tfentunirem ,
                                           AV80Entradaproductoalmacen_wcds_19_tfentunirem_to ,
                                           AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel ,
                                           AV81Entradaproductoalmacen_wcds_20_tfentlotn ,
                                           AV83Entradaproductoalmacen_wcds_22_tfentfval ,
                                           Short.valueOf(A597LinEnt) ,
                                           A415EntFecEnt ,
                                           A11Albaran ,
                                           A12857EntNAlbar ,
                                           Integer.valueOf(A658PedCod) ,
                                           Byte.valueOf(A14035EntNEmb) ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A419EntUniRem ,
                                           A5686EntLotN ,
                                           A5685EntFVal ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           A719PrdNum ,
                                           AV56Prdnum ,
                                           Byte.valueOf(A411EntCon) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV65Entradaproductoalmacen_wcds_4_tfalbaran = GXutil.padr( GXutil.rtrim( AV65Entradaproductoalmacen_wcds_4_tfalbaran), 10, "%") ;
      lV67Entradaproductoalmacen_wcds_6_tfentnalbar = GXutil.padr( GXutil.rtrim( AV67Entradaproductoalmacen_wcds_6_tfentnalbar), 20, "%") ;
      lV81Entradaproductoalmacen_wcds_20_tfentlotn = GXutil.padr( GXutil.rtrim( AV81Entradaproductoalmacen_wcds_20_tfentlotn), 26, "%") ;
      /* Using cursor P09QP2 */
      pr_default.execute(0, new Object[] {AV55Emprcod, AV56Prdnum, Short.valueOf(AV62Entradaproductoalmacen_wcds_1_tflinent), Short.valueOf(AV63Entradaproductoalmacen_wcds_2_tflinent_to), AV64Entradaproductoalmacen_wcds_3_tfentfecent, lV65Entradaproductoalmacen_wcds_4_tfalbaran, AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel, lV67Entradaproductoalmacen_wcds_6_tfentnalbar, AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel, Integer.valueOf(AV69Entradaproductoalmacen_wcds_8_tfpedcod), Integer.valueOf(AV70Entradaproductoalmacen_wcds_9_tfpedcod_to), Byte.valueOf(AV71Entradaproductoalmacen_wcds_10_tfentnemb), Byte.valueOf(AV72Entradaproductoalmacen_wcds_11_tfentnemb_to), Integer.valueOf(AV73Entradaproductoalmacen_wcds_12_tfentprvnum), Integer.valueOf(AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to), AV75Entradaproductoalmacen_wcds_14_tfentunient, AV76Entradaproductoalmacen_wcds_15_tfentunient_to, AV77Entradaproductoalmacen_wcds_16_tfentpre, AV78Entradaproductoalmacen_wcds_17_tfentpre_to, AV79Entradaproductoalmacen_wcds_18_tfentunirem, AV80Entradaproductoalmacen_wcds_19_tfentunirem_to, lV81Entradaproductoalmacen_wcds_20_tfentlotn, AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel, AV83Entradaproductoalmacen_wcds_22_tfentfval});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9QP2 = false ;
         A396EmprCod = P09QP2_A396EmprCod[0] ;
         A719PrdNum = P09QP2_A719PrdNum[0] ;
         A411EntCon = P09QP2_A411EntCon[0] ;
         A11Albaran = P09QP2_A11Albaran[0] ;
         A5685EntFVal = P09QP2_A5685EntFVal[0] ;
         A5686EntLotN = P09QP2_A5686EntLotN[0] ;
         A419EntUniRem = P09QP2_A419EntUniRem[0] ;
         A417EntPre = P09QP2_A417EntPre[0] ;
         A418EntUniEnt = P09QP2_A418EntUniEnt[0] ;
         A6156EntPrvNum = P09QP2_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P09QP2_n6156EntPrvNum[0] ;
         A14035EntNEmb = P09QP2_A14035EntNEmb[0] ;
         A658PedCod = P09QP2_A658PedCod[0] ;
         n658PedCod = P09QP2_n658PedCod[0] ;
         A12857EntNAlbar = P09QP2_A12857EntNAlbar[0] ;
         A415EntFecEnt = P09QP2_A415EntFecEnt[0] ;
         A597LinEnt = P09QP2_A597LinEnt[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09QP2_A11Albaran[0], A11Albaran) == 0 ) )
         {
            brk9QP2 = false ;
            A396EmprCod = P09QP2_A396EmprCod[0] ;
            A719PrdNum = P09QP2_A719PrdNum[0] ;
            A597LinEnt = P09QP2_A597LinEnt[0] ;
            AV42count = (long)(AV42count+1) ;
            brk9QP2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A11Albaran)==0) )
         {
            AV37Option = A11Albaran ;
            AV38Options.add(AV37Option, 0);
            AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV38Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9QP2 )
         {
            brk9QP2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADENTNALBAROPTIONS' Routine */
      returnInSub = false ;
      AV16TFEntNAlbar = AV49SearchTxt ;
      AV17TFEntNAlbar_Sel = "" ;
      AV62Entradaproductoalmacen_wcds_1_tflinent = AV10TFLinEnt ;
      AV63Entradaproductoalmacen_wcds_2_tflinent_to = AV11TFLinEnt_To ;
      AV64Entradaproductoalmacen_wcds_3_tfentfecent = AV12TFEntFecEnt ;
      AV65Entradaproductoalmacen_wcds_4_tfalbaran = AV14TFAlbaran ;
      AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel = AV15TFAlbaran_Sel ;
      AV67Entradaproductoalmacen_wcds_6_tfentnalbar = AV16TFEntNAlbar ;
      AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel = AV17TFEntNAlbar_Sel ;
      AV69Entradaproductoalmacen_wcds_8_tfpedcod = AV18TFPedCod ;
      AV70Entradaproductoalmacen_wcds_9_tfpedcod_to = AV19TFPedCod_To ;
      AV71Entradaproductoalmacen_wcds_10_tfentnemb = AV20TFEntNEmb ;
      AV72Entradaproductoalmacen_wcds_11_tfentnemb_to = AV21TFEntNEmb_To ;
      AV73Entradaproductoalmacen_wcds_12_tfentprvnum = AV22TFEntPrvNum ;
      AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to = AV23TFEntPrvNum_To ;
      AV75Entradaproductoalmacen_wcds_14_tfentunient = AV24TFEntUniEnt ;
      AV76Entradaproductoalmacen_wcds_15_tfentunient_to = AV25TFEntUniEnt_To ;
      AV77Entradaproductoalmacen_wcds_16_tfentpre = AV28TFEntPre ;
      AV78Entradaproductoalmacen_wcds_17_tfentpre_to = AV29TFEntPre_To ;
      AV79Entradaproductoalmacen_wcds_18_tfentunirem = AV30TFEntUniRem ;
      AV80Entradaproductoalmacen_wcds_19_tfentunirem_to = AV31TFEntUniRem_To ;
      AV81Entradaproductoalmacen_wcds_20_tfentlotn = AV32TFEntLotN ;
      AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel = AV33TFEntLotN_Sel ;
      AV83Entradaproductoalmacen_wcds_22_tfentfval = AV34TFEntFVal ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Entradaproductoalmacen_wcds_1_tflinent) ,
                                           Short.valueOf(AV63Entradaproductoalmacen_wcds_2_tflinent_to) ,
                                           AV64Entradaproductoalmacen_wcds_3_tfentfecent ,
                                           AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel ,
                                           AV65Entradaproductoalmacen_wcds_4_tfalbaran ,
                                           AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel ,
                                           AV67Entradaproductoalmacen_wcds_6_tfentnalbar ,
                                           Integer.valueOf(AV69Entradaproductoalmacen_wcds_8_tfpedcod) ,
                                           Integer.valueOf(AV70Entradaproductoalmacen_wcds_9_tfpedcod_to) ,
                                           Byte.valueOf(AV71Entradaproductoalmacen_wcds_10_tfentnemb) ,
                                           Byte.valueOf(AV72Entradaproductoalmacen_wcds_11_tfentnemb_to) ,
                                           Integer.valueOf(AV73Entradaproductoalmacen_wcds_12_tfentprvnum) ,
                                           Integer.valueOf(AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to) ,
                                           AV75Entradaproductoalmacen_wcds_14_tfentunient ,
                                           AV76Entradaproductoalmacen_wcds_15_tfentunient_to ,
                                           AV77Entradaproductoalmacen_wcds_16_tfentpre ,
                                           AV78Entradaproductoalmacen_wcds_17_tfentpre_to ,
                                           AV79Entradaproductoalmacen_wcds_18_tfentunirem ,
                                           AV80Entradaproductoalmacen_wcds_19_tfentunirem_to ,
                                           AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel ,
                                           AV81Entradaproductoalmacen_wcds_20_tfentlotn ,
                                           AV83Entradaproductoalmacen_wcds_22_tfentfval ,
                                           Short.valueOf(A597LinEnt) ,
                                           A415EntFecEnt ,
                                           A11Albaran ,
                                           A12857EntNAlbar ,
                                           Integer.valueOf(A658PedCod) ,
                                           Byte.valueOf(A14035EntNEmb) ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A419EntUniRem ,
                                           A5686EntLotN ,
                                           A5685EntFVal ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           A719PrdNum ,
                                           AV56Prdnum ,
                                           Byte.valueOf(A411EntCon) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV65Entradaproductoalmacen_wcds_4_tfalbaran = GXutil.padr( GXutil.rtrim( AV65Entradaproductoalmacen_wcds_4_tfalbaran), 10, "%") ;
      lV67Entradaproductoalmacen_wcds_6_tfentnalbar = GXutil.padr( GXutil.rtrim( AV67Entradaproductoalmacen_wcds_6_tfentnalbar), 20, "%") ;
      lV81Entradaproductoalmacen_wcds_20_tfentlotn = GXutil.padr( GXutil.rtrim( AV81Entradaproductoalmacen_wcds_20_tfentlotn), 26, "%") ;
      /* Using cursor P09QP3 */
      pr_default.execute(1, new Object[] {AV55Emprcod, AV56Prdnum, Short.valueOf(AV62Entradaproductoalmacen_wcds_1_tflinent), Short.valueOf(AV63Entradaproductoalmacen_wcds_2_tflinent_to), AV64Entradaproductoalmacen_wcds_3_tfentfecent, lV65Entradaproductoalmacen_wcds_4_tfalbaran, AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel, lV67Entradaproductoalmacen_wcds_6_tfentnalbar, AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel, Integer.valueOf(AV69Entradaproductoalmacen_wcds_8_tfpedcod), Integer.valueOf(AV70Entradaproductoalmacen_wcds_9_tfpedcod_to), Byte.valueOf(AV71Entradaproductoalmacen_wcds_10_tfentnemb), Byte.valueOf(AV72Entradaproductoalmacen_wcds_11_tfentnemb_to), Integer.valueOf(AV73Entradaproductoalmacen_wcds_12_tfentprvnum), Integer.valueOf(AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to), AV75Entradaproductoalmacen_wcds_14_tfentunient, AV76Entradaproductoalmacen_wcds_15_tfentunient_to, AV77Entradaproductoalmacen_wcds_16_tfentpre, AV78Entradaproductoalmacen_wcds_17_tfentpre_to, AV79Entradaproductoalmacen_wcds_18_tfentunirem, AV80Entradaproductoalmacen_wcds_19_tfentunirem_to, lV81Entradaproductoalmacen_wcds_20_tfentlotn, AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel, AV83Entradaproductoalmacen_wcds_22_tfentfval});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9QP4 = false ;
         A396EmprCod = P09QP3_A396EmprCod[0] ;
         A719PrdNum = P09QP3_A719PrdNum[0] ;
         A411EntCon = P09QP3_A411EntCon[0] ;
         A12857EntNAlbar = P09QP3_A12857EntNAlbar[0] ;
         A5685EntFVal = P09QP3_A5685EntFVal[0] ;
         A5686EntLotN = P09QP3_A5686EntLotN[0] ;
         A419EntUniRem = P09QP3_A419EntUniRem[0] ;
         A417EntPre = P09QP3_A417EntPre[0] ;
         A418EntUniEnt = P09QP3_A418EntUniEnt[0] ;
         A6156EntPrvNum = P09QP3_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P09QP3_n6156EntPrvNum[0] ;
         A14035EntNEmb = P09QP3_A14035EntNEmb[0] ;
         A658PedCod = P09QP3_A658PedCod[0] ;
         n658PedCod = P09QP3_n658PedCod[0] ;
         A11Albaran = P09QP3_A11Albaran[0] ;
         A415EntFecEnt = P09QP3_A415EntFecEnt[0] ;
         A597LinEnt = P09QP3_A597LinEnt[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09QP3_A12857EntNAlbar[0], A12857EntNAlbar) == 0 ) )
         {
            brk9QP4 = false ;
            A396EmprCod = P09QP3_A396EmprCod[0] ;
            A719PrdNum = P09QP3_A719PrdNum[0] ;
            A597LinEnt = P09QP3_A597LinEnt[0] ;
            AV42count = (long)(AV42count+1) ;
            brk9QP4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A12857EntNAlbar)==0) )
         {
            AV37Option = A12857EntNAlbar ;
            AV38Options.add(AV37Option, 0);
            AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV38Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9QP4 )
         {
            brk9QP4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADENTLOTNOPTIONS' Routine */
      returnInSub = false ;
      AV32TFEntLotN = AV49SearchTxt ;
      AV33TFEntLotN_Sel = "" ;
      AV62Entradaproductoalmacen_wcds_1_tflinent = AV10TFLinEnt ;
      AV63Entradaproductoalmacen_wcds_2_tflinent_to = AV11TFLinEnt_To ;
      AV64Entradaproductoalmacen_wcds_3_tfentfecent = AV12TFEntFecEnt ;
      AV65Entradaproductoalmacen_wcds_4_tfalbaran = AV14TFAlbaran ;
      AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel = AV15TFAlbaran_Sel ;
      AV67Entradaproductoalmacen_wcds_6_tfentnalbar = AV16TFEntNAlbar ;
      AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel = AV17TFEntNAlbar_Sel ;
      AV69Entradaproductoalmacen_wcds_8_tfpedcod = AV18TFPedCod ;
      AV70Entradaproductoalmacen_wcds_9_tfpedcod_to = AV19TFPedCod_To ;
      AV71Entradaproductoalmacen_wcds_10_tfentnemb = AV20TFEntNEmb ;
      AV72Entradaproductoalmacen_wcds_11_tfentnemb_to = AV21TFEntNEmb_To ;
      AV73Entradaproductoalmacen_wcds_12_tfentprvnum = AV22TFEntPrvNum ;
      AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to = AV23TFEntPrvNum_To ;
      AV75Entradaproductoalmacen_wcds_14_tfentunient = AV24TFEntUniEnt ;
      AV76Entradaproductoalmacen_wcds_15_tfentunient_to = AV25TFEntUniEnt_To ;
      AV77Entradaproductoalmacen_wcds_16_tfentpre = AV28TFEntPre ;
      AV78Entradaproductoalmacen_wcds_17_tfentpre_to = AV29TFEntPre_To ;
      AV79Entradaproductoalmacen_wcds_18_tfentunirem = AV30TFEntUniRem ;
      AV80Entradaproductoalmacen_wcds_19_tfentunirem_to = AV31TFEntUniRem_To ;
      AV81Entradaproductoalmacen_wcds_20_tfentlotn = AV32TFEntLotN ;
      AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel = AV33TFEntLotN_Sel ;
      AV83Entradaproductoalmacen_wcds_22_tfentfval = AV34TFEntFVal ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV62Entradaproductoalmacen_wcds_1_tflinent) ,
                                           Short.valueOf(AV63Entradaproductoalmacen_wcds_2_tflinent_to) ,
                                           AV64Entradaproductoalmacen_wcds_3_tfentfecent ,
                                           AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel ,
                                           AV65Entradaproductoalmacen_wcds_4_tfalbaran ,
                                           AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel ,
                                           AV67Entradaproductoalmacen_wcds_6_tfentnalbar ,
                                           Integer.valueOf(AV69Entradaproductoalmacen_wcds_8_tfpedcod) ,
                                           Integer.valueOf(AV70Entradaproductoalmacen_wcds_9_tfpedcod_to) ,
                                           Byte.valueOf(AV71Entradaproductoalmacen_wcds_10_tfentnemb) ,
                                           Byte.valueOf(AV72Entradaproductoalmacen_wcds_11_tfentnemb_to) ,
                                           Integer.valueOf(AV73Entradaproductoalmacen_wcds_12_tfentprvnum) ,
                                           Integer.valueOf(AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to) ,
                                           AV75Entradaproductoalmacen_wcds_14_tfentunient ,
                                           AV76Entradaproductoalmacen_wcds_15_tfentunient_to ,
                                           AV77Entradaproductoalmacen_wcds_16_tfentpre ,
                                           AV78Entradaproductoalmacen_wcds_17_tfentpre_to ,
                                           AV79Entradaproductoalmacen_wcds_18_tfentunirem ,
                                           AV80Entradaproductoalmacen_wcds_19_tfentunirem_to ,
                                           AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel ,
                                           AV81Entradaproductoalmacen_wcds_20_tfentlotn ,
                                           AV83Entradaproductoalmacen_wcds_22_tfentfval ,
                                           Short.valueOf(A597LinEnt) ,
                                           A415EntFecEnt ,
                                           A11Albaran ,
                                           A12857EntNAlbar ,
                                           Integer.valueOf(A658PedCod) ,
                                           Byte.valueOf(A14035EntNEmb) ,
                                           Integer.valueOf(A6156EntPrvNum) ,
                                           A418EntUniEnt ,
                                           A417EntPre ,
                                           A419EntUniRem ,
                                           A5686EntLotN ,
                                           A5685EntFVal ,
                                           A396EmprCod ,
                                           AV55Emprcod ,
                                           A719PrdNum ,
                                           AV56Prdnum ,
                                           Byte.valueOf(A411EntCon) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE
                                           }
      });
      lV65Entradaproductoalmacen_wcds_4_tfalbaran = GXutil.padr( GXutil.rtrim( AV65Entradaproductoalmacen_wcds_4_tfalbaran), 10, "%") ;
      lV67Entradaproductoalmacen_wcds_6_tfentnalbar = GXutil.padr( GXutil.rtrim( AV67Entradaproductoalmacen_wcds_6_tfentnalbar), 20, "%") ;
      lV81Entradaproductoalmacen_wcds_20_tfentlotn = GXutil.padr( GXutil.rtrim( AV81Entradaproductoalmacen_wcds_20_tfentlotn), 26, "%") ;
      /* Using cursor P09QP4 */
      pr_default.execute(2, new Object[] {AV55Emprcod, AV56Prdnum, Short.valueOf(AV62Entradaproductoalmacen_wcds_1_tflinent), Short.valueOf(AV63Entradaproductoalmacen_wcds_2_tflinent_to), AV64Entradaproductoalmacen_wcds_3_tfentfecent, lV65Entradaproductoalmacen_wcds_4_tfalbaran, AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel, lV67Entradaproductoalmacen_wcds_6_tfentnalbar, AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel, Integer.valueOf(AV69Entradaproductoalmacen_wcds_8_tfpedcod), Integer.valueOf(AV70Entradaproductoalmacen_wcds_9_tfpedcod_to), Byte.valueOf(AV71Entradaproductoalmacen_wcds_10_tfentnemb), Byte.valueOf(AV72Entradaproductoalmacen_wcds_11_tfentnemb_to), Integer.valueOf(AV73Entradaproductoalmacen_wcds_12_tfentprvnum), Integer.valueOf(AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to), AV75Entradaproductoalmacen_wcds_14_tfentunient, AV76Entradaproductoalmacen_wcds_15_tfentunient_to, AV77Entradaproductoalmacen_wcds_16_tfentpre, AV78Entradaproductoalmacen_wcds_17_tfentpre_to, AV79Entradaproductoalmacen_wcds_18_tfentunirem, AV80Entradaproductoalmacen_wcds_19_tfentunirem_to, lV81Entradaproductoalmacen_wcds_20_tfentlotn, AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel, AV83Entradaproductoalmacen_wcds_22_tfentfval});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9QP6 = false ;
         A396EmprCod = P09QP4_A396EmprCod[0] ;
         A719PrdNum = P09QP4_A719PrdNum[0] ;
         A411EntCon = P09QP4_A411EntCon[0] ;
         A5686EntLotN = P09QP4_A5686EntLotN[0] ;
         A5685EntFVal = P09QP4_A5685EntFVal[0] ;
         A419EntUniRem = P09QP4_A419EntUniRem[0] ;
         A417EntPre = P09QP4_A417EntPre[0] ;
         A418EntUniEnt = P09QP4_A418EntUniEnt[0] ;
         A6156EntPrvNum = P09QP4_A6156EntPrvNum[0] ;
         n6156EntPrvNum = P09QP4_n6156EntPrvNum[0] ;
         A14035EntNEmb = P09QP4_A14035EntNEmb[0] ;
         A658PedCod = P09QP4_A658PedCod[0] ;
         n658PedCod = P09QP4_n658PedCod[0] ;
         A12857EntNAlbar = P09QP4_A12857EntNAlbar[0] ;
         A11Albaran = P09QP4_A11Albaran[0] ;
         A415EntFecEnt = P09QP4_A415EntFecEnt[0] ;
         A597LinEnt = P09QP4_A597LinEnt[0] ;
         AV42count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09QP4_A5686EntLotN[0], A5686EntLotN) == 0 ) )
         {
            brk9QP6 = false ;
            A396EmprCod = P09QP4_A396EmprCod[0] ;
            A719PrdNum = P09QP4_A719PrdNum[0] ;
            A597LinEnt = P09QP4_A597LinEnt[0] ;
            AV42count = (long)(AV42count+1) ;
            brk9QP6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5686EntLotN)==0) )
         {
            AV37Option = A5686EntLotN ;
            AV38Options.add(AV37Option, 0);
            AV41OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV42count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV38Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9QP6 )
         {
            brk9QP6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = entradaproductoalmacen_wcgetfilterdata.this.AV51OptionsJson;
      this.aP4[0] = entradaproductoalmacen_wcgetfilterdata.this.AV52OptionsDescJson;
      this.aP5[0] = entradaproductoalmacen_wcgetfilterdata.this.AV53OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV51OptionsJson = "" ;
      AV52OptionsDescJson = "" ;
      AV53OptionIndexesJson = "" ;
      AV38Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV41OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43Session = httpContext.getWebSession();
      AV45GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFEntFecEnt = GXutil.nullDate() ;
      AV14TFAlbaran = "" ;
      AV15TFAlbaran_Sel = "" ;
      AV16TFEntNAlbar = "" ;
      AV17TFEntNAlbar_Sel = "" ;
      AV24TFEntUniEnt = DecimalUtil.ZERO ;
      AV25TFEntUniEnt_To = DecimalUtil.ZERO ;
      AV28TFEntPre = DecimalUtil.ZERO ;
      AV29TFEntPre_To = DecimalUtil.ZERO ;
      AV30TFEntUniRem = DecimalUtil.ZERO ;
      AV31TFEntUniRem_To = DecimalUtil.ZERO ;
      AV32TFEntLotN = "" ;
      AV33TFEntLotN_Sel = "" ;
      AV34TFEntFVal = GXutil.nullDate() ;
      AV55Emprcod = "" ;
      AV56Prdnum = "" ;
      AV57PrdNom = "" ;
      A11Albaran = "" ;
      AV64Entradaproductoalmacen_wcds_3_tfentfecent = GXutil.nullDate() ;
      AV65Entradaproductoalmacen_wcds_4_tfalbaran = "" ;
      AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel = "" ;
      AV67Entradaproductoalmacen_wcds_6_tfentnalbar = "" ;
      AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel = "" ;
      AV75Entradaproductoalmacen_wcds_14_tfentunient = DecimalUtil.ZERO ;
      AV76Entradaproductoalmacen_wcds_15_tfentunient_to = DecimalUtil.ZERO ;
      AV77Entradaproductoalmacen_wcds_16_tfentpre = DecimalUtil.ZERO ;
      AV78Entradaproductoalmacen_wcds_17_tfentpre_to = DecimalUtil.ZERO ;
      AV79Entradaproductoalmacen_wcds_18_tfentunirem = DecimalUtil.ZERO ;
      AV80Entradaproductoalmacen_wcds_19_tfentunirem_to = DecimalUtil.ZERO ;
      AV81Entradaproductoalmacen_wcds_20_tfentlotn = "" ;
      AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel = "" ;
      AV83Entradaproductoalmacen_wcds_22_tfentfval = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV65Entradaproductoalmacen_wcds_4_tfalbaran = "" ;
      lV67Entradaproductoalmacen_wcds_6_tfentnalbar = "" ;
      lV81Entradaproductoalmacen_wcds_20_tfentlotn = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      A12857EntNAlbar = "" ;
      A418EntUniEnt = DecimalUtil.ZERO ;
      A417EntPre = DecimalUtil.ZERO ;
      A419EntUniRem = DecimalUtil.ZERO ;
      A5686EntLotN = "" ;
      A5685EntFVal = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      P09QP2_A396EmprCod = new String[] {""} ;
      P09QP2_A719PrdNum = new String[] {""} ;
      P09QP2_A411EntCon = new byte[1] ;
      P09QP2_A11Albaran = new String[] {""} ;
      P09QP2_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      P09QP2_A5686EntLotN = new String[] {""} ;
      P09QP2_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QP2_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QP2_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QP2_A6156EntPrvNum = new int[1] ;
      P09QP2_n6156EntPrvNum = new boolean[] {false} ;
      P09QP2_A14035EntNEmb = new byte[1] ;
      P09QP2_A658PedCod = new int[1] ;
      P09QP2_n658PedCod = new boolean[] {false} ;
      P09QP2_A12857EntNAlbar = new String[] {""} ;
      P09QP2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09QP2_A597LinEnt = new short[1] ;
      AV37Option = "" ;
      P09QP3_A396EmprCod = new String[] {""} ;
      P09QP3_A719PrdNum = new String[] {""} ;
      P09QP3_A411EntCon = new byte[1] ;
      P09QP3_A12857EntNAlbar = new String[] {""} ;
      P09QP3_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      P09QP3_A5686EntLotN = new String[] {""} ;
      P09QP3_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QP3_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QP3_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QP3_A6156EntPrvNum = new int[1] ;
      P09QP3_n6156EntPrvNum = new boolean[] {false} ;
      P09QP3_A14035EntNEmb = new byte[1] ;
      P09QP3_A658PedCod = new int[1] ;
      P09QP3_n658PedCod = new boolean[] {false} ;
      P09QP3_A11Albaran = new String[] {""} ;
      P09QP3_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09QP3_A597LinEnt = new short[1] ;
      P09QP4_A396EmprCod = new String[] {""} ;
      P09QP4_A719PrdNum = new String[] {""} ;
      P09QP4_A411EntCon = new byte[1] ;
      P09QP4_A5686EntLotN = new String[] {""} ;
      P09QP4_A5685EntFVal = new java.util.Date[] {GXutil.nullDate()} ;
      P09QP4_A419EntUniRem = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QP4_A417EntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QP4_A418EntUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09QP4_A6156EntPrvNum = new int[1] ;
      P09QP4_n6156EntPrvNum = new boolean[] {false} ;
      P09QP4_A14035EntNEmb = new byte[1] ;
      P09QP4_A658PedCod = new int[1] ;
      P09QP4_n658PedCod = new boolean[] {false} ;
      P09QP4_A12857EntNAlbar = new String[] {""} ;
      P09QP4_A11Albaran = new String[] {""} ;
      P09QP4_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09QP4_A597LinEnt = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradaproductoalmacen_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09QP2_A396EmprCod, P09QP2_A719PrdNum, P09QP2_A411EntCon, P09QP2_A11Albaran, P09QP2_A5685EntFVal, P09QP2_A5686EntLotN, P09QP2_A419EntUniRem, P09QP2_A417EntPre, P09QP2_A418EntUniEnt, P09QP2_A6156EntPrvNum,
            P09QP2_n6156EntPrvNum, P09QP2_A14035EntNEmb, P09QP2_A658PedCod, P09QP2_n658PedCod, P09QP2_A12857EntNAlbar, P09QP2_A415EntFecEnt, P09QP2_A597LinEnt
            }
            , new Object[] {
            P09QP3_A396EmprCod, P09QP3_A719PrdNum, P09QP3_A411EntCon, P09QP3_A12857EntNAlbar, P09QP3_A5685EntFVal, P09QP3_A5686EntLotN, P09QP3_A419EntUniRem, P09QP3_A417EntPre, P09QP3_A418EntUniEnt, P09QP3_A6156EntPrvNum,
            P09QP3_n6156EntPrvNum, P09QP3_A14035EntNEmb, P09QP3_A658PedCod, P09QP3_n658PedCod, P09QP3_A11Albaran, P09QP3_A415EntFecEnt, P09QP3_A597LinEnt
            }
            , new Object[] {
            P09QP4_A396EmprCod, P09QP4_A719PrdNum, P09QP4_A411EntCon, P09QP4_A5686EntLotN, P09QP4_A5685EntFVal, P09QP4_A419EntUniRem, P09QP4_A417EntPre, P09QP4_A418EntUniEnt, P09QP4_A6156EntPrvNum, P09QP4_n6156EntPrvNum,
            P09QP4_A14035EntNEmb, P09QP4_A658PedCod, P09QP4_n658PedCod, P09QP4_A12857EntNAlbar, P09QP4_A11Albaran, P09QP4_A415EntFecEnt, P09QP4_A597LinEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20TFEntNEmb ;
   private byte AV21TFEntNEmb_To ;
   private byte AV71Entradaproductoalmacen_wcds_10_tfentnemb ;
   private byte AV72Entradaproductoalmacen_wcds_11_tfentnemb_to ;
   private byte A14035EntNEmb ;
   private byte A411EntCon ;
   private short AV10TFLinEnt ;
   private short AV11TFLinEnt_To ;
   private short AV62Entradaproductoalmacen_wcds_1_tflinent ;
   private short AV63Entradaproductoalmacen_wcds_2_tflinent_to ;
   private short A597LinEnt ;
   private short Gx_err ;
   private int AV60GXV1 ;
   private int AV18TFPedCod ;
   private int AV19TFPedCod_To ;
   private int AV22TFEntPrvNum ;
   private int AV23TFEntPrvNum_To ;
   private int AV69Entradaproductoalmacen_wcds_8_tfpedcod ;
   private int AV70Entradaproductoalmacen_wcds_9_tfpedcod_to ;
   private int AV73Entradaproductoalmacen_wcds_12_tfentprvnum ;
   private int AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to ;
   private int A658PedCod ;
   private int A6156EntPrvNum ;
   private long AV42count ;
   private java.math.BigDecimal AV24TFEntUniEnt ;
   private java.math.BigDecimal AV25TFEntUniEnt_To ;
   private java.math.BigDecimal AV28TFEntPre ;
   private java.math.BigDecimal AV29TFEntPre_To ;
   private java.math.BigDecimal AV30TFEntUniRem ;
   private java.math.BigDecimal AV31TFEntUniRem_To ;
   private java.math.BigDecimal AV75Entradaproductoalmacen_wcds_14_tfentunient ;
   private java.math.BigDecimal AV76Entradaproductoalmacen_wcds_15_tfentunient_to ;
   private java.math.BigDecimal AV77Entradaproductoalmacen_wcds_16_tfentpre ;
   private java.math.BigDecimal AV78Entradaproductoalmacen_wcds_17_tfentpre_to ;
   private java.math.BigDecimal AV79Entradaproductoalmacen_wcds_18_tfentunirem ;
   private java.math.BigDecimal AV80Entradaproductoalmacen_wcds_19_tfentunirem_to ;
   private java.math.BigDecimal A418EntUniEnt ;
   private java.math.BigDecimal A417EntPre ;
   private java.math.BigDecimal A419EntUniRem ;
   private String AV14TFAlbaran ;
   private String AV15TFAlbaran_Sel ;
   private String AV16TFEntNAlbar ;
   private String AV17TFEntNAlbar_Sel ;
   private String AV32TFEntLotN ;
   private String AV33TFEntLotN_Sel ;
   private String AV55Emprcod ;
   private String AV56Prdnum ;
   private String AV57PrdNom ;
   private String A11Albaran ;
   private String AV65Entradaproductoalmacen_wcds_4_tfalbaran ;
   private String AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel ;
   private String AV67Entradaproductoalmacen_wcds_6_tfentnalbar ;
   private String AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel ;
   private String AV81Entradaproductoalmacen_wcds_20_tfentlotn ;
   private String AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel ;
   private String scmdbuf ;
   private String lV65Entradaproductoalmacen_wcds_4_tfalbaran ;
   private String lV67Entradaproductoalmacen_wcds_6_tfentnalbar ;
   private String lV81Entradaproductoalmacen_wcds_20_tfentlotn ;
   private String A12857EntNAlbar ;
   private String A5686EntLotN ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private java.util.Date AV12TFEntFecEnt ;
   private java.util.Date AV34TFEntFVal ;
   private java.util.Date AV64Entradaproductoalmacen_wcds_3_tfentfecent ;
   private java.util.Date AV83Entradaproductoalmacen_wcds_22_tfentfval ;
   private java.util.Date A415EntFecEnt ;
   private java.util.Date A5685EntFVal ;
   private boolean returnInSub ;
   private boolean brk9QP2 ;
   private boolean n6156EntPrvNum ;
   private boolean n658PedCod ;
   private boolean brk9QP4 ;
   private boolean brk9QP6 ;
   private String AV51OptionsJson ;
   private String AV52OptionsDescJson ;
   private String AV53OptionIndexesJson ;
   private String AV48DDOName ;
   private String AV49SearchTxt ;
   private String AV50SearchTxtTo ;
   private String AV37Option ;
   private com.genexus.webpanels.WebSession AV43Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09QP2_A396EmprCod ;
   private String[] P09QP2_A719PrdNum ;
   private byte[] P09QP2_A411EntCon ;
   private String[] P09QP2_A11Albaran ;
   private java.util.Date[] P09QP2_A5685EntFVal ;
   private String[] P09QP2_A5686EntLotN ;
   private java.math.BigDecimal[] P09QP2_A419EntUniRem ;
   private java.math.BigDecimal[] P09QP2_A417EntPre ;
   private java.math.BigDecimal[] P09QP2_A418EntUniEnt ;
   private int[] P09QP2_A6156EntPrvNum ;
   private boolean[] P09QP2_n6156EntPrvNum ;
   private byte[] P09QP2_A14035EntNEmb ;
   private int[] P09QP2_A658PedCod ;
   private boolean[] P09QP2_n658PedCod ;
   private String[] P09QP2_A12857EntNAlbar ;
   private java.util.Date[] P09QP2_A415EntFecEnt ;
   private short[] P09QP2_A597LinEnt ;
   private String[] P09QP3_A396EmprCod ;
   private String[] P09QP3_A719PrdNum ;
   private byte[] P09QP3_A411EntCon ;
   private String[] P09QP3_A12857EntNAlbar ;
   private java.util.Date[] P09QP3_A5685EntFVal ;
   private String[] P09QP3_A5686EntLotN ;
   private java.math.BigDecimal[] P09QP3_A419EntUniRem ;
   private java.math.BigDecimal[] P09QP3_A417EntPre ;
   private java.math.BigDecimal[] P09QP3_A418EntUniEnt ;
   private int[] P09QP3_A6156EntPrvNum ;
   private boolean[] P09QP3_n6156EntPrvNum ;
   private byte[] P09QP3_A14035EntNEmb ;
   private int[] P09QP3_A658PedCod ;
   private boolean[] P09QP3_n658PedCod ;
   private String[] P09QP3_A11Albaran ;
   private java.util.Date[] P09QP3_A415EntFecEnt ;
   private short[] P09QP3_A597LinEnt ;
   private String[] P09QP4_A396EmprCod ;
   private String[] P09QP4_A719PrdNum ;
   private byte[] P09QP4_A411EntCon ;
   private String[] P09QP4_A5686EntLotN ;
   private java.util.Date[] P09QP4_A5685EntFVal ;
   private java.math.BigDecimal[] P09QP4_A419EntUniRem ;
   private java.math.BigDecimal[] P09QP4_A417EntPre ;
   private java.math.BigDecimal[] P09QP4_A418EntUniEnt ;
   private int[] P09QP4_A6156EntPrvNum ;
   private boolean[] P09QP4_n6156EntPrvNum ;
   private byte[] P09QP4_A14035EntNEmb ;
   private int[] P09QP4_A658PedCod ;
   private boolean[] P09QP4_n658PedCod ;
   private String[] P09QP4_A12857EntNAlbar ;
   private String[] P09QP4_A11Albaran ;
   private java.util.Date[] P09QP4_A415EntFecEnt ;
   private short[] P09QP4_A597LinEnt ;
   private GXSimpleCollection<String> AV38Options ;
   private GXSimpleCollection<String> AV40OptionsDesc ;
   private GXSimpleCollection<String> AV41OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV45GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV46GridStateFilterValue ;
}

final  class entradaproductoalmacen_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09QP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Entradaproductoalmacen_wcds_1_tflinent ,
                                          short AV63Entradaproductoalmacen_wcds_2_tflinent_to ,
                                          java.util.Date AV64Entradaproductoalmacen_wcds_3_tfentfecent ,
                                          String AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel ,
                                          String AV65Entradaproductoalmacen_wcds_4_tfalbaran ,
                                          String AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel ,
                                          String AV67Entradaproductoalmacen_wcds_6_tfentnalbar ,
                                          int AV69Entradaproductoalmacen_wcds_8_tfpedcod ,
                                          int AV70Entradaproductoalmacen_wcds_9_tfpedcod_to ,
                                          byte AV71Entradaproductoalmacen_wcds_10_tfentnemb ,
                                          byte AV72Entradaproductoalmacen_wcds_11_tfentnemb_to ,
                                          int AV73Entradaproductoalmacen_wcds_12_tfentprvnum ,
                                          int AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to ,
                                          java.math.BigDecimal AV75Entradaproductoalmacen_wcds_14_tfentunient ,
                                          java.math.BigDecimal AV76Entradaproductoalmacen_wcds_15_tfentunient_to ,
                                          java.math.BigDecimal AV77Entradaproductoalmacen_wcds_16_tfentpre ,
                                          java.math.BigDecimal AV78Entradaproductoalmacen_wcds_17_tfentpre_to ,
                                          java.math.BigDecimal AV79Entradaproductoalmacen_wcds_18_tfentunirem ,
                                          java.math.BigDecimal AV80Entradaproductoalmacen_wcds_19_tfentunirem_to ,
                                          String AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel ,
                                          String AV81Entradaproductoalmacen_wcds_20_tfentlotn ,
                                          java.util.Date AV83Entradaproductoalmacen_wcds_22_tfentfval ,
                                          short A597LinEnt ,
                                          java.util.Date A415EntFecEnt ,
                                          String A11Albaran ,
                                          String A12857EntNAlbar ,
                                          int A658PedCod ,
                                          byte A14035EntNEmb ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          String A5686EntLotN ,
                                          java.util.Date A5685EntFVal ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          String A719PrdNum ,
                                          String AV56Prdnum ,
                                          byte A411EntCon )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, EntCon, Albaran, EntFVal, EntLotN, EntUniRem, EntPre, EntUniEnt, EntPrvNum, EntNEmb, PedCod, EntNAlbar, EntFecEnt, LinEnt FROM TXPENTALM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(EntCon = 0)");
      if ( ! (0==AV62Entradaproductoalmacen_wcds_1_tflinent) )
      {
         addWhere(sWhereString, "(LinEnt >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV63Entradaproductoalmacen_wcds_2_tflinent_to) )
      {
         addWhere(sWhereString, "(LinEnt <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Entradaproductoalmacen_wcds_3_tfentfecent)) )
      {
         addWhere(sWhereString, "(EntFecEnt >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel)==0) && ( ! (GXutil.strcmp("", AV65Entradaproductoalmacen_wcds_4_tfalbaran)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Albaran) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel)==0) )
      {
         addWhere(sWhereString, "(Albaran = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel)==0) && ( ! (GXutil.strcmp("", AV67Entradaproductoalmacen_wcds_6_tfentnalbar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntNAlbar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel)==0) )
      {
         addWhere(sWhereString, "(EntNAlbar = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV69Entradaproductoalmacen_wcds_8_tfpedcod) )
      {
         addWhere(sWhereString, "(PedCod >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV70Entradaproductoalmacen_wcds_9_tfpedcod_to) )
      {
         addWhere(sWhereString, "(PedCod <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV71Entradaproductoalmacen_wcds_10_tfentnemb) )
      {
         addWhere(sWhereString, "(EntNEmb >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Entradaproductoalmacen_wcds_11_tfentnemb_to) )
      {
         addWhere(sWhereString, "(EntNEmb <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Entradaproductoalmacen_wcds_12_tfentprvnum) )
      {
         addWhere(sWhereString, "(EntPrvNum >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(EntPrvNum <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Entradaproductoalmacen_wcds_14_tfentunient)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Entradaproductoalmacen_wcds_15_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Entradaproductoalmacen_wcds_16_tfentpre)==0) )
      {
         addWhere(sWhereString, "(EntPre >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Entradaproductoalmacen_wcds_17_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(EntPre <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Entradaproductoalmacen_wcds_18_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(EntUniRem >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Entradaproductoalmacen_wcds_19_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(EntUniRem <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV81Entradaproductoalmacen_wcds_20_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(EntLotN = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Entradaproductoalmacen_wcds_22_tfentfval)) )
      {
         addWhere(sWhereString, "(EntFVal >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY Albaran" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09QP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Entradaproductoalmacen_wcds_1_tflinent ,
                                          short AV63Entradaproductoalmacen_wcds_2_tflinent_to ,
                                          java.util.Date AV64Entradaproductoalmacen_wcds_3_tfentfecent ,
                                          String AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel ,
                                          String AV65Entradaproductoalmacen_wcds_4_tfalbaran ,
                                          String AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel ,
                                          String AV67Entradaproductoalmacen_wcds_6_tfentnalbar ,
                                          int AV69Entradaproductoalmacen_wcds_8_tfpedcod ,
                                          int AV70Entradaproductoalmacen_wcds_9_tfpedcod_to ,
                                          byte AV71Entradaproductoalmacen_wcds_10_tfentnemb ,
                                          byte AV72Entradaproductoalmacen_wcds_11_tfentnemb_to ,
                                          int AV73Entradaproductoalmacen_wcds_12_tfentprvnum ,
                                          int AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to ,
                                          java.math.BigDecimal AV75Entradaproductoalmacen_wcds_14_tfentunient ,
                                          java.math.BigDecimal AV76Entradaproductoalmacen_wcds_15_tfentunient_to ,
                                          java.math.BigDecimal AV77Entradaproductoalmacen_wcds_16_tfentpre ,
                                          java.math.BigDecimal AV78Entradaproductoalmacen_wcds_17_tfentpre_to ,
                                          java.math.BigDecimal AV79Entradaproductoalmacen_wcds_18_tfentunirem ,
                                          java.math.BigDecimal AV80Entradaproductoalmacen_wcds_19_tfentunirem_to ,
                                          String AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel ,
                                          String AV81Entradaproductoalmacen_wcds_20_tfentlotn ,
                                          java.util.Date AV83Entradaproductoalmacen_wcds_22_tfentfval ,
                                          short A597LinEnt ,
                                          java.util.Date A415EntFecEnt ,
                                          String A11Albaran ,
                                          String A12857EntNAlbar ,
                                          int A658PedCod ,
                                          byte A14035EntNEmb ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          String A5686EntLotN ,
                                          java.util.Date A5685EntFVal ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          String A719PrdNum ,
                                          String AV56Prdnum ,
                                          byte A411EntCon )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[24];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, EntCon, EntNAlbar, EntFVal, EntLotN, EntUniRem, EntPre, EntUniEnt, EntPrvNum, EntNEmb, PedCod, Albaran, EntFecEnt, LinEnt FROM TXPENTALM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(EntCon = 0)");
      if ( ! (0==AV62Entradaproductoalmacen_wcds_1_tflinent) )
      {
         addWhere(sWhereString, "(LinEnt >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV63Entradaproductoalmacen_wcds_2_tflinent_to) )
      {
         addWhere(sWhereString, "(LinEnt <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Entradaproductoalmacen_wcds_3_tfentfecent)) )
      {
         addWhere(sWhereString, "(EntFecEnt >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel)==0) && ( ! (GXutil.strcmp("", AV65Entradaproductoalmacen_wcds_4_tfalbaran)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Albaran) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel)==0) )
      {
         addWhere(sWhereString, "(Albaran = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel)==0) && ( ! (GXutil.strcmp("", AV67Entradaproductoalmacen_wcds_6_tfentnalbar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntNAlbar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel)==0) )
      {
         addWhere(sWhereString, "(EntNAlbar = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV69Entradaproductoalmacen_wcds_8_tfpedcod) )
      {
         addWhere(sWhereString, "(PedCod >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV70Entradaproductoalmacen_wcds_9_tfpedcod_to) )
      {
         addWhere(sWhereString, "(PedCod <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV71Entradaproductoalmacen_wcds_10_tfentnemb) )
      {
         addWhere(sWhereString, "(EntNEmb >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Entradaproductoalmacen_wcds_11_tfentnemb_to) )
      {
         addWhere(sWhereString, "(EntNEmb <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Entradaproductoalmacen_wcds_12_tfentprvnum) )
      {
         addWhere(sWhereString, "(EntPrvNum >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(EntPrvNum <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Entradaproductoalmacen_wcds_14_tfentunient)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Entradaproductoalmacen_wcds_15_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Entradaproductoalmacen_wcds_16_tfentpre)==0) )
      {
         addWhere(sWhereString, "(EntPre >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Entradaproductoalmacen_wcds_17_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(EntPre <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Entradaproductoalmacen_wcds_18_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(EntUniRem >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Entradaproductoalmacen_wcds_19_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(EntUniRem <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV81Entradaproductoalmacen_wcds_20_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(EntLotN = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Entradaproductoalmacen_wcds_22_tfentfval)) )
      {
         addWhere(sWhereString, "(EntFVal >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EntNAlbar" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09QP4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV62Entradaproductoalmacen_wcds_1_tflinent ,
                                          short AV63Entradaproductoalmacen_wcds_2_tflinent_to ,
                                          java.util.Date AV64Entradaproductoalmacen_wcds_3_tfentfecent ,
                                          String AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel ,
                                          String AV65Entradaproductoalmacen_wcds_4_tfalbaran ,
                                          String AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel ,
                                          String AV67Entradaproductoalmacen_wcds_6_tfentnalbar ,
                                          int AV69Entradaproductoalmacen_wcds_8_tfpedcod ,
                                          int AV70Entradaproductoalmacen_wcds_9_tfpedcod_to ,
                                          byte AV71Entradaproductoalmacen_wcds_10_tfentnemb ,
                                          byte AV72Entradaproductoalmacen_wcds_11_tfentnemb_to ,
                                          int AV73Entradaproductoalmacen_wcds_12_tfentprvnum ,
                                          int AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to ,
                                          java.math.BigDecimal AV75Entradaproductoalmacen_wcds_14_tfentunient ,
                                          java.math.BigDecimal AV76Entradaproductoalmacen_wcds_15_tfentunient_to ,
                                          java.math.BigDecimal AV77Entradaproductoalmacen_wcds_16_tfentpre ,
                                          java.math.BigDecimal AV78Entradaproductoalmacen_wcds_17_tfentpre_to ,
                                          java.math.BigDecimal AV79Entradaproductoalmacen_wcds_18_tfentunirem ,
                                          java.math.BigDecimal AV80Entradaproductoalmacen_wcds_19_tfentunirem_to ,
                                          String AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel ,
                                          String AV81Entradaproductoalmacen_wcds_20_tfentlotn ,
                                          java.util.Date AV83Entradaproductoalmacen_wcds_22_tfentfval ,
                                          short A597LinEnt ,
                                          java.util.Date A415EntFecEnt ,
                                          String A11Albaran ,
                                          String A12857EntNAlbar ,
                                          int A658PedCod ,
                                          byte A14035EntNEmb ,
                                          int A6156EntPrvNum ,
                                          java.math.BigDecimal A418EntUniEnt ,
                                          java.math.BigDecimal A417EntPre ,
                                          java.math.BigDecimal A419EntUniRem ,
                                          String A5686EntLotN ,
                                          java.util.Date A5685EntFVal ,
                                          String A396EmprCod ,
                                          String AV55Emprcod ,
                                          String A719PrdNum ,
                                          String AV56Prdnum ,
                                          byte A411EntCon )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, PrdNum, EntCon, EntLotN, EntFVal, EntUniRem, EntPre, EntUniEnt, EntPrvNum, EntNEmb, PedCod, EntNAlbar, Albaran, EntFecEnt, LinEnt FROM TXPENTALM" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      addWhere(sWhereString, "(EntCon = 0)");
      if ( ! (0==AV62Entradaproductoalmacen_wcds_1_tflinent) )
      {
         addWhere(sWhereString, "(LinEnt >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV63Entradaproductoalmacen_wcds_2_tflinent_to) )
      {
         addWhere(sWhereString, "(LinEnt <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Entradaproductoalmacen_wcds_3_tfentfecent)) )
      {
         addWhere(sWhereString, "(EntFecEnt >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel)==0) && ( ! (GXutil.strcmp("", AV65Entradaproductoalmacen_wcds_4_tfalbaran)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Albaran) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Entradaproductoalmacen_wcds_5_tfalbaran_sel)==0) )
      {
         addWhere(sWhereString, "(Albaran = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel)==0) && ( ! (GXutil.strcmp("", AV67Entradaproductoalmacen_wcds_6_tfentnalbar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntNAlbar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Entradaproductoalmacen_wcds_7_tfentnalbar_sel)==0) )
      {
         addWhere(sWhereString, "(EntNAlbar = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV69Entradaproductoalmacen_wcds_8_tfpedcod) )
      {
         addWhere(sWhereString, "(PedCod >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV70Entradaproductoalmacen_wcds_9_tfpedcod_to) )
      {
         addWhere(sWhereString, "(PedCod <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV71Entradaproductoalmacen_wcds_10_tfentnemb) )
      {
         addWhere(sWhereString, "(EntNEmb >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV72Entradaproductoalmacen_wcds_11_tfentnemb_to) )
      {
         addWhere(sWhereString, "(EntNEmb <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV73Entradaproductoalmacen_wcds_12_tfentprvnum) )
      {
         addWhere(sWhereString, "(EntPrvNum >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV74Entradaproductoalmacen_wcds_13_tfentprvnum_to) )
      {
         addWhere(sWhereString, "(EntPrvNum <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Entradaproductoalmacen_wcds_14_tfentunient)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Entradaproductoalmacen_wcds_15_tfentunient_to)==0) )
      {
         addWhere(sWhereString, "(EntUniEnt <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Entradaproductoalmacen_wcds_16_tfentpre)==0) )
      {
         addWhere(sWhereString, "(EntPre >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Entradaproductoalmacen_wcds_17_tfentpre_to)==0) )
      {
         addWhere(sWhereString, "(EntPre <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Entradaproductoalmacen_wcds_18_tfentunirem)==0) )
      {
         addWhere(sWhereString, "(EntUniRem >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Entradaproductoalmacen_wcds_19_tfentunirem_to)==0) )
      {
         addWhere(sWhereString, "(EntUniRem <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel)==0) && ( ! (GXutil.strcmp("", AV81Entradaproductoalmacen_wcds_20_tfentlotn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EntLotN) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Entradaproductoalmacen_wcds_21_tfentlotn_sel)==0) )
      {
         addWhere(sWhereString, "(EntLotN = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83Entradaproductoalmacen_wcds_22_tfentfval)) )
      {
         addWhere(sWhereString, "(EntFVal >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
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
                  return conditional_P09QP2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() );
            case 1 :
                  return conditional_P09QP3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() );
            case 2 :
                  return conditional_P09QP4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09QP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09QP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09QP4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 20);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
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
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 10);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
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
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 20);
               ((String[]) buf[14])[0] = rslt.getString(13, 10);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 10);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 10);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 10);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 4);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               return;
      }
   }

}

