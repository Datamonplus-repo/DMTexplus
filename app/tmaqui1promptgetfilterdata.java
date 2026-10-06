package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmaqui1promptgetfilterdata extends GXProcedure
{
   public tmaqui1promptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqui1promptgetfilterdata.class ), "" );
   }

   public tmaqui1promptgetfilterdata( int remoteHandle ,
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
      tmaqui1promptgetfilterdata.this.aP5 = new String[] {""};
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
      tmaqui1promptgetfilterdata.this.AV24DDOName = aP0;
      tmaqui1promptgetfilterdata.this.AV22SearchTxt = aP1;
      tmaqui1promptgetfilterdata.this.AV23SearchTxtTo = aP2;
      tmaqui1promptgetfilterdata.this.aP3 = aP3;
      tmaqui1promptgetfilterdata.this.aP4 = aP4;
      tmaqui1promptgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV24DDOName), "DDO_MAQTINTIP") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQTINTIPOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV35Session.getValue("TMAQUI1PromptGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMAQUI1PromptGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV35Session.getValue("TMAQUI1PromptGridState"), null, null);
      }
      AV44GXV1 = 1 ;
      while ( AV44GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV44GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV40FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMED") == 0 )
         {
            AV12TFMaqVolMed = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFMaqVolMed_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMIN") == 0 )
         {
            AV14TFMaqVolMin = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFMaqVolMin_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP") == 0 )
         {
            AV16TFMaqTinTip = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP_SEL") == 0 )
         {
            AV17TFMaqTinTip_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLTOP") == 0 )
         {
            AV18TFMaqVolTop = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFMaqVolTop_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLRES") == 0 )
         {
            AV20TFMaqVolRes = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV21TFMaqVolRes_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV44GXV1 = (int)(AV44GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMAQTINTIPOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMaqTinTip = AV22SearchTxt ;
      AV17TFMaqTinTip_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV40FilterFullText ,
                                           Integer.valueOf(AV12TFMaqVolMed) ,
                                           Integer.valueOf(AV13TFMaqVolMed_To) ,
                                           Integer.valueOf(AV14TFMaqVolMin) ,
                                           Integer.valueOf(AV15TFMaqVolMin_To) ,
                                           AV17TFMaqTinTip_Sel ,
                                           AV16TFMaqTinTip ,
                                           Integer.valueOf(AV18TFMaqVolTop) ,
                                           Integer.valueOf(AV19TFMaqVolTop_To) ,
                                           Integer.valueOf(AV20TFMaqVolRes) ,
                                           Integer.valueOf(AV21TFMaqVolRes_To) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A624MaqVolMed) ,
                                           Integer.valueOf(A625MaqVolMin) ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A2802MaqVolTop) ,
                                           Integer.valueOf(A2801MaqVolRes) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV40FilterFullText = GXutil.concat( GXutil.rtrim( AV40FilterFullText), "%", "") ;
      lV16TFMaqTinTip = GXutil.padr( GXutil.rtrim( AV16TFMaqTinTip), 2, "%") ;
      /* Using cursor P09BD2 */
      pr_default.execute(0, new Object[] {lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, lV40FilterFullText, Integer.valueOf(AV12TFMaqVolMed), Integer.valueOf(AV13TFMaqVolMed_To), Integer.valueOf(AV14TFMaqVolMin), Integer.valueOf(AV15TFMaqVolMin_To), lV16TFMaqTinTip, AV17TFMaqTinTip_Sel, Integer.valueOf(AV18TFMaqVolTop), Integer.valueOf(AV19TFMaqVolTop_To), Integer.valueOf(AV20TFMaqVolRes), Integer.valueOf(AV21TFMaqVolRes_To)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9BD2 = false ;
         A619MaqTinTip = P09BD2_A619MaqTinTip[0] ;
         n619MaqTinTip = P09BD2_n619MaqTinTip[0] ;
         A2801MaqVolRes = P09BD2_A2801MaqVolRes[0] ;
         n2801MaqVolRes = P09BD2_n2801MaqVolRes[0] ;
         A2802MaqVolTop = P09BD2_A2802MaqVolTop[0] ;
         n2802MaqVolTop = P09BD2_n2802MaqVolTop[0] ;
         A625MaqVolMin = P09BD2_A625MaqVolMin[0] ;
         n625MaqVolMin = P09BD2_n625MaqVolMin[0] ;
         A624MaqVolMed = P09BD2_A624MaqVolMed[0] ;
         n624MaqVolMed = P09BD2_n624MaqVolMed[0] ;
         A606MaqDsc = P09BD2_A606MaqDsc[0] ;
         n606MaqDsc = P09BD2_n606MaqDsc[0] ;
         A602MaqCod = P09BD2_A602MaqCod[0] ;
         A396EmprCod = P09BD2_A396EmprCod[0] ;
         AV34count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09BD2_A619MaqTinTip[0], A619MaqTinTip) == 0 ) )
         {
            brk9BD2 = false ;
            A602MaqCod = P09BD2_A602MaqCod[0] ;
            A396EmprCod = P09BD2_A396EmprCod[0] ;
            AV34count = (long)(AV34count+1) ;
            brk9BD2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A619MaqTinTip)==0) )
         {
            AV26Option = A619MaqTinTip ;
            AV27Options.add(AV26Option, 0);
            AV32OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV34count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV27Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9BD2 )
         {
            brk9BD2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmaqui1promptgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = tmaqui1promptgetfilterdata.this.AV31OptionsDescJson;
      this.aP5[0] = tmaqui1promptgetfilterdata.this.AV33OptionIndexesJson;
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
      AV16TFMaqTinTip = "" ;
      AV17TFMaqTinTip_Sel = "" ;
      scmdbuf = "" ;
      lV40FilterFullText = "" ;
      lV16TFMaqTinTip = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A619MaqTinTip = "" ;
      P09BD2_A619MaqTinTip = new String[] {""} ;
      P09BD2_n619MaqTinTip = new boolean[] {false} ;
      P09BD2_A2801MaqVolRes = new int[1] ;
      P09BD2_n2801MaqVolRes = new boolean[] {false} ;
      P09BD2_A2802MaqVolTop = new int[1] ;
      P09BD2_n2802MaqVolTop = new boolean[] {false} ;
      P09BD2_A625MaqVolMin = new int[1] ;
      P09BD2_n625MaqVolMin = new boolean[] {false} ;
      P09BD2_A624MaqVolMed = new int[1] ;
      P09BD2_n624MaqVolMed = new boolean[] {false} ;
      P09BD2_A606MaqDsc = new String[] {""} ;
      P09BD2_n606MaqDsc = new boolean[] {false} ;
      P09BD2_A602MaqCod = new String[] {""} ;
      P09BD2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV26Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqui1promptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09BD2_A619MaqTinTip, P09BD2_n619MaqTinTip, P09BD2_A2801MaqVolRes, P09BD2_n2801MaqVolRes, P09BD2_A2802MaqVolTop, P09BD2_n2802MaqVolTop, P09BD2_A625MaqVolMin, P09BD2_n625MaqVolMin, P09BD2_A624MaqVolMed, P09BD2_n624MaqVolMed,
            P09BD2_A606MaqDsc, P09BD2_n606MaqDsc, P09BD2_A602MaqCod, P09BD2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV44GXV1 ;
   private int AV12TFMaqVolMed ;
   private int AV13TFMaqVolMed_To ;
   private int AV14TFMaqVolMin ;
   private int AV15TFMaqVolMin_To ;
   private int AV18TFMaqVolTop ;
   private int AV19TFMaqVolTop_To ;
   private int AV20TFMaqVolRes ;
   private int AV21TFMaqVolRes_To ;
   private int A624MaqVolMed ;
   private int A625MaqVolMin ;
   private int A2802MaqVolTop ;
   private int A2801MaqVolRes ;
   private long AV34count ;
   private String AV16TFMaqTinTip ;
   private String AV17TFMaqTinTip_Sel ;
   private String scmdbuf ;
   private String lV16TFMaqTinTip ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A619MaqTinTip ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9BD2 ;
   private boolean n619MaqTinTip ;
   private boolean n2801MaqVolRes ;
   private boolean n2802MaqVolTop ;
   private boolean n625MaqVolMin ;
   private boolean n624MaqVolMed ;
   private boolean n606MaqDsc ;
   private String AV28OptionsJson ;
   private String AV31OptionsDescJson ;
   private String AV33OptionIndexesJson ;
   private String AV24DDOName ;
   private String AV22SearchTxt ;
   private String AV23SearchTxtTo ;
   private String AV40FilterFullText ;
   private String lV40FilterFullText ;
   private String AV26Option ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09BD2_A619MaqTinTip ;
   private boolean[] P09BD2_n619MaqTinTip ;
   private int[] P09BD2_A2801MaqVolRes ;
   private boolean[] P09BD2_n2801MaqVolRes ;
   private int[] P09BD2_A2802MaqVolTop ;
   private boolean[] P09BD2_n2802MaqVolTop ;
   private int[] P09BD2_A625MaqVolMin ;
   private boolean[] P09BD2_n625MaqVolMin ;
   private int[] P09BD2_A624MaqVolMed ;
   private boolean[] P09BD2_n624MaqVolMed ;
   private String[] P09BD2_A606MaqDsc ;
   private boolean[] P09BD2_n606MaqDsc ;
   private String[] P09BD2_A602MaqCod ;
   private String[] P09BD2_A396EmprCod ;
   private GXSimpleCollection<String> AV27Options ;
   private GXSimpleCollection<String> AV30OptionsDesc ;
   private GXSimpleCollection<String> AV32OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class tmaqui1promptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09BD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV40FilterFullText ,
                                          int AV12TFMaqVolMed ,
                                          int AV13TFMaqVolMed_To ,
                                          int AV14TFMaqVolMin ,
                                          int AV15TFMaqVolMin_To ,
                                          String AV17TFMaqTinTip_Sel ,
                                          String AV16TFMaqTinTip ,
                                          int AV18TFMaqVolTop ,
                                          int AV19TFMaqVolTop_To ,
                                          int AV20TFMaqVolRes ,
                                          int AV21TFMaqVolRes_To ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A624MaqVolMed ,
                                          int A625MaqVolMin ,
                                          String A619MaqTinTip ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[17];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MaqTinTip, MaqVolRes, MaqVolTop, MaqVolMin, MaqVolMed, MaqDsc, MaqCod, EmprCod FROM TXPMAQUIN" ;
      if ( ! (GXutil.strcmp("", AV40FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MaqCod) like '%' || UPPER(?)) or ( UPPER(MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MaqVolMin,'99990'), 2) like '%' || ?) or ( UPPER(MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MaqVolRes,'99990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
         GXv_int2[2] = (byte)(1) ;
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV12TFMaqVolMed) )
      {
         addWhere(sWhereString, "(MaqVolMed >= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV13TFMaqVolMed_To) )
      {
         addWhere(sWhereString, "(MaqVolMed <= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV14TFMaqVolMin) )
      {
         addWhere(sWhereString, "(MaqVolMin >= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV15TFMaqVolMin_To) )
      {
         addWhere(sWhereString, "(MaqVolMin <= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV17TFMaqTinTip_Sel)==0) && ( ! (GXutil.strcmp("", AV16TFMaqTinTip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17TFMaqTinTip_Sel)==0) )
      {
         addWhere(sWhereString, "(MaqTinTip = ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV18TFMaqVolTop) )
      {
         addWhere(sWhereString, "(MaqVolTop >= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV19TFMaqVolTop_To) )
      {
         addWhere(sWhereString, "(MaqVolTop <= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV20TFMaqVolRes) )
      {
         addWhere(sWhereString, "(MaqVolRes >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV21TFMaqVolRes_To) )
      {
         addWhere(sWhereString, "(MaqVolRes <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MaqTinTip" ;
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
                  return conditional_P09BD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09BD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 6);
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
      }
   }

}

