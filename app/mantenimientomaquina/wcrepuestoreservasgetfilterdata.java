package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcrepuestoreservasgetfilterdata extends GXProcedure
{
   public wcrepuestoreservasgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcrepuestoreservasgetfilterdata.class ), "" );
   }

   public wcrepuestoreservasgetfilterdata( int remoteHandle ,
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
      wcrepuestoreservasgetfilterdata.this.aP5 = new String[] {""};
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
      wcrepuestoreservasgetfilterdata.this.AV30DDOName = aP0;
      wcrepuestoreservasgetfilterdata.this.AV28SearchTxt = aP1;
      wcrepuestoreservasgetfilterdata.this.AV29SearchTxtTo = aP2;
      wcrepuestoreservasgetfilterdata.this.aP3 = aP3;
      wcrepuestoreservasgetfilterdata.this.aP4 = aP4;
      wcrepuestoreservasgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_MRRESTPOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMRRESTPODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_MRRESDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMRRESDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV34OptionsJson = AV33Options.toJSonString(false) ;
      AV37OptionsDescJson = AV36OptionsDesc.toJSonString(false) ;
      AV39OptionIndexesJson = AV38OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue("MantenimientoMaquina.WCRepuestoReservasGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.WCRepuestoReservasGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("MantenimientoMaquina.WCRepuestoReservasGridState"), null, null);
      }
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV52GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRES") == 0 )
         {
            AV14TFMRRes = GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV15TFMRRes_To = GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESORD") == 0 )
         {
            AV16TFMRResOrd = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV17TFMRResOrd_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESFCH") == 0 )
         {
            AV26TFMRResFch = localUtil.ctot( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESTPO") == 0 )
         {
            AV18TFMRResTpo = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFMRResTpo_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESTPOD") == 0 )
         {
            AV20TFMRResTpoD = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESTPOD_SEL") == 0 )
         {
            AV21TFMRResTpoD_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESDSC") == 0 )
         {
            AV22TFMRResDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESDSC_SEL") == 0 )
         {
            AV23TFMRResDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRRESCNT") == 0 )
         {
            AV24TFMRResCnt = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFMRResCnt_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV47EmprCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRCOD") == 0 )
         {
            AV48MrCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRNOM") == 0 )
         {
            AV49MRNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMRRESTPODOPTIONS' Routine */
      returnInSub = false ;
      AV20TFMRResTpoD = AV28SearchTxt ;
      AV21TFMRResTpoD_Sel = "" ;
      AV54Mantenimientomaquina_wcrepuestoreservasds_1_emprcod = AV47EmprCod ;
      AV55Mantenimientomaquina_wcrepuestoreservasds_2_mrcod = AV48MrCod ;
      AV56Mantenimientomaquina_wcrepuestoreservasds_3_mrnom = AV49MRNom ;
      AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = AV46FilterFullText ;
      AV58Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres = AV14TFMRRes ;
      AV59Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to = AV15TFMRRes_To ;
      AV60Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord = AV16TFMRResOrd ;
      AV61Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to = AV17TFMRResOrd_To ;
      AV62Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch = AV26TFMRResFch ;
      AV63Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo = AV18TFMRResTpo ;
      AV64Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to = AV19TFMRResTpo_To ;
      AV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod = AV20TFMRResTpoD ;
      AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel = AV21TFMRResTpoD_Sel ;
      AV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc = AV22TFMRResDsc ;
      AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel = AV23TFMRResDsc_Sel ;
      AV69Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt = AV24TFMRResCnt ;
      AV70Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to = AV25TFMRResCnt_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext ,
                                           Long.valueOf(AV58Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres) ,
                                           Long.valueOf(AV59Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to) ,
                                           Integer.valueOf(AV60Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord) ,
                                           Integer.valueOf(AV61Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to) ,
                                           AV62Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch ,
                                           Integer.valueOf(AV63Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo) ,
                                           Integer.valueOf(AV64Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to) ,
                                           AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel ,
                                           AV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod ,
                                           AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel ,
                                           AV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc ,
                                           AV69Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt ,
                                           AV70Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to ,
                                           Long.valueOf(A9510MRRes) ,
                                           Integer.valueOf(A9511MRResOrd) ,
                                           Integer.valueOf(A9513MRResTpo) ,
                                           A9514MRResTpoD ,
                                           A9515MRResDsc ,
                                           A9516MRResCnt ,
                                           A9512MRResFch ,
                                           A396EmprCod ,
                                           AV47EmprCod ,
                                           Integer.valueOf(A9492MRCod) ,
                                           Integer.valueOf(AV48MrCod) ,
                                           AV54Mantenimientomaquina_wcrepuestoreservasds_1_emprcod ,
                                           Integer.valueOf(AV55Mantenimientomaquina_wcrepuestoreservasds_2_mrcod) ,
                                           AV56Mantenimientomaquina_wcrepuestoreservasds_3_mrnom ,
                                           A9493MRNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod = GXutil.padr( GXutil.rtrim( AV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod), 30, "%") ;
      lV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc = GXutil.padr( GXutil.rtrim( AV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc), 50, "%") ;
      /* Using cursor P08Q02 */
      pr_default.execute(0, new Object[] {AV54Mantenimientomaquina_wcrepuestoreservasds_1_emprcod, Integer.valueOf(AV55Mantenimientomaquina_wcrepuestoreservasds_2_mrcod), AV56Mantenimientomaquina_wcrepuestoreservasds_3_mrnom, AV47EmprCod, Integer.valueOf(AV48MrCod), lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, Long.valueOf(AV58Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres), Long.valueOf(AV59Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to), Integer.valueOf(AV60Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord), Integer.valueOf(AV61Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to), AV62Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch, Integer.valueOf(AV63Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo), Integer.valueOf(AV64Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to), lV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod, AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel, lV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc, AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel, AV69Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt, AV70Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8Q02 = false ;
         A396EmprCod = P08Q02_A396EmprCod[0] ;
         A9492MRCod = P08Q02_A9492MRCod[0] ;
         A9493MRNom = P08Q02_A9493MRNom[0] ;
         n9493MRNom = P08Q02_n9493MRNom[0] ;
         A9513MRResTpo = P08Q02_A9513MRResTpo[0] ;
         A9516MRResCnt = P08Q02_A9516MRResCnt[0] ;
         A9515MRResDsc = P08Q02_A9515MRResDsc[0] ;
         A9514MRResTpoD = P08Q02_A9514MRResTpoD[0] ;
         n9514MRResTpoD = P08Q02_n9514MRResTpoD[0] ;
         A9512MRResFch = P08Q02_A9512MRResFch[0] ;
         A9511MRResOrd = P08Q02_A9511MRResOrd[0] ;
         A9510MRRes = P08Q02_A9510MRRes[0] ;
         A9493MRNom = P08Q02_A9493MRNom[0] ;
         n9493MRNom = P08Q02_n9493MRNom[0] ;
         A9514MRResTpoD = P08Q02_A9514MRResTpoD[0] ;
         n9514MRResTpoD = P08Q02_n9514MRResTpoD[0] ;
         W9493MRNom = A9493MRNom ;
         n9493MRNom = false ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08Q02_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08Q02_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(P08Q02_A9493MRNom[0], A9493MRNom) == 0 ) && ( P08Q02_A9513MRResTpo[0] == A9513MRResTpo ) )
         {
            brk8Q02 = false ;
            A9510MRRes = P08Q02_A9510MRRes[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8Q02 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A9514MRResTpoD)==0) )
         {
            AV32Option = A9514MRResTpoD ;
            AV31InsertIndex = 1 ;
            while ( ( AV31InsertIndex <= AV33Options.size() ) && ( GXutil.strcmp((String)AV33Options.elementAt(-1+AV31InsertIndex), AV32Option) < 0 ) )
            {
               AV31InsertIndex = (int)(AV31InsertIndex+1) ;
            }
            AV33Options.add(AV32Option, AV31InsertIndex);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), AV31InsertIndex);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A9493MRNom = W9493MRNom ;
         n9493MRNom = false ;
         if ( ! brk8Q02 )
         {
            brk8Q02 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMRRESDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFMRResDsc = AV28SearchTxt ;
      AV23TFMRResDsc_Sel = "" ;
      AV54Mantenimientomaquina_wcrepuestoreservasds_1_emprcod = AV47EmprCod ;
      AV55Mantenimientomaquina_wcrepuestoreservasds_2_mrcod = AV48MrCod ;
      AV56Mantenimientomaquina_wcrepuestoreservasds_3_mrnom = AV49MRNom ;
      AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = AV46FilterFullText ;
      AV58Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres = AV14TFMRRes ;
      AV59Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to = AV15TFMRRes_To ;
      AV60Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord = AV16TFMRResOrd ;
      AV61Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to = AV17TFMRResOrd_To ;
      AV62Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch = AV26TFMRResFch ;
      AV63Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo = AV18TFMRResTpo ;
      AV64Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to = AV19TFMRResTpo_To ;
      AV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod = AV20TFMRResTpoD ;
      AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel = AV21TFMRResTpoD_Sel ;
      AV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc = AV22TFMRResDsc ;
      AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel = AV23TFMRResDsc_Sel ;
      AV69Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt = AV24TFMRResCnt ;
      AV70Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to = AV25TFMRResCnt_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext ,
                                           Long.valueOf(AV58Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres) ,
                                           Long.valueOf(AV59Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to) ,
                                           Integer.valueOf(AV60Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord) ,
                                           Integer.valueOf(AV61Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to) ,
                                           AV62Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch ,
                                           Integer.valueOf(AV63Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo) ,
                                           Integer.valueOf(AV64Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to) ,
                                           AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel ,
                                           AV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod ,
                                           AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel ,
                                           AV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc ,
                                           AV69Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt ,
                                           AV70Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to ,
                                           Long.valueOf(A9510MRRes) ,
                                           Integer.valueOf(A9511MRResOrd) ,
                                           Integer.valueOf(A9513MRResTpo) ,
                                           A9514MRResTpoD ,
                                           A9515MRResDsc ,
                                           A9516MRResCnt ,
                                           A9512MRResFch ,
                                           A396EmprCod ,
                                           AV47EmprCod ,
                                           Integer.valueOf(A9492MRCod) ,
                                           Integer.valueOf(AV48MrCod) ,
                                           AV54Mantenimientomaquina_wcrepuestoreservasds_1_emprcod ,
                                           Integer.valueOf(AV55Mantenimientomaquina_wcrepuestoreservasds_2_mrcod) ,
                                           AV56Mantenimientomaquina_wcrepuestoreservasds_3_mrnom ,
                                           A9493MRNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext), "%", "") ;
      lV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod = GXutil.padr( GXutil.rtrim( AV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod), 30, "%") ;
      lV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc = GXutil.padr( GXutil.rtrim( AV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc), 50, "%") ;
      /* Using cursor P08Q03 */
      pr_default.execute(1, new Object[] {AV54Mantenimientomaquina_wcrepuestoreservasds_1_emprcod, Integer.valueOf(AV55Mantenimientomaquina_wcrepuestoreservasds_2_mrcod), AV56Mantenimientomaquina_wcrepuestoreservasds_3_mrnom, AV47EmprCod, Integer.valueOf(AV48MrCod), lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext, Long.valueOf(AV58Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres), Long.valueOf(AV59Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to), Integer.valueOf(AV60Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord), Integer.valueOf(AV61Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to), AV62Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch, Integer.valueOf(AV63Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo), Integer.valueOf(AV64Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to), lV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod, AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel, lV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc, AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel, AV69Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt, AV70Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8Q04 = false ;
         A396EmprCod = P08Q03_A396EmprCod[0] ;
         A9492MRCod = P08Q03_A9492MRCod[0] ;
         A9493MRNom = P08Q03_A9493MRNom[0] ;
         n9493MRNom = P08Q03_n9493MRNom[0] ;
         A9515MRResDsc = P08Q03_A9515MRResDsc[0] ;
         A9516MRResCnt = P08Q03_A9516MRResCnt[0] ;
         A9514MRResTpoD = P08Q03_A9514MRResTpoD[0] ;
         n9514MRResTpoD = P08Q03_n9514MRResTpoD[0] ;
         A9513MRResTpo = P08Q03_A9513MRResTpo[0] ;
         A9512MRResFch = P08Q03_A9512MRResFch[0] ;
         A9511MRResOrd = P08Q03_A9511MRResOrd[0] ;
         A9510MRRes = P08Q03_A9510MRRes[0] ;
         A9493MRNom = P08Q03_A9493MRNom[0] ;
         n9493MRNom = P08Q03_n9493MRNom[0] ;
         A9514MRResTpoD = P08Q03_A9514MRResTpoD[0] ;
         n9514MRResTpoD = P08Q03_n9514MRResTpoD[0] ;
         W9493MRNom = A9493MRNom ;
         n9493MRNom = false ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08Q03_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08Q03_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(P08Q03_A9493MRNom[0], A9493MRNom) == 0 ) && ( GXutil.strcmp(P08Q03_A9515MRResDsc[0], A9515MRResDsc) == 0 ) )
         {
            brk8Q04 = false ;
            A9510MRRes = P08Q03_A9510MRRes[0] ;
            AV40count = (long)(AV40count+1) ;
            brk8Q04 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A9515MRResDsc)==0) )
         {
            AV32Option = A9515MRResDsc ;
            AV33Options.add(AV32Option, 0);
            AV38OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV40count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV33Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A9493MRNom = W9493MRNom ;
         n9493MRNom = false ;
         if ( ! brk8Q04 )
         {
            brk8Q04 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcrepuestoreservasgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = wcrepuestoreservasgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = wcrepuestoreservasgetfilterdata.this.AV39OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34OptionsJson = "" ;
      AV37OptionsDescJson = "" ;
      AV39OptionIndexesJson = "" ;
      AV33Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV36OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV46FilterFullText = "" ;
      AV26TFMRResFch = GXutil.resetTime( GXutil.nullDate() );
      AV20TFMRResTpoD = "" ;
      AV21TFMRResTpoD_Sel = "" ;
      AV22TFMRResDsc = "" ;
      AV23TFMRResDsc_Sel = "" ;
      AV24TFMRResCnt = DecimalUtil.ZERO ;
      AV25TFMRResCnt_To = DecimalUtil.ZERO ;
      AV47EmprCod = "" ;
      AV49MRNom = "" ;
      A9514MRResTpoD = "" ;
      AV54Mantenimientomaquina_wcrepuestoreservasds_1_emprcod = "" ;
      AV56Mantenimientomaquina_wcrepuestoreservasds_3_mrnom = "" ;
      AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = "" ;
      AV62Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch = GXutil.resetTime( GXutil.nullDate() );
      AV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod = "" ;
      AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel = "" ;
      AV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc = "" ;
      AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel = "" ;
      AV69Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt = DecimalUtil.ZERO ;
      AV70Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext = "" ;
      lV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod = "" ;
      lV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc = "" ;
      A9515MRResDsc = "" ;
      A9516MRResCnt = DecimalUtil.ZERO ;
      A9512MRResFch = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A9493MRNom = "" ;
      P08Q02_A396EmprCod = new String[] {""} ;
      P08Q02_A9492MRCod = new int[1] ;
      P08Q02_A9493MRNom = new String[] {""} ;
      P08Q02_n9493MRNom = new boolean[] {false} ;
      P08Q02_A9513MRResTpo = new int[1] ;
      P08Q02_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q02_A9515MRResDsc = new String[] {""} ;
      P08Q02_A9514MRResTpoD = new String[] {""} ;
      P08Q02_n9514MRResTpoD = new boolean[] {false} ;
      P08Q02_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q02_A9511MRResOrd = new int[1] ;
      P08Q02_A9510MRRes = new long[1] ;
      W9493MRNom = "" ;
      AV32Option = "" ;
      P08Q03_A396EmprCod = new String[] {""} ;
      P08Q03_A9492MRCod = new int[1] ;
      P08Q03_A9493MRNom = new String[] {""} ;
      P08Q03_n9493MRNom = new boolean[] {false} ;
      P08Q03_A9515MRResDsc = new String[] {""} ;
      P08Q03_A9516MRResCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08Q03_A9514MRResTpoD = new String[] {""} ;
      P08Q03_n9514MRResTpoD = new boolean[] {false} ;
      P08Q03_A9513MRResTpo = new int[1] ;
      P08Q03_A9512MRResFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08Q03_A9511MRResOrd = new int[1] ;
      P08Q03_A9510MRRes = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.wcrepuestoreservasgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08Q02_A396EmprCod, P08Q02_A9492MRCod, P08Q02_A9493MRNom, P08Q02_n9493MRNom, P08Q02_A9513MRResTpo, P08Q02_A9516MRResCnt, P08Q02_A9515MRResDsc, P08Q02_A9514MRResTpoD, P08Q02_n9514MRResTpoD, P08Q02_A9512MRResFch,
            P08Q02_A9511MRResOrd, P08Q02_A9510MRRes
            }
            , new Object[] {
            P08Q03_A396EmprCod, P08Q03_A9492MRCod, P08Q03_A9493MRNom, P08Q03_n9493MRNom, P08Q03_A9515MRResDsc, P08Q03_A9516MRResCnt, P08Q03_A9514MRResTpoD, P08Q03_n9514MRResTpoD, P08Q03_A9513MRResTpo, P08Q03_A9512MRResFch,
            P08Q03_A9511MRResOrd, P08Q03_A9510MRRes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV52GXV1 ;
   private int AV16TFMRResOrd ;
   private int AV17TFMRResOrd_To ;
   private int AV18TFMRResTpo ;
   private int AV19TFMRResTpo_To ;
   private int AV48MrCod ;
   private int AV55Mantenimientomaquina_wcrepuestoreservasds_2_mrcod ;
   private int AV60Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord ;
   private int AV61Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to ;
   private int AV63Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo ;
   private int AV64Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to ;
   private int A9511MRResOrd ;
   private int A9513MRResTpo ;
   private int A9492MRCod ;
   private int AV31InsertIndex ;
   private long AV14TFMRRes ;
   private long AV15TFMRRes_To ;
   private long AV58Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres ;
   private long AV59Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to ;
   private long A9510MRRes ;
   private long AV40count ;
   private java.math.BigDecimal AV24TFMRResCnt ;
   private java.math.BigDecimal AV25TFMRResCnt_To ;
   private java.math.BigDecimal AV69Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt ;
   private java.math.BigDecimal AV70Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to ;
   private java.math.BigDecimal A9516MRResCnt ;
   private String AV20TFMRResTpoD ;
   private String AV21TFMRResTpoD_Sel ;
   private String AV22TFMRResDsc ;
   private String AV23TFMRResDsc_Sel ;
   private String AV47EmprCod ;
   private String AV49MRNom ;
   private String A9514MRResTpoD ;
   private String AV54Mantenimientomaquina_wcrepuestoreservasds_1_emprcod ;
   private String AV56Mantenimientomaquina_wcrepuestoreservasds_3_mrnom ;
   private String AV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod ;
   private String AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel ;
   private String AV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc ;
   private String AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel ;
   private String scmdbuf ;
   private String lV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod ;
   private String lV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc ;
   private String A9515MRResDsc ;
   private String A396EmprCod ;
   private String A9493MRNom ;
   private String W9493MRNom ;
   private java.util.Date AV26TFMRResFch ;
   private java.util.Date AV62Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch ;
   private java.util.Date A9512MRResFch ;
   private boolean returnInSub ;
   private boolean brk8Q02 ;
   private boolean n9493MRNom ;
   private boolean n9514MRResTpoD ;
   private boolean brk8Q04 ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext ;
   private String lV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08Q02_A396EmprCod ;
   private int[] P08Q02_A9492MRCod ;
   private String[] P08Q02_A9493MRNom ;
   private boolean[] P08Q02_n9493MRNom ;
   private int[] P08Q02_A9513MRResTpo ;
   private java.math.BigDecimal[] P08Q02_A9516MRResCnt ;
   private String[] P08Q02_A9515MRResDsc ;
   private String[] P08Q02_A9514MRResTpoD ;
   private boolean[] P08Q02_n9514MRResTpoD ;
   private java.util.Date[] P08Q02_A9512MRResFch ;
   private int[] P08Q02_A9511MRResOrd ;
   private long[] P08Q02_A9510MRRes ;
   private String[] P08Q03_A396EmprCod ;
   private int[] P08Q03_A9492MRCod ;
   private String[] P08Q03_A9493MRNom ;
   private boolean[] P08Q03_n9493MRNom ;
   private String[] P08Q03_A9515MRResDsc ;
   private java.math.BigDecimal[] P08Q03_A9516MRResCnt ;
   private String[] P08Q03_A9514MRResTpoD ;
   private boolean[] P08Q03_n9514MRResTpoD ;
   private int[] P08Q03_A9513MRResTpo ;
   private java.util.Date[] P08Q03_A9512MRResFch ;
   private int[] P08Q03_A9511MRResOrd ;
   private long[] P08Q03_A9510MRRes ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class wcrepuestoreservasgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08Q02( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext ,
                                          long AV58Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres ,
                                          long AV59Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to ,
                                          int AV60Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord ,
                                          int AV61Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to ,
                                          java.util.Date AV62Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch ,
                                          int AV63Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo ,
                                          int AV64Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to ,
                                          String AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel ,
                                          String AV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod ,
                                          String AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel ,
                                          String AV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc ,
                                          java.math.BigDecimal AV69Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt ,
                                          java.math.BigDecimal AV70Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to ,
                                          long A9510MRRes ,
                                          int A9511MRResOrd ,
                                          int A9513MRResTpo ,
                                          String A9514MRResTpoD ,
                                          String A9515MRResDsc ,
                                          java.math.BigDecimal A9516MRResCnt ,
                                          java.util.Date A9512MRResFch ,
                                          String A396EmprCod ,
                                          String AV47EmprCod ,
                                          int A9492MRCod ,
                                          int AV48MrCod ,
                                          String AV54Mantenimientomaquina_wcrepuestoreservasds_1_emprcod ,
                                          int AV55Mantenimientomaquina_wcrepuestoreservasds_2_mrcod ,
                                          String AV56Mantenimientomaquina_wcrepuestoreservasds_3_mrnom ,
                                          String A9493MRNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResTpo AS MRResTpo, T1.MRResCnt, T1.MRResDsc, T3.MTMovNom AS MRResTpoD, T1.MRResFch, T1.MRResOrd, T1.MRRes FROM ((TXPMReRes" ;
      scmdbuf += " T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMTPOMO T3 ON T3.EmprCod = T1.EmprCod AND T3.MTMovCod = T1.MRResTpo)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRCod = ? and T2.MRNom = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MRCod = ?)");
      if ( ! (GXutil.strcmp("", AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MRRes,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRResOrd,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRResTpo,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MTMovNom) like '%' || UPPER(?)) or ( UPPER(T1.MRResDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRResCnt,'999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV58Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres) )
      {
         addWhere(sWhereString, "(T1.MRRes >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV59Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to) )
      {
         addWhere(sWhereString, "(T1.MRRes <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord) )
      {
         addWhere(sWhereString, "(T1.MRResOrd >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to) )
      {
         addWhere(sWhereString, "(T1.MRResOrd <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV62Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch) )
      {
         addWhere(sWhereString, "(T1.MRResFch >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV63Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo) )
      {
         addWhere(sWhereString, "(T1.MRResTpo >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV64Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to) )
      {
         addWhere(sWhereString, "(T1.MRResTpo <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel)==0) && ( ! (GXutil.strcmp("", AV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MTMovNom = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRResDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRResDsc = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt)==0) )
      {
         addWhere(sWhereString, "(T1.MRResCnt >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRResCnt <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResTpo" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08Q03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext ,
                                          long AV58Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres ,
                                          long AV59Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to ,
                                          int AV60Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord ,
                                          int AV61Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to ,
                                          java.util.Date AV62Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch ,
                                          int AV63Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo ,
                                          int AV64Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to ,
                                          String AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel ,
                                          String AV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod ,
                                          String AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel ,
                                          String AV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc ,
                                          java.math.BigDecimal AV69Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt ,
                                          java.math.BigDecimal AV70Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to ,
                                          long A9510MRRes ,
                                          int A9511MRResOrd ,
                                          int A9513MRResTpo ,
                                          String A9514MRResTpoD ,
                                          String A9515MRResDsc ,
                                          java.math.BigDecimal A9516MRResCnt ,
                                          java.util.Date A9512MRResFch ,
                                          String A396EmprCod ,
                                          String AV47EmprCod ,
                                          int A9492MRCod ,
                                          int AV48MrCod ,
                                          String AV54Mantenimientomaquina_wcrepuestoreservasds_1_emprcod ,
                                          int AV55Mantenimientomaquina_wcrepuestoreservasds_2_mrcod ,
                                          String AV56Mantenimientomaquina_wcrepuestoreservasds_3_mrnom ,
                                          String A9493MRNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[24];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResDsc, T1.MRResCnt, T3.MTMovNom AS MRResTpoD, T1.MRResTpo AS MRResTpo, T1.MRResFch, T1.MRResOrd, T1.MRRes FROM ((TXPMReRes" ;
      scmdbuf += " T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMTPOMO T3 ON T3.EmprCod = T1.EmprCod AND T3.MTMovCod = T1.MRResTpo)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRCod = ? and T2.MRNom = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MRCod = ?)");
      if ( ! (GXutil.strcmp("", AV57Mantenimientomaquina_wcrepuestoreservasds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MRRes,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRResOrd,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRResTpo,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MTMovNom) like '%' || UPPER(?)) or ( UPPER(T1.MRResDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRResCnt,'999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV58Mantenimientomaquina_wcrepuestoreservasds_5_tfmrres) )
      {
         addWhere(sWhereString, "(T1.MRRes >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV59Mantenimientomaquina_wcrepuestoreservasds_6_tfmrres_to) )
      {
         addWhere(sWhereString, "(T1.MRRes <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Mantenimientomaquina_wcrepuestoreservasds_7_tfmrresord) )
      {
         addWhere(sWhereString, "(T1.MRResOrd >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Mantenimientomaquina_wcrepuestoreservasds_8_tfmrresord_to) )
      {
         addWhere(sWhereString, "(T1.MRResOrd <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV62Mantenimientomaquina_wcrepuestoreservasds_9_tfmrresfch) )
      {
         addWhere(sWhereString, "(T1.MRResFch >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV63Mantenimientomaquina_wcrepuestoreservasds_10_tfmrrestpo) )
      {
         addWhere(sWhereString, "(T1.MRResTpo >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV64Mantenimientomaquina_wcrepuestoreservasds_11_tfmrrestpo_to) )
      {
         addWhere(sWhereString, "(T1.MRResTpo <= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel)==0) && ( ! (GXutil.strcmp("", AV65Mantenimientomaquina_wcrepuestoreservasds_12_tfmrrestpod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Mantenimientomaquina_wcrepuestoreservasds_13_tfmrrestpod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MTMovNom = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Mantenimientomaquina_wcrepuestoreservasds_14_tfmrresdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRResDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Mantenimientomaquina_wcrepuestoreservasds_15_tfmrresdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRResDsc = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Mantenimientomaquina_wcrepuestoreservasds_16_tfmrrescnt)==0) )
      {
         addWhere(sWhereString, "(T1.MRResCnt >= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Mantenimientomaquina_wcrepuestoreservasds_17_tfmrrescnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRResCnt <= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRResDsc" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
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
                  return conditional_P08Q02(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] );
            case 1 :
                  return conditional_P08Q03(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08Q02", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08Q03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[6])[0] = rslt.getString(6, 50);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((long[]) buf[11])[0] = rslt.getLong(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 50);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((long[]) buf[11])[0] = rslt.getLong(10);
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
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 50);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 50);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
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
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 50);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 50);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 3);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               return;
      }
   }

}

