package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttranspwwgetfilterdata extends GXProcedure
{
   public ttranspwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttranspwwgetfilterdata.class ), "" );
   }

   public ttranspwwgetfilterdata( int remoteHandle ,
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
      ttranspwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttranspwwgetfilterdata.this.AV38DDOName = aP0;
      ttranspwwgetfilterdata.this.AV36SearchTxt = aP1;
      ttranspwwgetfilterdata.this.AV37SearchTxtTo = aP2;
      ttranspwwgetfilterdata.this.aP3 = aP3;
      ttranspwwgetfilterdata.this.aP4 = aP4;
      ttranspwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV38DDOName), "DDO_TRNNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADTRNNOMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV42OptionsJson = AV41Options.toJSonString(false) ;
      AV45OptionsDescJson = AV44OptionsDesc.toJSonString(false) ;
      AV47OptionIndexesJson = AV46OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV49Session.getValue("FicherosBasicos.TTRANSPWWGridState"), "") == 0 )
      {
         AV51GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTRANSPWWGridState"), null, null);
      }
      else
      {
         AV51GridState.fromxml(AV49Session.getValue("FicherosBasicos.TTRANSPWWGridState"), null, null);
      }
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV52GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV51GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV71FilterFullText = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV10TFTrnCod = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFTrnCod_To = (short)(GXutil.lval( AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV12TFTrnNom = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV13TFTrnNom_Sel = AV52GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADTRNNOMOPTIONS' Routine */
      returnInSub = false ;
      AV12TFTrnNom = AV36SearchTxt ;
      AV13TFTrnNom_Sel = "" ;
      AV76Ficherosbasicos_ttranspwwds_1_filterfulltext = AV71FilterFullText ;
      AV77Ficherosbasicos_ttranspwwds_2_tftrncod = AV10TFTrnCod ;
      AV78Ficherosbasicos_ttranspwwds_3_tftrncod_to = AV11TFTrnCod_To ;
      AV79Ficherosbasicos_ttranspwwds_4_tftrnnom = AV12TFTrnNom ;
      AV80Ficherosbasicos_ttranspwwds_5_tftrnnom_sel = AV13TFTrnNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV76Ficherosbasicos_ttranspwwds_1_filterfulltext ,
                                           Short.valueOf(AV77Ficherosbasicos_ttranspwwds_2_tftrncod) ,
                                           Short.valueOf(AV78Ficherosbasicos_ttranspwwds_3_tftrncod_to) ,
                                           AV80Ficherosbasicos_ttranspwwds_5_tftrnnom_sel ,
                                           AV79Ficherosbasicos_ttranspwwds_4_tftrnnom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV76Ficherosbasicos_ttranspwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Ficherosbasicos_ttranspwwds_1_filterfulltext), "%", "") ;
      lV76Ficherosbasicos_ttranspwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV76Ficherosbasicos_ttranspwwds_1_filterfulltext), "%", "") ;
      lV79Ficherosbasicos_ttranspwwds_4_tftrnnom = GXutil.padr( GXutil.rtrim( AV79Ficherosbasicos_ttranspwwds_4_tftrnnom), 30, "%") ;
      /* Using cursor P08032 */
      pr_default.execute(0, new Object[] {lV76Ficherosbasicos_ttranspwwds_1_filterfulltext, lV76Ficherosbasicos_ttranspwwds_1_filterfulltext, Short.valueOf(AV77Ficherosbasicos_ttranspwwds_2_tftrncod), Short.valueOf(AV78Ficherosbasicos_ttranspwwds_3_tftrncod_to), lV79Ficherosbasicos_ttranspwwds_4_tftrnnom, AV80Ficherosbasicos_ttranspwwds_5_tftrnnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8032 = false ;
         A841TrnNom = P08032_A841TrnNom[0] ;
         n841TrnNom = P08032_n841TrnNom[0] ;
         A840TrnCod = P08032_A840TrnCod[0] ;
         A396EmprCod = P08032_A396EmprCod[0] ;
         AV48count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08032_A841TrnNom[0], A841TrnNom) == 0 ) )
         {
            brk8032 = false ;
            A840TrnCod = P08032_A840TrnCod[0] ;
            A396EmprCod = P08032_A396EmprCod[0] ;
            AV48count = (long)(AV48count+1) ;
            brk8032 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A841TrnNom)==0) )
         {
            AV40Option = A841TrnNom ;
            AV41Options.add(AV40Option, 0);
            AV46OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV48count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV41Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8032 )
         {
            brk8032 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttranspwwgetfilterdata.this.AV42OptionsJson;
      this.aP4[0] = ttranspwwgetfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = ttranspwwgetfilterdata.this.AV47OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV42OptionsJson = "" ;
      AV45OptionsDescJson = "" ;
      AV47OptionIndexesJson = "" ;
      AV41Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV46OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV49Session = httpContext.getWebSession();
      AV51GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV52GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV71FilterFullText = "" ;
      AV12TFTrnNom = "" ;
      AV13TFTrnNom_Sel = "" ;
      A841TrnNom = "" ;
      AV76Ficherosbasicos_ttranspwwds_1_filterfulltext = "" ;
      AV79Ficherosbasicos_ttranspwwds_4_tftrnnom = "" ;
      AV80Ficherosbasicos_ttranspwwds_5_tftrnnom_sel = "" ;
      scmdbuf = "" ;
      lV76Ficherosbasicos_ttranspwwds_1_filterfulltext = "" ;
      lV79Ficherosbasicos_ttranspwwds_4_tftrnnom = "" ;
      P08032_A841TrnNom = new String[] {""} ;
      P08032_n841TrnNom = new boolean[] {false} ;
      P08032_A840TrnCod = new short[1] ;
      P08032_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV40Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttranspwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08032_A841TrnNom, P08032_n841TrnNom, P08032_A840TrnCod, P08032_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFTrnCod ;
   private short AV11TFTrnCod_To ;
   private short AV77Ficherosbasicos_ttranspwwds_2_tftrncod ;
   private short AV78Ficherosbasicos_ttranspwwds_3_tftrncod_to ;
   private short A840TrnCod ;
   private short Gx_err ;
   private int AV74GXV1 ;
   private long AV48count ;
   private String AV12TFTrnNom ;
   private String AV13TFTrnNom_Sel ;
   private String A841TrnNom ;
   private String AV79Ficherosbasicos_ttranspwwds_4_tftrnnom ;
   private String AV80Ficherosbasicos_ttranspwwds_5_tftrnnom_sel ;
   private String scmdbuf ;
   private String lV79Ficherosbasicos_ttranspwwds_4_tftrnnom ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8032 ;
   private boolean n841TrnNom ;
   private String AV42OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV47OptionIndexesJson ;
   private String AV38DDOName ;
   private String AV36SearchTxt ;
   private String AV37SearchTxtTo ;
   private String AV71FilterFullText ;
   private String AV76Ficherosbasicos_ttranspwwds_1_filterfulltext ;
   private String lV76Ficherosbasicos_ttranspwwds_1_filterfulltext ;
   private String AV40Option ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08032_A841TrnNom ;
   private boolean[] P08032_n841TrnNom ;
   private short[] P08032_A840TrnCod ;
   private String[] P08032_A396EmprCod ;
   private GXSimpleCollection<String> AV41Options ;
   private GXSimpleCollection<String> AV44OptionsDesc ;
   private GXSimpleCollection<String> AV46OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV51GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV52GridStateFilterValue ;
}

final  class ttranspwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08032( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV76Ficherosbasicos_ttranspwwds_1_filterfulltext ,
                                          short AV77Ficherosbasicos_ttranspwwds_2_tftrncod ,
                                          short AV78Ficherosbasicos_ttranspwwds_3_tftrncod_to ,
                                          String AV80Ficherosbasicos_ttranspwwds_5_tftrnnom_sel ,
                                          String AV79Ficherosbasicos_ttranspwwds_4_tftrnnom ,
                                          short A840TrnCod ,
                                          String A841TrnNom )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT TrnNom, TrnCod, EmprCod FROM TXPTRANSP" ;
      if ( ! (GXutil.strcmp("", AV76Ficherosbasicos_ttranspwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(TrnCod,'9990'), 2) like '%' || ?) or ( UPPER(TrnNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV77Ficherosbasicos_ttranspwwds_2_tftrncod) )
      {
         addWhere(sWhereString, "(TrnCod >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV78Ficherosbasicos_ttranspwwds_3_tftrncod_to) )
      {
         addWhere(sWhereString, "(TrnCod <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Ficherosbasicos_ttranspwwds_5_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Ficherosbasicos_ttranspwwds_4_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Ficherosbasicos_ttranspwwds_5_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(TrnNom = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY TrnNom" ;
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
                  return conditional_P08032(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08032", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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

