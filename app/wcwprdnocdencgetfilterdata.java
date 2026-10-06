package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcwprdnocdencgetfilterdata extends GXProcedure
{
   public wcwprdnocdencgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwprdnocdencgetfilterdata.class ), "" );
   }

   public wcwprdnocdencgetfilterdata( int remoteHandle ,
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
      wcwprdnocdencgetfilterdata.this.aP5 = new String[] {""};
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
      wcwprdnocdencgetfilterdata.this.AV16DDOName = aP0;
      wcwprdnocdencgetfilterdata.this.AV14SearchTxt = aP1;
      wcwprdnocdencgetfilterdata.this.AV15SearchTxtTo = aP2;
      wcwprdnocdencgetfilterdata.this.aP3 = aP3;
      wcwprdnocdencgetfilterdata.this.aP4 = aP4;
      wcwprdnocdencgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV27Session.getValue("WCwPrdNoCdEncGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCwPrdNoCdEncGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("WCwPrdNoCdEncGridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
            AV32Emprcod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TB1_COD") == 0 )
         {
            AV33Tb1_cod = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRDNUMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFPrdNum = AV14SearchTxt ;
      AV11TFPrdNum_Sel = "" ;
      AV39Wcwprdnocdencds_1_filterfulltext = AV34FilterFullText ;
      AV40Wcwprdnocdencds_2_tfprdnum = AV10TFPrdNum ;
      AV41Wcwprdnocdencds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV42Wcwprdnocdencds_4_tfprdnom = AV12TFPrdNom ;
      AV43Wcwprdnocdencds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV39Wcwprdnocdencds_1_filterfulltext ,
                                           AV41Wcwprdnocdencds_3_tfprdnum_sel ,
                                           AV40Wcwprdnocdencds_2_tfprdnum ,
                                           AV43Wcwprdnocdencds_5_tfprdnom_sel ,
                                           AV42Wcwprdnocdencds_4_tfprdnom ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Short.valueOf(A9713Tb1_Cod) ,
                                           Short.valueOf(AV33Tb1_cod) ,
                                           AV32Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV39Wcwprdnocdencds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Wcwprdnocdencds_1_filterfulltext), "%", "") ;
      lV39Wcwprdnocdencds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Wcwprdnocdencds_1_filterfulltext), "%", "") ;
      lV40Wcwprdnocdencds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV40Wcwprdnocdencds_2_tfprdnum), 6, "%") ;
      lV42Wcwprdnocdencds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV42Wcwprdnocdencds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08QQ2 */
      pr_default.execute(0, new Object[] {AV32Emprcod, Short.valueOf(AV33Tb1_cod), lV39Wcwprdnocdencds_1_filterfulltext, lV39Wcwprdnocdencds_1_filterfulltext, lV40Wcwprdnocdencds_2_tfprdnum, AV41Wcwprdnocdencds_3_tfprdnum_sel, lV42Wcwprdnocdencds_4_tfprdnom, AV43Wcwprdnocdencds_5_tfprdnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8QQ2 = false ;
         A396EmprCod = P08QQ2_A396EmprCod[0] ;
         A719PrdNum = P08QQ2_A719PrdNum[0] ;
         A9713Tb1_Cod = P08QQ2_A9713Tb1_Cod[0] ;
         A718PrdNom = P08QQ2_A718PrdNom[0] ;
         A718PrdNom = P08QQ2_A718PrdNom[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08QQ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08QQ2_A719PrdNum[0], A719PrdNum) == 0 ) )
         {
            brk8QQ2 = false ;
            A9713Tb1_Cod = P08QQ2_A9713Tb1_Cod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8QQ2 = true ;
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
         if ( ! brk8QQ2 )
         {
            brk8QQ2 = true ;
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
      AV39Wcwprdnocdencds_1_filterfulltext = AV34FilterFullText ;
      AV40Wcwprdnocdencds_2_tfprdnum = AV10TFPrdNum ;
      AV41Wcwprdnocdencds_3_tfprdnum_sel = AV11TFPrdNum_Sel ;
      AV42Wcwprdnocdencds_4_tfprdnom = AV12TFPrdNom ;
      AV43Wcwprdnocdencds_5_tfprdnom_sel = AV13TFPrdNom_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV39Wcwprdnocdencds_1_filterfulltext ,
                                           AV41Wcwprdnocdencds_3_tfprdnum_sel ,
                                           AV40Wcwprdnocdencds_2_tfprdnum ,
                                           AV43Wcwprdnocdencds_5_tfprdnom_sel ,
                                           AV42Wcwprdnocdencds_4_tfprdnom ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A396EmprCod ,
                                           AV32Emprcod ,
                                           Short.valueOf(A9713Tb1_Cod) ,
                                           Short.valueOf(AV33Tb1_cod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT
                                           }
      });
      lV39Wcwprdnocdencds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Wcwprdnocdencds_1_filterfulltext), "%", "") ;
      lV39Wcwprdnocdencds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV39Wcwprdnocdencds_1_filterfulltext), "%", "") ;
      lV40Wcwprdnocdencds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV40Wcwprdnocdencds_2_tfprdnum), 6, "%") ;
      lV42Wcwprdnocdencds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV42Wcwprdnocdencds_4_tfprdnom), 26, "%") ;
      /* Using cursor P08QQ3 */
      pr_default.execute(1, new Object[] {AV32Emprcod, Short.valueOf(AV33Tb1_cod), lV39Wcwprdnocdencds_1_filterfulltext, lV39Wcwprdnocdencds_1_filterfulltext, lV40Wcwprdnocdencds_2_tfprdnum, AV41Wcwprdnocdencds_3_tfprdnum_sel, lV42Wcwprdnocdencds_4_tfprdnom, AV43Wcwprdnocdencds_5_tfprdnom_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8QQ4 = false ;
         A396EmprCod = P08QQ3_A396EmprCod[0] ;
         A9713Tb1_Cod = P08QQ3_A9713Tb1_Cod[0] ;
         A718PrdNom = P08QQ3_A718PrdNom[0] ;
         A719PrdNum = P08QQ3_A719PrdNum[0] ;
         A718PrdNom = P08QQ3_A718PrdNom[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08QQ3_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            brk8QQ4 = false ;
            A396EmprCod = P08QQ3_A396EmprCod[0] ;
            A9713Tb1_Cod = P08QQ3_A9713Tb1_Cod[0] ;
            A719PrdNum = P08QQ3_A719PrdNum[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8QQ4 = true ;
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
         if ( ! brk8QQ4 )
         {
            brk8QQ4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wcwprdnocdencgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = wcwprdnocdencgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = wcwprdnocdencgetfilterdata.this.AV25OptionIndexesJson;
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
      AV34FilterFullText = "" ;
      AV10TFPrdNum = "" ;
      AV11TFPrdNum_Sel = "" ;
      AV12TFPrdNom = "" ;
      AV13TFPrdNom_Sel = "" ;
      AV32Emprcod = "" ;
      A719PrdNum = "" ;
      AV39Wcwprdnocdencds_1_filterfulltext = "" ;
      AV40Wcwprdnocdencds_2_tfprdnum = "" ;
      AV41Wcwprdnocdencds_3_tfprdnum_sel = "" ;
      AV42Wcwprdnocdencds_4_tfprdnom = "" ;
      AV43Wcwprdnocdencds_5_tfprdnom_sel = "" ;
      scmdbuf = "" ;
      lV39Wcwprdnocdencds_1_filterfulltext = "" ;
      lV40Wcwprdnocdencds_2_tfprdnum = "" ;
      lV42Wcwprdnocdencds_4_tfprdnom = "" ;
      A718PrdNom = "" ;
      A396EmprCod = "" ;
      P08QQ2_A396EmprCod = new String[] {""} ;
      P08QQ2_A719PrdNum = new String[] {""} ;
      P08QQ2_A9713Tb1_Cod = new short[1] ;
      P08QQ2_A718PrdNom = new String[] {""} ;
      AV18Option = "" ;
      P08QQ3_A396EmprCod = new String[] {""} ;
      P08QQ3_A9713Tb1_Cod = new short[1] ;
      P08QQ3_A718PrdNom = new String[] {""} ;
      P08QQ3_A719PrdNum = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwprdnocdencgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08QQ2_A396EmprCod, P08QQ2_A719PrdNum, P08QQ2_A9713Tb1_Cod, P08QQ2_A718PrdNom
            }
            , new Object[] {
            P08QQ3_A396EmprCod, P08QQ3_A9713Tb1_Cod, P08QQ3_A718PrdNom, P08QQ3_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV33Tb1_cod ;
   private short A9713Tb1_Cod ;
   private short Gx_err ;
   private int AV37GXV1 ;
   private long AV26count ;
   private String AV10TFPrdNum ;
   private String AV11TFPrdNum_Sel ;
   private String AV12TFPrdNom ;
   private String AV13TFPrdNom_Sel ;
   private String AV32Emprcod ;
   private String A719PrdNum ;
   private String AV40Wcwprdnocdencds_2_tfprdnum ;
   private String AV41Wcwprdnocdencds_3_tfprdnum_sel ;
   private String AV42Wcwprdnocdencds_4_tfprdnom ;
   private String AV43Wcwprdnocdencds_5_tfprdnom_sel ;
   private String scmdbuf ;
   private String lV40Wcwprdnocdencds_2_tfprdnum ;
   private String lV42Wcwprdnocdencds_4_tfprdnom ;
   private String A718PrdNom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8QQ2 ;
   private boolean brk8QQ4 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV34FilterFullText ;
   private String AV39Wcwprdnocdencds_1_filterfulltext ;
   private String lV39Wcwprdnocdencds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08QQ2_A396EmprCod ;
   private String[] P08QQ2_A719PrdNum ;
   private short[] P08QQ2_A9713Tb1_Cod ;
   private String[] P08QQ2_A718PrdNom ;
   private String[] P08QQ3_A396EmprCod ;
   private short[] P08QQ3_A9713Tb1_Cod ;
   private String[] P08QQ3_A718PrdNom ;
   private String[] P08QQ3_A719PrdNum ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class wcwprdnocdencgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08QQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Wcwprdnocdencds_1_filterfulltext ,
                                          String AV41Wcwprdnocdencds_3_tfprdnum_sel ,
                                          String AV40Wcwprdnocdencds_2_tfprdnum ,
                                          String AV43Wcwprdnocdencds_5_tfprdnom_sel ,
                                          String AV42Wcwprdnocdencds_4_tfprdnom ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          short A9713Tb1_Cod ,
                                          short AV33Tb1_cod ,
                                          String AV32Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[8];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrdNum, T1.Tb1_Cod, T2.PrdNom FROM (TXPCdnEnc T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Tb1_Cod = ?)");
      if ( ! (GXutil.strcmp("", AV39Wcwprdnocdencds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Wcwprdnocdencds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV40Wcwprdnocdencds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Wcwprdnocdencds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Wcwprdnocdencds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV42Wcwprdnocdencds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Wcwprdnocdencds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PrdNum, T1.Tb1_Cod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08QQ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV39Wcwprdnocdencds_1_filterfulltext ,
                                          String AV41Wcwprdnocdencds_3_tfprdnum_sel ,
                                          String AV40Wcwprdnocdencds_2_tfprdnum ,
                                          String AV43Wcwprdnocdencds_5_tfprdnom_sel ,
                                          String AV42Wcwprdnocdencds_4_tfprdnom ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          String A396EmprCod ,
                                          String AV32Emprcod ,
                                          short A9713Tb1_Cod ,
                                          short AV33Tb1_cod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[8];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Tb1_Cod, T2.PrdNom, T1.PrdNum FROM (TXPCdnEnc T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.Tb1_Cod = ?)");
      if ( ! (GXutil.strcmp("", AV39Wcwprdnocdencds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
         GXv_int4[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Wcwprdnocdencds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV40Wcwprdnocdencds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Wcwprdnocdencds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Wcwprdnocdencds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV42Wcwprdnocdencds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Wcwprdnocdencds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
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
                  return conditional_P08QQ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] );
            case 1 :
                  return conditional_P08QQ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08QQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08QQ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               return;
      }
   }

}

