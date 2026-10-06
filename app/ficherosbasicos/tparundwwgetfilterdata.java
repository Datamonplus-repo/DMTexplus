package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tparundwwgetfilterdata extends GXProcedure
{
   public tparundwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tparundwwgetfilterdata.class ), "" );
   }

   public tparundwwgetfilterdata( int remoteHandle ,
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
      tparundwwgetfilterdata.this.aP5 = new String[] {""};
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
      tparundwwgetfilterdata.this.AV16DDOName = aP0;
      tparundwwgetfilterdata.this.AV14SearchTxt = aP1;
      tparundwwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tparundwwgetfilterdata.this.aP3 = aP3;
      tparundwwgetfilterdata.this.aP4 = aP4;
      tparundwwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_PARUNDDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADPARUNDDSCOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FicherosBasicos.TPARUNDWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TPARUNDWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FicherosBasicos.TPARUNDWWGridState"), null, null);
      }
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV51GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV46FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDID") == 0 )
         {
            AV10TFParUndID = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFParUndID_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC") == 0 )
         {
            AV12TFParUndDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARUNDDSC_SEL") == 0 )
         {
            AV13TFParUndDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADPARUNDDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFParUndDsc = AV14SearchTxt ;
      AV13TFParUndDsc_Sel = "" ;
      AV53Ficherosbasicos_tparundwwds_1_filterfulltext = AV46FilterFullText ;
      AV54Ficherosbasicos_tparundwwds_2_tfparundid = AV10TFParUndID ;
      AV55Ficherosbasicos_tparundwwds_3_tfparundid_to = AV11TFParUndID_To ;
      AV56Ficherosbasicos_tparundwwds_4_tfparunddsc = AV12TFParUndDsc ;
      AV57Ficherosbasicos_tparundwwds_5_tfparunddsc_sel = AV13TFParUndDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV53Ficherosbasicos_tparundwwds_1_filterfulltext ,
                                           Short.valueOf(AV54Ficherosbasicos_tparundwwds_2_tfparundid) ,
                                           Short.valueOf(AV55Ficherosbasicos_tparundwwds_3_tfparundid_to) ,
                                           AV57Ficherosbasicos_tparundwwds_5_tfparunddsc_sel ,
                                           AV56Ficherosbasicos_tparundwwds_4_tfparunddsc ,
                                           Short.valueOf(A13203ParUndID) ,
                                           A13204ParUndDsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV53Ficherosbasicos_tparundwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_tparundwwds_1_filterfulltext), "%", "") ;
      lV53Ficherosbasicos_tparundwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV53Ficherosbasicos_tparundwwds_1_filterfulltext), "%", "") ;
      lV56Ficherosbasicos_tparundwwds_4_tfparunddsc = GXutil.padr( GXutil.rtrim( AV56Ficherosbasicos_tparundwwds_4_tfparunddsc), 15, "%") ;
      /* Using cursor P080R2 */
      pr_default.execute(0, new Object[] {lV53Ficherosbasicos_tparundwwds_1_filterfulltext, lV53Ficherosbasicos_tparundwwds_1_filterfulltext, Short.valueOf(AV54Ficherosbasicos_tparundwwds_2_tfparundid), Short.valueOf(AV55Ficherosbasicos_tparundwwds_3_tfparundid_to), lV56Ficherosbasicos_tparundwwds_4_tfparunddsc, AV57Ficherosbasicos_tparundwwds_5_tfparunddsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk80R2 = false ;
         A13204ParUndDsc = P080R2_A13204ParUndDsc[0] ;
         n13204ParUndDsc = P080R2_n13204ParUndDsc[0] ;
         A13203ParUndID = P080R2_A13203ParUndID[0] ;
         A396EmprCod = P080R2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P080R2_A13204ParUndDsc[0], A13204ParUndDsc) == 0 ) )
         {
            brk80R2 = false ;
            A13203ParUndID = P080R2_A13203ParUndID[0] ;
            A396EmprCod = P080R2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk80R2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A13204ParUndDsc)==0) )
         {
            AV18Option = A13204ParUndDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk80R2 )
         {
            brk80R2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tparundwwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tparundwwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tparundwwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFParUndDsc = "" ;
      AV13TFParUndDsc_Sel = "" ;
      A13204ParUndDsc = "" ;
      AV53Ficherosbasicos_tparundwwds_1_filterfulltext = "" ;
      AV56Ficherosbasicos_tparundwwds_4_tfparunddsc = "" ;
      AV57Ficherosbasicos_tparundwwds_5_tfparunddsc_sel = "" ;
      scmdbuf = "" ;
      lV53Ficherosbasicos_tparundwwds_1_filterfulltext = "" ;
      lV56Ficherosbasicos_tparundwwds_4_tfparunddsc = "" ;
      P080R2_A13204ParUndDsc = new String[] {""} ;
      P080R2_n13204ParUndDsc = new boolean[] {false} ;
      P080R2_A13203ParUndID = new short[1] ;
      P080R2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tparundwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P080R2_A13204ParUndDsc, P080R2_n13204ParUndDsc, P080R2_A13203ParUndID, P080R2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFParUndID ;
   private short AV11TFParUndID_To ;
   private short AV54Ficherosbasicos_tparundwwds_2_tfparundid ;
   private short AV55Ficherosbasicos_tparundwwds_3_tfparundid_to ;
   private short A13203ParUndID ;
   private short Gx_err ;
   private int AV51GXV1 ;
   private long AV26count ;
   private String AV12TFParUndDsc ;
   private String AV13TFParUndDsc_Sel ;
   private String A13204ParUndDsc ;
   private String AV56Ficherosbasicos_tparundwwds_4_tfparunddsc ;
   private String AV57Ficherosbasicos_tparundwwds_5_tfparunddsc_sel ;
   private String scmdbuf ;
   private String lV56Ficherosbasicos_tparundwwds_4_tfparunddsc ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk80R2 ;
   private boolean n13204ParUndDsc ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV46FilterFullText ;
   private String AV53Ficherosbasicos_tparundwwds_1_filterfulltext ;
   private String lV53Ficherosbasicos_tparundwwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P080R2_A13204ParUndDsc ;
   private boolean[] P080R2_n13204ParUndDsc ;
   private short[] P080R2_A13203ParUndID ;
   private String[] P080R2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tparundwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P080R2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV53Ficherosbasicos_tparundwwds_1_filterfulltext ,
                                          short AV54Ficherosbasicos_tparundwwds_2_tfparundid ,
                                          short AV55Ficherosbasicos_tparundwwds_3_tfparundid_to ,
                                          String AV57Ficherosbasicos_tparundwwds_5_tfparunddsc_sel ,
                                          String AV56Ficherosbasicos_tparundwwds_4_tfparunddsc ,
                                          short A13203ParUndID ,
                                          String A13204ParUndDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT ParUndDsc, ParUndID, EmprCod FROM TXPPARUND" ;
      if ( ! (GXutil.strcmp("", AV53Ficherosbasicos_tparundwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(ParUndID,'9990'), 2) like '%' || ?) or ( UPPER(ParUndDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV54Ficherosbasicos_tparundwwds_2_tfparundid) )
      {
         addWhere(sWhereString, "(ParUndID >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV55Ficherosbasicos_tparundwwds_3_tfparundid_to) )
      {
         addWhere(sWhereString, "(ParUndID <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57Ficherosbasicos_tparundwwds_5_tfparunddsc_sel)==0) && ( ! (GXutil.strcmp("", AV56Ficherosbasicos_tparundwwds_4_tfparunddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ParUndDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57Ficherosbasicos_tparundwwds_5_tfparunddsc_sel)==0) )
      {
         addWhere(sWhereString, "(ParUndDsc = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY ParUndDsc" ;
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
                  return conditional_P080R2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P080R2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
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
                  stmt.setString(sIdx, (String)parms[10], 15);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 15);
               }
               return;
      }
   }

}

