package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tmtpomowwgetfilterdata extends GXProcedure
{
   public tmtpomowwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmtpomowwgetfilterdata.class ), "" );
   }

   public tmtpomowwgetfilterdata( int remoteHandle ,
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
      tmtpomowwgetfilterdata.this.aP5 = new String[] {""};
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
      tmtpomowwgetfilterdata.this.AV20DDOName = aP0;
      tmtpomowwgetfilterdata.this.AV18SearchTxt = aP1;
      tmtpomowwgetfilterdata.this.AV19SearchTxtTo = aP2;
      tmtpomowwgetfilterdata.this.aP3 = aP3;
      tmtpomowwgetfilterdata.this.aP4 = aP4;
      tmtpomowwgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_MTMOVNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADMTMOVNOMOPTIONS' */
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
      if ( GXutil.strcmp(AV31Session.getValue("TMTpoMoWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TMTpoMoWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("TMTpoMoWWGridState"), null, null);
      }
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV39GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMTMOVNOM") == 0 )
         {
            AV16TFMTMovNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMTMOVNOM_SEL") == 0 )
         {
            AV17TFMTMovNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMTMOVCOD") == 0 )
         {
            AV14TFMTMovCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFMTMovCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADMTMOVNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFMTMovNom = AV18SearchTxt ;
      AV17TFMTMovNom_Sel = "" ;
      AV41Tmtpomowwds_1_filterfulltext = AV36FilterFullText ;
      AV42Tmtpomowwds_2_tfmtmovnom = AV16TFMTMovNom ;
      AV43Tmtpomowwds_3_tfmtmovnom_sel = AV17TFMTMovNom_Sel ;
      AV44Tmtpomowwds_4_tfmtmovcod = AV14TFMTMovCod ;
      AV45Tmtpomowwds_5_tfmtmovcod_to = AV15TFMTMovCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV41Tmtpomowwds_1_filterfulltext ,
                                           AV43Tmtpomowwds_3_tfmtmovnom_sel ,
                                           AV42Tmtpomowwds_2_tfmtmovnom ,
                                           Integer.valueOf(AV44Tmtpomowwds_4_tfmtmovcod) ,
                                           Integer.valueOf(AV45Tmtpomowwds_5_tfmtmovcod_to) ,
                                           A9411MTMovNom ,
                                           Integer.valueOf(A9410MTMovCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT
                                           }
      });
      lV41Tmtpomowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Tmtpomowwds_1_filterfulltext), "%", "") ;
      lV41Tmtpomowwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV41Tmtpomowwds_1_filterfulltext), "%", "") ;
      lV42Tmtpomowwds_2_tfmtmovnom = GXutil.padr( GXutil.rtrim( AV42Tmtpomowwds_2_tfmtmovnom), 30, "%") ;
      /* Using cursor P08AE2 */
      pr_default.execute(0, new Object[] {lV41Tmtpomowwds_1_filterfulltext, lV41Tmtpomowwds_1_filterfulltext, lV42Tmtpomowwds_2_tfmtmovnom, AV43Tmtpomowwds_3_tfmtmovnom_sel, Integer.valueOf(AV44Tmtpomowwds_4_tfmtmovcod), Integer.valueOf(AV45Tmtpomowwds_5_tfmtmovcod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8AE2 = false ;
         A9411MTMovNom = P08AE2_A9411MTMovNom[0] ;
         n9411MTMovNom = P08AE2_n9411MTMovNom[0] ;
         A9410MTMovCod = P08AE2_A9410MTMovCod[0] ;
         A396EmprCod = P08AE2_A396EmprCod[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08AE2_A9411MTMovNom[0], A9411MTMovNom) == 0 ) )
         {
            brk8AE2 = false ;
            A9410MTMovCod = P08AE2_A9410MTMovCod[0] ;
            A396EmprCod = P08AE2_A396EmprCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8AE2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A9411MTMovNom)==0) )
         {
            AV22Option = A9411MTMovNom ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8AE2 )
         {
            brk8AE2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tmtpomowwgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = tmtpomowwgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = tmtpomowwgetfilterdata.this.AV29OptionIndexesJson;
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
      AV16TFMTMovNom = "" ;
      AV17TFMTMovNom_Sel = "" ;
      A9411MTMovNom = "" ;
      AV41Tmtpomowwds_1_filterfulltext = "" ;
      AV42Tmtpomowwds_2_tfmtmovnom = "" ;
      AV43Tmtpomowwds_3_tfmtmovnom_sel = "" ;
      scmdbuf = "" ;
      lV41Tmtpomowwds_1_filterfulltext = "" ;
      lV42Tmtpomowwds_2_tfmtmovnom = "" ;
      P08AE2_A9411MTMovNom = new String[] {""} ;
      P08AE2_n9411MTMovNom = new boolean[] {false} ;
      P08AE2_A9410MTMovCod = new int[1] ;
      P08AE2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmtpomowwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08AE2_A9411MTMovNom, P08AE2_n9411MTMovNom, P08AE2_A9410MTMovCod, P08AE2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV39GXV1 ;
   private int AV14TFMTMovCod ;
   private int AV15TFMTMovCod_To ;
   private int AV44Tmtpomowwds_4_tfmtmovcod ;
   private int AV45Tmtpomowwds_5_tfmtmovcod_to ;
   private int A9410MTMovCod ;
   private long AV30count ;
   private String AV16TFMTMovNom ;
   private String AV17TFMTMovNom_Sel ;
   private String A9411MTMovNom ;
   private String AV42Tmtpomowwds_2_tfmtmovnom ;
   private String AV43Tmtpomowwds_3_tfmtmovnom_sel ;
   private String scmdbuf ;
   private String lV42Tmtpomowwds_2_tfmtmovnom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8AE2 ;
   private boolean n9411MTMovNom ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV36FilterFullText ;
   private String AV41Tmtpomowwds_1_filterfulltext ;
   private String lV41Tmtpomowwds_1_filterfulltext ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08AE2_A9411MTMovNom ;
   private boolean[] P08AE2_n9411MTMovNom ;
   private int[] P08AE2_A9410MTMovCod ;
   private String[] P08AE2_A396EmprCod ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tmtpomowwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08AE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV41Tmtpomowwds_1_filterfulltext ,
                                          String AV43Tmtpomowwds_3_tfmtmovnom_sel ,
                                          String AV42Tmtpomowwds_2_tfmtmovnom ,
                                          int AV44Tmtpomowwds_4_tfmtmovcod ,
                                          int AV45Tmtpomowwds_5_tfmtmovcod_to ,
                                          String A9411MTMovNom ,
                                          int A9410MTMovCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT MTMovNom, MTMovCod, EmprCod FROM TXPMTPOMO" ;
      if ( ! (GXutil.strcmp("", AV41Tmtpomowwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(MTMovNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(MTMovCod,'99999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV43Tmtpomowwds_3_tfmtmovnom_sel)==0) && ( ! (GXutil.strcmp("", AV42Tmtpomowwds_2_tfmtmovnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MTMovNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV43Tmtpomowwds_3_tfmtmovnom_sel)==0) )
      {
         addWhere(sWhereString, "(MTMovNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV44Tmtpomowwds_4_tfmtmovcod) )
      {
         addWhere(sWhereString, "(MTMovCod >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV45Tmtpomowwds_5_tfmtmovcod_to) )
      {
         addWhere(sWhereString, "(MTMovCod <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MTMovNom" ;
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
                  return conditional_P08AE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08AE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(2);
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

