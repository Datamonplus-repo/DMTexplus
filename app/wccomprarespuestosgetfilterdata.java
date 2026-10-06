package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wccomprarespuestosgetfilterdata extends GXProcedure
{
   public wccomprarespuestosgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccomprarespuestosgetfilterdata.class ), "" );
   }

   public wccomprarespuestosgetfilterdata( int remoteHandle ,
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
      wccomprarespuestosgetfilterdata.this.aP5 = new String[] {""};
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
      wccomprarespuestosgetfilterdata.this.AV30DDOName = aP0;
      wccomprarespuestosgetfilterdata.this.AV28SearchTxt = aP1;
      wccomprarespuestosgetfilterdata.this.AV29SearchTxtTo = aP2;
      wccomprarespuestosgetfilterdata.this.aP3 = aP3;
      wccomprarespuestosgetfilterdata.this.aP4 = aP4;
      wccomprarespuestosgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_MRNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMRNOMOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV41Session.getValue("WCCompraRespuestosGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCCompraRespuestosGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV41Session.getValue("WCCompraRespuestosGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM") == 0 )
         {
            AV16TFMRNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRNOM_SEL") == 0 )
         {
            AV17TFMRNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMRCOD") == 0 )
         {
            AV14TFMRCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFMRCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLCNT") == 0 )
         {
            AV18TFMComSolCnt = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV19TFMComSolCnt_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMSOLPRE") == 0 )
         {
            AV22TFMComSolPre = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFMComSolPre_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTCNT") == 0 )
         {
            AV26TFMComEntCnt = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFMComEntCnt_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMCOMENTPRE") == 0 )
         {
            AV24TFMComEntPre = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFMComEntPre_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV47EmprCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MCOMCOD") == 0 )
         {
            AV48MComCod = GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMRNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMRNom = AV28SearchTxt ;
      AV17TFMRNom_Sel = "" ;
      AV53Wccomprarespuestosds_1_emprcod = AV47EmprCod ;
      AV54Wccomprarespuestosds_2_mcomcod = AV48MComCod ;
      AV55Wccomprarespuestosds_3_filterfulltext = AV46FilterFullText ;
      AV56Wccomprarespuestosds_4_tfmrnom = AV16TFMRNom ;
      AV57Wccomprarespuestosds_5_tfmrnom_sel = AV17TFMRNom_Sel ;
      AV58Wccomprarespuestosds_6_tfmrcod = AV14TFMRCod ;
      AV59Wccomprarespuestosds_7_tfmrcod_to = AV15TFMRCod_To ;
      AV60Wccomprarespuestosds_8_tfmcomsolcnt = AV18TFMComSolCnt ;
      AV61Wccomprarespuestosds_9_tfmcomsolcnt_to = AV19TFMComSolCnt_To ;
      AV62Wccomprarespuestosds_10_tfmcomsolpre = AV22TFMComSolPre ;
      AV63Wccomprarespuestosds_11_tfmcomsolpre_to = AV23TFMComSolPre_To ;
      AV64Wccomprarespuestosds_12_tfmcomentcnt = AV26TFMComEntCnt ;
      AV65Wccomprarespuestosds_13_tfmcomentcnt_to = AV27TFMComEntCnt_To ;
      AV66Wccomprarespuestosds_14_tfmcomentpre = AV24TFMComEntPre ;
      AV67Wccomprarespuestosds_15_tfmcomentpre_to = AV25TFMComEntPre_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Wccomprarespuestosds_3_filterfulltext ,
                                           AV57Wccomprarespuestosds_5_tfmrnom_sel ,
                                           AV56Wccomprarespuestosds_4_tfmrnom ,
                                           Integer.valueOf(AV58Wccomprarespuestosds_6_tfmrcod) ,
                                           Integer.valueOf(AV59Wccomprarespuestosds_7_tfmrcod_to) ,
                                           AV60Wccomprarespuestosds_8_tfmcomsolcnt ,
                                           AV61Wccomprarespuestosds_9_tfmcomsolcnt_to ,
                                           AV62Wccomprarespuestosds_10_tfmcomsolpre ,
                                           AV63Wccomprarespuestosds_11_tfmcomsolpre_to ,
                                           AV64Wccomprarespuestosds_12_tfmcomentcnt ,
                                           AV65Wccomprarespuestosds_13_tfmcomentcnt_to ,
                                           AV66Wccomprarespuestosds_14_tfmcomentpre ,
                                           AV67Wccomprarespuestosds_15_tfmcomentpre_to ,
                                           A9493MRNom ,
                                           Integer.valueOf(A9492MRCod) ,
                                           A11051MComSolCnt ,
                                           A11052MComSolPre ,
                                           A11053MComEntCnt ,
                                           A11054MComEntPre ,
                                           AV53Wccomprarespuestosds_1_emprcod ,
                                           Long.valueOf(AV54Wccomprarespuestosds_2_mcomcod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A11055MComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV55Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV55Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV55Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV55Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV55Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV55Wccomprarespuestosds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Wccomprarespuestosds_3_filterfulltext), "%", "") ;
      lV56Wccomprarespuestosds_4_tfmrnom = GXutil.padr( GXutil.rtrim( AV56Wccomprarespuestosds_4_tfmrnom), 100, "%") ;
      /* Using cursor P08PY2 */
      pr_default.execute(0, new Object[] {AV53Wccomprarespuestosds_1_emprcod, Long.valueOf(AV54Wccomprarespuestosds_2_mcomcod), lV55Wccomprarespuestosds_3_filterfulltext, lV55Wccomprarespuestosds_3_filterfulltext, lV55Wccomprarespuestosds_3_filterfulltext, lV55Wccomprarespuestosds_3_filterfulltext, lV55Wccomprarespuestosds_3_filterfulltext, lV55Wccomprarespuestosds_3_filterfulltext, lV56Wccomprarespuestosds_4_tfmrnom, AV57Wccomprarespuestosds_5_tfmrnom_sel, Integer.valueOf(AV58Wccomprarespuestosds_6_tfmrcod), Integer.valueOf(AV59Wccomprarespuestosds_7_tfmrcod_to), AV60Wccomprarespuestosds_8_tfmcomsolcnt, AV61Wccomprarespuestosds_9_tfmcomsolcnt_to, AV62Wccomprarespuestosds_10_tfmcomsolpre, AV63Wccomprarespuestosds_11_tfmcomsolpre_to, AV64Wccomprarespuestosds_12_tfmcomentcnt, AV65Wccomprarespuestosds_13_tfmcomentcnt_to, AV66Wccomprarespuestosds_14_tfmcomentpre, AV67Wccomprarespuestosds_15_tfmcomentpre_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8PY2 = false ;
         A9492MRCod = P08PY2_A9492MRCod[0] ;
         A11055MComCod = P08PY2_A11055MComCod[0] ;
         A396EmprCod = P08PY2_A396EmprCod[0] ;
         A11054MComEntPre = P08PY2_A11054MComEntPre[0] ;
         A11053MComEntCnt = P08PY2_A11053MComEntCnt[0] ;
         A11052MComSolPre = P08PY2_A11052MComSolPre[0] ;
         A11051MComSolCnt = P08PY2_A11051MComSolCnt[0] ;
         A9493MRNom = P08PY2_A9493MRNom[0] ;
         n9493MRNom = P08PY2_n9493MRNom[0] ;
         A9493MRNom = P08PY2_A9493MRNom[0] ;
         n9493MRNom = P08PY2_n9493MRNom[0] ;
         AV40count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08PY2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08PY2_A11055MComCod[0] == A11055MComCod ) && ( P08PY2_A9492MRCod[0] == A9492MRCod ) )
         {
            brk8PY2 = false ;
            AV40count = (long)(AV40count+1) ;
            brk8PY2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A9493MRNom)==0) )
         {
            AV32Option = A9493MRNom ;
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
         if ( ! brk8PY2 )
         {
            brk8PY2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wccomprarespuestosgetfilterdata.this.AV34OptionsJson;
      this.aP4[0] = wccomprarespuestosgetfilterdata.this.AV37OptionsDescJson;
      this.aP5[0] = wccomprarespuestosgetfilterdata.this.AV39OptionIndexesJson;
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
      AV16TFMRNom = "" ;
      AV17TFMRNom_Sel = "" ;
      AV18TFMComSolCnt = DecimalUtil.ZERO ;
      AV19TFMComSolCnt_To = DecimalUtil.ZERO ;
      AV22TFMComSolPre = DecimalUtil.ZERO ;
      AV23TFMComSolPre_To = DecimalUtil.ZERO ;
      AV26TFMComEntCnt = DecimalUtil.ZERO ;
      AV27TFMComEntCnt_To = DecimalUtil.ZERO ;
      AV24TFMComEntPre = DecimalUtil.ZERO ;
      AV25TFMComEntPre_To = DecimalUtil.ZERO ;
      AV47EmprCod = "" ;
      A9493MRNom = "" ;
      AV53Wccomprarespuestosds_1_emprcod = "" ;
      AV55Wccomprarespuestosds_3_filterfulltext = "" ;
      AV56Wccomprarespuestosds_4_tfmrnom = "" ;
      AV57Wccomprarespuestosds_5_tfmrnom_sel = "" ;
      AV60Wccomprarespuestosds_8_tfmcomsolcnt = DecimalUtil.ZERO ;
      AV61Wccomprarespuestosds_9_tfmcomsolcnt_to = DecimalUtil.ZERO ;
      AV62Wccomprarespuestosds_10_tfmcomsolpre = DecimalUtil.ZERO ;
      AV63Wccomprarespuestosds_11_tfmcomsolpre_to = DecimalUtil.ZERO ;
      AV64Wccomprarespuestosds_12_tfmcomentcnt = DecimalUtil.ZERO ;
      AV65Wccomprarespuestosds_13_tfmcomentcnt_to = DecimalUtil.ZERO ;
      AV66Wccomprarespuestosds_14_tfmcomentpre = DecimalUtil.ZERO ;
      AV67Wccomprarespuestosds_15_tfmcomentpre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV55Wccomprarespuestosds_3_filterfulltext = "" ;
      lV56Wccomprarespuestosds_4_tfmrnom = "" ;
      A11051MComSolCnt = DecimalUtil.ZERO ;
      A11052MComSolPre = DecimalUtil.ZERO ;
      A11053MComEntCnt = DecimalUtil.ZERO ;
      A11054MComEntPre = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      P08PY2_A9492MRCod = new int[1] ;
      P08PY2_A11055MComCod = new long[1] ;
      P08PY2_A396EmprCod = new String[] {""} ;
      P08PY2_A11054MComEntPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PY2_A11053MComEntCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PY2_A11052MComSolPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PY2_A11051MComSolCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08PY2_A9493MRNom = new String[] {""} ;
      P08PY2_n9493MRNom = new boolean[] {false} ;
      AV32Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wccomprarespuestosgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08PY2_A9492MRCod, P08PY2_A11055MComCod, P08PY2_A396EmprCod, P08PY2_A11054MComEntPre, P08PY2_A11053MComEntCnt, P08PY2_A11052MComSolPre, P08PY2_A11051MComSolCnt, P08PY2_A9493MRNom, P08PY2_n9493MRNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV51GXV1 ;
   private int AV14TFMRCod ;
   private int AV15TFMRCod_To ;
   private int AV58Wccomprarespuestosds_6_tfmrcod ;
   private int AV59Wccomprarespuestosds_7_tfmrcod_to ;
   private int A9492MRCod ;
   private int AV31InsertIndex ;
   private long AV48MComCod ;
   private long AV54Wccomprarespuestosds_2_mcomcod ;
   private long A11055MComCod ;
   private long AV40count ;
   private java.math.BigDecimal AV18TFMComSolCnt ;
   private java.math.BigDecimal AV19TFMComSolCnt_To ;
   private java.math.BigDecimal AV22TFMComSolPre ;
   private java.math.BigDecimal AV23TFMComSolPre_To ;
   private java.math.BigDecimal AV26TFMComEntCnt ;
   private java.math.BigDecimal AV27TFMComEntCnt_To ;
   private java.math.BigDecimal AV24TFMComEntPre ;
   private java.math.BigDecimal AV25TFMComEntPre_To ;
   private java.math.BigDecimal AV60Wccomprarespuestosds_8_tfmcomsolcnt ;
   private java.math.BigDecimal AV61Wccomprarespuestosds_9_tfmcomsolcnt_to ;
   private java.math.BigDecimal AV62Wccomprarespuestosds_10_tfmcomsolpre ;
   private java.math.BigDecimal AV63Wccomprarespuestosds_11_tfmcomsolpre_to ;
   private java.math.BigDecimal AV64Wccomprarespuestosds_12_tfmcomentcnt ;
   private java.math.BigDecimal AV65Wccomprarespuestosds_13_tfmcomentcnt_to ;
   private java.math.BigDecimal AV66Wccomprarespuestosds_14_tfmcomentpre ;
   private java.math.BigDecimal AV67Wccomprarespuestosds_15_tfmcomentpre_to ;
   private java.math.BigDecimal A11051MComSolCnt ;
   private java.math.BigDecimal A11052MComSolPre ;
   private java.math.BigDecimal A11053MComEntCnt ;
   private java.math.BigDecimal A11054MComEntPre ;
   private String AV16TFMRNom ;
   private String AV17TFMRNom_Sel ;
   private String AV47EmprCod ;
   private String A9493MRNom ;
   private String AV53Wccomprarespuestosds_1_emprcod ;
   private String AV56Wccomprarespuestosds_4_tfmrnom ;
   private String AV57Wccomprarespuestosds_5_tfmrnom_sel ;
   private String scmdbuf ;
   private String lV56Wccomprarespuestosds_4_tfmrnom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8PY2 ;
   private boolean n9493MRNom ;
   private String AV34OptionsJson ;
   private String AV37OptionsDescJson ;
   private String AV39OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV28SearchTxt ;
   private String AV29SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV55Wccomprarespuestosds_3_filterfulltext ;
   private String lV55Wccomprarespuestosds_3_filterfulltext ;
   private String AV32Option ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08PY2_A9492MRCod ;
   private long[] P08PY2_A11055MComCod ;
   private String[] P08PY2_A396EmprCod ;
   private java.math.BigDecimal[] P08PY2_A11054MComEntPre ;
   private java.math.BigDecimal[] P08PY2_A11053MComEntCnt ;
   private java.math.BigDecimal[] P08PY2_A11052MComSolPre ;
   private java.math.BigDecimal[] P08PY2_A11051MComSolCnt ;
   private String[] P08PY2_A9493MRNom ;
   private boolean[] P08PY2_n9493MRNom ;
   private GXSimpleCollection<String> AV33Options ;
   private GXSimpleCollection<String> AV36OptionsDesc ;
   private GXSimpleCollection<String> AV38OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class wccomprarespuestosgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08PY2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Wccomprarespuestosds_3_filterfulltext ,
                                          String AV57Wccomprarespuestosds_5_tfmrnom_sel ,
                                          String AV56Wccomprarespuestosds_4_tfmrnom ,
                                          int AV58Wccomprarespuestosds_6_tfmrcod ,
                                          int AV59Wccomprarespuestosds_7_tfmrcod_to ,
                                          java.math.BigDecimal AV60Wccomprarespuestosds_8_tfmcomsolcnt ,
                                          java.math.BigDecimal AV61Wccomprarespuestosds_9_tfmcomsolcnt_to ,
                                          java.math.BigDecimal AV62Wccomprarespuestosds_10_tfmcomsolpre ,
                                          java.math.BigDecimal AV63Wccomprarespuestosds_11_tfmcomsolpre_to ,
                                          java.math.BigDecimal AV64Wccomprarespuestosds_12_tfmcomentcnt ,
                                          java.math.BigDecimal AV65Wccomprarespuestosds_13_tfmcomentcnt_to ,
                                          java.math.BigDecimal AV66Wccomprarespuestosds_14_tfmcomentpre ,
                                          java.math.BigDecimal AV67Wccomprarespuestosds_15_tfmcomentpre_to ,
                                          String A9493MRNom ,
                                          int A9492MRCod ,
                                          java.math.BigDecimal A11051MComSolCnt ,
                                          java.math.BigDecimal A11052MComSolPre ,
                                          java.math.BigDecimal A11053MComEntCnt ,
                                          java.math.BigDecimal A11054MComEntPre ,
                                          String AV53Wccomprarespuestosds_1_emprcod ,
                                          long AV54Wccomprarespuestosds_2_mcomcod ,
                                          String A396EmprCod ,
                                          long A11055MComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[20];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.MRCod, T1.MComCod, T1.EmprCod, T1.MComEntPre, T1.MComEntCnt, T1.MComSolPre, T1.MComSolCnt, T2.MRNom FROM (TXPMRepC1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MRCod = T1.MRCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MComCod = ?)");
      if ( ! (GXutil.strcmp("", AV55Wccomprarespuestosds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T2.MRNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MRCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComSolCnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComSolPre,'99999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComEntCnt,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MComEntPre,'99999990.999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Wccomprarespuestosds_5_tfmrnom_sel)==0) && ( ! (GXutil.strcmp("", AV56Wccomprarespuestosds_4_tfmrnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MRNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Wccomprarespuestosds_5_tfmrnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MRNom = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV58Wccomprarespuestosds_6_tfmrcod) )
      {
         addWhere(sWhereString, "(T1.MRCod >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV59Wccomprarespuestosds_7_tfmrcod_to) )
      {
         addWhere(sWhereString, "(T1.MRCod <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60Wccomprarespuestosds_8_tfmcomsolcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolCnt >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Wccomprarespuestosds_9_tfmcomsolcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolCnt <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Wccomprarespuestosds_10_tfmcomsolpre)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolPre >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Wccomprarespuestosds_11_tfmcomsolpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComSolPre <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Wccomprarespuestosds_12_tfmcomentcnt)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntCnt >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Wccomprarespuestosds_13_tfmcomentcnt_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntCnt <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Wccomprarespuestosds_14_tfmcomentpre)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntPre >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Wccomprarespuestosds_15_tfmcomentpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.MComEntPre <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MComCod, T1.MRCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
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
                  return conditional_P08PY2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).longValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08PY2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 100);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 3);
               }
               return;
      }
   }

}

