package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwldifrecgetfilterdata extends GXProcedure
{
   public webwldifrecgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwldifrecgetfilterdata.class ), "" );
   }

   public webwldifrecgetfilterdata( int remoteHandle ,
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
      webwldifrecgetfilterdata.this.aP5 = new String[] {""};
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
      webwldifrecgetfilterdata.this.AV20DDOName = aP0;
      webwldifrecgetfilterdata.this.AV18SearchTxt = aP1;
      webwldifrecgetfilterdata.this.AV19SearchTxtTo = aP2;
      webwldifrecgetfilterdata.this.aP3 = aP3;
      webwldifrecgetfilterdata.this.aP4 = aP4;
      webwldifrecgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_PRDNOM") == 0 )
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
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("WebWldifrecGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWldifrecGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WebWldifrecGridState"), null, null);
      }
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV47GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "RECFEC") == 0 )
         {
            AV36RecFec = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFEC") == 0 )
         {
            AV10TFRecFec = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECHORA") == 0 )
         {
            AV12TFRechora = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV14TFPrdNum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV15TFPrdNum_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV16TFPrdNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV17TFPrdNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV38TFRecExiTeo = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFRecExiTeo_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV40TFRecExiRea = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV41TFRecExiRea_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV14TFPrdNum = AV18SearchTxt ;
      AV15TFPrdNum_Sel = "" ;
      AV49Webwldifrecds_1_filterfulltext = AV44FilterFullText ;
      AV50Webwldifrecds_2_recfec = AV36RecFec ;
      AV51Webwldifrecds_3_tfrecfec = AV10TFRecFec ;
      AV52Webwldifrecds_4_tfrechora = AV12TFRechora ;
      AV53Webwldifrecds_5_tfprdnum = AV14TFPrdNum ;
      AV54Webwldifrecds_6_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV55Webwldifrecds_7_tfprdnom = AV16TFPrdNom ;
      AV56Webwldifrecds_8_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV57Webwldifrecds_9_tfrecexiteo = AV38TFRecExiTeo ;
      AV58Webwldifrecds_10_tfrecexiteo_to = AV39TFRecExiTeo_To ;
      AV59Webwldifrecds_11_tfrecexirea = AV40TFRecExiRea ;
      AV60Webwldifrecds_12_tfrecexirea_to = AV41TFRecExiRea_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV49Webwldifrecds_1_filterfulltext ,
                                           AV51Webwldifrecds_3_tfrecfec ,
                                           AV52Webwldifrecds_4_tfrechora ,
                                           AV54Webwldifrecds_6_tfprdnum_sel ,
                                           AV53Webwldifrecds_5_tfprdnum ,
                                           AV56Webwldifrecds_8_tfprdnom_sel ,
                                           AV55Webwldifrecds_7_tfprdnom ,
                                           AV57Webwldifrecds_9_tfrecexiteo ,
                                           AV58Webwldifrecds_10_tfrecexiteo_to ,
                                           AV59Webwldifrecds_11_tfrecexirea ,
                                           AV60Webwldifrecds_12_tfrecexirea_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           AV50Webwldifrecds_2_recfec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE
                                           }
      });
      lV53Webwldifrecds_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Webwldifrecds_5_tfprdnum), 6, "%") ;
      lV55Webwldifrecds_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Webwldifrecds_7_tfprdnom), 26, "%") ;
      /* Using cursor P08M12 */
      pr_default.execute(0, new Object[] {lV53Webwldifrecds_5_tfprdnum, AV54Webwldifrecds_6_tfprdnum_sel, lV55Webwldifrecds_7_tfprdnom, AV56Webwldifrecds_8_tfprdnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8M12 = false ;
         A719PrdNum = P08M12_A719PrdNum[0] ;
         A718PrdNom = P08M12_A718PrdNom[0] ;
         A396EmprCod = P08M12_A396EmprCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08M12_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8M12 = false ;
            A396EmprCod = P08M12_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8M12 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
         {
            AV22Option = A719PrdNum ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8M12 )
         {
            brk8M12 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFPrdNom = AV18SearchTxt ;
      AV17TFPrdNom_Sel = "" ;
      AV49Webwldifrecds_1_filterfulltext = AV44FilterFullText ;
      AV50Webwldifrecds_2_recfec = AV36RecFec ;
      AV51Webwldifrecds_3_tfrecfec = AV10TFRecFec ;
      AV52Webwldifrecds_4_tfrechora = AV12TFRechora ;
      AV53Webwldifrecds_5_tfprdnum = AV14TFPrdNum ;
      AV54Webwldifrecds_6_tfprdnum_sel = AV15TFPrdNum_Sel ;
      AV55Webwldifrecds_7_tfprdnom = AV16TFPrdNom ;
      AV56Webwldifrecds_8_tfprdnom_sel = AV17TFPrdNom_Sel ;
      AV57Webwldifrecds_9_tfrecexiteo = AV38TFRecExiTeo ;
      AV58Webwldifrecds_10_tfrecexiteo_to = AV39TFRecExiTeo_To ;
      AV59Webwldifrecds_11_tfrecexirea = AV40TFRecExiRea ;
      AV60Webwldifrecds_12_tfrecexirea_to = AV41TFRecExiRea_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV49Webwldifrecds_1_filterfulltext ,
                                           AV51Webwldifrecds_3_tfrecfec ,
                                           AV52Webwldifrecds_4_tfrechora ,
                                           AV54Webwldifrecds_6_tfprdnum_sel ,
                                           AV53Webwldifrecds_5_tfprdnum ,
                                           AV56Webwldifrecds_8_tfprdnom_sel ,
                                           AV55Webwldifrecds_7_tfprdnom ,
                                           AV57Webwldifrecds_9_tfrecexiteo ,
                                           AV58Webwldifrecds_10_tfrecexiteo_to ,
                                           AV59Webwldifrecds_11_tfrecexirea ,
                                           AV60Webwldifrecds_12_tfrecexirea_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           AV50Webwldifrecds_2_recfec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE
                                           }
      });
      lV53Webwldifrecds_5_tfprdnum = GXutil.padr( GXutil.rtrim( AV53Webwldifrecds_5_tfprdnum), 6, "%") ;
      lV55Webwldifrecds_7_tfprdnom = GXutil.padr( GXutil.rtrim( AV55Webwldifrecds_7_tfprdnom), 26, "%") ;
      /* Using cursor P08M13 */
      pr_default.execute(1, new Object[] {lV53Webwldifrecds_5_tfprdnum, AV54Webwldifrecds_6_tfprdnum_sel, lV55Webwldifrecds_7_tfprdnom, AV56Webwldifrecds_8_tfprdnom_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8M14 = false ;
         A718PrdNom = P08M13_A718PrdNom[0] ;
         A719PrdNum = P08M13_A719PrdNum[0] ;
         A396EmprCod = P08M13_A396EmprCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08M13_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8M14 = false ;
            A719PrdNum = P08M13_A719PrdNum[0] ;
            A396EmprCod = P08M13_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8M14 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
         {
            AV22Option = A718PrdNom ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8M14 )
         {
            brk8M14 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwldifrecgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = webwldifrecgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = webwldifrecgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44FilterFullText = "" ;
      AV36RecFec = GXutil.nullDate() ;
      AV10TFRecFec = GXutil.nullDate() ;
      AV12TFRechora = GXutil.resetTime( GXutil.nullDate() );
      AV14TFPrdNum = "" ;
      AV15TFPrdNum_Sel = "" ;
      AV16TFPrdNom = "" ;
      AV17TFPrdNom_Sel = "" ;
      AV38TFRecExiTeo = DecimalUtil.ZERO ;
      AV39TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV40TFRecExiRea = DecimalUtil.ZERO ;
      AV41TFRecExiRea_To = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV49Webwldifrecds_1_filterfulltext = "" ;
      AV50Webwldifrecds_2_recfec = GXutil.nullDate() ;
      AV51Webwldifrecds_3_tfrecfec = GXutil.nullDate() ;
      AV52Webwldifrecds_4_tfrechora = GXutil.resetTime( GXutil.nullDate() );
      AV53Webwldifrecds_5_tfprdnum = "" ;
      AV54Webwldifrecds_6_tfprdnum_sel = "" ;
      AV55Webwldifrecds_7_tfprdnom = "" ;
      AV56Webwldifrecds_8_tfprdnom_sel = "" ;
      AV57Webwldifrecds_9_tfrecexiteo = DecimalUtil.ZERO ;
      AV58Webwldifrecds_10_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV59Webwldifrecds_11_tfrecexirea = DecimalUtil.ZERO ;
      AV60Webwldifrecds_12_tfrecexirea_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV53Webwldifrecds_5_tfprdnum = "" ;
      lV55Webwldifrecds_7_tfprdnom = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      P08M12_A719PrdNum = new String[] {""} ;
      P08M12_A718PrdNom = new String[] {""} ;
      P08M12_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      P08M13_A718PrdNom = new String[] {""} ;
      P08M13_A719PrdNum = new String[] {""} ;
      P08M13_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwldifrecgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08M12_A719PrdNum, P08M12_A718PrdNom, P08M12_A396EmprCod
            }
            , new Object[] {
            P08M13_A718PrdNom, P08M13_A719PrdNum, P08M13_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV47GXV1 ;
   private long AV30count ;
   private java.math.BigDecimal AV38TFRecExiTeo ;
   private java.math.BigDecimal AV39TFRecExiTeo_To ;
   private java.math.BigDecimal AV40TFRecExiRea ;
   private java.math.BigDecimal AV41TFRecExiRea_To ;
   private java.math.BigDecimal AV57Webwldifrecds_9_tfrecexiteo ;
   private java.math.BigDecimal AV58Webwldifrecds_10_tfrecexiteo_to ;
   private java.math.BigDecimal AV59Webwldifrecds_11_tfrecexirea ;
   private java.math.BigDecimal AV60Webwldifrecds_12_tfrecexirea_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private String AV14TFPrdNum ;
   private String AV15TFPrdNum_Sel ;
   private String AV16TFPrdNom ;
   private String AV17TFPrdNom_Sel ;
   private String A719PrdNum ;
   private String AV53Webwldifrecds_5_tfprdnum ;
   private String AV54Webwldifrecds_6_tfprdnum_sel ;
   private String AV55Webwldifrecds_7_tfprdnom ;
   private String AV56Webwldifrecds_8_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV53Webwldifrecds_5_tfprdnum ;
   private String lV55Webwldifrecds_7_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private java.util.Date AV12TFRechora ;
   private java.util.Date AV52Webwldifrecds_4_tfrechora ;
   private java.util.Date AV36RecFec ;
   private java.util.Date AV10TFRecFec ;
   private java.util.Date AV50Webwldifrecds_2_recfec ;
   private java.util.Date AV51Webwldifrecds_3_tfrecfec ;
   private boolean returnInSub ;
   private boolean brk8M12 ;
   private boolean brk8M14 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV44FilterFullText ;
   private String AV49Webwldifrecds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08M12_A719PrdNum ;
   private String[] P08M12_A718PrdNom ;
   private String[] P08M12_A396EmprCod ;
   private String[] P08M13_A718PrdNom ;
   private String[] P08M13_A719PrdNum ;
   private String[] P08M13_A396EmprCod ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class webwldifrecgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08M12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Webwldifrecds_1_filterfulltext ,
                                          java.util.Date AV51Webwldifrecds_3_tfrecfec ,
                                          java.util.Date AV52Webwldifrecds_4_tfrechora ,
                                          String AV54Webwldifrecds_6_tfprdnum_sel ,
                                          String AV53Webwldifrecds_5_tfprdnum ,
                                          String AV56Webwldifrecds_8_tfprdnom_sel ,
                                          String AV55Webwldifrecds_7_tfprdnom ,
                                          java.math.BigDecimal AV57Webwldifrecds_9_tfrecexiteo ,
                                          java.math.BigDecimal AV58Webwldifrecds_10_tfrecexiteo_to ,
                                          java.math.BigDecimal AV59Webwldifrecds_11_tfrecexirea ,
                                          java.math.BigDecimal AV60Webwldifrecds_12_tfrecexirea_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.util.Date AV50Webwldifrecds_2_recfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[4];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC" ;
      if ( (GXutil.strcmp("", AV54Webwldifrecds_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Webwldifrecds_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Webwldifrecds_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Webwldifrecds_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Webwldifrecds_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Webwldifrecds_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdNum" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08M13( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV49Webwldifrecds_1_filterfulltext ,
                                          java.util.Date AV51Webwldifrecds_3_tfrecfec ,
                                          java.util.Date AV52Webwldifrecds_4_tfrechora ,
                                          String AV54Webwldifrecds_6_tfprdnum_sel ,
                                          String AV53Webwldifrecds_5_tfprdnum ,
                                          String AV56Webwldifrecds_8_tfprdnom_sel ,
                                          String AV55Webwldifrecds_7_tfprdnom ,
                                          java.math.BigDecimal AV57Webwldifrecds_9_tfrecexiteo ,
                                          java.math.BigDecimal AV58Webwldifrecds_10_tfrecexiteo_to ,
                                          java.math.BigDecimal AV59Webwldifrecds_11_tfrecexirea ,
                                          java.math.BigDecimal AV60Webwldifrecds_12_tfrecexirea_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.util.Date AV50Webwldifrecds_2_recfec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[4];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT PrdNom, PrdNum, EmprCod FROM TXPPRODUC" ;
      if ( (GXutil.strcmp("", AV54Webwldifrecds_6_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV53Webwldifrecds_5_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Webwldifrecds_6_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Webwldifrecds_8_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV55Webwldifrecds_7_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Webwldifrecds_8_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrdNom" ;
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
                  return conditional_P08M12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.util.Date)dynConstraints[17] );
            case 1 :
                  return conditional_P08M13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.util.Date)dynConstraints[17] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08M12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08M13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setString(sIdx, (String)parms[4], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 6);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[5], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 26);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 26);
               }
               return;
      }
   }

}

