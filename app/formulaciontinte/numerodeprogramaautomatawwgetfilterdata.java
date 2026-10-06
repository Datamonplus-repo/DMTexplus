package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class numerodeprogramaautomatawwgetfilterdata extends GXProcedure
{
   public numerodeprogramaautomatawwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( numerodeprogramaautomatawwgetfilterdata.class ), "" );
   }

   public numerodeprogramaautomatawwgetfilterdata( int remoteHandle ,
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
      numerodeprogramaautomatawwgetfilterdata.this.aP5 = new String[] {""};
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
      numerodeprogramaautomatawwgetfilterdata.this.AV26DDOName = aP0;
      numerodeprogramaautomatawwgetfilterdata.this.AV24SearchTxt = aP1;
      numerodeprogramaautomatawwgetfilterdata.this.AV25SearchTxtTo = aP2;
      numerodeprogramaautomatawwgetfilterdata.this.aP3 = aP3;
      numerodeprogramaautomatawwgetfilterdata.this.aP4 = aP4;
      numerodeprogramaautomatawwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_MACPROCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMACPROCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_MACPRODSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMACPRODSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_MACPRODSC2") == 0 )
      {
         /* Execute user subroutine: 'LOADMACPRODSC2OPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV30OptionsJson = AV29Options.toJSonString(false) ;
      AV33OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("FormulacionTinte.NumerodeProgramaAutomataWWGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.NumerodeProgramaAutomataWWGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("FormulacionTinte.NumerodeProgramaAutomataWWGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPROCOD") == 0 )
         {
            AV10TFMacProCod = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPROCOD_SEL") == 0 )
         {
            AV11TFMacProCod_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC") == 0 )
         {
            AV12TFMacProDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC_SEL") == 0 )
         {
            AV13TFMacProDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC2") == 0 )
         {
            AV14TFMacProDsc2 = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACPRODSC2_SEL") == 0 )
         {
            AV15TFMacProDsc2_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMACNUMPRG") == 0 )
         {
            AV16TFMacNumPrg = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFMacNumPrg_To = (int)(GXutil.lval( AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMACPROCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFMacProCod = AV24SearchTxt ;
      AV11TFMacProCod_Sel = "" ;
      AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = AV10TFMacProCod ;
      AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel = AV11TFMacProCod_Sel ;
      AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = AV12TFMacProDsc ;
      AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel = AV13TFMacProDsc_Sel ;
      AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = AV14TFMacProDsc2 ;
      AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel = AV15TFMacProDsc2_Sel ;
      AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg = AV16TFMacNumPrg ;
      AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to = AV17TFMacNumPrg_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ,
                                           AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ,
                                           AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ,
                                           AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ,
                                           AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ,
                                           AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ,
                                           Integer.valueOf(AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg) ,
                                           Integer.valueOf(AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to) ,
                                           A1514MacProCod ,
                                           A1515MacProDsc ,
                                           A6231MacProDsc2 ,
                                           Integer.valueOf(A6096MacNumPrg) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = GXutil.padr( GXutil.rtrim( AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod), 6, "%") ;
      lV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = GXutil.padr( GXutil.rtrim( AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc), 20, "%") ;
      lV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2), 60, "%") ;
      /* Using cursor P09CE2 */
      pr_default.execute(0, new Object[] {lV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod, AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel, lV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc, AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel, lV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2, AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel, Integer.valueOf(AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg), Integer.valueOf(AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9CE2 = false ;
         A1514MacProCod = P09CE2_A1514MacProCod[0] ;
         A6096MacNumPrg = P09CE2_A6096MacNumPrg[0] ;
         A6231MacProDsc2 = P09CE2_A6231MacProDsc2[0] ;
         A1515MacProDsc = P09CE2_A1515MacProDsc[0] ;
         A396EmprCod = P09CE2_A396EmprCod[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09CE2_A1514MacProCod[0], A1514MacProCod) == 0 ) )
         {
            brk9CE2 = false ;
            A396EmprCod = P09CE2_A396EmprCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk9CE2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1514MacProCod)==0) )
         {
            AV28Option = A1514MacProCod ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CE2 )
         {
            brk9CE2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMACPRODSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFMacProDsc = AV24SearchTxt ;
      AV13TFMacProDsc_Sel = "" ;
      AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = AV10TFMacProCod ;
      AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel = AV11TFMacProCod_Sel ;
      AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = AV12TFMacProDsc ;
      AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel = AV13TFMacProDsc_Sel ;
      AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = AV14TFMacProDsc2 ;
      AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel = AV15TFMacProDsc2_Sel ;
      AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg = AV16TFMacNumPrg ;
      AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to = AV17TFMacNumPrg_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ,
                                           AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ,
                                           AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ,
                                           AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ,
                                           AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ,
                                           AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ,
                                           Integer.valueOf(AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg) ,
                                           Integer.valueOf(AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to) ,
                                           A1514MacProCod ,
                                           A1515MacProDsc ,
                                           A6231MacProDsc2 ,
                                           Integer.valueOf(A6096MacNumPrg) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = GXutil.padr( GXutil.rtrim( AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod), 6, "%") ;
      lV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = GXutil.padr( GXutil.rtrim( AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc), 20, "%") ;
      lV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2), 60, "%") ;
      /* Using cursor P09CE3 */
      pr_default.execute(1, new Object[] {lV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod, AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel, lV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc, AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel, lV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2, AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel, Integer.valueOf(AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg), Integer.valueOf(AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9CE4 = false ;
         A1515MacProDsc = P09CE3_A1515MacProDsc[0] ;
         A6096MacNumPrg = P09CE3_A6096MacNumPrg[0] ;
         A6231MacProDsc2 = P09CE3_A6231MacProDsc2[0] ;
         A1514MacProCod = P09CE3_A1514MacProCod[0] ;
         A396EmprCod = P09CE3_A396EmprCod[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09CE3_A1515MacProDsc[0], A1515MacProDsc) == 0 ) )
         {
            brk9CE4 = false ;
            A1514MacProCod = P09CE3_A1514MacProCod[0] ;
            A396EmprCod = P09CE3_A396EmprCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk9CE4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A1515MacProDsc)==0) )
         {
            AV28Option = A1515MacProDsc ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CE4 )
         {
            brk9CE4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADMACPRODSC2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFMacProDsc2 = AV24SearchTxt ;
      AV15TFMacProDsc2_Sel = "" ;
      AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = AV10TFMacProCod ;
      AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel = AV11TFMacProCod_Sel ;
      AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = AV12TFMacProDsc ;
      AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel = AV13TFMacProDsc_Sel ;
      AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = AV14TFMacProDsc2 ;
      AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel = AV15TFMacProDsc2_Sel ;
      AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg = AV16TFMacNumPrg ;
      AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to = AV17TFMacNumPrg_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ,
                                           AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ,
                                           AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ,
                                           AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ,
                                           AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ,
                                           AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ,
                                           Integer.valueOf(AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg) ,
                                           Integer.valueOf(AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to) ,
                                           A1514MacProCod ,
                                           A1515MacProDsc ,
                                           A6231MacProDsc2 ,
                                           Integer.valueOf(A6096MacNumPrg) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = GXutil.padr( GXutil.rtrim( AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod), 6, "%") ;
      lV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = GXutil.padr( GXutil.rtrim( AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc), 20, "%") ;
      lV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = GXutil.padr( GXutil.rtrim( AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2), 60, "%") ;
      /* Using cursor P09CE4 */
      pr_default.execute(2, new Object[] {lV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod, AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel, lV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc, AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel, lV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2, AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel, Integer.valueOf(AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg), Integer.valueOf(AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9CE6 = false ;
         A6231MacProDsc2 = P09CE4_A6231MacProDsc2[0] ;
         A6096MacNumPrg = P09CE4_A6096MacNumPrg[0] ;
         A1515MacProDsc = P09CE4_A1515MacProDsc[0] ;
         A1514MacProCod = P09CE4_A1514MacProCod[0] ;
         A396EmprCod = P09CE4_A396EmprCod[0] ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09CE4_A6231MacProDsc2[0], A6231MacProDsc2) == 0 ) )
         {
            brk9CE6 = false ;
            A1514MacProCod = P09CE4_A1514MacProCod[0] ;
            A396EmprCod = P09CE4_A396EmprCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk9CE6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A6231MacProDsc2)==0) )
         {
            AV28Option = A6231MacProDsc2 ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9CE6 )
         {
            brk9CE6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = numerodeprogramaautomatawwgetfilterdata.this.AV30OptionsJson;
      this.aP4[0] = numerodeprogramaautomatawwgetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = numerodeprogramaautomatawwgetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30OptionsJson = "" ;
      AV33OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFMacProCod = "" ;
      AV11TFMacProCod_Sel = "" ;
      AV12TFMacProDsc = "" ;
      AV13TFMacProDsc_Sel = "" ;
      AV14TFMacProDsc2 = "" ;
      AV15TFMacProDsc2_Sel = "" ;
      A1514MacProCod = "" ;
      AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = "" ;
      AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel = "" ;
      AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = "" ;
      AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel = "" ;
      AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = "" ;
      AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel = "" ;
      scmdbuf = "" ;
      lV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod = "" ;
      lV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc = "" ;
      lV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 = "" ;
      A1515MacProDsc = "" ;
      A6231MacProDsc2 = "" ;
      P09CE2_A1514MacProCod = new String[] {""} ;
      P09CE2_A6096MacNumPrg = new int[1] ;
      P09CE2_A6231MacProDsc2 = new String[] {""} ;
      P09CE2_A1515MacProDsc = new String[] {""} ;
      P09CE2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV28Option = "" ;
      P09CE3_A1515MacProDsc = new String[] {""} ;
      P09CE3_A6096MacNumPrg = new int[1] ;
      P09CE3_A6231MacProDsc2 = new String[] {""} ;
      P09CE3_A1514MacProCod = new String[] {""} ;
      P09CE3_A396EmprCod = new String[] {""} ;
      P09CE4_A6231MacProDsc2 = new String[] {""} ;
      P09CE4_A6096MacNumPrg = new int[1] ;
      P09CE4_A1515MacProDsc = new String[] {""} ;
      P09CE4_A1514MacProCod = new String[] {""} ;
      P09CE4_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.numerodeprogramaautomatawwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09CE2_A1514MacProCod, P09CE2_A6096MacNumPrg, P09CE2_A6231MacProDsc2, P09CE2_A1515MacProDsc, P09CE2_A396EmprCod
            }
            , new Object[] {
            P09CE3_A1515MacProDsc, P09CE3_A6096MacNumPrg, P09CE3_A6231MacProDsc2, P09CE3_A1514MacProCod, P09CE3_A396EmprCod
            }
            , new Object[] {
            P09CE4_A6231MacProDsc2, P09CE4_A6096MacNumPrg, P09CE4_A1515MacProDsc, P09CE4_A1514MacProCod, P09CE4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV16TFMacNumPrg ;
   private int AV17TFMacNumPrg_To ;
   private int AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg ;
   private int AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to ;
   private int A6096MacNumPrg ;
   private long AV36count ;
   private String AV10TFMacProCod ;
   private String AV11TFMacProCod_Sel ;
   private String AV12TFMacProDsc ;
   private String AV13TFMacProDsc_Sel ;
   private String AV14TFMacProDsc2 ;
   private String AV15TFMacProDsc2_Sel ;
   private String A1514MacProCod ;
   private String AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ;
   private String AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ;
   private String AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ;
   private String AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ;
   private String AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ;
   private String AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ;
   private String scmdbuf ;
   private String lV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ;
   private String lV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ;
   private String lV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ;
   private String A1515MacProDsc ;
   private String A6231MacProDsc2 ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9CE2 ;
   private boolean brk9CE4 ;
   private boolean brk9CE6 ;
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV28Option ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09CE2_A1514MacProCod ;
   private int[] P09CE2_A6096MacNumPrg ;
   private String[] P09CE2_A6231MacProDsc2 ;
   private String[] P09CE2_A1515MacProDsc ;
   private String[] P09CE2_A396EmprCod ;
   private String[] P09CE3_A1515MacProDsc ;
   private int[] P09CE3_A6096MacNumPrg ;
   private String[] P09CE3_A6231MacProDsc2 ;
   private String[] P09CE3_A1514MacProCod ;
   private String[] P09CE3_A396EmprCod ;
   private String[] P09CE4_A6231MacProDsc2 ;
   private int[] P09CE4_A6096MacNumPrg ;
   private String[] P09CE4_A1515MacProDsc ;
   private String[] P09CE4_A1514MacProCod ;
   private String[] P09CE4_A396EmprCod ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class numerodeprogramaautomatawwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09CE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ,
                                          String AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ,
                                          String AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ,
                                          String AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ,
                                          String AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ,
                                          String AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ,
                                          int AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg ,
                                          int AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to ,
                                          String A1514MacProCod ,
                                          String A1515MacProDsc ,
                                          String A6231MacProDsc2 ,
                                          int A6096MacNumPrg )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MacProCod, MacNumPrg, MacProDsc2, MacProDsc, EmprCod FROM TXPCMACPR" ;
      if ( (GXutil.strcmp("", AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel)==0) && ( ! (GXutil.strcmp("", AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel)==0) )
      {
         addWhere(sWhereString, "(MacProCod = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(MacProDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(MacProDsc2 = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg) )
      {
         addWhere(sWhereString, "(MacNumPrg >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to) )
      {
         addWhere(sWhereString, "(MacNumPrg <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MacProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09CE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ,
                                          String AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ,
                                          String AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ,
                                          String AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ,
                                          String AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ,
                                          String AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ,
                                          int AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg ,
                                          int AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to ,
                                          String A1514MacProCod ,
                                          String A1515MacProDsc ,
                                          String A6231MacProDsc2 ,
                                          int A6096MacNumPrg )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[8];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT MacProDsc, MacNumPrg, MacProDsc2, MacProCod, EmprCod FROM TXPCMACPR" ;
      if ( (GXutil.strcmp("", AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel)==0) && ( ! (GXutil.strcmp("", AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel)==0) )
      {
         addWhere(sWhereString, "(MacProCod = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(MacProDsc = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(MacProDsc2 = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg) )
      {
         addWhere(sWhereString, "(MacNumPrg >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to) )
      {
         addWhere(sWhereString, "(MacNumPrg <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MacProDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09CE4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel ,
                                          String AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod ,
                                          String AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel ,
                                          String AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc ,
                                          String AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel ,
                                          String AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2 ,
                                          int AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg ,
                                          int AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to ,
                                          String A1514MacProCod ,
                                          String A1515MacProDsc ,
                                          String A6231MacProDsc2 ,
                                          int A6096MacNumPrg )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[8];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT MacProDsc2, MacNumPrg, MacProDsc, MacProCod, EmprCod FROM TXPCMACPR" ;
      if ( (GXutil.strcmp("", AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel)==0) && ( ! (GXutil.strcmp("", AV47Formulaciontinte_numerodeprogramaautomatawwds_1_tfmacprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Formulaciontinte_numerodeprogramaautomatawwds_2_tfmacprocod_sel)==0) )
      {
         addWhere(sWhereString, "(MacProCod = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV49Formulaciontinte_numerodeprogramaautomatawwds_3_tfmacprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Formulaciontinte_numerodeprogramaautomatawwds_4_tfmacprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(MacProDsc = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel)==0) && ( ! (GXutil.strcmp("", AV51Formulaciontinte_numerodeprogramaautomatawwds_5_tfmacprodsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MacProDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Formulaciontinte_numerodeprogramaautomatawwds_6_tfmacprodsc2_sel)==0) )
      {
         addWhere(sWhereString, "(MacProDsc2 = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_numerodeprogramaautomatawwds_7_tfmacnumprg) )
      {
         addWhere(sWhereString, "(MacNumPrg >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV54Formulaciontinte_numerodeprogramaautomatawwds_8_tfmacnumprg_to) )
      {
         addWhere(sWhereString, "(MacNumPrg <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MacProDsc2" ;
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
                  return conditional_P09CE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() );
            case 1 :
                  return conditional_P09CE3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() );
            case 2 :
                  return conditional_P09CE4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09CE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09CE4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 60);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 60);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 20);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 60);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
      }
   }

}

