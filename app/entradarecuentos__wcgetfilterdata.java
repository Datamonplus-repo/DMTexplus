package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class entradarecuentos__wcgetfilterdata extends GXProcedure
{
   public entradarecuentos__wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradarecuentos__wcgetfilterdata.class ), "" );
   }

   public entradarecuentos__wcgetfilterdata( int remoteHandle ,
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
      entradarecuentos__wcgetfilterdata.this.aP5 = new String[] {""};
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
      entradarecuentos__wcgetfilterdata.this.AV24DDOName = aP0;
      entradarecuentos__wcgetfilterdata.this.AV22SearchTxt = aP1;
      entradarecuentos__wcgetfilterdata.this.AV23SearchTxtTo = aP2;
      entradarecuentos__wcgetfilterdata.this.aP3 = aP3;
      entradarecuentos__wcgetfilterdata.this.aP4 = aP4;
      entradarecuentos__wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV35Session.getValue("EntradaRecuentos__WCGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "EntradaRecuentos__WCGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("EntradaRecuentos__WCGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV14TFRecExiTeo = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV15TFRecExiTeo_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV41Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV42RecFec = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV22SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV47Entradarecuentos__wcds_1_filterfulltext = AV40FilterFullText ;
      AV48Entradarecuentos__wcds_2_tfprdnum = AV10TFPrdNum ;
      AV49Entradarecuentos__wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV50Entradarecuentos__wcds_4_tfprdnom = AV12TFPrdNom ;
      AV51Entradarecuentos__wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV52Entradarecuentos__wcds_6_tfrecexiteo = AV14TFRecExiTeo ;
      AV53Entradarecuentos__wcds_7_tfrecexiteo_to = AV15TFRecExiTeo_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV47Entradarecuentos__wcds_1_filterfulltext ,
                                           AV49Entradarecuentos__wcds_3_tfprdnum_sel ,
                                           AV48Entradarecuentos__wcds_2_tfprdnum ,
                                           AV51Entradarecuentos__wcds_5_tfprdnom_sel ,
                                           AV50Entradarecuentos__wcds_4_tfprdnom ,
                                           AV52Entradarecuentos__wcds_6_tfrecexiteo ,
                                           AV53Entradarecuentos__wcds_7_tfrecexiteo_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A727PrdRec ,
                                           A810RecFec ,
                                           AV42RecFec ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           AV41Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV47Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV47Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV47Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV48Entradarecuentos__wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV48Entradarecuentos__wcds_2_tfprdnum), 6, "%") ;
      lV50Entradarecuentos__wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV50Entradarecuentos__wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor P09LT2 */
      pr_default.execute(0, new Object[] {AV41Emprcod, AV42RecFec, lV47Entradarecuentos__wcds_1_filterfulltext, lV47Entradarecuentos__wcds_1_filterfulltext, lV47Entradarecuentos__wcds_1_filterfulltext, lV48Entradarecuentos__wcds_2_tfprdnum, AV49Entradarecuentos__wcds_3_tfprdnum_sel, lV50Entradarecuentos__wcds_4_tfprdnom, AV51Entradarecuentos__wcds_5_tfprdnom_sel, AV52Entradarecuentos__wcds_6_tfrecexiteo, AV53Entradarecuentos__wcds_7_tfrecexiteo_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9LT2 = false ;
         A396EmprCod = P09LT2_A396EmprCod[0] ;
         A719PrdNum = P09LT2_A719PrdNum[0] ;
         A13416RecEstInv = P09LT2_A13416RecEstInv[0] ;
         A727PrdRec = P09LT2_A727PrdRec[0] ;
         A810RecFec = P09LT2_A810RecFec[0] ;
         A809RecExiTeo = P09LT2_A809RecExiTeo[0] ;
         A718PrdNom = P09LT2_A718PrdNom[0] ;
         A727PrdRec = P09LT2_A727PrdRec[0] ;
         A718PrdNom = P09LT2_A718PrdNom[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            AV34count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09LT2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09LT2_A719PrdNum[0], A719PrdNum) == 0 ) )
            {
               brk9LT2 = false ;
               A810RecFec = P09LT2_A810RecFec[0] ;
               AV34count = (long)(AV34count+1) ;
               brk9LT2 = true ;
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
         }
         if ( ! brk9LT2 )
         {
            brk9LT2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV22SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV47Entradarecuentos__wcds_1_filterfulltext = AV40FilterFullText ;
      AV48Entradarecuentos__wcds_2_tfprdnum = AV10TFPrdNum ;
      AV49Entradarecuentos__wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV50Entradarecuentos__wcds_4_tfprdnom = AV12TFPrdNom ;
      AV51Entradarecuentos__wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV52Entradarecuentos__wcds_6_tfrecexiteo = AV14TFRecExiTeo ;
      AV53Entradarecuentos__wcds_7_tfrecexiteo_to = AV15TFRecExiTeo_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV47Entradarecuentos__wcds_1_filterfulltext ,
                                           AV49Entradarecuentos__wcds_3_tfprdnum_sel ,
                                           AV48Entradarecuentos__wcds_2_tfprdnum ,
                                           AV51Entradarecuentos__wcds_5_tfprdnom_sel ,
                                           AV50Entradarecuentos__wcds_4_tfprdnom ,
                                           AV52Entradarecuentos__wcds_6_tfrecexiteo ,
                                           AV53Entradarecuentos__wcds_7_tfrecexiteo_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A727PrdRec ,
                                           A810RecFec ,
                                           AV42RecFec ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           AV41Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV47Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV47Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV47Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV47Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV48Entradarecuentos__wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV48Entradarecuentos__wcds_2_tfprdnum), 6, "%") ;
      lV50Entradarecuentos__wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV50Entradarecuentos__wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor P09LT3 */
      pr_default.execute(1, new Object[] {AV41Emprcod, AV42RecFec, lV47Entradarecuentos__wcds_1_filterfulltext, lV47Entradarecuentos__wcds_1_filterfulltext, lV47Entradarecuentos__wcds_1_filterfulltext, lV48Entradarecuentos__wcds_2_tfprdnum, AV49Entradarecuentos__wcds_3_tfprdnum_sel, lV50Entradarecuentos__wcds_4_tfprdnom, AV51Entradarecuentos__wcds_5_tfprdnom_sel, AV52Entradarecuentos__wcds_6_tfrecexiteo, AV53Entradarecuentos__wcds_7_tfrecexiteo_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9LT4 = false ;
         A719PrdNum = P09LT3_A719PrdNum[0] ;
         A396EmprCod = P09LT3_A396EmprCod[0] ;
         A13416RecEstInv = P09LT3_A13416RecEstInv[0] ;
         A727PrdRec = P09LT3_A727PrdRec[0] ;
         A810RecFec = P09LT3_A810RecFec[0] ;
         A809RecExiTeo = P09LT3_A809RecExiTeo[0] ;
         A718PrdNom = P09LT3_A718PrdNom[0] ;
         A727PrdRec = P09LT3_A727PrdRec[0] ;
         A718PrdNom = P09LT3_A718PrdNom[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            AV34count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09LT3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09LT3_A719PrdNum[0], A719PrdNum) == 0 ) )
            {
               brk9LT4 = false ;
               A810RecFec = P09LT3_A810RecFec[0] ;
               AV34count = (long)(AV34count+1) ;
               brk9LT4 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
            {
               AV26Option = A718PrdNom ;
               AV25InsertIndex = 1 ;
               while ( ( AV25InsertIndex <= AV27Options.size() ) && ( GXutil.strcmp((String)AV27Options.elementAt(-1+AV25InsertIndex), AV26Option) < 0 ) )
               {
                  AV25InsertIndex = (int)(AV25InsertIndex+1) ;
               }
               AV27Options.add(AV26Option, AV25InsertIndex);
               AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), AV25InsertIndex);
            }
            if ( AV27Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk9LT4 )
         {
            brk9LT4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = entradarecuentos__wcgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = entradarecuentos__wcgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = entradarecuentos__wcgetfilterdata.this.AV33OptionIndexesJson;
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
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV14TFRecExiTeo = DecimalUtil.ZERO ;
      AV15TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV41Emprcod = "" ;
      AV42RecFec = GXutil.nullDate() ;
      A719PrdNum = "" ;
      AV47Entradarecuentos__wcds_1_filterfulltext = "" ;
      AV48Entradarecuentos__wcds_2_tfprdnum = "" ;
      AV49Entradarecuentos__wcds_3_tfprdnum_sel = "" ;
      AV50Entradarecuentos__wcds_4_tfprdnom = "" ;
      AV51Entradarecuentos__wcds_5_tfprdnom_sel = "" ;
      AV52Entradarecuentos__wcds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV53Entradarecuentos__wcds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV47Entradarecuentos__wcds_1_filterfulltext = "" ;
      lV48Entradarecuentos__wcds_2_tfprdnum = "" ;
      lV50Entradarecuentos__wcds_4_tfprdnom = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      A810RecFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      P09LT2_A396EmprCod = new String[] {""} ;
      P09LT2_A719PrdNum = new String[] {""} ;
      P09LT2_A13416RecEstInv = new byte[1] ;
      P09LT2_A727PrdRec = new String[] {""} ;
      P09LT2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LT2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LT2_A718PrdNom = new String[] {""} ;
      AV26Option = "" ;
      P09LT3_A719PrdNum = new String[] {""} ;
      P09LT3_A396EmprCod = new String[] {""} ;
      P09LT3_A13416RecEstInv = new byte[1] ;
      P09LT3_A727PrdRec = new String[] {""} ;
      P09LT3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LT3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LT3_A718PrdNom = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradarecuentos__wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09LT2_A396EmprCod, P09LT2_A719PrdNum, P09LT2_A13416RecEstInv, P09LT2_A727PrdRec, P09LT2_A810RecFec, P09LT2_A809RecExiTeo, P09LT2_A718PrdNom
            }
            , new Object[] {
            P09LT3_A719PrdNum, P09LT3_A396EmprCod, P09LT3_A13416RecEstInv, P09LT3_A727PrdRec, P09LT3_A810RecFec, P09LT3_A809RecExiTeo, P09LT3_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A13416RecEstInv ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV25InsertIndex ;
   private long AV34count ;
   private java.math.BigDecimal AV14TFRecExiTeo ;
   private java.math.BigDecimal AV15TFRecExiTeo_To ;
   private java.math.BigDecimal AV52Entradarecuentos__wcds_6_tfrecexiteo ;
   private java.math.BigDecimal AV53Entradarecuentos__wcds_7_tfrecexiteo_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV41Emprcod ;
   private String A719PrdNum ;
   private String AV48Entradarecuentos__wcds_2_tfprdnum ;
   private String AV49Entradarecuentos__wcds_3_tfprdnum_sel ;
   private String AV50Entradarecuentos__wcds_4_tfprdnom ;
   private String AV51Entradarecuentos__wcds_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV48Entradarecuentos__wcds_2_tfprdnum ;
   private String lV50Entradarecuentos__wcds_4_tfprdnom ;
   private String A718PrdNom ;
   private String A727PrdRec ;
   private String A396EmprCod ;
   private java.util.Date AV42RecFec ;
   private java.util.Date A810RecFec ;
   private boolean returnInSub ;
   private boolean brk9LT2 ;
   private boolean brk9LT4 ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV40FilterFullText ;
   private String AV47Entradarecuentos__wcds_1_filterfulltext ;
   private String lV47Entradarecuentos__wcds_1_filterfulltext ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09LT2_A396EmprCod ;
   private String[] P09LT2_A719PrdNum ;
   private byte[] P09LT2_A13416RecEstInv ;
   private String[] P09LT2_A727PrdRec ;
   private java.util.Date[] P09LT2_A810RecFec ;
   private java.math.BigDecimal[] P09LT2_A809RecExiTeo ;
   private String[] P09LT2_A718PrdNom ;
   private String[] P09LT3_A719PrdNum ;
   private String[] P09LT3_A396EmprCod ;
   private byte[] P09LT3_A13416RecEstInv ;
   private String[] P09LT3_A727PrdRec ;
   private java.util.Date[] P09LT3_A810RecFec ;
   private java.math.BigDecimal[] P09LT3_A809RecExiTeo ;
   private String[] P09LT3_A718PrdNom ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class entradarecuentos__wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Entradarecuentos__wcds_1_filterfulltext ,
                                          String AV49Entradarecuentos__wcds_3_tfprdnum_sel ,
                                          String AV48Entradarecuentos__wcds_2_tfprdnum ,
                                          String AV51Entradarecuentos__wcds_5_tfprdnom_sel ,
                                          String AV50Entradarecuentos__wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV52Entradarecuentos__wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV53Entradarecuentos__wcds_7_tfrecexiteo_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          String A727PrdRec ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV42RecFec ,
                                          byte A13416RecEstInv ,
                                          String AV41Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[11];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.RecEstInv, T2.PrdRec, T1.RecFec, T1.RecExiTeo, T2.PrdNom FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV47Entradarecuentos__wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Entradarecuentos__wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV48Entradarecuentos__wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Entradarecuentos__wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Entradarecuentos__wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Entradarecuentos__wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Entradarecuentos__wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Entradarecuentos__wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Entradarecuentos__wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.RecFec" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09LT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV47Entradarecuentos__wcds_1_filterfulltext ,
                                          String AV49Entradarecuentos__wcds_3_tfprdnum_sel ,
                                          String AV48Entradarecuentos__wcds_2_tfprdnum ,
                                          String AV51Entradarecuentos__wcds_5_tfprdnom_sel ,
                                          String AV50Entradarecuentos__wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV52Entradarecuentos__wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV53Entradarecuentos__wcds_7_tfrecexiteo_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          String A727PrdRec ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV42RecFec ,
                                          byte A13416RecEstInv ,
                                          String AV41Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[11];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.EmprCod, T1.RecEstInv, T2.PrdRec, T1.RecFec, T1.RecExiTeo, T2.PrdNom FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV47Entradarecuentos__wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49Entradarecuentos__wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV48Entradarecuentos__wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Entradarecuentos__wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51Entradarecuentos__wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV50Entradarecuentos__wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51Entradarecuentos__wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV52Entradarecuentos__wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53Entradarecuentos__wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.RecFec" ;
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
                  return conditional_P09LT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 1 :
                  return conditional_P09LT3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 4);
               }
               return;
      }
   }

}

