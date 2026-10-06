package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tsecciowwgetfilterdata extends GXProcedure
{
   public tsecciowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tsecciowwgetfilterdata.class ), "" );
   }

   public tsecciowwgetfilterdata( int remoteHandle ,
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
      tsecciowwgetfilterdata.this.aP5 = new String[] {""};
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
      tsecciowwgetfilterdata.this.AV16DDOName = aP0;
      tsecciowwgetfilterdata.this.AV14SearchTxt = aP1;
      tsecciowwgetfilterdata.this.AV15SearchTxtTo = aP2;
      tsecciowwgetfilterdata.this.aP3 = aP3;
      tsecciowwgetfilterdata.this.aP4 = aP4;
      tsecciowwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_SECNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADSECNOMOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("FicherosBasicos.TSECCIOWWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TSECCIOWWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("FicherosBasicos.TSECCIOWWGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV43FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSECCOD") == 0 )
         {
            AV10TFSecCod = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFSecCod_To = (byte)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSECNOM") == 0 )
         {
            AV12TFSecNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSECNOM_SEL") == 0 )
         {
            AV13TFSecNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADSECNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFSecNom = AV14SearchTxt ;
      AV13TFSecNom_Sel = "" ;
      AV48Ficherosbasicos_tsecciowwds_1_filterfulltext = AV43FilterFullText ;
      AV49Ficherosbasicos_tsecciowwds_2_tfseccod = AV10TFSecCod ;
      AV50Ficherosbasicos_tsecciowwds_3_tfseccod_to = AV11TFSecCod_To ;
      AV51Ficherosbasicos_tsecciowwds_4_tfsecnom = AV12TFSecNom ;
      AV52Ficherosbasicos_tsecciowwds_5_tfsecnom_sel = AV13TFSecNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Ficherosbasicos_tsecciowwds_1_filterfulltext ,
                                           Byte.valueOf(AV49Ficherosbasicos_tsecciowwds_2_tfseccod) ,
                                           Byte.valueOf(AV50Ficherosbasicos_tsecciowwds_3_tfseccod_to) ,
                                           AV52Ficherosbasicos_tsecciowwds_5_tfsecnom_sel ,
                                           AV51Ficherosbasicos_tsecciowwds_4_tfsecnom ,
                                           Byte.valueOf(A3083SecCod) ,
                                           A3084SecNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV48Ficherosbasicos_tsecciowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Ficherosbasicos_tsecciowwds_1_filterfulltext), "%", "") ;
      lV48Ficherosbasicos_tsecciowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Ficherosbasicos_tsecciowwds_1_filterfulltext), "%", "") ;
      lV51Ficherosbasicos_tsecciowwds_4_tfsecnom = GXutil.padr( GXutil.rtrim( AV51Ficherosbasicos_tsecciowwds_4_tfsecnom), 34, "%") ;
      /* Using cursor P08T52 */
      pr_default.execute(0, new Object[] {lV48Ficherosbasicos_tsecciowwds_1_filterfulltext, lV48Ficherosbasicos_tsecciowwds_1_filterfulltext, Byte.valueOf(AV49Ficherosbasicos_tsecciowwds_2_tfseccod), Byte.valueOf(AV50Ficherosbasicos_tsecciowwds_3_tfseccod_to), lV51Ficherosbasicos_tsecciowwds_4_tfsecnom, AV52Ficherosbasicos_tsecciowwds_5_tfsecnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8T52 = false ;
         A3084SecNom = P08T52_A3084SecNom[0] ;
         n3084SecNom = P08T52_n3084SecNom[0] ;
         A3083SecCod = P08T52_A3083SecCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08T52_A3084SecNom[0], A3084SecNom) == 0 ) )
         {
            brk8T52 = false ;
            A3083SecCod = P08T52_A3083SecCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8T52 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A3084SecNom)==0) )
         {
            AV18Option = A3084SecNom ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8T52 )
         {
            brk8T52 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tsecciowwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = tsecciowwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = tsecciowwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV43FilterFullText = "" ;
      AV12TFSecNom = "" ;
      AV13TFSecNom_Sel = "" ;
      A3084SecNom = "" ;
      AV48Ficherosbasicos_tsecciowwds_1_filterfulltext = "" ;
      AV51Ficherosbasicos_tsecciowwds_4_tfsecnom = "" ;
      AV52Ficherosbasicos_tsecciowwds_5_tfsecnom_sel = "" ;
      scmdbuf = "" ;
      lV48Ficherosbasicos_tsecciowwds_1_filterfulltext = "" ;
      lV51Ficherosbasicos_tsecciowwds_4_tfsecnom = "" ;
      P08T52_A3084SecNom = new String[] {""} ;
      P08T52_n3084SecNom = new boolean[] {false} ;
      P08T52_A3083SecCod = new byte[1] ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tsecciowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08T52_A3084SecNom, P08T52_n3084SecNom, P08T52_A3083SecCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10TFSecCod ;
   private byte AV11TFSecCod_To ;
   private byte AV49Ficherosbasicos_tsecciowwds_2_tfseccod ;
   private byte AV50Ficherosbasicos_tsecciowwds_3_tfseccod_to ;
   private byte A3083SecCod ;
   private short Gx_err ;
   private int AV46GXV1 ;
   private long AV26count ;
   private String AV12TFSecNom ;
   private String AV13TFSecNom_Sel ;
   private String A3084SecNom ;
   private String AV51Ficherosbasicos_tsecciowwds_4_tfsecnom ;
   private String AV52Ficherosbasicos_tsecciowwds_5_tfsecnom_sel ;
   private String scmdbuf ;
   private String lV51Ficherosbasicos_tsecciowwds_4_tfsecnom ;
   private boolean returnInSub ;
   private boolean brk8T52 ;
   private boolean n3084SecNom ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV43FilterFullText ;
   private String AV48Ficherosbasicos_tsecciowwds_1_filterfulltext ;
   private String lV48Ficherosbasicos_tsecciowwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08T52_A3084SecNom ;
   private boolean[] P08T52_n3084SecNom ;
   private byte[] P08T52_A3083SecCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class tsecciowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08T52( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Ficherosbasicos_tsecciowwds_1_filterfulltext ,
                                          byte AV49Ficherosbasicos_tsecciowwds_2_tfseccod ,
                                          byte AV50Ficherosbasicos_tsecciowwds_3_tfseccod_to ,
                                          String AV52Ficherosbasicos_tsecciowwds_5_tfsecnom_sel ,
                                          String AV51Ficherosbasicos_tsecciowwds_4_tfsecnom ,
                                          byte A3083SecCod ,
                                          String A3084SecNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT SecNom, SecCod FROM TXPSECCIO" ;
      if ( ! (GXutil.strcmp("", AV48Ficherosbasicos_tsecciowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(SecCod,'90'), 2) like '%' || ?) or ( UPPER(SecNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV49Ficherosbasicos_tsecciowwds_2_tfseccod) )
      {
         addWhere(sWhereString, "(SecCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV50Ficherosbasicos_tsecciowwds_3_tfseccod_to) )
      {
         addWhere(sWhereString, "(SecCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Ficherosbasicos_tsecciowwds_5_tfsecnom_sel)==0) && ( ! (GXutil.strcmp("", AV51Ficherosbasicos_tsecciowwds_4_tfsecnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SecNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Ficherosbasicos_tsecciowwds_5_tfsecnom_sel)==0) )
      {
         addWhere(sWhereString, "(SecNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY SecNom" ;
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
                  return conditional_P08T52(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08T52", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 34);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
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
                  stmt.setByte(sIdx, ((Number) parms[8]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 34);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 34);
               }
               return;
      }
   }

}

