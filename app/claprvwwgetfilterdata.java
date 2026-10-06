package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class claprvwwgetfilterdata extends GXProcedure
{
   public claprvwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( claprvwwgetfilterdata.class ), "" );
   }

   public claprvwwgetfilterdata( int remoteHandle ,
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
      claprvwwgetfilterdata.this.aP5 = new String[] {""};
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
      claprvwwgetfilterdata.this.AV16DDOName = aP0;
      claprvwwgetfilterdata.this.AV14SearchTxt = aP1;
      claprvwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      claprvwwgetfilterdata.this.aP3 = aP3;
      claprvwwgetfilterdata.this.aP4 = aP4;
      claprvwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PRVCLASDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPRVCLASDSCOPTIONS' */
         S121 ();
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
      if ( GXutil.strcmp(AV27Session.getValue("CLAPRVWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "CLAPRVWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("CLAPRVWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCLASID") == 0 )
         {
            AV10TFPrvClasID = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFPrvClasID_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCLASDSC") == 0 )
         {
            AV12TFPrvClasDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCLASDSC_SEL") == 0 )
         {
            AV13TFPrvClasDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPRVCLASDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFPrvClasDsc = AV14SearchTxt ;
      AV13TFPrvClasDsc_Sel = "" ;
      AV37Claprvwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Claprvwwds_2_tfprvclasid = AV10TFPrvClasID ;
      AV39Claprvwwds_3_tfprvclasid_to = AV11TFPrvClasID_To ;
      AV40Claprvwwds_4_tfprvclasdsc = AV12TFPrvClasDsc ;
      AV41Claprvwwds_5_tfprvclasdsc_sel = AV13TFPrvClasDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Claprvwwds_1_filterfulltext ,
                                           Short.valueOf(AV38Claprvwwds_2_tfprvclasid) ,
                                           Short.valueOf(AV39Claprvwwds_3_tfprvclasid_to) ,
                                           AV41Claprvwwds_5_tfprvclasdsc_sel ,
                                           AV40Claprvwwds_4_tfprvclasdsc ,
                                           Short.valueOf(A14030PrvClasID) ,
                                           A14031PrvClasDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING
                                           }
      });
      lV37Claprvwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Claprvwwds_1_filterfulltext), "%", "") ;
      lV37Claprvwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Claprvwwds_1_filterfulltext), "%", "") ;
      lV40Claprvwwds_4_tfprvclasdsc = GXutil.padr( GXutil.rtrim( AV40Claprvwwds_4_tfprvclasdsc), 30, "%") ;
      /* Using cursor P09LW2 */
      pr_default.execute(0, new Object[] {lV37Claprvwwds_1_filterfulltext, lV37Claprvwwds_1_filterfulltext, Short.valueOf(AV38Claprvwwds_2_tfprvclasid), Short.valueOf(AV39Claprvwwds_3_tfprvclasid_to), lV40Claprvwwds_4_tfprvclasdsc, AV41Claprvwwds_5_tfprvclasdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9LW2 = false ;
         A14031PrvClasDsc = P09LW2_A14031PrvClasDsc[0] ;
         A14030PrvClasID = P09LW2_A14030PrvClasID[0] ;
         A396EmprCod = P09LW2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09LW2_A14031PrvClasDsc[0], A14031PrvClasDsc) == 0 ) )
         {
            brk9LW2 = false ;
            A14030PrvClasID = P09LW2_A14030PrvClasID[0] ;
            A396EmprCod = P09LW2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk9LW2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A14031PrvClasDsc)==0) )
         {
            AV18Option = A14031PrvClasDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9LW2 )
         {
            brk9LW2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = claprvwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = claprvwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = claprvwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFPrvClasDsc = "" ;
      AV13TFPrvClasDsc_Sel = "" ;
      A14031PrvClasDsc = "" ;
      AV37Claprvwwds_1_filterfulltext = "" ;
      AV40Claprvwwds_4_tfprvclasdsc = "" ;
      AV41Claprvwwds_5_tfprvclasdsc_sel = "" ;
      scmdbuf = "" ;
      lV37Claprvwwds_1_filterfulltext = "" ;
      lV40Claprvwwds_4_tfprvclasdsc = "" ;
      P09LW2_A14031PrvClasDsc = new String[] {""} ;
      P09LW2_A14030PrvClasID = new short[1] ;
      P09LW2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.claprvwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09LW2_A14031PrvClasDsc, P09LW2_A14030PrvClasID, P09LW2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFPrvClasID ;
   private short AV11TFPrvClasID_To ;
   private short AV38Claprvwwds_2_tfprvclasid ;
   private short AV39Claprvwwds_3_tfprvclasid_to ;
   private short A14030PrvClasID ;
   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV12TFPrvClasDsc ;
   private String AV13TFPrvClasDsc_Sel ;
   private String A14031PrvClasDsc ;
   private String AV40Claprvwwds_4_tfprvclasdsc ;
   private String AV41Claprvwwds_5_tfprvclasdsc_sel ;
   private String scmdbuf ;
   private String lV40Claprvwwds_4_tfprvclasdsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9LW2 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Claprvwwds_1_filterfulltext ;
   private String lV37Claprvwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09LW2_A14031PrvClasDsc ;
   private short[] P09LW2_A14030PrvClasID ;
   private String[] P09LW2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class claprvwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Claprvwwds_1_filterfulltext ,
                                          short AV38Claprvwwds_2_tfprvclasid ,
                                          short AV39Claprvwwds_3_tfprvclasid_to ,
                                          String AV41Claprvwwds_5_tfprvclasdsc_sel ,
                                          String AV40Claprvwwds_4_tfprvclasdsc ,
                                          short A14030PrvClasID ,
                                          String A14031PrvClasDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT PrvClasDsc, PrvClasID, EmprCod FROM TXPCLAPRV" ;
      if ( ! (GXutil.strcmp("", AV37Claprvwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(PrvClasID,'9990'), 2) like '%' || ?) or ( UPPER(PrvClasDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV38Claprvwwds_2_tfprvclasid) )
      {
         addWhere(sWhereString, "(PrvClasID >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Claprvwwds_3_tfprvclasid_to) )
      {
         addWhere(sWhereString, "(PrvClasID <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Claprvwwds_5_tfprvclasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV40Claprvwwds_4_tfprvclasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvClasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Claprvwwds_5_tfprvclasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(PrvClasDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY PrvClasDsc" ;
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
                  return conditional_P09LW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
                  stmt.setVarchar(sIdx, (String)parms[6], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 30);
               }
               return;
      }
   }

}

