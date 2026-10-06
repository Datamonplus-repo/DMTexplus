package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class colorcolorantes_trnwwgetfilterdata extends GXProcedure
{
   public colorcolorantes_trnwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorcolorantes_trnwwgetfilterdata.class ), "" );
   }

   public colorcolorantes_trnwwgetfilterdata( int remoteHandle ,
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
      colorcolorantes_trnwwgetfilterdata.this.aP5 = new String[] {""};
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
      colorcolorantes_trnwwgetfilterdata.this.AV34DDOName = aP0;
      colorcolorantes_trnwwgetfilterdata.this.AV35SearchTxt = aP1;
      colorcolorantes_trnwwgetfilterdata.this.AV36SearchTxtTo = aP2;
      colorcolorantes_trnwwgetfilterdata.this.aP3 = aP3;
      colorcolorantes_trnwwgetfilterdata.this.aP4 = aP4;
      colorcolorantes_trnwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV34DDOName), "DDO_FORPRDDSC") == 0 )
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
      AV37OptionsJson = AV24Options.toJSonString(false) ;
      AV38OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV27OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("FormulacionTinte.ColorColorantes_TRNWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ColorColorantes_TRNWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FormulacionTinte.ColorColorantes_TRNWWGridState"), null, null);
      }
      AV42GXV1 = 1 ;
      while ( AV42GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV42GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLLIN") == 0 )
         {
            AV10TFColLin = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFColLin_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV14TFPrdNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV15TFPrdNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV16TFForPrdUMe = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFForPrdUMe_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV18TFForPrdDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV19TFForPrdDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCAN") == 0 )
         {
            AV20TFForCan = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFForCan_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV42GXV1 = (int)(AV42GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV35SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin = AV10TFColLin ;
      AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to = AV11TFColLin_To ;
      AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum = AV12TFPrdNum ;
      AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom = AV14TFPrdNom ;
      AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume = AV16TFForPrdUMe ;
      AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to = AV17TFForPrdUMe_To ;
      AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc = AV18TFForPrdDsc ;
      AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan = AV20TFForCan ;
      AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to = AV21TFForCan_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin) ,
                                           Short.valueOf(AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to) ,
                                           AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel ,
                                           AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum ,
                                           AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel ,
                                           AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom ,
                                           Byte.valueOf(AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume) ,
                                           Byte.valueOf(AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to) ,
                                           AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel ,
                                           AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc ,
                                           AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan ,
                                           AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to ,
                                           Short.valueOf(A309ColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A481ForCan } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL
                                           }
      });
      lV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum), 6, "%") ;
      lV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom), 26, "%") ;
      lV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc), 5, "%") ;
      /* Using cursor P0AE02 */
      pr_default.execute(0, new Object[] {Short.valueOf(AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin), Short.valueOf(AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to), lV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum, AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel, lV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom, AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel, Byte.valueOf(AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume), Byte.valueOf(AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to), lV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc, AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel, AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan, AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAE02 = false ;
         A396EmprCod = P0AE02_A396EmprCod[0] ;
         A719PrdNum = P0AE02_A719PrdNum[0] ;
         A481ForCan = P0AE02_A481ForCan[0] ;
         A488ForPrdDsc = P0AE02_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AE02_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AE02_A490ForPrdUMe[0] ;
         A718PrdNom = P0AE02_A718PrdNom[0] ;
         A309ColLin = P0AE02_A309ColLin[0] ;
         A486ForNumCol = P0AE02_A486ForNumCol[0] ;
         A718PrdNom = P0AE02_A718PrdNom[0] ;
         A488ForPrdDsc = P0AE02_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AE02_n488ForPrdDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AE02_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brkAE02 = false ;
            A396EmprCod = P0AE02_A396EmprCod[0] ;
            A309ColLin = P0AE02_A309ColLin[0] ;
            A486ForNumCol = P0AE02_A486ForNumCol[0] ;
            AV28count = (long)(AV28count+1) ;
            brkAE02 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV23Option = A719PrdNum ;
            AV24Options.add(AV23Option, 0);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAE02 )
         {
            brkAE02 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNom = AV35SearchTxt ;
      AV15TFPrdNom_Sel = "" ;
      AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin = AV10TFColLin ;
      AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to = AV11TFColLin_To ;
      AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum = AV12TFPrdNum ;
      AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom = AV14TFPrdNom ;
      AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume = AV16TFForPrdUMe ;
      AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to = AV17TFForPrdUMe_To ;
      AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc = AV18TFForPrdDsc ;
      AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan = AV20TFForCan ;
      AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to = AV21TFForCan_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin) ,
                                           Short.valueOf(AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to) ,
                                           AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel ,
                                           AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum ,
                                           AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel ,
                                           AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom ,
                                           Byte.valueOf(AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume) ,
                                           Byte.valueOf(AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to) ,
                                           AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel ,
                                           AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc ,
                                           AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan ,
                                           AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to ,
                                           Short.valueOf(A309ColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A481ForCan } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL
                                           }
      });
      lV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum), 6, "%") ;
      lV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom), 26, "%") ;
      lV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc), 5, "%") ;
      /* Using cursor P0AE03 */
      pr_default.execute(1, new Object[] {Short.valueOf(AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin), Short.valueOf(AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to), lV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum, AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel, lV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom, AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel, Byte.valueOf(AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume), Byte.valueOf(AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to), lV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc, AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel, AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan, AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkAE04 = false ;
         A719PrdNum = P0AE03_A719PrdNum[0] ;
         A396EmprCod = P0AE03_A396EmprCod[0] ;
         A481ForCan = P0AE03_A481ForCan[0] ;
         A488ForPrdDsc = P0AE03_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AE03_n488ForPrdDsc[0] ;
         A490ForPrdUMe = P0AE03_A490ForPrdUMe[0] ;
         A718PrdNom = P0AE03_A718PrdNom[0] ;
         A309ColLin = P0AE03_A309ColLin[0] ;
         A486ForNumCol = P0AE03_A486ForNumCol[0] ;
         A718PrdNom = P0AE03_A718PrdNom[0] ;
         A488ForPrdDsc = P0AE03_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AE03_n488ForPrdDsc[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0AE03_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0AE03_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brkAE04 = false ;
            A309ColLin = P0AE03_A309ColLin[0] ;
            A486ForNumCol = P0AE03_A486ForNumCol[0] ;
            AV28count = (long)(AV28count+1) ;
            brkAE04 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV23Option = A718PrdNom ;
            AV22InsertIndex = 1 ;
            while ( ( AV22InsertIndex <= AV24Options.size() ) && ( GXutil.strcmp((String)AV24Options.elementAt(-1+AV22InsertIndex), AV23Option) < 0 ) )
            {
               AV22InsertIndex = (int)(AV22InsertIndex+1) ;
            }
            AV24Options.add(AV23Option, AV22InsertIndex);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV22InsertIndex);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAE04 )
         {
            brkAE04 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFForPrdDsc = AV35SearchTxt ;
      AV19TFForPrdDsc_Sel = "" ;
      AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin = AV10TFColLin ;
      AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to = AV11TFColLin_To ;
      AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum = AV12TFPrdNum ;
      AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom = AV14TFPrdNom ;
      AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume = AV16TFForPrdUMe ;
      AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to = AV17TFForPrdUMe_To ;
      AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc = AV18TFForPrdDsc ;
      AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel = AV19TFForPrdDsc_Sel ;
      AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan = AV20TFForCan ;
      AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to = AV21TFForCan_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin) ,
                                           Short.valueOf(AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to) ,
                                           AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel ,
                                           AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum ,
                                           AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel ,
                                           AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom ,
                                           Byte.valueOf(AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume) ,
                                           Byte.valueOf(AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to) ,
                                           AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel ,
                                           AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc ,
                                           AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan ,
                                           AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to ,
                                           Short.valueOf(A309ColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           A481ForCan } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL
                                           }
      });
      lV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum), 6, "%") ;
      lV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom), 26, "%") ;
      lV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc = GXutil.padr( GXutil.rtrim( AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc), 5, "%") ;
      /* Using cursor P0AE04 */
      pr_default.execute(2, new Object[] {Short.valueOf(AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin), Short.valueOf(AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to), lV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum, AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel, lV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom, AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel, Byte.valueOf(AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume), Byte.valueOf(AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to), lV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc, AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel, AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan, AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAE06 = false ;
         A490ForPrdUMe = P0AE04_A490ForPrdUMe[0] ;
         A396EmprCod = P0AE04_A396EmprCod[0] ;
         A481ForCan = P0AE04_A481ForCan[0] ;
         A488ForPrdDsc = P0AE04_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AE04_n488ForPrdDsc[0] ;
         A718PrdNom = P0AE04_A718PrdNom[0] ;
         A719PrdNum = P0AE04_A719PrdNum[0] ;
         A309ColLin = P0AE04_A309ColLin[0] ;
         A486ForNumCol = P0AE04_A486ForNumCol[0] ;
         A488ForPrdDsc = P0AE04_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P0AE04_n488ForPrdDsc[0] ;
         A718PrdNom = P0AE04_A718PrdNom[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AE04_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AE04_A490ForPrdUMe[0] == A490ForPrdUMe ) )
         {
            brkAE06 = false ;
            A309ColLin = P0AE04_A309ColLin[0] ;
            A486ForNumCol = P0AE04_A486ForNumCol[0] ;
            AV28count = (long)(AV28count+1) ;
            brkAE06 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A488ForPrdDsc)==0) )
         {
            AV23Option = A488ForPrdDsc ;
            AV22InsertIndex = 1 ;
            while ( ( AV22InsertIndex <= AV24Options.size() ) && ( GXutil.strcmp((String)AV24Options.elementAt(-1+AV22InsertIndex), AV23Option) < 0 ) )
            {
               AV22InsertIndex = (int)(AV22InsertIndex+1) ;
            }
            AV24Options.add(AV23Option, AV22InsertIndex);
            AV27OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), AV22InsertIndex);
         }
         if ( AV24Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAE06 )
         {
            brkAE06 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = colorcolorantes_trnwwgetfilterdata.this.AV37OptionsJson;
      this.aP4[0] = colorcolorantes_trnwwgetfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = colorcolorantes_trnwwgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV37OptionsJson = "" ;
      AV38OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV24Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFPrdNom = "" ;
      AV15TFPrdNom_Sel = "" ;
      AV18TFForPrdDsc = "" ;
      AV19TFForPrdDsc_Sel = "" ;
      AV20TFForCan = DecimalUtil.ZERO ;
      AV21TFForCan_To = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum = "" ;
      AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel = "" ;
      AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom = "" ;
      AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel = "" ;
      AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc = "" ;
      AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel = "" ;
      AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan = DecimalUtil.ZERO ;
      AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum = "" ;
      lV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom = "" ;
      lV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc = "" ;
      A718PrdNom = "" ;
      A488ForPrdDsc = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      P0AE02_A396EmprCod = new String[] {""} ;
      P0AE02_A719PrdNum = new String[] {""} ;
      P0AE02_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AE02_A488ForPrdDsc = new String[] {""} ;
      P0AE02_n488ForPrdDsc = new boolean[] {false} ;
      P0AE02_A490ForPrdUMe = new byte[1] ;
      P0AE02_A718PrdNom = new String[] {""} ;
      P0AE02_A309ColLin = new short[1] ;
      P0AE02_A486ForNumCol = new int[1] ;
      A396EmprCod = "" ;
      AV23Option = "" ;
      P0AE03_A719PrdNum = new String[] {""} ;
      P0AE03_A396EmprCod = new String[] {""} ;
      P0AE03_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AE03_A488ForPrdDsc = new String[] {""} ;
      P0AE03_n488ForPrdDsc = new boolean[] {false} ;
      P0AE03_A490ForPrdUMe = new byte[1] ;
      P0AE03_A718PrdNom = new String[] {""} ;
      P0AE03_A309ColLin = new short[1] ;
      P0AE03_A486ForNumCol = new int[1] ;
      P0AE04_A490ForPrdUMe = new byte[1] ;
      P0AE04_A396EmprCod = new String[] {""} ;
      P0AE04_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AE04_A488ForPrdDsc = new String[] {""} ;
      P0AE04_n488ForPrdDsc = new boolean[] {false} ;
      P0AE04_A718PrdNom = new String[] {""} ;
      P0AE04_A719PrdNum = new String[] {""} ;
      P0AE04_A309ColLin = new short[1] ;
      P0AE04_A486ForNumCol = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorcolorantes_trnwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AE02_A396EmprCod, P0AE02_A719PrdNum, P0AE02_A481ForCan, P0AE02_A488ForPrdDsc, P0AE02_n488ForPrdDsc, P0AE02_A490ForPrdUMe, P0AE02_A718PrdNom, P0AE02_A309ColLin, P0AE02_A486ForNumCol
            }
            , new Object[] {
            P0AE03_A719PrdNum, P0AE03_A396EmprCod, P0AE03_A481ForCan, P0AE03_A488ForPrdDsc, P0AE03_n488ForPrdDsc, P0AE03_A490ForPrdUMe, P0AE03_A718PrdNom, P0AE03_A309ColLin, P0AE03_A486ForNumCol
            }
            , new Object[] {
            P0AE04_A490ForPrdUMe, P0AE04_A396EmprCod, P0AE04_A481ForCan, P0AE04_A488ForPrdDsc, P0AE04_n488ForPrdDsc, P0AE04_A718PrdNom, P0AE04_A719PrdNum, P0AE04_A309ColLin, P0AE04_A486ForNumCol
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TFForPrdUMe ;
   private byte AV17TFForPrdUMe_To ;
   private byte AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume ;
   private byte AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to ;
   private byte A490ForPrdUMe ;
   private short AV10TFColLin ;
   private short AV11TFColLin_To ;
   private short AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin ;
   private short AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to ;
   private short A309ColLin ;
   private short Gx_err ;
   private int AV42GXV1 ;
   private int A486ForNumCol ;
   private int AV22InsertIndex ;
   private long AV28count ;
   private java.math.BigDecimal AV20TFForCan ;
   private java.math.BigDecimal AV21TFForCan_To ;
   private java.math.BigDecimal AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan ;
   private java.math.BigDecimal AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to ;
   private java.math.BigDecimal A481ForCan ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFPrdNom ;
   private String AV15TFPrdNom_Sel ;
   private String AV18TFForPrdDsc ;
   private String AV19TFForPrdDsc_Sel ;
   private String A719PrdNum ;
   private String AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum ;
   private String AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel ;
   private String AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom ;
   private String AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel ;
   private String AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc ;
   private String AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel ;
   private String scmdbuf ;
   private String lV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum ;
   private String lV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom ;
   private String lV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc ;
   private String A718PrdNom ;
   private String A488ForPrdDsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAE02 ;
   private boolean n488ForPrdDsc ;
   private boolean brkAE04 ;
   private boolean brkAE06 ;
   private String AV37OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV34DDOName ;
   private String AV35SearchTxt ;
   private String AV36SearchTxtTo ;
   private String AV23Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AE02_A396EmprCod ;
   private String[] P0AE02_A719PrdNum ;
   private java.math.BigDecimal[] P0AE02_A481ForCan ;
   private String[] P0AE02_A488ForPrdDsc ;
   private boolean[] P0AE02_n488ForPrdDsc ;
   private byte[] P0AE02_A490ForPrdUMe ;
   private String[] P0AE02_A718PrdNom ;
   private short[] P0AE02_A309ColLin ;
   private int[] P0AE02_A486ForNumCol ;
   private String[] P0AE03_A719PrdNum ;
   private String[] P0AE03_A396EmprCod ;
   private java.math.BigDecimal[] P0AE03_A481ForCan ;
   private String[] P0AE03_A488ForPrdDsc ;
   private boolean[] P0AE03_n488ForPrdDsc ;
   private byte[] P0AE03_A490ForPrdUMe ;
   private String[] P0AE03_A718PrdNom ;
   private short[] P0AE03_A309ColLin ;
   private int[] P0AE03_A486ForNumCol ;
   private byte[] P0AE04_A490ForPrdUMe ;
   private String[] P0AE04_A396EmprCod ;
   private java.math.BigDecimal[] P0AE04_A481ForCan ;
   private String[] P0AE04_A488ForPrdDsc ;
   private boolean[] P0AE04_n488ForPrdDsc ;
   private String[] P0AE04_A718PrdNom ;
   private String[] P0AE04_A719PrdNum ;
   private short[] P0AE04_A309ColLin ;
   private int[] P0AE04_A486ForNumCol ;
   private GXSimpleCollection<String> AV24Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV27OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class colorcolorantes_trnwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AE02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin ,
                                          short AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to ,
                                          String AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel ,
                                          String AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum ,
                                          String AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel ,
                                          String AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom ,
                                          byte AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume ,
                                          byte AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to ,
                                          String AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel ,
                                          String AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc ,
                                          java.math.BigDecimal AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan ,
                                          java.math.BigDecimal AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to ,
                                          short A309ColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A481ForCan )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.ForCan, T3.ForPrdDsc, T1.ForPrdUMe, T2.PrdNom, T1.ColLin, T1.ForNumCol FROM ((TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      if ( ! (0==AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin) )
      {
         addWhere(sWhereString, "(T1.ColLin >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to) )
      {
         addWhere(sWhereString, "(T1.ColLin <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0AE03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin ,
                                          short AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to ,
                                          String AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel ,
                                          String AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum ,
                                          String AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel ,
                                          String AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom ,
                                          byte AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume ,
                                          byte AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to ,
                                          String AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel ,
                                          String AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc ,
                                          java.math.BigDecimal AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan ,
                                          java.math.BigDecimal AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to ,
                                          short A309ColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A481ForCan )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.ForCan, T3.ForPrdDsc, T1.ForPrdUMe, T2.PrdNom, T1.ColLin, T1.ForNumCol FROM ((TXPLDFORM T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      if ( ! (0==AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin) )
      {
         addWhere(sWhereString, "(T1.ColLin >= ?)");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (0==AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to) )
      {
         addWhere(sWhereString, "(T1.ColLin <= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0AE04( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin ,
                                          short AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to ,
                                          String AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel ,
                                          String AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum ,
                                          String AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel ,
                                          String AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom ,
                                          byte AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume ,
                                          byte AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to ,
                                          String AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel ,
                                          String AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc ,
                                          java.math.BigDecimal AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan ,
                                          java.math.BigDecimal AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to ,
                                          short A309ColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A481ForCan )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ForPrdUMe, T1.EmprCod, T1.ForCan, T2.ForPrdDsc, T3.PrdNom, T1.PrdNum, T1.ColLin, T1.ForNumCol FROM ((TXPLDFORM T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      if ( ! (0==AV44Formulaciontinte_colorcolorantes_trnwwds_1_tfcollin) )
      {
         addWhere(sWhereString, "(T1.ColLin >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV45Formulaciontinte_colorcolorantes_trnwwds_2_tfcollin_to) )
      {
         addWhere(sWhereString, "(T1.ColLin <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_colorcolorantes_trnwwds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_colorcolorantes_trnwwds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV48Formulaciontinte_colorcolorantes_trnwwds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Formulaciontinte_colorcolorantes_trnwwds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_colorcolorantes_trnwwds_7_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_colorcolorantes_trnwwds_8_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Formulaciontinte_colorcolorantes_trnwwds_9_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_colorcolorantes_trnwwds_10_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54Formulaciontinte_colorcolorantes_trnwwds_11_tfforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Formulaciontinte_colorcolorantes_trnwwds_12_tfforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
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
                  return conditional_P0AE02(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] );
            case 1 :
                  return conditional_P0AE03(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] );
            case 2 :
                  return conditional_P0AE04(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AE02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AE03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AE04", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
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
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[12]).shortValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               return;
      }
   }

}

