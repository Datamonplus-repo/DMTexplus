package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttabla4wwgetfilterdata extends GXProcedure
{
   public ttabla4wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttabla4wwgetfilterdata.class ), "" );
   }

   public ttabla4wwgetfilterdata( int remoteHandle ,
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
      ttabla4wwgetfilterdata.this.aP5 = new String[] {""};
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
      ttabla4wwgetfilterdata.this.AV16DDOName = aP0;
      ttabla4wwgetfilterdata.this.AV14SearchTxt = aP1;
      ttabla4wwgetfilterdata.this.AV15SearchTxtTo = aP2;
      ttabla4wwgetfilterdata.this.aP3 = aP3;
      ttabla4wwgetfilterdata.this.aP4 = aP4;
      ttabla4wwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
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
      if ( GXutil.strcmp(AV27Session.getValue("TTABLA4WWGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTABLA4WWGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("TTABLA4WWGridState"), null, null);
      }
      AV46GXV1 = 1 ;
      while ( AV46GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV46GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV43FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV12TFCliNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV13TFCliNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV10TFCliCod = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCliCod_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV46GXV1 = (int)(AV46GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFCliNom = AV14SearchTxt ;
      AV13TFCliNom_Sel = "" ;
      AV48Ttabla4wwds_1_filterfulltext = AV43FilterFullText ;
      AV49Ttabla4wwds_2_tfclinom = AV12TFCliNom ;
      AV50Ttabla4wwds_3_tfclinom_sel = AV13TFCliNom_Sel ;
      AV51Ttabla4wwds_4_tfclicod = AV10TFCliCod ;
      AV52Ttabla4wwds_5_tfclicod_to = AV11TFCliCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV48Ttabla4wwds_1_filterfulltext ,
                                           AV50Ttabla4wwds_3_tfclinom_sel ,
                                           AV49Ttabla4wwds_2_tfclinom ,
                                           Integer.valueOf(AV51Ttabla4wwds_4_tfclicod) ,
                                           Integer.valueOf(AV52Ttabla4wwds_5_tfclicod_to) ,
                                           A279CliNom ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV48Ttabla4wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Ttabla4wwds_1_filterfulltext), "%", "") ;
      lV48Ttabla4wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Ttabla4wwds_1_filterfulltext), "%", "") ;
      lV49Ttabla4wwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV49Ttabla4wwds_2_tfclinom), 30, "%") ;
      /* Using cursor P07XR2 */
      pr_default.execute(0, new Object[] {lV48Ttabla4wwds_1_filterfulltext, lV48Ttabla4wwds_1_filterfulltext, lV49Ttabla4wwds_2_tfclinom, AV50Ttabla4wwds_3_tfclinom_sel, Integer.valueOf(AV51Ttabla4wwds_4_tfclicod), Integer.valueOf(AV52Ttabla4wwds_5_tfclicod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk7XR2 = false ;
         A279CliNom = P07XR2_A279CliNom[0] ;
         A252CliCod = P07XR2_A252CliCod[0] ;
         A396EmprCod = P07XR2_A396EmprCod[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P07XR2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brk7XR2 = false ;
            A252CliCod = P07XR2_A252CliCod[0] ;
            A396EmprCod = P07XR2_A396EmprCod[0] ;
            AV26count = (long)(AV26count+1) ;
            brk7XR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV18Option = A279CliNom ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk7XR2 )
         {
            brk7XR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttabla4wwgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = ttabla4wwgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = ttabla4wwgetfilterdata.this.AV25OptionIndexesJson;
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
      AV12TFCliNom = "" ;
      AV13TFCliNom_Sel = "" ;
      A279CliNom = "" ;
      AV48Ttabla4wwds_1_filterfulltext = "" ;
      AV49Ttabla4wwds_2_tfclinom = "" ;
      AV50Ttabla4wwds_3_tfclinom_sel = "" ;
      scmdbuf = "" ;
      lV48Ttabla4wwds_1_filterfulltext = "" ;
      lV49Ttabla4wwds_2_tfclinom = "" ;
      P07XR2_A279CliNom = new String[] {""} ;
      P07XR2_A252CliCod = new int[1] ;
      P07XR2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttabla4wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P07XR2_A279CliNom, P07XR2_A252CliCod, P07XR2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV46GXV1 ;
   private int AV10TFCliCod ;
   private int AV11TFCliCod_To ;
   private int AV51Ttabla4wwds_4_tfclicod ;
   private int AV52Ttabla4wwds_5_tfclicod_to ;
   private int A252CliCod ;
   private long AV26count ;
   private String AV12TFCliNom ;
   private String AV13TFCliNom_Sel ;
   private String A279CliNom ;
   private String AV49Ttabla4wwds_2_tfclinom ;
   private String AV50Ttabla4wwds_3_tfclinom_sel ;
   private String scmdbuf ;
   private String lV49Ttabla4wwds_2_tfclinom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk7XR2 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV43FilterFullText ;
   private String AV48Ttabla4wwds_1_filterfulltext ;
   private String lV48Ttabla4wwds_1_filterfulltext ;
   private String AV18Option ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P07XR2_A279CliNom ;
   private int[] P07XR2_A252CliCod ;
   private String[] P07XR2_A396EmprCod ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class ttabla4wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P07XR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Ttabla4wwds_1_filterfulltext ,
                                          String AV50Ttabla4wwds_3_tfclinom_sel ,
                                          String AV49Ttabla4wwds_2_tfclinom ,
                                          int AV51Ttabla4wwds_4_tfclicod ,
                                          int AV52Ttabla4wwds_5_tfclicod_to ,
                                          String A279CliNom ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CliNom, CliCod, EmprCod FROM TXPCLIENT" ;
      if ( ! (GXutil.strcmp("", AV48Ttabla4wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCod,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50Ttabla4wwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV49Ttabla4wwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50Ttabla4wwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(CliNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV51Ttabla4wwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV52Ttabla4wwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CliNom" ;
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
                  return conditional_P07XR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P07XR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               return;
      }
   }

}

