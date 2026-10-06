package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class procesosquimicos_trnwwgetfilterdata extends GXProcedure
{
   public procesosquimicos_trnwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesosquimicos_trnwwgetfilterdata.class ), "" );
   }

   public procesosquimicos_trnwwgetfilterdata( int remoteHandle ,
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
      procesosquimicos_trnwwgetfilterdata.this.aP5 = new String[] {""};
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
      procesosquimicos_trnwwgetfilterdata.this.AV22DDOName = aP0;
      procesosquimicos_trnwwgetfilterdata.this.AV20SearchTxt = aP1;
      procesosquimicos_trnwwgetfilterdata.this.AV21SearchTxtTo = aP2;
      procesosquimicos_trnwwgetfilterdata.this.aP3 = aP3;
      procesosquimicos_trnwwgetfilterdata.this.aP4 = aP4;
      procesosquimicos_trnwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PROFORCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORCODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PROFORDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV22DDOName), "DDO_PROFORDSC2") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORDSC2OPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV26OptionsJson = AV25Options.toJSonString(false) ;
      AV29OptionsDescJson = AV28OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV30OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV33Session.getValue("FormulacionTinte.ProcesosQuimicos_TRNWWGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ProcesosQuimicos_TRNWWGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV33Session.getValue("FormulacionTinte.ProcesosQuimicos_TRNWWGridState"), null, null);
      }
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV41GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV38FilterFullText = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV10TFProForCod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV11TFProForCod_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV12TFProForDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV13TFProForDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC2") == 0 )
         {
            AV14TFProForDsc2 = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC2_SEL") == 0 )
         {
            AV15TFProForDsc2_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTIE") == 0 )
         {
            AV16TFProForTie = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFProForTie_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTMX") == 0 )
         {
            AV18TFProForTmx = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFProForTmx_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFProForCod = AV20SearchTxt ;
      AV11TFProForCod_Sel = "" ;
      AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = AV38FilterFullText ;
      AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod = AV10TFProForCod ;
      AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel = AV11TFProForCod_Sel ;
      AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc = AV12TFProForDsc ;
      AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 = AV14TFProForDsc2 ;
      AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel = AV15TFProForDsc2_Sel ;
      AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie = AV16TFProForTie ;
      AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to = AV17TFProForTie_To ;
      AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx = AV18TFProForTmx ;
      AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to = AV19TFProForTmx_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext ,
                                           AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel ,
                                           AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod ,
                                           AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel ,
                                           AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc ,
                                           AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel ,
                                           AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 ,
                                           Short.valueOf(AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie) ,
                                           Short.valueOf(AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to) ,
                                           Short.valueOf(AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx) ,
                                           Short.valueOf(AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A4715ProForDsc2 ,
                                           Short.valueOf(A771ProForTie) ,
                                           Short.valueOf(A772ProForTmx) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod), 6, "%") ;
      lV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc), 30, "%") ;
      lV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 = GXutil.padr( GXutil.rtrim( AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2), 40, "%") ;
      /* Using cursor P09FK2 */
      pr_default.execute(0, new Object[] {lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod, AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel, lV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc, AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel, lV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2, AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel, Short.valueOf(AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie), Short.valueOf(AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to), Short.valueOf(AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx), Short.valueOf(AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9FK2 = false ;
         A764ProForCod = P09FK2_A764ProForCod[0] ;
         A772ProForTmx = P09FK2_A772ProForTmx[0] ;
         A771ProForTie = P09FK2_A771ProForTie[0] ;
         A4715ProForDsc2 = P09FK2_A4715ProForDsc2[0] ;
         A766ProForDsc = P09FK2_A766ProForDsc[0] ;
         A396EmprCod = P09FK2_A396EmprCod[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09FK2_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk9FK2 = false ;
            A396EmprCod = P09FK2_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9FK2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A764ProForCod)==0) )
         {
            AV24Option = A764ProForCod ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9FK2 )
         {
            brk9FK2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForDsc = AV20SearchTxt ;
      AV13TFProForDsc_Sel = "" ;
      AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = AV38FilterFullText ;
      AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod = AV10TFProForCod ;
      AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel = AV11TFProForCod_Sel ;
      AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc = AV12TFProForDsc ;
      AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 = AV14TFProForDsc2 ;
      AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel = AV15TFProForDsc2_Sel ;
      AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie = AV16TFProForTie ;
      AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to = AV17TFProForTie_To ;
      AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx = AV18TFProForTmx ;
      AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to = AV19TFProForTmx_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext ,
                                           AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel ,
                                           AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod ,
                                           AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel ,
                                           AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc ,
                                           AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel ,
                                           AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 ,
                                           Short.valueOf(AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie) ,
                                           Short.valueOf(AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to) ,
                                           Short.valueOf(AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx) ,
                                           Short.valueOf(AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A4715ProForDsc2 ,
                                           Short.valueOf(A771ProForTie) ,
                                           Short.valueOf(A772ProForTmx) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod), 6, "%") ;
      lV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc), 30, "%") ;
      lV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 = GXutil.padr( GXutil.rtrim( AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2), 40, "%") ;
      /* Using cursor P09FK3 */
      pr_default.execute(1, new Object[] {lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod, AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel, lV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc, AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel, lV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2, AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel, Short.valueOf(AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie), Short.valueOf(AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to), Short.valueOf(AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx), Short.valueOf(AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9FK4 = false ;
         A766ProForDsc = P09FK3_A766ProForDsc[0] ;
         A772ProForTmx = P09FK3_A772ProForTmx[0] ;
         A771ProForTie = P09FK3_A771ProForTie[0] ;
         A4715ProForDsc2 = P09FK3_A4715ProForDsc2[0] ;
         A764ProForCod = P09FK3_A764ProForCod[0] ;
         A396EmprCod = P09FK3_A396EmprCod[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09FK3_A766ProForDsc[0], A766ProForDsc) == 0 ) )
         {
            brk9FK4 = false ;
            A764ProForCod = P09FK3_A764ProForCod[0] ;
            A396EmprCod = P09FK3_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9FK4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV24Option = A766ProForDsc ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9FK4 )
         {
            brk9FK4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPROFORDSC2OPTIONS' Routine */
      returnInSub = false ;
      AV14TFProForDsc2 = AV20SearchTxt ;
      AV15TFProForDsc2_Sel = "" ;
      AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = AV38FilterFullText ;
      AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod = AV10TFProForCod ;
      AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel = AV11TFProForCod_Sel ;
      AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc = AV12TFProForDsc ;
      AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 = AV14TFProForDsc2 ;
      AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel = AV15TFProForDsc2_Sel ;
      AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie = AV16TFProForTie ;
      AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to = AV17TFProForTie_To ;
      AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx = AV18TFProForTmx ;
      AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to = AV19TFProForTmx_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext ,
                                           AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel ,
                                           AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod ,
                                           AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel ,
                                           AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc ,
                                           AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel ,
                                           AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 ,
                                           Short.valueOf(AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie) ,
                                           Short.valueOf(AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to) ,
                                           Short.valueOf(AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx) ,
                                           Short.valueOf(AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A4715ProForDsc2 ,
                                           Short.valueOf(A771ProForTie) ,
                                           Short.valueOf(A772ProForTmx) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT
                                           }
      });
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext), "%", "") ;
      lV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod), 6, "%") ;
      lV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc), 30, "%") ;
      lV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 = GXutil.padr( GXutil.rtrim( AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2), 40, "%") ;
      /* Using cursor P09FK4 */
      pr_default.execute(2, new Object[] {lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext, lV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod, AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel, lV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc, AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel, lV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2, AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel, Short.valueOf(AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie), Short.valueOf(AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to), Short.valueOf(AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx), Short.valueOf(AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9FK6 = false ;
         A4715ProForDsc2 = P09FK4_A4715ProForDsc2[0] ;
         A772ProForTmx = P09FK4_A772ProForTmx[0] ;
         A771ProForTie = P09FK4_A771ProForTie[0] ;
         A766ProForDsc = P09FK4_A766ProForDsc[0] ;
         A764ProForCod = P09FK4_A764ProForCod[0] ;
         A396EmprCod = P09FK4_A396EmprCod[0] ;
         AV32count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09FK4_A4715ProForDsc2[0], A4715ProForDsc2) == 0 ) )
         {
            brk9FK6 = false ;
            A764ProForCod = P09FK4_A764ProForCod[0] ;
            A396EmprCod = P09FK4_A396EmprCod[0] ;
            AV32count = (long)(AV32count+1) ;
            brk9FK6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A4715ProForDsc2)==0) )
         {
            AV24Option = A4715ProForDsc2 ;
            AV25Options.add(AV24Option, 0);
            AV30OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV32count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV25Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9FK6 )
         {
            brk9FK6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = procesosquimicos_trnwwgetfilterdata.this.AV26OptionsJson;
      this.aP4[0] = procesosquimicos_trnwwgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = procesosquimicos_trnwwgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26OptionsJson = "" ;
      AV29OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV25Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV33Session = httpContext.getWebSession();
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV38FilterFullText = "" ;
      AV10TFProForCod = "" ;
      AV11TFProForCod_Sel = "" ;
      AV12TFProForDsc = "" ;
      AV13TFProForDsc_Sel = "" ;
      AV14TFProForDsc2 = "" ;
      AV15TFProForDsc2_Sel = "" ;
      A764ProForCod = "" ;
      AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = "" ;
      AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod = "" ;
      AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel = "" ;
      AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc = "" ;
      AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel = "" ;
      AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 = "" ;
      AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel = "" ;
      scmdbuf = "" ;
      lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext = "" ;
      lV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod = "" ;
      lV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc = "" ;
      lV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 = "" ;
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      P09FK2_A764ProForCod = new String[] {""} ;
      P09FK2_A772ProForTmx = new short[1] ;
      P09FK2_A771ProForTie = new short[1] ;
      P09FK2_A4715ProForDsc2 = new String[] {""} ;
      P09FK2_A766ProForDsc = new String[] {""} ;
      P09FK2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV24Option = "" ;
      P09FK3_A766ProForDsc = new String[] {""} ;
      P09FK3_A772ProForTmx = new short[1] ;
      P09FK3_A771ProForTie = new short[1] ;
      P09FK3_A4715ProForDsc2 = new String[] {""} ;
      P09FK3_A764ProForCod = new String[] {""} ;
      P09FK3_A396EmprCod = new String[] {""} ;
      P09FK4_A4715ProForDsc2 = new String[] {""} ;
      P09FK4_A772ProForTmx = new short[1] ;
      P09FK4_A771ProForTie = new short[1] ;
      P09FK4_A766ProForDsc = new String[] {""} ;
      P09FK4_A764ProForCod = new String[] {""} ;
      P09FK4_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesosquimicos_trnwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09FK2_A764ProForCod, P09FK2_A772ProForTmx, P09FK2_A771ProForTie, P09FK2_A4715ProForDsc2, P09FK2_A766ProForDsc, P09FK2_A396EmprCod
            }
            , new Object[] {
            P09FK3_A766ProForDsc, P09FK3_A772ProForTmx, P09FK3_A771ProForTie, P09FK3_A4715ProForDsc2, P09FK3_A764ProForCod, P09FK3_A396EmprCod
            }
            , new Object[] {
            P09FK4_A4715ProForDsc2, P09FK4_A772ProForTmx, P09FK4_A771ProForTie, P09FK4_A766ProForDsc, P09FK4_A764ProForCod, P09FK4_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16TFProForTie ;
   private short AV17TFProForTie_To ;
   private short AV18TFProForTmx ;
   private short AV19TFProForTmx_To ;
   private short AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie ;
   private short AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to ;
   private short AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx ;
   private short AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short Gx_err ;
   private int AV41GXV1 ;
   private long AV32count ;
   private String AV10TFProForCod ;
   private String AV11TFProForCod_Sel ;
   private String AV12TFProForDsc ;
   private String AV13TFProForDsc_Sel ;
   private String AV14TFProForDsc2 ;
   private String AV15TFProForDsc2_Sel ;
   private String A764ProForCod ;
   private String AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod ;
   private String AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel ;
   private String AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc ;
   private String AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel ;
   private String AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 ;
   private String AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel ;
   private String scmdbuf ;
   private String lV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod ;
   private String lV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc ;
   private String lV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 ;
   private String A766ProForDsc ;
   private String A4715ProForDsc2 ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9FK2 ;
   private boolean brk9FK4 ;
   private boolean brk9FK6 ;
   private String AV26OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV22DDOName ;
   private String AV20SearchTxt ;
   private String AV21SearchTxtTo ;
   private String AV38FilterFullText ;
   private String AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext ;
   private String lV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext ;
   private String AV24Option ;
   private com.genexus.webpanels.WebSession AV33Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09FK2_A764ProForCod ;
   private short[] P09FK2_A772ProForTmx ;
   private short[] P09FK2_A771ProForTie ;
   private String[] P09FK2_A4715ProForDsc2 ;
   private String[] P09FK2_A766ProForDsc ;
   private String[] P09FK2_A396EmprCod ;
   private String[] P09FK3_A766ProForDsc ;
   private short[] P09FK3_A772ProForTmx ;
   private short[] P09FK3_A771ProForTie ;
   private String[] P09FK3_A4715ProForDsc2 ;
   private String[] P09FK3_A764ProForCod ;
   private String[] P09FK3_A396EmprCod ;
   private String[] P09FK4_A4715ProForDsc2 ;
   private short[] P09FK4_A772ProForTmx ;
   private short[] P09FK4_A771ProForTie ;
   private String[] P09FK4_A766ProForDsc ;
   private String[] P09FK4_A764ProForCod ;
   private String[] P09FK4_A396EmprCod ;
   private GXSimpleCollection<String> AV25Options ;
   private GXSimpleCollection<String> AV28OptionsDesc ;
   private GXSimpleCollection<String> AV30OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class procesosquimicos_trnwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09FK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext ,
                                          String AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel ,
                                          String AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod ,
                                          String AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel ,
                                          String AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc ,
                                          String AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel ,
                                          String AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 ,
                                          short AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie ,
                                          short AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to ,
                                          short AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx ,
                                          short AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A4715ProForDsc2 ,
                                          short A771ProForTie ,
                                          short A772ProForTmx )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[15];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ProForCod, ProForTmx, ProForTie, ProForDsc2, ProForDsc, EmprCod FROM TXPCPROFO" ;
      if ( ! (GXutil.strcmp("", AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForDsc2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ProForTie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProForTmx,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(ProForCod = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel)==0) && ( ! (GXutil.strcmp("", AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc2 = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie) )
      {
         addWhere(sWhereString, "(ProForTie >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to) )
      {
         addWhere(sWhereString, "(ProForTie <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx) )
      {
         addWhere(sWhereString, "(ProForTmx >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to) )
      {
         addWhere(sWhereString, "(ProForTmx <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProForCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09FK3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext ,
                                          String AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel ,
                                          String AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod ,
                                          String AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel ,
                                          String AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc ,
                                          String AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel ,
                                          String AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 ,
                                          short AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie ,
                                          short AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to ,
                                          short AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx ,
                                          short AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A4715ProForDsc2 ,
                                          short A771ProForTie ,
                                          short A772ProForTmx )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[15];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT ProForDsc, ProForTmx, ProForTie, ProForDsc2, ProForCod, EmprCod FROM TXPCPROFO" ;
      if ( ! (GXutil.strcmp("", AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForDsc2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ProForTie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProForTmx,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(ProForCod = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel)==0) && ( ! (GXutil.strcmp("", AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc2 = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie) )
      {
         addWhere(sWhereString, "(ProForTie >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to) )
      {
         addWhere(sWhereString, "(ProForTie <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx) )
      {
         addWhere(sWhereString, "(ProForTmx >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to) )
      {
         addWhere(sWhereString, "(ProForTmx <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProForDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09FK4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext ,
                                          String AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel ,
                                          String AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod ,
                                          String AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel ,
                                          String AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc ,
                                          String AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel ,
                                          String AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2 ,
                                          short AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie ,
                                          short AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to ,
                                          short AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx ,
                                          short AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A4715ProForDsc2 ,
                                          short A771ProForTie ,
                                          short A772ProForTmx )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[15];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT ProForDsc2, ProForTmx, ProForTie, ProForDsc, ProForCod, EmprCod FROM TXPCPROFO" ;
      if ( ! (GXutil.strcmp("", AV43Formulaciontinte_procesosquimicos_trnwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForDsc2) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ProForTie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProForTmx,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV44Formulaciontinte_procesosquimicos_trnwwds_2_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Formulaciontinte_procesosquimicos_trnwwds_3_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(ProForCod = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV46Formulaciontinte_procesosquimicos_trnwwds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47Formulaciontinte_procesosquimicos_trnwwds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel)==0) && ( ! (GXutil.strcmp("", AV48Formulaciontinte_procesosquimicos_trnwwds_6_tfprofordsc2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Formulaciontinte_procesosquimicos_trnwwds_7_tfprofordsc2_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc2 = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_procesosquimicos_trnwwds_8_tfprofortie) )
      {
         addWhere(sWhereString, "(ProForTie >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_procesosquimicos_trnwwds_9_tfprofortie_to) )
      {
         addWhere(sWhereString, "(ProForTie <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_procesosquimicos_trnwwds_10_tfprofortmx) )
      {
         addWhere(sWhereString, "(ProForTmx >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV53Formulaciontinte_procesosquimicos_trnwwds_11_tfprofortmx_to) )
      {
         addWhere(sWhereString, "(ProForTmx <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProForDsc2" ;
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
                  return conditional_P09FK2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() );
            case 1 :
                  return conditional_P09FK3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() );
            case 2 :
                  return conditional_P09FK4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09FK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09FK3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09FK4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 40);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 40);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 40);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 40);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 40);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 40);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               return;
      }
   }

}

