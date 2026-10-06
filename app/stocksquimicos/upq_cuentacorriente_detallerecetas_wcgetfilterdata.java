package app.stocksquimicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class upq_cuentacorriente_detallerecetas_wcgetfilterdata extends GXProcedure
{
   public upq_cuentacorriente_detallerecetas_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( upq_cuentacorriente_detallerecetas_wcgetfilterdata.class ), "" );
   }

   public upq_cuentacorriente_detallerecetas_wcgetfilterdata( int remoteHandle ,
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
      upq_cuentacorriente_detallerecetas_wcgetfilterdata.this.aP5 = new String[] {""};
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
      upq_cuentacorriente_detallerecetas_wcgetfilterdata.this.AV18DDOName = aP0;
      upq_cuentacorriente_detallerecetas_wcgetfilterdata.this.AV16SearchTxt = aP1;
      upq_cuentacorriente_detallerecetas_wcgetfilterdata.this.AV17SearchTxtTo = aP2;
      upq_cuentacorriente_detallerecetas_wcgetfilterdata.this.aP3 = aP3;
      upq_cuentacorriente_detallerecetas_wcgetfilterdata.this.aP4 = aP4;
      upq_cuentacorriente_detallerecetas_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(GXutil.upper( AV18DDOName), "DDO_HREPRDUDS") == 0 )
      {
         /* Execute user subroutine: 'LOADHREPRDUDSOPTIONS' */
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
      if ( GXutil.strcmp(AV29Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_DetalleRecetas_WCGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.UPQ_CuentaCorriente_DetalleRecetas_WCGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV29Session.getValue("StocksQuimicos.UPQ_CuentaCorriente_DetalleRecetas_WCGridState"), null, null);
      }
      AV43GXV1 = 1 ;
      while ( AV43GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV43GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS") == 0 )
         {
            AV14TFHrePrdUDs = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREPRDUDS_SEL") == 0 )
         {
            AV15TFHrePrdUDs_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV35Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARCOD") == 0 )
         {
            AV36HreBarCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARREO") == 0 )
         {
            AV37HreBarReo = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREBARPAR") == 0 )
         {
            AV38HreBarPar = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HREPRDNUM") == 0 )
         {
            AV39HrePrdnum = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV43GXV1 = (int)(AV43GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADHREPRDUDSOPTIONS' Routine */
      returnInSub = false ;
      AV14TFHrePrdUDs = AV16SearchTxt ;
      AV15TFHrePrdUDs_Sel = "" ;
      AV45Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_1_tfhreprduds = AV14TFHrePrdUDs ;
      AV46Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_2_tfhreprduds_sel = AV15TFHrePrdUDs_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV46Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_2_tfhreprduds_sel ,
                                           AV45Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_1_tfhreprduds ,
                                           A4561HrePrdUDs ,
                                           A396EmprCod ,
                                           AV35Emprcod ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Integer.valueOf(AV36HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           Byte.valueOf(AV37HreBarReo) ,
                                           A4494HreBarPar ,
                                           AV38HreBarPar ,
                                           A719PrdNum ,
                                           AV39HrePrdnum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV45Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_1_tfhreprduds = GXutil.padr( GXutil.rtrim( AV45Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_1_tfhreprduds), 5, "%") ;
      /* Using cursor P09HR2 */
      pr_default.execute(0, new Object[] {AV35Emprcod, Integer.valueOf(AV36HreBarCod), Byte.valueOf(AV37HreBarReo), AV38HreBarPar, AV39HrePrdnum, lV45Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_1_tfhreprduds, AV46Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_2_tfhreprduds_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9HR2 = false ;
         A396EmprCod = P09HR2_A396EmprCod[0] ;
         A4492HreBarCod = P09HR2_A4492HreBarCod[0] ;
         A4493HreBarReo = P09HR2_A4493HreBarReo[0] ;
         A4494HreBarPar = P09HR2_A4494HreBarPar[0] ;
         A719PrdNum = P09HR2_A719PrdNum[0] ;
         n719PrdNum = P09HR2_n719PrdNum[0] ;
         A4561HrePrdUDs = P09HR2_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = P09HR2_n4561HrePrdUDs[0] ;
         A4495HreNumCie = P09HR2_A4495HreNumCie[0] ;
         A4545HreLinMaq = P09HR2_A4545HreLinMaq[0] ;
         A4550HreLinPro = P09HR2_A4550HreLinPro[0] ;
         A4557HreRecLin = P09HR2_A4557HreRecLin[0] ;
         AV28count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09HR2_A4561HrePrdUDs[0], A4561HrePrdUDs) == 0 ) )
         {
            brk9HR2 = false ;
            A396EmprCod = P09HR2_A396EmprCod[0] ;
            A4492HreBarCod = P09HR2_A4492HreBarCod[0] ;
            A4493HreBarReo = P09HR2_A4493HreBarReo[0] ;
            A4494HreBarPar = P09HR2_A4494HreBarPar[0] ;
            A4495HreNumCie = P09HR2_A4495HreNumCie[0] ;
            A4545HreLinMaq = P09HR2_A4545HreLinMaq[0] ;
            A4550HreLinPro = P09HR2_A4550HreLinPro[0] ;
            A4557HreRecLin = P09HR2_A4557HreRecLin[0] ;
            AV28count = (long)(AV28count+1) ;
            brk9HR2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4561HrePrdUDs)==0) )
         {
            AV20Option = A4561HrePrdUDs ;
            AV21Options.add(AV20Option, 0);
            AV26OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV28count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV21Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9HR2 )
         {
            brk9HR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   protected void cleanup( )
   {
      this.aP3[0] = upq_cuentacorriente_detallerecetas_wcgetfilterdata.this.AV22OptionsJson;
      this.aP4[0] = upq_cuentacorriente_detallerecetas_wcgetfilterdata.this.AV25OptionsDescJson;
      this.aP5[0] = upq_cuentacorriente_detallerecetas_wcgetfilterdata.this.AV27OptionIndexesJson;
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
      AV14TFHrePrdUDs = "" ;
      AV15TFHrePrdUDs_Sel = "" ;
      AV35Emprcod = "" ;
      AV38HreBarPar = "" ;
      AV39HrePrdnum = "" ;
      A4561HrePrdUDs = "" ;
      AV45Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_1_tfhreprduds = "" ;
      AV46Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_2_tfhreprduds_sel = "" ;
      scmdbuf = "" ;
      lV45Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_1_tfhreprduds = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      A719PrdNum = "" ;
      P09HR2_A396EmprCod = new String[] {""} ;
      P09HR2_A4492HreBarCod = new int[1] ;
      P09HR2_A4493HreBarReo = new byte[1] ;
      P09HR2_A4494HreBarPar = new String[] {""} ;
      P09HR2_A719PrdNum = new String[] {""} ;
      P09HR2_n719PrdNum = new boolean[] {false} ;
      P09HR2_A4561HrePrdUDs = new String[] {""} ;
      P09HR2_n4561HrePrdUDs = new boolean[] {false} ;
      P09HR2_A4495HreNumCie = new byte[1] ;
      P09HR2_A4545HreLinMaq = new short[1] ;
      P09HR2_A4550HreLinPro = new byte[1] ;
      P09HR2_A4557HreRecLin = new short[1] ;
      AV20Option = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.upq_cuentacorriente_detallerecetas_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09HR2_A396EmprCod, P09HR2_A4492HreBarCod, P09HR2_A4493HreBarReo, P09HR2_A4494HreBarPar, P09HR2_A719PrdNum, P09HR2_n719PrdNum, P09HR2_A4561HrePrdUDs, P09HR2_n4561HrePrdUDs, P09HR2_A4495HreNumCie, P09HR2_A4545HreLinMaq,
            P09HR2_A4550HreLinPro, P09HR2_A4557HreRecLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV37HreBarReo ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short A4545HreLinMaq ;
   private short A4557HreRecLin ;
   private short Gx_err ;
   private int AV43GXV1 ;
   private int AV36HreBarCod ;
   private int A4492HreBarCod ;
   private long AV28count ;
   private String AV14TFHrePrdUDs ;
   private String AV15TFHrePrdUDs_Sel ;
   private String AV35Emprcod ;
   private String AV38HreBarPar ;
   private String AV39HrePrdnum ;
   private String A4561HrePrdUDs ;
   private String AV45Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_1_tfhreprduds ;
   private String AV46Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_2_tfhreprduds_sel ;
   private String scmdbuf ;
   private String lV45Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_1_tfhreprduds ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String A719PrdNum ;
   private boolean returnInSub ;
   private boolean brk9HR2 ;
   private boolean n719PrdNum ;
   private boolean n4561HrePrdUDs ;
   private String AV22OptionsJson ;
   private String AV25OptionsDescJson ;
   private String AV27OptionIndexesJson ;
   private String AV18DDOName ;
   private String AV16SearchTxt ;
   private String AV17SearchTxtTo ;
   private String AV20Option ;
   private com.genexus.webpanels.WebSession AV29Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09HR2_A396EmprCod ;
   private int[] P09HR2_A4492HreBarCod ;
   private byte[] P09HR2_A4493HreBarReo ;
   private String[] P09HR2_A4494HreBarPar ;
   private String[] P09HR2_A719PrdNum ;
   private boolean[] P09HR2_n719PrdNum ;
   private String[] P09HR2_A4561HrePrdUDs ;
   private boolean[] P09HR2_n4561HrePrdUDs ;
   private byte[] P09HR2_A4495HreNumCie ;
   private short[] P09HR2_A4545HreLinMaq ;
   private byte[] P09HR2_A4550HreLinPro ;
   private short[] P09HR2_A4557HreRecLin ;
   private GXSimpleCollection<String> AV21Options ;
   private GXSimpleCollection<String> AV24OptionsDesc ;
   private GXSimpleCollection<String> AV26OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class upq_cuentacorriente_detallerecetas_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09HR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV46Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_2_tfhreprduds_sel ,
                                          String AV45Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_1_tfhreprduds ,
                                          String A4561HrePrdUDs ,
                                          String A396EmprCod ,
                                          String AV35Emprcod ,
                                          int A4492HreBarCod ,
                                          int AV36HreBarCod ,
                                          byte A4493HreBarReo ,
                                          byte AV37HreBarReo ,
                                          String A4494HreBarPar ,
                                          String AV38HreBarPar ,
                                          String A719PrdNum ,
                                          String AV39HrePrdnum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[7];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, PrdNum, HrePrdUDs, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(HreBarCod = ?)");
      addWhere(sWhereString, "(HreBarReo = ?)");
      addWhere(sWhereString, "(HreBarPar = ?)");
      addWhere(sWhereString, "(PrdNum = ?)");
      if ( (GXutil.strcmp("", AV46Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_2_tfhreprduds_sel)==0) && ( ! (GXutil.strcmp("", AV45Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_1_tfhreprduds)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HrePrdUDs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV46Stocksquimicos_upq_cuentacorriente_detallerecetas_wcds_2_tfhreprduds_sel)==0) )
      {
         addWhere(sWhereString, "(HrePrdUDs = ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY HrePrdUDs" ;
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
                  return conditional_P09HR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09HR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((short[]) buf[11])[0] = rslt.getShort(10);
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
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 5);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 5);
               }
               return;
      }
   }

}

