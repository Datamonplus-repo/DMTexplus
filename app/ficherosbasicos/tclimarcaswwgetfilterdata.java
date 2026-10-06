package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tclimarcaswwgetfilterdata extends GXProcedure
{
   public tclimarcaswwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclimarcaswwgetfilterdata.class ), "" );
   }

   public tclimarcaswwgetfilterdata( int remoteHandle ,
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
      tclimarcaswwgetfilterdata.this.aP5 = new String[] {""};
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
      tclimarcaswwgetfilterdata.this.AV30DDOName = aP0;
      tclimarcaswwgetfilterdata.this.AV31SearchTxt = aP1;
      tclimarcaswwgetfilterdata.this.AV32SearchTxtTo = aP2;
      tclimarcaswwgetfilterdata.this.aP3 = aP3;
      tclimarcaswwgetfilterdata.this.aP4 = aP4;
      tclimarcaswwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV30DDOName), "DDO_CLINOM") == 0 )
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
      AV33OptionsJson = AV20Options.toJSonString(false) ;
      AV34OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV23OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("FicherosBasicos.TCLIMARCASWWGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FicherosBasicos.TCLIMARCASWWGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("FicherosBasicos.TCLIMARCASWWGridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV14TFCliCod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFCliCod_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV16TFCliNom = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV17TFCliNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIACT_SEL") == 0 )
         {
            AV39TFCliAct_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINONOM_SEL") == 0 )
         {
            AV40TFCliNoNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFCliNom = AV31SearchTxt ;
      AV17TFCliNom_Sel = "" ;
      AV45Ficherosbasicos_tclimarcaswwds_1_tfclicod = AV14TFCliCod ;
      AV46Ficherosbasicos_tclimarcaswwds_2_tfclicod_to = AV15TFCliCod_To ;
      AV47Ficherosbasicos_tclimarcaswwds_3_tfclinom = AV16TFCliNom ;
      AV48Ficherosbasicos_tclimarcaswwds_4_tfclinom_sel = AV17TFCliNom_Sel ;
      AV49Ficherosbasicos_tclimarcaswwds_5_tfcliact_sel = AV39TFCliAct_Sel ;
      AV50Ficherosbasicos_tclimarcaswwds_6_tfclinonom_sel = AV40TFCliNoNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV45Ficherosbasicos_tclimarcaswwds_1_tfclicod) ,
                                           Integer.valueOf(AV46Ficherosbasicos_tclimarcaswwds_2_tfclicod_to) ,
                                           AV48Ficherosbasicos_tclimarcaswwds_4_tfclinom_sel ,
                                           AV47Ficherosbasicos_tclimarcaswwds_3_tfclinom ,
                                           AV49Ficherosbasicos_tclimarcaswwds_5_tfcliact_sel ,
                                           AV50Ficherosbasicos_tclimarcaswwds_6_tfclinonom_sel ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A10045CliAct } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV47Ficherosbasicos_tclimarcaswwds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV47Ficherosbasicos_tclimarcaswwds_3_tfclinom), 30, "%") ;
      /* Using cursor P0A1H2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV45Ficherosbasicos_tclimarcaswwds_1_tfclicod), Integer.valueOf(AV46Ficherosbasicos_tclimarcaswwds_2_tfclicod_to), lV47Ficherosbasicos_tclimarcaswwds_3_tfclinom, AV48Ficherosbasicos_tclimarcaswwds_4_tfclinom_sel, AV49Ficherosbasicos_tclimarcaswwds_5_tfcliact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkA1H2 = false ;
         A279CliNom = P0A1H2_A279CliNom[0] ;
         A10045CliAct = P0A1H2_A10045CliAct[0] ;
         A252CliCod = P0A1H2_A252CliCod[0] ;
         A396EmprCod = P0A1H2_A396EmprCod[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0A1H2_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brkA1H2 = false ;
            A252CliCod = P0A1H2_A252CliCod[0] ;
            A396EmprCod = P0A1H2_A396EmprCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brkA1H2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV19Option = A279CliNom ;
            AV20Options.add(AV19Option, 0);
            AV23OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV20Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA1H2 )
         {
            brkA1H2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = tclimarcaswwgetfilterdata.this.AV33OptionsJson;
      this.aP4[0] = tclimarcaswwgetfilterdata.this.AV34OptionsDescJson;
      this.aP5[0] = tclimarcaswwgetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33OptionsJson = "" ;
      AV34OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV20Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV23OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV16TFCliNom = "" ;
      AV17TFCliNom_Sel = "" ;
      AV39TFCliAct_Sel = "" ;
      AV40TFCliNoNom_Sel = "" ;
      A279CliNom = "" ;
      AV47Ficherosbasicos_tclimarcaswwds_3_tfclinom = "" ;
      AV48Ficherosbasicos_tclimarcaswwds_4_tfclinom_sel = "" ;
      AV49Ficherosbasicos_tclimarcaswwds_5_tfcliact_sel = "" ;
      AV50Ficherosbasicos_tclimarcaswwds_6_tfclinonom_sel = "" ;
      scmdbuf = "" ;
      lV47Ficherosbasicos_tclimarcaswwds_3_tfclinom = "" ;
      A10045CliAct = "" ;
      P0A1H2_A279CliNom = new String[] {""} ;
      P0A1H2_A10045CliAct = new String[] {""} ;
      P0A1H2_A252CliCod = new int[1] ;
      P0A1H2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV19Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tclimarcaswwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A1H2_A279CliNom, P0A1H2_A10045CliAct, P0A1H2_A252CliCod, P0A1H2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV43GXV1 ;
   private int AV14TFCliCod ;
   private int AV15TFCliCod_To ;
   private int AV45Ficherosbasicos_tclimarcaswwds_1_tfclicod ;
   private int AV46Ficherosbasicos_tclimarcaswwds_2_tfclicod_to ;
   private int A252CliCod ;
   private long AV24count ;
   private String AV16TFCliNom ;
   private String AV17TFCliNom_Sel ;
   private String AV39TFCliAct_Sel ;
   private String AV40TFCliNoNom_Sel ;
   private String A279CliNom ;
   private String AV47Ficherosbasicos_tclimarcaswwds_3_tfclinom ;
   private String AV48Ficherosbasicos_tclimarcaswwds_4_tfclinom_sel ;
   private String AV49Ficherosbasicos_tclimarcaswwds_5_tfcliact_sel ;
   private String AV50Ficherosbasicos_tclimarcaswwds_6_tfclinonom_sel ;
   private String scmdbuf ;
   private String lV47Ficherosbasicos_tclimarcaswwds_3_tfclinom ;
   private String A10045CliAct ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brkA1H2 ;
   private String AV33OptionsJson ;
   private String AV34OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV30DDOName ;
   private String AV31SearchTxt ;
   private String AV32SearchTxtTo ;
   private String AV19Option ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A1H2_A279CliNom ;
   private String[] P0A1H2_A10045CliAct ;
   private int[] P0A1H2_A252CliCod ;
   private String[] P0A1H2_A396EmprCod ;
   private GXSimpleCollection<String> AV20Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV23OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
}

final  class tclimarcaswwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A1H2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV45Ficherosbasicos_tclimarcaswwds_1_tfclicod ,
                                          int AV46Ficherosbasicos_tclimarcaswwds_2_tfclicod_to ,
                                          String AV48Ficherosbasicos_tclimarcaswwds_4_tfclinom_sel ,
                                          String AV47Ficherosbasicos_tclimarcaswwds_3_tfclinom ,
                                          String AV49Ficherosbasicos_tclimarcaswwds_5_tfcliact_sel ,
                                          String AV50Ficherosbasicos_tclimarcaswwds_6_tfclinonom_sel ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A10045CliAct )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[5];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT CliNom, CliAct, CliCod, EmprCod FROM TXPCLIENT" ;
      if ( ! (0==AV45Ficherosbasicos_tclimarcaswwds_1_tfclicod) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! (0==AV46Ficherosbasicos_tclimarcaswwds_2_tfclicod_to) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48Ficherosbasicos_tclimarcaswwds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV47Ficherosbasicos_tclimarcaswwds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48Ficherosbasicos_tclimarcaswwds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(CliNom = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49Ficherosbasicos_tclimarcaswwds_5_tfcliact_sel)==0) )
      {
         addWhere(sWhereString, "(CliAct = ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
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
                  return conditional_P0A1H2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A1H2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[5]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[6]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               return;
      }
   }

}

