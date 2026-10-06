package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class borradodeformulas_wcgetfilterdata extends GXProcedure
{
   public borradodeformulas_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( borradodeformulas_wcgetfilterdata.class ), "" );
   }

   public borradodeformulas_wcgetfilterdata( int remoteHandle ,
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
      borradodeformulas_wcgetfilterdata.this.aP5 = new String[] {""};
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
      borradodeformulas_wcgetfilterdata.this.AV25DDOName = aP0;
      borradodeformulas_wcgetfilterdata.this.AV26SearchTxt = aP1;
      borradodeformulas_wcgetfilterdata.this.AV27SearchTxtTo = aP2;
      borradodeformulas_wcgetfilterdata.this.aP3 = aP3;
      borradodeformulas_wcgetfilterdata.this.aP4 = aP4;
      borradodeformulas_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV17OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV18OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV25DDOName), "DDO_NUM_HDRSH") == 0 )
      {
         /* Execute user subroutine: 'LOADNUM_HDRSHOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV28OptionsJson = AV15Options.toJSonString(false) ;
      AV29OptionsDescJson = AV17OptionsDesc.toJSonString(false) ;
      AV30OptionIndexesJson = AV18OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue("FormulacionTinte.BorradodeFormulas_WCGridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.BorradodeFormulas_WCGridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV20Session.getValue("FormulacionTinte.BorradodeFormulas_WCGridState"), null, null);
      }
      AV45GXV1 = 1 ;
      while ( AV45GXV1 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV45GXV1));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNUM_HDRSH") == 0 )
         {
            AV11TFNum_hdrsH = (short)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFNUM_HDRSH_SEL") == 0 )
         {
            AV12TFNum_hdrsH_Sel = (short)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV31Emprcod = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV32Clicod = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV33Clicod_to = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV34Forser = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV35Forser_to = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV36Forcolnom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV37Forcolnom_to = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV38Forcolnum = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV39Forcolnum_to = (int)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV40TipColCod = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV41TipColCod_to = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORULTUTI") == 0 )
         {
            AV42ForUltUti = localUtil.ctod( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV45GXV1 = (int)(AV45GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADNUM_HDRSHOPTIONS' Routine */
      returnInSub = false ;
      AV11TFNum_hdrsH = (short)(GXutil.lval( AV26SearchTxt)) ;
      AV12TFNum_hdrsH_Sel = (short)(0) ;
      AV47Formulaciontinte_borradodeformulas_wcds_1_tfnum_hdrsh = AV11TFNum_hdrsH ;
      AV48Formulaciontinte_borradodeformulas_wcds_2_tfnum_hdrsh_sel = AV12TFNum_hdrsH_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV32Clicod) ,
                                           Integer.valueOf(AV33Clicod_to) ,
                                           AV34Forser ,
                                           AV35Forser_to ,
                                           AV36Forcolnom ,
                                           AV37Forcolnom_to ,
                                           Integer.valueOf(AV38Forcolnum) ,
                                           Integer.valueOf(AV39Forcolnum_to) ,
                                           Byte.valueOf(AV40TipColCod) ,
                                           Byte.valueOf(AV41TipColCod_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A496ForUltUti ,
                                           AV42ForUltUti ,
                                           A2749ForPro ,
                                           AV31Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P09WB2 */
      pr_default.execute(0, new Object[] {AV31Emprcod, AV42ForUltUti, Integer.valueOf(AV32Clicod), Integer.valueOf(AV33Clicod_to), AV34Forser, AV35Forser_to, AV36Forcolnom, AV37Forcolnom_to, Integer.valueOf(AV38Forcolnum), Integer.valueOf(AV39Forcolnum_to), Byte.valueOf(AV40TipColCod), Byte.valueOf(AV41TipColCod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2749ForPro = P09WB2_A2749ForPro[0] ;
         n2749ForPro = P09WB2_n2749ForPro[0] ;
         A496ForUltUti = P09WB2_A496ForUltUti[0] ;
         n496ForUltUti = P09WB2_n496ForUltUti[0] ;
         A831TipColCod = P09WB2_A831TipColCod[0] ;
         A483ForColNum = P09WB2_A483ForColNum[0] ;
         A482ForColNom = P09WB2_A482ForColNom[0] ;
         A494ForSer = P09WB2_A494ForSer[0] ;
         A252CliCod = P09WB2_A252CliCod[0] ;
         A396EmprCod = P09WB2_A396EmprCod[0] ;
         GXt_int2 = AV10Num_hdrsH ;
         GXv_int3[0] = GXt_int2 ;
         new app.formulaciontinte.pkilequi2historico(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, GXv_int3) ;
         borradodeformulas_wcgetfilterdata.this.GXt_int2 = GXv_int3[0] ;
         AV10Num_hdrsH = (short)(GXt_int2) ;
         if ( ! (0==AV10Num_hdrsH) )
         {
            AV14Option = GXutil.str( AV10Num_hdrsH, 4, 0) ;
            AV13InsertIndex = 1 ;
            while ( ( AV13InsertIndex <= AV15Options.size() ) && ( GXutil.strcmp((String)AV15Options.elementAt(-1+AV13InsertIndex), AV14Option) < 0 ) )
            {
               AV13InsertIndex = (int)(AV13InsertIndex+1) ;
            }
            if ( ( ( AV13InsertIndex == AV15Options.size() + 1 ) ) || ( GXutil.strcmp((String)AV15Options.elementAt(-1+AV13InsertIndex), AV14Option) != 0 ) )
            {
               AV15Options.add(AV14Option, AV13InsertIndex);
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = borradodeformulas_wcgetfilterdata.this.AV28OptionsJson;
      this.aP4[0] = borradodeformulas_wcgetfilterdata.this.AV29OptionsDescJson;
      this.aP5[0] = borradodeformulas_wcgetfilterdata.this.AV30OptionIndexesJson;
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
      AV29OptionsDescJson = "" ;
      AV30OptionIndexesJson = "" ;
      AV15Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV17OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV31Emprcod = "" ;
      AV34Forser = "" ;
      AV35Forser_to = "" ;
      AV36Forcolnom = "" ;
      AV37Forcolnom_to = "" ;
      AV42ForUltUti = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      scmdbuf = "" ;
      A496ForUltUti = GXutil.nullDate() ;
      A2749ForPro = "" ;
      P09WB2_A2749ForPro = new String[] {""} ;
      P09WB2_n2749ForPro = new boolean[] {false} ;
      P09WB2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      P09WB2_n496ForUltUti = new boolean[] {false} ;
      P09WB2_A831TipColCod = new byte[1] ;
      P09WB2_A483ForColNum = new int[1] ;
      P09WB2_A482ForColNom = new String[] {""} ;
      P09WB2_A494ForSer = new String[] {""} ;
      P09WB2_A252CliCod = new int[1] ;
      P09WB2_A396EmprCod = new String[] {""} ;
      GXv_int3 = new int[1] ;
      AV14Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.borradodeformulas_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09WB2_A2749ForPro, P09WB2_n2749ForPro, P09WB2_A496ForUltUti, P09WB2_n496ForUltUti, P09WB2_A831TipColCod, P09WB2_A483ForColNum, P09WB2_A482ForColNom, P09WB2_A494ForSer, P09WB2_A252CliCod, P09WB2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV40TipColCod ;
   private byte AV41TipColCod_to ;
   private byte A831TipColCod ;
   private short AV11TFNum_hdrsH ;
   private short AV12TFNum_hdrsH_Sel ;
   private short AV47Formulaciontinte_borradodeformulas_wcds_1_tfnum_hdrsh ;
   private short AV48Formulaciontinte_borradodeformulas_wcds_2_tfnum_hdrsh_sel ;
   private short AV10Num_hdrsH ;
   private short Gx_err ;
   private int AV45GXV1 ;
   private int AV32Clicod ;
   private int AV33Clicod_to ;
   private int AV38Forcolnum ;
   private int AV39Forcolnum_to ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int GXt_int2 ;
   private int GXv_int3[] ;
   private int AV13InsertIndex ;
   private String AV31Emprcod ;
   private String AV34Forser ;
   private String AV35Forser_to ;
   private String AV36Forcolnom ;
   private String AV37Forcolnom_to ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String scmdbuf ;
   private String A2749ForPro ;
   private java.util.Date AV42ForUltUti ;
   private java.util.Date A496ForUltUti ;
   private boolean returnInSub ;
   private boolean n2749ForPro ;
   private boolean n496ForUltUti ;
   private String AV28OptionsJson ;
   private String AV29OptionsDescJson ;
   private String AV30OptionIndexesJson ;
   private String AV25DDOName ;
   private String AV26SearchTxt ;
   private String AV27SearchTxtTo ;
   private String AV14Option ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09WB2_A2749ForPro ;
   private boolean[] P09WB2_n2749ForPro ;
   private java.util.Date[] P09WB2_A496ForUltUti ;
   private boolean[] P09WB2_n496ForUltUti ;
   private byte[] P09WB2_A831TipColCod ;
   private int[] P09WB2_A483ForColNum ;
   private String[] P09WB2_A482ForColNom ;
   private String[] P09WB2_A494ForSer ;
   private int[] P09WB2_A252CliCod ;
   private String[] P09WB2_A396EmprCod ;
   private GXSimpleCollection<String> AV15Options ;
   private GXSimpleCollection<String> AV17OptionsDesc ;
   private GXSimpleCollection<String> AV18OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
}

final  class borradodeformulas_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09WB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV32Clicod ,
                                          int AV33Clicod_to ,
                                          String AV34Forser ,
                                          String AV35Forser_to ,
                                          String AV36Forcolnom ,
                                          String AV37Forcolnom_to ,
                                          int AV38Forcolnum ,
                                          int AV39Forcolnum_to ,
                                          byte AV40TipColCod ,
                                          byte AV41TipColCod_to ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          java.util.Date A496ForUltUti ,
                                          java.util.Date AV42ForUltUti ,
                                          String A2749ForPro ,
                                          String AV31Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[12];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT ForPro, ForUltUti, TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod FROM TXPCFORMU" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(ForUltUti <= ?)");
      addWhere(sWhereString, "(Not (ForUltUti = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(ForPro <> 'S')");
      if ( ! (0==AV32Clicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV33Clicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34Forser)==0) )
      {
         addWhere(sWhereString, "(ForSer >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35Forser_to)==0) )
      {
         addWhere(sWhereString, "(ForSer <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36Forcolnom)==0) )
      {
         addWhere(sWhereString, "(ForColNom >= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV37Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(ForColNom <= ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV38Forcolnum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV39Forcolnum_to) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV40TipColCod) )
      {
         addWhere(sWhereString, "(TipColCod >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV41TipColCod_to) )
      {
         addWhere(sWhereString, "(TipColCod <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod" ;
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
                  return conditional_P09WB2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09WB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
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
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               return;
      }
   }

}

