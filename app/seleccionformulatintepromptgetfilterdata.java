package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class seleccionformulatintepromptgetfilterdata extends GXProcedure
{
   public seleccionformulatintepromptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( seleccionformulatintepromptgetfilterdata.class ), "" );
   }

   public seleccionformulatintepromptgetfilterdata( int remoteHandle ,
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
      seleccionformulatintepromptgetfilterdata.this.aP5 = new String[] {""};
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
      seleccionformulatintepromptgetfilterdata.this.AV36DDOName = aP0;
      seleccionformulatintepromptgetfilterdata.this.AV37SearchTxt = aP1;
      seleccionformulatintepromptgetfilterdata.this.AV38SearchTxtTo = aP2;
      seleccionformulatintepromptgetfilterdata.this.aP3 = aP3;
      seleccionformulatintepromptgetfilterdata.this.aP4 = aP4;
      seleccionformulatintepromptgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_FORSER") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_FORSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADFORSERDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_FORCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADFORCOLNOMOPTIONS' */
         S151 ();
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
      if ( GXutil.strcmp(AV31Session.getValue("SeleccionFormulaTintePromptGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "SeleccionFormulaTintePromptGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("SeleccionFormulaTintePromptGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV14TFForSer = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV47TFForSer_To = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV15TFForSer_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV16TFForSerDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV17TFForSerDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV18TFForColNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV19TFForColNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV20TFForColNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFForColNum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV22TFTipColCod = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFTipColCod_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORBLO_SEL") == 0 )
         {
            AV48TFForBlo_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV49TFForBlo_Sels.fromJSonString(AV48TFForBlo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRO_SEL") == 0 )
         {
            AV50TFForPro_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV42EmprCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV37SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV49TFForBlo_Sels ,
                                           Integer.valueOf(AV10TFCliCod) ,
                                           Integer.valueOf(AV11TFCliCod_To) ,
                                           AV13TFCliNom_Sel ,
                                           AV12TFCliNom ,
                                           AV15TFForSer_Sel ,
                                           AV14TFForSer ,
                                           AV17TFForSerDsc_Sel ,
                                           AV16TFForSerDsc ,
                                           AV19TFForColNom_Sel ,
                                           AV18TFForColNom ,
                                           Integer.valueOf(AV20TFForColNum) ,
                                           Integer.valueOf(AV21TFForColNum_To) ,
                                           Byte.valueOf(AV22TFTipColCod) ,
                                           Byte.valueOf(AV23TFTipColCod_To) ,
                                           Integer.valueOf(AV49TFForBlo_Sels.size()) ,
                                           AV50TFForPro_Sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A2749ForPro ,
                                           A396EmprCod ,
                                           AV42EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12TFCliNom = GXutil.padr( GXutil.rtrim( AV12TFCliNom), 30, "%") ;
      lV14TFForSer = GXutil.padr( GXutil.rtrim( AV14TFForSer), 16, "%") ;
      lV16TFForSerDsc = GXutil.padr( GXutil.rtrim( AV16TFForSerDsc), 26, "%") ;
      lV18TFForColNom = GXutil.padr( GXutil.rtrim( AV18TFForColNom), 13, "%") ;
      /* Using cursor P09U02 */
      pr_default.execute(0, new Object[] {AV42EmprCod, Integer.valueOf(AV10TFCliCod), Integer.valueOf(AV11TFCliCod_To), lV12TFCliNom, AV13TFCliNom_Sel, lV14TFForSer, AV15TFForSer_Sel, AV15TFForSer_Sel, lV16TFForSerDsc, AV17TFForSerDsc_Sel, lV18TFForColNom, AV19TFForColNom_Sel, Integer.valueOf(AV20TFForColNum), Integer.valueOf(AV21TFForColNum_To), Byte.valueOf(AV22TFTipColCod), Byte.valueOf(AV23TFTipColCod_To), AV50TFForPro_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9U02 = false ;
         A396EmprCod = P09U02_A396EmprCod[0] ;
         A279CliNom = P09U02_A279CliNom[0] ;
         A2749ForPro = P09U02_A2749ForPro[0] ;
         n2749ForPro = P09U02_n2749ForPro[0] ;
         A7781ForBlo = P09U02_A7781ForBlo[0] ;
         n7781ForBlo = P09U02_n7781ForBlo[0] ;
         A831TipColCod = P09U02_A831TipColCod[0] ;
         A483ForColNum = P09U02_A483ForColNum[0] ;
         A482ForColNom = P09U02_A482ForColNom[0] ;
         A5742ForSerDsc = P09U02_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09U02_n5742ForSerDsc[0] ;
         A494ForSer = P09U02_A494ForSer[0] ;
         A252CliCod = P09U02_A252CliCod[0] ;
         A279CliNom = P09U02_A279CliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09U02_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk9U02 = false ;
            A396EmprCod = P09U02_A396EmprCod[0] ;
            A831TipColCod = P09U02_A831TipColCod[0] ;
            A483ForColNum = P09U02_A483ForColNum[0] ;
            A482ForColNom = P09U02_A482ForColNom[0] ;
            A494ForSer = P09U02_A494ForSer[0] ;
            A252CliCod = P09U02_A252CliCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9U02 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV25Option = A279CliNom ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9U02 )
         {
            brk9U02 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADFORSEROPTIONS' Routine */
      returnInSub = false ;
      AV14TFForSer = AV37SearchTxt ;
      AV47TFForSer_To = AV38SearchTxtTo ;
      AV15TFForSer_Sel = "" ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV49TFForBlo_Sels ,
                                           Integer.valueOf(AV10TFCliCod) ,
                                           Integer.valueOf(AV11TFCliCod_To) ,
                                           AV13TFCliNom_Sel ,
                                           AV12TFCliNom ,
                                           AV15TFForSer_Sel ,
                                           AV14TFForSer ,
                                           AV17TFForSerDsc_Sel ,
                                           AV16TFForSerDsc ,
                                           AV19TFForColNom_Sel ,
                                           AV18TFForColNom ,
                                           Integer.valueOf(AV20TFForColNum) ,
                                           Integer.valueOf(AV21TFForColNum_To) ,
                                           Byte.valueOf(AV22TFTipColCod) ,
                                           Byte.valueOf(AV23TFTipColCod_To) ,
                                           Integer.valueOf(AV49TFForBlo_Sels.size()) ,
                                           AV50TFForPro_Sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A2749ForPro ,
                                           A396EmprCod ,
                                           AV42EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12TFCliNom = GXutil.padr( GXutil.rtrim( AV12TFCliNom), 30, "%") ;
      lV14TFForSer = GXutil.padr( GXutil.rtrim( AV14TFForSer), 16, "%") ;
      lV16TFForSerDsc = GXutil.padr( GXutil.rtrim( AV16TFForSerDsc), 26, "%") ;
      lV18TFForColNom = GXutil.padr( GXutil.rtrim( AV18TFForColNom), 13, "%") ;
      /* Using cursor P09U03 */
      pr_default.execute(1, new Object[] {AV42EmprCod, Integer.valueOf(AV10TFCliCod), Integer.valueOf(AV11TFCliCod_To), lV12TFCliNom, AV13TFCliNom_Sel, lV14TFForSer, AV15TFForSer_Sel, AV15TFForSer_Sel, lV16TFForSerDsc, AV17TFForSerDsc_Sel, lV18TFForColNom, AV19TFForColNom_Sel, Integer.valueOf(AV20TFForColNum), Integer.valueOf(AV21TFForColNum_To), Byte.valueOf(AV22TFTipColCod), Byte.valueOf(AV23TFTipColCod_To), AV50TFForPro_Sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9U04 = false ;
         A396EmprCod = P09U03_A396EmprCod[0] ;
         A494ForSer = P09U03_A494ForSer[0] ;
         A2749ForPro = P09U03_A2749ForPro[0] ;
         n2749ForPro = P09U03_n2749ForPro[0] ;
         A7781ForBlo = P09U03_A7781ForBlo[0] ;
         n7781ForBlo = P09U03_n7781ForBlo[0] ;
         A831TipColCod = P09U03_A831TipColCod[0] ;
         A483ForColNum = P09U03_A483ForColNum[0] ;
         A482ForColNom = P09U03_A482ForColNom[0] ;
         A5742ForSerDsc = P09U03_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09U03_n5742ForSerDsc[0] ;
         A279CliNom = P09U03_A279CliNom[0] ;
         A252CliCod = P09U03_A252CliCod[0] ;
         A279CliNom = P09U03_A279CliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09U03_A494ForSer[0], A494ForSer) == 0 ) )
         {
            brk9U04 = false ;
            A396EmprCod = P09U03_A396EmprCod[0] ;
            A831TipColCod = P09U03_A831TipColCod[0] ;
            A483ForColNum = P09U03_A483ForColNum[0] ;
            A482ForColNom = P09U03_A482ForColNom[0] ;
            A252CliCod = P09U03_A252CliCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9U04 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A494ForSer)==0) )
         {
            AV25Option = A494ForSer ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9U04 )
         {
            brk9U04 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADFORSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFForSerDsc = AV37SearchTxt ;
      AV17TFForSerDsc_Sel = "" ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV49TFForBlo_Sels ,
                                           Integer.valueOf(AV10TFCliCod) ,
                                           Integer.valueOf(AV11TFCliCod_To) ,
                                           AV13TFCliNom_Sel ,
                                           AV12TFCliNom ,
                                           AV15TFForSer_Sel ,
                                           AV14TFForSer ,
                                           AV17TFForSerDsc_Sel ,
                                           AV16TFForSerDsc ,
                                           AV19TFForColNom_Sel ,
                                           AV18TFForColNom ,
                                           Integer.valueOf(AV20TFForColNum) ,
                                           Integer.valueOf(AV21TFForColNum_To) ,
                                           Byte.valueOf(AV22TFTipColCod) ,
                                           Byte.valueOf(AV23TFTipColCod_To) ,
                                           Integer.valueOf(AV49TFForBlo_Sels.size()) ,
                                           AV50TFForPro_Sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A2749ForPro ,
                                           A396EmprCod ,
                                           AV42EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12TFCliNom = GXutil.padr( GXutil.rtrim( AV12TFCliNom), 30, "%") ;
      lV14TFForSer = GXutil.padr( GXutil.rtrim( AV14TFForSer), 16, "%") ;
      lV16TFForSerDsc = GXutil.padr( GXutil.rtrim( AV16TFForSerDsc), 26, "%") ;
      lV18TFForColNom = GXutil.padr( GXutil.rtrim( AV18TFForColNom), 13, "%") ;
      /* Using cursor P09U04 */
      pr_default.execute(2, new Object[] {AV42EmprCod, Integer.valueOf(AV10TFCliCod), Integer.valueOf(AV11TFCliCod_To), lV12TFCliNom, AV13TFCliNom_Sel, lV14TFForSer, AV15TFForSer_Sel, AV15TFForSer_Sel, lV16TFForSerDsc, AV17TFForSerDsc_Sel, lV18TFForColNom, AV19TFForColNom_Sel, Integer.valueOf(AV20TFForColNum), Integer.valueOf(AV21TFForColNum_To), Byte.valueOf(AV22TFTipColCod), Byte.valueOf(AV23TFTipColCod_To), AV50TFForPro_Sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9U06 = false ;
         A396EmprCod = P09U04_A396EmprCod[0] ;
         A5742ForSerDsc = P09U04_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09U04_n5742ForSerDsc[0] ;
         A2749ForPro = P09U04_A2749ForPro[0] ;
         n2749ForPro = P09U04_n2749ForPro[0] ;
         A7781ForBlo = P09U04_A7781ForBlo[0] ;
         n7781ForBlo = P09U04_n7781ForBlo[0] ;
         A831TipColCod = P09U04_A831TipColCod[0] ;
         A483ForColNum = P09U04_A483ForColNum[0] ;
         A482ForColNom = P09U04_A482ForColNom[0] ;
         A494ForSer = P09U04_A494ForSer[0] ;
         A279CliNom = P09U04_A279CliNom[0] ;
         A252CliCod = P09U04_A252CliCod[0] ;
         A279CliNom = P09U04_A279CliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09U04_A5742ForSerDsc[0], A5742ForSerDsc) == 0 ) )
         {
            brk9U06 = false ;
            A396EmprCod = P09U04_A396EmprCod[0] ;
            A831TipColCod = P09U04_A831TipColCod[0] ;
            A483ForColNum = P09U04_A483ForColNum[0] ;
            A482ForColNom = P09U04_A482ForColNom[0] ;
            A494ForSer = P09U04_A494ForSer[0] ;
            A252CliCod = P09U04_A252CliCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9U06 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A5742ForSerDsc)==0) )
         {
            AV25Option = A5742ForSerDsc ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9U06 )
         {
            brk9U06 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADFORCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV18TFForColNom = AV37SearchTxt ;
      AV19TFForColNom_Sel = "" ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV49TFForBlo_Sels ,
                                           Integer.valueOf(AV10TFCliCod) ,
                                           Integer.valueOf(AV11TFCliCod_To) ,
                                           AV13TFCliNom_Sel ,
                                           AV12TFCliNom ,
                                           AV15TFForSer_Sel ,
                                           AV14TFForSer ,
                                           AV17TFForSerDsc_Sel ,
                                           AV16TFForSerDsc ,
                                           AV19TFForColNom_Sel ,
                                           AV18TFForColNom ,
                                           Integer.valueOf(AV20TFForColNum) ,
                                           Integer.valueOf(AV21TFForColNum_To) ,
                                           Byte.valueOf(AV22TFTipColCod) ,
                                           Byte.valueOf(AV23TFTipColCod_To) ,
                                           Integer.valueOf(AV49TFForBlo_Sels.size()) ,
                                           AV50TFForPro_Sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A2749ForPro ,
                                           A396EmprCod ,
                                           AV42EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12TFCliNom = GXutil.padr( GXutil.rtrim( AV12TFCliNom), 30, "%") ;
      lV14TFForSer = GXutil.padr( GXutil.rtrim( AV14TFForSer), 16, "%") ;
      lV16TFForSerDsc = GXutil.padr( GXutil.rtrim( AV16TFForSerDsc), 26, "%") ;
      lV18TFForColNom = GXutil.padr( GXutil.rtrim( AV18TFForColNom), 13, "%") ;
      /* Using cursor P09U05 */
      pr_default.execute(3, new Object[] {AV42EmprCod, Integer.valueOf(AV10TFCliCod), Integer.valueOf(AV11TFCliCod_To), lV12TFCliNom, AV13TFCliNom_Sel, lV14TFForSer, AV15TFForSer_Sel, AV15TFForSer_Sel, lV16TFForSerDsc, AV17TFForSerDsc_Sel, lV18TFForColNom, AV19TFForColNom_Sel, Integer.valueOf(AV20TFForColNum), Integer.valueOf(AV21TFForColNum_To), Byte.valueOf(AV22TFTipColCod), Byte.valueOf(AV23TFTipColCod_To), AV50TFForPro_Sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9U08 = false ;
         A396EmprCod = P09U05_A396EmprCod[0] ;
         A482ForColNom = P09U05_A482ForColNom[0] ;
         A2749ForPro = P09U05_A2749ForPro[0] ;
         n2749ForPro = P09U05_n2749ForPro[0] ;
         A7781ForBlo = P09U05_A7781ForBlo[0] ;
         n7781ForBlo = P09U05_n7781ForBlo[0] ;
         A831TipColCod = P09U05_A831TipColCod[0] ;
         A483ForColNum = P09U05_A483ForColNum[0] ;
         A5742ForSerDsc = P09U05_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09U05_n5742ForSerDsc[0] ;
         A494ForSer = P09U05_A494ForSer[0] ;
         A279CliNom = P09U05_A279CliNom[0] ;
         A252CliCod = P09U05_A252CliCod[0] ;
         A279CliNom = P09U05_A279CliNom[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09U05_A482ForColNom[0], A482ForColNom) == 0 ) )
         {
            brk9U08 = false ;
            A396EmprCod = P09U05_A396EmprCod[0] ;
            A831TipColCod = P09U05_A831TipColCod[0] ;
            A483ForColNum = P09U05_A483ForColNum[0] ;
            A494ForSer = P09U05_A494ForSer[0] ;
            A252CliCod = P09U05_A252CliCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9U08 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A482ForColNom)==0) )
         {
            AV25Option = A482ForColNom ;
            AV26Options.add(AV25Option, 0);
            AV29OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV26Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9U08 )
         {
            brk9U08 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP3[0] = seleccionformulatintepromptgetfilterdata.this.AV39OptionsJson;
      this.aP4[0] = seleccionformulatintepromptgetfilterdata.this.AV40OptionsDescJson;
      this.aP5[0] = seleccionformulatintepromptgetfilterdata.this.AV41OptionIndexesJson;
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
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      AV14TFForSer = "" ;
      AV47TFForSer_To = "" ;
      AV15TFForSer_Sel = "" ;
      AV16TFForSerDsc = "" ;
      AV17TFForSerDsc_Sel = "" ;
      AV18TFForColNom = "" ;
      AV19TFForColNom_Sel = "" ;
      AV48TFForBlo_SelsJson = "" ;
      AV49TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50TFForPro_Sel = "" ;
      AV42EmprCod = "" ;
      scmdbuf = "" ;
      lV12TFCliNom = "" ;
      lV14TFForSer = "" ;
      lV16TFForSerDsc = "" ;
      lV18TFForColNom = "" ;
      A7781ForBlo = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A2749ForPro = "" ;
      A396EmprCod = "" ;
      P09U02_A396EmprCod = new String[] {""} ;
      P09U02_A279CliNom = new String[] {""} ;
      P09U02_A2749ForPro = new String[] {""} ;
      P09U02_n2749ForPro = new boolean[] {false} ;
      P09U02_A7781ForBlo = new String[] {""} ;
      P09U02_n7781ForBlo = new boolean[] {false} ;
      P09U02_A831TipColCod = new byte[1] ;
      P09U02_A483ForColNum = new int[1] ;
      P09U02_A482ForColNom = new String[] {""} ;
      P09U02_A5742ForSerDsc = new String[] {""} ;
      P09U02_n5742ForSerDsc = new boolean[] {false} ;
      P09U02_A494ForSer = new String[] {""} ;
      P09U02_A252CliCod = new int[1] ;
      AV25Option = "" ;
      P09U03_A396EmprCod = new String[] {""} ;
      P09U03_A494ForSer = new String[] {""} ;
      P09U03_A2749ForPro = new String[] {""} ;
      P09U03_n2749ForPro = new boolean[] {false} ;
      P09U03_A7781ForBlo = new String[] {""} ;
      P09U03_n7781ForBlo = new boolean[] {false} ;
      P09U03_A831TipColCod = new byte[1] ;
      P09U03_A483ForColNum = new int[1] ;
      P09U03_A482ForColNom = new String[] {""} ;
      P09U03_A5742ForSerDsc = new String[] {""} ;
      P09U03_n5742ForSerDsc = new boolean[] {false} ;
      P09U03_A279CliNom = new String[] {""} ;
      P09U03_A252CliCod = new int[1] ;
      P09U04_A396EmprCod = new String[] {""} ;
      P09U04_A5742ForSerDsc = new String[] {""} ;
      P09U04_n5742ForSerDsc = new boolean[] {false} ;
      P09U04_A2749ForPro = new String[] {""} ;
      P09U04_n2749ForPro = new boolean[] {false} ;
      P09U04_A7781ForBlo = new String[] {""} ;
      P09U04_n7781ForBlo = new boolean[] {false} ;
      P09U04_A831TipColCod = new byte[1] ;
      P09U04_A483ForColNum = new int[1] ;
      P09U04_A482ForColNom = new String[] {""} ;
      P09U04_A494ForSer = new String[] {""} ;
      P09U04_A279CliNom = new String[] {""} ;
      P09U04_A252CliCod = new int[1] ;
      P09U05_A396EmprCod = new String[] {""} ;
      P09U05_A482ForColNom = new String[] {""} ;
      P09U05_A2749ForPro = new String[] {""} ;
      P09U05_n2749ForPro = new boolean[] {false} ;
      P09U05_A7781ForBlo = new String[] {""} ;
      P09U05_n7781ForBlo = new boolean[] {false} ;
      P09U05_A831TipColCod = new byte[1] ;
      P09U05_A483ForColNum = new int[1] ;
      P09U05_A5742ForSerDsc = new String[] {""} ;
      P09U05_n5742ForSerDsc = new boolean[] {false} ;
      P09U05_A494ForSer = new String[] {""} ;
      P09U05_A279CliNom = new String[] {""} ;
      P09U05_A252CliCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.seleccionformulatintepromptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09U02_A396EmprCod, P09U02_A279CliNom, P09U02_A2749ForPro, P09U02_n2749ForPro, P09U02_A7781ForBlo, P09U02_n7781ForBlo, P09U02_A831TipColCod, P09U02_A483ForColNum, P09U02_A482ForColNom, P09U02_A5742ForSerDsc,
            P09U02_n5742ForSerDsc, P09U02_A494ForSer, P09U02_A252CliCod
            }
            , new Object[] {
            P09U03_A396EmprCod, P09U03_A494ForSer, P09U03_A2749ForPro, P09U03_n2749ForPro, P09U03_A7781ForBlo, P09U03_n7781ForBlo, P09U03_A831TipColCod, P09U03_A483ForColNum, P09U03_A482ForColNom, P09U03_A5742ForSerDsc,
            P09U03_n5742ForSerDsc, P09U03_A279CliNom, P09U03_A252CliCod
            }
            , new Object[] {
            P09U04_A396EmprCod, P09U04_A5742ForSerDsc, P09U04_n5742ForSerDsc, P09U04_A2749ForPro, P09U04_n2749ForPro, P09U04_A7781ForBlo, P09U04_n7781ForBlo, P09U04_A831TipColCod, P09U04_A483ForColNum, P09U04_A482ForColNom,
            P09U04_A494ForSer, P09U04_A279CliNom, P09U04_A252CliCod
            }
            , new Object[] {
            P09U05_A396EmprCod, P09U05_A482ForColNom, P09U05_A2749ForPro, P09U05_n2749ForPro, P09U05_A7781ForBlo, P09U05_n7781ForBlo, P09U05_A831TipColCod, P09U05_A483ForColNum, P09U05_A5742ForSerDsc, P09U05_n5742ForSerDsc,
            P09U05_A494ForSer, P09U05_A279CliNom, P09U05_A252CliCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV22TFTipColCod ;
   private byte AV23TFTipColCod_To ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV20TFForColNum ;
   private int AV21TFForColNum_To ;
   private int AV49TFForBlo_Sels_size ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private long AV30count ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String AV14TFForSer ;
   private String AV47TFForSer_To ;
   private String AV15TFForSer_Sel ;
   private String AV16TFForSerDsc ;
   private String AV17TFForSerDsc_Sel ;
   private String AV18TFForColNom ;
   private String AV19TFForColNom_Sel ;
   private String AV50TFForPro_Sel ;
   private String AV42EmprCod ;
   private String scmdbuf ;
   private String lV12TFCliNom ;
   private String lV14TFForSer ;
   private String lV16TFForSerDsc ;
   private String lV18TFForColNom ;
   private String A7781ForBlo ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A482ForColNom ;
   private String A2749ForPro ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9U02 ;
   private boolean n2749ForPro ;
   private boolean n7781ForBlo ;
   private boolean n5742ForSerDsc ;
   private boolean brk9U04 ;
   private boolean brk9U06 ;
   private boolean brk9U08 ;
   private String AV39OptionsJson ;
   private String AV40OptionsDescJson ;
   private String AV41OptionIndexesJson ;
   private String AV48TFForBlo_SelsJson ;
   private String AV36DDOName ;
   private String AV37SearchTxt ;
   private String AV38SearchTxtTo ;
   private String AV25Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09U02_A396EmprCod ;
   private String[] P09U02_A279CliNom ;
   private String[] P09U02_A2749ForPro ;
   private boolean[] P09U02_n2749ForPro ;
   private String[] P09U02_A7781ForBlo ;
   private boolean[] P09U02_n7781ForBlo ;
   private byte[] P09U02_A831TipColCod ;
   private int[] P09U02_A483ForColNum ;
   private String[] P09U02_A482ForColNom ;
   private String[] P09U02_A5742ForSerDsc ;
   private boolean[] P09U02_n5742ForSerDsc ;
   private String[] P09U02_A494ForSer ;
   private int[] P09U02_A252CliCod ;
   private String[] P09U03_A396EmprCod ;
   private String[] P09U03_A494ForSer ;
   private String[] P09U03_A2749ForPro ;
   private boolean[] P09U03_n2749ForPro ;
   private String[] P09U03_A7781ForBlo ;
   private boolean[] P09U03_n7781ForBlo ;
   private byte[] P09U03_A831TipColCod ;
   private int[] P09U03_A483ForColNum ;
   private String[] P09U03_A482ForColNom ;
   private String[] P09U03_A5742ForSerDsc ;
   private boolean[] P09U03_n5742ForSerDsc ;
   private String[] P09U03_A279CliNom ;
   private int[] P09U03_A252CliCod ;
   private String[] P09U04_A396EmprCod ;
   private String[] P09U04_A5742ForSerDsc ;
   private boolean[] P09U04_n5742ForSerDsc ;
   private String[] P09U04_A2749ForPro ;
   private boolean[] P09U04_n2749ForPro ;
   private String[] P09U04_A7781ForBlo ;
   private boolean[] P09U04_n7781ForBlo ;
   private byte[] P09U04_A831TipColCod ;
   private int[] P09U04_A483ForColNum ;
   private String[] P09U04_A482ForColNom ;
   private String[] P09U04_A494ForSer ;
   private String[] P09U04_A279CliNom ;
   private int[] P09U04_A252CliCod ;
   private String[] P09U05_A396EmprCod ;
   private String[] P09U05_A482ForColNom ;
   private String[] P09U05_A2749ForPro ;
   private boolean[] P09U05_n2749ForPro ;
   private String[] P09U05_A7781ForBlo ;
   private boolean[] P09U05_n7781ForBlo ;
   private byte[] P09U05_A831TipColCod ;
   private int[] P09U05_A483ForColNum ;
   private String[] P09U05_A5742ForSerDsc ;
   private boolean[] P09U05_n5742ForSerDsc ;
   private String[] P09U05_A494ForSer ;
   private String[] P09U05_A279CliNom ;
   private int[] P09U05_A252CliCod ;
   private GXSimpleCollection<String> AV49TFForBlo_Sels ;
   private GXSimpleCollection<String> AV26Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV29OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class seleccionformulatintepromptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09U02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV49TFForBlo_Sels ,
                                          int AV10TFCliCod ,
                                          int AV11TFCliCod_To ,
                                          String AV13TFCliNom_Sel ,
                                          String AV12TFCliNom ,
                                          String AV15TFForSer_Sel ,
                                          String AV14TFForSer ,
                                          String AV17TFForSerDsc_Sel ,
                                          String AV16TFForSerDsc ,
                                          String AV19TFForColNom_Sel ,
                                          String AV18TFForColNom ,
                                          int AV20TFForColNum ,
                                          int AV21TFForColNum_To ,
                                          byte AV22TFTipColCod ,
                                          byte AV23TFTipColCod_To ,
                                          int AV49TFForBlo_Sels_size ,
                                          String AV50TFForPro_Sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A2749ForPro ,
                                          String A396EmprCod ,
                                          String AV42EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.ForPro, T1.ForBlo, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T1.CliCod FROM (TXPCFORMU T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV10TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV11TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSer_Sel)==0) && ( (GXutil.strcmp("", AV15TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFForSer)==0) ) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV15TFForSer_Sel)==0) ) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFForSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV20TFForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV21TFForColNum_To) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV22TFTipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV23TFTipColCod_To) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( AV49TFForBlo_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV49TFForBlo_Sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (GXutil.strcmp("", AV50TFForPro_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09U03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV49TFForBlo_Sels ,
                                          int AV10TFCliCod ,
                                          int AV11TFCliCod_To ,
                                          String AV13TFCliNom_Sel ,
                                          String AV12TFCliNom ,
                                          String AV15TFForSer_Sel ,
                                          String AV14TFForSer ,
                                          String AV17TFForSerDsc_Sel ,
                                          String AV16TFForSerDsc ,
                                          String AV19TFForColNom_Sel ,
                                          String AV18TFForColNom ,
                                          int AV20TFForColNum ,
                                          int AV21TFForColNum_To ,
                                          byte AV22TFTipColCod ,
                                          byte AV23TFTipColCod_To ,
                                          int AV49TFForBlo_Sels_size ,
                                          String AV50TFForPro_Sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A2749ForPro ,
                                          String A396EmprCod ,
                                          String AV42EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[17];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForSer, T1.ForPro, T1.ForBlo, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T2.CliNom, T1.CliCod FROM (TXPCFORMU T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV10TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! (0==AV11TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSer_Sel)==0) && ( (GXutil.strcmp("", AV15TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFForSer)==0) ) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV15TFForSer_Sel)==0) ) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFForSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV20TFForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV21TFForColNum_To) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV22TFTipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV23TFTipColCod_To) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( AV49TFForBlo_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV49TFForBlo_Sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (GXutil.strcmp("", AV50TFForPro_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSer" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P09U04( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV49TFForBlo_Sels ,
                                          int AV10TFCliCod ,
                                          int AV11TFCliCod_To ,
                                          String AV13TFCliNom_Sel ,
                                          String AV12TFCliNom ,
                                          String AV15TFForSer_Sel ,
                                          String AV14TFForSer ,
                                          String AV17TFForSerDsc_Sel ,
                                          String AV16TFForSerDsc ,
                                          String AV19TFForColNom_Sel ,
                                          String AV18TFForColNom ,
                                          int AV20TFForColNum ,
                                          int AV21TFForColNum_To ,
                                          byte AV22TFTipColCod ,
                                          byte AV23TFTipColCod_To ,
                                          int AV49TFForBlo_Sels_size ,
                                          String AV50TFForPro_Sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A2749ForPro ,
                                          String A396EmprCod ,
                                          String AV42EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[17];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForSerDsc, T1.ForPro, T1.ForBlo, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T2.CliNom, T1.CliCod FROM (TXPCFORMU T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV10TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV11TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSer_Sel)==0) && ( (GXutil.strcmp("", AV15TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFForSer)==0) ) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV15TFForSer_Sel)==0) ) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFForSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV20TFForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV21TFForColNum_To) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV22TFTipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV23TFTipColCod_To) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( AV49TFForBlo_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV49TFForBlo_Sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (GXutil.strcmp("", AV50TFForPro_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForSerDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09U05( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV49TFForBlo_Sels ,
                                          int AV10TFCliCod ,
                                          int AV11TFCliCod_To ,
                                          String AV13TFCliNom_Sel ,
                                          String AV12TFCliNom ,
                                          String AV15TFForSer_Sel ,
                                          String AV14TFForSer ,
                                          String AV17TFForSerDsc_Sel ,
                                          String AV16TFForSerDsc ,
                                          String AV19TFForColNom_Sel ,
                                          String AV18TFForColNom ,
                                          int AV20TFForColNum ,
                                          int AV21TFForColNum_To ,
                                          byte AV22TFTipColCod ,
                                          byte AV23TFTipColCod_To ,
                                          int AV49TFForBlo_Sels_size ,
                                          String AV50TFForPro_Sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A2749ForPro ,
                                          String A396EmprCod ,
                                          String AV42EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[17];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ForColNom, T1.ForPro, T1.ForBlo, T1.TipColCod, T1.ForColNum, T1.ForSerDsc, T1.ForSer, T2.CliNom, T1.CliCod FROM (TXPCFORMU T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV10TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! (0==AV11TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSer_Sel)==0) && ( (GXutil.strcmp("", AV15TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV14TFForSer)==0) ) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV15TFForSer_Sel)==0) && ( ! (GXutil.strcmp("", AV15TFForSer_Sel)==0) ) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15TFForSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV19TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV18TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV20TFForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV21TFForColNum_To) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (0==AV22TFTipColCod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV23TFTipColCod_To) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( AV49TFForBlo_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV49TFForBlo_Sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (GXutil.strcmp("", AV50TFForPro_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.ForColNom" ;
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
                  return conditional_P09U02(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 1 :
                  return conditional_P09U03(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 2 :
                  return conditional_P09U04(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 3 :
                  return conditional_P09U05(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09U02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09U03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09U04", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09U05", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 16);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 16);
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((int[]) buf[12])[0] = rslt.getInt(10);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
               }
               return;
      }
   }

}

