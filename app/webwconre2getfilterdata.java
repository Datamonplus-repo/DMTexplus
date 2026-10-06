package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwconre2getfilterdata extends GXProcedure
{
   public webwconre2getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwconre2getfilterdata.class ), "" );
   }

   public webwconre2getfilterdata( int remoteHandle ,
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
      webwconre2getfilterdata.this.aP5 = new String[] {""};
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
      webwconre2getfilterdata.this.AV16DDOName = aP0;
      webwconre2getfilterdata.this.AV14SearchTxt = aP1;
      webwconre2getfilterdata.this.AV15SearchTxtTo = aP2;
      webwconre2getfilterdata.this.aP3 = aP3;
      webwconre2getfilterdata.this.aP4 = aP4;
      webwconre2getfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV27Session.getValue("WebWconre2GridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWconre2GridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("WebWconre2GridState"), null, null);
      }
      AV38GXV1 = 1 ;
      while ( AV38GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV38GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "RECFEC") == 0 )
         {
            AV32RecFec = localUtil.ctod( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
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
            AV34TFRecExiTeo = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFRecExiTeo_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV38GXV1 = (int)(AV38GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV14SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV40Webwconre2ds_1_recfec = AV32RecFec ;
      AV41Webwconre2ds_2_tfprdnum = AV10TFPrdNum ;
      AV42Webwconre2ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV43Webwconre2ds_4_tfprdnom = AV12TFPrdNom ;
      AV44Webwconre2ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV45Webwconre2ds_6_tfrecexiteo = AV34TFRecExiTeo ;
      AV46Webwconre2ds_7_tfrecexiteo_to = AV35TFRecExiTeo_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV40Webwconre2ds_1_recfec ,
                                           AV42Webwconre2ds_3_tfprdnum_sel ,
                                           AV41Webwconre2ds_2_tfprdnum ,
                                           AV44Webwconre2ds_5_tfprdnom_sel ,
                                           AV43Webwconre2ds_4_tfprdnom ,
                                           AV45Webwconre2ds_6_tfrecexiteo ,
                                           AV46Webwconre2ds_7_tfrecexiteo_to ,
                                           A810RecFec ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A727PrdRec ,
                                           AV32RecFec ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           AV33EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV41Webwconre2ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV41Webwconre2ds_2_tfprdnum), 6, "%") ;
      lV43Webwconre2ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV43Webwconre2ds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08M42 */
      pr_default.execute(0, new Object[] {AV33EmprCod, AV32RecFec, AV40Webwconre2ds_1_recfec, lV41Webwconre2ds_2_tfprdnum, AV42Webwconre2ds_3_tfprdnum_sel, lV43Webwconre2ds_4_tfprdnom, AV44Webwconre2ds_5_tfprdnom_sel, AV45Webwconre2ds_6_tfrecexiteo, AV46Webwconre2ds_7_tfrecexiteo_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8M42 = false ;
         A396EmprCod = P08M42_A396EmprCod[0] ;
         A719PrdNum = P08M42_A719PrdNum[0] ;
         A13416RecEstInv = P08M42_A13416RecEstInv[0] ;
         A727PrdRec = P08M42_A727PrdRec[0] ;
         A809RecExiTeo = P08M42_A809RecExiTeo[0] ;
         A718PrdNom = P08M42_A718PrdNom[0] ;
         A810RecFec = P08M42_A810RecFec[0] ;
         A727PrdRec = P08M42_A727PrdRec[0] ;
         A718PrdNom = P08M42_A718PrdNom[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            AV26count = 0 ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08M42_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08M42_A719PrdNum[0], A719PrdNum) == 0 ) )
            {
               brk8M42 = false ;
               A810RecFec = P08M42_A810RecFec[0] ;
               AV26count = (long)(AV26count+1) ;
               brk8M42 = true ;
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
         if ( ! brk8M42 )
         {
            brk8M42 = true ;
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
      AV40Webwconre2ds_1_recfec = AV32RecFec ;
      AV41Webwconre2ds_2_tfprdnum = AV10TFPrdNum ;
      AV42Webwconre2ds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV43Webwconre2ds_4_tfprdnom = AV12TFPrdNom ;
      AV44Webwconre2ds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      AV45Webwconre2ds_6_tfrecexiteo = AV34TFRecExiTeo ;
      AV46Webwconre2ds_7_tfrecexiteo_to = AV35TFRecExiTeo_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV40Webwconre2ds_1_recfec ,
                                           AV42Webwconre2ds_3_tfprdnum_sel ,
                                           AV41Webwconre2ds_2_tfprdnum ,
                                           AV44Webwconre2ds_5_tfprdnom_sel ,
                                           AV43Webwconre2ds_4_tfprdnom ,
                                           AV45Webwconre2ds_6_tfrecexiteo ,
                                           AV46Webwconre2ds_7_tfrecexiteo_to ,
                                           A810RecFec ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A727PrdRec ,
                                           A396EmprCod ,
                                           AV33EmprCod ,
                                           AV32RecFec ,
                                           Byte.valueOf(A13416RecEstInv) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE
                                           }
      });
      lV41Webwconre2ds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV41Webwconre2ds_2_tfprdnum), 6, "%") ;
      lV43Webwconre2ds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV43Webwconre2ds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08M43 */
      pr_default.execute(1, new Object[] {AV33EmprCod, AV32RecFec, AV40Webwconre2ds_1_recfec, lV41Webwconre2ds_2_tfprdnum, AV42Webwconre2ds_3_tfprdnum_sel, lV43Webwconre2ds_4_tfprdnom, AV44Webwconre2ds_5_tfprdnom_sel, AV45Webwconre2ds_6_tfrecexiteo, AV46Webwconre2ds_7_tfrecexiteo_to});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8M44 = false ;
         A396EmprCod = P08M43_A396EmprCod[0] ;
         A810RecFec = P08M43_A810RecFec[0] ;
         A13416RecEstInv = P08M43_A13416RecEstInv[0] ;
         A718PrdNom = P08M43_A718PrdNom[0] ;
         A727PrdRec = P08M43_A727PrdRec[0] ;
         A809RecExiTeo = P08M43_A809RecExiTeo[0] ;
         A719PrdNum = P08M43_A719PrdNum[0] ;
         A718PrdNom = P08M43_A718PrdNom[0] ;
         A727PrdRec = P08M43_A727PrdRec[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            AV26count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08M43_A718PrdNom[0], A718PrdNom) == 0 ) )
            {
               brk8M44 = false ;
               A396EmprCod = P08M43_A396EmprCod[0] ;
               A810RecFec = P08M43_A810RecFec[0] ;
               A719PrdNum = P08M43_A719PrdNum[0] ;
               AV26count = (long)(AV26count+1) ;
               brk8M44 = true ;
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
         if ( ! brk8M44 )
         {
            brk8M44 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwconre2getfilterdata.this.AV20OptionsJson;
      this.aP4[0] = webwconre2getfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = webwconre2getfilterdata.this.AV25OptionIndexesJson;
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
      AV32RecFec = GXutil.nullDate() ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV34TFRecExiTeo = DecimalUtil.ZERO ;
      AV35TFRecExiTeo_To = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      AV40Webwconre2ds_1_recfec = GXutil.nullDate() ;
      AV41Webwconre2ds_2_tfprdnum = "" ;
      AV42Webwconre2ds_3_tfprdnum_sel = "" ;
      AV43Webwconre2ds_4_tfprdnom = "" ;
      AV44Webwconre2ds_5_tfprdnom_sel = "" ;
      AV45Webwconre2ds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV46Webwconre2ds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV41Webwconre2ds_2_tfprdnum = "" ;
      lV43Webwconre2ds_4_tfprdnom = "" ;
      A810RecFec = GXutil.nullDate() ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      AV33EmprCod = "" ;
      A396EmprCod = "" ;
      P08M42_A396EmprCod = new String[] {""} ;
      P08M42_A719PrdNum = new String[] {""} ;
      P08M42_A13416RecEstInv = new byte[1] ;
      P08M42_A727PrdRec = new String[] {""} ;
      P08M42_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08M42_A718PrdNom = new String[] {""} ;
      P08M42_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      AV18Option = "" ;
      P08M43_A396EmprCod = new String[] {""} ;
      P08M43_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08M43_A13416RecEstInv = new byte[1] ;
      P08M43_A718PrdNom = new String[] {""} ;
      P08M43_A727PrdRec = new String[] {""} ;
      P08M43_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08M43_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwconre2getfilterdata__default(),
         new Object[] {
             new Object[] {
            P08M42_A396EmprCod, P08M42_A719PrdNum, P08M42_A13416RecEstInv, P08M42_A727PrdRec, P08M42_A809RecExiTeo, P08M42_A718PrdNom, P08M42_A810RecFec
            }
            , new Object[] {
            P08M43_A396EmprCod, P08M43_A810RecFec, P08M43_A13416RecEstInv, P08M43_A718PrdNom, P08M43_A727PrdRec, P08M43_A809RecExiTeo, P08M43_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A13416RecEstInv ;
   private short Gx_err ;
   private int AV38GXV1 ;
   private long AV26count ;
   private java.math.BigDecimal AV34TFRecExiTeo ;
   private java.math.BigDecimal AV35TFRecExiTeo_To ;
   private java.math.BigDecimal AV45Webwconre2ds_6_tfrecexiteo ;
   private java.math.BigDecimal AV46Webwconre2ds_7_tfrecexiteo_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String A719PrdNum ;
   private String AV41Webwconre2ds_2_tfprdnum ;
   private String AV42Webwconre2ds_3_tfprdnum_sel ;
   private String AV43Webwconre2ds_4_tfprdnom ;
   private String AV44Webwconre2ds_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV41Webwconre2ds_2_tfprdnum ;
   private String lV43Webwconre2ds_4_tfprdnom ;
   private String A718PrdNom ;
   private String A727PrdRec ;
   private String AV33EmprCod ;
   private String A396EmprCod ;
   private java.util.Date AV32RecFec ;
   private java.util.Date AV40Webwconre2ds_1_recfec ;
   private java.util.Date A810RecFec ;
   private boolean returnInSub ;
   private boolean brk8M42 ;
   private boolean brk8M44 ;
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
   private String[] P08M42_A396EmprCod ;
   private String[] P08M42_A719PrdNum ;
   private byte[] P08M42_A13416RecEstInv ;
   private String[] P08M42_A727PrdRec ;
   private java.math.BigDecimal[] P08M42_A809RecExiTeo ;
   private String[] P08M42_A718PrdNom ;
   private java.util.Date[] P08M42_A810RecFec ;
   private String[] P08M43_A396EmprCod ;
   private java.util.Date[] P08M43_A810RecFec ;
   private byte[] P08M43_A13416RecEstInv ;
   private String[] P08M43_A718PrdNom ;
   private String[] P08M43_A727PrdRec ;
   private java.math.BigDecimal[] P08M43_A809RecExiTeo ;
   private String[] P08M43_A719PrdNum ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class webwconre2getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08M42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV40Webwconre2ds_1_recfec ,
                                          String AV42Webwconre2ds_3_tfprdnum_sel ,
                                          String AV41Webwconre2ds_2_tfprdnum ,
                                          String AV44Webwconre2ds_5_tfprdnom_sel ,
                                          String AV43Webwconre2ds_4_tfprdnom ,
                                          java.math.BigDecimal AV45Webwconre2ds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV46Webwconre2ds_7_tfrecexiteo_to ,
                                          java.util.Date A810RecFec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          String A727PrdRec ,
                                          java.util.Date AV32RecFec ,
                                          byte A13416RecEstInv ,
                                          String AV33EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.RecEstInv, T2.PrdRec, T1.RecExiTeo, T2.PrdNom, T1.RecFec FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40Webwconre2ds_1_recfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec = ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42Webwconre2ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV41Webwconre2ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNum like ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42Webwconre2ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44Webwconre2ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV43Webwconre2ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(T2.PrdNom like ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Webwconre2ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45Webwconre2ds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46Webwconre2ds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.RecFec" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08M43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV40Webwconre2ds_1_recfec ,
                                          String AV42Webwconre2ds_3_tfprdnum_sel ,
                                          String AV41Webwconre2ds_2_tfprdnum ,
                                          String AV44Webwconre2ds_5_tfprdnom_sel ,
                                          String AV43Webwconre2ds_4_tfprdnom ,
                                          java.math.BigDecimal AV45Webwconre2ds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV46Webwconre2ds_7_tfrecexiteo_to ,
                                          java.util.Date A810RecFec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          String A727PrdRec ,
                                          String A396EmprCod ,
                                          String AV33EmprCod ,
                                          java.util.Date AV32RecFec ,
                                          byte A13416RecEstInv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecFec, T1.RecEstInv, T2.PrdNom, T2.PrdRec, T1.RecExiTeo, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40Webwconre2ds_1_recfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec = ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV42Webwconre2ds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV41Webwconre2ds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(T1.PrdNum like ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV42Webwconre2ds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV44Webwconre2ds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV43Webwconre2ds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(T2.PrdNom like ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44Webwconre2ds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45Webwconre2ds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46Webwconre2ds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
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
                  return conditional_P08M42(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] );
            case 1 :
                  return conditional_P08M43(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08M42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08M43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 4);
               }
               return;
      }
   }

}

