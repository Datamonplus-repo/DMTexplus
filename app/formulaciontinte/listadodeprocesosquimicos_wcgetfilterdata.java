package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class listadodeprocesosquimicos_wcgetfilterdata extends GXProcedure
{
   public listadodeprocesosquimicos_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( listadodeprocesosquimicos_wcgetfilterdata.class ), "" );
   }

   public listadodeprocesosquimicos_wcgetfilterdata( int remoteHandle ,
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
      listadodeprocesosquimicos_wcgetfilterdata.this.aP5 = new String[] {""};
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
      listadodeprocesosquimicos_wcgetfilterdata.this.AV16DDOName = aP0;
      listadodeprocesosquimicos_wcgetfilterdata.this.AV14SearchTxt = aP1;
      listadodeprocesosquimicos_wcgetfilterdata.this.AV15SearchTxtTo = aP2;
      listadodeprocesosquimicos_wcgetfilterdata.this.aP3 = aP3;
      listadodeprocesosquimicos_wcgetfilterdata.this.aP4 = aP4;
      listadodeprocesosquimicos_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PROFORCOD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PROFORDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PROFORMAT") == 0 )
      {
         /* Execute user subroutine: 'LOADPROFORMATOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("FormulacionTinte.ListadodeProcesosQuimicos_WCGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ListadodeProcesosQuimicos_WCGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FormulacionTinte.ListadodeProcesosQuimicos_WCGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV10TFProForCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV11TFProForCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV12TFProForDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV13TFProForDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORMAT") == 0 )
         {
            AV41TFProForMat = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORMAT_SEL") == 0 )
         {
            AV42TFProForMat_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTIE") == 0 )
         {
            AV39TFProForTie = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFProForTie_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORTMX") == 0 )
         {
            AV47TFProForTmx = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFProForTmx_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMPRO") == 0 )
         {
            AV43TFProNumPro = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFProNumPro_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRONUMREC") == 0 )
         {
            AV45TFProNumRec = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFProNumRec_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV33Emprcod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&IMPCOD") == 0 )
         {
            AV36Impcod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCODFROM") == 0 )
         {
            AV34Proforcodfrom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCODTO") == 0 )
         {
            AV35Proforcodto = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORABS") == 0 )
         {
            AV37ProforAbs = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORACT") == 0 )
         {
            AV38Proforact = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPROFORCODOPTIONS' Routine */
      returnInSub = false ;
      AV10TFProForCod = AV14SearchTxt ;
      AV11TFProForCod_Sel = "" ;
      AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = AV32FilterFullText ;
      AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = AV10TFProForCod ;
      AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel = AV11TFProForCod_Sel ;
      AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = AV12TFProForDsc ;
      AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = AV41TFProForMat ;
      AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel = AV42TFProForMat_Sel ;
      AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie = AV39TFProForTie ;
      AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to = AV40TFProForTie_To ;
      AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx = AV47TFProForTmx ;
      AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to = AV48TFProForTmx_To ;
      AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro = AV43TFProNumPro ;
      AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to = AV44TFProNumPro_To ;
      AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec = AV45TFProNumRec ;
      AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to = AV46TFProNumRec_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ,
                                           AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ,
                                           AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ,
                                           AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ,
                                           AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ,
                                           AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ,
                                           AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ,
                                           Short.valueOf(AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie) ,
                                           Short.valueOf(AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to) ,
                                           Short.valueOf(AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx) ,
                                           Short.valueOf(AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to) ,
                                           Integer.valueOf(AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro) ,
                                           Integer.valueOf(AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to) ,
                                           Integer.valueOf(AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec) ,
                                           Integer.valueOf(AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to) ,
                                           AV34Proforcodfrom ,
                                           AV35Proforcodto ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A769ProForMat ,
                                           Short.valueOf(A771ProForTie) ,
                                           Short.valueOf(A772ProForTmx) ,
                                           Integer.valueOf(A2392ProNumPro) ,
                                           Integer.valueOf(A2393ProNumRec) ,
                                           A13133ProForAct ,
                                           AV38Proforact ,
                                           AV33Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod), 6, "%") ;
      lV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc), 30, "%") ;
      lV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat), 16, "%") ;
      /* Using cursor P09ED2 */
      pr_default.execute(0, new Object[] {AV33Emprcod, AV38Proforact, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod, AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel, lV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc, AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel, lV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat, AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel, Short.valueOf(AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie), Short.valueOf(AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to), Short.valueOf(AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx), Short.valueOf(AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to), Integer.valueOf(AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro), Integer.valueOf(AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to), Integer.valueOf(AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec), Integer.valueOf(AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to), AV34Proforcodfrom, AV35Proforcodto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9ED2 = false ;
         A396EmprCod = P09ED2_A396EmprCod[0] ;
         A764ProForCod = P09ED2_A764ProForCod[0] ;
         A13133ProForAct = P09ED2_A13133ProForAct[0] ;
         A2393ProNumRec = P09ED2_A2393ProNumRec[0] ;
         A2392ProNumPro = P09ED2_A2392ProNumPro[0] ;
         A772ProForTmx = P09ED2_A772ProForTmx[0] ;
         A771ProForTie = P09ED2_A771ProForTie[0] ;
         A769ProForMat = P09ED2_A769ProForMat[0] ;
         A766ProForDsc = P09ED2_A766ProForDsc[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09ED2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09ED2_A764ProForCod[0], A764ProForCod) == 0 ) )
         {
            brk9ED2 = false ;
            AV26count = (long)(AV26count+1) ;
            brk9ED2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A764ProForCod)==0) )
         {
            AV18Option = A764ProForCod ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9ED2 )
         {
            brk9ED2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPROFORDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFProForDsc = AV14SearchTxt ;
      AV13TFProForDsc_Sel = "" ;
      AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = AV32FilterFullText ;
      AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = AV10TFProForCod ;
      AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel = AV11TFProForCod_Sel ;
      AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = AV12TFProForDsc ;
      AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = AV41TFProForMat ;
      AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel = AV42TFProForMat_Sel ;
      AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie = AV39TFProForTie ;
      AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to = AV40TFProForTie_To ;
      AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx = AV47TFProForTmx ;
      AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to = AV48TFProForTmx_To ;
      AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro = AV43TFProNumPro ;
      AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to = AV44TFProNumPro_To ;
      AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec = AV45TFProNumRec ;
      AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to = AV46TFProNumRec_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ,
                                           AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ,
                                           AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ,
                                           AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ,
                                           AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ,
                                           AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ,
                                           AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ,
                                           Short.valueOf(AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie) ,
                                           Short.valueOf(AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to) ,
                                           Short.valueOf(AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx) ,
                                           Short.valueOf(AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to) ,
                                           Integer.valueOf(AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro) ,
                                           Integer.valueOf(AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to) ,
                                           Integer.valueOf(AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec) ,
                                           Integer.valueOf(AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to) ,
                                           AV34Proforcodfrom ,
                                           AV35Proforcodto ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A769ProForMat ,
                                           Short.valueOf(A771ProForTie) ,
                                           Short.valueOf(A772ProForTmx) ,
                                           Integer.valueOf(A2392ProNumPro) ,
                                           Integer.valueOf(A2393ProNumRec) ,
                                           A396EmprCod ,
                                           AV33Emprcod ,
                                           A13133ProForAct ,
                                           AV38Proforact } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod), 6, "%") ;
      lV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc), 30, "%") ;
      lV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat), 16, "%") ;
      /* Using cursor P09ED3 */
      pr_default.execute(1, new Object[] {AV33Emprcod, AV38Proforact, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod, AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel, lV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc, AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel, lV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat, AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel, Short.valueOf(AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie), Short.valueOf(AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to), Short.valueOf(AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx), Short.valueOf(AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to), Integer.valueOf(AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro), Integer.valueOf(AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to), Integer.valueOf(AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec), Integer.valueOf(AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to), AV34Proforcodfrom, AV35Proforcodto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9ED4 = false ;
         A396EmprCod = P09ED3_A396EmprCod[0] ;
         A13133ProForAct = P09ED3_A13133ProForAct[0] ;
         A766ProForDsc = P09ED3_A766ProForDsc[0] ;
         A2393ProNumRec = P09ED3_A2393ProNumRec[0] ;
         A2392ProNumPro = P09ED3_A2392ProNumPro[0] ;
         A772ProForTmx = P09ED3_A772ProForTmx[0] ;
         A771ProForTie = P09ED3_A771ProForTie[0] ;
         A769ProForMat = P09ED3_A769ProForMat[0] ;
         A764ProForCod = P09ED3_A764ProForCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09ED3_A766ProForDsc[0], A766ProForDsc) == 0 ) )
         {
            brk9ED4 = false ;
            A396EmprCod = P09ED3_A396EmprCod[0] ;
            A764ProForCod = P09ED3_A764ProForCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9ED4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A766ProForDsc)==0) )
         {
            AV18Option = A766ProForDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9ED4 )
         {
            brk9ED4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPROFORMATOPTIONS' Routine */
      returnInSub = false ;
      AV41TFProForMat = AV14SearchTxt ;
      AV42TFProForMat_Sel = "" ;
      AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = AV32FilterFullText ;
      AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = AV10TFProForCod ;
      AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel = AV11TFProForCod_Sel ;
      AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = AV12TFProForDsc ;
      AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel = AV13TFProForDsc_Sel ;
      AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = AV41TFProForMat ;
      AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel = AV42TFProForMat_Sel ;
      AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie = AV39TFProForTie ;
      AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to = AV40TFProForTie_To ;
      AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx = AV47TFProForTmx ;
      AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to = AV48TFProForTmx_To ;
      AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro = AV43TFProNumPro ;
      AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to = AV44TFProNumPro_To ;
      AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec = AV45TFProNumRec ;
      AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to = AV46TFProNumRec_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ,
                                           AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ,
                                           AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ,
                                           AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ,
                                           AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ,
                                           AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ,
                                           AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ,
                                           Short.valueOf(AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie) ,
                                           Short.valueOf(AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to) ,
                                           Short.valueOf(AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx) ,
                                           Short.valueOf(AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to) ,
                                           Integer.valueOf(AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro) ,
                                           Integer.valueOf(AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to) ,
                                           Integer.valueOf(AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec) ,
                                           Integer.valueOf(AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to) ,
                                           AV34Proforcodfrom ,
                                           AV35Proforcodto ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A769ProForMat ,
                                           Short.valueOf(A771ProForTie) ,
                                           Short.valueOf(A772ProForTmx) ,
                                           Integer.valueOf(A2392ProNumPro) ,
                                           Integer.valueOf(A2393ProNumRec) ,
                                           A396EmprCod ,
                                           AV33Emprcod ,
                                           A13133ProForAct ,
                                           AV38Proforact } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext), "%", "") ;
      lV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = GXutil.padr( GXutil.rtrim( AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod), 6, "%") ;
      lV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = GXutil.padr( GXutil.rtrim( AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc), 30, "%") ;
      lV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat), 16, "%") ;
      /* Using cursor P09ED4 */
      pr_default.execute(2, new Object[] {AV33Emprcod, AV38Proforact, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext, lV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod, AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel, lV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc, AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel, lV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat, AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel, Short.valueOf(AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie), Short.valueOf(AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to), Short.valueOf(AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx), Short.valueOf(AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to), Integer.valueOf(AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro), Integer.valueOf(AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to), Integer.valueOf(AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec), Integer.valueOf(AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to), AV34Proforcodfrom, AV35Proforcodto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9ED6 = false ;
         A396EmprCod = P09ED4_A396EmprCod[0] ;
         A13133ProForAct = P09ED4_A13133ProForAct[0] ;
         A769ProForMat = P09ED4_A769ProForMat[0] ;
         A2393ProNumRec = P09ED4_A2393ProNumRec[0] ;
         A2392ProNumPro = P09ED4_A2392ProNumPro[0] ;
         A772ProForTmx = P09ED4_A772ProForTmx[0] ;
         A771ProForTie = P09ED4_A771ProForTie[0] ;
         A766ProForDsc = P09ED4_A766ProForDsc[0] ;
         A764ProForCod = P09ED4_A764ProForCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09ED4_A769ProForMat[0], A769ProForMat) == 0 ) )
         {
            brk9ED6 = false ;
            A396EmprCod = P09ED4_A396EmprCod[0] ;
            A764ProForCod = P09ED4_A764ProForCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9ED6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A769ProForMat)==0) )
         {
            AV18Option = A769ProForMat ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9ED6 )
         {
            brk9ED6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = listadodeprocesosquimicos_wcgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = listadodeprocesosquimicos_wcgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = listadodeprocesosquimicos_wcgetfilterdata.this.AV25OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OptionsJson = "" ;
      AV23OptionsDescJson = "" ;
      AV25OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV10TFProForCod = "" ;
      AV11TFProForCod_Sel = "" ;
      AV12TFProForDsc = "" ;
      AV13TFProForDsc_Sel = "" ;
      AV41TFProForMat = "" ;
      AV42TFProForMat_Sel = "" ;
      AV33Emprcod = "" ;
      AV36Impcod = "" ;
      AV34Proforcodfrom = "" ;
      AV35Proforcodto = "" ;
      AV37ProforAbs = DecimalUtil.ZERO ;
      AV38Proforact = "" ;
      A764ProForCod = "" ;
      AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = "" ;
      AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = "" ;
      AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel = "" ;
      AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = "" ;
      AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel = "" ;
      AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = "" ;
      AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel = "" ;
      scmdbuf = "" ;
      lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext = "" ;
      lV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod = "" ;
      lV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc = "" ;
      lV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat = "" ;
      A766ProForDsc = "" ;
      A769ProForMat = "" ;
      A13133ProForAct = "" ;
      A396EmprCod = "" ;
      P09ED2_A396EmprCod = new String[] {""} ;
      P09ED2_A764ProForCod = new String[] {""} ;
      P09ED2_A13133ProForAct = new String[] {""} ;
      P09ED2_A2393ProNumRec = new int[1] ;
      P09ED2_A2392ProNumPro = new int[1] ;
      P09ED2_A772ProForTmx = new short[1] ;
      P09ED2_A771ProForTie = new short[1] ;
      P09ED2_A769ProForMat = new String[] {""} ;
      P09ED2_A766ProForDsc = new String[] {""} ;
      AV18Option = "" ;
      P09ED3_A396EmprCod = new String[] {""} ;
      P09ED3_A13133ProForAct = new String[] {""} ;
      P09ED3_A766ProForDsc = new String[] {""} ;
      P09ED3_A2393ProNumRec = new int[1] ;
      P09ED3_A2392ProNumPro = new int[1] ;
      P09ED3_A772ProForTmx = new short[1] ;
      P09ED3_A771ProForTie = new short[1] ;
      P09ED3_A769ProForMat = new String[] {""} ;
      P09ED3_A764ProForCod = new String[] {""} ;
      P09ED4_A396EmprCod = new String[] {""} ;
      P09ED4_A13133ProForAct = new String[] {""} ;
      P09ED4_A769ProForMat = new String[] {""} ;
      P09ED4_A2393ProNumRec = new int[1] ;
      P09ED4_A2392ProNumPro = new int[1] ;
      P09ED4_A772ProForTmx = new short[1] ;
      P09ED4_A771ProForTie = new short[1] ;
      P09ED4_A766ProForDsc = new String[] {""} ;
      P09ED4_A764ProForCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.listadodeprocesosquimicos_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09ED2_A396EmprCod, P09ED2_A764ProForCod, P09ED2_A13133ProForAct, P09ED2_A2393ProNumRec, P09ED2_A2392ProNumPro, P09ED2_A772ProForTmx, P09ED2_A771ProForTie, P09ED2_A769ProForMat, P09ED2_A766ProForDsc
            }
            , new Object[] {
            P09ED3_A396EmprCod, P09ED3_A13133ProForAct, P09ED3_A766ProForDsc, P09ED3_A2393ProNumRec, P09ED3_A2392ProNumPro, P09ED3_A772ProForTmx, P09ED3_A771ProForTie, P09ED3_A769ProForMat, P09ED3_A764ProForCod
            }
            , new Object[] {
            P09ED4_A396EmprCod, P09ED4_A13133ProForAct, P09ED4_A769ProForMat, P09ED4_A2393ProNumRec, P09ED4_A2392ProNumPro, P09ED4_A772ProForTmx, P09ED4_A771ProForTie, P09ED4_A766ProForDsc, P09ED4_A764ProForCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV39TFProForTie ;
   private short AV40TFProForTie_To ;
   private short AV47TFProForTmx ;
   private short AV48TFProForTmx_To ;
   private short AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie ;
   private short AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to ;
   private short AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx ;
   private short AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to ;
   private short A771ProForTie ;
   private short A772ProForTmx ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private int AV43TFProNumPro ;
   private int AV44TFProNumPro_To ;
   private int AV45TFProNumRec ;
   private int AV46TFProNumRec_To ;
   private int AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro ;
   private int AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to ;
   private int AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec ;
   private int AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to ;
   private int A2392ProNumPro ;
   private int A2393ProNumRec ;
   private long AV26count ;
   private java.math.BigDecimal AV37ProforAbs ;
   private String AV10TFProForCod ;
   private String AV11TFProForCod_Sel ;
   private String AV12TFProForDsc ;
   private String AV13TFProForDsc_Sel ;
   private String AV41TFProForMat ;
   private String AV42TFProForMat_Sel ;
   private String AV33Emprcod ;
   private String AV36Impcod ;
   private String AV34Proforcodfrom ;
   private String AV35Proforcodto ;
   private String AV38Proforact ;
   private String A764ProForCod ;
   private String AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ;
   private String AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ;
   private String AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ;
   private String AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ;
   private String AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ;
   private String AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ;
   private String scmdbuf ;
   private String lV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ;
   private String lV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ;
   private String lV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ;
   private String A766ProForDsc ;
   private String A769ProForMat ;
   private String A13133ProForAct ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9ED2 ;
   private boolean brk9ED4 ;
   private boolean brk9ED6 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ;
   private String lV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09ED2_A396EmprCod ;
   private String[] P09ED2_A764ProForCod ;
   private String[] P09ED2_A13133ProForAct ;
   private int[] P09ED2_A2393ProNumRec ;
   private int[] P09ED2_A2392ProNumPro ;
   private short[] P09ED2_A772ProForTmx ;
   private short[] P09ED2_A771ProForTie ;
   private String[] P09ED2_A769ProForMat ;
   private String[] P09ED2_A766ProForDsc ;
   private String[] P09ED3_A396EmprCod ;
   private String[] P09ED3_A13133ProForAct ;
   private String[] P09ED3_A766ProForDsc ;
   private int[] P09ED3_A2393ProNumRec ;
   private int[] P09ED3_A2392ProNumPro ;
   private short[] P09ED3_A772ProForTmx ;
   private short[] P09ED3_A771ProForTie ;
   private String[] P09ED3_A769ProForMat ;
   private String[] P09ED3_A764ProForCod ;
   private String[] P09ED4_A396EmprCod ;
   private String[] P09ED4_A13133ProForAct ;
   private String[] P09ED4_A769ProForMat ;
   private int[] P09ED4_A2393ProNumRec ;
   private int[] P09ED4_A2392ProNumPro ;
   private short[] P09ED4_A772ProForTmx ;
   private short[] P09ED4_A771ProForTie ;
   private String[] P09ED4_A766ProForDsc ;
   private String[] P09ED4_A764ProForCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class listadodeprocesosquimicos_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09ED2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ,
                                          String AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ,
                                          String AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ,
                                          String AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ,
                                          String AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ,
                                          String AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ,
                                          String AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ,
                                          short AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie ,
                                          short AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to ,
                                          short AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx ,
                                          short AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to ,
                                          int AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro ,
                                          int AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to ,
                                          int AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec ,
                                          int AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to ,
                                          String AV34Proforcodfrom ,
                                          String AV35Proforcodto ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A769ProForMat ,
                                          short A771ProForTie ,
                                          short A772ProForTmx ,
                                          int A2392ProNumPro ,
                                          int A2393ProNumRec ,
                                          String A13133ProForAct ,
                                          String AV38Proforact ,
                                          String AV33Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[25];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, ProForCod, ProForAct, ProNumRec, ProNumPro, ProForTmx, ProForTie, ProForMat, ProForDsc FROM TXPCPROFO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(ProForAct = ?)");
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForMat) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ProForTie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProForTmx,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProNumPro,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProNumRec,'99990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(ProForCod = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel)==0) )
      {
         addWhere(sWhereString, "(ProForMat = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie) )
      {
         addWhere(sWhereString, "(ProForTie >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to) )
      {
         addWhere(sWhereString, "(ProForTie <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx) )
      {
         addWhere(sWhereString, "(ProForTmx >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to) )
      {
         addWhere(sWhereString, "(ProForTmx <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro) )
      {
         addWhere(sWhereString, "(ProNumPro >= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to) )
      {
         addWhere(sWhereString, "(ProNumPro <= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec) )
      {
         addWhere(sWhereString, "(ProNumRec >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to) )
      {
         addWhere(sWhereString, "(ProNumRec <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34Proforcodfrom)==0) )
      {
         addWhere(sWhereString, "(ProForCod >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35Proforcodto)==0) )
      {
         addWhere(sWhereString, "(ProForCod <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, ProForCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09ED3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ,
                                          String AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ,
                                          String AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ,
                                          String AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ,
                                          String AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ,
                                          String AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ,
                                          String AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ,
                                          short AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie ,
                                          short AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to ,
                                          short AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx ,
                                          short AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to ,
                                          int AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro ,
                                          int AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to ,
                                          int AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec ,
                                          int AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to ,
                                          String AV34Proforcodfrom ,
                                          String AV35Proforcodto ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A769ProForMat ,
                                          short A771ProForTie ,
                                          short A772ProForTmx ,
                                          int A2392ProNumPro ,
                                          int A2393ProNumRec ,
                                          String A396EmprCod ,
                                          String AV33Emprcod ,
                                          String A13133ProForAct ,
                                          String AV38Proforact )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[25];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, ProForAct, ProForDsc, ProNumRec, ProNumPro, ProForTmx, ProForTie, ProForMat, ProForCod FROM TXPCPROFO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(ProForAct = ?)");
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForMat) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ProForTie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProForTmx,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProNumPro,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProNumRec,'99990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(ProForCod = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel)==0) )
      {
         addWhere(sWhereString, "(ProForMat = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie) )
      {
         addWhere(sWhereString, "(ProForTie >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to) )
      {
         addWhere(sWhereString, "(ProForTie <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx) )
      {
         addWhere(sWhereString, "(ProForTmx >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to) )
      {
         addWhere(sWhereString, "(ProForTmx <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro) )
      {
         addWhere(sWhereString, "(ProNumPro >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to) )
      {
         addWhere(sWhereString, "(ProNumPro <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec) )
      {
         addWhere(sWhereString, "(ProNumRec >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to) )
      {
         addWhere(sWhereString, "(ProNumRec <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34Proforcodfrom)==0) )
      {
         addWhere(sWhereString, "(ProForCod >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35Proforcodto)==0) )
      {
         addWhere(sWhereString, "(ProForCod <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProForDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09ED4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext ,
                                          String AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel ,
                                          String AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod ,
                                          String AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel ,
                                          String AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc ,
                                          String AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel ,
                                          String AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat ,
                                          short AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie ,
                                          short AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to ,
                                          short AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx ,
                                          short AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to ,
                                          int AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro ,
                                          int AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to ,
                                          int AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec ,
                                          int AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to ,
                                          String AV34Proforcodfrom ,
                                          String AV35Proforcodto ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A769ProForMat ,
                                          short A771ProForTie ,
                                          short A772ProForTmx ,
                                          int A2392ProNumPro ,
                                          int A2393ProNumRec ,
                                          String A396EmprCod ,
                                          String AV33Emprcod ,
                                          String A13133ProForAct ,
                                          String AV38Proforact )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[25];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, ProForAct, ProForMat, ProNumRec, ProNumPro, ProForTmx, ProForTie, ProForDsc, ProForCod FROM TXPCPROFO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(ProForAct = ?)");
      if ( ! (GXutil.strcmp("", AV53Formulaciontinte_listadodeprocesosquimicos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(ProForCod) like '%' || UPPER(?)) or ( UPPER(ProForDsc) like '%' || UPPER(?)) or ( UPPER(ProForMat) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ProForTie,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProForTmx,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProNumPro,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ProNumRec,'99990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV54Formulaciontinte_listadodeprocesosquimicos_wcds_2_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55Formulaciontinte_listadodeprocesosquimicos_wcds_3_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(ProForCod = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Formulaciontinte_listadodeprocesosquimicos_wcds_4_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_listadodeprocesosquimicos_wcds_5_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(ProForDsc = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_listadodeprocesosquimicos_wcds_6_tfproformat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ProForMat) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_listadodeprocesosquimicos_wcds_7_tfproformat_sel)==0) )
      {
         addWhere(sWhereString, "(ProForMat = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_listadodeprocesosquimicos_wcds_8_tfprofortie) )
      {
         addWhere(sWhereString, "(ProForTie >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_listadodeprocesosquimicos_wcds_9_tfprofortie_to) )
      {
         addWhere(sWhereString, "(ProForTie <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV62Formulaciontinte_listadodeprocesosquimicos_wcds_10_tfprofortmx) )
      {
         addWhere(sWhereString, "(ProForTmx >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV63Formulaciontinte_listadodeprocesosquimicos_wcds_11_tfprofortmx_to) )
      {
         addWhere(sWhereString, "(ProForTmx <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV64Formulaciontinte_listadodeprocesosquimicos_wcds_12_tfpronumpro) )
      {
         addWhere(sWhereString, "(ProNumPro >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV65Formulaciontinte_listadodeprocesosquimicos_wcds_13_tfpronumpro_to) )
      {
         addWhere(sWhereString, "(ProNumPro <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV66Formulaciontinte_listadodeprocesosquimicos_wcds_14_tfpronumrec) )
      {
         addWhere(sWhereString, "(ProNumRec >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV67Formulaciontinte_listadodeprocesosquimicos_wcds_15_tfpronumrec_to) )
      {
         addWhere(sWhereString, "(ProNumRec <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34Proforcodfrom)==0) )
      {
         addWhere(sWhereString, "(ProForCod >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35Proforcodto)==0) )
      {
         addWhere(sWhereString, "(ProForCod <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ProForMat" ;
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
                  return conditional_P09ED2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 1 :
                  return conditional_P09ED3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
            case 2 :
                  return conditional_P09ED4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09ED2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ED3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09ED4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               return;
      }
   }

}

