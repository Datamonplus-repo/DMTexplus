package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class colorproductosvariables_wpgetfilterdata extends GXProcedure
{
   public colorproductosvariables_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorproductosvariables_wpgetfilterdata.class ), "" );
   }

   public colorproductosvariables_wpgetfilterdata( int remoteHandle ,
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
      colorproductosvariables_wpgetfilterdata.this.aP5 = new String[] {""};
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
      colorproductosvariables_wpgetfilterdata.this.AV36DDOName = aP0;
      colorproductosvariables_wpgetfilterdata.this.AV37SearchTxt = aP1;
      colorproductosvariables_wpgetfilterdata.this.AV38SearchTxtTo = aP2;
      colorproductosvariables_wpgetfilterdata.this.aP3 = aP3;
      colorproductosvariables_wpgetfilterdata.this.aP4 = aP4;
      colorproductosvariables_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_FORPRDDSC") == 0 )
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
      AV39OptionsJson = AV26Options.toJSonString(false) ;
      AV40OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV41OptionIndexesJson = AV29OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("FormulacionTinte.ColorProductosVariables_WPGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ColorProductosVariables_WPGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("FormulacionTinte.ColorProductosVariables_WPGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIN") == 0 )
         {
            AV10TFPrdLin = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPrdLin_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV14TFPrdNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV15TFPrdNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDCAN") == 0 )
         {
            AV16TFForPrdCan = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV17TFForPrdCan_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV18TFForPrdUMe = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFForPrdUMe_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV20TFForPrdDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV21TFForPrdDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDNOR") == 0 )
         {
            AV22TFForPrdNor = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFForPrdNor_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV37SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin = AV10TFPrdLin ;
      AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to = AV11TFPrdLin_To ;
      AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum = AV12TFPrdNum ;
      AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom = AV14TFPrdNom ;
      AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan = AV16TFForPrdCan ;
      AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to = AV17TFForPrdCan_To ;
      AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume = AV18TFForPrdUMe ;
      AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to = AV19TFForPrdUMe_To ;
      AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc = AV20TFForPrdDsc ;
      AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel = AV21TFForPrdDsc_Sel ;
      AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor = AV22TFForPrdNor ;
      AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to = AV23TFForPrdNor_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin) ,
                                           Short.valueOf(AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to) ,
                                           AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel ,
                                           AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum ,
                                           AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel ,
                                           AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom ,
                                           AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan ,
                                           AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to ,
                                           Byte.valueOf(AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to) ,
                                           AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel ,
                                           AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc ,
                                           Short.valueOf(AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor) ,
                                           Short.valueOf(AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to) ,
                                           Short.valueOf(A715PrdLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A487ForPrdCan ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A489ForPrdNor) ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           Integer.valueOf(AV43ForNumCol) ,
                                           AV42EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum), 6, "%") ;
      lV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom), 26, "%") ;
      lV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc), 5, "%") ;
      /* Using cursor P0AEL2 */
      pr_default.execute(0, new Object[] {AV42EmprCod, Integer.valueOf(AV43ForNumCol), Short.valueOf(AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin), Short.valueOf(AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to), lV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum, AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel, lV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom, AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel, AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan, AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to, Byte.valueOf(AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume), Byte.valueOf(AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to), lV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc, AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel, Short.valueOf(AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor), Short.valueOf(AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAEL2 = false ;
         A396EmprCod = P0AEL2_A396EmprCod[0] ;
         A719PrdNum = P0AEL2_A719PrdNum[0] ;
         A486ForNumCol = P0AEL2_A486ForNumCol[0] ;
         A489ForPrdNor = P0AEL2_A489ForPrdNor[0] ;
         A488ForPrdDsc = P0AEL2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AEL2_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AEL2_A490ForPrdUMe[0] ;
         A487ForPrdCan = P0AEL2_A487ForPrdCan[0] ;
         A718PrdNom = P0AEL2_A718PrdNom[0] ;
         A715PrdLin = P0AEL2_A715PrdLin[0] ;
         A718PrdNom = P0AEL2_A718PrdNom[0] ;
         A488ForPrdDsc = P0AEL2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AEL2_n488ForPrdDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AEL2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AEL2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brkAEL2 = false ;
            A486ForNumCol = P0AEL2_A486ForNumCol[0] ;
            A715PrdLin = P0AEL2_A715PrdLin[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAEL2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV25Option = A719PrdNum ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAEL2 )
         {
            brkAEL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNom = AV37SearchTxt ;
      AV15TFPrdNom_Sel = "" ;
      AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin = AV10TFPrdLin ;
      AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to = AV11TFPrdLin_To ;
      AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum = AV12TFPrdNum ;
      AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom = AV14TFPrdNom ;
      AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan = AV16TFForPrdCan ;
      AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to = AV17TFForPrdCan_To ;
      AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume = AV18TFForPrdUMe ;
      AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to = AV19TFForPrdUMe_To ;
      AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc = AV20TFForPrdDsc ;
      AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel = AV21TFForPrdDsc_Sel ;
      AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor = AV22TFForPrdNor ;
      AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to = AV23TFForPrdNor_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin) ,
                                           Short.valueOf(AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to) ,
                                           AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel ,
                                           AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum ,
                                           AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel ,
                                           AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom ,
                                           AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan ,
                                           AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to ,
                                           Byte.valueOf(AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to) ,
                                           AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel ,
                                           AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc ,
                                           Short.valueOf(AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor) ,
                                           Short.valueOf(AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to) ,
                                           Short.valueOf(A715PrdLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A487ForPrdCan ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A489ForPrdNor) ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           Integer.valueOf(AV43ForNumCol) ,
                                           AV42EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum), 6, "%") ;
      lV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom), 26, "%") ;
      lV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc), 5, "%") ;
      /* Using cursor P0AEL3 */
      pr_default.execute(1, new Object[] {AV42EmprCod, Integer.valueOf(AV43ForNumCol), Short.valueOf(AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin), Short.valueOf(AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to), lV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum, AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel, lV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom, AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel, AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan, AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to, Byte.valueOf(AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume), Byte.valueOf(AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to), lV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc, AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel, Short.valueOf(AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor), Short.valueOf(AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAEL4 = false ;
         A719PrdNum = P0AEL3_A719PrdNum[0] ;
         A396EmprCod = P0AEL3_A396EmprCod[0] ;
         A486ForNumCol = P0AEL3_A486ForNumCol[0] ;
         A489ForPrdNor = P0AEL3_A489ForPrdNor[0] ;
         A488ForPrdDsc = P0AEL3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AEL3_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AEL3_A490ForPrdUMe[0] ;
         A487ForPrdCan = P0AEL3_A487ForPrdCan[0] ;
         A718PrdNom = P0AEL3_A718PrdNom[0] ;
         A715PrdLin = P0AEL3_A715PrdLin[0] ;
         A718PrdNom = P0AEL3_A718PrdNom[0] ;
         A488ForPrdDsc = P0AEL3_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AEL3_n488ForPrdDsc[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AEL3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AEL3_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brkAEL4 = false ;
            A486ForNumCol = P0AEL3_A486ForNumCol[0] ;
            A715PrdLin = P0AEL3_A715PrdLin[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAEL4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV25Option = A718PrdNom ;
            AV24InsertIndex = 1 ;
            while ( ( AV24InsertIndex <= AV26Options.size() ) && ( GXutil.strcmp((String)AV26Options.elementAt(-1+AV24InsertIndex), AV25Option) < 0 ) )
            {
               AV24InsertIndex = (int)(AV24InsertIndex+1) ;
            }
            AV26Options.add(AV25Option, AV24InsertIndex);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV24InsertIndex);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAEL4 )
         {
            brkAEL4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV20TFForPrdDsc = AV37SearchTxt ;
      AV21TFForPrdDsc_Sel = "" ;
      AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin = AV10TFPrdLin ;
      AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to = AV11TFPrdLin_To ;
      AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum = AV12TFPrdNum ;
      AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom = AV14TFPrdNom ;
      AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan = AV16TFForPrdCan ;
      AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to = AV17TFForPrdCan_To ;
      AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume = AV18TFForPrdUMe ;
      AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to = AV19TFForPrdUMe_To ;
      AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc = AV20TFForPrdDsc ;
      AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel = AV21TFForPrdDsc_Sel ;
      AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor = AV22TFForPrdNor ;
      AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to = AV23TFForPrdNor_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin) ,
                                           Short.valueOf(AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to) ,
                                           AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel ,
                                           AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum ,
                                           AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel ,
                                           AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom ,
                                           AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan ,
                                           AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to ,
                                           Byte.valueOf(AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to) ,
                                           AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel ,
                                           AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc ,
                                           Short.valueOf(AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor) ,
                                           Short.valueOf(AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to) ,
                                           Short.valueOf(A715PrdLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A487ForPrdCan ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A489ForPrdNor) ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           Integer.valueOf(AV43ForNumCol) ,
                                           AV42EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum), 6, "%") ;
      lV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom), 26, "%") ;
      lV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc), 5, "%") ;
      /* Using cursor P0AEL4 */
      pr_default.execute(2, new Object[] {AV42EmprCod, Integer.valueOf(AV43ForNumCol), Short.valueOf(AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin), Short.valueOf(AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to), lV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum, AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel, lV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom, AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel, AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan, AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to, Byte.valueOf(AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume), Byte.valueOf(AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to), lV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc, AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel, Short.valueOf(AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor), Short.valueOf(AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAEL6 = false ;
         A490ForPrdUMe = P0AEL4_A490ForPrdUMe[0] ;
         A396EmprCod = P0AEL4_A396EmprCod[0] ;
         A486ForNumCol = P0AEL4_A486ForNumCol[0] ;
         A489ForPrdNor = P0AEL4_A489ForPrdNor[0] ;
         A488ForPrdDsc = P0AEL4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AEL4_n488ForPrdDsc[0] ;
         A487ForPrdCan = P0AEL4_A487ForPrdCan[0] ;
         A718PrdNom = P0AEL4_A718PrdNom[0] ;
         A719PrdNum = P0AEL4_A719PrdNum[0] ;
         A715PrdLin = P0AEL4_A715PrdLin[0] ;
         A488ForPrdDsc = P0AEL4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AEL4_n488ForPrdDsc[0] ;
         A718PrdNom = P0AEL4_A718PrdNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AEL4_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AEL4_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brkAEL6 = false ;
            A486ForNumCol = P0AEL4_A486ForNumCol[0] ;
            A715PrdLin = P0AEL4_A715PrdLin[0] ;
            AV30count = (long)(AV30count+1) ;
            brkAEL6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV25Option = A488ForPrdDsc ;
            AV24InsertIndex = 1 ;
            while ( ( AV24InsertIndex <= AV26Options.size() ) && ( GXutil.strcmp((String)AV26Options.elementAt(-1+AV24InsertIndex), AV25Option) < 0 ) )
            {
               AV24InsertIndex = (int)(AV24InsertIndex+1) ;
            }
            AV26Options.add(AV25Option, AV24InsertIndex);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV24InsertIndex);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAEL6 )
         {
            brkAEL6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = colorproductosvariables_wpgetfilterdata.this.AV39OptionsJson;
      this.aP4[0] = colorproductosvariables_wpgetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = colorproductosvariables_wpgetfilterdata.this.AV41OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV39OptionsJson = "" ;
      AV40OptionsDescJson = "" ;
      AV41OptionIndexesJson = "" ;
      AV26Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFPrdNom = "" ;
      AV15TFPrdNom_Sel = "" ;
      AV16TFForPrdCan = DecimalUtil.ZERO ;
      AV17TFForPrdCan_To = DecimalUtil.ZERO ;
      AV20TFForPrdDsc = "" ;
      AV21TFForPrdDsc_Sel = "" ;
      A719PrdNum = "" ;
      AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum = "" ;
      AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel = "" ;
      AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom = "" ;
      AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel = "" ;
      AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan = DecimalUtil.ZERO ;
      AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to = DecimalUtil.ZERO ;
      AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc = "" ;
      AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel = "" ;
      scmdbuf = "" ;
      lV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum = "" ;
      lV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom = "" ;
      lV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc = "" ;
      A718PrdNom = "" ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      AV42EmprCod = "" ;
      A396EmprCod = "" ;
      P0AEL2_A396EmprCod = new String[] {""} ;
      P0AEL2_A719PrdNum = new String[] {""} ;
      P0AEL2_A486ForNumCol = new int[1] ;
      P0AEL2_A489ForPrdNor = new short[1] ;
      P0AEL2_A488ForPrdDsc = new String[] {""} ;
      P0AEL2_n488ForPrdDsc = new boolean[] {false} ;
      P0AEL2_A490ForPrdUMe = new byte[1] ;
      P0AEL2_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AEL2_A718PrdNom = new String[] {""} ;
      P0AEL2_A715PrdLin = new short[1] ;
      AV25Option = "" ;
      P0AEL3_A719PrdNum = new String[] {""} ;
      P0AEL3_A396EmprCod = new String[] {""} ;
      P0AEL3_A486ForNumCol = new int[1] ;
      P0AEL3_A489ForPrdNor = new short[1] ;
      P0AEL3_A488ForPrdDsc = new String[] {""} ;
      P0AEL3_n488ForPrdDsc = new boolean[] {false} ;
      P0AEL3_A490ForPrdUMe = new byte[1] ;
      P0AEL3_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AEL3_A718PrdNom = new String[] {""} ;
      P0AEL3_A715PrdLin = new short[1] ;
      P0AEL4_A490ForPrdUMe = new byte[1] ;
      P0AEL4_A396EmprCod = new String[] {""} ;
      P0AEL4_A486ForNumCol = new int[1] ;
      P0AEL4_A489ForPrdNor = new short[1] ;
      P0AEL4_A488ForPrdDsc = new String[] {""} ;
      P0AEL4_n488ForPrdDsc = new boolean[] {false} ;
      P0AEL4_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AEL4_A718PrdNom = new String[] {""} ;
      P0AEL4_A719PrdNum = new String[] {""} ;
      P0AEL4_A715PrdLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductosvariables_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AEL2_A396EmprCod, P0AEL2_A719PrdNum, P0AEL2_A486ForNumCol, P0AEL2_A489ForPrdNor, P0AEL2_A488ForPrdDsc, P0AEL2_n488ForPrdDsc, P0AEL2_A490ForPrdUMe, P0AEL2_A487ForPrdCan, P0AEL2_A718PrdNom, P0AEL2_A715PrdLin
            }
            , new Object[] {
            P0AEL3_A719PrdNum, P0AEL3_A396EmprCod, P0AEL3_A486ForNumCol, P0AEL3_A489ForPrdNor, P0AEL3_A488ForPrdDsc, P0AEL3_n488ForPrdDsc, P0AEL3_A490ForPrdUMe, P0AEL3_A487ForPrdCan, P0AEL3_A718PrdNom, P0AEL3_A715PrdLin
            }
            , new Object[] {
            P0AEL4_A490ForPrdUMe, P0AEL4_A396EmprCod, P0AEL4_A486ForNumCol, P0AEL4_A489ForPrdNor, P0AEL4_A488ForPrdDsc, P0AEL4_n488ForPrdDsc, P0AEL4_A487ForPrdCan, P0AEL4_A718PrdNom, P0AEL4_A719PrdNum, P0AEL4_A715PrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TFForPrdUMe ;
   private byte AV19TFForPrdUMe_To ;
   private byte AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume ;
   private byte AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to ;
   private byte A490ForPrdUMe ;
   private short AV10TFPrdLin ;
   private short AV11TFPrdLin_To ;
   private short AV22TFForPrdNor ;
   private short AV23TFForPrdNor_To ;
   private short AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin ;
   private short AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to ;
   private short AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor ;
   private short AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to ;
   private short A715PrdLin ;
   private short A489ForPrdNor ;
   private short Gx_err ;
   private int AV46GXV1 ;
   private int A486ForNumCol ;
   private int AV43ForNumCol ;
   private int AV24InsertIndex ;
   private long AV30count ;
   private java.math.BigDecimal AV16TFForPrdCan ;
   private java.math.BigDecimal AV17TFForPrdCan_To ;
   private java.math.BigDecimal AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan ;
   private java.math.BigDecimal AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to ;
   private java.math.BigDecimal A487ForPrdCan ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFPrdNom ;
   private String AV15TFPrdNom_Sel ;
   private String AV20TFForPrdDsc ;
   private String AV21TFForPrdDsc_Sel ;
   private String A719PrdNum ;
   private String AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum ;
   private String AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel ;
   private String AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom ;
   private String AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel ;
   private String AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc ;
   private String AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel ;
   private String scmdbuf ;
   private String lV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum ;
   private String lV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom ;
   private String lV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String AV42EmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAEL2 ;
   private boolean n488ForPrdDsc ;
   private boolean brkAEL4 ;
   private boolean brkAEL6 ;
   private String AV39OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV25Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AEL2_A396EmprCod ;
   private String[] P0AEL2_A719PrdNum ;
   private int[] P0AEL2_A486ForNumCol ;
   private short[] P0AEL2_A489ForPrdNor ;
   private String[] P0AEL2_A488ForPrdDsc ;
   private boolean[] P0AEL2_n488ForPrdDsc ;
   private byte[] P0AEL2_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0AEL2_A487ForPrdCan ;
   private String[] P0AEL2_A718PrdNom ;
   private short[] P0AEL2_A715PrdLin ;
   private String[] P0AEL3_A719PrdNum ;
   private String[] P0AEL3_A396EmprCod ;
   private int[] P0AEL3_A486ForNumCol ;
   private short[] P0AEL3_A489ForPrdNor ;
   private String[] P0AEL3_A488ForPrdDsc ;
   private boolean[] P0AEL3_n488ForPrdDsc ;
   private byte[] P0AEL3_A490ForPrdUMe ;
   private java.math.BigDecimal[] P0AEL3_A487ForPrdCan ;
   private String[] P0AEL3_A718PrdNom ;
   private short[] P0AEL3_A715PrdLin ;
   private byte[] P0AEL4_A490ForPrdUMe ;
   private String[] P0AEL4_A396EmprCod ;
   private int[] P0AEL4_A486ForNumCol ;
   private short[] P0AEL4_A489ForPrdNor ;
   private String[] P0AEL4_A488ForPrdDsc ;
   private boolean[] P0AEL4_n488ForPrdDsc ;
   private java.math.BigDecimal[] P0AEL4_A487ForPrdCan ;
   private String[] P0AEL4_A718PrdNom ;
   private String[] P0AEL4_A719PrdNum ;
   private short[] P0AEL4_A715PrdLin ;
   private GXSimpleCollection<String> AV26Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class colorproductosvariables_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AEL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin ,
                                          short AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to ,
                                          String AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel ,
                                          String AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum ,
                                          String AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel ,
                                          String AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan ,
                                          java.math.BigDecimal AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to ,
                                          byte AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume ,
                                          byte AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to ,
                                          String AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel ,
                                          String AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc ,
                                          short AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor ,
                                          short AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to ,
                                          short A715PrdLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A487ForPrdCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short A489ForPrdNor ,
                                          int A486ForNumCol ,
                                          int AV43ForNumCol ,
                                          String AV42EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.ForNumCol, T1.ForPrdNor, T3.ForPrdDsc, T1.ForPrdUMe, T1.ForPrdCan, T2.PrdNom, T1.PrdLin FROM ((TXPLPRFOR T1 INNER JOIN TXPPRODUC" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForNumCol = ?)");
      if ( ! (0==AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin) )
      {
         addWhere(sWhereString, "(T1.PrdLin >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to) )
      {
         addWhere(sWhereString, "(T1.PrdLin <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AEL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin ,
                                          short AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to ,
                                          String AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel ,
                                          String AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum ,
                                          String AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel ,
                                          String AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan ,
                                          java.math.BigDecimal AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to ,
                                          byte AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume ,
                                          byte AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to ,
                                          String AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel ,
                                          String AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc ,
                                          short AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor ,
                                          short AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to ,
                                          short A715PrdLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A487ForPrdCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short A489ForPrdNor ,
                                          int A486ForNumCol ,
                                          int AV43ForNumCol ,
                                          String AV42EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[16];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.ForNumCol, T1.ForPrdNor, T3.ForPrdDsc, T1.ForPrdUMe, T1.ForPrdCan, T2.PrdNom, T1.PrdLin FROM ((TXPLPRFOR T1 INNER JOIN TXPPRODUC" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForNumCol = ?)");
      if ( ! (0==AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin) )
      {
         addWhere(sWhereString, "(T1.PrdLin >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to) )
      {
         addWhere(sWhereString, "(T1.PrdLin <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AEL4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin ,
                                          short AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to ,
                                          String AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel ,
                                          String AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum ,
                                          String AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel ,
                                          String AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan ,
                                          java.math.BigDecimal AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to ,
                                          byte AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume ,
                                          byte AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to ,
                                          String AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel ,
                                          String AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc ,
                                          short AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor ,
                                          short AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to ,
                                          short A715PrdLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A487ForPrdCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short A489ForPrdNor ,
                                          int A486ForNumCol ,
                                          int AV43ForNumCol ,
                                          String AV42EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[16];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ForNumCol, T1.ForPrdNor, T2.ForPrdDsc, T1.ForPrdCan, T3.PrdNom, T1.PrdNum, T1.PrdLin FROM ((TXPLPRFOR T1 INNER JOIN TXPUNMEPR" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ForNumCol = ?)");
      if ( ! (0==AV48Formulaciontinte_colorproductosvariables_wpds_1_tfprdlin) )
      {
         addWhere(sWhereString, "(T1.PrdLin >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV49Formulaciontinte_colorproductosvariables_wpds_2_tfprdlin_to) )
      {
         addWhere(sWhereString, "(T1.PrdLin <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV50Formulaciontinte_colorproductosvariables_wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Formulaciontinte_colorproductosvariables_wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV52Formulaciontinte_colorproductosvariables_wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_colorproductosvariables_wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Formulaciontinte_colorproductosvariables_wpds_7_tfforprdcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Formulaciontinte_colorproductosvariables_wpds_8_tfforprdcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV56Formulaciontinte_colorproductosvariables_wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV57Formulaciontinte_colorproductosvariables_wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_colorproductosvariables_wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_colorproductosvariables_wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_colorproductosvariables_wpds_13_tfforprdnor) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_colorproductosvariables_wpds_14_tfforprdnor_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForPrdUMe" ;
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
                  return conditional_P0AEL2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_P0AEL3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 2 :
                  return conditional_P0AEL4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AEL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AEL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AEL4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((short[]) buf[9])[0] = rslt.getShort(9);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               return;
      }
   }

}

