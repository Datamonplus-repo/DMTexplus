package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informediferenciasrecuento_wcgetfilterdata extends GXProcedure
{
   public informediferenciasrecuento_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informediferenciasrecuento_wcgetfilterdata.class ), "" );
   }

   public informediferenciasrecuento_wcgetfilterdata( int remoteHandle ,
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
      informediferenciasrecuento_wcgetfilterdata.this.aP5 = new String[] {""};
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
      informediferenciasrecuento_wcgetfilterdata.this.AV24DDOName = aP0;
      informediferenciasrecuento_wcgetfilterdata.this.AV22SearchTxt = aP1;
      informediferenciasrecuento_wcgetfilterdata.this.AV23SearchTxtTo = aP2;
      informediferenciasrecuento_wcgetfilterdata.this.aP3 = aP3;
      informediferenciasrecuento_wcgetfilterdata.this.aP4 = aP4;
      informediferenciasrecuento_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_PRDNOM") == 0 )
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
      AV28OptionsJson = AV27Options.toJSonString(false) ;
      AV31OptionsDescJson = AV30OptionsDesc.toJSonString(false) ;
      AV33OptionIndexesJson = AV32OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue("InformeDiferenciasRecuento_WCGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "InformeDiferenciasRecuento_WCGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("InformeDiferenciasRecuento_WCGridState"), null, null);
      }
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFEC") == 0 )
         {
            AV10TFRecFec = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECHORA") == 0 )
         {
            AV12TFRechora = localUtil.ctot( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV14TFPrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV15TFPrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV16TFPrdNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV17TFPrdNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV18TFRecExiTeo = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFRecExiTeo_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV20TFRecExiRea = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV21TFRecExiRea_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV41Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV42RecFec = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DESVIOS") == 0 )
         {
            AV43Desvios = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNum = AV22SearchTxt ;
      AV15TFPrdNum_Sel = "" ;
      AV68Informediferenciasrecuento_wcds_1_filterfulltext = AV40FilterFullText ;
      AV69Informediferenciasrecuento_wcds_2_tfrecfec = AV10TFRecFec ;
      AV70Informediferenciasrecuento_wcds_3_tfrechora = AV12TFRechora ;
      AV71Informediferenciasrecuento_wcds_4_tfprdnum = AV14TFPrdNum ;
      AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV73Informediferenciasrecuento_wcds_6_tfprdnom = AV16TFPrdNom ;
      AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV75Informediferenciasrecuento_wcds_8_tfrecexiteo = AV18TFRecExiTeo ;
      AV76Informediferenciasrecuento_wcds_9_tfrecexiteo_to = AV19TFRecExiTeo_To ;
      AV77Informediferenciasrecuento_wcds_10_tfrecexirea = AV20TFRecExiRea ;
      AV78Informediferenciasrecuento_wcds_11_tfrecexirea_to = AV21TFRecExiRea_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV68Informediferenciasrecuento_wcds_1_filterfulltext ,
                                           AV69Informediferenciasrecuento_wcds_2_tfrecfec ,
                                           AV70Informediferenciasrecuento_wcds_3_tfrechora ,
                                           AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel ,
                                           AV71Informediferenciasrecuento_wcds_4_tfprdnum ,
                                           AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel ,
                                           AV73Informediferenciasrecuento_wcds_6_tfprdnom ,
                                           AV75Informediferenciasrecuento_wcds_8_tfrecexiteo ,
                                           AV76Informediferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                           AV77Informediferenciasrecuento_wcds_10_tfrecexirea ,
                                           AV78Informediferenciasrecuento_wcds_11_tfrecexirea_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           AV42RecFec ,
                                           AV41Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV68Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV68Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV68Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV68Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV71Informediferenciasrecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV71Informediferenciasrecuento_wcds_4_tfprdnum), 6, "%") ;
      lV73Informediferenciasrecuento_wcds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV73Informediferenciasrecuento_wcds_6_tfprdnom), 26, "%") ;
      /* Using cursor P08VD2 */
      pr_default.execute(0, new Object[] {AV41Emprcod, AV42RecFec, lV68Informediferenciasrecuento_wcds_1_filterfulltext, lV68Informediferenciasrecuento_wcds_1_filterfulltext, lV68Informediferenciasrecuento_wcds_1_filterfulltext, lV68Informediferenciasrecuento_wcds_1_filterfulltext, AV69Informediferenciasrecuento_wcds_2_tfrecfec, AV70Informediferenciasrecuento_wcds_3_tfrechora, lV71Informediferenciasrecuento_wcds_4_tfprdnum, AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel, lV73Informediferenciasrecuento_wcds_6_tfprdnom, AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel, AV75Informediferenciasrecuento_wcds_8_tfrecexiteo, AV76Informediferenciasrecuento_wcds_9_tfrecexiteo_to, AV77Informediferenciasrecuento_wcds_10_tfrecexirea, AV78Informediferenciasrecuento_wcds_11_tfrecexirea_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8VD2 = false ;
         A396EmprCod = P08VD2_A396EmprCod[0] ;
         A719PrdNum = P08VD2_A719PrdNum[0] ;
         A807RecExiRea = P08VD2_A807RecExiRea[0] ;
         A809RecExiTeo = P08VD2_A809RecExiTeo[0] ;
         A718PrdNom = P08VD2_A718PrdNom[0] ;
         A13455Rechora = P08VD2_A13455Rechora[0] ;
         A810RecFec = P08VD2_A810RecFec[0] ;
         A718PrdNom = P08VD2_A718PrdNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08VD2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08VD2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8VD2 = false ;
            A810RecFec = P08VD2_A810RecFec[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8VD2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV26Option = A719PrdNum ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8VD2 )
         {
            brk8VD2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrdNom = AV22SearchTxt ;
      AV17TFPrdNom_Sel = "" ;
      AV68Informediferenciasrecuento_wcds_1_filterfulltext = AV40FilterFullText ;
      AV69Informediferenciasrecuento_wcds_2_tfrecfec = AV10TFRecFec ;
      AV70Informediferenciasrecuento_wcds_3_tfrechora = AV12TFRechora ;
      AV71Informediferenciasrecuento_wcds_4_tfprdnum = AV14TFPrdNum ;
      AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV73Informediferenciasrecuento_wcds_6_tfprdnom = AV16TFPrdNom ;
      AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV75Informediferenciasrecuento_wcds_8_tfrecexiteo = AV18TFRecExiTeo ;
      AV76Informediferenciasrecuento_wcds_9_tfrecexiteo_to = AV19TFRecExiTeo_To ;
      AV77Informediferenciasrecuento_wcds_10_tfrecexirea = AV20TFRecExiRea ;
      AV78Informediferenciasrecuento_wcds_11_tfrecexirea_to = AV21TFRecExiRea_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV68Informediferenciasrecuento_wcds_1_filterfulltext ,
                                           AV69Informediferenciasrecuento_wcds_2_tfrecfec ,
                                           AV70Informediferenciasrecuento_wcds_3_tfrechora ,
                                           AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel ,
                                           AV71Informediferenciasrecuento_wcds_4_tfprdnum ,
                                           AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel ,
                                           AV73Informediferenciasrecuento_wcds_6_tfprdnom ,
                                           AV75Informediferenciasrecuento_wcds_8_tfrecexiteo ,
                                           AV76Informediferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                           AV77Informediferenciasrecuento_wcds_10_tfrecexirea ,
                                           AV78Informediferenciasrecuento_wcds_11_tfrecexirea_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           A396EmprCod ,
                                           AV41Emprcod ,
                                           AV42RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV68Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV68Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV68Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV68Informediferenciasrecuento_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV68Informediferenciasrecuento_wcds_1_filterfulltext), "%", "") ;
      lV71Informediferenciasrecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV71Informediferenciasrecuento_wcds_4_tfprdnum), 6, "%") ;
      lV73Informediferenciasrecuento_wcds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV73Informediferenciasrecuento_wcds_6_tfprdnom), 26, "%") ;
      /* Using cursor P08VD3 */
      pr_default.execute(1, new Object[] {AV41Emprcod, AV42RecFec, lV68Informediferenciasrecuento_wcds_1_filterfulltext, lV68Informediferenciasrecuento_wcds_1_filterfulltext, lV68Informediferenciasrecuento_wcds_1_filterfulltext, lV68Informediferenciasrecuento_wcds_1_filterfulltext, AV69Informediferenciasrecuento_wcds_2_tfrecfec, AV70Informediferenciasrecuento_wcds_3_tfrechora, lV71Informediferenciasrecuento_wcds_4_tfprdnum, AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel, lV73Informediferenciasrecuento_wcds_6_tfprdnom, AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel, AV75Informediferenciasrecuento_wcds_8_tfrecexiteo, AV76Informediferenciasrecuento_wcds_9_tfrecexiteo_to, AV77Informediferenciasrecuento_wcds_10_tfrecexirea, AV78Informediferenciasrecuento_wcds_11_tfrecexirea_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8VD4 = false ;
         A396EmprCod = P08VD3_A396EmprCod[0] ;
         A810RecFec = P08VD3_A810RecFec[0] ;
         A718PrdNom = P08VD3_A718PrdNom[0] ;
         A807RecExiRea = P08VD3_A807RecExiRea[0] ;
         A809RecExiTeo = P08VD3_A809RecExiTeo[0] ;
         A719PrdNum = P08VD3_A719PrdNum[0] ;
         A13455Rechora = P08VD3_A13455Rechora[0] ;
         A718PrdNom = P08VD3_A718PrdNom[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08VD3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8VD4 = false ;
            A396EmprCod = P08VD3_A396EmprCod[0] ;
            A810RecFec = P08VD3_A810RecFec[0] ;
            A719PrdNum = P08VD3_A719PrdNum[0] ;
            AV34count = (long)(AV34count+1) ;
            brk8VD4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV26Option = A718PrdNom ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8VD4 )
         {
            brk8VD4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = informediferenciasrecuento_wcgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = informediferenciasrecuento_wcgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = informediferenciasrecuento_wcgetfilterdata.this.AV33OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28OptionsJson = "" ;
      AV31OptionsDescJson = "" ;
      AV33OptionIndexesJson = "" ;
      AV27Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV30OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV40FilterFullText = "" ;
      AV10TFRecFec = GXutil.nullDate() ;
      AV12TFRechora = GXutil.resetTime( GXutil.nullDate() );
      AV14TFPrdNum = "" ;
      AV15TFPrdNum_Sel = "" ;
      AV16TFPrdNom = "" ;
      AV17TFPrdNom_Sel = "" ;
      AV18TFRecExiTeo = DecimalUtil.ZERO ;
      AV19TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV20TFRecExiRea = DecimalUtil.ZERO ;
      AV21TFRecExiRea_To = DecimalUtil.ZERO ;
      AV41Emprcod = "" ;
      AV42RecFec = GXutil.nullDate() ;
      AV43Desvios = "" ;
      A719PrdNum = "" ;
      AV68Informediferenciasrecuento_wcds_1_filterfulltext = "" ;
      AV69Informediferenciasrecuento_wcds_2_tfrecfec = GXutil.nullDate() ;
      AV70Informediferenciasrecuento_wcds_3_tfrechora = GXutil.resetTime( GXutil.nullDate() );
      AV71Informediferenciasrecuento_wcds_4_tfprdnum = "" ;
      AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel = "" ;
      AV73Informediferenciasrecuento_wcds_6_tfprdnom = "" ;
      AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel = "" ;
      AV75Informediferenciasrecuento_wcds_8_tfrecexiteo = DecimalUtil.ZERO ;
      AV76Informediferenciasrecuento_wcds_9_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV77Informediferenciasrecuento_wcds_10_tfrecexirea = DecimalUtil.ZERO ;
      AV78Informediferenciasrecuento_wcds_11_tfrecexirea_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV68Informediferenciasrecuento_wcds_1_filterfulltext = "" ;
      lV71Informediferenciasrecuento_wcds_4_tfprdnum = "" ;
      lV73Informediferenciasrecuento_wcds_6_tfprdnom = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A810RecFec = GXutil.nullDate() ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      P08VD2_A396EmprCod = new String[] {""} ;
      P08VD2_A719PrdNum = new String[] {""} ;
      P08VD2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VD2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VD2_A718PrdNom = new String[] {""} ;
      P08VD2_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P08VD2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      AV26Option = "" ;
      P08VD3_A396EmprCod = new String[] {""} ;
      P08VD3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08VD3_A718PrdNom = new String[] {""} ;
      P08VD3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VD3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VD3_A719PrdNum = new String[] {""} ;
      P08VD3_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informediferenciasrecuento_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08VD2_A396EmprCod, P08VD2_A719PrdNum, P08VD2_A807RecExiRea, P08VD2_A809RecExiTeo, P08VD2_A718PrdNom, P08VD2_A13455Rechora, P08VD2_A810RecFec
            }
            , new Object[] {
            P08VD3_A396EmprCod, P08VD3_A810RecFec, P08VD3_A718PrdNom, P08VD3_A807RecExiRea, P08VD3_A809RecExiTeo, P08VD3_A719PrdNum, P08VD3_A13455Rechora
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV66GXV1 ;
   private long AV34count ;
   private java.math.BigDecimal AV18TFRecExiTeo ;
   private java.math.BigDecimal AV19TFRecExiTeo_To ;
   private java.math.BigDecimal AV20TFRecExiRea ;
   private java.math.BigDecimal AV21TFRecExiRea_To ;
   private java.math.BigDecimal AV75Informediferenciasrecuento_wcds_8_tfrecexiteo ;
   private java.math.BigDecimal AV76Informediferenciasrecuento_wcds_9_tfrecexiteo_to ;
   private java.math.BigDecimal AV77Informediferenciasrecuento_wcds_10_tfrecexirea ;
   private java.math.BigDecimal AV78Informediferenciasrecuento_wcds_11_tfrecexirea_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private String AV14TFPrdNum ;
   private String AV15TFPrdNum_Sel ;
   private String AV16TFPrdNom ;
   private String AV17TFPrdNom_Sel ;
   private String AV41Emprcod ;
   private String AV43Desvios ;
   private String A719PrdNum ;
   private String AV71Informediferenciasrecuento_wcds_4_tfprdnum ;
   private String AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel ;
   private String AV73Informediferenciasrecuento_wcds_6_tfprdnom ;
   private String AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV71Informediferenciasrecuento_wcds_4_tfprdnum ;
   private String lV73Informediferenciasrecuento_wcds_6_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private java.util.Date AV12TFRechora ;
   private java.util.Date AV70Informediferenciasrecuento_wcds_3_tfrechora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date AV10TFRecFec ;
   private java.util.Date AV42RecFec ;
   private java.util.Date AV69Informediferenciasrecuento_wcds_2_tfrecfec ;
   private java.util.Date A810RecFec ;
   private boolean returnInSub ;
   private boolean brk8VD2 ;
   private boolean brk8VD4 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV68Informediferenciasrecuento_wcds_1_filterfulltext ;
   private String lV68Informediferenciasrecuento_wcds_1_filterfulltext ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08VD2_A396EmprCod ;
   private String[] P08VD2_A719PrdNum ;
   private java.math.BigDecimal[] P08VD2_A807RecExiRea ;
   private java.math.BigDecimal[] P08VD2_A809RecExiTeo ;
   private String[] P08VD2_A718PrdNom ;
   private java.util.Date[] P08VD2_A13455Rechora ;
   private java.util.Date[] P08VD2_A810RecFec ;
   private String[] P08VD3_A396EmprCod ;
   private java.util.Date[] P08VD3_A810RecFec ;
   private String[] P08VD3_A718PrdNom ;
   private java.math.BigDecimal[] P08VD3_A807RecExiRea ;
   private java.math.BigDecimal[] P08VD3_A809RecExiTeo ;
   private String[] P08VD3_A719PrdNum ;
   private java.util.Date[] P08VD3_A13455Rechora ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class informediferenciasrecuento_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Informediferenciasrecuento_wcds_1_filterfulltext ,
                                          java.util.Date AV69Informediferenciasrecuento_wcds_2_tfrecfec ,
                                          java.util.Date AV70Informediferenciasrecuento_wcds_3_tfrechora ,
                                          String AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel ,
                                          String AV71Informediferenciasrecuento_wcds_4_tfprdnum ,
                                          String AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel ,
                                          String AV73Informediferenciasrecuento_wcds_6_tfprdnom ,
                                          java.math.BigDecimal AV75Informediferenciasrecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV76Informediferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV77Informediferenciasrecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV78Informediferenciasrecuento_wcds_11_tfrecexirea_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          java.util.Date AV42RecFec ,
                                          String AV41Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[16];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.RecExiRea, T1.RecExiTeo, T2.PrdNom, T1.Rechora, T1.RecFec FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      if ( ! (GXutil.strcmp("", AV68Informediferenciasrecuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiRea,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69Informediferenciasrecuento_wcds_2_tfrecfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV70Informediferenciasrecuento_wcds_3_tfrechora) )
      {
         addWhere(sWhereString, "(T1.Rechora >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Informediferenciasrecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV73Informediferenciasrecuento_wcds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Informediferenciasrecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Informediferenciasrecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Informediferenciasrecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Informediferenciasrecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.RecFec" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08VD3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV68Informediferenciasrecuento_wcds_1_filterfulltext ,
                                          java.util.Date AV69Informediferenciasrecuento_wcds_2_tfrecfec ,
                                          java.util.Date AV70Informediferenciasrecuento_wcds_3_tfrechora ,
                                          String AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel ,
                                          String AV71Informediferenciasrecuento_wcds_4_tfprdnum ,
                                          String AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel ,
                                          String AV73Informediferenciasrecuento_wcds_6_tfprdnom ,
                                          java.math.BigDecimal AV75Informediferenciasrecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV76Informediferenciasrecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV77Informediferenciasrecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV78Informediferenciasrecuento_wcds_11_tfrecexirea_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          String A396EmprCod ,
                                          String AV41Emprcod ,
                                          java.util.Date AV42RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[16];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecFec, T2.PrdNom, T1.RecExiRea, T1.RecExiTeo, T1.PrdNum, T1.Rechora FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      if ( ! (GXutil.strcmp("", AV68Informediferenciasrecuento_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiRea,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69Informediferenciasrecuento_wcds_2_tfrecfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV70Informediferenciasrecuento_wcds_3_tfrechora) )
      {
         addWhere(sWhereString, "(T1.Rechora >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV71Informediferenciasrecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Informediferenciasrecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV73Informediferenciasrecuento_wcds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Informediferenciasrecuento_wcds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Informediferenciasrecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Informediferenciasrecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Informediferenciasrecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Informediferenciasrecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.PrdNom" ;
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
                  return conditional_P08VD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
            case 1 :
                  return conditional_P08VD3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08VD3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[22]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
               }
               return;
      }
   }

}

