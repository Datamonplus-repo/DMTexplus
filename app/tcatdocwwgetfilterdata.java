package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tcatdocwwgetfilterdata extends GXProcedure
{
   public tcatdocwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcatdocwwgetfilterdata.class ), "" );
   }

   public tcatdocwwgetfilterdata( int remoteHandle ,
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
      tcatdocwwgetfilterdata.this.aP5 = new String[] {""};
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
      tcatdocwwgetfilterdata.this.AV16DDOName = aP0;
      tcatdocwwgetfilterdata.this.AV14SearchTxt = aP1;
      tcatdocwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tcatdocwwgetfilterdata.this.aP3 = aP3;
      tcatdocwwgetfilterdata.this.aP4 = aP4;
      tcatdocwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_CATDOCNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCATDOCNOMOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("TCATDOCWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TCATDOCWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TCATDOCWWGridState"), null, null);
      }
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV35GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCID") == 0 )
         {
            AV12TFCatDocID = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFCatDocID_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCNOM") == 0 )
         {
            AV10TFCatDocNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCNOM_SEL") == 0 )
         {
            AV11TFCatDocNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCATDOCNOMOPTIONS' Routine */
      returnInSub = false ;
      AV10TFCatDocNom = AV14SearchTxt ;
      AV11TFCatDocNom_Sel = "" ;
      AV37Tcatdocwwds_1_filterfulltext = AV32FilterFullText ;
      AV38Tcatdocwwds_2_tfcatdocid = AV12TFCatDocID ;
      AV39Tcatdocwwds_3_tfcatdocid_to = AV13TFCatDocID_To ;
      AV40Tcatdocwwds_4_tfcatdocnom = AV10TFCatDocNom ;
      AV41Tcatdocwwds_5_tfcatdocnom_sel = AV11TFCatDocNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV37Tcatdocwwds_1_filterfulltext ,
                                           Short.valueOf(AV38Tcatdocwwds_2_tfcatdocid) ,
                                           Short.valueOf(AV39Tcatdocwwds_3_tfcatdocid_to) ,
                                           AV41Tcatdocwwds_5_tfcatdocnom_sel ,
                                           AV40Tcatdocwwds_4_tfcatdocnom ,
                                           Short.valueOf(A13453CatDocID) ,
                                           A13454CatDocNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV37Tcatdocwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Tcatdocwwds_1_filterfulltext), "%", "") ;
      lV37Tcatdocwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV37Tcatdocwwds_1_filterfulltext), "%", "") ;
      lV40Tcatdocwwds_4_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV40Tcatdocwwds_4_tfcatdocnom), 30, "%") ;
      /* Using cursor P091U2 */
      pr_default.execute(0, new Object[] {lV37Tcatdocwwds_1_filterfulltext, lV37Tcatdocwwds_1_filterfulltext, Short.valueOf(AV38Tcatdocwwds_2_tfcatdocid), Short.valueOf(AV39Tcatdocwwds_3_tfcatdocid_to), lV40Tcatdocwwds_4_tfcatdocnom, AV41Tcatdocwwds_5_tfcatdocnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk91U2 = false ;
         A13454CatDocNom = P091U2_A13454CatDocNom[0] ;
         n13454CatDocNom = P091U2_n13454CatDocNom[0] ;
         A13453CatDocID = P091U2_A13453CatDocID[0] ;
         A396EmprCod = P091U2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P091U2_A13454CatDocNom[0], A13454CatDocNom) == 0 ) )
         {
            brk91U2 = false ;
            A13453CatDocID = P091U2_A13453CatDocID[0] ;
            A396EmprCod = P091U2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk91U2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A13454CatDocNom)==0) )
         {
            AV18Option = A13454CatDocNom ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk91U2 )
         {
            brk91U2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tcatdocwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tcatdocwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tcatdocwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV10TFCatDocNom = "" ;
      AV11TFCatDocNom_Sel = "" ;
      A13454CatDocNom = "" ;
      AV37Tcatdocwwds_1_filterfulltext = "" ;
      AV40Tcatdocwwds_4_tfcatdocnom = "" ;
      AV41Tcatdocwwds_5_tfcatdocnom_sel = "" ;
      scmdbuf = "" ;
      lV37Tcatdocwwds_1_filterfulltext = "" ;
      lV40Tcatdocwwds_4_tfcatdocnom = "" ;
      P091U2_A13454CatDocNom = new String[] {""} ;
      P091U2_n13454CatDocNom = new boolean[] {false} ;
      P091U2_A13453CatDocID = new short[1] ;
      P091U2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcatdocwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P091U2_A13454CatDocNom, P091U2_n13454CatDocNom, P091U2_A13453CatDocID, P091U2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV12TFCatDocID ;
   private short AV13TFCatDocID_To ;
   private short AV38Tcatdocwwds_2_tfcatdocid ;
   private short AV39Tcatdocwwds_3_tfcatdocid_to ;
   private short A13453CatDocID ;
   private short Gx_err ;
   private int AV35GXV1 ;
   private long AV26count ;
   private String AV10TFCatDocNom ;
   private String AV11TFCatDocNom_Sel ;
   private String A13454CatDocNom ;
   private String AV40Tcatdocwwds_4_tfcatdocnom ;
   private String AV41Tcatdocwwds_5_tfcatdocnom_sel ;
   private String scmdbuf ;
   private String lV40Tcatdocwwds_4_tfcatdocnom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk91U2 ;
   private boolean n13454CatDocNom ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV32FilterFullText ;
   private String AV37Tcatdocwwds_1_filterfulltext ;
   private String lV37Tcatdocwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P091U2_A13454CatDocNom ;
   private boolean[] P091U2_n13454CatDocNom ;
   private short[] P091U2_A13453CatDocID ;
   private String[] P091U2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tcatdocwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P091U2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV37Tcatdocwwds_1_filterfulltext ,
                                          short AV38Tcatdocwwds_2_tfcatdocid ,
                                          short AV39Tcatdocwwds_3_tfcatdocid_to ,
                                          String AV41Tcatdocwwds_5_tfcatdocnom_sel ,
                                          String AV40Tcatdocwwds_4_tfcatdocnom ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CatDocNom, CatDocID, EmprCod FROM TXPCATDOC" ;
      if ( ! (GXutil.strcmp("", AV37Tcatdocwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CatDocID,'9990'), 2) like '%' || ?) or ( UPPER(CatDocNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV38Tcatdocwwds_2_tfcatdocid) )
      {
         addWhere(sWhereString, "(CatDocID >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV39Tcatdocwwds_3_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(CatDocID <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV41Tcatdocwwds_5_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV40Tcatdocwwds_4_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV41Tcatdocwwds_5_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(CatDocNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CatDocNom" ;
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
                  return conditional_P091U2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091U2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

