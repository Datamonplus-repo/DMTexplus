package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tcatdefwwgetfilterdata extends GXProcedure
{
   public tcatdefwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcatdefwwgetfilterdata.class ), "" );
   }

   public tcatdefwwgetfilterdata( int remoteHandle ,
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
      tcatdefwwgetfilterdata.this.aP5 = new String[] {""};
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
      tcatdefwwgetfilterdata.this.AV16DDOName = aP0;
      tcatdefwwgetfilterdata.this.AV14SearchTxt = aP1;
      tcatdefwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tcatdefwwgetfilterdata.this.aP3 = aP3;
      tcatdefwwgetfilterdata.this.aP4 = aP4;
      tcatdefwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_CATDEFDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADCATDEFDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("TCatDefWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TCatDefWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TCatDefWWGridState"), null, null);
      }
      AV49GXV1 = 1 ;
      while ( AV49GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV49GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDEFDSC") == 0 )
         {
            AV12TFCatDefDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDEFDSC_SEL") == 0 )
         {
            AV13TFCatDefDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDEFCOD") == 0 )
         {
            AV10TFCatDefCod = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCatDefCod_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV49GXV1 = (int)(AV49GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCATDEFDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCatDefDsc = AV14SearchTxt ;
      AV13TFCatDefDsc_Sel = "" ;
      AV51Tcatdefwwds_1_filterfulltext = AV46FilterFullText ;
      AV52Tcatdefwwds_2_tfcatdefdsc = AV12TFCatDefDsc ;
      AV53Tcatdefwwds_3_tfcatdefdsc_sel = AV13TFCatDefDsc_Sel ;
      AV54Tcatdefwwds_4_tfcatdefcod = AV10TFCatDefCod ;
      AV55Tcatdefwwds_5_tfcatdefcod_to = AV11TFCatDefCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV51Tcatdefwwds_1_filterfulltext ,
                                           AV53Tcatdefwwds_3_tfcatdefdsc_sel ,
                                           AV52Tcatdefwwds_2_tfcatdefdsc ,
                                           Short.valueOf(AV54Tcatdefwwds_4_tfcatdefcod) ,
                                           Short.valueOf(AV55Tcatdefwwds_5_tfcatdefcod_to) ,
                                           A4414CatDefDsc ,
                                           Short.valueOf(A4413CatDefCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT
                                           }
      });
      lV51Tcatdefwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tcatdefwwds_1_filterfulltext), "%", "") ;
      lV51Tcatdefwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV51Tcatdefwwds_1_filterfulltext), "%", "") ;
      lV52Tcatdefwwds_2_tfcatdefdsc = GXutil.padr( GXutil.rtrim( AV52Tcatdefwwds_2_tfcatdefdsc), 30, "%") ;
      /* Using cursor P081J2 */
      pr_default.execute(0, new Object[] {lV51Tcatdefwwds_1_filterfulltext, lV51Tcatdefwwds_1_filterfulltext, lV52Tcatdefwwds_2_tfcatdefdsc, AV53Tcatdefwwds_3_tfcatdefdsc_sel, Short.valueOf(AV54Tcatdefwwds_4_tfcatdefcod), Short.valueOf(AV55Tcatdefwwds_5_tfcatdefcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk81J2 = false ;
         A4414CatDefDsc = P081J2_A4414CatDefDsc[0] ;
         n4414CatDefDsc = P081J2_n4414CatDefDsc[0] ;
         A4413CatDefCod = P081J2_A4413CatDefCod[0] ;
         A396EmprCod = P081J2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P081J2_A4414CatDefDsc[0], A4414CatDefDsc) == 0 ) )
         {
            brk81J2 = false ;
            A4413CatDefCod = P081J2_A4413CatDefCod[0] ;
            A396EmprCod = P081J2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk81J2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4414CatDefDsc)==0) )
         {
            AV18Option = A4414CatDefDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81J2 )
         {
            brk81J2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tcatdefwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tcatdefwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tcatdefwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV46FilterFullText = "" ;
      AV12TFCatDefDsc = "" ;
      AV13TFCatDefDsc_Sel = "" ;
      A4414CatDefDsc = "" ;
      AV51Tcatdefwwds_1_filterfulltext = "" ;
      AV52Tcatdefwwds_2_tfcatdefdsc = "" ;
      AV53Tcatdefwwds_3_tfcatdefdsc_sel = "" ;
      scmdbuf = "" ;
      lV51Tcatdefwwds_1_filterfulltext = "" ;
      lV52Tcatdefwwds_2_tfcatdefdsc = "" ;
      P081J2_A4414CatDefDsc = new String[] {""} ;
      P081J2_n4414CatDefDsc = new boolean[] {false} ;
      P081J2_A4413CatDefCod = new short[1] ;
      P081J2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcatdefwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P081J2_A4414CatDefDsc, P081J2_n4414CatDefDsc, P081J2_A4413CatDefCod, P081J2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFCatDefCod ;
   private short AV11TFCatDefCod_To ;
   private short AV54Tcatdefwwds_4_tfcatdefcod ;
   private short AV55Tcatdefwwds_5_tfcatdefcod_to ;
   private short A4413CatDefCod ;
   private short Gx_err ;
   private int AV49GXV1 ;
   private long AV26count ;
   private String AV12TFCatDefDsc ;
   private String AV13TFCatDefDsc_Sel ;
   private String A4414CatDefDsc ;
   private String AV52Tcatdefwwds_2_tfcatdefdsc ;
   private String AV53Tcatdefwwds_3_tfcatdefdsc_sel ;
   private String scmdbuf ;
   private String lV52Tcatdefwwds_2_tfcatdefdsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk81J2 ;
   private boolean n4414CatDefDsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV51Tcatdefwwds_1_filterfulltext ;
   private String lV51Tcatdefwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P081J2_A4414CatDefDsc ;
   private boolean[] P081J2_n4414CatDefDsc ;
   private short[] P081J2_A4413CatDefCod ;
   private String[] P081J2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tcatdefwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P081J2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV51Tcatdefwwds_1_filterfulltext ,
                                          String AV53Tcatdefwwds_3_tfcatdefdsc_sel ,
                                          String AV52Tcatdefwwds_2_tfcatdefdsc ,
                                          short AV54Tcatdefwwds_4_tfcatdefcod ,
                                          short AV55Tcatdefwwds_5_tfcatdefcod_to ,
                                          String A4414CatDefDsc ,
                                          short A4413CatDefCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CatDefDsc, CatDefCod, EmprCod FROM TXPCatDef" ;
      if ( ! (GXutil.strcmp("", AV51Tcatdefwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(CatDefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CatDefCod,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53Tcatdefwwds_3_tfcatdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV52Tcatdefwwds_2_tfcatdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CatDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53Tcatdefwwds_3_tfcatdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(CatDefDsc = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV54Tcatdefwwds_4_tfcatdefcod) )
      {
         addWhere(sWhereString, "(CatDefCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV55Tcatdefwwds_5_tfcatdefcod_to) )
      {
         addWhere(sWhereString, "(CatDefCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CatDefDsc" ;
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
                  return conditional_P081J2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P081J2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
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
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[10]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               return;
      }
   }

}

