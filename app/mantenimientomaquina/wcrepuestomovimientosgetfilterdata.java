package app.mantenimientomaquina ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcrepuestomovimientosgetfilterdata extends GXProcedure
{
   public wcrepuestomovimientosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcrepuestomovimientosgetfilterdata.class ), "" );
   }

   public wcrepuestomovimientosgetfilterdata( int remoteHandle ,
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
      wcrepuestomovimientosgetfilterdata.this.aP5 = new String[] {""};
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
      wcrepuestomovimientosgetfilterdata.this.AV36DDOName = aP0;
      wcrepuestomovimientosgetfilterdata.this.AV34SearchTxt = aP1;
      wcrepuestomovimientosgetfilterdata.this.AV35SearchTxtTo = aP2;
      wcrepuestomovimientosgetfilterdata.this.aP3 = aP3;
      wcrepuestomovimientosgetfilterdata.this.aP4 = aP4;
      wcrepuestomovimientosgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_MRMOVTPOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMRMOVTPODOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_MRMOVDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADMRMOVDSCOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV40OptionsJson = AV39Options.toJSonString(false) ;
      AV43OptionsDescJson = AV42OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV44OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV47Session.getValue("MantenimientoMaquina.WCRepuestoMovimientosGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientoMaquina.WCRepuestoMovimientosGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("MantenimientoMaquina.WCRepuestoMovimientosGridState"), null, null);
      }
      AV61GXV1 = 1 ;
      while ( AV61GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV52FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOV") == 0 )
         {
            AV18TFMRMov = GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV19TFMRMov_To = GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVORD") == 0 )
         {
            AV20TFMRMovOrd = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFMRMovOrd_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVFCH") == 0 )
         {
            AV22TFMRMovFch = localUtil.ctot( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPO") == 0 )
         {
            AV24TFMRMovTpo = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFMRMovTpo_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPOD") == 0 )
         {
            AV26TFMRMovTpoD = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVTPOD_SEL") == 0 )
         {
            AV27TFMRMovTpoD_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVDSC") == 0 )
         {
            AV28TFMRMovDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVDSC_SEL") == 0 )
         {
            AV29TFMRMovDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVCNT") == 0 )
         {
            AV30TFMRMovCnt = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFMRMovCnt_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRMOVPRE") == 0 )
         {
            AV32TFMRMovPre = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV33TFMRMovPre_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV53EmprCod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRCOD") == 0 )
         {
            AV54MRCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MRNOM") == 0 )
         {
            AV56MRNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV61GXV1 = (int)(AV61GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMRMOVTPODOPTIONS' Routine */
      returnInSub = false ;
      AV26TFMRMovTpoD = AV34SearchTxt ;
      AV27TFMRMovTpoD_Sel = "" ;
      AV63Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod = AV53EmprCod ;
      AV64Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod = AV54MRCod ;
      AV65Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom = AV56MRNom ;
      AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = AV52FilterFullText ;
      AV67Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov = AV18TFMRMov ;
      AV68Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to = AV19TFMRMov_To ;
      AV69Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord = AV20TFMRMovOrd ;
      AV70Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to = AV21TFMRMovOrd_To ;
      AV71Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch = AV22TFMRMovFch ;
      AV72Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo = AV24TFMRMovTpo ;
      AV73Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to = AV25TFMRMovTpo_To ;
      AV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = AV26TFMRMovTpoD ;
      AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel = AV27TFMRMovTpoD_Sel ;
      AV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = AV28TFMRMovDsc ;
      AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel = AV29TFMRMovDsc_Sel ;
      AV78Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt = AV30TFMRMovCnt ;
      AV79Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to = AV31TFMRMovCnt_To ;
      AV80Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre = AV32TFMRMovPre ;
      AV81Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to = AV33TFMRMovPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext ,
                                           Long.valueOf(AV67Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov) ,
                                           Long.valueOf(AV68Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to) ,
                                           Integer.valueOf(AV69Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord) ,
                                           Integer.valueOf(AV70Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to) ,
                                           AV71Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch ,
                                           Integer.valueOf(AV72Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo) ,
                                           Integer.valueOf(AV73Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to) ,
                                           AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                           AV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod ,
                                           AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                           AV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc ,
                                           AV78Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt ,
                                           AV79Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                           AV80Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre ,
                                           AV81Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                           Long.valueOf(A9502MRMov) ,
                                           Integer.valueOf(A9503MRMovOrd) ,
                                           Integer.valueOf(A9505MRMovTpo) ,
                                           A9506MRMovTpoD ,
                                           A9507MRMovDsc ,
                                           A9508MRMovCnt ,
                                           A9509MRMovPre ,
                                           A9504MRMovFch ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           Integer.valueOf(A9492MRCod) ,
                                           Integer.valueOf(AV54MRCod) ,
                                           AV63Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod ,
                                           Integer.valueOf(AV64Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod) ,
                                           AV65Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom ,
                                           A9493MRNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = GXutil.padr( GXutil.rtrim( AV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod), 30, "%") ;
      lV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = GXutil.padr( GXutil.rtrim( AV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc), 30, "%") ;
      /* Using cursor P08PZ2 */
      pr_default.execute(0, new Object[] {AV63Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod, Integer.valueOf(AV64Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod), AV65Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom, AV53EmprCod, Integer.valueOf(AV54MRCod), lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, Long.valueOf(AV67Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov), Long.valueOf(AV68Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to), Integer.valueOf(AV69Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord), Integer.valueOf(AV70Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to), AV71Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch, Integer.valueOf(AV72Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo), Integer.valueOf(AV73Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to), lV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod, AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel, lV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc, AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel, AV78Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt, AV79Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to, AV80Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre, AV81Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8PZ2 = false ;
         A396EmprCod = P08PZ2_A396EmprCod[0] ;
         A9492MRCod = P08PZ2_A9492MRCod[0] ;
         A9493MRNom = P08PZ2_A9493MRNom[0] ;
         n9493MRNom = P08PZ2_n9493MRNom[0] ;
         A9506MRMovTpoD = P08PZ2_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = P08PZ2_n9506MRMovTpoD[0] ;
         A9509MRMovPre = P08PZ2_A9509MRMovPre[0] ;
         A9508MRMovCnt = P08PZ2_A9508MRMovCnt[0] ;
         A9507MRMovDsc = P08PZ2_A9507MRMovDsc[0] ;
         A9505MRMovTpo = P08PZ2_A9505MRMovTpo[0] ;
         A9504MRMovFch = P08PZ2_A9504MRMovFch[0] ;
         A9503MRMovOrd = P08PZ2_A9503MRMovOrd[0] ;
         A9502MRMov = P08PZ2_A9502MRMov[0] ;
         A9493MRNom = P08PZ2_A9493MRNom[0] ;
         n9493MRNom = P08PZ2_n9493MRNom[0] ;
         A9506MRMovTpoD = P08PZ2_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = P08PZ2_n9506MRMovTpoD[0] ;
         W9493MRNom = A9493MRNom ;
         n9493MRNom = false ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08PZ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08PZ2_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(P08PZ2_A9493MRNom[0], A9493MRNom) == 0 ) && ( GXutil.strcmp(P08PZ2_A9506MRMovTpoD[0], A9506MRMovTpoD) == 0 ) )
         {
            brk8PZ2 = false ;
            A9505MRMovTpo = P08PZ2_A9505MRMovTpo[0] ;
            A9502MRMov = P08PZ2_A9502MRMov[0] ;
            AV46count = (long)(AV46count+1) ;
            brk8PZ2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A9506MRMovTpoD)==0) )
         {
            AV38Option = A9506MRMovTpoD ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A9493MRNom = W9493MRNom ;
         n9493MRNom = false ;
         if ( ! brk8PZ2 )
         {
            brk8PZ2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADMRMOVDSCOPTIONS' Routine */
      returnInSub = false ;
      AV28TFMRMovDsc = AV34SearchTxt ;
      AV29TFMRMovDsc_Sel = "" ;
      AV63Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod = AV53EmprCod ;
      AV64Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod = AV54MRCod ;
      AV65Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom = AV56MRNom ;
      AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = AV52FilterFullText ;
      AV67Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov = AV18TFMRMov ;
      AV68Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to = AV19TFMRMov_To ;
      AV69Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord = AV20TFMRMovOrd ;
      AV70Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to = AV21TFMRMovOrd_To ;
      AV71Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch = AV22TFMRMovFch ;
      AV72Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo = AV24TFMRMovTpo ;
      AV73Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to = AV25TFMRMovTpo_To ;
      AV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = AV26TFMRMovTpoD ;
      AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel = AV27TFMRMovTpoD_Sel ;
      AV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = AV28TFMRMovDsc ;
      AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel = AV29TFMRMovDsc_Sel ;
      AV78Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt = AV30TFMRMovCnt ;
      AV79Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to = AV31TFMRMovCnt_To ;
      AV80Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre = AV32TFMRMovPre ;
      AV81Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to = AV33TFMRMovPre_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext ,
                                           Long.valueOf(AV67Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov) ,
                                           Long.valueOf(AV68Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to) ,
                                           Integer.valueOf(AV69Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord) ,
                                           Integer.valueOf(AV70Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to) ,
                                           AV71Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch ,
                                           Integer.valueOf(AV72Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo) ,
                                           Integer.valueOf(AV73Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to) ,
                                           AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                           AV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod ,
                                           AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                           AV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc ,
                                           AV78Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt ,
                                           AV79Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                           AV80Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre ,
                                           AV81Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                           Long.valueOf(A9502MRMov) ,
                                           Integer.valueOf(A9503MRMovOrd) ,
                                           Integer.valueOf(A9505MRMovTpo) ,
                                           A9506MRMovTpoD ,
                                           A9507MRMovDsc ,
                                           A9508MRMovCnt ,
                                           A9509MRMovPre ,
                                           A9504MRMovFch ,
                                           A396EmprCod ,
                                           AV53EmprCod ,
                                           Integer.valueOf(A9492MRCod) ,
                                           Integer.valueOf(AV54MRCod) ,
                                           AV63Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod ,
                                           Integer.valueOf(AV64Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod) ,
                                           AV65Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom ,
                                           A9493MRNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = GXutil.concat( GXutil.rtrim( AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext), "%", "") ;
      lV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = GXutil.padr( GXutil.rtrim( AV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod), 30, "%") ;
      lV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = GXutil.padr( GXutil.rtrim( AV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc), 30, "%") ;
      /* Using cursor P08PZ3 */
      pr_default.execute(1, new Object[] {AV63Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod, Integer.valueOf(AV64Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod), AV65Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom, AV53EmprCod, Integer.valueOf(AV54MRCod), lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext, Long.valueOf(AV67Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov), Long.valueOf(AV68Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to), Integer.valueOf(AV69Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord), Integer.valueOf(AV70Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to), AV71Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch, Integer.valueOf(AV72Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo), Integer.valueOf(AV73Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to), lV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod, AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel, lV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc, AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel, AV78Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt, AV79Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to, AV80Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre, AV81Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8PZ4 = false ;
         A396EmprCod = P08PZ3_A396EmprCod[0] ;
         A9492MRCod = P08PZ3_A9492MRCod[0] ;
         A9493MRNom = P08PZ3_A9493MRNom[0] ;
         n9493MRNom = P08PZ3_n9493MRNom[0] ;
         A9507MRMovDsc = P08PZ3_A9507MRMovDsc[0] ;
         A9509MRMovPre = P08PZ3_A9509MRMovPre[0] ;
         A9508MRMovCnt = P08PZ3_A9508MRMovCnt[0] ;
         A9506MRMovTpoD = P08PZ3_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = P08PZ3_n9506MRMovTpoD[0] ;
         A9505MRMovTpo = P08PZ3_A9505MRMovTpo[0] ;
         A9504MRMovFch = P08PZ3_A9504MRMovFch[0] ;
         A9503MRMovOrd = P08PZ3_A9503MRMovOrd[0] ;
         A9502MRMov = P08PZ3_A9502MRMov[0] ;
         A9493MRNom = P08PZ3_A9493MRNom[0] ;
         n9493MRNom = P08PZ3_n9493MRNom[0] ;
         A9506MRMovTpoD = P08PZ3_A9506MRMovTpoD[0] ;
         n9506MRMovTpoD = P08PZ3_n9506MRMovTpoD[0] ;
         W9493MRNom = A9493MRNom ;
         n9493MRNom = false ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08PZ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08PZ3_A9492MRCod[0] == A9492MRCod ) && ( GXutil.strcmp(P08PZ3_A9493MRNom[0], A9493MRNom) == 0 ) && ( GXutil.strcmp(P08PZ3_A9507MRMovDsc[0], A9507MRMovDsc) == 0 ) )
         {
            brk8PZ4 = false ;
            A9502MRMov = P08PZ3_A9502MRMov[0] ;
            AV46count = (long)(AV46count+1) ;
            brk8PZ4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A9507MRMovDsc)==0) )
         {
            AV38Option = A9507MRMovDsc ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         A9493MRNom = W9493MRNom ;
         n9493MRNom = false ;
         if ( ! brk8PZ4 )
         {
            brk8PZ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcrepuestomovimientosgetfilterdata.this.AV40OptionsJson;
      this.aP4[0] = wcrepuestomovimientosgetfilterdata.this.AV43OptionsDescJson;
      this.aP5[0] = wcrepuestomovimientosgetfilterdata.this.AV45OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40OptionsJson = "" ;
      AV43OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47Session = httpContext.getWebSession();
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52FilterFullText = "" ;
      AV22TFMRMovFch = GXutil.resetTime( GXutil.nullDate() );
      AV26TFMRMovTpoD = "" ;
      AV27TFMRMovTpoD_Sel = "" ;
      AV28TFMRMovDsc = "" ;
      AV29TFMRMovDsc_Sel = "" ;
      AV30TFMRMovCnt = DecimalUtil.ZERO ;
      AV31TFMRMovCnt_To = DecimalUtil.ZERO ;
      AV32TFMRMovPre = DecimalUtil.ZERO ;
      AV33TFMRMovPre_To = DecimalUtil.ZERO ;
      AV53EmprCod = "" ;
      AV56MRNom = "" ;
      A9506MRMovTpoD = "" ;
      AV63Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod = "" ;
      AV65Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom = "" ;
      AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = "" ;
      AV71Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch = GXutil.resetTime( GXutil.nullDate() );
      AV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = "" ;
      AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel = "" ;
      AV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = "" ;
      AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel = "" ;
      AV78Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt = DecimalUtil.ZERO ;
      AV79Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to = DecimalUtil.ZERO ;
      AV80Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre = DecimalUtil.ZERO ;
      AV81Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext = "" ;
      lV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod = "" ;
      lV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc = "" ;
      A9507MRMovDsc = "" ;
      A9508MRMovCnt = DecimalUtil.ZERO ;
      A9509MRMovPre = DecimalUtil.ZERO ;
      A9504MRMovFch = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A9493MRNom = "" ;
      P08PZ2_A396EmprCod = new String[] {""} ;
      P08PZ2_A9492MRCod = new int[1] ;
      P08PZ2_A9493MRNom = new String[] {""} ;
      P08PZ2_n9493MRNom = new boolean[] {false} ;
      P08PZ2_A9506MRMovTpoD = new String[] {""} ;
      P08PZ2_n9506MRMovTpoD = new boolean[] {false} ;
      P08PZ2_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PZ2_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PZ2_A9507MRMovDsc = new String[] {""} ;
      P08PZ2_A9505MRMovTpo = new int[1] ;
      P08PZ2_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08PZ2_A9503MRMovOrd = new int[1] ;
      P08PZ2_A9502MRMov = new long[1] ;
      W9493MRNom = "" ;
      AV38Option = "" ;
      P08PZ3_A396EmprCod = new String[] {""} ;
      P08PZ3_A9492MRCod = new int[1] ;
      P08PZ3_A9493MRNom = new String[] {""} ;
      P08PZ3_n9493MRNom = new boolean[] {false} ;
      P08PZ3_A9507MRMovDsc = new String[] {""} ;
      P08PZ3_A9509MRMovPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PZ3_A9508MRMovCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PZ3_A9506MRMovTpoD = new String[] {""} ;
      P08PZ3_n9506MRMovTpoD = new boolean[] {false} ;
      P08PZ3_A9505MRMovTpo = new int[1] ;
      P08PZ3_A9504MRMovFch = new java.util.Date[] {GXutil.nullDate()} ;
      P08PZ3_A9503MRMovOrd = new int[1] ;
      P08PZ3_A9502MRMov = new long[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.wcrepuestomovimientosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08PZ2_A396EmprCod, P08PZ2_A9492MRCod, P08PZ2_A9493MRNom, P08PZ2_n9493MRNom, P08PZ2_A9506MRMovTpoD, P08PZ2_n9506MRMovTpoD, P08PZ2_A9509MRMovPre, P08PZ2_A9508MRMovCnt, P08PZ2_A9507MRMovDsc, P08PZ2_A9505MRMovTpo,
            P08PZ2_A9504MRMovFch, P08PZ2_A9503MRMovOrd, P08PZ2_A9502MRMov
            }
            , new Object[] {
            P08PZ3_A396EmprCod, P08PZ3_A9492MRCod, P08PZ3_A9493MRNom, P08PZ3_n9493MRNom, P08PZ3_A9507MRMovDsc, P08PZ3_A9509MRMovPre, P08PZ3_A9508MRMovCnt, P08PZ3_A9506MRMovTpoD, P08PZ3_n9506MRMovTpoD, P08PZ3_A9505MRMovTpo,
            P08PZ3_A9504MRMovFch, P08PZ3_A9503MRMovOrd, P08PZ3_A9502MRMov
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV61GXV1 ;
   private int AV20TFMRMovOrd ;
   private int AV21TFMRMovOrd_To ;
   private int AV24TFMRMovTpo ;
   private int AV25TFMRMovTpo_To ;
   private int AV54MRCod ;
   private int AV64Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod ;
   private int AV69Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord ;
   private int AV70Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to ;
   private int AV72Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo ;
   private int AV73Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to ;
   private int A9503MRMovOrd ;
   private int A9505MRMovTpo ;
   private int A9492MRCod ;
   private long AV18TFMRMov ;
   private long AV19TFMRMov_To ;
   private long AV67Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov ;
   private long AV68Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to ;
   private long A9502MRMov ;
   private long AV46count ;
   private java.math.BigDecimal AV30TFMRMovCnt ;
   private java.math.BigDecimal AV31TFMRMovCnt_To ;
   private java.math.BigDecimal AV32TFMRMovPre ;
   private java.math.BigDecimal AV33TFMRMovPre_To ;
   private java.math.BigDecimal AV78Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt ;
   private java.math.BigDecimal AV79Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to ;
   private java.math.BigDecimal AV80Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre ;
   private java.math.BigDecimal AV81Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to ;
   private java.math.BigDecimal A9508MRMovCnt ;
   private java.math.BigDecimal A9509MRMovPre ;
   private String AV26TFMRMovTpoD ;
   private String AV27TFMRMovTpoD_Sel ;
   private String AV28TFMRMovDsc ;
   private String AV29TFMRMovDsc_Sel ;
   private String AV53EmprCod ;
   private String AV56MRNom ;
   private String A9506MRMovTpoD ;
   private String AV63Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod ;
   private String AV65Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom ;
   private String AV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod ;
   private String AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel ;
   private String AV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc ;
   private String AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel ;
   private String scmdbuf ;
   private String lV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod ;
   private String lV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc ;
   private String A9507MRMovDsc ;
   private String A396EmprCod ;
   private String A9493MRNom ;
   private String W9493MRNom ;
   private java.util.Date AV22TFMRMovFch ;
   private java.util.Date AV71Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch ;
   private java.util.Date A9504MRMovFch ;
   private boolean returnInSub ;
   private boolean brk8PZ2 ;
   private boolean n9493MRNom ;
   private boolean n9506MRMovTpoD ;
   private boolean brk8PZ4 ;
   private String AV40OptionsJson ;
   private String AV43OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV52FilterFullText ;
   private String AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext ;
   private String lV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext ;
   private String AV38Option ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08PZ2_A396EmprCod ;
   private int[] P08PZ2_A9492MRCod ;
   private String[] P08PZ2_A9493MRNom ;
   private boolean[] P08PZ2_n9493MRNom ;
   private String[] P08PZ2_A9506MRMovTpoD ;
   private boolean[] P08PZ2_n9506MRMovTpoD ;
   private java.math.BigDecimal[] P08PZ2_A9509MRMovPre ;
   private java.math.BigDecimal[] P08PZ2_A9508MRMovCnt ;
   private String[] P08PZ2_A9507MRMovDsc ;
   private int[] P08PZ2_A9505MRMovTpo ;
   private java.util.Date[] P08PZ2_A9504MRMovFch ;
   private int[] P08PZ2_A9503MRMovOrd ;
   private long[] P08PZ2_A9502MRMov ;
   private String[] P08PZ3_A396EmprCod ;
   private int[] P08PZ3_A9492MRCod ;
   private String[] P08PZ3_A9493MRNom ;
   private boolean[] P08PZ3_n9493MRNom ;
   private String[] P08PZ3_A9507MRMovDsc ;
   private java.math.BigDecimal[] P08PZ3_A9509MRMovPre ;
   private java.math.BigDecimal[] P08PZ3_A9508MRMovCnt ;
   private String[] P08PZ3_A9506MRMovTpoD ;
   private boolean[] P08PZ3_n9506MRMovTpoD ;
   private int[] P08PZ3_A9505MRMovTpo ;
   private java.util.Date[] P08PZ3_A9504MRMovFch ;
   private int[] P08PZ3_A9503MRMovOrd ;
   private long[] P08PZ3_A9502MRMov ;
   private GXSimpleCollection<String> AV39Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV44OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class wcrepuestomovimientosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PZ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext ,
                                          long AV67Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov ,
                                          long AV68Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to ,
                                          int AV69Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord ,
                                          int AV70Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to ,
                                          java.util.Date AV71Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch ,
                                          int AV72Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo ,
                                          int AV73Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to ,
                                          String AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                          String AV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod ,
                                          String AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                          String AV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc ,
                                          java.math.BigDecimal AV78Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt ,
                                          java.math.BigDecimal AV79Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                          java.math.BigDecimal AV80Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre ,
                                          java.math.BigDecimal AV81Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                          long A9502MRMov ,
                                          int A9503MRMovOrd ,
                                          int A9505MRMovTpo ,
                                          String A9506MRMovTpoD ,
                                          String A9507MRMovDsc ,
                                          java.math.BigDecimal A9508MRMovCnt ,
                                          java.math.BigDecimal A9509MRMovPre ,
                                          java.util.Date A9504MRMovFch ,
                                          String A396EmprCod ,
                                          String AV53EmprCod ,
                                          int A9492MRCod ,
                                          int AV54MRCod ,
                                          String AV63Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod ,
                                          int AV64Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod ,
                                          String AV65Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom ,
                                          String A9493MRNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[27];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MRCod, T2.MRNom, T3.MTMovNom AS MRMovTpoD, T1.MRMovPre, T1.MRMovCnt, T1.MRMovDsc, T1.MRMovTpo AS MRMovTpo, T1.MRMovFch, T1.MRMovOrd, T1.MRMov" ;
      scmdbuf += " FROM ((TXPMReMov T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMTPOMO T3 ON T3.EmprCod = T1.EmprCod AND T3.MTMovCod" ;
      scmdbuf += " = T1.MRMovTpo)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRCod = ? and T2.MRNom = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MRCod = ?)");
      if ( ! (GXutil.strcmp("", AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MRMov,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovOrd,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovTpo,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MTMovNom) like '%' || UPPER(?)) or ( UPPER(T1.MRMovDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRMovCnt,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovPre,'99999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
         GXv_int2[10] = (byte)(1) ;
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov) )
      {
         addWhere(sWhereString, "(T1.MRMov >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV68Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to) )
      {
         addWhere(sWhereString, "(T1.MRMov <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV69Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV70Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV71Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch) )
      {
         addWhere(sWhereString, "(T1.MRMovFch >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV72Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo >= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV73Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo <= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) && ( ! (GXutil.strcmp("", AV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MTMovNom = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRMovDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt >= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt <= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T3.MTMovNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08PZ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext ,
                                          long AV67Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov ,
                                          long AV68Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to ,
                                          int AV69Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord ,
                                          int AV70Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to ,
                                          java.util.Date AV71Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch ,
                                          int AV72Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo ,
                                          int AV73Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to ,
                                          String AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel ,
                                          String AV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod ,
                                          String AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel ,
                                          String AV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc ,
                                          java.math.BigDecimal AV78Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt ,
                                          java.math.BigDecimal AV79Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to ,
                                          java.math.BigDecimal AV80Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre ,
                                          java.math.BigDecimal AV81Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to ,
                                          long A9502MRMov ,
                                          int A9503MRMovOrd ,
                                          int A9505MRMovTpo ,
                                          String A9506MRMovTpoD ,
                                          String A9507MRMovDsc ,
                                          java.math.BigDecimal A9508MRMovCnt ,
                                          java.math.BigDecimal A9509MRMovPre ,
                                          java.util.Date A9504MRMovFch ,
                                          String A396EmprCod ,
                                          String AV53EmprCod ,
                                          int A9492MRCod ,
                                          int AV54MRCod ,
                                          String AV63Mantenimientomaquina_wcrepuestomovimientosds_1_emprcod ,
                                          int AV64Mantenimientomaquina_wcrepuestomovimientosds_2_mrcod ,
                                          String AV65Mantenimientomaquina_wcrepuestomovimientosds_3_mrnom ,
                                          String A9493MRNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[27];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovDsc, T1.MRMovPre, T1.MRMovCnt, T3.MTMovNom AS MRMovTpoD, T1.MRMovTpo AS MRMovTpo, T1.MRMovFch, T1.MRMovOrd, T1.MRMov" ;
      scmdbuf += " FROM ((TXPMReMov T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRCod) INNER JOIN TXPMTPOMO T3 ON T3.EmprCod = T1.EmprCod AND T3.MTMovCod" ;
      scmdbuf += " = T1.MRMovTpo)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MRCod = ? and T2.MRNom = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MRCod = ?)");
      if ( ! (GXutil.strcmp("", AV66Mantenimientomaquina_wcrepuestomovimientosds_4_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MRMov,'9999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovOrd,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovTpo,'99999990'), 2) like '%' || ?) or ( UPPER(T3.MTMovNom) like '%' || UPPER(?)) or ( UPPER(T1.MRMovDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRMovCnt,'999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MRMovPre,'99999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
         GXv_int4[10] = (byte)(1) ;
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV67Mantenimientomaquina_wcrepuestomovimientosds_5_tfmrmov) )
      {
         addWhere(sWhereString, "(T1.MRMov >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV68Mantenimientomaquina_wcrepuestomovimientosds_6_tfmrmov_to) )
      {
         addWhere(sWhereString, "(T1.MRMov <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV69Mantenimientomaquina_wcrepuestomovimientosds_7_tfmrmovord) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV70Mantenimientomaquina_wcrepuestomovimientosds_8_tfmrmovord_to) )
      {
         addWhere(sWhereString, "(T1.MRMovOrd <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV71Mantenimientomaquina_wcrepuestomovimientosds_9_tfmrmovfch) )
      {
         addWhere(sWhereString, "(T1.MRMovFch >= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (0==AV72Mantenimientomaquina_wcrepuestomovimientosds_10_tfmrmovtpo) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo >= ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV73Mantenimientomaquina_wcrepuestomovimientosds_11_tfmrmovtpo_to) )
      {
         addWhere(sWhereString, "(T1.MRMovTpo <= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) && ( ! (GXutil.strcmp("", AV74Mantenimientomaquina_wcrepuestomovimientosds_12_tfmrmovtpod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Mantenimientomaquina_wcrepuestomovimientosds_13_tfmrmovtpod_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MTMovNom = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Mantenimientomaquina_wcrepuestomovimientosds_14_tfmrmovdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MRMovDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Mantenimientomaquina_wcrepuestomovimientosds_15_tfmrmovdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovDsc = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Mantenimientomaquina_wcrepuestomovimientosds_16_tfmrmovcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Mantenimientomaquina_wcrepuestomovimientosds_17_tfmrmovcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovCnt <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Mantenimientomaquina_wcrepuestomovimientosds_18_tfmrmovpre)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Mantenimientomaquina_wcrepuestomovimientosds_19_tfmrmovpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MRMovPre <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MRCod, T2.MRNom, T1.MRMovDsc" ;
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
                  return conditional_P08PZ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] );
            case 1 :
                  return conditional_P08PZ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).longValue() , ((Number) dynConstraints[2]).longValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).longValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PZ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08PZ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((long[]) buf[12])[0] = rslt.getLong(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,3);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((long[]) buf[12])[0] = rslt.getLong(11);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[39]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[40]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[39]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[40]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               return;
      }
   }

}

