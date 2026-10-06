package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlrecuentoentrada_wcgetfilterdata extends GXProcedure
{
   public controlrecuentoentrada_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlrecuentoentrada_wcgetfilterdata.class ), "" );
   }

   public controlrecuentoentrada_wcgetfilterdata( int remoteHandle ,
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
      controlrecuentoentrada_wcgetfilterdata.this.aP5 = new String[] {""};
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
      controlrecuentoentrada_wcgetfilterdata.this.AV44DDOName = aP0;
      controlrecuentoentrada_wcgetfilterdata.this.AV42SearchTxt = aP1;
      controlrecuentoentrada_wcgetfilterdata.this.AV43SearchTxtTo = aP2;
      controlrecuentoentrada_wcgetfilterdata.this.aP3 = aP3;
      controlrecuentoentrada_wcgetfilterdata.this.aP4 = aP4;
      controlrecuentoentrada_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV47Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV50OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV52OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_PRDNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV44DDOName), "DDO_PRDREC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRDRECOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV48OptionsJson = AV47Options.toJSonString(false) ;
      AV51OptionsDescJson = AV50OptionsDesc.toJSonString(false) ;
      AV53OptionIndexesJson = AV52OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV55Session.getValue("ControlRecuentoEntrada_WCGridState"), "") == 0 )
      {
         AV57GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ControlRecuentoEntrada_WCGridState"), null, null);
      }
      else
      {
         AV57GridState.fromxml(AV55Session.getValue("ControlRecuentoEntrada_WCGridState"), null, null);
      }
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV58GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV57GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV1));
         if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV60FilterFullText = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV12TFPrdNum = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV13TFPrdNum_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV14TFPrdNom = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV15TFPrdNom_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV18TFRecExiTeo = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFRecExiTeo_To = CommonUtil.decimalVal( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV61TFPrdRec = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV62TFPrdRec_Sel = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV63Emprcod = AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV64RecFec = localUtil.ctod( AV58GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNum = AV42SearchTxt ;
      AV13TFPrdNum_Sel = "" ;
      AV69Controlrecuentoentrada_wcds_1_filterfulltext = AV60FilterFullText ;
      AV70Controlrecuentoentrada_wcds_2_tfprdnum = AV12TFPrdNum ;
      AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV72Controlrecuentoentrada_wcds_4_tfprdnom = AV14TFPrdNom ;
      AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV74Controlrecuentoentrada_wcds_6_tfrecexiteo = AV18TFRecExiTeo ;
      AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to = AV19TFRecExiTeo_To ;
      AV76Controlrecuentoentrada_wcds_8_tfprdrec = AV61TFPrdRec ;
      AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel = AV62TFPrdRec_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Controlrecuentoentrada_wcds_1_filterfulltext ,
                                           AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel ,
                                           AV70Controlrecuentoentrada_wcds_2_tfprdnum ,
                                           AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel ,
                                           AV72Controlrecuentoentrada_wcds_4_tfprdnom ,
                                           AV74Controlrecuentoentrada_wcds_6_tfrecexiteo ,
                                           AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to ,
                                           AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel ,
                                           AV76Controlrecuentoentrada_wcds_8_tfprdrec ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A727PrdRec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV70Controlrecuentoentrada_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Controlrecuentoentrada_wcds_2_tfprdnum), 6, "%") ;
      lV72Controlrecuentoentrada_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Controlrecuentoentrada_wcds_4_tfprdnom), 26, "%") ;
      lV76Controlrecuentoentrada_wcds_8_tfprdrec = GXutil.padr( GXutil.rtrim( AV76Controlrecuentoentrada_wcds_8_tfprdrec), 1, "%") ;
      /* Using cursor P09MV2 */
      pr_default.execute(0, new Object[] {lV69Controlrecuentoentrada_wcds_1_filterfulltext, lV69Controlrecuentoentrada_wcds_1_filterfulltext, lV69Controlrecuentoentrada_wcds_1_filterfulltext, lV69Controlrecuentoentrada_wcds_1_filterfulltext, lV70Controlrecuentoentrada_wcds_2_tfprdnum, AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel, lV72Controlrecuentoentrada_wcds_4_tfprdnom, AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel, AV74Controlrecuentoentrada_wcds_6_tfrecexiteo, AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to, lV76Controlrecuentoentrada_wcds_8_tfprdrec, AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9MV2 = false ;
         A396EmprCod = P09MV2_A396EmprCod[0] ;
         A719PrdNum = P09MV2_A719PrdNum[0] ;
         A727PrdRec = P09MV2_A727PrdRec[0] ;
         A809RecExiTeo = P09MV2_A809RecExiTeo[0] ;
         A718PrdNom = P09MV2_A718PrdNom[0] ;
         A810RecFec = P09MV2_A810RecFec[0] ;
         A727PrdRec = P09MV2_A727PrdRec[0] ;
         A718PrdNom = P09MV2_A718PrdNom[0] ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09MV2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9MV2 = false ;
            A396EmprCod = P09MV2_A396EmprCod[0] ;
            A810RecFec = P09MV2_A810RecFec[0] ;
            AV54count = (long)(AV54count+1) ;
            brk9MV2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV46Option = A719PrdNum ;
            AV47Options.add(AV46Option, 0);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9MV2 )
         {
            brk9MV2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNom = AV42SearchTxt ;
      AV15TFPrdNom_Sel = "" ;
      AV69Controlrecuentoentrada_wcds_1_filterfulltext = AV60FilterFullText ;
      AV70Controlrecuentoentrada_wcds_2_tfprdnum = AV12TFPrdNum ;
      AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV72Controlrecuentoentrada_wcds_4_tfprdnom = AV14TFPrdNom ;
      AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV74Controlrecuentoentrada_wcds_6_tfrecexiteo = AV18TFRecExiTeo ;
      AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to = AV19TFRecExiTeo_To ;
      AV76Controlrecuentoentrada_wcds_8_tfprdrec = AV61TFPrdRec ;
      AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel = AV62TFPrdRec_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV69Controlrecuentoentrada_wcds_1_filterfulltext ,
                                           AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel ,
                                           AV70Controlrecuentoentrada_wcds_2_tfprdnum ,
                                           AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel ,
                                           AV72Controlrecuentoentrada_wcds_4_tfprdnom ,
                                           AV74Controlrecuentoentrada_wcds_6_tfrecexiteo ,
                                           AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to ,
                                           AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel ,
                                           AV76Controlrecuentoentrada_wcds_8_tfprdrec ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A727PrdRec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV70Controlrecuentoentrada_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Controlrecuentoentrada_wcds_2_tfprdnum), 6, "%") ;
      lV72Controlrecuentoentrada_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Controlrecuentoentrada_wcds_4_tfprdnom), 26, "%") ;
      lV76Controlrecuentoentrada_wcds_8_tfprdrec = GXutil.padr( GXutil.rtrim( AV76Controlrecuentoentrada_wcds_8_tfprdrec), 1, "%") ;
      /* Using cursor P09MV3 */
      pr_default.execute(1, new Object[] {lV69Controlrecuentoentrada_wcds_1_filterfulltext, lV69Controlrecuentoentrada_wcds_1_filterfulltext, lV69Controlrecuentoentrada_wcds_1_filterfulltext, lV69Controlrecuentoentrada_wcds_1_filterfulltext, lV70Controlrecuentoentrada_wcds_2_tfprdnum, AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel, lV72Controlrecuentoentrada_wcds_4_tfprdnom, AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel, AV74Controlrecuentoentrada_wcds_6_tfrecexiteo, AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to, lV76Controlrecuentoentrada_wcds_8_tfprdrec, AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9MV4 = false ;
         A719PrdNum = P09MV3_A719PrdNum[0] ;
         A396EmprCod = P09MV3_A396EmprCod[0] ;
         A727PrdRec = P09MV3_A727PrdRec[0] ;
         A809RecExiTeo = P09MV3_A809RecExiTeo[0] ;
         A718PrdNom = P09MV3_A718PrdNom[0] ;
         A810RecFec = P09MV3_A810RecFec[0] ;
         A727PrdRec = P09MV3_A727PrdRec[0] ;
         A718PrdNom = P09MV3_A718PrdNom[0] ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09MV3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09MV3_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk9MV4 = false ;
            A810RecFec = P09MV3_A810RecFec[0] ;
            AV54count = (long)(AV54count+1) ;
            brk9MV4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV46Option = A718PrdNom ;
            AV45InsertIndex = 1 ;
            while ( ( AV45InsertIndex <= AV47Options.size() ) && ( GXutil.strcmp((String)AV47Options.elementAt(-1+AV45InsertIndex), AV46Option) < 0 ) )
            {
               AV45InsertIndex = (int)(AV45InsertIndex+1) ;
            }
            AV47Options.add(AV46Option, AV45InsertIndex);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), AV45InsertIndex);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9MV4 )
         {
            brk9MV4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADPRDRECOPTIONS' Routine */
      returnInSub = false ;
      AV61TFPrdRec = AV42SearchTxt ;
      AV62TFPrdRec_Sel = "" ;
      AV69Controlrecuentoentrada_wcds_1_filterfulltext = AV60FilterFullText ;
      AV70Controlrecuentoentrada_wcds_2_tfprdnum = AV12TFPrdNum ;
      AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel = AV13TFPrdNum_Sel ;
      AV72Controlrecuentoentrada_wcds_4_tfprdnom = AV14TFPrdNom ;
      AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel = AV15TFPrdNom_Sel ;
      AV74Controlrecuentoentrada_wcds_6_tfrecexiteo = AV18TFRecExiTeo ;
      AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to = AV19TFRecExiTeo_To ;
      AV76Controlrecuentoentrada_wcds_8_tfprdrec = AV61TFPrdRec ;
      AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel = AV62TFPrdRec_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV69Controlrecuentoentrada_wcds_1_filterfulltext ,
                                           AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel ,
                                           AV70Controlrecuentoentrada_wcds_2_tfprdnum ,
                                           AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel ,
                                           AV72Controlrecuentoentrada_wcds_4_tfprdnom ,
                                           AV74Controlrecuentoentrada_wcds_6_tfrecexiteo ,
                                           AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to ,
                                           AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel ,
                                           AV76Controlrecuentoentrada_wcds_8_tfprdrec ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A727PrdRec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING
                                           }
      });
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV70Controlrecuentoentrada_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Controlrecuentoentrada_wcds_2_tfprdnum), 6, "%") ;
      lV72Controlrecuentoentrada_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Controlrecuentoentrada_wcds_4_tfprdnom), 26, "%") ;
      lV76Controlrecuentoentrada_wcds_8_tfprdrec = GXutil.padr( GXutil.rtrim( AV76Controlrecuentoentrada_wcds_8_tfprdrec), 1, "%") ;
      /* Using cursor P09MV4 */
      pr_default.execute(2, new Object[] {lV69Controlrecuentoentrada_wcds_1_filterfulltext, lV69Controlrecuentoentrada_wcds_1_filterfulltext, lV69Controlrecuentoentrada_wcds_1_filterfulltext, lV69Controlrecuentoentrada_wcds_1_filterfulltext, lV70Controlrecuentoentrada_wcds_2_tfprdnum, AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel, lV72Controlrecuentoentrada_wcds_4_tfprdnom, AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel, AV74Controlrecuentoentrada_wcds_6_tfrecexiteo, AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to, lV76Controlrecuentoentrada_wcds_8_tfprdrec, AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9MV6 = false ;
         A396EmprCod = P09MV4_A396EmprCod[0] ;
         A727PrdRec = P09MV4_A727PrdRec[0] ;
         A809RecExiTeo = P09MV4_A809RecExiTeo[0] ;
         A718PrdNom = P09MV4_A718PrdNom[0] ;
         A719PrdNum = P09MV4_A719PrdNum[0] ;
         A810RecFec = P09MV4_A810RecFec[0] ;
         A727PrdRec = P09MV4_A727PrdRec[0] ;
         A718PrdNom = P09MV4_A718PrdNom[0] ;
         AV54count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09MV4_A727PrdRec[0], A727PrdRec) == 0 ) )
         {
            brk9MV6 = false ;
            A396EmprCod = P09MV4_A396EmprCod[0] ;
            A719PrdNum = P09MV4_A719PrdNum[0] ;
            A810RecFec = P09MV4_A810RecFec[0] ;
            AV54count = (long)(AV54count+1) ;
            brk9MV6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A727PrdRec)==0) )
         {
            AV46Option = A727PrdRec ;
            AV47Options.add(AV46Option, 0);
            AV52OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV54count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV47Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9MV6 )
         {
            brk9MV6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP3[0] = controlrecuentoentrada_wcgetfilterdata.this.AV48OptionsJson;
      this.aP4[0] = controlrecuentoentrada_wcgetfilterdata.this.AV51OptionsDescJson;
      this.aP5[0] = controlrecuentoentrada_wcgetfilterdata.this.AV53OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV48OptionsJson = "" ;
      AV51OptionsDescJson = "" ;
      AV53OptionIndexesJson = "" ;
      AV47Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV55Session = httpContext.getWebSession();
      AV57GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV58GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV60FilterFullText = "" ;
      AV12TFPrdNum = "" ;
      AV13TFPrdNum_Sel = "" ;
      AV14TFPrdNom = "" ;
      AV15TFPrdNom_Sel = "" ;
      AV18TFRecExiTeo = DecimalUtil.ZERO ;
      AV19TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV61TFPrdRec = "" ;
      AV62TFPrdRec_Sel = "" ;
      AV63Emprcod = "" ;
      AV64RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      AV69Controlrecuentoentrada_wcds_1_filterfulltext = "" ;
      AV70Controlrecuentoentrada_wcds_2_tfprdnum = "" ;
      AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel = "" ;
      AV72Controlrecuentoentrada_wcds_4_tfprdnom = "" ;
      AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel = "" ;
      AV74Controlrecuentoentrada_wcds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV76Controlrecuentoentrada_wcds_8_tfprdrec = "" ;
      AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel = "" ;
      scmdbuf = "" ;
      lV69Controlrecuentoentrada_wcds_1_filterfulltext = "" ;
      lV70Controlrecuentoentrada_wcds_2_tfprdnum = "" ;
      lV72Controlrecuentoentrada_wcds_4_tfprdnom = "" ;
      lV76Controlrecuentoentrada_wcds_8_tfprdrec = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      P09MV2_A396EmprCod = new String[] {""} ;
      P09MV2_A719PrdNum = new String[] {""} ;
      P09MV2_A727PrdRec = new String[] {""} ;
      P09MV2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MV2_A718PrdNom = new String[] {""} ;
      P09MV2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      A396EmprCod = "" ;
      A810RecFec = GXutil.nullDate() ;
      AV46Option = "" ;
      P09MV3_A719PrdNum = new String[] {""} ;
      P09MV3_A396EmprCod = new String[] {""} ;
      P09MV3_A727PrdRec = new String[] {""} ;
      P09MV3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MV3_A718PrdNom = new String[] {""} ;
      P09MV3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09MV4_A396EmprCod = new String[] {""} ;
      P09MV4_A727PrdRec = new String[] {""} ;
      P09MV4_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09MV4_A718PrdNom = new String[] {""} ;
      P09MV4_A719PrdNum = new String[] {""} ;
      P09MV4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlrecuentoentrada_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09MV2_A396EmprCod, P09MV2_A719PrdNum, P09MV2_A727PrdRec, P09MV2_A809RecExiTeo, P09MV2_A718PrdNom, P09MV2_A810RecFec
            }
            , new Object[] {
            P09MV3_A719PrdNum, P09MV3_A396EmprCod, P09MV3_A727PrdRec, P09MV3_A809RecExiTeo, P09MV3_A718PrdNom, P09MV3_A810RecFec
            }
            , new Object[] {
            P09MV4_A396EmprCod, P09MV4_A727PrdRec, P09MV4_A809RecExiTeo, P09MV4_A718PrdNom, P09MV4_A719PrdNum, P09MV4_A810RecFec
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV67GXV1 ;
   private int AV45InsertIndex ;
   private long AV54count ;
   private java.math.BigDecimal AV18TFRecExiTeo ;
   private java.math.BigDecimal AV19TFRecExiTeo_To ;
   private java.math.BigDecimal AV74Controlrecuentoentrada_wcds_6_tfrecexiteo ;
   private java.math.BigDecimal AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private String AV12TFPrdNum ;
   private String AV13TFPrdNum_Sel ;
   private String AV14TFPrdNom ;
   private String AV15TFPrdNom_Sel ;
   private String AV61TFPrdRec ;
   private String AV62TFPrdRec_Sel ;
   private String AV63Emprcod ;
   private String A719PrdNum ;
   private String AV70Controlrecuentoentrada_wcds_2_tfprdnum ;
   private String AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel ;
   private String AV72Controlrecuentoentrada_wcds_4_tfprdnom ;
   private String AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel ;
   private String AV76Controlrecuentoentrada_wcds_8_tfprdrec ;
   private String AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel ;
   private String scmdbuf ;
   private String lV70Controlrecuentoentrada_wcds_2_tfprdnum ;
   private String lV72Controlrecuentoentrada_wcds_4_tfprdnom ;
   private String lV76Controlrecuentoentrada_wcds_8_tfprdrec ;
   private String A718PrdNom ;
   private String A727PrdRec ;
   private String A396EmprCod ;
   private java.util.Date AV64RecFec ;
   private java.util.Date A810RecFec ;
   private boolean returnInSub ;
   private boolean brk9MV2 ;
   private boolean brk9MV4 ;
   private boolean brk9MV6 ;
   private String AV48OptionsJson ;
   private String AV51OptionsDescJson ;
   private String AV53OptionIndexesJson ;
   private String AV44DDOName ;
   private String AV42SearchTxt ;
   private String AV43SearchTxtTo ;
   private String AV60FilterFullText ;
   private String AV69Controlrecuentoentrada_wcds_1_filterfulltext ;
   private String lV69Controlrecuentoentrada_wcds_1_filterfulltext ;
   private String AV46Option ;
   private com.genexus.webpanels.WebSession AV55Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09MV2_A396EmprCod ;
   private String[] P09MV2_A719PrdNum ;
   private String[] P09MV2_A727PrdRec ;
   private java.math.BigDecimal[] P09MV2_A809RecExiTeo ;
   private String[] P09MV2_A718PrdNom ;
   private java.util.Date[] P09MV2_A810RecFec ;
   private String[] P09MV3_A719PrdNum ;
   private String[] P09MV3_A396EmprCod ;
   private String[] P09MV3_A727PrdRec ;
   private java.math.BigDecimal[] P09MV3_A809RecExiTeo ;
   private String[] P09MV3_A718PrdNom ;
   private java.util.Date[] P09MV3_A810RecFec ;
   private String[] P09MV4_A396EmprCod ;
   private String[] P09MV4_A727PrdRec ;
   private java.math.BigDecimal[] P09MV4_A809RecExiTeo ;
   private String[] P09MV4_A718PrdNom ;
   private String[] P09MV4_A719PrdNum ;
   private java.util.Date[] P09MV4_A810RecFec ;
   private GXSimpleCollection<String> AV47Options ;
   private GXSimpleCollection<String> AV50OptionsDesc ;
   private GXSimpleCollection<String> AV52OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV57GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV58GridStateFilterValue ;
}

final  class controlrecuentoentrada_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09MV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Controlrecuentoentrada_wcds_1_filterfulltext ,
                                          String AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel ,
                                          String AV70Controlrecuentoentrada_wcds_2_tfprdnum ,
                                          String AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel ,
                                          String AV72Controlrecuentoentrada_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV74Controlrecuentoentrada_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to ,
                                          String AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel ,
                                          String AV76Controlrecuentoentrada_wcds_8_tfprdrec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          String A727PrdRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[12];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T2.PrdRec, T1.RecExiTeo, T2.PrdNom, T1.RecFec FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum =" ;
      scmdbuf += " T1.PrdNum)" ;
      if ( ! (GXutil.strcmp("", AV69Controlrecuentoentrada_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T2.PrdRec) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Controlrecuentoentrada_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Controlrecuentoentrada_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Controlrecuentoentrada_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV76Controlrecuentoentrada_wcds_8_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdRec = ?)");
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

   protected Object[] conditional_P09MV3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Controlrecuentoentrada_wcds_1_filterfulltext ,
                                          String AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel ,
                                          String AV70Controlrecuentoentrada_wcds_2_tfprdnum ,
                                          String AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel ,
                                          String AV72Controlrecuentoentrada_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV74Controlrecuentoentrada_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to ,
                                          String AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel ,
                                          String AV76Controlrecuentoentrada_wcds_8_tfprdrec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          String A727PrdRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T2.PrdRec, T1.RecExiTeo, T2.PrdNom, T1.RecFec FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum =" ;
      scmdbuf += " T1.PrdNum)" ;
      if ( ! (GXutil.strcmp("", AV69Controlrecuentoentrada_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T2.PrdRec) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
         GXv_int4[1] = (byte)(1) ;
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Controlrecuentoentrada_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Controlrecuentoentrada_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Controlrecuentoentrada_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV76Controlrecuentoentrada_wcds_8_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdRec = ?)");
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

   protected Object[] conditional_P09MV4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Controlrecuentoentrada_wcds_1_filterfulltext ,
                                          String AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel ,
                                          String AV70Controlrecuentoentrada_wcds_2_tfprdnum ,
                                          String AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel ,
                                          String AV72Controlrecuentoentrada_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV74Controlrecuentoentrada_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to ,
                                          String AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel ,
                                          String AV76Controlrecuentoentrada_wcds_8_tfprdrec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          String A727PrdRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[12];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.PrdRec, T1.RecExiTeo, T2.PrdNom, T1.PrdNum, T1.RecFec FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum =" ;
      scmdbuf += " T1.PrdNum)" ;
      if ( ! (GXutil.strcmp("", AV69Controlrecuentoentrada_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T2.PrdRec) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Controlrecuentoentrada_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Controlrecuentoentrada_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Controlrecuentoentrada_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Controlrecuentoentrada_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Controlrecuentoentrada_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Controlrecuentoentrada_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV76Controlrecuentoentrada_wcds_8_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Controlrecuentoentrada_wcds_9_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdRec = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrdRec" ;
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
                  return conditional_P09MV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P09MV3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] );
            case 2 :
                  return conditional_P09MV4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09MV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MV3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09MV4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
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
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
      }
   }

}

