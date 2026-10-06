package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class almprdwwgetfilterdata extends GXProcedure
{
   public almprdwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almprdwwgetfilterdata.class ), "" );
   }

   public almprdwwgetfilterdata( int remoteHandle ,
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
      almprdwwgetfilterdata.this.aP5 = new String[] {""};
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
      almprdwwgetfilterdata.this.AV20DDOName = aP0;
      almprdwwgetfilterdata.this.AV18SearchTxt = aP1;
      almprdwwgetfilterdata.this.AV19SearchTxtTo = aP2;
      almprdwwgetfilterdata.this.aP3 = aP3;
      almprdwwgetfilterdata.this.aP4 = aP4;
      almprdwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_ALMPRDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADALMPRDDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("ALMPRDWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ALMPRDWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("ALMPRDWWGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALMPRDID") == 0 )
         {
            AV14TFAlmPrdID = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFAlmPrdID_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALMPRDDSC") == 0 )
         {
            AV16TFAlmPrdDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALMPRDDSC_SEL") == 0 )
         {
            AV17TFAlmPrdDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADALMPRDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV16TFAlmPrdDsc = AV18SearchTxt ;
      AV17TFAlmPrdDsc_Sel = "" ;
      AV41Almprdwwds_1_filterfulltext = AV36FilterFullText ;
      AV42Almprdwwds_2_tfalmprdid = AV14TFAlmPrdID ;
      AV43Almprdwwds_3_tfalmprdid_to = AV15TFAlmPrdID_To ;
      AV44Almprdwwds_4_tfalmprddsc = AV16TFAlmPrdDsc ;
      AV45Almprdwwds_5_tfalmprddsc_sel = AV17TFAlmPrdDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV41Almprdwwds_1_filterfulltext ,
                                           Short.valueOf(AV42Almprdwwds_2_tfalmprdid) ,
                                           Short.valueOf(AV43Almprdwwds_3_tfalmprdid_to) ,
                                           AV45Almprdwwds_5_tfalmprddsc_sel ,
                                           AV44Almprdwwds_4_tfalmprddsc ,
                                           Short.valueOf(A13927AlmPrdID) ,
                                           A13928AlmPrdDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING
                                           }
      });
      lV41Almprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Almprdwwds_1_filterfulltext), "%", "") ;
      lV41Almprdwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Almprdwwds_1_filterfulltext), "%", "") ;
      lV44Almprdwwds_4_tfalmprddsc = GXutil.padr( GXutil.rtrim( AV44Almprdwwds_4_tfalmprddsc), 10, "%") ;
      /* Using cursor P09D72 */
      pr_default.execute(0, new Object[] {lV41Almprdwwds_1_filterfulltext, lV41Almprdwwds_1_filterfulltext, Short.valueOf(AV42Almprdwwds_2_tfalmprdid), Short.valueOf(AV43Almprdwwds_3_tfalmprdid_to), lV44Almprdwwds_4_tfalmprddsc, AV45Almprdwwds_5_tfalmprddsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9D72 = false ;
         A13928AlmPrdDsc = P09D72_A13928AlmPrdDsc[0] ;
         A13927AlmPrdID = P09D72_A13927AlmPrdID[0] ;
         A396EmprCod = P09D72_A396EmprCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09D72_A13928AlmPrdDsc[0], A13928AlmPrdDsc) == 0 ) )
         {
            brk9D72 = false ;
            A13927AlmPrdID = P09D72_A13927AlmPrdID[0] ;
            A396EmprCod = P09D72_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk9D72 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A13928AlmPrdDsc)==0) )
         {
            AV22Option = A13928AlmPrdDsc ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9D72 )
         {
            brk9D72 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = almprdwwgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = almprdwwgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = almprdwwgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV36FilterFullText = "" ;
      AV16TFAlmPrdDsc = "" ;
      AV17TFAlmPrdDsc_Sel = "" ;
      A13928AlmPrdDsc = "" ;
      AV41Almprdwwds_1_filterfulltext = "" ;
      AV44Almprdwwds_4_tfalmprddsc = "" ;
      AV45Almprdwwds_5_tfalmprddsc_sel = "" ;
      scmdbuf = "" ;
      lV41Almprdwwds_1_filterfulltext = "" ;
      lV44Almprdwwds_4_tfalmprddsc = "" ;
      P09D72_A13928AlmPrdDsc = new String[] {""} ;
      P09D72_A13927AlmPrdID = new short[1] ;
      P09D72_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almprdwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09D72_A13928AlmPrdDsc, P09D72_A13927AlmPrdID, P09D72_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV14TFAlmPrdID ;
   private short AV15TFAlmPrdID_To ;
   private short AV42Almprdwwds_2_tfalmprdid ;
   private short AV43Almprdwwds_3_tfalmprdid_to ;
   private short A13927AlmPrdID ;
   private short Gx_err ;
   private int AV39GXV1 ;
   private long AV30count ;
   private String AV16TFAlmPrdDsc ;
   private String AV17TFAlmPrdDsc_Sel ;
   private String A13928AlmPrdDsc ;
   private String AV44Almprdwwds_4_tfalmprddsc ;
   private String AV45Almprdwwds_5_tfalmprddsc_sel ;
   private String scmdbuf ;
   private String lV44Almprdwwds_4_tfalmprddsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk9D72 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV41Almprdwwds_1_filterfulltext ;
   private String lV41Almprdwwds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09D72_A13928AlmPrdDsc ;
   private short[] P09D72_A13927AlmPrdID ;
   private String[] P09D72_A396EmprCod ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class almprdwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09D72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Almprdwwds_1_filterfulltext ,
                                          short AV42Almprdwwds_2_tfalmprdid ,
                                          short AV43Almprdwwds_3_tfalmprdid_to ,
                                          String AV45Almprdwwds_5_tfalmprddsc_sel ,
                                          String AV44Almprdwwds_4_tfalmprddsc ,
                                          short A13927AlmPrdID ,
                                          String A13928AlmPrdDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT AlmPrdDsc, AlmPrdID, EmprCod FROM TXPALMPRD" ;
      if ( ! (GXutil.strcmp("", AV41Almprdwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlmPrdID,'9990'), 2) like '%' || ?) or ( UPPER(AlmPrdDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV42Almprdwwds_2_tfalmprdid) )
      {
         addWhere(sWhereString, "(AlmPrdID >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV43Almprdwwds_3_tfalmprdid_to) )
      {
         addWhere(sWhereString, "(AlmPrdID <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45Almprdwwds_5_tfalmprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV44Almprdwwds_4_tfalmprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlmPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45Almprdwwds_5_tfalmprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlmPrdDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlmPrdDsc" ;
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
                  return conditional_P09D72(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09D72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
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
                  stmt.setString(sIdx, (String)parms[10], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 10);
               }
               return;
      }
   }

}

