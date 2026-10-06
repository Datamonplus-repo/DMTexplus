package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwconreinfinitegetfilterdata extends GXProcedure
{
   public webwconreinfinitegetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwconreinfinitegetfilterdata.class ), "" );
   }

   public webwconreinfinitegetfilterdata( int remoteHandle ,
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
      webwconreinfinitegetfilterdata.this.aP5 = new String[] {""};
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
      webwconreinfinitegetfilterdata.this.AV16DDOName = aP0;
      webwconreinfinitegetfilterdata.this.AV14SearchTxt = aP1;
      webwconreinfinitegetfilterdata.this.AV15SearchTxtTo = aP2;
      webwconreinfinitegetfilterdata.this.aP3 = aP3;
      webwconreinfinitegetfilterdata.this.aP4 = aP4;
      webwconreinfinitegetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDNUM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRDNOM") == 0 )
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
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("WebWConreInfiniteGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWConreInfiniteGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("WebWConreInfiniteGridState"), null, null);
      }
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV55GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV10TFPrdNum = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV11TFPrdNum_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV12TFPrdNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV13TFPrdNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV44TFRecExiTeo = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFRecExiTeo_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITCC") == 0 )
         {
            AV50TFRecExiTcc = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFRecExiTcc_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV14SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV57Webwconreinfiniteds_1_tfprdnum = AV10TFPrdNum ;
      AV58Webwconreinfiniteds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV59Webwconreinfiniteds_3_tfprdnom = AV12TFPrdNom ;
      AV60Webwconreinfiniteds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV61Webwconreinfiniteds_5_tfrecexiteo = AV44TFRecExiTeo ;
      AV62Webwconreinfiniteds_6_tfrecexiteo_to = AV45TFRecExiTeo_To ;
      AV63Webwconreinfiniteds_7_tfrecexitcc = AV50TFRecExiTcc ;
      AV64Webwconreinfiniteds_8_tfrecexitcc_to = AV51TFRecExiTcc_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Webwconreinfiniteds_2_tfprdnum_sel ,
                                           AV57Webwconreinfiniteds_1_tfprdnum ,
                                           AV60Webwconreinfiniteds_4_tfprdnom_sel ,
                                           AV59Webwconreinfiniteds_3_tfprdnom ,
                                           AV61Webwconreinfiniteds_5_tfrecexiteo ,
                                           AV62Webwconreinfiniteds_6_tfrecexiteo_to ,
                                           AV63Webwconreinfiniteds_7_tfrecexitcc ,
                                           AV64Webwconreinfiniteds_8_tfrecexitcc_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A808RecExiTcc ,
                                           A727PrdRec ,
                                           A810RecFec ,
                                           AV43RecFec ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           AV48EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Webwconreinfiniteds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV57Webwconreinfiniteds_1_tfprdnum), 6, "%") ;
      lV59Webwconreinfiniteds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Webwconreinfiniteds_3_tfprdnom), 26, "%") ;
      /* Using cursor P08M72 */
      pr_default.execute(0, new Object[] {AV48EmprCod, AV43RecFec, lV57Webwconreinfiniteds_1_tfprdnum, AV58Webwconreinfiniteds_2_tfprdnum_sel, lV59Webwconreinfiniteds_3_tfprdnom, AV60Webwconreinfiniteds_4_tfprdnom_sel, AV61Webwconreinfiniteds_5_tfrecexiteo, AV62Webwconreinfiniteds_6_tfrecexiteo_to, AV63Webwconreinfiniteds_7_tfrecexitcc, AV64Webwconreinfiniteds_8_tfrecexitcc_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8M72 = false ;
         A396EmprCod = P08M72_A396EmprCod[0] ;
         A719PrdNum = P08M72_A719PrdNum[0] ;
         A13416RecEstInv = P08M72_A13416RecEstInv[0] ;
         A727PrdRec = P08M72_A727PrdRec[0] ;
         A810RecFec = P08M72_A810RecFec[0] ;
         A808RecExiTcc = P08M72_A808RecExiTcc[0] ;
         A809RecExiTeo = P08M72_A809RecExiTeo[0] ;
         A718PrdNom = P08M72_A718PrdNom[0] ;
         A727PrdRec = P08M72_A727PrdRec[0] ;
         A718PrdNom = P08M72_A718PrdNom[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            AV26count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08M72_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08M72_A719PrdNum[0], A719PrdNum) == 0 ) )
            {
               brk8M72 = false ;
               A810RecFec = P08M72_A810RecFec[0] ;
               AV26count = (long)(AV26count+1) ;
               brk8M72 = true ;
               pr_default.readNext(0);
            }
            if ( ! (GXutil.strcmp("", A719PrdNum)==0) )
            {
               AV18Option = A719PrdNum ;
               AV19Options.add(AV18Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8M72 )
         {
            brk8M72 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPRDNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrdNom = AV14SearchTxt ;
      AV13TFPrdNom_Sel = "" ;
      AV57Webwconreinfiniteds_1_tfprdnum = AV10TFPrdNum ;
      AV58Webwconreinfiniteds_2_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV59Webwconreinfiniteds_3_tfprdnom = AV12TFPrdNom ;
      AV60Webwconreinfiniteds_4_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV61Webwconreinfiniteds_5_tfrecexiteo = AV44TFRecExiTeo ;
      AV62Webwconreinfiniteds_6_tfrecexiteo_to = AV45TFRecExiTeo_To ;
      AV63Webwconreinfiniteds_7_tfrecexitcc = AV50TFRecExiTcc ;
      AV64Webwconreinfiniteds_8_tfrecexitcc_to = AV51TFRecExiTcc_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV58Webwconreinfiniteds_2_tfprdnum_sel ,
                                           AV57Webwconreinfiniteds_1_tfprdnum ,
                                           AV60Webwconreinfiniteds_4_tfprdnom_sel ,
                                           AV59Webwconreinfiniteds_3_tfprdnom ,
                                           AV61Webwconreinfiniteds_5_tfrecexiteo ,
                                           AV62Webwconreinfiniteds_6_tfrecexiteo_to ,
                                           AV63Webwconreinfiniteds_7_tfrecexitcc ,
                                           AV64Webwconreinfiniteds_8_tfrecexitcc_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A808RecExiTcc ,
                                           A727PrdRec ,
                                           A396EmprCod ,
                                           AV48EmprCod ,
                                           A810RecFec ,
                                           AV43RecFec ,
                                           Byte.valueOf(A13416RecEstInv) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE
                                           }
      });
      lV57Webwconreinfiniteds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV57Webwconreinfiniteds_1_tfprdnum), 6, "%") ;
      lV59Webwconreinfiniteds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV59Webwconreinfiniteds_3_tfprdnom), 26, "%") ;
      /* Using cursor P08M73 */
      pr_default.execute(1, new Object[] {AV48EmprCod, AV43RecFec, lV57Webwconreinfiniteds_1_tfprdnum, AV58Webwconreinfiniteds_2_tfprdnum_sel, lV59Webwconreinfiniteds_3_tfprdnom, AV60Webwconreinfiniteds_4_tfprdnom_sel, AV61Webwconreinfiniteds_5_tfrecexiteo, AV62Webwconreinfiniteds_6_tfrecexiteo_to, AV63Webwconreinfiniteds_7_tfrecexitcc, AV64Webwconreinfiniteds_8_tfrecexitcc_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8M74 = false ;
         A396EmprCod = P08M73_A396EmprCod[0] ;
         A810RecFec = P08M73_A810RecFec[0] ;
         A13416RecEstInv = P08M73_A13416RecEstInv[0] ;
         A718PrdNom = P08M73_A718PrdNom[0] ;
         A727PrdRec = P08M73_A727PrdRec[0] ;
         A808RecExiTcc = P08M73_A808RecExiTcc[0] ;
         A809RecExiTeo = P08M73_A809RecExiTeo[0] ;
         A719PrdNum = P08M73_A719PrdNum[0] ;
         A718PrdNom = P08M73_A718PrdNom[0] ;
         A727PrdRec = P08M73_A727PrdRec[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            AV26count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08M73_A718PrdNom[0], A718PrdNom) == 0 ) )
            {
               brk8M74 = false ;
               A396EmprCod = P08M73_A396EmprCod[0] ;
               A810RecFec = P08M73_A810RecFec[0] ;
               A719PrdNum = P08M73_A719PrdNum[0] ;
               AV26count = (long)(AV26count+1) ;
               brk8M74 = true ;
               pr_default.readNext(1);
            }
            if ( ! (GXutil.strcmp("", A718PrdNom)==0) )
            {
               AV18Option = A718PrdNom ;
               AV19Options.add(AV18Option, 0);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
            }
            if ( AV19Options.size() == 50 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
         }
         if ( ! brk8M74 )
         {
            brk8M74 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwconreinfinitegetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = webwconreinfinitegetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = webwconreinfinitegetfilterdata.this.AV25OptionIndexesJson;
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
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV44TFRecExiTeo = DecimalUtil.ZERO ;
      AV45TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV50TFRecExiTcc = DecimalUtil.ZERO ;
      AV51TFRecExiTcc_To = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV57Webwconreinfiniteds_1_tfprdnum = "" ;
      AV58Webwconreinfiniteds_2_tfprdnum_sel = "" ;
      AV59Webwconreinfiniteds_3_tfprdnom = "" ;
      AV60Webwconreinfiniteds_4_tfprdnom_sel = "" ;
      AV61Webwconreinfiniteds_5_tfrecexiteo = DecimalUtil.ZERO ;
      AV62Webwconreinfiniteds_6_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV63Webwconreinfiniteds_7_tfrecexitcc = DecimalUtil.ZERO ;
      AV64Webwconreinfiniteds_8_tfrecexitcc_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV57Webwconreinfiniteds_1_tfprdnum = "" ;
      lV59Webwconreinfiniteds_3_tfprdnom = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      A810RecFec = GXutil.nullDate() ;
      AV43RecFec = GXutil.nullDate() ;
      AV48EmprCod = "" ;
      A396EmprCod = "" ;
      P08M72_A396EmprCod = new String[] {""} ;
      P08M72_A719PrdNum = new String[] {""} ;
      P08M72_A13416RecEstInv = new byte[1] ;
      P08M72_A727PrdRec = new String[] {""} ;
      P08M72_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08M72_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08M72_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08M72_A718PrdNom = new String[] {""} ;
      AV18Option = "" ;
      P08M73_A396EmprCod = new String[] {""} ;
      P08M73_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08M73_A13416RecEstInv = new byte[1] ;
      P08M73_A718PrdNom = new String[] {""} ;
      P08M73_A727PrdRec = new String[] {""} ;
      P08M73_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08M73_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08M73_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwconreinfinitegetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08M72_A396EmprCod, P08M72_A719PrdNum, P08M72_A13416RecEstInv, P08M72_A727PrdRec, P08M72_A810RecFec, P08M72_A808RecExiTcc, P08M72_A809RecExiTeo, P08M72_A718PrdNom
            }
            , new Object[] {
            P08M73_A396EmprCod, P08M73_A810RecFec, P08M73_A13416RecEstInv, P08M73_A718PrdNom, P08M73_A727PrdRec, P08M73_A808RecExiTcc, P08M73_A809RecExiTeo, P08M73_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A13416RecEstInv ;
   private short Gx_err ;
   private int AV55GXV1 ;
   private long AV26count ;
   private java.math.BigDecimal AV44TFRecExiTeo ;
   private java.math.BigDecimal AV45TFRecExiTeo_To ;
   private java.math.BigDecimal AV50TFRecExiTcc ;
   private java.math.BigDecimal AV51TFRecExiTcc_To ;
   private java.math.BigDecimal AV61Webwconreinfiniteds_5_tfrecexiteo ;
   private java.math.BigDecimal AV62Webwconreinfiniteds_6_tfrecexiteo_to ;
   private java.math.BigDecimal AV63Webwconreinfiniteds_7_tfrecexitcc ;
   private java.math.BigDecimal AV64Webwconreinfiniteds_8_tfrecexitcc_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A808RecExiTcc ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String A719PrdNum ;
   private String AV57Webwconreinfiniteds_1_tfprdnum ;
   private String AV58Webwconreinfiniteds_2_tfprdnum_sel ;
   private String AV59Webwconreinfiniteds_3_tfprdnom ;
   private String AV60Webwconreinfiniteds_4_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV57Webwconreinfiniteds_1_tfprdnum ;
   private String lV59Webwconreinfiniteds_3_tfprdnom ;
   private String A718PrdNom ;
   private String A727PrdRec ;
   private String AV48EmprCod ;
   private String A396EmprCod ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV43RecFec ;
   private boolean returnInSub ;
   private boolean brk8M72 ;
   private boolean brk8M74 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08M72_A396EmprCod ;
   private String[] P08M72_A719PrdNum ;
   private byte[] P08M72_A13416RecEstInv ;
   private String[] P08M72_A727PrdRec ;
   private java.util.Date[] P08M72_A810RecFec ;
   private java.math.BigDecimal[] P08M72_A808RecExiTcc ;
   private java.math.BigDecimal[] P08M72_A809RecExiTeo ;
   private String[] P08M72_A718PrdNom ;
   private String[] P08M73_A396EmprCod ;
   private java.util.Date[] P08M73_A810RecFec ;
   private byte[] P08M73_A13416RecEstInv ;
   private String[] P08M73_A718PrdNom ;
   private String[] P08M73_A727PrdRec ;
   private java.math.BigDecimal[] P08M73_A808RecExiTcc ;
   private java.math.BigDecimal[] P08M73_A809RecExiTeo ;
   private String[] P08M73_A719PrdNum ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class webwconreinfinitegetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08M72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Webwconreinfiniteds_2_tfprdnum_sel ,
                                          String AV57Webwconreinfiniteds_1_tfprdnum ,
                                          String AV60Webwconreinfiniteds_4_tfprdnom_sel ,
                                          String AV59Webwconreinfiniteds_3_tfprdnom ,
                                          java.math.BigDecimal AV61Webwconreinfiniteds_5_tfrecexiteo ,
                                          java.math.BigDecimal AV62Webwconreinfiniteds_6_tfrecexiteo_to ,
                                          java.math.BigDecimal AV63Webwconreinfiniteds_7_tfrecexitcc ,
                                          java.math.BigDecimal AV64Webwconreinfiniteds_8_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          String A727PrdRec ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV43RecFec ,
                                          byte A13416RecEstInv ,
                                          String AV48EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[10];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.RecEstInv, T2.PrdRec, T1.RecFec, T1.RecExiTcc, T1.RecExiTeo, T2.PrdNom FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( (GXutil.strcmp("", AV58Webwconreinfiniteds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV57Webwconreinfiniteds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Webwconreinfiniteds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Webwconreinfiniteds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Webwconreinfiniteds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Webwconreinfiniteds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Webwconreinfiniteds_5_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Webwconreinfiniteds_6_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Webwconreinfiniteds_7_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Webwconreinfiniteds_8_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.RecFec" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08M73( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Webwconreinfiniteds_2_tfprdnum_sel ,
                                          String AV57Webwconreinfiniteds_1_tfprdnum ,
                                          String AV60Webwconreinfiniteds_4_tfprdnom_sel ,
                                          String AV59Webwconreinfiniteds_3_tfprdnom ,
                                          java.math.BigDecimal AV61Webwconreinfiniteds_5_tfrecexiteo ,
                                          java.math.BigDecimal AV62Webwconreinfiniteds_6_tfrecexiteo_to ,
                                          java.math.BigDecimal AV63Webwconreinfiniteds_7_tfrecexitcc ,
                                          java.math.BigDecimal AV64Webwconreinfiniteds_8_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          String A727PrdRec ,
                                          String A396EmprCod ,
                                          String AV48EmprCod ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV43RecFec ,
                                          byte A13416RecEstInv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[10];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecFec, T1.RecEstInv, T2.PrdNom, T2.PrdRec, T1.RecExiTcc, T1.RecExiTeo, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( (GXutil.strcmp("", AV58Webwconreinfiniteds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV57Webwconreinfiniteds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Webwconreinfiniteds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Webwconreinfiniteds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV59Webwconreinfiniteds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Webwconreinfiniteds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61Webwconreinfiniteds_5_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV62Webwconreinfiniteds_6_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV63Webwconreinfiniteds_7_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64Webwconreinfiniteds_8_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
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
                  return conditional_P08M72(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] );
            case 1 :
                  return conditional_P08M73(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08M72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08M73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
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
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 4);
               }
               return;
      }
   }

}

