package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class productosnonormas_wcgetfilterdata extends GXProcedure
{
   public productosnonormas_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( productosnonormas_wcgetfilterdata.class ), "" );
   }

   public productosnonormas_wcgetfilterdata( int remoteHandle ,
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
      productosnonormas_wcgetfilterdata.this.aP5 = new String[] {""};
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
      productosnonormas_wcgetfilterdata.this.AV16DDOName = aP0;
      productosnonormas_wcgetfilterdata.this.AV14SearchTxt = aP1;
      productosnonormas_wcgetfilterdata.this.AV15SearchTxtTo = aP2;
      productosnonormas_wcgetfilterdata.this.aP3 = aP3;
      productosnonormas_wcgetfilterdata.this.aP4 = aP4;
      productosnonormas_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV27Session.getValue("ProductosNONormas_WCGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ProductosNONormas_WCGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("ProductosNONormas_WCGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV33Emprcod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&NORMAID") == 0 )
         {
            AV34NormaID = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&VALCOD") == 0 )
         {
            AV36ValCod = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV14SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV41Productosnonormas_wcds_1_filterfulltext = AV32FilterFullText ;
      AV42Productosnonormas_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV43Productosnonormas_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV44Productosnonormas_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV45Productosnonormas_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV41Productosnonormas_wcds_1_filterfulltext ,
                                           AV43Productosnonormas_wcds_3_tfprdnum_sel ,
                                           AV42Productosnonormas_wcds_2_tfprdnum ,
                                           AV45Productosnonormas_wcds_5_tfprdnom_sel ,
                                           AV44Productosnonormas_wcds_4_tfprdnom ,
                                           Byte.valueOf(AV36ValCod) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Byte.valueOf(A856ValCod) ,
                                           A13217NormaID ,
                                           AV34NormaID ,
                                           AV33Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV41Productosnonormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Productosnonormas_wcds_1_filterfulltext), "%", "") ;
      lV41Productosnonormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Productosnonormas_wcds_1_filterfulltext), "%", "") ;
      lV42Productosnonormas_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV42Productosnonormas_wcds_2_tfprdnum), 6, "%") ;
      lV44Productosnonormas_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV44Productosnonormas_wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor P095T2 */
      pr_default.execute(0, new Object[] {AV33Emprcod, AV34NormaID, lV41Productosnonormas_wcds_1_filterfulltext, lV41Productosnonormas_wcds_1_filterfulltext, lV42Productosnonormas_wcds_2_tfprdnum, AV43Productosnonormas_wcds_3_tfprdnum_sel, lV44Productosnonormas_wcds_4_tfprdnom, AV45Productosnonormas_wcds_5_tfprdnom_sel, Byte.valueOf(AV36ValCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk95T2 = false ;
         A396EmprCod = P095T2_A396EmprCod[0] ;
         A719PrdNum = P095T2_A719PrdNum[0] ;
         A856ValCod = P095T2_A856ValCod[0] ;
         A13217NormaID = P095T2_A13217NormaID[0] ;
         A718PrdNom = P095T2_A718PrdNom[0] ;
         A856ValCod = P095T2_A856ValCod[0] ;
         A718PrdNom = P095T2_A718PrdNom[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P095T2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P095T2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk95T2 = false ;
            A13217NormaID = P095T2_A13217NormaID[0] ;
            AV26count = (long)(AV26count+1) ;
            brk95T2 = true ;
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
         if ( ! brk95T2 )
         {
            brk95T2 = true ;
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
      AV41Productosnonormas_wcds_1_filterfulltext = AV32FilterFullText ;
      AV42Productosnonormas_wcds_2_tfprdnum = AV10TFPrdNum ;
      AV43Productosnonormas_wcds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV44Productosnonormas_wcds_4_tfprdnom = AV12TFPrdNom ;
      AV45Productosnonormas_wcds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV41Productosnonormas_wcds_1_filterfulltext ,
                                           AV43Productosnonormas_wcds_3_tfprdnum_sel ,
                                           AV42Productosnonormas_wcds_2_tfprdnum ,
                                           AV45Productosnonormas_wcds_5_tfprdnom_sel ,
                                           AV44Productosnonormas_wcds_4_tfprdnom ,
                                           Byte.valueOf(AV36ValCod) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Byte.valueOf(A856ValCod) ,
                                           A396EmprCod ,
                                           AV33Emprcod ,
                                           A13217NormaID ,
                                           AV34NormaID } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV41Productosnonormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Productosnonormas_wcds_1_filterfulltext), "%", "") ;
      lV41Productosnonormas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Productosnonormas_wcds_1_filterfulltext), "%", "") ;
      lV42Productosnonormas_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV42Productosnonormas_wcds_2_tfprdnum), 6, "%") ;
      lV44Productosnonormas_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV44Productosnonormas_wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor P095T3 */
      pr_default.execute(1, new Object[] {AV33Emprcod, AV34NormaID, lV41Productosnonormas_wcds_1_filterfulltext, lV41Productosnonormas_wcds_1_filterfulltext, lV42Productosnonormas_wcds_2_tfprdnum, AV43Productosnonormas_wcds_3_tfprdnum_sel, lV44Productosnonormas_wcds_4_tfprdnom, AV45Productosnonormas_wcds_5_tfprdnom_sel, Byte.valueOf(AV36ValCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk95T4 = false ;
         A396EmprCod = P095T3_A396EmprCod[0] ;
         A13217NormaID = P095T3_A13217NormaID[0] ;
         A718PrdNom = P095T3_A718PrdNom[0] ;
         A856ValCod = P095T3_A856ValCod[0] ;
         A719PrdNum = P095T3_A719PrdNum[0] ;
         A718PrdNom = P095T3_A718PrdNom[0] ;
         A856ValCod = P095T3_A856ValCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P095T3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk95T4 = false ;
            A396EmprCod = P095T3_A396EmprCod[0] ;
            A13217NormaID = P095T3_A13217NormaID[0] ;
            A719PrdNum = P095T3_A719PrdNum[0] ;
            AV26count = (long)(AV26count+1) ;
            brk95T4 = true ;
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
         if ( ! brk95T4 )
         {
            brk95T4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = productosnonormas_wcgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = productosnonormas_wcgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = productosnonormas_wcgetfilterdata.this.AV25OptionIndexesJson;
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
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV33Emprcod = "" ;
      AV34NormaID = "" ;
      A719PrdNum = "" ;
      AV41Productosnonormas_wcds_1_filterfulltext = "" ;
      AV42Productosnonormas_wcds_2_tfprdnum = "" ;
      AV43Productosnonormas_wcds_3_tfprdnum_sel = "" ;
      AV44Productosnonormas_wcds_4_tfprdnom = "" ;
      AV45Productosnonormas_wcds_5_tfprdnom_sel = "" ;
      scmdbuf = "" ;
      lV41Productosnonormas_wcds_1_filterfulltext = "" ;
      lV42Productosnonormas_wcds_2_tfprdnum = "" ;
      lV44Productosnonormas_wcds_4_tfprdnom = "" ;
      A718PrdNom = "" ;
      A13217NormaID = "" ;
      A396EmprCod = "" ;
      P095T2_A396EmprCod = new String[] {""} ;
      P095T2_A719PrdNum = new String[] {""} ;
      P095T2_A856ValCod = new byte[1] ;
      P095T2_A13217NormaID = new String[] {""} ;
      P095T2_A718PrdNom = new String[] {""} ;
      AV18Option = "" ;
      P095T3_A396EmprCod = new String[] {""} ;
      P095T3_A13217NormaID = new String[] {""} ;
      P095T3_A718PrdNom = new String[] {""} ;
      P095T3_A856ValCod = new byte[1] ;
      P095T3_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.productosnonormas_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P095T2_A396EmprCod, P095T2_A719PrdNum, P095T2_A856ValCod, P095T2_A13217NormaID, P095T2_A718PrdNom
            }
            , new Object[] {
            P095T3_A396EmprCod, P095T3_A13217NormaID, P095T3_A718PrdNom, P095T3_A856ValCod, P095T3_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV36ValCod ;
   private byte A856ValCod ;
   private short Gx_err ;
   private int AV39GXV1 ;
   private long AV26count ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV33Emprcod ;
   private String AV34NormaID ;
   private String A719PrdNum ;
   private String AV42Productosnonormas_wcds_2_tfprdnum ;
   private String AV43Productosnonormas_wcds_3_tfprdnum_sel ;
   private String AV44Productosnonormas_wcds_4_tfprdnom ;
   private String AV45Productosnonormas_wcds_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV42Productosnonormas_wcds_2_tfprdnum ;
   private String lV44Productosnonormas_wcds_4_tfprdnom ;
   private String A718PrdNom ;
   private String A13217NormaID ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk95T2 ;
   private boolean brk95T4 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV41Productosnonormas_wcds_1_filterfulltext ;
   private String lV41Productosnonormas_wcds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P095T2_A396EmprCod ;
   private String[] P095T2_A719PrdNum ;
   private byte[] P095T2_A856ValCod ;
   private String[] P095T2_A13217NormaID ;
   private String[] P095T2_A718PrdNom ;
   private String[] P095T3_A396EmprCod ;
   private String[] P095T3_A13217NormaID ;
   private String[] P095T3_A718PrdNom ;
   private byte[] P095T3_A856ValCod ;
   private String[] P095T3_A719PrdNum ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class productosnonormas_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P095T2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Productosnonormas_wcds_1_filterfulltext ,
                                          String AV43Productosnonormas_wcds_3_tfprdnum_sel ,
                                          String AV42Productosnonormas_wcds_2_tfprdnum ,
                                          String AV45Productosnonormas_wcds_5_tfprdnom_sel ,
                                          String AV44Productosnonormas_wcds_4_tfprdnom ,
                                          byte AV36ValCod ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          byte A856ValCod ,
                                          String A13217NormaID ,
                                          String AV34NormaID ,
                                          String AV33Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T2.ValCod, T1.NormaID, T2.PrdNom FROM (TXPPrdNor T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.NormaID = ?)");
      if ( ! (GXutil.strcmp("", AV41Productosnonormas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Productosnonormas_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV42Productosnonormas_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Productosnonormas_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Productosnonormas_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV44Productosnonormas_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Productosnonormas_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV36ValCod) )
      {
         addWhere(sWhereString, "(T2.ValCod = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.NormaID" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P095T3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Productosnonormas_wcds_1_filterfulltext ,
                                          String AV43Productosnonormas_wcds_3_tfprdnum_sel ,
                                          String AV42Productosnonormas_wcds_2_tfprdnum ,
                                          String AV45Productosnonormas_wcds_5_tfprdnom_sel ,
                                          String AV44Productosnonormas_wcds_4_tfprdnom ,
                                          byte AV36ValCod ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          byte A856ValCod ,
                                          String A396EmprCod ,
                                          String AV33Emprcod ,
                                          String A13217NormaID ,
                                          String AV34NormaID )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[9];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.NormaID, T2.PrdNom, T2.ValCod, T1.PrdNum FROM (TXPPrdNor T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.NormaID = ?)");
      if ( ! (GXutil.strcmp("", AV41Productosnonormas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Productosnonormas_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV42Productosnonormas_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Productosnonormas_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Productosnonormas_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV44Productosnonormas_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Productosnonormas_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV36ValCod) )
      {
         addWhere(sWhereString, "(T2.ValCod = ?)");
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
                  return conditional_P095T2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 1 :
                  return conditional_P095T3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P095T2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P095T3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
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
                  stmt.setString(sIdx, (String)parms[10], 4);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
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
                  stmt.setString(sIdx, (String)parms[10], 4);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[17]).byteValue());
               }
               return;
      }
   }

}

