package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ttipcauwwgetfilterdata extends GXProcedure
{
   public ttipcauwwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipcauwwgetfilterdata.class ), "" );
   }

   public ttipcauwwgetfilterdata( int remoteHandle ,
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
      ttipcauwwgetfilterdata.this.aP5 = new String[] {""};
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
      ttipcauwwgetfilterdata.this.AV18DDOName = aP0;
      ttipcauwwgetfilterdata.this.AV16SearchTxt = aP1;
      ttipcauwwgetfilterdata.this.AV17SearchTxtTo = aP2;
      ttipcauwwgetfilterdata.this.aP3 = aP3;
      ttipcauwwgetfilterdata.this.aP4 = aP4;
      ttipcauwwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_DSCCAUSA") == 0 )
      {
         /* Execute user subroutine: 'LOADDSCCAUSAOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV22OptionsJson = AV21Options.toJSonString(false) ;
      AV25OptionsDescJson = AV24OptionsDesc.toJSonString(false) ;
      AV27OptionIndexesJson = AV26OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV29Session.getValue("FicherosBasicos.TTIPCAUWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TTIPCAUWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("FicherosBasicos.TTIPCAUWWGridState"), null, null);
      }
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV53GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCODCAUSA") == 0 )
         {
            AV10TFCodCausa = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFCodCausa_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA") == 0 )
         {
            AV12TFDscCausa = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA_SEL") == 0 )
         {
            AV13TFDscCausa_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADDSCCAUSAOPTIONS' Routine */
      returnInSub = false ;
      AV12TFDscCausa = AV16SearchTxt ;
      AV13TFDscCausa_Sel = "" ;
      AV55Ficherosbasicos_ttipcauwwds_1_filterfulltext = AV48FilterFullText ;
      AV56Ficherosbasicos_ttipcauwwds_2_tfcodcausa = AV10TFCodCausa ;
      AV57Ficherosbasicos_ttipcauwwds_3_tfcodcausa_to = AV11TFCodCausa_To ;
      AV58Ficherosbasicos_ttipcauwwds_4_tfdsccausa = AV12TFDscCausa ;
      AV59Ficherosbasicos_ttipcauwwds_5_tfdsccausa_sel = AV13TFDscCausa_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV55Ficherosbasicos_ttipcauwwds_1_filterfulltext ,
                                           Short.valueOf(AV56Ficherosbasicos_ttipcauwwds_2_tfcodcausa) ,
                                           Short.valueOf(AV57Ficherosbasicos_ttipcauwwds_3_tfcodcausa_to) ,
                                           AV59Ficherosbasicos_ttipcauwwds_5_tfdsccausa_sel ,
                                           AV58Ficherosbasicos_ttipcauwwds_4_tfdsccausa ,
                                           Short.valueOf(A5085CodCausa) ,
                                           A5086DscCausa } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV55Ficherosbasicos_ttipcauwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Ficherosbasicos_ttipcauwwds_1_filterfulltext), "%", "") ;
      lV55Ficherosbasicos_ttipcauwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Ficherosbasicos_ttipcauwwds_1_filterfulltext), "%", "") ;
      lV58Ficherosbasicos_ttipcauwwds_4_tfdsccausa = GXutil.padr( GXutil.rtrim( AV58Ficherosbasicos_ttipcauwwds_4_tfdsccausa), 60, "%") ;
      /* Using cursor P081B2 */
      pr_default.execute(0, new Object[] {lV55Ficherosbasicos_ttipcauwwds_1_filterfulltext, lV55Ficherosbasicos_ttipcauwwds_1_filterfulltext, Short.valueOf(AV56Ficherosbasicos_ttipcauwwds_2_tfcodcausa), Short.valueOf(AV57Ficherosbasicos_ttipcauwwds_3_tfcodcausa_to), lV58Ficherosbasicos_ttipcauwwds_4_tfdsccausa, AV59Ficherosbasicos_ttipcauwwds_5_tfdsccausa_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk81B2 = false ;
         A5086DscCausa = P081B2_A5086DscCausa[0] ;
         n5086DscCausa = P081B2_n5086DscCausa[0] ;
         A5085CodCausa = P081B2_A5085CodCausa[0] ;
         A396EmprCod = P081B2_A396EmprCod[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P081B2_A5086DscCausa[0], A5086DscCausa) == 0 ) )
         {
            brk81B2 = false ;
            A5085CodCausa = P081B2_A5085CodCausa[0] ;
            A396EmprCod = P081B2_A396EmprCod[0] ;
            AV28count = (long)(AV28count+1) ;
            brk81B2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A5086DscCausa)==0) )
         {
            AV20Option = A5086DscCausa ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk81B2 )
         {
            brk81B2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = ttipcauwwgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = ttipcauwwgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = ttipcauwwgetfilterdata.this.AV27OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV22OptionsJson = "" ;
      AV25OptionsDescJson = "" ;
      AV27OptionIndexesJson = "" ;
      AV21Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29Session = httpContext.getWebSession();
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV12TFDscCausa = "" ;
      AV13TFDscCausa_Sel = "" ;
      A5086DscCausa = "" ;
      AV55Ficherosbasicos_ttipcauwwds_1_filterfulltext = "" ;
      AV58Ficherosbasicos_ttipcauwwds_4_tfdsccausa = "" ;
      AV59Ficherosbasicos_ttipcauwwds_5_tfdsccausa_sel = "" ;
      scmdbuf = "" ;
      lV55Ficherosbasicos_ttipcauwwds_1_filterfulltext = "" ;
      lV58Ficherosbasicos_ttipcauwwds_4_tfdsccausa = "" ;
      P081B2_A5086DscCausa = new String[] {""} ;
      P081B2_n5086DscCausa = new boolean[] {false} ;
      P081B2_A5085CodCausa = new short[1] ;
      P081B2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV20Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.ttipcauwwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P081B2_A5086DscCausa, P081B2_n5086DscCausa, P081B2_A5085CodCausa, P081B2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10TFCodCausa ;
   private short AV11TFCodCausa_To ;
   private short AV56Ficherosbasicos_ttipcauwwds_2_tfcodcausa ;
   private short AV57Ficherosbasicos_ttipcauwwds_3_tfcodcausa_to ;
   private short A5085CodCausa ;
   private short Gx_err ;
   private int AV53GXV1 ;
   private long AV28count ;
   private String AV12TFDscCausa ;
   private String AV13TFDscCausa_Sel ;
   private String A5086DscCausa ;
   private String AV58Ficherosbasicos_ttipcauwwds_4_tfdsccausa ;
   private String AV59Ficherosbasicos_ttipcauwwds_5_tfdsccausa_sel ;
   private String scmdbuf ;
   private String lV58Ficherosbasicos_ttipcauwwds_4_tfdsccausa ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk81B2 ;
   private boolean n5086DscCausa ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV48FilterFullText ;
   private String AV55Ficherosbasicos_ttipcauwwds_1_filterfulltext ;
   private String lV55Ficherosbasicos_ttipcauwwds_1_filterfulltext ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P081B2_A5086DscCausa ;
   private boolean[] P081B2_n5086DscCausa ;
   private short[] P081B2_A5085CodCausa ;
   private String[] P081B2_A396EmprCod ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class ttipcauwwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P081B2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Ficherosbasicos_ttipcauwwds_1_filterfulltext ,
                                          short AV56Ficherosbasicos_ttipcauwwds_2_tfcodcausa ,
                                          short AV57Ficherosbasicos_ttipcauwwds_3_tfcodcausa_to ,
                                          String AV59Ficherosbasicos_ttipcauwwds_5_tfdsccausa_sel ,
                                          String AV58Ficherosbasicos_ttipcauwwds_4_tfdsccausa ,
                                          short A5085CodCausa ,
                                          String A5086DscCausa )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[6];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT DscCausa, CodCausa, EmprCod FROM TXPTIPCAU" ;
      if ( ! (GXutil.strcmp("", AV55Ficherosbasicos_ttipcauwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(CodCausa,'9990'), 2) like '%' || ?) or ( UPPER(DscCausa) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV56Ficherosbasicos_ttipcauwwds_2_tfcodcausa) )
      {
         addWhere(sWhereString, "(CodCausa >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV57Ficherosbasicos_ttipcauwwds_3_tfcodcausa_to) )
      {
         addWhere(sWhereString, "(CodCausa <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59Ficherosbasicos_ttipcauwwds_5_tfdsccausa_sel)==0) && ( ! (GXutil.strcmp("", AV58Ficherosbasicos_ttipcauwwds_4_tfdsccausa)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(DscCausa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Ficherosbasicos_ttipcauwwds_5_tfdsccausa_sel)==0) )
      {
         addWhere(sWhereString, "(DscCausa = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY DscCausa" ;
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
                  return conditional_P081B2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P081B2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
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
                  stmt.setString(sIdx, (String)parms[10], 60);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 60);
               }
               return;
      }
   }

}

