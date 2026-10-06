package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class producpromptgetfilterdata extends GXProcedure
{
   public producpromptgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( producpromptgetfilterdata.class ), "" );
   }

   public producpromptgetfilterdata( int remoteHandle ,
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
      producpromptgetfilterdata.this.aP5 = new String[] {""};
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
      producpromptgetfilterdata.this.AV26DDOName = aP0;
      producpromptgetfilterdata.this.AV27SearchTxt = aP1;
      producpromptgetfilterdata.this.AV28SearchTxtTo = aP2;
      producpromptgetfilterdata.this.aP3 = aP3;
      producpromptgetfilterdata.this.aP4 = aP4;
      producpromptgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_VALDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADVALDSCOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV29OptionsJson = AV16Options.toJSonString(false) ;
      AV30OptionsDescJson = AV18OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV19OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("StocksQuimicos.PRODUCPromptGridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.PRODUCPromptGridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("StocksQuimicos.PRODUCPromptGridState"), null, null);
      }
      AV37GXV1 = 1 ;
      while ( AV37GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV37GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV12TFValDsc = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV13TFValDsc_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV37GXV1 = (int)(AV37GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADVALDSCOPTIONS' Routine */
      returnInSub = false ;
      AV12TFValDsc = AV27SearchTxt ;
      AV13TFValDsc_Sel = "" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV32FilterFullText ,
                                           AV13TFValDsc_Sel ,
                                           AV12TFValDsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Byte.valueOf(A856ValCod) ,
                                           A857ValDsc ,
                                           Byte.valueOf(AV34ValCod_sel) ,
                                           AV33InOutEmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV32FilterFullText = GXutil.concat( GXutil.rtrim( AV32FilterFullText), "%", "") ;
      lV12TFValDsc = GXutil.padr( GXutil.rtrim( AV12TFValDsc), 16, "%") ;
      /* Using cursor P0AH32 */
      pr_default.execute(0, new Object[] {AV33InOutEmprCod, Byte.valueOf(AV34ValCod_sel), Byte.valueOf(AV34ValCod_sel), lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV32FilterFullText, lV12TFValDsc, AV13TFValDsc_Sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkAH32 = false ;
         A856ValCod = P0AH32_A856ValCod[0] ;
         A396EmprCod = P0AH32_A396EmprCod[0] ;
         A857ValDsc = P0AH32_A857ValDsc[0] ;
         n857ValDsc = P0AH32_n857ValDsc[0] ;
         A718PrdNom = P0AH32_A718PrdNom[0] ;
         A719PrdNum = P0AH32_A719PrdNum[0] ;
         A857ValDsc = P0AH32_A857ValDsc[0] ;
         n857ValDsc = P0AH32_n857ValDsc[0] ;
         AV20count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0AH32_A396EmprCod[0], A396EmprCod) == 0 ) && ( P0AH32_A856ValCod[0] == A856ValCod ) )
         {
            brkAH32 = false ;
            A719PrdNum = P0AH32_A719PrdNum[0] ;
            AV20count = (long)(AV20count+1) ;
            brkAH32 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A857ValDsc)==0) )
         {
            AV15Option = A857ValDsc ;
            AV14InsertIndex = 1 ;
            while ( ( AV14InsertIndex <= AV16Options.size() ) && ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) < 0 ) )
            {
               AV14InsertIndex = (int)(AV14InsertIndex+1) ;
            }
            AV16Options.add(AV15Option, AV14InsertIndex);
            AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), AV14InsertIndex);
         }
         if ( AV16Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkAH32 )
         {
            brkAH32 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = producpromptgetfilterdata.this.AV29OptionsJson;
      this.aP4[0] = producpromptgetfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = producpromptgetfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29OptionsJson = "" ;
      AV30OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV32FilterFullText = "" ;
      AV12TFValDsc = "" ;
      AV13TFValDsc_Sel = "" ;
      scmdbuf = "" ;
      lV32FilterFullText = "" ;
      lV12TFValDsc = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A857ValDsc = "" ;
      AV33InOutEmprCod = "" ;
      A396EmprCod = "" ;
      P0AH32_A856ValCod = new byte[1] ;
      P0AH32_A396EmprCod = new String[] {""} ;
      P0AH32_A857ValDsc = new String[] {""} ;
      P0AH32_n857ValDsc = new boolean[] {false} ;
      P0AH32_A718PrdNom = new String[] {""} ;
      P0AH32_A719PrdNum = new String[] {""} ;
      AV15Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.producpromptgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AH32_A856ValCod, P0AH32_A396EmprCod, P0AH32_A857ValDsc, P0AH32_n857ValDsc, P0AH32_A718PrdNom, P0AH32_A719PrdNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private byte AV34ValCod_sel ;
   private short Gx_err ;
   private int AV37GXV1 ;
   private int AV14InsertIndex ;
   private long AV20count ;
   private String AV12TFValDsc ;
   private String AV13TFValDsc_Sel ;
   private String scmdbuf ;
   private String lV12TFValDsc ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A857ValDsc ;
   private String AV33InOutEmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkAH32 ;
   private boolean n857ValDsc ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV32FilterFullText ;
   private String lV32FilterFullText ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0AH32_A856ValCod ;
   private String[] P0AH32_A396EmprCod ;
   private String[] P0AH32_A857ValDsc ;
   private boolean[] P0AH32_n857ValDsc ;
   private String[] P0AH32_A718PrdNom ;
   private String[] P0AH32_A719PrdNum ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class producpromptgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AH32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV32FilterFullText ,
                                          String AV13TFValDsc_Sel ,
                                          String AV12TFValDsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          byte A856ValCod ,
                                          String A857ValDsc ,
                                          byte AV34ValCod_sel ,
                                          String AV33InOutEmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[9];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.EmprCod, T2.ValDsc, T1.PrdNom, T1.PrdNum FROM (TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod AND T2.ValCod = T1.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.ValCod = ? or ? = 0)");
      if ( ! (GXutil.strcmp("", AV32FilterFullText)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T1.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ValCod,'90'), 2) like '%' || ?) or ( UPPER(T2.ValDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV13TFValDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV12TFValDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13TFValDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ValCod" ;
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
                  return conditional_P0AH32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AH32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               return;
      }
   }

}

