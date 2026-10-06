package app.anticipacionerrores ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mant_defecto_dp extends GXProcedure
{
   public mant_defecto_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mant_defecto_dp.class ), "" );
   }

   public mant_defecto_dp( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.anticipacionerrores.SdtsdtMDef> executeUdp( String aP0 ,
                                                                           int aP1 ,
                                                                           String aP2 ,
                                                                           int aP3 ,
                                                                           GXSimpleCollection<String> aP4 ,
                                                                           String aP5 ,
                                                                           java.util.Date aP6 ,
                                                                           java.util.Date aP7 ,
                                                                           String aP8 ,
                                                                           String aP9 )
   {
      mant_defecto_dp.this.aP10 = new GXBaseCollection[] {new GXBaseCollection<app.anticipacionerrores.SdtsdtMDef>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
      return aP10[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        int aP3 ,
                        GXSimpleCollection<String> aP4 ,
                        String aP5 ,
                        java.util.Date aP6 ,
                        java.util.Date aP7 ,
                        String aP8 ,
                        String aP9 ,
                        GXBaseCollection<app.anticipacionerrores.SdtsdtMDef>[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             int aP3 ,
                             GXSimpleCollection<String> aP4 ,
                             String aP5 ,
                             java.util.Date aP6 ,
                             java.util.Date aP7 ,
                             String aP8 ,
                             String aP9 ,
                             GXBaseCollection<app.anticipacionerrores.SdtsdtMDef>[] aP10 )
   {
      mant_defecto_dp.this.AV7EmprCod = aP0;
      mant_defecto_dp.this.AV8CliCod = aP1;
      mant_defecto_dp.this.AV9ArtCod = aP2;
      mant_defecto_dp.this.AV10ForColNum = aP3;
      mant_defecto_dp.this.AV13TipMaqCodCollection = aP4;
      mant_defecto_dp.this.AV16MaqCod = aP5;
      mant_defecto_dp.this.AV11FechaInicio = aP6;
      mant_defecto_dp.this.AV12FechaFin = aP7;
      mant_defecto_dp.this.AV14MTknUsu = aP8;
      mant_defecto_dp.this.AV15MTkn = aP9;
      mant_defecto_dp.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A14600MDefTipMCo ,
                                           AV13TipMaqCodCollection ,
                                           AV9ArtCod ,
                                           Integer.valueOf(AV10ForColNum) ,
                                           AV16MaqCod ,
                                           Integer.valueOf(AV13TipMaqCodCollection.size()) ,
                                           A14598MDefArtCod ,
                                           Integer.valueOf(A14599MDefColNum) ,
                                           A14601MDefMaqCod ,
                                           A14624MDefEmprCo ,
                                           AV7EmprCod ,
                                           AV15MTkn ,
                                           AV14MTknUsu ,
                                           Integer.valueOf(AV8CliCod) ,
                                           A14595MDefTkn ,
                                           A14596MDefUsu ,
                                           Integer.valueOf(A14597MDefCliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      /* Using cursor P004Z2 */
      pr_default.execute(0, new Object[] {AV15MTkn, AV14MTknUsu, Integer.valueOf(AV8CliCod), AV7EmprCod, AV9ArtCod, Integer.valueOf(AV10ForColNum), AV16MaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14600MDefTipMCo = P004Z2_A14600MDefTipMCo[0] ;
         A14601MDefMaqCod = P004Z2_A14601MDefMaqCod[0] ;
         A14599MDefColNum = P004Z2_A14599MDefColNum[0] ;
         A14598MDefArtCod = P004Z2_A14598MDefArtCod[0] ;
         A14597MDefCliCod = P004Z2_A14597MDefCliCod[0] ;
         A14624MDefEmprCo = P004Z2_A14624MDefEmprCo[0] ;
         A14595MDefTkn = P004Z2_A14595MDefTkn[0] ;
         A14596MDefUsu = P004Z2_A14596MDefUsu[0] ;
         A14594MDefId = P004Z2_A14594MDefId[0] ;
         A14625MDefCliNom = P004Z2_A14625MDefCliNom[0] ;
         A14626MDefArtDsc = P004Z2_A14626MDefArtDsc[0] ;
         A14627MDefColCod = P004Z2_A14627MDefColCod[0] ;
         A14628MDefColNom = P004Z2_A14628MDefColNom[0] ;
         A14629MDefMaqDsc = P004Z2_A14629MDefMaqDsc[0] ;
         A14630MDefTipMDs = P004Z2_A14630MDefTipMDs[0] ;
         A14602MDefDefCod = P004Z2_A14602MDefDefCod[0] ;
         A14631MDefDefDsc = P004Z2_A14631MDefDefDsc[0] ;
         A14632MDefCatCod = P004Z2_A14632MDefCatCod[0] ;
         A14633MDefCatDsc = P004Z2_A14633MDefCatDsc[0] ;
         A14634MDefKilTot = P004Z2_A14634MDefKilTot[0] ;
         A14635MDefKilPro = P004Z2_A14635MDefKilPro[0] ;
         A14636MDefKilReo = P004Z2_A14636MDefKilReo[0] ;
         A14638MDefMetTot = P004Z2_A14638MDefMetTot[0] ;
         n14638MDefMetTot = P004Z2_n14638MDefMetTot[0] ;
         A14639MDefMetPro = P004Z2_A14639MDefMetPro[0] ;
         n14639MDefMetPro = P004Z2_n14639MDefMetPro[0] ;
         A14640MDefMetReo = P004Z2_A14640MDefMetReo[0] ;
         n14640MDefMetReo = P004Z2_n14640MDefMetReo[0] ;
         Gxm1sdtmdef = (app.anticipacionerrores.SdtsdtMDef)new app.anticipacionerrores.SdtsdtMDef(remoteHandle, context);
         Gxm2rootcol.add(Gxm1sdtmdef, 0);
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefid( A14594MDefId );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefemprcod( A14624MDefEmprCo );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefclicod( A14597MDefCliCod );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefclinom( GXutil.trim( A14625MDefCliNom) );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefartcod( A14598MDefArtCod );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefartdsc( GXutil.trim( A14626MDefArtDsc) );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefcolnum( A14599MDefColNum );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefcolcod( A14627MDefColCod );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefcolnom( GXutil.trim( A14628MDefColNom) );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefmaqcod( A14601MDefMaqCod );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefmaqdsc( GXutil.trim( A14629MDefMaqDsc) );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdeftipmco( A14600MDefTipMCo );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdeftipmds( A14630MDefTipMDs );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefdefcod( A14602MDefDefCod );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefdefdsc( GXutil.trim( A14631MDefDefDsc) );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefcatcod( A14632MDefCatCod );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefcatdsc( GXutil.trim( A14633MDefCatDsc) );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefkiltot( A14634MDefKilTot );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefkilpro( A14635MDefKilPro );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefkilreo( A14636MDefKilReo );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefporc( ((A14635MDefKilPro.doubleValue()>0) ? (A14636MDefKilReo.divide(A14635MDefKilPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefmettot( A14638MDefMetTot );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefmetpro( A14639MDefMetPro );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefmetreo( A14640MDefMetReo );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefmetpor( ((A14639MDefMetPro.doubleValue()>0) ? (A14640MDefMetReo.divide(A14639MDefMetPro, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdefusu( A14596MDefUsu );
         Gxm1sdtmdef.setgxTv_SdtsdtMDef_Mdeftkn( A14595MDefTkn );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP10[0] = mant_defecto_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.anticipacionerrores.SdtsdtMDef>(app.anticipacionerrores.SdtsdtMDef.class, "sdtMDef", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A14600MDefTipMCo = "" ;
      A14598MDefArtCod = "" ;
      A14601MDefMaqCod = "" ;
      A14624MDefEmprCo = "" ;
      A14595MDefTkn = "" ;
      A14596MDefUsu = "" ;
      P004Z2_A14600MDefTipMCo = new String[] {""} ;
      P004Z2_A14601MDefMaqCod = new String[] {""} ;
      P004Z2_A14599MDefColNum = new int[1] ;
      P004Z2_A14598MDefArtCod = new String[] {""} ;
      P004Z2_A14597MDefCliCod = new int[1] ;
      P004Z2_A14624MDefEmprCo = new String[] {""} ;
      P004Z2_A14595MDefTkn = new String[] {""} ;
      P004Z2_A14596MDefUsu = new String[] {""} ;
      P004Z2_A14594MDefId = new long[1] ;
      P004Z2_A14625MDefCliNom = new String[] {""} ;
      P004Z2_A14626MDefArtDsc = new String[] {""} ;
      P004Z2_A14627MDefColCod = new byte[1] ;
      P004Z2_A14628MDefColNom = new String[] {""} ;
      P004Z2_A14629MDefMaqDsc = new String[] {""} ;
      P004Z2_A14630MDefTipMDs = new String[] {""} ;
      P004Z2_A14602MDefDefCod = new short[1] ;
      P004Z2_A14631MDefDefDsc = new String[] {""} ;
      P004Z2_A14632MDefCatCod = new short[1] ;
      P004Z2_A14633MDefCatDsc = new String[] {""} ;
      P004Z2_A14634MDefKilTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004Z2_A14635MDefKilPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004Z2_A14636MDefKilReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004Z2_A14638MDefMetTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004Z2_n14638MDefMetTot = new boolean[] {false} ;
      P004Z2_A14639MDefMetPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004Z2_n14639MDefMetPro = new boolean[] {false} ;
      P004Z2_A14640MDefMetReo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P004Z2_n14640MDefMetReo = new boolean[] {false} ;
      A14625MDefCliNom = "" ;
      A14626MDefArtDsc = "" ;
      A14628MDefColNom = "" ;
      A14629MDefMaqDsc = "" ;
      A14630MDefTipMDs = "" ;
      A14631MDefDefDsc = "" ;
      A14633MDefCatDsc = "" ;
      A14634MDefKilTot = DecimalUtil.ZERO ;
      A14635MDefKilPro = DecimalUtil.ZERO ;
      A14636MDefKilReo = DecimalUtil.ZERO ;
      A14638MDefMetTot = DecimalUtil.ZERO ;
      A14639MDefMetPro = DecimalUtil.ZERO ;
      A14640MDefMetReo = DecimalUtil.ZERO ;
      Gxm1sdtmdef = new app.anticipacionerrores.SdtsdtMDef(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.anticipacionerrores.mant_defecto_dp__default(),
         new Object[] {
             new Object[] {
            P004Z2_A14600MDefTipMCo, P004Z2_A14601MDefMaqCod, P004Z2_A14599MDefColNum, P004Z2_A14598MDefArtCod, P004Z2_A14597MDefCliCod, P004Z2_A14624MDefEmprCo, P004Z2_A14595MDefTkn, P004Z2_A14596MDefUsu, P004Z2_A14594MDefId, P004Z2_A14625MDefCliNom,
            P004Z2_A14626MDefArtDsc, P004Z2_A14627MDefColCod, P004Z2_A14628MDefColNom, P004Z2_A14629MDefMaqDsc, P004Z2_A14630MDefTipMDs, P004Z2_A14602MDefDefCod, P004Z2_A14631MDefDefDsc, P004Z2_A14632MDefCatCod, P004Z2_A14633MDefCatDsc, P004Z2_A14634MDefKilTot,
            P004Z2_A14635MDefKilPro, P004Z2_A14636MDefKilReo, P004Z2_A14638MDefMetTot, P004Z2_n14638MDefMetTot, P004Z2_A14639MDefMetPro, P004Z2_n14639MDefMetPro, P004Z2_A14640MDefMetReo, P004Z2_n14640MDefMetReo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A14627MDefColCod ;
   private short A14602MDefDefCod ;
   private short A14632MDefCatCod ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int AV10ForColNum ;
   private int AV13TipMaqCodCollection_size ;
   private int A14599MDefColNum ;
   private int A14597MDefCliCod ;
   private long A14594MDefId ;
   private java.math.BigDecimal A14634MDefKilTot ;
   private java.math.BigDecimal A14635MDefKilPro ;
   private java.math.BigDecimal A14636MDefKilReo ;
   private java.math.BigDecimal A14638MDefMetTot ;
   private java.math.BigDecimal A14639MDefMetPro ;
   private java.math.BigDecimal A14640MDefMetReo ;
   private String AV7EmprCod ;
   private String AV9ArtCod ;
   private String AV16MaqCod ;
   private String AV14MTknUsu ;
   private String scmdbuf ;
   private String A14600MDefTipMCo ;
   private String A14598MDefArtCod ;
   private String A14601MDefMaqCod ;
   private String A14624MDefEmprCo ;
   private String A14596MDefUsu ;
   private String A14628MDefColNom ;
   private java.util.Date AV11FechaInicio ;
   private java.util.Date AV12FechaFin ;
   private boolean n14638MDefMetTot ;
   private boolean n14639MDefMetPro ;
   private boolean n14640MDefMetReo ;
   private String AV15MTkn ;
   private String A14595MDefTkn ;
   private String A14625MDefCliNom ;
   private String A14626MDefArtDsc ;
   private String A14629MDefMaqDsc ;
   private String A14630MDefTipMDs ;
   private String A14631MDefDefDsc ;
   private String A14633MDefCatDsc ;
   private GXBaseCollection<app.anticipacionerrores.SdtsdtMDef>[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P004Z2_A14600MDefTipMCo ;
   private String[] P004Z2_A14601MDefMaqCod ;
   private int[] P004Z2_A14599MDefColNum ;
   private String[] P004Z2_A14598MDefArtCod ;
   private int[] P004Z2_A14597MDefCliCod ;
   private String[] P004Z2_A14624MDefEmprCo ;
   private String[] P004Z2_A14595MDefTkn ;
   private String[] P004Z2_A14596MDefUsu ;
   private long[] P004Z2_A14594MDefId ;
   private String[] P004Z2_A14625MDefCliNom ;
   private String[] P004Z2_A14626MDefArtDsc ;
   private byte[] P004Z2_A14627MDefColCod ;
   private String[] P004Z2_A14628MDefColNom ;
   private String[] P004Z2_A14629MDefMaqDsc ;
   private String[] P004Z2_A14630MDefTipMDs ;
   private short[] P004Z2_A14602MDefDefCod ;
   private String[] P004Z2_A14631MDefDefDsc ;
   private short[] P004Z2_A14632MDefCatCod ;
   private String[] P004Z2_A14633MDefCatDsc ;
   private java.math.BigDecimal[] P004Z2_A14634MDefKilTot ;
   private java.math.BigDecimal[] P004Z2_A14635MDefKilPro ;
   private java.math.BigDecimal[] P004Z2_A14636MDefKilReo ;
   private java.math.BigDecimal[] P004Z2_A14638MDefMetTot ;
   private boolean[] P004Z2_n14638MDefMetTot ;
   private java.math.BigDecimal[] P004Z2_A14639MDefMetPro ;
   private boolean[] P004Z2_n14639MDefMetPro ;
   private java.math.BigDecimal[] P004Z2_A14640MDefMetReo ;
   private boolean[] P004Z2_n14640MDefMetReo ;
   private GXSimpleCollection<String> AV13TipMaqCodCollection ;
   private GXBaseCollection<app.anticipacionerrores.SdtsdtMDef> Gxm2rootcol ;
   private app.anticipacionerrores.SdtsdtMDef Gxm1sdtmdef ;
}

final  class mant_defecto_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P004Z2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A14600MDefTipMCo ,
                                          GXSimpleCollection<String> AV13TipMaqCodCollection ,
                                          String AV9ArtCod ,
                                          int AV10ForColNum ,
                                          String AV16MaqCod ,
                                          int AV13TipMaqCodCollection_size ,
                                          String A14598MDefArtCod ,
                                          int A14599MDefColNum ,
                                          String A14601MDefMaqCod ,
                                          String A14624MDefEmprCo ,
                                          String AV7EmprCod ,
                                          String AV15MTkn ,
                                          String AV14MTknUsu ,
                                          int AV8CliCod ,
                                          String A14595MDefTkn ,
                                          String A14596MDefUsu ,
                                          int A14597MDefCliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[7];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT MDefTipMCo, MDefMaqCod, MDefColNum, MDefArtCod, MDefCliCod, MDefEmprCo, MDefTkn, MDefUsu, MDefId, MDefCliNom, MDefArtDsc, MDefColCod, MDefColNom, MDefMaqDsc," ;
      scmdbuf += " MDefTipMDs, MDefDefCod, MDefDefDsc, MDefCatCod, MDefCatDsc, MDefKilTot, MDefKilPro, MDefKilReo, MDefMetTot, MDefMetPro, MDefMetReo FROM MDef" ;
      addWhere(sWhereString, "(MDefTkn = ? and MDefUsu = ? and MDefCliCod = ?)");
      addWhere(sWhereString, "(MDefEmprCo = ?)");
      if ( ! (GXutil.strcmp("", AV9ArtCod)==0) )
      {
         addWhere(sWhereString, "(MDefArtCod = ?)");
      }
      else
      {
         GXv_int1[4] = (byte)(1) ;
      }
      if ( ! (0==AV10ForColNum) )
      {
         addWhere(sWhereString, "(MDefColNum = ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16MaqCod)==0) )
      {
         addWhere(sWhereString, "(MDefMaqCod = ?)");
      }
      else
      {
         GXv_int1[6] = (byte)(1) ;
      }
      if ( AV13TipMaqCodCollection_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV13TipMaqCodCollection, "MDefTipMCo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY MDefTkn, MDefUsu, MDefCliCod" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
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
                  return conditional_P004Z2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004Z2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               ((String[]) buf[9])[0] = rslt.getVarchar(10);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((String[]) buf[14])[0] = rslt.getVarchar(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getVarchar(17);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((String[]) buf[18])[0] = rslt.getVarchar(19);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[7], 256);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               return;
      }
   }

}

